package com.roadrunner.location.toggle.presentation;

import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Fields;
import androidx.compose.ui.res.StringResources_androidKt;
import bo.app.d$$ExternalSyntheticOutline0;
import coil3.ExtrasKt;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import com.google.android.gms.location.DeviceOrientationRequest;
import com.logistics.rider.glovo.R;
import com.roadrunner.designsystem.compose.theme.tokens.Dimensions;
import com.roadrunner.login.presentation.LoginActivity$onCreate$1$1$1$1$5$1;
import com.roadrunner.rrds.compose.component.tooltip.TooltipKt;
import o.AndroidContentCaptureManager;
import o.WorkDatabase;
import o.WorkerKtExternalSyntheticLambda2;
import o.WorkerParameters;
import o.WorkerWrapperKt;
import o.getBirthDateFull;
import o.getCieXyz;
import o.getCreditCardExpirationMonth;
import o.getHandleruiannotations;
import o.getPostalCode;
import o.p2;
import o.parseResponse;
import o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0;
import o.r8lambdafjQ9B8d5OSR_i2BAJDXqNW6RNrY;
import o.registerInAppMessageManagerlambda0;
import o.removeNodeAtDepth;

/* JADX INFO: loaded from: classes3.dex */
public abstract class LocationToggleFloatingContentKt {
    private static int IconCompatParcelizer = 0;
    private static int read = 1;

    /* JADX WARN: Code duplicated, block: B:11:0x003f  */
    /* JADX WARN: Code duplicated, block: B:12:0x0041  */
    /* JADX WARN: Code duplicated, block: B:51:0x00af  */
    /* JADX WARN: Code duplicated, block: B:52:0x00b2  */
    public static final void serializer(boolean z, boolean z2, final r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k0, r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k1, Modifier modifier, getBirthDateFull getbirthdatefull, int i) {
        int i2;
        final int i3;
        int i4;
        int i5;
        int i6 = 2 % 2;
        int i7 = IconCompatParcelizer + 15;
        read = i7 % Fields.SpotShadowColor;
        int i8 = i7 % 2;
        getPostalCode getpostalcode = (getPostalCode) getbirthdatefull;
        getpostalcode.MediaSessionCompatQueueItem(-1941375872);
        if ((i & 6) == 0) {
            int i9 = IconCompatParcelizer + 91;
            read = i9 % Fields.SpotShadowColor;
            if (i9 % 2 != 0) {
                if (!getpostalcode.write(z)) {
                    i5 = 2;
                } else {
                    i5 = 4;
                }
            } else {
                int i10 = 2 / 0;
                if (getpostalcode.write(z)) {
                    i5 = 4;
                } else {
                    i5 = 2;
                }
            }
            i2 = i5 | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= getpostalcode.write(z2) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            int i11 = read + 11;
            IconCompatParcelizer = i11 % Fields.SpotShadowColor;
            if (i11 % 2 == 0) {
                i2 |= getpostalcode.IconCompatParcelizer(r8lambdardpfsr94j4iebcwx_kpqzpm8k0) ? Fields.RotationX : Fields.SpotShadowColor;
            } else {
                getpostalcode.IconCompatParcelizer(r8lambdardpfsr94j4iebcwx_kpqzpm8k0);
                throw null;
            }
        }
        if ((i & 3072) == 0) {
            i2 |= getpostalcode.IconCompatParcelizer(r8lambdardpfsr94j4iebcwx_kpqzpm8k1) ? Fields.CameraDistance : Fields.RotationZ;
        }
        if ((i & 24576) == 0) {
            int i12 = read + 91;
            IconCompatParcelizer = i12 % Fields.SpotShadowColor;
            if (i12 % 2 == 0) {
                if (getpostalcode.read(modifier)) {
                    i4 = Fields.Clip;
                } else {
                    i4 = 8192;
                }
            } else {
                int i13 = 44 / 0;
                if (getpostalcode.read(modifier)) {
                    i4 = Fields.Clip;
                } else {
                    i4 = 8192;
                }
            }
            i2 |= i4;
            int i14 = read + 87;
            IconCompatParcelizer = i14 % Fields.SpotShadowColor;
            int i15 = i14 % 2;
        }
        if (getpostalcode.write(i2 & 1, (i2 & 9363) != 9362)) {
            int i16 = IconCompatParcelizer + 11;
            read = i16 % Fields.SpotShadowColor;
            if (i16 % 2 != 0 ? z : !z) {
                i3 = R.drawable.ic_map_pin_on;
            } else {
                if (z) {
                    ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer();
                    return;
                }
                i3 = R.drawable.ic_map_pin_off;
            }
            TooltipKt.m5064TooltipgHHVGI(StringResources_androidKt.stringResource(R.string.location_sharing_map_tooltip, getpostalcode, 0), ExtrasKt.write(-2036661678, new r8lambdafjQ9B8d5OSR_i2BAJDXqNW6RNrY() { // from class: o.WorkerWrapperKtawaitWithin21
                private static int serializer = 1;
                private static int write;

                @Override // o.r8lambdafjQ9B8d5OSR_i2BAJDXqNW6RNrY
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    int i17 = 2 % 2;
                    int i18 = write + 53;
                    serializer = i18 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                    int i19 = i18 % 2;
                    androidx.compose.ui.Modifier modifier2 = (androidx.compose.ui.Modifier) obj;
                    getBirthDateFull getbirthdatefull2 = (getBirthDateFull) obj2;
                    int iIntValue = ((Integer) obj3).intValue();
                    modifier2.getClass();
                    if ((iIntValue & 6) == 0) {
                        int i20 = write + 3;
                        serializer = i20 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                        if (i20 % 2 == 0) {
                            ((getPostalCode) getbirthdatefull2).read(modifier2);
                            throw null;
                        }
                        iIntValue |= !(((getPostalCode) getbirthdatefull2).read(modifier2) ^ true) ? 4 : 2;
                        int i21 = write + 7;
                        serializer = i21 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                        if (i21 % 2 == 0) {
                            int i22 = 3 / 3;
                        }
                    }
                    getPostalCode getpostalcode2 = (getPostalCode) getbirthdatefull2;
                    if (!getpostalcode2.write(iIntValue & 1, (iIntValue & 19) != 18)) {
                        getpostalcode2.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
                    } else {
                        float f = Dimensions.setCustomView;
                        equalEnum.IconCompatParcelizer(i3, r8lambdardpfsr94j4iebcwx_kpqzpm8k0, modifier2, false, null, f, f, getpostalcode2, 0, 24);
                    }
                    return createFromParcel.INSTANCE;
                }
            }, getpostalcode), modifier, 0L, 0L, null, Dimensions.setStackedBackground, 0.0f, z2, false, false, true, Long.valueOf(DeviceOrientationRequest.OUTPUT_PERIOD_MEDIUM), null, r8lambdardpfsr94j4iebcwx_kpqzpm8k1, getpostalcode, ((i2 >> 6) & 896) | 48 | ((i2 << 24) & 1879048192), ((i2 << 6) & 458752) | 3456, 19832);
        } else {
            getpostalcode.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
        }
        getHandleruiannotations gethandleruiannotationsMediaDescriptionCompat = getpostalcode.MediaDescriptionCompat();
        if (gethandleruiannotationsMediaDescriptionCompat != null) {
            gethandleruiannotationsMediaDescriptionCompat.serializer = new parseResponse(i, 5, modifier, r8lambdardpfsr94j4iebcwx_kpqzpm8k0, r8lambdardpfsr94j4iebcwx_kpqzpm8k1, z, z2);
        }
    }

    public static final void LocationToggleFloatingContent(WorkerWrapperKt workerWrapperKt, Modifier modifier, getBirthDateFull getbirthdatefull, int i) {
        int i2;
        Modifier modifier2;
        boolean z;
        int i3;
        int i4 = 2 % 2;
        workerWrapperKt.getClass();
        getPostalCode getpostalcode = (getPostalCode) getbirthdatefull;
        getpostalcode.MediaSessionCompatQueueItem(-1353979876);
        if ((i & 6) == 0) {
            if (getpostalcode.read(workerWrapperKt)) {
                int i5 = read + 91;
                IconCompatParcelizer = i5 % Fields.SpotShadowColor;
                int i6 = i5 % 2;
                i3 = 4;
            } else {
                i3 = 2;
            }
            i2 = i3 | i;
        } else {
            i2 = i;
        }
        int i7 = i2 | 48;
        if (getpostalcode.write(i7 & 1, (i7 & 19) != 18)) {
            modifier2 = Modifier.Companion;
            WorkerParameters workerParameters = (WorkerParameters) ExtrasKt.write(workerWrapperKt.MediaBrowserCompatMediaItem, getpostalcode, 0).getValue();
            if (!(!(workerParameters instanceof WorkerKtExternalSyntheticLambda2))) {
                getpostalcode.serializer(1918594710);
                boolean zBooleanValue = ((Boolean) ExtrasKt.write(workerWrapperKt.MediaDescriptionCompat, getpostalcode, 0).getValue()).booleanValue();
                boolean z2 = ((WorkerKtExternalSyntheticLambda2) workerParameters).write;
                int i8 = i7 & 14;
                if (i8 == 4) {
                    int i9 = read + 119;
                    IconCompatParcelizer = i9 % Fields.SpotShadowColor;
                    int i10 = i9 % 2;
                    z = true;
                } else {
                    z = false;
                }
                Object objComponentActivity = getpostalcode.ComponentActivity();
                AndroidContentCaptureManager androidContentCaptureManager = getCreditCardExpirationMonth.write;
                if (z || objComponentActivity == androidContentCaptureManager) {
                    int i11 = IconCompatParcelizer + 107;
                    read = i11 % Fields.SpotShadowColor;
                    int i12 = i11 % 2;
                    LoginActivity$onCreate$1$1$1$1$5$1 loginActivity$onCreate$1$1$1$1$5$1 = new LoginActivity$onCreate$1$1$1$1$5$1(0, workerWrapperKt, WorkerWrapperKt.class, "onClick", "onClick()V", 0, 19);
                    getpostalcode.write(loginActivity$onCreate$1$1$1$1$5$1);
                    objComponentActivity = loginActivity$onCreate$1$1$1$1$5$1;
                }
                r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k0 = (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) ((registerInAppMessageManagerlambda0) objComponentActivity);
                boolean z3 = i8 == 4;
                Object objComponentActivity2 = getpostalcode.ComponentActivity();
                if (z3 || objComponentActivity2 == androidContentCaptureManager) {
                    LoginActivity$onCreate$1$1$1$1$5$1 loginActivity$onCreate$1$1$1$1$5$2 = new LoginActivity$onCreate$1$1$1$1$5$1(0, workerWrapperKt, WorkerWrapperKt.class, "onTooltipDismissed", "onTooltipDismissed()V", 0, 20);
                    getpostalcode.write(loginActivity$onCreate$1$1$1$1$5$2);
                    objComponentActivity2 = loginActivity$onCreate$1$1$1$1$5$2;
                }
                serializer(z2, zBooleanValue, r8lambdardpfsr94j4iebcwx_kpqzpm8k0, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) ((registerInAppMessageManagerlambda0) objComponentActivity2), modifier2, getpostalcode, (i7 << 9) & 57344);
                getpostalcode.IconCompatParcelizer(false);
            } else {
                if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{workerParameters, WorkDatabase.write}, getCieXyz.write())).booleanValue()) {
                    getpostalcode.serializer(1919008095);
                    getpostalcode.IconCompatParcelizer(false);
                } else {
                    throw d$$ExternalSyntheticOutline0.m(getpostalcode, 200434426, false);
                }
            }
        } else {
            getpostalcode.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
            modifier2 = modifier;
        }
        getHandleruiannotations gethandleruiannotationsMediaDescriptionCompat = getpostalcode.MediaDescriptionCompat();
        if (gethandleruiannotationsMediaDescriptionCompat != null) {
            gethandleruiannotationsMediaDescriptionCompat.serializer = new p2(i, 14, workerWrapperKt, modifier2);
        }
    }
}
