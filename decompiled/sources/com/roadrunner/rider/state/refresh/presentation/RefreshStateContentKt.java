package com.roadrunner.rider.state.refresh.presentation;

import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Fields;
import coil3.ExtrasKt;
import com.roadrunner.settings.ui.screens.SettingsScreenKt$SettingsScreen$2$1;
import o.AndroidContentCaptureManager;
import o.deletePackageQueue;
import o.generateSendingParametersI;
import o.getBirthDateFull;
import o.getCreditCardExpirationMonth;
import o.getHandleruiannotations;
import o.getPostalCode;
import o.lambdainit3;
import o.r8lambdaPiZLedL0JH1wIOGQM80pCH0fhkU;
import o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0;
import o.r8lambdarMv397hzZJazOE3eMmLe0m6ePY0;
import o.registerInAppMessageManagerlambda0;

/* JADX INFO: loaded from: classes3.dex */
public abstract class RefreshStateContentKt {
    private static int IconCompatParcelizer = 0;
    private static int write = 1;

    /* JADX WARN: Code duplicated, block: B:11:0x002a  */
    /* JADX WARN: Code duplicated, block: B:14:0x0036  */
    /* JADX WARN: Code duplicated, block: B:15:0x0038  */
    /* JADX WARN: Code duplicated, block: B:17:0x003b A[PHI: r9
  0x003b: PHI (r9v6 o.getPostalCode) = (r9v1 o.getPostalCode), (r9v7 o.getPostalCode) binds: [B:8:0x0022, B:5:0x0018] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:9:0x0024 A[PHI: r9
  0x0024: PHI (r9v2 o.getPostalCode) = (r9v1 o.getPostalCode), (r9v7 o.getPostalCode) binds: [B:8:0x0022, B:5:0x0018] A[DONT_GENERATE, DONT_INLINE]] */
    public static final void IconCompatParcelizer(int i, getBirthDateFull getbirthdatefull, Modifier modifier, r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k0, boolean z) {
        getPostalCode getpostalcode;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7 = 2 % 2;
        int i8 = IconCompatParcelizer + 87;
        write = i8 % Fields.SpotShadowColor;
        if (i8 % 2 == 0) {
            getpostalcode = (getPostalCode) getbirthdatefull;
            getpostalcode.MediaSessionCompatQueueItem(-1224078495);
            if ((i & 72) == 0) {
                if (getpostalcode.write(z)) {
                    i4 = write + 105;
                    IconCompatParcelizer = i4 % Fields.SpotShadowColor;
                    if (i4 % 2 != 0) {
                        i2 = 2;
                    } else {
                        i2 = 4;
                    }
                } else {
                    i2 = 2;
                }
                i3 = i2 | i;
            } else {
                i3 = i;
            }
        } else {
            getpostalcode = (getPostalCode) getbirthdatefull;
            getpostalcode.MediaSessionCompatQueueItem(-1224078495);
            if ((i & 6) == 0) {
                if (getpostalcode.write(z)) {
                    i4 = write + 105;
                    IconCompatParcelizer = i4 % Fields.SpotShadowColor;
                    if (i4 % 2 != 0) {
                        i2 = 2;
                    } else {
                        i2 = 4;
                    }
                } else {
                    i2 = 2;
                }
                i3 = i2 | i;
            } else {
                i3 = i;
            }
        }
        if ((i & 48) == 0) {
            if (!getpostalcode.IconCompatParcelizer(r8lambdardpfsr94j4iebcwx_kpqzpm8k0)) {
                i6 = 16;
            } else {
                int i9 = write + 17;
                int i10 = i9 % Fields.SpotShadowColor;
                IconCompatParcelizer = i10;
                i6 = i9 % 2 != 0 ? 57 : 32;
                int i11 = i10 + 73;
                write = i11 % Fields.SpotShadowColor;
                int i12 = i11 % 2;
            }
            i3 |= i6;
        }
        if ((i & 384) == 0) {
            if (getpostalcode.read(modifier)) {
                int i13 = write + 1;
                IconCompatParcelizer = i13 % Fields.SpotShadowColor;
                i5 = i13 % 2 != 0 ? 16267 : Fields.RotationX;
            } else {
                i5 = Fields.SpotShadowColor;
            }
            i3 |= i5;
        }
        if (getpostalcode.write(i3 & 1, (i3 & 147) != 146)) {
            r8lambdaPiZLedL0JH1wIOGQM80pCH0fhkU r8lambdapizledl0jh1wiogqm80pch0fhku = z ? r8lambdaPiZLedL0JH1wIOGQM80pCH0fhkU.Loading : r8lambdaPiZLedL0JH1wIOGQM80pCH0fhkU.Enabled;
            modifier.getClass();
            lambdainit3.RemoteActionCompatParcelizer(r8lambdardpfsr94j4iebcwx_kpqzpm8k0, modifier, r8lambdapizledl0jh1wiogqm80pch0fhku, null, getpostalcode, (i3 >> 3) & 14);
        } else {
            getpostalcode.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
        }
        getHandleruiannotations gethandleruiannotationsMediaDescriptionCompat = getpostalcode.MediaDescriptionCompat();
        if (gethandleruiannotationsMediaDescriptionCompat != null) {
            gethandleruiannotationsMediaDescriptionCompat.serializer = new deletePackageQueue(z, r8lambdardpfsr94j4iebcwx_kpqzpm8k0, modifier, i, 0);
        }
        int i14 = write + 119;
        IconCompatParcelizer = i14 % Fields.SpotShadowColor;
        if (i14 % 2 != 0) {
            throw null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:38:0x00be  */
    public static final void RefreshStateContent(generateSendingParametersI generatesendingparametersi, Modifier modifier, getBirthDateFull getbirthdatefull, int i) {
        int i2;
        boolean z;
        Modifier modifier2;
        Modifier.Companion companion;
        boolean z2;
        boolean zBooleanValue;
        int i3 = 2 % 2;
        int i4 = write + 109;
        IconCompatParcelizer = i4 % Fields.SpotShadowColor;
        int i5 = i4 % 2;
        generatesendingparametersi.getClass();
        getPostalCode getpostalcode = (getPostalCode) getbirthdatefull;
        getpostalcode.MediaSessionCompatQueueItem(-1879111746);
        Object obj = null;
        if ((i & 6) == 0) {
            int i6 = IconCompatParcelizer + 115;
            write = i6 % Fields.SpotShadowColor;
            if (i6 % 2 == 0) {
                getpostalcode.read(generatesendingparametersi);
                obj.hashCode();
                throw null;
            }
            i2 = (getpostalcode.read(generatesendingparametersi) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        int i7 = i2 | 48;
        boolean z3 = false;
        if ((i7 & 19) != 18) {
            int i8 = IconCompatParcelizer + 29;
            write = i8 % Fields.SpotShadowColor;
            int i9 = i8 % 2;
            z = true;
        } else {
            z = false;
        }
        if (getpostalcode.write(i7 & 1, z)) {
            int i10 = write + 77;
            IconCompatParcelizer = i10 % Fields.SpotShadowColor;
            if (i10 % 2 != 0) {
                companion = Modifier.Companion;
                zBooleanValue = ((Boolean) ExtrasKt.write(((StateRefreshFloatingItemUiModelImpl) generatesendingparametersi).read, getpostalcode, 0).getValue()).booleanValue();
                if ((i7 & 73) == 2) {
                    modifier2 = companion;
                    z2 = zBooleanValue;
                    z3 = true;
                } else {
                    modifier2 = companion;
                    z2 = zBooleanValue;
                }
            } else {
                companion = Modifier.Companion;
                boolean zBooleanValue2 = ((Boolean) ExtrasKt.write(((StateRefreshFloatingItemUiModelImpl) generatesendingparametersi).read, getpostalcode, 0).getValue()).booleanValue();
                if ((i7 & 14) == 4) {
                    zBooleanValue = zBooleanValue2;
                    modifier2 = companion;
                    z2 = zBooleanValue;
                    z3 = true;
                } else {
                    modifier2 = companion;
                    z2 = zBooleanValue2;
                }
            }
            Object objComponentActivity = getpostalcode.ComponentActivity();
            if (!(!z3)) {
                SettingsScreenKt$SettingsScreen$2$1 settingsScreenKt$SettingsScreen$2$1 = new SettingsScreenKt$SettingsScreen$2$1(0, generatesendingparametersi, generateSendingParametersI.class, "onRefreshClicked", "onRefreshClicked()V", 0, 8);
                getpostalcode.write(settingsScreenKt$SettingsScreen$2$1);
                objComponentActivity = settingsScreenKt$SettingsScreen$2$1;
            } else {
                int i11 = write + 123;
                IconCompatParcelizer = i11 % Fields.SpotShadowColor;
                if (i11 % 2 != 0) {
                    AndroidContentCaptureManager androidContentCaptureManager = getCreditCardExpirationMonth.write;
                    throw null;
                }
                if (objComponentActivity == getCreditCardExpirationMonth.write) {
                    SettingsScreenKt$SettingsScreen$2$1 settingsScreenKt$SettingsScreen$2$2 = new SettingsScreenKt$SettingsScreen$2$1(0, generatesendingparametersi, generateSendingParametersI.class, "onRefreshClicked", "onRefreshClicked()V", 0, 8);
                    getpostalcode.write(settingsScreenKt$SettingsScreen$2$2);
                    objComponentActivity = settingsScreenKt$SettingsScreen$2$2;
                }
            }
            IconCompatParcelizer((i7 << 3) & 896, getpostalcode, modifier2, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) ((registerInAppMessageManagerlambda0) objComponentActivity), z2);
        } else {
            getpostalcode.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
            modifier2 = modifier;
        }
        getHandleruiannotations gethandleruiannotationsMediaDescriptionCompat = getpostalcode.MediaDescriptionCompat();
        if (gethandleruiannotationsMediaDescriptionCompat != null) {
            gethandleruiannotationsMediaDescriptionCompat.serializer = new r8lambdarMv397hzZJazOE3eMmLe0m6ePY0(i, 5, generatesendingparametersi, modifier2);
        }
    }
}
