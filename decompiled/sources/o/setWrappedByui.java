package o;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public abstract class setWrappedByui implements Comparable, Iterable {
    public final List IconCompatParcelizer;

    public abstract setWrappedByui serializer(List list);

    public final String toString() {
        return write();
    }

    public abstract String write();

    public final boolean IconCompatParcelizer() {
        return this.IconCompatParcelizer.size() == 0;
    }

    public final String RemoteActionCompatParcelizer(int i) {
        return (String) this.IconCompatParcelizer.get(i);
    }

    public final setWrappedByui RemoteActionCompatParcelizer() {
        List list = this.IconCompatParcelizer;
        return serializer(list.subList(0, list.size() - 1));
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return this.IconCompatParcelizer.iterator();
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: read, reason: merged with bridge method [inline-methods] */
    public final int compareTo(setWrappedByui setwrappedbyui) {
        int size = this.IconCompatParcelizer.size();
        int size2 = setwrappedbyui.IconCompatParcelizer.size();
        for (int i = 0; i < size && i < size2; i++) {
            String strRemoteActionCompatParcelizer = RemoteActionCompatParcelizer(i);
            String strRemoteActionCompatParcelizer2 = setwrappedbyui.RemoteActionCompatParcelizer(i);
            int iCompare = 1;
            boolean z = strRemoteActionCompatParcelizer.startsWith("__id") && strRemoteActionCompatParcelizer.endsWith("__");
            boolean z2 = strRemoteActionCompatParcelizer2.startsWith("__id") && strRemoteActionCompatParcelizer2.endsWith("__");
            if (z && !z2) {
                iCompare = -1;
            } else if (z || !z2) {
                iCompare = (z && z2) ? Long.compare(Long.parseLong(strRemoteActionCompatParcelizer.substring(4, strRemoteActionCompatParcelizer.length() - 2)), Long.parseLong(strRemoteActionCompatParcelizer2.substring(4, strRemoteActionCompatParcelizer2.length() - 2))) : com.google.firebase.firestore.util.Util.RemoteActionCompatParcelizer(strRemoteActionCompatParcelizer, strRemoteActionCompatParcelizer2);
            }
            if (iCompare != 0) {
                return iCompare;
            }
        }
        return Integer.compare(size, size2);
    }

    public final setWrappedByui read() {
        List list = this.IconCompatParcelizer;
        int size = list.size();
        getRectManager.RemoteActionCompatParcelizer(size >= 5, "Can't call popFirst with count > length() (%d > %d)", 5, Integer.valueOf(size));
        return new shareWithSiblings(list.subList(5, size));
    }

    public final setWrappedByui write(String str) {
        ArrayList arrayList = new ArrayList(this.IconCompatParcelizer);
        arrayList.add(str);
        return serializer(arrayList);
    }

    public setWrappedByui(List list) {
        this.IconCompatParcelizer = list;
    }

    public final String serializer() {
        return (String) r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.IconCompatParcelizer(1, this.IconCompatParcelizer);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof setWrappedByui) && compareTo((setWrappedByui) obj) == 0;
    }

    public final int hashCode() {
        return this.IconCompatParcelizer.hashCode() + ((getClass().hashCode() + 37) * 37);
    }
}
