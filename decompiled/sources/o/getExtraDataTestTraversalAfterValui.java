package o;

import com.google.firestore.v1.DocumentTransform;

/* JADX INFO: loaded from: classes4.dex */
public final class getExtraDataTestTraversalAfterValui implements decodeByte {
    public static final getExtraDataTestTraversalAfterValui RemoteActionCompatParcelizer = new getExtraDataTestTraversalAfterValui();

    @Override // o.decodeByte
    public final boolean write(int i) {
        return DocumentTransform.FieldTransform.serializer.forNumber(i) != null;
    }
}
