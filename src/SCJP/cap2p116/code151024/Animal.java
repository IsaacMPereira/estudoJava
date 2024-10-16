package SCJP.cap2p116.code151024;

class Animal {
    void makeNoise(){
        System.out.println("Make generic noise");
    }
}

class Dog extends Animal{
    void makeNoise(){
        System.out.println("bark");
    }
    void playDead(){
        System.out.println ("roll over");
    }
}

class CastTest2{
    public static void main(String[] args) {
        Animal [] a = {new Animal(), new Dog(), new Animal()};
        for(Animal animal : a){
            animal.makeNoise();
            if(animal instanceof Dog){
//                ((Dog) animal).playDead(); //Casting feito pela IDE
//                animal.playDead();
                Dog d = (Dog) animal; //Casting feito pelo livro
                d.playDead();
            }
        }
    }
}
