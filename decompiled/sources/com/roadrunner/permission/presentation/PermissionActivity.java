package com.roadrunner.permission.presentation;

import android.content.Context;
import android.os.Bundle;
import androidx.compose.ui.graphics.Fields;
import coil3.ComponentRegistry$Builder;
import coil3.util.UtilsKt;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import com.mapbox.navigator.PerceptionLaneMarkingFeature;
import com.roadrunner.nafath.NafathModalContentKt$NafathModal$1$1;
import com.roadrunner.permission.api.model.PermissionModel;
import com.roadrunner.tnc.TncContentKt$$ExternalSyntheticLambda2;
import com.ui.common.base.BaseInjectionActivity;
import kotlin.text.StringsKt__StringsKt$$ExternalSyntheticLambda1;
import o.AndroidContentCaptureManager;
import o.AndroidSqliteDriverCallback;
import o.DragAndDropTargetModifierNode;
import o.RgbCompanionExternalSyntheticLambda0;
import o.createFromParcel;
import o.displayInAppMessagelambda1;
import o.getBirthDateFull;
import o.getBitmapui_graphics;
import o.getCreditCardExpirationMonth;
import o.getPostalCode;
import o.getSuspendingTransactionContext;
import o.onViewDetachedFromWindowlambda1;
import o.r8lambdaPeKEYuJNHtkCVLNkgf2Tg6F0GaM;
import o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0;
import o.r8lambdaeh2o8uUMv9GgPpFcV1r3rebGM0;
import o.r8lambdaemFy31U51vpkzTvcuc2Cdwro430;
import o.r8lambdai5n2jdKJE1GWJ_iT_qA2nhTM0L0;
import o.r8lambdaiNyw9kmcOm6XFew3Z44OoKHEsPU;
import o.r8lambdaoL9PFNVQ6zR8V_AeWUOaHE8gYho;
import o.registerInAppMessageManagerlambda0;
import o.removeNodeAtDepth;

/* JADX INFO: loaded from: classes3.dex */
public final class PermissionActivity extends BaseInjectionActivity {
    private static int MediaDescriptionCompat = 0;
    private static int RatingCompat = 1;

    @r8lambdaPeKEYuJNHtkCVLNkgf2Tg6F0GaM
    public r8lambdaemFy31U51vpkzTvcuc2Cdwro430 MediaBrowserCompatMediaItem;
    private final onViewDetachedFromWindowlambda1 MediaSessionCompatQueueItem = new ComponentRegistry$Builder(displayInAppMessagelambda1.serializer(PermissionViewModel.class), new r8lambdaeh2o8uUMv9GgPpFcV1r3rebGM0(this, 0), new AndroidSqliteDriverCallback(this, 16, new TncContentKt$$ExternalSyntheticLambda2(9, this)), new r8lambdaeh2o8uUMv9GgPpFcV1r3rebGM0(this, 1));

    public static /* synthetic */ Object IconCompatParcelizer(int i, int i2, int i3, int i4, int i5, int i6, Object[] objArr) {
        int i7 = ~i6;
        int i8 = ~((~i4) | i7);
        int i9 = i5 | i8 | (~(i6 | i4));
        int i10 = (~(i4 | i5)) | (~(i7 | i4)) | (~(i7 | i5));
        int i11 = i5 + i6 + i2 + (1351532378 * i3) + (1237199896 * i);
        int i12 = i11 * i11;
        int i13 = ((-211156802) * i5) + 1314914304 + ((-491389116) * i6) + (2007367491 * i9) + (i10 * (-2007367491)) + ((-2007367491) * i8) + (1796210688 * i2) + ((-1818230784) * i3) + ((-914358272) * i) + ((-2051670016) * i12);
        int i14 = ((i5 * 406040238) - 634933780) + (i6 * 406038884) + (i9 * (-677)) + (i10 * 677) + (i8 * 677) + (i2 * 406039561) + (i3 * 1283666474) + (i * 1712827608) + (i12 * (-77201408));
        return i13 + ((i14 * i14) * 1831469056) != 1 ? IconCompatParcelizer(objArr) : read(objArr);
    }

    public static final /* synthetic */ void IconCompatParcelizer(PermissionActivity permissionActivity) {
        int i = 2 % 2;
        int i2 = MediaDescriptionCompat + 21;
        RatingCompat = i2 % Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            permissionActivity.RemoteActionCompatParcelizer();
            int i3 = 40 / 0;
        } else {
            permissionActivity.RemoteActionCompatParcelizer();
        }
        int i4 = RatingCompat + 87;
        MediaDescriptionCompat = i4 % Fields.SpotShadowColor;
        if (i4 % 2 != 0) {
            throw null;
        }
    }

    public static final /* synthetic */ void serializer(PermissionActivity permissionActivity) {
        int i = 2 % 2;
        int i2 = MediaDescriptionCompat + 79;
        RatingCompat = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        permissionActivity.write();
        int i4 = MediaDescriptionCompat + 109;
        RatingCompat = i4 % Fields.SpotShadowColor;
        int i5 = i4 % 2;
    }

    public static /* synthetic */ PermissionViewModel IconCompatParcelizer(PermissionActivity permissionActivity, getBitmapui_graphics getbitmapui_graphics) {
        PermissionViewModel permissionViewModel;
        int i = 2 % 2;
        int i2 = RatingCompat + 53;
        MediaDescriptionCompat = i2 % Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            int iWrite = PerceptionLaneMarkingFeature.Builder.write();
            int iWrite2 = PerceptionLaneMarkingFeature.Builder.write();
            int iWrite3 = PerceptionLaneMarkingFeature.Builder.write();
            permissionViewModel = (PermissionViewModel) IconCompatParcelizer(PerceptionLaneMarkingFeature.Builder.write(), iWrite2, iWrite3, iWrite, -216774027, 216774027, new Object[]{permissionActivity, getbitmapui_graphics});
            int i3 = 92 / 0;
        } else {
            int iWrite4 = PerceptionLaneMarkingFeature.Builder.write();
            int iWrite5 = PerceptionLaneMarkingFeature.Builder.write();
            int iWrite6 = PerceptionLaneMarkingFeature.Builder.write();
            permissionViewModel = (PermissionViewModel) IconCompatParcelizer(PerceptionLaneMarkingFeature.Builder.write(), iWrite5, iWrite6, iWrite4, -216774027, 216774027, new Object[]{permissionActivity, getbitmapui_graphics});
        }
        int i4 = MediaDescriptionCompat + 23;
        RatingCompat = i4 % Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return permissionViewModel;
    }

    public static /* synthetic */ createFromParcel IconCompatParcelizer(PermissionActivity permissionActivity, getBirthDateFull getbirthdatefull, int i) {
        int i2 = 2 % 2;
        int i3 = RatingCompat + 69;
        MediaDescriptionCompat = i3 % Fields.SpotShadowColor;
        int i4 = i3 % 2;
        createFromParcel createfromparcelRemoteActionCompatParcelizer = RemoteActionCompatParcelizer(permissionActivity, getbirthdatefull, i);
        int i5 = MediaDescriptionCompat + 7;
        RatingCompat = i5 % Fields.SpotShadowColor;
        int i6 = i5 % 2;
        return createfromparcelRemoteActionCompatParcelizer;
    }

    private final PermissionViewModel read() {
        int i = 2 % 2;
        int i2 = RatingCompat + 29;
        MediaDescriptionCompat = i2 % Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        PermissionViewModel permissionViewModel = (PermissionViewModel) this.MediaSessionCompatQueueItem.MediaSessionCompatResultReceiverWrapper();
        int i3 = RatingCompat + 59;
        MediaDescriptionCompat = i3 % Fields.SpotShadowColor;
        int i4 = i3 % 2;
        return permissionViewModel;
    }

    private static /* synthetic */ Object read(Object[] objArr) {
        PermissionActivity permissionActivity = (PermissionActivity) objArr[0];
        int i = 2 % 2;
        int i2 = MediaDescriptionCompat;
        int i3 = i2 + 23;
        RatingCompat = i3 % Fields.SpotShadowColor;
        int i4 = i3 % 2;
        r8lambdaemFy31U51vpkzTvcuc2Cdwro430 r8lambdaemfy31u51vpkztvcuc2cdwro430 = permissionActivity.MediaBrowserCompatMediaItem;
        if (r8lambdaemfy31u51vpkztvcuc2cdwro430 == null) {
            removeNodeAtDepth.serializer("factory");
            throw null;
        }
        int i5 = i2 + 89;
        RatingCompat = i5 % Fields.SpotShadowColor;
        int i6 = i5 % 2;
        return r8lambdaemfy31u51vpkztvcuc2cdwro430;
    }

    private final void RemoteActionCompatParcelizer() {
        int i = 2 % 2;
        int i2 = RatingCompat + 73;
        MediaDescriptionCompat = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        read().write();
        setResult(-1);
        finish();
        int i4 = RatingCompat + 125;
        MediaDescriptionCompat = i4 % Fields.SpotShadowColor;
        int i5 = i4 % 2;
    }

    private final void write() {
        int i = 2 % 2;
        int i2 = MediaDescriptionCompat + 7;
        RatingCompat = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        read().serializer();
        setResult(0);
        finish();
        int i4 = RatingCompat + 75;
        MediaDescriptionCompat = i4 % Fields.SpotShadowColor;
        if (i4 % 2 != 0) {
            throw null;
        }
    }

    private static /* synthetic */ Object IconCompatParcelizer(Object[] objArr) {
        PermissionActivity permissionActivity = (PermissionActivity) objArr[0];
        getBitmapui_graphics getbitmapui_graphics = (getBitmapui_graphics) objArr[1];
        int i = 2 % 2;
        int i2 = MediaDescriptionCompat + 101;
        RatingCompat = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        getbitmapui_graphics.getClass();
        int iWrite = PerceptionLaneMarkingFeature.Builder.write();
        int iWrite2 = PerceptionLaneMarkingFeature.Builder.write();
        int iWrite3 = PerceptionLaneMarkingFeature.Builder.write();
        r8lambdaemFy31U51vpkzTvcuc2Cdwro430 r8lambdaemfy31u51vpkztvcuc2cdwro430 = (r8lambdaemFy31U51vpkzTvcuc2Cdwro430) IconCompatParcelizer(PerceptionLaneMarkingFeature.Builder.write(), iWrite2, iWrite3, iWrite, 1979764274, -1979764273, new Object[]{permissionActivity});
        Object objWrite = getbitmapui_graphics.write("permission_model_key");
        if (objWrite == null) {
            ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer("kotlin.Unit");
            return null;
        }
        int i4 = MediaDescriptionCompat + 67;
        RatingCompat = i4 % Fields.SpotShadowColor;
        if (i4 % 2 != 0) {
            return ((r8lambdaoL9PFNVQ6zR8V_AeWUOaHE8gYho) r8lambdaemfy31u51vpkztvcuc2cdwro430).read((PermissionModel) objWrite);
        }
        PermissionViewModel permissionViewModel = ((r8lambdaoL9PFNVQ6zR8V_AeWUOaHE8gYho) r8lambdaemfy31u51vpkztvcuc2cdwro430).read((PermissionModel) objWrite);
        int i5 = 85 / 0;
        return permissionViewModel;
    }

    @Override // com.ui.common.base.BaseInjectionActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        int i = 2 % 2;
        super.onCreate(bundle);
        getLifecycle().IconCompatParcelizer(new r8lambdai5n2jdKJE1GWJ_iT_qA2nhTM0L0(read()));
        UtilsKt.write(this, new DragAndDropTargetModifierNode(new StringsKt__StringsKt$$ExternalSyntheticLambda1(7, this), true, -257952075));
        int i2 = RatingCompat + 69;
        MediaDescriptionCompat = i2 % Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            throw null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:18:0x005f  */
    private static final createFromParcel RemoteActionCompatParcelizer(PermissionActivity permissionActivity, getBirthDateFull getbirthdatefull, int i) {
        int i2 = 2 % 2;
        boolean z = false;
        if ((i & 3) != 2) {
            int i3 = MediaDescriptionCompat + 59;
            RatingCompat = i3 % Fields.SpotShadowColor;
            if (i3 % 2 != 0) {
                z = true;
            }
        }
        getPostalCode getpostalcode = (getPostalCode) getbirthdatefull;
        if (getpostalcode.write(i & 1, z)) {
            r8lambdaiNyw9kmcOm6XFew3Z44OoKHEsPU r8lambdainyw9kmcom6xfew3z44ookhespuIconCompatParcelizer = permissionActivity.read().IconCompatParcelizer();
            RgbCompanionExternalSyntheticLambda0 rgbCompanionExternalSyntheticLambda0Write = r8lambdainyw9kmcom6xfew3z44ookhespuIconCompatParcelizer.write();
            boolean zIconCompatParcelizer = getpostalcode.IconCompatParcelizer(permissionActivity);
            Object objComponentActivity = getpostalcode.ComponentActivity();
            AndroidContentCaptureManager androidContentCaptureManager = getCreditCardExpirationMonth.write;
            if (zIconCompatParcelizer || objComponentActivity == androidContentCaptureManager) {
                objComponentActivity = new NafathModalContentKt$NafathModal$1$1(permissionActivity, 26);
                getpostalcode.write(objComponentActivity);
            }
            r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k0 = (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) ((registerInAppMessageManagerlambda0) objComponentActivity);
            boolean zIconCompatParcelizer2 = getpostalcode.IconCompatParcelizer(permissionActivity);
            Object objComponentActivity2 = getpostalcode.ComponentActivity();
            if (!zIconCompatParcelizer2) {
                int i4 = MediaDescriptionCompat + 19;
                RatingCompat = i4 % Fields.SpotShadowColor;
                int i5 = i4 % 2;
                if (objComponentActivity2 == androidContentCaptureManager) {
                    objComponentActivity2 = new NafathModalContentKt$NafathModal$1$1(permissionActivity, 27);
                    getpostalcode.write(objComponentActivity2);
                }
            } else {
                objComponentActivity2 = new NafathModalContentKt$NafathModal$1$1(permissionActivity, 27);
                getpostalcode.write(objComponentActivity2);
            }
            getSuspendingTransactionContext.write(rgbCompanionExternalSyntheticLambda0Write, r8lambdardpfsr94j4iebcwx_kpqzpm8k0, null, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) ((registerInAppMessageManagerlambda0) objComponentActivity2), r8lambdainyw9kmcom6xfew3z44ookhespuIconCompatParcelizer.read(), getpostalcode, 8, 4);
        } else {
            getpostalcode.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
            int i6 = MediaDescriptionCompat + 5;
            RatingCompat = i6 % Fields.SpotShadowColor;
            int i7 = i6 % 2;
        }
        return createFromParcel.INSTANCE;
    }

    @Override // com.ui.common.base.BaseInjectionActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public void attachBaseContext(Context context) {
        super.attachBaseContext(context);
    }

    @Override // com.ui.common.base.BaseInjectionActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onPause() {
        super.onPause();
    }

    @Override // com.ui.common.base.BaseInjectionActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onResume() {
        super.onResume();
    }

    @Override // com.ui.common.base.BaseInjectionActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onStart() {
        super.onStart();
    }

    public final r8lambdaemFy31U51vpkzTvcuc2Cdwro430 serializer() {
        int iWrite = PerceptionLaneMarkingFeature.Builder.write();
        int iWrite2 = PerceptionLaneMarkingFeature.Builder.write();
        int iWrite3 = PerceptionLaneMarkingFeature.Builder.write();
        return (r8lambdaemFy31U51vpkzTvcuc2Cdwro430) IconCompatParcelizer(PerceptionLaneMarkingFeature.Builder.write(), iWrite2, iWrite3, iWrite, 1979764274, -1979764273, new Object[]{this});
    }

    private static final PermissionViewModel write(PermissionActivity permissionActivity, getBitmapui_graphics getbitmapui_graphics) {
        int iWrite = PerceptionLaneMarkingFeature.Builder.write();
        int iWrite2 = PerceptionLaneMarkingFeature.Builder.write();
        int iWrite3 = PerceptionLaneMarkingFeature.Builder.write();
        return (PermissionViewModel) IconCompatParcelizer(PerceptionLaneMarkingFeature.Builder.write(), iWrite2, iWrite3, iWrite, -216774027, 216774027, new Object[]{permissionActivity, getbitmapui_graphics});
    }
}
