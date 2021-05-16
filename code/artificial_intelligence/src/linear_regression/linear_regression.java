// author @Yatharth Shah

public class LinearRegression { 

    public static void main(String[] args) { 
        int maxn = 1000;
        int n = 0;
        double[] x = new double[maxn];
        double[] y = new double[maxn];

        // first pass: read in data, compute xbar and ybar
        double sumx = 0.0;
        double sumy = 0.0;
        double sumx2 = 0.0;
        while(!StdIn.isEmpty()) {
            x[n] = StdIn.readDouble();
            y[n] = StdIn.readDouble();
            sumx  += x[n];
            sumx2 += x[n] * x[n];
            sumy  += y[n];
            n++;
        }
        double xbar = sumx / n;
        double ybar = sumy / n;

        // second pass: compute summary statistics
        double xxbar = 0.0;
        double yybar = 0.0;
        double xybar = 0.0;
        for (int i = 0; i < n; i++) {
            xxbar += (x[i] - xbar) * (x[i] - xbar);
            yybar += (y[i] - ybar) * (y[i] - ybar);
            xybar += (x[i] - xbar) * (y[i] - ybar);
        }
        double beta1 = xybar / xxbar;
        double beta0 = ybar - beta1 * xbar;

        // print results
        StdOut.println("y   = " + beta1 + " * x + " + beta0);

        // analyze results
        int df = n - 2;
        double rss = 0.0;      // residual sum of squares
        double ssr = 0.0;      // regression sum of squares
        for (int i = 0; i < n; i++) {
            double fit = beta1*x[i] + beta0;
            rss += (fit - y[i]) * (fit - y[i]);
            ssr += (fit - ybar) * (fit - ybar);
        }
        double R2    = ssr / yybar;
        double svar  = rss / df;
        double svar1 = svar / xxbar;
        double svar0 = svar/n + xbar*xbar*svar1;
        StdOut.println("R^2                 = " + R2);
        StdOut.println("std error of beta_1 = " + Math.sqrt(svar1));
        StdOut.println("std error of beta_0 = " + Math.sqrt(svar0));
        svar0 = svar * sumx2 / (n * xxbar);
        StdOut.println("std error of beta_0 = " + Math.sqrt(svar0));

        StdOut.println("SSTO = " + yybar);
        StdOut.println("SSE  = " + rss);
        StdOut.println("SSR  = " + ssr);
    }
}
