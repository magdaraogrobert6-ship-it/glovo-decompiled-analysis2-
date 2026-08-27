package com.roadrunner.rider.state.futureshift.presentation.compose;

import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.material3.TextKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Fields;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.res.StringResources_androidKt;
import bo.app.m1$$ExternalSyntheticOutline0;
import coil3.ExtrasKt;
import com.logistics.rider.glovo.R;
import com.roadrunner.designsystem.compose.theme.tokens.Dimensions;
import com.roadrunner.rrds.compose.component.buttons.TertiaryKt;
import io.sentry.SentryUUID;
import o.AdjustInstance2;
import o.AndroidContentCaptureManagerCompanion;
import o.DragAndDropNodestartDragAndDropTransfer1;
import o.TextFieldDefaults;
import o.buildMapping;
import o.getBirthDateFull;
import o.getHandleruiannotations;
import o.getNewPassword;
import o.getPostalCode;
import o.handleUrlOverridelambda1;
import o.performLayout;
import o.performMeasureDjhGOtQ;
import o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0;
import o.r8lambdaZmWJ7_kmLiTuhtIga_c7SGMfvU;
import o.r8lambdafvzP3Wky1RLLzE56uVXaMHcvU;
import o.show;
import o.supportingTextPaddinga9UjIt4material3default;

/* JADX INFO: loaded from: classes3.dex */
public abstract class FutureShiftTitleRowKt {
    private static int read = 0;
    private static int write = 1;

    /* JADX WARN: Code duplicated, block: B:35:0x007e  */
    public static final void FutureShiftTitleRow(AdjustInstance2 adjustInstance2, r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k0, Modifier modifier, getBirthDateFull getbirthdatefull, int i) {
        int i2;
        boolean z;
        Modifier modifier2;
        Modifier.Companion companion;
        int i3;
        boolean zIconCompatParcelizer;
        int i4 = 2 % 2;
        r8lambdardpfsr94j4iebcwx_kpqzpm8k0.getClass();
        getPostalCode getpostalcode = (getPostalCode) getbirthdatefull;
        getpostalcode.MediaSessionCompatQueueItem(725671160);
        if ((i & 6) == 0) {
            int i5 = read + 95;
            int i6 = i5 % Fields.SpotShadowColor;
            write = i6;
            if (i5 % 2 != 0 ? (i & 8) != 0 : (i & 101) != 0) {
                zIconCompatParcelizer = getpostalcode.IconCompatParcelizer(adjustInstance2);
            } else {
                int i7 = i6 + 97;
                read = i7 % Fields.SpotShadowColor;
                int i8 = i7 % 2;
                zIconCompatParcelizer = getpostalcode.read(adjustInstance2);
            }
            i2 = i | (zIconCompatParcelizer ? 4 : 2);
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            if (getpostalcode.IconCompatParcelizer(r8lambdardpfsr94j4iebcwx_kpqzpm8k0)) {
                int i9 = write + 77;
                read = i9 % Fields.SpotShadowColor;
                i3 = i9 % 2 != 0 ? 79 : 32;
            } else {
                i3 = 16;
            }
            i2 |= i3;
        }
        int i10 = i2 | 384;
        if ((i10 & 147) != 146) {
            int i11 = write + 91;
            read = i11 % Fields.SpotShadowColor;
            if (i11 % 2 != 0) {
                z = false;
            } else {
                z = true;
            }
        } else {
            z = false;
        }
        if (getpostalcode.write(i10 & 1, z)) {
            int i12 = read + 101;
            write = i12 % Fields.SpotShadowColor;
            int i13 = i12 % 2;
            Modifier.Companion companion2 = Modifier.Companion;
            Modifier modifierWrite = SizeKt.write(companion2, 1.0f);
            supportingTextPaddinga9UjIt4material3default supportingtextpaddinga9ujit4material3defaultSerializer = TextFieldDefaults.serializer(Arrangement.MediaBrowserCompatMediaItem, Alignment.Companion.getCenterVertically(), getpostalcode, 48);
            int iHashCode = Long.hashCode(getpostalcode.RatingCompat);
            DragAndDropNodestartDragAndDropTransfer1 dragAndDropNodestartDragAndDropTransfer1Serializer = getpostalcode.serializer();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(getpostalcode, modifierWrite);
            ComposeUiNode.Companion companion3 = ComposeUiNode.Companion;
            r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 constructor = companion3.getConstructor();
            if (getpostalcode.read == null) {
                SentryUUID.write();
                throw null;
            }
            getpostalcode.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg();
            if (!getpostalcode.ComponentActivity) {
                getpostalcode.r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28();
            } else {
                int i14 = write + 83;
                read = i14 % Fields.SpotShadowColor;
                if (i14 % 2 != 0) {
                    getpostalcode.serializer(constructor);
                    throw null;
                }
                getpostalcode.serializer(constructor);
            }
            r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.read(companion3, getpostalcode, supportingtextpaddinga9ujit4material3defaultSerializer, getpostalcode, dragAndDropNodestartDragAndDropTransfer1Serializer);
            AndroidContentCaptureManagerCompanion.write(getpostalcode, modifierMaterializeModifier, m1$$ExternalSyntheticOutline0.m(companion3, getpostalcode, Integer.valueOf(iHashCode), getpostalcode));
            TextKt.m131TextNvy7gAk(adjustInstance2.write, companion2.then(new show(1.0f, true)), ((buildMapping) getpostalcode.write((getNewPassword) performMeasureDjhGOtQ.RemoteActionCompatParcelizer)).setHideOnContentScrollEnabled(), 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, performLayout.MediaDescriptionCompat(), getpostalcode, 0, 0, 131064);
            if (adjustInstance2.IconCompatParcelizer) {
                int i15 = write + 81;
                read = i15 % Fields.SpotShadowColor;
                int i16 = i15 % 2;
                getpostalcode.serializer(-2067308951);
                companion = companion2;
                ExtrasKt.read(913837329, handleUrlOverridelambda1.RemoteActionCompatParcelizer(), handleUrlOverridelambda1.RemoteActionCompatParcelizer(), -913837326, handleUrlOverridelambda1.RemoteActionCompatParcelizer(), handleUrlOverridelambda1.RemoteActionCompatParcelizer(), new Object[]{getpostalcode, SizeKt.m86width3ABfNKs(companion, Dimensions.getAnimatedVisibility)});
                TertiaryKt.IconCompatParcelizer(StringResources_androidKt.stringResource(R.string.view_all_button, getpostalcode, 0), r8lambdardpfsr94j4iebcwx_kpqzpm8k0, null, false, 0, null, null, null, getpostalcode, i10 & 112, 252);
                getpostalcode.IconCompatParcelizer(false);
            } else {
                companion = companion2;
                getpostalcode.serializer(-2067065818);
                getpostalcode.IconCompatParcelizer(false);
            }
            int i17 = read + 5;
            write = i17 % Fields.SpotShadowColor;
            int i18 = i17 % 2;
            getpostalcode.IconCompatParcelizer(true);
            modifier2 = companion;
        } else {
            getpostalcode.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
            modifier2 = modifier;
        }
        getHandleruiannotations gethandleruiannotationsMediaDescriptionCompat = getpostalcode.MediaDescriptionCompat();
        if (gethandleruiannotationsMediaDescriptionCompat != null) {
            gethandleruiannotationsMediaDescriptionCompat.serializer = new r8lambdaZmWJ7_kmLiTuhtIga_c7SGMfvU(i, 7, adjustInstance2, r8lambdardpfsr94j4iebcwx_kpqzpm8k0, modifier2);
        }
    }
}
