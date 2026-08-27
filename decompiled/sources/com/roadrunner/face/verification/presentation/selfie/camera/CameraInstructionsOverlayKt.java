package com.roadrunner.face.verification.presentation.selfie.camera;

import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.graphics.AndroidPath_androidKt;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.Fields;
import androidx.compose.ui.graphics.Path;
import androidx.compose.ui.graphics.SolidColor;
import androidx.compose.ui.graphics.vector.ImageVector;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.res.StringResources_androidKt;
import bo.app.af$$ExternalSyntheticOutline0;
import bo.app.c8$$ExternalSyntheticOutline0;
import bo.app.m1$$ExternalSyntheticOutline0;
import coil3.ExtrasKt;
import com.logistics.rider.glovo.R;
import com.roadrunner.domain.util.RetryWithDelay$$ExternalSyntheticLambda0;
import com.roadrunner.rrds.compose.component.message.BannerMessageKt;
import io.sentry.SentryUUID;
import o.AndroidContentCaptureManagerCompanion;
import o.AwaitFirstLayoutModifier;
import o.DragAndDropNodestartDragAndDropTransfer1;
import o.ModalBottomSheetDialogWrapper;
import o.ModalBottomSheetKtModalBottomSheet311;
import o.ModalBottomSheetYbuCTN8;
import o.buildMapping;
import o.enableBridgeSecurity;
import o.getAddressCountry;
import o.getBirthDateFull;
import o.getCreditCardExpirationMonth;
import o.getHandleruiannotations;
import o.getLayers;
import o.getNewPassword;
import o.getPostalCode;
import o.handleUrlOverridelambda1;
import o.performMeasureDjhGOtQ;
import o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0;
import o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM;

/* JADX INFO: loaded from: classes3.dex */
public abstract class CameraInstructionsOverlayKt {
    private static int RemoteActionCompatParcelizer = 0;
    private static int write = 1;

    /* JADX WARN: Code duplicated, block: B:10:0x002d A[PHI: r1 r14
  0x002d: PHI (r1v13 int) = (r1v4 int), (r1v14 int) binds: [B:8:0x0029, B:5:0x001d] A[DONT_GENERATE, DONT_INLINE]
  0x002d: PHI (r14v5 o.getPostalCode) = (r14v1 o.getPostalCode), (r14v6 o.getPostalCode) binds: [B:8:0x0029, B:5:0x001d] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:22:0x0082  */
    /* JADX WARN: Code duplicated, block: B:9:0x002b A[PHI: r1 r14
  0x002b: PHI (r1v5 int) = (r1v4 int), (r1v14 int) binds: [B:8:0x0029, B:5:0x001d] A[DONT_GENERATE, DONT_INLINE]
  0x002b: PHI (r14v2 o.getPostalCode) = (r14v1 o.getPostalCode), (r14v6 o.getPostalCode) binds: [B:8:0x0029, B:5:0x001d] A[DONT_GENERATE, DONT_INLINE]] */
    public static final void FaceShapeCanvas(Modifier modifier, getBirthDateFull getbirthdatefull, int i) {
        getPostalCode getpostalcode;
        int i2;
        boolean z;
        int i3 = 2 % 2;
        int i4 = write + 83;
        RemoteActionCompatParcelizer = i4 % Fields.SpotShadowColor;
        if (i4 % 2 != 0) {
            getpostalcode = (getPostalCode) getbirthdatefull;
            getpostalcode.MediaSessionCompatQueueItem(-1422735159);
            i2 = i | 46;
            if ((i2 & 3) != 5) {
                z = true;
            } else {
                z = false;
            }
        } else {
            getpostalcode = (getPostalCode) getbirthdatefull;
            getpostalcode.MediaSessionCompatQueueItem(-1422735159);
            i2 = i | 6;
            if ((i2 & 3) != 2) {
                z = true;
            } else {
                z = false;
            }
        }
        int i5 = 16;
        if (getpostalcode.write(i2 & 1, z)) {
            modifier = Modifier.Companion;
            SolidColor solidColor = new SolidColor(Color.m721copywmQWz5c$default(((buildMapping) getpostalcode.write((getNewPassword) performMeasureDjhGOtQ.RemoteActionCompatParcelizer)).setPresenter(), 0.48f, 0.0f, 0.0f, 0.0f, 14, null), null);
            Modifier modifierThen = modifier.then(SizeKt.read);
            modifierThen.getClass();
            boolean z2 = getpostalcode.read(solidColor);
            Object objComponentActivity = getpostalcode.ComponentActivity();
            if (z2) {
                objComponentActivity = new RetryWithDelay$$ExternalSyntheticLambda0(i5, solidColor);
                getpostalcode.write(objComponentActivity);
            } else {
                int i6 = write + 49;
                RemoteActionCompatParcelizer = i6 % Fields.SpotShadowColor;
                if (i6 % 2 != 0) {
                    int i7 = 91 / 0;
                    if (objComponentActivity == getCreditCardExpirationMonth.write) {
                        objComponentActivity = new RetryWithDelay$$ExternalSyntheticLambda0(i5, solidColor);
                        getpostalcode.write(objComponentActivity);
                    }
                } else if (objComponentActivity == getCreditCardExpirationMonth.write) {
                    objComponentActivity = new RetryWithDelay$$ExternalSyntheticLambda0(i5, solidColor);
                    getpostalcode.write(objComponentActivity);
                }
            }
            AwaitFirstLayoutModifier.serializer(modifierThen, (r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) objComponentActivity, getpostalcode, 0);
        } else {
            getpostalcode.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
        }
        getHandleruiannotations gethandleruiannotationsMediaDescriptionCompat = getpostalcode.MediaDescriptionCompat();
        if (gethandleruiannotationsMediaDescriptionCompat != null) {
            gethandleruiannotationsMediaDescriptionCompat.serializer = new getLayers(modifier, i, 16);
        }
    }

    /* JADX INFO: renamed from: getFaceShapePath-Cqks5Fs, reason: not valid java name */
    public static final Path m4962getFaceShapePathCqks5Fs(long j, float f, float f2, float f3) {
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 25;
        write = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        Path Path = AndroidPath_androidKt.Path();
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j >> 32)) - f;
        int i4 = (int) (j & 4294967295L);
        float fIntBitsToFloat2 = (Float.intBitsToFloat(i4) / 1.7f) - f2;
        long jM469constructorimpl = Offset.m469constructorimpl((((long) Float.floatToRawIntBits(f)) << 32) | (((long) Float.floatToRawIntBits(fIntBitsToFloat2)) & 4294967295L));
        long jM469constructorimpl2 = Offset.m469constructorimpl((((long) Float.floatToRawIntBits(fIntBitsToFloat)) << 32) | (((long) Float.floatToRawIntBits(fIntBitsToFloat2)) & 4294967295L));
        float fIntBitsToFloat3 = Float.intBitsToFloat(i4);
        double dIntBitsToFloat = Float.intBitsToFloat(i4);
        int i5 = (int) (jM469constructorimpl >> 32);
        Path.moveTo(Float.intBitsToFloat(i5), Float.intBitsToFloat((int) (jM469constructorimpl & 4294967295L)));
        int i6 = (int) (jM469constructorimpl2 >> 32);
        int i7 = (int) (jM469constructorimpl2 & 4294967295L);
        float f4 = (fIntBitsToFloat2 - (fIntBitsToFloat3 * 0.35f)) - f3;
        Path.cubicTo((f - f2) - f3, f4, (fIntBitsToFloat + f2) - f3, f4, Float.intBitsToFloat(i6), Float.intBitsToFloat(i7));
        Path.moveTo(Float.intBitsToFloat(i5), Float.intBitsToFloat(i7));
        float f5 = fIntBitsToFloat2 + ((float) (dIntBitsToFloat * 0.3d));
        Path.cubicTo((f + f2) - f3, f5 - f3, (fIntBitsToFloat - f2) + f3, f5 + f3, Float.intBitsToFloat(i6), Float.intBitsToFloat(i7));
        int i8 = RemoteActionCompatParcelizer + 49;
        write = i8 % Fields.SpotShadowColor;
        if (i8 % 2 != 0) {
            return Path;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static final void CameraInstructionsOverlayColumn(Modifier modifier, getBirthDateFull getbirthdatefull, int i) {
        Modifier modifier2;
        int i2 = 2 % 2;
        int i3 = RemoteActionCompatParcelizer + 65;
        write = i3 % Fields.SpotShadowColor;
        int i4 = i3 % 2;
        getPostalCode getpostalcode = (getPostalCode) getbirthdatefull;
        getpostalcode.MediaSessionCompatQueueItem(111751561);
        getAddressCountry getaddresscountry = getpostalcode.read;
        int i5 = i | 6;
        if (getpostalcode.write(i5 & 1, (i5 & 3) != 2)) {
            modifier2 = Modifier.Companion;
            Alignment.Companion companion = Alignment.Companion;
            MeasurePolicy measurePolicy = BoxKt.read(companion.getTopStart(), false);
            int iHashCode = Long.hashCode(getpostalcode.RatingCompat);
            DragAndDropNodestartDragAndDropTransfer1 dragAndDropNodestartDragAndDropTransfer1Serializer = getpostalcode.serializer();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(getpostalcode, modifier2);
            ComposeUiNode.Companion companion2 = ComposeUiNode.Companion;
            r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 constructor = companion2.getConstructor();
            Object obj = null;
            if (getaddresscountry == null) {
                SentryUUID.write();
                throw null;
            }
            getpostalcode.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg();
            if (getpostalcode.ComponentActivity) {
                getpostalcode.serializer(constructor);
            } else {
                getpostalcode.r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28();
            }
            af$$ExternalSyntheticOutline0.m(companion2, getpostalcode, measurePolicy, getpostalcode, dragAndDropNodestartDragAndDropTransfer1Serializer);
            AndroidContentCaptureManagerCompanion.write(getpostalcode, modifierMaterializeModifier, m1$$ExternalSyntheticOutline0.m(companion2, getpostalcode, Integer.valueOf(iHashCode), getpostalcode));
            FaceShapeCanvas(null, getpostalcode, 0);
            Modifier modifierThen = modifier2.then(SizeKt.read);
            ModalBottomSheetYbuCTN8 modalBottomSheetYbuCTN8Serializer = ModalBottomSheetKtModalBottomSheet311.serializer(Arrangement.MediaDescriptionCompat, companion.getCenterHorizontally(), getpostalcode, 48);
            int iHashCode2 = Long.hashCode(getpostalcode.RatingCompat);
            DragAndDropNodestartDragAndDropTransfer1 dragAndDropNodestartDragAndDropTransfer1Serializer2 = getpostalcode.serializer();
            Modifier modifierMaterializeModifier2 = ComposedModifierKt.materializeModifier(getpostalcode, modifierThen);
            r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 constructor2 = companion2.getConstructor();
            getpostalcode.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg();
            if (!(!getpostalcode.ComponentActivity)) {
                int i6 = write + 23;
                RemoteActionCompatParcelizer = i6 % Fields.SpotShadowColor;
                if (i6 % 2 != 0) {
                    getpostalcode.serializer(constructor2);
                    obj.hashCode();
                    throw null;
                }
                getpostalcode.serializer(constructor2);
            } else {
                getpostalcode.r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28();
            }
            c8$$ExternalSyntheticOutline0.m(companion2, getpostalcode, modalBottomSheetYbuCTN8Serializer, getpostalcode, dragAndDropNodestartDragAndDropTransfer1Serializer2);
            AndroidContentCaptureManagerCompanion.write(getpostalcode, modifierMaterializeModifier2, m1$$ExternalSyntheticOutline0.m(companion2, getpostalcode, Integer.valueOf(iHashCode2), getpostalcode));
            BannerMessageKt.IconCompatParcelizer(ModalBottomSheetDialogWrapper.IconCompatParcelizer(SizeKt.IconCompatParcelizer(modifier2, null, 3), 0.35f), (ImageVector) null, (String) null, StringResources_androidKt.stringResource(R.string.identity_verification_selfie_camera_instructions, getpostalcode, 0), (String) null, (String) null, (enableBridgeSecurity) null, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) null, getpostalcode, 0, 502);
            ExtrasKt.read(913837329, handleUrlOverridelambda1.RemoteActionCompatParcelizer(), handleUrlOverridelambda1.RemoteActionCompatParcelizer(), -913837326, handleUrlOverridelambda1.RemoteActionCompatParcelizer(), handleUrlOverridelambda1.RemoteActionCompatParcelizer(), new Object[]{getpostalcode, ModalBottomSheetDialogWrapper.IconCompatParcelizer(modifier2, 1.0f)});
            getpostalcode.IconCompatParcelizer(true);
            getpostalcode.IconCompatParcelizer(true);
        } else {
            getpostalcode.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
            modifier2 = modifier;
        }
        getHandleruiannotations gethandleruiannotationsMediaDescriptionCompat = getpostalcode.MediaDescriptionCompat();
        if (gethandleruiannotationsMediaDescriptionCompat != null) {
            gethandleruiannotationsMediaDescriptionCompat.serializer = new getLayers(modifier2, i, 15);
        }
    }
}
