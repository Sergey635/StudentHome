package com.company;

import java.time.LocalDate;

public class Student {
    private String name;
    private String patronymic;
    private String lastName;
    private boolean gender;
    private int course;
    private String cafedrial;
    private LocalDate birthday;
    private int height;
    private int weight;
    private String home;
    private long telephone;
    private String  email;
    private String education;
    private String formOfTraining;
    private String fatherName;
    private String fatherPatronymic;
    private String fatherLastName;

    public Student() {
    }

    public Student(String name, String patronymic, String lastName, boolean gender, int course, String cafedrial, LocalDate birthday, int height, int weight, String home, long telephone, String email, String education, String formOfTraining, String fatherName, String fatherPatronymic, String fatherLastName) {
        this.name = name;
        this.patronymic = patronymic;
        this.lastName = lastName;
        this.gender = gender;
        this.course = course;
        this.cafedrial = cafedrial;
        this.birthday = birthday;
        this.height = height;
        this.weight = weight;
        this.home = home;
        this.telephone = telephone;
        this.email = email;
        this.education = education;
        this.formOfTraining = formOfTraining;
        this.fatherName = fatherName;
        this.fatherPatronymic = fatherPatronymic;
        this.fatherLastName = fatherLastName;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPatronymic() {
        return patronymic;
    }

    public void setPatronymic(String patronymic) {
        this.patronymic = patronymic;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public boolean isGender() {
        return gender;
    }

    public void setGender(boolean gender) {
        this.gender = gender;
    }

    public int getCourse() {
        return course;
    }

    public void setCourse(int course) {
        this.course = course;
    }

    public String getCafedrial() {
        return cafedrial;
    }

    public void setCafedrial(String cafedrial) {
        this.cafedrial = cafedrial;
    }

    public LocalDate getBirthday() {
        return birthday;
    }

    public void setBirthday(LocalDate birthday) {
        this.birthday = birthday;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public String getHome() {
        return home;
    }

    public void setHome(String home) {
        this.home = home;
    }

    public long getTelephone() {
        return telephone;
    }

    public void setTelephone(long telephone) {
        this.telephone = telephone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getEducation() {
        return education;
    }

    public void setEducation(String education) {
        this.education = education;
    }

    public String getFormOfTraining() {
        return formOfTraining;
    }

    public void setFormOfTraining(String formOfTraining) {
        this.formOfTraining = formOfTraining;
    }

    public String getFatherName() {
        return fatherName;
    }

    public void setFatherName(String fatherName) {
        this.fatherName = fatherName;
    }

    public String getFatherPatronymic() {
        return fatherPatronymic;
    }

    public void setFatherPatronymic(String fatherPatronymic) {
        this.fatherPatronymic = fatherPatronymic;
    }

    public String getFatherLastName() {
        return fatherLastName;
    }

    public void setFatherLastName(String fatherLastName) {
        this.fatherLastName = fatherLastName;
    }

    @Override
    public String toString() {
        String buffer = "";
        if (gender == true){
            buffer = "Male";
        }else {
            buffer = "FeMale";
        }
        return "Student{" +
                "name='" + name + '\'' +
                ", patronymic='" + patronymic + '\'' +
                ", lastName='" + lastName + '\'' +
                ", gender=" + buffer +
                ", course=" + course +
                ", cafedrial='" + cafedrial + '\'' +
                ", birthday=" + birthday +
                ", height=" + height +
                ", weight=" + weight +
                ", home='" + home + '\'' +
                ", telephone=" + telephone +
                ", email='" + email + '\'' +
                ", education='" + education + '\'' +
                ", formOfTraining='" + formOfTraining + '\'' +
                ", fatherName='" + fatherName + '\'' +
                ", fatherPatronymic='" + fatherPatronymic + '\'' +
                ", fatherLastName='" + fatherLastName + '\'' +
                '}';
    }
}
