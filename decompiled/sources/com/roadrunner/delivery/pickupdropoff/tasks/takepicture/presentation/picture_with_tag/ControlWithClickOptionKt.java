package com.roadrunner.delivery.pickupdropoff.tasks.takepicture.presentation.picture_with_tag;

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
    public static final float RemoteActionCompatParcelizer = Dp.m3673constructorimpl(150.0f);
    private static int read = 0;
    private static int serializer = 1;
    private static int write;

    static {
        int i = IconCompatParcelizer + 99;
        read = i % Fields.SpotShadowColor;
        int i2 = i % 2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r15v10 */
    /* JADX WARN: Type inference failed for: r15v6 */
    /* JADX WARN: Type inference failed for: r15v7, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r15v9 */
    public static final void ControlWithClickOption(boolean z, boolean z2, r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k0, r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k1, r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k2, Modifier modifier, getBirthDateFull getbirthdatefull, int i) {
        int i2;
        getPostalCode getpostalcode;
        boolean z3;
        boolean z4;
        int i3;
        int i4 = 2 % 2;
        r8lambdardpfsr94j4iebcwx_kpqzpm8k0.getClass();
        r8lambdardpfsr94j4iebcwx_kpqzpm8k1.getClass();
        r8lambdardpfsr94j4iebcwx_kpqzpm8k2.getClass();
        getPostalCode getpostalcode2 = (getPostalCode) getbirthdatefull;
        getpostalcode2.MediaSessionCompatQueueItem(-1632973171);
        getAddressCountry getaddresscountry = getpostalcode2.read;
        Object obj = null;
        if ((i & 6) == 0) {
            int i5 = serializer + 85;
            write = i5 % Fields.SpotShadowColor;
            if (i5 % 2 == 0) {
                i2 = (getpostalcode2.write(z) ? 4 : 2) | i;
                int i6 = write + 69;
                serializer = i6 % Fields.SpotShadowColor;
                int i7 = i6 % 2;
            } else {
                getpostalcode2.write(z);
                obj.hashCode();
                throw null;
            }
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            int i8 = write + 33;
            serializer = i8 % Fields.SpotShadowColor;
            if (i8 % 2 != 0) {
                i2 |= getpostalcode2.write(z2) ? 32 : 16;
            } else {
                getpostalcode2.write(z2);
                obj.hashCode();
                throw null;
            }
        }
        if ((i & 384) == 0) {
            i2 |= getpostalcode2.IconCompatParcelizer(r8lambdardpfsr94j4iebcwx_kpqzpm8k0) ? Fields.RotationX : Fields.SpotShadowColor;
        }
        if ((i & 3072) == 0) {
            i2 |= getpostalcode2.IconCompatParcelizer(r8lambdardpfsr94j4iebcwx_kpqzpm8k1) ? Fields.CameraDistance : Fields.RotationZ;
        }
        if ((i & 24576) == 0) {
            i2 |= getpostalcode2.IconCompatParcelizer(r8lambdardpfsr94j4iebcwx_kpqzpm8k2) ? Fields.Clip : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= getpostalcode2.read(modifier) ? Fields.RenderEffect : 65536;
        }
        if (getpostalcode2.write(i2 & 1, (74899 & i2) != 74898)) {
            Modifier modifierM75height3ABfNKs = SizeKt.m75height3ABfNKs(SizeKt.write(modifier, 1.0f), RemoteActionCompatParcelizer);
            Color.Companion companion = Color.Companion;
            Modifier modifierM20backgroundbw27NRU = BackgroundKt.m20backgroundbw27NRU(modifierM75height3ABfNKs, companion.m748getBlack0d7_KjU(), RectangleShapeKt.getRectangleShape());
            Alignment.Companion companion2 = Alignment.Companion;
            MeasurePolicy measurePolicy = BoxKt.read(companion2.getTopStart(), false);
            int iHashCode = Long.hashCode(getpostalcode2.RatingCompat);
            DragAndDropNodestartDragAndDropTransfer1 dragAndDropNodestartDragAndDropTransfer1Serializer = getpostalcode2.serializer();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(getpostalcode2, modifierM20backgroundbw27NRU);
            ComposeUiNode.Companion companion3 = ComposeUiNode.Companion;
            r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 constructor = companion3.getConstructor();
            if (getaddresscountry != null) {
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
                if ((i2 & 7168) == 2048) {
                    int i9 = serializer + 5;
                    write = i9 % Fields.SpotShadowColor;
                    int i10 = i9 % 2;
                    z3 = true;
                } else {
                    z3 = false;
                }
                Object objComponentActivity = getpostalcode2.ComponentActivity();
                if (z3 || objComponentActivity == getCreditCardExpirationMonth.write) {
                    objComponentActivity = new b1$$ExternalSyntheticLambda0(12, r8lambdardpfsr94j4iebcwx_kpqzpm8k1);
                    getpostalcode2.write(objComponentActivity);
                    int i11 = serializer + 119;
                    write = i11 % Fields.SpotShadowColor;
                    if (i11 % 2 != 0) {
                        int i12 = 4 % 5;
                    }
                }
                TextKt.m131TextNvy7gAk(strStringResource, ClickableKt.RemoteActionCompatParcelizer(companion4, false, null, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) objComponentActivity, 15), jM759getWhite0d7_KjU, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, textStyle, getpostalcode2, 384, 0, 131064);
                getPostalCode getpostalcode3 = getpostalcode2;
                getpostalcode3.IconCompatParcelizer(true);
                Modifier modifierWrite2 = copyejIjP34.write(companion4, 1.0f);
                MeasurePolicy measurePolicy3 = BoxKt.read(companion2.getCenter(), false);
                int iHashCode4 = Long.hashCode(getpostalcode3.RatingCompat);
                DragAndDropNodestartDragAndDropTransfer1 dragAndDropNodestartDragAndDropTransfer1Serializer4 = getpostalcode3.serializer();
                Modifier modifierMaterializeModifier4 = ComposedModifierKt.materializeModifier(getpostalcode3, modifierWrite2);
                r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 constructor4 = companion3.getConstructor();
                getpostalcode3.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg();
                if (getpostalcode3.ComponentActivity) {
                    getpostalcode3.serializer(constructor4);
                } else {
                    getpostalcode3.r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28();
                }
                af$$ExternalSyntheticOutline0.m(companion3, getpostalcode3, measurePolicy3, getpostalcode3, dragAndDropNodestartDragAndDropTransfer1Serializer4);
                AndroidContentCaptureManagerCompanion.write(getpostalcode3, modifierMaterializeModifier4, m1$$ExternalSyntheticOutline0.m(companion3, getpostalcode3, Integer.valueOf(iHashCode4), getpostalcode3));
                Painter painterPainterResource = PainterResources_androidKt.painterResource(R.drawable.ic_bold_large_camera_union, getpostalcode3, 0);
                Modifier modifierRemoteActionCompatParcelizer2 = ClickableKt.RemoteActionCompatParcelizer(SizeKt.m84sizeVpY3zN4(companion4, Dimensions.onCreate, Dimensions.onMenuItemSelected), false, null, r8lambdardpfsr94j4iebcwx_kpqzpm8k2, 15);
                modifierRemoteActionCompatParcelizer2.getClass();
                int i13 = Painter.$stable | 48;
                ImageKt.Image(painterPainterResource, "Camera click button", modifierRemoteActionCompatParcelizer2, null, null, 0.0f, null, getpostalcode3, i13, 120);
                getpostalcode3.IconCompatParcelizer(true);
                if (z) {
                    int i14 = serializer + 57;
                    write = i14 % Fields.SpotShadowColor;
                    int i15 = i14 % 2;
                    i3 = R.drawable.ic_bold_large_camera_flash_on;
                    if (i15 != 0) {
                        z4 = 0;
                        int i16 = 34 / 0;
                    } else {
                        z4 = 0;
                    }
                } else {
                    z4 = 0;
                    i3 = R.drawable.ic_bold_large_camera_flash_off;
                }
                Modifier modifierWrite3 = copyejIjP34.write(companion4, 1.0f);
                MeasurePolicy measurePolicy4 = BoxKt.read(companion2.getCenterEnd(), z4);
                int iHashCode5 = Long.hashCode(getpostalcode3.RatingCompat);
                DragAndDropNodestartDragAndDropTransfer1 dragAndDropNodestartDragAndDropTransfer1Serializer5 = getpostalcode3.serializer();
                Modifier modifierMaterializeModifier5 = ComposedModifierKt.materializeModifier(getpostalcode3, modifierWrite3);
                r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 constructor5 = companion3.getConstructor();
                getpostalcode3.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg();
                if (getpostalcode3.ComponentActivity) {
                    getpostalcode3.serializer(constructor5);
                } else {
                    getpostalcode3.r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28();
                }
                af$$ExternalSyntheticOutline0.m(companion3, getpostalcode3, measurePolicy4, getpostalcode3, dragAndDropNodestartDragAndDropTransfer1Serializer5);
                AndroidContentCaptureManagerCompanion.write(getpostalcode3, modifierMaterializeModifier5, m1$$ExternalSyntheticOutline0.m(companion3, getpostalcode3, Integer.valueOf(iHashCode5), getpostalcode3));
                if (z2) {
                    getpostalcode3.serializer(643268953);
                    ImageKt.Image(PainterResources_androidKt.painterResource(i3, getpostalcode3, z4), "Flash toggle", ClickableKt.RemoteActionCompatParcelizer(companion4, z4, null, r8lambdardpfsr94j4iebcwx_kpqzpm8k0, 15), null, null, 0.0f, null, getpostalcode3, i13, 120);
                    getpostalcode3.IconCompatParcelizer(z4);
                } else {
                    getpostalcode3.serializer(643544016);
                    getpostalcode3.IconCompatParcelizer(z4);
                    Timber.RemoteActionCompatParcelizer.read(new IllegalStateException("InAppCameraWithTags: Flash feature is unavailable."));
                }
                af$$ExternalSyntheticOutline0.m(getpostalcode3, true, true, true);
                getpostalcode = getpostalcode3;
            } else {
                SentryUUID.write();
                throw null;
            }
        } else {
            getPostalCode getpostalcode4 = getpostalcode2;
            getpostalcode4.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
            getpostalcode = getpostalcode4;
        }
        getHandleruiannotations gethandleruiannotationsMediaDescriptionCompat = getpostalcode.MediaDescriptionCompat();
        if (gethandleruiannotationsMediaDescriptionCompat != null) {
            gethandleruiannotationsMediaDescriptionCompat.serializer = new getui_text(z, z2, r8lambdardpfsr94j4iebcwx_kpqzpm8k0, r8lambdardpfsr94j4iebcwx_kpqzpm8k1, r8lambdardpfsr94j4iebcwx_kpqzpm8k2, modifier, i, 1);
        }
    }
}
