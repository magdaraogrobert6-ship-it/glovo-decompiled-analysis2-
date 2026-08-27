package o;

import com.google.firestore.v1.StructuredQuery;

/* JADX INFO: loaded from: classes4.dex */
public final class setDisableContentCapture implements decodeByte {
    public static final setDisableContentCapture read = new setDisableContentCapture();

    @Override // o.decodeByte
    public final boolean write(int i) {
        return StructuredQuery.FieldFilter.read.forNumber(i) != null;
    }
}
