package com.roadrunner.rider.state.noorders.presentation;

import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.pager.PagerDefaults$$ExternalSyntheticLambda0;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Fields;
import androidx.compose.ui.graphics.RectangleShapeKt;
import androidx.compose.ui.node.ComposeUiNode;
import bo.app.c8$$ExternalSyntheticOutline0;
import bo.app.m1$$ExternalSyntheticOutline0;
import coil3.ExtrasKt;
import com.roadrunner.designsystem.compose.theme.tokens.Dimensions;
import com.roadrunner.rider.state.noorders.api.HomeNoOrdersUiModel;
import com.roadrunner.rrds.compose.component.indicators.shimmer.ShimmeringTextKt;
import io.sentry.SentryUUID;
import o.AndroidContentCaptureManagerCompanion;
import o.DragAndDropNodestartDragAndDropTransfer1;
import o.DragAndDropTargetModifierNode;
import o.ModalBottomSheetKt;
import o.ModalBottomSheetKtModalBottomSheet311;
import o.ModalBottomSheetYbuCTN8;
import o.buildMapping;
import o.getBirthDateFull;
import o.getCreditCardExpirationMonth;
import o.getHandleruiannotations;
import o.getNewPassword;
import o.getPostalCode;
import o.performLayout;
import o.performMeasureDjhGOtQ;
import o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0;
import o.r8lambdaZmWJ7_kmLiTuhtIga_c7SGMfvU;
import o.r8lambdafjQ9B8d5OSR_i2BAJDXqNW6RNrY;
import o.readAndInit;
import o.requestAndResolve;
import o.setCurrentSemanticsNodesui;
import o.transformAndWrite;

/* JADX INFO: loaded from: classes3.dex */
public abstract class RiderStateNoOrdersKt {
    private static int RemoteActionCompatParcelizer = 1;
    private static int write;

    public static final void read(transformAndWrite transformandwrite, HomeNoOrdersUiModel homeNoOrdersUiModel, Modifier modifier, getBirthDateFull getbirthdatefull, int i) {
        int i2;
        int i3;
        int i4 = 2 % 2;
        homeNoOrdersUiModel.getClass();
        getPostalCode getpostalcode = (getPostalCode) getbirthdatefull;
        getpostalcode.MediaSessionCompatQueueItem(-1527024922);
        boolean z = true;
        if ((i & 6) == 0) {
            i2 = (getpostalcode.IconCompatParcelizer(transformandwrite) ^ true ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            int i5 = RemoteActionCompatParcelizer + 31;
            write = i5 % Fields.SpotShadowColor;
            int i6 = i5 % 2;
            if (getpostalcode.read(homeNoOrdersUiModel)) {
                int i7 = RemoteActionCompatParcelizer + 51;
                write = i7 % Fields.SpotShadowColor;
                int i8 = i7 % 2;
                i3 = 32;
            } else {
                i3 = 16;
            }
            i2 |= i3;
        }
        int i9 = i2 | 384;
        if ((i9 & 147) != 146) {
            int i10 = RemoteActionCompatParcelizer + 27;
            write = i10 % Fields.SpotShadowColor;
            int i11 = i10 % 2;
        } else {
            z = false;
        }
        if (getpostalcode.write(i9 & 1, z)) {
            modifier = Modifier.Companion;
            Object objComponentActivity = getpostalcode.ComponentActivity();
            if (objComponentActivity == getCreditCardExpirationMonth.write) {
                int i12 = RemoteActionCompatParcelizer + 75;
                write = i12 % Fields.SpotShadowColor;
                if (i12 % 2 != 0) {
                    getpostalcode.write(readAndInit.IconCompatParcelizer);
                    throw null;
                }
                objComponentActivity = readAndInit.IconCompatParcelizer;
                getpostalcode.write(objComponentActivity);
            }
            RiderStateNoOrdersContent((requestAndResolve) ExtrasKt.write(((HomeNoOrdersUiModelImpl) homeNoOrdersUiModel).MediaSessionCompatQueueItem, getpostalcode, 0).getValue(), modifier, ExtrasKt.write(922074343, new PagerDefaults$$ExternalSyntheticLambda0((r8lambdafjQ9B8d5OSR_i2BAJDXqNW6RNrY) objComponentActivity, 21, homeNoOrdersUiModel), getpostalcode), getpostalcode, ((i9 >> 3) & 112) | 384);
        } else {
            getpostalcode.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
        }
        Modifier modifier2 = modifier;
        getHandleruiannotations gethandleruiannotationsMediaDescriptionCompat = getpostalcode.MediaDescriptionCompat();
        if (gethandleruiannotationsMediaDescriptionCompat != null) {
            gethandleruiannotationsMediaDescriptionCompat.serializer = new r8lambdaZmWJ7_kmLiTuhtIga_c7SGMfvU(i, 8, transformandwrite, homeNoOrdersUiModel, modifier2);
        }
    }

    public static final void RiderStateNoOrdersContent(requestAndResolve requestandresolve, Modifier modifier, DragAndDropTargetModifierNode dragAndDropTargetModifierNode, getBirthDateFull getbirthdatefull, int i) {
        int i2;
        int i3;
        int i4;
        int i5 = 2 % 2;
        int i6 = write + 21;
        RemoteActionCompatParcelizer = i6 % Fields.SpotShadowColor;
        int i7 = i6 % 2;
        requestandresolve.getClass();
        getPostalCode getpostalcode = (getPostalCode) getbirthdatefull;
        getpostalcode.MediaSessionCompatQueueItem(857846485);
        if ((i & 6) == 0) {
            int i8 = write + 113;
            RemoteActionCompatParcelizer = i8 % Fields.SpotShadowColor;
            if ((i8 % 2 != 0 ? (i & 8) != 0 : (i & 59) != 0) ? getpostalcode.IconCompatParcelizer(requestandresolve) : getpostalcode.read(requestandresolve)) {
                int i9 = write + 115;
                int i10 = i9 % Fields.SpotShadowColor;
                RemoteActionCompatParcelizer = i10;
                int i11 = i9 % 2;
                int i12 = i10 + 101;
                write = i12 % Fields.SpotShadowColor;
                int i13 = i12 % 2;
                i4 = 4;
            } else {
                i4 = 2;
            }
            i2 = i4 | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            int i14 = RemoteActionCompatParcelizer + 13;
            write = i14 % Fields.SpotShadowColor;
            int i15 = i14 % 2;
            i2 |= getpostalcode.read(modifier) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            if (getpostalcode.IconCompatParcelizer(dragAndDropTargetModifierNode)) {
                i3 = Fields.RotationX;
            } else {
                int i16 = RemoteActionCompatParcelizer + 35;
                write = i16 % Fields.SpotShadowColor;
                int i17 = i16 % 2;
                i3 = Fields.SpotShadowColor;
            }
            i2 |= i3;
        }
        if (!getpostalcode.write(i2 & 1, (i2 & 147) != 146)) {
            getpostalcode.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
        } else {
            modifier.getClass();
            Modifier modifierWrite = SizeKt.write(modifier, 1.0f);
            setCurrentSemanticsNodesui setcurrentsemanticsnodesui = performMeasureDjhGOtQ.RemoteActionCompatParcelizer;
            Modifier modifierWrite2 = PaddingKt.write(BackgroundKt.m20backgroundbw27NRU(modifierWrite, ((buildMapping) getpostalcode.write((getNewPassword) setcurrentsemanticsnodesui)).getPopupTheme(), RectangleShapeKt.getRectangleShape()), Dimensions.getAnimatedVisibility);
            ModalBottomSheetYbuCTN8 modalBottomSheetYbuCTN8Serializer = ModalBottomSheetKtModalBottomSheet311.serializer(Arrangement.MediaDescriptionCompat, Alignment.Companion.getStart(), getpostalcode, 0);
            int iHashCode = Long.hashCode(getpostalcode.RatingCompat);
            DragAndDropNodestartDragAndDropTransfer1 dragAndDropNodestartDragAndDropTransfer1Serializer = getpostalcode.serializer();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(getpostalcode, modifierWrite2);
            ComposeUiNode.Companion companion = ComposeUiNode.Companion;
            r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 constructor = companion.getConstructor();
            Object obj = null;
            if (getpostalcode.read == null) {
                SentryUUID.write();
                throw null;
            }
            int i18 = RemoteActionCompatParcelizer + 113;
            write = i18 % Fields.SpotShadowColor;
            if (i18 % 2 != 0) {
                getpostalcode.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg();
                boolean z = getpostalcode.ComponentActivity;
                obj.hashCode();
                throw null;
            }
            getpostalcode.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg();
            if (getpostalcode.ComponentActivity) {
                getpostalcode.serializer(constructor);
            } else {
                getpostalcode.r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28();
            }
            c8$$ExternalSyntheticOutline0.m(companion, getpostalcode, modalBottomSheetYbuCTN8Serializer, getpostalcode, dragAndDropNodestartDragAndDropTransfer1Serializer);
            AndroidContentCaptureManagerCompanion.write(getpostalcode, modifierMaterializeModifier, m1$$ExternalSyntheticOutline0.m(companion, getpostalcode, Integer.valueOf(iHashCode), getpostalcode));
            ShimmeringTextKt.read(requestandresolve.write, null, performLayout.MediaSessionCompatToken(), ((buildMapping) getpostalcode.write((getNewPassword) setcurrentsemanticsnodesui)).setMenu(), 0L, ((buildMapping) getpostalcode.write((getNewPassword) setcurrentsemanticsnodesui)).getPopupTheme(), getpostalcode, 0);
            dragAndDropTargetModifierNode.invoke(ModalBottomSheetKt.write, getpostalcode, Integer.valueOf(((i2 >> 3) & 112) | 6));
            getpostalcode.IconCompatParcelizer(true);
        }
        getHandleruiannotations gethandleruiannotationsMediaDescriptionCompat = getpostalcode.MediaDescriptionCompat();
        if (gethandleruiannotationsMediaDescriptionCompat != null) {
            gethandleruiannotationsMediaDescriptionCompat.serializer = new r8lambdaZmWJ7_kmLiTuhtIga_c7SGMfvU(requestandresolve, modifier, dragAndDropTargetModifierNode, i, 9);
            int i19 = write + 13;
            RemoteActionCompatParcelizer = i19 % Fields.SpotShadowColor;
            int i20 = i19 % 2;
        }
    }
}
