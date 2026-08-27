package o;

import android.hardware.camera2.TotalCaptureResult;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public final class getFixedWidthMinor implements setAttachListener {
    public final /* synthetic */ getFixedWidthMajor serializer;

    @Override // o.setAttachListener
    public final DrawModifierNodeKt IconCompatParcelizer(TotalCaptureResult totalCaptureResult) {
        ArrayList arrayList = new ArrayList();
        Iterator it = this.serializer.MediaBrowserCompatMediaItem.iterator();
        while (it.hasNext()) {
            arrayList.add(((setAttachListener) it.next()).IconCompatParcelizer(totalCaptureResult));
        }
        PendingValue pendingValueWrite = VideoQualityQuirk.write(arrayList);
        getTrackDrawable gettrackdrawable = new getTrackDrawable(11);
        return VideoQualityQuirk.serializer(pendingValueWrite, new androidx.camera.view.PendingValue(5, gettrackdrawable), removeGeofencesRegisteredWithGeofencingClientandroid_sdk_location_release.read());
    }

    @Override // o.setAttachListener
    public final boolean read() {
        Iterator it = this.serializer.MediaBrowserCompatMediaItem.iterator();
        while (it.hasNext()) {
            if (((setAttachListener) it.next()).read()) {
                return true;
            }
        }
        return false;
    }

    @Override // o.setAttachListener
    public final void serializer() {
        Iterator it = this.serializer.MediaBrowserCompatMediaItem.iterator();
        while (it.hasNext()) {
            ((setAttachListener) it.next()).serializer();
        }
    }

    public getFixedWidthMinor(getFixedWidthMajor getfixedwidthmajor) {
        this.serializer = getfixedwidthmajor;
    }
}
