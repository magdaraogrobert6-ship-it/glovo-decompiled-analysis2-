package com.roadrunner.sidemenu.photoId.preview;

import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.FillElement;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Fields;
import androidx.compose.ui.graphics.RectangleShapeKt;
import androidx.compose.ui.layout.ContentScale;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.res.StringResources_androidKt;
import bo.app.af$$ExternalSyntheticOutline0;
import bo.app.c8$$ExternalSyntheticOutline0;
import bo.app.m1$$ExternalSyntheticOutline0;
import coil3.ExtrasKt;
import com.huawei.riemann.location.common.utils.Constant;
import com.logistics.rider.glovo.R;
import com.roadrunner.designsystem.compose.theme.tokens.Dimensions;
import com.roadrunner.rrds.compose.component.navigations.HeaderKt;
import io.sentry.SentryUUID;
import o.AndroidContentCaptureManagerCompanion;
import o.DefaultLazyKey;
import o.DragAndDropNodestartDragAndDropTransfer1;
import o.FlingCancellationException;
import o.ModalBottomSheetKtModalBottomSheet311;
import o.ModalBottomSheetYbuCTN8;
import o._get_registeredPushToken_lambda0;
import o._set_registeredPushToken_lambda1;
import o._set_registeredPushToken_lambda10;
import o.buildMapping;
import o.getAddressCountry;
import o.getBirthDateFull;
import o.getHandleruiannotations;
import o.getNewPassword;
import o.getNonZeroRgk1Os;
import o.getPostalCode;
import o.performMeasureDjhGOtQ;
import o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0;
import o.r8lambdarMv397hzZJazOE3eMmLe0m6ePY0;

/* JADX INFO: loaded from: classes3.dex */
public abstract class PhotoIdPreviewContentKt {
    private static int RemoteActionCompatParcelizer = 1;
    private static int read;

    public static final void RemoteActionCompatParcelizer(_set_registeredPushToken_lambda1 _set_registeredpushtoken_lambda1, r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k0, getBirthDateFull getbirthdatefull, int i) {
        int i2;
        int i3 = 2 % 2;
        r8lambdardpfsr94j4iebcwx_kpqzpm8k0.getClass();
        getPostalCode getpostalcode = (getPostalCode) getbirthdatefull;
        getpostalcode.MediaSessionCompatQueueItem(2117234178);
        if ((i & 6) == 0) {
            i2 = (getpostalcode.IconCompatParcelizer(_set_registeredpushtoken_lambda1) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            int i4 = read + 5;
            RemoteActionCompatParcelizer = i4 % Fields.SpotShadowColor;
            int i5 = i4 % 2;
            i2 |= getpostalcode.IconCompatParcelizer(r8lambdardpfsr94j4iebcwx_kpqzpm8k0) ? 32 : 16;
        }
        if (getpostalcode.write(i2 & 1, (i2 & 19) != 18)) {
            PhotoIdPreviewContent((_set_registeredPushToken_lambda10) ExtrasKt.write(_set_registeredpushtoken_lambda1.IconCompatParcelizer, getpostalcode, 0).getValue(), r8lambdardpfsr94j4iebcwx_kpqzpm8k0, getpostalcode, i2 & 112);
            int i6 = RemoteActionCompatParcelizer + 51;
            read = i6 % Fields.SpotShadowColor;
            int i7 = i6 % 2;
        } else {
            getpostalcode.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
        }
        getHandleruiannotations gethandleruiannotationsMediaDescriptionCompat = getpostalcode.MediaDescriptionCompat();
        if (gethandleruiannotationsMediaDescriptionCompat != null) {
            gethandleruiannotationsMediaDescriptionCompat.serializer = new r8lambdarMv397hzZJazOE3eMmLe0m6ePY0(i, 13, _set_registeredpushtoken_lambda1, r8lambdardpfsr94j4iebcwx_kpqzpm8k0);
        }
        int i8 = RemoteActionCompatParcelizer + 13;
        read = i8 % Fields.SpotShadowColor;
        if (i8 % 2 != 0) {
            throw null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:11:0x003a  */
    /* JADX WARN: Code duplicated, block: B:12:0x003c  */
    /* JADX WARN: Code duplicated, block: B:14:0x004f A[PHI: r4 r5
  0x004f: PHI (r4v9 o.getPostalCode) = (r4v5 o.getPostalCode), (r4v11 o.getPostalCode) binds: [B:8:0x0031, B:5:0x0023] A[DONT_GENERATE, DONT_INLINE]
  0x004f: PHI (r5v15 o.getAddressCountry) = (r5v2 o.getAddressCountry), (r5v16 o.getAddressCountry) binds: [B:8:0x0031, B:5:0x0023] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:9:0x0033 A[PHI: r4 r5
  0x0033: PHI (r4v6 o.getPostalCode) = (r4v5 o.getPostalCode), (r4v11 o.getPostalCode) binds: [B:8:0x0031, B:5:0x0023] A[DONT_GENERATE, DONT_INLINE]
  0x0033: PHI (r5v3 o.getAddressCountry) = (r5v2 o.getAddressCountry), (r5v16 o.getAddressCountry) binds: [B:8:0x0031, B:5:0x0023] A[DONT_GENERATE, DONT_INLINE]] */
    public static final void PhotoIdPreviewContent(_set_registeredPushToken_lambda10 _set_registeredpushtoken_lambda10, r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k0, getBirthDateFull getbirthdatefull, int i) {
        getPostalCode getpostalcode;
        getAddressCountry getaddresscountry;
        int i2;
        int i3;
        boolean z;
        boolean z2;
        int i4;
        int i5 = 2 % 2;
        int i6 = read + 79;
        RemoteActionCompatParcelizer = i6 % Fields.SpotShadowColor;
        if (i6 % 2 == 0) {
            getpostalcode = (getPostalCode) getbirthdatefull;
            getpostalcode.MediaSessionCompatQueueItem(1217956452);
            getaddresscountry = getpostalcode.read;
            if ((i & 96) == 0) {
                if (!getpostalcode.IconCompatParcelizer(_set_registeredpushtoken_lambda10)) {
                    i2 = 2;
                } else {
                    int i7 = read + 119;
                    int i8 = i7 % Fields.SpotShadowColor;
                    RemoteActionCompatParcelizer = i8;
                    int i9 = i7 % 2;
                    int i10 = i8 + 9;
                    read = i10 % Fields.SpotShadowColor;
                    int i11 = i10 % 2;
                    i2 = 4;
                }
                i3 = i2 | i;
            } else {
                i3 = i;
            }
        } else {
            getpostalcode = (getPostalCode) getbirthdatefull;
            getpostalcode.MediaSessionCompatQueueItem(1217956452);
            getaddresscountry = getpostalcode.read;
            if ((i & 6) == 0) {
                if (!getpostalcode.IconCompatParcelizer(_set_registeredpushtoken_lambda10)) {
                    i2 = 2;
                } else {
                    int i12 = read + 119;
                    int i13 = i12 % Fields.SpotShadowColor;
                    RemoteActionCompatParcelizer = i13;
                    int i14 = i12 % 2;
                    int i15 = i13 + 9;
                    read = i15 % Fields.SpotShadowColor;
                    int i16 = i15 % 2;
                    i2 = 4;
                }
                i3 = i2 | i;
            } else {
                i3 = i;
            }
        }
        if ((i & 48) == 0) {
            int i17 = read + 73;
            RemoteActionCompatParcelizer = i17 % Fields.SpotShadowColor;
            int i18 = i17 % 2;
            if (getpostalcode.IconCompatParcelizer(r8lambdardpfsr94j4iebcwx_kpqzpm8k0)) {
                int i19 = RemoteActionCompatParcelizer + 123;
                read = i19 % Fields.SpotShadowColor;
                i4 = i19 % 2 != 0 ? 78 : 32;
            } else {
                i4 = 16;
            }
            i3 |= i4;
        }
        if ((i3 & 19) != 18) {
            int i20 = read + 95;
            RemoteActionCompatParcelizer = i20 % Fields.SpotShadowColor;
            int i21 = i20 % 2;
            z = true;
        } else {
            z = false;
        }
        if (getpostalcode.write(i3 & 1, z)) {
            Modifier.Companion companion = Modifier.Companion;
            FillElement fillElement = SizeKt.read;
            Modifier modifierM20backgroundbw27NRU = BackgroundKt.m20backgroundbw27NRU(companion.then(fillElement), ((buildMapping) getpostalcode.write((getNewPassword) performMeasureDjhGOtQ.RemoteActionCompatParcelizer)).setPopupTheme(), RectangleShapeKt.getRectangleShape());
            FlingCancellationException flingCancellationException = Arrangement.MediaDescriptionCompat;
            Alignment.Companion companion2 = Alignment.Companion;
            ModalBottomSheetYbuCTN8 modalBottomSheetYbuCTN8Serializer = ModalBottomSheetKtModalBottomSheet311.serializer(flingCancellationException, companion2.getStart(), getpostalcode, 0);
            int iHashCode = Long.hashCode(getpostalcode.RatingCompat);
            DragAndDropNodestartDragAndDropTransfer1 dragAndDropNodestartDragAndDropTransfer1Serializer = getpostalcode.serializer();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(getpostalcode, modifierM20backgroundbw27NRU);
            ComposeUiNode.Companion companion3 = ComposeUiNode.Companion;
            r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 constructor = companion3.getConstructor();
            if (getaddresscountry != null) {
                getpostalcode.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg();
                if (getpostalcode.ComponentActivity) {
                    getpostalcode.serializer(constructor);
                } else {
                    getpostalcode.r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28();
                }
                c8$$ExternalSyntheticOutline0.m(companion3, getpostalcode, modalBottomSheetYbuCTN8Serializer, getpostalcode, dragAndDropNodestartDragAndDropTransfer1Serializer);
                AndroidContentCaptureManagerCompanion.write(getpostalcode, modifierMaterializeModifier, m1$$ExternalSyntheticOutline0.m(companion3, getpostalcode, Integer.valueOf(iHashCode), getpostalcode));
                HeaderKt.serializer(null, StringResources_androidKt.stringResource(R.string.photo_id_preview_screen_title, getpostalcode, 0), 0L, null, ExtrasKt.write(1760941995, new DefaultLazyKey(23, r8lambdardpfsr94j4iebcwx_kpqzpm8k0), getpostalcode), null, null, getpostalcode, 196608, Constant.ERROR_WSS_NO_DATA);
                if (_set_registeredpushtoken_lambda10 instanceof _get_registeredPushToken_lambda0) {
                    int i22 = RemoteActionCompatParcelizer + 49;
                    read = i22 % Fields.SpotShadowColor;
                    int i23 = i22 % 2;
                    getpostalcode.serializer(-207144263);
                    Modifier modifierThen = companion.then(fillElement);
                    MeasurePolicy measurePolicy = BoxKt.read(companion2.getTopStart(), false);
                    int iHashCode2 = Long.hashCode(getpostalcode.RatingCompat);
                    DragAndDropNodestartDragAndDropTransfer1 dragAndDropNodestartDragAndDropTransfer1Serializer2 = getpostalcode.serializer();
                    Modifier modifierMaterializeModifier2 = ComposedModifierKt.materializeModifier(getpostalcode, modifierThen);
                    r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 constructor2 = companion3.getConstructor();
                    getpostalcode.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg();
                    if (getpostalcode.ComponentActivity) {
                        getpostalcode.serializer(constructor2);
                    } else {
                        getpostalcode.r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28();
                    }
                    af$$ExternalSyntheticOutline0.m(companion3, getpostalcode, measurePolicy, getpostalcode, dragAndDropNodestartDragAndDropTransfer1Serializer2);
                    AndroidContentCaptureManagerCompanion.write(getpostalcode, modifierMaterializeModifier2, m1$$ExternalSyntheticOutline0.m(companion3, getpostalcode, Integer.valueOf(iHashCode2), getpostalcode));
                    getNonZeroRgk1Os.RemoteActionCompatParcelizer(((_get_registeredPushToken_lambda0) _set_registeredpushtoken_lambda10).IconCompatParcelizer, null, PaddingKt.write(companion.then(fillElement), Dimensions.setMenu), ContentScale.Companion.getFit(), null, getpostalcode, 1572912, 1976);
                    z2 = true;
                    getpostalcode.IconCompatParcelizer(true);
                    getpostalcode.IconCompatParcelizer(false);
                } else {
                    z2 = true;
                    getpostalcode.serializer(-206760824);
                    getpostalcode.IconCompatParcelizer(false);
                }
                getpostalcode.IconCompatParcelizer(z2);
            } else {
                SentryUUID.write();
                throw null;
            }
        } else {
            getpostalcode.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
        }
        getHandleruiannotations gethandleruiannotationsMediaDescriptionCompat = getpostalcode.MediaDescriptionCompat();
        if (gethandleruiannotationsMediaDescriptionCompat != null) {
            gethandleruiannotationsMediaDescriptionCompat.serializer = new r8lambdarMv397hzZJazOE3eMmLe0m6ePY0(i, 14, _set_registeredpushtoken_lambda10, r8lambdardpfsr94j4iebcwx_kpqzpm8k0);
        }
    }
}
