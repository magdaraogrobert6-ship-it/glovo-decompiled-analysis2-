package o;

import com.huawei.hmf.tasks.a.i$d;
import com.huawei.hms.android.SystemUtils;
import io.grpc.internal.CallTracer;
import io.sentry.MovePreviousSession;
import io.sentry.Sentry$$ExternalSyntheticLambda0;
import io.sentry.Sentry$$ExternalSyntheticLambda5;
import io.sentry.SentryClient;
import io.sentry.SentryOptions;
import io.sentry.android.core.ActivityLifecycleIntegration$$ExternalSyntheticLambda6;
import io.sentry.android.core.SentryAndroidOptions;
import java.io.File;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Properties;
import java.util.Queue;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.RejectedExecutionException;

/* JADX INFO: loaded from: classes4.dex */
public abstract class internalHeightCallbacklambda0 {
    public static volatile getAllUris MediaSessionCompatQueueItem = isArgCountInBoundslambda1.IconCompatParcelizer;
    public static volatile AddToCustomAttributeArrayStep MediaBrowserCompatMediaItem = args_delegatelambda0.serializer;
    public static final BannerView RemoteActionCompatParcelizer = new BannerView(SentryOptions.empty());
    public static volatile boolean IconCompatParcelizer = false;
    public static final Charset write = Charset.forName(com.adjust.sdk.Constants.ENCODING);
    public static final long serializer = System.currentTimeMillis();
    public static final io.sentry.util.RemoteActionCompatParcelizer read = new io.sentry.util.RemoteActionCompatParcelizer();

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v4, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r0v5, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r0v7, types: [java.util.List] */
    public static void IconCompatParcelizer(SentryOptions sentryOptions) {
        ?? arrayList;
        r8lambdaea88sc6bNzdkREmuTaOF4vcCHI r8lambdaea88sc6bnzdkremutaof4vcchi = r8lambdaea88sc6bNzdkREmuTaOF4vcCHI.IconCompatParcelizer;
        boolean z = io.sentry.util.PlaybackStateCompatCustomAction.serializer;
        int i = 0;
        if (!z) {
            if (beforeMessageClosed.AUTO.equals(sentryOptions.getOpenTelemetryMode())) {
                if (io.sentry.util.MediaBrowserCompatMediaItem.write(r8lambdaea88sc6bnzdkremutaof4vcchi, "io.sentry.opentelemetry.agent.AgentMarker")) {
                    sentryOptions.getLogger().IconCompatParcelizer(r8lambdaL32xCEzW71g2Xzeh1NM3NImxco.DEBUG, "openTelemetryMode has been inferred from AUTO to AGENT", new Object[0]);
                    sentryOptions.setOpenTelemetryMode(beforeMessageClosed.AGENT);
                } else if (io.sentry.util.MediaBrowserCompatMediaItem.write(r8lambdaea88sc6bnzdkremutaof4vcchi, "io.sentry.opentelemetry.agent.AgentlessMarker")) {
                    sentryOptions.getLogger().IconCompatParcelizer(r8lambdaL32xCEzW71g2Xzeh1NM3NImxco.DEBUG, "openTelemetryMode has been inferred from AUTO to AGENTLESS", new Object[0]);
                    sentryOptions.setOpenTelemetryMode(beforeMessageClosed.AGENTLESS);
                } else if (io.sentry.util.MediaBrowserCompatMediaItem.write(r8lambdaea88sc6bnzdkremutaof4vcchi, "io.sentry.opentelemetry.agent.AgentlessSpringMarker")) {
                    sentryOptions.getLogger().IconCompatParcelizer(r8lambdaL32xCEzW71g2Xzeh1NM3NImxco.DEBUG, "openTelemetryMode has been inferred from AUTO to AGENTLESS_SPRING", new Object[0]);
                    sentryOptions.setOpenTelemetryMode(beforeMessageClosed.AGENTLESS_SPRING);
                }
            }
        }
        beforeMessageClosed beforemessageclosed = beforeMessageClosed.OFF;
        if (beforemessageclosed == sentryOptions.getOpenTelemetryMode()) {
            sentryOptions.setSpanFactory(new coerceArgToPropertiesOrNull(1));
        }
        MediaSessionCompatQueueItem.RemoteActionCompatParcelizer();
        if (beforemessageclosed == sentryOptions.getOpenTelemetryMode()) {
            MediaSessionCompatQueueItem = new openUriWithWebViewActivityFromPush();
        } else {
            MediaSessionCompatQueueItem = fireOnDismissCallback.RemoteActionCompatParcelizer(new io.sentry.util.MediaBrowserCompatMediaItem(i));
        }
        if (z) {
            return;
        }
        beforeMessageClosed openTelemetryMode = sentryOptions.getOpenTelemetryMode();
        if (beforemessageclosed.equals(openTelemetryMode)) {
            arrayList = Collections.EMPTY_LIST;
        } else {
            ConcurrentHashMap concurrentHashMap = io.sentry.util.MediaSessionCompatResultReceiverWrapper.RemoteActionCompatParcelizer;
            arrayList = new ArrayList();
            beforeMessageClosed beforemessageclosed2 = beforeMessageClosed.AGENT;
            if (beforemessageclosed2 == openTelemetryMode || beforeMessageClosed.AGENTLESS_SPRING == openTelemetryMode) {
                arrayList.add("auto.http.spring_jakarta.webmvc");
                arrayList.add("auto.http.spring.webmvc");
                arrayList.add("auto.http.spring7.webmvc");
                arrayList.add("auto.spring_jakarta.webflux");
                arrayList.add("auto.spring.webflux");
                arrayList.add("auto.spring7.webflux");
                arrayList.add("auto.db.jdbc");
                arrayList.add("auto.http.spring_jakarta.webclient");
                arrayList.add("auto.http.spring.webclient");
                arrayList.add("auto.http.spring7.webclient");
                arrayList.add("auto.http.spring_jakarta.restclient");
                arrayList.add("auto.http.spring.restclient");
                arrayList.add("auto.http.spring7.restclient");
                arrayList.add("auto.http.spring_jakarta.resttemplate");
                arrayList.add("auto.http.spring.resttemplate");
                arrayList.add("auto.http.spring7.resttemplate");
                arrayList.add("auto.http.openfeign");
                arrayList.add("auto.http.ktor-client");
            }
            if (beforemessageclosed2 == openTelemetryMode) {
                arrayList.add("auto.graphql.graphql");
                arrayList.add("auto.graphql.graphql22");
            }
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            sentryOptions.addIgnoredSpanOrigin((String) it.next());
        }
    }

    public static void RemoteActionCompatParcelizer() {
        UriActionExternalSyntheticLambda4 uriActionExternalSyntheticLambda4Serializer = read.serializer();
        try {
            AddToCustomAttributeArrayStep addToCustomAttributeArrayStepIconCompatParcelizer = IconCompatParcelizer();
            MediaBrowserCompatMediaItem = args_delegatelambda0.serializer;
            MediaSessionCompatQueueItem.RemoteActionCompatParcelizer();
            addToCustomAttributeArrayStepIconCompatParcelizer.serializer(false);
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

    public static void write(isArgCountInBounds isargcountinbounds, ActivityLifecycleIntegration$$ExternalSyntheticLambda6 activityLifecycleIntegration$$ExternalSyntheticLambda6) {
        SentryOptions sentryOptions = (SentryOptions) SentryAndroidOptions.class.getDeclaredConstructor(null).newInstance(null);
        try {
            activityLifecycleIntegration$$ExternalSyntheticLambda6.read(sentryOptions);
        } catch (Throwable th) {
            sentryOptions.getLogger().serializer(r8lambdaL32xCEzW71g2Xzeh1NM3NImxco.ERROR, "Error in the 'OptionsConfiguration.configure' callback.", th);
        }
        UriActionExternalSyntheticLambda4 uriActionExternalSyntheticLambda4Serializer = read.serializer();
        try {
            if (!sentryOptions.getClass().getName().equals("io.sentry.android.core.SentryAndroidOptions") && io.sentry.util.PlaybackStateCompatCustomAction.serializer) {
                throw new IllegalArgumentException("You are running Android. Please, use SentryAndroid.init. ".concat(sentryOptions.getClass().getName()));
            }
            if (sentryOptions.isEnableExternalConfiguration()) {
                sentryOptions.merge(r8lambdazcrctSUJRiG8aDijZ5sY7PjsT3o.IconCompatParcelizer(io.sentry.config.RemoteActionCompatParcelizer.RemoteActionCompatParcelizer(), sentryOptions.getLogger()));
            }
            String dsn = sentryOptions.getDsn();
            if (!sentryOptions.isEnabled() || (dsn != null && dsn.isEmpty())) {
                RemoteActionCompatParcelizer();
            } else if (dsn != null) {
                sentryOptions.retrieveParsedDsn();
                Boolean boolIsGlobalHubMode = sentryOptions.isGlobalHubMode();
                int i = 1;
                boolean zBooleanValue = boolIsGlobalHubMode != null ? boolIsGlobalHubMode.booleanValue() : true;
                int i2 = 0;
                sentryOptions.getLogger().IconCompatParcelizer(r8lambdaL32xCEzW71g2Xzeh1NM3NImxco.INFO, "GlobalHubMode: '%s'", String.valueOf(zBooleanValue));
                IconCompatParcelizer = zBooleanValue;
                if (sentryOptions.getFatalLogger() instanceof r8lambdaea88sc6bNzdkREmuTaOF4vcCHI) {
                    sentryOptions.setFatalLogger(new getUriActionForCardlambda0());
                }
                BannerView bannerView = RemoteActionCompatParcelizer;
                int i3 = 2;
                if (((Boolean) coil3.UriKt.RemoteActionCompatParcelizer(accessunpack.serializer(), accessunpack.serializer(), -2085012584, 2085012584, new Object[]{bannerView.MediaBrowserCompatMediaItem, sentryOptions, Boolean.valueOf(read())}, accessunpack.serializer(), accessunpack.serializer())).booleanValue()) {
                    if (read()) {
                        sentryOptions.getLogger().IconCompatParcelizer(r8lambdaL32xCEzW71g2Xzeh1NM3NImxco.WARNING, "Sentry has been already initialized. Previous configuration will be overwritten.", new Object[0]);
                    }
                    IconCompatParcelizer().serializer(true);
                    bannerView.MediaBrowserCompatMediaItem = sentryOptions;
                    Queue queue = bannerView.RemoteActionCompatParcelizer;
                    bannerView.RemoteActionCompatParcelizer = BannerView.read(sentryOptions.getMaxBreadcrumbs());
                    Iterator it = queue.iterator();
                    while (it.hasNext()) {
                        bannerView.read((getIntentArrayWithConfiguredBackStacklambda1) it.next(), null);
                    }
                    MediaBrowserCompatMediaItem = new dismissSubscriberlambda0(new BannerView(sentryOptions), new BannerView(sentryOptions), bannerView);
                    if (sentryOptions.isDebug() && (sentryOptions.getLogger() instanceof r8lambdaea88sc6bNzdkREmuTaOF4vcCHI)) {
                        sentryOptions.setLogger(new getUriActionForCardlambda0());
                    }
                    IconCompatParcelizer(sentryOptions);
                    MediaSessionCompatQueueItem.write(MediaBrowserCompatMediaItem);
                    write(sentryOptions);
                    bannerView.read = new SentryClient(sentryOptions);
                    if (sentryOptions.getExecutorService().RemoteActionCompatParcelizer()) {
                        sentryOptions.setExecutorService(new CallTracer(sentryOptions));
                        sentryOptions.getExecutorService().serializer();
                    }
                    try {
                        sentryOptions.getExecutorService().RemoteActionCompatParcelizer(new Sentry$$ExternalSyntheticLambda0(sentryOptions, i2));
                    } catch (RejectedExecutionException e) {
                        sentryOptions.getLogger().serializer(r8lambdaL32xCEzW71g2Xzeh1NM3NImxco.DEBUG, "Failed to call the executor. Lazy fields will not be loaded. Did you call Sentry.close()?", e);
                    }
                    try {
                        sentryOptions.getExecutorService().RemoteActionCompatParcelizer(new MovePreviousSession(i2, sentryOptions));
                    } catch (Throwable th2) {
                        sentryOptions.getLogger().serializer(r8lambdaL32xCEzW71g2Xzeh1NM3NImxco.DEBUG, "Failed to move previous session.", th2);
                    }
                    for (LogCustomEventStep logCustomEventStep : sentryOptions.getIntegrations()) {
                        try {
                            logCustomEventStep.RemoteActionCompatParcelizer(sentryOptions);
                        } catch (Throwable th3) {
                            sentryOptions.getLogger().serializer(r8lambdaL32xCEzW71g2Xzeh1NM3NImxco.WARNING, "Failed to register the integration " + logCustomEventStep.getClass().getName(), th3);
                        }
                    }
                    try {
                        sentryOptions.getExecutorService().RemoteActionCompatParcelizer(new Sentry$$ExternalSyntheticLambda0(sentryOptions, i3));
                    } catch (Throwable th4) {
                        sentryOptions.getLogger().serializer(r8lambdaL32xCEzW71g2Xzeh1NM3NImxco.DEBUG, "Failed to notify options observers.", th4);
                    }
                    try {
                        sentryOptions.getExecutorService().RemoteActionCompatParcelizer(new StepDataExternalSyntheticLambda1(sentryOptions));
                    } catch (Throwable th5) {
                        sentryOptions.getLogger().serializer(r8lambdaL32xCEzW71g2Xzeh1NM3NImxco.DEBUG, "Failed to finalize previous session.", th5);
                    }
                    try {
                        sentryOptions.getExecutorService().RemoteActionCompatParcelizer(new Sentry$$ExternalSyntheticLambda0(sentryOptions, i));
                    } catch (Throwable th6) {
                        sentryOptions.getLogger().serializer(r8lambdaL32xCEzW71g2Xzeh1NM3NImxco.ERROR, "Failed to call the executor. App start profiling config will not be changed. Did you call Sentry.close()?", th6);
                    }
                    BrazeActionParserExternalSyntheticLambda0 logger = sentryOptions.getLogger();
                    r8lambdaL32xCEzW71g2Xzeh1NM3NImxco r8lambdal32xcezw71g2xzeh1nm3nimxco = r8lambdaL32xCEzW71g2Xzeh1NM3NImxco.DEBUG;
                    logger.IconCompatParcelizer(r8lambdal32xcezw71g2xzeh1nm3nimxco, "Using openTelemetryMode %s", sentryOptions.getOpenTelemetryMode());
                    sentryOptions.getLogger().IconCompatParcelizer(r8lambdal32xcezw71g2xzeh1nm3nimxco, "Using span factory %s", sentryOptions.getSpanFactory().getClass().getName());
                    sentryOptions.getLogger().IconCompatParcelizer(r8lambdal32xcezw71g2xzeh1nm3nimxco, "Using scopes storage %s", MediaSessionCompatQueueItem.getClass().getName());
                } else {
                    sentryOptions.getLogger().IconCompatParcelizer(r8lambdaL32xCEzW71g2Xzeh1NM3NImxco.WARNING, "This init call has been ignored due to priority being too low.", new Object[0]);
                }
            } else {
                throw new IllegalArgumentException("DSN is required. Use empty string or set enabled to false in SentryOptions to disable SDK.");
            }
            uriActionExternalSyntheticLambda4Serializer.close();
        } catch (Throwable th7) {
            try {
                uriActionExternalSyntheticLambda4Serializer.close();
                throw th7;
            } catch (Throwable th8) {
                th7.addSuppressed(th8);
                throw th7;
            }
        }
    }

    public static AddToCustomAttributeArrayStep IconCompatParcelizer() {
        if (IconCompatParcelizer) {
            return MediaBrowserCompatMediaItem;
        }
        AddToCustomAttributeArrayStep addToCustomAttributeArrayStepSerializer = MediaSessionCompatQueueItem.serializer();
        if (addToCustomAttributeArrayStepSerializer != null && !addToCustomAttributeArrayStepSerializer.PlaybackStateCompat()) {
            return addToCustomAttributeArrayStepSerializer;
        }
        AddToCustomAttributeArrayStep addToCustomAttributeArrayStep = MediaBrowserCompatMediaItem.read("getCurrentScopes");
        MediaSessionCompatQueueItem.write(addToCustomAttributeArrayStep);
        return addToCustomAttributeArrayStep;
    }

    public static void read(r8lambdaaCm2JcMru73kJeywi54SW2Mni8U r8lambdaacm2jcmru73kjeywi54sw2mni8u) {
        IconCompatParcelizer().RemoteActionCompatParcelizer(r8lambdaacm2jcmru73kjeywi54sw2mni8u);
    }

    public static boolean read() {
        return IconCompatParcelizer().MediaBrowserCompatMediaItem();
    }

    public static void write(SentryOptions sentryOptions) {
        io.sentry.cache.serializer remoteActionCompatParcelizer;
        BrazeActionParserExternalSyntheticLambda0 logger = sentryOptions.getLogger();
        r8lambdaL32xCEzW71g2Xzeh1NM3NImxco r8lambdal32xcezw71g2xzeh1nm3nimxco = r8lambdaL32xCEzW71g2Xzeh1NM3NImxco.INFO;
        logger.IconCompatParcelizer(r8lambdal32xcezw71g2xzeh1nm3nimxco, "Initializing SDK with DSN: '%s'", sentryOptions.getDsn());
        String outboxPath = sentryOptions.getOutboxPath();
        int i = 0;
        if (outboxPath != null) {
            sentryOptions.getRuntimeManager().RemoteActionCompatParcelizer(new performDismissTeardown(new File(outboxPath), 0));
        } else {
            logger.IconCompatParcelizer(r8lambdal32xcezw71g2xzeh1nm3nimxco, "No outbox dir path is defined in options.", new Object[0]);
        }
        String cacheDirPath = sentryOptions.getCacheDirPath();
        if (cacheDirPath != null) {
            sentryOptions.getRuntimeManager().RemoteActionCompatParcelizer(new performDismissTeardown(new File(cacheDirPath), 1));
            if (sentryOptions.getEnvelopeDiskCache() instanceof io.sentry.transport.RatingCompat) {
                int i2 = io.sentry.cache.RemoteActionCompatParcelizer.IconCompatParcelizer;
                String cacheDirPath2 = sentryOptions.getCacheDirPath();
                int maxCacheItems = sentryOptions.getMaxCacheItems();
                if (cacheDirPath2 == null) {
                    sentryOptions.getLogger().IconCompatParcelizer(r8lambdaL32xCEzW71g2Xzeh1NM3NImxco.WARNING, "cacheDirPath is null, returning NoOpEnvelopeCache", new Object[0]);
                    remoteActionCompatParcelizer = io.sentry.transport.RatingCompat.RemoteActionCompatParcelizer;
                } else {
                    remoteActionCompatParcelizer = new io.sentry.cache.RemoteActionCompatParcelizer(sentryOptions, cacheDirPath2, maxCacheItems);
                }
                sentryOptions.setEnvelopeDiskCache(remoteActionCompatParcelizer);
            }
        }
        String profilingTracesDirPath = sentryOptions.getProfilingTracesDirPath();
        if ((sentryOptions.isProfilingEnabled() || sentryOptions.isContinuousProfilingEnabled()) && profilingTracesDirPath != null) {
            File file = new File(profilingTracesDirPath);
            sentryOptions.getRuntimeManager().RemoteActionCompatParcelizer(new performDismissTeardown(file, 2));
            try {
                sentryOptions.getExecutorService().RemoteActionCompatParcelizer(new Sentry$$ExternalSyntheticLambda5(i, file));
            } catch (RejectedExecutionException e) {
                sentryOptions.getLogger().serializer(r8lambdaL32xCEzW71g2Xzeh1NM3NImxco.ERROR, "Failed to call the executor. Old profiles will not be deleted. Did you call Sentry.close()?", e);
            }
        }
        io.sentry.internal.modules.RemoteActionCompatParcelizer modulesLoader = sentryOptions.getModulesLoader();
        if (!sentryOptions.isSendModules()) {
            sentryOptions.setModulesLoader(io.sentry.internal.modules.read.RemoteActionCompatParcelizer);
        } else if (modulesLoader instanceof io.sentry.internal.modules.read) {
            sentryOptions.setModulesLoader(new io.sentry.internal.modules.MediaMetadataCompat(Arrays.asList(new io.sentry.internal.modules.serializer(sentryOptions.getLogger()), new io.sentry.internal.modules.MediaMetadataCompat(sentryOptions.getLogger())), sentryOptions.getLogger()));
        }
        if (sentryOptions.getDebugMetaLoader() instanceof io.sentry.internal.debugmeta.serializer) {
            sentryOptions.setDebugMetaLoader(new i$d(sentryOptions.getLogger()));
        }
        List<Properties> listIconCompatParcelizer = sentryOptions.getDebugMetaLoader().IconCompatParcelizer();
        if (listIconCompatParcelizer != null) {
            if (sentryOptions.getBundleIds().isEmpty()) {
                Iterator it = listIconCompatParcelizer.iterator();
                while (it.hasNext()) {
                    String property = ((Properties) it.next()).getProperty("io.sentry.bundle-ids");
                    sentryOptions.getLogger().IconCompatParcelizer(r8lambdaL32xCEzW71g2Xzeh1NM3NImxco.DEBUG, "Bundle IDs found: %s", property);
                    if (property != null) {
                        for (String str : property.split(",", -1)) {
                            sentryOptions.addBundleId(str);
                        }
                    }
                }
            }
            if (sentryOptions.getProguardUuid() == null) {
                Iterator it2 = listIconCompatParcelizer.iterator();
                while (it2.hasNext()) {
                    String property2 = ((Properties) it2.next()).getProperty("io.sentry.ProguardUuids");
                    if (property2 != null) {
                        sentryOptions.getLogger().IconCompatParcelizer(r8lambdaL32xCEzW71g2Xzeh1NM3NImxco.DEBUG, "Proguard UUID found: %s", property2);
                        sentryOptions.setProguardUuid(property2);
                        break;
                    }
                }
            }
            for (Properties properties : listIconCompatParcelizer) {
                String property3 = properties.getProperty("io.sentry.build-tool");
                if (property3 != null) {
                    String property4 = properties.getProperty("io.sentry.build-tool-version");
                    if (property4 == null) {
                        property4 = SystemUtils.UNKNOWN;
                    }
                    sentryOptions.getLogger().IconCompatParcelizer(r8lambdaL32xCEzW71g2Xzeh1NM3NImxco.DEBUG, "Build tool found: %s, version %s", property3, property4);
                    BannerViewcreateBannerWebViewClientListener1.RemoteActionCompatParcelizer().IconCompatParcelizer(property3, property4);
                    break;
                }
            }
            for (Properties properties2 : listIconCompatParcelizer) {
                String property5 = properties2.getProperty("io.sentry.distribution.org-slug");
                String property6 = properties2.getProperty("io.sentry.distribution.project-slug");
                String property7 = properties2.getProperty("io.sentry.distribution.auth-token");
                String property8 = properties2.getProperty("io.sentry.distribution.build-configuration");
                if (property5 != null || property6 != null || property7 != null || property8 != null) {
                    setBannerHeight distribution = sentryOptions.getDistribution();
                    if (property5 != null && !property5.isEmpty() && distribution.read.isEmpty()) {
                        sentryOptions.getLogger().IconCompatParcelizer(r8lambdaL32xCEzW71g2Xzeh1NM3NImxco.DEBUG, "Distribution org slug found: %s", property5);
                        distribution.read = property5;
                    }
                    if (property6 != null && !property6.isEmpty() && distribution.serializer.isEmpty()) {
                        sentryOptions.getLogger().IconCompatParcelizer(r8lambdaL32xCEzW71g2Xzeh1NM3NImxco.DEBUG, "Distribution project slug found: %s", property6);
                        distribution.serializer = property6;
                    }
                    if (property7 != null && !property7.isEmpty() && distribution.RemoteActionCompatParcelizer.isEmpty()) {
                        sentryOptions.getLogger().IconCompatParcelizer(r8lambdaL32xCEzW71g2Xzeh1NM3NImxco.DEBUG, "Distribution org auth token found", new Object[0]);
                        distribution.RemoteActionCompatParcelizer = property7;
                    }
                    if (property8 != null && !property8.isEmpty() && distribution.write == null) {
                        sentryOptions.getLogger().IconCompatParcelizer(r8lambdaL32xCEzW71g2Xzeh1NM3NImxco.DEBUG, "Distribution build configuration found: %s", property8);
                        distribution.write = property8;
                        break;
                    } else {
                        break;
                        break;
                        break;
                    }
                }
            }
        }
        if (sentryOptions.getThreadChecker() instanceof io.sentry.util.thread.read) {
            sentryOptions.setThreadChecker(io.sentry.util.thread.serializer.RemoteActionCompatParcelizer());
        }
        if (sentryOptions.getPerformanceCollectors().isEmpty()) {
            sentryOptions.addPerformanceCollector(new NoOpStep());
        }
        if (sentryOptions.isEnableBackpressureHandling() && !io.sentry.util.PlaybackStateCompatCustomAction.serializer) {
            if (sentryOptions.getBackpressureMonitor() instanceof io.sentry.backpressure.write) {
                sentryOptions.setBackpressureMonitor(new io.sentry.backpressure.IconCompatParcelizer(sentryOptions));
            }
            sentryOptions.getBackpressureMonitor().read();
        }
        if (!io.sentry.util.PlaybackStateCompatCustomAction.serializer && sentryOptions.isContinuousProfilingEnabled() && (sentryOptions.getContinuousProfiler() instanceof r8lambdaOvKN5euqH6Ij7OM19FiXA03UYH4)) {
            try {
                if (sentryOptions.getProfilingTracesDirPath() == null) {
                    File file2 = new File(System.getProperty("java.io.tmpdir"), "sentry_profiling_traces");
                    if (file2.mkdirs() || file2.exists()) {
                        sentryOptions.setProfilingTracesDirPath(file2.getAbsolutePath());
                    } else {
                        r8lambdayUqGVEpC1kg8ua3jc9a113shNIE.serializer(file2.getAbsolutePath(), "Creating a fallback directory for profiling failed in ");
                    }
                }
                BrazeActionParserExternalSyntheticLambda0 logger2 = sentryOptions.getLogger();
                sentryOptions.getProfilingTracesHz();
                sentryOptions.getExecutorService();
                DegreesKt.IconCompatParcelizer(logger2);
                sentryOptions.getLogger().IconCompatParcelizer(r8lambdaL32xCEzW71g2Xzeh1NM3NImxco.WARNING, "Could not load profiler, profiling will be disabled. If you are using Spring or Spring Boot with the OTEL Agent profiler init will be retried.", new Object[0]);
            } catch (Exception e2) {
                sentryOptions.getLogger().serializer(r8lambdaL32xCEzW71g2Xzeh1NM3NImxco.ERROR, "Failed to create default profiling traces directory", e2);
            }
            sentryOptions.getContinuousProfiler();
        } else {
            sentryOptions.getContinuousProfiler();
        }
        if (!io.sentry.util.PlaybackStateCompatCustomAction.serializer && sentryOptions.isContinuousProfilingEnabled() && (sentryOptions.getProfilerConverter() instanceof firstArg_delegatelambda0)) {
            DegreesKt.read();
            sentryOptions.getLogger().IconCompatParcelizer(r8lambdaL32xCEzW71g2Xzeh1NM3NImxco.WARNING, "Could not load profile converter. If you are using Spring or Spring Boot with the OTEL Agent, profile converter init will be retried.", new Object[0]);
            sentryOptions.getProfilerConverter();
        } else {
            sentryOptions.getProfilerConverter();
        }
        sentryOptions.getLogger().IconCompatParcelizer(r8lambdaL32xCEzW71g2Xzeh1NM3NImxco.INFO, "Continuous profiler is enabled %s mode: %s", Boolean.valueOf(sentryOptions.isContinuousProfilingEnabled()), sentryOptions.getProfileLifecycle());
    }
}
