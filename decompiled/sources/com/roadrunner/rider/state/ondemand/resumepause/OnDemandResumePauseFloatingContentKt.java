package com.roadrunner.rider.state.ondemand.resumepause;

import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Fields;
import androidx.sqlite.SQLite;
import bo.app.d$$ExternalSyntheticOutline0;
import coil3.ExtrasKt;
import com.logistics.rider.glovo.R;
import com.roadrunner.designsystem.compose.theme.tokens.Dimensions;
import com.roadrunner.rrds.compose.component.buttons.PrimaryKt;
import com.roadrunner.settings.ui.screens.SettingsScreenKt$SettingsScreen$2$1;
import o.AndroidContentCaptureManager;
import o.SharedPreferencesManager;
import o.buildAndGetAttributionPackage;
import o.checkDeeplinkInSessionResponseI;
import o.checkSessionResponseI;
import o.equalEnum;
import o.getBirthDateFull;
import o.getCieXyz;
import o.getCreditCardExpirationMonth;
import o.getFacebookAttributionId;
import o.getHandleruiannotations;
import o.getOsName;
import o.getPostalCode;
import o.getQueryContext;
import o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0;
import o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM;
import o.r8lambdafjQ9B8d5OSR_i2BAJDXqNW6RNrY;
import o.r8lambdag2v_8ZFcgEbevxAiKW6LalaYkVg;
import o.registerInAppMessageManagerlambda0;
import o.removeNodeAtDepth;

/* JADX INFO: loaded from: classes3.dex */
public abstract class OnDemandResumePauseFloatingContentKt {
    private static int RemoteActionCompatParcelizer = 0;
    private static int write = 1;

    public static final void IconCompatParcelizer(int i, getBirthDateFull getbirthdatefull, Modifier modifier, String str, r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k0, r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k1, boolean z) {
        int i2;
        int i3;
        int i4 = 2 % 2;
        getPostalCode getpostalcode = (getPostalCode) getbirthdatefull;
        getpostalcode.MediaSessionCompatQueueItem(-1719241296);
        if ((i & 6) == 0) {
            if (getpostalcode.write(z)) {
                int i5 = write + 87;
                RemoteActionCompatParcelizer = i5 % Fields.SpotShadowColor;
                i3 = i5 % 2 != 0 ? 3 : 4;
            } else {
                int i6 = RemoteActionCompatParcelizer + 53;
                write = i6 % Fields.SpotShadowColor;
                int i7 = i6 % 2;
                i3 = 2;
            }
            i2 = i3 | i;
        } else {
            i2 = i;
        }
        Object obj = null;
        if ((i & 48) == 0) {
            int i8 = write + 107;
            RemoteActionCompatParcelizer = i8 % Fields.SpotShadowColor;
            if (i8 % 2 == 0) {
                i2 |= !getpostalcode.read(str) ? 16 : 32;
            } else {
                getpostalcode.read(str);
                throw null;
            }
        }
        if ((i & 384) == 0) {
            int i9 = RemoteActionCompatParcelizer + 39;
            write = i9 % Fields.SpotShadowColor;
            if (i9 % 2 != 0) {
                i2 |= getpostalcode.IconCompatParcelizer(r8lambdardpfsr94j4iebcwx_kpqzpm8k0) ? Fields.RotationX : Fields.SpotShadowColor;
                int i10 = RemoteActionCompatParcelizer + 63;
                write = i10 % Fields.SpotShadowColor;
                int i11 = i10 % 2;
            } else {
                getpostalcode.IconCompatParcelizer(r8lambdardpfsr94j4iebcwx_kpqzpm8k0);
                obj.hashCode();
                throw null;
            }
        }
        if ((i & 3072) == 0) {
            i2 |= getpostalcode.IconCompatParcelizer(r8lambdardpfsr94j4iebcwx_kpqzpm8k1) ? Fields.CameraDistance : Fields.RotationZ;
        }
        if ((i & 24576) == 0) {
            i2 |= getpostalcode.read(modifier) ? Fields.Clip : 8192;
        }
        if (!getpostalcode.write(i2 & 1, (i2 & 9363) != 9362)) {
            getpostalcode.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
        } else if (z) {
            getpostalcode.serializer(-432252444);
            modifier.getClass();
            PrimaryKt.write(str, r8lambdardpfsr94j4iebcwx_kpqzpm8k1, modifier, false, false, Integer.valueOf(R.drawable.ic_play_circle), null, null, null, null, getpostalcode, ((i2 >> 6) & 112) | ((i2 >> 3) & 14), 0, 2008);
            getpostalcode.IconCompatParcelizer(false);
        } else {
            getpostalcode.serializer(-432008381);
            modifier.getClass();
            float f = Dimensions.setCustomView;
            equalEnum.IconCompatParcelizer(R.drawable.ic_timer_pause, r8lambdardpfsr94j4iebcwx_kpqzpm8k0, modifier, false, null, f, f, getpostalcode, (i2 >> 3) & 112, 24);
            getpostalcode.IconCompatParcelizer(false);
        }
        getHandleruiannotations gethandleruiannotationsMediaDescriptionCompat = getpostalcode.MediaDescriptionCompat();
        if (gethandleruiannotationsMediaDescriptionCompat != null) {
            gethandleruiannotationsMediaDescriptionCompat.serializer = new getFacebookAttributionId(z, str, r8lambdardpfsr94j4iebcwx_kpqzpm8k0, r8lambdardpfsr94j4iebcwx_kpqzpm8k1, modifier, i);
        }
    }

    /* JADX WARN: Code duplicated, block: B:37:0x0095  */
    /* JADX WARN: Code duplicated, block: B:38:0x0097  */
    /* JADX WARN: Code duplicated, block: B:53:0x00d4 A[PHI: r0 r1
  0x00d4: PHI (r0v17 androidx.compose.ui.Modifier$Companion) = (r0v16 androidx.compose.ui.Modifier$Companion), (r0v59 androidx.compose.ui.Modifier$Companion) binds: [B:52:0x00d2, B:49:0x00c9] A[DONT_GENERATE, DONT_INLINE]
  0x00d4: PHI (r1v8 o.getQueryContext) = (r1v7 o.getQueryContext), (r1v30 o.getQueryContext) binds: [B:52:0x00d2, B:49:0x00c9] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:54:0x00d8 A[PHI: r0 r1
  0x00d8: PHI (r0v57 androidx.compose.ui.Modifier$Companion) = (r0v16 androidx.compose.ui.Modifier$Companion), (r0v59 androidx.compose.ui.Modifier$Companion) binds: [B:52:0x00d2, B:49:0x00c9] A[DONT_GENERATE, DONT_INLINE]
  0x00d8: PHI (r1v29 o.getQueryContext) = (r1v7 o.getQueryContext), (r1v30 o.getQueryContext) binds: [B:52:0x00d2, B:49:0x00c9] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:76:0x0150 A[PHI: r0 r1 r2
  0x0150: PHI (r0v38 java.lang.String) = (r0v37 java.lang.String), (r0v56 java.lang.String) binds: [B:75:0x014e, B:72:0x0140] A[DONT_GENERATE, DONT_INLINE]
  0x0150: PHI (r1v16 boolean) = (r1v15 boolean), (r1v28 boolean) binds: [B:75:0x014e, B:72:0x0140] A[DONT_GENERATE, DONT_INLINE]
  0x0150: PHI (r2v10 int) = (r2v9 int), (r2v16 int) binds: [B:75:0x014e, B:72:0x0140] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:77:0x0157 A[PHI: r0 r1 r2
  0x0157: PHI (r0v53 java.lang.String) = (r0v37 java.lang.String), (r0v56 java.lang.String) binds: [B:75:0x014e, B:72:0x0140] A[DONT_GENERATE, DONT_INLINE]
  0x0157: PHI (r1v27 boolean) = (r1v15 boolean), (r1v28 boolean) binds: [B:75:0x014e, B:72:0x0140] A[DONT_GENERATE, DONT_INLINE]
  0x0157: PHI (r2v15 int) = (r2v9 int), (r2v16 int) binds: [B:75:0x014e, B:72:0x0140] A[DONT_GENERATE, DONT_INLINE]] */
    public static final void OnDemandResumePauseFloatingContent(getOsName getosname, r8lambdafjQ9B8d5OSR_i2BAJDXqNW6RNrY r8lambdafjq9b8d5osr_i2bajdxqnw6rnry, r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm, r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k0, Modifier modifier, getBirthDateFull getbirthdatefull, int i) {
        int i2;
        boolean z;
        Modifier modifier2;
        Modifier.Companion companion;
        getQueryContext getquerycontext;
        Modifier.Companion companion2;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        String str;
        int i3;
        String str2;
        boolean z6;
        int i4;
        boolean z7;
        int i5;
        int i6 = 2 % 2;
        getosname.getClass();
        r8lambdafjq9b8d5osr_i2bajdxqnw6rnry.getClass();
        r8lambdaunavo3sxub_pc9xroryotnrlvsm.getClass();
        r8lambdardpfsr94j4iebcwx_kpqzpm8k0.getClass();
        getPostalCode getpostalcode = (getPostalCode) getbirthdatefull;
        getpostalcode.MediaSessionCompatQueueItem(-1509085438);
        if ((i & 6) == 0) {
            i2 = (getpostalcode.read(getosname) ? 4 : 2) | i;
            int i7 = RemoteActionCompatParcelizer + 21;
            write = i7 % Fields.SpotShadowColor;
            int i8 = i7 % 2;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= getpostalcode.IconCompatParcelizer(r8lambdafjq9b8d5osr_i2bajdxqnw6rnry) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            int i9 = write + 101;
            RemoteActionCompatParcelizer = i9 % Fields.SpotShadowColor;
            if (i9 % 2 != 0) {
                getpostalcode.IconCompatParcelizer(r8lambdaunavo3sxub_pc9xroryotnrlvsm);
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            i2 |= getpostalcode.IconCompatParcelizer(r8lambdaunavo3sxub_pc9xroryotnrlvsm) ? 256 : Fields.SpotShadowColor;
        }
        if ((i & 3072) == 0) {
            int i10 = write + 77;
            RemoteActionCompatParcelizer = i10 % Fields.SpotShadowColor;
            if (i10 % 2 != 0) {
                int i11 = 22 / 0;
                if (getpostalcode.IconCompatParcelizer(r8lambdardpfsr94j4iebcwx_kpqzpm8k0)) {
                    i5 = 2048;
                } else {
                    i5 = Fields.RotationZ;
                }
            } else if (getpostalcode.IconCompatParcelizer(r8lambdardpfsr94j4iebcwx_kpqzpm8k0)) {
                i5 = 2048;
            } else {
                i5 = Fields.RotationZ;
            }
            i2 |= i5;
        }
        int i12 = i2 | 24576;
        if ((i12 & 9363) != 9362) {
            int i13 = write + 105;
            RemoteActionCompatParcelizer = i13 % Fields.SpotShadowColor;
            int i14 = i13 % 2;
            z = true;
        } else {
            z = false;
        }
        if (getpostalcode.write(i12 & 1, z)) {
            int i15 = write + 31;
            RemoteActionCompatParcelizer = i15 % Fields.SpotShadowColor;
            if (i15 % 2 != 0) {
                companion = Modifier.Companion;
                getquerycontext = getosname.serializer;
                if ((i12 & 10161) == 19461) {
                    companion2 = companion;
                    z2 = true;
                } else {
                    companion2 = companion;
                    z2 = false;
                }
            } else {
                companion = Modifier.Companion;
                getquerycontext = getosname.serializer;
                if ((i12 & 896) == 256) {
                    companion2 = companion;
                    z2 = true;
                } else {
                    companion2 = companion;
                    z2 = false;
                }
            }
            if ((i12 & 7168) == 2048) {
                int i16 = RemoteActionCompatParcelizer + 39;
                write = i16 % Fields.SpotShadowColor;
                int i17 = i16 % 2;
                z3 = true;
            } else {
                z3 = false;
            }
            if ((i12 & 112) == 32) {
                int i18 = write + 51;
                RemoteActionCompatParcelizer = i18 % Fields.SpotShadowColor;
                int i19 = i18 % 2;
                z4 = true;
            } else {
                z4 = false;
            }
            Object objComponentActivity = getpostalcode.ComponentActivity();
            AndroidContentCaptureManager androidContentCaptureManager = getCreditCardExpirationMonth.write;
            if ((z2 | z3 | z4) || objComponentActivity == androidContentCaptureManager) {
                objComponentActivity = new SharedPreferencesManager(r8lambdaunavo3sxub_pc9xroryotnrlvsm, r8lambdardpfsr94j4iebcwx_kpqzpm8k0, r8lambdafjq9b8d5osr_i2bajdxqnw6rnry, 4);
                getpostalcode.write(objComponentActivity);
            }
            SQLite.write(getquerycontext, (r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) objComponentActivity, getpostalcode, 8);
            checkDeeplinkInSessionResponseI checkdeeplinkinsessionresponsei = (checkDeeplinkInSessionResponseI) ExtrasKt.write(getosname.MediaSessionCompatResultReceiverWrapper, getpostalcode, 0).getValue();
            if (checkdeeplinkinsessionresponsei instanceof buildAndGetAttributionPackage) {
                int i20 = write + 25;
                RemoteActionCompatParcelizer = i20 % Fields.SpotShadowColor;
                if (i20 % 2 != 0) {
                    getpostalcode.serializer(1467862233);
                    buildAndGetAttributionPackage buildandgetattributionpackage = (buildAndGetAttributionPackage) checkdeeplinkinsessionresponsei;
                    z5 = buildandgetattributionpackage.IconCompatParcelizer;
                    str = buildandgetattributionpackage.RemoteActionCompatParcelizer;
                    i3 = i12 & 24;
                    if (i3 == 3) {
                        str2 = str;
                        z6 = z5;
                        i4 = i3;
                        z7 = true;
                    } else {
                        str2 = str;
                        z6 = z5;
                        i4 = i3;
                        z7 = false;
                    }
                } else {
                    getpostalcode.serializer(1467862233);
                    buildAndGetAttributionPackage buildandgetattributionpackage2 = (buildAndGetAttributionPackage) checkdeeplinkinsessionresponsei;
                    z5 = buildandgetattributionpackage2.IconCompatParcelizer;
                    str = buildandgetattributionpackage2.RemoteActionCompatParcelizer;
                    i3 = i12 & 14;
                    if (i3 == 4) {
                        str2 = str;
                        z6 = z5;
                        i4 = i3;
                        z7 = true;
                    } else {
                        str2 = str;
                        z6 = z5;
                        i4 = i3;
                        z7 = false;
                    }
                }
                Object objComponentActivity2 = getpostalcode.ComponentActivity();
                if (z7 || objComponentActivity2 == androidContentCaptureManager) {
                    SettingsScreenKt$SettingsScreen$2$1 settingsScreenKt$SettingsScreen$2$1 = new SettingsScreenKt$SettingsScreen$2$1(0, getosname, getOsName.class, "onPauseOrder", "onPauseOrder()V", 0, 4);
                    getpostalcode.write(settingsScreenKt$SettingsScreen$2$1);
                    int i21 = write + 111;
                    RemoteActionCompatParcelizer = i21 % Fields.SpotShadowColor;
                    int i22 = i21 % 2;
                    objComponentActivity2 = settingsScreenKt$SettingsScreen$2$1;
                }
                r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k1 = (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) ((registerInAppMessageManagerlambda0) objComponentActivity2);
                boolean z8 = i4 == 4;
                Object objComponentActivity3 = getpostalcode.ComponentActivity();
                if (z8 || objComponentActivity3 == androidContentCaptureManager) {
                    SettingsScreenKt$SettingsScreen$2$1 settingsScreenKt$SettingsScreen$2$2 = new SettingsScreenKt$SettingsScreen$2$1(0, getosname, getOsName.class, "onResumeOrder", "onResumeOrder()V", 0, 5);
                    getpostalcode.write(settingsScreenKt$SettingsScreen$2$2);
                    objComponentActivity3 = settingsScreenKt$SettingsScreen$2$2;
                }
                IconCompatParcelizer(i12 & 57344, getpostalcode, companion2, str2, r8lambdardpfsr94j4iebcwx_kpqzpm8k1, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) ((registerInAppMessageManagerlambda0) objComponentActivity3), z6);
                getpostalcode.IconCompatParcelizer(false);
            } else {
                if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{checkdeeplinkinsessionresponsei, checkSessionResponseI.serializer}, getCieXyz.write())).booleanValue()) {
                    throw d$$ExternalSyntheticOutline0.m(getpostalcode, 1467859140, false);
                }
                int i23 = RemoteActionCompatParcelizer + 113;
                write = i23 % Fields.SpotShadowColor;
                if (i23 % 2 == 0) {
                    getpostalcode.serializer(1467870790);
                    getpostalcode.IconCompatParcelizer(true);
                } else {
                    getpostalcode.serializer(1467870790);
                    getpostalcode.IconCompatParcelizer(false);
                }
            }
            modifier2 = companion2;
        } else {
            getpostalcode.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
            modifier2 = modifier;
        }
        getHandleruiannotations gethandleruiannotationsMediaDescriptionCompat = getpostalcode.MediaDescriptionCompat();
        if (gethandleruiannotationsMediaDescriptionCompat != null) {
            gethandleruiannotationsMediaDescriptionCompat.serializer = new r8lambdag2v_8ZFcgEbevxAiKW6LalaYkVg((Object) getosname, r8lambdafjq9b8d5osr_i2bajdxqnw6rnry, r8lambdaunavo3sxub_pc9xroryotnrlvsm, r8lambdardpfsr94j4iebcwx_kpqzpm8k0, modifier2, i, 19);
        }
    }
}
