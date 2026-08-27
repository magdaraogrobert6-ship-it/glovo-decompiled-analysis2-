package o;

import kotlinx.coroutines.JobKt;

/* JADX INFO: loaded from: classes.dex */
public final class fromColorLong implements toAndroidColorSpace, getContentViewGroupParentLayout {
    public final TextAnnouncementContentCardView RemoteActionCompatParcelizer;
    public final supportsColorMatrixQuery read;

    @Override // o.getContentViewGroupParentLayout
    public final TextAnnouncementContentCardView getCoroutineContext() {
        return this.RemoteActionCompatParcelizer;
    }

    public fromColorLong(supportsColorMatrixQuery supportscolormatrixquery, TextAnnouncementContentCardView textAnnouncementContentCardView) {
        supportscolormatrixquery.getClass();
        textAnnouncementContentCardView.getClass();
        this.read = supportscolormatrixquery;
        this.RemoteActionCompatParcelizer = textAnnouncementContentCardView;
        if (((accessregisterComponentCallback) supportscolormatrixquery).RatingCompat == toColorLong8_81llA.DESTROYED) {
            JobKt.serializer(textAnnouncementContentCardView, null);
        }
    }

    @Override // o.toAndroidColorSpace
    public final void onStateChanged(accessisRenderNodeCompatiblecp accessisrendernodecompatiblecp, AndroidColorSpace_androidKt androidColorSpace_androidKt) {
        supportsColorMatrixQuery supportscolormatrixquery = this.read;
        if (((accessregisterComponentCallback) supportscolormatrixquery).RatingCompat.compareTo(toColorLong8_81llA.DESTROYED) <= 0) {
            supportscolormatrixquery.read(this);
            JobKt.serializer(this.RemoteActionCompatParcelizer, null);
        }
    }
}
