package com.roadrunner.delivery.inappcamera.presentation.picture_with_tag;

import androidx.compose.animation.core.Animatable;
import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.interaction.MutableInteractionSourceImpl;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.FlowLayoutKt;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.material3.IconKt;
import androidx.compose.material3.ModalBottomSheetKt$ModalBottomSheet$3$1$1;
import androidx.compose.material3.TextKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.Fields;
import androidx.compose.ui.graphics.GraphicsLayerModifierKt;
import androidx.compose.ui.graphics.painter.Painter;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.res.PainterResources_androidKt;
import bo.app.af$$ExternalSyntheticOutline0;
import bo.app.c8$$ExternalSyntheticOutline0;
import bo.app.m1$$ExternalSyntheticOutline0;
import coil3.ExtrasKt;
import com.logistics.rider.glovo.R;
import com.roadrunner.delivery.inappcamera.api.model.InAppCameraOverlay;
import com.roadrunner.designsystem.compose.theme.tokens.Dimensions;
import io.sentry.SentryUUID;
import io.sentry.hints.PlaybackStateCompatCustomAction;
import java.util.List;
import kotlinx.coroutines.BuildersKt;
import o.AndroidContentCaptureManager;
import o.AndroidContentCaptureManagerCompanion;
import o.DragAndDropNodestartDragAndDropTransfer1;
import o.ModalBottomSheetKtModalBottomSheet311;
import o.ModalBottomSheetYbuCTN8;
import o.ShortNewsContentCardView;
import o.TextFieldDefaults;
import o.accessgetReusableRectp;
import o.containsInclusive;
import o.createInAppMessageEventSubscriber;
import o.getAddressCountry;
import o.getBirthDateFull;
import o.getContentViewGroupParentLayout;
import o.getCreditCardExpirationMonth;
import o.getHandleruiannotations;
import o.getPhoneNumberNational;
import o.getPostalCode;
import o.handleUrlOverridelambda1;
import o.mainAxisk4lQ0M;
import o.performLayout;
import o.r8lambda9QlT_ra9FwUEV5vl9YtC6BGxtDk;
import o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0;
import o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM;
import o.r8lambdafvzP3Wky1RLLzE56uVXaMHcvU;
import o.removeNodeAtDepth;
import o.setAllViewGroupChildrenAsNonAccessibilityImportantlambda0;
import o.setEditorBoundsInfo;
import o.supportingTextPaddinga9UjIt4material3default;
import o.u3;

/* JADX INFO: loaded from: classes3.dex */
public abstract class TagOverlayKt {
    private static int read = 0;
    private static int write = 1;

    public static final void serializer(r8lambda9QlT_ra9FwUEV5vl9YtC6BGxtDk r8lambda9qlt_ra9fwuev5vl9ytc6bgxtdk, Modifier modifier, getBirthDateFull getbirthdatefull, int i) {
        int i2;
        boolean zIconCompatParcelizer;
        int i3 = 2 % 2;
        getPostalCode getpostalcode = (getPostalCode) getbirthdatefull;
        getpostalcode.MediaSessionCompatQueueItem(484913376);
        if ((i & 6) == 0) {
            if ((i & 8) != 0) {
                zIconCompatParcelizer = getpostalcode.IconCompatParcelizer(r8lambda9qlt_ra9fwuev5vl9ytc6bgxtdk);
            } else {
                int i4 = write + 63;
                read = i4 % Fields.SpotShadowColor;
                if (i4 % 2 == 0) {
                    zIconCompatParcelizer = getpostalcode.read(r8lambda9qlt_ra9fwuev5vl9ytc6bgxtdk);
                } else {
                    getpostalcode.read(r8lambda9qlt_ra9fwuev5vl9ytc6bgxtdk);
                    throw null;
                }
            }
            i2 = (zIconCompatParcelizer ? 4 : 2) | i;
        } else {
            int i5 = read + 87;
            write = i5 % Fields.SpotShadowColor;
            int i6 = i5 % 2;
            i2 = i;
        }
        int i7 = i2 | 48;
        int i8 = 0;
        if (getpostalcode.write(i7 & 1, (i7 & 19) != 18)) {
            modifier = Modifier.Companion;
            float f = Dimensions.setSplitBackground;
            FlowLayoutKt.serializer(PaddingKt.m74paddingqDBjuR0$default(modifier, 0.0f, f, 0.0f, 0.0f, 13), Arrangement.IconCompatParcelizer(f), Arrangement.IconCompatParcelizer(f), null, 0, 0, ExtrasKt.write(639976581, new TagOverlayKt$$ExternalSyntheticLambda3(r8lambda9qlt_ra9fwuev5vl9ytc6bgxtdk, i8), getpostalcode), getpostalcode, 1572864, 56);
        } else {
            getpostalcode.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
        }
        getHandleruiannotations gethandleruiannotationsMediaDescriptionCompat = getpostalcode.MediaDescriptionCompat();
        if (gethandleruiannotationsMediaDescriptionCompat != null) {
            gethandleruiannotationsMediaDescriptionCompat.serializer = new u3(r8lambda9qlt_ra9fwuev5vl9ytc6bgxtdk, modifier, i, 2);
        }
    }

    /* JADX WARN: Code duplicated, block: B:38:0x0095  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v2 */
    /* JADX WARN: Type inference failed for: r1v3, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r1v4 */
    public static final void TagOverlay(InAppCameraOverlay.Tags tags, Modifier modifier, Animatable animatable, getBirthDateFull getbirthdatefull, int i) {
        int i2;
        Animatable animatable2;
        Animatable animatableWrite;
        ?? r1;
        boolean z;
        float f;
        int i3;
        int i4 = 2 % 2;
        int i5 = read + 57;
        write = i5 % Fields.SpotShadowColor;
        int i6 = i5 % 2;
        tags.getClass();
        getPostalCode getpostalcode = (getPostalCode) getbirthdatefull;
        getpostalcode.MediaSessionCompatQueueItem(-974293242);
        getAddressCountry getaddresscountry = getpostalcode.read;
        if ((i & 6) == 0) {
            if ((i & 8) == 0 ? getpostalcode.read(tags) : getpostalcode.IconCompatParcelizer(tags)) {
                int i7 = write + 83;
                read = i7 % Fields.SpotShadowColor;
                i3 = i7 % 2 != 0 ? 5 : 4;
            } else {
                i3 = 2;
            }
            i2 = i3 | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= getpostalcode.read(modifier) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= Fields.SpotShadowColor;
        }
        int i8 = 1;
        int i9 = 0;
        if (getpostalcode.write(i2 & 1, (i2 & 147) != 146)) {
            int i10 = write + 75;
            read = i10 % Fields.SpotShadowColor;
            int i11 = i10 % 2;
            getpostalcode.r8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss();
            if ((i & 1) != 0) {
                int i12 = read + 51;
                write = i12 % Fields.SpotShadowColor;
                int i13 = i12 % 2;
                if (getpostalcode.PlaybackStateCompat()) {
                    animatableWrite = mainAxisk4lQ0M.write(0.0f);
                } else {
                    getpostalcode.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
                    animatableWrite = animatable;
                }
            } else {
                animatableWrite = mainAxisk4lQ0M.write(0.0f);
            }
            getpostalcode.RemoteActionCompatParcelizer();
            Object objComponentActivity = getpostalcode.ComponentActivity();
            AndroidContentCaptureManager androidContentCaptureManager = getCreditCardExpirationMonth.write;
            if (objComponentActivity == androidContentCaptureManager) {
                getpostalcode.write(animatableWrite);
                objComponentActivity = animatableWrite;
            }
            Animatable animatable3 = (Animatable) objComponentActivity;
            Object objComponentActivity2 = getpostalcode.ComponentActivity();
            if (objComponentActivity2 == androidContentCaptureManager) {
                int i14 = write + 23;
                read = i14 % Fields.SpotShadowColor;
                if (i14 % 2 != 0) {
                    objComponentActivity2 = getPhoneNumberNational.RemoteActionCompatParcelizer(getpostalcode);
                    getpostalcode.write(objComponentActivity2);
                    int i15 = 77 / 0;
                } else {
                    objComponentActivity2 = getPhoneNumberNational.RemoteActionCompatParcelizer(getpostalcode);
                    getpostalcode.write(objComponentActivity2);
                }
            }
            getContentViewGroupParentLayout getcontentviewgroupparentlayout = (getContentViewGroupParentLayout) objComponentActivity2;
            createInAppMessageEventSubscriber createinappmessageeventsubscriber = new createInAppMessageEventSubscriber();
            Object objComponentActivity3 = getpostalcode.ComponentActivity();
            ShortNewsContentCardView shortNewsContentCardView = null;
            if (objComponentActivity3 == androidContentCaptureManager) {
                objComponentActivity3 = BuildersKt.RemoteActionCompatParcelizer(getcontentviewgroupparentlayout, null, null, new ModalBottomSheetKt$ModalBottomSheet$3$1$1(animatable3, shortNewsContentCardView, i8), 3);
                getpostalcode.write(objComponentActivity3);
            }
            createinappmessageeventsubscriber.IconCompatParcelizer = (setAllViewGroupChildrenAsNonAccessibilityImportantlambda0) objComponentActivity3;
            Object objComponentActivity4 = getpostalcode.ComponentActivity();
            if (objComponentActivity4 == androidContentCaptureManager) {
                objComponentActivity4 = c8$$ExternalSyntheticOutline0.m(getpostalcode);
            }
            MutableInteractionSourceImpl mutableInteractionSourceImpl = (MutableInteractionSourceImpl) objComponentActivity4;
            Modifier modifierWrite = SizeKt.write(modifier, 1.0f);
            boolean zIconCompatParcelizer = getpostalcode.IconCompatParcelizer(animatable3);
            Object objComponentActivity5 = getpostalcode.ComponentActivity();
            if (!(!zIconCompatParcelizer) || objComponentActivity5 == androidContentCaptureManager) {
                objComponentActivity5 = new setEditorBoundsInfo(animatable3, 0);
                getpostalcode.write(objComponentActivity5);
            }
            Modifier modifierGraphicsLayer = GraphicsLayerModifierKt.graphicsLayer(modifierWrite, (r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) objComponentActivity5);
            float f2 = Dimensions.setTabContainer;
            Modifier modifierSerializer = ClickableKt.serializer(PaddingKt.write(modifierGraphicsLayer, f2), mutableInteractionSourceImpl, null, false, null, new containsInclusive(createinappmessageeventsubscriber, getcontentviewgroupparentlayout, animatable3, i9), 28);
            PlaybackStateCompatCustomAction playbackStateCompatCustomAction = Arrangement.MediaBrowserCompatMediaItem;
            Alignment.Companion companion = Alignment.Companion;
            supportingTextPaddinga9UjIt4material3default supportingtextpaddinga9ujit4material3defaultSerializer = TextFieldDefaults.serializer(playbackStateCompatCustomAction, companion.getTop(), getpostalcode, 0);
            int iHashCode = Long.hashCode(getpostalcode.RatingCompat);
            DragAndDropNodestartDragAndDropTransfer1 dragAndDropNodestartDragAndDropTransfer1Serializer = getpostalcode.serializer();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(getpostalcode, modifierSerializer);
            ComposeUiNode.Companion companion2 = ComposeUiNode.Companion;
            r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 constructor = companion2.getConstructor();
            if (getaddresscountry == null) {
                SentryUUID.write();
                throw null;
            }
            getpostalcode.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg();
            if (!(!getpostalcode.ComponentActivity)) {
                int i16 = write + 21;
                read = i16 % Fields.SpotShadowColor;
                int i17 = i16 % 2;
                getpostalcode.serializer(constructor);
            } else {
                getpostalcode.r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28();
            }
            r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.read(companion2, getpostalcode, supportingtextpaddinga9ujit4material3defaultSerializer, getpostalcode, dragAndDropNodestartDragAndDropTransfer1Serializer);
            AndroidContentCaptureManagerCompanion.write(getpostalcode, modifierMaterializeModifier, m1$$ExternalSyntheticOutline0.m(companion2, getpostalcode, Integer.valueOf(iHashCode), getpostalcode));
            Integer num = tags.IconCompatParcelizer;
            if (num == null) {
                getpostalcode.serializer(2125117533);
                getpostalcode.IconCompatParcelizer(false);
                f = f2;
                r1 = 0;
                z = true;
            } else {
                getpostalcode.serializer(2125117534);
                int iIntValue = num.intValue();
                Modifier.Companion companion3 = Modifier.Companion;
                MeasurePolicy measurePolicy = BoxKt.read(companion.getTopStart(), false);
                int iHashCode2 = Long.hashCode(getpostalcode.RatingCompat);
                DragAndDropNodestartDragAndDropTransfer1 dragAndDropNodestartDragAndDropTransfer1Serializer2 = getpostalcode.serializer();
                Modifier modifierMaterializeModifier2 = ComposedModifierKt.materializeModifier(getpostalcode, companion3);
                r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 constructor2 = companion2.getConstructor();
                getpostalcode.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg();
                if (!(!getpostalcode.ComponentActivity)) {
                    getpostalcode.serializer(constructor2);
                } else {
                    getpostalcode.r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28();
                }
                af$$ExternalSyntheticOutline0.m(companion2, getpostalcode, measurePolicy, getpostalcode, dragAndDropNodestartDragAndDropTransfer1Serializer2);
                AndroidContentCaptureManagerCompanion.write(getpostalcode, modifierMaterializeModifier2, m1$$ExternalSyntheticOutline0.m(companion2, getpostalcode, Integer.valueOf(iHashCode2), getpostalcode));
                Painter painterPainterResource = PainterResources_androidKt.painterResource(R.drawable.crop_frame, getpostalcode, 0);
                int i18 = Painter.$stable;
                r1 = 0;
                ImageKt.Image(painterPainterResource, "Camera click button", null, null, null, 0.0f, null, getpostalcode, i18 | 48, 124);
                IconKt.m116Iconww6aTOc(PainterResources_androidKt.painterResource(iIntValue, getpostalcode, 0), "Tags main icon", BoxScopeInstance.serializer.align(companion3, companion.getCenter()), Color.Companion.m759getWhite0d7_KjU(), getpostalcode, i18 | 3120, 0);
                z = true;
                getpostalcode.IconCompatParcelizer(true);
                f = f2;
                ExtrasKt.read(913837329, handleUrlOverridelambda1.RemoteActionCompatParcelizer(), handleUrlOverridelambda1.RemoteActionCompatParcelizer(), -913837326, handleUrlOverridelambda1.RemoteActionCompatParcelizer(), handleUrlOverridelambda1.RemoteActionCompatParcelizer(), new Object[]{getpostalcode, SizeKt.m86width3ABfNKs(companion3, f)});
                getpostalcode.IconCompatParcelizer(false);
            }
            Modifier modifierWrite2 = SizeKt.write(PaddingKt.m74paddingqDBjuR0$default(Modifier.Companion, 0.0f, 0.0f, f, 0.0f, 11), 1.0f);
            ModalBottomSheetYbuCTN8 modalBottomSheetYbuCTN8Serializer = ModalBottomSheetKtModalBottomSheet311.serializer(Arrangement.MediaDescriptionCompat, companion.getStart(), getpostalcode, r1);
            int iHashCode3 = Long.hashCode(getpostalcode.RatingCompat);
            DragAndDropNodestartDragAndDropTransfer1 dragAndDropNodestartDragAndDropTransfer1Serializer3 = getpostalcode.serializer();
            Modifier modifierMaterializeModifier3 = ComposedModifierKt.materializeModifier(getpostalcode, modifierWrite2);
            r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 constructor3 = companion2.getConstructor();
            getpostalcode.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg();
            if (getpostalcode.ComponentActivity) {
                int i19 = read + 29;
                write = i19 % Fields.SpotShadowColor;
                int i20 = i19 % 2;
                getpostalcode.serializer(constructor3);
            } else {
                getpostalcode.r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28();
            }
            c8$$ExternalSyntheticOutline0.m(companion2, getpostalcode, modalBottomSheetYbuCTN8Serializer, getpostalcode, dragAndDropNodestartDragAndDropTransfer1Serializer3);
            AndroidContentCaptureManagerCompanion.write(getpostalcode, modifierMaterializeModifier3, m1$$ExternalSyntheticOutline0.m(companion2, getpostalcode, Integer.valueOf(iHashCode3), getpostalcode));
            String str = tags.read;
            if (str == null) {
                getpostalcode.serializer(1628796375);
                getpostalcode.IconCompatParcelizer((boolean) r1);
            } else {
                getpostalcode.serializer(1628796376);
                TextKt.m131TextNvy7gAk(str, null, Color.Companion.m759getWhite0d7_KjU(), 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, performLayout.MediaSessionCompatToken(), getpostalcode, 384, 0, 131066);
                getpostalcode.IconCompatParcelizer((boolean) r1);
            }
            List list = tags.write;
            if (list == null) {
                int i21 = write + 109;
                read = i21 % Fields.SpotShadowColor;
                int i22 = i21 % 2;
                getpostalcode.serializer(1628927319);
                getpostalcode.IconCompatParcelizer((boolean) r1);
            } else {
                getpostalcode.serializer(1628927320);
                serializer(removeNodeAtDepth.RemoteActionCompatParcelizer(list), null, getpostalcode, r1);
                getpostalcode.IconCompatParcelizer((boolean) r1);
            }
            getpostalcode.IconCompatParcelizer(z);
            getpostalcode.IconCompatParcelizer(z);
            animatable2 = animatableWrite;
        } else {
            getpostalcode.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
            animatable2 = animatable;
        }
        getHandleruiannotations gethandleruiannotationsMediaDescriptionCompat = getpostalcode.MediaDescriptionCompat();
        if (gethandleruiannotationsMediaDescriptionCompat != null) {
            gethandleruiannotationsMediaDescriptionCompat.serializer = new accessgetReusableRectp(i, 28, tags, modifier, animatable2);
        }
    }
}
