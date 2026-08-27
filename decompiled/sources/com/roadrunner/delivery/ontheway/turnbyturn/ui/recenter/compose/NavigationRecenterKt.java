package com.roadrunner.delivery.ontheway.turnbyturn.ui.recenter.compose;

import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Fields;
import androidx.sqlite.SQLite;
import coil3.ExtrasKt;
import com.roadrunner.delivery.ontheway.turnbyturn.ui.switcher.compose.SwitcherKt$Switcher$2$1;
import com.roadrunner.delivery.pickupdropoff.codescanner.BarcodeAnalyzer$$ExternalSyntheticLambda0;
import com.roadrunner.designsystem.compose.theme.tokens.Dimensions;
import o.AndroidContentCaptureManager;
import o.AndroidFontTypefaceLoader;
import o.LineHeightStyleMode;
import o.computeHorizontalScrollExtent;
import o.equalEnum;
import o.getBirthDateFull;
import o.getCenterPIaL0Z0;
import o.getCreditCardExpirationMonth;
import o.getHandleruiannotations;
import o.getPostalCode;
import o.getQueryContext;
import o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0;
import o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM;
import o.registerInAppMessageManagerlambda0;

/* JADX INFO: loaded from: classes3.dex */
public abstract class NavigationRecenterKt {
    private static int IconCompatParcelizer = 1;
    private static int RemoteActionCompatParcelizer;

    public static final void write(int i, getBirthDateFull getbirthdatefull, Modifier modifier, String str, r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k0) {
        int i2;
        int i3;
        int i4;
        int i5 = 2 % 2;
        getPostalCode getpostalcode = (getPostalCode) getbirthdatefull;
        getpostalcode.MediaSessionCompatQueueItem(-547122764);
        if ((i & 6) == 0) {
            int i6 = RemoteActionCompatParcelizer + 121;
            IconCompatParcelizer = i6 % Fields.SpotShadowColor;
            if (i6 % 2 == 0) {
                getpostalcode.read(str);
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            i2 = (getpostalcode.read(str) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            if (!getpostalcode.IconCompatParcelizer(r8lambdardpfsr94j4iebcwx_kpqzpm8k0)) {
                i4 = 16;
            } else {
                int i7 = RemoteActionCompatParcelizer + 39;
                IconCompatParcelizer = i7 % Fields.SpotShadowColor;
                int i8 = i7 % 2;
                i4 = 32;
            }
            i2 |= i4;
        }
        if ((i & 384) == 0) {
            if (getpostalcode.read(modifier)) {
                int i9 = IconCompatParcelizer + 25;
                RemoteActionCompatParcelizer = i9 % Fields.SpotShadowColor;
                int i10 = i9 % 2;
                i3 = Fields.RotationX;
            } else {
                int i11 = IconCompatParcelizer + 29;
                RemoteActionCompatParcelizer = i11 % Fields.SpotShadowColor;
                if (i11 % 2 != 0) {
                    int i12 = 3 % 5;
                }
                i3 = Fields.SpotShadowColor;
            }
            i2 |= i3;
        }
        if (getpostalcode.write(i2 & 1, (i2 & 147) != 146)) {
            float f = Dimensions.setCustomView;
            equalEnum.RemoteActionCompatParcelizer(str, r8lambdardpfsr94j4iebcwx_kpqzpm8k0, modifier, false, null, f, f, getpostalcode, (i2 << 3) & 8176);
        } else {
            getpostalcode.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
            int i13 = IconCompatParcelizer + 5;
            RemoteActionCompatParcelizer = i13 % Fields.SpotShadowColor;
            int i14 = i13 % 2;
        }
        getHandleruiannotations gethandleruiannotationsMediaDescriptionCompat = getpostalcode.MediaDescriptionCompat();
        if (gethandleruiannotationsMediaDescriptionCompat != null) {
            gethandleruiannotationsMediaDescriptionCompat.serializer = new computeHorizontalScrollExtent(str, r8lambdardpfsr94j4iebcwx_kpqzpm8k0, modifier, i, 10);
        }
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0039  */
    /* JADX WARN: Code duplicated, block: B:12:0x0044  */
    /* JADX WARN: Code duplicated, block: B:14:0x0048 A[PHI: r0
  0x0048: PHI (r0v34 o.getPostalCode) = (r0v5 o.getPostalCode), (r0v36 o.getPostalCode) binds: [B:8:0x0031, B:5:0x0022] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:27:0x0083  */
    /* JADX WARN: Code duplicated, block: B:9:0x0033 A[PHI: r0
  0x0033: PHI (r0v6 o.getPostalCode) = (r0v5 o.getPostalCode), (r0v36 o.getPostalCode) binds: [B:8:0x0031, B:5:0x0022] A[DONT_GENERATE, DONT_INLINE]] */
    public static final void NavigationRecenter(LineHeightStyleMode lineHeightStyleMode, Modifier modifier, getBirthDateFull getbirthdatefull, int i) {
        getPostalCode getpostalcode;
        int i2;
        int i3;
        getPostalCode getpostalcode2;
        Modifier modifier2;
        boolean z;
        int i4 = 2 % 2;
        int i5 = IconCompatParcelizer + 89;
        RemoteActionCompatParcelizer = i5 % Fields.SpotShadowColor;
        if (i5 % 2 != 0) {
            lineHeightStyleMode.getClass();
            getpostalcode = (getPostalCode) getbirthdatefull;
            getpostalcode.MediaSessionCompatQueueItem(-1215678093);
            if ((i & 40) == 0) {
                if (getpostalcode.read(lineHeightStyleMode)) {
                    int i6 = RemoteActionCompatParcelizer + 35;
                    IconCompatParcelizer = i6 % Fields.SpotShadowColor;
                    int i7 = i6 % 2;
                    i2 = 4;
                } else {
                    i2 = 2;
                }
                i3 = i2 | i;
                getpostalcode2 = getpostalcode;
            } else {
                getpostalcode2 = getpostalcode;
                i3 = i;
            }
        } else {
            lineHeightStyleMode.getClass();
            getpostalcode = (getPostalCode) getbirthdatefull;
            getpostalcode.MediaSessionCompatQueueItem(-1215678093);
            if ((i & 6) == 0) {
                if (getpostalcode.read(lineHeightStyleMode)) {
                    int i8 = RemoteActionCompatParcelizer + 35;
                    IconCompatParcelizer = i8 % Fields.SpotShadowColor;
                    int i9 = i8 % 2;
                    i2 = 4;
                } else {
                    i2 = 2;
                }
                i3 = i2 | i;
                getpostalcode2 = getpostalcode;
            } else {
                getpostalcode2 = getpostalcode;
                i3 = i;
            }
        }
        int i10 = i3 | 48;
        if (getpostalcode2.write(i10 & 1, (i10 & 19) != 18)) {
            int i11 = RemoteActionCompatParcelizer + 93;
            IconCompatParcelizer = i11 % Fields.SpotShadowColor;
            int i12 = i11 % 2;
            modifier2 = Modifier.Companion;
            getCenterPIaL0Z0 getcenterpial0z0 = (getCenterPIaL0Z0) lineHeightStyleMode;
            getQueryContext getquerycontext = getcenterpial0z0.IconCompatParcelizer;
            int i13 = i10 & 14;
            if (i13 == 4) {
                int i14 = IconCompatParcelizer + 31;
                RemoteActionCompatParcelizer = i14 % Fields.SpotShadowColor;
                if (i14 % 2 != 0) {
                    z = false;
                } else {
                    z = true;
                }
            } else {
                z = false;
            }
            Object objComponentActivity = getpostalcode2.ComponentActivity();
            AndroidContentCaptureManager androidContentCaptureManager = getCreditCardExpirationMonth.write;
            if (z || objComponentActivity == androidContentCaptureManager) {
                objComponentActivity = new BarcodeAnalyzer$$ExternalSyntheticLambda0(23, lineHeightStyleMode);
                getpostalcode2.write(objComponentActivity);
            }
            SQLite.write(getquerycontext, (r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) objComponentActivity, getpostalcode2, 8);
            String str = (String) ExtrasKt.write(getcenterpial0z0.RemoteActionCompatParcelizer, getpostalcode2, 0).getValue();
            boolean z2 = i13 == 4;
            Object objComponentActivity2 = getpostalcode2.ComponentActivity();
            if (z2 || objComponentActivity2 == androidContentCaptureManager) {
                SwitcherKt$Switcher$2$1 switcherKt$Switcher$2$1 = new SwitcherKt$Switcher$2$1(0, lineHeightStyleMode, LineHeightStyleMode.class, "onRecenterClicked", "onRecenterClicked()V", 0, 3);
                getpostalcode2.write(switcherKt$Switcher$2$1);
                int i15 = IconCompatParcelizer + 9;
                RemoteActionCompatParcelizer = i15 % Fields.SpotShadowColor;
                int i16 = i15 % 2;
                objComponentActivity2 = switcherKt$Switcher$2$1;
            }
            write((i10 << 3) & 896, getpostalcode2, modifier2, str, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) ((registerInAppMessageManagerlambda0) objComponentActivity2));
        } else {
            getpostalcode2.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
            modifier2 = modifier;
        }
        getHandleruiannotations gethandleruiannotationsMediaDescriptionCompat = getpostalcode2.MediaDescriptionCompat();
        if (gethandleruiannotationsMediaDescriptionCompat != null) {
            gethandleruiannotationsMediaDescriptionCompat.serializer = new AndroidFontTypefaceLoader(i, 8, lineHeightStyleMode, modifier2);
        }
        int i17 = RemoteActionCompatParcelizer + 51;
        IconCompatParcelizer = i17 % Fields.SpotShadowColor;
        if (i17 % 2 == 0) {
            throw null;
        }
    }
}
