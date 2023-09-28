package ProjectAsset;

public class Job {
    public String Position;
    public String EmpID;

    public Job(String Position, String EmpID) {
        this.Position = Position;
        this.EmpID = EmpID;
    }

    public String getPosition() {
        return this.Position;
    }

    public void setPosition(String Position) {
        this.Position = Position;
    }

    public String getEmpID() {
        return this.EmpID;
    }

    public void setEmpID(String EmpID) {
        this.EmpID = EmpID;
    }
}
