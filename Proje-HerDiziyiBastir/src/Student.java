
public class Student {
    private String name;
    private String surname;
    private int id;

    public Student(String name, String surname, int id) {
        this.name = name;
        this.surname = surname;
        this.id = id;
    }

    @Override
    public String toString() {
        System.out.println("name: " + name);
        System.out.println("surname: " + surname);
        System.out.println("id: " + id);
        return "";
    }

    
}
