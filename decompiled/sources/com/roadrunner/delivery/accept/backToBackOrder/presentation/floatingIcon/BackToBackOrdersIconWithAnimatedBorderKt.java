package com.roadrunner.delivery.accept.backToBackOrder.presentation.floatingIcon;

import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Fields;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.unit.Dp;
import bo.app.af$$ExternalSyntheticOutline0;
import bo.app.m1$$ExternalSyntheticOutline0;
import com.roadrunner.rrds.compose.ModifierAnimatedGradientBorderKt;
import io.sentry.SentryUUID;
import o.AndroidContentCaptureManagerCompanion;
import o.DragAndDropNodestartDragAndDropTransfer1;
import o.equalEnum;
import o.getBirthDateFull;
import o.getHandleruiannotations;
import o.getPostalCode;
import o.getTopLeftannotations;
import o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0;
import o.r8lambdaYAYqCgublv1aaKYwrIvjEYiW1c;

/* JADX INFO: loaded from: classes3.dex */
public abstract class BackToBackOrdersIconWithAnimatedBorderKt {
    private static int IconCompatParcelizer = 1;
    private static int serializer;

    /* JADX WARN: Code duplicated, block: B:45:0x00c7  */
    /* JADX WARN: Code duplicated, block: B:48:0x00ce  */
    /* JADX WARN: Code duplicated, block: B:52:0x0119  */
    /* JADX WARN: Code duplicated, block: B:54:0x0129  */
    /* JADX WARN: Code duplicated, block: B:55:0x0136  */
    /* JADX WARN: Code duplicated, block: B:57:0x016c  */
    public static final void BackToBackOrdersIconWithAnimatedBorder(r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k0, int i, Modifier modifier, int i2, getTopLeftannotations gettopleftannotations, getBirthDateFull getbirthdatefull, int i3) {
        int i4;
        int i5;
        getTopLeftannotations gettopleftannotations2;
        getTopLeftannotations gettopleftannotations3;
        int i6;
        int i7;
        MeasurePolicy measurePolicy;
        int iHashCode;
        DragAndDropNodestartDragAndDropTransfer1 dragAndDropNodestartDragAndDropTransfer1Serializer;
        Modifier modifierMaterializeModifier;
        ComposeUiNode.Companion companion;
        r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 constructor;
        int i8;
        int i9;
        int i10 = 2 % 2;
        int i11 = serializer + 81;
        IconCompatParcelizer = i11 % Fields.SpotShadowColor;
        int i12 = i11 % 2;
        r8lambdardpfsr94j4iebcwx_kpqzpm8k0.getClass();
        getPostalCode getpostalcode = (getPostalCode) getbirthdatefull;
        getpostalcode.MediaSessionCompatQueueItem(1872911655);
        if ((i3 & 6) == 0) {
            if (getpostalcode.IconCompatParcelizer(r8lambdardpfsr94j4iebcwx_kpqzpm8k0)) {
                int i13 = IconCompatParcelizer + 89;
                serializer = i13 % Fields.SpotShadowColor;
                int i14 = i13 % 2;
                i9 = 4;
            } else {
                i9 = 2;
            }
            i4 = i9 | i3;
        } else {
            i4 = i3;
        }
        if ((i3 & 48) == 0) {
            int i15 = IconCompatParcelizer + 87;
            serializer = i15 % Fields.SpotShadowColor;
            int i16 = i15 % 2;
            i4 |= getpostalcode.read(i) ? 32 : 16;
        }
        if ((i3 & 384) == 0) {
            if (getpostalcode.read(modifier)) {
                int i17 = IconCompatParcelizer;
                int i18 = i17 + 65;
                serializer = i18 % Fields.SpotShadowColor;
                i8 = i18 % 2 != 0 ? 10410 : Fields.RotationX;
                int i19 = i17 + 83;
                serializer = i19 % Fields.SpotShadowColor;
                int i20 = i19 % 2;
            } else {
                int i21 = serializer + 103;
                IconCompatParcelizer = i21 % Fields.SpotShadowColor;
                int i22 = i21 % 2;
                i8 = Fields.SpotShadowColor;
            }
            i4 |= i8;
        }
        int i23 = i4 | 3072;
        if ((i3 & 24576) == 0) {
            i23 = i4 | 11264;
            int i24 = serializer + 53;
            IconCompatParcelizer = i24 % Fields.SpotShadowColor;
            int i25 = i24 % 2;
        }
        if (getpostalcode.write(i23 & 1, (i23 & 9363) != 9362)) {
            int i26 = serializer + 29;
            IconCompatParcelizer = i26 % Fields.SpotShadowColor;
            if (i26 % 2 == 0) {
                getpostalcode.r8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss();
                if ((i3 & 1) != 0) {
                    if (getpostalcode.PlaybackStateCompat()) {
                        getpostalcode.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
                        gettopleftannotations3 = gettopleftannotations;
                        i6 = i23 & (-57345);
                        i7 = i2;
                    }
                }
                getpostalcode.RemoteActionCompatParcelizer();
                Modifier modifierM83size3ABfNKs = SizeKt.m83size3ABfNKs(modifier, Dp.m3673constructorimpl(48.0f));
                modifierM83size3ABfNKs.getClass();
                Modifier modifierSerializer = ModifierAnimatedGradientBorderKt.serializer(modifierM83size3ABfNKs, gettopleftannotations3, Dp.m3673constructorimpl(i7), getpostalcode, 4);
                measurePolicy = BoxKt.read(Alignment.Companion.getTopStart(), false);
                iHashCode = Long.hashCode(getpostalcode.RatingCompat);
                dragAndDropNodestartDragAndDropTransfer1Serializer = getpostalcode.serializer();
                modifierMaterializeModifier = ComposedModifierKt.materializeModifier(getpostalcode, modifierSerializer);
                companion = ComposeUiNode.Companion;
                constructor = companion.getConstructor();
                if (getpostalcode.read == null) {
                    SentryUUID.write();
                    throw null;
                }
                int i27 = IconCompatParcelizer + 27;
                serializer = i27 % Fields.SpotShadowColor;
                int i28 = i27 % 2;
                getpostalcode.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg();
                if (getpostalcode.ComponentActivity) {
                    int i29 = serializer + 23;
                    IconCompatParcelizer = i29 % Fields.SpotShadowColor;
                    int i30 = i29 % 2;
                    getpostalcode.serializer(constructor);
                } else {
                    getpostalcode.r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28();
                }
                af$$ExternalSyntheticOutline0.m(companion, getpostalcode, measurePolicy, getpostalcode, dragAndDropNodestartDragAndDropTransfer1Serializer);
                AndroidContentCaptureManagerCompanion.write(getpostalcode, modifierMaterializeModifier, m1$$ExternalSyntheticOutline0.m(companion, getpostalcode, Integer.valueOf(iHashCode), getpostalcode));
                equalEnum.IconCompatParcelizer(i, r8lambdardpfsr94j4iebcwx_kpqzpm8k0, null, false, null, 0.0f, 0.0f, getpostalcode, ((i6 >> 3) & 14) | ((i6 << 3) & 112), 124);
                getpostalcode.IconCompatParcelizer(true);
                int i31 = i7;
                gettopleftannotations2 = gettopleftannotations3;
                i5 = i31;
            } else {
                getpostalcode.r8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss();
                if ((i3 & 1) != 0) {
                    if (getpostalcode.PlaybackStateCompat()) {
                        getpostalcode.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
                        gettopleftannotations3 = gettopleftannotations;
                        i6 = i23 & (-57345);
                        i7 = i2;
                    }
                }
                getpostalcode.RemoteActionCompatParcelizer();
                Modifier modifierM83size3ABfNKs2 = SizeKt.m83size3ABfNKs(modifier, Dp.m3673constructorimpl(48.0f));
                modifierM83size3ABfNKs2.getClass();
                Modifier modifierSerializer2 = ModifierAnimatedGradientBorderKt.serializer(modifierM83size3ABfNKs2, gettopleftannotations3, Dp.m3673constructorimpl(i7), getpostalcode, 4);
                measurePolicy = BoxKt.read(Alignment.Companion.getTopStart(), false);
                iHashCode = Long.hashCode(getpostalcode.RatingCompat);
                dragAndDropNodestartDragAndDropTransfer1Serializer = getpostalcode.serializer();
                modifierMaterializeModifier = ComposedModifierKt.materializeModifier(getpostalcode, modifierSerializer2);
                companion = ComposeUiNode.Companion;
                constructor = companion.getConstructor();
                if (getpostalcode.read == null) {
                    SentryUUID.write();
                    throw null;
                }
                int i210 = IconCompatParcelizer + 27;
                serializer = i210 % Fields.SpotShadowColor;
                int i211 = i210 % 2;
                getpostalcode.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg();
                if (getpostalcode.ComponentActivity) {
                    int i212 = serializer + 23;
                    IconCompatParcelizer = i212 % Fields.SpotShadowColor;
                    int i32 = i212 % 2;
                    getpostalcode.serializer(constructor);
                } else {
                    getpostalcode.r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28();
                }
                af$$ExternalSyntheticOutline0.m(companion, getpostalcode, measurePolicy, getpostalcode, dragAndDropNodestartDragAndDropTransfer1Serializer);
                AndroidContentCaptureManagerCompanion.write(getpostalcode, modifierMaterializeModifier, m1$$ExternalSyntheticOutline0.m(companion, getpostalcode, Integer.valueOf(iHashCode), getpostalcode));
                equalEnum.IconCompatParcelizer(i, r8lambdardpfsr94j4iebcwx_kpqzpm8k0, null, false, null, 0.0f, 0.0f, getpostalcode, ((i6 >> 3) & 14) | ((i6 << 3) & 112), 124);
                getpostalcode.IconCompatParcelizer(true);
                int i33 = i7;
                gettopleftannotations2 = gettopleftannotations3;
                i5 = i33;
            }
            i6 = i23 & (-57345);
            gettopleftannotations3 = RoundedCornerShapeKt.IconCompatParcelizer;
            i7 = 2;
            getpostalcode.RemoteActionCompatParcelizer();
            Modifier modifierM83size3ABfNKs3 = SizeKt.m83size3ABfNKs(modifier, Dp.m3673constructorimpl(48.0f));
            modifierM83size3ABfNKs3.getClass();
            Modifier modifierSerializer3 = ModifierAnimatedGradientBorderKt.serializer(modifierM83size3ABfNKs3, gettopleftannotations3, Dp.m3673constructorimpl(i7), getpostalcode, 4);
            measurePolicy = BoxKt.read(Alignment.Companion.getTopStart(), false);
            iHashCode = Long.hashCode(getpostalcode.RatingCompat);
            dragAndDropNodestartDragAndDropTransfer1Serializer = getpostalcode.serializer();
            modifierMaterializeModifier = ComposedModifierKt.materializeModifier(getpostalcode, modifierSerializer3);
            companion = ComposeUiNode.Companion;
            constructor = companion.getConstructor();
            if (getpostalcode.read == null) {
                SentryUUID.write();
                throw null;
            }
            int i213 = IconCompatParcelizer + 27;
            serializer = i213 % Fields.SpotShadowColor;
            int i214 = i213 % 2;
            getpostalcode.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg();
            if (getpostalcode.ComponentActivity) {
                int i215 = serializer + 23;
                IconCompatParcelizer = i215 % Fields.SpotShadowColor;
                int i34 = i215 % 2;
                getpostalcode.serializer(constructor);
            } else {
                getpostalcode.r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28();
            }
            af$$ExternalSyntheticOutline0.m(companion, getpostalcode, measurePolicy, getpostalcode, dragAndDropNodestartDragAndDropTransfer1Serializer);
            AndroidContentCaptureManagerCompanion.write(getpostalcode, modifierMaterializeModifier, m1$$ExternalSyntheticOutline0.m(companion, getpostalcode, Integer.valueOf(iHashCode), getpostalcode));
            equalEnum.IconCompatParcelizer(i, r8lambdardpfsr94j4iebcwx_kpqzpm8k0, null, false, null, 0.0f, 0.0f, getpostalcode, ((i6 >> 3) & 14) | ((i6 << 3) & 112), 124);
            getpostalcode.IconCompatParcelizer(true);
            int i35 = i7;
            gettopleftannotations2 = gettopleftannotations3;
            i5 = i35;
        } else {
            getpostalcode.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
            i5 = i2;
            gettopleftannotations2 = gettopleftannotations;
        }
        getHandleruiannotations gethandleruiannotationsMediaDescriptionCompat = getpostalcode.MediaDescriptionCompat();
        if (gethandleruiannotationsMediaDescriptionCompat != null) {
            gethandleruiannotationsMediaDescriptionCompat.serializer = new r8lambdaYAYqCgublv1aaKYwrIvjEYiW1c(r8lambdardpfsr94j4iebcwx_kpqzpm8k0, i, modifier, i5, gettopleftannotations2, i3);
        }
    }
}
