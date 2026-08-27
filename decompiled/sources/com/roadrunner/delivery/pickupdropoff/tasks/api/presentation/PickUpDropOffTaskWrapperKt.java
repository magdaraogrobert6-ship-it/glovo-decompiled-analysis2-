package com.roadrunner.delivery.pickupdropoff.tasks.api.presentation;

import androidx.compose.animation.AnimationModifierKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.IntrinsicKt;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Fields;
import androidx.compose.ui.node.ComposeUiNode;
import bo.app.m1$$ExternalSyntheticOutline0;
import com.roadrunner.designsystem.compose.theme.tokens.Dimensions;
import com.roadrunner.rrds.compose.component.stepper.TaskStatusIndicatorKt;
import io.sentry.SentryUUID;
import o.AndroidContentCaptureManagerCompanion;
import o.DragAndDropNodestartDragAndDropTransfer1;
import o.DragAndDropTargetModifierNode;
import o.TextFieldDefaults;
import o.expand;
import o.fieldToDouble;
import o.getBirthDateFull;
import o.getHandleruiannotations;
import o.getPostalCode;
import o.p6;
import o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0;
import o.r8lambdafvzP3Wky1RLLzE56uVXaMHcvU;
import o.supportingTextPaddinga9UjIt4material3default;

/* JADX INFO: loaded from: classes3.dex */
public abstract class PickUpDropOffTaskWrapperKt {
    private static int RemoteActionCompatParcelizer = 0;
    private static int serializer = 1;

    public static final void PickUpDropOffTaskWrapper(boolean z, Boolean bool, Modifier modifier, DragAndDropTargetModifierNode dragAndDropTargetModifierNode, getBirthDateFull getbirthdatefull, int i) {
        int i2;
        Modifier modifier2;
        int i3;
        int i4;
        int i5;
        int i6 = 2 % 2;
        getPostalCode getpostalcode = (getPostalCode) getbirthdatefull;
        getpostalcode.MediaSessionCompatQueueItem(1100621689);
        if ((i & 6) == 0) {
            int i7 = RemoteActionCompatParcelizer + 71;
            serializer = i7 % Fields.SpotShadowColor;
            int i8 = i7 % 2;
            if (getpostalcode.write(z)) {
                int i9 = serializer + 11;
                RemoteActionCompatParcelizer = i9 % Fields.SpotShadowColor;
                int i10 = i9 % 2;
                i5 = 4;
            } else {
                i5 = 2;
            }
            i2 = i5 | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            if (getpostalcode.read(bool)) {
                int i11 = RemoteActionCompatParcelizer + 79;
                serializer = i11 % Fields.SpotShadowColor;
                int i12 = i11 % 2;
                i4 = 32;
            } else {
                i4 = 16;
            }
            i2 |= i4;
        }
        int i13 = i2 | 384;
        if ((i & 3072) == 0) {
            if (getpostalcode.IconCompatParcelizer(dragAndDropTargetModifierNode)) {
                int i14 = RemoteActionCompatParcelizer + 25;
                serializer = i14 % Fields.SpotShadowColor;
                i3 = i14 % 2 == 0 ? 27807 : Fields.CameraDistance;
            } else {
                i3 = Fields.RotationZ;
            }
            i13 |= i3;
        }
        int i15 = i13;
        if (getpostalcode.write(i15 & 1, (i15 & 1171) != 1170)) {
            Modifier.Companion companion = Modifier.Companion;
            if (bool != null) {
                getpostalcode.serializer(840613206);
                Modifier modifierWrite = AnimationModifierKt.write(IntrinsicKt.height(SizeKt.write(PaddingKt.m73paddingVpY3zN4$default(companion, Dimensions.setMenu, 0.0f, 2), 1.0f), expand.Max), null, 3);
                supportingTextPaddinga9UjIt4material3default supportingtextpaddinga9ujit4material3defaultSerializer = TextFieldDefaults.serializer(Arrangement.MediaBrowserCompatMediaItem, Alignment.Companion.getTop(), getpostalcode, 0);
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
                if (!(!getpostalcode.ComponentActivity)) {
                    int i16 = RemoteActionCompatParcelizer + 47;
                    serializer = i16 % Fields.SpotShadowColor;
                    if (i16 % 2 == 0) {
                        getpostalcode.serializer(constructor);
                        Object obj = null;
                        obj.hashCode();
                        throw null;
                    }
                    getpostalcode.serializer(constructor);
                } else {
                    getpostalcode.r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28();
                }
                r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.read(companion2, getpostalcode, supportingtextpaddinga9ujit4material3defaultSerializer, getpostalcode, dragAndDropNodestartDragAndDropTransfer1Serializer);
                AndroidContentCaptureManagerCompanion.write(getpostalcode, modifierMaterializeModifier, m1$$ExternalSyntheticOutline0.m(companion2, getpostalcode, Integer.valueOf(iHashCode), getpostalcode));
                modifier2 = companion;
                TaskStatusIndicatorKt.TaskStatusIndicator(z ? fieldToDouble.Complete : fieldToDouble.Active, PaddingKt.m74paddingqDBjuR0$default(SizeKt.serializer(companion, 1.0f), 0.0f, 0.0f, Dimensions.setIcon, 0.0f, 11), null, bool.booleanValue(), getpostalcode, (i15 << 6) & 7168, 4);
                dragAndDropTargetModifierNode.invoke(getpostalcode, Integer.valueOf((i15 >> 9) & 14));
                getpostalcode.IconCompatParcelizer(true);
                getpostalcode.IconCompatParcelizer(false);
            } else {
                modifier2 = companion;
                getpostalcode.serializer(841283984);
                dragAndDropTargetModifierNode.invoke(getpostalcode, Integer.valueOf((i15 >> 9) & 14));
                getpostalcode.IconCompatParcelizer(false);
            }
        } else {
            getpostalcode.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
            modifier2 = modifier;
        }
        getHandleruiannotations gethandleruiannotationsMediaDescriptionCompat = getpostalcode.MediaDescriptionCompat();
        if (gethandleruiannotationsMediaDescriptionCompat != null) {
            gethandleruiannotationsMediaDescriptionCompat.serializer = new p6(z, bool, modifier2, dragAndDropTargetModifierNode, i, 4);
        }
    }
}
