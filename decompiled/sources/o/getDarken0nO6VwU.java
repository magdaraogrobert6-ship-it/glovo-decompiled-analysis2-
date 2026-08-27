package o;

/* JADX INFO: loaded from: classes.dex */
public final class getDarken0nO6VwU {
    public boolean IconCompatParcelizer;
    public int RemoteActionCompatParcelizer;
    public int read;
    public int serializer;
    public int write;

    public final int serializer() {
        return Math.min(this.write - this.serializer, this.read - this.RemoteActionCompatParcelizer);
    }
}
