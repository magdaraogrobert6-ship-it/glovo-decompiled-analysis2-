package o;

import com.google.firestore.v1.TargetChange;

/* JADX INFO: loaded from: classes4.dex */
public final class clearViewTranslationCallback implements decodeByte {
    public static final clearViewTranslationCallback write = new clearViewTranslationCallback();

    @Override // o.decodeByte
    public final boolean write(int i) {
        return TargetChange.RemoteActionCompatParcelizer.forNumber(i) != null;
    }
}
