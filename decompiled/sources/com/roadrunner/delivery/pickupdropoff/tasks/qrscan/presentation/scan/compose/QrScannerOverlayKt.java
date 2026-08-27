package com.roadrunner.delivery.pickupdropoff.tasks.qrscan.presentation.scan.compose;

import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.gestures.ScrollExtensionsKt$stopScroll$2;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.Arrangement$Center$1;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.material3.IconKt;
import androidx.compose.material3.TextKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Fields;
import androidx.compose.ui.graphics.painter.Painter;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.res.PainterResources_androidKt;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.unit.Dp;
import bo.app.af$$ExternalSyntheticOutline0;
import bo.app.c8$$ExternalSyntheticOutline0;
import bo.app.d$$ExternalSyntheticOutline0;
import bo.app.m1$$ExternalSyntheticOutline0;
import coil3.ExtrasKt;
import com.incognia.internal.pcn;
import com.logistics.rider.glovo.R;
import com.roadrunner.delivery.pickupdropoff.tasks.api.mapper.ButtonTypeTokenMapperKt;
import com.roadrunner.delivery.pickupdropoff.tasks.api.mapper.MessageBoxTypeTokenMapperKt;
import com.roadrunner.delivery.pickupdropoff.tasks.model.QrCodeScanTaskUiItem$QrScanScreen$Companion;
import com.roadrunner.delivery.state.pudo.ButtonTypeToken;
import com.roadrunner.designsystem.compose.theme.tokens.Dimensions;
import io.sentry.SentryUUID;
import o.AndroidContentCaptureManagerCompanion;
import o.ComposeAnimationState;
import o.DragAndDropNodestartDragAndDropTransfer1;
import o.ModalBottomSheetDialogWrapper;
import o.ModalBottomSheetKtModalBottomSheet311;
import o.ModalBottomSheetYbuCTN8;
import o.PreviewParameter;
import o.TextFieldDefaults;
import o.accessgetMaxcp;
import o.buildMapping;
import o.copyiSbpLlYdefault;
import o.createFromParcel;
import o.divBjo55l4;
import o.equalEnum;
import o.extractAuthorizationHeader;
import o.getAddressCountry;
import o.getBirthDateFull;
import o.getCreditCardExpirationMonth;
import o.getEllipsisgIe3tQ8;
import o.getHandleruiannotations;
import o.getNewPassword;
import o.getPhoneNumberNational;
import o.getPostalCode;
import o.getStore;
import o.handleUrlOverridelambda1;
import o.isEqualHuaweiReferrerAppGalleryDetails;
import o.mapTreeWithStitching;
import o.parseResponse;
import o.performLayout;
import o.performMeasureDjhGOtQ;
import o.plusqkQi6aY;
import o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0;
import o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0;
import o.r8lambdafvzP3Wky1RLLzE56uVXaMHcvU;
import o.setCurrentSemanticsNodesui;
import o.supportingTextPaddinga9UjIt4material3default;

/* JADX INFO: loaded from: classes3.dex */
public abstract class QrScannerOverlayKt {
    private static int read = 0;
    private static int write = 1;

    public static final void read(accessgetMaxcp accessgetmaxcp, PreviewParameter previewParameter, Modifier modifier, getBirthDateFull getbirthdatefull, int i) {
        int i2;
        Modifier modifier2;
        boolean zIconCompatParcelizer;
        int i3;
        int i4 = 2 % 2;
        accessgetmaxcp.getClass();
        previewParameter.getClass();
        getPostalCode getpostalcode = (getPostalCode) getbirthdatefull;
        getpostalcode.MediaSessionCompatQueueItem(1358649564);
        if ((i & 6) == 0) {
            int i5 = write + 11;
            read = i5 % Fields.SpotShadowColor;
            if (i5 % 2 != 0) {
                getpostalcode.IconCompatParcelizer(accessgetmaxcp);
                throw null;
            }
            i2 = i | (getpostalcode.IconCompatParcelizer(accessgetmaxcp) ? 4 : 2);
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            int i6 = read;
            int i7 = i6 + 111;
            write = i7 % Fields.SpotShadowColor;
            int i8 = i7 % 2;
            if ((i & 64) == 0) {
                int i9 = i6 + 35;
                write = i9 % Fields.SpotShadowColor;
                int i10 = i9 % 2;
                zIconCompatParcelizer = getpostalcode.read(previewParameter);
            } else {
                zIconCompatParcelizer = getpostalcode.IconCompatParcelizer(previewParameter);
            }
            if (zIconCompatParcelizer) {
                int i11 = read + 119;
                write = i11 % Fields.SpotShadowColor;
                i3 = i11 % 2 == 0 ? 78 : 32;
            } else {
                i3 = 16;
            }
            i2 |= i3;
        }
        int i12 = i2 | 384;
        if (getpostalcode.write(i12 & 1, (i12 & 147) != 146)) {
            Modifier.Companion companion = Modifier.Companion;
            if (!(!accessgetmaxcp.equals(divBjo55l4.RemoteActionCompatParcelizer))) {
                int i13 = write + 25;
                read = i13 % Fields.SpotShadowColor;
                int i14 = i13 % 2;
                getpostalcode.serializer(-7820640);
                getpostalcode.IconCompatParcelizer(false);
            } else if (accessgetmaxcp instanceof copyiSbpLlYdefault) {
                int i15 = read + 105;
                write = i15 % Fields.SpotShadowColor;
                int i16 = i15 % 2;
                getpostalcode.serializer(-242389680);
                mapTreeWithStitching maptreewithstitching = previewParameter.successMessage;
                MessageBoxTypeTokenMapperKt.read(maptreewithstitching.type, SizeKt.IconCompatParcelizer(companion, null, 3), maptreewithstitching.icon, maptreewithstitching.title, null, null, null, null, getpostalcode, 0, 240);
                getpostalcode.IconCompatParcelizer(false);
            } else {
                if (!(accessgetmaxcp instanceof plusqkQi6aY)) {
                    throw d$$ExternalSyntheticOutline0.m(getpostalcode, -7821586, false);
                }
                getpostalcode.serializer(-242046510);
                mapTreeWithStitching maptreewithstitching2 = previewParameter.errorMessage;
                MessageBoxTypeTokenMapperKt.read(maptreewithstitching2.type, SizeKt.IconCompatParcelizer(companion, null, 3), maptreewithstitching2.icon, maptreewithstitching2.title, null, null, null, null, getpostalcode, 48, 240);
                getpostalcode.IconCompatParcelizer(false);
            }
            int i17 = read + 103;
            write = i17 % Fields.SpotShadowColor;
            int i18 = i17 % 2;
            modifier2 = companion;
        } else {
            getpostalcode.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
            modifier2 = modifier;
        }
        getHandleruiannotations gethandleruiannotationsMediaDescriptionCompat = getpostalcode.MediaDescriptionCompat();
        if (gethandleruiannotationsMediaDescriptionCompat != null) {
            gethandleruiannotationsMediaDescriptionCompat.serializer = new getStore(i, 29, accessgetmaxcp, previewParameter, modifier2);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v4, types: [androidx.compose.ui.Modifier$Companion] */
    /* JADX WARN: Type inference failed for: r3v2 */
    /* JADX WARN: Type inference failed for: r3v3, types: [androidx.compose.ui.Modifier] */
    public static final void TopControlBar(boolean z, boolean z2, getEllipsisgIe3tQ8 getellipsisgie3tq8, r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k0, Modifier modifier, getBirthDateFull getbirthdatefull, int i) {
        int i2;
        ?? r3;
        float f;
        int i3;
        Modifier modifier2;
        boolean z3;
        extractAuthorizationHeader extractauthorizationheader;
        int i4;
        int i5;
        int i6;
        int i7 = 2 % 2;
        r8lambdardpfsr94j4iebcwx_kpqzpm8k0.getClass();
        getPostalCode getpostalcode = (getPostalCode) getbirthdatefull;
        getpostalcode.MediaSessionCompatQueueItem(-550332267);
        getAddressCountry getaddresscountry = getpostalcode.read;
        if ((i & 6) == 0) {
            if (getpostalcode.write(z)) {
                int i8 = write + 115;
                read = i8 % Fields.SpotShadowColor;
                i6 = i8 % 2 != 0 ? 5 : 4;
            } else {
                i6 = 2;
            }
            i2 = i6 | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            if (getpostalcode.write(z2)) {
                int i9 = read + 5;
                write = i9 % Fields.SpotShadowColor;
                int i10 = i9 % 2;
                i5 = 32;
            } else {
                i5 = 16;
            }
            i2 |= i5;
        }
        if ((i & 384) == 0) {
            int i11 = read + 21;
            write = i11 % Fields.SpotShadowColor;
            if (i11 % 2 != 0) {
                i2 |= getpostalcode.IconCompatParcelizer(getellipsisgie3tq8) ? Fields.RotationX : Fields.SpotShadowColor;
            } else {
                getpostalcode.IconCompatParcelizer(getellipsisgie3tq8);
                throw null;
            }
        }
        if ((i & 3072) == 0) {
            i2 |= getpostalcode.IconCompatParcelizer(r8lambdardpfsr94j4iebcwx_kpqzpm8k0) ? Fields.CameraDistance : Fields.RotationZ;
        }
        int i12 = i2 | 24576;
        if (getpostalcode.write(i12 & 1, (i12 & 9363) != 9362)) {
            Modifier.Companion companion = Modifier.Companion;
            Alignment.Companion companion2 = Alignment.Companion;
            Alignment.Vertical centerVertically = companion2.getCenterVertically();
            Arrangement$Center$1 arrangement$Center$1 = Arrangement.read;
            Modifier modifierM73paddingVpY3zN4$default = PaddingKt.m73paddingVpY3zN4$default(SizeKt.write(companion, 1.0f), Dimensions.setActionBarVisibilityCallback, 0.0f, 2);
            supportingTextPaddinga9UjIt4material3default supportingtextpaddinga9ujit4material3defaultSerializer = TextFieldDefaults.serializer(arrangement$Center$1, centerVertically, getpostalcode, 54);
            int iHashCode = Long.hashCode(getpostalcode.RatingCompat);
            DragAndDropNodestartDragAndDropTransfer1 dragAndDropNodestartDragAndDropTransfer1Serializer = getpostalcode.serializer();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(getpostalcode, modifierM73paddingVpY3zN4$default);
            ComposeUiNode.Companion companion3 = ComposeUiNode.Companion;
            r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 constructor = companion3.getConstructor();
            if (getaddresscountry != null) {
                getpostalcode.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg();
                if (!(!getpostalcode.ComponentActivity)) {
                    getpostalcode.serializer(constructor);
                } else {
                    getpostalcode.r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28();
                }
                r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.read(companion3, getpostalcode, supportingtextpaddinga9ujit4material3defaultSerializer, getpostalcode, dragAndDropNodestartDragAndDropTransfer1Serializer);
                AndroidContentCaptureManagerCompanion.write(getpostalcode, modifierMaterializeModifier, m1$$ExternalSyntheticOutline0.m(companion3, getpostalcode, Integer.valueOf(iHashCode), getpostalcode));
                int i13 = z ? R.drawable.ic_bolt : R.drawable.ic_bolt_off;
                Modifier modifierM = d$$ExternalSyntheticOutline0.m(1.0f, true, companion);
                MeasurePolicy measurePolicy = BoxKt.read(companion2.getCenterStart(), false);
                int iHashCode2 = Long.hashCode(getpostalcode.RatingCompat);
                DragAndDropNodestartDragAndDropTransfer1 dragAndDropNodestartDragAndDropTransfer1Serializer2 = getpostalcode.serializer();
                Modifier modifierMaterializeModifier2 = ComposedModifierKt.materializeModifier(getpostalcode, modifierM);
                r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 constructor2 = companion3.getConstructor();
                getpostalcode.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg();
                if (getpostalcode.ComponentActivity) {
                    int i14 = write + 91;
                    read = i14 % Fields.SpotShadowColor;
                    if (i14 % 2 != 0) {
                        getpostalcode.serializer(constructor2);
                        int i15 = 20 / 0;
                    } else {
                        getpostalcode.serializer(constructor2);
                    }
                } else {
                    getpostalcode.r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28();
                }
                af$$ExternalSyntheticOutline0.m(companion3, getpostalcode, measurePolicy, getpostalcode, dragAndDropNodestartDragAndDropTransfer1Serializer2);
                AndroidContentCaptureManagerCompanion.write(getpostalcode, modifierMaterializeModifier2, m1$$ExternalSyntheticOutline0.m(companion3, getpostalcode, Integer.valueOf(iHashCode2), getpostalcode));
                if (z2) {
                    getpostalcode.serializer(-128198690);
                    IconKt.m116Iconww6aTOc(PainterResources_androidKt.painterResource(i13, getpostalcode, 0), "Flash toggle", ClickableKt.RemoteActionCompatParcelizer(SizeKt.m83size3ABfNKs(companion, Dp.m3673constructorimpl(40.0f)), false, null, getellipsisgie3tq8, 15), ((buildMapping) getpostalcode.write((getNewPassword) performMeasureDjhGOtQ.RemoteActionCompatParcelizer)).getPopupTheme(), getpostalcode, Painter.$stable | 48, 0);
                    getpostalcode.IconCompatParcelizer(false);
                } else {
                    getpostalcode.serializer(-127844205);
                    Object objComponentActivity = getpostalcode.ComponentActivity();
                    if (objComponentActivity == getCreditCardExpirationMonth.write) {
                        objComponentActivity = new ScrollExtensionsKt$stopScroll$2(2, 3, null);
                        getpostalcode.write(objComponentActivity);
                    }
                    getPhoneNumberNational.RemoteActionCompatParcelizer(getpostalcode, createFromParcel.INSTANCE, (r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0) objComponentActivity);
                    getpostalcode.IconCompatParcelizer(false);
                }
                int i16 = write + 41;
                read = i16 % Fields.SpotShadowColor;
                if (i16 % 2 != 0) {
                    getpostalcode.IconCompatParcelizer(true);
                    f = Dimensions.setCustomView;
                    i3 = R.drawable.ic_x;
                    modifier2 = null;
                    z3 = true;
                    extractauthorizationheader = null;
                    i4 = (i12 / 96) & 40;
                } else {
                    getpostalcode.IconCompatParcelizer(true);
                    f = Dimensions.setCustomView;
                    i3 = R.drawable.ic_x;
                    modifier2 = null;
                    z3 = false;
                    extractauthorizationheader = null;
                    i4 = (i12 >> 6) & 112;
                }
                equalEnum.IconCompatParcelizer(i3, r8lambdardpfsr94j4iebcwx_kpqzpm8k0, modifier2, z3, extractauthorizationheader, f, f, getpostalcode, i4, 28);
                getpostalcode.IconCompatParcelizer(true);
                r3 = companion;
            } else {
                SentryUUID.write();
                throw null;
            }
        } else {
            getpostalcode.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
            r3 = modifier;
        }
        getHandleruiannotations gethandleruiannotationsMediaDescriptionCompat = getpostalcode.MediaDescriptionCompat();
        if (gethandleruiannotationsMediaDescriptionCompat != null) {
            gethandleruiannotationsMediaDescriptionCompat.serializer = new parseResponse(i, 2, r3, getellipsisgie3tq8, r8lambdardpfsr94j4iebcwx_kpqzpm8k0, z, z2);
        }
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0052  */
    /* JADX WARN: Code duplicated, block: B:12:0x0057  */
    /* JADX WARN: Code duplicated, block: B:14:0x005d  */
    /* JADX WARN: Code duplicated, block: B:15:0x005f  */
    /* JADX WARN: Code duplicated, block: B:17:0x0063 A[PHI: r3 r4
  0x0063: PHI (r3v57 o.getPostalCode) = (r3v5 o.getPostalCode), (r3v59 o.getPostalCode) binds: [B:8:0x004c, B:5:0x0032] A[DONT_GENERATE, DONT_INLINE]
  0x0063: PHI (r4v25 o.getAddressCountry) = (r4v2 o.getAddressCountry), (r4v26 o.getAddressCountry) binds: [B:8:0x004c, B:5:0x0032] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:27:0x0085  */
    /* JADX WARN: Code duplicated, block: B:28:0x0091  */
    /* JADX WARN: Code duplicated, block: B:9:0x004e A[PHI: r3 r4
  0x004e: PHI (r3v6 o.getPostalCode) = (r3v5 o.getPostalCode), (r3v59 o.getPostalCode) binds: [B:8:0x004c, B:5:0x0032] A[DONT_GENERATE, DONT_INLINE]
  0x004e: PHI (r4v3 o.getAddressCountry) = (r4v2 o.getAddressCountry), (r4v26 o.getAddressCountry) binds: [B:8:0x004c, B:5:0x0032] A[DONT_GENERATE, DONT_INLINE]] */
    public static final void QrScannerOverlay(PreviewParameter previewParameter, accessgetMaxcp accessgetmaxcp, boolean z, boolean z2, getEllipsisgIe3tQ8 getellipsisgie3tq8, r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k0, r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k1, Modifier modifier, getBirthDateFull getbirthdatefull, int i) {
        getPostalCode getpostalcode;
        getAddressCountry getaddresscountry;
        boolean zIconCompatParcelizer;
        int i2;
        int i3;
        getPostalCode getpostalcode2;
        getPostalCode getpostalcode3;
        int i4;
        int i5 = 2 % 2;
        int i6 = read + 73;
        write = i6 % Fields.SpotShadowColor;
        if (i6 % 2 == 0) {
            previewParameter.getClass();
            accessgetmaxcp.getClass();
            r8lambdardpfsr94j4iebcwx_kpqzpm8k0.getClass();
            r8lambdardpfsr94j4iebcwx_kpqzpm8k1.getClass();
            getpostalcode = (getPostalCode) getbirthdatefull;
            getpostalcode.MediaSessionCompatQueueItem(1539778212);
            getaddresscountry = getpostalcode.read;
            if ((i & 118) == 0) {
                if ((i & 8) == 0) {
                    zIconCompatParcelizer = getpostalcode.read(previewParameter);
                } else {
                    zIconCompatParcelizer = getpostalcode.IconCompatParcelizer(previewParameter);
                }
                if (zIconCompatParcelizer) {
                    i2 = 4;
                } else {
                    i2 = 2;
                }
                i3 = i2 | i;
                getpostalcode2 = getpostalcode;
            } else {
                getpostalcode2 = getpostalcode;
                i3 = i;
            }
        } else {
            previewParameter.getClass();
            accessgetmaxcp.getClass();
            r8lambdardpfsr94j4iebcwx_kpqzpm8k0.getClass();
            r8lambdardpfsr94j4iebcwx_kpqzpm8k1.getClass();
            getpostalcode = (getPostalCode) getbirthdatefull;
            getpostalcode.MediaSessionCompatQueueItem(1539778212);
            getaddresscountry = getpostalcode.read;
            if ((i & 6) == 0) {
                if ((i & 8) == 0) {
                    zIconCompatParcelizer = getpostalcode.read(previewParameter);
                } else {
                    zIconCompatParcelizer = getpostalcode.IconCompatParcelizer(previewParameter);
                }
                if (zIconCompatParcelizer) {
                    i2 = 4;
                } else {
                    i2 = 2;
                }
                i3 = i2 | i;
                getpostalcode2 = getpostalcode;
            } else {
                getpostalcode2 = getpostalcode;
                i3 = i;
            }
        }
        if ((i & 48) == 0) {
            int i7 = read + 105;
            write = i7 % Fields.SpotShadowColor;
            if (i7 % 2 != 0) {
                if (getpostalcode2.IconCompatParcelizer(accessgetmaxcp)) {
                    int i8 = write + 115;
                    read = i8 % Fields.SpotShadowColor;
                    int i9 = i8 % 2;
                    i4 = 32;
                } else {
                    i4 = 16;
                }
            } else {
                int i10 = 98 / 0;
                if (getpostalcode2.IconCompatParcelizer(accessgetmaxcp)) {
                    int i11 = write + 115;
                    read = i11 % Fields.SpotShadowColor;
                    int i12 = i11 % 2;
                    i4 = 32;
                } else {
                    i4 = 16;
                }
            }
            i3 |= i4;
        }
        Object obj = null;
        if ((i & 384) == 0) {
            int i13 = read + 95;
            write = i13 % Fields.SpotShadowColor;
            if (i13 % 2 != 0) {
                i3 |= getpostalcode2.write(z) ? Fields.RotationX : Fields.SpotShadowColor;
            } else {
                getpostalcode2.write(z);
                obj.hashCode();
                throw null;
            }
        }
        if ((i & 3072) == 0) {
            i3 |= !getpostalcode2.write(z2) ? Fields.RotationZ : Fields.CameraDistance;
        }
        if ((i & 24576) == 0) {
            i3 |= getpostalcode2.IconCompatParcelizer(getellipsisgie3tq8) ? Fields.Clip : 8192;
        }
        if ((196608 & i) == 0) {
            int i14 = read + 73;
            write = i14 % Fields.SpotShadowColor;
            int i15 = i14 % 2;
            i3 |= getpostalcode2.IconCompatParcelizer(r8lambdardpfsr94j4iebcwx_kpqzpm8k0) ^ true ? 65536 : Fields.RenderEffect;
        }
        if ((1572864 & i) == 0) {
            i3 |= getpostalcode2.IconCompatParcelizer(r8lambdardpfsr94j4iebcwx_kpqzpm8k1) ? 1048576 : Fields.BlendMode;
        }
        if ((i & 12582912) == 0) {
            i3 |= getpostalcode2.read(modifier) ? 8388608 : 4194304;
        }
        int i16 = i3;
        if (getpostalcode2.write(i16 & 1, (i16 & 4793491) != 4793490)) {
            Alignment.Companion companion = Alignment.Companion;
            MeasurePolicy measurePolicy = BoxKt.read(companion.getTopStart(), false);
            int iHashCode = Long.hashCode(getpostalcode2.RatingCompat);
            DragAndDropNodestartDragAndDropTransfer1 dragAndDropNodestartDragAndDropTransfer1Serializer = getpostalcode2.serializer();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(getpostalcode2, modifier);
            ComposeUiNode.Companion companion2 = ComposeUiNode.Companion;
            r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 constructor = companion2.getConstructor();
            if (getaddresscountry != null) {
                getpostalcode2.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg();
                if (getpostalcode2.ComponentActivity) {
                    getpostalcode2.serializer(constructor);
                } else {
                    getpostalcode2.r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28();
                }
                af$$ExternalSyntheticOutline0.m(companion2, getpostalcode2, measurePolicy, getpostalcode2, dragAndDropNodestartDragAndDropTransfer1Serializer);
                AndroidContentCaptureManagerCompanion.write(getpostalcode2, modifierMaterializeModifier, m1$$ExternalSyntheticOutline0.m(companion2, getpostalcode2, Integer.valueOf(iHashCode), getpostalcode2));
                int i17 = (i16 >> 3) & 14;
                ScannerCanvasKt.read(accessgetmaxcp, null, getpostalcode2, i17);
                Alignment.Horizontal centerHorizontally = companion.getCenterHorizontally();
                Modifier.Companion companion3 = Modifier.Companion;
                float f = Dimensions.setActionBarVisibilityCallback;
                Modifier modifierWrite = PaddingKt.write(companion3, f);
                ModalBottomSheetYbuCTN8 modalBottomSheetYbuCTN8Serializer = ModalBottomSheetKtModalBottomSheet311.serializer(Arrangement.MediaDescriptionCompat, centerHorizontally, getpostalcode2, 48);
                int iHashCode2 = Long.hashCode(getpostalcode2.RatingCompat);
                DragAndDropNodestartDragAndDropTransfer1 dragAndDropNodestartDragAndDropTransfer1Serializer2 = getpostalcode2.serializer();
                Modifier modifierMaterializeModifier2 = ComposedModifierKt.materializeModifier(getpostalcode2, modifierWrite);
                r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 constructor2 = companion2.getConstructor();
                getpostalcode2.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg();
                if (getpostalcode2.ComponentActivity) {
                    getpostalcode2.serializer(constructor2);
                } else {
                    getpostalcode2.r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28();
                }
                c8$$ExternalSyntheticOutline0.m(companion2, getpostalcode2, modalBottomSheetYbuCTN8Serializer, getpostalcode2, dragAndDropNodestartDragAndDropTransfer1Serializer2);
                AndroidContentCaptureManagerCompanion.write(getpostalcode2, modifierMaterializeModifier2, m1$$ExternalSyntheticOutline0.m(companion2, getpostalcode2, Integer.valueOf(iHashCode2), getpostalcode2));
                TopControlBar(z, z2, getellipsisgie3tq8, r8lambdardpfsr94j4iebcwx_kpqzpm8k0, null, getpostalcode2, (i16 >> 6) & 8190);
                String str = previewParameter.instructionMessage;
                Object obj2 = null;
                setCurrentSemanticsNodesui setcurrentsemanticsnodesui = performMeasureDjhGOtQ.RemoteActionCompatParcelizer;
                getpostalcode3 = getpostalcode2;
                TextKt.m131TextNvy7gAk(str, PaddingKt.m73paddingVpY3zN4$default(companion3, 0.0f, f, 1), ((buildMapping) getpostalcode2.write((getNewPassword) setcurrentsemanticsnodesui)).getPopupTheme(), 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, (TextStyle) performLayout.read(-961708487, pcn.serializer(), new Object[0], 961708487, pcn.serializer(), pcn.serializer(), pcn.serializer()), getpostalcode3, 0, 0, 131064);
                TextKt.m131TextNvy7gAk(previewParameter.headline, null, ((buildMapping) getpostalcode3.write((getNewPassword) setcurrentsemanticsnodesui)).getPopupTheme(), 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, performLayout.MediaSessionCompatQueueItem(), getpostalcode3, 0, 0, 131066);
                ExtrasKt.read(913837329, handleUrlOverridelambda1.RemoteActionCompatParcelizer(), handleUrlOverridelambda1.RemoteActionCompatParcelizer(), -913837326, handleUrlOverridelambda1.RemoteActionCompatParcelizer(), handleUrlOverridelambda1.RemoteActionCompatParcelizer(), new Object[]{getpostalcode3, ModalBottomSheetDialogWrapper.IconCompatParcelizer(companion3, 2.0f)});
                Modifier modifierIconCompatParcelizer = ModalBottomSheetDialogWrapper.IconCompatParcelizer(companion3, 1.0f);
                MeasurePolicy measurePolicy2 = BoxKt.read(companion.getTopStart(), false);
                int iHashCode3 = Long.hashCode(getpostalcode3.RatingCompat);
                DragAndDropNodestartDragAndDropTransfer1 dragAndDropNodestartDragAndDropTransfer1Serializer3 = getpostalcode3.serializer();
                Modifier modifierMaterializeModifier3 = ComposedModifierKt.materializeModifier(getpostalcode3, modifierIconCompatParcelizer);
                r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 constructor3 = companion2.getConstructor();
                getpostalcode3.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg();
                if (!getpostalcode3.ComponentActivity) {
                    getpostalcode3.r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28();
                } else {
                    int i18 = write + 91;
                    read = i18 % Fields.SpotShadowColor;
                    if (i18 % 2 == 0) {
                        getpostalcode3.serializer(constructor3);
                    } else {
                        getpostalcode3.serializer(constructor3);
                        obj2.hashCode();
                        throw null;
                    }
                }
                af$$ExternalSyntheticOutline0.m(companion2, getpostalcode3, measurePolicy2, getpostalcode3, dragAndDropNodestartDragAndDropTransfer1Serializer3);
                AndroidContentCaptureManagerCompanion.write(getpostalcode3, modifierMaterializeModifier3, m1$$ExternalSyntheticOutline0.m(companion2, getpostalcode3, Integer.valueOf(iHashCode3), getpostalcode3));
                ModalBottomSheetYbuCTN8 modalBottomSheetYbuCTN8Serializer2 = ModalBottomSheetKtModalBottomSheet311.serializer(Arrangement.read, companion.getCenterHorizontally(), getpostalcode3, 54);
                int iHashCode4 = Long.hashCode(getpostalcode3.RatingCompat);
                DragAndDropNodestartDragAndDropTransfer1 dragAndDropNodestartDragAndDropTransfer1Serializer4 = getpostalcode3.serializer();
                Modifier modifierMaterializeModifier4 = ComposedModifierKt.materializeModifier(getpostalcode3, companion3);
                r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 constructor4 = companion2.getConstructor();
                getpostalcode3.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg();
                if (getpostalcode3.ComponentActivity) {
                    int i19 = read + 107;
                    write = i19 % Fields.SpotShadowColor;
                    int i20 = i19 % 2;
                    getpostalcode3.serializer(constructor4);
                } else {
                    getpostalcode3.r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28();
                }
                c8$$ExternalSyntheticOutline0.m(companion2, getpostalcode3, modalBottomSheetYbuCTN8Serializer2, getpostalcode3, dragAndDropNodestartDragAndDropTransfer1Serializer4);
                AndroidContentCaptureManagerCompanion.write(getpostalcode3, modifierMaterializeModifier4, m1$$ExternalSyntheticOutline0.m(companion2, getpostalcode3, Integer.valueOf(iHashCode4), getpostalcode3));
                QrCodeScanTaskUiItem$QrScanScreen$Companion qrCodeScanTaskUiItem$QrScanScreen$Companion = PreviewParameter.Companion;
                read(accessgetmaxcp, previewParameter, null, getpostalcode3, i17 | 64 | ((i16 << 3) & 112));
                Modifier modifierIconCompatParcelizer2 = ModalBottomSheetDialogWrapper.IconCompatParcelizer(companion3, 1.0f);
                MeasurePolicy measurePolicy3 = BoxKt.read(companion.getBottomCenter(), false);
                int iHashCode5 = Long.hashCode(getpostalcode3.RatingCompat);
                DragAndDropNodestartDragAndDropTransfer1 dragAndDropNodestartDragAndDropTransfer1Serializer5 = getpostalcode3.serializer();
                Modifier modifierMaterializeModifier5 = ComposedModifierKt.materializeModifier(getpostalcode3, modifierIconCompatParcelizer2);
                r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 constructor5 = companion2.getConstructor();
                getpostalcode3.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg();
                if (getpostalcode3.ComponentActivity) {
                    int i21 = read + 97;
                    write = i21 % Fields.SpotShadowColor;
                    if (i21 % 2 == 0) {
                        getpostalcode3.serializer(constructor5);
                        int i22 = 35 / 0;
                    } else {
                        getpostalcode3.serializer(constructor5);
                    }
                } else {
                    getpostalcode3.r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28();
                }
                af$$ExternalSyntheticOutline0.m(companion2, getpostalcode3, measurePolicy3, getpostalcode3, dragAndDropNodestartDragAndDropTransfer1Serializer5);
                AndroidContentCaptureManagerCompanion.write(getpostalcode3, modifierMaterializeModifier5, m1$$ExternalSyntheticOutline0.m(companion2, getpostalcode3, Integer.valueOf(iHashCode5), getpostalcode3));
                if (!(accessgetmaxcp instanceof copyiSbpLlYdefault)) {
                    int i23 = read + 45;
                    write = i23 % Fields.SpotShadowColor;
                    int i24 = i23 % 2;
                    getpostalcode3.serializer(-736559152);
                    ComposeAnimationState composeAnimationState = previewParameter.fallbackScreenButton;
                    String str2 = composeAnimationState.actionTitle;
                    ButtonTypeToken buttonTypeToken = composeAnimationState.type;
                    Modifier modifierM74paddingqDBjuR0$default = PaddingKt.m74paddingqDBjuR0$default(companion3, 0.0f, 0.0f, 0.0f, f, 7);
                    modifierM74paddingqDBjuR0$default.getClass();
                    ButtonTypeTokenMapperKt.IconCompatParcelizer(buttonTypeToken, str2, r8lambdardpfsr94j4iebcwx_kpqzpm8k1, modifierM74paddingqDBjuR0$default, false, false, null, getpostalcode3, (i16 >> 12) & 896, 240);
                    getpostalcode3.IconCompatParcelizer(false);
                } else {
                    getpostalcode3.serializer(-736056704);
                    getpostalcode3.IconCompatParcelizer(false);
                }
                getpostalcode3.IconCompatParcelizer(true);
                getpostalcode3.IconCompatParcelizer(true);
                getpostalcode3.IconCompatParcelizer(true);
                getpostalcode3.IconCompatParcelizer(true);
                getpostalcode3.IconCompatParcelizer(true);
            } else {
                SentryUUID.write();
                throw null;
            }
        } else {
            getpostalcode3 = getpostalcode2;
            getpostalcode3.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
        }
        getHandleruiannotations gethandleruiannotationsMediaDescriptionCompat = getpostalcode3.MediaDescriptionCompat();
        if (gethandleruiannotationsMediaDescriptionCompat != null) {
            gethandleruiannotationsMediaDescriptionCompat.serializer = new isEqualHuaweiReferrerAppGalleryDetails(previewParameter, accessgetmaxcp, z, z2, getellipsisgie3tq8, r8lambdardpfsr94j4iebcwx_kpqzpm8k0, r8lambdardpfsr94j4iebcwx_kpqzpm8k1, modifier, i);
        }
    }
}
