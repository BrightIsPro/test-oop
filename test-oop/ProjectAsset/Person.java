package ProjectAsset;

public class Person {
    public String Name;
    public double Age;

    public Person(String Name, double Age) {
        this.Name = Name;
        this.Age = Age;
    }

    public String getName() {
        return this.Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public double getAge() {
        return this.Age;
    }

    public void setAge(double Age) {
        this.Age = Age;
    }
}
