package com.roadrunner.rider.safety.permission.presentation.result;

import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.material3.TextKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Fields;
import androidx.compose.ui.graphics.painter.Painter;
import androidx.compose.ui.layout.ContentScale;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.res.StringResources_androidKt;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.style.TextAlign;
import bo.app.c8$$ExternalSyntheticOutline0;
import bo.app.m1$$ExternalSyntheticOutline0;
import coil3.ExtrasKt;
import com.incognia.internal.pcn;
import com.logistics.rider.glovo.R;
import com.roadrunner.designsystem.compose.theme.tokens.Dimensions;
import com.roadrunner.rrds.compose.component.buttons.PrimaryKt;
import io.sentry.SentryUUID;
import o.AndroidContentCaptureManagerCompanion;
import o.DragAndDropNodestartDragAndDropTransfer1;
import o.FlingCancellationException;
import o.ModalBottomSheetKtModalBottomSheet311;
import o.ModalBottomSheetYbuCTN8;
import o.PagerWrapperFlingBehavior;
import o.buildMapping;
import o.getAddressCountry;
import o.getBirthDateFull;
import o.getHandleruiannotations;
import o.getNewPassword;
import o.getNonZeroRgk1Os;
import o.getPostalCode;
import o.handleUrlOverridelambda1;
import o.performLayout;
import o.performMeasureDjhGOtQ;
import o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0;
import o.r8lambdaaawFTjN5WDWgcOgLP5ubNLgfVTw;
import o.setCurrentSemanticsNodesui;
import o.show;
import okio.Okio;

/* JADX INFO: loaded from: classes3.dex */
public abstract class PermissionResultContentKt {
    private static int read = 0;
    private static int serializer = 1;

    public static final void PermissionResultContent(int i, getBirthDateFull getbirthdatefull, Modifier modifier, r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k0) {
        int i2;
        getPostalCode getpostalcode;
        Modifier modifier2;
        int i3 = 2 % 2;
        r8lambdardpfsr94j4iebcwx_kpqzpm8k0.getClass();
        getPostalCode getpostalcode2 = (getPostalCode) getbirthdatefull;
        getpostalcode2.MediaSessionCompatQueueItem(-1265788404);
        getAddressCountry getaddresscountry = getpostalcode2.read;
        if ((i & 6) == 0) {
            i2 = (getpostalcode2.IconCompatParcelizer(r8lambdardpfsr94j4iebcwx_kpqzpm8k0) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        int i4 = i2 | 48;
        Object obj = null;
        if (!(!getpostalcode2.write(i4 & 1, (i4 & 19) != 18))) {
            Modifier.Companion companion = Modifier.Companion;
            Modifier modifierWrite = PaddingKt.write(SizeKt.write(companion, 1.0f), Dimensions.setLogo);
            FlingCancellationException flingCancellationException = Arrangement.MediaDescriptionCompat;
            Alignment.Companion companion2 = Alignment.Companion;
            ModalBottomSheetYbuCTN8 modalBottomSheetYbuCTN8Serializer = ModalBottomSheetKtModalBottomSheet311.serializer(flingCancellationException, companion2.getStart(), getpostalcode2, 0);
            int iHashCode = Long.hashCode(getpostalcode2.RatingCompat);
            DragAndDropNodestartDragAndDropTransfer1 dragAndDropNodestartDragAndDropTransfer1Serializer = getpostalcode2.serializer();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(getpostalcode2, modifierWrite);
            ComposeUiNode.Companion companion3 = ComposeUiNode.Companion;
            r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 constructor = companion3.getConstructor();
            if (getaddresscountry == null) {
                SentryUUID.write();
                throw null;
            }
            int i5 = read + 97;
            serializer = i5 % Fields.SpotShadowColor;
            if (i5 % 2 != 0) {
                getpostalcode2.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg();
                if (!(!getpostalcode2.ComponentActivity)) {
                    getpostalcode2.serializer(constructor);
                } else {
                    getpostalcode2.r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28();
                }
                c8$$ExternalSyntheticOutline0.m(companion3, getpostalcode2, modalBottomSheetYbuCTN8Serializer, getpostalcode2, dragAndDropNodestartDragAndDropTransfer1Serializer);
                AndroidContentCaptureManagerCompanion.write(getpostalcode2, modifierMaterializeModifier, m1$$ExternalSyntheticOutline0.m(companion3, getpostalcode2, Integer.valueOf(iHashCode), getpostalcode2));
                ExtrasKt.read(913837329, handleUrlOverridelambda1.RemoteActionCompatParcelizer(), handleUrlOverridelambda1.RemoteActionCompatParcelizer(), -913837326, handleUrlOverridelambda1.RemoteActionCompatParcelizer(), handleUrlOverridelambda1.RemoteActionCompatParcelizer(), new Object[]{getpostalcode2, SizeKt.m75height3ABfNKs(companion, Dimensions.setUiOptions)});
                Modifier modifierThen = SizeKt.write(PagerWrapperFlingBehavior.IconCompatParcelizer(companion, PagerWrapperFlingBehavior.read(0, getpostalcode2, 1), false, 14), 1.0f).then(new show(1.0f, true));
                ModalBottomSheetYbuCTN8 modalBottomSheetYbuCTN8Serializer2 = ModalBottomSheetKtModalBottomSheet311.serializer(Arrangement.IconCompatParcelizer, companion2.getCenterHorizontally(), getpostalcode2, 54);
                int iHashCode2 = Long.hashCode(getpostalcode2.RatingCompat);
                DragAndDropNodestartDragAndDropTransfer1 dragAndDropNodestartDragAndDropTransfer1Serializer2 = getpostalcode2.serializer();
                Modifier modifierMaterializeModifier2 = ComposedModifierKt.materializeModifier(getpostalcode2, modifierThen);
                r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 constructor2 = companion3.getConstructor();
                getpostalcode2.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg();
                if (getpostalcode2.ComponentActivity) {
                    getpostalcode2.serializer(constructor2);
                    int i6 = read + 83;
                    serializer = i6 % Fields.SpotShadowColor;
                    int i7 = i6 % 2;
                } else {
                    getpostalcode2.r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28();
                    int i8 = read + 19;
                    serializer = i8 % Fields.SpotShadowColor;
                    if (i8 % 2 == 0) {
                        int i9 = 2 / 5;
                    }
                }
                c8$$ExternalSyntheticOutline0.m(companion3, getpostalcode2, modalBottomSheetYbuCTN8Serializer2, getpostalcode2, dragAndDropNodestartDragAndDropTransfer1Serializer2);
                AndroidContentCaptureManagerCompanion.write(getpostalcode2, modifierMaterializeModifier2, m1$$ExternalSyntheticOutline0.m(companion3, getpostalcode2, Integer.valueOf(iHashCode2), getpostalcode2));
                getpostalcode = getpostalcode2;
                getNonZeroRgk1Os.write(Integer.valueOf(R.drawable.ic_rider_safety_not_enabled), "", null, Okio.RemoteActionCompatParcelizer(R.drawable.ic_rider_safety_not_enabled, getpostalcode2, 0), null, null, null, null, ContentScale.Companion.getNone(), null, getpostalcode2, (Painter.$stable << 9) | 48, 6, 31732);
                ExtrasKt.read(913837329, handleUrlOverridelambda1.RemoteActionCompatParcelizer(), handleUrlOverridelambda1.RemoteActionCompatParcelizer(), -913837326, handleUrlOverridelambda1.RemoteActionCompatParcelizer(), handleUrlOverridelambda1.RemoteActionCompatParcelizer(), new Object[]{getpostalcode, SizeKt.m75height3ABfNKs(companion, Dimensions.setMenu)});
                String strStringResource = StringResources_androidKt.stringResource(R.string.rider_safety_tracking_is_not_enabled_message_title, getpostalcode, 0);
                TextStyle textStyle = (TextStyle) performLayout.read(925764871, pcn.serializer(), new Object[0], -925764870, pcn.serializer(), pcn.serializer(), pcn.serializer());
                setCurrentSemanticsNodesui setcurrentsemanticsnodesui = performMeasureDjhGOtQ.RemoteActionCompatParcelizer;
                long presenter = ((buildMapping) getpostalcode.write((getNewPassword) setcurrentsemanticsnodesui)).setPresenter();
                TextAlign.Companion companion4 = TextAlign.Companion;
                TextKt.m131TextNvy7gAk(strStringResource, null, presenter, 0L, null, null, 0L, TextAlign.m3504boximpl(companion4.m3511getCentere0LSkKk()), 0L, 0, false, 0, 0, null, textStyle, getpostalcode, 0, 0, 130042);
                ExtrasKt.read(913837329, handleUrlOverridelambda1.RemoteActionCompatParcelizer(), handleUrlOverridelambda1.RemoteActionCompatParcelizer(), -913837326, handleUrlOverridelambda1.RemoteActionCompatParcelizer(), handleUrlOverridelambda1.RemoteActionCompatParcelizer(), new Object[]{getpostalcode, SizeKt.m75height3ABfNKs(companion, Dimensions.getNestedScrollAxes)});
                TextKt.m131TextNvy7gAk(StringResources_androidKt.stringResource(R.string.rider_safety_tracking_is_not_enabled_message_description, getpostalcode, 0), null, ((buildMapping) getpostalcode.write((getNewPassword) setcurrentsemanticsnodesui)).setPresenter(), 0L, null, null, 0L, TextAlign.m3504boximpl(companion4.m3511getCentere0LSkKk()), 0L, 0, false, 0, 0, null, performLayout.write(), getpostalcode, 0, 0, 130042);
                getpostalcode.IconCompatParcelizer(true);
                PrimaryKt.write(StringResources_androidKt.stringResource(R.string.got_it, getpostalcode, 0), r8lambdardpfsr94j4iebcwx_kpqzpm8k0, SizeKt.write(companion, 1.0f), false, false, null, null, null, null, null, getpostalcode, ((i4 << 3) & 112) | 384, 0, 2040);
                getpostalcode.IconCompatParcelizer(true);
                modifier2 = companion;
            } else {
                getpostalcode2.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg();
                boolean z = getpostalcode2.ComponentActivity;
                throw null;
            }
        } else {
            getpostalcode = getpostalcode2;
            getpostalcode.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
            modifier2 = modifier;
        }
        getHandleruiannotations gethandleruiannotationsMediaDescriptionCompat = getpostalcode.MediaDescriptionCompat();
        if (gethandleruiannotationsMediaDescriptionCompat != null) {
            gethandleruiannotationsMediaDescriptionCompat.serializer = new r8lambdaaawFTjN5WDWgcOgLP5ubNLgfVTw(r8lambdardpfsr94j4iebcwx_kpqzpm8k0, modifier2, i, 15);
        }
        int i10 = read + 91;
        serializer = i10 % Fields.SpotShadowColor;
        if (i10 % 2 != 0) {
            return;
        }
        obj.hashCode();
        throw null;
    }
}
