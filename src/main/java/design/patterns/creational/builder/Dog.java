package design.patterns.creational.builder;

import java.util.ArrayList;
import java.util.List;
public class Dog {
    private String name;
    private String type;
    private Integer age;
    private List<String> toys = new ArrayList<>();

    public static class DogBuilder {
        private final Dog dog = new Dog();
        public DogBuilder withName(String name){
            this.dog.setName(name);
            return this;
        }
        public DogBuilder withType(String type){
            this.dog.setType(type);
            return this;
        }
        public DogBuilder withAge(Integer age){
            this.dog.setAge(age);
            return this;
        }
        public DogBuilder withToy(String toy){
            this.dog.getToys().add(toy);
            return this;
        }
        public Dog build(){
            return this.dog;
        }

    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public List<String> getToys() {
        return toys;
    }

    public void setToys(List<String> toys) {
        this.toys = toys;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", type='" + type + '\'' +
                ", age=" + age +
                ", toys=" + toys +
                '}';
    }
}
