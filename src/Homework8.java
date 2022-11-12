public class Homework8 {
    public static void main(String[] args) {
        Student student1=new Student("surname1","name1","patronymic1","01.03.2001","adds1","213151","faculty1","3","group1");
        Student student2=new Student("surname2","name2","patronymic2","12.04.2002","adds2","481331","faculty2","3","group2");
        Student student3=new Student("surname3","name3","patronymic3","01.08.2000","adds3","333333","faculty3","5","group3");
        Student student4=new Student("surname4","name4","patronymic4","21.02.2003","adds4","789521","faculty1","2","group4");
        Student student5=new Student("surname5","name5","patronymic5","01.11.2001","adds5","565561","faculty2","4","group5");
        Student student6=new Student("surname6","name6","patronymic6","07.11.2005","adds6","564645","faculty3","1","group6");
        Student student7=new Student("surname7","name7","patronymic7","09.09.2002","adds7","333331","faculty1","3","group1");
        Student student8=new Student("surname8","name8","patronymic8","08.08.2001","adds8","222221","faculty2","4","group8");
        StudentList newList=new StudentList();
        newList.addStudent(student1);
        newList.addStudent(student2);
        newList.addStudent(student3);
        newList.addStudent(student4);
        newList.addStudent(student5);
        newList.addStudent(student6);
        newList.addStudent(student7);
        newList.addStudent(student8);
        newList.facultyPrint("faculty1");
        newList.facultyCoursePrint("faculty1","3");
        newList.yearOfBirthPrint("2002");
        newList.groupPrint("group1");




    }
}
