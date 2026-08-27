package com.roadrunner.liveness.instruction.presentation.compose;

import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Fields;
import androidx.compose.ui.graphics.RectangleShapeKt;
import androidx.compose.ui.node.ComposeUiNode;
import bo.app.c8$$ExternalSyntheticOutline0;
import bo.app.m1$$ExternalSyntheticOutline0;
import coil3.ExtrasKt;
import com.roadrunner.designsystem.compose.theme.tokens.Dimensions;
import io.sentry.SentryUUID;
import o.AndroidContentCaptureManagerCompanion;
import o.DragAndDropNodestartDragAndDropTransfer1;
import o.FlingCancellationException;
import o.FlowUtilcreateFlowinlinedmap12;
import o.ModalBottomSheetKtModalBottomSheet311;
import o.ModalBottomSheetYbuCTN8;
import o.PagerWrapperFlingBehavior;
import o.PassthroughConnectionwithTransaction2;
import o.buildMapping;
import o.getAddressCountry;
import o.getBirthDateFull;
import o.getHandleruiannotations;
import o.getNewPassword;
import o.getPostalCode;
import o.handleUrlOverridelambda1;
import o.performMeasureDjhGOtQ;
import o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0;
import o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM;
import o.r8lambdag2v_8ZFcgEbevxAiKW6LalaYkVg;
import o.show;

/* JADX INFO: loaded from: classes3.dex */
public abstract class InstructionScreenKt {
    private static int IconCompatParcelizer = 1;
    private static int read;

    /* JADX WARN: Code duplicated, block: B:11:0x0051  */
    /* JADX WARN: Code duplicated, block: B:12:0x005c  */
    /* JADX WARN: Code duplicated, block: B:14:0x0060 A[PHI: r1 r2
  0x0060: PHI (r1v63 o.getPostalCode) = (r1v5 o.getPostalCode), (r1v65 o.getPostalCode) binds: [B:8:0x003e, B:5:0x002a] A[DONT_GENERATE, DONT_INLINE]
  0x0060: PHI (r2v15 o.getAddressCountry) = (r2v2 o.getAddressCountry), (r2v16 o.getAddressCountry) binds: [B:8:0x003e, B:5:0x002a] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:50:0x00dc  */
    /* JADX WARN: Code duplicated, block: B:51:0x00df  */
    /* JADX WARN: Code duplicated, block: B:9:0x0040 A[PHI: r1 r2
  0x0040: PHI (r1v6 o.getPostalCode) = (r1v5 o.getPostalCode), (r1v65 o.getPostalCode) binds: [B:8:0x003e, B:5:0x002a] A[DONT_GENERATE, DONT_INLINE]
  0x0040: PHI (r2v3 o.getAddressCountry) = (r2v2 o.getAddressCountry), (r2v16 o.getAddressCountry) binds: [B:8:0x003e, B:5:0x002a] A[DONT_GENERATE, DONT_INLINE]] */
    public static final void InstructionScreen(r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k0, r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm, String str, FlowUtilcreateFlowinlinedmap12 flowUtilcreateFlowinlinedmap12, Modifier modifier, getBirthDateFull getbirthdatefull, int i) {
        getPostalCode getpostalcode;
        getAddressCountry getaddresscountry;
        int i2;
        int i3;
        getPostalCode getpostalcode2;
        getPostalCode getpostalcode3;
        Modifier modifier2;
        int i4;
        int i5;
        int i6 = 2 % 2;
        int i7 = IconCompatParcelizer + 125;
        read = i7 % Fields.SpotShadowColor;
        if (i7 % 2 != 0) {
            r8lambdardpfsr94j4iebcwx_kpqzpm8k0.getClass();
            r8lambdaunavo3sxub_pc9xroryotnrlvsm.getClass();
            getpostalcode = (getPostalCode) getbirthdatefull;
            getpostalcode.MediaSessionCompatQueueItem(402169875);
            getaddresscountry = getpostalcode.read;
            if ((i & 78) == 0) {
                int i8 = read + 21;
                IconCompatParcelizer = i8 % Fields.SpotShadowColor;
                int i9 = i8 % 2;
                if (getpostalcode.IconCompatParcelizer(r8lambdardpfsr94j4iebcwx_kpqzpm8k0)) {
                    int i10 = IconCompatParcelizer + 73;
                    read = i10 % Fields.SpotShadowColor;
                    int i11 = i10 % 2;
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
            r8lambdardpfsr94j4iebcwx_kpqzpm8k0.getClass();
            r8lambdaunavo3sxub_pc9xroryotnrlvsm.getClass();
            getpostalcode = (getPostalCode) getbirthdatefull;
            getpostalcode.MediaSessionCompatQueueItem(402169875);
            getaddresscountry = getpostalcode.read;
            if ((i & 6) == 0) {
                int i12 = read + 21;
                IconCompatParcelizer = i12 % Fields.SpotShadowColor;
                int i13 = i12 % 2;
                if (getpostalcode.IconCompatParcelizer(r8lambdardpfsr94j4iebcwx_kpqzpm8k0)) {
                    int i14 = IconCompatParcelizer + 73;
                    read = i14 % Fields.SpotShadowColor;
                    int i15 = i14 % 2;
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
            int i16 = IconCompatParcelizer + 63;
            read = i16 % Fields.SpotShadowColor;
            if (i16 % 2 != 0) {
                getpostalcode2.IconCompatParcelizer(r8lambdaunavo3sxub_pc9xroryotnrlvsm);
                throw null;
            }
            if (getpostalcode2.IconCompatParcelizer(r8lambdaunavo3sxub_pc9xroryotnrlvsm)) {
                int i17 = IconCompatParcelizer + 85;
                read = i17 % Fields.SpotShadowColor;
                int i18 = i17 % 2;
                i5 = 32;
            } else {
                i5 = 16;
            }
            i3 |= i5;
        }
        if ((i & 384) == 0) {
            int i19 = read + 81;
            IconCompatParcelizer = i19 % Fields.SpotShadowColor;
            int i20 = i19 % 2;
            i3 |= getpostalcode2.read(str) ? Fields.RotationX : Fields.SpotShadowColor;
        }
        if ((i & 3072) == 0) {
            i3 |= getpostalcode2.read(flowUtilcreateFlowinlinedmap12) ? Fields.CameraDistance : Fields.RotationZ;
        }
        if ((i & 24576) == 0) {
            int i21 = IconCompatParcelizer + 69;
            read = i21 % Fields.SpotShadowColor;
            if (i21 % 2 != 0) {
                int i22 = 21 / 0;
                if (getpostalcode2.read(modifier)) {
                    i4 = Fields.Clip;
                } else {
                    i4 = 8192;
                }
            } else if (getpostalcode2.read(modifier)) {
                i4 = Fields.Clip;
            } else {
                i4 = 8192;
            }
            i3 |= i4;
        }
        if (getpostalcode2.write(i3 & 1, !((i3 & 9363) == 9362))) {
            int i23 = read + 27;
            IconCompatParcelizer = i23 % Fields.SpotShadowColor;
            int i24 = i23 % 2;
            Modifier modifierM20backgroundbw27NRU = BackgroundKt.m20backgroundbw27NRU(modifier, ((buildMapping) getpostalcode2.write((getNewPassword) performMeasureDjhGOtQ.RemoteActionCompatParcelizer)).IconCompatParcelizer(), RectangleShapeKt.getRectangleShape());
            FlingCancellationException flingCancellationException = Arrangement.MediaDescriptionCompat;
            Alignment.Companion companion = Alignment.Companion;
            ModalBottomSheetYbuCTN8 modalBottomSheetYbuCTN8Serializer = ModalBottomSheetKtModalBottomSheet311.serializer(flingCancellationException, companion.getStart(), getpostalcode2, 0);
            int iHashCode = Long.hashCode(getpostalcode2.RatingCompat);
            DragAndDropNodestartDragAndDropTransfer1 dragAndDropNodestartDragAndDropTransfer1Serializer = getpostalcode2.serializer();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(getpostalcode2, modifierM20backgroundbw27NRU);
            ComposeUiNode.Companion companion2 = ComposeUiNode.Companion;
            r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 constructor = companion2.getConstructor();
            if (getaddresscountry == null) {
                SentryUUID.write();
                throw null;
            }
            int i25 = IconCompatParcelizer + 45;
            read = i25 % Fields.SpotShadowColor;
            if (i25 % 2 != 0) {
                getPostalCode getpostalcode4 = getpostalcode2;
                getpostalcode4.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg();
                boolean z = getpostalcode4.ComponentActivity;
                throw null;
            }
            getpostalcode2.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg();
            if (getpostalcode2.ComponentActivity) {
                getpostalcode2.serializer(constructor);
            } else {
                getpostalcode2.r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28();
            }
            c8$$ExternalSyntheticOutline0.m(companion2, getpostalcode2, modalBottomSheetYbuCTN8Serializer, getpostalcode2, dragAndDropNodestartDragAndDropTransfer1Serializer);
            AndroidContentCaptureManagerCompanion.write(getpostalcode2, modifierMaterializeModifier, m1$$ExternalSyntheticOutline0.m(companion2, getpostalcode2, Integer.valueOf(iHashCode), getpostalcode2));
            float f = Dimensions.getAnimatedVisibility;
            Modifier.Companion companion3 = Modifier.Companion;
            Modifier modifierIconCompatParcelizer = PagerWrapperFlingBehavior.IconCompatParcelizer(PaddingKt.m73paddingVpY3zN4$default(companion3, f, 0.0f, 2).then(new show(1.0f, true)), PagerWrapperFlingBehavior.read(0, getpostalcode2, 1), false, 14);
            ModalBottomSheetYbuCTN8 modalBottomSheetYbuCTN8Serializer2 = ModalBottomSheetKtModalBottomSheet311.serializer(flingCancellationException, companion.getStart(), getpostalcode2, 0);
            int iHashCode2 = Long.hashCode(getpostalcode2.RatingCompat);
            DragAndDropNodestartDragAndDropTransfer1 dragAndDropNodestartDragAndDropTransfer1Serializer2 = getpostalcode2.serializer();
            Modifier modifierMaterializeModifier2 = ComposedModifierKt.materializeModifier(getpostalcode2, modifierIconCompatParcelizer);
            r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 constructor2 = companion2.getConstructor();
            getpostalcode2.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg();
            if (getpostalcode2.ComponentActivity) {
                int i26 = IconCompatParcelizer + 119;
                read = i26 % Fields.SpotShadowColor;
                if (i26 % 2 != 0) {
                    getpostalcode2.serializer(constructor2);
                    Object obj = null;
                    obj.hashCode();
                    throw null;
                }
                getpostalcode2.serializer(constructor2);
                modifier2 = null;
            } else {
                modifier2 = null;
                getpostalcode2.r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28();
            }
            c8$$ExternalSyntheticOutline0.m(companion2, getpostalcode2, modalBottomSheetYbuCTN8Serializer2, getpostalcode2, dragAndDropNodestartDragAndDropTransfer1Serializer2);
            AndroidContentCaptureManagerCompanion.write(getpostalcode2, modifierMaterializeModifier2, m1$$ExternalSyntheticOutline0.m(companion2, getpostalcode2, Integer.valueOf(iHashCode2), getpostalcode2));
            InstructionComponentKt.InstructionHeading(0, getpostalcode2, modifier2, flowUtilcreateFlowinlinedmap12.RemoteActionCompatParcelizer, flowUtilcreateFlowinlinedmap12.read);
            float f2 = Dimensions.getContentHeight;
            ExtrasKt.read(913837329, handleUrlOverridelambda1.RemoteActionCompatParcelizer(), handleUrlOverridelambda1.RemoteActionCompatParcelizer(), -913837326, handleUrlOverridelambda1.RemoteActionCompatParcelizer(), handleUrlOverridelambda1.RemoteActionCompatParcelizer(), new Object[]{getpostalcode2, SizeKt.m75height3ABfNKs(companion3, f2)});
            InstructionComponentKt.Instructions(flowUtilcreateFlowinlinedmap12.MediaBrowserCompatMediaItem, flowUtilcreateFlowinlinedmap12.MediaMetadataCompat, flowUtilcreateFlowinlinedmap12.MediaSessionCompatQueueItem, flowUtilcreateFlowinlinedmap12.IconCompatParcelizer, flowUtilcreateFlowinlinedmap12.serializer, flowUtilcreateFlowinlinedmap12.write, SizeKt.write(companion3, 1.0f), getpostalcode2, 1572864);
            PassthroughConnectionwithTransaction2.serializer(0, getpostalcode2, PaddingKt.m74paddingqDBjuR0$default(SizeKt.write(companion3, 1.0f), 0.0f, f2, 0.0f, 0.0f, 13), flowUtilcreateFlowinlinedmap12.PlaybackStateCompatCustomAction);
            getpostalcode2.IconCompatParcelizer(true);
            Modifier modifierM73paddingVpY3zN4$default = PaddingKt.m73paddingVpY3zN4$default(SizeKt.write(companion3, 1.0f), f, 0.0f, 2);
            int i27 = i3 << 12;
            getpostalcode3 = getpostalcode2;
            FooterComponentKt.FooterComponent(str, flowUtilcreateFlowinlinedmap12.RatingCompat, flowUtilcreateFlowinlinedmap12.MediaDescriptionCompat, flowUtilcreateFlowinlinedmap12.MediaSessionCompatResultReceiverWrapper, r8lambdardpfsr94j4iebcwx_kpqzpm8k0, r8lambdaunavo3sxub_pc9xroryotnrlvsm, modifierM73paddingVpY3zN4$default, getpostalcode2, ((i3 >> 6) & 14) | (57344 & i27) | (i27 & 458752));
            getpostalcode3.IconCompatParcelizer(true);
        } else {
            getpostalcode3 = getpostalcode2;
            getpostalcode3.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
        }
        getHandleruiannotations gethandleruiannotationsMediaDescriptionCompat = getpostalcode3.MediaDescriptionCompat();
        if (gethandleruiannotationsMediaDescriptionCompat != null) {
            gethandleruiannotationsMediaDescriptionCompat.serializer = new r8lambdag2v_8ZFcgEbevxAiKW6LalaYkVg(r8lambdardpfsr94j4iebcwx_kpqzpm8k0, r8lambdaunavo3sxub_pc9xroryotnrlvsm, str, flowUtilcreateFlowinlinedmap12, modifier, i);
        }
    }
}
