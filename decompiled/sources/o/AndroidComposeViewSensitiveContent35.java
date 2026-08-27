package o;

import com.google.firestore.v1.StructuredQuery;

/* JADX INFO: loaded from: classes4.dex */
public final class AndroidComposeViewSensitiveContent35 implements decodeByte {
    public static final AndroidComposeViewSensitiveContent35 RemoteActionCompatParcelizer = new AndroidComposeViewSensitiveContent35();

    @Override // o.decodeByte
    public final boolean write(int i) {
        return StructuredQuery.UnaryFilter.write.forNumber(i) != null;
    }
}
