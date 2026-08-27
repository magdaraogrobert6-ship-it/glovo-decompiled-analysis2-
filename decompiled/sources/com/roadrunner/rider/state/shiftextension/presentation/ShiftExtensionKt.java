package com.roadrunner.rider.state.shiftextension.presentation;

import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.runtime.snapshots.SnapshotStateList$$ExternalSyntheticLambda1;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Fields;
import androidx.compose.ui.viewinterop.AndroidView_androidKt;
import coil3.ExtrasKt;
import com.roadrunner.settings.ui.screens.SettingsScreenKt$SettingsScreen$2$1;
import o.AndroidContentCaptureManager;
import o.getAdvertisingInfoObject;
import o.getAppSetId;
import o.getBirthDateFull;
import o.getCreditCardExpirationMonth;
import o.getHandleruiannotations;
import o.getPostalCode;
import o.invokeMethod;
import o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0;
import o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM;
import o.r8lambdaZmWJ7_kmLiTuhtIga_c7SGMfvU;
import o.r8lambdacpVRyEhxzdUx5p9KqbggyjwKD6M;
import o.r8lambdarMv397hzZJazOE3eMmLe0m6ePY0;
import o.registerInAppMessageManagerlambda0;

/* JADX INFO: loaded from: classes3.dex */
public abstract class ShiftExtensionKt {
    private static int RemoteActionCompatParcelizer = 1;
    private static int write;

    /* JADX WARN: Code duplicated, block: B:52:0x00c1  */
    public static final void write(getAdvertisingInfoObject getadvertisinginfoobject, Modifier modifier, r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k0, getBirthDateFull getbirthdatefull, int i) {
        int i2;
        boolean z;
        boolean z2;
        int i3;
        int i4;
        int i5 = 2 % 2;
        getPostalCode getpostalcode = (getPostalCode) getbirthdatefull;
        getpostalcode.MediaSessionCompatQueueItem(99991593);
        if ((i & 6) == 0) {
            if ((i & 8) == 0 ? getpostalcode.read(getadvertisinginfoobject) : getpostalcode.IconCompatParcelizer(getadvertisinginfoobject)) {
                int i6 = RemoteActionCompatParcelizer + 37;
                write = i6 % Fields.SpotShadowColor;
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
            if (getpostalcode.read(modifier)) {
                int i8 = write + 15;
                RemoteActionCompatParcelizer = i8 % Fields.SpotShadowColor;
                int i9 = i8 % 2;
                i3 = 32;
            } else {
                i3 = 16;
            }
            i2 |= i3;
        }
        if ((i & 384) == 0) {
            i2 |= getpostalcode.IconCompatParcelizer(r8lambdardpfsr94j4iebcwx_kpqzpm8k0) ? 256 : Fields.SpotShadowColor;
        }
        boolean z3 = false;
        if ((i2 & 147) != 146) {
            int i10 = RemoteActionCompatParcelizer + 99;
            write = i10 % Fields.SpotShadowColor;
            int i11 = i10 % 2;
            z = true;
        } else {
            z = false;
        }
        if (getpostalcode.write(i2 & 1, z)) {
            int i12 = getadvertisinginfoobject.serializer;
            Modifier modifierWrite = SizeKt.write(modifier, 1.0f);
            if ((i2 & 896) == 256) {
                int i13 = write + 61;
                RemoteActionCompatParcelizer = i13 % Fields.SpotShadowColor;
                int i14 = i13 % 2;
                z2 = true;
            } else {
                z2 = false;
            }
            Object objComponentActivity = getpostalcode.ComponentActivity();
            AndroidContentCaptureManager androidContentCaptureManager = getCreditCardExpirationMonth.write;
            if (z2 || objComponentActivity == androidContentCaptureManager) {
                objComponentActivity = new r8lambdacpVRyEhxzdUx5p9KqbggyjwKD6M(9, r8lambdardpfsr94j4iebcwx_kpqzpm8k0);
                getpostalcode.write(objComponentActivity);
            }
            r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm = (r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) objComponentActivity;
            if ((i2 & 14) != 4) {
                int i15 = RemoteActionCompatParcelizer + 27;
                write = i15 % Fields.SpotShadowColor;
                if (i15 % 2 == 0 ? (i2 & 8) != 0 : (i2 & 87) != 0) {
                    if (getpostalcode.IconCompatParcelizer(getadvertisinginfoobject)) {
                        z3 = true;
                    }
                }
            } else {
                z3 = true;
            }
            boolean z4 = getpostalcode.read(i12);
            Object objComponentActivity2 = getpostalcode.ComponentActivity();
            if ((z4 | z3) || objComponentActivity2 == androidContentCaptureManager) {
                objComponentActivity2 = new SnapshotStateList$$ExternalSyntheticLambda1(getadvertisinginfoobject, i12);
                getpostalcode.write(objComponentActivity2);
            }
            AndroidView_androidKt.AndroidView(r8lambdaunavo3sxub_pc9xroryotnrlvsm, modifierWrite, (r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) objComponentActivity2, getpostalcode, 0, 0);
        } else {
            getpostalcode.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
        }
        getHandleruiannotations gethandleruiannotationsMediaDescriptionCompat = getpostalcode.MediaDescriptionCompat();
        if (gethandleruiannotationsMediaDescriptionCompat != null) {
            gethandleruiannotationsMediaDescriptionCompat.serializer = new r8lambdaZmWJ7_kmLiTuhtIga_c7SGMfvU(getadvertisinginfoobject, modifier, r8lambdardpfsr94j4iebcwx_kpqzpm8k0, i, 12);
        }
    }

    /* JADX WARN: Code duplicated, block: B:25:0x007b  */
    public static final void ShiftExtension(invokeMethod invokemethod, Modifier modifier, getBirthDateFull getbirthdatefull, int i) {
        int i2;
        Modifier modifier2;
        int i3 = 2 % 2;
        invokemethod.getClass();
        getPostalCode getpostalcode = (getPostalCode) getbirthdatefull;
        getpostalcode.MediaSessionCompatQueueItem(-208658812);
        if ((i & 6) == 0) {
            i2 = (!(getpostalcode.IconCompatParcelizer(invokemethod) ^ true) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        int i4 = i2 | 48;
        if (getpostalcode.write(i4 & 1, (i4 & 19) != 18)) {
            int i5 = write + 89;
            RemoteActionCompatParcelizer = i5 % Fields.SpotShadowColor;
            int i6 = i5 % 2;
            modifier2 = Modifier.Companion;
            getAppSetId getappsetid = (getAppSetId) ExtrasKt.write(invokemethod.RatingCompat, getpostalcode, 0).getValue();
            if (getappsetid instanceof getAdvertisingInfoObject) {
                getpostalcode.serializer(-1336765081);
                getAdvertisingInfoObject getadvertisinginfoobject = (getAdvertisingInfoObject) getappsetid;
                modifier2.getClass();
                boolean zIconCompatParcelizer = getpostalcode.IconCompatParcelizer(invokemethod);
                Object objComponentActivity = getpostalcode.ComponentActivity();
                if (!(!zIconCompatParcelizer)) {
                    SettingsScreenKt$SettingsScreen$2$1 settingsScreenKt$SettingsScreen$2$1 = new SettingsScreenKt$SettingsScreen$2$1(0, invokemethod, invokeMethod.class, "onShiftExtensionToggled", "onShiftExtensionToggled()V", 0, 9);
                    getpostalcode.write(settingsScreenKt$SettingsScreen$2$1);
                    objComponentActivity = settingsScreenKt$SettingsScreen$2$1;
                } else {
                    int i7 = write + 23;
                    RemoteActionCompatParcelizer = i7 % Fields.SpotShadowColor;
                    if (i7 % 2 == 0) {
                        AndroidContentCaptureManager androidContentCaptureManager = getCreditCardExpirationMonth.write;
                        throw null;
                    }
                    if (objComponentActivity == getCreditCardExpirationMonth.write) {
                        SettingsScreenKt$SettingsScreen$2$1 settingsScreenKt$SettingsScreen$2$2 = new SettingsScreenKt$SettingsScreen$2$1(0, invokemethod, invokeMethod.class, "onShiftExtensionToggled", "onShiftExtensionToggled()V", 0, 9);
                        getpostalcode.write(settingsScreenKt$SettingsScreen$2$2);
                        objComponentActivity = settingsScreenKt$SettingsScreen$2$2;
                    }
                }
                write(getadvertisinginfoobject, modifier2, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) ((registerInAppMessageManagerlambda0) objComponentActivity), getpostalcode, 0);
                getpostalcode.IconCompatParcelizer(false);
            } else {
                getpostalcode.serializer(-1336558466);
                getpostalcode.IconCompatParcelizer(false);
            }
        } else {
            getpostalcode.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
            modifier2 = modifier;
        }
        getHandleruiannotations gethandleruiannotationsMediaDescriptionCompat = getpostalcode.MediaDescriptionCompat();
        if (gethandleruiannotationsMediaDescriptionCompat != null) {
            gethandleruiannotationsMediaDescriptionCompat.serializer = new r8lambdarMv397hzZJazOE3eMmLe0m6ePY0(i, 6, invokemethod, modifier2);
            int i8 = RemoteActionCompatParcelizer + 125;
            write = i8 % Fields.SpotShadowColor;
            int i9 = i8 % 2;
        }
    }
}
