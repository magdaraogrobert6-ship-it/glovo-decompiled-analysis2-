package com.roadrunner.delivery.accept.backToBackOrder.presentation.banner;

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
import androidx.compose.ui.text.PlatformTextStyle;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.unit.Dp;
import bo.app.af$$ExternalSyntheticOutline0;
import bo.app.b1$$ExternalSyntheticLambda0;
import bo.app.c8$$ExternalSyntheticOutline0;
import bo.app.m1$$ExternalSyntheticOutline0;
import coil3.ExtrasKt;
import com.airbnb.lottie.compose.RememberLottieCompositionKt;
import com.incognia.internal.pcn;
import com.roadrunner.designsystem.compose.theme.tokens.Dimensions;
import com.roadrunner.rrds.compose.ModifierAnimatedGradientBorderKt;
import io.sentry.SentryUUID;
import o.AndroidContentCaptureManager;
import o.AndroidContentCaptureManagerCompanion;
import o.AndroidTextContextMenuToolbarProviderTextActionModeCallbackImpl;
import o.ColorModel;
import o.DragAndDropNodestartDragAndDropTransfer1;
import o.ModalBottomSheetKtModalBottomSheet311;
import o.ModalBottomSheetYbuCTN8;
import o.StrokeJoinCompanion;
import o.TextFieldDefaults;
import o.TextLinkStyles;
import o.buildMapping;
import o.canReadPlayIds;
import o.createFromParcel;
import o.getAddressCountry;
import o.getBirthDateFull;
import o.getCmykxdoWZVw;
import o.getCreditCardExpirationMonth;
import o.getHandleruiannotations;
import o.getNewPassword;
import o.getPhoneNumberNational;
import o.getPostalCode;
import o.handleUrlOverridelambda1;
import o.performLayout;
import o.performMeasureDjhGOtQ;
import o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0;
import o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM;
import o.r8lambdafvzP3Wky1RLLzE56uVXaMHcvU;
import o.setCurrentSemanticsNodesui;
import o.supportingTextPaddinga9UjIt4material3default;

/* JADX INFO: loaded from: classes3.dex */
public abstract class BackToBackOrderBannerKt {
    private static int IconCompatParcelizer = 0;
    private static int RemoteActionCompatParcelizer = 0;
    private static int read = 1;
    public static final float serializer;
    private static int write = 1;

    static {
        float f = Dimensions.read;
        serializer = Dp.m3673constructorimpl(Dp.m3673constructorimpl(1.0f) + Dimensions.enterPictureInPictureMode);
        int i = read + 113;
        IconCompatParcelizer = i % Fields.SpotShadowColor;
        int i2 = i % 2;
    }

    /* JADX WARN: Code duplicated, block: B:52:0x00d5  */
    /* JADX WARN: Code duplicated, block: B:66:0x0160  */
    /* JADX WARN: Code duplicated, block: B:68:0x0167  */
    /* JADX WARN: Code duplicated, block: B:69:0x016b  */
    /* JADX WARN: Code duplicated, block: B:72:0x01c7  */
    /* JADX WARN: Code duplicated, block: B:73:0x01cb  */
    /* JADX WARN: Code duplicated, block: B:76:0x025b  */
    /* JADX WARN: Code duplicated, block: B:77:0x025f  */
    /* JADX WARN: Code duplicated, block: B:79:0x0354  */
    public static final void BackToBackOrderBanner(int i, int i2, getBirthDateFull getbirthdatefull, Modifier modifier, String str, String str2, r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k0, r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k1) {
        int i3;
        Modifier modifier2;
        int i4;
        Alignment.Companion companion;
        MeasurePolicy measurePolicy;
        int iHashCode;
        DragAndDropNodestartDragAndDropTransfer1 dragAndDropNodestartDragAndDropTransfer1Serializer;
        Modifier modifierMaterializeModifier;
        ComposeUiNode.Companion companion2;
        r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 constructor;
        r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 constructor2;
        r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 constructor3;
        int i5;
        int i6 = 2 % 2;
        str.getClass();
        str2.getClass();
        r8lambdardpfsr94j4iebcwx_kpqzpm8k0.getClass();
        r8lambdardpfsr94j4iebcwx_kpqzpm8k1.getClass();
        getPostalCode getpostalcode = (getPostalCode) getbirthdatefull;
        getpostalcode.MediaSessionCompatQueueItem(1944988486);
        getAddressCountry getaddresscountry = getpostalcode.read;
        if ((i2 & 6) == 0) {
            i3 = (getpostalcode.read(str) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= getpostalcode.read(str2) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            if (getpostalcode.read(i)) {
                int i7 = write + 85;
                RemoteActionCompatParcelizer = i7 % Fields.SpotShadowColor;
                int i8 = i7 % 2;
                i5 = Fields.RotationX;
            } else {
                i5 = Fields.SpotShadowColor;
            }
            i3 |= i5;
        }
        if ((i2 & 3072) == 0) {
            int i9 = RemoteActionCompatParcelizer + 5;
            write = i9 % Fields.SpotShadowColor;
            int i10 = i9 % 2;
            i3 |= getpostalcode.IconCompatParcelizer(r8lambdardpfsr94j4iebcwx_kpqzpm8k0) ? 2048 : Fields.RotationZ;
        }
        if ((i2 & 24576) == 0) {
            int i11 = write + 69;
            RemoteActionCompatParcelizer = i11 % Fields.SpotShadowColor;
            int i12 = i11 % 2;
            i3 |= getpostalcode.IconCompatParcelizer(r8lambdardpfsr94j4iebcwx_kpqzpm8k1) ? 16384 : 8192;
        }
        int i13 = i3 | 196608;
        if (getpostalcode.write(i13 & 1, (74899 & i13) != 74898)) {
            int i14 = write + 83;
            RemoteActionCompatParcelizer = i14 % Fields.SpotShadowColor;
            int i15 = i14 % 2;
            Modifier.Companion companion3 = Modifier.Companion;
            boolean z = (57344 & i13) == 16384;
            Object objComponentActivity = getpostalcode.ComponentActivity();
            AndroidContentCaptureManager androidContentCaptureManager = getCreditCardExpirationMonth.write;
            if (z) {
                objComponentActivity = new AndroidTextContextMenuToolbarProviderTextActionModeCallbackImpl(5, r8lambdardpfsr94j4iebcwx_kpqzpm8k1);
                getpostalcode.write(objComponentActivity);
            } else {
                int i16 = write + 85;
                RemoteActionCompatParcelizer = i16 % Fields.SpotShadowColor;
                int i17 = i16 % 2;
                if (objComponentActivity == androidContentCaptureManager) {
                    objComponentActivity = new AndroidTextContextMenuToolbarProviderTextActionModeCallbackImpl(5, r8lambdardpfsr94j4iebcwx_kpqzpm8k1);
                    getpostalcode.write(objComponentActivity);
                }
            }
            getPhoneNumberNational.serializer(createFromParcel.INSTANCE, (r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) objComponentActivity, getpostalcode);
            Modifier modifierSerializer = SizeKt.serializer(SizeKt.write(companion3, 1.0f), (Alignment.Vertical) null, 3);
            float f = Dimensions.setActionBarVisibilityCallback;
            Modifier modifierSerializer2 = ModifierAnimatedGradientBorderKt.serializer(PaddingKt.m73paddingVpY3zN4$default(modifierSerializer, f, 0.0f, 2), RoundedCornerShapeKt.IconCompatParcelizer(serializer), 0.0f, getpostalcode, 6);
            modifierSerializer2.getClass();
            boolean z2 = (i13 & 7168) == 2048;
            Object objComponentActivity2 = getpostalcode.ComponentActivity();
            if (z2) {
                i4 = 2;
            } else {
                int i18 = write + 81;
                RemoteActionCompatParcelizer = i18 % Fields.SpotShadowColor;
                i4 = 2;
                int i19 = i18 % 2;
                if (objComponentActivity2 == androidContentCaptureManager) {
                }
                Modifier modifier3 = canReadPlayIds.read(modifierSerializer2, null, false, null, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) objComponentActivity2, getpostalcode, 63);
                companion = Alignment.Companion;
                measurePolicy = BoxKt.read(companion.getTopStart(), false);
                iHashCode = Long.hashCode(getpostalcode.RatingCompat);
                dragAndDropNodestartDragAndDropTransfer1Serializer = getpostalcode.serializer();
                modifierMaterializeModifier = ComposedModifierKt.materializeModifier(getpostalcode, modifier3);
                companion2 = ComposeUiNode.Companion;
                constructor = companion2.getConstructor();
                if (getaddresscountry != null) {
                    SentryUUID.write();
                    throw null;
                }
                getpostalcode.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg();
                if (getpostalcode.ComponentActivity) {
                    getpostalcode.serializer(constructor);
                } else {
                    getpostalcode.r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28();
                }
                af$$ExternalSyntheticOutline0.m(companion2, getpostalcode, measurePolicy, getpostalcode, dragAndDropNodestartDragAndDropTransfer1Serializer);
                AndroidContentCaptureManagerCompanion.write(getpostalcode, modifierMaterializeModifier, m1$$ExternalSyntheticOutline0.m(companion2, getpostalcode, Integer.valueOf(iHashCode), getpostalcode));
                Modifier modifierClip = ClipKt.clip(SizeKt.write(companion3, 1.0f), RoundedCornerShapeKt.IconCompatParcelizer(Dimensions.enterPictureInPictureMode));
                setCurrentSemanticsNodesui setcurrentsemanticsnodesui = performMeasureDjhGOtQ.RemoteActionCompatParcelizer;
                Modifier modifierRemoteActionCompatParcelizer = PaddingKt.RemoteActionCompatParcelizer(BackgroundKt.m20backgroundbw27NRU(modifierClip, ((buildMapping) getpostalcode.write((getNewPassword) setcurrentsemanticsnodesui)).IconCompatParcelizer(), RectangleShapeKt.getRectangleShape()), f, Dimensions.getNestedScrollAxes);
                supportingTextPaddinga9UjIt4material3default supportingtextpaddinga9ujit4material3defaultSerializer = TextFieldDefaults.serializer(Arrangement.MediaBrowserCompatMediaItem, companion.getCenterVertically(), getpostalcode, 48);
                int iHashCode2 = Long.hashCode(getpostalcode.RatingCompat);
                DragAndDropNodestartDragAndDropTransfer1 dragAndDropNodestartDragAndDropTransfer1Serializer2 = getpostalcode.serializer();
                Modifier modifierMaterializeModifier2 = ComposedModifierKt.materializeModifier(getpostalcode, modifierRemoteActionCompatParcelizer);
                constructor2 = companion2.getConstructor();
                getpostalcode.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg();
                if (getpostalcode.ComponentActivity) {
                    getpostalcode.serializer(constructor2);
                } else {
                    getpostalcode.r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28();
                }
                r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.read(companion2, getpostalcode, supportingtextpaddinga9ujit4material3defaultSerializer, getpostalcode, dragAndDropNodestartDragAndDropTransfer1Serializer2);
                AndroidContentCaptureManagerCompanion.write(getpostalcode, modifierMaterializeModifier2, m1$$ExternalSyntheticOutline0.m(companion2, getpostalcode, Integer.valueOf(iHashCode2), getpostalcode));
                ColorModel.read((StrokeJoinCompanion) RememberLottieCompositionKt.IconCompatParcelizer(new getCmykxdoWZVw(i), getpostalcode).getValue(), SizeKt.m83size3ABfNKs(companion3, Dimensions.addOnPictureInPictureUiStateChangedListener), Integer.MAX_VALUE, false, null, null, getpostalcode, 1572864, 0, 0, 4194236);
                Object[] objArr = {getpostalcode, SizeKt.m86width3ABfNKs(companion3, f)};
                ExtrasKt.read(913837329, handleUrlOverridelambda1.RemoteActionCompatParcelizer(), handleUrlOverridelambda1.RemoteActionCompatParcelizer(), -913837326, handleUrlOverridelambda1.RemoteActionCompatParcelizer(), handleUrlOverridelambda1.RemoteActionCompatParcelizer(), objArr);
                ModalBottomSheetYbuCTN8 modalBottomSheetYbuCTN8Serializer = ModalBottomSheetKtModalBottomSheet311.serializer(Arrangement.MediaDescriptionCompat, companion.getStart(), getpostalcode, 0);
                int iHashCode3 = Long.hashCode(getpostalcode.RatingCompat);
                DragAndDropNodestartDragAndDropTransfer1 dragAndDropNodestartDragAndDropTransfer1Serializer3 = getpostalcode.serializer();
                Modifier modifierMaterializeModifier3 = ComposedModifierKt.materializeModifier(getpostalcode, companion3);
                constructor3 = companion2.getConstructor();
                getpostalcode.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg();
                if (getpostalcode.ComponentActivity) {
                    getpostalcode.serializer(constructor3);
                } else {
                    getpostalcode.r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28();
                }
                c8$$ExternalSyntheticOutline0.m(companion2, getpostalcode, modalBottomSheetYbuCTN8Serializer, getpostalcode, dragAndDropNodestartDragAndDropTransfer1Serializer3);
                AndroidContentCaptureManagerCompanion.write(getpostalcode, modifierMaterializeModifier3, m1$$ExternalSyntheticOutline0.m(companion2, getpostalcode, Integer.valueOf(iHashCode3), getpostalcode));
                TextStyle textStyle = (TextStyle) performLayout.read(925764871, pcn.serializer(), new Object[0], -925764870, pcn.serializer(), pcn.serializer(), pcn.serializer());
                TextKt.m131TextNvy7gAk(str, null, ((buildMapping) getpostalcode.write((getNewPassword) setcurrentsemanticsnodesui)).setPresenter(), 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, textStyle.m3102copyp1EtxEg((15204351 & 1) != 0 ? textStyle.spanStyle.m3016getColor0d7_KjU() : 0L, (15204351 & 2) != 0 ? textStyle.spanStyle.m3017getFontSizeXSAIIZE() : 0L, (15204351 & 4) != 0 ? textStyle.spanStyle.getFontWeight() : null, (15204351 & 8) != 0 ? textStyle.spanStyle.m3018getFontStyle4Lr2A7w() : null, (15204351 & 16) != 0 ? textStyle.spanStyle.m3019getFontSynthesisZQGJjVo() : null, (15204351 & 32) != 0 ? textStyle.spanStyle.getFontFamily() : null, (15204351 & 64) != 0 ? textStyle.spanStyle.getFontFeatureSettings() : null, (15204351 & Fields.SpotShadowColor) != 0 ? textStyle.spanStyle.m3020getLetterSpacingXSAIIZE() : 0L, (15204351 & Fields.RotationX) != 0 ? textStyle.spanStyle.m3015getBaselineShift5SSeXJ0() : null, (15204351 & Fields.RotationY) != 0 ? textStyle.spanStyle.getTextGeometricTransform() : null, (15204351 & Fields.RotationZ) != 0 ? textStyle.spanStyle.getLocaleList() : null, (15204351 & Fields.CameraDistance) != 0 ? textStyle.spanStyle.m3014getBackground0d7_KjU() : 0L, (15204351 & Fields.TransformOrigin) != 0 ? textStyle.spanStyle.getTextDecoration() : null, (15204351 & 8192) != 0 ? textStyle.spanStyle.getShadow() : null, (15204351 & Fields.Clip) != 0 ? textStyle.spanStyle.getDrawStyle() : null, (15204351 & Fields.CompositingStrategy) != 0 ? textStyle.paragraphStyle.m2955getTextAligne0LSkKk() : 0, (15204351 & 65536) != 0 ? textStyle.paragraphStyle.m2957getTextDirections_7Xco() : 0, (15204351 & Fields.RenderEffect) != 0 ? textStyle.paragraphStyle.m2953getLineHeightXSAIIZE() : 0L, (15204351 & Fields.ColorFilter) != 0 ? textStyle.paragraphStyle.getTextIndent() : null, (15204351 & Fields.BlendMode) != 0 ? textStyle.platformStyle : new PlatformTextStyle(true), (15204351 & 1048576) != 0 ? textStyle.paragraphStyle.getLineHeightStyle() : null, (15204351 & 2097152) != 0 ? textStyle.paragraphStyle.m2952getLineBreakrAG3T2k() : 0, (15204351 & 4194304) != 0 ? textStyle.paragraphStyle.m2950getHyphensvmbZdU8() : 0, (15204351 & 8388608) != 0 ? textStyle.paragraphStyle.getTextMotion() : null), getpostalcode, i13 & 14, 0, 131066);
                TextStyle textStyleRemoteActionCompatParcelizer = performLayout.RemoteActionCompatParcelizer();
                TextKt.m131TextNvy7gAk(str2, null, ((buildMapping) getpostalcode.write((getNewPassword) setcurrentsemanticsnodesui)).setPresenter(), 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, textStyleRemoteActionCompatParcelizer.m3102copyp1EtxEg((15204351 & 1) != 0 ? textStyleRemoteActionCompatParcelizer.spanStyle.m3016getColor0d7_KjU() : 0L, (15204351 & 2) != 0 ? textStyleRemoteActionCompatParcelizer.spanStyle.m3017getFontSizeXSAIIZE() : 0L, (15204351 & 4) != 0 ? textStyleRemoteActionCompatParcelizer.spanStyle.getFontWeight() : null, (15204351 & 8) != 0 ? textStyleRemoteActionCompatParcelizer.spanStyle.m3018getFontStyle4Lr2A7w() : null, (15204351 & 16) != 0 ? textStyleRemoteActionCompatParcelizer.spanStyle.m3019getFontSynthesisZQGJjVo() : null, (15204351 & 32) != 0 ? textStyleRemoteActionCompatParcelizer.spanStyle.getFontFamily() : null, (15204351 & 64) != 0 ? textStyleRemoteActionCompatParcelizer.spanStyle.getFontFeatureSettings() : null, (15204351 & Fields.SpotShadowColor) != 0 ? textStyleRemoteActionCompatParcelizer.spanStyle.m3020getLetterSpacingXSAIIZE() : 0L, (15204351 & Fields.RotationX) != 0 ? textStyleRemoteActionCompatParcelizer.spanStyle.m3015getBaselineShift5SSeXJ0() : null, (15204351 & Fields.RotationY) != 0 ? textStyleRemoteActionCompatParcelizer.spanStyle.getTextGeometricTransform() : null, (15204351 & Fields.RotationZ) != 0 ? textStyleRemoteActionCompatParcelizer.spanStyle.getLocaleList() : null, (15204351 & Fields.CameraDistance) != 0 ? textStyleRemoteActionCompatParcelizer.spanStyle.m3014getBackground0d7_KjU() : 0L, (15204351 & Fields.TransformOrigin) != 0 ? textStyleRemoteActionCompatParcelizer.spanStyle.getTextDecoration() : null, (15204351 & 8192) != 0 ? textStyleRemoteActionCompatParcelizer.spanStyle.getShadow() : null, (15204351 & Fields.Clip) != 0 ? textStyleRemoteActionCompatParcelizer.spanStyle.getDrawStyle() : null, (15204351 & Fields.CompositingStrategy) != 0 ? textStyleRemoteActionCompatParcelizer.paragraphStyle.m2955getTextAligne0LSkKk() : 0, (15204351 & 65536) != 0 ? textStyleRemoteActionCompatParcelizer.paragraphStyle.m2957getTextDirections_7Xco() : 0, (15204351 & Fields.RenderEffect) != 0 ? textStyleRemoteActionCompatParcelizer.paragraphStyle.m2953getLineHeightXSAIIZE() : 0L, (15204351 & Fields.ColorFilter) != 0 ? textStyleRemoteActionCompatParcelizer.paragraphStyle.getTextIndent() : null, (15204351 & Fields.BlendMode) != 0 ? textStyleRemoteActionCompatParcelizer.platformStyle : new PlatformTextStyle(true), (15204351 & 1048576) != 0 ? textStyleRemoteActionCompatParcelizer.paragraphStyle.getLineHeightStyle() : null, (15204351 & 2097152) != 0 ? textStyleRemoteActionCompatParcelizer.paragraphStyle.m2952getLineBreakrAG3T2k() : 0, (15204351 & 4194304) != 0 ? textStyleRemoteActionCompatParcelizer.paragraphStyle.m2950getHyphensvmbZdU8() : 0, (15204351 & 8388608) != 0 ? textStyleRemoteActionCompatParcelizer.paragraphStyle.getTextMotion() : null), getpostalcode, (i13 >> 3) & 14, 0, 131066);
                af$$ExternalSyntheticOutline0.m(getpostalcode, true, true, true);
                modifier2 = companion3;
            }
            objComponentActivity2 = new b1$$ExternalSyntheticLambda0(i4, r8lambdardpfsr94j4iebcwx_kpqzpm8k0);
            getpostalcode.write(objComponentActivity2);
            Modifier modifier4 = canReadPlayIds.read(modifierSerializer2, null, false, null, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) objComponentActivity2, getpostalcode, 63);
            companion = Alignment.Companion;
            measurePolicy = BoxKt.read(companion.getTopStart(), false);
            iHashCode = Long.hashCode(getpostalcode.RatingCompat);
            dragAndDropNodestartDragAndDropTransfer1Serializer = getpostalcode.serializer();
            modifierMaterializeModifier = ComposedModifierKt.materializeModifier(getpostalcode, modifier4);
            companion2 = ComposeUiNode.Companion;
            constructor = companion2.getConstructor();
            if (getaddresscountry != null) {
                SentryUUID.write();
                throw null;
            }
            getpostalcode.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg();
            if (getpostalcode.ComponentActivity) {
                getpostalcode.serializer(constructor);
            } else {
                getpostalcode.r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28();
            }
            af$$ExternalSyntheticOutline0.m(companion2, getpostalcode, measurePolicy, getpostalcode, dragAndDropNodestartDragAndDropTransfer1Serializer);
            AndroidContentCaptureManagerCompanion.write(getpostalcode, modifierMaterializeModifier, m1$$ExternalSyntheticOutline0.m(companion2, getpostalcode, Integer.valueOf(iHashCode), getpostalcode));
            Modifier modifierClip2 = ClipKt.clip(SizeKt.write(companion3, 1.0f), RoundedCornerShapeKt.IconCompatParcelizer(Dimensions.enterPictureInPictureMode));
            setCurrentSemanticsNodesui setcurrentsemanticsnodesui2 = performMeasureDjhGOtQ.RemoteActionCompatParcelizer;
            Modifier modifierRemoteActionCompatParcelizer2 = PaddingKt.RemoteActionCompatParcelizer(BackgroundKt.m20backgroundbw27NRU(modifierClip2, ((buildMapping) getpostalcode.write((getNewPassword) setcurrentsemanticsnodesui2)).IconCompatParcelizer(), RectangleShapeKt.getRectangleShape()), f, Dimensions.getNestedScrollAxes);
            supportingTextPaddinga9UjIt4material3default supportingtextpaddinga9ujit4material3defaultSerializer2 = TextFieldDefaults.serializer(Arrangement.MediaBrowserCompatMediaItem, companion.getCenterVertically(), getpostalcode, 48);
            int iHashCode4 = Long.hashCode(getpostalcode.RatingCompat);
            DragAndDropNodestartDragAndDropTransfer1 dragAndDropNodestartDragAndDropTransfer1Serializer4 = getpostalcode.serializer();
            Modifier modifierMaterializeModifier4 = ComposedModifierKt.materializeModifier(getpostalcode, modifierRemoteActionCompatParcelizer2);
            constructor2 = companion2.getConstructor();
            getpostalcode.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg();
            if (getpostalcode.ComponentActivity) {
                getpostalcode.serializer(constructor2);
            } else {
                getpostalcode.r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28();
            }
            r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.read(companion2, getpostalcode, supportingtextpaddinga9ujit4material3defaultSerializer2, getpostalcode, dragAndDropNodestartDragAndDropTransfer1Serializer4);
            AndroidContentCaptureManagerCompanion.write(getpostalcode, modifierMaterializeModifier4, m1$$ExternalSyntheticOutline0.m(companion2, getpostalcode, Integer.valueOf(iHashCode4), getpostalcode));
            ColorModel.read((StrokeJoinCompanion) RememberLottieCompositionKt.IconCompatParcelizer(new getCmykxdoWZVw(i), getpostalcode).getValue(), SizeKt.m83size3ABfNKs(companion3, Dimensions.addOnPictureInPictureUiStateChangedListener), Integer.MAX_VALUE, false, null, null, getpostalcode, 1572864, 0, 0, 4194236);
            Object[] objArr2 = {getpostalcode, SizeKt.m86width3ABfNKs(companion3, f)};
            ExtrasKt.read(913837329, handleUrlOverridelambda1.RemoteActionCompatParcelizer(), handleUrlOverridelambda1.RemoteActionCompatParcelizer(), -913837326, handleUrlOverridelambda1.RemoteActionCompatParcelizer(), handleUrlOverridelambda1.RemoteActionCompatParcelizer(), objArr2);
            ModalBottomSheetYbuCTN8 modalBottomSheetYbuCTN8Serializer2 = ModalBottomSheetKtModalBottomSheet311.serializer(Arrangement.MediaDescriptionCompat, companion.getStart(), getpostalcode, 0);
            int iHashCode5 = Long.hashCode(getpostalcode.RatingCompat);
            DragAndDropNodestartDragAndDropTransfer1 dragAndDropNodestartDragAndDropTransfer1Serializer5 = getpostalcode.serializer();
            Modifier modifierMaterializeModifier5 = ComposedModifierKt.materializeModifier(getpostalcode, companion3);
            constructor3 = companion2.getConstructor();
            getpostalcode.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg();
            if (getpostalcode.ComponentActivity) {
                getpostalcode.serializer(constructor3);
            } else {
                getpostalcode.r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28();
            }
            c8$$ExternalSyntheticOutline0.m(companion2, getpostalcode, modalBottomSheetYbuCTN8Serializer2, getpostalcode, dragAndDropNodestartDragAndDropTransfer1Serializer5);
            AndroidContentCaptureManagerCompanion.write(getpostalcode, modifierMaterializeModifier5, m1$$ExternalSyntheticOutline0.m(companion2, getpostalcode, Integer.valueOf(iHashCode5), getpostalcode));
            TextStyle textStyle2 = (TextStyle) performLayout.read(925764871, pcn.serializer(), new Object[0], -925764870, pcn.serializer(), pcn.serializer(), pcn.serializer());
            TextKt.m131TextNvy7gAk(str, null, ((buildMapping) getpostalcode.write((getNewPassword) setcurrentsemanticsnodesui2)).setPresenter(), 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, textStyle2.m3102copyp1EtxEg((15204351 & 1) != 0 ? textStyle2.spanStyle.m3016getColor0d7_KjU() : 0L, (15204351 & 2) != 0 ? textStyle2.spanStyle.m3017getFontSizeXSAIIZE() : 0L, (15204351 & 4) != 0 ? textStyle2.spanStyle.getFontWeight() : null, (15204351 & 8) != 0 ? textStyle2.spanStyle.m3018getFontStyle4Lr2A7w() : null, (15204351 & 16) != 0 ? textStyle2.spanStyle.m3019getFontSynthesisZQGJjVo() : null, (15204351 & 32) != 0 ? textStyle2.spanStyle.getFontFamily() : null, (15204351 & 64) != 0 ? textStyle2.spanStyle.getFontFeatureSettings() : null, (15204351 & Fields.SpotShadowColor) != 0 ? textStyle2.spanStyle.m3020getLetterSpacingXSAIIZE() : 0L, (15204351 & Fields.RotationX) != 0 ? textStyle2.spanStyle.m3015getBaselineShift5SSeXJ0() : null, (15204351 & Fields.RotationY) != 0 ? textStyle2.spanStyle.getTextGeometricTransform() : null, (15204351 & Fields.RotationZ) != 0 ? textStyle2.spanStyle.getLocaleList() : null, (15204351 & Fields.CameraDistance) != 0 ? textStyle2.spanStyle.m3014getBackground0d7_KjU() : 0L, (15204351 & Fields.TransformOrigin) != 0 ? textStyle2.spanStyle.getTextDecoration() : null, (15204351 & 8192) != 0 ? textStyle2.spanStyle.getShadow() : null, (15204351 & Fields.Clip) != 0 ? textStyle2.spanStyle.getDrawStyle() : null, (15204351 & Fields.CompositingStrategy) != 0 ? textStyle2.paragraphStyle.m2955getTextAligne0LSkKk() : 0, (15204351 & 65536) != 0 ? textStyle2.paragraphStyle.m2957getTextDirections_7Xco() : 0, (15204351 & Fields.RenderEffect) != 0 ? textStyle2.paragraphStyle.m2953getLineHeightXSAIIZE() : 0L, (15204351 & Fields.ColorFilter) != 0 ? textStyle2.paragraphStyle.getTextIndent() : null, (15204351 & Fields.BlendMode) != 0 ? textStyle2.platformStyle : new PlatformTextStyle(true), (15204351 & 1048576) != 0 ? textStyle2.paragraphStyle.getLineHeightStyle() : null, (15204351 & 2097152) != 0 ? textStyle2.paragraphStyle.m2952getLineBreakrAG3T2k() : 0, (15204351 & 4194304) != 0 ? textStyle2.paragraphStyle.m2950getHyphensvmbZdU8() : 0, (15204351 & 8388608) != 0 ? textStyle2.paragraphStyle.getTextMotion() : null), getpostalcode, i13 & 14, 0, 131066);
            TextStyle textStyleRemoteActionCompatParcelizer2 = performLayout.RemoteActionCompatParcelizer();
            TextKt.m131TextNvy7gAk(str2, null, ((buildMapping) getpostalcode.write((getNewPassword) setcurrentsemanticsnodesui2)).setPresenter(), 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, textStyleRemoteActionCompatParcelizer2.m3102copyp1EtxEg((15204351 & 1) != 0 ? textStyleRemoteActionCompatParcelizer2.spanStyle.m3016getColor0d7_KjU() : 0L, (15204351 & 2) != 0 ? textStyleRemoteActionCompatParcelizer2.spanStyle.m3017getFontSizeXSAIIZE() : 0L, (15204351 & 4) != 0 ? textStyleRemoteActionCompatParcelizer2.spanStyle.getFontWeight() : null, (15204351 & 8) != 0 ? textStyleRemoteActionCompatParcelizer2.spanStyle.m3018getFontStyle4Lr2A7w() : null, (15204351 & 16) != 0 ? textStyleRemoteActionCompatParcelizer2.spanStyle.m3019getFontSynthesisZQGJjVo() : null, (15204351 & 32) != 0 ? textStyleRemoteActionCompatParcelizer2.spanStyle.getFontFamily() : null, (15204351 & 64) != 0 ? textStyleRemoteActionCompatParcelizer2.spanStyle.getFontFeatureSettings() : null, (15204351 & Fields.SpotShadowColor) != 0 ? textStyleRemoteActionCompatParcelizer2.spanStyle.m3020getLetterSpacingXSAIIZE() : 0L, (15204351 & Fields.RotationX) != 0 ? textStyleRemoteActionCompatParcelizer2.spanStyle.m3015getBaselineShift5SSeXJ0() : null, (15204351 & Fields.RotationY) != 0 ? textStyleRemoteActionCompatParcelizer2.spanStyle.getTextGeometricTransform() : null, (15204351 & Fields.RotationZ) != 0 ? textStyleRemoteActionCompatParcelizer2.spanStyle.getLocaleList() : null, (15204351 & Fields.CameraDistance) != 0 ? textStyleRemoteActionCompatParcelizer2.spanStyle.m3014getBackground0d7_KjU() : 0L, (15204351 & Fields.TransformOrigin) != 0 ? textStyleRemoteActionCompatParcelizer2.spanStyle.getTextDecoration() : null, (15204351 & 8192) != 0 ? textStyleRemoteActionCompatParcelizer2.spanStyle.getShadow() : null, (15204351 & Fields.Clip) != 0 ? textStyleRemoteActionCompatParcelizer2.spanStyle.getDrawStyle() : null, (15204351 & Fields.CompositingStrategy) != 0 ? textStyleRemoteActionCompatParcelizer2.paragraphStyle.m2955getTextAligne0LSkKk() : 0, (15204351 & 65536) != 0 ? textStyleRemoteActionCompatParcelizer2.paragraphStyle.m2957getTextDirections_7Xco() : 0, (15204351 & Fields.RenderEffect) != 0 ? textStyleRemoteActionCompatParcelizer2.paragraphStyle.m2953getLineHeightXSAIIZE() : 0L, (15204351 & Fields.ColorFilter) != 0 ? textStyleRemoteActionCompatParcelizer2.paragraphStyle.getTextIndent() : null, (15204351 & Fields.BlendMode) != 0 ? textStyleRemoteActionCompatParcelizer2.platformStyle : new PlatformTextStyle(true), (15204351 & 1048576) != 0 ? textStyleRemoteActionCompatParcelizer2.paragraphStyle.getLineHeightStyle() : null, (15204351 & 2097152) != 0 ? textStyleRemoteActionCompatParcelizer2.paragraphStyle.m2952getLineBreakrAG3T2k() : 0, (15204351 & 4194304) != 0 ? textStyleRemoteActionCompatParcelizer2.paragraphStyle.m2950getHyphensvmbZdU8() : 0, (15204351 & 8388608) != 0 ? textStyleRemoteActionCompatParcelizer2.paragraphStyle.getTextMotion() : null), getpostalcode, (i13 >> 3) & 14, 0, 131066);
            af$$ExternalSyntheticOutline0.m(getpostalcode, true, true, true);
            modifier2 = companion3;
        } else {
            getpostalcode.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
            modifier2 = modifier;
        }
        getHandleruiannotations gethandleruiannotationsMediaDescriptionCompat = getpostalcode.MediaDescriptionCompat();
        if (gethandleruiannotationsMediaDescriptionCompat != null) {
            gethandleruiannotationsMediaDescriptionCompat.serializer = new TextLinkStyles(str, str2, i, r8lambdardpfsr94j4iebcwx_kpqzpm8k0, r8lambdardpfsr94j4iebcwx_kpqzpm8k1, modifier2, i2);
        }
    }
}
