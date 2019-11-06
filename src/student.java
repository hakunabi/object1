public class student {
    private String name;
    private int grade;
    private double savings;

    public student(String name, int grade, double savings) {
        this.name = name;
        this.grade = grade;
        this.savings = savings;
    }

    public student() {
        this.name = "no name";
        this.grade = 0;
        this.savings = 0;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    public double getSavings() {
        return savings;
    }

    public void setSavings(double savings) {
        this.savings = savings;
    }
}

