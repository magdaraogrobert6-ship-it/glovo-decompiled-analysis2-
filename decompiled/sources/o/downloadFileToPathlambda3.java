package o;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.chrono.ChronoLocalDate;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public abstract class downloadFileToPathlambda3 {
    public static void serializer(Context context, Intent intent) {
        context.startForegroundService(intent);
    }

    public static final double RemoteActionCompatParcelizer(ArrayList arrayList) {
        List listPlaybackStateCompatCustomAction = onContentCardDismissed.PlaybackStateCompatCustomAction(arrayList);
        if (listPlaybackStateCompatCustomAction.isEmpty()) {
            ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer("Failed requirement.");
            return 0.0d;
        }
        if (listPlaybackStateCompatCustomAction.size() % 2 != 0) {
            return ((Number) listPlaybackStateCompatCustomAction.get(listPlaybackStateCompatCustomAction.size() / 2)).doubleValue();
        }
        return (((Number) listPlaybackStateCompatCustomAction.get((listPlaybackStateCompatCustomAction.size() - 1) / 2)).doubleValue() + ((Number) listPlaybackStateCompatCustomAction.get(listPlaybackStateCompatCustomAction.size() / 2)).doubleValue()) / 2.0d;
    }

    public static Intent write(Context context, BroadcastReceiver broadcastReceiver, IntentFilter intentFilter, String str, int i) {
        if ((i & 4) != 0 && str == null) {
            return context.registerReceiver(broadcastReceiver, intentFilter, FocusListener.serializer(context), null);
        }
        return context.registerReceiver(broadcastReceiver, intentFilter, str, null, 0);
    }

    public static final deleteSharedPreferencesFilelambda0 serializer(double d) {
        int i = (int) d;
        return new deleteSharedPreferencesFilelambda0(i % 24, (int) ((d - ((double) i)) * 60.0d));
    }

    public static final double write(setDoesBackButtonDismissInAppMessageViewFieldandroid_sdk_ui_release setdoesbackbuttondismissinappmessageviewfieldandroid_sdk_ui_release, InAppMessageManagerBaseExternalSyntheticLambda1 inAppMessageManagerBaseExternalSyntheticLambda1) {
        setdoesbackbuttondismissinappmessageviewfieldandroid_sdk_ui_release.getClass();
        LocalDateTime localDateTime = setdoesbackbuttondismissinappmessageviewfieldandroid_sdk_ui_release.value;
        double minute = (((double) localDateTime.getMinute()) / 60.0d) + ((double) localDateTime.getHour());
        LocalDate localDate = localDateTime.toLocalDate();
        localDate.getClass();
        new InAppMessageManagerBaseExternalSyntheticLambda1(localDate);
        return localDate.compareTo((ChronoLocalDate) inAppMessageManagerBaseExternalSyntheticLambda1.value) > 0 ? minute + 24.0d : minute;
    }
}
