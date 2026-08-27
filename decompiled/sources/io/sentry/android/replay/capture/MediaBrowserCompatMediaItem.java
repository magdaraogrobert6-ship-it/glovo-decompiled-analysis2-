package io.sentry.android.replay.capture;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.view.Surface;
import androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import com.google.android.gms.location.DeviceOrientationRequest;
import com.huawei.hms.push.constant.RemoteMessageConst;
import com.mapbox.navigation.core.MapboxNavigation$notification$1$1;
import com.sentiance.core.model.events.E$b;
import io.sentry.SentryOptions;
import io.sentry.android.replay.ReplayIntegration$$ExternalSyntheticLambda1;
import io.sentry.protocol.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg;
import io.sentry.protocol.r8lambdaXj9c8VIP9DfEvaTmZt0ejAuC4a4;
import io.sentry.rrweb.ComponentActivity;
import java.io.File;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.Deque;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArraySet;
import kotlin.TuplesKt;
import kotlin.ranges.RangesKt;
import o.AddToCustomAttributeArrayStep;
import o.BannerDismissSnapshot;
import o.UriActionExternalSyntheticLambda4;
import o.createInAppMessageEventSubscriber;
import o.dismisslambda0;
import o.getCieXyz;
import o.getDisplayingInAppMessageannotations;
import o.getIntentArrayWithConfiguredBackStacklambda1;
import o.instance_delegatelambda0;
import o.onContentCardDismissed;
import o.onCustomEventAction;
import o.onOtherUrlActionlambda1;
import o.onViewDetachedFromWindowlambda1;
import o.parseUseWebViewFromQueryBundle;
import o.pauseWebviewIfNecessarylambda10;
import o.r8lambdaL32xCEzW71g2Xzeh1NM3NImxco;
import o.removeNodeAtDepth;
import o.setNativeShader;
import okio.Okio;

/* JADX INFO: loaded from: classes4.dex */
public final class MediaBrowserCompatMediaItem {
    /* JADX WARN: Code duplicated, block: B:102:0x0212 A[Catch: all -> 0x0560, TryCatch #0 {all -> 0x0560, blocks: (B:97:0x0207, B:99:0x020b, B:100:0x020e, B:102:0x0212, B:105:0x021b, B:106:0x0224), top: B:213:0x0207 }] */
    /* JADX WARN: Code duplicated, block: B:104:0x021a  */
    /* JADX WARN: Code duplicated, block: B:105:0x021b A[Catch: all -> 0x0560, TryCatch #0 {all -> 0x0560, blocks: (B:97:0x0207, B:99:0x020b, B:100:0x020e, B:102:0x0212, B:105:0x021b, B:106:0x0224), top: B:213:0x0207 }] */
    /* JADX WARN: Code duplicated, block: B:110:0x023a  */
    /* JADX WARN: Code duplicated, block: B:112:0x0242  */
    /* JADX WARN: Code duplicated, block: B:114:0x024f  */
    /* JADX WARN: Code duplicated, block: B:116:0x025d  */
    /* JADX WARN: Code duplicated, block: B:120:0x02d9  */
    /* JADX WARN: Code duplicated, block: B:122:0x02e1  */
    /* JADX WARN: Code duplicated, block: B:124:0x030d  */
    /* JADX WARN: Code duplicated, block: B:126:0x031a  */
    /* JADX WARN: Code duplicated, block: B:129:0x0341  */
    /* JADX WARN: Code duplicated, block: B:131:0x0367  */
    /* JADX WARN: Code duplicated, block: B:136:0x0386  */
    /* JADX WARN: Code duplicated, block: B:139:0x0397 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:140:0x0399  */
    /* JADX WARN: Code duplicated, block: B:146:0x03be  */
    /* JADX WARN: Code duplicated, block: B:147:0x03c2  */
    /* JADX WARN: Code duplicated, block: B:149:0x03c5  */
    /* JADX WARN: Code duplicated, block: B:150:0x03c8  */
    /* JADX WARN: Code duplicated, block: B:153:0x03f1  */
    /* JADX WARN: Code duplicated, block: B:155:0x03f9  */
    /* JADX WARN: Code duplicated, block: B:157:0x03ff  */
    /* JADX WARN: Code duplicated, block: B:160:0x0404  */
    /* JADX WARN: Code duplicated, block: B:164:0x041c  */
    /* JADX WARN: Code duplicated, block: B:166:0x0446  */
    /* JADX WARN: Code duplicated, block: B:170:0x0463  */
    /* JADX WARN: Code duplicated, block: B:174:0x0478  */
    /* JADX WARN: Code duplicated, block: B:176:0x0490  */
    /* JADX WARN: Code duplicated, block: B:179:0x04ed  */
    /* JADX WARN: Code duplicated, block: B:180:0x04f0  */
    /* JADX WARN: Code duplicated, block: B:183:0x0510  */
    /* JADX WARN: Code duplicated, block: B:185:0x0538  */
    /* JADX WARN: Code duplicated, block: B:238:0x0415 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:239:0x0415 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:241:0x046f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:243:0x045d A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:246:0x01eb A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:78:0x01b4  */
    /* JADX WARN: Code duplicated, block: B:87:0x01da  */
    /* JADX WARN: Code duplicated, block: B:91:0x01e3 A[LOOP:2: B:44:0x0144->B:91:0x01e3, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:95:0x01f0  */
    /* JADX WARN: Code duplicated, block: B:96:0x0203  */
    /* JADX WARN: Code duplicated, block: B:99:0x020b A[Catch: all -> 0x0560, TryCatch #0 {all -> 0x0560, blocks: (B:97:0x0207, B:99:0x020b, B:100:0x020e, B:102:0x0212, B:105:0x021b, B:106:0x0224), top: B:213:0x0207 }] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v27 */
    /* JADX WARN: Type inference failed for: r0v28 */
    /* JADX WARN: Type inference failed for: r0v35 */
    /* JADX WARN: Type inference failed for: r0v36 */
    /* JADX WARN: Type inference failed for: r0v40, types: [java.util.Collection] */
    /* JADX WARN: Type inference failed for: r0v41 */
    /* JADX WARN: Type inference failed for: r0v50 */
    /* JADX WARN: Type inference failed for: r12v6 */
    /* JADX WARN: Type inference failed for: r12v7, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r12v9, types: [io.sentry.android.replay.MediaDescriptionCompat] */
    /* JADX WARN: Type inference failed for: r36v3, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r36v4 */
    /* JADX WARN: Type inference failed for: r36v5 */
    /* JADX WARN: Type inference failed for: r36v6 */
    /* JADX WARN: Type inference failed for: r5v15 */
    /* JADX WARN: Type inference failed for: r5v19 */
    /* JADX WARN: Type inference failed for: r5v24, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r5v88 */
    public static MediaSessionCompatQueueItem IconCompatParcelizer(AddToCustomAttributeArrayStep addToCustomAttributeArrayStep, SentryOptions sentryOptions, long j, Date date, r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg r8lambdaquuwrpysdd6n6dd7wraaa0s4oxg, int i, int i2, int i3, onOtherUrlActionlambda1 onotherurlactionlambda1, io.sentry.android.replay.MediaBrowserCompatMediaItem mediaBrowserCompatMediaItem, int i4, int i5, String str, List list, Deque deque) {
        ArrayList arrayListIconCompatParcelizer;
        getDisplayingInAppMessageannotations getdisplayinginappmessageannotations;
        int i6;
        UriActionExternalSyntheticLambda4 uriActionExternalSyntheticLambda4Serializer;
        E$b e$b;
        E$b e$b2;
        io.sentry.android.replay.IconCompatParcelizer iconCompatParcelizer;
        io.sentry.android.replay.video.write writeVar;
        long j2;
        ?? r12;
        ?? r0;
        ?? r5;
        UriActionExternalSyntheticLambda4 uriActionExternalSyntheticLambda4Serializer2;
        List<getIntentArrayWithConfiguredBackStacklambda1> list2;
        ArrayList arrayList;
        LinkedList linkedList;
        getIntentArrayWithConfiguredBackStacklambda1 getintentarraywithconfiguredbackstacklambda1;
        long time;
        MapboxNavigation$notification$1$1 mapboxNavigation$notification$1$1;
        Iterator it;
        HashMap map;
        r8lambdaXj9c8VIP9DfEvaTmZt0ejAuC4a4 sdkVersion;
        parseUseWebViewFromQueryBundle sessionReplay;
        String str2;
        io.sentry.rrweb.IconCompatParcelizer iconCompatParcelizer2;
        boolean z;
        io.sentry.rrweb.IconCompatParcelizer iconCompatParcelizerWrite;
        io.sentry.rrweb.serializer serializerVar;
        String str3;
        io.sentry.rrweb.serializer serializerVar2;
        ConcurrentHashMap concurrentHashMap;
        Object obj;
        Object obj2;
        createInAppMessageEventSubscriber createinappmessageeventsubscriber;
        sentryOptions.getClass();
        date.getClass();
        r8lambdaquuwrpysdd6n6dd7wraaa0s4oxg.getClass();
        onotherurlactionlambda1.getClass();
        if (mediaBrowserCompatMediaItem != null) {
            SentryOptions sentryOptions2 = mediaBrowserCompatMediaItem.RatingCompat;
            long jMin = Math.min(j, 300000L);
            long time2 = date.getTime();
            File file = new File(mediaBrowserCompatMediaItem.IconCompatParcelizer(), i + ".mp4");
            io.sentry.util.RemoteActionCompatParcelizer remoteActionCompatParcelizer = mediaBrowserCompatMediaItem.read;
            io.sentry.util.RemoteActionCompatParcelizer remoteActionCompatParcelizer2 = mediaBrowserCompatMediaItem.RemoteActionCompatParcelizer;
            ArrayList arrayList2 = mediaBrowserCompatMediaItem.write;
            long j3 = 0;
            if (file.exists() && file.length() > 0) {
                file.delete();
            }
            UriActionExternalSyntheticLambda4 uriActionExternalSyntheticLambda4Serializer3 = remoteActionCompatParcelizer.serializer();
            try {
                if (arrayList2.isEmpty()) {
                    arrayListIconCompatParcelizer = new ArrayList();
                } else {
                    arrayListIconCompatParcelizer = onContentCardDismissed.IconCompatParcelizer((Collection) arrayList2);
                }
                ArrayList arrayList3 = arrayListIconCompatParcelizer;
                Okio.RemoteActionCompatParcelizer(uriActionExternalSyntheticLambda4Serializer3, null);
                if (arrayList3.isEmpty()) {
                    sentryOptions2.getLogger().IconCompatParcelizer(r8lambdaL32xCEzW71g2Xzeh1NM3NImxco.DEBUG, "No captured frames, skipping generating a video segment", new Object[0]);
                } else {
                    UriActionExternalSyntheticLambda4 uriActionExternalSyntheticLambda4Serializer4 = remoteActionCompatParcelizer2.serializer();
                    try {
                        ArrayList arrayList4 = arrayList3;
                        E$b e$b3 = new E$b(sentryOptions2, new io.sentry.android.replay.video.IconCompatParcelizer(file, i3, i2, i4, i5));
                        MediaCodec mediaCodec = (MediaCodec) e$b3.IconCompatParcelizer;
                        mediaCodec.configure((MediaFormat) ((onViewDetachedFromWindowlambda1) e$b3.MediaDescriptionCompat).MediaSessionCompatResultReceiverWrapper(), (Surface) null, (MediaCrypto) null, 1);
                        e$b3.MediaMetadataCompat = mediaCodec.createInputSurface();
                        mediaCodec.start();
                        e$b3.RemoteActionCompatParcelizer(false);
                        Okio.RemoteActionCompatParcelizer(uriActionExternalSyntheticLambda4Serializer4, null);
                        mediaBrowserCompatMediaItem.serializer = e$b3;
                        long j4 = 1000 / ((long) i4);
                        Object objMediaMetadataCompat = onContentCardDismissed.MediaMetadataCompat((List) arrayList4);
                        long j5 = time2 + jMin;
                        if (j5 <= Long.MIN_VALUE) {
                            getdisplayinginappmessageannotations = getDisplayingInAppMessageannotations.serializer;
                        } else {
                            getdisplayinginappmessageannotations = new getDisplayingInAppMessageannotations(time2, j5 - 1);
                        }
                        getdisplayinginappmessageannotations.getClass();
                        RangesKt.read(j4 > 0, Long.valueOf(j4));
                        long j6 = getdisplayinginappmessageannotations.read;
                        long j7 = getdisplayinginappmessageannotations.IconCompatParcelizer;
                        long j8 = getdisplayinginappmessageannotations.RemoteActionCompatParcelizer > 0 ? j4 : -j4;
                        if (j8 == 0) {
                            ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer("Step must be non-zero.");
                            return null;
                        }
                        if (j8 != Long.MIN_VALUE) {
                            long jSerializer = TuplesKt.serializer(j6, j7, j8);
                            if ((j8 > 0 && j6 <= jSerializer) || (j8 < 0 && jSerializer <= j6)) {
                                long j9 = j6;
                                int i7 = 0;
                                ?? r1 = objMediaMetadataCompat;
                                ?? r36 = arrayList4;
                                while (true) {
                                    Iterator it2 = r36.iterator();
                                    while (true) {
                                        if (it2.hasNext()) {
                                            r12 = (io.sentry.android.replay.MediaDescriptionCompat) it2.next();
                                            long j10 = j9 + j4;
                                            j2 = j4;
                                            long j11 = r12.RemoteActionCompatParcelizer;
                                            if (j9 <= j11 && j11 <= j10) {
                                                break;
                                            }
                                            if (j11 <= j10) {
                                                j4 = j2;
                                            }
                                        } else {
                                            j2 = j4;
                                        }
                                        r12 = r1;
                                        break;
                                    }
                                    io.sentry.android.replay.MediaDescriptionCompat mediaDescriptionCompat = (io.sentry.android.replay.MediaDescriptionCompat) r12;
                                    if (mediaDescriptionCompat != null) {
                                        try {
                                            Bitmap bitmapDecodeFile = BitmapFactory.decodeFile(mediaDescriptionCompat.read.getAbsolutePath());
                                            UriActionExternalSyntheticLambda4 uriActionExternalSyntheticLambda4Serializer5 = remoteActionCompatParcelizer2.serializer();
                                            try {
                                                E$b e$b4 = mediaBrowserCompatMediaItem.serializer;
                                                if (e$b4 != null) {
                                                    bitmapDecodeFile.getClass();
                                                    e$b4.write(bitmapDecodeFile);
                                                }
                                                Okio.RemoteActionCompatParcelizer(uriActionExternalSyntheticLambda4Serializer5, null);
                                                bitmapDecodeFile.recycle();
                                                i7++;
                                                r0 = r12;
                                                r5 = r36;
                                                if (j9 == jSerializer) {
                                                    i6 = i7;
                                                    break;
                                                }
                                                j9 += j8;
                                                r36 = r5;
                                                j4 = j2;
                                                r1 = r0;
                                            } catch (Throwable th) {
                                                try {
                                                    throw th;
                                                } catch (Throwable th2) {
                                                    Okio.RemoteActionCompatParcelizer(uriActionExternalSyntheticLambda4Serializer5, th);
                                                    throw th2;
                                                }
                                            }
                                        } catch (Throwable th3) {
                                            sentryOptions2.getLogger().serializer(r8lambdaL32xCEzW71g2Xzeh1NM3NImxco.WARNING, "Unable to decode bitmap and encode it into a video, skipping frame", th3);
                                            if (r12 != 0) {
                                                mediaBrowserCompatMediaItem.RemoteActionCompatParcelizer(mediaDescriptionCompat.read);
                                                uriActionExternalSyntheticLambda4Serializer2 = remoteActionCompatParcelizer.serializer();
                                                try {
                                                    pauseWebviewIfNecessarylambda10.RemoteActionCompatParcelizer(arrayList2).remove(r12);
                                                    Okio.RemoteActionCompatParcelizer(uriActionExternalSyntheticLambda4Serializer2, null);
                                                    ?? r6 = r36;
                                                    r6.remove(r12);
                                                    i7 = i7;
                                                    r0 = 0;
                                                    r5 = r6;
                                                } catch (Throwable th4) {
                                                    try {
                                                        throw th4;
                                                    } catch (Throwable th5) {
                                                        Okio.RemoteActionCompatParcelizer(uriActionExternalSyntheticLambda4Serializer2, th4);
                                                        throw th5;
                                                    }
                                                }
                                            } else {
                                                i7 = i7;
                                            }
                                            if (j9 == jSerializer) {
                                                i6 = i7;
                                                if (i6 == 0) {
                                                    sentryOptions2.getLogger().IconCompatParcelizer(r8lambdaL32xCEzW71g2Xzeh1NM3NImxco.DEBUG, "Generated a video with no frames, not capturing a replay segment", new Object[0]);
                                                    mediaBrowserCompatMediaItem.RemoteActionCompatParcelizer(file);
                                                    iconCompatParcelizer = null;
                                                } else {
                                                    uriActionExternalSyntheticLambda4Serializer = remoteActionCompatParcelizer2.serializer();
                                                    try {
                                                        e$b = mediaBrowserCompatMediaItem.serializer;
                                                        if (e$b != null) {
                                                            e$b.MediaSessionCompatQueueItem();
                                                        }
                                                        e$b2 = mediaBrowserCompatMediaItem.serializer;
                                                        if (e$b2 != null) {
                                                            writeVar = (io.sentry.android.replay.video.write) e$b2.write;
                                                            if (writeVar.serializer == 0) {
                                                                j3 = (writeVar.write + writeVar.read) / 1000;
                                                            }
                                                        }
                                                        long j12 = j3;
                                                        mediaBrowserCompatMediaItem.serializer = null;
                                                        Okio.RemoteActionCompatParcelizer(uriActionExternalSyntheticLambda4Serializer, null);
                                                        mediaBrowserCompatMediaItem.read(j5);
                                                        iconCompatParcelizer = new io.sentry.android.replay.IconCompatParcelizer(file, i6, j12);
                                                    } catch (Throwable th6) {
                                                        try {
                                                            throw th6;
                                                        } catch (Throwable th7) {
                                                            Okio.RemoteActionCompatParcelizer(uriActionExternalSyntheticLambda4Serializer, th6);
                                                            throw th7;
                                                        }
                                                    }
                                                }
                                                if (iconCompatParcelizer != null) {
                                                    File file2 = iconCompatParcelizer.read;
                                                    int i8 = iconCompatParcelizer.write;
                                                    long j13 = iconCompatParcelizer.IconCompatParcelizer;
                                                    if (list == null) {
                                                        createinappmessageeventsubscriber = new createInAppMessageEventSubscriber();
                                                        createinappmessageeventsubscriber.IconCompatParcelizer = instance_delegatelambda0.write;
                                                        if (addToCustomAttributeArrayStep != null) {
                                                            addToCustomAttributeArrayStep.RemoteActionCompatParcelizer(new ReplayIntegration$$ExternalSyntheticLambda1(createinappmessageeventsubscriber, 2));
                                                        }
                                                        list2 = (List) createinappmessageeventsubscriber.IconCompatParcelizer;
                                                    } else {
                                                        list2 = list;
                                                    }
                                                    Date dateIconCompatParcelizer = setNativeShader.IconCompatParcelizer(date.getTime() + j13);
                                                    dateIconCompatParcelizer.getClass();
                                                    onCustomEventAction oncustomeventaction = new onCustomEventAction();
                                                    oncustomeventaction.MediaMetadataCompat = r8lambdaquuwrpysdd6n6dd7wraaa0s4oxg;
                                                    oncustomeventaction.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus = r8lambdaquuwrpysdd6n6dd7wraaa0s4oxg;
                                                    oncustomeventaction.ResultReceiver = i;
                                                    oncustomeventaction.r8lambdaXj9c8VIP9DfEvaTmZt0ejAuC4a4 = dateIconCompatParcelizer;
                                                    oncustomeventaction.ComponentActivity = date;
                                                    oncustomeventaction.r8lambda54BeH8ZsBru0CXI2CCSP2syNys = onotherurlactionlambda1;
                                                    oncustomeventaction.r8lambdawJ5MHcSJed_CjC7r4OWD0UxyJsQ = file2;
                                                    arrayList = new ArrayList();
                                                    io.sentry.rrweb.MediaSessionCompatResultReceiverWrapper mediaSessionCompatResultReceiverWrapper = new io.sentry.rrweb.MediaSessionCompatResultReceiverWrapper();
                                                    mediaSessionCompatResultReceiverWrapper.PlaybackStateCompatCustomAction = date.getTime();
                                                    mediaSessionCompatResultReceiverWrapper.serializer = i2;
                                                    mediaSessionCompatResultReceiverWrapper.read = i3;
                                                    arrayList.add(mediaSessionCompatResultReceiverWrapper);
                                                    ComponentActivity componentActivity = new ComponentActivity();
                                                    componentActivity.PlaybackStateCompatCustomAction = date.getTime();
                                                    componentActivity.MediaSessionCompatResultReceiverWrapper = i;
                                                    componentActivity.serializer = j13;
                                                    componentActivity.IconCompatParcelizer = i8;
                                                    componentActivity.MediaSessionCompatToken = file2.length();
                                                    componentActivity.MediaDescriptionCompat = i4;
                                                    componentActivity.MediaMetadataCompat = i2;
                                                    componentActivity.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus = i3;
                                                    componentActivity.MediaBrowserCompatMediaItem = 0;
                                                    componentActivity.r8lambda54BeH8ZsBru0CXI2CCSP2syNys = 0;
                                                    arrayList.add(componentActivity);
                                                    linkedList = new LinkedList();
                                                    getintentarraywithconfiguredbackstacklambda1 = null;
                                                    for (getIntentArrayWithConfiguredBackStacklambda1 getintentarraywithconfiguredbackstacklambda2 : list2) {
                                                        if (getintentarraywithconfiguredbackstacklambda1 == null) {
                                                            z = false;
                                                        } else if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{getintentarraywithconfiguredbackstacklambda1.write, "network.event"}, getCieXyz.write())).booleanValue()) {
                                                            ConcurrentHashMap concurrentHashMap2 = getintentarraywithconfiguredbackstacklambda1.IconCompatParcelizer;
                                                            concurrentHashMap2.getClass();
                                                            obj2 = concurrentHashMap2.get("action");
                                                            if (obj2 == null) {
                                                                obj2 = null;
                                                            }
                                                            if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{obj2, "NETWORK_AVAILABLE"}, getCieXyz.write())).booleanValue()) {
                                                                z = false;
                                                            } else if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{getintentarraywithconfiguredbackstacklambda2.write, "network.event"}, getCieXyz.write())).booleanValue()) {
                                                                z = false;
                                                            } else {
                                                                z = false;
                                                            }
                                                        } else {
                                                            z = false;
                                                        }
                                                        if (getintentarraywithconfiguredbackstacklambda2.write().getTime() < date.getTime()) {
                                                            arrayList.add(iconCompatParcelizerWrite);
                                                            if (iconCompatParcelizerWrite instanceof io.sentry.rrweb.serializer) {
                                                                serializerVar = (io.sentry.rrweb.serializer) iconCompatParcelizerWrite;
                                                            } else {
                                                                serializerVar = null;
                                                            }
                                                            if (serializerVar != null) {
                                                                str3 = serializerVar.serializer;
                                                            } else {
                                                                str3 = null;
                                                            }
                                                            if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{str3, "navigation"}, getCieXyz.write())).booleanValue()) {
                                                                serializerVar2 = (io.sentry.rrweb.serializer) iconCompatParcelizerWrite;
                                                                concurrentHashMap = serializerVar2.read;
                                                                if (concurrentHashMap != null) {
                                                                    obj = null;
                                                                } else {
                                                                    obj = null;
                                                                }
                                                                if (obj instanceof String) {
                                                                    ConcurrentHashMap concurrentHashMap3 = serializerVar2.read;
                                                                    concurrentHashMap3.getClass();
                                                                    Object obj3 = concurrentHashMap3.get(RemoteMessageConst.TO);
                                                                    obj3.getClass();
                                                                    linkedList.add((String) obj3);
                                                                }
                                                            }
                                                        } else {
                                                            arrayList.add(iconCompatParcelizerWrite);
                                                            if (iconCompatParcelizerWrite instanceof io.sentry.rrweb.serializer) {
                                                                serializerVar = (io.sentry.rrweb.serializer) iconCompatParcelizerWrite;
                                                            } else {
                                                                serializerVar = null;
                                                            }
                                                            if (serializerVar != null) {
                                                                str3 = serializerVar.serializer;
                                                            } else {
                                                                str3 = null;
                                                            }
                                                            if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{str3, "navigation"}, getCieXyz.write())).booleanValue()) {
                                                                serializerVar2 = (io.sentry.rrweb.serializer) iconCompatParcelizerWrite;
                                                                concurrentHashMap = serializerVar2.read;
                                                                if (concurrentHashMap != null) {
                                                                    obj = null;
                                                                } else {
                                                                    obj = null;
                                                                }
                                                                if (obj instanceof String) {
                                                                    ConcurrentHashMap concurrentHashMap4 = serializerVar2.read;
                                                                    concurrentHashMap4.getClass();
                                                                    Object obj4 = concurrentHashMap4.get(RemoteMessageConst.TO);
                                                                    obj4.getClass();
                                                                    linkedList.add((String) obj4);
                                                                }
                                                            }
                                                        }
                                                        getintentarraywithconfiguredbackstacklambda1 = getintentarraywithconfiguredbackstacklambda2;
                                                    }
                                                    if (str != null) {
                                                        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{onContentCardDismissed.MediaMetadataCompat((List) linkedList), str}, getCieXyz.write())).booleanValue()) {
                                                            linkedList.addFirst(str);
                                                        }
                                                    }
                                                    time = dateIconCompatParcelizer.getTime();
                                                    mapboxNavigation$notification$1$1 = new MapboxNavigation$notification$1$1(date, 12, arrayList);
                                                    it = deque.iterator();
                                                    it.getClass();
                                                    while (it.hasNext()) {
                                                        iconCompatParcelizer2 = (io.sentry.rrweb.IconCompatParcelizer) it.next();
                                                        if (iconCompatParcelizer2.PlaybackStateCompatCustomAction < time) {
                                                            mapboxNavigation$notification$1$1.invoke(iconCompatParcelizer2);
                                                            it.remove();
                                                        }
                                                    }
                                                    if (i == 0) {
                                                        io.sentry.rrweb.PlaybackStateCompat playbackStateCompat = new io.sentry.rrweb.PlaybackStateCompat(io.sentry.rrweb.RemoteActionCompatParcelizer.Custom);
                                                        map = new HashMap();
                                                        playbackStateCompat.write = map;
                                                        playbackStateCompat.serializer = "options";
                                                        sdkVersion = sentryOptions.getSdkVersion();
                                                        if (sdkVersion != null) {
                                                            map.put("nativeSdkName", sdkVersion.RemoteActionCompatParcelizer);
                                                            map.put("nativeSdkVersion", sdkVersion.IconCompatParcelizer);
                                                        }
                                                        sessionReplay = sentryOptions.getSessionReplay();
                                                        Double d = sessionReplay.PlaybackStateCompat;
                                                        CopyOnWriteArraySet copyOnWriteArraySet = sessionReplay.write;
                                                        map.put("errorSampleRate", d);
                                                        map.put("sessionSampleRate", sessionReplay.r8lambda54BeH8ZsBru0CXI2CCSP2syNys);
                                                        map.put("maskAllImages", Boolean.valueOf(copyOnWriteArraySet.contains("android.widget.ImageView")));
                                                        map.put("maskAllText", Boolean.valueOf(copyOnWriteArraySet.contains(AndroidComposeViewAccessibilityDelegateCompat.TextClassName)));
                                                        map.put("quality", sessionReplay.MediaSessionCompatResultReceiverWrapper.serializedName());
                                                        map.put("maskedViewClasses", copyOnWriteArraySet);
                                                        map.put("unmaskedViewClasses", sessionReplay.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus);
                                                        if (sessionReplay.MediaSessionCompatToken == dismisslambda0.PIXEL_COPY) {
                                                            str2 = "pixelCopy";
                                                        } else {
                                                            str2 = "canvas";
                                                        }
                                                        map.put("screenshotStrategy", str2);
                                                        map.put("networkDetailHasUrls", Boolean.valueOf(!sessionReplay.MediaMetadataCompat.isEmpty()));
                                                        if (!sessionReplay.MediaMetadataCompat.isEmpty()) {
                                                            map.put("networkDetailAllowUrls", sessionReplay.MediaMetadataCompat);
                                                            map.put("networkRequestHeaders", sessionReplay.MediaDescriptionCompat);
                                                            map.put("networkResponseHeaders", sessionReplay.MediaBrowserCompatMediaItem);
                                                            map.put("networkCaptureBodies", Boolean.valueOf(sessionReplay.RatingCompat));
                                                            if (!sessionReplay.MediaSessionCompatQueueItem.isEmpty()) {
                                                                map.put("networkDetailDenyUrls", sessionReplay.MediaSessionCompatQueueItem);
                                                            }
                                                        }
                                                        arrayList.add(playbackStateCompat);
                                                    }
                                                    BannerDismissSnapshot bannerDismissSnapshot = new BannerDismissSnapshot();
                                                    bannerDismissSnapshot.IconCompatParcelizer = Integer.valueOf(i);
                                                    bannerDismissSnapshot.write = onContentCardDismissed.serializer(arrayList, new MediaMetadataCompat());
                                                    oncustomeventaction.r8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8 = linkedList;
                                                    return new RatingCompat(oncustomeventaction, bannerDismissSnapshot);
                                                }
                                                return PlaybackStateCompatCustomAction.serializer;
                                            }
                                            j9 += j8;
                                            r36 = r5;
                                            j4 = j2;
                                            r1 = r0;
                                        }
                                    }
                                    if (r12 != 0) {
                                        mediaBrowserCompatMediaItem.RemoteActionCompatParcelizer(mediaDescriptionCompat.read);
                                        uriActionExternalSyntheticLambda4Serializer2 = remoteActionCompatParcelizer.serializer();
                                        pauseWebviewIfNecessarylambda10.RemoteActionCompatParcelizer(arrayList2).remove(r12);
                                        Okio.RemoteActionCompatParcelizer(uriActionExternalSyntheticLambda4Serializer2, null);
                                        ?? r7 = r36;
                                        r7.remove(r12);
                                        i7 = i7;
                                        r0 = 0;
                                        r5 = r7;
                                    } else {
                                        i7 = i7;
                                        r0 = r12;
                                        r5 = r36;
                                    }
                                    if (j9 == jSerializer) {
                                        i6 = i7;
                                        break;
                                    }
                                    j9 += j8;
                                    r36 = r5;
                                    j4 = j2;
                                    r1 = r0;
                                }
                            } else {
                                i6 = 0;
                            }
                            if (i6 == 0) {
                                sentryOptions2.getLogger().IconCompatParcelizer(r8lambdaL32xCEzW71g2Xzeh1NM3NImxco.DEBUG, "Generated a video with no frames, not capturing a replay segment", new Object[0]);
                                mediaBrowserCompatMediaItem.RemoteActionCompatParcelizer(file);
                            } else {
                                uriActionExternalSyntheticLambda4Serializer = remoteActionCompatParcelizer2.serializer();
                                e$b = mediaBrowserCompatMediaItem.serializer;
                                if (e$b != null) {
                                    e$b.MediaSessionCompatQueueItem();
                                }
                                e$b2 = mediaBrowserCompatMediaItem.serializer;
                                if (e$b2 != null) {
                                    writeVar = (io.sentry.android.replay.video.write) e$b2.write;
                                    if (writeVar.serializer == 0) {
                                        j3 = (writeVar.write + writeVar.read) / 1000;
                                    }
                                }
                                long j14 = j3;
                                mediaBrowserCompatMediaItem.serializer = null;
                                Okio.RemoteActionCompatParcelizer(uriActionExternalSyntheticLambda4Serializer, null);
                                mediaBrowserCompatMediaItem.read(j5);
                                iconCompatParcelizer = new io.sentry.android.replay.IconCompatParcelizer(file, i6, j14);
                            }
                            if (iconCompatParcelizer != null) {
                                File file3 = iconCompatParcelizer.read;
                                int i9 = iconCompatParcelizer.write;
                                long j15 = iconCompatParcelizer.IconCompatParcelizer;
                                if (list == null) {
                                    createinappmessageeventsubscriber = new createInAppMessageEventSubscriber();
                                    createinappmessageeventsubscriber.IconCompatParcelizer = instance_delegatelambda0.write;
                                    if (addToCustomAttributeArrayStep != null) {
                                        addToCustomAttributeArrayStep.RemoteActionCompatParcelizer(new ReplayIntegration$$ExternalSyntheticLambda1(createinappmessageeventsubscriber, 2));
                                    }
                                    list2 = (List) createinappmessageeventsubscriber.IconCompatParcelizer;
                                } else {
                                    list2 = list;
                                }
                                Date dateIconCompatParcelizer2 = setNativeShader.IconCompatParcelizer(date.getTime() + j15);
                                dateIconCompatParcelizer2.getClass();
                                onCustomEventAction oncustomeventaction2 = new onCustomEventAction();
                                oncustomeventaction2.MediaMetadataCompat = r8lambdaquuwrpysdd6n6dd7wraaa0s4oxg;
                                oncustomeventaction2.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus = r8lambdaquuwrpysdd6n6dd7wraaa0s4oxg;
                                oncustomeventaction2.ResultReceiver = i;
                                oncustomeventaction2.r8lambdaXj9c8VIP9DfEvaTmZt0ejAuC4a4 = dateIconCompatParcelizer2;
                                oncustomeventaction2.ComponentActivity = date;
                                oncustomeventaction2.r8lambda54BeH8ZsBru0CXI2CCSP2syNys = onotherurlactionlambda1;
                                oncustomeventaction2.r8lambdawJ5MHcSJed_CjC7r4OWD0UxyJsQ = file3;
                                arrayList = new ArrayList();
                                io.sentry.rrweb.MediaSessionCompatResultReceiverWrapper mediaSessionCompatResultReceiverWrapper2 = new io.sentry.rrweb.MediaSessionCompatResultReceiverWrapper();
                                mediaSessionCompatResultReceiverWrapper2.PlaybackStateCompatCustomAction = date.getTime();
                                mediaSessionCompatResultReceiverWrapper2.serializer = i2;
                                mediaSessionCompatResultReceiverWrapper2.read = i3;
                                arrayList.add(mediaSessionCompatResultReceiverWrapper2);
                                ComponentActivity componentActivity2 = new ComponentActivity();
                                componentActivity2.PlaybackStateCompatCustomAction = date.getTime();
                                componentActivity2.MediaSessionCompatResultReceiverWrapper = i;
                                componentActivity2.serializer = j15;
                                componentActivity2.IconCompatParcelizer = i9;
                                componentActivity2.MediaSessionCompatToken = file3.length();
                                componentActivity2.MediaDescriptionCompat = i4;
                                componentActivity2.MediaMetadataCompat = i2;
                                componentActivity2.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus = i3;
                                componentActivity2.MediaBrowserCompatMediaItem = 0;
                                componentActivity2.r8lambda54BeH8ZsBru0CXI2CCSP2syNys = 0;
                                arrayList.add(componentActivity2);
                                linkedList = new LinkedList();
                                getintentarraywithconfiguredbackstacklambda1 = null;
                                while (r2.hasNext()) {
                                    if (getintentarraywithconfiguredbackstacklambda1 == null) {
                                        z = false;
                                    } else if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{getintentarraywithconfiguredbackstacklambda1.write, "network.event"}, getCieXyz.write())).booleanValue()) {
                                        ConcurrentHashMap concurrentHashMap5 = getintentarraywithconfiguredbackstacklambda1.IconCompatParcelizer;
                                        concurrentHashMap5.getClass();
                                        obj2 = concurrentHashMap5.get("action");
                                        if (obj2 == null) {
                                            obj2 = null;
                                        }
                                        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{obj2, "NETWORK_AVAILABLE"}, getCieXyz.write())).booleanValue()) {
                                            z = false;
                                        } else if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{getintentarraywithconfiguredbackstacklambda2.write, "network.event"}, getCieXyz.write())).booleanValue() || !getintentarraywithconfiguredbackstacklambda2.IconCompatParcelizer.containsKey("network_type")) {
                                            z = false;
                                        } else if (getintentarraywithconfiguredbackstacklambda2.write().getTime() + DeviceOrientationRequest.OUTPUT_PERIOD_FAST >= date.getTime()) {
                                            z = true;
                                        } else {
                                            z = false;
                                        }
                                    } else {
                                        z = false;
                                    }
                                    if ((getintentarraywithconfiguredbackstacklambda2.write().getTime() < date.getTime() || z) && getintentarraywithconfiguredbackstacklambda2.write().getTime() < dateIconCompatParcelizer2.getTime() && (iconCompatParcelizerWrite = sentryOptions.getReplayController().MediaSessionCompatQueueItem().write(getintentarraywithconfiguredbackstacklambda2)) != null) {
                                        arrayList.add(iconCompatParcelizerWrite);
                                        if (iconCompatParcelizerWrite instanceof io.sentry.rrweb.serializer) {
                                            serializerVar = (io.sentry.rrweb.serializer) iconCompatParcelizerWrite;
                                        } else {
                                            serializerVar = null;
                                        }
                                        if (serializerVar != null) {
                                            str3 = serializerVar.serializer;
                                        } else {
                                            str3 = null;
                                        }
                                        if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{str3, "navigation"}, getCieXyz.write())).booleanValue()) {
                                            serializerVar2 = (io.sentry.rrweb.serializer) iconCompatParcelizerWrite;
                                            concurrentHashMap = serializerVar2.read;
                                            if (concurrentHashMap != null || (obj = concurrentHashMap.get(RemoteMessageConst.TO)) == null) {
                                                obj = null;
                                            }
                                            if (obj instanceof String) {
                                                ConcurrentHashMap concurrentHashMap6 = serializerVar2.read;
                                                concurrentHashMap6.getClass();
                                                Object obj5 = concurrentHashMap6.get(RemoteMessageConst.TO);
                                                obj5.getClass();
                                                linkedList.add((String) obj5);
                                            }
                                        }
                                    }
                                    getintentarraywithconfiguredbackstacklambda1 = getintentarraywithconfiguredbackstacklambda2;
                                }
                                if (str != null) {
                                    if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{onContentCardDismissed.MediaMetadataCompat((List) linkedList), str}, getCieXyz.write())).booleanValue()) {
                                        linkedList.addFirst(str);
                                    }
                                }
                                time = dateIconCompatParcelizer2.getTime();
                                mapboxNavigation$notification$1$1 = new MapboxNavigation$notification$1$1(date, 12, arrayList);
                                it = deque.iterator();
                                it.getClass();
                                while (it.hasNext()) {
                                    iconCompatParcelizer2 = (io.sentry.rrweb.IconCompatParcelizer) it.next();
                                    if (iconCompatParcelizer2.PlaybackStateCompatCustomAction < time) {
                                        mapboxNavigation$notification$1$1.invoke(iconCompatParcelizer2);
                                        it.remove();
                                    }
                                }
                                if (i == 0) {
                                    io.sentry.rrweb.PlaybackStateCompat playbackStateCompat2 = new io.sentry.rrweb.PlaybackStateCompat(io.sentry.rrweb.RemoteActionCompatParcelizer.Custom);
                                    map = new HashMap();
                                    playbackStateCompat2.write = map;
                                    playbackStateCompat2.serializer = "options";
                                    sdkVersion = sentryOptions.getSdkVersion();
                                    if (sdkVersion != null) {
                                        map.put("nativeSdkName", sdkVersion.RemoteActionCompatParcelizer);
                                        map.put("nativeSdkVersion", sdkVersion.IconCompatParcelizer);
                                    }
                                    sessionReplay = sentryOptions.getSessionReplay();
                                    Double d2 = sessionReplay.PlaybackStateCompat;
                                    CopyOnWriteArraySet copyOnWriteArraySet2 = sessionReplay.write;
                                    map.put("errorSampleRate", d2);
                                    map.put("sessionSampleRate", sessionReplay.r8lambda54BeH8ZsBru0CXI2CCSP2syNys);
                                    map.put("maskAllImages", Boolean.valueOf(copyOnWriteArraySet2.contains("android.widget.ImageView")));
                                    map.put("maskAllText", Boolean.valueOf(copyOnWriteArraySet2.contains(AndroidComposeViewAccessibilityDelegateCompat.TextClassName)));
                                    map.put("quality", sessionReplay.MediaSessionCompatResultReceiverWrapper.serializedName());
                                    map.put("maskedViewClasses", copyOnWriteArraySet2);
                                    map.put("unmaskedViewClasses", sessionReplay.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus);
                                    if (sessionReplay.MediaSessionCompatToken == dismisslambda0.PIXEL_COPY) {
                                        str2 = "pixelCopy";
                                    } else {
                                        str2 = "canvas";
                                    }
                                    map.put("screenshotStrategy", str2);
                                    map.put("networkDetailHasUrls", Boolean.valueOf(!sessionReplay.MediaMetadataCompat.isEmpty()));
                                    if (!sessionReplay.MediaMetadataCompat.isEmpty()) {
                                        map.put("networkDetailAllowUrls", sessionReplay.MediaMetadataCompat);
                                        map.put("networkRequestHeaders", sessionReplay.MediaDescriptionCompat);
                                        map.put("networkResponseHeaders", sessionReplay.MediaBrowserCompatMediaItem);
                                        map.put("networkCaptureBodies", Boolean.valueOf(sessionReplay.RatingCompat));
                                        if (!sessionReplay.MediaSessionCompatQueueItem.isEmpty()) {
                                            map.put("networkDetailDenyUrls", sessionReplay.MediaSessionCompatQueueItem);
                                        }
                                    }
                                    arrayList.add(playbackStateCompat2);
                                }
                                BannerDismissSnapshot bannerDismissSnapshot2 = new BannerDismissSnapshot();
                                bannerDismissSnapshot2.IconCompatParcelizer = Integer.valueOf(i);
                                bannerDismissSnapshot2.write = onContentCardDismissed.serializer(arrayList, new MediaMetadataCompat());
                                oncustomeventaction2.r8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8 = linkedList;
                                return new RatingCompat(oncustomeventaction2, bannerDismissSnapshot2);
                            }
                        } else {
                            ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer("Step must be greater than Long.MIN_VALUE to avoid overflow on negation.");
                            return null;
                        }
                    } catch (Throwable th8) {
                        try {
                            throw th8;
                        } catch (Throwable th9) {
                            Okio.RemoteActionCompatParcelizer(uriActionExternalSyntheticLambda4Serializer4, th8);
                            throw th9;
                        }
                    }
                }
                iconCompatParcelizer = null;
                if (iconCompatParcelizer != null) {
                    File file4 = iconCompatParcelizer.read;
                    int i10 = iconCompatParcelizer.write;
                    long j16 = iconCompatParcelizer.IconCompatParcelizer;
                    if (list == null) {
                        createinappmessageeventsubscriber = new createInAppMessageEventSubscriber();
                        createinappmessageeventsubscriber.IconCompatParcelizer = instance_delegatelambda0.write;
                        if (addToCustomAttributeArrayStep != null) {
                            addToCustomAttributeArrayStep.RemoteActionCompatParcelizer(new ReplayIntegration$$ExternalSyntheticLambda1(createinappmessageeventsubscriber, 2));
                        }
                        list2 = (List) createinappmessageeventsubscriber.IconCompatParcelizer;
                    } else {
                        list2 = list;
                    }
                    Date dateIconCompatParcelizer3 = setNativeShader.IconCompatParcelizer(date.getTime() + j16);
                    dateIconCompatParcelizer3.getClass();
                    onCustomEventAction oncustomeventaction3 = new onCustomEventAction();
                    oncustomeventaction3.MediaMetadataCompat = r8lambdaquuwrpysdd6n6dd7wraaa0s4oxg;
                    oncustomeventaction3.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus = r8lambdaquuwrpysdd6n6dd7wraaa0s4oxg;
                    oncustomeventaction3.ResultReceiver = i;
                    oncustomeventaction3.r8lambdaXj9c8VIP9DfEvaTmZt0ejAuC4a4 = dateIconCompatParcelizer3;
                    oncustomeventaction3.ComponentActivity = date;
                    oncustomeventaction3.r8lambda54BeH8ZsBru0CXI2CCSP2syNys = onotherurlactionlambda1;
                    oncustomeventaction3.r8lambdawJ5MHcSJed_CjC7r4OWD0UxyJsQ = file4;
                    arrayList = new ArrayList();
                    io.sentry.rrweb.MediaSessionCompatResultReceiverWrapper mediaSessionCompatResultReceiverWrapper3 = new io.sentry.rrweb.MediaSessionCompatResultReceiverWrapper();
                    mediaSessionCompatResultReceiverWrapper3.PlaybackStateCompatCustomAction = date.getTime();
                    mediaSessionCompatResultReceiverWrapper3.serializer = i2;
                    mediaSessionCompatResultReceiverWrapper3.read = i3;
                    arrayList.add(mediaSessionCompatResultReceiverWrapper3);
                    ComponentActivity componentActivity3 = new ComponentActivity();
                    componentActivity3.PlaybackStateCompatCustomAction = date.getTime();
                    componentActivity3.MediaSessionCompatResultReceiverWrapper = i;
                    componentActivity3.serializer = j16;
                    componentActivity3.IconCompatParcelizer = i10;
                    componentActivity3.MediaSessionCompatToken = file4.length();
                    componentActivity3.MediaDescriptionCompat = i4;
                    componentActivity3.MediaMetadataCompat = i2;
                    componentActivity3.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus = i3;
                    componentActivity3.MediaBrowserCompatMediaItem = 0;
                    componentActivity3.r8lambda54BeH8ZsBru0CXI2CCSP2syNys = 0;
                    arrayList.add(componentActivity3);
                    linkedList = new LinkedList();
                    getintentarraywithconfiguredbackstacklambda1 = null;
                    while (r2.hasNext()) {
                        if (getintentarraywithconfiguredbackstacklambda1 == null) {
                            z = false;
                        } else if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{getintentarraywithconfiguredbackstacklambda1.write, "network.event"}, getCieXyz.write())).booleanValue()) {
                            ConcurrentHashMap concurrentHashMap7 = getintentarraywithconfiguredbackstacklambda1.IconCompatParcelizer;
                            concurrentHashMap7.getClass();
                            obj2 = concurrentHashMap7.get("action");
                            if (obj2 == null) {
                                obj2 = null;
                            }
                            if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{obj2, "NETWORK_AVAILABLE"}, getCieXyz.write())).booleanValue()) {
                                z = false;
                            } else if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{getintentarraywithconfiguredbackstacklambda2.write, "network.event"}, getCieXyz.write())).booleanValue()) {
                                z = false;
                            } else {
                                z = false;
                            }
                        } else {
                            z = false;
                        }
                        if (getintentarraywithconfiguredbackstacklambda2.write().getTime() < date.getTime()) {
                            arrayList.add(iconCompatParcelizerWrite);
                            if (iconCompatParcelizerWrite instanceof io.sentry.rrweb.serializer) {
                                serializerVar = (io.sentry.rrweb.serializer) iconCompatParcelizerWrite;
                            } else {
                                serializerVar = null;
                            }
                            if (serializerVar != null) {
                                str3 = serializerVar.serializer;
                            } else {
                                str3 = null;
                            }
                            if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{str3, "navigation"}, getCieXyz.write())).booleanValue()) {
                                serializerVar2 = (io.sentry.rrweb.serializer) iconCompatParcelizerWrite;
                                concurrentHashMap = serializerVar2.read;
                                if (concurrentHashMap != null) {
                                    obj = null;
                                } else {
                                    obj = null;
                                }
                                if (obj instanceof String) {
                                    ConcurrentHashMap concurrentHashMap8 = serializerVar2.read;
                                    concurrentHashMap8.getClass();
                                    Object obj6 = concurrentHashMap8.get(RemoteMessageConst.TO);
                                    obj6.getClass();
                                    linkedList.add((String) obj6);
                                }
                            }
                        } else {
                            arrayList.add(iconCompatParcelizerWrite);
                            if (iconCompatParcelizerWrite instanceof io.sentry.rrweb.serializer) {
                                serializerVar = (io.sentry.rrweb.serializer) iconCompatParcelizerWrite;
                            } else {
                                serializerVar = null;
                            }
                            if (serializerVar != null) {
                                str3 = serializerVar.serializer;
                            } else {
                                str3 = null;
                            }
                            if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{str3, "navigation"}, getCieXyz.write())).booleanValue()) {
                                serializerVar2 = (io.sentry.rrweb.serializer) iconCompatParcelizerWrite;
                                concurrentHashMap = serializerVar2.read;
                                if (concurrentHashMap != null) {
                                    obj = null;
                                } else {
                                    obj = null;
                                }
                                if (obj instanceof String) {
                                    ConcurrentHashMap concurrentHashMap9 = serializerVar2.read;
                                    concurrentHashMap9.getClass();
                                    Object obj7 = concurrentHashMap9.get(RemoteMessageConst.TO);
                                    obj7.getClass();
                                    linkedList.add((String) obj7);
                                }
                            }
                        }
                        getintentarraywithconfiguredbackstacklambda1 = getintentarraywithconfiguredbackstacklambda2;
                    }
                    if (str != null) {
                        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{onContentCardDismissed.MediaMetadataCompat((List) linkedList), str}, getCieXyz.write())).booleanValue()) {
                            linkedList.addFirst(str);
                        }
                    }
                    time = dateIconCompatParcelizer3.getTime();
                    mapboxNavigation$notification$1$1 = new MapboxNavigation$notification$1$1(date, 12, arrayList);
                    it = deque.iterator();
                    it.getClass();
                    while (it.hasNext()) {
                        iconCompatParcelizer2 = (io.sentry.rrweb.IconCompatParcelizer) it.next();
                        if (iconCompatParcelizer2.PlaybackStateCompatCustomAction < time) {
                            mapboxNavigation$notification$1$1.invoke(iconCompatParcelizer2);
                            it.remove();
                        }
                    }
                    if (i == 0) {
                        io.sentry.rrweb.PlaybackStateCompat playbackStateCompat3 = new io.sentry.rrweb.PlaybackStateCompat(io.sentry.rrweb.RemoteActionCompatParcelizer.Custom);
                        map = new HashMap();
                        playbackStateCompat3.write = map;
                        playbackStateCompat3.serializer = "options";
                        sdkVersion = sentryOptions.getSdkVersion();
                        if (sdkVersion != null) {
                            map.put("nativeSdkName", sdkVersion.RemoteActionCompatParcelizer);
                            map.put("nativeSdkVersion", sdkVersion.IconCompatParcelizer);
                        }
                        sessionReplay = sentryOptions.getSessionReplay();
                        Double d3 = sessionReplay.PlaybackStateCompat;
                        CopyOnWriteArraySet copyOnWriteArraySet3 = sessionReplay.write;
                        map.put("errorSampleRate", d3);
                        map.put("sessionSampleRate", sessionReplay.r8lambda54BeH8ZsBru0CXI2CCSP2syNys);
                        map.put("maskAllImages", Boolean.valueOf(copyOnWriteArraySet3.contains("android.widget.ImageView")));
                        map.put("maskAllText", Boolean.valueOf(copyOnWriteArraySet3.contains(AndroidComposeViewAccessibilityDelegateCompat.TextClassName)));
                        map.put("quality", sessionReplay.MediaSessionCompatResultReceiverWrapper.serializedName());
                        map.put("maskedViewClasses", copyOnWriteArraySet3);
                        map.put("unmaskedViewClasses", sessionReplay.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus);
                        if (sessionReplay.MediaSessionCompatToken == dismisslambda0.PIXEL_COPY) {
                            str2 = "pixelCopy";
                        } else {
                            str2 = "canvas";
                        }
                        map.put("screenshotStrategy", str2);
                        map.put("networkDetailHasUrls", Boolean.valueOf(!sessionReplay.MediaMetadataCompat.isEmpty()));
                        if (!sessionReplay.MediaMetadataCompat.isEmpty()) {
                            map.put("networkDetailAllowUrls", sessionReplay.MediaMetadataCompat);
                            map.put("networkRequestHeaders", sessionReplay.MediaDescriptionCompat);
                            map.put("networkResponseHeaders", sessionReplay.MediaBrowserCompatMediaItem);
                            map.put("networkCaptureBodies", Boolean.valueOf(sessionReplay.RatingCompat));
                            if (!sessionReplay.MediaSessionCompatQueueItem.isEmpty()) {
                                map.put("networkDetailDenyUrls", sessionReplay.MediaSessionCompatQueueItem);
                            }
                        }
                        arrayList.add(playbackStateCompat3);
                    }
                    BannerDismissSnapshot bannerDismissSnapshot3 = new BannerDismissSnapshot();
                    bannerDismissSnapshot3.IconCompatParcelizer = Integer.valueOf(i);
                    bannerDismissSnapshot3.write = onContentCardDismissed.serializer(arrayList, new MediaMetadataCompat());
                    oncustomeventaction3.r8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8 = linkedList;
                    return new RatingCompat(oncustomeventaction3, bannerDismissSnapshot3);
                }
            } catch (Throwable th10) {
                try {
                    throw th10;
                } catch (Throwable th11) {
                    Okio.RemoteActionCompatParcelizer(uriActionExternalSyntheticLambda4Serializer3, th10);
                    throw th11;
                }
            }
        }
        return PlaybackStateCompatCustomAction.serializer;
    }
}
