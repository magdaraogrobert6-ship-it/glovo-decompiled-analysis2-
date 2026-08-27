package com.qualtrics.digital;

import android.app.AlarmManager;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.SystemClock;
import android.util.Base64;
import androidx.compose.ui.graphics.Fields;
import androidx.core.app.NotificationManagerCompat;
import com.deliveryhero.chatsdk.util.PushNotificationParserObj;
import java.nio.charset.StandardCharsets;
import java.util.UUID;
import o.getEnterdhqQ8s;

/* JADX INFO: loaded from: classes4.dex */
public class QualtricsNotificationManager extends BroadcastReceiver {
    private static final String CHANNEL_ID = "qualtrics_notification_channel";
    private static byte IconCompatParcelizer = -112;
    private static int RemoteActionCompatParcelizer = 0;
    private static int read = 1;

    /* JADX INFO: loaded from: classes5.dex */
    public final class IntentKeys {
        static final String ACTIONSETID = "actionSetID";
        static final String AUTO_CLOSE_AT_END_OF_SURVEY = "autoCloseAtEndOfSurvey";
        static final String CREATIVEID = "creativeID";
        private static final String DESCRIPTION = "description";
        static final String INTERCEPTID = "interceptID";
        static final String TARGET_URL = "targetURL";
        private static final String TITLE = "title";

        public IntentKeys() {
        }
    }

    public static boolean schedule(Context context, NotificationOptions notificationOptions, String str, String str2, String str3, String str4, boolean z) {
        if (!((NotificationManager) context.getSystemService(NotificationManager.class)).areNotificationsEnabled()) {
            QualtricsLog.logError("Could not schedule notification - notifications are disabled");
            return false;
        }
        NotificationDisplayOptions notificationDisplayOptions = notificationOptions.Notification;
        if (notificationDisplayOptions.Delay == 0) {
            display(context, notificationDisplayOptions.Title, notificationDisplayOptions.Description, str, str2, str3, str4, z);
            return true;
        }
        String string = UUID.randomUUID().toString();
        Bundle bundle = new Bundle();
        bundle.putString("targetURL", str);
        bundle.putString("description", notificationOptions.Notification.Description);
        bundle.putString(PushNotificationParserObj.TITLE_KEY, notificationOptions.Notification.Title);
        bundle.putString("interceptID", str2);
        bundle.putString("creativeID", str3);
        bundle.putString("actionSetID", str4);
        bundle.putBoolean("autoCloseAtEndOfSurvey", z);
        ((AlarmManager) context.getSystemService("alarm")).set(2, SystemClock.elapsedRealtime() + ((long) (notificationOptions.Notification.Delay * 1000)), PendingIntent.getBroadcast(context, 0, new Intent(context, (Class<?>) QualtricsNotificationManager.class).putExtras(bundle).setFlags(874512384).setData(Uri.parse(string)), 67108864));
        return true;
    }

    private static void display(Context context, String str, String str2, String str3, String str4, String str5, String str6, boolean z) {
        String string = UUID.randomUUID().toString();
        int i = R.drawable.default_notification_icon;
        int notificationIconAsset = Properties.instance(context).getNotificationIconAsset();
        if (notificationIconAsset != 0) {
            i = notificationIconAsset;
        }
        Intent flags = new Intent(context, (Class<?>) QualtricsSurveyActivity.class).putExtra("targetURL", str3).putExtra("interceptID", str4).putExtra("creativeID", str5).putExtra("actionSetID", str6).setData(Uri.parse(string)).setFlags(874512384);
        flags.putExtra("autoCloseAtEndOfSurvey", z);
        PendingIntent activity = PendingIntent.getActivity(context, 0, flags, 67108864);
        getEnterdhqQ8s getenterdhqq8s = new getEnterdhqQ8s(context, CHANNEL_ID);
        getenterdhqq8s.r8lambda54BeH8ZsBru0CXI2CCSP2syNys.icon = i;
        getenterdhqq8s.PlaybackStateCompatCustomAction = getEnterdhqQ8s.serializer((CharSequence) str);
        getenterdhqq8s.MediaDescriptionCompat = getEnterdhqQ8s.serializer((CharSequence) str2);
        getenterdhqq8s.r8lambdaXj9c8VIP9DfEvaTmZt0ejAuC4a4 = 0;
        getenterdhqq8s.ParcelableVolumeInfo = string;
        getenterdhqq8s.write(16, true);
        if (str3 != null) {
            getenterdhqq8s.MediaMetadataCompat = activity;
        }
        NotificationManagerCompat.from(context).notify(string, 0, getenterdhqq8s.write());
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        try {
            Bundle extras = intent.getExtras();
            display(context, extras.getString(PushNotificationParserObj.TITLE_KEY), extras.getString("description"), extras.getString("targetURL"), extras.getString("interceptID"), extras.getString("creativeID"), extras.getString("actionSetID"), extras.getBoolean("autoCloseAtEndOfSurvey"));
        } catch (Throwable th) {
            CrashReporter.logCrash(th);
        }
    }

    private static void a(String str, Object[] objArr) {
        byte[] bArrDecode = Base64.decode(str, 0);
        byte[] bArr = new byte[bArrDecode.length];
        for (int i = 0; i < bArrDecode.length; i++) {
            bArr[i] = (byte) (bArrDecode[(bArrDecode.length - i) - 1] ^ IconCompatParcelizer);
        }
        objArr[0] = new String(bArr, StandardCharsets.UTF_8);
    }

    public static void createChannel(Context context) {
        int i = 2 % 2;
        String string = context.getResources().getString(R.string.qualtrics_channel_name);
        if (string.startsWith("%('")) {
            int i2 = RemoteActionCompatParcelizer + 9;
            read = i2 % Fields.SpotShadowColor;
            int i3 = i2 % 2;
            Object[] objArr = new Object[1];
            a(string.substring(3), objArr);
            string = ((String) objArr[0]).intern();
        }
        String string2 = context.getResources().getString(R.string.qualtrics_channel_description);
        if (string2.startsWith("%('")) {
            int i4 = RemoteActionCompatParcelizer + 47;
            read = i4 % Fields.SpotShadowColor;
            int i5 = i4 % 2;
            String strSubstring = string2.substring(3);
            Object[] objArr2 = new Object[1];
            a(strSubstring, objArr2);
            string2 = ((String) objArr2[0]).intern();
            int i6 = read + 103;
            RemoteActionCompatParcelizer = i6 % Fields.SpotShadowColor;
            int i7 = i6 % 2;
        }
        NotificationChannel notificationChannel = new NotificationChannel(CHANNEL_ID, string, 3);
        notificationChannel.setDescription(string2);
        ((NotificationManager) context.getSystemService(NotificationManager.class)).createNotificationChannel(notificationChannel);
    }
}
