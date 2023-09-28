package ProjectAsset;

public class Project {
    public String projectName;
    public String description;

    public Project(String projectName, String description) {
        this.projectName = projectName;
        this.description = description;
    }

    public void getProject() {
        System.out.print(projectName + ":" + description);
    }
}
