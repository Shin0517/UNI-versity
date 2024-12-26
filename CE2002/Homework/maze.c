#include <stdio.h>
#define MAX 102

typedef struct {
    int row;
    int col;
    int direction;
} Node;

int directions[4][2] = {{0, 1}, {1, 0}, {0, -1}, {-1, 0}};

int n, m;
int maze[MAX][MAX];
Node stack[MAX * MAX];
int top = -1;

void push(int row, int col, int direction) {
    stack[++top].row = row;
    stack[top].col = col;
    stack[top].direction = direction;
}

void pop() {
    if (top >= 0) {
        top--;
    }
}

int isExit(int x, int y) {
    return (x == n && y == m);
}

int search(int x, int y) {
    maze[x][y] = 1;
    push(x, y, -1); 

    if (isExit(x, y)) {
        return 1;
    }

    for (int i = 0; i < 8; i++) {
        int nx = x + directions[i][0];
        int ny = y + directions[i][1];

        if (nx >= 0 && nx <= n + 1 && ny >= 0 && ny <= m + 1 && maze[nx][ny] == 0) {
            if (search(nx, ny)) {
                return 1; 
            }
        }
    }

    pop();
    return 0;
}

int main() {
    scanf("%d %d", &n, &m);
    for (int i = 0; i < n + 2; i++) {
        for (int j = 0; j < m + 2; j++) {
            if (i == 0 || i == n + 1 || j == 0 || j == m + 1) {
                maze[i][j] = 1;
            } else {
                scanf("%d", &maze[i][j]);                
            }
        }
    }

    if (search(1, 1)) {
        for (int i = 0; i <= top; i++) {
            if (i > 0) {
                printf(" ");
            }
            printf("(%d,%d)", stack[i].row - 1, stack[i].col - 1);
        }
    } else {
        printf("Can't reach the exit");
    }
    return 0;
}