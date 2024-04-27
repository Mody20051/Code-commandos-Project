
package Resources;
import java .util.Date;
public class Department {

    private String DENAME;
    private int DENUMBER;
    private  Date  MGSTATDATE;


    public Department() {
    }

    public Department(String DENAME, int DENUMBER, Date MGSTATDATE) {
        this.DENAME = DENAME;
        this.DENUMBER = DENUMBER;
        this.MGSTATDATE = MGSTATDATE;
    }

    public String getDENAME() {
        return DENAME;
    }

    public void setDENAME(String DENAME) {
        this.DENAME = DENAME;
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
        this.MGSTATDATE = MGSTATDATE;
    }
}
