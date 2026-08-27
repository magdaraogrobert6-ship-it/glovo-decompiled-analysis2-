package o;

import com.google.api.Property;

/* JADX INFO: loaded from: classes4.dex */
public final class setMeasurePolicy implements decodeByte {
    public static final setMeasurePolicy IconCompatParcelizer = new setMeasurePolicy();

    @Override // o.decodeByte
    public final boolean write(int i) {
        return Property.RemoteActionCompatParcelizer.forNumber(i) != null;
    }
}
