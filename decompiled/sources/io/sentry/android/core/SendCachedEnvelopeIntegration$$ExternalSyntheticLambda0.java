package io.sentry.android.core;

import android.content.Context;
import android.content.IntentFilter;
import android.os.Build;
import android.os.Handler;
import android.os.HandlerThread;
import io.sentry.SentryOptions;
import io.sentry.android.core.SystemEventsBreadcrumbsIntegration.SystemEventsBroadcastReceiver;
import kotlinx.coroutines.DelayKt;
import o.AddToCustomAttributeArrayStep;
import o.UriActionExternalSyntheticLambda4;
import o.getActionTypeandroid_sdk_ui_release;
import o.loadHtmlData;
import o.openUriWithActionViewFromPush;
import o.parseandroid_sdk_ui_release;
import o.r8lambdaL32xCEzW71g2Xzeh1NM3NImxco;
import o.setNativeShader;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class SendCachedEnvelopeIntegration$$ExternalSyntheticLambda0 implements Runnable {
    public final /* synthetic */ SentryOptions IconCompatParcelizer;
    public final /* synthetic */ Object RemoteActionCompatParcelizer;
    public final /* synthetic */ Object serializer;
    public final /* synthetic */ int write;

    public /* synthetic */ SendCachedEnvelopeIntegration$$ExternalSyntheticLambda0(SystemEventsBreadcrumbsIntegration systemEventsBreadcrumbsIntegration, AddToCustomAttributeArrayStep addToCustomAttributeArrayStep, SentryAndroidOptions sentryAndroidOptions) {
        this.write = 2;
        this.serializer = systemEventsBreadcrumbsIntegration;
        this.RemoteActionCompatParcelizer = addToCustomAttributeArrayStep;
        this.IconCompatParcelizer = sentryAndroidOptions;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.write;
        if (i == 0) {
            SendCachedEnvelopeIntegration sendCachedEnvelopeIntegration = (SendCachedEnvelopeIntegration) this.serializer;
            SentryAndroidOptions sentryAndroidOptions = (SentryAndroidOptions) this.IconCompatParcelizer;
            AddToCustomAttributeArrayStep addToCustomAttributeArrayStep = (AddToCustomAttributeArrayStep) this.RemoteActionCompatParcelizer;
            try {
                if (sendCachedEnvelopeIntegration.write.get()) {
                    sentryAndroidOptions.getLogger().IconCompatParcelizer(r8lambdaL32xCEzW71g2Xzeh1NM3NImxco.INFO, "SendCachedEnvelopeIntegration, not trying to send after closing.", new Object[0]);
                    return;
                }
                if (!sendCachedEnvelopeIntegration.read.getAndSet(true)) {
                    parseandroid_sdk_ui_release connectionStatusProvider = sentryAndroidOptions.getConnectionStatusProvider();
                    sendCachedEnvelopeIntegration.IconCompatParcelizer = connectionStatusProvider;
                    connectionStatusProvider.read(sendCachedEnvelopeIntegration);
                    sendCachedEnvelopeIntegration.MediaDescriptionCompat = sendCachedEnvelopeIntegration.RemoteActionCompatParcelizer.IconCompatParcelizer(addToCustomAttributeArrayStep, sentryAndroidOptions);
                }
                parseandroid_sdk_ui_release parseandroid_sdk_ui_releaseVar = sendCachedEnvelopeIntegration.IconCompatParcelizer;
                if (parseandroid_sdk_ui_releaseVar != null && parseandroid_sdk_ui_releaseVar.IconCompatParcelizer() == getActionTypeandroid_sdk_ui_release.DISCONNECTED) {
                    sentryAndroidOptions.getLogger().IconCompatParcelizer(r8lambdaL32xCEzW71g2Xzeh1NM3NImxco.INFO, "SendCachedEnvelopeIntegration, no connection.", new Object[0]);
                    return;
                }
                io.sentry.transport.PlaybackStateCompat playbackStateCompatWrite = addToCustomAttributeArrayStep.write();
                if (playbackStateCompatWrite != null && playbackStateCompatWrite.serializer(openUriWithActionViewFromPush.All)) {
                    sentryAndroidOptions.getLogger().IconCompatParcelizer(r8lambdaL32xCEzW71g2Xzeh1NM3NImxco.INFO, "SendCachedEnvelopeIntegration, rate limiting active.", new Object[0]);
                    return;
                }
                loadHtmlData loadhtmldata = sendCachedEnvelopeIntegration.MediaDescriptionCompat;
                if (loadhtmldata == null) {
                    sentryAndroidOptions.getLogger().IconCompatParcelizer(r8lambdaL32xCEzW71g2Xzeh1NM3NImxco.ERROR, "SendCachedEnvelopeIntegration factory is null.", new Object[0]);
                    return;
                } else {
                    loadhtmldata.RemoteActionCompatParcelizer();
                    return;
                }
            } catch (Throwable th) {
                sentryAndroidOptions.getLogger().serializer(r8lambdaL32xCEzW71g2Xzeh1NM3NImxco.ERROR, "Failed trying to send cached events.", th);
                return;
            }
        }
        if (i == 1) {
            EnvelopeFileObserverIntegration envelopeFileObserverIntegration = (EnvelopeFileObserverIntegration) this.serializer;
            SentryOptions sentryOptions = this.IconCompatParcelizer;
            String str = (String) this.RemoteActionCompatParcelizer;
            UriActionExternalSyntheticLambda4 uriActionExternalSyntheticLambda4Serializer = envelopeFileObserverIntegration.RemoteActionCompatParcelizer.serializer();
            try {
                if (!envelopeFileObserverIntegration.write) {
                    envelopeFileObserverIntegration.serializer(sentryOptions, str);
                }
                uriActionExternalSyntheticLambda4Serializer.close();
                return;
            } catch (Throwable th2) {
                try {
                    uriActionExternalSyntheticLambda4Serializer.close();
                } catch (Throwable th3) {
                    th2.addSuppressed(th3);
                }
                throw th2;
            }
        }
        SystemEventsBreadcrumbsIntegration systemEventsBreadcrumbsIntegration = (SystemEventsBreadcrumbsIntegration) this.serializer;
        AddToCustomAttributeArrayStep addToCustomAttributeArrayStep2 = (AddToCustomAttributeArrayStep) this.RemoteActionCompatParcelizer;
        SentryAndroidOptions sentryAndroidOptions2 = (SentryAndroidOptions) this.IconCompatParcelizer;
        UriActionExternalSyntheticLambda4 uriActionExternalSyntheticLambda4Serializer2 = systemEventsBreadcrumbsIntegration.PlaybackStateCompatCustomAction.serializer();
        try {
            if (!systemEventsBreadcrumbsIntegration.IconCompatParcelizer && !systemEventsBreadcrumbsIntegration.MediaSessionCompatQueueItem && systemEventsBreadcrumbsIntegration.RatingCompat == null) {
                systemEventsBreadcrumbsIntegration.RatingCompat = systemEventsBreadcrumbsIntegration.new SystemEventsBroadcastReceiver(addToCustomAttributeArrayStep2, sentryAndroidOptions2);
                if (systemEventsBreadcrumbsIntegration.RemoteActionCompatParcelizer == null) {
                    systemEventsBreadcrumbsIntegration.RemoteActionCompatParcelizer = new IntentFilter();
                    for (String str2 : systemEventsBreadcrumbsIntegration.read) {
                        systemEventsBreadcrumbsIntegration.RemoteActionCompatParcelizer.addAction(str2);
                    }
                }
                if (systemEventsBreadcrumbsIntegration.serializer == null) {
                    systemEventsBreadcrumbsIntegration.serializer = new HandlerThread("SystemEventsReceiver", 10);
                    systemEventsBreadcrumbsIntegration.serializer.start();
                }
                try {
                    Handler handler = new Handler(systemEventsBreadcrumbsIntegration.serializer.getLooper());
                    Context context = systemEventsBreadcrumbsIntegration.write;
                    SystemEventsBreadcrumbsIntegration.SystemEventsBroadcastReceiver systemEventsBroadcastReceiver = systemEventsBreadcrumbsIntegration.RatingCompat;
                    IntentFilter intentFilter = systemEventsBreadcrumbsIntegration.RemoteActionCompatParcelizer;
                    setNativeShader.read(sentryAndroidOptions2.getLogger(), "The ILogger object is required.");
                    if (Build.VERSION.SDK_INT >= 33) {
                        context.registerReceiver(systemEventsBroadcastReceiver, intentFilter, null, handler, 4);
                    } else {
                        context.registerReceiver(systemEventsBroadcastReceiver, intentFilter, null, handler);
                    }
                    if (!systemEventsBreadcrumbsIntegration.MediaMetadataCompat.getAndSet(true)) {
                        sentryAndroidOptions2.getLogger().IconCompatParcelizer(r8lambdaL32xCEzW71g2Xzeh1NM3NImxco.DEBUG, "SystemEventsBreadcrumbsIntegration installed.", new Object[0]);
                        DelayKt.MediaSessionCompatToken("SystemEventsBreadcrumbs");
                    }
                } catch (Throwable th4) {
                    sentryAndroidOptions2.setEnableSystemEventBreadcrumbs(false);
                    sentryAndroidOptions2.getLogger().serializer(r8lambdaL32xCEzW71g2Xzeh1NM3NImxco.ERROR, "Failed to initialize SystemEventsBreadcrumbsIntegration.", th4);
                }
            }
            uriActionExternalSyntheticLambda4Serializer2.close();
        } catch (Throwable th5) {
            try {
                uriActionExternalSyntheticLambda4Serializer2.close();
            } catch (Throwable th6) {
                th5.addSuppressed(th6);
            }
            throw th5;
        }
    }

    public /* synthetic */ SendCachedEnvelopeIntegration$$ExternalSyntheticLambda0(Object obj, SentryOptions sentryOptions, Object obj2, int i) {
        this.write = i;
        this.serializer = obj;
        this.IconCompatParcelizer = sentryOptions;
        this.RemoteActionCompatParcelizer = obj2;
    }
}
