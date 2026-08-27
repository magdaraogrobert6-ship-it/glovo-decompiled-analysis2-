package androidx.compose.ui.text.android;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import o.instance_delegatelambda0;
import o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM;
import o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0;

/* JADX INFO: loaded from: classes4.dex */
public final class ListUtils_androidKt {
    public static final <T> void fastForEach(List<? extends T> list, r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm) {
        int size = list.size();
        for (int i = 0; i < size; i++) {
            r8lambdaunavo3sxub_pc9xroryotnrlvsm.invoke(list.get(i));
        }
    }

    public static final <T, R, C extends Collection<? super R>> C fastMapTo(List<? extends T> list, C c, r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm) {
        int size = list.size();
        for (int i = 0; i < size; i++) {
            c.add(r8lambdaunavo3sxub_pc9xroryotnrlvsm.invoke(list.get(i)));
        }
        return c;
    }

    public static final <T, R> List<R> fastZipWithNext(List<? extends T> list, r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 r8lambdaa6_tctqmksh3fk6hjgcbkuvde0) {
        if (list.size() <= 1) {
            return instance_delegatelambda0.write;
        }
        ArrayList arrayList = new ArrayList();
        int i = 0;
        T t = list.get(0);
        int size = list.size();
        while (i < size - 1) {
            i++;
            T t2 = list.get(i);
            arrayList.add(r8lambdaa6_tctqmksh3fk6hjgcbkuvde0.invoke(t, t2));
            t = t2;
        }
        return arrayList;
    }
}
