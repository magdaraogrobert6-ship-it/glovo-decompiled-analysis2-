package com.foodora.courier.main.presentation;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Toast;
import androidx.activity.OnBackPressedDispatcher$OnBackPressedEventInput$$ExternalSyntheticLambda0;
import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView$1;
import androidx.compose.ui.graphics.Fields;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.datastore.core.SimpleActor$offer$2;
import androidx.datastore.core.SingleProcessDataStore$data$1;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.fragment.app.FragmentContainerView;
import androidx.lifecycle.ProcessLifecycleOwner;
import androidx.room.RoomDatabase$closeBarrier$1;
import androidx.work.impl.WorkerWrapper;
import bo.app.f2$$ExternalSyntheticLambda4;
import bo.app.n5;
import coil3.ComponentRegistry$Builder;
import coil3.Extras$Key;
import coil3.ExtrasKt;
import coil3.ImageLoader$Builder;
import coil3.ImageLoader$Builder$$ExternalSyntheticLambda1;
import coil3.RealImageLoader$execute$2$job$1;
import coil3.UriKt;
import coil3.memory.MemoryCacheService;
import coil3.util.ContextsKt;
import com.adjust.sdk.ActivityHandler;
import com.braze.BrazeUser$$ExternalSyntheticLambda28;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import com.foodora.courier.app.application.CourierApplication;
import com.foodora.courier.base.presentation.BaseInjectingMvvmActivity;
import com.foodora.courier.base.presentation.MvvmActivity;
import com.foodora.courier.freshchat.DispatcherChatOrderLogger;
import com.foodora.courier.legacy.ui.main.MainPresenter;
import com.foodora.courier.legacy.ui.main.PushTokenUpdateViewModel;
import com.foodora.courier.main.lifecycle.PermissionsLifecycleObserver;
import com.foodora.courier.main.presentation.MainActivity;
import com.foodora.courier.main.usecases.GetHelpCenterParamsUseCase;
import com.google.android.play.core.appupdate.zzz;
import com.logistics.rider.glovo.R;
import com.mapbox.maps.plugin.MapDelegateProviderImpl;
import com.roadrunner.appperformance.TraceTimeMeasurementWithPerformanceKit;
import com.roadrunner.appreview.AppReviewLifecycleObserverImpl;
import com.roadrunner.appupdate.PlayStoreBasedAppUpdate;
import com.roadrunner.customerchat.usecases.CustomerChatCommunicatorImpl;
import com.roadrunner.delivery.accept.acknowledgment.implementation.domain.GetAcknowledgmentParamsImpl;
import com.roadrunner.delivery.midshiftverification.MidShiftIdVerificationCoordinator;
import com.roadrunner.delivery.ontheway.observer.OnTheWayLifecycleObserverImpl;
import com.roadrunner.delivery.pickupdropoff.bluetoothscanning.BleScanningLifecycleObserverImpl;
import com.roadrunner.delivery.state.StateV3$$ExternalSyntheticLambda0;
import com.roadrunner.experience_tools.qualtrics.QualtricsManagerImpl;
import com.roadrunner.heatmap.domain.SaveHeatmapUrlImpl;
import com.roadrunner.helpcenter.floating.lifecycle.HomeHelpCenterLifecycleObserverImpl;
import com.roadrunner.home.CreateHomeScope;
import com.roadrunner.home.HomeFragment;
import com.roadrunner.home.HomeViewModel;
import com.roadrunner.nafath.VerificationStatusLifecycleObserverImpl;
import com.roadrunner.nafath.data.VerificationStatusRepository;
import com.roadrunner.push.DialogMessageRequestProxy;
import com.roadrunner.remoteconfig.firebase.FirebaseRemoteConfigImpl;
import com.roadrunner.remoteconfig.fwf.genii.Gen2FunWithFlagsConfigRepository;
import com.roadrunner.rider.state.cashblock.domain.GetCashBlockUiState$invoke$1;
import com.roadrunner.rider.state.domain.GetRiderStateImpl;
import com.roadrunner.rider.state.provider.domain.GetShiftInfoImpl;
import com.roadrunner.rider.state.shift.GetCourierShiftInfoImpl;
import com.roadrunner.rider.state.status.GetCourierStatusUseCaseImpl;
import com.roadrunner.rider.support.implementation.RiderSupportRootedCheckImpl;
import com.roadrunner.sidemenu.data.SideMenuRepository;
import com.roadrunner.sidemenu.navigation.SideMenuDrawerManagerImpl$observeNavigationEvents$1;
import com.roadrunner.util.sound.DefaultBackgroundSoundManager;
import io.grpc.CallOptions$Builder;
import io.grpc.internal.CallTracer;
import io.reactivex.internal.operators.flowable.FlowableDoFinally;
import io.reactivex.internal.util.NotificationLite;
import io.sentry.CombinedScopeView;
import io.sentry.hints.PlaybackStateCompatCustomAction;
import io.sentry.metrics.MetricsBatchProcessor;
import io.sentry.util.MediaBrowserCompatMediaItem;
import io.sentry.util.UrlUtils;
import java.lang.ref.WeakReference;
import java.time.Clock;
import java.util.ArrayList;
import java.util.Set;
import java.util.concurrent.CancellationException;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt__ZipKt$combine$$inlined$unsafeFlow$1;
import kotlinx.coroutines.reactive.PublisherAsFlow;
import o.AndroidUiFrameClock;
import o.AnnotationRangeListSaverlambda1;
import o.AnnotationRangeSaverlambda0;
import o.BaselineShiftSaverlambda0;
import o.BrazeExternalSyntheticLambda29;
import o.ContentScaleCompanionFillWidth1;
import o.EmojiCompatStatusDelegate;
import o.FocusPropertiesKtsamandroidx_compose_ui_focus_FocusPropertiesScope0;
import o.FocusRestorerElement;
import o.FragmentManager8;
import o.IInAppMessageViewWrapper;
import o.ImageHeaderParserImageType;
import o.IndirectPointerEvent;
import o.IndirectPointerEventPrimaryDirectionalMotionAxis;
import o.IndirectPointerEventType;
import o.IndirectPointerEventeAXfkT4default;
import o.LineBreakStrategyCompanion;
import o.PackageHandler7;
import o.PlatformStringDelegate;
import o.RectManager;
import o.SemanticsInfoKt;
import o.SemanticsOwnerKt;
import o.SemanticsPropertiesContentDescription1;
import o.ShortNewsContentCardView;
import o.SystemLifecycleContentProvider;
import o.SystemLifecycleSystemLifecycleCache;
import o.TextLinkStylesSaverlambda0;
import o.TextMotionLinearity;
import o.ThirdPartySharingResponseData;
import o.TypefaceDirtyTrackerLinkedList;
import o.UrlAnnotationSaverlambda0;
import o.Util;
import o.UtilsKt;
import o.WorkManagerImpl;
import o.Worker;
import o.XmlVectorParser_androidKt;
import o.access900;
import o.accessdrawWithChildTracking;
import o.accessgetFalseyp;
import o.accessgetSdkEnablementProvidercp;
import o.accessgetXcp;
import o.accessgetYcp;
import o.accessisMainThread;
import o.accessrequireViewFactoryHolder;
import o.addRearDisplayStatusListener;
import o.convertActionToIndirectPointerEventType;
import o.createFromParcel;
import o.decode;
import o.deleteEventMetadata;
import o.displayInAppMessagelambda1;
import o.div7Ah8Wj8;
import o.emitcomroadrunnerdeliveryanalyticsStateV3AnalyticsProviderImplspecialinlinedmap12;
import o.emitcomroadrunnerdeliveryapisChatDeliveryRepositoryImplobserveCustomerChatStateinlinedexternalComponent12;
import o.emitcomroadrunnerdeliverycommondataChatAvailabilityManagerobserveIfShouldShowChatListinlinedmap12;
import o.foregroundTimerFiredI;
import o.fromColorLong;
import o.getActionViewIntentlambda0;
import o.getAllSemanticsNodesToMap;
import o.getBitmapui_graphics;
import o.getCollectionItemInfo;
import o.getColorIntegerOrNull;
import o.getDefaulteUduSuoannotations;
import o.getDoubleOrNull;
import o.getEnterAnim;
import o.getEnterTransitionCallback;
import o.getFilterQualityfv9h1I;
import o.getFocusedView;
import o.getGestureEnd5zf0vsI;
import o.getGestureThresholdActivate5zf0vsI;
import o.getImeAction;
import o.getKeyboardTap5zf0vsI;
import o.getLinear4e0Vf04;
import o.getNativeEvent;
import o.getNativeEventui;
import o.getNeedsDensityui_text;
import o.getNonenZO2Niw;
import o.getOnExitannotations;
import o.getPreviousUptimeMillis;
import o.getPrimaryDirectionalMotionAxisnZO2Niw;
import o.getRestLineXSAIIZE;
import o.getRootInfoui;
import o.getSTYLEABLE_VECTOR_DRAWABLE_GROUP_ROTATION;
import o.getSTYLEABLE_VECTOR_DRAWABLE_GROUP_TRANSLATE_X;
import o.getSTYLEABLE_VECTOR_DRAWABLE_PATH_FILL_ALPHA;
import o.getSTYLEABLE_VECTOR_DRAWABLE_VIEWPORT_HEIGHT;
import o.getSTYLEABLE_VECTOR_DRAWABLE_WIDTH;
import o.getTextAlignbuA522U;
import o.getTextDirectionmmuk1to;
import o.getTouchaOaMEAU;
import o.getUnmergedRootSemanticsNode;
import o.getViewLifecycleOwner;
import o.getXnZO2Niw;
import o.getYnZO2Niw;
import o.inCompatibilityMode;
import o.indirectPrimaryDirectionalScrollAxis;
import o.invokeSuspendcomroadrunnerrrdscomposecomponenttooltipTooltipKtTooltip31;
import o.isAttachedToWindow;
import o.isInfiniteannotations;
import o.isPartiallyOffscreenInScrollParent;
import o.markFragmentsCreated;
import o.mergeJsonObjects;
import o.mergelambda0;
import o.onBackStartedlambda1;
import o.onDetachedFromRecyclerView;
import o.performHapticFeedbackCdsT49E;
import o.performImeActiondefault;
import o.postAnimationRunner;
import o.postponeEnterTransition;
import o.prepareCallInternal;
import o.qExternalSyntheticLambda1;
import o.r8lambda0tFkXN0c4UQsJxVxyejUo1BomY;
import o.r8lambda2fbYAoOOcVqhXQP2NIm5pmOCD5w;
import o.r8lambda2qMxD75IpTxKfLD4RjAbqEmoamc;
import o.r8lambda5KZolJ_OR7ArWBprLRarbYqZEEA;
import o.r8lambda5YIXqjQinFDsIS50wZsDjw0Xjv4;
import o.r8lambda6p7U4OWYA8jlHo6PgwNWEvZb01M;
import o.r8lambda7Q1QCWXCUHrhcsGraulDg_ksbGU;
import o.r8lambda80jY8yCJXe50LHel8QKZq07he9s;
import o.r8lambda8tW8ADLQysn9smYqAl72CqaRjU;
import o.r8lambda97B6Pg2rSmZnc05L6A5yZDJRg;
import o.r8lambdaPeKEYuJNHtkCVLNkgf2Tg6F0GaM;
import o.r8lambdaUofYenlmWtpWX2ga1uehmSCK4A;
import o.r8lambdaWoCj75gxmwaDkeS1pbJi3djFY;
import o.r8lambdaXxy0IcvbkQrEJYJmjWChAqi7z4;
import o.r8lambdaaj64OZVyd1y4RKHlJSx10F9bUic;
import o.r8lambdadiHCtAejt895m8HzbAibmUGZMKo;
import o.r8lambdaguMkB96aaxyAGqCnh2xMDXoFAs;
import o.r8lambdak8D1aV0PAfigTPLH22X5wDyzFJU;
import o.r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ;
import o.r8lambdatahictpR_RFQlQiXpQeJqGuk8B8;
import o.r8lambdauDhHXlIoLpU0HpCcQH6vOsKpNY;
import o.r8lambdaucGIgHn8fIyV_vccOdEafjFpEdk;
import o.r8lambdavtysCT7TkpE9w0sgzt7Axv0AiUQ;
import o.r8lambdax3lltCpD3rATxa4vQpnFaaGbzP4;
import o.r8lambdaxdfXWt5iCckeuHVb65uEgq9TfBk;
import o.r8lambdaxtMbdW3_JzuVQlt1ETNPgAvo_g;
import o.r8lambdazJ_is40ErW_0zWXIHU0U2X8pyMM;
import o.registerActivityLifecycleCallbacks;
import o.registerForContextMenu;
import o.removeOnContextAvailableListener;
import o.requestLocationInitialization;
import o.resolveLineHeightInPxo2QH7mI;
import o.retryInAppMessageandroid_sdk_base_release;
import o.s0;
import o.s2;
import o.scheduleDebounceCallback;
import o.schedulePushDeliveryandroid_sdk_base_release;
import o.setFocusRequester;
import o.setHorizontalGap;
import o.setLayoutTransition;
import o.setMaxHeight;
import o.setMinHeight;
import o.setOnApplyWindowInsetsListener;
import o.setOnConstraintsChanged;
import o.setOnSessionTrackingFailedListener;
import o.setPaddingBottom;
import o.setRegistrationDataProviderandroid_sdk_base_release;
import o.setSharedElementNames;
import o.setStrokeCapBeK7IIE;
import o.setTransacterruntime;
import o.setTransactionSuccessful;
import o.setVerticalStyle;
import o.subscribeToBannersErrorslambda0;
import o.subscribeToContentCardsUpdateslambda0;
import o.subscribeToNetworkFailureslambda0;
import o.supportsColorMatrixQuery;
import o.toBitmapConfig1JJdX4A;
import o.toClickableSpan;
import o.transferSessionPackageI;
import o.unregisterComponentCallback;
import o.updateAdidI;
import o.updateHandlersStatusAndSendI;
import okio.Path$Companion;
import org.koin.dsl.ModuleDSLKt;
import org.tukaani.xz.delta.DeltaDecoder;
import timber.log.Timber;

/* JADX INFO: loaded from: classes2.dex */
@SuppressLint
public class MainActivity extends BaseInjectingMvvmActivity<getPrimaryDirectionalMotionAxisnZO2Niw, getYnZO2Niw> implements scheduleDebounceCallback {
    private static int addOnMultiWindowModeChangedListener = 1;
    private static int onBackPressedInput_delegatelambda0;

    @r8lambdaPeKEYuJNHtkCVLNkgf2Tg6F0GaM
    ThirdPartySharingResponseData ComponentActivity;

    @r8lambdaPeKEYuJNHtkCVLNkgf2Tg6F0GaM
    subscribeToContentCardsUpdateslambda0 MediaBrowserCompatMediaItem;

    @r8lambdaPeKEYuJNHtkCVLNkgf2Tg6F0GaM
    getImeAction MediaSessionCompatQueueItem;

    @r8lambdaPeKEYuJNHtkCVLNkgf2Tg6F0GaM
    getLinear4e0Vf04 MediaSessionCompatResultReceiverWrapper;

    @r8lambdaPeKEYuJNHtkCVLNkgf2Tg6F0GaM
    getNonenZO2Niw MediaSessionCompatToken;

    @r8lambdaPeKEYuJNHtkCVLNkgf2Tg6F0GaM
    r8lambda0tFkXN0c4UQsJxVxyejUo1BomY ParcelableVolumeInfo;
    indirectPrimaryDirectionalScrollAxis PlaybackStateCompat;

    @r8lambdaPeKEYuJNHtkCVLNkgf2Tg6F0GaM
    r8lambdauDhHXlIoLpU0HpCcQH6vOsKpNY PlaybackStateCompatCustomAction;

    @r8lambdaPeKEYuJNHtkCVLNkgf2Tg6F0GaM
    SemanticsOwnerKt RatingCompat;

    @r8lambdaPeKEYuJNHtkCVLNkgf2Tg6F0GaM
    getRestLineXSAIIZE ResultReceiver;

    @r8lambdaPeKEYuJNHtkCVLNkgf2Tg6F0GaM
    r8lambda97B6Pg2rSmZnc05L6A5yZDJRg _init_lambda1;

    @r8lambdaPeKEYuJNHtkCVLNkgf2Tg6F0GaM
    r8lambdatahictpR_RFQlQiXpQeJqGuk8B8 _init_lambda2;

    @r8lambdaPeKEYuJNHtkCVLNkgf2Tg6F0GaM
    isAttachedToWindow _init_lambda3;

    @r8lambdaPeKEYuJNHtkCVLNkgf2Tg6F0GaM
    getDefaulteUduSuoannotations _init_lambda4;

    @r8lambdaPeKEYuJNHtkCVLNkgf2Tg6F0GaM
    invokeSuspendcomroadrunnerrrdscomposecomponenttooltipTooltipKtTooltip31 accessensureViewModelStore;
    private setOnConstraintsChanged addContentView;

    @r8lambdaPeKEYuJNHtkCVLNkgf2Tg6F0GaM
    IndirectPointerEvent addObserverForBackInvoker;

    @r8lambdaPeKEYuJNHtkCVLNkgf2Tg6F0GaM
    MainPresenter addObserverForBackInvokerlambda0;
    PushTokenUpdateViewModel createFullyDrawnExecutor;

    @r8lambdaPeKEYuJNHtkCVLNkgf2Tg6F0GaM
    IndirectPointerEventType defaultViewModelProviderFactory_delegatelambda0;

    @r8lambdaPeKEYuJNHtkCVLNkgf2Tg6F0GaM
    r8lambdauDhHXlIoLpU0HpCcQH6vOsKpNY ensureViewModelStore;
    public r8lambdavtysCT7TkpE9w0sgzt7Axv0AiUQ fullyDrawnReporter_delegatelambda0;

    @r8lambdaPeKEYuJNHtkCVLNkgf2Tg6F0GaM
    r8lambdaxtMbdW3_JzuVQlt1ETNPgAvo_g fullyDrawnReporter_delegatelambda00;

    @r8lambdaPeKEYuJNHtkCVLNkgf2Tg6F0GaM
    SystemLifecycleContentProvider getOnBackPressedInput;

    @r8lambdaPeKEYuJNHtkCVLNkgf2Tg6F0GaM
    setMaxHeight getSavedStateRegistryControllerannotations;

    @r8lambdaPeKEYuJNHtkCVLNkgf2Tg6F0GaM
    getAllSemanticsNodesToMap menuHostHelperlambda0;
    private performHapticFeedbackCdsT49E onBackPressedDispatcher_delegatelambda0;

    @r8lambdaPeKEYuJNHtkCVLNkgf2Tg6F0GaM
    qExternalSyntheticLambda1 onBackPressedDispatcher_delegatelambda00;

    @r8lambdaPeKEYuJNHtkCVLNkgf2Tg6F0GaM
    getPreviousUptimeMillis onBackPressedDispatcher_delegatelambda010;

    @r8lambdaPeKEYuJNHtkCVLNkgf2Tg6F0GaM
    DispatcherChatOrderLogger r8lambda54BeH8ZsBru0CXI2CCSP2syNys;

    @r8lambdaPeKEYuJNHtkCVLNkgf2Tg6F0GaM
    TextLinkStylesSaverlambda0 r8lambda7IJBVrN0sHyidCAZufWEJFc7yY;

    @r8lambdaPeKEYuJNHtkCVLNkgf2Tg6F0GaM
    IndirectPointerEventeAXfkT4default r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus;

    @r8lambdaPeKEYuJNHtkCVLNkgf2Tg6F0GaM
    transferSessionPackageI r8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss;

    @r8lambdaPeKEYuJNHtkCVLNkgf2Tg6F0GaM
    setLayoutTransition r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg;

    @r8lambdaPeKEYuJNHtkCVLNkgf2Tg6F0GaM
    prepareCallInternal r8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8;

    @r8lambdaPeKEYuJNHtkCVLNkgf2Tg6F0GaM
    XmlVectorParser_androidKt r8lambdaXj9c8VIP9DfEvaTmZt0ejAuC4a4;
    FragmentManager8 r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM;

    @r8lambdaPeKEYuJNHtkCVLNkgf2Tg6F0GaM
    emitcomroadrunnerdeliveryapisChatDeliveryRepositoryImplobserveCustomerChatStateinlinedexternalComponent12 r8lambdag6d1IyBXWIL5aeSAzXsZMVuYCQs;

    @r8lambdaPeKEYuJNHtkCVLNkgf2Tg6F0GaM
    addRearDisplayStatusListener r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28;

    @r8lambdaPeKEYuJNHtkCVLNkgf2Tg6F0GaM
    r8lambda6p7U4OWYA8jlHo6PgwNWEvZb01M r8lambdavCwjfXDiSGcirCy4I008VOiJ_lw;
    r8lambda8tW8ADLQysn9smYqAl72CqaRjU r8lambdawJ5MHcSJed_CjC7r4OWD0UxyJsQ;
    emitcomroadrunnerdeliveryanalyticsStateV3AnalyticsProviderImplspecialinlinedmap12 r8lambdayPQlaAoRiYRJ3IY_TqzUUTrVH0;

    public static /* synthetic */ Object RemoteActionCompatParcelizer(int i, int i2, int i3, int i4, int i5, int i6, Object[] objArr) {
        int i7 = ~i4;
        int i8 = ~i;
        int i9 = (~(i7 | i8)) | (~(i7 | i5)) | (~(i8 | i5));
        int i10 = ~(i | i7);
        int i11 = i5 | i10 | (~(i8 | i4));
        int i12 = i5 + i4 + i2 + ((-393945980) * i3) + (1728320405 * i6);
        int i13 = i12 * i12;
        int i14 = (((-252835662) * i5) - 192251156) + (i4 * (-252834676)) + (i9 * (-493)) + (i10 * (-493)) + (i11 * 493) + ((-252835169) * i2) + (1574575612 * i3) + (147979147 * i6) + (i13 * (-1426456576));
        switch (((-1552544754) * i5) + 1566572544 + ((-1100352524) * i4) + (i9 * (-226096115)) + ((-226096115) * i10) + (226096115 * i11) + ((-1326448640) * i2) + (2076180480 * i3) + ((-877658112) * i6) + (214302720 * i13) + (i14 * i14 * 2075787264)) {
            case 1:
                return write(objArr);
            case 2:
                return read(objArr);
            case 3:
                return RemoteActionCompatParcelizer(objArr);
            case 4:
                return IconCompatParcelizer(objArr);
            case 5:
                return RatingCompat(objArr);
            case 6:
                MainActivity mainActivity = (MainActivity) objArr[0];
                int i15 = 2 % 2;
                supportsColorMatrixQuery lifecycle = mainActivity.getLifecycle();
                TextMotionLinearity textMotionLinearity = (TextMotionLinearity) mainActivity.MediaSessionCompatResultReceiverWrapper;
                textMotionLinearity.getClass();
                lifecycle.IconCompatParcelizer(new BleScanningLifecycleObserverImpl(mainActivity, textMotionLinearity.MediaSessionCompatQueueItem, textMotionLinearity.MediaMetadataCompat, textMotionLinearity.RatingCompat, textMotionLinearity.read, textMotionLinearity.MediaSessionCompatResultReceiverWrapper, textMotionLinearity.write, textMotionLinearity.MediaBrowserCompatMediaItem, textMotionLinearity.IconCompatParcelizer, textMotionLinearity.MediaDescriptionCompat, textMotionLinearity.RemoteActionCompatParcelizer, textMotionLinearity.serializer));
                int i16 = addOnMultiWindowModeChangedListener + 51;
                onBackPressedInput_delegatelambda0 = i16 % Fields.SpotShadowColor;
                int i17 = i16 % 2;
                return null;
            case 7:
                return MediaDescriptionCompat(objArr);
            case 8:
                return MediaSessionCompatQueueItem(objArr);
            default:
                return serializer(objArr);
        }
    }

    private /* synthetic */ void ComponentActivity() {
        int i = 2 % 2;
        int i2 = addOnMultiWindowModeChangedListener + 21;
        onBackPressedInput_delegatelambda0 = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        super.onStart();
        int i4 = onBackPressedInput_delegatelambda0 + 17;
        addOnMultiWindowModeChangedListener = i4 % Fields.SpotShadowColor;
        int i5 = i4 % 2;
    }

    public static /* synthetic */ void IconCompatParcelizer(MainActivity mainActivity) {
        int i = 2 % 2;
        int i2 = onBackPressedInput_delegatelambda0 + 39;
        addOnMultiWindowModeChangedListener = i2 % Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            mainActivity.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus();
        } else {
            mainActivity.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus();
            int i3 = 4 / 0;
        }
    }

    public static /* synthetic */ void IconCompatParcelizer(MainActivity mainActivity, Boolean bool) {
        int i = 2 % 2;
        int i2 = onBackPressedInput_delegatelambda0 + 37;
        addOnMultiWindowModeChangedListener = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        RemoteActionCompatParcelizer(ContentScaleCompanionFillWidth1.write(), ContentScaleCompanionFillWidth1.write(), ContentScaleCompanionFillWidth1.write(), -388594738, 388594739, ContentScaleCompanionFillWidth1.write(), new Object[]{mainActivity, bool});
        int i4 = onBackPressedInput_delegatelambda0 + 71;
        addOnMultiWindowModeChangedListener = i4 % Fields.SpotShadowColor;
        if (i4 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static /* synthetic */ Object MediaSessionCompatQueueItem(Object[] objArr) {
        MainActivity mainActivity = (MainActivity) objArr[0];
        String str = (String) objArr[1];
        int i = 2 % 2;
        int i2 = addOnMultiWindowModeChangedListener + 53;
        onBackPressedInput_delegatelambda0 = i2 % Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            mainActivity.serializer(str);
            return null;
        }
        mainActivity.serializer(str);
        int i3 = 96 / 0;
        return null;
    }

    public static /* synthetic */ void RemoteActionCompatParcelizer(MainActivity mainActivity) {
        int i = 2 % 2;
        int i2 = onBackPressedInput_delegatelambda0 + 103;
        addOnMultiWindowModeChangedListener = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        mainActivity.ComponentActivity();
        int i4 = onBackPressedInput_delegatelambda0 + 91;
        addOnMultiWindowModeChangedListener = i4 % Fields.SpotShadowColor;
        if (i4 % 2 == 0) {
            int i5 = 70 / 0;
        }
    }

    public static /* synthetic */ void RemoteActionCompatParcelizer(MainActivity mainActivity, createFromParcel createfromparcel) {
        int i = 2 % 2;
        int i2 = addOnMultiWindowModeChangedListener + 55;
        onBackPressedInput_delegatelambda0 = i2 % Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            RemoteActionCompatParcelizer(ContentScaleCompanionFillWidth1.write(), ContentScaleCompanionFillWidth1.write(), ContentScaleCompanionFillWidth1.write(), -1032826155, 1032826157, ContentScaleCompanionFillWidth1.write(), new Object[]{mainActivity, createfromparcel});
            return;
        }
        RemoteActionCompatParcelizer(ContentScaleCompanionFillWidth1.write(), ContentScaleCompanionFillWidth1.write(), ContentScaleCompanionFillWidth1.write(), -1032826155, 1032826157, ContentScaleCompanionFillWidth1.write(), new Object[]{mainActivity, createfromparcel});
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private /* synthetic */ void r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus() {
        int i = 2 % 2;
        int i2 = addOnMultiWindowModeChangedListener + 95;
        onBackPressedInput_delegatelambda0 = i2 % Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            r8lambda54BeH8ZsBru0CXI2CCSP2syNys();
            int i3 = 39 / 0;
        } else {
            r8lambda54BeH8ZsBru0CXI2CCSP2syNys();
        }
        int i4 = addOnMultiWindowModeChangedListener + 41;
        onBackPressedInput_delegatelambda0 = i4 % Fields.SpotShadowColor;
        int i5 = i4 % 2;
    }

    private static /* synthetic */ Object read(Object[] objArr) {
        MainActivity mainActivity = (MainActivity) objArr[0];
        int i = 2 % 2;
        int i2 = addOnMultiWindowModeChangedListener + 29;
        onBackPressedInput_delegatelambda0 = i2 % Fields.SpotShadowColor;
        Object obj = null;
        if (i2 % 2 != 0) {
            mainActivity._init_lambda4();
            obj.hashCode();
            throw null;
        }
        mainActivity._init_lambda4();
        int i3 = onBackPressedInput_delegatelambda0 + 125;
        addOnMultiWindowModeChangedListener = i3 % Fields.SpotShadowColor;
        if (i3 % 2 != 0) {
            return null;
        }
        throw null;
    }

    public static /* synthetic */ void serializer(MainActivity mainActivity, int i) {
        int i2 = 2 % 2;
        int i3 = addOnMultiWindowModeChangedListener + 83;
        onBackPressedInput_delegatelambda0 = i3 % Fields.SpotShadowColor;
        int i4 = i3 % 2;
        mainActivity.serializer(i);
        int i5 = addOnMultiWindowModeChangedListener + 113;
        onBackPressedInput_delegatelambda0 = i5 % Fields.SpotShadowColor;
        if (i5 % 2 != 0) {
            int i6 = 4 / 0;
        }
    }

    public static /* synthetic */ void write(MainActivity mainActivity) {
        int i = 2 % 2;
        int i2 = onBackPressedInput_delegatelambda0 + 55;
        addOnMultiWindowModeChangedListener = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        mainActivity.ResultReceiver();
        int i4 = onBackPressedInput_delegatelambda0 + 79;
        addOnMultiWindowModeChangedListener = i4 % Fields.SpotShadowColor;
        int i5 = i4 % 2;
    }

    @Override // o.scheduleDebounceCallback
    public void IconCompatParcelizer(String str) {
        int i = 2 % 2;
        int i2 = onBackPressedInput_delegatelambda0 + 61;
        addOnMultiWindowModeChangedListener = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        RemoteActionCompatParcelizer(str);
        int i4 = onBackPressedInput_delegatelambda0 + 87;
        addOnMultiWindowModeChangedListener = i4 % Fields.SpotShadowColor;
        if (i4 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // o.scheduleDebounceCallback
    public void MediaMetadataCompat() {
        int i = 2 % 2;
        int i2 = addOnMultiWindowModeChangedListener + 37;
        onBackPressedInput_delegatelambda0 = i2 % Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            read();
            int i3 = 32 / 0;
        } else {
            read();
        }
        int i4 = addOnMultiWindowModeChangedListener + 21;
        onBackPressedInput_delegatelambda0 = i4 % Fields.SpotShadowColor;
        int i5 = i4 % 2;
    }

    @Override // com.foodora.courier.base.presentation.BaseInjectingMvvmActivity, com.foodora.courier.base.presentation.MvvmActivity, com.foodora.courier.base.presentation.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onPause() {
        int i = 2 % 2;
        int i2 = addOnMultiWindowModeChangedListener + 75;
        onBackPressedInput_delegatelambda0 = i2 % Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            super.onPause();
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        super.onPause();
        int i3 = addOnMultiWindowModeChangedListener + 5;
        onBackPressedInput_delegatelambda0 = i3 % Fields.SpotShadowColor;
        if (i3 % 2 != 0) {
            int i4 = 22 / 0;
        }
    }

    @Override // o.scheduleDebounceCallback
    public void read(String str) {
        int i = 2 % 2;
        int i2 = addOnMultiWindowModeChangedListener + 95;
        onBackPressedInput_delegatelambda0 = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        RemoteActionCompatParcelizer(str);
        int i4 = addOnMultiWindowModeChangedListener + 61;
        onBackPressedInput_delegatelambda0 = i4 % Fields.SpotShadowColor;
        int i5 = i4 % 2;
    }

    @Override // o.scheduleDebounceCallback
    public void write(int i, int i2) {
        int i3 = 2 % 2;
        int i4 = onBackPressedInput_delegatelambda0 + 9;
        addOnMultiWindowModeChangedListener = i4 % Fields.SpotShadowColor;
        if (i4 % 2 != 0) {
            RemoteActionCompatParcelizer(i, i2);
        } else {
            RemoteActionCompatParcelizer(i, i2);
            int i5 = 10 / 0;
        }
    }

    public static /* synthetic */ Void IconCompatParcelizer(setOnApplyWindowInsetsListener setonapplywindowinsetslistener) {
        int i = 2 % 2;
        int i2 = addOnMultiWindowModeChangedListener + 83;
        onBackPressedInput_delegatelambda0 = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        Void r9 = (Void) RemoteActionCompatParcelizer(ContentScaleCompanionFillWidth1.write(), ContentScaleCompanionFillWidth1.write(), ContentScaleCompanionFillWidth1.write(), -1237701566, 1237701570, ContentScaleCompanionFillWidth1.write(), new Object[]{setonapplywindowinsetslistener});
        int i4 = addOnMultiWindowModeChangedListener + 113;
        onBackPressedInput_delegatelambda0 = i4 % Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return r9;
    }

    private /* synthetic */ View MediaSessionCompatToken() {
        int i = 2 % 2;
        int i2 = addOnMultiWindowModeChangedListener + 101;
        onBackPressedInput_delegatelambda0 = i2 % Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            return this.onBackPressedDispatcher_delegatelambda0.IconCompatParcelizer;
        }
        int i3 = 85 / 0;
        return this.onBackPressedDispatcher_delegatelambda0.IconCompatParcelizer;
    }

    private static /* synthetic */ Object RatingCompat(Object[] objArr) {
        MainActivity mainActivity = (MainActivity) objArr[0];
        getBitmapui_graphics getbitmapui_graphics = (getBitmapui_graphics) objArr[1];
        int i = 2 % 2;
        int i2 = onBackPressedInput_delegatelambda0 + 111;
        addOnMultiWindowModeChangedListener = i2 % Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            return (emitcomroadrunnerdeliveryanalyticsStateV3AnalyticsProviderImplspecialinlinedmap12) RemoteActionCompatParcelizer(ContentScaleCompanionFillWidth1.write(), ContentScaleCompanionFillWidth1.write(), ContentScaleCompanionFillWidth1.write(), 1772721173, -1772721166, ContentScaleCompanionFillWidth1.write(), new Object[]{mainActivity, getbitmapui_graphics});
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ createFromParcel RemoteActionCompatParcelizer(MainActivity mainActivity, registerActivityLifecycleCallbacks registeractivitylifecyclecallbacks) {
        int i = 2 % 2;
        int i2 = addOnMultiWindowModeChangedListener + 91;
        onBackPressedInput_delegatelambda0 = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        createFromParcel createfromparcelSerializer = mainActivity.serializer(registeractivitylifecyclecallbacks);
        int i4 = addOnMultiWindowModeChangedListener + 99;
        onBackPressedInput_delegatelambda0 = i4 % Fields.SpotShadowColor;
        if (i4 % 2 == 0) {
            return createfromparcelSerializer;
        }
        throw null;
    }

    public static /* synthetic */ View serializer(MainActivity mainActivity) {
        int i = 2 % 2;
        int i2 = addOnMultiWindowModeChangedListener + 101;
        onBackPressedInput_delegatelambda0 = i2 % Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            return mainActivity.MediaSessionCompatToken();
        }
        int i3 = 3 / 0;
        return mainActivity.MediaSessionCompatToken();
    }

    public static /* synthetic */ createFromParcel serializer(setOnApplyWindowInsetsListener setonapplywindowinsetslistener, Throwable th) {
        int i = 2 % 2;
        int i2 = onBackPressedInput_delegatelambda0 + 59;
        addOnMultiWindowModeChangedListener = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        createFromParcel createfromparcelWrite = write(setonapplywindowinsetslistener, th);
        int i4 = addOnMultiWindowModeChangedListener + 3;
        onBackPressedInput_delegatelambda0 = i4 % Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return createfromparcelWrite;
    }

    private void write(Bundle bundle) {
        int i = 2 % 2;
        if (bundle == null) {
            int i2 = addOnMultiWindowModeChangedListener + 3;
            onBackPressedInput_delegatelambda0 = i2 % Fields.SpotShadowColor;
            int i3 = i2 % 2;
            MediaDescriptionCompat();
        }
        int i4 = onBackPressedInput_delegatelambda0 + 77;
        addOnMultiWindowModeChangedListener = i4 % Fields.SpotShadowColor;
        if (i4 % 2 == 0) {
            throw null;
        }
    }

    public AppCompatActivity RatingCompat() {
        int i = 2 % 2;
        int i2 = onBackPressedInput_delegatelambda0 + 91;
        int i3 = i2 % Fields.SpotShadowColor;
        addOnMultiWindowModeChangedListener = i3;
        Object obj = null;
        if (i2 % 2 == 0) {
            obj.hashCode();
            throw null;
        }
        int i4 = i3 + 111;
        onBackPressedInput_delegatelambda0 = i4 % Fields.SpotShadowColor;
        if (i4 % 2 == 0) {
            return this;
        }
        obj.hashCode();
        throw null;
    }

    public void serializer(Throwable th) {
        int i = 2 % 2;
        int i2 = addOnMultiWindowModeChangedListener + 31;
        onBackPressedInput_delegatelambda0 = i2 % Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            this.r8lambdaXj9c8VIP9DfEvaTmZt0ejAuC4a4.IconCompatParcelizer(th, this);
        } else {
            this.r8lambdaXj9c8VIP9DfEvaTmZt0ejAuC4a4.IconCompatParcelizer(th, this);
            throw null;
        }
    }

    private /* synthetic */ void serializer(String str) {
        int i = 2 % 2;
        int i2 = addOnMultiWindowModeChangedListener + 11;
        onBackPressedInput_delegatelambda0 = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        Object obj = null;
        this.onBackPressedDispatcher_delegatelambda010.write(str, null);
        int i4 = addOnMultiWindowModeChangedListener + 87;
        onBackPressedInput_delegatelambda0 = i4 % Fields.SpotShadowColor;
        if (i4 % 2 == 0) {
            return;
        }
        obj.hashCode();
        throw null;
    }

    public void RemoteActionCompatParcelizer(String str) {
        int i = 2 % 2;
        int i2 = onBackPressedInput_delegatelambda0 + 51;
        addOnMultiWindowModeChangedListener = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        Toast.makeText(this, str, 1).show();
        int i4 = onBackPressedInput_delegatelambda0 + 27;
        addOnMultiWindowModeChangedListener = i4 % Fields.SpotShadowColor;
        if (i4 % 2 == 0) {
            throw null;
        }
    }

    private static /* synthetic */ Object RemoteActionCompatParcelizer(Object[] objArr) {
        MainActivity mainActivity = (MainActivity) objArr[0];
        int i = 2 % 2;
        int i2 = addOnMultiWindowModeChangedListener + 31;
        onBackPressedInput_delegatelambda0 = i2 % Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            mainActivity.getLifecycle().IconCompatParcelizer(mainActivity.MediaBrowserCompatMediaItem);
            int i3 = 63 / 0;
        } else {
            mainActivity.getLifecycle().IconCompatParcelizer(mainActivity.MediaBrowserCompatMediaItem);
        }
        int i4 = onBackPressedInput_delegatelambda0 + 17;
        addOnMultiWindowModeChangedListener = i4 % Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return null;
    }

    private void r8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss() {
        int i = 2 % 2;
        int i2 = addOnMultiWindowModeChangedListener + 119;
        onBackPressedInput_delegatelambda0 = i2 % Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            getLifecycle().IconCompatParcelizer(this.ComponentActivity);
        } else {
            getLifecycle().IconCompatParcelizer(this.ComponentActivity);
            throw null;
        }
    }

    private void r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM() {
        int i = 2 % 2;
        int i2 = onBackPressedInput_delegatelambda0 + 61;
        addOnMultiWindowModeChangedListener = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        getLifecycle().IconCompatParcelizer(this.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY);
        int i4 = onBackPressedInput_delegatelambda0 + 65;
        addOnMultiWindowModeChangedListener = i4 % Fields.SpotShadowColor;
        if (i4 % 2 == 0) {
            int i5 = 12 / 0;
        }
    }

    private void r8lambdag6d1IyBXWIL5aeSAzXsZMVuYCQs() {
        int i = 2 % 2;
        int i2 = addOnMultiWindowModeChangedListener + 27;
        onBackPressedInput_delegatelambda0 = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        getLifecycle().IconCompatParcelizer(this.r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28);
        int i4 = onBackPressedInput_delegatelambda0 + 101;
        addOnMultiWindowModeChangedListener = i4 % Fields.SpotShadowColor;
        if (i4 % 2 == 0) {
            int i5 = 2 / 0;
        }
    }

    private void r8lambdawJ5MHcSJed_CjC7r4OWD0UxyJsQ() {
        int i = 2 % 2;
        int i2 = onBackPressedInput_delegatelambda0 + 85;
        addOnMultiWindowModeChangedListener = i2 % Fields.SpotShadowColor;
        Object obj = null;
        if (i2 % 2 == 0) {
            ProcessLifecycleOwner.IconCompatParcelizer.RatingCompat.IconCompatParcelizer(this.accessensureViewModelStore);
            obj.hashCode();
            throw null;
        }
        ProcessLifecycleOwner.IconCompatParcelizer.RatingCompat.IconCompatParcelizer(this.accessensureViewModelStore);
        int i3 = addOnMultiWindowModeChangedListener + 33;
        onBackPressedInput_delegatelambda0 = i3 % Fields.SpotShadowColor;
        if (i3 % 2 != 0) {
            throw null;
        }
    }

    private void _init_lambda4() {
        int i = 2 % 2;
        sendBroadcast(new Intent("CUSTOMER_CHAT_UNREAD_MESSAGE_COUNT_CHANGED"));
        int i2 = addOnMultiWindowModeChangedListener + 103;
        onBackPressedInput_delegatelambda0 = i2 % Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            int i3 = 5 / 0;
        }
    }

    @Override // com.foodora.courier.base.presentation.MvvmActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onStop() {
        int i = 2 % 2;
        int i2 = addOnMultiWindowModeChangedListener + 63;
        onBackPressedInput_delegatelambda0 = i2 % Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            super.onStop();
            this.addObserverForBackInvokerlambda0.RemoteActionCompatParcelizer.read();
            int i3 = 9 / 0;
        } else {
            super.onStop();
            this.addObserverForBackInvokerlambda0.RemoteActionCompatParcelizer.read();
        }
        int i4 = onBackPressedInput_delegatelambda0 + 47;
        addOnMultiWindowModeChangedListener = i4 % Fields.SpotShadowColor;
        if (i4 % 2 == 0) {
            throw null;
        }
    }

    private void r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28() {
        int i = 2 % 2;
        getOnBackPressedDispatcher().read(new accessgetYcp(this), this);
        int i2 = addOnMultiWindowModeChangedListener + 3;
        onBackPressedInput_delegatelambda0 = i2 % Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            throw null;
        }
    }

    private void r8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8() {
        int i = 2 % 2;
        int i2 = onBackPressedInput_delegatelambda0 + 93;
        addOnMultiWindowModeChangedListener = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        getLifecycle().IconCompatParcelizer(((CallTracer) this.ResultReceiver).serializer(this));
        int i4 = onBackPressedInput_delegatelambda0 + 43;
        addOnMultiWindowModeChangedListener = i4 % Fields.SpotShadowColor;
        int i5 = i4 % 2;
    }

    private void serializer(int i) {
        int i2 = 2 % 2;
        int i3 = onBackPressedInput_delegatelambda0 + 59;
        addOnMultiWindowModeChangedListener = i3 % Fields.SpotShadowColor;
        int i4 = i3 % 2;
        ((HomeHelpCenterLifecycleObserverImpl) this.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM).RemoteActionCompatParcelizer.serializer.IconCompatParcelizer(Integer.valueOf(i));
        int i5 = addOnMultiWindowModeChangedListener + 15;
        onBackPressedInput_delegatelambda0 = i5 % Fields.SpotShadowColor;
        int i6 = i5 % 2;
    }

    private void _init_lambda3() {
        int i = 2 % 2;
        int i2 = addOnMultiWindowModeChangedListener + 117;
        onBackPressedInput_delegatelambda0 = i2 % Fields.SpotShadowColor;
        Object obj = null;
        if (i2 % 2 != 0) {
            this.addContentView = (setMinHeight) ((CreateHomeScope) this.getSavedStateRegistryControllerannotations).read;
            getLifecycle().IconCompatParcelizer(this.addContentView);
            obj.hashCode();
            throw null;
        }
        this.addContentView = (setMinHeight) ((CreateHomeScope) this.getSavedStateRegistryControllerannotations).read;
        getLifecycle().IconCompatParcelizer(this.addContentView);
        int i3 = addOnMultiWindowModeChangedListener + 23;
        onBackPressedInput_delegatelambda0 = i3 % Fields.SpotShadowColor;
        if (i3 % 2 == 0) {
            return;
        }
        obj.hashCode();
        throw null;
    }

    private static /* synthetic */ Object write(Object[] objArr) {
        MainActivity mainActivity = (MainActivity) objArr[0];
        int i = 2 % 2;
        if (((Boolean) objArr[1]).booleanValue()) {
            int i2 = onBackPressedInput_delegatelambda0 + 93;
            addOnMultiWindowModeChangedListener = i2 % Fields.SpotShadowColor;
            int i3 = i2 % 2;
            mainActivity.addObserverForBackInvokerlambda0.write(setOnSessionTrackingFailedListener.PUSH_NOTIFICATION, null, null, foregroundTimerFiredI.DELIVERY_PAYMENT_DONE.getValue());
            int i4 = onBackPressedInput_delegatelambda0 + 63;
            addOnMultiWindowModeChangedListener = i4 % Fields.SpotShadowColor;
            int i5 = i4 % 2;
        }
        return null;
    }

    public void read(setOnSessionTrackingFailedListener setonsessiontrackingfailedlistener, setOnApplyWindowInsetsListener setonapplywindowinsetslistener) {
        int i = 2 % 2;
        this.addObserverForBackInvokerlambda0.write(setonsessiontrackingfailedlistener, new BrazeUser$$ExternalSyntheticLambda28(12, setonapplywindowinsetslistener), new f2$$ExternalSyntheticLambda4(20, setonapplywindowinsetslistener), null);
        int i2 = onBackPressedInput_delegatelambda0 + 55;
        addOnMultiWindowModeChangedListener = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
    }

    private createFromParcel serializer(registerActivityLifecycleCallbacks registeractivitylifecyclecallbacks) {
        int i = 2 % 2;
        int i2 = addOnMultiWindowModeChangedListener + 73;
        onBackPressedInput_delegatelambda0 = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        SaveHeatmapUrlImpl saveHeatmapUrlImpl = (SaveHeatmapUrlImpl) this.getOnBackPressedInput;
        saveHeatmapUrlImpl.getClass();
        ((SystemLifecycleSystemLifecycleCache) registeractivitylifecyclecallbacks).getClass();
        getGestureThresholdActivate5zf0vsI.read((getGestureThresholdActivate5zf0vsI) saveHeatmapUrlImpl.serializer);
        createFromParcel createfromparcel = createFromParcel.INSTANCE;
        int i4 = addOnMultiWindowModeChangedListener + 93;
        onBackPressedInput_delegatelambda0 = i4 % Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return createfromparcel;
    }

    public void read() {
        int i = 2 % 2;
        int i2 = addOnMultiWindowModeChangedListener + 73;
        onBackPressedInput_delegatelambda0 = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        getSTYLEABLE_VECTOR_DRAWABLE_VIEWPORT_HEIGHT getstyleable_vector_drawable_viewport_height = (getSTYLEABLE_VECTOR_DRAWABLE_VIEWPORT_HEIGHT) this.MediaSessionCompatToken;
        getstyleable_vector_drawable_viewport_height.getClass();
        try {
            removeOnContextAvailableListener removeoncontextavailablelistener = getstyleable_vector_drawable_viewport_height.serializer;
            if (removeoncontextavailablelistener != null) {
                removeoncontextavailablelistener.dismiss();
                int i4 = addOnMultiWindowModeChangedListener + 35;
                onBackPressedInput_delegatelambda0 = i4 % Fields.SpotShadowColor;
                int i5 = i4 % 2;
            }
        } catch (Exception unused) {
        } finally {
            getstyleable_vector_drawable_viewport_height.serializer = null;
        }
    }

    private void MediaDescriptionCompat() {
        int i = 2 % 2;
        div7Ah8Wj8 supportFragmentManager = getSupportFragmentManager();
        supportFragmentManager.getClass();
        isInfiniteannotations isinfiniteannotations = new isInfiniteannotations(supportFragmentManager);
        isinfiniteannotations.IconCompatParcelizer(R.id.homeFragmentContainer, new HomeFragment(), null);
        isinfiniteannotations.read();
        int i2 = addOnMultiWindowModeChangedListener + 113;
        onBackPressedInput_delegatelambda0 = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
    }

    public void write(String str) {
        int i = 2 % 2;
        startActivity(new Intent("android.intent.action.DIAL", Uri.parse("tel:" + str)));
        int i2 = onBackPressedInput_delegatelambda0 + 109;
        addOnMultiWindowModeChangedListener = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
    }

    /* JADX WARN: Code duplicated, block: B:9:0x004a A[PHI: r2 r5
  0x004a: PHI (r2v6 o.r8lambda7Q1QCWXCUHrhcsGraulDg_ksbGU) = (r2v5 o.r8lambda7Q1QCWXCUHrhcsGraulDg_ksbGU), (r2v9 o.r8lambda7Q1QCWXCUHrhcsGraulDg_ksbGU) binds: [B:8:0x0048, B:5:0x002e] A[DONT_GENERATE, DONT_INLINE]
  0x004a: PHI (r5v8 o.markFragmentsCreated) = (r5v7 o.markFragmentsCreated), (r5v14 o.markFragmentsCreated) binds: [B:8:0x0048, B:5:0x002e] A[DONT_GENERATE, DONT_INLINE]] */
    private static /* synthetic */ Object IconCompatParcelizer(Object[] objArr) {
        markFragmentsCreated markfragmentscreated;
        r8lambda7Q1QCWXCUHrhcsGraulDg_ksbGU r8lambda7q1qcwxcuhrhcsgrauldg_ksbgu;
        setOnApplyWindowInsetsListener setonapplywindowinsetslistener = (setOnApplyWindowInsetsListener) objArr[0];
        int i = 2 % 2;
        int i2 = addOnMultiWindowModeChangedListener + 25;
        onBackPressedInput_delegatelambda0 = i2 % Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            markfragmentscreated = (markFragmentsCreated) ((HomeFragment) setonapplywindowinsetslistener).RemoteActionCompatParcelizer().serializer.MediaSessionCompatResultReceiverWrapper();
            markfragmentscreated.read.IconCompatParcelizer(Boolean.FALSE);
            r8lambda7q1qcwxcuhrhcsgrauldg_ksbgu = markfragmentscreated.PlaybackStateCompatCustomAction;
            int i3 = 95 / 0;
            if (r8lambda7q1qcwxcuhrhcsgrauldg_ksbgu != null) {
                int i4 = onBackPressedInput_delegatelambda0 + 25;
                addOnMultiWindowModeChangedListener = i4 % Fields.SpotShadowColor;
                int i5 = i4 % 2;
                r8lambda7q1qcwxcuhrhcsgrauldg_ksbgu.write((CancellationException) null);
                int i6 = addOnMultiWindowModeChangedListener + 7;
                onBackPressedInput_delegatelambda0 = i6 % Fields.SpotShadowColor;
                int i7 = i6 % 2;
            }
        } else {
            markfragmentscreated = (markFragmentsCreated) ((HomeFragment) setonapplywindowinsetslistener).RemoteActionCompatParcelizer().serializer.MediaSessionCompatResultReceiverWrapper();
            markfragmentscreated.read.IconCompatParcelizer(Boolean.FALSE);
            r8lambda7q1qcwxcuhrhcsgrauldg_ksbgu = markfragmentscreated.PlaybackStateCompatCustomAction;
            if (r8lambda7q1qcwxcuhrhcsgrauldg_ksbgu != null) {
                int i8 = onBackPressedInput_delegatelambda0 + 25;
                addOnMultiWindowModeChangedListener = i8 % Fields.SpotShadowColor;
                int i9 = i8 % 2;
                r8lambda7q1qcwxcuhrhcsgrauldg_ksbgu.write((CancellationException) null);
                int i10 = addOnMultiWindowModeChangedListener + 7;
                onBackPressedInput_delegatelambda0 = i10 % Fields.SpotShadowColor;
                int i11 = i10 % 2;
            }
        }
        markfragmentscreated.PlaybackStateCompatCustomAction = null;
        return null;
    }

    private void r8lambda7IJBVrN0sHyidCAZufWEJFc7yY() {
        int i = 2 % 2;
        getLifecycle().IconCompatParcelizer(new AppReviewLifecycleObserverImpl((SemanticsPropertiesContentDescription1) ((performImeActiondefault) this.MediaSessionCompatQueueItem).serializer.RemoteActionCompatParcelizer.write(), new getActionViewIntentlambda0(), this));
        int i2 = addOnMultiWindowModeChangedListener + 85;
        onBackPressedInput_delegatelambda0 = i2 % Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            int i3 = 35 / 0;
        }
    }

    private void _init_lambda1() {
        int i = 2 % 2;
        supportsColorMatrixQuery lifecycle = getLifecycle();
        CallTracer callTracer = (CallTracer) this.onBackPressedDispatcher_delegatelambda00;
        callTracer.getClass();
        VerificationStatusRepository verificationStatusRepository = (VerificationStatusRepository) callTracer.RemoteActionCompatParcelizer;
        ImageHeaderParserImageType imageHeaderParserImageType = (ImageHeaderParserImageType) callTracer.write;
        lifecycle.IconCompatParcelizer(new VerificationStatusLifecycleObserverImpl(verificationStatusRepository, (Clock) callTracer.IconCompatParcelizer, (transferSessionPackageI) callTracer.serializer, imageHeaderParserImageType, this));
        int i2 = onBackPressedInput_delegatelambda0 + 65;
        addOnMultiWindowModeChangedListener = i2 % Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public getPrimaryDirectionalMotionAxisnZO2Niw write() {
        int i = 2 % 2;
        getSTYLEABLE_VECTOR_DRAWABLE_GROUP_ROTATION getstyleable_vector_drawable_group_rotation = ((CourierApplication) getApplication()).read();
        getSTYLEABLE_VECTOR_DRAWABLE_PATH_FILL_ALPHA getstyleable_vector_drawable_path_fill_alpha = new getSTYLEABLE_VECTOR_DRAWABLE_PATH_FILL_ALPHA(getstyleable_vector_drawable_group_rotation.r8lambdavCwjfXDiSGcirCy4I008VOiJ_lw, new CardView$1(this, 22, this), new CardView$1(getSupportFragmentManager(), new ImageLoader$Builder$$ExternalSyntheticLambda1(8, this)));
        int i2 = onBackPressedInput_delegatelambda0 + 1;
        addOnMultiWindowModeChangedListener = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        return getstyleable_vector_drawable_path_fill_alpha;
    }

    @Override // com.foodora.courier.base.presentation.BaseInjectingMvvmActivity
    public /* synthetic */ getPrimaryDirectionalMotionAxisnZO2Niw IconCompatParcelizer() {
        getPrimaryDirectionalMotionAxisnZO2Niw getprimarydirectionalmotionaxisnzo2niwWrite;
        int i = 2 % 2;
        int i2 = addOnMultiWindowModeChangedListener + 29;
        onBackPressedInput_delegatelambda0 = i2 % Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            getprimarydirectionalmotionaxisnzo2niwWrite = write();
            int i3 = 43 / 0;
        } else {
            getprimarydirectionalmotionaxisnzo2niwWrite = write();
        }
        int i4 = addOnMultiWindowModeChangedListener + 37;
        onBackPressedInput_delegatelambda0 = i4 % Fields.SpotShadowColor;
        if (i4 % 2 == 0) {
            return getprimarydirectionalmotionaxisnzo2niwWrite;
        }
        throw null;
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        int i = 2 % 2;
        int i2 = onBackPressedInput_delegatelambda0 + 5;
        addOnMultiWindowModeChangedListener = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        Timber.RemoteActionCompatParcelizer.IconCompatParcelizer("Main Activity destroyed", new Object[0]);
        ProcessLifecycleOwner.IconCompatParcelizer.RatingCompat.read(this.accessensureViewModelStore);
        super.onDestroy();
        MainPresenter mainPresenter = this.addObserverForBackInvokerlambda0;
        mainPresenter.RatingCompat.read();
        r8lambda7Q1QCWXCUHrhcsGraulDg_ksbGU r8lambda7q1qcwxcuhrhcsgrauldg_ksbgu = mainPresenter.MediaSessionCompatToken.serializer.MediaMetadataCompat;
        if (r8lambda7q1qcwxcuhrhcsgrauldg_ksbgu != null) {
            int i4 = addOnMultiWindowModeChangedListener + 103;
            onBackPressedInput_delegatelambda0 = i4 % Fields.SpotShadowColor;
            int i5 = i4 % 2;
            r8lambda7q1qcwxcuhrhcsgrauldg_ksbgu.write((CancellationException) null);
            int i6 = addOnMultiWindowModeChangedListener + 33;
            onBackPressedInput_delegatelambda0 = i6 % Fields.SpotShadowColor;
            int i7 = i6 % 2;
        }
    }

    private void r8lambdayPQlaAoRiYRJ3IY_TqzUUTrVH0() {
        int i = 2 % 2;
        int i2 = addOnMultiWindowModeChangedListener + 105;
        onBackPressedInput_delegatelambda0 = i2 % Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        if (this.r8lambdawJ5MHcSJed_CjC7r4OWD0UxyJsQ == null) {
            r8lambda6p7U4OWYA8jlHo6PgwNWEvZb01M r8lambda6p7u4owya8jlho6pgwnwevzb01m = this.r8lambdavCwjfXDiSGcirCy4I008VOiJ_lw;
            r8lambda97B6Pg2rSmZnc05L6A5yZDJRg r8lambda97b6pg2rsmznc05l6a5yzdjrg = this._init_lambda1;
            AnnotationRangeListSaverlambda1 annotationRangeListSaverlambda1 = ((AnnotationRangeSaverlambda0) r8lambda6p7u4owya8jlho6pgwnwevzb01m).read;
            this.r8lambdawJ5MHcSJed_CjC7r4OWD0UxyJsQ = new BaselineShiftSaverlambda0((PlatformStringDelegate) annotationRangeListSaverlambda1.RemoteActionCompatParcelizer.write(), (r8lambda0tFkXN0c4UQsJxVxyejUo1BomY) annotationRangeListSaverlambda1.write.write(), r8lambda97b6pg2rsmznc05l6a5yzdjrg);
            int i3 = onBackPressedInput_delegatelambda0 + 101;
            addOnMultiWindowModeChangedListener = i3 % Fields.SpotShadowColor;
            int i4 = i3 % 2;
        }
        getLifecycle().IconCompatParcelizer(this.r8lambdawJ5MHcSJed_CjC7r4OWD0UxyJsQ);
    }

    private void PlaybackStateCompatCustomAction() {
        int i = 2 % 2;
        setLayoutTransition setlayouttransition = this.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg;
        OnBackPressedDispatcher$OnBackPressedEventInput$$ExternalSyntheticLambda0 onBackPressedDispatcher$OnBackPressedEventInput$$ExternalSyntheticLambda0 = new OnBackPressedDispatcher$OnBackPressedEventInput$$ExternalSyntheticLambda0(15, this);
        AnnotationRangeListSaverlambda1 annotationRangeListSaverlambda1 = ((getEnterAnim) setlayouttransition).IconCompatParcelizer;
        this.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM = new HomeHelpCenterLifecycleObserverImpl((getFocusedView) annotationRangeListSaverlambda1.RemoteActionCompatParcelizer.write(), (getEnterTransitionCallback) annotationRangeListSaverlambda1.write.write(), onBackPressedDispatcher$OnBackPressedEventInput$$ExternalSyntheticLambda0);
        getLifecycle().IconCompatParcelizer(this.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM);
        int i2 = onBackPressedInput_delegatelambda0 + 37;
        addOnMultiWindowModeChangedListener = i2 % Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            int i3 = 59 / 0;
        }
    }

    private static /* synthetic */ Object MediaDescriptionCompat(Object[] objArr) {
        MainActivity mainActivity = (MainActivity) objArr[0];
        getBitmapui_graphics getbitmapui_graphics = (getBitmapui_graphics) objArr[1];
        int i = 2 % 2;
        emitcomroadrunnerdeliverycommondataChatAvailabilityManagerobserveIfShouldShowChatListinlinedmap12 emitcomroadrunnerdeliverycommondatachatavailabilitymanagerobserveifshouldshowchatlistinlinedmap12 = (emitcomroadrunnerdeliverycommondataChatAvailabilityManagerobserveIfShouldShowChatListinlinedmap12) mainActivity.r8lambdag6d1IyBXWIL5aeSAzXsZMVuYCQs;
        emitcomroadrunnerdeliverycommondatachatavailabilitymanagerobserveifshouldshowchatlistinlinedmap12.getClass();
        getbitmapui_graphics.getClass();
        CombinedScopeView combinedScopeView = emitcomroadrunnerdeliverycommondatachatavailabilitymanagerobserveifshouldshowchatlistinlinedmap12.RemoteActionCompatParcelizer;
        Object objWrite = ((r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ) combinedScopeView.RemoteActionCompatParcelizer).write();
        objWrite.getClass();
        subscribeToBannersErrorslambda0 subscribetobannerserrorslambda0 = (subscribeToBannersErrorslambda0) ((postAnimationRunner) combinedScopeView.read).write();
        Object objWrite2 = ((r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ) combinedScopeView.write).write();
        objWrite2.getClass();
        emitcomroadrunnerdeliveryanalyticsStateV3AnalyticsProviderImplspecialinlinedmap12 emitcomroadrunnerdeliveryanalyticsstatev3analyticsproviderimplspecialinlinedmap12 = new emitcomroadrunnerdeliveryanalyticsStateV3AnalyticsProviderImplspecialinlinedmap12((WorkManagerImpl) objWrite, subscribetobannerserrorslambda0, (transferSessionPackageI) objWrite2, getbitmapui_graphics);
        int i2 = addOnMultiWindowModeChangedListener + 13;
        onBackPressedInput_delegatelambda0 = i2 % Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            int i3 = 5 / 0;
        }
        return emitcomroadrunnerdeliveryanalyticsstatev3analyticsproviderimplspecialinlinedmap12;
    }

    private static createFromParcel write(setOnApplyWindowInsetsListener setonapplywindowinsetslistener, Throwable th) {
        int i = 2 % 2;
        int i2 = onBackPressedInput_delegatelambda0 + 85;
        addOnMultiWindowModeChangedListener = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        HomeFragment homeFragment = (HomeFragment) setonapplywindowinsetslistener;
        homeFragment.getClass();
        th.getClass();
        HomeViewModel homeViewModelRemoteActionCompatParcelizer = homeFragment.RemoteActionCompatParcelizer();
        markFragmentsCreated markfragmentscreated = (markFragmentsCreated) homeViewModelRemoteActionCompatParcelizer.serializer.MediaSessionCompatResultReceiverWrapper();
        markfragmentscreated.read.IconCompatParcelizer(Boolean.FALSE);
        r8lambda7Q1QCWXCUHrhcsGraulDg_ksbGU r8lambda7q1qcwxcuhrhcsgrauldg_ksbgu = markfragmentscreated.PlaybackStateCompatCustomAction;
        if (r8lambda7q1qcwxcuhrhcsgrauldg_ksbgu != null) {
            int i4 = onBackPressedInput_delegatelambda0 + 35;
            addOnMultiWindowModeChangedListener = i4 % Fields.SpotShadowColor;
            int i5 = i4 % 2;
            r8lambda7q1qcwxcuhrhcsgrauldg_ksbgu.write((CancellationException) null);
        }
        markfragmentscreated.PlaybackStateCompatCustomAction = null;
        homeViewModelRemoteActionCompatParcelizer.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY.serializer(new getViewLifecycleOwner(homeViewModelRemoteActionCompatParcelizer.write.read(th)));
        return null;
    }

    private void r8lambdavCwjfXDiSGcirCy4I008VOiJ_lw() {
        int i = 2 % 2;
        final MidShiftIdVerificationCoordinator midShiftIdVerificationCoordinator = (MidShiftIdVerificationCoordinator) this._init_lambda2;
        midShiftIdVerificationCoordinator.getClass();
        schedulePushDeliveryandroid_sdk_base_release schedulepushdeliveryandroid_sdk_base_release = (schedulePushDeliveryandroid_sdk_base_release) midShiftIdVerificationCoordinator.RemoteActionCompatParcelizer.MediaSessionCompatResultReceiverWrapper();
        ((setRegistrationDataProviderandroid_sdk_base_release) schedulepushdeliveryandroid_sdk_base_release).read.IconCompatParcelizer(this, new r8lambdaaj64OZVyd1y4RKHlJSx10F9bUic(5, new WorkerWrapper.Builder(this, schedulepushdeliveryandroid_sdk_base_release, new requestLocationInitialization() { // from class: o.CursorAnchorInfoControllertextFieldToRootTransform1
            private static int IconCompatParcelizer = 1;
            private static int read;

            @Override // o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0
            public final Object invoke() {
                int i2 = 2 % 2;
                int i3 = IconCompatParcelizer + 107;
                read = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                int i4 = i3 % 2;
                midShiftIdVerificationCoordinator.serializer("completed");
                createFromParcel createfromparcel = createFromParcel.INSTANCE;
                int i5 = read + 47;
                IconCompatParcelizer = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                if (i5 % 2 == 0) {
                    int i6 = 94 / 0;
                }
                return createfromparcel;
            }
        }, new retryInAppMessageandroid_sdk_base_release() { // from class: o.accessisSurrogatePair
            private static int IconCompatParcelizer = 0;
            private static int write = 1;

            @Override // o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0
            public final Object invoke() {
                int i2 = 2 % 2;
                int i3 = write + 45;
                IconCompatParcelizer = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                if (i3 % 2 != 0) {
                    midShiftIdVerificationCoordinator.serializer("dismissed or failed");
                    createFromParcel createfromparcel = createFromParcel.INSTANCE;
                    throw null;
                }
                midShiftIdVerificationCoordinator.serializer("dismissed or failed");
                createFromParcel createfromparcel2 = createFromParcel.INSTANCE;
                int i4 = IconCompatParcelizer + 37;
                write = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                int i5 = i4 % 2;
                return createfromparcel2;
            }
        }, new Path$Companion(), new accessisMainThread())));
        int i2 = addOnMultiWindowModeChangedListener + 83;
        onBackPressedInput_delegatelambda0 = i2 % Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            int i3 = 78 / 0;
        }
    }

    private void r8lambda54BeH8ZsBru0CXI2CCSP2syNys() {
        int i = 2 % 2;
        indirectPrimaryDirectionalScrollAxis indirectprimarydirectionalscrollaxis = this.PlaybackStateCompat;
        Flow flowIconCompatParcelizer = indirectprimarydirectionalscrollaxis.RemoteActionCompatParcelizer.IconCompatParcelizer();
        GetHelpCenterParamsUseCase getHelpCenterParamsUseCase = indirectprimarydirectionalscrollaxis.serializer;
        FlowableDoFinally flowableDoFinallyRemoteActionCompatParcelizer = getHelpCenterParamsUseCase.RemoteActionCompatParcelizer();
        r8lambdaXxy0IcvbkQrEJYJmjWChAqi7z4[] r8lambdaxxy0icvbkqrejyjmjwchaqi7z4Arr = onBackStartedlambda1.serializer;
        FlowKt__ZipKt$combine$$inlined$unsafeFlow$1 flowKt__ZipKt$combine$$inlined$unsafeFlow$1 = new FlowKt__ZipKt$combine$$inlined$unsafeFlow$1(flowIconCompatParcelizer, new PublisherAsFlow(flowableDoFinallyRemoteActionCompatParcelizer, r8lambda2qMxD75IpTxKfLD4RjAbqEmoamc.write, -2, IInAppMessageViewWrapper.SUSPEND), new GetCashBlockUiState$invoke$1(1));
        getHelpCenterParamsUseCase.invoke(createFromParcel.INSTANCE);
        BuildersKt.RemoteActionCompatParcelizer(toBitmapConfig1JJdX4A.IconCompatParcelizer(indirectprimarydirectionalscrollaxis), null, null, new RealImageLoader$execute$2$job$1(flowKt__ZipKt$combine$$inlined$unsafeFlow$1, indirectprimarydirectionalscrollaxis, (ShortNewsContentCardView) null, 13), 3);
        int i2 = addOnMultiWindowModeChangedListener + 47;
        onBackPressedInput_delegatelambda0 = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
    }

    @Override // com.foodora.courier.base.presentation.BaseInjectingMvvmActivity, com.foodora.courier.base.presentation.MvvmActivity, com.foodora.courier.base.presentation.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onResume() {
        int i = 2 % 2;
        super.onResume();
        PushTokenUpdateViewModel pushTokenUpdateViewModel = this.createFullyDrawnExecutor;
        pushTokenUpdateViewModel.getClass();
        Timber.RemoteActionCompatParcelizer.IconCompatParcelizer("Updating freshchat unread count from PushTokenUpdateViewModel", new Object[0]);
        pushTokenUpdateViewModel.IconCompatParcelizer.MediaDescriptionCompat();
        this.addObserverForBackInvokerlambda0.MediaBrowserCompatMediaItem.MediaBrowserCompatMediaItem();
        s2 s2Var = this.addObserverForBackInvokerlambda0.PlaybackStateCompat;
        String value = foregroundTimerFiredI.DELIVERY_DISPATCHED.getValue();
        s0 s0Var = (s0) s2Var;
        s0Var.getClass();
        value.getClass();
        BuildersKt.RemoteActionCompatParcelizer(s0Var.serializer, null, null, new SingleProcessDataStore$data$1.AnonymousClass1(s0Var, value, null, 27), 3);
        int i2 = onBackPressedInput_delegatelambda0 + 7;
        addOnMultiWindowModeChangedListener = i2 % Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            throw null;
        }
    }

    private static /* synthetic */ Object serializer(Object[] objArr) {
        MainActivity mainActivity = (MainActivity) objArr[0];
        int i = 2 % 2;
        supportsColorMatrixQuery lifecycle = mainActivity.getLifecycle();
        getDefaulteUduSuoannotations getdefaulteudusuoannotations = mainActivity._init_lambda4;
        AppCompatActivity appCompatActivityRatingCompat = mainActivity.RatingCompat();
        ImageLoader$Builder imageLoader$Builder = ((TypefaceDirtyTrackerLinkedList) getdefaulteudusuoannotations).IconCompatParcelizer;
        lifecycle.IconCompatParcelizer(new OnTheWayLifecycleObserverImpl(appCompatActivityRatingCompat, (EmojiCompatStatusDelegate) ((mergeJsonObjects) imageLoader$Builder.RemoteActionCompatParcelizer).write(), (resolveLineHeightInPxo2QH7mI) ((mergeJsonObjects) imageLoader$Builder.IconCompatParcelizer).write(), (LineBreakStrategyCompanion) ((mergeJsonObjects) imageLoader$Builder.read).write(), (mergelambda0) ((getDoubleOrNull) imageLoader$Builder.serializer).write));
        int i2 = onBackPressedInput_delegatelambda0 + 35;
        addOnMultiWindowModeChangedListener = i2 % Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            return null;
        }
        throw null;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0039  */
    /* JADX WARN: Code duplicated, block: B:9:0x0032 A[PHI: r1
  0x0032: PHI (r1v8 java.lang.ref.WeakReference) = (r1v7 java.lang.ref.WeakReference), (r1v16 java.lang.ref.WeakReference) binds: [B:8:0x0030, B:5:0x0020] A[DONT_GENERATE, DONT_INLINE]] */
    public void RemoteActionCompatParcelizer(int i, int i2) {
        WeakReference weakReference;
        Activity activity;
        int i3 = 2 % 2;
        int i4 = onBackPressedInput_delegatelambda0 + 41;
        addOnMultiWindowModeChangedListener = i4 % Fields.SpotShadowColor;
        if (i4 % 2 == 0) {
            CourierApplication courierApplication = CourierApplication.write;
            Context applicationContext = getApplicationContext();
            applicationContext.getClass();
            weakReference = ((CourierApplication) applicationContext).defaultViewModelProviderFactory_delegatelambda0;
            int i5 = 72 / 0;
            if (weakReference != null) {
                activity = (Activity) weakReference.get();
            } else {
                activity = null;
            }
        } else {
            CourierApplication courierApplication2 = CourierApplication.write;
            Context applicationContext2 = getApplicationContext();
            applicationContext2.getClass();
            weakReference = ((CourierApplication) applicationContext2).defaultViewModelProviderFactory_delegatelambda0;
            if (weakReference != null) {
                activity = (Activity) weakReference.get();
            } else {
                activity = null;
            }
        }
        if (activity != null) {
            int i6 = addOnMultiWindowModeChangedListener + 27;
            onBackPressedInput_delegatelambda0 = i6 % Fields.SpotShadowColor;
            int i7 = i6 % 2;
            getSTYLEABLE_VECTOR_DRAWABLE_VIEWPORT_HEIGHT getstyleable_vector_drawable_viewport_height = (getSTYLEABLE_VECTOR_DRAWABLE_VIEWPORT_HEIGHT) this.MediaSessionCompatToken;
            getstyleable_vector_drawable_viewport_height.getClass();
            try {
                removeOnContextAvailableListener removeoncontextavailablelistener = getstyleable_vector_drawable_viewport_height.serializer;
                if (removeoncontextavailablelistener != null) {
                    removeoncontextavailablelistener.dismiss();
                }
            } catch (Exception unused) {
            } catch (Throwable th) {
                getstyleable_vector_drawable_viewport_height.serializer = null;
                throw th;
            }
            getstyleable_vector_drawable_viewport_height.serializer = null;
            DeltaDecoder deltaDecoder = new DeltaDecoder(activity);
            deltaDecoder.IconCompatParcelizer(i);
            deltaDecoder.write(i2);
            deltaDecoder.IconCompatParcelizer();
            removeOnContextAvailableListener removeoncontextavailablelistenerSerializer = deltaDecoder.serializer();
            removeoncontextavailablelistenerSerializer.show();
            getstyleable_vector_drawable_viewport_height.serializer = removeoncontextavailablelistenerSerializer;
        }
    }

    private void ResultReceiver() {
        int i = 2 % 2;
        View viewInflate = getLayoutInflater().inflate(R.layout.activity_main, (ViewGroup) null, false);
        int i2 = R.id.homeFragmentContainer;
        if (((FragmentContainerView) ExtrasKt.RemoteActionCompatParcelizer(R.id.homeFragmentContainer, viewInflate)) != null) {
            int i3 = addOnMultiWindowModeChangedListener + 33;
            onBackPressedInput_delegatelambda0 = i3 % Fields.SpotShadowColor;
            int i4 = i3 % 2;
            i2 = R.id.main_coordinatorlayout;
            CoordinatorLayout coordinatorLayout = (CoordinatorLayout) ExtrasKt.RemoteActionCompatParcelizer(R.id.main_coordinatorlayout, viewInflate);
            if (coordinatorLayout != null) {
                int i5 = onBackPressedInput_delegatelambda0 + 45;
                addOnMultiWindowModeChangedListener = i5 % Fields.SpotShadowColor;
                int i6 = i5 % 2;
                DrawerLayout drawerLayout = (DrawerLayout) viewInflate;
                if (((getXnZO2Niw) ExtrasKt.RemoteActionCompatParcelizer(R.id.navigationView, viewInflate)) != null) {
                    this.onBackPressedDispatcher_delegatelambda0 = new performHapticFeedbackCdsT49E(drawerLayout, coordinatorLayout, drawerLayout);
                    return;
                }
                int i7 = onBackPressedInput_delegatelambda0 + 23;
                addOnMultiWindowModeChangedListener = i7 % Fields.SpotShadowColor;
                int i8 = i7 % 2;
                i2 = R.id.navigationView;
            }
        }
        ScreenStartObserver$$ExternalSyntheticLambda0.RemoteActionCompatParcelizer("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i2)));
        int i9 = onBackPressedInput_delegatelambda0 + 5;
        addOnMultiWindowModeChangedListener = i9 % Fields.SpotShadowColor;
        if (i9 % 2 == 0) {
            int i10 = 89 / 0;
        }
    }

    private void ParcelableVolumeInfo() {
        int i = 2 % 2;
        supportsColorMatrixQuery lifecycle = getLifecycle();
        MetricsBatchProcessor metricsBatchProcessor = ((convertActionToIndirectPointerEventType) this.addObserverForBackInvoker).serializer;
        lifecycle.IconCompatParcelizer(new PermissionsLifecycleObserver((r8lambdaWoCj75gxmwaDkeS1pbJi3djFY) ((getDoubleOrNull) metricsBatchProcessor.RemoteActionCompatParcelizer).write, (r8lambdaUofYenlmWtpWX2ga1uehmSCK4A) ((mergeJsonObjects) metricsBatchProcessor.serializer).write(), (r8lambda5YIXqjQinFDsIS50wZsDjw0Xjv4) ((mergeJsonObjects) metricsBatchProcessor.write).write(), (UtilsKt) ((mergeJsonObjects) metricsBatchProcessor.read).write(), (r8lambda5KZolJ_OR7ArWBprLRarbYqZEEA) ((mergeJsonObjects) metricsBatchProcessor.MediaSessionCompatQueueItem).write(), (r8lambda80jY8yCJXe50LHel8QKZq07he9s) ((mergeJsonObjects) metricsBatchProcessor.IconCompatParcelizer).write(), this));
        int i2 = onBackPressedInput_delegatelambda0 + 59;
        addOnMultiWindowModeChangedListener = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
    }

    /* JADX WARN: Code duplicated, block: B:11:0x005d  */
    /* JADX WARN: Code duplicated, block: B:13:0x0068  */
    /* JADX WARN: Code duplicated, block: B:14:0x0074  */
    /* JADX WARN: Code duplicated, block: B:16:0x0077  */
    /* JADX WARN: Code duplicated, block: B:9:0x0044  */
    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onNewIntent(Intent intent) {
        setOnSessionTrackingFailedListener setonsessiontrackingfailedlistener;
        int i;
        int i2 = 2 % 2;
        int i3 = onBackPressedInput_delegatelambda0 + 59;
        addOnMultiWindowModeChangedListener = i3 % Fields.SpotShadowColor;
        if (i3 % 2 == 0) {
            super.onNewIntent(intent);
            setIntent(intent);
            Timber.RemoteActionCompatParcelizer.IconCompatParcelizer("New Intent on main screen.", new Object[0]);
            this.defaultViewModelProviderFactory_delegatelambda0.RemoteActionCompatParcelizer(intent);
            if (intent.getBooleanExtra("syncState", false)) {
                String stringExtra = intent.getStringExtra("pushCategory");
                if (deleteEventMetadata.Firestore.name().equals(intent.getStringExtra("pushSourceTrigger"))) {
                    i = onBackPressedInput_delegatelambda0 + 75;
                    addOnMultiWindowModeChangedListener = i % Fields.SpotShadowColor;
                    if (i % 2 != 0) {
                        setOnSessionTrackingFailedListener setonsessiontrackingfailedlistener2 = setOnSessionTrackingFailedListener.FIRESTORE;
                        throw null;
                    }
                    setonsessiontrackingfailedlistener = setOnSessionTrackingFailedListener.FIRESTORE;
                    int i4 = addOnMultiWindowModeChangedListener + 121;
                    onBackPressedInput_delegatelambda0 = i4 % Fields.SpotShadowColor;
                    int i5 = i4 % 2;
                } else {
                    setonsessiontrackingfailedlistener = setOnSessionTrackingFailedListener.PUSH_NOTIFICATION;
                }
                this.addObserverForBackInvokerlambda0.write(setonsessiontrackingfailedlistener, null, null, stringExtra);
            }
        } else {
            super.onNewIntent(intent);
            setIntent(intent);
            Timber.RemoteActionCompatParcelizer.IconCompatParcelizer("New Intent on main screen.", new Object[0]);
            this.defaultViewModelProviderFactory_delegatelambda0.RemoteActionCompatParcelizer(intent);
            if (intent.getBooleanExtra("syncState", false)) {
                String stringExtra2 = intent.getStringExtra("pushCategory");
                if (deleteEventMetadata.Firestore.name().equals(intent.getStringExtra("pushSourceTrigger"))) {
                    i = onBackPressedInput_delegatelambda0 + 75;
                    addOnMultiWindowModeChangedListener = i % Fields.SpotShadowColor;
                    if (i % 2 != 0) {
                        setOnSessionTrackingFailedListener setonsessiontrackingfailedlistener3 = setOnSessionTrackingFailedListener.FIRESTORE;
                        throw null;
                    }
                    setonsessiontrackingfailedlistener = setOnSessionTrackingFailedListener.FIRESTORE;
                    int i6 = addOnMultiWindowModeChangedListener + 121;
                    onBackPressedInput_delegatelambda0 = i6 % Fields.SpotShadowColor;
                    int i7 = i6 % 2;
                } else {
                    setonsessiontrackingfailedlistener = setOnSessionTrackingFailedListener.PUSH_NOTIFICATION;
                }
                this.addObserverForBackInvokerlambda0.write(setonsessiontrackingfailedlistener, null, null, stringExtra2);
            }
        }
        r8lambda0tFkXN0c4UQsJxVxyejUo1BomY r8lambda0tfkxn0c4uqsjxvxyejuo1bomy = this.ParcelableVolumeInfo;
        r8lambda97B6Pg2rSmZnc05L6A5yZDJRg r8lambda97b6pg2rsmznc05l6a5yzdjrg = this._init_lambda1;
        r8lambda2fbYAoOOcVqhXQP2NIm5pmOCD5w r8lambda2fbyaooocvqhxqp2nim5pmocd5w = (r8lambda2fbYAoOOcVqhXQP2NIm5pmOCD5w) r8lambda0tfkxn0c4uqsjxvxyejuo1bomy;
        r8lambda2fbyaooocvqhxqp2nim5pmocd5w.getClass();
        r8lambda97b6pg2rsmznc05l6a5yzdjrg.getClass();
        Bundle extras = intent.getExtras();
        if (extras != null) {
            int i8 = addOnMultiWindowModeChangedListener + 23;
            onBackPressedInput_delegatelambda0 = i8 % Fields.SpotShadowColor;
            int i9 = i8 % 2;
            Uri uri = (Uri) extras.getParcelable("deeplinkUri");
            if (uri != null) {
                r8lambda2fbyaooocvqhxqp2nim5pmocd5w.serializer(uri, r8lambda97b6pg2rsmznc05l6a5yzdjrg);
            }
        }
        int i10 = addOnMultiWindowModeChangedListener + 119;
        onBackPressedInput_delegatelambda0 = i10 % Fields.SpotShadowColor;
        int i11 = i10 % 2;
    }

    private void MediaBrowserCompatMediaItem() {
        int i = 2 % 2;
        r8lambdaxtMbdW3_JzuVQlt1ETNPgAvo_g r8lambdaxtmbdw3_jzuvqlt1etnpgavo_g = this.fullyDrawnReporter_delegatelambda00;
        supportsColorMatrixQuery lifecycle = getLifecycle();
        div7Ah8Wj8 supportFragmentManager = getSupportFragmentManager();
        DrawerLayout drawerLayout = this.onBackPressedDispatcher_delegatelambda0.RemoteActionCompatParcelizer;
        ComponentRegistry$Builder componentRegistry$Builder = (ComponentRegistry$Builder) r8lambdaxtmbdw3_jzuvqlt1etnpgavo_g;
        componentRegistry$Builder.getClass();
        lifecycle.getClass();
        supportFragmentManager.getClass();
        drawerLayout.getClass();
        r8lambdazJ_is40ErW_0zWXIHU0U2X8pyMM r8lambdazj_is40erw_0zwxihu0u2x8pymm = (r8lambdazJ_is40ErW_0zWXIHU0U2X8pyMM) componentRegistry$Builder.write;
        r8lambdaguMkB96aaxyAGqCnh2xMDXoFAs r8lambdagumkb96aaxyagqcnh2xmdxofas = (r8lambdaguMkB96aaxyAGqCnh2xMDXoFAs) componentRegistry$Builder.read;
        SaveHeatmapUrlImpl saveHeatmapUrlImpl = (SaveHeatmapUrlImpl) componentRegistry$Builder.RemoteActionCompatParcelizer;
        r8lambdax3lltCpD3rATxa4vQpnFaaGbzP4 r8lambdax3lltcpd3ratxa4vqpnfaagbzp4 = (r8lambdax3lltCpD3rATxa4vQpnFaaGbzP4) componentRegistry$Builder.IconCompatParcelizer;
        accessgetSdkEnablementProvidercp accessgetsdkenablementprovidercp = (accessgetSdkEnablementProvidercp) componentRegistry$Builder.serializer;
        r8lambdazj_is40erw_0zwxihu0u2x8pymm.getClass();
        drawerLayout.getClass();
        r8lambdax3lltcpd3ratxa4vqpnfaagbzp4.getClass();
        accessgetsdkenablementprovidercp.getClass();
        CallOptions$Builder callOptions$Builder = new CallOptions$Builder();
        callOptions$Builder.serializer = r8lambdazj_is40erw_0zwxihu0u2x8pymm;
        callOptions$Builder.RemoteActionCompatParcelizer = lifecycle;
        callOptions$Builder.read = supportFragmentManager;
        callOptions$Builder.write = drawerLayout;
        callOptions$Builder.MediaMetadataCompat = r8lambdagumkb96aaxyagqcnh2xmdxofas;
        callOptions$Builder.RatingCompat = saveHeatmapUrlImpl;
        callOptions$Builder.IconCompatParcelizer = r8lambdax3lltcpd3ratxa4vqpnfaagbzp4;
        callOptions$Builder.MediaSessionCompatQueueItem = accessgetsdkenablementprovidercp;
        BuildersKt.RemoteActionCompatParcelizer(toBitmapConfig1JJdX4A.read(lifecycle), null, null, new SideMenuDrawerManagerImpl$observeNavigationEvents$1(callOptions$Builder, null, 0), 3);
        r8lambdaxdfXWt5iCckeuHVb65uEgq9TfBk r8lambdaxdfxwt5icckeuhvb65uegq9tfbk = new r8lambdaxdfXWt5iCckeuHVb65uEgq9TfBk(callOptions$Builder);
        if (drawerLayout.ResultReceiver == null) {
            drawerLayout.ResultReceiver = new ArrayList();
        }
        drawerLayout.ResultReceiver.add(r8lambdaxdfxwt5icckeuhvb65uegq9tfbk);
        drawerLayout.setDrawerLockMode(1);
        this.fullyDrawnReporter_delegatelambda0 = callOptions$Builder;
        int i2 = onBackPressedInput_delegatelambda0 + 123;
        addOnMultiWindowModeChangedListener = i2 % Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            throw null;
        }
    }

    private void MediaSessionCompatQueueItem() {
        int i = 2 % 2;
        supportsColorMatrixQuery lifecycle = getLifecycle();
        MapDelegateProviderImpl mapDelegateProviderImpl = ((getNativeEvent) this.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus).write;
        lifecycle.IconCompatParcelizer(new getNativeEventui((onDetachedFromRecyclerView) ((mergeJsonObjects) mapDelegateProviderImpl.mapboxMap).write(), (getCollectionItemInfo) ((mergeJsonObjects) mapDelegateProviderImpl.mapCameraManagerDelegate).write(), (setHorizontalGap) ((mergeJsonObjects) mapDelegateProviderImpl.mapProjectionDelegate).write(), (setSharedElementNames) ((mergeJsonObjects) mapDelegateProviderImpl.mapTransformDelegate).write(), (toClickableSpan) ((mergeJsonObjects) mapDelegateProviderImpl.mapListenerDelegate).write(), (accessgetFalseyp) ((mergeJsonObjects) mapDelegateProviderImpl.mapStyleManagerDelegate).write(), (getTextDirectionmmuk1to) ((mergeJsonObjects) mapDelegateProviderImpl.mapInteractionDelegate).write(), (PermissionsLifecycleObserver) ((setPaddingBottom) mapDelegateProviderImpl.mapAttributionDelegate$delegate).write(), (BrazeExternalSyntheticLambda29) ((mergeJsonObjects) mapDelegateProviderImpl.mapPluginProviderDelegate).write(), (getTextAlignbuA522U) ((mergeJsonObjects) mapDelegateProviderImpl.indoorManager).write(), this));
        int i2 = onBackPressedInput_delegatelambda0 + 33;
        addOnMultiWindowModeChangedListener = i2 % Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Code duplicated, block: B:15:0x0060  */
    /* JADX WARN: Code duplicated, block: B:27:0x00aa  */
    @Override // com.foodora.courier.base.presentation.BaseInjectingMvvmActivity, com.foodora.courier.base.presentation.MvvmActivity, com.foodora.courier.base.presentation.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onStart() {
        Object value;
        accessdrawWithChildTracking accessdrawwithchildtracking;
        access900 access900Var;
        int i = 2 % 2;
        getAllSemanticsNodesToMap getallsemanticsnodestomap = this.menuHostHelperlambda0;
        accessgetXcp accessgetxcp = new accessgetXcp(this, 1);
        getallsemanticsnodestomap.getClass();
        ((TraceTimeMeasurementWithPerformanceKit) getallsemanticsnodestomap).read("main_activity_on_start", new RoomDatabase$closeBarrier$1(0, accessgetxcp, Runnable.class, "run", "run()V", 0, 4));
        MainPresenter mainPresenter = this.addObserverForBackInvokerlambda0;
        mainPresenter.getClass();
        setOnSessionTrackingFailedListener setonsessiontrackingfailedlistener = setOnSessionTrackingFailedListener.ENTER_FOREGROUND;
        ShortNewsContentCardView shortNewsContentCardView = null;
        if (!mainPresenter.MediaDescriptionCompat) {
            Object obj = mainPresenter.IconCompatParcelizer.write.MediaSessionCompatQueueItem.get();
            if (NotificationLite.isComplete(obj)) {
                value = null;
            } else {
                int i2 = addOnMultiWindowModeChangedListener + 111;
                onBackPressedInput_delegatelambda0 = i2 % Fields.SpotShadowColor;
                if (i2 % 2 != 0) {
                    NotificationLite.isError(obj);
                    shortNewsContentCardView.hashCode();
                    throw null;
                }
                if (NotificationLite.isError(obj)) {
                    value = null;
                } else {
                    value = NotificationLite.getValue(obj);
                }
            }
            if (value instanceof accessdrawWithChildTracking) {
                int i3 = addOnMultiWindowModeChangedListener + 95;
                onBackPressedInput_delegatelambda0 = i3 % Fields.SpotShadowColor;
                int i4 = i3 % 2;
                accessdrawwithchildtracking = (accessdrawWithChildTracking) value;
            } else {
                accessdrawwithchildtracking = null;
            }
            if (accessdrawwithchildtracking != null) {
                int i5 = addOnMultiWindowModeChangedListener + 71;
                onBackPressedInput_delegatelambda0 = i5 % Fields.SpotShadowColor;
                int i6 = i5 % 2;
                access900Var = accessdrawwithchildtracking.serializer;
            } else {
                access900Var = null;
            }
            if (access900Var != null) {
                if (!((Boolean) access900.read(42385299, new Object[]{access900Var}, PackageHandler7.read(), PackageHandler7.read(), PackageHandler7.read(), -42385298, PackageHandler7.read())).booleanValue()) {
                    mainPresenter.write(setonsessiontrackingfailedlistener, new StateV3$$ExternalSyntheticLambda0(4), null, null);
                }
            } else {
                mainPresenter.write(setonsessiontrackingfailedlistener, new StateV3$$ExternalSyntheticLambda0(4), null, null);
            }
        }
        PlayStoreBasedAppUpdate playStoreBasedAppUpdate = mainPresenter.MediaSessionCompatQueueItem;
        AppCompatActivity appCompatActivityRatingCompat = mainPresenter.ParcelableVolumeInfo.RatingCompat();
        playStoreBasedAppUpdate.getClass();
        appCompatActivityRatingCompat.getClass();
        fromColorLong fromcolorlong = toBitmapConfig1JJdX4A.read(appCompatActivityRatingCompat.getLifecycle());
        BuildersKt.RemoteActionCompatParcelizer(fromcolorlong, null, null, new SimpleActor$offer$2(fromcolorlong, new SimpleActor$offer$2(playStoreBasedAppUpdate, appCompatActivityRatingCompat, shortNewsContentCardView, 24), shortNewsContentCardView, 5), 3);
    }

    private void MediaSessionCompatResultReceiverWrapper() {
        int i = 2 % 2;
        r8lambdak8D1aV0PAfigTPLH22X5wDyzFJU r8lambdak8d1av0pafigtplh22x5wdyzfjuIconCompatParcelizer = UriKt.IconCompatParcelizer(getIntent().getExtras(), this, new IndirectPointerEventPrimaryDirectionalMotionAxis(this, 1));
        getFilterQualityfv9h1I viewModelStore = getViewModelStore();
        setStrokeCapBeK7IIE defaultViewModelCreationExtras = getDefaultViewModelCreationExtras();
        viewModelStore.getClass();
        defaultViewModelCreationExtras.getClass();
        ImageLoader$Builder imageLoader$Builder = new ImageLoader$Builder(viewModelStore, r8lambdak8d1av0pafigtplh22x5wdyzfjuIconCompatParcelizer, defaultViewModelCreationExtras);
        r8lambdaucGIgHn8fIyV_vccOdEafjFpEdk r8lambdaucgighn8fiyv_vccodeafjfpedkSerializer = displayInAppMessagelambda1.serializer(emitcomroadrunnerdeliveryanalyticsStateV3AnalyticsProviderImplspecialinlinedmap12.class);
        String strRemoteActionCompatParcelizer = r8lambdaucgighn8fiyv_vccodeafjfpedkSerializer.RemoteActionCompatParcelizer();
        if (strRemoteActionCompatParcelizer != null) {
            this.r8lambdayPQlaAoRiYRJ3IY_TqzUUTrVH0 = (emitcomroadrunnerdeliveryanalyticsStateV3AnalyticsProviderImplspecialinlinedmap12) imageLoader$Builder.write(r8lambdaucgighn8fiyv_vccodeafjfpedkSerializer, "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(strRemoteActionCompatParcelizer));
            r8lambdauDhHXlIoLpU0HpCcQH6vOsKpNY r8lambdaudhhxliolpu0hpccqh6voskpny = this.ensureViewModelStore;
            r8lambdaudhhxliolpu0hpccqh6voskpny.getClass();
            getFilterQualityfv9h1I viewModelStore2 = getViewModelStore();
            setStrokeCapBeK7IIE defaultViewModelCreationExtras2 = getDefaultViewModelCreationExtras();
            viewModelStore2.getClass();
            defaultViewModelCreationExtras2.getClass();
            ImageLoader$Builder imageLoader$Builder2 = new ImageLoader$Builder(viewModelStore2, r8lambdaudhhxliolpu0hpccqh6voskpny, defaultViewModelCreationExtras2);
            r8lambdaucGIgHn8fIyV_vccOdEafjFpEdk r8lambdaucgighn8fiyv_vccodeafjfpedkSerializer2 = displayInAppMessagelambda1.serializer(PushTokenUpdateViewModel.class);
            String strRemoteActionCompatParcelizer2 = r8lambdaucgighn8fiyv_vccodeafjfpedkSerializer2.RemoteActionCompatParcelizer();
            if (strRemoteActionCompatParcelizer2 != null) {
                this.createFullyDrawnExecutor = (PushTokenUpdateViewModel) imageLoader$Builder2.write(r8lambdaucgighn8fiyv_vccodeafjfpedkSerializer2, "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(strRemoteActionCompatParcelizer2));
                r8lambdauDhHXlIoLpU0HpCcQH6vOsKpNY r8lambdaudhhxliolpu0hpccqh6voskpny2 = this.PlaybackStateCompatCustomAction;
                r8lambdaudhhxliolpu0hpccqh6voskpny2.getClass();
                getFilterQualityfv9h1I viewModelStore3 = getViewModelStore();
                setStrokeCapBeK7IIE defaultViewModelCreationExtras3 = getDefaultViewModelCreationExtras();
                viewModelStore3.getClass();
                defaultViewModelCreationExtras3.getClass();
                ImageLoader$Builder imageLoader$Builder3 = new ImageLoader$Builder(viewModelStore3, r8lambdaudhhxliolpu0hpccqh6voskpny2, defaultViewModelCreationExtras3);
                r8lambdaucGIgHn8fIyV_vccOdEafjFpEdk r8lambdaucgighn8fiyv_vccodeafjfpedkSerializer3 = displayInAppMessagelambda1.serializer(indirectPrimaryDirectionalScrollAxis.class);
                String strRemoteActionCompatParcelizer3 = r8lambdaucgighn8fiyv_vccodeafjfpedkSerializer3.RemoteActionCompatParcelizer();
                if (strRemoteActionCompatParcelizer3 == null) {
                    ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer("Local and anonymous classes can not be ViewModels");
                    return;
                }
                int i2 = addOnMultiWindowModeChangedListener + 75;
                onBackPressedInput_delegatelambda0 = i2 % Fields.SpotShadowColor;
                int i3 = i2 % 2;
                this.PlaybackStateCompat = (indirectPrimaryDirectionalScrollAxis) imageLoader$Builder3.write(r8lambdaucgighn8fiyv_vccodeafjfpedkSerializer3, "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(strRemoteActionCompatParcelizer3));
                return;
            }
            ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer("Local and anonymous classes can not be ViewModels");
            int i4 = onBackPressedInput_delegatelambda0 + 57;
            addOnMultiWindowModeChangedListener = i4 % Fields.SpotShadowColor;
            if (i4 % 2 == 0) {
                throw null;
            }
            return;
        }
        ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer("Local and anonymous classes can not be ViewModels");
    }

    /* JADX WARN: Code duplicated, block: B:37:0x005d A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:8:0x0063 A[Catch: Exception -> 0x0080, TRY_LEAVE, TryCatch #0 {Exception -> 0x0080, blocks: (B:8:0x0063, B:6:0x005d), top: B:37:0x005d }] */
    @Override // com.foodora.courier.base.presentation.BaseInjectingMvvmActivity, com.foodora.courier.base.presentation.MvvmActivity, com.foodora.courier.base.presentation.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        ContextsKt focusRestorerElement;
        Uri uri;
        final int i = 2;
        int i2 = 2 % 2;
        int i3 = addOnMultiWindowModeChangedListener + 123;
        onBackPressedInput_delegatelambda0 = i3 % Fields.SpotShadowColor;
        int i4 = i3 % 2;
        super.onCreate(bundle);
        Window window = getWindow();
        Set setRemoteActionCompatParcelizer = ((FirebaseRemoteConfigImpl) this.r8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss).IconCompatParcelizer.RemoteActionCompatParcelizer("lrtmi_android_fps_reduction_device_models");
        Set setRemoteActionCompatParcelizer2 = ((FirebaseRemoteConfigImpl) this.r8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss).IconCompatParcelizer.RemoteActionCompatParcelizer("lrtmi_android_fps_reduction_soc_names");
        FirebaseRemoteConfigImpl firebaseRemoteConfigImpl = (FirebaseRemoteConfigImpl) this.r8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss;
        firebaseRemoteConfigImpl.getClass();
        boolean zIconCompatParcelizer = firebaseRemoteConfigImpl.IconCompatParcelizer(updateAdidI.IS_LOW_END_DEVICE_FPS_LIMITER_ENABLED);
        boolean zRemoteActionCompatParcelizer = ModuleDSLKt.RemoteActionCompatParcelizer(getApplication());
        window.getClass();
        String str = Build.MODEL;
        str.getClass();
        String strSerializer = isPartiallyOffscreenInScrollParent.serializer();
        final int i5 = 1;
        final int i6 = 0;
        if (zIconCompatParcelizer) {
            int i7 = addOnMultiWindowModeChangedListener + 53;
            onBackPressedInput_delegatelambda0 = i7 % Fields.SpotShadowColor;
            int i8 = i7 % 2;
            if (!zRemoteActionCompatParcelizer) {
                try {
                    if (UrlUtils.IconCompatParcelizer(setRemoteActionCompatParcelizer, setRemoteActionCompatParcelizer2, str, strSerializer)) {
                        WindowManager.LayoutParams attributes = window.getAttributes();
                        attributes.preferredRefreshRate = 30.0f;
                        window.setAttributes(attributes);
                        Timber.RemoteActionCompatParcelizer.IconCompatParcelizer("MainActivity FPS has been capped to 30 FPS", new Object[0]);
                        int i9 = onBackPressedInput_delegatelambda0 + 1;
                        addOnMultiWindowModeChangedListener = i9 % Fields.SpotShadowColor;
                        int i10 = i9 % 2;
                    }
                } catch (Exception e) {
                    Timber.RemoteActionCompatParcelizer.RemoteActionCompatParcelizer(e, "Failed to apply FPS reduction to window", new Object[0]);
                }
            } else {
                WindowManager.LayoutParams attributes2 = window.getAttributes();
                attributes2.preferredRefreshRate = 30.0f;
                window.setAttributes(attributes2);
                Timber.RemoteActionCompatParcelizer.IconCompatParcelizer("MainActivity FPS has been capped to 30 FPS", new Object[0]);
                int i11 = onBackPressedInput_delegatelambda0 + 1;
                addOnMultiWindowModeChangedListener = i11 % Fields.SpotShadowColor;
                int i12 = i11 % 2;
            }
        } else if (UrlUtils.IconCompatParcelizer(setRemoteActionCompatParcelizer, setRemoteActionCompatParcelizer2, str, strSerializer)) {
            WindowManager.LayoutParams attributes3 = window.getAttributes();
            attributes3.preferredRefreshRate = 30.0f;
            window.setAttributes(attributes3);
            Timber.RemoteActionCompatParcelizer.IconCompatParcelizer("MainActivity FPS has been capped to 30 FPS", new Object[0]);
            int i13 = onBackPressedInput_delegatelambda0 + 1;
            addOnMultiWindowModeChangedListener = i13 % Fields.SpotShadowColor;
            int i14 = i13 % 2;
        }
        if (getIntent() != null && getIntent().hasExtra("notification_id")) {
            int i15 = addOnMultiWindowModeChangedListener + 5;
            onBackPressedInput_delegatelambda0 = i15 % Fields.SpotShadowColor;
            int i16 = i15 % 2;
            getUnmergedRootSemanticsNode getunmergedrootsemanticsnode = (getUnmergedRootSemanticsNode) this.RatingCompat;
            getunmergedrootsemanticsnode.write.ParcelableVolumeInfo.RemoteActionCompatParcelizer("app_start_to_interactive", "entryPoint", "pushNotification");
            ((getRootInfoui) getunmergedrootsemanticsnode.IconCompatParcelizer.write).RemoteActionCompatParcelizer("app_start_to_interactive_sentry", "entryPoint", "pushNotification");
        }
        Object[] objArr = {Boolean.valueOf(bundle == null)};
        Timber.Forest forest = Timber.RemoteActionCompatParcelizer;
        forest.IconCompatParcelizer("Main Activity created. isFreshStart: %s", objArr);
        r8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss();
        MediaSessionCompatResultReceiverWrapper();
        getAllSemanticsNodesToMap getallsemanticsnodestomap = this.menuHostHelperlambda0;
        accessgetXcp accessgetxcp = new accessgetXcp(this, i6);
        getallsemanticsnodestomap.getClass();
        ((TraceTimeMeasurementWithPerformanceKit) getallsemanticsnodestomap).read("main_activity_on_create_layout_inflation", new RoomDatabase$closeBarrier$1(0, accessgetxcp, Runnable.class, "run", "run()V", 0, 4));
        setContentView(this.onBackPressedDispatcher_delegatelambda0.write);
        Gen2FunWithFlagsConfigRepository gen2FunWithFlagsConfigRepository = this.r8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8.write;
        updateHandlersStatusAndSendI updatehandlersstatusandsendi = postponeEnterTransition.write;
        forest.read("IsMultiVariantTestEnabledImpl has " + ((registerForContextMenu) gen2FunWithFlagsConfigRepository.serializer(updatehandlersstatusandsendi, displayInAppMessagelambda1.serializer(registerForContextMenu.class))) + " for " + updatehandlersstatusandsendi.RemoteActionCompatParcelizer, new Object[0]);
        isAttachedToWindow isattachedtowindow = this._init_lambda3;
        isattachedtowindow.getClass();
        boolean zWrite = isattachedtowindow.serializer.write();
        Window window2 = getWindow();
        window2.getDecorView().setSystemUiVisibility(1280);
        window2.addFlags(Integer.MIN_VALUE);
        window2.clearFlags(67108864);
        window2.setStatusBarColor(0);
        FocusPropertiesKtsamandroidx_compose_ui_focus_FocusPropertiesScope0 focusPropertiesKtsamandroidx_compose_ui_focus_FocusPropertiesScope0 = new FocusPropertiesKtsamandroidx_compose_ui_focus_FocusPropertiesScope0(window2.getDecorView());
        int i17 = Build.VERSION.SDK_INT;
        if (i17 >= 35) {
            focusRestorerElement = new getOnExitannotations(window2, focusPropertiesKtsamandroidx_compose_ui_focus_FocusPropertiesScope0);
        } else {
            focusRestorerElement = i17 >= 30 ? new FocusRestorerElement(window2, focusPropertiesKtsamandroidx_compose_ui_focus_FocusPropertiesScope0) : new setFocusRequester(window2, focusPropertiesKtsamandroidx_compose_ui_focus_FocusPropertiesScope0);
        }
        focusRestorerElement.write(!zWrite);
        ParcelableVolumeInfo();
        write(bundle);
        MediaBrowserCompatMediaItem();
        r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28();
        r8lambda7IJBVrN0sHyidCAZufWEJFc7yY();
        r8lambdayPQlaAoRiYRJ3IY_TqzUUTrVH0();
        r8lambdag6d1IyBXWIL5aeSAzXsZMVuYCQs();
        r8lambdawJ5MHcSJed_CjC7r4OWD0UxyJsQ();
        r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
        RemoteActionCompatParcelizer(ActivityHandler.AnonymousClass45.read(), ActivityHandler.AnonymousClass45.read(), ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.delivery_items_title_count_single).substring(0, 4).length() + 453211894, 1562590161, -1562590158, ContentScaleCompanionFillWidth1.write(), new Object[]{this});
        _init_lambda1();
        r8lambdavCwjfXDiSGcirCy4I008VOiJ_lw();
        this.PlaybackStateCompat.write.RemoteActionCompatParcelizer(this, new IndirectPointerEventPrimaryDirectionalMotionAxis(this, i6));
        PlaybackStateCompatCustomAction();
        this.createFullyDrawnExecutor.RatingCompat.serializer(this, new unregisterComponentCallback(this) { // from class: o.IndirectPointerEventPrimaryDirectionalMotionAxisCompanion
            private static int IconCompatParcelizer = 1;
            private static int serializer;
            public final /* synthetic */ MainActivity RemoteActionCompatParcelizer;

            {
                this.RemoteActionCompatParcelizer = this;
            }

            @Override // o.unregisterComponentCallback
            public final void RemoteActionCompatParcelizer(Object obj) {
                int i18 = 2 % 2;
                int i19 = i6;
                MainActivity mainActivity = this.RemoteActionCompatParcelizer;
                if (i19 == 0) {
                    MainActivity.RemoteActionCompatParcelizer(ContentScaleCompanionFillWidth1.write(), ContentScaleCompanionFillWidth1.write(), ContentScaleCompanionFillWidth1.write(), 607447748, -607447740, ContentScaleCompanionFillWidth1.write(), new Object[]{mainActivity, (String) obj});
                    int i20 = serializer + 5;
                    IconCompatParcelizer = i20 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                    int i21 = i20 % 2;
                    return;
                }
                if (i19 == 1) {
                    MainActivity.RemoteActionCompatParcelizer(mainActivity, (createFromParcel) obj);
                    int i22 = serializer + 43;
                    IconCompatParcelizer = i22 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                    int i23 = i22 % 2;
                    return;
                }
                if (i19 == 2) {
                    MainActivity.serializer(mainActivity, ((Integer) obj).intValue());
                    return;
                }
                MainActivity.IconCompatParcelizer(mainActivity, (Boolean) obj);
                int i24 = serializer + 49;
                IconCompatParcelizer = i24 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                int i25 = i24 % 2;
            }
        });
        this.createFullyDrawnExecutor.MediaMetadataCompat.serializer(this, new unregisterComponentCallback(this) { // from class: o.IndirectPointerEventPrimaryDirectionalMotionAxisCompanion
            private static int IconCompatParcelizer = 1;
            private static int serializer;
            public final /* synthetic */ MainActivity RemoteActionCompatParcelizer;

            {
                this.RemoteActionCompatParcelizer = this;
            }

            @Override // o.unregisterComponentCallback
            public final void RemoteActionCompatParcelizer(Object obj) {
                int i18 = 2 % 2;
                int i19 = i5;
                MainActivity mainActivity = this.RemoteActionCompatParcelizer;
                if (i19 == 0) {
                    MainActivity.RemoteActionCompatParcelizer(ContentScaleCompanionFillWidth1.write(), ContentScaleCompanionFillWidth1.write(), ContentScaleCompanionFillWidth1.write(), 607447748, -607447740, ContentScaleCompanionFillWidth1.write(), new Object[]{mainActivity, (String) obj});
                    int i20 = serializer + 5;
                    IconCompatParcelizer = i20 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                    int i21 = i20 % 2;
                    return;
                }
                if (i19 == 1) {
                    MainActivity.RemoteActionCompatParcelizer(mainActivity, (createFromParcel) obj);
                    int i22 = serializer + 43;
                    IconCompatParcelizer = i22 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                    int i23 = i22 % 2;
                    return;
                }
                if (i19 == 2) {
                    MainActivity.serializer(mainActivity, ((Integer) obj).intValue());
                    return;
                }
                MainActivity.IconCompatParcelizer(mainActivity, (Boolean) obj);
                int i24 = serializer + 49;
                IconCompatParcelizer = i24 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                int i25 = i24 % 2;
            }
        });
        this.createFullyDrawnExecutor.MediaBrowserCompatMediaItem.serializer(this, new unregisterComponentCallback(this) { // from class: o.IndirectPointerEventPrimaryDirectionalMotionAxisCompanion
            private static int IconCompatParcelizer = 1;
            private static int serializer;
            public final /* synthetic */ MainActivity RemoteActionCompatParcelizer;

            {
                this.RemoteActionCompatParcelizer = this;
            }

            @Override // o.unregisterComponentCallback
            public final void RemoteActionCompatParcelizer(Object obj) {
                int i18 = 2 % 2;
                int i19 = i;
                MainActivity mainActivity = this.RemoteActionCompatParcelizer;
                if (i19 == 0) {
                    MainActivity.RemoteActionCompatParcelizer(ContentScaleCompanionFillWidth1.write(), ContentScaleCompanionFillWidth1.write(), ContentScaleCompanionFillWidth1.write(), 607447748, -607447740, ContentScaleCompanionFillWidth1.write(), new Object[]{mainActivity, (String) obj});
                    int i20 = serializer + 5;
                    IconCompatParcelizer = i20 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                    int i21 = i20 % 2;
                    return;
                }
                if (i19 == 1) {
                    MainActivity.RemoteActionCompatParcelizer(mainActivity, (createFromParcel) obj);
                    int i22 = serializer + 43;
                    IconCompatParcelizer = i22 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                    int i23 = i22 % 2;
                    return;
                }
                if (i19 == 2) {
                    MainActivity.serializer(mainActivity, ((Integer) obj).intValue());
                    return;
                }
                MainActivity.IconCompatParcelizer(mainActivity, (Boolean) obj);
                int i24 = serializer + 49;
                IconCompatParcelizer = i24 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                int i25 = i24 % 2;
            }
        });
        final int i18 = 3;
        ((getYnZO2Niw) ((MvvmActivity) this).MediaDescriptionCompat).MediaSessionCompatResultReceiverWrapper.serializer(this, new unregisterComponentCallback(this) { // from class: o.IndirectPointerEventPrimaryDirectionalMotionAxisCompanion
            private static int IconCompatParcelizer = 1;
            private static int serializer;
            public final /* synthetic */ MainActivity RemoteActionCompatParcelizer;

            {
                this.RemoteActionCompatParcelizer = this;
            }

            @Override // o.unregisterComponentCallback
            public final void RemoteActionCompatParcelizer(Object obj) {
                int i19 = 2 % 2;
                int i110 = i18;
                MainActivity mainActivity = this.RemoteActionCompatParcelizer;
                if (i110 == 0) {
                    MainActivity.RemoteActionCompatParcelizer(ContentScaleCompanionFillWidth1.write(), ContentScaleCompanionFillWidth1.write(), ContentScaleCompanionFillWidth1.write(), 607447748, -607447740, ContentScaleCompanionFillWidth1.write(), new Object[]{mainActivity, (String) obj});
                    int i20 = serializer + 5;
                    IconCompatParcelizer = i20 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                    int i21 = i20 % 2;
                    return;
                }
                if (i110 == 1) {
                    MainActivity.RemoteActionCompatParcelizer(mainActivity, (createFromParcel) obj);
                    int i22 = serializer + 43;
                    IconCompatParcelizer = i22 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                    int i23 = i22 % 2;
                    return;
                }
                if (i110 == 2) {
                    MainActivity.serializer(mainActivity, ((Integer) obj).intValue());
                    return;
                }
                MainActivity.IconCompatParcelizer(mainActivity, (Boolean) obj);
                int i24 = serializer + 49;
                IconCompatParcelizer = i24 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                int i25 = i24 % 2;
            }
        });
        getLifecycle().IconCompatParcelizer(this.r8lambda54BeH8ZsBru0CXI2CCSP2syNys);
        this.defaultViewModelProviderFactory_delegatelambda0.RemoteActionCompatParcelizer(getIntent());
        if (bundle == null) {
            int i19 = onBackPressedInput_delegatelambda0 + 101;
            addOnMultiWindowModeChangedListener = i19 % Fields.SpotShadowColor;
            int i20 = i19 % 2;
            r8lambda0tFkXN0c4UQsJxVxyejUo1BomY r8lambda0tfkxn0c4uqsjxvxyejuo1bomy = this.ParcelableVolumeInfo;
            Intent intent = getIntent();
            r8lambda97B6Pg2rSmZnc05L6A5yZDJRg r8lambda97b6pg2rsmznc05l6a5yzdjrg = this._init_lambda1;
            r8lambda2fbYAoOOcVqhXQP2NIm5pmOCD5w r8lambda2fbyaooocvqhxqp2nim5pmocd5w = (r8lambda2fbYAoOOcVqhXQP2NIm5pmOCD5w) r8lambda0tfkxn0c4uqsjxvxyejuo1bomy;
            r8lambda2fbyaooocvqhxqp2nim5pmocd5w.getClass();
            intent.getClass();
            r8lambda97b6pg2rsmznc05l6a5yzdjrg.getClass();
            Bundle extras = intent.getExtras();
            if (extras != null && (uri = (Uri) extras.getParcelable("deeplinkUri")) != null) {
                r8lambda2fbyaooocvqhxqp2nim5pmocd5w.serializer(uri, r8lambda97b6pg2rsmznc05l6a5yzdjrg);
            }
        }
        _init_lambda3();
        MediaSessionCompatQueueItem();
        RemoteActionCompatParcelizer(ActivityHandler.AnonymousClass45.read(), ActivityHandler.AnonymousClass45.read(), ActivityHandler.AnonymousClass45.read(), 1459348083, -1459348083, ContentScaleCompanionFillWidth1.write(), new Object[]{this});
        r8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8();
        RemoteActionCompatParcelizer(ActivityHandler.AnonymousClass45.read(), ContentScaleCompanionFillWidth1.write(), ContentScaleCompanionFillWidth1.write(), -940486890, 940486896, ActivityHandler.AnonymousClass45.read(), new Object[]{this});
    }

    public void RemoteActionCompatParcelizer(getPrimaryDirectionalMotionAxisnZO2Niw getprimarydirectionalmotionaxisnzo2niw) {
        int i = 2 % 2;
        getSTYLEABLE_VECTOR_DRAWABLE_PATH_FILL_ALPHA getstyleable_vector_drawable_path_fill_alpha = (getSTYLEABLE_VECTOR_DRAWABLE_PATH_FILL_ALPHA) getprimarydirectionalmotionaxisnzo2niw;
        getstyleable_vector_drawable_path_fill_alpha.getClass();
        getYnZO2Niw getynzo2niw = new getYnZO2Niw();
        getSTYLEABLE_VECTOR_DRAWABLE_GROUP_ROTATION getstyleable_vector_drawable_group_rotation = getstyleable_vector_drawable_path_fill_alpha.IconCompatParcelizer;
        getynzo2niw.MediaSessionCompatToken = getstyleable_vector_drawable_group_rotation.MediaDescriptionCompat();
        getynzo2niw.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY = new getKeyboardTap5zf0vsI(getstyleable_vector_drawable_group_rotation.r8lambdag6d1IyBXWIL5aeSAzXsZMVuYCQs);
        getynzo2niw.RatingCompat = (DialogMessageRequestProxy) getstyleable_vector_drawable_group_rotation.MutatorMutexmutate2.write();
        getynzo2niw.ParcelableVolumeInfo = getstyleable_vector_drawable_group_rotation.getLastCustomNonConfigurationInstance();
        ((MvvmActivity) this).MediaDescriptionCompat = getynzo2niw;
        this.r8lambdag6d1IyBXWIL5aeSAzXsZMVuYCQs = (emitcomroadrunnerdeliveryapisChatDeliveryRepositoryImplobserveCustomerChatStateinlinedexternalComponent12) getstyleable_vector_drawable_path_fill_alpha.read.write;
        Gen2FunWithFlagsConfigRepository gen2FunWithFlagsConfigRepository = (Gen2FunWithFlagsConfigRepository) getstyleable_vector_drawable_group_rotation.ScrollableNode.write();
        gen2FunWithFlagsConfigRepository.getClass();
        this.r8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8 = new prepareCallInternal(gen2FunWithFlagsConfigRepository);
        this.ensureViewModelStore = new r8lambdauDhHXlIoLpU0HpCcQH6vOsKpNY(getstyleable_vector_drawable_path_fill_alpha.PlaybackStateCompat);
        this.PlaybackStateCompatCustomAction = new r8lambdauDhHXlIoLpU0HpCcQH6vOsKpNY(getstyleable_vector_drawable_path_fill_alpha.RemoteActionCompatParcelizer);
        CustomerChatCommunicatorImpl customerChatCommunicatorImpl = (CustomerChatCommunicatorImpl) getstyleable_vector_drawable_group_rotation.onPostCreate.write();
        customerChatCommunicatorImpl.getClass();
        int iIconCompatParcelizer = n5.IconCompatParcelizer();
        int iIconCompatParcelizer2 = n5.IconCompatParcelizer();
        this.defaultViewModelProviderFactory_delegatelambda0 = new IndirectPointerEventType(customerChatCommunicatorImpl, new getGestureThresholdActivate5zf0vsI((getGestureEnd5zf0vsI) getSTYLEABLE_VECTOR_DRAWABLE_GROUP_ROTATION.read(246983860, new Object[]{getstyleable_vector_drawable_group_rotation}, n5.IconCompatParcelizer(), -246983855, iIconCompatParcelizer, n5.IconCompatParcelizer(), iIconCompatParcelizer2)));
        this.addObserverForBackInvokerlambda0 = (MainPresenter) getstyleable_vector_drawable_path_fill_alpha.PlaybackStateCompatCustomAction.write();
        this.MediaSessionCompatToken = (getNonenZO2Niw) getstyleable_vector_drawable_path_fill_alpha.MediaSessionCompatQueueItem.write();
        getSTYLEABLE_VECTOR_DRAWABLE_WIDTH getstyleable_vector_drawable_width = new getSTYLEABLE_VECTOR_DRAWABLE_WIDTH((setTransactionSuccessful) getstyleable_vector_drawable_group_rotation.toClipEntry.write(), new SemanticsInfoKt((setTransactionSuccessful) getstyleable_vector_drawable_group_rotation.toClipEntry.write(), new setTransacterruntime(new RectManager(getColorIntegerOrNull.serializer(getstyleable_vector_drawable_group_rotation.onContentChanged))), (setVerticalStyle) getstyleable_vector_drawable_group_rotation.getActionBarHideOffset.write()));
        CardView$1 cardView$1 = getstyleable_vector_drawable_path_fill_alpha.serializer;
        this.r8lambdaXj9c8VIP9DfEvaTmZt0ejAuC4a4 = new XmlVectorParser_androidKt(getstyleable_vector_drawable_width, new CardView$1(new Extras$Key((div7Ah8Wj8) cardView$1.RemoteActionCompatParcelizer), 19, new MemoryCacheService((ImageLoader$Builder$$ExternalSyntheticLambda1) cardView$1.IconCompatParcelizer)));
        int iIconCompatParcelizer3 = n5.IconCompatParcelizer();
        int iIconCompatParcelizer4 = n5.IconCompatParcelizer();
        this.r8lambda54BeH8ZsBru0CXI2CCSP2syNys = new DispatcherChatOrderLogger((getGestureEnd5zf0vsI) getSTYLEABLE_VECTOR_DRAWABLE_GROUP_ROTATION.read(246983860, new Object[]{getstyleable_vector_drawable_group_rotation}, n5.IconCompatParcelizer(), -246983855, iIconCompatParcelizer3, n5.IconCompatParcelizer(), iIconCompatParcelizer4), new PlaybackStateCompatCustomAction(7), (getNeedsDensityui_text) getstyleable_vector_drawable_group_rotation.EncodeException.write(), new inCompatibilityMode());
        int iIconCompatParcelizer5 = n5.IconCompatParcelizer();
        int iIconCompatParcelizer6 = n5.IconCompatParcelizer();
        zzz zzzVar = (zzz) getSTYLEABLE_VECTOR_DRAWABLE_GROUP_ROTATION.read(-411146129, new Object[]{getstyleable_vector_drawable_group_rotation}, n5.IconCompatParcelizer(), 411146146, iIconCompatParcelizer5, n5.IconCompatParcelizer(), iIconCompatParcelizer6);
        int iIconCompatParcelizer7 = n5.IconCompatParcelizer();
        int iIconCompatParcelizer8 = n5.IconCompatParcelizer();
        this.ParcelableVolumeInfo = new r8lambda2fbYAoOOcVqhXQP2NIm5pmOCD5w(zzzVar, new CreateHomeScope((zzz) getSTYLEABLE_VECTOR_DRAWABLE_GROUP_ROTATION.read(-411146129, new Object[]{getstyleable_vector_drawable_group_rotation}, n5.IconCompatParcelizer(), 411146146, iIconCompatParcelizer7, n5.IconCompatParcelizer(), iIconCompatParcelizer8)));
        this._init_lambda1 = (r8lambda97B6Pg2rSmZnc05L6A5yZDJRg) getstyleable_vector_drawable_path_fill_alpha.ParcelableVolumeInfo.write();
        getSTYLEABLE_VECTOR_DRAWABLE_GROUP_TRANSLATE_X getstyleable_vector_drawable_group_translate_x = getstyleable_vector_drawable_group_rotation._init_lambda2;
        getSTYLEABLE_VECTOR_DRAWABLE_GROUP_ROTATION getstyleable_vector_drawable_group_rotation2 = getstyleable_vector_drawable_group_translate_x.write;
        this.fullyDrawnReporter_delegatelambda00 = new ComponentRegistry$Builder((r8lambdazJ_is40ErW_0zWXIHU0U2X8pyMM) getstyleable_vector_drawable_group_rotation2.MeasuredPage.write(), new r8lambdaguMkB96aaxyAGqCnh2xMDXoFAs((decode) getstyleable_vector_drawable_group_rotation2.setItemInvoker.write(), (QualtricsManagerImpl) getstyleable_vector_drawable_group_rotation2.accessprocessDragStart.write()), new SaveHeatmapUrlImpl((SideMenuRepository) getstyleable_vector_drawable_group_rotation2.LazyLayoutPagerKt.write()), (r8lambdax3lltCpD3rATxa4vQpnFaaGbzP4) getstyleable_vector_drawable_group_rotation2.execute.write(), (accessgetSdkEnablementProvidercp) getstyleable_vector_drawable_group_rotation2.PagereLwUrMk.write());
        this.addObserverForBackInvoker = (IndirectPointerEvent) getstyleable_vector_drawable_path_fill_alpha.write.write;
        this.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus = (IndirectPointerEventeAXfkT4default) getstyleable_vector_drawable_path_fill_alpha.MediaBrowserCompatMediaItem.write;
        this._init_lambda4 = (getDefaulteUduSuoannotations) getstyleable_vector_drawable_group_translate_x.r8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss.write;
        this.onBackPressedDispatcher_delegatelambda010 = getstyleable_vector_drawable_group_translate_x.IconCompatParcelizer();
        this.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg = (setLayoutTransition) getstyleable_vector_drawable_group_translate_x.r8lambdavCwjfXDiSGcirCy4I008VOiJ_lw.write;
        this.r8lambdavCwjfXDiSGcirCy4I008VOiJ_lw = (r8lambda6p7U4OWYA8jlHo6PgwNWEvZb01M) getstyleable_vector_drawable_path_fill_alpha.MediaMetadataCompat.write;
        getSTYLEABLE_VECTOR_DRAWABLE_GROUP_ROTATION getstyleable_vector_drawable_group_rotation3 = getstyleable_vector_drawable_group_translate_x.write;
        this.r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28 = new Worker(getstyleable_vector_drawable_group_rotation3.ComponentActivity(), (r8lambdadiHCtAejt895m8HzbAibmUGZMKo) getstyleable_vector_drawable_group_translate_x.onBackPressedInput_delegatelambda0.write(), (getTouchaOaMEAU) getstyleable_vector_drawable_group_rotation3.updateWko1d7g.write(), (transferSessionPackageI) getstyleable_vector_drawable_group_rotation3.Contentfoundation.write());
        this.accessensureViewModelStore = (invokeSuspendcomroadrunnerrrdscomposecomponenttooltipTooltipKtTooltip31) getstyleable_vector_drawable_group_translate_x.getFullyDrawnReporter.write();
        accessrequireViewFactoryHolder accessrequireviewfactoryholder = (accessrequireViewFactoryHolder) getstyleable_vector_drawable_group_rotation3.AndroidCursorHandle_androidKt.write();
        GetAcknowledgmentParamsImpl getAcknowledgmentParamsImpl = (GetAcknowledgmentParamsImpl) getstyleable_vector_drawable_group_translate_x._init_lambda2.write();
        androidx.work.impl.WorkManagerImpl workManagerImpl = (androidx.work.impl.WorkManagerImpl) getstyleable_vector_drawable_group_rotation3.tryAwaitRelease.write();
        MediaBrowserCompatMediaItem mediaBrowserCompatMediaItem = new MediaBrowserCompatMediaItem(5);
        transferSessionPackageI transfersessionpackagei = (transferSessionPackageI) getstyleable_vector_drawable_group_rotation3.Contentfoundation.write();
        accessrequireviewfactoryholder.getClass();
        getAcknowledgmentParamsImpl.getClass();
        workManagerImpl.getClass();
        transfersessionpackagei.getClass();
        this.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY = new UrlAnnotationSaverlambda0(new MetricsBatchProcessor(accessrequireviewfactoryholder, getAcknowledgmentParamsImpl, workManagerImpl, mediaBrowserCompatMediaItem, new StateV3$$ExternalSyntheticLambda0(15), transfersessionpackagei), new inCompatibilityMode());
        this._init_lambda3 = new isAttachedToWindow(getstyleable_vector_drawable_group_rotation.MediaSessionCompatQueueItem());
        int iIconCompatParcelizer9 = n5.IconCompatParcelizer();
        int iIconCompatParcelizer10 = n5.IconCompatParcelizer();
        int i2 = 26;
        this.getOnBackPressedInput = new SaveHeatmapUrlImpl(i2, new getGestureThresholdActivate5zf0vsI((getGestureEnd5zf0vsI) getSTYLEABLE_VECTOR_DRAWABLE_GROUP_ROTATION.read(246983860, new Object[]{getstyleable_vector_drawable_group_rotation3}, n5.IconCompatParcelizer(), -246983855, iIconCompatParcelizer9, n5.IconCompatParcelizer(), iIconCompatParcelizer10)));
        this.MediaSessionCompatQueueItem = (getImeAction) getstyleable_vector_drawable_group_translate_x.r8lambdawJ5MHcSJed_CjC7r4OWD0UxyJsQ.write;
        int iIconCompatParcelizer11 = n5.IconCompatParcelizer();
        int iIconCompatParcelizer12 = n5.IconCompatParcelizer();
        this.menuHostHelperlambda0 = (TraceTimeMeasurementWithPerformanceKit) getSTYLEABLE_VECTOR_DRAWABLE_GROUP_ROTATION.read(1568881057, new Object[]{getstyleable_vector_drawable_group_rotation}, n5.IconCompatParcelizer(), -1568881038, iIconCompatParcelizer11, n5.IconCompatParcelizer(), iIconCompatParcelizer12);
        this.getSavedStateRegistryControllerannotations = new CreateHomeScope(new setMinHeight((QualtricsManagerImpl) getstyleable_vector_drawable_group_rotation3.accessprocessDragStart.write()));
        this.ComponentActivity = new Util((transferSessionPackageI) getstyleable_vector_drawable_group_rotation3.Contentfoundation.write(), getstyleable_vector_drawable_group_rotation3.getDefaultViewModelCreationExtras$4f27e7f7(), new RiderSupportRootedCheckImpl(getstyleable_vector_drawable_group_rotation3.getDefaultViewModelCreationExtras$4f27e7f7(), new GetCourierStatusUseCaseImpl(new GetRiderStateImpl(new GetCourierShiftInfoImpl(new GetShiftInfoImpl(getColorIntegerOrNull.serializer(getstyleable_vector_drawable_group_rotation3.sendDragEventEu1f8Dk), new Path$Companion(), new inCompatibilityMode()), new AndroidUiFrameClock(), new inCompatibilityMode()), new inCompatibilityMode(), getstyleable_vector_drawable_group_rotation3.ComponentActivity()), new accessisMainThread())));
        VerificationStatusRepository verificationStatusRepository = (VerificationStatusRepository) getstyleable_vector_drawable_group_rotation3.touchSelectionFirstPress.write();
        ImageHeaderParserImageType imageHeaderParserImageType = new ImageHeaderParserImageType();
        transferSessionPackageI transfersessionpackagei2 = (transferSessionPackageI) getstyleable_vector_drawable_group_rotation3.Contentfoundation.write();
        Clock clockSystemUTC = Clock.systemUTC();
        clockSystemUTC.getClass();
        this.onBackPressedDispatcher_delegatelambda00 = new CallTracer(verificationStatusRepository, imageHeaderParserImageType, transfersessionpackagei2, clockSystemUTC);
        this.ResultReceiver = getstyleable_vector_drawable_group_rotation.PlaybackStateCompat();
        this.MediaSessionCompatResultReceiverWrapper = (getLinear4e0Vf04) getstyleable_vector_drawable_group_translate_x.serializer.write();
        this.MediaBrowserCompatMediaItem = new subscribeToContentCardsUpdateslambda0((DefaultBackgroundSoundManager) getstyleable_vector_drawable_group_rotation.AppCompatViewInflater.write(), new subscribeToNetworkFailureslambda0((transferSessionPackageI) getstyleable_vector_drawable_group_rotation.Contentfoundation.write()));
        this.RatingCompat = (SemanticsOwnerKt) getstyleable_vector_drawable_group_rotation.r8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8.write();
        this._init_lambda2 = (r8lambdatahictpR_RFQlQiXpQeJqGuk8B8) getstyleable_vector_drawable_group_translate_x.onBackPressedDispatcher_delegatelambda0.write();
        this.r8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss = (transferSessionPackageI) getstyleable_vector_drawable_group_rotation.Contentfoundation.write();
        int i3 = onBackPressedInput_delegatelambda0 + 87;
        addOnMultiWindowModeChangedListener = i3 % Fields.SpotShadowColor;
        if (i3 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // com.foodora.courier.base.presentation.BaseInjectingMvvmActivity
    public /* synthetic */ void IconCompatParcelizer(getPrimaryDirectionalMotionAxisnZO2Niw getprimarydirectionalmotionaxisnzo2niw) {
        int i = 2 % 2;
        int i2 = onBackPressedInput_delegatelambda0 + 107;
        addOnMultiWindowModeChangedListener = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        RemoteActionCompatParcelizer(getprimarydirectionalmotionaxisnzo2niw);
        int i4 = addOnMultiWindowModeChangedListener + 117;
        onBackPressedInput_delegatelambda0 = i4 % Fields.SpotShadowColor;
        int i5 = i4 % 2;
    }

    @Override // com.foodora.courier.base.presentation.BaseInjectingMvvmActivity, com.foodora.courier.base.presentation.MvvmActivity, com.foodora.courier.base.presentation.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public void attachBaseContext(Context context) {
        super.attachBaseContext(context);
    }

    private void serializer(Boolean bool) {
        RemoteActionCompatParcelizer(ContentScaleCompanionFillWidth1.write(), ContentScaleCompanionFillWidth1.write(), ContentScaleCompanionFillWidth1.write(), -388594738, 388594739, ContentScaleCompanionFillWidth1.write(), new Object[]{this, bool});
    }

    private void r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg() {
        RemoteActionCompatParcelizer(ActivityHandler.AnonymousClass45.read(), ContentScaleCompanionFillWidth1.write(), ContentScaleCompanionFillWidth1.write(), -940486890, 940486896, ActivityHandler.AnonymousClass45.read(), new Object[]{this});
    }

    private void r8lambdaXj9c8VIP9DfEvaTmZt0ejAuC4a4() {
        RemoteActionCompatParcelizer(ActivityHandler.AnonymousClass45.read(), ActivityHandler.AnonymousClass45.read(), ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.delivery_items_title_count_single).substring(0, 4).length() + 453211894, 1562590161, -1562590158, ContentScaleCompanionFillWidth1.write(), new Object[]{this});
    }

    private static Void serializer(setOnApplyWindowInsetsListener setonapplywindowinsetslistener) {
        return (Void) RemoteActionCompatParcelizer(ContentScaleCompanionFillWidth1.write(), ContentScaleCompanionFillWidth1.write(), ContentScaleCompanionFillWidth1.write(), -1237701566, 1237701570, ContentScaleCompanionFillWidth1.write(), new Object[]{setonapplywindowinsetslistener});
    }

    private /* synthetic */ void read(createFromParcel createfromparcel) {
        RemoteActionCompatParcelizer(ContentScaleCompanionFillWidth1.write(), ContentScaleCompanionFillWidth1.write(), ContentScaleCompanionFillWidth1.write(), -1032826155, 1032826157, ContentScaleCompanionFillWidth1.write(), new Object[]{this, createfromparcel});
    }

    private emitcomroadrunnerdeliveryanalyticsStateV3AnalyticsProviderImplspecialinlinedmap12 read(getBitmapui_graphics getbitmapui_graphics) {
        return (emitcomroadrunnerdeliveryanalyticsStateV3AnalyticsProviderImplspecialinlinedmap12) RemoteActionCompatParcelizer(ContentScaleCompanionFillWidth1.write(), ContentScaleCompanionFillWidth1.write(), ContentScaleCompanionFillWidth1.write(), 1772721173, -1772721166, ContentScaleCompanionFillWidth1.write(), new Object[]{this, getbitmapui_graphics});
    }

    private void PlaybackStateCompat() {
        RemoteActionCompatParcelizer(ActivityHandler.AnonymousClass45.read(), ActivityHandler.AnonymousClass45.read(), ActivityHandler.AnonymousClass45.read(), 1459348083, -1459348083, ContentScaleCompanionFillWidth1.write(), new Object[]{this});
    }

    public static /* synthetic */ emitcomroadrunnerdeliveryanalyticsStateV3AnalyticsProviderImplspecialinlinedmap12 IconCompatParcelizer(MainActivity mainActivity, getBitmapui_graphics getbitmapui_graphics) {
        return (emitcomroadrunnerdeliveryanalyticsStateV3AnalyticsProviderImplspecialinlinedmap12) RemoteActionCompatParcelizer(ContentScaleCompanionFillWidth1.write(), ContentScaleCompanionFillWidth1.write(), ContentScaleCompanionFillWidth1.write(), 16639510, -16639505, ContentScaleCompanionFillWidth1.write(), new Object[]{mainActivity, getbitmapui_graphics});
    }
}
