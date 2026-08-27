package o;

import bo.app.af$$ExternalSyntheticOutline0;
import bo.app.c8$$ExternalSyntheticOutline0;
import bo.app.d$$ExternalSyntheticOutline0;
import com.huawei.riemann.location.common.utils.Constant;
import com.mapbox.navigation.voice.api.VoiceInstructionsFilePlayer$$ExternalSyntheticLambda0;
import java.util.Random;

/* JADX INFO: loaded from: classes3.dex */
public final class TextUnitTypeCompanion {
    public static int MediaSessionCompatResultReceiverWrapper = 0;
    private static int MediaSessionCompatToken = 1;
    public static int ParcelableVolumeInfo;
    private static int PlaybackStateCompatCustomAction;
    public final String IconCompatParcelizer;
    public final String MediaBrowserCompatMediaItem;
    public final long MediaDescriptionCompat;
    public final String MediaMetadataCompat;
    public final copyOhffZ5M MediaSessionCompatQueueItem;
    public final String RatingCompat;
    public final String RemoteActionCompatParcelizer;
    public final String read;
    public final String serializer;
    public final String write;

    public static /* synthetic */ Object write(int i, int i2, int i3, Object[] objArr, int i4, int i5, int i6) {
        int i7 = ~i6;
        int i8 = ~i;
        int i9 = ~i3;
        int i10 = (~(i8 | i9)) | i7;
        int i11 = (~(i3 | i)) | (~(i7 | i9));
        int i12 = ~(i9 | i6 | i);
        int i13 = i6 + i + i5 + ((-194346734) * i4) + (9035316 * i2);
        int i14 = i13 * i13;
        int i15 = (((-787818500) * i6) - 443744256) + ((-1492047866) * i) + (352114683 * i10) + (i11 * (-352114683)) + ((-352114683) * i12) + ((-1139933184) * i5) + (1190920192 * i4) + (1456996352 * i2) + ((-1774911488) * i14);
        int i16 = (i6 * 1174986172) + 1294669563 + (i * 1174986598) + (i10 * (-213)) + (i11 * Constant.ERROR_GYRO_TIME_DIFF_LARGE) + (i12 * Constant.ERROR_GYRO_TIME_DIFF_LARGE) + (i5 * 1174986385) + (i4 * (-1060063438)) + (i2 * 107475828) + (i14 * 168099840);
        return i15 + ((i16 * i16) * 40566784) != 1 ? serializer(objArr) : read(objArr);
    }

    private static /* synthetic */ Object serializer(Object[] objArr) {
        TextUnitTypeCompanion textUnitTypeCompanion = (TextUnitTypeCompanion) objArr[0];
        int i = 2 % 2;
        int i2 = MediaSessionCompatToken;
        int i3 = i2 + 93;
        PlaybackStateCompatCustomAction = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i4 = i3 % 2;
        long j = textUnitTypeCompanion.MediaDescriptionCompat;
        int i5 = i2 + 35;
        PlaybackStateCompatCustomAction = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i6 = i5 % 2;
        return Long.valueOf(j);
    }

    public final String IconCompatParcelizer() {
        int i = 2 % 2;
        int i2 = PlaybackStateCompatCustomAction + 47;
        int i3 = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        MediaSessionCompatToken = i3;
        int i4 = i2 % 2;
        String str = this.read;
        int i5 = i3 + 3;
        PlaybackStateCompatCustomAction = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i5 % 2 == 0) {
            return str;
        }
        throw null;
    }

    public final copyOhffZ5M MediaBrowserCompatMediaItem() {
        int i = 2 % 2;
        int i2 = PlaybackStateCompatCustomAction + 115;
        int i3 = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        MediaSessionCompatToken = i3;
        int i4 = i2 % 2;
        copyOhffZ5M copyohffz5m = this.MediaSessionCompatQueueItem;
        int i5 = i3 + 83;
        PlaybackStateCompatCustomAction = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i6 = i5 % 2;
        return copyohffz5m;
    }

    public final String MediaDescriptionCompat() {
        int i = 2 % 2;
        int i2 = PlaybackStateCompatCustomAction + 119;
        int i3 = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        MediaSessionCompatToken = i3;
        if (i2 % 2 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        String str = this.RatingCompat;
        int i4 = i3 + 53;
        PlaybackStateCompatCustomAction = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return str;
    }

    public final String MediaMetadataCompat() {
        String str;
        int i = 2 % 2;
        int i2 = MediaSessionCompatToken;
        int i3 = i2 + 61;
        PlaybackStateCompatCustomAction = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i3 % 2 != 0) {
            str = this.MediaBrowserCompatMediaItem;
            int i4 = 77 / 0;
        } else {
            str = this.MediaBrowserCompatMediaItem;
        }
        int i5 = i2 + 67;
        PlaybackStateCompatCustomAction = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i6 = i5 % 2;
        return str;
    }

    public final String RatingCompat() {
        int i = 2 % 2;
        int i2 = MediaSessionCompatToken + 117;
        int i3 = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        PlaybackStateCompatCustomAction = i3;
        if (i2 % 2 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        String str = this.MediaMetadataCompat;
        int i4 = i3 + 51;
        MediaSessionCompatToken = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return str;
    }

    public final String RemoteActionCompatParcelizer() {
        int i = 2 % 2;
        int i2 = PlaybackStateCompatCustomAction + 29;
        MediaSessionCompatToken = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            return this.serializer;
        }
        throw null;
    }

    public final String read() {
        int i = 2 % 2;
        int i2 = PlaybackStateCompatCustomAction;
        int i3 = i2 + 1;
        MediaSessionCompatToken = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i4 = i3 % 2;
        String str = this.write;
        int i5 = i2 + 69;
        MediaSessionCompatToken = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i6 = i5 % 2;
        return str;
    }

    public final String serializer() {
        int i = 2 % 2;
        int i2 = MediaSessionCompatToken + 111;
        PlaybackStateCompatCustomAction = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            return this.IconCompatParcelizer;
        }
        int i3 = 53 / 0;
        return this.IconCompatParcelizer;
    }

    public final String write() {
        int i = 2 % 2;
        int i2 = MediaSessionCompatToken + 53;
        int i3 = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        PlaybackStateCompatCustomAction = i3;
        if (i2 % 2 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        String str = this.RemoteActionCompatParcelizer;
        int i4 = i3 + 9;
        MediaSessionCompatToken = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return str;
    }

    public TextUnitTypeCompanion(long j, copyOhffZ5M copyohffz5m, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8) {
        str.getClass();
        str4.getClass();
        this.MediaDescriptionCompat = j;
        this.MediaSessionCompatQueueItem = copyohffz5m;
        this.IconCompatParcelizer = str;
        this.MediaBrowserCompatMediaItem = str2;
        this.RatingCompat = str3;
        this.RemoteActionCompatParcelizer = str4;
        this.write = str5;
        this.serializer = str6;
        this.read = str7;
        this.MediaMetadataCompat = str8;
    }

    public final String toString() {
        int i = 2 % 2;
        StringBuilder sb = new StringBuilder("SharedChatDelivery(id=");
        sb.append(this.MediaDescriptionCompat);
        sb.append(", status=");
        sb.append(this.MediaSessionCompatQueueItem);
        c8$$ExternalSyntheticOutline0.m(sb, ", confirmationNumber=", this.IconCompatParcelizer, ", vendorOrderNumber=", this.MediaBrowserCompatMediaItem);
        c8$$ExternalSyntheticOutline0.m(sb, ", paymentAmount=", this.RatingCompat, ", channelId=", this.RemoteActionCompatParcelizer);
        c8$$ExternalSyntheticOutline0.m(sb, ", customerAddress=", this.write, ", customerName=", this.serializer);
        String strM = d$$ExternalSyntheticOutline0.m(sb, ", customerPhoneNumber=REDACTED, instructions=", this.MediaMetadataCompat, ")");
        int i2 = MediaSessionCompatToken + 93;
        PlaybackStateCompatCustomAction = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        return strM;
    }

    public final int hashCode() {
        int iHashCode;
        int iHashCode2;
        int iHashCode3;
        int i = 2 % 2;
        int iM = af$$ExternalSyntheticOutline0.m((this.MediaSessionCompatQueueItem.hashCode() + (Long.hashCode(this.MediaDescriptionCompat) * 31)) * 31, 31, this.IconCompatParcelizer);
        String str = this.MediaBrowserCompatMediaItem;
        if (str == null) {
            int i2 = MediaSessionCompatToken + 115;
            PlaybackStateCompatCustomAction = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            if (i2 % 2 != 0) {
                int i3 = 3 / 3;
            }
            iHashCode = 0;
        } else {
            iHashCode = str.hashCode();
        }
        String str2 = this.RatingCompat;
        int iM2 = af$$ExternalSyntheticOutline0.m((((iM + iHashCode) * 31) + (str2 == null ? 0 : str2.hashCode())) * 31, 31, this.RemoteActionCompatParcelizer);
        String str3 = this.write;
        int iHashCode4 = str3 == null ? 0 : str3.hashCode();
        String str4 = this.serializer;
        if (str4 == null) {
            int i4 = PlaybackStateCompatCustomAction + 3;
            MediaSessionCompatToken = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            iHashCode2 = i4 % 2 == 0 ? 1 : 0;
        } else {
            iHashCode2 = str4.hashCode();
        }
        String str5 = this.read;
        if (str5 == null) {
            int i5 = MediaSessionCompatToken + 27;
            PlaybackStateCompatCustomAction = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            if (i5 % 2 != 0) {
                int i6 = 3 % 2;
            }
            iHashCode3 = 0;
        } else {
            iHashCode3 = str5.hashCode();
        }
        String str6 = this.MediaMetadataCompat;
        return ((((((iM2 + iHashCode4) * 31) + iHashCode2) * 31) + iHashCode3) * 31) + (str6 != null ? str6.hashCode() : 0);
    }

    /* JADX WARN: Code restructure failed: missing block: B:36:0x017c, code lost:
    
        if (((java.lang.Boolean) o.removeNodeAtDepth.RemoteActionCompatParcelizer(o.getCieXyz.write(), 1803334089, -1803334089, o.getCieXyz.write(), o.getCieXyz.write(), r19, o.getCieXyz.write())).booleanValue() != false) goto L37;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static /* synthetic */ java.lang.Object read(java.lang.Object[] r21) {
        /*
            Method dump skipped, instruction units count: 408
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: o.TextUnitTypeCompanion.read(java.lang.Object[]):java.lang.Object");
    }

    public static int PlaybackStateCompat() {
        int i = ParcelableVolumeInfo;
        int i2 = i % 8065205;
        ParcelableVolumeInfo = i + 1;
        if (i2 != 0) {
            return MediaSessionCompatResultReceiverWrapper;
        }
        int iNextInt = new Random().nextInt(1264023821);
        MediaSessionCompatResultReceiverWrapper = iNextInt;
        return iNextInt;
    }

    public final long MediaSessionCompatQueueItem() {
        int iIconCompatParcelizer = VoiceInstructionsFilePlayer$$ExternalSyntheticLambda0.IconCompatParcelizer();
        int iIconCompatParcelizer2 = VoiceInstructionsFilePlayer$$ExternalSyntheticLambda0.IconCompatParcelizer();
        int iIconCompatParcelizer3 = VoiceInstructionsFilePlayer$$ExternalSyntheticLambda0.IconCompatParcelizer();
        return ((Long) write(1563797762, VoiceInstructionsFilePlayer$$ExternalSyntheticLambda0.IconCompatParcelizer(), iIconCompatParcelizer, new Object[]{this}, iIconCompatParcelizer3, iIconCompatParcelizer2, -1563797762)).longValue();
    }

    public final boolean equals(Object obj) {
        int iIconCompatParcelizer = VoiceInstructionsFilePlayer$$ExternalSyntheticLambda0.IconCompatParcelizer();
        int iIconCompatParcelizer2 = VoiceInstructionsFilePlayer$$ExternalSyntheticLambda0.IconCompatParcelizer();
        int iIconCompatParcelizer3 = VoiceInstructionsFilePlayer$$ExternalSyntheticLambda0.IconCompatParcelizer();
        return ((Boolean) write(-215955755, VoiceInstructionsFilePlayer$$ExternalSyntheticLambda0.IconCompatParcelizer(), iIconCompatParcelizer, new Object[]{this, obj}, iIconCompatParcelizer3, iIconCompatParcelizer2, 215955756)).booleanValue();
    }
}
