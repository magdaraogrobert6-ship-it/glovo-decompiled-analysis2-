package o;

import com.roadrunner.rrds.compose.component.message.BannerMessageKt;

/* JADX INFO: loaded from: classes3.dex */
public abstract class enableSendingInBackground {
    private static int IconCompatParcelizer = 0;
    private static int RemoteActionCompatParcelizer = 1;

    public static final void IconCompatParcelizer(int i, getBirthDateFull getbirthdatefull, androidx.compose.ui.Modifier modifier, String str, String str2, String str3, r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k0) {
        int i2;
        String strStringResource;
        String strStringResource2;
        int i3;
        String str4;
        String str5;
        String str6;
        String str7;
        int i4 = 2 % 2;
        r8lambdardpfsr94j4iebcwx_kpqzpm8k0.getClass();
        getPostalCode getpostalcode = (getPostalCode) getbirthdatefull;
        getpostalcode.MediaSessionCompatQueueItem(750747392);
        if ((i & 6) == 0) {
            i2 = (getpostalcode.IconCompatParcelizer(r8lambdardpfsr94j4iebcwx_kpqzpm8k0) ? 4 : 2) | i;
        } else {
            int i5 = RemoteActionCompatParcelizer + 17;
            IconCompatParcelizer = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i6 = i5 % 2;
            i2 = i;
        }
        if ((i & 48) == 0) {
            int i7 = RemoteActionCompatParcelizer + 71;
            IconCompatParcelizer = i7 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i8 = i7 % 2;
            i2 |= getpostalcode.read(modifier) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= androidx.compose.ui.graphics.Fields.SpotShadowColor;
        }
        if ((i & 3072) == 0) {
            i2 |= androidx.compose.ui.graphics.Fields.RotationZ;
        }
        if ((i & 24576) == 0) {
            i2 |= 8192;
        }
        if (!getpostalcode.write(i2 & 1, (i2 & 9363) != 9362)) {
            getpostalcode.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
            int i9 = IconCompatParcelizer + 43;
            RemoteActionCompatParcelizer = i9 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i10 = i9 % 2;
            str7 = str;
            str6 = str2;
            str5 = str3;
        } else {
            getpostalcode.r8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss();
            if ((i & 1) == 0 || getpostalcode.PlaybackStateCompat()) {
                strStringResource = androidx.compose.ui.res.StringResources_androidKt.stringResource(com.logistics.rider.glovo.R.string.rider_safety_safe_trip_rate_header_title, getpostalcode, 0);
                String strStringResource3 = androidx.compose.ui.res.StringResources_androidKt.stringResource(com.logistics.rider.glovo.R.string.rider_safety_safe_trip_rate_header_body, getpostalcode, 0);
                strStringResource2 = androidx.compose.ui.res.StringResources_androidKt.stringResource(com.logistics.rider.glovo.R.string.got_it, getpostalcode, 0);
                i3 = i2 & (-65409);
                str4 = strStringResource3;
            } else {
                getpostalcode.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
                int i11 = i2 & (-65409);
                str4 = str2;
                strStringResource2 = str3;
                i3 = i11;
                strStringResource = str;
            }
            getpostalcode.RemoteActionCompatParcelizer();
            BannerMessageKt.IconCompatParcelizer(modifier, (androidx.compose.ui.graphics.vector.ImageVector) null, "👋", strStringResource, str4, strStringResource2, enableBridgeSecurity.SECONDARY_SMALL, r8lambdardpfsr94j4iebcwx_kpqzpm8k0, getpostalcode, ((i3 >> 3) & 14) | 12583296 | ((i3 << 24) & 234881024), 34);
            str5 = strStringResource2;
            str6 = str4;
            str7 = strStringResource;
        }
        getHandleruiannotations gethandleruiannotationsMediaDescriptionCompat = getpostalcode.MediaDescriptionCompat();
        if (gethandleruiannotationsMediaDescriptionCompat != null) {
            gethandleruiannotationsMediaDescriptionCompat.serializer = new stopIgnoring(r8lambdardpfsr94j4iebcwx_kpqzpm8k0, modifier, str7, str6, str5, i);
        }
    }
}
