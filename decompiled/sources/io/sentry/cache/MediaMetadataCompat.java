package io.sentry.cache;

import com.adjust.sdk.Constants;
import io.sentry.Scopes$$ExternalSyntheticLambda0;
import io.sentry.Sentry$$ExternalSyntheticLambda5;
import io.sentry.SentryOptions;
import io.sentry.SentryTracer$$ExternalSyntheticLambda1;
import io.sentry.android.core.AppState$$ExternalSyntheticLambda0;
import io.sentry.protocol.addObserverForBackInvoker;
import io.sentry.protocol.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.concurrent.ConcurrentHashMap;
import o.BannerView;
import o.accessdismiss;
import o.accessgetAlpha8cp;
import o.getIntentArrayWithConfiguredBackStacklambda1;
import o.r8lambdaL32xCEzW71g2Xzeh1NM3NImxco;
import o.r8lambdaSv8Cpfy2RycESlM1aYxpdAvYzP0;

/* JADX INFO: loaded from: classes4.dex */
public final class MediaMetadataCompat extends accessdismiss {
    public static final Charset write = Charset.forName(Constants.ENCODING);
    public final SentryOptions IconCompatParcelizer;
    public final io.sentry.util.MediaMetadataCompat serializer = new io.sentry.util.MediaMetadataCompat(new SentryTracer$$ExternalSyntheticLambda1(12, this));

    public final void IconCompatParcelizer(Runnable runnable) {
        SentryOptions sentryOptions = this.IconCompatParcelizer;
        if (sentryOptions.isEnableScopePersistence()) {
            if (Thread.currentThread().getName().contains("SentryExecutor")) {
                try {
                    runnable.run();
                    return;
                } catch (Throwable th) {
                    sentryOptions.getLogger().serializer(r8lambdaL32xCEzW71g2Xzeh1NM3NImxco.ERROR, "Serialization task failed", th);
                    return;
                }
            }
            try {
                sentryOptions.getExecutorService().RemoteActionCompatParcelizer(new AppState$$ExternalSyntheticLambda0(this, 7, runnable));
            } catch (Throwable th2) {
                sentryOptions.getLogger().serializer(r8lambdaL32xCEzW71g2Xzeh1NM3NImxco.ERROR, "Serialization task could not be scheduled", th2);
            }
        }
    }

    public final Object RemoteActionCompatParcelizer(SentryOptions sentryOptions, String str, Class cls) {
        if (!str.equals("breadcrumbs.json")) {
            return IconCompatParcelizer.IconCompatParcelizer(sentryOptions, ".scope-cache", str, cls);
        }
        try {
            io.sentry.cache.tape.read readVar = (io.sentry.cache.tape.read) this.serializer.IconCompatParcelizer();
            int iMin = Math.min(readVar.read(), readVar.read());
            ArrayList arrayList = new ArrayList(iMin);
            Iterator it = readVar.iterator();
            for (int i = 0; i < iMin; i++) {
                arrayList.add(it.next());
            }
            return cls.cast(Collections.unmodifiableList(arrayList));
        } catch (IOException unused) {
            sentryOptions.getLogger().IconCompatParcelizer(r8lambdaL32xCEzW71g2Xzeh1NM3NImxco.ERROR, "Unable to read serialized breadcrumbs from QueueFile", new Object[0]);
            return null;
        }
    }

    @Override // o.accessdismiss, o.r8lambdatOXQQytFfRJJ1udVx34HO5buEo
    public final void RemoteActionCompatParcelizer(String str) {
        IconCompatParcelizer(new AppState$$ExternalSyntheticLambda0(this, 6, str));
    }

    @Override // o.r8lambdatOXQQytFfRJJ1udVx34HO5buEo
    public final void RemoteActionCompatParcelizer(getIntentArrayWithConfiguredBackStacklambda1 getintentarraywithconfiguredbackstacklambda1) {
        IconCompatParcelizer(new AppState$$ExternalSyntheticLambda0(this, 4, getintentarraywithconfiguredbackstacklambda1));
    }

    @Override // o.accessdismiss, o.r8lambdatOXQQytFfRJJ1udVx34HO5buEo
    public final void read(ConcurrentHashMap concurrentHashMap) {
        IconCompatParcelizer(new AppState$$ExternalSyntheticLambda0(this, 3, concurrentHashMap));
    }

    @Override // o.accessdismiss, o.r8lambdatOXQQytFfRJJ1udVx34HO5buEo
    public final void serializer(io.sentry.protocol.IconCompatParcelizer iconCompatParcelizer) {
        IconCompatParcelizer(new AppState$$ExternalSyntheticLambda0(this, 5, iconCompatParcelizer));
    }

    @Override // o.r8lambdatOXQQytFfRJJ1udVx34HO5buEo
    public final void serializer(addObserverForBackInvoker addobserverforbackinvoker) {
        IconCompatParcelizer(new AppState$$ExternalSyntheticLambda0(this, 2, addobserverforbackinvoker));
    }

    public final void IconCompatParcelizer(String str) {
        IconCompatParcelizer.RemoteActionCompatParcelizer(this.IconCompatParcelizer, ".scope-cache", str);
    }

    @Override // o.accessdismiss, o.r8lambdatOXQQytFfRJJ1udVx34HO5buEo
    public final void read(r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg r8lambdaquuwrpysdd6n6dd7wraaa0s4oxg) {
        IconCompatParcelizer(new Scopes$$ExternalSyntheticLambda0(this, 28, r8lambdaquuwrpysdd6n6dd7wraaa0s4oxg));
    }

    @Override // o.r8lambdatOXQQytFfRJJ1udVx34HO5buEo
    public final void read(r8lambdaSv8Cpfy2RycESlM1aYxpdAvYzP0 r8lambdasv8cpfy2ryceslm1ayxpdavyzp0, BannerView bannerView) {
        IconCompatParcelizer(new accessgetAlpha8cp(this, r8lambdasv8cpfy2ryceslm1ayxpdavyzp0, bannerView, 11));
    }

    public final void write(Object obj, String str) {
        IconCompatParcelizer.write(this.IconCompatParcelizer, obj, ".scope-cache", str);
    }

    public MediaMetadataCompat(SentryOptions sentryOptions) {
        this.IconCompatParcelizer = sentryOptions;
    }

    @Override // o.accessdismiss, o.r8lambdatOXQQytFfRJJ1udVx34HO5buEo
    public final void IconCompatParcelizer(Collection collection) {
        if (collection.isEmpty()) {
            IconCompatParcelizer(new Sentry$$ExternalSyntheticLambda5(18, this));
        }
    }
}
