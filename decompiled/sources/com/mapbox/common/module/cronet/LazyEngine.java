package com.mapbox.common.module.cronet;

import android.annotation.SuppressLint;
import android.content.Context;
import com.google.android.gms.net.CronetProviderInstaller;
import com.google.android.gms.tasks.Task;
import com.incognia.internal.mn$$ExternalSyntheticLambda0;
import com.mapbox.bindgen.Value;
import com.mapbox.common.FeatureTelemetryCounter;
import com.mapbox.common.MapboxCommonLogger;
import com.mapbox.common.MapboxSDKCommon;
import com.mapbox.common.SettingsServiceFactory;
import com.mapbox.common.SettingsServiceStorageType;
import com.mapbox.maps.MapboxMap$$ExternalSyntheticLambda0;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.Executor;
import kotlin.jvm.internal.DefaultConstructorMarker;
import o.createFromParcel;
import o.getCieXyz;
import o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM;
import o.removeNodeAtDepth;
import org.chromium.net.CronetEngine;
import org.chromium.net.CronetProvider;

/* JADX INFO: loaded from: classes2.dex */
public final class LazyEngine {
    public static final Companion Companion = new Companion(null);
    private final Context context;
    private CronetProvider cronetProvider;
    private volatile CronetEngine engine;
    private final Executor executor;

    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final void onCronetNotAvailable() {
            FeatureTelemetryCounter.create("common/network/http3/CronetNotAvailable").increment();
            MapboxCommonLogger.INSTANCE.logW$common_release("HTTP", "HTTP/3 will not be available: Cannot find a valid Cronet provider. In order to\nenable HTTP/3 in the Mapbox SDKs, it's necessary that the application depends on\na valid Cronet provider. Valid providers include the Google Play Services\nprovider (from \"com.google.android.gms:play-services-cronet\"), in which case\nCronet will be used from Play Services, or you may choose to embed Cronet with\nyour application by depending on \"org.chromium.net:cronet-embedded\".");
        }

        public final Task installCronetFromPlayServices(Context context) {
            context.getClass();
            Task taskInstallProvider = CronetProviderInstaller.installProvider(context);
            taskInstallProvider.getClass();
            return taskInstallProvider;
        }

        /* JADX WARN: Code duplicated, block: B:10:0x005f  */
        public final void onCronetAvailable(CronetProvider cronetProvider) {
            String str;
            cronetProvider.getClass();
            String name = cronetProvider.getName();
            if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{name, CronetProvider.PROVIDER_NAME_APP_PACKAGED}, getCieXyz.write())).booleanValue()) {
                str = "Embedded";
            } else if (LazyEngineKt.isPlayServicesCronetProviderInstallerAvailable) {
                if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{name, "Google-Play-Services-Cronet-Provider"}, getCieXyz.write())).booleanValue()) {
                    str = "PlayServices";
                } else {
                    str = "UnknownSource";
                }
            } else {
                str = "UnknownSource";
            }
            FeatureTelemetryCounter.create("common/network/http3/Cronet" + str + "Available").increment();
        }

        private Companion() {
        }

        public final boolean canInstallFromGooglePlay() {
            return LazyEngineKt.canInstallFromGooglePlay.getAndSet(false);
        }
    }

    @SuppressLint
    private final CronetEngine configureEngine() {
        try {
            CronetProvider cronetProvider = this.cronetProvider;
            cronetProvider.getClass();
            CronetEngine cronetEngineBuild = cronetProvider.createBuilder().enableBrotli(true).enableQuic(true).enableHttp2(true).addQuicHint("api.mapbox.com", 443, 443).addQuicHint("events.mapbox.com", 443, 443).addQuicHint("config.mapbox.com", 443, 443).enableHttpCache(0, 0L).build();
            cronetEngineBuild.addRequestFinishedListener(new CronetRequestFinishedListener(this.executor));
            handleCronetLogging(cronetEngineBuild);
            Companion companion = Companion;
            CronetProvider cronetProvider2 = this.cronetProvider;
            cronetProvider2.getClass();
            companion.onCronetAvailable(cronetProvider2);
            return cronetEngineBuild;
        } catch (Throwable unused) {
            CopyOnWriteArraySet<String> disabledProviders = LazyEngineKt.getDisabledProviders();
            CronetProvider cronetProvider3 = this.cronetProvider;
            cronetProvider3.getClass();
            disabledProviders.add(cronetProvider3.getName());
            initializeProvider();
            if (this.cronetProvider != null) {
                return configureEngine();
            }
            return null;
        }
    }

    private final void handleCronetLogging(CronetEngine cronetEngine) {
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{SettingsServiceFactory.getInstance(SettingsServiceStorageType.NON_PERSISTENT).get("com.mapbox.common.http.engine.debug.log.enabled", new Value(false)).getValue(), new Value(true)}, getCieXyz.write())).booleanValue()) {
            if (cronetEngine != null) {
                cronetEngine.stopNetLog();
                return;
            }
            return;
        }
        String str = MapboxSDKCommon.INSTANCE.getContext().getFilesDir().getAbsolutePath() + "/cronet-log-" + new SimpleDateFormat("yyyy-MM-dd-HH-mm-ss-SSS").format(new Date()) + ".json";
        if (cronetEngine != null) {
            cronetEngine.startNetLogToFile(str, false);
        }
        MapboxCommonLogger.INSTANCE.logW$common_release("HTTP", "Started writing cronet logs to ".concat(str));
    }

    private final void initializeProvider() {
        CronetProvider cronetProviderFindCronetProvider = LazyEngineKt.findCronetProvider(this.context);
        this.cronetProvider = cronetProviderFindCronetProvider;
        if (cronetProviderFindCronetProvider == null) {
            tryInstallFromGooglePlay();
        }
    }

    private final void tryInstallFromGooglePlay() {
        Companion companion = Companion;
        if (companion.canInstallFromGooglePlay()) {
            companion.installCronetFromPlayServices(this.context).addOnSuccessListener(new mn$$ExternalSyntheticLambda0(new r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM() { // from class: com.mapbox.common.module.cronet.LazyEngine.tryInstallFromGooglePlay.1
                public final void invoke(Void r2) {
                    LazyEngine lazyEngine = LazyEngine.this;
                    lazyEngine.cronetProvider = LazyEngineKt.findCronetProvider(lazyEngine.context);
                }

                {
                    super(1);
                }

                @Override // o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM
                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                    invoke((Void) obj);
                    return createFromParcel.INSTANCE;
                }
            }, 11)).addOnFailureListener(new MapboxMap$$ExternalSyntheticLambda0(19));
        } else {
            companion.onCronetNotAvailable();
        }
    }

    public LazyEngine(Executor executor) {
        executor.getClass();
        this.executor = executor;
        this.context = MapboxSDKCommon.INSTANCE.getContext();
        initializeProvider();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void tryInstallFromGooglePlay$lambda$1(r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm, Object obj) {
        r8lambdaunavo3sxub_pc9xroryotnrlvsm.getClass();
        r8lambdaunavo3sxub_pc9xroryotnrlvsm.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void tryInstallFromGooglePlay$lambda$2(Exception exc) {
        exc.getClass();
        Companion.onCronetNotAvailable();
    }

    public final CronetEngine getEngine() {
        if (this.cronetProvider == null) {
            return null;
        }
        if (this.engine == null) {
            synchronized (this) {
                if (this.engine == null) {
                    this.engine = configureEngine();
                }
            }
        }
        return this.engine;
    }
}
