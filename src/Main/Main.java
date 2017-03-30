package Main;

import LinkedList.*;

public class Main {

    public static void main(String[] args) {
        LinkedList list = new LinkedList<Integer>();
        list.push(1);
        list.push(2);
        Test.testPrint("Probando que el primero sea correcto", (Integer)list.getFirst() == 2);
        Test.testPrint("Probando que el último sea correcto" , (Integer)list.getLast() == 1);
        Test.testPrint("Probando que borrar el primero sea correcto", (Integer)list.pop() == 2);
        list.pushLast(55);
        Test.testPrint("Probando insertar último", (Integer)list.getLast() == 55);
    }
}
