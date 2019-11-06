public class school {
    private String schoolName;
    private String type;
    private int classSize;

    public school(String schoolName, String type, int classSize) {
        this.schoolName = schoolName;
        this.type = type;
        this.classSize = classSize;
    }

    public String getSchoolName() {
        return schoolName;
    }

    public void setSchoolName(String schoolName) {
        this.schoolName = schoolName;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getClassSize() {
        return classSize;
    }

    public void setClassSize(int classSize) {
        this.classSize = classSize;
    }

    public school() {
        this.schoolName = "N/A";
        this.type = "N/A";
        this.classSize = 0;
    }
}
