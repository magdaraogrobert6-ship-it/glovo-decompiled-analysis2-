package o;

import com.google.firebase.perf.v1.TransportInfo;

/* JADX INFO: loaded from: classes4.dex */
public final class removeAndroidView implements decodeByte {
    public static final removeAndroidView RemoteActionCompatParcelizer = new removeAndroidView();

    @Override // o.decodeByte
    public final boolean write(int i) {
        return TransportInfo.write.forNumber(i) != null;
    }
}
