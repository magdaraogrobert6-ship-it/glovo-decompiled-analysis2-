package io.sentry.android.core;

import com.sentiance.sdk.task.e$$ExternalSyntheticLambda0;
import com.sentiance.sdk.tile.j$$ExternalSyntheticLambda1;
import io.sentry.SentryOptions;
import io.sentry.android.core.internal.util.SentryFrameMetricsCollector;
import java.util.ArrayList;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.Future;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.atomic.AtomicBoolean;
import o.AddToCustomAttributeArrayStep;
import o.BrazeActionParserExternalSyntheticLambda0;
import o.BrazeActionUtilsWhenMappings;
import o.StepDataExternalSyntheticLambda0;
import o.StepDataargs_delegatelambda0inlinediterator1;
import o.UriActionExternalSyntheticLambda4;
import o.args_delegatelambda0;
import o.createBannerWebViewClientListenerandroid_sdk_ui_release;
import o.getActionTypeandroid_sdk_ui_release;
import o.getImpl;
import o.handleCardClicklambda3;
import o.internalHeightCallbacklambda0;
import o.openUriWithActionView;
import o.openUriWithActionViewFromPush;
import o.r8lambdaL32xCEzW71g2Xzeh1NM3NImxco;
import o.requestPushPermissionlambda0;

/* JADX INFO: loaded from: classes4.dex */
public final class serializer implements getImpl, io.sentry.transport.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus {
    public int ComponentActivity;
    public final SentryFrameMetricsCollector IconCompatParcelizer;
    public boolean MediaBrowserCompatMediaItem;
    public final io.sentry.util.RemoteActionCompatParcelizer MediaSessionCompatQueueItem;
    public final io.sentry.util.RemoteActionCompatParcelizer MediaSessionCompatResultReceiverWrapper;
    public openUriWithActionView PlaybackStateCompat;
    public io.sentry.protocol.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg PlaybackStateCompatCustomAction;
    public final BrazeActionParserExternalSyntheticLambda0 RatingCompat;
    public io.sentry.protocol.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg RemoteActionCompatParcelizer;
    public volatile boolean ResultReceiver;
    public AddToCustomAttributeArrayStep r8lambda54BeH8ZsBru0CXI2CCSP2syNys;
    public final int r8lambda7IJBVrN0sHyidCAZufWEJFc7yY;
    public final String r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus;
    public boolean r8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss;
    public Future r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg;
    public createBannerWebViewClientListenerandroid_sdk_ui_release r8lambdaXj9c8VIP9DfEvaTmZt0ejAuC4a4;
    public final AtomicBoolean read;
    public final BrazeActionUtilsWhenMappings serializer;
    public final r8lambdawJ5MHcSJed_CjC7r4OWD0UxyJsQ write;
    public boolean MediaDescriptionCompat = false;
    public AndroidProfiler ParcelableVolumeInfo = null;
    public boolean MediaMetadataCompat = false;
    public final ArrayList MediaSessionCompatToken = new ArrayList();

    @Override // o.getImpl
    public final void IconCompatParcelizer() {
        this.ResultReceiver = true;
    }

    @Override // o.getImpl
    public final io.sentry.protocol.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg write() {
        return this.PlaybackStateCompatCustomAction;
    }

    @Override // o.getImpl
    public final void RemoteActionCompatParcelizer(StepDataargs_delegatelambda0inlinediterator1 stepDataargs_delegatelambda0inlinediterator1) {
        UriActionExternalSyntheticLambda4 uriActionExternalSyntheticLambda4Serializer = this.MediaSessionCompatQueueItem.serializer();
        try {
            int i = read.read[stepDataargs_delegatelambda0inlinediterator1.ordinal()];
            if (i == 1) {
                int i2 = this.ComponentActivity - 1;
                this.ComponentActivity = i2;
                if (i2 > 0) {
                    uriActionExternalSyntheticLambda4Serializer.close();
                    return;
                } else {
                    if (i2 < 0) {
                        this.ComponentActivity = 0;
                    }
                    this.r8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss = true;
                }
            } else if (i == 2) {
                this.r8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss = true;
            }
            uriActionExternalSyntheticLambda4Serializer.close();
        } catch (Throwable th) {
            try {
                uriActionExternalSyntheticLambda4Serializer.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // o.getImpl
    public final void RemoteActionCompatParcelizer(StepDataargs_delegatelambda0inlinediterator1 stepDataargs_delegatelambda0inlinediterator1, handleCardClicklambda3 handlecardclicklambda3) {
        UriActionExternalSyntheticLambda4 uriActionExternalSyntheticLambda4Serializer = this.MediaSessionCompatQueueItem.serializer();
        try {
            if (this.ResultReceiver) {
                double dIconCompatParcelizer = io.sentry.util.MediaSessionCompatToken.read().IconCompatParcelizer();
                Double profileSessionSampleRate = handlecardclicklambda3.RemoteActionCompatParcelizer.getProfileSessionSampleRate();
                this.MediaBrowserCompatMediaItem = profileSessionSampleRate != null && profileSessionSampleRate.doubleValue() >= dIconCompatParcelizer;
                this.ResultReceiver = false;
            }
            if (!this.MediaBrowserCompatMediaItem) {
                this.RatingCompat.IconCompatParcelizer(r8lambdaL32xCEzW71g2Xzeh1NM3NImxco.DEBUG, "Profiler was not started due to sampling decision.", new Object[0]);
                uriActionExternalSyntheticLambda4Serializer.close();
                return;
            }
            int i = read.read[stepDataargs_delegatelambda0inlinediterator1.ordinal()];
            if (i == 1) {
                if (this.ComponentActivity < 0) {
                    this.ComponentActivity = 0;
                }
                this.ComponentActivity++;
            } else if (i == 2 && this.MediaMetadataCompat) {
                this.RatingCompat.IconCompatParcelizer(r8lambdaL32xCEzW71g2Xzeh1NM3NImxco.DEBUG, "Profiler is already running.", new Object[0]);
                uriActionExternalSyntheticLambda4Serializer.close();
                return;
            }
            if (!this.MediaMetadataCompat) {
                this.RatingCompat.IconCompatParcelizer(r8lambdaL32xCEzW71g2Xzeh1NM3NImxco.DEBUG, "Started Profiler.", new Object[0]);
                RemoteActionCompatParcelizer();
            }
            uriActionExternalSyntheticLambda4Serializer.close();
        } catch (Throwable th) {
            try {
                uriActionExternalSyntheticLambda4Serializer.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // io.sentry.transport.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus
    public final void serializer(io.sentry.transport.PlaybackStateCompat playbackStateCompat) {
        if (playbackStateCompat.serializer(openUriWithActionViewFromPush.All) || playbackStateCompat.serializer(openUriWithActionViewFromPush.ProfileChunkUi)) {
            this.RatingCompat.IconCompatParcelizer(r8lambdaL32xCEzW71g2Xzeh1NM3NImxco.WARNING, "SDK is rate limited. Stopping profiler.", new Object[0]);
            serializer(false);
        }
    }

    @Override // o.getImpl
    public final void write(boolean z) {
        UriActionExternalSyntheticLambda4 uriActionExternalSyntheticLambda4Serializer = this.MediaSessionCompatQueueItem.serializer();
        try {
            this.ComponentActivity = 0;
            this.r8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss = true;
            if (z) {
                serializer(false);
                this.read.set(true);
            }
            uriActionExternalSyntheticLambda4Serializer.close();
        } catch (Throwable th) {
            try {
                uriActionExternalSyntheticLambda4Serializer.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public final void RemoteActionCompatParcelizer() {
        read();
        this.write.getClass();
        if (!this.MediaDescriptionCompat) {
            this.MediaDescriptionCompat = true;
            BrazeActionParserExternalSyntheticLambda0 brazeActionParserExternalSyntheticLambda0 = this.RatingCompat;
            String str = this.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus;
            if (str == null) {
                brazeActionParserExternalSyntheticLambda0.IconCompatParcelizer(r8lambdaL32xCEzW71g2Xzeh1NM3NImxco.WARNING, "Disabling profiling because no profiling traces dir path is defined in options.", new Object[0]);
            } else {
                int i = this.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY;
                if (i <= 0) {
                    brazeActionParserExternalSyntheticLambda0.IconCompatParcelizer(r8lambdaL32xCEzW71g2Xzeh1NM3NImxco.WARNING, "Disabling profiling because trace rate is set to %d", Integer.valueOf(i));
                } else {
                    this.ParcelableVolumeInfo = new AndroidProfiler(str, 1000000 / i, this.IconCompatParcelizer, null, brazeActionParserExternalSyntheticLambda0);
                }
            }
        }
        if (this.ParcelableVolumeInfo == null) {
            return;
        }
        AddToCustomAttributeArrayStep addToCustomAttributeArrayStep = this.r8lambda54BeH8ZsBru0CXI2CCSP2syNys;
        BrazeActionParserExternalSyntheticLambda0 brazeActionParserExternalSyntheticLambda1 = this.RatingCompat;
        if (addToCustomAttributeArrayStep != null) {
            io.sentry.transport.PlaybackStateCompat playbackStateCompatWrite = addToCustomAttributeArrayStep.write();
            if (playbackStateCompatWrite != null && (playbackStateCompatWrite.serializer(openUriWithActionViewFromPush.All) || playbackStateCompatWrite.serializer(openUriWithActionViewFromPush.ProfileChunkUi))) {
                brazeActionParserExternalSyntheticLambda1.IconCompatParcelizer(r8lambdaL32xCEzW71g2Xzeh1NM3NImxco.WARNING, "SDK is rate limited. Stopping profiler.", new Object[0]);
                serializer(false);
                return;
            } else {
                if (this.r8lambda54BeH8ZsBru0CXI2CCSP2syNys.RemoteActionCompatParcelizer().getConnectionStatusProvider().IconCompatParcelizer() == getActionTypeandroid_sdk_ui_release.DISCONNECTED) {
                    brazeActionParserExternalSyntheticLambda1.IconCompatParcelizer(r8lambdaL32xCEzW71g2Xzeh1NM3NImxco.WARNING, "Device is offline. Stopping profiler.", new Object[0]);
                    serializer(false);
                    return;
                }
                this.r8lambdaXj9c8VIP9DfEvaTmZt0ejAuC4a4 = this.r8lambda54BeH8ZsBru0CXI2CCSP2syNys.RemoteActionCompatParcelizer().getDateProvider().RemoteActionCompatParcelizer();
            }
        } else {
            this.r8lambdaXj9c8VIP9DfEvaTmZt0ejAuC4a4 = new requestPushPermissionlambda0();
        }
        if (this.ParcelableVolumeInfo.IconCompatParcelizer() == null) {
            return;
        }
        this.MediaMetadataCompat = true;
        io.sentry.protocol.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg r8lambdaquuwrpysdd6n6dd7wraaa0s4oxg = this.PlaybackStateCompatCustomAction;
        io.sentry.protocol.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg r8lambdaquuwrpysdd6n6dd7wraaa0s4oxg2 = io.sentry.protocol.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg.serializer;
        if (r8lambdaquuwrpysdd6n6dd7wraaa0s4oxg.equals(r8lambdaquuwrpysdd6n6dd7wraaa0s4oxg2)) {
            this.PlaybackStateCompatCustomAction = new io.sentry.protocol.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg();
        }
        if (this.RemoteActionCompatParcelizer.equals(r8lambdaquuwrpysdd6n6dd7wraaa0s4oxg2)) {
            this.RemoteActionCompatParcelizer = new io.sentry.protocol.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg();
        }
        openUriWithActionView openuriwithactionview = this.PlaybackStateCompat;
        if (openuriwithactionview != null) {
            openuriwithactionview.RemoteActionCompatParcelizer(this.RemoteActionCompatParcelizer.toString());
        }
        try {
            this.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg = this.serializer.IconCompatParcelizer(new e$$ExternalSyntheticLambda0(17, this), 60000L);
        } catch (RejectedExecutionException e) {
            brazeActionParserExternalSyntheticLambda1.serializer(r8lambdaL32xCEzW71g2Xzeh1NM3NImxco.ERROR, "Failed to schedule profiling chunk finish. Did you call Sentry.close()?", e);
            this.r8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss = true;
        }
    }

    public final void serializer(boolean z) {
        read();
        UriActionExternalSyntheticLambda4 uriActionExternalSyntheticLambda4Serializer = this.MediaSessionCompatQueueItem.serializer();
        try {
            Future future = this.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg;
            if (future != null) {
                future.cancel(true);
            }
            if (this.ParcelableVolumeInfo != null && this.MediaMetadataCompat) {
                this.write.getClass();
                openUriWithActionView openuriwithactionview = this.PlaybackStateCompat;
                PlaybackStateCompatCustomAction playbackStateCompatCustomActionSerializer = this.ParcelableVolumeInfo.serializer(openuriwithactionview != null ? openuriwithactionview.read(this.RemoteActionCompatParcelizer.toString()) : null, false);
                BrazeActionParserExternalSyntheticLambda0 brazeActionParserExternalSyntheticLambda0 = this.RatingCompat;
                if (playbackStateCompatCustomActionSerializer == null) {
                    brazeActionParserExternalSyntheticLambda0.IconCompatParcelizer(r8lambdaL32xCEzW71g2Xzeh1NM3NImxco.ERROR, "An error occurred while collecting a profile chunk, and it won't be sent.", new Object[0]);
                } else {
                    UriActionExternalSyntheticLambda4 uriActionExternalSyntheticLambda4Serializer2 = this.MediaSessionCompatResultReceiverWrapper.serializer();
                    try {
                        this.MediaSessionCompatToken.add(new StepDataExternalSyntheticLambda0(this.PlaybackStateCompatCustomAction, this.RemoteActionCompatParcelizer, playbackStateCompatCustomActionSerializer.RemoteActionCompatParcelizer, playbackStateCompatCustomActionSerializer.IconCompatParcelizer, this.r8lambdaXj9c8VIP9DfEvaTmZt0ejAuC4a4));
                        uriActionExternalSyntheticLambda4Serializer2.close();
                    } catch (Throwable th) {
                        try {
                            uriActionExternalSyntheticLambda4Serializer2.close();
                        } catch (Throwable th2) {
                            th.addSuppressed(th2);
                        }
                        throw th;
                    }
                }
                this.MediaMetadataCompat = false;
                this.RemoteActionCompatParcelizer = io.sentry.protocol.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg.serializer;
                AddToCustomAttributeArrayStep addToCustomAttributeArrayStep = this.r8lambda54BeH8ZsBru0CXI2CCSP2syNys;
                if (addToCustomAttributeArrayStep != null) {
                    SentryOptions sentryOptionsRemoteActionCompatParcelizer = addToCustomAttributeArrayStep.RemoteActionCompatParcelizer();
                    try {
                        sentryOptionsRemoteActionCompatParcelizer.getExecutorService().RemoteActionCompatParcelizer(new j$$ExternalSyntheticLambda1(this, sentryOptionsRemoteActionCompatParcelizer, addToCustomAttributeArrayStep, 12));
                    } catch (Throwable th3) {
                        sentryOptionsRemoteActionCompatParcelizer.getLogger().serializer(r8lambdaL32xCEzW71g2Xzeh1NM3NImxco.DEBUG, "Failed to send profile chunks.", th3);
                    }
                }
                if (!z || this.r8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss) {
                    this.PlaybackStateCompatCustomAction = io.sentry.protocol.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg.serializer;
                    brazeActionParserExternalSyntheticLambda0.IconCompatParcelizer(r8lambdaL32xCEzW71g2Xzeh1NM3NImxco.DEBUG, "Profile chunk finished.", new Object[0]);
                } else {
                    brazeActionParserExternalSyntheticLambda0.IconCompatParcelizer(r8lambdaL32xCEzW71g2Xzeh1NM3NImxco.DEBUG, "Profile chunk finished. Starting a new one.", new Object[0]);
                    RemoteActionCompatParcelizer();
                }
                uriActionExternalSyntheticLambda4Serializer.close();
                return;
            }
            io.sentry.protocol.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg r8lambdaquuwrpysdd6n6dd7wraaa0s4oxg = io.sentry.protocol.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg.serializer;
            this.PlaybackStateCompatCustomAction = r8lambdaquuwrpysdd6n6dd7wraaa0s4oxg;
            this.RemoteActionCompatParcelizer = r8lambdaquuwrpysdd6n6dd7wraaa0s4oxg;
            uriActionExternalSyntheticLambda4Serializer.close();
        } catch (Throwable th4) {
            try {
                uriActionExternalSyntheticLambda4Serializer.close();
            } catch (Throwable th5) {
                th4.addSuppressed(th5);
            }
            throw th4;
        }
    }

    public serializer(r8lambdawJ5MHcSJed_CjC7r4OWD0UxyJsQ r8lambdawj5mhcsjed_cjc7r4owd0uxyjsq, SentryFrameMetricsCollector sentryFrameMetricsCollector, BrazeActionParserExternalSyntheticLambda0 brazeActionParserExternalSyntheticLambda0, String str, int i, BrazeActionUtilsWhenMappings brazeActionUtilsWhenMappings) {
        io.sentry.protocol.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg r8lambdaquuwrpysdd6n6dd7wraaa0s4oxg = io.sentry.protocol.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg.serializer;
        this.PlaybackStateCompatCustomAction = r8lambdaquuwrpysdd6n6dd7wraaa0s4oxg;
        this.RemoteActionCompatParcelizer = r8lambdaquuwrpysdd6n6dd7wraaa0s4oxg;
        this.read = new AtomicBoolean(false);
        this.r8lambdaXj9c8VIP9DfEvaTmZt0ejAuC4a4 = new requestPushPermissionlambda0();
        this.ResultReceiver = true;
        this.r8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss = false;
        this.MediaBrowserCompatMediaItem = false;
        this.ComponentActivity = 0;
        this.MediaSessionCompatQueueItem = new io.sentry.util.RemoteActionCompatParcelizer();
        this.MediaSessionCompatResultReceiverWrapper = new io.sentry.util.RemoteActionCompatParcelizer();
        this.RatingCompat = brazeActionParserExternalSyntheticLambda0;
        this.IconCompatParcelizer = sentryFrameMetricsCollector;
        this.write = r8lambdawj5mhcsjed_cjc7r4owd0uxyjsq;
        this.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus = str;
        this.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY = i;
        this.serializer = brazeActionUtilsWhenMappings;
    }

    public final void read() {
        AddToCustomAttributeArrayStep addToCustomAttributeArrayStep = this.r8lambda54BeH8ZsBru0CXI2CCSP2syNys;
        if ((addToCustomAttributeArrayStep == null || addToCustomAttributeArrayStep == args_delegatelambda0.serializer) && internalHeightCallbacklambda0.IconCompatParcelizer() != args_delegatelambda0.serializer) {
            this.r8lambda54BeH8ZsBru0CXI2CCSP2syNys = internalHeightCallbacklambda0.IconCompatParcelizer();
            this.PlaybackStateCompat = internalHeightCallbacklambda0.IconCompatParcelizer().RemoteActionCompatParcelizer().getCompositePerformanceCollector();
            io.sentry.transport.PlaybackStateCompat playbackStateCompatWrite = this.r8lambda54BeH8ZsBru0CXI2CCSP2syNys.write();
            if (playbackStateCompatWrite != null) {
                ((CopyOnWriteArrayList) playbackStateCompatWrite.serializer).add(this);
            }
        }
    }
}
