package com.company;

import java.util.HashMap;
import java.util.Hashtable;

public class Recipe {
    private String title;
    private int cookTime;
    private int prepTime;
    private HashMap<String, Integer> ingredientList;

    public Recipe() {
    }
    public Recipe(String title, int minCook, int minPrep, HashMap<String,Integer> ingredientList){
        this.title= title;
        this.cookTime= minCook;
        this.prepTime= minPrep;
        this.title= title;
        this.ingredientList=ingredientList;
    }
    public Recipe(String title, int minCook, int minPrep){
        this.title= title;
        this.cookTime= minCook;
        this.prepTime= minPrep;
        this.title= title;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getCookTime() {
        return cookTime;
    }

    public void setCookTime(int cookTime) {
        this.cookTime = cookTime;
    }

    public int getPrepTime() {
        return prepTime;
    }

    public void setPrepTime(int prepTime) {
        this.prepTime = prepTime;
    }

    /*  Calculates the total time to prep and and cook a recipe*/
    private int totalTime(){
       int total= this.cookTime + this.prepTime;
       return total;
    }
   /*  Returns true if the total time to prep and cook the recipe is less than arguement time*/
    public boolean shortTime(int desiredTime ){
        return totalTime()<=desiredTime;
    }

    /*  Returns a statement about if the total time is a fast recipe*/
    public String shortTimeText() {
        if (shortTime(30)) {
            return this.title + "takes longer than 30 min to prep and cook";
        } else {
            return this.title + " takes longer than 30 min to prep and cook!";
        }
    }
    /*  Returns a statement about the cook and prep time less than desired times*/
    public String shortTimeText(int desiredTime){
            if (shortTime(desiredTime)){
                return this.title + " takes no loner than " + desiredTime +  " minutes Total to prep and cook!";
            }
            else{
                return this.title + " takes longer " + desiredTime +  " minutes Total to prep and cook!";
            }

    }

}
