package bo.app;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.PriorityQueue;

/* JADX INFO: loaded from: classes.dex */
public final class wg {
    public static final Comparator b = new wg$$ExternalSyntheticLambda0(0);
    public final PriorityQueue a;

    public wg(ArrayList arrayList) {
        arrayList.getClass();
        PriorityQueue priorityQueue = new PriorityQueue(12, b);
        this.a = priorityQueue;
        priorityQueue.addAll(arrayList);
    }

    public static final int a(ga gaVar, ga gaVar2) {
        gaVar.getClass();
        gaVar2.getClass();
        ah ahVar = (ah) gaVar;
        int i = ahVar.b.c;
        ah ahVar2 = (ah) gaVar2;
        int i2 = ahVar2.b.c;
        if (i > i2) {
            return -1;
        }
        if (i < i2) {
            return 1;
        }
        return ahVar.a.compareTo(ahVar2.a);
    }
}
