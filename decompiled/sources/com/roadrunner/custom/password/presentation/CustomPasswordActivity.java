package com.roadrunner.custom.password.presentation;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import androidx.compose.runtime.GapComposer$$ExternalSyntheticLambda3;
import androidx.compose.ui.graphics.Fields;
import bo.app.f2$$ExternalSyntheticLambda4;
import coil3.ComponentRegistry$Builder;
import coil3.ExtrasKt;
import coil3.network.NetworkFetcher;
import coil3.util.UtilsKt;
import com.mapbox.maps.util.CoreGesturesHandler;
import com.mapbox.navigation.core.MapboxNavigation;
import com.ui.common.base.BaseInjectionActivity;
import o.ActionPropertyKey;
import o.AndroidContentCaptureManager;
import o.AndroidSqliteDriverCallback;
import o.DefaultContentCardsUpdateHandlerCompanionCREATOR1;
import o.DragAndDropTargetModifierNode;
import o.PopulateViewStructure_androidKtpopulate7;
import o.createFromParcel;
import o.displayInAppMessagelambda1;
import o.getBirthDateFull;
import o.getBitmapui_graphics;
import o.getCreditCardExpirationMonth;
import o.getPostalCode;
import o.getQueryContext;
import o.getThrottledCallbacksui;
import o.intersectsui;
import o.invalidateCallbacksFor;
import o.isTargetDrawnFirstui;
import o.onViewAttachedToWindow;
import o.onViewDetachedFromWindowlambda1;
import o.r8lambdaPeKEYuJNHtkCVLNkgf2Tg6F0GaM;
import o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0;
import o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM;
import o.registerInAppMessageManagerlambda0;
import o.registerOnRectChangedCallback;
import o.removeNodeAtDepth;

/* JADX INFO: loaded from: classes3.dex */
public final class CustomPasswordActivity extends BaseInjectionActivity {
    private static int MediaDescriptionCompat = 0;
    private static int RatingCompat = 1;

    @r8lambdaPeKEYuJNHtkCVLNkgf2Tg6F0GaM
    public intersectsui MediaBrowserCompatMediaItem;
    private final onViewDetachedFromWindowlambda1 MediaSessionCompatQueueItem = new ComponentRegistry$Builder(displayInAppMessagelambda1.serializer(CustomPasswordViewModel.class), new isTargetDrawnFirstui(this, 0), new AndroidSqliteDriverCallback(this, 2, new f2$$ExternalSyntheticLambda4(28, this)), new isTargetDrawnFirstui(this, 1));

    public static /* synthetic */ Object serializer(int i, int i2, int i3, int i4, int i5, Object[] objArr, int i6) {
        int i7 = ~i;
        int i8 = (~(i7 | i5)) | i6;
        int i9 = ~i6;
        int i10 = ~(i9 | i5 | i);
        int i11 = (~(i | i9)) | i5 | (~(i7 | i6));
        int i12 = i5 + i6 + i2 + ((-381402339) * i3) + ((-2062754392) * i4);
        int i13 = i12 * i12;
        int i14 = (1317609343 * i5) + 1063714816 + (1288888451 * i6) + (i8 * 14360446) + (14360446 * i10) + ((-14360446) * i11) + (1303248896 * i2) + (1454768128 * i3) + (808452096 * i4) + ((-1790509056) * i13);
        int i15 = ((i5 * (-1355236691)) - 921838429) + (i6 * (-1355236103)) + (i8 * (-294)) + (i10 * (-294)) + (i11 * 294) + (i2 * (-1355236397)) + (i3 * (-1583251481)) + (i4 * 1682205048) + (i13 * (-427491328));
        return i14 + ((i15 * i15) * 844169216) != 1 ? read(objArr) : write(objArr);
    }

    private static final createFromParcel RemoteActionCompatParcelizer() {
        int i = 2 % 2;
        int i2 = MediaDescriptionCompat + 51;
        RatingCompat = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        createFromParcel createfromparcel = createFromParcel.INSTANCE;
        int i4 = MediaDescriptionCompat + 103;
        RatingCompat = i4 % Fields.SpotShadowColor;
        if (i4 % 2 != 0) {
            return createfromparcel;
        }
        throw null;
    }

    public static final /* synthetic */ void serializer(CustomPasswordActivity customPasswordActivity, String str) {
        int i = 2 % 2;
        int i2 = MediaDescriptionCompat + 27;
        RatingCompat = i2 % Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            serializer(CoreGesturesHandler.IconCompatParcelizer(), CoreGesturesHandler.IconCompatParcelizer(), CoreGesturesHandler.IconCompatParcelizer(), CoreGesturesHandler.IconCompatParcelizer(), 838341232, new Object[]{customPasswordActivity, str}, -838341231);
            return;
        }
        serializer(CoreGesturesHandler.IconCompatParcelizer(), CoreGesturesHandler.IconCompatParcelizer(), CoreGesturesHandler.IconCompatParcelizer(), CoreGesturesHandler.IconCompatParcelizer(), 838341232, new Object[]{customPasswordActivity, str}, -838341231);
        int i3 = 89 / 0;
    }

    public static /* synthetic */ CustomPasswordViewModel RemoteActionCompatParcelizer(CustomPasswordActivity customPasswordActivity, getBitmapui_graphics getbitmapui_graphics) {
        CustomPasswordViewModel customPasswordViewModelIconCompatParcelizer;
        int i = 2 % 2;
        int i2 = MediaDescriptionCompat + 33;
        RatingCompat = i2 % Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            customPasswordViewModelIconCompatParcelizer = IconCompatParcelizer(customPasswordActivity, getbitmapui_graphics);
            int i3 = 73 / 0;
        } else {
            customPasswordViewModelIconCompatParcelizer = IconCompatParcelizer(customPasswordActivity, getbitmapui_graphics);
        }
        int i4 = MediaDescriptionCompat + 63;
        RatingCompat = i4 % Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return customPasswordViewModelIconCompatParcelizer;
    }

    private static /* synthetic */ Object read(Object[] objArr) {
        CustomPasswordActivity customPasswordActivity = (CustomPasswordActivity) objArr[0];
        getBirthDateFull getbirthdatefull = (getBirthDateFull) objArr[1];
        int iIntValue = ((Number) objArr[2]).intValue();
        int i = 2 % 2;
        int i2 = MediaDescriptionCompat + 101;
        RatingCompat = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        createFromParcel createfromparcelSerializer = serializer(customPasswordActivity, getbirthdatefull, iIntValue);
        int i4 = MediaDescriptionCompat + 55;
        RatingCompat = i4 % Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return createfromparcelSerializer;
    }

    public static /* synthetic */ createFromParcel read() {
        int i = 2 % 2;
        int i2 = MediaDescriptionCompat + 93;
        RatingCompat = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        createFromParcel createfromparcelRemoteActionCompatParcelizer = RemoteActionCompatParcelizer();
        int i4 = MediaDescriptionCompat + 79;
        RatingCompat = i4 % Fields.SpotShadowColor;
        if (i4 % 2 == 0) {
            int i5 = 78 / 0;
        }
        return createfromparcelRemoteActionCompatParcelizer;
    }

    private static final invalidateCallbacksFor read(onViewAttachedToWindow onviewattachedtowindow) {
        int i = 2 % 2;
        int i2 = MediaDescriptionCompat + 83;
        RatingCompat = i2 % Fields.SpotShadowColor;
        Object obj = null;
        if (i2 % 2 == 0) {
            obj.hashCode();
            throw null;
        }
        invalidateCallbacksFor invalidatecallbacksfor = (invalidateCallbacksFor) onviewattachedtowindow.getValue();
        int i3 = MediaDescriptionCompat + 99;
        RatingCompat = i3 % Fields.SpotShadowColor;
        if (i3 % 2 != 0) {
            return invalidatecallbacksfor;
        }
        throw null;
    }

    private final CustomPasswordViewModel write() {
        int i = 2 % 2;
        int i2 = RatingCompat + 5;
        MediaDescriptionCompat = i2 % Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            throw null;
        }
        CustomPasswordViewModel customPasswordViewModel = (CustomPasswordViewModel) this.MediaSessionCompatQueueItem.MediaSessionCompatResultReceiverWrapper();
        int i3 = RatingCompat + 31;
        MediaDescriptionCompat = i3 % Fields.SpotShadowColor;
        int i4 = i3 % 2;
        return customPasswordViewModel;
    }

    public final intersectsui serializer() {
        int i = 2 % 2;
        intersectsui intersectsuiVar = this.MediaBrowserCompatMediaItem;
        Object obj = null;
        if (intersectsuiVar == null) {
            removeNodeAtDepth.serializer("viewModelProviderFactory");
            throw null;
        }
        int i2 = RatingCompat + 21;
        int i3 = i2 % Fields.SpotShadowColor;
        MediaDescriptionCompat = i3;
        if (i2 % 2 != 0) {
            obj.hashCode();
            throw null;
        }
        int i4 = i3 + 73;
        RatingCompat = i4 % Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return intersectsuiVar;
    }

    private static final CustomPasswordViewModel IconCompatParcelizer(CustomPasswordActivity customPasswordActivity, getBitmapui_graphics getbitmapui_graphics) {
        int i = 2 % 2;
        int i2 = MediaDescriptionCompat + 19;
        RatingCompat = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        getbitmapui_graphics.getClass();
        CustomPasswordViewModel customPasswordViewModelSerializer = ((getThrottledCallbacksui) customPasswordActivity.serializer()).serializer(getbitmapui_graphics);
        int i4 = MediaDescriptionCompat + 69;
        RatingCompat = i4 % Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return customPasswordViewModelSerializer;
    }

    private static /* synthetic */ Object write(Object[] objArr) {
        CustomPasswordActivity customPasswordActivity = (CustomPasswordActivity) objArr[0];
        String str = (String) objArr[1];
        int i = 2 % 2;
        Intent intent = new Intent();
        intent.putExtra("result_pass", str);
        customPasswordActivity.setResult(-1, intent);
        customPasswordActivity.finish();
        int i2 = MediaDescriptionCompat + 109;
        RatingCompat = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        return null;
    }

    @Override // com.ui.common.base.BaseInjectionActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        int i = 2 % 2;
        super.onCreate(bundle);
        UtilsKt.write(this, new DragAndDropTargetModifierNode(new GapComposer$$ExternalSyntheticLambda3(13, this), true, 1149748118));
        int i2 = MediaDescriptionCompat + 97;
        RatingCompat = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
    }

    /* JADX WARN: Code duplicated, block: B:12:0x005f  */
    /* JADX WARN: Code duplicated, block: B:21:0x008a  */
    private static final createFromParcel serializer(CustomPasswordActivity customPasswordActivity, getBirthDateFull getbirthdatefull, int i) {
        int i2 = 2 % 2;
        int i3 = RatingCompat + 119;
        MediaDescriptionCompat = i3 % Fields.SpotShadowColor;
        int i4 = i3 % 2;
        getPostalCode getpostalcode = (getPostalCode) getbirthdatefull;
        if (getpostalcode.write(i & 1, (i & 3) != 2)) {
            int i5 = MediaDescriptionCompat + 7;
            RatingCompat = i5 % Fields.SpotShadowColor;
            int i6 = i5 % 2;
            PopulateViewStructure_androidKtpopulate7 populateViewStructure_androidKtpopulate7Write = ExtrasKt.write(customPasswordActivity.write().IconCompatParcelizer(), getpostalcode, 0);
            getQueryContext getquerycontextSerializer = customPasswordActivity.write().serializer();
            invalidateCallbacksFor invalidatecallbacksfor = read(populateViewStructure_androidKtpopulate7Write);
            CustomPasswordViewModel customPasswordViewModelWrite = customPasswordActivity.write();
            boolean zIconCompatParcelizer = getpostalcode.IconCompatParcelizer(customPasswordViewModelWrite);
            Object objComponentActivity = getpostalcode.ComponentActivity();
            AndroidContentCaptureManager androidContentCaptureManager = getCreditCardExpirationMonth.write;
            if (zIconCompatParcelizer) {
                objComponentActivity = new NetworkFetcher.AnonymousClass2(customPasswordViewModelWrite);
                getpostalcode.write(objComponentActivity);
            } else {
                int i7 = RatingCompat + 95;
                MediaDescriptionCompat = i7 % Fields.SpotShadowColor;
                int i8 = i7 % 2;
                if (objComponentActivity == androidContentCaptureManager) {
                    objComponentActivity = new NetworkFetcher.AnonymousClass2(customPasswordViewModelWrite);
                    getpostalcode.write(objComponentActivity);
                }
            }
            registerInAppMessageManagerlambda0 registerinappmessagemanagerlambda0 = (registerInAppMessageManagerlambda0) objComponentActivity;
            CustomPasswordViewModel customPasswordViewModelWrite2 = customPasswordActivity.write();
            boolean zIconCompatParcelizer2 = getpostalcode.IconCompatParcelizer(customPasswordViewModelWrite2);
            Object objComponentActivity2 = getpostalcode.ComponentActivity();
            if (zIconCompatParcelizer2) {
                objComponentActivity2 = new MapboxNavigation.AnonymousClass15(customPasswordViewModelWrite2, 9);
                getpostalcode.write(objComponentActivity2);
            } else {
                int i9 = RatingCompat + 113;
                MediaDescriptionCompat = i9 % Fields.SpotShadowColor;
                if (i9 % 2 != 0) {
                    Object obj = null;
                    obj.hashCode();
                    throw null;
                }
                if (objComponentActivity2 == androidContentCaptureManager) {
                    objComponentActivity2 = new MapboxNavigation.AnonymousClass15(customPasswordViewModelWrite2, 9);
                    getpostalcode.write(objComponentActivity2);
                }
            }
            registerInAppMessageManagerlambda0 registerinappmessagemanagerlambda1 = (registerInAppMessageManagerlambda0) objComponentActivity2;
            boolean zIconCompatParcelizer3 = getpostalcode.IconCompatParcelizer(customPasswordActivity);
            Object objComponentActivity3 = getpostalcode.ComponentActivity();
            if (zIconCompatParcelizer3 || objComponentActivity3 == androidContentCaptureManager) {
                objComponentActivity3 = new NetworkFetcher.AnonymousClass2(customPasswordActivity);
                getpostalcode.write(objComponentActivity3);
            }
            registerInAppMessageManagerlambda0 registerinappmessagemanagerlambda2 = (registerInAppMessageManagerlambda0) objComponentActivity3;
            CustomPasswordViewModel customPasswordViewModelWrite3 = customPasswordActivity.write();
            boolean zIconCompatParcelizer4 = getpostalcode.IconCompatParcelizer(customPasswordViewModelWrite3);
            Object objComponentActivity4 = getpostalcode.ComponentActivity();
            if (!(!zIconCompatParcelizer4) || objComponentActivity4 == androidContentCaptureManager) {
                objComponentActivity4 = new MapboxNavigation.AnonymousClass15(customPasswordViewModelWrite3, 10);
                getpostalcode.write(objComponentActivity4);
                int i10 = MediaDescriptionCompat + 17;
                RatingCompat = i10 % Fields.SpotShadowColor;
                int i11 = i10 % 2;
            }
            registerOnRectChangedCallback.read(getquerycontextSerializer, invalidatecallbacksfor, (r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) registerinappmessagemanagerlambda0, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) ((registerInAppMessageManagerlambda0) objComponentActivity4), (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) registerinappmessagemanagerlambda1, (r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) registerinappmessagemanagerlambda2, null, getpostalcode, 8);
            Object objComponentActivity5 = getpostalcode.ComponentActivity();
            if (objComponentActivity5 == androidContentCaptureManager) {
                objComponentActivity5 = new ActionPropertyKey(14);
                getpostalcode.write(objComponentActivity5);
                int i12 = RatingCompat + 15;
                MediaDescriptionCompat = i12 % Fields.SpotShadowColor;
                int i13 = i12 % 2;
            }
            DefaultContentCardsUpdateHandlerCompanionCREATOR1.IconCompatParcelizer(false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) objComponentActivity5, getpostalcode, 48, 1);
        } else {
            getpostalcode.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
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

    private final void serializer(String str) {
        serializer(CoreGesturesHandler.IconCompatParcelizer(), CoreGesturesHandler.IconCompatParcelizer(), CoreGesturesHandler.IconCompatParcelizer(), CoreGesturesHandler.IconCompatParcelizer(), 838341232, new Object[]{this, str}, -838341231);
    }

    public static /* synthetic */ createFromParcel RemoteActionCompatParcelizer(CustomPasswordActivity customPasswordActivity, getBirthDateFull getbirthdatefull, int i) {
        return (createFromParcel) serializer(CoreGesturesHandler.IconCompatParcelizer(), CoreGesturesHandler.IconCompatParcelizer(), CoreGesturesHandler.IconCompatParcelizer(), CoreGesturesHandler.IconCompatParcelizer(), 1860143065, new Object[]{customPasswordActivity, getbirthdatefull, Integer.valueOf(i)}, -1860143065);
    }
}
