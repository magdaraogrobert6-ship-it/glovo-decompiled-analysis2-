package o;

import androidx.navigation.compose.NavHostKt$NavHost$29$1$$ExternalSyntheticLambda0;
import com.roadrunner.rrds.compose.component.dialog.messagedialog.MessagePopUpKt;
import com.roadrunner.rrds.compose.component.forms.pattern.LoadingFullScreenKt;

/* JADX INFO: loaded from: classes3.dex */
public abstract class setContainer {
    private static int IconCompatParcelizer = 1;
    private static int RemoteActionCompatParcelizer;

    public static final void IconCompatParcelizer(setContentType setcontenttype, r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k0, androidx.compose.ui.Modifier modifier, getBirthDateFull getbirthdatefull, int i) {
        int i2;
        boolean z;
        androidx.compose.ui.Modifier modifier2;
        int i3;
        int i4 = 2 % 2;
        int i5 = RemoteActionCompatParcelizer + 61;
        IconCompatParcelizer = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i6 = i5 % 2;
        setcontenttype.getClass();
        r8lambdardpfsr94j4iebcwx_kpqzpm8k0.getClass();
        getPostalCode getpostalcode = (getPostalCode) getbirthdatefull;
        getpostalcode.MediaSessionCompatQueueItem(-1241117919);
        if ((i & 6) == 0) {
            int i7 = RemoteActionCompatParcelizer + 7;
            IconCompatParcelizer = i7 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            i2 = i | ((i7 % 2 != 0 ? (i & 8) != 0 : (i & 37) != 0) ? getpostalcode.IconCompatParcelizer(setcontenttype) : getpostalcode.read(setcontenttype) ? 4 : 2);
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            if (getpostalcode.IconCompatParcelizer(r8lambdardpfsr94j4iebcwx_kpqzpm8k0)) {
                int i8 = IconCompatParcelizer + 51;
                RemoteActionCompatParcelizer = i8 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                i3 = i8 % 2 != 0 ? 70 : 32;
            } else {
                i3 = 16;
            }
            i2 |= i3;
        }
        int i9 = i2 | 384;
        if ((i9 & 147) != 146) {
            int i10 = IconCompatParcelizer + 101;
            RemoteActionCompatParcelizer = i10 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i11 = i10 % 2;
            z = true;
        } else {
            z = false;
        }
        if (getpostalcode.write(i9 & 1, z)) {
            androidx.compose.ui.Modifier.Companion companion = androidx.compose.ui.Modifier.Companion;
            LoadingFullScreenKt.m5039LoadingFullScreenSj8uqqQ(setcontenttype.IconCompatParcelizer, null, null, null, coil3.ExtrasKt.write(-1007900503, new NavHostKt$NavHost$29$1$$ExternalSyntheticLambda0(setcontenttype, r8lambdardpfsr94j4iebcwx_kpqzpm8k0, companion, 4), getpostalcode), getpostalcode, 24576, 14);
            modifier2 = companion;
        } else {
            getpostalcode.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
            modifier2 = modifier;
        }
        getHandleruiannotations gethandleruiannotationsMediaDescriptionCompat = getpostalcode.MediaDescriptionCompat();
        if (gethandleruiannotationsMediaDescriptionCompat != null) {
            gethandleruiannotationsMediaDescriptionCompat.serializer = new accessgetReusableRectp(i, 13, modifier2, (Object) setcontenttype, (Object) r8lambdardpfsr94j4iebcwx_kpqzpm8k0);
        }
    }

    public static final void read(generatePOSTBodyString generatepostbodystring, r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k0, androidx.compose.ui.Modifier modifier, getBirthDateFull getbirthdatefull, int i) {
        int i2;
        boolean zIconCompatParcelizer;
        int i3 = 2;
        int i4 = 2 % 2;
        getPostalCode getpostalcode = (getPostalCode) getbirthdatefull;
        getpostalcode.MediaSessionCompatQueueItem(1641907698);
        if ((i & 6) == 0) {
            int i5 = RemoteActionCompatParcelizer + 5;
            IconCompatParcelizer = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            if (i5 % 2 != 0 ? (i & 8) == 0 : (i & 98) == 0) {
                zIconCompatParcelizer = getpostalcode.read(generatepostbodystring);
            } else {
                zIconCompatParcelizer = getpostalcode.IconCompatParcelizer(generatepostbodystring);
            }
            if (zIconCompatParcelizer) {
                int i6 = RemoteActionCompatParcelizer + 71;
                IconCompatParcelizer = i6 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                int i7 = i6 % 2;
                i3 = 4;
            }
            i2 = i3 | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= getpostalcode.IconCompatParcelizer(r8lambdardpfsr94j4iebcwx_kpqzpm8k0) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= !getpostalcode.read(modifier) ? androidx.compose.ui.graphics.Fields.SpotShadowColor : androidx.compose.ui.graphics.Fields.RotationX;
        }
        if (getpostalcode.write(i2 & 1, (i2 & 147) != 146)) {
            MessagePopUpKt.serializer(generatepostbodystring, r8lambdardpfsr94j4iebcwx_kpqzpm8k0, modifier, false, null, r8lambdardpfsr94j4iebcwx_kpqzpm8k0, null, null, null, getpostalcode, (i2 & 1022) | ((i2 << 12) & 458752), 472);
        } else {
            getpostalcode.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
        }
        getHandleruiannotations gethandleruiannotationsMediaDescriptionCompat = getpostalcode.MediaDescriptionCompat();
        if (gethandleruiannotationsMediaDescriptionCompat != null) {
            gethandleruiannotationsMediaDescriptionCompat.serializer = new accessgetReusableRectp(i, 14, modifier, (Object) generatepostbodystring, (Object) r8lambdardpfsr94j4iebcwx_kpqzpm8k0);
        }
    }
}
