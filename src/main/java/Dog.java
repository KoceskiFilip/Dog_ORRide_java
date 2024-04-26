

class Dog { // SUPERCLASS Dog
    public void attributes() { // method attributes
        System.out.println("The dog barks");
    }
}

class HunterDog extends Dog { // SUBCLASS HuntingDog
    public void attributes() { // method attributes
        System.out.println("The hunting dog tracks");
    }
}

class Glavna {
    public static void main(String[] args) {
        Dog reks = new Dog(); // create object
        reks.attributes(); // call the attributes method of the Dog superclass
        HunterDog hunter = new HunterDog(); // create object hunter
        hunter.attributes(); // call the attributes method of the HuntingDog subclass
    }
}
