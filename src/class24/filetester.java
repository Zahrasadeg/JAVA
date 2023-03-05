package class24;

public class filetester {
    public static void main(String[] args) {


        file[] files = {new javafile(1024), new pdffile(35), new wordfile(50)};
        for (file FAIL : files) {
            FAIL.open();
            FAIL.edit();
            FAIL.close();

        }
    }
}
