package com.roadrunner.delivery.ontheway.tripplanner.list.presentation.compose;

import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.material3.IconKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Fields;
import androidx.compose.ui.graphics.painter.Painter;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.res.PainterResources_androidKt;
import bo.app.c8$$ExternalSyntheticOutline0;
import bo.app.d$$ExternalSyntheticOutline0;
import bo.app.m1$$ExternalSyntheticOutline0;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import com.logistics.rider.glovo.R;
import com.roadrunner.designsystem.compose.theme.tokens.Dimensions;
import com.roadrunner.rrds.compose.component.layouts.DividerKt;
import io.sentry.SentryUUID;
import o.AndroidContentCaptureManagerCompanion;
import o.BrushStyle;
import o.DragAndDropNodestartDragAndDropTransfer1;
import o.DrawStyleSpan_androidKt;
import o.ModalBottomSheetKtModalBottomSheet311;
import o.ModalBottomSheetYbuCTN8;
import o.buildMapping;
import o.getBirthDateFull;
import o.getHandleruiannotations;
import o.getNewPassword;
import o.getPostalCode;
import o.isSpecified4Dl_Bck;
import o.performMeasureDjhGOtQ;
import o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0;

/* JADX INFO: loaded from: classes3.dex */
public abstract class VerticalIndicatorKt {
    private static int serializer = 1;
    private static int write;

    public static final void VerticalIndicator(DrawStyleSpan_androidKt drawStyleSpan_androidKt, boolean z, boolean z2, Modifier modifier, getBirthDateFull getbirthdatefull, int i) {
        int i2;
        boolean z3;
        int i3;
        long supportBackgroundTintMode;
        int i4;
        int i5 = 2 % 2;
        drawStyleSpan_androidKt.getClass();
        getPostalCode getpostalcode = (getPostalCode) getbirthdatefull;
        getpostalcode.MediaSessionCompatQueueItem(-1885034200);
        if ((i & 6) == 0) {
            i2 = (getpostalcode.read(drawStyleSpan_androidKt.ordinal()) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            if (getpostalcode.write(z)) {
                int i6 = serializer + 23;
                write = i6 % Fields.SpotShadowColor;
                i4 = i6 % 2 != 0 ? 116 : 32;
            } else {
                i4 = 16;
            }
            i2 |= i4;
        }
        Object obj = null;
        if ((i & 384) == 0) {
            int i7 = write + 125;
            serializer = i7 % Fields.SpotShadowColor;
            if (i7 % 2 == 0) {
                getpostalcode.write(z2);
                throw null;
            }
            i2 |= getpostalcode.write(z2) ? Fields.RotationX : Fields.SpotShadowColor;
            int i8 = write + 73;
            serializer = i8 % Fields.SpotShadowColor;
            int i9 = i8 % 2;
        }
        if ((i & 3072) == 0) {
            i2 |= getpostalcode.read(modifier) ? Fields.CameraDistance : Fields.RotationZ;
        }
        if ((i2 & 1171) != 1170) {
            int i10 = write + 57;
            serializer = i10 % Fields.SpotShadowColor;
            int i11 = i10 % 2;
            z3 = true;
        } else {
            z3 = false;
        }
        if (getpostalcode.write(i2 & 1, z3)) {
            ModalBottomSheetYbuCTN8 modalBottomSheetYbuCTN8Serializer = ModalBottomSheetKtModalBottomSheet311.serializer(Arrangement.MediaDescriptionCompat, Alignment.Companion.getCenterHorizontally(), getpostalcode, 48);
            int iHashCode = Long.hashCode(getpostalcode.RatingCompat);
            DragAndDropNodestartDragAndDropTransfer1 dragAndDropNodestartDragAndDropTransfer1Serializer = getpostalcode.serializer();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(getpostalcode, modifier);
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
            int i12 = BrushStyle.write[drawStyleSpan_androidKt.ordinal()];
            if (i12 != 1) {
                int i13 = serializer + 49;
                write = i13 % Fields.SpotShadowColor;
                int i14 = i13 % 2;
                if (i12 != 2) {
                    ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer();
                    return;
                }
                i3 = R.drawable.ic_bold_large_person_default;
            } else {
                i3 = R.drawable.ic_bold_large_shop_default;
            }
            if (z) {
                int i15 = serializer + 105;
                write = i15 % Fields.SpotShadowColor;
                if (i15 % 2 != 0) {
                    getpostalcode.serializer(1768138077);
                    ((buildMapping) getpostalcode.write((getNewPassword) performMeasureDjhGOtQ.RemoteActionCompatParcelizer)).setEmojiCompatEnabled();
                    obj.hashCode();
                    throw null;
                }
                getpostalcode.serializer(1768138077);
                supportBackgroundTintMode = ((buildMapping) getpostalcode.write((getNewPassword) performMeasureDjhGOtQ.RemoteActionCompatParcelizer)).setEmojiCompatEnabled();
            } else {
                getpostalcode.serializer(1768138843);
                supportBackgroundTintMode = ((buildMapping) getpostalcode.write((getNewPassword) performMeasureDjhGOtQ.RemoteActionCompatParcelizer)).getSupportBackgroundTintMode();
            }
            getpostalcode.IconCompatParcelizer(false);
            IconKt.m116Iconww6aTOc(PainterResources_androidKt.painterResource(i3, getpostalcode, 0), "", (Modifier) null, supportBackgroundTintMode, getpostalcode, Painter.$stable | 48, 4);
            if (!(!z2)) {
                getpostalcode.serializer(-1022089828);
                DividerKt.m5057DividerVerticalDashedDt02yhY(Dimensions.write, 0, 0, ((buildMapping) getpostalcode.write((getNewPassword) performMeasureDjhGOtQ.RemoteActionCompatParcelizer)).getSupportBackgroundTintMode(), getpostalcode, PaddingKt.m74paddingqDBjuR0$default(d$$ExternalSyntheticOutline0.m(1.0f, true, Modifier.Companion), 0.0f, Dimensions.getActionBarHideOffset, 0.0f, 0.0f, 13));
                getpostalcode.IconCompatParcelizer(false);
            } else {
                getpostalcode.serializer(-1021824592);
                getpostalcode.IconCompatParcelizer(false);
            }
            getpostalcode.IconCompatParcelizer(true);
        } else {
            getpostalcode.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
        }
        getHandleruiannotations gethandleruiannotationsMediaDescriptionCompat = getpostalcode.MediaDescriptionCompat();
        if (gethandleruiannotationsMediaDescriptionCompat != null) {
            gethandleruiannotationsMediaDescriptionCompat.serializer = new isSpecified4Dl_Bck(drawStyleSpan_androidKt, z, z2, modifier, i, 0);
        }
    }
}
