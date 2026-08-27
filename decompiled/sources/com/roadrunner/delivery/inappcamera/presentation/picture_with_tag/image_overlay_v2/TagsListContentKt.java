package com.roadrunner.delivery.inappcamera.presentation.picture_with_tag.image_overlay_v2;

import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.FlowLayoutKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.material3.TextKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Fields;
import androidx.compose.ui.node.ComposeUiNode;
import bo.app.c8$$ExternalSyntheticOutline0;
import bo.app.m1$$ExternalSyntheticOutline0;
import coil3.ExtrasKt;
import coil3.compose.SubcomposeAsyncImageKt$$ExternalSyntheticLambda2;
import com.roadrunner.delivery.inappcamera.api.model.InAppCameraOverlayItem$Tag;
import com.roadrunner.designsystem.compose.theme.tokens.Dimensions;
import io.sentry.SentryUUID;
import java.util.ListIterator;
import o.AndroidContentCaptureManagerCompanion;
import o.AndroidFontTypefaceLoader;
import o.CursorAnchorInfoControllerinvalidate11;
import o.DragAndDropNodestartDragAndDropTransfer1;
import o.IconCompatParcelizer;
import o.ModalBottomSheetKtModalBottomSheet311;
import o.ModalBottomSheetYbuCTN8;
import o.buildMapping;
import o.getBirthDateFull;
import o.getHandleruiannotations;
import o.getNewPassword;
import o.getPostalCode;
import o.handleUrlOverridelambda1;
import o.performLayout;
import o.performMeasureDjhGOtQ;
import o.r8lambdaIIDSddYIrTyMDUl5lt6pmt2zYsQ;
import o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0;

/* JADX INFO: loaded from: classes3.dex */
public abstract class TagsListContentKt {
    private static int RemoteActionCompatParcelizer = 1;
    private static int write;

    public static final void TagsList(r8lambdaIIDSddYIrTyMDUl5lt6pmt2zYsQ r8lambdaiidsddyirtymdul5lt6pmt2zysq, Modifier modifier, getBirthDateFull getbirthdatefull, int i) {
        int i2;
        boolean z;
        Modifier modifier2;
        int i3;
        int i4 = 2 % 2;
        int i5 = RemoteActionCompatParcelizer + 115;
        write = i5 % Fields.SpotShadowColor;
        int i6 = i5 % 2;
        r8lambdaiidsddyirtymdul5lt6pmt2zysq.getClass();
        getPostalCode getpostalcode = (getPostalCode) getbirthdatefull;
        getpostalcode.MediaSessionCompatQueueItem(-1713117502);
        if ((i & 6) == 0) {
            if ((i & 8) == 0 ? getpostalcode.read(r8lambdaiidsddyirtymdul5lt6pmt2zysq) : getpostalcode.IconCompatParcelizer(r8lambdaiidsddyirtymdul5lt6pmt2zysq)) {
                int i7 = write + 101;
                RemoteActionCompatParcelizer = i7 % Fields.SpotShadowColor;
                int i8 = i7 % 2;
                i3 = 4;
            } else {
                i3 = 2;
            }
            i2 = i3 | i;
        } else {
            i2 = i;
        }
        int i9 = i2 | 48;
        if ((i9 & 19) != 18) {
            int i10 = RemoteActionCompatParcelizer + 121;
            write = i10 % Fields.SpotShadowColor;
            int i11 = i10 % 2;
            z = true;
        } else {
            z = false;
        }
        if (getpostalcode.write(i9 & 1, z)) {
            modifier2 = Modifier.Companion;
            ModalBottomSheetYbuCTN8 modalBottomSheetYbuCTN8Serializer = ModalBottomSheetKtModalBottomSheet311.serializer(Arrangement.MediaDescriptionCompat, Alignment.Companion.getStart(), getpostalcode, 0);
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
                getpostalcode.serializer(constructor);
            } else {
                getpostalcode.r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28();
            }
            c8$$ExternalSyntheticOutline0.m(companion, getpostalcode, modalBottomSheetYbuCTN8Serializer, getpostalcode, dragAndDropNodestartDragAndDropTransfer1Serializer);
            AndroidContentCaptureManagerCompanion.write(getpostalcode, modifierMaterializeModifier, m1$$ExternalSyntheticOutline0.m(companion, getpostalcode, Integer.valueOf(iHashCode), getpostalcode));
            getpostalcode.serializer(-1862691374);
            ListIterator<Object> listIterator = r8lambdaiidsddyirtymdul5lt6pmt2zysq.listIterator(0);
            while (listIterator.hasNext()) {
                TagsItem((InAppCameraOverlayItem$Tag) listIterator.next(), null, getpostalcode, 8);
                ExtrasKt.read(913837329, handleUrlOverridelambda1.RemoteActionCompatParcelizer(), handleUrlOverridelambda1.RemoteActionCompatParcelizer(), -913837326, handleUrlOverridelambda1.RemoteActionCompatParcelizer(), handleUrlOverridelambda1.RemoteActionCompatParcelizer(), new Object[]{getpostalcode, SizeKt.m75height3ABfNKs(Modifier.Companion, Dimensions.getNestedScrollAxes)});
            }
            getpostalcode.IconCompatParcelizer(false);
            getpostalcode.IconCompatParcelizer(true);
        } else {
            getpostalcode.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
            modifier2 = modifier;
        }
        getHandleruiannotations gethandleruiannotationsMediaDescriptionCompat = getpostalcode.MediaDescriptionCompat();
        if (gethandleruiannotationsMediaDescriptionCompat != null) {
            gethandleruiannotationsMediaDescriptionCompat.serializer = new CursorAnchorInfoControllerinvalidate11(r8lambdaiidsddyirtymdul5lt6pmt2zysq, modifier2, i, 0);
        }
        int i12 = RemoteActionCompatParcelizer + 101;
        write = i12 % Fields.SpotShadowColor;
        if (i12 % 2 != 0) {
            int i13 = 16 / 0;
        }
    }

    /* JADX WARN: Code duplicated, block: B:13:0x003e  */
    public static final void TagsItem(InAppCameraOverlayItem$Tag inAppCameraOverlayItem$Tag, Modifier modifier, getBirthDateFull getbirthdatefull, int i) {
        int i2;
        boolean z;
        getPostalCode getpostalcode;
        int i3;
        Object obj;
        Modifier.Companion companion;
        int i4;
        int i5 = 2 % 2;
        inAppCameraOverlayItem$Tag.getClass();
        getPostalCode getpostalcode2 = (getPostalCode) getbirthdatefull;
        getpostalcode2.MediaSessionCompatQueueItem(1386521838);
        if ((i & 6) == 0) {
            int i6 = RemoteActionCompatParcelizer + 83;
            write = i6 % Fields.SpotShadowColor;
            int i7 = i6 % 2;
            if ((i & 8) == 0 ? getpostalcode2.read(inAppCameraOverlayItem$Tag) : getpostalcode2.IconCompatParcelizer(inAppCameraOverlayItem$Tag)) {
                int i8 = write + 3;
                RemoteActionCompatParcelizer = i8 % Fields.SpotShadowColor;
                if (i8 % 2 == 0) {
                    i4 = 2;
                } else {
                    i4 = 4;
                }
            } else {
                i4 = 2;
            }
            i2 = i4 | i;
        } else {
            i2 = i;
        }
        int i9 = i2 | 48;
        if ((i9 & 19) != 18) {
            int i10 = RemoteActionCompatParcelizer + 109;
            write = i10 % Fields.SpotShadowColor;
            int i11 = i10 % 2;
            z = true;
        } else {
            z = false;
        }
        if (getpostalcode2.write(i9 & 1, z)) {
            int i12 = RemoteActionCompatParcelizer + 117;
            write = i12 % Fields.SpotShadowColor;
            int i13 = i12 % 2;
            Modifier.Companion companion2 = Modifier.Companion;
            ModalBottomSheetYbuCTN8 modalBottomSheetYbuCTN8Serializer = ModalBottomSheetKtModalBottomSheet311.serializer(Arrangement.MediaDescriptionCompat, Alignment.Companion.getStart(), getpostalcode2, 0);
            int iHashCode = Long.hashCode(getpostalcode2.RatingCompat);
            DragAndDropNodestartDragAndDropTransfer1 dragAndDropNodestartDragAndDropTransfer1Serializer = getpostalcode2.serializer();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(getpostalcode2, companion2);
            ComposeUiNode.Companion companion3 = ComposeUiNode.Companion;
            r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 constructor = companion3.getConstructor();
            if (getpostalcode2.read == null) {
                SentryUUID.write();
                throw null;
            }
            int i14 = write + 107;
            RemoteActionCompatParcelizer = i14 % Fields.SpotShadowColor;
            if (i14 % 2 == 0) {
                getpostalcode2.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg();
                boolean z2 = getpostalcode2.ComponentActivity;
                throw null;
            }
            getpostalcode2.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg();
            if (getpostalcode2.ComponentActivity) {
                getpostalcode2.serializer(constructor);
            } else {
                getpostalcode2.r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28();
            }
            c8$$ExternalSyntheticOutline0.m(companion3, getpostalcode2, modalBottomSheetYbuCTN8Serializer, getpostalcode2, dragAndDropNodestartDragAndDropTransfer1Serializer);
            AndroidContentCaptureManagerCompanion.write(getpostalcode2, modifierMaterializeModifier, m1$$ExternalSyntheticOutline0.m(companion3, getpostalcode2, Integer.valueOf(iHashCode), getpostalcode2));
            String str = inAppCameraOverlayItem$Tag.serializer;
            if (str == null) {
                getpostalcode2.serializer(-1716780232);
                getpostalcode2.IconCompatParcelizer(false);
                companion = companion2;
                getpostalcode = getpostalcode2;
            } else {
                getpostalcode2.serializer(-1716780231);
                TextKt.m131TextNvy7gAk(str, null, ((buildMapping) getpostalcode2.write((getNewPassword) performMeasureDjhGOtQ.RemoteActionCompatParcelizer)).getPopupTheme(), 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, performLayout.RemoteActionCompatParcelizer(), getpostalcode2, 0, 0, 131066);
                getpostalcode = getpostalcode2;
                Modifier.Companion companion4 = companion2;
                IconCompatParcelizer.IconCompatParcelizer(companion4, Dimensions.getNestedScrollAxes, getpostalcode, false);
                companion = companion4;
            }
            FlowLayoutKt.serializer(null, Arrangement.IconCompatParcelizer(Dimensions.getNestedScrollAxes), Arrangement.IconCompatParcelizer(Dimensions.setMenu), null, 0, 0, ExtrasKt.write(1647087689, new SubcomposeAsyncImageKt$$ExternalSyntheticLambda2(11, inAppCameraOverlayItem$Tag), getpostalcode), getpostalcode, 1572864, 57);
            i3 = 1;
            getpostalcode.IconCompatParcelizer(true);
            obj = companion;
        } else {
            getpostalcode = getpostalcode2;
            i3 = 1;
            getpostalcode.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
            obj = modifier;
        }
        getHandleruiannotations gethandleruiannotationsMediaDescriptionCompat = getpostalcode.MediaDescriptionCompat();
        if (gethandleruiannotationsMediaDescriptionCompat != null) {
            gethandleruiannotationsMediaDescriptionCompat.serializer = new AndroidFontTypefaceLoader(i, i3, inAppCameraOverlayItem$Tag, obj);
        }
    }
}
