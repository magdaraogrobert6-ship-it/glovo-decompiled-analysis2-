package io.sentry.android.replay.capture;

import android.view.MotionEvent;
import androidx.sqlite.SQLite;
import com.mapbox.search.base.location.LocationEngineAdapter;
import io.sentry.SentryOptions;
import io.sentry.android.replay.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg;
import io.sentry.rrweb.MediaSessionCompatToken;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentLinkedDeque;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicLong;
import kotlin.jvm.internal.MutablePropertyReference1Impl;
import o.AddToCustomAttributeArrayStep;
import o.FwFClientbootstrapIfNeeded1;
import o.accessgetInstancedelegatecp;
import o.displayInAppMessagelambda1;
import o.getContentCardsSwipeLayout;
import o.getQueryParameterslambda2;
import o.isAdapterPositionOnScreen;
import o.onContentCardDismissed;
import o.onOtherUrlActionlambda1;
import o.registerInAppMessageManagerlambda2;
import o.setNativeShader;

/* JADX INFO: loaded from: classes4.dex */
public abstract class RemoteActionCompatParcelizer {
    public static final /* synthetic */ registerInAppMessageManagerlambda2[] read;
    public final IconCompatParcelizer ComponentActivity;
    public final ConcurrentLinkedDeque IconCompatParcelizer;
    public final getContentCardsSwipeLayout MediaBrowserCompatMediaItem;
    public final AtomicBoolean MediaDescriptionCompat;
    public final io.sentry.transport.MediaSessionCompatQueueItem MediaMetadataCompat;
    public final isAdapterPositionOnScreen MediaSessionCompatQueueItem;
    public final AddToCustomAttributeArrayStep MediaSessionCompatResultReceiverWrapper;
    public final ScheduledExecutorService MediaSessionCompatToken;
    public final IconCompatParcelizer ParcelableVolumeInfo;
    public final IconCompatParcelizer PlaybackStateCompat;
    public final AtomicLong PlaybackStateCompatCustomAction;
    public final SentryOptions RatingCompat;
    public final IconCompatParcelizer RemoteActionCompatParcelizer;
    public final IconCompatParcelizer r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus;
    public final IconCompatParcelizer serializer;
    public io.sentry.android.replay.MediaBrowserCompatMediaItem write;

    public abstract void MediaBrowserCompatMediaItem();

    public abstract void RemoteActionCompatParcelizer(io.sentry.android.replay.PlaybackStateCompatCustomAction playbackStateCompatCustomAction);

    public abstract void read();

    public abstract void read(boolean z, LocationEngineAdapter.AnonymousClass1 anonymousClass1);

    public abstract RemoteActionCompatParcelizer serializer();

    public abstract void serializer(r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg r8lambdaquuwrpysdd6n6dd7wraaa0s4oxg);

    public static MediaSessionCompatQueueItem serializer(RemoteActionCompatParcelizer remoteActionCompatParcelizer, long j, Date date, io.sentry.protocol.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg r8lambdaquuwrpysdd6n6dd7wraaa0s4oxg, int i, int i2, int i3, int i4, int i5) {
        IconCompatParcelizer iconCompatParcelizer = remoteActionCompatParcelizer.PlaybackStateCompat;
        registerInAppMessageManagerlambda2[] registerinappmessagemanagerlambda2Arr = read;
        onOtherUrlActionlambda1 onotherurlactionlambda1 = (onOtherUrlActionlambda1) iconCompatParcelizer.getValue(remoteActionCompatParcelizer, registerinappmessagemanagerlambda2Arr[5]);
        io.sentry.android.replay.MediaBrowserCompatMediaItem mediaBrowserCompatMediaItem = remoteActionCompatParcelizer.write;
        String str = (String) remoteActionCompatParcelizer.ComponentActivity.getValue(remoteActionCompatParcelizer, registerinappmessagemanagerlambda2Arr[2]);
        ConcurrentLinkedDeque concurrentLinkedDeque = remoteActionCompatParcelizer.IconCompatParcelizer;
        r8lambdaquuwrpysdd6n6dd7wraaa0s4oxg.getClass();
        onotherurlactionlambda1.getClass();
        concurrentLinkedDeque.getClass();
        return MediaBrowserCompatMediaItem.IconCompatParcelizer(remoteActionCompatParcelizer.MediaSessionCompatResultReceiverWrapper, remoteActionCompatParcelizer.RatingCompat, j, date, r8lambdaquuwrpysdd6n6dd7wraaa0s4oxg, i, i2, i3, onotherurlactionlambda1, mediaBrowserCompatMediaItem, i4, i5, str, null, concurrentLinkedDeque);
    }

    public RemoteActionCompatParcelizer(SentryOptions sentryOptions, AddToCustomAttributeArrayStep addToCustomAttributeArrayStep, io.sentry.transport.MediaSessionCompatQueueItem mediaSessionCompatQueueItem, ScheduledExecutorService scheduledExecutorService) {
        sentryOptions.getClass();
        mediaSessionCompatQueueItem.getClass();
        scheduledExecutorService.getClass();
        this.RatingCompat = sentryOptions;
        this.MediaSessionCompatResultReceiverWrapper = addToCustomAttributeArrayStep;
        this.MediaMetadataCompat = mediaSessionCompatQueueItem;
        this.MediaSessionCompatToken = scheduledExecutorService;
        this.MediaSessionCompatQueueItem = new isAdapterPositionOnScreen(new FwFClientbootstrapIfNeeded1(13, this));
        mediaSessionCompatQueueItem.getClass();
        getContentCardsSwipeLayout getcontentcardsswipelayout = new getContentCardsSwipeLayout();
        getcontentcardsswipelayout.write = mediaSessionCompatQueueItem;
        getcontentcardsswipelayout.serializer = new LinkedHashMap(10);
        this.MediaBrowserCompatMediaItem = getcontentcardsswipelayout;
        this.MediaDescriptionCompat = new AtomicBoolean(false);
        this.ParcelableVolumeInfo = new IconCompatParcelizer(this, this, 3);
        this.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus = new IconCompatParcelizer(this, this, 4);
        this.PlaybackStateCompatCustomAction = new AtomicLong();
        this.ComponentActivity = new IconCompatParcelizer(this, this, 5);
        this.serializer = new IconCompatParcelizer(io.sentry.protocol.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg.serializer, this, this);
        this.RemoteActionCompatParcelizer = new IconCompatParcelizer(this, this, 1);
        this.PlaybackStateCompat = new IconCompatParcelizer(this, this, 2);
        this.IconCompatParcelizer = new ConcurrentLinkedDeque();
    }

    public final r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg IconCompatParcelizer() {
        return (r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg) this.ParcelableVolumeInfo.getValue(this, read[0]);
    }

    public final void IconCompatParcelizer(int i) {
        this.RemoteActionCompatParcelizer.setValue(this, read[4], Integer.valueOf(i));
    }

    public final void IconCompatParcelizer(r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg r8lambdaquuwrpysdd6n6dd7wraaa0s4oxg) {
        this.ParcelableVolumeInfo.setValue(this, read[0], r8lambdaquuwrpysdd6n6dd7wraaa0s4oxg);
    }

    public final void IconCompatParcelizer(Date date) {
        this.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus.setValue(this, read[1], date);
    }

    public final int RemoteActionCompatParcelizer() {
        return ((Number) this.RemoteActionCompatParcelizer.getValue(this, read[4])).intValue();
    }

    public final io.sentry.protocol.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg write() {
        return (io.sentry.protocol.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg) this.serializer.getValue(this, read[3]);
    }

    /* JADX WARN: Code duplicated, block: B:48:0x0185  */
    /* JADX WARN: Code duplicated, block: B:51:0x0195  */
    /* JADX WARN: Code duplicated, block: B:52:0x01df  */
    /* JADX WARN: Code duplicated, block: B:54:0x01ee  */
    /* JADX WARN: Code duplicated, block: B:55:0x01f0  */
    public void IconCompatParcelizer(MotionEvent motionEvent) {
        int pointerId;
        int iFindPointerIndex;
        List list;
        int pointerId2;
        int iFindPointerIndex2;
        long j;
        r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg r8lambdaquuwrpysdd6n6dd7wraaa0s4oxgIconCompatParcelizer = IconCompatParcelizer();
        if (r8lambdaquuwrpysdd6n6dd7wraaa0s4oxgIconCompatParcelizer != null) {
            getContentCardsSwipeLayout getcontentcardsswipelayout = this.MediaBrowserCompatMediaItem;
            io.sentry.transport.MediaSessionCompatQueueItem mediaSessionCompatQueueItem = (io.sentry.transport.MediaSessionCompatQueueItem) getcontentcardsswipelayout.write;
            LinkedHashMap linkedHashMap = (LinkedHashMap) getcontentcardsswipelayout.serializer;
            float f = r8lambdaquuwrpysdd6n6dd7wraaa0s4oxgIconCompatParcelizer.RatingCompat;
            float f2 = r8lambdaquuwrpysdd6n6dd7wraaa0s4oxgIconCompatParcelizer.write;
            int actionMasked = motionEvent.getActionMasked();
            if (actionMasked == 0) {
                pointerId = motionEvent.getPointerId(motionEvent.getActionIndex());
                iFindPointerIndex = motionEvent.findPointerIndex(pointerId);
                if (iFindPointerIndex != -1) {
                    list = null;
                } else {
                    linkedHashMap.put(Integer.valueOf(pointerId), new ArrayList(10));
                    io.sentry.rrweb.MediaBrowserCompatMediaItem mediaBrowserCompatMediaItem = new io.sentry.rrweb.MediaBrowserCompatMediaItem();
                    mediaBrowserCompatMediaItem.PlaybackStateCompatCustomAction = mediaSessionCompatQueueItem.IconCompatParcelizer();
                    mediaBrowserCompatMediaItem.MediaDescriptionCompat = motionEvent.getX(iFindPointerIndex) * f2;
                    mediaBrowserCompatMediaItem.MediaBrowserCompatMediaItem = motionEvent.getY(iFindPointerIndex) * f;
                    mediaBrowserCompatMediaItem.IconCompatParcelizer = 0;
                    mediaBrowserCompatMediaItem.write = pointerId;
                    mediaBrowserCompatMediaItem.serializer = io.sentry.rrweb.MediaSessionCompatQueueItem.TouchStart;
                    int iSerializer = getQueryParameterslambda2.serializer();
                    list = (List) SQLite.write(getQueryParameterslambda2.serializer(), getQueryParameterslambda2.serializer(), 516583654, new Object[]{mediaBrowserCompatMediaItem}, getQueryParameterslambda2.serializer(), -516583649, iSerializer);
                }
            } else if (actionMasked == 1) {
                pointerId2 = motionEvent.getPointerId(motionEvent.getActionIndex());
                iFindPointerIndex2 = motionEvent.findPointerIndex(pointerId2);
                if (iFindPointerIndex2 != -1) {
                    list = null;
                } else {
                    linkedHashMap.remove(Integer.valueOf(pointerId2));
                    io.sentry.rrweb.MediaBrowserCompatMediaItem mediaBrowserCompatMediaItem2 = new io.sentry.rrweb.MediaBrowserCompatMediaItem();
                    mediaBrowserCompatMediaItem2.PlaybackStateCompatCustomAction = mediaSessionCompatQueueItem.IconCompatParcelizer();
                    mediaBrowserCompatMediaItem2.MediaDescriptionCompat = motionEvent.getX(iFindPointerIndex2) * f2;
                    mediaBrowserCompatMediaItem2.MediaBrowserCompatMediaItem = motionEvent.getY(iFindPointerIndex2) * f;
                    mediaBrowserCompatMediaItem2.IconCompatParcelizer = 0;
                    mediaBrowserCompatMediaItem2.write = pointerId2;
                    mediaBrowserCompatMediaItem2.serializer = io.sentry.rrweb.MediaSessionCompatQueueItem.TouchEnd;
                    int iSerializer2 = getQueryParameterslambda2.serializer();
                    list = (List) SQLite.write(getQueryParameterslambda2.serializer(), getQueryParameterslambda2.serializer(), 516583654, new Object[]{mediaBrowserCompatMediaItem2}, getQueryParameterslambda2.serializer(), -516583649, iSerializer2);
                }
            } else if (actionMasked == 2) {
                long jIconCompatParcelizer = mediaSessionCompatQueueItem.IconCompatParcelizer();
                long j2 = getcontentcardsswipelayout.RemoteActionCompatParcelizer;
                long j3 = 0;
                if (j2 == 0 || j2 + 50 <= jIconCompatParcelizer) {
                    getcontentcardsswipelayout.RemoteActionCompatParcelizer = jIconCompatParcelizer;
                    Set<Integer> setKeySet = linkedHashMap.keySet();
                    setKeySet.getClass();
                    for (Integer num : setKeySet) {
                        num.getClass();
                        int iFindPointerIndex3 = motionEvent.findPointerIndex(num.intValue());
                        if (iFindPointerIndex3 == -1) {
                            j = jIconCompatParcelizer;
                        } else {
                            long j4 = jIconCompatParcelizer;
                            if (getcontentcardsswipelayout.read == j3) {
                                j = j4;
                                getcontentcardsswipelayout.read = j;
                            } else {
                                j = j4;
                            }
                            Object obj = linkedHashMap.get(num);
                            obj.getClass();
                            io.sentry.rrweb.ParcelableVolumeInfo parcelableVolumeInfo = new io.sentry.rrweb.ParcelableVolumeInfo();
                            parcelableVolumeInfo.serializer = motionEvent.getX(iFindPointerIndex3) * f2;
                            parcelableVolumeInfo.read = motionEvent.getY(iFindPointerIndex3) * f;
                            parcelableVolumeInfo.RemoteActionCompatParcelizer = 0;
                            parcelableVolumeInfo.write = j - getcontentcardsswipelayout.read;
                            ((Collection) obj).add(parcelableVolumeInfo);
                        }
                        jIconCompatParcelizer = j;
                        j3 = 0;
                    }
                    long j5 = jIconCompatParcelizer;
                    long j6 = j5 - getcontentcardsswipelayout.read;
                    if (j6 > 500) {
                        ArrayList arrayList = new ArrayList(linkedHashMap.size());
                        for (Map.Entry entry : linkedHashMap.entrySet()) {
                            int iIntValue = ((Number) entry.getKey()).intValue();
                            ArrayList<io.sentry.rrweb.ParcelableVolumeInfo> arrayList2 = (ArrayList) entry.getValue();
                            if (!arrayList2.isEmpty()) {
                                MediaSessionCompatToken mediaSessionCompatToken = new MediaSessionCompatToken();
                                mediaSessionCompatToken.PlaybackStateCompatCustomAction = j5;
                                ArrayList arrayList3 = new ArrayList(accessgetInstancedelegatecp.write(arrayList2, 10));
                                for (io.sentry.rrweb.ParcelableVolumeInfo parcelableVolumeInfo2 : arrayList2) {
                                    parcelableVolumeInfo2.write -= j6;
                                    arrayList3.add(parcelableVolumeInfo2);
                                    iIntValue = iIntValue;
                                }
                                int i = iIntValue;
                                mediaSessionCompatToken.IconCompatParcelizer = arrayList3;
                                mediaSessionCompatToken.serializer = i;
                                arrayList.add(mediaSessionCompatToken);
                                Object obj2 = linkedHashMap.get(Integer.valueOf(i));
                                obj2.getClass();
                                ((ArrayList) obj2).clear();
                            }
                        }
                        getcontentcardsswipelayout.read = 0L;
                        list = arrayList;
                    } else {
                        list = null;
                    }
                } else {
                    list = null;
                }
            } else if (actionMasked != 3) {
                if (actionMasked == 5) {
                    pointerId = motionEvent.getPointerId(motionEvent.getActionIndex());
                    iFindPointerIndex = motionEvent.findPointerIndex(pointerId);
                    if (iFindPointerIndex != -1) {
                        linkedHashMap.put(Integer.valueOf(pointerId), new ArrayList(10));
                        io.sentry.rrweb.MediaBrowserCompatMediaItem mediaBrowserCompatMediaItem3 = new io.sentry.rrweb.MediaBrowserCompatMediaItem();
                        mediaBrowserCompatMediaItem3.PlaybackStateCompatCustomAction = mediaSessionCompatQueueItem.IconCompatParcelizer();
                        mediaBrowserCompatMediaItem3.MediaDescriptionCompat = motionEvent.getX(iFindPointerIndex) * f2;
                        mediaBrowserCompatMediaItem3.MediaBrowserCompatMediaItem = motionEvent.getY(iFindPointerIndex) * f;
                        mediaBrowserCompatMediaItem3.IconCompatParcelizer = 0;
                        mediaBrowserCompatMediaItem3.write = pointerId;
                        mediaBrowserCompatMediaItem3.serializer = io.sentry.rrweb.MediaSessionCompatQueueItem.TouchStart;
                        int iSerializer3 = getQueryParameterslambda2.serializer();
                        list = (List) SQLite.write(getQueryParameterslambda2.serializer(), getQueryParameterslambda2.serializer(), 516583654, new Object[]{mediaBrowserCompatMediaItem3}, getQueryParameterslambda2.serializer(), -516583649, iSerializer3);
                    }
                } else if (actionMasked == 6) {
                    pointerId2 = motionEvent.getPointerId(motionEvent.getActionIndex());
                    iFindPointerIndex2 = motionEvent.findPointerIndex(pointerId2);
                    if (iFindPointerIndex2 != -1) {
                        linkedHashMap.remove(Integer.valueOf(pointerId2));
                        io.sentry.rrweb.MediaBrowserCompatMediaItem mediaBrowserCompatMediaItem4 = new io.sentry.rrweb.MediaBrowserCompatMediaItem();
                        mediaBrowserCompatMediaItem4.PlaybackStateCompatCustomAction = mediaSessionCompatQueueItem.IconCompatParcelizer();
                        mediaBrowserCompatMediaItem4.MediaDescriptionCompat = motionEvent.getX(iFindPointerIndex2) * f2;
                        mediaBrowserCompatMediaItem4.MediaBrowserCompatMediaItem = motionEvent.getY(iFindPointerIndex2) * f;
                        mediaBrowserCompatMediaItem4.IconCompatParcelizer = 0;
                        mediaBrowserCompatMediaItem4.write = pointerId2;
                        mediaBrowserCompatMediaItem4.serializer = io.sentry.rrweb.MediaSessionCompatQueueItem.TouchEnd;
                        int iSerializer4 = getQueryParameterslambda2.serializer();
                        list = (List) SQLite.write(getQueryParameterslambda2.serializer(), getQueryParameterslambda2.serializer(), 516583654, new Object[]{mediaBrowserCompatMediaItem4}, getQueryParameterslambda2.serializer(), -516583649, iSerializer4);
                    }
                }
                list = null;
            } else {
                linkedHashMap.clear();
                io.sentry.rrweb.MediaBrowserCompatMediaItem mediaBrowserCompatMediaItem5 = new io.sentry.rrweb.MediaBrowserCompatMediaItem();
                mediaBrowserCompatMediaItem5.PlaybackStateCompatCustomAction = mediaSessionCompatQueueItem.IconCompatParcelizer();
                mediaBrowserCompatMediaItem5.MediaDescriptionCompat = motionEvent.getX() * f2;
                mediaBrowserCompatMediaItem5.MediaBrowserCompatMediaItem = motionEvent.getY() * f;
                mediaBrowserCompatMediaItem5.IconCompatParcelizer = 0;
                mediaBrowserCompatMediaItem5.write = 0;
                mediaBrowserCompatMediaItem5.serializer = io.sentry.rrweb.MediaSessionCompatQueueItem.TouchCancel;
                int iSerializer5 = getQueryParameterslambda2.serializer();
                list = (List) SQLite.write(getQueryParameterslambda2.serializer(), getQueryParameterslambda2.serializer(), 516583654, new Object[]{mediaBrowserCompatMediaItem5}, getQueryParameterslambda2.serializer(), -516583649, iSerializer5);
            }
            if (list != null) {
                onContentCardDismissed.RemoteActionCompatParcelizer((Iterable) list, (Collection) this.IconCompatParcelizer);
            }
        }
    }

    public final void MediaSessionCompatQueueItem() {
        IconCompatParcelizer(setNativeShader.serializer());
    }

    public void write(int i, io.sentry.protocol.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg r8lambdaquuwrpysdd6n6dd7wraaa0s4oxg, onOtherUrlActionlambda1 onotherurlactionlambda1) {
        r8lambdaquuwrpysdd6n6dd7wraaa0s4oxg.getClass();
        this.write = new io.sentry.android.replay.MediaBrowserCompatMediaItem(this.RatingCompat, r8lambdaquuwrpysdd6n6dd7wraaa0s4oxg);
        registerInAppMessageManagerlambda2[] registerinappmessagemanagerlambda2Arr = read;
        this.serializer.setValue(this, registerinappmessagemanagerlambda2Arr[3], r8lambdaquuwrpysdd6n6dd7wraaa0s4oxg);
        IconCompatParcelizer(i);
        if (onotherurlactionlambda1 == null) {
            onotherurlactionlambda1 = this instanceof ParcelableVolumeInfo ? onOtherUrlActionlambda1.SESSION : onOtherUrlActionlambda1.BUFFER;
        }
        onotherurlactionlambda1.getClass();
        this.PlaybackStateCompat.setValue(this, registerinappmessagemanagerlambda2Arr[5], onotherurlactionlambda1);
        IconCompatParcelizer(setNativeShader.serializer());
        this.PlaybackStateCompatCustomAction.set(this.MediaMetadataCompat.IconCompatParcelizer());
    }

    static {
        MutablePropertyReference1Impl mutablePropertyReference1Impl = new MutablePropertyReference1Impl(RemoteActionCompatParcelizer.class, "recorderConfig", "getRecorderConfig$sentry_android_replay_release()Lio/sentry/android/replay/ScreenshotRecorderConfig;", 0);
        displayInAppMessagelambda1.IconCompatParcelizer.getClass();
        read = new registerInAppMessageManagerlambda2[]{mutablePropertyReference1Impl, new MutablePropertyReference1Impl(RemoteActionCompatParcelizer.class, "segmentTimestamp", "getSegmentTimestamp()Ljava/util/Date;", 0), new MutablePropertyReference1Impl(RemoteActionCompatParcelizer.class, "screenAtStart", "getScreenAtStart()Ljava/lang/String;", 0), new MutablePropertyReference1Impl(RemoteActionCompatParcelizer.class, "currentReplayId", "getCurrentReplayId()Lio/sentry/protocol/SentryId;", 0), new MutablePropertyReference1Impl(RemoteActionCompatParcelizer.class, "currentSegment", "getCurrentSegment()I", 0), new MutablePropertyReference1Impl(RemoteActionCompatParcelizer.class, "replayType", "getReplayType()Lio/sentry/SentryReplayEvent$ReplayType;", 0)};
    }
}
