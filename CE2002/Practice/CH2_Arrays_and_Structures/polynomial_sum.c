#include <stdio.h>
#include <stdlib.h>

#define MAX_TERMS 10
#define MAX_EXPONENT 200

typedef struct{
    int coefficient;
    int exponent;
} Term;

// add 
int add_polynomials(Term A[], int m, Term B[], int n, Term D[]){
    int i = 0, j = 0, k = 0;

    while(i < n && j < m){
        if(A[i].exponent > B[j].exponent){
            D[k++] = A[i++];
        } else if(A[i].exponent < B[j].exponent){
            D[k++] = B[j++];
        } else{
            int sum = A[i].coefficient + B[j].coefficient;
            if(sum != 0 || A[i].exponent == 0){
                D[k].coefficient = sum;
                D[k].exponent = A[i].exponent;
                k++;
            }
            i++;
            j++;
        }
    }
    while (i < n) {
        D[k++] = A[i++];
    }

    while (j < m) {
        D[k++] = B[j++];
    }
    return k;
}

// print
void print_polynomial(Term terms[], int count){
    int has_no_zero = 0;
    for(int i = 0; i < count ; i++){
        if(terms[i].coefficient != 0){
            has_no_zero = 1;
            if(terms[i].coefficient >= 0 && i > 0){
                printf("+");
            }
            if(terms[i].exponent == 0){
                printf("%d", terms[i].coefficient);
            } else if(terms[i].exponent == 1){
                if(terms[i].coefficient == 1){
                    printf("x");
                } else if(terms[i].coefficient == -1){
                    printf("-x");
                } else{
                    printf("%dx", terms[i].coefficient);
                }
            } else{
                if(terms[i].coefficient == 1){
                    printf("x^%d", terms[i].exponent);
                } else if(terms[i].coefficient == -1){
                    printf("-x^%d", terms[i].exponent);
                } else{
                    printf("%dx^%d", terms[i].coefficient, terms[i].exponent);
                }
            }
        }
    }
    if(!has_no_zero){
        printf("0");
    }
    printf("\n");
}

// main
int main(){
    Term A[MAX_TERMS], B[MAX_TERMS], D[MAX_TERMS];
    int m, n;

    scanf("%d", &m);
    for(int i = 0; i < m; i++){
        scanf("%d %d", &A[i].coefficient, &A[i].exponent);
    }
    printf("Polynomial A: ");
    print_polynomial(A, m);

    scanf("%d", &n);
    for(int i = 0; i < n; i++){
        scanf("%d %d", &B[i].coefficient, &B[i].exponent);
    }
    printf("Polynomial B: ");
    print_polynomial(B, n);

    int result_count = add_polynomials(A, m, B, n, D);
    printf("Resultant Polynomial: ");
    print_polynomial(D, result_count);

    return 0;
}