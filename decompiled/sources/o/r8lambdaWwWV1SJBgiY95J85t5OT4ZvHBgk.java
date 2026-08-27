package o;

import com.incognia.internal.ZM$$ExternalSyntheticLambda2;
import com.sentiance.sdk.InjectUsing;
import com.sentiance.sdk.configuration.ConfigurationManager;
import com.sentiance.sdk.crashloop.CrashLoopDetector$endCurrentSessionAndClearCache$1;
import com.sentiance.sdk.events.ControlMessage;
import com.sentiance.sdk.exception.NativeExceptionHandler;
import io.sentry.protocol.DebugImage;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.DefaultConstructorMarker;
import o.createFromParcel;
import o.getLongitudeannotations;
import o.r8lambdaQv3gcJxzUxdig5g76qjUZxGjNI;
import o.r8lambdaWwWV1SJBgiY95J85t5OT4ZvHBgk;
import o.r8lambdawomQpeHNmpRYEK66BISVJgiO9j4;

/* JADX INFO: loaded from: classes3.dex */
@InjectUsing(cacheName = "CrashLoopDetector", componentName = "CrashLoopDetector")
public final class r8lambdaWwWV1SJBgiY95J85t5OT4ZvHBgk implements removeGeofencesRegisteredWithGeofencingClientlambda2 {
    private final r8lambdan3wiWHxpz5a8QDwArAinCSqLs IconCompatParcelizer;
    private final getContentText MediaBrowserCompatMediaItem;
    private final Object MediaDescriptionCompat;
    private final readStringlambda0 MediaMetadataCompat;
    private final NativeExceptionHandler MediaSessionCompatQueueItem;
    private r8lambdawomQpeHNmpRYEK66BISVJgiO9j4 MediaSessionCompatToken;
    private final r8lambdaVml774X4gjiH7QFyyZqBCMSepGQ ParcelableVolumeInfo;
    private final ConfigurationManager RatingCompat;
    private final parseLonglambda0 RemoteActionCompatParcelizer;
    private final readandroid_sdk_base_release read;
    private final getAnalyticsEnabledEnterannotations serializer;
    private final r8lambdaQv3gcJxzUxdig5g76qjUZxGjNI write;

    public static final class IconCompatParcelizer {
        public IconCompatParcelizer(DefaultConstructorMarker defaultConstructorMarker) {
        }
    }

    public final void IconCompatParcelizer() {
        parseLonglambda0 parselonglambda0 = this.RemoteActionCompatParcelizer;
        parselonglambda0.IconCompatParcelizer("Reset crash loop detector.", new Object[0]);
        this.MediaBrowserCompatMediaItem.write(this.ParcelableVolumeInfo);
        RemoteActionCompatParcelizer(new CrashLoopDetector$endCurrentSessionAndClearCache$1(this));
        parselonglambda0.IconCompatParcelizer("Current SDK init session ended and crash count reset.", new Object[0]);
    }

    @Override // o.removeGeofencesRegisteredWithGeofencingClientlambda2
    public final Map<Class<? extends r8lambdaNClnUmOHj3W_epRKCJ4qJg7b2k>, Long> getRequiredEvents() {
        return SimpleItemTouchHelperCallback.serializer;
    }

    @Override // o.removeGeofencesRegisteredWithGeofencingClientlambda2
    public final void onKillswitchActivated() {
        IconCompatParcelizer();
    }

    public static final void MediaMetadataCompat(final r8lambdaWwWV1SJBgiY95J85t5OT4ZvHBgk r8lambdawwwv1sjbgiy95j85t5ot4zvhbgk) {
        parseLonglambda0 parselonglambda0 = r8lambdawwwv1sjbgiy95j85t5ot4zvhbgk.RemoteActionCompatParcelizer;
        ConfigurationManager configurationManager = r8lambdawwwv1sjbgiy95j85t5ot4zvhbgk.RatingCompat;
        if (configurationManager.r8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss()) {
            parselonglambda0.IconCompatParcelizer("SDK initialized.", new Object[0]);
            if (Short.valueOf(configurationManager.RatingCompat()).longValue() * 1000 == 0) {
                parselonglambda0.IconCompatParcelizer("Critical post SDK init phase duration is set to 0, SDK has already passed the critical duration.", new Object[0]);
                r8lambdawwwv1sjbgiy95j85t5ot4zvhbgk.RemoteActionCompatParcelizer(new CrashLoopDetector$endCurrentSessionAndClearCache$1(r8lambdawwwv1sjbgiy95j85t5ot4zvhbgk));
                r8lambdawwwv1sjbgiy95j85t5ot4zvhbgk.RemoteActionCompatParcelizer.IconCompatParcelizer("Current SDK init session ended and crash count reset.", new Object[0]);
            } else {
                r8lambdawwwv1sjbgiy95j85t5ot4zvhbgk.RemoteActionCompatParcelizer(new r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM() { // from class: com.sentiance.sdk.crashloop.CrashLoopDetector$onSdkInitialized$1
                    @Override // o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM
                    public final Object invoke(Object obj) {
                        r8lambdawomQpeHNmpRYEK66BISVJgiO9j4 r8lambdawomqpehnmpryek66bisvjgio9j4 = this.this$0.MediaSessionCompatToken;
                        if (r8lambdawomqpehnmpryek66bisvjgio9j4 == null) {
                            r8lambdaQv3gcJxzUxdig5g76qjUZxGjNI unused = this.this$0.write;
                            r8lambdawomqpehnmpryek66bisvjgio9j4 = new r8lambdawomQpeHNmpRYEK66BISVJgiO9j4(System.currentTimeMillis());
                            this.this$0.MediaSessionCompatToken = r8lambdawomqpehnmpryek66bisvjgio9j4;
                        }
                        r8lambdaQv3gcJxzUxdig5g76qjUZxGjNI unused2 = this.this$0.write;
                        r8lambdawomqpehnmpryek66bisvjgio9j4.write(Long.valueOf(System.currentTimeMillis()));
                        this.this$0.MediaSessionCompatToken = r8lambdawomqpehnmpryek66bisvjgio9j4;
                        this.this$0.IconCompatParcelizer.write(r8lambdawomqpehnmpryek66bisvjgio9j4);
                        return createFromParcel.INSTANCE;
                    }

                    {
                        super(1);
                    }
                });
                r8lambdawwwv1sjbgiy95j85t5ot4zvhbgk.MediaBrowserCompatMediaItem.serializer(r8lambdawwwv1sjbgiy95j85t5ot4zvhbgk.ParcelableVolumeInfo);
                long jLongValue = Short.valueOf(configurationManager.RatingCompat()).longValue();
                readStringlambda0.write(r8lambdawwwv1sjbgiy95j85t5ot4zvhbgk.MediaMetadataCompat, r8lambdawwwv1sjbgiy95j85t5ot4zvhbgk.read, jLongValue * 1000, null, new ZM$$ExternalSyntheticLambda2(19, r8lambdawwwv1sjbgiy95j85t5ot4zvhbgk), 12).serializer();
            }
        }
    }

    public static final void MediaSessionCompatQueueItem(r8lambdaWwWV1SJBgiY95J85t5OT4ZvHBgk r8lambdawwwv1sjbgiy95j85t5ot4zvhbgk) {
        if (r8lambdawwwv1sjbgiy95j85t5ot4zvhbgk.RatingCompat.r8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss()) {
            return;
        }
        r8lambdawwwv1sjbgiy95j85t5ot4zvhbgk.RemoteActionCompatParcelizer.IconCompatParcelizer("Crash loop detection is disabled.", new Object[0]);
        r8lambdawwwv1sjbgiy95j85t5ot4zvhbgk.IconCompatParcelizer();
    }

    public final boolean read() {
        ConfigurationManager configurationManager = this.RatingCompat;
        return configurationManager.r8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss() && this.IconCompatParcelizer.IconCompatParcelizer() >= configurationManager.RemoteActionCompatParcelizer();
    }

    @Override // o.removeGeofencesRegisteredWithGeofencingClientlambda2
    public final void subscribe() {
        r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm = new r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM() { // from class: com.sentiance.sdk.crashloop.CrashLoopDetector$subscribe$1
            @Override // o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM
            public final Object invoke(Object obj) {
                ((getLongitudeannotations) obj).getClass();
                r8lambdaWwWV1SJBgiY95J85t5OT4ZvHBgk.MediaMetadataCompat(this.this$0);
                return createFromParcel.INSTANCE;
            }

            {
                super(1);
            }
        };
        getAnalyticsEnabledEnterannotations getanalyticsenabledenterannotations = this.serializer;
        readandroid_sdk_base_release readandroid_sdk_base_releaseVar = this.read;
        getEnterEventsannotations.IconCompatParcelizer(getanalyticsenabledenterannotations, addBannerViewMonitor.class, readandroid_sdk_base_releaseVar, "CrashLoopDetector", r8lambdaunavo3sxub_pc9xroryotnrlvsm);
        ControlMessage controlMessage = ControlMessage.CONFIGURATION_UPDATED;
        r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 r8lambdaa6_tctqmksh3fk6hjgcbkuvde0 = new r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0() { // from class: com.sentiance.sdk.crashloop.CrashLoopDetector$subscribe$2
            @Override // o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0
            public final Object invoke(Object obj, Object obj2) {
                ((ControlMessage) obj).getClass();
                r8lambdaWwWV1SJBgiY95J85t5OT4ZvHBgk.MediaSessionCompatQueueItem(this.this$0);
                return createFromParcel.INSTANCE;
            }

            {
                super(2);
            }
        };
        controlMessage.getClass();
        getanalyticsenabledenterannotations.read(controlMessage, new getRadiusMeterannotations(readandroid_sdk_base_releaseVar, r8lambdaa6_tctqmksh3fk6hjgcbkuvde0, controlMessage));
    }

    public final void write() {
        if (this.RatingCompat.r8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss()) {
            this.MediaBrowserCompatMediaItem.serializer(this.ParcelableVolumeInfo);
            this.RemoteActionCompatParcelizer.IconCompatParcelizer("SDK is starting to initialize, isCrashLoopDetected=%s", Boolean.valueOf(read()));
            r8lambdawomQpeHNmpRYEK66BISVJgiO9j4 r8lambdawomqpehnmpryek66bisvjgio9j4Serializer = this.IconCompatParcelizer.serializer();
            if (r8lambdawomqpehnmpryek66bisvjgio9j4Serializer != null) {
                List<Long> recentOrUnprocessedExceptionsSince = this.MediaSessionCompatQueueItem.getRecentOrUnprocessedExceptionsSince(r8lambdawomqpehnmpryek66bisvjgio9j4Serializer.read());
                recentOrUnprocessedExceptionsSince.getClass();
                if (!(recentOrUnprocessedExceptionsSince instanceof Collection) || !recentOrUnprocessedExceptionsSince.isEmpty()) {
                    for (Long l : recentOrUnprocessedExceptionsSince) {
                        l.getClass();
                        if (IconCompatParcelizer(r8lambdawomqpehnmpryek66bisvjgio9j4Serializer, l.longValue())) {
                            read("native");
                            break;
                        }
                    }
                }
            }
            RemoteActionCompatParcelizer(new r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM() { // from class: com.sentiance.sdk.crashloop.CrashLoopDetector$onSdkInitStarted$1
                @Override // o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM
                public final Object invoke(Object obj) {
                    r8lambdaWwWV1SJBgiY95J85t5OT4ZvHBgk r8lambdawwwv1sjbgiy95j85t5ot4zvhbgk = this.this$0;
                    r8lambdaQv3gcJxzUxdig5g76qjUZxGjNI unused = r8lambdawwwv1sjbgiy95j85t5ot4zvhbgk.write;
                    r8lambdawwwv1sjbgiy95j85t5ot4zvhbgk.MediaSessionCompatToken = new r8lambdawomQpeHNmpRYEK66BISVJgiO9j4(System.currentTimeMillis());
                    this.this$0.IconCompatParcelizer.write(this.this$0.MediaSessionCompatToken);
                    return createFromParcel.INSTANCE;
                }

                {
                    super(1);
                }
            });
        }
    }

    static {
        new IconCompatParcelizer(null);
    }

    public r8lambdaWwWV1SJBgiY95J85t5OT4ZvHBgk(r8lambdan3wiWHxpz5a8QDwArAinCSqLs r8lambdan3wiwhxpz5a8qdwaraincsqls, parseLonglambda0 parselonglambda0, getAnalyticsEnabledEnterannotations getanalyticsenabledenterannotations, readandroid_sdk_base_release readandroid_sdk_base_releaseVar, r8lambdaQv3gcJxzUxdig5g76qjUZxGjNI r8lambdaqv3gcjxzuxdig5g76qjuzxgjni, getContentText getcontenttext, ConfigurationManager configurationManager, readStringlambda0 readstringlambda0, NativeExceptionHandler nativeExceptionHandler) {
        r8lambdan3wiwhxpz5a8qdwaraincsqls.getClass();
        parselonglambda0.getClass();
        getanalyticsenabledenterannotations.getClass();
        readandroid_sdk_base_releaseVar.getClass();
        r8lambdaqv3gcjxzuxdig5g76qjuzxgjni.getClass();
        getcontenttext.getClass();
        configurationManager.getClass();
        readstringlambda0.getClass();
        nativeExceptionHandler.getClass();
        this.IconCompatParcelizer = r8lambdan3wiwhxpz5a8qdwaraincsqls;
        this.RemoteActionCompatParcelizer = parselonglambda0;
        this.serializer = getanalyticsenabledenterannotations;
        this.read = readandroid_sdk_base_releaseVar;
        this.write = r8lambdaqv3gcjxzuxdig5g76qjuzxgjni;
        this.MediaBrowserCompatMediaItem = getcontenttext;
        this.RatingCompat = configurationManager;
        this.MediaMetadataCompat = readstringlambda0;
        this.MediaSessionCompatQueueItem = nativeExceptionHandler;
        this.MediaDescriptionCompat = new Object();
        this.ParcelableVolumeInfo = new r8lambdaVml774X4gjiH7QFyyZqBCMSepGQ(this);
    }

    public static void IconCompatParcelizer(final r8lambdaWwWV1SJBgiY95J85t5OT4ZvHBgk r8lambdawwwv1sjbgiy95j85t5ot4zvhbgk) {
        parseLonglambda0 parselonglambda0 = r8lambdawwwv1sjbgiy95j85t5ot4zvhbgk.RemoteActionCompatParcelizer;
        parselonglambda0.IconCompatParcelizer("JVM crash detected", new Object[0]);
        final cancelPendingWebViewPause cancelpendingwebviewpause = new cancelPendingWebViewPause();
        r8lambdawwwv1sjbgiy95j85t5ot4zvhbgk.RemoteActionCompatParcelizer(new r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM() { // from class: com.sentiance.sdk.crashloop.CrashLoopDetector$onJvmFatalExceptionDetected$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM
            public final Object invoke(Object obj) {
                cancelpendingwebviewpause.IconCompatParcelizer = r8lambdaWwWV1SJBgiY95J85t5OT4ZvHBgk.write(r8lambdawwwv1sjbgiy95j85t5ot4zvhbgk, (r8lambdawomQpeHNmpRYEK66BISVJgiO9j4) obj);
                if (cancelpendingwebviewpause.IconCompatParcelizer) {
                    r8lambdawwwv1sjbgiy95j85t5ot4zvhbgk.RemoteActionCompatParcelizer.IconCompatParcelizer("JVM crash occurred during critical startup window.", new Object[0]);
                    r8lambdawwwv1sjbgiy95j85t5ot4zvhbgk.read(DebugImage.JVM);
                }
                return createFromParcel.INSTANCE;
            }
        });
        if (cancelpendingwebviewpause.IconCompatParcelizer) {
            return;
        }
        parselonglambda0.IconCompatParcelizer("JVM crash did not occur during critical startup window. Ignoring.", new Object[0]);
    }

    private final boolean IconCompatParcelizer(r8lambdawomQpeHNmpRYEK66BISVJgiO9j4 r8lambdawomqpehnmpryek66bisvjgio9j4, long j) {
        long jCurrentTimeMillis;
        if (r8lambdawomqpehnmpryek66bisvjgio9j4 == null) {
            return false;
        }
        long j2 = r8lambdawomqpehnmpryek66bisvjgio9j4.read();
        Long lRemoteActionCompatParcelizer = r8lambdawomqpehnmpryek66bisvjgio9j4.RemoteActionCompatParcelizer();
        if (lRemoteActionCompatParcelizer != null) {
            jCurrentTimeMillis = lRemoteActionCompatParcelizer.longValue();
        } else {
            jCurrentTimeMillis = System.currentTimeMillis();
        }
        return j2 <= j && j <= (Short.valueOf(this.RatingCompat.RatingCompat()).longValue() * 1000) + jCurrentTimeMillis;
    }

    public static void RemoteActionCompatParcelizer(r8lambdaWwWV1SJBgiY95J85t5OT4ZvHBgk r8lambdawwwv1sjbgiy95j85t5ot4zvhbgk) {
        r8lambdawwwv1sjbgiy95j85t5ot4zvhbgk.getClass();
        r8lambdawwwv1sjbgiy95j85t5ot4zvhbgk.RemoteActionCompatParcelizer.IconCompatParcelizer("SDK is past the critical startup phase", new Object[0]);
        r8lambdawwwv1sjbgiy95j85t5ot4zvhbgk.IconCompatParcelizer();
    }

    public static boolean write(r8lambdaWwWV1SJBgiY95J85t5OT4ZvHBgk r8lambdawwwv1sjbgiy95j85t5ot4zvhbgk, r8lambdawomQpeHNmpRYEK66BISVJgiO9j4 r8lambdawomqpehnmpryek66bisvjgio9j4) {
        r8lambdaQv3gcJxzUxdig5g76qjUZxGjNI r8lambdaqv3gcjxzuxdig5g76qjuzxgjni = r8lambdawwwv1sjbgiy95j85t5ot4zvhbgk.write;
        return r8lambdawwwv1sjbgiy95j85t5ot4zvhbgk.IconCompatParcelizer(r8lambdawomqpehnmpryek66bisvjgio9j4, System.currentTimeMillis());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void read(String str) {
        Object[] objArr = {str, Integer.valueOf(this.IconCompatParcelizer.RemoteActionCompatParcelizer())};
        parseLonglambda0 parselonglambda0 = this.RemoteActionCompatParcelizer;
        parselonglambda0.serializer("Startup crash recorded (%s). count=%d", objArr);
        parselonglambda0.serializer("is SDK in crash loop ? %s", read() ? "yes" : "no");
    }

    private final void RemoteActionCompatParcelizer(r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm) {
        synchronized (this.MediaDescriptionCompat) {
            r8lambdaunavo3sxub_pc9xroryotnrlvsm.invoke(this.MediaSessionCompatToken);
        }
    }
}
