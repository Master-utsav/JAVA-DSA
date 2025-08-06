package step_3_SolveProblemsOnArrays;

import java.util.*;

public class L1_Q8_FindTheUnionAndIntersection {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the length of first array : ");
        int len_1 = scanner.nextInt();

        List<Integer> array_list_1 = new ArrayList<>();
        System.out.print("Enter the elements of an array : ");
        while (len_1 != 0) {
            array_list_1.add(scanner.nextInt());
            len_1--;
        }

        System.out.print("Enter the length of second array : ");
        int len_2 = scanner.nextInt();

        List<Integer> array_list_2 = new ArrayList<>();
        System.out.print("Enter the elements of an array : ");
        while (len_2 != 0) {
            array_list_2.add(scanner.nextInt());
            len_2--;
        }

        System.out.println("Array First : " + array_list_1);
        System.out.println("Array Second : " + array_list_2);
        List<Integer> union_of_list = new ArrayList<>(unionOfArrays(array_list_1 , array_list_2));
        System.out.println("After union : " + union_of_list);
        List<Integer>  intersection_list = new ArrayList<>(intersectionOfArrays(array_list_1 , array_list_2));
        System.out.println("After intersection : " + intersection_list);

        scanner.close();
    }

    public static List<Integer> intersectionOfArrays(List<Integer> array_list_1 , List<Integer> array_list_2){
        List<Integer> intersection_list = new ArrayList<>();
        int i = 0; int j = 0;
        while(i < array_list_1.size() && j < array_list_2.size()){
            if(array_list_1.get(i) < array_list_2.get(j)) i++;
            else if (array_list_1.get(i) > array_list_2.get(j)) j++;
            else if(intersection_list.isEmpty() || (!Objects.equals(intersection_list.getLast(), array_list_1.get(i)))) {
                intersection_list.add(array_list_1.get(i));
                i++;
                j++;
            }
            else{
                i++;
                j++;
            }
        }
        return intersection_list;

    }

    public static List<Integer> unionOfArrays(List<Integer> array_list_1 , List<Integer> array_list_2){
        List<Integer> union_list = new ArrayList<>();
        int i = 0;
        int j = 0;

        while(i < array_list_1.size() && j < array_list_2.size()){
            if(array_list_1.get(i) < array_list_2.get(j)){
                if(union_list.isEmpty() || !Objects.equals(union_list.getLast(), array_list_1.get(i)) ) union_list.add(array_list_1.get(i));
                i++;
            }
            else {
                if(union_list.isEmpty() || !Objects.equals(union_list.getLast(), array_list_2.get(j)) ) union_list.add(array_list_2.get(j));
                j++;
            }
        }

        while(i < array_list_1.size()){
            if(union_list.isEmpty() || !Objects.equals(union_list.getLast(), array_list_1.get(i)) ) union_list.add(array_list_1.get(i));
            i++;
        }

        while(j < array_list_2.size()){
            if(union_list.isEmpty() || !Objects.equals(union_list.getLast(), array_list_2.get(j)) ) union_list.add(array_list_2.get(j));
            j++;
        }

        return union_list;
    }

}
