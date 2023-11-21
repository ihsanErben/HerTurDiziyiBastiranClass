
public class Main {

    public static void main(String[] args) {
        Generic g = new Generic();
        String[] names = {"ihsan", "zeynep", "ulku"};
        Integer[] numbers = {1, 2, 3};
        Character[] letters = {'A', 'B', 'C'};

        Student ogrenci1 = new Student("ihsan", "erben", 7);
        Student ogrenci2 = new Student("zeynep", "ucar", 10);
        Student ogrenci3 = new Student("ulku", "erben", 1);
        Student ogrenci4 = new Student("arif", "erben", 007);
        Student[] students = {ogrenci1, ogrenci2, ogrenci3, ogrenci4};
        
        g.bastir(names);
        g.bastir(numbers);
        g.bastir(letters);
        g.bastir(students);
    }
}
