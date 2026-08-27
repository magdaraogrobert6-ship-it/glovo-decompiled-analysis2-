package com.roadrunner.customerchat.legacy.chatlist.presentation.compose;

import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.interaction.MutableInteractionSourceImpl;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.material3.TextKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.graphics.Fields;
import androidx.compose.ui.graphics.RectangleShapeKt;
import androidx.compose.ui.graphics.painter.Painter;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.res.PainterResources_androidKt;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.FontFamilyKt;
import androidx.compose.ui.text.font.FontKt;
import androidx.compose.ui.text.style.TextOverflow;
import bo.app.af$$ExternalSyntheticOutline0;
import bo.app.c8$$ExternalSyntheticOutline0;
import bo.app.d$$ExternalSyntheticOutline0;
import bo.app.m1$$ExternalSyntheticOutline0;
import coil3.ExtrasKt;
import com.braze.ui.support.ViewUtils$$ExternalSyntheticLambda6;
import com.incognia.internal.pcn;
import com.logistics.rider.glovo.R;
import com.roadrunner.designsystem.compose.theme.tokens.Dimensions;
import io.sentry.SentryUUID;
import io.sentry.hints.PlaybackStateCompatCustomAction;
import java.util.Locale;
import kotlinx.coroutines.BuildersKt;
import o.AndroidContentCaptureManager;
import o.AndroidContentCaptureManagerCompanion;
import o.DragAndDropNodestartDragAndDropTransfer1;
import o.FlingCancellationException;
import o.MediaQuery_androidKtobtainUiMediaScope41;
import o.ModalBottomSheetKtModalBottomSheet311;
import o.ModalBottomSheetYbuCTN8;
import o.TextFieldDefaults;
import o.accessgetReusableRectp;
import o.fractionVisibleInRect;
import o.getAddressCountry;
import o.getBirthDateFull;
import o.getCreditCardExpirationMonth;
import o.getHandleruiannotations;
import o.getPostalCode;
import o.handleUrlOverridelambda1;
import o.onReceive;
import o.onViewDetachedFromWindowlambda1;
import o.performLayout;
import o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0;
import o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM;
import o.r8lambdafvzP3Wky1RLLzE56uVXaMHcvU;
import o.supportingTextPaddinga9UjIt4material3default;

/* JADX INFO: loaded from: classes3.dex */
public abstract class CustomerChatItemKt {
    private static int RemoteActionCompatParcelizer = 0;
    private static int serializer = 1;

    public static final void CustomerChatItem(fractionVisibleInRect fractionvisibleinrect, r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm, Modifier modifier, getBirthDateFull getbirthdatefull, int i) {
        int i2;
        boolean z;
        Modifier modifier2;
        long jRatingCompat;
        long jMediaDescriptionCompat;
        long jMediaDescriptionCompat2;
        long jMediaSessionCompatQueueItem;
        long jMediaSessionCompatQueueItem2;
        long jMediaSessionCompatQueueItem3;
        long jMediaSessionCompatQueueItem4;
        boolean z2;
        int i3 = 2 % 2;
        fractionvisibleinrect.getClass();
        boolean z3 = fractionvisibleinrect.MediaDescriptionCompat;
        r8lambdaunavo3sxub_pc9xroryotnrlvsm.getClass();
        getPostalCode getpostalcode = (getPostalCode) getbirthdatefull;
        getpostalcode.MediaSessionCompatQueueItem(456938769);
        getAddressCountry getaddresscountry = getpostalcode.read;
        if ((i & 6) == 0) {
            i2 = i | (getpostalcode.read(fractionvisibleinrect) ? 4 : 2);
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= getpostalcode.IconCompatParcelizer(r8lambdaunavo3sxub_pc9xroryotnrlvsm) ? 32 : 16;
        }
        int i4 = i2 | 384;
        if ((i4 & 147) != 146) {
            int i5 = RemoteActionCompatParcelizer + 75;
            serializer = i5 % Fields.SpotShadowColor;
            int i6 = i5 % 2;
            z = true;
        } else {
            z = false;
        }
        if (getpostalcode.write(i4 & 1, z)) {
            Modifier.Companion companion = Modifier.Companion;
            Modifier modifierSerializer = SizeKt.serializer(SizeKt.write(companion, 1.0f), (Alignment.Vertical) null, 3);
            modifierSerializer.getClass();
            Modifier modifierM20backgroundbw27NRU = BackgroundKt.m20backgroundbw27NRU(modifierSerializer, BuildersKt.RatingCompat(getpostalcode), RectangleShapeKt.getRectangleShape());
            Object objComponentActivity = getpostalcode.ComponentActivity();
            AndroidContentCaptureManager androidContentCaptureManager = getCreditCardExpirationMonth.write;
            if (objComponentActivity == androidContentCaptureManager) {
                objComponentActivity = c8$$ExternalSyntheticOutline0.m(getpostalcode);
            }
            MutableInteractionSourceImpl mutableInteractionSourceImpl = (MutableInteractionSourceImpl) objComponentActivity;
            MediaQuery_androidKtobtainUiMediaScope41 mediaQuery_androidKtobtainUiMediaScope41Serializer = onReceive.serializer(0.0f, BuildersKt.MediaMetadataCompat(getpostalcode), 3);
            boolean z4 = (i4 & 112) == 32;
            boolean z5 = (i4 & 14) == 4;
            Object objComponentActivity2 = getpostalcode.ComponentActivity();
            if ((z4 | z5) || objComponentActivity2 == androidContentCaptureManager) {
                objComponentActivity2 = new ViewUtils$$ExternalSyntheticLambda6(r8lambdaunavo3sxub_pc9xroryotnrlvsm, 7, fractionvisibleinrect);
                getpostalcode.write(objComponentActivity2);
            }
            Modifier modifierSerializer2 = ClickableKt.serializer(modifierM20backgroundbw27NRU, mutableInteractionSourceImpl, mediaQuery_androidKtobtainUiMediaScope41Serializer, false, null, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) objComponentActivity2, 28);
            float f = Dimensions.getNestedScrollAxes;
            Modifier modifierM73paddingVpY3zN4$default = PaddingKt.m73paddingVpY3zN4$default(modifierSerializer2, 0.0f, f, 1);
            FlingCancellationException flingCancellationException = Arrangement.MediaDescriptionCompat;
            Alignment.Companion companion2 = Alignment.Companion;
            ModalBottomSheetYbuCTN8 modalBottomSheetYbuCTN8Serializer = ModalBottomSheetKtModalBottomSheet311.serializer(flingCancellationException, companion2.getStart(), getpostalcode, 0);
            int iHashCode = Long.hashCode(getpostalcode.RatingCompat);
            DragAndDropNodestartDragAndDropTransfer1 dragAndDropNodestartDragAndDropTransfer1Serializer = getpostalcode.serializer();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(getpostalcode, modifierM73paddingVpY3zN4$default);
            ComposeUiNode.Companion companion3 = ComposeUiNode.Companion;
            r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 constructor = companion3.getConstructor();
            if (getaddresscountry == null) {
                SentryUUID.write();
                throw null;
            }
            getpostalcode.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg();
            if (getpostalcode.ComponentActivity) {
                int i7 = RemoteActionCompatParcelizer + 29;
                serializer = i7 % Fields.SpotShadowColor;
                if (i7 % 2 == 0) {
                    getpostalcode.serializer(constructor);
                    int i8 = 45 / 0;
                } else {
                    getpostalcode.serializer(constructor);
                }
            } else {
                getpostalcode.r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28();
            }
            c8$$ExternalSyntheticOutline0.m(companion3, getpostalcode, modalBottomSheetYbuCTN8Serializer, getpostalcode, dragAndDropNodestartDragAndDropTransfer1Serializer);
            AndroidContentCaptureManagerCompanion.write(getpostalcode, modifierMaterializeModifier, m1$$ExternalSyntheticOutline0.m(companion3, getpostalcode, Integer.valueOf(iHashCode), getpostalcode));
            Modifier modifierWrite = SizeKt.write(companion, 1.0f);
            float f2 = Dimensions.setActionBarVisibilityCallback;
            Modifier modifierM73paddingVpY3zN4$default2 = PaddingKt.m73paddingVpY3zN4$default(modifierWrite, f2, 0.0f, 2);
            Alignment.Vertical centerVertically = companion2.getCenterVertically();
            PlaybackStateCompatCustomAction playbackStateCompatCustomAction = Arrangement.MediaBrowserCompatMediaItem;
            supportingTextPaddinga9UjIt4material3default supportingtextpaddinga9ujit4material3defaultSerializer = TextFieldDefaults.serializer(playbackStateCompatCustomAction, centerVertically, getpostalcode, 48);
            int iHashCode2 = Long.hashCode(getpostalcode.RatingCompat);
            DragAndDropNodestartDragAndDropTransfer1 dragAndDropNodestartDragAndDropTransfer1Serializer2 = getpostalcode.serializer();
            Modifier modifierMaterializeModifier2 = ComposedModifierKt.materializeModifier(getpostalcode, modifierM73paddingVpY3zN4$default2);
            r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 constructor2 = companion3.getConstructor();
            if (getaddresscountry == null) {
                SentryUUID.write();
                throw null;
            }
            getpostalcode.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg();
            if (getpostalcode.ComponentActivity) {
                getpostalcode.serializer(constructor2);
            } else {
                getpostalcode.r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28();
            }
            r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.read(companion3, getpostalcode, supportingtextpaddinga9ujit4material3defaultSerializer, getpostalcode, dragAndDropNodestartDragAndDropTransfer1Serializer2);
            AndroidContentCaptureManagerCompanion.write(getpostalcode, modifierMaterializeModifier2, m1$$ExternalSyntheticOutline0.m(companion3, getpostalcode, Integer.valueOf(iHashCode2), getpostalcode));
            MeasurePolicy measurePolicy = BoxKt.read(companion2.getCenter(), false);
            int iHashCode3 = Long.hashCode(getpostalcode.RatingCompat);
            DragAndDropNodestartDragAndDropTransfer1 dragAndDropNodestartDragAndDropTransfer1Serializer3 = getpostalcode.serializer();
            Modifier modifierMaterializeModifier3 = ComposedModifierKt.materializeModifier(getpostalcode, companion);
            r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 constructor3 = companion3.getConstructor();
            if (getaddresscountry == null) {
                SentryUUID.write();
                throw null;
            }
            getpostalcode.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg();
            if (getpostalcode.ComponentActivity) {
                getpostalcode.serializer(constructor3);
            } else {
                getpostalcode.r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28();
            }
            af$$ExternalSyntheticOutline0.m(companion3, getpostalcode, measurePolicy, getpostalcode, dragAndDropNodestartDragAndDropTransfer1Serializer3);
            AndroidContentCaptureManagerCompanion.write(getpostalcode, modifierMaterializeModifier3, m1$$ExternalSyntheticOutline0.m(companion3, getpostalcode, Integer.valueOf(iHashCode3), getpostalcode));
            Painter painterPainterResource = PainterResources_androidKt.painterResource(R.drawable.ic_chat_list_read_bg_fill, getpostalcode, 0);
            ColorFilter.Companion companion4 = ColorFilter.Companion;
            if (z3) {
                int i9 = serializer + 65;
                RemoteActionCompatParcelizer = i9 % Fields.SpotShadowColor;
                int i10 = i9 % 2;
                getpostalcode.serializer(1021997916);
                jRatingCompat = BuildersKt.MediaDescriptionCompat(getpostalcode);
            } else {
                getpostalcode.serializer(1021998682);
                jRatingCompat = BuildersKt.RatingCompat(getpostalcode);
            }
            getpostalcode.IconCompatParcelizer(false);
            ColorFilter colorFilterM763tintxETnrds$default = ColorFilter.Companion.m763tintxETnrds$default(companion4, jRatingCompat, 0, 2, null);
            int i11 = Painter.$stable | 48;
            Object obj = null;
            ImageKt.Image(painterPainterResource, null, null, null, null, 0.0f, colorFilterM763tintxETnrds$default, getpostalcode, i11, 60);
            Painter painterPainterResource2 = PainterResources_androidKt.painterResource(R.drawable.ic_chat_list_read_border, getpostalcode, 0);
            if (z3) {
                getpostalcode.serializer(1022007194);
                jMediaDescriptionCompat = BuildersKt.RatingCompat(getpostalcode);
            } else {
                getpostalcode.serializer(1022007900);
                jMediaDescriptionCompat = BuildersKt.MediaDescriptionCompat(getpostalcode);
            }
            getpostalcode.IconCompatParcelizer(false);
            ImageKt.Image(painterPainterResource2, null, null, null, null, 0.0f, ColorFilter.Companion.m763tintxETnrds$default(companion4, jMediaDescriptionCompat, 0, 2, null), getpostalcode, i11, 60);
            Painter painterPainterResource3 = PainterResources_androidKt.painterResource(R.drawable.ic_chat_list_read_img, getpostalcode, 0);
            if (z3) {
                int i12 = RemoteActionCompatParcelizer + 71;
                serializer = i12 % Fields.SpotShadowColor;
                int i13 = i12 % 2;
                getpostalcode.serializer(1022016378);
                jMediaDescriptionCompat2 = BuildersKt.RatingCompat(getpostalcode);
            } else {
                getpostalcode.serializer(1022017084);
                jMediaDescriptionCompat2 = BuildersKt.MediaDescriptionCompat(getpostalcode);
            }
            getpostalcode.IconCompatParcelizer(false);
            ImageKt.Image(painterPainterResource3, null, null, null, null, 0.0f, ColorFilter.Companion.m763tintxETnrds$default(companion4, jMediaDescriptionCompat2, 0, 2, null), getpostalcode, i11, 60);
            getpostalcode.IconCompatParcelizer(true);
            ExtrasKt.read(913837329, handleUrlOverridelambda1.RemoteActionCompatParcelizer(), handleUrlOverridelambda1.RemoteActionCompatParcelizer(), -913837326, handleUrlOverridelambda1.RemoteActionCompatParcelizer(), handleUrlOverridelambda1.RemoteActionCompatParcelizer(), new Object[]{getpostalcode, SizeKt.m86width3ABfNKs(companion, f)});
            Modifier modifierM = d$$ExternalSyntheticOutline0.m(1.0f, true, companion);
            ModalBottomSheetYbuCTN8 modalBottomSheetYbuCTN8Serializer2 = ModalBottomSheetKtModalBottomSheet311.serializer(Arrangement.IconCompatParcelizer(Dimensions.getActionBarHideOffset), companion2.getStart(), getpostalcode, 0);
            int iHashCode4 = Long.hashCode(getpostalcode.RatingCompat);
            DragAndDropNodestartDragAndDropTransfer1 dragAndDropNodestartDragAndDropTransfer1Serializer4 = getpostalcode.serializer();
            Modifier modifierMaterializeModifier4 = ComposedModifierKt.materializeModifier(getpostalcode, modifierM);
            r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 constructor4 = companion3.getConstructor();
            if (getaddresscountry == null) {
                SentryUUID.write();
                throw null;
            }
            int i14 = RemoteActionCompatParcelizer + 91;
            serializer = i14 % Fields.SpotShadowColor;
            if (i14 % 2 == 0) {
                getpostalcode.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg();
                boolean z6 = getpostalcode.ComponentActivity;
                obj.hashCode();
                throw null;
            }
            getpostalcode.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg();
            if (getpostalcode.ComponentActivity) {
                getpostalcode.serializer(constructor4);
            } else {
                getpostalcode.r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28();
            }
            c8$$ExternalSyntheticOutline0.m(companion3, getpostalcode, modalBottomSheetYbuCTN8Serializer2, getpostalcode, dragAndDropNodestartDragAndDropTransfer1Serializer4);
            AndroidContentCaptureManagerCompanion.write(getpostalcode, modifierMaterializeModifier4, m1$$ExternalSyntheticOutline0.m(companion3, getpostalcode, Integer.valueOf(iHashCode4), getpostalcode));
            supportingTextPaddinga9UjIt4material3default supportingtextpaddinga9ujit4material3defaultSerializer2 = TextFieldDefaults.serializer(playbackStateCompatCustomAction, companion2.getCenterVertically(), getpostalcode, 48);
            int iHashCode5 = Long.hashCode(getpostalcode.RatingCompat);
            DragAndDropNodestartDragAndDropTransfer1 dragAndDropNodestartDragAndDropTransfer1Serializer5 = getpostalcode.serializer();
            Modifier modifierMaterializeModifier5 = ComposedModifierKt.materializeModifier(getpostalcode, companion);
            r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 constructor5 = companion3.getConstructor();
            if (getaddresscountry == null) {
                SentryUUID.write();
                throw null;
            }
            int i15 = serializer + 73;
            RemoteActionCompatParcelizer = i15 % Fields.SpotShadowColor;
            int i16 = i15 % 2;
            getpostalcode.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg();
            if (getpostalcode.ComponentActivity) {
                int i17 = serializer + 73;
                RemoteActionCompatParcelizer = i17 % Fields.SpotShadowColor;
                if (i17 % 2 != 0) {
                    getpostalcode.serializer(constructor5);
                    int i18 = 56 / 0;
                } else {
                    getpostalcode.serializer(constructor5);
                }
            } else {
                getpostalcode.r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28();
            }
            r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.read(companion3, getpostalcode, supportingtextpaddinga9ujit4material3defaultSerializer2, getpostalcode, dragAndDropNodestartDragAndDropTransfer1Serializer5);
            AndroidContentCaptureManagerCompanion.write(getpostalcode, modifierMaterializeModifier5, m1$$ExternalSyntheticOutline0.m(companion3, getpostalcode, Integer.valueOf(iHashCode5), getpostalcode));
            Painter painterPainterResource4 = PainterResources_androidKt.painterResource(R.drawable.ic_delivery, getpostalcode, 0);
            ColorFilter colorFilterM763tintxETnrds$default2 = ColorFilter.Companion.m763tintxETnrds$default(companion4, BuildersKt.MediaBrowserCompatMediaItem(getpostalcode), 0, 2, null);
            float f3 = Dimensions.setTabContainer;
            ImageKt.Image(painterPainterResource4, null, SizeKt.m83size3ABfNKs(companion, f3), null, null, 0.0f, colorFilterM763tintxETnrds$default2, getpostalcode, i11, 56);
            ExtrasKt.read(913837329, handleUrlOverridelambda1.RemoteActionCompatParcelizer(), handleUrlOverridelambda1.RemoteActionCompatParcelizer(), -913837326, handleUrlOverridelambda1.RemoteActionCompatParcelizer(), handleUrlOverridelambda1.RemoteActionCompatParcelizer(), new Object[]{getpostalcode, SizeKt.m86width3ABfNKs(companion, Dimensions.setSplitBackground)});
            String str = fractionvisibleinrect.IconCompatParcelizer;
            TextStyle textStyle = (TextStyle) performLayout.read(-1830567612, pcn.serializer(), new Object[0], 1830567614, pcn.serializer(), pcn.serializer(), pcn.serializer());
            TextStyle textStyleM3102copyp1EtxEg = textStyle.m3102copyp1EtxEg((15204351 & 1) != 0 ? textStyle.spanStyle.m3016getColor0d7_KjU() : 0L, (15204351 & 2) != 0 ? textStyle.spanStyle.m3017getFontSizeXSAIIZE() : 0L, (15204351 & 4) != 0 ? textStyle.spanStyle.getFontWeight() : null, (15204351 & 8) != 0 ? textStyle.spanStyle.m3018getFontStyle4Lr2A7w() : null, (15204351 & 16) != 0 ? textStyle.spanStyle.m3019getFontSynthesisZQGJjVo() : null, (15204351 & 32) != 0 ? textStyle.spanStyle.getFontFamily() : FontFamilyKt.FontFamily(FontKt.m3171FontYpTlLL0$default(R.font.notosans_medium, null, 0, 0, 14, null)), (15204351 & 64) != 0 ? textStyle.spanStyle.getFontFeatureSettings() : null, (15204351 & Fields.SpotShadowColor) != 0 ? textStyle.spanStyle.m3020getLetterSpacingXSAIIZE() : 0L, (15204351 & Fields.RotationX) != 0 ? textStyle.spanStyle.m3015getBaselineShift5SSeXJ0() : null, (15204351 & Fields.RotationY) != 0 ? textStyle.spanStyle.getTextGeometricTransform() : null, (15204351 & Fields.RotationZ) != 0 ? textStyle.spanStyle.getLocaleList() : null, (15204351 & Fields.CameraDistance) != 0 ? textStyle.spanStyle.m3014getBackground0d7_KjU() : 0L, (15204351 & Fields.TransformOrigin) != 0 ? textStyle.spanStyle.getTextDecoration() : null, (15204351 & 8192) != 0 ? textStyle.spanStyle.getShadow() : null, (15204351 & Fields.Clip) != 0 ? textStyle.spanStyle.getDrawStyle() : null, (15204351 & Fields.CompositingStrategy) != 0 ? textStyle.paragraphStyle.m2955getTextAligne0LSkKk() : 0, (15204351 & 65536) != 0 ? textStyle.paragraphStyle.m2957getTextDirections_7Xco() : 0, (15204351 & Fields.RenderEffect) != 0 ? textStyle.paragraphStyle.m2953getLineHeightXSAIIZE() : 0L, (15204351 & Fields.ColorFilter) != 0 ? textStyle.paragraphStyle.getTextIndent() : null, (15204351 & Fields.BlendMode) != 0 ? textStyle.platformStyle : null, (15204351 & 1048576) != 0 ? textStyle.paragraphStyle.getLineHeightStyle() : null, (15204351 & 2097152) != 0 ? textStyle.paragraphStyle.m2952getLineBreakrAG3T2k() : 0, (15204351 & 4194304) != 0 ? textStyle.paragraphStyle.m2950getHyphensvmbZdU8() : 0, (15204351 & 8388608) != 0 ? textStyle.paragraphStyle.getTextMotion() : null);
            long jMediaBrowserCompatMediaItem = BuildersKt.MediaBrowserCompatMediaItem(getpostalcode);
            TextOverflow.Companion companion5 = TextOverflow.Companion;
            TextKt.m131TextNvy7gAk(str, null, jMediaBrowserCompatMediaItem, 0L, null, null, 0L, null, 0L, companion5.m3569getEllipsisgIe3tQ8(), false, 1, 0, null, textStyleM3102copyp1EtxEg, getpostalcode, 0, 24960, 110586);
            getpostalcode.IconCompatParcelizer(true);
            ExtrasKt.read(913837329, handleUrlOverridelambda1.RemoteActionCompatParcelizer(), handleUrlOverridelambda1.RemoteActionCompatParcelizer(), -913837326, handleUrlOverridelambda1.RemoteActionCompatParcelizer(), handleUrlOverridelambda1.RemoteActionCompatParcelizer(), new Object[]{getpostalcode, SizeKt.m86width3ABfNKs(companion, f)});
            supportingTextPaddinga9UjIt4material3default supportingtextpaddinga9ujit4material3defaultSerializer3 = TextFieldDefaults.serializer(playbackStateCompatCustomAction, companion2.getCenterVertically(), getpostalcode, 48);
            int iHashCode6 = Long.hashCode(getpostalcode.RatingCompat);
            DragAndDropNodestartDragAndDropTransfer1 dragAndDropNodestartDragAndDropTransfer1Serializer6 = getpostalcode.serializer();
            Modifier modifierMaterializeModifier6 = ComposedModifierKt.materializeModifier(getpostalcode, companion);
            r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 constructor6 = companion3.getConstructor();
            if (getaddresscountry == null) {
                SentryUUID.write();
                throw null;
            }
            getpostalcode.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg();
            if (getpostalcode.ComponentActivity) {
                getpostalcode.serializer(constructor6);
            } else {
                getpostalcode.r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28();
            }
            r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.read(companion3, getpostalcode, supportingtextpaddinga9ujit4material3defaultSerializer3, getpostalcode, dragAndDropNodestartDragAndDropTransfer1Serializer6);
            AndroidContentCaptureManagerCompanion.write(getpostalcode, modifierMaterializeModifier6, m1$$ExternalSyntheticOutline0.m(companion3, getpostalcode, Integer.valueOf(iHashCode6), getpostalcode));
            Painter painterPainterResource5 = PainterResources_androidKt.painterResource(R.drawable.ic_customer, getpostalcode, 0);
            if (z3) {
                getpostalcode.serializer(1953969905);
                jMediaSessionCompatQueueItem = BuildersKt.MediaDescriptionCompat(getpostalcode);
            } else {
                getpostalcode.serializer(1953970671);
                jMediaSessionCompatQueueItem = BuildersKt.MediaSessionCompatQueueItem(getpostalcode);
            }
            getpostalcode.IconCompatParcelizer(false);
            ImageKt.Image(painterPainterResource5, null, SizeKt.m83size3ABfNKs(companion, f3), null, null, 0.0f, ColorFilter.Companion.m763tintxETnrds$default(companion4, jMediaSessionCompatQueueItem, 0, 2, null), getpostalcode, i11, 56);
            ExtrasKt.read(913837329, handleUrlOverridelambda1.RemoteActionCompatParcelizer(), handleUrlOverridelambda1.RemoteActionCompatParcelizer(), -913837326, handleUrlOverridelambda1.RemoteActionCompatParcelizer(), handleUrlOverridelambda1.RemoteActionCompatParcelizer(), new Object[]{getpostalcode, SizeKt.m86width3ABfNKs(companion, f)});
            String str2 = fractionvisibleinrect.RemoteActionCompatParcelizer;
            TextStyle textStyle2 = (TextStyle) performLayout.read(-1830567612, pcn.serializer(), new Object[0], 1830567614, pcn.serializer(), pcn.serializer(), pcn.serializer());
            TextStyle textStyleM3102copyp1EtxEg2 = textStyle2.m3102copyp1EtxEg((15204351 & 1) != 0 ? textStyle2.spanStyle.m3016getColor0d7_KjU() : 0L, (15204351 & 2) != 0 ? textStyle2.spanStyle.m3017getFontSizeXSAIIZE() : 0L, (15204351 & 4) != 0 ? textStyle2.spanStyle.getFontWeight() : null, (15204351 & 8) != 0 ? textStyle2.spanStyle.m3018getFontStyle4Lr2A7w() : null, (15204351 & 16) != 0 ? textStyle2.spanStyle.m3019getFontSynthesisZQGJjVo() : null, (15204351 & 32) != 0 ? textStyle2.spanStyle.getFontFamily() : FontFamilyKt.FontFamily(FontKt.m3171FontYpTlLL0$default(R.font.notosans_medium, null, 0, 0, 14, null)), (15204351 & 64) != 0 ? textStyle2.spanStyle.getFontFeatureSettings() : null, (15204351 & Fields.SpotShadowColor) != 0 ? textStyle2.spanStyle.m3020getLetterSpacingXSAIIZE() : 0L, (15204351 & Fields.RotationX) != 0 ? textStyle2.spanStyle.m3015getBaselineShift5SSeXJ0() : null, (15204351 & Fields.RotationY) != 0 ? textStyle2.spanStyle.getTextGeometricTransform() : null, (15204351 & Fields.RotationZ) != 0 ? textStyle2.spanStyle.getLocaleList() : null, (15204351 & Fields.CameraDistance) != 0 ? textStyle2.spanStyle.m3014getBackground0d7_KjU() : 0L, (15204351 & Fields.TransformOrigin) != 0 ? textStyle2.spanStyle.getTextDecoration() : null, (15204351 & 8192) != 0 ? textStyle2.spanStyle.getShadow() : null, (15204351 & Fields.Clip) != 0 ? textStyle2.spanStyle.getDrawStyle() : null, (15204351 & Fields.CompositingStrategy) != 0 ? textStyle2.paragraphStyle.m2955getTextAligne0LSkKk() : 0, (15204351 & 65536) != 0 ? textStyle2.paragraphStyle.m2957getTextDirections_7Xco() : 0, (15204351 & Fields.RenderEffect) != 0 ? textStyle2.paragraphStyle.m2953getLineHeightXSAIIZE() : 0L, (15204351 & Fields.ColorFilter) != 0 ? textStyle2.paragraphStyle.getTextIndent() : null, (15204351 & Fields.BlendMode) != 0 ? textStyle2.platformStyle : null, (15204351 & 1048576) != 0 ? textStyle2.paragraphStyle.getLineHeightStyle() : null, (15204351 & 2097152) != 0 ? textStyle2.paragraphStyle.m2952getLineBreakrAG3T2k() : 0, (15204351 & 4194304) != 0 ? textStyle2.paragraphStyle.m2950getHyphensvmbZdU8() : 0, (15204351 & 8388608) != 0 ? textStyle2.paragraphStyle.getTextMotion() : null);
            if (z3) {
                getpostalcode.serializer(1953985361);
                jMediaSessionCompatQueueItem2 = BuildersKt.MediaDescriptionCompat(getpostalcode);
            } else {
                getpostalcode.serializer(1953986127);
                jMediaSessionCompatQueueItem2 = BuildersKt.MediaSessionCompatQueueItem(getpostalcode);
            }
            getpostalcode.IconCompatParcelizer(false);
            TextKt.m131TextNvy7gAk(str2, null, jMediaSessionCompatQueueItem2, 0L, null, null, 0L, null, 0L, companion5.m3569getEllipsisgIe3tQ8(), false, 1, 0, null, textStyleM3102copyp1EtxEg2, getpostalcode, 0, 24960, 110586);
            getpostalcode.IconCompatParcelizer(true);
            ExtrasKt.read(913837329, handleUrlOverridelambda1.RemoteActionCompatParcelizer(), handleUrlOverridelambda1.RemoteActionCompatParcelizer(), -913837326, handleUrlOverridelambda1.RemoteActionCompatParcelizer(), handleUrlOverridelambda1.RemoteActionCompatParcelizer(), new Object[]{getpostalcode, SizeKt.m86width3ABfNKs(companion, f)});
            supportingTextPaddinga9UjIt4material3default supportingtextpaddinga9ujit4material3defaultSerializer4 = TextFieldDefaults.serializer(playbackStateCompatCustomAction, companion2.getCenterVertically(), getpostalcode, 48);
            int iHashCode7 = Long.hashCode(getpostalcode.RatingCompat);
            DragAndDropNodestartDragAndDropTransfer1 dragAndDropNodestartDragAndDropTransfer1Serializer7 = getpostalcode.serializer();
            Modifier modifierMaterializeModifier7 = ComposedModifierKt.materializeModifier(getpostalcode, companion);
            r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 constructor7 = companion3.getConstructor();
            if (getaddresscountry == null) {
                SentryUUID.write();
                throw null;
            }
            getpostalcode.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg();
            if (getpostalcode.ComponentActivity) {
                getpostalcode.serializer(constructor7);
            } else {
                getpostalcode.r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28();
            }
            r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.read(companion3, getpostalcode, supportingtextpaddinga9ujit4material3defaultSerializer4, getpostalcode, dragAndDropNodestartDragAndDropTransfer1Serializer7);
            AndroidContentCaptureManagerCompanion.write(getpostalcode, modifierMaterializeModifier7, m1$$ExternalSyntheticOutline0.m(companion3, getpostalcode, Integer.valueOf(iHashCode7), getpostalcode));
            Painter painterPainterResource6 = PainterResources_androidKt.painterResource(R.drawable.ic_picked_up, getpostalcode, 0);
            if (z3) {
                getpostalcode.serializer(-1928091152);
                jMediaSessionCompatQueueItem3 = BuildersKt.MediaDescriptionCompat(getpostalcode);
            } else {
                getpostalcode.serializer(-1928090386);
                jMediaSessionCompatQueueItem3 = BuildersKt.MediaSessionCompatQueueItem(getpostalcode);
            }
            long j = jMediaSessionCompatQueueItem3;
            getpostalcode.IconCompatParcelizer(false);
            int i19 = RemoteActionCompatParcelizer + 65;
            serializer = i19 % Fields.SpotShadowColor;
            int i20 = i19 % 2;
            ImageKt.Image(painterPainterResource6, null, SizeKt.m83size3ABfNKs(companion, f3), null, null, 0.0f, ColorFilter.Companion.m763tintxETnrds$default(companion4, j, 0, 2, null), getpostalcode, i11, 56);
            ExtrasKt.read(913837329, handleUrlOverridelambda1.RemoteActionCompatParcelizer(), handleUrlOverridelambda1.RemoteActionCompatParcelizer(), -913837326, handleUrlOverridelambda1.RemoteActionCompatParcelizer(), handleUrlOverridelambda1.RemoteActionCompatParcelizer(), new Object[]{getpostalcode, SizeKt.m86width3ABfNKs(companion, f)});
            String upperCase = fractionvisibleinrect.MediaBrowserCompatMediaItem.toUpperCase(Locale.ROOT);
            upperCase.getClass();
            onViewDetachedFromWindowlambda1 onviewdetachedfromwindowlambda1 = performLayout.write;
            TextStyle textStyle3 = (TextStyle) onviewdetachedfromwindowlambda1.MediaSessionCompatResultReceiverWrapper();
            TextStyle textStyleM3102copyp1EtxEg3 = textStyle3.m3102copyp1EtxEg((15204351 & 1) != 0 ? textStyle3.spanStyle.m3016getColor0d7_KjU() : 0L, (15204351 & 2) != 0 ? textStyle3.spanStyle.m3017getFontSizeXSAIIZE() : 0L, (15204351 & 4) != 0 ? textStyle3.spanStyle.getFontWeight() : null, (15204351 & 8) != 0 ? textStyle3.spanStyle.m3018getFontStyle4Lr2A7w() : null, (15204351 & 16) != 0 ? textStyle3.spanStyle.m3019getFontSynthesisZQGJjVo() : null, (15204351 & 32) != 0 ? textStyle3.spanStyle.getFontFamily() : FontFamilyKt.FontFamily(FontKt.m3171FontYpTlLL0$default(R.font.notosans_medium, null, 0, 0, 14, null)), (15204351 & 64) != 0 ? textStyle3.spanStyle.getFontFeatureSettings() : null, (15204351 & Fields.SpotShadowColor) != 0 ? textStyle3.spanStyle.m3020getLetterSpacingXSAIIZE() : 0L, (15204351 & Fields.RotationX) != 0 ? textStyle3.spanStyle.m3015getBaselineShift5SSeXJ0() : null, (15204351 & Fields.RotationY) != 0 ? textStyle3.spanStyle.getTextGeometricTransform() : null, (15204351 & Fields.RotationZ) != 0 ? textStyle3.spanStyle.getLocaleList() : null, (15204351 & Fields.CameraDistance) != 0 ? textStyle3.spanStyle.m3014getBackground0d7_KjU() : 0L, (15204351 & Fields.TransformOrigin) != 0 ? textStyle3.spanStyle.getTextDecoration() : null, (15204351 & 8192) != 0 ? textStyle3.spanStyle.getShadow() : null, (15204351 & Fields.Clip) != 0 ? textStyle3.spanStyle.getDrawStyle() : null, (15204351 & Fields.CompositingStrategy) != 0 ? textStyle3.paragraphStyle.m2955getTextAligne0LSkKk() : 0, (15204351 & 65536) != 0 ? textStyle3.paragraphStyle.m2957getTextDirections_7Xco() : 0, (15204351 & Fields.RenderEffect) != 0 ? textStyle3.paragraphStyle.m2953getLineHeightXSAIIZE() : 0L, (15204351 & Fields.ColorFilter) != 0 ? textStyle3.paragraphStyle.getTextIndent() : null, (15204351 & Fields.BlendMode) != 0 ? textStyle3.platformStyle : null, (15204351 & 1048576) != 0 ? textStyle3.paragraphStyle.getLineHeightStyle() : null, (15204351 & 2097152) != 0 ? textStyle3.paragraphStyle.m2952getLineBreakrAG3T2k() : 0, (15204351 & 4194304) != 0 ? textStyle3.paragraphStyle.m2950getHyphensvmbZdU8() : 0, (15204351 & 8388608) != 0 ? textStyle3.paragraphStyle.getTextMotion() : null);
            if (z3) {
                int i21 = RemoteActionCompatParcelizer + 17;
                serializer = i21 % Fields.SpotShadowColor;
                int i22 = i21 % 2;
                getpostalcode.serializer(-1928075280);
                jMediaSessionCompatQueueItem4 = BuildersKt.MediaDescriptionCompat(getpostalcode);
            } else {
                getpostalcode.serializer(-1928074514);
                jMediaSessionCompatQueueItem4 = BuildersKt.MediaSessionCompatQueueItem(getpostalcode);
            }
            getpostalcode.IconCompatParcelizer(false);
            TextKt.m131TextNvy7gAk(upperCase, null, jMediaSessionCompatQueueItem4, 0L, null, null, 0L, null, 0L, companion5.m3569getEllipsisgIe3tQ8(), false, 1, 0, null, textStyleM3102copyp1EtxEg3, getpostalcode, 0, 24960, 110586);
            getpostalcode.IconCompatParcelizer(true);
            ExtrasKt.read(913837329, handleUrlOverridelambda1.RemoteActionCompatParcelizer(), handleUrlOverridelambda1.RemoteActionCompatParcelizer(), -913837326, handleUrlOverridelambda1.RemoteActionCompatParcelizer(), handleUrlOverridelambda1.RemoteActionCompatParcelizer(), new Object[]{getpostalcode, SizeKt.m86width3ABfNKs(companion, f2)});
            getpostalcode.IconCompatParcelizer(true);
            if (!z3) {
                getpostalcode.serializer(-1651193077);
                getpostalcode.IconCompatParcelizer(false);
                z2 = true;
            } else {
                getpostalcode.serializer(-1651846557);
                ExtrasKt.read(913837329, handleUrlOverridelambda1.RemoteActionCompatParcelizer(), handleUrlOverridelambda1.RemoteActionCompatParcelizer(), -913837326, handleUrlOverridelambda1.RemoteActionCompatParcelizer(), handleUrlOverridelambda1.RemoteActionCompatParcelizer(), new Object[]{getpostalcode, SizeKt.m86width3ABfNKs(companion, f)});
                Modifier modifierM20backgroundbw27NRU2 = BackgroundKt.m20backgroundbw27NRU(SizeKt.m83size3ABfNKs(companion, Dimensions.setLogo), BuildersKt.MediaDescriptionCompat(getpostalcode), RoundedCornerShapeKt.IconCompatParcelizer);
                MeasurePolicy measurePolicy2 = BoxKt.read(companion2.getCenter(), false);
                int iHashCode8 = Long.hashCode(getpostalcode.RatingCompat);
                DragAndDropNodestartDragAndDropTransfer1 dragAndDropNodestartDragAndDropTransfer1Serializer8 = getpostalcode.serializer();
                Modifier modifierMaterializeModifier8 = ComposedModifierKt.materializeModifier(getpostalcode, modifierM20backgroundbw27NRU2);
                r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 constructor8 = companion3.getConstructor();
                if (getaddresscountry == null) {
                    SentryUUID.write();
                    throw null;
                }
                int i23 = RemoteActionCompatParcelizer + 111;
                serializer = i23 % Fields.SpotShadowColor;
                if (i23 % 2 == 0) {
                    getpostalcode.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg();
                    boolean z7 = getpostalcode.ComponentActivity;
                    obj.hashCode();
                    throw null;
                }
                getpostalcode.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg();
                if (getpostalcode.ComponentActivity) {
                    getpostalcode.serializer(constructor8);
                } else {
                    getpostalcode.r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28();
                }
                af$$ExternalSyntheticOutline0.m(companion3, getpostalcode, measurePolicy2, getpostalcode, dragAndDropNodestartDragAndDropTransfer1Serializer8);
                AndroidContentCaptureManagerCompanion.write(getpostalcode, modifierMaterializeModifier8, m1$$ExternalSyntheticOutline0.m(companion3, getpostalcode, Integer.valueOf(iHashCode8), getpostalcode));
                TextKt.m131TextNvy7gAk(fractionvisibleinrect.RatingCompat, null, BuildersKt.RatingCompat(getpostalcode), 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, (TextStyle) onviewdetachedfromwindowlambda1.MediaSessionCompatResultReceiverWrapper(), getpostalcode, 0, 0, 131066);
                z2 = true;
                getpostalcode.IconCompatParcelizer(true);
                getpostalcode.IconCompatParcelizer(false);
            }
            getpostalcode.IconCompatParcelizer(z2);
            getpostalcode.IconCompatParcelizer(z2);
            modifier2 = companion;
        } else {
            getpostalcode.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
            modifier2 = modifier;
        }
        getHandleruiannotations gethandleruiannotationsMediaDescriptionCompat = getpostalcode.MediaDescriptionCompat();
        if (gethandleruiannotationsMediaDescriptionCompat != null) {
            gethandleruiannotationsMediaDescriptionCompat.serializer = new accessgetReusableRectp(i, 15, modifier2, (Object) fractionvisibleinrect, (Object) r8lambdaunavo3sxub_pc9xroryotnrlvsm);
        }
    }
}
