#include <stdio.h>

int main() {
    int alloc[10][10], max[10][10], need[10][10], avail[10];
    int finish[10] = {0}, safeSeq[10], req[10];
    int n, r, i, j, k, count = 0, ready;

    printf("Enter number of processes: ");
    scanf("%d", &n);
    printf("Enter number of resources: ");
    scanf("%d", &r);

    printf("Enter allocation matrix:\n");
    for (i = 0; i < n; i++)
        for (j = 0; j < r; j++)
            scanf("%d", &alloc[i][j]);

    printf("Enter max matrix:\n");
    for (i = 0; i < n; i++)
        for (j = 0; j < r; j++) {
            scanf("%d", &max[i][j]);
            need[i][j] = max[i][j] - alloc[i][j];
        }

    printf("Enter available resources:\n");
    for (i = 0; i < r; i++)
        scanf("%d", &avail[i]);

    // Banker's Algorithm
    while (count < n) {
        int found = 0;
        for (i = 0; i < n; i++) {
            if (!finish[i]) {
                ready = 1;
                for (j = 0; j < r; j++) {
                    if (need[i][j] > avail[j]) {
                        ready = 0;
                        break;
                    }
                }

                if (ready) {
                    for (j = 0; j < r; j++)
                        avail[j] += alloc[i][j];

                    safeSeq[count++] = i;
                    finish[i] = 1;
                    found = 1;
                }
            }
        }

        if (!found) {
            printf("System is in unsafe state.\n");
            return 0;
        }
    }

    printf("Safe sequence: ");
    for (i = 0; i < n; i++)
        printf("P%d ", safeSeq[i]);
    printf("\n");

    return 0;
}