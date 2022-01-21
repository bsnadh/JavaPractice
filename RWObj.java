import java.io.*;

class Employee implements Serializable {
    private String name;
    private int age;

    public Employee(String name, int age) {
        this.name = name;
        this.age = age;
    }
    @Override
    public String toString() {
        return "Name: "+name+" Age: "+age;
    }
} 

public class RWObj {
    public static void main(String[] args) {
        Employee e1 = new Employee("Bishnu", 23);
        Employee e2 = new Employee("Adhikari",20);

        try {
            FileOutputStream fos = new FileOutputStream("emp.doc");

            ObjectOutputStream oos = new ObjectOutputStream(fos);

            // write object to file
            oos.writeObject(e1);
            oos.writeObject(e2);

            oos.close();
            fos.close();

        } catch (IOException e) {
            e.printStackTrace();
        }

        try {
             // read objects
             FileInputStream fis = new FileInputStream("emp.doc");
             ObjectInputStream ois = new ObjectInputStream(fis);
 
             Employee a = (Employee) ObjectInputStream.readObject();
             Employee b = (Employee) ObjectInputStream.readObject();

             System.out.println(a.toString());
             System.out.println(b.toString());

             ois.close();
             fis.close();
 
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
