package udemy;

import udemy.classdesign.ParentClass;

public class AcessModifiers extends ParentClass{
    private String genus="Genius";
    private String localName;

    public void setGenus(String text){
        this.genus=text;
    }

    public String getGenus(){
        return this.genus;
    }

    //GET Protected Field from Parent( Outside Package)
    public void GetNameFromSuper(){
//        this.localName=name;
        this.localName=super.name;
    }

}

