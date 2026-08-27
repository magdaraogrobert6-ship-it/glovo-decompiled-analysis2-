package o;

import androidx.camera.camera2.interop.CaptureRequestOptions$Builder$$ExternalSyntheticLambda0;
import java.util.Iterator;
import java.util.Objects;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public interface InitializationException {
    Set IconCompatParcelizer(JpegCaptureDownsizingQuirk jpegCaptureDownsizingQuirk);

    void IconCompatParcelizer(CaptureRequestOptions$Builder$$ExternalSyntheticLambda0 captureRequestOptions$Builder$$ExternalSyntheticLambda0);

    Set MediaBrowserCompatMediaItem();

    play RemoteActionCompatParcelizer(JpegCaptureDownsizingQuirk jpegCaptureDownsizingQuirk);

    Object read(JpegCaptureDownsizingQuirk jpegCaptureDownsizingQuirk, Object obj);

    boolean read(JpegCaptureDownsizingQuirk jpegCaptureDownsizingQuirk);

    Object serializer(JpegCaptureDownsizingQuirk jpegCaptureDownsizingQuirk, play playVar);

    Object write(JpegCaptureDownsizingQuirk jpegCaptureDownsizingQuirk);

    static void serializer(CameraProviderInitRetryPolicy cameraProviderInitRetryPolicy, InitializationException initializationException, InitializationException initializationException2, JpegCaptureDownsizingQuirk jpegCaptureDownsizingQuirk) {
        if (!Objects.equals(jpegCaptureDownsizingQuirk, getImageFormatdefault.h_)) {
            cameraProviderInitRetryPolicy.IconCompatParcelizer(jpegCaptureDownsizingQuirk, initializationException2.RemoteActionCompatParcelizer(jpegCaptureDownsizingQuirk), initializationException2.write(jpegCaptureDownsizingQuirk));
            return;
        }
        setUseCompatPadding setusecompatpadding = (setUseCompatPadding) initializationException2.read(jpegCaptureDownsizingQuirk, null);
        setUseCompatPadding setusecompatpadding2 = (setUseCompatPadding) initializationException.read(jpegCaptureDownsizingQuirk, null);
        play playVarRemoteActionCompatParcelizer = initializationException2.RemoteActionCompatParcelizer(jpegCaptureDownsizingQuirk);
        if (setusecompatpadding == null) {
            setusecompatpadding = setusecompatpadding2;
        } else if (setusecompatpadding2 != null) {
            Keysiterator1 keysiterator1 = setusecompatpadding2.RemoteActionCompatParcelizer;
            CardView1 cardView1 = setusecompatpadding2.IconCompatParcelizer;
            Keysiterator1 keysiterator2 = setusecompatpadding.RemoteActionCompatParcelizer;
            if (keysiterator2 != null) {
                keysiterator1 = keysiterator2;
            }
            CardView1 cardView2 = setusecompatpadding.IconCompatParcelizer;
            if (cardView2 != null) {
                cardView1 = cardView2;
            }
            setusecompatpadding = new setUseCompatPadding(keysiterator1, cardView1);
        }
        cameraProviderInitRetryPolicy.IconCompatParcelizer(jpegCaptureDownsizingQuirk, playVarRemoteActionCompatParcelizer, setusecompatpadding);
    }

    static CameraRepository RemoteActionCompatParcelizer(InitializationException initializationException, InitializationException initializationException2) {
        CameraProviderInitRetryPolicy cameraProviderInitRetryPolicyRemoteActionCompatParcelizer;
        if (initializationException == null && initializationException2 == null) {
            return CameraRepository.read;
        }
        if (initializationException2 != null) {
            cameraProviderInitRetryPolicyRemoteActionCompatParcelizer = CameraProviderInitRetryPolicy.RemoteActionCompatParcelizer(initializationException2);
        } else {
            cameraProviderInitRetryPolicyRemoteActionCompatParcelizer = CameraProviderInitRetryPolicy.RemoteActionCompatParcelizer();
        }
        if (initializationException != null) {
            Iterator it = initializationException.MediaBrowserCompatMediaItem().iterator();
            while (it.hasNext()) {
                serializer(cameraProviderInitRetryPolicyRemoteActionCompatParcelizer, initializationException2, initializationException, (JpegCaptureDownsizingQuirk) it.next());
            }
        }
        return CameraRepository.serializer(cameraProviderInitRetryPolicyRemoteActionCompatParcelizer);
    }
}
