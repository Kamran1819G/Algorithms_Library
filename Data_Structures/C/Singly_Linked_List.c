#include <stdio.h>
#include <stdlib.h>
struct node
{
    int data;
    struct node *link;
};
struct node *start = NULL;
struct node *createnode()
{
    struct node *t;
    t = (struct node *)malloc(sizeof(struct node));
    return (t);
}

// function to insert node to first position
void insertfirst()
{
    struct node *p;
    p = createnode();
    printf("\n Enter the number to insert: ");
    scanf("%d", &p->data);
    p->link = NULL;
    if (start == NULL)
    {
        start = p;
    }
    else
    {
        p->link = start;
        start = p;
    }
}

void deletionfirst()
{
    struct node *t;
    if (start == NULL)
    {
        printf("\n list is empty");
    }
    else
    {
        struct node *p;
        p = start;
        start = start->link;
        free(p);
    }
}

void viewlist()
{
    struct node *p;
    if (start == NULL)
    {
        printf("\n list is empty");
    }
    else
    {
        p = start;
        printf("\n Linked List : ");
        while (p != NULL)
        {
            printf("%d ", p->data);
            p = p->link;
        }
        printf("\n");
    }
}

int main()
{
    int n;
    do
    {
        printf("\n 1.Add value at first location.");
        printf("\n 2.View value.");
        printf("\n 3.Delete value at first location.");
        printf("\n 9.Exit");
        printf("\n Enter your choice: ");
        scanf("%d", &n);
        switch (n)
        {
        case 1:
            insertfirst();
            break;
        case 2:
            viewlist();
            break;
        case 3:
            deletionfirst();
            break;
        case 9:
            printf("\n Successfully Exited");
            exit(0);
        default:
            printf("\n Invaild Choice, please Try Again");
        }
    } while (n < 9);
    return 0;
}