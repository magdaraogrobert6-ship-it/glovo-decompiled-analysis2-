package com.roadrunner.delivery.pickupdropoff.tasks.customerunavailable.presentation.compose;

import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.IntrinsicKt;
import androidx.compose.material3.TextKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Fields;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.text.TextStyle;
import bo.app.c8$$ExternalSyntheticOutline0;
import bo.app.m1$$ExternalSyntheticOutline0;
import com.incognia.internal.pcn;
import com.roadrunner.designsystem.compose.theme.tokens.Dimensions;
import com.roadrunner.rrds.compose.component.stepper.TaskStatusIndicatorKt;
import io.sentry.SentryUUID;
import io.sentry.hints.PlaybackStateCompatCustomAction;
import o.AndroidContentCaptureManagerCompanion;
import o.DragAndDropNodestartDragAndDropTransfer1;
import o.DragAndDropTargetModifierNode;
import o.ModalBottomSheetKtModalBottomSheet311;
import o.ModalBottomSheetYbuCTN8;
import o.TextFieldDefaults;
import o.accessgetMediumcp;
import o.buildMapping;
import o.expand;
import o.fieldToDouble;
import o.getAddressCountry;
import o.getBirthDateFull;
import o.getHandleruiannotations;
import o.getNewPassword;
import o.getPostalCode;
import o.performLayout;
import o.performMeasureDjhGOtQ;
import o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0;
import o.r8lambdafvzP3Wky1RLLzE56uVXaMHcvU;
import o.snapElevation;
import o.supportingTextPaddinga9UjIt4material3default;

/* JADX INFO: loaded from: classes3.dex */
public abstract class CustomerUnavailableStepComposableKt {
    private static int IconCompatParcelizer = 0;
    private static int read = 1;

    /* JADX WARN: Code duplicated, block: B:101:0x02a5  */
    /* JADX WARN: Code duplicated, block: B:103:0x02aa  */
    /* JADX WARN: Code duplicated, block: B:106:0x02b6  */
    /* JADX WARN: Code duplicated, block: B:108:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:73:0x00ec  */
    /* JADX WARN: Code duplicated, block: B:74:0x00fe  */
    /* JADX WARN: Code duplicated, block: B:77:0x0107  */
    /* JADX WARN: Code duplicated, block: B:79:0x0112  */
    /* JADX WARN: Code duplicated, block: B:81:0x011c  */
    /* JADX WARN: Code duplicated, block: B:82:0x011f  */
    /* JADX WARN: Code duplicated, block: B:85:0x0151  */
    /* JADX WARN: Code duplicated, block: B:87:0x0161  */
    /* JADX WARN: Code duplicated, block: B:88:0x0165  */
    /* JADX WARN: Code duplicated, block: B:91:0x01b7  */
    /* JADX WARN: Code duplicated, block: B:92:0x01bb  */
    /* JADX WARN: Code duplicated, block: B:95:0x01d0  */
    /* JADX WARN: Code duplicated, block: B:96:0x01e6  */
    /* JADX WARN: Code duplicated, block: B:98:0x024a  */
    /* JADX WARN: Code duplicated, block: B:99:0x0254  */
    public static final void CustomerUnavailableStepComposable(fieldToDouble fieldtodouble, DragAndDropTargetModifierNode dragAndDropTargetModifierNode, Modifier modifier, String str, String str2, Integer num, boolean z, getBirthDateFull getbirthdatefull, int i, int i2) {
        int i3;
        boolean z2;
        int i4;
        boolean z3;
        getPostalCode getpostalcode;
        String str3;
        boolean z4;
        getHandleruiannotations gethandleruiannotationsMediaDescriptionCompat;
        int i5;
        boolean z5;
        Alignment.Companion companion;
        supportingTextPaddinga9UjIt4material3default supportingtextpaddinga9ujit4material3defaultSerializer;
        int iHashCode;
        DragAndDropNodestartDragAndDropTransfer1 dragAndDropNodestartDragAndDropTransfer1Serializer;
        Modifier modifierMaterializeModifier;
        ComposeUiNode.Companion companion2;
        r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 constructor;
        r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 constructor2;
        boolean z6;
        int i6;
        String str4 = str2;
        int i7 = 2 % 2;
        fieldtodouble.getClass();
        getPostalCode getpostalcode2 = (getPostalCode) getbirthdatefull;
        getpostalcode2.MediaSessionCompatQueueItem(535430559);
        getAddressCountry getaddresscountry = getpostalcode2.read;
        if ((i & 6) == 0) {
            i3 = (getpostalcode2.read(fieldtodouble.ordinal()) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= getpostalcode2.IconCompatParcelizer(dragAndDropTargetModifierNode) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            if (getpostalcode2.read(modifier)) {
                int i8 = read + 41;
                IconCompatParcelizer = i8 % Fields.SpotShadowColor;
                i6 = i8 % 2 != 0 ? 5109 : Fields.RotationX;
            } else {
                i6 = Fields.SpotShadowColor;
            }
            i3 |= i6;
        }
        if ((i & 3072) == 0) {
            i3 |= getpostalcode2.read(str) ? Fields.CameraDistance : Fields.RotationZ;
        }
        int i9 = i2 & 16;
        Object obj = null;
        if (i9 != 0) {
            i3 |= 24576;
            int i10 = IconCompatParcelizer + 81;
            read = i10 % Fields.SpotShadowColor;
            int i11 = i10 % 2;
        } else if ((i & 24576) == 0) {
            int i12 = read + 23;
            IconCompatParcelizer = i12 % Fields.SpotShadowColor;
            if (i12 % 2 != 0) {
                getpostalcode2.read(str4);
                throw null;
            }
            i3 |= getpostalcode2.read(str4) ? Fields.Clip : 8192;
        }
        if ((196608 & i) == 0) {
            i3 |= getpostalcode2.read(num) ? Fields.RenderEffect : 65536;
        }
        int i13 = i2 & 64;
        if (i13 == 0) {
            if ((1572864 & i) == 0) {
                z2 = z;
                i3 |= getpostalcode2.write(z2) ? 1048576 : Fields.BlendMode;
            }
            i4 = i3;
            if ((i4 & 599187) != 599186) {
                int i14 = read;
                int i15 = i14 + 65;
                IconCompatParcelizer = i15 % Fields.SpotShadowColor;
                int i16 = i15 % 2;
                int i17 = i14 + 63;
                IconCompatParcelizer = i17 % Fields.SpotShadowColor;
                int i18 = i17 % 2;
                z3 = true;
            } else {
                z3 = false;
            }
            if (getpostalcode2.write(i4 & 1, z3)) {
                int i19 = read + 47;
                i5 = i19 % Fields.SpotShadowColor;
                IconCompatParcelizer = i5;
                int i20 = i19 % 2;
                if (i9 != 0) {
                    int i21 = i5 + 43;
                    read = i21 % Fields.SpotShadowColor;
                    int i22 = i21 % 2;
                    str4 = null;
                }
                if (i13 != 0) {
                    z5 = false;
                } else {
                    z5 = z2;
                }
                Modifier modifierHeight = IntrinsicKt.height(modifier, expand.Max);
                PlaybackStateCompatCustomAction playbackStateCompatCustomAction = Arrangement.MediaBrowserCompatMediaItem;
                snapElevation snapelevationIconCompatParcelizer = Arrangement.IconCompatParcelizer(Dimensions.setMenu);
                companion = Alignment.Companion;
                supportingtextpaddinga9ujit4material3defaultSerializer = TextFieldDefaults.serializer(snapelevationIconCompatParcelizer, companion.getCenterVertically(), getpostalcode2, 48);
                iHashCode = Long.hashCode(getpostalcode2.RatingCompat);
                dragAndDropNodestartDragAndDropTransfer1Serializer = getpostalcode2.serializer();
                modifierMaterializeModifier = ComposedModifierKt.materializeModifier(getpostalcode2, modifierHeight);
                companion2 = ComposeUiNode.Companion;
                constructor = companion2.getConstructor();
                if (getaddresscountry != null) {
                    SentryUUID.write();
                    throw null;
                }
                int i23 = IconCompatParcelizer + 99;
                read = i23 % Fields.SpotShadowColor;
                int i24 = i23 % 2;
                getpostalcode2.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg();
                if (getpostalcode2.ComponentActivity) {
                    getpostalcode2.serializer(constructor);
                } else {
                    getpostalcode2.r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28();
                }
                r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.read(companion2, getpostalcode2, supportingtextpaddinga9ujit4material3defaultSerializer, getpostalcode2, dragAndDropNodestartDragAndDropTransfer1Serializer);
                AndroidContentCaptureManagerCompanion.write(getpostalcode2, modifierMaterializeModifier, m1$$ExternalSyntheticOutline0.m(companion2, getpostalcode2, Integer.valueOf(iHashCode), getpostalcode2));
                TaskStatusIndicatorKt.TaskStatusIndicator(fieldtodouble, null, num, !z5, getpostalcode2, (i4 & 14) | ((i4 >> 9) & 896), 2);
                snapElevation snapelevationIconCompatParcelizer2 = Arrangement.IconCompatParcelizer(Dimensions.getNestedScrollAxes);
                Modifier.Companion companion3 = Modifier.Companion;
                ModalBottomSheetYbuCTN8 modalBottomSheetYbuCTN8Serializer = ModalBottomSheetKtModalBottomSheet311.serializer(snapelevationIconCompatParcelizer2, companion.getStart(), getpostalcode2, 0);
                int iHashCode2 = Long.hashCode(getpostalcode2.RatingCompat);
                DragAndDropNodestartDragAndDropTransfer1 dragAndDropNodestartDragAndDropTransfer1Serializer2 = getpostalcode2.serializer();
                Modifier modifierMaterializeModifier2 = ComposedModifierKt.materializeModifier(getpostalcode2, companion3);
                constructor2 = companion2.getConstructor();
                getpostalcode2.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg();
                if (getpostalcode2.ComponentActivity) {
                    getpostalcode2.serializer(constructor2);
                } else {
                    getpostalcode2.r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28();
                }
                c8$$ExternalSyntheticOutline0.m(companion2, getpostalcode2, modalBottomSheetYbuCTN8Serializer, getpostalcode2, dragAndDropNodestartDragAndDropTransfer1Serializer2);
                AndroidContentCaptureManagerCompanion.write(getpostalcode2, modifierMaterializeModifier2, m1$$ExternalSyntheticOutline0.m(companion2, getpostalcode2, Integer.valueOf(iHashCode2), getpostalcode2));
                if (str == null) {
                    int i25 = read + 27;
                    IconCompatParcelizer = i25 % Fields.SpotShadowColor;
                    int i26 = i25 % 2;
                    getpostalcode2.serializer(-1682878328);
                    getpostalcode2.IconCompatParcelizer(false);
                    z6 = false;
                    getpostalcode = getpostalcode2;
                } else {
                    getpostalcode2.serializer(-1682878327);
                    TextKt.m131TextNvy7gAk(str, null, ((buildMapping) getpostalcode2.write((getNewPassword) performMeasureDjhGOtQ.RemoteActionCompatParcelizer)).setPresenter(), 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, (TextStyle) performLayout.read(925764871, pcn.serializer(), new Object[0], -925764870, pcn.serializer(), pcn.serializer(), pcn.serializer()), getpostalcode2, 0, 0, 131066);
                    getpostalcode = getpostalcode2;
                    z6 = false;
                    getpostalcode.IconCompatParcelizer(false);
                }
                if (str4 == null) {
                    getpostalcode.serializer(-1682662196);
                    getpostalcode.IconCompatParcelizer(z6);
                } else {
                    getpostalcode.serializer(-1682662195);
                    TextKt.m131TextNvy7gAk(str4, null, ((buildMapping) getpostalcode.write((getNewPassword) performMeasureDjhGOtQ.RemoteActionCompatParcelizer)).setPresenter(), 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, performLayout.IconCompatParcelizer(), getpostalcode, 0, 0, 131066);
                    getpostalcode.IconCompatParcelizer(z6);
                }
                dragAndDropTargetModifierNode.invoke(getpostalcode, Integer.valueOf((i4 >> 3) & 14));
                getpostalcode.IconCompatParcelizer(true);
                getpostalcode.IconCompatParcelizer(true);
                str3 = str4;
                z4 = z5;
            } else {
                getpostalcode = getpostalcode2;
                getpostalcode.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
                str3 = str4;
                z4 = z2;
            }
            gethandleruiannotationsMediaDescriptionCompat = getpostalcode.MediaDescriptionCompat();
            if (gethandleruiannotationsMediaDescriptionCompat != null) {
                gethandleruiannotationsMediaDescriptionCompat.serializer = new accessgetMediumcp(fieldtodouble, dragAndDropTargetModifierNode, modifier, str, str3, num, z4, i, i2);
            }
        }
        int i27 = read + 101;
        IconCompatParcelizer = i27 % Fields.SpotShadowColor;
        if (i27 % 2 != 0) {
            obj.hashCode();
            throw null;
        }
        i3 |= 1572864;
        z2 = z;
        i4 = i3;
        if ((i4 & 599187) != 599186) {
            int i110 = read;
            int i111 = i110 + 65;
            IconCompatParcelizer = i111 % Fields.SpotShadowColor;
            int i112 = i111 % 2;
            int i113 = i110 + 63;
            IconCompatParcelizer = i113 % Fields.SpotShadowColor;
            int i114 = i113 % 2;
            z3 = true;
        } else {
            z3 = false;
        }
        if (getpostalcode2.write(i4 & 1, z3)) {
            int i115 = read + 47;
            i5 = i115 % Fields.SpotShadowColor;
            IconCompatParcelizer = i5;
            int i28 = i115 % 2;
            if (i9 != 0) {
                int i29 = i5 + 43;
                read = i29 % Fields.SpotShadowColor;
                int i210 = i29 % 2;
                str4 = null;
            }
            if (i13 != 0) {
                z5 = false;
            } else {
                z5 = z2;
            }
            Modifier modifierHeight2 = IntrinsicKt.height(modifier, expand.Max);
            PlaybackStateCompatCustomAction playbackStateCompatCustomAction2 = Arrangement.MediaBrowserCompatMediaItem;
            snapElevation snapelevationIconCompatParcelizer3 = Arrangement.IconCompatParcelizer(Dimensions.setMenu);
            companion = Alignment.Companion;
            supportingtextpaddinga9ujit4material3defaultSerializer = TextFieldDefaults.serializer(snapelevationIconCompatParcelizer3, companion.getCenterVertically(), getpostalcode2, 48);
            iHashCode = Long.hashCode(getpostalcode2.RatingCompat);
            dragAndDropNodestartDragAndDropTransfer1Serializer = getpostalcode2.serializer();
            modifierMaterializeModifier = ComposedModifierKt.materializeModifier(getpostalcode2, modifierHeight2);
            companion2 = ComposeUiNode.Companion;
            constructor = companion2.getConstructor();
            if (getaddresscountry != null) {
                SentryUUID.write();
                throw null;
            }
            int i211 = IconCompatParcelizer + 99;
            read = i211 % Fields.SpotShadowColor;
            int i212 = i211 % 2;
            getpostalcode2.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg();
            if (getpostalcode2.ComponentActivity) {
                getpostalcode2.serializer(constructor);
            } else {
                getpostalcode2.r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28();
            }
            r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.read(companion2, getpostalcode2, supportingtextpaddinga9ujit4material3defaultSerializer, getpostalcode2, dragAndDropNodestartDragAndDropTransfer1Serializer);
            AndroidContentCaptureManagerCompanion.write(getpostalcode2, modifierMaterializeModifier, m1$$ExternalSyntheticOutline0.m(companion2, getpostalcode2, Integer.valueOf(iHashCode), getpostalcode2));
            TaskStatusIndicatorKt.TaskStatusIndicator(fieldtodouble, null, num, !z5, getpostalcode2, (i4 & 14) | ((i4 >> 9) & 896), 2);
            snapElevation snapelevationIconCompatParcelizer4 = Arrangement.IconCompatParcelizer(Dimensions.getNestedScrollAxes);
            Modifier.Companion companion4 = Modifier.Companion;
            ModalBottomSheetYbuCTN8 modalBottomSheetYbuCTN8Serializer2 = ModalBottomSheetKtModalBottomSheet311.serializer(snapelevationIconCompatParcelizer4, companion.getStart(), getpostalcode2, 0);
            int iHashCode3 = Long.hashCode(getpostalcode2.RatingCompat);
            DragAndDropNodestartDragAndDropTransfer1 dragAndDropNodestartDragAndDropTransfer1Serializer3 = getpostalcode2.serializer();
            Modifier modifierMaterializeModifier3 = ComposedModifierKt.materializeModifier(getpostalcode2, companion4);
            constructor2 = companion2.getConstructor();
            getpostalcode2.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg();
            if (getpostalcode2.ComponentActivity) {
                getpostalcode2.serializer(constructor2);
            } else {
                getpostalcode2.r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28();
            }
            c8$$ExternalSyntheticOutline0.m(companion2, getpostalcode2, modalBottomSheetYbuCTN8Serializer2, getpostalcode2, dragAndDropNodestartDragAndDropTransfer1Serializer3);
            AndroidContentCaptureManagerCompanion.write(getpostalcode2, modifierMaterializeModifier3, m1$$ExternalSyntheticOutline0.m(companion2, getpostalcode2, Integer.valueOf(iHashCode3), getpostalcode2));
            if (str == null) {
                int i213 = read + 27;
                IconCompatParcelizer = i213 % Fields.SpotShadowColor;
                int i214 = i213 % 2;
                getpostalcode2.serializer(-1682878328);
                getpostalcode2.IconCompatParcelizer(false);
                z6 = false;
                getpostalcode = getpostalcode2;
            } else {
                getpostalcode2.serializer(-1682878327);
                TextKt.m131TextNvy7gAk(str, null, ((buildMapping) getpostalcode2.write((getNewPassword) performMeasureDjhGOtQ.RemoteActionCompatParcelizer)).setPresenter(), 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, (TextStyle) performLayout.read(925764871, pcn.serializer(), new Object[0], -925764870, pcn.serializer(), pcn.serializer(), pcn.serializer()), getpostalcode2, 0, 0, 131066);
                getpostalcode = getpostalcode2;
                z6 = false;
                getpostalcode.IconCompatParcelizer(false);
            }
            if (str4 == null) {
                getpostalcode.serializer(-1682662196);
                getpostalcode.IconCompatParcelizer(z6);
            } else {
                getpostalcode.serializer(-1682662195);
                TextKt.m131TextNvy7gAk(str4, null, ((buildMapping) getpostalcode.write((getNewPassword) performMeasureDjhGOtQ.RemoteActionCompatParcelizer)).setPresenter(), 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, performLayout.IconCompatParcelizer(), getpostalcode, 0, 0, 131066);
                getpostalcode.IconCompatParcelizer(z6);
            }
            dragAndDropTargetModifierNode.invoke(getpostalcode, Integer.valueOf((i4 >> 3) & 14));
            getpostalcode.IconCompatParcelizer(true);
            getpostalcode.IconCompatParcelizer(true);
            str3 = str4;
            z4 = z5;
        } else {
            getpostalcode = getpostalcode2;
            getpostalcode.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
            str3 = str4;
            z4 = z2;
        }
        gethandleruiannotationsMediaDescriptionCompat = getpostalcode.MediaDescriptionCompat();
        if (gethandleruiannotationsMediaDescriptionCompat != null) {
            gethandleruiannotationsMediaDescriptionCompat.serializer = new accessgetMediumcp(fieldtodouble, dragAndDropTargetModifierNode, modifier, str, str3, num, z4, i, i2);
        }
    }
}
