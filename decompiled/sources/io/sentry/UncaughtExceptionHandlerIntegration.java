package io.sentry;

import io.sentry.exception.ExceptionMechanismException;
import io.sentry.protocol.ParcelableVolumeInfo;
import io.sentry.protocol.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg;
import io.sentry.util.RemoteActionCompatParcelizer;
import java.io.Closeable;
import java.util.HashSet;
import kotlinx.coroutines.DelayKt;
import o.BannerViewExternalSyntheticLambda2;
import o.BrazeActionParserExternalSyntheticLambda0;
import o.LogCustomEventStep;
import o.UriActionExternalSyntheticLambda4;
import o.accessgetDismissSubscriberp;
import o.executelambda4;
import o.getAllUris;
import o.getUriActionForCard;
import o.internalHeightCallbacklambda0;
import o.pauseWebviewIfNecessarylambda10;
import o.r8lambdaL32xCEzW71g2Xzeh1NM3NImxco;

/* JADX INFO: loaded from: classes4.dex */
public final class UncaughtExceptionHandlerIntegration implements LogCustomEventStep, Thread.UncaughtExceptionHandler, Closeable {
    public static final RemoteActionCompatParcelizer read = new RemoteActionCompatParcelizer();
    public Thread.UncaughtExceptionHandler IconCompatParcelizer;
    public accessgetDismissSubscriberp RemoteActionCompatParcelizer;
    public SentryOptions serializer;
    public boolean write;

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        UriActionExternalSyntheticLambda4 uriActionExternalSyntheticLambda4Serializer = read.serializer();
        try {
            if (this == Thread.getDefaultUncaughtExceptionHandler()) {
                Thread.setDefaultUncaughtExceptionHandler(this.IconCompatParcelizer);
                SentryOptions sentryOptions = this.serializer;
                if (sentryOptions != null) {
                    sentryOptions.getLogger().IconCompatParcelizer(r8lambdaL32xCEzW71g2Xzeh1NM3NImxco.DEBUG, "UncaughtExceptionHandlerIntegration removed.", new Object[0]);
                }
            } else {
                write(Thread.getDefaultUncaughtExceptionHandler(), new HashSet());
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

    public final void write(Thread.UncaughtExceptionHandler uncaughtExceptionHandler, HashSet hashSet) {
        if (uncaughtExceptionHandler == null) {
            SentryOptions sentryOptions = this.serializer;
            if (sentryOptions != null) {
                sentryOptions.getLogger().IconCompatParcelizer(r8lambdaL32xCEzW71g2Xzeh1NM3NImxco.DEBUG, "Found no UncaughtExceptionHandler to remove.", new Object[0]);
                return;
            }
            return;
        }
        if (!hashSet.add(uncaughtExceptionHandler)) {
            SentryOptions sentryOptions2 = this.serializer;
            if (sentryOptions2 != null) {
                sentryOptions2.getLogger().IconCompatParcelizer(r8lambdaL32xCEzW71g2Xzeh1NM3NImxco.WARNING, "Cycle detected in UncaughtExceptionHandler chain while removing handler.", new Object[0]);
                return;
            }
            return;
        }
        if (uncaughtExceptionHandler instanceof UncaughtExceptionHandlerIntegration) {
            UncaughtExceptionHandlerIntegration uncaughtExceptionHandlerIntegration = (UncaughtExceptionHandlerIntegration) uncaughtExceptionHandler;
            Thread.UncaughtExceptionHandler uncaughtExceptionHandler2 = uncaughtExceptionHandlerIntegration.IconCompatParcelizer;
            if (this == uncaughtExceptionHandler2) {
                uncaughtExceptionHandlerIntegration.IconCompatParcelizer = this.IconCompatParcelizer;
                SentryOptions sentryOptions3 = this.serializer;
                if (sentryOptions3 != null) {
                    sentryOptions3.getLogger().IconCompatParcelizer(r8lambdaL32xCEzW71g2Xzeh1NM3NImxco.DEBUG, "UncaughtExceptionHandlerIntegration removed.", new Object[0]);
                    return;
                }
                return;
            }
            write(uncaughtExceptionHandler2, hashSet);
        }
    }

    @Override // o.LogCustomEventStep
    public final void RemoteActionCompatParcelizer(SentryOptions sentryOptions) {
        UncaughtExceptionHandlerIntegration uncaughtExceptionHandlerIntegration;
        accessgetDismissSubscriberp accessgetdismisssubscriberp;
        accessgetDismissSubscriberp accessgetdismisssubscriberp2 = accessgetDismissSubscriberp.IconCompatParcelizer;
        if (this.write) {
            sentryOptions.getLogger().IconCompatParcelizer(r8lambdaL32xCEzW71g2Xzeh1NM3NImxco.ERROR, "Attempt to register a UncaughtExceptionHandlerIntegration twice.", new Object[0]);
            return;
        }
        this.write = true;
        this.RemoteActionCompatParcelizer = accessgetdismisssubscriberp2;
        this.serializer = sentryOptions;
        BrazeActionParserExternalSyntheticLambda0 logger = sentryOptions.getLogger();
        r8lambdaL32xCEzW71g2Xzeh1NM3NImxco r8lambdal32xcezw71g2xzeh1nm3nimxco = r8lambdaL32xCEzW71g2Xzeh1NM3NImxco.DEBUG;
        logger.IconCompatParcelizer(r8lambdal32xcezw71g2xzeh1nm3nimxco, "UncaughtExceptionHandlerIntegration enabled: %s", Boolean.valueOf(this.serializer.isEnableUncaughtExceptionHandler()));
        if (this.serializer.isEnableUncaughtExceptionHandler()) {
            UriActionExternalSyntheticLambda4 uriActionExternalSyntheticLambda4Serializer = read.serializer();
            try {
                Thread.UncaughtExceptionHandler defaultUncaughtExceptionHandler = Thread.getDefaultUncaughtExceptionHandler();
                if (defaultUncaughtExceptionHandler != null) {
                    this.serializer.getLogger().IconCompatParcelizer(r8lambdal32xcezw71g2xzeh1nm3nimxco, "default UncaughtExceptionHandler class='" + defaultUncaughtExceptionHandler.getClass().getName() + "'", new Object[0]);
                    if (!(defaultUncaughtExceptionHandler instanceof UncaughtExceptionHandlerIntegration) || (accessgetdismisssubscriberp = (uncaughtExceptionHandlerIntegration = (UncaughtExceptionHandlerIntegration) defaultUncaughtExceptionHandler).RemoteActionCompatParcelizer) == null) {
                        this.IconCompatParcelizer = defaultUncaughtExceptionHandler;
                    } else {
                        getAllUris getalluris = internalHeightCallbacklambda0.MediaSessionCompatQueueItem;
                        accessgetdismisssubscriberp.getClass();
                        this.IconCompatParcelizer = uncaughtExceptionHandlerIntegration.IconCompatParcelizer;
                    }
                }
                Thread.setDefaultUncaughtExceptionHandler(this);
                uriActionExternalSyntheticLambda4Serializer.close();
                this.serializer.getLogger().IconCompatParcelizer(r8lambdal32xcezw71g2xzeh1nm3nimxco, "UncaughtExceptionHandlerIntegration installed.", new Object[0]);
                DelayKt.MediaSessionCompatToken("UncaughtExceptionHandler");
            } catch (Throwable th) {
                try {
                    uriActionExternalSyntheticLambda4Serializer.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        }
    }

    @Override // java.lang.Thread.UncaughtExceptionHandler
    public final void uncaughtException(Thread thread, Throwable th) {
        r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg r8lambdaquuwrpysdd6n6dd7wraaa0s4oxg;
        SentryOptions sentryOptions = this.serializer;
        if (sentryOptions == null || this.RemoteActionCompatParcelizer == null) {
            return;
        }
        sentryOptions.getLogger().IconCompatParcelizer(r8lambdaL32xCEzW71g2Xzeh1NM3NImxco.INFO, "Uncaught exception received.", new Object[0]);
        try {
            getUriActionForCard geturiactionforcard = new getUriActionForCard(this.serializer.getFlushTimeoutMillis(), this.serializer.getLogger());
            ParcelableVolumeInfo parcelableVolumeInfo = new ParcelableVolumeInfo();
            parcelableVolumeInfo.serializer = Boolean.FALSE;
            parcelableVolumeInfo.MediaDescriptionCompat = "UncaughtExceptionHandler";
            BannerViewExternalSyntheticLambda2 bannerViewExternalSyntheticLambda2 = new BannerViewExternalSyntheticLambda2(new ExceptionMechanismException(parcelableVolumeInfo, th, thread, false));
            bannerViewExternalSyntheticLambda2.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY = r8lambdaL32xCEzW71g2Xzeh1NM3NImxco.FATAL;
            if (this.RemoteActionCompatParcelizer.MediaMetadataCompat() == null && (r8lambdaquuwrpysdd6n6dd7wraaa0s4oxg = bannerViewExternalSyntheticLambda2.MediaMetadataCompat) != null) {
                geturiactionforcard.IconCompatParcelizer(r8lambdaquuwrpysdd6n6dd7wraaa0s4oxg);
            }
            executelambda4 executelambda4VarIconCompatParcelizer = pauseWebviewIfNecessarylambda10.IconCompatParcelizer(geturiactionforcard);
            boolean zEquals = this.RemoteActionCompatParcelizer.RemoteActionCompatParcelizer(bannerViewExternalSyntheticLambda2, executelambda4VarIconCompatParcelizer).equals(r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg.serializer);
            io.sentry.hints.RemoteActionCompatParcelizer remoteActionCompatParcelizer = (io.sentry.hints.RemoteActionCompatParcelizer) executelambda4VarIconCompatParcelizer.read(io.sentry.hints.RemoteActionCompatParcelizer.class, "sentry:eventDropReason");
            if ((!zEquals || io.sentry.hints.RemoteActionCompatParcelizer.MULTITHREADED_DEDUPLICATION.equals(remoteActionCompatParcelizer)) && !geturiactionforcard.C_()) {
                this.serializer.getLogger().IconCompatParcelizer(r8lambdaL32xCEzW71g2Xzeh1NM3NImxco.WARNING, "Timed out waiting to flush event to disk before crashing. Event: %s", bannerViewExternalSyntheticLambda2.MediaMetadataCompat);
            }
        } catch (Throwable th2) {
            this.serializer.getLogger().serializer(r8lambdaL32xCEzW71g2Xzeh1NM3NImxco.ERROR, "Error sending uncaught exception to Sentry.", th2);
        }
        Thread.UncaughtExceptionHandler uncaughtExceptionHandler = this.IconCompatParcelizer;
        SentryOptions sentryOptions2 = this.serializer;
        if (uncaughtExceptionHandler != null) {
            sentryOptions2.getLogger().IconCompatParcelizer(r8lambdaL32xCEzW71g2Xzeh1NM3NImxco.INFO, "Invoking inner uncaught exception handler.", new Object[0]);
            this.IconCompatParcelizer.uncaughtException(thread, th);
        } else if (sentryOptions2.isPrintUncaughtStackTrace()) {
            th.printStackTrace();
        }
    }
}
