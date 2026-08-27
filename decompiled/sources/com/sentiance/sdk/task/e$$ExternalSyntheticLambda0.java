package com.sentiance.sdk.task;

import android.app.Activity;
import android.graphics.Bitmap;
import android.os.SystemClock;
import android.util.Log;
import androidx.core.app.FrameMetricsAggregator;
import androidx.core.app.FrameMetricsAggregator$FrameMetricsApi24Impl$1;
import androidx.lifecycle.ProcessLifecycleOwner;
import androidx.work.impl.WorkerWrapper;
import com.huawei.hmf.tasks.a.d$a;
import com.huawei.hms.framework.common.ContainerUtils;
import com.mapbox.search.base.location.LocationEngineAdapter;
import com.sentiance.sdk.ResetCallback;
import com.sentiance.sdk.payload.submission.PayloadSubmitter;
import com.sentiance.sdk.status.a;
import com.sentiance.sdk.usercontext.UserContextProvider;
import io.grpc.internal.CallTracer;
import io.sentry.SentryOptions;
import io.sentry.ShutdownHookIntegration;
import io.sentry.android.core.ANRWatchDog;
import io.sentry.android.core.AndroidProfiler;
import io.sentry.android.core.SystemEventsBreadcrumbsIntegration;
import io.sentry.android.core.performance.AppStartMetrics;
import io.sentry.android.core.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg;
import io.sentry.android.core.r8lambdaXj9c8VIP9DfEvaTmZt0ejAuC4a4;
import io.sentry.android.core.serializer;
import io.sentry.android.replay.MediaBrowserCompatMediaItem;
import io.sentry.android.replay.MediaDescriptionCompat;
import io.sentry.android.replay.MediaSessionCompatResultReceiverWrapper;
import io.sentry.android.replay.ReplayIntegration;
import io.sentry.android.replay.capture.MediaSessionCompatQueueItem;
import io.sentry.android.replay.capture.RatingCompat;
import io.sentry.android.replay.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY;
import io.sentry.android.replay.r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28;
import io.sentry.android.replay.read;
import io.sentry.logger.IconCompatParcelizer;
import io.sentry.metrics.MetricsBatchProcessor;
import io.sentry.util.MediaMetadataCompat;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FilenameFilter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.StringReader;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import kotlin.TuplesKt;
import kotlin.io.TextStreamsKt;
import o.BannerDismissSnapshot;
import o.BannersDataStoreProviderCompanionExternalSyntheticLambda3;
import o.BrazeContentCardsManagerCompanion;
import o.accessgetDismissSubscriberp;
import o.accesshandlePush;
import o.ensureSubscribedToInAppMessageEvents;
import o.getPendingWebViewPauseRunnableandroid_sdk_ui_release;
import o.hideCurrentlyDisplayingInAppMessage;
import o.instance_delegatelambda0;
import o.isAutomaticGeofenceRequestsEnabled;
import o.markPageFinished;
import o.migrateBlocklistedLists;
import o.onContentCardDismissed;
import o.onOtherUrlActionlambda1;
import o.onRenderProcessGonelambda0;
import o.onViewDetachedFromWindowlambda1;
import o.pauseWebviewIfNecessarylambda10;
import o.r8lambda7AJnrvTmYNN7kSbgXUEYtB0Niyw;
import o.r8lambdaL32xCEzW71g2Xzeh1NM3NImxco;
import o.r8lambdaNhlkRWz5iIYpTs8A0990satz5JA;
import o.r8lambdaU31FnmCtqQics3i75Jr9dkZcEk;
import o.r8lambdad6Kv_zcyXwF_MBclQy2CZKzTblI;
import o.r8lambdauOsl1OJcz1lNCaioOGlfrBn5pcg;
import o.readDatalambda0;
import o.removeNodeAtDepth;
import o.requestDisplayInAppMessagelambda4;
import o.setBrazeDeeplinkHandler;
import o.setCarryoverInAppMessage;
import o.setIsHtmlInAppMessageHtmlLinkTargetEnabled;
import o.setNativeShader;
import o.sourceInformationContextOfdefault;
import o.writeandroid_sdk_base_release;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class e$$ExternalSyntheticLambda0 implements Runnable {
    public final /* synthetic */ Object read;
    public final /* synthetic */ int serializer;

    public /* synthetic */ e$$ExternalSyntheticLambda0(r8lambdaXj9c8VIP9DfEvaTmZt0ejAuC4a4 r8lambdaxj9c8vip9dfevatmzt0ejauc4a4, r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg r8lambdaquuwrpysdd6n6dd7wraaa0s4oxg) {
        this.serializer = 19;
        this.read = r8lambdaquuwrpysdd6n6dd7wraaa0s4oxg;
    }

    /* JADX WARN: Code duplicated, block: B:137:0x02e1  */
    /* JADX WARN: Code duplicated, block: B:141:0x0321  */
    /* JADX WARN: Code duplicated, block: B:142:0x0328  */
    /* JADX WARN: Code duplicated, block: B:144:0x032c  */
    /* JADX WARN: Code duplicated, block: B:146:0x0338  */
    /* JADX WARN: Code duplicated, block: B:147:0x033d  */
    /* JADX WARN: Code duplicated, block: B:150:0x0345  */
    /* JADX WARN: Code duplicated, block: B:152:0x0380  */
    /* JADX WARN: Code duplicated, block: B:153:0x0393  */
    /* JADX WARN: Code duplicated, block: B:155:0x039b  */
    /* JADX WARN: Code duplicated, block: B:157:0x03a2  */
    @Override // java.lang.Runnable
    public final void run() throws IOException {
        File file;
        Date dateIconCompatParcelizer;
        onOtherUrlActionlambda1 onotherurlactionlambda1ValueOf;
        Iterable linkedList;
        read readVar;
        SentryOptions sentryOptions;
        Object objRemoteActionCompatParcelizer;
        List list;
        accessgetDismissSubscriberp accessgetdismisssubscriberp;
        SentryOptions sentryOptions2;
        MediaSessionCompatQueueItem mediaSessionCompatQueueItemIconCompatParcelizer;
        ReplayIntegration replayIntegration;
        Field field;
        int i = 5;
        switch (this.serializer) {
            case 0:
                readDatalambda0.read((readDatalambda0) this.read);
                return;
            case 1:
                PayloadSubmitter.serializer((PayloadSubmitter) this.read);
                return;
            case 2:
                accesshandlePush.write((accesshandlePush) this.read);
                return;
            case 3:
                ((ResetCallback) this.read).onResetSuccess();
                return;
            case 4:
                a.read((a) this.read);
                return;
            case 5:
                BannersDataStoreProviderCompanionExternalSyntheticLambda3.write((BannersDataStoreProviderCompanionExternalSyntheticLambda3) this.read);
                return;
            case 6:
                writeandroid_sdk_base_release.RemoteActionCompatParcelizer((writeandroid_sdk_base_release) this.read);
                return;
            case 7:
                ((r8lambdad6Kv_zcyXwF_MBclQy2CZKzTblI) this.read).read();
                return;
            case 8:
                UserContextProvider.RemoteActionCompatParcelizer((UserContextProvider) this.read);
                return;
            case 9:
                migrateBlocklistedLists migrateblocklistedlists = (migrateBlocklistedLists) this.read;
                migrateblocklistedlists.getClass();
                ((accesshandlePush) migrateblocklistedlists).write();
                return;
            case 10:
                r8lambdaNhlkRWz5iIYpTs8A0990satz5JA.RemoteActionCompatParcelizer((r8lambdaNhlkRWz5iIYpTs8A0990satz5JA) this.read);
                return;
            case 11:
                ((getPendingWebViewPauseRunnableandroid_sdk_ui_release) this.read).invoke();
                return;
            case 12:
                ((setBrazeDeeplinkHandler) this.read).RemoteActionCompatParcelizer();
                return;
            case 13:
                markPageFinished markpagefinished = ((onRenderProcessGonelambda0) this.read).read;
                markpagefinished.RatingCompat.IconCompatParcelizer(new isAutomaticGeofenceRequestsEnabled(18, markpagefinished));
                return;
            case 14:
                ShutdownHookIntegration shutdownHookIntegration = (ShutdownHookIntegration) this.read;
                shutdownHookIntegration.IconCompatParcelizer.removeShutdownHook(shutdownHookIntegration.serializer);
                return;
            case 15:
                ANRWatchDog aNRWatchDog = (ANRWatchDog) this.read;
                aNRWatchDog.write = SystemClock.uptimeMillis();
                aNRWatchDog.MediaDescriptionCompat.set(false);
                return;
            case 16:
                r8lambdaU31FnmCtqQics3i75Jr9dkZcEk r8lambdau31fnmctqqics3i75jr9dkzcek = ((FrameMetricsAggregator) ((MediaMetadataCompat) ((WorkerWrapper.Builder) this.read).write).IconCompatParcelizer()).serializer;
                ArrayList arrayList = (ArrayList) r8lambdau31fnmctqqics3i75jr9dkzcek.read;
                for (int size = arrayList.size() - 1; size >= 0; size--) {
                    WeakReference weakReference = (WeakReference) arrayList.get(size);
                    Activity activity = (Activity) weakReference.get();
                    if (weakReference.get() != null) {
                        activity.getWindow().removeOnFrameMetricsAvailableListener((FrameMetricsAggregator$FrameMetricsApi24Impl$1) r8lambdau31fnmctqqics3i75jr9dkzcek.write);
                        arrayList.remove(size);
                    }
                }
                return;
            case 17:
                ((serializer) this.read).serializer(true);
                return;
            case 18:
                ((AndroidProfiler) this.read).serializer(null, true);
                return;
            case 19:
                r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg r8lambdaquuwrpysdd6n6dd7wraaa0s4oxg = (r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg) this.read;
                if (r8lambdaquuwrpysdd6n6dd7wraaa0s4oxg != null) {
                    ProcessLifecycleOwner.IconCompatParcelizer.RatingCompat.read(r8lambdaquuwrpysdd6n6dd7wraaa0s4oxg);
                    return;
                }
                return;
            case 20:
                ((SystemEventsBreadcrumbsIntegration) this.read).serializer();
                return;
            case 21:
                AppStartMetrics.RemoteActionCompatParcelizer((AppStartMetrics) ((d$a) this.read).write);
                return;
            case 22:
                ReplayIntegration replayIntegration2 = (ReplayIntegration) this.read;
                SentryOptions sentryOptions3 = replayIntegration2.MediaSessionCompatResultReceiverWrapper;
                if (sentryOptions3 == null) {
                    removeNodeAtDepth.serializer("options");
                    throw null;
                }
                io.sentry.cache.MediaMetadataCompat mediaMetadataCompatFindPersistingScopeObserver = sentryOptions3.findPersistingScopeObserver();
                if (mediaMetadataCompatFindPersistingScopeObserver != null) {
                    SentryOptions sentryOptions4 = replayIntegration2.MediaSessionCompatResultReceiverWrapper;
                    if (sentryOptions4 == null) {
                        removeNodeAtDepth.serializer("options");
                        throw null;
                    }
                    String str = (String) mediaMetadataCompatFindPersistingScopeObserver.RemoteActionCompatParcelizer(sentryOptions4, "replay.json", String.class);
                    if (str != null) {
                        io.sentry.protocol.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg r8lambdaquuwrpysdd6n6dd7wraaa0s4oxg2 = new io.sentry.protocol.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg(str);
                        if (r8lambdaquuwrpysdd6n6dd7wraaa0s4oxg2.equals(io.sentry.protocol.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg.serializer)) {
                            replayIntegration2.serializer("");
                            return;
                        }
                        SentryOptions sentryOptions5 = replayIntegration2.MediaSessionCompatResultReceiverWrapper;
                        if (sentryOptions5 == null) {
                            removeNodeAtDepth.serializer("options");
                            throw null;
                        }
                        String cacheDirPath = sentryOptions5.getCacheDirPath();
                        if (cacheDirPath == null || cacheDirPath.length() == 0) {
                            sentryOptions5.getLogger().IconCompatParcelizer(r8lambdaL32xCEzW71g2Xzeh1NM3NImxco.WARNING, "SentryOptions.cacheDirPath is not set, session replay is no-op", new Object[0]);
                            file = null;
                        } else {
                            String cacheDirPath2 = sentryOptions5.getCacheDirPath();
                            cacheDirPath2.getClass();
                            file = new File(cacheDirPath2, "replay_" + r8lambdaquuwrpysdd6n6dd7wraaa0s4oxg2);
                            file.mkdirs();
                        }
                        File file2 = new File(file, ".ongoing_segment");
                        if (file2.exists()) {
                            LinkedHashMap linkedHashMap = new LinkedHashMap();
                            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream(file2), ensureSubscribedToInAppMessageEvents.write), 8192);
                            try {
                                Iterator it = ((requestDisplayInAppMessagelambda4) TextStreamsKt.write(bufferedReader)).iterator();
                                while (it.hasNext()) {
                                    List listSerializer = hideCurrentlyDisplayingInAppMessage.serializer((String) it.next(), new String[]{ContainerUtils.KEY_VALUE_DELIMITER}, 2);
                                    linkedHashMap.put((String) listSerializer.get(0), (String) listSerializer.get(1));
                                }
                                bufferedReader.close();
                                String str2 = (String) linkedHashMap.get("config.height");
                                Integer numMediaSessionCompatQueueItem = str2 != null ? setCarryoverInAppMessage.MediaSessionCompatQueueItem(10, str2) : null;
                                String str3 = (String) linkedHashMap.get("config.width");
                                Integer numMediaSessionCompatQueueItem2 = str3 != null ? setCarryoverInAppMessage.MediaSessionCompatQueueItem(10, str3) : null;
                                String str4 = (String) linkedHashMap.get("config.frame-rate");
                                Integer numMediaSessionCompatQueueItem3 = str4 != null ? setCarryoverInAppMessage.MediaSessionCompatQueueItem(10, str4) : null;
                                String str5 = (String) linkedHashMap.get("config.bit-rate");
                                Integer numMediaSessionCompatQueueItem4 = str5 != null ? setCarryoverInAppMessage.MediaSessionCompatQueueItem(10, str5) : null;
                                String str6 = (String) linkedHashMap.get("segment.id");
                                Integer numMediaSessionCompatQueueItem5 = str6 != null ? setCarryoverInAppMessage.MediaSessionCompatQueueItem(10, str6) : null;
                                try {
                                    String str7 = (String) linkedHashMap.get("segment.timestamp");
                                    if (str7 == null) {
                                        str7 = "";
                                    }
                                    dateIconCompatParcelizer = setNativeShader.write(str7);
                                } catch (Throwable unused) {
                                    dateIconCompatParcelizer = null;
                                }
                                try {
                                    String str8 = (String) linkedHashMap.get("replay.type");
                                    if (str8 == null) {
                                        str8 = "";
                                    }
                                    onotherurlactionlambda1ValueOf = onOtherUrlActionlambda1.valueOf(str8);
                                } catch (Throwable unused2) {
                                    onotherurlactionlambda1ValueOf = null;
                                }
                                if (numMediaSessionCompatQueueItem != null && numMediaSessionCompatQueueItem2 != null && numMediaSessionCompatQueueItem3 != null && numMediaSessionCompatQueueItem4 != null && numMediaSessionCompatQueueItem5 != null && numMediaSessionCompatQueueItem5.intValue() != -1 && dateIconCompatParcelizer != null && onotherurlactionlambda1ValueOf != null) {
                                    io.sentry.android.replay.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg r8lambdaquuwrpysdd6n6dd7wraaa0s4oxg3 = new io.sentry.android.replay.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg(numMediaSessionCompatQueueItem2.intValue(), numMediaSessionCompatQueueItem.intValue(), 1.0f, 1.0f, numMediaSessionCompatQueueItem3.intValue(), numMediaSessionCompatQueueItem4.intValue());
                                    final MediaBrowserCompatMediaItem mediaBrowserCompatMediaItem = new MediaBrowserCompatMediaItem(sentryOptions5, r8lambdaquuwrpysdd6n6dd7wraaa0s4oxg2);
                                    ArrayList arrayList2 = mediaBrowserCompatMediaItem.write;
                                    File fileIconCompatParcelizer = mediaBrowserCompatMediaItem.IconCompatParcelizer();
                                    if (fileIconCompatParcelizer != null) {
                                        fileIconCompatParcelizer.listFiles(new FilenameFilter() { // from class: io.sentry.android.replay.MediaMetadataCompat
                                            @Override // java.io.FilenameFilter
                                            public final boolean accept(File file3, String str9) {
                                                str9.getClass();
                                                if (setCarryoverInAppMessage.read(str9, ".jpg", false)) {
                                                    File file4 = new File(file3, str9);
                                                    String name = file4.getName();
                                                    name.getClass();
                                                    int iWrite = hideCurrentlyDisplayingInAppMessage.write(6, name, ".");
                                                    if (iWrite != -1) {
                                                        name = name.substring(0, iWrite);
                                                    }
                                                    Long lParcelableVolumeInfo = setCarryoverInAppMessage.ParcelableVolumeInfo(name);
                                                    if (lParcelableVolumeInfo != null) {
                                                        mediaBrowserCompatMediaItem.serializer(file4, lParcelableVolumeInfo.longValue(), null);
                                                    }
                                                }
                                                return false;
                                            }
                                        });
                                    }
                                    if (arrayList2.isEmpty()) {
                                        sentryOptions5.getLogger().IconCompatParcelizer(r8lambdaL32xCEzW71g2Xzeh1NM3NImxco.DEBUG, "No frames found for replay: %s, deleting the replay", r8lambdaquuwrpysdd6n6dd7wraaa0s4oxg2);
                                        TuplesKt.serializer(file);
                                    } else {
                                        if (arrayList2.size() > 1) {
                                            BrazeContentCardsManagerCompanion.write(arrayList2, new setIsHtmlInAppMessageHtmlLinkTargetEnabled(4));
                                        }
                                        onOtherUrlActionlambda1 onotherurlactionlambda1 = onOtherUrlActionlambda1.SESSION;
                                        int iIntValue = onotherurlactionlambda1ValueOf == onotherurlactionlambda1 ? numMediaSessionCompatQueueItem5.intValue() : 0;
                                        if (onotherurlactionlambda1ValueOf != onotherurlactionlambda1) {
                                            dateIconCompatParcelizer = setNativeShader.IconCompatParcelizer(((MediaDescriptionCompat) onContentCardDismissed.read((List) arrayList2)).RemoteActionCompatParcelizer);
                                            dateIconCompatParcelizer.getClass();
                                        }
                                        Date date = dateIconCompatParcelizer;
                                        long j = ((MediaDescriptionCompat) onContentCardDismissed.MediaDescriptionCompat((List) arrayList2)).RemoteActionCompatParcelizer;
                                        long time = date.getTime();
                                        long jIntValue = 1000 / numMediaSessionCompatQueueItem3.intValue();
                                        String str9 = (String) linkedHashMap.get("replay.recording");
                                        if (str9 == null) {
                                            linkedList = instance_delegatelambda0.write;
                                        } else {
                                            BannerDismissSnapshot bannerDismissSnapshot = (BannerDismissSnapshot) sentryOptions5.getSerializer().write(new StringReader(str9), BannerDismissSnapshot.class);
                                            if ((bannerDismissSnapshot != null ? bannerDismissSnapshot.write : null) != null) {
                                                List list2 = bannerDismissSnapshot.write;
                                                list2.getClass();
                                                linkedList = new LinkedList(list2);
                                            } else {
                                                linkedList = null;
                                            }
                                            if (linkedList == null) {
                                                linkedList = instance_delegatelambda0.write;
                                            }
                                        }
                                        readVar = new read(r8lambdaquuwrpysdd6n6dd7wraaa0s4oxg3, mediaBrowserCompatMediaItem, date, iIntValue, (j - time) + jIntValue, onotherurlactionlambda1ValueOf, (String) linkedHashMap.get("replay.screen-at-start"), onContentCardDismissed.serializer(linkedList, new setIsHtmlInAppMessageHtmlLinkTargetEnabled(5)));
                                    }
                                    if (readVar == null) {
                                        replayIntegration2.serializer("");
                                        return;
                                    }
                                    sentryOptions = replayIntegration2.MediaSessionCompatResultReceiverWrapper;
                                    if (sentryOptions != null) {
                                        removeNodeAtDepth.serializer("options");
                                        throw null;
                                    }
                                    objRemoteActionCompatParcelizer = mediaMetadataCompatFindPersistingScopeObserver.RemoteActionCompatParcelizer(sentryOptions, "breadcrumbs.json", List.class);
                                    if (objRemoteActionCompatParcelizer instanceof List) {
                                        list = (List) objRemoteActionCompatParcelizer;
                                    } else {
                                        list = null;
                                    }
                                    accessgetdismisssubscriberp = replayIntegration2.ComponentActivity;
                                    sentryOptions2 = replayIntegration2.MediaSessionCompatResultReceiverWrapper;
                                    if (sentryOptions2 != null) {
                                        removeNodeAtDepth.serializer("options");
                                        throw null;
                                    }
                                    long j2 = readVar.read;
                                    Date date2 = readVar.MediaMetadataCompat;
                                    int i2 = readVar.serializer;
                                    io.sentry.android.replay.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg r8lambdaquuwrpysdd6n6dd7wraaa0s4oxg4 = readVar.RemoteActionCompatParcelizer;
                                    mediaSessionCompatQueueItemIconCompatParcelizer = io.sentry.android.replay.capture.MediaBrowserCompatMediaItem.IconCompatParcelizer(accessgetdismisssubscriberp, sentryOptions2, j2, date2, r8lambdaquuwrpysdd6n6dd7wraaa0s4oxg2, i2, r8lambdaquuwrpysdd6n6dd7wraaa0s4oxg4.RemoteActionCompatParcelizer, r8lambdaquuwrpysdd6n6dd7wraaa0s4oxg4.serializer, readVar.MediaBrowserCompatMediaItem, readVar.write, r8lambdaquuwrpysdd6n6dd7wraaa0s4oxg4.IconCompatParcelizer, r8lambdaquuwrpysdd6n6dd7wraaa0s4oxg4.read, readVar.MediaDescriptionCompat, list, new LinkedList(readVar.IconCompatParcelizer));
                                    if (mediaSessionCompatQueueItemIconCompatParcelizer instanceof RatingCompat) {
                                        replayIntegration = replayIntegration2;
                                        ((RatingCompat) mediaSessionCompatQueueItemIconCompatParcelizer).RemoteActionCompatParcelizer(replayIntegration.ComponentActivity, pauseWebviewIfNecessarylambda10.IconCompatParcelizer(new MediaSessionCompatResultReceiverWrapper()));
                                    } else {
                                        replayIntegration = replayIntegration2;
                                    }
                                    replayIntegration.serializer(str);
                                    return;
                                }
                                sentryOptions5.getLogger().IconCompatParcelizer(r8lambdaL32xCEzW71g2Xzeh1NM3NImxco.DEBUG, "Incorrect segment values found for replay: %s, deleting the replay", r8lambdaquuwrpysdd6n6dd7wraaa0s4oxg2);
                                TuplesKt.serializer(file);
                                break;
                            } catch (Throwable th) {
                                try {
                                    throw th;
                                } catch (Throwable th2) {
                                    r8lambda7AJnrvTmYNN7kSbgXUEYtB0Niyw.IconCompatParcelizer(871780641, sourceInformationContextOfdefault.read(), sourceInformationContextOfdefault.read(), -871780639, sourceInformationContextOfdefault.read(), new Object[]{bufferedReader, th}, sourceInformationContextOfdefault.read());
                                    throw th2;
                                }
                            }
                        } else {
                            sentryOptions5.getLogger().IconCompatParcelizer(r8lambdaL32xCEzW71g2Xzeh1NM3NImxco.DEBUG, "No ongoing segment found for replay: %s", r8lambdaquuwrpysdd6n6dd7wraaa0s4oxg2);
                            TuplesKt.serializer(file);
                        }
                        readVar = null;
                        if (readVar == null) {
                            replayIntegration2.serializer("");
                            return;
                        }
                        sentryOptions = replayIntegration2.MediaSessionCompatResultReceiverWrapper;
                        if (sentryOptions != null) {
                            removeNodeAtDepth.serializer("options");
                            throw null;
                        }
                        objRemoteActionCompatParcelizer = mediaMetadataCompatFindPersistingScopeObserver.RemoteActionCompatParcelizer(sentryOptions, "breadcrumbs.json", List.class);
                        if (objRemoteActionCompatParcelizer instanceof List) {
                            list = (List) objRemoteActionCompatParcelizer;
                        } else {
                            list = null;
                        }
                        accessgetdismisssubscriberp = replayIntegration2.ComponentActivity;
                        sentryOptions2 = replayIntegration2.MediaSessionCompatResultReceiverWrapper;
                        if (sentryOptions2 != null) {
                            removeNodeAtDepth.serializer("options");
                            throw null;
                        }
                        long j3 = readVar.read;
                        Date date3 = readVar.MediaMetadataCompat;
                        int i3 = readVar.serializer;
                        io.sentry.android.replay.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg r8lambdaquuwrpysdd6n6dd7wraaa0s4oxg5 = readVar.RemoteActionCompatParcelizer;
                        mediaSessionCompatQueueItemIconCompatParcelizer = io.sentry.android.replay.capture.MediaBrowserCompatMediaItem.IconCompatParcelizer(accessgetdismisssubscriberp, sentryOptions2, j3, date3, r8lambdaquuwrpysdd6n6dd7wraaa0s4oxg2, i3, r8lambdaquuwrpysdd6n6dd7wraaa0s4oxg5.RemoteActionCompatParcelizer, r8lambdaquuwrpysdd6n6dd7wraaa0s4oxg5.serializer, readVar.MediaBrowserCompatMediaItem, readVar.write, r8lambdaquuwrpysdd6n6dd7wraaa0s4oxg5.IconCompatParcelizer, r8lambdaquuwrpysdd6n6dd7wraaa0s4oxg5.read, readVar.MediaDescriptionCompat, list, new LinkedList(readVar.IconCompatParcelizer));
                        if (mediaSessionCompatQueueItemIconCompatParcelizer instanceof RatingCompat) {
                            replayIntegration = replayIntegration2;
                            ((RatingCompat) mediaSessionCompatQueueItemIconCompatParcelizer).RemoteActionCompatParcelizer(replayIntegration.ComponentActivity, pauseWebviewIfNecessarylambda10.IconCompatParcelizer(new MediaSessionCompatResultReceiverWrapper()));
                        } else {
                            replayIntegration = replayIntegration2;
                        }
                        replayIntegration.serializer(str);
                        return;
                    }
                }
                replayIntegration2.serializer("");
                return;
            case 23:
                r8lambda7IJBVrN0sHyidCAZufWEJFc7yY r8lambda7ijbvrn0shyidcazufwejfc7yy = (r8lambda7IJBVrN0sHyidCAZufWEJFc7yY) this.read;
                if (r8lambda7ijbvrn0shyidcazufwejfc7yy.write.get()) {
                    return;
                }
                LocationEngineAdapter.AnonymousClass1 anonymousClass1 = new LocationEngineAdapter.AnonymousClass1(i, r8lambda7ijbvrn0shyidcazufwejfc7yy);
                try {
                    Object objMediaSessionCompatResultReceiverWrapper = r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28.serializer.MediaSessionCompatResultReceiverWrapper();
                    if (objMediaSessionCompatResultReceiverWrapper == null || (field = (Field) r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28.write.MediaSessionCompatResultReceiverWrapper()) == null) {
                        return;
                    }
                    Object obj = field.get(objMediaSessionCompatResultReceiverWrapper);
                    obj.getClass();
                    field.set(objMediaSessionCompatResultReceiverWrapper, anonymousClass1.invoke((ArrayList) obj));
                    return;
                } catch (Throwable th3) {
                    Log.w("WindowManagerSpy", th3);
                    return;
                }
            case 24:
                r8lambdauOsl1OJcz1lNCaioOGlfrBn5pcg r8lambdauosl1ojcz1lncaiooglfrbn5pcg = (r8lambdauOsl1OJcz1lNCaioOGlfrBn5pcg) this.read;
                if (!((Bitmap) r8lambdauosl1ojcz1lncaiooglfrbn5pcg.MediaBrowserCompatMediaItem).isRecycled()) {
                    synchronized (((Bitmap) r8lambdauosl1ojcz1lncaiooglfrbn5pcg.MediaBrowserCompatMediaItem)) {
                        if (!((Bitmap) r8lambdauosl1ojcz1lncaiooglfrbn5pcg.MediaBrowserCompatMediaItem).isRecycled()) {
                            ((Bitmap) r8lambdauosl1ojcz1lncaiooglfrbn5pcg.MediaBrowserCompatMediaItem).recycle();
                        }
                        break;
                    }
                }
                if (((Bitmap) ((onViewDetachedFromWindowlambda1) r8lambdauosl1ojcz1lncaiooglfrbn5pcg.RatingCompat).MediaSessionCompatResultReceiverWrapper()).isRecycled()) {
                    return;
                }
                ((Bitmap) ((onViewDetachedFromWindowlambda1) r8lambdauosl1ojcz1lncaiooglfrbn5pcg.RatingCompat).MediaSessionCompatResultReceiverWrapper()).recycle();
                return;
            case 25:
                IconCompatParcelizer iconCompatParcelizer = (IconCompatParcelizer) this.read;
                iconCompatParcelizer.serializer.RemoteActionCompatParcelizer(iconCompatParcelizer.write.getShutdownTimeoutMillis());
                return;
            default:
                MetricsBatchProcessor metricsBatchProcessor = (MetricsBatchProcessor) this.read;
                ((CallTracer) metricsBatchProcessor.read).RemoteActionCompatParcelizer(((SentryOptions) metricsBatchProcessor.RemoteActionCompatParcelizer).getShutdownTimeoutMillis());
                return;
        }
    }

    public /* synthetic */ e$$ExternalSyntheticLambda0(int i, Object obj) {
        this.serializer = i;
        this.read = obj;
    }

    public /* synthetic */ e$$ExternalSyntheticLambda0(Object obj, int i, Object obj2) {
        this.serializer = i;
        this.read = obj;
    }
}
