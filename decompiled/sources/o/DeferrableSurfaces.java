package o;

import androidx.camera.camera2.interop.CaptureRequestOptions$Builder$$ExternalSyntheticLambda0;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public interface DeferrableSurfaces extends InitializationException {
    InitializationException read();

    @Override // o.InitializationException
    default Set IconCompatParcelizer(JpegCaptureDownsizingQuirk jpegCaptureDownsizingQuirk) {
        return read().IconCompatParcelizer(jpegCaptureDownsizingQuirk);
    }

    @Override // o.InitializationException
    default void IconCompatParcelizer(CaptureRequestOptions$Builder$$ExternalSyntheticLambda0 captureRequestOptions$Builder$$ExternalSyntheticLambda0) {
        read().IconCompatParcelizer(captureRequestOptions$Builder$$ExternalSyntheticLambda0);
    }

    @Override // o.InitializationException
    default Set MediaBrowserCompatMediaItem() {
        return read().MediaBrowserCompatMediaItem();
    }

    @Override // o.InitializationException
    default play RemoteActionCompatParcelizer(JpegCaptureDownsizingQuirk jpegCaptureDownsizingQuirk) {
        return read().RemoteActionCompatParcelizer(jpegCaptureDownsizingQuirk);
    }

    @Override // o.InitializationException
    default boolean read(JpegCaptureDownsizingQuirk jpegCaptureDownsizingQuirk) {
        return read().read(jpegCaptureDownsizingQuirk);
    }

    @Override // o.InitializationException
    default Object serializer(JpegCaptureDownsizingQuirk jpegCaptureDownsizingQuirk, play playVar) {
        return read().serializer(jpegCaptureDownsizingQuirk, playVar);
    }

    @Override // o.InitializationException
    default Object write(JpegCaptureDownsizingQuirk jpegCaptureDownsizingQuirk) {
        return read().write(jpegCaptureDownsizingQuirk);
    }

    @Override // o.InitializationException
    default Object read(JpegCaptureDownsizingQuirk jpegCaptureDownsizingQuirk, Object obj) {
        return read().read(jpegCaptureDownsizingQuirk, obj);
    }
}
