public class PwCheckerTest {
    public static void main(String[] args) {
        //UsabilityTest();
        PerformanceTest();
    }

    private static void UsabilityTest() {
        String password = "Pas8W61348DŁ&2sdjeSLdifdfs";
        System.out.println("Evaluation:");
        System.out.println(Password.checkPassword(password));
    }

    private static void PerformanceTest() {
        String password = "Pleff lorem monaq morel plaff lerom baple merol pliff ipsum ponaq mipsu ploff pimsu caple supim pluff sumip qonaq issum daple ussum ronaq ossom fap25 abcde tonaq fghij gaple klmno vonaq pqrst haple uvwxy nonaq zzzz. Laple pleff lorem monaq morel plaff sumip qonaq issum daple ussum ponaq gaple klm50 lorem monaq morel plaff lerom baple merol pliff ipsum ponaq mipsu ploff pimsu caple supim pluff sumip qonaq issum daple ussum ronaq ossom faple abc75 tonaq fghij gaple klmno vonaq pqrst haple uvwxy nonaq zzzzz laple pleff lorem monaq morel plaff sumip qonaq issum daple ussum ponaq gapl.\n" +
                "\n" +
                "Klmno pm100 pleff lorem monaq morel plaff lerom baple merol pliff ipsum ponaq mipsu ploff pimsu caple supim pluff sumip qonaq issum daple ussum ronaq ossom fa125 abcde tonaq fghij gaple klmno vonaq pqrst haple uvwxy nonaq zzzzz laple pleff lorem monaq morel plaff sumip qonaq issum daple ussum ponaq gaple km150 lorem monaq morel plaff lerom baple merol pliff ipsum ponaq mipsu ploff pimsu caple supim pluff sumi.\n" +
                "\n" +
                "Qonaq issum daple ussum ronaq ossom faple ab175 tonaq fghij gaple klmno vonaq pqrst haple uvwxy nonaq zzzzz laple pleff lorem monaq morel plaff sumip qonaq issum daple ussum ponaq gaple klmno pm200 pleff lorem monaq morel plaff lerom baple merol pliff ipsum ponaq mipsu ploff pimsu caple supim pluff sumip qonaq issum daple ussum ronaq ossom fa225 abcde tonaq fghij gaple klmno vonaq pqrst haple uvwxy nonaq zzzzz laple pleff lorem monaq morel plaff sumip qonaq issum daple ussum ponaq gaple km250 lorem monaq morel plaff lerom baple merol plif.\n" +
                "\n" +
                "Ipsum ponaq mipsu ploff pimsu caple supim pluff sumip qonaq issum daple ussum ronaq ossom faple ab275 tonaq fghij gaple klmno vonaq pqrst haple uvwxy nonaq zzzzz laple pleff lorem monaq morel plaff sumip qonaq issum daple ussum ponaq gaple klmno pm300 pleff lorem monaq morel plaff lerom baple merol pliff ipsum ponaq mipsu ploff pimsu caple supim pluff sumip qonaq issum daple ussum ronaq ossom fa325 abcde tonaq fghij gaple klmno vonaq pqrst haple uvwxy nonaq zzzzz laple pleff lorem monaq morel plaff sumip qonaq issum daple ussum ponaq gaple km350 lorem monaq morel plaff lerom baple merol pliff ipsum ponaq mipsu ploff pimsu caple supim pluff sumip qonaq issum daple ussum ronaq ossom faple ab375 tonaq fghi?\n" +
                "\n" +
                "gare klmno vonaq pqrst haple uvwxy nonaq zzzzz laple pleff lorem monaq morel plaff sumip qonaq issum daple ussum ponaq gaple klmno pm400 pleff lorem monaq morel plaff lerom baple merol pliff ipsum ponaq mipsu ploff pimsu caple supim pluff sumip qonaq issum daple us;um ronaq ossom fa425 abcde tonaq fghij gaple klmno vonaq pqrst haple uvwxy nonaq zzzzz laple pleff lorem monaq morel plaff sumip qonaq issum daple ussum ponaq gaple km450 lorem monaq morel plaff lerom baple merol pliff ipsum pona.\n" +
                "\n" +
                "Mipsu ploff pimsu caple supim pluff sumip qonaq issum daple ussum ronaq ossom faple ab475 tonaq fghij gaple klmno vonaq pqrst haple uvwxy nonaq zzzzz laple pleff lorem monaq morel plaff sumip qonaq issum daple ussum ponaq gaple klmno pm500 pleff lorem monaq morel plaff lerom baple merol pliff ipsum ponaq mipsu ploff pimsu caple supim pluff sumip qonaq issum daple ussum ronaq ossom fa525 abcde tonaq fghij gaple klmno vonaq pqrst haple uvwxy nonaq zzzzz laple pleff lorem monaq morel plaff sumip qonaq issum daple ussum pona?\n" +
                "\n" +
                "Gaple km550 lorem monaq morel plaff lerom baple merol pliff ipsum ponaq mipsu ploff pimsu caple supim pluff sumip qonaq issum daple ussum ronaq ossom faple ab575 tonaq fghij gaple klmno vonaq pqrst haple uvwxy nonaq zzzzz laple pleff lorem monaq morel plaff sumip qonaq issum daple ussum p.Naq gaple klmno pm600 pleff lorem monaq morel plaff lerom baple merol pliff ipsum ponaq mipsu ploff pimsu caple supim pluff sumip qonaq issum daple ussum ronaq ossom fa625 abcde tonaq fghij gaple klmno vonaq pqrst haple uvwxy nonaq zzzzz laple pleff lorem monaq morel plaff sumip qonaq issum daple ussum ponaq gaple km650 tonaq sumip qonaq issum daple ussum daple ussum ipsum ponaq mipsu ploff pimsu caple supim pluff sumip qonaq issum daple ussum ronaq ossom faple ab675 tonaq fghij gaple klmno vonaq pqrst haple uvwxy nonaq zzzzz laple pleff lorem monaq morel plaff sumip qon?\n" +
                "\n" +
                "Qissum daple ussum ponaq gaple klmno pm700 pleff lorem monaq morel plaff lerom baple merol pliff ipsum ponaq mipsu ploff pimsu caple supim pluff sumip qonaq issum daple ussum ronaq ossom fa725 abcde tonaq fghij gaple klmno vonaq pqSt.\n" +
                "\n" +
                "Haple uvwxy nonaq zzzzz laple pleff lorem monaq morel plaff sumip qonaq issum daple ussum ponaq gaple km750 lorem monaq morel plaff lerom baple merol pliff ipsum ponaq mipsu ploff pimsu caple supim pluff sumip qonaq issum daple ussum ronaq ossom faple ab775 tonaq fghij gaple klmno vonaq pqrst haple uvwxy nonaq zzzzz laple pleff lorem monaq morel plaff sumip qonaq issum daple ussum ponaq gaple klmno pm800 pleff lorem monaq morel plaff lerom baple merol pliff ipsum ponaq mipsu ploff pimsu caple supim pluff sumip qonaq issum daple ussum ronaq ossom fa825 lerom baple merol pliff ipsum ponaq pqrst haple uvwxy nonaq zzzzz laple pleff lorem monaq morel plaf.\n" +
                "\n" +
                "Sumip qonaq issum daple ussum ponaq gaple km850 lorem monaq morel plaff lerom baple merol pliff ipsum ponaq mipsu ploff pimsu caple supim pluff sumip qonaq issum daple ussum ronaq ossom faple ab875 tonaq fghij gaple klmno vonaq pqrst haple uvwxy nonaq z.Z.z laple pleff lorem monaq morel plaff sumip qonaq issum daple ussum ponaq gaple klmno pm900 pleff lorem monaq morel plaff lerom baple merol pliff ipsum ponaq mipsu ploff pimsu caple supim pluff sumip qonaq issum daple ussum ronaq ossom fa925 abcde tonaq fghij gaple klmno vonaq pqrst haple uvwxy nonaq zzzzz laple pleff lorem monaq morel plaff sumip qonaq issum daple ussum ponaq gaple km950 lorem monaq morel plaff lerom baple merol pliff ipsum ponaq mipsu ploff pimsu caple supim pluff sumip qonaq issum dapl. Ussum ronaq ossom faple ab975 tonaq fghij gaple klmno vonaq pqrst haple uvwxy nonaq zzzzz laple pleff lorem monaq morel plaff sumip qonaq issum daple ussum ponaq gaple klmno p1000";
        for(int i = 0; i < 17; i++) {
            long timeBeforeTest = System.currentTimeMillis();
            long beforeUsedMem=Runtime.getRuntime().totalMemory()-Runtime.getRuntime().freeMemory();
            System.out.println(Password.checkPassword(password));
            long timeAfterTest = System.currentTimeMillis();
            long afterUsedMem=Runtime.getRuntime().totalMemory()-Runtime.getRuntime().freeMemory();
            long actualMemUsed=afterUsedMem-beforeUsedMem;
            long actualTime = timeAfterTest-timeBeforeTest;
            System.out.println("Használt memória: " + actualMemUsed + "\nHasznált idő: " + actualTime + "\nString hossz: " + password.length());
            password += password;
        }
    }
}
