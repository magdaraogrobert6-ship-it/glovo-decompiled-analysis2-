package com.roadrunner.instant.shifts.presentation;

import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.BorderKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.material3.IconKt;
import androidx.compose.material3.TextKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Fields;
import androidx.compose.ui.graphics.RectangleShapeKt;
import androidx.compose.ui.graphics.painter.Painter;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.res.PainterResources_androidKt;
import androidx.compose.ui.res.PrimitiveResources_androidKt;
import androidx.compose.ui.text.style.TextAlign;
import bo.app.c8$$ExternalSyntheticOutline0;
import bo.app.m1$$ExternalSyntheticOutline0;
import com.logistics.rider.glovo.R;
import com.roadrunner.designsystem.compose.theme.tokens.Dimensions;
import com.roadrunner.rrds.compose.component.buttons.TertiaryKt;
import io.sentry.SentryUUID;
import o.AndroidContentCaptureManagerCompanion;
import o.DragAndDropNodestartDragAndDropTransfer1;
import o.ModalBottomSheetKtModalBottomSheet311;
import o.ModalBottomSheetYbuCTN8;
import o.buildMapping;
import o.getBirthDateFull;
import o.getHandleruiannotations;
import o.getNewPassword;
import o.getPostalCode;
import o.performLayout;
import o.performMeasureDjhGOtQ;
import o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0;
import o.r8lambdaZJefYWkAb6Rz_mRy9JTC1Xi8DDk;
import o.setCurrentSemanticsNodesui;

/* JADX INFO: loaded from: classes3.dex */
public abstract class InstantShiftViewAllColumnKt {
    private static int IconCompatParcelizer = 0;
    private static int serializer = 1;

    public static final void InstantShiftViewAllColumn(String str, String str2, r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k0, Modifier modifier, getBirthDateFull getbirthdatefull, int i) {
        int i2;
        boolean z;
        int i3;
        int i4 = 2 % 2;
        r8lambdardpfsr94j4iebcwx_kpqzpm8k0.getClass();
        getPostalCode getpostalcode = (getPostalCode) getbirthdatefull;
        getpostalcode.MediaSessionCompatQueueItem(700834068);
        if ((i & 6) == 0) {
            int i5 = IconCompatParcelizer + 97;
            serializer = i5 % Fields.SpotShadowColor;
            int i6 = i5 % 2;
            i2 = (getpostalcode.read(str) ? 4 : 2) | i;
        } else {
            int i7 = serializer + 57;
            IconCompatParcelizer = i7 % Fields.SpotShadowColor;
            int i8 = i7 % 2;
            i2 = i;
        }
        if ((i & 48) == 0) {
            if (!getpostalcode.read(str2)) {
                i3 = 16;
            } else {
                int i9 = serializer + 85;
                IconCompatParcelizer = i9 % Fields.SpotShadowColor;
                i3 = i9 % 2 != 0 ? 36 : 32;
            }
            i2 |= i3;
        }
        if ((i & 384) == 0) {
            int i10 = serializer + 103;
            IconCompatParcelizer = i10 % Fields.SpotShadowColor;
            int i11 = i10 % 2;
            i2 |= getpostalcode.IconCompatParcelizer(r8lambdardpfsr94j4iebcwx_kpqzpm8k0) ? Fields.RotationX : Fields.SpotShadowColor;
        }
        Object obj = null;
        if ((i & 3072) == 0) {
            int i12 = serializer + 77;
            IconCompatParcelizer = i12 % Fields.SpotShadowColor;
            if (i12 % 2 != 0) {
                getpostalcode.read(modifier);
                obj.hashCode();
                throw null;
            }
            i2 |= getpostalcode.read(modifier) ? Fields.CameraDistance : Fields.RotationZ;
        }
        if ((i2 & 1171) != 1170) {
            z = true;
        } else {
            int i13 = IconCompatParcelizer + 71;
            serializer = i13 % Fields.SpotShadowColor;
            int i14 = i13 % 2;
            z = false;
        }
        if (getpostalcode.write(i2 & 1, z)) {
            setCurrentSemanticsNodesui setcurrentsemanticsnodesui = performMeasureDjhGOtQ.RemoteActionCompatParcelizer;
            Modifier modifierSerializer = SizeKt.serializer(SizeKt.m86width3ABfNKs(BorderKt.write(BackgroundKt.m20backgroundbw27NRU(modifier, ((buildMapping) getpostalcode.write((getNewPassword) setcurrentsemanticsnodesui)).getPopupTheme(), RectangleShapeKt.getRectangleShape()), Dimensions.write, ((buildMapping) getpostalcode.write((getNewPassword) setcurrentsemanticsnodesui)).setPopupTheme(), RoundedCornerShapeKt.IconCompatParcelizer(Dimensions.accessensureViewModelStore)), PrimitiveResources_androidKt.dimensionResource(R.dimen.instant_shift_card_width, getpostalcode, 0)), 1.0f);
            float f = Dimensions.getAnimatedVisibility;
            float f2 = Dimensions.setTabContainer;
            Modifier modifier2 = PaddingKt.read(modifierSerializer, f2, f, f2, f2);
            ModalBottomSheetYbuCTN8 modalBottomSheetYbuCTN8Serializer = ModalBottomSheetKtModalBottomSheet311.serializer(Arrangement.read, Alignment.Companion.getCenterHorizontally(), getpostalcode, 54);
            int iHashCode = Long.hashCode(getpostalcode.RatingCompat);
            DragAndDropNodestartDragAndDropTransfer1 dragAndDropNodestartDragAndDropTransfer1Serializer = getpostalcode.serializer();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(getpostalcode, modifier2);
            ComposeUiNode.Companion companion = ComposeUiNode.Companion;
            r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 constructor = companion.getConstructor();
            if (getpostalcode.read == null) {
                SentryUUID.write();
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
            IconKt.m116Iconww6aTOc(PainterResources_androidKt.painterResource(R.drawable.ic_bold_large_search, getpostalcode, 0), (String) null, (Modifier) null, ((buildMapping) getpostalcode.write((getNewPassword) setcurrentsemanticsnodesui)).setPresenter(), getpostalcode, Painter.$stable | 48, 4);
            TextKt.m131TextNvy7gAk(str, null, ((buildMapping) getpostalcode.write((getNewPassword) setcurrentsemanticsnodesui)).setPresenter(), 0L, null, null, 0L, TextAlign.m3504boximpl(TextAlign.Companion.m3511getCentere0LSkKk()), 0L, 0, false, 0, 0, null, performLayout.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus(), getpostalcode, i2 & 14, 0, 130042);
            TertiaryKt.IconCompatParcelizer(str2, r8lambdardpfsr94j4iebcwx_kpqzpm8k0, null, false, 0, null, null, null, getpostalcode, (i2 >> 3) & 126, 252);
            getpostalcode.IconCompatParcelizer(true);
        } else {
            getpostalcode.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
        }
        getHandleruiannotations gethandleruiannotationsMediaDescriptionCompat = getpostalcode.MediaDescriptionCompat();
        if (gethandleruiannotationsMediaDescriptionCompat != null) {
            gethandleruiannotationsMediaDescriptionCompat.serializer = new r8lambdaZJefYWkAb6Rz_mRy9JTC1Xi8DDk(str, str2, r8lambdardpfsr94j4iebcwx_kpqzpm8k0, modifier, i, 2);
        }
    }
}
