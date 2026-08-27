package o;

import com.google.firebase.perf.v1.NetworkRequestMetric;

/* JADX INFO: loaded from: classes2.dex */
public final class getImportantForAutofill implements decodeByte {
    public static final getImportantForAutofill write = new getImportantForAutofill();

    @Override // o.decodeByte
    public final boolean write(int i) {
        return NetworkRequestMetric.read.forNumber(i) != null;
    }
}
