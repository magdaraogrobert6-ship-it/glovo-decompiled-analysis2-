package o;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class InvalidConfigException implements Runnable {
    public final /* synthetic */ onDrawWithContent IconCompatParcelizer;
    public final /* synthetic */ int read;

    public /* synthetic */ InvalidConfigException(onDrawWithContent ondrawwithcontent, int i) {
        this.read = i;
        this.IconCompatParcelizer = ondrawwithcontent;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.read;
        onDrawWithContent ondrawwithcontent = this.IconCompatParcelizer;
        if (i != 0) {
            ondrawwithcontent.serializer(new Exception("Failed to snapshot: OpenGLRenderer not ready."));
        } else {
            ondrawwithcontent.RemoteActionCompatParcelizer(null);
        }
    }
}
