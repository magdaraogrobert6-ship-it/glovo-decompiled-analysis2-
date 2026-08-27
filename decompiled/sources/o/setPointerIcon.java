package o;

import com.google.firestore.v1.TargetChange;

/* JADX INFO: loaded from: classes2.dex */
public final class setPointerIcon implements dataAvailable {
    @Override // o.dataAvailable
    public final ifDebug IconCompatParcelizer(int i) {
        return TargetChange.RemoteActionCompatParcelizer.forNumber(i);
    }
}
