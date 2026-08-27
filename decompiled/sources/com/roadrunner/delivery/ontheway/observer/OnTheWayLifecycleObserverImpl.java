package com.roadrunner.delivery.ontheway.observer;

import android.os.Build;
import androidx.activity.result.ActivityResultRegistry;
import androidx.appcompat.app.AppCompatActivity;
import androidx.compose.ui.graphics.Fields;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.DefaultLifecycleObserver;
import com.foodora.courier.main.presentation.MainActivity;
import com.mapbox.navigation.voice.api.MapboxVoiceInstructionsPlayer$Companion$$ExternalSyntheticLambda0;
import com.mapbox.navigator.R;
import com.roadrunner.heatmap.presentation.HeatmapMapLayerUiModelImpl$1;
import com.roadrunner.logger.logger.perseus.PerseusInitializerImpl$$ExternalSyntheticLambda0;
import com.roadrunner.permission.api.model.PermissionModel;
import com.roadrunner.remoteconfig.firebase.FirebaseRemoteConfigImpl;
import kotlinx.coroutines.BuildersKt;
import o.BrazeExternalSyntheticLambda206;
import o.EmojiCompatStatusDelegate;
import o.LineBreakStrategyCompanion;
import o.ShortNewsContentCardView;
import o.TextDrawStyleKt;
import o.accessisRenderNodeCompatiblecp;
import o.mergelambda0;
import o.onBackPressed;
import o.r8lambda60pWJrJ_IeYyPZNB7guGmuaMR08;
import o.r8lambda93nPh_UiO6LLly5QJWhviIL_k;
import o.r8lambdaEKYmoxV_2C6WlKkhZt5ThO0_YA;
import o.removeSingleSubscriptionlambda101;
import o.resolveLineHeightInPxo2QH7mI;
import o.setFirstVerticalBias;
import o.setHorizontalStyle;
import o.setLastVerticalBias;
import o.setRoundRectOutlineTNW_H78default;
import o.supportsColorMatrixQuery;
import o.toBitmapConfig1JJdX4A;
import o.updateAdidI;

/* JADX INFO: loaded from: classes3.dex */
public final class OnTheWayLifecycleObserverImpl implements DefaultLifecycleObserver {
    private static int MediaBrowserCompatMediaItem = 0;
    private static int RatingCompat = 1;
    public final Object IconCompatParcelizer;
    public final Object MediaSessionCompatQueueItem;
    public final /* synthetic */ int RemoteActionCompatParcelizer;
    public final Object read;
    public final Object serializer;
    public final Object write;

    public OnTheWayLifecycleObserverImpl(AppCompatActivity appCompatActivity, EmojiCompatStatusDelegate emojiCompatStatusDelegate, resolveLineHeightInPxo2QH7mI resolvelineheightinpxo2qh7mi, LineBreakStrategyCompanion lineBreakStrategyCompanion, mergelambda0 mergelambda0Var) {
        this.RemoteActionCompatParcelizer = 0;
        appCompatActivity.getClass();
        emojiCompatStatusDelegate.getClass();
        resolvelineheightinpxo2qh7mi.getClass();
        lineBreakStrategyCompanion.getClass();
        mergelambda0Var.getClass();
        this.write = appCompatActivity;
        this.read = emojiCompatStatusDelegate;
        this.IconCompatParcelizer = resolvelineheightinpxo2qh7mi;
        this.serializer = lineBreakStrategyCompanion;
        this.MediaSessionCompatQueueItem = mergelambda0Var;
    }

    public OnTheWayLifecycleObserverImpl(MainActivity mainActivity, setHorizontalStyle sethorizontalstyle, setLastVerticalBias setlastverticalbias, setFirstVerticalBias setfirstverticalbias, setRoundRectOutlineTNW_H78default setroundrectoutlinetnw_h78default, removeSingleSubscriptionlambda101 removesinglesubscriptionlambda101) {
        this.RemoteActionCompatParcelizer = 1;
        this.write = mainActivity;
        this.read = sethorizontalstyle;
        this.IconCompatParcelizer = setlastverticalbias;
        this.serializer = setfirstverticalbias;
        this.MediaSessionCompatQueueItem = removesinglesubscriptionlambda101;
    }

    public OnTheWayLifecycleObserverImpl(r8lambda93nPh_UiO6LLly5QJWhviIL_k r8lambda93nph_uio6llly5qjwhviil_k, r8lambdaEKYmoxV_2C6WlKkhZt5ThO0_YA r8lambdaekymoxv_2c6wlkkhzt5tho0_ya, FragmentActivity fragmentActivity, ActivityResultRegistry activityResultRegistry, PermissionModel permissionModel) {
        this.RemoteActionCompatParcelizer = 3;
        this.write = r8lambda93nph_uio6llly5qjwhviil_k;
        this.read = r8lambdaekymoxv_2c6wlkkhzt5tho0_ya;
        this.IconCompatParcelizer = fragmentActivity;
        this.serializer = activityResultRegistry;
        this.MediaSessionCompatQueueItem = permissionModel;
    }

    public OnTheWayLifecycleObserverImpl(r8lambda93nPh_UiO6LLly5QJWhviIL_k r8lambda93nph_uio6llly5qjwhviil_k, r8lambdaEKYmoxV_2C6WlKkhZt5ThO0_YA r8lambdaekymoxv_2c6wlkkhzt5tho0_ya, BrazeExternalSyntheticLambda206 brazeExternalSyntheticLambda206, MainActivity mainActivity) {
        this.RemoteActionCompatParcelizer = 2;
        this.write = r8lambda93nph_uio6llly5qjwhviil_k;
        this.read = r8lambdaekymoxv_2c6wlkkhzt5tho0_ya;
        this.IconCompatParcelizer = brazeExternalSyntheticLambda206;
        this.serializer = mainActivity;
        this.MediaSessionCompatQueueItem = new PermissionModel(r8lambda60pWJrJ_IeYyPZNB7guGmuaMR08.BLUETOOTH_SCAN, true);
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final void onCreate(accessisRenderNodeCompatiblecp accessisrendernodecompatiblecp) {
        int i = 2 % 2;
        int i2 = RatingCompat + 45;
        MediaBrowserCompatMediaItem = i2 % Fields.SpotShadowColor;
        ShortNewsContentCardView shortNewsContentCardView = null;
        if (i2 % 2 != 0) {
            shortNewsContentCardView.hashCode();
            throw null;
        }
        int i3 = this.RemoteActionCompatParcelizer;
        Object obj = this.serializer;
        Object obj2 = this.MediaSessionCompatQueueItem;
        Object obj3 = this.write;
        Object obj4 = this.IconCompatParcelizer;
        Object obj5 = this.read;
        if (i3 == 0) {
            accessisrendernodecompatiblecp.getClass();
            supportsColorMatrixQuery lifecycle = accessisrendernodecompatiblecp.getLifecycle();
            lifecycle.IconCompatParcelizer((EmojiCompatStatusDelegate) obj5);
            lifecycle.IconCompatParcelizer((resolveLineHeightInPxo2QH7mI) obj4);
            lifecycle.IconCompatParcelizer((LineBreakStrategyCompanion) obj);
            ((mergelambda0) obj2).getClass();
            ((AppCompatActivity) obj3).getClass();
            lifecycle.IconCompatParcelizer(new TextDrawStyleKt());
            return;
        }
        if (i3 == 1) {
            MainActivity mainActivity = (MainActivity) obj3;
            accessisrendernodecompatiblecp.getClass();
            if (!(!((setHorizontalStyle) obj5).RemoteActionCompatParcelizer()) && ((FirebaseRemoteConfigImpl) ((setLastVerticalBias) obj4).RemoteActionCompatParcelizer).IconCompatParcelizer(updateAdidI.IS_DARK_MODE_DISCOVERY_DIALOG_ENABLED)) {
                mainActivity.getSupportFragmentManager().read("dark_mode_discovery_result", mainActivity, new PerseusInitializerImpl$$ExternalSyntheticLambda0(15, this));
                BuildersKt.RemoteActionCompatParcelizer(toBitmapConfig1JJdX4A.read(accessisrendernodecompatiblecp.getLifecycle()), null, null, new HeatmapMapLayerUiModelImpl$1(accessisrendernodecompatiblecp, this, shortNewsContentCardView, 19), 3);
            }
            int i4 = MediaBrowserCompatMediaItem + 121;
            RatingCompat = i4 % Fields.SpotShadowColor;
            if (i4 % 2 == 0) {
                throw null;
            }
            return;
        }
        if (i3 != 2) {
            accessisrendernodecompatiblecp.getClass();
            super.onCreate(accessisrendernodecompatiblecp);
            PermissionModel permissionModel = (PermissionModel) obj2;
            if (((r8lambdaEKYmoxV_2C6WlKkhZt5ThO0_YA) obj5).read(permissionModel.IconCompatParcelizer, (FragmentActivity) obj4)) {
                return;
            }
            onBackPressed onbackpressedRegister = ((ActivityResultRegistry) obj).register("notification_permission_launch_activity", accessisrendernodecompatiblecp, ((r8lambda93nPh_UiO6LLly5QJWhviIL_k) obj3).write, new MapboxVoiceInstructionsPlayer$Companion$$ExternalSyntheticLambda0(10));
            onbackpressedRegister.getClass();
            onbackpressedRegister.write(permissionModel);
            return;
        }
        MainActivity mainActivity2 = (MainActivity) obj;
        PermissionModel permissionModel2 = (PermissionModel) obj2;
        accessisrendernodecompatiblecp.getClass();
        super.onCreate(accessisrendernodecompatiblecp);
        BrazeExternalSyntheticLambda206 brazeExternalSyntheticLambda206 = (BrazeExternalSyntheticLambda206) obj4;
        if (Build.VERSION.SDK_INT >= 31) {
            FirebaseRemoteConfigImpl firebaseRemoteConfigImpl = (FirebaseRemoteConfigImpl) brazeExternalSyntheticLambda206.RemoteActionCompatParcelizer;
            firebaseRemoteConfigImpl.getClass();
            Object[] objArr = {firebaseRemoteConfigImpl, updateAdidI.IS_GODROID_BLE_SCANNING_ENABLED};
            if (!((Boolean) FirebaseRemoteConfigImpl.RemoteActionCompatParcelizer(1762727223, R.serializer(), R.serializer(), -1762727220, R.serializer(), R.serializer(), objArr)).booleanValue()) {
                return;
            }
            int i5 = RatingCompat + 45;
            MediaBrowserCompatMediaItem = i5 % Fields.SpotShadowColor;
            int i6 = i5 % 2;
            if (((r8lambdaEKYmoxV_2C6WlKkhZt5ThO0_YA) obj5).read(permissionModel2.IconCompatParcelizer, mainActivity2)) {
                return;
            }
            onBackPressed onbackpressedRegister2 = mainActivity2.getActivityResultRegistry().register("bluetooth_scan_launch_activity", accessisrendernodecompatiblecp, ((r8lambda93nPh_UiO6LLly5QJWhviIL_k) obj3).write, new MapboxVoiceInstructionsPlayer$Companion$$ExternalSyntheticLambda0(10));
            onbackpressedRegister2.getClass();
            onbackpressedRegister2.write(permissionModel2);
        }
    }
}
