package o;

import bo.app.af$$ExternalSyntheticOutline0;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;

/* JADX INFO: loaded from: classes4.dex */
public final class InAppMessageModalViewExternalSyntheticLambda1 extends applyInAppMessageParameters {
    public boolean read;

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.RemoteActionCompatParcelizer) {
            return;
        }
        if (!this.read) {
            write(getInAppMessageImageView.read);
        }
        this.RemoteActionCompatParcelizer = true;
    }

    @Override // o.applyInAppMessageParameters, o.ItemSingleChoiceBinding
    public final long RemoteActionCompatParcelizer(RegistryMissingComponentException registryMissingComponentException, long j) {
        registryMissingComponentException.getClass();
        if (j < 0) {
            DrawableTransformation.serializer((Object) af$$ExternalSyntheticOutline0.m(j, "byteCount < 0: "));
            return 0L;
        }
        if (this.RemoteActionCompatParcelizer) {
            ScreenStartObserver$$ExternalSyntheticLambda0.write("closed");
            return 0L;
        }
        if (this.read) {
            return -1L;
        }
        long jRemoteActionCompatParcelizer = super.RemoteActionCompatParcelizer(registryMissingComponentException, j);
        if (jRemoteActionCompatParcelizer != -1) {
            return jRemoteActionCompatParcelizer;
        }
        this.read = true;
        write(resetMessageMarginslambda00.EMPTY);
        return -1L;
    }

    public InAppMessageModalViewExternalSyntheticLambda1(getInAppMessageImageView getinappmessageimageview, setInAppMessageImageViewAttributes setinappmessageimageviewattributes) {
        super(getinappmessageimageview, setinappmessageimageviewattributes);
    }
}
