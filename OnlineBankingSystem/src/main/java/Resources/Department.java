
package Resources;
import java .util.Date;
public class Department{
    private String DENAME;
    private int DENUMBER;
    private  Date  MGSTATDATE;
    Manger manger;

    public Department(Manger manger,String DENAME, int DENUMBER, Date MGSTATDATE) {
        this.DENAME = DENAME;
        this.DENUMBER = DENUMBER;
        this.MGSTATDATE = MGSTATDATE;
        this.manger=manger;
    }

    public String getDENAME() {
        return DENAME;
    }

    public void setDENAME(String DENAME) {
        try {
            this.DENAME = DENAME;
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public int getDENUMBER() {
        return DENUMBER;
    }

    public void setDENUMBER(int DENUMBER) {
        if (DENUMBER < 0) {
            throw new IllegalArgumentException("Department Number cannot be negative.");
        }
        this.DENUMBER = DENUMBER;
    }

    public Date getMGSTATDATE() {
        return MGSTATDATE;
    }

    public void setMGSTATDATE(Date MGSTATDATE) {
        try {
            this.MGSTATDATE = MGSTATDATE;
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public String toString() {
        return "Department{" +
                "DENAME='" + DENAME + '\'' +
                ", DENUMBER=" + DENUMBER +
                ", MGSTATDATE=" + MGSTATDATE +
                ", manger=" + manger +
                '}';
    }
}
