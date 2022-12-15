import java.math.BigDecimal;

public class Student {
    private String name;
    private int age;
    private Gender gender;
    private BigDecimal money;
    private String surName;

    public Student(String name, int age, Gender gender, BigDecimal money, String surName) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.money = money;
        this.surName = surName;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public BigDecimal getMoney() {
        return money;
    }

    public void setMoney(BigDecimal money) {
        this.money = money;
    }

    public String getSurName() {
        return surName;
    }

    public void setSurName(String surName) {
        this.surName = surName;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                "\n age=" + age +
                "\n gender=" + gender +
                "\n money=" + money +
                "\n surName='" + surName + '\'' +
                '}';
    }
}
