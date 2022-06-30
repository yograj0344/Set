import java.util.*; 
class set1          // set  is interface  
{                   // set is does not contain duplicate valuse
                    // set allows null valuse
                    // type of set 1:- HashSet 2:-LinkedHashset 3:-TreeSet
    public  static void main(String[] args)
    {
        Set<Integer> mark=new HashSet<Integer>();
        mark.add(89);
        mark.add(456);
        mark.add(56);
        mark.add(23);
        mark.add(90);
        System.out.println(mark);
        mark.remove(4);

        Set<String> list=new HashSet<>(); // Hashset is  only one null valuse contain
        list.add("red");               //  it is not follow insertion order
        list.add("yellow");            //  hashset does not any index
        list.add("white");
        list.add("orange");
        list.add("red");
        list.add(null);
        list.add("black");
        list.add(null);
        // list.add(3"yograj");  // not accept hashset dose not any index
        System.out.println(list);

        Set<String> list1=new LinkedHashSet<>();
        list1.add("red");               //  it is not follow insertion order
        list1.add("yellow");            //  hashset does not any index
        list1.add("white");
        list1.add("orange");
        list1.add("red");
        list1.add(null);
        list1.add("black"); 
        System.out.println(list1);

        Set<String> list2=new TreeSet<>();
        list2.add("red");               //  Tree set is not contain null valusre
        list2.add("yellow");            //  tree set is follow by sorting order 
        list2.add("white");
        list2.add("orange");
        list2.add("red");
        // list2.add(null);  not accept
        list2.add("black");
        System.out.println(list2);


    }
}