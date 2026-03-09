import java.util.*;

class Student {
    private int id;
    private String fname;
    private double cgpa;

    public Student(int id, String fname, double cgpa) {
        this.id = id;
        this.fname = fname;
        this.cgpa = cgpa;
    }

    public int getId() {
        return id;
    }

    public String getFname() {
        return fname;
    }

    public double getCgpa() {
        return cgpa;
    }
}

public class Solution {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        List<Student> list = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            int id = in.nextInt();
            String fname = in.next();
            double cgpa = in.nextDouble();

            list.add(new Student(id, fname, cgpa));
        }

        Collections.sort(list, (a, b) -> {
            if (b.getCgpa() != a.getCgpa())
                return Double.compare(b.getCgpa(), a.getCgpa());
            else if (!a.getFname().equals(b.getFname()))
                return a.getFname().compareTo(b.getFname());
            else
                return a.getId() - b.getId();
        });

        for (Student s : list) {
            System.out.println(s.getFname());
        }
    }
}