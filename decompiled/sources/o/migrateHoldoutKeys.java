package o;

/* JADX INFO: loaded from: classes4.dex */
public final class migrateHoldoutKeys extends FWFRequest {
    public final byte[] IconCompatParcelizer;

    public migrateHoldoutKeys(String str, byte[] bArr) {
        super(str, true);
        this.IconCompatParcelizer = accessbootstrapIfNeeded.RemoteActionCompatParcelizer(bArr);
    }
}
