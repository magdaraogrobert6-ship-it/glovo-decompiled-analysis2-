package o;

import com.google.api.MetricDescriptor;

/* JADX INFO: loaded from: classes4.dex */
public final class layoutChildren implements decodeByte {
    public static final layoutChildren serializer = new layoutChildren();

    @Override // o.decodeByte
    public final boolean write(int i) {
        return MetricDescriptor.write.forNumber(i) != null;
    }
}
