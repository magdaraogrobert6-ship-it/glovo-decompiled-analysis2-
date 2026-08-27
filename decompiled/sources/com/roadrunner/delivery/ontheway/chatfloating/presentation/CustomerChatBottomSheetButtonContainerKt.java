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
public abstract class CustomerChatBottomSheetButtonContainerKt {
    private static int RemoteActionCompatParcelizer = 0;
    private static int serializer = 1;

    public static final void serializer(int i, getBirthDateFull getbirthdatefull, Modifier modifier, String str, r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k0) {
        int i2;
        boolean z;
        int i3;
        int i4;
        int i5 = 2 % 2;
        getPostalCode getpostalcode = (getPostalCode) getbirthdatefull;
        getpostalcode.MediaSessionCompatQueueItem(949336255);
        int i6 = 4;
        if ((i & 6) == 0) {
            if (getpostalcode.read(str)) {
                i4 = 4;
            } else {
                int i7 = serializer + 31;
                RemoteActionCompatParcelizer = i7 % Fields.SpotShadowColor;
                int i8 = i7 % 2;
                i4 = 2;
            }
            i2 = i4 | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            if (getpostalcode.IconCompatParcelizer(r8lambdardpfsr94j4iebcwx_kpqzpm8k0)) {
                i3 = 32;
            } else {
                int i9 = serializer + 121;
                RemoteActionCompatParcelizer = i9 % Fields.SpotShadowColor;
                int i10 = i9 % 2;
                i3 = 16;
            }
            i2 |= i3;
        }
        int i11 = i2 | 384;
        int i12 = 1;
        if ((i11 & 147) != 146) {
            z = true;
        } else {
            int i13 = RemoteActionCompatParcelizer + 61;
            serializer = i13 % Fields.SpotShadowColor;
            int i14 = i13 % 2;
            z = false;
        }
        if (getpostalcode.write(i11 & 1, z)) {
            modifier = Modifier.Companion;
            BadgeKt.BadgedBox(((i11 >> 3) & 112) | 390, getpostalcode, ExtrasKt.write(60346109, new isUrlWithTrackerQueryParam(str, i12), getpostalcode), ExtrasKt.write(874856889, new DefaultLazyKey(i6, r8lambdardpfsr94j4iebcwx_kpqzpm8k0), getpostalcode), modifier);
        } else {
            getpostalcode.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
        }
        Modifier modifier2 = modifier;
        getHandleruiannotations gethandleruiannotationsMediaDescriptionCompat = getpostalcode.MediaDescriptionCompat();
        if (gethandleruiannotationsMediaDescriptionCompat != null) {
            gethandleruiannotationsMediaDescriptionCompat.serializer = new computeHorizontalScrollExtent(str, r8lambdardpfsr94j4iebcwx_kpqzpm8k0, modifier2, i, 4);
        }
    }

    public static final void CustomerChatBottomSheetButtonContainer(getDoneeUduSuoannotations getdoneeudusuoannotations, getBirthDateFull getbirthdatefull, int i) {
        int i2;
        int i3;
        int i4;
        int i5 = 2 % 2;
        int i6 = serializer + 73;
        RemoteActionCompatParcelizer = i6 % Fields.SpotShadowColor;
        int i7 = i6 % 2;
        getdoneeudusuoannotations.getClass();
        getPostalCode getpostalcode = (getPostalCode) getbirthdatefull;
        getpostalcode.MediaSessionCompatQueueItem(531754313);
        if ((i & 6) == 0) {
            i2 = (getpostalcode.read(getdoneeudusuoannotations) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        boolean z = false;
        if (getpostalcode.write(i2 & 1, (i2 & 3) != 2)) {
            String str = ((toVariationValue) ExtrasKt.write(((CustomerChatFloatingButtonUiModel) getdoneeudusuoannotations).MediaDescriptionCompat, getpostalcode, 0).getValue()).write;
            int i8 = i2 & 14;
            boolean z2 = i8 == 4;
            Object objComponentActivity = getpostalcode.ComponentActivity();
            AndroidContentCaptureManager androidContentCaptureManager = getCreditCardExpirationMonth.write;
            if (z2 || objComponentActivity == androidContentCaptureManager) {
                AutoAcceptOptionKt$AutoAcceptOption$1$1 autoAcceptOptionKt$AutoAcceptOption$1$1 = new AutoAcceptOptionKt$AutoAcceptOption$1$1(0, getdoneeudusuoannotations, getDoneeUduSuoannotations.class, "onChatButtonClick", "onChatButtonClick()V", 0, 17);
                getpostalcode.write(autoAcceptOptionKt$AutoAcceptOption$1$1);
                objComponentActivity = autoAcceptOptionKt$AutoAcceptOption$1$1;
            }
            serializer(0, getpostalcode, null, str, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) ((registerInAppMessageManagerlambda0) objComponentActivity));
            if (i8 == 4) {
                int i9 = serializer + 37;
                RemoteActionCompatParcelizer = i9 % Fields.SpotShadowColor;
                i3 = 2;
                int i10 = i9 % 2;
                z = true;
            } else {
                i3 = 2;
            }
            Object objComponentActivity2 = getpostalcode.ComponentActivity();
            if (z) {
                i4 = 1;
            } else {
                i4 = 1;
                int i11 = serializer + 1;
                RemoteActionCompatParcelizer = i11 % Fields.SpotShadowColor;
                int i12 = i11 % i3;
                if (objComponentActivity2 == androidContentCaptureManager) {
                }
                createFromParcel createfromparcel = createFromParcel.INSTANCE;
                int iWrite = BackspaceCommand.write();
                RangesKt.read(980236944, BackspaceCommand.write(), BackspaceCommand.write(), new Object[]{createfromparcel, null, (r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) objComponentActivity2, getpostalcode, 6}, BackspaceCommand.write(), -980236935, iWrite);
            }
            objComponentActivity2 = new getNexteUduSuoannotations(getdoneeudusuoannotations, i4);
            getpostalcode.write(objComponentActivity2);
            createFromParcel createfromparcel2 = createFromParcel.INSTANCE;
            int iWrite2 = BackspaceCommand.write();
            RangesKt.read(980236944, BackspaceCommand.write(), BackspaceCommand.write(), new Object[]{createfromparcel2, null, (r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) objComponentActivity2, getpostalcode, 6}, BackspaceCommand.write(), -980236935, iWrite2);
        } else {
            getpostalcode.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
        }
        getHandleruiannotations gethandleruiannotationsMediaDescriptionCompat = getpostalcode.MediaDescriptionCompat();
        if (gethandleruiannotationsMediaDescriptionCompat != null) {
            gethandleruiannotationsMediaDescriptionCompat.serializer = new getSendeUduSuoannotations(getdoneeudusuoannotations, i, 1);
        }
    }
}
