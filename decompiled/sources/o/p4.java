package o;

import androidx.compose.ui.tooling.ComposeViewAdapter$$ExternalSyntheticLambda2;
import bo.app.af$$ExternalSyntheticOutline0;
import bo.app.c8$$ExternalSyntheticOutline0;
import bo.app.m1$$ExternalSyntheticOutline0;
import com.deliveryhero.fwf_customer_profile.util.ConstantsKt;
import com.roadrunner.designsystem.compose.theme.tokens.Dimensions;
import com.roadrunner.rrds.compose.component.buttons.PrimaryKt;
import com.roadrunner.rrds.compose.component.buttons.TertiaryKt;
import com.roadrunner.rrds.compose.component.indicators.TagsKt;
import io.sentry.SentryUUID;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class p4 implements r8lambdafjQ9B8d5OSR_i2BAJDXqNW6RNrY {
    private static int MediaBrowserCompatMediaItem = 1;
    private static int MediaSessionCompatQueueItem;
    public final /* synthetic */ int IconCompatParcelizer;
    public final /* synthetic */ boolean RemoteActionCompatParcelizer;
    public final /* synthetic */ Object read;
    public final /* synthetic */ Object serializer;
    public final /* synthetic */ Object write;

    public /* synthetic */ p4(int i, Object obj, Object obj2, Object obj3, boolean z) {
        this.IconCompatParcelizer = i;
        this.write = obj;
        this.read = obj2;
        this.RemoteActionCompatParcelizer = z;
        this.serializer = obj3;
    }

    public /* synthetic */ p4(Object obj, boolean z, r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k0, r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k1, int i) {
        this.IconCompatParcelizer = i;
        this.write = obj;
        this.RemoteActionCompatParcelizer = z;
        this.read = r8lambdardpfsr94j4iebcwx_kpqzpm8k0;
        this.serializer = r8lambdardpfsr94j4iebcwx_kpqzpm8k1;
    }

    /* JADX WARN: Code duplicated, block: B:12:0x0051  */
    /* JADX WARN: Code duplicated, block: B:81:0x0410  */
    /* JADX WARN: Code duplicated, block: B:82:0x0414  */
    @Override // o.r8lambdafjQ9B8d5OSR_i2BAJDXqNW6RNrY
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        boolean z;
        boolean z2;
        boolean z3;
        int i = 2;
        int i2 = 2 % 2;
        int i3 = MediaSessionCompatQueueItem + 117;
        MediaBrowserCompatMediaItem = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i4 = i3 % 2;
        int i5 = this.IconCompatParcelizer;
        boolean z4 = this.RemoteActionCompatParcelizer;
        createFromParcel createfromparcel = createFromParcel.INSTANCE;
        Object obj4 = this.serializer;
        Object obj5 = this.read;
        Object obj6 = this.write;
        int i6 = 16;
        if (i5 == 0) {
            String str = (String) obj6;
            String str2 = (String) obj5;
            String str3 = (String) obj4;
            getBirthDateFull getbirthdatefull = (getBirthDateFull) obj2;
            int iIntValue = ((Integer) obj3).intValue();
            ((ModalBottomSheetDialogWrapper) obj).getClass();
            getPostalCode getpostalcode = (getPostalCode) getbirthdatefull;
            if (getpostalcode.write(iIntValue & 1, (iIntValue & 17) != 16)) {
                androidx.compose.ui.Modifier.Companion companion = androidx.compose.ui.Modifier.Companion;
                androidx.compose.ui.Modifier modifierWrite = androidx.compose.foundation.layout.SizeKt.write(androidx.compose.foundation.layout.PaddingKt.write(companion, Dimensions.setTabContainer), 1.0f);
                ModalBottomSheetYbuCTN8 modalBottomSheetYbuCTN8Serializer = ModalBottomSheetKtModalBottomSheet311.serializer(androidx.compose.foundation.layout.Arrangement.MediaDescriptionCompat, androidx.compose.ui.Alignment.Companion.getCenterHorizontally(), getpostalcode, 48);
                int iHashCode = Long.hashCode(getpostalcode.RatingCompat);
                DragAndDropNodestartDragAndDropTransfer1 dragAndDropNodestartDragAndDropTransfer1Serializer = getpostalcode.serializer();
                androidx.compose.ui.Modifier modifierMaterializeModifier = androidx.compose.ui.ComposedModifierKt.materializeModifier(getpostalcode, modifierWrite);
                androidx.compose.ui.node.ComposeUiNode.Companion companion2 = androidx.compose.ui.node.ComposeUiNode.Companion;
                r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 constructor = companion2.getConstructor();
                if (getpostalcode.read == null) {
                    SentryUUID.write();
                    throw null;
                }
                int i7 = MediaSessionCompatQueueItem + 75;
                MediaBrowserCompatMediaItem = i7 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                int i8 = i7 % 2;
                getpostalcode.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg();
                if (getpostalcode.ComponentActivity) {
                    getpostalcode.serializer(constructor);
                } else {
                    getpostalcode.r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28();
                }
                c8$$ExternalSyntheticOutline0.m(companion2, getpostalcode, modalBottomSheetYbuCTN8Serializer, getpostalcode, dragAndDropNodestartDragAndDropTransfer1Serializer);
                AndroidContentCaptureManagerCompanion.write(getpostalcode, modifierMaterializeModifier, m1$$ExternalSyntheticOutline0.m(companion2, getpostalcode, Integer.valueOf(iHashCode), getpostalcode));
                setCurrentSemanticsNodesui setcurrentsemanticsnodesui = AndroidContentDataType.RemoteActionCompatParcelizer;
                androidx.compose.ui.text.TextStyle textStyle = ((getAndroidAutofillType) getpostalcode.write((getNewPassword) setcurrentsemanticsnodesui)).r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus;
                androidx.compose.ui.text.font.FontWeight.Companion companion3 = androidx.compose.ui.text.font.FontWeight.Companion;
                androidx.compose.material3.TextKt.m131TextNvy7gAk(str, null, 0L, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, textStyle.m3102copyp1EtxEg((15204351 & 1) != 0 ? textStyle.spanStyle.m3016getColor0d7_KjU() : 0L, (15204351 & 2) != 0 ? textStyle.spanStyle.m3017getFontSizeXSAIIZE() : 0L, (15204351 & 4) != 0 ? textStyle.spanStyle.getFontWeight() : companion3.getBold(), (15204351 & 8) != 0 ? textStyle.spanStyle.m3018getFontStyle4Lr2A7w() : null, (15204351 & 16) != 0 ? textStyle.spanStyle.m3019getFontSynthesisZQGJjVo() : null, (15204351 & 32) != 0 ? textStyle.spanStyle.getFontFamily() : null, (15204351 & 64) != 0 ? textStyle.spanStyle.getFontFeatureSettings() : null, (15204351 & androidx.compose.ui.graphics.Fields.SpotShadowColor) != 0 ? textStyle.spanStyle.m3020getLetterSpacingXSAIIZE() : 0L, (15204351 & androidx.compose.ui.graphics.Fields.RotationX) != 0 ? textStyle.spanStyle.m3015getBaselineShift5SSeXJ0() : null, (15204351 & androidx.compose.ui.graphics.Fields.RotationY) != 0 ? textStyle.spanStyle.getTextGeometricTransform() : null, (15204351 & androidx.compose.ui.graphics.Fields.RotationZ) != 0 ? textStyle.spanStyle.getLocaleList() : null, (15204351 & androidx.compose.ui.graphics.Fields.CameraDistance) != 0 ? textStyle.spanStyle.m3014getBackground0d7_KjU() : 0L, (15204351 & androidx.compose.ui.graphics.Fields.TransformOrigin) != 0 ? textStyle.spanStyle.getTextDecoration() : null, (15204351 & 8192) != 0 ? textStyle.spanStyle.getShadow() : null, (15204351 & androidx.compose.ui.graphics.Fields.Clip) != 0 ? textStyle.spanStyle.getDrawStyle() : null, (15204351 & androidx.compose.ui.graphics.Fields.CompositingStrategy) != 0 ? textStyle.paragraphStyle.m2955getTextAligne0LSkKk() : 0, (15204351 & 65536) != 0 ? textStyle.paragraphStyle.m2957getTextDirections_7Xco() : 0, (15204351 & androidx.compose.ui.graphics.Fields.RenderEffect) != 0 ? textStyle.paragraphStyle.m2953getLineHeightXSAIIZE() : 0L, (15204351 & androidx.compose.ui.graphics.Fields.ColorFilter) != 0 ? textStyle.paragraphStyle.getTextIndent() : null, (15204351 & androidx.compose.ui.graphics.Fields.BlendMode) != 0 ? textStyle.platformStyle : null, (15204351 & 1048576) != 0 ? textStyle.paragraphStyle.getLineHeightStyle() : null, (15204351 & 2097152) != 0 ? textStyle.paragraphStyle.m2952getLineBreakrAG3T2k() : 0, (15204351 & 4194304) != 0 ? textStyle.paragraphStyle.m2950getHyphensvmbZdU8() : 0, (15204351 & 8388608) != 0 ? textStyle.paragraphStyle.getTextMotion() : null), getpostalcode, 0, 0, 131070);
                long emojiCompatEnabled = ((buildMapping) getpostalcode.write((getNewPassword) performMeasureDjhGOtQ.RemoteActionCompatParcelizer)).setEmojiCompatEnabled();
                androidx.compose.ui.text.TextStyle textStyle2 = ((getAndroidAutofillType) getpostalcode.write((getNewPassword) setcurrentsemanticsnodesui)).RatingCompat;
                androidx.compose.material3.TextKt.m131TextNvy7gAk(str2, androidx.compose.foundation.layout.PaddingKt.write(companion, Dimensions.setStackedBackground), emojiCompatEnabled, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, textStyle2.m3102copyp1EtxEg((15204351 & 1) != 0 ? textStyle2.spanStyle.m3016getColor0d7_KjU() : 0L, (15204351 & 2) != 0 ? textStyle2.spanStyle.m3017getFontSizeXSAIIZE() : 0L, (15204351 & 4) != 0 ? textStyle2.spanStyle.getFontWeight() : companion3.getBold(), (15204351 & 8) != 0 ? textStyle2.spanStyle.m3018getFontStyle4Lr2A7w() : null, (15204351 & 16) != 0 ? textStyle2.spanStyle.m3019getFontSynthesisZQGJjVo() : null, (15204351 & 32) != 0 ? textStyle2.spanStyle.getFontFamily() : null, (15204351 & 64) != 0 ? textStyle2.spanStyle.getFontFeatureSettings() : null, (15204351 & androidx.compose.ui.graphics.Fields.SpotShadowColor) != 0 ? textStyle2.spanStyle.m3020getLetterSpacingXSAIIZE() : 0L, (15204351 & androidx.compose.ui.graphics.Fields.RotationX) != 0 ? textStyle2.spanStyle.m3015getBaselineShift5SSeXJ0() : null, (15204351 & androidx.compose.ui.graphics.Fields.RotationY) != 0 ? textStyle2.spanStyle.getTextGeometricTransform() : null, (15204351 & androidx.compose.ui.graphics.Fields.RotationZ) != 0 ? textStyle2.spanStyle.getLocaleList() : null, (15204351 & androidx.compose.ui.graphics.Fields.CameraDistance) != 0 ? textStyle2.spanStyle.m3014getBackground0d7_KjU() : 0L, (15204351 & androidx.compose.ui.graphics.Fields.TransformOrigin) != 0 ? textStyle2.spanStyle.getTextDecoration() : null, (15204351 & 8192) != 0 ? textStyle2.spanStyle.getShadow() : null, (15204351 & androidx.compose.ui.graphics.Fields.Clip) != 0 ? textStyle2.spanStyle.getDrawStyle() : null, (15204351 & androidx.compose.ui.graphics.Fields.CompositingStrategy) != 0 ? textStyle2.paragraphStyle.m2955getTextAligne0LSkKk() : 0, (15204351 & 65536) != 0 ? textStyle2.paragraphStyle.m2957getTextDirections_7Xco() : 0, (15204351 & androidx.compose.ui.graphics.Fields.RenderEffect) != 0 ? textStyle2.paragraphStyle.m2953getLineHeightXSAIIZE() : 0L, (15204351 & androidx.compose.ui.graphics.Fields.ColorFilter) != 0 ? textStyle2.paragraphStyle.getTextIndent() : null, (15204351 & androidx.compose.ui.graphics.Fields.BlendMode) != 0 ? textStyle2.platformStyle : null, (15204351 & 1048576) != 0 ? textStyle2.paragraphStyle.getLineHeightStyle() : null, (15204351 & 2097152) != 0 ? textStyle2.paragraphStyle.m2952getLineBreakrAG3T2k() : 0, (15204351 & 4194304) != 0 ? textStyle2.paragraphStyle.m2950getHyphensvmbZdU8() : 0, (15204351 & 8388608) != 0 ? textStyle2.paragraphStyle.getTextMotion() : null), getpostalcode, 0, 0, 131064);
                if (z4) {
                    getpostalcode.serializer(-707112469);
                    TagsKt.serializer(2032277805, onMessageReceived.IconCompatParcelizer(), onMessageReceived.IconCompatParcelizer(), -2032277804, new Object[]{str3, androidx.compose.foundation.layout.SizeKt.IconCompatParcelizer(companion, null, 3), Integer.valueOf(com.logistics.rider.glovo.R.drawable.ic_clock), 0, getpostalcode, 48, 24}, onMessageReceived.IconCompatParcelizer(), onMessageReceived.IconCompatParcelizer());
                    getpostalcode.IconCompatParcelizer(false);
                } else {
                    getpostalcode.serializer(-706886293);
                    TagsKt.serializer(str3, androidx.compose.foundation.layout.SizeKt.IconCompatParcelizer(companion, null, 3), com.logistics.rider.glovo.R.drawable.ic_clock, 0, getpostalcode, 48, 24);
                    getpostalcode.IconCompatParcelizer(false);
                }
                getpostalcode.IconCompatParcelizer(true);
            } else {
                getpostalcode.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
            }
            return createfromparcel;
        }
        if (i5 != 1) {
            if (i5 == 2) {
                String str4 = (String) obj6;
                r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k0 = (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) obj5;
                r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k1 = (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) obj4;
                getBirthDateFull getbirthdatefull2 = (getBirthDateFull) obj2;
                int iIntValue2 = ((Integer) obj3).intValue();
                ((String) obj).getClass();
                getPostalCode getpostalcode2 = (getPostalCode) getbirthdatefull2;
                if (getpostalcode2.write(1 & iIntValue2, (iIntValue2 & 17) != 16)) {
                    com.roadrunner.rrds.compose.component.tooltip.TooltipKt.m5064TooltipgHHVGI(str4, coil3.ExtrasKt.write(1540631303, new DefaultLazyKey(i6, r8lambdardpfsr94j4iebcwx_kpqzpm8k1), getpostalcode2), null, 0L, 0L, null, Dimensions.setStackedBackground, 0.0f, this.RemoteActionCompatParcelizer, false, false, false, null, null, r8lambdardpfsr94j4iebcwx_kpqzpm8k0, getpostalcode2, 48, 0, 32124);
                } else {
                    getpostalcode2.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
                }
                return createfromparcel;
            }
            getTypeConverter gettypeconverter = (getTypeConverter) obj6;
            r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k2 = (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) obj5;
            r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k3 = (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) obj4;
            getBirthDateFull getbirthdatefull3 = (getBirthDateFull) obj2;
            int iIntValue3 = ((Integer) obj3).intValue();
            ((ModalBottomSheetDialogWrapper) obj).getClass();
            if ((iIntValue3 & 17) != 16) {
                int i9 = MediaSessionCompatQueueItem + 111;
                MediaBrowserCompatMediaItem = i9 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                if (i9 % 2 == 0) {
                    z3 = false;
                } else {
                    z3 = true;
                }
            } else {
                z3 = false;
            }
            getPostalCode getpostalcode3 = (getPostalCode) getbirthdatefull3;
            if (!getpostalcode3.write(iIntValue3 & 1, z3)) {
                getpostalcode3.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
            } else {
                int i10 = MediaBrowserCompatMediaItem + 43;
                MediaSessionCompatQueueItem = i10 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                int i11 = i10 % 2;
                androidx.compose.ui.Modifier.Companion companion4 = androidx.compose.ui.Modifier.Companion;
                float f = Dimensions.getAnimatedVisibility;
                androidx.compose.ui.Modifier modifierWrite2 = androidx.compose.foundation.layout.PaddingKt.write(companion4, f);
                ModalBottomSheetYbuCTN8 modalBottomSheetYbuCTN8Serializer2 = ModalBottomSheetKtModalBottomSheet311.serializer(androidx.compose.foundation.layout.Arrangement.MediaDescriptionCompat, androidx.compose.ui.Alignment.Companion.getStart(), getpostalcode3, 0);
                int iHashCode2 = Long.hashCode(getpostalcode3.RatingCompat);
                DragAndDropNodestartDragAndDropTransfer1 dragAndDropNodestartDragAndDropTransfer1Serializer2 = getpostalcode3.serializer();
                androidx.compose.ui.Modifier modifierMaterializeModifier2 = androidx.compose.ui.ComposedModifierKt.materializeModifier(getpostalcode3, modifierWrite2);
                androidx.compose.ui.node.ComposeUiNode.Companion companion5 = androidx.compose.ui.node.ComposeUiNode.Companion;
                r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 constructor2 = companion5.getConstructor();
                if (getpostalcode3.read == null) {
                    SentryUUID.write();
                    throw null;
                }
                getpostalcode3.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg();
                if (getpostalcode3.ComponentActivity) {
                    int i12 = MediaSessionCompatQueueItem + 111;
                    MediaBrowserCompatMediaItem = i12 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                    if (i12 % 2 == 0) {
                        getpostalcode3.serializer(constructor2);
                        int i13 = 4 / 0;
                    } else {
                        getpostalcode3.serializer(constructor2);
                    }
                } else {
                    getpostalcode3.r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28();
                }
                c8$$ExternalSyntheticOutline0.m(companion5, getpostalcode3, modalBottomSheetYbuCTN8Serializer2, getpostalcode3, dragAndDropNodestartDragAndDropTransfer1Serializer2);
                AndroidContentCaptureManagerCompanion.write(getpostalcode3, modifierMaterializeModifier2, m1$$ExternalSyntheticOutline0.m(companion5, getpostalcode3, Integer.valueOf(iHashCode2), getpostalcode3));
                String strStringResource = androidx.compose.ui.res.StringResources_androidKt.stringResource(gettypeconverter.read, getpostalcode3, 0);
                androidx.compose.ui.text.TextStyle textStyle3 = (androidx.compose.ui.text.TextStyle) performLayout.getDefaultViewModelProviderFactory.MediaSessionCompatResultReceiverWrapper();
                setCurrentSemanticsNodesui setcurrentsemanticsnodesui2 = performMeasureDjhGOtQ.RemoteActionCompatParcelizer;
                androidx.compose.material3.TextKt.m131TextNvy7gAk(strStringResource, null, ((buildMapping) getpostalcode3.write((getNewPassword) setcurrentsemanticsnodesui2)).WindowCallbackWrapper(), 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, textStyle3, getpostalcode3, 0, 0, 131066);
                coil3.ExtrasKt.read(913837329, handleUrlOverridelambda1.RemoteActionCompatParcelizer(), handleUrlOverridelambda1.RemoteActionCompatParcelizer(), -913837326, handleUrlOverridelambda1.RemoteActionCompatParcelizer(), handleUrlOverridelambda1.RemoteActionCompatParcelizer(), new Object[]{getpostalcode3, androidx.compose.foundation.layout.SizeKt.m75height3ABfNKs(companion4, Dimensions.setPrimaryBackground)});
                androidx.compose.material3.TextKt.m131TextNvy7gAk(androidx.compose.ui.res.StringResources_androidKt.stringResource(gettypeconverter.IconCompatParcelizer, getpostalcode3, 0), null, ((buildMapping) getpostalcode3.write((getNewPassword) setcurrentsemanticsnodesui2)).WindowCallbackWrapper(), 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, performLayout.PlaybackStateCompatCustomAction(), getpostalcode3, 0, 0, 131066);
                PrimaryKt.write(androidx.compose.ui.res.StringResources_androidKt.stringResource(gettypeconverter.RemoteActionCompatParcelizer, getpostalcode3, 0), r8lambdardpfsr94j4iebcwx_kpqzpm8k2, androidx.compose.foundation.layout.PaddingKt.m74paddingqDBjuR0$default(androidx.compose.foundation.layout.SizeKt.write(companion4, 1.0f), 0.0f, f, 0.0f, 0.0f, 13), true, false, null, null, null, null, null, getpostalcode3, 3072, 0, 2032);
                if (z4) {
                    int i14 = MediaSessionCompatQueueItem + 37;
                    MediaBrowserCompatMediaItem = i14 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                    int i15 = i14 % 2;
                    getpostalcode3.serializer(-178273150);
                    TertiaryKt.IconCompatParcelizer(androidx.compose.ui.res.StringResources_androidKt.stringResource(gettypeconverter.write, getpostalcode3, 0), r8lambdardpfsr94j4iebcwx_kpqzpm8k3, androidx.compose.foundation.layout.PaddingKt.m74paddingqDBjuR0$default(androidx.compose.foundation.layout.SizeKt.write(companion4, 1.0f), 0.0f, Dimensions.setStackedBackground, 0.0f, 0.0f, 13), true, 0, null, null, null, getpostalcode3, 3072, 240);
                    getpostalcode3.IconCompatParcelizer(false);
                } else {
                    getpostalcode3.serializer(-177930600);
                    getpostalcode3.IconCompatParcelizer(false);
                }
                getpostalcode3.IconCompatParcelizer(true);
            }
            return createfromparcel;
        }
        LayoutCompatJustificationMode layoutCompatJustificationMode = (LayoutCompatJustificationMode) obj6;
        r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k4 = (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) obj5;
        r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k5 = (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) obj4;
        ProgressIndicatorKt progressIndicatorKt = (ProgressIndicatorKt) obj;
        getBirthDateFull getbirthdatefull4 = (getBirthDateFull) obj2;
        int iIntValue4 = ((Integer) obj3).intValue();
        progressIndicatorKt.getClass();
        if ((iIntValue4 & 6) == 0) {
            iIntValue4 |= ((getPostalCode) getbirthdatefull4).read(progressIndicatorKt) ? 4 : 2;
        }
        getPostalCode getpostalcode4 = (getPostalCode) getbirthdatefull4;
        if (getpostalcode4.write(iIntValue4 & 1, (iIntValue4 & 19) != 18)) {
            MathUtils mathUtils = layoutCompatJustificationMode.RemoteActionCompatParcelizer;
            String str5 = mathUtils != null ? mathUtils.read : null;
            if (str5 == null) {
                getpostalcode4.serializer(1479395527);
                z = false;
                getpostalcode4.IconCompatParcelizer(false);
            } else {
                getpostalcode4.serializer(1479395528);
                androidx.compose.ui.text.TextStyle textStyle4 = (androidx.compose.ui.text.TextStyle) performLayout.getLifecycle.MediaSessionCompatResultReceiverWrapper();
                long supportBackgroundTintList = ((buildMapping) getpostalcode4.write((getNewPassword) performMeasureDjhGOtQ.RemoteActionCompatParcelizer)).setSupportBackgroundTintList();
                int iM3511getCentere0LSkKk = androidx.compose.ui.text.style.TextAlign.Companion.m3511getCentere0LSkKk();
                androidx.compose.ui.Modifier modifierWrite3 = ((drawCircularIndicator42QJj7c) progressIndicatorKt).write(androidx.compose.ui.Modifier.Companion);
                modifierWrite3.getClass();
                androidx.compose.material3.TextKt.m131TextNvy7gAk(str5, modifierWrite3, supportBackgroundTintList, 0L, null, null, 0L, androidx.compose.ui.text.style.TextAlign.m3504boximpl(iM3511getCentere0LSkKk), 0L, 0, false, 0, 0, null, textStyle4, getpostalcode4, 0, 0, 130040);
                z = false;
                getpostalcode4.IconCompatParcelizer(false);
            }
            String str6 = layoutCompatJustificationMode.IconCompatParcelizer;
            if (str6 == null) {
                getpostalcode4.serializer(1479941282);
                getpostalcode4.IconCompatParcelizer(z);
            } else {
                getpostalcode4.serializer(1479941283);
                androidx.compose.ui.Modifier.Companion companion6 = androidx.compose.ui.Modifier.Companion;
                coil3.ExtrasKt.read(913837329, handleUrlOverridelambda1.RemoteActionCompatParcelizer(), handleUrlOverridelambda1.RemoteActionCompatParcelizer(), -913837326, handleUrlOverridelambda1.RemoteActionCompatParcelizer(), handleUrlOverridelambda1.RemoteActionCompatParcelizer(), new Object[]{getpostalcode4, androidx.compose.foundation.layout.SizeKt.m86width3ABfNKs(companion6, androidx.compose.ui.unit.Dp.m3673constructorimpl(3.0f))});
                androidx.compose.ui.text.TextStyle textStyleWrite = performLayout.write();
                long onMenuItemClickListener = ((buildMapping) getpostalcode4.write((getNewPassword) performMeasureDjhGOtQ.RemoteActionCompatParcelizer)).setOnMenuItemClickListener();
                androidx.compose.ui.Modifier modifierWrite4 = ((drawCircularIndicator42QJj7c) progressIndicatorKt).write(companion6);
                modifierWrite4.getClass();
                androidx.compose.material3.TextKt.m131TextNvy7gAk(str6, modifierWrite4, onMenuItemClickListener, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, textStyleWrite, getpostalcode4, 0, 0, 131064);
                z = false;
                getpostalcode4.IconCompatParcelizer(false);
            }
            String str7 = layoutCompatJustificationMode.MediaDescriptionCompat;
            if (str7 == null) {
                getpostalcode4.serializer(1480548386);
                getpostalcode4.IconCompatParcelizer(z);
                int i16 = MediaSessionCompatQueueItem + 19;
                MediaBrowserCompatMediaItem = i16 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                int i17 = i16 % 2;
            } else {
                getpostalcode4.serializer(1480548387);
                androidx.compose.ui.Modifier.Companion companion7 = androidx.compose.ui.Modifier.Companion;
                float f2 = Dimensions.getActionBarHideOffset;
                coil3.ExtrasKt.read(913837329, handleUrlOverridelambda1.RemoteActionCompatParcelizer(), handleUrlOverridelambda1.RemoteActionCompatParcelizer(), -913837326, handleUrlOverridelambda1.RemoteActionCompatParcelizer(), handleUrlOverridelambda1.RemoteActionCompatParcelizer(), new Object[]{getpostalcode4, androidx.compose.foundation.layout.SizeKt.m86width3ABfNKs(companion7, f2)});
                Object objComponentActivity = getpostalcode4.ComponentActivity();
                if (objComponentActivity == getCreditCardExpirationMonth.write) {
                    objComponentActivity = new ComposeViewAdapter$$ExternalSyntheticLambda2(10);
                    getpostalcode4.write(objComponentActivity);
                }
                androidx.compose.ui.Modifier modifierWrite5 = ((drawCircularIndicator42QJj7c) progressIndicatorKt).write(androidx.compose.foundation.layout.OffsetKt.read(androidx.compose.ui.layout.LayoutModifierKt.layout(companion7, (r8lambdafjQ9B8d5OSR_i2BAJDXqNW6RNrY) objComponentActivity), androidx.compose.ui.unit.Dp.m3673constructorimpl(0.0f), f2));
                androidx.compose.ui.layout.MeasurePolicy measurePolicy = androidx.compose.foundation.layout.BoxKt.read(androidx.compose.ui.Alignment.Companion.getTopStart(), false);
                int iHashCode3 = Long.hashCode(getpostalcode4.RatingCompat);
                DragAndDropNodestartDragAndDropTransfer1 dragAndDropNodestartDragAndDropTransfer1Serializer3 = getpostalcode4.serializer();
                androidx.compose.ui.Modifier modifierMaterializeModifier3 = androidx.compose.ui.ComposedModifierKt.materializeModifier(getpostalcode4, modifierWrite5);
                androidx.compose.ui.node.ComposeUiNode.Companion companion8 = androidx.compose.ui.node.ComposeUiNode.Companion;
                r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 constructor3 = companion8.getConstructor();
                if (getpostalcode4.read == null) {
                    SentryUUID.write();
                    throw null;
                }
                int i18 = MediaSessionCompatQueueItem + 83;
                MediaBrowserCompatMediaItem = i18 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                if (i18 % 2 == 0) {
                    getpostalcode4.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg();
                    int i19 = 12 / 0;
                    if (getpostalcode4.ComponentActivity) {
                        getpostalcode4.serializer(constructor3);
                    } else {
                        getpostalcode4.r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28();
                    }
                } else {
                    getpostalcode4.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg();
                    if (getpostalcode4.ComponentActivity) {
                        getpostalcode4.serializer(constructor3);
                    } else {
                        getpostalcode4.r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28();
                    }
                }
                af$$ExternalSyntheticOutline0.m(companion8, getpostalcode4, measurePolicy, getpostalcode4, dragAndDropNodestartDragAndDropTransfer1Serializer3);
                AndroidContentCaptureManagerCompanion.write(getpostalcode4, modifierMaterializeModifier3, m1$$ExternalSyntheticOutline0.m(companion8, getpostalcode4, Integer.valueOf(iHashCode3), getpostalcode4));
                if (z4) {
                    getpostalcode4.serializer(-1970196034);
                    com.roadrunner.rrds.compose.component.tooltip.TooltipKt.m5064TooltipgHHVGI(str7, coil3.ExtrasKt.write(-731235506, new DefaultLazyKey(i, r8lambdardpfsr94j4iebcwx_kpqzpm8k5), getpostalcode4), null, 0L, 0L, null, 0.0f, 0.0f, true, false, false, false, Long.valueOf(ConstantsKt.DEFAULT_REQUEST_TIMEOUT), null, r8lambdardpfsr94j4iebcwx_kpqzpm8k4, getpostalcode4, 805306416, 3072, 24060);
                    z2 = false;
                    getpostalcode4.IconCompatParcelizer(false);
                } else {
                    getpostalcode4.serializer(-1969272079);
                    androidx.compose.ui.Modifier modifierM83size3ABfNKs = androidx.compose.foundation.layout.SizeKt.m83size3ABfNKs(companion7, Dimensions.setActionBarVisibilityCallback);
                    modifierM83size3ABfNKs.getClass();
                    getRootCause.read(com.logistics.rider.glovo.R.drawable.ic_info_circle, r8lambdardpfsr94j4iebcwx_kpqzpm8k5, modifierM83size3ABfNKs, null, false, null, null, getpostalcode4, 0, 248);
                    z2 = false;
                    getpostalcode4.IconCompatParcelizer(false);
                }
                getpostalcode4.IconCompatParcelizer(true);
                getpostalcode4.IconCompatParcelizer(z2);
            }
        } else {
            getpostalcode4.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
        }
        return createfromparcel;
    }
}
