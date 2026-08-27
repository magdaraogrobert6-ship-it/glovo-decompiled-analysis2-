package o;

import com.google.firestore.admin.v1.Index;

/* JADX INFO: loaded from: classes4.dex */
public final class getEnabledServices implements dataAvailable {
    @Override // o.dataAvailable
    public final ifDebug IconCompatParcelizer(int i) {
        return Index.write.forNumber(i);
    }
}
