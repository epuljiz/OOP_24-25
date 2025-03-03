package pckg_fst;

public class TestSt {
    public static void main(String[] args) {
        Student st1 = new Student("Marija","UNIDU", "Comp sci", 3);
        Student st2 = new Student("Marko","UNIZD", "IT", 3);
        System.out.println(st1);
        System.out.println(st2);
        st2.setName("Markiša");
        System.out.println(st2.getName());
    }
}
