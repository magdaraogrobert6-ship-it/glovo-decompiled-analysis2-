package com.roadrunner.delivery.pickupdropoff.tasks.multiplecodescan.presentation.scan.compose;

import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.material3.TextKt;
import androidx.compose.runtime.CompositionKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.Fields;
import androidx.compose.ui.graphics.Shadow;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.style.TextOverflow;
import bo.app.af$$ExternalSyntheticOutline0;
import bo.app.m1$$ExternalSyntheticOutline0;
import com.huawei.riemann.location.common.utils.Constant;
import com.roadrunner.delivery.pickupdropoff.tasks.multiplecodescan.presentation.scan.compose.ScannedCodeFadeTextKt;
import com.roadrunner.rrds.compose.component.buttons.slider.SliderButtonContainerKt$SliderCore$2$1$1$2$1;
import io.sentry.SentryUUID;
import kotlinx.coroutines.DelayKt;
import o.AndroidContentCaptureManager;
import o.AndroidContentCaptureManagerCompanion;
import o.DragAndDropNodestartDragAndDropTransfer1;
import o.PopulateViewStructure_androidKtpopulate7;
import o.TapGestureDetectorKtprocessTapGestureresetJob1;
import o.buildMapping;
import o.getAddressCountry;
import o.getBirthDateFull;
import o.getCreditCardExpirationMonth;
import o.getHandleruiannotations;
import o.getInfinityD9Ej5fM;
import o.getNewPassword;
import o.getPhoneNumberNational;
import o.getPostalCode;
import o.onViewAttachedToWindow;
import o.performLayout;
import o.performMeasureDjhGOtQ;
import o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0;
import o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0;
import o.r8lambdapbG_fqEcit8CH1waoNmDxLhROlU;
import o.requiredWidthInVpY3zN4default;
import o.setCurrentSemanticsNodesui;

/* JADX INFO: loaded from: classes3.dex */
public abstract class ScannedCodeFadeTextKt {
    private static int IconCompatParcelizer = 1;
    private static int serializer;

    public static final void ScannedCodeFadeText(final String str, Modifier modifier, final float f, final float f2, final Float f3, getBirthDateFull getbirthdatefull, final int i) {
        int i2;
        boolean z;
        getPostalCode getpostalcode;
        final Modifier modifier2;
        boolean z2;
        int i3;
        int i4 = 2 % 2;
        getPostalCode getpostalcode2 = (getPostalCode) getbirthdatefull;
        getpostalcode2.MediaSessionCompatQueueItem(1174634556);
        getAddressCountry getaddresscountry = getpostalcode2.read;
        if ((i & 6) == 0) {
            int i5 = IconCompatParcelizer + 53;
            serializer = i5 % Fields.SpotShadowColor;
            if (i5 % 2 != 0) {
                getpostalcode2.read(str);
                throw null;
            }
            i2 = (getpostalcode2.read(str) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        int i6 = i2 | 48;
        if ((i & 384) == 0) {
            i6 |= getpostalcode2.serializer(f) ? 256 : Fields.SpotShadowColor;
        }
        if ((i & 3072) == 0) {
            i6 |= getpostalcode2.serializer(f2) ? Fields.CameraDistance : Fields.RotationZ;
        }
        if ((i & 24576) == 0) {
            int i7 = IconCompatParcelizer + 117;
            serializer = i7 % Fields.SpotShadowColor;
            if (i7 % 2 != 0) {
                getpostalcode2.read(f3);
                throw null;
            }
            if (!(!getpostalcode2.read(f3))) {
                int i8 = IconCompatParcelizer + 89;
                serializer = i8 % Fields.SpotShadowColor;
                int i9 = i8 % 2;
                i3 = Fields.Clip;
            } else {
                i3 = 8192;
            }
            i6 |= i3;
        }
        int i10 = i6;
        if ((i10 & 9363) != 9362) {
            int i11 = serializer + 93;
            IconCompatParcelizer = i11 % Fields.SpotShadowColor;
            int i12 = i11 % 2;
            z = true;
        } else {
            z = false;
        }
        if (getpostalcode2.write(i10 & 1, z)) {
            Modifier.Companion companion = Modifier.Companion;
            Object objComponentActivity = getpostalcode2.ComponentActivity();
            AndroidContentCaptureManager androidContentCaptureManager = getCreditCardExpirationMonth.write;
            if (objComponentActivity == androidContentCaptureManager) {
                objComponentActivity = CompositionKt.RemoteActionCompatParcelizer(Boolean.TRUE);
                getpostalcode2.write(objComponentActivity);
            }
            PopulateViewStructure_androidKtpopulate7 populateViewStructure_androidKtpopulate7 = (PopulateViewStructure_androidKtpopulate7) objComponentActivity;
            Object objComponentActivity2 = getpostalcode2.ComponentActivity();
            if (objComponentActivity2 == androidContentCaptureManager) {
                objComponentActivity2 = new SliderButtonContainerKt$SliderCore$2$1$1$2$1.AnonymousClass1(populateViewStructure_androidKtpopulate7, null, 1);
                getpostalcode2.write(objComponentActivity2);
            }
            getPhoneNumberNational.RemoteActionCompatParcelizer(getpostalcode2, str, (r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0) objComponentActivity2);
            float f4 = ((Boolean) populateViewStructure_androidKtpopulate7.getValue()).booleanValue() ? 1.0f : 0.0f;
            onViewAttachedToWindow onviewattachedtowindowIconCompatParcelizer = TapGestureDetectorKtprocessTapGestureresetJob1.IconCompatParcelizer(f4, (requiredWidthInVpY3zN4default) DelayKt.write(1332258063, r8lambdapbG_fqEcit8CH1waoNmDxLhROlU.write(), -1332258060, r8lambdapbG_fqEcit8CH1waoNmDxLhROlU.write(), r8lambdapbG_fqEcit8CH1waoNmDxLhROlU.write(), r8lambdapbG_fqEcit8CH1waoNmDxLhROlU.write(), new Object[]{Integer.valueOf(Constant.ERROR_UNKNOWN), 0, null, 6}), "fadeOpacity", null, getpostalcode2, 3120, 20);
            if (((Number) onviewattachedtowindowIconCompatParcelizer.getValue()).floatValue() > 0.0f) {
                getpostalcode2.serializer(-1854858504);
                Modifier modifierThen = companion.then(SizeKt.read);
                MeasurePolicy measurePolicy = BoxKt.read(Alignment.Companion.getCenter(), false);
                int iHashCode = Long.hashCode(getpostalcode2.RatingCompat);
                DragAndDropNodestartDragAndDropTransfer1 dragAndDropNodestartDragAndDropTransfer1Serializer = getpostalcode2.serializer();
                Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(getpostalcode2, modifierThen);
                ComposeUiNode.Companion companion2 = ComposeUiNode.Companion;
                r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 constructor = companion2.getConstructor();
                if (getaddresscountry == null) {
                    SentryUUID.write();
                    throw null;
                }
                int i13 = IconCompatParcelizer + 69;
                serializer = i13 % Fields.SpotShadowColor;
                int i14 = i13 % 2;
                getpostalcode2.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg();
                if (!getpostalcode2.ComponentActivity) {
                    getpostalcode2.r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28();
                } else {
                    getpostalcode2.serializer(constructor);
                }
                af$$ExternalSyntheticOutline0.m(companion2, getpostalcode2, measurePolicy, getpostalcode2, dragAndDropNodestartDragAndDropTransfer1Serializer);
                AndroidContentCaptureManagerCompanion.write(getpostalcode2, modifierMaterializeModifier, m1$$ExternalSyntheticOutline0.m(companion2, getpostalcode2, Integer.valueOf(iHashCode), getpostalcode2));
                boolean z3 = (i10 & 896) == 256;
                boolean z4 = (57344 & i10) == 16384;
                if ((i10 & 7168) == 2048) {
                    int i15 = IconCompatParcelizer + 57;
                    serializer = i15 % Fields.SpotShadowColor;
                    int i16 = i15 % 2;
                    z2 = true;
                } else {
                    z2 = false;
                }
                Object objComponentActivity3 = getpostalcode2.ComponentActivity();
                if ((z4 | z3 | z2) || objComponentActivity3 == androidContentCaptureManager) {
                    objComponentActivity3 = new getInfinityD9Ej5fM(f, f3, f2);
                    getpostalcode2.write(objComponentActivity3);
                }
                MeasurePolicy measurePolicy2 = (MeasurePolicy) objComponentActivity3;
                int iHashCode2 = Long.hashCode(getpostalcode2.RatingCompat);
                DragAndDropNodestartDragAndDropTransfer1 dragAndDropNodestartDragAndDropTransfer1Serializer2 = getpostalcode2.serializer();
                Modifier modifierMaterializeModifier2 = ComposedModifierKt.materializeModifier(getpostalcode2, companion);
                r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 constructor2 = companion2.getConstructor();
                getpostalcode2.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg();
                if (getpostalcode2.ComponentActivity) {
                    int i17 = serializer + 115;
                    IconCompatParcelizer = i17 % Fields.SpotShadowColor;
                    if (i17 % 2 == 0) {
                        getpostalcode2.serializer(constructor2);
                        Object obj = null;
                        obj.hashCode();
                        throw null;
                    }
                    getpostalcode2.serializer(constructor2);
                } else {
                    getpostalcode2.r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28();
                }
                af$$ExternalSyntheticOutline0.m(companion2, getpostalcode2, measurePolicy2, getpostalcode2, dragAndDropNodestartDragAndDropTransfer1Serializer2);
                AndroidContentCaptureManagerCompanion.write(getpostalcode2, modifierMaterializeModifier2, m1$$ExternalSyntheticOutline0.m(companion2, getpostalcode2, Integer.valueOf(iHashCode2), getpostalcode2));
                TextStyle textStyle = (TextStyle) performLayout.getActivityResultRegistry.MediaSessionCompatResultReceiverWrapper();
                setCurrentSemanticsNodesui setcurrentsemanticsnodesui = performMeasureDjhGOtQ.RemoteActionCompatParcelizer;
                TextKt.m131TextNvy7gAk(str, null, Color.m721copywmQWz5c$default(((buildMapping) getpostalcode2.write((getNewPassword) setcurrentsemanticsnodesui)).getPopupTheme(), ((Number) onviewattachedtowindowIconCompatParcelizer.getValue()).floatValue(), 0.0f, 0.0f, 0.0f, 14, null), 0L, null, null, 0L, null, 0L, TextOverflow.Companion.m3569getEllipsisgIe3tQ8(), false, 1, 0, null, textStyle.m3102copyp1EtxEg((15204351 & 1) != 0 ? textStyle.spanStyle.m3016getColor0d7_KjU() : 0L, (15204351 & 2) != 0 ? textStyle.spanStyle.m3017getFontSizeXSAIIZE() : 0L, (15204351 & 4) != 0 ? textStyle.spanStyle.getFontWeight() : null, (15204351 & 8) != 0 ? textStyle.spanStyle.m3018getFontStyle4Lr2A7w() : null, (15204351 & 16) != 0 ? textStyle.spanStyle.m3019getFontSynthesisZQGJjVo() : null, (15204351 & 32) != 0 ? textStyle.spanStyle.getFontFamily() : null, (15204351 & 64) != 0 ? textStyle.spanStyle.getFontFeatureSettings() : null, (15204351 & Fields.SpotShadowColor) != 0 ? textStyle.spanStyle.m3020getLetterSpacingXSAIIZE() : 0L, (15204351 & Fields.RotationX) != 0 ? textStyle.spanStyle.m3015getBaselineShift5SSeXJ0() : null, (15204351 & Fields.RotationY) != 0 ? textStyle.spanStyle.getTextGeometricTransform() : null, (15204351 & Fields.RotationZ) != 0 ? textStyle.spanStyle.getLocaleList() : null, (15204351 & Fields.CameraDistance) != 0 ? textStyle.spanStyle.m3014getBackground0d7_KjU() : 0L, (15204351 & Fields.TransformOrigin) != 0 ? textStyle.spanStyle.getTextDecoration() : null, (15204351 & 8192) != 0 ? textStyle.spanStyle.getShadow() : new Shadow(Color.m721copywmQWz5c$default(((buildMapping) getpostalcode2.write((getNewPassword) setcurrentsemanticsnodesui)).setPresenter(), ((Number) onviewattachedtowindowIconCompatParcelizer.getValue()).floatValue() * 0.4f, 0.0f, 0.0f, 0.0f, 14, null), Offset.m469constructorimpl((((long) Float.floatToRawIntBits(0.0f)) << 32) | (((long) Float.floatToRawIntBits(2.0f)) & 4294967295L)), 8.0f, null), (15204351 & Fields.Clip) != 0 ? textStyle.spanStyle.getDrawStyle() : null, (15204351 & Fields.CompositingStrategy) != 0 ? textStyle.paragraphStyle.m2955getTextAligne0LSkKk() : 0, (15204351 & 65536) != 0 ? textStyle.paragraphStyle.m2957getTextDirections_7Xco() : 0, (15204351 & Fields.RenderEffect) != 0 ? textStyle.paragraphStyle.m2953getLineHeightXSAIIZE() : 0L, (15204351 & Fields.ColorFilter) != 0 ? textStyle.paragraphStyle.getTextIndent() : null, (15204351 & Fields.BlendMode) != 0 ? textStyle.platformStyle : null, (15204351 & 1048576) != 0 ? textStyle.paragraphStyle.getLineHeightStyle() : null, (15204351 & 2097152) != 0 ? textStyle.paragraphStyle.m2952getLineBreakrAG3T2k() : 0, (15204351 & 4194304) != 0 ? textStyle.paragraphStyle.m2950getHyphensvmbZdU8() : 0, (15204351 & 8388608) != 0 ? textStyle.paragraphStyle.getTextMotion() : null), getpostalcode2, i10 & 14, 24960, 110586);
                getpostalcode = getpostalcode2;
                af$$ExternalSyntheticOutline0.m(getpostalcode, true, true, false);
            } else {
                getpostalcode = getpostalcode2;
                getpostalcode.serializer(-1852784666);
                getpostalcode.IconCompatParcelizer(false);
            }
            modifier2 = companion;
        } else {
            getpostalcode = getpostalcode2;
            getpostalcode.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
            modifier2 = modifier;
        }
        getHandleruiannotations gethandleruiannotationsMediaDescriptionCompat = getpostalcode.MediaDescriptionCompat();
        if (gethandleruiannotationsMediaDescriptionCompat != null) {
            gethandleruiannotationsMediaDescriptionCompat.serializer = new r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0() { // from class: o.getHairlineD9Ej5fM
                private static int MediaMetadataCompat = 1;
                private static int MediaSessionCompatQueueItem;

                @Override // o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0
                public final Object invoke(Object obj2, Object obj3) {
                    int i18 = 2 % 2;
                    int i19 = MediaSessionCompatQueueItem + 35;
                    MediaMetadataCompat = i19 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                    int i20 = i19 % 2;
                    ((Integer) obj3).getClass();
                    ScannedCodeFadeTextKt.ScannedCodeFadeText(str, modifier2, f, f2, f3, (getBirthDateFull) obj2, ContentType_androidKt.RemoteActionCompatParcelizer(i | 1));
                    createFromParcel createfromparcel = createFromParcel.INSTANCE;
                    int i21 = MediaMetadataCompat + 75;
                    MediaSessionCompatQueueItem = i21 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                    if (i21 % 2 == 0) {
                        return createfromparcel;
                    }
                    Object obj4 = null;
                    obj4.hashCode();
                    throw null;
                }
            };
        }
    }
}
