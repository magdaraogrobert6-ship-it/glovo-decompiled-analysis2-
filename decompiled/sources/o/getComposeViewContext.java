package o;

import com.google.firebase.perf.v1.NetworkRequestMetric;

/* JADX INFO: loaded from: classes2.dex */
public final class getComposeViewContext implements decodeByte {
    public static final getComposeViewContext write = new getComposeViewContext();

    @Override // o.decodeByte
    public final boolean write(int i) {
        return NetworkRequestMetric.RemoteActionCompatParcelizer.forNumber(i) != null;
    }
}
