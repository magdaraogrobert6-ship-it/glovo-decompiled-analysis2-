package com.roadrunner.rider.safety.report.presentation;

import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.material3.TextKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Fields;
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
import com.roadrunner.rrds.compose.component.layouts.DividerKt;
import io.sentry.SentryUUID;
import o.AndroidContentCaptureManagerCompanion;
import o.DragAndDropNodestartDragAndDropTransfer1;
import o.FlingCancellationException;
import o.ModalBottomSheetKtModalBottomSheet311;
import o.ModalBottomSheetYbuCTN8;
import o.buildMapping;
import o.convertToHex;
import o.getAddressCountry;
import o.getBirthDateFull;
import o.getHandleruiannotations;
import o.getNewPassword;
import o.getPostalCode;
import o.getPreinstallFilePath;
import o.handleUrlOverridelambda1;
import o.performLayout;
import o.performMeasureDjhGOtQ;
import o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0;
import o.setCurrentSemanticsNodesui;

/* JADX INFO: loaded from: classes3.dex */
public abstract class ScoreBreakdownKt {
    private static int IconCompatParcelizer = 0;
    private static int read = 1;

    public static final void ScoreBreakdown(getPreinstallFilePath getpreinstallfilepath, getPreinstallFilePath getpreinstallfilepath2, getPreinstallFilePath getpreinstallfilepath3, boolean z, Modifier modifier, getBirthDateFull getbirthdatefull, int i) {
        int i2;
        getPostalCode getpostalcode;
        boolean z2;
        int i3;
        int i4;
        int i5 = 2 % 2;
        getPostalCode getpostalcode2 = (getPostalCode) getbirthdatefull;
        getpostalcode2.MediaSessionCompatQueueItem(-2101354848);
        getAddressCountry getaddresscountry = getpostalcode2.read;
        if ((i & 6) == 0) {
            int i6 = IconCompatParcelizer + 121;
            read = i6 % Fields.SpotShadowColor;
            int i7 = i6 % 2;
            if (getpostalcode2.read(getpreinstallfilepath)) {
                int i8 = IconCompatParcelizer + 41;
                read = i8 % Fields.SpotShadowColor;
                int i9 = i8 % 2;
                i4 = 4;
            } else {
                i4 = 2;
            }
            i2 = i4 | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= getpostalcode2.read(getpreinstallfilepath2) ? 32 : 16;
            int i10 = IconCompatParcelizer + 67;
            read = i10 % Fields.SpotShadowColor;
            int i11 = i10 % 2;
        }
        Object obj = null;
        if ((i & 384) == 0) {
            int i12 = read + 79;
            IconCompatParcelizer = i12 % Fields.SpotShadowColor;
            if (i12 % 2 == 0) {
                if (getpostalcode2.read(getpreinstallfilepath3)) {
                    int i13 = IconCompatParcelizer + 111;
                    read = i13 % Fields.SpotShadowColor;
                    i3 = i13 % 2 == 0 ? 27816 : Fields.RotationX;
                } else {
                    i3 = Fields.SpotShadowColor;
                }
                i2 |= i3;
            } else {
                getpostalcode2.read(getpreinstallfilepath3);
                obj.hashCode();
                throw null;
            }
        }
        if ((i & 3072) == 0) {
            i2 |= getpostalcode2.write(z) ? Fields.CameraDistance : Fields.RotationZ;
        }
        if ((i & 24576) == 0) {
            i2 |= getpostalcode2.read(modifier) ? Fields.Clip : 8192;
        }
        if (getpostalcode2.write(i2 & 1, (i2 & 9363) != 9362)) {
            FlingCancellationException flingCancellationException = Arrangement.MediaDescriptionCompat;
            Alignment.Companion companion = Alignment.Companion;
            ModalBottomSheetYbuCTN8 modalBottomSheetYbuCTN8Serializer = ModalBottomSheetKtModalBottomSheet311.serializer(flingCancellationException, companion.getStart(), getpostalcode2, 0);
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
                c8$$ExternalSyntheticOutline0.m(companion2, getpostalcode2, modalBottomSheetYbuCTN8Serializer, getpostalcode2, dragAndDropNodestartDragAndDropTransfer1Serializer);
                AndroidContentCaptureManagerCompanion.write(getpostalcode2, modifierMaterializeModifier, m1$$ExternalSyntheticOutline0.m(companion2, getpostalcode2, Integer.valueOf(iHashCode), getpostalcode2));
                String strStringResource = StringResources_androidKt.stringResource(R.string.rider_safety_how_is_your_safety_score_calculated, getpostalcode2, 0);
                TextStyle textStyleMediaSessionCompatToken = performLayout.MediaSessionCompatToken();
                setCurrentSemanticsNodesui setcurrentsemanticsnodesui = performMeasureDjhGOtQ.RemoteActionCompatParcelizer;
                long presenter = ((buildMapping) getpostalcode2.write((getNewPassword) setcurrentsemanticsnodesui)).setPresenter();
                TextAlign.Companion companion3 = TextAlign.Companion;
                TextKt.m131TextNvy7gAk(strStringResource, null, presenter, 0L, null, null, 0L, TextAlign.m3504boximpl(companion3.m3516getStarte0LSkKk()), 0L, 0, false, 0, 0, null, textStyleMediaSessionCompatToken, getpostalcode2, 0, 0, 130042);
                Modifier.Companion companion4 = Modifier.Companion;
                ExtrasKt.read(913837329, handleUrlOverridelambda1.RemoteActionCompatParcelizer(), handleUrlOverridelambda1.RemoteActionCompatParcelizer(), -913837326, handleUrlOverridelambda1.RemoteActionCompatParcelizer(), handleUrlOverridelambda1.RemoteActionCompatParcelizer(), new Object[]{getpostalcode2, SizeKt.m75height3ABfNKs(companion4, Dimensions.setMenu)});
                TextKt.m131TextNvy7gAk(StringResources_androidKt.stringResource(R.string.rider_safety_score_description, getpostalcode2, 0), null, ((buildMapping) getpostalcode2.write((getNewPassword) setcurrentsemanticsnodesui)).setPresenter(), 0L, null, null, 0L, TextAlign.m3504boximpl(companion3.m3516getStarte0LSkKk()), 0L, 0, false, 0, 0, null, performLayout.write(), getpostalcode2, 0, 0, 130042);
                float f = Dimensions.setHasNonEmbeddedTabs;
                getpostalcode = getpostalcode2;
                ExtrasKt.read(913837329, handleUrlOverridelambda1.RemoteActionCompatParcelizer(), handleUrlOverridelambda1.RemoteActionCompatParcelizer(), -913837326, handleUrlOverridelambda1.RemoteActionCompatParcelizer(), handleUrlOverridelambda1.RemoteActionCompatParcelizer(), new Object[]{getpostalcode2, SizeKt.m75height3ABfNKs(companion4, f)});
                ScoreItemKt.ScoreItem(StringResources_androidKt.stringResource(R.string.rider_safety_focused_riding, getpostalcode, 0), StringResources_androidKt.stringResource(R.string.rider_safety_focused_riding_description, getpostalcode, 0), getpreinstallfilepath3.write, getpreinstallfilepath3.IconCompatParcelizer, SizeKt.write(companion4, 1.0f), getpostalcode, 24576);
                ExtrasKt.read(913837329, handleUrlOverridelambda1.RemoteActionCompatParcelizer(), handleUrlOverridelambda1.RemoteActionCompatParcelizer(), -913837326, handleUrlOverridelambda1.RemoteActionCompatParcelizer(), handleUrlOverridelambda1.RemoteActionCompatParcelizer(), new Object[]{getpostalcode, SizeKt.m75height3ABfNKs(companion4, f)});
                DividerKt.read(0.0f, 0, 7, 0L, getpostalcode, null);
                ExtrasKt.read(913837329, handleUrlOverridelambda1.RemoteActionCompatParcelizer(), handleUrlOverridelambda1.RemoteActionCompatParcelizer(), -913837326, handleUrlOverridelambda1.RemoteActionCompatParcelizer(), handleUrlOverridelambda1.RemoteActionCompatParcelizer(), new Object[]{getpostalcode, SizeKt.m75height3ABfNKs(companion4, f)});
                ScoreItemKt.ScoreItem(StringResources_androidKt.stringResource(R.string.rider_safety_maintaining_speed_limits, getpostalcode, 0), StringResources_androidKt.stringResource(R.string.rider_safety_maintaining_speed_limits_description, getpostalcode, 0), getpreinstallfilepath.write, getpreinstallfilepath.IconCompatParcelizer, SizeKt.write(companion4, 1.0f), getpostalcode, 24576);
                ExtrasKt.read(913837329, handleUrlOverridelambda1.RemoteActionCompatParcelizer(), handleUrlOverridelambda1.RemoteActionCompatParcelizer(), -913837326, handleUrlOverridelambda1.RemoteActionCompatParcelizer(), handleUrlOverridelambda1.RemoteActionCompatParcelizer(), new Object[]{getpostalcode, SizeKt.m75height3ABfNKs(companion4, f)});
                DividerKt.read(0.0f, 0, 7, 0L, getpostalcode, null);
                ExtrasKt.read(913837329, handleUrlOverridelambda1.RemoteActionCompatParcelizer(), handleUrlOverridelambda1.RemoteActionCompatParcelizer(), -913837326, handleUrlOverridelambda1.RemoteActionCompatParcelizer(), handleUrlOverridelambda1.RemoteActionCompatParcelizer(), new Object[]{getpostalcode, SizeKt.m75height3ABfNKs(companion4, f)});
                ScoreItemKt.ScoreItem(StringResources_androidKt.stringResource(R.string.rider_safety_smooth_riding_limits, getpostalcode, 0), StringResources_androidKt.stringResource(R.string.rider_safety_smooth_riding_limits_description, getpostalcode, 0), getpreinstallfilepath2.write, getpreinstallfilepath2.IconCompatParcelizer, SizeKt.write(companion4, 1.0f), getpostalcode, 24576);
                ExtrasKt.read(913837329, handleUrlOverridelambda1.RemoteActionCompatParcelizer(), handleUrlOverridelambda1.RemoteActionCompatParcelizer(), -913837326, handleUrlOverridelambda1.RemoteActionCompatParcelizer(), handleUrlOverridelambda1.RemoteActionCompatParcelizer(), new Object[]{getpostalcode, SizeKt.m75height3ABfNKs(companion4, f)});
                DividerKt.read(0.0f, 0, 7, 0L, getpostalcode, null);
                ExtrasKt.read(913837329, handleUrlOverridelambda1.RemoteActionCompatParcelizer(), handleUrlOverridelambda1.RemoteActionCompatParcelizer(), -913837326, handleUrlOverridelambda1.RemoteActionCompatParcelizer(), handleUrlOverridelambda1.RemoteActionCompatParcelizer(), new Object[]{getpostalcode, SizeKt.m75height3ABfNKs(companion4, f)});
                if (z) {
                    getpostalcode.serializer(1605349818);
                    ModalBottomSheetYbuCTN8 modalBottomSheetYbuCTN8Serializer2 = ModalBottomSheetKtModalBottomSheet311.serializer(flingCancellationException, companion.getStart(), getpostalcode, 0);
                    int iHashCode2 = Long.hashCode(getpostalcode.RatingCompat);
                    DragAndDropNodestartDragAndDropTransfer1 dragAndDropNodestartDragAndDropTransfer1Serializer2 = getpostalcode.serializer();
                    Modifier modifierMaterializeModifier2 = ComposedModifierKt.materializeModifier(getpostalcode, companion4);
                    r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 constructor2 = companion2.getConstructor();
                    getpostalcode.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg();
                    if (getpostalcode.ComponentActivity) {
                        getpostalcode.serializer(constructor2);
                    } else {
                        getpostalcode.r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28();
                    }
                    c8$$ExternalSyntheticOutline0.m(companion2, getpostalcode, modalBottomSheetYbuCTN8Serializer2, getpostalcode, dragAndDropNodestartDragAndDropTransfer1Serializer2);
                    AndroidContentCaptureManagerCompanion.write(getpostalcode, modifierMaterializeModifier2, m1$$ExternalSyntheticOutline0.m(companion2, getpostalcode, Integer.valueOf(iHashCode2), getpostalcode));
                    TextKt.m131TextNvy7gAk(StringResources_androidKt.stringResource(R.string.rider_safety_score_affects, getpostalcode, 0), null, ((buildMapping) getpostalcode.write((getNewPassword) setcurrentsemanticsnodesui)).setPresenter(), 0L, null, null, 0L, TextAlign.m3504boximpl(companion3.m3516getStarte0LSkKk()), 0L, 0, false, 0, 0, null, (TextStyle) performLayout.read(-1830567612, pcn.serializer(), new Object[0], 1830567614, pcn.serializer(), pcn.serializer(), pcn.serializer()), getpostalcode, 0, 0, 130042);
                    ExtrasKt.read(913837329, handleUrlOverridelambda1.RemoteActionCompatParcelizer(), handleUrlOverridelambda1.RemoteActionCompatParcelizer(), -913837326, handleUrlOverridelambda1.RemoteActionCompatParcelizer(), handleUrlOverridelambda1.RemoteActionCompatParcelizer(), new Object[]{getpostalcode, SizeKt.m75height3ABfNKs(companion4, Dimensions.getNestedScrollAxes)});
                    TextKt.m131TextNvy7gAk(StringResources_androidKt.stringResource(R.string.rider_safety_score_affects_description, getpostalcode, 0), null, ((buildMapping) getpostalcode.write((getNewPassword) setcurrentsemanticsnodesui)).setPresenter(), 0L, null, null, 0L, TextAlign.m3504boximpl(companion3.m3516getStarte0LSkKk()), 0L, 0, false, 0, 0, null, performLayout.write(), getpostalcode, 0, 0, 130042);
                    z2 = true;
                    getpostalcode.IconCompatParcelizer(true);
                    getpostalcode.IconCompatParcelizer(false);
                } else {
                    z2 = true;
                    getpostalcode.serializer(1606012908);
                    getpostalcode.IconCompatParcelizer(false);
                }
                getpostalcode.IconCompatParcelizer(z2);
            } else {
                SentryUUID.write();
                throw null;
            }
        } else {
            getpostalcode = getpostalcode2;
            getpostalcode.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
        }
        getHandleruiannotations gethandleruiannotationsMediaDescriptionCompat = getpostalcode.MediaDescriptionCompat();
        if (gethandleruiannotationsMediaDescriptionCompat != null) {
            gethandleruiannotationsMediaDescriptionCompat.serializer = new convertToHex(getpreinstallfilepath, getpreinstallfilepath2, getpreinstallfilepath3, z, modifier, i);
        }
    }
}
