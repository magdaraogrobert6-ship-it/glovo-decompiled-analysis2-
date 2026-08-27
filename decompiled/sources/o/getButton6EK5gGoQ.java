package o;

import android.content.Context;
import android.os.Bundle;
import coil3.ComponentRegistry$Builder;
import coil3.ImageLoader$Builder;
import io.sentry.android.core.SystemEventsBreadcrumbsIntegration;
import java.util.ArrayList;
import java.util.Date;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import okio.Options;

/* JADX INFO: loaded from: classes2.dex */
public final class getButton6EK5gGoQ {
    public final Context IconCompatParcelizer;
    public final setLastReportedResult MediaBrowserCompatMediaItem;
    public final accessgetTvInputComposite1cp MediaDescriptionCompat;
    public final ExecutorService MediaMetadataCompat;
    public final ComponentRegistry$Builder MediaSessionCompatQueueItem;
    public ScheduledFuture MediaSessionCompatResultReceiverWrapper;
    public final androidx.emoji2.text.EmojiProcessor MediaSessionCompatToken;
    public volatile int ParcelableVolumeInfo;
    public ArrayList PlaybackStateCompat;
    public getButtonZEK5gGoQ PlaybackStateCompatCustomAction;
    public final ScheduledExecutorService RatingCompat;
    public final String RemoteActionCompatParcelizer;
    public boolean r8lambda7IJBVrN0sHyidCAZufWEJFc7yY;
    public final String read;
    public final String serializer;
    public final ImageLoader$Builder write;

    public getButton6EK5gGoQ(Context context, String str, String str2, String str3, ImageLoader$Builder imageLoader$Builder, ComponentRegistry$Builder componentRegistry$Builder, ExecutorService executorService, ScheduledExecutorService scheduledExecutorService, setLastReportedResult setlastreportedresult, androidx.emoji2.text.EmojiProcessor emojiProcessor) {
        accessgetTvInputComposite1cp accessgettvinputcomposite1cp = accessgetTvInputComposite1cp.read;
        this.ParcelableVolumeInfo = 1;
        this.PlaybackStateCompat = new ArrayList();
        this.MediaSessionCompatResultReceiverWrapper = null;
        this.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY = false;
        this.IconCompatParcelizer = context;
        accessgetSystemNavigationDowncp.IconCompatParcelizer((Object) str);
        this.read = str;
        this.write = imageLoader$Builder;
        accessgetSystemNavigationDowncp.IconCompatParcelizer(componentRegistry$Builder);
        this.MediaSessionCompatQueueItem = componentRegistry$Builder;
        accessgetSystemNavigationDowncp.IconCompatParcelizer(executorService);
        this.MediaMetadataCompat = executorService;
        accessgetSystemNavigationDowncp.IconCompatParcelizer(scheduledExecutorService);
        this.RatingCompat = scheduledExecutorService;
        accessgetSystemNavigationDowncp.IconCompatParcelizer(setlastreportedresult);
        this.MediaBrowserCompatMediaItem = setlastreportedresult;
        this.MediaDescriptionCompat = accessgettvinputcomposite1cp;
        this.MediaSessionCompatToken = emojiProcessor;
        this.serializer = str3;
        this.RemoteActionCompatParcelizer = str2;
        this.PlaybackStateCompat.add(new getButton3EK5gGoQ("gtm.load", new Bundle(), "gtm", new Date(), false, setlastreportedresult));
        int iWrite = SystemEventsBreadcrumbsIntegration.SystemEventsBroadcastReceiver.write();
        int iWrite2 = SystemEventsBreadcrumbsIntegration.SystemEventsBroadcastReceiver.write();
        int iWrite3 = SystemEventsBreadcrumbsIntegration.SystemEventsBroadcastReceiver.write();
        ((Boolean) Options.Companion.read(iWrite, 1921293490, iWrite2, SystemEventsBreadcrumbsIntegration.SystemEventsBroadcastReceiver.write(), new Object[]{2}, iWrite3, -1921293486)).booleanValue();
        executorService.execute(new getButton4EK5gGoQ(this, 1));
    }

    public static void IconCompatParcelizer(getButton6EK5gGoQ getbutton6ek5ggoq, long j) {
        ScheduledFuture scheduledFuture = getbutton6ek5ggoq.MediaSessionCompatResultReceiverWrapper;
        int i = 0;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(false);
        }
        int iWrite = SystemEventsBreadcrumbsIntegration.SystemEventsBroadcastReceiver.write();
        int iWrite2 = SystemEventsBreadcrumbsIntegration.SystemEventsBroadcastReceiver.write();
        int iWrite3 = SystemEventsBreadcrumbsIntegration.SystemEventsBroadcastReceiver.write();
        ((Boolean) Options.Companion.read(iWrite, 1921293490, iWrite2, SystemEventsBreadcrumbsIntegration.SystemEventsBroadcastReceiver.write(), new Object[]{2}, iWrite3, -1921293486)).booleanValue();
        getbutton6ek5ggoq.MediaSessionCompatResultReceiverWrapper = getbutton6ek5ggoq.RatingCompat.schedule(new getButton4EK5gGoQ(getbutton6ek5ggoq, i), j, TimeUnit.MILLISECONDS);
    }
}
