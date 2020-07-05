package fr.epita.exam.nitesh_kumar_jha_adv_java;

import javax.persistence.Entity;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonPropertyOrder;


@Entity
@Table
@JsonPropertyOrder({"name","sex","age","height", "weight"})
public class Person {
	private String name;
	 private String sex;
    private int age;
    private int height;
    private int weight;
    public Person(){

    }

    public Person(   int age, int height, String name, String sex, int weight) {
    	this.name = name;
    	this.sex = sex;
    	this.age = age;
        this.height = height;
        this.weight = weight;
    }

    public String getName() {
        return name;
    }

    public String getSex() {
        return sex;
    }

    public int getAge() {
        return age;
    }

    public int getHeight() {
        return height;
    }

    public int getWeight() {
        return weight;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", sex='" + sex + '\'' +
                ", age=" + age +
                ", height=" + height +
                ", weight=" + weight +
                '}';
    }
}

