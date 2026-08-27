package com.roadrunner.liveness.recording.presentation.compose;

import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.material3.TextKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Fields;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.res.StringResources_androidKt;
import bo.app.c8$$ExternalSyntheticOutline0;
import bo.app.m1$$ExternalSyntheticOutline0;
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
import o.getPostalCode;
import o.getTopLeftannotations;
import o.lambda321;
import o.performLayout;
import o.performMeasureDjhGOtQ;
import o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0;
import o.setCurrentSemanticsNodesui;

/* JADX INFO: loaded from: classes3.dex */
public abstract class ErrorCardKt {
    private static int RemoteActionCompatParcelizer = 1;
    private static int write;

    /* JADX WARN: Code duplicated, block: B:28:0x0071  */
    public static final void ErrorCard(int i, getBirthDateFull getbirthdatefull, Modifier modifier, String str, String str2) {
        int i2;
        boolean z;
        getPostalCode getpostalcode;
        String str3;
        String str4;
        String strStringResource;
        String strStringResource2;
        int i3 = 2 % 2;
        getPostalCode getpostalcode2 = (getPostalCode) getbirthdatefull;
        getpostalcode2.MediaSessionCompatQueueItem(-1487953522);
        if ((i & 6) == 0) {
            i2 = (getpostalcode2.read(modifier) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= 16;
        }
        if ((i & 384) == 0) {
            int i4 = RemoteActionCompatParcelizer + 27;
            write = i4 % Fields.SpotShadowColor;
            int i5 = i4 % 2;
            i2 |= Fields.SpotShadowColor;
        }
        if ((i2 & 147) != 146) {
            z = true;
        } else {
            int i6 = RemoteActionCompatParcelizer + 37;
            write = i6 % Fields.SpotShadowColor;
            int i7 = i6 % 2;
            z = false;
        }
        if (getpostalcode2.write(i2 & 1, z)) {
            getpostalcode2.r8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss();
            if ((i & 1) != 0) {
                int i8 = write + 91;
                RemoteActionCompatParcelizer = i8 % Fields.SpotShadowColor;
                int i9 = i8 % 2;
                if (getpostalcode2.PlaybackStateCompat()) {
                    strStringResource = StringResources_androidKt.stringResource(R.string.liveness_error_card_title, getpostalcode2, 0);
                    strStringResource2 = StringResources_androidKt.stringResource(R.string.liveness_error_card_description, getpostalcode2, 0);
                } else {
                    getpostalcode2.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
                    strStringResource = str;
                    strStringResource2 = str2;
                }
            } else {
                strStringResource = StringResources_androidKt.stringResource(R.string.liveness_error_card_title, getpostalcode2, 0);
                strStringResource2 = StringResources_androidKt.stringResource(R.string.liveness_error_card_description, getpostalcode2, 0);
            }
            getpostalcode2.RemoteActionCompatParcelizer();
            getTopLeftannotations gettopleftannotationsIconCompatParcelizer = RoundedCornerShapeKt.IconCompatParcelizer(Dimensions.setPadding);
            setCurrentSemanticsNodesui setcurrentsemanticsnodesui = performMeasureDjhGOtQ.RemoteActionCompatParcelizer;
            Modifier modifierWrite = PaddingKt.write(SizeKt.write(BackgroundKt.m20backgroundbw27NRU(modifier, ((buildMapping) getpostalcode2.write((getNewPassword) setcurrentsemanticsnodesui)).setShowingForActionMode(), gettopleftannotationsIconCompatParcelizer), 1.0f), Dimensions.setTransitioning);
            ModalBottomSheetYbuCTN8 modalBottomSheetYbuCTN8Serializer = ModalBottomSheetKtModalBottomSheet311.serializer(Arrangement.MediaDescriptionCompat, Alignment.Companion.getCenterHorizontally(), getpostalcode2, 48);
            int iHashCode = Long.hashCode(getpostalcode2.RatingCompat);
            DragAndDropNodestartDragAndDropTransfer1 dragAndDropNodestartDragAndDropTransfer1Serializer = getpostalcode2.serializer();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(getpostalcode2, modifierWrite);
            ComposeUiNode.Companion companion = ComposeUiNode.Companion;
            r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 constructor = companion.getConstructor();
            Object obj = null;
            if (getpostalcode2.read == null) {
                SentryUUID.write();
                throw null;
            }
            int i10 = write + 45;
            RemoteActionCompatParcelizer = i10 % Fields.SpotShadowColor;
            if (i10 % 2 == 0) {
                getpostalcode2.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg();
                boolean z2 = getpostalcode2.ComponentActivity;
                obj.hashCode();
                throw null;
            }
            getpostalcode2.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg();
            if (getpostalcode2.ComponentActivity) {
                getpostalcode2.serializer(constructor);
            } else {
                getpostalcode2.r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28();
                int i11 = RemoteActionCompatParcelizer + 49;
                write = i11 % Fields.SpotShadowColor;
                if (i11 % 2 != 0) {
                    int i12 = 2 / 4;
                }
            }
            c8$$ExternalSyntheticOutline0.m(companion, getpostalcode2, modalBottomSheetYbuCTN8Serializer, getpostalcode2, dragAndDropNodestartDragAndDropTransfer1Serializer);
            AndroidContentCaptureManagerCompanion.write(getpostalcode2, modifierMaterializeModifier, m1$$ExternalSyntheticOutline0.m(companion, getpostalcode2, Integer.valueOf(iHashCode), getpostalcode2));
            TextKt.m131TextNvy7gAk(strStringResource, null, ((buildMapping) getpostalcode2.write((getNewPassword) setcurrentsemanticsnodesui)).getWindowSystemUiVisibility(), 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, performLayout.MediaSessionCompatToken(), getpostalcode2, 0, 0, 131066);
            getpostalcode = getpostalcode2;
            TextKt.m131TextNvy7gAk(strStringResource2, PaddingKt.m74paddingqDBjuR0$default(Modifier.Companion, 0.0f, Dimensions.getActionBarHideOffset, 0.0f, 0.0f, 13), ((buildMapping) getpostalcode2.write((getNewPassword) setcurrentsemanticsnodesui)).getActionBarHideOffset(), 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, performLayout.IconCompatParcelizer(), getpostalcode, 0, 0, 131064);
            getpostalcode.IconCompatParcelizer(true);
            str3 = strStringResource;
            str4 = strStringResource2;
        } else {
            getpostalcode = getpostalcode2;
            getpostalcode.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
            str3 = str;
            str4 = str2;
        }
        getHandleruiannotations gethandleruiannotationsMediaDescriptionCompat = getpostalcode.MediaDescriptionCompat();
        if (gethandleruiannotationsMediaDescriptionCompat != null) {
            gethandleruiannotationsMediaDescriptionCompat.serializer = new lambda321(modifier, str3, str4, i);
        }
    }
}
