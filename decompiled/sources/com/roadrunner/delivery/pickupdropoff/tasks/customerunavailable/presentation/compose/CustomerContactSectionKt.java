package com.roadrunner.delivery.pickupdropoff.tasks.customerunavailable.presentation.compose;

import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.IntrinsicKt;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.material3.TextKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Fields;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.viewinterop.AndroidViewBindingKt$$ExternalSyntheticLambda7;
import bo.app.c8$$ExternalSyntheticOutline0;
import bo.app.m1$$ExternalSyntheticOutline0;
import coil3.ExtrasKt;
import com.incognia.internal.pcn;
import com.roadrunner.designsystem.compose.theme.tokens.Dimensions;
import com.roadrunner.rrds.compose.component.message.SnackbarKt$$ExternalSyntheticLambda2;
import com.roadrunner.rrds.compose.component.stepper.TaskStatusIndicatorKt;
import io.sentry.SentryUUID;
import io.sentry.hints.PlaybackStateCompatCustomAction;
import o.AndroidContentCaptureManagerCompanion;
import o.DragAndDropNodestartDragAndDropTransfer1;
import o.DragAndDropTargetModifierNode;
import o.IconCompatParcelizer;
import o.JoinedKey;
import o.ModalBottomSheetKtModalBottomSheet311;
import o.ModalBottomSheetYbuCTN8;
import o.ParameterInformation;
import o.TextFieldDefaults;
import o.ToolingOverride;
import o.buildMapping;
import o.expand;
import o.fieldToDouble;
import o.getAddressCountry;
import o.getBirthDateFull;
import o.getCompared;
import o.getHandleruiannotations;
import o.getNewPassword;
import o.getPostalCode;
import o.handleUrlOverridelambda1;
import o.logWarningui_toolingdefault;
import o.performLayout;
import o.performMeasureDjhGOtQ;
import o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0;
import o.r8lambdafvzP3Wky1RLLzE56uVXaMHcvU;
import o.r8lambdakX1auGmjk4nKnxFqVYyTYqzkc;
import o.supportingTextPaddinga9UjIt4material3default;

/* JADX INFO: loaded from: classes3.dex */
public abstract class CustomerContactSectionKt {
    private static int RemoteActionCompatParcelizer = 0;
    private static int read = 1;

    /* JADX WARN: Code duplicated, block: B:34:0x0080  */
    /* JADX WARN: Code duplicated, block: B:35:0x008c  */
    /* JADX WARN: Code duplicated, block: B:37:0x0090  */
    /* JADX WARN: Code duplicated, block: B:39:0x0098  */
    /* JADX WARN: Code duplicated, block: B:40:0x009b  */
    /* JADX WARN: Code duplicated, block: B:45:0x00a8  */
    /* JADX WARN: Code duplicated, block: B:46:0x00aa  */
    /* JADX WARN: Code duplicated, block: B:49:0x00b3  */
    /* JADX WARN: Code duplicated, block: B:51:0x00be  */
    /* JADX WARN: Code duplicated, block: B:53:0x00c2  */
    /* JADX WARN: Code duplicated, block: B:55:0x00c5  */
    /* JADX WARN: Code duplicated, block: B:56:0x00c8  */
    /* JADX WARN: Code duplicated, block: B:59:0x00f2  */
    /* JADX WARN: Code duplicated, block: B:61:0x00f9  */
    /* JADX WARN: Code duplicated, block: B:62:0x0106  */
    /* JADX WARN: Code duplicated, block: B:65:0x0119  */
    /* JADX WARN: Code duplicated, block: B:66:0x012b  */
    /* JADX WARN: Code duplicated, block: B:69:0x018a  */
    /* JADX WARN: Code duplicated, block: B:70:0x018e  */
    /* JADX WARN: Code duplicated, block: B:73:0x01a1  */
    /* JADX WARN: Code duplicated, block: B:74:0x01ab  */
    /* JADX WARN: Code duplicated, block: B:76:0x0243  */
    /* JADX WARN: Code duplicated, block: B:78:0x0247  */
    /* JADX WARN: Code duplicated, block: B:80:0x024d  */
    /* JADX WARN: Code duplicated, block: B:83:0x0259  */
    /* JADX WARN: Code duplicated, block: B:85:? A[RETURN, SYNTHETIC] */
    public static final void ContactRow(fieldToDouble fieldtodouble, DragAndDropTargetModifierNode dragAndDropTargetModifierNode, Modifier modifier, Integer num, String str, getBirthDateFull getbirthdatefull, int i, int i2) {
        int i3;
        int i4;
        int i5;
        String str2;
        int i6;
        boolean z;
        Modifier modifier2;
        Integer num2;
        getHandleruiannotations gethandleruiannotationsMediaDescriptionCompat;
        int i7;
        Modifier.Companion companion;
        String str3;
        Alignment.Companion companion2;
        supportingTextPaddinga9UjIt4material3default supportingtextpaddinga9ujit4material3defaultSerializer;
        int iHashCode;
        DragAndDropNodestartDragAndDropTransfer1 dragAndDropNodestartDragAndDropTransfer1Serializer;
        Modifier modifierMaterializeModifier;
        ComposeUiNode.Companion companion3;
        r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 constructor;
        Modifier modifierM74paddingqDBjuR0$default;
        r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 constructor2;
        int i8;
        Integer num3 = num;
        int i9 = 2 % 2;
        fieldtodouble.getClass();
        getPostalCode getpostalcode = (getPostalCode) getbirthdatefull;
        getpostalcode.MediaSessionCompatQueueItem(-1542223595);
        getAddressCountry getaddresscountry = getpostalcode.read;
        if ((i & 6) == 0) {
            if (getpostalcode.read(fieldtodouble.ordinal())) {
                int i10 = RemoteActionCompatParcelizer + 9;
                read = i10 % Fields.SpotShadowColor;
                int i11 = i10 % 2;
                i8 = 4;
            } else {
                i8 = 2;
            }
            i3 = i8 | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= getpostalcode.IconCompatParcelizer(dragAndDropTargetModifierNode) ? 32 : 16;
        }
        int i12 = i3 | 384;
        int i13 = i2 & 8;
        Object obj = null;
        if (i13 == 0) {
            if ((i & 3072) == 0) {
                int i14 = RemoteActionCompatParcelizer + 119;
                read = i14 % Fields.SpotShadowColor;
                if (i14 % 2 == 0) {
                    getpostalcode.read(num3);
                    obj.hashCode();
                    throw null;
                }
                i4 = (getpostalcode.read(num3) ? Fields.CameraDistance : Fields.RotationZ) | i12;
            }
            i5 = i2 & 16;
            if (i5 != 0) {
                if ((i & 24576) == 0) {
                    str2 = str;
                    if (getpostalcode.read(str2)) {
                        i6 = Fields.Clip;
                    } else {
                        i6 = 8192;
                    }
                    i4 |= i6;
                }
                if ((i4 & 9363) != 9362) {
                    z = true;
                } else {
                    z = false;
                }
                if (getpostalcode.write(i4 & 1, z)) {
                    i7 = RemoteActionCompatParcelizer + 33;
                    read = i7 % Fields.SpotShadowColor;
                    if (i7 % 2 != 0) {
                        Modifier.Companion companion4 = Modifier.Companion;
                        obj.hashCode();
                        throw null;
                    }
                    companion = Modifier.Companion;
                    if (i13 != 0) {
                        num3 = null;
                    }
                    if (i5 != 0) {
                        str3 = null;
                    } else {
                        str3 = str2;
                    }
                    Modifier modifierHeight = IntrinsicKt.height(companion, expand.Max);
                    PlaybackStateCompatCustomAction playbackStateCompatCustomAction = Arrangement.MediaBrowserCompatMediaItem;
                    companion2 = Alignment.Companion;
                    supportingtextpaddinga9ujit4material3defaultSerializer = TextFieldDefaults.serializer(playbackStateCompatCustomAction, companion2.getTop(), getpostalcode, 0);
                    iHashCode = Long.hashCode(getpostalcode.RatingCompat);
                    dragAndDropNodestartDragAndDropTransfer1Serializer = getpostalcode.serializer();
                    modifierMaterializeModifier = ComposedModifierKt.materializeModifier(getpostalcode, modifierHeight);
                    companion3 = ComposeUiNode.Companion;
                    constructor = companion3.getConstructor();
                    if (getaddresscountry != null) {
                        SentryUUID.write();
                        throw null;
                    }
                    getpostalcode.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg();
                    if (getpostalcode.ComponentActivity) {
                        getpostalcode.serializer(constructor);
                        int i15 = read + 121;
                        RemoteActionCompatParcelizer = i15 % Fields.SpotShadowColor;
                        int i16 = i15 % 2;
                    } else {
                        getpostalcode.r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28();
                    }
                    r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.read(companion3, getpostalcode, supportingtextpaddinga9ujit4material3defaultSerializer, getpostalcode, dragAndDropNodestartDragAndDropTransfer1Serializer);
                    AndroidContentCaptureManagerCompanion.write(getpostalcode, modifierMaterializeModifier, m1$$ExternalSyntheticOutline0.m(companion3, getpostalcode, Integer.valueOf(iHashCode), getpostalcode));
                    if (str3 == null) {
                        modifierM74paddingqDBjuR0$default = PaddingKt.m74paddingqDBjuR0$default(companion, 0.0f, Dimensions.setStackedBackground, 0.0f, 0.0f, 13);
                    } else {
                        modifierM74paddingqDBjuR0$default = companion;
                    }
                    int i17 = i4 >> 3;
                    modifier2 = companion;
                    TaskStatusIndicatorKt.TaskStatusIndicator(fieldtodouble, modifierM74paddingqDBjuR0$default, num3, false, getpostalcode, (i4 & 14) | (i17 & 896), 8);
                    ExtrasKt.read(913837329, handleUrlOverridelambda1.RemoteActionCompatParcelizer(), handleUrlOverridelambda1.RemoteActionCompatParcelizer(), -913837326, handleUrlOverridelambda1.RemoteActionCompatParcelizer(), handleUrlOverridelambda1.RemoteActionCompatParcelizer(), new Object[]{getpostalcode, SizeKt.m86width3ABfNKs(modifier2, Dimensions.setStackedBackground)});
                    ModalBottomSheetYbuCTN8 modalBottomSheetYbuCTN8Serializer = ModalBottomSheetKtModalBottomSheet311.serializer(Arrangement.MediaDescriptionCompat, companion2.getStart(), getpostalcode, 0);
                    int iHashCode2 = Long.hashCode(getpostalcode.RatingCompat);
                    DragAndDropNodestartDragAndDropTransfer1 dragAndDropNodestartDragAndDropTransfer1Serializer2 = getpostalcode.serializer();
                    Modifier modifierMaterializeModifier2 = ComposedModifierKt.materializeModifier(getpostalcode, modifier2);
                    constructor2 = companion3.getConstructor();
                    getpostalcode.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg();
                    if (getpostalcode.ComponentActivity) {
                        getpostalcode.serializer(constructor2);
                    } else {
                        getpostalcode.r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28();
                    }
                    c8$$ExternalSyntheticOutline0.m(companion3, getpostalcode, modalBottomSheetYbuCTN8Serializer, getpostalcode, dragAndDropNodestartDragAndDropTransfer1Serializer2);
                    AndroidContentCaptureManagerCompanion.write(getpostalcode, modifierMaterializeModifier2, m1$$ExternalSyntheticOutline0.m(companion3, getpostalcode, Integer.valueOf(iHashCode2), getpostalcode));
                    if (str3 == null) {
                        getpostalcode.serializer(613649606);
                        getpostalcode.IconCompatParcelizer(false);
                    } else {
                        getpostalcode.serializer(613649607);
                        TextKt.m131TextNvy7gAk(str3, null, ((buildMapping) getpostalcode.write((getNewPassword) performMeasureDjhGOtQ.RemoteActionCompatParcelizer)).setPresenter(), 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, (TextStyle) performLayout.read(925764871, pcn.serializer(), new Object[0], -925764870, pcn.serializer(), pcn.serializer(), pcn.serializer()), getpostalcode, 0, 0, 131066);
                        getpostalcode.IconCompatParcelizer(false);
                    }
                    dragAndDropTargetModifierNode.invoke(getpostalcode, Integer.valueOf(i17 & 14));
                    ExtrasKt.read(913837329, handleUrlOverridelambda1.RemoteActionCompatParcelizer(), handleUrlOverridelambda1.RemoteActionCompatParcelizer(), -913837326, handleUrlOverridelambda1.RemoteActionCompatParcelizer(), handleUrlOverridelambda1.RemoteActionCompatParcelizer(), new Object[]{getpostalcode, SizeKt.m75height3ABfNKs(modifier2, Dimensions.setVisibility)});
                    getpostalcode.IconCompatParcelizer(true);
                    getpostalcode.IconCompatParcelizer(true);
                    num2 = num3;
                    str2 = str3;
                } else {
                    getpostalcode.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
                    modifier2 = modifier;
                    num2 = num3;
                }
                gethandleruiannotationsMediaDescriptionCompat = getpostalcode.MediaDescriptionCompat();
                if (gethandleruiannotationsMediaDescriptionCompat != null) {
                    gethandleruiannotationsMediaDescriptionCompat.serializer = new AndroidViewBindingKt$$ExternalSyntheticLambda7(fieldtodouble, dragAndDropTargetModifierNode, modifier2, num2, str2, i, i2);
                }
            }
            int i18 = RemoteActionCompatParcelizer + 71;
            read = i18 % Fields.SpotShadowColor;
            int i19 = i18 % 2;
            i4 |= 24576;
            str2 = str;
            if ((i4 & 9363) != 9362) {
                z = true;
            } else {
                z = false;
            }
            if (getpostalcode.write(i4 & 1, z)) {
                i7 = RemoteActionCompatParcelizer + 33;
                read = i7 % Fields.SpotShadowColor;
                if (i7 % 2 != 0) {
                    Modifier.Companion companion5 = Modifier.Companion;
                    obj.hashCode();
                    throw null;
                }
                companion = Modifier.Companion;
                if (i13 != 0) {
                    num3 = null;
                }
                if (i5 != 0) {
                    str3 = null;
                } else {
                    str3 = str2;
                }
                Modifier modifierHeight2 = IntrinsicKt.height(companion, expand.Max);
                PlaybackStateCompatCustomAction playbackStateCompatCustomAction2 = Arrangement.MediaBrowserCompatMediaItem;
                companion2 = Alignment.Companion;
                supportingtextpaddinga9ujit4material3defaultSerializer = TextFieldDefaults.serializer(playbackStateCompatCustomAction2, companion2.getTop(), getpostalcode, 0);
                iHashCode = Long.hashCode(getpostalcode.RatingCompat);
                dragAndDropNodestartDragAndDropTransfer1Serializer = getpostalcode.serializer();
                modifierMaterializeModifier = ComposedModifierKt.materializeModifier(getpostalcode, modifierHeight2);
                companion3 = ComposeUiNode.Companion;
                constructor = companion3.getConstructor();
                if (getaddresscountry != null) {
                    SentryUUID.write();
                    throw null;
                }
                getpostalcode.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg();
                if (getpostalcode.ComponentActivity) {
                    getpostalcode.serializer(constructor);
                    int i110 = read + 121;
                    RemoteActionCompatParcelizer = i110 % Fields.SpotShadowColor;
                    int i111 = i110 % 2;
                } else {
                    getpostalcode.r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28();
                }
                r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.read(companion3, getpostalcode, supportingtextpaddinga9ujit4material3defaultSerializer, getpostalcode, dragAndDropNodestartDragAndDropTransfer1Serializer);
                AndroidContentCaptureManagerCompanion.write(getpostalcode, modifierMaterializeModifier, m1$$ExternalSyntheticOutline0.m(companion3, getpostalcode, Integer.valueOf(iHashCode), getpostalcode));
                if (str3 == null) {
                    modifierM74paddingqDBjuR0$default = PaddingKt.m74paddingqDBjuR0$default(companion, 0.0f, Dimensions.setStackedBackground, 0.0f, 0.0f, 13);
                } else {
                    modifierM74paddingqDBjuR0$default = companion;
                }
                int i112 = i4 >> 3;
                modifier2 = companion;
                TaskStatusIndicatorKt.TaskStatusIndicator(fieldtodouble, modifierM74paddingqDBjuR0$default, num3, false, getpostalcode, (i4 & 14) | (i112 & 896), 8);
                ExtrasKt.read(913837329, handleUrlOverridelambda1.RemoteActionCompatParcelizer(), handleUrlOverridelambda1.RemoteActionCompatParcelizer(), -913837326, handleUrlOverridelambda1.RemoteActionCompatParcelizer(), handleUrlOverridelambda1.RemoteActionCompatParcelizer(), new Object[]{getpostalcode, SizeKt.m86width3ABfNKs(modifier2, Dimensions.setStackedBackground)});
                ModalBottomSheetYbuCTN8 modalBottomSheetYbuCTN8Serializer2 = ModalBottomSheetKtModalBottomSheet311.serializer(Arrangement.MediaDescriptionCompat, companion2.getStart(), getpostalcode, 0);
                int iHashCode3 = Long.hashCode(getpostalcode.RatingCompat);
                DragAndDropNodestartDragAndDropTransfer1 dragAndDropNodestartDragAndDropTransfer1Serializer3 = getpostalcode.serializer();
                Modifier modifierMaterializeModifier3 = ComposedModifierKt.materializeModifier(getpostalcode, modifier2);
                constructor2 = companion3.getConstructor();
                getpostalcode.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg();
                if (getpostalcode.ComponentActivity) {
                    getpostalcode.serializer(constructor2);
                } else {
                    getpostalcode.r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28();
                }
                c8$$ExternalSyntheticOutline0.m(companion3, getpostalcode, modalBottomSheetYbuCTN8Serializer2, getpostalcode, dragAndDropNodestartDragAndDropTransfer1Serializer3);
                AndroidContentCaptureManagerCompanion.write(getpostalcode, modifierMaterializeModifier3, m1$$ExternalSyntheticOutline0.m(companion3, getpostalcode, Integer.valueOf(iHashCode3), getpostalcode));
                if (str3 == null) {
                    getpostalcode.serializer(613649606);
                    getpostalcode.IconCompatParcelizer(false);
                } else {
                    getpostalcode.serializer(613649607);
                    TextKt.m131TextNvy7gAk(str3, null, ((buildMapping) getpostalcode.write((getNewPassword) performMeasureDjhGOtQ.RemoteActionCompatParcelizer)).setPresenter(), 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, (TextStyle) performLayout.read(925764871, pcn.serializer(), new Object[0], -925764870, pcn.serializer(), pcn.serializer(), pcn.serializer()), getpostalcode, 0, 0, 131066);
                    getpostalcode.IconCompatParcelizer(false);
                }
                dragAndDropTargetModifierNode.invoke(getpostalcode, Integer.valueOf(i112 & 14));
                ExtrasKt.read(913837329, handleUrlOverridelambda1.RemoteActionCompatParcelizer(), handleUrlOverridelambda1.RemoteActionCompatParcelizer(), -913837326, handleUrlOverridelambda1.RemoteActionCompatParcelizer(), handleUrlOverridelambda1.RemoteActionCompatParcelizer(), new Object[]{getpostalcode, SizeKt.m75height3ABfNKs(modifier2, Dimensions.setVisibility)});
                getpostalcode.IconCompatParcelizer(true);
                getpostalcode.IconCompatParcelizer(true);
                num2 = num3;
                str2 = str3;
            } else {
                getpostalcode.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
                modifier2 = modifier;
                num2 = num3;
            }
            gethandleruiannotationsMediaDescriptionCompat = getpostalcode.MediaDescriptionCompat();
            if (gethandleruiannotationsMediaDescriptionCompat != null) {
                gethandleruiannotationsMediaDescriptionCompat.serializer = new AndroidViewBindingKt$$ExternalSyntheticLambda7(fieldtodouble, dragAndDropTargetModifierNode, modifier2, num2, str2, i, i2);
            }
        }
        int i20 = read + 33;
        RemoteActionCompatParcelizer = i20 % Fields.SpotShadowColor;
        int i21 = i20 % 2;
        i12 = i3 | 3456;
        i4 = i12;
        i5 = i2 & 16;
        if (i5 != 0) {
            if ((i & 24576) == 0) {
                str2 = str;
                if (getpostalcode.read(str2)) {
                    i6 = Fields.Clip;
                } else {
                    i6 = 8192;
                }
                i4 |= i6;
            }
            if ((i4 & 9363) != 9362) {
                z = true;
            } else {
                z = false;
            }
            if (getpostalcode.write(i4 & 1, z)) {
                i7 = RemoteActionCompatParcelizer + 33;
                read = i7 % Fields.SpotShadowColor;
                if (i7 % 2 != 0) {
                    Modifier.Companion companion6 = Modifier.Companion;
                    obj.hashCode();
                    throw null;
                }
                companion = Modifier.Companion;
                if (i13 != 0) {
                    num3 = null;
                }
                if (i5 != 0) {
                    str3 = null;
                } else {
                    str3 = str2;
                }
                Modifier modifierHeight3 = IntrinsicKt.height(companion, expand.Max);
                PlaybackStateCompatCustomAction playbackStateCompatCustomAction3 = Arrangement.MediaBrowserCompatMediaItem;
                companion2 = Alignment.Companion;
                supportingtextpaddinga9ujit4material3defaultSerializer = TextFieldDefaults.serializer(playbackStateCompatCustomAction3, companion2.getTop(), getpostalcode, 0);
                iHashCode = Long.hashCode(getpostalcode.RatingCompat);
                dragAndDropNodestartDragAndDropTransfer1Serializer = getpostalcode.serializer();
                modifierMaterializeModifier = ComposedModifierKt.materializeModifier(getpostalcode, modifierHeight3);
                companion3 = ComposeUiNode.Companion;
                constructor = companion3.getConstructor();
                if (getaddresscountry != null) {
                    SentryUUID.write();
                    throw null;
                }
                getpostalcode.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg();
                if (getpostalcode.ComponentActivity) {
                    getpostalcode.serializer(constructor);
                    int i113 = read + 121;
                    RemoteActionCompatParcelizer = i113 % Fields.SpotShadowColor;
                    int i114 = i113 % 2;
                } else {
                    getpostalcode.r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28();
                }
                r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.read(companion3, getpostalcode, supportingtextpaddinga9ujit4material3defaultSerializer, getpostalcode, dragAndDropNodestartDragAndDropTransfer1Serializer);
                AndroidContentCaptureManagerCompanion.write(getpostalcode, modifierMaterializeModifier, m1$$ExternalSyntheticOutline0.m(companion3, getpostalcode, Integer.valueOf(iHashCode), getpostalcode));
                if (str3 == null) {
                    modifierM74paddingqDBjuR0$default = PaddingKt.m74paddingqDBjuR0$default(companion, 0.0f, Dimensions.setStackedBackground, 0.0f, 0.0f, 13);
                } else {
                    modifierM74paddingqDBjuR0$default = companion;
                }
                int i115 = i4 >> 3;
                modifier2 = companion;
                TaskStatusIndicatorKt.TaskStatusIndicator(fieldtodouble, modifierM74paddingqDBjuR0$default, num3, false, getpostalcode, (i4 & 14) | (i115 & 896), 8);
                ExtrasKt.read(913837329, handleUrlOverridelambda1.RemoteActionCompatParcelizer(), handleUrlOverridelambda1.RemoteActionCompatParcelizer(), -913837326, handleUrlOverridelambda1.RemoteActionCompatParcelizer(), handleUrlOverridelambda1.RemoteActionCompatParcelizer(), new Object[]{getpostalcode, SizeKt.m86width3ABfNKs(modifier2, Dimensions.setStackedBackground)});
                ModalBottomSheetYbuCTN8 modalBottomSheetYbuCTN8Serializer3 = ModalBottomSheetKtModalBottomSheet311.serializer(Arrangement.MediaDescriptionCompat, companion2.getStart(), getpostalcode, 0);
                int iHashCode4 = Long.hashCode(getpostalcode.RatingCompat);
                DragAndDropNodestartDragAndDropTransfer1 dragAndDropNodestartDragAndDropTransfer1Serializer4 = getpostalcode.serializer();
                Modifier modifierMaterializeModifier4 = ComposedModifierKt.materializeModifier(getpostalcode, modifier2);
                constructor2 = companion3.getConstructor();
                getpostalcode.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg();
                if (getpostalcode.ComponentActivity) {
                    getpostalcode.serializer(constructor2);
                } else {
                    getpostalcode.r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28();
                }
                c8$$ExternalSyntheticOutline0.m(companion3, getpostalcode, modalBottomSheetYbuCTN8Serializer3, getpostalcode, dragAndDropNodestartDragAndDropTransfer1Serializer4);
                AndroidContentCaptureManagerCompanion.write(getpostalcode, modifierMaterializeModifier4, m1$$ExternalSyntheticOutline0.m(companion3, getpostalcode, Integer.valueOf(iHashCode4), getpostalcode));
                if (str3 == null) {
                    getpostalcode.serializer(613649606);
                    getpostalcode.IconCompatParcelizer(false);
                } else {
                    getpostalcode.serializer(613649607);
                    TextKt.m131TextNvy7gAk(str3, null, ((buildMapping) getpostalcode.write((getNewPassword) performMeasureDjhGOtQ.RemoteActionCompatParcelizer)).setPresenter(), 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, (TextStyle) performLayout.read(925764871, pcn.serializer(), new Object[0], -925764870, pcn.serializer(), pcn.serializer(), pcn.serializer()), getpostalcode, 0, 0, 131066);
                    getpostalcode.IconCompatParcelizer(false);
                }
                dragAndDropTargetModifierNode.invoke(getpostalcode, Integer.valueOf(i115 & 14));
                ExtrasKt.read(913837329, handleUrlOverridelambda1.RemoteActionCompatParcelizer(), handleUrlOverridelambda1.RemoteActionCompatParcelizer(), -913837326, handleUrlOverridelambda1.RemoteActionCompatParcelizer(), handleUrlOverridelambda1.RemoteActionCompatParcelizer(), new Object[]{getpostalcode, SizeKt.m75height3ABfNKs(modifier2, Dimensions.setVisibility)});
                getpostalcode.IconCompatParcelizer(true);
                getpostalcode.IconCompatParcelizer(true);
                num2 = num3;
                str2 = str3;
            } else {
                getpostalcode.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
                modifier2 = modifier;
                num2 = num3;
            }
            gethandleruiannotationsMediaDescriptionCompat = getpostalcode.MediaDescriptionCompat();
            if (gethandleruiannotationsMediaDescriptionCompat != null) {
                gethandleruiannotationsMediaDescriptionCompat.serializer = new AndroidViewBindingKt$$ExternalSyntheticLambda7(fieldtodouble, dragAndDropTargetModifierNode, modifier2, num2, str2, i, i2);
            }
        }
        int i116 = RemoteActionCompatParcelizer + 71;
        read = i116 % Fields.SpotShadowColor;
        int i117 = i116 % 2;
        i4 |= 24576;
        str2 = str;
        if ((i4 & 9363) != 9362) {
            z = true;
        } else {
            z = false;
        }
        if (getpostalcode.write(i4 & 1, z)) {
            i7 = RemoteActionCompatParcelizer + 33;
            read = i7 % Fields.SpotShadowColor;
            if (i7 % 2 != 0) {
                Modifier.Companion companion7 = Modifier.Companion;
                obj.hashCode();
                throw null;
            }
            companion = Modifier.Companion;
            if (i13 != 0) {
                num3 = null;
            }
            if (i5 != 0) {
                str3 = null;
            } else {
                str3 = str2;
            }
            Modifier modifierHeight4 = IntrinsicKt.height(companion, expand.Max);
            PlaybackStateCompatCustomAction playbackStateCompatCustomAction4 = Arrangement.MediaBrowserCompatMediaItem;
            companion2 = Alignment.Companion;
            supportingtextpaddinga9ujit4material3defaultSerializer = TextFieldDefaults.serializer(playbackStateCompatCustomAction4, companion2.getTop(), getpostalcode, 0);
            iHashCode = Long.hashCode(getpostalcode.RatingCompat);
            dragAndDropNodestartDragAndDropTransfer1Serializer = getpostalcode.serializer();
            modifierMaterializeModifier = ComposedModifierKt.materializeModifier(getpostalcode, modifierHeight4);
            companion3 = ComposeUiNode.Companion;
            constructor = companion3.getConstructor();
            if (getaddresscountry != null) {
                SentryUUID.write();
                throw null;
            }
            getpostalcode.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg();
            if (getpostalcode.ComponentActivity) {
                getpostalcode.serializer(constructor);
                int i118 = read + 121;
                RemoteActionCompatParcelizer = i118 % Fields.SpotShadowColor;
                int i119 = i118 % 2;
            } else {
                getpostalcode.r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28();
            }
            r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.read(companion3, getpostalcode, supportingtextpaddinga9ujit4material3defaultSerializer, getpostalcode, dragAndDropNodestartDragAndDropTransfer1Serializer);
            AndroidContentCaptureManagerCompanion.write(getpostalcode, modifierMaterializeModifier, m1$$ExternalSyntheticOutline0.m(companion3, getpostalcode, Integer.valueOf(iHashCode), getpostalcode));
            if (str3 == null) {
                modifierM74paddingqDBjuR0$default = PaddingKt.m74paddingqDBjuR0$default(companion, 0.0f, Dimensions.setStackedBackground, 0.0f, 0.0f, 13);
            } else {
                modifierM74paddingqDBjuR0$default = companion;
            }
            int i1110 = i4 >> 3;
            modifier2 = companion;
            TaskStatusIndicatorKt.TaskStatusIndicator(fieldtodouble, modifierM74paddingqDBjuR0$default, num3, false, getpostalcode, (i4 & 14) | (i1110 & 896), 8);
            ExtrasKt.read(913837329, handleUrlOverridelambda1.RemoteActionCompatParcelizer(), handleUrlOverridelambda1.RemoteActionCompatParcelizer(), -913837326, handleUrlOverridelambda1.RemoteActionCompatParcelizer(), handleUrlOverridelambda1.RemoteActionCompatParcelizer(), new Object[]{getpostalcode, SizeKt.m86width3ABfNKs(modifier2, Dimensions.setStackedBackground)});
            ModalBottomSheetYbuCTN8 modalBottomSheetYbuCTN8Serializer4 = ModalBottomSheetKtModalBottomSheet311.serializer(Arrangement.MediaDescriptionCompat, companion2.getStart(), getpostalcode, 0);
            int iHashCode5 = Long.hashCode(getpostalcode.RatingCompat);
            DragAndDropNodestartDragAndDropTransfer1 dragAndDropNodestartDragAndDropTransfer1Serializer5 = getpostalcode.serializer();
            Modifier modifierMaterializeModifier5 = ComposedModifierKt.materializeModifier(getpostalcode, modifier2);
            constructor2 = companion3.getConstructor();
            getpostalcode.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg();
            if (getpostalcode.ComponentActivity) {
                getpostalcode.serializer(constructor2);
            } else {
                getpostalcode.r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28();
            }
            c8$$ExternalSyntheticOutline0.m(companion3, getpostalcode, modalBottomSheetYbuCTN8Serializer4, getpostalcode, dragAndDropNodestartDragAndDropTransfer1Serializer5);
            AndroidContentCaptureManagerCompanion.write(getpostalcode, modifierMaterializeModifier5, m1$$ExternalSyntheticOutline0.m(companion3, getpostalcode, Integer.valueOf(iHashCode5), getpostalcode));
            if (str3 == null) {
                getpostalcode.serializer(613649606);
                getpostalcode.IconCompatParcelizer(false);
            } else {
                getpostalcode.serializer(613649607);
                TextKt.m131TextNvy7gAk(str3, null, ((buildMapping) getpostalcode.write((getNewPassword) performMeasureDjhGOtQ.RemoteActionCompatParcelizer)).setPresenter(), 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, (TextStyle) performLayout.read(925764871, pcn.serializer(), new Object[0], -925764870, pcn.serializer(), pcn.serializer(), pcn.serializer()), getpostalcode, 0, 0, 131066);
                getpostalcode.IconCompatParcelizer(false);
            }
            dragAndDropTargetModifierNode.invoke(getpostalcode, Integer.valueOf(i1110 & 14));
            ExtrasKt.read(913837329, handleUrlOverridelambda1.RemoteActionCompatParcelizer(), handleUrlOverridelambda1.RemoteActionCompatParcelizer(), -913837326, handleUrlOverridelambda1.RemoteActionCompatParcelizer(), handleUrlOverridelambda1.RemoteActionCompatParcelizer(), new Object[]{getpostalcode, SizeKt.m75height3ABfNKs(modifier2, Dimensions.setVisibility)});
            getpostalcode.IconCompatParcelizer(true);
            getpostalcode.IconCompatParcelizer(true);
            num2 = num3;
            str2 = str3;
        } else {
            getpostalcode.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
            modifier2 = modifier;
            num2 = num3;
        }
        gethandleruiannotationsMediaDescriptionCompat = getpostalcode.MediaDescriptionCompat();
        if (gethandleruiannotationsMediaDescriptionCompat != null) {
            gethandleruiannotationsMediaDescriptionCompat.serializer = new AndroidViewBindingKt$$ExternalSyntheticLambda7(fieldtodouble, dragAndDropTargetModifierNode, modifier2, num2, str2, i, i2);
        }
    }

    /* JADX WARN: Code duplicated, block: B:82:0x0122  */
    public static final void CustomerContactSection(r8lambdakX1auGmjk4nKnxFqVYyTYqzkc r8lambdakx1augmjk4nknxfqvyytyqzkc, boolean z, boolean z2, r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k0, r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k1, r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k2, int i, Modifier modifier, getBirthDateFull getbirthdatefull, int i2) {
        int i3;
        Modifier modifier2;
        boolean z3;
        boolean z4;
        boolean z5;
        fieldToDouble fieldtodouble;
        int i4;
        int i5;
        int i6 = 2 % 2;
        r8lambdakx1augmjk4nknxfqvyytyqzkc.getClass();
        r8lambdardpfsr94j4iebcwx_kpqzpm8k0.getClass();
        r8lambdardpfsr94j4iebcwx_kpqzpm8k1.getClass();
        r8lambdardpfsr94j4iebcwx_kpqzpm8k2.getClass();
        getPostalCode getpostalcode = (getPostalCode) getbirthdatefull;
        getpostalcode.MediaSessionCompatQueueItem(1244121309);
        if ((i2 & 6) == 0) {
            if ((i2 & 8) == 0 ? getpostalcode.read(r8lambdakx1augmjk4nknxfqvyytyqzkc) : getpostalcode.IconCompatParcelizer(r8lambdakx1augmjk4nknxfqvyytyqzkc)) {
                int i7 = read + 121;
                RemoteActionCompatParcelizer = i7 % Fields.SpotShadowColor;
                int i8 = i7 % 2;
                i5 = 4;
            } else {
                i5 = 2;
            }
            i3 = i5 | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= getpostalcode.write(z) ? 32 : 16;
        }
        Object obj = null;
        if ((i2 & 384) == 0) {
            int i9 = read + 15;
            RemoteActionCompatParcelizer = i9 % Fields.SpotShadowColor;
            if (i9 % 2 != 0) {
                getpostalcode.write(z2);
                obj.hashCode();
                throw null;
            }
            i3 |= getpostalcode.write(z2) ? Fields.RotationX : Fields.SpotShadowColor;
        }
        if ((i2 & 3072) == 0) {
            i3 |= getpostalcode.IconCompatParcelizer(r8lambdardpfsr94j4iebcwx_kpqzpm8k0) ? Fields.CameraDistance : Fields.RotationZ;
            int i10 = RemoteActionCompatParcelizer + 39;
            read = i10 % Fields.SpotShadowColor;
            int i11 = i10 % 2;
        }
        if ((i2 & 24576) == 0) {
            int i12 = read + 83;
            RemoteActionCompatParcelizer = i12 % Fields.SpotShadowColor;
            if (i12 % 2 != 0) {
                getpostalcode.IconCompatParcelizer(r8lambdardpfsr94j4iebcwx_kpqzpm8k1);
                throw null;
            }
            i3 |= getpostalcode.IconCompatParcelizer(r8lambdardpfsr94j4iebcwx_kpqzpm8k1) ? Fields.Clip : 8192;
        }
        if ((196608 & i2) == 0) {
            i3 |= getpostalcode.IconCompatParcelizer(r8lambdardpfsr94j4iebcwx_kpqzpm8k2) ? Fields.RenderEffect : 65536;
        }
        if ((1572864 & i2) == 0) {
            if (getpostalcode.read(i)) {
                int i13 = read + 19;
                RemoteActionCompatParcelizer = i13 % Fields.SpotShadowColor;
                if (i13 % 2 != 0) {
                    obj.hashCode();
                    throw null;
                }
                i4 = 1048576;
            } else {
                i4 = Fields.BlendMode;
            }
            i3 |= i4;
        }
        int i14 = i3 | 12582912;
        if (getpostalcode.write(i14 & 1, (4793491 & i14) != 4793490)) {
            int i15 = read + 75;
            RemoteActionCompatParcelizer = i15 % Fields.SpotShadowColor;
            if (i15 % 2 != 0) {
                Modifier.Companion companion = Modifier.Companion;
                throw null;
            }
            Modifier.Companion companion2 = Modifier.Companion;
            if (z && z2) {
                int i16 = read + 83;
                RemoteActionCompatParcelizer = i16 % Fields.SpotShadowColor;
                if (i16 % 2 != 0) {
                    z3 = false;
                } else {
                    z3 = true;
                }
            } else {
                z3 = false;
            }
            ModalBottomSheetYbuCTN8 modalBottomSheetYbuCTN8Serializer = ModalBottomSheetKtModalBottomSheet311.serializer(Arrangement.MediaDescriptionCompat, Alignment.Companion.getStart(), getpostalcode, 0);
            int iHashCode = Long.hashCode(getpostalcode.RatingCompat);
            DragAndDropNodestartDragAndDropTransfer1 dragAndDropNodestartDragAndDropTransfer1Serializer = getpostalcode.serializer();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(getpostalcode, companion2);
            ComposeUiNode.Companion companion3 = ComposeUiNode.Companion;
            r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 constructor = companion3.getConstructor();
            if (getpostalcode.read == null) {
                SentryUUID.write();
                throw null;
            }
            int i17 = read + 87;
            RemoteActionCompatParcelizer = i17 % Fields.SpotShadowColor;
            int i18 = i17 % 2;
            getpostalcode.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg();
            if (getpostalcode.ComponentActivity) {
                getpostalcode.serializer(constructor);
            } else {
                getpostalcode.r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28();
            }
            c8$$ExternalSyntheticOutline0.m(companion3, getpostalcode, modalBottomSheetYbuCTN8Serializer, getpostalcode, dragAndDropNodestartDragAndDropTransfer1Serializer);
            AndroidContentCaptureManagerCompanion.write(getpostalcode, modifierMaterializeModifier, m1$$ExternalSyntheticOutline0.m(companion3, getpostalcode, Integer.valueOf(iHashCode), getpostalcode));
            ContactRow(z3 ? fieldToDouble.Complete : fieldToDouble.Active, ToolingOverride.RemoteActionCompatParcelizer, null, Integer.valueOf(i), r8lambdakx1augmjk4nknxfqvyytyqzkc.customerTitle, getpostalcode, ((i14 >> 9) & 7168) | 48, 4);
            JoinedKey joinedKey = r8lambdakx1augmjk4nknxfqvyytyqzkc.customerChat;
            if (joinedKey == null) {
                getpostalcode.serializer(-1788601597);
                z4 = false;
                getpostalcode.IconCompatParcelizer(false);
            } else {
                getpostalcode.serializer(-1788601596);
                ExtrasKt.read(913837329, handleUrlOverridelambda1.RemoteActionCompatParcelizer(), handleUrlOverridelambda1.RemoteActionCompatParcelizer(), -913837326, handleUrlOverridelambda1.RemoteActionCompatParcelizer(), handleUrlOverridelambda1.RemoteActionCompatParcelizer(), new Object[]{getpostalcode, SizeKt.m75height3ABfNKs(companion2, Dimensions.setSplitBackground)});
                ContactRow(z ^ true ? fieldToDouble.Active : fieldToDouble.Complete, ExtrasKt.write(1792191986, new SnackbarKt$$ExternalSyntheticLambda2(joinedKey, 3, r8lambdardpfsr94j4iebcwx_kpqzpm8k0), getpostalcode), null, null, null, getpostalcode, 48, 28);
                z4 = false;
                getpostalcode.IconCompatParcelizer(false);
            }
            getCompared getcompared = r8lambdakx1augmjk4nknxfqvyytyqzkc.customerCall;
            if (getcompared == null) {
                getpostalcode.serializer(-1787984635);
                getpostalcode.IconCompatParcelizer(z4);
                int i19 = RemoteActionCompatParcelizer + 83;
                read = i19 % Fields.SpotShadowColor;
                int i20 = i19 % 2;
                z5 = false;
            } else {
                getpostalcode.serializer(-1787984634);
                ExtrasKt.read(913837329, handleUrlOverridelambda1.RemoteActionCompatParcelizer(), handleUrlOverridelambda1.RemoteActionCompatParcelizer(), -913837326, handleUrlOverridelambda1.RemoteActionCompatParcelizer(), handleUrlOverridelambda1.RemoteActionCompatParcelizer(), new Object[]{getpostalcode, SizeKt.m75height3ABfNKs(companion2, Dimensions.setSplitBackground)});
                ContactRow(z2 ? fieldToDouble.Complete : fieldToDouble.Active, ExtrasKt.write(277180463, new SnackbarKt$$ExternalSyntheticLambda2(getcompared, 4, r8lambdardpfsr94j4iebcwx_kpqzpm8k1), getpostalcode), null, null, null, getpostalcode, 48, 28);
                z5 = false;
                getpostalcode.IconCompatParcelizer(false);
            }
            ParameterInformation parameterInformation = r8lambdakx1augmjk4nknxfqvyytyqzkc.customerChatAndCall;
            if (parameterInformation == null) {
                getpostalcode.serializer(-1787423504);
                getpostalcode.IconCompatParcelizer(z5);
            } else {
                getpostalcode.serializer(-1787423503);
                ExtrasKt.read(913837329, handleUrlOverridelambda1.RemoteActionCompatParcelizer(), handleUrlOverridelambda1.RemoteActionCompatParcelizer(), -913837326, handleUrlOverridelambda1.RemoteActionCompatParcelizer(), handleUrlOverridelambda1.RemoteActionCompatParcelizer(), new Object[]{getpostalcode, SizeKt.m75height3ABfNKs(companion2, Dimensions.setSplitBackground)});
                if (z3) {
                    int i21 = RemoteActionCompatParcelizer + 81;
                    read = i21 % Fields.SpotShadowColor;
                    int i22 = i21 % 2;
                    fieldtodouble = fieldToDouble.Complete;
                } else {
                    fieldtodouble = fieldToDouble.Active;
                }
                ContactRow(fieldtodouble, ExtrasKt.write(1407994861, new SnackbarKt$$ExternalSyntheticLambda2(parameterInformation, 5, r8lambdardpfsr94j4iebcwx_kpqzpm8k2), getpostalcode), null, null, null, getpostalcode, 48, 28);
                getpostalcode.IconCompatParcelizer(false);
            }
            IconCompatParcelizer.IconCompatParcelizer(companion2, Dimensions.setSplitBackground, getpostalcode, true);
            modifier2 = companion2;
        } else {
            getpostalcode.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
            modifier2 = modifier;
        }
        getHandleruiannotations gethandleruiannotationsMediaDescriptionCompat = getpostalcode.MediaDescriptionCompat();
        if (gethandleruiannotationsMediaDescriptionCompat != null) {
            gethandleruiannotationsMediaDescriptionCompat.serializer = new logWarningui_toolingdefault(r8lambdakx1augmjk4nknxfqvyytyqzkc, z, z2, r8lambdardpfsr94j4iebcwx_kpqzpm8k0, r8lambdardpfsr94j4iebcwx_kpqzpm8k1, r8lambdardpfsr94j4iebcwx_kpqzpm8k2, i, modifier2, i2);
        }
    }
}
