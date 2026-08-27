package o;

import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public final class computeXYZMatrix implements Iterable {
    public final ArrayList RemoteActionCompatParcelizer;

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return this.RemoteActionCompatParcelizer.iterator();
    }

    public computeXYZMatrix(ArrayList arrayList) {
        this.RemoteActionCompatParcelizer = arrayList;
    }
}
