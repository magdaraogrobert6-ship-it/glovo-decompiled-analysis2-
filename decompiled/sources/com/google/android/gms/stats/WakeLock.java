package com.google.android.gms.stats;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.PowerManager;
import android.os.SystemClock;
import android.os.WorkSource;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.internal.stats.zzi;
import io.sentry.android.core.SentryLogcatAdapter;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import o.FocusListener;
import o.OnRemeasuredModifierDefaultImpls;
import o.accessgetSystemNavigationDowncp;
import o.accessgetTvInputComposite1cp;
import o.accessgetTvInputHdmi2cp;
import o.accessgetTvInputHdmi3cp;
import o.accessgetTvMediaContextMenucp;
import o.isAppSetIdReadingEnabled;
import o.logClicklambda0;
import o.r8lambdaL32xCEzW71g2Xzeh1NM3NImxco;
import o.r8lambdayUqGVEpC1kg8ua3jc9a113shNIE;
import o.recordFsph7yY;

/* JADX INFO: loaded from: classes2.dex */
public final class WakeLock {
    public static volatile ScheduledExecutorService IconCompatParcelizer;
    public static final Object read = new Object();
    public int MediaBrowserCompatMediaItem;
    public boolean MediaDescriptionCompat;
    public ScheduledFuture MediaMetadataCompat;
    public long MediaSessionCompatQueueItem;
    public final ScheduledExecutorService MediaSessionCompatResultReceiverWrapper;
    public final String MediaSessionCompatToken;
    public final AtomicInteger ParcelableVolumeInfo;
    public final accessgetTvInputComposite1cp PlaybackStateCompat;
    public final HashMap PlaybackStateCompatCustomAction;
    public final HashSet RatingCompat;
    public recordFsph7yY RemoteActionCompatParcelizer;
    public final PowerManager.WakeLock serializer;
    public final Object write;

    public WakeLock(Context context) {
        boolean zBooleanValue;
        WorkSource workSource;
        String packageName = context.getPackageName();
        this.write = new Object();
        this.MediaBrowserCompatMediaItem = 0;
        this.RatingCompat = new HashSet();
        this.MediaDescriptionCompat = true;
        this.PlaybackStateCompat = accessgetTvInputComposite1cp.read;
        this.PlaybackStateCompatCustomAction = new HashMap();
        this.ParcelableVolumeInfo = new AtomicInteger(0);
        accessgetSystemNavigationDowncp.RemoteActionCompatParcelizer("wake:com.google.firebase.iid.WakeLockHolder", "WakeLock: wakeLockName must not be empty");
        context.getApplicationContext();
        this.RemoteActionCompatParcelizer = null;
        if ("com.google.android.gms".equals(context.getPackageName())) {
            this.MediaSessionCompatToken = "wake:com.google.firebase.iid.WakeLockHolder";
        } else {
            this.MediaSessionCompatToken = "*gcore*:".concat("wake:com.google.firebase.iid.WakeLockHolder");
        }
        PowerManager powerManager = (PowerManager) context.getSystemService("power");
        if (powerManager == null) {
            StringBuilder sb = new StringBuilder(29);
            sb.append((CharSequence) "expected a non-null reference", 0, 29);
            throw new zzi(sb.toString());
        }
        this.serializer = powerManager.newWakeLock(1, "wake:com.google.firebase.iid.WakeLockHolder");
        Method method = accessgetTvInputHdmi2cp.read;
        synchronized (accessgetTvInputHdmi2cp.class) {
            Boolean bool = accessgetTvInputHdmi2cp.serializer;
            if (bool != null) {
                zBooleanValue = bool.booleanValue();
            } else {
                zBooleanValue = FocusListener.write(context, "android.permission.UPDATE_DEVICE_STATS") == 0;
                accessgetTvInputHdmi2cp.serializer = Boolean.valueOf(zBooleanValue);
            }
        }
        if (zBooleanValue) {
            int i = accessgetTvInputHdmi3cp.IconCompatParcelizer;
            packageName = (packageName == null || packageName.trim().isEmpty()) ? context.getPackageName() : packageName;
            if (context.getPackageManager() == null || packageName == null) {
                workSource = null;
            } else {
                try {
                    ApplicationInfo applicationInfoWrite = accessgetTvMediaContextMenucp.serializer(context).write(0, packageName);
                    if (applicationInfoWrite == null) {
                        SentryLogcatAdapter.serializer("WorkSourceUtil", "Could not get applicationInfo from package: ".concat(packageName));
                        workSource = null;
                    } else {
                        int i2 = applicationInfoWrite.uid;
                        workSource = new WorkSource();
                        accessgetTvInputHdmi2cp.serializer(workSource, i2, packageName);
                    }
                } catch (PackageManager.NameNotFoundException unused) {
                    SentryLogcatAdapter.serializer("WorkSourceUtil", "Could not find package: ".concat(packageName));
                }
            }
            if (workSource != null) {
                try {
                    this.serializer.setWorkSource(workSource);
                } catch (ArrayIndexOutOfBoundsException | IllegalArgumentException e) {
                    String string = e.toString();
                    SentryLogcatAdapter.read("WakeLock", r8lambdaL32xCEzW71g2Xzeh1NM3NImxco.ERROR, string, null);
                    SentryLogcatAdapter.serializer(logClicklambda0.FATAL, string, null);
                    Log.wtf("WakeLock", string);
                }
            }
        }
        ScheduledExecutorService scheduledExecutorServiceUnconfigurableScheduledExecutorService = IconCompatParcelizer;
        if (scheduledExecutorServiceUnconfigurableScheduledExecutorService == null) {
            synchronized (read) {
                scheduledExecutorServiceUnconfigurableScheduledExecutorService = IconCompatParcelizer;
                if (scheduledExecutorServiceUnconfigurableScheduledExecutorService == null) {
                    scheduledExecutorServiceUnconfigurableScheduledExecutorService = Executors.unconfigurableScheduledExecutorService(Executors.newScheduledThreadPool(1));
                    IconCompatParcelizer = scheduledExecutorServiceUnconfigurableScheduledExecutorService;
                }
            }
        }
        this.MediaSessionCompatResultReceiverWrapper = scheduledExecutorServiceUnconfigurableScheduledExecutorService;
    }

    public final void IconCompatParcelizer() {
        this.ParcelableVolumeInfo.incrementAndGet();
        long jMin = Math.min(60000L, Math.max(Math.min(Long.MAX_VALUE, 31622400000L), 1L));
        synchronized (this.write) {
            if (!write()) {
                this.RemoteActionCompatParcelizer = recordFsph7yY.read;
                this.serializer.acquire();
                this.PlaybackStateCompat.getClass();
                SystemClock.elapsedRealtime();
            }
            this.MediaBrowserCompatMediaItem++;
            if (this.MediaDescriptionCompat) {
                TextUtils.isEmpty(null);
            }
            OnRemeasuredModifierDefaultImpls onRemeasuredModifierDefaultImpls = (OnRemeasuredModifierDefaultImpls) this.PlaybackStateCompatCustomAction.get(null);
            if (onRemeasuredModifierDefaultImpls == null) {
                onRemeasuredModifierDefaultImpls = new OnRemeasuredModifierDefaultImpls();
                this.PlaybackStateCompatCustomAction.put(null, onRemeasuredModifierDefaultImpls);
            }
            onRemeasuredModifierDefaultImpls.write++;
            this.PlaybackStateCompat.getClass();
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            long j = Long.MAX_VALUE - jElapsedRealtime > jMin ? jElapsedRealtime + jMin : Long.MAX_VALUE;
            if (j > this.MediaSessionCompatQueueItem) {
                this.MediaSessionCompatQueueItem = j;
                ScheduledFuture scheduledFuture = this.MediaMetadataCompat;
                int i = 0;
                if (scheduledFuture != null) {
                    scheduledFuture.cancel(false);
                }
                this.MediaMetadataCompat = this.MediaSessionCompatResultReceiverWrapper.schedule(new zza(i, this), jMin, TimeUnit.MILLISECONDS);
            }
        }
    }

    public final void RemoteActionCompatParcelizer() {
        synchronized (this.write) {
            if (write()) {
                if (this.MediaDescriptionCompat) {
                    int i = this.MediaBrowserCompatMediaItem - 1;
                    this.MediaBrowserCompatMediaItem = i;
                    if (i > 0) {
                        return;
                    }
                } else {
                    this.MediaBrowserCompatMediaItem = 0;
                }
                serializer();
                Iterator it = this.PlaybackStateCompatCustomAction.values().iterator();
                while (it.hasNext()) {
                    ((OnRemeasuredModifierDefaultImpls) it.next()).write = 0;
                }
                this.PlaybackStateCompatCustomAction.clear();
                ScheduledFuture scheduledFuture = this.MediaMetadataCompat;
                if (scheduledFuture != null) {
                    scheduledFuture.cancel(false);
                    this.MediaMetadataCompat = null;
                    this.MediaSessionCompatQueueItem = 0L;
                }
                try {
                    if (this.serializer.isHeld()) {
                        try {
                            this.serializer.release();
                            if (this.RemoteActionCompatParcelizer != null) {
                                this.RemoteActionCompatParcelizer = null;
                            }
                        } catch (RuntimeException e) {
                            if (!e.getClass().equals(RuntimeException.class)) {
                                throw e;
                            }
                            SentryLogcatAdapter.read("WakeLock", String.valueOf(this.MediaSessionCompatToken).concat(" failed to release!"), e);
                            if (this.RemoteActionCompatParcelizer != null) {
                                this.RemoteActionCompatParcelizer = null;
                            }
                        }
                    } else {
                        SentryLogcatAdapter.serializer("WakeLock", String.valueOf(this.MediaSessionCompatToken).concat(" should be held!"));
                    }
                } catch (Throwable th) {
                    if (this.RemoteActionCompatParcelizer != null) {
                        this.RemoteActionCompatParcelizer = null;
                    }
                    throw th;
                }
            }
        }
    }

    public final void read() {
        if (this.ParcelableVolumeInfo.decrementAndGet() < 0) {
            SentryLogcatAdapter.serializer("WakeLock", String.valueOf(this.MediaSessionCompatToken).concat(" release without a matched acquire!"));
        }
        synchronized (this.write) {
            if (this.MediaDescriptionCompat) {
                TextUtils.isEmpty(null);
            }
            if (this.PlaybackStateCompatCustomAction.containsKey(null)) {
                OnRemeasuredModifierDefaultImpls onRemeasuredModifierDefaultImpls = (OnRemeasuredModifierDefaultImpls) this.PlaybackStateCompatCustomAction.get(null);
                if (onRemeasuredModifierDefaultImpls != null) {
                    int i = onRemeasuredModifierDefaultImpls.write - 1;
                    onRemeasuredModifierDefaultImpls.write = i;
                    if (i == 0) {
                        this.PlaybackStateCompatCustomAction.remove(null);
                    }
                }
            } else {
                SentryLogcatAdapter.IconCompatParcelizer("WakeLock", String.valueOf(this.MediaSessionCompatToken).concat(" counter does not exist"));
            }
            RemoteActionCompatParcelizer();
        }
    }

    public final void serializer() {
        HashSet hashSet = this.RatingCompat;
        if (hashSet.isEmpty()) {
            return;
        }
        ArrayList arrayList = new ArrayList(hashSet);
        hashSet.clear();
        if (arrayList.size() <= 0) {
            return;
        }
        arrayList.get(0).getClass();
        int iSerializer = isAppSetIdReadingEnabled.serializer();
        r8lambdayUqGVEpC1kg8ua3jc9a113shNIE.IconCompatParcelizer(isAppSetIdReadingEnabled.serializer(), isAppSetIdReadingEnabled.serializer(), new Object[0], -1923372309, isAppSetIdReadingEnabled.serializer(), 1923372311, iSerializer);
    }

    public final boolean write() {
        boolean z;
        synchronized (this.write) {
            z = this.MediaBrowserCompatMediaItem > 0;
        }
        return z;
    }
}
