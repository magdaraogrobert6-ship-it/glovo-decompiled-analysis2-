package o;

/* JADX INFO: loaded from: classes4.dex */
public final class UserPropertiesCompanion extends writeTo {
    public final byte[] write;

    public UserPropertiesCompanion(Custom custom, byte[] bArr) {
        super(custom, false);
        this.write = accessbootstrapIfNeeded.RemoteActionCompatParcelizer(bArr);
    }
}
