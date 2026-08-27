package io.sentry.android.timber;

import io.sentry.SentryOptions;
import java.io.Closeable;
import java.util.ArrayList;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.coroutines.DelayKt;
import o.BannerViewcreateBannerWebViewClientListener1;
import o.BrazeActionParserExternalSyntheticLambda0;
import o.LogCustomEventStep;
import o.ProtoPrerequisiteMsgserializer;
import o.logClicklambda0;
import o.r8lambdaL32xCEzW71g2Xzeh1NM3NImxco;
import o.removeNodeAtDepth;
import timber.log.Timber;

/* JADX INFO: loaded from: classes4.dex */
public final class SentryTimberIntegration implements LogCustomEventStep, Closeable {
    public final logClicklambda0 IconCompatParcelizer;
    public BrazeActionParserExternalSyntheticLambda0 RemoteActionCompatParcelizer;
    public IconCompatParcelizer read;
    public final r8lambdaL32xCEzW71g2Xzeh1NM3NImxco serializer;
    public final r8lambdaL32xCEzW71g2Xzeh1NM3NImxco write;

    public /* synthetic */ SentryTimberIntegration(r8lambdaL32xCEzW71g2Xzeh1NM3NImxco r8lambdal32xcezw71g2xzeh1nm3nimxco, r8lambdaL32xCEzW71g2Xzeh1NM3NImxco r8lambdal32xcezw71g2xzeh1nm3nimxco2, logClicklambda0 logclicklambda0, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? r8lambdaL32xCEzW71g2Xzeh1NM3NImxco.ERROR : r8lambdal32xcezw71g2xzeh1nm3nimxco, (i & 2) != 0 ? r8lambdaL32xCEzW71g2Xzeh1NM3NImxco.INFO : r8lambdal32xcezw71g2xzeh1nm3nimxco2, (i & 4) != 0 ? logClicklambda0.INFO : logclicklambda0);
    }

    @Override // o.LogCustomEventStep
    public final void RemoteActionCompatParcelizer(SentryOptions sentryOptions) {
        BrazeActionParserExternalSyntheticLambda0 logger = sentryOptions.getLogger();
        logger.getClass();
        this.RemoteActionCompatParcelizer = logger;
        IconCompatParcelizer iconCompatParcelizer = new IconCompatParcelizer(this.serializer, this.write, this.IconCompatParcelizer);
        this.read = iconCompatParcelizer;
        Timber.RemoteActionCompatParcelizer.write(iconCompatParcelizer);
        BrazeActionParserExternalSyntheticLambda0 brazeActionParserExternalSyntheticLambda0 = this.RemoteActionCompatParcelizer;
        if (brazeActionParserExternalSyntheticLambda0 == null) {
            removeNodeAtDepth.serializer("logger");
            throw null;
        }
        brazeActionParserExternalSyntheticLambda0.IconCompatParcelizer(r8lambdaL32xCEzW71g2Xzeh1NM3NImxco.DEBUG, "SentryTimberIntegration installed.", new Object[0]);
        DelayKt.MediaSessionCompatToken("Timber");
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        IconCompatParcelizer iconCompatParcelizer = this.read;
        if (iconCompatParcelizer != null) {
            if (iconCompatParcelizer == null) {
                removeNodeAtDepth.serializer("tree");
                throw null;
            }
            Timber.RemoteActionCompatParcelizer.getClass();
            ArrayList arrayList = Timber.IconCompatParcelizer;
            synchronized (arrayList) {
                if (!arrayList.remove(iconCompatParcelizer)) {
                    throw new IllegalArgumentException(removeNodeAtDepth.write((Object) iconCompatParcelizer, "Cannot uproot tree which is not planted: ").toString());
                }
                Object[] array = arrayList.toArray(new ProtoPrerequisiteMsgserializer[0]);
                if (array == null) {
                    throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
                }
                Timber.read = (ProtoPrerequisiteMsgserializer[]) array;
            }
            BrazeActionParserExternalSyntheticLambda0 brazeActionParserExternalSyntheticLambda0 = this.RemoteActionCompatParcelizer;
            if (brazeActionParserExternalSyntheticLambda0 != null) {
                if (brazeActionParserExternalSyntheticLambda0 != null) {
                    brazeActionParserExternalSyntheticLambda0.IconCompatParcelizer(r8lambdaL32xCEzW71g2Xzeh1NM3NImxco.DEBUG, "SentryTimberIntegration removed.", new Object[0]);
                } else {
                    removeNodeAtDepth.serializer("logger");
                    throw null;
                }
            }
        }
    }

    static {
        BannerViewcreateBannerWebViewClientListener1.RemoteActionCompatParcelizer().IconCompatParcelizer("maven:io.sentry:sentry-android-timber", "8.32.0");
    }

    public SentryTimberIntegration(r8lambdaL32xCEzW71g2Xzeh1NM3NImxco r8lambdal32xcezw71g2xzeh1nm3nimxco, r8lambdaL32xCEzW71g2Xzeh1NM3NImxco r8lambdal32xcezw71g2xzeh1nm3nimxco2, logClicklambda0 logclicklambda0) {
        r8lambdal32xcezw71g2xzeh1nm3nimxco.getClass();
        r8lambdal32xcezw71g2xzeh1nm3nimxco2.getClass();
        logclicklambda0.getClass();
        this.serializer = r8lambdal32xcezw71g2xzeh1nm3nimxco;
        this.write = r8lambdal32xcezw71g2xzeh1nm3nimxco2;
        this.IconCompatParcelizer = logclicklambda0;
    }

    public SentryTimberIntegration() {
        this(null, null, null, 7, null);
    }
}
