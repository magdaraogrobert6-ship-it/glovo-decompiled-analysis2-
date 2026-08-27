package o;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class getContentPaddingBottom implements Runnable {
    public final /* synthetic */ PreviewExternalSyntheticLambda0 IconCompatParcelizer;
    public final /* synthetic */ int read;

    public /* synthetic */ getContentPaddingBottom(PreviewExternalSyntheticLambda0 previewExternalSyntheticLambda0, int i) {
        this.read = i;
        this.IconCompatParcelizer = previewExternalSyntheticLambda0;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.read;
        PreviewExternalSyntheticLambda0 previewExternalSyntheticLambda0 = this.IconCompatParcelizer;
        if (i != 0) {
            previewExternalSyntheticLambda0.serializer();
        } else {
            previewExternalSyntheticLambda0.write();
        }
    }
}
