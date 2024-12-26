#include<stdio.h>
#include<stdlib.h>

typedef struct ITZY{
    int value;
    struct ITZY *next;
}ITZY;

void deletion(ITZY **head){
    ITZY *temp = *head, *follow = NULL;

    int find;
    printf("To be deleted: ");
    scanf("%d", &find);

    if(*head == NULL){
        printf("linked list empty!");
        return;
    }

    if((*head)->value == find){
        *head = (*head)->next;
        free(temp);

        printf("Age of ITZY after deletion: ");
        ITZY *current = *head;
        while(current != NULL){
            printf("%d ", current->value);
            current = current->next;
        }
        return;
    }

    while(temp != NULL && temp->value != find){
        follow = temp;
        temp = temp->next;
    }

    if (temp == NULL){
        printf("Not exist.");
    } 

    follow->next = temp->next;
    free(temp);
    

    printf("Age of ITZY after deletion: ");
    ITZY *current = *head;
    while(current != NULL){
        printf("%d ", current->value);
        current = current->next;
    }
}

int main(){
    int count, age;
    struct ITZY *head = (struct ITZY *)malloc(sizeof(ITZY)); 
    printf("what's the age: ");
    scanf("%d", &age);
    head->value = age;
    head->next = NULL;

    printf("How many members: ");
    scanf("%d", &count);

    ITZY *current = head;
    for(int i = 0; i < count-1; i++){
        printf("what's the age: ");
        scanf("%d", &age);

        current->next =  (struct ITZY *)malloc(sizeof(ITZY));
        current = current->next;
        current->value = age;
        current->next = NULL;
    }

    printf("Age of ITZY: ");
    current = head;
    while(current != NULL){
        printf("%d ", current->value);
        current = current->next;
    }
    printf("\n");

    deletion(&head);    
}