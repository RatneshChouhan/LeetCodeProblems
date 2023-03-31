package com.rc.tech;

public class Practice {
    public static void main(String[] args) {
        int num = 1234567891;

        int count = (int) String.valueOf(num).chars().filter(Character::isDigit).count();

        System.out.println(count);

   /*     Set<Short> shortSet = new HashSet<>();

        for(short i = 0; i < 10; i++) {
            shortSet.add(i);
            shortSet.remove((short)i - 1);
        }

        System.out.println("Printing 1");
        for (Short value : shortSet) {
            System.out.println(value);
        }
*/
    /*  System.out.println("Printing 2");
        shortSet.forEach(System.out::println);

        int[][] intervals = {{8, 10}, {1, 3}, {2, 6}, {15, 18}};
        Comparator<int[]> rowComparator = Comparator.comparingInt(row -> row[0]);
        Arrays.sort(intervals, rowComparator);
        List<int[]> merged = new ArrayList<>();
        int[] prev = intervals[0];
      //  for (int i = 1; i < intervals.length; i++) {
        for(int[] current : intervals) {
       //     int[] current = intervals[i];
            if (current[0] < prev[1]) {
                prev[1] = Math.max(prev[1], current[1]);
            } else {
                merged.add(prev);
                prev = current;
            }
        }
        merged.add(prev);
        merged.stream().forEach(row -> System.out.println(Arrays.toString(row)));*/
        String word1 = "Codecademy";
        String word2 = "Codecademy";

   //     System.out.println(comparator.compare(word1, word2));

   /*     System.out.println(Integer.valueOf("123"));

        List<String> names = Arrays.asList("Alice", "Bob", "Charlie");
        Comparator<String> compareIgnoreCase = String::compareToIgnoreCase;
        names.sort(compareIgnoreCase);
        names.forEach(System.out::println);*/

    }
}
