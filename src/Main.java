import java.util.ArrayList;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {

    public static void main(String[] args) {
       Graph busNetwork=new Graph(true,true);
       Vertex balcalıStation= busNetwork.addVertex("Balcalı");
       Vertex catalanStation= busNetwork.addVertex("Catalan");
       busNetwork.addEdge(balcalıStation,catalanStation,1000);
       busNetwork.print();
       Graph busNetwork2=new Graph(true,false);
       Vertex balcalıStation2= busNetwork2.addVertex("Balcalı");
       Vertex catalanStation2= busNetwork2.addVertex("Catalan");
       busNetwork2.addEdge(balcalıStation2,catalanStation2,1000);
       busNetwork2.print();
       Graph busNetwork3=new Graph(false,true);
       Vertex balcalıStation3= busNetwork3.addVertex("Balcalı");
       Vertex catalanStation3= busNetwork3.addVertex("Catalan");
       busNetwork3.addEdge(balcalıStation3,catalanStation3,1000);
       busNetwork3.print();
       Graph busNetwork4=new Graph(false,false);
       Vertex balcalıStation4= busNetwork4.addVertex("Balcalı");
       Vertex catalanStation4= busNetwork4.addVertex("Catalan");
       busNetwork4.addEdge(balcalıStation4,catalanStation4,1000);
       busNetwork4.print();

    }
}