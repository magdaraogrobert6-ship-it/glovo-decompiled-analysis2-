package o;

import androidx.camera.core.Preview$$ExternalSyntheticLambda0;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public final class setOnInflateListener extends StillCaptureFlashStopRepeatingQuirk {
    public final Object read;
    public final /* synthetic */ int serializer;

    public setOnInflateListener(get getVar) {
        this.serializer = 2;
        this.read = new java.lang.ref.WeakReference(getVar);
    }

    @Override // o.StillCaptureFlashStopRepeatingQuirk
    public void IconCompatParcelizer(int i) {
        if (this.serializer != 1) {
            return;
        }
        removeGeofencesRegisteredWithGeofencingClientandroid_sdk_location_release.IconCompatParcelizer().execute(new Preview$$ExternalSyntheticLambda0(13, this));
    }

    @Override // o.StillCaptureFlashStopRepeatingQuirk
    public void serializer(int i, CameraXExternalSyntheticLambda0 cameraXExternalSyntheticLambda0) {
        get getVar;
        int i2 = this.serializer;
        if (i2 == 0) {
            getLayoutResource getlayoutresource = (getLayoutResource) this.read;
            synchronized (getlayoutresource.MediaBrowserCompatMediaItem) {
                if (getlayoutresource.read) {
                    return;
                }
                getlayoutresource.MediaSessionCompatQueueItem.put(cameraXExternalSyntheticLambda0.RatingCompat(), new getDisplayManager(cameraXExternalSyntheticLambda0));
                getlayoutresource.MediaSessionCompatQueueItem();
                return;
            }
        }
        if (i2 == 2 && (getVar = (get) ((java.lang.ref.WeakReference) this.read).get()) != null) {
            Iterator it = getVar.IconCompatParcelizer.iterator();
            while (it.hasNext()) {
                mapToBase maptobase = ((androidx.camera.core.UseCase) it.next()).MediaSessionCompatResultReceiverWrapper;
                Iterator it2 = maptobase.MediaDescriptionCompat.IconCompatParcelizer.iterator();
                while (it2.hasNext()) {
                    ((StillCaptureFlashStopRepeatingQuirk) it2.next()).serializer(i, new LayoutNodeSubcompositionsStateScope(cameraXExternalSyntheticLambda0, maptobase.MediaDescriptionCompat.RatingCompat, -1L));
                }
            }
        }
    }

    public /* synthetic */ setOnInflateListener(int i, Object obj) {
        this.serializer = i;
        this.read = obj;
    }
}
