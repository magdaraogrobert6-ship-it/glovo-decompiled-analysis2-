package o;

import android.app.NotificationChannel;
import android.app.NotificationChannelGroup;
import android.app.NotificationManager;
import android.content.Context;
import com.ui.common.widget.VerticalDividerItemDecoration;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public abstract class setOnLoggedCallback {
    public static List IconCompatParcelizer(NotificationManager notificationManager) {
        return notificationManager.getNotificationChannels();
    }

    public static void IconCompatParcelizer(NotificationManager notificationManager, String str) {
        notificationManager.deleteNotificationChannel(str);
    }

    public static void RemoteActionCompatParcelizer(NotificationManager notificationManager, NotificationChannel notificationChannel) {
        notificationManager.createNotificationChannel(notificationChannel);
    }

    public static void read(NotificationManager notificationManager, NotificationChannelGroup notificationChannelGroup) {
        notificationManager.createNotificationChannelGroup(notificationChannelGroup);
    }

    public static void read(NotificationManager notificationManager, List list) {
        notificationManager.createNotificationChannelGroups(list);
    }

    public static NotificationChannel serializer(NotificationManager notificationManager, String str) {
        return notificationManager.getNotificationChannel(str);
    }

    public static String write(NotificationChannel notificationChannel) {
        return notificationChannel.getId();
    }

    public static List write(NotificationManager notificationManager) {
        return notificationManager.getNotificationChannelGroups();
    }

    public static void write(NotificationManager notificationManager, String str) {
        notificationManager.deleteNotificationChannelGroup(str);
    }

    public static void write(NotificationManager notificationManager, List list) {
        notificationManager.createNotificationChannels(list);
    }

    public static final void IconCompatParcelizer(androidx.recyclerview.widget.RecyclerView recyclerView, vdefault vdefaultVar) {
        Context context = recyclerView.getContext();
        context.getClass();
        recyclerView.addItemDecoration(new VerticalDividerItemDecoration(context, ilambda0.Medium, vdefaultVar));
    }
}
