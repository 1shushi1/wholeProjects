package innerClass.itCompanyNotReady;

import java.util.ArrayList;

public class WorkBook {
    private String ownerName;
    private ArrayList<String> workingList = new ArrayList<>();
    public WorkBook(String name){
        this.ownerName = name;
    }
    public void addJob(String record){
        workingList.add(record);
    }
}
