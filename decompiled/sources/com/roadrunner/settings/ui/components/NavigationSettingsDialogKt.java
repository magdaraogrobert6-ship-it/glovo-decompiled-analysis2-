package com.roadrunner.settings.ui.components;

import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Fields;
import bo.app.d$$ExternalSyntheticOutline0;
import coil3.ExtrasKt;
import com.roadrunner.designsystem.compose.theme.tokens.Dimensions;
import com.roadrunner.rrds.compose.component.dialog.messagedialog.MessagePopUpKt;
import com.roadrunner.settings.ui.screens.SettingsScreenKt$SettingsScreen$2$1;
import o.AndroidContentCaptureManager;
import o.generatePOSTBodyString;
import o.getBirthDateFull;
import o.getCieXyz;
import o.getCreditCardExpirationMonth;
import o.getHandleruiannotations;
import o.getPostalCode;
import o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0;
import o.r8lambdaXP4Nwh7Q1tgVV2yUbVKsNMfLZc0;
import o.r8lambdaXhAtNt2NGzcpinZ4H9j3MH3NX1A;
import o.r8lambdaXtOPdaFKN1NrHqS3UNFXQeFtMno;
import o.r8lambdaXx663dmZF6jhFpjZqVMZK8YZwns;
import o.r8lambdaYNjZcgGNV711y3apcXbCLx9buIQ;
import o.r8lambdarMv397hzZJazOE3eMmLe0m6ePY0;
import o.registerInAppMessageManagerlambda0;
import o.removeNodeAtDepth;
import o.validateMigration;

/* JADX INFO: loaded from: classes3.dex */
public abstract class NavigationSettingsDialogKt {
    private static int read = 0;
    private static int write = 1;

    public static final void serializer(generatePOSTBodyString generatepostbodystring, r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k0, r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k1, Modifier modifier, getBirthDateFull getbirthdatefull, int i) {
        int i2;
        int i3;
        int i4;
        int i5 = 2 % 2;
        int i6 = read + 105;
        write = i6 % Fields.SpotShadowColor;
        int i7 = i6 % 2;
        getPostalCode getpostalcode = (getPostalCode) getbirthdatefull;
        getpostalcode.MediaSessionCompatQueueItem(-202557970);
        if ((i & 6) == 0) {
            if ((i & 8) == 0 ? getpostalcode.read(generatepostbodystring) : getpostalcode.IconCompatParcelizer(generatepostbodystring)) {
                int i8 = write + 97;
                read = i8 % Fields.SpotShadowColor;
                i4 = i8 % 2 != 0 ? 5 : 4;
            } else {
                i4 = 2;
            }
            i2 = i4 | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            if (getpostalcode.IconCompatParcelizer(r8lambdardpfsr94j4iebcwx_kpqzpm8k0)) {
                int i9 = write + 35;
                read = i9 % Fields.SpotShadowColor;
                int i10 = i9 % 2;
                i3 = 32;
            } else {
                int i11 = read + 21;
                write = i11 % Fields.SpotShadowColor;
                if (i11 % 2 == 0) {
                    int i12 = 2 % 4;
                }
                i3 = 16;
            }
            i2 |= i3;
        }
        boolean z = true;
        if ((i & 384) == 0) {
            int i13 = write + 1;
            read = i13 % Fields.SpotShadowColor;
            int i14 = i13 % 2;
            i2 |= getpostalcode.IconCompatParcelizer(r8lambdardpfsr94j4iebcwx_kpqzpm8k1) ? Fields.RotationX : Fields.SpotShadowColor;
        }
        if ((i & 3072) == 0) {
            i2 |= getpostalcode.read(modifier) ? Fields.CameraDistance : Fields.RotationZ;
        }
        if ((i2 & 1171) != 1170) {
            int i15 = read + 83;
            int i16 = i15 % Fields.SpotShadowColor;
            write = i16;
            int i17 = i15 % 2;
            int i18 = i16 + 101;
            read = i18 % Fields.SpotShadowColor;
            int i19 = i18 % 2;
        } else {
            z = false;
        }
        if (getpostalcode.write(i2 & 1, z)) {
            MessagePopUpKt.serializer(generatepostbodystring, r8lambdardpfsr94j4iebcwx_kpqzpm8k1, PaddingKt.write(SizeKt.write(modifier, 1.0f), Dimensions.setActionBarVisibilityCallback), false, null, r8lambdardpfsr94j4iebcwx_kpqzpm8k0, null, r8lambdardpfsr94j4iebcwx_kpqzpm8k1, null, getpostalcode, (i2 & 14) | 3072 | ((i2 >> 3) & 112) | ((i2 << 12) & 458752) | ((i2 << 15) & 29360128), 336);
        } else {
            getpostalcode.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
        }
        getHandleruiannotations gethandleruiannotationsMediaDescriptionCompat = getpostalcode.MediaDescriptionCompat();
        if (gethandleruiannotationsMediaDescriptionCompat != null) {
            gethandleruiannotationsMediaDescriptionCompat.serializer = new validateMigration(generatepostbodystring, r8lambdardpfsr94j4iebcwx_kpqzpm8k0, r8lambdardpfsr94j4iebcwx_kpqzpm8k1, modifier, i, 3);
        }
    }

    /* JADX WARN: Code duplicated, block: B:20:0x0059 A[PHI: r0 r2 r4
  0x0059: PHI (r0v40 androidx.compose.ui.Modifier$Companion) = (r0v16 androidx.compose.ui.Modifier$Companion), (r0v60 androidx.compose.ui.Modifier$Companion) binds: [B:23:0x0072, B:19:0x0057] A[DONT_GENERATE, DONT_INLINE]
  0x0059: PHI (r2v16 o.r8lambdaXP4Nwh7Q1tgVV2yUbVKsNMfLZc0) = (r2v7 o.r8lambdaXP4Nwh7Q1tgVV2yUbVKsNMfLZc0), (r2v31 o.r8lambdaXP4Nwh7Q1tgVV2yUbVKsNMfLZc0) binds: [B:23:0x0072, B:19:0x0057] A[DONT_GENERATE, DONT_INLINE]
  0x0059: PHI (r4v5 o.AndroidContentCaptureManager) = (r4v0 o.AndroidContentCaptureManager), (r4v9 o.AndroidContentCaptureManager) binds: [B:23:0x0072, B:19:0x0057] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:21:0x005c A[PHI: r0 r2 r4
  0x005c: PHI (r0v17 androidx.compose.ui.Modifier$Companion) = (r0v16 androidx.compose.ui.Modifier$Companion), (r0v60 androidx.compose.ui.Modifier$Companion) binds: [B:23:0x0072, B:19:0x0057] A[DONT_GENERATE, DONT_INLINE]
  0x005c: PHI (r2v8 o.r8lambdaXP4Nwh7Q1tgVV2yUbVKsNMfLZc0) = (r2v7 o.r8lambdaXP4Nwh7Q1tgVV2yUbVKsNMfLZc0), (r2v31 o.r8lambdaXP4Nwh7Q1tgVV2yUbVKsNMfLZc0) binds: [B:23:0x0072, B:19:0x0057] A[DONT_GENERATE, DONT_INLINE]
  0x005c: PHI (r4v1 o.AndroidContentCaptureManager) = (r4v0 o.AndroidContentCaptureManager), (r4v9 o.AndroidContentCaptureManager) binds: [B:23:0x0072, B:19:0x0057] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:27:0x0089  */
    /* JADX WARN: Code duplicated, block: B:30:0x0094  */
    /* JADX WARN: Code duplicated, block: B:31:0x0097  */
    /* JADX WARN: Code duplicated, block: B:34:0x00cd  */
    /* JADX WARN: Code duplicated, block: B:36:0x00d8  */
    /* JADX WARN: Code duplicated, block: B:39:0x00df A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:40:0x00e1  */
    /* JADX WARN: Code duplicated, block: B:44:0x0113  */
    /* JADX WARN: Code duplicated, block: B:46:0x0127  */
    /* JADX WARN: Code duplicated, block: B:48:0x0132  */
    /* JADX WARN: Code duplicated, block: B:51:0x0139 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:52:0x013b  */
    /* JADX WARN: Code duplicated, block: B:56:0x0165  */
    /* JADX WARN: Code duplicated, block: B:58:0x0190  */
    /* JADX WARN: Code duplicated, block: B:60:0x01b8  */
    /* JADX WARN: Code duplicated, block: B:61:0x01c3  */
    public static final void NavigationSettingsDialog(r8lambdaXx663dmZF6jhFpjZqVMZK8YZwns r8lambdaxx663dmzf6jhfpjzqvmzk8yzwns, Modifier modifier, getBirthDateFull getbirthdatefull, int i) {
        int i2;
        Modifier modifier2;
        Modifier.Companion companion;
        r8lambdaXP4Nwh7Q1tgVV2yUbVKsNMfLZc0 r8lambdaxp4nwh7q1tgvv2yubvksnmflzc0;
        AndroidContentCaptureManager androidContentCaptureManager;
        AndroidContentCaptureManager androidContentCaptureManager2;
        boolean zIconCompatParcelizer;
        Object objComponentActivity;
        boolean zIconCompatParcelizer2;
        Object objComponentActivity2;
        int i3;
        AndroidContentCaptureManager androidContentCaptureManager3;
        boolean zIconCompatParcelizer3;
        Object objComponentActivity3;
        boolean zIconCompatParcelizer4;
        Object objComponentActivity4;
        int i4;
        int i5 = 2 % 2;
        r8lambdaxx663dmzf6jhfpjzqvmzk8yzwns.getClass();
        getPostalCode getpostalcode = (getPostalCode) getbirthdatefull;
        getpostalcode.MediaSessionCompatQueueItem(-699846613);
        if ((i & 6) == 0) {
            i2 = (getpostalcode.IconCompatParcelizer(r8lambdaxx663dmzf6jhfpjzqvmzk8yzwns) ^ true ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        int i6 = i2 | 48;
        if (getpostalcode.write(i6 & 1, (i6 & 19) != 18)) {
            int i7 = read + 71;
            write = i7 % Fields.SpotShadowColor;
            if (i7 % 2 == 0) {
                companion = Modifier.Companion;
                r8lambdaxp4nwh7q1tgvv2yubvksnmflzc0 = (r8lambdaXP4Nwh7Q1tgVV2yUbVKsNMfLZc0) ExtrasKt.write(r8lambdaxx663dmzf6jhfpjzqvmzk8yzwns.MediaMetadataCompat, getpostalcode, 0).getValue();
                boolean z = r8lambdaxp4nwh7q1tgvv2yubvksnmflzc0 instanceof r8lambdaXtOPdaFKN1NrHqS3UNFXQeFtMno;
                androidContentCaptureManager = getCreditCardExpirationMonth.write;
                if (z) {
                    Modifier.Companion companion2 = companion;
                    androidContentCaptureManager3 = androidContentCaptureManager;
                    getpostalcode.serializer(1757278864);
                    generatePOSTBodyString generatepostbodystring = ((r8lambdaXtOPdaFKN1NrHqS3UNFXQeFtMno) r8lambdaxp4nwh7q1tgvv2yubvksnmflzc0).serializer;
                    zIconCompatParcelizer3 = getpostalcode.IconCompatParcelizer(r8lambdaxx663dmzf6jhfpjzqvmzk8yzwns);
                    objComponentActivity3 = getpostalcode.ComponentActivity();
                    if (zIconCompatParcelizer3) {
                        SettingsScreenKt$SettingsScreen$2$1 settingsScreenKt$SettingsScreen$2$1 = new SettingsScreenKt$SettingsScreen$2$1(0, r8lambdaxx663dmzf6jhfpjzqvmzk8yzwns, r8lambdaXx663dmZF6jhFpjZqVMZK8YZwns.class, "onConfirmClick", "onConfirmClick()V", 0, 16);
                        getpostalcode.write(settingsScreenKt$SettingsScreen$2$1);
                        int i8 = read + 55;
                        write = i8 % Fields.SpotShadowColor;
                        int i9 = i8 % 2;
                        objComponentActivity3 = settingsScreenKt$SettingsScreen$2$1;
                    } else {
                        int i10 = read + 1;
                        write = i10 % Fields.SpotShadowColor;
                        int i11 = i10 % 2;
                        if (objComponentActivity3 == androidContentCaptureManager3) {
                            SettingsScreenKt$SettingsScreen$2$1 settingsScreenKt$SettingsScreen$2$2 = new SettingsScreenKt$SettingsScreen$2$1(0, r8lambdaxx663dmzf6jhfpjzqvmzk8yzwns, r8lambdaXx663dmZF6jhFpjZqVMZK8YZwns.class, "onConfirmClick", "onConfirmClick()V", 0, 16);
                            getpostalcode.write(settingsScreenKt$SettingsScreen$2$2);
                            int i12 = read + 55;
                            write = i12 % Fields.SpotShadowColor;
                            int i13 = i12 % 2;
                            objComponentActivity3 = settingsScreenKt$SettingsScreen$2$2;
                        }
                    }
                    r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k0 = (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) ((registerInAppMessageManagerlambda0) objComponentActivity3);
                    zIconCompatParcelizer4 = getpostalcode.IconCompatParcelizer(r8lambdaxx663dmzf6jhfpjzqvmzk8yzwns);
                    objComponentActivity4 = getpostalcode.ComponentActivity();
                    if (zIconCompatParcelizer4) {
                        SettingsScreenKt$SettingsScreen$2$1 settingsScreenKt$SettingsScreen$2$3 = new SettingsScreenKt$SettingsScreen$2$1(0, r8lambdaxx663dmzf6jhfpjzqvmzk8yzwns, r8lambdaXx663dmZF6jhFpjZqVMZK8YZwns.class, "onDismiss", "onDismiss()V", 0, 17);
                        getpostalcode.write(settingsScreenKt$SettingsScreen$2$3);
                        objComponentActivity4 = settingsScreenKt$SettingsScreen$2$3;
                    } else {
                        i4 = read + 67;
                        write = i4 % Fields.SpotShadowColor;
                        if (i4 % 2 == 0) {
                            int i14 = 23 / 0;
                            if (objComponentActivity4 == androidContentCaptureManager3) {
                                SettingsScreenKt$SettingsScreen$2$1 settingsScreenKt$SettingsScreen$2$4 = new SettingsScreenKt$SettingsScreen$2$1(0, r8lambdaxx663dmzf6jhfpjzqvmzk8yzwns, r8lambdaXx663dmZF6jhFpjZqVMZK8YZwns.class, "onDismiss", "onDismiss()V", 0, 17);
                                getpostalcode.write(settingsScreenKt$SettingsScreen$2$4);
                                objComponentActivity4 = settingsScreenKt$SettingsScreen$2$4;
                            }
                        } else if (objComponentActivity4 == androidContentCaptureManager3) {
                            SettingsScreenKt$SettingsScreen$2$1 settingsScreenKt$SettingsScreen$2$5 = new SettingsScreenKt$SettingsScreen$2$1(0, r8lambdaxx663dmzf6jhfpjzqvmzk8yzwns, r8lambdaXx663dmZF6jhFpjZqVMZK8YZwns.class, "onDismiss", "onDismiss()V", 0, 17);
                            getpostalcode.write(settingsScreenKt$SettingsScreen$2$5);
                            objComponentActivity4 = settingsScreenKt$SettingsScreen$2$5;
                        }
                    }
                    serializer(generatepostbodystring, r8lambdardpfsr94j4iebcwx_kpqzpm8k0, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) ((registerInAppMessageManagerlambda0) objComponentActivity4), companion2, getpostalcode, (i6 << 6) & 7168);
                    getpostalcode.IconCompatParcelizer(false);
                    modifier2 = companion2;
                } else {
                    modifier2 = companion;
                    androidContentCaptureManager2 = androidContentCaptureManager;
                    if (r8lambdaxp4nwh7q1tgvv2yubvksnmflzc0 instanceof r8lambdaYNjZcgGNV711y3apcXbCLx9buIQ) {
                        getpostalcode.serializer(1757287440);
                        generatePOSTBodyString generatepostbodystring2 = ((r8lambdaYNjZcgGNV711y3apcXbCLx9buIQ) r8lambdaxp4nwh7q1tgvv2yubvksnmflzc0).serializer;
                        zIconCompatParcelizer = getpostalcode.IconCompatParcelizer(r8lambdaxx663dmzf6jhfpjzqvmzk8yzwns);
                        objComponentActivity = getpostalcode.ComponentActivity();
                        if (zIconCompatParcelizer) {
                            SettingsScreenKt$SettingsScreen$2$1 settingsScreenKt$SettingsScreen$2$6 = new SettingsScreenKt$SettingsScreen$2$1(0, r8lambdaxx663dmzf6jhfpjzqvmzk8yzwns, r8lambdaXx663dmZF6jhFpjZqVMZK8YZwns.class, "onConfirmClick", "onConfirmClick()V", 0, 18);
                            getpostalcode.write(settingsScreenKt$SettingsScreen$2$6);
                            objComponentActivity = settingsScreenKt$SettingsScreen$2$6;
                        } else {
                            i3 = read + 97;
                            write = i3 % Fields.SpotShadowColor;
                            if (i3 % 2 == 0) {
                                int i15 = 52 / 0;
                                if (objComponentActivity == androidContentCaptureManager2) {
                                    SettingsScreenKt$SettingsScreen$2$1 settingsScreenKt$SettingsScreen$2$7 = new SettingsScreenKt$SettingsScreen$2$1(0, r8lambdaxx663dmzf6jhfpjzqvmzk8yzwns, r8lambdaXx663dmZF6jhFpjZqVMZK8YZwns.class, "onConfirmClick", "onConfirmClick()V", 0, 18);
                                    getpostalcode.write(settingsScreenKt$SettingsScreen$2$7);
                                    objComponentActivity = settingsScreenKt$SettingsScreen$2$7;
                                }
                            } else if (objComponentActivity == androidContentCaptureManager2) {
                                SettingsScreenKt$SettingsScreen$2$1 settingsScreenKt$SettingsScreen$2$8 = new SettingsScreenKt$SettingsScreen$2$1(0, r8lambdaxx663dmzf6jhfpjzqvmzk8yzwns, r8lambdaXx663dmZF6jhFpjZqVMZK8YZwns.class, "onConfirmClick", "onConfirmClick()V", 0, 18);
                                getpostalcode.write(settingsScreenKt$SettingsScreen$2$8);
                                objComponentActivity = settingsScreenKt$SettingsScreen$2$8;
                            }
                        }
                        r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k1 = (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) ((registerInAppMessageManagerlambda0) objComponentActivity);
                        zIconCompatParcelizer2 = getpostalcode.IconCompatParcelizer(r8lambdaxx663dmzf6jhfpjzqvmzk8yzwns);
                        objComponentActivity2 = getpostalcode.ComponentActivity();
                        if (zIconCompatParcelizer2 || objComponentActivity2 == androidContentCaptureManager2) {
                            SettingsScreenKt$SettingsScreen$2$1 settingsScreenKt$SettingsScreen$2$9 = new SettingsScreenKt$SettingsScreen$2$1(0, r8lambdaxx663dmzf6jhfpjzqvmzk8yzwns, r8lambdaXx663dmZF6jhFpjZqVMZK8YZwns.class, "onDismiss", "onDismiss()V", 0, 19);
                            getpostalcode.write(settingsScreenKt$SettingsScreen$2$9);
                            objComponentActivity2 = settingsScreenKt$SettingsScreen$2$9;
                        }
                        serializer(generatepostbodystring2, r8lambdardpfsr94j4iebcwx_kpqzpm8k1, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) ((registerInAppMessageManagerlambda0) objComponentActivity2), modifier2, getpostalcode, (i6 << 6) & 7168);
                        getpostalcode.IconCompatParcelizer(false);
                    } else {
                        if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{r8lambdaxp4nwh7q1tgvv2yubvksnmflzc0, r8lambdaXhAtNt2NGzcpinZ4H9j3MH3NX1A.write}, getCieXyz.write())).booleanValue()) {
                            throw d$$ExternalSyntheticOutline0.m(getpostalcode, 1757274862, false);
                        }
                        getpostalcode.serializer(1757295471);
                        getpostalcode.IconCompatParcelizer(false);
                    }
                }
            } else {
                companion = Modifier.Companion;
                r8lambdaxp4nwh7q1tgvv2yubvksnmflzc0 = (r8lambdaXP4Nwh7Q1tgVV2yUbVKsNMfLZc0) ExtrasKt.write(r8lambdaxx663dmzf6jhfpjzqvmzk8yzwns.MediaMetadataCompat, getpostalcode, 0).getValue();
                boolean z2 = r8lambdaxp4nwh7q1tgvv2yubvksnmflzc0 instanceof r8lambdaXtOPdaFKN1NrHqS3UNFXQeFtMno;
                androidContentCaptureManager = getCreditCardExpirationMonth.write;
                if (z2) {
                    Modifier.Companion companion3 = companion;
                    androidContentCaptureManager3 = androidContentCaptureManager;
                    getpostalcode.serializer(1757278864);
                    generatePOSTBodyString generatepostbodystring3 = ((r8lambdaXtOPdaFKN1NrHqS3UNFXQeFtMno) r8lambdaxp4nwh7q1tgvv2yubvksnmflzc0).serializer;
                    zIconCompatParcelizer3 = getpostalcode.IconCompatParcelizer(r8lambdaxx663dmzf6jhfpjzqvmzk8yzwns);
                    objComponentActivity3 = getpostalcode.ComponentActivity();
                    if (zIconCompatParcelizer3) {
                        int i16 = read + 1;
                        write = i16 % Fields.SpotShadowColor;
                        int i17 = i16 % 2;
                        if (objComponentActivity3 == androidContentCaptureManager3) {
                            SettingsScreenKt$SettingsScreen$2$1 settingsScreenKt$SettingsScreen$2$10 = new SettingsScreenKt$SettingsScreen$2$1(0, r8lambdaxx663dmzf6jhfpjzqvmzk8yzwns, r8lambdaXx663dmZF6jhFpjZqVMZK8YZwns.class, "onConfirmClick", "onConfirmClick()V", 0, 16);
                            getpostalcode.write(settingsScreenKt$SettingsScreen$2$10);
                            int i18 = read + 55;
                            write = i18 % Fields.SpotShadowColor;
                            int i19 = i18 % 2;
                            objComponentActivity3 = settingsScreenKt$SettingsScreen$2$10;
                        }
                    } else {
                        SettingsScreenKt$SettingsScreen$2$1 settingsScreenKt$SettingsScreen$2$11 = new SettingsScreenKt$SettingsScreen$2$1(0, r8lambdaxx663dmzf6jhfpjzqvmzk8yzwns, r8lambdaXx663dmZF6jhFpjZqVMZK8YZwns.class, "onConfirmClick", "onConfirmClick()V", 0, 16);
                        getpostalcode.write(settingsScreenKt$SettingsScreen$2$11);
                        int i110 = read + 55;
                        write = i110 % Fields.SpotShadowColor;
                        int i111 = i110 % 2;
                        objComponentActivity3 = settingsScreenKt$SettingsScreen$2$11;
                    }
                    r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k2 = (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) ((registerInAppMessageManagerlambda0) objComponentActivity3);
                    zIconCompatParcelizer4 = getpostalcode.IconCompatParcelizer(r8lambdaxx663dmzf6jhfpjzqvmzk8yzwns);
                    objComponentActivity4 = getpostalcode.ComponentActivity();
                    if (zIconCompatParcelizer4) {
                        i4 = read + 67;
                        write = i4 % Fields.SpotShadowColor;
                        if (i4 % 2 == 0) {
                            int i112 = 23 / 0;
                            if (objComponentActivity4 == androidContentCaptureManager3) {
                                SettingsScreenKt$SettingsScreen$2$1 settingsScreenKt$SettingsScreen$2$12 = new SettingsScreenKt$SettingsScreen$2$1(0, r8lambdaxx663dmzf6jhfpjzqvmzk8yzwns, r8lambdaXx663dmZF6jhFpjZqVMZK8YZwns.class, "onDismiss", "onDismiss()V", 0, 17);
                                getpostalcode.write(settingsScreenKt$SettingsScreen$2$12);
                                objComponentActivity4 = settingsScreenKt$SettingsScreen$2$12;
                            }
                        } else if (objComponentActivity4 == androidContentCaptureManager3) {
                            SettingsScreenKt$SettingsScreen$2$1 settingsScreenKt$SettingsScreen$2$13 = new SettingsScreenKt$SettingsScreen$2$1(0, r8lambdaxx663dmzf6jhfpjzqvmzk8yzwns, r8lambdaXx663dmZF6jhFpjZqVMZK8YZwns.class, "onDismiss", "onDismiss()V", 0, 17);
                            getpostalcode.write(settingsScreenKt$SettingsScreen$2$13);
                            objComponentActivity4 = settingsScreenKt$SettingsScreen$2$13;
                        }
                    } else {
                        SettingsScreenKt$SettingsScreen$2$1 settingsScreenKt$SettingsScreen$2$14 = new SettingsScreenKt$SettingsScreen$2$1(0, r8lambdaxx663dmzf6jhfpjzqvmzk8yzwns, r8lambdaXx663dmZF6jhFpjZqVMZK8YZwns.class, "onDismiss", "onDismiss()V", 0, 17);
                        getpostalcode.write(settingsScreenKt$SettingsScreen$2$14);
                        objComponentActivity4 = settingsScreenKt$SettingsScreen$2$14;
                    }
                    serializer(generatepostbodystring3, r8lambdardpfsr94j4iebcwx_kpqzpm8k2, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) ((registerInAppMessageManagerlambda0) objComponentActivity4), companion3, getpostalcode, (i6 << 6) & 7168);
                    getpostalcode.IconCompatParcelizer(false);
                    modifier2 = companion3;
                } else {
                    modifier2 = companion;
                    androidContentCaptureManager2 = androidContentCaptureManager;
                    if (r8lambdaxp4nwh7q1tgvv2yubvksnmflzc0 instanceof r8lambdaYNjZcgGNV711y3apcXbCLx9buIQ) {
                        getpostalcode.serializer(1757287440);
                        generatePOSTBodyString generatepostbodystring4 = ((r8lambdaYNjZcgGNV711y3apcXbCLx9buIQ) r8lambdaxp4nwh7q1tgvv2yubvksnmflzc0).serializer;
                        zIconCompatParcelizer = getpostalcode.IconCompatParcelizer(r8lambdaxx663dmzf6jhfpjzqvmzk8yzwns);
                        objComponentActivity = getpostalcode.ComponentActivity();
                        if (zIconCompatParcelizer) {
                            i3 = read + 97;
                            write = i3 % Fields.SpotShadowColor;
                            if (i3 % 2 == 0) {
                                int i113 = 52 / 0;
                                if (objComponentActivity == androidContentCaptureManager2) {
                                    SettingsScreenKt$SettingsScreen$2$1 settingsScreenKt$SettingsScreen$2$15 = new SettingsScreenKt$SettingsScreen$2$1(0, r8lambdaxx663dmzf6jhfpjzqvmzk8yzwns, r8lambdaXx663dmZF6jhFpjZqVMZK8YZwns.class, "onConfirmClick", "onConfirmClick()V", 0, 18);
                                    getpostalcode.write(settingsScreenKt$SettingsScreen$2$15);
                                    objComponentActivity = settingsScreenKt$SettingsScreen$2$15;
                                }
                            } else if (objComponentActivity == androidContentCaptureManager2) {
                                SettingsScreenKt$SettingsScreen$2$1 settingsScreenKt$SettingsScreen$2$16 = new SettingsScreenKt$SettingsScreen$2$1(0, r8lambdaxx663dmzf6jhfpjzqvmzk8yzwns, r8lambdaXx663dmZF6jhFpjZqVMZK8YZwns.class, "onConfirmClick", "onConfirmClick()V", 0, 18);
                                getpostalcode.write(settingsScreenKt$SettingsScreen$2$16);
                                objComponentActivity = settingsScreenKt$SettingsScreen$2$16;
                            }
                        } else {
                            SettingsScreenKt$SettingsScreen$2$1 settingsScreenKt$SettingsScreen$2$17 = new SettingsScreenKt$SettingsScreen$2$1(0, r8lambdaxx663dmzf6jhfpjzqvmzk8yzwns, r8lambdaXx663dmZF6jhFpjZqVMZK8YZwns.class, "onConfirmClick", "onConfirmClick()V", 0, 18);
                            getpostalcode.write(settingsScreenKt$SettingsScreen$2$17);
                            objComponentActivity = settingsScreenKt$SettingsScreen$2$17;
                        }
                        r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k3 = (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) ((registerInAppMessageManagerlambda0) objComponentActivity);
                        zIconCompatParcelizer2 = getpostalcode.IconCompatParcelizer(r8lambdaxx663dmzf6jhfpjzqvmzk8yzwns);
                        objComponentActivity2 = getpostalcode.ComponentActivity();
                        if (zIconCompatParcelizer2) {
                            SettingsScreenKt$SettingsScreen$2$1 settingsScreenKt$SettingsScreen$2$18 = new SettingsScreenKt$SettingsScreen$2$1(0, r8lambdaxx663dmzf6jhfpjzqvmzk8yzwns, r8lambdaXx663dmZF6jhFpjZqVMZK8YZwns.class, "onDismiss", "onDismiss()V", 0, 19);
                            getpostalcode.write(settingsScreenKt$SettingsScreen$2$18);
                            objComponentActivity2 = settingsScreenKt$SettingsScreen$2$18;
                        } else {
                            SettingsScreenKt$SettingsScreen$2$1 settingsScreenKt$SettingsScreen$2$19 = new SettingsScreenKt$SettingsScreen$2$1(0, r8lambdaxx663dmzf6jhfpjzqvmzk8yzwns, r8lambdaXx663dmZF6jhFpjZqVMZK8YZwns.class, "onDismiss", "onDismiss()V", 0, 19);
                            getpostalcode.write(settingsScreenKt$SettingsScreen$2$19);
                            objComponentActivity2 = settingsScreenKt$SettingsScreen$2$19;
                        }
                        serializer(generatepostbodystring4, r8lambdardpfsr94j4iebcwx_kpqzpm8k3, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) ((registerInAppMessageManagerlambda0) objComponentActivity2), modifier2, getpostalcode, (i6 << 6) & 7168);
                        getpostalcode.IconCompatParcelizer(false);
                    } else {
                        if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{r8lambdaxp4nwh7q1tgvv2yubvksnmflzc0, r8lambdaXhAtNt2NGzcpinZ4H9j3MH3NX1A.write}, getCieXyz.write())).booleanValue()) {
                            throw d$$ExternalSyntheticOutline0.m(getpostalcode, 1757274862, false);
                        }
                        getpostalcode.serializer(1757295471);
                        getpostalcode.IconCompatParcelizer(false);
                    }
                }
            }
        } else {
            getpostalcode.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
            modifier2 = modifier;
        }
        getHandleruiannotations gethandleruiannotationsMediaDescriptionCompat = getpostalcode.MediaDescriptionCompat();
        if (gethandleruiannotationsMediaDescriptionCompat != null) {
            gethandleruiannotationsMediaDescriptionCompat.serializer = new r8lambdarMv397hzZJazOE3eMmLe0m6ePY0(i, 10, r8lambdaxx663dmzf6jhfpjzqvmzk8yzwns, modifier2);
            int i20 = read + 13;
            write = i20 % Fields.SpotShadowColor;
            int i21 = i20 % 2;
        }
    }
}
