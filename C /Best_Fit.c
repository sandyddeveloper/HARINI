#include <stdio.h>

int main() {
    int block[10], process[10], alloc[10];
    int b, p, i, j, best;

    printf("Blocks: ");
    scanf("%d", &b);
    for (i = 0; i < b; i++) {
        printf("Size of block %d: ", i + 1);
        scanf("%d", &block[i]);
    }

    printf("Processes: ");
    scanf("%d", &p);
    for (i = 0; i < p; i++) {
        printf("Size of process %d: ", i + 1);
        scanf("%d", &process[i]);
        alloc[i] = -1;
    }

    for (i = 0; i < p; i++) {
        best = -1;
        for (j = 0; j < b; j++) {
            if (block[j] >= process[i]) {
                if (best == -1 || block[j] < block[best])
                    best = j;
            }
        }
        if (best != -1) {
            alloc[i] = best;
            block[best] -= process[i];
        }
    }

    printf("\nProcess\tSize\tBlock\n");
    for (i = 0; i < p; i++) {
        printf("%d\t%d\t", i + 1, process[i]);
        if (alloc[i] != -1)
            printf("%d\n", alloc[i] + 1);
        else
            printf("Not Allocated\n");
    }

    return 0;
}
