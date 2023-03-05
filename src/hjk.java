import javax.imageio.stream.ImageInputStream;

public class hjk {
    private String empName;
    private int empage;

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public String getEmpName() {
        return empName;
    }

    public int getEmpage() {
        return empage;
    }

    public void setEmpage(int empage) {
        this.empage = empage;
    }

    public static void main(String[] args) {
        hjk m=new hjk();
        m.setEmpName("john");
        m.getEmpName();
        m.setEmpage(78);
        m.getEmpage();
    }
}

