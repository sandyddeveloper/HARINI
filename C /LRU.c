#include <stdio.h>

int main() {
    int n, f, pages[50], frames[10], age[10], i, j, k, hit, faults = 0;

    printf("LRU Page Replacement\nEnter pages: ");
    scanf("%d", &n);
    printf("Reference string: ");
    for (i = 0; i < n; i++) scanf("%d", &pages[i]);
    printf("Frames: ");
    scanf("%d", &f);

    for (i = 0; i < f; i++) frames[i] = -1;

    for (i = 0; i < n; i++) {
        hit = 0;

        for (j = 0; j < f; j++) {
            if (frames[j] == pages[i]) { hit = 1; break; }
        }

        if (!hit) {
            faults++;
            for (j = 0; j < f; j++) {
                age[j] = 0;
                for (k = i - 1; k >= 0; k--) {
                    if (pages[k] == frames[j]) break;
                    age[j]++;
                }
            }

            int max = 0;
            for (j = 1; j < f; j++) if (age[j] > age[max]) max = j;
            frames[max] = pages[i];
        }

        for (j = 0; j < f; j++)
            printf("\t%s", frames[j] == -1 ? "-" : (printf("%d", frames[j]), ""));
        printf("\n");
    }

    printf("Page Faults = %d\n", faults);
    return 0;
}