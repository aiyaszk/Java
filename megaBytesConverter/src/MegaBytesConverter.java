public class MegaBytesConverter {
    public static void printMegaBytesAndKiloBytes (int kiloBytes) {
        if (kiloBytes<0) {
            System.out.println("Invalid Value");
        }
        else {
            int remaining = kiloBytes % 1024;
            int megabyte = (kiloBytes-remaining) / 1024;
            System.out.println(kiloBytes + " KB = " + megabyte + " MB and " + remaining + " KB");
        }
    }
}
