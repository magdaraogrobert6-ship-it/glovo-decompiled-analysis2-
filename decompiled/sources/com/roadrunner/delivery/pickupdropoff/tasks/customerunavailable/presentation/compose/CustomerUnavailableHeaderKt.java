package com.roadrunner.delivery.pickupdropoff.tasks.customerunavailable.presentation.compose;

import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.material3.SurfaceKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Fields;
import androidx.compose.ui.node.ComposeUiNode;
import bo.app.c8$$ExternalSyntheticOutline0;
import bo.app.m1$$ExternalSyntheticOutline0;
import coil3.ExtrasKt;
import com.roadrunner.designsystem.compose.theme.tokens.Dimensions;
import com.roadrunner.rrds.compose.component.layouts.DividerKt;
import com.roadrunner.rrds.compose.component.navigations.HeaderKt;
import io.sentry.SentryUUID;
import o.AndroidContentCaptureManagerCompanion;
import o.DefaultLazyKey;
import o.DragAndDropNodestartDragAndDropTransfer1;
import o.ModalBottomSheetKtModalBottomSheet311;
import o.ModalBottomSheetYbuCTN8;
import o.buildMapping;
import o.computeHorizontalScrollExtent;
import o.getBirthDateFull;
import o.getHandleruiannotations;
import o.getLayers;
import o.getNewPassword;
import o.getOverride;
import o.getPostalCode;
import o.get_windowPosturem18o9QQ;
import o.performMeasureDjhGOtQ;
import o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0;
import o.setImeVisible;

/* JADX INFO: loaded from: classes3.dex */
public abstract class CustomerUnavailableHeaderKt {
    private static int read = 0;
    private static int write = 1;

    /* JADX WARN: Code duplicated, block: B:10:0x0031 A[PHI: r2 r4
  0x0031: PHI (r2v10 o.getPostalCode) = (r2v5 o.getPostalCode), (r2v12 o.getPostalCode) binds: [B:8:0x002d, B:5:0x001f] A[DONT_GENERATE, DONT_INLINE]
  0x0031: PHI (r4v12 int) = (r4v1 int), (r4v13 int) binds: [B:8:0x002d, B:5:0x001f] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:9:0x002f A[PHI: r2 r4
  0x002f: PHI (r2v6 o.getPostalCode) = (r2v5 o.getPostalCode), (r2v12 o.getPostalCode) binds: [B:8:0x002d, B:5:0x001f] A[DONT_GENERATE, DONT_INLINE]
  0x002f: PHI (r4v2 int) = (r4v1 int), (r4v13 int) binds: [B:8:0x002d, B:5:0x001f] A[DONT_GENERATE, DONT_INLINE]] */
    public static final void DragHandle(Modifier modifier, getBirthDateFull getbirthdatefull, int i) {
        getPostalCode getpostalcode;
        int i2;
        boolean z;
        Modifier modifier2;
        int i3 = 2 % 2;
        int i4 = write + 15;
        read = i4 % Fields.SpotShadowColor;
        if (i4 % 2 != 0) {
            getpostalcode = (getPostalCode) getbirthdatefull;
            getpostalcode.MediaSessionCompatQueueItem(350226527);
            i2 = i | 10;
            if ((i2 & 3) != 2) {
                z = true;
            } else {
                z = false;
            }
        } else {
            getpostalcode = (getPostalCode) getbirthdatefull;
            getpostalcode.MediaSessionCompatQueueItem(350226527);
            i2 = i | 6;
            if ((i2 & 3) != 2) {
                z = true;
            } else {
                z = false;
            }
        }
        if (getpostalcode.write(1 & i2, z)) {
            modifier2 = Modifier.Companion;
            SurfaceKt.m126SurfaceT9BRK9s(PaddingKt.m74paddingqDBjuR0$default(SizeKt.IconCompatParcelizer(modifier2, null, 3), 0.0f, Dimensions.setSplitBackground, 0.0f, 0.0f, 13), ((get_windowPosturem18o9QQ) getpostalcode.write((getNewPassword) setImeVisible.IconCompatParcelizer)).RemoteActionCompatParcelizer, ((buildMapping) getpostalcode.write((getNewPassword) performMeasureDjhGOtQ.RemoteActionCompatParcelizer)).setOnMenuItemClickListener(), 0L, 0.0f, 0.0f, null, getOverride.IconCompatParcelizer, getpostalcode, 12582912, 120);
        } else {
            getpostalcode.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
            modifier2 = modifier;
        }
        getHandleruiannotations gethandleruiannotationsMediaDescriptionCompat = getpostalcode.MediaDescriptionCompat();
        if (gethandleruiannotationsMediaDescriptionCompat != null) {
            gethandleruiannotationsMediaDescriptionCompat.serializer = new getLayers(modifier2, i, 13);
            int i5 = write + 35;
            read = i5 % Fields.SpotShadowColor;
            int i6 = i5 % 2;
        }
    }

    public static final void CustomerUnavailableHeader(int i, getBirthDateFull getbirthdatefull, Modifier modifier, String str, r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k0) {
        int i2;
        boolean z;
        Modifier modifier2;
        int i3;
        int i4;
        int i5 = 2 % 2;
        str.getClass();
        r8lambdardpfsr94j4iebcwx_kpqzpm8k0.getClass();
        getPostalCode getpostalcode = (getPostalCode) getbirthdatefull;
        getpostalcode.MediaSessionCompatQueueItem(-1143553703);
        if ((i & 6) == 0) {
            if (getpostalcode.read(str)) {
                int i6 = write + 55;
                read = i6 % Fields.SpotShadowColor;
                int i7 = i6 % 2;
                i4 = 4;
            } else {
                i4 = 2;
            }
            i2 = i | i4;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            if (getpostalcode.IconCompatParcelizer(r8lambdardpfsr94j4iebcwx_kpqzpm8k0)) {
                int i8 = read + 89;
                write = i8 % Fields.SpotShadowColor;
                int i9 = i8 % 2;
                i3 = 32;
            } else {
                i3 = 16;
            }
            i2 |= i3;
        }
        int i10 = i2 | 384;
        if ((i10 & 147) != 146) {
            int i11 = read + 107;
            write = i11 % Fields.SpotShadowColor;
            int i12 = i11 % 2;
            z = true;
        } else {
            z = false;
        }
        if (getpostalcode.write(i10 & 1, z)) {
            Modifier.Companion companion = Modifier.Companion;
            Modifier modifierWrite = SizeKt.write(companion, 1.0f);
            ModalBottomSheetYbuCTN8 modalBottomSheetYbuCTN8Serializer = ModalBottomSheetKtModalBottomSheet311.serializer(Arrangement.MediaDescriptionCompat, Alignment.Companion.getCenterHorizontally(), getpostalcode, 48);
            int iHashCode = Long.hashCode(getpostalcode.RatingCompat);
            DragAndDropNodestartDragAndDropTransfer1 dragAndDropNodestartDragAndDropTransfer1Serializer = getpostalcode.serializer();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(getpostalcode, modifierWrite);
            ComposeUiNode.Companion companion2 = ComposeUiNode.Companion;
            r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 constructor = companion2.getConstructor();
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
            c8$$ExternalSyntheticOutline0.m(companion2, getpostalcode, modalBottomSheetYbuCTN8Serializer, getpostalcode, dragAndDropNodestartDragAndDropTransfer1Serializer);
            AndroidContentCaptureManagerCompanion.write(getpostalcode, modifierMaterializeModifier, m1$$ExternalSyntheticOutline0.m(companion2, getpostalcode, Integer.valueOf(iHashCode), getpostalcode));
            DragHandle(null, getpostalcode, 0);
            HeaderKt.m5063HeaderbbrV0mI(null, str, null, 0L, 0.0f, null, ExtrasKt.write(-564357097, new DefaultLazyKey(8, r8lambdardpfsr94j4iebcwx_kpqzpm8k0), getpostalcode), ((get_windowPosturem18o9QQ) getpostalcode.write((getNewPassword) setImeVisible.IconCompatParcelizer)).MediaSessionCompatQueueItem, null, getpostalcode, ((i10 << 3) & 112) | 1572864, 317);
            DividerKt.read(0.0f, 0, 7, 0L, getpostalcode, null);
            getpostalcode.IconCompatParcelizer(true);
            modifier2 = companion;
        } else {
            getpostalcode.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
            int i13 = write + 89;
            read = i13 % Fields.SpotShadowColor;
            int i14 = i13 % 2;
            modifier2 = modifier;
        }
        getHandleruiannotations gethandleruiannotationsMediaDescriptionCompat = getpostalcode.MediaDescriptionCompat();
        if (gethandleruiannotationsMediaDescriptionCompat != null) {
            gethandleruiannotationsMediaDescriptionCompat.serializer = new computeHorizontalScrollExtent(str, r8lambdardpfsr94j4iebcwx_kpqzpm8k0, modifier2, i, 13);
        }
    }
}
