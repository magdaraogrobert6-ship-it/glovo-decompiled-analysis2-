package o;

/* JADX INFO: loaded from: classes4.dex */
public final class FoodoraSwitchWrongException {
    public final byte[] IconCompatParcelizer;
    public final byte[] RemoteActionCompatParcelizer;
    public final long read;
    public final long write;

    public FoodoraSwitchWrongException(byte[] bArr, long j, long j2, byte[] bArr2) {
        this.RemoteActionCompatParcelizer = bArr;
        this.write = j;
        this.read = j2;
        this.IconCompatParcelizer = bArr2;
    }
}
