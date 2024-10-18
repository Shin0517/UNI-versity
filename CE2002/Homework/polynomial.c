#include <stdio.h>

#define MAX_TERMS 10
#define MAX_DEGREE 101

typedef struct {
    int coefficient; // 係數
    int exponent; // 指數
} Term;

void print_polynomial(Term terms[], int count) {
    int beginning = 1;
    for (int i = 0; i < count; i++) {
        if (terms[i].coefficient == 0) {
            continue; 
        }

        if (terms[i].coefficient > 0 && !beginning) {
            printf("+");
        }

        if (terms[i].exponent == 0) {
            printf("%d", terms[i].coefficient);  // 移除 `&`
        } 
        else if (terms[i].exponent == 1) {
            if (terms[i].coefficient == 1) {
                printf("x");
            } else if (terms[i].coefficient == -1) {
                printf("-x");
            } else {
                printf("%dx", terms[i].coefficient);
            }
        }
        else {
            if (terms[i].coefficient == 1) {
                printf("x^%d", terms[i].exponent);
            } else if (terms[i].coefficient == -1) {
                printf("-x^%d", terms[i].exponent);
            } else {
                printf("%dx^%d", terms[i].coefficient, terms[i].exponent);
            }
        }
        beginning = 0; 
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
            if (sum != 0) {
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

int main() {
    int n, m;
    Term A[MAX_TERMS], B[MAX_TERMS], D[MAX_TERMS];
    
    scanf("%d", &n);
    for (int i = 0; i < n; i++) {
        scanf("%d %d", &A[i].coefficient, &A[i].exponent);
    }

    scanf("%d", &m);
    for (int i = 0; i < m; i++) {
        scanf("%d %d", &B[i].coefficient, &B[i].exponent);
    }

    print_polynomial(A, n);
    print_polynomial(B, m);
    int result_count = add_polynomial(A, n, B, m, D);
    print_polynomial(D, result_count);

    return 0;
}
