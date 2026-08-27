package com.roadrunner.freelancing.presentation.info;

import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Fields;
import bo.app.d$$ExternalSyntheticOutline0;
import coil3.ExtrasKt;
import com.roadrunner.home.nest.NestScreenKt$NestScreen$1$1;
import com.roadrunner.rrds.compose.component.dialog.messagedialog.MessagePopUpKt;
import o.NotificationCompatBuilder;
import o.NotificationManagerCompat;
import o.getBirthDateFull;
import o.getCieXyz;
import o.getCreditCardExpirationMonth;
import o.getEnabledListenerPackages;
import o.getHandleruiannotations;
import o.getPostalCode;
import o.internalPathIteratorPeek;
import o.p2;
import o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0;
import o.registerInAppMessageManagerlambda0;
import o.removeNodeAtDepth;
import o.setDisplayShape;

/* JADX INFO: loaded from: classes3.dex */
public abstract class WorkNowInformationDialogKt {
    private static int RemoteActionCompatParcelizer = 0;
    private static int serializer = 1;

    /* JADX WARN: Code duplicated, block: B:11:0x0033  */
    /* JADX WARN: Code duplicated, block: B:13:0x003e  */
    /* JADX WARN: Code duplicated, block: B:14:0x0046  */
    /* JADX WARN: Code duplicated, block: B:15:0x004b  */
    /* JADX WARN: Code duplicated, block: B:17:0x0051  */
    /* JADX WARN: Code duplicated, block: B:18:0x0053  */
    /* JADX WARN: Code duplicated, block: B:20:0x0056 A[PHI: r4
  0x0056: PHI (r4v33 o.getPostalCode) = (r4v5 o.getPostalCode), (r4v35 o.getPostalCode) binds: [B:8:0x002d, B:5:0x0021] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:9:0x002f A[PHI: r4
  0x002f: PHI (r4v6 o.getPostalCode) = (r4v5 o.getPostalCode), (r4v35 o.getPostalCode) binds: [B:8:0x002d, B:5:0x0021] A[DONT_GENERATE, DONT_INLINE]] */
    public static final void write(NotificationCompatBuilder notificationCompatBuilder, r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k0, Modifier modifier, getBirthDateFull getbirthdatefull, int i) {
        getPostalCode getpostalcode;
        boolean zIconCompatParcelizer;
        int i2;
        int i3;
        int i4;
        getPostalCode getpostalcode2;
        int i5 = 2 % 2;
        int i6 = serializer + 89;
        RemoteActionCompatParcelizer = i6 % Fields.SpotShadowColor;
        boolean z = false;
        if (i6 % 2 != 0) {
            getpostalcode = (getPostalCode) getbirthdatefull;
            getpostalcode.MediaSessionCompatQueueItem(-203495558);
            if ((i & 114) == 0) {
                if ((i & 8) == 0) {
                    zIconCompatParcelizer = getpostalcode.IconCompatParcelizer(notificationCompatBuilder);
                } else {
                    i4 = RemoteActionCompatParcelizer + 99;
                    serializer = i4 % Fields.SpotShadowColor;
                    if (i4 % 2 == 0) {
                        zIconCompatParcelizer = getpostalcode.read(notificationCompatBuilder);
                        int i7 = 92 / 0;
                    } else {
                        zIconCompatParcelizer = getpostalcode.read(notificationCompatBuilder);
                    }
                }
                if (zIconCompatParcelizer) {
                    i2 = 4;
                } else {
                    i2 = 2;
                }
                i3 = i2 | i;
            } else {
                i3 = i;
            }
        } else {
            getpostalcode = (getPostalCode) getbirthdatefull;
            getpostalcode.MediaSessionCompatQueueItem(-203495558);
            if ((i & 6) == 0) {
                if ((i & 8) == 0) {
                    zIconCompatParcelizer = getpostalcode.IconCompatParcelizer(notificationCompatBuilder);
                } else {
                    i4 = RemoteActionCompatParcelizer + 99;
                    serializer = i4 % Fields.SpotShadowColor;
                    if (i4 % 2 == 0) {
                        zIconCompatParcelizer = getpostalcode.read(notificationCompatBuilder);
                        int i8 = 92 / 0;
                    } else {
                        zIconCompatParcelizer = getpostalcode.read(notificationCompatBuilder);
                    }
                }
                if (zIconCompatParcelizer) {
                    i2 = 4;
                } else {
                    i2 = 2;
                }
                i3 = i2 | i;
            } else {
                i3 = i;
            }
        }
        getPostalCode getpostalcode3 = getpostalcode;
        if ((i & 48) == 0) {
            i3 |= getpostalcode3.IconCompatParcelizer(r8lambdardpfsr94j4iebcwx_kpqzpm8k0) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            int i9 = RemoteActionCompatParcelizer + 39;
            serializer = i9 % Fields.SpotShadowColor;
            if (i9 % 2 != 0) {
                i3 |= getpostalcode3.read(modifier) ? Fields.RotationX : Fields.SpotShadowColor;
            } else {
                getpostalcode3.read(modifier);
                Object obj = null;
                obj.hashCode();
                throw null;
            }
        }
        if ((i3 & 147) != 146) {
            int i10 = RemoteActionCompatParcelizer + 53;
            serializer = i10 % Fields.SpotShadowColor;
            int i11 = i10 % 2;
            z = true;
        }
        if (getpostalcode3.write(i3 & 1, z)) {
            int i12 = RemoteActionCompatParcelizer + 41;
            serializer = i12 % Fields.SpotShadowColor;
            int i13 = i12 % 2;
            getpostalcode2 = getpostalcode3;
            MessagePopUpKt.serializer(notificationCompatBuilder.IconCompatParcelizer, r8lambdardpfsr94j4iebcwx_kpqzpm8k0, modifier, false, null, null, r8lambdardpfsr94j4iebcwx_kpqzpm8k0, null, null, getpostalcode3, (i3 & 1008) | ((i3 << 15) & 3670016), 440);
        } else {
            getpostalcode2 = getpostalcode3;
            getpostalcode2.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
        }
        getHandleruiannotations gethandleruiannotationsMediaDescriptionCompat = getpostalcode2.MediaDescriptionCompat();
        if (gethandleruiannotationsMediaDescriptionCompat != null) {
            gethandleruiannotationsMediaDescriptionCompat.serializer = new internalPathIteratorPeek(i, 6, notificationCompatBuilder, r8lambdardpfsr94j4iebcwx_kpqzpm8k0, modifier);
        }
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0038  */
    /* JADX WARN: Code duplicated, block: B:12:0x003a  */
    /* JADX WARN: Code duplicated, block: B:14:0x003e A[PHI: r1
  0x003e: PHI (r1v28 o.getPostalCode) = (r1v5 o.getPostalCode), (r1v30 o.getPostalCode) binds: [B:8:0x0030, B:5:0x0021] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:27:0x009a  */
    /* JADX WARN: Code duplicated, block: B:9:0x0032 A[PHI: r1
  0x0032: PHI (r1v6 o.getPostalCode) = (r1v5 o.getPostalCode), (r1v30 o.getPostalCode) binds: [B:8:0x0030, B:5:0x0021] A[DONT_GENERATE, DONT_INLINE]] */
    public static final void WorkNowInformationDialog(setDisplayShape setdisplayshape, Modifier modifier, getBirthDateFull getbirthdatefull, int i) {
        getPostalCode getpostalcode;
        int i2;
        int i3;
        getPostalCode getpostalcode2;
        boolean z;
        Modifier modifier2;
        int i4 = 2 % 2;
        int i5 = serializer + 33;
        RemoteActionCompatParcelizer = i5 % Fields.SpotShadowColor;
        if (i5 % 2 != 0) {
            setdisplayshape.getClass();
            getpostalcode = (getPostalCode) getbirthdatefull;
            getpostalcode.MediaSessionCompatQueueItem(477153780);
            if ((i & 87) == 0) {
                if (getpostalcode.IconCompatParcelizer(setdisplayshape)) {
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
            setdisplayshape.getClass();
            getpostalcode = (getPostalCode) getbirthdatefull;
            getpostalcode.MediaSessionCompatQueueItem(477153780);
            if ((i & 6) == 0) {
                if (getpostalcode.IconCompatParcelizer(setdisplayshape)) {
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
        int i6 = i3 | 48;
        if ((i6 & 19) != 18) {
            int i7 = RemoteActionCompatParcelizer + 23;
            serializer = i7 % Fields.SpotShadowColor;
            int i8 = i7 % 2;
            z = true;
        } else {
            z = false;
        }
        if (getpostalcode2.write(i6 & 1, z)) {
            int i9 = RemoteActionCompatParcelizer + 7;
            serializer = i9 % Fields.SpotShadowColor;
            int i10 = i9 % 2;
            modifier2 = Modifier.Companion;
            getEnabledListenerPackages getenabledlistenerpackages = (getEnabledListenerPackages) ExtrasKt.write(setdisplayshape.write, getpostalcode2, 0).getValue();
            if (!(!(getenabledlistenerpackages instanceof NotificationCompatBuilder))) {
                getpostalcode2.serializer(-1453274638);
                NotificationCompatBuilder notificationCompatBuilder = (NotificationCompatBuilder) getenabledlistenerpackages;
                boolean zIconCompatParcelizer = getpostalcode2.IconCompatParcelizer(setdisplayshape);
                Object objComponentActivity = getpostalcode2.ComponentActivity();
                if (zIconCompatParcelizer) {
                    NestScreenKt$NestScreen$1$1 nestScreenKt$NestScreen$1$1 = new NestScreenKt$NestScreen$1$1(0, setdisplayshape, setDisplayShape.class, "onHideDialog", "onHideDialog()V", 0, 18);
                    getpostalcode2.write(nestScreenKt$NestScreen$1$1);
                    objComponentActivity = nestScreenKt$NestScreen$1$1;
                } else {
                    int i11 = RemoteActionCompatParcelizer + 49;
                    serializer = i11 % Fields.SpotShadowColor;
                    int i12 = i11 % 2;
                    if (objComponentActivity == getCreditCardExpirationMonth.write) {
                        NestScreenKt$NestScreen$1$1 nestScreenKt$NestScreen$1$2 = new NestScreenKt$NestScreen$1$1(0, setdisplayshape, setDisplayShape.class, "onHideDialog", "onHideDialog()V", 0, 18);
                        getpostalcode2.write(nestScreenKt$NestScreen$1$2);
                        objComponentActivity = nestScreenKt$NestScreen$1$2;
                    }
                }
                write(notificationCompatBuilder, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) ((registerInAppMessageManagerlambda0) objComponentActivity), modifier2, getpostalcode2, (i6 << 3) & 896);
                getpostalcode2.IconCompatParcelizer(false);
            } else {
                if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{getenabledlistenerpackages, NotificationManagerCompat.write}, getCieXyz.write())).booleanValue()) {
                    throw d$$ExternalSyntheticOutline0.m(getpostalcode2, -1016714185, false);
                }
                getpostalcode2.serializer(-1016705480);
                getpostalcode2.IconCompatParcelizer(false);
            }
        } else {
            getpostalcode2.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
            modifier2 = modifier;
        }
        getHandleruiannotations gethandleruiannotationsMediaDescriptionCompat = getpostalcode2.MediaDescriptionCompat();
        if (gethandleruiannotationsMediaDescriptionCompat != null) {
            gethandleruiannotationsMediaDescriptionCompat.serializer = new p2(i, 5, setdisplayshape, modifier2);
        }
    }
}
