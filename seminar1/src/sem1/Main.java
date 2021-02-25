package sem1;

import clase.Giraffe;
import clase.Zebra;
import clase.Zoo;
import clase.Zookeeper;

public class Main {
    public static void main(String[] args){
        System.out.println("Hello");

        Zoo zoo = new Zoo();
        //Zookeeper zookeeper = new Zookeeper("James");

        Zebra zebra1 = new Zebra("zebra1");
        Zebra zebra2 = new Zebra("zebra2");

        Giraffe giraffe1 = new Giraffe("giraffe1");
        Giraffe giraffe2 = new Giraffe("giraffe2");

        zoo.add(zebra1);
        zoo.add(zebra2);
        zoo.add(giraffe1);
        zoo.add(giraffe2);

        zoo.feedAnimals();
    }
}
