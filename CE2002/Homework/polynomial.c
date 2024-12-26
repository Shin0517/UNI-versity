#include <stdio.h>
#include <stdlib.h>

#define MAX_TERMS 10

typedef struct {
    int coefficient;
    int exponent;
} Term;

void print_polynomial(Term terms[], int count) {
    int has_no_zero = 0;  
    for (int i = 0; i < count; i++) {
        if (terms[i].coefficient != 0) {
            has_no_zero = 1;  
            if (terms[i].coefficient > 0 && i > 0) {
                printf("+");
            }

            if (terms[i].exponent == 0) {
                printf("%d", terms[i].coefficient);
            } else if (terms[i].exponent == 1) {
                if (terms[i].coefficient == 1) {
                    printf("x");
                } else if (terms[i].coefficient == -1) {
                    printf("-x");
                } else {
                    printf("%dx", terms[i].coefficient);
                }
            } else {
                if (terms[i].coefficient == 1) {
                    printf("x^%d", terms[i].exponent);
                } else if (terms[i].coefficient == -1) {
                    printf("-x^%d", terms[i].exponent);
                } else {
                    printf("%dx^%d", terms[i].coefficient, terms[i].exponent);
                }
            }
        }
    }
    
    if (!has_no_zero) {
        printf("0");
    }

    printf("\n");
}

int add_polynomial(Term A[], int n, Term B[], int m, Term D[]) {
    int i = 0, j = 0, k = 0;

    while (i < n && j < m) {
        if (A[i].exponent > B[j].exponent) {
            D[k++] = A[i++];
        } else if (A[i].exponent < B[j].exponent) {
            D[k++] = B[j++];
        } else {
            int sum = A[i].coefficient + B[j].coefficient;
            if (sum != 0 || A[i].exponent == 0) {
                D[k].coefficient = sum;
                D[k
                ].exponent = A[i].exponent;
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

int main() {
    int n, m;
    Term A[MAX_TERMS], B[MAX_TERMS], D[MAX_TERMS];

    scanf("%d", &n);
    if (n <= 0 || n >= 10) {
        printf("Error, terms overflow.\n");
        return 1;
    }

    for (int i = 0; i < n; i++) {
        scanf("%d %d", &A[i].coefficient, &A[i].exponent);

        if (A[i].coefficient < -1000 || A[i].coefficient > 1000) {
            printf("Error, coefficient overflow.\n");
            return 1;
        }
        if (A[i].exponent < 0 || A[i].exponent > 100) {
            printf("Error, exponent overflow.\n");
            return 1;
        }
    }

    scanf("%d", &m);
	if (m <= 0 || m >= 10) {
        printf("Error, terms overflow.\n");
        return 1;
    }

    for (int i = 0; i < m; i++) {
        scanf("%d %d", &B[i].coefficient, &B[i].exponent);
        
        if (B[i].coefficient < -1000 || B[i].coefficient > 1000) {
            printf("Error, coefficient overflow.\n");
            return 1;
        }
        if (B[i].exponent < 0 || B[i].exponent > 100) {
            printf("Error, exponent overflow.\n");
            return 1;
        }
    }

    print_polynomial(A, n);
    print_polynomial(B, m);

    int result_count = add_polynomial(A, n, B, m, D);
    print_polynomial(D, result_count);

    return 0;
}