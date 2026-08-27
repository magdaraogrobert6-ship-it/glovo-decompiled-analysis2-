package o;

/* JADX INFO: loaded from: classes3.dex */
final class BrazePushReceiverCompanionhandleReceivedIntent1 {
    private final float[] IconCompatParcelizer;
    private long write;

    public final void IconCompatParcelizer(float[] fArr, long j) {
        int length = fArr.length;
        float[] fArr2 = this.IconCompatParcelizer;
        System.arraycopy(fArr, 0, fArr2, 0, Math.min(length, fArr2.length));
        this.write = j;
    }

    public final float[] IconCompatParcelizer() {
        return this.IconCompatParcelizer;
    }

    public BrazePushReceiverCompanionhandleReceivedIntent1(int i) {
        this.IconCompatParcelizer = new float[i];
    }

    public final long read() {
        return this.write;
    }
}
