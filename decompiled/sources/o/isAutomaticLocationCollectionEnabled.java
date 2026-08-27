package o;

import bo.app.af$$ExternalSyntheticOutline0;
import java.text.DateFormat;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes3.dex */
public final class isAutomaticLocationCollectionEnabled {
    public final String MediaBrowserCompatMediaItem;
    public final String MediaDescriptionCompat;
    public final boolean MediaMetadataCompat;
    public final String MediaSessionCompatQueueItem;
    public final boolean MediaSessionCompatResultReceiverWrapper;
    public final boolean MediaSessionCompatToken;
    public final boolean PlaybackStateCompat;
    public final long RatingCompat;
    public final String read;
    public static final Pattern write = Pattern.compile("(\\d{2,4})[^\\d]*");
    public static final Pattern IconCompatParcelizer = Pattern.compile("(?i)(jan|feb|mar|apr|may|jun|jul|aug|sep|oct|nov|dec).*");
    public static final Pattern serializer = Pattern.compile("(\\d{1,2})[^\\d]*");
    public static final Pattern RemoteActionCompatParcelizer = Pattern.compile("(\\d{1,2}):(\\d{1,2}):(\\d{1,2})[^\\d]*");

    /* JADX WARN: Code duplicated, block: B:18:0x007f  */
    public static long serializer(int i, String str) {
        int iWrite = write(str, false, 0, i);
        Pattern pattern = RemoteActionCompatParcelizer;
        Matcher matcher = pattern.matcher(str);
        int i2 = -1;
        int i3 = -1;
        int i4 = -1;
        int iIndexOf = -1;
        int i5 = -1;
        int i6 = -1;
        while (iWrite < i) {
            int iWrite2 = write(str, true, iWrite + 1, i);
            matcher.region(iWrite, iWrite2);
            if (i3 == -1 && matcher.usePattern(pattern).matches()) {
                i3 = Integer.parseInt(matcher.group(1));
                i5 = Integer.parseInt(matcher.group(2));
                i6 = Integer.parseInt(matcher.group(3));
            } else if (i4 == -1 && matcher.usePattern(serializer).matches()) {
                i4 = Integer.parseInt(matcher.group(1));
            } else if (iIndexOf == -1) {
                Pattern pattern2 = IconCompatParcelizer;
                if (matcher.usePattern(pattern2).matches()) {
                    iIndexOf = pattern2.pattern().indexOf(matcher.group(1).toLowerCase(java.util.Locale.US)) / 4;
                } else if (i2 != -1 && matcher.usePattern(write).matches()) {
                    i2 = Integer.parseInt(matcher.group(1));
                }
            } else if (i2 != -1) {
            }
            iWrite = write(str, false, iWrite2 + 1, i);
        }
        if (i2 >= 70 && i2 <= 99) {
            i2 += 1900;
        }
        if (i2 >= 0 && i2 <= 69) {
            i2 += 2000;
        }
        if (i2 < 1601) {
            DrawableTransformation.write();
            return 0L;
        }
        if (iIndexOf == -1) {
            DrawableTransformation.write();
            return 0L;
        }
        if (i4 < 1 || i4 > 31) {
            DrawableTransformation.write();
            return 0L;
        }
        if (i3 < 0 || i3 > 23) {
            DrawableTransformation.write();
            return 0L;
        }
        if (i5 < 0 || i5 > 59) {
            DrawableTransformation.write();
            return 0L;
        }
        if (i6 < 0 || i6 > 59) {
            DrawableTransformation.write();
            return 0L;
        }
        GregorianCalendar gregorianCalendar = new GregorianCalendar(r8lambdaNPXAuu7h2_IDXjHh7d85MaN3p08.MediaSessionCompatResultReceiverWrapper);
        gregorianCalendar.setLenient(false);
        gregorianCalendar.set(1, i2);
        gregorianCalendar.set(2, iIndexOf - 1);
        gregorianCalendar.set(5, i4);
        gregorianCalendar.set(11, i3);
        gregorianCalendar.set(12, i5);
        gregorianCalendar.set(13, i6);
        gregorianCalendar.set(14, 0);
        return gregorianCalendar.getTimeInMillis();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.read);
        sb.append('=');
        sb.append(this.MediaDescriptionCompat);
        if (this.MediaSessionCompatToken) {
            long j = this.RatingCompat;
            if (j == Long.MIN_VALUE) {
                sb.append("; max-age=0");
            } else {
                sb.append("; expires=");
                sb.append(((DateFormat) _get_brazeApiKey_lambda2.IconCompatParcelizer.get()).format(new Date(j)));
            }
        }
        if (!this.MediaSessionCompatResultReceiverWrapper) {
            sb.append("; domain=");
            sb.append(this.MediaBrowserCompatMediaItem);
        }
        sb.append("; path=");
        sb.append(this.MediaSessionCompatQueueItem);
        if (this.MediaMetadataCompat) {
            sb.append("; secure");
        }
        if (this.PlaybackStateCompat) {
            sb.append("; httponly");
        }
        return sb.toString();
    }

    public isAutomaticLocationCollectionEnabled(String str, String str2, long j, String str3, String str4, boolean z, boolean z2, boolean z3, boolean z4) {
        this.read = str;
        this.MediaDescriptionCompat = str2;
        this.RatingCompat = j;
        this.MediaBrowserCompatMediaItem = str3;
        this.MediaSessionCompatQueueItem = str4;
        this.MediaMetadataCompat = z;
        this.PlaybackStateCompat = z2;
        this.MediaSessionCompatResultReceiverWrapper = z3;
        this.MediaSessionCompatToken = z4;
    }

    public final int hashCode() {
        int iM = af$$ExternalSyntheticOutline0.m(af$$ExternalSyntheticOutline0.m(af$$ExternalSyntheticOutline0.m(af$$ExternalSyntheticOutline0.m(527, 31, this.read), 31, this.MediaDescriptionCompat), 31, this.MediaBrowserCompatMediaItem), 31, this.MediaSessionCompatQueueItem);
        long j = this.RatingCompat;
        return ((((((((iM + ((int) (j ^ (j >>> 32)))) * 31) + (!this.MediaMetadataCompat ? 1 : 0)) * 31) + (!this.PlaybackStateCompat ? 1 : 0)) * 31) + (!this.MediaSessionCompatToken ? 1 : 0)) * 31) + (!this.MediaSessionCompatResultReceiverWrapper ? 1 : 0);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof isAutomaticLocationCollectionEnabled)) {
            return false;
        }
        isAutomaticLocationCollectionEnabled isautomaticlocationcollectionenabled = (isAutomaticLocationCollectionEnabled) obj;
        return isautomaticlocationcollectionenabled.read.equals(this.read) && isautomaticlocationcollectionenabled.MediaDescriptionCompat.equals(this.MediaDescriptionCompat) && isautomaticlocationcollectionenabled.MediaBrowserCompatMediaItem.equals(this.MediaBrowserCompatMediaItem) && isautomaticlocationcollectionenabled.MediaSessionCompatQueueItem.equals(this.MediaSessionCompatQueueItem) && isautomaticlocationcollectionenabled.RatingCompat == this.RatingCompat && isautomaticlocationcollectionenabled.MediaMetadataCompat == this.MediaMetadataCompat && isautomaticlocationcollectionenabled.PlaybackStateCompat == this.PlaybackStateCompat && isautomaticlocationcollectionenabled.MediaSessionCompatToken == this.MediaSessionCompatToken && isautomaticlocationcollectionenabled.MediaSessionCompatResultReceiverWrapper == this.MediaSessionCompatResultReceiverWrapper;
    }

    public static int write(String str, boolean z, int i, int i2) {
        while (i < i2) {
            char cCharAt = str.charAt(i);
            if (((cCharAt < ' ' && cCharAt != '\t') || cCharAt >= 127 || (cCharAt >= '0' && cCharAt <= '9') || ((cCharAt >= 'a' && cCharAt <= 'z') || ((cCharAt >= 'A' && cCharAt <= 'Z') || cCharAt == ':'))) == (!z)) {
                return i;
            }
            i++;
        }
        return i2;
    }
}
