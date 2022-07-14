public class Main {
    public static void main(String[] args) {

     Fish fish = new Fish();
     fish.setNeme("Nemo");
     fish.setAge(2);
     fish.setColor("red");
     fish.setWeight(1.2);

     System.out.println(fish.getNeme());
     System.out.println(fish.getAge());
     System.out.println(fish.getColor());
     System.out.println(fish.getWeight());
     System.out.println();

     Parrot parrot = new Parrot();
     parrot.setNeme("Popugai");
     parrot.setAge(3);
     parrot.setColor("yellow");
     parrot.setWeight(0.5);
     System.out.println(parrot.getNeme());
     System.out.println(parrot.getAge());
     System.out.println(parrot.getColor());
     System.out.println(parrot.getWeight());
     System.out.println();

     Cat cat = new Cat();
     cat.setNeme("Kisa");
     cat.setAge(1);
     cat.setColor("striped"); //полосатый
     cat.setWeight(0.5);
     System.out.println(cat.getNeme());
     System.out.println(cat.getAge());
     System.out.println(cat.getColor());
     System.out.println(cat.getWeight());
     System.out.println();

     Dog dog = new Dog();
     dog.setNeme("Reks");
     dog.setAge(1);
     dog.setColor("white");
     dog.setWeight(0.7);
     System.out.println(dog.getNeme());
     System.out.println(dog.getAge());
     System.out.println(dog.getColor());
     System.out.println(dog.getWeight());

    }
}