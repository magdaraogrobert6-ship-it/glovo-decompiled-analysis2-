package com.roadrunner.customerchat.selfservice.presentation.screen;

import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.material3.TextKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Fields;
import androidx.compose.ui.graphics.RectangleShapeKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.res.StringResources_androidKt;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.unit.Dp;
import bo.app.af$$ExternalSyntheticOutline0;
import bo.app.c8$$ExternalSyntheticOutline0;
import bo.app.m1$$ExternalSyntheticOutline0;
import com.logistics.rider.glovo.R;
import com.roadrunner.designsystem.compose.theme.tokens.Dimensions;
import com.roadrunner.rrds.compose.component.buttons.PrimaryKt;
import com.roadrunner.rrds.compose.component.navigations.HeaderKt;
import io.sentry.SentryUUID;
import o.AndroidContentCaptureManagerCompanion;
import o.DragAndDropNodestartDragAndDropTransfer1;
import o.ModalBottomSheetKtModalBottomSheet311;
import o.ModalBottomSheetYbuCTN8;
import o.buildMapping;
import o.copyykzQM6k;
import o.getAddressCountry;
import o.getBirthDateFull;
import o.getHandleruiannotations;
import o.getNewPassword;
import o.getNonZeroRgk1Os;
import o.getPostalCode;
import o.performLayout;
import o.performMeasureDjhGOtQ;
import o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0;
import o.setCurrentSemanticsNodesui;

/* JADX INFO: loaded from: classes3.dex */
public abstract class CustomerChatErrorScreenKt {
    private static int RemoteActionCompatParcelizer = 1;
    private static int serializer;

    /* JADX WARN: Code duplicated, block: B:11:0x0044  */
    /* JADX WARN: Code duplicated, block: B:12:0x0046  */
    /* JADX WARN: Code duplicated, block: B:14:0x0049 A[PHI: r1 r2
  0x0049: PHI (r1v9 o.getPostalCode) = (r1v5 o.getPostalCode), (r1v11 o.getPostalCode) binds: [B:8:0x003a, B:5:0x0026] A[DONT_GENERATE, DONT_INLINE]
  0x0049: PHI (r2v18 o.getAddressCountry) = (r2v2 o.getAddressCountry), (r2v19 o.getAddressCountry) binds: [B:8:0x003a, B:5:0x0026] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:9:0x003c A[PHI: r1 r2
  0x003c: PHI (r1v6 o.getPostalCode) = (r1v5 o.getPostalCode), (r1v11 o.getPostalCode) binds: [B:8:0x003a, B:5:0x0026] A[DONT_GENERATE, DONT_INLINE]
  0x003c: PHI (r2v3 o.getAddressCountry) = (r2v2 o.getAddressCountry), (r2v19 o.getAddressCountry) binds: [B:8:0x003a, B:5:0x0026] A[DONT_GENERATE, DONT_INLINE]] */
    public static final void CustomerChatErrorScreen(r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k0, r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k1, Modifier modifier, getBirthDateFull getbirthdatefull, int i) {
        getPostalCode getpostalcode;
        getAddressCountry getaddresscountry;
        int i2;
        int i3;
        int i4;
        int i5 = 2 % 2;
        int i6 = serializer + 57;
        RemoteActionCompatParcelizer = i6 % Fields.SpotShadowColor;
        if (i6 % 2 == 0) {
            r8lambdardpfsr94j4iebcwx_kpqzpm8k0.getClass();
            r8lambdardpfsr94j4iebcwx_kpqzpm8k1.getClass();
            getpostalcode = (getPostalCode) getbirthdatefull;
            getpostalcode.MediaSessionCompatQueueItem(-699171083);
            getaddresscountry = getpostalcode.read;
            if ((i & 27) == 0) {
                if (getpostalcode.IconCompatParcelizer(r8lambdardpfsr94j4iebcwx_kpqzpm8k0)) {
                    i2 = 4;
                } else {
                    i2 = 2;
                }
                i3 = i2 | i;
            } else {
                i3 = i;
            }
        } else {
            r8lambdardpfsr94j4iebcwx_kpqzpm8k0.getClass();
            r8lambdardpfsr94j4iebcwx_kpqzpm8k1.getClass();
            getpostalcode = (getPostalCode) getbirthdatefull;
            getpostalcode.MediaSessionCompatQueueItem(-699171083);
            getaddresscountry = getpostalcode.read;
            if ((i & 6) == 0) {
                if (getpostalcode.IconCompatParcelizer(r8lambdardpfsr94j4iebcwx_kpqzpm8k0)) {
                    i2 = 4;
                } else {
                    i2 = 2;
                }
                i3 = i2 | i;
            } else {
                i3 = i;
            }
        }
        if ((i & 48) == 0) {
            i3 |= !(getpostalcode.IconCompatParcelizer(r8lambdardpfsr94j4iebcwx_kpqzpm8k1) ^ true) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            if (getpostalcode.read(modifier)) {
                int i7 = RemoteActionCompatParcelizer + 59;
                serializer = i7 % Fields.SpotShadowColor;
                i4 = i7 % 2 != 0 ? 29939 : Fields.RotationX;
            } else {
                i4 = Fields.SpotShadowColor;
            }
            i3 |= i4;
            int i8 = serializer + 109;
            RemoteActionCompatParcelizer = i8 % Fields.SpotShadowColor;
            int i9 = i8 % 2;
        }
        int i10 = i3;
        if (getpostalcode.write(i10 & 1, (i10 & 147) != 146)) {
            Modifier modifierThen = modifier.then(SizeKt.read);
            setCurrentSemanticsNodesui setcurrentsemanticsnodesui = performMeasureDjhGOtQ.RemoteActionCompatParcelizer;
            Modifier modifierM20backgroundbw27NRU = BackgroundKt.m20backgroundbw27NRU(modifierThen, ((buildMapping) getpostalcode.write((getNewPassword) setcurrentsemanticsnodesui)).IconCompatParcelizer(), RectangleShapeKt.getRectangleShape());
            Alignment.Companion companion = Alignment.Companion;
            MeasurePolicy measurePolicy = BoxKt.read(companion.getTopStart(), false);
            int iHashCode = Long.hashCode(getpostalcode.RatingCompat);
            DragAndDropNodestartDragAndDropTransfer1 dragAndDropNodestartDragAndDropTransfer1Serializer = getpostalcode.serializer();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(getpostalcode, modifierM20backgroundbw27NRU);
            ComposeUiNode.Companion companion2 = ComposeUiNode.Companion;
            r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 constructor = companion2.getConstructor();
            if (getaddresscountry == null) {
                SentryUUID.write();
                throw null;
            }
            int i11 = serializer + 15;
            RemoteActionCompatParcelizer = i11 % Fields.SpotShadowColor;
            int i12 = i11 % 2;
            getpostalcode.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg();
            if (getpostalcode.ComponentActivity) {
                getpostalcode.serializer(constructor);
                int i13 = RemoteActionCompatParcelizer + 77;
                serializer = i13 % Fields.SpotShadowColor;
                int i14 = i13 % 2;
            } else {
                getpostalcode.r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28();
            }
            af$$ExternalSyntheticOutline0.m(companion2, getpostalcode, measurePolicy, getpostalcode, dragAndDropNodestartDragAndDropTransfer1Serializer);
            AndroidContentCaptureManagerCompanion.write(getpostalcode, modifierMaterializeModifier, m1$$ExternalSyntheticOutline0.m(companion2, getpostalcode, Integer.valueOf(iHashCode), getpostalcode));
            Modifier.Companion companion3 = Modifier.Companion;
            Alignment center = companion.getCenter();
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.serializer;
            Modifier modifierM73paddingVpY3zN4$default = PaddingKt.m73paddingVpY3zN4$default(boxScopeInstance.align(companion3, center), 0.0f, Dimensions.setHideOnContentScrollEnabled, 1);
            ModalBottomSheetYbuCTN8 modalBottomSheetYbuCTN8Serializer = ModalBottomSheetKtModalBottomSheet311.serializer(Arrangement.MediaDescriptionCompat, companion.getCenterHorizontally(), getpostalcode, 48);
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
            c8$$ExternalSyntheticOutline0.m(companion2, getpostalcode, modalBottomSheetYbuCTN8Serializer, getpostalcode, dragAndDropNodestartDragAndDropTransfer1Serializer2);
            AndroidContentCaptureManagerCompanion.write(getpostalcode, modifierMaterializeModifier2, m1$$ExternalSyntheticOutline0.m(companion2, getpostalcode, Integer.valueOf(iHashCode2), getpostalcode));
            getNonZeroRgk1Os.RemoteActionCompatParcelizer(Integer.valueOf(R.drawable.customer_chat_error_thumbnail), null, SizeKt.m84sizeVpY3zN4(companion3, Dp.m3673constructorimpl(186.0f), Dp.m3673constructorimpl(180.0f)), null, null, getpostalcode, 432, 2040);
            getPostalCode getpostalcode2 = getpostalcode;
            TextKt.m131TextNvy7gAk(StringResources_androidKt.stringResource(R.string.customer_chat_loading_error_title, getpostalcode, 0), null, ((buildMapping) getpostalcode.write((getNewPassword) setcurrentsemanticsnodesui)).setOverlayMode(), 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, performLayout.MediaDescriptionCompat(), getpostalcode2, 0, 0, 131066);
            String strStringResource = StringResources_androidKt.stringResource(R.string.customer_chat_loading_error_description, getpostalcode, 0);
            float f = Dimensions.setLogo;
            Modifier modifierM73paddingVpY3zN4$default2 = PaddingKt.m73paddingVpY3zN4$default(companion3, f, 0.0f, 2);
            float f2 = Dimensions.setActionBarVisibilityCallback;
            TextKt.m131TextNvy7gAk(strStringResource, PaddingKt.m74paddingqDBjuR0$default(modifierM73paddingVpY3zN4$default2, 0.0f, f2, 0.0f, 0.0f, 13), ((buildMapping) getpostalcode.write((getNewPassword) setcurrentsemanticsnodesui)).setTitleOptional(), 0L, null, null, 0L, TextAlign.m3504boximpl(TextAlign.Companion.m3511getCentere0LSkKk()), 0L, 0, false, 0, 0, null, performLayout.MediaBrowserCompatMediaItem(), getpostalcode2, 0, 0, 130040);
            PrimaryKt.write(StringResources_androidKt.stringResource(R.string.customer_chat_loading_error_retry_text, getpostalcode, 0), r8lambdardpfsr94j4iebcwx_kpqzpm8k1, PaddingKt.m74paddingqDBjuR0$default(PaddingKt.m73paddingVpY3zN4$default(SizeKt.write(companion3, 1.0f), f, 0.0f, 2), 0.0f, Dp.m3673constructorimpl(40.0f), 0.0f, f2, 5), false, false, null, null, null, null, null, getpostalcode, i10 & 112, 0, 2040);
            getpostalcode.IconCompatParcelizer(true);
            float f3 = Dimensions.setMenu;
            HeaderKt.read(R.drawable.ic_arrow_left, r8lambdardpfsr94j4iebcwx_kpqzpm8k0, boxScopeInstance.align(PaddingKt.m74paddingqDBjuR0$default(companion3, f3, f3, 0.0f, 0.0f, 12), companion.getTopStart()), false, null, getpostalcode, (i10 << 3) & 112, 24);
            getpostalcode.IconCompatParcelizer(true);
        } else {
            getpostalcode.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
        }
        getHandleruiannotations gethandleruiannotationsMediaDescriptionCompat = getpostalcode.MediaDescriptionCompat();
        if (gethandleruiannotationsMediaDescriptionCompat != null) {
            gethandleruiannotationsMediaDescriptionCompat.serializer = new copyykzQM6k(r8lambdardpfsr94j4iebcwx_kpqzpm8k0, r8lambdardpfsr94j4iebcwx_kpqzpm8k1, modifier, i, 0);
        }
    }
}
