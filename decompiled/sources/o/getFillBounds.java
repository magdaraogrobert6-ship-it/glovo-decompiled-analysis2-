package o;

import java.io.Serializable;

/* JADX INFO: loaded from: classes2.dex */
public final class getFillBounds extends getModifierLocalBeyondBoundsLayout implements Serializable {
    public final getBeyondBoundsLayout read;
    public final Object serializer;

    @Override // java.util.Map.Entry
    public final Object getKey() {
        return this.serializer;
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        return this.read;
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        throw new UnsupportedOperationException();
    }

    public getFillBounds(Object obj, getBeyondBoundsLayout getbeyondboundslayout) {
        this.serializer = obj;
        this.read = getbeyondboundslayout;
    }
}
