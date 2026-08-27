package o;

import androidx.compose.foundation.pager.PagerDefaults$$ExternalSyntheticLambda0;
import com.roadrunner.designsystem.compose.theme.tokens.Dimensions;

/* JADX INFO: loaded from: classes3.dex */
public abstract class ComposeViewAdapterFakeViewModelStoreOwner1 {
    private static int RemoteActionCompatParcelizer = 0;
    private static int serializer = 1;

    public static final void serializer(int i, getBirthDateFull getbirthdatefull, androidx.compose.ui.Modifier modifier, Integer num, String str) {
        int i2;
        int i3;
        int i4;
        int i5 = 2 % 2;
        str.getClass();
        getPostalCode getpostalcode = (getPostalCode) getbirthdatefull;
        getpostalcode.MediaSessionCompatQueueItem(-1123807699);
        if ((i & 6) == 0) {
            if (getpostalcode.read(str)) {
                int i6 = serializer + 101;
                RemoteActionCompatParcelizer = i6 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
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
            i2 |= getpostalcode.read(num) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            if (getpostalcode.read(modifier)) {
                int i8 = serializer + 25;
                RemoteActionCompatParcelizer = i8 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                i3 = i8 % 2 != 0 ? 31853 : androidx.compose.ui.graphics.Fields.RotationX;
            } else {
                i3 = androidx.compose.ui.graphics.Fields.SpotShadowColor;
            }
            i2 |= i3;
        }
        if (getpostalcode.write(i2 & 1, !((i2 & 147) == 146))) {
            getCurrentSessionimpl.read(modifier, androidx.compose.foundation.shape.RoundedCornerShapeKt.IconCompatParcelizer(Dimensions.setPadding), null, null, null, coil3.ExtrasKt.write(183514783, new PagerDefaults$$ExternalSyntheticLambda0(num, 12, str), getpostalcode), getpostalcode, ((i2 >> 6) & 14) | 196608, 28);
            int i9 = RemoteActionCompatParcelizer + 71;
            serializer = i9 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i10 = i9 % 2;
        } else {
            getpostalcode.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
        }
        getHandleruiannotations gethandleruiannotationsMediaDescriptionCompat = getpostalcode.MediaDescriptionCompat();
        if (gethandleruiannotationsMediaDescriptionCompat != null) {
            gethandleruiannotationsMediaDescriptionCompat.serializer = new o8ExternalSyntheticLambda1(str, num, modifier, i);
        }
    }
}
