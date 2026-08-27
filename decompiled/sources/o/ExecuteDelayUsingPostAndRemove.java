package o;

import androidx.navigation.compose.NavHostKt$NavHost$29$1$$ExternalSyntheticLambda0;
import bo.app.b8$$ExternalSyntheticLambda4;
import com.roadrunner.rrds.compose.component.forms.pattern.LoadingFullScreenKt;

/* JADX INFO: loaded from: classes3.dex */
public abstract class ExecuteDelayUsingPostAndRemove {
    private static int IconCompatParcelizer = 0;
    private static int serializer = 1;

    public static final void IconCompatParcelizer(r8lambdaG2Lta7vZPQRir3Ldpv_t1nZTSzg r8lambdag2lta7vzpqrir3ldpv_t1nztszg, r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k0, r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k1, androidx.compose.ui.Modifier modifier, getBirthDateFull getbirthdatefull, int i) {
        int i2;
        boolean z;
        int i3 = 2 % 2;
        int i4 = serializer + 15;
        IconCompatParcelizer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
        r8lambdag2lta7vzpqrir3ldpv_t1nztszg.getClass();
        r8lambdardpfsr94j4iebcwx_kpqzpm8k0.getClass();
        r8lambdardpfsr94j4iebcwx_kpqzpm8k1.getClass();
        getPostalCode getpostalcode = (getPostalCode) getbirthdatefull;
        getpostalcode.MediaSessionCompatQueueItem(-1621180372);
        if ((i & 6) == 0) {
            int i6 = 4;
            if (getpostalcode.read(r8lambdag2lta7vzpqrir3ldpv_t1nztszg)) {
                int i7 = IconCompatParcelizer + 83;
                serializer = i7 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                if (i7 % 2 == 0) {
                    i6 = 3;
                }
            } else {
                int i8 = serializer + 99;
                IconCompatParcelizer = i8 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                if (i8 % 2 != 0) {
                    int i9 = 4 / 4;
                }
                i6 = 2;
            }
            i2 = i6 | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= getpostalcode.IconCompatParcelizer(r8lambdardpfsr94j4iebcwx_kpqzpm8k0) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= getpostalcode.IconCompatParcelizer(r8lambdardpfsr94j4iebcwx_kpqzpm8k1) ? androidx.compose.ui.graphics.Fields.RotationX : androidx.compose.ui.graphics.Fields.SpotShadowColor;
        }
        if ((i & 3072) == 0) {
            i2 |= getpostalcode.read(modifier) ? androidx.compose.ui.graphics.Fields.CameraDistance : androidx.compose.ui.graphics.Fields.RotationZ;
        }
        if ((i2 & 1171) != 1170) {
            int i10 = serializer;
            int i11 = i10 + 39;
            IconCompatParcelizer = i11 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i12 = i11 % 2;
            int i13 = i10 + 95;
            IconCompatParcelizer = i13 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i14 = i13 % 2;
            z = true;
        } else {
            z = false;
        }
        if (getpostalcode.write(i2 & 1, z)) {
            Object objComponentActivity = getpostalcode.ComponentActivity();
            if (objComponentActivity == getCreditCardExpirationMonth.write) {
                objComponentActivity = new b8$$ExternalSyntheticLambda4(1);
                getpostalcode.write(objComponentActivity);
            }
            DefaultContentCardsUpdateHandlerCompanionCREATOR1.IconCompatParcelizer(false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) objComponentActivity, getpostalcode, 48, 1);
            LoadingFullScreenKt.m5039LoadingFullScreenSj8uqqQ(r8lambdag2lta7vzpqrir3ldpv_t1nztszg instanceof SemanticsSortKtUnmergedConfigComparator11, modifier, null, null, coil3.ExtrasKt.write(-1541667916, new NavHostKt$NavHost$29$1$$ExternalSyntheticLambda0(r8lambdag2lta7vzpqrir3ldpv_t1nztszg, r8lambdardpfsr94j4iebcwx_kpqzpm8k0, r8lambdardpfsr94j4iebcwx_kpqzpm8k1, 5), getpostalcode), getpostalcode, ((i2 >> 6) & 112) | 24576, 12);
        } else {
            getpostalcode.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
        }
        getHandleruiannotations gethandleruiannotationsMediaDescriptionCompat = getpostalcode.MediaDescriptionCompat();
        if (gethandleruiannotationsMediaDescriptionCompat != null) {
            gethandleruiannotationsMediaDescriptionCompat.serializer = new getHasCamera((Object) r8lambdag2lta7vzpqrir3ldpv_t1nztszg, (Object) r8lambdardpfsr94j4iebcwx_kpqzpm8k0, (Object) r8lambdardpfsr94j4iebcwx_kpqzpm8k1, modifier, i, 5);
        }
        int i15 = IconCompatParcelizer + 67;
        serializer = i15 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i15 % 2 == 0) {
            throw null;
        }
    }
}
