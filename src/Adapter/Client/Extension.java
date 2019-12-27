package Adapter.Client;

import Adapter.Client.DownloadedFramework.MyMathLib;
import Adapter.Framework.IMath;

public class Extension extends MyMathLib implements IMath {
    @Override
    public int[] sort(int[] arr) {
        return quickSort(arr);
    }

    @Override
    public void print(int[] arr) {
        int size = arr.length;
        for (int i = 0; i < size; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}
