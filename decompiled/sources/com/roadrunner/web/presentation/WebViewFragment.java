package com.roadrunner.web.presentation;

import android.app.Dialog;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.net.http.SslError;
import android.os.Bundle;
import android.view.InflateException;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.Window;
import android.webkit.PermissionRequest;
import android.webkit.SslErrorHandler;
import android.webkit.ValueCallback;
import android.webkit.WebChromeClient;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Toast;
import androidx.activity.ComponentDialog;
import androidx.activity.result.ActivityResultRegistry;
import androidx.compose.ui.graphics.Fields;
import androidx.compose.ui.platform.ComposeView;
import androidx.compose.ui.platform.ViewCompositionStrategy;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.FragmentActivity;
import androidx.navigation.NavController$onBackPressedCallback$1;
import coil3.ComponentRegistry$Builder;
import com.common_ui.databinding.LayoutTileBinding;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import com.huawei.hms.android.SystemUtils;
import com.huawei.hms.support.api.entity.core.CommonCode;
import com.logistics.rider.glovo.R;
import com.mapbox.navigation.voice.api.MapboxVoiceInstructionsPlayer$Companion$$ExternalSyntheticLambda0;
import com.roadrunner.logger.logger.sentry.SentryCriticalIssueLogger;
import com.roadrunner.permission.api.model.PermissionModel;
import com.roadrunner.remoteconfig.firebase.FirebaseRemoteConfigImpl;
import com.roadrunner.remoteconfig.firebase.data.FirebaseRemoteConfigProvider;
import com.roadrunner.remoteconfig.helper.RemoteConfigHelperV2;
import com.roadrunner.tnc.TncContentKt$$ExternalSyntheticLambda2;
import com.roadrunner.web.bridge.AqsWebInterface;
import com.roadrunner.web.download.WebViewDownloadHandler;
import com.sentiance.core.model.events.H$b;
import com.sentiance.core.model.events.N$b;
import com.sentiance.core.model.thrift.O$b;
import com.sentiance.core.model.thrift.k$c;
import com.ui.common.base.BaseInjectionDialogFragment;
import io.sentry.SentryUUID;
import io.sentry.hints.MediaSessionCompatQueueItem;
import io.socket.parser.IOParser$Decoder;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Locale;
import java.util.Map;
import java.util.WeakHashMap;
import java.util.concurrent.CancellationException;
import kotlin.LazyKt__LazyJVMKt;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.rx2.RxConvertKt$asFlow$1;
import kotlinx.coroutines.rx2.RxConvertKt$asObservable$1$job$1;
import o.BrazeExternalSyntheticLambda19;
import o.BrazeExternalSyntheticLambda28;
import o.BrazeExternalSyntheticLambda36;
import o.BrazeExternalSyntheticLambda4;
import o.BrazeExternalSyntheticLambda45;
import o.BrazeExternalSyntheticLambda64;
import o.BrazeExternalSyntheticLambda75;
import o.EnumColumnAdapter;
import o.FocusPropertiesNode;
import o.FwFClientbootstrapIfNeeded1;
import o.RectManager;
import o.ShortNewsContentCardView;
import o.SweepGradientShader9KIMszodefault;
import o._get_messageWebView_lambda0;
import o.accessgetCancelcp;
import o.accessisRenderNodeCompatiblecp;
import o.displayInAppMessagelambda1;
import o.divUQTWf7w;
import o.executeAsList;
import o.getCieXyz;
import o.getImmutablePendingIntentFlags;
import o.getPendingWebViewPauseRunnableandroid_sdk_ui_release;
import o.getSTYLEABLE_VECTOR_DRAWABLE_PATH_TRIM_PATH_OFFSET;
import o.getSdkEnablementProviderandroid_sdk_base_release;
import o.hasPointerId;
import o.hideCurrentlyDisplayingInAppMessage;
import o.inRing;
import o.instance_delegatelambda0;
import o.isAdapterPositionOnScreen;
import o.metaMarkUpdatedAndHasCallbacks;
import o.onBackPressed;
import o.onContentCardClicked;
import o.onContentCardDismissed;
import o.onMove;
import o.onPictureInPictureModeChanged;
import o.onViewAttachedToWindowlambda0;
import o.onViewDetachedFromWindowlambda0;
import o.onViewDetachedFromWindowlambda1;
import o.r8lambda1Du6vMW2psEy7y5ets5E4hHHZ8;
import o.r8lambda2qMxD75IpTxKfLD4RjAbqEmoamc;
import o.r8lambda3kmCh7YKlPUi_5SMGAzRgcZHGLc;
import o.r8lambda4MdKbfiHpQQwW57A4NP6ZCybbFA;
import o.r8lambda52ctlEduwkfz3l8UwwWKdau6wdM;
import o.r8lambda60pWJrJ_IeYyPZNB7guGmuaMR08;
import o.r8lambda7Q1QCWXCUHrhcsGraulDg_ksbGU;
import o.r8lambdaBtq4C7Gm1QxfvCp_VmH0bvXHTU;
import o.r8lambdaD96myUSzBh8SDkhp_7hY_RGQMM;
import o.r8lambdaDgZfnZEk_YNXSsj7DOWrjAToNK0;
import o.r8lambdaEKYmoxV_2C6WlKkhZt5ThO0_YA;
import o.r8lambdaF9FA59YZVmE5QVJf1DDc5EcXdk;
import o.r8lambdaFBhg_Qe5GHikJZF0cQ6G2RUyiU;
import o.r8lambdaFzT8gcPxuxF8hQEg_gDeZCl890;
import o.r8lambdaGcPCuHbeI3f7gmV4PjjFd18oWYs;
import o.r8lambdaGclPTCGavTOcPXGI4OQ7OSlWZ3I;
import o.r8lambdaL7OLu8lNAZvDt7ctKnLhqGV_Huc;
import o.r8lambdauDhHXlIoLpU0HpCcQH6vOsKpNY;
import o.r8lambday113fDFTSR5e4PZj6XsSXLtpL60;
import o.r8lambdaz90zXC5cr3Ctjy9kweMhZodg3LE;
import o.recreateDisplayListIfNeeded;
import o.removeNodeAtDepth;
import o.resetMessageMarginslambda00;
import o.setHtmlInAppMessageHtmlLinkTargetEnabledandroid_sdk_base_release;
import o.setTransactionSuccessful;
import o.setUdmandroid_sdk_base_release;
import o.stopInstancelambda11;
import o.subscribeToChangeUserEvents;
import o.subscribeToFeatureFlagsUpdates;
import o.subscribeToNoMatchingTriggerForEvent;
import o.subscribeToPushNotificationEvents;
import o.subscribeToSdkAuthenticationFailures;
import o.supportsColorMatrixQuery;
import o.times7Ah8Wj8;
import o.toBitmapConfig1JJdX4A;
import o.transferSessionPackageI;
import o.unpackInt2;
import o.updateAdidI;
import okhttp3.FormBody;
import okhttp3.RequestBody;
import okhttp3.RequestBody$Companion$toRequestBody$3;
import okio.Options;
import timber.log.Timber;

/* JADX INFO: loaded from: classes3.dex */
public abstract class WebViewFragment extends BaseInjectionDialogFragment {
    private static int removeOnPictureInPictureModeChangedListener = 1;
    private static int removeOnPictureInPictureUiStateChangedListener;
    public getSTYLEABLE_VECTOR_DRAWABLE_PATH_TRIM_PATH_OFFSET getNavigationEventDispatcher;
    public LayoutTileBinding getOnBackPressedDispatcher;
    public final NavController$onBackPressedCallback$1 getSavedStateRegistry;
    public getSdkEnablementProviderandroid_sdk_base_release initializeViewTreeOwners;
    public final onBackPressed invalidateMenu;
    public stopInstancelambda11 onActivityResult;
    public transferSessionPackageI onBackPressed;
    public ValueCallback onConfigurationChanged;
    public BrazeExternalSyntheticLambda28 onCreate;
    public boolean onCreatePanelMenu;
    public recreateDisplayListIfNeeded onMenuItemSelected;
    public k$c onMultiWindowModeChanged;
    public unpackInt2 onNewIntent;
    public N$b onPanelClosed;
    public r8lambdaBtq4C7Gm1QxfvCp_VmH0bvXHTU onPictureInPictureModeChanged;
    public inRing onPictureInPictureUiStateChanged;
    public setTransactionSuccessful onPreparePanel;
    public BrazeExternalSyntheticLambda28 onRequestPermissionsResult;
    public Uri onRetainCustomNonConfigurationInstance;
    public final isAdapterPositionOnScreen onRetainNonConfigurationInstance;
    public r8lambda52ctlEduwkfz3l8UwwWKdau6wdM onSaveInstanceState;
    public onBackPressed onTrimMemory;
    public final ComponentRegistry$Builder onUserLeaveHint;
    public setUdmandroid_sdk_base_release peekAvailableContext;
    public BrazeExternalSyntheticLambda45 registerForActivityResult;
    public subscribeToPushNotificationEvents removeMenuProvider;
    public WebViewDownloadHandler removeOnConfigurationChangedListener;
    public r8lambdauDhHXlIoLpU0HpCcQH6vOsKpNY removeOnContextAvailableListener;
    public final isAdapterPositionOnScreen removeOnNewIntentListener;
    public BrazeExternalSyntheticLambda36 removeOnTrimMemoryListener;

    public abstract void MediaDescriptionCompat();

    public abstract r8lambdaGcPCuHbeI3f7gmV4PjjFd18oWYs serializer();

    public WebViewFragment() {
        WebViewFragment$$ExternalSyntheticLambda1 webViewFragment$$ExternalSyntheticLambda1 = new WebViewFragment$$ExternalSyntheticLambda1(this, 0);
        onViewDetachedFromWindowlambda1 onviewdetachedfromwindowlambda1Serializer = LazyKt__LazyJVMKt.serializer(onViewDetachedFromWindowlambda0.NONE, new FwFClientbootstrapIfNeeded1(5, new FwFClientbootstrapIfNeeded1(4, this)));
        this.onUserLeaveHint = new ComponentRegistry$Builder(displayInAppMessagelambda1.serializer(WebViewViewModel.class), new r8lambdaF9FA59YZVmE5QVJf1DDc5EcXdk(onviewdetachedfromwindowlambda1Serializer, 22), webViewFragment$$ExternalSyntheticLambda1, new r8lambdaF9FA59YZVmE5QVJf1DDc5EcXdk(onviewdetachedfromwindowlambda1Serializer, 23));
        int i = 1;
        this.onRetainNonConfigurationInstance = new isAdapterPositionOnScreen(new WebViewFragment$$ExternalSyntheticLambda1(this, i));
        int i2 = 2;
        this.removeOnNewIntentListener = new isAdapterPositionOnScreen(new WebViewFragment$$ExternalSyntheticLambda1(this, i2));
        this.onCreatePanelMenu = true;
        this.getSavedStateRegistry = new NavController$onBackPressedCallback$1(i2, this);
        onBackPressed onbackpressedRegisterForActivityResult = registerForActivityResult(new times7Ah8Wj8(i2), new WebViewFragment$$ExternalSyntheticLambda0(this, i));
        onbackpressedRegisterForActivityResult.getClass();
        this.invalidateMenu = onbackpressedRegisterForActivityResult;
    }

    public final WebViewViewModel RatingCompat() {
        int i = 2 % 2;
        int i2 = removeOnPictureInPictureUiStateChangedListener + 27;
        removeOnPictureInPictureModeChangedListener = i2 % Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            return (WebViewViewModel) this.onUserLeaveHint.MediaSessionCompatResultReceiverWrapper();
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final transferSessionPackageI MediaMetadataCompat() {
        int i = 2 % 2;
        int i2 = removeOnPictureInPictureModeChangedListener;
        int i3 = i2 + 101;
        removeOnPictureInPictureUiStateChangedListener = i3 % Fields.SpotShadowColor;
        int i4 = i3 % 2;
        transferSessionPackageI transfersessionpackagei = this.onBackPressed;
        if (transfersessionpackagei == null) {
            removeNodeAtDepth.serializer("firebaseRemoteConfig");
            throw null;
        }
        int i5 = i2 + 43;
        removeOnPictureInPictureUiStateChangedListener = i5 % Fields.SpotShadowColor;
        if (i5 % 2 != 0) {
            int i6 = 90 / 0;
        }
        return transfersessionpackagei;
    }

    @Override // androidx.fragment.app.DialogFragment, android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        int i = 2 % 2;
        int i2 = removeOnPictureInPictureUiStateChangedListener + 85;
        removeOnPictureInPictureModeChangedListener = i2 % Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            dialogInterface.getClass();
            super.onDismiss(dialogInterface);
            RatingCompat().serializer();
            int i3 = 5 / 0;
        } else {
            dialogInterface.getClass();
            super.onDismiss(dialogInterface);
            RatingCompat().serializer();
        }
        int i4 = removeOnPictureInPictureUiStateChangedListener + 17;
        removeOnPictureInPictureModeChangedListener = i4 % Fields.SpotShadowColor;
        if (i4 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.fragment.app.DialogFragment
    public final Dialog write(Bundle bundle) {
        int i = 2 % 2;
        int i2 = removeOnPictureInPictureUiStateChangedListener + 9;
        removeOnPictureInPictureModeChangedListener = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        Dialog dialogWrite = super.write(bundle);
        ((ComponentDialog) dialogWrite).getOnBackPressedDispatcher().read(this.getSavedStateRegistry, (accessisRenderNodeCompatiblecp) dialogWrite);
        int i4 = removeOnPictureInPictureModeChangedListener + 81;
        removeOnPictureInPictureUiStateChangedListener = i4 % Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return dialogWrite;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x003e, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x003f, code lost:
    
        r1 = r3.getOnBackPressedDispatcher;
        r1.getClass();
        ((android.webkit.WebView) r1.write).loadUrl(r4);
        r4 = com.roadrunner.web.presentation.WebViewFragment.removeOnPictureInPictureUiStateChangedListener + 23;
        com.roadrunner.web.presentation.WebViewFragment.removeOnPictureInPictureModeChangedListener = r4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0054, code lost:
    
        if ((r4 % 2) == 0) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0056, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0058, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0021, code lost:
    
        if (((com.roadrunner.remoteconfig.firebase.FirebaseRemoteConfigImpl) MediaMetadataCompat()).IconCompatParcelizer(o.updateAdidI.IS_SHOW_WEBVIEW_ERROR_OR_CONNECTION_LOST_PAGE_ENABLED) != false) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0035, code lost:
    
        if ((!((com.roadrunner.remoteconfig.firebase.FirebaseRemoteConfigImpl) MediaMetadataCompat()).IconCompatParcelizer(o.updateAdidI.IS_SHOW_WEBVIEW_ERROR_OR_CONNECTION_LOST_PAGE_ENABLED)) != true) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0037, code lost:
    
        RatingCompat().read(r4);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void serializer(java.lang.String r4) {
        /*
            r3 = this;
            r0 = 2
            int r1 = r0 % r0
            int r1 = com.roadrunner.web.presentation.WebViewFragment.removeOnPictureInPictureUiStateChangedListener
            int r1 = r1 + 31
            int r2 = r1 % 128
            com.roadrunner.web.presentation.WebViewFragment.removeOnPictureInPictureModeChangedListener = r2
            int r1 = r1 % r0
            if (r1 != 0) goto L24
            r4.getClass()
            o.transferSessionPackageI r1 = r3.MediaMetadataCompat()
            com.roadrunner.remoteconfig.firebase.FirebaseRemoteConfigImpl r1 = (com.roadrunner.remoteconfig.firebase.FirebaseRemoteConfigImpl) r1
            o.updateAdidI r2 = o.updateAdidI.IS_SHOW_WEBVIEW_ERROR_OR_CONNECTION_LOST_PAGE_ENABLED
            boolean r1 = r1.IconCompatParcelizer(r2)
            r2 = 89
            int r2 = r2 / 0
            if (r1 == 0) goto L3f
            goto L37
        L24:
            r4.getClass()
            o.transferSessionPackageI r1 = r3.MediaMetadataCompat()
            com.roadrunner.remoteconfig.firebase.FirebaseRemoteConfigImpl r1 = (com.roadrunner.remoteconfig.firebase.FirebaseRemoteConfigImpl) r1
            o.updateAdidI r2 = o.updateAdidI.IS_SHOW_WEBVIEW_ERROR_OR_CONNECTION_LOST_PAGE_ENABLED
            boolean r1 = r1.IconCompatParcelizer(r2)
            r2 = 1
            r1 = r1 ^ r2
            if (r1 == r2) goto L3f
        L37:
            com.roadrunner.web.presentation.WebViewViewModel r0 = r3.RatingCompat()
            r0.read(r4)
            return
        L3f:
            com.common_ui.databinding.LayoutTileBinding r1 = r3.getOnBackPressedDispatcher
            r1.getClass()
            android.view.View r1 = r1.write
            android.webkit.WebView r1 = (android.webkit.WebView) r1
            r1.loadUrl(r4)
            int r4 = com.roadrunner.web.presentation.WebViewFragment.removeOnPictureInPictureUiStateChangedListener
            int r4 = r4 + 23
            int r1 = r4 % 128
            com.roadrunner.web.presentation.WebViewFragment.removeOnPictureInPictureModeChangedListener = r1
            int r4 = r4 % r0
            if (r4 == 0) goto L57
            return
        L57:
            r4 = 0
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.roadrunner.web.presentation.WebViewFragment.serializer(java.lang.String):void");
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroy() {
        int i = 2 % 2;
        int i2 = removeOnPictureInPictureModeChangedListener + 89;
        removeOnPictureInPictureUiStateChangedListener = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        this.onTrimMemory = null;
        r8lambdaFzT8gcPxuxF8hQEg_gDeZCl890 r8lambdafzt8gcpxuxf8hqeg_gdezcl890 = (r8lambdaFzT8gcPxuxF8hQEg_gDeZCl890) this.onRetainNonConfigurationInstance.MediaSessionCompatResultReceiverWrapper();
        if (r8lambdafzt8gcpxuxf8hqeg_gdezcl890 != null) {
            r8lambdaGclPTCGavTOcPXGI4OQ7OSlWZ3I r8lambdagclptcgavtocpxgi4oq7oslwz3i = (r8lambdaGclPTCGavTOcPXGI4OQ7OSlWZ3I) this.removeOnNewIntentListener.MediaSessionCompatResultReceiverWrapper();
            if (r8lambdagclptcgavtocpxgi4oq7oslwz3i != null) {
                int i4 = removeOnPictureInPictureModeChangedListener + 85;
                removeOnPictureInPictureUiStateChangedListener = i4 % Fields.SpotShadowColor;
                int i5 = i4 % 2;
                r8lambdagclptcgavtocpxgi4oq7oslwz3i.serializer();
            }
            BrazeExternalSyntheticLambda36 brazeExternalSyntheticLambda36 = this.removeOnTrimMemoryListener;
            if (brazeExternalSyntheticLambda36 == null) {
                removeNodeAtDepth.serializer("webviewLoadingTimeTrackerFactory");
                throw null;
            }
            int i6 = removeOnPictureInPictureModeChangedListener + 123;
            removeOnPictureInPictureUiStateChangedListener = i6 % Fields.SpotShadowColor;
            if (i6 % 2 != 0) {
                String key = r8lambdafzt8gcpxuxf8hqeg_gdezcl890.getKey();
                key.getClass();
                brazeExternalSyntheticLambda36.IconCompatParcelizer.remove(key);
                int i7 = 25 / 0;
            } else {
                String key2 = r8lambdafzt8gcpxuxf8hqeg_gdezcl890.getKey();
                key2.getClass();
                brazeExternalSyntheticLambda36.IconCompatParcelizer.remove(key2);
            }
            int i8 = removeOnPictureInPictureModeChangedListener + 71;
            removeOnPictureInPictureUiStateChangedListener = i8 % Fields.SpotShadowColor;
            int i9 = i8 % 2;
        }
        super.onDestroy();
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        int i = 2 % 2;
        LayoutTileBinding layoutTileBinding = this.getOnBackPressedDispatcher;
        Object obj = null;
        if (layoutTileBinding != null) {
            WebView webView = (WebView) layoutTileBinding.write;
            if (((FirebaseRemoteConfigImpl) MediaMetadataCompat()).IconCompatParcelizer.IconCompatParcelizer(updateAdidI.IS_WEBVIEW_DETACH_ON_DESTROY_ENABLED.getFirebaseFlagName())) {
                int i2 = removeOnPictureInPictureModeChangedListener + 99;
                removeOnPictureInPictureUiStateChangedListener = i2 % Fields.SpotShadowColor;
                int i3 = i2 % 2;
                ViewParent parent = webView.getParent();
                ViewGroup viewGroup = parent instanceof ViewGroup ? (ViewGroup) parent : null;
                if (viewGroup != null) {
                    int i4 = removeOnPictureInPictureModeChangedListener + 51;
                    removeOnPictureInPictureUiStateChangedListener = i4 % Fields.SpotShadowColor;
                    if (i4 % 2 != 0) {
                        viewGroup.removeView(webView);
                        obj.hashCode();
                        throw null;
                    }
                    viewGroup.removeView(webView);
                }
            }
            webView.destroy();
            int i5 = removeOnPictureInPictureModeChangedListener + 81;
            removeOnPictureInPictureUiStateChangedListener = i5 % Fields.SpotShadowColor;
            int i6 = i5 % 2;
        }
        this.getOnBackPressedDispatcher = null;
        super.onDestroyView();
        int i7 = removeOnPictureInPictureUiStateChangedListener + 21;
        removeOnPictureInPictureModeChangedListener = i7 % Fields.SpotShadowColor;
        if (i7 % 2 == 0) {
            int i8 = 55 / 0;
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int i = 2 % 2;
        int i2 = removeOnPictureInPictureUiStateChangedListener + 11;
        removeOnPictureInPictureModeChangedListener = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        layoutInflater.getClass();
        if (!r8lambda4MdKbfiHpQQwW57A4NP6ZCybbFA.write()) {
            Timber.RemoteActionCompatParcelizer.RemoteActionCompatParcelizer("Opened the WebViewFragment although WebView is not available", new Object[0]);
            this.onCreatePanelMenu = false;
            return null;
        }
        try {
            LayoutTileBinding layoutTileBinding = LayoutTileBinding.read(layoutInflater.inflate(R.layout.fragment_web_view, viewGroup, false));
            this.getOnBackPressedDispatcher = layoutTileBinding;
            ConstraintLayout constraintLayoutSerializer = layoutTileBinding.serializer();
            MapboxVoiceInstructionsPlayer$Companion$$ExternalSyntheticLambda0 mapboxVoiceInstructionsPlayer$Companion$$ExternalSyntheticLambda0 = new MapboxVoiceInstructionsPlayer$Companion$$ExternalSyntheticLambda0(12);
            WeakHashMap weakHashMap = FocusPropertiesNode.RatingCompat;
            accessgetCancelcp.write(constraintLayoutSerializer, mapboxVoiceInstructionsPlayer$Companion$$ExternalSyntheticLambda0);
            LayoutTileBinding layoutTileBinding2 = this.getOnBackPressedDispatcher;
            layoutTileBinding2.getClass();
            ConstraintLayout constraintLayoutSerializer2 = layoutTileBinding2.serializer();
            int i4 = removeOnPictureInPictureModeChangedListener + 75;
            removeOnPictureInPictureUiStateChangedListener = i4 % Fields.SpotShadowColor;
            int i5 = i4 % 2;
            return constraintLayoutSerializer2;
        } catch (InflateException e) {
            Timber.RemoteActionCompatParcelizer.serializer(e, "Opened the WebViewFragment although WebView is not available", new Object[0]);
            this.onCreatePanelMenu = false;
            return null;
        }
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        int i = 2;
        int i2 = 2 % 2;
        int i3 = removeOnPictureInPictureModeChangedListener + 109;
        removeOnPictureInPictureUiStateChangedListener = i3 % Fields.SpotShadowColor;
        int i4 = i3 % 2;
        super.onCreate(bundle);
        int i5 = 0;
        read(0, R.style.Theme_RoadRunner_Dialog_FullScreen);
        if (this.getNavigationEventDispatcher == null) {
            removeNodeAtDepth.serializer("appBuildConfig");
            throw null;
        }
        int i6 = removeOnPictureInPictureUiStateChangedListener + 57;
        removeOnPictureInPictureModeChangedListener = i6 % Fields.SpotShadowColor;
        if (i6 % 2 == 0) {
            r8lambda4MdKbfiHpQQwW57A4NP6ZCybbFA.write();
            throw null;
        }
        if (!r8lambda4MdKbfiHpQQwW57A4NP6ZCybbFA.write()) {
            int i7 = removeOnPictureInPictureUiStateChangedListener + 41;
            removeOnPictureInPictureModeChangedListener = i7 % Fields.SpotShadowColor;
            int i8 = i7 % 2;
            setUdmandroid_sdk_base_release setudmandroid_sdk_base_release = this.peekAvailableContext;
            if (setudmandroid_sdk_base_release == null) {
                removeNodeAtDepth.serializer("webViewCriticalErrorLogger");
                throw null;
            }
            setudmandroid_sdk_base_release.write();
        }
        RatingCompat().RemoteActionCompatParcelizer().RemoteActionCompatParcelizer(this, new TncContentKt$$ExternalSyntheticLambda2(23, this));
        PermissionModel permissionModel = new PermissionModel(r8lambda60pWJrJ_IeYyPZNB7guGmuaMR08.CAMERA, true);
        inRing inring = this.onPictureInPictureUiStateChanged;
        if (inring == null) {
            removeNodeAtDepth.serializer("permissionLifecycleHandlerFactory");
            throw null;
        }
        WebViewFragment$$ExternalSyntheticLambda0 webViewFragment$$ExternalSyntheticLambda0 = new WebViewFragment$$ExternalSyntheticLambda0(this, i5);
        ActivityResultRegistry activityResultRegistry = requireActivity().getActivityResultRegistry();
        activityResultRegistry.getClass();
        this.onPictureInPictureModeChanged = ((r8lambdaD96myUSzBh8SDkhp_7hY_RGQMM) inring).RemoteActionCompatParcelizer(webViewFragment$$ExternalSyntheticLambda0, activityResultRegistry, permissionModel);
        supportsColorMatrixQuery lifecycle = getLifecycle();
        r8lambdaBtq4C7Gm1QxfvCp_VmH0bvXHTU r8lambdabtq4c7gm1qxfvcp_vmh0bvxhtu = this.onPictureInPictureModeChanged;
        if (r8lambdabtq4c7gm1qxfvcp_vmh0bvxhtu == null) {
            removeNodeAtDepth.serializer("permissionLifecycleHandler");
            throw null;
        }
        lifecycle.IconCompatParcelizer(r8lambdabtq4c7gm1qxfvcp_vmh0bvxhtu);
        this.onTrimMemory = registerForActivityResult(new onPictureInPictureModeChanged(i5), new WebViewFragment$$ExternalSyntheticLambda0(this, i));
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        Window window;
        int i = 2 % 2;
        int i2 = removeOnPictureInPictureModeChangedListener + 115;
        removeOnPictureInPictureUiStateChangedListener = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        view.getClass();
        super.onViewCreated(view, bundle);
        Dialog dialog = ((DialogFragment) this).read;
        int i4 = 0;
        if (dialog != null && (window = dialog.getWindow()) != null) {
            int i5 = removeOnPictureInPictureUiStateChangedListener + 65;
            removeOnPictureInPictureModeChangedListener = i5 % Fields.SpotShadowColor;
            int i6 = i5 % 2;
            SentryUUID.read(window, false);
            LayoutTileBinding layoutTileBinding = this.getOnBackPressedDispatcher;
            layoutTileBinding.getClass();
            ConstraintLayout constraintLayoutSerializer = layoutTileBinding.serializer();
            WeakHashMap weakHashMap = FocusPropertiesNode.RatingCompat;
            constraintLayoutSerializer.requestApplyInsets();
        }
        LayoutTileBinding layoutTileBinding2 = this.getOnBackPressedDispatcher;
        layoutTileBinding2.getClass();
        getImmutablePendingIntentFlags getimmutablependingintentflags = (getImmutablePendingIntentFlags) layoutTileBinding2.serializer;
        int i7 = BrazeExternalSyntheticLambda75.read[serializer().ordinal()];
        int i8 = 3;
        if (i7 == 1) {
            getimmutablependingintentflags.setStartIcon(R.drawable.ic_bold_large_arrow_with_tail_left);
            getimmutablependingintentflags.setStartImageClickListener(new WebViewFragment$$ExternalSyntheticLambda1(this, i8));
        } else if (i7 == 2) {
            getimmutablependingintentflags.setEndIcon(R.drawable.ic_bold_large_cancel_thin);
            getimmutablependingintentflags.setEndImageClickListener(new WebViewFragment$$ExternalSyntheticLambda1(this, 4));
        } else {
            if (i7 != 3) {
                ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer();
                return;
            }
            getimmutablependingintentflags.setVisibility(8);
        }
        ShortNewsContentCardView shortNewsContentCardView = null;
        if (((FirebaseRemoteConfigImpl) MediaMetadataCompat()).IconCompatParcelizer(updateAdidI.IS_SHOW_WEBVIEW_ERROR_OR_CONNECTION_LOST_PAGE_ENABLED)) {
            LayoutTileBinding layoutTileBinding3 = this.getOnBackPressedDispatcher;
            layoutTileBinding3.getClass();
            ((ComposeView) layoutTileBinding3.RemoteActionCompatParcelizer).setViewCompositionStrategy(ViewCompositionStrategy.DisposeOnViewTreeLifecycleDestroyed.INSTANCE);
            BuildersKt.RemoteActionCompatParcelizer(toBitmapConfig1JJdX4A.read(getLifecycle()), null, null, new WebViewFragment$observeViewState$1(this, shortNewsContentCardView, i4), 3);
        }
        LayoutTileBinding layoutTileBinding4 = this.getOnBackPressedDispatcher;
        layoutTileBinding4.getClass();
        WebSettings settings = ((WebView) layoutTileBinding4.write).getSettings();
        settings.setJavaScriptEnabled(true);
        settings.setJavaScriptCanOpenWindowsAutomatically(true);
        settings.setDomStorageEnabled(true);
        settings.setBuiltInZoomControls(true);
        settings.setDisplayZoomControls(false);
        settings.setAllowFileAccessFromFileURLs(true);
        settings.setAllowUniversalAccessFromFileURLs(true);
        settings.setAllowFileAccess(true);
        settings.setAllowContentAccess(true);
        settings.setSafeBrowsingEnabled(true);
        LayoutTileBinding layoutTileBinding5 = this.getOnBackPressedDispatcher;
        layoutTileBinding5.getClass();
        WebView webView = (WebView) layoutTileBinding5.write;
        webView.addJavascriptInterface(new AqsWebInterface(this), "aqsBridgeEntry");
        subscribeToPushNotificationEvents subscribetopushnotificationevents = this.removeMenuProvider;
        if (subscribetopushnotificationevents == null) {
            removeNodeAtDepth.serializer("webPostRequestInterceptor");
            throw null;
        }
        LayoutTileBinding layoutTileBinding6 = this.getOnBackPressedDispatcher;
        layoutTileBinding6.getClass();
        subscribetopushnotificationevents.read((WebView) layoutTileBinding6.write);
        webView.setScrollBarStyle(33554432);
        webView.setScrollbarFadingEnabled(false);
        webView.setWebChromeClient(new WebChromeClient() { // from class: com.roadrunner.web.presentation.WebViewFragment$initWebView$2$1
            private static int IconCompatParcelizer = 0;
            private static int read = 1;

            @Override // android.webkit.WebChromeClient
            public final void onProgressChanged(WebView webView2, int i9) {
                int i10 = 2 % 2;
                int i11 = read + 29;
                IconCompatParcelizer = i11 % Fields.SpotShadowColor;
                int i12 = i11 % 2;
                super.onProgressChanged(webView2, i9);
                int i13 = 0;
                if (i9 == 100) {
                    int i14 = IconCompatParcelizer + 95;
                    read = i14 % Fields.SpotShadowColor;
                    int i15 = i14 % 2;
                    i9 = 0;
                }
                WebViewFragment webViewFragment = this.RemoteActionCompatParcelizer;
                LayoutTileBinding layoutTileBinding7 = webViewFragment.getOnBackPressedDispatcher;
                layoutTileBinding7.getClass();
                ((divUQTWf7w) layoutTileBinding7.read).setProgressCompat(i9, true);
                LayoutTileBinding layoutTileBinding8 = webViewFragment.getOnBackPressedDispatcher;
                layoutTileBinding8.getClass();
                divUQTWf7w divuqtwf7w = (divUQTWf7w) layoutTileBinding8.read;
                if (i9 == 0) {
                    int i16 = read + 99;
                    IconCompatParcelizer = i16 % Fields.SpotShadowColor;
                    int i17 = i16 % 2;
                    i13 = 8;
                }
                divuqtwf7w.setVisibility(i13);
                int i18 = IconCompatParcelizer + 27;
                read = i18 % Fields.SpotShadowColor;
                int i19 = i18 % 2;
            }

            @Override // android.webkit.WebChromeClient
            public final boolean onShowFileChooser(WebView webView2, ValueCallback valueCallback, WebChromeClient.FileChooserParams fileChooserParams) {
                int i9 = 2 % 2;
                int i10 = IconCompatParcelizer + 95;
                read = i10 % Fields.SpotShadowColor;
                Object obj = null;
                if (i10 % 2 == 0) {
                    ValueCallback valueCallback2 = this.RemoteActionCompatParcelizer.onConfigurationChanged;
                    obj.hashCode();
                    throw null;
                }
                WebViewFragment webViewFragment = this.RemoteActionCompatParcelizer;
                ValueCallback valueCallback3 = webViewFragment.onConfigurationChanged;
                if (valueCallback3 != null) {
                    valueCallback3.onReceiveValue(null);
                }
                webViewFragment.onConfigurationChanged = valueCallback;
                try {
                    read(fileChooserParams);
                    return true;
                } catch (ActivityNotFoundException unused) {
                    webViewFragment.onConfigurationChanged = null;
                    Context contextRequireContext = webViewFragment.requireContext();
                    setTransactionSuccessful settransactionsuccessful = webViewFragment.onPreparePanel;
                    if (settransactionsuccessful == null) {
                        removeNodeAtDepth.serializer("resourceManager");
                        throw null;
                    }
                    Toast.makeText(contextRequireContext, settransactionsuccessful.IconCompatParcelizer(R.string.profile_upload_doc_file_chooser_error), 1).show();
                    int i11 = read + 25;
                    IconCompatParcelizer = i11 % Fields.SpotShadowColor;
                    int i12 = i11 % 2;
                    return false;
                }
            }

            /* JADX WARN: Code restructure failed: missing block: B:17:0x004c, code lost:
            
                if (r0 != null) goto L21;
             */
            /* JADX WARN: Code restructure failed: missing block: B:20:0x0051, code lost:
            
                if (r0 != null) goto L21;
             */
            /* JADX WARN: Code restructure failed: missing block: B:21:0x0053, code lost:
            
                r0.write(r6.IconCompatParcelizer);
             */
            /* JADX WARN: Code restructure failed: missing block: B:22:0x0058, code lost:
            
                return;
             */
            /* JADX WARN: Code restructure failed: missing block: B:23:0x0059, code lost:
            
                o.removeNodeAtDepth.serializer("activityResultLauncher");
             */
            /* JADX WARN: Code restructure failed: missing block: B:24:0x005e, code lost:
            
                throw null;
             */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final void read(android.webkit.WebChromeClient.FileChooserParams r6) {
                /*
                    r5 = this;
                    r0 = 2
                    int r1 = r0 % r0
                    int r1 = com.roadrunner.web.presentation.WebViewFragment$initWebView$2$1.IconCompatParcelizer
                    int r1 = r1 + 13
                    int r2 = r1 % 128
                    com.roadrunner.web.presentation.WebViewFragment$initWebView$2$1.read = r2
                    int r1 = r1 % r0
                    com.roadrunner.web.presentation.WebViewFragment r1 = r5.RemoteActionCompatParcelizer
                    r2 = 0
                    if (r6 == 0) goto L6b
                    int r3 = r6.getMode()
                    if (r3 != 0) goto L6b
                    java.lang.String[] r3 = r6.getAcceptTypes()
                    r3.getClass()
                    java.lang.String r4 = "image/*"
                    boolean r3 = o.onContentCardClicked.IconCompatParcelizer(r3, r4)
                    if (r3 == 0) goto L6b
                    boolean r3 = r6.isCaptureEnabled()
                    if (r3 == 0) goto L6b
                    int r6 = com.roadrunner.web.presentation.WebViewFragment$initWebView$2$1.IconCompatParcelizer
                    int r6 = r6 + 109
                    int r3 = r6 % 128
                    com.roadrunner.web.presentation.WebViewFragment$initWebView$2$1.read = r3
                    int r6 = r6 % r0
                    if (r6 == 0) goto L65
                    o.r8lambdaBtq4C7Gm1QxfvCp_VmH0bvXHTU r6 = r1.onPictureInPictureModeChanged
                    if (r6 == 0) goto L5f
                    int r1 = com.roadrunner.web.presentation.WebViewFragment$initWebView$2$1.read
                    int r1 = r1 + 75
                    int r3 = r1 % 128
                    com.roadrunner.web.presentation.WebViewFragment$initWebView$2$1.IconCompatParcelizer = r3
                    int r1 = r1 % r0
                    if (r1 == 0) goto L4f
                    o.onBackPressed r0 = r6.write
                    r1 = 26
                    int r1 = r1 / 0
                    if (r0 == 0) goto L59
                    goto L53
                L4f:
                    o.onBackPressed r0 = r6.write
                    if (r0 == 0) goto L59
                L53:
                    com.roadrunner.permission.api.model.PermissionModel r6 = r6.IconCompatParcelizer
                    r0.write(r6)
                    return
                L59:
                    java.lang.String r6 = "activityResultLauncher"
                    o.removeNodeAtDepth.serializer(r6)
                    throw r2
                L5f:
                    java.lang.String r6 = "permissionLifecycleHandler"
                    o.removeNodeAtDepth.serializer(r6)
                    throw r2
                L65:
                    o.r8lambdaBtq4C7Gm1QxfvCp_VmH0bvXHTU r6 = r1.onPictureInPictureModeChanged
                    r2.hashCode()
                    throw r2
                L6b:
                    if (r6 == 0) goto L86
                    int r2 = com.roadrunner.web.presentation.WebViewFragment$initWebView$2$1.IconCompatParcelizer
                    int r2 = r2 + 97
                    int r3 = r2 % 128
                    com.roadrunner.web.presentation.WebViewFragment$initWebView$2$1.read = r3
                    int r2 = r2 % r0
                    if (r2 != 0) goto L81
                    android.content.Intent r6 = r6.createIntent()
                    r0 = 5
                    int r0 = r0 / 0
                L7f:
                    r2 = r6
                    goto L86
                L81:
                    android.content.Intent r6 = r6.createIntent()
                    goto L7f
                L86:
                    o.onBackPressed r6 = r1.invalidateMenu
                    r6.write(r2)
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: com.roadrunner.web.presentation.WebViewFragment$initWebView$2$1.read(android.webkit.WebChromeClient$FileChooserParams):void");
            }

            @Override // android.webkit.WebChromeClient
            public final void onPermissionRequest(PermissionRequest permissionRequest) {
                int i9 = 2 % 2;
                WebViewFragment webViewFragment = this.RemoteActionCompatParcelizer;
                N$b n$b = webViewFragment.onPanelClosed;
                if (n$b == null) {
                    removeNodeAtDepth.serializer("permissionManager");
                    throw null;
                }
                int i10 = read + 5;
                IconCompatParcelizer = i10 % Fields.SpotShadowColor;
                int i11 = i10 % 2;
                FragmentActivity fragmentActivityRequireActivity = webViewFragment.requireActivity();
                fragmentActivityRequireActivity.getClass();
                PermissionModel permissionModel = (PermissionModel) n$b.serializer;
                H$b h$b = (H$b) n$b.write;
                r8lambdaEKYmoxV_2C6WlKkhZt5ThO0_YA r8lambdaekymoxv_2c6wlkkhzt5tho0_ya = (r8lambdaEKYmoxV_2C6WlKkhZt5ThO0_YA) n$b.read;
                FirebaseRemoteConfigImpl firebaseRemoteConfigImpl = (FirebaseRemoteConfigImpl) ((transferSessionPackageI) n$b.IconCompatParcelizer);
                firebaseRemoteConfigImpl.getClass();
                if (!firebaseRemoteConfigImpl.IconCompatParcelizer(updateAdidI.IS_WEBVIEW_PERMISSION_REQUEST_FIX_ENABLED)) {
                    if (permissionRequest != null) {
                        int i12 = read + 55;
                        IconCompatParcelizer = i12 % Fields.SpotShadowColor;
                        int i13 = i12 % 2;
                        String[] resources = permissionRequest.getResources();
                        if (resources != null) {
                            for (String str : resources) {
                                if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{str, "android.webkit.resource.VIDEO_CAPTURE"}, getCieXyz.write())).booleanValue()) {
                                    int i14 = read + 17;
                                    IconCompatParcelizer = i14 % Fields.SpotShadowColor;
                                    int i15 = i14 % 2;
                                    if (r8lambdaekymoxv_2c6wlkkhzt5tho0_ya.read(r8lambda60pWJrJ_IeYyPZNB7guGmuaMR08.CAMERA, fragmentActivityRequireActivity)) {
                                        permissionRequest.grant(new String[]{"android.webkit.resource.VIDEO_CAPTURE"});
                                    } else {
                                        h$b.IconCompatParcelizer(permissionModel, fragmentActivityRequireActivity);
                                        permissionRequest.deny();
                                    }
                                } else {
                                    permissionRequest.deny();
                                }
                            }
                            return;
                        }
                        return;
                    }
                    return;
                }
                int i16 = read + 105;
                IconCompatParcelizer = i16 % Fields.SpotShadowColor;
                int i17 = i16 % 2;
                if (permissionRequest == null) {
                    return;
                }
                String[] resources2 = permissionRequest.getResources();
                if (resources2 == null) {
                    permissionRequest.deny();
                    return;
                }
                ArrayList arrayList = new ArrayList();
                int length = resources2.length;
                int i18 = IconCompatParcelizer + 87;
                read = i18 % Fields.SpotShadowColor;
                int i19 = i18 % 2;
                int i20 = 0;
                while (i20 < length) {
                    String str2 = resources2[i20];
                    if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{str2, "android.webkit.resource.VIDEO_CAPTURE"}, getCieXyz.write())).booleanValue() && r8lambdaekymoxv_2c6wlkkhzt5tho0_ya.read(r8lambda60pWJrJ_IeYyPZNB7guGmuaMR08.CAMERA, fragmentActivityRequireActivity)) {
                        int i21 = IconCompatParcelizer + 119;
                        read = i21 % Fields.SpotShadowColor;
                        int i22 = i21 % 2;
                        arrayList.add(str2);
                    }
                    i20++;
                    int i23 = read + 61;
                    IconCompatParcelizer = i23 % Fields.SpotShadowColor;
                    if (i23 % 2 != 0) {
                        int i24 = 2 / 2;
                    }
                }
                if (!arrayList.isEmpty()) {
                    permissionRequest.grant((String[]) arrayList.toArray(new String[0]));
                    return;
                }
                if (onContentCardClicked.IconCompatParcelizer(resources2, "android.webkit.resource.VIDEO_CAPTURE")) {
                    h$b.IconCompatParcelizer(permissionModel, fragmentActivityRequireActivity);
                }
                permissionRequest.deny();
            }
        });
        WebViewDownloadHandler webViewDownloadHandler = this.removeOnConfigurationChangedListener;
        if (webViewDownloadHandler == null) {
            removeNodeAtDepth.serializer("webViewDownloadHandler");
            throw null;
        }
        webView.setDownloadListener(webViewDownloadHandler);
        webView.setWebViewClient(new WebViewClient() { // from class: com.roadrunner.web.presentation.WebViewFragment$initWebView$2$2
            private static int IconCompatParcelizer = 0;
            private static int RemoteActionCompatParcelizer = 1;

            /* JADX WARN: Code duplicated, block: B:81:0x01e3  */
            @Override // android.webkit.WebViewClient
            public final WebResourceResponse shouldInterceptRequest(WebView webView2, WebResourceRequest webResourceRequest) {
                Iterable iterableIconCompatParcelizer;
                r8lambday113fDFTSR5e4PZj6XsSXLtpL60 r8lambday113fdftsr5e4pzj6xssxltpl60;
                Object objPrevious;
                subscribeToFeatureFlagsUpdates subscribetofeatureflagsupdates;
                RequestBody$Companion$toRequestBody$3 requestBody$Companion$toRequestBody$3Serializer;
                Object objPrevious2;
                k$c k_c = this.read.onMultiWindowModeChanged;
                ShortNewsContentCardView shortNewsContentCardView2 = null;
                if (k_c == null) {
                    removeNodeAtDepth.serializer("getWebViewInterceptor");
                    throw null;
                }
                subscribeToChangeUserEvents subscribetochangeuserevents = ((subscribeToSdkAuthenticationFailures) k_c.MediaDescriptionCompat).read.serializer;
                if (subscribetochangeuserevents == subscribeToChangeUserEvents.SKIP) {
                    return super.shouldInterceptRequest(webView2, webResourceRequest);
                }
                if (subscribetochangeuserevents == subscribeToChangeUserEvents.APPLICANT) {
                    FirebaseRemoteConfigImpl firebaseRemoteConfigImpl = (FirebaseRemoteConfigImpl) ((transferSessionPackageI) k_c.RemoteActionCompatParcelizer);
                    firebaseRemoteConfigImpl.getClass();
                    if (!firebaseRemoteConfigImpl.IconCompatParcelizer(updateAdidI.IS_SEAMLESS_TOKEN_FOR_RIDER_HIRING_ENABLED)) {
                        return super.shouldInterceptRequest(webView2, webResourceRequest);
                    }
                }
                if (subscribetochangeuserevents == subscribeToChangeUserEvents.RIDER) {
                    FirebaseRemoteConfigImpl firebaseRemoteConfigImpl2 = (FirebaseRemoteConfigImpl) ((transferSessionPackageI) k_c.RemoteActionCompatParcelizer);
                    firebaseRemoteConfigImpl2.getClass();
                    if (!firebaseRemoteConfigImpl2.IconCompatParcelizer(updateAdidI.IS_SEAMLESS_TOKEN_REFRESH_ENABLED)) {
                        return super.shouldInterceptRequest(webView2, webResourceRequest);
                    }
                }
                if (webResourceRequest == null) {
                    return super.shouldInterceptRequest(webView2, (WebResourceRequest) null);
                }
                IOParser$Decoder iOParser$Decoder = (IOParser$Decoder) k_c.write;
                String string = webResourceRequest.getUrl().toString();
                string.getClass();
                metaMarkUpdatedAndHasCallbacks metamarkupdatedandhascallbacksSerializer = ((RectManager) iOParser$Decoder.RemoteActionCompatParcelizer).serializer();
                String str = metamarkupdatedandhascallbacksSerializer != null ? metamarkupdatedandhascallbacksSerializer.url : null;
                if (str != null) {
                    FirebaseRemoteConfigImpl firebaseRemoteConfigImpl3 = (FirebaseRemoteConfigImpl) ((transferSessionPackageI) iOParser$Decoder.read);
                    String str2 = firebaseRemoteConfigImpl3.read.read();
                    if (str2 == null) {
                        iterableIconCompatParcelizer = instance_delegatelambda0.write;
                    } else {
                        FirebaseRemoteConfigProvider firebaseRemoteConfigProvider = firebaseRemoteConfigImpl3.IconCompatParcelizer;
                        instance_delegatelambda0 instance_delegatelambda0Var = instance_delegatelambda0.write;
                        r8lambda3kmCh7YKlPUi_5SMGAzRgcZHGLc r8lambda3kmch7yklpui_5smgazrgczhglc = RemoteConfigHelperV2.RemoteActionCompatParcelizer;
                        iterableIconCompatParcelizer = RemoteConfigHelperV2.IconCompatParcelizer(firebaseRemoteConfigProvider.read("web_view_interceptor_allowed_path_list"), str2, instance_delegatelambda0Var);
                    }
                    Iterable iterable = iterableIconCompatParcelizer;
                    if (!(iterable instanceof Collection) || !((Collection) iterable).isEmpty()) {
                        Iterator it = iterable.iterator();
                        while (it.hasNext()) {
                            if (hideCurrentlyDisplayingInAppMessage.IconCompatParcelizer((CharSequence) string, (CharSequence) (str + ((String) it.next())), false)) {
                                if (!((Boolean) BuildersKt.serializer(r8lambda2qMxD75IpTxKfLD4RjAbqEmoamc.write, new RxConvertKt$asObservable$1$job$1((k$c) k_c.MediaBrowserCompatMediaItem, webResourceRequest, new getPendingWebViewPauseRunnableandroid_sdk_ui_release(k_c, 26, webView2), null, 5))).booleanValue()) {
                                    return super.shouldInterceptRequest(webView2, webResourceRequest);
                                }
                                subscribeToNoMatchingTriggerForEvent subscribetonomatchingtriggerforevent = (subscribeToNoMatchingTriggerForEvent) k_c.serializer;
                                if (subscribetonomatchingtriggerforevent.write()) {
                                    subscribetonomatchingtriggerforevent.IconCompatParcelizer.logEvent("web_auth_request_started", null);
                                }
                                setHtmlInAppMessageHtmlLinkTargetEnabledandroid_sdk_base_release sethtmlinappmessagehtmllinktargetenabledandroid_sdk_base_release = (setHtmlInAppMessageHtmlLinkTargetEnabledandroid_sdk_base_release) k_c.IconCompatParcelizer;
                                Map<String, String> requestHeaders = webResourceRequest.getRequestHeaders();
                                String string2 = webResourceRequest.getUrl().toString();
                                string2.getClass();
                                if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{webResourceRequest.getMethod(), "POST"}, getCieXyz.write())).booleanValue()) {
                                    Uri url = webResourceRequest.getUrl();
                                    url.getClass();
                                    if (hasPointerId.RemoteActionCompatParcelizer(url)) {
                                        subscribeToPushNotificationEvents subscribetopushnotificationevents2 = (subscribeToPushNotificationEvents) sethtmlinappmessagehtmllinktargetenabledandroid_sdk_base_release.write;
                                        subscribetopushnotificationevents2.getClass();
                                        synchronized (subscribetopushnotificationevents2.read) {
                                            ArrayList arrayList = subscribetopushnotificationevents2.read;
                                            ListIterator listIterator = arrayList.listIterator(arrayList.size());
                                            do {
                                                if (!listIterator.hasPrevious()) {
                                                    objPrevious = null;
                                                    break;
                                                }
                                                objPrevious = listIterator.previous();
                                            } while (!string2.equals(((subscribeToFeatureFlagsUpdates) objPrevious).serializer));
                                            subscribetofeatureflagsupdates = (subscribeToFeatureFlagsUpdates) objPrevious;
                                            if (subscribetofeatureflagsupdates == null) {
                                                ArrayList arrayList2 = subscribetopushnotificationevents2.read;
                                                ListIterator listIterator2 = arrayList2.listIterator(arrayList2.size());
                                                do {
                                                    if (!listIterator2.hasPrevious()) {
                                                        objPrevious2 = null;
                                                        break;
                                                    }
                                                    objPrevious2 = listIterator2.previous();
                                                } while (!hideCurrentlyDisplayingInAppMessage.IconCompatParcelizer((CharSequence) string2, (CharSequence) ((subscribeToFeatureFlagsUpdates) objPrevious2).serializer, false));
                                                subscribetofeatureflagsupdates = (subscribeToFeatureFlagsUpdates) objPrevious2;
                                            }
                                        }
                                        if (subscribetofeatureflagsupdates != null) {
                                            String str3 = subscribetofeatureflagsupdates.read;
                                            RequestBody.Companion.getClass();
                                            requestBody$Companion$toRequestBody$3Serializer = r8lambdaz90zXC5cr3Ctjy9kweMhZodg3LE.serializer(str3, null);
                                        } else {
                                            requestBody$Companion$toRequestBody$3Serializer = null;
                                        }
                                        _get_messageWebView_lambda0 _get_messagewebview_lambda0 = new _get_messageWebView_lambda0(0);
                                        _get_messagewebview_lambda0.read(string2);
                                        String method = webResourceRequest.getMethod();
                                        method.getClass();
                                        _get_messagewebview_lambda0.write(method, requestBody$Companion$toRequestBody$3Serializer);
                                        resetMessageMarginslambda00 resetmessagemarginslambda00 = resetMessageMarginslambda00.EMPTY;
                                        requestHeaders.getClass();
                                        _get_messagewebview_lambda0.serializer = Options.Companion.serializer(requestHeaders).serializer();
                                        r8lambday113fdftsr5e4pzj6xssxltpl60 = new r8lambday113fDFTSR5e4PZj6XsSXLtpL60(_get_messagewebview_lambda0);
                                    } else {
                                        _get_messageWebView_lambda0 _get_messagewebview_lambda1 = new _get_messageWebView_lambda0(0);
                                        _get_messagewebview_lambda1.read(string2);
                                        resetMessageMarginslambda00 resetmessagemarginslambda01 = resetMessageMarginslambda00.EMPTY;
                                        requestHeaders.getClass();
                                        _get_messagewebview_lambda1.serializer = Options.Companion.serializer(requestHeaders).serializer();
                                        r8lambday113fdftsr5e4pzj6xssxltpl60 = new r8lambday113fDFTSR5e4PZj6XsSXLtpL60(_get_messagewebview_lambda1);
                                    }
                                } else {
                                    _get_messageWebView_lambda0 _get_messagewebview_lambda2 = new _get_messageWebView_lambda0(0);
                                    _get_messagewebview_lambda2.read(string2);
                                    resetMessageMarginslambda00 resetmessagemarginslambda02 = resetMessageMarginslambda00.EMPTY;
                                    requestHeaders.getClass();
                                    _get_messagewebview_lambda2.serializer = Options.Companion.serializer(requestHeaders).serializer();
                                    r8lambday113fdftsr5e4pzj6xssxltpl60 = new r8lambday113fDFTSR5e4PZj6XsSXLtpL60(_get_messagewebview_lambda2);
                                }
                                try {
                                    WebResourceResponse webResourceResponseRemoteActionCompatParcelizer = ((FormBody.Builder) k_c.read).RemoteActionCompatParcelizer(r8lambday113fdftsr5e4pzj6xssxltpl60);
                                    O$b o$b = (O$b) k_c.MediaSessionCompatQueueItem;
                                    if (webView2 == null) {
                                        return webResourceResponseRemoteActionCompatParcelizer;
                                    }
                                    BuildersKt.write(new RxConvertKt$asFlow$1(o$b, webView2, shortNewsContentCardView2, 23));
                                    return webResourceResponseRemoteActionCompatParcelizer;
                                } catch (Exception e) {
                                    Timber.RemoteActionCompatParcelizer.RemoteActionCompatParcelizer(e, "Failed to execute web request", new Object[0]);
                                    return super.shouldInterceptRequest(webView2, webResourceRequest);
                                }
                            }
                        }
                    }
                }
                return super.shouldInterceptRequest(webView2, webResourceRequest);
            }

            @Override // android.webkit.WebViewClient
            public final void onPageFinished(WebView webView2, String str) {
                int i9 = 2 % 2;
                int i10 = IconCompatParcelizer + 77;
                RemoteActionCompatParcelizer = i10 % Fields.SpotShadowColor;
                int i11 = i10 % 2;
                WebViewFragment webViewFragment = this.read;
                webViewFragment.MediaDescriptionCompat();
                r8lambda7Q1QCWXCUHrhcsGraulDg_ksbGU r8lambda7q1qcwxcuhrhcsgrauldg_ksbgu = webViewFragment.RatingCompat().MediaMetadataCompat;
                if (r8lambda7q1qcwxcuhrhcsgrauldg_ksbgu != null) {
                    r8lambda7q1qcwxcuhrhcsgrauldg_ksbgu.write((CancellationException) null);
                    int i12 = IconCompatParcelizer + 73;
                    RemoteActionCompatParcelizer = i12 % Fields.SpotShadowColor;
                    int i13 = i12 % 2;
                }
                super.onPageFinished(webView2, str);
            }

            /* JADX WARN: Code duplicated, block: B:9:0x0029 A[PHI: r4
  0x0029: PHI (r4v3 com.roadrunner.web.presentation.WebViewViewModel) = (r4v2 com.roadrunner.web.presentation.WebViewViewModel), (r4v6 com.roadrunner.web.presentation.WebViewViewModel) binds: [B:8:0x0027, B:5:0x001b] A[DONT_GENERATE, DONT_INLINE]] */
            @Override // android.webkit.WebViewClient
            public final void onReceivedHttpError(WebView webView2, WebResourceRequest webResourceRequest, WebResourceResponse webResourceResponse) {
                WebViewViewModel webViewViewModelRatingCompat;
                int i9 = 2 % 2;
                int i10 = RemoteActionCompatParcelizer + 65;
                IconCompatParcelizer = i10 % Fields.SpotShadowColor;
                int statusCode = 0;
                if (i10 % 2 != 0) {
                    super.onReceivedHttpError(webView2, webResourceRequest, webResourceResponse);
                    webViewViewModelRatingCompat = this.read.RatingCompat();
                    int i11 = 49 / 0;
                    if (webResourceResponse != null) {
                        statusCode = webResourceResponse.getStatusCode();
                        int i12 = RemoteActionCompatParcelizer + 67;
                        IconCompatParcelizer = i12 % Fields.SpotShadowColor;
                        int i13 = i12 % 2;
                    }
                } else {
                    super.onReceivedHttpError(webView2, webResourceRequest, webResourceResponse);
                    webViewViewModelRatingCompat = this.read.RatingCompat();
                    if (webResourceResponse != null) {
                        statusCode = webResourceResponse.getStatusCode();
                        int i14 = RemoteActionCompatParcelizer + 67;
                        IconCompatParcelizer = i14 % Fields.SpotShadowColor;
                        int i15 = i14 % 2;
                    }
                }
                webViewViewModelRatingCompat.serializer(webResourceRequest, statusCode, true);
            }

            /* JADX WARN: Code duplicated, block: B:8:0x0022  */
            @Override // android.webkit.WebViewClient
            public final void onReceivedSslError(WebView webView2, SslErrorHandler sslErrorHandler, SslError sslError) {
                String string;
                int i9 = 2 % 2;
                setUdmandroid_sdk_base_release setudmandroid_sdk_base_release = this.read.peekAvailableContext;
                String url = null;
                if (setudmandroid_sdk_base_release == null) {
                    removeNodeAtDepth.serializer("webViewCriticalErrorLogger");
                    throw null;
                }
                int i10 = RemoteActionCompatParcelizer;
                int i11 = i10 + 49;
                IconCompatParcelizer = i11 % Fields.SpotShadowColor;
                int i12 = i11 % 2;
                if (sslError != null) {
                    int i13 = i10 + 37;
                    IconCompatParcelizer = i13 % Fields.SpotShadowColor;
                    int i14 = i13 % 2;
                    string = sslError.toString();
                    if (string == null) {
                        string = "Unknown SSL Error";
                    }
                } else {
                    string = "Unknown SSL Error";
                }
                if (webView2 != null) {
                    int i15 = IconCompatParcelizer + 53;
                    RemoteActionCompatParcelizer = i15 % Fields.SpotShadowColor;
                    if (i15 % 2 == 0) {
                        webView2.getUrl();
                        throw null;
                    }
                    url = webView2.getUrl();
                }
                EnumColumnAdapter enumColumnAdapter = setudmandroid_sdk_base_release.read;
                executeAsList executeaslist = executeAsList.RXP;
                onViewAttachedToWindowlambda0 onviewattachedtowindowlambda0 = new onViewAttachedToWindowlambda0("web_view_error", string);
                if (url == null) {
                    url = "";
                }
                ((SentryCriticalIssueLogger) enumColumnAdapter).write("web_view_ssl_error", executeaslist, "TLS/SSL Handshake failure", onMove.RemoteActionCompatParcelizer(onviewattachedtowindowlambda0, new onViewAttachedToWindowlambda0("url", url)));
                super.onReceivedSslError(webView2, sslErrorHandler, sslError);
            }

            @Override // android.webkit.WebViewClient
            public final void onPageStarted(WebView webView2, String str, Bitmap bitmap) {
                int i9 = 2 % 2;
                super.onPageStarted(webView2, str, bitmap);
                WebViewFragment webViewFragment = this.read;
                r8lambdaGclPTCGavTOcPXGI4OQ7OSlWZ3I r8lambdagclptcgavtocpxgi4oq7oslwz3i = (r8lambdaGclPTCGavTOcPXGI4OQ7OSlWZ3I) webViewFragment.removeOnNewIntentListener.MediaSessionCompatResultReceiverWrapper();
                if (r8lambdagclptcgavtocpxgi4oq7oslwz3i != null) {
                    r8lambdagclptcgavtocpxgi4oq7oslwz3i.IconCompatParcelizer();
                    int i10 = IconCompatParcelizer + 125;
                    RemoteActionCompatParcelizer = i10 % Fields.SpotShadowColor;
                    int i11 = i10 % 2;
                }
                if (webView2 != null) {
                    if (str != null) {
                        int i12 = IconCompatParcelizer + 53;
                        RemoteActionCompatParcelizer = i12 % Fields.SpotShadowColor;
                        if (i12 % 2 != 0 ? hideCurrentlyDisplayingInAppMessage.IconCompatParcelizer((CharSequence) str, (CharSequence) "app/rooster/web", false) : !hideCurrentlyDisplayingInAppMessage.IconCompatParcelizer((CharSequence) str, (CharSequence) "app/rooster/web", false)) {
                            if (webViewFragment.removeMenuProvider == null) {
                                removeNodeAtDepth.serializer("webPostRequestInterceptor");
                                throw null;
                            }
                            webView2.evaluateJavascript("javascript: \nfunction getFullUrl(url) {\n    if (url.startsWith(\"/\")) {\n        return location.protocol + '//' + location.host + url;\n    } else {\n        return url;\n    }\n}\nlet lastXmlhttpRequestPrototypeMethod = null;\nlet xmlhttpRequestHeaders = {};\nlet xmlhttpRequestUrl = null;\nXMLHttpRequest.prototype._open = XMLHttpRequest.prototype.open;\nXMLHttpRequest.prototype.open = function (method, url, async, user, password) {\n    lastXmlhttpRequestPrototypeMethod = method;\n    xmlhttpRequestUrl = url;\n    const asyncWithDefault = async === undefined ? true : async;\n    this._open(method, url, asyncWithDefault, user, password);\n};\nXMLHttpRequest.prototype._setRequestHeader = XMLHttpRequest.prototype.setRequestHeader;\nXMLHttpRequest.prototype.setRequestHeader = function (header, value) {\n    xmlhttpRequestHeaders[header] = value;\n    this._setRequestHeader(header, value);\n};\nXMLHttpRequest.prototype._send = XMLHttpRequest.prototype.send;\nXMLHttpRequest.prototype.send = function (body) {\n    const err = new Error();\n    const url = getFullUrl(xmlhttpRequestUrl);\n    RequestInspection.recordXhr(\n        url,\n        lastXmlhttpRequestPrototypeMethod,\n        body || \"\"\n    );\n    lastXmlhttpRequestPrototypeMethod = null;\n    xmlhttpRequestUrl = null;\n    xmlhttpRequestHeaders = {};\n    this._send(body);\n};\n", null);
                        }
                    }
                    unpackInt2 unpackint2 = webViewFragment.onNewIntent;
                    if (unpackint2 == null) {
                        removeNodeAtDepth.serializer("initializeWebViewInterceptor");
                        throw null;
                    }
                    FirebaseRemoteConfigImpl firebaseRemoteConfigImpl = (FirebaseRemoteConfigImpl) unpackint2.RemoteActionCompatParcelizer;
                    firebaseRemoteConfigImpl.getClass();
                    if (firebaseRemoteConfigImpl.IconCompatParcelizer(updateAdidI.IS_SEAMLESS_TOKEN_REFRESH_ENABLED)) {
                        webView2.evaluateJavascript("window.enableSeamlessTokenRefresh = true", null);
                    }
                }
            }

            /* JADX WARN: Code duplicated, block: B:14:0x0049  */
            /* JADX WARN: Code duplicated, block: B:16:0x0056  */
            /* JADX WARN: Code duplicated, block: B:17:0x008c  */
            /* JADX WARN: Code duplicated, block: B:21:0x0098  */
            /* JADX WARN: Code duplicated, block: B:23:0x00a8  */
            /* JADX WARN: Code duplicated, block: B:25:0x00ac A[DONT_INVERT] */
            /* JADX WARN: Code duplicated, block: B:26:0x00ae  */
            /* JADX WARN: Code duplicated, block: B:28:0x00bd  */
            /* JADX WARN: Code duplicated, block: B:30:0x00c8  */
            /* JADX WARN: Code duplicated, block: B:33:0x00cf  */
            /* JADX WARN: Code duplicated, block: B:35:0x00d3  */
            /* JADX WARN: Code duplicated, block: B:37:0x00ec  */
            /* JADX WARN: Code duplicated, block: B:8:0x0017  */
            @Override // android.webkit.WebViewClient
            public final void onReceivedError(WebView webView2, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
                WebViewFragment webViewFragment;
                setUdmandroid_sdk_base_release setudmandroid_sdk_base_release;
                String string;
                Uri url;
                int i9;
                setUdmandroid_sdk_base_release setudmandroid_sdk_base_release2;
                int i10 = 2 % 2;
                int i11 = IconCompatParcelizer + 105;
                RemoteActionCompatParcelizer = i11 % Fields.SpotShadowColor;
                if (i11 % 2 == 0) {
                    int i12 = 29 / 0;
                    if (webResourceError != null) {
                        webViewFragment = this.read;
                        webViewFragment.RatingCompat().serializer(webResourceRequest, webResourceError.getErrorCode(), false);
                        if (webResourceRequest != null && webResourceRequest.isForMainFrame()) {
                            int i13 = IconCompatParcelizer + 13;
                            RemoteActionCompatParcelizer = i13 % Fields.SpotShadowColor;
                            int i14 = i13 % 2;
                            if (!r8lambda1Du6vMW2psEy7y5ets5E4hHHZ8.IconCompatParcelizer.contains(Integer.valueOf(webResourceError.getErrorCode()))) {
                                int i15 = IconCompatParcelizer + 47;
                                RemoteActionCompatParcelizer = i15 % Fields.SpotShadowColor;
                                int i16 = i15 % 2;
                                setudmandroid_sdk_base_release2 = webViewFragment.peekAvailableContext;
                                if (setudmandroid_sdk_base_release2 != null) {
                                    removeNodeAtDepth.serializer("webViewCriticalErrorLogger");
                                    throw null;
                                }
                                ((SentryCriticalIssueLogger) setudmandroid_sdk_base_release2.read).write("web_view_content_not_loaded_v1", executeAsList.RXP, "WebView content could not be loaded", onMove.RemoteActionCompatParcelizer(new onViewAttachedToWindowlambda0("web_view_error", webResourceError.getDescription().toString()), new onViewAttachedToWindowlambda0("http_error_code", String.valueOf(webResourceError.getErrorCode()))));
                            }
                        }
                        if (webResourceError.getErrorCode() != -12) {
                            int i17 = IconCompatParcelizer + 117;
                            RemoteActionCompatParcelizer = i17 % Fields.SpotShadowColor;
                            int i18 = i17 % 2;
                            if (webResourceError.getErrorCode() == -1) {
                                setudmandroid_sdk_base_release = webViewFragment.peekAvailableContext;
                                if (setudmandroid_sdk_base_release != null) {
                                    removeNodeAtDepth.serializer("webViewCriticalErrorLogger");
                                    throw null;
                                }
                                if (webResourceRequest != null) {
                                    int i19 = IconCompatParcelizer + 7;
                                    RemoteActionCompatParcelizer = i19 % Fields.SpotShadowColor;
                                    int i20 = i19 % 2;
                                    url = webResourceRequest.getUrl();
                                    if (url != null) {
                                        i9 = RemoteActionCompatParcelizer + 101;
                                        IconCompatParcelizer = i9 % Fields.SpotShadowColor;
                                        if (i9 % 2 == 0) {
                                            url.toString();
                                            throw null;
                                        }
                                        string = url.toString();
                                        if (string == null) {
                                            string = SystemUtils.UNKNOWN;
                                        }
                                    } else {
                                        string = SystemUtils.UNKNOWN;
                                    }
                                } else {
                                    string = SystemUtils.UNKNOWN;
                                }
                                EnumColumnAdapter enumColumnAdapter = setudmandroid_sdk_base_release.read;
                                executeAsList executeaslist = executeAsList.RXP;
                                Map mapSingletonMap = Collections.singletonMap("url", string);
                                mapSingletonMap.getClass();
                                ((SentryCriticalIssueLogger) enumColumnAdapter).write("web_view_broken_url", executeaslist, "Passing the Broken URL string to Sentry events", mapSingletonMap);
                            }
                        } else {
                            setudmandroid_sdk_base_release = webViewFragment.peekAvailableContext;
                            if (setudmandroid_sdk_base_release != null) {
                                removeNodeAtDepth.serializer("webViewCriticalErrorLogger");
                                throw null;
                            }
                            if (webResourceRequest != null) {
                                int i110 = IconCompatParcelizer + 7;
                                RemoteActionCompatParcelizer = i110 % Fields.SpotShadowColor;
                                int i21 = i110 % 2;
                                url = webResourceRequest.getUrl();
                                if (url != null) {
                                    i9 = RemoteActionCompatParcelizer + 101;
                                    IconCompatParcelizer = i9 % Fields.SpotShadowColor;
                                    if (i9 % 2 == 0) {
                                        url.toString();
                                        throw null;
                                    }
                                    string = url.toString();
                                    if (string == null) {
                                        string = SystemUtils.UNKNOWN;
                                    }
                                } else {
                                    string = SystemUtils.UNKNOWN;
                                }
                            } else {
                                string = SystemUtils.UNKNOWN;
                            }
                            EnumColumnAdapter enumColumnAdapter2 = setudmandroid_sdk_base_release.read;
                            executeAsList executeaslist2 = executeAsList.RXP;
                            Map mapSingletonMap2 = Collections.singletonMap("url", string);
                            mapSingletonMap2.getClass();
                            ((SentryCriticalIssueLogger) enumColumnAdapter2).write("web_view_broken_url", executeaslist2, "Passing the Broken URL string to Sentry events", mapSingletonMap2);
                        }
                    }
                } else if (webResourceError != null) {
                    webViewFragment = this.read;
                    webViewFragment.RatingCompat().serializer(webResourceRequest, webResourceError.getErrorCode(), false);
                    if (webResourceRequest != null) {
                        int i111 = IconCompatParcelizer + 13;
                        RemoteActionCompatParcelizer = i111 % Fields.SpotShadowColor;
                        int i112 = i111 % 2;
                        if (!r8lambda1Du6vMW2psEy7y5ets5E4hHHZ8.IconCompatParcelizer.contains(Integer.valueOf(webResourceError.getErrorCode()))) {
                            int i113 = IconCompatParcelizer + 47;
                            RemoteActionCompatParcelizer = i113 % Fields.SpotShadowColor;
                            int i114 = i113 % 2;
                            setudmandroid_sdk_base_release2 = webViewFragment.peekAvailableContext;
                            if (setudmandroid_sdk_base_release2 != null) {
                                removeNodeAtDepth.serializer("webViewCriticalErrorLogger");
                                throw null;
                            }
                            ((SentryCriticalIssueLogger) setudmandroid_sdk_base_release2.read).write("web_view_content_not_loaded_v1", executeAsList.RXP, "WebView content could not be loaded", onMove.RemoteActionCompatParcelizer(new onViewAttachedToWindowlambda0("web_view_error", webResourceError.getDescription().toString()), new onViewAttachedToWindowlambda0("http_error_code", String.valueOf(webResourceError.getErrorCode()))));
                        }
                    }
                    if (webResourceError.getErrorCode() != -12) {
                        int i115 = IconCompatParcelizer + 117;
                        RemoteActionCompatParcelizer = i115 % Fields.SpotShadowColor;
                        int i116 = i115 % 2;
                        if (webResourceError.getErrorCode() == -1) {
                            setudmandroid_sdk_base_release = webViewFragment.peekAvailableContext;
                            if (setudmandroid_sdk_base_release != null) {
                                removeNodeAtDepth.serializer("webViewCriticalErrorLogger");
                                throw null;
                            }
                            if (webResourceRequest != null) {
                                int i117 = IconCompatParcelizer + 7;
                                RemoteActionCompatParcelizer = i117 % Fields.SpotShadowColor;
                                int i22 = i117 % 2;
                                url = webResourceRequest.getUrl();
                                if (url != null) {
                                    i9 = RemoteActionCompatParcelizer + 101;
                                    IconCompatParcelizer = i9 % Fields.SpotShadowColor;
                                    if (i9 % 2 == 0) {
                                        url.toString();
                                        throw null;
                                    }
                                    string = url.toString();
                                    if (string == null) {
                                        string = SystemUtils.UNKNOWN;
                                    }
                                } else {
                                    string = SystemUtils.UNKNOWN;
                                }
                            } else {
                                string = SystemUtils.UNKNOWN;
                            }
                            EnumColumnAdapter enumColumnAdapter3 = setudmandroid_sdk_base_release.read;
                            executeAsList executeaslist3 = executeAsList.RXP;
                            Map mapSingletonMap3 = Collections.singletonMap("url", string);
                            mapSingletonMap3.getClass();
                            ((SentryCriticalIssueLogger) enumColumnAdapter3).write("web_view_broken_url", executeaslist3, "Passing the Broken URL string to Sentry events", mapSingletonMap3);
                        }
                    } else {
                        setudmandroid_sdk_base_release = webViewFragment.peekAvailableContext;
                        if (setudmandroid_sdk_base_release != null) {
                            removeNodeAtDepth.serializer("webViewCriticalErrorLogger");
                            throw null;
                        }
                        if (webResourceRequest != null) {
                            int i118 = IconCompatParcelizer + 7;
                            RemoteActionCompatParcelizer = i118 % Fields.SpotShadowColor;
                            int i23 = i118 % 2;
                            url = webResourceRequest.getUrl();
                            if (url != null) {
                                i9 = RemoteActionCompatParcelizer + 101;
                                IconCompatParcelizer = i9 % Fields.SpotShadowColor;
                                if (i9 % 2 == 0) {
                                    url.toString();
                                    throw null;
                                }
                                string = url.toString();
                                if (string == null) {
                                    string = SystemUtils.UNKNOWN;
                                }
                            } else {
                                string = SystemUtils.UNKNOWN;
                            }
                        } else {
                            string = SystemUtils.UNKNOWN;
                        }
                        EnumColumnAdapter enumColumnAdapter4 = setudmandroid_sdk_base_release.read;
                        executeAsList executeaslist4 = executeAsList.RXP;
                        Map mapSingletonMap4 = Collections.singletonMap("url", string);
                        mapSingletonMap4.getClass();
                        ((SentryCriticalIssueLogger) enumColumnAdapter4).write("web_view_broken_url", executeaslist4, "Passing the Broken URL string to Sentry events", mapSingletonMap4);
                    }
                }
                super.onReceivedError(webView2, webResourceRequest, webResourceError);
            }

            /* JADX WARN: Code duplicated, block: B:149:0x03f8  */
            /* JADX WARN: Code duplicated, block: B:151:0x03fc A[DONT_INVERT] */
            /* JADX WARN: Code duplicated, block: B:152:0x03fe  */
            /* JADX WARN: Code duplicated, block: B:153:0x0403  */
            /* JADX WARN: Code duplicated, block: B:156:0x040d  */
            /* JADX WARN: Code duplicated, block: B:157:0x0412  */
            /* JADX WARN: Code duplicated, block: B:159:0x0415  */
            /* JADX WARN: Code duplicated, block: B:160:0x041f  */
            /* JADX WARN: Code duplicated, block: B:163:0x0444  */
            /* JADX WARN: Code duplicated, block: B:164:0x0447  */
            /* JADX WARN: Code duplicated, block: B:166:0x046b  */
            /* JADX WARN: Code duplicated, block: B:168:0x046f  */
            /* JADX WARN: Code duplicated, block: B:176:0x0511  */
            /* JADX WARN: Code duplicated, block: B:24:0x010e  */
            /* JADX WARN: Code duplicated, block: B:25:0x0111 A[DONT_INVERT, PHI: r1
  0x0111: PHI (r1v59 java.lang.String) = (r1v51 java.lang.String), (r1v65 java.lang.String) binds: [B:23:0x010c, B:20:0x00e3] A[DONT_GENERATE, DONT_INLINE]] */
            /* JADX WARN: Code duplicated, block: B:26:0x0113  */
            /* JADX WARN: Code duplicated, block: B:27:0x011f  */
            /* JADX WARN: Code duplicated, block: B:56:0x0194  */
            @Override // android.webkit.WebViewClient
            public final boolean shouldOverrideUrlLoading(WebView webView2, WebResourceRequest webResourceRequest) throws URISyntaxException {
                String lowerCase;
                BrazeExternalSyntheticLambda28 brazeExternalSyntheticLambda28;
                Uri url;
                FragmentActivity fragmentActivityRequireActivity;
                String scheme;
                String lowerCase2;
                Uri url2;
                Uri url3;
                Uri url4;
                String str;
                String queryParameter;
                r8lambdaL7OLu8lNAZvDt7ctKnLhqGV_Huc r8lambdal7olu8lnazvdt7ctknlhqgv_huc;
                int i9 = 2 % 2;
                WebViewFragment webViewFragment = this.read;
                BrazeExternalSyntheticLambda4 brazeExternalSyntheticLambda4 = null;
                Uri url5 = null;
                if (webViewFragment.registerForActivityResult == null) {
                    removeNodeAtDepth.serializer("webNavigator");
                    throw null;
                }
                int i10 = IconCompatParcelizer + 67;
                RemoteActionCompatParcelizer = i10 % Fields.SpotShadowColor;
                int i11 = i10 % 2;
                Uri url6 = webResourceRequest != null ? webResourceRequest.getUrl() : null;
                if (url6 != null) {
                    if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{url6.getScheme(), "roadrunner"}, getCieXyz.write())).booleanValue()) {
                        if (!(!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{url6.getHost(), "web-integrations"}, getCieXyz.write())).booleanValue())) {
                            if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{url6.getPath(), "/actions/close"}, getCieXyz.write())).booleanValue()) {
                                int i12 = IconCompatParcelizer + 115;
                                RemoteActionCompatParcelizer = i12 % Fields.SpotShadowColor;
                                if (i12 % 2 == 0) {
                                    queryParameter = url6.getQueryParameter("flow");
                                    int i13 = 99 / 0;
                                    if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{queryParameter, "terms_and_conditions"}, getCieXyz.write())).booleanValue()) {
                                        r8lambdal7olu8lnazvdt7ctknlhqgv_huc = r8lambdaL7OLu8lNAZvDt7ctKnLhqGV_Huc.TNC;
                                    } else if (queryParameter == null) {
                                        int i14 = IconCompatParcelizer + 55;
                                        RemoteActionCompatParcelizer = i14 % Fields.SpotShadowColor;
                                        int i15 = i14 % 2;
                                        r8lambdal7olu8lnazvdt7ctknlhqgv_huc = r8lambdaL7OLu8lNAZvDt7ctKnLhqGV_Huc.NONE;
                                    } else {
                                        r8lambdal7olu8lnazvdt7ctknlhqgv_huc = r8lambdaL7OLu8lNAZvDt7ctKnLhqGV_Huc.UNKNOWN;
                                    }
                                } else {
                                    queryParameter = url6.getQueryParameter("flow");
                                    if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{queryParameter, "terms_and_conditions"}, getCieXyz.write())).booleanValue()) {
                                        r8lambdal7olu8lnazvdt7ctknlhqgv_huc = r8lambdaL7OLu8lNAZvDt7ctKnLhqGV_Huc.TNC;
                                    } else if (queryParameter == null) {
                                        int i16 = IconCompatParcelizer + 55;
                                        RemoteActionCompatParcelizer = i16 % Fields.SpotShadowColor;
                                        int i17 = i16 % 2;
                                        r8lambdal7olu8lnazvdt7ctknlhqgv_huc = r8lambdaL7OLu8lNAZvDt7ctKnLhqGV_Huc.NONE;
                                    } else {
                                        r8lambdal7olu8lnazvdt7ctknlhqgv_huc = r8lambdaL7OLu8lNAZvDt7ctKnLhqGV_Huc.UNKNOWN;
                                    }
                                }
                                r8lambdal7olu8lnazvdt7ctknlhqgv_huc.getClass();
                                int i18 = BrazeExternalSyntheticLambda75.serializer[r8lambdal7olu8lnazvdt7ctknlhqgv_huc.ordinal()];
                                if (i18 == 1) {
                                    r8lambda52ctlEduwkfz3l8UwwWKdau6wdM r8lambda52ctleduwkfz3l8uwwwkdau6wdm = webViewFragment.onSaveInstanceState;
                                    if (r8lambda52ctleduwkfz3l8uwwwkdau6wdm == null) {
                                        removeNodeAtDepth.serializer("skipTncBufferService");
                                        throw null;
                                    }
                                    r8lambda52ctleduwkfz3l8uwwwkdau6wdm.IconCompatParcelizer.set(r8lambda52ctleduwkfz3l8uwwwkdau6wdm.write.millis());
                                } else if (i18 != 2 && i18 != 3) {
                                    ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer();
                                    return false;
                                }
                                WebViewViewModel webViewViewModelRatingCompat = webViewFragment.RatingCompat();
                                webViewViewModelRatingCompat.MediaDescriptionCompat = new r8lambdaDgZfnZEk_YNXSsj7DOWrjAToNK0(r8lambdaFBhg_Qe5GHikJZF0cQ6G2RUyiU.SUCCESS, null, null);
                                webViewViewModelRatingCompat.RemoteActionCompatParcelizer.RemoteActionCompatParcelizer(BrazeExternalSyntheticLambda64.write);
                                return true;
                            }
                        }
                    }
                }
                if (webViewFragment.onRequestPermissionsResult == null) {
                    removeNodeAtDepth.serializer("messagingAppNavigator");
                    throw null;
                }
                Uri url7 = webResourceRequest != null ? webResourceRequest.getUrl() : null;
                if (url7 != null) {
                    int i19 = RemoteActionCompatParcelizer + 91;
                    IconCompatParcelizer = i19 % Fields.SpotShadowColor;
                    if (i19 % 2 != 0) {
                        url7.getScheme();
                        brazeExternalSyntheticLambda4.hashCode();
                        throw null;
                    }
                    String scheme2 = url7.getScheme();
                    if (scheme2 != null) {
                        lowerCase = scheme2.toLowerCase(Locale.ROOT);
                        lowerCase.getClass();
                    } else {
                        lowerCase = null;
                    }
                } else {
                    lowerCase = null;
                }
                if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{lowerCase, "tg"}, getCieXyz.write())).booleanValue()) {
                    brazeExternalSyntheticLambda28 = webViewFragment.onRequestPermissionsResult;
                    if (brazeExternalSyntheticLambda28 != null) {
                        removeNodeAtDepth.serializer("messagingAppNavigator");
                        throw null;
                    }
                    if (webResourceRequest != null) {
                        url = webResourceRequest.getUrl();
                    } else {
                        url = null;
                    }
                    fragmentActivityRequireActivity = webViewFragment.requireActivity();
                    fragmentActivityRequireActivity.getClass();
                    if (url != null) {
                        scheme = url.getScheme();
                    } else {
                        scheme = null;
                    }
                    if (scheme != null) {
                        lowerCase2 = scheme.toLowerCase(Locale.ROOT);
                        lowerCase2.getClass();
                    } else {
                        lowerCase2 = null;
                    }
                    if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{lowerCase2, "tg"}, getCieXyz.write())).booleanValue()) {
                        brazeExternalSyntheticLambda4 = BrazeExternalSyntheticLambda4.TELEGRAM;
                    } else {
                        if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{lowerCase2, "whatsapp"}, getCieXyz.write())).booleanValue()) {
                            brazeExternalSyntheticLambda4 = BrazeExternalSyntheticLambda4.WHATSAPP;
                        }
                    }
                    if (brazeExternalSyntheticLambda4 != null) {
                        setTransactionSuccessful settransactionsuccessful = brazeExternalSyntheticLambda28.read;
                        fragmentActivityRequireActivity.startActivity(new Intent("android.intent.action.VIEW", url));
                    }
                } else {
                    if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{lowerCase, "whatsapp"}, getCieXyz.write())).booleanValue()) {
                        brazeExternalSyntheticLambda28 = webViewFragment.onRequestPermissionsResult;
                        if (brazeExternalSyntheticLambda28 != null) {
                            removeNodeAtDepth.serializer("messagingAppNavigator");
                            throw null;
                        }
                        if (webResourceRequest != null) {
                            url = webResourceRequest.getUrl();
                        } else {
                            url = null;
                        }
                        fragmentActivityRequireActivity = webViewFragment.requireActivity();
                        fragmentActivityRequireActivity.getClass();
                        if (url != null) {
                            scheme = url.getScheme();
                        } else {
                            scheme = null;
                        }
                        if (scheme != null) {
                            lowerCase2 = scheme.toLowerCase(Locale.ROOT);
                            lowerCase2.getClass();
                        } else {
                            lowerCase2 = null;
                        }
                        if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{lowerCase2, "tg"}, getCieXyz.write())).booleanValue()) {
                            brazeExternalSyntheticLambda4 = BrazeExternalSyntheticLambda4.TELEGRAM;
                        } else {
                            if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{lowerCase2, "whatsapp"}, getCieXyz.write())).booleanValue()) {
                                brazeExternalSyntheticLambda4 = BrazeExternalSyntheticLambda4.WHATSAPP;
                            }
                        }
                        if (brazeExternalSyntheticLambda4 != null) {
                            setTransactionSuccessful settransactionsuccessful2 = brazeExternalSyntheticLambda28.read;
                            try {
                                fragmentActivityRequireActivity.startActivity(new Intent("android.intent.action.VIEW", url));
                            } catch (ActivityNotFoundException e) {
                                Timber.RemoteActionCompatParcelizer.RemoteActionCompatParcelizer(e, "No messaging activity found for URL \"" + url + "\"", new Object[0]);
                                MediaSessionCompatQueueItem.IconCompatParcelizer(settransactionsuccessful2.read(brazeExternalSyntheticLambda4.getTitleRes(), brazeExternalSyntheticLambda4.getAppName()), settransactionsuccessful2.read(brazeExternalSyntheticLambda4.getDescriptionRes(), brazeExternalSyntheticLambda4.getAppName()), settransactionsuccessful2.IconCompatParcelizer(R.string.got_it), null, null, false, false, true, 376).RemoteActionCompatParcelizer(fragmentActivityRequireActivity.getSupportFragmentManager(), "TAG_OPEN_MESSAGING_URL_ERROR_DIALOG");
                            } catch (Exception e2) {
                                Timber.RemoteActionCompatParcelizer.RemoteActionCompatParcelizer(e2, "Something went wrong while opening URL \"" + url + "\"", new Object[0]);
                                MediaSessionCompatQueueItem.IconCompatParcelizer(settransactionsuccessful2.IconCompatParcelizer(R.string.all_error), null, settransactionsuccessful2.IconCompatParcelizer(R.string.got_it), null, null, false, false, true, 378).RemoteActionCompatParcelizer(fragmentActivityRequireActivity.getSupportFragmentManager(), "TAG_OPEN_MESSAGING_URL_ERROR_DIALOG");
                            }
                        }
                    } else {
                        if (webViewFragment.onCreate == null) {
                            removeNodeAtDepth.serializer("intentNavigator");
                            throw null;
                        }
                        if (webResourceRequest != null) {
                            int i20 = IconCompatParcelizer + 9;
                            RemoteActionCompatParcelizer = i20 % Fields.SpotShadowColor;
                            if (i20 % 2 == 0) {
                                webResourceRequest.getUrl();
                                brazeExternalSyntheticLambda4.hashCode();
                                throw null;
                            }
                            url2 = webResourceRequest.getUrl();
                        } else {
                            url2 = null;
                        }
                        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{url2 != null ? url2.getScheme() : null, CommonCode.Resolution.HAS_RESOLUTION_FROM_APK}, getCieXyz.write())).booleanValue()) {
                            if (((FirebaseRemoteConfigImpl) webViewFragment.MediaMetadataCompat()).IconCompatParcelizer(updateAdidI.IS_GARNET_MIGRATION_ENABLED)) {
                                if (webViewFragment.onActivityResult == null) {
                                    removeNodeAtDepth.serializer("customSchemeNavigator");
                                    throw null;
                                }
                                Uri url8 = webResourceRequest != null ? webResourceRequest.getUrl() : null;
                                if (onContentCardDismissed.write(BrazeExternalSyntheticLambda19.IconCompatParcelizer, url8 != null ? url8.getScheme() : null)) {
                                    if (webViewFragment.onActivityResult == null) {
                                        removeNodeAtDepth.serializer("customSchemeNavigator");
                                        throw null;
                                    }
                                    int i21 = IconCompatParcelizer + 61;
                                    int i22 = i21 % Fields.SpotShadowColor;
                                    RemoteActionCompatParcelizer = i22;
                                    int i23 = i21 % 2;
                                    if (webResourceRequest != null) {
                                        int i24 = i22 + 11;
                                        IconCompatParcelizer = i24 % Fields.SpotShadowColor;
                                        int i25 = i24 % 2;
                                        url5 = webResourceRequest.getUrl();
                                    }
                                    FragmentActivity fragmentActivityRequireActivity2 = webViewFragment.requireActivity();
                                    fragmentActivityRequireActivity2.getClass();
                                    if (url5 != null && (str = (String) BrazeExternalSyntheticLambda19.RemoteActionCompatParcelizer.get(url5.getScheme())) != null) {
                                        try {
                                            fragmentActivityRequireActivity2.startActivity(new Intent("android.intent.action.VIEW", url5));
                                        } catch (ActivityNotFoundException e3) {
                                            Timber.RemoteActionCompatParcelizer.read(e3, "App not installed, falling back to Play Store", new Object[0]);
                                            try {
                                                fragmentActivityRequireActivity2.startActivity(new Intent("android.intent.action.VIEW", Uri.parse("market://details?id=".concat(str))));
                                            } catch (ActivityNotFoundException e4) {
                                                Timber.RemoteActionCompatParcelizer.RemoteActionCompatParcelizer(e4, "Play Store app not found, falling back to browser", new Object[0]);
                                                fragmentActivityRequireActivity2.startActivity(new Intent("android.intent.action.VIEW", Uri.parse("https://play.google.com/store/apps/details?id=".concat(str))));
                                            }
                                        }
                                    }
                                }
                            }
                            if (webResourceRequest != null) {
                                int i26 = RemoteActionCompatParcelizer + 73;
                                IconCompatParcelizer = i26 % Fields.SpotShadowColor;
                                if (i26 % 2 != 0) {
                                    webResourceRequest.getUrl();
                                    brazeExternalSyntheticLambda4.hashCode();
                                    throw null;
                                }
                                url4 = webResourceRequest.getUrl();
                            } else {
                                url4 = null;
                            }
                            if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{url4 != null ? url4.getScheme() : null, "roadrunner"}, getCieXyz.write())).booleanValue()) {
                                Intent intent = new Intent("android.intent.action.VIEW", url4);
                                if (intent.resolveActivity(webViewFragment.requireActivity().getPackageManager()) != null) {
                                    int i27 = IconCompatParcelizer + 21;
                                    RemoteActionCompatParcelizer = i27 % Fields.SpotShadowColor;
                                    int i28 = i27 % 2;
                                    webViewFragment.startActivity(intent);
                                    return true;
                                }
                            }
                            return super.shouldOverrideUrlLoading(webView2, webResourceRequest);
                        }
                        BrazeExternalSyntheticLambda28 brazeExternalSyntheticLambda29 = webViewFragment.onCreate;
                        if (brazeExternalSyntheticLambda29 == null) {
                            removeNodeAtDepth.serializer("intentNavigator");
                            throw null;
                        }
                        if (webResourceRequest != null) {
                            int i29 = IconCompatParcelizer + 27;
                            RemoteActionCompatParcelizer = i29 % Fields.SpotShadowColor;
                            int i30 = i29 % 2;
                            url3 = webResourceRequest.getUrl();
                        } else {
                            url3 = null;
                        }
                        FragmentActivity fragmentActivityRequireActivity3 = webViewFragment.requireActivity();
                        fragmentActivityRequireActivity3.getClass();
                        setTransactionSuccessful settransactionsuccessful3 = brazeExternalSyntheticLambda29.read;
                        Intent uri = Intent.parseUri(String.valueOf(url3), 1);
                        uri.addCategory("android.intent.category.BROWSABLE");
                        uri.setComponent(null);
                        Intent selector = uri.getSelector();
                        if (selector != null) {
                            selector.addCategory("android.intent.category.BROWSABLE");
                            selector.setComponent(null);
                        }
                        try {
                            fragmentActivityRequireActivity3.startActivity(uri);
                        } catch (ActivityNotFoundException e5) {
                            Timber.RemoteActionCompatParcelizer.RemoteActionCompatParcelizer(e5, SweepGradientShader9KIMszodefault.IconCompatParcelizer(url3, "No app found to handle URI = "), new Object[0]);
                        } catch (URISyntaxException e6) {
                            Timber.RemoteActionCompatParcelizer.RemoteActionCompatParcelizer(e6, SweepGradientShader9KIMszodefault.IconCompatParcelizer(url3, "Invalid intent URI: "), new Object[0]);
                        } catch (Exception e7) {
                            Timber.RemoteActionCompatParcelizer.RemoteActionCompatParcelizer(e7, SweepGradientShader9KIMszodefault.IconCompatParcelizer(url3, "Something went wrong while opening intent URL = "), new Object[0]);
                            MediaSessionCompatQueueItem.IconCompatParcelizer(settransactionsuccessful3.IconCompatParcelizer(R.string.all_error), null, settransactionsuccessful3.IconCompatParcelizer(R.string.got_it), null, null, false, false, true, 378).RemoteActionCompatParcelizer(fragmentActivityRequireActivity3.getSupportFragmentManager(), "TAG_OPEN_INTENT_URL_ERROR_DIALOG");
                        }
                    }
                }
                return true;
            }
        });
    }
}
