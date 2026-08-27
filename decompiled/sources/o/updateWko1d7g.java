package o;

import android.app.Activity;
import android.graphics.SurfaceTexture;
import android.view.Surface;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class updateWko1d7g implements FocusOwnerImplmodifier1 {
    public final /* synthetic */ Object RemoteActionCompatParcelizer;
    public final /* synthetic */ int read;
    public final /* synthetic */ Object write;

    public /* synthetic */ updateWko1d7g(Object obj, int i, Object obj2) {
        this.read = i;
        this.RemoteActionCompatParcelizer = obj;
        this.write = obj2;
    }

    @Override // o.FocusOwnerImplmodifier1
    public final void accept(Object obj) {
        int i = this.read;
        Object obj2 = this.write;
        Object obj3 = this.RemoteActionCompatParcelizer;
        if (i == 0) {
            ((Surface) obj3).release();
            ((SurfaceTexture) obj2).release();
            return;
        }
        if (i == 1) {
            PreviewView1ExternalSyntheticLambda2 previewView1ExternalSyntheticLambda2 = (PreviewView1ExternalSyntheticLambda2) obj3;
            SurfaceViewNotCroppedByParentQuirk surfaceViewNotCroppedByParentQuirk = (SurfaceViewNotCroppedByParentQuirk) obj2;
            surfaceViewNotCroppedByParentQuirk.close();
            Surface surface = (Surface) previewView1ExternalSyntheticLambda2.MediaBrowserCompatMediaItem.remove(surfaceViewNotCroppedByParentQuirk);
            if (surface != null) {
                fromId fromid = previewView1ExternalSyntheticLambda2.write;
                setCardBackgroundColor.serializer(fromid.MediaMetadataCompat, true);
                setCardBackgroundColor.serializer(fromid.RatingCompat);
                fromid.RemoteActionCompatParcelizer(surface, true);
                return;
            }
            return;
        }
        if (i != 2) {
            accessgetReusableGraphicsLayerScopep accessgetreusablegraphicslayerscopep = (accessgetReusableGraphicsLayerScopep) obj3;
            Activity activity = (Activity) obj2;
            androidx.navigation.NavArgsLazy navArgsLazy = accessgetreusablegraphicslayerscopep.write;
            if (navArgsLazy != null) {
                navArgsLazy.RemoteActionCompatParcelizer(activity, accessgetreusablegraphicslayerscopep.RemoteActionCompatParcelizer(activity));
                return;
            }
            return;
        }
        getMaxCardElevation getmaxcardelevation = (getMaxCardElevation) obj3;
        SurfaceViewNotCroppedByParentQuirk surfaceViewNotCroppedByParentQuirk2 = (SurfaceViewNotCroppedByParentQuirk) obj2;
        surfaceViewNotCroppedByParentQuirk2.close();
        Surface surface2 = (Surface) getmaxcardelevation.MediaSessionCompatQueueItem.remove(surfaceViewNotCroppedByParentQuirk2);
        if (surface2 != null) {
            getPreventCornerOverlap getpreventcorneroverlap = getmaxcardelevation.RemoteActionCompatParcelizer;
            setCardBackgroundColor.serializer(getpreventcorneroverlap.MediaMetadataCompat, true);
            setCardBackgroundColor.serializer(getpreventcorneroverlap.RatingCompat);
            getpreventcorneroverlap.RemoteActionCompatParcelizer(surface2, true);
        }
    }
}
