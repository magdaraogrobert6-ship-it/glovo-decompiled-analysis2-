package com.roadrunner.delivery.ontheway.turnbyturn.ui.switcher.compose;

import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Fields;
import androidx.sqlite.SQLite;
import coil3.ExtrasKt;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import com.logistics.rider.glovo.R;
import com.roadrunner.delivery.pickupdropoff.codescanner.BarcodeAnalyzer$$ExternalSyntheticLambda0;
import com.roadrunner.designsystem.compose.theme.tokens.Dimensions;
import o.AndroidContentCaptureManager;
import o.AndroidFontTypefaceLoader;
import o.TextAlignKt;
import o.accessgetUnderlinecp;
import o.equalEnum;
import o.extractAuthorizationHeader;
import o.getBirthDateFull;
import o.getCreditCardExpirationMonth;
import o.getHandleruiannotations;
import o.getJustifye0LSkKk;
import o.getPostalCode;
import o.getQueryContext;
import o.getStore;
import o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0;
import o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM;
import o.registerInAppMessageManagerlambda0;
import o.valueOfIgVj0fw;

/* JADX INFO: loaded from: classes3.dex */
public abstract class SwitcherKt {
    private static int read = 0;
    private static int serializer = 1;

    public static final void write(valueOfIgVj0fw valueofigvj0fw, r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k0, Modifier modifier, getBirthDateFull getbirthdatefull, int i) {
        int i2;
        boolean z;
        int i3;
        float f;
        boolean z2;
        extractAuthorizationHeader extractauthorizationheader;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8 = 2 % 2;
        getPostalCode getpostalcode = (getPostalCode) getbirthdatefull;
        getpostalcode.MediaSessionCompatQueueItem(2005932062);
        if ((i & 6) == 0) {
            int i9 = read + 121;
            serializer = i9 % Fields.SpotShadowColor;
            if (i9 % 2 != 0) {
                i2 = (getpostalcode.read(valueofigvj0fw.ordinal()) ? 4 : 2) | i;
            } else {
                getpostalcode.read(valueofigvj0fw.ordinal());
                throw null;
            }
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            int i10 = serializer + 105;
            read = i10 % Fields.SpotShadowColor;
            int i11 = i10 % 2;
            if (!getpostalcode.IconCompatParcelizer(r8lambdardpfsr94j4iebcwx_kpqzpm8k0)) {
                i7 = 16;
            } else {
                int i12 = serializer + 79;
                read = i12 % Fields.SpotShadowColor;
                int i13 = i12 % 2;
                i7 = 32;
            }
            i2 |= i7;
        }
        if ((i & 384) == 0) {
            if (getpostalcode.read(modifier)) {
                int i14 = read + 31;
                serializer = i14 % Fields.SpotShadowColor;
                if (i14 % 2 == 0) {
                    int i15 = 2 / 3;
                }
                i6 = Fields.RotationX;
            } else {
                i6 = Fields.SpotShadowColor;
            }
            i2 |= i6;
        }
        if ((i2 & 147) != 146) {
            int i16 = serializer + 61;
            read = i16 % Fields.SpotShadowColor;
            int i17 = i16 % 2;
            z = true;
        } else {
            z = false;
        }
        if (!(!getpostalcode.write(i2 & 1, z))) {
            int i18 = accessgetUnderlinecp.RemoteActionCompatParcelizer[valueofigvj0fw.ordinal()];
            if (i18 == 1) {
                i3 = R.drawable.icon_turn_by_turn_camera_navigation;
            } else {
                if (i18 != 2) {
                    ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer();
                    return;
                }
                i3 = R.drawable.icon_turn_by_turn_camera_overview;
            }
            int i19 = serializer + 67;
            read = i19 % Fields.SpotShadowColor;
            if (i19 % 2 != 0) {
                f = Dimensions.setCustomView;
                z2 = false;
                extractauthorizationheader = null;
                i4 = i2 & 26637;
                i5 = 98;
            } else {
                f = Dimensions.setCustomView;
                z2 = false;
                extractauthorizationheader = null;
                i4 = i2 & 1008;
                i5 = 24;
            }
            equalEnum.IconCompatParcelizer(i3, r8lambdardpfsr94j4iebcwx_kpqzpm8k0, modifier, z2, extractauthorizationheader, f, f, getpostalcode, i4, i5);
        } else {
            getpostalcode.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
        }
        getHandleruiannotations gethandleruiannotationsMediaDescriptionCompat = getpostalcode.MediaDescriptionCompat();
        if (gethandleruiannotationsMediaDescriptionCompat != null) {
            gethandleruiannotationsMediaDescriptionCompat.serializer = new getStore(i, 13, valueofigvj0fw, r8lambdardpfsr94j4iebcwx_kpqzpm8k0, modifier);
        }
    }

    /* JADX WARN: Code duplicated, block: B:23:0x0076 A[PHI: r1 r3 r6 r7
  0x0076: PHI (r1v17 androidx.compose.ui.Modifier$Companion) = (r1v16 androidx.compose.ui.Modifier$Companion), (r1v36 androidx.compose.ui.Modifier$Companion) binds: [B:22:0x0074, B:19:0x0068] A[DONT_GENERATE, DONT_INLINE]
  0x0076: PHI (r3v5 o.TextAlignKt) = (r3v4 o.TextAlignKt), (r3v11 o.TextAlignKt) binds: [B:22:0x0074, B:19:0x0068] A[DONT_GENERATE, DONT_INLINE]
  0x0076: PHI (r6v1 o.getQueryContext) = (r6v0 o.getQueryContext), (r6v5 o.getQueryContext) binds: [B:22:0x0074, B:19:0x0068] A[DONT_GENERATE, DONT_INLINE]
  0x0076: PHI (r7v1 int) = (r7v0 int), (r7v5 int) binds: [B:22:0x0074, B:19:0x0068] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:24:0x0079 A[PHI: r1 r3 r6 r7
  0x0079: PHI (r1v34 androidx.compose.ui.Modifier$Companion) = (r1v16 androidx.compose.ui.Modifier$Companion), (r1v36 androidx.compose.ui.Modifier$Companion) binds: [B:22:0x0074, B:19:0x0068] A[DONT_GENERATE, DONT_INLINE]
  0x0079: PHI (r3v9 o.TextAlignKt) = (r3v4 o.TextAlignKt), (r3v11 o.TextAlignKt) binds: [B:22:0x0074, B:19:0x0068] A[DONT_GENERATE, DONT_INLINE]
  0x0079: PHI (r6v4 o.getQueryContext) = (r6v0 o.getQueryContext), (r6v5 o.getQueryContext) binds: [B:22:0x0074, B:19:0x0068] A[DONT_GENERATE, DONT_INLINE]
  0x0079: PHI (r7v4 int) = (r7v0 int), (r7v5 int) binds: [B:22:0x0074, B:19:0x0068] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:38:0x00c2  */
    public static final void Switcher(getJustifye0LSkKk getjustifye0lskkk, Modifier modifier, getBirthDateFull getbirthdatefull, int i) {
        int i2;
        boolean z;
        Modifier modifier2;
        Modifier.Companion companion;
        TextAlignKt textAlignKt;
        getQueryContext getquerycontext;
        int i3;
        boolean z2;
        int i4;
        int i5 = 2 % 2;
        int i6 = read + 81;
        serializer = i6 % Fields.SpotShadowColor;
        int i7 = i6 % 2;
        getjustifye0lskkk.getClass();
        getPostalCode getpostalcode = (getPostalCode) getbirthdatefull;
        getpostalcode.MediaSessionCompatQueueItem(-855555563);
        if ((i & 6) == 0) {
            if (getpostalcode.read(getjustifye0lskkk)) {
                i4 = 4;
            } else {
                int i8 = serializer + 81;
                read = i8 % Fields.SpotShadowColor;
                int i9 = i8 % 2;
                i4 = 2;
            }
            i2 = i4 | i;
        } else {
            i2 = i;
        }
        int i10 = i2 | 48;
        boolean z3 = true;
        if ((i10 & 19) != 18) {
            int i11 = serializer + 77;
            read = i11 % Fields.SpotShadowColor;
            int i12 = i11 % 2;
            z = true;
        } else {
            z = false;
        }
        if (getpostalcode.write(i10 & 1, z)) {
            int i13 = read + 27;
            serializer = i13 % Fields.SpotShadowColor;
            if (i13 % 2 == 0) {
                companion = Modifier.Companion;
                textAlignKt = (TextAlignKt) getjustifye0lskkk;
                getquerycontext = textAlignKt.serializer;
                i3 = i10 & 2;
                if (i3 == 2) {
                    modifier2 = companion;
                    z2 = true;
                } else {
                    modifier2 = companion;
                    z2 = false;
                }
            } else {
                companion = Modifier.Companion;
                textAlignKt = (TextAlignKt) getjustifye0lskkk;
                getquerycontext = textAlignKt.serializer;
                i3 = i10 & 14;
                if (i3 == 4) {
                    modifier2 = companion;
                    z2 = true;
                } else {
                    modifier2 = companion;
                    z2 = false;
                }
            }
            Object objComponentActivity = getpostalcode.ComponentActivity();
            AndroidContentCaptureManager androidContentCaptureManager = getCreditCardExpirationMonth.write;
            if (z2 || objComponentActivity == androidContentCaptureManager) {
                objComponentActivity = new BarcodeAnalyzer$$ExternalSyntheticLambda0(24, getjustifye0lskkk);
                getpostalcode.write(objComponentActivity);
            }
            SQLite.write(getquerycontext, (r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) objComponentActivity, getpostalcode, 8);
            valueOfIgVj0fw valueofigvj0fw = (valueOfIgVj0fw) ExtrasKt.write(textAlignKt.RemoteActionCompatParcelizer, getpostalcode, 0).getValue();
            if (i3 == 4) {
                int i14 = serializer + 5;
                read = i14 % Fields.SpotShadowColor;
                int i15 = i14 % 2;
            } else {
                z3 = false;
            }
            Object objComponentActivity2 = getpostalcode.ComponentActivity();
            if (z3) {
                SwitcherKt$Switcher$2$1 switcherKt$Switcher$2$1 = new SwitcherKt$Switcher$2$1(0, getjustifye0lskkk, getJustifye0LSkKk.class, "onSwitcherClicked", "onSwitcherClicked()V", 0, 0);
                getpostalcode.write(switcherKt$Switcher$2$1);
                objComponentActivity2 = switcherKt$Switcher$2$1;
            } else {
                int i16 = serializer + 13;
                read = i16 % Fields.SpotShadowColor;
                int i17 = i16 % 2;
                if (objComponentActivity2 == androidContentCaptureManager) {
                    SwitcherKt$Switcher$2$1 switcherKt$Switcher$2$2 = new SwitcherKt$Switcher$2$1(0, getjustifye0lskkk, getJustifye0LSkKk.class, "onSwitcherClicked", "onSwitcherClicked()V", 0, 0);
                    getpostalcode.write(switcherKt$Switcher$2$2);
                    objComponentActivity2 = switcherKt$Switcher$2$2;
                }
            }
            write(valueofigvj0fw, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) ((registerInAppMessageManagerlambda0) objComponentActivity2), modifier2, getpostalcode, (i10 << 3) & 896);
        } else {
            getpostalcode.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
            modifier2 = modifier;
        }
        getHandleruiannotations gethandleruiannotationsMediaDescriptionCompat = getpostalcode.MediaDescriptionCompat();
        if (gethandleruiannotationsMediaDescriptionCompat != null) {
            gethandleruiannotationsMediaDescriptionCompat.serializer = new AndroidFontTypefaceLoader(i, 12, getjustifye0lskkk, modifier2);
        }
    }
}
