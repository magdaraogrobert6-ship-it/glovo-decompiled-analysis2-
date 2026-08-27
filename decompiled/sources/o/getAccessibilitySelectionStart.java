package o;

import com.google.firestore.admin.v1.Index;

/* JADX INFO: loaded from: classes4.dex */
public final class getAccessibilitySelectionStart implements decodeByte {
    public static final getAccessibilitySelectionStart serializer = new getAccessibilitySelectionStart();

    @Override // o.decodeByte
    public final boolean write(int i) {
        return Index.IndexField.RemoteActionCompatParcelizer.forNumber(i) != null;
    }
}
