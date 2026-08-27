package io.sentry.android.replay;

import com.huawei.hms.framework.common.ContainerUtils;
import com.sentiance.core.model.events.E$b;
import io.sentry.SentryOptions;
import java.io.BufferedReader;
import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.io.TextStreamsKt;
import o.UriActionExternalSyntheticLambda4;
import o.createInAppMessageEventSubscriber;
import o.ensureSubscribedToInAppMessageEvents;
import o.hideCurrentlyDisplayingInAppMessage;
import o.isAdapterPositionOnScreen;
import o.onContentCardDismissed;
import o.r8lambda7AJnrvTmYNN7kSbgXUEYtB0Niyw;
import o.r8lambdaL32xCEzW71g2Xzeh1NM3NImxco;
import o.r8lambdaOLXJyr9WZueQ0v3etp2M60EbsQ;
import o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM;
import o.requestDisplayInAppMessagelambda4;
import o.sourceInformationContextOfdefault;
import okio.Okio;

/* JADX INFO: loaded from: classes4.dex */
public final class MediaBrowserCompatMediaItem implements Closeable {
    public final AtomicBoolean IconCompatParcelizer;
    public final io.sentry.util.RemoteActionCompatParcelizer MediaBrowserCompatMediaItem;
    public final isAdapterPositionOnScreen MediaDescriptionCompat;
    public final LinkedHashMap MediaMetadataCompat;
    public final isAdapterPositionOnScreen MediaSessionCompatQueueItem;
    public final io.sentry.protocol.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg PlaybackStateCompatCustomAction;
    public final SentryOptions RatingCompat;
    public final io.sentry.util.RemoteActionCompatParcelizer RemoteActionCompatParcelizer;
    public final io.sentry.util.RemoteActionCompatParcelizer read;
    public E$b serializer;
    public final ArrayList write;

    public final File IconCompatParcelizer() {
        return (File) this.MediaSessionCompatQueueItem.MediaSessionCompatResultReceiverWrapper();
    }

    public final void RemoteActionCompatParcelizer(File file) {
        SentryOptions sentryOptions = this.RatingCompat;
        try {
            if (file.delete()) {
                return;
            }
            sentryOptions.getLogger().IconCompatParcelizer(r8lambdaL32xCEzW71g2Xzeh1NM3NImxco.ERROR, "Failed to delete replay frame: %s", file.getAbsolutePath());
        } catch (Throwable th) {
            sentryOptions.getLogger().serializer(r8lambdaL32xCEzW71g2Xzeh1NM3NImxco.ERROR, th, "Failed to delete replay frame: %s", file.getAbsolutePath());
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        UriActionExternalSyntheticLambda4 uriActionExternalSyntheticLambda4Serializer = this.RemoteActionCompatParcelizer.serializer();
        try {
            E$b e$b = this.serializer;
            if (e$b != null) {
                e$b.MediaSessionCompatQueueItem();
            }
            this.serializer = null;
            Okio.RemoteActionCompatParcelizer(uriActionExternalSyntheticLambda4Serializer, null);
            this.IconCompatParcelizer.set(true);
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                Okio.RemoteActionCompatParcelizer(uriActionExternalSyntheticLambda4Serializer, th);
                throw th2;
            }
        }
    }

    public final String read(long j) {
        createInAppMessageEventSubscriber createinappmessageeventsubscriber = new createInAppMessageEventSubscriber();
        UriActionExternalSyntheticLambda4 uriActionExternalSyntheticLambda4Serializer = this.read.serializer();
        try {
            onContentCardDismissed.write((List) this.write, (r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) new ReplayCache$rotate$1$1(j, this, createinappmessageeventsubscriber, 0));
            Okio.RemoteActionCompatParcelizer(uriActionExternalSyntheticLambda4Serializer, null);
            return (String) createinappmessageeventsubscriber.IconCompatParcelizer;
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                Okio.RemoteActionCompatParcelizer(uriActionExternalSyntheticLambda4Serializer, th);
                throw th2;
            }
        }
    }

    public final void read(String str, String str2) {
        File file;
        File file2;
        isAdapterPositionOnScreen isadapterpositiononscreen = this.MediaDescriptionCompat;
        LinkedHashMap linkedHashMap = this.MediaMetadataCompat;
        UriActionExternalSyntheticLambda4 uriActionExternalSyntheticLambda4Serializer = this.MediaBrowserCompatMediaItem.serializer();
        try {
            if (this.IconCompatParcelizer.get()) {
                Okio.RemoteActionCompatParcelizer(uriActionExternalSyntheticLambda4Serializer, null);
                return;
            }
            File file3 = (File) isadapterpositiononscreen.MediaSessionCompatResultReceiverWrapper();
            if ((file3 == null || !file3.exists()) && (file = (File) isadapterpositiononscreen.MediaSessionCompatResultReceiverWrapper()) != null) {
                file.createNewFile();
            }
            if (linkedHashMap.isEmpty() && (file2 = (File) isadapterpositiononscreen.MediaSessionCompatResultReceiverWrapper()) != null) {
                BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream(file2), ensureSubscribedToInAppMessageEvents.write), 8192);
                try {
                    Iterator it = ((requestDisplayInAppMessagelambda4) TextStreamsKt.write(bufferedReader)).iterator();
                    while (it.hasNext()) {
                        List listSerializer = hideCurrentlyDisplayingInAppMessage.serializer((String) it.next(), new String[]{ContainerUtils.KEY_VALUE_DELIMITER}, 2);
                        linkedHashMap.put((String) listSerializer.get(0), (String) listSerializer.get(1));
                    }
                    bufferedReader.close();
                } catch (Throwable th) {
                    try {
                        throw th;
                    } catch (Throwable th2) {
                        r8lambda7AJnrvTmYNN7kSbgXUEYtB0Niyw.IconCompatParcelizer(871780641, sourceInformationContextOfdefault.read(), sourceInformationContextOfdefault.read(), -871780639, sourceInformationContextOfdefault.read(), new Object[]{bufferedReader, th}, sourceInformationContextOfdefault.read());
                        throw th2;
                    }
                }
            }
            if (str2 == null) {
                linkedHashMap.remove(str);
            } else {
                linkedHashMap.put(str, str2);
            }
            File file4 = (File) isadapterpositiononscreen.MediaSessionCompatResultReceiverWrapper();
            if (file4 != null) {
                Set setEntrySet = linkedHashMap.entrySet();
                setEntrySet.getClass();
                r8lambdaOLXJyr9WZueQ0v3etp2M60EbsQ.write(file4, onContentCardDismissed.IconCompatParcelizer(setEntrySet, "\n", null, null, MediaSessionCompatQueueItem.IconCompatParcelizer, 30), ensureSubscribedToInAppMessageEvents.write);
            }
            Okio.RemoteActionCompatParcelizer(uriActionExternalSyntheticLambda4Serializer, null);
        } catch (Throwable th3) {
            try {
                throw th3;
            } catch (Throwable th4) {
                Okio.RemoteActionCompatParcelizer(uriActionExternalSyntheticLambda4Serializer, th3);
                throw th4;
            }
        }
    }

    public final void serializer(File file, long j, String str) {
        MediaDescriptionCompat mediaDescriptionCompat = new MediaDescriptionCompat(file, j, str);
        UriActionExternalSyntheticLambda4 uriActionExternalSyntheticLambda4Serializer = this.read.serializer();
        try {
            this.write.add(mediaDescriptionCompat);
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

    public MediaBrowserCompatMediaItem(SentryOptions sentryOptions, io.sentry.protocol.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg r8lambdaquuwrpysdd6n6dd7wraaa0s4oxg) {
        sentryOptions.getClass();
        r8lambdaquuwrpysdd6n6dd7wraaa0s4oxg.getClass();
        this.RatingCompat = sentryOptions;
        this.PlaybackStateCompatCustomAction = r8lambdaquuwrpysdd6n6dd7wraaa0s4oxg;
        this.IconCompatParcelizer = new AtomicBoolean(false);
        this.RemoteActionCompatParcelizer = new io.sentry.util.RemoteActionCompatParcelizer();
        this.MediaBrowserCompatMediaItem = new io.sentry.util.RemoteActionCompatParcelizer();
        this.read = new io.sentry.util.RemoteActionCompatParcelizer();
        this.MediaSessionCompatQueueItem = new isAdapterPositionOnScreen(new RatingCompat(this, 0));
        this.write = new ArrayList();
        this.MediaMetadataCompat = new LinkedHashMap();
        this.MediaDescriptionCompat = new isAdapterPositionOnScreen(new RatingCompat(this, 1));
    }
}
