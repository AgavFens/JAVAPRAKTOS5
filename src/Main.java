interface Animal {
    void eat();
    void sound();
}

class Dog implements Animal {
    @Override
    public void eat() {
        System.out.println("Собака ест кость.");
    }

    @Override
    public void sound() {
        System.out.println("Гав");
    }
}

class Cat implements Animal {
    @Override
    public void eat() {
        System.out.println("Кошка ест рыбу.");
    }

    @Override
    public void sound() {
        System.out.println("Мяу");
    }
}

interface Pet extends Animal {
    void play();
}

class DogPet extends Dog implements Pet {
    @Override
    public void play() {
        System.out.println("Собака играет с мячом.");
    }
}

class CatPet extends Cat implements Pet {
    @Override
    public void play() {
        System.out.println("Кошка играет с клубком ниток.");
    }
}

public class Main {
    public static void main(String[] args) {
        Pet dog = new DogPet();
        dog.eat();
        dog.sound();
        ((DogPet) dog).play();

        Pet cat = new CatPet();
        cat.eat();
        cat.sound();
        ((CatPet) cat).play();
    }
}
