package io.sentry.android.replay.capture;

import android.view.MotionEvent;
import com.mapbox.navigation.core.MapboxNavigation$notification$1$1;
import com.mapbox.search.base.location.LocationEngineAdapter;
import com.sentiance.sdk.util.d0$$ExternalSyntheticLambda0;
import io.sentry.Scopes$$ExternalSyntheticLambda0;
import io.sentry.SentryOptions;
import io.sentry.android.replay.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentLinkedDeque;
import o.AddToCustomAttributeArrayStep;
import o.UriActionExternalSyntheticLambda4;
import o.accessgetDismissSubscriberp;
import o.onContentCardDismissed;
import o.onOtherUrlActionlambda1;
import o.r8lambdaL32xCEzW71g2Xzeh1NM3NImxco;
import o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM;
import o.requestSingleLocationUpdateFromGooglePlay;
import o.setNativeShader;
import okio.Okio;

/* JADX INFO: loaded from: classes4.dex */
public final class write extends RemoteActionCompatParcelizer {
    public final io.sentry.transport.MediaSessionCompatQueueItem ResultReceiver;
    public final ArrayList r8lambda54BeH8ZsBru0CXI2CCSP2syNys;
    public final SentryOptions r8lambda7IJBVrN0sHyidCAZufWEJFc7yY;
    public final AddToCustomAttributeArrayStep r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg;
    public final io.sentry.util.ParcelableVolumeInfo r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM;

    @Override // io.sentry.android.replay.capture.RemoteActionCompatParcelizer
    public final void RemoteActionCompatParcelizer(io.sentry.android.replay.PlaybackStateCompatCustomAction playbackStateCompatCustomAction) {
        this.MediaSessionCompatToken.submit(new io.sentry.android.replay.util.IconCompatParcelizer(new requestSingleLocationUpdateFromGooglePlay(this, playbackStateCompatCustomAction, this.ResultReceiver.IconCompatParcelizer(), 3), "BufferCaptureStrategy.add_frame"));
    }

    @Override // io.sentry.android.replay.capture.RemoteActionCompatParcelizer
    public final void read(boolean z, LocationEngineAdapter.AnonymousClass1 anonymousClass1) {
        SentryOptions sentryOptions = this.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY;
        if (!io.sentry.android.replay.util.MediaDescriptionCompat.read(this.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM, sentryOptions.getSessionReplay().PlaybackStateCompat)) {
            sentryOptions.getLogger().IconCompatParcelizer(r8lambdaL32xCEzW71g2Xzeh1NM3NImxco.INFO, "Replay wasn't sampled by onErrorSampleRate, not capturing for event", new Object[0]);
            return;
        }
        AddToCustomAttributeArrayStep addToCustomAttributeArrayStep = this.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg;
        if (addToCustomAttributeArrayStep != null) {
            addToCustomAttributeArrayStep.RemoteActionCompatParcelizer(new d0$$ExternalSyntheticLambda0(19, this));
        }
        if (!z) {
            write("capture_replay", new MapboxNavigation$notification$1$1(this, 11, anonymousClass1));
        } else {
            this.MediaDescriptionCompat.set(true);
            sentryOptions.getLogger().IconCompatParcelizer(r8lambdaL32xCEzW71g2Xzeh1NM3NImxco.DEBUG, "Not capturing replay for crashed event, will be captured on next launch", new Object[0]);
        }
    }

    @Override // io.sentry.android.replay.capture.RemoteActionCompatParcelizer
    public final RemoteActionCompatParcelizer serializer() {
        boolean z = this.MediaDescriptionCompat.get();
        SentryOptions sentryOptions = this.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY;
        if (z) {
            sentryOptions.getLogger().IconCompatParcelizer(r8lambdaL32xCEzW71g2Xzeh1NM3NImxco.DEBUG, "Not converting to session mode, because the process is about to terminate", new Object[0]);
            return this;
        }
        ParcelableVolumeInfo parcelableVolumeInfo = new ParcelableVolumeInfo(sentryOptions, this.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg, this.ResultReceiver, this.MediaSessionCompatToken);
        parcelableVolumeInfo.IconCompatParcelizer(IconCompatParcelizer());
        parcelableVolumeInfo.write(RemoteActionCompatParcelizer(), write(), onOtherUrlActionlambda1.BUFFER);
        return parcelableVolumeInfo;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public write(SentryOptions sentryOptions, accessgetDismissSubscriberp accessgetdismisssubscriberp, io.sentry.transport.IconCompatParcelizer iconCompatParcelizer, io.sentry.util.ParcelableVolumeInfo parcelableVolumeInfo, io.sentry.android.replay.util.write writeVar) {
        super(sentryOptions, accessgetdismisssubscriberp, iconCompatParcelizer, writeVar);
        sentryOptions.getClass();
        iconCompatParcelizer.getClass();
        parcelableVolumeInfo.getClass();
        writeVar.getClass();
        this.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY = sentryOptions;
        this.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg = accessgetdismisssubscriberp;
        this.ResultReceiver = iconCompatParcelizer;
        this.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM = parcelableVolumeInfo;
        this.r8lambda54BeH8ZsBru0CXI2CCSP2syNys = new ArrayList();
    }

    @Override // io.sentry.android.replay.capture.RemoteActionCompatParcelizer
    public final void IconCompatParcelizer(MotionEvent motionEvent) {
        super.IconCompatParcelizer(motionEvent);
        long jIconCompatParcelizer = this.ResultReceiver.IconCompatParcelizer();
        long j = this.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY.getSessionReplay().read;
        ConcurrentLinkedDeque concurrentLinkedDeque = this.IconCompatParcelizer;
        concurrentLinkedDeque.getClass();
        Iterator it = concurrentLinkedDeque.iterator();
        it.getClass();
        while (it.hasNext()) {
            if (((io.sentry.rrweb.IconCompatParcelizer) it.next()).PlaybackStateCompatCustomAction < jIconCompatParcelizer - j) {
                it.remove();
            }
        }
    }

    @Override // io.sentry.android.replay.capture.RemoteActionCompatParcelizer
    public final void read() {
        write("pause", new MediaDescriptionCompat(this, 0));
    }

    @Override // io.sentry.android.replay.capture.RemoteActionCompatParcelizer
    public final void serializer(r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg r8lambdaquuwrpysdd6n6dd7wraaa0s4oxg) {
        write("configuration_changed", new MediaDescriptionCompat(this, 1));
        IconCompatParcelizer(r8lambdaquuwrpysdd6n6dd7wraaa0s4oxg);
    }

    /* JADX WARN: Code duplicated, block: B:24:0x005b  */
    public final void write(String str, r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm) {
        Date dateIconCompatParcelizer;
        r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg r8lambdaquuwrpysdd6n6dd7wraaa0s4oxgIconCompatParcelizer = IconCompatParcelizer();
        SentryOptions sentryOptions = this.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY;
        if (r8lambdaquuwrpysdd6n6dd7wraaa0s4oxgIconCompatParcelizer == null) {
            sentryOptions.getLogger().IconCompatParcelizer(r8lambdaL32xCEzW71g2Xzeh1NM3NImxco.DEBUG, "Recorder config is not set, not creating segment for task: ".concat(str), new Object[0]);
            return;
        }
        long j = sentryOptions.getSessionReplay().read;
        long jIconCompatParcelizer = this.ResultReceiver.IconCompatParcelizer();
        io.sentry.android.replay.MediaBrowserCompatMediaItem mediaBrowserCompatMediaItem = this.write;
        if (mediaBrowserCompatMediaItem != null) {
            UriActionExternalSyntheticLambda4 uriActionExternalSyntheticLambda4Serializer = mediaBrowserCompatMediaItem.read.serializer();
            try {
                io.sentry.android.replay.MediaDescriptionCompat mediaDescriptionCompat = (io.sentry.android.replay.MediaDescriptionCompat) onContentCardDismissed.MediaMetadataCompat((List) mediaBrowserCompatMediaItem.write);
                Long lValueOf = mediaDescriptionCompat != null ? Long.valueOf(mediaDescriptionCompat.RemoteActionCompatParcelizer) : null;
                Okio.RemoteActionCompatParcelizer(uriActionExternalSyntheticLambda4Serializer, null);
                if (lValueOf == null || (dateIconCompatParcelizer = setNativeShader.IconCompatParcelizer(lValueOf.longValue())) == null) {
                    dateIconCompatParcelizer = setNativeShader.IconCompatParcelizer(jIconCompatParcelizer - j);
                }
            } catch (Throwable th) {
                try {
                    throw th;
                } catch (Throwable th2) {
                    Okio.RemoteActionCompatParcelizer(uriActionExternalSyntheticLambda4Serializer, th);
                    throw th2;
                }
            }
        } else {
            dateIconCompatParcelizer = setNativeShader.IconCompatParcelizer(jIconCompatParcelizer - j);
        }
        dateIconCompatParcelizer.getClass();
        this.MediaSessionCompatToken.submit(new io.sentry.android.replay.util.IconCompatParcelizer(new serializer(this, jIconCompatParcelizer - dateIconCompatParcelizer.getTime(), dateIconCompatParcelizer, write(), r8lambdaquuwrpysdd6n6dd7wraaa0s4oxgIconCompatParcelizer, r8lambdaunavo3sxub_pc9xroryotnrlvsm, 0), "BufferCaptureStrategy.".concat(str)));
    }

    @Override // io.sentry.android.replay.capture.RemoteActionCompatParcelizer
    public final void MediaBrowserCompatMediaItem() {
        io.sentry.android.replay.MediaBrowserCompatMediaItem mediaBrowserCompatMediaItem = this.write;
        this.MediaSessionCompatToken.submit(new io.sentry.android.replay.util.IconCompatParcelizer(new Scopes$$ExternalSyntheticLambda0(mediaBrowserCompatMediaItem != null ? mediaBrowserCompatMediaItem.IconCompatParcelizer() : null, 24, this), "BufferCaptureStrategy.stop"));
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
}
