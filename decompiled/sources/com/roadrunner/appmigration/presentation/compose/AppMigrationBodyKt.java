package com.roadrunner.appmigration.presentation.compose;

import android.content.Context;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.material3.TextKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Fields;
import androidx.compose.ui.layout.ContentScale;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.text.TextStyle;
import bo.app.c8$$ExternalSyntheticOutline0;
import bo.app.d$$ExternalSyntheticOutline0;
import bo.app.m1$$ExternalSyntheticOutline0;
import coil3.ExtrasKt;
import com.roadrunner.designsystem.compose.theme.tokens.Dimensions;
import io.sentry.SentryUUID;
import o.AndroidContentCaptureManagerCompanion;
import o.AndroidPrefetchScheduler;
import o.DragAndDropNodestartDragAndDropTransfer1;
import o.FlingCancellationException;
import o.LinearGradientShaderVjE6UOUdefault;
import o.ModalBottomSheetKtModalBottomSheet311;
import o.ModalBottomSheetYbuCTN8;
import o.buildMapping;
import o.clearAndSetSemantics;
import o.getAddressCountry;
import o.getBirthDateFull;
import o.getHandleruiannotations;
import o.getNewPassword;
import o.getNonZeroRgk1Os;
import o.getPostalCode;
import o.handleUrlOverridelambda1;
import o.hideCurrentlyDisplayingInAppMessage;
import o.performLayout;
import o.performMeasureDjhGOtQ;
import o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0;
import o.setTransformQ8lPUPs;
import o.unmergedChildrenui;

/* JADX INFO: loaded from: classes3.dex */
public abstract class AppMigrationBodyKt {
    private static int IconCompatParcelizer = 0;
    private static int serializer = 1;

    /* JADX WARN: Code duplicated, block: B:44:0x00d4  */
    public static final void AppMigrationBody(clearAndSetSemantics clearandsetsemantics, Modifier modifier, getBirthDateFull getbirthdatefull, int i) {
        int i2;
        boolean z;
        long presenter;
        getPostalCode getpostalcode;
        boolean zIconCompatParcelizer;
        int i3 = 2 % 2;
        getPostalCode getpostalcode2 = (getPostalCode) getbirthdatefull;
        getpostalcode2.MediaSessionCompatQueueItem(1786181424);
        getAddressCountry getaddresscountry = getpostalcode2.read;
        if ((i & 6) == 0) {
            int i4 = IconCompatParcelizer + 9;
            serializer = i4 % Fields.SpotShadowColor;
            int i5 = i4 % 2;
            if ((i & 8) == 0) {
                zIconCompatParcelizer = getpostalcode2.read(clearandsetsemantics);
            } else {
                zIconCompatParcelizer = getpostalcode2.IconCompatParcelizer(clearandsetsemantics);
            }
            i2 = (zIconCompatParcelizer ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= getpostalcode2.read(modifier) ? 32 : 16;
        }
        if ((i2 & 19) != 18) {
            int i6 = IconCompatParcelizer + 109;
            serializer = i6 % Fields.SpotShadowColor;
            int i7 = i6 % 2;
            z = true;
        } else {
            z = false;
        }
        if (!(!getpostalcode2.write(i2 & 1, z))) {
            Modifier modifierWrite = SizeKt.write(modifier, 1.0f);
            FlingCancellationException flingCancellationException = Arrangement.MediaDescriptionCompat;
            Alignment.Companion companion = Alignment.Companion;
            ModalBottomSheetYbuCTN8 modalBottomSheetYbuCTN8Serializer = ModalBottomSheetKtModalBottomSheet311.serializer(flingCancellationException, companion.getStart(), getpostalcode2, 0);
            int iHashCode = Long.hashCode(getpostalcode2.RatingCompat);
            DragAndDropNodestartDragAndDropTransfer1 dragAndDropNodestartDragAndDropTransfer1Serializer = getpostalcode2.serializer();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(getpostalcode2, modifierWrite);
            ComposeUiNode.Companion companion2 = ComposeUiNode.Companion;
            r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 constructor = companion2.getConstructor();
            Object obj = null;
            if (getaddresscountry == null) {
                SentryUUID.write();
                throw null;
            }
            int i8 = IconCompatParcelizer + 81;
            serializer = i8 % Fields.SpotShadowColor;
            if (i8 % 2 != 0) {
                getpostalcode2.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg();
                if (getpostalcode2.ComponentActivity) {
                    getpostalcode2.serializer(constructor);
                } else {
                    getpostalcode2.r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28();
                }
                c8$$ExternalSyntheticOutline0.m(companion2, getpostalcode2, modalBottomSheetYbuCTN8Serializer, getpostalcode2, dragAndDropNodestartDragAndDropTransfer1Serializer);
                AndroidContentCaptureManagerCompanion.write(getpostalcode2, modifierMaterializeModifier, m1$$ExternalSyntheticOutline0.m(companion2, getpostalcode2, Integer.valueOf(iHashCode), getpostalcode2));
                String str = clearandsetsemantics.RatingCompat;
                if (str != null) {
                    int i9 = serializer + 119;
                    IconCompatParcelizer = i9 % Fields.SpotShadowColor;
                    if (i9 % 2 == 0) {
                        if (hideCurrentlyDisplayingInAppMessage.serializer((CharSequence) str)) {
                            str = null;
                        }
                    } else {
                        hideCurrentlyDisplayingInAppMessage.serializer((CharSequence) str);
                        throw null;
                    }
                } else {
                    str = null;
                }
                if (str == null) {
                    getpostalcode2.serializer(1579224975);
                    getpostalcode2.IconCompatParcelizer(false);
                } else {
                    getpostalcode2.serializer(1579224976);
                    setTransformQ8lPUPs settransformq8lpups = new setTransformQ8lPUPs((Context) getpostalcode2.write((getNewPassword) AndroidCompositionLocals_androidKt.getLocalContext()));
                    settransformq8lpups.IconCompatParcelizer = str;
                    LinearGradientShaderVjE6UOUdefault.write(settransformq8lpups);
                    getNonZeroRgk1Os.RemoteActionCompatParcelizer(settransformq8lpups.IconCompatParcelizer(), null, SizeKt.write(PaddingKt.m74paddingqDBjuR0$default(Modifier.Companion, 0.0f, Dimensions.setTabContainer, 0.0f, 0.0f, 13), 1.0f), ContentScale.Companion.getFillWidth(), null, getpostalcode2, 1572912, 1976);
                    getpostalcode2.IconCompatParcelizer(false);
                }
                Modifier.Companion companion3 = Modifier.Companion;
                Modifier modifierRemoteActionCompatParcelizer = PaddingKt.RemoteActionCompatParcelizer(companion3, Dimensions.getAnimatedVisibility, Dimensions.setTabContainer);
                ModalBottomSheetYbuCTN8 modalBottomSheetYbuCTN8Serializer2 = ModalBottomSheetKtModalBottomSheet311.serializer(flingCancellationException, companion.getStart(), getpostalcode2, 0);
                int iHashCode2 = Long.hashCode(getpostalcode2.RatingCompat);
                DragAndDropNodestartDragAndDropTransfer1 dragAndDropNodestartDragAndDropTransfer1Serializer2 = getpostalcode2.serializer();
                Modifier modifierMaterializeModifier2 = ComposedModifierKt.materializeModifier(getpostalcode2, modifierRemoteActionCompatParcelizer);
                r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 constructor2 = companion2.getConstructor();
                getpostalcode2.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg();
                if (getpostalcode2.ComponentActivity) {
                    getpostalcode2.serializer(constructor2);
                } else {
                    getpostalcode2.r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28();
                }
                c8$$ExternalSyntheticOutline0.m(companion2, getpostalcode2, modalBottomSheetYbuCTN8Serializer2, getpostalcode2, dragAndDropNodestartDragAndDropTransfer1Serializer2);
                AndroidContentCaptureManagerCompanion.write(getpostalcode2, modifierMaterializeModifier2, m1$$ExternalSyntheticOutline0.m(companion2, getpostalcode2, Integer.valueOf(iHashCode2), getpostalcode2));
                String str2 = clearandsetsemantics.MediaSessionCompatResultReceiverWrapper;
                TextStyle textStyleMediaSessionCompatResultReceiverWrapper = performLayout.MediaSessionCompatResultReceiverWrapper();
                int i10 = unmergedChildrenui.IconCompatParcelizer[clearandsetsemantics.PlaybackStateCompatCustomAction.ordinal()];
                if (i10 == 1) {
                    getpostalcode2.serializer(1606960527);
                    presenter = ((buildMapping) getpostalcode2.write((getNewPassword) performMeasureDjhGOtQ.RemoteActionCompatParcelizer)).setPresenter();
                    getpostalcode2.IconCompatParcelizer(false);
                } else if (i10 == 2) {
                    getpostalcode2.serializer(1606962542);
                    presenter = ((buildMapping) getpostalcode2.write((getNewPassword) performMeasureDjhGOtQ.RemoteActionCompatParcelizer)).getWindowSystemUiVisibility();
                    getpostalcode2.IconCompatParcelizer(false);
                } else if (i10 == 3) {
                    getpostalcode2.serializer(1606964558);
                    presenter = ((buildMapping) getpostalcode2.write((getNewPassword) performMeasureDjhGOtQ.RemoteActionCompatParcelizer)).read();
                    getpostalcode2.IconCompatParcelizer(false);
                } else {
                    throw d$$ExternalSyntheticOutline0.m(getpostalcode2, 1606958271, false);
                }
                TextKt.m131TextNvy7gAk(str2, null, presenter, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, textStyleMediaSessionCompatResultReceiverWrapper, getpostalcode2, 0, 0, 131066);
                ExtrasKt.read(913837329, handleUrlOverridelambda1.RemoteActionCompatParcelizer(), handleUrlOverridelambda1.RemoteActionCompatParcelizer(), -913837326, handleUrlOverridelambda1.RemoteActionCompatParcelizer(), handleUrlOverridelambda1.RemoteActionCompatParcelizer(), new Object[]{getpostalcode2, SizeKt.m83size3ABfNKs(companion3, Dimensions.setPrimaryBackground)});
                TextKt.m131TextNvy7gAk(clearandsetsemantics.read, null, ((buildMapping) getpostalcode2.write((getNewPassword) performMeasureDjhGOtQ.RemoteActionCompatParcelizer)).setPresenter(), 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, performLayout.IconCompatParcelizer(), getpostalcode2, 0, 0, 131066);
                Modifier modifierM83size3ABfNKs = SizeKt.m83size3ABfNKs(companion3, Dimensions.setTransitioning);
                getpostalcode = getpostalcode2;
                ExtrasKt.read(913837329, handleUrlOverridelambda1.RemoteActionCompatParcelizer(), handleUrlOverridelambda1.RemoteActionCompatParcelizer(), -913837326, handleUrlOverridelambda1.RemoteActionCompatParcelizer(), handleUrlOverridelambda1.RemoteActionCompatParcelizer(), new Object[]{getpostalcode, modifierM83size3ABfNKs});
                getpostalcode.IconCompatParcelizer(true);
                getpostalcode.IconCompatParcelizer(true);
            } else {
                getpostalcode2.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg();
                boolean z2 = getpostalcode2.ComponentActivity;
                obj.hashCode();
                throw null;
            }
        } else {
            getpostalcode2.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
            getpostalcode = getpostalcode2;
        }
        getHandleruiannotations gethandleruiannotationsMediaDescriptionCompat = getpostalcode.MediaDescriptionCompat();
        if (gethandleruiannotationsMediaDescriptionCompat != null) {
            gethandleruiannotationsMediaDescriptionCompat.serializer = new AndroidPrefetchScheduler(clearandsetsemantics, modifier, i, 10);
        }
    }
}
