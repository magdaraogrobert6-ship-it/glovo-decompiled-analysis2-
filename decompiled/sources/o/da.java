package o;

import bo.app.af$$ExternalSyntheticOutline0;

/* JADX INFO: loaded from: classes3.dex */
public final class da implements resizeToBitmapDimensionslambda0 {
    private static int MediaDescriptionCompat = 0;
    private static int MediaMetadataCompat = 1;
    public final r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 IconCompatParcelizer;
    public final String MediaBrowserCompatMediaItem;
    public final androidx.compose.ui.text.AnnotatedString MediaSessionCompatQueueItem;
    public final String RatingCompat;
    public final int RemoteActionCompatParcelizer;
    public final getQueryContext read;
    public final launchEventResponseTasks serializer;
    public final r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 write;

    public da(androidx.compose.ui.text.AnnotatedString annotatedString, String str, int i, String str2, r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k0, r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k1, getQueryContext getquerycontext, launchEventResponseTasks launcheventresponsetasks) {
        getquerycontext.getClass();
        launcheventresponsetasks.getClass();
        this.MediaSessionCompatQueueItem = annotatedString;
        this.MediaBrowserCompatMediaItem = str;
        this.RemoteActionCompatParcelizer = i;
        this.RatingCompat = str2;
        this.IconCompatParcelizer = r8lambdardpfsr94j4iebcwx_kpqzpm8k0;
        this.write = r8lambdardpfsr94j4iebcwx_kpqzpm8k1;
        this.read = getquerycontext;
        this.serializer = launcheventresponsetasks;
    }

    public final int hashCode() {
        int i = 2 % 2;
        int i2 = MediaDescriptionCompat + 25;
        MediaMetadataCompat = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        int iM = af$$ExternalSyntheticOutline0.m(af$$ExternalSyntheticOutline0.m(this.RemoteActionCompatParcelizer, af$$ExternalSyntheticOutline0.m(this.MediaSessionCompatQueueItem.hashCode() * 31, 31, this.MediaBrowserCompatMediaItem), 31), 31, this.RatingCompat);
        int iHashCode = this.IconCompatParcelizer.hashCode();
        int iHashCode2 = this.write.hashCode();
        int iHashCode3 = this.serializer.hashCode() + ((this.read.hashCode() + ((iHashCode2 + ((iHashCode + iM) * 31)) * 31)) * 31);
        int i4 = MediaDescriptionCompat + 73;
        MediaMetadataCompat = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return iHashCode3;
    }

    public final String toString() {
        int i = 2 % 2;
        String str = "WelcomeViewState(title=" + ((Object) this.MediaSessionCompatQueueItem) + ", selectedCountryTitle=" + this.MediaBrowserCompatMediaItem + ", buttonTitle=" + this.RemoteActionCompatParcelizer + ", versionName=" + this.RatingCompat + ", onSelectCountryClicked=" + this.IconCompatParcelizer + ", onNextClicked=" + this.write + ", pendingAction=" + this.read + ", riderRecruitmentButton=" + this.serializer + ")";
        int i2 = MediaDescriptionCompat + 15;
        MediaMetadataCompat = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            return str;
        }
        throw null;
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        int i2 = MediaDescriptionCompat + 107;
        MediaMetadataCompat = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            throw null;
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof da)) {
            return false;
        }
        da daVar = (da) obj;
        if (!this.MediaSessionCompatQueueItem.equals(daVar.MediaSessionCompatQueueItem)) {
            return false;
        }
        if (!this.MediaBrowserCompatMediaItem.equals(daVar.MediaBrowserCompatMediaItem)) {
            int i3 = MediaMetadataCompat + 53;
            MediaDescriptionCompat = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i4 = i3 % 2;
            return false;
        }
        if (this.RemoteActionCompatParcelizer != daVar.RemoteActionCompatParcelizer || !this.RatingCompat.equals(daVar.RatingCompat) || !this.IconCompatParcelizer.equals(daVar.IconCompatParcelizer) || !this.write.equals(daVar.write)) {
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.read, daVar.read}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        return ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.serializer, daVar.serializer}, getCieXyz.write())).booleanValue();
    }
}
