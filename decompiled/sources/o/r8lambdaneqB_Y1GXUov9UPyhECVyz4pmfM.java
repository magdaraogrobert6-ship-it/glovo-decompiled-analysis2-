package o;

import java.util.ArrayList;
import java.util.HashSet;

/* JADX INFO: loaded from: classes3.dex */
public class r8lambdaneqB_Y1GXUov9UPyhECVyz4pmfM {
    private final HashSet RemoteActionCompatParcelizer = new HashSet();
    private final HashSet IconCompatParcelizer = new HashSet();
    private final HashSet serializer = new HashSet();

    public final void RemoteActionCompatParcelizer(String str, boolean z) {
        synchronized (this) {
            this.RemoteActionCompatParcelizer.add(str);
            if (z) {
                this.IconCompatParcelizer.add(str);
            } else {
                this.serializer.add(str);
            }
        }
    }

    public final boolean read() {
        boolean zIsEmpty;
        synchronized (this) {
            zIsEmpty = this.RemoteActionCompatParcelizer.isEmpty();
        }
        return zIsEmpty;
    }

    public final boolean read(String str) {
        boolean zRemove;
        synchronized (this) {
            this.RemoteActionCompatParcelizer.remove(str);
            this.serializer.remove(str);
            zRemove = this.IconCompatParcelizer.remove(str);
        }
        return zRemove;
    }

    public final ArrayList IconCompatParcelizer() {
        ArrayList arrayList;
        synchronized (this) {
            arrayList = new ArrayList(this.IconCompatParcelizer);
        }
        return arrayList;
    }

    public final ArrayList RemoteActionCompatParcelizer() {
        ArrayList arrayList;
        synchronized (this) {
            arrayList = new ArrayList(this.serializer);
        }
        return arrayList;
    }

    public final boolean write(String str) {
        boolean zContains;
        synchronized (this) {
            zContains = this.RemoteActionCompatParcelizer.contains(str);
        }
        return zContains;
    }
}
