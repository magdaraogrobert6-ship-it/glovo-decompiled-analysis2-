package com.roadrunner.delivery.pickupdropoff.tasks.takepicture.presentation.picture_with_tag.image_overlay_v2;

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
import com.roadrunner.delivery.pickupdropoff.tasks.model.OverlayItems$Tag$Companion;
import com.roadrunner.designsystem.compose.theme.tokens.Dimensions;
import io.sentry.SentryUUID;
import java.util.ListIterator;
import o.AndroidContentCaptureManagerCompanion;
import o.AndroidFontTypefaceLoader;
import o.C0158device;
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
    private static int read = 0;
    private static int serializer = 1;

    /* JADX WARN: Code duplicated, block: B:13:0x0047  */
    public static final void TagsList(r8lambdaIIDSddYIrTyMDUl5lt6pmt2zYsQ r8lambdaiidsddyirtymdul5lt6pmt2zysq, Modifier modifier, getBirthDateFull getbirthdatefull, int i) {
        int i2;
        Modifier modifier2;
        boolean zIconCompatParcelizer;
        int i3;
        int i4 = 2 % 2;
        int i5 = serializer + 35;
        read = i5 % Fields.SpotShadowColor;
        int i6 = i5 % 2;
        r8lambdaiidsddyirtymdul5lt6pmt2zysq.getClass();
        getPostalCode getpostalcode = (getPostalCode) getbirthdatefull;
        getpostalcode.MediaSessionCompatQueueItem(-2004706858);
        if ((i & 6) == 0) {
            if ((i & 8) == 0) {
                zIconCompatParcelizer = getpostalcode.read(r8lambdaiidsddyirtymdul5lt6pmt2zysq);
                int i7 = serializer + 119;
                read = i7 % Fields.SpotShadowColor;
                int i8 = i7 % 2;
            } else {
                zIconCompatParcelizer = getpostalcode.IconCompatParcelizer(r8lambdaiidsddyirtymdul5lt6pmt2zysq);
            }
            if (zIconCompatParcelizer) {
                int i9 = read + 51;
                serializer = i9 % Fields.SpotShadowColor;
                if (i9 % 2 == 0) {
                    i3 = 2;
                } else {
                    i3 = 4;
                }
            } else {
                i3 = 2;
            }
            i2 = i3 | i;
            int i10 = serializer + 71;
            read = i10 % Fields.SpotShadowColor;
            int i11 = i10 % 2;
        } else {
            i2 = i;
        }
        int i12 = i2 | 48;
        if (getpostalcode.write(i12 & 1, (i12 & 19) != 18)) {
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
                int i13 = read + 35;
                serializer = i13 % Fields.SpotShadowColor;
                if (i13 % 2 == 0) {
                    getpostalcode.serializer(constructor);
                    throw null;
                }
                getpostalcode.serializer(constructor);
            } else {
                getpostalcode.r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28();
            }
            c8$$ExternalSyntheticOutline0.m(companion, getpostalcode, modalBottomSheetYbuCTN8Serializer, getpostalcode, dragAndDropNodestartDragAndDropTransfer1Serializer);
            AndroidContentCaptureManagerCompanion.write(getpostalcode, modifierMaterializeModifier, m1$$ExternalSyntheticOutline0.m(companion, getpostalcode, Integer.valueOf(iHashCode), getpostalcode));
            getpostalcode.serializer(-26064154);
            ListIterator<Object> listIterator = r8lambdaiidsddyirtymdul5lt6pmt2zysq.listIterator(0);
            int i14 = read + 79;
            serializer = i14 % Fields.SpotShadowColor;
            int i15 = i14 % 2;
            while (listIterator.hasNext()) {
                C0158device c0158device = (C0158device) listIterator.next();
                OverlayItems$Tag$Companion overlayItems$Tag$Companion = C0158device.Companion;
                TagsItem(c0158device, null, getpostalcode, 8);
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
            gethandleruiannotationsMediaDescriptionCompat.serializer = new CursorAnchorInfoControllerinvalidate11(r8lambdaiidsddyirtymdul5lt6pmt2zysq, modifier2, i, 1);
        }
        int i16 = serializer + 15;
        read = i16 % Fields.SpotShadowColor;
        if (i16 % 2 != 0) {
            throw null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:33:0x00af  */
    /* JADX WARN: Code duplicated, block: B:34:0x00b3  */
    public static final void TagsItem(C0158device c0158device, Modifier modifier, getBirthDateFull getbirthdatefull, int i) {
        int i2;
        boolean z;
        getPostalCode getpostalcode;
        Object obj;
        Modifier.Companion companion;
        int i3;
        int i4 = 2 % 2;
        c0158device.getClass();
        getPostalCode getpostalcode2 = (getPostalCode) getbirthdatefull;
        getpostalcode2.MediaSessionCompatQueueItem(297961986);
        if ((i & 6) == 0) {
            int i5 = serializer + 5;
            read = i5 % Fields.SpotShadowColor;
            if ((i5 % 2 == 0 ? (i & 8) != 0 : (i & 22) != 0) ? getpostalcode2.IconCompatParcelizer(c0158device) : getpostalcode2.read(c0158device)) {
                int i6 = read + 53;
                serializer = i6 % Fields.SpotShadowColor;
                int i7 = i6 % 2;
                i3 = 4;
            } else {
                int i8 = read + 43;
                serializer = i8 % Fields.SpotShadowColor;
                int i9 = i8 % 2;
                i3 = 2;
            }
            i2 = i3 | i;
        } else {
            i2 = i;
        }
        int i10 = i2 | 48;
        if ((i10 & 19) != 18) {
            z = true;
        } else {
            int i11 = read + 47;
            serializer = i11 % Fields.SpotShadowColor;
            int i12 = i11 % 2;
            z = false;
        }
        if (getpostalcode2.write(i10 & 1, z)) {
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
            int i13 = read + 9;
            serializer = i13 % Fields.SpotShadowColor;
            if (i13 % 2 == 0) {
                getpostalcode2.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg();
                int i14 = 99 / 0;
                if (getpostalcode2.ComponentActivity) {
                    getpostalcode2.serializer(constructor);
                } else {
                    getpostalcode2.r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28();
                }
            } else {
                getpostalcode2.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg();
                if (getpostalcode2.ComponentActivity) {
                    getpostalcode2.serializer(constructor);
                } else {
                    getpostalcode2.r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28();
                }
            }
            c8$$ExternalSyntheticOutline0.m(companion3, getpostalcode2, modalBottomSheetYbuCTN8Serializer, getpostalcode2, dragAndDropNodestartDragAndDropTransfer1Serializer);
            AndroidContentCaptureManagerCompanion.write(getpostalcode2, modifierMaterializeModifier, m1$$ExternalSyntheticOutline0.m(companion3, getpostalcode2, Integer.valueOf(iHashCode), getpostalcode2));
            String str = c0158device.title;
            if (str == null) {
                getpostalcode2.serializer(-1767617372);
                getpostalcode2.IconCompatParcelizer(false);
                companion = companion2;
                getpostalcode = getpostalcode2;
            } else {
                getpostalcode2.serializer(-1767617371);
                TextKt.m131TextNvy7gAk(str, null, ((buildMapping) getpostalcode2.write((getNewPassword) performMeasureDjhGOtQ.RemoteActionCompatParcelizer)).getPopupTheme(), 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, performLayout.RemoteActionCompatParcelizer(), getpostalcode2, 0, 0, 131066);
                getpostalcode = getpostalcode2;
                Modifier.Companion companion4 = companion2;
                IconCompatParcelizer.IconCompatParcelizer(companion4, Dimensions.getNestedScrollAxes, getpostalcode, false);
                companion = companion4;
            }
            FlowLayoutKt.serializer(null, Arrangement.IconCompatParcelizer(Dimensions.getNestedScrollAxes), Arrangement.IconCompatParcelizer(Dimensions.setMenu), null, 0, 0, ExtrasKt.write(-75089443, new SubcomposeAsyncImageKt$$ExternalSyntheticLambda2(23, c0158device), getpostalcode), getpostalcode, 1572864, 57);
            getpostalcode.IconCompatParcelizer(true);
            obj = companion;
        } else {
            getpostalcode = getpostalcode2;
            getpostalcode.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
            int i15 = serializer + 87;
            read = i15 % Fields.SpotShadowColor;
            int i16 = i15 % 2;
            obj = modifier;
        }
        getHandleruiannotations gethandleruiannotationsMediaDescriptionCompat = getpostalcode.MediaDescriptionCompat();
        if (gethandleruiannotationsMediaDescriptionCompat != null) {
            gethandleruiannotationsMediaDescriptionCompat.serializer = new AndroidFontTypefaceLoader(i, 26, c0158device, obj);
        }
    }
}
