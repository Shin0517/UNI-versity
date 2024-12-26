#include <stdio.h>
#define MAX_SIZE 101

void main(void){
    int i, n;
    int list[MAX_SIZE];
    printf("How many numbers u want in list? Enter: ");
    scanf("%d", &n);
    // exception
    if (n<2 || n>MAX_SIZE){
        printf("This value is not valid.");
    };
    // generate a random list
    printf("Unsorted list: ");
    for (i=0; i<n; i++){
        list[i] = rand() % 100;
        printf("%d ", &list[i]);
    }
    // sort the list
    sort(list, n);
    // print the sorted list
    printf("Sorted list: ");
    for (i=0; i<n; i++){
        printf("%d ", &list[i]);
    }
}
void sort(int list[], int n){
    int min, i, n, temp;
    min = list[0];
    for (i=1; i<n; i++){
        if (list[i] < min){
            // swap 
            temp = list[i];
            list[i] = min;
            min = temp;
        }
    }
}