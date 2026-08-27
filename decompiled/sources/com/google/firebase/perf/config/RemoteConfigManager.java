package com.google.firebase.perf.config;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.pm.PackageManager;
import androidx.annotation.Keep;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import com.google.firebase.remoteconfig.RemoteConfigComponent;
import java.util.Map;
import java.util.Random;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import o.AbstractComposeViewExternalSyntheticLambda0;
import o.accesssetGetBooleanMethodcp;
import o.getDerivedIsAttached;
import o.getWindowInfoannotations;
import o.r8lambdaRBjTXI0wcZOgL0tKaD7_UD07lzs;
import o.sendMotionEvent8iAsVTc;
import o.setComposeViewContextIncrementedDuringInitui;

/* JADX INFO: loaded from: classes2.dex */
@Keep
public class RemoteConfigManager {
    private static final long FETCH_NEVER_HAPPENED_TIMESTAMP_MS = 0;
    private static final String FIREPERF_FRC_NAMESPACE_NAME = "fireperf";
    private static final long MIN_CONFIG_FETCH_DELAY_MS = 5000;
    private static final int RANDOM_CONFIG_FETCH_DELAY_MS = 25000;
    private final ConcurrentHashMap<String, setComposeViewContextIncrementedDuringInitui> allRcConfigMap;
    private final DeviceCacheManager cache;
    private final Executor executor;
    private FirebaseRemoteConfig firebaseRemoteConfig;
    private long firebaseRemoteConfigLastFetchTimestampMs;
    private AbstractComposeViewExternalSyntheticLambda0 firebaseRemoteConfigProvider;
    private final long rcmInitTimestamp;
    private final long remoteConfigFetchDelayInMs;
    private static final getWindowInfoannotations logger = getWindowInfoannotations.write();
    private static final RemoteConfigManager instance = new RemoteConfigManager();
    private static final long TIME_AFTER_WHICH_A_FETCH_IS_CONSIDERED_STALE_MS = 43200000;

    public static RemoteConfigManager getInstance() {
        return instance;
    }

    public static int getVersionCode(Context context) {
        try {
            return context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionCode;
        } catch (PackageManager.NameNotFoundException unused) {
            return 0;
        }
    }

    public long getCurrentSystemTimeMillis() {
        return System.currentTimeMillis();
    }

    public void setFirebaseRemoteConfigProvider(AbstractComposeViewExternalSyntheticLambda0 abstractComposeViewExternalSyntheticLambda0) {
        this.firebaseRemoteConfigProvider = abstractComposeViewExternalSyntheticLambda0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$triggerFirebaseRemoteConfigFetchAndActivateOnSuccessfulFetch$0(Boolean bool) {
        syncConfigValues(this.firebaseRemoteConfig.read());
    }

    public sendMotionEvent8iAsVTc getBoolean(String str) {
        if (str == null) {
            logger.read();
            return new sendMotionEvent8iAsVTc();
        }
        setComposeViewContextIncrementedDuringInitui remoteConfigValue = getRemoteConfigValue(str);
        if (remoteConfigValue != null) {
            try {
                return new sendMotionEvent8iAsVTc(Boolean.valueOf(((r8lambdaRBjTXI0wcZOgL0tKaD7_UD07lzs) remoteConfigValue).serializer()));
            } catch (IllegalArgumentException unused) {
                r8lambdaRBjTXI0wcZOgL0tKaD7_UD07lzs r8lambdarbjtxi0wczogl0tkad7_ud07lzs = (r8lambdaRBjTXI0wcZOgL0tKaD7_UD07lzs) remoteConfigValue;
                if (!r8lambdarbjtxi0wczogl0tkad7_ud07lzs.RemoteActionCompatParcelizer().isEmpty()) {
                    logger.RemoteActionCompatParcelizer("Could not parse value: '%s' for key: '%s'.", r8lambdarbjtxi0wczogl0tkad7_ud07lzs.RemoteActionCompatParcelizer(), str);
                }
            }
        }
        return new sendMotionEvent8iAsVTc();
    }

    public sendMotionEvent8iAsVTc getDouble(String str) {
        if (str == null) {
            logger.read();
            return new sendMotionEvent8iAsVTc();
        }
        setComposeViewContextIncrementedDuringInitui remoteConfigValue = getRemoteConfigValue(str);
        if (remoteConfigValue != null) {
            try {
                return new sendMotionEvent8iAsVTc(Double.valueOf(((r8lambdaRBjTXI0wcZOgL0tKaD7_UD07lzs) remoteConfigValue).IconCompatParcelizer()));
            } catch (IllegalArgumentException unused) {
                r8lambdaRBjTXI0wcZOgL0tKaD7_UD07lzs r8lambdarbjtxi0wczogl0tkad7_ud07lzs = (r8lambdaRBjTXI0wcZOgL0tKaD7_UD07lzs) remoteConfigValue;
                if (!r8lambdarbjtxi0wczogl0tkad7_ud07lzs.RemoteActionCompatParcelizer().isEmpty()) {
                    logger.RemoteActionCompatParcelizer("Could not parse value: '%s' for key: '%s'.", r8lambdarbjtxi0wczogl0tkad7_ud07lzs.RemoteActionCompatParcelizer(), str);
                }
            }
        }
        return new sendMotionEvent8iAsVTc();
    }

    public sendMotionEvent8iAsVTc getLong(String str) {
        if (str == null) {
            logger.read();
            return new sendMotionEvent8iAsVTc();
        }
        setComposeViewContextIncrementedDuringInitui remoteConfigValue = getRemoteConfigValue(str);
        if (remoteConfigValue != null) {
            try {
                return new sendMotionEvent8iAsVTc(Long.valueOf(((r8lambdaRBjTXI0wcZOgL0tKaD7_UD07lzs) remoteConfigValue).read()));
            } catch (IllegalArgumentException unused) {
                r8lambdaRBjTXI0wcZOgL0tKaD7_UD07lzs r8lambdarbjtxi0wczogl0tkad7_ud07lzs = (r8lambdaRBjTXI0wcZOgL0tKaD7_UD07lzs) remoteConfigValue;
                if (!r8lambdarbjtxi0wczogl0tkad7_ud07lzs.RemoteActionCompatParcelizer().isEmpty()) {
                    logger.RemoteActionCompatParcelizer("Could not parse value: '%s' for key: '%s'.", r8lambdarbjtxi0wczogl0tkad7_ud07lzs.RemoteActionCompatParcelizer(), str);
                }
            }
        }
        return new sendMotionEvent8iAsVTc();
    }

    public sendMotionEvent8iAsVTc getString(String str) {
        if (str == null) {
            logger.read();
            return new sendMotionEvent8iAsVTc();
        }
        setComposeViewContextIncrementedDuringInitui remoteConfigValue = getRemoteConfigValue(str);
        return remoteConfigValue != null ? new sendMotionEvent8iAsVTc(((r8lambdaRBjTXI0wcZOgL0tKaD7_UD07lzs) remoteConfigValue).RemoteActionCompatParcelizer()) : new sendMotionEvent8iAsVTc();
    }

    public void syncConfigValues(Map<String, setComposeViewContextIncrementedDuringInitui> map) {
        this.allRcConfigMap.putAll(map);
        for (String str : this.allRcConfigMap.keySet()) {
            if (!map.containsKey(str)) {
                this.allRcConfigMap.remove(str);
            }
        }
        accesssetGetBooleanMethodcp accesssetgetbooleanmethodcp = accesssetGetBooleanMethodcp.read();
        ConcurrentHashMap<String, setComposeViewContextIncrementedDuringInitui> concurrentHashMap = this.allRcConfigMap;
        accesssetgetbooleanmethodcp.getClass();
        setComposeViewContextIncrementedDuringInitui setcomposeviewcontextincrementedduringinitui = concurrentHashMap.get("fpr_experiment_app_start_ttid");
        if (setcomposeviewcontextincrementedduringinitui == null) {
            logger.read();
            return;
        }
        try {
            this.cache.write("com.google.firebase.perf.ExperimentTTID", ((r8lambdaRBjTXI0wcZOgL0tKaD7_UD07lzs) setcomposeviewcontextincrementedduringinitui).serializer());
        } catch (Exception unused) {
            logger.read();
        }
    }

    private setComposeViewContextIncrementedDuringInitui getRemoteConfigValue(String str) {
        triggerRemoteConfigFetchIfNecessary();
        if (!isFirebaseRemoteConfigAvailable() || !this.allRcConfigMap.containsKey(str)) {
            return null;
        }
        setComposeViewContextIncrementedDuringInitui setcomposeviewcontextincrementedduringinitui = this.allRcConfigMap.get(str);
        r8lambdaRBjTXI0wcZOgL0tKaD7_UD07lzs r8lambdarbjtxi0wczogl0tkad7_ud07lzs = (r8lambdaRBjTXI0wcZOgL0tKaD7_UD07lzs) setcomposeviewcontextincrementedduringinitui;
        if (r8lambdarbjtxi0wczogl0tkad7_ud07lzs.RemoteActionCompatParcelizer != 2) {
            return null;
        }
        logger.RemoteActionCompatParcelizer("Fetched value: '%s' for key: '%s' from Firebase Remote Config.", r8lambdarbjtxi0wczogl0tkad7_ud07lzs.RemoteActionCompatParcelizer(), str);
        return setcomposeviewcontextincrementedduringinitui;
    }

    private boolean hasLastFetchBecomeStale(long j) {
        return j - this.firebaseRemoteConfigLastFetchTimestampMs > TIME_AFTER_WHICH_A_FETCH_IS_CONSIDERED_STALE_MS;
    }

    private boolean hasRemoteConfigFetchDelayElapsed(long j) {
        return j - this.rcmInitTimestamp >= this.remoteConfigFetchDelayInMs;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$triggerFirebaseRemoteConfigFetchAndActivateOnSuccessfulFetch$1(Exception exc) {
        logger.write("Call to Remote Config failed: %s. This may cause a degraded experience with Firebase Performance. Please reach out to Firebase Support https://firebase.google.com/support/", exc);
        this.firebaseRemoteConfigLastFetchTimestampMs = 0L;
    }

    private boolean shouldFetchAndActivateRemoteConfigValues() {
        long currentSystemTimeMillis = getCurrentSystemTimeMillis();
        return hasRemoteConfigFetchDelayElapsed(currentSystemTimeMillis) && hasLastFetchBecomeStale(currentSystemTimeMillis);
    }

    private void triggerFirebaseRemoteConfigFetchAndActivateOnSuccessfulFetch() {
        this.firebaseRemoteConfigLastFetchTimestampMs = getCurrentSystemTimeMillis();
        this.firebaseRemoteConfig.serializer().addOnSuccessListener(this.executor, new getDerivedIsAttached(this)).addOnFailureListener(this.executor, new getDerivedIsAttached(this));
    }

    public boolean isFirebaseRemoteConfigAvailable() {
        AbstractComposeViewExternalSyntheticLambda0 abstractComposeViewExternalSyntheticLambda0;
        RemoteConfigComponent remoteConfigComponent;
        if (this.firebaseRemoteConfig == null && (abstractComposeViewExternalSyntheticLambda0 = this.firebaseRemoteConfigProvider) != null && (remoteConfigComponent = (RemoteConfigComponent) abstractComposeViewExternalSyntheticLambda0.write()) != null) {
            this.firebaseRemoteConfig = remoteConfigComponent.write(FIREPERF_FRC_NAMESPACE_NAME);
        }
        return this.firebaseRemoteConfig != null;
    }

    public boolean isLastFetchFailed() {
        FirebaseRemoteConfig firebaseRemoteConfig = this.firebaseRemoteConfig;
        return firebaseRemoteConfig == null || firebaseRemoteConfig.RemoteActionCompatParcelizer().IconCompatParcelizer == 1 || this.firebaseRemoteConfig.RemoteActionCompatParcelizer().IconCompatParcelizer == 2;
    }

    public <T> T getRemoteConfigValueOrDefault(String str, T t) {
        setComposeViewContextIncrementedDuringInitui remoteConfigValue = getRemoteConfigValue(str);
        if (remoteConfigValue != null) {
            try {
                if (t instanceof Boolean) {
                    return (T) Boolean.valueOf(((r8lambdaRBjTXI0wcZOgL0tKaD7_UD07lzs) remoteConfigValue).serializer());
                }
                if (t instanceof Double) {
                    return (T) Double.valueOf(((r8lambdaRBjTXI0wcZOgL0tKaD7_UD07lzs) remoteConfigValue).IconCompatParcelizer());
                }
                if (!(t instanceof Long) && !(t instanceof Integer)) {
                    if (t instanceof String) {
                        return (T) ((r8lambdaRBjTXI0wcZOgL0tKaD7_UD07lzs) remoteConfigValue).RemoteActionCompatParcelizer();
                    }
                    T t2 = (T) ((r8lambdaRBjTXI0wcZOgL0tKaD7_UD07lzs) remoteConfigValue).RemoteActionCompatParcelizer();
                    try {
                        logger.RemoteActionCompatParcelizer("No matching type found for the defaultValue: '%s', using String.", t);
                        return t2;
                    } catch (IllegalArgumentException unused) {
                        t = t2;
                        r8lambdaRBjTXI0wcZOgL0tKaD7_UD07lzs r8lambdarbjtxi0wczogl0tkad7_ud07lzs = (r8lambdaRBjTXI0wcZOgL0tKaD7_UD07lzs) remoteConfigValue;
                        if (!r8lambdarbjtxi0wczogl0tkad7_ud07lzs.RemoteActionCompatParcelizer().isEmpty()) {
                            logger.RemoteActionCompatParcelizer("Could not parse value: '%s' for key: '%s'.", r8lambdarbjtxi0wczogl0tkad7_ud07lzs.RemoteActionCompatParcelizer(), str);
                        }
                        return t;
                    }
                }
                return (T) Long.valueOf(((r8lambdaRBjTXI0wcZOgL0tKaD7_UD07lzs) remoteConfigValue).read());
            } catch (IllegalArgumentException unused2) {
            }
        }
        return t;
    }

    private void triggerRemoteConfigFetchIfNecessary() {
        if (isFirebaseRemoteConfigAvailable()) {
            if (this.allRcConfigMap.isEmpty()) {
                this.allRcConfigMap.putAll(this.firebaseRemoteConfig.read());
            }
            if (shouldFetchAndActivateRemoteConfigValues()) {
                triggerFirebaseRemoteConfigFetchAndActivateOnSuccessfulFetch();
            }
        }
    }

    @SuppressLint
    private RemoteConfigManager() {
        this(DeviceCacheManager.read(), new ThreadPoolExecutor(0, 1, 0L, TimeUnit.SECONDS, new LinkedBlockingQueue()), null, 5000 + ((long) new Random().nextInt(RANDOM_CONFIG_FETCH_DELAY_MS)));
    }

    public RemoteConfigManager(DeviceCacheManager deviceCacheManager, Executor executor, FirebaseRemoteConfig firebaseRemoteConfig, long j) {
        ConcurrentHashMap<String, setComposeViewContextIncrementedDuringInitui> concurrentHashMap;
        this.rcmInitTimestamp = getCurrentSystemTimeMillis();
        this.firebaseRemoteConfigLastFetchTimestampMs = 0L;
        this.cache = deviceCacheManager;
        this.executor = executor;
        this.firebaseRemoteConfig = firebaseRemoteConfig;
        if (firebaseRemoteConfig == null) {
            concurrentHashMap = new ConcurrentHashMap<>();
        } else {
            concurrentHashMap = new ConcurrentHashMap<>(firebaseRemoteConfig.read());
        }
        this.allRcConfigMap = concurrentHashMap;
        this.remoteConfigFetchDelayInMs = j;
    }
}
