package com.roadrunner.rider.state.ondemand.goofflineinfo;

import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Fields;
import androidx.sqlite.SQLite;
import bo.app.d$$ExternalSyntheticOutline0;
import coil3.ExtrasKt;
import com.roadrunner.rider.state.cashblock.presentation.CashBlockKt$CashBlock$1$1;
import com.roadrunner.rrds.compose.component.dialog.messagedialog.MessagePopUpKt;
import o.AndroidContentCaptureManager;
import o.AttributionHandler3;
import o.SharedPreferencesManager;
import o.getBirthDateFull;
import o.getCieXyz;
import o.getCreditCardExpirationMonth;
import o.getEnabled;
import o.getHandleruiannotations;
import o.getOnAttributionReadListener;
import o.getPartnerSharingSettings;
import o.getPostalCode;
import o.getQueryContext;
import o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0;
import o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM;
import o.r8lambdafjQ9B8d5OSR_i2BAJDXqNW6RNrY;
import o.r8lambdag2v_8ZFcgEbevxAiKW6LalaYkVg;
import o.registerInAppMessageManagerlambda0;
import o.removeNodeAtDepth;

/* JADX INFO: loaded from: classes3.dex */
public abstract class GoOfflineInformationDialogKt {
    private static int read = 0;
    private static int write = 1;

    public static final void RemoteActionCompatParcelizer(getPartnerSharingSettings getpartnersharingsettings, r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k0, r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k1, r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k2, Modifier modifier, getBirthDateFull getbirthdatefull, int i) {
        int i2;
        getPostalCode getpostalcode;
        int i3;
        boolean zIconCompatParcelizer;
        int i4 = 2 % 2;
        getPostalCode getpostalcode2 = (getPostalCode) getbirthdatefull;
        getpostalcode2.MediaSessionCompatQueueItem(490037640);
        Object obj = null;
        if ((i & 6) == 0) {
            if ((i & 8) == 0) {
                int i5 = write + 101;
                read = i5 % Fields.SpotShadowColor;
                if (i5 % 2 != 0) {
                    getpostalcode2.read(getpartnersharingsettings);
                    throw null;
                }
                zIconCompatParcelizer = getpostalcode2.read(getpartnersharingsettings);
            } else {
                zIconCompatParcelizer = getpostalcode2.IconCompatParcelizer(getpartnersharingsettings);
                int i6 = read + 87;
                write = i6 % Fields.SpotShadowColor;
                int i7 = i6 % 2;
            }
            i2 = (zIconCompatParcelizer ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            if (getpostalcode2.IconCompatParcelizer(r8lambdardpfsr94j4iebcwx_kpqzpm8k0)) {
                int i8 = write + 31;
                read = i8 % Fields.SpotShadowColor;
                if (i8 % 2 != 0) {
                    int i9 = 5 % 4;
                }
                i3 = 32;
            } else {
                i3 = 16;
            }
            i2 |= i3;
        }
        boolean z = true;
        if ((i & 384) == 0) {
            i2 |= getpostalcode2.IconCompatParcelizer(r8lambdardpfsr94j4iebcwx_kpqzpm8k1) ^ true ? Fields.SpotShadowColor : Fields.RotationX;
        }
        if ((i & 3072) == 0) {
            int i10 = write + 67;
            read = i10 % Fields.SpotShadowColor;
            int i11 = i10 % 2;
            i2 |= getpostalcode2.IconCompatParcelizer(r8lambdardpfsr94j4iebcwx_kpqzpm8k2) ? Fields.CameraDistance : Fields.RotationZ;
        }
        if ((i & 24576) == 0) {
            int i12 = write + 51;
            read = i12 % Fields.SpotShadowColor;
            if (i12 % 2 != 0) {
                getpostalcode2.read(modifier);
                obj.hashCode();
                throw null;
            }
            i2 |= getpostalcode2.read(modifier) ? Fields.Clip : 8192;
        }
        if ((i2 & 9363) != 9362) {
            int i13 = read + 19;
            write = i13 % Fields.SpotShadowColor;
            int i14 = i13 % 2;
        } else {
            z = false;
        }
        if (getpostalcode2.write(i2 & 1, z)) {
            getpostalcode = getpostalcode2;
            MessagePopUpKt.serializer(getpartnersharingsettings.IconCompatParcelizer, r8lambdardpfsr94j4iebcwx_kpqzpm8k2, modifier, false, null, null, null, r8lambdardpfsr94j4iebcwx_kpqzpm8k1, r8lambdardpfsr94j4iebcwx_kpqzpm8k0, getpostalcode2, ((i2 >> 6) & 1008) | ((i2 << 15) & 29360128) | ((i2 << 21) & 234881024), 120);
        } else {
            getpostalcode = getpostalcode2;
            getpostalcode.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
        }
        getHandleruiannotations gethandleruiannotationsMediaDescriptionCompat = getpostalcode.MediaDescriptionCompat();
        if (gethandleruiannotationsMediaDescriptionCompat != null) {
            gethandleruiannotationsMediaDescriptionCompat.serializer = new r8lambdag2v_8ZFcgEbevxAiKW6LalaYkVg(getpartnersharingsettings, r8lambdardpfsr94j4iebcwx_kpqzpm8k0, r8lambdardpfsr94j4iebcwx_kpqzpm8k1, r8lambdardpfsr94j4iebcwx_kpqzpm8k2, modifier, i, 17);
        }
    }

    /* JADX WARN: Code duplicated, block: B:26:0x0078  */
    /* JADX WARN: Code duplicated, block: B:28:0x0083  */
    /* JADX WARN: Code duplicated, block: B:29:0x0086  */
    /* JADX WARN: Code duplicated, block: B:30:0x0088  */
    /* JADX WARN: Code duplicated, block: B:72:0x0125  */
    /* JADX WARN: Code duplicated, block: B:73:0x0129  */
    /* JADX WARN: Code duplicated, block: B:85:0x0187  */
    public static final void GoOfflineInformationDialog(AttributionHandler3 attributionHandler3, r8lambdafjQ9B8d5OSR_i2BAJDXqNW6RNrY r8lambdafjq9b8d5osr_i2bajdxqnw6rnry, r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm, r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k0, Modifier modifier, getBirthDateFull getbirthdatefull, int i) {
        int i2;
        boolean z;
        Modifier modifier2;
        boolean z2;
        AndroidContentCaptureManager androidContentCaptureManager;
        boolean zIconCompatParcelizer;
        Object objComponentActivity;
        int i3;
        int i4;
        int i5;
        int i6 = 2 % 2;
        attributionHandler3.getClass();
        r8lambdafjq9b8d5osr_i2bajdxqnw6rnry.getClass();
        r8lambdaunavo3sxub_pc9xroryotnrlvsm.getClass();
        r8lambdardpfsr94j4iebcwx_kpqzpm8k0.getClass();
        getPostalCode getpostalcode = (getPostalCode) getbirthdatefull;
        getpostalcode.MediaSessionCompatQueueItem(1983051536);
        if ((i & 6) == 0) {
            i2 = (getpostalcode.IconCompatParcelizer(attributionHandler3) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            int i7 = write + 9;
            read = i7 % Fields.SpotShadowColor;
            int i8 = i7 % 2;
            if (getpostalcode.IconCompatParcelizer(r8lambdafjq9b8d5osr_i2bajdxqnw6rnry)) {
                i5 = 32;
            } else {
                int i9 = read + 33;
                write = i9 % Fields.SpotShadowColor;
                int i10 = i9 % 2;
                i5 = 16;
            }
            i2 |= i5;
        }
        if ((i & 384) == 0) {
            int i11 = read + 125;
            write = i11 % Fields.SpotShadowColor;
            if (i11 % 2 != 0) {
                if (getpostalcode.IconCompatParcelizer(r8lambdaunavo3sxub_pc9xroryotnrlvsm)) {
                    i3 = read + 77;
                    write = i3 % Fields.SpotShadowColor;
                    if (i3 % 2 == 0) {
                        i4 = 9601;
                    } else {
                        i4 = 256;
                    }
                } else {
                    i4 = Fields.SpotShadowColor;
                }
            } else {
                int i12 = 82 / 0;
                if (getpostalcode.IconCompatParcelizer(r8lambdaunavo3sxub_pc9xroryotnrlvsm)) {
                    i3 = read + 77;
                    write = i3 % Fields.SpotShadowColor;
                    if (i3 % 2 == 0) {
                        i4 = 9601;
                    } else {
                        i4 = 256;
                    }
                } else {
                    i4 = Fields.SpotShadowColor;
                }
            }
            i2 |= i4;
        }
        if ((i & 3072) == 0) {
            i2 |= getpostalcode.IconCompatParcelizer(r8lambdardpfsr94j4iebcwx_kpqzpm8k0) ? 2048 : Fields.RotationZ;
        }
        int i13 = i2 | 24576;
        if ((i13 & 9363) != 9362) {
            int i14 = read + 1;
            write = i14 % Fields.SpotShadowColor;
            int i15 = i14 % 2;
            z = true;
        } else {
            z = false;
        }
        if (getpostalcode.write(i13 & 1, z)) {
            Modifier.Companion companion = Modifier.Companion;
            getQueryContext getquerycontext = attributionHandler3.IconCompatParcelizer;
            boolean z3 = (i13 & 896) == 256;
            boolean z4 = (i13 & 7168) == 2048;
            boolean z5 = (i13 & 112) == 32;
            Object objComponentActivity2 = getpostalcode.ComponentActivity();
            AndroidContentCaptureManager androidContentCaptureManager2 = getCreditCardExpirationMonth.write;
            if ((z3 | z4 | z5) || objComponentActivity2 == androidContentCaptureManager2) {
                objComponentActivity2 = new SharedPreferencesManager(r8lambdaunavo3sxub_pc9xroryotnrlvsm, r8lambdardpfsr94j4iebcwx_kpqzpm8k0, r8lambdafjq9b8d5osr_i2bajdxqnw6rnry, 3);
                getpostalcode.write(objComponentActivity2);
            }
            SQLite.write(getquerycontext, (r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) objComponentActivity2, getpostalcode, 8);
            getEnabled getenabled = (getEnabled) ExtrasKt.write(attributionHandler3.MediaMetadataCompat, getpostalcode, 0).getValue();
            if (getenabled instanceof getPartnerSharingSettings) {
                getpostalcode.serializer(-186178770);
                getPartnerSharingSettings getpartnersharingsettings = (getPartnerSharingSettings) getenabled;
                boolean zIconCompatParcelizer2 = getpostalcode.IconCompatParcelizer(attributionHandler3);
                Object objComponentActivity3 = getpostalcode.ComponentActivity();
                if (zIconCompatParcelizer2) {
                    CashBlockKt$CashBlock$1$1 cashBlockKt$CashBlock$1$1 = new CashBlockKt$CashBlock$1$1(0, attributionHandler3, AttributionHandler3.class, "onConfirmAndGoOffline", "onConfirmAndGoOffline()V", 0, 26);
                    getpostalcode.write(cashBlockKt$CashBlock$1$1);
                    objComponentActivity3 = cashBlockKt$CashBlock$1$1;
                } else {
                    int i16 = read + 115;
                    write = i16 % Fields.SpotShadowColor;
                    if (i16 % 2 == 0) {
                        int i17 = 43 / 0;
                        if (objComponentActivity3 == androidContentCaptureManager2) {
                            CashBlockKt$CashBlock$1$1 cashBlockKt$CashBlock$1$2 = new CashBlockKt$CashBlock$1$1(0, attributionHandler3, AttributionHandler3.class, "onConfirmAndGoOffline", "onConfirmAndGoOffline()V", 0, 26);
                            getpostalcode.write(cashBlockKt$CashBlock$1$2);
                            objComponentActivity3 = cashBlockKt$CashBlock$1$2;
                        }
                    } else if (objComponentActivity3 == androidContentCaptureManager2) {
                        CashBlockKt$CashBlock$1$1 cashBlockKt$CashBlock$1$3 = new CashBlockKt$CashBlock$1$1(0, attributionHandler3, AttributionHandler3.class, "onConfirmAndGoOffline", "onConfirmAndGoOffline()V", 0, 26);
                        getpostalcode.write(cashBlockKt$CashBlock$1$3);
                        objComponentActivity3 = cashBlockKt$CashBlock$1$3;
                    }
                }
                registerInAppMessageManagerlambda0 registerinappmessagemanagerlambda0 = (registerInAppMessageManagerlambda0) objComponentActivity3;
                boolean zIconCompatParcelizer3 = getpostalcode.IconCompatParcelizer(attributionHandler3);
                Object objComponentActivity4 = getpostalcode.ComponentActivity();
                if (!zIconCompatParcelizer3) {
                    androidContentCaptureManager = androidContentCaptureManager2;
                    if (objComponentActivity4 == androidContentCaptureManager) {
                    }
                    registerInAppMessageManagerlambda0 registerinappmessagemanagerlambda1 = (registerInAppMessageManagerlambda0) objComponentActivity4;
                    zIconCompatParcelizer = getpostalcode.IconCompatParcelizer(attributionHandler3);
                    objComponentActivity = getpostalcode.ComponentActivity();
                    if (!zIconCompatParcelizer || objComponentActivity == androidContentCaptureManager) {
                        CashBlockKt$CashBlock$1$1 cashBlockKt$CashBlock$1$4 = new CashBlockKt$CashBlock$1$1(0, attributionHandler3, AttributionHandler3.class, "onHideDialog", "onHideDialog()V", 0, 28);
                        getpostalcode.write(cashBlockKt$CashBlock$1$4);
                        objComponentActivity = cashBlockKt$CashBlock$1$4;
                    }
                    RemoteActionCompatParcelizer(getpartnersharingsettings, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) registerinappmessagemanagerlambda0, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) registerinappmessagemanagerlambda1, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) ((registerInAppMessageManagerlambda0) objComponentActivity), companion, getpostalcode, i13 & 57344);
                    getpostalcode.IconCompatParcelizer(false);
                } else {
                    androidContentCaptureManager = androidContentCaptureManager2;
                }
                CashBlockKt$CashBlock$1$1 cashBlockKt$CashBlock$1$5 = new CashBlockKt$CashBlock$1$1(0, attributionHandler3, AttributionHandler3.class, "onCancelAndGoBack", "onCancelAndGoBack()V", 0, 27);
                getpostalcode.write(cashBlockKt$CashBlock$1$5);
                objComponentActivity4 = cashBlockKt$CashBlock$1$5;
                registerInAppMessageManagerlambda0 registerinappmessagemanagerlambda2 = (registerInAppMessageManagerlambda0) objComponentActivity4;
                zIconCompatParcelizer = getpostalcode.IconCompatParcelizer(attributionHandler3);
                objComponentActivity = getpostalcode.ComponentActivity();
                if (!zIconCompatParcelizer) {
                    CashBlockKt$CashBlock$1$1 cashBlockKt$CashBlock$1$6 = new CashBlockKt$CashBlock$1$1(0, attributionHandler3, AttributionHandler3.class, "onHideDialog", "onHideDialog()V", 0, 28);
                    getpostalcode.write(cashBlockKt$CashBlock$1$6);
                    objComponentActivity = cashBlockKt$CashBlock$1$6;
                } else {
                    CashBlockKt$CashBlock$1$1 cashBlockKt$CashBlock$1$7 = new CashBlockKt$CashBlock$1$1(0, attributionHandler3, AttributionHandler3.class, "onHideDialog", "onHideDialog()V", 0, 28);
                    getpostalcode.write(cashBlockKt$CashBlock$1$7);
                    objComponentActivity = cashBlockKt$CashBlock$1$7;
                }
                RemoteActionCompatParcelizer(getpartnersharingsettings, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) registerinappmessagemanagerlambda0, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) registerinappmessagemanagerlambda2, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) ((registerInAppMessageManagerlambda0) objComponentActivity), companion, getpostalcode, i13 & 57344);
                getpostalcode.IconCompatParcelizer(false);
            } else {
                if (!(!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{getenabled, getOnAttributionReadListener.serializer}, getCieXyz.write())).booleanValue())) {
                    int i18 = read + 103;
                    write = i18 % Fields.SpotShadowColor;
                    if (i18 % 2 == 0) {
                        getpostalcode.serializer(-1252922860);
                        z2 = false;
                    } else {
                        z2 = false;
                        getpostalcode.serializer(-1252922860);
                    }
                    getpostalcode.IconCompatParcelizer(z2);
                } else {
                    throw d$$ExternalSyntheticOutline0.m(getpostalcode, -1252934789, false);
                }
            }
            modifier2 = companion;
        } else {
            getpostalcode.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
            modifier2 = modifier;
        }
        getHandleruiannotations gethandleruiannotationsMediaDescriptionCompat = getpostalcode.MediaDescriptionCompat();
        if (gethandleruiannotationsMediaDescriptionCompat != null) {
            gethandleruiannotationsMediaDescriptionCompat.serializer = new r8lambdag2v_8ZFcgEbevxAiKW6LalaYkVg((Object) attributionHandler3, r8lambdafjq9b8d5osr_i2bajdxqnw6rnry, r8lambdaunavo3sxub_pc9xroryotnrlvsm, r8lambdardpfsr94j4iebcwx_kpqzpm8k0, modifier2, i, 16);
        }
    }
}
