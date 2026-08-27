package o;

/* JADX INFO: loaded from: classes.dex */
public abstract class sizeVpY3zN4 {
    public static final int[] serializer = new int[0];
    public static final float[] RemoteActionCompatParcelizer = new float[0];
    public static final coil3.memory.MemoryCacheService IconCompatParcelizer = new coil3.memory.MemoryCacheService(new int[2], new float[2], new float[][]{new float[2], new float[2]});

    public static final long read(SizeNode sizeNode, long j) {
        long jIconCompatParcelizer = j - ((long) sizeNode.IconCompatParcelizer());
        long jSerializer = sizeNode.serializer();
        if (jIconCompatParcelizer < 0) {
            jIconCompatParcelizer = 0;
        }
        return jIconCompatParcelizer > jSerializer ? jSerializer : jIconCompatParcelizer;
    }
}
