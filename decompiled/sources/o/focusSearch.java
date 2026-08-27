package o;

import com.google.firebase.perf.v1.NetworkConnectionInfo;

/* JADX INFO: loaded from: classes4.dex */
public final class focusSearch implements decodeByte {
    public static final focusSearch write = new focusSearch();

    @Override // o.decodeByte
    public final boolean write(int i) {
        return NetworkConnectionInfo.read.forNumber(i) != null;
    }
}
