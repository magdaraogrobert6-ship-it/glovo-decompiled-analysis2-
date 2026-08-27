package com.roadrunner.home.expandedbubblelayer.presentation.compose;

import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.material3.TextKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Fields;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.unit.Dp;
import bo.app.c8$$ExternalSyntheticOutline0;
import bo.app.m1$$ExternalSyntheticOutline0;
import coil3.ExtrasKt;
import com.airbnb.lottie.compose.RememberLottieCompositionKt;
import com.roadrunner.designsystem.compose.theme.tokens.Dimensions;
import io.sentry.SentryUUID;
import o.AndroidContentCaptureManagerCompanion;
import o.ColorModel;
import o.DragAndDropNodestartDragAndDropTransfer1;
import o.FragmentExternalSyntheticLambda2;
import o.ModalBottomSheetKtModalBottomSheet311;
import o.ModalBottomSheetYbuCTN8;
import o.StrokeJoinCompanion;
import o.buildMapping;
import o.getBirthDateFull;
import o.getCmykxdoWZVw;
import o.getHandleruiannotations;
import o.getNewPassword;
import o.getPostalCode;
import o.handleUrlOverridelambda1;
import o.performLayout;
import o.performMeasureDjhGOtQ;
import o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0;
import o.setAllowReturnTransitionOverlap;
import o.setCurrentSemanticsNodesui;
import o.setEnterSharedElementCallback;

/* JADX INFO: loaded from: classes3.dex */
public abstract class DefaultExtraLargeBubbleContentKt {
    private static int IconCompatParcelizer = 1;
    private static int serializer;

    public static final void DefaultExtraLargeBubbleContent(setAllowReturnTransitionOverlap setallowreturntransitionoverlap, Modifier modifier, getBirthDateFull getbirthdatefull, int i) {
        int i2;
        boolean z;
        int i3;
        getPostalCode getpostalcode;
        boolean zIconCompatParcelizer;
        int i4;
        int i5 = 2 % 2;
        setallowreturntransitionoverlap.getClass();
        setEnterSharedElementCallback setentersharedelementcallback = setallowreturntransitionoverlap.write;
        getPostalCode getpostalcode2 = (getPostalCode) getbirthdatefull;
        getpostalcode2.MediaSessionCompatQueueItem(-1936111568);
        Object obj = null;
        if ((i & 6) == 0) {
            if ((i & 8) == 0) {
                int i6 = IconCompatParcelizer + 75;
                serializer = i6 % Fields.SpotShadowColor;
                if (i6 % 2 != 0) {
                    getpostalcode2.read(setallowreturntransitionoverlap);
                    obj.hashCode();
                    throw null;
                }
                zIconCompatParcelizer = getpostalcode2.read(setallowreturntransitionoverlap);
            } else {
                zIconCompatParcelizer = getpostalcode2.IconCompatParcelizer(setallowreturntransitionoverlap);
            }
            if (zIconCompatParcelizer) {
                int i7 = serializer + 7;
                IconCompatParcelizer = i7 % Fields.SpotShadowColor;
                int i8 = i7 % 2;
                i4 = 4;
            } else {
                i4 = 2;
            }
            i2 = i4 | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= getpostalcode2.read(modifier) ? 32 : 16;
        }
        if ((i2 & 19) != 18) {
            int i9 = serializer + 77;
            IconCompatParcelizer = i9 % Fields.SpotShadowColor;
            int i10 = i9 % 2;
            z = true;
        } else {
            z = false;
        }
        if (getpostalcode2.write(i2 & 1, z)) {
            int i11 = serializer + 37;
            IconCompatParcelizer = i11 % Fields.SpotShadowColor;
            int i12 = i11 % 2;
            Modifier modifierWrite = PaddingKt.write(modifier, Dimensions.setActionBarVisibilityCallback);
            ModalBottomSheetYbuCTN8 modalBottomSheetYbuCTN8Serializer = ModalBottomSheetKtModalBottomSheet311.serializer(Arrangement.IconCompatParcelizer, Alignment.Companion.getCenterHorizontally(), getpostalcode2, 54);
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
                int i13 = serializer + 51;
                IconCompatParcelizer = i13 % Fields.SpotShadowColor;
                int i14 = i13 % 2;
            } else {
                getpostalcode2.r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28();
            }
            c8$$ExternalSyntheticOutline0.m(companion, getpostalcode2, modalBottomSheetYbuCTN8Serializer, getpostalcode2, dragAndDropNodestartDragAndDropTransfer1Serializer);
            AndroidContentCaptureManagerCompanion.write(getpostalcode2, modifierMaterializeModifier, m1$$ExternalSyntheticOutline0.m(companion, getpostalcode2, Integer.valueOf(iHashCode), getpostalcode2));
            getpostalcode2.serializer(480133459);
            getpostalcode = getpostalcode2;
            ColorModel.read((StrokeJoinCompanion) RememberLottieCompositionKt.IconCompatParcelizer(new getCmykxdoWZVw(setentersharedelementcallback.read), getpostalcode2).getValue(), SizeKt.m83size3ABfNKs(Modifier.Companion, Dp.m3673constructorimpl(80.0f)), Integer.MAX_VALUE, false, null, null, getpostalcode2, 1572912, 0, 0, 4194236);
            getpostalcode.IconCompatParcelizer(false);
            ExtrasKt.read(913837329, handleUrlOverridelambda1.RemoteActionCompatParcelizer(), handleUrlOverridelambda1.RemoteActionCompatParcelizer(), -913837326, handleUrlOverridelambda1.RemoteActionCompatParcelizer(), handleUrlOverridelambda1.RemoteActionCompatParcelizer(), new Object[]{getpostalcode, SizeKt.m75height3ABfNKs(Modifier.Companion, Dimensions.getNestedScrollAxes)});
            String str = setallowreturntransitionoverlap.RemoteActionCompatParcelizer;
            setCurrentSemanticsNodesui setcurrentsemanticsnodesui = performMeasureDjhGOtQ.RemoteActionCompatParcelizer;
            long presenter = ((buildMapping) getpostalcode.write((getNewPassword) setcurrentsemanticsnodesui)).setPresenter();
            TextStyle textStyleMediaSessionCompatResultReceiverWrapper = performLayout.MediaSessionCompatResultReceiverWrapper();
            TextAlign.Companion companion2 = TextAlign.Companion;
            TextKt.m131TextNvy7gAk(str, null, presenter, 0L, null, null, 0L, TextAlign.m3504boximpl(companion2.m3511getCentere0LSkKk()), 0L, 0, false, 0, 0, null, textStyleMediaSessionCompatResultReceiverWrapper, getpostalcode, 0, 0, 130042);
            TextKt.m131TextNvy7gAk(setallowreturntransitionoverlap.IconCompatParcelizer, null, ((buildMapping) getpostalcode.write((getNewPassword) setcurrentsemanticsnodesui)).setPresenter(), 0L, null, null, 0L, TextAlign.m3504boximpl(companion2.m3511getCentere0LSkKk()), 0L, 0, false, 0, 0, null, performLayout.write(), getpostalcode, 0, 0, 130042);
            i3 = 1;
            getpostalcode.IconCompatParcelizer(true);
        } else {
            i3 = 1;
            getpostalcode = getpostalcode2;
            getpostalcode.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
        }
        getHandleruiannotations gethandleruiannotationsMediaDescriptionCompat = getpostalcode.MediaDescriptionCompat();
        if (gethandleruiannotationsMediaDescriptionCompat != null) {
            gethandleruiannotationsMediaDescriptionCompat.serializer = new FragmentExternalSyntheticLambda2(setallowreturntransitionoverlap, modifier, i, i3);
            int i15 = serializer + 117;
            IconCompatParcelizer = i15 % Fields.SpotShadowColor;
            int i16 = i15 % 2;
        }
    }
}
