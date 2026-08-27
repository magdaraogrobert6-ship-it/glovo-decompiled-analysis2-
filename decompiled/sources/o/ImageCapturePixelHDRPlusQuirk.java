package o;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ImageCapturePixelHDRPlusQuirk implements Runnable {
    public final /* synthetic */ IncorrectCaptureStateQuirk IconCompatParcelizer;
    public final /* synthetic */ int serializer;

    public /* synthetic */ ImageCapturePixelHDRPlusQuirk(IncorrectCaptureStateQuirk incorrectCaptureStateQuirk, int i) {
        this.serializer = i;
        this.IconCompatParcelizer = incorrectCaptureStateQuirk;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.serializer;
        IncorrectCaptureStateQuirk incorrectCaptureStateQuirk = this.IconCompatParcelizer;
        if (i != 0) {
            incorrectCaptureStateQuirk.IconCompatParcelizer();
        } else {
            incorrectCaptureStateQuirk.serializer = null;
            incorrectCaptureStateQuirk.IconCompatParcelizer();
        }
    }
}
