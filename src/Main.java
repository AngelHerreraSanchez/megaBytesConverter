public class Main {
    public static void main(String[] args) {
        int kilobytes = printMegaBytesAndKiloBytes(5000);

    }

    public static int printMegaBytesAndKiloBytes(int kiloBytes) {
        if (kiloBytes >= 0) {
            int megaBytes = kiloBytes / 1024;
            int kb = kiloBytes % 1024;
            System.out.println(kiloBytes + " KB= " + megaBytes + " MB and " + kb + " KB");
        } else {
            System.out.println("Invalid Value");
        }

        return kiloBytes;
    }


}
