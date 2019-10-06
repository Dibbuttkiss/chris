package com.company;

public class Cat {

    private String name;
    private String color;
    private float weight;
    private String breed;



    void Eats (String food){
        System.out.println(name + "Eats" + food);
    }

    void Sleep (int time){
        System.out.println(name + "Sleep" + time);
    }

    public Cat( String name,String color,int w){

      this.name = name;
      this.color = color;
      this.weight = w;
    }

    public Cat (String breed){
       this.breed = breed;
    }

    public void ShowMyInfo(){
        System.out.println(" Name:" + name + " Color:" + color + " Weight:" + weight);
    }


}
