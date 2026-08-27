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
import bo.app.c8$$ExternalSyntheticOutline0;
import bo.app.m1$$ExternalSyntheticOutline0;
import coil3.ExtrasKt;
import com.roadrunner.designsystem.compose.theme.tokens.Dimensions;
import com.roadrunner.rrds.compose.component.buttons.TertiaryKt;
import io.sentry.SentryUUID;
import o.AndroidContentCaptureManagerCompanion;
import o.DragAndDropNodestartDragAndDropTransfer1;
import o.ModalBottomSheetKtModalBottomSheet311;
import o.ModalBottomSheetYbuCTN8;
import o.WrappedAnchor;
import o.buildMapping;
import o.execSessionSuccessCallbackCommand;
import o.fieldToInteger;
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
import o.setCurrentSemanticsNodesui;
import okio.Okio;

/* JADX INFO: loaded from: classes3.dex */
public abstract class ErrorScreenKt {
    private static int IconCompatParcelizer = 1;
    private static int write;

    /* JADX WARN: Code duplicated, block: B:23:0x0063  */
    /* JADX WARN: Code duplicated, block: B:24:0x0065  */
    /* JADX WARN: Code duplicated, block: B:27:0x006d A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:28:0x006f  */
    /* JADX WARN: Code duplicated, block: B:29:0x0073  */
    /* JADX WARN: Code duplicated, block: B:32:0x00b6  */
    /* JADX WARN: Code duplicated, block: B:34:0x00bd  */
    /* JADX WARN: Code duplicated, block: B:36:0x00c8  */
    /* JADX WARN: Code duplicated, block: B:37:0x00cc  */
    /* JADX WARN: Code duplicated, block: B:39:0x00d0  */
    /* JADX WARN: Code duplicated, block: B:42:0x01a7  */
    /* JADX WARN: Code duplicated, block: B:43:0x01b4  */
    /* JADX WARN: Code duplicated, block: B:45:0x01e6  */
    /* JADX WARN: Code duplicated, block: B:46:0x01ea  */
    /* JADX WARN: Code duplicated, block: B:49:0x0234  */
    /* JADX WARN: Code duplicated, block: B:51:0x0238  */
    /* JADX WARN: Code duplicated, block: B:54:0x0243  */
    /* JADX WARN: Code duplicated, block: B:56:? A[RETURN, SYNTHETIC] */
    public static final void ErrorScreen(fieldToInteger fieldtointeger, Modifier modifier, getBirthDateFull getbirthdatefull, int i, int i2) {
        int i3;
        Modifier modifier2;
        boolean z;
        getPostalCode getpostalcode;
        Modifier modifier3;
        getHandleruiannotations gethandleruiannotationsMediaDescriptionCompat;
        Modifier modifier4;
        setCurrentSemanticsNodesui setcurrentsemanticsnodesui;
        Alignment.Companion companion;
        ModalBottomSheetYbuCTN8 modalBottomSheetYbuCTN8Serializer;
        int iHashCode;
        DragAndDropNodestartDragAndDropTransfer1 dragAndDropNodestartDragAndDropTransfer1Serializer;
        Modifier modifierMaterializeModifier;
        ComposeUiNode.Companion companion2;
        r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 constructor;
        Modifier.Companion companion3;
        execSessionSuccessCallbackCommand execsessionsuccesscallbackcommand;
        r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 constructor2;
        boolean z2;
        int i4;
        int i5;
        int i6 = 2 % 2;
        int i7 = write + 15;
        IconCompatParcelizer = i7 % Fields.SpotShadowColor;
        int i8 = i7 % 2;
        int i9 = fieldtointeger.read;
        getPostalCode getpostalcode2 = (getPostalCode) getbirthdatefull;
        getpostalcode2.MediaSessionCompatQueueItem(1461410455);
        getAddressCountry getaddresscountry = getpostalcode2.read;
        if ((i & 6) == 0) {
            if (!getpostalcode2.read(fieldtointeger)) {
                i5 = 2;
            } else {
                int i10 = write + 33;
                IconCompatParcelizer = i10 % Fields.SpotShadowColor;
                int i11 = i10 % 2;
                i5 = 4;
            }
            i3 = i | i5;
        } else {
            i3 = i;
        }
        int i12 = i2 & 2;
        if (i12 == 0) {
            if ((i & 48) == 0) {
                modifier2 = modifier;
                i3 |= getpostalcode2.read(modifier2) ? 32 : 16;
                int i13 = write + 3;
                IconCompatParcelizer = i13 % Fields.SpotShadowColor;
                int i14 = i13 % 2;
            }
            if ((i3 & 19) != 18) {
                z = true;
            } else {
                z = false;
            }
            if (getpostalcode2.write(i3 & 1, z)) {
                if (i12 != 0) {
                    modifier4 = Modifier.Companion;
                } else {
                    modifier4 = modifier2;
                }
                setcurrentsemanticsnodesui = performMeasureDjhGOtQ.RemoteActionCompatParcelizer;
                Modifier modifierM73paddingVpY3zN4$default = PaddingKt.m73paddingVpY3zN4$default(BackgroundKt.m20backgroundbw27NRU(modifier4, ((buildMapping) getpostalcode2.write((getNewPassword) setcurrentsemanticsnodesui)).serializer(), RectangleShapeKt.getRectangleShape()).then(SizeKt.read), Dimensions.openOptionsMenu, 0.0f, 2);
                companion = Alignment.Companion;
                modalBottomSheetYbuCTN8Serializer = ModalBottomSheetKtModalBottomSheet311.serializer(Arrangement.IconCompatParcelizer, companion.getCenterHorizontally(), getpostalcode2, 54);
                iHashCode = Long.hashCode(getpostalcode2.RatingCompat);
                dragAndDropNodestartDragAndDropTransfer1Serializer = getpostalcode2.serializer();
                modifierMaterializeModifier = ComposedModifierKt.materializeModifier(getpostalcode2, modifierM73paddingVpY3zN4$default);
                companion2 = ComposeUiNode.Companion;
                constructor = companion2.getConstructor();
                if (getaddresscountry != null) {
                    SentryUUID.write();
                    throw null;
                }
                getpostalcode2.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg();
                if (getpostalcode2.ComponentActivity) {
                    i4 = IconCompatParcelizer + 33;
                    write = i4 % Fields.SpotShadowColor;
                    if (i4 % 2 == 0) {
                        getpostalcode2.serializer(constructor);
                        throw null;
                    }
                    getpostalcode2.serializer(constructor);
                } else {
                    getpostalcode2.r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28();
                    int i15 = IconCompatParcelizer + 53;
                    write = i15 % Fields.SpotShadowColor;
                    int i16 = i15 % 2;
                }
                c8$$ExternalSyntheticOutline0.m(companion2, getpostalcode2, modalBottomSheetYbuCTN8Serializer, getpostalcode2, dragAndDropNodestartDragAndDropTransfer1Serializer);
                AndroidContentCaptureManagerCompanion.write(getpostalcode2, modifierMaterializeModifier, m1$$ExternalSyntheticOutline0.m(companion2, getpostalcode2, Integer.valueOf(iHashCode), getpostalcode2));
                ContentScale fillBounds = ContentScale.Companion.getFillBounds();
                Painter painterRemoteActionCompatParcelizer = Okio.RemoteActionCompatParcelizer(i9, getpostalcode2, 0);
                companion3 = Modifier.Companion;
                Modifier modifier5 = modifier4;
                getNonZeroRgk1Os.write(Integer.valueOf(i9), "", SizeKt.m86width3ABfNKs(SizeKt.m75height3ABfNKs(companion3, Dimensions.onTrimMemory), Dimensions.onRetainNonConfigurationInstance), painterRemoteActionCompatParcelizer, null, null, null, null, fillBounds, null, getpostalcode2, (Painter.$stable << 9) | 48, 6, 31728);
                ExtrasKt.read(913837329, handleUrlOverridelambda1.RemoteActionCompatParcelizer(), handleUrlOverridelambda1.RemoteActionCompatParcelizer(), -913837326, handleUrlOverridelambda1.RemoteActionCompatParcelizer(), handleUrlOverridelambda1.RemoteActionCompatParcelizer(), new Object[]{getpostalcode2, SizeKt.m83size3ABfNKs(companion3, Dimensions.setMenu)});
                getpostalcode = getpostalcode2;
                TextKt.m131TextNvy7gAk(fieldtointeger.RemoteActionCompatParcelizer, SizeKt.write(companion3, 1.0f), ((buildMapping) getpostalcode2.write((getNewPassword) setcurrentsemanticsnodesui)).setOverlayMode(), 0L, null, null, 0L, TextAlign.m3504boximpl(TextAlign.Companion.m3511getCentere0LSkKk()), 0L, 0, false, 0, 0, null, (TextStyle) performLayout.addContentView.MediaSessionCompatResultReceiverWrapper(), getpostalcode, 48, 0, 130040);
                execsessionsuccesscallbackcommand = fieldtointeger.serializer;
                if (execsessionsuccesscallbackcommand == null) {
                    getpostalcode.serializer(-276096852);
                    getpostalcode.IconCompatParcelizer(false);
                    z2 = true;
                } else {
                    getpostalcode.serializer(-276096851);
                    Modifier modifierWrite = SizeKt.write(companion3, 1.0f);
                    ModalBottomSheetYbuCTN8 modalBottomSheetYbuCTN8Serializer2 = ModalBottomSheetKtModalBottomSheet311.serializer(Arrangement.MediaDescriptionCompat, companion.getCenterHorizontally(), getpostalcode, 48);
                    int iHashCode2 = Long.hashCode(getpostalcode.RatingCompat);
                    DragAndDropNodestartDragAndDropTransfer1 dragAndDropNodestartDragAndDropTransfer1Serializer2 = getpostalcode.serializer();
                    Modifier modifierMaterializeModifier2 = ComposedModifierKt.materializeModifier(getpostalcode, modifierWrite);
                    constructor2 = companion2.getConstructor();
                    getpostalcode.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg();
                    if (getpostalcode.ComponentActivity) {
                        getpostalcode.serializer(constructor2);
                    } else {
                        getpostalcode.r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28();
                    }
                    int i17 = IconCompatParcelizer + 5;
                    write = i17 % Fields.SpotShadowColor;
                    int i18 = i17 % 2;
                    c8$$ExternalSyntheticOutline0.m(companion2, getpostalcode, modalBottomSheetYbuCTN8Serializer2, getpostalcode, dragAndDropNodestartDragAndDropTransfer1Serializer2);
                    AndroidContentCaptureManagerCompanion.write(getpostalcode, modifierMaterializeModifier2, m1$$ExternalSyntheticOutline0.m(companion2, getpostalcode, Integer.valueOf(iHashCode2), getpostalcode));
                    TertiaryKt.IconCompatParcelizer(execsessionsuccesscallbackcommand.RemoteActionCompatParcelizer, execsessionsuccesscallbackcommand.write, PaddingKt.m74paddingqDBjuR0$default(SizeKt.read(companion3), 0.0f, Dimensions.setExpandedFormat, 0.0f, 0.0f, 13), false, 0, null, null, null, getpostalcode, 0, 248);
                    z2 = true;
                    getpostalcode.IconCompatParcelizer(true);
                    getpostalcode.IconCompatParcelizer(false);
                }
                getpostalcode.IconCompatParcelizer(z2);
                modifier3 = modifier5;
            } else {
                getpostalcode = getpostalcode2;
                getpostalcode.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
                modifier3 = modifier2;
            }
            gethandleruiannotationsMediaDescriptionCompat = getpostalcode.MediaDescriptionCompat();
            if (gethandleruiannotationsMediaDescriptionCompat != null) {
                gethandleruiannotationsMediaDescriptionCompat.serializer = new WrappedAnchor(fieldtointeger, modifier3, i, i2, 5);
            }
        }
        i3 |= 48;
        modifier2 = modifier;
        if ((i3 & 19) != 18) {
            z = true;
        } else {
            z = false;
        }
        if (getpostalcode2.write(i3 & 1, z)) {
            if (i12 != 0) {
                modifier4 = Modifier.Companion;
            } else {
                modifier4 = modifier2;
            }
            setcurrentsemanticsnodesui = performMeasureDjhGOtQ.RemoteActionCompatParcelizer;
            Modifier modifierM73paddingVpY3zN4$default2 = PaddingKt.m73paddingVpY3zN4$default(BackgroundKt.m20backgroundbw27NRU(modifier4, ((buildMapping) getpostalcode2.write((getNewPassword) setcurrentsemanticsnodesui)).serializer(), RectangleShapeKt.getRectangleShape()).then(SizeKt.read), Dimensions.openOptionsMenu, 0.0f, 2);
            companion = Alignment.Companion;
            modalBottomSheetYbuCTN8Serializer = ModalBottomSheetKtModalBottomSheet311.serializer(Arrangement.IconCompatParcelizer, companion.getCenterHorizontally(), getpostalcode2, 54);
            iHashCode = Long.hashCode(getpostalcode2.RatingCompat);
            dragAndDropNodestartDragAndDropTransfer1Serializer = getpostalcode2.serializer();
            modifierMaterializeModifier = ComposedModifierKt.materializeModifier(getpostalcode2, modifierM73paddingVpY3zN4$default2);
            companion2 = ComposeUiNode.Companion;
            constructor = companion2.getConstructor();
            if (getaddresscountry != null) {
                SentryUUID.write();
                throw null;
            }
            getpostalcode2.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg();
            if (getpostalcode2.ComponentActivity) {
                i4 = IconCompatParcelizer + 33;
                write = i4 % Fields.SpotShadowColor;
                if (i4 % 2 == 0) {
                    getpostalcode2.serializer(constructor);
                    throw null;
                }
                getpostalcode2.serializer(constructor);
            } else {
                getpostalcode2.r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28();
                int i19 = IconCompatParcelizer + 53;
                write = i19 % Fields.SpotShadowColor;
                int i110 = i19 % 2;
            }
            c8$$ExternalSyntheticOutline0.m(companion2, getpostalcode2, modalBottomSheetYbuCTN8Serializer, getpostalcode2, dragAndDropNodestartDragAndDropTransfer1Serializer);
            AndroidContentCaptureManagerCompanion.write(getpostalcode2, modifierMaterializeModifier, m1$$ExternalSyntheticOutline0.m(companion2, getpostalcode2, Integer.valueOf(iHashCode), getpostalcode2));
            ContentScale fillBounds2 = ContentScale.Companion.getFillBounds();
            Painter painterRemoteActionCompatParcelizer2 = Okio.RemoteActionCompatParcelizer(i9, getpostalcode2, 0);
            companion3 = Modifier.Companion;
            Modifier modifier6 = modifier4;
            getNonZeroRgk1Os.write(Integer.valueOf(i9), "", SizeKt.m86width3ABfNKs(SizeKt.m75height3ABfNKs(companion3, Dimensions.onTrimMemory), Dimensions.onRetainNonConfigurationInstance), painterRemoteActionCompatParcelizer2, null, null, null, null, fillBounds2, null, getpostalcode2, (Painter.$stable << 9) | 48, 6, 31728);
            ExtrasKt.read(913837329, handleUrlOverridelambda1.RemoteActionCompatParcelizer(), handleUrlOverridelambda1.RemoteActionCompatParcelizer(), -913837326, handleUrlOverridelambda1.RemoteActionCompatParcelizer(), handleUrlOverridelambda1.RemoteActionCompatParcelizer(), new Object[]{getpostalcode2, SizeKt.m83size3ABfNKs(companion3, Dimensions.setMenu)});
            getpostalcode = getpostalcode2;
            TextKt.m131TextNvy7gAk(fieldtointeger.RemoteActionCompatParcelizer, SizeKt.write(companion3, 1.0f), ((buildMapping) getpostalcode2.write((getNewPassword) setcurrentsemanticsnodesui)).setOverlayMode(), 0L, null, null, 0L, TextAlign.m3504boximpl(TextAlign.Companion.m3511getCentere0LSkKk()), 0L, 0, false, 0, 0, null, (TextStyle) performLayout.addContentView.MediaSessionCompatResultReceiverWrapper(), getpostalcode, 48, 0, 130040);
            execsessionsuccesscallbackcommand = fieldtointeger.serializer;
            if (execsessionsuccesscallbackcommand == null) {
                getpostalcode.serializer(-276096852);
                getpostalcode.IconCompatParcelizer(false);
                z2 = true;
            } else {
                getpostalcode.serializer(-276096851);
                Modifier modifierWrite2 = SizeKt.write(companion3, 1.0f);
                ModalBottomSheetYbuCTN8 modalBottomSheetYbuCTN8Serializer3 = ModalBottomSheetKtModalBottomSheet311.serializer(Arrangement.MediaDescriptionCompat, companion.getCenterHorizontally(), getpostalcode, 48);
                int iHashCode3 = Long.hashCode(getpostalcode.RatingCompat);
                DragAndDropNodestartDragAndDropTransfer1 dragAndDropNodestartDragAndDropTransfer1Serializer3 = getpostalcode.serializer();
                Modifier modifierMaterializeModifier3 = ComposedModifierKt.materializeModifier(getpostalcode, modifierWrite2);
                constructor2 = companion2.getConstructor();
                getpostalcode.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg();
                if (getpostalcode.ComponentActivity) {
                    getpostalcode.serializer(constructor2);
                } else {
                    getpostalcode.r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28();
                }
                int i111 = IconCompatParcelizer + 5;
                write = i111 % Fields.SpotShadowColor;
                int i112 = i111 % 2;
                c8$$ExternalSyntheticOutline0.m(companion2, getpostalcode, modalBottomSheetYbuCTN8Serializer3, getpostalcode, dragAndDropNodestartDragAndDropTransfer1Serializer3);
                AndroidContentCaptureManagerCompanion.write(getpostalcode, modifierMaterializeModifier3, m1$$ExternalSyntheticOutline0.m(companion2, getpostalcode, Integer.valueOf(iHashCode3), getpostalcode));
                TertiaryKt.IconCompatParcelizer(execsessionsuccesscallbackcommand.RemoteActionCompatParcelizer, execsessionsuccesscallbackcommand.write, PaddingKt.m74paddingqDBjuR0$default(SizeKt.read(companion3), 0.0f, Dimensions.setExpandedFormat, 0.0f, 0.0f, 13), false, 0, null, null, null, getpostalcode, 0, 248);
                z2 = true;
                getpostalcode.IconCompatParcelizer(true);
                getpostalcode.IconCompatParcelizer(false);
            }
            getpostalcode.IconCompatParcelizer(z2);
            modifier3 = modifier6;
        } else {
            getpostalcode = getpostalcode2;
            getpostalcode.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
            modifier3 = modifier2;
        }
        gethandleruiannotationsMediaDescriptionCompat = getpostalcode.MediaDescriptionCompat();
        if (gethandleruiannotationsMediaDescriptionCompat != null) {
            gethandleruiannotationsMediaDescriptionCompat.serializer = new WrappedAnchor(fieldtointeger, modifier3, i, i2, 5);
        }
    }
}
