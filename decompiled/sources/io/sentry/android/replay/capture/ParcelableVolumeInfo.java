package io.sentry.android.replay.capture;

import com.mapbox.navigation.core.MapboxNavigation$notification$1$1;
import com.mapbox.navigation.voice.api.MapboxVoiceInstructionsPlayer$Companion$$ExternalSyntheticLambda0;
import com.mapbox.search.base.location.LocationEngineAdapter;
import com.sentiance.sdk.util.d0$$ExternalSyntheticLambda0;
import io.sentry.SentryOptions;
import io.sentry.android.replay.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg;
import java.util.Date;
import java.util.concurrent.ScheduledExecutorService;
import o.AddToCustomAttributeArrayStep;
import o.executelambda4;
import o.onOtherUrlActionlambda1;
import o.r8lambdaL32xCEzW71g2Xzeh1NM3NImxco;
import o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM;

/* JADX INFO: loaded from: classes4.dex */
public final class ParcelableVolumeInfo extends RemoteActionCompatParcelizer {
    public final AddToCustomAttributeArrayStep ResultReceiver;
    public final io.sentry.transport.MediaSessionCompatQueueItem r8lambda54BeH8ZsBru0CXI2CCSP2syNys;
    public final SentryOptions r8lambda7IJBVrN0sHyidCAZufWEJFc7yY;

    @Override // io.sentry.android.replay.capture.RemoteActionCompatParcelizer
    public final RemoteActionCompatParcelizer serializer() {
        return this;
    }

    @Override // io.sentry.android.replay.capture.RemoteActionCompatParcelizer
    public final void read(boolean z, LocationEngineAdapter.AnonymousClass1 anonymousClass1) {
        SentryOptions sentryOptions = this.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY;
        if (sentryOptions.getSessionReplay().RemoteActionCompatParcelizer) {
            sentryOptions.getLogger().IconCompatParcelizer(r8lambdaL32xCEzW71g2Xzeh1NM3NImxco.DEBUG, "Replay is already running in 'session' mode, not capturing for event", new Object[0]);
        }
        this.MediaDescriptionCompat.set(z);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ParcelableVolumeInfo(SentryOptions sentryOptions, AddToCustomAttributeArrayStep addToCustomAttributeArrayStep, io.sentry.transport.MediaSessionCompatQueueItem mediaSessionCompatQueueItem, ScheduledExecutorService scheduledExecutorService) {
        super(sentryOptions, addToCustomAttributeArrayStep, mediaSessionCompatQueueItem, scheduledExecutorService);
        sentryOptions.getClass();
        mediaSessionCompatQueueItem.getClass();
        scheduledExecutorService.getClass();
        this.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY = sentryOptions;
        this.ResultReceiver = addToCustomAttributeArrayStep;
        this.r8lambda54BeH8ZsBru0CXI2CCSP2syNys = mediaSessionCompatQueueItem;
    }

    @Override // io.sentry.android.replay.capture.RemoteActionCompatParcelizer
    public final void read() {
        read("pause", new MediaSessionCompatResultReceiverWrapper(this, 0));
    }

    @Override // io.sentry.android.replay.capture.RemoteActionCompatParcelizer
    public final void serializer(r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg r8lambdaquuwrpysdd6n6dd7wraaa0s4oxg) {
        read("onConfigurationChanged", new MediaSessionCompatResultReceiverWrapper(this, 1));
        IconCompatParcelizer(r8lambdaquuwrpysdd6n6dd7wraaa0s4oxg);
    }

    @Override // io.sentry.android.replay.capture.RemoteActionCompatParcelizer
    public final void write(int i, io.sentry.protocol.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg r8lambdaquuwrpysdd6n6dd7wraaa0s4oxg, onOtherUrlActionlambda1 onotherurlactionlambda1) {
        r8lambdaquuwrpysdd6n6dd7wraaa0s4oxg.getClass();
        super.write(i, r8lambdaquuwrpysdd6n6dd7wraaa0s4oxg, onotherurlactionlambda1);
        AddToCustomAttributeArrayStep addToCustomAttributeArrayStep = this.ResultReceiver;
        if (addToCustomAttributeArrayStep != null) {
            addToCustomAttributeArrayStep.RemoteActionCompatParcelizer(new d0$$ExternalSyntheticLambda0(20, this));
        }
    }

    @Override // io.sentry.android.replay.capture.RemoteActionCompatParcelizer
    public final void RemoteActionCompatParcelizer(final io.sentry.android.replay.PlaybackStateCompatCustomAction playbackStateCompatCustomAction) {
        final r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg r8lambdaquuwrpysdd6n6dd7wraaa0s4oxgIconCompatParcelizer = IconCompatParcelizer();
        final long jIconCompatParcelizer = this.r8lambda54BeH8ZsBru0CXI2CCSP2syNys.IconCompatParcelizer();
        this.MediaSessionCompatToken.submit(new io.sentry.android.replay.util.IconCompatParcelizer(new Runnable() { // from class: io.sentry.android.replay.capture.PlaybackStateCompat
            @Override // java.lang.Runnable
            public final void run() {
                ParcelableVolumeInfo parcelableVolumeInfo = this.RemoteActionCompatParcelizer;
                io.sentry.android.replay.MediaBrowserCompatMediaItem mediaBrowserCompatMediaItem = parcelableVolumeInfo.write;
                SentryOptions sentryOptions = parcelableVolumeInfo.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY;
                if (mediaBrowserCompatMediaItem != null) {
                    playbackStateCompatCustomAction.invoke(mediaBrowserCompatMediaItem, Long.valueOf(jIconCompatParcelizer));
                }
                Date date = (Date) parcelableVolumeInfo.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus.getValue(parcelableVolumeInfo, RemoteActionCompatParcelizer.read[1]);
                if (date == null) {
                    sentryOptions.getLogger().IconCompatParcelizer(r8lambdaL32xCEzW71g2Xzeh1NM3NImxco.DEBUG, "Segment timestamp is not set, not recording frame", new Object[0]);
                    return;
                }
                if (parcelableVolumeInfo.MediaDescriptionCompat.get()) {
                    sentryOptions.getLogger().IconCompatParcelizer(r8lambdaL32xCEzW71g2Xzeh1NM3NImxco.DEBUG, "Not capturing segment, because the app is terminating, will be captured on next launch", new Object[0]);
                    return;
                }
                r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg r8lambdaquuwrpysdd6n6dd7wraaa0s4oxg = r8lambdaquuwrpysdd6n6dd7wraaa0s4oxgIconCompatParcelizer;
                if (r8lambdaquuwrpysdd6n6dd7wraaa0s4oxg == null) {
                    sentryOptions.getLogger().IconCompatParcelizer(r8lambdaL32xCEzW71g2Xzeh1NM3NImxco.DEBUG, "Recorder config is not set, not capturing a segment", new Object[0]);
                    return;
                }
                long jIconCompatParcelizer2 = parcelableVolumeInfo.r8lambda54BeH8ZsBru0CXI2CCSP2syNys.IconCompatParcelizer();
                if (jIconCompatParcelizer2 - date.getTime() >= sentryOptions.getSessionReplay().r8lambda7IJBVrN0sHyidCAZufWEJFc7yY) {
                    MediaSessionCompatQueueItem mediaSessionCompatQueueItemSerializer = RemoteActionCompatParcelizer.serializer(parcelableVolumeInfo, sentryOptions.getSessionReplay().r8lambda7IJBVrN0sHyidCAZufWEJFc7yY, date, parcelableVolumeInfo.write(), parcelableVolumeInfo.RemoteActionCompatParcelizer(), r8lambdaquuwrpysdd6n6dd7wraaa0s4oxg.RemoteActionCompatParcelizer, r8lambdaquuwrpysdd6n6dd7wraaa0s4oxg.serializer, r8lambdaquuwrpysdd6n6dd7wraaa0s4oxg.IconCompatParcelizer, r8lambdaquuwrpysdd6n6dd7wraaa0s4oxg.read);
                    if (mediaSessionCompatQueueItemSerializer instanceof RatingCompat) {
                        RatingCompat ratingCompat = (RatingCompat) mediaSessionCompatQueueItemSerializer;
                        ratingCompat.RemoteActionCompatParcelizer(parcelableVolumeInfo.ResultReceiver, new executelambda4());
                        parcelableVolumeInfo.IconCompatParcelizer(parcelableVolumeInfo.RemoteActionCompatParcelizer() + 1);
                        parcelableVolumeInfo.IconCompatParcelizer(ratingCompat.read.r8lambdaXj9c8VIP9DfEvaTmZt0ejAuC4a4);
                    }
                }
                if (jIconCompatParcelizer2 - parcelableVolumeInfo.PlaybackStateCompatCustomAction.get() >= sentryOptions.getSessionReplay().PlaybackStateCompatCustomAction) {
                    sentryOptions.getReplayController().PlaybackStateCompatCustomAction();
                    sentryOptions.getLogger().IconCompatParcelizer(r8lambdaL32xCEzW71g2Xzeh1NM3NImxco.INFO, "Session replay deadline exceeded (1h), stopping recording", new Object[0]);
                }
            }
        }, "SessionCaptureStrategy.add_frame"));
    }

    @Override // io.sentry.android.replay.capture.RemoteActionCompatParcelizer
    public final void MediaBrowserCompatMediaItem() {
        io.sentry.android.replay.MediaBrowserCompatMediaItem mediaBrowserCompatMediaItem = this.write;
        read("stop", new MapboxNavigation$notification$1$1(this, 13, mediaBrowserCompatMediaItem != null ? mediaBrowserCompatMediaItem.IconCompatParcelizer() : null));
        AddToCustomAttributeArrayStep addToCustomAttributeArrayStep = this.ResultReceiver;
        if (addToCustomAttributeArrayStep != null) {
            addToCustomAttributeArrayStep.RemoteActionCompatParcelizer(new MapboxVoiceInstructionsPlayer$Companion$$ExternalSyntheticLambda0(23));
        }
        io.sentry.android.replay.MediaBrowserCompatMediaItem mediaBrowserCompatMediaItem2 = this.write;
        if (mediaBrowserCompatMediaItem2 != null) {
            mediaBrowserCompatMediaItem2.close();
        }
        this.PlaybackStateCompatCustomAction.set(0L);
        IconCompatParcelizer((Date) null);
        io.sentry.protocol.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg r8lambdaquuwrpysdd6n6dd7wraaa0s4oxg = io.sentry.protocol.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg.serializer;
        r8lambdaquuwrpysdd6n6dd7wraaa0s4oxg.getClass();
        this.serializer.setValue(this, RemoteActionCompatParcelizer.read[3], r8lambdaquuwrpysdd6n6dd7wraaa0s4oxg);
    }

    public final void read(String str, r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm) {
        r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg r8lambdaquuwrpysdd6n6dd7wraaa0s4oxgIconCompatParcelizer = IconCompatParcelizer();
        if (r8lambdaquuwrpysdd6n6dd7wraaa0s4oxgIconCompatParcelizer == null) {
            this.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY.getLogger().IconCompatParcelizer(r8lambdaL32xCEzW71g2Xzeh1NM3NImxco.DEBUG, "Recorder config is not set, not creating segment for task: ".concat(str), new Object[0]);
            return;
        }
        long jIconCompatParcelizer = this.r8lambda54BeH8ZsBru0CXI2CCSP2syNys.IconCompatParcelizer();
        Date date = (Date) this.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus.getValue(this, RemoteActionCompatParcelizer.read[1]);
        if (date == null) {
            return;
        }
        long time = date.getTime();
        io.sentry.protocol.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg r8lambdaquuwrpysdd6n6dd7wraaa0s4oxgWrite = write();
        this.MediaSessionCompatToken.submit(new io.sentry.android.replay.util.IconCompatParcelizer(new serializer(this, jIconCompatParcelizer - time, date, r8lambdaquuwrpysdd6n6dd7wraaa0s4oxgWrite, r8lambdaquuwrpysdd6n6dd7wraaa0s4oxgIconCompatParcelizer, r8lambdaunavo3sxub_pc9xroryotnrlvsm, 1), "SessionCaptureStrategy.".concat(str)));
    }
}
