package com.roadrunner.login.presentation.countryselection.compose;

import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.Arrangement$Center$1;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.material3.TextKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Fields;
import androidx.compose.ui.graphics.RectangleShapeKt;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.text.style.TextOverflow;
import bo.app.c8$$ExternalSyntheticOutline0;
import bo.app.m1$$ExternalSyntheticOutline0;
import coil3.ExtrasKt;
import com.incognia.internal.pcn;
import com.roadrunner.designsystem.compose.theme.tokens.Dimensions;
import com.roadrunner.rrds.compose.component.layouts.DividerKt;
import io.sentry.SentryUUID;
import o.AndroidContentCaptureManagerCompanion;
import o.DragAndDropNodestartDragAndDropTransfer1;
import o.ModalBottomSheetKtModalBottomSheet311;
import o.ModalBottomSheetYbuCTN8;
import o.TextFieldDefaults;
import o.bExternalSyntheticLambda1;
import o.buildMapping;
import o.copyejIjP34;
import o.getAddressCountry;
import o.getBirthDateFull;
import o.getHandleruiannotations;
import o.getNewPassword;
import o.getPostalCode;
import o.handleUrlOverridelambda1;
import o.p2;
import o.performLayout;
import o.performMeasureDjhGOtQ;
import o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0;
import o.r8lambdafvzP3Wky1RLLzE56uVXaMHcvU;
import o.setCurrentSemanticsNodesui;
import o.supportingTextPaddinga9UjIt4material3default;

/* JADX INFO: loaded from: classes3.dex */
public abstract class CountryItemKt {
    private static int IconCompatParcelizer = 1;
    private static int read;

    public static final void CountryItem(bExternalSyntheticLambda1 bexternalsyntheticlambda1, Modifier modifier, getBirthDateFull getbirthdatefull, int i) {
        int i2;
        boolean z;
        getPostalCode getpostalcode;
        long popupTheme;
        Modifier modifier2;
        Modifier.Companion companion;
        int i3;
        boolean z2;
        Modifier modifierWrite;
        float f;
        int i4;
        int i5;
        long j;
        int i6;
        int i7 = 2 % 2;
        bexternalsyntheticlambda1.getClass();
        getPostalCode getpostalcode2 = (getPostalCode) getbirthdatefull;
        getpostalcode2.MediaSessionCompatQueueItem(1157551426);
        getAddressCountry getaddresscountry = getpostalcode2.read;
        if ((i & 6) == 0) {
            if (getpostalcode2.IconCompatParcelizer(bexternalsyntheticlambda1)) {
                int i8 = read + 35;
                IconCompatParcelizer = i8 % Fields.SpotShadowColor;
                int i9 = i8 % 2;
                i6 = 4;
            } else {
                i6 = 2;
            }
            i2 = i6 | i;
        } else {
            int i10 = read + 119;
            IconCompatParcelizer = i10 % Fields.SpotShadowColor;
            if (i10 % 2 == 0) {
                int i11 = 5 % 3;
            }
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= getpostalcode2.read(modifier) ? 32 : 16;
        }
        if ((i2 & 19) != 18) {
            z = true;
        } else {
            int i12 = read + 21;
            IconCompatParcelizer = i12 % Fields.SpotShadowColor;
            int i13 = i12 % 2;
            z = false;
        }
        if (getpostalcode2.write(i2 & 1, z)) {
            Modifier.Companion companion2 = Modifier.Companion;
            Modifier modifierM73paddingVpY3zN4$default = PaddingKt.m73paddingVpY3zN4$default(companion2, Dimensions.getAnimatedVisibility, 0.0f, 2);
            if (!(!bexternalsyntheticlambda1.serializer)) {
                int i14 = IconCompatParcelizer + 79;
                read = i14 % Fields.SpotShadowColor;
                int i15 = i14 % 2;
                getpostalcode2.serializer(10397904);
                popupTheme = ((buildMapping) getpostalcode2.write((getNewPassword) performMeasureDjhGOtQ.RemoteActionCompatParcelizer)).setKeyListener();
            } else {
                getpostalcode2.serializer(10398763);
                popupTheme = ((buildMapping) getpostalcode2.write((getNewPassword) performMeasureDjhGOtQ.RemoteActionCompatParcelizer)).getPopupTheme();
            }
            getpostalcode2.IconCompatParcelizer(false);
            Arrangement$Center$1 arrangement$Center$1 = Arrangement.IconCompatParcelizer;
            Modifier modifierM20backgroundbw27NRU = BackgroundKt.m20backgroundbw27NRU(modifier, popupTheme, RectangleShapeKt.getRectangleShape());
            Alignment.Companion companion3 = Alignment.Companion;
            ModalBottomSheetYbuCTN8 modalBottomSheetYbuCTN8Serializer = ModalBottomSheetKtModalBottomSheet311.serializer(arrangement$Center$1, companion3.getStart(), getpostalcode2, 6);
            int iHashCode = Long.hashCode(getpostalcode2.RatingCompat);
            DragAndDropNodestartDragAndDropTransfer1 dragAndDropNodestartDragAndDropTransfer1Serializer = getpostalcode2.serializer();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(getpostalcode2, modifierM20backgroundbw27NRU);
            ComposeUiNode.Companion companion4 = ComposeUiNode.Companion;
            r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 constructor = companion4.getConstructor();
            if (getaddresscountry == null) {
                SentryUUID.write();
                throw null;
            }
            getpostalcode2.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg();
            if (getpostalcode2.ComponentActivity) {
                int i16 = read + 51;
                IconCompatParcelizer = i16 % Fields.SpotShadowColor;
                int i17 = i16 % 2;
                getpostalcode2.serializer(constructor);
            } else {
                getpostalcode2.r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28();
            }
            c8$$ExternalSyntheticOutline0.m(companion4, getpostalcode2, modalBottomSheetYbuCTN8Serializer, getpostalcode2, dragAndDropNodestartDragAndDropTransfer1Serializer);
            AndroidContentCaptureManagerCompanion.write(getpostalcode2, modifierMaterializeModifier, m1$$ExternalSyntheticOutline0.m(companion4, getpostalcode2, Integer.valueOf(iHashCode), getpostalcode2));
            Alignment.Vertical centerVertically = companion3.getCenterVertically();
            Modifier modifierWrite2 = SizeKt.write(modifierM73paddingVpY3zN4$default, 1.0f);
            float f2 = Dimensions.setTransitioning;
            Modifier modifierM73paddingVpY3zN4$default2 = PaddingKt.m73paddingVpY3zN4$default(modifierWrite2, 0.0f, f2, 1);
            supportingTextPaddinga9UjIt4material3default supportingtextpaddinga9ujit4material3defaultSerializer = TextFieldDefaults.serializer(Arrangement.MediaBrowserCompatMediaItem, centerVertically, getpostalcode2, 48);
            int iHashCode2 = Long.hashCode(getpostalcode2.RatingCompat);
            DragAndDropNodestartDragAndDropTransfer1 dragAndDropNodestartDragAndDropTransfer1Serializer2 = getpostalcode2.serializer();
            Modifier modifierMaterializeModifier2 = ComposedModifierKt.materializeModifier(getpostalcode2, modifierM73paddingVpY3zN4$default2);
            r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 constructor2 = companion4.getConstructor();
            getpostalcode2.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg();
            if (getpostalcode2.ComponentActivity) {
                getpostalcode2.serializer(constructor2);
            } else {
                getpostalcode2.r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28();
            }
            r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.read(companion4, getpostalcode2, supportingtextpaddinga9ujit4material3defaultSerializer, getpostalcode2, dragAndDropNodestartDragAndDropTransfer1Serializer2);
            AndroidContentCaptureManagerCompanion.write(getpostalcode2, modifierMaterializeModifier2, m1$$ExternalSyntheticOutline0.m(companion4, getpostalcode2, Integer.valueOf(iHashCode2), getpostalcode2));
            if (bexternalsyntheticlambda1.IconCompatParcelizer == null) {
                getpostalcode2.serializer(1007795726);
                getpostalcode2.IconCompatParcelizer(false);
                i3 = 0;
                companion = companion2;
                modifier2 = modifierM73paddingVpY3zN4$default;
            } else {
                getpostalcode2.serializer(1007795727);
                modifier2 = modifierM73paddingVpY3zN4$default;
                companion = companion2;
                TextKt.m131TextNvy7gAk(bexternalsyntheticlambda1.IconCompatParcelizer, PaddingKt.m74paddingqDBjuR0$default(companion2, 0.0f, 0.0f, Dimensions.setSplitBackground, 0.0f, 11), ((buildMapping) getpostalcode2.write((getNewPassword) performMeasureDjhGOtQ.RemoteActionCompatParcelizer)).setPresenter(), 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, (TextStyle) performLayout.read(925764871, pcn.serializer(), new Object[0], -925764870, pcn.serializer(), pcn.serializer(), pcn.serializer()), getpostalcode2, 0, 0, 131064);
                getpostalcode2 = getpostalcode2;
                i3 = 0;
                getpostalcode2.IconCompatParcelizer(false);
            }
            String str = bexternalsyntheticlambda1.write;
            TextStyle textStyle = (TextStyle) performLayout.read(925764871, pcn.serializer(), new Object[i3], -925764870, pcn.serializer(), pcn.serializer(), pcn.serializer());
            setCurrentSemanticsNodesui setcurrentsemanticsnodesui = performMeasureDjhGOtQ.RemoteActionCompatParcelizer;
            long presenter = ((buildMapping) getpostalcode2.write((getNewPassword) setcurrentsemanticsnodesui)).setPresenter();
            TextAlign.Companion companion5 = TextAlign.Companion;
            int iM3516getStarte0LSkKk = companion5.m3516getStarte0LSkKk();
            TextOverflow.Companion companion6 = TextOverflow.Companion;
            Modifier.Companion companion7 = companion;
            getPostalCode getpostalcode3 = getpostalcode2;
            TextKt.m131TextNvy7gAk(str, copyejIjP34.write(companion7, 2.0f), presenter, 0L, null, null, 0L, TextAlign.m3504boximpl(iM3516getStarte0LSkKk), 0L, companion6.m3569getEllipsisgIe3tQ8(), false, 1, 0, null, textStyle, getpostalcode3, 0, 24960, 109560);
            if (bexternalsyntheticlambda1.RemoteActionCompatParcelizer == null) {
                getpostalcode3.serializer(1008447005);
                getpostalcode3.IconCompatParcelizer(false);
                getpostalcode = getpostalcode3;
            } else {
                getpostalcode3.serializer(1008447006);
                ExtrasKt.read(913837329, handleUrlOverridelambda1.RemoteActionCompatParcelizer(), handleUrlOverridelambda1.RemoteActionCompatParcelizer(), -913837326, handleUrlOverridelambda1.RemoteActionCompatParcelizer(), handleUrlOverridelambda1.RemoteActionCompatParcelizer(), new Object[]{getpostalcode3, SizeKt.m86width3ABfNKs(companion7, f2)});
                TextKt.m131TextNvy7gAk(bexternalsyntheticlambda1.RemoteActionCompatParcelizer, copyejIjP34.write(companion7, 1.0f), ((buildMapping) getpostalcode3.write((getNewPassword) setcurrentsemanticsnodesui)).setPresenter(), 0L, null, null, 0L, TextAlign.m3504boximpl(companion5.m3512getEnde0LSkKk()), 0L, companion6.m3569getEllipsisgIe3tQ8(), false, 1, 0, null, performLayout.IconCompatParcelizer(), getpostalcode3, 0, 24960, 109560);
                getpostalcode = getpostalcode3;
                getpostalcode.IconCompatParcelizer(false);
            }
            int i18 = IconCompatParcelizer + 61;
            read = i18 % Fields.SpotShadowColor;
            if (i18 % 2 != 0) {
                z2 = true;
                getpostalcode.IconCompatParcelizer(true);
                modifierWrite = SizeKt.write(modifier2, 1.0f);
                f = 0.0f;
                i4 = 0;
                i5 = 46;
                j = 1;
            } else {
                z2 = true;
                getpostalcode.IconCompatParcelizer(true);
                modifierWrite = SizeKt.write(modifier2, 1.0f);
                f = 0.0f;
                i4 = 0;
                i5 = 6;
                j = 0;
            }
            DividerKt.read(f, i4, i5, j, getpostalcode, modifierWrite);
            getpostalcode.IconCompatParcelizer(z2);
        } else {
            getpostalcode = getpostalcode2;
            getpostalcode.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
        }
        getHandleruiannotations gethandleruiannotationsMediaDescriptionCompat = getpostalcode.MediaDescriptionCompat();
        if (gethandleruiannotationsMediaDescriptionCompat != null) {
            gethandleruiannotationsMediaDescriptionCompat.serializer = new p2(i, 16, bexternalsyntheticlambda1, modifier);
        }
    }
}
