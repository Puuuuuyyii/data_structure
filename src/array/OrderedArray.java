package array;


import java.util.Stack;

public class OrderedArray implements Ordered {
    private int[] array;
    private int length;
    private int defaultSize = 10;
    public OrderedArray() {
        array = new int[defaultSize];
        length = 0;
    }

    public OrderedArray(int max) {
        array = new int[max];
        length = 0;
    }

    @Override
    public void insert(int insertEle) {
        if (length == array.length){
            int[] newArray = new int[length + 10];
            for (int i = 0; i < array.length; i ++){
                newArray[i] = array[i];
            }
            array = newArray;
        }
        array[length] = insertEle;
        length ++;
    }

    @Override
    public void insertByOrder(int insertEle) {
        length ++;
        if (length == array.length){
            int[] newArray = new int[length + 10];
            for (int i = 0; i < array.length; i ++){
                newArray[i] = array[i];
            }
            array = newArray;
        }
        int j;
            for (j = 0; j < length - 1; j++){
                if (array[j] > insertEle){
                    break;
                }
            }
            for(int k = length - 1; k > j; k --){
                array[k] = array[k - 1];
        }
        array[j] = insertEle;
    }

    @Override
    public boolean select(int selectEle) {
        int i;
        for (i = 0; i < length; i++){
            if (selectEle == array[i]){
                break;
            }
        }
        if (i == length){
            return false;
        }else {
            return true;
        }
    }

    @Override
    public boolean delete(int deleteEle) {
        int i;
        for (i = 0; i < length; i++) {
            if (deleteEle == array[i]) {
                break;
            }
        }
        if (i == length){
            return false;
        }else {
            for (int j = i; j < length - 1; j++) {
                array[j] = array[j + 1];
            }
            length --;
            return true;
        }
    }

    @Override
    public void update(int oldInt, int newInt) {
        int i;
        for (i = 0; i < length; i++){
            if (oldInt == array[i]){
                array[i] = newInt;
            }
        }
    }

    @Override
    public void display(){
        for (int i = 0; i < length; i++){
            System.out.print(array[i] + "  ");
        }
        System.out.println();
    }

    @Override
    public boolean binarySearch(int integer) {
        int lowerBound = 0;
        int upperBound = length - 1;
        int current;
        while(true) {
            current = (lowerBound + upperBound)/2;
            if (array[current] == integer){
                return true;
            }else
            if (lowerBound > upperBound){
                return false;
            }else {
                if (array[current] < integer){
                    lowerBound = current + 1;
                }else {
                    upperBound = current - 1;
                }
            }
        }
    }

    @Override
    public int size() {
        return length;
    }

    @Override
    public int getMax() {
        return array[length - 1];
    }

    @Override
    public void removeMax() {
        delete(array[length - 1]);
    }

    @Override
    public void bubbleSort(){
        if (length != 0){
            for (int i = 0; i < length; i++){
                for (int j = 0; j < length - i - 1; j ++){
                    if (array[j] > array[j + 1]){
                        int temp = array[j];
                        array[j] = array[j + 1];
                        array[j + 1] = temp;
                    }
                }
            }
        }
    }

    @Override
    public void doubleBubbleSort() {
        int left = 1;
        int right = length - 1;
        int j = 0;
        while (left <= right){
            for (int i = right; i >= left; i--){
                if (array[i] < array[i -1]) {
                    int temp = array[i];
                    array[i] = array[i - 1];
                    array[i - 1] = temp;
                    j = i;
                }
            }
            left = j + 1;
            for (int i = left; i < right + 1; i++){
                if (array[i] < array[i - 1]){
                    int temp = array[i];
                    array[i] = array[i - 1];
                    array[i - 1] = temp;
                    j = i;
                }
            }
            right = j - 1;
        }
    }

    @Override
    public void simpleSelectSort() {
        for (int i = 0; i < length - 1; i ++){
            for (int j = i + 1; j < length; j ++){
                if (array[i] > array[j]){
                    int temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }
    }

    @Override
    public void shellSort() {
        int inner, outer;
        int temp;
        int h = 1;
        while (h <= length / 3){
            h = h * 3 + 1;
        }
        while (h > 0){
            for (outer = h; outer < length; outer ++){
                temp = array[outer];
                inner = outer;
                while (inner > h - 1 && array[inner - h] >= temp){
                    array[inner] = array[inner - h];
                    inner -= h;
                }
                array[inner] = temp;
                for (int i = 0; i < length; i ++){
                    System.out.print(array[i] + " ");
                }
                System.out.println();
            }
            h = (h - 1) / 3;
        }
    }

    @Override
    public void quickSort(int base_number, int last_index) {
        if (base_number < last_index){
            int i = base_number, j = last_index, x = array[base_number];
            while (i < j){
                while (i < j && array[j] >= x){
                    j --;
                }
                if (i < j){
                    array[i ++] = array[j];
                }
                while (i < j && array[i] < x){
                    i ++;
                }
                if (i < j){
                    array[j --] = array[i];
                }

                array[i] = x;
                quickSort(base_number, i - 1);
                quickSort(i + 1, last_index);
            }
        }
        /*if (base_number < last_index){
            int i = partition(base_number, last_index);
            quickSort(base_number, i-1);
            quickSort(i + 1, base_number);
        }*/
    }
    private void swap(int num1, int num2){
        int temp = num1;
        num1 = num2;
        num2 = temp;
    }
    private int partition(int l, int r){
        int i = l, j = r;
        int x = array[l];
        while (i < j){
            while (i < j && array[j] >= x){
                j --;
            }
            if (i < j){
                array[i] = array[j];
                i ++;
            }
            while (i < j && array[i] < x){
                i ++;
            }
            if (i < j){
                array[j] = array[i];
                j --;
            }
        }
        array[i] = x;
        return i;
    }
}
