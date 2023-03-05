package class18;

public class dog {String name;
    String breed;
    String color;
    int age;
    double weight;
    dog(String DogName,String DogBreed,String DogColor,int DogAge,double Dogweight){
        name=DogName;
        breed=DogBreed;
        color=DogColor;
        age=DogAge;
        weight=Dogweight;

    }void printinfo(){
        System.out.println("Name "+name+" Breed "+breed+" age "
                +age+"weight"+weight);
    }

}
