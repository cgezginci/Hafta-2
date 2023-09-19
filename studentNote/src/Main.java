public class Main {
    public static void main(String[] args) {
        Teacher t1 = new Teacher("Ali" , "TRH" , "9999"  );
        Teacher t2 = new Teacher("Ayşe","FZK", "8888");
        Teacher t3 = new Teacher("Ahmet", "BIO", "7777");

        Course tarih = new Course("Tarih","101", "TRH");
        Course fizik = new Course("Fizik", "101","FZK");
        Course biyoloji = new Course("Biyoloji","101", "BIO");
        tarih.addTeacher(t1);
        fizik.addTeacher(t2);
        biyoloji.addTeacher(t3);

        Student s1 = new Student("Can", "147", "4", tarih, fizik, biyoloji);
        s1.addBulkExamNote(100,10,50);
        s1.addBulkExamsNote(50,40,80);
        s1.isPass();

        Student s2 = new Student("Tuğba", "197", "4", tarih, fizik, biyoloji);
        s2.addBulkExamNote(70,60,80);
        s2.addBulkExamsNote(50,70,50);
        s2.isPass();




    }
}
