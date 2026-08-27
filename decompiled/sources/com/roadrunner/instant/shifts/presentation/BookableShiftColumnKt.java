package com.roadrunner.instant.shifts.presentation;

import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.BorderKt;
import androidx.compose.foundation.interaction.MutableInteractionSourceImpl;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.material3.TextKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Fields;
import androidx.compose.ui.graphics.RectangleShapeKt;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.res.PrimitiveResources_androidKt;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.text.style.TextOverflow;
import bo.app.af$$ExternalSyntheticOutline1;
import bo.app.c8$$ExternalSyntheticOutline0;
import bo.app.m1$$ExternalSyntheticOutline0;
import coil3.ExtrasKt;
import com.incognia.internal.pcn;
import com.logistics.rider.glovo.R;
import com.roadrunner.designsystem.compose.theme.tokens.Dimensions;
import com.roadrunner.device.manager.DeviceManager$$ExternalSyntheticLambda1;
import io.sentry.SentryUUID;
import o.AndroidContentCaptureManagerCompanion;
import o.DragAndDropNodestartDragAndDropTransfer1;
import o.ModalBottomSheetKtModalBottomSheet311;
import o.ModalBottomSheetYbuCTN8;
import o.buildMapping;
import o.extractAuthorizationHeader;
import o.getBirthDateFull;
import o.getCreditCardExpirationMonth;
import o.getHandleruiannotations;
import o.getNewPassword;
import o.getPostalCode;
import o.handleUrlOverridelambda1;
import o.hasRootCause;
import o.internalPathIteratorPeek;
import o.isValidParameter;
import o.performLayout;
import o.performMeasureDjhGOtQ;
import o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0;
import o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM;
import o.setCurrentSemanticsNodesui;
import o.shouldIgnore;
import o.show;

/* JADX INFO: loaded from: classes3.dex */
public abstract class BookableShiftColumnKt {
    private static int IconCompatParcelizer = 0;
    private static int write = 1;

    /* JADX WARN: Code duplicated, block: B:50:0x022b  */
    public static final void BookableShiftColumn(r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm, shouldIgnore shouldignore, Modifier modifier, getBirthDateFull getbirthdatefull, int i) {
        int i2;
        boolean z;
        boolean zIconCompatParcelizer;
        int i3;
        int i4 = 2 % 2;
        int i5 = IconCompatParcelizer + 95;
        write = i5 % Fields.SpotShadowColor;
        int i6 = i5 % 2;
        r8lambdaunavo3sxub_pc9xroryotnrlvsm.getClass();
        shouldignore.getClass();
        getPostalCode getpostalcode = (getPostalCode) getbirthdatefull;
        getpostalcode.MediaSessionCompatQueueItem(-95844698);
        if ((i & 6) == 0) {
            if (getpostalcode.IconCompatParcelizer(r8lambdaunavo3sxub_pc9xroryotnrlvsm)) {
                int i7 = write + 111;
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
        if ((i & 48) == 0) {
            if ((i & 64) == 0) {
                int i9 = write + 11;
                IconCompatParcelizer = i9 % Fields.SpotShadowColor;
                int i10 = i9 % 2;
                zIconCompatParcelizer = getpostalcode.read(shouldignore);
            } else {
                zIconCompatParcelizer = getpostalcode.IconCompatParcelizer(shouldignore);
                int i11 = write + 87;
                IconCompatParcelizer = i11 % Fields.SpotShadowColor;
                if (i11 % 2 != 0) {
                    int i12 = 3 % 2;
                }
            }
            i2 |= zIconCompatParcelizer ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= getpostalcode.read(modifier) ? Fields.RotationX : Fields.SpotShadowColor;
        }
        Object obj = null;
        if (getpostalcode.write(i2 & 1, (i2 & 147) != 146)) {
            int i13 = write + 37;
            IconCompatParcelizer = i13 % Fields.SpotShadowColor;
            int i14 = i13 % 2;
            setCurrentSemanticsNodesui setcurrentsemanticsnodesui = performMeasureDjhGOtQ.RemoteActionCompatParcelizer;
            Modifier modifierWrite = PaddingKt.write(SizeKt.m86width3ABfNKs(BorderKt.write(BackgroundKt.m20backgroundbw27NRU(modifier, ((buildMapping) getpostalcode.write((getNewPassword) setcurrentsemanticsnodesui)).getPopupTheme(), RectangleShapeKt.getRectangleShape()), Dimensions.write, ((buildMapping) getpostalcode.write((getNewPassword) setcurrentsemanticsnodesui)).setPopupTheme(), RoundedCornerShapeKt.IconCompatParcelizer(Dimensions.accessensureViewModelStore)), PrimitiveResources_androidKt.dimensionResource(R.dimen.instant_shift_card_width, getpostalcode, 0)), Dimensions.setTransitioning);
            ModalBottomSheetYbuCTN8 modalBottomSheetYbuCTN8Serializer = ModalBottomSheetKtModalBottomSheet311.serializer(Arrangement.MediaDescriptionCompat, Alignment.Companion.getCenterHorizontally(), getpostalcode, 48);
            int iHashCode = Long.hashCode(getpostalcode.RatingCompat);
            DragAndDropNodestartDragAndDropTransfer1 dragAndDropNodestartDragAndDropTransfer1Serializer = getpostalcode.serializer();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(getpostalcode, modifierWrite);
            ComposeUiNode.Companion companion = ComposeUiNode.Companion;
            r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 constructor = companion.getConstructor();
            if (getpostalcode.read == null) {
                SentryUUID.write();
                throw null;
            }
            getpostalcode.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg();
            if (getpostalcode.ComponentActivity) {
                int i15 = IconCompatParcelizer + 5;
                write = i15 % Fields.SpotShadowColor;
                if (i15 % 2 == 0) {
                    getpostalcode.serializer(constructor);
                    int i16 = 78 / 0;
                } else {
                    getpostalcode.serializer(constructor);
                }
            } else {
                getpostalcode.r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28();
            }
            c8$$ExternalSyntheticOutline0.m(companion, getpostalcode, modalBottomSheetYbuCTN8Serializer, getpostalcode, dragAndDropNodestartDragAndDropTransfer1Serializer);
            AndroidContentCaptureManagerCompanion.write(getpostalcode, modifierMaterializeModifier, m1$$ExternalSyntheticOutline0.m(companion, getpostalcode, Integer.valueOf(iHashCode), getpostalcode));
            String str = shouldignore.serializer;
            TextStyle textStyle = (TextStyle) performLayout.read(-1830567612, pcn.serializer(), new Object[0], 1830567614, pcn.serializer(), pcn.serializer(), pcn.serializer());
            long presenter = ((buildMapping) getpostalcode.write((getNewPassword) setcurrentsemanticsnodesui)).setPresenter();
            TextAlign.Companion companion2 = TextAlign.Companion;
            boolean z2 = false;
            TextKt.m131TextNvy7gAk(str, null, presenter, 0L, null, null, 0L, TextAlign.m3504boximpl(companion2.m3511getCentere0LSkKk()), 0L, 0, false, 1, 0, null, textStyle, getpostalcode, 0, 24576, 113658);
            Modifier.Companion companion3 = Modifier.Companion;
            float f = Dimensions.setSplitBackground;
            ExtrasKt.read(913837329, handleUrlOverridelambda1.RemoteActionCompatParcelizer(), handleUrlOverridelambda1.RemoteActionCompatParcelizer(), -913837326, handleUrlOverridelambda1.RemoteActionCompatParcelizer(), handleUrlOverridelambda1.RemoteActionCompatParcelizer(), new Object[]{getpostalcode, SizeKt.m75height3ABfNKs(companion3, f)});
            TextKt.m131TextNvy7gAk(shouldignore.MediaSessionCompatQueueItem, null, ((buildMapping) getpostalcode.write((getNewPassword) setcurrentsemanticsnodesui)).setPresenter(), 0L, null, null, 0L, TextAlign.m3504boximpl(companion2.m3511getCentere0LSkKk()), 0L, TextOverflow.Companion.m3569getEllipsisgIe3tQ8(), false, 2, 0, null, performLayout.write(), getpostalcode, 0, 24960, 109562);
            ExtrasKt.read(913837329, handleUrlOverridelambda1.RemoteActionCompatParcelizer(), handleUrlOverridelambda1.RemoteActionCompatParcelizer(), -913837326, handleUrlOverridelambda1.RemoteActionCompatParcelizer(), handleUrlOverridelambda1.RemoteActionCompatParcelizer(), new Object[]{getpostalcode, companion3.then(new show(1.0f, true))});
            Modifier modifierM = af$$ExternalSyntheticOutline1.m(companion3, f, getpostalcode, companion3, 1.0f);
            String str2 = shouldignore.write;
            if ((i2 & 14) == 4) {
                int i17 = write + 47;
                IconCompatParcelizer = i17 % Fields.SpotShadowColor;
                if (i17 % 2 != 0) {
                    z = false;
                } else {
                    z = true;
                }
            } else {
                z = false;
            }
            if ((i2 & 112) == 32 || ((i2 & 64) != 0 && getpostalcode.IconCompatParcelizer(shouldignore))) {
                z2 = true;
            }
            Object objComponentActivity = getpostalcode.ComponentActivity();
            if ((z | z2) || objComponentActivity == getCreditCardExpirationMonth.write) {
                objComponentActivity = new DeviceManager$$ExternalSyntheticLambda1(r8lambdaunavo3sxub_pc9xroryotnrlvsm, 27, shouldignore);
                getpostalcode.write(objComponentActivity);
                int i18 = write + 111;
                IconCompatParcelizer = i18 % Fields.SpotShadowColor;
                int i19 = i18 % 2;
            }
            isValidParameter.RemoteActionCompatParcelizer(str2, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) objComponentActivity, modifierM, false, (Integer) null, (hasRootCause) null, (extractAuthorizationHeader) null, (MutableInteractionSourceImpl) null, (getBirthDateFull) getpostalcode, 384, 504);
            getpostalcode.IconCompatParcelizer(true);
        } else {
            getpostalcode.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
        }
        getHandleruiannotations gethandleruiannotationsMediaDescriptionCompat = getpostalcode.MediaDescriptionCompat();
        if (gethandleruiannotationsMediaDescriptionCompat != null) {
            gethandleruiannotationsMediaDescriptionCompat.serializer = new internalPathIteratorPeek(i, 21, r8lambdaunavo3sxub_pc9xroryotnrlvsm, shouldignore, modifier);
        }
        int i20 = write + 63;
        IconCompatParcelizer = i20 % Fields.SpotShadowColor;
        if (i20 % 2 == 0) {
            return;
        }
        obj.hashCode();
        throw null;
    }
}
