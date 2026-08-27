package o;

import com.google.api.MetricDescriptor;

/* JADX INFO: loaded from: classes4.dex */
public final class unInitializeModifier implements decodeByte {
    public static final unInitializeModifier IconCompatParcelizer = new unInitializeModifier();

    @Override // o.decodeByte
    public final boolean write(int i) {
        return MetricDescriptor.serializer.forNumber(i) != null;
    }
}
