package o;

import bo.app.af$$ExternalSyntheticOutline0;
import bo.app.d$$ExternalSyntheticOutline0;
import bo.app.ff$$ExternalSyntheticOutline0;

/* JADX INFO: loaded from: classes2.dex */
public final class AndroidComposeViewresendMotionEventOnLayout1 {
    public final String IconCompatParcelizer;
    public final String MediaMetadataCompat;
    public final int RatingCompat;
    public final String RemoteActionCompatParcelizer;
    public final String read;
    public final long serializer;
    public final getRulerLambda write;

    public final int hashCode() {
        int iM = d$$ExternalSyntheticOutline0.m(af$$ExternalSyntheticOutline0.m(this.RatingCompat, af$$ExternalSyntheticOutline0.m(this.MediaMetadataCompat.hashCode() * 31, 31, this.RemoteActionCompatParcelizer), 31), 31, this.serializer);
        return this.read.hashCode() + af$$ExternalSyntheticOutline0.m((this.write.hashCode() + iM) * 31, 31, this.IconCompatParcelizer);
    }

    public AndroidComposeViewresendMotionEventOnLayout1(String str, String str2, int i, long j, getRulerLambda getrulerlambda, String str3, String str4) {
        af$$ExternalSyntheticOutline0.m3978m(str, str2, str4);
        this.MediaMetadataCompat = str;
        this.RemoteActionCompatParcelizer = str2;
        this.RatingCompat = i;
        this.serializer = j;
        this.write = getrulerlambda;
        this.IconCompatParcelizer = str3;
        this.read = str4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AndroidComposeViewresendMotionEventOnLayout1)) {
            return false;
        }
        AndroidComposeViewresendMotionEventOnLayout1 androidComposeViewresendMotionEventOnLayout1 = (AndroidComposeViewresendMotionEventOnLayout1) obj;
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.MediaMetadataCompat, androidComposeViewresendMotionEventOnLayout1.MediaMetadataCompat}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.RemoteActionCompatParcelizer, androidComposeViewresendMotionEventOnLayout1.RemoteActionCompatParcelizer}, getCieXyz.write())).booleanValue() || this.RatingCompat != androidComposeViewresendMotionEventOnLayout1.RatingCompat || this.serializer != androidComposeViewresendMotionEventOnLayout1.serializer || !this.write.equals(androidComposeViewresendMotionEventOnLayout1.write) || !this.IconCompatParcelizer.equals(androidComposeViewresendMotionEventOnLayout1.IconCompatParcelizer)) {
            return false;
        }
        return ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.read, androidComposeViewresendMotionEventOnLayout1.read}, getCieXyz.write())).booleanValue();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SessionInfo(sessionId=");
        sb.append(this.MediaMetadataCompat);
        sb.append(", firstSessionId=");
        sb.append(this.RemoteActionCompatParcelizer);
        sb.append(", sessionIndex=");
        sb.append(this.RatingCompat);
        sb.append(", eventTimestampUs=");
        sb.append(this.serializer);
        sb.append(", dataCollectionStatus=");
        sb.append(this.write);
        sb.append(", firebaseInstallationId=");
        sb.append(this.IconCompatParcelizer);
        sb.append(", firebaseAuthenticationToken=");
        return ff$$ExternalSyntheticOutline0.m(sb, this.read, ')');
    }
}
