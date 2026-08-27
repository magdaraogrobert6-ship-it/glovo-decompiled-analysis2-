package com.roadrunner.home.bottomsheet.skeleton;

import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Fields;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.unit.Dp;
import bo.app.af$$ExternalSyntheticOutline1;
import bo.app.c8$$ExternalSyntheticOutline0;
import bo.app.m1$$ExternalSyntheticOutline0;
import coil3.ExtrasKt;
import com.roadrunner.designsystem.compose.theme.tokens.Dimensions;
import com.roadrunner.rrds.compose.component.indicators.skeleton.SkeletonViewKt;
import io.sentry.SentryUUID;
import o.AndroidContentCaptureManagerCompanion;
import o.DragAndDropNodestartDragAndDropTransfer1;
import o.ModalBottomSheetKtModalBottomSheet311;
import o.ModalBottomSheetYbuCTN8;
import o.getBirthDateFull;
import o.getHandleruiannotations;
import o.getLayers;
import o.getPostalCode;
import o.handleUrlOverridelambda1;
import o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0;

/* JADX INFO: loaded from: classes3.dex */
public abstract class BottomSheetHeaderSkeletonKt {
    private static int IconCompatParcelizer = 0;
    private static int write = 1;

    public static final void BottomSheetHeaderSkeleton(Modifier modifier, getBirthDateFull getbirthdatefull, int i) {
        boolean z;
        Modifier modifier2;
        int i2 = 2 % 2;
        getPostalCode getpostalcode = (getPostalCode) getbirthdatefull;
        getpostalcode.MediaSessionCompatQueueItem(-810334350);
        int i3 = i | 6;
        if ((i3 & 3) != 2) {
            int i4 = write;
            int i5 = i4 + 59;
            IconCompatParcelizer = i5 % Fields.SpotShadowColor;
            z = i5 % 2 == 0;
            int i6 = i4 + 109;
            IconCompatParcelizer = i6 % Fields.SpotShadowColor;
            if (i6 % 2 != 0) {
                int i7 = 3 % 5;
            }
        } else {
            z = false;
        }
        if (!(!getpostalcode.write(i3 & 1, z))) {
            int i8 = write + 47;
            IconCompatParcelizer = i8 % Fields.SpotShadowColor;
            int i9 = i8 % 2;
            Modifier.Companion companion = Modifier.Companion;
            Modifier modifierWrite = PaddingKt.write(companion, Dimensions.setTabContainer);
            ModalBottomSheetYbuCTN8 modalBottomSheetYbuCTN8Serializer = ModalBottomSheetKtModalBottomSheet311.serializer(Arrangement.MediaDescriptionCompat, Alignment.Companion.getStart(), getpostalcode, 0);
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
            SkeletonViewKt.IconCompatParcelizer(null, 0.0f, 0.0f, getpostalcode, 0, 15);
            ExtrasKt.read(913837329, handleUrlOverridelambda1.RemoteActionCompatParcelizer(), handleUrlOverridelambda1.RemoteActionCompatParcelizer(), -913837326, handleUrlOverridelambda1.RemoteActionCompatParcelizer(), handleUrlOverridelambda1.RemoteActionCompatParcelizer(), new Object[]{getpostalcode, SizeKt.m75height3ABfNKs(companion, Dimensions.getNestedScrollAxes)});
            SkeletonViewKt.IconCompatParcelizer(null, Dp.m3673constructorimpl(220.0f), 0.0f, getpostalcode, 48, 13);
            SkeletonViewKt.IconCompatParcelizer(af$$ExternalSyntheticOutline1.m(companion, Dimensions.setActionBarVisibilityCallback, getpostalcode, companion, 1.0f), 0.0f, Dp.m3673constructorimpl(60.0f), getpostalcode, 390, 10);
            getpostalcode.IconCompatParcelizer(true);
            modifier2 = companion;
        } else {
            getpostalcode.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
            modifier2 = modifier;
        }
        getHandleruiannotations gethandleruiannotationsMediaDescriptionCompat = getpostalcode.MediaDescriptionCompat();
        if (gethandleruiannotationsMediaDescriptionCompat != null) {
            gethandleruiannotationsMediaDescriptionCompat.serializer = new getLayers(modifier2, i, 18);
            int i10 = write + 115;
            IconCompatParcelizer = i10 % Fields.SpotShadowColor;
            int i11 = i10 % 2;
        }
    }
}
