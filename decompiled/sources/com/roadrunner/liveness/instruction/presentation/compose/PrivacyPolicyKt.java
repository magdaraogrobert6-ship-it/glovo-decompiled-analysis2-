package com.roadrunner.liveness.instruction.presentation.compose;

import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.material3.TextKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Fields;
import androidx.compose.ui.node.ComposeUiNode;
import bo.app.c8$$ExternalSyntheticOutline0;
import bo.app.m1$$ExternalSyntheticOutline0;
import com.huawei.riemann.location.common.utils.Constant;
import com.logistics.rider.glovo.R;
import com.roadrunner.rrds.compose.component.buttons.TertiaryKt;
import io.sentry.SentryUUID;
import o.AndroidContentCaptureManager;
import o.AndroidContentCaptureManagerCompanion;
import o.DragAndDropNodestartDragAndDropTransfer1;
import o.ModalBottomSheetKtModalBottomSheet311;
import o.ModalBottomSheetYbuCTN8;
import o.PassthroughConnectionusePrepared2;
import o.buildMapping;
import o.getBirthDateFull;
import o.getCreditCardExpirationMonth;
import o.getHandleruiannotations;
import o.getNewPassword;
import o.getPostalCode;
import o.hashBoolean;
import o.performLayout;
import o.performMeasureDjhGOtQ;
import o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0;
import o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM;
import o.r8lambdag2v_8ZFcgEbevxAiKW6LalaYkVg;

/* JADX INFO: loaded from: classes3.dex */
public abstract class PrivacyPolicyKt {
    private static int read = 1;
    private static int write;

    /* JADX WARN: Code duplicated, block: B:71:0x0167  */
    public static final void PrivacyPolicy(String str, String str2, String str3, r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm, Modifier modifier, getBirthDateFull getbirthdatefull, int i) {
        int i2;
        Modifier modifier2;
        boolean z;
        int i3;
        int i4 = 2 % 2;
        str.getClass();
        r8lambdaunavo3sxub_pc9xroryotnrlvsm.getClass();
        getPostalCode getpostalcode = (getPostalCode) getbirthdatefull;
        getpostalcode.MediaSessionCompatQueueItem(-84651837);
        if ((i & 6) == 0) {
            int i5 = write + 97;
            read = i5 % Fields.SpotShadowColor;
            if (i5 % 2 == 0) {
                getpostalcode.read(str);
                throw null;
            }
            i2 = (getpostalcode.read(str) ? 4 : 2) | i;
            int i6 = write + 87;
            read = i6 % Fields.SpotShadowColor;
            int i7 = i6 % 2;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            if (getpostalcode.read(str2)) {
                i3 = 32;
            } else {
                int i8 = read + 107;
                write = i8 % Fields.SpotShadowColor;
                int i9 = i8 % 2;
                i3 = 16;
            }
            i2 |= i3;
        }
        if ((i & 384) == 0) {
            i2 |= getpostalcode.read(str3) ? Fields.RotationX : Fields.SpotShadowColor;
        }
        if ((i & 3072) == 0) {
            i2 |= getpostalcode.IconCompatParcelizer(r8lambdaunavo3sxub_pc9xroryotnrlvsm) ? Fields.CameraDistance : Fields.RotationZ;
        }
        int i10 = i2 | 24576;
        if (getpostalcode.write(i10 & 1, (i10 & 9363) != 9362)) {
            Modifier.Companion companion = Modifier.Companion;
            ModalBottomSheetYbuCTN8 modalBottomSheetYbuCTN8Serializer = ModalBottomSheetKtModalBottomSheet311.serializer(Arrangement.MediaDescriptionCompat, Alignment.Companion.getStart(), getpostalcode, 0);
            int iHashCode = Long.hashCode(getpostalcode.RatingCompat);
            DragAndDropNodestartDragAndDropTransfer1 dragAndDropNodestartDragAndDropTransfer1Serializer = getpostalcode.serializer();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(getpostalcode, companion);
            ComposeUiNode.Companion companion2 = ComposeUiNode.Companion;
            r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 constructor = companion2.getConstructor();
            if (getpostalcode.read == null) {
                SentryUUID.write();
                throw null;
            }
            int i11 = read + 49;
            write = i11 % Fields.SpotShadowColor;
            if (i11 % 2 != 0) {
                getpostalcode.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg();
                boolean z2 = getpostalcode.ComponentActivity;
                throw null;
            }
            getpostalcode.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg();
            if (getpostalcode.ComponentActivity) {
                getpostalcode.serializer(constructor);
                int i12 = write + 83;
                read = i12 % Fields.SpotShadowColor;
                int i13 = i12 % 2;
            } else {
                getpostalcode.r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28();
            }
            c8$$ExternalSyntheticOutline0.m(companion2, getpostalcode, modalBottomSheetYbuCTN8Serializer, getpostalcode, dragAndDropNodestartDragAndDropTransfer1Serializer);
            AndroidContentCaptureManagerCompanion.write(getpostalcode, modifierMaterializeModifier, m1$$ExternalSyntheticOutline0.m(companion2, getpostalcode, Integer.valueOf(iHashCode), getpostalcode));
            TextKt.m131TextNvy7gAk(str2, null, ((buildMapping) getpostalcode.write((getNewPassword) performMeasureDjhGOtQ.RemoteActionCompatParcelizer)).setPresenter(), 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, performLayout.write(), getpostalcode, (i10 >> 3) & 14, 0, 131066);
            hashBoolean hashboolean = hashBoolean.END;
            boolean z3 = (i10 & 7168) == 2048;
            if ((i10 & 14) == 4) {
                z = true;
            } else {
                int i14 = write + 119;
                read = i14 % Fields.SpotShadowColor;
                if (i14 % 2 == 0) {
                    int i15 = 3 % 3;
                }
                z = false;
            }
            Object objComponentActivity = getpostalcode.ComponentActivity();
            if (!z && !z3) {
                int i16 = read + 65;
                write = i16 % Fields.SpotShadowColor;
                if (i16 % 2 != 0) {
                    AndroidContentCaptureManager androidContentCaptureManager = getCreditCardExpirationMonth.write;
                    throw null;
                }
                if (objComponentActivity == getCreditCardExpirationMonth.write) {
                    objComponentActivity = new PassthroughConnectionusePrepared2(r8lambdaunavo3sxub_pc9xroryotnrlvsm, str, 0);
                    getpostalcode.write(objComponentActivity);
                }
            } else {
                objComponentActivity = new PassthroughConnectionusePrepared2(r8lambdaunavo3sxub_pc9xroryotnrlvsm, str, 0);
                getpostalcode.write(objComponentActivity);
            }
            TertiaryKt.IconCompatParcelizer(str3, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) objComponentActivity, null, false, R.drawable.ic_bold_medium_text_formatting_external_link, hashboolean, null, null, getpostalcode, ((i10 >> 6) & 14) | 196608, Constant.ERROR_ACC_INVALID);
            getpostalcode.IconCompatParcelizer(true);
            modifier2 = companion;
        } else {
            getpostalcode.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
            modifier2 = modifier;
        }
        getHandleruiannotations gethandleruiannotationsMediaDescriptionCompat = getpostalcode.MediaDescriptionCompat();
        if (gethandleruiannotationsMediaDescriptionCompat != null) {
            gethandleruiannotationsMediaDescriptionCompat.serializer = new r8lambdag2v_8ZFcgEbevxAiKW6LalaYkVg((Object) str, (Object) str2, (Object) str3, r8lambdaunavo3sxub_pc9xroryotnrlvsm, modifier2, i, 4);
        }
    }
}
