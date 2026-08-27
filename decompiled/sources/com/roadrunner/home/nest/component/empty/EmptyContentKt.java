package com.roadrunner.home.nest.component.empty;

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
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.style.TextAlign;
import bo.app.c8$$ExternalSyntheticOutline0;
import bo.app.m1$$ExternalSyntheticOutline0;
import coil3.ExtrasKt;
import com.airbnb.lottie.compose.RememberLottieCompositionKt;
import com.incognia.internal.pcn;
import com.logistics.rider.glovo.R;
import com.roadrunner.designsystem.compose.theme.tokens.Dimensions;
import io.sentry.SentryUUID;
import o.AndroidContentCaptureManagerCompanion;
import o.ColorModel;
import o.DragAndDropNodestartDragAndDropTransfer1;
import o.ModalBottomSheetKtModalBottomSheet311;
import o.ModalBottomSheetYbuCTN8;
import o.StrokeJoinCompanion;
import o.accessgetXyzcp;
import o.buildMapping;
import o.dc;
import o.getBirthDateFull;
import o.getCmykxdoWZVw;
import o.getHandleruiannotations;
import o.getNewPassword;
import o.getPostalCode;
import o.handleUrlOverridelambda1;
import o.performLayout;
import o.performMeasureDjhGOtQ;
import o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0;
import o.setCurrentSemanticsNodesui;

/* JADX INFO: loaded from: classes3.dex */
public abstract class EmptyContentKt {
    private static int IconCompatParcelizer = 0;
    private static int read = 1;

    public static final void EmptyContent(int i, getBirthDateFull getbirthdatefull, Modifier modifier, String str) {
        int i2;
        getPostalCode getpostalcode;
        Modifier modifier2;
        int i3;
        int i4 = 2 % 2;
        int i5 = IconCompatParcelizer + 121;
        read = i5 % Fields.SpotShadowColor;
        int i6 = i5 % 2;
        getPostalCode getpostalcode2 = (getPostalCode) getbirthdatefull;
        getpostalcode2.MediaSessionCompatQueueItem(-1923524738);
        if ((i & 6) == 0) {
            int i7 = IconCompatParcelizer + 121;
            read = i7 % Fields.SpotShadowColor;
            int i8 = i7 % 2;
            if (getpostalcode2.read(str)) {
                int i9 = IconCompatParcelizer + 75;
                read = i9 % Fields.SpotShadowColor;
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
            int i12 = IconCompatParcelizer + 113;
            read = i12 % Fields.SpotShadowColor;
            int i13 = i12 % 2;
            Modifier.Companion companion = Modifier.Companion;
            Modifier modifierWrite = SizeKt.write(companion, 1.0f);
            setCurrentSemanticsNodesui setcurrentsemanticsnodesui = performMeasureDjhGOtQ.RemoteActionCompatParcelizer;
            Modifier modifierWrite2 = PaddingKt.write(BackgroundKt.m20backgroundbw27NRU(modifierWrite, ((buildMapping) getpostalcode2.write((getNewPassword) setcurrentsemanticsnodesui)).getPopupTheme(), RectangleShapeKt.getRectangleShape()), Dimensions.getAnimatedVisibility);
            ModalBottomSheetYbuCTN8 modalBottomSheetYbuCTN8Serializer = ModalBottomSheetKtModalBottomSheet311.serializer(Arrangement.IconCompatParcelizer, Alignment.Companion.getCenterHorizontally(), getpostalcode2, 54);
            int iHashCode = Long.hashCode(getpostalcode2.RatingCompat);
            DragAndDropNodestartDragAndDropTransfer1 dragAndDropNodestartDragAndDropTransfer1Serializer = getpostalcode2.serializer();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(getpostalcode2, modifierWrite2);
            ComposeUiNode.Companion companion2 = ComposeUiNode.Companion;
            r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 constructor = companion2.getConstructor();
            if (getpostalcode2.read == null) {
                SentryUUID.write();
                throw null;
            }
            getpostalcode2.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg();
            if (getpostalcode2.ComponentActivity) {
                int i14 = IconCompatParcelizer + 75;
                read = i14 % Fields.SpotShadowColor;
                if (i14 % 2 == 0) {
                    getpostalcode2.serializer(constructor);
                    int i15 = 88 / 0;
                } else {
                    getpostalcode2.serializer(constructor);
                }
            } else {
                getpostalcode2.r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28();
            }
            c8$$ExternalSyntheticOutline0.m(companion2, getpostalcode2, modalBottomSheetYbuCTN8Serializer, getpostalcode2, dragAndDropNodestartDragAndDropTransfer1Serializer);
            AndroidContentCaptureManagerCompanion.write(getpostalcode2, modifierMaterializeModifier, m1$$ExternalSyntheticOutline0.m(companion2, getpostalcode2, Integer.valueOf(iHashCode), getpostalcode2));
            accessgetXyzcp accessgetxyzcpIconCompatParcelizer = RememberLottieCompositionKt.IconCompatParcelizer(new getCmykxdoWZVw(R.raw.waiting), getpostalcode2);
            Modifier modifierM74paddingqDBjuR0$default = PaddingKt.m74paddingqDBjuR0$default(companion, 0.0f, Dimensions.onRetainCustomNonConfigurationInstance, 0.0f, 0.0f, 13);
            float f = Dimensions.onRetainNonConfigurationInstance;
            ColorModel.read((StrokeJoinCompanion) accessgetxyzcpIconCompatParcelizer.getValue(), SizeKt.m86width3ABfNKs(SizeKt.m75height3ABfNKs(modifierM74paddingqDBjuR0$default, f), f), Integer.MAX_VALUE, false, null, null, getpostalcode2, 1572864, 0, 0, 4194236);
            ExtrasKt.read(913837329, handleUrlOverridelambda1.RemoteActionCompatParcelizer(), handleUrlOverridelambda1.RemoteActionCompatParcelizer(), -913837326, handleUrlOverridelambda1.RemoteActionCompatParcelizer(), handleUrlOverridelambda1.RemoteActionCompatParcelizer(), new Object[]{getpostalcode2, SizeKt.m75height3ABfNKs(companion, Dimensions.setTabContainer)});
            TextKt.m131TextNvy7gAk(str, null, ((buildMapping) getpostalcode2.write((getNewPassword) setcurrentsemanticsnodesui)).setPresenter(), 0L, null, null, 0L, TextAlign.m3504boximpl(TextAlign.Companion.m3511getCentere0LSkKk()), 0L, 0, false, 0, 0, null, (TextStyle) performLayout.read(925764871, pcn.serializer(), new Object[0], -925764870, pcn.serializer(), pcn.serializer(), pcn.serializer()), getpostalcode2, i11 & 14, 0, 130042);
            getpostalcode = getpostalcode2;
            getpostalcode.IconCompatParcelizer(true);
            modifier2 = companion;
        } else {
            getpostalcode = getpostalcode2;
            getpostalcode.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
            int i16 = IconCompatParcelizer + 37;
            read = i16 % Fields.SpotShadowColor;
            int i17 = i16 % 2;
            modifier2 = modifier;
        }
        getHandleruiannotations gethandleruiannotationsMediaDescriptionCompat = getpostalcode.MediaDescriptionCompat();
        if (gethandleruiannotationsMediaDescriptionCompat != null) {
            gethandleruiannotationsMediaDescriptionCompat.serializer = new dc(i, str, modifier2, 12);
            int i18 = read + 81;
            IconCompatParcelizer = i18 % Fields.SpotShadowColor;
            if (i18 % 2 != 0) {
                int i19 = 2 % 3;
            }
        }
    }
}
