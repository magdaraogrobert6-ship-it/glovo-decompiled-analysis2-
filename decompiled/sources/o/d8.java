package o;

import android.content.Context;
import com.roadrunner.home.nest.NestScreenKt$$ExternalSyntheticLambda0;
import com.roadrunner.login.presentation.welcome.WelcomeContentKt;

/* JADX INFO: loaded from: classes3.dex */
public abstract class d8 {
    private static int read = 1;
    private static int write;

    public static final void serializer(da daVar, r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k0, r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k1, r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm, androidx.compose.ui.Modifier modifier, getBirthDateFull getbirthdatefull, int i) {
        int i2;
        boolean z;
        int i3;
        int i4;
        int i5;
        int i6 = 2 % 2;
        daVar.getClass();
        r8lambdardpfsr94j4iebcwx_kpqzpm8k0.getClass();
        r8lambdardpfsr94j4iebcwx_kpqzpm8k1.getClass();
        r8lambdaunavo3sxub_pc9xroryotnrlvsm.getClass();
        getPostalCode getpostalcode = (getPostalCode) getbirthdatefull;
        getpostalcode.MediaSessionCompatQueueItem(-1029290400);
        if ((i & 6) == 0) {
            int i7 = write + 9;
            read = i7 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i8 = i7 % 2;
            if (getpostalcode.IconCompatParcelizer(daVar)) {
                int i9 = write + 99;
                read = i9 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                int i10 = i9 % 2;
                i5 = 4;
            } else {
                i5 = 2;
            }
            i2 = i5 | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            if (getpostalcode.IconCompatParcelizer(r8lambdardpfsr94j4iebcwx_kpqzpm8k0)) {
                int i11 = read + 7;
                write = i11 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                int i12 = i11 % 2;
                i4 = 32;
            } else {
                i4 = 16;
            }
            i2 |= i4;
        }
        if ((i & 384) == 0) {
            i2 |= getpostalcode.IconCompatParcelizer(r8lambdardpfsr94j4iebcwx_kpqzpm8k1) ? 256 : androidx.compose.ui.graphics.Fields.SpotShadowColor;
        }
        if ((i & 3072) == 0) {
            int i13 = read + 63;
            write = i13 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i14 = i13 % 2;
            i2 |= getpostalcode.IconCompatParcelizer(r8lambdaunavo3sxub_pc9xroryotnrlvsm) ? androidx.compose.ui.graphics.Fields.CameraDistance : androidx.compose.ui.graphics.Fields.RotationZ;
        }
        if ((i & 24576) == 0) {
            int i15 = read + 61;
            write = i15 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i16 = i15 % 2;
            if (getpostalcode.read(modifier)) {
                int i17 = read + 87;
                write = i17 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                i3 = i17 % 2 != 0 ? 22163 : androidx.compose.ui.graphics.Fields.Clip;
            } else {
                i3 = 8192;
            }
            i2 |= i3;
        }
        if ((i2 & 9363) != 9362) {
            int i18 = read + 91;
            write = i18 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i19 = i18 % 2;
            z = true;
        } else {
            z = false;
        }
        if (getpostalcode.write(i2 & 1, z)) {
            Context context = (Context) getpostalcode.write((getNewPassword) androidx.compose.ui.platform.AndroidCompositionLocals_androidKt.getLocalContext());
            SemanticsOwnerKt semanticsOwnerKt = (SemanticsOwnerKt) getpostalcode.write((getNewPassword) getRootSemanticsNode.write);
            Object objComponentActivity = getpostalcode.ComponentActivity();
            AndroidContentCaptureManager androidContentCaptureManager = getCreditCardExpirationMonth.write;
            if (objComponentActivity == androidContentCaptureManager) {
                objComponentActivity = getPhoneNumberNational.RemoteActionCompatParcelizer(getpostalcode);
                getpostalcode.write(objComponentActivity);
            }
            getContentViewGroupParentLayout getcontentviewgroupparentlayout = (getContentViewGroupParentLayout) objComponentActivity;
            getQueryContext getquerycontext = daVar.read;
            boolean zIconCompatParcelizer = getpostalcode.IconCompatParcelizer(getcontentviewgroupparentlayout);
            boolean z2 = (i2 & 112) == 32;
            boolean z3 = (i2 & 896) == 256;
            Object objComponentActivity2 = getpostalcode.ComponentActivity();
            if ((zIconCompatParcelizer | z2 | z3) || objComponentActivity2 == androidContentCaptureManager) {
                objComponentActivity2 = new NestScreenKt$$ExternalSyntheticLambda0(getcontentviewgroupparentlayout, r8lambdardpfsr94j4iebcwx_kpqzpm8k0, r8lambdardpfsr94j4iebcwx_kpqzpm8k1, 11);
                getpostalcode.write(objComponentActivity2);
            }
            androidx.sqlite.SQLite.write(getquerycontext, (r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) objComponentActivity2, getpostalcode, 8);
            int i20 = i2 >> 6;
            WelcomeContentKt.WelcomeContent(daVar, r8lambdaunavo3sxub_pc9xroryotnrlvsm, modifier, getpostalcode, (i20 & 112) | (i2 & 14) | (i20 & 896));
            boolean zIconCompatParcelizer2 = getpostalcode.IconCompatParcelizer(context);
            boolean zIconCompatParcelizer3 = getpostalcode.IconCompatParcelizer(semanticsOwnerKt);
            Object objComponentActivity3 = getpostalcode.ComponentActivity();
            if ((zIconCompatParcelizer2 | zIconCompatParcelizer3) || objComponentActivity3 == androidContentCaptureManager) {
                objComponentActivity3 = new C0189o(context, semanticsOwnerKt, 1);
                getpostalcode.write(objComponentActivity3);
            }
            getPhoneNumberNational.serializer(createFromParcel.INSTANCE, (r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) objComponentActivity3, getpostalcode);
            int i21 = write + 15;
            read = i21 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i22 = i21 % 2;
        } else {
            getpostalcode.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
        }
        getHandleruiannotations gethandleruiannotationsMediaDescriptionCompat = getpostalcode.MediaDescriptionCompat();
        if (gethandleruiannotationsMediaDescriptionCompat != null) {
            gethandleruiannotationsMediaDescriptionCompat.serializer = new r8lambdag2v_8ZFcgEbevxAiKW6LalaYkVg((Object) daVar, (Object) r8lambdardpfsr94j4iebcwx_kpqzpm8k0, (Object) r8lambdardpfsr94j4iebcwx_kpqzpm8k1, r8lambdaunavo3sxub_pc9xroryotnrlvsm, modifier, i, 8);
        }
    }
}
