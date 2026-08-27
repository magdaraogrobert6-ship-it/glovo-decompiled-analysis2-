package o;

import bo.app.af$$ExternalSyntheticOutline0;
import bo.app.m1$$ExternalSyntheticOutline0;

/* JADX INFO: loaded from: classes.dex */
public final class SurfaceViewStretchedQuirk extends PreviewExternalSyntheticLambda0 {
    public SurfaceViewNotCroppedByParentQuirk RemoteActionCompatParcelizer;
    public PreviewExternalSyntheticLambda0 ResultReceiver;
    public final onDrawBehind r8lambda54BeH8ZsBru0CXI2CCSP2syNys;
    public final onDrawWithContent read;

    @Override // o.PreviewExternalSyntheticLambda0
    public final DrawModifierNodeKt RemoteActionCompatParcelizer() {
        return this.r8lambda54BeH8ZsBru0CXI2CCSP2syNys;
    }

    public final boolean IconCompatParcelizer(PreviewExternalSyntheticLambda0 previewExternalSyntheticLambda0, Runnable runnable) {
        boolean z;
        android.util.Size size = this.PlaybackStateCompatCustomAction;
        PrematureEndOfStreamVideoQuirk.write();
        previewExternalSyntheticLambda0.getClass();
        int i = previewExternalSyntheticLambda0.PlaybackStateCompat;
        android.util.Size size2 = previewExternalSyntheticLambda0.PlaybackStateCompatCustomAction;
        PreviewExternalSyntheticLambda0 previewExternalSyntheticLambda1 = this.ResultReceiver;
        if (previewExternalSyntheticLambda1 == previewExternalSyntheticLambda0) {
            return false;
        }
        coil3.util.UtilsKt.RemoteActionCompatParcelizer("A different provider has been set. To change the provider, call SurfaceEdge#invalidate before calling SurfaceEdge#setProvider", previewExternalSyntheticLambda1 == null);
        coil3.util.UtilsKt.IconCompatParcelizer("The provider's size(" + size + ") must match the parent(" + size2 + ")", size.equals(size2));
        int i2 = this.PlaybackStateCompat;
        coil3.util.UtilsKt.IconCompatParcelizer(af$$ExternalSyntheticOutline0.m(i2, i, "The provider's format(", ") must match the parent(", ")"), i2 == i);
        synchronized (this.MediaSessionCompatResultReceiverWrapper) {
            z = this.MediaSessionCompatQueueItem;
        }
        coil3.util.UtilsKt.RemoteActionCompatParcelizer("The parent is closed. Call SurfaceEdge#invalidate() before setting a new provider.", !z);
        this.ResultReceiver = previewExternalSyntheticLambda0;
        VideoQualityQuirk.write(previewExternalSyntheticLambda0.IconCompatParcelizer(), this.read);
        previewExternalSyntheticLambda0.read();
        VideoQualityQuirk.write((DrawModifierNodeKt) this.ParcelableVolumeInfo).RemoteActionCompatParcelizer(new getContentPaddingBottom(previewExternalSyntheticLambda0, 1), removeGeofencesRegisteredWithGeofencingClientandroid_sdk_location_release.read());
        VideoQualityQuirk.write((DrawModifierNodeKt) previewExternalSyntheticLambda0.MediaMetadataCompat).RemoteActionCompatParcelizer(runnable, removeGeofencesRegisteredWithGeofencingClientandroid_sdk_location_release.IconCompatParcelizer());
        return true;
    }

    public SurfaceViewStretchedQuirk(android.util.Size size, int i) {
        super(size, i);
        onDrawWithContent ondrawwithcontent = new onDrawWithContent();
        ondrawwithcontent.IconCompatParcelizer = new setContentDrawScopeui();
        onDrawBehind ondrawbehind = new onDrawBehind(ondrawwithcontent);
        ondrawwithcontent.read = ondrawbehind;
        ondrawwithcontent.RemoteActionCompatParcelizer = m1$$ExternalSyntheticOutline0.class;
        try {
            this.read = ondrawwithcontent;
            ondrawwithcontent.RemoteActionCompatParcelizer = "SettableFuture hashCode: " + hashCode();
        } catch (Exception e) {
            ondrawbehind.write(e);
        }
        this.r8lambda54BeH8ZsBru0CXI2CCSP2syNys = ondrawbehind;
    }

    @Override // o.PreviewExternalSyntheticLambda0
    public final void write() {
        super.write();
        PrematureEndOfStreamVideoQuirk.write(new onAnimationEnd(this, 2));
    }
}
