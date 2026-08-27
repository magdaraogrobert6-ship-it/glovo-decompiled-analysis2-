package com.roadrunner.settings.ui.components;

import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.material3.IconKt;
import androidx.compose.material3.TextKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Fields;
import androidx.compose.ui.graphics.painter.Painter;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.res.PainterResources_androidKt;
import androidx.compose.ui.text.AnnotatedString;
import bo.app.c8$$ExternalSyntheticOutline0;
import bo.app.m1$$ExternalSyntheticOutline0;
import coil3.ExtrasKt;
import com.logistics.rider.glovo.R;
import com.roadrunner.designsystem.compose.theme.tokens.Dimensions;
import com.roadrunner.rrds.compose.component.buttons.TertiaryKt;
import io.sentry.SentryUUID;
import o.AndroidContentCaptureManagerCompanion;
import o.DragAndDropNodestartDragAndDropTransfer1;
import o.ModalBottomSheetKtModalBottomSheet311;
import o.ModalBottomSheetYbuCTN8;
import o.TextFieldDefaults;
import o.buildMapping;
import o.getAddressCountry;
import o.getAndroidType;
import o.getBirthDateFull;
import o.getHandleruiannotations;
import o.getNewPassword;
import o.getPostalCode;
import o.handleUrlOverridelambda1;
import o.performLayout;
import o.performMeasureDjhGOtQ;
import o.r8lambda4OvXzM2G3U08xdmIsvfVqgmSBTg;
import o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0;
import o.r8lambdaZJefYWkAb6Rz_mRy9JTC1Xi8DDk;
import o.r8lambdaZmWJ7_kmLiTuhtIga_c7SGMfvU;
import o.r8lambdafvzP3Wky1RLLzE56uVXaMHcvU;
import o.setCurrentSemanticsNodesui;
import o.supportingTextPaddinga9UjIt4material3default;

/* JADX INFO: loaded from: classes3.dex */
public abstract class AppVersionKt {
    private static int IconCompatParcelizer = 1;
    private static int read;

    /* JADX WARN: Code duplicated, block: B:58:0x00d7  */
    /* JADX WARN: Code duplicated, block: B:59:0x00da  */
    public static final void AppVersion(AnnotatedString annotatedString, String str, String str2, boolean z, r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k0, Modifier modifier, getBirthDateFull getbirthdatefull, int i) {
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9 = 2 % 2;
        annotatedString.getClass();
        r8lambdardpfsr94j4iebcwx_kpqzpm8k0.getClass();
        getPostalCode getpostalcode = (getPostalCode) getbirthdatefull;
        getpostalcode.MediaSessionCompatQueueItem(1120710016);
        if ((i & 6) == 0) {
            if (getpostalcode.read(annotatedString)) {
                int i10 = IconCompatParcelizer + 7;
                read = i10 % Fields.SpotShadowColor;
                int i11 = i10 % 2;
                i8 = 4;
            } else {
                i8 = 2;
            }
            i2 = i8 | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            if (getpostalcode.read(str)) {
                int i12 = IconCompatParcelizer + 25;
                read = i12 % Fields.SpotShadowColor;
                int i13 = i12 % 2;
                i7 = 32;
            } else {
                i7 = 16;
            }
            i2 |= i7;
        }
        if ((i & 384) == 0) {
            if (getpostalcode.read(str2)) {
                int i14 = IconCompatParcelizer + 5;
                read = i14 % Fields.SpotShadowColor;
                i6 = i14 % 2 != 0 ? 15335 : Fields.RotationX;
            } else {
                i6 = Fields.SpotShadowColor;
            }
            i2 |= i6;
        }
        if ((i & 3072) == 0) {
            if (getpostalcode.write(z)) {
                int i15 = read + 49;
                IconCompatParcelizer = i15 % Fields.SpotShadowColor;
                i5 = i15 % 2 == 0 ? 19793 : Fields.CameraDistance;
            } else {
                i5 = Fields.RotationZ;
            }
            i2 |= i5;
        }
        if ((i & 24576) == 0) {
            if (getpostalcode.IconCompatParcelizer(r8lambdardpfsr94j4iebcwx_kpqzpm8k0)) {
                int i16 = read + 15;
                IconCompatParcelizer = i16 % Fields.SpotShadowColor;
                i4 = i16 % 2 == 0 ? 11903 : Fields.Clip;
            } else {
                i4 = 8192;
            }
            i2 |= i4;
        }
        if ((196608 & i) == 0) {
            int i17 = read + 107;
            IconCompatParcelizer = i17 % Fields.SpotShadowColor;
            if (i17 % 2 == 0) {
                int i18 = 24 / 0;
                if (getpostalcode.read(modifier)) {
                    i3 = Fields.RenderEffect;
                } else {
                    i3 = 65536;
                }
            } else if (!getpostalcode.read(modifier)) {
                i3 = 65536;
            } else {
                i3 = Fields.RenderEffect;
            }
            i2 |= i3;
        }
        if (!getpostalcode.write(i2 & 1, (74899 & i2) != 74898)) {
            getpostalcode.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
        } else {
            int i19 = IconCompatParcelizer + 111;
            read = i19 % Fields.SpotShadowColor;
            int i20 = i19 % 2;
            Alignment.Horizontal centerHorizontally = Alignment.Companion.getCenterHorizontally();
            float f = Dimensions.setTabContainer;
            Modifier modifierWrite = SizeKt.write(PaddingKt.RemoteActionCompatParcelizer(modifier, Dimensions.getAnimatedVisibility, f), 1.0f);
            ModalBottomSheetYbuCTN8 modalBottomSheetYbuCTN8Serializer = ModalBottomSheetKtModalBottomSheet311.serializer(Arrangement.MediaDescriptionCompat, centerHorizontally, getpostalcode, 48);
            int iHashCode = Long.hashCode(getpostalcode.RatingCompat);
            DragAndDropNodestartDragAndDropTransfer1 dragAndDropNodestartDragAndDropTransfer1Serializer = getpostalcode.serializer();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(getpostalcode, modifierWrite);
            ComposeUiNode.Companion companion = ComposeUiNode.Companion;
            r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 constructor = companion.getConstructor();
            if (getpostalcode.read == null) {
                SentryUUID.write();
                throw null;
            }
            int i21 = IconCompatParcelizer + 23;
            read = i21 % Fields.SpotShadowColor;
            int i22 = i21 % 2;
            getpostalcode.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg();
            if (getpostalcode.ComponentActivity) {
                getpostalcode.serializer(constructor);
            } else {
                getpostalcode.r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28();
            }
            c8$$ExternalSyntheticOutline0.m(companion, getpostalcode, modalBottomSheetYbuCTN8Serializer, getpostalcode, dragAndDropNodestartDragAndDropTransfer1Serializer);
            AndroidContentCaptureManagerCompanion.write(getpostalcode, modifierMaterializeModifier, m1$$ExternalSyntheticOutline0.m(companion, getpostalcode, Integer.valueOf(iHashCode), getpostalcode));
            TextKt.m132TextZ58ophY(annotatedString, null, ((buildMapping) getpostalcode.write((getNewPassword) performMeasureDjhGOtQ.RemoteActionCompatParcelizer)).setPresenter(), 0L, null, 0L, null, 0L, 0, false, 0, 0, null, null, performLayout.write(), getpostalcode, i2 & 14, 0, 262138);
            if (z) {
                getpostalcode.serializer(2029784287);
                ExtrasKt.read(913837329, handleUrlOverridelambda1.RemoteActionCompatParcelizer(), handleUrlOverridelambda1.RemoteActionCompatParcelizer(), -913837326, handleUrlOverridelambda1.RemoteActionCompatParcelizer(), handleUrlOverridelambda1.RemoteActionCompatParcelizer(), new Object[]{getpostalcode, SizeKt.m75height3ABfNKs(Modifier.Companion, f)});
                UpdateButton(str, str2, r8lambdardpfsr94j4iebcwx_kpqzpm8k0, null, getpostalcode, ((i2 >> 3) & 126) | ((i2 >> 6) & 896));
                getpostalcode.IconCompatParcelizer(false);
            } else {
                getpostalcode.serializer(2030042796);
                getpostalcode.IconCompatParcelizer(false);
            }
            int i23 = read + 35;
            IconCompatParcelizer = i23 % Fields.SpotShadowColor;
            int i24 = i23 % 2;
            getpostalcode.IconCompatParcelizer(true);
        }
        getHandleruiannotations gethandleruiannotationsMediaDescriptionCompat = getpostalcode.MediaDescriptionCompat();
        if (gethandleruiannotationsMediaDescriptionCompat != null) {
            gethandleruiannotationsMediaDescriptionCompat.serializer = new getAndroidType(annotatedString, str, str2, z, r8lambdardpfsr94j4iebcwx_kpqzpm8k0, modifier, i);
        }
    }

    public static final void AppVersion(r8lambda4OvXzM2G3U08xdmIsvfVqgmSBTg r8lambda4ovxzm2g3u08xdmisvfvqgmsbtg, r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k0, Modifier modifier, getBirthDateFull getbirthdatefull, int i) {
        int i2;
        Modifier modifier2;
        int i3;
        int i4 = 2 % 2;
        r8lambdardpfsr94j4iebcwx_kpqzpm8k0.getClass();
        getPostalCode getpostalcode = (getPostalCode) getbirthdatefull;
        getpostalcode.MediaSessionCompatQueueItem(-638024885);
        if ((i & 6) == 0) {
            if (getpostalcode.read(r8lambda4ovxzm2g3u08xdmisvfvqgmsbtg)) {
                int i5 = IconCompatParcelizer + 43;
                read = i5 % Fields.SpotShadowColor;
                int i6 = i5 % 2;
                i3 = 4;
            } else {
                int i7 = IconCompatParcelizer + 107;
                read = i7 % Fields.SpotShadowColor;
                int i8 = i7 % 2;
                i3 = 2;
            }
            i2 = i | i3;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            int i9 = read + 9;
            IconCompatParcelizer = i9 % Fields.SpotShadowColor;
            int i10 = i9 % 2;
            i2 |= getpostalcode.IconCompatParcelizer(r8lambdardpfsr94j4iebcwx_kpqzpm8k0) ? 32 : 16;
        }
        int i11 = i2 | 384;
        if (getpostalcode.write(i11 & 1, (i11 & 147) != 146)) {
            int i12 = IconCompatParcelizer + 29;
            read = i12 % Fields.SpotShadowColor;
            int i13 = i12 % 2;
            Modifier.Companion companion = Modifier.Companion;
            AppVersion(r8lambda4ovxzm2g3u08xdmisvfvqgmsbtg.RemoteActionCompatParcelizer, r8lambda4ovxzm2g3u08xdmisvfvqgmsbtg.serializer, r8lambda4ovxzm2g3u08xdmisvfvqgmsbtg.read, r8lambda4ovxzm2g3u08xdmisvfvqgmsbtg.write, r8lambdardpfsr94j4iebcwx_kpqzpm8k0, companion, getpostalcode, (i11 << 9) & 516096);
            modifier2 = companion;
        } else {
            getpostalcode.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
            modifier2 = modifier;
        }
        getHandleruiannotations gethandleruiannotationsMediaDescriptionCompat = getpostalcode.MediaDescriptionCompat();
        if (gethandleruiannotationsMediaDescriptionCompat != null) {
            gethandleruiannotationsMediaDescriptionCompat.serializer = new r8lambdaZmWJ7_kmLiTuhtIga_c7SGMfvU(i, 0, r8lambda4ovxzm2g3u08xdmisvfvqgmsbtg, r8lambdardpfsr94j4iebcwx_kpqzpm8k0, modifier2);
            int i14 = read + 105;
            IconCompatParcelizer = i14 % Fields.SpotShadowColor;
            int i15 = i14 % 2;
        }
    }

    public static final void UpdateButton(String str, String str2, r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k0, Modifier modifier, getBirthDateFull getbirthdatefull, int i) {
        int i2;
        getPostalCode getpostalcode;
        Modifier modifier2;
        int i3;
        int i4 = 2 % 2;
        r8lambdardpfsr94j4iebcwx_kpqzpm8k0.getClass();
        getPostalCode getpostalcode2 = (getPostalCode) getbirthdatefull;
        getpostalcode2.MediaSessionCompatQueueItem(-793299051);
        getAddressCountry getaddresscountry = getpostalcode2.read;
        if ((i & 6) == 0) {
            i2 = (getpostalcode2.read(str) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            if (getpostalcode2.read(str2)) {
                i3 = 32;
            } else {
                int i5 = IconCompatParcelizer + 35;
                read = i5 % Fields.SpotShadowColor;
                int i6 = i5 % 2;
                i3 = 16;
            }
            i2 |= i3;
        }
        if ((i & 384) == 0) {
            int i7 = IconCompatParcelizer + 103;
            read = i7 % Fields.SpotShadowColor;
            if (i7 % 2 != 0) {
                getpostalcode2.IconCompatParcelizer(r8lambdardpfsr94j4iebcwx_kpqzpm8k0);
                throw null;
            }
            i2 |= getpostalcode2.IconCompatParcelizer(r8lambdardpfsr94j4iebcwx_kpqzpm8k0) ? Fields.RotationX : Fields.SpotShadowColor;
        }
        int i8 = i2 | 3072;
        if (!(!getpostalcode2.write(i8 & 1, (i8 & 1171) != 1170))) {
            Modifier.Companion companion = Modifier.Companion;
            Alignment.Companion companion2 = Alignment.Companion;
            Alignment.Horizontal centerHorizontally = companion2.getCenterHorizontally();
            Modifier modifierWrite = SizeKt.write(companion, 1.0f);
            setCurrentSemanticsNodesui setcurrentsemanticsnodesui = performMeasureDjhGOtQ.RemoteActionCompatParcelizer;
            Modifier modifierM20backgroundbw27NRU = BackgroundKt.m20backgroundbw27NRU(modifierWrite, ((buildMapping) getpostalcode2.write((getNewPassword) setcurrentsemanticsnodesui)).serializer(), RoundedCornerShapeKt.IconCompatParcelizer(Dimensions.setItemInvoker));
            float f = Dimensions.setSplitBackground;
            float f2 = Dimensions.setPrimaryBackground;
            Modifier modifierM74paddingqDBjuR0$default = PaddingKt.m74paddingqDBjuR0$default(modifierM20backgroundbw27NRU, 0.0f, f, 0.0f, f2, 5);
            ModalBottomSheetYbuCTN8 modalBottomSheetYbuCTN8Serializer = ModalBottomSheetKtModalBottomSheet311.serializer(Arrangement.MediaDescriptionCompat, centerHorizontally, getpostalcode2, 48);
            int iHashCode = Long.hashCode(getpostalcode2.RatingCompat);
            DragAndDropNodestartDragAndDropTransfer1 dragAndDropNodestartDragAndDropTransfer1Serializer = getpostalcode2.serializer();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(getpostalcode2, modifierM74paddingqDBjuR0$default);
            ComposeUiNode.Companion companion3 = ComposeUiNode.Companion;
            r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 constructor = companion3.getConstructor();
            if (getaddresscountry == null) {
                SentryUUID.write();
                throw null;
            }
            int i9 = IconCompatParcelizer + 75;
            read = i9 % Fields.SpotShadowColor;
            if (i9 % 2 != 0) {
                getpostalcode2.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg();
                boolean z = getpostalcode2.ComponentActivity;
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
            supportingTextPaddinga9UjIt4material3default supportingtextpaddinga9ujit4material3defaultSerializer = TextFieldDefaults.serializer(Arrangement.MediaBrowserCompatMediaItem, companion2.getCenterVertically(), getpostalcode2, 48);
            int iHashCode2 = Long.hashCode(getpostalcode2.RatingCompat);
            DragAndDropNodestartDragAndDropTransfer1 dragAndDropNodestartDragAndDropTransfer1Serializer2 = getpostalcode2.serializer();
            Modifier modifierMaterializeModifier2 = ComposedModifierKt.materializeModifier(getpostalcode2, companion);
            r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 constructor2 = companion3.getConstructor();
            getpostalcode2.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg();
            if (getpostalcode2.ComponentActivity) {
                int i10 = read + 89;
                IconCompatParcelizer = i10 % Fields.SpotShadowColor;
                if (i10 % 2 == 0) {
                    getpostalcode2.serializer(constructor2);
                    Object obj = null;
                    obj.hashCode();
                    throw null;
                }
                getpostalcode2.serializer(constructor2);
            } else {
                getpostalcode2.r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28();
            }
            r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.read(companion3, getpostalcode2, supportingtextpaddinga9ujit4material3defaultSerializer, getpostalcode2, dragAndDropNodestartDragAndDropTransfer1Serializer2);
            AndroidContentCaptureManagerCompanion.write(getpostalcode2, modifierMaterializeModifier2, m1$$ExternalSyntheticOutline0.m(companion3, getpostalcode2, Integer.valueOf(iHashCode2), getpostalcode2));
            IconKt.m116Iconww6aTOc(PainterResources_androidKt.painterResource(R.drawable.ic_bold_medium_essentials_info_outline, getpostalcode2, 0), (String) null, (Modifier) null, ((buildMapping) getpostalcode2.write((getNewPassword) setcurrentsemanticsnodesui)).setPresenter(), getpostalcode2, Painter.$stable | 48, 4);
            ExtrasKt.read(913837329, handleUrlOverridelambda1.RemoteActionCompatParcelizer(), handleUrlOverridelambda1.RemoteActionCompatParcelizer(), -913837326, handleUrlOverridelambda1.RemoteActionCompatParcelizer(), handleUrlOverridelambda1.RemoteActionCompatParcelizer(), new Object[]{getpostalcode2, SizeKt.m86width3ABfNKs(companion, f2)});
            TextKt.m131TextNvy7gAk(str, null, 0L, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, null, getpostalcode2, i8 & 14, 0, 262142);
            getpostalcode2.IconCompatParcelizer(true);
            getpostalcode = getpostalcode2;
            TertiaryKt.IconCompatParcelizer(str2, r8lambdardpfsr94j4iebcwx_kpqzpm8k0, null, false, R.drawable.ic_bold_large_link_link, null, null, null, getpostalcode2, (i8 >> 3) & 126, 236);
            getpostalcode.IconCompatParcelizer(true);
            modifier2 = companion;
        } else {
            getpostalcode = getpostalcode2;
            getpostalcode.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
            modifier2 = modifier;
        }
        getHandleruiannotations gethandleruiannotationsMediaDescriptionCompat = getpostalcode.MediaDescriptionCompat();
        if (gethandleruiannotationsMediaDescriptionCompat != null) {
            gethandleruiannotationsMediaDescriptionCompat.serializer = new r8lambdaZJefYWkAb6Rz_mRy9JTC1Xi8DDk(str, str2, r8lambdardpfsr94j4iebcwx_kpqzpm8k0, modifier2, i, 0);
        }
    }
}
