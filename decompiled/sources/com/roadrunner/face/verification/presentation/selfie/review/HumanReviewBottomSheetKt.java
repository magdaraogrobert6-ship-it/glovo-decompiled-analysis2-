package com.roadrunner.face.verification.presentation.selfie.review;

import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.material3.ModalBottomSheetKt;
import androidx.compose.material3.SheetState;
import androidx.compose.material3.TextKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Fields;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.res.StringResources_androidKt;
import androidx.compose.ui.text.TextStyle;
import bo.app.c8$$ExternalSyntheticOutline0;
import bo.app.m1$$ExternalSyntheticOutline0;
import coil3.ExtrasKt;
import com.logistics.rider.glovo.R;
import com.roadrunner.designsystem.compose.theme.tokens.Dimensions;
import com.roadrunner.rrds.compose.component.buttons.PrimaryKt;
import io.sentry.SentryUUID;
import o.AndroidContentCaptureManagerCompanion;
import o.DefaultLazyKey;
import o.DragAndDropNodestartDragAndDropTransfer1;
import o.ModalBottomSheetKtModalBottomSheet311;
import o.ModalBottomSheetYbuCTN8;
import o.buildMapping;
import o.getBirthDateFull;
import o.getHandleruiannotations;
import o.getNewPassword;
import o.getPostalCode;
import o.handleUrlOverridelambda1;
import o.layoutDependsOn;
import o.p6;
import o.performLayout;
import o.performMeasureDjhGOtQ;
import o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0;
import o.setCurrentSemanticsNodesui;

/* JADX INFO: loaded from: classes3.dex */
public abstract class HumanReviewBottomSheetKt {
    private static int RemoteActionCompatParcelizer = 0;
    private static int read = 1;

    public static final void write(boolean z, r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k0, SheetState sheetState, Modifier modifier, getBirthDateFull getbirthdatefull, int i) {
        int i2;
        boolean z2;
        getPostalCode getpostalcode;
        Modifier modifier2;
        int i3;
        int i4 = 2 % 2;
        r8lambdardpfsr94j4iebcwx_kpqzpm8k0.getClass();
        sheetState.getClass();
        getPostalCode getpostalcode2 = (getPostalCode) getbirthdatefull;
        getpostalcode2.MediaSessionCompatQueueItem(-1280212710);
        if ((i & 6) == 0) {
            i2 = (getpostalcode2.write(z) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= getpostalcode2.IconCompatParcelizer(r8lambdardpfsr94j4iebcwx_kpqzpm8k0) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            if (getpostalcode2.read(sheetState)) {
                int i5 = RemoteActionCompatParcelizer;
                int i6 = i5 + 65;
                read = i6 % Fields.SpotShadowColor;
                i3 = i6 % 2 == 0 ? 16471 : Fields.RotationX;
                int i7 = i5 + 21;
                read = i7 % Fields.SpotShadowColor;
                if (i7 % 2 == 0) {
                    int i8 = 4 / 5;
                }
            } else {
                i3 = Fields.SpotShadowColor;
            }
            i2 |= i3;
        }
        int i9 = i2 | 3072;
        if ((i9 & 1171) != 1170) {
            int i10 = RemoteActionCompatParcelizer + 115;
            read = i10 % Fields.SpotShadowColor;
            int i11 = i10 % 2;
            z2 = true;
        } else {
            z2 = false;
        }
        if (!(!getpostalcode2.write(i9 & 1, z2))) {
            Modifier.Companion companion = Modifier.Companion;
            if (z) {
                getpostalcode2.serializer(492942187);
                float f = Dimensions.r8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8;
                ModalBottomSheetKt.m118ModalBottomSheetYbuCTN8(r8lambdardpfsr94j4iebcwx_kpqzpm8k0, companion, sheetState, 0.0f, false, RoundedCornerShapeKt.m97RoundedCornerShapea9UjIt4$default(f, f, 0.0f, 0.0f, 12), ((buildMapping) getpostalcode2.write((getNewPassword) performMeasureDjhGOtQ.RemoteActionCompatParcelizer)).IconCompatParcelizer(), 0L, 0.0f, 0L, null, null, null, ExtrasKt.write(871106497, new DefaultLazyKey(11, r8lambdardpfsr94j4iebcwx_kpqzpm8k0), getpostalcode2), getpostalcode2, ((i9 >> 3) & 14) | ((i9 >> 6) & 112) | (i9 & 896), 3078, 7064);
                getpostalcode = getpostalcode2;
                getpostalcode.IconCompatParcelizer(false);
            } else {
                getpostalcode = getpostalcode2;
                getpostalcode.serializer(493468040);
                getpostalcode.IconCompatParcelizer(false);
            }
            modifier2 = companion;
        } else {
            getpostalcode2.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
            modifier2 = modifier;
            getpostalcode = getpostalcode2;
        }
        getHandleruiannotations gethandleruiannotationsMediaDescriptionCompat = getpostalcode.MediaDescriptionCompat();
        if (gethandleruiannotationsMediaDescriptionCompat != null) {
            gethandleruiannotationsMediaDescriptionCompat.serializer = new p6(z, r8lambdardpfsr94j4iebcwx_kpqzpm8k0, sheetState, modifier2, i, 7);
        }
    }

    /* JADX WARN: Code duplicated, block: B:19:0x0066  */
    /* JADX WARN: Code duplicated, block: B:21:0x0094  */
    /* JADX WARN: Code duplicated, block: B:23:0x009b  */
    /* JADX WARN: Code duplicated, block: B:24:0x009f  */
    /* JADX WARN: Code duplicated, block: B:26:0x0199  */
    /* JADX WARN: Code duplicated, block: B:28:0x019e  */
    /* JADX WARN: Code duplicated, block: B:31:0x01a8  */
    /* JADX WARN: Code duplicated, block: B:33:? A[RETURN, SYNTHETIC] */
    public static final void HumanReviewBottomSheetContent(r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k0, getBirthDateFull getbirthdatefull, int i) {
        int i2;
        boolean z;
        getPostalCode getpostalcode;
        getHandleruiannotations gethandleruiannotationsMediaDescriptionCompat;
        Modifier.Companion companion;
        float f;
        ModalBottomSheetYbuCTN8 modalBottomSheetYbuCTN8Serializer;
        int iHashCode;
        DragAndDropNodestartDragAndDropTransfer1 dragAndDropNodestartDragAndDropTransfer1Serializer;
        Modifier modifierMaterializeModifier;
        ComposeUiNode.Companion companion2;
        r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 constructor;
        int i3;
        int i4 = 2 % 2;
        r8lambdardpfsr94j4iebcwx_kpqzpm8k0.getClass();
        getPostalCode getpostalcode2 = (getPostalCode) getbirthdatefull;
        getpostalcode2.MediaSessionCompatQueueItem(-359499752);
        if ((i & 6) == 0) {
            int i5 = RemoteActionCompatParcelizer + 113;
            read = i5 % Fields.SpotShadowColor;
            int i6 = i5 % 2;
            if (getpostalcode2.IconCompatParcelizer(r8lambdardpfsr94j4iebcwx_kpqzpm8k0)) {
                int i7 = RemoteActionCompatParcelizer + 21;
                read = i7 % Fields.SpotShadowColor;
                int i8 = i7 % 2;
                i3 = 4;
            } else {
                int i9 = read + 89;
                RemoteActionCompatParcelizer = i9 % Fields.SpotShadowColor;
                int i10 = i9 % 2;
                i3 = 2;
            }
            i2 = i3 | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) != 2) {
            int i11 = RemoteActionCompatParcelizer + 75;
            read = i11 % Fields.SpotShadowColor;
            if (i11 % 2 != 0) {
                z = true;
            }
            if (getpostalcode2.write(i2 & 1, z)) {
                companion = Modifier.Companion;
                float f2 = Dimensions.setTabContainer;
                f = Dimensions.setTransitioning;
                Modifier modifier = PaddingKt.read(companion, f2, f2, f2, f);
                modalBottomSheetYbuCTN8Serializer = ModalBottomSheetKtModalBottomSheet311.serializer(Arrangement.MediaDescriptionCompat, Alignment.Companion.getStart(), getpostalcode2, 0);
                iHashCode = Long.hashCode(getpostalcode2.RatingCompat);
                dragAndDropNodestartDragAndDropTransfer1Serializer = getpostalcode2.serializer();
                modifierMaterializeModifier = ComposedModifierKt.materializeModifier(getpostalcode2, modifier);
                companion2 = ComposeUiNode.Companion;
                constructor = companion2.getConstructor();
                if (getpostalcode2.read != null) {
                    SentryUUID.write();
                    throw null;
                }
                getpostalcode2.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg();
                if (getpostalcode2.ComponentActivity) {
                    getpostalcode2.serializer(constructor);
                } else {
                    getpostalcode2.r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28();
                }
                c8$$ExternalSyntheticOutline0.m(companion2, getpostalcode2, modalBottomSheetYbuCTN8Serializer, getpostalcode2, dragAndDropNodestartDragAndDropTransfer1Serializer);
                AndroidContentCaptureManagerCompanion.write(getpostalcode2, modifierMaterializeModifier, m1$$ExternalSyntheticOutline0.m(companion2, getpostalcode2, Integer.valueOf(iHashCode), getpostalcode2));
                String strStringResource = StringResources_androidKt.stringResource(R.string.selfie_consent_human_review_bottom_sheet_title, getpostalcode2, 0);
                TextStyle textStyleMediaSessionCompatQueueItem = performLayout.MediaSessionCompatQueueItem();
                setCurrentSemanticsNodesui setcurrentsemanticsnodesui = performMeasureDjhGOtQ.RemoteActionCompatParcelizer;
                TextKt.m131TextNvy7gAk(strStringResource, companion, ((buildMapping) getpostalcode2.write((getNewPassword) setcurrentsemanticsnodesui)).setPresenter(), 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, textStyleMediaSessionCompatQueueItem, getpostalcode2, 48, 0, 131064);
                Object[] objArr = {getpostalcode2, SizeKt.m75height3ABfNKs(companion, Dimensions.setPrimaryBackground)};
                ExtrasKt.read(913837329, handleUrlOverridelambda1.RemoteActionCompatParcelizer(), handleUrlOverridelambda1.RemoteActionCompatParcelizer(), -913837326, handleUrlOverridelambda1.RemoteActionCompatParcelizer(), handleUrlOverridelambda1.RemoteActionCompatParcelizer(), objArr);
                TextKt.m131TextNvy7gAk(StringResources_androidKt.stringResource(R.string.selfie_consent_human_review_bottom_sheet_description, getpostalcode2, 0), null, ((buildMapping) getpostalcode2.write((getNewPassword) setcurrentsemanticsnodesui)).setPresenter(), 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, performLayout.IconCompatParcelizer(), getpostalcode2, 0, 0, 131066);
                Object[] objArr2 = {getpostalcode2, SizeKt.m75height3ABfNKs(companion, f)};
                ExtrasKt.read(913837329, handleUrlOverridelambda1.RemoteActionCompatParcelizer(), handleUrlOverridelambda1.RemoteActionCompatParcelizer(), -913837326, handleUrlOverridelambda1.RemoteActionCompatParcelizer(), handleUrlOverridelambda1.RemoteActionCompatParcelizer(), objArr2);
                Modifier modifierWrite = SizeKt.write(companion, 1.0f);
                modifierWrite.getClass();
                PrimaryKt.write(StringResources_androidKt.stringResource(R.string.selfie_consent_human_review_bottom_sheet_button_text, getpostalcode2, 0), r8lambdardpfsr94j4iebcwx_kpqzpm8k0, modifierWrite, false, false, null, null, null, null, null, getpostalcode2, ((i2 << 3) & 112) | 384, 0, 2040);
                getpostalcode = getpostalcode2;
                getpostalcode.IconCompatParcelizer(true);
                int i12 = read + 119;
                RemoteActionCompatParcelizer = i12 % Fields.SpotShadowColor;
                int i13 = i12 % 2;
            } else {
                getpostalcode = getpostalcode2;
                getpostalcode.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
            }
            gethandleruiannotationsMediaDescriptionCompat = getpostalcode.MediaDescriptionCompat();
            if (gethandleruiannotationsMediaDescriptionCompat != null) {
                gethandleruiannotationsMediaDescriptionCompat.serializer = new layoutDependsOn(i, 0, r8lambdardpfsr94j4iebcwx_kpqzpm8k0);
            }
        }
        int i14 = RemoteActionCompatParcelizer + 101;
        read = i14 % Fields.SpotShadowColor;
        int i15 = i14 % 2;
        z = false;
        if (getpostalcode2.write(i2 & 1, z)) {
            companion = Modifier.Companion;
            float f3 = Dimensions.setTabContainer;
            f = Dimensions.setTransitioning;
            Modifier modifier2 = PaddingKt.read(companion, f3, f3, f3, f);
            modalBottomSheetYbuCTN8Serializer = ModalBottomSheetKtModalBottomSheet311.serializer(Arrangement.MediaDescriptionCompat, Alignment.Companion.getStart(), getpostalcode2, 0);
            iHashCode = Long.hashCode(getpostalcode2.RatingCompat);
            dragAndDropNodestartDragAndDropTransfer1Serializer = getpostalcode2.serializer();
            modifierMaterializeModifier = ComposedModifierKt.materializeModifier(getpostalcode2, modifier2);
            companion2 = ComposeUiNode.Companion;
            constructor = companion2.getConstructor();
            if (getpostalcode2.read != null) {
                SentryUUID.write();
                throw null;
            }
            getpostalcode2.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg();
            if (getpostalcode2.ComponentActivity) {
                getpostalcode2.serializer(constructor);
            } else {
                getpostalcode2.r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28();
            }
            c8$$ExternalSyntheticOutline0.m(companion2, getpostalcode2, modalBottomSheetYbuCTN8Serializer, getpostalcode2, dragAndDropNodestartDragAndDropTransfer1Serializer);
            AndroidContentCaptureManagerCompanion.write(getpostalcode2, modifierMaterializeModifier, m1$$ExternalSyntheticOutline0.m(companion2, getpostalcode2, Integer.valueOf(iHashCode), getpostalcode2));
            String strStringResource2 = StringResources_androidKt.stringResource(R.string.selfie_consent_human_review_bottom_sheet_title, getpostalcode2, 0);
            TextStyle textStyleMediaSessionCompatQueueItem2 = performLayout.MediaSessionCompatQueueItem();
            setCurrentSemanticsNodesui setcurrentsemanticsnodesui2 = performMeasureDjhGOtQ.RemoteActionCompatParcelizer;
            TextKt.m131TextNvy7gAk(strStringResource2, companion, ((buildMapping) getpostalcode2.write((getNewPassword) setcurrentsemanticsnodesui2)).setPresenter(), 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, textStyleMediaSessionCompatQueueItem2, getpostalcode2, 48, 0, 131064);
            Object[] objArr3 = {getpostalcode2, SizeKt.m75height3ABfNKs(companion, Dimensions.setPrimaryBackground)};
            ExtrasKt.read(913837329, handleUrlOverridelambda1.RemoteActionCompatParcelizer(), handleUrlOverridelambda1.RemoteActionCompatParcelizer(), -913837326, handleUrlOverridelambda1.RemoteActionCompatParcelizer(), handleUrlOverridelambda1.RemoteActionCompatParcelizer(), objArr3);
            TextKt.m131TextNvy7gAk(StringResources_androidKt.stringResource(R.string.selfie_consent_human_review_bottom_sheet_description, getpostalcode2, 0), null, ((buildMapping) getpostalcode2.write((getNewPassword) setcurrentsemanticsnodesui2)).setPresenter(), 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, performLayout.IconCompatParcelizer(), getpostalcode2, 0, 0, 131066);
            Object[] objArr4 = {getpostalcode2, SizeKt.m75height3ABfNKs(companion, f)};
            ExtrasKt.read(913837329, handleUrlOverridelambda1.RemoteActionCompatParcelizer(), handleUrlOverridelambda1.RemoteActionCompatParcelizer(), -913837326, handleUrlOverridelambda1.RemoteActionCompatParcelizer(), handleUrlOverridelambda1.RemoteActionCompatParcelizer(), objArr4);
            Modifier modifierWrite2 = SizeKt.write(companion, 1.0f);
            modifierWrite2.getClass();
            PrimaryKt.write(StringResources_androidKt.stringResource(R.string.selfie_consent_human_review_bottom_sheet_button_text, getpostalcode2, 0), r8lambdardpfsr94j4iebcwx_kpqzpm8k0, modifierWrite2, false, false, null, null, null, null, null, getpostalcode2, ((i2 << 3) & 112) | 384, 0, 2040);
            getpostalcode = getpostalcode2;
            getpostalcode.IconCompatParcelizer(true);
            int i16 = read + 119;
            RemoteActionCompatParcelizer = i16 % Fields.SpotShadowColor;
            int i17 = i16 % 2;
        } else {
            getpostalcode = getpostalcode2;
            getpostalcode.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
        }
        gethandleruiannotationsMediaDescriptionCompat = getpostalcode.MediaDescriptionCompat();
        if (gethandleruiannotationsMediaDescriptionCompat != null) {
            gethandleruiannotationsMediaDescriptionCompat.serializer = new layoutDependsOn(i, 0, r8lambdardpfsr94j4iebcwx_kpqzpm8k0);
        }
    }
}
