package o;

import bo.app.af$$ExternalSyntheticOutline0;
import bo.app.m1$$ExternalSyntheticOutline0;
import com.roadrunner.designsystem.compose.theme.tokens.Dimensions;
import com.roadrunner.rrds.compose.component.forms.PasswordFieldKt;
import io.sentry.SentryUUID;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class r8lambdaa2Dl51lAH9MKTP_RaVwuQrXOFEM implements r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 {
    private static int IconCompatParcelizer = 0;
    private static int write = 1;
    public final /* synthetic */ int read;
    public final /* synthetic */ String serializer;

    public /* synthetic */ r8lambdaa2Dl51lAH9MKTP_RaVwuQrXOFEM(String str, int i) {
        this.read = i;
        this.serializer = str;
    }

    /* JADX WARN: Code duplicated, block: B:40:0x0137  */
    /* JADX WARN: Code duplicated, block: B:41:0x013e A[PHI: r4
  0x013e: PHI (r4v31 java.lang.String) = (r4v30 java.lang.String), (r4v36 java.lang.String) binds: [B:39:0x0135, B:36:0x0130] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0
    public final Object invoke(Object obj, Object obj2) {
        boolean z;
        String str;
        int i = 2 % 2;
        int i2 = this.read;
        createFromParcel createfromparcel = createFromParcel.INSTANCE;
        boolean z2 = false;
        if (i2 == 0) {
            getBirthDateFull getbirthdatefull = (getBirthDateFull) obj;
            int iIntValue = ((Integer) obj2).intValue();
            if ((iIntValue & 3) != 2) {
                int i3 = IconCompatParcelizer + 89;
                write = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                int i4 = i3 % 2;
                z = true;
            } else {
                z = false;
            }
            getPostalCode getpostalcode = (getPostalCode) getbirthdatefull;
            if (getpostalcode.write(iIntValue & 1, z)) {
                int i5 = write + 53;
                IconCompatParcelizer = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                int i6 = i5 % 2;
                androidx.compose.ui.Alignment.Vertical centerVertically = androidx.compose.ui.Alignment.Companion.getCenterVertically();
                androidx.compose.ui.Modifier.Companion companion = androidx.compose.ui.Modifier.Companion;
                supportingTextPaddinga9UjIt4material3default supportingtextpaddinga9ujit4material3defaultSerializer = TextFieldDefaults.serializer(androidx.compose.foundation.layout.Arrangement.MediaBrowserCompatMediaItem, centerVertically, getpostalcode, 48);
                int iHashCode = Long.hashCode(getpostalcode.RatingCompat);
                DragAndDropNodestartDragAndDropTransfer1 dragAndDropNodestartDragAndDropTransfer1Serializer = getpostalcode.serializer();
                androidx.compose.ui.Modifier modifierMaterializeModifier = androidx.compose.ui.ComposedModifierKt.materializeModifier(getpostalcode, companion);
                androidx.compose.ui.node.ComposeUiNode.Companion companion2 = androidx.compose.ui.node.ComposeUiNode.Companion;
                r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 constructor = companion2.getConstructor();
                if (getpostalcode.read == null) {
                    SentryUUID.write();
                    throw null;
                }
                getpostalcode.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg();
                if (!getpostalcode.ComponentActivity) {
                    getpostalcode.r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28();
                } else {
                    getpostalcode.serializer(constructor);
                }
                r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.read(companion2, getpostalcode, supportingtextpaddinga9ujit4material3defaultSerializer, getpostalcode, dragAndDropNodestartDragAndDropTransfer1Serializer);
                AndroidContentCaptureManagerCompanion.write(getpostalcode, modifierMaterializeModifier, m1$$ExternalSyntheticOutline0.m(companion2, getpostalcode, Integer.valueOf(iHashCode), getpostalcode));
                String str2 = this.serializer;
                if (str2 != null) {
                    getpostalcode.serializer(-121800881);
                    androidx.compose.material3.TextKt.m131TextNvy7gAk(str2, null, ((buildMapping) getpostalcode.write((getNewPassword) performMeasureDjhGOtQ.RemoteActionCompatParcelizer)).getSupportBackgroundTintMode(), 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, performLayout.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus(), getpostalcode, 0, 0, 131066);
                    coil3.ExtrasKt.read(913837329, handleUrlOverridelambda1.RemoteActionCompatParcelizer(), handleUrlOverridelambda1.RemoteActionCompatParcelizer(), -913837326, handleUrlOverridelambda1.RemoteActionCompatParcelizer(), handleUrlOverridelambda1.RemoteActionCompatParcelizer(), new Object[]{getpostalcode, androidx.compose.foundation.layout.SizeKt.m86width3ABfNKs(companion, androidx.compose.ui.unit.Dp.m3673constructorimpl(6.0f))});
                    getpostalcode.IconCompatParcelizer(false);
                } else {
                    getpostalcode.serializer(-121650004);
                    getpostalcode.IconCompatParcelizer(false);
                }
                androidx.compose.material3.IconKt.m116Iconww6aTOc(androidx.compose.ui.res.PainterResources_androidKt.painterResource(com.logistics.rider.glovo.R.drawable.ic_bold_large_arrow_right, getpostalcode, 0), (String) null, (androidx.compose.ui.Modifier) null, androidx.compose.ui.res.ColorResources_androidKt.colorResource(com.logistics.rider.glovo.R.color.component_text_form_text_input_big_icon_end_default, getpostalcode, 0), getpostalcode, androidx.compose.ui.graphics.painter.Painter.$stable | 48, 4);
                getpostalcode.IconCompatParcelizer(true);
            } else {
                getpostalcode.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
            }
            return createfromparcel;
        }
        if (i2 == 1) {
            getBirthDateFull getbirthdatefull2 = (getBirthDateFull) obj;
            int iIntValue2 = ((Integer) obj2).intValue();
            getPostalCode getpostalcode2 = (getPostalCode) getbirthdatefull2;
            if (getpostalcode2.write(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                androidx.compose.ui.Modifier modifier = androidx.compose.foundation.layout.OffsetKt.read(androidx.compose.ui.Modifier.Companion, androidx.compose.ui.unit.Dp.m3673constructorimpl(0.0f), androidx.compose.ui.unit.Dp.m3673constructorimpl(-Dimensions.getActionBarHideOffset));
                androidx.compose.ui.text.TextStyle textStyleMediaSessionCompatQueueItem = performLayout.MediaSessionCompatQueueItem();
                androidx.compose.material3.TextKt.m131TextNvy7gAk(this.serializer, modifier, 0L, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, textStyleMediaSessionCompatQueueItem.m3102copyp1EtxEg((15204351 & 1) != 0 ? textStyleMediaSessionCompatQueueItem.spanStyle.m3016getColor0d7_KjU() : 0L, (15204351 & 2) != 0 ? textStyleMediaSessionCompatQueueItem.spanStyle.m3017getFontSizeXSAIIZE() : androidx.compose.ui.unit.TextUnitKt.getSp(32), (15204351 & 4) != 0 ? textStyleMediaSessionCompatQueueItem.spanStyle.getFontWeight() : null, (15204351 & 8) != 0 ? textStyleMediaSessionCompatQueueItem.spanStyle.m3018getFontStyle4Lr2A7w() : null, (15204351 & 16) != 0 ? textStyleMediaSessionCompatQueueItem.spanStyle.m3019getFontSynthesisZQGJjVo() : null, (15204351 & 32) != 0 ? textStyleMediaSessionCompatQueueItem.spanStyle.getFontFamily() : null, (15204351 & 64) != 0 ? textStyleMediaSessionCompatQueueItem.spanStyle.getFontFeatureSettings() : null, (15204351 & androidx.compose.ui.graphics.Fields.SpotShadowColor) != 0 ? textStyleMediaSessionCompatQueueItem.spanStyle.m3020getLetterSpacingXSAIIZE() : 0L, (15204351 & androidx.compose.ui.graphics.Fields.RotationX) != 0 ? textStyleMediaSessionCompatQueueItem.spanStyle.m3015getBaselineShift5SSeXJ0() : null, (15204351 & androidx.compose.ui.graphics.Fields.RotationY) != 0 ? textStyleMediaSessionCompatQueueItem.spanStyle.getTextGeometricTransform() : null, (15204351 & androidx.compose.ui.graphics.Fields.RotationZ) != 0 ? textStyleMediaSessionCompatQueueItem.spanStyle.getLocaleList() : null, (15204351 & androidx.compose.ui.graphics.Fields.CameraDistance) != 0 ? textStyleMediaSessionCompatQueueItem.spanStyle.m3014getBackground0d7_KjU() : 0L, (15204351 & androidx.compose.ui.graphics.Fields.TransformOrigin) != 0 ? textStyleMediaSessionCompatQueueItem.spanStyle.getTextDecoration() : null, (15204351 & 8192) != 0 ? textStyleMediaSessionCompatQueueItem.spanStyle.getShadow() : null, (15204351 & androidx.compose.ui.graphics.Fields.Clip) != 0 ? textStyleMediaSessionCompatQueueItem.spanStyle.getDrawStyle() : null, (15204351 & androidx.compose.ui.graphics.Fields.CompositingStrategy) != 0 ? textStyleMediaSessionCompatQueueItem.paragraphStyle.m2955getTextAligne0LSkKk() : 0, (15204351 & 65536) != 0 ? textStyleMediaSessionCompatQueueItem.paragraphStyle.m2957getTextDirections_7Xco() : 0, (15204351 & androidx.compose.ui.graphics.Fields.RenderEffect) != 0 ? textStyleMediaSessionCompatQueueItem.paragraphStyle.m2953getLineHeightXSAIIZE() : 0L, (15204351 & androidx.compose.ui.graphics.Fields.ColorFilter) != 0 ? textStyleMediaSessionCompatQueueItem.paragraphStyle.getTextIndent() : null, (15204351 & androidx.compose.ui.graphics.Fields.BlendMode) != 0 ? textStyleMediaSessionCompatQueueItem.platformStyle : null, (15204351 & 1048576) != 0 ? textStyleMediaSessionCompatQueueItem.paragraphStyle.getLineHeightStyle() : null, (15204351 & 2097152) != 0 ? textStyleMediaSessionCompatQueueItem.paragraphStyle.m2952getLineBreakrAG3T2k() : 0, (15204351 & 4194304) != 0 ? textStyleMediaSessionCompatQueueItem.paragraphStyle.m2950getHyphensvmbZdU8() : 0, (15204351 & 8388608) != 0 ? textStyleMediaSessionCompatQueueItem.paragraphStyle.getTextMotion() : null), getpostalcode2, 0, 0, 131068);
            } else {
                getpostalcode2.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
            }
            return createfromparcel;
        }
        if (i2 == 2) {
            getBirthDateFull getbirthdatefull3 = (getBirthDateFull) obj;
            int iIntValue3 = ((Integer) obj2).intValue();
            getPostalCode getpostalcode3 = (getPostalCode) getbirthdatefull3;
            if (getpostalcode3.write(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                String str3 = this.serializer;
                if (str3 == null) {
                    getpostalcode3.serializer(-929621009);
                    getpostalcode3.IconCompatParcelizer(false);
                } else {
                    getpostalcode3.serializer(-929621008);
                    PasswordFieldKt.RemoteActionCompatParcelizer(str3, getpostalcode3, 0);
                    getpostalcode3.IconCompatParcelizer(false);
                }
            } else {
                getpostalcode3.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
            }
            return createfromparcel;
        }
        if (i2 == 3) {
            getBirthDateFull getbirthdatefull4 = (getBirthDateFull) obj;
            int iIntValue4 = ((Integer) obj2).intValue();
            if ((iIntValue4 & 3) != 2) {
                int i7 = IconCompatParcelizer + 53;
                int i8 = i7 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                write = i8;
                int i9 = i7 % 2;
                int i10 = i8 + 93;
                IconCompatParcelizer = i10 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                int i11 = i10 % 2;
                z2 = true;
            }
            getPostalCode getpostalcode4 = (getPostalCode) getbirthdatefull4;
            if (getpostalcode4.write(iIntValue4 & 1, z2)) {
                androidx.compose.material3.TextKt.m131TextNvy7gAk(this.serializer, null, 0L, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, (androidx.compose.ui.text.TextStyle) performLayout.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus.MediaSessionCompatResultReceiverWrapper(), getpostalcode4, 0, 0, 131070);
            } else {
                getpostalcode4.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
            }
            return createfromparcel;
        }
        if (i2 == 4) {
            getBirthDateFull getbirthdatefull5 = (getBirthDateFull) obj;
            int iIntValue5 = ((Integer) obj2).intValue();
            getPostalCode getpostalcode5 = (getPostalCode) getbirthdatefull5;
            if (getpostalcode5.write(iIntValue5 & 1, (iIntValue5 & 3) != 2)) {
                int i12 = IconCompatParcelizer + 95;
                write = i12 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                if (i12 % 2 == 0) {
                    str = this.serializer;
                    int i13 = 47 / 0;
                    if (str == null) {
                        getpostalcode5.serializer(650140007);
                    } else {
                        getpostalcode5.serializer(650140008);
                        androidx.compose.material3.TextKt.m131TextNvy7gAk(str, null, 0L, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, performLayout.RatingCompat(), getpostalcode5, 0, 0, 131070);
                        int i14 = write + 61;
                        IconCompatParcelizer = i14 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                        int i15 = i14 % 2;
                    }
                } else {
                    str = this.serializer;
                    if (str == null) {
                        getpostalcode5.serializer(650140007);
                    } else {
                        getpostalcode5.serializer(650140008);
                        androidx.compose.material3.TextKt.m131TextNvy7gAk(str, null, 0L, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, performLayout.RatingCompat(), getpostalcode5, 0, 0, 131070);
                        int i16 = write + 61;
                        IconCompatParcelizer = i16 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                        int i17 = i16 % 2;
                    }
                }
                getpostalcode5.IconCompatParcelizer(false);
            } else {
                getpostalcode5.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
            }
            return createfromparcel;
        }
        getBirthDateFull getbirthdatefull6 = (getBirthDateFull) obj;
        int iIntValue6 = ((Integer) obj2).intValue();
        getPostalCode getpostalcode6 = (getPostalCode) getbirthdatefull6;
        if (getpostalcode6.write(iIntValue6 & 1, (iIntValue6 & 3) != 2)) {
            androidx.compose.ui.Modifier.Companion companion3 = androidx.compose.ui.Modifier.Companion;
            androidx.compose.ui.Modifier modifierThen = companion3.then(androidx.compose.foundation.layout.SizeKt.read);
            androidx.compose.ui.Alignment.Companion companion4 = androidx.compose.ui.Alignment.Companion;
            androidx.compose.ui.layout.MeasurePolicy measurePolicy = androidx.compose.foundation.layout.BoxKt.read(companion4.getTopStart(), false);
            int iHashCode2 = Long.hashCode(getpostalcode6.RatingCompat);
            DragAndDropNodestartDragAndDropTransfer1 dragAndDropNodestartDragAndDropTransfer1Serializer2 = getpostalcode6.serializer();
            androidx.compose.ui.Modifier modifierMaterializeModifier2 = androidx.compose.ui.ComposedModifierKt.materializeModifier(getpostalcode6, modifierThen);
            androidx.compose.ui.node.ComposeUiNode.Companion companion5 = androidx.compose.ui.node.ComposeUiNode.Companion;
            r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 constructor2 = companion5.getConstructor();
            if (getpostalcode6.read == null) {
                SentryUUID.write();
                throw null;
            }
            int i18 = write + 17;
            IconCompatParcelizer = i18 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i19 = i18 % 2;
            getpostalcode6.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg();
            if (getpostalcode6.ComponentActivity) {
                getpostalcode6.serializer(constructor2);
            } else {
                getpostalcode6.r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28();
            }
            af$$ExternalSyntheticOutline0.m(companion5, getpostalcode6, measurePolicy, getpostalcode6, dragAndDropNodestartDragAndDropTransfer1Serializer2);
            AndroidContentCaptureManagerCompanion.write(getpostalcode6, modifierMaterializeModifier2, m1$$ExternalSyntheticOutline0.m(companion5, getpostalcode6, Integer.valueOf(iHashCode2), getpostalcode6));
            androidx.compose.ui.text.TextStyle textStyle = (androidx.compose.ui.text.TextStyle) performLayout.MediaBrowserCompatMediaItem.MediaSessionCompatResultReceiverWrapper();
            androidx.compose.material3.TextKt.m131TextNvy7gAk(this.serializer, androidx.compose.foundation.layout.BoxScopeInstance.serializer.align(companion3, companion4.getCenter()), ((buildMapping) getpostalcode6.write((getNewPassword) performMeasureDjhGOtQ.RemoteActionCompatParcelizer)).getPopupTheme(), 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, textStyle.m3102copyp1EtxEg((15204351 & 1) != 0 ? textStyle.spanStyle.m3016getColor0d7_KjU() : 0L, (15204351 & 2) != 0 ? textStyle.spanStyle.m3017getFontSizeXSAIIZE() : 0L, (15204351 & 4) != 0 ? textStyle.spanStyle.getFontWeight() : null, (15204351 & 8) != 0 ? textStyle.spanStyle.m3018getFontStyle4Lr2A7w() : null, (15204351 & 16) != 0 ? textStyle.spanStyle.m3019getFontSynthesisZQGJjVo() : null, (15204351 & 32) != 0 ? textStyle.spanStyle.getFontFamily() : null, (15204351 & 64) != 0 ? textStyle.spanStyle.getFontFeatureSettings() : null, (15204351 & androidx.compose.ui.graphics.Fields.SpotShadowColor) != 0 ? textStyle.spanStyle.m3020getLetterSpacingXSAIIZE() : 0L, (15204351 & androidx.compose.ui.graphics.Fields.RotationX) != 0 ? textStyle.spanStyle.m3015getBaselineShift5SSeXJ0() : null, (15204351 & androidx.compose.ui.graphics.Fields.RotationY) != 0 ? textStyle.spanStyle.getTextGeometricTransform() : null, (15204351 & androidx.compose.ui.graphics.Fields.RotationZ) != 0 ? textStyle.spanStyle.getLocaleList() : null, (15204351 & androidx.compose.ui.graphics.Fields.CameraDistance) != 0 ? textStyle.spanStyle.m3014getBackground0d7_KjU() : 0L, (15204351 & androidx.compose.ui.graphics.Fields.TransformOrigin) != 0 ? textStyle.spanStyle.getTextDecoration() : null, (15204351 & 8192) != 0 ? textStyle.spanStyle.getShadow() : null, (15204351 & androidx.compose.ui.graphics.Fields.Clip) != 0 ? textStyle.spanStyle.getDrawStyle() : null, (15204351 & androidx.compose.ui.graphics.Fields.CompositingStrategy) != 0 ? textStyle.paragraphStyle.m2955getTextAligne0LSkKk() : androidx.compose.ui.text.style.TextAlign.Companion.m3511getCentere0LSkKk(), (15204351 & 65536) != 0 ? textStyle.paragraphStyle.m2957getTextDirections_7Xco() : 0, (15204351 & androidx.compose.ui.graphics.Fields.RenderEffect) != 0 ? textStyle.paragraphStyle.m2953getLineHeightXSAIIZE() : 0L, (15204351 & androidx.compose.ui.graphics.Fields.ColorFilter) != 0 ? textStyle.paragraphStyle.getTextIndent() : null, (15204351 & androidx.compose.ui.graphics.Fields.BlendMode) != 0 ? textStyle.platformStyle : null, (15204351 & 1048576) != 0 ? textStyle.paragraphStyle.getLineHeightStyle() : null, (15204351 & 2097152) != 0 ? textStyle.paragraphStyle.m2952getLineBreakrAG3T2k() : 0, (15204351 & 4194304) != 0 ? textStyle.paragraphStyle.m2950getHyphensvmbZdU8() : 0, (15204351 & 8388608) != 0 ? textStyle.paragraphStyle.getTextMotion() : null), getpostalcode6, 0, 0, 131064);
            getpostalcode6.IconCompatParcelizer(true);
        } else {
            getpostalcode6.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
        }
        return createfromparcel;
    }
}
