package com.roadrunner.delivery.accept.laststop.presentation.lastStopBottomSheet.compose;

import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.material3.SurfaceKt;
import androidx.compose.runtime.GapComposerKt$$ExternalSyntheticLambda0;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Fields;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.unit.Dp;
import bo.app.c8$$ExternalSyntheticOutline0;
import bo.app.d$$ExternalSyntheticOutline0;
import bo.app.m1$$ExternalSyntheticOutline0;
import coil3.ExtrasKt;
import com.roadrunner.designsystem.compose.theme.tokens.Dimensions;
import com.roadrunner.rrds.compose.component.indicators.skeleton.SkeletonViewKt;
import io.sentry.SentryUUID;
import o.AndroidAutofillManager;
import o.AndroidContentCaptureManagerCompanion;
import o.DragAndDropNodestartDragAndDropTransfer1;
import o.FlingCancellationException;
import o.IconCompatParcelizer;
import o.ModalBottomSheetKtModalBottomSheet311;
import o.ModalBottomSheetYbuCTN8;
import o.SingleThreadFutureScheduler2;
import o.TextFieldDefaults;
import o.accessgetReusableRectp;
import o.buildMapping;
import o.getAddressCountry;
import o.getBirthDateFull;
import o.getHandleruiannotations;
import o.getNewPassword;
import o.getPostalCode;
import o.handleUrlOverridelambda1;
import o.performMeasureDjhGOtQ;
import o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0;
import o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM;
import o.r8lambdafvzP3Wky1RLLzE56uVXaMHcvU;
import o.saveLayerAlpha;
import o.setMatrix;
import o.supportingTextPaddinga9UjIt4material3default;
import o.withCanvas;

/* JADX INFO: loaded from: classes3.dex */
public abstract class LastStopSelectionLocationContentKt {
    private static int RemoteActionCompatParcelizer = 0;
    private static int read = 1;

    public static final void read(setMatrix setmatrix, r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm, Modifier modifier, getBirthDateFull getbirthdatefull, int i) {
        int i2;
        boolean z;
        int i3;
        int i4;
        int i5;
        int i6 = 2 % 2;
        getPostalCode getpostalcode = (getPostalCode) getbirthdatefull;
        getpostalcode.MediaSessionCompatQueueItem(2013714212);
        if ((i & 6) == 0) {
            if (getpostalcode.read(setmatrix)) {
                int i7 = RemoteActionCompatParcelizer + 61;
                read = i7 % Fields.SpotShadowColor;
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
            int i9 = RemoteActionCompatParcelizer + 85;
            read = i9 % Fields.SpotShadowColor;
            if (i9 % 2 == 0) {
                getpostalcode.IconCompatParcelizer(r8lambdaunavo3sxub_pc9xroryotnrlvsm);
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            if (!getpostalcode.IconCompatParcelizer(r8lambdaunavo3sxub_pc9xroryotnrlvsm)) {
                i4 = 16;
            } else {
                int i10 = read + 77;
                RemoteActionCompatParcelizer = i10 % Fields.SpotShadowColor;
                i4 = i10 % 2 != 0 ? 28 : 32;
            }
            i2 |= i4;
        }
        if ((i & 384) == 0) {
            int i11 = RemoteActionCompatParcelizer + 3;
            read = i11 % Fields.SpotShadowColor;
            int i12 = i11 % 2;
            if (getpostalcode.read(modifier)) {
                int i13 = read + 19;
                RemoteActionCompatParcelizer = i13 % Fields.SpotShadowColor;
                int i14 = i13 % 2;
                i3 = Fields.RotationX;
            } else {
                i3 = Fields.SpotShadowColor;
            }
            i2 |= i3;
        }
        if ((i2 & 147) != 146) {
            int i15 = read + 7;
            RemoteActionCompatParcelizer = i15 % Fields.SpotShadowColor;
            int i16 = i15 % 2;
            z = true;
        } else {
            z = false;
        }
        if (getpostalcode.write(i2 & 1, z)) {
            SurfaceKt.m126SurfaceT9BRK9s(PaddingKt.m73paddingVpY3zN4$default(modifier, Dimensions.setStackedBackground, 0.0f, 2), RoundedCornerShapeKt.IconCompatParcelizer(Dimensions.setPadding), ((buildMapping) getpostalcode.write((getNewPassword) performMeasureDjhGOtQ.RemoteActionCompatParcelizer)).serializer(), 0L, 0.0f, 0.0f, null, ExtrasKt.write(96804969, new GapComposerKt$$ExternalSyntheticLambda0(setmatrix, 17, r8lambdaunavo3sxub_pc9xroryotnrlvsm), getpostalcode), getpostalcode, 12582912, 120);
        } else {
            getpostalcode.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
        }
        getHandleruiannotations gethandleruiannotationsMediaDescriptionCompat = getpostalcode.MediaDescriptionCompat();
        if (gethandleruiannotationsMediaDescriptionCompat != null) {
            gethandleruiannotationsMediaDescriptionCompat.serializer = new accessgetReusableRectp(i, 25, modifier, (Object) setmatrix, (Object) r8lambdaunavo3sxub_pc9xroryotnrlvsm);
        }
    }

    public static final void LastStopSelectionLocationContent(saveLayerAlpha savelayeralpha, int i, r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm, Modifier modifier, getBirthDateFull getbirthdatefull, int i2) {
        int i3;
        boolean z;
        Modifier modifier2;
        int i4 = 2 % 2;
        r8lambdaunavo3sxub_pc9xroryotnrlvsm.getClass();
        getPostalCode getpostalcode = (getPostalCode) getbirthdatefull;
        getpostalcode.MediaSessionCompatQueueItem(924445724);
        if ((i2 & 6) == 0) {
            i3 = (!getpostalcode.read(savelayeralpha) ? 2 : 4) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= getpostalcode.read(i) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= getpostalcode.IconCompatParcelizer(r8lambdaunavo3sxub_pc9xroryotnrlvsm) ? Fields.RotationX : Fields.SpotShadowColor;
        }
        int i5 = i3 | 3072;
        if ((i5 & 1171) != 1170) {
            int i6 = RemoteActionCompatParcelizer + 35;
            read = i6 % Fields.SpotShadowColor;
            int i7 = i6 % 2;
            z = true;
        } else {
            int i8 = RemoteActionCompatParcelizer + 3;
            read = i8 % Fields.SpotShadowColor;
            int i9 = i8 % 2;
            z = false;
        }
        if (getpostalcode.write(i5 & 1, z)) {
            int i10 = RemoteActionCompatParcelizer + 93;
            read = i10 % Fields.SpotShadowColor;
            int i11 = i10 % 2;
            Modifier.Companion companion = Modifier.Companion;
            if (!(true ^ savelayeralpha.equals(withCanvas.IconCompatParcelizer))) {
                getpostalcode.serializer(832571052);
                LastStopBottomSheetLoadingContent(companion, getpostalcode, i, ((i5 >> 3) & 14) | ((i5 >> 6) & 112));
                getpostalcode.IconCompatParcelizer(false);
            } else {
                if (!(savelayeralpha instanceof setMatrix)) {
                    throw d$$ExternalSyntheticOutline0.m(getpostalcode, -665882070, false);
                }
                getpostalcode.serializer(832758323);
                int i12 = i5 >> 3;
                read((setMatrix) savelayeralpha, r8lambdaunavo3sxub_pc9xroryotnrlvsm, companion, getpostalcode, (i5 & 14) | (i12 & 112) | (i12 & 896));
                getpostalcode.IconCompatParcelizer(false);
            }
            modifier2 = companion;
        } else {
            getpostalcode.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
            modifier2 = modifier;
        }
        getHandleruiannotations gethandleruiannotationsMediaDescriptionCompat = getpostalcode.MediaDescriptionCompat();
        if (gethandleruiannotationsMediaDescriptionCompat != null) {
            gethandleruiannotationsMediaDescriptionCompat.serializer = new AndroidAutofillManager(savelayeralpha, i, r8lambdaunavo3sxub_pc9xroryotnrlvsm, modifier2, i2);
        }
    }

    public static final void LastStopBottomSheetLoadingContent(Modifier modifier, getBirthDateFull getbirthdatefull, int i, int i2) {
        int i3;
        boolean z;
        int i4;
        int i5 = 2 % 2;
        getPostalCode getpostalcode = (getPostalCode) getbirthdatefull;
        getpostalcode.MediaSessionCompatQueueItem(-450396084);
        getAddressCountry getaddresscountry = getpostalcode.read;
        if ((i2 & 6) == 0) {
            if (getpostalcode.read(i)) {
                int i6 = read + 101;
                RemoteActionCompatParcelizer = i6 % Fields.SpotShadowColor;
                i4 = i6 % 2 != 0 ? 5 : 4;
            } else {
                i4 = 2;
            }
            i3 = i4 | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= getpostalcode.read(modifier) ? 32 : 16;
        }
        if ((i3 & 19) != 18) {
            z = true;
        } else {
            int i7 = RemoteActionCompatParcelizer + 33;
            read = i7 % Fields.SpotShadowColor;
            if (i7 % 2 == 0) {
                int i8 = 2 % 3;
            }
            z = false;
        }
        if (!getpostalcode.write(i3 & 1, z)) {
            getpostalcode.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
        } else {
            Modifier modifierM74paddingqDBjuR0$default = PaddingKt.m74paddingqDBjuR0$default(modifier, Dimensions.getAnimatedVisibility, 0.0f, Dimensions.EdgeToEdgeExternalSyntheticLambda0, 0.0f, 10);
            FlingCancellationException flingCancellationException = Arrangement.MediaDescriptionCompat;
            Alignment.Companion companion = Alignment.Companion;
            ModalBottomSheetYbuCTN8 modalBottomSheetYbuCTN8Serializer = ModalBottomSheetKtModalBottomSheet311.serializer(flingCancellationException, companion.getStart(), getpostalcode, 0);
            int iHashCode = Long.hashCode(getpostalcode.RatingCompat);
            DragAndDropNodestartDragAndDropTransfer1 dragAndDropNodestartDragAndDropTransfer1Serializer = getpostalcode.serializer();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(getpostalcode, modifierM74paddingqDBjuR0$default);
            ComposeUiNode.Companion companion2 = ComposeUiNode.Companion;
            r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 constructor = companion2.getConstructor();
            if (getaddresscountry == null) {
                SentryUUID.write();
                throw null;
            }
            int i9 = read + 111;
            RemoteActionCompatParcelizer = i9 % Fields.SpotShadowColor;
            int i10 = i9 % 2;
            getpostalcode.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg();
            if (getpostalcode.ComponentActivity) {
                getpostalcode.serializer(constructor);
            } else {
                getpostalcode.r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28();
            }
            c8$$ExternalSyntheticOutline0.m(companion2, getpostalcode, modalBottomSheetYbuCTN8Serializer, getpostalcode, dragAndDropNodestartDragAndDropTransfer1Serializer);
            AndroidContentCaptureManagerCompanion.write(getpostalcode, modifierMaterializeModifier, m1$$ExternalSyntheticOutline0.m(companion2, getpostalcode, Integer.valueOf(iHashCode), getpostalcode));
            Modifier.Companion companion3 = Modifier.Companion;
            Modifier modifierM74paddingqDBjuR0$default2 = PaddingKt.m74paddingqDBjuR0$default(companion3, 0.0f, Dimensions.setStackedBackground, 0.0f, 0.0f, 13);
            supportingTextPaddinga9UjIt4material3default supportingtextpaddinga9ujit4material3defaultSerializer = TextFieldDefaults.serializer(Arrangement.MediaBrowserCompatMediaItem, companion.getCenterVertically(), getpostalcode, 48);
            int iHashCode2 = Long.hashCode(getpostalcode.RatingCompat);
            DragAndDropNodestartDragAndDropTransfer1 dragAndDropNodestartDragAndDropTransfer1Serializer2 = getpostalcode.serializer();
            Modifier modifierMaterializeModifier2 = ComposedModifierKt.materializeModifier(getpostalcode, modifierM74paddingqDBjuR0$default2);
            r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 constructor2 = companion2.getConstructor();
            getpostalcode.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg();
            if (getpostalcode.ComponentActivity) {
                getpostalcode.serializer(constructor2);
            } else {
                getpostalcode.r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28();
            }
            r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.read(companion2, getpostalcode, supportingtextpaddinga9ujit4material3defaultSerializer, getpostalcode, dragAndDropNodestartDragAndDropTransfer1Serializer2);
            AndroidContentCaptureManagerCompanion.write(getpostalcode, modifierMaterializeModifier2, m1$$ExternalSyntheticOutline0.m(companion2, getpostalcode, Integer.valueOf(iHashCode2), getpostalcode));
            SkeletonViewKt.RemoteActionCompatParcelizer(null, 0.0f, 0.0f, getpostalcode, 0);
            SkeletonViewKt.IconCompatParcelizer(PaddingKt.m74paddingqDBjuR0$default(SizeKt.write(companion3, 1.0f), Dimensions.setActionBarVisibilityCallback, 0.0f, 0.0f, 0.0f, 14), 0.0f, 0.0f, getpostalcode, 0, 14);
            getpostalcode.IconCompatParcelizer(true);
            getpostalcode.serializer(-1539687618);
            int i11 = 0;
            while (i11 < i - 1) {
                int i12 = RemoteActionCompatParcelizer + 53;
                read = i12 % Fields.SpotShadowColor;
                int i13 = i12 % 2;
                Modifier.Companion companion4 = Modifier.Companion;
                ExtrasKt.read(913837329, handleUrlOverridelambda1.RemoteActionCompatParcelizer(), handleUrlOverridelambda1.RemoteActionCompatParcelizer(), -913837326, handleUrlOverridelambda1.RemoteActionCompatParcelizer(), handleUrlOverridelambda1.RemoteActionCompatParcelizer(), new Object[]{getpostalcode, SizeKt.m75height3ABfNKs(companion4, Dimensions.setPrimaryBackground)});
                SkeletonViewKt.IconCompatParcelizer(PaddingKt.m74paddingqDBjuR0$default(SizeKt.write(companion4, 1.0f), Dimensions.setVisibility, 0.0f, i11 == 0 ? Dimensions.EdgeToEdgeExternalSyntheticLambda0 : Dp.m3673constructorimpl(0.0f), 0.0f, 10), 0.0f, 0.0f, getpostalcode, 0, 14);
                i11++;
            }
            getpostalcode.IconCompatParcelizer(false);
            IconCompatParcelizer.IconCompatParcelizer(Modifier.Companion, Dimensions.setStackedBackground, getpostalcode, true);
        }
        getHandleruiannotations gethandleruiannotationsMediaDescriptionCompat = getpostalcode.MediaDescriptionCompat();
        if (gethandleruiannotationsMediaDescriptionCompat != null) {
            gethandleruiannotationsMediaDescriptionCompat.serializer = new SingleThreadFutureScheduler2(i, i2, 3, modifier);
        }
    }
}
