package com.roadrunner.sidemenu.photoId;

import android.content.Context;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Fields;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.sqlite.SQLite;
import coil3.Extras$Key;
import coil3.ExtrasKt;
import com.logistics.rider.glovo.R;
import com.roadrunner.settings.ui.screens.SettingsScreenKt$SettingsScreen$2$1;
import com.roadrunner.tnc.TncContentKt$$ExternalSyntheticLambda1;
import o.AndroidContentCaptureManager;
import o.LinearGradientShaderVjE6UOU;
import o.LinearGradientShaderVjE6UOUdefault;
import o.SimpleGraphicsLayerModifiermeasure1;
import o.SweepGradientShader9KIMszo;
import o._get_deviceId_lambda0;
import o._get_registeredPushToken_lambda0;
import o._set_registeredPushToken_lambda10;
import o.equalEnum;
import o.getBirthDateFull;
import o.getCreditCardExpirationMonth;
import o.getHandleruiannotations;
import o.getNewPassword;
import o.getPostalCode;
import o.getQueryContext;
import o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0;
import o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM;
import o.r8lambdaZmWJ7_kmLiTuhtIga_c7SGMfvU;
import o.r8lambday_zuDuH0rSLU3Q7PVVGz8MXtiaM;
import o.registerInAppMessageManagerlambda0;
import o.setTransformQ8lPUPs;

/* JADX INFO: loaded from: classes3.dex */
public abstract class PhotoIdContainerKt {
    private static int RemoteActionCompatParcelizer = 1;
    private static int write;

    public static final void read(String str, r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k0, getBirthDateFull getbirthdatefull, int i) {
        int i2;
        boolean z;
        int i3;
        int i4 = 2;
        int i5 = 2 % 2;
        int i6 = RemoteActionCompatParcelizer + 3;
        write = i6 % Fields.SpotShadowColor;
        int i7 = i6 % 2;
        getPostalCode getpostalcode = (getPostalCode) getbirthdatefull;
        getpostalcode.MediaSessionCompatQueueItem(-563836389);
        if ((i & 6) == 0) {
            int i8 = write + 63;
            RemoteActionCompatParcelizer = i8 % Fields.SpotShadowColor;
            int i9 = i8 % 2;
            i2 = (getpostalcode.read(str) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            if (getpostalcode.IconCompatParcelizer(r8lambdardpfsr94j4iebcwx_kpqzpm8k0)) {
                int i10 = RemoteActionCompatParcelizer + 17;
                write = i10 % Fields.SpotShadowColor;
                int i11 = i10 % 2;
                i3 = 32;
            } else {
                i3 = 16;
            }
            i2 |= i3;
        }
        int i12 = 0;
        if ((i2 & 19) != 18) {
            int i13 = write + 123;
            RemoteActionCompatParcelizer = i13 % Fields.SpotShadowColor;
            int i14 = i13 % 2;
            z = true;
        } else {
            z = false;
        }
        if (getpostalcode.write(i2 & 1, z)) {
            Modifier.Companion companion = Modifier.Companion;
            companion.getClass();
            setTransformQ8lPUPs settransformq8lpups = new setTransformQ8lPUPs((Context) getpostalcode.write((getNewPassword) AndroidCompositionLocals_androidKt.getLocalContext()));
            settransformq8lpups.IconCompatParcelizer = str;
            Extras$Key extras$Key = LinearGradientShaderVjE6UOU.MediaDescriptionCompat;
            int i15 = R.drawable.ic_bold_large_id_card_id_card;
            settransformq8lpups.PlaybackStateCompatCustomAction = new SweepGradientShader9KIMszo(i15, i4);
            settransformq8lpups.RatingCompat = new SweepGradientShader9KIMszo(i15, i12);
            LinearGradientShaderVjE6UOUdefault.write(settransformq8lpups);
            LinearGradientShaderVjE6UOUdefault.serializer(settransformq8lpups, new SimpleGraphicsLayerModifiermeasure1());
            equalEnum.IconCompatParcelizer(settransformq8lpups.IconCompatParcelizer(), r8lambdardpfsr94j4iebcwx_kpqzpm8k0, companion, false, null, 0.0f, 0.0f, getpostalcode, (i2 & 112) | 384);
        } else {
            getpostalcode.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
        }
        getHandleruiannotations gethandleruiannotationsMediaDescriptionCompat = getpostalcode.MediaDescriptionCompat();
        if (gethandleruiannotationsMediaDescriptionCompat != null) {
            gethandleruiannotationsMediaDescriptionCompat.serializer = new r8lambday_zuDuH0rSLU3Q7PVVGz8MXtiaM(str, r8lambdardpfsr94j4iebcwx_kpqzpm8k0, i, 0);
        }
    }

    /* JADX WARN: Code duplicated, block: B:43:0x00d6  */
    public static final void PhotoIdContainer(_get_deviceId_lambda0 _get_deviceid_lambda0, getQueryContext getquerycontext, r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm, getBirthDateFull getbirthdatefull, int i) {
        int i2;
        boolean z;
        int i3;
        boolean zIconCompatParcelizer;
        int i4;
        int i5 = 2 % 2;
        _get_deviceid_lambda0.getClass();
        getquerycontext.getClass();
        r8lambdaunavo3sxub_pc9xroryotnrlvsm.getClass();
        getPostalCode getpostalcode = (getPostalCode) getbirthdatefull;
        getpostalcode.MediaSessionCompatQueueItem(335408769);
        if ((i & 6) == 0) {
            if (getpostalcode.IconCompatParcelizer(_get_deviceid_lambda0)) {
                int i6 = write + 27;
                RemoteActionCompatParcelizer = i6 % Fields.SpotShadowColor;
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
            if ((i & 64) != 0) {
                zIconCompatParcelizer = getpostalcode.IconCompatParcelizer(getquerycontext);
            } else {
                int i8 = RemoteActionCompatParcelizer + 29;
                write = i8 % Fields.SpotShadowColor;
                if (i8 % 2 != 0) {
                    zIconCompatParcelizer = getpostalcode.read(getquerycontext);
                    int i9 = 12 / 0;
                } else {
                    zIconCompatParcelizer = getpostalcode.read(getquerycontext);
                }
            }
            i2 |= zIconCompatParcelizer ? 32 : 16;
        }
        if ((i & 384) == 0) {
            if (getpostalcode.IconCompatParcelizer(r8lambdaunavo3sxub_pc9xroryotnrlvsm)) {
                int i10 = RemoteActionCompatParcelizer + 119;
                write = i10 % Fields.SpotShadowColor;
                int i11 = i10 % 2;
                i3 = Fields.RotationX;
            } else {
                int i12 = write + 1;
                RemoteActionCompatParcelizer = i12 % Fields.SpotShadowColor;
                int i13 = i12 % 2;
                i3 = Fields.SpotShadowColor;
            }
            i2 |= i3;
        }
        int i14 = i2;
        if ((i14 & 147) != 146) {
            int i15 = RemoteActionCompatParcelizer + 89;
            write = i15 % Fields.SpotShadowColor;
            int i16 = i15 % 2;
            z = true;
        } else {
            z = false;
        }
        if (getpostalcode.write(i14 & 1, z)) {
            _set_registeredPushToken_lambda10 _set_registeredpushtoken_lambda10 = (_set_registeredPushToken_lambda10) ExtrasKt.write(_get_deviceid_lambda0.RemoteActionCompatParcelizer, getpostalcode, 0).getValue();
            if (_set_registeredpushtoken_lambda10 instanceof _get_registeredPushToken_lambda0) {
                getpostalcode.serializer(2068969386);
                _get_registeredPushToken_lambda0 _get_registeredpushtoken_lambda0 = (_get_registeredPushToken_lambda0) _set_registeredpushtoken_lambda10;
                String str = _get_registeredpushtoken_lambda0.write;
                boolean zIconCompatParcelizer2 = getpostalcode.IconCompatParcelizer(_get_deviceid_lambda0);
                Object objComponentActivity = getpostalcode.ComponentActivity();
                AndroidContentCaptureManager androidContentCaptureManager = getCreditCardExpirationMonth.write;
                if (!zIconCompatParcelizer2) {
                    int i17 = RemoteActionCompatParcelizer + 97;
                    write = i17 % Fields.SpotShadowColor;
                    int i18 = i17 % 2;
                    if (objComponentActivity == androidContentCaptureManager) {
                        SettingsScreenKt$SettingsScreen$2$1 settingsScreenKt$SettingsScreen$2$1 = new SettingsScreenKt$SettingsScreen$2$1(0, _get_deviceid_lambda0, _get_deviceId_lambda0.class, "onPhotoIdClicked", "onPhotoIdClicked()V", 0, 24);
                        getpostalcode.write(settingsScreenKt$SettingsScreen$2$1);
                        objComponentActivity = settingsScreenKt$SettingsScreen$2$1;
                    }
                } else {
                    SettingsScreenKt$SettingsScreen$2$1 settingsScreenKt$SettingsScreen$2$2 = new SettingsScreenKt$SettingsScreen$2$1(0, _get_deviceid_lambda0, _get_deviceId_lambda0.class, "onPhotoIdClicked", "onPhotoIdClicked()V", 0, 24);
                    getpostalcode.write(settingsScreenKt$SettingsScreen$2$2);
                    objComponentActivity = settingsScreenKt$SettingsScreen$2$2;
                }
                read(str, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) ((registerInAppMessageManagerlambda0) objComponentActivity), getpostalcode, 0);
                boolean z2 = (i14 & 896) == 256;
                boolean zIconCompatParcelizer3 = getpostalcode.IconCompatParcelizer(_set_registeredpushtoken_lambda10);
                Object objComponentActivity2 = getpostalcode.ComponentActivity();
                if ((zIconCompatParcelizer3 | z2) || objComponentActivity2 == androidContentCaptureManager) {
                    objComponentActivity2 = new TncContentKt$$ExternalSyntheticLambda1(r8lambdaunavo3sxub_pc9xroryotnrlvsm, 18, _get_registeredpushtoken_lambda0);
                    getpostalcode.write(objComponentActivity2);
                }
                SQLite.write(getquerycontext, (r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) objComponentActivity2, getpostalcode, ((i14 >> 3) & 14) | 8);
                getpostalcode.IconCompatParcelizer(false);
            } else {
                getpostalcode.serializer(2069268257);
                getpostalcode.IconCompatParcelizer(false);
            }
        } else {
            getpostalcode.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
        }
        getHandleruiannotations gethandleruiannotationsMediaDescriptionCompat = getpostalcode.MediaDescriptionCompat();
        if (gethandleruiannotationsMediaDescriptionCompat != null) {
            gethandleruiannotationsMediaDescriptionCompat.serializer = new r8lambdaZmWJ7_kmLiTuhtIga_c7SGMfvU(i, 26, _get_deviceid_lambda0, getquerycontext, r8lambdaunavo3sxub_pc9xroryotnrlvsm);
        }
    }
}
