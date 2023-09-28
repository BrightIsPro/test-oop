package ProjectAsset;

import java.util.ArrayList;;

public class Employee {
    public String Name;
    public double Age;
    public String Position;
    public String EmpID;
    public ArrayList<Project> projects;

    public Employee(String Name, double Age, String Position, String EmpID) {
        this.Name = Name;
        this.Age = Age;
        this.Position = Position;
        this.EmpID = EmpID;
        this.projects = new ArrayList<Project>();
    }

    public void AddProject(Project project) {
        projects.add(project);
    }

    public void ShowDetails() {
        System.out.println("***************************************");
        System.out.println("Name: " + Name);
        System.out.println("Position: " + Position);
        System.out.println("EmpID: " + EmpID);

        System.out.println("Projects");
        for (Project project : projects) {
            System.out.println(project.projectName + " : " + project.description);
        }
    }
}
