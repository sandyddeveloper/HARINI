#include <stdio.h>

int main() {
    int blocks[10], processes[10];
    int bSize[10], pSize[10];
    int i, j, nBlocks, nProcs, flag[10] = {0};

    printf("Enter number of memory blocks: ");
    scanf("%d", &nBlocks);
    for (i = 0; i < nBlocks; i++) {
        printf("Size of block %d: ", i + 1);
        scanf("%d", &bSize[i]);
    }
    printf("\nEnter number of processes: ");
    scanf("%d", &nProcs);
    for (i = 0; i < nProcs; i++) {
        printf("Size needed by process %d: ", i + 1);
        scanf("%d", &pSize[i]);
    }
    printf("\nProcess\tBlock\n");
    for (i = 0; i < nProcs; i++) {
        int max = -1;
        for (j = 0; j < nBlocks; j++) {
            if (bSize[j] >= pSize[i]) {
                if (max == -1 || bSize[j] > bSize[max])
                    max = j;
            }
        }
        if (max != -1) {
            printf("%d\t%d\n", i + 1, max + 1);
            bSize[max] -= pSize[i];
            flag[i] = 1;
        }
    }

    printf("\nUnallocated Processes:\n");
    for (i = 0; i < nProcs; i++) {
        if (flag[i] == 0)
            printf("Process %d\n", i + 1);
    }

    return 0;
}
