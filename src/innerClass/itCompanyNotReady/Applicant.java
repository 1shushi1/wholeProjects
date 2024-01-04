package innerClass.itCompanyNotReady;

public class Applicant {
    private String name;
    private int iq;
    private int salary;
    private String skills;
    private WorkBook workBook;
    public Applicant(String name, int iq, String skills){
        this.name = name;
        this.iq = iq;
        this.skills = skills;
    }
    public void coding(){

    }
    public void setWorkBook(WorkBook workBook){
        this.workBook = workBook;
    }
    public void setSalary(int salary){
        this.salary = salary;
    }
}
