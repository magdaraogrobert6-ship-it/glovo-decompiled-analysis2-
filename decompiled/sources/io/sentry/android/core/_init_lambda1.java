package io.sentry.android.core;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.os.Build;
import android.os.Looper;
import bo.app.af$$ExternalSyntheticOutline0;
import io.sentry.SentryBaseEvent;
import io.sentry.SentryEnvelopeItem$$ExternalSyntheticLambda3;
import io.sentry.SentryTracer$$ExternalSyntheticLambda1;
import io.sentry.android.core.performance.AppStartMetrics;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.RejectedExecutionException;
import o.BannerViewExternalSyntheticLambda2;
import o.BrazeActionParserExternalSyntheticLambda0;
import o.accessgetThumbsDowncp;
import o.beforeMessageClosedlambda0;
import o.executelambda4;
import o.onCustomEventAction;
import o.pauseWebviewIfNecessarylambda10;
import o.performDismissTeardownlambda1;
import o.r8lambdaL32xCEzW71g2Xzeh1NM3NImxco;
import o.r8lambdaWGrR1CtqcsOMIGuyJGvK752EZY;
import o.r8lambdaZ6SXsca7yW0kIv7vX_TWlIsUrKE;
import o.r8lambdaxJfG46aOs8fDMxLv0xl_0gwVuI;
import o.setNativeShader;
import o.truncslo4al4;

/* JADX INFO: loaded from: classes4.dex */
public final class _init_lambda1 implements r8lambdaxJfG46aOs8fDMxLv0xl_0gwVuI {
    public final Future IconCompatParcelizer;
    public final r8lambdawJ5MHcSJed_CjC7r4OWD0UxyJsQ RemoteActionCompatParcelizer;
    public final io.sentry.util.MediaMetadataCompat read = new io.sentry.util.MediaMetadataCompat(new ActivityLifecycleIntegration$$ExternalSyntheticLambda1(20));
    public final SentryAndroidOptions serializer;
    public final Context write;

    public final void read(SentryBaseEvent sentryBaseEvent, executelambda4 executelambda4Var) {
        Boolean bool;
        io.sentry.protocol.read readVarIconCompatParcelizer = sentryBaseEvent.read.IconCompatParcelizer();
        if (readVarIconCompatParcelizer == null) {
            readVarIconCompatParcelizer = new io.sentry.protocol.read();
        }
        readVarIconCompatParcelizer.serializer = (String) _init_lambda3.write.IconCompatParcelizer(this.write);
        io.sentry.android.core.performance.RemoteActionCompatParcelizer remoteActionCompatParcelizerSerializer = AppStartMetrics.read().serializer(this.serializer);
        _init_lambda4 _init_lambda4Var = null;
        if (remoteActionCompatParcelizerSerializer.serializer()) {
            beforeMessageClosedlambda0 beforemessageclosedlambda0 = remoteActionCompatParcelizerSerializer.serializer() ? new beforeMessageClosedlambda0(remoteActionCompatParcelizerSerializer.IconCompatParcelizer * 1000000) : null;
            readVarIconCompatParcelizer.IconCompatParcelizer = beforemessageclosedlambda0 == null ? null : setNativeShader.IconCompatParcelizer(Double.valueOf(beforemessageclosedlambda0.read / 1000000.0d).longValue());
        }
        if (!pauseWebviewIfNecessarylambda10.IconCompatParcelizer(executelambda4Var) && readVarIconCompatParcelizer.MediaSessionCompatQueueItem == null && (bool = r8lambdaXj9c8VIP9DfEvaTmZt0ejAuC4a4.serializer.read) != null) {
            readVarIconCompatParcelizer.MediaSessionCompatQueueItem = Boolean.valueOf(!bool.booleanValue());
        }
        Context context = this.write;
        SentryAndroidOptions sentryAndroidOptions = this.serializer;
        BrazeActionParserExternalSyntheticLambda0 logger = sentryAndroidOptions.getLogger();
        r8lambdawJ5MHcSJed_CjC7r4OWD0UxyJsQ r8lambdawj5mhcsjed_cjc7r4owd0uxyjsq = this.RemoteActionCompatParcelizer;
        PackageInfo packageInfo = _init_lambda3.read(context, logger, r8lambdawj5mhcsjed_cjc7r4owd0uxyjsq);
        if (packageInfo != null) {
            r8lambdawj5mhcsjed_cjc7r4owd0uxyjsq.getClass();
            String string = Long.toString(packageInfo.getLongVersionCode());
            if (sentryBaseEvent.RemoteActionCompatParcelizer == null) {
                sentryBaseEvent.RemoteActionCompatParcelizer = string;
            }
            Future future = this.IconCompatParcelizer;
            if (future != null) {
                try {
                    _init_lambda4Var = (_init_lambda4) future.get();
                } catch (Throwable th) {
                    sentryAndroidOptions.getLogger().serializer(r8lambdaL32xCEzW71g2Xzeh1NM3NImxco.ERROR, "Failed to retrieve device info", th);
                }
            } else {
                sentryAndroidOptions.getLogger().IconCompatParcelizer(r8lambdaL32xCEzW71g2Xzeh1NM3NImxco.ERROR, "Failed to retrieve device info", new Object[0]);
            }
            readVarIconCompatParcelizer.RemoteActionCompatParcelizer = packageInfo.packageName;
            readVarIconCompatParcelizer.read = packageInfo.versionName;
            readVarIconCompatParcelizer.write = Long.toString(packageInfo.getLongVersionCode());
            HashMap map = new HashMap();
            String[] strArr = packageInfo.requestedPermissions;
            int[] iArr = packageInfo.requestedPermissionsFlags;
            if (strArr != null && strArr.length > 0 && iArr != null && iArr.length > 0) {
                for (int i = 0; i < strArr.length; i++) {
                    String str = strArr[i];
                    map.put(str.substring(str.lastIndexOf(46) + 1), (iArr[i] & 2) == 2 ? "granted" : "not_granted");
                }
            }
            readVarIconCompatParcelizer.MediaDescriptionCompat = map;
            if (_init_lambda4Var != null) {
                try {
                    truncslo4al4 truncslo4al4Var = _init_lambda4Var.MediaDescriptionCompat;
                    if (truncslo4al4Var != null) {
                        readVarIconCompatParcelizer.MediaBrowserCompatMediaItem = Boolean.valueOf(truncslo4al4Var.read);
                        String[] strArr2 = (String[]) truncslo4al4Var.IconCompatParcelizer;
                        if (strArr2 != null) {
                            readVarIconCompatParcelizer.PlaybackStateCompatCustomAction = Arrays.asList(strArr2);
                        }
                    }
                } catch (Throwable unused) {
                }
            }
        }
        sentryBaseEvent.read.write(readVarIconCompatParcelizer);
    }

    public final void IconCompatParcelizer(SentryBaseEvent sentryBaseEvent, boolean z, boolean z2) {
        io.sentry.protocol.addObserverForBackInvoker addobserverforbackinvoker = sentryBaseEvent.ParcelableVolumeInfo;
        if (addobserverforbackinvoker == null) {
            addobserverforbackinvoker = new io.sentry.protocol.addObserverForBackInvoker();
            sentryBaseEvent.ParcelableVolumeInfo = addobserverforbackinvoker;
        }
        String str = addobserverforbackinvoker.read;
        SentryAndroidOptions sentryAndroidOptions = this.serializer;
        if (str == null) {
            addobserverforbackinvoker.read = (String) sentryAndroidOptions.getRuntimeManager().RemoteActionCompatParcelizer(new SentryTracer$$ExternalSyntheticLambda1(7, this));
        }
        if (addobserverforbackinvoker.IconCompatParcelizer == null && sentryAndroidOptions.isSendDefaultPii()) {
            addobserverforbackinvoker.IconCompatParcelizer = "{{auto}}";
        }
        io.sentry.protocol.IconCompatParcelizer iconCompatParcelizer = sentryBaseEvent.read;
        io.sentry.protocol.MediaMetadataCompat mediaMetadataCompatWrite = iconCompatParcelizer.write();
        Future future = this.IconCompatParcelizer;
        if (mediaMetadataCompatWrite == null) {
            if (future != null) {
                try {
                    iconCompatParcelizer.RemoteActionCompatParcelizer(((_init_lambda4) future.get()).IconCompatParcelizer(z, z2));
                } catch (Throwable th) {
                    sentryAndroidOptions.getLogger().serializer(r8lambdaL32xCEzW71g2Xzeh1NM3NImxco.ERROR, "Failed to retrieve device info", th);
                }
            } else {
                sentryAndroidOptions.getLogger().IconCompatParcelizer(r8lambdaL32xCEzW71g2Xzeh1NM3NImxco.ERROR, "Failed to retrieve device info", new Object[0]);
            }
            io.sentry.protocol.ComponentActivity componentActivityMediaMetadataCompat = iconCompatParcelizer.MediaMetadataCompat();
            if (future != null) {
                try {
                    iconCompatParcelizer.write(((_init_lambda4) future.get()).MediaMetadataCompat);
                } catch (Throwable th2) {
                    sentryAndroidOptions.getLogger().serializer(r8lambdaL32xCEzW71g2Xzeh1NM3NImxco.ERROR, "Failed to retrieve os system", th2);
                }
            } else {
                sentryAndroidOptions.getLogger().IconCompatParcelizer(r8lambdaL32xCEzW71g2Xzeh1NM3NImxco.ERROR, "Failed to retrieve device info", new Object[0]);
            }
            if (componentActivityMediaMetadataCompat != null) {
                String str2 = componentActivityMediaMetadataCompat.write;
                iconCompatParcelizer.IconCompatParcelizer(componentActivityMediaMetadataCompat, (str2 == null || str2.isEmpty()) ? "os_1" : "os_" + str2.trim().toLowerCase(Locale.ROOT));
            }
        }
        if (future == null) {
            sentryAndroidOptions.getLogger().IconCompatParcelizer(r8lambdaL32xCEzW71g2Xzeh1NM3NImxco.ERROR, "Failed to retrieve device info", new Object[0]);
            return;
        }
        try {
            accessgetThumbsDowncp accessgetthumbsdowncp = ((_init_lambda4) future.get()).RatingCompat;
            if (accessgetthumbsdowncp != null) {
                HashMap map = new HashMap();
                map.put("isSideLoaded", String.valueOf(accessgetthumbsdowncp.write));
                String str3 = accessgetthumbsdowncp.RemoteActionCompatParcelizer;
                if (str3 != null) {
                    map.put("installerStore", str3);
                }
                for (Map.Entry entry : map.entrySet()) {
                    sentryBaseEvent.IconCompatParcelizer((String) entry.getKey(), (String) entry.getValue());
                }
            }
        } catch (Throwable th3) {
            sentryAndroidOptions.getLogger().serializer(r8lambdaL32xCEzW71g2Xzeh1NM3NImxco.ERROR, "Error getting side loaded info.", th3);
        }
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0047  */
    @Override // o.r8lambdaxJfG46aOs8fDMxLv0xl_0gwVuI
    public final BannerViewExternalSyntheticLambda2 read(BannerViewExternalSyntheticLambda2 bannerViewExternalSyntheticLambda2, executelambda4 executelambda4Var) {
        io.sentry.protocol.r8lambdayPQlaAoRiYRJ3IY_TqzUUTrVH0 r8lambdaypqlaaoriyrj3iy_tqzuutrvh0;
        List list;
        boolean z;
        boolean zSerializer = serializer(bannerViewExternalSyntheticLambda2, executelambda4Var);
        if (zSerializer) {
            read((SentryBaseEvent) bannerViewExternalSyntheticLambda2, executelambda4Var);
            if (bannerViewExternalSyntheticLambda2.serializer() != null) {
                boolean zIconCompatParcelizer = pauseWebviewIfNecessarylambda10.IconCompatParcelizer(executelambda4Var);
                for (io.sentry.protocol._init_lambda2 _init_lambda2Var : bannerViewExternalSyntheticLambda2.serializer()) {
                    io.sentry.android.core.internal.util.MediaMetadataCompat.read.getClass();
                    Long l = _init_lambda2Var.IconCompatParcelizer;
                    if (l == null) {
                        z = false;
                    } else if (io.sentry.android.core.internal.util.MediaMetadataCompat.serializer(Looper.getMainLooper().getThread()) == l.longValue()) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (_init_lambda2Var.read == null) {
                        _init_lambda2Var.read = Boolean.valueOf(z);
                    }
                    if (!zIconCompatParcelizer && _init_lambda2Var.MediaMetadataCompat == null) {
                        _init_lambda2Var.MediaMetadataCompat = Boolean.valueOf(z);
                    }
                }
            }
        }
        IconCompatParcelizer(bannerViewExternalSyntheticLambda2, true, zSerializer);
        ArrayList arrayListRemoteActionCompatParcelizer = bannerViewExternalSyntheticLambda2.RemoteActionCompatParcelizer();
        if (arrayListRemoteActionCompatParcelizer != null && arrayListRemoteActionCompatParcelizer.size() > 1) {
            io.sentry.protocol.r8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8 r8lambdaxcwb6u5x87zpwrzw4zmu6tskqc8 = (io.sentry.protocol.r8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8) af$$ExternalSyntheticOutline0.m(1, arrayListRemoteActionCompatParcelizer);
            if ("java.lang".equals(r8lambdaxcwb6u5x87zpwrzw4zmu6tskqc8.IconCompatParcelizer) && (r8lambdaypqlaaoriyrj3iy_tqzuutrvh0 = r8lambdaxcwb6u5x87zpwrzw4zmu6tskqc8.serializer) != null && (list = r8lambdaypqlaaoriyrj3iy_tqzuutrvh0.read) != null) {
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    if ("com.android.internal.os.RuntimeInit$MethodAndArgsCaller".equals(((io.sentry.protocol.r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28) it.next()).PlaybackStateCompat)) {
                        Collections.reverse(arrayListRemoteActionCompatParcelizer);
                        break;
                    }
                }
            }
        }
        return bannerViewExternalSyntheticLambda2;
    }

    public final boolean serializer(SentryBaseEvent sentryBaseEvent, executelambda4 executelambda4Var) {
        if (pauseWebviewIfNecessarylambda10.RemoteActionCompatParcelizer(executelambda4Var)) {
            return true;
        }
        this.serializer.getLogger().IconCompatParcelizer(r8lambdaL32xCEzW71g2Xzeh1NM3NImxco.DEBUG, "Event was cached so not applying data relevant to the current app execution/version: %s", sentryBaseEvent.MediaMetadataCompat);
        return false;
    }

    public _init_lambda1(Context context, r8lambdawJ5MHcSJed_CjC7r4OWD0UxyJsQ r8lambdawj5mhcsjed_cjc7r4owd0uxyjsq, SentryAndroidOptions sentryAndroidOptions) {
        Future futureSubmit;
        Context applicationContext = context.getApplicationContext();
        this.write = applicationContext != null ? applicationContext : context;
        this.RemoteActionCompatParcelizer = r8lambdawj5mhcsjed_cjc7r4owd0uxyjsq;
        setNativeShader.read(sentryAndroidOptions, "The options object is required.");
        this.serializer = sentryAndroidOptions;
        ExecutorService executorServiceNewSingleThreadExecutor = Executors.newSingleThreadExecutor();
        try {
            futureSubmit = executorServiceNewSingleThreadExecutor.submit(new SentryEnvelopeItem$$ExternalSyntheticLambda3(this, 9, sentryAndroidOptions));
        } catch (RejectedExecutionException e) {
            sentryAndroidOptions.getLogger().serializer(r8lambdaL32xCEzW71g2Xzeh1NM3NImxco.WARNING, "Device info caching task rejected.", e);
            futureSubmit = null;
        }
        this.IconCompatParcelizer = futureSubmit;
        executorServiceNewSingleThreadExecutor.shutdown();
    }

    @Override // o.r8lambdaxJfG46aOs8fDMxLv0xl_0gwVuI
    public final r8lambdaWGrR1CtqcsOMIGuyJGvK752EZY RemoteActionCompatParcelizer(r8lambdaWGrR1CtqcsOMIGuyJGvK752EZY r8lambdawgrr1ctqcsomiguyjgvk752ezy) {
        SentryAndroidOptions sentryAndroidOptions = this.serializer;
        try {
            performDismissTeardownlambda1 performdismissteardownlambda1 = performDismissTeardownlambda1.STRING;
            r8lambdawgrr1ctqcsomiguyjgvk752ezy.write("device.brand", new r8lambdaZ6SXsca7yW0kIv7vX_TWlIsUrKE(performdismissteardownlambda1, Build.BRAND));
            r8lambdawgrr1ctqcsomiguyjgvk752ezy.write("device.model", new r8lambdaZ6SXsca7yW0kIv7vX_TWlIsUrKE(performdismissteardownlambda1, Build.MODEL));
            r8lambdawgrr1ctqcsomiguyjgvk752ezy.write("device.family", new r8lambdaZ6SXsca7yW0kIv7vX_TWlIsUrKE(performdismissteardownlambda1, this.read.IconCompatParcelizer()));
        } catch (Throwable th) {
            sentryAndroidOptions.getLogger().serializer(r8lambdaL32xCEzW71g2Xzeh1NM3NImxco.ERROR, "Failed to retrieve device info", th);
        }
        try {
            performDismissTeardownlambda1 performdismissteardownlambda2 = performDismissTeardownlambda1.STRING;
            r8lambdawgrr1ctqcsomiguyjgvk752ezy.write("os.name", new r8lambdaZ6SXsca7yW0kIv7vX_TWlIsUrKE(performdismissteardownlambda2, "Android"));
            r8lambdawgrr1ctqcsomiguyjgvk752ezy.write("os.version", new r8lambdaZ6SXsca7yW0kIv7vX_TWlIsUrKE(performdismissteardownlambda2, Build.VERSION.RELEASE));
        } catch (Throwable th2) {
            sentryAndroidOptions.getLogger().serializer(r8lambdaL32xCEzW71g2Xzeh1NM3NImxco.ERROR, "Failed to retrieve os system", th2);
        }
        return r8lambdawgrr1ctqcsomiguyjgvk752ezy;
    }

    @Override // o.r8lambdaxJfG46aOs8fDMxLv0xl_0gwVuI
    public final io.sentry.protocol.accessensureViewModelStore RemoteActionCompatParcelizer(io.sentry.protocol.accessensureViewModelStore accessensureviewmodelstore, executelambda4 executelambda4Var) {
        boolean zSerializer = serializer(accessensureviewmodelstore, executelambda4Var);
        if (zSerializer) {
            read(accessensureviewmodelstore, executelambda4Var);
        }
        IconCompatParcelizer(accessensureviewmodelstore, false, zSerializer);
        return accessensureviewmodelstore;
    }

    @Override // o.r8lambdaxJfG46aOs8fDMxLv0xl_0gwVuI
    public final onCustomEventAction write(onCustomEventAction oncustomeventaction, executelambda4 executelambda4Var) {
        boolean zSerializer = serializer(oncustomeventaction, executelambda4Var);
        if (zSerializer) {
            read(oncustomeventaction, executelambda4Var);
        }
        IconCompatParcelizer(oncustomeventaction, false, zSerializer);
        return oncustomeventaction;
    }
}
