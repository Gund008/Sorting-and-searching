#include<iostream>
#include<algorithm>

using namespace std;

int partition(int arr[],int iStart,int iEnd)
{
    int iPivot=arr[iStart];
    int iCount=0;

    for(int i=iStart + 1;i<=iEnd;i++)
    {
        if(arr[i] <= iPivot)
        {
            iCount++;
        }
    }
    //Giving pivot element its correct Position
    int iPivotIndex=iStart + iCount;
    swap(arr[iPivotIndex],arr[iStart]);
    
    int i=iStart,j=iEnd;

    while ((i < iPivotIndex) && (j > iPivotIndex))
    {
        while (arr[i] > iPivot)
        {
            i++;
        }
        while (arr[j] > iPivot)
        {
            j--;
        }
        if((i < iPivotIndex ) && (j > iPivotIndex))
        {
            swap(arr[i++], arr[j--]);
        }
    }
    return iPivotIndex;
}

void quickSort(int arr[],int iStart,int iEnd)
{
    //filter
    if(iStart >= iEnd)
    {
        return;
    }

    //Helper Function
    int p=partition(arr,iStart,iEnd);
    
    //sorting left part
    quickSort(arr, p+1,iEnd);
}


int main()
{
    int arr[]={1,5,8,9,6,7,4,2,0};
    int n=10; //size

    quickSort(arr,0,n-1);

    cout<<"Array after using quick sort:"<<endl;
    for(int i=0;i<n;i++)
    {
        cout<<arr[i]<<endl;
    }

    return 0;

}