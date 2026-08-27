package o;

import com.google.firebase.perf.v1.NetworkConnectionInfo;

/* JADX INFO: loaded from: classes4.dex */
public final class dispatchTouchEvent implements decodeByte {
    public static final dispatchTouchEvent RemoteActionCompatParcelizer = new dispatchTouchEvent();

    @Override // o.decodeByte
    public final boolean write(int i) {
        return NetworkConnectionInfo.serializer.forNumber(i) != null;
    }
}
