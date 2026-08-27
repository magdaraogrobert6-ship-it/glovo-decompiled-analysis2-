package o;

/* JADX INFO: loaded from: classes.dex */
public final class Rgboetf1 {
    public final /* synthetic */ int read;

    public final int write() {
        return this.read != 0 ? 4 : 1;
    }

    public final Object IconCompatParcelizer(int i) {
        return this.read != 0 ? new int[i] : new byte[i];
    }

    public final int serializer(Object obj) {
        return this.read != 0 ? ((int[]) obj).length : ((byte[]) obj).length;
    }

    public final String serializer() {
        return this.read != 0 ? "IntegerArrayPool" : "ByteArrayPool";
    }
}
