import ProjectAsset.*;

public class Main {
    public static void main(String[] args) {
        Employee e1 = new Employee("Tom", 20, "UX/UI", "0001");
        Employee e2 = new Employee("Tim", 21, "FrontEnd", "0002");

        Project p1 = new Project("Web A", "Developing a web application");
        Project p2 = new Project("Mobile app A", "Developing a mobile app");

        e1.AddProject(p1);
        e1.AddProject(p2);
        e2.AddProject(p1);

        e1.ShowDetails();
        e2.ShowDetails();
    }
}
