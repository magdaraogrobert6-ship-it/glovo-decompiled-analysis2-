package o;

import com.google.firestore.admin.v1.Index;

/* JADX INFO: loaded from: classes4.dex */
public final class getHandler implements decodeByte {
    public static final getHandler read = new getHandler();

    @Override // o.decodeByte
    public final boolean write(int i) {
        return Index.write.forNumber(i) != null;
    }
}
