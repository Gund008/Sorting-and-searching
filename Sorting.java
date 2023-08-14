import java.lang.*;
import java.util.*;

class program372
{
    public static void main(String arg[])
    {
        Scanner  sobj=new Scanner(System.in);   
        System.out.println("Enter the size of array:");
        int isize=sobj.nextInt();   

        Searching aobj=new Searching(isize);
        aobj.Accept();
        aobj.Display();

        System.out.println("Enter the element that you want to search");
        int ivalue=sobj.nextInt();   

        int iret=aobj.BinarySearch(ivalue);  
        if(iret==-1)
        {
            System.out.println("There is no  such element");
        }
        else
        {
            System.out.println("Element is There in the array at index:"+iret);

        }
    }
}

 //1(Class)
class Array
{
    public int Arr[];   

    public Array(int isize)   
        Arr=new int[isize];    
    } 

    protected void finalize()   
    {
        Arr=null;
    }

    public void Accept()  //method(setter)
    {
        Scanner sobj=new Scanner(System.in);   
        System.out.println("Enter elements");
        for(int i=0;i<Arr.length;i++)    
        {
            Arr[i]=sobj.nextInt();  //11,2,3,4,5
        }
    }
    public void Display()   //getter
    {
        System.out.println("Elements from array are:");

        for(int i=0;i<Arr.length;i++)
        {
            System.out.println(Arr[i]);
        }
    }
}

//2(Class)
 class Searching extends Array
 {
    public Searching(int isize)
    {
        super(isize);   
    }

 public int BiDirectionalSearch(int ino)   
 {
    int iStart=0;
    int iEnd=Arr.length-1;   
    int ipos=-1;

    while(iStart<=iEnd)    
    {
        if(Arr[iStart]==ino)
        {
            ipos=iStart;
            break;
        }
        if(Arr[iEnd]==ino)
        {
            ipos=iStart;
            break;
        }
        iStart++;
        iEnd--;
    }
    return ipos;
 }


 public int LinearSearch(int ino)   
 
 {
    int i=0;
    for(i=0;i<Arr.length;i++)
    {
        if(Arr[i]==ino)
        {
            break;
        }
    }
    if(i==Arr.length)
    {
        return -1;
    }
    else
    {
        return i;
    }
 }

 public int BinarySearch(int ino) //method
 {
    int iStart=0;
    int iEnd=Arr.length-1;
    int iMiddle=0;

    while(iStart<=iEnd)
    {
        iMiddle=(iStart+iEnd)/2;
        if(Arr[iMiddle]==ino)
        {
            break;
        }
        if(ino>Arr[iMiddle])
        {
          iStart=iMiddle+1;
        }
        else if(ino<Arr[iMiddle])
        {
            iEnd=iMiddle-1;
        }
    }
    if(Arr[iMiddle]==ino)
    {
        return iMiddle;
    }
    else
    {
        return -1;
    }
 }
 }
