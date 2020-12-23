package warenwirtschaftssystem;

import java.util.ArrayList;
import java.util.LinkedList;

//import java.util.*; alle classe von Bibliotek

public class StartWWS {

    public static void main(String[] args) {
        Mitarbeiter m1 = new Mitarbeiter(1234.33, "Tsvetelina", "Dimitrova", 
                "Testweg", "12526", "Berlin");
        Mitarbeiter m2 = new Mitarbeiter(1222.33, "Tsvetelina", "Dimitrova", 
                "Testweg", "12526", "Berlin");
        Handelsvertreter h1 = new Handelsvertreter(3.5, "Tsvetelina", "Dimitrova",
            "Testweg", "12526", "Berlin");
        Zeitarbeiter z1 = new Zeitarbeiter(12.8, "Tsvetelina", "Dimitrova",
            "Testweg", "12526", "Berlin");
       
        //Späte Bindung am Beispiel primitives Array
//        Mitarbeiter[] maarray = new Mitarbeiter[3];
//        maarray[0] = m1;
//        maarray[1] = h1;
//        maarray[2] = z1;
//        
//        for (Mitarbeiter ma : maarray){
//            System.out.println(ma);
//        }
        //Späte Bindung am Beispiel primitives Array

//ArrayList<Mitarbeiter> almit = new ArrayList<>();
//almit.add(m1);
//almit.add(h1);
//almit.add(z1);
//almit.add(1,m2);
//almit.remove(z1);
//for (int i = 0; i < almit.size();i++){
//    System.out.println(almit.get(i));
//}

LinkedList<Mitarbeiter> llmit = new LinkedList<>();
llmit.add(m1);
llmit.add(h1);
llmit.addFirst(m2);
llmit.add(z1);
for (int i = 0; i < llmit.size();i++){
    System.out.println(llmit.get(i));
}
    }
    
}
