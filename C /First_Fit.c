#include <stdio.h>

int main() {
    int b[10], p[10], nb, np, i, j, a[10] = {0};
    printf("Blocks: "); scanf("%d", &nb);
    for (i = 0; i < nb; i++) scanf("%d", &b[i]);

    printf("Processes: "); scanf("%d", &np);
    for (i = 0; i < np; i++) scanf("%d", &p[i]);

    for (i = 0; i < np; i++) {
        for (j = 0; j < nb; j++) {
            if (b[j] >= p[i] && !a[j]) {
                printf("P%d -> B%d\n", i + 1, j + 1);
                a[j] = 1;
                break;
            }
        }
        if (j == nb) printf("P%d -> Not Allocated\n", i + 1);
    }
    return 0;
}
