package androidx.core.app;

import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationChannelGroup;
import android.app.NotificationManager;
import android.content.ComponentName;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.provider.Settings;
import android.service.notification.StatusBarNotification;
import bo.app.m1$$ExternalSyntheticOutline0;
import com.huawei.hms.push.constant.RemoteMessageConst;
import io.sentry.vendor.IconCompatParcelizer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import o.FocusEventModifierNode;
import o.FocusEventNode;
import o.FocusInteropUtils_androidKt;
import o.accessgetNextcp;
import o.accessgetPreviouscp;
import o.accessgetUpcp;
import o.invalidateFocusProperties;
import o.setOnFocusEvent;
import o.setOnLoggedCallback;
import o.toAndroidFocusDirection3ESFkO8;

/* JADX INFO: loaded from: classes.dex */
public final class NotificationManagerCompat {
    public static final String ACTION_BIND_SIDE_CHANNEL = "android.support.BIND_NOTIFICATION_SIDE_CHANNEL";
    private static final String CHECK_OP_NO_THROW = "checkOpNoThrow";
    public static final String EXTRA_USE_SIDE_CHANNEL = "android.support.useSideChannel";
    public static final int IMPORTANCE_DEFAULT = 3;
    public static final int IMPORTANCE_HIGH = 4;
    public static final int IMPORTANCE_LOW = 2;
    public static final int IMPORTANCE_MAX = 5;
    public static final int IMPORTANCE_MIN = 1;
    public static final int IMPORTANCE_NONE = 0;
    public static final int IMPORTANCE_UNSPECIFIED = -1000;
    public static final int INTERRUPTION_FILTER_ALARMS = 4;
    public static final int INTERRUPTION_FILTER_ALL = 1;
    public static final int INTERRUPTION_FILTER_NONE = 3;
    public static final int INTERRUPTION_FILTER_PRIORITY = 2;
    public static final int INTERRUPTION_FILTER_UNKNOWN = 0;
    private static final String OP_POST_NOTIFICATION = "OP_POST_NOTIFICATION";
    private static final String SETTING_ENABLED_NOTIFICATION_LISTENERS = "enabled_notification_listeners";
    private static final int SIDE_CHANNEL_RETRY_BASE_INTERVAL_MS = 1000;
    private static final int SIDE_CHANNEL_RETRY_MAX_COUNT = 6;
    private static final String TAG = "NotifManCompat";
    private static String sEnabledNotificationListeners;
    private static FocusEventNode sSideChannelManager;
    private final Context mContext;
    private final NotificationManager mNotificationManager;
    private static final Object sEnabledNotificationListenersLock = new Object();
    private static Set<String> sEnabledNotificationListenerPackages = new HashSet();
    private static final Object sLock = new Object();

    public static NotificationManagerCompat from(Context context) {
        return new NotificationManagerCompat(context);
    }

    private void pushSideChannelQueue(toAndroidFocusDirection3ESFkO8 toandroidfocusdirection3esfko8) {
        synchronized (sLock) {
            if (sSideChannelManager == null) {
                sSideChannelManager = new FocusEventNode(this.mContext.getApplicationContext());
            }
            sSideChannelManager.write(toandroidfocusdirection3esfko8);
        }
    }

    public boolean areNotificationsEnabled() {
        return this.mNotificationManager.areNotificationsEnabled();
    }

    public void cancel(String str, int i) {
        this.mNotificationManager.cancel(str, i);
    }

    public void cancelAll() {
        this.mNotificationManager.cancelAll();
    }

    public void createNotificationChannelGroups(List<NotificationChannelGroup> list) {
        setOnLoggedCallback.read(this.mNotificationManager, list);
    }

    public void createNotificationChannels(List<NotificationChannel> list) {
        setOnLoggedCallback.write(this.mNotificationManager, list);
    }

    public void deleteNotificationChannel(String str) {
        setOnLoggedCallback.IconCompatParcelizer(this.mNotificationManager, str);
    }

    public void deleteNotificationChannelGroup(String str) {
        setOnLoggedCallback.write(this.mNotificationManager, str);
    }

    public void deleteUnlistedNotificationChannels(Collection<String> collection) {
        for (NotificationChannel notificationChannel : setOnLoggedCallback.IconCompatParcelizer(this.mNotificationManager)) {
            if (!collection.contains(setOnLoggedCallback.write(notificationChannel)) && (Build.VERSION.SDK_INT < 30 || !collection.contains(FocusEventModifierNode.IconCompatParcelizer(notificationChannel)))) {
                setOnLoggedCallback.IconCompatParcelizer(this.mNotificationManager, setOnLoggedCallback.write(notificationChannel));
            }
        }
    }

    public List<StatusBarNotification> getActiveNotifications() {
        StatusBarNotification[] activeNotifications = this.mNotificationManager.getActiveNotifications();
        return activeNotifications == null ? new ArrayList() : Arrays.asList(activeNotifications);
    }

    public int getCurrentInterruptionFilter() {
        return this.mNotificationManager.getCurrentInterruptionFilter();
    }

    public int getImportance() {
        return this.mNotificationManager.getImportance();
    }

    public NotificationChannelGroup getNotificationChannelGroup(String str) {
        return IconCompatParcelizer.read(this.mNotificationManager, str);
    }

    public List<NotificationChannelGroup> getNotificationChannelGroups() {
        return setOnLoggedCallback.write(this.mNotificationManager);
    }

    public List<NotificationChannel> getNotificationChannels() {
        return setOnLoggedCallback.IconCompatParcelizer(this.mNotificationManager);
    }

    private NotificationManagerCompat(Context context) {
        this.mContext = context;
        this.mNotificationManager = (NotificationManager) context.getSystemService(RemoteMessageConst.NOTIFICATION);
    }

    public void createNotificationChannel(accessgetNextcp accessgetnextcp) {
        createNotificationChannel(accessgetnextcp.RemoteActionCompatParcelizer());
    }

    public void createNotificationChannelGroup(accessgetPreviouscp accessgetpreviouscp) {
        createNotificationChannelGroup(accessgetpreviouscp.serializer());
    }

    public List<accessgetPreviouscp> getNotificationChannelGroupsCompat() {
        List<NotificationChannelGroup> notificationChannelGroups = getNotificationChannelGroups();
        if (notificationChannelGroups.isEmpty()) {
            return Collections.EMPTY_LIST;
        }
        ArrayList arrayList = new ArrayList(notificationChannelGroups.size());
        Iterator<NotificationChannelGroup> it = notificationChannelGroups.iterator();
        while (it.hasNext()) {
            arrayList.add(new accessgetPreviouscp(it.next()));
        }
        return arrayList;
    }

    public List<accessgetNextcp> getNotificationChannelsCompat() {
        List<NotificationChannel> notificationChannels = getNotificationChannels();
        if (notificationChannels.isEmpty()) {
            return Collections.EMPTY_LIST;
        }
        ArrayList arrayList = new ArrayList(notificationChannels.size());
        Iterator<NotificationChannel> it = notificationChannels.iterator();
        while (it.hasNext()) {
            arrayList.add(new accessgetNextcp(it.next()));
        }
        return arrayList;
    }

    public static Set<String> getEnabledListenerPackages(Context context) {
        Set<String> set;
        String string = Settings.Secure.getString(context.getContentResolver(), SETTING_ENABLED_NOTIFICATION_LISTENERS);
        synchronized (sEnabledNotificationListenersLock) {
            if (string != null) {
                if (!string.equals(sEnabledNotificationListeners)) {
                    String[] strArrSplit = string.split(":", -1);
                    HashSet hashSet = new HashSet(strArrSplit.length);
                    for (String str : strArrSplit) {
                        ComponentName componentNameUnflattenFromString = ComponentName.unflattenFromString(str);
                        if (componentNameUnflattenFromString != null) {
                            hashSet.add(componentNameUnflattenFromString.getPackageName());
                        }
                    }
                    sEnabledNotificationListenerPackages = hashSet;
                    sEnabledNotificationListeners = string;
                }
                set = sEnabledNotificationListenerPackages;
            } else {
                set = sEnabledNotificationListenerPackages;
            }
            throw th;
        }
        return set;
    }

    public boolean canPostPromotedNotifications() {
        if (Build.VERSION.SDK_INT >= 36) {
            return setOnFocusEvent.write(this.mNotificationManager);
        }
        return false;
    }

    public void cancel(int i) {
        cancel(null, i);
    }

    public NotificationChannel getNotificationChannel(String str, String str2) {
        return Build.VERSION.SDK_INT >= 30 ? FocusEventModifierNode.read(this.mNotificationManager, str, str2) : getNotificationChannel(str);
    }

    private static boolean useSideChannelForNotification(Notification notification) {
        Bundle bundleSerializer = accessgetUpcp.serializer(notification);
        return bundleSerializer != null && bundleSerializer.getBoolean(EXTRA_USE_SIDE_CHANNEL);
    }

    public void createNotificationChannel(NotificationChannel notificationChannel) {
        setOnLoggedCallback.RemoteActionCompatParcelizer(this.mNotificationManager, notificationChannel);
    }

    public void createNotificationChannelGroup(NotificationChannelGroup notificationChannelGroup) {
        setOnLoggedCallback.read(this.mNotificationManager, notificationChannelGroup);
    }

    public void createNotificationChannelGroupsCompat(List<accessgetPreviouscp> list) {
        if (list.isEmpty()) {
            return;
        }
        ArrayList arrayList = new ArrayList(list.size());
        Iterator<accessgetPreviouscp> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(it.next().serializer());
        }
        setOnLoggedCallback.read(this.mNotificationManager, arrayList);
    }

    public void createNotificationChannelsCompat(List<accessgetNextcp> list) {
        if (list.isEmpty()) {
            return;
        }
        ArrayList arrayList = new ArrayList(list.size());
        Iterator<accessgetNextcp> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(it.next().RemoteActionCompatParcelizer());
        }
        setOnLoggedCallback.write(this.mNotificationManager, arrayList);
    }

    public accessgetNextcp getNotificationChannelCompat(String str) {
        NotificationChannel notificationChannel = getNotificationChannel(str);
        if (notificationChannel != null) {
            return new accessgetNextcp(notificationChannel);
        }
        return null;
    }

    public accessgetPreviouscp getNotificationChannelGroupCompat(String str) {
        NotificationChannelGroup notificationChannelGroup = getNotificationChannelGroup(str);
        if (notificationChannelGroup != null) {
            return new accessgetPreviouscp(notificationChannelGroup);
        }
        return null;
    }

    public void notify(String str, int i, Notification notification) {
        if (!useSideChannelForNotification(notification)) {
            this.mNotificationManager.notify(str, i, notification);
        } else {
            pushSideChannelQueue(new FocusInteropUtils_androidKt(this.mContext.getPackageName(), i, str, notification));
            this.mNotificationManager.cancel(str, i);
        }
    }

    public boolean canUseFullScreenIntent() {
        int i = Build.VERSION.SDK_INT;
        if (i < 29) {
            return true;
        }
        if (i < 34) {
            return this.mContext.checkSelfPermission("android.permission.USE_FULL_SCREEN_INTENT") == 0;
        }
        return invalidateFocusProperties.read(this.mNotificationManager);
    }

    public accessgetNextcp getNotificationChannelCompat(String str, String str2) {
        NotificationChannel notificationChannel = getNotificationChannel(str, str2);
        if (notificationChannel != null) {
            return new accessgetNextcp(notificationChannel);
        }
        return null;
    }

    public NotificationManagerCompat(NotificationManager notificationManager, Context context) {
        this.mContext = context;
        this.mNotificationManager = notificationManager;
    }

    public NotificationChannel getNotificationChannel(String str) {
        return setOnLoggedCallback.serializer(this.mNotificationManager, str);
    }

    public void notify(int i, Notification notification) {
        notify(null, i, notification);
    }

    public void notify(List<Object> list) {
        if (list.size() <= 0) {
            return;
        }
        m1$$ExternalSyntheticOutline0.m(list.get(0));
        throw null;
    }
}
