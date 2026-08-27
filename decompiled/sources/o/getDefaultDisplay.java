package o;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class getDefaultDisplay {
    public final /* synthetic */ int RemoteActionCompatParcelizer;
    public final /* synthetic */ Object serializer;

    public /* synthetic */ getDefaultDisplay(int i, Object obj) {
        this.RemoteActionCompatParcelizer = i;
        this.serializer = obj;
    }

    public final void read() {
        int i = this.RemoteActionCompatParcelizer;
        Object obj = this.serializer;
        if (i != 0) {
            setInflatedId.IconCompatParcelizer(3, "Camera2CapturePipeline");
            ((onDrawWithContent) obj).RemoteActionCompatParcelizer(null);
            return;
        }
        getBitmap getbitmap = (getBitmap) obj;
        synchronized (getbitmap.IconCompatParcelizer) {
            if (getbitmap.write == null) {
                setInflatedId.read("ScreenFlashWrapper", "apply: pendingListener is null!");
            }
            getbitmap.IconCompatParcelizer();
        }
    }
}
