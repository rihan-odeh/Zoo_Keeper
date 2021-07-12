package com.example.zoo_keeper;

public class Gorilla extends Mammal{
    String message= "";

    public Gorilla(){

    }
    public void throwSth(boolean didThrow){

        if(didThrow){
            super.energyLevel -= 5 ;
          message=  "The gorilla has thrown something";
        }

    }
    public void eatBananas(boolean ateBanana){

        if(ateBanana){
            super.energyLevel += 10 ;
            message=  "The gorilla has eaten a banana";
        }

    }
    public void climb(boolean climbed){

        if(climbed){
            super.energyLevel -= 10 ;
            message=  "The gorilla has climbed a tree";
        }

    }

}
