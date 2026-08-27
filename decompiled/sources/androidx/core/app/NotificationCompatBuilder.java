package androidx.core.app;

import android.app.Notification;
import android.app.PendingIntent;
import android.app.RemoteInput;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.widget.RemoteViews;
import androidx.compose.ui.graphics.Fields;
import androidx.core.graphics.drawable.IconCompat;
import com.braze.models.inappmessage.InAppMessageBase;
import com.deliveryhero.chatsdk.util.PushNotificationParserObj;
import com.logistics.rider.glovo.R;
import java.util.ArrayList;
import java.util.Iterator;
import o.FocusEventModifierNodeKt;
import o.accessgetLeftcp;
import o.getEnterdhqQ8s;
import o.getXor;
import o.invalidateNodes;
import o.setCanFocus;

/* JADX INFO: loaded from: classes.dex */
public final class NotificationCompatBuilder implements accessgetLeftcp {
    public final getEnterdhqQ8s IconCompatParcelizer;
    public final Bundle RemoteActionCompatParcelizer = new Bundle();
    public final Notification.Builder serializer;
    public final Context write;

    public NotificationCompatBuilder(getEnterdhqQ8s getenterdhqq8s) {
        Bundle bundle;
        Bundle[] bundleArr;
        int i;
        NotificationCompat$Action notificationCompat$ActionSerializer;
        NotificationCompat$Action notificationCompat$ActionSerializer2;
        this.IconCompatParcelizer = getenterdhqq8s;
        Context context = getenterdhqq8s.MediaSessionCompatToken;
        ArrayList arrayList = getenterdhqq8s.ComponentActivity;
        this.write = context;
        Notification.Builder builder = new Notification.Builder(context, getenterdhqq8s.write);
        this.serializer = builder;
        Notification notification = getenterdhqq8s.r8lambda54BeH8ZsBru0CXI2CCSP2syNys;
        int i2 = 2;
        builder.setWhen(notification.when).setSmallIcon(notification.icon, notification.iconLevel).setContent(notification.contentView).setTicker(notification.tickerText, null).setVibrate(notification.vibrate).setLights(notification.ledARGB, notification.ledOnMS, notification.ledOffMS).setOngoing((notification.flags & 2) != 0).setOnlyAlertOnce((notification.flags & 8) != 0).setAutoCancel((notification.flags & 16) != 0).setDefaults(notification.defaults).setContentTitle(getenterdhqq8s.PlaybackStateCompatCustomAction).setContentText(getenterdhqq8s.MediaDescriptionCompat).setContentInfo(null).setContentIntent(getenterdhqq8s.MediaMetadataCompat).setDeleteIntent(notification.deleteIntent).setFullScreenIntent(null, (notification.flags & Fields.SpotShadowColor) != 0).setNumber(getenterdhqq8s.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus).setProgress(0, 0, false);
        IconCompat iconCompat = getenterdhqq8s.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY;
        builder.setLargeIcon(iconCompat == null ? null : iconCompat.read(context));
        builder.setSubText(getenterdhqq8s.r8lambdag6d1IyBXWIL5aeSAzXsZMVuYCQs).setUsesChronometer(false).setPriority(getenterdhqq8s.r8lambdaXj9c8VIP9DfEvaTmZt0ejAuC4a4);
        NotificationCompat$Style notificationCompat$Style = getenterdhqq8s.r8lambdayPQlaAoRiYRJ3IY_TqzUUTrVH0;
        if (notificationCompat$Style instanceof NotificationCompat$CallStyle) {
            NotificationCompat$CallStyle notificationCompat$CallStyle = (NotificationCompat$CallStyle) notificationCompat$Style;
            PendingIntent pendingIntent = notificationCompat$CallStyle.RemoteActionCompatParcelizer;
            Integer num = notificationCompat$CallStyle.serializer;
            if (pendingIntent == null) {
                notificationCompat$ActionSerializer = notificationCompat$CallStyle.serializer(R.drawable.ic_call_decline, R.string.call_notification_hang_up_action, num, R.color.call_notification_decline_color, notificationCompat$CallStyle.MediaSessionCompatQueueItem);
            } else {
                notificationCompat$ActionSerializer = notificationCompat$CallStyle.serializer(R.drawable.ic_call_decline, R.string.call_notification_decline_action, num, R.color.call_notification_decline_color, pendingIntent);
            }
            PendingIntent pendingIntent2 = notificationCompat$CallStyle.read;
            if (pendingIntent2 == null) {
                notificationCompat$ActionSerializer2 = null;
            } else {
                boolean z = notificationCompat$CallStyle.MediaBrowserCompatMediaItem;
                notificationCompat$ActionSerializer2 = notificationCompat$CallStyle.serializer(z ? R.drawable.ic_call_answer_video : R.drawable.ic_call_answer, z ? R.string.call_notification_answer_video_action : R.string.call_notification_answer_action, notificationCompat$CallStyle.write, R.color.call_notification_answer_color, pendingIntent2);
            }
            ArrayList arrayList2 = new ArrayList(3);
            arrayList2.add(notificationCompat$ActionSerializer);
            ArrayList<NotificationCompat$Action> arrayList3 = notificationCompat$CallStyle.PlaybackStateCompatCustomAction.serializer;
            if (arrayList3 != null) {
                for (NotificationCompat$Action notificationCompat$Action : arrayList3) {
                    notificationCompat$Action.getClass();
                    if (!notificationCompat$Action.write.getBoolean("key_action_priority")) {
                        arrayList2.add(notificationCompat$Action);
                        i2--;
                    }
                    if (notificationCompat$ActionSerializer2 != null && i2 == 1) {
                        arrayList2.add(notificationCompat$ActionSerializer2);
                        i2--;
                    }
                }
            }
            if (notificationCompat$ActionSerializer2 != null && i2 >= 1) {
                arrayList2.add(notificationCompat$ActionSerializer2);
            }
            Iterator it = arrayList2.iterator();
            while (it.hasNext()) {
                IconCompatParcelizer((NotificationCompat$Action) it.next());
            }
        } else {
            Iterator it2 = getenterdhqq8s.serializer.iterator();
            while (it2.hasNext()) {
                IconCompatParcelizer((NotificationCompat$Action) it2.next());
            }
        }
        Bundle bundle2 = getenterdhqq8s.MediaSessionCompatResultReceiverWrapper;
        if (bundle2 != null) {
            this.RemoteActionCompatParcelizer.putAll(bundle2);
        }
        this.serializer.setShowWhen(getenterdhqq8s.r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28);
        this.serializer.setLocalOnly(getenterdhqq8s.ResultReceiver);
        this.serializer.setGroup(getenterdhqq8s.ParcelableVolumeInfo);
        this.serializer.setSortKey(null);
        this.serializer.setGroupSummary(false);
        this.serializer.setCategory(getenterdhqq8s.read);
        this.serializer.setColor(getenterdhqq8s.MediaSessionCompatQueueItem);
        this.serializer.setVisibility(getenterdhqq8s.r8lambdavCwjfXDiSGcirCy4I008VOiJ_lw);
        this.serializer.setPublicVersion(getenterdhqq8s.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM);
        this.serializer.setSound(notification.sound, notification.audioAttributes);
        ArrayList arrayList4 = getenterdhqq8s.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg;
        if (arrayList4 != null && !arrayList4.isEmpty()) {
            Iterator it3 = arrayList4.iterator();
            while (it3.hasNext()) {
                this.serializer.addPerson((String) it3.next());
            }
        }
        if (arrayList.size() > 0) {
            if (getenterdhqq8s.MediaSessionCompatResultReceiverWrapper == null) {
                getenterdhqq8s.MediaSessionCompatResultReceiverWrapper = new Bundle();
            }
            Bundle bundle3 = getenterdhqq8s.MediaSessionCompatResultReceiverWrapper.getBundle("android.car.EXTENSIONS");
            bundle3 = bundle3 == null ? new Bundle() : bundle3;
            Bundle bundle4 = new Bundle(bundle3);
            Bundle bundle5 = new Bundle();
            for (int i3 = 0; i3 < arrayList.size(); i3++) {
                String string = Integer.toString(i3);
                NotificationCompat$Action notificationCompat$Action2 = (NotificationCompat$Action) arrayList.get(i3);
                Bundle bundle6 = new Bundle();
                if (notificationCompat$Action2.read == null && (i = notificationCompat$Action2.RemoteActionCompatParcelizer) != 0) {
                    notificationCompat$Action2.read = IconCompat.read(null, "", i);
                }
                IconCompat iconCompat2 = notificationCompat$Action2.read;
                Bundle bundle7 = notificationCompat$Action2.write;
                bundle6.putInt("icon", iconCompat2 != null ? iconCompat2.read() : 0);
                bundle6.putCharSequence(PushNotificationParserObj.TITLE_KEY, notificationCompat$Action2.MediaBrowserCompatMediaItem);
                bundle6.putParcelable("actionIntent", notificationCompat$Action2.IconCompatParcelizer);
                if (bundle7 != null) {
                    bundle = new Bundle(bundle7);
                } else {
                    bundle = new Bundle();
                }
                bundle.putBoolean("android.support.allowGeneratedReplies", notificationCompat$Action2.serializer);
                bundle6.putBundle(InAppMessageBase.EXTRAS, bundle);
                invalidateNodes[] invalidatenodesArr = notificationCompat$Action2.MediaMetadataCompat;
                if (invalidatenodesArr == null) {
                    bundleArr = null;
                } else {
                    bundleArr = new Bundle[invalidatenodesArr.length];
                    if (invalidatenodesArr.length > 0) {
                        invalidateNodes invalidatenodes = invalidatenodesArr[0];
                        new Bundle();
                        throw null;
                    }
                }
                bundle6.putParcelableArray("remoteInputs", bundleArr);
                bundle6.putBoolean("showsUserInterface", notificationCompat$Action2.MediaSessionCompatQueueItem);
                bundle6.putInt("semanticAction", 0);
                bundle5.putBundle(string, bundle6);
            }
            bundle3.putBundle("invisible_actions", bundle5);
            bundle4.putBundle("invisible_actions", bundle5);
            if (getenterdhqq8s.MediaSessionCompatResultReceiverWrapper == null) {
                getenterdhqq8s.MediaSessionCompatResultReceiverWrapper = new Bundle();
            }
            getenterdhqq8s.MediaSessionCompatResultReceiverWrapper.putBundle("android.car.EXTENSIONS", bundle3);
            this.RemoteActionCompatParcelizer.putBundle("android.car.EXTENSIONS", bundle4);
        }
        this.serializer.setExtras(getenterdhqq8s.MediaSessionCompatResultReceiverWrapper);
        this.serializer.setRemoteInputHistory(null);
        RemoteViews remoteViews = getenterdhqq8s.PlaybackStateCompat;
        if (remoteViews != null) {
            this.serializer.setCustomContentView(remoteViews);
        }
        RemoteViews remoteViews2 = getenterdhqq8s.IconCompatParcelizer;
        if (remoteViews2 != null) {
            this.serializer.setCustomBigContentView(remoteViews2);
        }
        this.serializer.setBadgeIconType(0);
        this.serializer.setSettingsText(null);
        this.serializer.setShortcutId(getenterdhqq8s.r8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss);
        this.serializer.setTimeoutAfter(getenterdhqq8s.r8lambdawJ5MHcSJed_CjC7r4OWD0UxyJsQ);
        this.serializer.setGroupAlertBehavior(0);
        if (getenterdhqq8s.RatingCompat) {
            this.serializer.setColorized(getenterdhqq8s.MediaBrowserCompatMediaItem);
        }
        if (!TextUtils.isEmpty(getenterdhqq8s.write)) {
            this.serializer.setSound(null).setDefaults(0).setLights(0, 0, 0).setVibrate(null);
        }
        Iterator it4 = getenterdhqq8s.r8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8.iterator();
        while (it4.hasNext()) {
            this.serializer.addPerson(((Person) it4.next()).read());
        }
        int i4 = Build.VERSION.SDK_INT;
        if (i4 >= 29) {
            getXor.read(this.serializer, getenterdhqq8s.RemoteActionCompatParcelizer);
            getXor.serializer(this.serializer);
        }
        if (i4 >= 36) {
            FocusEventModifierNodeKt.write(this.serializer);
        }
    }

    public final void IconCompatParcelizer(NotificationCompat$Action notificationCompat$Action) {
        int i;
        if (notificationCompat$Action.read == null && (i = notificationCompat$Action.RemoteActionCompatParcelizer) != 0) {
            notificationCompat$Action.read = IconCompat.read(null, "", i);
        }
        IconCompat iconCompat = notificationCompat$Action.read;
        boolean z = notificationCompat$Action.serializer;
        Bundle bundle = notificationCompat$Action.write;
        Notification.Action.Builder builder = new Notification.Action.Builder(iconCompat != null ? iconCompat.read(null) : null, notificationCompat$Action.MediaBrowserCompatMediaItem, notificationCompat$Action.IconCompatParcelizer);
        invalidateNodes[] invalidatenodesArr = notificationCompat$Action.MediaMetadataCompat;
        if (invalidatenodesArr != null) {
            int length = invalidatenodesArr.length;
            RemoteInput[] remoteInputArr = new RemoteInput[length];
            if (invalidatenodesArr.length > 0) {
                invalidateNodes invalidatenodes = invalidatenodesArr[0];
                throw null;
            }
            for (int i2 = 0; i2 < length; i2++) {
                builder.addRemoteInput(remoteInputArr[i2]);
            }
        }
        Bundle bundle2 = bundle != null ? new Bundle(bundle) : new Bundle();
        bundle2.putBoolean("android.support.allowGeneratedReplies", z);
        builder.setAllowGeneratedReplies(z);
        bundle2.putInt("android.support.action.semanticAction", 0);
        builder.setSemanticAction(0);
        int i3 = Build.VERSION.SDK_INT;
        if (i3 >= 29) {
            getXor.IconCompatParcelizer(builder);
        }
        if (i3 >= 31) {
            setCanFocus.serializer(builder);
        }
        bundle2.putBoolean("android.support.action.showsUserInterface", notificationCompat$Action.MediaSessionCompatQueueItem);
        builder.addExtras(bundle2);
        this.serializer.addAction(builder.build());
    }
}
