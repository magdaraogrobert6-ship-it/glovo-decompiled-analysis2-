package com.roadrunner.rider.state.ondemand.presentation.compose;

import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.BorderKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.material3.TextKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Fields;
import androidx.compose.ui.graphics.RectangleShapeKt;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.res.StringResources_androidKt;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.tooling.PreviewActivity$$ExternalSyntheticLambda2;
import bo.app.c8$$ExternalSyntheticOutline0;
import bo.app.m1$$ExternalSyntheticOutline0;
import coil3.ExtrasKt;
import com.logistics.rider.glovo.R;
import com.roadrunner.designsystem.compose.theme.tokens.Dimensions;
import io.sentry.SentryUUID;
import o.AndroidContentCaptureManagerCompanion;
import o.AttributionHandler;
import o.DragAndDropNodestartDragAndDropTransfer1;
import o.DragAndDropTargetModifierNode;
import o.ModalBottomSheetKtModalBottomSheet311;
import o.ModalBottomSheetYbuCTN8;
import o.SessionMutex;
import o.SessionMutexSession;
import o.buildMapping;
import o.dc;
import o.getBirthDateFull;
import o.getCurrentSessionimpl;
import o.getDeviceManufacturer;
import o.getHandleruiannotations;
import o.getNewPassword;
import o.getPostalCode;
import o.getTopLeftannotations;
import o.handleUrlOverridelambda1;
import o.p7;
import o.performLayout;
import o.performMeasureDjhGOtQ;
import o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0;
import o.setCurrentSemanticsNodesui;
import o.withSessionCancellingPreviousimpl;

/* JADX INFO: loaded from: classes3.dex */
public abstract class OnDemandWorkingKt {
    private static int RemoteActionCompatParcelizer = 1;
    private static int read;

    public static final void WorkAreaColumn(int i, getBirthDateFull getbirthdatefull, Modifier modifier, String str) {
        int i2;
        getPostalCode getpostalcode;
        Modifier modifier2;
        int i3;
        int i4 = 2 % 2;
        int i5 = read + 41;
        RemoteActionCompatParcelizer = i5 % Fields.SpotShadowColor;
        int i6 = i5 % 2;
        getPostalCode getpostalcode2 = (getPostalCode) getbirthdatefull;
        getpostalcode2.MediaSessionCompatQueueItem(-1274487295);
        if ((i & 6) == 0) {
            int i7 = RemoteActionCompatParcelizer + 51;
            read = i7 % Fields.SpotShadowColor;
            int i8 = i7 % 2;
            if (!(!getpostalcode2.read(str))) {
                int i9 = read + 31;
                RemoteActionCompatParcelizer = i9 % Fields.SpotShadowColor;
                int i10 = i9 % 2;
                i3 = 4;
            } else {
                i3 = 2;
            }
            i2 = i3 | i;
        } else {
            i2 = i;
        }
        int i11 = i2 | 48;
        if (getpostalcode2.write(i11 & 1, (i11 & 19) != 18)) {
            Modifier.Companion companion = Modifier.Companion;
            ModalBottomSheetYbuCTN8 modalBottomSheetYbuCTN8Serializer = ModalBottomSheetKtModalBottomSheet311.serializer(Arrangement.MediaDescriptionCompat, Alignment.Companion.getStart(), getpostalcode2, 0);
            int iHashCode = Long.hashCode(getpostalcode2.RatingCompat);
            DragAndDropNodestartDragAndDropTransfer1 dragAndDropNodestartDragAndDropTransfer1Serializer = getpostalcode2.serializer();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(getpostalcode2, companion);
            ComposeUiNode.Companion companion2 = ComposeUiNode.Companion;
            r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 constructor = companion2.getConstructor();
            if (getpostalcode2.read == null) {
                SentryUUID.write();
                throw null;
            }
            getpostalcode2.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg();
            if (getpostalcode2.ComponentActivity) {
                getpostalcode2.serializer(constructor);
            } else {
                getpostalcode2.r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28();
            }
            c8$$ExternalSyntheticOutline0.m(companion2, getpostalcode2, modalBottomSheetYbuCTN8Serializer, getpostalcode2, dragAndDropNodestartDragAndDropTransfer1Serializer);
            AndroidContentCaptureManagerCompanion.write(getpostalcode2, modifierMaterializeModifier, m1$$ExternalSyntheticOutline0.m(companion2, getpostalcode2, Integer.valueOf(iHashCode), getpostalcode2));
            String strStringResource = StringResources_androidKt.stringResource(R.string.status_shift_work_area, getpostalcode2, 0);
            TextStyle textStyle = (TextStyle) performLayout.addOnMultiWindowModeChangedListener.MediaSessionCompatResultReceiverWrapper();
            setCurrentSemanticsNodesui setcurrentsemanticsnodesui = performMeasureDjhGOtQ.RemoteActionCompatParcelizer;
            TextKt.m131TextNvy7gAk(strStringResource, null, ((buildMapping) getpostalcode2.write((getNewPassword) setcurrentsemanticsnodesui)).generateLayoutParams(), 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, textStyle, getpostalcode2, 0, 0, 131066);
            ExtrasKt.read(913837329, handleUrlOverridelambda1.RemoteActionCompatParcelizer(), handleUrlOverridelambda1.RemoteActionCompatParcelizer(), -913837326, handleUrlOverridelambda1.RemoteActionCompatParcelizer(), handleUrlOverridelambda1.RemoteActionCompatParcelizer(), new Object[]{getpostalcode2, SizeKt.m83size3ABfNKs(companion, Dimensions.setPrimaryBackground)});
            TextKt.m131TextNvy7gAk(str, null, ((buildMapping) getpostalcode2.write((getNewPassword) setcurrentsemanticsnodesui)).setWindowCallback(), 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, (TextStyle) performLayout.addOnUserLeaveHintListener.MediaSessionCompatResultReceiverWrapper(), getpostalcode2, i11 & 14, 0, 131066);
            getpostalcode = getpostalcode2;
            getpostalcode.IconCompatParcelizer(true);
            modifier2 = companion;
        } else {
            getpostalcode = getpostalcode2;
            getpostalcode.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
            int i12 = RemoteActionCompatParcelizer + 87;
            read = i12 % Fields.SpotShadowColor;
            int i13 = i12 % 2;
            modifier2 = modifier;
        }
        getHandleruiannotations gethandleruiannotationsMediaDescriptionCompat = getpostalcode.MediaDescriptionCompat();
        if (gethandleruiannotationsMediaDescriptionCompat != null) {
            gethandleruiannotationsMediaDescriptionCompat.serializer = new dc(i, str, modifier2, 21);
        }
    }

    public static final void OnDemandWorkingColumn(AttributionHandler attributionHandler, r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k0, DragAndDropTargetModifierNode dragAndDropTargetModifierNode, Modifier modifier, getBirthDateFull getbirthdatefull, int i) {
        int i2;
        boolean z;
        getPostalCode getpostalcode;
        int i3;
        int i4;
        int i5 = 2 % 2;
        r8lambdardpfsr94j4iebcwx_kpqzpm8k0.getClass();
        getPostalCode getpostalcode2 = (getPostalCode) getbirthdatefull;
        getpostalcode2.MediaSessionCompatQueueItem(322127029);
        if ((i & 6) == 0) {
            int i6 = RemoteActionCompatParcelizer + 69;
            read = i6 % Fields.SpotShadowColor;
            int i7 = i6 % 2;
            if (!((i & 8) == 0 ? getpostalcode2.read(attributionHandler) : getpostalcode2.IconCompatParcelizer(attributionHandler))) {
                i4 = 2;
            } else {
                int i8 = read + 91;
                RemoteActionCompatParcelizer = i8 % Fields.SpotShadowColor;
                int i9 = i8 % 2;
                i4 = 4;
            }
            i2 = i4 | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            int i10 = RemoteActionCompatParcelizer + 47;
            read = i10 % Fields.SpotShadowColor;
            if (i10 % 2 != 0) {
                getpostalcode2.IconCompatParcelizer(r8lambdardpfsr94j4iebcwx_kpqzpm8k0);
                throw null;
            }
            i2 |= getpostalcode2.IconCompatParcelizer(r8lambdardpfsr94j4iebcwx_kpqzpm8k0) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            if (getpostalcode2.IconCompatParcelizer(dragAndDropTargetModifierNode)) {
                i3 = Fields.RotationX;
            } else {
                int i11 = read + 91;
                RemoteActionCompatParcelizer = i11 % Fields.SpotShadowColor;
                int i12 = i11 % 2;
                i3 = Fields.SpotShadowColor;
            }
            i2 |= i3;
        }
        if ((i & 3072) == 0) {
            int i13 = read + 21;
            RemoteActionCompatParcelizer = i13 % Fields.SpotShadowColor;
            int i14 = i13 % 2;
            i2 |= getpostalcode2.read(modifier) ? Fields.CameraDistance : Fields.RotationZ;
        }
        if ((i2 & 1171) != 1170) {
            int i15 = read + 21;
            RemoteActionCompatParcelizer = i15 % Fields.SpotShadowColor;
            int i16 = i15 % 2;
            z = true;
        } else {
            z = false;
        }
        if (getpostalcode2.write(i2 & 1, z)) {
            int i17 = RemoteActionCompatParcelizer + 85;
            read = i17 % Fields.SpotShadowColor;
            int i18 = i17 % 2;
            setCurrentSemanticsNodesui setcurrentsemanticsnodesui = performMeasureDjhGOtQ.RemoteActionCompatParcelizer;
            Modifier modifierWrite = PaddingKt.write(BackgroundKt.m20backgroundbw27NRU(modifier, ((buildMapping) getpostalcode2.write((getNewPassword) setcurrentsemanticsnodesui)).getPopupTheme(), RectangleShapeKt.getRectangleShape()), Dimensions.getAnimatedVisibility);
            ModalBottomSheetYbuCTN8 modalBottomSheetYbuCTN8Serializer = ModalBottomSheetKtModalBottomSheet311.serializer(Arrangement.MediaDescriptionCompat, Alignment.Companion.getStart(), getpostalcode2, 0);
            int iHashCode = Long.hashCode(getpostalcode2.RatingCompat);
            DragAndDropNodestartDragAndDropTransfer1 dragAndDropNodestartDragAndDropTransfer1Serializer = getpostalcode2.serializer();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(getpostalcode2, modifierWrite);
            ComposeUiNode.Companion companion = ComposeUiNode.Companion;
            r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 constructor = companion.getConstructor();
            if (getpostalcode2.read == null) {
                SentryUUID.write();
                throw null;
            }
            getpostalcode2.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg();
            if (getpostalcode2.ComponentActivity) {
                getpostalcode2.serializer(constructor);
            } else {
                getpostalcode2.r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28();
            }
            c8$$ExternalSyntheticOutline0.m(companion, getpostalcode2, modalBottomSheetYbuCTN8Serializer, getpostalcode2, dragAndDropNodestartDragAndDropTransfer1Serializer);
            AndroidContentCaptureManagerCompanion.write(getpostalcode2, modifierMaterializeModifier, m1$$ExternalSyntheticOutline0.m(companion, getpostalcode2, Integer.valueOf(iHashCode), getpostalcode2));
            getDeviceManufacturer.write(0, getpostalcode2, null, attributionHandler.RemoteActionCompatParcelizer);
            Modifier.Companion companion2 = Modifier.Companion;
            ExtrasKt.read(913837329, handleUrlOverridelambda1.RemoteActionCompatParcelizer(), handleUrlOverridelambda1.RemoteActionCompatParcelizer(), -913837326, handleUrlOverridelambda1.RemoteActionCompatParcelizer(), handleUrlOverridelambda1.RemoteActionCompatParcelizer(), new Object[]{getpostalcode2, SizeKt.m83size3ABfNKs(companion2, Dimensions.setTabContainer)});
            Modifier modifierM20backgroundbw27NRU = BackgroundKt.m20backgroundbw27NRU(SizeKt.write(companion2, 1.0f), ((buildMapping) getpostalcode2.write((getNewPassword) setcurrentsemanticsnodesui)).getPopupTheme(), RectangleShapeKt.getRectangleShape());
            float f = Dimensions.write;
            long popupTheme = ((buildMapping) getpostalcode2.write((getNewPassword) setcurrentsemanticsnodesui)).setPopupTheme();
            float f2 = Dimensions.accessensureViewModelStore;
            Modifier modifierWrite2 = BorderKt.write(modifierM20backgroundbw27NRU, f, popupTheme, RoundedCornerShapeKt.IconCompatParcelizer(f2));
            SessionMutexSession sessionMutexSessionRemoteActionCompatParcelizer = withSessionCancellingPreviousimpl.RemoteActionCompatParcelizer(Dimensions.generateLayoutParams, 62);
            SessionMutex sessionMutexSerializer = withSessionCancellingPreviousimpl.serializer(((buildMapping) getpostalcode2.write((getNewPassword) setcurrentsemanticsnodesui))._init_lambda4(), getpostalcode2, 0);
            getTopLeftannotations gettopleftannotationsIconCompatParcelizer = RoundedCornerShapeKt.IconCompatParcelizer(f2);
            DragAndDropTargetModifierNode dragAndDropTargetModifierNodeWrite = ExtrasKt.write(1801421261, new PreviewActivity$$ExternalSyntheticLambda2(modifierWrite2, attributionHandler, r8lambdardpfsr94j4iebcwx_kpqzpm8k0, dragAndDropTargetModifierNode, 7), getpostalcode2);
            getpostalcode = getpostalcode2;
            getCurrentSessionimpl.read(null, gettopleftannotationsIconCompatParcelizer, sessionMutexSerializer, sessionMutexSessionRemoteActionCompatParcelizer, null, dragAndDropTargetModifierNodeWrite, getpostalcode, 196608, 17);
            getpostalcode.IconCompatParcelizer(true);
        } else {
            getpostalcode = getpostalcode2;
            getpostalcode.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
        }
        getHandleruiannotations gethandleruiannotationsMediaDescriptionCompat = getpostalcode.MediaDescriptionCompat();
        if (gethandleruiannotationsMediaDescriptionCompat != null) {
            gethandleruiannotationsMediaDescriptionCompat.serializer = new p7((Object) attributionHandler, (Object) r8lambdardpfsr94j4iebcwx_kpqzpm8k0, (Object) dragAndDropTargetModifierNode, modifier, i, 19);
        }
    }
}
