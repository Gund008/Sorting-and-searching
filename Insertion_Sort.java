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

        aobj.InsertionSort();
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
 
    public void Display()  //return type void
    {
        System.out.println("Enter the element are:");
        for(int i=0;i<Arr.length;i++)
        {
            System.out.println(Arr[i]);
        }
    }

 public void InsertionSort()
 {
    int i=0;
    int j=0;
    int selected=0;
    for(i=0;i<Arr.length;i++)
    {
        for(j=i-1,selected=Arr[i];(j>=0)&&(Arr[j]>selected);j--)
        {
            Arr[j+1]=Arr[j];
        }
        Arr[j+1]=selected;
    }
 }
}
