package o;

/* JADX INFO: loaded from: classes.dex */
public final class hideTranslatedText {
    public final boolean IconCompatParcelizer;
    public final Object MediaMetadataCompat;
    public final boolean RemoteActionCompatParcelizer;
    public final androidx.compose.runtime.ProvidableCompositionLocal read;
    public final AndroidContentCaptureManager serializer;
    public boolean write = true;

    public hideTranslatedText(androidx.compose.runtime.ProvidableCompositionLocal providableCompositionLocal, Object obj, boolean z, AndroidContentCaptureManager androidContentCaptureManager, boolean z2) {
        this.read = providableCompositionLocal;
        this.RemoteActionCompatParcelizer = z;
        this.serializer = androidContentCaptureManager;
        this.IconCompatParcelizer = z2;
        this.MediaMetadataCompat = obj;
    }

    public final Object write() {
        if (this.RemoteActionCompatParcelizer) {
            return null;
        }
        Object obj = this.MediaMetadataCompat;
        if (obj != null) {
            return obj;
        }
        getCreditCardExpirationDay.IconCompatParcelizer("Unexpected form of a provided value");
        DrawableTransformation.read();
        return null;
    }
}
