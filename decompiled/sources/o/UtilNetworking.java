package o;

import androidx.compose.ui.tooling.PreviewActivity$$ExternalSyntheticLambda2;
import com.roadrunner.home.nest.NestScreenKt$$ExternalSyntheticLambda0;

/* JADX INFO: loaded from: classes3.dex */
public abstract class UtilNetworking {
    private static int RemoteActionCompatParcelizer = 0;
    private static int read = 1;

    /* JADX WARN: Code duplicated, block: B:69:0x010f  */
    /* JADX WARN: Code duplicated, block: B:84:0x0144  */
    public static final void write(String str, String str2, androidx.compose.ui.Modifier modifier, r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm, r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm2, r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm3, getBirthDateFull getbirthdatefull, int i) {
        int i2;
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        int i3;
        int i4 = 2 % 2;
        str2.getClass();
        r8lambdaunavo3sxub_pc9xroryotnrlvsm3.getClass();
        getPostalCode getpostalcode = (getPostalCode) getbirthdatefull;
        getpostalcode.MediaSessionCompatQueueItem(-44979227);
        if ((i & 6) == 0) {
            i2 = (getpostalcode.read(str) ? 4 : 2) | i;
        } else {
            int i5 = RemoteActionCompatParcelizer + 15;
            read = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i6 = i5 % 2;
            i2 = i;
        }
        if ((i & 48) == 0) {
            int i7 = read + 75;
            RemoteActionCompatParcelizer = i7 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i8 = i7 % 2;
            i2 |= !(getpostalcode.read(str2) ^ true) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            if (getpostalcode.read(modifier)) {
                int i9 = RemoteActionCompatParcelizer + 17;
                read = i9 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                int i10 = i9 % 2;
                i3 = androidx.compose.ui.graphics.Fields.RotationX;
            } else {
                i3 = androidx.compose.ui.graphics.Fields.SpotShadowColor;
            }
            i2 |= i3;
        }
        int i11 = i2 | 27648;
        if ((196608 & i) == 0) {
            i11 |= getpostalcode.IconCompatParcelizer(r8lambdaunavo3sxub_pc9xroryotnrlvsm) ? androidx.compose.ui.graphics.Fields.RenderEffect : 65536;
        }
        if ((1572864 & i) == 0) {
            i11 |= getpostalcode.IconCompatParcelizer(r8lambdaunavo3sxub_pc9xroryotnrlvsm2) ? 1048576 : androidx.compose.ui.graphics.Fields.BlendMode;
        }
        Object obj = null;
        if ((12582912 & i) == 0) {
            int i12 = read + 45;
            RemoteActionCompatParcelizer = i12 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            if (i12 % 2 != 0) {
                getpostalcode.IconCompatParcelizer(r8lambdaunavo3sxub_pc9xroryotnrlvsm3);
                obj.hashCode();
                throw null;
            }
            i11 |= getpostalcode.IconCompatParcelizer(r8lambdaunavo3sxub_pc9xroryotnrlvsm3) ? 8388608 : 4194304;
        }
        if ((4793491 & i11) != 4793490) {
            int i13 = read + 67;
            RemoteActionCompatParcelizer = i13 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i14 = i13 % 2;
            z = true;
        } else {
            z = false;
        }
        if (getpostalcode.write(i11 & 1, z)) {
            int i15 = read + 103;
            int i16 = i15 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            RemoteActionCompatParcelizer = i16;
            int i17 = i15 % 2;
            boolean z6 = (57344 & i11) == 16384;
            int i18 = i11 & 14;
            if (i18 == 4) {
                int i19 = i16 + 41;
                read = i19 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                int i20 = i19 % 2;
                z2 = true;
            } else {
                z2 = false;
            }
            int i21 = i11 & 112;
            if (i21 == 32) {
                int i22 = i16 + 55;
                read = i22 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                if (i22 % 2 == 0) {
                    z3 = false;
                } else {
                    z3 = true;
                }
            } else {
                z3 = false;
            }
            boolean z7 = (29360128 & i11) == 8388608;
            boolean z8 = (458752 & i11) == 131072;
            Object objComponentActivity = getpostalcode.ComponentActivity();
            AndroidContentCaptureManager androidContentCaptureManager = getCreditCardExpirationMonth.write;
            if (!(!(z7 | z2 | z6 | z3 | z8))) {
                objComponentActivity = new PreviewActivity$$ExternalSyntheticLambda2(r8lambdaunavo3sxub_pc9xroryotnrlvsm, str, str2, r8lambdaunavo3sxub_pc9xroryotnrlvsm3);
                getpostalcode.write(objComponentActivity);
            } else {
                int i23 = read + 39;
                RemoteActionCompatParcelizer = i23 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                if (i23 % 2 != 0) {
                    throw null;
                }
                if (objComponentActivity == androidContentCaptureManager) {
                    objComponentActivity = new PreviewActivity$$ExternalSyntheticLambda2(r8lambdaunavo3sxub_pc9xroryotnrlvsm, str, str2, r8lambdaunavo3sxub_pc9xroryotnrlvsm3);
                    getpostalcode.write(objComponentActivity);
                }
            }
            r8lambdafjQ9B8d5OSR_i2BAJDXqNW6RNrY r8lambdafjq9b8d5osr_i2bajdxqnw6rnry = (r8lambdafjQ9B8d5OSR_i2BAJDXqNW6RNrY) objComponentActivity;
            boolean z9 = i18 == 4;
            if (i21 == 32) {
                z5 = false;
                z4 = true;
            } else {
                z4 = true;
                z5 = true;
            }
            boolean z10 = !z5;
            boolean z11 = (i11 & 7168) == 2048 ? z4 : false;
            boolean z12 = (3670016 & i11) == 1048576 ? z4 : false;
            Object objComponentActivity2 = getpostalcode.ComponentActivity();
            if ((z9 | z10 | z11 | z12) || objComponentActivity2 == androidContentCaptureManager) {
                objComponentActivity2 = new NestScreenKt$$ExternalSyntheticLambda0(r8lambdaunavo3sxub_pc9xroryotnrlvsm2, str, str2, 17);
                getpostalcode.write(objComponentActivity2);
            }
            androidx.compose.ui.viewinterop.AndroidViewBindingKt.AndroidViewBinding(r8lambdafjq9b8d5osr_i2bajdxqnw6rnry, modifier, (r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) objComponentActivity2, getpostalcode, (i11 >> 3) & 112, 0);
        } else {
            getpostalcode.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
        }
        getHandleruiannotations gethandleruiannotationsMediaDescriptionCompat = getpostalcode.MediaDescriptionCompat();
        if (gethandleruiannotationsMediaDescriptionCompat != null) {
            gethandleruiannotationsMediaDescriptionCompat.serializer = new getKeyboardKindJ9_QTjY((Object) str, (Object) str2, modifier, (Object) r8lambdaunavo3sxub_pc9xroryotnrlvsm, (Object) r8lambdaunavo3sxub_pc9xroryotnrlvsm2, (Object) r8lambdaunavo3sxub_pc9xroryotnrlvsm3, i, 26);
        }
    }
}
