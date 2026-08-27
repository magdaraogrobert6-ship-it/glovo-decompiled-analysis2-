package o;

/* JADX INFO: loaded from: classes4.dex */
public final class r8lambdaOaqVy__5D9hMN5g6GAsyVaKdzs {
    public final RegistryMissingComponentException RemoteActionCompatParcelizer;
    public int read;
    public int write;

    public final void write(byte[] bArr, int i, int i2) {
        this.RemoteActionCompatParcelizer.write(bArr, i, i2);
        this.read -= i2;
        this.write += i2;
    }

    public r8lambdaOaqVy__5D9hMN5g6GAsyVaKdzs(RegistryMissingComponentException registryMissingComponentException, int i) {
        this.RemoteActionCompatParcelizer = registryMissingComponentException;
        this.read = i;
    }
}
