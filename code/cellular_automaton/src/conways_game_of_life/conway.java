import java.awt.*;
import java.awt.event.*;

import javax.swing.*;

public class Conway extends JFrame {

	private int size = 80;
	private int gen =0;
	private int kill = 1;
	private JButton grid[][] = new JButton[size][size], toggle, wow, gun, clear;
	private JButton exit; // for termination of the program
	private int gridNum[][] = new int[size][size];
	private JLabel status;
	Conway() {
		Container cp = this.getContentPane();
		JPanel gd = new JPanel(new GridLayout(size, size));
		for (int i = 0;i<size;i++)
			for (int j = 0;j<size;j++) {
				grid[i][j] = new JButton();
				grid[i][j].setBackground(Color.WHITE);
				gd.add(grid[i][j]);
				grid[i][j].addActionListener(new Listen());				
				grid[i][j].setBorder(null);
			}

		JPanel stBar = new JPanel(new FlowLayout(FlowLayout.CENTER, 10, 10));
		status = new JLabel("Status");
		toggle = new JButton("Start");
		wow = new JButton("Benchmark");
		gun = new JButton("Glider Gun");
		clear = new JButton("Clear");
		exit = new JButton("Exit");

		stBar.add(status);
		stBar.add(toggle);
		stBar.add(wow);
		stBar.add(gun);
		stBar.add(clear);
		stBar.add(exit);
		toggle.addActionListener(new Listen());
		wow.addActionListener(new Listen());
		gun.addActionListener(new Listen());
		clear.addActionListener(new Listen());
		exit.addActionListener(new Listen());

		cp.setLayout(new BorderLayout());
		cp.add(gd, BorderLayout.CENTER);
		cp.add(stBar, BorderLayout.SOUTH);

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("Game of Life!");
		setLocationRelativeTo(null);
		setSize(600, 600);
		setVisible(true);
		try {
			UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
		}
		catch (Exception e) {}
	}


//A function that returns Live neighbours...
//---------------------------------LOGIC-------------------------

		public int neigh(int x, int y) {
			int ctr = 0;
			int startPosX = (x - 1 < 0) ? x : x-1;
			int startPosY = (y - 1 < 0) ? y : y-1;
			int endPosX = (x + 1 > size-1) ? x : x+1;
			int endPosY = (y + 1 > size-1) ? y : y+1;
			for (int i = startPosX; i<=endPosX; i++)
				for (int j = startPosY; j<=endPosY; j++)
					if (gridNum[i][j] == 1)
						ctr++;
			return ctr;
		}
//-------------------------------LOGIC ENDS---------------------

	public void setGrid() {
		for (int i=0;i<size;i++) 
			for (int j = 0;j<size;j++) 
				if (gridNum[i][j] == 1)
					grid[i][j].setBackground(Color.BLACK);
				else
					grid[i][j].setBackground(Color.WHITE);
	}
	
	public void loop() {
		int tmp = 0;
		int tmpGrid[][] = new int[size][size];
		for (int i=0;i<size;i++) 
			for (int j = 0;j<size;j++) {
				tmp = neigh(i, j);
				tmp = (gridNum[i][j] == 1) ? tmp-1 : tmp;
				if (tmp < 2 || tmp > 3)
						tmpGrid[i][j] = 0;
				else if(tmp == 3)
						tmpGrid[i][j] = 1;
				else
						tmpGrid[i][j] = gridNum[i][j];
			}
			gridNum = tmpGrid;
			setGrid();
		}
//----------------------------------------------------------------------------------------------------------------------------------
	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Jobs());
	}

	public static class Jobs implements Runnable {
		public  void run() {
			new Conway();
		}
	}
//-----------------------------------------------------------------------------------------------------------------------------------
	public class Seed extends Thread {
		@Override
		public void run() {
			for (int i =0;i<10000;i++){
				if (kill == 1) break;
				loop();
				status.setText("Generation: "+(gen++));
				try {
					Thread.sleep(100);
				}
				catch(InterruptedException e) {
					System.out.println("Interrupted! " + e);
					Thread.currentThread().interrupt();
				}
			}
		}
	}
	public class Listen implements ActionListener {
		public void actionPerformed(ActionEvent ae) {
			if (ae.getSource() == toggle){
				if (kill == 0) {
					toggle.setText("Start");
					kill = 1;
				}
				else {
					toggle.setText("Stop");
					kill = 0;
					Seed t = new Seed();
					t.start();
				}
			}
			else if (ae.getSource() == wow) {
				for (int i = 0;i<size;i++) {
					grid[size/2][i].setBackground(Color.BLACK);
					gridNum[size/2][i] = 1;
					}
				}
			else if (ae.getSource() == gun) {
				int iFill[] = {4, 4, 5, 5, 2, 2, 3, 4, 5, 6, 7, 8, 8, 5, 3, 4, 5, 6, 5, 2, 3, 4 , 2, 3, 4, 1, 5, 0, 1, 5, 6, 2, 2, 3, 3,7};
				int jFill[] = {0,1,0,1,12,13,11,10,10,10,11,12,13,14,15,16,16,16,17,20,20,20,21,21,21,22,22,24,24,24,24,34,35,34,35, 15};
				int shift = 4;
				for (int i = 0;i<36;i++){
							gridNum[iFill[i]+shift][jFill[i]+shift] = 1;
							grid[iFill[i]][jFill[i]].setBackground(Color.BLACK);
						}
			}
			else if (ae.getSource() == clear) {
				for (int i = 0;i<size;i++)
					for(int j=0;j<size;j++) {
						gridNum[i][j] = 0;
						grid[i][j].setBackground(Color.GRAY);
						}
			}
			else if (ae.getSource() == exit) {
				System.exit(0);
			}
			else {
				for (int i = 0;i<size;i++)
					for(int j=0;j<size;j++) {
						if (ae.getSource() == grid[i][j]) {
							if (gridNum[i][j] == 0) {
								gridNum[i][j] = 1;
								grid[i][j].setBackground(Color.BLACK);
								return;
							} else if (gridNum[i][j] == 1) {
								gridNum[i][j] = 0;
								grid[i][j].setBackground(Color.WHITE);
								return;
							}
							
						}
					}
			}
		}
	}
}
