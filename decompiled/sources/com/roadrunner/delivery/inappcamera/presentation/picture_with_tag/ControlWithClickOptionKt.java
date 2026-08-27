package com.roadrunner.delivery.inappcamera.presentation.picture_with_tag;

import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.material3.TextKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.Fields;
import androidx.compose.ui.graphics.RectangleShapeKt;
import androidx.compose.ui.graphics.painter.Painter;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.res.PainterResources_androidKt;
import androidx.compose.ui.res.StringResources_androidKt;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.unit.Dp;
import bo.app.af$$ExternalSyntheticOutline0;
import bo.app.b1$$ExternalSyntheticLambda0;
import bo.app.m1$$ExternalSyntheticOutline0;
import com.logistics.rider.glovo.R;
import com.roadrunner.designsystem.compose.theme.tokens.Dimensions;
import io.sentry.SentryUUID;
import o.AndroidContentCaptureManagerCompanion;
import o.DragAndDropNodestartDragAndDropTransfer1;
import o.TextFieldDefaults;
import o.copyejIjP34;
import o.getAddressCountry;
import o.getBirthDateFull;
import o.getCreditCardExpirationMonth;
import o.getHandleruiannotations;
import o.getPostalCode;
import o.getui_text;
import o.performLayout;
import o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0;
import o.r8lambdafvzP3Wky1RLLzE56uVXaMHcvU;
import o.supportingTextPaddinga9UjIt4material3default;
import timber.log.Timber;

/* JADX INFO: loaded from: classes3.dex */
public abstract class ControlWithClickOptionKt {
    private static int IconCompatParcelizer = 1;
    private static int RemoteActionCompatParcelizer = 0;
    public static final float read = Dp.m3673constructorimpl(150.0f);
    private static int serializer = 1;
    private static int write;

    static {
        int i = RemoteActionCompatParcelizer + 19;
        serializer = i % Fields.SpotShadowColor;
        int i2 = i % 2;
    }

    public static final void ControlWithClickOption(boolean z, boolean z2, r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k0, r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k1, r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k2, Modifier modifier, getBirthDateFull getbirthdatefull, int i) {
        int i2;
        boolean z3;
        getPostalCode getpostalcode;
        int i3;
        int i4;
        int i5;
        int i6 = 2 % 2;
        r8lambdardpfsr94j4iebcwx_kpqzpm8k0.getClass();
        r8lambdardpfsr94j4iebcwx_kpqzpm8k1.getClass();
        r8lambdardpfsr94j4iebcwx_kpqzpm8k2.getClass();
        getPostalCode getpostalcode2 = (getPostalCode) getbirthdatefull;
        getpostalcode2.MediaSessionCompatQueueItem(-847365511);
        getAddressCountry getaddresscountry = getpostalcode2.read;
        Object obj = null;
        if ((i & 6) == 0) {
            int i7 = IconCompatParcelizer + 79;
            write = i7 % Fields.SpotShadowColor;
            if (i7 % 2 != 0) {
                getpostalcode2.write(z);
                obj.hashCode();
                throw null;
            }
            i2 = (getpostalcode2.write(z) ? 4 : 2) | i;
            int i8 = IconCompatParcelizer + 5;
            write = i8 % Fields.SpotShadowColor;
            int i9 = i8 % 2;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            int i10 = write + 105;
            IconCompatParcelizer = i10 % Fields.SpotShadowColor;
            int i11 = i10 % 2;
            i2 |= getpostalcode2.write(z2) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            if (getpostalcode2.IconCompatParcelizer(r8lambdardpfsr94j4iebcwx_kpqzpm8k0)) {
                int i12 = IconCompatParcelizer + 121;
                write = i12 % Fields.SpotShadowColor;
                i5 = i12 % 2 != 0 ? 126 : Fields.RotationX;
            } else {
                i5 = Fields.SpotShadowColor;
            }
            i2 |= i5;
        }
        if ((i & 3072) == 0) {
            if (getpostalcode2.IconCompatParcelizer(r8lambdardpfsr94j4iebcwx_kpqzpm8k1)) {
                int i13 = IconCompatParcelizer + 35;
                write = i13 % Fields.SpotShadowColor;
                int i14 = i13 % 2;
                i4 = Fields.CameraDistance;
            } else {
                i4 = Fields.RotationZ;
            }
            i2 |= i4;
        }
        if ((i & 24576) == 0) {
            int i15 = write + 53;
            IconCompatParcelizer = i15 % Fields.SpotShadowColor;
            int i16 = i15 % 2;
            if (getpostalcode2.IconCompatParcelizer(r8lambdardpfsr94j4iebcwx_kpqzpm8k2)) {
                int i17 = write + 109;
                IconCompatParcelizer = i17 % Fields.SpotShadowColor;
                i3 = i17 % 2 == 0 ? 31328 : Fields.Clip;
            } else {
                i3 = 8192;
            }
            i2 |= i3;
        }
        if ((196608 & i) == 0) {
            i2 |= getpostalcode2.read(modifier) ? Fields.RenderEffect : 65536;
        }
        if ((74899 & i2) != 74898) {
            int i18 = IconCompatParcelizer + 21;
            write = i18 % Fields.SpotShadowColor;
            int i19 = i18 % 2;
            z3 = true;
        } else {
            z3 = false;
        }
        if (getpostalcode2.write(i2 & 1, z3)) {
            Modifier modifierM75height3ABfNKs = SizeKt.m75height3ABfNKs(SizeKt.write(modifier, 1.0f), read);
            Color.Companion companion = Color.Companion;
            Modifier modifierM20backgroundbw27NRU = BackgroundKt.m20backgroundbw27NRU(modifierM75height3ABfNKs, companion.m748getBlack0d7_KjU(), RectangleShapeKt.getRectangleShape());
            Alignment.Companion companion2 = Alignment.Companion;
            MeasurePolicy measurePolicy = BoxKt.read(companion2.getTopStart(), false);
            int iHashCode = Long.hashCode(getpostalcode2.RatingCompat);
            DragAndDropNodestartDragAndDropTransfer1 dragAndDropNodestartDragAndDropTransfer1Serializer = getpostalcode2.serializer();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(getpostalcode2, modifierM20backgroundbw27NRU);
            ComposeUiNode.Companion companion3 = ComposeUiNode.Companion;
            r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 constructor = companion3.getConstructor();
            if (getaddresscountry == null) {
                SentryUUID.write();
                throw null;
            }
            getpostalcode2.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg();
            if (getpostalcode2.ComponentActivity) {
                getpostalcode2.serializer(constructor);
            } else {
                getpostalcode2.r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28();
            }
            af$$ExternalSyntheticOutline0.m(companion3, getpostalcode2, measurePolicy, getpostalcode2, dragAndDropNodestartDragAndDropTransfer1Serializer);
            AndroidContentCaptureManagerCompanion.write(getpostalcode2, modifierMaterializeModifier, m1$$ExternalSyntheticOutline0.m(companion3, getpostalcode2, Integer.valueOf(iHashCode), getpostalcode2));
            Modifier.Companion companion4 = Modifier.Companion;
            Modifier modifierRemoteActionCompatParcelizer = PaddingKt.RemoteActionCompatParcelizer(SizeKt.write(companion4, 1.0f), Dimensions.setVisibility, Dimensions.getAnimatedVisibility);
            supportingTextPaddinga9UjIt4material3default supportingtextpaddinga9ujit4material3defaultSerializer = TextFieldDefaults.serializer(Arrangement.read, companion2.getCenterVertically(), getpostalcode2, 54);
            int iHashCode2 = Long.hashCode(getpostalcode2.RatingCompat);
            DragAndDropNodestartDragAndDropTransfer1 dragAndDropNodestartDragAndDropTransfer1Serializer2 = getpostalcode2.serializer();
            Modifier modifierMaterializeModifier2 = ComposedModifierKt.materializeModifier(getpostalcode2, modifierRemoteActionCompatParcelizer);
            r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 constructor2 = companion3.getConstructor();
            getpostalcode2.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg();
            if (getpostalcode2.ComponentActivity) {
                getpostalcode2.serializer(constructor2);
            } else {
                getpostalcode2.r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28();
            }
            r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.read(companion3, getpostalcode2, supportingtextpaddinga9ujit4material3defaultSerializer, getpostalcode2, dragAndDropNodestartDragAndDropTransfer1Serializer2);
            AndroidContentCaptureManagerCompanion.write(getpostalcode2, modifierMaterializeModifier2, m1$$ExternalSyntheticOutline0.m(companion3, getpostalcode2, Integer.valueOf(iHashCode2), getpostalcode2));
            Modifier modifierWrite = copyejIjP34.write(companion4, 1.0f);
            MeasurePolicy measurePolicy2 = BoxKt.read(companion2.getCenterStart(), false);
            int iHashCode3 = Long.hashCode(getpostalcode2.RatingCompat);
            DragAndDropNodestartDragAndDropTransfer1 dragAndDropNodestartDragAndDropTransfer1Serializer3 = getpostalcode2.serializer();
            Modifier modifierMaterializeModifier3 = ComposedModifierKt.materializeModifier(getpostalcode2, modifierWrite);
            r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 constructor3 = companion3.getConstructor();
            getpostalcode2.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg();
            if (getpostalcode2.ComponentActivity) {
                getpostalcode2.serializer(constructor3);
            } else {
                getpostalcode2.r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28();
            }
            af$$ExternalSyntheticOutline0.m(companion3, getpostalcode2, measurePolicy2, getpostalcode2, dragAndDropNodestartDragAndDropTransfer1Serializer3);
            AndroidContentCaptureManagerCompanion.write(getpostalcode2, modifierMaterializeModifier3, m1$$ExternalSyntheticOutline0.m(companion3, getpostalcode2, Integer.valueOf(iHashCode3), getpostalcode2));
            String strStringResource = StringResources_androidKt.stringResource(R.string.take_better_picture_cancel_button_text, getpostalcode2, 0);
            long jM759getWhite0d7_KjU = companion.m759getWhite0d7_KjU();
            TextStyle textStyle = performLayout.read();
            boolean z4 = (i2 & 7168) == 2048;
            Object objComponentActivity = getpostalcode2.ComponentActivity();
            if (z4 || objComponentActivity == getCreditCardExpirationMonth.write) {
                objComponentActivity = new b1$$ExternalSyntheticLambda0(5, r8lambdardpfsr94j4iebcwx_kpqzpm8k1);
                getpostalcode2.write(objComponentActivity);
            }
            getpostalcode = getpostalcode2;
            TextKt.m131TextNvy7gAk(strStringResource, ClickableKt.RemoteActionCompatParcelizer(companion4, false, null, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) objComponentActivity, 15), jM759getWhite0d7_KjU, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, textStyle, getpostalcode, 384, 0, 131064);
            getpostalcode.IconCompatParcelizer(true);
            Modifier modifierWrite2 = copyejIjP34.write(companion4, 1.0f);
            MeasurePolicy measurePolicy3 = BoxKt.read(companion2.getCenter(), false);
            int iHashCode4 = Long.hashCode(getpostalcode.RatingCompat);
            DragAndDropNodestartDragAndDropTransfer1 dragAndDropNodestartDragAndDropTransfer1Serializer4 = getpostalcode.serializer();
            Modifier modifierMaterializeModifier4 = ComposedModifierKt.materializeModifier(getpostalcode, modifierWrite2);
            r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 constructor4 = companion3.getConstructor();
            getpostalcode.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg();
            if (getpostalcode.ComponentActivity) {
                int i20 = write + 113;
                IconCompatParcelizer = i20 % Fields.SpotShadowColor;
                int i21 = i20 % 2;
                getpostalcode.serializer(constructor4);
            } else {
                getpostalcode.r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28();
            }
            af$$ExternalSyntheticOutline0.m(companion3, getpostalcode, measurePolicy3, getpostalcode, dragAndDropNodestartDragAndDropTransfer1Serializer4);
            AndroidContentCaptureManagerCompanion.write(getpostalcode, modifierMaterializeModifier4, m1$$ExternalSyntheticOutline0.m(companion3, getpostalcode, Integer.valueOf(iHashCode4), getpostalcode));
            Painter painterPainterResource = PainterResources_androidKt.painterResource(R.drawable.ic_bold_large_camera_union, getpostalcode, 0);
            Modifier modifierRemoteActionCompatParcelizer2 = ClickableKt.RemoteActionCompatParcelizer(SizeKt.m84sizeVpY3zN4(companion4, Dimensions.onCreate, Dimensions.onMenuItemSelected), false, null, r8lambdardpfsr94j4iebcwx_kpqzpm8k2, 15);
            modifierRemoteActionCompatParcelizer2.getClass();
            int i22 = Painter.$stable | 48;
            ImageKt.Image(painterPainterResource, "Camera click button", modifierRemoteActionCompatParcelizer2, null, null, 0.0f, null, getpostalcode, i22, 120);
            getpostalcode.IconCompatParcelizer(true);
            int i23 = z ? R.drawable.ic_bold_large_camera_flash_on : R.drawable.ic_bold_large_camera_flash_off;
            Modifier modifierWrite3 = copyejIjP34.write(companion4, 1.0f);
            MeasurePolicy measurePolicy4 = BoxKt.read(companion2.getCenterEnd(), false);
            int iHashCode5 = Long.hashCode(getpostalcode.RatingCompat);
            DragAndDropNodestartDragAndDropTransfer1 dragAndDropNodestartDragAndDropTransfer1Serializer5 = getpostalcode.serializer();
            Modifier modifierMaterializeModifier5 = ComposedModifierKt.materializeModifier(getpostalcode, modifierWrite3);
            r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 constructor5 = companion3.getConstructor();
            getpostalcode.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg();
            if (getpostalcode.ComponentActivity) {
                getpostalcode.serializer(constructor5);
            } else {
                getpostalcode.r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28();
            }
            af$$ExternalSyntheticOutline0.m(companion3, getpostalcode, measurePolicy4, getpostalcode, dragAndDropNodestartDragAndDropTransfer1Serializer5);
            AndroidContentCaptureManagerCompanion.write(getpostalcode, modifierMaterializeModifier5, m1$$ExternalSyntheticOutline0.m(companion3, getpostalcode, Integer.valueOf(iHashCode5), getpostalcode));
            if (z2) {
                int i24 = IconCompatParcelizer + 41;
                write = i24 % Fields.SpotShadowColor;
                int i25 = i24 % 2;
                getpostalcode.serializer(305707501);
                ImageKt.Image(PainterResources_androidKt.painterResource(i23, getpostalcode, 0), "Flash toggle", ClickableKt.RemoteActionCompatParcelizer(companion4, false, null, r8lambdardpfsr94j4iebcwx_kpqzpm8k0, 15), null, null, 0.0f, null, getpostalcode, i22, 120);
                getpostalcode.IconCompatParcelizer(false);
            } else {
                getpostalcode.serializer(305982564);
                getpostalcode.IconCompatParcelizer(false);
                Timber.RemoteActionCompatParcelizer.read(new IllegalStateException("InAppCameraWithTags: Flash feature is unavailable."));
            }
            af$$ExternalSyntheticOutline0.m(getpostalcode, true, true, true);
        } else {
            getpostalcode = getpostalcode2;
            getpostalcode.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
        }
        getHandleruiannotations gethandleruiannotationsMediaDescriptionCompat = getpostalcode.MediaDescriptionCompat();
        if (gethandleruiannotationsMediaDescriptionCompat != null) {
            gethandleruiannotationsMediaDescriptionCompat.serializer = new getui_text(z, z2, r8lambdardpfsr94j4iebcwx_kpqzpm8k0, r8lambdardpfsr94j4iebcwx_kpqzpm8k1, r8lambdardpfsr94j4iebcwx_kpqzpm8k2, modifier, i, 0);
        }
    }
}
