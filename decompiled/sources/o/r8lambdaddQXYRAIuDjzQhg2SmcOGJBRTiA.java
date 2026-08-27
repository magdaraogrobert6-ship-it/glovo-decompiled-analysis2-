package o;

/* JADX INFO: loaded from: classes5.dex */
public class r8lambdaddQXYRAIuDjzQhg2SmcOGJBRTiA extends r8lambdafYywCNCBkMKwevJ2aCjE3Zl24I {
    private final long[] serializer;

    public final void IconCompatParcelizer(long j) {
        this.serializer[read()] = j;
        RemoteActionCompatParcelizer();
    }

    public final long RemoteActionCompatParcelizer(int i) {
        return this.serializer[write(i)];
    }

    public r8lambdaddQXYRAIuDjzQhg2SmcOGJBRTiA(int i) {
        super(i);
        this.serializer = new long[i];
    }
}
