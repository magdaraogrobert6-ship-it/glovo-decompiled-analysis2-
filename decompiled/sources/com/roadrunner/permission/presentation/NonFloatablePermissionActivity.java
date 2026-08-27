package com.roadrunner.permission.presentation;

import android.content.Context;
import android.os.Bundle;
import androidx.compose.ui.graphics.Fields;
import coil3.ComponentRegistry$Builder;
import coil3.util.UtilsKt;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
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
import o.r8lambdaNFVMNcWkEo3bw4nH1RXy5p2jM;
import o.r8lambdaPeKEYuJNHtkCVLNkgf2Tg6F0GaM;
import o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0;
import o.r8lambdaemFy31U51vpkzTvcuc2Cdwro430;
import o.r8lambdaetlJ3FaLgD8fV1pdI4DQKacxOk;
import o.r8lambdai5n2jdKJE1GWJ_iT_qA2nhTM0L0;
import o.r8lambdaiNyw9kmcOm6XFew3Z44OoKHEsPU;
import o.r8lambdaoL9PFNVQ6zR8V_AeWUOaHE8gYho;
import o.registerInAppMessageManagerlambda0;
import o.removeNodeAtDepth;

/* JADX INFO: loaded from: classes3.dex */
public final class NonFloatablePermissionActivity extends BaseInjectionActivity {
    private static int MediaBrowserCompatMediaItem = 1;
    private static int RatingCompat;
    private final onViewDetachedFromWindowlambda1 MediaDescriptionCompat = new ComponentRegistry$Builder(displayInAppMessagelambda1.serializer(PermissionViewModel.class), new r8lambdaetlJ3FaLgD8fV1pdI4DQKacxOk(this, 0), new AndroidSqliteDriverCallback(this, 15, new TncContentKt$$ExternalSyntheticLambda2(8, this)), new r8lambdaetlJ3FaLgD8fV1pdI4DQKacxOk(this, 1));

    @r8lambdaPeKEYuJNHtkCVLNkgf2Tg6F0GaM
    public r8lambdaemFy31U51vpkzTvcuc2Cdwro430 MediaSessionCompatQueueItem;

    public static /* synthetic */ Object IconCompatParcelizer(int i, int i2, int i3, int i4, int i5, int i6, Object[] objArr) {
        int i7 = ~i4;
        int i8 = ~(i7 | i3);
        int i9 = ~i;
        int i10 = ~i3;
        int i11 = (~(i10 | i7)) | i9;
        int i12 = (~(i4 | i3)) | (~(i7 | i9 | i10));
        int i13 = i + i3 + i5 + ((-1136091917) * i6) + (376669458 * i2);
        int i14 = i13 * i13;
        int i15 = ((-905468225) * i) + 1718550528 + ((-1748215485) * i3) + (i8 * (-421373630)) + (421373630 * i11) + ((-421373630) * i12) + ((-1326841856) * i5) + ((-2044854272) * i6) + (41156608 * i2) + (1721171968 * i14);
        int i16 = ((i * (-924404593)) - 1636593565) + (i3 * (-924403757)) + (i8 * 418) + (i11 * (-418)) + (i12 * 418) + (i5 * (-924404175)) + (i6 * (-2083730301)) + (i2 * 182666354) + (i14 * (-51970048));
        return i15 + ((i16 * i16) * (-653721600)) != 1 ? RemoteActionCompatParcelizer(objArr) : read(objArr);
    }

    public static final /* synthetic */ void read(NonFloatablePermissionActivity nonFloatablePermissionActivity) {
        int i = 2 % 2;
        int i2 = RatingCompat + 25;
        MediaBrowserCompatMediaItem = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        nonFloatablePermissionActivity.read();
        int i4 = MediaBrowserCompatMediaItem + 23;
        RatingCompat = i4 % Fields.SpotShadowColor;
        if (i4 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static final /* synthetic */ void serializer(NonFloatablePermissionActivity nonFloatablePermissionActivity) {
        int i = 2 % 2;
        int i2 = RatingCompat + 91;
        MediaBrowserCompatMediaItem = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        nonFloatablePermissionActivity.serializer();
        int i4 = MediaBrowserCompatMediaItem + 3;
        RatingCompat = i4 % Fields.SpotShadowColor;
        int i5 = i4 % 2;
    }

    public static /* synthetic */ createFromParcel IconCompatParcelizer(NonFloatablePermissionActivity nonFloatablePermissionActivity, getBirthDateFull getbirthdatefull, int i) {
        int i2 = 2 % 2;
        int i3 = MediaBrowserCompatMediaItem + 17;
        RatingCompat = i3 % Fields.SpotShadowColor;
        int i4 = i3 % 2;
        createFromParcel createfromparcelSerializer = serializer(nonFloatablePermissionActivity, getbirthdatefull, i);
        int i5 = RatingCompat + 29;
        MediaBrowserCompatMediaItem = i5 % Fields.SpotShadowColor;
        int i6 = i5 % 2;
        return createfromparcelSerializer;
    }

    public static /* synthetic */ PermissionViewModel RemoteActionCompatParcelizer(NonFloatablePermissionActivity nonFloatablePermissionActivity, getBitmapui_graphics getbitmapui_graphics) {
        int i = 2 % 2;
        int i2 = RatingCompat + 51;
        MediaBrowserCompatMediaItem = i2 % Fields.SpotShadowColor;
        Object obj = null;
        if (i2 % 2 == 0) {
            int i3 = r8lambdaNFVMNcWkEo3bw4nH1RXy5p2jM.read();
            int i4 = r8lambdaNFVMNcWkEo3bw4nH1RXy5p2jM.read();
            int i5 = r8lambdaNFVMNcWkEo3bw4nH1RXy5p2jM.read();
            obj.hashCode();
            throw null;
        }
        int i6 = r8lambdaNFVMNcWkEo3bw4nH1RXy5p2jM.read();
        int i7 = r8lambdaNFVMNcWkEo3bw4nH1RXy5p2jM.read();
        int i8 = r8lambdaNFVMNcWkEo3bw4nH1RXy5p2jM.read();
        PermissionViewModel permissionViewModel = (PermissionViewModel) IconCompatParcelizer(1786043298, r8lambdaNFVMNcWkEo3bw4nH1RXy5p2jM.read(), -1786043298, i6, i7, i8, new Object[]{nonFloatablePermissionActivity, getbitmapui_graphics});
        int i9 = MediaBrowserCompatMediaItem + 29;
        RatingCompat = i9 % Fields.SpotShadowColor;
        if (i9 % 2 == 0) {
            return permissionViewModel;
        }
        throw null;
    }

    private static /* synthetic */ Object read(Object[] objArr) {
        NonFloatablePermissionActivity nonFloatablePermissionActivity = (NonFloatablePermissionActivity) objArr[0];
        int i = 2 % 2;
        int i2 = MediaBrowserCompatMediaItem + 77;
        RatingCompat = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        PermissionViewModel permissionViewModel = (PermissionViewModel) nonFloatablePermissionActivity.MediaDescriptionCompat.MediaSessionCompatResultReceiverWrapper();
        int i4 = RatingCompat + 43;
        MediaBrowserCompatMediaItem = i4 % Fields.SpotShadowColor;
        if (i4 % 2 != 0) {
            return permissionViewModel;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final r8lambdaemFy31U51vpkzTvcuc2Cdwro430 RemoteActionCompatParcelizer() {
        int i = 2 % 2;
        r8lambdaemFy31U51vpkzTvcuc2Cdwro430 r8lambdaemfy31u51vpkztvcuc2cdwro430 = this.MediaSessionCompatQueueItem;
        if (r8lambdaemfy31u51vpkztvcuc2cdwro430 == null) {
            removeNodeAtDepth.serializer("factory");
            throw null;
        }
        int i2 = RatingCompat;
        int i3 = i2 + 27;
        MediaBrowserCompatMediaItem = i3 % Fields.SpotShadowColor;
        if (i3 % 2 == 0) {
            int i4 = 0 / 0;
        }
        int i5 = i2 + 99;
        MediaBrowserCompatMediaItem = i5 % Fields.SpotShadowColor;
        int i6 = i5 % 2;
        return r8lambdaemfy31u51vpkztvcuc2cdwro430;
    }

    private final void read() {
        int i = 2 % 2;
        int i2 = RatingCompat + 77;
        MediaBrowserCompatMediaItem = i2 % Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            int i3 = r8lambdaNFVMNcWkEo3bw4nH1RXy5p2jM.read();
            int i4 = r8lambdaNFVMNcWkEo3bw4nH1RXy5p2jM.read();
            int i5 = r8lambdaNFVMNcWkEo3bw4nH1RXy5p2jM.read();
            ((PermissionViewModel) IconCompatParcelizer(-1356216200, r8lambdaNFVMNcWkEo3bw4nH1RXy5p2jM.read(), 1356216201, i3, i4, i5, new Object[]{this})).write();
            setResult(-1);
            finish();
            return;
        }
        int i6 = r8lambdaNFVMNcWkEo3bw4nH1RXy5p2jM.read();
        int i7 = r8lambdaNFVMNcWkEo3bw4nH1RXy5p2jM.read();
        int i8 = r8lambdaNFVMNcWkEo3bw4nH1RXy5p2jM.read();
        ((PermissionViewModel) IconCompatParcelizer(-1356216200, r8lambdaNFVMNcWkEo3bw4nH1RXy5p2jM.read(), 1356216201, i6, i7, i8, new Object[]{this})).write();
        setResult(-1);
        finish();
        int i9 = 66 / 0;
    }

    private final void serializer() {
        int i = 2 % 2;
        int i2 = RatingCompat + 121;
        MediaBrowserCompatMediaItem = i2 % Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            int i3 = r8lambdaNFVMNcWkEo3bw4nH1RXy5p2jM.read();
            int i4 = r8lambdaNFVMNcWkEo3bw4nH1RXy5p2jM.read();
            int i5 = r8lambdaNFVMNcWkEo3bw4nH1RXy5p2jM.read();
            ((PermissionViewModel) IconCompatParcelizer(-1356216200, r8lambdaNFVMNcWkEo3bw4nH1RXy5p2jM.read(), 1356216201, i3, i4, i5, new Object[]{this})).serializer();
            setResult(1);
        } else {
            int i6 = r8lambdaNFVMNcWkEo3bw4nH1RXy5p2jM.read();
            int i7 = r8lambdaNFVMNcWkEo3bw4nH1RXy5p2jM.read();
            int i8 = r8lambdaNFVMNcWkEo3bw4nH1RXy5p2jM.read();
            ((PermissionViewModel) IconCompatParcelizer(-1356216200, r8lambdaNFVMNcWkEo3bw4nH1RXy5p2jM.read(), 1356216201, i6, i7, i8, new Object[]{this})).serializer();
            setResult(0);
        }
        finish();
        int i9 = MediaBrowserCompatMediaItem + 113;
        RatingCompat = i9 % Fields.SpotShadowColor;
        if (i9 % 2 != 0) {
            int i10 = 33 / 0;
        }
    }

    private static /* synthetic */ Object RemoteActionCompatParcelizer(Object[] objArr) {
        NonFloatablePermissionActivity nonFloatablePermissionActivity = (NonFloatablePermissionActivity) objArr[0];
        getBitmapui_graphics getbitmapui_graphics = (getBitmapui_graphics) objArr[1];
        int i = 2 % 2;
        int i2 = RatingCompat + 95;
        MediaBrowserCompatMediaItem = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        getbitmapui_graphics.getClass();
        r8lambdaemFy31U51vpkzTvcuc2Cdwro430 r8lambdaemfy31u51vpkztvcuc2cdwro430RemoteActionCompatParcelizer = nonFloatablePermissionActivity.RemoteActionCompatParcelizer();
        Object objWrite = getbitmapui_graphics.write("permission_model_key");
        Object obj = null;
        if (objWrite == null) {
            ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer("kotlin.Unit");
            return null;
        }
        int i4 = MediaBrowserCompatMediaItem + 107;
        RatingCompat = i4 % Fields.SpotShadowColor;
        if (i4 % 2 == 0) {
            return ((r8lambdaoL9PFNVQ6zR8V_AeWUOaHE8gYho) r8lambdaemfy31u51vpkztvcuc2cdwro430RemoteActionCompatParcelizer).read((PermissionModel) objWrite);
        }
        ((r8lambdaoL9PFNVQ6zR8V_AeWUOaHE8gYho) r8lambdaemfy31u51vpkztvcuc2cdwro430RemoteActionCompatParcelizer).read((PermissionModel) objWrite);
        obj.hashCode();
        throw null;
    }

    @Override // com.ui.common.base.BaseInjectionActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        int i = 2 % 2;
        super.onCreate(bundle);
        int i2 = r8lambdaNFVMNcWkEo3bw4nH1RXy5p2jM.read();
        int i3 = r8lambdaNFVMNcWkEo3bw4nH1RXy5p2jM.read();
        int i4 = r8lambdaNFVMNcWkEo3bw4nH1RXy5p2jM.read();
        getLifecycle().IconCompatParcelizer(new r8lambdai5n2jdKJE1GWJ_iT_qA2nhTM0L0((PermissionViewModel) IconCompatParcelizer(-1356216200, r8lambdaNFVMNcWkEo3bw4nH1RXy5p2jM.read(), 1356216201, i2, i3, i4, new Object[]{this})));
        UtilsKt.write(this, new DragAndDropTargetModifierNode(new StringsKt__StringsKt$$ExternalSyntheticLambda1(6, this), true, -511688747));
        int i5 = MediaBrowserCompatMediaItem + 25;
        RatingCompat = i5 % Fields.SpotShadowColor;
        if (i5 % 2 != 0) {
            throw null;
        }
    }

    private static final createFromParcel serializer(NonFloatablePermissionActivity nonFloatablePermissionActivity, getBirthDateFull getbirthdatefull, int i) {
        int i2 = 2 % 2;
        boolean z = false;
        if ((i & 3) != 2) {
            int i3 = MediaBrowserCompatMediaItem + 9;
            RatingCompat = i3 % Fields.SpotShadowColor;
            if (i3 % 2 == 0) {
                z = true;
            }
        }
        getPostalCode getpostalcode = (getPostalCode) getbirthdatefull;
        if (!(!getpostalcode.write(i & 1, z))) {
            r8lambdaiNyw9kmcOm6XFew3Z44OoKHEsPU r8lambdainyw9kmcom6xfew3z44ookhespuIconCompatParcelizer = ((PermissionViewModel) IconCompatParcelizer(-1356216200, r8lambdaNFVMNcWkEo3bw4nH1RXy5p2jM.read(), 1356216201, r8lambdaNFVMNcWkEo3bw4nH1RXy5p2jM.read(), r8lambdaNFVMNcWkEo3bw4nH1RXy5p2jM.read(), r8lambdaNFVMNcWkEo3bw4nH1RXy5p2jM.read(), new Object[]{nonFloatablePermissionActivity})).IconCompatParcelizer();
            RgbCompanionExternalSyntheticLambda0 rgbCompanionExternalSyntheticLambda0Write = r8lambdainyw9kmcom6xfew3z44ookhespuIconCompatParcelizer.write();
            boolean zIconCompatParcelizer = getpostalcode.IconCompatParcelizer(nonFloatablePermissionActivity);
            Object objComponentActivity = getpostalcode.ComponentActivity();
            AndroidContentCaptureManager androidContentCaptureManager = getCreditCardExpirationMonth.write;
            if (zIconCompatParcelizer || objComponentActivity == androidContentCaptureManager) {
                objComponentActivity = new NafathModalContentKt$NafathModal$1$1(nonFloatablePermissionActivity, 24);
                getpostalcode.write(objComponentActivity);
            }
            r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k0 = (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) ((registerInAppMessageManagerlambda0) objComponentActivity);
            boolean zIconCompatParcelizer2 = getpostalcode.IconCompatParcelizer(nonFloatablePermissionActivity);
            Object objComponentActivity2 = getpostalcode.ComponentActivity();
            if (zIconCompatParcelizer2 || objComponentActivity2 == androidContentCaptureManager) {
                objComponentActivity2 = new NafathModalContentKt$NafathModal$1$1(nonFloatablePermissionActivity, 25);
                getpostalcode.write(objComponentActivity2);
            }
            getSuspendingTransactionContext.write(rgbCompanionExternalSyntheticLambda0Write, r8lambdardpfsr94j4iebcwx_kpqzpm8k0, null, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) ((registerInAppMessageManagerlambda0) objComponentActivity2), r8lambdainyw9kmcom6xfew3z44ookhespuIconCompatParcelizer.read(), getpostalcode, 8, 4);
        } else {
            getpostalcode.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
            int i4 = MediaBrowserCompatMediaItem + 71;
            RatingCompat = i4 % Fields.SpotShadowColor;
            int i5 = i4 % 2;
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

    private static final PermissionViewModel IconCompatParcelizer(NonFloatablePermissionActivity nonFloatablePermissionActivity, getBitmapui_graphics getbitmapui_graphics) {
        int i = r8lambdaNFVMNcWkEo3bw4nH1RXy5p2jM.read();
        int i2 = r8lambdaNFVMNcWkEo3bw4nH1RXy5p2jM.read();
        int i3 = r8lambdaNFVMNcWkEo3bw4nH1RXy5p2jM.read();
        return (PermissionViewModel) IconCompatParcelizer(1786043298, r8lambdaNFVMNcWkEo3bw4nH1RXy5p2jM.read(), -1786043298, i, i2, i3, new Object[]{nonFloatablePermissionActivity, getbitmapui_graphics});
    }

    private final PermissionViewModel write() {
        int i = r8lambdaNFVMNcWkEo3bw4nH1RXy5p2jM.read();
        int i2 = r8lambdaNFVMNcWkEo3bw4nH1RXy5p2jM.read();
        int i3 = r8lambdaNFVMNcWkEo3bw4nH1RXy5p2jM.read();
        return (PermissionViewModel) IconCompatParcelizer(-1356216200, r8lambdaNFVMNcWkEo3bw4nH1RXy5p2jM.read(), 1356216201, i, i2, i3, new Object[]{this});
    }
}
