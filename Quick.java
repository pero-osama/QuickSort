/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package quick;

import java.util.ArrayList;
import static quick.QuickSortExample.fillArray;
import static quick.QuickSortExample.print;
import static quick.QuickSortExample.quickSort;

/**
 *
 * @author Qaiaty Store
 */
public class Quick {

    /**
     * @param args the command line arguments
     */
     public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();
        fillArray(arr);
        quickSort(arr, 0, arr.size() - 1);
        print(arr);
    }
    
}
