package o;

/* JADX INFO: loaded from: classes3.dex */
public final class r8lambdaTlqvW4KpMdTE6ntJJ3lie_ZvAAQ extends r8lambdafix1o_Kc7cAFkSaZjXDbyayn9j4 {
    public final r8lambdaBEyrNr8p6809BwlBoRO_sTaNs write;

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
    }

    @Override // o.r8lambdafix1o_Kc7cAFkSaZjXDbyayn9j4
    public final void write() {
    }

    @Override // o.r8lambdafix1o_Kc7cAFkSaZjXDbyayn9j4
    public final void write(byte[] bArr, int i) {
        this.write.write(bArr, 0, i);
    }

    @Override // o.r8lambdafix1o_Kc7cAFkSaZjXDbyayn9j4
    public final int read(byte[] bArr, int i, int i2) {
        return this.write.IconCompatParcelizer(bArr, i, i2);
    }

    public r8lambdaTlqvW4KpMdTE6ntJJ3lie_ZvAAQ(r8lambdaBEyrNr8p6809BwlBoRO_sTaNs r8lambdabeyrnr8p6809bwlboro_stans) {
        this.write = r8lambdabeyrnr8p6809bwlboro_stans;
    }
}
