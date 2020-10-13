package StudentGUI;

public class Student {

    private String name;
    private int test[] = new int[3];

    public Student(String nm, int t[]) {
        name = nm;
        test = t;
    }

    public Student(Student other) {
        this(other.name, other.test);
    }

    public void setName(String nm) {
        name = nm;
    }

    public String getName() {
        return name;
    }

    public void setScore(int i, int score) {
        test[i - 1] = score;
    }

    public int getScore(int i) {
        return test[i - 1];
    }

    public int getAverage() {
        int average; //local variable
        average = (test[0] + test[1] + test[2] / 3);
        return average;
    }

    public String toString() {
        String str;
        str = ("Name:\t\t" + name + "\n");
        str += "" + getAverage();
        return str;
    }

    public String validateData() {
        String errormessage = null;
        if (name.length() < 2) {
            errormessage = "Name is required.";
        }
        if (test[0] < 0 || test[0] > 100 || test[1] < 0 || test[1] > 100 || test[2] < 0 || test[2] > 100 ||) {
            errormessage += ("At least one mar is not within the acceptable range.");
        }
        if (errormessage != null) {
            errormessage += ("\nPlease re-enter all the data.");
        }
        return errormessage;
    }

}
