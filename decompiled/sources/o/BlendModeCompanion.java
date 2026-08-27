package o;

/* JADX INFO: loaded from: classes.dex */
public final class BlendModeCompanion {
    public int IconCompatParcelizer;
    public int RemoteActionCompatParcelizer;
    public int read;
    public int serializer;

    public final int RemoteActionCompatParcelizer() {
        return this.RemoteActionCompatParcelizer - this.serializer;
    }

    public final int read() {
        return this.read - this.IconCompatParcelizer;
    }
}
