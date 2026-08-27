package com.roadrunner.helpcenter.presentation.activity;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Bundle;
import android.util.Base64;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.ValueCallback;
import android.webkit.WebChromeClient;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.FrameLayout;
import androidx.activity.OnBackPressedCallback;
import androidx.activity.result.ActivityResult;
import androidx.activity.result.ActivityResultRegistry;
import androidx.compose.ui.graphics.Fields;
import bo.app.af$$ExternalSyntheticOutline0;
import coil3.ComponentRegistry$Builder;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import com.logistics.rider.glovo.R;
import com.mapbox.navigation.voice.api.MapboxVoiceInstructionsPlayer$Companion$$ExternalSyntheticLambda0;
import com.roadrunner.helpcenter.businessmetrics.BusinessMetricsTracker;
import com.roadrunner.home.nest.divider.DividerUiModelImpl$1;
import com.roadrunner.permission.api.model.PermissionModel;
import com.roadrunner.remoteconfig.firebase.FirebaseRemoteConfigImpl;
import com.ui.common.base.BaseInjectionActivity;
import com.ui.common.widget.LoadingDialogFullScreen;
import com.ui.common.widget.ThrottledButton$$ExternalSyntheticLambda0;
import io.grpc.internal.CallTracer;
import java.io.File;
import java.nio.charset.StandardCharsets;
import java.util.WeakHashMap;
import kotlin.LazyKt__LazyJVMKt;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.DelayKt;
import o.ActualSweepGradientShader9KIMszo;
import o.AndroidSqliteDriverCallback;
import o.ComposableSingletonsAndroidDialog_androidKtlambda2101488961;
import o.DialogFragment4;
import o.EnumColumnAdapter;
import o.FocusPropertiesNode;
import o.FocusRequesterModifierKt;
import o.accessgetCancelcp;
import o.accessgetOldDependencyp;
import o.createFromParcel;
import o.ddefault;
import o.defaultViewModelProviderFactory_delegatelambda0;
import o.deleteRegisteredGeofenceCacheandroid_sdk_base_release;
import o.displayInAppMessagelambda1;
import o.div7Ah8Wj8;
import o.enableVerboseLogging;
import o.executeAsList;
import o.getBitmapui_graphics;
import o.getExitAnim;
import o.getExitTransition;
import o.getHost;
import o.getLoaderManager;
import o.getMinimumMaxLifecycleState;
import o.getNextTransition;
import o.getParentFragment;
import o.getParentFragmentManager;
import o.getPopDirection;
import o.getPopEnterAnim;
import o.getPopExitAnim;
import o.getPostOnViewCreatedAlpha;
import o.getReenterTransition;
import o.getRestLineXSAIIZE;
import o.getRetainInstance;
import o.getReturnTransition;
import o.getSharedElementEnterTransition;
import o.getSharedElementReturnTransition;
import o.getSharedElementSourceNames;
import o.getTargetRequestCode;
import o.hideCurrentlyDisplayingInAppMessage;
import o.inRing;
import o.invokeSuspendcomroadrunnercustomerchatselfservicedataimageImageCacheResolverImplcacheImageFile2;
import o.invokeSuspendcomroadrunnerremoteconfigfirebaseanalyticsFirebaseFlagLoggerImpllogTrackedFirebaseFlags111;
import o.isAdapterPositionOnScreen;
import o.onBackPressed;
import o.onPictureInPictureModeChanged;
import o.onTouch;
import o.onViewDetachedFromWindowlambda1;
import o.r8lambda2vBtwyPX8g68gaqnZ343rZwzI;
import o.r8lambda60pWJrJ_IeYyPZNB7guGmuaMR08;
import o.r8lambdaBtq4C7Gm1QxfvCp_VmH0bvXHTU;
import o.r8lambdaD96myUSzBh8SDkhp_7hY_RGQMM;
import o.r8lambdaPeKEYuJNHtkCVLNkgf2Tg6F0GaM;
import o.r8lambdafvzP3Wky1RLLzE56uVXaMHcvU;
import o.r8lambdawmxPERJX66sfUc7BfHYWeVjHcwo;
import o.recordInternal;
import o.recreateDisplayListIfNeeded;
import o.removeNodeAtDepth;
import o.resetOutlineParams;
import o.resetTransientState;
import o.scheduleDebounceCallback;
import o.setCarryoverInAppMessage;
import o.setRight;
import o.setType;
import o.setVerticalAlign;
import o.sourceInformationContextOfdefault;
import o.supportsColorMatrixQuery;
import o.times7Ah8Wj8;
import o.toBitmapConfig1JJdX4A;
import o.transferSessionPackageI;
import o.updateAdidI;
import timber.log.Timber;

/* JADX INFO: loaded from: classes3.dex */
public final class HelpCenterActivity extends BaseInjectionActivity implements getPopEnterAnim, scheduleDebounceCallback {
    public static final getParentFragment RatingCompat;
    private static byte r8lambdag6d1IyBXWIL5aeSAzXsZMVuYCQs = 0;
    private static int r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28 = 0;
    private static int r8lambdavCwjfXDiSGcirCy4I008VOiJ_lw = 1;
    private static int r8lambdawJ5MHcSJed_CjC7r4OWD0UxyJsQ = 0;
    private static int r8lambdayPQlaAoRiYRJ3IY_TqzUUTrVH0 = 1;
    private Uri ComponentActivity;

    @r8lambdaPeKEYuJNHtkCVLNkgf2Tg6F0GaM
    public recordInternal MediaBrowserCompatMediaItem;

    @r8lambdaPeKEYuJNHtkCVLNkgf2Tg6F0GaM
    public BusinessMetricsTracker MediaDescriptionCompat;

    @r8lambdaPeKEYuJNHtkCVLNkgf2Tg6F0GaM
    public accessgetOldDependencyp MediaSessionCompatQueueItem;

    @r8lambdaPeKEYuJNHtkCVLNkgf2Tg6F0GaM
    public inRing MediaSessionCompatResultReceiverWrapper;

    @r8lambdaPeKEYuJNHtkCVLNkgf2Tg6F0GaM
    public resetOutlineParams MediaSessionCompatToken;

    @r8lambdaPeKEYuJNHtkCVLNkgf2Tg6F0GaM
    public setVerticalAlign ParcelableVolumeInfo;

    @r8lambdaPeKEYuJNHtkCVLNkgf2Tg6F0GaM
    public getPopExitAnim PlaybackStateCompat;

    @r8lambdaPeKEYuJNHtkCVLNkgf2Tg6F0GaM
    public getRestLineXSAIIZE PlaybackStateCompatCustomAction;
    private DialogFragment4 ResultReceiver;

    @r8lambdaPeKEYuJNHtkCVLNkgf2Tg6F0GaM
    public transferSessionPackageI r8lambda54BeH8ZsBru0CXI2CCSP2syNys;

    @r8lambdaPeKEYuJNHtkCVLNkgf2Tg6F0GaM
    public r8lambdawmxPERJX66sfUc7BfHYWeVjHcwo r8lambda7IJBVrN0sHyidCAZufWEJFc7yY;
    private final onBackPressed r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus;
    private final onViewDetachedFromWindowlambda1 r8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss;
    private r8lambda2vBtwyPX8g68gaqnZ343rZwzI r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg;
    private final resetTransientState r8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8 = DelayKt.serializer(new invokeSuspendcomroadrunnercustomerchatselfservicedataimageImageCacheResolverImplcacheImageFile2(21));
    private final onBackPressed r8lambdaXj9c8VIP9DfEvaTmZt0ejAuC4a4;
    private ValueCallback<Uri[]> r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM;

    public static /* synthetic */ Object IconCompatParcelizer(int i, int i2, int i3, int i4, int i5, int i6, Object[] objArr) throws NoSuchMethodException {
        int i7 = ~i6;
        int i8 = ~i4;
        int i9 = (~(i7 | i8)) | (~(i7 | i5)) | (~(i8 | i5));
        int i10 = ~(i4 | i7);
        int i11 = i5 | i10 | (~(i8 | i6));
        int i12 = i5 + i6 + i3 + (1997535707 * i2) + (1930545336 * i);
        int i13 = i12 * i12;
        int i14 = ((-1352905585) * i5) + 1468203008 + ((-417352845) * i6) + (i9 * 1679707278) + (1679707278 * i10) + ((-1679707278) * i11) + (1262354432 * i3) + ((-1408630784) * i2) + ((-2070937600) * i) + (392888320 * i13);
        int i15 = (i5 * (-2054695253)) + 138751921 + (i6 * (-2054693473)) + (i9 * (-890)) + (i10 * (-890)) + (i11 * 890) + (i3 * (-2054694363)) + (i2 * 1502648999) + (i * 931574424) + (i13 * (-2139684864));
        switch (i14 + (i15 * i15 * (-174260224))) {
            case 1:
                return serializer(objArr);
            case 2:
                HelpCenterActivity helpCenterActivity = (HelpCenterActivity) objArr[0];
                boolean zBooleanValue = ((Boolean) objArr[1]).booleanValue();
                int i16 = 2 % 2;
                int i17 = r8lambdayPQlaAoRiYRJ3IY_TqzUUTrVH0 + 33;
                r8lambdawJ5MHcSJed_CjC7r4OWD0UxyJsQ = i17 % Fields.SpotShadowColor;
                int i18 = i17 % 2;
                helpCenterActivity.IconCompatParcelizer(zBooleanValue);
                int i19 = r8lambdawJ5MHcSJed_CjC7r4OWD0UxyJsQ + 7;
                r8lambdayPQlaAoRiYRJ3IY_TqzUUTrVH0 = i19 % Fields.SpotShadowColor;
                int i20 = i19 % 2;
                return null;
            case 3:
                return read(objArr);
            case 4:
                return RemoteActionCompatParcelizer(objArr);
            case 5:
                return write(objArr);
            case 6:
                return RatingCompat(objArr);
            case 7:
                return MediaBrowserCompatMediaItem(objArr);
            case 8:
                HelpCenterActivity helpCenterActivity2 = (HelpCenterActivity) objArr[0];
                int i21 = 2 % 2;
                int i22 = r8lambdawJ5MHcSJed_CjC7r4OWD0UxyJsQ + 67;
                r8lambdayPQlaAoRiYRJ3IY_TqzUUTrVH0 = i22 % Fields.SpotShadowColor;
                int i23 = i22 % 2;
                supportsColorMatrixQuery lifecycle = helpCenterActivity2.getLifecycle();
                int i24 = sourceInformationContextOfdefault.read();
                int length = ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.abc_menu_sym_shortcut_label).substring(0, 1).length() - 126482271;
                lifecycle.IconCompatParcelizer(((CallTracer) ((getRestLineXSAIIZE) IconCompatParcelizer(((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.accept_screen_product_item).substring(0, 4).length() + 978986530, (-721013897) + ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion, length, i24, 1147907538, -1147907533, new Object[]{helpCenterActivity2}))).serializer(helpCenterActivity2));
                int i25 = r8lambdayPQlaAoRiYRJ3IY_TqzUUTrVH0 + 97;
                r8lambdawJ5MHcSJed_CjC7r4OWD0UxyJsQ = i25 % Fields.SpotShadowColor;
                int i26 = i25 % 2;
                return null;
            case 9:
                return MediaMetadataCompat(objArr);
            case 10:
                return MediaDescriptionCompat(objArr);
            case 11:
                return MediaSessionCompatQueueItem(objArr);
            case 12:
                HelpCenterActivity helpCenterActivity3 = (HelpCenterActivity) objArr[0];
                int i27 = 2 % 2;
                ((getBitmapui_graphics) objArr[1]).getClass();
                getLoaderManager getloadermanagerSerializer = ((getParentFragmentManager) helpCenterActivity3.MediaSessionCompatQueueItem()).serializer(new getExitTransition(helpCenterActivity3.getIntent().getStringExtra("initial_message"), helpCenterActivity3.getIntent().getStringExtra("reason_code"), helpCenterActivity3.getIntent().getStringExtra("order_id"), helpCenterActivity3.getIntent().getStringExtra("page_id"), helpCenterActivity3.getIntent().getStringExtra("delivery_id"), helpCenterActivity3.getIntent().getStringExtra("flow_version")));
                int i28 = r8lambdawJ5MHcSJed_CjC7r4OWD0UxyJsQ + 73;
                r8lambdayPQlaAoRiYRJ3IY_TqzUUTrVH0 = i28 % Fields.SpotShadowColor;
                int i29 = i28 % 2;
                return getloadermanagerSerializer;
            default:
                return IconCompatParcelizer(objArr);
        }
    }

    private static final void MediaBrowserCompatMediaItem(String str) {
        int i = 2 % 2;
        int i2 = r8lambdayPQlaAoRiYRJ3IY_TqzUUTrVH0 + 61;
        r8lambdawJ5MHcSJed_CjC7r4OWD0UxyJsQ = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
    }

    @Override // o.scheduleDebounceCallback
    public /* bridge */ void IconCompatParcelizer(String str) {
        int i = 2 % 2;
        int i2 = r8lambdayPQlaAoRiYRJ3IY_TqzUUTrVH0 + 31;
        r8lambdawJ5MHcSJed_CjC7r4OWD0UxyJsQ = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
    }

    @Override // o.scheduleDebounceCallback
    public /* bridge */ void MediaMetadataCompat() {
        int i = 2 % 2;
        int i2 = r8lambdawJ5MHcSJed_CjC7r4OWD0UxyJsQ + 103;
        r8lambdayPQlaAoRiYRJ3IY_TqzUUTrVH0 = i2 % Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            int i3 = 61 / 0;
        }
    }

    @Override // o.scheduleDebounceCallback
    public /* bridge */ void write(int i, int i2) {
        int i3 = 2 % 2;
        int i4 = r8lambdawJ5MHcSJed_CjC7r4OWD0UxyJsQ + 41;
        r8lambdayPQlaAoRiYRJ3IY_TqzUUTrVH0 = i4 % Fields.SpotShadowColor;
        if (i4 % 2 == 0) {
            throw null;
        }
    }

    static {
        ParcelableVolumeInfo();
        RatingCompat = new getParentFragment();
        int i = r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28 + 117;
        r8lambdavCwjfXDiSGcirCy4I008VOiJ_lw = i % Fields.SpotShadowColor;
        int i2 = i % 2;
    }

    public static final /* synthetic */ onBackPressed IconCompatParcelizer(HelpCenterActivity helpCenterActivity) {
        int i = 2 % 2;
        int i2 = r8lambdawJ5MHcSJed_CjC7r4OWD0UxyJsQ + 109;
        r8lambdayPQlaAoRiYRJ3IY_TqzUUTrVH0 = i2 % Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            return helpCenterActivity.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus;
        }
        int i3 = 12 / 0;
        return helpCenterActivity.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus;
    }

    public static final /* synthetic */ r8lambda2vBtwyPX8g68gaqnZ343rZwzI RemoteActionCompatParcelizer(HelpCenterActivity helpCenterActivity) {
        int i = 2 % 2;
        int i2 = r8lambdayPQlaAoRiYRJ3IY_TqzUUTrVH0 + 35;
        r8lambdawJ5MHcSJed_CjC7r4OWD0UxyJsQ = i2 % Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            return helpCenterActivity.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg;
        }
        int i3 = 45 / 0;
        return helpCenterActivity.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg;
    }

    public static final /* synthetic */ void RemoteActionCompatParcelizer(HelpCenterActivity helpCenterActivity, Uri uri) {
        int i = 2 % 2;
        int i2 = r8lambdawJ5MHcSJed_CjC7r4OWD0UxyJsQ;
        int i3 = i2 + 65;
        r8lambdayPQlaAoRiYRJ3IY_TqzUUTrVH0 = i3 % Fields.SpotShadowColor;
        int i4 = i3 % 2;
        helpCenterActivity.ComponentActivity = uri;
        int i5 = i2 + 25;
        r8lambdayPQlaAoRiYRJ3IY_TqzUUTrVH0 = i5 % Fields.SpotShadowColor;
        if (i5 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static final /* synthetic */ void RemoteActionCompatParcelizer(HelpCenterActivity helpCenterActivity, ValueCallback valueCallback) {
        int i = 2 % 2;
        int i2 = r8lambdayPQlaAoRiYRJ3IY_TqzUUTrVH0;
        int i3 = i2 + 37;
        r8lambdawJ5MHcSJed_CjC7r4OWD0UxyJsQ = i3 % Fields.SpotShadowColor;
        if (i3 % 2 != 0) {
            helpCenterActivity.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM = valueCallback;
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        helpCenterActivity.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM = valueCallback;
        int i4 = i2 + 81;
        r8lambdawJ5MHcSJed_CjC7r4OWD0UxyJsQ = i4 % Fields.SpotShadowColor;
        int i5 = i4 % 2;
    }

    private static final void IconCompatParcelizer(HelpCenterActivity helpCenterActivity, View view) {
        int i = 2 % 2;
        int i2 = r8lambdayPQlaAoRiYRJ3IY_TqzUUTrVH0 + 49;
        r8lambdawJ5MHcSJed_CjC7r4OWD0UxyJsQ = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        helpCenterActivity.finish();
        int i4 = r8lambdayPQlaAoRiYRJ3IY_TqzUUTrVH0 + 47;
        r8lambdawJ5MHcSJed_CjC7r4OWD0UxyJsQ = i4 % Fields.SpotShadowColor;
        int i5 = i4 % 2;
    }

    public static final /* synthetic */ void IconCompatParcelizer(HelpCenterActivity helpCenterActivity, String str, ActivityNotFoundException activityNotFoundException) {
        int i = 2 % 2;
        int i2 = r8lambdawJ5MHcSJed_CjC7r4OWD0UxyJsQ + 19;
        r8lambdayPQlaAoRiYRJ3IY_TqzUUTrVH0 = i2 % Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            helpCenterActivity.read(str, activityNotFoundException);
            return;
        }
        helpCenterActivity.read(str, activityNotFoundException);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static /* synthetic */ Object MediaMetadataCompat(Object[] objArr) {
        HelpCenterActivity helpCenterActivity = (HelpCenterActivity) objArr[0];
        int i = 2 % 2;
        int i2 = r8lambdayPQlaAoRiYRJ3IY_TqzUUTrVH0 + 123;
        r8lambdawJ5MHcSJed_CjC7r4OWD0UxyJsQ = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        helpCenterActivity.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg();
        int i4 = r8lambdayPQlaAoRiYRJ3IY_TqzUUTrVH0 + 7;
        r8lambdawJ5MHcSJed_CjC7r4OWD0UxyJsQ = i4 % Fields.SpotShadowColor;
        if (i4 % 2 != 0) {
            int i5 = 77 / 0;
        }
        return null;
    }

    public static /* synthetic */ void RemoteActionCompatParcelizer(HelpCenterActivity helpCenterActivity, View view) {
        int i = 2 % 2;
        int i2 = r8lambdawJ5MHcSJed_CjC7r4OWD0UxyJsQ + 83;
        r8lambdayPQlaAoRiYRJ3IY_TqzUUTrVH0 = i2 % Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            IconCompatParcelizer(helpCenterActivity, view);
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        IconCompatParcelizer(helpCenterActivity, view);
        int i3 = r8lambdayPQlaAoRiYRJ3IY_TqzUUTrVH0 + 91;
        r8lambdawJ5MHcSJed_CjC7r4OWD0UxyJsQ = i3 % Fields.SpotShadowColor;
        int i4 = i3 % 2;
    }

    public static final /* synthetic */ void RemoteActionCompatParcelizer(HelpCenterActivity helpCenterActivity, WebView webView) {
        int i = 2 % 2;
        int i2 = r8lambdayPQlaAoRiYRJ3IY_TqzUUTrVH0 + 103;
        r8lambdawJ5MHcSJed_CjC7r4OWD0UxyJsQ = i2 % Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            helpCenterActivity.write(webView);
        } else {
            helpCenterActivity.write(webView);
            throw null;
        }
    }

    public static /* synthetic */ void RemoteActionCompatParcelizer(String str) {
        int i = 2 % 2;
        int i2 = r8lambdayPQlaAoRiYRJ3IY_TqzUUTrVH0 + 113;
        r8lambdawJ5MHcSJed_CjC7r4OWD0UxyJsQ = i2 % Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            MediaBrowserCompatMediaItem(str);
            return;
        }
        MediaBrowserCompatMediaItem(str);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static /* synthetic */ Object read(Object[] objArr) throws NoSuchMethodException {
        HelpCenterActivity helpCenterActivity = (HelpCenterActivity) objArr[0];
        boolean zBooleanValue = ((Boolean) objArr[1]).booleanValue();
        int i = 2 % 2;
        int i2 = r8lambdayPQlaAoRiYRJ3IY_TqzUUTrVH0 + 109;
        r8lambdawJ5MHcSJed_CjC7r4OWD0UxyJsQ = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        write(helpCenterActivity, zBooleanValue);
        int i4 = r8lambdayPQlaAoRiYRJ3IY_TqzUUTrVH0 + 105;
        r8lambdawJ5MHcSJed_CjC7r4OWD0UxyJsQ = i4 % Fields.SpotShadowColor;
        Object obj = null;
        if (i4 % 2 == 0) {
            return null;
        }
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ void read(HelpCenterActivity helpCenterActivity, boolean z) throws NoSuchMethodException {
        int i = 2 % 2;
        int i2 = r8lambdayPQlaAoRiYRJ3IY_TqzUUTrVH0 + 51;
        r8lambdawJ5MHcSJed_CjC7r4OWD0UxyJsQ = i2 % Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            Object[] objArr = {helpCenterActivity, Boolean.valueOf(z)};
            int i3 = sourceInformationContextOfdefault.read();
            IconCompatParcelizer(sourceInformationContextOfdefault.read(), sourceInformationContextOfdefault.read(), sourceInformationContextOfdefault.read(), i3, -1009493337, 1009493339, objArr);
            throw null;
        }
        Object[] objArr2 = {helpCenterActivity, Boolean.valueOf(z)};
        int i4 = sourceInformationContextOfdefault.read();
        IconCompatParcelizer(sourceInformationContextOfdefault.read(), sourceInformationContextOfdefault.read(), sourceInformationContextOfdefault.read(), i4, -1009493337, 1009493339, objArr2);
        int i5 = r8lambdawJ5MHcSJed_CjC7r4OWD0UxyJsQ + 101;
        r8lambdayPQlaAoRiYRJ3IY_TqzUUTrVH0 = i5 % Fields.SpotShadowColor;
        if (i5 % 2 == 0) {
            int i6 = 37 / 0;
        }
    }

    public static /* synthetic */ void serializer(HelpCenterActivity helpCenterActivity, ActivityResult activityResult) {
        int i = 2 % 2;
        int i2 = r8lambdawJ5MHcSJed_CjC7r4OWD0UxyJsQ + 21;
        r8lambdayPQlaAoRiYRJ3IY_TqzUUTrVH0 = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        IconCompatParcelizer(helpCenterActivity, activityResult);
        int i4 = r8lambdawJ5MHcSJed_CjC7r4OWD0UxyJsQ + 93;
        r8lambdayPQlaAoRiYRJ3IY_TqzUUTrVH0 = i4 % Fields.SpotShadowColor;
        if (i4 % 2 == 0) {
            int i5 = 57 / 0;
        }
    }

    @Override // o.scheduleDebounceCallback
    public void read(String str) {
        int i = 2 % 2;
        int i2 = r8lambdawJ5MHcSJed_CjC7r4OWD0UxyJsQ + 29;
        r8lambdayPQlaAoRiYRJ3IY_TqzUUTrVH0 = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        str.getClass();
        int i4 = r8lambdawJ5MHcSJed_CjC7r4OWD0UxyJsQ + 27;
        r8lambdayPQlaAoRiYRJ3IY_TqzUUTrVH0 = i4 % Fields.SpotShadowColor;
        if (i4 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static /* synthetic */ Object IconCompatParcelizer(Object[] objArr) {
        HelpCenterActivity helpCenterActivity = (HelpCenterActivity) objArr[0];
        getBitmapui_graphics getbitmapui_graphics = (getBitmapui_graphics) objArr[1];
        int i = 2 % 2;
        int i2 = r8lambdawJ5MHcSJed_CjC7r4OWD0UxyJsQ + 11;
        r8lambdayPQlaAoRiYRJ3IY_TqzUUTrVH0 = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        int i4 = sourceInformationContextOfdefault.read();
        int i5 = sourceInformationContextOfdefault.read();
        int i6 = sourceInformationContextOfdefault.read();
        getLoaderManager getloadermanager = (getLoaderManager) IconCompatParcelizer(sourceInformationContextOfdefault.read(), i6, i5, i4, -478812049, 478812061, new Object[]{helpCenterActivity, getbitmapui_graphics});
        int i7 = r8lambdawJ5MHcSJed_CjC7r4OWD0UxyJsQ + 47;
        r8lambdayPQlaAoRiYRJ3IY_TqzUUTrVH0 = i7 % Fields.SpotShadowColor;
        int i8 = i7 % 2;
        return getloadermanager;
    }

    public static final /* synthetic */ boolean IconCompatParcelizer(HelpCenterActivity helpCenterActivity, Uri uri) throws NoSuchMethodException {
        boolean zWrite;
        int i = 2 % 2;
        int i2 = r8lambdawJ5MHcSJed_CjC7r4OWD0UxyJsQ + 103;
        r8lambdayPQlaAoRiYRJ3IY_TqzUUTrVH0 = i2 % Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            zWrite = helpCenterActivity.write(uri);
            int i3 = 26 / 0;
        } else {
            zWrite = helpCenterActivity.write(uri);
        }
        int i4 = r8lambdawJ5MHcSJed_CjC7r4OWD0UxyJsQ + 77;
        r8lambdayPQlaAoRiYRJ3IY_TqzUUTrVH0 = i4 % Fields.SpotShadowColor;
        if (i4 % 2 != 0) {
            return zWrite;
        }
        throw null;
    }

    private static /* synthetic */ Object MediaBrowserCompatMediaItem(Object[] objArr) {
        createFromParcel createfromparcelSerializer;
        HelpCenterActivity helpCenterActivity = (HelpCenterActivity) objArr[0];
        OnBackPressedCallback onBackPressedCallback = (OnBackPressedCallback) objArr[1];
        int i = 2 % 2;
        int i2 = r8lambdawJ5MHcSJed_CjC7r4OWD0UxyJsQ + 49;
        r8lambdayPQlaAoRiYRJ3IY_TqzUUTrVH0 = i2 % Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            createfromparcelSerializer = serializer(helpCenterActivity, onBackPressedCallback);
            int i3 = 30 / 0;
        } else {
            createfromparcelSerializer = serializer(helpCenterActivity, onBackPressedCallback);
        }
        int i4 = r8lambdawJ5MHcSJed_CjC7r4OWD0UxyJsQ + 33;
        r8lambdayPQlaAoRiYRJ3IY_TqzUUTrVH0 = i4 % Fields.SpotShadowColor;
        if (i4 % 2 == 0) {
            int i5 = 59 / 0;
        }
        return createfromparcelSerializer;
    }

    private static /* synthetic */ Object MediaSessionCompatQueueItem(Object[] objArr) {
        HelpCenterActivity helpCenterActivity = (HelpCenterActivity) objArr[0];
        getSharedElementReturnTransition getsharedelementreturntransition = (getSharedElementReturnTransition) objArr[1];
        int i = 2 % 2;
        int i2 = r8lambdayPQlaAoRiYRJ3IY_TqzUUTrVH0 + 19;
        r8lambdawJ5MHcSJed_CjC7r4OWD0UxyJsQ = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        createFromParcel createfromparcelIconCompatParcelizer = IconCompatParcelizer(helpCenterActivity, getsharedelementreturntransition);
        int i4 = r8lambdawJ5MHcSJed_CjC7r4OWD0UxyJsQ + 67;
        r8lambdayPQlaAoRiYRJ3IY_TqzUUTrVH0 = i4 % Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return createfromparcelIconCompatParcelizer;
    }

    public static /* synthetic */ createFromParcel RemoteActionCompatParcelizer(HelpCenterActivity helpCenterActivity, getPopDirection getpopdirection) {
        int i = 2 % 2;
        int i2 = r8lambdawJ5MHcSJed_CjC7r4OWD0UxyJsQ + 105;
        r8lambdayPQlaAoRiYRJ3IY_TqzUUTrVH0 = i2 % Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            int i3 = sourceInformationContextOfdefault.read();
            int i4 = sourceInformationContextOfdefault.read();
            int i5 = sourceInformationContextOfdefault.read();
            return (createFromParcel) IconCompatParcelizer(sourceInformationContextOfdefault.read(), i5, i4, i3, -389023126, 389023132, new Object[]{helpCenterActivity, getpopdirection});
        }
        int i6 = sourceInformationContextOfdefault.read();
        int i7 = sourceInformationContextOfdefault.read();
        int i8 = sourceInformationContextOfdefault.read();
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static final /* synthetic */ Uri read(HelpCenterActivity helpCenterActivity) {
        int i = 2 % 2;
        int i2 = r8lambdayPQlaAoRiYRJ3IY_TqzUUTrVH0 + 91;
        r8lambdawJ5MHcSJed_CjC7r4OWD0UxyJsQ = i2 % Fields.SpotShadowColor;
        Object obj = null;
        if (i2 % 2 != 0) {
            helpCenterActivity.r8lambda54BeH8ZsBru0CXI2CCSP2syNys();
            obj.hashCode();
            throw null;
        }
        Uri uriR8lambda54BeH8ZsBru0CXI2CCSP2syNys = helpCenterActivity.r8lambda54BeH8ZsBru0CXI2CCSP2syNys();
        int i3 = r8lambdayPQlaAoRiYRJ3IY_TqzUUTrVH0 + 65;
        r8lambdawJ5MHcSJed_CjC7r4OWD0UxyJsQ = i3 % Fields.SpotShadowColor;
        if (i3 % 2 == 0) {
            return uriR8lambda54BeH8ZsBru0CXI2CCSP2syNys;
        }
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ FocusRequesterModifierKt read(View view, FocusRequesterModifierKt focusRequesterModifierKt) {
        int i = 2 % 2;
        int i2 = r8lambdawJ5MHcSJed_CjC7r4OWD0UxyJsQ + 7;
        r8lambdayPQlaAoRiYRJ3IY_TqzUUTrVH0 = i2 % Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            return write(view, focusRequesterModifierKt);
        }
        write(view, focusRequesterModifierKt);
        throw null;
    }

    public static /* synthetic */ PermissionModel serializer() {
        int i = 2 % 2;
        int i2 = r8lambdawJ5MHcSJed_CjC7r4OWD0UxyJsQ + 89;
        r8lambdayPQlaAoRiYRJ3IY_TqzUUTrVH0 = i2 % Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            return r8lambdaXj9c8VIP9DfEvaTmZt0ejAuC4a4();
        }
        r8lambdaXj9c8VIP9DfEvaTmZt0ejAuC4a4();
        throw null;
    }

    public static final /* synthetic */ getLoaderManager serializer(HelpCenterActivity helpCenterActivity) {
        getLoaderManager getloadermanagerResultReceiver;
        int i = 2 % 2;
        int i2 = r8lambdayPQlaAoRiYRJ3IY_TqzUUTrVH0 + 17;
        r8lambdawJ5MHcSJed_CjC7r4OWD0UxyJsQ = i2 % Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            getloadermanagerResultReceiver = helpCenterActivity.ResultReceiver();
            int i3 = 53 / 0;
        } else {
            getloadermanagerResultReceiver = helpCenterActivity.ResultReceiver();
        }
        int i4 = r8lambdawJ5MHcSJed_CjC7r4OWD0UxyJsQ + 41;
        r8lambdayPQlaAoRiYRJ3IY_TqzUUTrVH0 = i4 % Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return getloadermanagerResultReceiver;
    }

    public static /* synthetic */ createFromParcel write(onTouch ontouch) {
        int i = 2 % 2;
        int i2 = r8lambdawJ5MHcSJed_CjC7r4OWD0UxyJsQ + 125;
        r8lambdayPQlaAoRiYRJ3IY_TqzUUTrVH0 = i2 % Fields.SpotShadowColor;
        Object obj = null;
        if (i2 % 2 == 0) {
            IconCompatParcelizer(ontouch);
            throw null;
        }
        createFromParcel createfromparcelIconCompatParcelizer = IconCompatParcelizer(ontouch);
        int i3 = r8lambdawJ5MHcSJed_CjC7r4OWD0UxyJsQ + 123;
        r8lambdayPQlaAoRiYRJ3IY_TqzUUTrVH0 = i3 % Fields.SpotShadowColor;
        if (i3 % 2 != 0) {
            return createfromparcelIconCompatParcelizer;
        }
        obj.hashCode();
        throw null;
    }

    private static final PermissionModel write(onViewDetachedFromWindowlambda1 onviewdetachedfromwindowlambda1) {
        PermissionModel permissionModel;
        int i = 2 % 2;
        int i2 = r8lambdawJ5MHcSJed_CjC7r4OWD0UxyJsQ + 9;
        r8lambdayPQlaAoRiYRJ3IY_TqzUUTrVH0 = i2 % Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            permissionModel = (PermissionModel) onviewdetachedfromwindowlambda1.MediaSessionCompatResultReceiverWrapper();
            int i3 = 77 / 0;
        } else {
            permissionModel = (PermissionModel) onviewdetachedfromwindowlambda1.MediaSessionCompatResultReceiverWrapper();
        }
        int i4 = r8lambdayPQlaAoRiYRJ3IY_TqzUUTrVH0 + 21;
        r8lambdawJ5MHcSJed_CjC7r4OWD0UxyJsQ = i4 % Fields.SpotShadowColor;
        if (i4 % 2 == 0) {
            return permissionModel;
        }
        throw null;
    }

    public HelpCenterActivity() {
        int i = 0;
        int i2 = 1;
        this.r8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss = new ComponentRegistry$Builder(displayInAppMessagelambda1.serializer(getLoaderManager.class), new getNextTransition(this, i), new AndroidSqliteDriverCallback(this, 10, new getMinimumMaxLifecycleState(this, i)), new getNextTransition(this, i2));
        onBackPressed onbackpressedRegisterForActivityResult = registerForActivityResult(new onPictureInPictureModeChanged(i), new getHost(this, i2));
        onbackpressedRegisterForActivityResult.getClass();
        this.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus = onbackpressedRegisterForActivityResult;
        int i3 = 2;
        onBackPressed onbackpressedRegisterForActivityResult2 = registerForActivityResult(new times7Ah8Wj8(i3), new getHost(this, i3));
        onbackpressedRegisterForActivityResult2.getClass();
        this.r8lambdaXj9c8VIP9DfEvaTmZt0ejAuC4a4 = onbackpressedRegisterForActivityResult2;
    }

    private final getLoaderManager ResultReceiver() {
        getLoaderManager getloadermanager;
        int i = 2 % 2;
        int i2 = r8lambdawJ5MHcSJed_CjC7r4OWD0UxyJsQ + 103;
        r8lambdayPQlaAoRiYRJ3IY_TqzUUTrVH0 = i2 % Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            getloadermanager = (getLoaderManager) this.r8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss.MediaSessionCompatResultReceiverWrapper();
            int i3 = 70 / 0;
        } else {
            getloadermanager = (getLoaderManager) this.r8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss.MediaSessionCompatResultReceiverWrapper();
        }
        int i4 = r8lambdawJ5MHcSJed_CjC7r4OWD0UxyJsQ + 65;
        r8lambdayPQlaAoRiYRJ3IY_TqzUUTrVH0 = i4 % Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return getloadermanager;
    }

    private static final PermissionModel r8lambdaXj9c8VIP9DfEvaTmZt0ejAuC4a4() {
        int i = 2 % 2;
        PermissionModel permissionModel = new PermissionModel(r8lambda60pWJrJ_IeYyPZNB7guGmuaMR08.CAMERA, true);
        int i2 = r8lambdawJ5MHcSJed_CjC7r4OWD0UxyJsQ + 103;
        r8lambdayPQlaAoRiYRJ3IY_TqzUUTrVH0 = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        return permissionModel;
    }

    private static final createFromParcel IconCompatParcelizer(onTouch ontouch) {
        int i = 2 % 2;
        int i2 = r8lambdawJ5MHcSJed_CjC7r4OWD0UxyJsQ + 5;
        r8lambdayPQlaAoRiYRJ3IY_TqzUUTrVH0 = i2 % Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            ontouch.getClass();
            ontouch.MediaDescriptionCompat = true;
        } else {
            ontouch.getClass();
            ontouch.MediaDescriptionCompat = true;
        }
        ontouch.MediaSessionCompatQueueItem = true;
        createFromParcel createfromparcel = createFromParcel.INSTANCE;
        int i3 = r8lambdawJ5MHcSJed_CjC7r4OWD0UxyJsQ + 49;
        r8lambdayPQlaAoRiYRJ3IY_TqzUUTrVH0 = i3 % Fields.SpotShadowColor;
        int i4 = i3 % 2;
        return createfromparcel;
    }

    private final void read(String str, ActivityNotFoundException activityNotFoundException) {
        int i = 2 % 2;
        int i2 = r8lambdayPQlaAoRiYRJ3IY_TqzUUTrVH0 + 91;
        r8lambdawJ5MHcSJed_CjC7r4OWD0UxyJsQ = i2 % Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            Timber.RemoteActionCompatParcelizer.RemoteActionCompatParcelizer(activityNotFoundException, str, new Object[0]);
        } else {
            Timber.RemoteActionCompatParcelizer.RemoteActionCompatParcelizer(activityNotFoundException, str, new Object[0]);
        }
        MediaMetadataCompat(str);
        int i3 = r8lambdayPQlaAoRiYRJ3IY_TqzUUTrVH0 + 73;
        r8lambdawJ5MHcSJed_CjC7r4OWD0UxyJsQ = i3 % Fields.SpotShadowColor;
        if (i3 % 2 != 0) {
            throw null;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0026, code lost:
    
        return r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0027, code lost:
    
        o.removeNodeAtDepth.serializer("deviceTimeTamperingCheckObserverFactory");
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x002d, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0018, code lost:
    
        if (r5 != null) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x001d, code lost:
    
        if (r5 != null) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x001f, code lost:
    
        r2 = r2 + 105;
        com.roadrunner.helpcenter.presentation.activity.HelpCenterActivity.r8lambdawJ5MHcSJed_CjC7r4OWD0UxyJsQ = r2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        r2 = r2 % 2;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static /* synthetic */ java.lang.Object write(java.lang.Object[] r5) {
        /*
            r0 = 0
            r5 = r5[r0]
            com.roadrunner.helpcenter.presentation.activity.HelpCenterActivity r5 = (com.roadrunner.helpcenter.presentation.activity.HelpCenterActivity) r5
            r1 = 2
            int r2 = r1 % r1
            int r2 = com.roadrunner.helpcenter.presentation.activity.HelpCenterActivity.r8lambdayPQlaAoRiYRJ3IY_TqzUUTrVH0
            int r3 = r2 + 43
            int r4 = r3 % 128
            com.roadrunner.helpcenter.presentation.activity.HelpCenterActivity.r8lambdawJ5MHcSJed_CjC7r4OWD0UxyJsQ = r4
            int r3 = r3 % r1
            if (r3 == 0) goto L1b
            o.getRestLineXSAIIZE r5 = r5.PlaybackStateCompatCustomAction
            r3 = 21
            int r3 = r3 / r0
            if (r5 == 0) goto L27
            goto L1f
        L1b:
            o.getRestLineXSAIIZE r5 = r5.PlaybackStateCompatCustomAction
            if (r5 == 0) goto L27
        L1f:
            int r2 = r2 + 105
            int r0 = r2 % 128
            com.roadrunner.helpcenter.presentation.activity.HelpCenterActivity.r8lambdawJ5MHcSJed_CjC7r4OWD0UxyJsQ = r0
            int r2 = r2 % r1
            return r5
        L27:
            java.lang.String r5 = "deviceTimeTamperingCheckObserverFactory"
            o.removeNodeAtDepth.serializer(r5)
            r5 = 0
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.roadrunner.helpcenter.presentation.activity.HelpCenterActivity.write(java.lang.Object[]):java.lang.Object");
    }

    public final setVerticalAlign MediaBrowserCompatMediaItem() {
        int i = 2 % 2;
        int i2 = r8lambdayPQlaAoRiYRJ3IY_TqzUUTrVH0;
        int i3 = i2 + 11;
        r8lambdawJ5MHcSJed_CjC7r4OWD0UxyJsQ = i3 % Fields.SpotShadowColor;
        int i4 = i3 % 2;
        setVerticalAlign setverticalalign = this.ParcelableVolumeInfo;
        Object obj = null;
        if (setverticalalign == null) {
            removeNodeAtDepth.serializer("diagnosticsNavigator");
            throw null;
        }
        int i5 = i2 + 113;
        r8lambdawJ5MHcSJed_CjC7r4OWD0UxyJsQ = i5 % Fields.SpotShadowColor;
        if (i5 % 2 == 0) {
            return setverticalalign;
        }
        obj.hashCode();
        throw null;
    }

    public final getPopExitAnim MediaSessionCompatQueueItem() {
        int i = 2 % 2;
        int i2 = r8lambdawJ5MHcSJed_CjC7r4OWD0UxyJsQ;
        int i3 = i2 + 51;
        r8lambdayPQlaAoRiYRJ3IY_TqzUUTrVH0 = i3 % Fields.SpotShadowColor;
        int i4 = i3 % 2;
        getPopExitAnim getpopexitanim = this.PlaybackStateCompat;
        if (getpopexitanim == null) {
            removeNodeAtDepth.serializer("helpCenterActivityViewModelFactory");
            throw null;
        }
        int i5 = i2 + 65;
        r8lambdayPQlaAoRiYRJ3IY_TqzUUTrVH0 = i5 % Fields.SpotShadowColor;
        if (i5 % 2 != 0) {
            return getpopexitanim;
        }
        throw null;
    }

    public final resetOutlineParams RatingCompat() {
        int i = 2 % 2;
        resetOutlineParams resetoutlineparams = this.MediaSessionCompatToken;
        if (resetoutlineparams == null) {
            removeNodeAtDepth.serializer("imageFileManager");
            throw null;
        }
        int i2 = r8lambdawJ5MHcSJed_CjC7r4OWD0UxyJsQ + 37;
        int i3 = i2 % Fields.SpotShadowColor;
        r8lambdayPQlaAoRiYRJ3IY_TqzUUTrVH0 = i3;
        int i4 = i2 % 2;
        int i5 = i3 + 79;
        r8lambdawJ5MHcSJed_CjC7r4OWD0UxyJsQ = i5 % Fields.SpotShadowColor;
        if (i5 % 2 == 0) {
            return resetoutlineparams;
        }
        throw null;
    }

    public final accessgetOldDependencyp RemoteActionCompatParcelizer() {
        int i = 2 % 2;
        int i2 = r8lambdawJ5MHcSJed_CjC7r4OWD0UxyJsQ;
        int i3 = i2 + 33;
        r8lambdayPQlaAoRiYRJ3IY_TqzUUTrVH0 = i3 % Fields.SpotShadowColor;
        int i4 = i3 % 2;
        accessgetOldDependencyp accessgetolddependencyp = this.MediaSessionCompatQueueItem;
        Object obj = null;
        if (accessgetolddependencyp == null) {
            removeNodeAtDepth.serializer("appBuildConfig");
            throw null;
        }
        int i5 = i2 + 121;
        r8lambdayPQlaAoRiYRJ3IY_TqzUUTrVH0 = i5 % Fields.SpotShadowColor;
        if (i5 % 2 != 0) {
            return accessgetolddependencyp;
        }
        obj.hashCode();
        throw null;
    }

    public final BusinessMetricsTracker read() {
        int i = 2 % 2;
        int i2 = r8lambdawJ5MHcSJed_CjC7r4OWD0UxyJsQ;
        int i3 = i2 + 87;
        r8lambdayPQlaAoRiYRJ3IY_TqzUUTrVH0 = i3 % Fields.SpotShadowColor;
        Object obj = null;
        if (i3 % 2 == 0) {
            obj.hashCode();
            throw null;
        }
        BusinessMetricsTracker businessMetricsTracker = this.MediaDescriptionCompat;
        if (businessMetricsTracker == null) {
            removeNodeAtDepth.serializer("businessMetricsTracker");
            throw null;
        }
        int i4 = i2 + 43;
        r8lambdayPQlaAoRiYRJ3IY_TqzUUTrVH0 = i4 % Fields.SpotShadowColor;
        if (i4 % 2 != 0) {
            return businessMetricsTracker;
        }
        throw null;
    }

    private static final createFromParcel serializer(HelpCenterActivity helpCenterActivity, OnBackPressedCallback onBackPressedCallback) {
        int i = 2 % 2;
        int i2 = r8lambdayPQlaAoRiYRJ3IY_TqzUUTrVH0 + 77;
        r8lambdawJ5MHcSJed_CjC7r4OWD0UxyJsQ = i2 % Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            onBackPressedCallback.getClass();
            helpCenterActivity.ResultReceiver().IconCompatParcelizer();
            return createFromParcel.INSTANCE;
        }
        onBackPressedCallback.getClass();
        helpCenterActivity.ResultReceiver().IconCompatParcelizer();
        createFromParcel createfromparcel = createFromParcel.INSTANCE;
        throw null;
    }

    public final inRing MediaDescriptionCompat() {
        int i = 2 % 2;
        int i2 = r8lambdayPQlaAoRiYRJ3IY_TqzUUTrVH0;
        int i3 = i2 + 119;
        r8lambdawJ5MHcSJed_CjC7r4OWD0UxyJsQ = i3 % Fields.SpotShadowColor;
        int i4 = i3 % 2;
        inRing inring = this.MediaSessionCompatResultReceiverWrapper;
        if (inring == null) {
            removeNodeAtDepth.serializer("permissionLifecycleHandlerFactory");
            throw null;
        }
        int i5 = i2 + 111;
        r8lambdawJ5MHcSJed_CjC7r4OWD0UxyJsQ = i5 % Fields.SpotShadowColor;
        if (i5 % 2 != 0) {
            int i6 = 53 / 0;
        }
        return inring;
    }

    public final transferSessionPackageI MediaSessionCompatResultReceiverWrapper() {
        int i = 2 % 2;
        int i2 = r8lambdayPQlaAoRiYRJ3IY_TqzUUTrVH0;
        int i3 = i2 + 59;
        r8lambdawJ5MHcSJed_CjC7r4OWD0UxyJsQ = i3 % Fields.SpotShadowColor;
        int i4 = i3 % 2;
        transferSessionPackageI transfersessionpackagei = this.r8lambda54BeH8ZsBru0CXI2CCSP2syNys;
        if (transfersessionpackagei == null) {
            removeNodeAtDepth.serializer("remoteConfig");
            throw null;
        }
        int i5 = i2 + 89;
        int i6 = i5 % Fields.SpotShadowColor;
        r8lambdawJ5MHcSJed_CjC7r4OWD0UxyJsQ = i6;
        int i7 = i5 % 2;
        int i8 = i6 + 39;
        r8lambdayPQlaAoRiYRJ3IY_TqzUUTrVH0 = i8 % Fields.SpotShadowColor;
        int i9 = i8 % 2;
        return transfersessionpackagei;
    }

    public final r8lambdawmxPERJX66sfUc7BfHYWeVjHcwo PlaybackStateCompatCustomAction() {
        int i = 2 % 2;
        int i2 = r8lambdawJ5MHcSJed_CjC7r4OWD0UxyJsQ;
        int i3 = i2 + 15;
        r8lambdayPQlaAoRiYRJ3IY_TqzUUTrVH0 = i3 % Fields.SpotShadowColor;
        int i4 = i3 % 2;
        r8lambdawmxPERJX66sfUc7BfHYWeVjHcwo r8lambdawmxperjx66sfuc7bfhywevjhcwo = this.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY;
        if (r8lambdawmxperjx66sfuc7bfhywevjhcwo == null) {
            removeNodeAtDepth.serializer("snackbarManager");
            throw null;
        }
        int i5 = i2 + 69;
        r8lambdayPQlaAoRiYRJ3IY_TqzUUTrVH0 = i5 % Fields.SpotShadowColor;
        int i6 = i5 % 2;
        return r8lambdawmxperjx66sfuc7bfhywevjhcwo;
    }

    private final Uri r8lambda54BeH8ZsBru0CXI2CCSP2syNys() {
        int i = 2 % 2;
        int i2 = r8lambdawJ5MHcSJed_CjC7r4OWD0UxyJsQ + 73;
        r8lambdayPQlaAoRiYRJ3IY_TqzUUTrVH0 = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        Uri uri = ((recreateDisplayListIfNeeded) RatingCompat()).read(MediaSessionCompatToken());
        int i4 = r8lambdayPQlaAoRiYRJ3IY_TqzUUTrVH0 + 15;
        r8lambdawJ5MHcSJed_CjC7r4OWD0UxyJsQ = i4 % Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return uri;
    }

    private static final void write(HelpCenterActivity helpCenterActivity, boolean z) throws NoSuchMethodException {
        int i = 2 % 2;
        int i2 = r8lambdawJ5MHcSJed_CjC7r4OWD0UxyJsQ;
        int i3 = i2 + 59;
        r8lambdayPQlaAoRiYRJ3IY_TqzUUTrVH0 = i3 % Fields.SpotShadowColor;
        if (i3 % 2 == 0) {
            throw null;
        }
        if (!z) {
            ValueCallback<Uri[]> valueCallback = helpCenterActivity.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM;
            if (valueCallback != null) {
                valueCallback.onReceiveValue(null);
            }
            helpCenterActivity.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM = null;
            return;
        }
        int i4 = i2 + 3;
        r8lambdayPQlaAoRiYRJ3IY_TqzUUTrVH0 = i4 % Fields.SpotShadowColor;
        if (i4 % 2 != 0) {
            int i5 = sourceInformationContextOfdefault.read();
            int i6 = sourceInformationContextOfdefault.read();
            IconCompatParcelizer(sourceInformationContextOfdefault.read(), sourceInformationContextOfdefault.read(), i6, i5, -1677732720, 1677732721, new Object[]{helpCenterActivity});
            return;
        }
        int i7 = sourceInformationContextOfdefault.read();
        int i8 = sourceInformationContextOfdefault.read();
        IconCompatParcelizer(sourceInformationContextOfdefault.read(), sourceInformationContextOfdefault.read(), i8, i7, -1677732720, 1677732721, new Object[]{helpCenterActivity});
        throw null;
    }

    private final void r8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss() {
        int i = 2 % 2;
        ResultReceiver().write().RemoteActionCompatParcelizer(this, new getMinimumMaxLifecycleState(this, 3));
        int i2 = r8lambdawJ5MHcSJed_CjC7r4OWD0UxyJsQ + 65;
        r8lambdayPQlaAoRiYRJ3IY_TqzUUTrVH0 = i2 % Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            throw null;
        }
    }

    private static /* synthetic */ Object MediaDescriptionCompat(Object[] objArr) {
        int i = 0;
        HelpCenterActivity helpCenterActivity = (HelpCenterActivity) objArr[0];
        int i2 = 2 % 2;
        int i3 = r8lambdawJ5MHcSJed_CjC7r4OWD0UxyJsQ + 69;
        r8lambdayPQlaAoRiYRJ3IY_TqzUUTrVH0 = i3 % Fields.SpotShadowColor;
        try {
            if (i3 % 2 == 0) {
                helpCenterActivity.RemoteActionCompatParcelizer().getClass();
                int i4 = 57 / 0;
            } else {
                helpCenterActivity.RemoteActionCompatParcelizer().getClass();
            }
            int i5 = r8lambdawJ5MHcSJed_CjC7r4OWD0UxyJsQ + 107;
            i = i5 % Fields.SpotShadowColor;
            r8lambdayPQlaAoRiYRJ3IY_TqzUUTrVH0 = i;
            int i6 = i5 % 2;
            return null;
        } catch (RuntimeException e) {
            Timber.RemoteActionCompatParcelizer.serializer(e, "Failed to enable WebView debugging from HelpCenter", new Object[i]);
            return null;
        }
    }

    private final void MediaSessionCompatQueueItem(String str) {
        int i = 2 % 2;
        int i2 = r8lambdawJ5MHcSJed_CjC7r4OWD0UxyJsQ;
        int i3 = i2 + 51;
        r8lambdayPQlaAoRiYRJ3IY_TqzUUTrVH0 = i3 % Fields.SpotShadowColor;
        if (i3 % 2 == 0) {
            throw null;
        }
        if (str != null) {
            DialogFragment4 dialogFragment4 = this.ResultReceiver;
            if (dialogFragment4 != null) {
                dialogFragment4.write.loadUrl(str);
                return;
            } else {
                removeNodeAtDepth.serializer("binding");
                throw null;
            }
        }
        int i4 = i2 + 53;
        r8lambdayPQlaAoRiYRJ3IY_TqzUUTrVH0 = i4 % Fields.SpotShadowColor;
        if (i4 % 2 == 0) {
            int i5 = 60 / 0;
        }
    }

    private static /* synthetic */ Object RatingCompat(Object[] objArr) {
        HelpCenterActivity helpCenterActivity = (HelpCenterActivity) objArr[0];
        getPopDirection getpopdirection = (getPopDirection) objArr[1];
        int i = 2 % 2;
        int i2 = r8lambdawJ5MHcSJed_CjC7r4OWD0UxyJsQ + 63;
        r8lambdayPQlaAoRiYRJ3IY_TqzUUTrVH0 = i2 % Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            helpCenterActivity.serializer(getpopdirection.write());
            helpCenterActivity.MediaSessionCompatQueueItem(getpopdirection.serializer());
            helpCenterActivity.IconCompatParcelizer(getpopdirection);
            createFromParcel createfromparcel = createFromParcel.INSTANCE;
            throw null;
        }
        helpCenterActivity.serializer(getpopdirection.write());
        helpCenterActivity.MediaSessionCompatQueueItem(getpopdirection.serializer());
        helpCenterActivity.IconCompatParcelizer(getpopdirection);
        createFromParcel createfromparcel2 = createFromParcel.INSTANCE;
        int i3 = r8lambdayPQlaAoRiYRJ3IY_TqzUUTrVH0 + 5;
        r8lambdawJ5MHcSJed_CjC7r4OWD0UxyJsQ = i3 % Fields.SpotShadowColor;
        int i4 = i3 % 2;
        return createfromparcel2;
    }

    private static /* synthetic */ Object serializer(Object[] objArr) {
        HelpCenterActivity helpCenterActivity = (HelpCenterActivity) objArr[0];
        int i = 2 % 2;
        BuildersKt.RemoteActionCompatParcelizer(toBitmapConfig1JJdX4A.read(helpCenterActivity.getLifecycle()), null, null, new DividerUiModelImpl$1(helpCenterActivity, null, 4), 3);
        int i2 = r8lambdayPQlaAoRiYRJ3IY_TqzUUTrVH0 + 105;
        r8lambdawJ5MHcSJed_CjC7r4OWD0UxyJsQ = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        return null;
    }

    private final void IconCompatParcelizer(getPopDirection getpopdirection) {
        int i = 2 % 2;
        int i2 = r8lambdayPQlaAoRiYRJ3IY_TqzUUTrVH0 + 67;
        r8lambdawJ5MHcSJed_CjC7r4OWD0UxyJsQ = i2 % Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            getpopdirection.IconCompatParcelizer();
            throw null;
        }
        Integer numIconCompatParcelizer = getpopdirection.IconCompatParcelizer();
        if (numIconCompatParcelizer != null) {
            String string = getString(numIconCompatParcelizer.intValue());
            if (string.startsWith("%('")) {
                int i3 = r8lambdayPQlaAoRiYRJ3IY_TqzUUTrVH0 + 83;
                r8lambdawJ5MHcSJed_CjC7r4OWD0UxyJsQ = i3 % Fields.SpotShadowColor;
                if (i3 % 2 != 0) {
                    Object[] objArr = new Object[1];
                    a(string.substring(3), objArr);
                    string = ((String) objArr[0]).intern();
                    int i4 = 9 / 0;
                } else {
                    Object[] objArr2 = new Object[1];
                    a(string.substring(3), objArr2);
                    string = ((String) objArr2[0]).intern();
                }
            }
            string.getClass();
            MediaDescriptionCompat(string);
        }
        int i5 = r8lambdayPQlaAoRiYRJ3IY_TqzUUTrVH0 + 27;
        r8lambdawJ5MHcSJed_CjC7r4OWD0UxyJsQ = i5 % Fields.SpotShadowColor;
        if (i5 % 2 != 0) {
            throw null;
        }
    }

    private final File MediaSessionCompatToken() {
        int i = 2 % 2;
        int i2 = r8lambdayPQlaAoRiYRJ3IY_TqzUUTrVH0 + 23;
        r8lambdawJ5MHcSJed_CjC7r4OWD0UxyJsQ = i2 % Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            return ((recreateDisplayListIfNeeded) RatingCompat()).IconCompatParcelizer(af$$ExternalSyntheticOutline0.m(System.currentTimeMillis(), "HC_"));
        }
        int i3 = 48 / 0;
        return ((recreateDisplayListIfNeeded) RatingCompat()).IconCompatParcelizer(af$$ExternalSyntheticOutline0.m(System.currentTimeMillis(), "HC_"));
    }

    @Override // o.getPopEnterAnim
    public void serializer(String str) {
        int i = 2 % 2;
        int i2 = r8lambdawJ5MHcSJed_CjC7r4OWD0UxyJsQ + 117;
        r8lambdayPQlaAoRiYRJ3IY_TqzUUTrVH0 = i2 % Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            str.getClass();
            Timber.Forest forest = Timber.RemoteActionCompatParcelizer;
            Object[] objArr = new Object[1];
            objArr[1] = str;
            forest.IconCompatParcelizer("bridge_message_received = %s", objArr);
        } else {
            str.getClass();
            Timber.RemoteActionCompatParcelizer.IconCompatParcelizer("bridge_message_received = %s", str);
        }
        ResultReceiver().RemoteActionCompatParcelizer(str);
    }

    private final void IconCompatParcelizer(boolean z) {
        Uri[] uriArr;
        Uri uri;
        int i = 2 % 2;
        int i2 = r8lambdawJ5MHcSJed_CjC7r4OWD0UxyJsQ;
        int i3 = i2 + 49;
        int i4 = i3 % Fields.SpotShadowColor;
        r8lambdayPQlaAoRiYRJ3IY_TqzUUTrVH0 = i4;
        int i5 = i3 % 2;
        if (!z || (uri = this.ComponentActivity) == null) {
            int i6 = i4 + 125;
            r8lambdawJ5MHcSJed_CjC7r4OWD0UxyJsQ = i6 % Fields.SpotShadowColor;
            int i7 = i6 % 2;
            uriArr = null;
        } else {
            uriArr = new Uri[]{uri};
            int i8 = i2 + 51;
            r8lambdayPQlaAoRiYRJ3IY_TqzUUTrVH0 = i8 % Fields.SpotShadowColor;
            int i9 = i8 % 2;
        }
        ValueCallback<Uri[]> valueCallback = this.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM;
        if (valueCallback != null) {
            valueCallback.onReceiveValue(uriArr);
            int i10 = r8lambdawJ5MHcSJed_CjC7r4OWD0UxyJsQ + 107;
            r8lambdayPQlaAoRiYRJ3IY_TqzUUTrVH0 = i10 % Fields.SpotShadowColor;
            int i11 = i10 % 2;
        }
        this.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM = null;
    }

    private final void write(WebView webView) {
        ViewParent parent;
        int i = 2 % 2;
        if (webView != null) {
            int i2 = r8lambdawJ5MHcSJed_CjC7r4OWD0UxyJsQ + 107;
            r8lambdayPQlaAoRiYRJ3IY_TqzUUTrVH0 = i2 % Fields.SpotShadowColor;
            int i3 = i2 % 2;
            parent = webView.getParent();
        } else {
            parent = null;
        }
        ViewGroup viewGroup = parent instanceof ViewGroup ? (ViewGroup) parent : null;
        if (viewGroup != null) {
            int i4 = r8lambdayPQlaAoRiYRJ3IY_TqzUUTrVH0 + 95;
            r8lambdawJ5MHcSJed_CjC7r4OWD0UxyJsQ = i4 % Fields.SpotShadowColor;
            if (i4 % 2 != 0) {
                viewGroup.removeView(webView);
                int i5 = 55 / 0;
            } else {
                viewGroup.removeView(webView);
            }
        }
        if (webView != null) {
            webView.destroy();
        }
    }

    private static /* synthetic */ Object RemoteActionCompatParcelizer(Object[] objArr) {
        HelpCenterActivity helpCenterActivity = (HelpCenterActivity) objArr[0];
        int i = 2 % 2;
        Intent intent = new Intent("android.intent.action.VIEW", (Uri) objArr[1]);
        if (intent.resolveActivity(helpCenterActivity.getPackageManager()) == null) {
            r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.write("Invalid Deeplink From Global Help Center", Timber.RemoteActionCompatParcelizer);
            return null;
        }
        int i2 = r8lambdayPQlaAoRiYRJ3IY_TqzUUTrVH0 + 1;
        r8lambdawJ5MHcSJed_CjC7r4OWD0UxyJsQ = i2 % Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            helpCenterActivity.startActivity(intent);
            return null;
        }
        helpCenterActivity.startActivity(intent);
        throw null;
    }

    private void a(String str, Object[] objArr) {
        byte[] bArrDecode = Base64.decode(str, 0);
        byte[] bArr = new byte[bArrDecode.length];
        for (int i = 0; i < bArrDecode.length; i++) {
            bArr[i] = (byte) (bArrDecode[(bArrDecode.length - i) - 1] ^ r8lambdag6d1IyBXWIL5aeSAzXsZMVuYCQs);
        }
        objArr[0] = new String(bArr, StandardCharsets.UTF_8);
    }

    private static final FocusRequesterModifierKt write(View view, FocusRequesterModifierKt focusRequesterModifierKt) {
        int i = 2 % 2;
        int i2 = r8lambdayPQlaAoRiYRJ3IY_TqzUUTrVH0 + 73;
        r8lambdawJ5MHcSJed_CjC7r4OWD0UxyJsQ = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        view.getClass();
        focusRequesterModifierKt.getClass();
        setRight insets = focusRequesterModifierKt.IconCompatParcelizer.getInsets(519);
        insets.getClass();
        view.setPadding(view.getPaddingLeft(), insets.write, view.getPaddingRight(), insets.serializer);
        int i4 = r8lambdawJ5MHcSJed_CjC7r4OWD0UxyJsQ + 25;
        r8lambdayPQlaAoRiYRJ3IY_TqzUUTrVH0 = i4 % Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return focusRequesterModifierKt;
    }

    private final void MediaMetadataCompat(String str) {
        FrameLayout frameLayoutWrite;
        ddefault ddefaultVar;
        int i;
        Float f;
        ThrottledButton$$ExternalSyntheticLambda0 throttledButton$$ExternalSyntheticLambda0;
        int i2;
        int i3 = 2 % 2;
        int i4 = r8lambdayPQlaAoRiYRJ3IY_TqzUUTrVH0 + 45;
        r8lambdawJ5MHcSJed_CjC7r4OWD0UxyJsQ = i4 % Fields.SpotShadowColor;
        int i5 = i4 % 2;
        r8lambdawmxPERJX66sfUc7BfHYWeVjHcwo r8lambdawmxperjx66sfuc7bfhywevjhcwoPlaybackStateCompatCustomAction = PlaybackStateCompatCustomAction();
        DialogFragment4 dialogFragment4 = this.ResultReceiver;
        if (dialogFragment4 == null) {
            removeNodeAtDepth.serializer("binding");
            throw null;
        }
        int i6 = r8lambdayPQlaAoRiYRJ3IY_TqzUUTrVH0 + 123;
        r8lambdawJ5MHcSJed_CjC7r4OWD0UxyJsQ = i6 % Fields.SpotShadowColor;
        if (i6 % 2 != 0) {
            frameLayoutWrite = dialogFragment4.write();
            frameLayoutWrite.getClass();
            ddefaultVar = ddefault.IconCompatParcelizer;
            i = -1;
            f = null;
            throttledButton$$ExternalSyntheticLambda0 = null;
            i2 = 11;
        } else {
            frameLayoutWrite = dialogFragment4.write();
            frameLayoutWrite.getClass();
            ddefaultVar = ddefault.IconCompatParcelizer;
            i = -1;
            f = null;
            throttledButton$$ExternalSyntheticLambda0 = null;
            i2 = 48;
        }
        r8lambdawmxPERJX66sfUc7BfHYWeVjHcwo.IconCompatParcelizer(r8lambdawmxperjx66sfuc7bfhywevjhcwoPlaybackStateCompatCustomAction, frameLayoutWrite, str, ddefaultVar, i, f, throttledButton$$ExternalSyntheticLambda0, i2);
    }

    private final void RatingCompat(String str) {
        int i = 2 % 2;
        try {
            Intent intent = new Intent("android.intent.action.VIEW", Uri.parse(str));
            intent.addFlags(268435456);
            startActivity(intent);
            int i2 = r8lambdawJ5MHcSJed_CjC7r4OWD0UxyJsQ + 35;
            r8lambdayPQlaAoRiYRJ3IY_TqzUUTrVH0 = i2 % Fields.SpotShadowColor;
            if (i2 % 2 == 0) {
                int i3 = 21 / 0;
            }
        } catch (ActivityNotFoundException e) {
            String string = getString(R.string.error_no_web_browser_app);
            string.getClass();
            read(string, e);
        }
    }

    private final void MediaDescriptionCompat(String str) {
        int i = 2 % 2;
        int i2 = r8lambdayPQlaAoRiYRJ3IY_TqzUUTrVH0 + 79;
        r8lambdawJ5MHcSJed_CjC7r4OWD0UxyJsQ = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        r8lambdawmxPERJX66sfUc7BfHYWeVjHcwo r8lambdawmxperjx66sfuc7bfhywevjhcwoPlaybackStateCompatCustomAction = PlaybackStateCompatCustomAction();
        DialogFragment4 dialogFragment4 = this.ResultReceiver;
        if (dialogFragment4 == null) {
            removeNodeAtDepth.serializer("binding");
            throw null;
        }
        FrameLayout frameLayoutWrite = dialogFragment4.write();
        frameLayoutWrite.getClass();
        r8lambdawmxPERJX66sfUc7BfHYWeVjHcwo.IconCompatParcelizer(r8lambdawmxperjx66sfuc7bfhywevjhcwoPlaybackStateCompatCustomAction, frameLayoutWrite, str, ddefault.write, -2, null, new ThrottledButton$$ExternalSyntheticLambda0(10, this), 16);
        int i4 = r8lambdayPQlaAoRiYRJ3IY_TqzUUTrVH0 + 77;
        r8lambdawJ5MHcSJed_CjC7r4OWD0UxyJsQ = i4 % Fields.SpotShadowColor;
        int i5 = i4 % 2;
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0039  */
    private static final void IconCompatParcelizer(HelpCenterActivity helpCenterActivity, ActivityResult activityResult) {
        Uri[] uriArr;
        Uri data;
        int i = 2 % 2;
        int i2 = r8lambdayPQlaAoRiYRJ3IY_TqzUUTrVH0 + 121;
        r8lambdawJ5MHcSJed_CjC7r4OWD0UxyJsQ = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        activityResult.getClass();
        if (activityResult.write != -1) {
            uriArr = null;
        } else {
            Intent intent = activityResult.RemoteActionCompatParcelizer;
            if (intent == null || (data = intent.getData()) == null) {
                data = helpCenterActivity.ComponentActivity;
            }
            if (data != null) {
                int i4 = r8lambdawJ5MHcSJed_CjC7r4OWD0UxyJsQ + 55;
                r8lambdayPQlaAoRiYRJ3IY_TqzUUTrVH0 = i4 % Fields.SpotShadowColor;
                if (i4 % 2 == 0) {
                    uriArr = new Uri[1];
                    uriArr[1] = data;
                } else {
                    uriArr = new Uri[]{data};
                }
            } else {
                uriArr = null;
            }
        }
        ValueCallback<Uri[]> valueCallback = helpCenterActivity.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM;
        if (valueCallback != null) {
            int i5 = r8lambdayPQlaAoRiYRJ3IY_TqzUUTrVH0 + 89;
            r8lambdawJ5MHcSJed_CjC7r4OWD0UxyJsQ = i5 % Fields.SpotShadowColor;
            int i6 = i5 % 2;
            valueCallback.onReceiveValue(uriArr);
        }
        helpCenterActivity.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM = null;
    }

    private final void PlaybackStateCompat() {
        int i = 2 % 2;
        int i2 = r8lambdawJ5MHcSJed_CjC7r4OWD0UxyJsQ + 81;
        r8lambdayPQlaAoRiYRJ3IY_TqzUUTrVH0 = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        DialogFragment4 dialogFragment4 = this.ResultReceiver;
        if (dialogFragment4 == null) {
            removeNodeAtDepth.serializer("binding");
            throw null;
        }
        FrameLayout frameLayoutWrite = dialogFragment4.write();
        MapboxVoiceInstructionsPlayer$Companion$$ExternalSyntheticLambda0 mapboxVoiceInstructionsPlayer$Companion$$ExternalSyntheticLambda0 = new MapboxVoiceInstructionsPlayer$Companion$$ExternalSyntheticLambda0(6);
        WeakHashMap weakHashMap = FocusPropertiesNode.RatingCompat;
        accessgetCancelcp.write(frameLayoutWrite, mapboxVoiceInstructionsPlayer$Companion$$ExternalSyntheticLambda0);
        DialogFragment4 dialogFragment5 = this.ResultReceiver;
        if (dialogFragment5 == null) {
            removeNodeAtDepth.serializer("binding");
            throw null;
        }
        int i4 = r8lambdayPQlaAoRiYRJ3IY_TqzUUTrVH0 + 15;
        r8lambdawJ5MHcSJed_CjC7r4OWD0UxyJsQ = i4 % Fields.SpotShadowColor;
        if (i4 % 2 != 0) {
            dialogFragment5.write().requestApplyInsets();
            int i5 = 12 / 0;
        } else {
            dialogFragment5.write().requestApplyInsets();
        }
        int i6 = r8lambdayPQlaAoRiYRJ3IY_TqzUUTrVH0 + 87;
        r8lambdawJ5MHcSJed_CjC7r4OWD0UxyJsQ = i6 % Fields.SpotShadowColor;
        int i7 = i6 % 2;
    }

    private final void serializer(boolean z) {
        int i;
        int i2 = 2 % 2;
        div7Ah8Wj8 supportFragmentManager = getSupportFragmentManager();
        supportFragmentManager.getClass();
        LoadingDialogFullScreen loadingDialogFullScreenSerializer = enableVerboseLogging.serializer(supportFragmentManager);
        div7Ah8Wj8 supportFragmentManager2 = getSupportFragmentManager();
        supportFragmentManager2.getClass();
        loadingDialogFullScreenSerializer.read(supportFragmentManager2, z);
        DialogFragment4 dialogFragment4 = this.ResultReceiver;
        if (dialogFragment4 == null) {
            removeNodeAtDepth.serializer("binding");
            throw null;
        }
        int i3 = r8lambdawJ5MHcSJed_CjC7r4OWD0UxyJsQ + 51;
        r8lambdayPQlaAoRiYRJ3IY_TqzUUTrVH0 = i3 % Fields.SpotShadowColor;
        int i4 = i3 % 2;
        WebView webView = dialogFragment4.write;
        if (z) {
            int i5 = r8lambdayPQlaAoRiYRJ3IY_TqzUUTrVH0 + 115;
            r8lambdawJ5MHcSJed_CjC7r4OWD0UxyJsQ = i5 % Fields.SpotShadowColor;
            i = i5 % 2 != 0 ? 75 : 8;
        } else {
            i = 0;
        }
        webView.setVisibility(i);
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0057, code lost:
    
        if ((r6 % 2) == 0) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0059, code lost:
    
        r6 = 61 / 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x005c, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x005d, code lost:
    
        o.removeNodeAtDepth.serializer("binding");
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0063, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:?, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0024, code lost:
    
        if (r1 != null) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x003a, code lost:
    
        if (r1 != null) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x003c, code lost:
    
        r1.write.evaluateJavascript(bo.app.ff$$ExternalSyntheticOutline0.m("window.sendBridgeMessageFromAndroid(", r6, ")"), new com.roadrunner.helpcenter.presentation.activity.HelpCenterActivity$$ExternalSyntheticLambda3());
        r6 = com.roadrunner.helpcenter.presentation.activity.HelpCenterActivity.r8lambdayPQlaAoRiYRJ3IY_TqzUUTrVH0 + 75;
        com.roadrunner.helpcenter.presentation.activity.HelpCenterActivity.r8lambdawJ5MHcSJed_CjC7r4OWD0UxyJsQ = r6 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void read(o.getListParameter r6) {
        /*
            r5 = this;
            r0 = 2
            int r1 = r0 % r0
            int r1 = com.roadrunner.helpcenter.presentation.activity.HelpCenterActivity.r8lambdawJ5MHcSJed_CjC7r4OWD0UxyJsQ
            int r1 = r1 + 21
            int r2 = r1 % 128
            com.roadrunner.helpcenter.presentation.activity.HelpCenterActivity.r8lambdayPQlaAoRiYRJ3IY_TqzUUTrVH0 = r2
            int r1 = r1 % r0
            java.lang.String r2 = "bridge_message_sent = %s"
            r3 = 0
            if (r1 != 0) goto L27
            o.resetTransientState r1 = r5.r8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8
            o.getUserVisibleHint r4 = o.getUserVisibleHint.serializer
            java.lang.String r6 = r1.RemoteActionCompatParcelizer(r4, r6)
            timber.log.Timber$Forest r1 = timber.log.Timber.RemoteActionCompatParcelizer
            java.lang.Object[] r4 = new java.lang.Object[r3]
            r4[r3] = r6
            r1.IconCompatParcelizer(r2, r4)
            o.DialogFragment4 r1 = r5.ResultReceiver
            if (r1 == 0) goto L5d
            goto L3c
        L27:
            o.resetTransientState r1 = r5.r8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8
            o.getUserVisibleHint r4 = o.getUserVisibleHint.serializer
            java.lang.String r6 = r1.RemoteActionCompatParcelizer(r4, r6)
            timber.log.Timber$Forest r1 = timber.log.Timber.RemoteActionCompatParcelizer
            java.lang.Object[] r4 = new java.lang.Object[]{r6}
            r1.IconCompatParcelizer(r2, r4)
            o.DialogFragment4 r1 = r5.ResultReceiver
            if (r1 == 0) goto L5d
        L3c:
            android.webkit.WebView r1 = r1.write
            java.lang.String r2 = "window.sendBridgeMessageFromAndroid("
            java.lang.String r4 = ")"
            java.lang.String r6 = bo.app.ff$$ExternalSyntheticOutline0.m(r2, r6, r4)
            com.roadrunner.helpcenter.presentation.activity.HelpCenterActivity$$ExternalSyntheticLambda3 r2 = new com.roadrunner.helpcenter.presentation.activity.HelpCenterActivity$$ExternalSyntheticLambda3
            r2.<init>()
            r1.evaluateJavascript(r6, r2)
            int r6 = com.roadrunner.helpcenter.presentation.activity.HelpCenterActivity.r8lambdayPQlaAoRiYRJ3IY_TqzUUTrVH0
            int r6 = r6 + 75
            int r1 = r6 % 128
            com.roadrunner.helpcenter.presentation.activity.HelpCenterActivity.r8lambdawJ5MHcSJed_CjC7r4OWD0UxyJsQ = r1
            int r6 = r6 % r0
            if (r6 == 0) goto L5c
            r6 = 61
            int r6 = r6 / r3
        L5c:
            return
        L5d:
            java.lang.String r6 = "binding"
            o.removeNodeAtDepth.serializer(r6)
            r6 = 0
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.roadrunner.helpcenter.presentation.activity.HelpCenterActivity.read(o.getListParameter):void");
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        ViewGroup viewGroup;
        int i = 2 % 2;
        int i2 = r8lambdawJ5MHcSJed_CjC7r4OWD0UxyJsQ + 43;
        r8lambdayPQlaAoRiYRJ3IY_TqzUUTrVH0 = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        DialogFragment4 dialogFragment4 = this.ResultReceiver;
        if (dialogFragment4 != null) {
            WebView webView = dialogFragment4.write;
            if (((FirebaseRemoteConfigImpl) MediaSessionCompatResultReceiverWrapper()).IconCompatParcelizer.IconCompatParcelizer(updateAdidI.IS_WEBVIEW_DETACH_ON_DESTROY_ENABLED.getFirebaseFlagName())) {
                int i4 = r8lambdayPQlaAoRiYRJ3IY_TqzUUTrVH0 + 35;
                r8lambdawJ5MHcSJed_CjC7r4OWD0UxyJsQ = i4 % Fields.SpotShadowColor;
                int i5 = i4 % 2;
                ViewParent parent = webView.getParent();
                if (parent instanceof ViewGroup) {
                    viewGroup = (ViewGroup) parent;
                } else {
                    int i6 = r8lambdawJ5MHcSJed_CjC7r4OWD0UxyJsQ + 107;
                    r8lambdayPQlaAoRiYRJ3IY_TqzUUTrVH0 = i6 % Fields.SpotShadowColor;
                    int i7 = i6 % 2;
                    viewGroup = null;
                }
                if (viewGroup != null) {
                    viewGroup.removeView(webView);
                }
            }
            webView.destroy();
        }
        super.onDestroy();
    }

    private final void write(String str) {
        int i = 2 % 2;
        int i2 = r8lambdawJ5MHcSJed_CjC7r4OWD0UxyJsQ + 105;
        r8lambdayPQlaAoRiYRJ3IY_TqzUUTrVH0 = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        if (hideCurrentlyDisplayingInAppMessage.IconCompatParcelizer((CharSequence) str, (CharSequence) "systemsettings", true)) {
            startActivity(new Intent("android.settings.SETTINGS"));
        } else if (hideCurrentlyDisplayingInAppMessage.IconCompatParcelizer((CharSequence) str, (CharSequence) "appsettings", true)) {
            startActivity(new Intent("android.settings.APPLICATION_DETAILS_SETTINGS", Uri.fromParts("package", getPackageName(), null)));
            int i4 = r8lambdawJ5MHcSJed_CjC7r4OWD0UxyJsQ + 3;
            r8lambdayPQlaAoRiYRJ3IY_TqzUUTrVH0 = i4 % Fields.SpotShadowColor;
            int i5 = i4 % 2;
        }
    }

    private final void r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus() {
        int i = 2 % 2;
        isAdapterPositionOnScreen isadapterpositiononscreen = new isAdapterPositionOnScreen(new ComposableSingletonsAndroidDialog_androidKtlambda2101488961(29));
        inRing inringMediaDescriptionCompat = MediaDescriptionCompat();
        getHost gethost = new getHost(this, 0);
        ActivityResultRegistry activityResultRegistry = getActivityResultRegistry();
        activityResultRegistry.getClass();
        this.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg = ((r8lambdaD96myUSzBh8SDkhp_7hY_RGQMM) inringMediaDescriptionCompat).RemoteActionCompatParcelizer(gethost, activityResultRegistry, write(isadapterpositiononscreen));
        supportsColorMatrixQuery lifecycle = getLifecycle();
        r8lambda2vBtwyPX8g68gaqnZ343rZwzI r8lambda2vbtwypx8g68gaqnz343rzwzi = this.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg;
        Object obj = null;
        if (r8lambda2vbtwypx8g68gaqnz343rzwzi == null) {
            removeNodeAtDepth.serializer("permissionLifecycleHandler");
            throw null;
        }
        int i2 = r8lambdayPQlaAoRiYRJ3IY_TqzUUTrVH0 + 55;
        r8lambdawJ5MHcSJed_CjC7r4OWD0UxyJsQ = i2 % Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            lifecycle.IconCompatParcelizer(r8lambda2vbtwypx8g68gaqnz343rzwzi);
            obj.hashCode();
            throw null;
        }
        lifecycle.IconCompatParcelizer(r8lambda2vbtwypx8g68gaqnz343rzwzi);
        int i3 = r8lambdayPQlaAoRiYRJ3IY_TqzUUTrVH0 + 69;
        r8lambdawJ5MHcSJed_CjC7r4OWD0UxyJsQ = i3 % Fields.SpotShadowColor;
        int i4 = i3 % 2;
    }

    private final void r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg() {
        int i = 2 % 2;
        Intent intent = new Intent("android.intent.action.GET_CONTENT");
        intent.addCategory("android.intent.category.OPENABLE");
        intent.setType("*/*");
        Uri uriR8lambda54BeH8ZsBru0CXI2CCSP2syNys = r8lambda54BeH8ZsBru0CXI2CCSP2syNys();
        this.ComponentActivity = uriR8lambda54BeH8ZsBru0CXI2CCSP2syNys;
        Intent intentPutExtra = new Intent("android.media.action.IMAGE_CAPTURE").putExtra("output", uriR8lambda54BeH8ZsBru0CXI2CCSP2syNys);
        intentPutExtra.getClass();
        Intent intentCreateChooser = Intent.createChooser(intent, "");
        intentCreateChooser.putExtra("android.intent.extra.INITIAL_INTENTS", new Intent[]{intentPutExtra});
        this.r8lambdaXj9c8VIP9DfEvaTmZt0ejAuC4a4.write(intentCreateChooser);
        int i2 = r8lambdayPQlaAoRiYRJ3IY_TqzUUTrVH0 + 91;
        r8lambdawJ5MHcSJed_CjC7r4OWD0UxyJsQ = i2 % Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private final void ComponentActivity() throws NoSuchMethodException {
        int i = 2 % 2;
        int i2 = r8lambdayPQlaAoRiYRJ3IY_TqzUUTrVH0 + 91;
        r8lambdawJ5MHcSJed_CjC7r4OWD0UxyJsQ = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        int i4 = deleteRegisteredGeofenceCacheandroid_sdk_base_release.read();
        int i5 = deleteRegisteredGeofenceCacheandroid_sdk_base_release.read();
        int i6 = sourceInformationContextOfdefault.read();
        IconCompatParcelizer(sourceInformationContextOfdefault.read(), i6, i5, i4, -749203157, 749203167, new Object[]{this});
        DialogFragment4 dialogFragment4 = this.ResultReceiver;
        if (dialogFragment4 == null) {
            removeNodeAtDepth.serializer("binding");
            throw null;
        }
        WebView webView = dialogFragment4.write;
        webView.setScrollBarStyle(33554432);
        webView.setScrollbarFadingEnabled(false);
        webView.setWebChromeClient(new WebChromeClient() { // from class: com.roadrunner.helpcenter.presentation.activity.HelpCenterActivity$initWebView$1$1
            private static int read = 1;
            private static int serializer;

            @Override // android.webkit.WebChromeClient
            public final boolean onShowFileChooser(WebView webView2, ValueCallback valueCallback, WebChromeClient.FileChooserParams fileChooserParams) {
                int i7 = 2 % 2;
                int i8 = serializer + 55;
                read = i8 % Fields.SpotShadowColor;
                if (i8 % 2 == 0) {
                    HelpCenterActivity helpCenterActivity = this.write;
                    HelpCenterActivity.RemoteActionCompatParcelizer(helpCenterActivity, valueCallback);
                    HelpCenterActivity.RemoteActionCompatParcelizer(helpCenterActivity);
                    throw null;
                }
                HelpCenterActivity helpCenterActivity2 = this.write;
                HelpCenterActivity.RemoteActionCompatParcelizer(helpCenterActivity2, valueCallback);
                r8lambda2vBtwyPX8g68gaqnZ343rZwzI r8lambda2vbtwypx8g68gaqnz343rzwziRemoteActionCompatParcelizer = HelpCenterActivity.RemoteActionCompatParcelizer(helpCenterActivity2);
                if (r8lambda2vbtwypx8g68gaqnz343rzwziRemoteActionCompatParcelizer == null) {
                    removeNodeAtDepth.serializer("permissionLifecycleHandler");
                    throw null;
                }
                int i9 = serializer + 3;
                read = i9 % Fields.SpotShadowColor;
                int i10 = i9 % 2;
                r8lambdaBtq4C7Gm1QxfvCp_VmH0bvXHTU r8lambdabtq4c7gm1qxfvcp_vmh0bvxhtu = (r8lambdaBtq4C7Gm1QxfvCp_VmH0bvXHTU) r8lambda2vbtwypx8g68gaqnz343rzwziRemoteActionCompatParcelizer;
                onBackPressed onbackpressed = r8lambdabtq4c7gm1qxfvcp_vmh0bvxhtu.write;
                if (onbackpressed != null) {
                    onbackpressed.write(r8lambdabtq4c7gm1qxfvcp_vmh0bvxhtu.IconCompatParcelizer);
                    return true;
                }
                removeNodeAtDepth.serializer("activityResultLauncher");
                throw null;
            }
        });
        webView.setWebViewClient(new WebViewClient() { // from class: com.roadrunner.helpcenter.presentation.activity.HelpCenterActivity$initWebView$1$2
            private static int read = 0;
            private static int write = 1;

            @Override // android.webkit.WebViewClient
            public final void onPageStarted(WebView webView2, String str, Bitmap bitmap) {
                super.onPageStarted(webView2, str, bitmap);
                getLoaderManager getloadermanagerSerializer = HelpCenterActivity.serializer(this.serializer);
                getloadermanagerSerializer.MediaSessionCompatToken.IconCompatParcelizer();
                getExitAnim getexitanim = getloadermanagerSerializer.RatingCompat;
                synchronized (getexitanim.write) {
                    getexitanim.MediaBrowserCompatMediaItem.getClass();
                    getexitanim.MediaSessionCompatQueueItem = Long.valueOf(System.currentTimeMillis());
                }
            }

            @Override // android.webkit.WebViewClient
            public final boolean shouldOverrideUrlLoading(WebView webView2, WebResourceRequest webResourceRequest) {
                int i7 = 2 % 2;
                Uri url = null;
                if (webResourceRequest != null) {
                    int i8 = write + 77;
                    read = i8 % Fields.SpotShadowColor;
                    if (i8 % 2 != 0) {
                        webResourceRequest.getUrl();
                        throw null;
                    }
                    url = webResourceRequest.getUrl();
                }
                if (!HelpCenterActivity.IconCompatParcelizer(this.serializer, url) && !super.shouldOverrideUrlLoading(webView2, webResourceRequest)) {
                    return false;
                }
                int i9 = write + 37;
                read = i9 % Fields.SpotShadowColor;
                if (i9 % 2 != 0) {
                    int i10 = 9 / 0;
                }
                return true;
            }

            @Override // android.webkit.WebViewClient
            public final boolean onRenderProcessGone(WebView webView2, RenderProcessGoneDetail renderProcessGoneDetail) {
                int i7 = 2 % 2;
                renderProcessGoneDetail.getClass();
                HelpCenterActivity helpCenterActivity = this.serializer;
                if (!((FirebaseRemoteConfigImpl) helpCenterActivity.MediaSessionCompatResultReceiverWrapper()).r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM()) {
                    return super.onRenderProcessGone(webView2, renderProcessGoneDetail);
                }
                int i8 = write + 89;
                read = i8 % Fields.SpotShadowColor;
                int i9 = i8 % 2;
                HelpCenterActivity.RemoteActionCompatParcelizer(helpCenterActivity, webView2);
                HelpCenterActivity.serializer(helpCenterActivity).RatingCompat();
                int i10 = read + 13;
                write = i10 % Fields.SpotShadowColor;
                if (i10 % 2 != 0) {
                    return true;
                }
                Object obj = null;
                obj.hashCode();
                throw null;
            }

            @Override // android.webkit.WebViewClient
            public final void onReceivedError(WebView webView2, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
                int i7 = 2 % 2;
                int i8 = write + 57;
                read = i8 % Fields.SpotShadowColor;
                int i9 = i8 % 2;
                super.onReceivedError(webView2, webResourceRequest, webResourceError);
                getLoaderManager getloadermanagerSerializer = HelpCenterActivity.serializer(this.serializer);
                Uri url = null;
                if (webResourceRequest != null) {
                    int i10 = read + 45;
                    write = i10 % Fields.SpotShadowColor;
                    if (i10 % 2 == 0) {
                        webResourceRequest.getUrl();
                        throw null;
                    }
                    url = webResourceRequest.getUrl();
                }
                if (setCarryoverInAppMessage.serializer(((getPopDirection) getloadermanagerSerializer.serializer().write()).read, String.valueOf(url), true)) {
                    int i11 = read + 43;
                    write = i11 % Fields.SpotShadowColor;
                    int i12 = i11 % 2;
                    getloadermanagerSerializer.RemoteActionCompatParcelizer(invokeSuspendcomroadrunnerremoteconfigfirebaseanalyticsFirebaseFlagLoggerImpllogTrackedFirebaseFlags111.ERROR_WEB_VIEW_URL_LOADING_FAILED);
                    EnumColumnAdapter.serializer(getloadermanagerSerializer.serializer.read, "endpoint_help_center_not_loaded", executeAsList.INFRA, "Failed to Load Help Center URL in WebView");
                }
            }
        });
        WebSettings settings = webView.getSettings();
        settings.setJavaScriptEnabled(true);
        settings.setJavaScriptCanOpenWindowsAutomatically(true);
        settings.setDomStorageEnabled(true);
        settings.setBuiltInZoomControls(true);
        settings.setDisplayZoomControls(false);
        settings.setAllowFileAccess(true);
        settings.setAllowContentAccess(true);
        settings.setMediaPlaybackRequiresUserGesture(true);
        webView.addJavascriptInterface(new getPostOnViewCreatedAlpha(this), "hcAndroidBridgeEntry");
        int i7 = r8lambdawJ5MHcSJed_CjC7r4OWD0UxyJsQ + 35;
        r8lambdayPQlaAoRiYRJ3IY_TqzUUTrVH0 = i7 % Fields.SpotShadowColor;
        int i8 = i7 % 2;
    }

    private static final createFromParcel IconCompatParcelizer(HelpCenterActivity helpCenterActivity, getSharedElementReturnTransition getsharedelementreturntransition) {
        int i = 2 % 2;
        getsharedelementreturntransition.getClass();
        if (getsharedelementreturntransition.equals(getReenterTransition.serializer)) {
            int i2 = r8lambdawJ5MHcSJed_CjC7r4OWD0UxyJsQ + 103;
            r8lambdayPQlaAoRiYRJ3IY_TqzUUTrVH0 = i2 % Fields.SpotShadowColor;
            int i3 = i2 % 2;
            helpCenterActivity.finish();
        } else if (!(!(getsharedelementreturntransition instanceof getReturnTransition))) {
            helpCenterActivity.finish();
        } else if (getsharedelementreturntransition instanceof getSharedElementSourceNames) {
            helpCenterActivity.read(((getSharedElementSourceNames) getsharedelementreturntransition).IconCompatParcelizer());
        } else {
            Object obj = null;
            if (getsharedelementreturntransition instanceof getTargetRequestCode) {
                int i4 = r8lambdayPQlaAoRiYRJ3IY_TqzUUTrVH0 + 27;
                r8lambdawJ5MHcSJed_CjC7r4OWD0UxyJsQ = i4 % Fields.SpotShadowColor;
                if (i4 % 2 != 0) {
                    helpCenterActivity.MediaDescriptionCompat(((getTargetRequestCode) getsharedelementreturntransition).RemoteActionCompatParcelizer());
                    throw null;
                }
                helpCenterActivity.MediaDescriptionCompat(((getTargetRequestCode) getsharedelementreturntransition).RemoteActionCompatParcelizer());
            } else if (getsharedelementreturntransition instanceof getRetainInstance) {
                helpCenterActivity.RatingCompat(((getRetainInstance) getsharedelementreturntransition).serializer());
            } else {
                if (!(getsharedelementreturntransition instanceof getSharedElementEnterTransition)) {
                    ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer();
                    return null;
                }
                int i5 = r8lambdayPQlaAoRiYRJ3IY_TqzUUTrVH0 + 97;
                r8lambdawJ5MHcSJed_CjC7r4OWD0UxyJsQ = i5 % Fields.SpotShadowColor;
                if (i5 % 2 != 0) {
                    helpCenterActivity.ResultReceiver().RemoteActionCompatParcelizer();
                    obj.hashCode();
                    throw null;
                }
                helpCenterActivity.ResultReceiver().RemoteActionCompatParcelizer();
            }
        }
        return createFromParcel.INSTANCE;
    }

    @Override // com.ui.common.base.BaseInjectionActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) throws Exception {
        int i = 2;
        int i2 = 2 % 2;
        super.onCreate(bundle);
        try {
            DialogFragment4 dialogFragment4RemoteActionCompatParcelizer = DialogFragment4.RemoteActionCompatParcelizer(getLayoutInflater());
            this.ResultReceiver = dialogFragment4RemoteActionCompatParcelizer;
            setContentView(dialogFragment4RemoteActionCompatParcelizer.write());
            PlaybackStateCompat();
            ComponentActivity();
            ResultReceiver().read();
            ResultReceiver().MediaBrowserCompatMediaItem();
            ResultReceiver().MediaDescriptionCompat();
            ResultReceiver().serializer().serializer().serializer(this, new ActualSweepGradientShader9KIMszo(new getMinimumMaxLifecycleState(this, 1), 3));
            r8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss();
            getLifecycle().IconCompatParcelizer(read());
            r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus();
            int i3 = deleteRegisteredGeofenceCacheandroid_sdk_base_release.read();
            int i4 = sourceInformationContextOfdefault.read();
            int iCodePointAt = ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.abc_menu_meta_shortcut_label).substring(0, 1).codePointAt(0) + 2084227227;
            IconCompatParcelizer(sourceInformationContextOfdefault.read(), iCodePointAt, i4, i3, 246121986, -246121978, new Object[]{this});
            defaultViewModelProviderFactory_delegatelambda0 onBackPressedDispatcher = getOnBackPressedDispatcher();
            onBackPressedDispatcher.getClass();
            LazyKt__LazyJVMKt.serializer(onBackPressedDispatcher, this, new getMinimumMaxLifecycleState(this, i));
            int i5 = r8lambdawJ5MHcSJed_CjC7r4OWD0UxyJsQ + 121;
            r8lambdayPQlaAoRiYRJ3IY_TqzUUTrVH0 = i5 % Fields.SpotShadowColor;
            int i6 = i5 % 2;
        } catch (Exception e) {
            FirebaseRemoteConfigImpl firebaseRemoteConfigImpl = (FirebaseRemoteConfigImpl) MediaSessionCompatResultReceiverWrapper();
            firebaseRemoteConfigImpl.getClass();
            if (!firebaseRemoteConfigImpl.IconCompatParcelizer(updateAdidI.IS_ANDROID_16_WEBVIEW_CRASH_FIX_ENABLED)) {
                throw e;
            }
            Timber.RemoteActionCompatParcelizer.RemoteActionCompatParcelizer(e, "Help center activity inflate failed", new Object[0]);
            finish();
            int i7 = r8lambdawJ5MHcSJed_CjC7r4OWD0UxyJsQ + 13;
            r8lambdayPQlaAoRiYRJ3IY_TqzUUTrVH0 = i7 % Fields.SpotShadowColor;
            if (i7 % 2 == 0) {
                int i8 = 18 / 0;
            }
        }
    }

    private final boolean write(Uri uri) throws NoSuchMethodException {
        int i = 2 % 2;
        String scheme = uri != null ? uri.getScheme() : null;
        if (scheme != null) {
            int iHashCode = scheme.hashCode();
            if (iHashCode != -506558896) {
                if (iHashCode != 114715) {
                    if (iHashCode == 1434631203 && scheme.equals("settings")) {
                        String string = uri.toString();
                        string.getClass();
                        write(string);
                        return true;
                    }
                } else if (scheme.equals("tel")) {
                    Intent intent = new Intent("android.intent.action.DIAL");
                    intent.setData(uri);
                    startActivity(intent);
                    return true;
                }
            } else if (scheme.equals("roadrunner")) {
                String path = uri.getPath();
                if (path != null) {
                    int iHashCode2 = path.hashCode();
                    if (iHashCode2 != -4250139) {
                        if (iHashCode2 == 1415256786 && path.equals("/notificationdiagnostics")) {
                            ((setType) MediaBrowserCompatMediaItem()).serializer();
                            int i2 = r8lambdawJ5MHcSJed_CjC7r4OWD0UxyJsQ + 1;
                            r8lambdayPQlaAoRiYRJ3IY_TqzUUTrVH0 = i2 % Fields.SpotShadowColor;
                            if (i2 % 2 == 0) {
                                int i3 = 76 / 0;
                            }
                            return true;
                        }
                    } else {
                        if (path.equals("/customerchat")) {
                            getLoaderManager.read(sourceInformationContextOfdefault.read(), -84177799, 84177800, sourceInformationContextOfdefault.read(), sourceInformationContextOfdefault.read(), sourceInformationContextOfdefault.read(), new Object[]{ResultReceiver()});
                            return true;
                        }
                        int i4 = r8lambdayPQlaAoRiYRJ3IY_TqzUUTrVH0 + 7;
                        r8lambdawJ5MHcSJed_CjC7r4OWD0UxyJsQ = i4 % Fields.SpotShadowColor;
                        int i5 = i4 % 2;
                    }
                }
                int length = ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.customer_chat_user_left_channel).substring(0, 4).length() + 1618205705;
                IconCompatParcelizer(deleteRegisteredGeofenceCacheandroid_sdk_base_release.read(), deleteRegisteredGeofenceCacheandroid_sdk_base_release.read(), deleteRegisteredGeofenceCacheandroid_sdk_base_release.read(), length, 1139609893, -1139609889, new Object[]{this, uri});
                return true;
            }
        }
        if (!((Boolean) getLoaderManager.read(sourceInformationContextOfdefault.read(), -1897123027, 1897123027, sourceInformationContextOfdefault.read(), sourceInformationContextOfdefault.read(), sourceInformationContextOfdefault.read(), new Object[]{ResultReceiver()})).booleanValue()) {
            return false;
        }
        int i6 = r8lambdawJ5MHcSJed_CjC7r4OWD0UxyJsQ + 49;
        r8lambdayPQlaAoRiYRJ3IY_TqzUUTrVH0 = i6 % Fields.SpotShadowColor;
        if (i6 % 2 == 0) {
            RatingCompat(String.valueOf(uri));
            return false;
        }
        RatingCompat(String.valueOf(uri));
        return true;
    }

    static void ParcelableVolumeInfo() {
        r8lambdag6d1IyBXWIL5aeSAzXsZMVuYCQs = (byte) -112;
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

    public final getRestLineXSAIIZE write() {
        int i = sourceInformationContextOfdefault.read();
        int length = (-126482271) + ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.abc_menu_sym_shortcut_label).substring(0, 1).length();
        return (getRestLineXSAIIZE) IconCompatParcelizer(((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.accept_screen_product_item).substring(0, 4).length() + 978986530, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion - 721013897, length, i, 1147907538, -1147907533, new Object[]{this});
    }

    private static final getLoaderManager serializer(HelpCenterActivity helpCenterActivity, getBitmapui_graphics getbitmapui_graphics) {
        int i = sourceInformationContextOfdefault.read();
        int i2 = sourceInformationContextOfdefault.read();
        int i3 = sourceInformationContextOfdefault.read();
        return (getLoaderManager) IconCompatParcelizer(sourceInformationContextOfdefault.read(), i3, i2, i, -478812049, 478812061, new Object[]{helpCenterActivity, getbitmapui_graphics});
    }

    private final void r8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8() throws NoSuchMethodException {
        int i = sourceInformationContextOfdefault.read();
        int i2 = sourceInformationContextOfdefault.read();
        int i3 = sourceInformationContextOfdefault.read();
        IconCompatParcelizer(sourceInformationContextOfdefault.read(), i3, i2, i, -1677732720, 1677732721, new Object[]{this});
    }

    private final void r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM() throws NoSuchMethodException {
        int i = deleteRegisteredGeofenceCacheandroid_sdk_base_release.read();
        int i2 = sourceInformationContextOfdefault.read();
        int iCodePointAt = 2084227227 + ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.abc_menu_meta_shortcut_label).substring(0, 1).codePointAt(0);
        IconCompatParcelizer(sourceInformationContextOfdefault.read(), iCodePointAt, i2, i, 246121986, -246121978, new Object[]{this});
    }

    private final void read(Uri uri) throws NoSuchMethodException {
        int length = ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.customer_chat_user_left_channel).substring(0, 4).length() + 1618205705;
        int i = deleteRegisteredGeofenceCacheandroid_sdk_base_release.read();
        int i2 = deleteRegisteredGeofenceCacheandroid_sdk_base_release.read();
        IconCompatParcelizer(deleteRegisteredGeofenceCacheandroid_sdk_base_release.read(), i2, i, length, 1139609893, -1139609889, new Object[]{this, uri});
    }

    private static final createFromParcel IconCompatParcelizer(HelpCenterActivity helpCenterActivity, getPopDirection getpopdirection) {
        int i = sourceInformationContextOfdefault.read();
        int i2 = sourceInformationContextOfdefault.read();
        int i3 = sourceInformationContextOfdefault.read();
        return (createFromParcel) IconCompatParcelizer(sourceInformationContextOfdefault.read(), i3, i2, i, -389023126, 389023132, new Object[]{helpCenterActivity, getpopdirection});
    }

    private final void r8lambda7IJBVrN0sHyidCAZufWEJFc7yY() throws NoSuchMethodException {
        int i = deleteRegisteredGeofenceCacheandroid_sdk_base_release.read();
        int i2 = deleteRegisteredGeofenceCacheandroid_sdk_base_release.read();
        int i3 = sourceInformationContextOfdefault.read();
        IconCompatParcelizer(sourceInformationContextOfdefault.read(), i3, i2, i, -749203157, 749203167, new Object[]{this});
    }

    private static final void IconCompatParcelizer(HelpCenterActivity helpCenterActivity, boolean z) throws NoSuchMethodException {
        Object[] objArr = {helpCenterActivity, Boolean.valueOf(z)};
        int i = sourceInformationContextOfdefault.read();
        int i2 = sourceInformationContextOfdefault.read();
        IconCompatParcelizer(sourceInformationContextOfdefault.read(), sourceInformationContextOfdefault.read(), i2, i, -1009493337, 1009493339, objArr);
    }

    public static final /* synthetic */ void write(HelpCenterActivity helpCenterActivity) throws NoSuchMethodException {
        int i = sourceInformationContextOfdefault.read();
        int i2 = sourceInformationContextOfdefault.read();
        int i3 = sourceInformationContextOfdefault.read();
        IconCompatParcelizer(sourceInformationContextOfdefault.read(), i3, i2, i, 447823188, -447823179, new Object[]{helpCenterActivity});
    }

    public static /* synthetic */ getLoaderManager write(HelpCenterActivity helpCenterActivity, getBitmapui_graphics getbitmapui_graphics) {
        int i = sourceInformationContextOfdefault.read();
        int i2 = sourceInformationContextOfdefault.read();
        int i3 = sourceInformationContextOfdefault.read();
        return (getLoaderManager) IconCompatParcelizer(sourceInformationContextOfdefault.read(), i3, i2, i, 1577451406, -1577451406, new Object[]{helpCenterActivity, getbitmapui_graphics});
    }

    public static /* synthetic */ void RemoteActionCompatParcelizer(HelpCenterActivity helpCenterActivity, boolean z) throws NoSuchMethodException {
        Object[] objArr = {helpCenterActivity, Boolean.valueOf(z)};
        int i = sourceInformationContextOfdefault.read();
        int i2 = sourceInformationContextOfdefault.read();
        IconCompatParcelizer(sourceInformationContextOfdefault.read(), sourceInformationContextOfdefault.read(), i2, i, 2100559417, -2100559414, objArr);
    }

    public static /* synthetic */ createFromParcel IconCompatParcelizer(HelpCenterActivity helpCenterActivity, OnBackPressedCallback onBackPressedCallback) {
        int i = sourceInformationContextOfdefault.read();
        int i2 = sourceInformationContextOfdefault.read();
        int i3 = sourceInformationContextOfdefault.read();
        return (createFromParcel) IconCompatParcelizer(sourceInformationContextOfdefault.read(), i3, i2, i, -1839402844, 1839402851, new Object[]{helpCenterActivity, onBackPressedCallback});
    }

    public static /* synthetic */ createFromParcel RemoteActionCompatParcelizer(HelpCenterActivity helpCenterActivity, getSharedElementReturnTransition getsharedelementreturntransition) {
        int i = sourceInformationContextOfdefault.read();
        int i2 = sourceInformationContextOfdefault.read();
        int i3 = sourceInformationContextOfdefault.read();
        return (createFromParcel) IconCompatParcelizer(sourceInformationContextOfdefault.read(), i3, i2, i, 1161135286, -1161135275, new Object[]{helpCenterActivity, getsharedelementreturntransition});
    }
}
