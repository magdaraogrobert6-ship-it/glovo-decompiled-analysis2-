package com.roadrunner.delivery.accept.individualEarnings.presentation.composable;

import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Fields;
import androidx.compose.ui.node.ComposeUiNode;
import bo.app.c8$$ExternalSyntheticOutline0;
import bo.app.m1$$ExternalSyntheticOutline0;
import com.roadrunner.designsystem.compose.theme.tokens.Dimensions;
import com.roadrunner.rrds.compose.component.navigations.TabsKt;
import io.sentry.SentryUUID;
import o.AndroidContentCaptureManagerCompanion;
import o.DragAndDropNodestartDragAndDropTransfer1;
import o.FlingCancellationException;
import o.ModalBottomSheetKtModalBottomSheet311;
import o.ModalBottomSheetYbuCTN8;
import o.SwitchDefaults;
import o.accessgetReusableRectp;
import o.accessgetStaticLayoutConstructorcp;
import o.accesssetStaticLayoutConstructorcp;
import o.getBirthDateFull;
import o.getHandleruiannotations;
import o.getPostalCode;
import o.r8lambda9QlT_ra9FwUEV5vl9YtC6BGxtDk;
import o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0;
import o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM;

/* JADX INFO: loaded from: classes3.dex */
public abstract class IndividualEarningsContentKt {
    private static int read = 0;
    private static int serializer = 1;

    public static final void IndividualEarningsContent(accessgetStaticLayoutConstructorcp accessgetstaticlayoutconstructorcp, r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm, Modifier modifier, getBirthDateFull getbirthdatefull, int i) {
        int i2;
        boolean z;
        boolean zIconCompatParcelizer;
        int i3 = 2 % 2;
        int i4 = serializer + 19;
        read = i4 % Fields.SpotShadowColor;
        int i5 = i4 % 2;
        accessgetstaticlayoutconstructorcp.getClass();
        r8lambdaunavo3sxub_pc9xroryotnrlvsm.getClass();
        getPostalCode getpostalcode = (getPostalCode) getbirthdatefull;
        getpostalcode.MediaSessionCompatQueueItem(-92410421);
        if ((i & 6) == 0) {
            int i6 = serializer + 21;
            read = i6 % Fields.SpotShadowColor;
            if (i6 % 2 == 0 ? (i & 8) != 0 : (i & 117) != 0) {
                zIconCompatParcelizer = getpostalcode.IconCompatParcelizer(accessgetstaticlayoutconstructorcp);
            } else {
                zIconCompatParcelizer = getpostalcode.read(accessgetstaticlayoutconstructorcp);
                int i7 = read + 17;
                serializer = i7 % Fields.SpotShadowColor;
                int i8 = i7 % 2;
            }
            i2 = (zIconCompatParcelizer ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        Object obj = null;
        if ((i & 48) == 0) {
            int i9 = read + 71;
            serializer = i9 % Fields.SpotShadowColor;
            if (i9 % 2 == 0) {
                getpostalcode.IconCompatParcelizer(r8lambdaunavo3sxub_pc9xroryotnrlvsm);
                obj.hashCode();
                throw null;
            }
            i2 |= !(getpostalcode.IconCompatParcelizer(r8lambdaunavo3sxub_pc9xroryotnrlvsm) ^ true) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            int i10 = read + 97;
            serializer = i10 % Fields.SpotShadowColor;
            if (i10 % 2 == 0) {
                getpostalcode.read(modifier);
                throw null;
            }
            i2 |= getpostalcode.read(modifier) ? Fields.RotationX : Fields.SpotShadowColor;
        }
        if ((i2 & 147) != 146) {
            int i11 = read + 53;
            serializer = i11 % Fields.SpotShadowColor;
            int i12 = i11 % 2;
            z = true;
        } else {
            z = false;
        }
        if (getpostalcode.write(i2 & 1, z)) {
            int i13 = read + 85;
            serializer = i13 % Fields.SpotShadowColor;
            int i14 = i13 % 2;
            FlingCancellationException flingCancellationException = Arrangement.MediaDescriptionCompat;
            Alignment.Companion companion = Alignment.Companion;
            ModalBottomSheetYbuCTN8 modalBottomSheetYbuCTN8Serializer = ModalBottomSheetKtModalBottomSheet311.serializer(flingCancellationException, companion.getStart(), getpostalcode, 0);
            int iHashCode = Long.hashCode(getpostalcode.RatingCompat);
            DragAndDropNodestartDragAndDropTransfer1 dragAndDropNodestartDragAndDropTransfer1Serializer = getpostalcode.serializer();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(getpostalcode, modifier);
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
            r8lambda9QlT_ra9FwUEV5vl9YtC6BGxtDk r8lambda9qlt_ra9fwuev5vl9ytc6bgxtdk = accessgetstaticlayoutconstructorcp.write;
            int i15 = accessgetstaticlayoutconstructorcp.serializer;
            Alignment.Horizontal centerHorizontally = companion.getCenterHorizontally();
            SwitchDefaults switchDefaultsM71PaddingValuesYgX7TsA$default = PaddingKt.m71PaddingValuesYgX7TsA$default(Dimensions.setMenu, 0.0f, 2);
            Modifier.Companion companion3 = Modifier.Companion;
            Modifier modifierWrite = SizeKt.write(companion3, 1.0f);
            float f = Dimensions.setActionBarVisibilityCallback;
            TabsKt.ScrollableTabRow(r8lambda9qlt_ra9fwuev5vl9ytc6bgxtdk, i15, r8lambdaunavo3sxub_pc9xroryotnrlvsm, PaddingKt.m74paddingqDBjuR0$default(modifierWrite, 0.0f, f, 0.0f, Dimensions.getNestedScrollAxes, 5), switchDefaultsM71PaddingValuesYgX7TsA$default, centerHorizontally, getpostalcode, ((i2 << 3) & 896) | 196608);
            accesssetStaticLayoutConstructorcp accesssetstaticlayoutconstructorcp = accessgetstaticlayoutconstructorcp.RemoteActionCompatParcelizer;
            if (accesssetstaticlayoutconstructorcp == null) {
                getpostalcode.serializer(1515646487);
                getpostalcode.IconCompatParcelizer(false);
            } else {
                getpostalcode.serializer(1515646488);
                SingleEarningsContentKt.serializer(accesssetstaticlayoutconstructorcp, companion3, new SwitchDefaults(f, Dimensions.getActionBarHideOffset, f, f), getpostalcode, 56, 0);
                getpostalcode.IconCompatParcelizer(false);
            }
            getpostalcode.IconCompatParcelizer(true);
        } else {
            getpostalcode.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
        }
        getHandleruiannotations gethandleruiannotationsMediaDescriptionCompat = getpostalcode.MediaDescriptionCompat();
        if (gethandleruiannotationsMediaDescriptionCompat != null) {
            gethandleruiannotationsMediaDescriptionCompat.serializer = new accessgetReusableRectp(i, 22, modifier, (Object) accessgetstaticlayoutconstructorcp, (Object) r8lambdaunavo3sxub_pc9xroryotnrlvsm);
            int i16 = read + 57;
            serializer = i16 % Fields.SpotShadowColor;
            int i17 = i16 % 2;
        }
    }
}
