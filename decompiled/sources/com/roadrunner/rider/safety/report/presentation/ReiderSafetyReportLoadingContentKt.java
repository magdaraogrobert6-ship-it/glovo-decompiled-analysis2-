package com.roadrunner.rider.safety.report.presentation;

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
import o.FlingCancellationException;
import o.ModalBottomSheetKtModalBottomSheet311;
import o.ModalBottomSheetYbuCTN8;
import o.RadioButton;
import o.TextFieldDefaults;
import o.getBirthDateFull;
import o.getHandleruiannotations;
import o.getLayers;
import o.getPostalCode;
import o.handleUrlOverridelambda1;
import o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0;
import o.r8lambdafvzP3Wky1RLLzE56uVXaMHcvU;
import o.show;
import o.supportingTextPaddinga9UjIt4material3default;

/* JADX INFO: loaded from: classes3.dex */
public abstract class ReiderSafetyReportLoadingContentKt {
    private static int RemoteActionCompatParcelizer = 1;
    private static int serializer;

    /* JADX WARN: Code duplicated, block: B:10:0x0039 A[PHI: r2 r4
  0x0039: PHI (r2v9 o.getPostalCode) = (r2v5 o.getPostalCode), (r2v11 o.getPostalCode) binds: [B:8:0x002c, B:5:0x001f] A[DONT_GENERATE, DONT_INLINE]
  0x0039: PHI (r4v13 int) = (r4v2 int), (r4v14 int) binds: [B:8:0x002c, B:5:0x001f] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:9:0x002e A[PHI: r2 r4
  0x002e: PHI (r2v6 o.getPostalCode) = (r2v5 o.getPostalCode), (r2v11 o.getPostalCode) binds: [B:8:0x002c, B:5:0x001f] A[DONT_GENERATE, DONT_INLINE]
  0x002e: PHI (r4v3 int) = (r4v2 int), (r4v14 int) binds: [B:8:0x002c, B:5:0x001f] A[DONT_GENERATE, DONT_INLINE]] */
    public static final void SkeletonScoreRow(Modifier modifier, getBirthDateFull getbirthdatefull, int i) {
        getPostalCode getpostalcode;
        int i2;
        boolean z;
        Modifier modifier2;
        int i3 = 2 % 2;
        int i4 = serializer + 1;
        RemoteActionCompatParcelizer = i4 % Fields.SpotShadowColor;
        if (i4 % 2 == 0) {
            getpostalcode = (getPostalCode) getbirthdatefull;
            getpostalcode.MediaSessionCompatQueueItem(-1402842695);
            i2 = i | 1;
            if ((i2 & 4) != 3) {
                int i5 = RemoteActionCompatParcelizer + 81;
                serializer = i5 % Fields.SpotShadowColor;
                int i6 = i5 % 2;
                z = true;
            } else {
                z = false;
            }
        } else {
            getpostalcode = (getPostalCode) getbirthdatefull;
            getpostalcode.MediaSessionCompatQueueItem(-1402842695);
            i2 = i | 6;
            if ((i2 & 3) != 2) {
                int i7 = RemoteActionCompatParcelizer + 81;
                serializer = i7 % Fields.SpotShadowColor;
                int i8 = i7 % 2;
                z = true;
            } else {
                z = false;
            }
        }
        if (getpostalcode.write(i2 & 1, z)) {
            int i9 = serializer + 97;
            RemoteActionCompatParcelizer = i9 % Fields.SpotShadowColor;
            int i10 = i9 % 2;
            modifier2 = Modifier.Companion;
            supportingTextPaddinga9UjIt4material3default supportingtextpaddinga9ujit4material3defaultSerializer = TextFieldDefaults.serializer(Arrangement.MediaBrowserCompatMediaItem, Alignment.Companion.getTop(), getpostalcode, 0);
            int iHashCode = Long.hashCode(getpostalcode.RatingCompat);
            DragAndDropNodestartDragAndDropTransfer1 dragAndDropNodestartDragAndDropTransfer1Serializer = getpostalcode.serializer();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(getpostalcode, modifier2);
            ComposeUiNode.Companion companion = ComposeUiNode.Companion;
            r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 constructor = companion.getConstructor();
            if (getpostalcode.read == null) {
                SentryUUID.write();
                throw null;
            }
            getpostalcode.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg();
            if (getpostalcode.ComponentActivity) {
                getpostalcode.serializer(constructor);
                int i11 = serializer + 11;
                RemoteActionCompatParcelizer = i11 % Fields.SpotShadowColor;
                int i12 = i11 % 2;
            } else {
                getpostalcode.r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28();
            }
            r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.read(companion, getpostalcode, supportingtextpaddinga9ujit4material3defaultSerializer, getpostalcode, dragAndDropNodestartDragAndDropTransfer1Serializer);
            AndroidContentCaptureManagerCompanion.write(getpostalcode, modifierMaterializeModifier, m1$$ExternalSyntheticOutline0.m(companion, getpostalcode, Integer.valueOf(iHashCode), getpostalcode));
            SkeletonViewKt.IconCompatParcelizer(SizeKt.write(modifier2, 0.3f), 0.0f, 0.0f, getpostalcode, 6, 14);
            Object[] objArr = {getpostalcode, modifier2.then(new show(1.0f, true))};
            ExtrasKt.read(913837329, handleUrlOverridelambda1.RemoteActionCompatParcelizer(), handleUrlOverridelambda1.RemoteActionCompatParcelizer(), -913837326, handleUrlOverridelambda1.RemoteActionCompatParcelizer(), handleUrlOverridelambda1.RemoteActionCompatParcelizer(), objArr);
            SkeletonViewKt.serializer(null, 0.0f, 0.0f, getpostalcode, 0);
            getpostalcode.IconCompatParcelizer(true);
        } else {
            getpostalcode.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
            modifier2 = modifier;
        }
        getHandleruiannotations gethandleruiannotationsMediaDescriptionCompat = getpostalcode.MediaDescriptionCompat();
        if (gethandleruiannotationsMediaDescriptionCompat != null) {
            gethandleruiannotationsMediaDescriptionCompat.serializer = new getLayers(modifier2, i, 25);
        }
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0033 A[PHI: r2 r3
  0x0033: PHI (r2v9 o.getPostalCode) = (r2v5 o.getPostalCode), (r2v11 o.getPostalCode) binds: [B:8:0x002f, B:5:0x0021] A[DONT_GENERATE, DONT_INLINE]
  0x0033: PHI (r3v10 int) = (r3v2 int), (r3v11 int) binds: [B:8:0x002f, B:5:0x0021] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:9:0x0031 A[PHI: r2 r3
  0x0031: PHI (r2v6 o.getPostalCode) = (r2v5 o.getPostalCode), (r2v11 o.getPostalCode) binds: [B:8:0x002f, B:5:0x0021] A[DONT_GENERATE, DONT_INLINE]
  0x0031: PHI (r3v3 int) = (r3v2 int), (r3v11 int) binds: [B:8:0x002f, B:5:0x0021] A[DONT_GENERATE, DONT_INLINE]] */
    public static final void RiderSafetyReportLoadingContent(Modifier modifier, getBirthDateFull getbirthdatefull, int i) {
        getPostalCode getpostalcode;
        int i2;
        boolean z;
        Modifier modifier2;
        int i3 = 2 % 2;
        int i4 = serializer + 99;
        RemoteActionCompatParcelizer = i4 % Fields.SpotShadowColor;
        if (i4 % 2 == 0) {
            getpostalcode = (getPostalCode) getbirthdatefull;
            getpostalcode.MediaSessionCompatQueueItem(-496119635);
            i2 = i | 38;
            if ((i2 & 5) != 5) {
                z = true;
            } else {
                z = false;
            }
        } else {
            getpostalcode = (getPostalCode) getbirthdatefull;
            getpostalcode.MediaSessionCompatQueueItem(-496119635);
            i2 = i | 6;
            if ((i2 & 3) != 2) {
                z = true;
            } else {
                z = false;
            }
        }
        if (getpostalcode.write(i2 & 1, z)) {
            Modifier.Companion companion = Modifier.Companion;
            float f = Dimensions.setLogo;
            float f2 = Dimensions.setHideOnContentScrollEnabled;
            Modifier modifierRemoteActionCompatParcelizer = PaddingKt.RemoteActionCompatParcelizer(companion, f, f2);
            FlingCancellationException flingCancellationException = Arrangement.MediaDescriptionCompat;
            Alignment.Companion companion2 = Alignment.Companion;
            ModalBottomSheetYbuCTN8 modalBottomSheetYbuCTN8Serializer = ModalBottomSheetKtModalBottomSheet311.serializer(flingCancellationException, companion2.getStart(), getpostalcode, 0);
            int iHashCode = Long.hashCode(getpostalcode.RatingCompat);
            DragAndDropNodestartDragAndDropTransfer1 dragAndDropNodestartDragAndDropTransfer1Serializer = getpostalcode.serializer();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(getpostalcode, modifierRemoteActionCompatParcelizer);
            ComposeUiNode.Companion companion3 = ComposeUiNode.Companion;
            r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 constructor = companion3.getConstructor();
            if (getpostalcode.read == null) {
                SentryUUID.write();
                throw null;
            }
            getpostalcode.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg();
            if (getpostalcode.ComponentActivity) {
                getpostalcode.serializer(constructor);
                int i5 = serializer + 77;
                RemoteActionCompatParcelizer = i5 % Fields.SpotShadowColor;
                int i6 = i5 % 2;
            } else {
                getpostalcode.r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28();
            }
            c8$$ExternalSyntheticOutline0.m(companion3, getpostalcode, modalBottomSheetYbuCTN8Serializer, getpostalcode, dragAndDropNodestartDragAndDropTransfer1Serializer);
            AndroidContentCaptureManagerCompanion.write(getpostalcode, modifierMaterializeModifier, m1$$ExternalSyntheticOutline0.m(companion3, getpostalcode, Integer.valueOf(iHashCode), getpostalcode));
            SkeletonViewKt.serializer(null, 0.0f, 0.0f, getpostalcode, 0);
            getPostalCode getpostalcode2 = getpostalcode;
            SkeletonViewKt.IconCompatParcelizer(af$$ExternalSyntheticOutline1.m(companion, Dimensions.setHasNonEmbeddedTabs, getpostalcode, companion, 0.6f), 0.0f, 0.0f, getpostalcode2, 6, 14);
            Object[] objArr = {getpostalcode, SizeKt.m75height3ABfNKs(companion, f2)};
            ExtrasKt.read(913837329, handleUrlOverridelambda1.RemoteActionCompatParcelizer(), handleUrlOverridelambda1.RemoteActionCompatParcelizer(), -913837326, handleUrlOverridelambda1.RemoteActionCompatParcelizer(), handleUrlOverridelambda1.RemoteActionCompatParcelizer(), objArr);
            SkeletonViewKt.m5055SkeletonSquareBigdjqsMU(companion.then(new RadioButton(companion2.getCenterHorizontally())), 0.0f, 0.0f, getpostalcode2, 0, 14);
            Object[] objArr2 = {getpostalcode, SizeKt.m75height3ABfNKs(companion, f2)};
            ExtrasKt.read(913837329, handleUrlOverridelambda1.RemoteActionCompatParcelizer(), handleUrlOverridelambda1.RemoteActionCompatParcelizer(), -913837326, handleUrlOverridelambda1.RemoteActionCompatParcelizer(), handleUrlOverridelambda1.RemoteActionCompatParcelizer(), objArr2);
            SkeletonViewKt.IconCompatParcelizer(companion.then(new RadioButton(companion2.getCenterHorizontally())), 0.0f, 0.0f, getpostalcode2, 0, 14);
            Object[] objArr3 = {getpostalcode, SizeKt.m75height3ABfNKs(companion, f)};
            ExtrasKt.read(913837329, handleUrlOverridelambda1.RemoteActionCompatParcelizer(), handleUrlOverridelambda1.RemoteActionCompatParcelizer(), -913837326, handleUrlOverridelambda1.RemoteActionCompatParcelizer(), handleUrlOverridelambda1.RemoteActionCompatParcelizer(), objArr3);
            SkeletonViewKt.IconCompatParcelizer(SizeKt.m75height3ABfNKs(companion, Dimensions.setMenu), 0.0f, 0.0f, getpostalcode2, 0, 14);
            SkeletonViewKt.m5054SkeletonRowBigdjqsMU(SizeKt.m75height3ABfNKs(af$$ExternalSyntheticOutline1.m(companion, f, getpostalcode, companion, 1.0f), Dp.m3673constructorimpl(Dimensions.startActivityForResult * 2.0f)), 0.0f, 0.0f, getpostalcode2, 0, 14);
            SkeletonViewKt.m5054SkeletonRowBigdjqsMU(af$$ExternalSyntheticOutline1.m(companion, f, getpostalcode, companion, 1.0f), 0.0f, 0.0f, getpostalcode2, 6, 14);
            Object[] objArr4 = {getpostalcode, SizeKt.m75height3ABfNKs(companion, Dimensions.setMenuPrepared)};
            ExtrasKt.read(913837329, handleUrlOverridelambda1.RemoteActionCompatParcelizer(), handleUrlOverridelambda1.RemoteActionCompatParcelizer(), -913837326, handleUrlOverridelambda1.RemoteActionCompatParcelizer(), handleUrlOverridelambda1.RemoteActionCompatParcelizer(), objArr4);
            SkeletonViewKt.serializer(null, 0.0f, 0.0f, getpostalcode, 0);
            Object[] objArr5 = {getpostalcode, SizeKt.m75height3ABfNKs(companion, f2)};
            ExtrasKt.read(913837329, handleUrlOverridelambda1.RemoteActionCompatParcelizer(), handleUrlOverridelambda1.RemoteActionCompatParcelizer(), -913837326, handleUrlOverridelambda1.RemoteActionCompatParcelizer(), handleUrlOverridelambda1.RemoteActionCompatParcelizer(), objArr5);
            SkeletonScoreRow(null, getpostalcode, 0);
            Object[] objArr6 = {getpostalcode, SizeKt.m75height3ABfNKs(companion, f2)};
            ExtrasKt.read(913837329, handleUrlOverridelambda1.RemoteActionCompatParcelizer(), handleUrlOverridelambda1.RemoteActionCompatParcelizer(), -913837326, handleUrlOverridelambda1.RemoteActionCompatParcelizer(), handleUrlOverridelambda1.RemoteActionCompatParcelizer(), objArr6);
            SkeletonScoreRow(null, getpostalcode, 0);
            Object[] objArr7 = {getpostalcode, SizeKt.m75height3ABfNKs(companion, f2)};
            ExtrasKt.read(913837329, handleUrlOverridelambda1.RemoteActionCompatParcelizer(), handleUrlOverridelambda1.RemoteActionCompatParcelizer(), -913837326, handleUrlOverridelambda1.RemoteActionCompatParcelizer(), handleUrlOverridelambda1.RemoteActionCompatParcelizer(), objArr7);
            SkeletonScoreRow(null, getpostalcode, 0);
            getpostalcode.IconCompatParcelizer(true);
            modifier2 = companion;
        } else {
            getpostalcode.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
            modifier2 = modifier;
        }
        getHandleruiannotations gethandleruiannotationsMediaDescriptionCompat = getpostalcode.MediaDescriptionCompat();
        if (gethandleruiannotationsMediaDescriptionCompat != null) {
            gethandleruiannotationsMediaDescriptionCompat.serializer = new getLayers(modifier2, i, 24);
        }
    }
}
