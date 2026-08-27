package o;

import java.util.Objects;
import kotlin.TuplesKt;

/* JADX INFO: loaded from: classes2.dex */
public final class localToScreen58bKbWc extends getMotionEvent {
    public final transient Object[] IconCompatParcelizer;
    public final transient int read = 1;
    public final transient int serializer;

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.read;
    }

    @Override // java.util.List
    public final Object get(int i) {
        TuplesKt.RemoteActionCompatParcelizer(i, this.read);
        Object obj = this.IconCompatParcelizer[i + i + this.serializer];
        Objects.requireNonNull(obj);
        return obj;
    }

    public localToScreen58bKbWc(int i, Object[] objArr) {
        this.IconCompatParcelizer = objArr;
        this.serializer = i;
    }
}
