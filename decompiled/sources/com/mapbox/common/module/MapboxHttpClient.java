package com.mapbox.common.module;

import android.content.Context;
import android.content.res.Resources;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkRequest;
import com.mapbox.bindgen.Expected;
import com.mapbox.common.GetLifecycleStateCallback;
import com.mapbox.common.HttpRequestError;
import com.mapbox.common.HttpRequestErrorType;
import com.mapbox.common.LifecycleMonitorFactory;
import com.mapbox.common.LifecycleMonitorInterface;
import com.mapbox.common.LifecycleMonitoringState;
import com.mapbox.common.LifecycleObserver;
import com.mapbox.common.LifecycleState;
import com.mapbox.common.MapboxCommonLogger;
import com.mapbox.common.MapboxSDKCommon;
import com.mapbox.common.NetworkRestriction;
import com.mapbox.common.NetworkStatus;
import com.mapbox.common.OfflineSwitch;
import com.mapbox.common.OfflineSwitchObserver;
import com.mapbox.common.ReachabilityChanged;
import com.mapbox.common.ReachabilityFactory;
import com.mapbox.common.ReachabilityInterface;
import com.mapbox.common.ResultCallback;
import com.mapbox.common.http_backend.Request;
import com.mapbox.common.http_backend.RequestObserver;
import com.mapbox.common.http_backend.Service;
import com.mapbox.maps.MapboxMap$$ExternalSyntheticLambda0;
import com.roadrunner.sidemenu.frequentlyuseditems.FrequentlyUsedItemKt;
import java.lang.ref.WeakReference;
import java.net.URL;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import o.SweepGradientShader9KIMszodefault;
import o.createFromParcel;
import o.isAdapterPositionOnScreen;
import o.isItemDismissable;
import o.onViewDetachedFromWindowlambda1;
import o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0;
import o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM;
import o.setCarryoverInAppMessage;

/* JADX INFO: loaded from: classes2.dex */
public final class MapboxHttpClient implements Service {
    public static final Companion Companion = new Companion(null);
    private static final onViewDetachedFromWindowlambda1 nonMeteredNetworkMonitor$delegate = (isAdapterPositionOnScreen) LazyKt__LazyJVMKt.IconCompatParcelizer(FrequentlyUsedItemKt.RemoteActionCompatParcelizer(), -853852215, 853852217, FrequentlyUsedItemKt.RemoteActionCompatParcelizer(), FrequentlyUsedItemKt.RemoteActionCompatParcelizer(), FrequentlyUsedItemKt.RemoteActionCompatParcelizer(), new Object[]{new r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0() { // from class: com.mapbox.common.module.MapboxHttpClient$Companion$nonMeteredNetworkMonitor$2
        @Override // o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0
        public final MapboxHttpClient.Companion.NonMeteredNetworkMonitor invoke() {
            Object systemService = MapboxSDKCommon.INSTANCE.getContext().getSystemService("connectivity");
            systemService.getClass();
            ConnectivityManager connectivityManager = (ConnectivityManager) systemService;
            MapboxHttpClient.Companion.NonMeteredNetworkMonitor nonMeteredNetworkMonitor = new MapboxHttpClient.Companion.NonMeteredNetworkMonitor();
            try {
                connectivityManager.registerNetworkCallback(new NetworkRequest.Builder().addCapability(12).addCapability(16).addCapability(11).build(), nonMeteredNetworkMonitor);
                return nonMeteredNetworkMonitor;
            } catch (RuntimeException unused) {
                MapboxCommonLogger.INSTANCE.logE$common_release("MapboxHttpClient", "Failed to register non-metered network monitor, disallow_expensive will reject all requests");
                return nonMeteredNetworkMonitor;
            }
        }
    }});
    private final AtomicBoolean allowBackgroundRequests;
    private final Context context;
    private final HttpClientDetail detail;
    private final ConcurrentHashMap<Long, RequestDetail> foregroundRequests;
    private final GetLifecycleStateCallback getLifeCycleStateCallback;
    private LifecycleMonitorInterface lifecycleMonitor;
    private LifecycleObserver lifecycleObserver;
    private LifecycleState lifecycleState;
    private NetworkStatus networkStatus;
    private final AtomicBoolean offline;
    private final OfflineObserver offlineObserver;
    private final AtomicBoolean pauseRequestsOnDemand;
    private final ConcurrentHashMap<Long, RequestDetail> pendingCalls;
    private final ReachabilityInterface reachability;
    private final ReachabilityObserver reachabilityChanged;
    private volatile String subdomainOverrideValue;

    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static final class NonMeteredNetworkMonitor extends ConnectivityManager.NetworkCallback {
            private final AtomicReference<Network> currentNetwork = new AtomicReference<>(null);

            public final AtomicReference<Network> getCurrentNetwork() {
                return this.currentNetwork;
            }

            @Override // android.net.ConnectivityManager.NetworkCallback
            public void onAvailable(Network network) {
                network.getClass();
                this.currentNetwork.set(network);
            }

            @Override // android.net.ConnectivityManager.NetworkCallback
            public void onLost(Network network) {
                network.getClass();
                SweepGradientShader9KIMszodefault.read(this.currentNetwork, network);
            }

            @Override // android.net.ConnectivityManager.NetworkCallback
            public void onUnavailable() {
                this.currentNetwork.set(null);
            }
        }

        private Companion() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final NonMeteredNetworkMonitor getNonMeteredNetworkMonitor() {
            return (NonMeteredNetworkMonitor) MapboxHttpClient.nonMeteredNetworkMonitor$delegate.MediaSessionCompatResultReceiverWrapper();
        }
    }

    /* JADX INFO: loaded from: classes4.dex */
    public static final class OfflineObserver implements OfflineSwitchObserver {
        private final WeakReference<MapboxHttpClient> clientRef;

        @Override // com.mapbox.common.OfflineSwitchObserver
        public void statusChanged(boolean z) {
            MapboxHttpClient mapboxHttpClient = this.clientRef.get();
            if (mapboxHttpClient == null) {
                return;
            }
            mapboxHttpClient.offline.set(!z);
            if (z) {
                return;
            }
            Iterator it = mapboxHttpClient.pendingCalls.entrySet().iterator();
            while (it.hasNext()) {
                ((RequestDetail) ((Map.Entry) it.next()).getValue()).cancel(new HttpRequestError(HttpRequestErrorType.CONNECTION_ERROR, "Connection lost"));
            }
        }

        public OfflineObserver(MapboxHttpClient mapboxHttpClient) {
            mapboxHttpClient.getClass();
            this.clientRef = new WeakReference<>(mapboxHttpClient);
        }
    }

    /* JADX INFO: loaded from: classes4.dex */
    public static final class HttpServiceLifecycleObserver implements LifecycleObserver {
        private final WeakReference<MapboxHttpClient> clientRef;

        public HttpServiceLifecycleObserver(MapboxHttpClient mapboxHttpClient) {
            mapboxHttpClient.getClass();
            this.clientRef = new WeakReference<>(mapboxHttpClient);
        }

        @Override // com.mapbox.common.LifecycleObserver
        public void onLifecycleStateChanged(LifecycleState lifecycleState) {
            lifecycleState.getClass();
            MapboxHttpClient mapboxHttpClient = this.clientRef.get();
            if (mapboxHttpClient == null) {
                return;
            }
            boolean z = mapboxHttpClient.lifecycleState == LifecycleState.FOREGROUND || mapboxHttpClient.lifecycleState == LifecycleState.MOVING_FOREGROUND;
            mapboxHttpClient.lifecycleState = lifecycleState;
            if (mapboxHttpClient.foregroundRequests.isEmpty() || z || !mapboxHttpClient.canSendForegroundRequest()) {
                return;
            }
            mapboxHttpClient.processForegroundQueue();
        }

        @Override // com.mapbox.common.LifecycleObserver
        public void onMonitoringStateChanged(LifecycleMonitoringState lifecycleMonitoringState, String str) {
            lifecycleMonitoringState.getClass();
            MapboxHttpClient mapboxHttpClient = this.clientRef.get();
            if (mapboxHttpClient == null) {
                return;
            }
            if (str != null || lifecycleMonitoringState == LifecycleMonitoringState.STOPPED) {
                mapboxHttpClient.lifecycleState = LifecycleState.UNKNOWN;
            }
        }
    }

    /* JADX INFO: loaded from: classes4.dex */
    public static final class ReachabilityObserver implements ReachabilityChanged {
        private final WeakReference<MapboxHttpClient> clientRef;

        public ReachabilityObserver(MapboxHttpClient mapboxHttpClient) {
            mapboxHttpClient.getClass();
            this.clientRef = new WeakReference<>(mapboxHttpClient);
        }

        @Override // com.mapbox.common.ReachabilityChanged
        public void run(NetworkStatus networkStatus) {
            networkStatus.getClass();
            MapboxHttpClient mapboxHttpClient = this.clientRef.get();
            if (mapboxHttpClient == null) {
                return;
            }
            mapboxHttpClient.networkStatus = networkStatus;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean canSendForegroundRequest() {
        LifecycleState lifecycleState = this.lifecycleState;
        return lifecycleState == LifecycleState.FOREGROUND || lifecycleState == LifecycleState.MOVING_FOREGROUND || lifecycleState == LifecycleState.UNKNOWN;
    }

    private final HttpRequestError checkRequestRestrictions(Request request, Network network) {
        if (this.offline.get()) {
            return new HttpRequestError(HttpRequestErrorType.CONNECTION_ERROR, "Not connected");
        }
        int i = WhenMappings.$EnumSwitchMapping$0[request.getNetworkRestriction().ordinal()];
        if (i != 2) {
            if (i != 3) {
                return null;
            }
            return new HttpRequestError(HttpRequestErrorType.CONNECTION_ERROR, "Not allowed");
        }
        if (network == null) {
            return new HttpRequestError(HttpRequestErrorType.CONNECTION_ERROR, "No connection satisfies network restriction");
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void processForegroundQueue() {
        while (!this.foregroundRequests.isEmpty() && canSendForegroundRequest()) {
            Map.Entry<Long, RequestDetail> next = this.foregroundRequests.entrySet().iterator().next();
            next.getClass();
            Long key = next.getKey();
            next.getValue().start();
            this.foregroundRequests.remove(key);
        }
    }

    private final String withSubdomain(URL url, String str, String str2) {
        String protocol = url.getProtocol();
        String host = url.getHost();
        host.getClass();
        String string = new URL(protocol, setCarryoverInAppMessage.serializer(host, str2, str + '.' + str2), url.getPort(), url.getFile()).toString();
        string.getClass();
        return string;
    }

    public final int getForegroundQueueSize() {
        return this.foregroundRequests.size();
    }

    @Override // com.mapbox.common.http_backend.Service
    public void setMaxRequestsPerHost(byte b) {
        this.detail.setMaxRequestsPerHost(b);
    }

    @Override // com.mapbox.common.http_backend.Service
    public boolean supportsKeepCompression() {
        return this.detail.supportsKeepCompression();
    }

    /* JADX INFO: loaded from: classes4.dex */
    public final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[NetworkRestriction.values().length];
            try {
                iArr[NetworkRestriction.NONE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[NetworkRestriction.DISALLOW_EXPENSIVE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[NetworkRestriction.DISALLOW_ALL.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public MapboxHttpClient(HttpClientDetail httpClientDetail) {
        httpClientDetail.getClass();
        this.detail = httpClientDetail;
        Context context = MapboxSDKCommon.INSTANCE.getContext();
        this.context = context;
        ReachabilityInterface reachabilityInterfaceReachability = ReachabilityFactory.reachability("");
        reachabilityInterfaceReachability.getClass();
        this.reachability = reachabilityInterfaceReachability;
        NetworkStatus networkStatusCurrentNetworkStatus = reachabilityInterfaceReachability.currentNetworkStatus();
        networkStatusCurrentNetworkStatus.getClass();
        this.networkStatus = networkStatusCurrentNetworkStatus;
        this.offline = new AtomicBoolean(false);
        OfflineObserver offlineObserver = new OfflineObserver(this);
        this.offlineObserver = offlineObserver;
        ReachabilityObserver reachabilityObserver = new ReachabilityObserver(this);
        this.reachabilityChanged = reachabilityObserver;
        this.foregroundRequests = new ConcurrentHashMap<>();
        AtomicBoolean atomicBoolean = new AtomicBoolean(true);
        this.allowBackgroundRequests = atomicBoolean;
        AtomicBoolean atomicBoolean2 = new AtomicBoolean(false);
        this.pauseRequestsOnDemand = atomicBoolean2;
        this.lifecycleState = LifecycleState.UNKNOWN;
        this.pendingCalls = new ConcurrentHashMap<>();
        this.subdomainOverrideValue = "";
        OfflineSwitch.getInstance().registerObserver(offlineObserver);
        reachabilityInterfaceReachability.addListener(reachabilityObserver);
        String packageName = context.getPackageName();
        Resources resources = context.getResources();
        if (resources != null) {
            int identifier = resources.getIdentifier("com.mapbox.common.http.allow_background_requests", "bool", packageName);
            if (identifier != 0) {
                atomicBoolean.set(resources.getBoolean(identifier));
            }
            int identifier2 = resources.getIdentifier("com.mapbox.common.http.pause_requests_on_demand", "bool", packageName);
            if (identifier2 != 0) {
                atomicBoolean2.set(resources.getBoolean(identifier2));
            }
            int identifier3 = resources.getIdentifier("com.mapbox.common.http.subdomain_override", "bool", packageName);
            if (identifier3 != 0 && resources.getBoolean(identifier3)) {
                this.subdomainOverrideValue = "stla";
            }
            int identifier4 = resources.getIdentifier("com.mapbox.common.http.subdomain_override_staging", "bool", packageName);
            if (identifier4 != 0 && resources.getBoolean(identifier4)) {
                this.subdomainOverrideValue = "stla-preprod";
            }
        }
        if (!atomicBoolean.get() || atomicBoolean2.get()) {
            disableBackgroundRequests();
        }
        Companion.getNonMeteredNetworkMonitor();
        this.getLifeCycleStateCallback = new GetLifecycleStateCallback() { // from class: com.mapbox.common.module.MapboxHttpClient$$ExternalSyntheticLambda1
            @Override // com.mapbox.common.GetLifecycleStateCallback
            public final void run(Expected expected) {
                MapboxHttpClient.getLifeCycleStateCallback$lambda$1(this.f$0, expected);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void getLifeCycleStateCallback$lambda$1(MapboxHttpClient mapboxHttpClient, Expected expected) {
        mapboxHttpClient.getClass();
        expected.getClass();
        Object valueOrElse = expected.getValueOrElse(new MapboxMap$$ExternalSyntheticLambda0(18));
        valueOrElse.getClass();
        mapboxHttpClient.lifecycleState = (LifecycleState) valueOrElse;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final LifecycleState getLifeCycleStateCallback$lambda$1$lambda$0(String str) {
        str.getClass();
        return LifecycleState.UNKNOWN;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void request$lambda$4(RequestObserver requestObserver, long j, HttpRequestError httpRequestError) {
        requestObserver.getClass();
        requestObserver.onFailed(j, httpRequestError);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void request$lambda$5(RequestObserver requestObserver, long j, Exception exc) {
        requestObserver.getClass();
        exc.getClass();
        requestObserver.onFailed(j, new HttpRequestError(HttpRequestErrorType.OTHER_ERROR, String.valueOf(exc.getMessage())));
    }

    @Override // com.mapbox.common.http_backend.Service
    public void cancelRequest(long j, ResultCallback resultCallback) {
        resultCallback.getClass();
        RequestDetail requestDetailRemoveCall = removeCall(j);
        if (requestDetailRemoveCall == null) {
            resultCallback.run(false);
        } else {
            RequestDetail.DefaultImpls.cancel$default(requestDetailRemoveCall, null, 1, null);
            resultCallback.run(true);
        }
    }

    public final void disableBackgroundRequests() {
        this.allowBackgroundRequests.set(false);
        if (this.lifecycleMonitor == null || this.lifecycleObserver == null) {
            this.lifecycleMonitor = LifecycleMonitorFactory.getOrCreate();
            this.lifecycleObserver = new HttpServiceLifecycleObserver(this);
            LifecycleMonitorInterface lifecycleMonitorInterface = this.lifecycleMonitor;
            lifecycleMonitorInterface.getClass();
            LifecycleObserver lifecycleObserver = this.lifecycleObserver;
            lifecycleObserver.getClass();
            lifecycleMonitorInterface.registerObserver(lifecycleObserver);
            LifecycleMonitorInterface lifecycleMonitorInterface2 = this.lifecycleMonitor;
            lifecycleMonitorInterface2.getClass();
            lifecycleMonitorInterface2.getLifecycleState(this.getLifeCycleStateCallback);
        }
    }

    public final void disablePauseRequestsOnDemand() {
        this.pauseRequestsOnDemand.set(false);
    }

    public final void enableBackgroundRequests() {
        this.allowBackgroundRequests.set(true);
    }

    public final void enablePauseRequestsOnDemand() {
        this.pauseRequestsOnDemand.set(true);
        if (this.lifecycleMonitor == null || this.lifecycleObserver == null) {
            this.lifecycleMonitor = LifecycleMonitorFactory.getOrCreate();
            this.lifecycleObserver = new HttpServiceLifecycleObserver(this);
            LifecycleMonitorInterface lifecycleMonitorInterface = this.lifecycleMonitor;
            lifecycleMonitorInterface.getClass();
            LifecycleObserver lifecycleObserver = this.lifecycleObserver;
            lifecycleObserver.getClass();
            lifecycleMonitorInterface.registerObserver(lifecycleObserver);
            LifecycleMonitorInterface lifecycleMonitorInterface2 = this.lifecycleMonitor;
            lifecycleMonitorInterface2.getClass();
            lifecycleMonitorInterface2.getLifecycleState(this.getLifeCycleStateCallback);
        }
    }

    /* JADX WARN: Code duplicated, block: B:22:0x0074  */
    @Override // com.mapbox.common.http_backend.Service
    public long request(Request request, RequestObserver requestObserver) {
        Object isitemdismissable;
        Request requestBuild;
        request.getClass();
        requestObserver.getClass();
        if (this.subdomainOverrideValue.length() > 0) {
            try {
                isitemdismissable = new URL(request.getUrl());
            } catch (Throwable th) {
                isitemdismissable = new isItemDismissable(th);
            }
            if (isitemdismissable instanceof isItemDismissable) {
                isitemdismissable = null;
            }
            URL url = (URL) isitemdismissable;
            if (url != null) {
                String host = url.getHost();
                host.getClass();
                if (setCarryoverInAppMessage.read(host, "mapbox.com", false)) {
                    requestBuild = request.toBuilder().url(withSubdomain(url, this.subdomainOverrideValue, "mapbox.com")).build();
                } else {
                    String host2 = url.getHost();
                    host2.getClass();
                    requestBuild = setCarryoverInAppMessage.read(host2, "mapbox.tech", false) ? request.toBuilder().url(withSubdomain(url, this.subdomainOverrideValue, "mapbox.tech")).build() : request;
                }
            } else {
                requestBuild = null;
            }
            if (requestBuild == null) {
                requestBuild = request;
            }
        } else {
            requestBuild = request;
        }
        long jNewId = NetworkIdGenerator.INSTANCE.newId();
        Network network = request.getNetworkRestriction() == NetworkRestriction.DISALLOW_EXPENSIVE ? Companion.getNonMeteredNetworkMonitor().getCurrentNetwork().get() : null;
        HttpRequestError httpRequestErrorCheckRequestRestrictions = checkRequestRestrictions(requestBuild, network);
        HttpClientDetail httpClientDetail = this.detail;
        if (httpRequestErrorCheckRequestRestrictions != null) {
            httpClientDetail.executor().execute(new MapboxHttpClient$$ExternalSyntheticLambda2(requestObserver, jNewId, httpRequestErrorCheckRequestRestrictions, 0));
            return jNewId;
        }
        try {
            RequestDetail requestDetailBuildRequest = httpClientDetail.buildRequest(requestBuild, jNewId, requestObserver, new r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM() { // from class: com.mapbox.common.module.MapboxHttpClient$request$requestWrapper$1
                @Override // o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM
                public /* synthetic */ Object invoke(Object obj) {
                    invoke(((Number) obj).longValue());
                    return createFromParcel.INSTANCE;
                }

                {
                    super(1);
                }

                public final void invoke(long j) {
                    this.this$0.removeCall(j);
                }
            }, network);
            this.pendingCalls.put(Long.valueOf(jNewId), requestDetailBuildRequest);
            if (needToPauseRequest(requestBuild)) {
                this.foregroundRequests.put(Long.valueOf(jNewId), requestDetailBuildRequest);
            } else {
                requestDetailBuildRequest.start();
            }
        } catch (Exception e) {
            this.detail.executor().execute(new MapboxHttpClient$$ExternalSyntheticLambda2(requestObserver, jNewId, e, 2));
        }
        return jNewId;
    }

    private final boolean allowAlways(String str) {
        Iterator it = MapboxHttpClientKt.ALLOW_FROM_BACKGROUND_LIST.iterator();
        while (it.hasNext()) {
            if (setCarryoverInAppMessage.RemoteActionCompatParcelizer(str, (String) it.next(), false)) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final RequestDetail removeCall(long j) {
        this.foregroundRequests.remove(Long.valueOf(j));
        return this.pendingCalls.remove(Long.valueOf(j));
    }

    private final boolean needToPauseRequest(Request request) {
        if (canSendForegroundRequest()) {
            return false;
        }
        boolean z = (request.getFlags() & 2) != 0;
        if (this.pauseRequestsOnDemand.get() && z) {
            return true;
        }
        if (this.allowBackgroundRequests.get()) {
            return false;
        }
        String url = request.getUrl();
        url.getClass();
        return !allowAlways(url);
    }
}
