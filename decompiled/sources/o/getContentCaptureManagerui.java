package o;

import com.google.firebase.perf.v1.NetworkRequestMetric;

/* JADX INFO: loaded from: classes2.dex */
public final class getContentCaptureManagerui implements dataAvailable {
    @Override // o.dataAvailable
    public final ifDebug IconCompatParcelizer(int i) {
        return NetworkRequestMetric.RemoteActionCompatParcelizer.forNumber(i);
    }
}
