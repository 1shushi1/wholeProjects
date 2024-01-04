package innerClass.itCompanyNotReady;

import java.util.Scanner;

public class ItCompany {
    private Scanner s =  new Scanner(System.in);
    private HR hr = new HR();
    private InterviewRoom interviewRoom = new InterviewRoom();
    private AccountingRoom accountingRoom = new AccountingRoom();
    private WorkingArea workingArea = new WorkingArea();
    private LegacyDept legacyDept = new LegacyDept();
    private String name;
    public ItCompany(){
        menu();
    }
    public void addVacancy(){

    }
    public void applicantCreation(){
        System.out.println("Enter your name");
        String name = s.nextLine();
        System.out.println("Enter your IQ level");
        int iq = Integer.parseInt(s.nextLine());
        System.out.println("Enter your skills");
        String skills = s.nextLine();
        Applicant applicant = new Applicant(name, iq, skills);
        hr.applicantEntry(applicant);
    }
    private void menu(){
        while(true){
            System.out.println("Enter a number : ");
            int answer = Integer.parseInt(s.nextLine());
            switch (answer){

            }
        }
    }
}
