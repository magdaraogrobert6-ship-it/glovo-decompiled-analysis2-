package com.roadrunner.freelancing.presentation.stopworking;

import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Fields;
import androidx.sqlite.SQLite;
import bo.app.d$$ExternalSyntheticOutline0;
import coil3.ExtrasKt;
import com.roadrunner.home.nest.NestScreenKt$NestScreen$1$1;
import com.roadrunner.rrds.compose.component.dialog.messagedialog.MessagePopUpKt;
import o.AndroidContentCaptureManager;
import o.WindowInsetsCompatImpl28;
import o.canUseFullScreenIntent;
import o.generatePOSTBodyString;
import o.getBirthDateFull;
import o.getCieXyz;
import o.getCreditCardExpirationMonth;
import o.getHandleruiannotations;
import o.getPostalCode;
import o.getQueryContext;
import o.internalPathIteratorPeek;
import o.pushSideChannelQueue;
import o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0;
import o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM;
import o.r8lambdacpVRyEhxzdUx5p9KqbggyjwKD6M;
import o.r8lambdafjQ9B8d5OSR_i2BAJDXqNW6RNrY;
import o.registerInAppMessageManagerlambda0;
import o.removeNodeAtDepth;
import o.useSideChannelForNotification;
import o.validateMigration;

/* JADX INFO: loaded from: classes3.dex */
public abstract class ConfirmStopWorkingDialogKt {
    private static int IconCompatParcelizer = 0;
    private static int serializer = 1;

    /* JADX WARN: Code duplicated, block: B:11:0x003b  */
    /* JADX WARN: Code duplicated, block: B:12:0x0040  */
    /* JADX WARN: Code duplicated, block: B:14:0x0046  */
    /* JADX WARN: Code duplicated, block: B:15:0x0051  */
    /* JADX WARN: Code duplicated, block: B:17:0x0055 A[PHI: r1
  0x0055: PHI (r1v41 o.getPostalCode) = (r1v5 o.getPostalCode), (r1v43 o.getPostalCode) binds: [B:8:0x002c, B:5:0x0020] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:27:0x0077  */
    /* JADX WARN: Code duplicated, block: B:28:0x0083  */
    /* JADX WARN: Code duplicated, block: B:9:0x002e A[PHI: r1
  0x002e: PHI (r1v6 o.getPostalCode) = (r1v5 o.getPostalCode), (r1v43 o.getPostalCode) binds: [B:8:0x002c, B:5:0x0020] A[DONT_GENERATE, DONT_INLINE]] */
    public static final void read(generatePOSTBodyString generatepostbodystring, r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k0, r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k1, Modifier modifier, getBirthDateFull getbirthdatefull, int i) {
        getPostalCode getpostalcode;
        boolean zIconCompatParcelizer;
        int i2;
        int i3;
        getPostalCode getpostalcode2;
        int i4;
        int i5;
        boolean z;
        r8lambdafjQ9B8d5OSR_i2BAJDXqNW6RNrY r8lambdafjq9b8d5osr_i2bajdxqnw6rnry;
        r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k2;
        r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k3;
        int i6;
        int i7 = 2 % 2;
        int i8 = IconCompatParcelizer + 23;
        serializer = i8 % Fields.SpotShadowColor;
        if (i8 % 2 == 0) {
            getpostalcode = (getPostalCode) getbirthdatefull;
            getpostalcode.MediaSessionCompatQueueItem(1795849451);
            if ((i & 15) == 0) {
                int i9 = IconCompatParcelizer + 5;
                serializer = i9 % Fields.SpotShadowColor;
                int i10 = i9 % 2;
                if ((i & 8) == 0) {
                    zIconCompatParcelizer = getpostalcode.read(generatepostbodystring);
                } else {
                    zIconCompatParcelizer = getpostalcode.IconCompatParcelizer(generatepostbodystring);
                }
                if (zIconCompatParcelizer) {
                    int i11 = serializer + 25;
                    IconCompatParcelizer = i11 % Fields.SpotShadowColor;
                    int i12 = i11 % 2;
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
            getpostalcode = (getPostalCode) getbirthdatefull;
            getpostalcode.MediaSessionCompatQueueItem(1795849451);
            if ((i & 6) == 0) {
                int i13 = IconCompatParcelizer + 5;
                serializer = i13 % Fields.SpotShadowColor;
                int i14 = i13 % 2;
                if ((i & 8) == 0) {
                    zIconCompatParcelizer = getpostalcode.read(generatepostbodystring);
                } else {
                    zIconCompatParcelizer = getpostalcode.IconCompatParcelizer(generatepostbodystring);
                }
                if (zIconCompatParcelizer) {
                    int i15 = serializer + 25;
                    IconCompatParcelizer = i15 % Fields.SpotShadowColor;
                    int i16 = i15 % 2;
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
        if ((i & 48) == 0) {
            int i17 = serializer + 53;
            IconCompatParcelizer = i17 % Fields.SpotShadowColor;
            if (i17 % 2 == 0) {
                if (getpostalcode2.IconCompatParcelizer(r8lambdardpfsr94j4iebcwx_kpqzpm8k0)) {
                    int i18 = serializer + 65;
                    IconCompatParcelizer = i18 % Fields.SpotShadowColor;
                    int i19 = i18 % 2;
                    i6 = 32;
                } else {
                    i6 = 16;
                }
            } else {
                int i20 = 99 / 0;
                if (getpostalcode2.IconCompatParcelizer(r8lambdardpfsr94j4iebcwx_kpqzpm8k0)) {
                    int i110 = serializer + 65;
                    IconCompatParcelizer = i110 % Fields.SpotShadowColor;
                    int i111 = i110 % 2;
                    i6 = 32;
                } else {
                    i6 = 16;
                }
            }
            i3 |= i6;
        }
        if ((i & 384) == 0) {
            i3 |= getpostalcode2.IconCompatParcelizer(r8lambdardpfsr94j4iebcwx_kpqzpm8k1) ? Fields.RotationX : Fields.SpotShadowColor;
        }
        if ((i & 3072) == 0) {
            i3 |= getpostalcode2.read(modifier) ? Fields.CameraDistance : Fields.RotationZ;
        }
        if (getpostalcode2.write(i3 & 1, (i3 & 1171) != 1170)) {
            int i21 = serializer + 83;
            IconCompatParcelizer = i21 % Fields.SpotShadowColor;
            if (i21 % 2 != 0) {
                int i22 = i3 << 24;
                z = false;
                r8lambdafjq9b8d5osr_i2bajdxqnw6rnry = null;
                r8lambdardpfsr94j4iebcwx_kpqzpm8k2 = null;
                r8lambdardpfsr94j4iebcwx_kpqzpm8k3 = null;
                i4 = ((i3 >>> 3) & 15396) | (i3 & 23) | (29360128 & i22) | (234881024 & i22);
                i5 = 12;
            } else {
                int i23 = i3 << 18;
                i4 = ((i3 >> 3) & 896) | (i3 & 126) | (29360128 & i23) | (234881024 & i23);
                i5 = 120;
                z = false;
                r8lambdafjq9b8d5osr_i2bajdxqnw6rnry = null;
                r8lambdardpfsr94j4iebcwx_kpqzpm8k2 = null;
                r8lambdardpfsr94j4iebcwx_kpqzpm8k3 = null;
            }
            MessagePopUpKt.serializer(generatepostbodystring, r8lambdardpfsr94j4iebcwx_kpqzpm8k0, modifier, z, r8lambdafjq9b8d5osr_i2bajdxqnw6rnry, r8lambdardpfsr94j4iebcwx_kpqzpm8k2, r8lambdardpfsr94j4iebcwx_kpqzpm8k3, r8lambdardpfsr94j4iebcwx_kpqzpm8k0, r8lambdardpfsr94j4iebcwx_kpqzpm8k1, getpostalcode2, i4, i5);
        } else {
            getpostalcode2.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
        }
        getHandleruiannotations gethandleruiannotationsMediaDescriptionCompat = getpostalcode2.MediaDescriptionCompat();
        if (gethandleruiannotationsMediaDescriptionCompat != null) {
            gethandleruiannotationsMediaDescriptionCompat.serializer = new validateMigration(generatepostbodystring, r8lambdardpfsr94j4iebcwx_kpqzpm8k0, r8lambdardpfsr94j4iebcwx_kpqzpm8k1, modifier, i, 1);
        }
    }

    /* JADX WARN: Code duplicated, block: B:45:0x00e5  */
    public static final void ConfirmStopWorkingDialog(WindowInsetsCompatImpl28 windowInsetsCompatImpl28, r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k0, Modifier modifier, getBirthDateFull getbirthdatefull, int i) {
        int i2;
        Modifier modifier2;
        int i3;
        int i4;
        int i5 = 2 % 2;
        windowInsetsCompatImpl28.getClass();
        r8lambdardpfsr94j4iebcwx_kpqzpm8k0.getClass();
        getPostalCode getpostalcode = (getPostalCode) getbirthdatefull;
        getpostalcode.MediaSessionCompatQueueItem(-2009908729);
        if ((i & 6) == 0) {
            int i6 = IconCompatParcelizer + 33;
            serializer = i6 % Fields.SpotShadowColor;
            int i7 = i6 % 2;
            if (getpostalcode.IconCompatParcelizer(windowInsetsCompatImpl28)) {
                int i8 = serializer + 19;
                IconCompatParcelizer = i8 % Fields.SpotShadowColor;
                i4 = i8 % 2 != 0 ? 3 : 4;
            } else {
                i4 = 2;
            }
            i2 = i | i4;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            if (getpostalcode.IconCompatParcelizer(r8lambdardpfsr94j4iebcwx_kpqzpm8k0)) {
                i3 = 32;
            } else {
                int i9 = IconCompatParcelizer + 29;
                serializer = i9 % Fields.SpotShadowColor;
                if (i9 % 2 == 0) {
                    int i10 = 3 / 4;
                }
                i3 = 16;
            }
            i2 |= i3;
        }
        int i11 = i2 | 384;
        boolean z = false;
        if (getpostalcode.write(i11 & 1, !((i11 & 147) == 146))) {
            Modifier.Companion companion = Modifier.Companion;
            pushSideChannelQueue pushsidechannelqueue = (pushSideChannelQueue) ExtrasKt.write(windowInsetsCompatImpl28.serializer, getpostalcode, 0).getValue();
            boolean z2 = pushsidechannelqueue instanceof useSideChannelForNotification;
            AndroidContentCaptureManager androidContentCaptureManager = getCreditCardExpirationMonth.write;
            if (z2) {
                getpostalcode.serializer(1213003855);
                generatePOSTBodyString generatepostbodystring = ((useSideChannelForNotification) pushsidechannelqueue).write;
                boolean zIconCompatParcelizer = getpostalcode.IconCompatParcelizer(windowInsetsCompatImpl28);
                Object objComponentActivity = getpostalcode.ComponentActivity();
                if (zIconCompatParcelizer || objComponentActivity == androidContentCaptureManager) {
                    NestScreenKt$NestScreen$1$1 nestScreenKt$NestScreen$1$1 = new NestScreenKt$NestScreen$1$1(0, windowInsetsCompatImpl28, WindowInsetsCompatImpl28.class, "onDismissClicked", "onDismissClicked()V", 0, 24);
                    getpostalcode.write(nestScreenKt$NestScreen$1$1);
                    objComponentActivity = nestScreenKt$NestScreen$1$1;
                }
                r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k1 = (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) ((registerInAppMessageManagerlambda0) objComponentActivity);
                boolean zIconCompatParcelizer2 = getpostalcode.IconCompatParcelizer(windowInsetsCompatImpl28);
                Object objComponentActivity2 = getpostalcode.ComponentActivity();
                if (zIconCompatParcelizer2) {
                    NestScreenKt$NestScreen$1$1 nestScreenKt$NestScreen$1$2 = new NestScreenKt$NestScreen$1$1(0, windowInsetsCompatImpl28, WindowInsetsCompatImpl28.class, "onConfirmStopWorkingClicked", "onConfirmStopWorkingClicked()V", 0, 25);
                    getpostalcode.write(nestScreenKt$NestScreen$1$2);
                    objComponentActivity2 = nestScreenKt$NestScreen$1$2;
                } else {
                    int i12 = serializer + 101;
                    IconCompatParcelizer = i12 % Fields.SpotShadowColor;
                    if (i12 % 2 != 0) {
                        int i13 = 96 / 0;
                        if (objComponentActivity2 == androidContentCaptureManager) {
                            NestScreenKt$NestScreen$1$1 nestScreenKt$NestScreen$1$3 = new NestScreenKt$NestScreen$1$1(0, windowInsetsCompatImpl28, WindowInsetsCompatImpl28.class, "onConfirmStopWorkingClicked", "onConfirmStopWorkingClicked()V", 0, 25);
                            getpostalcode.write(nestScreenKt$NestScreen$1$3);
                            objComponentActivity2 = nestScreenKt$NestScreen$1$3;
                        }
                    } else if (objComponentActivity2 == androidContentCaptureManager) {
                        NestScreenKt$NestScreen$1$1 nestScreenKt$NestScreen$1$4 = new NestScreenKt$NestScreen$1$1(0, windowInsetsCompatImpl28, WindowInsetsCompatImpl28.class, "onConfirmStopWorkingClicked", "onConfirmStopWorkingClicked()V", 0, 25);
                        getpostalcode.write(nestScreenKt$NestScreen$1$4);
                        objComponentActivity2 = nestScreenKt$NestScreen$1$4;
                    }
                }
                read(generatepostbodystring, r8lambdardpfsr94j4iebcwx_kpqzpm8k1, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) ((registerInAppMessageManagerlambda0) objComponentActivity2), companion, getpostalcode, (i11 << 3) & 7168);
                getpostalcode.IconCompatParcelizer(false);
            } else {
                androidContentCaptureManager = androidContentCaptureManager;
                if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{pushsidechannelqueue, canUseFullScreenIntent.RemoteActionCompatParcelizer}, getCieXyz.write())).booleanValue()) {
                    throw d$$ExternalSyntheticOutline0.m(getpostalcode, 1212999952, false);
                }
                getpostalcode.serializer(1213012811);
                getpostalcode.IconCompatParcelizer(false);
            }
            getQueryContext getquerycontext = windowInsetsCompatImpl28.read;
            if ((i11 & 112) == 32) {
                int i14 = serializer + 69;
                IconCompatParcelizer = i14 % Fields.SpotShadowColor;
                int i15 = i14 % 2;
                z = true;
            }
            Object objComponentActivity3 = getpostalcode.ComponentActivity();
            if (z || objComponentActivity3 == androidContentCaptureManager) {
                objComponentActivity3 = new r8lambdacpVRyEhxzdUx5p9KqbggyjwKD6M(5, r8lambdardpfsr94j4iebcwx_kpqzpm8k0);
                getpostalcode.write(objComponentActivity3);
            }
            SQLite.write(getquerycontext, (r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) objComponentActivity3, getpostalcode, 8);
            modifier2 = companion;
        } else {
            getpostalcode.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
            modifier2 = modifier;
        }
        getHandleruiannotations gethandleruiannotationsMediaDescriptionCompat = getpostalcode.MediaDescriptionCompat();
        if (gethandleruiannotationsMediaDescriptionCompat != null) {
            gethandleruiannotationsMediaDescriptionCompat.serializer = new internalPathIteratorPeek(i, 8, windowInsetsCompatImpl28, r8lambdardpfsr94j4iebcwx_kpqzpm8k0, modifier2);
        }
    }
}
