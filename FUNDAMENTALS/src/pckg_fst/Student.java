package pckg_fst;

public class Student {

    private int yearOfStudy;
    private String name;
    private String university;
    private String studyProgram;

    public Student(String name, String uni, String studyP, int year) {
        this.name = name;
        this.university = uni;
        this.studyProgram = studyP;
        yearOfStudy = year;
    }

    public int getYearOfStudy() {
        return yearOfStudy;
    }

    public String getName() {
        return name;
    }

    public String getUniversity() {
        return university;
    }

    public String getStudyProgram() {
        return studyProgram;
    }

    public void setYearOfStudy(int yearOfStudy) {
        this.yearOfStudy = yearOfStudy;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setUniversity(String university) {
        this.university = university;
    }

    public void setStudyProgram(String studyProgram) {
        this.studyProgram = studyProgram;
    }

    @Override
    public String toString() {
        return "Student{" +
                "yearOfStudy=" + yearOfStudy +
                ", name='" + name + '\'' +
                ", university='" + university + '\'' +
                ", studyProgram='" + studyProgram + '\'' +
                '}';
    }
}
