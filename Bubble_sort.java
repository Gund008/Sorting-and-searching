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

        aobj.BubbleSort();
        System.out.println("data after sorting");
        aobj.Display();

    }
}


interface  MarvellousSort    //interface like class blueprint 
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

 public void BubbleSort()
 {}
    public void BubbleSort(char type)
    {
        int i=0;
        int j=0;
        int temp=0;

        boolean Swap=false;

        if(type=='I'  || type=='i')
        {
            for(i=0;i<Arr.length;i++)
            {

                Swap=false;
                for(j=0;j<Arr.length;j++)
                {
                    if(Arr[j]>Arr[j+1])
                    {
                        temp=Arr[j];
                        Arr[j]=Arr[j+1];
                        Arr[j+1]=temp;
                        Swap=true;
                    }

                }
                System.out.println("pass:"+(i+1));
                Display();
                if(Swap==false)
                {
                    break;
                }
            }
        }
        else if(type=='d'  || type=='D')
        {
            for(i=0;i<Arr.length;i++)
            {
                Swap=false;
                for(j=0;j<Arr.length-i-1;j++)
                {
                    if(Arr[j]<Arr[j+1])
                    {
                        temp=Arr[j];
                        Arr[j]=Arr[j+1];
                        Arr[j+1]=temp;
                        Swap=true;
                    }
                }
                System.out.println("pass:"+(i+1));
                Display();
                if(Swap==false)
                {
                    break;
                }
            }
        }
    }
    
    
