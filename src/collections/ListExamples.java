package collections;

import java.util.*;

public class ListExamples {
    public static void main(String[] args) {
        List<Integer> integerList = new ArrayList<>();
        System.out.println(integerList.contains(3));
        List<Integer> integerList2 = new ArrayList<>();
        List<String> linkedList = new LinkedList<>();
        Stack<Plate> plates = new Stack<>(); //push,pop,peak,search,isEmpty,clear
        Queue<People> people = new ArrayDeque<>(); // normal queue - offer,poll,element,search,isEmpty,clear
        Queue<People> people1 = new PriorityQueue<>(new Comparator<People>() {
            @Override
            public int compare(People o1, People o2) {
                return Integer.compare(o1.getAge(),o2.getAge());
            }
        }); //you can give some privalage to some objects

        People p1 = new People(14);
        People p2 = new People(22);
        People p3 = new People(44);
        people1.offer(p1);
        people1.offer(p2);
        people1.offer(p3);
        System.out.println(people1);
        while (!people1.isEmpty()) {
            System.out.println(people1.poll());
        }

        Set<Integer> set = new HashSet<>();
        set.add(1);
        TreeSet<People> treeSet = new TreeSet<>(new Comparator<People>() {
            @Override
            public int compare(People o1, People o2) {
                return Integer.compare(o2.getAge(),o1.getAge());
            }
        });

        treeSet.add(p1);
        treeSet.add(p3);
        treeSet.add(p2);
        System.out.println(treeSet);

        Map<Integer,String> map = new HashMap<>();
        map.put(10,"Abdulaziz");
        map.put(56464664,"Samandar");
        map.put(3,"Aziz");

        for (Map.Entry<Integer,String> tempMap : map.entrySet()){
            System.out.println(tempMap.getKey());
        }
        System.out.println(map);
        TreeMap<Integer,String> treeMap = new TreeMap<>();
        treeMap.put(20,"Abdulaziz");
        treeMap.put(19,"Samandar");
        treeMap.put(25,"Farrukh");
        treeMap.put(18,"Abdurakhman");

        //tree -> sort

        System.out.println(treeMap);
        Collections.sort(integerList);





    }
}
