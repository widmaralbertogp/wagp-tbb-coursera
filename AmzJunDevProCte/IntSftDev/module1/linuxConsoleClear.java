public class clearConsole {
	public static void main(String[] args) {
    try {
        String os = System.getProperty("os.name").toLowerCase();
        if (os.contains("win")) {
            ProcessBuilder pb = new ProcessBuilder("cmd", "/c", "cls");
            pb.inheritIO().start().waitFor();
        } else {
            ProcessBuilder pb = new ProcessBuilder("clear");
            pb.inheritIO().start().waitFor();
        }
    } catch (Exception e) {
        e.printStackTrace();
    }
}
}
