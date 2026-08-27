package o;

import com.roadrunner.rrds.compose.component.screenstate.EmptyScreenKt;

/* JADX INFO: loaded from: classes3.dex */
public abstract class startForegroundTimerI {
    private static int IconCompatParcelizer = 0;
    private static int RemoteActionCompatParcelizer = 1;

    public static final void serializer(String str, String str2, r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k0, androidx.compose.ui.Modifier modifier, getBirthDateFull getbirthdatefull, int i) {
        int i2;
        int i3;
        int i4;
        int i5 = 2 % 2;
        str.getClass();
        str2.getClass();
        getPostalCode getpostalcode = (getPostalCode) getbirthdatefull;
        getpostalcode.MediaSessionCompatQueueItem(-1208072847);
        execSessionSuccessCallbackCommand execsessionsuccesscallbackcommand = null;
        if ((i & 6) == 0) {
            int i6 = RemoteActionCompatParcelizer + 77;
            IconCompatParcelizer = i6 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            if (i6 % 2 != 0) {
                getpostalcode.read(str);
                execsessionsuccesscallbackcommand.hashCode();
                throw null;
            }
            if (getpostalcode.read(str)) {
                i4 = 4;
            } else {
                int i7 = IconCompatParcelizer + 37;
                RemoteActionCompatParcelizer = i7 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                int i8 = i7 % 2;
                i4 = 2;
            }
            i2 = i4 | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            int i9 = RemoteActionCompatParcelizer + 59;
            IconCompatParcelizer = i9 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            if (i9 % 2 != 0) {
                getpostalcode.read(str2);
                throw null;
            }
            if (getpostalcode.read(str2)) {
                i3 = 32;
            } else {
                int i10 = RemoteActionCompatParcelizer + 51;
                IconCompatParcelizer = i10 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                int i11 = i10 % 2;
                i3 = 16;
            }
            i2 |= i3;
        }
        if ((i & 384) == 0) {
            i2 |= getpostalcode.IconCompatParcelizer(r8lambdardpfsr94j4iebcwx_kpqzpm8k0) ? androidx.compose.ui.graphics.Fields.RotationX : androidx.compose.ui.graphics.Fields.SpotShadowColor;
        }
        if ((i & 3072) == 0) {
            i2 |= getpostalcode.read(modifier) ? androidx.compose.ui.graphics.Fields.CameraDistance : androidx.compose.ui.graphics.Fields.RotationZ;
        }
        if (getpostalcode.write(i2 & 1, (i2 & 1171) != 1170)) {
            int i12 = RemoteActionCompatParcelizer + 1;
            IconCompatParcelizer = i12 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            if (i12 % 2 != 0) {
                execsessionsuccesscallbackcommand.hashCode();
                throw null;
            }
            if (r8lambdardpfsr94j4iebcwx_kpqzpm8k0 == null) {
                getpostalcode.serializer(2128133456);
                getpostalcode.IconCompatParcelizer(false);
            } else {
                getpostalcode.serializer(2128133457);
                execsessionsuccesscallbackcommand = new execSessionSuccessCallbackCommand(androidx.compose.ui.res.StringResources_androidKt.stringResource(com.logistics.rider.glovo.R.string.all_retry, getpostalcode, 0), r8lambdardpfsr94j4iebcwx_kpqzpm8k0);
                getpostalcode.IconCompatParcelizer(false);
            }
            EmptyScreenKt.EmptyScreen(new execSessionFailureCallbackCommand(str, str2, execsessionsuccesscallbackcommand, Integer.valueOf(com.logistics.rider.glovo.R.drawable.img_small_brand_map_error)), modifier, getpostalcode, (i2 >> 6) & 112);
        } else {
            getpostalcode.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
        }
        getHandleruiannotations gethandleruiannotationsMediaDescriptionCompat = getpostalcode.MediaDescriptionCompat();
        if (gethandleruiannotationsMediaDescriptionCompat != null) {
            gethandleruiannotationsMediaDescriptionCompat.serializer = new r8lambdaZJefYWkAb6Rz_mRy9JTC1Xi8DDk(str, str2, r8lambdardpfsr94j4iebcwx_kpqzpm8k0, modifier, i, 3);
        }
    }
}
