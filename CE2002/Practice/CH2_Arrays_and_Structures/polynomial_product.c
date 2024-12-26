#include <stdio.h>
#include <stdlib.h>

#define MAX_TERMS 100
#define MAX_EXPONENT 1000

typedef struct{
    int coefficient;
    int exponent;
} Term;

int product_polynomials(Term A[], int m, Term B[], int n, Term D[]){
    int coefficients[MAX_EXPONENT + 1] = {0};
    for(int i = 0; i < m; i++){
        for(int j = 0; j < n; j++){
            int exponent_sum = A[i].exponent + B[j].exponent;
            int coefficient_product = A[i].coefficient * B[j].coefficient;
            coefficients[exponent_sum] += coefficient_product;
        }
    }

    int k = 0;
    for(int i = MAX_EXPONENT; i >= 0; i--){
        if(coefficients[i] != 0){
            D[k].coefficient = coefficients[i];
            D[k].exponent = i;
            k++;
        }
    }
    return k;
}

void print_polynomial(Term terms[], int count){
    int has_no_zero = 0;
    for(int i = 0; i < count; i++){
        if(terms[i].coefficient != 0){
            has_no_zero = 1;
            if(terms[i].coefficient > 0 && i > 0){
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
                    printf("-x^%d",terms[i].exponent);
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

int main(){
    Term A[MAX_TERMS], B[MAX_TERMS], D[MAX_TERMS*2];
    int m, n;
    scanf("%d", &m);
    for(int i = 0; i < m; i++){
        scanf("%d %d", &A[i].coefficient, &A[i].exponent);
    }
    scanf("%d", &n);
    for(int i = 0; i < n; i++){
        scanf("%d %d", &B[i].coefficient, &B[i].exponent);
    }

    printf("Polynomial A: ");
    print_polynomial(A, m);
    printf("Polynomial B: ");
    print_polynomial(B, n);

    int result_count = product_polynomials(A, m, B, n, D);
    printf("Resultant Polynomials: ");
    print_polynomial(D, result_count);

    return 0;
}