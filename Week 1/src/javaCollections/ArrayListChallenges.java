package javaCollections;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
public class ArrayListChallenges {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList();
        addColors(list);
        method(list);
        ArrayList<Integer> c = new ArrayList<>(List.of(1, 2, 3));
        getNumber(c, 67);
        System.out.println(c);
        ArrayList<Integer> list1 = new ArrayList<>(List.of(1,2,3));
        ArrayList<Integer> list2 = new ArrayList<>(List.of(1,2,3));
        System.out.println(ArrayList4(list1, list2));
    }
    public static void addColors(ArrayList<String> list){
        list.add("Blue");
        list.add("Red");
        list.add("Green");
        list.add("Yellow");
        list.add("Orange");
    }
    public static void method(ArrayList<String> a){
        for(int i = 0; i < a.size(); i++){
            System.out.println(a.get(i));
        }
    }
    public static void getNumber(ArrayList<Integer> b, int num){
        b.add(0,num);
    }
    public static void ArrayList(ArrayList<Integer> d,int num, int value){
        d.set(num, value);
    }
    public static int ArrayList2(ArrayList<Integer> e, int num){
        for(int i = 0; i < e.size(); i++){
            if(num == e.get(i)){
                return i;
            }
        }
        return -1;
    }
    public static ArrayList<Integer> ArrayList3(ArrayList<Integer> f) {
        ArrayList<Integer> g = new ArrayList<>();
        for(int i = f.size() - 1; i >= 0; i--){
            g.add(f.get(i));
        }
        return g;
    }
    public static boolean ArrayList4(ArrayList<Integer> h, ArrayList<Integer> i){
        if(h.size() == i.size()) {
            for(int j = 0; j < h.size(); j++){
                if(!h.get(j).equals(i.get(j))){
                    return false;
                }
            }
            return true;
        }
        else{
            return false;
        }
    }
}
