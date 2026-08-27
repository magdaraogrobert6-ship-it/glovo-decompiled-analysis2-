package o;

import android.os.PowerManager;
import com.sentiance.sdk.InjectUsing;
import com.sentiance.sdk.logging.Resource;
import java.util.ArrayList;
import java.util.HashMap;

/* JADX INFO: loaded from: classes4.dex */
@InjectUsing(componentName = "WakelockManager")
public class migrateSealedSessionsMapToJsonlambda20 {
    private final PowerManager IconCompatParcelizer;
    private final setNotificationBadgeNumber RatingCompat;
    private final parseStringAsColorIntlambda1 serializer;
    private final r8lambdaQv3gcJxzUxdig5g76qjUZxGjNI write;
    private final HashMap<String, PowerManager.WakeLock> read = new HashMap<>();
    private final ArrayList RemoteActionCompatParcelizer = new ArrayList();

    public final void IconCompatParcelizer() {
        synchronized (this) {
            for (String str : this.read.keySet()) {
                PowerManager.WakeLock wakeLock = this.read.get(str);
                if (wakeLock != null) {
                    while (wakeLock.isHeld()) {
                        write(str);
                    }
                }
            }
        }
    }

    public final void write(String str) {
        synchronized (this) {
            PowerManager.WakeLock wakeLock = this.read.get(str);
            if (wakeLock != null) {
                if (wakeLock.isHeld()) {
                    wakeLock.release();
                }
                if (!wakeLock.isHeld()) {
                    parseStringAsColorIntlambda1 parsestringascolorintlambda1 = this.serializer;
                    this.write.getClass();
                    parsestringascolorintlambda1.RemoteActionCompatParcelizer(System.currentTimeMillis(), str, Resource.WAKELOCK);
                    this.RemoteActionCompatParcelizer.remove(str);
                }
            }
        }
    }

    public migrateSealedSessionsMapToJsonlambda20(PowerManager powerManager, parseStringAsColorIntlambda1 parsestringascolorintlambda1, r8lambdaQv3gcJxzUxdig5g76qjUZxGjNI r8lambdaqv3gcjxzuxdig5g76qjuzxgjni, parseLonglambda0 parselonglambda0, getGeofenceRequestLocationannotations getgeofencerequestlocationannotations, setNotificationBadgeNumber setnotificationbadgenumber) {
        this.serializer = parsestringascolorintlambda1;
        this.write = r8lambdaqv3gcjxzuxdig5g76qjuzxgjni;
        this.RatingCompat = setnotificationbadgenumber;
        this.IconCompatParcelizer = powerManager;
    }

    public final boolean read(long j, String str) {
        synchronized (this) {
            if (str == null) {
                return false;
            }
            if (!this.RatingCompat.MediaDescriptionCompat()) {
                return false;
            }
            PowerManager.WakeLock wakeLockNewWakeLock = this.read.get(str);
            if (wakeLockNewWakeLock == null) {
                wakeLockNewWakeLock = this.IconCompatParcelizer.newWakeLock(1, str);
                this.read.put(str, wakeLockNewWakeLock);
            }
            if (!wakeLockNewWakeLock.isHeld()) {
                if (j > 0) {
                    wakeLockNewWakeLock.acquire(j);
                } else {
                    wakeLockNewWakeLock.acquire();
                }
                if (!this.RemoteActionCompatParcelizer.contains(str)) {
                    this.RemoteActionCompatParcelizer.add(str);
                }
            } else if (j > 0) {
                wakeLockNewWakeLock.acquire(j);
            } else {
                wakeLockNewWakeLock.acquire();
            }
            parseStringAsColorIntlambda1 parsestringascolorintlambda1 = this.serializer;
            this.write.getClass();
            parsestringascolorintlambda1.a(System.currentTimeMillis(), str, Resource.WAKELOCK);
            return true;
        }
    }
}
