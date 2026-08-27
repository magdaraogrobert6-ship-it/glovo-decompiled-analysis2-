package com.roadrunner.rrds.compose.component.screenstate;

import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.material3.TextKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Fields;
import androidx.compose.ui.graphics.RectangleShapeKt;
import androidx.compose.ui.graphics.painter.Painter;
import androidx.compose.ui.layout.ContentScale;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.style.TextAlign;
import bo.app.af$$ExternalSyntheticOutline0;
import bo.app.c8$$ExternalSyntheticOutline0;
import bo.app.m1$$ExternalSyntheticOutline0;
import coil3.ExtrasKt;
import com.roadrunner.designsystem.compose.theme.tokens.Dimensions;
import com.roadrunner.rrds.compose.component.buttons.TertiaryKt;
import io.sentry.SentryUUID;
import o.AndroidContentCaptureManagerCompanion;
import o.DragAndDropNodestartDragAndDropTransfer1;
import o.FlingCancellationException;
import o.ModalBottomSheetKtModalBottomSheet311;
import o.ModalBottomSheetYbuCTN8;
import o.buildMapping;
import o.execSessionFailureCallbackCommand;
import o.execSessionSuccessCallbackCommand;
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
import o.r8lambdarMv397hzZJazOE3eMmLe0m6ePY0;
import o.setCurrentSemanticsNodesui;
import o.show;
import okio.Okio;

/* JADX INFO: loaded from: classes3.dex */
public abstract class EmptyScreenKt {
    private static int IconCompatParcelizer = 1;
    private static int read;

    public static final void EmptyScreen(execSessionFailureCallbackCommand execsessionfailurecallbackcommand, Modifier modifier, getBirthDateFull getbirthdatefull, int i) {
        int i2;
        boolean z;
        boolean z2;
        int i3 = 2 % 2;
        Integer num = execsessionfailurecallbackcommand.IconCompatParcelizer;
        getPostalCode getpostalcode = (getPostalCode) getbirthdatefull;
        getpostalcode.MediaSessionCompatQueueItem(-388064900);
        getAddressCountry getaddresscountry = getpostalcode.read;
        if ((i & 6) == 0) {
            i2 = (getpostalcode.read(execsessionfailurecallbackcommand) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            int i4 = read + 1;
            IconCompatParcelizer = i4 % Fields.SpotShadowColor;
            if (i4 % 2 != 0) {
                i2 |= getpostalcode.read(modifier) ? 32 : 16;
            } else {
                getpostalcode.read(modifier);
                throw null;
            }
        }
        if ((i2 & 19) != 18) {
            int i5 = IconCompatParcelizer + 5;
            read = i5 % Fields.SpotShadowColor;
            int i6 = i5 % 2;
            z = true;
        } else {
            z = false;
        }
        if (!getpostalcode.write(i2 & 1, z)) {
            getpostalcode.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
        } else {
            int i7 = IconCompatParcelizer + 105;
            read = i7 % Fields.SpotShadowColor;
            int i8 = i7 % 2;
            setCurrentSemanticsNodesui setcurrentsemanticsnodesui = performMeasureDjhGOtQ.RemoteActionCompatParcelizer;
            Modifier modifierM73paddingVpY3zN4$default = PaddingKt.m73paddingVpY3zN4$default(BackgroundKt.m20backgroundbw27NRU(modifier, ((buildMapping) getpostalcode.write((getNewPassword) setcurrentsemanticsnodesui)).onActivityResult(), RectangleShapeKt.getRectangleShape()).then(SizeKt.read), Dimensions.openOptionsMenu, 0.0f, 2);
            FlingCancellationException flingCancellationException = Arrangement.MediaDescriptionCompat;
            Alignment.Companion companion = Alignment.Companion;
            ModalBottomSheetYbuCTN8 modalBottomSheetYbuCTN8Serializer = ModalBottomSheetKtModalBottomSheet311.serializer(flingCancellationException, companion.getStart(), getpostalcode, 0);
            int iHashCode = Long.hashCode(getpostalcode.RatingCompat);
            DragAndDropNodestartDragAndDropTransfer1 dragAndDropNodestartDragAndDropTransfer1Serializer = getpostalcode.serializer();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(getpostalcode, modifierM73paddingVpY3zN4$default);
            ComposeUiNode.Companion companion2 = ComposeUiNode.Companion;
            r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 constructor = companion2.getConstructor();
            if (getaddresscountry != null) {
                getpostalcode.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg();
                if (getpostalcode.ComponentActivity) {
                    getpostalcode.serializer(constructor);
                } else {
                    getpostalcode.r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28();
                }
                c8$$ExternalSyntheticOutline0.m(companion2, getpostalcode, modalBottomSheetYbuCTN8Serializer, getpostalcode, dragAndDropNodestartDragAndDropTransfer1Serializer);
                AndroidContentCaptureManagerCompanion.write(getpostalcode, modifierMaterializeModifier, m1$$ExternalSyntheticOutline0.m(companion2, getpostalcode, Integer.valueOf(iHashCode), getpostalcode));
                Modifier.Companion companion3 = Modifier.Companion;
                Modifier modifierThen = SizeKt.write(companion3, 1.0f).then(new show(1.0f, true));
                ModalBottomSheetYbuCTN8 modalBottomSheetYbuCTN8Serializer2 = ModalBottomSheetKtModalBottomSheet311.serializer(Arrangement.IconCompatParcelizer, companion.getStart(), getpostalcode, 6);
                int iHashCode2 = Long.hashCode(getpostalcode.RatingCompat);
                DragAndDropNodestartDragAndDropTransfer1 dragAndDropNodestartDragAndDropTransfer1Serializer2 = getpostalcode.serializer();
                Modifier modifierMaterializeModifier2 = ComposedModifierKt.materializeModifier(getpostalcode, modifierThen);
                r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 constructor2 = companion2.getConstructor();
                getpostalcode.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg();
                if (getpostalcode.ComponentActivity) {
                    getpostalcode.serializer(constructor2);
                } else {
                    getpostalcode.r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28();
                }
                c8$$ExternalSyntheticOutline0.m(companion2, getpostalcode, modalBottomSheetYbuCTN8Serializer2, getpostalcode, dragAndDropNodestartDragAndDropTransfer1Serializer2);
                AndroidContentCaptureManagerCompanion.write(getpostalcode, modifierMaterializeModifier2, m1$$ExternalSyntheticOutline0.m(companion2, getpostalcode, Integer.valueOf(iHashCode2), getpostalcode));
                Modifier modifierWrite = SizeKt.write(companion3, 1.0f);
                ModalBottomSheetYbuCTN8 modalBottomSheetYbuCTN8Serializer3 = ModalBottomSheetKtModalBottomSheet311.serializer(flingCancellationException, companion.getCenterHorizontally(), getpostalcode, 48);
                int iHashCode3 = Long.hashCode(getpostalcode.RatingCompat);
                DragAndDropNodestartDragAndDropTransfer1 dragAndDropNodestartDragAndDropTransfer1Serializer3 = getpostalcode.serializer();
                Modifier modifierMaterializeModifier3 = ComposedModifierKt.materializeModifier(getpostalcode, modifierWrite);
                r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 constructor3 = companion2.getConstructor();
                getpostalcode.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg();
                if (!getpostalcode.ComponentActivity) {
                    getpostalcode.r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28();
                } else {
                    int i9 = IconCompatParcelizer + 67;
                    read = i9 % Fields.SpotShadowColor;
                    if (i9 % 2 == 0) {
                        getpostalcode.serializer(constructor3);
                    } else {
                        getpostalcode.serializer(constructor3);
                        throw null;
                    }
                }
                c8$$ExternalSyntheticOutline0.m(companion2, getpostalcode, modalBottomSheetYbuCTN8Serializer3, getpostalcode, dragAndDropNodestartDragAndDropTransfer1Serializer3);
                AndroidContentCaptureManagerCompanion.write(getpostalcode, modifierMaterializeModifier3, m1$$ExternalSyntheticOutline0.m(companion2, getpostalcode, Integer.valueOf(iHashCode3), getpostalcode));
                getpostalcode.serializer(356189543);
                getNonZeroRgk1Os.write(num, "", SizeKt.m86width3ABfNKs(SizeKt.m75height3ABfNKs(companion3, Dimensions.onTrimMemory), Dimensions.onRetainNonConfigurationInstance), Okio.RemoteActionCompatParcelizer(num.intValue(), getpostalcode, 0), null, null, null, null, ContentScale.Companion.getFillBounds(), null, getpostalcode, (Painter.$stable << 9) | 48, 6, 31728);
                ExtrasKt.read(913837329, handleUrlOverridelambda1.RemoteActionCompatParcelizer(), handleUrlOverridelambda1.RemoteActionCompatParcelizer(), -913837326, handleUrlOverridelambda1.RemoteActionCompatParcelizer(), handleUrlOverridelambda1.RemoteActionCompatParcelizer(), new Object[]{getpostalcode, SizeKt.m83size3ABfNKs(companion3, Dimensions.setMenu)});
                getpostalcode.IconCompatParcelizer(false);
                Modifier modifierWrite2 = SizeKt.write(companion3, 1.0f);
                String str = execsessionfailurecallbackcommand.RemoteActionCompatParcelizer;
                TextAlign.Companion companion4 = TextAlign.Companion;
                TextKt.m131TextNvy7gAk(str, modifierWrite2, ((buildMapping) getpostalcode.write((getNewPassword) setcurrentsemanticsnodesui)).setOverlayMode(), 0L, null, null, 0L, TextAlign.m3504boximpl(companion4.m3511getCentere0LSkKk()), 0L, 0, false, 0, 0, null, (TextStyle) performLayout.addContentView.MediaSessionCompatResultReceiverWrapper(), getpostalcode, 48, 0, 130040);
                TextKt.m131TextNvy7gAk(execsessionfailurecallbackcommand.serializer, PaddingKt.m74paddingqDBjuR0$default(SizeKt.write(companion3, 1.0f), 0.0f, Dimensions.setCheckable, 0.0f, 0.0f, 13), ((buildMapping) getpostalcode.write((getNewPassword) setcurrentsemanticsnodesui)).setActionBarHideOffset(), 0L, null, null, 0L, TextAlign.m3504boximpl(companion4.m3511getCentere0LSkKk()), 0L, 0, false, 0, 0, null, (TextStyle) performLayout.onBackPressedDispatcher_delegatelambda010.MediaSessionCompatResultReceiverWrapper(), getpostalcode, 0, 0, 130040);
                execSessionSuccessCallbackCommand execsessionsuccesscallbackcommand = execsessionfailurecallbackcommand.write;
                if (execsessionsuccesscallbackcommand != null) {
                    getpostalcode.serializer(357714774);
                    Modifier modifierWrite3 = SizeKt.write(companion3, 1.0f);
                    ModalBottomSheetYbuCTN8 modalBottomSheetYbuCTN8Serializer4 = ModalBottomSheetKtModalBottomSheet311.serializer(flingCancellationException, companion.getCenterHorizontally(), getpostalcode, 48);
                    int iHashCode4 = Long.hashCode(getpostalcode.RatingCompat);
                    DragAndDropNodestartDragAndDropTransfer1 dragAndDropNodestartDragAndDropTransfer1Serializer4 = getpostalcode.serializer();
                    Modifier modifierMaterializeModifier4 = ComposedModifierKt.materializeModifier(getpostalcode, modifierWrite3);
                    r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 constructor4 = companion2.getConstructor();
                    getpostalcode.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg();
                    if (getpostalcode.ComponentActivity) {
                        int i10 = read + 75;
                        IconCompatParcelizer = i10 % Fields.SpotShadowColor;
                        if (i10 % 2 == 0) {
                            getpostalcode.serializer(constructor4);
                            int i11 = 79 / 0;
                        } else {
                            getpostalcode.serializer(constructor4);
                        }
                    } else {
                        getpostalcode.r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28();
                    }
                    c8$$ExternalSyntheticOutline0.m(companion2, getpostalcode, modalBottomSheetYbuCTN8Serializer4, getpostalcode, dragAndDropNodestartDragAndDropTransfer1Serializer4);
                    AndroidContentCaptureManagerCompanion.write(getpostalcode, modifierMaterializeModifier4, m1$$ExternalSyntheticOutline0.m(companion2, getpostalcode, Integer.valueOf(iHashCode4), getpostalcode));
                    TertiaryKt.IconCompatParcelizer(execsessionsuccesscallbackcommand.RemoteActionCompatParcelizer, execsessionsuccesscallbackcommand.write, PaddingKt.m74paddingqDBjuR0$default(SizeKt.read(companion3), 0.0f, Dimensions.setExpandedFormat, 0.0f, 0.0f, 13), false, 0, null, null, null, getpostalcode, 0, 248);
                    z2 = true;
                    getpostalcode.IconCompatParcelizer(true);
                    getpostalcode.IconCompatParcelizer(false);
                } else {
                    z2 = true;
                    getpostalcode.serializer(358343268);
                    getpostalcode.IconCompatParcelizer(false);
                }
                af$$ExternalSyntheticOutline0.m(getpostalcode, z2, z2, z2);
            } else {
                SentryUUID.write();
                throw null;
            }
        }
        getHandleruiannotations gethandleruiannotationsMediaDescriptionCompat = getpostalcode.MediaDescriptionCompat();
        if (gethandleruiannotationsMediaDescriptionCompat != null) {
            gethandleruiannotationsMediaDescriptionCompat.serializer = new r8lambdarMv397hzZJazOE3eMmLe0m6ePY0(i, 8, execsessionfailurecallbackcommand, modifier);
            int i12 = IconCompatParcelizer + 107;
            read = i12 % Fields.SpotShadowColor;
            int i13 = i12 % 2;
        }
    }
}
