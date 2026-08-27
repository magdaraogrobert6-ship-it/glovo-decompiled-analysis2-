package com.roadrunner.rider.state.searchshifts.presentation;

import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Fields;
import androidx.compose.ui.graphics.RectangleShapeKt;
import androidx.compose.ui.node.ComposeUiNode;
import bo.app.c8$$ExternalSyntheticOutline0;
import bo.app.m1$$ExternalSyntheticOutline0;
import com.roadrunner.designsystem.compose.theme.tokens.Dimensions;
import io.sentry.SentryUUID;
import o.AndroidContentCaptureManagerCompanion;
import o.DragAndDropNodestartDragAndDropTransfer1;
import o.ModalBottomSheetKtModalBottomSheet311;
import o.ModalBottomSheetYbuCTN8;
import o.buildMapping;
import o.getBirthDateFull;
import o.getHandleruiannotations;
import o.getInternalPaintui_graphics;
import o.getNewPassword;
import o.getPayloadsFromContentProviderIntentAction;
import o.getPostalCode;
import o.isValidParameter;
import o.performMeasureDjhGOtQ;
import o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0;

/* JADX INFO: loaded from: classes3.dex */
public abstract class SearchShiftsNoZoneSelectedKt {
    private static int RemoteActionCompatParcelizer = 0;
    private static int write = 1;

    /* JADX WARN: Code duplicated, block: B:11:0x0038  */
    /* JADX WARN: Code duplicated, block: B:12:0x003d  */
    /* JADX WARN: Code duplicated, block: B:14:0x0043  */
    /* JADX WARN: Code duplicated, block: B:15:0x004e  */
    /* JADX WARN: Code duplicated, block: B:17:0x0051 A[PHI: r2
  0x0051: PHI (r2v9 o.getPostalCode) = (r2v5 o.getPostalCode), (r2v11 o.getPostalCode) binds: [B:8:0x0032, B:5:0x0023] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:9:0x0034 A[PHI: r2
  0x0034: PHI (r2v6 o.getPostalCode) = (r2v5 o.getPostalCode), (r2v11 o.getPostalCode) binds: [B:8:0x0032, B:5:0x0023] A[DONT_GENERATE, DONT_INLINE]] */
    public static final void SearchShiftsNoZoneSelected(getPayloadsFromContentProviderIntentAction getpayloadsfromcontentproviderintentaction, r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k0, Modifier modifier, getBirthDateFull getbirthdatefull, int i) {
        getPostalCode getpostalcode;
        boolean zIconCompatParcelizer;
        int i2;
        int i3;
        int i4;
        int i5 = 2 % 2;
        int i6 = write + 19;
        RemoteActionCompatParcelizer = i6 % Fields.SpotShadowColor;
        if (i6 % 2 != 0) {
            r8lambdardpfsr94j4iebcwx_kpqzpm8k0.getClass();
            getpostalcode = (getPostalCode) getbirthdatefull;
            getpostalcode.MediaSessionCompatQueueItem(-1011937069);
            if ((i & 121) == 0) {
                if ((i & 8) == 0) {
                    zIconCompatParcelizer = getpostalcode.read(getpayloadsfromcontentproviderintentaction);
                } else {
                    zIconCompatParcelizer = getpostalcode.IconCompatParcelizer(getpayloadsfromcontentproviderintentaction);
                }
                if (zIconCompatParcelizer) {
                    int i7 = write + 5;
                    RemoteActionCompatParcelizer = i7 % Fields.SpotShadowColor;
                    int i8 = i7 % 2;
                    i2 = 4;
                } else {
                    i2 = 2;
                }
                i3 = i2 | i;
            } else {
                i3 = i;
            }
        } else {
            r8lambdardpfsr94j4iebcwx_kpqzpm8k0.getClass();
            getpostalcode = (getPostalCode) getbirthdatefull;
            getpostalcode.MediaSessionCompatQueueItem(-1011937069);
            if ((i & 6) == 0) {
                if ((i & 8) == 0) {
                    zIconCompatParcelizer = getpostalcode.read(getpayloadsfromcontentproviderintentaction);
                } else {
                    zIconCompatParcelizer = getpostalcode.IconCompatParcelizer(getpayloadsfromcontentproviderintentaction);
                }
                if (zIconCompatParcelizer) {
                    int i9 = write + 5;
                    RemoteActionCompatParcelizer = i9 % Fields.SpotShadowColor;
                    int i10 = i9 % 2;
                    i2 = 4;
                } else {
                    i2 = 2;
                }
                i3 = i2 | i;
            } else {
                i3 = i;
            }
        }
        if ((i & 48) == 0) {
            i3 |= !getpostalcode.IconCompatParcelizer(r8lambdardpfsr94j4iebcwx_kpqzpm8k0) ? 16 : 32;
            int i11 = write + 109;
            RemoteActionCompatParcelizer = i11 % Fields.SpotShadowColor;
            int i12 = i11 % 2;
        }
        if ((i & 384) == 0) {
            if (getpostalcode.read(modifier)) {
                int i13 = write + 17;
                RemoteActionCompatParcelizer = i13 % Fields.SpotShadowColor;
                i4 = i13 % 2 != 0 ? 752 : Fields.RotationX;
            } else {
                i4 = Fields.SpotShadowColor;
            }
            i3 |= i4;
        }
        if (getpostalcode.write(i3 & 1, (i3 & 147) != 146)) {
            Modifier modifierRemoteActionCompatParcelizer = PaddingKt.RemoteActionCompatParcelizer(BackgroundKt.m20backgroundbw27NRU(SizeKt.write(modifier, 1.0f), ((buildMapping) getpostalcode.write((getNewPassword) performMeasureDjhGOtQ.RemoteActionCompatParcelizer)).IconCompatParcelizer(), RectangleShapeKt.getRectangleShape()), Dimensions.getAnimatedVisibility, Dimensions.setTabContainer);
            ModalBottomSheetYbuCTN8 modalBottomSheetYbuCTN8Serializer = ModalBottomSheetKtModalBottomSheet311.serializer(Arrangement.MediaDescriptionCompat, Alignment.Companion.getStart(), getpostalcode, 0);
            int iHashCode = Long.hashCode(getpostalcode.RatingCompat);
            DragAndDropNodestartDragAndDropTransfer1 dragAndDropNodestartDragAndDropTransfer1Serializer = getpostalcode.serializer();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(getpostalcode, modifierRemoteActionCompatParcelizer);
            ComposeUiNode.Companion companion = ComposeUiNode.Companion;
            r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 constructor = companion.getConstructor();
            if (getpostalcode.read != null) {
                int i14 = RemoteActionCompatParcelizer + 43;
                write = i14 % Fields.SpotShadowColor;
                int i15 = i14 % 2;
                getpostalcode.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg();
                if (getpostalcode.ComponentActivity) {
                    getpostalcode.serializer(constructor);
                } else {
                    getpostalcode.r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28();
                }
                c8$$ExternalSyntheticOutline0.m(companion, getpostalcode, modalBottomSheetYbuCTN8Serializer, getpostalcode, dragAndDropNodestartDragAndDropTransfer1Serializer);
                AndroidContentCaptureManagerCompanion.write(getpostalcode, modifierMaterializeModifier, m1$$ExternalSyntheticOutline0.m(companion, getpostalcode, Integer.valueOf(iHashCode), getpostalcode));
                TextWithIconKt.TextWithFlagIconEnd(0, getpostalcode, null, getpayloadsfromcontentproviderintentaction.write);
                isValidParameter.RemoteActionCompatParcelizer(getpayloadsfromcontentproviderintentaction.IconCompatParcelizer, r8lambdardpfsr94j4iebcwx_kpqzpm8k0, PaddingKt.m74paddingqDBjuR0$default(SizeKt.write(Modifier.Companion, 1.0f), 0.0f, Dimensions.setTransitioning, 0.0f, 0.0f, 13), false, false, null, null, null, null, getpostalcode, i3 & 112, 1016);
                getpostalcode.IconCompatParcelizer(true);
            } else {
                SentryUUID.write();
                throw null;
            }
        } else {
            getpostalcode.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
        }
        getHandleruiannotations gethandleruiannotationsMediaDescriptionCompat = getpostalcode.MediaDescriptionCompat();
        if (gethandleruiannotationsMediaDescriptionCompat != null) {
            gethandleruiannotationsMediaDescriptionCompat.serializer = new getInternalPaintui_graphics(i, 10, getpayloadsfromcontentproviderintentaction, r8lambdardpfsr94j4iebcwx_kpqzpm8k0, modifier);
        }
    }
}
