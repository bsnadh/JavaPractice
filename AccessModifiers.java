package exam;

/*
*
->  used to set accessiblity or visiblity of classes, methods, interfaces,variables,constructors,data members etc

-> default: declarations are visible only within the package(package private)

-> private: declarations are visible within the class only

-> protected: declarations are visible within the package or all subclasses

-> public: declarations are visible everywhere

*
*/

public class AccessModifiers {
    public static void main(String[] args) {
        Program p = new Program();
        p.setName("access modifier");
        System.out.println(p.getName());
    }
}
 
class Program {
    private String name;
    //getters and setters to access private variable
    public String getName() {
        return this.name;
    }
    public void setName(String name) {
        this.name = name;
    }
}
