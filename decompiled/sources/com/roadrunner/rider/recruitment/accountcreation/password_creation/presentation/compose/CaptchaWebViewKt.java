package com.roadrunner.rider.recruitment.accountcreation.password_creation.presentation.compose;

import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Fields;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.viewinterop.AndroidView_androidKt;
import androidx.navigation.internal.NavControllerImpl$$ExternalSyntheticLambda0;
import com.roadrunner.nafath.NafathTimerManager$observeCountdown$1;
import java.util.concurrent.atomic.AtomicBoolean;
import o.AndroidContentCaptureManager;
import o.ShortNewsContentCardView;
import o.createFromParcel;
import o.getBirthDateFull;
import o.getCreditCardExpirationMonth;
import o.getEventType;
import o.getHandleruiannotations;
import o.getPhoneNumberNational;
import o.getPostalCode;
import o.getSessionParameters;
import o.hasValidPointerSourcedefault;
import o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0;
import o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM;
import o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0;

/* JADX INFO: loaded from: classes3.dex */
public abstract class CaptchaWebViewKt {
    private static int read = 0;
    private static int serializer = 1;

    public static final void CaptchaWebView(String str, Modifier modifier, long j, r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm, r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm2, getBirthDateFull getbirthdatefull, int i) {
        int i2;
        boolean z;
        Modifier modifier2;
        long j2;
        boolean z2;
        boolean z3;
        int i3;
        int i4 = 2 % 2;
        getPostalCode getpostalcode = (getPostalCode) getbirthdatefull;
        getpostalcode.MediaSessionCompatQueueItem(426751714);
        if ((i & 6) == 0) {
            if (getpostalcode.read(str)) {
                int i5 = serializer + 125;
                read = i5 % Fields.SpotShadowColor;
                int i6 = i5 % 2;
                i3 = 4;
            } else {
                i3 = 2;
            }
            i2 = i3 | i;
        } else {
            i2 = i;
        }
        int i7 = i2 | 432;
        if ((i & 3072) == 0) {
            i7 |= getpostalcode.IconCompatParcelizer(r8lambdaunavo3sxub_pc9xroryotnrlvsm) ? 2048 : Fields.RotationZ;
        }
        if ((i & 24576) == 0) {
            int i8 = serializer + 93;
            read = i8 % Fields.SpotShadowColor;
            int i9 = i8 % 2;
            i7 |= getpostalcode.IconCompatParcelizer(r8lambdaunavo3sxub_pc9xroryotnrlvsm2) ? 16384 : 8192;
        }
        if ((i7 & 9363) != 9362) {
            int i10 = read + 33;
            serializer = i10 % Fields.SpotShadowColor;
            int i11 = i10 % 2;
            z = true;
        } else {
            z = false;
        }
        if (getpostalcode.write(i7 & 1, z)) {
            Modifier.Companion companion = Modifier.Companion;
            Object[] objArr = new Object[0];
            Object objComponentActivity = getpostalcode.ComponentActivity();
            AndroidContentCaptureManager androidContentCaptureManager = getCreditCardExpirationMonth.write;
            if (objComponentActivity == androidContentCaptureManager) {
                objComponentActivity = new getSessionParameters(5);
                getpostalcode.write(objComponentActivity);
            }
            AtomicBoolean atomicBoolean = (AtomicBoolean) getEventType.IconCompatParcelizer(objArr, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) objComponentActivity, getpostalcode, 48);
            if ((i7 & 896) == 256) {
                int i12 = serializer + 81;
                read = i12 % Fields.SpotShadowColor;
                int i13 = i12 % 2;
                z2 = true;
            } else {
                z2 = false;
            }
            boolean zIconCompatParcelizer = getpostalcode.IconCompatParcelizer(atomicBoolean);
            int i14 = i7 & 57344;
            if (i14 == 16384) {
                int i15 = read + 87;
                serializer = i15 % Fields.SpotShadowColor;
                int i16 = i15 % 2;
                z3 = true;
            } else {
                z3 = false;
            }
            Object objComponentActivity2 = getpostalcode.ComponentActivity();
            if ((z3 | z2 | zIconCompatParcelizer) || objComponentActivity2 == androidContentCaptureManager) {
                objComponentActivity2 = new NafathTimerManager$observeCountdown$1(15000L, atomicBoolean, r8lambdaunavo3sxub_pc9xroryotnrlvsm2, (ShortNewsContentCardView) null, 11);
                getpostalcode.write(objComponentActivity2);
            }
            getPhoneNumberNational.RemoteActionCompatParcelizer(getpostalcode, createFromParcel.INSTANCE, (r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0) objComponentActivity2);
            Modifier modifierM83size3ABfNKs = SizeKt.m83size3ABfNKs(companion, Dp.m3673constructorimpl(0.0f));
            boolean zIconCompatParcelizer2 = getpostalcode.IconCompatParcelizer(atomicBoolean);
            boolean z4 = (i7 & 7168) == 2048;
            boolean z5 = i14 == 16384;
            boolean z6 = (i7 & 14) == 4;
            Object objComponentActivity3 = getpostalcode.ComponentActivity();
            if ((zIconCompatParcelizer2 | z4 | z5 | z6) || objComponentActivity3 == androidContentCaptureManager) {
                objComponentActivity3 = new NavControllerImpl$$ExternalSyntheticLambda0(str, atomicBoolean, r8lambdaunavo3sxub_pc9xroryotnrlvsm, r8lambdaunavo3sxub_pc9xroryotnrlvsm2, 17);
                getpostalcode.write(objComponentActivity3);
            }
            AndroidView_androidKt.AndroidView((r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) objComponentActivity3, modifierM83size3ABfNKs, null, getpostalcode, 0, 4);
            j2 = 15000;
            modifier2 = companion;
        } else {
            getpostalcode.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
            modifier2 = modifier;
            j2 = j;
        }
        getHandleruiannotations gethandleruiannotationsMediaDescriptionCompat = getpostalcode.MediaDescriptionCompat();
        if (gethandleruiannotationsMediaDescriptionCompat != null) {
            gethandleruiannotationsMediaDescriptionCompat.serializer = new hasValidPointerSourcedefault(str, modifier2, j2, r8lambdaunavo3sxub_pc9xroryotnrlvsm, r8lambdaunavo3sxub_pc9xroryotnrlvsm2, i);
        }
    }
}
