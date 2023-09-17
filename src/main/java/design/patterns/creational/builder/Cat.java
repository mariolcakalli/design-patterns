package design.patterns.creational.builder;


public class Cat {
    private String name;
    private int age;
    private int weight;
    private String breed;

    public static CatBuilder builder(){
        return new CatBuilder();
    }

    public static class CatBuilder{
        private final Cat cat = new Cat();

        public CatBuilder name(String name){
            cat.setName(name);
            return this;
        }

        public CatBuilder age(int age){
            cat.setAge(age);
            return this;
        }

        public CatBuilder weight(int weight){
            cat.setWeight(weight);
            return this;
        }

        public CatBuilder breed(String breed){
            cat.setBreed(breed);
            return this;
        }

        public Cat build(){
            return cat;
        }

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

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }
}
