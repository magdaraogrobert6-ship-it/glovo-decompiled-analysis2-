package com.roadrunner.delivery.ontheway.header.implementation.presentation.compose;

import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.material3.SurfaceKt;
import androidx.compose.material3.TextKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Fields;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.style.TextOverflow;
import bo.app.b8$$ExternalSyntheticLambda4;
import bo.app.c8$$ExternalSyntheticOutline0;
import bo.app.m1$$ExternalSyntheticOutline0;
import coil3.ExtrasKt;
import com.roadrunner.designsystem.compose.theme.tokens.Dimensions;
import com.roadrunner.home.floatingbutton.LoadingFloatingButtonKt$$ExternalSyntheticLambda0;
import io.sentry.SentryUUID;
import io.sentry.hints.PlaybackStateCompatCustomAction;
import o.AndroidContentCaptureManagerCompanion;
import o.AndroidFontTypefaceLoader;
import o.AndroidTextPaint;
import o.DragAndDropNodestartDragAndDropTransfer1;
import o.DragAndDropTargetModifierNode;
import o.ModalBottomSheetKtModalBottomSheet311;
import o.ModalBottomSheetYbuCTN8;
import o.TextFieldDefaults;
import o.TextFieldKt;
import o.buildMapping;
import o.computeHorizontalScrollExtent;
import o.copyejIjP34;
import o.emitcomroadrunnerdeliveryonthewayentrancepicturenavigationusecaseObserveNavigationEntrancePictureinvokeinlinedmap12;
import o.getBirthDateFull;
import o.getBrushui_text;
import o.getCreditCardExpirationMonth;
import o.getHandleruiannotations;
import o.getHasCamera;
import o.getNewPassword;
import o.getPostalCode;
import o.getStore;
import o.hideCurrentlyDisplayingInAppMessage;
import o.performLayout;
import o.performMeasureDjhGOtQ;
import o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0;
import o.r8lambdafvzP3Wky1RLLzE56uVXaMHcvU;
import o.snapElevation;
import o.supportingTextPaddinga9UjIt4material3default;

/* JADX INFO: loaded from: classes3.dex */
public abstract class DestinationHeaderWithAddressKt {
    private static int IconCompatParcelizer = 0;
    private static int serializer = 1;

    public static final void serializer(int i, getBirthDateFull getbirthdatefull, Modifier modifier, String str, r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k0) {
        int i2;
        boolean z;
        Modifier modifier2;
        int i3;
        int i4 = 2 % 2;
        getPostalCode getpostalcode = (getPostalCode) getbirthdatefull;
        getpostalcode.MediaSessionCompatQueueItem(-2020421812);
        if ((i & 6) == 0) {
            if (getpostalcode.read(str)) {
                int i5 = serializer + 21;
                IconCompatParcelizer = i5 % Fields.SpotShadowColor;
                int i6 = i5 % 2;
                i3 = 4;
            } else {
                i3 = 2;
            }
            i2 = i3 | i;
        } else {
            i2 = i;
        }
        int i7 = i2 | 48;
        if ((i & 384) == 0) {
            int i8 = IconCompatParcelizer + 57;
            serializer = i8 % Fields.SpotShadowColor;
            int i9 = i8 % 2;
            i7 |= getpostalcode.IconCompatParcelizer(r8lambdardpfsr94j4iebcwx_kpqzpm8k0) ? Fields.RotationX : Fields.SpotShadowColor;
            int i10 = IconCompatParcelizer + 39;
            serializer = i10 % Fields.SpotShadowColor;
            int i11 = i10 % 2;
        }
        if ((i7 & 147) != 146) {
            int i12 = IconCompatParcelizer + 15;
            serializer = i12 % Fields.SpotShadowColor;
            int i13 = i12 % 2;
            z = true;
        } else {
            z = false;
        }
        if (getpostalcode.write(i7 & 1, z)) {
            Modifier.Companion companion = Modifier.Companion;
            Object objComponentActivity = getpostalcode.ComponentActivity();
            if (objComponentActivity == getCreditCardExpirationMonth.write) {
                objComponentActivity = new b8$$ExternalSyntheticLambda4(1);
                getpostalcode.write(objComponentActivity);
            }
            TextKt.m131TextNvy7gAk(str, ClickableKt.serializer(companion, r8lambdardpfsr94j4iebcwx_kpqzpm8k0, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) objComponentActivity), ((buildMapping) getpostalcode.write((getNewPassword) performMeasureDjhGOtQ.RemoteActionCompatParcelizer)).setMenuPrepared(), 0L, FontWeight.Companion.getBold(), null, 0L, null, 0L, TextOverflow.Companion.m3569getEllipsisgIe3tQ8(), false, 3, 0, null, performLayout.IconCompatParcelizer(), getpostalcode, (i7 & 14) | 1572864, 24960, 110520);
            modifier2 = companion;
        } else {
            getpostalcode.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
            modifier2 = modifier;
        }
        getHandleruiannotations gethandleruiannotationsMediaDescriptionCompat = getpostalcode.MediaDescriptionCompat();
        if (gethandleruiannotationsMediaDescriptionCompat != null) {
            gethandleruiannotationsMediaDescriptionCompat.serializer = new computeHorizontalScrollExtent(str, modifier2, r8lambdardpfsr94j4iebcwx_kpqzpm8k0, i, 9);
        }
    }

    public static final void DestinationHeaderWithAddressActions(int i, getBirthDateFull getbirthdatefull, DragAndDropTargetModifierNode dragAndDropTargetModifierNode, DragAndDropTargetModifierNode dragAndDropTargetModifierNode2, Modifier modifier) {
        int i2;
        int i3;
        int i4;
        int i5 = 2 % 2;
        int i6 = serializer + 91;
        IconCompatParcelizer = i6 % Fields.SpotShadowColor;
        int i7 = i6 % 2;
        getPostalCode getpostalcode = (getPostalCode) getbirthdatefull;
        getpostalcode.MediaSessionCompatQueueItem(-2070971159);
        if ((i & 6) == 0) {
            i2 = (getpostalcode.IconCompatParcelizer(dragAndDropTargetModifierNode) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            if (!getpostalcode.IconCompatParcelizer(dragAndDropTargetModifierNode2)) {
                i4 = 16;
            } else {
                int i8 = serializer + 87;
                IconCompatParcelizer = i8 % Fields.SpotShadowColor;
                i4 = i8 % 2 != 0 ? 7 : 32;
            }
            i2 |= i4;
        }
        if ((i & 384) == 0) {
            if (getpostalcode.read(modifier)) {
                int i9 = IconCompatParcelizer + 93;
                serializer = i9 % Fields.SpotShadowColor;
                int i10 = i9 % 2;
                i3 = Fields.RotationX;
            } else {
                i3 = Fields.SpotShadowColor;
            }
            i2 |= i3;
        }
        if (getpostalcode.write(i2 & 1, (i2 & 147) != 146)) {
            Modifier modifier2 = SizeKt.read(modifier);
            PlaybackStateCompatCustomAction playbackStateCompatCustomAction = Arrangement.MediaBrowserCompatMediaItem;
            supportingTextPaddinga9UjIt4material3default supportingtextpaddinga9ujit4material3defaultSerializer = TextFieldDefaults.serializer(Arrangement.IconCompatParcelizer(Dimensions.getActionBarHideOffset), Alignment.Companion.getTop(), getpostalcode, 0);
            int iHashCode = Long.hashCode(getpostalcode.RatingCompat);
            DragAndDropNodestartDragAndDropTransfer1 dragAndDropNodestartDragAndDropTransfer1Serializer = getpostalcode.serializer();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(getpostalcode, modifier2);
            ComposeUiNode.Companion companion = ComposeUiNode.Companion;
            r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 constructor = companion.getConstructor();
            if (getpostalcode.read == null) {
                SentryUUID.write();
                throw null;
            }
            getpostalcode.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg();
            if (getpostalcode.ComponentActivity) {
                int i11 = serializer + 5;
                IconCompatParcelizer = i11 % Fields.SpotShadowColor;
                int i12 = i11 % 2;
                getpostalcode.serializer(constructor);
            } else {
                getpostalcode.r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28();
            }
            r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.read(companion, getpostalcode, supportingtextpaddinga9ujit4material3defaultSerializer, getpostalcode, dragAndDropNodestartDragAndDropTransfer1Serializer);
            AndroidContentCaptureManagerCompanion.write(getpostalcode, modifierMaterializeModifier, m1$$ExternalSyntheticOutline0.m(companion, getpostalcode, Integer.valueOf(iHashCode), getpostalcode));
            dragAndDropTargetModifierNode.invoke(getpostalcode, Integer.valueOf(i2 & 14));
            dragAndDropTargetModifierNode2.invoke(getpostalcode, Integer.valueOf((i2 >> 3) & 14));
            getpostalcode.IconCompatParcelizer(true);
        } else {
            getpostalcode.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
        }
        getHandleruiannotations gethandleruiannotationsMediaDescriptionCompat = getpostalcode.MediaDescriptionCompat();
        if (gethandleruiannotationsMediaDescriptionCompat != null) {
            gethandleruiannotationsMediaDescriptionCompat.serializer = new getStore(i, 10, dragAndDropTargetModifierNode, dragAndDropTargetModifierNode2, modifier);
        }
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0039  */
    /* JADX WARN: Code duplicated, block: B:12:0x003e  */
    /* JADX WARN: Code duplicated, block: B:15:0x0045  */
    /* JADX WARN: Code duplicated, block: B:16:0x0047  */
    /* JADX WARN: Code duplicated, block: B:18:0x004b A[PHI: r1
  0x004b: PHI (r1v24 o.getPostalCode) = (r1v5 o.getPostalCode), (r1v26 o.getPostalCode) binds: [B:8:0x0033, B:5:0x0024] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:9:0x0035 A[PHI: r1
  0x0035: PHI (r1v6 o.getPostalCode) = (r1v5 o.getPostalCode), (r1v26 o.getPostalCode) binds: [B:8:0x0033, B:5:0x0024] A[DONT_GENERATE, DONT_INLINE]] */
    public static final void serializer(AndroidTextPaint androidTextPaint, r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k0, Modifier modifier, DragAndDropTargetModifierNode dragAndDropTargetModifierNode, DragAndDropTargetModifierNode dragAndDropTargetModifierNode2, getBirthDateFull getbirthdatefull, int i) {
        getPostalCode getpostalcode;
        boolean zIconCompatParcelizer;
        int i2;
        int i3;
        getPostalCode getpostalcode2;
        getPostalCode getpostalcode3;
        int i4 = 2 % 2;
        int i5 = IconCompatParcelizer + 49;
        serializer = i5 % Fields.SpotShadowColor;
        if (i5 % 2 == 0) {
            r8lambdardpfsr94j4iebcwx_kpqzpm8k0.getClass();
            getpostalcode = (getPostalCode) getbirthdatefull;
            getpostalcode.MediaSessionCompatQueueItem(62643340);
            if ((i & 16) == 0) {
                if ((i & 8) == 0) {
                    zIconCompatParcelizer = getpostalcode.read(androidTextPaint);
                } else {
                    zIconCompatParcelizer = getpostalcode.IconCompatParcelizer(androidTextPaint);
                }
                if (!zIconCompatParcelizer) {
                    i2 = 2;
                } else {
                    i2 = 4;
                }
                i3 = i2 | i;
                getpostalcode2 = getpostalcode;
            } else {
                getpostalcode2 = getpostalcode;
                i3 = i;
            }
        } else {
            r8lambdardpfsr94j4iebcwx_kpqzpm8k0.getClass();
            getpostalcode = (getPostalCode) getbirthdatefull;
            getpostalcode.MediaSessionCompatQueueItem(62643340);
            if ((i & 6) == 0) {
                if ((i & 8) == 0) {
                    zIconCompatParcelizer = getpostalcode.read(androidTextPaint);
                } else {
                    zIconCompatParcelizer = getpostalcode.IconCompatParcelizer(androidTextPaint);
                }
                if (!zIconCompatParcelizer) {
                    i2 = 2;
                } else {
                    i2 = 4;
                }
                i3 = i2 | i;
                getpostalcode2 = getpostalcode;
            } else {
                getpostalcode2 = getpostalcode;
                i3 = i;
            }
        }
        if ((i & 48) == 0) {
            i3 |= getpostalcode2.IconCompatParcelizer(r8lambdardpfsr94j4iebcwx_kpqzpm8k0) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            int i6 = IconCompatParcelizer + 1;
            serializer = i6 % Fields.SpotShadowColor;
            if (i6 % 2 != 0) {
                i3 |= !(getpostalcode2.read(modifier) ^ true) ? Fields.RotationX : Fields.SpotShadowColor;
            } else {
                getpostalcode2.read(modifier);
                Object obj = null;
                obj.hashCode();
                throw null;
            }
        }
        if ((i & 3072) == 0) {
            i3 |= getpostalcode2.IconCompatParcelizer(dragAndDropTargetModifierNode) ? Fields.CameraDistance : Fields.RotationZ;
        }
        if ((i & 24576) == 0) {
            i3 |= getpostalcode2.IconCompatParcelizer(dragAndDropTargetModifierNode2) ? Fields.Clip : 8192;
        }
        if (getpostalcode2.write(i3 & 1, (i3 & 9363) != 9362)) {
            getpostalcode3 = getpostalcode2;
            SurfaceKt.m126SurfaceT9BRK9s(PaddingKt.RemoteActionCompatParcelizer(SizeKt.write(modifier, 1.0f), Dimensions.setActionBarVisibilityCallback, Dimensions.getNestedScrollAxes), null, ((buildMapping) getpostalcode2.write((getNewPassword) performMeasureDjhGOtQ.RemoteActionCompatParcelizer)).IconCompatParcelizer(), 0L, 0.0f, 0.0f, null, ExtrasKt.write(1191469073, new LoadingFloatingButtonKt$$ExternalSyntheticLambda0(androidTextPaint, r8lambdardpfsr94j4iebcwx_kpqzpm8k0, dragAndDropTargetModifierNode, dragAndDropTargetModifierNode2, 4), getpostalcode2), getpostalcode3, 12582912, 122);
        } else {
            getpostalcode3 = getpostalcode2;
            getpostalcode3.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
        }
        getHandleruiannotations gethandleruiannotationsMediaDescriptionCompat = getpostalcode3.MediaDescriptionCompat();
        if (gethandleruiannotationsMediaDescriptionCompat != null) {
            gethandleruiannotationsMediaDescriptionCompat.serializer = new getBrushui_text(androidTextPaint, r8lambdardpfsr94j4iebcwx_kpqzpm8k0, modifier, dragAndDropTargetModifierNode, dragAndDropTargetModifierNode2, i, 0);
        }
    }

    public static final void DestinationHeaderWithAddressDeliveryStatus(AndroidTextPaint androidTextPaint, DragAndDropTargetModifierNode dragAndDropTargetModifierNode, DragAndDropTargetModifierNode dragAndDropTargetModifierNode2, Modifier modifier, getBirthDateFull getbirthdatefull, int i) {
        int i2;
        boolean z;
        Modifier modifier2;
        int i3;
        int i4;
        int i5;
        int i6 = 2 % 2;
        getPostalCode getpostalcode = (getPostalCode) getbirthdatefull;
        getpostalcode.MediaSessionCompatQueueItem(720562197);
        if ((i & 6) == 0) {
            if ((i & 8) == 0 ? getpostalcode.read(androidTextPaint) : getpostalcode.IconCompatParcelizer(androidTextPaint)) {
                int i7 = serializer + 45;
                int i8 = i7 % Fields.SpotShadowColor;
                IconCompatParcelizer = i8;
                int i9 = i7 % 2;
                int i10 = i8 + 89;
                serializer = i10 % Fields.SpotShadowColor;
                int i11 = i10 % 2;
                i5 = 4;
            } else {
                i5 = 2;
            }
            i2 = i5 | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            if (getpostalcode.IconCompatParcelizer(dragAndDropTargetModifierNode)) {
                int i12 = IconCompatParcelizer + 117;
                serializer = i12 % Fields.SpotShadowColor;
                i4 = i12 % 2 == 0 ? 127 : 32;
            } else {
                i4 = 16;
            }
            i2 |= i4;
        }
        if ((i & 384) == 0) {
            if (!(!getpostalcode.IconCompatParcelizer(dragAndDropTargetModifierNode2))) {
                int i13 = serializer + 59;
                IconCompatParcelizer = i13 % Fields.SpotShadowColor;
                int i14 = i13 % 2;
                i3 = Fields.RotationX;
            } else {
                i3 = Fields.SpotShadowColor;
            }
            i2 |= i3;
        }
        int i15 = i2 | 3072;
        if ((i15 & 1171) != 1170) {
            int i16 = IconCompatParcelizer + 111;
            serializer = i16 % Fields.SpotShadowColor;
            int i17 = i16 % 2;
            z = true;
        } else {
            int i18 = serializer + 63;
            IconCompatParcelizer = i18 % Fields.SpotShadowColor;
            int i19 = i18 % 2;
            z = false;
        }
        if (!(!getpostalcode.write(i15 & 1, z))) {
            modifier2 = Modifier.Companion;
            Modifier modifierWrite = SizeKt.write(modifier2, 1.0f);
            PlaybackStateCompatCustomAction playbackStateCompatCustomAction = Arrangement.MediaBrowserCompatMediaItem;
            snapElevation snapelevationIconCompatParcelizer = Arrangement.IconCompatParcelizer(Dimensions.getActionBarHideOffset);
            Alignment.Companion companion = Alignment.Companion;
            supportingTextPaddinga9UjIt4material3default supportingtextpaddinga9ujit4material3defaultSerializer = TextFieldDefaults.serializer(snapelevationIconCompatParcelizer, companion.getTop(), getpostalcode, 0);
            int iHashCode = Long.hashCode(getpostalcode.RatingCompat);
            DragAndDropNodestartDragAndDropTransfer1 dragAndDropNodestartDragAndDropTransfer1Serializer = getpostalcode.serializer();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(getpostalcode, modifierWrite);
            ComposeUiNode.Companion companion2 = ComposeUiNode.Companion;
            r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 constructor = companion2.getConstructor();
            if (getpostalcode.read == null) {
                SentryUUID.write();
                throw null;
            }
            getpostalcode.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg();
            if (getpostalcode.ComponentActivity) {
                getpostalcode.serializer(constructor);
            } else {
                getpostalcode.r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28();
            }
            r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.read(companion2, getpostalcode, supportingtextpaddinga9ujit4material3defaultSerializer, getpostalcode, dragAndDropNodestartDragAndDropTransfer1Serializer);
            AndroidContentCaptureManagerCompanion.write(getpostalcode, modifierMaterializeModifier, m1$$ExternalSyntheticOutline0.m(companion2, getpostalcode, Integer.valueOf(iHashCode), getpostalcode));
            DestinationHeaderWithAddressDeliveryStatusContent(androidTextPaint, modifier2.then(new emitcomroadrunnerdeliveryonthewayentrancepicturenavigationusecaseObserveNavigationEntrancePictureinvokeinlinedmap12(companion.getCenterVertically())), getpostalcode, ((i15 << 3) & 112) | 70);
            DestinationHeaderWithAddressActions((i15 >> 3) & 126, getpostalcode, dragAndDropTargetModifierNode, dragAndDropTargetModifierNode2, modifier2.then(new emitcomroadrunnerdeliveryonthewayentrancepicturenavigationusecaseObserveNavigationEntrancePictureinvokeinlinedmap12(companion.getTop())));
            getpostalcode.IconCompatParcelizer(true);
        } else {
            getpostalcode.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
            modifier2 = modifier;
        }
        int i20 = IconCompatParcelizer + 11;
        serializer = i20 % Fields.SpotShadowColor;
        int i21 = i20 % 2;
        getHandleruiannotations gethandleruiannotationsMediaDescriptionCompat = getpostalcode.MediaDescriptionCompat();
        if (gethandleruiannotationsMediaDescriptionCompat != null) {
            gethandleruiannotationsMediaDescriptionCompat.serializer = new getHasCamera((Object) androidTextPaint, (Object) dragAndDropTargetModifierNode, (Object) dragAndDropTargetModifierNode2, modifier2, i, 19);
        }
    }

    public static final void DestinationHeaderWithAddress(AndroidTextPaint androidTextPaint, r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k0, Modifier modifier, DragAndDropTargetModifierNode dragAndDropTargetModifierNode, DragAndDropTargetModifierNode dragAndDropTargetModifierNode2, getBirthDateFull getbirthdatefull, int i) {
        int i2;
        Modifier modifier2;
        boolean zIconCompatParcelizer;
        int i3 = 2 % 2;
        getPostalCode getpostalcode = (getPostalCode) getbirthdatefull;
        getpostalcode.MediaSessionCompatQueueItem(884933227);
        if ((i & 6) == 0) {
            if ((i & 8) != 0) {
                zIconCompatParcelizer = getpostalcode.IconCompatParcelizer(androidTextPaint);
            } else {
                int i4 = serializer + 11;
                IconCompatParcelizer = i4 % Fields.SpotShadowColor;
                if (i4 % 2 != 0) {
                    zIconCompatParcelizer = getpostalcode.read(androidTextPaint);
                    int i5 = 95 / 0;
                } else {
                    zIconCompatParcelizer = getpostalcode.read(androidTextPaint);
                }
            }
            i2 = (zIconCompatParcelizer ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            int i6 = serializer + 117;
            IconCompatParcelizer = i6 % Fields.SpotShadowColor;
            if (i6 % 2 == 0) {
                i2 |= getpostalcode.IconCompatParcelizer(r8lambdardpfsr94j4iebcwx_kpqzpm8k0) ? 32 : 16;
            } else {
                getpostalcode.IconCompatParcelizer(r8lambdardpfsr94j4iebcwx_kpqzpm8k0);
                throw null;
            }
        }
        int i7 = i2 | 384;
        if ((i & 3072) == 0) {
            i7 |= getpostalcode.IconCompatParcelizer(dragAndDropTargetModifierNode) ? Fields.CameraDistance : Fields.RotationZ;
        }
        if ((i & 24576) == 0) {
            i7 |= !(getpostalcode.IconCompatParcelizer(dragAndDropTargetModifierNode2) ^ true) ? Fields.Clip : 8192;
        }
        int i8 = i7;
        if (getpostalcode.write(i8 & 1, (i8 & 9363) != 9362)) {
            Modifier.Companion companion = Modifier.Companion;
            PlaybackStateCompatCustomAction playbackStateCompatCustomAction = Arrangement.MediaBrowserCompatMediaItem;
            int i9 = i8 >> 6;
            ModalBottomSheetYbuCTN8 modalBottomSheetYbuCTN8Serializer = ModalBottomSheetKtModalBottomSheet311.serializer(Arrangement.IconCompatParcelizer(Dimensions.setMenu), Alignment.Companion.getStart(), getpostalcode, 0);
            int iHashCode = Long.hashCode(getpostalcode.RatingCompat);
            DragAndDropNodestartDragAndDropTransfer1 dragAndDropNodestartDragAndDropTransfer1Serializer = getpostalcode.serializer();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(getpostalcode, companion);
            ComposeUiNode.Companion companion2 = ComposeUiNode.Companion;
            r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 constructor = companion2.getConstructor();
            if (getpostalcode.read == null) {
                SentryUUID.write();
                throw null;
            }
            int i10 = serializer + 55;
            IconCompatParcelizer = i10 % Fields.SpotShadowColor;
            if (i10 % 2 == 0) {
                getpostalcode.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg();
                if (getpostalcode.ComponentActivity) {
                    getpostalcode.serializer(constructor);
                } else {
                    getpostalcode.r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28();
                }
                c8$$ExternalSyntheticOutline0.m(companion2, getpostalcode, modalBottomSheetYbuCTN8Serializer, getpostalcode, dragAndDropNodestartDragAndDropTransfer1Serializer);
                AndroidContentCaptureManagerCompanion.write(getpostalcode, modifierMaterializeModifier, m1$$ExternalSyntheticOutline0.m(companion2, getpostalcode, Integer.valueOf(iHashCode), getpostalcode));
                DestinationHeaderWithAddressDeliveryStatus(androidTextPaint, dragAndDropTargetModifierNode, dragAndDropTargetModifierNode2, null, getpostalcode, (i8 & 14) | 8 | (i9 & 112) | (i9 & 896));
                serializer((i8 << 3) & 896, getpostalcode, null, androidTextPaint.read.IconCompatParcelizer, r8lambdardpfsr94j4iebcwx_kpqzpm8k0);
                getpostalcode.IconCompatParcelizer(true);
                modifier2 = companion;
            } else {
                Object obj = null;
                getpostalcode.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg();
                boolean z = getpostalcode.ComponentActivity;
                obj.hashCode();
                throw null;
            }
        } else {
            getpostalcode.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
            modifier2 = modifier;
        }
        getHandleruiannotations gethandleruiannotationsMediaDescriptionCompat = getpostalcode.MediaDescriptionCompat();
        if (gethandleruiannotationsMediaDescriptionCompat != null) {
            gethandleruiannotationsMediaDescriptionCompat.serializer = new getBrushui_text(androidTextPaint, r8lambdardpfsr94j4iebcwx_kpqzpm8k0, modifier2, dragAndDropTargetModifierNode, dragAndDropTargetModifierNode2, i, 1);
        }
    }

    public static final void DestinationHeaderWithAddressDeliveryStatusContent(AndroidTextPaint androidTextPaint, Modifier modifier, getBirthDateFull getbirthdatefull, int i) {
        int i2;
        getPostalCode getpostalcode;
        boolean z;
        int i3;
        int i4;
        int i5 = 2 % 2;
        getPostalCode getpostalcode2 = (getPostalCode) getbirthdatefull;
        getpostalcode2.MediaSessionCompatQueueItem(-233988512);
        if ((i & 6) == 0) {
            if (getpostalcode2.read(TextFieldKt.read)) {
                int i6 = IconCompatParcelizer + 23;
                serializer = i6 % Fields.SpotShadowColor;
                int i7 = i6 % 2;
                i4 = 4;
            } else {
                i4 = 2;
            }
            i2 = i4 | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            int i8 = serializer + 41;
            IconCompatParcelizer = i8 % Fields.SpotShadowColor;
            if ((i8 % 2 == 0 ? (i & 64) != 0 : (i & 117) != 0) ? getpostalcode2.IconCompatParcelizer(androidTextPaint) : getpostalcode2.read(androidTextPaint)) {
                int i9 = serializer + 55;
                IconCompatParcelizer = i9 % Fields.SpotShadowColor;
                i3 = i9 % 2 != 0 ? 43 : 32;
            } else {
                int i10 = serializer + 5;
                IconCompatParcelizer = i10 % Fields.SpotShadowColor;
                int i11 = i10 % 2;
                i3 = 16;
            }
            i2 |= i3;
        }
        if ((i & 384) == 0) {
            i2 |= getpostalcode2.read(modifier) ^ true ? Fields.SpotShadowColor : Fields.RotationX;
        }
        if (getpostalcode2.write(i2 & 1, (i2 & 147) != 146)) {
            Modifier modifierWrite = copyejIjP34.write(modifier, 1.0f);
            ModalBottomSheetYbuCTN8 modalBottomSheetYbuCTN8Serializer = ModalBottomSheetKtModalBottomSheet311.serializer(Arrangement.MediaDescriptionCompat, Alignment.Companion.getStart(), getpostalcode2, 0);
            int iHashCode = Long.hashCode(getpostalcode2.RatingCompat);
            DragAndDropNodestartDragAndDropTransfer1 dragAndDropNodestartDragAndDropTransfer1Serializer = getpostalcode2.serializer();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(getpostalcode2, modifierWrite);
            ComposeUiNode.Companion companion = ComposeUiNode.Companion;
            r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 constructor = companion.getConstructor();
            if (getpostalcode2.read == null) {
                SentryUUID.write();
                throw null;
            }
            int i12 = serializer + 105;
            IconCompatParcelizer = i12 % Fields.SpotShadowColor;
            int i13 = i12 % 2;
            getpostalcode2.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg();
            if (getpostalcode2.ComponentActivity) {
                int i14 = IconCompatParcelizer + 81;
                serializer = i14 % Fields.SpotShadowColor;
                int i15 = i14 % 2;
                getpostalcode2.serializer(constructor);
            } else {
                getpostalcode2.r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28();
            }
            c8$$ExternalSyntheticOutline0.m(companion, getpostalcode2, modalBottomSheetYbuCTN8Serializer, getpostalcode2, dragAndDropNodestartDragAndDropTransfer1Serializer);
            AndroidContentCaptureManagerCompanion.write(getpostalcode2, modifierMaterializeModifier, m1$$ExternalSyntheticOutline0.m(companion, getpostalcode2, Integer.valueOf(iHashCode), getpostalcode2));
            if (hideCurrentlyDisplayingInAppMessage.serializer((CharSequence) androidTextPaint.write)) {
                z = false;
                getpostalcode2.serializer(-1148991732);
                getpostalcode2.IconCompatParcelizer(false);
            } else {
                int i16 = IconCompatParcelizer + 19;
                serializer = i16 % Fields.SpotShadowColor;
                int i17 = i16 % 2;
                getpostalcode2.serializer(-1149257278);
                z = false;
                TextKt.m131TextNvy7gAk(androidTextPaint.write, null, ((buildMapping) getpostalcode2.write((getNewPassword) performMeasureDjhGOtQ.RemoteActionCompatParcelizer)).setMenu(), 0L, null, null, 0L, null, 0L, TextOverflow.Companion.m3569getEllipsisgIe3tQ8(), false, 2, 0, null, performLayout.MediaSessionCompatToken(), getpostalcode2, 0, 24960, 110586);
                getpostalcode2 = getpostalcode2;
                getpostalcode2.IconCompatParcelizer(false);
            }
            if (hideCurrentlyDisplayingInAppMessage.serializer((CharSequence) androidTextPaint.RemoteActionCompatParcelizer)) {
                getpostalcode = getpostalcode2;
                getpostalcode.serializer(-1148691156);
                getpostalcode.IconCompatParcelizer(z);
            } else {
                getpostalcode2.serializer(-1148923067);
                getPostalCode getpostalcode3 = getpostalcode2;
                TextKt.m131TextNvy7gAk(androidTextPaint.RemoteActionCompatParcelizer, null, ((buildMapping) getpostalcode2.write((getNewPassword) performMeasureDjhGOtQ.RemoteActionCompatParcelizer)).getSupportBackgroundTintMode(), 0L, null, null, 0L, null, 0L, TextOverflow.Companion.m3569getEllipsisgIe3tQ8(), false, 2, 0, null, performLayout.IconCompatParcelizer(), getpostalcode3, 0, 24960, 110586);
                getpostalcode = getpostalcode3;
                getpostalcode.IconCompatParcelizer(z);
            }
            getpostalcode.IconCompatParcelizer(true);
        } else {
            getpostalcode = getpostalcode2;
            getpostalcode.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
        }
        getHandleruiannotations gethandleruiannotationsMediaDescriptionCompat = getpostalcode.MediaDescriptionCompat();
        if (gethandleruiannotationsMediaDescriptionCompat != null) {
            gethandleruiannotationsMediaDescriptionCompat.serializer = new AndroidFontTypefaceLoader(i, 6, androidTextPaint, modifier);
        }
    }
}
