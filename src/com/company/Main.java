package com.company;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> a = new ArrayList<>();
        a.add(scanner.nextLine());
        a.add(scanner.nextLine());
        a.add(scanner.nextLine());
        a.add(scanner.nextLine());
        a.add(scanner.nextLine());
        System.out.println(a);

        ArrayList<String> b = new ArrayList<>();
        b.add(scanner.nextLine());
        b.add(scanner.nextLine());
        b.add(scanner.nextLine());
        b.add(scanner.nextLine());
        b.add(scanner.nextLine());
        System.out.println(b);

        Collections.reverse(b);

        Iterator<String> iteratorA = a.iterator();
        Iterator<String> iteratorB = b.iterator();
        ArrayList<String> c = new ArrayList<>();

        while (iteratorA.hasNext() || iteratorB.hasNext()) {
            if (iteratorA.hasNext()) {
                c.add(iteratorA.next());
            }
            if (iteratorB.hasNext()) {
                c.add(iteratorB.next());
            }
        }
        System.out.println(c);

        Collections.sort(c, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                if (o1.length() != o2.length()){
                    return o1.length() - o2.length();
                }
                return o1.compareTo(o2);
            }
        });
        System.out.println(c);
    }
}
