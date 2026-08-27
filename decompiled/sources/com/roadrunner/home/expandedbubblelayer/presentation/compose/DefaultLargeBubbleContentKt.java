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
import androidx.compose.ui.text.style.TextOverflow;
import androidx.compose.ui.unit.Dp;
import bo.app.c8$$ExternalSyntheticOutline0;
import bo.app.m1$$ExternalSyntheticOutline0;
import coil3.ExtrasKt;
import com.airbnb.lottie.compose.RememberLottieCompositionKt;
import com.incognia.internal.pcn;
import com.roadrunner.designsystem.compose.theme.tokens.Dimensions;
import io.sentry.SentryUUID;
import o.AndroidContentCaptureManagerCompanion;
import o.ColorModel;
import o.DragAndDropNodestartDragAndDropTransfer1;
import o.FragmentExternalSyntheticLambda2;
import o.ModalBottomSheetKtModalBottomSheet311;
import o.ModalBottomSheetYbuCTN8;
import o.StrokeJoinCompanion;
import o.TextFieldDefaults;
import o.buildMapping;
import o.getAddressCountry;
import o.getBirthDateFull;
import o.getCmykxdoWZVw;
import o.getHandleruiannotations;
import o.getNewPassword;
import o.getPostalCode;
import o.handleUrlOverridelambda1;
import o.performLayout;
import o.performMeasureDjhGOtQ;
import o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0;
import o.r8lambdafvzP3Wky1RLLzE56uVXaMHcvU;
import o.setAllowReturnTransitionOverlap;
import o.setCurrentSemanticsNodesui;
import o.setEnterSharedElementCallback;
import o.show;
import o.supportingTextPaddinga9UjIt4material3default;

/* JADX INFO: loaded from: classes3.dex */
public abstract class DefaultLargeBubbleContentKt {
    private static int RemoteActionCompatParcelizer = 0;
    private static int read = 1;

    public static final void DefaultLargeBubbleContent(setAllowReturnTransitionOverlap setallowreturntransitionoverlap, Modifier modifier, getBirthDateFull getbirthdatefull, int i) {
        int i2;
        getPostalCode getpostalcode;
        int i3;
        boolean zIconCompatParcelizer;
        int i4 = 2 % 2;
        setallowreturntransitionoverlap.getClass();
        setEnterSharedElementCallback setentersharedelementcallback = setallowreturntransitionoverlap.write;
        getPostalCode getpostalcode2 = (getPostalCode) getbirthdatefull;
        getpostalcode2.MediaSessionCompatQueueItem(2064874676);
        getAddressCountry getaddresscountry = getpostalcode2.read;
        if ((i & 6) == 0) {
            int i5 = read + 73;
            int i6 = i5 % Fields.SpotShadowColor;
            RemoteActionCompatParcelizer = i6;
            if (i5 % 2 == 0 ? (i & 8) == 0 : (i & 66) == 0) {
                int i7 = i6 + 23;
                read = i7 % Fields.SpotShadowColor;
                int i8 = i7 % 2;
                zIconCompatParcelizer = getpostalcode2.read(setallowreturntransitionoverlap);
            } else {
                zIconCompatParcelizer = getpostalcode2.IconCompatParcelizer(setallowreturntransitionoverlap);
            }
            i2 = (zIconCompatParcelizer ? 4 : 2) | i;
        } else {
            int i9 = RemoteActionCompatParcelizer + 29;
            read = i9 % Fields.SpotShadowColor;
            if (i9 % 2 == 0) {
                int i10 = 3 / 5;
            }
            i2 = i;
        }
        Object obj = null;
        if ((i & 48) == 0) {
            int i11 = read + 89;
            RemoteActionCompatParcelizer = i11 % Fields.SpotShadowColor;
            if (i11 % 2 == 0) {
                if (getpostalcode2.read(modifier)) {
                    int i12 = RemoteActionCompatParcelizer + 55;
                    read = i12 % Fields.SpotShadowColor;
                    i3 = i12 % 2 == 0 ? 82 : 32;
                } else {
                    i3 = 16;
                }
                i2 |= i3;
            } else {
                getpostalcode2.read(modifier);
                throw null;
            }
        }
        if (getpostalcode2.write(i2 & 1, (i2 & 19) != 18)) {
            int i13 = RemoteActionCompatParcelizer + 101;
            read = i13 % Fields.SpotShadowColor;
            int i14 = i13 % 2;
            Alignment.Companion companion = Alignment.Companion;
            Alignment.Vertical centerVertically = companion.getCenterVertically();
            Modifier modifierRemoteActionCompatParcelizer = PaddingKt.RemoteActionCompatParcelizer(modifier, Dimensions.setLogo, Dimensions.setMenu);
            supportingTextPaddinga9UjIt4material3default supportingtextpaddinga9ujit4material3defaultSerializer = TextFieldDefaults.serializer(Arrangement.MediaBrowserCompatMediaItem, centerVertically, getpostalcode2, 48);
            int iHashCode = Long.hashCode(getpostalcode2.RatingCompat);
            DragAndDropNodestartDragAndDropTransfer1 dragAndDropNodestartDragAndDropTransfer1Serializer = getpostalcode2.serializer();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(getpostalcode2, modifierRemoteActionCompatParcelizer);
            ComposeUiNode.Companion companion2 = ComposeUiNode.Companion;
            r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 constructor = companion2.getConstructor();
            if (getaddresscountry != null) {
                getpostalcode2.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg();
                if (!(!getpostalcode2.ComponentActivity)) {
                    getpostalcode2.serializer(constructor);
                } else {
                    getpostalcode2.r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28();
                }
                r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.read(companion2, getpostalcode2, supportingtextpaddinga9ujit4material3defaultSerializer, getpostalcode2, dragAndDropNodestartDragAndDropTransfer1Serializer);
                AndroidContentCaptureManagerCompanion.write(getpostalcode2, modifierMaterializeModifier, m1$$ExternalSyntheticOutline0.m(companion2, getpostalcode2, Integer.valueOf(iHashCode), getpostalcode2));
                Modifier.Companion companion3 = Modifier.Companion;
                ExtrasKt.read(913837329, handleUrlOverridelambda1.RemoteActionCompatParcelizer(), handleUrlOverridelambda1.RemoteActionCompatParcelizer(), -913837326, handleUrlOverridelambda1.RemoteActionCompatParcelizer(), handleUrlOverridelambda1.RemoteActionCompatParcelizer(), new Object[]{getpostalcode2, SizeKt.m75height3ABfNKs(companion3, Dp.m3673constructorimpl(3.0f))});
                getpostalcode2.serializer(417480445);
                getpostalcode = getpostalcode2;
                ColorModel.read((StrokeJoinCompanion) RememberLottieCompositionKt.IconCompatParcelizer(new getCmykxdoWZVw(setentersharedelementcallback.read), getpostalcode2).getValue(), SizeKt.m83size3ABfNKs(companion3, Dp.m3673constructorimpl(48.0f)), Integer.MAX_VALUE, false, null, null, getpostalcode2, 1572912, 0, 0, 4194236);
                getpostalcode.IconCompatParcelizer(false);
                ExtrasKt.read(913837329, handleUrlOverridelambda1.RemoteActionCompatParcelizer(), handleUrlOverridelambda1.RemoteActionCompatParcelizer(), -913837326, handleUrlOverridelambda1.RemoteActionCompatParcelizer(), handleUrlOverridelambda1.RemoteActionCompatParcelizer(), new Object[]{getpostalcode, SizeKt.m75height3ABfNKs(companion3, Dp.m3673constructorimpl(3.0f))});
                ExtrasKt.read(913837329, handleUrlOverridelambda1.RemoteActionCompatParcelizer(), handleUrlOverridelambda1.RemoteActionCompatParcelizer(), -913837326, handleUrlOverridelambda1.RemoteActionCompatParcelizer(), handleUrlOverridelambda1.RemoteActionCompatParcelizer(), new Object[]{getpostalcode, SizeKt.m86width3ABfNKs(companion3, Dimensions.setActionBarVisibilityCallback)});
                Modifier modifierThen = companion3.then(new show(1.0f, true));
                ModalBottomSheetYbuCTN8 modalBottomSheetYbuCTN8Serializer = ModalBottomSheetKtModalBottomSheet311.serializer(Arrangement.MediaDescriptionCompat, companion.getStart(), getpostalcode, 0);
                int iHashCode2 = Long.hashCode(getpostalcode.RatingCompat);
                DragAndDropNodestartDragAndDropTransfer1 dragAndDropNodestartDragAndDropTransfer1Serializer2 = getpostalcode.serializer();
                Modifier modifierMaterializeModifier2 = ComposedModifierKt.materializeModifier(getpostalcode, modifierThen);
                r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 constructor2 = companion2.getConstructor();
                getpostalcode.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg();
                if (getpostalcode.ComponentActivity) {
                    int i15 = RemoteActionCompatParcelizer + 45;
                    read = i15 % Fields.SpotShadowColor;
                    if (i15 % 2 != 0) {
                        getpostalcode.serializer(constructor2);
                        int i16 = read + 21;
                        RemoteActionCompatParcelizer = i16 % Fields.SpotShadowColor;
                        int i17 = i16 % 2;
                    } else {
                        getpostalcode.serializer(constructor2);
                        obj.hashCode();
                        throw null;
                    }
                } else {
                    getpostalcode.r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28();
                }
                c8$$ExternalSyntheticOutline0.m(companion2, getpostalcode, modalBottomSheetYbuCTN8Serializer, getpostalcode, dragAndDropNodestartDragAndDropTransfer1Serializer2);
                AndroidContentCaptureManagerCompanion.write(getpostalcode, modifierMaterializeModifier2, m1$$ExternalSyntheticOutline0.m(companion2, getpostalcode, Integer.valueOf(iHashCode2), getpostalcode));
                String str = setallowreturntransitionoverlap.RemoteActionCompatParcelizer;
                TextOverflow.Companion companion4 = TextOverflow.Companion;
                int iM3569getEllipsisgIe3tQ8 = companion4.m3569getEllipsisgIe3tQ8();
                setCurrentSemanticsNodesui setcurrentsemanticsnodesui = performMeasureDjhGOtQ.RemoteActionCompatParcelizer;
                TextKt.m131TextNvy7gAk(str, null, ((buildMapping) getpostalcode.write((getNewPassword) setcurrentsemanticsnodesui)).setPresenter(), 0L, null, null, 0L, null, 0L, iM3569getEllipsisgIe3tQ8, false, 1, 0, null, (TextStyle) performLayout.read(-961708487, pcn.serializer(), new Object[0], 961708487, pcn.serializer(), pcn.serializer(), pcn.serializer()), getpostalcode, 0, 24960, 110586);
                TextKt.m131TextNvy7gAk(setallowreturntransitionoverlap.IconCompatParcelizer, null, ((buildMapping) getpostalcode.write((getNewPassword) setcurrentsemanticsnodesui)).setPresenter(), 0L, null, null, 0L, TextAlign.m3504boximpl(TextAlign.Companion.m3516getStarte0LSkKk()), 0L, companion4.m3569getEllipsisgIe3tQ8(), false, 1, 0, null, performLayout.write(), getpostalcode, 0, 24960, 109562);
                getpostalcode.IconCompatParcelizer(true);
                getpostalcode.IconCompatParcelizer(true);
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
            gethandleruiannotationsMediaDescriptionCompat.serializer = new FragmentExternalSyntheticLambda2(setallowreturntransitionoverlap, modifier, i, 0);
        }
    }
}
