package io.sentry;

import androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat;
import com.deliveryhero.fwf_customer_profile.util.ConstantsKt;
import com.deliveryhero.fwf_http.ConstantKt;
import com.google.android.gms.location.DeviceOrientationRequest;
import io.grpc.internal.CallTracer;
import io.sentry.android.core.ActivityLifecycleIntegration$$ExternalSyntheticLambda1;
import io.sentry.backpressure.serializer;
import io.sentry.backpressure.write;
import io.sentry.compose.viewhierarchy.ComposeViewHierarchyExporter;
import io.sentry.internal.gestures.read;
import io.sentry.internal.modules.RemoteActionCompatParcelizer;
import io.sentry.logger.MediaSessionCompatQueueItem;
import io.sentry.protocol.r8lambdaXj9c8VIP9DfEvaTmZt0ejAuC4a4;
import io.sentry.transport.MediaMetadataCompat;
import io.sentry.transport.ParcelableVolumeInfo;
import io.sentry.transport.RatingCompat;
import io.sentry.util.MediaBrowserCompatMediaItem;
import io.sentry.util.PlaybackStateCompatCustomAction;
import io.sentry.util.r8lambda54BeH8ZsBru0CXI2CCSP2syNys;
import io.sentry.util.thread.IconCompatParcelizer;
import java.io.File;
import java.lang.reflect.InvocationTargetException;
import java.math.BigInteger;
import java.nio.charset.Charset;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.CopyOnWriteArraySet;
import javax.net.ssl.SSLSocketFactory;
import kotlin.text.RegexKt;
import o.BannerJavascriptInterfaceExternalSyntheticLambda5;
import o.BannerJavascriptInterfacerequestPushPermission2;
import o.BannerUserJavascriptInterface;
import o.BannerViewcreateBannerWebViewClientListener1;
import o.BaseBrazeActionStep;
import o.BaseBrazeActionStepCompanion;
import o.BrazeActionParserActionType;
import o.BrazeActionParserActionTypeCompanion;
import o.BrazeActionParserExternalSyntheticLambda0;
import o.BrazeActionUtilsWhenMappings;
import o.ContainerStep;
import o.ContainerStepgetChildStepIteratorinlinediterator1;
import o.ContainerStepgetChildStepIteratorinlinediterator2;
import o.DefaultBannerWebViewClientListener;
import o.DefaultBannerWebViewClientListenerCompanion;
import o.DrawableTransformation;
import o.ImageHeaderParserImageType;
import o.LogCustomEventStep;
import o.PendingBannerDismissSnapshot;
import o.StepData;
import o.StepDataargs_delegatelambda0inlinediterator1;
import o.UriActionExternalSyntheticLambda4;
import o.beforeMessageClosed;
import o.coerceArgToPropertiesOrNull;
import o.containsInvalidBrazeAction;
import o.dismisslambda0;
import o.doAnyTypesMatch;
import o.executelambda3;
import o.firstArg_delegatelambda0;
import o.formatQueryBundleForLog;
import o.fromNullableFields;
import o.getActionTypelambda0;
import o.getAllBrazeActionStepTypes;
import o.getArgandroid_sdk_ui_release;
import o.getBrazeActionVersionAndJsonlambda1;
import o.getFirstArg;
import o.getImpl;
import o.getOnDismissCallback;
import o.getSetHeightCallback;
import o.getUser;
import o.handleCardClicklambda3;
import o.isArgCountInBounds;
import o.isArgCountInBoundsdefault;
import o.isArgCountInBoundslambda0;
import o.isMainThread;
import o.logHtmlClick;
import o.onCustomEventActionlambda0;
import o.onErrorlambda0;
import o.onOtherUrlAction;
import o.onOtherUrlActionlambda0;
import o.openUriWithActionView;
import o.parseUseWebViewFromQueryBundle;
import o.parseandroid_sdk_ui_release;
import o.r8lambda76J5CE7m9NRYvepl6xiAjQisQQ;
import o.r8lambdaBPMX2XV1WY9UhXD0vbiIsQjvro;
import o.r8lambdaC65AgNYjlXsuFXOhYux3_Qwhdc4;
import o.r8lambdaL32xCEzW71g2Xzeh1NM3NImxco;
import o.r8lambdaOvKN5euqH6Ij7OM19FiXA03UYH4;
import o.r8lambdaPVfdc4_JcrwE1K_cENW3pfSaRKU;
import o.r8lambdaXHNag9bp7vYEr8vc9J2vtoOxhLE;
import o.r8lambdaYUcla_T2qX_wkQ_VCWtu0Z3x1UI;
import o.r8lambdacR4TgcNFSm4F1F1Q1IGncB5Rik;
import o.r8lambdaea88sc6bNzdkREmuTaOF4vcCHI;
import o.r8lambdaltuDxAr7dAFDPcRiZGPl8tHLtE8;
import o.r8lambdamckPC49KvJ34IWnFVpGB9V0HXhE;
import o.r8lambdaoLSjZZF44WAcj26APhfSuFI7AQ;
import o.r8lambdatOXQQytFfRJJ1udVx34HO5buEo;
import o.r8lambdaxJfG46aOs8fDMxLv0xl_0gwVuI;
import o.r8lambdazCgP5h6gmY_4iWu5QdFkjTpdf20;
import o.r8lambdazcrctSUJRiG8aDijZ5sY7PjsT3o;
import o.runOnUserandroid_sdk_ui_release;
import o.runlambda1;
import o.setBannerHeight;
import o.setBannerHeightlambda1;
import retrofit2.OkHttpCall$1;

/* JADX INFO: loaded from: classes4.dex */
public class SentryOptions {
    static final r8lambdaL32xCEzW71g2Xzeh1NM3NImxco RemoteActionCompatParcelizer = r8lambdaL32xCEzW71g2Xzeh1NM3NImxco.DEBUG;
    private onOtherUrlActionlambda0 ActivityResult;
    private onErrorlambda0 BackHandlerKtExternalSyntheticLambda1;
    private parseandroid_sdk_ui_release ComponentActivity;
    private boolean ComponentDialog;
    private String ComponentDialogExternalSyntheticLambda0;
    private MediaMetadataCompat ComposePredictiveBackHandlerlaunchNewGesture11;
    private final io.sentry.util.MediaMetadataCompat EdgeToEdgeExternalSyntheticLambda0;
    private boolean IconCompatParcelizer;
    private serializer MediaBrowserCompatMediaItem;
    private boolean MediaDescriptionCompat;
    private setBannerHeightlambda1 MediaMetadataCompat;
    private getSetHeightCallback MediaSessionCompatQueueItem;
    private BannerUserJavascriptInterface MediaSessionCompatToken;
    private long OnBackPressedCallback;
    private boolean OnBackPressedDispatcherOnBackPressedEventInputExternalSyntheticLambda0;
    private boolean ParcelableVolumeInfo;
    private String PlaybackStateCompat;
    private openUriWithActionView PlaybackStateCompatCustomAction;
    private r8lambdamckPC49KvJ34IWnFVpGB9V0HXhE PredictiveBackHandlerKtPredictiveBackHandlerlambda30inlinedonStopOrDispose1;
    private getSetHeightCallback RatingCompat;
    private getImpl ResultReceiver;
    private IconCompatParcelizer SystemBarStyleCompanion;
    private BrazeActionParserActionTypeCompanion _init_lambda1;
    private boolean _init_lambda2;
    private String _init_lambda3;
    private String _init_lambda4;
    private boolean accessensureViewModelStore;
    private parseUseWebViewFromQueryBundle addCloseableactivity;
    private boolean addContentView;
    private boolean addObserverForBackInvoker;
    private boolean addObserverForBackInvokerlambda0;
    private BrazeActionUtilsWhenMappings addOnConfigurationChangedListener;
    private final io.sentry.util.MediaMetadataCompat addOnContextAvailableListener;
    private io.sentry.cache.serializer addOnMultiWindowModeChangedListener;
    private String addOnNewIntentListener;
    private final executelambda3 addOnPictureInPictureModeChangedListener;
    private BrazeActionParserExternalSyntheticLambda0 addOnPictureInPictureUiStateChangedListener;
    private PendingBannerDismissSnapshot addOnTrimMemoryListener;
    private boolean createFullyDrawnExecutor;
    private boolean defaultViewModelProviderFactory_delegatelambda0;
    private boolean ensureViewModelStore;
    private boolean enterPictureInPictureMode;
    private boolean fullyDrawnReporter_delegatelambda0;
    private boolean fullyDrawnReporter_delegatelambda00;
    private Long getActivityResultRegistry;
    private Boolean getDefaultViewModelCreationExtras;
    private getActionTypelambda0 getDefaultViewModelProviderFactory;
    private final List<read> getFullyDrawnReporter;
    private List<String> getIndexOfFirstFeature;
    private List<getBrazeActionVersionAndJsonlambda1> getLastCustomNonConfigurationInstance;
    private fromNullableFields getLifecycleRegistry1;
    private final List<String> getNavigationEventDispatcher;
    private io.sentry.util.runtime.IconCompatParcelizer getOnBackPressedDispatcherannotations;
    private boolean getOnBackPressedInput;
    private List<getBrazeActionVersionAndJsonlambda1> getSavedStateRegistry;
    private boolean getSavedStateRegistryControllerannotations;
    private List<getBrazeActionVersionAndJsonlambda1> getViewModelStore;
    private final Map<String, String> handleOnBackPressed;
    private SSLSocketFactory handleOnBackProgressed;
    private runOnUserandroid_sdk_ui_release handleOnBackStarted;
    private ContainerStepgetChildStepIteratorinlinediterator2 initializeViewTreeOwners;
    private volatile handleCardClicklambda3 invalidateMenu;
    private boolean invoke;
    private ContainerStep invokeSuspend;
    private boolean isEnabled;
    private boolean menuHostHelperlambda0;
    private ContainerStepgetChildStepIteratorinlinediterator1 onBackPressed;
    private boolean onBackPressedDispatcher_delegatelambda0;
    private boolean onBackPressedDispatcher_delegatelambda00;
    private boolean onBackPressedDispatcher_delegatelambda010;
    private boolean onBackPressedInput_delegatelambda0;
    private final List<String> onConfigurationChanged;
    private long onCreate;
    private BrazeActionParserExternalSyntheticLambda0 onCreatePanelMenu;
    private int onMenuItemSelected;
    private int onMultiWindowModeChanged;
    private DefaultBannerWebViewClientListener onNewIntent;
    private int onPanelClosed;
    private onOtherUrlAction onPictureInPictureModeChanged;
    private int onPictureInPictureUiStateChanged;
    private int onPreparePanel;
    private int onRequestPermissionsResult;
    private logHtmlClick onRetainCustomNonConfigurationInstance;
    private long onRetainNonConfigurationInstance;
    private beforeMessageClosed onSaveInstanceState;
    private String onStart;
    private boolean onStop;
    private final List<r8lambdatOXQQytFfRJJ1udVx34HO5buEo> onTrimMemory;
    private RemoteActionCompatParcelizer onUserLeaveHint;
    private final List<getAllBrazeActionStepTypes> peekAvailableContext;
    private final List<String> r8lambda54BeH8ZsBru0CXI2CCSP2syNys;
    private int r8lambda7IJBVrN0sHyidCAZufWEJFc7yY;
    private BannerJavascriptInterfaceExternalSyntheticLambda5 r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus;
    private boolean r8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss;
    private long r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg;
    private final List<ComposeViewHierarchyExporter> r8lambdaTWvtyPFkiHdx0RbtWVLevVLT0;
    private final io.sentry.util.MediaMetadataCompat r8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8;
    private io.sentry.internal.debugmeta.read r8lambdaXj9c8VIP9DfEvaTmZt0ejAuC4a4;
    private Double r8lambdaXxpmZzi8FNPM2sJJA30VCt2mBcQ;
    private r8lambdacR4TgcNFSm4F1F1Q1IGncB5Rik r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM;
    private String r8lambdag6d1IyBXWIL5aeSAzXsZMVuYCQs;
    private final List<String> r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28;
    private setBannerHeight r8lambdavCwjfXDiSGcirCy4I008VOiJ_lw;
    private r8lambdaL32xCEzW71g2Xzeh1NM3NImxco r8lambdawJ5MHcSJed_CjC7r4OWD0UxyJsQ;
    private String r8lambdayPQlaAoRiYRJ3IY_TqzUUTrVH0;
    private boolean read;
    private String remove;
    private boolean removeCloseableactivity;
    private final List<containsInvalidBrazeAction> removeMenuProvider;
    private boolean removeOnConfigurationChangedListener;
    private StepDataargs_delegatelambda0inlinediterator1 removeOnContextAvailableListener;
    private String removeOnMultiWindowModeChangedListener;
    private Double removeOnNewIntentListener;
    private doAnyTypesMatch removeOnPictureInPictureModeChangedListener;
    private int removeOnPictureInPictureUiStateChangedListener;
    private Double removeOnTrimMemoryListener;
    private boolean removeOnUserLeaveHintListener;
    private int reportFullyDrawn;
    private BaseBrazeActionStepCompanion run;
    io.sentry.clientreport.IconCompatParcelizer serializer;
    private String setContentView;
    private Double setEnabled;
    private r8lambdaoLSjZZF44WAcj26APhfSuFI7AQ setPictureInPictureParams;
    private String startActivityForResult;
    private r8lambdaXj9c8VIP9DfEvaTmZt0ejAuC4a4 startIntentSenderForResult;
    protected final io.sentry.util.RemoteActionCompatParcelizer write;
    private final List<r8lambdaxJfG46aOs8fDMxLv0xl_0gwVuI> addMenuProvider = new CopyOnWriteArrayList();
    private final Set<Class<? extends Throwable>> getLifecycle = new CopyOnWriteArraySet();
    private List<getBrazeActionVersionAndJsonlambda1> getOnBackPressedDispatcher = null;
    private final List<LogCustomEventStep> onActivityResult = new CopyOnWriteArrayList();
    private final Set<String> MediaSessionCompatResultReceiverWrapper = new CopyOnWriteArraySet();
    private final io.sentry.util.MediaMetadataCompat registerForActivityResult = new io.sentry.util.MediaMetadataCompat(new SentryOptions$$ExternalSyntheticLambda0(this, 0));
    private long handleOnBackCancelled = ConstantKt.DEFAULT_REQUEST_TIMEOUT;
    private long addOnUserLeaveHintListener = 15000;
    private long createNavigationEventHandleractivity = 15000;

    public serializer getBackpressureMonitor() {
        return this.MediaBrowserCompatMediaItem;
    }

    public setBannerHeightlambda1 getBeforeBreadcrumb() {
        return this.MediaMetadataCompat;
    }

    public getUser getBeforeEnvelopeCallback() {
        return null;
    }

    public getSetHeightCallback getBeforeSend() {
        return this.RatingCompat;
    }

    public getSetHeightCallback getBeforeSendFeedback() {
        return this.MediaSessionCompatQueueItem;
    }

    public BannerJavascriptInterfacerequestPushPermission2 getBeforeSendReplay() {
        return null;
    }

    public BannerUserJavascriptInterface getBeforeSendTransaction() {
        return this.MediaSessionCompatToken;
    }

    public Set<String> getBundleIds() {
        return this.MediaSessionCompatResultReceiverWrapper;
    }

    public io.sentry.clientreport.IconCompatParcelizer getClientReportRecorder() {
        return this.serializer;
    }

    public openUriWithActionView getCompositePerformanceCollector() {
        return this.PlaybackStateCompatCustomAction;
    }

    public parseandroid_sdk_ui_release getConnectionStatusProvider() {
        return this.ComponentActivity;
    }

    public int getConnectionTimeoutMillis() {
        return this.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY;
    }

    public List<String> getContextTags() {
        return this.r8lambda54BeH8ZsBru0CXI2CCSP2syNys;
    }

    public getImpl getContinuousProfiler() {
        return this.ResultReceiver;
    }

    public BannerJavascriptInterfaceExternalSyntheticLambda5 getCron() {
        return this.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus;
    }

    public long getDeadlineTimeout() {
        return this.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg;
    }

    public io.sentry.internal.debugmeta.read getDebugMetaLoader() {
        return this.r8lambdaXj9c8VIP9DfEvaTmZt0ejAuC4a4;
    }

    public r8lambdacR4TgcNFSm4F1F1Q1IGncB5Rik getDefaultScopeType() {
        return this.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM;
    }

    public r8lambdaL32xCEzW71g2Xzeh1NM3NImxco getDiagnosticLevel() {
        return this.r8lambdawJ5MHcSJed_CjC7r4OWD0UxyJsQ;
    }

    public String getDist() {
        return this.r8lambdag6d1IyBXWIL5aeSAzXsZMVuYCQs;
    }

    public String getDistinctId() {
        return this.r8lambdayPQlaAoRiYRJ3IY_TqzUUTrVH0;
    }

    public setBannerHeight getDistribution() {
        return this.r8lambdavCwjfXDiSGcirCy4I008VOiJ_lw;
    }

    public BrazeActionParserActionTypeCompanion getDistributionController() {
        return this._init_lambda1;
    }

    public String getDsn() {
        return this._init_lambda3;
    }

    public io.sentry.cache.serializer getEnvelopeDiskCache() {
        return this.addOnMultiWindowModeChangedListener;
    }

    public List<r8lambdaxJfG46aOs8fDMxLv0xl_0gwVuI> getEventProcessors() {
        return this.addMenuProvider;
    }

    public BrazeActionUtilsWhenMappings getExecutorService() {
        return this.addOnConfigurationChangedListener;
    }

    public executelambda3 getExperimental() {
        return this.addOnPictureInPictureModeChangedListener;
    }

    public BrazeActionParserExternalSyntheticLambda0 getFatalLogger() {
        return this.addOnPictureInPictureUiStateChangedListener;
    }

    public PendingBannerDismissSnapshot getFeedbackOptions() {
        return this.addOnTrimMemoryListener;
    }

    public long getFlushTimeoutMillis() {
        return this.addOnUserLeaveHintListener;
    }

    public getActionTypelambda0 getFullyDisplayedReporter() {
        return this.getDefaultViewModelProviderFactory;
    }

    public List<read> getGestureTargetLocators() {
        return this.getFullyDrawnReporter;
    }

    public Long getIdleTimeout() {
        return this.getActivityResultRegistry;
    }

    public List<getBrazeActionVersionAndJsonlambda1> getIgnoredCheckIns() {
        return this.getLastCustomNonConfigurationInstance;
    }

    public List<getBrazeActionVersionAndJsonlambda1> getIgnoredErrors() {
        return this.getOnBackPressedDispatcher;
    }

    public Set<Class<? extends Throwable>> getIgnoredExceptionsForType() {
        return this.getLifecycle;
    }

    public List<getBrazeActionVersionAndJsonlambda1> getIgnoredSpanOrigins() {
        return this.getSavedStateRegistry;
    }

    public List<getBrazeActionVersionAndJsonlambda1> getIgnoredTransactions() {
        return this.getViewModelStore;
    }

    public List<String> getInAppExcludes() {
        return this.getNavigationEventDispatcher;
    }

    public List<String> getInAppIncludes() {
        return this.onConfigurationChanged;
    }

    public ContainerStepgetChildStepIteratorinlinediterator1 getInitPriority() {
        return this.onBackPressed;
    }

    public ContainerStepgetChildStepIteratorinlinediterator2 getInstrumenter() {
        return this.initializeViewTreeOwners;
    }

    public List<LogCustomEventStep> getIntegrations() {
        return this.onActivityResult;
    }

    public BrazeActionParserExternalSyntheticLambda0 getLogger() {
        return this.onCreatePanelMenu;
    }

    public DefaultBannerWebViewClientListener getLogs() {
        return this.onNewIntent;
    }

    public long getMaxAttachmentSize() {
        return this.onCreate;
    }

    public int getMaxBreadcrumbs() {
        return this.onMultiWindowModeChanged;
    }

    public int getMaxCacheItems() {
        return this.onMenuItemSelected;
    }

    public int getMaxDepth() {
        return this.onRequestPermissionsResult;
    }

    public int getMaxFeatureFlags() {
        return this.onPictureInPictureUiStateChanged;
    }

    public int getMaxQueueSize() {
        return this.onPreparePanel;
    }

    public onOtherUrlAction getMaxRequestBodySize() {
        return this.onPictureInPictureModeChanged;
    }

    public int getMaxSpans() {
        return this.onPanelClosed;
    }

    public long getMaxTraceFileSize() {
        return this.onRetainNonConfigurationInstance;
    }

    public logHtmlClick getMetrics() {
        return this.onRetainCustomNonConfigurationInstance;
    }

    public RemoteActionCompatParcelizer getModulesLoader() {
        return this.onUserLeaveHint;
    }

    public r8lambdaPVfdc4_JcrwE1K_cENW3pfSaRKU getOnDiscard() {
        return null;
    }

    public r8lambdaXHNag9bp7vYEr8vc9J2vtoOxhLE getOnOversizedEvent() {
        return null;
    }

    public beforeMessageClosed getOpenTelemetryMode() {
        return this.onSaveInstanceState;
    }

    public List<containsInvalidBrazeAction> getOptionsObservers() {
        return this.removeMenuProvider;
    }

    public List<getAllBrazeActionStepTypes> getPerformanceCollectors() {
        return this.peekAvailableContext;
    }

    public StepDataargs_delegatelambda0inlinediterator1 getProfileLifecycle() {
        return this.removeOnContextAvailableListener;
    }

    public Double getProfileSessionSampleRate() {
        return this.removeOnTrimMemoryListener;
    }

    public doAnyTypesMatch getProfilerConverter() {
        return this.removeOnPictureInPictureModeChangedListener;
    }

    public Double getProfilesSampleRate() {
        return this.removeOnNewIntentListener;
    }

    public onCustomEventActionlambda0 getProfilesSampler() {
        return null;
    }

    public int getProfilingTracesHz() {
        return this.removeOnPictureInPictureUiStateChangedListener;
    }

    public String getProguardUuid() {
        return this.setContentView;
    }

    public r8lambdaoLSjZZF44WAcj26APhfSuFI7AQ getProxy() {
        return this.setPictureInPictureParams;
    }

    public int getReadTimeoutMillis() {
        return this.reportFullyDrawn;
    }

    public String getRelease() {
        return this.startActivityForResult;
    }

    public fromNullableFields getReplayController() {
        return this.getLifecycleRegistry1;
    }

    public io.sentry.util.runtime.IconCompatParcelizer getRuntimeManager() {
        return this.getOnBackPressedDispatcherannotations;
    }

    public Double getSampleRate() {
        return this.r8lambdaXxpmZzi8FNPM2sJJA30VCt2mBcQ;
    }

    public List<r8lambdatOXQQytFfRJJ1udVx34HO5buEo> getScopeObservers() {
        return this.onTrimMemory;
    }

    public r8lambdaXj9c8VIP9DfEvaTmZt0ejAuC4a4 getSdkVersion() {
        return this.startIntentSenderForResult;
    }

    public String getSentryClientName() {
        return this.onStart;
    }

    public String getServerName() {
        return this.ComponentDialogExternalSyntheticLambda0;
    }

    public long getSessionFlushTimeoutMillis() {
        return this.createNavigationEventHandleractivity;
    }

    public parseUseWebViewFromQueryBundle getSessionReplay() {
        return this.addCloseableactivity;
    }

    public long getSessionTrackingIntervalMillis() {
        return this.OnBackPressedCallback;
    }

    public long getShutdownTimeoutMillis() {
        return this.handleOnBackCancelled;
    }

    public BaseBrazeActionStepCompanion getSocketTagger() {
        return this.run;
    }

    public runOnUserandroid_sdk_ui_release getSpanFactory() {
        return this.handleOnBackStarted;
    }

    public String getSpotlightConnectionUrl() {
        return this.remove;
    }

    public SSLSocketFactory getSslSocketFactory() {
        return this.handleOnBackProgressed;
    }

    public Map<String, String> getTags() {
        return this.handleOnBackPressed;
    }

    public IconCompatParcelizer getThreadChecker() {
        return this.SystemBarStyleCompanion;
    }

    public Double getTracesSampleRate() {
        return this.setEnabled;
    }

    public onOtherUrlActionlambda0 getTracesSampler() {
        return this.ActivityResult;
    }

    public ContainerStep getTransactionProfiler() {
        return this.invokeSuspend;
    }

    public r8lambdamckPC49KvJ34IWnFVpGB9V0HXhE getTransportFactory() {
        return this.PredictiveBackHandlerKtPredictiveBackHandlerlambda30inlinedonStopOrDispose1;
    }

    public MediaMetadataCompat getTransportGate() {
        return this.ComposePredictiveBackHandlerlaunchNewGesture11;
    }

    public onErrorlambda0 getVersionDetector() {
        return this.BackHandlerKtExternalSyntheticLambda1;
    }

    public final List<ComposeViewHierarchyExporter> getViewHierarchyExporters() {
        return this.r8lambdaTWvtyPFkiHdx0RbtWVLevVLT0;
    }

    public boolean isAttachServerName() {
        return this.read;
    }

    public boolean isAttachStacktrace() {
        return this.IconCompatParcelizer;
    }

    public boolean isAttachThreads() {
        return this.MediaDescriptionCompat;
    }

    public boolean isCaptureOpenTelemetryEvents() {
        return this.ParcelableVolumeInfo;
    }

    public boolean isDebug() {
        return this.r8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss;
    }

    public boolean isEnableAutoSessionTracking() {
        return this._init_lambda2;
    }

    public boolean isEnableBackpressureHandling() {
        return this.createFullyDrawnExecutor;
    }

    public boolean isEnableDatabaseTransactionTracing() {
        return this.defaultViewModelProviderFactory_delegatelambda0;
    }

    public boolean isEnableDeduplication() {
        return this.addObserverForBackInvoker;
    }

    public boolean isEnableEventSizeLimiting() {
        return this.ensureViewModelStore;
    }

    public boolean isEnableExternalConfiguration() {
        return this.addObserverForBackInvokerlambda0;
    }

    public boolean isEnablePrettySerializationOutput() {
        return this.fullyDrawnReporter_delegatelambda0;
    }

    public boolean isEnableScopePersistence() {
        return this.menuHostHelperlambda0;
    }

    public boolean isEnableScreenTracking() {
        return this.getOnBackPressedInput;
    }

    public boolean isEnableShutdownHook() {
        return this.fullyDrawnReporter_delegatelambda00;
    }

    public boolean isEnableSpotlight() {
        return this.getSavedStateRegistryControllerannotations;
    }

    public boolean isEnableTimeToFullDisplayTracing() {
        return this.onBackPressedInput_delegatelambda0;
    }

    public boolean isEnableUncaughtExceptionHandler() {
        return this.onBackPressedDispatcher_delegatelambda010;
    }

    public boolean isEnableUserInteractionBreadcrumbs() {
        return this.addContentView;
    }

    public boolean isEnableUserInteractionTracing() {
        return this.onBackPressedDispatcher_delegatelambda0;
    }

    public boolean isEnabled() {
        return this.onBackPressedDispatcher_delegatelambda00;
    }

    public boolean isForceInit() {
        return this.enterPictureInPictureMode;
    }

    public Boolean isGlobalHubMode() {
        return this.getDefaultViewModelCreationExtras;
    }

    public boolean isPrintUncaughtStackTrace() {
        return this.removeOnConfigurationChangedListener;
    }

    public boolean isPropagateTraceparent() {
        return this.removeOnUserLeaveHintListener;
    }

    public boolean isSendClientReports() {
        return this.ComponentDialog;
    }

    public boolean isSendDefaultPii() {
        return this.onStop;
    }

    public boolean isSendModules() {
        return this.invoke;
    }

    public boolean isStartProfilerOnAppStart() {
        return this.isEnabled;
    }

    public boolean isTraceOptionsRequests() {
        return this.removeCloseableactivity;
    }

    public boolean isTraceSampling() {
        return this.OnBackPressedDispatcherOnBackPressedEventInputExternalSyntheticLambda0;
    }

    public void setAttachServerName(boolean z) {
        this.read = z;
    }

    public void setAttachStacktrace(boolean z) {
        this.IconCompatParcelizer = z;
    }

    public void setAttachThreads(boolean z) {
        this.MediaDescriptionCompat = z;
    }

    public void setBackpressureMonitor(serializer serializerVar) {
        this.MediaBrowserCompatMediaItem = serializerVar;
    }

    public void setBeforeBreadcrumb(setBannerHeightlambda1 setbannerheightlambda1) {
        this.MediaMetadataCompat = setbannerheightlambda1;
    }

    public void setBeforeEnvelopeCallback(getUser getuser) {
    }

    public void setBeforeSend(getSetHeightCallback getsetheightcallback) {
        this.RatingCompat = getsetheightcallback;
    }

    public void setBeforeSendFeedback(getSetHeightCallback getsetheightcallback) {
        this.MediaSessionCompatQueueItem = getsetheightcallback;
    }

    public void setBeforeSendReplay(BannerJavascriptInterfacerequestPushPermission2 bannerJavascriptInterfacerequestPushPermission2) {
    }

    public void setBeforeSendTransaction(BannerUserJavascriptInterface bannerUserJavascriptInterface) {
        this.MediaSessionCompatToken = bannerUserJavascriptInterface;
    }

    public void setCacheDirPath(String str) {
        this.PlaybackStateCompat = str;
    }

    public void setCaptureOpenTelemetryEvents(boolean z) {
        this.ParcelableVolumeInfo = z;
    }

    public void setCompositePerformanceCollector(openUriWithActionView openuriwithactionview) {
        this.PlaybackStateCompatCustomAction = openuriwithactionview;
    }

    public void setConnectionStatusProvider(parseandroid_sdk_ui_release parseandroid_sdk_ui_releaseVar) {
        this.ComponentActivity = parseandroid_sdk_ui_releaseVar;
    }

    public void setConnectionTimeoutMillis(int i) {
        this.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY = i;
    }

    public void setCron(BannerJavascriptInterfaceExternalSyntheticLambda5 bannerJavascriptInterfaceExternalSyntheticLambda5) {
        this.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus = bannerJavascriptInterfaceExternalSyntheticLambda5;
    }

    public void setDeadlineTimeout(long j) {
        this.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg = j;
    }

    public void setDebug(boolean z) {
        this.r8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss = z;
    }

    public void setDefaultScopeType(r8lambdacR4TgcNFSm4F1F1Q1IGncB5Rik r8lambdacr4tgcnfsm4f1f1q1igncb5rik) {
        this.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM = r8lambdacr4tgcnfsm4f1f1q1igncb5rik;
    }

    public void setDist(String str) {
        this.r8lambdag6d1IyBXWIL5aeSAzXsZMVuYCQs = str;
    }

    public void setDistinctId(String str) {
        this.r8lambdayPQlaAoRiYRJ3IY_TqzUUTrVH0 = str;
    }

    public void setEnableAppStartProfiling(boolean z) {
        this.accessensureViewModelStore = z;
    }

    public void setEnableAutoSessionTracking(boolean z) {
        this._init_lambda2 = z;
    }

    public void setEnableBackpressureHandling(boolean z) {
        this.createFullyDrawnExecutor = z;
    }

    public void setEnableDatabaseTransactionTracing(boolean z) {
        this.defaultViewModelProviderFactory_delegatelambda0 = z;
    }

    public void setEnableDeduplication(boolean z) {
        this.addObserverForBackInvoker = z;
    }

    public void setEnableEventSizeLimiting(boolean z) {
        this.ensureViewModelStore = z;
    }

    public void setEnableExternalConfiguration(boolean z) {
        this.addObserverForBackInvokerlambda0 = z;
    }

    public void setEnablePrettySerializationOutput(boolean z) {
        this.fullyDrawnReporter_delegatelambda0 = z;
    }

    public void setEnableScopePersistence(boolean z) {
        this.menuHostHelperlambda0 = z;
    }

    public void setEnableScreenTracking(boolean z) {
        this.getOnBackPressedInput = z;
    }

    public void setEnableShutdownHook(boolean z) {
        this.fullyDrawnReporter_delegatelambda00 = z;
    }

    public void setEnableSpotlight(boolean z) {
        this.getSavedStateRegistryControllerannotations = z;
    }

    public void setEnableTimeToFullDisplayTracing(boolean z) {
        this.onBackPressedInput_delegatelambda0 = z;
    }

    public void setEnableUncaughtExceptionHandler(boolean z) {
        this.onBackPressedDispatcher_delegatelambda010 = z;
    }

    public void setEnableUserInteractionBreadcrumbs(boolean z) {
        this.addContentView = z;
    }

    public void setEnableUserInteractionTracing(boolean z) {
        this.onBackPressedDispatcher_delegatelambda0 = z;
    }

    public void setEnabled(boolean z) {
        this.onBackPressedDispatcher_delegatelambda00 = z;
    }

    public void setEnvironment(String str) {
        this.addOnNewIntentListener = str;
    }

    public void setFeedbackOptions(PendingBannerDismissSnapshot pendingBannerDismissSnapshot) {
        this.addOnTrimMemoryListener = pendingBannerDismissSnapshot;
    }

    public void setFlushTimeoutMillis(long j) {
        this.addOnUserLeaveHintListener = j;
    }

    public void setForceInit(boolean z) {
        this.enterPictureInPictureMode = z;
    }

    public void setFullyDisplayedReporter(getActionTypelambda0 getactiontypelambda0) {
        this.getDefaultViewModelProviderFactory = getactiontypelambda0;
    }

    public void setGlobalHubMode(Boolean bool) {
        this.getDefaultViewModelCreationExtras = bool;
    }

    public void setIdleTimeout(Long l) {
        this.getActivityResultRegistry = l;
    }

    public void setInitPriority(ContainerStepgetChildStepIteratorinlinediterator1 containerStepgetChildStepIteratorinlinediterator1) {
        this.onBackPressed = containerStepgetChildStepIteratorinlinediterator1;
    }

    @Deprecated
    public void setInstrumenter(ContainerStepgetChildStepIteratorinlinediterator2 containerStepgetChildStepIteratorinlinediterator2) {
        this.initializeViewTreeOwners = containerStepgetChildStepIteratorinlinediterator2;
    }

    public void setLogs(DefaultBannerWebViewClientListener defaultBannerWebViewClientListener) {
        this.onNewIntent = defaultBannerWebViewClientListener;
    }

    public void setMaxAttachmentSize(long j) {
        this.onCreate = j;
    }

    public void setMaxBreadcrumbs(int i) {
        this.onMultiWindowModeChanged = i;
    }

    public void setMaxCacheItems(int i) {
        this.onMenuItemSelected = i;
    }

    public void setMaxDepth(int i) {
        this.onRequestPermissionsResult = i;
    }

    public void setMaxFeatureFlags(int i) {
        this.onPictureInPictureUiStateChanged = i;
    }

    public void setMaxRequestBodySize(onOtherUrlAction onotherurlaction) {
        this.onPictureInPictureModeChanged = onotherurlaction;
    }

    public void setMaxSpans(int i) {
        this.onPanelClosed = i;
    }

    public void setMaxTraceFileSize(long j) {
        this.onRetainNonConfigurationInstance = j;
    }

    public void setMetrics(logHtmlClick loghtmlclick) {
        this.onRetainCustomNonConfigurationInstance = loghtmlclick;
    }

    public void setOnDiscard(r8lambdaPVfdc4_JcrwE1K_cENW3pfSaRKU r8lambdapvfdc4_jcrwe1k_cenw3pfsarku) {
    }

    public void setOnOversizedEvent(r8lambdaXHNag9bp7vYEr8vc9J2vtoOxhLE r8lambdaxhnag9bp7vyer8vc9j2vtooxhle) {
    }

    public void setOpenTelemetryMode(beforeMessageClosed beforemessageclosed) {
        this.onSaveInstanceState = beforemessageclosed;
    }

    public void setPrintUncaughtStackTrace(boolean z) {
        this.removeOnConfigurationChangedListener = z;
    }

    public void setProfileSessionSampleRate(Double d) {
        if (RegexKt.write(d, true)) {
            this.removeOnTrimMemoryListener = d;
        } else {
            DrawableTransformation.IconCompatParcelizer("The value ", d, " is not valid. Use values between 0.0 and 1.0.");
        }
    }

    public void setProfilerConverter(doAnyTypesMatch doanytypesmatch) {
        this.removeOnPictureInPictureModeChangedListener = doanytypesmatch;
    }

    public void setProfilesSampleRate(Double d) {
        if (RegexKt.write(d, true)) {
            this.removeOnNewIntentListener = d;
        } else {
            DrawableTransformation.IconCompatParcelizer("The value ", d, " is not valid. Use null to disable or values between 0.0 and 1.0.");
        }
    }

    public void setProfilesSampler(onCustomEventActionlambda0 oncustomeventactionlambda0) {
    }

    public void setProfilingTracesDirPath(String str) {
        this.removeOnMultiWindowModeChangedListener = str;
    }

    public void setProfilingTracesHz(int i) {
        this.removeOnPictureInPictureUiStateChangedListener = i;
    }

    public void setProguardUuid(String str) {
        this.setContentView = str;
    }

    public void setPropagateTraceparent(boolean z) {
        this.removeOnUserLeaveHintListener = z;
    }

    public void setProxy(r8lambdaoLSjZZF44WAcj26APhfSuFI7AQ r8lambdaolsjzzf44wacj26aphfsufi7aq) {
        this.setPictureInPictureParams = r8lambdaolsjzzf44wacj26aphfsufi7aq;
    }

    public void setReadTimeoutMillis(int i) {
        this.reportFullyDrawn = i;
    }

    public void setRelease(String str) {
        this.startActivityForResult = str;
    }

    public void setRuntimeManager(io.sentry.util.runtime.IconCompatParcelizer iconCompatParcelizer) {
        this.getOnBackPressedDispatcherannotations = iconCompatParcelizer;
    }

    public void setSampleRate(Double d) {
        if (RegexKt.write(d, true)) {
            this.r8lambdaXxpmZzi8FNPM2sJJA30VCt2mBcQ = d;
        } else {
            DrawableTransformation.IconCompatParcelizer("The value ", d, " is not valid. Use null to disable or values >= 0.0 and <= 1.0.");
        }
    }

    public void setSendDefaultPii(boolean z) {
        this.onStop = z;
    }

    public void setSendModules(boolean z) {
        this.invoke = z;
    }

    public void setSentryClientName(String str) {
        this.onStart = str;
    }

    public void setServerName(String str) {
        this.ComponentDialogExternalSyntheticLambda0 = str;
    }

    public void setSessionFlushTimeoutMillis(long j) {
        this.createNavigationEventHandleractivity = j;
    }

    public void setSessionReplay(parseUseWebViewFromQueryBundle parseusewebviewfromquerybundle) {
        this.addCloseableactivity = parseusewebviewfromquerybundle;
    }

    public void setSessionTrackingIntervalMillis(long j) {
        this.OnBackPressedCallback = j;
    }

    public void setShutdownTimeoutMillis(long j) {
        this.handleOnBackCancelled = j;
    }

    public void setSpanFactory(runOnUserandroid_sdk_ui_release runonuserandroid_sdk_ui_release) {
        this.handleOnBackStarted = runonuserandroid_sdk_ui_release;
    }

    public void setSpotlightConnectionUrl(String str) {
        this.remove = str;
    }

    public void setSslSocketFactory(SSLSocketFactory sSLSocketFactory) {
        this.handleOnBackProgressed = sSLSocketFactory;
    }

    public void setStartProfilerOnAppStart(boolean z) {
        this.isEnabled = z;
    }

    public void setThreadChecker(IconCompatParcelizer iconCompatParcelizer) {
        this.SystemBarStyleCompanion = iconCompatParcelizer;
    }

    public void setTraceOptionsRequests(boolean z) {
        this.removeCloseableactivity = z;
    }

    @Deprecated
    public void setTraceSampling(boolean z) {
        this.OnBackPressedDispatcherOnBackPressedEventInputExternalSyntheticLambda0 = z;
    }

    public void setTracesSampleRate(Double d) {
        if (RegexKt.write(d, true)) {
            this.setEnabled = d;
        } else {
            DrawableTransformation.IconCompatParcelizer("The value ", d, " is not valid. Use null to disable or values between 0.0 and 1.0.");
        }
    }

    public void setTracesSampler(onOtherUrlActionlambda0 onotherurlactionlambda0) {
        this.ActivityResult = onotherurlactionlambda0;
    }

    public void setVersionDetector(onErrorlambda0 onerrorlambda0) {
        this.BackHandlerKtExternalSyntheticLambda1 = onerrorlambda0;
    }

    /* JADX INFO: renamed from: $r8$lambda$pmuKZ2-G5LzrlDjCWKqlIVz6G9U, reason: not valid java name */
    public static /* synthetic */ r8lambda76J5CE7m9NRYvepl6xiAjQisQQ m5139$r8$lambda$pmuKZ2G5LzrlDjCWKqlIVz6G9U(SentryOptions sentryOptions) {
        return new r8lambda76J5CE7m9NRYvepl6xiAjQisQQ(sentryOptions._init_lambda3);
    }

    public static /* synthetic */ r8lambdazCgP5h6gmY_4iWu5QdFkjTpdf20 $r8$lambda$qgEBEc4URCRJvlkRDkEMRKtofys(SentryOptions sentryOptions) {
        return new r8lambdazCgP5h6gmY_4iWu5QdFkjTpdf20((BaseBrazeActionStep) sentryOptions.EdgeToEdgeExternalSyntheticLambda0.IconCompatParcelizer());
    }

    public void addBundleId(String str) {
        if (str != null) {
            String strTrim = str.trim();
            if (strTrim.isEmpty()) {
                return;
            }
            this.MediaSessionCompatResultReceiverWrapper.add(strTrim);
        }
    }

    public void addContextTag(String str) {
        this.r8lambda54BeH8ZsBru0CXI2CCSP2syNys.add(str);
    }

    public void addEventProcessor(r8lambdaxJfG46aOs8fDMxLv0xl_0gwVuI r8lambdaxjfg46aos8fdmxlv0xl_0gwvui) {
        this.addMenuProvider.add(r8lambdaxjfg46aos8fdmxlv0xl_0gwvui);
    }

    public void addIgnoredExceptionForType(Class<? extends Throwable> cls) {
        this.getLifecycle.add(cls);
    }

    public void addInAppExclude(String str) {
        this.getNavigationEventDispatcher.add(str);
    }

    public void addInAppInclude(String str) {
        this.onConfigurationChanged.add(str);
    }

    public void addIntegration(LogCustomEventStep logCustomEventStep) {
        this.onActivityResult.add(logCustomEventStep);
    }

    public void addOptionsObserver(containsInvalidBrazeAction containsinvalidbrazeaction) {
        this.removeMenuProvider.add(containsinvalidbrazeaction);
    }

    public void addPerformanceCollector(getAllBrazeActionStepTypes getallbrazeactionsteptypes) {
        this.peekAvailableContext.add(getallbrazeactionsteptypes);
    }

    public void addScopeObserver(r8lambdatOXQQytFfRJJ1udVx34HO5buEo r8lambdatoxqqytffrjj1udvx34ho5bueo) {
        this.onTrimMemory.add(r8lambdatoxqqytffrjj1udvx34ho5bueo);
    }

    public boolean containsIgnoredExceptionForType(Throwable th) {
        return this.getLifecycle.contains(th.getClass());
    }

    public io.sentry.cache.MediaMetadataCompat findPersistingScopeObserver() {
        for (r8lambdatOXQQytFfRJJ1udVx34HO5buEo r8lambdatoxqqytffrjj1udvx34ho5bueo : this.onTrimMemory) {
            if (r8lambdatoxqqytffrjj1udvx34ho5bueo instanceof io.sentry.cache.MediaMetadataCompat) {
                return (io.sentry.cache.MediaMetadataCompat) r8lambdatoxqqytffrjj1udvx34ho5bueo;
            }
        }
        return null;
    }

    public getOnDismissCallback getDateProvider() {
        return (getOnDismissCallback) this.r8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8.IconCompatParcelizer();
    }

    public BrazeActionParserActionType getEnvelopeReader() {
        return (BrazeActionParserActionType) this.addOnContextAvailableListener.IconCompatParcelizer();
    }

    public BaseBrazeActionStep getSerializer() {
        return (BaseBrazeActionStep) this.EdgeToEdgeExternalSyntheticLambda0.IconCompatParcelizer();
    }

    public r8lambda76J5CE7m9NRYvepl6xiAjQisQQ retrieveParsedDsn() throws IllegalArgumentException {
        return (r8lambda76J5CE7m9NRYvepl6xiAjQisQQ) this.registerForActivityResult.IconCompatParcelizer();
    }

    public void setContinuousProfiler(getImpl getimpl) {
        if (this.ResultReceiver != r8lambdaOvKN5euqH6Ij7OM19FiXA03UYH4.RemoteActionCompatParcelizer || getimpl == null) {
            return;
        }
        this.ResultReceiver = getimpl;
    }

    public void setDateProvider(getOnDismissCallback getondismisscallback) {
        this.r8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8.IconCompatParcelizer(getondismisscallback);
    }

    public void setDsn(String str) {
        String string;
        this._init_lambda3 = str;
        this.registerForActivityResult.RemoteActionCompatParcelizer();
        String str2 = this._init_lambda3;
        BrazeActionParserExternalSyntheticLambda0 brazeActionParserExternalSyntheticLambda0 = this.onCreatePanelMenu;
        Charset charset = r8lambda54BeH8ZsBru0CXI2CCSP2syNys.IconCompatParcelizer;
        if (str2 == null || str2.isEmpty()) {
            string = null;
        } else {
            try {
                string = new StringBuilder(new BigInteger(1, MessageDigest.getInstance("SHA-1").digest(str2.getBytes(r8lambda54BeH8ZsBru0CXI2CCSP2syNys.IconCompatParcelizer))).toString(16)).toString();
            } catch (NoSuchAlgorithmException e) {
                brazeActionParserExternalSyntheticLambda0.serializer(r8lambdaL32xCEzW71g2Xzeh1NM3NImxco.INFO, "SHA-1 isn't available to calculate the hash.", e);
                string = null;
            } catch (Throwable th) {
                brazeActionParserExternalSyntheticLambda0.IconCompatParcelizer(r8lambdaL32xCEzW71g2Xzeh1NM3NImxco.INFO, "string: %s could not calculate its hash", th, str2);
                string = null;
            }
        }
        this._init_lambda4 = string;
    }

    public void setExecutorService(BrazeActionUtilsWhenMappings brazeActionUtilsWhenMappings) {
        if (brazeActionUtilsWhenMappings != null) {
            this.addOnConfigurationChangedListener = brazeActionUtilsWhenMappings;
        }
    }

    public void setFatalLogger(BrazeActionParserExternalSyntheticLambda0 brazeActionParserExternalSyntheticLambda0) {
        if (brazeActionParserExternalSyntheticLambda0 == null) {
            brazeActionParserExternalSyntheticLambda0 = r8lambdaea88sc6bNzdkREmuTaOF4vcCHI.IconCompatParcelizer;
        }
        this.addOnPictureInPictureUiStateChangedListener = brazeActionParserExternalSyntheticLambda0;
    }

    public void setGestureTargetLocators(List<read> list) {
        this.getFullyDrawnReporter.clear();
        this.getFullyDrawnReporter.addAll(list);
    }

    public void setLogger(BrazeActionParserExternalSyntheticLambda0 brazeActionParserExternalSyntheticLambda0) {
        this.onCreatePanelMenu = brazeActionParserExternalSyntheticLambda0 == null ? r8lambdaea88sc6bNzdkREmuTaOF4vcCHI.IconCompatParcelizer : new OkHttpCall$1(this, brazeActionParserExternalSyntheticLambda0);
    }

    public void setMaxQueueSize(int i) {
        if (i > 0) {
            this.onPreparePanel = i;
        }
    }

    public void setProfileLifecycle(StepDataargs_delegatelambda0inlinediterator1 stepDataargs_delegatelambda0inlinediterator1) {
        this.removeOnContextAvailableListener = stepDataargs_delegatelambda0inlinediterator1;
        if (stepDataargs_delegatelambda0inlinediterator1 != StepDataargs_delegatelambda0inlinediterator1.TRACE || isTracingEnabled()) {
            return;
        }
        this.onCreatePanelMenu.IconCompatParcelizer(r8lambdaL32xCEzW71g2Xzeh1NM3NImxco.WARNING, "Profiling lifecycle is set to TRACE but tracing is disabled. Profiling will not be started automatically.", new Object[0]);
    }

    public void setTransactionProfiler(ContainerStep containerStep) {
        if (this.invokeSuspend != isArgCountInBounds.IconCompatParcelizer || containerStep == null) {
            return;
        }
        this.invokeSuspend = containerStep;
    }

    public void setViewHierarchyExporters(List<ComposeViewHierarchyExporter> list) {
        this.r8lambdaTWvtyPFkiHdx0RbtWVLevVLT0.clear();
        this.r8lambdaTWvtyPFkiHdx0RbtWVLevVLT0.addAll(list);
    }

    public static SentryOptions empty() {
        return new SentryOptions(true);
    }

    public void loadLazyFields() {
        getSerializer();
        retrieveParsedDsn();
        getEnvelopeReader();
        getDateProvider();
    }

    public void setDebugMetaLoader(io.sentry.internal.debugmeta.read readVar) {
        if (readVar == null) {
            readVar = io.sentry.internal.debugmeta.serializer.RemoteActionCompatParcelizer;
        }
        this.r8lambdaXj9c8VIP9DfEvaTmZt0ejAuC4a4 = readVar;
    }

    public void setDiagnosticLevel(r8lambdaL32xCEzW71g2Xzeh1NM3NImxco r8lambdal32xcezw71g2xzeh1nm3nimxco) {
        if (r8lambdal32xcezw71g2xzeh1nm3nimxco == null) {
            r8lambdal32xcezw71g2xzeh1nm3nimxco = RemoteActionCompatParcelizer;
        }
        this.r8lambdawJ5MHcSJed_CjC7r4OWD0UxyJsQ = r8lambdal32xcezw71g2xzeh1nm3nimxco;
    }

    public void setDistributionController(BrazeActionParserActionTypeCompanion brazeActionParserActionTypeCompanion) {
        if (brazeActionParserActionTypeCompanion == null) {
            brazeActionParserActionTypeCompanion = isArgCountInBounds.read;
        }
        this._init_lambda1 = brazeActionParserActionTypeCompanion;
    }

    public void setEnvelopeDiskCache(io.sentry.cache.serializer serializerVar) {
        if (serializerVar == null) {
            serializerVar = RatingCompat.RemoteActionCompatParcelizer;
        }
        this.addOnMultiWindowModeChangedListener = serializerVar;
    }

    public void setIgnoredCheckIns(List<String> list) {
        if (list == null) {
            this.getLastCustomNonConfigurationInstance = null;
            return;
        }
        ArrayList arrayList = new ArrayList();
        for (String str : list) {
            if (!str.isEmpty()) {
                arrayList.add(new getBrazeActionVersionAndJsonlambda1(str));
            }
        }
        this.getLastCustomNonConfigurationInstance = arrayList;
    }

    public void setIgnoredErrors(List<String> list) {
        if (list == null) {
            this.getOnBackPressedDispatcher = null;
            return;
        }
        ArrayList arrayList = new ArrayList();
        for (String str : list) {
            if (str != null && !str.isEmpty()) {
                arrayList.add(new getBrazeActionVersionAndJsonlambda1(str));
            }
        }
        this.getOnBackPressedDispatcher = arrayList;
    }

    public void setIgnoredSpanOrigins(List<String> list) {
        if (list == null) {
            this.getSavedStateRegistry = null;
            return;
        }
        ArrayList arrayList = new ArrayList();
        for (String str : list) {
            if (str != null && !str.isEmpty()) {
                arrayList.add(new getBrazeActionVersionAndJsonlambda1(str));
            }
        }
        this.getSavedStateRegistry = arrayList;
    }

    public void setIgnoredTransactions(List<String> list) {
        if (list == null) {
            this.getViewModelStore = null;
            return;
        }
        ArrayList arrayList = new ArrayList();
        for (String str : list) {
            if (str != null && !str.isEmpty()) {
                arrayList.add(new getBrazeActionVersionAndJsonlambda1(str));
            }
        }
        this.getViewModelStore = arrayList;
    }

    public void setModulesLoader(RemoteActionCompatParcelizer remoteActionCompatParcelizer) {
        if (remoteActionCompatParcelizer == null) {
            remoteActionCompatParcelizer = io.sentry.internal.modules.read.RemoteActionCompatParcelizer;
        }
        this.onUserLeaveHint = remoteActionCompatParcelizer;
    }

    public void setReplayController(fromNullableFields fromnullablefields) {
        if (fromnullablefields == null) {
            fromnullablefields = isArgCountInBounds.serializer;
        }
        this.getLifecycleRegistry1 = fromnullablefields;
    }

    public void setSocketTagger(BaseBrazeActionStepCompanion baseBrazeActionStepCompanion) {
        if (baseBrazeActionStepCompanion == null) {
            baseBrazeActionStepCompanion = isArgCountInBoundslambda0.read;
        }
        this.run = baseBrazeActionStepCompanion;
    }

    public void setTag(String str, String str2) {
        if (str == null) {
            return;
        }
        Map<String, String> map = this.handleOnBackPressed;
        if (str2 == null) {
            map.remove(str);
        } else {
            map.put(str, str2);
        }
    }

    public void setTracePropagationTargets(List<String> list) {
        if (list == null) {
            this.getIndexOfFirstFeature = null;
            return;
        }
        ArrayList arrayList = new ArrayList();
        for (String str : list) {
            if (!str.isEmpty()) {
                arrayList.add(str);
            }
        }
        this.getIndexOfFirstFeature = arrayList;
    }

    public void setTransportFactory(r8lambdamckPC49KvJ34IWnFVpGB9V0HXhE r8lambdamckpc49kvj34iwnfvpgb9v0hxhe) {
        if (r8lambdamckpc49kvj34iwnfvpgb9v0hxhe == null) {
            r8lambdamckpc49kvj34iwnfvpgb9v0hxhe = getFirstArg.read;
        }
        this.PredictiveBackHandlerKtPredictiveBackHandlerlambda30inlinedonStopOrDispose1 = r8lambdamckpc49kvj34iwnfvpgb9v0hxhe;
    }

    public void setTransportGate(MediaMetadataCompat mediaMetadataCompat) {
        if (mediaMetadataCompat == null) {
            mediaMetadataCompat = ParcelableVolumeInfo.write;
        }
        this.ComposePredictiveBackHandlerlaunchNewGesture11 = mediaMetadataCompat;
    }

    public String getCacheDirPath() {
        String str = this.PlaybackStateCompat;
        if (str == null || str.isEmpty()) {
            return null;
        }
        String str2 = this._init_lambda4;
        return str2 != null ? new File(this.PlaybackStateCompat, str2).getAbsolutePath() : this.PlaybackStateCompat;
    }

    public String getCacheDirPathWithoutDsn() {
        String str = this.PlaybackStateCompat;
        if (str == null || str.isEmpty()) {
            return null;
        }
        return this.PlaybackStateCompat;
    }

    public handleCardClicklambda3 getInternalTracesSampler() {
        if (this.invalidateMenu == null) {
            UriActionExternalSyntheticLambda4 uriActionExternalSyntheticLambda4Serializer = this.write.serializer();
            try {
                if (this.invalidateMenu == null) {
                    this.invalidateMenu = new handleCardClicklambda3(this);
                }
                uriActionExternalSyntheticLambda4Serializer.close();
            } catch (Throwable th) {
                try {
                    uriActionExternalSyntheticLambda4Serializer.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        }
        return this.invalidateMenu;
    }

    public String getProfilingTracesDirPath() {
        String str = this.removeOnMultiWindowModeChangedListener;
        if (str != null && !str.isEmpty()) {
            String str2 = this._init_lambda4;
            return str2 != null ? new File(this.removeOnMultiWindowModeChangedListener, str2).getAbsolutePath() : this.removeOnMultiWindowModeChangedListener;
        }
        String cacheDirPath = getCacheDirPath();
        if (cacheDirPath == null) {
            return null;
        }
        return new File(cacheDirPath, "profiling_traces").getAbsolutePath();
    }

    public List<String> getTracePropagationTargets() {
        List<String> list = this.getIndexOfFirstFeature;
        return list == null ? this.r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28 : list;
    }

    public boolean isContinuousProfilingEnabled() {
        Double d;
        return this.removeOnNewIntentListener == null && (d = this.removeOnTrimMemoryListener) != null && d.doubleValue() > 0.0d;
    }

    public boolean isProfilingEnabled() {
        Double d = this.removeOnNewIntentListener;
        return d != null && d.doubleValue() > 0.0d;
    }

    public void setSdkVersion(r8lambdaXj9c8VIP9DfEvaTmZt0ejAuC4a4 r8lambdaxj9c8vip9dfevatmzt0ejauc4a4) {
        r8lambdaXj9c8VIP9DfEvaTmZt0ejAuC4a4 r8lambdaxj9c8vip9dfevatmzt0ejauc4a5 = getSessionReplay().ParcelableVolumeInfo;
        r8lambdaXj9c8VIP9DfEvaTmZt0ejAuC4a4 r8lambdaxj9c8vip9dfevatmzt0ejauc4a6 = this.startIntentSenderForResult;
        if (r8lambdaxj9c8vip9dfevatmzt0ejauc4a6 != null && r8lambdaxj9c8vip9dfevatmzt0ejauc4a5 != null && r8lambdaxj9c8vip9dfevatmzt0ejauc4a6.equals(r8lambdaxj9c8vip9dfevatmzt0ejauc4a5)) {
            getSessionReplay().ParcelableVolumeInfo = r8lambdaxj9c8vip9dfevatmzt0ejauc4a4;
        }
        this.startIntentSenderForResult = r8lambdaxj9c8vip9dfevatmzt0ejauc4a4;
    }

    /* JADX WARN: Code duplicated, block: B:19:0x0282  */
    public SentryOptions(boolean z) {
        runOnUserandroid_sdk_ui_release coerceargtopropertiesornull;
        Class clsRemoteActionCompatParcelizer;
        r8lambdaea88sc6bNzdkREmuTaOF4vcCHI r8lambdaea88sc6bnzdkremutaof4vcchi = r8lambdaea88sc6bNzdkREmuTaOF4vcCHI.IconCompatParcelizer;
        this.onCreatePanelMenu = r8lambdaea88sc6bnzdkremutaof4vcchi;
        this.addOnPictureInPictureUiStateChangedListener = r8lambdaea88sc6bnzdkremutaof4vcchi;
        this.r8lambdawJ5MHcSJed_CjC7r4OWD0UxyJsQ = RemoteActionCompatParcelizer;
        int i = 1;
        this.EdgeToEdgeExternalSyntheticLambda0 = new io.sentry.util.MediaMetadataCompat(new SentryOptions$$ExternalSyntheticLambda0(this, i));
        this.addOnContextAvailableListener = new io.sentry.util.MediaMetadataCompat(new SentryOptions$$ExternalSyntheticLambda0(this, 2));
        this.onRequestPermissionsResult = 100;
        this.onMenuItemSelected = 30;
        this.onPreparePanel = 30;
        this.onMultiWindowModeChanged = 100;
        this.onPictureInPictureUiStateChanged = 100;
        this.getNavigationEventDispatcher = new CopyOnWriteArrayList();
        this.onConfigurationChanged = new CopyOnWriteArrayList();
        this.PredictiveBackHandlerKtPredictiveBackHandlerlambda30inlinedonStopOrDispose1 = getFirstArg.read;
        this.ComposePredictiveBackHandlerlaunchNewGesture11 = ParcelableVolumeInfo.write;
        this.IconCompatParcelizer = true;
        this._init_lambda2 = true;
        this.OnBackPressedCallback = 30000L;
        this.read = true;
        this.onBackPressedDispatcher_delegatelambda010 = true;
        this.removeOnConfigurationChangedListener = false;
        this.addOnConfigurationChangedListener = isArgCountInBounds.write;
        this.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY = 30000;
        this.reportFullyDrawn = 30000;
        this.addOnMultiWindowModeChangedListener = RatingCompat.RemoteActionCompatParcelizer;
        this.onStop = false;
        this.onTrimMemory = new CopyOnWriteArrayList();
        this.removeMenuProvider = new CopyOnWriteArrayList();
        this.handleOnBackPressed = new ConcurrentHashMap();
        this.onCreate = 20971520L;
        this.addObserverForBackInvoker = true;
        this.ensureViewModelStore = false;
        this.onPanelClosed = 1000;
        this.fullyDrawnReporter_delegatelambda00 = true;
        this.onPictureInPictureModeChanged = onOtherUrlAction.NONE;
        this.OnBackPressedDispatcherOnBackPressedEventInputExternalSyntheticLambda0 = true;
        this.onRetainNonConfigurationInstance = 5242880L;
        this.invokeSuspend = isArgCountInBounds.IconCompatParcelizer;
        this.ResultReceiver = r8lambdaOvKN5euqH6Ij7OM19FiXA03UYH4.RemoteActionCompatParcelizer;
        this.removeOnPictureInPictureModeChangedListener = firstArg_delegatelambda0.serializer;
        this.getIndexOfFirstFeature = null;
        this.r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28 = Collections.singletonList(".*");
        this.removeOnUserLeaveHintListener = false;
        this.getActivityResultRegistry = Long.valueOf(ConstantsKt.DEFAULT_REQUEST_TIMEOUT);
        this.r8lambda54BeH8ZsBru0CXI2CCSP2syNys = new CopyOnWriteArrayList();
        this.ComponentDialog = true;
        this.serializer = new OkHttpCall$1(this);
        this.onUserLeaveHint = io.sentry.internal.modules.read.RemoteActionCompatParcelizer;
        this.r8lambdaXj9c8VIP9DfEvaTmZt0ejAuC4a4 = io.sentry.internal.debugmeta.serializer.RemoteActionCompatParcelizer;
        this.onBackPressedDispatcher_delegatelambda0 = false;
        this.addContentView = true;
        this.initializeViewTreeOwners = ContainerStepgetChildStepIteratorinlinediterator2.SENTRY;
        this.getFullyDrawnReporter = new ArrayList();
        this.r8lambdaTWvtyPFkiHdx0RbtWVLevVLT0 = new ArrayList();
        this.SystemBarStyleCompanion = io.sentry.util.thread.read.read;
        this.removeCloseableactivity = true;
        this.defaultViewModelProviderFactory_delegatelambda0 = false;
        this.r8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8 = new io.sentry.util.MediaMetadataCompat(new ActivityLifecycleIntegration$$ExternalSyntheticLambda1(12));
        this.peekAvailableContext = new ArrayList();
        this.PlaybackStateCompatCustomAction = StepData.serializer;
        this.onBackPressedInput_delegatelambda0 = false;
        this.getDefaultViewModelProviderFactory = getActionTypelambda0.read;
        this.ComponentActivity = new r8lambdaC65AgNYjlXsuFXOhYux3_Qwhdc4();
        this.onBackPressedDispatcher_delegatelambda00 = true;
        this.fullyDrawnReporter_delegatelambda0 = true;
        this.invoke = true;
        this.getSavedStateRegistryControllerannotations = false;
        this.menuHostHelperlambda0 = true;
        this.getLastCustomNonConfigurationInstance = null;
        this.getSavedStateRegistry = null;
        this.getViewModelStore = null;
        this.MediaBrowserCompatMediaItem = write.serializer;
        this.createFullyDrawnExecutor = true;
        this.accessensureViewModelStore = false;
        this.handleOnBackStarted = coerceArgToPropertiesOrNull.IconCompatParcelizer;
        this.removeOnPictureInPictureUiStateChangedListener = 101;
        this.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus = null;
        this.getLifecycleRegistry1 = isArgCountInBounds.serializer;
        this._init_lambda1 = isArgCountInBounds.read;
        this.getOnBackPressedInput = true;
        this.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM = r8lambdacR4TgcNFSm4F1F1Q1IGncB5Rik.ISOLATION;
        this.onBackPressed = ContainerStepgetChildStepIteratorinlinediterator1.MEDIUM;
        this.enterPictureInPictureMode = false;
        this.getDefaultViewModelCreationExtras = null;
        this.write = new io.sentry.util.RemoteActionCompatParcelizer();
        this.onSaveInstanceState = beforeMessageClosed.AUTO;
        this.ParcelableVolumeInfo = false;
        this.BackHandlerKtExternalSyntheticLambda1 = getArgandroid_sdk_ui_release.write;
        this.removeOnContextAvailableListener = StepDataargs_delegatelambda0inlinediterator1.MANUAL;
        this.isEnabled = false;
        this.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg = 30000L;
        DefaultBannerWebViewClientListener defaultBannerWebViewClientListener = new DefaultBannerWebViewClientListener();
        defaultBannerWebViewClientListener.write = false;
        defaultBannerWebViewClientListener.read = new MediaSessionCompatQueueItem();
        this.onNewIntent = defaultBannerWebViewClientListener;
        logHtmlClick loghtmlclick = new logHtmlClick();
        loghtmlclick.write = true;
        loghtmlclick.IconCompatParcelizer = new isMainThread(26);
        this.onRetainCustomNonConfigurationInstance = loghtmlclick;
        this.run = isArgCountInBoundslambda0.read;
        this.getOnBackPressedDispatcherannotations = new ImageHeaderParserImageType();
        this.r8lambdavCwjfXDiSGcirCy4I008VOiJ_lw = new setBannerHeight();
        r8lambdaXj9c8VIP9DfEvaTmZt0ejAuC4a4 r8lambdaxj9c8vip9dfevatmzt0ejauc4a4 = new r8lambdaXj9c8VIP9DfEvaTmZt0ejAuC4a4("sentry.java", "8.32.0");
        r8lambdaxj9c8vip9dfevatmzt0ejauc4a4.IconCompatParcelizer = "8.32.0";
        this.addOnPictureInPictureModeChangedListener = new executelambda3();
        parseUseWebViewFromQueryBundle parseusewebviewfromquerybundle = new parseUseWebViewFromQueryBundle();
        CopyOnWriteArraySet copyOnWriteArraySet = new CopyOnWriteArraySet();
        parseusewebviewfromquerybundle.write = copyOnWriteArraySet;
        CopyOnWriteArraySet copyOnWriteArraySet2 = new CopyOnWriteArraySet();
        parseusewebviewfromquerybundle.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus = copyOnWriteArraySet2;
        parseusewebviewfromquerybundle.MediaSessionCompatResultReceiverWrapper = formatQueryBundleForLog.MEDIUM;
        parseusewebviewfromquerybundle.serializer = 1;
        parseusewebviewfromquerybundle.read = 30000L;
        parseusewebviewfromquerybundle.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY = DeviceOrientationRequest.OUTPUT_PERIOD_FAST;
        parseusewebviewfromquerybundle.PlaybackStateCompatCustomAction = 3600000L;
        parseusewebviewfromquerybundle.ResultReceiver = true;
        parseusewebviewfromquerybundle.RemoteActionCompatParcelizer = false;
        parseusewebviewfromquerybundle.MediaSessionCompatToken = dismisslambda0.PIXEL_COPY;
        List list = Collections.EMPTY_LIST;
        parseusewebviewfromquerybundle.MediaMetadataCompat = list;
        parseusewebviewfromquerybundle.MediaSessionCompatQueueItem = list;
        parseusewebviewfromquerybundle.RatingCompat = true;
        List list2 = parseUseWebViewFromQueryBundle.IconCompatParcelizer;
        parseusewebviewfromquerybundle.MediaDescriptionCompat = list2;
        parseusewebviewfromquerybundle.MediaBrowserCompatMediaItem = list2;
        if (!z) {
            copyOnWriteArraySet.add(AndroidComposeViewAccessibilityDelegateCompat.TextClassName);
            copyOnWriteArraySet2.remove(AndroidComposeViewAccessibilityDelegateCompat.TextClassName);
            copyOnWriteArraySet.add("android.widget.ImageView");
            copyOnWriteArraySet2.remove("android.widget.ImageView");
            copyOnWriteArraySet.add("android.webkit.WebView");
            copyOnWriteArraySet.add("android.widget.VideoView");
            copyOnWriteArraySet.add("androidx.media3.ui.PlayerView");
            copyOnWriteArraySet.add("com.google.android.exoplayer2.ui.PlayerView");
            copyOnWriteArraySet.add("com.google.android.exoplayer2.ui.StyledPlayerView");
            parseusewebviewfromquerybundle.ParcelableVolumeInfo = r8lambdaxj9c8vip9dfevatmzt0ejauc4a4;
        }
        this.addCloseableactivity = parseusewebviewfromquerybundle;
        PendingBannerDismissSnapshot pendingBannerDismissSnapshot = new PendingBannerDismissSnapshot();
        pendingBannerDismissSnapshot.RemoteActionCompatParcelizer = false;
        pendingBannerDismissSnapshot.write = true;
        pendingBannerDismissSnapshot.IconCompatParcelizer = false;
        pendingBannerDismissSnapshot.serializer = true;
        pendingBannerDismissSnapshot.MediaDescriptionCompat = true;
        pendingBannerDismissSnapshot.read = true;
        this.addOnTrimMemoryListener = pendingBannerDismissSnapshot;
        if (z) {
            return;
        }
        if (PlaybackStateCompatCustomAction.serializer || !MediaBrowserCompatMediaItem.write(r8lambdaea88sc6bnzdkremutaof4vcchi, "io.sentry.opentelemetry.OtelSpanFactory") || (clsRemoteActionCompatParcelizer = MediaBrowserCompatMediaItem.RemoteActionCompatParcelizer(r8lambdaea88sc6bnzdkremutaof4vcchi, "io.sentry.opentelemetry.OtelSpanFactory")) == null) {
            coerceargtopropertiesornull = new coerceArgToPropertiesOrNull(i);
        } else {
            try {
                Object objNewInstance = clsRemoteActionCompatParcelizer.getDeclaredConstructor(null).newInstance(null);
                if (objNewInstance == null || !(objNewInstance instanceof runOnUserandroid_sdk_ui_release)) {
                    coerceargtopropertiesornull = new coerceArgToPropertiesOrNull(i);
                } else {
                    coerceargtopropertiesornull = (runOnUserandroid_sdk_ui_release) objNewInstance;
                }
            } catch (IllegalAccessException | InstantiationException | NoSuchMethodException | InvocationTargetException unused) {
            }
        }
        setSpanFactory(coerceargtopropertiesornull);
        CallTracer callTracer = new CallTracer(this);
        this.addOnConfigurationChangedListener = callTracer;
        callTracer.serializer();
        List<LogCustomEventStep> list3 = this.onActivityResult;
        UncaughtExceptionHandlerIntegration uncaughtExceptionHandlerIntegration = new UncaughtExceptionHandlerIntegration();
        uncaughtExceptionHandlerIntegration.write = false;
        list3.add(uncaughtExceptionHandlerIntegration);
        this.onActivityResult.add(new ShutdownHookIntegration());
        try {
            this.onActivityResult.add((LogCustomEventStep) Class.forName("io.sentry.spotlight.SpotlightIntegration").getConstructor(null).newInstance(null));
        } catch (Throwable unused2) {
        }
        this.addMenuProvider.add(new runlambda1(this));
        this.addMenuProvider.add(new r8lambdaYUcla_T2qX_wkQ_VCWtu0Z3x1UI(this, 0));
        if (!PlaybackStateCompatCustomAction.serializer) {
            this.addMenuProvider.add(new DefaultBannerWebViewClientListenerCompanion());
        }
        setSentryClientName("sentry.java/8.32.0");
        setSdkVersion(r8lambdaxj9c8vip9dfevatmzt0ejauc4a4);
        BannerViewcreateBannerWebViewClientListener1.RemoteActionCompatParcelizer().IconCompatParcelizer("maven:io.sentry:sentry", "8.32.0");
    }

    public void setDistribution(setBannerHeight setbannerheight) {
        if (setbannerheight == null) {
            setbannerheight = new setBannerHeight();
        }
        this.r8lambdavCwjfXDiSGcirCy4I008VOiJ_lw = setbannerheight;
    }

    public void setEnvelopeReader(BrazeActionParserActionType brazeActionParserActionType) {
        io.sentry.util.MediaMetadataCompat mediaMetadataCompat = this.addOnContextAvailableListener;
        if (brazeActionParserActionType == null) {
            brazeActionParserActionType = r8lambdaBPMX2XV1WY9UhXD0vbiIsQjvro.read;
        }
        mediaMetadataCompat.IconCompatParcelizer(brazeActionParserActionType);
    }

    public void setSerializer(BaseBrazeActionStep baseBrazeActionStep) {
        io.sentry.util.MediaMetadataCompat mediaMetadataCompat = this.EdgeToEdgeExternalSyntheticLambda0;
        if (baseBrazeActionStep == null) {
            baseBrazeActionStep = isArgCountInBoundsdefault.read;
        }
        mediaMetadataCompat.IconCompatParcelizer(baseBrazeActionStep);
    }

    public void addIgnoredCheckIn(String str) {
        if (this.getLastCustomNonConfigurationInstance == null) {
            this.getLastCustomNonConfigurationInstance = new ArrayList();
        }
        this.getLastCustomNonConfigurationInstance.add(new getBrazeActionVersionAndJsonlambda1(str));
    }

    public void addIgnoredError(String str) {
        if (this.getOnBackPressedDispatcher == null) {
            this.getOnBackPressedDispatcher = new ArrayList();
        }
        this.getOnBackPressedDispatcher.add(new getBrazeActionVersionAndJsonlambda1(str));
    }

    public void addIgnoredSpanOrigin(String str) {
        if (this.getSavedStateRegistry == null) {
            this.getSavedStateRegistry = new ArrayList();
        }
        this.getSavedStateRegistry.add(new getBrazeActionVersionAndJsonlambda1(str));
    }

    public void addIgnoredTransaction(String str) {
        if (this.getViewModelStore == null) {
            this.getViewModelStore = new ArrayList();
        }
        this.getViewModelStore.add(new getBrazeActionVersionAndJsonlambda1(str));
    }

    public boolean isEnableAppStartProfiling() {
        return (isProfilingEnabled() || isContinuousProfilingEnabled()) && this.accessensureViewModelStore;
    }

    public boolean isTracingEnabled() {
        return (getTracesSampleRate() == null && getTracesSampler() == null) ? false : true;
    }

    public void merge(r8lambdazcrctSUJRiG8aDijZ5sY7PjsT3o r8lambdazcrctsujrig8adijz5sy7pjst3o) {
        if (r8lambdazcrctsujrig8adijz5sy7pjst3o.MediaSessionCompatQueueItem() != null) {
            setDsn(r8lambdazcrctsujrig8adijz5sy7pjst3o.MediaSessionCompatQueueItem());
        }
        if (r8lambdazcrctsujrig8adijz5sy7pjst3o.MediaDescriptionCompat() != null) {
            setEnvironment(r8lambdazcrctsujrig8adijz5sy7pjst3o.MediaDescriptionCompat());
        }
        if (r8lambdazcrctsujrig8adijz5sy7pjst3o.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg() != null) {
            setRelease(r8lambdazcrctsujrig8adijz5sy7pjst3o.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg());
        }
        if (r8lambdazcrctsujrig8adijz5sy7pjst3o.read() != null) {
            setDist(r8lambdazcrctsujrig8adijz5sy7pjst3o.read());
        }
        if (r8lambdazcrctsujrig8adijz5sy7pjst3o.r8lambdayPQlaAoRiYRJ3IY_TqzUUTrVH0() != null) {
            setServerName(r8lambdazcrctsujrig8adijz5sy7pjst3o.r8lambdayPQlaAoRiYRJ3IY_TqzUUTrVH0());
        }
        if (r8lambdazcrctsujrig8adijz5sy7pjst3o.r8lambdaXj9c8VIP9DfEvaTmZt0ejAuC4a4() != null) {
            setProxy(r8lambdazcrctsujrig8adijz5sy7pjst3o.r8lambdaXj9c8VIP9DfEvaTmZt0ejAuC4a4());
        }
        if (r8lambdazcrctsujrig8adijz5sy7pjst3o.MediaMetadataCompat() != null) {
            setEnableUncaughtExceptionHandler(r8lambdazcrctsujrig8adijz5sy7pjst3o.MediaMetadataCompat().booleanValue());
        }
        if (r8lambdazcrctsujrig8adijz5sy7pjst3o.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus() != null) {
            setPrintUncaughtStackTrace(r8lambdazcrctsujrig8adijz5sy7pjst3o.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus().booleanValue());
        }
        if (r8lambdazcrctsujrig8adijz5sy7pjst3o.accessensureViewModelStore() != null) {
            setTracesSampleRate(r8lambdazcrctsujrig8adijz5sy7pjst3o.accessensureViewModelStore());
        }
        if (r8lambdazcrctsujrig8adijz5sy7pjst3o.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM() != null) {
            setProfilesSampleRate(r8lambdazcrctsujrig8adijz5sy7pjst3o.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM());
        }
        if (r8lambdazcrctsujrig8adijz5sy7pjst3o.serializer() != null) {
            setDebug(r8lambdazcrctsujrig8adijz5sy7pjst3o.serializer().booleanValue());
        }
        if (r8lambdazcrctsujrig8adijz5sy7pjst3o.RatingCompat() != null) {
            setEnableDeduplication(r8lambdazcrctsujrig8adijz5sy7pjst3o.RatingCompat().booleanValue());
        }
        if (r8lambdazcrctsujrig8adijz5sy7pjst3o.r8lambdavCwjfXDiSGcirCy4I008VOiJ_lw() != null) {
            setSendClientReports(r8lambdazcrctsujrig8adijz5sy7pjst3o.r8lambdavCwjfXDiSGcirCy4I008VOiJ_lw().booleanValue());
        }
        if (r8lambdazcrctsujrig8adijz5sy7pjst3o.addObserverForBackInvokerlambda0() != null) {
            setForceInit(r8lambdazcrctsujrig8adijz5sy7pjst3o.addObserverForBackInvokerlambda0().booleanValue());
        }
        for (Map.Entry entry : new HashMap(r8lambdazcrctsujrig8adijz5sy7pjst3o.r8lambdag6d1IyBXWIL5aeSAzXsZMVuYCQs()).entrySet()) {
            this.handleOnBackPressed.put((String) entry.getKey(), (String) entry.getValue());
        }
        Iterator it = new ArrayList(r8lambdazcrctsujrig8adijz5sy7pjst3o.ComponentActivity()).iterator();
        while (it.hasNext()) {
            addInAppInclude((String) it.next());
        }
        Iterator it2 = new ArrayList(r8lambdazcrctsujrig8adijz5sy7pjst3o.PlaybackStateCompatCustomAction()).iterator();
        while (it2.hasNext()) {
            addInAppExclude((String) it2.next());
        }
        Iterator it3 = new HashSet(r8lambdazcrctsujrig8adijz5sy7pjst3o.MediaSessionCompatResultReceiverWrapper()).iterator();
        while (it3.hasNext()) {
            addIgnoredExceptionForType((Class) it3.next());
        }
        if (r8lambdazcrctsujrig8adijz5sy7pjst3o.r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28() != null) {
            setTracePropagationTargets(new ArrayList(r8lambdazcrctsujrig8adijz5sy7pjst3o.r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28()));
        }
        Iterator it4 = new ArrayList(r8lambdazcrctsujrig8adijz5sy7pjst3o.write()).iterator();
        while (it4.hasNext()) {
            addContextTag((String) it4.next());
        }
        if (r8lambdazcrctsujrig8adijz5sy7pjst3o.r8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss() != null) {
            setProguardUuid(r8lambdazcrctsujrig8adijz5sy7pjst3o.r8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss());
        }
        if (r8lambdazcrctsujrig8adijz5sy7pjst3o.MediaBrowserCompatMediaItem() != null) {
            setIdleTimeout(r8lambdazcrctsujrig8adijz5sy7pjst3o.MediaBrowserCompatMediaItem());
        }
        Iterator it5 = r8lambdazcrctsujrig8adijz5sy7pjst3o.IconCompatParcelizer().iterator();
        while (it5.hasNext()) {
            addBundleId((String) it5.next());
        }
        if (r8lambdazcrctsujrig8adijz5sy7pjst3o.createFullyDrawnExecutor() != null) {
            setEnabled(r8lambdazcrctsujrig8adijz5sy7pjst3o.createFullyDrawnExecutor().booleanValue());
        }
        if (r8lambdazcrctsujrig8adijz5sy7pjst3o.ensureViewModelStore() != null) {
            setEnablePrettySerializationOutput(r8lambdazcrctsujrig8adijz5sy7pjst3o.ensureViewModelStore().booleanValue());
        }
        if (r8lambdazcrctsujrig8adijz5sy7pjst3o.getSavedStateRegistryControllerannotations() != null) {
            setSendModules(r8lambdazcrctsujrig8adijz5sy7pjst3o.getSavedStateRegistryControllerannotations().booleanValue());
        }
        if (r8lambdazcrctsujrig8adijz5sy7pjst3o.PlaybackStateCompat() != null) {
            setIgnoredCheckIns(new ArrayList(r8lambdazcrctsujrig8adijz5sy7pjst3o.PlaybackStateCompat()));
        }
        if (r8lambdazcrctsujrig8adijz5sy7pjst3o.MediaSessionCompatToken() != null) {
            setIgnoredTransactions(new ArrayList(r8lambdazcrctsujrig8adijz5sy7pjst3o.MediaSessionCompatToken()));
        }
        if (r8lambdazcrctsujrig8adijz5sy7pjst3o.ParcelableVolumeInfo() != null) {
            setIgnoredErrors(new ArrayList(r8lambdazcrctsujrig8adijz5sy7pjst3o.ParcelableVolumeInfo()));
        }
        if (r8lambdazcrctsujrig8adijz5sy7pjst3o._init_lambda2() != null) {
            setEnableBackpressureHandling(r8lambdazcrctsujrig8adijz5sy7pjst3o._init_lambda2().booleanValue());
        }
        if (r8lambdazcrctsujrig8adijz5sy7pjst3o._init_lambda3() != null) {
            setEnableDatabaseTransactionTracing(r8lambdazcrctsujrig8adijz5sy7pjst3o._init_lambda3().booleanValue());
        }
        if (r8lambdazcrctsujrig8adijz5sy7pjst3o.ResultReceiver() != null) {
            setMaxRequestBodySize(r8lambdazcrctsujrig8adijz5sy7pjst3o.ResultReceiver());
        }
        if (r8lambdazcrctsujrig8adijz5sy7pjst3o.getOnBackPressedInput() != null) {
            setSendDefaultPii(r8lambdazcrctsujrig8adijz5sy7pjst3o.getOnBackPressedInput().booleanValue());
        }
        if (r8lambdazcrctsujrig8adijz5sy7pjst3o._init_lambda1() != null) {
            setCaptureOpenTelemetryEvents(r8lambdazcrctsujrig8adijz5sy7pjst3o._init_lambda1().booleanValue());
        }
        if (r8lambdazcrctsujrig8adijz5sy7pjst3o.defaultViewModelProviderFactory_delegatelambda0() != null) {
            setEnableSpotlight(r8lambdazcrctsujrig8adijz5sy7pjst3o.defaultViewModelProviderFactory_delegatelambda0().booleanValue());
        }
        if (r8lambdazcrctsujrig8adijz5sy7pjst3o.r8lambdawJ5MHcSJed_CjC7r4OWD0UxyJsQ() != null) {
            setSpotlightConnectionUrl(r8lambdazcrctsujrig8adijz5sy7pjst3o.r8lambdawJ5MHcSJed_CjC7r4OWD0UxyJsQ());
        }
        if (r8lambdazcrctsujrig8adijz5sy7pjst3o.fullyDrawnReporter_delegatelambda00() != null) {
            setGlobalHubMode(r8lambdazcrctsujrig8adijz5sy7pjst3o.fullyDrawnReporter_delegatelambda00());
        }
        if (r8lambdazcrctsujrig8adijz5sy7pjst3o.RemoteActionCompatParcelizer() != null) {
            if (getCron() == null) {
                setCron(r8lambdazcrctsujrig8adijz5sy7pjst3o.RemoteActionCompatParcelizer());
            } else {
                if (r8lambdazcrctsujrig8adijz5sy7pjst3o.RemoteActionCompatParcelizer().RemoteActionCompatParcelizer != null) {
                    getCron().RemoteActionCompatParcelizer = r8lambdazcrctsujrig8adijz5sy7pjst3o.RemoteActionCompatParcelizer().RemoteActionCompatParcelizer;
                }
                if (r8lambdazcrctsujrig8adijz5sy7pjst3o.RemoteActionCompatParcelizer().serializer != null) {
                    getCron().serializer = r8lambdazcrctsujrig8adijz5sy7pjst3o.RemoteActionCompatParcelizer().serializer;
                }
                if (r8lambdazcrctsujrig8adijz5sy7pjst3o.RemoteActionCompatParcelizer().read != null) {
                    getCron().read = r8lambdazcrctsujrig8adijz5sy7pjst3o.RemoteActionCompatParcelizer().read;
                }
                if (r8lambdazcrctsujrig8adijz5sy7pjst3o.RemoteActionCompatParcelizer().write != null) {
                    getCron().write = r8lambdazcrctsujrig8adijz5sy7pjst3o.RemoteActionCompatParcelizer().write;
                }
                if (r8lambdazcrctsujrig8adijz5sy7pjst3o.RemoteActionCompatParcelizer().IconCompatParcelizer != null) {
                    getCron().IconCompatParcelizer = r8lambdazcrctsujrig8adijz5sy7pjst3o.RemoteActionCompatParcelizer().IconCompatParcelizer;
                }
            }
        }
        if (r8lambdazcrctsujrig8adijz5sy7pjst3o._init_lambda4() != null) {
            getLogs().write = r8lambdazcrctsujrig8adijz5sy7pjst3o._init_lambda4().booleanValue();
        }
        if (r8lambdazcrctsujrig8adijz5sy7pjst3o.addObserverForBackInvoker() != null) {
            getMetrics().write = r8lambdazcrctsujrig8adijz5sy7pjst3o.addObserverForBackInvoker().booleanValue();
        }
        if (r8lambdazcrctsujrig8adijz5sy7pjst3o.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY() != null) {
            setProfileSessionSampleRate(r8lambdazcrctsujrig8adijz5sy7pjst3o.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY());
        }
        if (r8lambdazcrctsujrig8adijz5sy7pjst3o.r8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8() != null) {
            setProfilingTracesDirPath(r8lambdazcrctsujrig8adijz5sy7pjst3o.r8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8());
        }
        if (r8lambdazcrctsujrig8adijz5sy7pjst3o.r8lambda54BeH8ZsBru0CXI2CCSP2syNys() != null) {
            setProfileLifecycle(r8lambdazcrctsujrig8adijz5sy7pjst3o.r8lambda54BeH8ZsBru0CXI2CCSP2syNys());
        }
    }

    public void setSendClientReports(boolean z) {
        this.ComponentDialog = z;
        if (z) {
            this.serializer = new OkHttpCall$1(this);
        } else {
            this.serializer = new r8lambdaltuDxAr7dAFDPcRiZGPl8tHLtE8(15);
        }
    }

    public String getEnvironment() {
        String str = this.addOnNewIntentListener;
        return str != null ? str : "production";
    }

    public String getOutboxPath() {
        String cacheDirPath = getCacheDirPath();
        if (cacheDirPath == null) {
            return null;
        }
        return new File(cacheDirPath, "outbox").getAbsolutePath();
    }
}
