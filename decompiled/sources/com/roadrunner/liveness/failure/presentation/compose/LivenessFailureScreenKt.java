package com.roadrunner.liveness.failure.presentation.compose;

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
import bo.app.d$$ExternalSyntheticOutline0;
import bo.app.m1$$ExternalSyntheticOutline0;
import coil3.ExtrasKt;
import com.huawei.hms.location.ActivityIdentificationData;
import com.roadrunner.designsystem.compose.theme.tokens.Dimensions;
import com.roadrunner.rrds.compose.component.dialog.messagedialog.MessagePopUpKt;
import com.roadrunner.tnc.TncComposableFactoryImpl$$ExternalSyntheticLambda0;
import io.sentry.SentryUUID;
import o.AndroidContentCaptureManagerCompanion;
import o.DragAndDropNodestartDragAndDropTransfer1;
import o.FlingCancellationException;
import o.ModalBottomSheetKtModalBottomSheet311;
import o.ModalBottomSheetYbuCTN8;
import o.PagerWrapperFlingBehavior;
import o.UiMediaScopeImpl;
import o.accessnotifyInvalidation;
import o.accessstopTrackingTable;
import o.buildMapping;
import o.collect;
import o.generatePOSTBodyString;
import o.getAddressCountry;
import o.getBirthDateFull;
import o.getHandleruiannotations;
import o.getNewPassword;
import o.getPostalCode;
import o.performMeasureDjhGOtQ;
import o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0;

/* JADX INFO: loaded from: classes3.dex */
public abstract class LivenessFailureScreenKt {
    private static int IconCompatParcelizer = 0;
    private static int write = 1;

    /* JADX WARN: Code duplicated, block: B:34:0x0090  */
    /* JADX WARN: Code duplicated, block: B:35:0x0093  */
    /* JADX WARN: Code duplicated, block: B:53:0x00d0  */
    /* JADX WARN: Code duplicated, block: B:54:0x00d3  */
    /* JADX WARN: Code duplicated, block: B:65:0x00f5  */
    /* JADX WARN: Code duplicated, block: B:66:0x00f8  */
    public static final void FailureScreen(accessstopTrackingTable accessstoptrackingtable, r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k0, r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k1, r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k2, r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k3, r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k4, Modifier modifier, getBirthDateFull getbirthdatefull, int i) {
        int i2;
        getPostalCode getpostalcode;
        getPostalCode getpostalcode2;
        int i3;
        int i4;
        int i5;
        int i6;
        boolean zIconCompatParcelizer;
        int i7 = 2 % 2;
        accessstoptrackingtable.getClass();
        r8lambdardpfsr94j4iebcwx_kpqzpm8k0.getClass();
        r8lambdardpfsr94j4iebcwx_kpqzpm8k1.getClass();
        r8lambdardpfsr94j4iebcwx_kpqzpm8k2.getClass();
        r8lambdardpfsr94j4iebcwx_kpqzpm8k3.getClass();
        r8lambdardpfsr94j4iebcwx_kpqzpm8k4.getClass();
        getPostalCode getpostalcode3 = (getPostalCode) getbirthdatefull;
        getpostalcode3.MediaSessionCompatQueueItem(2049985386);
        getAddressCountry getaddresscountry = getpostalcode3.read;
        if ((i & 6) == 0) {
            int i8 = IconCompatParcelizer + 103;
            write = i8 % Fields.SpotShadowColor;
            if (i8 % 2 != 0 ? (i & 8) != 0 : (i & 14) != 0) {
                zIconCompatParcelizer = getpostalcode3.IconCompatParcelizer(accessstoptrackingtable);
            } else {
                zIconCompatParcelizer = getpostalcode3.read(accessstoptrackingtable);
                int i9 = IconCompatParcelizer + 23;
                write = i9 % Fields.SpotShadowColor;
                int i10 = i9 % 2;
            }
            i2 = (zIconCompatParcelizer ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= getpostalcode3.IconCompatParcelizer(r8lambdardpfsr94j4iebcwx_kpqzpm8k0) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            int i11 = write + 9;
            IconCompatParcelizer = i11 % Fields.SpotShadowColor;
            if (i11 % 2 != 0) {
                int i12 = 0 / 0;
                if (getpostalcode3.IconCompatParcelizer(r8lambdardpfsr94j4iebcwx_kpqzpm8k1)) {
                    i6 = Fields.RotationX;
                } else {
                    i6 = Fields.SpotShadowColor;
                }
            } else if (getpostalcode3.IconCompatParcelizer(r8lambdardpfsr94j4iebcwx_kpqzpm8k1)) {
                i6 = Fields.RotationX;
            } else {
                i6 = Fields.SpotShadowColor;
            }
            i2 |= i6;
        }
        if ((i & 3072) == 0) {
            if (getpostalcode3.IconCompatParcelizer(r8lambdardpfsr94j4iebcwx_kpqzpm8k2)) {
                int i13 = write + 1;
                IconCompatParcelizer = i13 % Fields.SpotShadowColor;
                int i14 = i13 % 2;
                i5 = Fields.CameraDistance;
            } else {
                i5 = Fields.RotationZ;
            }
            i2 |= i5;
        }
        if ((i & 24576) == 0) {
            int i15 = IconCompatParcelizer + 61;
            write = i15 % Fields.SpotShadowColor;
            if (i15 % 2 == 0) {
                int i16 = 3 / 0;
                if (getpostalcode3.IconCompatParcelizer(r8lambdardpfsr94j4iebcwx_kpqzpm8k3)) {
                    i4 = Fields.Clip;
                } else {
                    i4 = 8192;
                }
            } else if (!getpostalcode3.IconCompatParcelizer(r8lambdardpfsr94j4iebcwx_kpqzpm8k3)) {
                i4 = 8192;
            } else {
                i4 = Fields.Clip;
            }
            i2 |= i4;
        }
        if ((196608 & i) == 0) {
            int i17 = write + 123;
            IconCompatParcelizer = i17 % Fields.SpotShadowColor;
            if (i17 % 2 != 0) {
                int i18 = 7 / 0;
                if (getpostalcode3.IconCompatParcelizer(r8lambdardpfsr94j4iebcwx_kpqzpm8k4)) {
                    i3 = Fields.RenderEffect;
                } else {
                    i3 = 65536;
                }
            } else if (getpostalcode3.IconCompatParcelizer(r8lambdardpfsr94j4iebcwx_kpqzpm8k4)) {
                i3 = Fields.RenderEffect;
            } else {
                i3 = 65536;
            }
            i2 |= i3;
        }
        if ((1572864 & i) == 0) {
            i2 |= getpostalcode3.read(modifier) ? 1048576 : Fields.BlendMode;
        }
        int i19 = i2;
        if (getpostalcode3.write(i19 & 1, (599187 & i19) != 599186)) {
            int i20 = IconCompatParcelizer + 17;
            write = i20 % Fields.SpotShadowColor;
            int i21 = i20 % 2;
            Modifier modifierThen = BackgroundKt.m20backgroundbw27NRU(modifier, ((buildMapping) getpostalcode3.write((getNewPassword) performMeasureDjhGOtQ.RemoteActionCompatParcelizer)).IconCompatParcelizer(), RectangleShapeKt.getRectangleShape()).then(SizeKt.read);
            FlingCancellationException flingCancellationException = Arrangement.MediaDescriptionCompat;
            Alignment.Companion companion = Alignment.Companion;
            ModalBottomSheetYbuCTN8 modalBottomSheetYbuCTN8Serializer = ModalBottomSheetKtModalBottomSheet311.serializer(flingCancellationException, companion.getStart(), getpostalcode3, 0);
            int iHashCode = Long.hashCode(getpostalcode3.RatingCompat);
            DragAndDropNodestartDragAndDropTransfer1 dragAndDropNodestartDragAndDropTransfer1Serializer = getpostalcode3.serializer();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(getpostalcode3, modifierThen);
            ComposeUiNode.Companion companion2 = ComposeUiNode.Companion;
            r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 constructor = companion2.getConstructor();
            if (getaddresscountry == null) {
                SentryUUID.write();
                throw null;
            }
            int i22 = IconCompatParcelizer + 3;
            write = i22 % Fields.SpotShadowColor;
            int i23 = i22 % 2;
            getpostalcode3.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg();
            if (!getpostalcode3.ComponentActivity) {
                getpostalcode3.r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28();
            } else {
                getpostalcode3.serializer(constructor);
            }
            c8$$ExternalSyntheticOutline0.m(companion2, getpostalcode3, modalBottomSheetYbuCTN8Serializer, getpostalcode3, dragAndDropNodestartDragAndDropTransfer1Serializer);
            AndroidContentCaptureManagerCompanion.write(getpostalcode3, modifierMaterializeModifier, m1$$ExternalSyntheticOutline0.m(companion2, getpostalcode3, Integer.valueOf(iHashCode), getpostalcode3));
            Modifier.Companion companion3 = Modifier.Companion;
            Modifier modifierM = d$$ExternalSyntheticOutline0.m(1.0f, true, companion3);
            float f = Dimensions.getAnimatedVisibility;
            Modifier modifierIconCompatParcelizer = PagerWrapperFlingBehavior.IconCompatParcelizer(PaddingKt.m73paddingVpY3zN4$default(modifierM, f, 0.0f, 2), PagerWrapperFlingBehavior.read(0, getpostalcode3, 1), false, 14);
            ModalBottomSheetYbuCTN8 modalBottomSheetYbuCTN8Serializer2 = ModalBottomSheetKtModalBottomSheet311.serializer(Arrangement.IconCompatParcelizer, companion.getStart(), getpostalcode3, 6);
            int iHashCode2 = Long.hashCode(getpostalcode3.RatingCompat);
            DragAndDropNodestartDragAndDropTransfer1 dragAndDropNodestartDragAndDropTransfer1Serializer2 = getpostalcode3.serializer();
            Modifier modifierMaterializeModifier2 = ComposedModifierKt.materializeModifier(getpostalcode3, modifierIconCompatParcelizer);
            r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 constructor2 = companion2.getConstructor();
            getpostalcode3.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg();
            if (getpostalcode3.ComponentActivity) {
                int i24 = write + 89;
                IconCompatParcelizer = i24 % Fields.SpotShadowColor;
                int i25 = i24 % 2;
                getpostalcode3.serializer(constructor2);
            } else {
                getpostalcode3.r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28();
            }
            c8$$ExternalSyntheticOutline0.m(companion2, getpostalcode3, modalBottomSheetYbuCTN8Serializer2, getpostalcode3, dragAndDropNodestartDragAndDropTransfer1Serializer2);
            AndroidContentCaptureManagerCompanion.write(getpostalcode3, modifierMaterializeModifier2, m1$$ExternalSyntheticOutline0.m(companion2, getpostalcode3, Integer.valueOf(iHashCode2), getpostalcode3));
            CenterComponentKt.CenterComponent(57344 & i19, getpostalcode3, null, accessstoptrackingtable.IconCompatParcelizer, accessstoptrackingtable.write, accessstoptrackingtable.RemoteActionCompatParcelizer, r8lambdardpfsr94j4iebcwx_kpqzpm8k3);
            generatePOSTBodyString generatepostbodystring = accessstoptrackingtable.serializer;
            if (generatepostbodystring == null) {
                getpostalcode3.serializer(756939107);
                getpostalcode3.IconCompatParcelizer(false);
            } else {
                getpostalcode3.serializer(756939108);
                collect.IconCompatParcelizer(generatepostbodystring, r8lambdardpfsr94j4iebcwx_kpqzpm8k2, r8lambdardpfsr94j4iebcwx_kpqzpm8k4, null, getpostalcode3, ((i19 >> 6) & 112) | ((i19 >> 9) & 896));
                getpostalcode3.IconCompatParcelizer(false);
            }
            accessnotifyInvalidation accessnotifyinvalidation = accessstoptrackingtable.read;
            if (accessnotifyinvalidation == null) {
                getpostalcode3.serializer(757265878);
                getpostalcode3.IconCompatParcelizer(false);
                getpostalcode2 = getpostalcode3;
            } else {
                getpostalcode3.serializer(757265879);
                getpostalcode2 = getpostalcode3;
                MessagePopUpKt.serializer(new generatePOSTBodyString(accessnotifyinvalidation.serializer, false, accessnotifyinvalidation.IconCompatParcelizer, null, null, accessnotifyinvalidation.write, ActivityIdentificationData.RUNNING, null), r8lambdardpfsr94j4iebcwx_kpqzpm8k2, companion3, false, ExtrasKt.write(1387492405, new TncComposableFactoryImpl$$ExternalSyntheticLambda0(1, accessnotifyinvalidation), getpostalcode3), null, null, r8lambdardpfsr94j4iebcwx_kpqzpm8k2, null, getpostalcode2, ((i19 >> 6) & 112) | 24960 | ((i19 << 12) & 29360128), 360);
                getpostalcode2.IconCompatParcelizer(false);
            }
            getpostalcode2.IconCompatParcelizer(true);
            getpostalcode = getpostalcode2;
            FooterComponentKt.FooterComponent(((i19 << 6) & 7168) | (i19 & 896), getpostalcode2, PaddingKt.write(companion3, f), accessstoptrackingtable.MediaBrowserCompatMediaItem, accessstoptrackingtable.MediaDescriptionCompat, r8lambdardpfsr94j4iebcwx_kpqzpm8k1, r8lambdardpfsr94j4iebcwx_kpqzpm8k0);
            getpostalcode.IconCompatParcelizer(true);
        } else {
            getpostalcode = getpostalcode3;
            getpostalcode.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
        }
        getHandleruiannotations gethandleruiannotationsMediaDescriptionCompat = getpostalcode.MediaDescriptionCompat();
        if (gethandleruiannotationsMediaDescriptionCompat != null) {
            gethandleruiannotationsMediaDescriptionCompat.serializer = new UiMediaScopeImpl(accessstoptrackingtable, r8lambdardpfsr94j4iebcwx_kpqzpm8k0, r8lambdardpfsr94j4iebcwx_kpqzpm8k1, r8lambdardpfsr94j4iebcwx_kpqzpm8k2, r8lambdardpfsr94j4iebcwx_kpqzpm8k3, r8lambdardpfsr94j4iebcwx_kpqzpm8k4, modifier, i, 12);
        }
    }
}
