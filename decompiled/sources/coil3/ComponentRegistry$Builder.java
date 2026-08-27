package coil3;

import android.app.Application;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.graphics.Color;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.util.Log;
import androidx.cardview.widget.CardView$1;
import androidx.compose.ui.graphics.Fields;
import androidx.emoji2.text.EmojiProcessor;
import androidx.lifecycle.ViewModel;
import androidx.room.RoomDatabase$createConnectionManager$3;
import androidx.sqlite.SQLite;
import bo.app.af$$ExternalSyntheticOutline0;
import bo.app.bb$$ExternalSyntheticLambda0;
import bo.app.c8$$ExternalSyntheticOutline0;
import bo.app.d4$$ExternalSyntheticLambda2;
import bo.app.ff$$ExternalSyntheticOutline0;
import coil3.compose.AsyncImagePainter$launchJob$1;
import coil3.memory.MemoryCacheService;
import com.braze.IBraze$$ExternalSyntheticBUOutline0;
import com.deliveryhero.performance.core.analytics.TraceOverallRateLimitExceededException;
import com.deliveryhero.performance.core.analytics.TraceRateLimitExceededException;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import com.deliveryhero.perseus.Consent;
import com.deliveryhero.perseus.PerseusParamsConfig;
import com.deliveryhero.perseus.core.config.DefaultPerseusConfigProvider;
import com.deliveryhero.perseus.core.session.AppSessionManagerImpl;
import com.deliveryhero.perseus.core.session.ClientIdProviderImpl;
import com.deliveryhero.perseus.data.local.db.entity.HitEventFactory;
import com.deliveryhero.perseus.data.remote.api.model.HitDetails;
import com.deliveryhero.perseus.data.remote.api.model.HitsRequest;
import com.google.android.gms.common.api.Status;
import com.google.firebase.FirebaseApp;
import com.mapbox.common.Cancelable;
import com.mapbox.common.MapboxOptions;
import com.mapbox.maps.CameraBoundsOptions;
import com.mapbox.maps.MapIdleCallback;
import com.mapbox.maps.MapInitOptions;
import com.mapbox.maps.MapView;
import com.mapbox.maps.MapboxMap;
import com.mapbox.maps.Style;
import com.mapbox.maps.plugin.MapAttributionDelegateImpl;
import com.mapbox.maps.plugin.MapPlugin;
import com.mapbox.maps.plugin.Plugin;
import com.mapbox.maps.plugin.annotation.AnnotationPluginImpl;
import com.mapbox.maps.plugin.attribution.AttributionPluginImpl;
import com.mapbox.maps.plugin.attribution.generated.AttributionSettings;
import com.mapbox.maps.plugin.locationcomponent.LocationComponentPluginImpl;
import com.mapbox.navigator.R;
import com.roadrunner.customerchat.selfservice.domain.usecase.GetChatAssetDownloadAction;
import com.roadrunner.customerchat.selfservice.domain.usecase.GetChatAssetDownloadConfig;
import com.roadrunner.customerchat.usecase.TriggerChatAssetsDownloading;
import com.roadrunner.heatmap.domain.SaveHeatmapUrlImpl;
import com.roadrunner.heatmap.domain.ShouldShowHeatmap_Factory;
import com.roadrunner.home.HomeFragment;
import com.roadrunner.home.HomeViewModel;
import com.roadrunner.login.logging.RouterLogger;
import com.roadrunner.map.integration.mapbox.adapter.MapboxViewProxy;
import com.roadrunner.map.integration.mapbox.adapter.MapboxViewProxy$$ExternalSyntheticLambda0;
import com.roadrunner.map.integration.mapbox.domain.GetLineLayer;
import com.roadrunner.opportunities.data.OpportunitiesRepository;
import com.roadrunner.remoteconfig.firebase.FirebaseRemoteConfigImpl;
import com.roadrunner.remoteconfig.firebase.data.FirebaseRemoteConfigProvider;
import com.roadrunner.remoteconfig.helper.RemoteConfigHelperV2;
import com.roadrunner.rider.state.provider.domain.GetShiftInfoImpl;
import com.roadrunner.startingarea.domain.GetStartingAreaClosestCoordinateImpl$invoke$$inlined$map$1;
import curtains.internal.RootViewsSpy$Companion$install$1$1;
import io.grpc.internal.CallTracer;
import io.grpc.internal.DelayedClientCall$2;
import io.grpc.internal.SharedResourcePool;
import io.sentry.CombinedScopeView;
import io.sentry.SentryClient;
import io.sentry.android.core.SentryLogcatAdapter;
import io.sentry.android.core.SystemEventsBreadcrumbsIntegration;
import io.sentry.util.UrlUtils;
import java.io.File;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.DelayKt;
import kotlinx.coroutines.MainCoroutineDispatcher;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.FlowKt__ZipKt$combine$$inlined$unsafeFlow$1;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.internal.MainDispatcherLoader;
import kotlinx.coroutines.scheduling.DefaultScheduler;
import o.AdjustPurchaseVerificationResult;
import o.AndroidShadowContext_androidKt;
import o.AndroidUiDispatcherCompanioncurrentThread1;
import o.AndroidUiFrameClock;
import o.BlurFilter;
import o.ConstraintReferenceIncorrectConstraintException;
import o.ContentInViewNode;
import o.DragAndDropNodeacceptDragAndDropTransfer1;
import o.DragAndDropNodeonMovedinlinedfirstDescendantOrNull1;
import o.FontVariationSettingInt;
import o.ImageVectorBuilderGroupParams;
import o.ImageVectorCacheImageVectorEntry;
import o.LayoutCompat;
import o.LocaleListHelperMethods;
import o.ParentDataModifierDefaultImpls;
import o.PathOperation;
import o.SemanticsActions;
import o.SemanticsPropertiesLinkTestMarker1;
import o.ShadowContext;
import o.ShortNewsContentCardView;
import o.SimpleItemTouchHelperCallback;
import o.accessandjd;
import o.accessgetPolygoncp;
import o.accessgetRelayoutTimep;
import o.accessgetSdkEnablementProvidercp;
import o.accessgetSystemNavigationDowncp;
import o.accessgetTvInputComposite1cp;
import o.accessisMainThread;
import o.accessroleFakeNodeId;
import o.accesssetInstanceStoppedp;
import o.accesssetShouldRequestFrameworkListenToNetworkUpdatescp;
import o.accesssetSyncPolicyOfflineStatus;
import o.addSerializedCardJsonToStoragelambda1;
import o.buildShadow_SMYjrA;
import o.configureShadowFoewPVkdefault;
import o.copyeZhPAX0;
import o.createBrazeUserChangeEventSubscriberlambda01;
import o.createFromParcel;
import o.createOuterShadowBitmapCqks5Fs;
import o.eb;
import o.fromColorLong;
import o.g3;
import o.getActionList;
import o.getActionViewIntentlambda0;
import o.getAddressRegion;
import o.getBirthDateMonth;
import o.getCalendarEK5gGoQ;
import o.getCieXyz;
import o.getDoubleOrNull;
import o.getExponentimpl;
import o.getF3EK5gGoQ;
import o.getF4EK5gGoQ;
import o.getF5EK5gGoQ;
import o.getF8EK5gGoQ;
import o.getF9EK5gGoQ;
import o.getPresentationContext;
import o.getScrollRange;
import o.getSharedElementTargetNames;
import o.getStrokeTiuSbCo;
import o.h3;
import o.h5;
import o.h7;
import o.h9;
import o.hExternalSyntheticLambda1;
import o.hf;
import o.hgExternalSyntheticLambda1;
import o.hgExternalSyntheticLambda9;
import o.hh;
import o.i2;
import o.i2ExternalSyntheticLambda3;
import o.ihExternalSyntheticLambda2;
import o.ihExternalSyntheticLambda9;
import o.inCompatibilityMode;
import o.insertBasedOnParentOffset;
import o.instance_delegatelambda0;
import o.isMainThread;
import o.isOpenInternalroom_runtime;
import o.isPartiallyOffscreenInScrollParent;
import o.j2;
import o.j5;
import o.j6;
import o.ja;
import o.jb;
import o.jd;
import o.je;
import o.jf;
import o.jg;
import o.k1;
import o.k2;
import o.lambdaverifyPlayStorePurchase45;
import o.mergeJsonObjects;
import o.newTransaction;
import o.obtainCompositeBrush;
import o.onCapabilitiesChanged;
import o.onContentCardClicked;
import o.onContentCardDismissed;
import o.onMeasureChild;
import o.onViewAttachedToWindowlambda0;
import o.onViewDetachedFromWindowlambda1;
import o.postAnimationRunner;
import o.prepareForActivityTransitionCarryover;
import o.quadTo;
import o.r8lambda3kmCh7YKlPUi_5SMGAzRgcZHGLc;
import o.r8lambda7AJnrvTmYNN7kSbgXUEYtB0Niyw;
import o.r8lambda7Q1QCWXCUHrhcsGraulDg_ksbGU;
import o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0;
import o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM;
import o.r8lambdaXj9c8VIP9DfEvaTmZt0ejAuC4a4;
import o.r8lambdaguMkB96aaxyAGqCnh2xMDXoFAs;
import o.r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ;
import o.r8lambdapbG_fqEcit8CH1waoNmDxLhROlU;
import o.r8lambdaucGIgHn8fIyV_vccOdEafjFpEdk;
import o.r8lambdax3lltCpD3rATxa4vQpnFaaGbzP4;
import o.r8lambdaxtMbdW3_JzuVQlt1ETNPgAvo_g;
import o.r8lambdazJ_is40ErW_0zWXIHU0U2X8pyMM;
import o.removeNodeAtDepth;
import o.removeRearDisplayPresentationStatusListener;
import o.requestSingleLocationUpdatelambda1;
import o.roleFakeNodeId;
import o.se;
import o.setBlurFilter;
import o.setFill;
import o.setLayoutState;
import o.setMaxElementsWrap;
import o.setNativeShader;
import o.setPaddingBottom;
import o.setStateDescription;
import o.setVerticalBias;
import o.speculativeHit;
import o.t2ExternalSyntheticLambda1;
import o.toSvg;
import o.transferSessionPackageI;
import o.updateAdidI;
import o.updateRenderPath;
import okio.Options;
import org.koin.dsl.ModuleDSLKt;
import timber.log.Timber;

/* JADX INFO: loaded from: classes.dex */
public final class ComponentRegistry$Builder implements onViewDetachedFromWindowlambda1, BlurFilter, r8lambdaxtMbdW3_JzuVQlt1ETNPgAvo_g {
    private static int MediaBrowserCompatMediaItem = 0;
    private static int MediaSessionCompatQueueItem = 1;
    public Object IconCompatParcelizer;
    public final Object RemoteActionCompatParcelizer;
    public Object read;
    public Object serializer;
    public final Object write;

    public boolean read() {
        boolean zRemoteActionCompatParcelizer;
        synchronized (this) {
            Boolean bool = (Boolean) this.IconCompatParcelizer;
            if (bool != null) {
                zRemoteActionCompatParcelizer = bool.booleanValue();
            } else {
                try {
                    zRemoteActionCompatParcelizer = ((FirebaseApp) this.write).RemoteActionCompatParcelizer();
                } catch (IllegalStateException unused) {
                    zRemoteActionCompatParcelizer = false;
                }
            }
            Log.isLoggable("FirebaseCrashlytics", 3);
        }
        return zRemoteActionCompatParcelizer;
    }

    /* JADX WARN: Code duplicated, block: B:22:0x01a5 A[PHI: r2 r4
  0x01a5: PHI (r2v101 com.roadrunner.remoteconfig.firebase.FirebaseRemoteConfigImpl) = 
  (r2v96 com.roadrunner.remoteconfig.firebase.FirebaseRemoteConfigImpl)
  (r2v104 com.roadrunner.remoteconfig.firebase.FirebaseRemoteConfigImpl)
 binds: [B:20:0x01a2, B:17:0x0197] A[DONT_GENERATE, DONT_INLINE]
  0x01a5: PHI (r4v26 java.lang.String) = (r4v25 java.lang.String), (r4v28 java.lang.String) binds: [B:20:0x01a2, B:17:0x0197] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:43:0x028a  */
    /* JADX WARN: Code duplicated, block: B:45:0x028e  */
    /* JADX WARN: Code duplicated, block: B:46:0x0294  */
    public ComponentRegistry$Builder(jb jbVar, j6 j6Var, GetLineLayer getLineLayer, j2 j2Var, h5 h5Var, eb ebVar, i2ExternalSyntheticLambda3 i2externalsyntheticlambda3, Context context, SharedResourcePool sharedResourcePool, boolean z, fromColorLong fromcolorlong) {
        List list;
        String str;
        MapView mapView;
        FirebaseRemoteConfigImpl firebaseRemoteConfigImpl;
        String str2;
        this.write = j6Var;
        this.read = getLineLayer;
        this.RemoteActionCompatParcelizer = h5Var;
        this.IconCompatParcelizer = sharedResourcePool;
        i2 i2Var = i2externalsyntheticlambda3.read;
        Object objWrite = ((r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ) i2Var.MediaDescriptionCompat).write();
        objWrite.getClass();
        ja jaVar = (ja) objWrite;
        Object objWrite2 = ((r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ) i2Var.MediaBrowserCompatMediaItem).write();
        objWrite2.getClass();
        jf jfVar = (jf) objWrite2;
        Object objWrite3 = ((r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ) i2Var.write).write();
        objWrite3.getClass();
        ihExternalSyntheticLambda9 ihexternalsyntheticlambda9 = (ihExternalSyntheticLambda9) objWrite3;
        Object objWrite4 = ((r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ) i2Var.MediaMetadataCompat).write();
        objWrite4.getClass();
        getPresentationContext getpresentationcontext = (getPresentationContext) objWrite4;
        Object objWrite5 = ((r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ) i2Var.serializer).write();
        objWrite5.getClass();
        j5 j5Var = (j5) objWrite5;
        Object objWrite6 = ((r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ) i2Var.ParcelableVolumeInfo).write();
        objWrite6.getClass();
        jd jdVar = (jd) objWrite6;
        Object objWrite7 = ((r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ) i2Var.MediaSessionCompatResultReceiverWrapper).write();
        objWrite7.getClass();
        hf hfVar = (hf) objWrite7;
        Object objWrite8 = ((r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ) i2Var.RemoteActionCompatParcelizer).write();
        objWrite8.getClass();
        h9 h9Var = (h9) objWrite8;
        Object objWrite9 = ((r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ) i2Var.IconCompatParcelizer).write();
        objWrite9.getClass();
        ihExternalSyntheticLambda2 ihexternalsyntheticlambda2 = (ihExternalSyntheticLambda2) objWrite9;
        isMainThread ismainthread = new isMainThread(17);
        Object objWrite10 = ((r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ) i2Var.MediaSessionCompatQueueItem).write();
        objWrite10.getClass();
        h7 h7Var = (h7) objWrite10;
        Object objWrite11 = ((r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ) i2Var.RatingCompat).write();
        objWrite11.getClass();
        k2 k2Var = (k2) objWrite11;
        Object objWrite12 = ((r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ) i2Var.read).write();
        objWrite12.getClass();
        Application application = (Application) objWrite12;
        Object obj = ((getDoubleOrNull) i2Var.PlaybackStateCompat).write;
        obj.getClass();
        Object objWrite13 = ((r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ) i2Var.PlaybackStateCompatCustomAction).write();
        objWrite13.getClass();
        MapboxViewProxy mapboxViewProxy = new MapboxViewProxy(context, sharedResourcePool, fromcolorlong, jaVar, jfVar, ihexternalsyntheticlambda9, getpresentationcontext, j5Var, jdVar, hfVar, h9Var, ihexternalsyntheticlambda2, ismainthread, h7Var, k2Var, application, (k1) obj, (roleFakeNodeId) objWrite13);
        this.serializer = mapboxViewProxy;
        ebVar.RemoteActionCompatParcelizer.getClass();
        MapboxOptions.setAccessToken(h9Var.RemoteActionCompatParcelizer());
        List<Plugin> defaultPluginList = MapInitOptions.Companion.getDefaultPluginList();
        ShortNewsContentCardView shortNewsContentCardView = null;
        int i = 2;
        Set setMediaSessionCompatQueueItem = onContentCardClicked.MediaSessionCompatQueueItem(new SemanticsActions[]{new SemanticsActions("MAPBOX_LOGO_PLUGIN_ID", null), new SemanticsActions("MAPBOX_SCALEBAR_PLUGIN_ID", null)});
        defaultPluginList.getClass();
        Collection collectionWrite = onContentCardDismissed.write((Iterable) setMediaSessionCompatQueueItem);
        if (collectionWrite.isEmpty()) {
            List listPlaybackStateCompat = onContentCardDismissed.PlaybackStateCompat(defaultPluginList);
            int i2 = MediaSessionCompatQueueItem + 49;
            MediaBrowserCompatMediaItem = i2 % Fields.SpotShadowColor;
            int i3 = i2 % 2;
            int i4 = 2 % 2;
            list = listPlaybackStateCompat;
        } else {
            ArrayList arrayList = new ArrayList();
            int i5 = 2 % 2;
            for (Object obj2 : defaultPluginList) {
                if (!collectionWrite.contains(obj2)) {
                    arrayList.add(obj2);
                }
            }
            list = arrayList;
        }
        ja jaVar2 = mapboxViewProxy.MediaBrowserCompatMediaItem;
        boolean zWrite = ((ConstraintReferenceIncorrectConstraintException) jaVar2.read).write();
        transferSessionPackageI transfersessionpackagei = jaVar2.write;
        List listIconCompatParcelizer = instance_delegatelambda0.write;
        if (zWrite) {
            int i6 = MediaSessionCompatQueueItem + 93;
            MediaBrowserCompatMediaItem = i6 % Fields.SpotShadowColor;
            if (i6 % 2 != 0) {
                firebaseRemoteConfigImpl = (FirebaseRemoteConfigImpl) transfersessionpackagei;
                str2 = firebaseRemoteConfigImpl.read.read();
                int i7 = 10 / 0;
                if (str2 != null) {
                    FirebaseRemoteConfigProvider firebaseRemoteConfigProvider = firebaseRemoteConfigImpl.IconCompatParcelizer;
                    r8lambda3kmCh7YKlPUi_5SMGAzRgcZHGLc r8lambda3kmch7yklpui_5smgazrgczhglc = RemoteConfigHelperV2.RemoteActionCompatParcelizer;
                    listIconCompatParcelizer = RemoteConfigHelperV2.IconCompatParcelizer(firebaseRemoteConfigProvider.read("map_style_dark"), str2, listIconCompatParcelizer);
                }
            } else {
                firebaseRemoteConfigImpl = (FirebaseRemoteConfigImpl) transfersessionpackagei;
                str2 = firebaseRemoteConfigImpl.read.read();
                if (str2 != null) {
                    FirebaseRemoteConfigProvider firebaseRemoteConfigProvider2 = firebaseRemoteConfigImpl.IconCompatParcelizer;
                    r8lambda3kmCh7YKlPUi_5SMGAzRgcZHGLc r8lambda3kmch7yklpui_5smgazrgczhglc2 = RemoteConfigHelperV2.RemoteActionCompatParcelizer;
                    listIconCompatParcelizer = RemoteConfigHelperV2.IconCompatParcelizer(firebaseRemoteConfigProvider2.read("map_style_dark"), str2, listIconCompatParcelizer);
                }
            }
            int i8 = 2 % 2;
            str = (String) onContentCardDismissed.MediaMetadataCompat(listIconCompatParcelizer);
            if (str == null) {
                str = Style.DARK;
            }
        } else {
            FirebaseRemoteConfigImpl firebaseRemoteConfigImpl2 = (FirebaseRemoteConfigImpl) transfersessionpackagei;
            String str3 = firebaseRemoteConfigImpl2.read.read();
            if (str3 != null) {
                FirebaseRemoteConfigProvider firebaseRemoteConfigProvider3 = firebaseRemoteConfigImpl2.IconCompatParcelizer;
                r8lambda3kmCh7YKlPUi_5SMGAzRgcZHGLc r8lambda3kmch7yklpui_5smgazrgczhglc3 = RemoteConfigHelperV2.RemoteActionCompatParcelizer;
                listIconCompatParcelizer = RemoteConfigHelperV2.IconCompatParcelizer(firebaseRemoteConfigProvider3.read("map_style"), str3, listIconCompatParcelizer);
            }
            str = (String) onContentCardDismissed.MediaMetadataCompat(listIconCompatParcelizer);
            if (str == null) {
                int i9 = MediaSessionCompatQueueItem + 97;
                MediaBrowserCompatMediaItem = i9 % Fields.SpotShadowColor;
                int i10 = i9 % 2;
                str = Style.MAPBOX_STREETS;
            }
        }
        MapView mapView2 = new MapView(context, new MapInitOptions(context, null, list, null, false, str, null, 0, null, 474, null));
        mapboxViewProxy.MediaMetadataCompat = mapView2;
        mapView2.setTag("map_view_tag");
        MapPlugin plugin = mapView2.getPlugin("MAPBOX_ATTRIBUTION_PLUGIN_ID");
        plugin.getClass();
        AttributionPluginImpl attributionPluginImpl = (AttributionPluginImpl) plugin;
        AttributionSettings attributionSettings = attributionPluginImpl.internalSettings;
        if (attributionSettings.enabled) {
            Color.parseColor("#FF1E8CAB");
            attributionPluginImpl.internalSettings = new AttributionSettings(false, attributionSettings.iconColor, attributionSettings.position, attributionSettings.marginLeft, attributionSettings.marginTop, attributionSettings.marginRight, attributionSettings.marginBottom, attributionSettings.clickable);
            attributionPluginImpl.applySettings();
        }
        MapAttributionDelegateImpl mapAttributionDelegateImpl = attributionPluginImpl.mapAttributionDelegate;
        if (mapAttributionDelegateImpl == null) {
            removeNodeAtDepth.serializer("mapAttributionDelegate");
            throw null;
        }
        mapAttributionDelegateImpl.mapTelemetry.setUserTelemetryRequestState(z);
        if (!(!ModuleDSLKt.RemoteActionCompatParcelizer(mapboxViewProxy.RemoteActionCompatParcelizer))) {
            mapView = mapboxViewProxy.MediaMetadataCompat;
            if (mapView != null) {
                removeNodeAtDepth.serializer("mapView");
                throw null;
            }
            mapView.setMaximumFps(30);
        } else {
            int i11 = MediaBrowserCompatMediaItem + 23;
            MediaSessionCompatQueueItem = i11 % Fields.SpotShadowColor;
            int i12 = i11 % 2;
            FirebaseRemoteConfigProvider firebaseRemoteConfigProvider4 = ((FirebaseRemoteConfigImpl) mapboxViewProxy.MediaSessionCompatToken.write).IconCompatParcelizer;
            Set setRemoteActionCompatParcelizer = firebaseRemoteConfigProvider4.RemoteActionCompatParcelizer("lrtmi_android_fps_reduction_device_models");
            Set setRemoteActionCompatParcelizer2 = firebaseRemoteConfigProvider4.RemoteActionCompatParcelizer("lrtmi_android_fps_reduction_soc_names");
            String str4 = Build.MODEL;
            str4.getClass();
            if (UrlUtils.IconCompatParcelizer(setRemoteActionCompatParcelizer, setRemoteActionCompatParcelizer2, str4, isPartiallyOffscreenInScrollParent.serializer())) {
                mapView = mapboxViewProxy.MediaMetadataCompat;
                if (mapView != null) {
                    removeNodeAtDepth.serializer("mapView");
                    throw null;
                }
                mapView.setMaximumFps(30);
            }
        }
        MapView mapView3 = mapboxViewProxy.MediaMetadataCompat;
        if (mapView3 == null) {
            removeNodeAtDepth.serializer("mapView");
            throw null;
        }
        jg jgVar = mapboxViewProxy.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY.write;
        AndroidUiDispatcherCompanioncurrentThread1 androidUiDispatcherCompanioncurrentThread1 = new AndroidUiDispatcherCompanioncurrentThread1(17);
        hExternalSyntheticLambda1 hexternalsyntheticlambda1 = new hExternalSyntheticLambda1();
        Object objWrite14 = jgVar.read.write();
        objWrite14.getClass();
        mapboxViewProxy.ResultReceiver = new je(mapView3, androidUiDispatcherCompanioncurrentThread1, hexternalsyntheticlambda1, (transferSessionPackageI) objWrite14);
        MapView mapView4 = mapboxViewProxy.MediaMetadataCompat;
        if (mapView4 == null) {
            removeNodeAtDepth.serializer("mapView");
            throw null;
        }
        MapPlugin plugin2 = mapView4.getPlugin("MAPBOX_ANNOTATION_PLUGIN_ID");
        plugin2.getClass();
        RoomDatabase$createConnectionManager$3 roomDatabase$createConnectionManager$3 = new RoomDatabase$createConnectionManager$3(2, hfVar, hf.class, "onMarkerClicked", "onMarkerClicked$mapbox(Ljava/lang/String;Ljava/lang/String;)V", 0, 3);
        RouterLogger routerLogger = mapboxViewProxy.PlaybackStateCompat.IconCompatParcelizer;
        Object objWrite15 = ((r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ) routerLogger.read).write();
        objWrite15.getClass();
        mapboxViewProxy.serializer = new CallTracer((transferSessionPackageI) objWrite15, new setLayoutState(1), (AnnotationPluginImpl) plugin2, roomDatabase$createConnectionManager$3, (h3) ((postAnimationRunner) routerLogger.serializer).write());
        HomeFragment.AnonymousClass1 anonymousClass1 = new HomeFragment.AnonymousClass1(1, mapboxViewProxy.write, ihExternalSyntheticLambda2.class, "applyClusterStyle", "applyClusterStyle(Lcom/mapbox/maps/Style;)V", 0, 24);
        MapView mapView5 = mapboxViewProxy.MediaMetadataCompat;
        if (mapView5 == null) {
            removeNodeAtDepth.serializer("mapView");
            throw null;
        }
        MapboxMap mapboxMapDeprecated = mapView5.getMapboxMapDeprecated();
        mapboxMapDeprecated.getClass();
        mapboxMapDeprecated.getStyle(new hh(anonymousClass1));
        MapView mapView6 = mapboxViewProxy.MediaMetadataCompat;
        if (mapView6 == null) {
            removeNodeAtDepth.serializer("mapView");
            throw null;
        }
        int i13 = MediaSessionCompatQueueItem + 59;
        MediaBrowserCompatMediaItem = i13 % Fields.SpotShadowColor;
        int i14 = i13 % 2;
        LocationComponentPluginImpl locationComponent = DelayKt.getLocationComponent(mapView6);
        MapView mapView7 = mapboxViewProxy.MediaMetadataCompat;
        if (mapView7 == null) {
            removeNodeAtDepth.serializer("mapView");
            throw null;
        }
        Context applicationContext = mapView7.getContext().getApplicationContext();
        applicationContext.getClass();
        locationComponent.setLocationProvider(new CombinedScopeView(applicationContext, mapboxViewProxy.RatingCompat));
        MapView mapView8 = mapboxViewProxy.MediaMetadataCompat;
        if (mapView8 == null) {
            removeNodeAtDepth.serializer("mapView");
            throw null;
        }
        MapboxMap mapboxMapDeprecated2 = mapView8.getMapboxMapDeprecated();
        mapboxMapDeprecated2.getClass();
        mapboxMapDeprecated2.getBounds().toString();
        CameraBoundsOptions cameraBoundsOptionsBuild = new CameraBoundsOptions.Builder().minZoom(Double.valueOf(1.0d)).maxZoom(Double.valueOf(22.0d)).build();
        cameraBoundsOptionsBuild.getClass();
        mapboxMapDeprecated2.setBounds(cameraBoundsOptionsBuild);
        mapboxMapDeprecated2.cameraAnimationsPlugin(new MapboxViewProxy$$ExternalSyntheticLambda0(mapboxViewProxy, i));
        MapView mapView9 = mapboxViewProxy.MediaMetadataCompat;
        if (mapView9 == null) {
            removeNodeAtDepth.serializer("mapView");
            throw null;
        }
        MapboxMap mapboxMapDeprecated3 = mapView9.getMapboxMapDeprecated();
        hgExternalSyntheticLambda9 hgexternalsyntheticlambda9 = (hgExternalSyntheticLambda9) hfVar.RemoteActionCompatParcelizer.MediaSessionCompatResultReceiverWrapper();
        mapboxMapDeprecated3.getClass();
        hgexternalsyntheticlambda9.getClass();
        mapboxMapDeprecated3.gesturesPlugin(new RootViewsSpy$Companion$install$1$1(6, hgexternalsyntheticlambda9));
        MapboxMap mapboxMapDeprecated4 = mapView9.getMapboxMapDeprecated();
        hgExternalSyntheticLambda1 hgexternalsyntheticlambda1 = (hgExternalSyntheticLambda1) hfVar.RatingCompat.MediaSessionCompatResultReceiverWrapper();
        mapboxMapDeprecated4.getClass();
        hgexternalsyntheticlambda1.getClass();
        mapboxMapDeprecated4.gesturesPlugin(new RootViewsSpy$Companion$install$1$1(7, hgexternalsyntheticlambda1));
        Cancelable cancelable = hfVar.write;
        if (cancelable != null) {
            cancelable.cancel();
        }
        hfVar.write = mapView9.getMapboxMapDeprecated().subscribeMapIdle((MapIdleCallback) hfVar.serializer.MediaSessionCompatResultReceiverWrapper());
        hfVar.read = mapView9;
        je jeVar = mapboxViewProxy.ResultReceiver;
        if (jeVar == null) {
            removeNodeAtDepth.serializer("viewAnnotationManager");
            throw null;
        }
        if (((Boolean) FirebaseRemoteConfigImpl.RemoteActionCompatParcelizer(1762727223, R.serializer(), R.serializer(), -1762727220, R.serializer(), R.serializer(), new Object[]{(FirebaseRemoteConfigImpl) jeVar.RatingCompat, updateAdidI.IS_ACTIONABLE_PINS_ENABLED})).booleanValue()) {
            r8lambda7Q1QCWXCUHrhcsGraulDg_ksbGU r8lambda7q1qcwxcuhrhcsgrauldg_ksbgu = jeVar.IconCompatParcelizer;
            if (r8lambda7q1qcwxcuhrhcsgrauldg_ksbgu != null) {
                int i15 = MediaSessionCompatQueueItem + 35;
                MediaBrowserCompatMediaItem = i15 % Fields.SpotShadowColor;
                int i16 = i15 % 2;
                r8lambda7q1qcwxcuhrhcsgrauldg_ksbgu.write((CancellationException) null);
            }
            jeVar.IconCompatParcelizer = BuildersKt.RemoteActionCompatParcelizer(mapboxViewProxy.read, null, null, new AsyncImagePainter$launchJob$1(hfVar, jeVar, shortNewsContentCardView, 26), 3);
        }
        ((g3) this.serializer).write();
        int i17 = MediaSessionCompatQueueItem + 71;
        MediaBrowserCompatMediaItem = i17 % Fields.SpotShadowColor;
        int i18 = i17 % 2;
    }

    public static ComponentRegistry$Builder RemoteActionCompatParcelizer(SharedPreferences sharedPreferences, ScheduledThreadPoolExecutor scheduledThreadPoolExecutor) {
        ComponentRegistry$Builder componentRegistry$Builder = new ComponentRegistry$Builder(sharedPreferences, scheduledThreadPoolExecutor);
        synchronized (((ArrayDeque) componentRegistry$Builder.IconCompatParcelizer)) {
            ((ArrayDeque) componentRegistry$Builder.IconCompatParcelizer).clear();
            String string = ((SharedPreferences) componentRegistry$Builder.write).getString((String) componentRegistry$Builder.read, "");
            if (!TextUtils.isEmpty(string) && string.contains((String) componentRegistry$Builder.RemoteActionCompatParcelizer)) {
                String[] strArrSplit = string.split((String) componentRegistry$Builder.RemoteActionCompatParcelizer, -1);
                if (strArrSplit.length == 0) {
                    SentryLogcatAdapter.serializer("FirebaseMessaging", "Corrupted queue. Please check the queue contents and item separator provided");
                }
                for (String str : strArrSplit) {
                    if (!TextUtils.isEmpty(str)) {
                        ((ArrayDeque) componentRegistry$Builder.IconCompatParcelizer).add(str);
                    }
                }
                return componentRegistry$Builder;
            }
            return componentRegistry$Builder;
        }
    }

    @Override // o.DropShadowRenderer
    public void RemoteActionCompatParcelizer() {
        ((ConcurrentHashMap) ((MemoryCacheService) this.read).RemoteActionCompatParcelizer).clear();
        Iterator it = ((CopyOnWriteArrayList) this.RemoteActionCompatParcelizer).iterator();
        while (it.hasNext()) {
            ((ShadowContext) it.next()).RemoteActionCompatParcelizer();
        }
        configureShadowFoewPVkdefault configureshadowfoewpvkdefault = (configureShadowFoewPVkdefault) this.serializer;
        if (configureshadowfoewpvkdefault != null) {
            synchronized (configureshadowfoewpvkdefault.read) {
                configureshadowfoewpvkdefault.IconCompatParcelizer = Long.MIN_VALUE;
                configureshadowfoewpvkdefault.write = 0;
                createOuterShadowBitmapCqks5Fs createoutershadowbitmapcqks5fs = configureshadowfoewpvkdefault.serializer;
                createoutershadowbitmapcqks5fs.RemoteActionCompatParcelizer = -1L;
                createoutershadowbitmapcqks5fs.read = 0;
            }
            synchronized (configureshadowfoewpvkdefault.RemoteActionCompatParcelizer) {
                configureshadowfoewpvkdefault.RatingCompat.clear();
                configureshadowfoewpvkdefault.MediaDescriptionCompat = Long.MIN_VALUE;
                createOuterShadowBitmapCqks5Fs createoutershadowbitmapcqks5fs2 = configureshadowfoewpvkdefault.MediaBrowserCompatMediaItem;
                createoutershadowbitmapcqks5fs2.RemoteActionCompatParcelizer = -1L;
                createoutershadowbitmapcqks5fs2.read = 0;
            }
        }
    }

    public getBirthDateMonth serializer(DragAndDropNodeonMovedinlinedfirstDescendantOrNull1 dragAndDropNodeonMovedinlinedfirstDescendantOrNull1, r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k0) {
        int i;
        int i2;
        int i3;
        createBrazeUserChangeEventSubscriberlambda01 createbrazeuserchangeeventsubscriberlambda01 = new createBrazeUserChangeEventSubscriberlambda01();
        createbrazeuserchangeeventsubscriberlambda01.read = -1;
        synchronized (this.write) {
            Throwable th = (Throwable) this.read;
            if (th != null) {
                dragAndDropNodeonMovedinlinedfirstDescendantOrNull1.RemoteActionCompatParcelizer(th);
                return getAddressRegion.RemoteActionCompatParcelizer;
            }
            DragAndDropNodeacceptDragAndDropTransfer1 dragAndDropNodeacceptDragAndDropTransfer1 = (DragAndDropNodeacceptDragAndDropTransfer1) this.RemoteActionCompatParcelizer;
            do {
                i = dragAndDropNodeacceptDragAndDropTransfer1.get();
                i2 = i + 1;
            } while (!dragAndDropNodeacceptDragAndDropTransfer1.compareAndSet(i, i2));
            int i4 = 1;
            boolean z = (134217727 & i2) == 1;
            createbrazeuserchangeeventsubscriberlambda01.read = (i2 >>> 27) & 15;
            ((ContentInViewNode) this.IconCompatParcelizer).read(dragAndDropNodeonMovedinlinedfirstDescendantOrNull1);
            if (z && r8lambdardpfsr94j4iebcwx_kpqzpm8k0 != null) {
                try {
                    r8lambdardpfsr94j4iebcwx_kpqzpm8k0.invoke();
                } catch (Throwable th2) {
                    synchronized (this.write) {
                        if (((Throwable) this.read) == null) {
                            this.read = th2;
                            ContentInViewNode contentInViewNode = (ContentInViewNode) this.IconCompatParcelizer;
                            Object[] objArr = contentInViewNode.read;
                            int i5 = contentInViewNode.IconCompatParcelizer;
                            for (int i6 = 0; i6 < i5; i6++) {
                                ((DragAndDropNodeonMovedinlinedfirstDescendantOrNull1) objArr[i6]).RemoteActionCompatParcelizer(th2);
                            }
                            ((ContentInViewNode) this.IconCompatParcelizer).IconCompatParcelizer();
                            DragAndDropNodeacceptDragAndDropTransfer1 dragAndDropNodeacceptDragAndDropTransfer2 = (DragAndDropNodeacceptDragAndDropTransfer1) this.RemoteActionCompatParcelizer;
                            do {
                                i3 = dragAndDropNodeacceptDragAndDropTransfer2.get();
                            } while (!dragAndDropNodeacceptDragAndDropTransfer2.compareAndSet(i3, ((((i3 >>> 27) & 15) + 1) & 15) << 27));
                        }
                    }
                }
            }
            return new CardView$1(new bb$$ExternalSyntheticLambda0(dragAndDropNodeonMovedinlinedfirstDescendantOrNull1, this, createbrazeuserchangeeventsubscriberlambda01, i4));
        }
    }

    public void serializer(r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm) {
        int i;
        synchronized (this.write) {
            ContentInViewNode contentInViewNode = (ContentInViewNode) this.IconCompatParcelizer;
            this.IconCompatParcelizer = (ContentInViewNode) this.serializer;
            this.serializer = contentInViewNode;
            DragAndDropNodeacceptDragAndDropTransfer1 dragAndDropNodeacceptDragAndDropTransfer1 = (DragAndDropNodeacceptDragAndDropTransfer1) this.RemoteActionCompatParcelizer;
            do {
                i = dragAndDropNodeacceptDragAndDropTransfer1.get();
            } while (!dragAndDropNodeacceptDragAndDropTransfer1.compareAndSet(i, ((((i >>> 27) & 15) + 1) & 15) << 27));
            int i2 = contentInViewNode.IconCompatParcelizer;
            for (int i3 = 0; i3 < i2; i3++) {
                r8lambdaunavo3sxub_pc9xroryotnrlvsm.invoke(contentInViewNode.RemoteActionCompatParcelizer(i3));
            }
            contentInViewNode.IconCompatParcelizer();
        }
    }

    @Override // o.DropShadowRenderer
    public void serializer(String str) {
        Integer numRemoteActionCompatParcelizer;
        obtainCompositeBrush obtaincompositebrush;
        buildShadow_SMYjrA buildshadow_smyjraWrite;
        str.getClass();
        configureShadowFoewPVkdefault configureshadowfoewpvkdefault = (configureShadowFoewPVkdefault) this.serializer;
        if (configureshadowfoewpvkdefault != null) {
            long jLongValue = ((Number) configureshadowfoewpvkdefault.MediaSessionCompatQueueItem.invoke()).longValue();
            synchronized (configureshadowfoewpvkdefault.read) {
                long j = configureshadowfoewpvkdefault.IconCompatParcelizer;
                if (j == Long.MIN_VALUE) {
                    configureshadowfoewpvkdefault.IconCompatParcelizer = jLongValue;
                } else if (jLongValue - j >= 60000) {
                    configureshadowfoewpvkdefault.IconCompatParcelizer = jLongValue;
                    configureshadowfoewpvkdefault.write = 0;
                }
                int i = configureshadowfoewpvkdefault.write + 1;
                configureshadowfoewpvkdefault.write = i;
                obtaincompositebrush = (i == 101 && (numRemoteActionCompatParcelizer = configureshadowfoewpvkdefault.RemoteActionCompatParcelizer(configureshadowfoewpvkdefault.serializer, jLongValue)) != null) ? new obtainCompositeBrush(str, configureshadowfoewpvkdefault.write, numRemoteActionCompatParcelizer.intValue()) : null;
            }
            if (obtaincompositebrush != null) {
                Timber.Forest forest = Timber.RemoteActionCompatParcelizer;
                forest.RemoteActionCompatParcelizer("TraceRateLimitWarner");
                forest.write(new TraceOverallRateLimitExceededException(obtaincompositebrush.RemoteActionCompatParcelizer(), obtaincompositebrush.read(), obtaincompositebrush.write()));
            }
            synchronized (configureshadowfoewpvkdefault.RemoteActionCompatParcelizer) {
                buildshadow_smyjraWrite = configureshadowfoewpvkdefault.write(jLongValue, str);
            }
            if (buildshadow_smyjraWrite != null) {
                Timber.Forest forest2 = Timber.RemoteActionCompatParcelizer;
                forest2.RemoteActionCompatParcelizer("TraceRateLimitWarner");
                forest2.read(new TraceRateLimitExceededException(buildshadow_smyjraWrite.write(), buildshadow_smyjraWrite.read(), buildshadow_smyjraWrite.serializer()));
            }
        }
        if (!((MemoryCacheService) this.read).serializer(str)) {
            RemoteActionCompatParcelizer(str);
            ((MemoryCacheService) this.read).serializer(str);
        }
        Iterator it = ((CopyOnWriteArrayList) this.RemoteActionCompatParcelizer).iterator();
        while (it.hasNext()) {
            ((ShadowContext) it.next()).serializer(str);
        }
        Iterator it2 = ((CopyOnWriteArrayList) this.IconCompatParcelizer).iterator();
        while (it2.hasNext()) {
            ((setBlurFilter) it2.next()).IconCompatParcelizer(str);
        }
    }

    public void IconCompatParcelizer(getExponentimpl getexponentimpl, List list, int i, getF3EK5gGoQ getf3ek5ggoq, EmojiProcessor emojiProcessor) {
        int i2;
        String str;
        String str2;
        long jLastModified;
        if (i == 0) {
            ((Boolean) Options.Companion.read(SystemEventsBreadcrumbsIntegration.SystemEventsBroadcastReceiver.write(), 1921293490, SystemEventsBreadcrumbsIntegration.SystemEventsBroadcastReceiver.write(), SystemEventsBreadcrumbsIntegration.SystemEventsBroadcastReceiver.write(), new Object[]{2}, SystemEventsBreadcrumbsIntegration.SystemEventsBroadcastReceiver.write(), -1921293486)).booleanValue();
            i2 = 0;
        } else {
            i2 = i;
        }
        if (i2 >= list.size()) {
            String strConcat = "There is no valid resource for the container: ".concat(String.valueOf((String) ((SentryClient) getexponentimpl.read).RemoteActionCompatParcelizer));
            ((Boolean) Options.Companion.read(SystemEventsBreadcrumbsIntegration.SystemEventsBroadcastReceiver.write(), 1921293490, SystemEventsBreadcrumbsIntegration.SystemEventsBroadcastReceiver.write(), SystemEventsBreadcrumbsIntegration.SystemEventsBroadcastReceiver.write(), new Object[]{2}, SystemEventsBreadcrumbsIntegration.SystemEventsBroadcastReceiver.write(), -1921293486)).booleanValue();
            getf3ek5ggoq.IconCompatParcelizer(new getF5EK5gGoQ(new Status(16, strConcat, null, null), ((Integer) list.get(i2 - 1)).intValue(), null, null));
            return;
        }
        int iIntValue = ((Integer) list.get(i2)).intValue();
        if (iIntValue != 0) {
            if (iIntValue == 1) {
                SentryClient sentryClient = (SentryClient) getexponentimpl.read;
                Object obj = sentryClient.RemoteActionCompatParcelizer;
                ((Boolean) Options.Companion.read(SystemEventsBreadcrumbsIntegration.SystemEventsBroadcastReceiver.write(), 1921293490, SystemEventsBreadcrumbsIntegration.SystemEventsBroadcastReceiver.write(), SystemEventsBreadcrumbsIntegration.SystemEventsBroadcastReceiver.write(), new Object[]{2}, SystemEventsBreadcrumbsIntegration.SystemEventsBroadcastReceiver.write(), -1921293486)).booleanValue();
                EmojiProcessor emojiProcessor2 = (EmojiProcessor) this.read;
                String strWrite = sentryClient.write();
                getF4EK5gGoQ getf4ek5ggoq = new getF4EK5gGoQ(this, 1, getexponentimpl, list, i2, getf3ek5ggoq, null);
                emojiProcessor2.getClass();
                ((ExecutorService) emojiProcessor2.read).execute(new DelayedClientCall$2(emojiProcessor2, strWrite, getf4ek5ggoq, 3));
                return;
            }
            if (iIntValue == 2) {
                SentryClient sentryClient2 = (SentryClient) getexponentimpl.read;
                Object obj2 = sentryClient2.RemoteActionCompatParcelizer;
                ((Boolean) Options.Companion.read(SystemEventsBreadcrumbsIntegration.SystemEventsBroadcastReceiver.write(), 1921293490, SystemEventsBreadcrumbsIntegration.SystemEventsBroadcastReceiver.write(), SystemEventsBreadcrumbsIntegration.SystemEventsBroadcastReceiver.write(), new Object[]{2}, SystemEventsBreadcrumbsIntegration.SystemEventsBroadcastReceiver.write(), -1921293486)).booleanValue();
                EmojiProcessor emojiProcessor3 = (EmojiProcessor) this.read;
                String strWrite2 = sentryClient2.write();
                String str3 = (String) sentryClient2.MediaBrowserCompatMediaItem;
                getF4EK5gGoQ getf4ek5ggoq2 = new getF4EK5gGoQ(this, 2, getexponentimpl, list, i2, getf3ek5ggoq, null);
                emojiProcessor3.getClass();
                ((ExecutorService) emojiProcessor3.read).execute(new ImageVectorCacheImageVectorEntry(emojiProcessor3, strWrite2, str3, getf4ek5ggoq2, 3));
                return;
            }
            IBraze$$ExternalSyntheticBUOutline0.m(c8$$ExternalSyntheticOutline0.m(i2, "Unknown fetching source: "));
            return;
        }
        SentryClient sentryClient3 = (SentryClient) getexponentimpl.read;
        getF8EK5gGoQ getf8ek5ggoq = (getF8EK5gGoQ) ((HashMap) this.IconCompatParcelizer).get((String) sentryClient3.RemoteActionCompatParcelizer);
        if (!((SentryClient) getexponentimpl.read).IconCompatParcelizer) {
            if (getf8ek5ggoq != null) {
                jLastModified = getf8ek5ggoq.serializer;
            } else {
                File fileRemoteActionCompatParcelizer = ((EmojiProcessor) this.read).RemoteActionCompatParcelizer((String) sentryClient3.RemoteActionCompatParcelizer);
                jLastModified = fileRemoteActionCompatParcelizer.exists() ? fileRemoteActionCompatParcelizer.lastModified() : 0L;
            }
            ((accessgetTvInputComposite1cp) this.RemoteActionCompatParcelizer).getClass();
            if (jLastModified + 900000 >= System.currentTimeMillis()) {
                IconCompatParcelizer(getexponentimpl, list, 1 + i2, getf3ek5ggoq, emojiProcessor);
                return;
            }
        }
        HashMap map = (HashMap) this.serializer;
        SentryClient sentryClient4 = (SentryClient) getexponentimpl.read;
        if (sentryClient4 == null) {
            str = "";
        } else {
            str = (String) sentryClient4.RemoteActionCompatParcelizer;
        }
        getF9EK5gGoQ getf9ek5ggoq = (getF9EK5gGoQ) map.get(str);
        if (getf9ek5ggoq == null) {
            getf9ek5ggoq = new getF9EK5gGoQ();
            SentryClient sentryClient5 = (SentryClient) getexponentimpl.read;
            if (sentryClient5 == null) {
                str2 = "";
            } else {
                str2 = (String) sentryClient5.RemoteActionCompatParcelizer;
            }
            map.put(str2, getf9ek5ggoq);
        }
        getF9EK5gGoQ getf9ek5ggoq2 = getf9ek5ggoq;
        ((Boolean) Options.Companion.read(SystemEventsBreadcrumbsIntegration.SystemEventsBroadcastReceiver.write(), 1921293490, SystemEventsBreadcrumbsIntegration.SystemEventsBroadcastReceiver.write(), SystemEventsBreadcrumbsIntegration.SystemEventsBroadcastReceiver.write(), new Object[]{2}, SystemEventsBreadcrumbsIntegration.SystemEventsBroadcastReceiver.write(), -1921293486)).booleanValue();
        Context context = (Context) this.write;
        getF4EK5gGoQ getf4ek5ggoq3 = new getF4EK5gGoQ(this, 0, getexponentimpl, list, i2, getf3ek5ggoq, emojiProcessor);
        synchronized (getf9ek5ggoq2) {
            ScheduledFuture scheduledFuture = getf9ek5ggoq2.RemoteActionCompatParcelizer;
            if (scheduledFuture != null) {
                scheduledFuture.cancel(false);
            }
            getf9ek5ggoq2.RemoteActionCompatParcelizer = getf9ek5ggoq2.serializer.schedule(new r8lambdapbG_fqEcit8CH1waoNmDxLhROlU(context, getexponentimpl, getf4ek5ggoq3), 0L, TimeUnit.MILLISECONDS);
        }
    }

    @Override // o.onViewDetachedFromWindowlambda1
    public boolean MediaSessionCompatToken() {
        int i = 2 % 2;
        int i2 = MediaSessionCompatQueueItem;
        int i3 = i2 + 83;
        int i4 = i3 % Fields.SpotShadowColor;
        MediaBrowserCompatMediaItem = i4;
        int i5 = i3 % 2;
        if (((ViewModel) this.serializer) != null) {
            int i6 = i2 + 53;
            MediaBrowserCompatMediaItem = i6 % Fields.SpotShadowColor;
            return i6 % 2 == 0;
        }
        int i7 = i4 + 13;
        MediaSessionCompatQueueItem = i7 % Fields.SpotShadowColor;
        if (i7 % 2 != 0) {
            return false;
        }
        throw null;
    }

    public void IconCompatParcelizer(toSvg tosvg, r8lambdaucGIgHn8fIyV_vccOdEafjFpEdk r8lambdaucgighn8fiyv_vccodeafjfpedk) {
        int i = 2 % 2;
        ((ArrayList) this.IconCompatParcelizer).add(new d4$$ExternalSyntheticLambda2(tosvg, 15, r8lambdaucgighn8fiyv_vccodeafjfpedk));
        int i2 = MediaBrowserCompatMediaItem + 39;
        MediaSessionCompatQueueItem = i2 % Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // o.BlurFilter
    public void read(setBlurFilter setblurfilter) {
        int i = 2 % 2;
        int i2 = MediaBrowserCompatMediaItem + 89;
        MediaSessionCompatQueueItem = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        CopyOnWriteArrayList copyOnWriteArrayList = (CopyOnWriteArrayList) this.IconCompatParcelizer;
        if (copyOnWriteArrayList.contains(setblurfilter)) {
            int i4 = MediaBrowserCompatMediaItem + 45;
            MediaSessionCompatQueueItem = i4 % Fields.SpotShadowColor;
            if (i4 % 2 != 0) {
                return;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        copyOnWriteArrayList.add(setblurfilter);
        int i5 = MediaBrowserCompatMediaItem + 71;
        MediaSessionCompatQueueItem = i5 % Fields.SpotShadowColor;
        if (i5 % 2 == 0) {
            int i6 = 55 / 0;
        }
    }

    public void IconCompatParcelizer(accessgetPolygoncp accessgetpolygoncp, r8lambdaucGIgHn8fIyV_vccOdEafjFpEdk r8lambdaucgighn8fiyv_vccodeafjfpedk) {
        int i = 2 % 2;
        ((ArrayList) this.read).add(new onViewAttachedToWindowlambda0(accessgetpolygoncp, r8lambdaucgighn8fiyv_vccodeafjfpedk));
        int i2 = MediaBrowserCompatMediaItem + 123;
        MediaSessionCompatQueueItem = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
    }

    @Override // o.BlurFilter
    public void IconCompatParcelizer(String str, String str2) {
        int i = 2 % 2;
        Iterator it = ((CopyOnWriteArrayList) this.RemoteActionCompatParcelizer).iterator();
        while (true) {
            Object obj = null;
            if (!it.hasNext()) {
                int i2 = MediaBrowserCompatMediaItem + 93;
                MediaSessionCompatQueueItem = i2 % Fields.SpotShadowColor;
                if (i2 % 2 != 0) {
                    return;
                }
                obj.hashCode();
                throw null;
            }
            int i3 = MediaSessionCompatQueueItem + 57;
            MediaBrowserCompatMediaItem = i3 % Fields.SpotShadowColor;
            if (i3 % 2 != 0) {
                ((ShadowContext) it.next()).write(str, str2);
                obj.hashCode();
                throw null;
            }
            ((ShadowContext) it.next()).write(str, str2);
        }
    }

    public void RemoteActionCompatParcelizer(String str, Object obj) {
        int i = 2 % 2;
        int i2 = MediaBrowserCompatMediaItem + 53;
        MediaSessionCompatQueueItem = i2 % Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            str.getClass();
            ((LinkedHashMap) this.write).put(str, obj);
            Object obj2 = null;
            obj2.hashCode();
            throw null;
        }
        str.getClass();
        ((LinkedHashMap) this.write).put(str, obj);
        MutableStateFlow mutableStateFlow = (MutableStateFlow) ((LinkedHashMap) this.RemoteActionCompatParcelizer).get(str);
        if (mutableStateFlow != null) {
            mutableStateFlow.IconCompatParcelizer(obj);
        }
        MutableStateFlow mutableStateFlow2 = (MutableStateFlow) ((LinkedHashMap) this.IconCompatParcelizer).get(str);
        if (mutableStateFlow2 != null) {
            int i3 = MediaSessionCompatQueueItem + 29;
            MediaBrowserCompatMediaItem = i3 % Fields.SpotShadowColor;
            if (i3 % 2 == 0) {
                mutableStateFlow2.IconCompatParcelizer(obj);
            } else {
                mutableStateFlow2.IconCompatParcelizer(obj);
                int i4 = 78 / 0;
            }
        }
    }

    @Override // o.DropShadowRenderer
    public void RemoteActionCompatParcelizer(String str) {
        int i = 2 % 2;
        str.getClass();
        MemoryCacheService memoryCacheService = (MemoryCacheService) this.read;
        memoryCacheService.getClass();
        ((ConcurrentHashMap) memoryCacheService.RemoteActionCompatParcelizer).remove(str);
        Iterator it = ((CopyOnWriteArrayList) this.RemoteActionCompatParcelizer).iterator();
        while (it.hasNext()) {
            int i2 = MediaSessionCompatQueueItem + 115;
            MediaBrowserCompatMediaItem = i2 % Fields.SpotShadowColor;
            int i3 = i2 % 2;
            ((ShadowContext) it.next()).RemoteActionCompatParcelizer(str);
            int i4 = MediaSessionCompatQueueItem + 107;
            MediaBrowserCompatMediaItem = i4 % Fields.SpotShadowColor;
            int i5 = i4 % 2;
        }
    }

    @Override // o.BlurFilter
    public void read(String str, String str2, long j, Map map, AndroidShadowContext_androidKt androidShadowContext_androidKt) {
        int i = 2 % 2;
        int i2 = MediaSessionCompatQueueItem + 61;
        MediaBrowserCompatMediaItem = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        str2.getClass();
        androidShadowContext_androidKt.getClass();
        ((MemoryCacheService) this.read).IconCompatParcelizer(j, str, str2);
        Iterator it = ((CopyOnWriteArrayList) this.RemoteActionCompatParcelizer).iterator();
        int i4 = MediaBrowserCompatMediaItem + 105;
        MediaSessionCompatQueueItem = i4 % Fields.SpotShadowColor;
        int i5 = i4 % 2;
        while (!(!it.hasNext())) {
            ((ShadowContext) it.next()).serializer(str, str2, j, map, androidShadowContext_androidKt);
        }
    }

    @Override // o.DropShadowRenderer
    public void write(String str, String str2, long j, AndroidShadowContext_androidKt androidShadowContext_androidKt) {
        Iterator it;
        int i = 2 % 2;
        int i2 = MediaSessionCompatQueueItem + 119;
        MediaBrowserCompatMediaItem = i2 % Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            androidShadowContext_androidKt.getClass();
            ((MemoryCacheService) this.read).IconCompatParcelizer(j, str, str2);
            it = ((CopyOnWriteArrayList) this.RemoteActionCompatParcelizer).iterator();
            int i3 = 56 / 0;
        } else {
            androidShadowContext_androidKt.getClass();
            ((MemoryCacheService) this.read).IconCompatParcelizer(j, str, str2);
            it = ((CopyOnWriteArrayList) this.RemoteActionCompatParcelizer).iterator();
        }
        while (!(!it.hasNext())) {
            ((ShadowContext) it.next()).write(str, str2, j, androidShadowContext_androidKt);
            int i4 = MediaBrowserCompatMediaItem + 87;
            MediaSessionCompatQueueItem = i4 % Fields.SpotShadowColor;
            if (i4 % 2 == 0) {
                int i5 = 4 / 5;
            }
        }
    }

    @Override // o.DropShadowRenderer
    public void RemoteActionCompatParcelizer(String str, String str2, String str3) {
        int i = 2 % 2;
        af$$ExternalSyntheticOutline0.m3978m(str, str2, str3);
        MemoryCacheService memoryCacheService = (MemoryCacheService) this.read;
        memoryCacheService.getClass();
        copyeZhPAX0 copyezhpax0 = (copyeZhPAX0) ((ConcurrentHashMap) memoryCacheService.RemoteActionCompatParcelizer).get(str);
        if (copyezhpax0 != null) {
            int i2 = MediaSessionCompatQueueItem + 11;
            MediaBrowserCompatMediaItem = i2 % Fields.SpotShadowColor;
            if (i2 % 2 != 0) {
                copyezhpax0.serializer(str2, str3);
                throw null;
            }
            copyezhpax0.serializer(str2, str3);
        }
        Iterator it = ((CopyOnWriteArrayList) this.RemoteActionCompatParcelizer).iterator();
        while (it.hasNext()) {
            int i3 = MediaBrowserCompatMediaItem + 31;
            MediaSessionCompatQueueItem = i3 % Fields.SpotShadowColor;
            int i4 = i3 % 2;
            ((ShadowContext) it.next()).RemoteActionCompatParcelizer(str, str2, str3);
        }
    }

    @Override // o.DropShadowRenderer
    public void serializer(long j, String str, String str2) {
        int i = 2 % 2;
        int i2 = MediaSessionCompatQueueItem + 65;
        MediaBrowserCompatMediaItem = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        str.getClass();
        str2.getClass();
        ((MemoryCacheService) this.read).IconCompatParcelizer(j, str, str2);
        Iterator it = ((CopyOnWriteArrayList) this.RemoteActionCompatParcelizer).iterator();
        while (it.hasNext()) {
            int i4 = MediaSessionCompatQueueItem + 75;
            MediaBrowserCompatMediaItem = i4 % Fields.SpotShadowColor;
            int i5 = i4 % 2;
            ((ShadowContext) it.next()).serializer(j, str, str2);
            int i6 = MediaSessionCompatQueueItem + 45;
            MediaBrowserCompatMediaItem = i6 % Fields.SpotShadowColor;
            int i7 = i6 % 2;
        }
    }

    public void read(String str, String str2, String str3, ArrayList arrayList, getF3EK5gGoQ getf3ek5ggoq, EmojiProcessor emojiProcessor) {
        int i = 2 % 2;
        boolean z = true;
        accessgetSystemNavigationDowncp.RemoteActionCompatParcelizer(!arrayList.isEmpty());
        getExponentimpl getexponentimpl = new getExponentimpl(26);
        getCalendarEK5gGoQ getcalendarek5ggoqIconCompatParcelizer = getCalendarEK5gGoQ.IconCompatParcelizer();
        if (getcalendarek5ggoqIconCompatParcelizer.serializer == 2) {
            int i2 = MediaSessionCompatQueueItem + 27;
            MediaBrowserCompatMediaItem = i2 % Fields.SpotShadowColor;
            int i3 = i2 % 2;
            if (str.equals(getcalendarek5ggoqIconCompatParcelizer.write)) {
                int i4 = MediaBrowserCompatMediaItem + 79;
                MediaSessionCompatQueueItem = i4 % Fields.SpotShadowColor;
                int i5 = i4 % 2;
            }
            getexponentimpl.read = new SentryClient(str, str2, str3, getCalendarEK5gGoQ.IconCompatParcelizer().IconCompatParcelizer, z);
            IconCompatParcelizer(getexponentimpl, Collections.unmodifiableList(arrayList), 0, getf3ek5ggoq, emojiProcessor);
        }
        z = false;
        getexponentimpl.read = new SentryClient(str, str2, str3, getCalendarEK5gGoQ.IconCompatParcelizer().IconCompatParcelizer, z);
        IconCompatParcelizer(getexponentimpl, Collections.unmodifiableList(arrayList), 0, getf3ek5ggoq, emojiProcessor);
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0054, code lost:
    
        if (r2 == null) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0056, code lost:
    
        r5 = coil3.ComponentRegistry$Builder.MediaBrowserCompatMediaItem + 63;
        coil3.ComponentRegistry$Builder.MediaSessionCompatQueueItem = r5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0061, code lost:
    
        if ((r5 % 2) == 0) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0063, code lost:
    
        r0 = r4.write(r1, "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(r2));
        r7.serializer = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x006d, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x006e, code lost:
    
        r7.serializer = r4.write(r1, "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(r2));
        r3.hashCode();
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x007b, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x007c, code lost:
    
        com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer("Local and anonymous classes can not be ViewModels");
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0081, code lost:
    
        return null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0082, code lost:
    
        r2 = r2 + 105;
        coil3.ComponentRegistry$Builder.MediaBrowserCompatMediaItem = r2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        r2 = r2 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0089, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0016, code lost:
    
        if (r1 == null) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x001d, code lost:
    
        if (r1 == null) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x001f, code lost:
    
        r1 = (o.getFilterQualityfv9h1I) ((o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) r7.read).invoke();
        r2 = (o.createImageBitmap) ((o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) r7.RemoteActionCompatParcelizer).invoke();
        r3 = (o.setStrokeCapBeK7IIE) ((o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) r7.IconCompatParcelizer).invoke();
        r1.getClass();
        r2.getClass();
        r3.getClass();
        r4 = new coil3.ImageLoader$Builder(r1, r2, r3);
        r1 = (o.r8lambdaucGIgHn8fIyV_vccOdEafjFpEdk) r7.write;
        r2 = r1.RemoteActionCompatParcelizer();
        r3 = null;
     */
    @Override // o.onViewDetachedFromWindowlambda1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object MediaSessionCompatResultReceiverWrapper() {
        /*
            r7 = this;
            r0 = 2
            int r1 = r0 % r0
            int r1 = coil3.ComponentRegistry$Builder.MediaBrowserCompatMediaItem
            int r1 = r1 + 5
            int r2 = r1 % 128
            coil3.ComponentRegistry$Builder.MediaSessionCompatQueueItem = r2
            int r1 = r1 % r0
            if (r1 != 0) goto L19
            java.lang.Object r1 = r7.serializer
            androidx.lifecycle.ViewModel r1 = (androidx.lifecycle.ViewModel) r1
            r3 = 20
            int r3 = r3 / 0
            if (r1 != 0) goto L82
            goto L1f
        L19:
            java.lang.Object r1 = r7.serializer
            androidx.lifecycle.ViewModel r1 = (androidx.lifecycle.ViewModel) r1
            if (r1 != 0) goto L82
        L1f:
            java.lang.Object r1 = r7.read
            o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r1 = (o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) r1
            java.lang.Object r1 = r1.invoke()
            o.getFilterQualityfv9h1I r1 = (o.getFilterQualityfv9h1I) r1
            java.lang.Object r2 = r7.RemoteActionCompatParcelizer
            o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r2 = (o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) r2
            java.lang.Object r2 = r2.invoke()
            o.createImageBitmap r2 = (o.createImageBitmap) r2
            java.lang.Object r3 = r7.IconCompatParcelizer
            o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r3 = (o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) r3
            java.lang.Object r3 = r3.invoke()
            o.setStrokeCapBeK7IIE r3 = (o.setStrokeCapBeK7IIE) r3
            r1.getClass()
            r2.getClass()
            r3.getClass()
            coil3.ImageLoader$Builder r4 = new coil3.ImageLoader$Builder
            r4.<init>(r1, r2, r3)
            java.lang.Object r1 = r7.write
            o.r8lambdaucGIgHn8fIyV_vccOdEafjFpEdk r1 = (o.r8lambdaucGIgHn8fIyV_vccOdEafjFpEdk) r1
            java.lang.String r2 = r1.RemoteActionCompatParcelizer()
            r3 = 0
            if (r2 == 0) goto L7c
            int r5 = coil3.ComponentRegistry$Builder.MediaBrowserCompatMediaItem
            int r5 = r5 + 63
            int r6 = r5 % 128
            coil3.ComponentRegistry$Builder.MediaSessionCompatQueueItem = r6
            int r5 = r5 % r0
            java.lang.String r0 = "androidx.lifecycle.ViewModelProvider.DefaultKey:"
            if (r5 == 0) goto L6e
            java.lang.String r0 = r0.concat(r2)
            androidx.lifecycle.ViewModel r0 = r4.write(r1, r0)
            r7.serializer = r0
            return r0
        L6e:
            java.lang.String r0 = r0.concat(r2)
            androidx.lifecycle.ViewModel r0 = r4.write(r1, r0)
            r7.serializer = r0
            r3.hashCode()
            throw r3
        L7c:
            java.lang.String r0 = "Local and anonymous classes can not be ViewModels"
            com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer(r0)
            return r3
        L82:
            int r2 = r2 + 105
            int r3 = r2 % 128
            coil3.ComponentRegistry$Builder.MediaBrowserCompatMediaItem = r3
            int r2 = r2 % r0
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: coil3.ComponentRegistry$Builder.MediaSessionCompatResultReceiverWrapper():java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0028  */
    public Object cachedZoneGeoJson(int i, ContinuationImpl continuationImpl) {
        accesssetInstanceStoppedp accesssetinstancestoppedp;
        int i2 = 2 % 2;
        int i3 = MediaSessionCompatQueueItem + 59;
        MediaBrowserCompatMediaItem = i3 % Fields.SpotShadowColor;
        int i4 = i3 % 2;
        if (continuationImpl instanceof accesssetInstanceStoppedp) {
            accesssetinstancestoppedp = (accesssetInstanceStoppedp) continuationImpl;
            int i5 = accesssetinstancestoppedp.serializer;
            if ((i5 & Integer.MIN_VALUE) != 0) {
                int i6 = MediaBrowserCompatMediaItem + 107;
                MediaSessionCompatQueueItem = i6 % Fields.SpotShadowColor;
                int i7 = i6 % 2;
                accesssetinstancestoppedp.serializer = i5 - Integer.MIN_VALUE;
            } else {
                accesssetinstancestoppedp = new accesssetInstanceStoppedp(this, continuationImpl);
            }
        } else {
            accesssetinstancestoppedp = new accesssetInstanceStoppedp(this, continuationImpl);
        }
        Object objFirst = accesssetinstancestoppedp.write;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i8 = accesssetinstancestoppedp.serializer;
        if (i8 != 0) {
            int i9 = MediaSessionCompatQueueItem + 65;
            MediaBrowserCompatMediaItem = i9 % Fields.SpotShadowColor;
            int i10 = i9 % 2;
            if (i8 != 1) {
                ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            i = accesssetinstancestoppedp.RemoteActionCompatParcelizer;
            ExtrasKt.RemoteActionCompatParcelizer(objFirst);
        } else {
            ExtrasKt.RemoteActionCompatParcelizer(objFirst);
            FlowKt__ZipKt$combine$$inlined$unsafeFlow$1 flowKt__ZipKt$combine$$inlined$unsafeFlow$1 = ((OpportunitiesRepository) this.RemoteActionCompatParcelizer).read();
            accesssetinstancestoppedp.RemoteActionCompatParcelizer = i;
            accesssetinstancestoppedp.serializer = 1;
            objFirst = FlowKt.first(flowKt__ZipKt$combine$$inlined$unsafeFlow$1, accesssetinstancestoppedp);
            if (objFirst == coroutineSingletons) {
                int i11 = MediaBrowserCompatMediaItem + 1;
                MediaSessionCompatQueueItem = i11 % Fields.SpotShadowColor;
                int i12 = i11 % 2;
                return coroutineSingletons;
            }
        }
        t2ExternalSyntheticLambda1 t2externalsyntheticlambda1 = (t2ExternalSyntheticLambda1) ((se) objFirst).RemoteActionCompatParcelizer.get(new Integer(i));
        if (t2externalsyntheticlambda1 != null) {
            return t2externalsyntheticlambda1.serializer;
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0022  */
    public static final Object access$handleMapNotFound(ComponentRegistry$Builder componentRegistry$Builder, ActivityNotFoundException activityNotFoundException, ShortNewsContentCardView shortNewsContentCardView) {
        addSerializedCardJsonToStoragelambda1 addserializedcardjsontostoragelambda1;
        ActivityNotFoundException activityNotFoundException2;
        int i = 2 % 2;
        componentRegistry$Builder.getClass();
        if (shortNewsContentCardView instanceof addSerializedCardJsonToStoragelambda1) {
            addserializedcardjsontostoragelambda1 = (addSerializedCardJsonToStoragelambda1) shortNewsContentCardView;
            int i2 = addserializedcardjsontostoragelambda1.read;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                addserializedcardjsontostoragelambda1.read = i2 - Integer.MIN_VALUE;
                int i3 = MediaBrowserCompatMediaItem + 3;
                MediaSessionCompatQueueItem = i3 % Fields.SpotShadowColor;
                int i4 = i3 % 2;
            } else {
                addserializedcardjsontostoragelambda1 = new addSerializedCardJsonToStoragelambda1(componentRegistry$Builder, shortNewsContentCardView);
            }
        } else {
            addserializedcardjsontostoragelambda1 = new addSerializedCardJsonToStoragelambda1(componentRegistry$Builder, shortNewsContentCardView);
        }
        Object obj = addserializedcardjsontostoragelambda1.write;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i5 = addserializedcardjsontostoragelambda1.read;
        ShortNewsContentCardView shortNewsContentCardView2 = null;
        if (i5 != 0) {
            int i6 = MediaBrowserCompatMediaItem + 59;
            int i7 = i6 % Fields.SpotShadowColor;
            MediaSessionCompatQueueItem = i7;
            if (i6 % 2 != 0 ? i5 != 1 : i5 != 1) {
                ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            int i8 = i7 + 45;
            MediaBrowserCompatMediaItem = i8 % Fields.SpotShadowColor;
            if (i8 % 2 != 0) {
                activityNotFoundException2 = addserializedcardjsontostoragelambda1.serializer;
                ExtrasKt.RemoteActionCompatParcelizer(obj);
                int i9 = 37 / 0;
            } else {
                activityNotFoundException2 = addserializedcardjsontostoragelambda1.serializer;
                ExtrasKt.RemoteActionCompatParcelizer(obj);
            }
            activityNotFoundException = activityNotFoundException2;
            int i10 = MediaSessionCompatQueueItem + 71;
            MediaBrowserCompatMediaItem = i10 % Fields.SpotShadowColor;
            if (i10 % 2 != 0) {
                int i11 = 2 / 5;
            }
        } else {
            ExtrasKt.RemoteActionCompatParcelizer(obj);
            ((inCompatibilityMode) ((isOpenInternalroom_runtime) componentRegistry$Builder.serializer)).getClass();
            DefaultScheduler defaultScheduler = prepareForActivityTransitionCarryover.RemoteActionCompatParcelizer;
            MainCoroutineDispatcher mainCoroutineDispatcher = MainDispatcherLoader.read;
            HomeViewModel.AnonymousClass1 anonymousClass1 = new HomeViewModel.AnonymousClass1(componentRegistry$Builder, shortNewsContentCardView2, 29);
            addserializedcardjsontostoragelambda1.serializer = activityNotFoundException;
            addserializedcardjsontostoragelambda1.read = 1;
            if (BuildersKt.withContext(mainCoroutineDispatcher, anonymousClass1, addserializedcardjsontostoragelambda1) == coroutineSingletons) {
                return coroutineSingletons;
            }
        }
        Timber.RemoteActionCompatParcelizer.write(new IllegalStateException("No navigation app found on riders device", activityNotFoundException));
        return createFromParcel.INSTANCE;
    }

    /* JADX WARN: Code duplicated, block: B:40:0x00ac  */
    /* JADX WARN: Code duplicated, block: B:42:0x00af  */
    /* JADX WARN: Code duplicated, block: B:46:0x00d0  */
    /* JADX WARN: Code duplicated, block: B:56:0x00ed A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:58:0x00ca A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:9:0x002e  */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0084, code lost:
    
        if (r15 != null) goto L43;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object access$zoneBoundary(coil3.ComponentRegistry$Builder r13, o.getGooglePlayServicesInfo r14, kotlin.coroutines.jvm.internal.ContinuationImpl r15) {
        /*
            Method dump skipped, instruction units count: 264
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: coil3.ComponentRegistry$Builder.access$zoneBoundary(coil3.ComponentRegistry$Builder, o.getGooglePlayServicesInfo, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0026  */
    public Object provideRequestParams(Map map, List list, List list2, ContinuationImpl continuationImpl) {
        setFill setfill;
        Object config;
        Map map2;
        List list3;
        List list4;
        List list5;
        Map map3;
        List list6;
        int i = 2 % 2;
        int i2 = MediaSessionCompatQueueItem + 53;
        int i3 = i2 % Fields.SpotShadowColor;
        MediaBrowserCompatMediaItem = i3;
        int i4 = i2 % 2;
        if (continuationImpl instanceof setFill) {
            int i5 = i3 + 121;
            MediaSessionCompatQueueItem = i5 % Fields.SpotShadowColor;
            int i6 = i5 % 2;
            setfill = (setFill) continuationImpl;
            int i7 = setfill.read;
            if ((i7 & Integer.MIN_VALUE) != 0) {
                setfill.read = i7 - Integer.MIN_VALUE;
            } else {
                setfill = new setFill(this, continuationImpl);
            }
        } else {
            setfill = new setFill(this, continuationImpl);
        }
        setFill setfill2 = setfill;
        Object obj = setfill2.MediaDescriptionCompat;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i8 = setfill2.read;
        if (i8 == 0) {
            ExtrasKt.RemoteActionCompatParcelizer(obj);
            ArrayList arrayList = new ArrayList();
            DefaultPerseusConfigProvider defaultPerseusConfigProvider = updateRenderPath.MediaSessionCompatQueueItem;
            setfill2.IconCompatParcelizer = map;
            setfill2.RemoteActionCompatParcelizer = list;
            setfill2.serializer = list2;
            setfill2.write = arrayList;
            setfill2.read = 1;
            config = defaultPerseusConfigProvider.getConfig(setfill2);
            if (config != coroutineSingletons) {
                map2 = map;
                list3 = arrayList;
                list4 = list2;
                list5 = list;
            }
            return coroutineSingletons;
        }
        if (i8 == 1) {
            list3 = setfill2.write;
            List list7 = setfill2.serializer;
            List list8 = setfill2.RemoteActionCompatParcelizer;
            Map map4 = setfill2.IconCompatParcelizer;
            ExtrasKt.RemoteActionCompatParcelizer(obj);
            list5 = list8;
            map2 = map4;
            config = obj;
            list4 = list7;
        } else {
            if (i8 != 2) {
                ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            list3 = setfill2.write;
            list6 = setfill2.serializer;
            list5 = setfill2.RemoteActionCompatParcelizer;
            map3 = setfill2.IconCompatParcelizer;
            ExtrasKt.RemoteActionCompatParcelizer(obj);
        }
        list3.add(read((quadTo) obj, map3, list5, list6));
        return new HitsRequest(list3);
        int i9 = MediaBrowserCompatMediaItem + 45;
        MediaSessionCompatQueueItem = i9 % Fields.SpotShadowColor;
        int i10 = i9 % 2;
        PerseusParamsConfig perseusParamsConfig = (PerseusParamsConfig) config;
        HitEventFactory hitEventFactory = (HitEventFactory) this.IconCompatParcelizer;
        AppSessionManagerImpl appSessionManagerImpl = (AppSessionManagerImpl) this.write;
        ClientIdProviderImpl clientIdProviderImpl = (ClientIdProviderImpl) this.read;
        setfill2.IconCompatParcelizer = map2;
        setfill2.RemoteActionCompatParcelizer = list5;
        setfill2.serializer = list4;
        setfill2.write = list3;
        setfill2.read = 2;
        Object objCreateEventHit = hitEventFactory.createEventHit(perseusParamsConfig, appSessionManagerImpl, clientIdProviderImpl, map2, list5, list4, setfill2);
        if (objCreateEventHit != coroutineSingletons) {
            map3 = map2;
            list6 = list4;
            obj = objCreateEventHit;
            list3.add(read((quadTo) obj, map3, list5, list6));
            return new HitsRequest(list3);
        }
        return coroutineSingletons;
    }

    @Override // o.DropShadowRenderer
    public void write(String str) throws Throwable {
        Map linkedHashMap;
        int i = 2 % 2;
        int i2 = MediaSessionCompatQueueItem + 31;
        MediaBrowserCompatMediaItem = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        MemoryCacheService memoryCacheService = (MemoryCacheService) this.read;
        str.getClass();
        for (Map.Entry entry : ((accessisMainThread) this.write).write().entrySet()) {
            int i4 = MediaBrowserCompatMediaItem + 67;
            MediaSessionCompatQueueItem = i4 % Fields.SpotShadowColor;
            int i5 = i4 % 2;
            RemoteActionCompatParcelizer(str, (String) entry.getKey(), (String) entry.getValue());
        }
        memoryCacheService.getClass();
        ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) memoryCacheService.RemoteActionCompatParcelizer;
        copyeZhPAX0 copyezhpax0 = (copyeZhPAX0) concurrentHashMap.get(str);
        HashMap map = null;
        if (copyezhpax0 != null) {
            linkedHashMap = new LinkedHashMap();
            Iterator it = copyezhpax0.write.entrySet().iterator();
            while (it.hasNext()) {
                Map.Entry entry2 = (Map.Entry) it.next();
                linkedHashMap.put(entry2.getKey(), entry2.getValue());
                it.remove();
            }
        } else {
            linkedHashMap = null;
        }
        if (linkedHashMap == null) {
            int i6 = MediaSessionCompatQueueItem + 95;
            MediaBrowserCompatMediaItem = i6 % Fields.SpotShadowColor;
            if (i6 % 2 != 0) {
                SimpleItemTouchHelperCallback simpleItemTouchHelperCallback = SimpleItemTouchHelperCallback.serializer;
                throw null;
            }
            linkedHashMap = SimpleItemTouchHelperCallback.serializer;
        }
        r8lambda7AJnrvTmYNN7kSbgXUEYtB0Niyw.RemoteActionCompatParcelizer(0, str);
        for (Map.Entry entry3 : linkedHashMap.entrySet()) {
            serializer(((Number) entry3.getValue()).longValue(), str, (String) entry3.getKey());
        }
        copyeZhPAX0 copyezhpax1 = (copyeZhPAX0) concurrentHashMap.get(str);
        if (copyezhpax1 != null) {
            copyezhpax1.serializer();
        }
        copyeZhPAX0 copyezhpax2 = (copyeZhPAX0) concurrentHashMap.remove(str);
        if (copyezhpax2 != null) {
            HashMap map2 = new HashMap(copyezhpax2.read);
            Iterator it2 = copyezhpax2.write.entrySet().iterator();
            while (!(!it2.hasNext())) {
                Map.Entry entry4 = (Map.Entry) it2.next();
                map2.put((String) entry4.getKey(), String.valueOf(((Number) entry4.getValue()).longValue()));
                int i7 = MediaSessionCompatQueueItem + 21;
                MediaBrowserCompatMediaItem = i7 % Fields.SpotShadowColor;
                int i8 = i7 % 2;
            }
            map = map2;
        }
        Iterator it3 = ((CopyOnWriteArrayList) this.RemoteActionCompatParcelizer).iterator();
        while (it3.hasNext()) {
            ((ShadowContext) it3.next()).write(str);
        }
        if (map == null || map.isEmpty()) {
            return;
        }
        Iterator it4 = ((CopyOnWriteArrayList) this.IconCompatParcelizer).iterator();
        while (it4.hasNext()) {
            int i9 = MediaBrowserCompatMediaItem + 73;
            MediaSessionCompatQueueItem = i9 % Fields.SpotShadowColor;
            int i10 = i9 % 2;
            ((setBlurFilter) it4.next()).serializer(str, map);
        }
    }

    /* JADX WARN: Code duplicated, block: B:12:0x0085  */
    /* JADX WARN: Code duplicated, block: B:14:0x0093  */
    /* JADX WARN: Code duplicated, block: B:17:0x00a7  */
    /* JADX WARN: Code duplicated, block: B:20:0x00e6 A[LOOP:0: B:15:0x00a1->B:20:0x00e6, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:23:0x00f0  */
    /* JADX WARN: Code duplicated, block: B:25:0x00fe  */
    /* JADX WARN: Code duplicated, block: B:28:0x011f  */
    /* JADX WARN: Code duplicated, block: B:29:0x012c  */
    /* JADX WARN: Code duplicated, block: B:32:0x019e  */
    /* JADX WARN: Code duplicated, block: B:35:0x00e9 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:36:0x00db A[SYNTHETIC] */
    public HitDetails read(quadTo quadto, Map map, List list, List list2) {
        String str;
        String str2;
        String str3;
        String str4;
        int i;
        Consent consent;
        long j;
        Long lValueOf;
        String str5;
        int i2;
        Iterator it;
        Object next;
        Iterator it2;
        int i3 = 2 % 2;
        ImageVectorBuilderGroupParams imageVectorBuilderGroupParams = (ImageVectorBuilderGroupParams) this.RemoteActionCompatParcelizer;
        String str6 = quadto.ResultReceiver;
        String strSerializer = setNativeShader.serializer((Calendar) ((ScreenStartObserver$$ExternalSyntheticLambda0) this.serializer).B_());
        String str7 = quadto.MediaBrowserCompatMediaItem;
        String str8 = quadto.serializer;
        String str9 = quadto.read;
        String str10 = quadto.RemoteActionCompatParcelizer;
        String str11 = quadto.MediaSessionCompatQueueItem;
        String str12 = quadto.write;
        int i4 = Build.VERSION.SDK_INT;
        String str13 = Build.BRAND;
        String str14 = Build.MANUFACTURER;
        String str15 = Build.MODEL;
        StringBuilder sb = new StringBuilder();
        sb.append(i4);
        sb.append(".");
        sb.append(str13);
        sb.append(".");
        sb.append(str14);
        String strM = ff$$ExternalSyntheticOutline0.m(sb, ".", str15);
        String str16 = quadto.r8lambdayPQlaAoRiYRJ3IY_TqzUUTrVH0;
        String str17 = quadto.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg;
        String str18 = quadto.MediaDescriptionCompat;
        String str19 = quadto.r8lambdaXj9c8VIP9DfEvaTmZt0ejAuC4a4;
        String str20 = quadto.r8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8;
        String str21 = quadto.MediaSessionCompatResultReceiverWrapper;
        if (str21 != null) {
            str2 = str18;
            int i5 = MediaSessionCompatQueueItem + 45;
            str = str20;
            MediaBrowserCompatMediaItem = i5 % Fields.SpotShadowColor;
            int i6 = i5 % 2;
            if (str21.length() == 0) {
                int i7 = MediaSessionCompatQueueItem + 5;
                MediaBrowserCompatMediaItem = i7 % Fields.SpotShadowColor;
                int i8 = i7 % 2;
            } else {
                str3 = str21;
            }
            str4 = quadto.MediaMetadataCompat;
            if (str4 != null) {
                i2 = MediaBrowserCompatMediaItem + 37;
                MediaSessionCompatQueueItem = i2 % Fields.SpotShadowColor;
                if (i2 % 2 != 0) {
                    onContentCardClicked.read(Consent.values()).iterator();
                    throw null;
                }
                it = onContentCardClicked.read(Consent.values()).iterator();
                while (true) {
                    if (it.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it.next();
                    it2 = it;
                    if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{((Consent) next).getStringRepresentation(), str4}, getCieXyz.write())).booleanValue()) {
                        int i9 = MediaBrowserCompatMediaItem + 49;
                        MediaSessionCompatQueueItem = i9 % Fields.SpotShadowColor;
                        int i10 = i9 % 2;
                        break;
                    }
                    it = it2;
                }
                consent = (Consent) next;
                i = 2;
            } else {
                int i11 = MediaSessionCompatQueueItem + 67;
                MediaBrowserCompatMediaItem = i11 % Fields.SpotShadowColor;
                i = 2;
                int i12 = i11 % 2;
                consent = null;
            }
            int i13 = MediaBrowserCompatMediaItem + 1;
            Consent consent2 = consent;
            MediaSessionCompatQueueItem = i13 % Fields.SpotShadowColor;
            int i14 = i13 % i;
            j = quadto.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM;
            if (j == 0) {
                int i15 = MediaSessionCompatQueueItem + 55;
                MediaBrowserCompatMediaItem = i15 % Fields.SpotShadowColor;
                int i16 = i15 % 2;
                lValueOf = null;
            } else {
                lValueOf = Long.valueOf(j);
            }
            imageVectorBuilderGroupParams.getClass();
            String str22 = Build.BRAND;
            String str23 = Build.DEVICE;
            String str24 = Build.MODEL;
            String strIconCompatParcelizer = onContentCardDismissed.IconCompatParcelizer(SQLite.read(str22, str23, str24), " ", null, null, null, 62);
            String str25 = Build.VERSION.RELEASE;
            str25.getClass();
            DisplayMetrics displayMetrics = Resources.getSystem().getDisplayMetrics();
            Long l = lValueOf;
            String str26 = displayMetrics.heightPixels + "x" + displayMetrics.widthPixels;
            str23.getClass();
            str24.getClass();
            String str27 = Build.MANUFACTURER;
            str27.getClass();
            String languageTag = Locale.getDefault().toLanguageTag();
            languageTag.getClass();
            boolean z = quadto.ComponentActivity;
            String str28 = quadto.IconCompatParcelizer;
            String str29 = quadto.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY;
            str5 = quadto.MediaSessionCompatToken;
            if (str5 == null) {
                str5 = "";
            }
            return new HitDetails("Android", str6, strSerializer, str7, str8, str9, str10, str11, str12, strM, str16, str17, str2, str19, str, str3, consent2, l, strIconCompatParcelizer, str25, str26, str23, str24, str27, languageTag, map, list, list2, z, str28, str29, str5, null, 0, 1, null);
        }
        str = str20;
        str2 = str18;
        str3 = null;
        str4 = quadto.MediaMetadataCompat;
        if (str4 != null) {
            i2 = MediaBrowserCompatMediaItem + 37;
            MediaSessionCompatQueueItem = i2 % Fields.SpotShadowColor;
            if (i2 % 2 != 0) {
                onContentCardClicked.read(Consent.values()).iterator();
                throw null;
            }
            it = onContentCardClicked.read(Consent.values()).iterator();
            while (true) {
                if (it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                it2 = it;
                if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{((Consent) next).getStringRepresentation(), str4}, getCieXyz.write())).booleanValue()) {
                    int i17 = MediaBrowserCompatMediaItem + 49;
                    MediaSessionCompatQueueItem = i17 % Fields.SpotShadowColor;
                    int i18 = i17 % 2;
                    break;
                }
                it = it2;
            }
            consent = (Consent) next;
            i = 2;
        } else {
            int i19 = MediaSessionCompatQueueItem + 67;
            MediaBrowserCompatMediaItem = i19 % Fields.SpotShadowColor;
            i = 2;
            int i110 = i19 % 2;
            consent = null;
        }
        int i111 = MediaBrowserCompatMediaItem + 1;
        Consent consent3 = consent;
        MediaSessionCompatQueueItem = i111 % Fields.SpotShadowColor;
        int i112 = i111 % i;
        j = quadto.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM;
        if (j == 0) {
            int i113 = MediaSessionCompatQueueItem + 55;
            MediaBrowserCompatMediaItem = i113 % Fields.SpotShadowColor;
            int i114 = i113 % 2;
            lValueOf = null;
        } else {
            lValueOf = Long.valueOf(j);
        }
        imageVectorBuilderGroupParams.getClass();
        String str210 = Build.BRAND;
        String str211 = Build.DEVICE;
        String str212 = Build.MODEL;
        String strIconCompatParcelizer2 = onContentCardDismissed.IconCompatParcelizer(SQLite.read(str210, str211, str212), " ", null, null, null, 62);
        String str213 = Build.VERSION.RELEASE;
        str213.getClass();
        DisplayMetrics displayMetrics2 = Resources.getSystem().getDisplayMetrics();
        Long l2 = lValueOf;
        String str214 = displayMetrics2.heightPixels + "x" + displayMetrics2.widthPixels;
        str211.getClass();
        str212.getClass();
        String str215 = Build.MANUFACTURER;
        str215.getClass();
        String languageTag2 = Locale.getDefault().toLanguageTag();
        languageTag2.getClass();
        boolean z2 = quadto.ComponentActivity;
        String str216 = quadto.IconCompatParcelizer;
        String str217 = quadto.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY;
        str5 = quadto.MediaSessionCompatToken;
        if (str5 == null) {
            str5 = "";
        }
        return new HitDetails("Android", str6, strSerializer, str7, str8, str9, str10, str11, str12, strM, str16, str17, str2, str19, str, str3, consent3, l2, strIconCompatParcelizer2, str213, str214, str211, str212, str215, languageTag2, map, list, list2, z2, str216, str217, str5, null, 0, 1, null);
    }

    /* JADX WARN: Code duplicated, block: B:32:0x00c9  */
    /* JADX WARN: Code duplicated, block: B:35:0x0106  */
    /* JADX WARN: Code duplicated, block: B:38:0x0113  */
    /* JADX WARN: Code duplicated, block: B:42:0x0168  */
    /* JADX WARN: Code duplicated, block: B:45:0x016f  */
    /* JADX WARN: Code duplicated, block: B:48:0x019a  */
    /* JADX WARN: Code duplicated, block: B:7:0x002c  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:46:0x0197 -> B:49:0x019c). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:48:0x019a -> B:49:0x019c). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public java.lang.Object invoke(long r28, kotlin.coroutines.jvm.internal.ContinuationImpl r30) {
        /*
            Method dump skipped, instruction units count: 431
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: coil3.ComponentRegistry$Builder.invoke(long, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    public Object invoke(double d, double d2, ContinuationImpl continuationImpl) {
        accesssetSyncPolicyOfflineStatus accesssetsyncpolicyofflinestatus;
        double d3;
        double d4;
        int i = 2 % 2;
        if (continuationImpl instanceof accesssetSyncPolicyOfflineStatus) {
            accesssetsyncpolicyofflinestatus = (accesssetSyncPolicyOfflineStatus) continuationImpl;
            int i2 = accesssetsyncpolicyofflinestatus.write;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                accesssetsyncpolicyofflinestatus.write = i2 - Integer.MIN_VALUE;
            } else {
                accesssetsyncpolicyofflinestatus = new accesssetSyncPolicyOfflineStatus(this, continuationImpl);
            }
        } else {
            accesssetsyncpolicyofflinestatus = new accesssetSyncPolicyOfflineStatus(this, continuationImpl);
        }
        Object objSerializer = accesssetsyncpolicyofflinestatus.serializer;
        Object obj = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i3 = accesssetsyncpolicyofflinestatus.write;
        if (i3 != 0) {
            int i4 = MediaBrowserCompatMediaItem + 19;
            MediaSessionCompatQueueItem = i4 % Fields.SpotShadowColor;
            int i5 = i4 % 2;
            if (i3 != 1) {
                ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            double d5 = accesssetsyncpolicyofflinestatus.IconCompatParcelizer;
            double d6 = accesssetsyncpolicyofflinestatus.RemoteActionCompatParcelizer;
            ExtrasKt.RemoteActionCompatParcelizer(objSerializer);
            d4 = d5;
            d3 = d6;
        } else {
            ExtrasKt.RemoteActionCompatParcelizer(objSerializer);
            accesssetShouldRequestFrameworkListenToNetworkUpdatescp accesssetshouldrequestframeworklistentonetworkupdatescp = (accesssetShouldRequestFrameworkListenToNetworkUpdatescp) this.write;
            accesssetsyncpolicyofflinestatus.RemoteActionCompatParcelizer = d;
            accesssetsyncpolicyofflinestatus.IconCompatParcelizer = d2;
            accesssetsyncpolicyofflinestatus.write = 1;
            objSerializer = accesssetshouldrequestframeworklistentonetworkupdatescp.serializer();
            if (objSerializer == obj) {
                int i6 = MediaBrowserCompatMediaItem + 19;
                MediaSessionCompatQueueItem = i6 % Fields.SpotShadowColor;
                int i7 = i6 % 2;
                return obj;
            }
            d3 = d;
            d4 = d2;
        }
        return new GetStartingAreaClosestCoordinateImpl$invoke$$inlined$map$1((Flow) objSerializer, this, d3, d4, 0);
    }

    /* JADX WARN: Code duplicated, block: B:102:0x03f5  */
    /* JADX WARN: Code duplicated, block: B:110:0x0302 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:30:0x00aa  */
    /* JADX WARN: Code duplicated, block: B:32:0x00b8  */
    /* JADX WARN: Code duplicated, block: B:35:0x00e8 A[LOOP:0: B:33:0x00e2->B:35:0x00e8, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:38:0x0136  */
    /* JADX WARN: Code duplicated, block: B:40:0x013e  */
    /* JADX WARN: Code duplicated, block: B:42:0x014a  */
    /* JADX WARN: Code duplicated, block: B:43:0x0151  */
    /* JADX WARN: Code duplicated, block: B:45:0x0156  */
    /* JADX WARN: Code duplicated, block: B:48:0x015b  */
    /* JADX WARN: Code duplicated, block: B:50:0x01a1  */
    /* JADX WARN: Code duplicated, block: B:57:0x024a  */
    /* JADX WARN: Code duplicated, block: B:59:0x024e  */
    /* JADX WARN: Code duplicated, block: B:61:0x0254  */
    /* JADX WARN: Code duplicated, block: B:63:0x0278  */
    /* JADX WARN: Code duplicated, block: B:65:0x0284 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:66:0x0285  */
    /* JADX WARN: Code duplicated, block: B:68:0x028a  */
    /* JADX WARN: Code duplicated, block: B:72:0x029c  */
    /* JADX WARN: Code duplicated, block: B:74:0x02a2  */
    /* JADX WARN: Code duplicated, block: B:77:0x02c1  */
    /* JADX WARN: Code duplicated, block: B:80:0x02dc  */
    /* JADX WARN: Code duplicated, block: B:82:0x02e8 A[LOOP:2: B:78:0x02d6->B:82:0x02e8, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:87:0x039e  */
    /* JADX WARN: Code duplicated, block: B:8:0x0026  */
    /* JADX WARN: Code duplicated, block: B:90:0x03b1  */
    /* JADX WARN: Code duplicated, block: B:93:0x03c0  */
    /* JADX WARN: Code duplicated, block: B:95:0x03c6  */
    /* JADX WARN: Code duplicated, block: B:97:0x03d2  */
    /* JADX WARN: Code duplicated, block: B:98:0x03de  */
    /* JADX WARN: Code duplicated, block: B:99:0x03e7  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:100:0x03eb -> B:101:0x03ed). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:68:0x028a -> B:69:0x028b). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:71:0x0297 -> B:70:0x0293). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:86:0x0322 -> B:70:0x0293). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:89:0x03a6 -> B:70:0x0293). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:92:0x03b5 -> B:70:0x0293). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:97:0x03d2 -> B:101:0x03ed). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:98:0x03de -> B:101:0x03ed). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public java.lang.Object updateLayerElements(java.util.List r34, o.ShortNewsContentCardView r35) {
        /*
            Method dump skipped, instruction units count: 1055
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: coil3.ComponentRegistry$Builder.updateLayerElements(java.util.List, o.ShortNewsContentCardView):java.lang.Object");
    }

    public ComponentRegistry$Builder(Context context) {
        HashMap map = new HashMap();
        EmojiProcessor emojiProcessor = new EmojiProcessor(context, 22);
        this.IconCompatParcelizer = new HashMap();
        this.write = context.getApplicationContext();
        this.RemoteActionCompatParcelizer = accessgetTvInputComposite1cp.read;
        this.read = emojiProcessor;
        this.serializer = map;
    }

    public ComponentRegistry$Builder(List list, speculativeHit speculativehit) {
        MemoryCacheService memoryCacheService = new MemoryCacheService(16, false);
        this.write = accessroleFakeNodeId.RemoteActionCompatParcelizer;
        this.read = memoryCacheService;
        this.RemoteActionCompatParcelizer = new CopyOnWriteArrayList(new ArrayList(list));
        this.IconCompatParcelizer = new CopyOnWriteArrayList();
        this.serializer = new configureShadowFoewPVkdefault();
    }

    public ComponentRegistry$Builder(r8lambdazJ_is40ErW_0zWXIHU0U2X8pyMM r8lambdazj_is40erw_0zwxihu0u2x8pymm, r8lambdaguMkB96aaxyAGqCnh2xMDXoFAs r8lambdagumkb96aaxyagqcnh2xmdxofas, SaveHeatmapUrlImpl saveHeatmapUrlImpl, r8lambdax3lltCpD3rATxa4vQpnFaaGbzP4 r8lambdax3lltcpd3ratxa4vqpnfaagbzp4, accessgetSdkEnablementProvidercp accessgetsdkenablementprovidercp) {
        r8lambdazj_is40erw_0zwxihu0u2x8pymm.getClass();
        r8lambdax3lltcpd3ratxa4vqpnfaagbzp4.getClass();
        accessgetsdkenablementprovidercp.getClass();
        this.write = r8lambdazj_is40erw_0zwxihu0u2x8pymm;
        this.read = r8lambdagumkb96aaxyagqcnh2xmdxofas;
        this.RemoteActionCompatParcelizer = saveHeatmapUrlImpl;
        this.IconCompatParcelizer = r8lambdax3lltcpd3ratxa4vqpnfaagbzp4;
        this.serializer = accessgetsdkenablementprovidercp;
    }

    public ComponentRegistry$Builder(GetChatAssetDownloadConfig getChatAssetDownloadConfig, GetChatAssetDownloadAction getChatAssetDownloadAction, TriggerChatAssetsDownloading triggerChatAssetsDownloading, setMaxElementsWrap setmaxelementswrap, isOpenInternalroom_runtime isopeninternalroom_runtime) {
        getChatAssetDownloadConfig.getClass();
        getChatAssetDownloadAction.getClass();
        triggerChatAssetsDownloading.getClass();
        setmaxelementswrap.getClass();
        isopeninternalroom_runtime.getClass();
        this.write = getChatAssetDownloadConfig;
        this.read = getChatAssetDownloadAction;
        this.RemoteActionCompatParcelizer = triggerChatAssetsDownloading;
        this.IconCompatParcelizer = setmaxelementswrap;
        this.serializer = isopeninternalroom_runtime;
    }

    public ComponentRegistry$Builder(accesssetShouldRequestFrameworkListenToNetworkUpdatescp accesssetshouldrequestframeworklistentonetworkupdatescp, getActionViewIntentlambda0 getactionviewintentlambda0, AndroidUiDispatcherCompanioncurrentThread1 androidUiDispatcherCompanioncurrentThread1, isMainThread ismainthread, isOpenInternalroom_runtime isopeninternalroom_runtime) {
        accesssetshouldrequestframeworklistentonetworkupdatescp.getClass();
        getactionviewintentlambda0.getClass();
        androidUiDispatcherCompanioncurrentThread1.getClass();
        ismainthread.getClass();
        isopeninternalroom_runtime.getClass();
        this.write = accesssetshouldrequestframeworklistentonetworkupdatescp;
        this.read = getactionviewintentlambda0;
        this.RemoteActionCompatParcelizer = androidUiDispatcherCompanioncurrentThread1;
        this.IconCompatParcelizer = ismainthread;
        this.serializer = isopeninternalroom_runtime;
    }

    public ComponentRegistry$Builder(Application application, ComponentRegistry$Builder componentRegistry$Builder, getActionViewIntentlambda0 getactionviewintentlambda0, removeRearDisplayPresentationStatusListener removereardisplaypresentationstatuslistener, isOpenInternalroom_runtime isopeninternalroom_runtime) {
        application.getClass();
        componentRegistry$Builder.getClass();
        getactionviewintentlambda0.getClass();
        removereardisplaypresentationstatuslistener.getClass();
        isopeninternalroom_runtime.getClass();
        this.write = application;
        this.read = componentRegistry$Builder;
        this.RemoteActionCompatParcelizer = getactionviewintentlambda0;
        this.IconCompatParcelizer = removereardisplaypresentationstatuslistener;
        this.serializer = isopeninternalroom_runtime;
    }

    public ComponentRegistry$Builder(insertBasedOnParentOffset insertbasedonparentoffset, r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ r8lambdaktwlyipskq3tfa9ey3gatonixfq, ShouldShowHeatmap_Factory shouldShowHeatmap_Factory, getScrollRange getscrollrange, setVerticalBias setverticalbias) {
        insertbasedonparentoffset.getClass();
        r8lambdaktwlyipskq3tfa9ey3gatonixfq.getClass();
        getscrollrange.getClass();
        setverticalbias.getClass();
        this.write = insertbasedonparentoffset;
        this.read = r8lambdaktwlyipskq3tfa9ey3gatonixfq;
        this.RemoteActionCompatParcelizer = shouldShowHeatmap_Factory;
        this.IconCompatParcelizer = getscrollrange;
        this.serializer = setverticalbias;
    }

    public ComponentRegistry$Builder(GetShiftInfoImpl getShiftInfoImpl, getActionList getactionlist, OpportunitiesRepository opportunitiesRepository, AndroidUiFrameClock androidUiFrameClock, isOpenInternalroom_runtime isopeninternalroom_runtime) {
        getShiftInfoImpl.getClass();
        getactionlist.getClass();
        opportunitiesRepository.getClass();
        androidUiFrameClock.getClass();
        isopeninternalroom_runtime.getClass();
        this.write = getShiftInfoImpl;
        this.read = getactionlist;
        this.RemoteActionCompatParcelizer = opportunitiesRepository;
        this.IconCompatParcelizer = androidUiFrameClock;
        this.serializer = isopeninternalroom_runtime;
    }

    public ComponentRegistry$Builder(r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ r8lambdaktwlyipskq3tfa9ey3gatonixfq, AdjustPurchaseVerificationResult adjustPurchaseVerificationResult, r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ r8lambdaktwlyipskq3tfa9ey3gatonixfq2, r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ r8lambdaktwlyipskq3tfa9ey3gatonixfq3, postAnimationRunner postanimationrunner) {
        r8lambdaktwlyipskq3tfa9ey3gatonixfq.getClass();
        r8lambdaktwlyipskq3tfa9ey3gatonixfq2.getClass();
        r8lambdaktwlyipskq3tfa9ey3gatonixfq3.getClass();
        postanimationrunner.getClass();
        this.write = r8lambdaktwlyipskq3tfa9ey3gatonixfq;
        this.read = adjustPurchaseVerificationResult;
        this.RemoteActionCompatParcelizer = r8lambdaktwlyipskq3tfa9ey3gatonixfq2;
        this.IconCompatParcelizer = r8lambdaktwlyipskq3tfa9ey3gatonixfq3;
        this.serializer = postanimationrunner;
    }

    public ComponentRegistry$Builder(LayoutCompat layoutCompat, onMeasureChild onmeasurechild, FontVariationSettingInt fontVariationSettingInt, setStateDescription setstatedescription, onCapabilitiesChanged oncapabilitieschanged) {
        layoutCompat.getClass();
        onmeasurechild.getClass();
        fontVariationSettingInt.getClass();
        setstatedescription.getClass();
        this.write = layoutCompat;
        this.read = onmeasurechild;
        this.RemoteActionCompatParcelizer = fontVariationSettingInt;
        this.IconCompatParcelizer = setstatedescription;
        this.serializer = oncapabilitieschanged;
    }

    public ComponentRegistry$Builder(AppSessionManagerImpl appSessionManagerImpl, ClientIdProviderImpl clientIdProviderImpl, ImageVectorBuilderGroupParams imageVectorBuilderGroupParams, HitEventFactory hitEventFactory, ScreenStartObserver$$ExternalSyntheticLambda0 screenStartObserver$$ExternalSyntheticLambda0) {
        appSessionManagerImpl.getClass();
        clientIdProviderImpl.getClass();
        imageVectorBuilderGroupParams.getClass();
        this.write = appSessionManagerImpl;
        this.read = clientIdProviderImpl;
        this.RemoteActionCompatParcelizer = imageVectorBuilderGroupParams;
        this.IconCompatParcelizer = hitEventFactory;
        this.serializer = screenStartObserver$$ExternalSyntheticLambda0;
    }

    public ComponentRegistry$Builder(setPaddingBottom setpaddingbottom, onMeasureChild onmeasurechild, LocaleListHelperMethods localeListHelperMethods, r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ r8lambdaktwlyipskq3tfa9ey3gatonixfq, SemanticsPropertiesLinkTestMarker1 semanticsPropertiesLinkTestMarker1) {
        onmeasurechild.getClass();
        localeListHelperMethods.getClass();
        r8lambdaktwlyipskq3tfa9ey3gatonixfq.getClass();
        semanticsPropertiesLinkTestMarker1.getClass();
        this.write = setpaddingbottom;
        this.read = onmeasurechild;
        this.RemoteActionCompatParcelizer = localeListHelperMethods;
        this.IconCompatParcelizer = r8lambdaktwlyipskq3tfa9ey3gatonixfq;
        this.serializer = semanticsPropertiesLinkTestMarker1;
    }

    public ComponentRegistry$Builder(accessgetRelayoutTimep accessgetrelayouttimep, lambdaverifyPlayStorePurchase45 lambdaverifyplaystorepurchase45, newTransaction newtransaction, getSharedElementTargetNames getsharedelementtargetnames, getDoubleOrNull getdoubleornull) {
        accessgetrelayouttimep.getClass();
        getsharedelementtargetnames.getClass();
        getdoubleornull.getClass();
        this.write = accessgetrelayouttimep;
        this.read = lambdaverifyplaystorepurchase45;
        this.RemoteActionCompatParcelizer = newtransaction;
        this.IconCompatParcelizer = getsharedelementtargetnames;
        this.serializer = getdoubleornull;
    }

    public ComponentRegistry$Builder(r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ r8lambdaktwlyipskq3tfa9ey3gatonixfq, mergeJsonObjects mergejsonobjects, r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ r8lambdaktwlyipskq3tfa9ey3gatonixfq2, SemanticsPropertiesLinkTestMarker1 semanticsPropertiesLinkTestMarker1, r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ r8lambdaktwlyipskq3tfa9ey3gatonixfq3) {
        r8lambdaktwlyipskq3tfa9ey3gatonixfq.getClass();
        r8lambdaktwlyipskq3tfa9ey3gatonixfq2.getClass();
        semanticsPropertiesLinkTestMarker1.getClass();
        r8lambdaktwlyipskq3tfa9ey3gatonixfq3.getClass();
        this.write = r8lambdaktwlyipskq3tfa9ey3gatonixfq;
        this.read = mergejsonobjects;
        this.RemoteActionCompatParcelizer = r8lambdaktwlyipskq3tfa9ey3gatonixfq2;
        this.IconCompatParcelizer = semanticsPropertiesLinkTestMarker1;
        this.serializer = r8lambdaktwlyipskq3tfa9ey3gatonixfq3;
    }

    public ComponentRegistry$Builder(r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ r8lambdaktwlyipskq3tfa9ey3gatonixfq, ShouldShowHeatmap_Factory shouldShowHeatmap_Factory, ShouldShowHeatmap_Factory shouldShowHeatmap_Factory2, r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ r8lambdaktwlyipskq3tfa9ey3gatonixfq2, r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ r8lambdaktwlyipskq3tfa9ey3gatonixfq3) {
        r8lambdaktwlyipskq3tfa9ey3gatonixfq.getClass();
        shouldShowHeatmap_Factory.getClass();
        r8lambdaktwlyipskq3tfa9ey3gatonixfq2.getClass();
        r8lambdaktwlyipskq3tfa9ey3gatonixfq3.getClass();
        this.write = r8lambdaktwlyipskq3tfa9ey3gatonixfq;
        this.read = shouldShowHeatmap_Factory;
        this.RemoteActionCompatParcelizer = shouldShowHeatmap_Factory2;
        this.IconCompatParcelizer = r8lambdaktwlyipskq3tfa9ey3gatonixfq2;
        this.serializer = r8lambdaktwlyipskq3tfa9ey3gatonixfq3;
    }

    public ComponentRegistry$Builder(r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ r8lambdaktwlyipskq3tfa9ey3gatonixfq, mergeJsonObjects mergejsonobjects, requestSingleLocationUpdatelambda1 requestsinglelocationupdatelambda1, lambdaverifyPlayStorePurchase45 lambdaverifyplaystorepurchase45, r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ r8lambdaktwlyipskq3tfa9ey3gatonixfq2) {
        r8lambdaktwlyipskq3tfa9ey3gatonixfq.getClass();
        lambdaverifyplaystorepurchase45.getClass();
        r8lambdaktwlyipskq3tfa9ey3gatonixfq2.getClass();
        this.write = r8lambdaktwlyipskq3tfa9ey3gatonixfq;
        this.read = mergejsonobjects;
        this.RemoteActionCompatParcelizer = requestsinglelocationupdatelambda1;
        this.IconCompatParcelizer = lambdaverifyplaystorepurchase45;
        this.serializer = r8lambdaktwlyipskq3tfa9ey3gatonixfq2;
    }

    public ComponentRegistry$Builder(Map map) {
        map.getClass();
        this.write = new LinkedHashMap(map);
        this.read = new LinkedHashMap();
        this.RemoteActionCompatParcelizer = new LinkedHashMap();
        this.IconCompatParcelizer = new LinkedHashMap();
        this.serializer = new r8lambdaXj9c8VIP9DfEvaTmZt0ejAuC4a4(1, this);
    }

    public ComponentRegistry$Builder() {
        this.write = new Object();
        this.RemoteActionCompatParcelizer = new DragAndDropNodeacceptDragAndDropTransfer1(0);
        this.IconCompatParcelizer = new ContentInViewNode();
        this.serializer = new ContentInViewNode();
    }

    public /* synthetic */ ComponentRegistry$Builder(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        this.write = obj;
        this.read = obj2;
        this.RemoteActionCompatParcelizer = obj3;
        this.IconCompatParcelizer = obj4;
        this.serializer = obj5;
    }

    public ComponentRegistry$Builder(r8lambdaucGIgHn8fIyV_vccOdEafjFpEdk r8lambdaucgighn8fiyv_vccodeafjfpedk, r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k0, r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k1, r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k2) {
        this.write = r8lambdaucgighn8fiyv_vccodeafjfpedk;
        this.read = r8lambdardpfsr94j4iebcwx_kpqzpm8k0;
        this.RemoteActionCompatParcelizer = r8lambdardpfsr94j4iebcwx_kpqzpm8k1;
        this.IconCompatParcelizer = r8lambdardpfsr94j4iebcwx_kpqzpm8k2;
    }

    public ComponentRegistry$Builder(FirebaseApp firebaseApp) {
        Boolean boolValueOf;
        ApplicationInfo applicationInfo;
        Bundle bundle;
        this.read = new Object();
        this.RemoteActionCompatParcelizer = new ParentDataModifierDefaultImpls();
        this.serializer = new ParentDataModifierDefaultImpls();
        firebaseApp.IconCompatParcelizer();
        Context context = firebaseApp.read;
        this.write = firebaseApp;
        SharedPreferences sharedPreferences = context.getSharedPreferences("com.google.firebase.crashlytics", 0);
        Boolean boolValueOf2 = sharedPreferences.contains("firebase_crashlytics_collection_enabled") ? Boolean.valueOf(sharedPreferences.getBoolean("firebase_crashlytics_collection_enabled", true)) : null;
        if (boolValueOf2 == null) {
            try {
                PackageManager packageManager = context.getPackageManager();
                boolValueOf = (packageManager == null || (applicationInfo = packageManager.getApplicationInfo(context.getPackageName(), Fields.SpotShadowColor)) == null || (bundle = applicationInfo.metaData) == null || !bundle.containsKey("firebase_crashlytics_collection_enabled")) ? null : Boolean.valueOf(applicationInfo.metaData.getBoolean("firebase_crashlytics_collection_enabled"));
            } catch (PackageManager.NameNotFoundException e) {
                SentryLogcatAdapter.read("FirebaseCrashlytics", "Could not read data collection permission from manifest", e);
            }
            boolValueOf2 = boolValueOf == null ? null : Boolean.valueOf(Boolean.TRUE.equals(boolValueOf));
        }
        this.IconCompatParcelizer = boolValueOf2;
        synchronized (this.read) {
            if (read()) {
                ((ParentDataModifierDefaultImpls) this.RemoteActionCompatParcelizer).write(null);
            }
        }
    }

    public ComponentRegistry$Builder(SharedPreferences sharedPreferences, ScheduledThreadPoolExecutor scheduledThreadPoolExecutor) {
        this.IconCompatParcelizer = new ArrayDeque();
        this.write = sharedPreferences;
        this.read = "topic_operation_queue";
        this.RemoteActionCompatParcelizer = ",";
        this.serializer = scheduledThreadPoolExecutor;
    }

    public ComponentRegistry$Builder(accessandjd accessandjdVar) {
        this.write = onContentCardDismissed.IconCompatParcelizer((Collection) accessandjdVar.IconCompatParcelizer);
        this.read = onContentCardDismissed.IconCompatParcelizer((Collection) accessandjdVar.MediaDescriptionCompat);
        this.RemoteActionCompatParcelizer = onContentCardDismissed.IconCompatParcelizer((Collection) accessandjdVar.RemoteActionCompatParcelizer);
        List list = (List) accessandjdVar.serializer.MediaSessionCompatResultReceiverWrapper();
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(new ImageLoader$Builder$$ExternalSyntheticLambda1(1, (onViewAttachedToWindowlambda0) it.next()));
            int i = MediaBrowserCompatMediaItem + 71;
            MediaSessionCompatQueueItem = i % Fields.SpotShadowColor;
            if (i % 2 != 0) {
                int i2 = 2 % 2;
            }
        }
        this.IconCompatParcelizer = arrayList;
        List list2 = (List) accessandjdVar.write.MediaSessionCompatResultReceiverWrapper();
        ArrayList arrayList2 = new ArrayList();
        Iterator it2 = list2.iterator();
        int i3 = 2 % 2;
        while (it2.hasNext()) {
            arrayList2.add(new getStrokeTiuSbCo((PathOperation) it2.next(), 0));
        }
        this.serializer = arrayList2;
        int i4 = MediaBrowserCompatMediaItem + 57;
        MediaSessionCompatQueueItem = i4 % Fields.SpotShadowColor;
        if (i4 % 2 == 0) {
            throw null;
        }
    }
}
