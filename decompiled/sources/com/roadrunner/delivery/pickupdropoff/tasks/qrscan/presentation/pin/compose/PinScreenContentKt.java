package com.roadrunner.delivery.pickupdropoff.tasks.qrscan.presentation.pin.compose;

import android.text.TextUtils;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.material3.TextKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Fields;
import androidx.compose.ui.node.ComposeUiNode;
import bo.app.c8$$ExternalSyntheticOutline0;
import bo.app.m1$$ExternalSyntheticOutline0;
import coil3.ExtrasKt;
import com.roadrunner.designsystem.compose.theme.tokens.Dimensions;
import com.roadrunner.rrds.compose.component.pin.PinValidationRowKt;
import io.sentry.SentryUUID;
import o.AdjustBridgeInstance9;
import o.AndroidContentCaptureManagerCompanion;
import o.DpSizeCompanion;
import o.DragAndDropNodestartDragAndDropTransfer1;
import o.FlingCancellationException;
import o.ModalBottomSheetKtModalBottomSheet311;
import o.ModalBottomSheetYbuCTN8;
import o.accessgetCountjd;
import o.fieldToBoolean;
import o.getAddressCountry;
import o.getAndroidType;
import o.getBirthDateFull;
import o.getHandleruiannotations;
import o.getPostalCode;
import o.getUnspecifiedMYxV2XQ;
import o.handleUrlOverridelambda1;
import o.performLayout;
import o.plusNvtHpc;
import o.pluse_xh8Ic;
import o.r8lambda9QlT_ra9FwUEV5vl9YtC6BGxtDk;
import o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0;
import o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM;

/* JADX INFO: loaded from: classes3.dex */
public abstract class PinScreenContentKt {
    private static int RemoteActionCompatParcelizer = 0;
    private static int write = 1;

    /* JADX WARN: Code duplicated, block: B:96:0x0272  */
    public static final void PinScreenContent(accessgetCountjd accessgetcountjd, boolean z, pluse_xh8Ic pluse_xh8ic, r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k0, r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm, Modifier modifier, getBirthDateFull getbirthdatefull, int i) {
        int i2;
        Modifier modifier2;
        String str;
        String str2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7 = 2 % 2;
        accessgetcountjd.getClass();
        String str3 = accessgetcountjd.validationPin;
        pluse_xh8ic.getClass();
        r8lambdardpfsr94j4iebcwx_kpqzpm8k0.getClass();
        r8lambdaunavo3sxub_pc9xroryotnrlvsm.getClass();
        getPostalCode getpostalcode = (getPostalCode) getbirthdatefull;
        getpostalcode.MediaSessionCompatQueueItem(-714285376);
        getAddressCountry getaddresscountry = getpostalcode.read;
        if ((i & 6) == 0) {
            int i8 = write + 7;
            RemoteActionCompatParcelizer = i8 % Fields.SpotShadowColor;
            int i9 = i8 % 2;
            i2 = (getpostalcode.read(accessgetcountjd) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            int i10 = write + 55;
            RemoteActionCompatParcelizer = i10 % Fields.SpotShadowColor;
            int i11 = i10 % 2;
            if (getpostalcode.write(z)) {
                int i12 = RemoteActionCompatParcelizer + 89;
                write = i12 % Fields.SpotShadowColor;
                i6 = i12 % 2 == 0 ? 94 : 32;
            } else {
                i6 = 16;
            }
            i2 |= i6;
        }
        if ((i & 384) == 0) {
            if (getpostalcode.IconCompatParcelizer(pluse_xh8ic)) {
                int i13 = RemoteActionCompatParcelizer + 123;
                write = i13 % Fields.SpotShadowColor;
                i5 = i13 % 2 == 0 ? 32463 : Fields.RotationX;
            } else {
                i5 = Fields.SpotShadowColor;
            }
            i2 |= i5;
        }
        Object obj = null;
        if ((i & 3072) == 0) {
            int i14 = write + 89;
            RemoteActionCompatParcelizer = i14 % Fields.SpotShadowColor;
            if (i14 % 2 != 0) {
                getpostalcode.IconCompatParcelizer(r8lambdardpfsr94j4iebcwx_kpqzpm8k0);
                obj.hashCode();
                throw null;
            }
            if (getpostalcode.IconCompatParcelizer(r8lambdardpfsr94j4iebcwx_kpqzpm8k0)) {
                int i15 = write + 67;
                RemoteActionCompatParcelizer = i15 % Fields.SpotShadowColor;
                i4 = i15 % 2 != 0 ? 6203 : Fields.CameraDistance;
            } else {
                i4 = Fields.RotationZ;
            }
            i2 |= i4;
        }
        if ((i & 24576) == 0) {
            if (getpostalcode.IconCompatParcelizer(r8lambdaunavo3sxub_pc9xroryotnrlvsm)) {
                int i16 = write + 29;
                RemoteActionCompatParcelizer = i16 % Fields.SpotShadowColor;
                i3 = i16 % 2 != 0 ? 3358 : Fields.Clip;
            } else {
                i3 = 8192;
            }
            i2 |= i3;
        }
        int i17 = i2 | 196608;
        if (getpostalcode.write(i17 & 1, (74899 & i17) != 74898)) {
            Modifier.Companion companion = Modifier.Companion;
            AdjustBridgeInstance9 adjustBridgeInstance9 = TextUtils.isDigitsOnly(str3) ? AdjustBridgeInstance9.NUMERIC : AdjustBridgeInstance9.ALPHA_NUMERIC;
            int i18 = write + 73;
            RemoteActionCompatParcelizer = i18 % Fields.SpotShadowColor;
            int i19 = i18 % 2;
            Modifier modifierThen = companion.then(SizeKt.read);
            modifierThen.getClass();
            FlingCancellationException flingCancellationException = Arrangement.MediaDescriptionCompat;
            Alignment.Companion companion2 = Alignment.Companion;
            ModalBottomSheetYbuCTN8 modalBottomSheetYbuCTN8Serializer = ModalBottomSheetKtModalBottomSheet311.serializer(flingCancellationException, companion2.getStart(), getpostalcode, 0);
            int iHashCode = Long.hashCode(getpostalcode.RatingCompat);
            DragAndDropNodestartDragAndDropTransfer1 dragAndDropNodestartDragAndDropTransfer1Serializer = getpostalcode.serializer();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(getpostalcode, modifierThen);
            ComposeUiNode.Companion companion3 = ComposeUiNode.Companion;
            r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 constructor = companion3.getConstructor();
            if (getaddresscountry == null) {
                SentryUUID.write();
                throw null;
            }
            getpostalcode.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg();
            if (getpostalcode.ComponentActivity) {
                int i20 = write + 125;
                RemoteActionCompatParcelizer = i20 % Fields.SpotShadowColor;
                int i21 = i20 % 2;
                getpostalcode.serializer(constructor);
            } else {
                getpostalcode.r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28();
            }
            c8$$ExternalSyntheticOutline0.m(companion3, getpostalcode, modalBottomSheetYbuCTN8Serializer, getpostalcode, dragAndDropNodestartDragAndDropTransfer1Serializer);
            AndroidContentCaptureManagerCompanion.write(getpostalcode, modifierMaterializeModifier, m1$$ExternalSyntheticOutline0.m(companion3, getpostalcode, Integer.valueOf(iHashCode), getpostalcode));
            int i22 = i17 >> 3;
            plusNvtHpc.IconCompatParcelizer((i22 & 14) | ((i17 >> 6) & 112), getpostalcode, null, r8lambdardpfsr94j4iebcwx_kpqzpm8k0, z);
            float f = Dimensions.setActionBarVisibilityCallback;
            ExtrasKt.read(913837329, handleUrlOverridelambda1.RemoteActionCompatParcelizer(), handleUrlOverridelambda1.RemoteActionCompatParcelizer(), -913837326, handleUrlOverridelambda1.RemoteActionCompatParcelizer(), handleUrlOverridelambda1.RemoteActionCompatParcelizer(), new Object[]{getpostalcode, SizeKt.m75height3ABfNKs(companion, f)});
            Alignment.Horizontal centerHorizontally = companion2.getCenterHorizontally();
            Modifier modifierWrite = PaddingKt.write(SizeKt.write(companion, 1.0f), Dimensions.setTransitioning);
            ModalBottomSheetYbuCTN8 modalBottomSheetYbuCTN8Serializer2 = ModalBottomSheetKtModalBottomSheet311.serializer(flingCancellationException, centerHorizontally, getpostalcode, 48);
            int iHashCode2 = Long.hashCode(getpostalcode.RatingCompat);
            DragAndDropNodestartDragAndDropTransfer1 dragAndDropNodestartDragAndDropTransfer1Serializer2 = getpostalcode.serializer();
            Modifier modifierMaterializeModifier2 = ComposedModifierKt.materializeModifier(getpostalcode, modifierWrite);
            r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 constructor2 = companion3.getConstructor();
            getpostalcode.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg();
            if (getpostalcode.ComponentActivity) {
                getpostalcode.serializer(constructor2);
            } else {
                getpostalcode.r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28();
            }
            c8$$ExternalSyntheticOutline0.m(companion3, getpostalcode, modalBottomSheetYbuCTN8Serializer2, getpostalcode, dragAndDropNodestartDragAndDropTransfer1Serializer2);
            AndroidContentCaptureManagerCompanion.write(getpostalcode, modifierMaterializeModifier2, m1$$ExternalSyntheticOutline0.m(companion3, getpostalcode, Integer.valueOf(iHashCode2), getpostalcode));
            TextKt.m131TextNvy7gAk(accessgetcountjd.headline, PaddingKt.m74paddingqDBjuR0$default(companion, 0.0f, 0.0f, 0.0f, f, 7), 0L, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, performLayout.MediaSessionCompatQueueItem(), getpostalcode, 0, 0, 131068);
            TextKt.m131TextNvy7gAk(accessgetcountjd.instructionMessage, PaddingKt.m74paddingqDBjuR0$default(companion, 0.0f, 0.0f, 0.0f, Dimensions.setUiOptions, 7), 0L, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, performLayout.serializer(), getpostalcode, 0, 0, 131068);
            int length = str3.length();
            r8lambda9QlT_ra9FwUEV5vl9YtC6BGxtDk r8lambda9qlt_ra9fwuev5vl9ytc6bgxtdk = accessgetcountjd.enteredPin;
            getUnspecifiedMYxV2XQ getunspecifiedmyxv2xq = pluse_xh8ic instanceof getUnspecifiedMYxV2XQ ? (getUnspecifiedMYxV2XQ) pluse_xh8ic : null;
            if (getunspecifiedmyxv2xq == null || (str = getunspecifiedmyxv2xq.RemoteActionCompatParcelizer) == null) {
                str = "";
            }
            boolean z2 = pluse_xh8ic instanceof DpSizeCompanion;
            DpSizeCompanion dpSizeCompanion = z2 ? (DpSizeCompanion) pluse_xh8ic : null;
            if (dpSizeCompanion != null) {
                int i23 = RemoteActionCompatParcelizer + 61;
                write = i23 % Fields.SpotShadowColor;
                if (i23 % 2 == 0) {
                    String str4 = dpSizeCompanion.write;
                    throw null;
                }
                String str5 = dpSizeCompanion.write;
                if (str5 == null) {
                    str2 = "";
                } else {
                    str2 = str5;
                }
            } else {
                str2 = "";
            }
            PinValidationRowKt.PinValidationRow(length, r8lambda9qlt_ra9fwuev5vl9ytc6bgxtdk, str, r8lambdaunavo3sxub_pc9xroryotnrlvsm, null, false, "-", false, z2, adjustBridgeInstance9, false, true, false, str2, fieldToBoolean.CENTER, companion2.getCenterHorizontally(), getpostalcode, (i22 & 7168) | 1572864, 221232, 5296);
            getpostalcode.IconCompatParcelizer(true);
            getpostalcode.IconCompatParcelizer(true);
            modifier2 = companion;
        } else {
            getpostalcode.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
            modifier2 = modifier;
        }
        getHandleruiannotations gethandleruiannotationsMediaDescriptionCompat = getpostalcode.MediaDescriptionCompat();
        if (gethandleruiannotationsMediaDescriptionCompat != null) {
            gethandleruiannotationsMediaDescriptionCompat.serializer = new getAndroidType(accessgetcountjd, z, pluse_xh8ic, r8lambdardpfsr94j4iebcwx_kpqzpm8k0, r8lambdaunavo3sxub_pc9xroryotnrlvsm, modifier2, i);
        }
    }
}
