package com.roadrunner.delivery.ontheway.chatfloating.presentation;

import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Fields;
import coil3.ExtrasKt;
import com.roadrunner.delivery.accept.presentation.compose.AutoAcceptOptionKt$AutoAcceptOption$1$1;
import com.roadrunner.rrds.compose.component.indicators.BadgeKt;
import kotlin.ranges.RangesKt;
import o.AndroidContentCaptureManager;
import o.BackspaceCommand;
import o.DefaultLazyKey;
import o.computeHorizontalScrollExtent;
import o.createFromParcel;
import o.getBirthDateFull;
import o.getCreditCardExpirationMonth;
import o.getDoneeUduSuoannotations;
import o.getHandleruiannotations;
import o.getNexteUduSuoannotations;
import o.getPostalCode;
import o.getSendeUduSuoannotations;
import o.isUrlWithTrackerQueryParam;
import o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0;
import o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM;
import o.registerInAppMessageManagerlambda0;
import o.toVariationValue;

/* JADX INFO: loaded from: classes3.dex */
public abstract class CustomerChatFloatingButtonContainerKt {
    private static int read = 1;
    private static int serializer;

    /* JADX WARN: Code duplicated, block: B:11:0x0030  */
    /* JADX WARN: Code duplicated, block: B:13:0x0037  */
    /* JADX WARN: Code duplicated, block: B:14:0x0039  */
    /* JADX WARN: Code duplicated, block: B:16:0x003c  */
    /* JADX WARN: Code duplicated, block: B:18:0x0041 A[PHI: r11
  0x0041: PHI (r11v5 o.getPostalCode) = (r11v1 o.getPostalCode), (r11v6 o.getPostalCode) binds: [B:8:0x0023, B:5:0x0019] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:28:0x0062  */
    /* JADX WARN: Code duplicated, block: B:29:0x006e  */
    /* JADX WARN: Code duplicated, block: B:9:0x0025 A[PHI: r11
  0x0025: PHI (r11v2 o.getPostalCode) = (r11v1 o.getPostalCode), (r11v6 o.getPostalCode) binds: [B:8:0x0023, B:5:0x0019] A[DONT_GENERATE, DONT_INLINE]] */
    public static final void write(int i, getBirthDateFull getbirthdatefull, Modifier modifier, String str, r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k0) {
        getPostalCode getpostalcode;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6 = 2;
        int i7 = 2 % 2;
        int i8 = read + 15;
        serializer = i8 % Fields.SpotShadowColor;
        boolean z = true;
        if (i8 % 2 != 0) {
            getpostalcode = (getPostalCode) getbirthdatefull;
            getpostalcode.MediaSessionCompatQueueItem(-506282371);
            if ((i & 17) == 0) {
                i2 = read + 77;
                serializer = i2 % Fields.SpotShadowColor;
                if (i2 % 2 == 0) {
                    getpostalcode.read(str);
                    throw null;
                }
                if (!(!getpostalcode.read(str))) {
                    i3 = 4;
                } else {
                    i3 = 2;
                }
                i4 = i3 | i;
            } else {
                i4 = i;
            }
        } else {
            getpostalcode = (getPostalCode) getbirthdatefull;
            getpostalcode.MediaSessionCompatQueueItem(-506282371);
            if ((i & 6) == 0) {
                i2 = read + 77;
                serializer = i2 % Fields.SpotShadowColor;
                if (i2 % 2 == 0) {
                    getpostalcode.read(str);
                    throw null;
                }
                if (!(!getpostalcode.read(str))) {
                    i3 = 4;
                } else {
                    i3 = 2;
                }
                i4 = i3 | i;
            } else {
                i4 = i;
            }
        }
        if ((i & 48) == 0) {
            int i9 = serializer + 107;
            read = i9 % Fields.SpotShadowColor;
            if (i9 % 2 == 0) {
                int i10 = 67 / 0;
                if (getpostalcode.IconCompatParcelizer(r8lambdardpfsr94j4iebcwx_kpqzpm8k0)) {
                    int i11 = read + 47;
                    serializer = i11 % Fields.SpotShadowColor;
                    int i12 = i11 % 2;
                    i5 = 32;
                } else {
                    i5 = 16;
                }
            } else if (getpostalcode.IconCompatParcelizer(r8lambdardpfsr94j4iebcwx_kpqzpm8k0)) {
                int i13 = read + 47;
                serializer = i13 % Fields.SpotShadowColor;
                int i14 = i13 % 2;
                i5 = 32;
            } else {
                i5 = 16;
            }
            i4 |= i5;
        }
        int i15 = i4 | 384;
        if ((i15 & 147) != 146) {
            int i16 = serializer + 45;
            read = i16 % Fields.SpotShadowColor;
            int i17 = i16 % 2;
        } else {
            z = false;
        }
        if (getpostalcode.write(i15 & 1, z)) {
            modifier = Modifier.Companion;
            BadgeKt.BadgedBox(((i15 >> 3) & 112) | 390, getpostalcode, ExtrasKt.write(523123071, new isUrlWithTrackerQueryParam(str, i6), getpostalcode), ExtrasKt.write(-845414077, new DefaultLazyKey(5, r8lambdardpfsr94j4iebcwx_kpqzpm8k0), getpostalcode), modifier);
        } else {
            getpostalcode.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
        }
        Modifier modifier2 = modifier;
        int i18 = serializer + 57;
        read = i18 % Fields.SpotShadowColor;
        int i19 = i18 % 2;
        getHandleruiannotations gethandleruiannotationsMediaDescriptionCompat = getpostalcode.MediaDescriptionCompat();
        if (gethandleruiannotationsMediaDescriptionCompat != null) {
            gethandleruiannotationsMediaDescriptionCompat.serializer = new computeHorizontalScrollExtent(str, r8lambdardpfsr94j4iebcwx_kpqzpm8k0, modifier2, i, 5);
        }
    }

    /* JADX WARN: Code duplicated, block: B:23:0x008a A[PHI: r0 r1
  0x008a: PHI (r0v13 int) = (r0v12 int), (r0v28 int) binds: [B:22:0x0088, B:19:0x0072] A[DONT_GENERATE, DONT_INLINE]
  0x008a: PHI (r1v18 java.lang.String) = (r1v17 java.lang.String), (r1v38 java.lang.String) binds: [B:22:0x0088, B:19:0x0072] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:24:0x008e A[PHI: r0 r1
  0x008e: PHI (r0v26 int) = (r0v12 int), (r0v28 int) binds: [B:22:0x0088, B:19:0x0072] A[DONT_GENERATE, DONT_INLINE]
  0x008e: PHI (r1v31 java.lang.String) = (r1v17 java.lang.String), (r1v38 java.lang.String) binds: [B:22:0x0088, B:19:0x0072] A[DONT_GENERATE, DONT_INLINE]] */
    public static final void CustomerChatFloatingButtonContainer(getDoneeUduSuoannotations getdoneeudusuoannotations, getBirthDateFull getbirthdatefull, int i) {
        int i2;
        String str;
        int i3;
        int i4;
        String str2;
        boolean z;
        int i5;
        int i6 = 2 % 2;
        int i7 = read + 77;
        serializer = i7 % Fields.SpotShadowColor;
        int i8 = i7 % 2;
        getdoneeudusuoannotations.getClass();
        getPostalCode getpostalcode = (getPostalCode) getbirthdatefull;
        getpostalcode.MediaSessionCompatQueueItem(1916401415);
        if ((i & 6) == 0) {
            int i9 = read + 85;
            serializer = i9 % Fields.SpotShadowColor;
            int i10 = i9 % 2;
            if (!(!getpostalcode.read(getdoneeudusuoannotations))) {
                int i11 = read + 31;
                serializer = i11 % Fields.SpotShadowColor;
                int i12 = i11 % 2;
                i5 = 4;
            } else {
                i5 = 2;
            }
            i2 = i5 | i;
        } else {
            i2 = i;
        }
        int i13 = 0;
        if (getpostalcode.write(i2 & 1, (i2 & 3) != 2)) {
            int i14 = read + 123;
            serializer = i14 % Fields.SpotShadowColor;
            if (i14 % 2 != 0) {
                str = ((toVariationValue) ExtrasKt.write(((CustomerChatFloatingButtonUiModel) getdoneeudusuoannotations).MediaDescriptionCompat, getpostalcode, 1).getValue()).write;
                i3 = i2 & 11;
                if (i3 == 3) {
                    i4 = i3;
                    str2 = str;
                    z = true;
                } else {
                    i4 = i3;
                    str2 = str;
                    z = false;
                }
            } else {
                str = ((toVariationValue) ExtrasKt.write(((CustomerChatFloatingButtonUiModel) getdoneeudusuoannotations).MediaDescriptionCompat, getpostalcode, 0).getValue()).write;
                i3 = i2 & 14;
                if (i3 == 4) {
                    i4 = i3;
                    str2 = str;
                    z = true;
                } else {
                    i4 = i3;
                    str2 = str;
                    z = false;
                }
            }
            Object objComponentActivity = getpostalcode.ComponentActivity();
            AndroidContentCaptureManager androidContentCaptureManager = getCreditCardExpirationMonth.write;
            if (z || objComponentActivity == androidContentCaptureManager) {
                AutoAcceptOptionKt$AutoAcceptOption$1$1 autoAcceptOptionKt$AutoAcceptOption$1$1 = new AutoAcceptOptionKt$AutoAcceptOption$1$1(0, getdoneeudusuoannotations, getDoneeUduSuoannotations.class, "onChatButtonClick", "onChatButtonClick()V", 0, 18);
                getpostalcode.write(autoAcceptOptionKt$AutoAcceptOption$1$1);
                objComponentActivity = autoAcceptOptionKt$AutoAcceptOption$1$1;
            }
            write(0, getpostalcode, null, str2, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) ((registerInAppMessageManagerlambda0) objComponentActivity));
            boolean z2 = i4 == 4;
            Object objComponentActivity2 = getpostalcode.ComponentActivity();
            if (z2 || objComponentActivity2 == androidContentCaptureManager) {
                objComponentActivity2 = new getNexteUduSuoannotations(getdoneeudusuoannotations, i13);
                getpostalcode.write(objComponentActivity2);
            }
            createFromParcel createfromparcel = createFromParcel.INSTANCE;
            RangesKt.read(980236944, BackspaceCommand.write(), BackspaceCommand.write(), new Object[]{createfromparcel, null, (r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) objComponentActivity2, getpostalcode, 6}, BackspaceCommand.write(), -980236935, BackspaceCommand.write());
            int i15 = serializer + 51;
            read = i15 % Fields.SpotShadowColor;
            int i16 = i15 % 2;
        } else {
            getpostalcode.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
        }
        getHandleruiannotations gethandleruiannotationsMediaDescriptionCompat = getpostalcode.MediaDescriptionCompat();
        if (gethandleruiannotationsMediaDescriptionCompat != null) {
            gethandleruiannotationsMediaDescriptionCompat.serializer = new getSendeUduSuoannotations(getdoneeudusuoannotations, i, 0);
        }
        int i17 = serializer + 73;
        read = i17 % Fields.SpotShadowColor;
        if (i17 % 2 == 0) {
            throw null;
        }
    }
}
