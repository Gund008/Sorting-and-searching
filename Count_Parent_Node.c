#include<stdio.h>
#include<stdlib.h>
#include<stdbool.h>

struct node
{
    int data;
    struct node *lchild;
    struct node *rchild;
};
typedef struct node NODE;
typedef struct node *PNODE;
typedef struct node **PPNODE;

void Insert(PPNODE Root,int No)
{
    PNODE newn=NULL;
    newn=(PNODE)malloc(sizeof(NODE));

    newn->data=No;
    newn->lchild=NULL;
    newn->rchild=NULL;

    PNODE temp=*Root;

    if(*Root==NULL)
    {
        *Root=newn;
    }
    else
    {
        while(1)
        {
            if(No > temp->data)
            {
                if(temp->rchild==NULL)
                {
                    temp=temp->rchild;
                    break;
                }
                temp=temp->rchild;
            }
            else if(No < temp->data)
            {
                if(temp->lchild==NULL)
                {
                    temp=temp->lchild;
                    break;
                }
                temp=temp->lchild;
            }
            else if(No==temp->data)
            {
                free(newn);
                printf("Duplicate Elemnts not Allowed");
                
            }
        }

    }
}

////////////////////////////////////////////////////////////////////////////////////

void Preorder(PNODE Root)
{
    if(Root!=NULL)
    {
        printf("%d\t",Root->data);
        Preorder(Root->lchild);
        Preorder(Root->rchild);
    }
}
/////////////////////////////////////////////////////////////////////////////////
void Postorder(PNODE Root)
{
    if(Root!=NULL)
    {
        Postorder(Root->lchild);
        Postorder(Root->rchild);
        printf("%d\t",Root->data);
    }
}

/////////////////////////////////////////////////////////////////////////////////////

void Inorder(PNODE Root)
{
    if(Root!=NULL)
    {
        Inorder(Root->lchild);
        printf("%d\t",Root->data);
        Inorder(Root->rchild);
    }
}

/////////////////////////////////////////////////////////////////////////////////////

int CountParentNode(PNODE Root)
{
    static int Count=0;

    if(Root!=NULL)
    {
        if((Root->lchild!=NULL) && (Root->rchild!=NULL))
        {
            Count++;
        }
        CountParentNode(Root->lchild);
        CountParentNode(Root->rchild);
    }
}

////////////////////////////////////////////////////////////////////////////////////

int main()
{
    PNODE Head=NULL;
    bool bret=false;
    int iRet=0;
    
    Insert(&Head,11);
    Insert(&Head,31);
    Insert(&Head,21);

    iRet=CountParentNode(Head);
    printf("Number of Parent Node are:%d\n",iRet);

    return 0;

}