package o;

/* JADX INFO: loaded from: classes2.dex */
public abstract class delegate {
    public final /* synthetic */ int serializer = 0;

    public abstract Object read();

    public String toString() {
        return this.serializer != 0 ? super.toString() : read().toString();
    }
}
