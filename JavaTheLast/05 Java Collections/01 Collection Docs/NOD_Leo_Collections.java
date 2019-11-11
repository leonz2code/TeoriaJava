package org.leonz2code.test1;

import java.util.*;

public class MyMain1 {

static final String[] names_Male_esp =
{"Santiago","Sebastián","Diego","Nicolás","Samuel","Alejandro","Daniel","Mateo","Ángel","Matías","Gabriel","Tomás","David","Emiliano","Andrés","Joaquín","Carlos","Alexander","Adrián","Lucas","Benjamín","Leonardo",
"Rodrigo","Felipe","Francisco","Pablo","Martín","Fernando","Isaac","Manuel","Juan Pablo","Emmanuel","Emilio","Vicente","Eduardo","Juan","Javier","Jorge","Aaron","José","Erick","Luis","Cristian","Ignacio",
"Christopher","Jesús","Kevin","Juan José","Agustín","Juan David","Simón","Joshua","Maximiliano","Miguel Ángel","Juan Sebastián","Bruno","Iván","Gael","Miguel","Thiago","Jerónimo","Hugo","Ricardo","Antonio",
"Ian","Anthony","Pedro","Rafael","Jonathan","Esteban","Juan Manuel","Julián","Mauricio","Oscar","Santino","Axel","Sergio","Guillermo","Matthew","Valentín","Bautista","Álvaro","Dylan","Marcos","Kimberly",
"Luciano","Mario","César","Cristóbal","Luca","Iker","Juan Andrés","Gonzalo","Roberto","Valentino","Facundo","Patricio","Diego Alejandro","Josué","Franco"};

static final String[] names1 = {"Jonathan","Esteban","Juan Manuel","Julián","Mauricio","Oscar","Santino","Axel","Sergio","Guillermo","Leonardo","Juan",
"Oscar", "Leonardo","Juan"};

static final String[] nulos = {null,""};

static final String[] duplucados = {"YES","YES","YES"};

public static void main(String[] args) {

int ctd = names_Male_esp.length;

// NOD , Null , Ordered , Duplicate ( 0 , 0 , 0)

// SET CLASS
Set<String> set = new HashSet<String>();
TreeSet<String> sortedSet = new TreeSet<String>();
LinkedHashSet<String> linkedset = new LinkedHashSet<String>();   

// Set<String> unique = new HashSet<String>(); // replace with TreeSet to get them sorted

// QUEUE

Queue<String> queueP = new PriorityQueue<String>();
Queue<String> queueLL = new LinkedList<String>();
Deque<String> de_que = new ArrayDeque<String>(); 

// LIST CLASS
ArrayList<String> myArrayList = new ArrayList<>();
LinkedList<String> object = new LinkedList<String>();

// MAP CLASS
HashMap<String, Integer> people = new HashMap<String, Integer>();
LinkedHashMap<String,Double> lhm = new LinkedHashMap<String,Double>();
TreeMap<String, Double> tm = new TreeMap<String,Double>(); // SORTED MAP
Hashtable<String, Integer> balance = new Hashtable<String, Integer>();

/* VERIFY SET COLLECTION NOD */

//HashSet
// NOD-- Null , Ordered , Duplicate ( 1 , 0 , 0) OK 4

//LinkedHashSet
// NOD-- Null , Ordered , Duplicate ( 1 , 0 , 0) OK 4

//TreeSet
// NOD-- Null , Ordered , Duplicate ( 0 , 1 , 0) OK 2


//=======================================================================================

/* VERIFY QUEUE COLLECTION NOD */

//PriorityQueue
// NOD-- Null , Ordered , Duplicate ( 0 , 0 , 1) OK 1

//ArrayDeque
// NOD-- Null , Ordered , Duplicate ( 0 , 0 , 1) OK 1

//LinkedList
// NOD-- Null , Ordered , Duplicate ( 1 , 0 , 1) OK 5

//=======================================================================================

/* VERIFY List COLLECTION NOD */

//ArrayList
// NOD-- Null , Ordered , Duplicate ( 1 , 0 , 1) OK 5
//LinkedList
// vector [synchronized version of Arraylist]

for (String s1 : names1) {

set.add(s1);
sortedSet.add(s1);
queueP.add(s1);
queueLL.add(s1);
myArrayList.add(s1);
linkedset.add(s1);

de_que.add(s1);

}

for (String n1 : nulos) {

set.add(n1);
//sortedSet.add(n1);
//queueP.add(n1);
queueLL.add(n1);
myArrayList.add(n1);
linkedset.add(n1);

//de_que.add(n1);

}

for (String d1 : duplucados) {

set.add(d1);
sortedSet.add(d1);
queueP.add(d1);
queueLL.add(d1);
myArrayList.add(d1);

linkedset.add(d1);

de_que.add(d1);


}

for (String cset : de_que) {

System.out.print(cset+",");

}


/* Some String Manipulation

do {
ctd--;
//System.out.print(ctd+",");
if(names_Male_esp[ctd].startsWith("L")) {
System.out.println(names_Male_esp[ctd]);
}
}while(ctd > 0);

*/

}

}