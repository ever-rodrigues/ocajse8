package praticalexam;

public class GarbageCollectionQuestions {
    int id;
    GarbageCollectionQuestions(int i){
        id=i;
    }
    public static void main(String[] args) {
        //When the Objects has no more references to it first time:

        //1 -> method gets FINALIZE() are called IMPLICITY and this saves the object from garbage collection

        //2 -> The second Time is about Garbage Colletion, the objects FINALIZE() method does not called and the object
        //is READY FOR GARBAGE COLLECTION!

        new GarbageCollectionQuestions(3).go();
        //LINE TO OBSVE
        //AFTER the program runs, at line 17 all Treee Objects will be allowed to GARBAGE COLLECTOR!!



    }
    void go(){
        GarbageCollectionQuestions g1 = new GarbageCollectionQuestions(1);
        GarbageCollectionQuestions g2 = new GarbageCollectionQuestions(2);
        System.out.println(g1.id+" "+g2.id);
    }
}
