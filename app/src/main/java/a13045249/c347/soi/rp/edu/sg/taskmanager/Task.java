package a13045249.c347.soi.rp.edu.sg.taskmanager;

import java.io.Serializable;

/**
 * Created by 13045249 on 26/5/2017.
 */

public class Task implements Serializable{
    private int id;
    private String taskname;
    private String description;

    public Task(int id, String taskname, String description){
        this.id = id;
        this.taskname = taskname;
        this.description = description;
    }
    public int getid() {
     return id;
    }

    public String gettaskname(){
        return taskname;
    }
    public String getdescription(){
        return description;
    }



}
