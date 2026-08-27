package o;

import com.roadrunner.designsystem.compose.theme.tokens.Dimensions;
import com.roadrunner.tnc.TncComposableFactoryImpl$$ExternalSyntheticLambda0;

/* JADX INFO: loaded from: classes3.dex */
public abstract class AdjustBridgeInstance {
    private static int IconCompatParcelizer = 0;
    private static int read = 1;

    /* JADX WARN: Code duplicated, block: B:11:0x0034  */
    /* JADX WARN: Code duplicated, block: B:12:0x0036  */
    public static final void IconCompatParcelizer(String str, r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k0, getBirthDateFull getbirthdatefull, int i) {
        int i2;
        int i3;
        int i4;
        int i5 = 2 % 2;
        getPostalCode getpostalcode = (getPostalCode) getbirthdatefull;
        getpostalcode.MediaSessionCompatQueueItem(1204038897);
        boolean z = false;
        if ((i & 6) == 0) {
            int i6 = read + 3;
            IconCompatParcelizer = i6 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            if (i6 % 2 != 0) {
                int i7 = 67 / 0;
                if (getpostalcode.read(str)) {
                    i4 = 4;
                } else {
                    i4 = 2;
                }
            } else if (getpostalcode.read(str)) {
                i4 = 4;
            } else {
                i4 = 2;
            }
            i2 = i4 | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            if (getpostalcode.IconCompatParcelizer(r8lambdardpfsr94j4iebcwx_kpqzpm8k0)) {
                i3 = 32;
            } else {
                int i8 = read + 11;
                IconCompatParcelizer = i8 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                int i9 = i8 % 2;
                i3 = 16;
            }
            i2 |= i3;
            int i10 = IconCompatParcelizer + 49;
            read = i10 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i11 = i10 % 2;
        }
        if ((i2 & 19) != 18) {
            z = true;
        } else {
            int i12 = IconCompatParcelizer + 85;
            read = i12 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i13 = i12 % 2;
        }
        if (getpostalcode.write(i2 & 1, z)) {
            int i14 = read + 37;
            IconCompatParcelizer = i14 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i15 = i14 % 2;
            isValidParameter.IconCompatParcelizer(str, r8lambdardpfsr94j4iebcwx_kpqzpm8k0, androidx.compose.foundation.layout.PaddingKt.write(androidx.compose.ui.Modifier.Companion, Dimensions.getNestedScrollAxes), false, null, null, null, null, getpostalcode, i2 & 126, 504);
        } else {
            getpostalcode.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
        }
        getHandleruiannotations gethandleruiannotationsMediaDescriptionCompat = getpostalcode.MediaDescriptionCompat();
        if (gethandleruiannotationsMediaDescriptionCompat != null) {
            gethandleruiannotationsMediaDescriptionCompat.serializer = new r8lambday_zuDuH0rSLU3Q7PVVGz8MXtiaM(str, r8lambdardpfsr94j4iebcwx_kpqzpm8k0, i, 4);
        }
    }

    /* JADX WARN: Code duplicated, block: B:30:0x0068  */
    /* JADX WARN: Code duplicated, block: B:31:0x006a  */
    /* JADX WARN: Code duplicated, block: B:34:0x0074  */
    /* JADX WARN: Code duplicated, block: B:35:0x0078 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:36:0x007a  */
    /* JADX WARN: Code duplicated, block: B:37:0x0086  */
    /* JADX WARN: Code duplicated, block: B:41:0x00ac  */
    /* JADX WARN: Code duplicated, block: B:43:? A[RETURN, SYNTHETIC] */
    public static final void IconCompatParcelizer(androidx.compose.material3.SnackbarHostState snackbarHostState, onViewAttachedToWindow onviewattachedtowindow, androidx.compose.ui.Modifier modifier, getBirthDateFull getbirthdatefull, int i, int i2) {
        int i3;
        boolean z;
        androidx.compose.ui.Modifier modifier2;
        getHandleruiannotations gethandleruiannotationsMediaDescriptionCompat;
        int i4;
        int i5 = 2 % 2;
        snackbarHostState.getClass();
        onviewattachedtowindow.getClass();
        getPostalCode getpostalcode = (getPostalCode) getbirthdatefull;
        getpostalcode.MediaSessionCompatQueueItem(448820286);
        if ((i & 6) == 0) {
            if (getpostalcode.read(snackbarHostState)) {
                i4 = 4;
            } else {
                int i6 = read + 45;
                IconCompatParcelizer = i6 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                int i7 = i6 % 2;
                i4 = 2;
            }
            i3 = i4 | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= getpostalcode.read(onviewattachedtowindow) ? 32 : 16;
        }
        int i8 = i2 & 4;
        if (i8 == 0) {
            if ((i & 384) == 0) {
                i3 |= getpostalcode.read(modifier) ? androidx.compose.ui.graphics.Fields.RotationX : androidx.compose.ui.graphics.Fields.SpotShadowColor;
            }
            if ((i3 & 147) != 146) {
                z = true;
            } else {
                z = false;
            }
            if (!getpostalcode.write(i3 & 1, z)) {
                getpostalcode.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
            } else {
                if (i8 != 0) {
                    int i9 = read + 43;
                    IconCompatParcelizer = i9 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                    int i10 = i9 % 2;
                    modifier2 = androidx.compose.ui.Modifier.Companion;
                } else {
                    modifier2 = modifier;
                }
                androidx.compose.material3.SnackbarHostKt.read(snackbarHostState, modifier2, coil3.ExtrasKt.write(566731659, new TncComposableFactoryImpl$$ExternalSyntheticLambda0(7, onviewattachedtowindow), getpostalcode), getpostalcode, (i3 & 14) | 384 | ((i3 >> 3) & 112), 0);
                modifier = modifier2;
            }
            gethandleruiannotationsMediaDescriptionCompat = getpostalcode.MediaDescriptionCompat();
            if (gethandleruiannotationsMediaDescriptionCompat != null) {
                gethandleruiannotationsMediaDescriptionCompat.serializer = new AndroidAutofillManager((Object) snackbarHostState, (Object) onviewattachedtowindow, modifier, i, i2, 13);
            }
        }
        int i11 = read + 25;
        IconCompatParcelizer = i11 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i12 = i11 % 2;
        i3 |= 384;
        if ((i3 & 147) != 146) {
            z = true;
        } else {
            z = false;
        }
        if (!getpostalcode.write(i3 & 1, z)) {
            getpostalcode.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
        } else {
            if (i8 != 0) {
                int i13 = read + 43;
                IconCompatParcelizer = i13 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                int i14 = i13 % 2;
                modifier2 = androidx.compose.ui.Modifier.Companion;
            } else {
                modifier2 = modifier;
            }
            androidx.compose.material3.SnackbarHostKt.read(snackbarHostState, modifier2, coil3.ExtrasKt.write(566731659, new TncComposableFactoryImpl$$ExternalSyntheticLambda0(7, onviewattachedtowindow), getpostalcode), getpostalcode, (i3 & 14) | 384 | ((i3 >> 3) & 112), 0);
            modifier = modifier2;
        }
        gethandleruiannotationsMediaDescriptionCompat = getpostalcode.MediaDescriptionCompat();
        if (gethandleruiannotationsMediaDescriptionCompat != null) {
            gethandleruiannotationsMediaDescriptionCompat.serializer = new AndroidAutofillManager((Object) snackbarHostState, (Object) onviewattachedtowindow, modifier, i, i2, 13);
        }
    }
}
