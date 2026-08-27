package o;

import bo.app.af$$ExternalSyntheticOutline0;
import bo.app.d$$ExternalSyntheticOutline0;
import java.text.DateFormat;
import java.util.Date;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes4.dex */
public final class r8lambdaBqh0w01c16kBFgwvmHubOEiyOBo {
    public final String MediaBrowserCompatMediaItem;
    public final String MediaDescriptionCompat;
    public final boolean MediaMetadataCompat;
    public final long MediaSessionCompatQueueItem;
    public final String MediaSessionCompatResultReceiverWrapper;
    public final boolean MediaSessionCompatToken;
    public final String ParcelableVolumeInfo;
    public final boolean PlaybackStateCompatCustomAction;
    public final boolean RatingCompat;
    public final String read;
    public static final Pattern IconCompatParcelizer = Pattern.compile("(\\d{2,4})[^\\d]*");
    public static final Pattern RemoteActionCompatParcelizer = Pattern.compile("(?i)(jan|feb|mar|apr|may|jun|jul|aug|sep|oct|nov|dec).*");
    public static final Pattern write = Pattern.compile("(\\d{1,2})[^\\d]*");
    public static final Pattern serializer = Pattern.compile("(\\d{1,2}):(\\d{1,2}):(\\d{1,2})[^\\d]*");

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.MediaBrowserCompatMediaItem);
        sb.append('=');
        sb.append(this.ParcelableVolumeInfo);
        if (this.PlaybackStateCompatCustomAction) {
            long j = this.MediaSessionCompatQueueItem;
            if (j == Long.MIN_VALUE) {
                sb.append("; max-age=0");
            } else {
                sb.append("; expires=");
                String str = ((DateFormat) setMessageCloseButtonColor.serializer.get()).format(new Date(j));
                str.getClass();
                sb.append(str);
            }
        }
        if (!this.MediaMetadataCompat) {
            sb.append("; domain=");
            sb.append(this.read);
        }
        sb.append("; path=");
        sb.append(this.MediaDescriptionCompat);
        if (this.MediaSessionCompatToken) {
            sb.append("; secure");
        }
        if (this.RatingCompat) {
            sb.append("; httponly");
        }
        String str2 = this.MediaSessionCompatResultReceiverWrapper;
        if (str2 != null) {
            sb.append("; samesite=");
            sb.append(str2);
        }
        return sb.toString();
    }

    public r8lambdaBqh0w01c16kBFgwvmHubOEiyOBo(String str, String str2, long j, String str3, String str4, boolean z, boolean z2, boolean z3, boolean z4, String str5) {
        this.MediaBrowserCompatMediaItem = str;
        this.ParcelableVolumeInfo = str2;
        this.MediaSessionCompatQueueItem = j;
        this.read = str3;
        this.MediaDescriptionCompat = str4;
        this.MediaSessionCompatToken = z;
        this.RatingCompat = z2;
        this.PlaybackStateCompatCustomAction = z3;
        this.MediaMetadataCompat = z4;
        this.MediaSessionCompatResultReceiverWrapper = str5;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof r8lambdaBqh0w01c16kBFgwvmHubOEiyOBo)) {
            return false;
        }
        r8lambdaBqh0w01c16kBFgwvmHubOEiyOBo r8lambdabqh0w01c16kbfgwvmhuboeiyobo = (r8lambdaBqh0w01c16kBFgwvmHubOEiyOBo) obj;
        if (!r8lambdabqh0w01c16kbfgwvmhuboeiyobo.MediaBrowserCompatMediaItem.equals(this.MediaBrowserCompatMediaItem) || !r8lambdabqh0w01c16kbfgwvmhuboeiyobo.ParcelableVolumeInfo.equals(this.ParcelableVolumeInfo) || r8lambdabqh0w01c16kbfgwvmhuboeiyobo.MediaSessionCompatQueueItem != this.MediaSessionCompatQueueItem || !r8lambdabqh0w01c16kbfgwvmhuboeiyobo.read.equals(this.read) || !r8lambdabqh0w01c16kbfgwvmhuboeiyobo.MediaDescriptionCompat.equals(this.MediaDescriptionCompat) || r8lambdabqh0w01c16kbfgwvmhuboeiyobo.MediaSessionCompatToken != this.MediaSessionCompatToken || r8lambdabqh0w01c16kbfgwvmhuboeiyobo.RatingCompat != this.RatingCompat || r8lambdabqh0w01c16kbfgwvmhuboeiyobo.PlaybackStateCompatCustomAction != this.PlaybackStateCompatCustomAction || r8lambdabqh0w01c16kbfgwvmhuboeiyobo.MediaMetadataCompat != this.MediaMetadataCompat) {
            return false;
        }
        return ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{r8lambdabqh0w01c16kbfgwvmhuboeiyobo.MediaSessionCompatResultReceiverWrapper, this.MediaSessionCompatResultReceiverWrapper}, getCieXyz.write())).booleanValue();
    }

    public final int hashCode() {
        int iM = d$$ExternalSyntheticOutline0.m(d$$ExternalSyntheticOutline0.m(d$$ExternalSyntheticOutline0.m(d$$ExternalSyntheticOutline0.m(af$$ExternalSyntheticOutline0.m(af$$ExternalSyntheticOutline0.m(d$$ExternalSyntheticOutline0.m(af$$ExternalSyntheticOutline0.m(af$$ExternalSyntheticOutline0.m(527, 31, this.MediaBrowserCompatMediaItem), 31, this.ParcelableVolumeInfo), 31, this.MediaSessionCompatQueueItem), 31, this.read), 31, this.MediaDescriptionCompat), 31, this.MediaSessionCompatToken), 31, this.RatingCompat), 31, this.PlaybackStateCompatCustomAction), 31, this.MediaMetadataCompat);
        String str = this.MediaSessionCompatResultReceiverWrapper;
        return iM + (str != null ? str.hashCode() : 0);
    }
}
