package o;

/* JADX INFO: loaded from: classes2.dex */
public final class MultiContentMeasurePolicy implements Runnable {
    public final /* synthetic */ NoWindowInsetsAnimation IconCompatParcelizer;
    public final /* synthetic */ boolean RemoteActionCompatParcelizer;
    public final /* synthetic */ int read;
    public final /* synthetic */ getMeasuredWidth serializer;
    public final /* synthetic */ long write;

    public /* synthetic */ MultiContentMeasurePolicy(NoWindowInsetsAnimation noWindowInsetsAnimation, getMeasuredWidth getmeasuredwidth, long j, boolean z, int i) {
        this.read = i;
        this.serializer = getmeasuredwidth;
        this.write = j;
        this.RemoteActionCompatParcelizer = z;
        this.IconCompatParcelizer = noWindowInsetsAnimation;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.read;
        long j = this.write;
        boolean z = this.RemoteActionCompatParcelizer;
        getMeasuredWidth getmeasuredwidth = this.serializer;
        NoWindowInsetsAnimation noWindowInsetsAnimation = this.IconCompatParcelizer;
        if (i != 0) {
            noWindowInsetsAnimation.RemoteActionCompatParcelizer(getmeasuredwidth);
            noWindowInsetsAnimation.read(getmeasuredwidth, j, z);
        } else {
            noWindowInsetsAnimation.RemoteActionCompatParcelizer(getmeasuredwidth);
            noWindowInsetsAnimation.read(getmeasuredwidth, j, z);
        }
    }
}
