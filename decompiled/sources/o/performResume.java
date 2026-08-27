package o;

import com.roadrunner.rrds.compose.component.indicators.shimmer.ShimmeringHorizontalBarKt;

/* JADX INFO: loaded from: classes3.dex */
public abstract class performResume {
    private static int read = 1;
    private static int write;

    public static final void read(androidx.compose.ui.Modifier modifier, getBirthDateFull getbirthdatefull, int i) {
        int i2 = 2 % 2;
        int i3 = read + 9;
        write = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i4 = i3 % 2;
        getPostalCode getpostalcode = (getPostalCode) getbirthdatefull;
        getpostalcode.MediaSessionCompatQueueItem(-1513976467);
        int i5 = i | 6;
        if (getpostalcode.write(i5 & 1, (i5 & 3) != 2)) {
            int i6 = write + 85;
            read = i6 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i7 = i6 % 2;
            modifier = androidx.compose.ui.Modifier.Companion;
            ShimmeringHorizontalBarKt.m5052ShimmeringHorizontalBarCgnh0Qk(((buildMapping) getpostalcode.write((getNewPassword) performMeasureDjhGOtQ.RemoteActionCompatParcelizer)).setEmojiCompatEnabled(), modifier, 0.0f, 0.0f, 0.0f, 0, 0, getpostalcode, (i5 << 3) & 112, 124);
        } else {
            getpostalcode.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
        }
        getHandleruiannotations gethandleruiannotationsMediaDescriptionCompat = getpostalcode.MediaDescriptionCompat();
        if (gethandleruiannotationsMediaDescriptionCompat != null) {
            gethandleruiannotationsMediaDescriptionCompat.serializer = new getLayers(modifier, i, 17);
        }
    }
}
