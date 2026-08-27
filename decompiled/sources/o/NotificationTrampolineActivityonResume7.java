package o;

import com.braze.IBraze$$ExternalSyntheticBUOutline0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes4.dex */
public final class NotificationTrampolineActivityonResume7 {
    private final double read;

    public static final class read {
        public read(DefaultConstructorMarker defaultConstructorMarker) {
        }
    }

    public final ArrayList serializer(List list) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        arrayList2.add(list.get(0));
        int size = list.size();
        for (int i = 1; i < size; i++) {
            onCreatelambda0 oncreatelambda0 = (onCreatelambda0) list.get(i);
            if (oncreatelambda0.IconCompatParcelizer() - ((onCreatelambda0) onContentCardDismissed.read((List) arrayList2)).IconCompatParcelizer() >= this.read) {
                if (oncreatelambda0.IconCompatParcelizer() - ((onCreatelambda0) onContentCardDismissed.MediaDescriptionCompat((List) arrayList2)).IconCompatParcelizer() < 1000) {
                    arrayList.add(write(arrayList2));
                }
                arrayList2.clear();
            }
            arrayList2.add(oncreatelambda0);
        }
        if (!arrayList2.isEmpty()) {
            arrayList.add(write(arrayList2));
        }
        return arrayList;
    }

    static {
        new read(null);
    }

    private static onCreatelambda0 read(onCreatelambda0 oncreatelambda0) {
        double dWrite = oncreatelambda0.write();
        double dRemoteActionCompatParcelizer = oncreatelambda0.RemoteActionCompatParcelizer();
        double dSerializer = oncreatelambda0.serializer();
        double d = oncreatelambda0.read();
        double dSqrt = Math.sqrt((d * d) + (dSerializer * dSerializer) + (dRemoteActionCompatParcelizer * dRemoteActionCompatParcelizer) + (dWrite * dWrite));
        return dSqrt == 0.0d ? new onCreatelambda0(oncreatelambda0.IconCompatParcelizer(), 1.0d, 0.0d, 0.0d, 0.0d) : new onCreatelambda0(oncreatelambda0.IconCompatParcelizer(), oncreatelambda0.write() / dSqrt, oncreatelambda0.RemoteActionCompatParcelizer() / dSqrt, oncreatelambda0.serializer() / dSqrt, oncreatelambda0.read() / dSqrt);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v13, types: [o.instance_delegatelambda0] */
    /* JADX WARN: Type inference failed for: r0v4, types: [java.util.ArrayList, java.util.List] */
    /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Iterable, java.util.List] */
    private static onCreatelambda0 write(ArrayList arrayList) {
        ?? arrayList2;
        ArrayList arrayList3 = new ArrayList(accessgetInstancedelegatecp.write(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList3.add(read((onCreatelambda0) it.next()));
        }
        if (arrayList3.isEmpty()) {
            arrayList2 = instance_delegatelambda0.write;
        } else {
            arrayList2 = new ArrayList();
            arrayList2.add(arrayList3.get(0));
            int i = 1;
            for (int size = arrayList3.size(); i < size; size = size) {
                onCreatelambda0 oncreatelambda0 = (onCreatelambda0) onContentCardDismissed.MediaDescriptionCompat((List) arrayList2);
                onCreatelambda0 oncreatelambda1 = (onCreatelambda0) arrayList3.get(i);
                double dWrite = oncreatelambda0.write();
                double dWrite2 = oncreatelambda1.write();
                double dRemoteActionCompatParcelizer = oncreatelambda0.RemoteActionCompatParcelizer();
                double dRemoteActionCompatParcelizer2 = oncreatelambda1.RemoteActionCompatParcelizer();
                double dSerializer = oncreatelambda0.serializer();
                if ((oncreatelambda1.read() * oncreatelambda0.read()) + (oncreatelambda1.serializer() * dSerializer) + (dRemoteActionCompatParcelizer2 * dRemoteActionCompatParcelizer) + (dWrite2 * dWrite) < 0.0d) {
                    arrayList2.add(new onCreatelambda0(oncreatelambda1.IconCompatParcelizer(), -oncreatelambda1.write(), -oncreatelambda1.RemoteActionCompatParcelizer(), -oncreatelambda1.serializer(), -oncreatelambda1.read()));
                } else {
                    arrayList2.add(oncreatelambda1);
                }
                i++;
            }
        }
        int size2 = arrayList2.size();
        if (size2 == 0) {
            return new onCreatelambda0(0L, 1.0d, 0.0d, 0.0d, 0.0d);
        }
        Iterator it2 = arrayList2.iterator();
        if (it2.hasNext()) {
            Object next = it2.next();
            while (it2.hasNext()) {
                onCreatelambda0 oncreatelambda2 = (onCreatelambda0) it2.next();
                onCreatelambda0 oncreatelambda3 = (onCreatelambda0) next;
                next = new onCreatelambda0(oncreatelambda3.IconCompatParcelizer() + oncreatelambda2.IconCompatParcelizer(), oncreatelambda3.write() + oncreatelambda2.write(), oncreatelambda3.RemoteActionCompatParcelizer() + oncreatelambda2.RemoteActionCompatParcelizer(), oncreatelambda3.serializer() + oncreatelambda2.serializer(), oncreatelambda3.read() + oncreatelambda2.read());
            }
            onCreatelambda0 oncreatelambda4 = (onCreatelambda0) next;
            double d = size2;
            return read(new onCreatelambda0(oncreatelambda4.IconCompatParcelizer() / ((long) size2), oncreatelambda4.write() / d, oncreatelambda4.RemoteActionCompatParcelizer() / d, oncreatelambda4.serializer() / d, oncreatelambda4.read() / d));
        }
        IBraze$$ExternalSyntheticBUOutline0.m("Empty collection can't be reduced.");
        return null;
    }

    public NotificationTrampolineActivityonResume7(int i) {
        this.read = 1000.0d / ((double) i);
    }
}
