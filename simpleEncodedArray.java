import javax.sound.midi.Soundbank;

public class simpleEncodedArray {
    public static void main(String[] args) {
        //Original array = {2, 5, 1, 7, 9, 3} Encoded array = {3, -4, 6, 2, -6, 3}
        int arr[] = {2, 5, 1, 7, 9, 3};

        for (int i : arr)
            System.out.print(i+" ");
        System.out.println("");
        for (int i = 0; i < arr.length - 1; i++) {
            arr[i] = arr[i + 1] - arr[i];
        }

        for (int i : arr)
            System.out.print(i+" ");
    }
}
