package o;

/* JADX INFO: loaded from: classes2.dex */
public final class accessgetButtonR2cp extends accessgetCommacp {
    public byte[] read;
    public byte[] serializer;

    public final accessgetButtonR2cp read(byte[] bArr) {
        this.serializer = bArr;
        return this;
    }

    public final accessgetButtonR2cp serializer(byte[] bArr) {
        this.read = bArr;
        return this;
    }

    public final accessgetButtonThumbLeftcp write() {
        return new accessgetButtonThumbLeftcp(this.read, this.serializer);
    }
}
