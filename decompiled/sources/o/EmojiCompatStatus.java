package o;

import com.roadrunner.designsystem.compose.theme.tokens.Dimensions;
import com.roadrunner.rrds.compose.component.dialog.messagedialog.MessagePopUpKt;

/* JADX INFO: loaded from: classes3.dex */
public abstract class EmojiCompatStatus {
    private static int read = 1;
    private static int write;

    public static final void serializer(AndroidTypefaceCache androidTypefaceCache, r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k0, r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k1, androidx.compose.ui.Modifier modifier, getBirthDateFull getbirthdatefull, int i) {
        int i2;
        androidx.compose.ui.Modifier modifier2;
        boolean zIconCompatParcelizer;
        int i3 = 2 % 2;
        int i4 = read + 115;
        write = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
        androidTypefaceCache.getClass();
        r8lambdardpfsr94j4iebcwx_kpqzpm8k0.getClass();
        r8lambdardpfsr94j4iebcwx_kpqzpm8k1.getClass();
        getPostalCode getpostalcode = (getPostalCode) getbirthdatefull;
        getpostalcode.MediaSessionCompatQueueItem(653491070);
        if ((i & 6) == 0) {
            if ((i & 8) == 0) {
                zIconCompatParcelizer = getpostalcode.read(androidTypefaceCache);
            } else {
                zIconCompatParcelizer = getpostalcode.IconCompatParcelizer(androidTypefaceCache);
            }
            i2 = (!(zIconCompatParcelizer ^ true) ? 4 : 2) | i;
            int i6 = read + 5;
            write = i6 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i7 = i6 % 2;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= getpostalcode.IconCompatParcelizer(r8lambdardpfsr94j4iebcwx_kpqzpm8k0) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= getpostalcode.IconCompatParcelizer(r8lambdardpfsr94j4iebcwx_kpqzpm8k1) ? androidx.compose.ui.graphics.Fields.RotationX : androidx.compose.ui.graphics.Fields.SpotShadowColor;
        }
        int i8 = i2 | 3072;
        if (getpostalcode.write(i8 & 1, (i8 & 1171) != 1170)) {
            modifier2 = androidx.compose.ui.Modifier.Companion;
            MessagePopUpKt.serializer(new generatePOSTBodyString(androidTypefaceCache.IconCompatParcelizer, false, androidTypefaceCache.serializer, androidTypefaceCache.write, null, androidTypefaceCache.RemoteActionCompatParcelizer, 104, null), r8lambdardpfsr94j4iebcwx_kpqzpm8k1, androidx.compose.foundation.layout.SizeKt.write(androidx.compose.foundation.layout.PaddingKt.write(modifier2, Dimensions.setActionBarVisibilityCallback), 1.0f), false, null, r8lambdardpfsr94j4iebcwx_kpqzpm8k0, null, r8lambdardpfsr94j4iebcwx_kpqzpm8k1, null, getpostalcode, ((i8 << 15) & 29360128) | ((i8 << 12) & 458752) | ((i8 >> 3) & 112) | 3072, 336);
        } else {
            getpostalcode.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
            modifier2 = modifier;
        }
        getHandleruiannotations gethandleruiannotationsMediaDescriptionCompat = getpostalcode.MediaDescriptionCompat();
        if (gethandleruiannotationsMediaDescriptionCompat != null) {
            gethandleruiannotationsMediaDescriptionCompat.serializer = new getHasCamera((Object) androidTypefaceCache, (Object) r8lambdardpfsr94j4iebcwx_kpqzpm8k0, (Object) r8lambdardpfsr94j4iebcwx_kpqzpm8k1, modifier2, i, 20);
        }
    }
}
