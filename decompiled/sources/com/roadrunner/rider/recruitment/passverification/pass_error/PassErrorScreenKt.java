package com.roadrunner.rider.recruitment.passverification.pass_error;

import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.material3.TextKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Fields;
import androidx.compose.ui.graphics.RectangleShapeKt;
import androidx.compose.ui.graphics.painter.Painter;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.res.PainterResources_androidKt;
import androidx.compose.ui.res.StringResources_androidKt;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.unit.Dp;
import bo.app.c8$$ExternalSyntheticOutline0;
import bo.app.d$$ExternalSyntheticOutline0;
import bo.app.m1$$ExternalSyntheticOutline0;
import coil3.ExtrasKt;
import com.incognia.internal.pcn;
import com.logistics.rider.glovo.R;
import com.roadrunner.designsystem.compose.theme.tokens.Dimensions;
import com.roadrunner.rrds.compose.component.buttons.TertiaryKt;
import com.roadrunner.rrds.compose.component.navigations.HeaderKt;
import io.sentry.SentryUUID;
import o.AndroidContentCaptureManagerCompanion;
import o.DragAndDropNodestartDragAndDropTransfer1;
import o.FlingCancellationException;
import o.ModalBottomSheetKtModalBottomSheet311;
import o.ModalBottomSheetYbuCTN8;
import o.buildMapping;
import o.fromString;
import o.getActivityKind;
import o.getAddressCountry;
import o.getBirthDateFull;
import o.getClickTimeInSeconds;
import o.getClickTimeServerInSeconds;
import o.getHandleruiannotations;
import o.getNewPassword;
import o.getPostalCode;
import o.handleUrlOverridelambda1;
import o.p7;
import o.performLayout;
import o.performMeasureDjhGOtQ;
import o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0;
import o.setCurrentSemanticsNodesui;
import o.show;
import o.trigger;

/* JADX INFO: loaded from: classes3.dex */
public abstract class PassErrorScreenKt {
    private static int serializer = 1;
    private static int write;

    /* JADX WARN: Code duplicated, block: B:41:0x00b1 A[PHI: r6 r7
  0x00b1: PHI (r6v11 androidx.compose.ui.Modifier$Companion) = (r6v10 androidx.compose.ui.Modifier$Companion), (r6v15 androidx.compose.ui.Modifier$Companion) binds: [B:40:0x00af, B:37:0x00a2] A[DONT_GENERATE, DONT_INLINE]
  0x00b1: PHI (r7v6 int) = (r7v5 int), (r7v13 int) binds: [B:40:0x00af, B:37:0x00a2] A[DONT_GENERATE, DONT_INLINE]] */
    public static final void PassErrorScreen(fromString fromstring, Modifier modifier, r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k0, r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k1, getBirthDateFull getbirthdatefull, int i) {
        int i2;
        Modifier modifier2;
        Modifier.Companion companion;
        int i3;
        getClickTimeInSeconds getclicktimeinseconds;
        int i4;
        int i5;
        int i6 = 2 % 2;
        fromstring.getClass();
        getPostalCode getpostalcode = (getPostalCode) getbirthdatefull;
        getpostalcode.MediaSessionCompatQueueItem(106068027);
        if ((i & 6) == 0) {
            i2 = (getpostalcode.read(fromstring.ordinal()) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        int i7 = i2 | 48;
        if ((i & 384) == 0) {
            int i8 = write + 17;
            serializer = i8 % Fields.SpotShadowColor;
            int i9 = i8 % 2;
            if (getpostalcode.IconCompatParcelizer(r8lambdardpfsr94j4iebcwx_kpqzpm8k0)) {
                int i10 = write + 107;
                serializer = i10 % Fields.SpotShadowColor;
                i5 = i10 % 2 == 0 ? 23789 : Fields.RotationX;
            } else {
                i5 = Fields.SpotShadowColor;
            }
            i7 |= i5;
        }
        if ((i & 3072) == 0) {
            if (getpostalcode.IconCompatParcelizer(r8lambdardpfsr94j4iebcwx_kpqzpm8k1)) {
                i4 = Fields.CameraDistance;
            } else {
                int i11 = write + 117;
                serializer = i11 % Fields.SpotShadowColor;
                int i12 = i11 % 2;
                i4 = Fields.RotationZ;
            }
            i7 |= i4;
            int i13 = serializer + 99;
            write = i13 % Fields.SpotShadowColor;
            int i14 = i13 % 2;
        }
        if (getpostalcode.write(i7 & 1, !((i7 & 1171) == 1170))) {
            int i15 = serializer + 113;
            write = i15 % Fields.SpotShadowColor;
            if (i15 % 2 != 0) {
                companion = Modifier.Companion;
                i3 = getClickTimeServerInSeconds.write[fromstring.ordinal()];
                if (i3 != 1) {
                    if (i3 == 2 && i3 != 3 && i3 != 4) {
                        if (i3 != 5) {
                            throw d$$ExternalSyntheticOutline0.m(getpostalcode, 2051824793, false);
                        }
                        getpostalcode.serializer(2051839671);
                        getclicktimeinseconds = new getClickTimeInSeconds(StringResources_androidKt.stringResource(R.string.pass_error_no_baemin_acc_title, getpostalcode, 0), StringResources_androidKt.stringResource(R.string.pass_error_no_baemin_acc_description, getpostalcode, 0), StringResources_androidKt.stringResource(R.string.pass_error_no_baemin_acc_button, getpostalcode, 0));
                        getpostalcode.IconCompatParcelizer(false);
                    }
                }
                Modifier.Companion companion2 = companion;
                PassErrorContent((i7 << 6) & 523264, getpostalcode, companion2, getclicktimeinseconds.RemoteActionCompatParcelizer, getclicktimeinseconds.IconCompatParcelizer, getclicktimeinseconds.read, r8lambdardpfsr94j4iebcwx_kpqzpm8k0, r8lambdardpfsr94j4iebcwx_kpqzpm8k1);
                modifier2 = companion2;
            } else {
                companion = Modifier.Companion;
                i3 = getClickTimeServerInSeconds.write[fromstring.ordinal()];
                if (i3 != 1) {
                    if (i3 == 2) {
                    }
                }
                Modifier.Companion companion3 = companion;
                PassErrorContent((i7 << 6) & 523264, getpostalcode, companion3, getclicktimeinseconds.RemoteActionCompatParcelizer, getclicktimeinseconds.IconCompatParcelizer, getclicktimeinseconds.read, r8lambdardpfsr94j4iebcwx_kpqzpm8k0, r8lambdardpfsr94j4iebcwx_kpqzpm8k1);
                modifier2 = companion3;
            }
            getpostalcode.serializer(2051830029);
            getclicktimeinseconds = new getClickTimeInSeconds(StringResources_androidKt.stringResource(R.string.pass_error_title, getpostalcode, 0), StringResources_androidKt.stringResource(R.string.pass_error_description, getpostalcode, 0), StringResources_androidKt.stringResource(R.string.pass_error_button, getpostalcode, 0));
            getpostalcode.IconCompatParcelizer(false);
            Modifier.Companion companion4 = companion;
            PassErrorContent((i7 << 6) & 523264, getpostalcode, companion4, getclicktimeinseconds.RemoteActionCompatParcelizer, getclicktimeinseconds.IconCompatParcelizer, getclicktimeinseconds.read, r8lambdardpfsr94j4iebcwx_kpqzpm8k0, r8lambdardpfsr94j4iebcwx_kpqzpm8k1);
            modifier2 = companion4;
        } else {
            getpostalcode.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
            modifier2 = modifier;
        }
        getHandleruiannotations gethandleruiannotationsMediaDescriptionCompat = getpostalcode.MediaDescriptionCompat();
        if (gethandleruiannotationsMediaDescriptionCompat != null) {
            gethandleruiannotationsMediaDescriptionCompat.serializer = new p7(fromstring, modifier2, r8lambdardpfsr94j4iebcwx_kpqzpm8k0, r8lambdardpfsr94j4iebcwx_kpqzpm8k1, i, 15);
        }
    }

    public static final void PassErrorContent(int i, getBirthDateFull getbirthdatefull, Modifier modifier, String str, String str2, String str3, r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k0, r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k1) {
        int i2;
        boolean z;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7 = 2 % 2;
        str.getClass();
        str2.getClass();
        getPostalCode getpostalcode = (getPostalCode) getbirthdatefull;
        getpostalcode.MediaSessionCompatQueueItem(-2082133584);
        getAddressCountry getaddresscountry = getpostalcode.read;
        if ((i & 6) == 0) {
            if (getpostalcode.read(str)) {
                int i8 = write + 107;
                serializer = i8 % Fields.SpotShadowColor;
                i6 = i8 % 2 == 0 ? 5 : 4;
            } else {
                i6 = 2;
            }
            i2 = i6 | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            int i9 = write + 15;
            serializer = i9 % Fields.SpotShadowColor;
            if (i9 % 2 == 0) {
                getpostalcode.read(str2);
                throw null;
            }
            if (getpostalcode.read(str2)) {
                int i10 = serializer + 81;
                write = i10 % Fields.SpotShadowColor;
                int i11 = i10 % 2;
                i5 = 32;
            } else {
                i5 = 16;
            }
            i2 |= i5;
        }
        if ((i & 384) == 0) {
            if (getpostalcode.read(str3)) {
                int i12 = write + 63;
                serializer = i12 % Fields.SpotShadowColor;
                int i13 = i12 % 2;
                i4 = Fields.RotationX;
            } else {
                i4 = Fields.SpotShadowColor;
            }
            i2 |= i4;
        }
        if ((i & 3072) == 0) {
            i2 |= getpostalcode.read(modifier) ? Fields.CameraDistance : Fields.RotationZ;
        }
        if ((i & 24576) == 0) {
            i2 |= getpostalcode.IconCompatParcelizer(r8lambdardpfsr94j4iebcwx_kpqzpm8k0) ? Fields.Clip : 8192;
        }
        if ((196608 & i) == 0) {
            int i14 = serializer + 107;
            write = i14 % Fields.SpotShadowColor;
            if (i14 % 2 != 0) {
                getpostalcode.IconCompatParcelizer(r8lambdardpfsr94j4iebcwx_kpqzpm8k1);
                throw null;
            }
            if (getpostalcode.IconCompatParcelizer(r8lambdardpfsr94j4iebcwx_kpqzpm8k1)) {
                i3 = Fields.RenderEffect;
            } else {
                int i15 = serializer + 123;
                write = i15 % Fields.SpotShadowColor;
                int i16 = i15 % 2;
                i3 = 65536;
            }
            i2 |= i3;
        }
        int i17 = i2;
        if ((i17 & 74899) != 74898) {
            int i18 = write + 83;
            serializer = i18 % Fields.SpotShadowColor;
            int i19 = i18 % 2;
            z = true;
        } else {
            z = false;
        }
        if (getpostalcode.write(i17 & 1, z)) {
            Modifier modifierThen = modifier.then(SizeKt.read);
            setCurrentSemanticsNodesui setcurrentsemanticsnodesui = performMeasureDjhGOtQ.RemoteActionCompatParcelizer;
            Modifier modifierM20backgroundbw27NRU = BackgroundKt.m20backgroundbw27NRU(modifierThen, ((buildMapping) getpostalcode.write((getNewPassword) setcurrentsemanticsnodesui)).IconCompatParcelizer(), RectangleShapeKt.getRectangleShape());
            FlingCancellationException flingCancellationException = Arrangement.MediaDescriptionCompat;
            Alignment.Companion companion = Alignment.Companion;
            ModalBottomSheetYbuCTN8 modalBottomSheetYbuCTN8Serializer = ModalBottomSheetKtModalBottomSheet311.serializer(flingCancellationException, companion.getStart(), getpostalcode, 0);
            int iHashCode = Long.hashCode(getpostalcode.RatingCompat);
            DragAndDropNodestartDragAndDropTransfer1 dragAndDropNodestartDragAndDropTransfer1Serializer = getpostalcode.serializer();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(getpostalcode, modifierM20backgroundbw27NRU);
            ComposeUiNode.Companion companion2 = ComposeUiNode.Companion;
            r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 constructor = companion2.getConstructor();
            if (getaddresscountry == null) {
                SentryUUID.write();
                throw null;
            }
            getpostalcode.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg();
            if (getpostalcode.ComponentActivity) {
                getpostalcode.serializer(constructor);
            } else {
                getpostalcode.r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28();
            }
            c8$$ExternalSyntheticOutline0.m(companion2, getpostalcode, modalBottomSheetYbuCTN8Serializer, getpostalcode, dragAndDropNodestartDragAndDropTransfer1Serializer);
            AndroidContentCaptureManagerCompanion.write(getpostalcode, modifierMaterializeModifier, m1$$ExternalSyntheticOutline0.m(companion2, getpostalcode, Integer.valueOf(iHashCode), getpostalcode));
            HeaderKt.RemoteActionCompatParcelizer(null, null, 0L, ExtrasKt.write(-305162393, new trigger(14, r8lambdardpfsr94j4iebcwx_kpqzpm8k0), getpostalcode), null, null, getpostalcode, 24576, 111);
            Modifier.Companion companion3 = Modifier.Companion;
            Modifier modifierM73paddingVpY3zN4$default = PaddingKt.m73paddingVpY3zN4$default(SizeKt.write(companion3.then(new show(1.0f, true)), 1.0f), Dimensions.getAnimatedVisibility, 0.0f, 2);
            ModalBottomSheetYbuCTN8 modalBottomSheetYbuCTN8Serializer2 = ModalBottomSheetKtModalBottomSheet311.serializer(Arrangement.IconCompatParcelizer, companion.getCenterHorizontally(), getpostalcode, 54);
            int iHashCode2 = Long.hashCode(getpostalcode.RatingCompat);
            DragAndDropNodestartDragAndDropTransfer1 dragAndDropNodestartDragAndDropTransfer1Serializer2 = getpostalcode.serializer();
            Modifier modifierMaterializeModifier2 = ComposedModifierKt.materializeModifier(getpostalcode, modifierM73paddingVpY3zN4$default);
            r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 constructor2 = companion2.getConstructor();
            getpostalcode.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg();
            if (getpostalcode.ComponentActivity) {
                getpostalcode.serializer(constructor2);
            } else {
                getpostalcode.r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28();
            }
            c8$$ExternalSyntheticOutline0.m(companion2, getpostalcode, modalBottomSheetYbuCTN8Serializer2, getpostalcode, dragAndDropNodestartDragAndDropTransfer1Serializer2);
            AndroidContentCaptureManagerCompanion.write(getpostalcode, modifierMaterializeModifier2, m1$$ExternalSyntheticOutline0.m(companion2, getpostalcode, Integer.valueOf(iHashCode2), getpostalcode));
            ImageKt.Image(PainterResources_androidKt.painterResource(R.drawable.img_small_brand_not_found, getpostalcode, 0), null, SizeKt.m83size3ABfNKs(companion3, Dp.m3673constructorimpl(160.0f)), null, null, 0.0f, null, getpostalcode, Painter.$stable | 432, 120);
            ExtrasKt.read(913837329, handleUrlOverridelambda1.RemoteActionCompatParcelizer(), handleUrlOverridelambda1.RemoteActionCompatParcelizer(), -913837326, handleUrlOverridelambda1.RemoteActionCompatParcelizer(), handleUrlOverridelambda1.RemoteActionCompatParcelizer(), new Object[]{getpostalcode, SizeKt.m75height3ABfNKs(companion3, Dimensions.setStackedBackground)});
            TextStyle textStyle = (TextStyle) performLayout.read(925764871, pcn.serializer(), new Object[0], -925764870, pcn.serializer(), pcn.serializer(), pcn.serializer());
            FontWeight bold = FontWeight.Companion.getBold();
            TextAlign.Companion companion4 = TextAlign.Companion;
            TextKt.m131TextNvy7gAk(str, null, ((buildMapping) getpostalcode.write((getNewPassword) setcurrentsemanticsnodesui)).WindowCallbackWrapper(), 0L, bold, null, 0L, TextAlign.m3504boximpl(companion4.m3511getCentere0LSkKk()), 0L, 0, false, 0, 0, null, textStyle, getpostalcode, (i17 & 14) | 1572864, 0, 129978);
            float f = Dimensions.setSplitBackground;
            ExtrasKt.read(913837329, handleUrlOverridelambda1.RemoteActionCompatParcelizer(), handleUrlOverridelambda1.RemoteActionCompatParcelizer(), -913837326, handleUrlOverridelambda1.RemoteActionCompatParcelizer(), handleUrlOverridelambda1.RemoteActionCompatParcelizer(), new Object[]{getpostalcode, SizeKt.m75height3ABfNKs(companion3, f)});
            TextKt.m131TextNvy7gAk(str2, null, ((buildMapping) getpostalcode.write((getNewPassword) setcurrentsemanticsnodesui)).setPresenter(), 0L, null, null, 0L, TextAlign.m3504boximpl(companion4.m3511getCentere0LSkKk()), 0L, 0, false, 0, 0, null, performLayout.write(), getpostalcode, (i17 >> 3) & 14, 0, 130042);
            if (str3 != null) {
                getpostalcode.serializer(2064689756);
                ExtrasKt.read(913837329, handleUrlOverridelambda1.RemoteActionCompatParcelizer(), handleUrlOverridelambda1.RemoteActionCompatParcelizer(), -913837326, handleUrlOverridelambda1.RemoteActionCompatParcelizer(), handleUrlOverridelambda1.RemoteActionCompatParcelizer(), new Object[]{getpostalcode, SizeKt.m75height3ABfNKs(companion3, f)});
                TertiaryKt.IconCompatParcelizer(str3, r8lambdardpfsr94j4iebcwx_kpqzpm8k1, null, false, 0, null, null, null, getpostalcode, ((i17 >> 6) & 14) | ((i17 >> 12) & 112), 252);
                getpostalcode.IconCompatParcelizer(false);
            } else {
                getpostalcode.serializer(2064906942);
                getpostalcode.IconCompatParcelizer(false);
            }
            int i20 = write + 37;
            serializer = i20 % Fields.SpotShadowColor;
            int i21 = i20 % 2;
            getpostalcode.IconCompatParcelizer(true);
            getpostalcode.IconCompatParcelizer(true);
        } else {
            getpostalcode.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
        }
        getHandleruiannotations gethandleruiannotationsMediaDescriptionCompat = getpostalcode.MediaDescriptionCompat();
        if (gethandleruiannotationsMediaDescriptionCompat != null) {
            gethandleruiannotationsMediaDescriptionCompat.serializer = new getActivityKind(str, str2, str3, modifier, r8lambdardpfsr94j4iebcwx_kpqzpm8k0, r8lambdardpfsr94j4iebcwx_kpqzpm8k1, i);
        }
    }
}
