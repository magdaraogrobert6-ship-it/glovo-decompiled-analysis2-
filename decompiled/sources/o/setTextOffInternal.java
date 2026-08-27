package o;

import java.util.LinkedHashSet;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class setTextOffInternal implements Runnable {
    public final /* synthetic */ getThumbScrollRange IconCompatParcelizer;
    public final /* synthetic */ int RemoteActionCompatParcelizer;
    public final /* synthetic */ getThumbScrollRange read;

    public /* synthetic */ setTextOffInternal(getThumbScrollRange getthumbscrollrange, getThumbScrollRange getthumbscrollrange2, int i) {
        this.RemoteActionCompatParcelizer = i;
        this.read = getthumbscrollrange;
        this.IconCompatParcelizer = getthumbscrollrange2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.RemoteActionCompatParcelizer != 0) {
            getThumbScrollRange getthumbscrollrange = this.read;
            getThumbScrollRange getthumbscrollrange2 = this.IconCompatParcelizer;
            Objects.requireNonNull(getthumbscrollrange.IconCompatParcelizer);
            getthumbscrollrange.IconCompatParcelizer.MediaBrowserCompatMediaItem(getthumbscrollrange2);
            return;
        }
        getThumbScrollRange getthumbscrollrange3 = this.read;
        getThumbScrollRange getthumbscrollrange4 = this.IconCompatParcelizer;
        androidx.lifecycle.BlockRunner blockRunner = getthumbscrollrange3.RemoteActionCompatParcelizer;
        synchronized (blockRunner.serializer) {
            ((LinkedHashSet) blockRunner.RatingCompat).remove(getthumbscrollrange3);
            ((LinkedHashSet) blockRunner.write).remove(getthumbscrollrange3);
        }
        getthumbscrollrange3.MediaBrowserCompatMediaItem(getthumbscrollrange4);
        if (getthumbscrollrange3.serializer != null) {
            Objects.requireNonNull(getthumbscrollrange3.IconCompatParcelizer);
            getthumbscrollrange3.IconCompatParcelizer.RemoteActionCompatParcelizer(getthumbscrollrange4);
        } else {
            setInflatedId.read("SyncCaptureSessionBase", "[" + getthumbscrollrange3 + "] Cannot call onClosed() when the CameraCaptureSession is not correctly configured.");
        }
    }
}
