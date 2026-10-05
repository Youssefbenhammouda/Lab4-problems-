package problem2;

import java.util.Arrays;

public class IntegerList
{
    int[] list; //values in the list
    private int size = 0;
    //-------------------------------------------------------
//create a list of the given size
//-------------------------------------------------------
    public IntegerList(int size)
    {
        list = new int[size];this.size=size;
    }
    //-------------------------------------------------------
//fill array with integers between 1 and 100, inclusive
//-------------------------------------------------------
    public void randomize()
    {
        for (int i=0; i<size; i++)
            list[i] = (int)(Math.random() * 100) + 1;
    }
    //-------------------------------------------------------
//print array elements with indices
//-------------------------------------------------------
    public void print()
    {
        for (int i=0; i<size; i++)
            System.out.println(i + ":\t" + list[i]);
    }

    public int getSize() {
        return size;
    }
    public int getCapacity() {
        return list.length;
    }

    public void increaseSize(){
        int[] newList = new int[2*list.length];
        System.arraycopy(list,0,newList,0,list.length);
        list = newList;
    }
    void addElement(int newVal){
        if(size == list.length){
            increaseSize();
        }
        list[size++] = newVal;
    }

    void removeFirst(int val){
        int occIdx = -1;
        for (int i = 0; i <size ; i++) {

              if(occIdx < 0 &&  list[i]==val) {
                  occIdx = i;
                  size--;

              }
               if(occIdx>=0){
                  list[i] = list[i+1];

              }
            
        }
    }
    void removeAll(int val){
        int occs = 0;
        int k = 0;

        for (int i = 0; i < size; i++) {
            if(list[i]!=val){
                int temp = list[i];
                list[i] = list[occs];
                list[occs] = temp;
                occs++;
            }else k++;

        }
        size -= k;

    }
}