package com.roadrunner.rider.safety.permission.presentation;

import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Fields;
import androidx.compose.ui.node.ComposeUiNode;
import bo.app.c8$$ExternalSyntheticOutline0;
import bo.app.d$$ExternalSyntheticOutline0;
import bo.app.m1$$ExternalSyntheticOutline0;
import com.roadrunner.nafath.logger.NafathLogger$$ExternalSyntheticLambda0;
import com.roadrunner.rider.safety.permission.presentation.missingpermission.MissingPermissionsContentKt;
import com.roadrunner.rider.safety.permission.presentation.result.PermissionResultContentKt;
import com.roadrunner.sidemenu.photoId.PhotoIdUiModelImpl$1$1;
import io.sentry.SentryUUID;
import java.util.List;
import o.AndroidContentCaptureManager;
import o.AndroidContentCaptureManagerCompanion;
import o.ApproachLayoutModifierNodeminApproachIntrinsicHeight1;
import o.DragAndDropNodestartDragAndDropTransfer1;
import o.ModalBottomSheetKtModalBottomSheet311;
import o.ModalBottomSheetYbuCTN8;
import o.PopulateViewStructure_androidKtpopulate7;
import o.ShortNewsContentCardView;
import o.accessgetAltRightcp;
import o.getBirthDateFull;
import o.getCreditCardExpirationMonth;
import o.getHandleruiannotations;
import o.getLastDeeplink;
import o.getPhoneNumberNational;
import o.getPostalCode;
import o.getSdkVersion;
import o.getUseTempTrackingTableroom_runtime;
import o.initSdk;
import o.internalInitInvalidationTracker;
import o.onViewDetachedFromWindowlambda1;
import o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0;
import o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM;
import o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0;
import o.r8lambdag2v_8ZFcgEbevxAiKW6LalaYkVg;

/* JADX INFO: loaded from: classes3.dex */
public abstract class RiderSafetyPermissionScreenKt {
    private static int read = 1;
    private static int serializer;

    /* JADX WARN: Code duplicated, block: B:55:0x00f9  */
    public static final void RiderSafetyPermissionScreen(getLastDeeplink getlastdeeplink, r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k0, r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k1, internalInitInvalidationTracker internalinitinvalidationtracker, Modifier modifier, getBirthDateFull getbirthdatefull, int i) {
        int i2;
        Modifier modifier2;
        boolean z;
        boolean z2;
        int i3;
        int i4;
        int i5;
        int i6 = 2 % 2;
        getlastdeeplink.getClass();
        r8lambdardpfsr94j4iebcwx_kpqzpm8k0.getClass();
        r8lambdardpfsr94j4iebcwx_kpqzpm8k1.getClass();
        getPostalCode getpostalcode = (getPostalCode) getbirthdatefull;
        getpostalcode.MediaSessionCompatQueueItem(1813103751);
        if ((i & 6) == 0) {
            i2 = (getpostalcode.read(getlastdeeplink) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            int i7 = serializer + 123;
            read = i7 % Fields.SpotShadowColor;
            int i8 = i7 % 2;
            if (getpostalcode.IconCompatParcelizer(r8lambdardpfsr94j4iebcwx_kpqzpm8k0)) {
                int i9 = read + 35;
                serializer = i9 % Fields.SpotShadowColor;
                int i10 = i9 % 2;
                i5 = 32;
            } else {
                i5 = 16;
            }
            i2 |= i5;
        }
        if ((i & 384) == 0) {
            if (getpostalcode.IconCompatParcelizer(r8lambdardpfsr94j4iebcwx_kpqzpm8k1)) {
                int i11 = read + 65;
                int i12 = i11 % Fields.SpotShadowColor;
                serializer = i12;
                int i13 = i11 % 2;
                int i14 = i12 + 45;
                read = i14 % Fields.SpotShadowColor;
                int i15 = i14 % 2;
                i4 = Fields.RotationX;
            } else {
                i4 = Fields.SpotShadowColor;
            }
            i2 |= i4;
        }
        if ((i & 3072) == 0) {
            if ((i & Fields.TransformOrigin) == 0 ? getpostalcode.read(internalinitinvalidationtracker) : getpostalcode.IconCompatParcelizer(internalinitinvalidationtracker)) {
                int i16 = read + 31;
                serializer = i16 % Fields.SpotShadowColor;
                int i17 = i16 % 2;
                i3 = 2048;
            } else {
                i3 = Fields.RotationZ;
            }
            i2 |= i3;
        }
        int i18 = i2 | 24576;
        if (!(!getpostalcode.write(i18 & 1, (i18 & 9363) != 9362))) {
            modifier2 = Modifier.Companion;
            List list = internalinitinvalidationtracker.serializer;
            Object objComponentActivity = getpostalcode.ComponentActivity();
            AndroidContentCaptureManager androidContentCaptureManager = getCreditCardExpirationMonth.write;
            if (objComponentActivity == androidContentCaptureManager) {
                objComponentActivity = new NafathLogger$$ExternalSyntheticLambda0(27);
                getpostalcode.write(objComponentActivity);
            }
            accessgetAltRightcp accessgetaltrightcpIconCompatParcelizer = ApproachLayoutModifierNodeminApproachIntrinsicHeight1.IconCompatParcelizer(list, (r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) objComponentActivity, getpostalcode, 48);
            getUseTempTrackingTableroom_runtime getusetemptrackingtableroom_runtime = (getUseTempTrackingTableroom_runtime) ((PopulateViewStructure_androidKtpopulate7) ((onViewDetachedFromWindowlambda1) internalinitinvalidationtracker.IconCompatParcelizer).MediaSessionCompatResultReceiverWrapper()).getValue();
            ShortNewsContentCardView shortNewsContentCardView = null;
            if ((i18 & 7168) != 2048) {
                if ((i18 & Fields.TransformOrigin) != 0) {
                    int i19 = serializer + 115;
                    read = i19 % Fields.SpotShadowColor;
                    if (i19 % 2 == 0) {
                        getpostalcode.IconCompatParcelizer(internalinitinvalidationtracker);
                        throw null;
                    }
                    z = getpostalcode.IconCompatParcelizer(internalinitinvalidationtracker);
                }
            }
            boolean z3 = getpostalcode.read(accessgetaltrightcpIconCompatParcelizer);
            Object objComponentActivity2 = getpostalcode.ComponentActivity();
            if ((z | z3) || objComponentActivity2 == androidContentCaptureManager) {
                objComponentActivity2 = new PhotoIdUiModelImpl$1$1(internalinitinvalidationtracker, accessgetaltrightcpIconCompatParcelizer, shortNewsContentCardView, 15);
                getpostalcode.write(objComponentActivity2);
                int i20 = serializer + 89;
                read = i20 % Fields.SpotShadowColor;
                int i21 = i20 % 2;
            }
            getPhoneNumberNational.RemoteActionCompatParcelizer(getpostalcode, getusetemptrackingtableroom_runtime, (r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0) objComponentActivity2);
            Modifier modifierThen = modifier2.then(SizeKt.read);
            ModalBottomSheetYbuCTN8 modalBottomSheetYbuCTN8Serializer = ModalBottomSheetKtModalBottomSheet311.serializer(Arrangement.MediaDescriptionCompat, Alignment.Companion.getStart(), getpostalcode, 0);
            int iHashCode = Long.hashCode(getpostalcode.RatingCompat);
            DragAndDropNodestartDragAndDropTransfer1 dragAndDropNodestartDragAndDropTransfer1Serializer = getpostalcode.serializer();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(getpostalcode, modifierThen);
            ComposeUiNode.Companion companion = ComposeUiNode.Companion;
            r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 constructor = companion.getConstructor();
            if (getpostalcode.read == null) {
                SentryUUID.write();
                throw null;
            }
            getpostalcode.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg();
            if (getpostalcode.ComponentActivity) {
                int i22 = read + 117;
                serializer = i22 % Fields.SpotShadowColor;
                if (i22 % 2 != 0) {
                    getpostalcode.serializer(constructor);
                    throw null;
                }
                getpostalcode.serializer(constructor);
            } else {
                getpostalcode.r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28();
            }
            c8$$ExternalSyntheticOutline0.m(companion, getpostalcode, modalBottomSheetYbuCTN8Serializer, getpostalcode, dragAndDropNodestartDragAndDropTransfer1Serializer);
            AndroidContentCaptureManagerCompanion.write(getpostalcode, modifierMaterializeModifier, m1$$ExternalSyntheticOutline0.m(companion, getpostalcode, Integer.valueOf(iHashCode), getpostalcode));
            if (!(!(getlastdeeplink instanceof getSdkVersion))) {
                int i23 = read + 67;
                serializer = i23 % Fields.SpotShadowColor;
                if (i23 % 2 != 0) {
                    getpostalcode.serializer(1230209487);
                    MissingPermissionsContentKt.MissingPermissionsContent((getSdkVersion) getlastdeeplink, r8lambdardpfsr94j4iebcwx_kpqzpm8k0, null, getpostalcode, i18 & 21);
                    z2 = true;
                } else {
                    getpostalcode.serializer(1230209487);
                    MissingPermissionsContentKt.MissingPermissionsContent((getSdkVersion) getlastdeeplink, r8lambdardpfsr94j4iebcwx_kpqzpm8k0, null, getpostalcode, i18 & 126);
                    z2 = false;
                }
                getpostalcode.IconCompatParcelizer(z2);
            } else if (getlastdeeplink.equals(initSdk.RemoteActionCompatParcelizer)) {
                getpostalcode.serializer(1230214256);
                PermissionResultContentKt.PermissionResultContent((i18 >> 6) & 14, getpostalcode, null, r8lambdardpfsr94j4iebcwx_kpqzpm8k1);
                getpostalcode.IconCompatParcelizer(false);
            } else {
                if (!getlastdeeplink.equals(initSdk.read)) {
                    throw d$$ExternalSyntheticOutline0.m(getpostalcode, 1230208143, false);
                }
                getpostalcode.serializer(-517948902);
                getpostalcode.IconCompatParcelizer(false);
            }
            int i24 = read + 53;
            serializer = i24 % Fields.SpotShadowColor;
            int i25 = i24 % 2;
            getpostalcode.IconCompatParcelizer(true);
        } else {
            getpostalcode.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
            modifier2 = modifier;
        }
        getHandleruiannotations gethandleruiannotationsMediaDescriptionCompat = getpostalcode.MediaDescriptionCompat();
        if (gethandleruiannotationsMediaDescriptionCompat != null) {
            gethandleruiannotationsMediaDescriptionCompat.serializer = new r8lambdag2v_8ZFcgEbevxAiKW6LalaYkVg(getlastdeeplink, r8lambdardpfsr94j4iebcwx_kpqzpm8k0, r8lambdardpfsr94j4iebcwx_kpqzpm8k1, internalinitinvalidationtracker, modifier2, i, 11);
        }
    }
}
