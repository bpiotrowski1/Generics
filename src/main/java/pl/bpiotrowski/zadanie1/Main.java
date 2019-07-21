package pl.bpiotrowski.zadanie1;

public class Main {
    public static void main(String[] args) {
        Para<String> para = new Para<>("lewy but", "prawy but");
        System.out.println(para);

        Integer[] table = {1, 2, 3, 4, 5, 6};
        NElementow<Integer> nElementow = new NElementow<Integer>(table);
        System.out.println(nElementow);
    }
}
