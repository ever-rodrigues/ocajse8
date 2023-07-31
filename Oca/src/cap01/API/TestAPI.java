package cap01.API;

import java.util.*;

public class TestAPI {
    public static void main(String[] args) {
        //LIST

        ArrayList test= new ArrayList();
        test.add("A");

        LinkedList test2= new LinkedList();
        test2.add("B");

        Vector vector01= new Vector();
        vector01.add("C");

        //ESTRUTURA DE DADOS BASEADOS EM ACESSO POSICIONAL
        //POSITION ACCESS



        //MAP

        HashMap<String,String> has= new HashMap();
        has.put("A","teste");

        Hashtable<String,String> test10= new Hashtable<>();
        test10.put("a","b");

        LinkedHashMap<String,String> linkedHashMap= new LinkedHashMap<>();
        linkedHashMap.put("LinkedKey", "LinkedValue");

        TreeMap<String,String> treeMap = new TreeMap<>();

        treeMap.put("Key","Value");

        //ESTRUTURA DE DADOS QUE MAPEIAM CHAVES E VALORES
        //Data Structures that map key and values


        //SET
        //ESTRUTUTURA DE DADOS BASEADOS EM EXCLUSIVIDADES DE ELEMENTOS
        //DATA STRUCUTURE CONCERN WITH ELEMENTS ARE EXCLUSIV

        HashSet<String> hashSet= new HashSet<>();

        hashSet.add("AAA");
        hashSet.add("BBB");


        LinkedHashSet<String> linkedHashSet= new LinkedHashSet<>();

        linkedHashSet.add("AAA");
        linkedHashSet.add("BBB");


        TreeSet<String> treeSet = new TreeSet<>();
        treeSet.add("AAA");




        //QUEUE
        //FILAS COM PRIORIDADE ORDENAM OS ELEMENTOS DE ACORDO COM UM COMPARADOR FORNECIDO.

        PriorityQueue<String> priorityQueue= new PriorityQueue<>();
        priorityQueue.add("AAA");


    }
}
