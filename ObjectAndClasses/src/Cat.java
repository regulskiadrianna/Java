public class Cat {
    String coatColor;
    String eyeColor;
    String size;
    String catName;

    //Constructor
    public Cat(){

    }

    //Constructor
    public Cat(String coatColor, String eyeColor, String size, String catName) {
        this.coatColor = coatColor;
        this.eyeColor = eyeColor;
        this.size = size;
        this.catName = catName;
    }

    //Getters
    public String getCoatColor(){
        return getCoatColor();
    }

    public String getEyeColor(){
        return eyeColor;
    }

    public String getSize(){
        return size;
    }

    public String getCatName(){
        return catName;
    }


    //Methods
    void Sleeping(){
        System.out.println("The cat is sleeping. ");
    }

    void Playing(){
        System.out.println("The cat is playing.");
    }

}
