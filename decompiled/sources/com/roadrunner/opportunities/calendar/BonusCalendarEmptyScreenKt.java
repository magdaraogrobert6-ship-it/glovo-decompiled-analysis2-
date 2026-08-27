package com.roadrunner.opportunities.calendar;

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
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.style.TextAlign;
import bo.app.c8$$ExternalSyntheticOutline0;
import bo.app.m1$$ExternalSyntheticOutline0;
import coil3.ExtrasKt;
import com.incognia.internal.pcn;
import com.logistics.rider.glovo.R;
import com.roadrunner.designsystem.compose.theme.tokens.Dimensions;
import io.sentry.SentryUUID;
import o.AndroidContentCaptureManagerCompanion;
import o.DragAndDropNodestartDragAndDropTransfer1;
import o.ModalBottomSheetKtModalBottomSheet311;
import o.ModalBottomSheetYbuCTN8;
import o.buildMapping;
import o.getBirthDateFull;
import o.getHandleruiannotations;
import o.getNewPassword;
import o.getNonZeroRgk1Os;
import o.getPostalCode;
import o.handleUrlOverridelambda1;
import o.p2;
import o.performLayout;
import o.performMeasureDjhGOtQ;
import o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0;
import o.setCurrentSemanticsNodesui;
import o.tf;
import okio.Okio;

/* JADX INFO: loaded from: classes3.dex */
public abstract class BonusCalendarEmptyScreenKt {
    private static int IconCompatParcelizer = 0;
    private static int read = 1;

    public static final void BonusCalendarEmptyScreen(tf tfVar, Modifier modifier, getBirthDateFull getbirthdatefull, int i) {
        int i2;
        getPostalCode getpostalcode;
        Modifier modifier2;
        int i3;
        int i4 = 2 % 2;
        tfVar.getClass();
        getPostalCode getpostalcode2 = (getPostalCode) getbirthdatefull;
        getpostalcode2.MediaSessionCompatQueueItem(1579396740);
        if ((i & 6) == 0) {
            int i5 = read + 59;
            IconCompatParcelizer = i5 % Fields.SpotShadowColor;
            int i6 = i5 % 2;
            if (getpostalcode2.read(tfVar)) {
                int i7 = read + 37;
                IconCompatParcelizer = i7 % Fields.SpotShadowColor;
                int i8 = i7 % 2;
                i3 = 4;
            } else {
                i3 = 2;
            }
            i2 = i3 | i;
        } else {
            i2 = i;
        }
        int i9 = i2 | 48;
        if (getpostalcode2.write(i9 & 1, (i9 & 19) != 18)) {
            int i10 = read + 109;
            IconCompatParcelizer = i10 % Fields.SpotShadowColor;
            int i11 = i10 % 2;
            modifier2 = Modifier.Companion;
            Modifier modifierThen = modifier2.then(SizeKt.read);
            setCurrentSemanticsNodesui setcurrentsemanticsnodesui = performMeasureDjhGOtQ.RemoteActionCompatParcelizer;
            Modifier modifierWrite = PaddingKt.write(BackgroundKt.m20backgroundbw27NRU(modifierThen, ((buildMapping) getpostalcode2.write((getNewPassword) setcurrentsemanticsnodesui)).serializer(), RectangleShapeKt.getRectangleShape()), Dimensions.getAnimatedVisibility);
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
            } else {
                getpostalcode2.r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28();
            }
            c8$$ExternalSyntheticOutline0.m(companion, getpostalcode2, modalBottomSheetYbuCTN8Serializer, getpostalcode2, dragAndDropNodestartDragAndDropTransfer1Serializer);
            AndroidContentCaptureManagerCompanion.write(getpostalcode2, modifierMaterializeModifier, m1$$ExternalSyntheticOutline0.m(companion, getpostalcode2, Integer.valueOf(iHashCode), getpostalcode2));
            getNonZeroRgk1Os.write(Integer.valueOf(R.drawable.ic_calendar_empty), "", SizeKt.m86width3ABfNKs(SizeKt.m75height3ABfNKs(modifier2, Dimensions.onTrimMemory), Dimensions.onRetainNonConfigurationInstance), Okio.RemoteActionCompatParcelizer(R.drawable.ic_calendar_empty, getpostalcode2, 0), null, null, null, null, null, null, getpostalcode2, (Painter.$stable << 9) | 48, 0, 32752);
            ExtrasKt.read(913837329, handleUrlOverridelambda1.RemoteActionCompatParcelizer(), handleUrlOverridelambda1.RemoteActionCompatParcelizer(), -913837326, handleUrlOverridelambda1.RemoteActionCompatParcelizer(), handleUrlOverridelambda1.RemoteActionCompatParcelizer(), new Object[]{getpostalcode2, SizeKt.m83size3ABfNKs(modifier2, Dimensions.setStackedBackground)});
            String str = tfVar.read;
            TextStyle textStyle = (TextStyle) performLayout.read(925764871, pcn.serializer(), new Object[0], -925764870, pcn.serializer(), pcn.serializer(), pcn.serializer());
            long presenter = ((buildMapping) getpostalcode2.write((getNewPassword) setcurrentsemanticsnodesui)).setPresenter();
            TextAlign.Companion companion2 = TextAlign.Companion;
            TextKt.m131TextNvy7gAk(str, null, presenter, 0L, null, null, 0L, TextAlign.m3504boximpl(companion2.m3511getCentere0LSkKk()), 0L, 0, false, 0, 0, null, textStyle, getpostalcode2, 0, 0, 130042);
            ExtrasKt.read(913837329, handleUrlOverridelambda1.RemoteActionCompatParcelizer(), handleUrlOverridelambda1.RemoteActionCompatParcelizer(), -913837326, handleUrlOverridelambda1.RemoteActionCompatParcelizer(), handleUrlOverridelambda1.RemoteActionCompatParcelizer(), new Object[]{getpostalcode2, SizeKt.m83size3ABfNKs(modifier2, Dimensions.setSplitBackground)});
            TextKt.m131TextNvy7gAk(tfVar.write, null, ((buildMapping) getpostalcode2.write((getNewPassword) setcurrentsemanticsnodesui)).setPresenter(), 0L, null, null, 0L, TextAlign.m3504boximpl(companion2.m3511getCentere0LSkKk()), 0L, 0, false, 0, 0, null, performLayout.write(), getpostalcode2, 0, 0, 130042);
            getpostalcode = getpostalcode2;
            getpostalcode.IconCompatParcelizer(true);
        } else {
            getpostalcode = getpostalcode2;
            getpostalcode.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
            modifier2 = modifier;
        }
        getHandleruiannotations gethandleruiannotationsMediaDescriptionCompat = getpostalcode.MediaDescriptionCompat();
        if (gethandleruiannotationsMediaDescriptionCompat != null) {
            gethandleruiannotationsMediaDescriptionCompat.serializer = new p2(i, 22, tfVar, modifier2);
        }
    }
}
