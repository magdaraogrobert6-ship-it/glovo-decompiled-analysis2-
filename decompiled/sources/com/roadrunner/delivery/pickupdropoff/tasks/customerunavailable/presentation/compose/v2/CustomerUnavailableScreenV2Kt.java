package com.roadrunner.delivery.pickupdropoff.tasks.customerunavailable.presentation.compose.v2;

import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.material3.TextKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Fields;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.sqlite.SQLite;
import bo.app.af$$ExternalSyntheticOutline0;
import bo.app.c8$$ExternalSyntheticOutline0;
import bo.app.d$$ExternalSyntheticOutline0;
import bo.app.m1$$ExternalSyntheticOutline0;
import coil3.ExtrasKt;
import com.roadrunner.delivery.pickupdropoff.tasks.customerunavailable.presentation.compose.CustomerUnavailableHeaderKt;
import com.roadrunner.delivery.pickupdropoff.tasks.model.customerunavailable.UtccComponentUiItem$Companion;
import com.roadrunner.designsystem.compose.theme.tokens.Dimensions;
import com.roadrunner.domain.usecase.SuspendingWorkUseCase$$ExternalSyntheticLambda0;
import io.sentry.SentryUUID;
import java.util.List;
import o.AndroidContentCaptureManagerCompanion;
import o.DragAndDropNodestartDragAndDropTransfer1;
import o.FlingCancellationException;
import o.IconCompatParcelizer;
import o.ModalBottomSheetKtModalBottomSheet311;
import o.ModalBottomSheetYbuCTN8;
import o.PagerWrapperFlingBehavior;
import o.UnsupportedComposeAnimation;
import o.accessibleField;
import o.bitOffsetToIndex;
import o.buildMapping;
import o.fixedJhjzzOo;
import o.fixedWidthOenEA2s;
import o.getAddressCountry;
import o.getBirthDateFull;
import o.getCreditCardExpirationMonth;
import o.getHandleruiannotations;
import o.getHasCamera;
import o.getNewPassword;
import o.getPostalCode;
import o.handleUrlOverridelambda1;
import o.performLayout;
import o.performMeasureDjhGOtQ;
import o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0;
import o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM;
import o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0;
import o.setStateParameters;

/* JADX INFO: loaded from: classes3.dex */
public abstract class CustomerUnavailableScreenV2Kt {
    private static int RemoteActionCompatParcelizer = 0;
    private static int serializer = 1;

    public static final void CustomerUnavailableScreenV2(accessibleField accessiblefield, r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k0, r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 r8lambdaa6_tctqmksh3fk6hjgcbkuvde0, Modifier modifier, getBirthDateFull getbirthdatefull, int i) {
        int i2;
        getPostalCode getpostalcode;
        Modifier modifier2;
        Modifier modifier3;
        int i3;
        boolean z;
        Modifier.Companion companion;
        float f;
        int i4;
        int i5;
        int i6 = 2 % 2;
        List list = accessiblefield.utccComponents;
        r8lambdardpfsr94j4iebcwx_kpqzpm8k0.getClass();
        r8lambdaa6_tctqmksh3fk6hjgcbkuvde0.getClass();
        getPostalCode getpostalcode2 = (getPostalCode) getbirthdatefull;
        getpostalcode2.MediaSessionCompatQueueItem(-1259376914);
        getAddressCountry getaddresscountry = getpostalcode2.read;
        if ((i & 6) == 0) {
            if ((i & 8) == 0 ? getpostalcode2.read(accessiblefield) : getpostalcode2.IconCompatParcelizer(accessiblefield)) {
                int i7 = serializer + 73;
                RemoteActionCompatParcelizer = i7 % Fields.SpotShadowColor;
                int i8 = i7 % 2;
                i5 = 4;
            } else {
                i5 = 2;
            }
            i2 = i5 | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            if (getpostalcode2.IconCompatParcelizer(r8lambdardpfsr94j4iebcwx_kpqzpm8k0)) {
                int i9 = serializer + 23;
                RemoteActionCompatParcelizer = i9 % Fields.SpotShadowColor;
                i4 = i9 % 2 != 0 ? 93 : 32;
            } else {
                i4 = 16;
            }
            i2 |= i4;
        }
        if ((i & 384) == 0) {
            i2 |= getpostalcode2.IconCompatParcelizer(r8lambdaa6_tctqmksh3fk6hjgcbkuvde0) ? Fields.RotationX : Fields.SpotShadowColor;
        }
        int i10 = i2 | 3072;
        if (getpostalcode2.write(i10 & 1, (i10 & 1171) != 1170)) {
            Modifier.Companion companion2 = Modifier.Companion;
            Modifier modifierThen = companion2.then(SizeKt.read);
            FlingCancellationException flingCancellationException = Arrangement.MediaDescriptionCompat;
            Alignment.Companion companion3 = Alignment.Companion;
            ModalBottomSheetYbuCTN8 modalBottomSheetYbuCTN8Serializer = ModalBottomSheetKtModalBottomSheet311.serializer(flingCancellationException, companion3.getStart(), getpostalcode2, 0);
            int iHashCode = Long.hashCode(getpostalcode2.RatingCompat);
            DragAndDropNodestartDragAndDropTransfer1 dragAndDropNodestartDragAndDropTransfer1Serializer = getpostalcode2.serializer();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(getpostalcode2, modifierThen);
            ComposeUiNode.Companion companion4 = ComposeUiNode.Companion;
            r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 constructor = companion4.getConstructor();
            if (getaddresscountry == null) {
                SentryUUID.write();
                throw null;
            }
            getpostalcode2.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg();
            if (getpostalcode2.ComponentActivity) {
                int i11 = RemoteActionCompatParcelizer + 21;
                serializer = i11 % Fields.SpotShadowColor;
                if (i11 % 2 == 0) {
                    getpostalcode2.serializer(constructor);
                    Object obj = null;
                    obj.hashCode();
                    throw null;
                }
                getpostalcode2.serializer(constructor);
                modifier3 = null;
            } else {
                modifier3 = null;
                getpostalcode2.r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28();
            }
            c8$$ExternalSyntheticOutline0.m(companion4, getpostalcode2, modalBottomSheetYbuCTN8Serializer, getpostalcode2, dragAndDropNodestartDragAndDropTransfer1Serializer);
            AndroidContentCaptureManagerCompanion.write(getpostalcode2, modifierMaterializeModifier, m1$$ExternalSyntheticOutline0.m(companion4, getpostalcode2, Integer.valueOf(iHashCode), getpostalcode2));
            CustomerUnavailableHeaderKt.CustomerUnavailableHeader(i10 & 112, getpostalcode2, modifier3, accessiblefield.title, r8lambdardpfsr94j4iebcwx_kpqzpm8k0);
            Modifier modifierIconCompatParcelizer = PagerWrapperFlingBehavior.IconCompatParcelizer(companion2, PagerWrapperFlingBehavior.read(0, getpostalcode2, 1), false, 14);
            float f2 = Dimensions.setTabContainer;
            Modifier modifierWrite = PaddingKt.write(modifierIconCompatParcelizer, f2);
            ModalBottomSheetYbuCTN8 modalBottomSheetYbuCTN8Serializer2 = ModalBottomSheetKtModalBottomSheet311.serializer(flingCancellationException, companion3.getStart(), getpostalcode2, 0);
            int iHashCode2 = Long.hashCode(getpostalcode2.RatingCompat);
            DragAndDropNodestartDragAndDropTransfer1 dragAndDropNodestartDragAndDropTransfer1Serializer2 = getpostalcode2.serializer();
            Modifier modifierMaterializeModifier2 = ComposedModifierKt.materializeModifier(getpostalcode2, modifierWrite);
            r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 constructor2 = companion4.getConstructor();
            getpostalcode2.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg();
            if (getpostalcode2.ComponentActivity) {
                int i12 = serializer + 115;
                RemoteActionCompatParcelizer = i12 % Fields.SpotShadowColor;
                int i13 = i12 % 2;
                getpostalcode2.serializer(constructor2);
                int i14 = RemoteActionCompatParcelizer + 11;
                serializer = i14 % Fields.SpotShadowColor;
                int i15 = i14 % 2;
            } else {
                getpostalcode2.r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28();
            }
            c8$$ExternalSyntheticOutline0.m(companion4, getpostalcode2, modalBottomSheetYbuCTN8Serializer2, getpostalcode2, dragAndDropNodestartDragAndDropTransfer1Serializer2);
            AndroidContentCaptureManagerCompanion.write(getpostalcode2, modifierMaterializeModifier2, m1$$ExternalSyntheticOutline0.m(companion4, getpostalcode2, Integer.valueOf(iHashCode2), getpostalcode2));
            int i16 = i10;
            TextKt.m131TextNvy7gAk(accessiblefield.description, null, ((buildMapping) getpostalcode2.write((getNewPassword) performMeasureDjhGOtQ.RemoteActionCompatParcelizer)).setPresenter(), 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, performLayout.IconCompatParcelizer(), getpostalcode2, 0, 0, 131066);
            getpostalcode = getpostalcode2;
            ExtrasKt.read(913837329, handleUrlOverridelambda1.RemoteActionCompatParcelizer(), handleUrlOverridelambda1.RemoteActionCompatParcelizer(), -913837326, handleUrlOverridelambda1.RemoteActionCompatParcelizer(), handleUrlOverridelambda1.RemoteActionCompatParcelizer(), new Object[]{getpostalcode, SizeKt.m75height3ABfNKs(companion2, f2)});
            getpostalcode.serializer(-1745865138);
            int i17 = 0;
            for (Object obj2 : list) {
                int i18 = i17 + 1;
                if (i17 < 0) {
                    SQLite.serializer();
                    throw null;
                }
                fixedWidthOenEA2s fixedwidthoenea2s = (fixedWidthOenEA2s) obj2;
                if (i17 > 0) {
                    int i19 = serializer + 5;
                    RemoteActionCompatParcelizer = i19 % Fields.SpotShadowColor;
                    if (i19 % 2 != 0) {
                        getpostalcode.serializer(-2015618374);
                        companion = Modifier.Companion;
                        f = Dimensions.setTabContainer;
                        z = false;
                    } else {
                        z = false;
                        getpostalcode.serializer(-2015618374);
                        companion = Modifier.Companion;
                        f = Dimensions.setTabContainer;
                    }
                    IconCompatParcelizer.IconCompatParcelizer(companion, f, getpostalcode, z);
                } else {
                    getpostalcode.serializer(1940399430);
                    getpostalcode.IconCompatParcelizer(false);
                }
                boolean z2 = i17 == SQLite.write(list);
                if (fixedwidthoenea2s instanceof fixedJhjzzOo) {
                    getpostalcode.serializer(-2015610765);
                    fixedJhjzzOo fixedjhjzzoo = (fixedJhjzzOo) fixedwidthoenea2s;
                    i3 = i16;
                    boolean z3 = (i3 & 896) == 256;
                    boolean zIconCompatParcelizer = getpostalcode.IconCompatParcelizer(fixedwidthoenea2s);
                    Object objComponentActivity = getpostalcode.ComponentActivity();
                    if (!(!(zIconCompatParcelizer | z3)) || objComponentActivity == getCreditCardExpirationMonth.write) {
                        objComponentActivity = new SuspendingWorkUseCase$$ExternalSyntheticLambda0(r8lambdaa6_tctqmksh3fk6hjgcbkuvde0, 6, fixedjhjzzoo);
                        getpostalcode.write(objComponentActivity);
                    }
                    UtccComponentUiItem$Companion utccComponentUiItem$Companion = fixedWidthOenEA2s.Companion;
                    UnsupportedComposeAnimation.write(fixedjhjzzoo, (r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) objComponentActivity, null, Integer.valueOf(i18), z2, getpostalcode, 0);
                    getpostalcode.IconCompatParcelizer(false);
                } else {
                    i3 = i16;
                    if (!(fixedwidthoenea2s instanceof bitOffsetToIndex)) {
                        throw d$$ExternalSyntheticOutline0.m(getpostalcode, -2015613047, false);
                    }
                    int i20 = serializer + 89;
                    RemoteActionCompatParcelizer = i20 % Fields.SpotShadowColor;
                    int i21 = i20 % 2;
                    getpostalcode.serializer(-2015599921);
                    UtccComponentUiItem$Companion utccComponentUiItem$Companion2 = fixedWidthOenEA2s.Companion;
                    setStateParameters.IconCompatParcelizer((bitOffsetToIndex) fixedwidthoenea2s, null, Integer.valueOf(i18), z2, getpostalcode, 0);
                    getpostalcode.IconCompatParcelizer(false);
                }
                i17 = i18;
                i16 = i3;
            }
            af$$ExternalSyntheticOutline0.m(getpostalcode, false, true, true);
            modifier2 = companion2;
        } else {
            getpostalcode = getpostalcode2;
            getpostalcode.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
            modifier2 = modifier;
        }
        getHandleruiannotations gethandleruiannotationsMediaDescriptionCompat = getpostalcode.MediaDescriptionCompat();
        if (gethandleruiannotationsMediaDescriptionCompat != null) {
            gethandleruiannotationsMediaDescriptionCompat.serializer = new getHasCamera((Object) accessiblefield, (Object) r8lambdardpfsr94j4iebcwx_kpqzpm8k0, (Object) r8lambdaa6_tctqmksh3fk6hjgcbkuvde0, modifier2, i, 25);
        }
    }
}
