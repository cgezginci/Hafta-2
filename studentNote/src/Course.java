public class Course {
    Teacher teach;
    String name;
    String code;
    String prefix;
    int note;
    int sNote;
    Course(String name, String code, String prefix){
        this.name = name;
        this.code = code;
        this.prefix = prefix;
        int note = 0;
        int sNote = 0;
    }
    void addTeacher(Teacher teach){
        if (teach.branch.equals(this.prefix)) {
            this.teach = teach;

        }else {
            System.out.println("Öğretmen ile ders uyuşmuyor.");
        }

    }
    void printTeacher() {
        this.teach.print();
    }
}
