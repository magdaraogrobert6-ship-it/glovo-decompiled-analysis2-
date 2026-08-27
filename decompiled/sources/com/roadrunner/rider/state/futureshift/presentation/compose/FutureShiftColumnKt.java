package com.roadrunner.rider.state.futureshift.presentation.compose;

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
import androidx.compose.ui.res.StringResources_androidKt;
import bo.app.c8$$ExternalSyntheticOutline0;
import bo.app.m1$$ExternalSyntheticOutline0;
import com.logistics.rider.glovo.R;
import com.roadrunner.designsystem.compose.theme.tokens.Dimensions;
import com.roadrunner.rrds.compose.component.buttons.PrimaryKt;
import io.sentry.SentryUUID;
import o.AdjustInstance13;
import o.AndroidContentCaptureManagerCompanion;
import o.DragAndDropNodestartDragAndDropTransfer1;
import o.ModalBottomSheetKtModalBottomSheet311;
import o.ModalBottomSheetYbuCTN8;
import o.buildMapping;
import o.getBirthDateFull;
import o.getHandleruiannotations;
import o.getNewPassword;
import o.getPostalCode;
import o.performMeasureDjhGOtQ;
import o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0;
import o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM;
import o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0;
import o.r8lambdag2v_8ZFcgEbevxAiKW6LalaYkVg;

/* JADX INFO: loaded from: classes3.dex */
public abstract class FutureShiftColumnKt {
    private static int RemoteActionCompatParcelizer = 1;
    private static int read;

    /* JADX WARN: Code duplicated, block: B:11:0x0045  */
    /* JADX WARN: Code duplicated, block: B:12:0x004a  */
    /* JADX WARN: Code duplicated, block: B:14:0x0050  */
    /* JADX WARN: Code duplicated, block: B:15:0x0052  */
    /* JADX WARN: Code duplicated, block: B:17:0x0056 A[PHI: r1
  0x0056: PHI (r1v45 o.getPostalCode) = (r1v5 o.getPostalCode), (r1v47 o.getPostalCode) binds: [B:8:0x003f, B:5:0x002a] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:9:0x0041 A[PHI: r1
  0x0041: PHI (r1v6 o.getPostalCode) = (r1v5 o.getPostalCode), (r1v47 o.getPostalCode) binds: [B:8:0x003f, B:5:0x002a] A[DONT_GENERATE, DONT_INLINE]] */
    public static final void FutureShiftColumn(AdjustInstance13 adjustInstance13, r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k0, r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm, r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 r8lambdaa6_tctqmksh3fk6hjgcbkuvde0, Modifier modifier, getBirthDateFull getbirthdatefull, int i) {
        getPostalCode getpostalcode;
        boolean zIconCompatParcelizer;
        int i2;
        int i3;
        getPostalCode getpostalcode2;
        boolean z;
        getPostalCode getpostalcode3;
        Modifier modifier2;
        int i4 = 2 % 2;
        int i5 = read + 63;
        RemoteActionCompatParcelizer = i5 % Fields.SpotShadowColor;
        if (i5 % 2 == 0) {
            r8lambdardpfsr94j4iebcwx_kpqzpm8k0.getClass();
            r8lambdaunavo3sxub_pc9xroryotnrlvsm.getClass();
            r8lambdaa6_tctqmksh3fk6hjgcbkuvde0.getClass();
            getpostalcode = (getPostalCode) getbirthdatefull;
            getpostalcode.MediaSessionCompatQueueItem(775069626);
            if ((i & 52) == 0) {
                if ((i & 8) == 0) {
                    zIconCompatParcelizer = getpostalcode.read(adjustInstance13);
                } else {
                    zIconCompatParcelizer = getpostalcode.IconCompatParcelizer(adjustInstance13);
                }
                if (!zIconCompatParcelizer) {
                    i2 = 2;
                } else {
                    i2 = 4;
                }
                i3 = i2 | i;
                getpostalcode2 = getpostalcode;
            } else {
                getpostalcode2 = getpostalcode;
                i3 = i;
            }
        } else {
            r8lambdardpfsr94j4iebcwx_kpqzpm8k0.getClass();
            r8lambdaunavo3sxub_pc9xroryotnrlvsm.getClass();
            r8lambdaa6_tctqmksh3fk6hjgcbkuvde0.getClass();
            getpostalcode = (getPostalCode) getbirthdatefull;
            getpostalcode.MediaSessionCompatQueueItem(775069626);
            if ((i & 6) == 0) {
                if ((i & 8) == 0) {
                    zIconCompatParcelizer = getpostalcode.read(adjustInstance13);
                } else {
                    zIconCompatParcelizer = getpostalcode.IconCompatParcelizer(adjustInstance13);
                }
                if (!zIconCompatParcelizer) {
                    i2 = 2;
                } else {
                    i2 = 4;
                }
                i3 = i2 | i;
                getpostalcode2 = getpostalcode;
            } else {
                getpostalcode2 = getpostalcode;
                i3 = i;
            }
        }
        if ((i & 48) == 0) {
            i3 |= getpostalcode2.IconCompatParcelizer(r8lambdardpfsr94j4iebcwx_kpqzpm8k0) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            int i6 = read + 1;
            RemoteActionCompatParcelizer = i6 % Fields.SpotShadowColor;
            int i7 = i6 % 2;
            i3 |= getpostalcode2.IconCompatParcelizer(r8lambdaunavo3sxub_pc9xroryotnrlvsm) ? Fields.RotationX : Fields.SpotShadowColor;
        }
        if ((i & 3072) == 0) {
            int i8 = RemoteActionCompatParcelizer + 103;
            read = i8 % Fields.SpotShadowColor;
            if (i8 % 2 == 0) {
                i3 |= getpostalcode2.IconCompatParcelizer(r8lambdaa6_tctqmksh3fk6hjgcbkuvde0) ? Fields.CameraDistance : Fields.RotationZ;
            } else {
                getpostalcode2.IconCompatParcelizer(r8lambdaa6_tctqmksh3fk6hjgcbkuvde0);
                throw null;
            }
        }
        int i9 = i3 | 24576;
        if ((i9 & 9363) != 9362) {
            int i10 = RemoteActionCompatParcelizer + 29;
            read = i10 % Fields.SpotShadowColor;
            int i11 = i10 % 2;
            z = true;
        } else {
            z = false;
        }
        if (getpostalcode2.write(i9 & 1, z)) {
            Modifier.Companion companion = Modifier.Companion;
            Modifier modifierM20backgroundbw27NRU = BackgroundKt.m20backgroundbw27NRU(companion, ((buildMapping) getpostalcode2.write((getNewPassword) performMeasureDjhGOtQ.RemoteActionCompatParcelizer)).IconCompatParcelizer(), RectangleShapeKt.getRectangleShape());
            ModalBottomSheetYbuCTN8 modalBottomSheetYbuCTN8Serializer = ModalBottomSheetKtModalBottomSheet311.serializer(Arrangement.MediaDescriptionCompat, Alignment.Companion.getStart(), getpostalcode2, 0);
            int iHashCode = Long.hashCode(getpostalcode2.RatingCompat);
            DragAndDropNodestartDragAndDropTransfer1 dragAndDropNodestartDragAndDropTransfer1Serializer = getpostalcode2.serializer();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(getpostalcode2, modifierM20backgroundbw27NRU);
            ComposeUiNode.Companion companion2 = ComposeUiNode.Companion;
            r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 constructor = companion2.getConstructor();
            if (getpostalcode2.read != null) {
                getpostalcode2.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg();
                if (getpostalcode2.ComponentActivity) {
                    getpostalcode2.serializer(constructor);
                } else {
                    getpostalcode2.r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28();
                }
                c8$$ExternalSyntheticOutline0.m(companion2, getpostalcode2, modalBottomSheetYbuCTN8Serializer, getpostalcode2, dragAndDropNodestartDragAndDropTransfer1Serializer);
                AndroidContentCaptureManagerCompanion.write(getpostalcode2, modifierMaterializeModifier, m1$$ExternalSyntheticOutline0.m(companion2, getpostalcode2, Integer.valueOf(iHashCode), getpostalcode2));
                int i12 = i9 >> 3;
                FutureShiftInformationColumnKt.FutureShiftInformationColumn(adjustInstance13, r8lambdaunavo3sxub_pc9xroryotnrlvsm, r8lambdaa6_tctqmksh3fk6hjgcbkuvde0, null, getpostalcode2, (i12 & 896) | (i12 & 112) | (i9 & 14));
                if (adjustInstance13.MediaBrowserCompatMediaItem) {
                    getpostalcode2.serializer(144744718);
                    Modifier modifierM74paddingqDBjuR0$default = PaddingKt.m74paddingqDBjuR0$default(SizeKt.write(companion, 1.0f), 0.0f, Dimensions.setSplitBackground, 0.0f, 0.0f, 13);
                    modifierM74paddingqDBjuR0$default.getClass();
                    getpostalcode3 = getpostalcode2;
                    PrimaryKt.write(StringResources_androidKt.stringResource(R.string.status_shift_start_now, getpostalcode2, 0), r8lambdardpfsr94j4iebcwx_kpqzpm8k0, modifierM74paddingqDBjuR0$default, false, false, null, null, null, null, null, getpostalcode3, i9 & 112, 0, 2040);
                    getpostalcode3.IconCompatParcelizer(false);
                } else {
                    getpostalcode3 = getpostalcode2;
                    getpostalcode3.serializer(145096754);
                    getpostalcode3.IconCompatParcelizer(false);
                }
                getpostalcode3.IconCompatParcelizer(true);
                modifier2 = companion;
            } else {
                SentryUUID.write();
                throw null;
            }
        } else {
            getpostalcode3 = getpostalcode2;
            getpostalcode3.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
            modifier2 = modifier;
        }
        getHandleruiannotations gethandleruiannotationsMediaDescriptionCompat = getpostalcode3.MediaDescriptionCompat();
        if (gethandleruiannotationsMediaDescriptionCompat != null) {
            gethandleruiannotationsMediaDescriptionCompat.serializer = new r8lambdag2v_8ZFcgEbevxAiKW6LalaYkVg(adjustInstance13, r8lambdardpfsr94j4iebcwx_kpqzpm8k0, r8lambdaunavo3sxub_pc9xroryotnrlvsm, r8lambdaa6_tctqmksh3fk6hjgcbkuvde0, modifier2, i, 15);
        }
    }
}
