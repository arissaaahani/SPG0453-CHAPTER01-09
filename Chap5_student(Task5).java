package task.pkg5;
public class student {
    String name;
    double mark1;
    double mark2;
    double mark3;

    public student(String name, double mark1, double mark2, double mark3) {
        this.name = name;
        this.mark1 = mark1;
        this.mark2 = mark2;
        this.mark3 = mark3;
    }

    public double calculateAverage() {
        return (mark1 + mark2 + mark3) / 3;
        }
    }

