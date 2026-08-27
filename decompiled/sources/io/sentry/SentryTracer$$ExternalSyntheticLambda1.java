package io.sentry;

import androidx.activity.result.ActivityResult;
import androidx.compose.ui.graphics.Fields;
import androidx.work.impl.WorkerWrapper;
import com.deliveryhero.performance.core.screenmetric.rendering.JankStatsFrameTracker$$ExternalSyntheticLambda3;
import com.roadrunner.common.data.api.MapApiError$$ExternalSyntheticLambda1;
import com.roadrunner.home.HomeFragment;
import io.reactivex.functions.Consumer;
import io.reactivex.functions.Function;
import io.sentry.android.core._init_lambda1;
import io.sentry.android.core._init_lambda4;
import io.sentry.android.core.addObserverForBackInvokerlambda0;
import io.sentry.android.core.createFullyDrawnExecutor;
import io.sentry.cache.IconCompatParcelizer;
import io.sentry.cache.MediaMetadataCompat;
import io.sentry.okhttp.RemoteActionCompatParcelizer;
import io.sentry.util.MediaBrowserCompatMediaItem;
import io.sentry.util.MediaSessionCompatQueueItem;
import io.sentry.util.network.NetworkBody;
import io.sentry.util.network.serializer;
import io.sentry.util.runtime.read;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.ListIterator;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicLong;
import o.BannerWebViewClient;
import o.BrazeActionParserExternalSyntheticLambda0;
import o.BrazeActionUtils;
import o.IBannerWebViewClientListener;
import o._get_messageWebView_lambda1;
import o.access900;
import o.clipCanvasToPath;
import o.createBannerWebViewClientListenerandroid_sdk_ui_release;
import o.formatQueryBundleForLoglambda0;
import o.getChildStepIteratorandroid_sdk_ui_release;
import o.getNavigationEventDispatcher;
import o.handleCardClicklambda4;
import o.logHtmlClicklambda0;
import o.openUriWithActionView;
import o.r8lambdaL32xCEzW71g2Xzeh1NM3NImxco;
import o.r8lambdaaCm2JcMru73kJeywi54SW2Mni8U;
import o.r8lambdagMOkLYZmBEc7ze6BrDiqOwxqh1E;
import o.r8lambdavNj85t1dyTHN_NO7j11TwIDJPDI;
import o.requestLocationInitialization;
import o.retryInAppMessageandroid_sdk_base_release;
import o.schedulePushDeliveryandroid_sdk_base_release;
import o.setRegistrationDataProviderandroid_sdk_base_release;
import okhttp3.EventListener;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class SentryTracer$$ExternalSyntheticLambda1 implements Function, Consumer, getNavigationEventDispatcher, r8lambdagMOkLYZmBEc7ze6BrDiqOwxqh1E, r8lambdaaCm2JcMru73kJeywi54SW2Mni8U, read, MediaSessionCompatQueueItem, serializer, r8lambdavNj85t1dyTHN_NO7j11TwIDJPDI {
    private static int RemoteActionCompatParcelizer = 0;
    private static int write = 1;
    public final /* synthetic */ int IconCompatParcelizer;
    public final /* synthetic */ Object serializer;

    public /* synthetic */ SentryTracer$$ExternalSyntheticLambda1(int i, Object obj) {
        this.IconCompatParcelizer = i;
        this.serializer = obj;
    }

    @Override // o.r8lambdavNj85t1dyTHN_NO7j11TwIDJPDI
    public EventListener create(clipCanvasToPath clipcanvastopath) {
        EventListener eventListener;
        int i = 2 % 2;
        int i2 = write;
        int i3 = i2 + 73;
        RemoteActionCompatParcelizer = i3 % Fields.SpotShadowColor;
        if (i3 % 2 != 0) {
            eventListener = (EventListener) this.serializer;
            int i4 = 65 / 0;
        } else {
            eventListener = (EventListener) this.serializer;
        }
        int i5 = i2 + 97;
        RemoteActionCompatParcelizer = i5 % Fields.SpotShadowColor;
        int i6 = i5 % 2;
        return eventListener;
    }

    public /* synthetic */ SentryTracer$$ExternalSyntheticLambda1(Object obj, int i, Object obj2) {
        this.IconCompatParcelizer = i;
        this.serializer = obj2;
    }

    @Override // io.sentry.util.network.serializer
    public NetworkBody read(Object obj) {
        NetworkBody networkBodyRemoteActionCompatParcelizer;
        int i = 2 % 2;
        int i2 = write + 91;
        RemoteActionCompatParcelizer = i2 % Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            networkBodyRemoteActionCompatParcelizer = RemoteActionCompatParcelizer.RemoteActionCompatParcelizer((RemoteActionCompatParcelizer) this.serializer, (_get_messageWebView_lambda1) obj);
            int i3 = 77 / 0;
        } else {
            networkBodyRemoteActionCompatParcelizer = RemoteActionCompatParcelizer.RemoteActionCompatParcelizer((RemoteActionCompatParcelizer) this.serializer, (_get_messageWebView_lambda1) obj);
        }
        int i4 = write + 103;
        RemoteActionCompatParcelizer = i4 % Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return networkBodyRemoteActionCompatParcelizer;
    }

    @Override // io.reactivex.functions.Function
    public Object apply(Object obj) {
        int i = 2 % 2;
        int i2 = write + 97;
        RemoteActionCompatParcelizer = i2 % Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            MapApiError$$ExternalSyntheticLambda1 mapApiError$$ExternalSyntheticLambda1 = (MapApiError$$ExternalSyntheticLambda1) this.serializer;
            obj.getClass();
            Object obj2 = null;
            obj2.hashCode();
            throw null;
        }
        MapApiError$$ExternalSyntheticLambda1 mapApiError$$ExternalSyntheticLambda2 = (MapApiError$$ExternalSyntheticLambda1) this.serializer;
        obj.getClass();
        access900 access900Var = (access900) mapApiError$$ExternalSyntheticLambda2.invoke(obj);
        int i3 = write + 111;
        RemoteActionCompatParcelizer = i3 % Fields.SpotShadowColor;
        int i4 = i3 % 2;
        return access900Var;
    }

    @Override // io.reactivex.functions.Consumer
    public void accept(Object obj) throws Exception {
        int i = 2 % 2;
        int i2 = write + 45;
        RemoteActionCompatParcelizer = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        int i4 = this.IconCompatParcelizer;
        Object obj2 = this.serializer;
        if (i4 != 2) {
            ((MapApiError$$ExternalSyntheticLambda1) obj2).invoke(obj);
            return;
        }
        ((HomeFragment.AnonymousClass1) obj2).invoke(obj);
        int i5 = RemoteActionCompatParcelizer + 43;
        write = i5 % Fields.SpotShadowColor;
        int i6 = i5 % 2;
    }

    @Override // o.getNavigationEventDispatcher
    public void onActivityResult(Object obj) {
        int i = 2 % 2;
        WorkerWrapper.Builder builder = (WorkerWrapper.Builder) this.serializer;
        int i2 = ((ActivityResult) obj).write;
        if (i2 == -1) {
            ((requestLocationInitialization) builder.read).invoke();
            int i3 = RemoteActionCompatParcelizer + 29;
            write = i3 % Fields.SpotShadowColor;
            if (i3 % 2 == 0) {
                throw null;
            }
            return;
        }
        int i4 = write;
        int i5 = i4 + 81;
        RemoteActionCompatParcelizer = i5 % Fields.SpotShadowColor;
        if (i5 % 2 != 0) {
            throw null;
        }
        if (i2 == 0) {
            ((retryInAppMessageandroid_sdk_base_release) builder.MediaBrowserCompatMediaItem).invoke();
            return;
        }
        int i6 = i4 + 81;
        RemoteActionCompatParcelizer = i6 % Fields.SpotShadowColor;
        if (i6 % 2 != 0) {
            if (i2 != 98) {
                return;
            }
        } else if (i2 != 42) {
            return;
        }
        ((setRegistrationDataProviderandroid_sdk_base_release) ((schedulePushDeliveryandroid_sdk_base_release) builder.MediaSessionCompatQueueItem)).write();
        int i7 = write + 9;
        RemoteActionCompatParcelizer = i7 % Fields.SpotShadowColor;
        int i8 = i7 % 2;
    }

    @Override // o.r8lambdagMOkLYZmBEc7ze6BrDiqOwxqh1E
    public void serializer(IBannerWebViewClientListener iBannerWebViewClientListener) {
        ListIterator listIterator;
        int i = 2 % 2;
        formatQueryBundleForLoglambda0 formatquerybundleforloglambda0 = (formatQueryBundleForLoglambda0) this.serializer;
        openUriWithActionView openuriwithactionview = formatquerybundleforloglambda0.RemoteActionCompatParcelizer;
        if (openuriwithactionview != null) {
            openuriwithactionview.write(iBannerWebViewClientListener);
        }
        BannerWebViewClient bannerWebViewClient = formatquerybundleforloglambda0.MediaSessionCompatQueueItem;
        handleCardClicklambda4 handlecardclicklambda4 = formatquerybundleforloglambda0.ComponentActivity;
        if (handlecardclicklambda4.MediaDescriptionCompat == null) {
            if (bannerWebViewClient.serializer) {
                formatquerybundleforloglambda0.write(bannerWebViewClient.read, (createBannerWebViewClientListenerandroid_sdk_ui_release) null);
                return;
            }
            return;
        }
        int i2 = write + 81;
        RemoteActionCompatParcelizer = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        if (handlecardclicklambda4.MediaSessionCompatQueueItem) {
            int i4 = RemoteActionCompatParcelizer + 41;
            write = i4 % Fields.SpotShadowColor;
            if (i4 % 2 == 0) {
                listIterator = formatquerybundleforloglambda0.IconCompatParcelizer.listIterator();
                int i5 = 20 / 0;
            } else {
                listIterator = formatquerybundleforloglambda0.IconCompatParcelizer.listIterator();
            }
            while (listIterator.hasNext()) {
                IBannerWebViewClientListener iBannerWebViewClientListener2 = (IBannerWebViewClientListener) listIterator.next();
                if (!iBannerWebViewClientListener2.write && iBannerWebViewClientListener2.MediaSessionCompatResultReceiverWrapper == null) {
                    return;
                }
            }
        }
        formatquerybundleforloglambda0.MediaSessionCompatResultReceiverWrapper();
    }

    @Override // o.r8lambdaaCm2JcMru73kJeywi54SW2Mni8U
    public void write(BrazeActionUtils brazeActionUtils) {
        logHtmlClicklambda0 loghtmlclicklambda0R8lambdaXj9c8VIP9DfEvaTmZt0ejAuC4a4;
        int i = 2 % 2;
        int i2 = write + 107;
        RemoteActionCompatParcelizer = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        int i4 = this.IconCompatParcelizer;
        Object obj = this.serializer;
        if (i4 == 6) {
            brazeActionUtils.RemoteActionCompatParcelizer(new JankStatsFrameTracker$$ExternalSyntheticLambda3((getChildStepIteratorandroid_sdk_ui_release) obj, 20, brazeActionUtils));
            return;
        }
        if (i4 == 9) {
            AtomicLong atomicLong = ((addObserverForBackInvokerlambda0) obj).IconCompatParcelizer;
            if (atomicLong.get() != 0 || (loghtmlclicklambda0R8lambdaXj9c8VIP9DfEvaTmZt0ejAuC4a4 = brazeActionUtils.r8lambdaXj9c8VIP9DfEvaTmZt0ejAuC4a4()) == null || loghtmlclicklambda0R8lambdaXj9c8VIP9DfEvaTmZt0ejAuC4a4.IconCompatParcelizer() == null) {
                return;
            }
            atomicLong.set(loghtmlclicklambda0R8lambdaXj9c8VIP9DfEvaTmZt0ejAuC4a4.IconCompatParcelizer().getTime());
            return;
        }
        AtomicBoolean atomicBoolean = (AtomicBoolean) obj;
        logHtmlClicklambda0 loghtmlclicklambda0R8lambdaXj9c8VIP9DfEvaTmZt0ejAuC4a5 = brazeActionUtils.r8lambdaXj9c8VIP9DfEvaTmZt0ejAuC4a4();
        if (loghtmlclicklambda0R8lambdaXj9c8VIP9DfEvaTmZt0ejAuC4a5 != null && loghtmlclicklambda0R8lambdaXj9c8VIP9DfEvaTmZt0ejAuC4a5.IconCompatParcelizer() != null) {
            atomicBoolean.set(true);
        }
        int i5 = RemoteActionCompatParcelizer + 33;
        write = i5 % Fields.SpotShadowColor;
        if (i5 % 2 == 0) {
            int i6 = 13 / 0;
        }
    }

    @Override // io.sentry.util.runtime.read
    public Object A_() {
        int i = 2 % 2;
        int i2 = write + 51;
        RemoteActionCompatParcelizer = i2 % Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        int i3 = this.IconCompatParcelizer;
        Object obj2 = this.serializer;
        if (i3 != 7) {
            return createFullyDrawnExecutor.read(((_init_lambda4) obj2).serializer);
        }
        String str = createFullyDrawnExecutor.read(((_init_lambda1) obj2).write);
        int i4 = RemoteActionCompatParcelizer + 125;
        write = i4 % Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return str;
    }

    @Override // io.sentry.util.MediaSessionCompatQueueItem
    public Object evaluate() {
        Object remoteActionCompatParcelizer;
        io.sentry.cache.tape.MediaSessionCompatQueueItem mediaSessionCompatQueueItem;
        int i = 2 % 2;
        int i2 = write + 79;
        RemoteActionCompatParcelizer = i2 % Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        int i3 = this.IconCompatParcelizer;
        Object obj2 = this.serializer;
        int i4 = 11;
        if (i3 == 11) {
            return ((io.sentry.cache.RemoteActionCompatParcelizer) obj2).MediaMetadataCompat.getSerializer();
        }
        if (i3 != 12) {
            return Boolean.valueOf(MediaBrowserCompatMediaItem.write((BrazeActionParserExternalSyntheticLambda0) obj2, "androidx.core.app.FrameMetricsAggregator"));
        }
        MediaMetadataCompat mediaMetadataCompat = (MediaMetadataCompat) obj2;
        SentryOptions sentryOptions = mediaMetadataCompat.IconCompatParcelizer;
        File fileIconCompatParcelizer = IconCompatParcelizer.IconCompatParcelizer(sentryOptions, ".scope-cache");
        if (fileIconCompatParcelizer == null) {
            sentryOptions.getLogger().IconCompatParcelizer(r8lambdaL32xCEzW71g2Xzeh1NM3NImxco.INFO, "Cache dir is not set, cannot store in scope cache", new Object[0]);
            remoteActionCompatParcelizer = new io.sentry.cache.tape.RemoteActionCompatParcelizer();
        } else {
            File file = new File(fileIconCompatParcelizer, "breadcrumbs.json");
            try {
                try {
                    int maxBreadcrumbs = sentryOptions.getMaxBreadcrumbs();
                    RandomAccessFile randomAccessFileWrite = io.sentry.cache.tape.MediaSessionCompatQueueItem.write(file);
                    try {
                        mediaSessionCompatQueueItem = new io.sentry.cache.tape.MediaSessionCompatQueueItem(file, randomAccessFileWrite, maxBreadcrumbs);
                        int i5 = write + 5;
                        RemoteActionCompatParcelizer = i5 % Fields.SpotShadowColor;
                        int i6 = i5 % 2;
                    } catch (Throwable th) {
                        randomAccessFileWrite.close();
                        throw th;
                    }
                } catch (IOException unused) {
                    file.delete();
                    int maxBreadcrumbs2 = sentryOptions.getMaxBreadcrumbs();
                    RandomAccessFile randomAccessFileWrite2 = io.sentry.cache.tape.MediaSessionCompatQueueItem.write(file);
                    try {
                        mediaSessionCompatQueueItem = new io.sentry.cache.tape.MediaSessionCompatQueueItem(file, randomAccessFileWrite2, maxBreadcrumbs2);
                    } catch (Throwable th2) {
                        randomAccessFileWrite2.close();
                        throw th2;
                    }
                }
                remoteActionCompatParcelizer = new io.sentry.cache.tape.IconCompatParcelizer(mediaSessionCompatQueueItem, new JsonObjectSerializer(i4, mediaMetadataCompat));
            } catch (IOException e) {
                sentryOptions.getLogger().serializer(r8lambdaL32xCEzW71g2Xzeh1NM3NImxco.ERROR, "Failed to create breadcrumbs queue", e);
                remoteActionCompatParcelizer = new io.sentry.cache.tape.RemoteActionCompatParcelizer();
            }
        }
        int i7 = write + 49;
        RemoteActionCompatParcelizer = i7 % Fields.SpotShadowColor;
        if (i7 % 2 != 0) {
            int i8 = 87 / 0;
        }
        return remoteActionCompatParcelizer;
    }
}
