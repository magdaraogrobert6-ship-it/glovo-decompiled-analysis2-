package io.sentry.android.core.cache;

import android.os.SystemClock;
import bo.app.ff$$ExternalSyntheticOutline0;
import io.sentry.SentryClient$$ExternalSyntheticLambda1;
import io.sentry.SentryOptions;
import io.sentry.android.core.ActivityLifecycleIntegration$$ExternalSyntheticLambda1;
import io.sentry.android.core.SentryAndroidOptions;
import io.sentry.android.core.addContentView;
import io.sentry.android.core.internal.util.serializer;
import io.sentry.android.core.performance.AppStartMetrics;
import io.sentry.android.core.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY;
import io.sentry.cache.RemoteActionCompatParcelizer;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.Arrays;
import java.util.List;
import kotlin.TuplesKt;
import o.BrazeActionParserExternalSyntheticLambda0;
import o.executelambda4;
import o.getUriActionForCard;
import o.r8lambdaL32xCEzW71g2Xzeh1NM3NImxco;
import o.setNativeShader;
import retrofit2.OkHttpCall$1;

/* JADX INFO: loaded from: classes4.dex */
public final class AndroidEnvelopeCache extends RemoteActionCompatParcelizer {
    public static final List write = Arrays.asList(new read(r8lambda7IJBVrN0sHyidCAZufWEJFc7yY.class, "ANR", "last_anr_report", new ActivityLifecycleIntegration$$ExternalSyntheticLambda1(22)), new read(addContentView.class, "Tombstone", "last_tombstone_report", new ActivityLifecycleIntegration$$ExternalSyntheticLambda1(23)));
    public final serializer serializer;

    @Override // io.sentry.cache.RemoteActionCompatParcelizer, io.sentry.cache.serializer
    public final boolean write(OkHttpCall$1 okHttpCall$1, executelambda4 executelambda4Var) {
        boolean zWrite = super.write(okHttpCall$1, executelambda4Var);
        SentryOptions sentryOptions = this.MediaMetadataCompat;
        SentryAndroidOptions sentryAndroidOptions = (SentryAndroidOptions) sentryOptions;
        io.sentry.android.core.performance.RemoteActionCompatParcelizer remoteActionCompatParcelizer = AppStartMetrics.read().PlaybackStateCompatCustomAction;
        if (getUriActionForCard.class.isInstance(executelambda4Var.read("sentry:typeCheckHint")) && remoteActionCompatParcelizer.serializer()) {
            this.serializer.getClass();
            long jUptimeMillis = SystemClock.uptimeMillis() - remoteActionCompatParcelizer.read;
            if (jUptimeMillis <= sentryAndroidOptions.getStartupCrashDurationThresholdMillis()) {
                BrazeActionParserExternalSyntheticLambda0 logger = sentryAndroidOptions.getLogger();
                r8lambdaL32xCEzW71g2Xzeh1NM3NImxco r8lambdal32xcezw71g2xzeh1nm3nimxco = r8lambdaL32xCEzW71g2Xzeh1NM3NImxco.DEBUG;
                logger.IconCompatParcelizer(r8lambdal32xcezw71g2xzeh1nm3nimxco, "Startup Crash detected %d milliseconds after SDK init. Writing a startup crash marker file to disk.", Long.valueOf(jUptimeMillis));
                String outboxPath = sentryOptions.getOutboxPath();
                if (outboxPath == null) {
                    sentryOptions.getLogger().IconCompatParcelizer(r8lambdal32xcezw71g2xzeh1nm3nimxco, "Outbox path is null, the startup crash marker file will not be written", new Object[0]);
                } else {
                    try {
                        new File(outboxPath, "startup_crash").createNewFile();
                    } catch (Throwable th) {
                        sentryOptions.getLogger().serializer(r8lambdaL32xCEzW71g2Xzeh1NM3NImxco.ERROR, "Error writing the startup crash marker file to the disk", th);
                    }
                }
            }
        }
        for (read readVar : write) {
            Class cls = readVar.write;
            SentryClient$$ExternalSyntheticLambda1 sentryClient$$ExternalSyntheticLambda1 = new SentryClient$$ExternalSyntheticLambda1(readVar, sentryAndroidOptions, this, 7);
            Object obj = executelambda4Var.read("sentry:typeCheckHint");
            if (cls.isInstance(executelambda4Var.read("sentry:typeCheckHint")) && obj != null) {
                read readVar2 = (read) sentryClient$$ExternalSyntheticLambda1.read;
                SentryAndroidOptions sentryAndroidOptions2 = (SentryAndroidOptions) sentryClient$$ExternalSyntheticLambda1.serializer;
                AndroidEnvelopeCache androidEnvelopeCache = (AndroidEnvelopeCache) sentryClient$$ExternalSyntheticLambda1.write;
                Long lValueOf = readVar2.serializer.RemoteActionCompatParcelizer != 22 ? Long.valueOf(((addContentView) obj).read) : Long.valueOf(((r8lambda7IJBVrN0sHyidCAZufWEJFc7yY) obj).read);
                BrazeActionParserExternalSyntheticLambda0 logger2 = sentryAndroidOptions2.getLogger();
                r8lambdaL32xCEzW71g2Xzeh1NM3NImxco r8lambdal32xcezw71g2xzeh1nm3nimxco2 = r8lambdaL32xCEzW71g2Xzeh1NM3NImxco.DEBUG;
                String str = readVar2.IconCompatParcelizer;
                logger2.IconCompatParcelizer(r8lambdal32xcezw71g2xzeh1nm3nimxco2, "Writing last reported %s marker with timestamp %d", str, lValueOf);
                String str2 = readVar2.read;
                SentryOptions sentryOptions2 = androidEnvelopeCache.MediaMetadataCompat;
                String cacheDirPath = sentryOptions2.getCacheDirPath();
                if (cacheDirPath == null) {
                    sentryOptions2.getLogger().IconCompatParcelizer(r8lambdal32xcezw71g2xzeh1nm3nimxco2, ff$$ExternalSyntheticOutline0.m("Cache dir path is null, the ", str, " marker will not be written"), new Object[0]);
                } else {
                    try {
                        FileOutputStream fileOutputStream = new FileOutputStream(new File(cacheDirPath, str2));
                        try {
                            fileOutputStream.write(String.valueOf(lValueOf).getBytes(RemoteActionCompatParcelizer.RemoteActionCompatParcelizer));
                            fileOutputStream.flush();
                            fileOutputStream.close();
                        } catch (Throwable th2) {
                            try {
                                fileOutputStream.close();
                            } catch (Throwable th3) {
                                th2.addSuppressed(th3);
                            }
                            throw th2;
                        }
                    } catch (Throwable th4) {
                        sentryOptions2.getLogger().serializer(r8lambdaL32xCEzW71g2Xzeh1NM3NImxco.ERROR, ff$$ExternalSyntheticOutline0.m("Error writing the ", str, " marker to the disk"), th4);
                    }
                }
            }
        }
        return zWrite;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public AndroidEnvelopeCache(SentryAndroidOptions sentryAndroidOptions) {
        String cacheDirPath = sentryAndroidOptions.getCacheDirPath();
        setNativeShader.read(cacheDirPath, "cacheDirPath must not be null");
        super(sentryAndroidOptions, cacheDirPath, sentryAndroidOptions.getMaxCacheItems());
        this.serializer = serializer.IconCompatParcelizer;
    }

    public static Long serializer(SentryOptions sentryOptions, String str, String str2) {
        String cacheDirPath = sentryOptions.getCacheDirPath();
        setNativeShader.read(cacheDirPath, "Cache dir path should be set for getting " + str2 + "s reported");
        File file = new File(cacheDirPath, str);
        try {
            String strRemoteActionCompatParcelizer = TuplesKt.RemoteActionCompatParcelizer(file);
            if (strRemoteActionCompatParcelizer != null && !strRemoteActionCompatParcelizer.equals("null")) {
                return Long.valueOf(Long.parseLong(strRemoteActionCompatParcelizer.trim()));
            }
            return null;
        } catch (Throwable th) {
            if (th instanceof FileNotFoundException) {
                sentryOptions.getLogger().IconCompatParcelizer(r8lambdaL32xCEzW71g2Xzeh1NM3NImxco.DEBUG, ff$$ExternalSyntheticOutline0.m("Last ", str2, " marker does not exist. %s."), file.getAbsolutePath());
                return null;
            }
            sentryOptions.getLogger().serializer(r8lambdaL32xCEzW71g2Xzeh1NM3NImxco.ERROR, ff$$ExternalSyntheticOutline0.m("Error reading last ", str2, " marker"), th);
            return null;
        }
    }
}
