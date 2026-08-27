package o;

import java.io.Serializable;

/* JADX INFO: loaded from: classes2.dex */
public final class activeHoverEvent0FcD4WY extends getDpTouchBoundsExpansion implements Serializable {
    public final Object RemoteActionCompatParcelizer;
    public final Object write;

    @Override // java.util.Map.Entry
    public final Object getKey() {
        return this.write;
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        return this.RemoteActionCompatParcelizer;
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        throw new UnsupportedOperationException();
    }

    public activeHoverEvent0FcD4WY(Object obj, Object obj2) {
        this.write = obj;
        this.RemoteActionCompatParcelizer = obj2;
    }
}
