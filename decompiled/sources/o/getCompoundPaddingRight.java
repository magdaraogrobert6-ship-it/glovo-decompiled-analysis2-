package o;

import android.hardware.camera2.CameraCaptureSession;
import androidx.camera.core.ImageCapture$1;
import java.util.LinkedHashSet;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class getCompoundPaddingRight implements Runnable {
    public final /* synthetic */ getThumbScrollRange IconCompatParcelizer;
    public final /* synthetic */ int read;

    public /* synthetic */ getCompoundPaddingRight(getThumbScrollRange getthumbscrollrange, int i) {
        this.read = i;
        this.IconCompatParcelizer = getthumbscrollrange;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.read;
        getThumbScrollRange getthumbscrollrange = this.IconCompatParcelizer;
        if (i != 0) {
            getthumbscrollrange.MediaBrowserCompatMediaItem(getthumbscrollrange);
            return;
        }
        getThumbScrollRange.serializer();
        coil3.util.UtilsKt.IconCompatParcelizer(getthumbscrollrange.serializer, "Need to call openCaptureSession before using this API.");
        androidx.lifecycle.BlockRunner blockRunner = getthumbscrollrange.RemoteActionCompatParcelizer;
        synchronized (blockRunner.serializer) {
            ((LinkedHashSet) blockRunner.write).add(getthumbscrollrange);
        }
        ((CameraCaptureSession) ((ImageCapture$1) getthumbscrollrange.serializer.MediaSessionCompatQueueItem).MediaSessionCompatQueueItem).close();
        getthumbscrollrange.MediaBrowserCompatMediaItem.execute(new getCompoundPaddingRight(getthumbscrollrange, 1));
    }
}
