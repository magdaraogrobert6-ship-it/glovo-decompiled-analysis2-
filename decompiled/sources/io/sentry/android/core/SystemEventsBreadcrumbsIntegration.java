package io.sentry.android.core;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import android.os.HandlerThread;
import android.os.SystemClock;
import com.braze.models.inappmessage.InAppMessageBase;
import com.sentiance.sdk.task.e$$ExternalSyntheticLambda0;
import io.sentry.SentryOptions;
import java.io.Closeable;
import java.nio.charset.Charset;
import java.util.HashMap;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.atomic.AtomicBoolean;
import o.AddToCustomAttributeArrayStep;
import o.LogCustomEventStep;
import o.UriActionExternalSyntheticLambda4;
import o.accessgetDismissSubscriberp;
import o.executelambda4;
import o.getIntentArrayWithConfiguredBackStacklambda1;
import o.r8lambdaL32xCEzW71g2Xzeh1NM3NImxco;
import o.setNativeShader;

/* JADX INFO: loaded from: classes4.dex */
public final class SystemEventsBreadcrumbsIntegration implements LogCustomEventStep, Closeable, r8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8 {
    public onBackPressedDispatcher_delegatelambda0 MediaBrowserCompatMediaItem;
    public SentryAndroidOptions MediaDescriptionCompat;
    public accessgetDismissSubscriberp MediaSessionCompatResultReceiverWrapper;
    public volatile SystemEventsBroadcastReceiver RatingCompat;
    public final String[] read;
    public final Context write;
    public volatile boolean IconCompatParcelizer = false;
    public volatile boolean MediaSessionCompatQueueItem = false;
    public volatile IntentFilter RemoteActionCompatParcelizer = null;
    public volatile HandlerThread serializer = null;
    public final AtomicBoolean MediaMetadataCompat = new AtomicBoolean(false);
    public final io.sentry.util.RemoteActionCompatParcelizer PlaybackStateCompatCustomAction = new io.sentry.util.RemoteActionCompatParcelizer();

    public final class SystemEventsBroadcastReceiver extends BroadcastReceiver {
        public static int MediaBrowserCompatMediaItem;
        public static int MediaSessionCompatQueueItem;
        public final AddToCustomAttributeArrayStep read;
        public final SentryAndroidOptions serializer;
        public final io.sentry.android.core.internal.util.MediaDescriptionCompat IconCompatParcelizer = new io.sentry.android.core.internal.util.MediaDescriptionCompat(60000, 0);
        public final char[] write = new char[64];

        public SystemEventsBroadcastReceiver(AddToCustomAttributeArrayStep addToCustomAttributeArrayStep, SentryAndroidOptions sentryAndroidOptions) {
            this.read = addToCustomAttributeArrayStep;
            this.serializer = sentryAndroidOptions;
        }

        @Override // android.content.BroadcastReceiver
        public final void onReceive(Context context, Intent intent) {
            onBackPressedDispatcher_delegatelambda0 onbackpresseddispatcher_delegatelambda0;
            Bundle extras;
            int i;
            String action = intent.getAction();
            boolean zEquals = "android.intent.action.BATTERY_CHANGED".equals(action);
            SentryAndroidOptions sentryAndroidOptions = this.serializer;
            String str = null;
            if (!zEquals) {
                onbackpresseddispatcher_delegatelambda0 = null;
            } else {
                if (this.IconCompatParcelizer.IconCompatParcelizer()) {
                    return;
                }
                Float fRemoteActionCompatParcelizer = _init_lambda4.RemoteActionCompatParcelizer(intent, sentryAndroidOptions);
                onbackpresseddispatcher_delegatelambda0 = new onBackPressedDispatcher_delegatelambda0(fRemoteActionCompatParcelizer != null ? Integer.valueOf(fRemoteActionCompatParcelizer.intValue()) : null, _init_lambda4.write(intent, sentryAndroidOptions));
                SystemEventsBreadcrumbsIntegration systemEventsBreadcrumbsIntegration = SystemEventsBreadcrumbsIntegration.this;
                if (onbackpresseddispatcher_delegatelambda0.equals(systemEventsBreadcrumbsIntegration.MediaBrowserCompatMediaItem)) {
                    return;
                } else {
                    systemEventsBreadcrumbsIntegration.MediaBrowserCompatMediaItem = onbackpresseddispatcher_delegatelambda0;
                }
            }
            getIntentArrayWithConfiguredBackStacklambda1 getintentarraywithconfiguredbackstacklambda1 = new getIntentArrayWithConfiguredBackStacklambda1(System.currentTimeMillis());
            getintentarraywithconfiguredbackstacklambda1.MediaSessionCompatQueueItem = "system";
            getintentarraywithconfiguredbackstacklambda1.write = "device.event";
            if (action != null) {
                int length = action.length();
                char[] cArr = this.write;
                int length2 = cArr.length;
                while (true) {
                    length--;
                    if (length >= 0) {
                        char cCharAt = action.charAt(length);
                        if (cCharAt == '.') {
                            str = new String(cArr, length2, cArr.length - length2);
                            break;
                        }
                        if (length2 == 0) {
                            Charset charset = io.sentry.util.r8lambda54BeH8ZsBru0CXI2CCSP2syNys.IconCompatParcelizer;
                            int iLastIndexOf = action.lastIndexOf(".");
                            if (iLastIndexOf >= 0 && action.length() > (i = iLastIndexOf + 1)) {
                                str = action.substring(i);
                                break;
                            }
                            break;
                        }
                        length2--;
                        cArr[length2] = cCharAt;
                    }
                    str = action;
                    break;
                }
            }
            if (str != null) {
                getintentarraywithconfiguredbackstacklambda1.read(str, "action");
            }
            if (onbackpresseddispatcher_delegatelambda0 != null) {
                Integer num = onbackpresseddispatcher_delegatelambda0.RemoteActionCompatParcelizer;
                if (num != null) {
                    getintentarraywithconfiguredbackstacklambda1.read(num, "level");
                }
                Boolean bool = onbackpresseddispatcher_delegatelambda0.serializer;
                if (bool != null) {
                    getintentarraywithconfiguredbackstacklambda1.read(bool, "charging");
                }
            } else if (sentryAndroidOptions.isEnableSystemEventBreadcrumbsExtras() && (extras = intent.getExtras()) != null && !extras.isEmpty()) {
                HashMap map = new HashMap(extras.size());
                for (String str2 : extras.keySet()) {
                    try {
                        Object obj = extras.get(str2);
                        if (obj != null) {
                            map.put(str2, obj.toString());
                        }
                    } catch (Throwable th) {
                        sentryAndroidOptions.getLogger().serializer(r8lambdaL32xCEzW71g2Xzeh1NM3NImxco.ERROR, th, "%s key of the %s action threw an error.", str2, action);
                    }
                }
                getintentarraywithconfiguredbackstacklambda1.read(map, InAppMessageBase.EXTRAS);
            }
            getintentarraywithconfiguredbackstacklambda1.read = r8lambdaL32xCEzW71g2Xzeh1NM3NImxco.INFO;
            executelambda4 executelambda4Var = new executelambda4();
            executelambda4Var.RemoteActionCompatParcelizer("android:intent", intent);
            this.read.IconCompatParcelizer(getintentarraywithconfiguredbackstacklambda1, executelambda4Var);
        }

        public static int write() {
            int i = MediaBrowserCompatMediaItem;
            int i2 = i % 6610211;
            MediaBrowserCompatMediaItem = i + 1;
            if (i2 != 0) {
                return MediaSessionCompatQueueItem;
            }
            int iElapsedRealtime = (int) SystemClock.elapsedRealtime();
            MediaSessionCompatQueueItem = iElapsedRealtime;
            return iElapsedRealtime;
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        UriActionExternalSyntheticLambda4 uriActionExternalSyntheticLambda4Serializer = this.PlaybackStateCompatCustomAction.serializer();
        try {
            this.IconCompatParcelizer = true;
            this.RemoteActionCompatParcelizer = null;
            if (this.serializer != null) {
                this.serializer.quit();
            }
            this.serializer = null;
            uriActionExternalSyntheticLambda4Serializer.close();
            r8lambdaXj9c8VIP9DfEvaTmZt0ejAuC4a4.serializer.RemoteActionCompatParcelizer(this);
            SentryAndroidOptions sentryAndroidOptions = this.MediaDescriptionCompat;
            if (sentryAndroidOptions != null) {
                try {
                    sentryAndroidOptions.getExecutorService().RemoteActionCompatParcelizer(new e$$ExternalSyntheticLambda0(20, this));
                } catch (RejectedExecutionException unused) {
                    serializer();
                }
            }
            SentryAndroidOptions sentryAndroidOptions2 = this.MediaDescriptionCompat;
            if (sentryAndroidOptions2 != null) {
                sentryAndroidOptions2.getLogger().IconCompatParcelizer(r8lambdaL32xCEzW71g2Xzeh1NM3NImxco.DEBUG, "SystemEventsBreadcrumbsIntegration removed.", new Object[0]);
            }
        } catch (Throwable th) {
            try {
                uriActionExternalSyntheticLambda4Serializer.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public final void serializer() {
        UriActionExternalSyntheticLambda4 uriActionExternalSyntheticLambda4Serializer = this.PlaybackStateCompatCustomAction.serializer();
        try {
            this.MediaSessionCompatQueueItem = true;
            SystemEventsBroadcastReceiver systemEventsBroadcastReceiver = this.RatingCompat;
            this.RatingCompat = null;
            uriActionExternalSyntheticLambda4Serializer.close();
            if (systemEventsBroadcastReceiver != null) {
                this.write.unregisterReceiver(systemEventsBroadcastReceiver);
            }
        } catch (Throwable th) {
            try {
                uriActionExternalSyntheticLambda4Serializer.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // io.sentry.android.core.r8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8
    public final void RemoteActionCompatParcelizer() {
        if (this.MediaSessionCompatResultReceiverWrapper == null || this.MediaDescriptionCompat == null) {
            return;
        }
        this.MediaSessionCompatQueueItem = false;
        RemoteActionCompatParcelizer(this.MediaSessionCompatResultReceiverWrapper, this.MediaDescriptionCompat);
    }

    @Override // o.LogCustomEventStep
    public final void RemoteActionCompatParcelizer(SentryOptions sentryOptions) {
        SentryAndroidOptions sentryAndroidOptions = sentryOptions instanceof SentryAndroidOptions ? (SentryAndroidOptions) sentryOptions : null;
        setNativeShader.read(sentryAndroidOptions, "SentryAndroidOptions is required");
        this.MediaDescriptionCompat = sentryAndroidOptions;
        this.MediaSessionCompatResultReceiverWrapper = accessgetDismissSubscriberp.IconCompatParcelizer;
        sentryAndroidOptions.getLogger().IconCompatParcelizer(r8lambdaL32xCEzW71g2Xzeh1NM3NImxco.DEBUG, "SystemEventsBreadcrumbsIntegration enabled: %s", Boolean.valueOf(this.MediaDescriptionCompat.isEnableSystemEventBreadcrumbs()));
        if (this.MediaDescriptionCompat.isEnableSystemEventBreadcrumbs()) {
            r8lambdaXj9c8VIP9DfEvaTmZt0ejAuC4a4.serializer.serializer(this);
            if (_init_lambda3.IconCompatParcelizer()) {
                RemoteActionCompatParcelizer(this.MediaSessionCompatResultReceiverWrapper, this.MediaDescriptionCompat);
            }
        }
    }

    @Override // io.sentry.android.core.r8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8
    public final void D_() {
        SentryAndroidOptions sentryAndroidOptions = this.MediaDescriptionCompat;
        if (sentryAndroidOptions == null) {
            return;
        }
        try {
            sentryAndroidOptions.getExecutorService().RemoteActionCompatParcelizer(new e$$ExternalSyntheticLambda0(20, this));
        } catch (RejectedExecutionException unused) {
            serializer();
        }
    }

    public final void RemoteActionCompatParcelizer(accessgetDismissSubscriberp accessgetdismisssubscriberp, SentryAndroidOptions sentryAndroidOptions) {
        if (sentryAndroidOptions.isEnableSystemEventBreadcrumbs() && !this.IconCompatParcelizer && !this.MediaSessionCompatQueueItem && this.RatingCompat == null) {
            try {
                sentryAndroidOptions.getExecutorService().RemoteActionCompatParcelizer(new SendCachedEnvelopeIntegration$$ExternalSyntheticLambda0(this, accessgetdismisssubscriberp, sentryAndroidOptions));
            } catch (Throwable unused) {
                sentryAndroidOptions.getLogger().IconCompatParcelizer(r8lambdaL32xCEzW71g2Xzeh1NM3NImxco.WARNING, "Failed to start SystemEventsBreadcrumbsIntegration on executor thread.", new Object[0]);
            }
        }
    }

    public SystemEventsBreadcrumbsIntegration(Context context) {
        String[] strArr = {"android.intent.action.ACTION_SHUTDOWN", "android.intent.action.AIRPLANE_MODE", "android.intent.action.BATTERY_CHANGED", "android.intent.action.CAMERA_BUTTON", "android.intent.action.CONFIGURATION_CHANGED", "android.intent.action.DATE_CHANGED", "android.intent.action.DEVICE_STORAGE_LOW", "android.intent.action.DEVICE_STORAGE_OK", "android.intent.action.DOCK_EVENT", "android.intent.action.DREAMING_STARTED", "android.intent.action.DREAMING_STOPPED", "android.intent.action.INPUT_METHOD_CHANGED", "android.intent.action.LOCALE_CHANGED", "android.intent.action.SCREEN_OFF", "android.intent.action.SCREEN_ON", "android.intent.action.TIMEZONE_CHANGED", "android.intent.action.TIME_SET", "android.os.action.DEVICE_IDLE_MODE_CHANGED", "android.os.action.POWER_SAVE_MODE_CHANGED"};
        Context applicationContext = context.getApplicationContext();
        this.write = applicationContext == null ? context : applicationContext;
        this.read = strArr;
    }
}
