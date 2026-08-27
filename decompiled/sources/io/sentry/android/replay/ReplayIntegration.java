package io.sentry.android.replay;

import android.content.Context;
import android.graphics.Bitmap;
import androidx.datastore.core.SingleProcessDataStore$file$2;
import com.mapbox.search.base.location.LocationEngineAdapter;
import com.sentiance.sdk.task.e$$ExternalSyntheticLambda0;
import io.grpc.internal.SharedResourcePool;
import io.sentry.SentryOptions;
import java.io.Closeable;
import java.io.File;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.TuplesKt;
import kotlinx.coroutines.DelayKt;
import o.BannerViewcreateBannerWebViewClientListener1;
import o.BrazeActionUtilsWhenMappings;
import o.BrazeBaseFragmentActivity;
import o.FocusManager;
import o.LogCustomEventStep;
import o.UriActionExternalSyntheticLambda4;
import o.accessgetDismissSubscriberp;
import o.createInAppMessageEventSubscriber;
import o.fromNullableFields;
import o.getActionTypeandroid_sdk_ui_release;
import o.hideCurrentlyDisplayingInAppMessage;
import o.internalHeightCallbacklambda0;
import o.isAdapterPositionOnScreen;
import o.openUriWithActionViewFromPush;
import o.parseUseWebViewFromQueryBundle;
import o.parselambda1;
import o.r8lambdaL32xCEzW71g2Xzeh1NM3NImxco;
import o.r8lambdaTNtTDMxkDDgiI2m22ZXaLqsE;
import o.removeNodeAtDepth;
import o.setCarryoverInAppMessage;
import okio.Okio;

/* JADX INFO: loaded from: classes4.dex */
public final class ReplayIntegration implements LogCustomEventStep, Closeable, fromNullableFields, parselambda1, io.sentry.transport.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus {
    public static final /* synthetic */ int write = 0;
    public accessgetDismissSubscriberp ComponentActivity;
    public final Context IconCompatParcelizer;
    public final PlaybackStateCompat MediaBrowserCompatMediaItem;
    public volatile getActionTypeandroid_sdk_ui_release MediaDescriptionCompat;
    public final AtomicBoolean MediaMetadataCompat;
    public final io.sentry.util.RemoteActionCompatParcelizer MediaSessionCompatQueueItem;
    public SentryOptions MediaSessionCompatResultReceiverWrapper;
    public BrazeBaseFragmentActivity MediaSessionCompatToken;
    public r8lambdawJ5MHcSJed_CjC7r4OWD0UxyJsQ ParcelableVolumeInfo;
    public final SharedResourcePool PlaybackStateCompat;
    public final isAdapterPositionOnScreen PlaybackStateCompatCustomAction;
    public final AtomicBoolean RatingCompat;
    public final io.sentry.transport.IconCompatParcelizer RemoteActionCompatParcelizer;
    public final isAdapterPositionOnScreen r8lambda54BeH8ZsBru0CXI2CCSP2syNys;
    public final isAdapterPositionOnScreen r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus;
    public io.sentry.android.replay.gestures.serializer read;
    public io.sentry.android.replay.capture.RemoteActionCompatParcelizer serializer;

    @Override // o.fromNullableFields
    public final void IconCompatParcelizer(serializer serializerVar) {
        this.MediaSessionCompatToken = serializerVar;
    }

    @Override // o.fromNullableFields
    public final BrazeBaseFragmentActivity MediaSessionCompatQueueItem() {
        return this.MediaSessionCompatToken;
    }

    public ReplayIntegration(Context context) {
        io.sentry.transport.IconCompatParcelizer iconCompatParcelizer = io.sentry.transport.IconCompatParcelizer.write;
        Context applicationContext = context.getApplicationContext();
        this.IconCompatParcelizer = applicationContext != null ? applicationContext : context;
        this.RemoteActionCompatParcelizer = iconCompatParcelizer;
        this.MediaDescriptionCompat = getActionTypeandroid_sdk_ui_release.UNKNOWN;
        this.PlaybackStateCompatCustomAction = new isAdapterPositionOnScreen(MediaSessionCompatToken.read);
        this.r8lambda54BeH8ZsBru0CXI2CCSP2syNys = new isAdapterPositionOnScreen(MediaSessionCompatToken.RemoteActionCompatParcelizer);
        this.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus = new isAdapterPositionOnScreen(new SingleProcessDataStore$file$2(16, this));
        this.RatingCompat = new AtomicBoolean(false);
        this.MediaMetadataCompat = new AtomicBoolean(false);
        this.MediaSessionCompatToken = r8lambdaTNtTDMxkDDgiI2m22ZXaLqsE.RemoteActionCompatParcelizer;
        this.PlaybackStateCompat = new SharedResourcePool(28);
        this.MediaSessionCompatQueueItem = new io.sentry.util.RemoteActionCompatParcelizer();
        PlaybackStateCompat playbackStateCompat = new PlaybackStateCompat();
        playbackStateCompat.serializer = r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus.INITIAL;
        this.MediaBrowserCompatMediaItem = playbackStateCompat;
    }

    @Override // o.fromNullableFields
    public final void PlaybackStateCompatCustomAction() {
        PlaybackStateCompat playbackStateCompat = this.MediaBrowserCompatMediaItem;
        UriActionExternalSyntheticLambda4 uriActionExternalSyntheticLambda4Serializer = this.MediaSessionCompatQueueItem.serializer();
        try {
            if (this.RatingCompat.get()) {
                r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus r8lambda7awclmlnptireoc8eoyg0revmus = r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus.STOPPED;
                if (playbackStateCompat.write(r8lambda7awclmlnptireoc8eoyg0revmus)) {
                    if (this.ParcelableVolumeInfo != null) {
                        ResultReceiver resultReceiver = ((r8lambda7IJBVrN0sHyidCAZufWEJFc7yY) this.r8lambda54BeH8ZsBru0CXI2CCSP2syNys.MediaSessionCompatResultReceiverWrapper()).read();
                        r8lambdawJ5MHcSJed_CjC7r4OWD0UxyJsQ r8lambdawj5mhcsjed_cjc7r4owd0uxyjsq = this.ParcelableVolumeInfo;
                        r8lambdawj5mhcsjed_cjc7r4owd0uxyjsq.getClass();
                        resultReceiver.remove(r8lambdawj5mhcsjed_cjc7r4owd0uxyjsq);
                    }
                    ((r8lambda7IJBVrN0sHyidCAZufWEJFc7yY) this.r8lambda54BeH8ZsBru0CXI2CCSP2syNys.MediaSessionCompatResultReceiverWrapper()).read().remove(this.read);
                    r8lambdawJ5MHcSJed_CjC7r4OWD0UxyJsQ r8lambdawj5mhcsjed_cjc7r4owd0uxyjsq2 = this.ParcelableVolumeInfo;
                    if (r8lambdawj5mhcsjed_cjc7r4owd0uxyjsq2 != null) {
                        r8lambdawj5mhcsjed_cjc7r4owd0uxyjsq2.write();
                    }
                    r8lambdawJ5MHcSJed_CjC7r4OWD0UxyJsQ r8lambdawj5mhcsjed_cjc7r4owd0uxyjsq3 = this.ParcelableVolumeInfo;
                    if (r8lambdawj5mhcsjed_cjc7r4owd0uxyjsq3 != null) {
                        r8lambdawj5mhcsjed_cjc7r4owd0uxyjsq3.MediaSessionCompatQueueItem();
                    }
                    io.sentry.android.replay.gestures.serializer serializerVar = this.read;
                    if (serializerVar != null) {
                        serializerVar.RemoteActionCompatParcelizer();
                    }
                    io.sentry.android.replay.capture.RemoteActionCompatParcelizer remoteActionCompatParcelizer = this.serializer;
                    if (remoteActionCompatParcelizer != null) {
                        remoteActionCompatParcelizer.MediaBrowserCompatMediaItem();
                    }
                    this.serializer = null;
                    playbackStateCompat.serializer = r8lambda7awclmlnptireoc8eoyg0revmus;
                    Okio.RemoteActionCompatParcelizer(uriActionExternalSyntheticLambda4Serializer, null);
                    return;
                }
            }
            Okio.RemoteActionCompatParcelizer(uriActionExternalSyntheticLambda4Serializer, null);
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                Okio.RemoteActionCompatParcelizer(uriActionExternalSyntheticLambda4Serializer, th);
                throw th2;
            }
        }
    }

    @Override // o.fromNullableFields
    public final void RatingCompat() {
        io.sentry.android.replay.capture.RemoteActionCompatParcelizer writeVar;
        PlaybackStateCompat playbackStateCompat = this.MediaBrowserCompatMediaItem;
        UriActionExternalSyntheticLambda4 uriActionExternalSyntheticLambda4Serializer = this.MediaSessionCompatQueueItem.serializer();
        try {
            if (!this.RatingCompat.get()) {
                Okio.RemoteActionCompatParcelizer(uriActionExternalSyntheticLambda4Serializer, null);
                return;
            }
            r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus r8lambda7awclmlnptireoc8eoyg0revmus = r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus.STARTED;
            if (!playbackStateCompat.write(r8lambda7awclmlnptireoc8eoyg0revmus)) {
                SentryOptions sentryOptions = this.MediaSessionCompatResultReceiverWrapper;
                if (sentryOptions == null) {
                    removeNodeAtDepth.serializer("options");
                    throw null;
                }
                sentryOptions.getLogger().IconCompatParcelizer(r8lambdaL32xCEzW71g2Xzeh1NM3NImxco.DEBUG, "Session replay is already being recorded, not starting a new one", new Object[0]);
                Okio.RemoteActionCompatParcelizer(uriActionExternalSyntheticLambda4Serializer, null);
                return;
            }
            io.sentry.util.ParcelableVolumeInfo parcelableVolumeInfo = (io.sentry.util.ParcelableVolumeInfo) this.PlaybackStateCompatCustomAction.MediaSessionCompatResultReceiverWrapper();
            SentryOptions sentryOptions2 = this.MediaSessionCompatResultReceiverWrapper;
            if (sentryOptions2 == null) {
                removeNodeAtDepth.serializer("options");
                throw null;
            }
            boolean z = io.sentry.android.replay.util.MediaDescriptionCompat.read(parcelableVolumeInfo, sentryOptions2.getSessionReplay().r8lambda54BeH8ZsBru0CXI2CCSP2syNys);
            if (!z) {
                SentryOptions sentryOptions3 = this.MediaSessionCompatResultReceiverWrapper;
                if (sentryOptions3 == null) {
                    removeNodeAtDepth.serializer("options");
                    throw null;
                }
                Double d = sentryOptions3.getSessionReplay().PlaybackStateCompat;
                if (d == null || d.doubleValue() <= 0.0d) {
                    SentryOptions sentryOptions4 = this.MediaSessionCompatResultReceiverWrapper;
                    if (sentryOptions4 == null) {
                        removeNodeAtDepth.serializer("options");
                        throw null;
                    }
                    sentryOptions4.getLogger().IconCompatParcelizer(r8lambdaL32xCEzW71g2Xzeh1NM3NImxco.INFO, "Session replay is not started, full session was not sampled and onErrorSampleRate is not specified", new Object[0]);
                    Okio.RemoteActionCompatParcelizer(uriActionExternalSyntheticLambda4Serializer, null);
                    return;
                }
            }
            playbackStateCompat.serializer = r8lambda7awclmlnptireoc8eoyg0revmus;
            if (z) {
                SentryOptions sentryOptions5 = this.MediaSessionCompatResultReceiverWrapper;
                if (sentryOptions5 == null) {
                    removeNodeAtDepth.serializer("options");
                    throw null;
                }
                writeVar = new io.sentry.android.replay.capture.ParcelableVolumeInfo(sentryOptions5, this.ComponentActivity, this.RemoteActionCompatParcelizer, (io.sentry.android.replay.util.write) this.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus.MediaSessionCompatResultReceiverWrapper());
            } else {
                SentryOptions sentryOptions6 = this.MediaSessionCompatResultReceiverWrapper;
                if (sentryOptions6 == null) {
                    removeNodeAtDepth.serializer("options");
                    throw null;
                }
                writeVar = new io.sentry.android.replay.capture.write(sentryOptions6, this.ComponentActivity, this.RemoteActionCompatParcelizer, (io.sentry.util.ParcelableVolumeInfo) this.PlaybackStateCompatCustomAction.MediaSessionCompatResultReceiverWrapper(), (io.sentry.android.replay.util.write) this.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus.MediaSessionCompatResultReceiverWrapper());
            }
            this.serializer = writeVar;
            r8lambdawJ5MHcSJed_CjC7r4OWD0UxyJsQ r8lambdawj5mhcsjed_cjc7r4owd0uxyjsq = this.ParcelableVolumeInfo;
            if (r8lambdawj5mhcsjed_cjc7r4owd0uxyjsq != null) {
                r8lambdawj5mhcsjed_cjc7r4owd0uxyjsq.read();
            }
            io.sentry.android.replay.capture.RemoteActionCompatParcelizer remoteActionCompatParcelizer = this.serializer;
            if (remoteActionCompatParcelizer != null) {
                remoteActionCompatParcelizer.write(0, new io.sentry.protocol.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg(), null);
            }
            if (this.ParcelableVolumeInfo != null) {
                ResultReceiver resultReceiver = ((r8lambda7IJBVrN0sHyidCAZufWEJFc7yY) this.r8lambda54BeH8ZsBru0CXI2CCSP2syNys.MediaSessionCompatResultReceiverWrapper()).read();
                r8lambdawJ5MHcSJed_CjC7r4OWD0UxyJsQ r8lambdawj5mhcsjed_cjc7r4owd0uxyjsq2 = this.ParcelableVolumeInfo;
                r8lambdawj5mhcsjed_cjc7r4owd0uxyjsq2.getClass();
                resultReceiver.add(r8lambdawj5mhcsjed_cjc7r4owd0uxyjsq2);
            }
            ((r8lambda7IJBVrN0sHyidCAZufWEJFc7yY) this.r8lambda54BeH8ZsBru0CXI2CCSP2syNys.MediaSessionCompatResultReceiverWrapper()).read().add(this.read);
            Okio.RemoteActionCompatParcelizer(uriActionExternalSyntheticLambda4Serializer, null);
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                Okio.RemoteActionCompatParcelizer(uriActionExternalSyntheticLambda4Serializer, th);
                throw th2;
            }
        }
    }

    public final void RemoteActionCompatParcelizer() {
        accessgetDismissSubscriberp accessgetdismisssubscriberp;
        accessgetDismissSubscriberp accessgetdismisssubscriberp2;
        io.sentry.transport.PlaybackStateCompat playbackStateCompatWrite;
        io.sentry.transport.PlaybackStateCompat playbackStateCompatWrite2;
        UriActionExternalSyntheticLambda4 uriActionExternalSyntheticLambda4Serializer = this.MediaSessionCompatQueueItem.serializer();
        try {
            if (this.RatingCompat.get()) {
                PlaybackStateCompat playbackStateCompat = this.MediaBrowserCompatMediaItem;
                r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus r8lambda7awclmlnptireoc8eoyg0revmus = r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus.RESUMED;
                if (playbackStateCompat.write(r8lambda7awclmlnptireoc8eoyg0revmus)) {
                    if (!this.MediaMetadataCompat.get() && this.MediaDescriptionCompat != getActionTypeandroid_sdk_ui_release.DISCONNECTED && (((accessgetdismisssubscriberp = this.ComponentActivity) == null || (playbackStateCompatWrite2 = accessgetdismisssubscriberp.write()) == null || !playbackStateCompatWrite2.serializer(openUriWithActionViewFromPush.All)) && ((accessgetdismisssubscriberp2 = this.ComponentActivity) == null || (playbackStateCompatWrite = accessgetdismisssubscriberp2.write()) == null || !playbackStateCompatWrite.serializer(openUriWithActionViewFromPush.Replay)))) {
                        PlaybackStateCompat playbackStateCompat2 = this.MediaBrowserCompatMediaItem;
                        playbackStateCompat2.getClass();
                        playbackStateCompat2.serializer = r8lambda7awclmlnptireoc8eoyg0revmus;
                        io.sentry.android.replay.capture.RemoteActionCompatParcelizer remoteActionCompatParcelizer = this.serializer;
                        if (remoteActionCompatParcelizer != null) {
                            remoteActionCompatParcelizer.MediaSessionCompatQueueItem();
                        }
                        r8lambdawJ5MHcSJed_CjC7r4OWD0UxyJsQ r8lambdawj5mhcsjed_cjc7r4owd0uxyjsq = this.ParcelableVolumeInfo;
                        if (r8lambdawj5mhcsjed_cjc7r4owd0uxyjsq != null) {
                            r8lambdawj5mhcsjed_cjc7r4owd0uxyjsq.serializer();
                        }
                        Okio.RemoteActionCompatParcelizer(uriActionExternalSyntheticLambda4Serializer, null);
                        return;
                    }
                    Okio.RemoteActionCompatParcelizer(uriActionExternalSyntheticLambda4Serializer, null);
                    return;
                }
            }
            Okio.RemoteActionCompatParcelizer(uriActionExternalSyntheticLambda4Serializer, null);
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                Okio.RemoteActionCompatParcelizer(uriActionExternalSyntheticLambda4Serializer, th);
                throw th2;
            }
        }
    }

    public final void RemoteActionCompatParcelizer(int i, int i2) {
        r8lambdawJ5MHcSJed_CjC7r4OWD0UxyJsQ r8lambdawj5mhcsjed_cjc7r4owd0uxyjsq;
        if (this.RatingCompat.get() && read()) {
            SentryOptions sentryOptions = this.MediaSessionCompatResultReceiverWrapper;
            if (sentryOptions == null) {
                removeNodeAtDepth.serializer("options");
                throw null;
            }
            if (sentryOptions.getSessionReplay().ResultReceiver) {
                Context context = this.IconCompatParcelizer;
                SentryOptions sentryOptions2 = this.MediaSessionCompatResultReceiverWrapper;
                if (sentryOptions2 == null) {
                    removeNodeAtDepth.serializer("options");
                    throw null;
                }
                parseUseWebViewFromQueryBundle sessionReplay = sentryOptions2.getSessionReplay();
                sessionReplay.getClass();
                r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg r8lambdaquuwrpysdd6n6dd7wraaa0s4oxgSerializer = FocusManager.serializer(context, sessionReplay, i, i2);
                if (this.RatingCompat.get() && read()) {
                    io.sentry.android.replay.capture.RemoteActionCompatParcelizer remoteActionCompatParcelizer = this.serializer;
                    if (remoteActionCompatParcelizer != null) {
                        remoteActionCompatParcelizer.serializer(r8lambdaquuwrpysdd6n6dd7wraaa0s4oxgSerializer);
                    }
                    r8lambdawJ5MHcSJed_CjC7r4OWD0UxyJsQ r8lambdawj5mhcsjed_cjc7r4owd0uxyjsq2 = this.ParcelableVolumeInfo;
                    if (r8lambdawj5mhcsjed_cjc7r4owd0uxyjsq2 != null) {
                        r8lambdawj5mhcsjed_cjc7r4owd0uxyjsq2.write(r8lambdaquuwrpysdd6n6dd7wraaa0s4oxgSerializer);
                    }
                    if (this.MediaBrowserCompatMediaItem.serializer != r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus.PAUSED || (r8lambdawj5mhcsjed_cjc7r4owd0uxyjsq = this.ParcelableVolumeInfo) == null) {
                        return;
                    }
                    r8lambdawj5mhcsjed_cjc7r4owd0uxyjsq.RemoteActionCompatParcelizer();
                }
            }
        }
    }

    @Override // o.LogCustomEventStep
    public final void RemoteActionCompatParcelizer(SentryOptions sentryOptions) {
        Double d;
        this.MediaSessionCompatResultReceiverWrapper = sentryOptions;
        Double d2 = sentryOptions.getSessionReplay().r8lambda54BeH8ZsBru0CXI2CCSP2syNys;
        if ((d2 == null || d2.doubleValue() <= 0.0d) && ((d = sentryOptions.getSessionReplay().PlaybackStateCompat) == null || d.doubleValue() <= 0.0d)) {
            sentryOptions.getLogger().IconCompatParcelizer(r8lambdaL32xCEzW71g2Xzeh1NM3NImxco.INFO, "Session replay is disabled, no sample rate specified", new Object[0]);
            return;
        }
        accessgetDismissSubscriberp accessgetdismisssubscriberp = accessgetDismissSubscriberp.IconCompatParcelizer;
        this.ComponentActivity = accessgetdismisssubscriberp;
        this.ParcelableVolumeInfo = new r8lambdawJ5MHcSJed_CjC7r4OWD0UxyJsQ(sentryOptions, this, this, this.PlaybackStateCompat, (io.sentry.android.replay.util.write) this.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus.MediaSessionCompatResultReceiverWrapper());
        this.read = new io.sentry.android.replay.gestures.serializer(sentryOptions, this);
        this.RatingCompat.set(true);
        sentryOptions.getConnectionStatusProvider().read(this);
        io.sentry.transport.PlaybackStateCompat playbackStateCompatWrite = accessgetdismisssubscriberp.write();
        if (playbackStateCompatWrite != null) {
            ((CopyOnWriteArrayList) playbackStateCompatWrite.serializer).add(this);
        }
        DelayKt.MediaSessionCompatToken("Replay");
        SentryOptions sentryOptions2 = this.MediaSessionCompatResultReceiverWrapper;
        if (sentryOptions2 == null) {
            removeNodeAtDepth.serializer("options");
            throw null;
        }
        BrazeActionUtilsWhenMappings executorService = sentryOptions2.getExecutorService();
        executorService.getClass();
        SentryOptions sentryOptions3 = this.MediaSessionCompatResultReceiverWrapper;
        if (sentryOptions3 != null) {
            io.sentry.android.replay.util.read.IconCompatParcelizer(executorService, sentryOptions3, new e$$ExternalSyntheticLambda0(22, this));
        } else {
            removeNodeAtDepth.serializer("options");
            throw null;
        }
    }

    @Override // o.fromNullableFields
    public final void RemoteActionCompatParcelizer(Boolean bool) {
        if (this.RatingCompat.get() && read()) {
            io.sentry.protocol.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg r8lambdaquuwrpysdd6n6dd7wraaa0s4oxg = io.sentry.protocol.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg.serializer;
            io.sentry.android.replay.capture.RemoteActionCompatParcelizer remoteActionCompatParcelizer = this.serializer;
            if (r8lambdaquuwrpysdd6n6dd7wraaa0s4oxg.equals(remoteActionCompatParcelizer != null ? remoteActionCompatParcelizer.write() : null)) {
                SentryOptions sentryOptions = this.MediaSessionCompatResultReceiverWrapper;
                if (sentryOptions != null) {
                    sentryOptions.getLogger().IconCompatParcelizer(r8lambdaL32xCEzW71g2Xzeh1NM3NImxco.DEBUG, "Replay id is not set, not capturing for event", new Object[0]);
                    return;
                } else {
                    removeNodeAtDepth.serializer("options");
                    throw null;
                }
            }
            io.sentry.android.replay.capture.RemoteActionCompatParcelizer remoteActionCompatParcelizer2 = this.serializer;
            if (remoteActionCompatParcelizer2 != null) {
                remoteActionCompatParcelizer2.read(bool.equals(Boolean.TRUE), new LocationEngineAdapter.AnonymousClass1(4, this));
            }
            io.sentry.android.replay.capture.RemoteActionCompatParcelizer remoteActionCompatParcelizer3 = this.serializer;
            this.serializer = remoteActionCompatParcelizer3 != null ? remoteActionCompatParcelizer3.serializer() : null;
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        io.sentry.transport.PlaybackStateCompat playbackStateCompatWrite;
        PlaybackStateCompat playbackStateCompat = this.MediaBrowserCompatMediaItem;
        UriActionExternalSyntheticLambda4 uriActionExternalSyntheticLambda4Serializer = this.MediaSessionCompatQueueItem.serializer();
        try {
            if (this.RatingCompat.get()) {
                r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus r8lambda7awclmlnptireoc8eoyg0revmus = r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus.CLOSED;
                if (playbackStateCompat.write(r8lambda7awclmlnptireoc8eoyg0revmus)) {
                    SentryOptions sentryOptions = this.MediaSessionCompatResultReceiverWrapper;
                    if (sentryOptions == null) {
                        removeNodeAtDepth.serializer("options");
                        throw null;
                    }
                    sentryOptions.getConnectionStatusProvider().write(this);
                    accessgetDismissSubscriberp accessgetdismisssubscriberp = this.ComponentActivity;
                    if (accessgetdismisssubscriberp != null && (playbackStateCompatWrite = accessgetdismisssubscriberp.write()) != null) {
                        ((CopyOnWriteArrayList) playbackStateCompatWrite.serializer).remove(this);
                    }
                    PlaybackStateCompatCustomAction();
                    r8lambdawJ5MHcSJed_CjC7r4OWD0UxyJsQ r8lambdawj5mhcsjed_cjc7r4owd0uxyjsq = this.ParcelableVolumeInfo;
                    if (r8lambdawj5mhcsjed_cjc7r4owd0uxyjsq != null) {
                        r8lambdawj5mhcsjed_cjc7r4owd0uxyjsq.close();
                    }
                    this.ParcelableVolumeInfo = null;
                    ((r8lambda7IJBVrN0sHyidCAZufWEJFc7yY) this.r8lambda54BeH8ZsBru0CXI2CCSP2syNys.MediaSessionCompatResultReceiverWrapper()).close();
                    ((io.sentry.android.replay.util.write) this.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus.MediaSessionCompatResultReceiverWrapper()).shutdown();
                    playbackStateCompat.serializer = r8lambda7awclmlnptireoc8eoyg0revmus;
                    Okio.RemoteActionCompatParcelizer(uriActionExternalSyntheticLambda4Serializer, null);
                    return;
                }
            }
            Okio.RemoteActionCompatParcelizer(uriActionExternalSyntheticLambda4Serializer, null);
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                Okio.RemoteActionCompatParcelizer(uriActionExternalSyntheticLambda4Serializer, th);
                throw th2;
            }
        }
    }

    public final boolean read() {
        return this.MediaBrowserCompatMediaItem.serializer.compareTo(r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus.STARTED) >= 0 && this.MediaBrowserCompatMediaItem.serializer.compareTo(r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus.STOPPED) < 0;
    }

    public final void serializer() {
        PlaybackStateCompat playbackStateCompat = this.MediaBrowserCompatMediaItem;
        UriActionExternalSyntheticLambda4 uriActionExternalSyntheticLambda4Serializer = this.MediaSessionCompatQueueItem.serializer();
        try {
            if (this.RatingCompat.get()) {
                r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus r8lambda7awclmlnptireoc8eoyg0revmus = r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus.PAUSED;
                if (playbackStateCompat.write(r8lambda7awclmlnptireoc8eoyg0revmus)) {
                    r8lambdawJ5MHcSJed_CjC7r4OWD0UxyJsQ r8lambdawj5mhcsjed_cjc7r4owd0uxyjsq = this.ParcelableVolumeInfo;
                    if (r8lambdawj5mhcsjed_cjc7r4owd0uxyjsq != null) {
                        r8lambdawj5mhcsjed_cjc7r4owd0uxyjsq.RemoteActionCompatParcelizer();
                    }
                    io.sentry.android.replay.capture.RemoteActionCompatParcelizer remoteActionCompatParcelizer = this.serializer;
                    if (remoteActionCompatParcelizer != null) {
                        remoteActionCompatParcelizer.read();
                    }
                    playbackStateCompat.serializer = r8lambda7awclmlnptireoc8eoyg0revmus;
                    Okio.RemoteActionCompatParcelizer(uriActionExternalSyntheticLambda4Serializer, null);
                    return;
                }
            }
            Okio.RemoteActionCompatParcelizer(uriActionExternalSyntheticLambda4Serializer, null);
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                Okio.RemoteActionCompatParcelizer(uriActionExternalSyntheticLambda4Serializer, th);
                throw th2;
            }
        }
    }

    @Override // io.sentry.transport.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus
    public final void serializer(io.sentry.transport.PlaybackStateCompat playbackStateCompat) {
        if (this.serializer instanceof io.sentry.android.replay.capture.ParcelableVolumeInfo) {
            if (playbackStateCompat.serializer(openUriWithActionViewFromPush.All) || playbackStateCompat.serializer(openUriWithActionViewFromPush.Replay)) {
                serializer();
            } else {
                RemoteActionCompatParcelizer();
            }
        }
    }

    @Override // o.fromNullableFields
    public final void MediaBrowserCompatMediaItem() {
        this.MediaMetadataCompat.set(false);
        RemoteActionCompatParcelizer();
    }

    @Override // o.fromNullableFields
    public final void MediaDescriptionCompat() {
        this.MediaMetadataCompat.set(true);
        serializer();
    }

    @Override // o.parselambda1
    public final void serializer(getActionTypeandroid_sdk_ui_release getactiontypeandroid_sdk_ui_release) {
        getactiontypeandroid_sdk_ui_release.getClass();
        this.MediaDescriptionCompat = getactiontypeandroid_sdk_ui_release;
        if (this.serializer instanceof io.sentry.android.replay.capture.ParcelableVolumeInfo) {
            if (getactiontypeandroid_sdk_ui_release == getActionTypeandroid_sdk_ui_release.DISCONNECTED) {
                serializer();
            } else {
                RemoteActionCompatParcelizer();
            }
        }
    }

    @Override // o.fromNullableFields
    public final io.sentry.protocol.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg MediaMetadataCompat() {
        io.sentry.protocol.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg r8lambdaquuwrpysdd6n6dd7wraaa0s4oxgWrite;
        io.sentry.android.replay.capture.RemoteActionCompatParcelizer remoteActionCompatParcelizer = this.serializer;
        if (remoteActionCompatParcelizer != null && (r8lambdaquuwrpysdd6n6dd7wraaa0s4oxgWrite = remoteActionCompatParcelizer.write()) != null) {
            return r8lambdaquuwrpysdd6n6dd7wraaa0s4oxgWrite;
        }
        io.sentry.protocol.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg r8lambdaquuwrpysdd6n6dd7wraaa0s4oxg = io.sentry.protocol.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg.serializer;
        r8lambdaquuwrpysdd6n6dd7wraaa0s4oxg.getClass();
        return r8lambdaquuwrpysdd6n6dd7wraaa0s4oxg;
    }

    public final void serializer(String str) {
        File[] fileArrListFiles;
        SentryOptions sentryOptions = this.MediaSessionCompatResultReceiverWrapper;
        if (sentryOptions == null) {
            removeNodeAtDepth.serializer("options");
            throw null;
        }
        String cacheDirPath = sentryOptions.getCacheDirPath();
        if (cacheDirPath == null || (fileArrListFiles = new File(cacheDirPath).listFiles()) == null) {
            return;
        }
        for (File file : fileArrListFiles) {
            String name = file.getName();
            name.getClass();
            if (setCarryoverInAppMessage.RemoteActionCompatParcelizer(name, "replay_", false)) {
                String string = MediaMetadataCompat().toString();
                string.getClass();
                if (!hideCurrentlyDisplayingInAppMessage.IconCompatParcelizer((CharSequence) name, (CharSequence) string, false) && (hideCurrentlyDisplayingInAppMessage.serializer((CharSequence) str) || !hideCurrentlyDisplayingInAppMessage.IconCompatParcelizer((CharSequence) name, (CharSequence) str, false))) {
                    TuplesKt.serializer(file);
                }
            }
        }
    }

    public final void serializer(Bitmap bitmap) {
        accessgetDismissSubscriberp accessgetdismisssubscriberp;
        accessgetDismissSubscriberp accessgetdismisssubscriberp2;
        io.sentry.transport.PlaybackStateCompat playbackStateCompatWrite;
        io.sentry.transport.PlaybackStateCompat playbackStateCompatWrite2;
        bitmap.getClass();
        createInAppMessageEventSubscriber createinappmessageeventsubscriber = new createInAppMessageEventSubscriber();
        if (this.ComponentActivity != null) {
            internalHeightCallbacklambda0.read(new ReplayIntegration$$ExternalSyntheticLambda1(createinappmessageeventsubscriber, 0));
        }
        io.sentry.android.replay.capture.RemoteActionCompatParcelizer remoteActionCompatParcelizer = this.serializer;
        if (remoteActionCompatParcelizer != null) {
            remoteActionCompatParcelizer.RemoteActionCompatParcelizer(new PlaybackStateCompatCustomAction(bitmap, createinappmessageeventsubscriber));
        }
        if (this.serializer instanceof io.sentry.android.replay.capture.ParcelableVolumeInfo) {
            if (this.MediaDescriptionCompat == getActionTypeandroid_sdk_ui_release.DISCONNECTED || !(((accessgetdismisssubscriberp = this.ComponentActivity) == null || (playbackStateCompatWrite2 = accessgetdismisssubscriberp.write()) == null || !playbackStateCompatWrite2.serializer(openUriWithActionViewFromPush.All)) && ((accessgetdismisssubscriberp2 = this.ComponentActivity) == null || (playbackStateCompatWrite = accessgetdismisssubscriberp2.write()) == null || !playbackStateCompatWrite.serializer(openUriWithActionViewFromPush.Replay)))) {
                serializer();
            }
        }
    }

    static {
        BannerViewcreateBannerWebViewClientListener1.RemoteActionCompatParcelizer().IconCompatParcelizer("maven:io.sentry:sentry-android-replay", "8.32.0");
    }
}
