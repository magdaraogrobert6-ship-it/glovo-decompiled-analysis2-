package com.roadrunner.twofa.presentation.compose;

import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.material3.TextKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Fields;
import androidx.compose.ui.graphics.RectangleShapeKt;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.res.StringResources_androidKt;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.FontWeight;
import bo.app.c8$$ExternalSyntheticOutline0;
import bo.app.m1$$ExternalSyntheticOutline0;
import coil3.ExtrasKt;
import com.logistics.rider.glovo.R;
import com.roadrunner.designsystem.compose.theme.tokens.Dimensions;
import com.roadrunner.rrds.compose.component.buttons.TertiaryKt;
import com.roadrunner.rrds.compose.component.navigations.HeaderKt;
import com.roadrunner.rrds.compose.component.pin.PinValidationRowKt;
import io.sentry.SentryUUID;
import kotlinx.coroutines.BuildersKt;
import o.AndroidContentCaptureManagerCompanion;
import o.DragAndDropNodestartDragAndDropTransfer1;
import o.FlingCancellationException;
import o.ModalBottomSheetKtModalBottomSheet311;
import o.ModalBottomSheetYbuCTN8;
import o.RectListDebuggerModifierNode;
import o.getAddressCountry;
import o.getBirthDateFull;
import o.getHandleruiannotations;
import o.getPostalCode;
import o.handleUrlOverridelambda1;
import o.performLayout;
import o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0;
import o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM;
import o.setSdkAuthenticationSignaturelambda11;
import o.setSyncPolicyOfflineStatus;
import o.trigger;

/* JADX INFO: loaded from: classes3.dex */
public abstract class TwoFaContentKt {
    private static int RemoteActionCompatParcelizer = 0;
    private static int serializer = 1;

    public static final void TwoFaContent(setSdkAuthenticationSignaturelambda11 setsdkauthenticationsignaturelambda11, r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm, Modifier modifier, r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k0, r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k1, getBirthDateFull getbirthdatefull, int i) {
        int i2;
        int i3;
        int i4 = 2 % 2;
        int i5 = RemoteActionCompatParcelizer + 37;
        serializer = i5 % Fields.SpotShadowColor;
        int i6 = i5 % 2;
        setsdkauthenticationsignaturelambda11.getClass();
        RectListDebuggerModifierNode rectListDebuggerModifierNode = setsdkauthenticationsignaturelambda11.RemoteActionCompatParcelizer;
        r8lambdaunavo3sxub_pc9xroryotnrlvsm.getClass();
        getPostalCode getpostalcode = (getPostalCode) getbirthdatefull;
        getpostalcode.MediaSessionCompatQueueItem(69545617);
        getAddressCountry getaddresscountry = getpostalcode.read;
        if ((i & 6) == 0) {
            if ((i & 8) == 0 ? getpostalcode.read(setsdkauthenticationsignaturelambda11) : getpostalcode.IconCompatParcelizer(setsdkauthenticationsignaturelambda11)) {
                int i7 = serializer + 73;
                RemoteActionCompatParcelizer = i7 % Fields.SpotShadowColor;
                i3 = i7 % 2 != 0 ? 3 : 4;
            } else {
                i3 = 2;
            }
            i2 = i3 | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= getpostalcode.IconCompatParcelizer(r8lambdaunavo3sxub_pc9xroryotnrlvsm) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            int i8 = serializer + 73;
            RemoteActionCompatParcelizer = i8 % Fields.SpotShadowColor;
            if (i8 % 2 != 0) {
                getpostalcode.read(modifier);
                throw null;
            }
            i2 |= getpostalcode.read(modifier) ? Fields.RotationX : Fields.SpotShadowColor;
        }
        if ((i & 3072) == 0) {
            i2 |= getpostalcode.IconCompatParcelizer(r8lambdardpfsr94j4iebcwx_kpqzpm8k0) ? Fields.CameraDistance : Fields.RotationZ;
        }
        if ((i & 24576) == 0) {
            i2 |= getpostalcode.IconCompatParcelizer(r8lambdardpfsr94j4iebcwx_kpqzpm8k1) ? Fields.Clip : 8192;
        }
        int i9 = i2;
        if (getpostalcode.write(i9 & 1, !((i9 & 9363) == 9362))) {
            Modifier modifierM20backgroundbw27NRU = BackgroundKt.m20backgroundbw27NRU(modifier.then(SizeKt.read), BuildersKt.write(getpostalcode), RectangleShapeKt.getRectangleShape());
            FlingCancellationException flingCancellationException = Arrangement.MediaDescriptionCompat;
            Alignment.Companion companion = Alignment.Companion;
            ModalBottomSheetYbuCTN8 modalBottomSheetYbuCTN8Serializer = ModalBottomSheetKtModalBottomSheet311.serializer(flingCancellationException, companion.getStart(), getpostalcode, 0);
            int iHashCode = Long.hashCode(getpostalcode.RatingCompat);
            DragAndDropNodestartDragAndDropTransfer1 dragAndDropNodestartDragAndDropTransfer1Serializer = getpostalcode.serializer();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(getpostalcode, modifierM20backgroundbw27NRU);
            ComposeUiNode.Companion companion2 = ComposeUiNode.Companion;
            r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 constructor = companion2.getConstructor();
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
            c8$$ExternalSyntheticOutline0.m(companion2, getpostalcode, modalBottomSheetYbuCTN8Serializer, getpostalcode, dragAndDropNodestartDragAndDropTransfer1Serializer);
            AndroidContentCaptureManagerCompanion.write(getpostalcode, modifierMaterializeModifier, m1$$ExternalSyntheticOutline0.m(companion2, getpostalcode, Integer.valueOf(iHashCode), getpostalcode));
            HeaderKt.m5063HeaderbbrV0mI(null, null, null, 0L, 0.0f, ExtrasKt.write(1614118108, new trigger(21, r8lambdardpfsr94j4iebcwx_kpqzpm8k0), getpostalcode), null, null, null, getpostalcode, 196608, 479);
            Modifier.Companion companion3 = Modifier.Companion;
            float f = Dimensions.getAnimatedVisibility;
            Modifier modifierRemoteActionCompatParcelizer = PaddingKt.RemoteActionCompatParcelizer(companion3, Dimensions.setTabContainer, f);
            ModalBottomSheetYbuCTN8 modalBottomSheetYbuCTN8Serializer2 = ModalBottomSheetKtModalBottomSheet311.serializer(flingCancellationException, companion.getStart(), getpostalcode, 0);
            int iHashCode2 = Long.hashCode(getpostalcode.RatingCompat);
            DragAndDropNodestartDragAndDropTransfer1 dragAndDropNodestartDragAndDropTransfer1Serializer2 = getpostalcode.serializer();
            Modifier modifierMaterializeModifier2 = ComposedModifierKt.materializeModifier(getpostalcode, modifierRemoteActionCompatParcelizer);
            r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 constructor2 = companion2.getConstructor();
            getpostalcode.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg();
            if (getpostalcode.ComponentActivity) {
                getpostalcode.serializer(constructor2);
            } else {
                getpostalcode.r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28();
            }
            c8$$ExternalSyntheticOutline0.m(companion2, getpostalcode, modalBottomSheetYbuCTN8Serializer2, getpostalcode, dragAndDropNodestartDragAndDropTransfer1Serializer2);
            AndroidContentCaptureManagerCompanion.write(getpostalcode, modifierMaterializeModifier2, m1$$ExternalSyntheticOutline0.m(companion2, getpostalcode, Integer.valueOf(iHashCode2), getpostalcode));
            TextKt.m131TextNvy7gAk(StringResources_androidKt.stringResource(R.string.two_factor_auth_check_your_sms_title, getpostalcode, 0), companion3, BuildersKt.serializer(getpostalcode), 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, performLayout.MediaSessionCompatResultReceiverWrapper(), getpostalcode, 48, 0, 131064);
            TextKt.m131TextNvy7gAk(StringResources_androidKt.stringResource(R.string.two_factor_auth_enter_code_subtitle, getpostalcode, 0), PaddingKt.m74paddingqDBjuR0$default(companion3, 0.0f, Dimensions.setSplitBackground, 0.0f, 0.0f, 13), BuildersKt.MediaBrowserCompatMediaItem(getpostalcode), 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, performLayout.IconCompatParcelizer(), getpostalcode, 0, 0, 131064);
            float f2 = Dimensions.setPrimaryBackground;
            Modifier modifierM74paddingqDBjuR0$default = PaddingKt.m74paddingqDBjuR0$default(companion3, 0.0f, f2, 0.0f, 0.0f, 13);
            String str = setsdkauthenticationsignaturelambda11.IconCompatParcelizer;
            TextStyle textStyleIconCompatParcelizer = performLayout.IconCompatParcelizer();
            TextKt.m131TextNvy7gAk(str, modifierM74paddingqDBjuR0$default, BuildersKt.serializer(getpostalcode), 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, textStyleIconCompatParcelizer.m3102copyp1EtxEg((15204351 & 1) != 0 ? textStyleIconCompatParcelizer.spanStyle.m3016getColor0d7_KjU() : 0L, (15204351 & 2) != 0 ? textStyleIconCompatParcelizer.spanStyle.m3017getFontSizeXSAIIZE() : 0L, (15204351 & 4) != 0 ? textStyleIconCompatParcelizer.spanStyle.getFontWeight() : FontWeight.Companion.getBold(), (15204351 & 8) != 0 ? textStyleIconCompatParcelizer.spanStyle.m3018getFontStyle4Lr2A7w() : null, (15204351 & 16) != 0 ? textStyleIconCompatParcelizer.spanStyle.m3019getFontSynthesisZQGJjVo() : null, (15204351 & 32) != 0 ? textStyleIconCompatParcelizer.spanStyle.getFontFamily() : null, (15204351 & 64) != 0 ? textStyleIconCompatParcelizer.spanStyle.getFontFeatureSettings() : null, (15204351 & Fields.SpotShadowColor) != 0 ? textStyleIconCompatParcelizer.spanStyle.m3020getLetterSpacingXSAIIZE() : 0L, (15204351 & Fields.RotationX) != 0 ? textStyleIconCompatParcelizer.spanStyle.m3015getBaselineShift5SSeXJ0() : null, (15204351 & Fields.RotationY) != 0 ? textStyleIconCompatParcelizer.spanStyle.getTextGeometricTransform() : null, (15204351 & Fields.RotationZ) != 0 ? textStyleIconCompatParcelizer.spanStyle.getLocaleList() : null, (15204351 & Fields.CameraDistance) != 0 ? textStyleIconCompatParcelizer.spanStyle.m3014getBackground0d7_KjU() : 0L, (15204351 & Fields.TransformOrigin) != 0 ? textStyleIconCompatParcelizer.spanStyle.getTextDecoration() : null, (15204351 & 8192) != 0 ? textStyleIconCompatParcelizer.spanStyle.getShadow() : null, (15204351 & Fields.Clip) != 0 ? textStyleIconCompatParcelizer.spanStyle.getDrawStyle() : null, (15204351 & Fields.CompositingStrategy) != 0 ? textStyleIconCompatParcelizer.paragraphStyle.m2955getTextAligne0LSkKk() : 0, (15204351 & 65536) != 0 ? textStyleIconCompatParcelizer.paragraphStyle.m2957getTextDirections_7Xco() : 0, (15204351 & Fields.RenderEffect) != 0 ? textStyleIconCompatParcelizer.paragraphStyle.m2953getLineHeightXSAIIZE() : 0L, (15204351 & Fields.ColorFilter) != 0 ? textStyleIconCompatParcelizer.paragraphStyle.getTextIndent() : null, (15204351 & Fields.BlendMode) != 0 ? textStyleIconCompatParcelizer.platformStyle : null, (15204351 & 1048576) != 0 ? textStyleIconCompatParcelizer.paragraphStyle.getLineHeightStyle() : null, (15204351 & 2097152) != 0 ? textStyleIconCompatParcelizer.paragraphStyle.m2952getLineBreakrAG3T2k() : 0, (15204351 & 4194304) != 0 ? textStyleIconCompatParcelizer.paragraphStyle.m2950getHyphensvmbZdU8() : 0, (15204351 & 8388608) != 0 ? textStyleIconCompatParcelizer.paragraphStyle.getTextMotion() : null), getpostalcode, 0, 0, 131064);
            ExtrasKt.read(913837329, handleUrlOverridelambda1.RemoteActionCompatParcelizer(), handleUrlOverridelambda1.RemoteActionCompatParcelizer(), -913837326, handleUrlOverridelambda1.RemoteActionCompatParcelizer(), handleUrlOverridelambda1.RemoteActionCompatParcelizer(), new Object[]{getpostalcode, SizeKt.m75height3ABfNKs(companion3, f)});
            PinValidationRowKt.PinValidationRow(4, setsdkauthenticationsignaturelambda11.write, setsdkauthenticationsignaturelambda11.serializer, r8lambdaunavo3sxub_pc9xroryotnrlvsm, null, setsdkauthenticationsignaturelambda11.read, "-", false, false, null, false, false, false, null, null, null, getpostalcode, ((i9 << 6) & 7168) | 14155776, 6, 64272);
            ExtrasKt.read(913837329, handleUrlOverridelambda1.RemoteActionCompatParcelizer(), handleUrlOverridelambda1.RemoteActionCompatParcelizer(), -913837326, handleUrlOverridelambda1.RemoteActionCompatParcelizer(), handleUrlOverridelambda1.RemoteActionCompatParcelizer(), new Object[]{getpostalcode, SizeKt.m75height3ABfNKs(companion3, Dimensions.setVisibility)});
            TextKt.m131TextNvy7gAk(StringResources_androidKt.stringResource(R.string.two_factor_auth_did_not_get_the_msg, getpostalcode, 0), null, BuildersKt.MediaBrowserCompatMediaItem(getpostalcode), 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, performLayout.IconCompatParcelizer(), getpostalcode, 0, 0, 131066);
            if (rectListDebuggerModifierNode.serializer) {
                int i10 = RemoteActionCompatParcelizer + 27;
                serializer = i10 % Fields.SpotShadowColor;
                int i11 = i10 % 2;
                getpostalcode.serializer(1079909283);
                TertiaryKt.IconCompatParcelizer(StringResources_androidKt.stringResource(R.string.login_otp_request_again_button, getpostalcode, 0), r8lambdardpfsr94j4iebcwx_kpqzpm8k1, null, false, 0, null, null, null, getpostalcode, (i9 >> 9) & 112, 252);
                getpostalcode.IconCompatParcelizer(false);
                int i12 = serializer + 117;
                RemoteActionCompatParcelizer = i12 % Fields.SpotShadowColor;
                int i13 = i12 % 2;
            } else {
                getpostalcode.serializer(1080153439);
                TextKt.m132TextZ58ophY(rectListDebuggerModifierNode.RemoteActionCompatParcelizer, PaddingKt.m74paddingqDBjuR0$default(companion3, 0.0f, f2, 0.0f, 0.0f, 13), BuildersKt.MediaBrowserCompatMediaItem(getpostalcode), 0L, null, 0L, null, 0L, 0, false, 0, 0, null, null, performLayout.IconCompatParcelizer(), getpostalcode, 0, 0, 262136);
                getpostalcode.IconCompatParcelizer(false);
            }
            int i14 = RemoteActionCompatParcelizer + 19;
            serializer = i14 % Fields.SpotShadowColor;
            int i15 = i14 % 2;
            getpostalcode.IconCompatParcelizer(true);
            getpostalcode.IconCompatParcelizer(true);
        } else {
            getpostalcode.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
        }
        getHandleruiannotations gethandleruiannotationsMediaDescriptionCompat = getpostalcode.MediaDescriptionCompat();
        if (gethandleruiannotationsMediaDescriptionCompat != null) {
            gethandleruiannotationsMediaDescriptionCompat.serializer = new setSyncPolicyOfflineStatus(setsdkauthenticationsignaturelambda11, r8lambdaunavo3sxub_pc9xroryotnrlvsm, modifier, r8lambdardpfsr94j4iebcwx_kpqzpm8k0, r8lambdardpfsr94j4iebcwx_kpqzpm8k1, i);
        }
    }
}
