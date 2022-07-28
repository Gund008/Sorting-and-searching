import java.lang.*;
import java.util.*;

class sorting11
{
    public static void main(String arg[])
    {
        Scanner sobj=new Scanner(System.in);

        System.out.println("Enter the size of array:");
        int isize=sobj.nextInt();

        Array aobj=new Array(isize);
        aobj.Accept();
        aobj.Display();

        aobj.SelectionSort();
        System.out.println("data after sorting");
        aobj.Display();

    }
}


interface  MarvellousSort     
{
    public void Accept();    //public ,static, abstarct
    public void Display();
    public void BubbleSort();
    public void InsertionSort();
    public void SelectionSort();
}

class Array implements MarvellousSort
{
    public int Arr[]; //array  declaration(int Arr[]=new int[isize])

    public Array(int isize)   
    {
       Arr=new int[isize];
    }

    public void Accept()    
    {
        Scanner sobj=new Scanner(System.in);

        System.out.println("Enter the number");
        
        for(int i=0;i<Arr.length;i++)
        {
            Arr[i]=sobj.nextInt();
        }
    }
 
    public void Display()  
    {
        System.out.println("Enter the element are:");
        for(int i=0;i<Arr.length;i++)
        {
            System.out.println(Arr[i]);
        }
    }

public void SelectionSort()
   {
        int i = 0, j = 0, min_index = 0, temp = 0;

        for(i = 0; i < Arr.length-1; i++)     // 1
        {
            min_index = i;
            for(j = i+1; j < Arr.length; j++)     // 2
            {
                if(Arr[min_index] > Arr[j])
                {
                    min_index = j;
                }
            }
            if(i != min_index)
            {
                temp = Arr[i];
                Arr[i] = Arr[min_index];
                Arr[min_index] = temp;
            }
        }
   }
}

 