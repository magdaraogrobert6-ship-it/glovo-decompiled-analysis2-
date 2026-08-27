package com.roadrunner.overlay.bubble.banner.presentation;

import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.material3.TextKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.ClipKt;
import androidx.compose.ui.graphics.Fields;
import androidx.compose.ui.graphics.RectangleShapeKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.text.TextStyle;
import bo.app.af$$ExternalSyntheticOutline0;
import bo.app.c8$$ExternalSyntheticOutline0;
import bo.app.m1$$ExternalSyntheticOutline0;
import coil3.ExtrasKt;
import com.airbnb.lottie.compose.RememberLottieCompositionKt;
import com.incognia.internal.pcn;
import com.logistics.rider.glovo.R;
import com.roadrunner.designsystem.compose.theme.tokens.Dimensions;
import com.roadrunner.rrds.compose.component.layouts.DividerKt;
import io.sentry.SentryUUID;
import o.AndroidContentCaptureManagerCompanion;
import o.AsyncImagePreviewHandlerCompanionDefault1;
import o.ColorModel;
import o.DragAndDropNodestartDragAndDropTransfer1;
import o.FlingCancellationException;
import o.ModalBottomSheetKtModalBottomSheet311;
import o.ModalBottomSheetYbuCTN8;
import o.StrokeJoinCompanion;
import o.TextFieldDefaults;
import o.accessgetXyzcp;
import o.buildMapping;
import o.getAddressCountry;
import o.getBirthDateFull;
import o.getCmykxdoWZVw;
import o.getHandleruiannotations;
import o.getNewPassword;
import o.getPostalCode;
import o.handleUrlOverridelambda1;
import o.isValidParameter;
import o.performLayout;
import o.performMeasureDjhGOtQ;
import o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0;
import o.r8lambdaZmWJ7_kmLiTuhtIga_c7SGMfvU;
import o.r8lambdafvzP3Wky1RLLzE56uVXaMHcvU;
import o.setCurrentSemanticsNodesui;
import o.supportingTextPaddinga9UjIt4material3default;

/* JADX INFO: loaded from: classes3.dex */
public abstract class OverlayVisibilityBannerKt {
    private static int IconCompatParcelizer = 0;
    private static int RemoteActionCompatParcelizer = 1;

    public static final void OverlayVisibilityBanner(AsyncImagePreviewHandlerCompanionDefault1 asyncImagePreviewHandlerCompanionDefault1, Modifier modifier, r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k0, getBirthDateFull getbirthdatefull, int i) {
        int i2;
        Modifier modifier2;
        boolean zIconCompatParcelizer;
        int i3 = 2 % 2;
        asyncImagePreviewHandlerCompanionDefault1.getClass();
        r8lambdardpfsr94j4iebcwx_kpqzpm8k0.getClass();
        getPostalCode getpostalcode = (getPostalCode) getbirthdatefull;
        getpostalcode.MediaSessionCompatQueueItem(-572841383);
        getAddressCountry getaddresscountry = getpostalcode.read;
        if ((i & 6) == 0) {
            int i4 = IconCompatParcelizer + 101;
            RemoteActionCompatParcelizer = i4 % Fields.SpotShadowColor;
            int i5 = i4 % 2;
            if ((i & 8) == 0) {
                zIconCompatParcelizer = getpostalcode.read(asyncImagePreviewHandlerCompanionDefault1);
                int i6 = RemoteActionCompatParcelizer + 97;
                IconCompatParcelizer = i6 % Fields.SpotShadowColor;
                int i7 = i6 % 2;
            } else {
                zIconCompatParcelizer = getpostalcode.IconCompatParcelizer(asyncImagePreviewHandlerCompanionDefault1);
            }
            i2 = (zIconCompatParcelizer ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        int i8 = i2 | 48;
        if ((i & 384) == 0) {
            i8 |= getpostalcode.IconCompatParcelizer(r8lambdardpfsr94j4iebcwx_kpqzpm8k0) ? Fields.RotationX : Fields.SpotShadowColor;
        }
        int i9 = i8;
        if (!getpostalcode.write(i9 & 1, (i9 & 147) != 146)) {
            getpostalcode.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
            modifier2 = modifier;
        } else {
            Modifier.Companion companion = Modifier.Companion;
            setCurrentSemanticsNodesui setcurrentsemanticsnodesui = performMeasureDjhGOtQ.RemoteActionCompatParcelizer;
            Object obj = null;
            DividerKt.read(0.0f, 0, 5, ((buildMapping) getpostalcode.write((getNewPassword) setcurrentsemanticsnodesui)).setPopupTheme(), getpostalcode, null);
            Modifier modifierWrite = SizeKt.write(companion, 1.0f);
            FlingCancellationException flingCancellationException = Arrangement.MediaDescriptionCompat;
            Alignment.Companion companion2 = Alignment.Companion;
            ModalBottomSheetYbuCTN8 modalBottomSheetYbuCTN8Serializer = ModalBottomSheetKtModalBottomSheet311.serializer(flingCancellationException, companion2.getStart(), getpostalcode, 0);
            int iHashCode = Long.hashCode(getpostalcode.RatingCompat);
            DragAndDropNodestartDragAndDropTransfer1 dragAndDropNodestartDragAndDropTransfer1Serializer = getpostalcode.serializer();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(getpostalcode, modifierWrite);
            ComposeUiNode.Companion companion3 = ComposeUiNode.Companion;
            r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 constructor = companion3.getConstructor();
            if (getaddresscountry == null) {
                SentryUUID.write();
                throw null;
            }
            getpostalcode.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg();
            if (getpostalcode.ComponentActivity) {
                getpostalcode.serializer(constructor);
            } else {
                getpostalcode.r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28();
            }
            c8$$ExternalSyntheticOutline0.m(companion3, getpostalcode, modalBottomSheetYbuCTN8Serializer, getpostalcode, dragAndDropNodestartDragAndDropTransfer1Serializer);
            AndroidContentCaptureManagerCompanion.write(getpostalcode, modifierMaterializeModifier, m1$$ExternalSyntheticOutline0.m(companion3, getpostalcode, Integer.valueOf(iHashCode), getpostalcode));
            float f = Dimensions.setTabContainer;
            Modifier modifierWrite2 = PaddingKt.write(BackgroundKt.m20backgroundbw27NRU(ClipKt.clip(PaddingKt.m74paddingqDBjuR0$default(PaddingKt.m73paddingVpY3zN4$default(companion, f, 0.0f, 2), 0.0f, f, 0.0f, Dimensions.getAnimatedVisibility, 5), RoundedCornerShapeKt.IconCompatParcelizer(Dimensions.setChecked)), ((buildMapping) getpostalcode.write((getNewPassword) setcurrentsemanticsnodesui)).serializer(), RectangleShapeKt.getRectangleShape()), f);
            MeasurePolicy measurePolicy = BoxKt.read(companion2.getTopStart(), false);
            int iHashCode2 = Long.hashCode(getpostalcode.RatingCompat);
            DragAndDropNodestartDragAndDropTransfer1 dragAndDropNodestartDragAndDropTransfer1Serializer2 = getpostalcode.serializer();
            Modifier modifierMaterializeModifier2 = ComposedModifierKt.materializeModifier(getpostalcode, modifierWrite2);
            r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 constructor2 = companion3.getConstructor();
            getpostalcode.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg();
            if (getpostalcode.ComponentActivity) {
                getpostalcode.serializer(constructor2);
                int i10 = RemoteActionCompatParcelizer + 111;
                IconCompatParcelizer = i10 % Fields.SpotShadowColor;
                int i11 = i10 % 2;
            } else {
                getpostalcode.r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28();
                int i12 = IconCompatParcelizer + 43;
                RemoteActionCompatParcelizer = i12 % Fields.SpotShadowColor;
                if (i12 % 2 == 0) {
                    int i13 = 4 % 4;
                }
            }
            af$$ExternalSyntheticOutline0.m(companion3, getpostalcode, measurePolicy, getpostalcode, dragAndDropNodestartDragAndDropTransfer1Serializer2);
            AndroidContentCaptureManagerCompanion.write(getpostalcode, modifierMaterializeModifier2, m1$$ExternalSyntheticOutline0.m(companion3, getpostalcode, Integer.valueOf(iHashCode2), getpostalcode));
            ModalBottomSheetYbuCTN8 modalBottomSheetYbuCTN8Serializer2 = ModalBottomSheetKtModalBottomSheet311.serializer(flingCancellationException, companion2.getStart(), getpostalcode, 0);
            int iHashCode3 = Long.hashCode(getpostalcode.RatingCompat);
            DragAndDropNodestartDragAndDropTransfer1 dragAndDropNodestartDragAndDropTransfer1Serializer3 = getpostalcode.serializer();
            Modifier modifierMaterializeModifier3 = ComposedModifierKt.materializeModifier(getpostalcode, companion);
            r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 constructor3 = companion3.getConstructor();
            getpostalcode.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg();
            if (getpostalcode.ComponentActivity) {
                getpostalcode.serializer(constructor3);
            } else {
                getpostalcode.r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28();
            }
            c8$$ExternalSyntheticOutline0.m(companion3, getpostalcode, modalBottomSheetYbuCTN8Serializer2, getpostalcode, dragAndDropNodestartDragAndDropTransfer1Serializer3);
            AndroidContentCaptureManagerCompanion.write(getpostalcode, modifierMaterializeModifier3, m1$$ExternalSyntheticOutline0.m(companion3, getpostalcode, Integer.valueOf(iHashCode3), getpostalcode));
            accessgetXyzcp accessgetxyzcpIconCompatParcelizer = RememberLottieCompositionKt.IconCompatParcelizer(new getCmykxdoWZVw(R.raw.enable_overlay), getpostalcode);
            supportingTextPaddinga9UjIt4material3default supportingtextpaddinga9ujit4material3defaultSerializer = TextFieldDefaults.serializer(Arrangement.MediaBrowserCompatMediaItem, companion2.getTop(), getpostalcode, 0);
            int iHashCode4 = Long.hashCode(getpostalcode.RatingCompat);
            DragAndDropNodestartDragAndDropTransfer1 dragAndDropNodestartDragAndDropTransfer1Serializer4 = getpostalcode.serializer();
            Modifier modifierMaterializeModifier4 = ComposedModifierKt.materializeModifier(getpostalcode, companion);
            r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 constructor4 = companion3.getConstructor();
            getpostalcode.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg();
            if (getpostalcode.ComponentActivity) {
                int i14 = RemoteActionCompatParcelizer + 9;
                IconCompatParcelizer = i14 % Fields.SpotShadowColor;
                if (i14 % 2 != 0) {
                    getpostalcode.serializer(constructor4);
                    obj.hashCode();
                    throw null;
                }
                getpostalcode.serializer(constructor4);
            } else {
                getpostalcode.r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28();
            }
            r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.read(companion3, getpostalcode, supportingtextpaddinga9ujit4material3defaultSerializer, getpostalcode, dragAndDropNodestartDragAndDropTransfer1Serializer4);
            AndroidContentCaptureManagerCompanion.write(getpostalcode, modifierMaterializeModifier4, m1$$ExternalSyntheticOutline0.m(companion3, getpostalcode, Integer.valueOf(iHashCode4), getpostalcode));
            ColorModel.read((StrokeJoinCompanion) accessgetxyzcpIconCompatParcelizer.getValue(), SizeKt.m83size3ABfNKs(companion, Dimensions.peekAvailableContext), Integer.MAX_VALUE, false, null, null, getpostalcode, 1572864, 0, 0, 4194236);
            Object[] objArr = {getpostalcode, SizeKt.m86width3ABfNKs(companion, f)};
            ExtrasKt.read(913837329, handleUrlOverridelambda1.RemoteActionCompatParcelizer(), handleUrlOverridelambda1.RemoteActionCompatParcelizer(), -913837326, handleUrlOverridelambda1.RemoteActionCompatParcelizer(), handleUrlOverridelambda1.RemoteActionCompatParcelizer(), objArr);
            ModalBottomSheetYbuCTN8 modalBottomSheetYbuCTN8Serializer3 = ModalBottomSheetKtModalBottomSheet311.serializer(flingCancellationException, companion2.getStart(), getpostalcode, 0);
            int iHashCode5 = Long.hashCode(getpostalcode.RatingCompat);
            DragAndDropNodestartDragAndDropTransfer1 dragAndDropNodestartDragAndDropTransfer1Serializer5 = getpostalcode.serializer();
            Modifier modifierMaterializeModifier5 = ComposedModifierKt.materializeModifier(getpostalcode, companion);
            r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 constructor5 = companion3.getConstructor();
            getpostalcode.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg();
            if (getpostalcode.ComponentActivity) {
                getpostalcode.serializer(constructor5);
            } else {
                getpostalcode.r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28();
            }
            c8$$ExternalSyntheticOutline0.m(companion3, getpostalcode, modalBottomSheetYbuCTN8Serializer3, getpostalcode, dragAndDropNodestartDragAndDropTransfer1Serializer5);
            AndroidContentCaptureManagerCompanion.write(getpostalcode, modifierMaterializeModifier5, m1$$ExternalSyntheticOutline0.m(companion3, getpostalcode, Integer.valueOf(iHashCode5), getpostalcode));
            TextKt.m131TextNvy7gAk(asyncImagePreviewHandlerCompanionDefault1.read, null, ((buildMapping) getpostalcode.write((getNewPassword) setcurrentsemanticsnodesui)).setPresenter(), 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, (TextStyle) performLayout.read(925764871, pcn.serializer(), new Object[0], -925764870, pcn.serializer(), pcn.serializer(), pcn.serializer()), getpostalcode, 0, 0, 131066);
            Object[] objArr2 = {getpostalcode, SizeKt.m75height3ABfNKs(companion, Dimensions.setSplitBackground)};
            ExtrasKt.read(913837329, handleUrlOverridelambda1.RemoteActionCompatParcelizer(), handleUrlOverridelambda1.RemoteActionCompatParcelizer(), -913837326, handleUrlOverridelambda1.RemoteActionCompatParcelizer(), handleUrlOverridelambda1.RemoteActionCompatParcelizer(), objArr2);
            modifier2 = companion;
            TextKt.m131TextNvy7gAk(asyncImagePreviewHandlerCompanionDefault1.IconCompatParcelizer, null, ((buildMapping) getpostalcode.write((getNewPassword) setcurrentsemanticsnodesui)).setPresenter(), 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, performLayout.IconCompatParcelizer(), getpostalcode, 0, 0, 131066);
            getpostalcode.IconCompatParcelizer(true);
            getpostalcode.IconCompatParcelizer(true);
            Object[] objArr3 = {getpostalcode, SizeKt.m75height3ABfNKs(modifier2, f)};
            ExtrasKt.read(913837329, handleUrlOverridelambda1.RemoteActionCompatParcelizer(), handleUrlOverridelambda1.RemoteActionCompatParcelizer(), -913837326, handleUrlOverridelambda1.RemoteActionCompatParcelizer(), handleUrlOverridelambda1.RemoteActionCompatParcelizer(), objArr3);
            isValidParameter.RemoteActionCompatParcelizer(asyncImagePreviewHandlerCompanionDefault1.serializer, r8lambdardpfsr94j4iebcwx_kpqzpm8k0, SizeKt.write(modifier2, 1.0f), false, false, null, null, null, null, getpostalcode, ((i9 >> 3) & 112) | 384, 1016);
            af$$ExternalSyntheticOutline0.m(getpostalcode, true, true, true);
        }
        getHandleruiannotations gethandleruiannotationsMediaDescriptionCompat = getpostalcode.MediaDescriptionCompat();
        if (gethandleruiannotationsMediaDescriptionCompat != null) {
            gethandleruiannotationsMediaDescriptionCompat.serializer = new r8lambdaZmWJ7_kmLiTuhtIga_c7SGMfvU(asyncImagePreviewHandlerCompanionDefault1, modifier2, r8lambdardpfsr94j4iebcwx_kpqzpm8k0, i, 2);
        }
    }
}
