package o;

import bo.app.af$$ExternalSyntheticOutline0;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import java.io.IOException;
import java.net.ProtocolException;
import java.util.TimeZone;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes4.dex */
public final class r8lambdasOt4_ejMke8sdyQbVxt_ItYJc2c extends applyInAppMessageParameters {
    public final /* synthetic */ getInAppMessageImageView MediaDescriptionCompat;
    public long read;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r8lambdasOt4_ejMke8sdyQbVxt_ItYJc2c(getInAppMessageImageView getinappmessageimageview, setInAppMessageImageViewAttributes setinappmessageimageviewattributes, long j) {
        super(getinappmessageimageview, setinappmessageimageviewattributes);
        setinappmessageimageviewattributes.getClass();
        this.MediaDescriptionCompat = getinappmessageimageview;
        this.read = j;
        if (j == 0) {
            write(resetMessageMarginslambda00.EMPTY);
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.RemoteActionCompatParcelizer) {
            return;
        }
        if (this.read != 0) {
            TimeZone timeZone = setWebViewContent.RemoteActionCompatParcelizer;
            TimeUnit.MILLISECONDS.getClass();
            try {
                if (!setWebViewContent.RemoteActionCompatParcelizer(this, 100)) {
                    this.MediaDescriptionCompat.RemoteActionCompatParcelizer.RatingCompat();
                    write(getInAppMessageImageView.read);
                }
            } catch (IOException unused) {
            }
        }
        this.RemoteActionCompatParcelizer = true;
    }

    @Override // o.applyInAppMessageParameters, o.ItemSingleChoiceBinding
    public final long RemoteActionCompatParcelizer(RegistryMissingComponentException registryMissingComponentException, long j) throws ProtocolException {
        registryMissingComponentException.getClass();
        if (j < 0) {
            DrawableTransformation.serializer((Object) af$$ExternalSyntheticOutline0.m(j, "byteCount < 0: "));
            return 0L;
        }
        if (this.RemoteActionCompatParcelizer) {
            ScreenStartObserver$$ExternalSyntheticLambda0.write("closed");
            return 0L;
        }
        long j2 = this.read;
        if (j2 == 0) {
            return -1L;
        }
        long jRemoteActionCompatParcelizer = super.RemoteActionCompatParcelizer(registryMissingComponentException, Math.min(j2, j));
        if (jRemoteActionCompatParcelizer == -1) {
            this.MediaDescriptionCompat.RemoteActionCompatParcelizer.RatingCompat();
            ProtocolException protocolException = new ProtocolException("unexpected end of stream");
            write(getInAppMessageImageView.read);
            throw protocolException;
        }
        long j3 = this.read - jRemoteActionCompatParcelizer;
        this.read = j3;
        if (j3 == 0) {
            write(resetMessageMarginslambda00.EMPTY);
        }
        return jRemoteActionCompatParcelizer;
    }
}
