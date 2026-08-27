package o;

import com.roadrunner.designsystem.compose.theme.tokens.Dimensions;

/* JADX INFO: loaded from: classes3.dex */
public abstract class TextLayoutGetRangeForRectExtensions_androidKt {
    private static int RemoteActionCompatParcelizer = 1;
    private static int write;

    public static final void write(int i, getBirthDateFull getbirthdatefull, androidx.compose.ui.Modifier modifier, r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k0) {
        int i2;
        int i3;
        int i4;
        int i5 = 2 % 2;
        r8lambdardpfsr94j4iebcwx_kpqzpm8k0.getClass();
        getPostalCode getpostalcode = (getPostalCode) getbirthdatefull;
        getpostalcode.MediaSessionCompatQueueItem(973198464);
        if ((i & 6) == 0) {
            if (getpostalcode.read(modifier)) {
                int i6 = RemoteActionCompatParcelizer + 7;
                write = i6 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                int i7 = i6 % 2;
                i4 = 4;
            } else {
                i4 = 2;
            }
            i2 = i4 | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            int i8 = write + 65;
            RemoteActionCompatParcelizer = i8 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i9 = i8 % 2;
            if (!(!getpostalcode.IconCompatParcelizer(r8lambdardpfsr94j4iebcwx_kpqzpm8k0))) {
                int i10 = write + 103;
                RemoteActionCompatParcelizer = i10 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                int i11 = i10 % 2;
                i3 = 32;
            } else {
                i3 = 16;
            }
            i2 |= i3;
        }
        if (getpostalcode.write(i2 & 1, (i2 & 19) != 18)) {
            modifier.getClass();
            float f = Dimensions.setCustomView;
            equalEnum.IconCompatParcelizer(com.logistics.rider.glovo.R.drawable.ic_bold_large_arrow_with_tail_left, r8lambdardpfsr94j4iebcwx_kpqzpm8k0, modifier, false, null, f, f, getpostalcode, i2 & 112, 24);
        } else {
            getpostalcode.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
        }
        getHandleruiannotations gethandleruiannotationsMediaDescriptionCompat = getpostalcode.MediaDescriptionCompat();
        if (gethandleruiannotationsMediaDescriptionCompat != null) {
            gethandleruiannotationsMediaDescriptionCompat.serializer = new r8lambdaaawFTjN5WDWgcOgLP5ubNLgfVTw(modifier, r8lambdardpfsr94j4iebcwx_kpqzpm8k0, i, 3);
        }
    }
}
