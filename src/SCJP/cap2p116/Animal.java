package SCJP.cap2p116;

class Animal {
    void makeNoise(){
        System.out.printf("Make generic noise");
    }
}

class Dog extends Animal{
    void makeNoise(){
        System.out.printf("bark");
    }
    void playDead(){
        System.out.printf("roll over");
    }
}

class CastTest2{
    public static void main(String[] args) {
        Animal [] a = {new Animal(), new Dog(), new Animal()};
        for(Animal animal : a){
            animal.makeNoise();
            if(animal instanceof Dog){
//                ((Dog) animal).playDead();
                animal.playDead();
            }
        }
    }
}
