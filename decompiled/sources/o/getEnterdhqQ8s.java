package o;

import android.app.Notification;
import android.app.PendingIntent;
import android.content.Context;
import android.media.AudioAttributes;
import android.net.Uri;
import android.os.Bundle;
import android.widget.RemoteViews;
import androidx.core.app.NotificationCompat$Action;
import androidx.core.app.NotificationCompat$Style;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class getEnterdhqQ8s {
    public final ArrayList ComponentActivity;
    public RemoteViews IconCompatParcelizer;
    public boolean MediaBrowserCompatMediaItem;
    public CharSequence MediaDescriptionCompat;
    public PendingIntent MediaMetadataCompat;
    public int MediaSessionCompatQueueItem;
    public Bundle MediaSessionCompatResultReceiverWrapper;
    public final Context MediaSessionCompatToken;
    public String ParcelableVolumeInfo;
    public RemoteViews PlaybackStateCompat;
    public CharSequence PlaybackStateCompatCustomAction;
    public boolean RatingCompat;
    public final boolean RemoteActionCompatParcelizer;
    public boolean ResultReceiver;
    public final Notification r8lambda54BeH8ZsBru0CXI2CCSP2syNys;
    public androidx.core.graphics.drawable.IconCompat r8lambda7IJBVrN0sHyidCAZufWEJFc7yY;
    public int r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus;
    public String r8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss;
    public final ArrayList r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg;
    public final ArrayList r8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8;
    public int r8lambdaXj9c8VIP9DfEvaTmZt0ejAuC4a4;
    public Notification r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM;
    public CharSequence r8lambdag6d1IyBXWIL5aeSAzXsZMVuYCQs;
    public boolean r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28;
    public int r8lambdavCwjfXDiSGcirCy4I008VOiJ_lw;
    public long r8lambdawJ5MHcSJed_CjC7r4OWD0UxyJsQ;
    public NotificationCompat$Style r8lambdayPQlaAoRiYRJ3IY_TqzUUTrVH0;
    public String read;
    public final ArrayList serializer;
    public String write;

    public final void IconCompatParcelizer(String str) {
        this.write = str;
    }

    public final void RemoteActionCompatParcelizer() {
        this.ResultReceiver = true;
    }

    public final void read() {
        this.r8lambdaXj9c8VIP9DfEvaTmZt0ejAuC4a4 = 2;
    }

    public final void serializer(PendingIntent pendingIntent) {
        this.MediaMetadataCompat = pendingIntent;
    }

    public final void IconCompatParcelizer(int i) {
        this.r8lambda54BeH8ZsBru0CXI2CCSP2syNys.icon = i;
    }

    public final void serializer(long j) {
        this.r8lambda54BeH8ZsBru0CXI2CCSP2syNys.when = j;
    }

    public final void serializer(String str) {
        this.r8lambda54BeH8ZsBru0CXI2CCSP2syNys.tickerText = serializer((CharSequence) str);
    }

    public final Notification write() {
        Bundle bundle;
        RemoteViews remoteViewsMakeHeadsUpContentView;
        RemoteViews remoteViewsMakeBigContentView;
        androidx.core.app.NotificationCompatBuilder notificationCompatBuilder = new androidx.core.app.NotificationCompatBuilder(this);
        getEnterdhqQ8s getenterdhqq8s = notificationCompatBuilder.IconCompatParcelizer;
        NotificationCompat$Style notificationCompat$Style = getenterdhqq8s.r8lambdayPQlaAoRiYRJ3IY_TqzUUTrVH0;
        if (notificationCompat$Style != null) {
            notificationCompat$Style.apply(notificationCompatBuilder);
        }
        RemoteViews remoteViewsMakeContentView = notificationCompat$Style != null ? notificationCompat$Style.makeContentView(notificationCompatBuilder) : null;
        Notification notificationBuild = notificationCompatBuilder.serializer.build();
        if (remoteViewsMakeContentView != null) {
            notificationBuild.contentView = remoteViewsMakeContentView;
        } else {
            RemoteViews remoteViews = getenterdhqq8s.PlaybackStateCompat;
            if (remoteViews != null) {
                notificationBuild.contentView = remoteViews;
            }
        }
        if (notificationCompat$Style != null && (remoteViewsMakeBigContentView = notificationCompat$Style.makeBigContentView(notificationCompatBuilder)) != null) {
            notificationBuild.bigContentView = remoteViewsMakeBigContentView;
        }
        if (notificationCompat$Style != null && (remoteViewsMakeHeadsUpContentView = getenterdhqq8s.r8lambdayPQlaAoRiYRJ3IY_TqzUUTrVH0.makeHeadsUpContentView(notificationCompatBuilder)) != null) {
            notificationBuild.headsUpContentView = remoteViewsMakeHeadsUpContentView;
        }
        if (notificationCompat$Style != null && (bundle = notificationBuild.extras) != null) {
            notificationCompat$Style.addCompatExtras(bundle);
        }
        return notificationBuild;
    }

    public final void write(Uri uri) {
        Notification notification = this.r8lambda54BeH8ZsBru0CXI2CCSP2syNys;
        notification.sound = uri;
        notification.audioStreamType = -1;
        notification.audioAttributes = new AudioAttributes.Builder().setContentType(4).setUsage(5).build();
    }

    public final void write(boolean z) {
        write(16, z);
    }

    public static CharSequence serializer(CharSequence charSequence) {
        return (charSequence != null && charSequence.length() > 5120) ? charSequence.subSequence(0, 5120) : charSequence;
    }

    public final void RemoteActionCompatParcelizer(NotificationCompat$Style notificationCompat$Style) {
        if (this.r8lambdayPQlaAoRiYRJ3IY_TqzUUTrVH0 != notificationCompat$Style) {
            this.r8lambdayPQlaAoRiYRJ3IY_TqzUUTrVH0 = notificationCompat$Style;
            if (notificationCompat$Style != null) {
                notificationCompat$Style.setBuilder(this);
            }
        }
    }

    public final void RemoteActionCompatParcelizer(CharSequence charSequence) {
        this.MediaDescriptionCompat = serializer(charSequence);
    }

    public final void read(CharSequence charSequence) {
        this.PlaybackStateCompatCustomAction = serializer(charSequence);
    }

    public final void write(int i, boolean z) {
        Notification notification = this.r8lambda54BeH8ZsBru0CXI2CCSP2syNys;
        if (z) {
            notification.flags = i | notification.flags;
        } else {
            notification.flags = (~i) & notification.flags;
        }
    }

    public getEnterdhqQ8s(Context context, String str) {
        this.serializer = new ArrayList();
        this.r8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8 = new ArrayList();
        this.ComponentActivity = new ArrayList();
        this.r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28 = true;
        this.ResultReceiver = false;
        this.MediaSessionCompatQueueItem = 0;
        this.r8lambdavCwjfXDiSGcirCy4I008VOiJ_lw = 0;
        Notification notification = new Notification();
        this.r8lambda54BeH8ZsBru0CXI2CCSP2syNys = notification;
        this.MediaSessionCompatToken = context;
        this.write = str;
        notification.when = System.currentTimeMillis();
        notification.audioStreamType = -1;
        this.r8lambdaXj9c8VIP9DfEvaTmZt0ejAuC4a4 = 0;
        this.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg = new ArrayList();
        this.RemoteActionCompatParcelizer = true;
    }

    public final void RemoteActionCompatParcelizer(int i, CharSequence charSequence, PendingIntent pendingIntent) {
        this.serializer.add(new NotificationCompat$Action(i != 0 ? androidx.core.graphics.drawable.IconCompat.read(null, "", i) : null, charSequence, pendingIntent, new Bundle(), null, true, true));
    }

    public getEnterdhqQ8s(Context context) {
        this(context, null);
    }
}
