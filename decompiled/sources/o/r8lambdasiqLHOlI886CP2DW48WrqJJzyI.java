package o;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.util.Log;
import androidx.work.RxWorker$1$$ExternalSyntheticLambda0;
import com.google.android.gms.tasks.zzw;
import com.google.android.material.textfield.DropdownMenuEndIconDelegate$$ExternalSyntheticLambda5;
import io.sentry.android.core.SentryLogcatAdapter;
import java.util.ArrayDeque;
import java.util.Objects;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes2.dex */
public final class r8lambdasiqLHOlI886CP2DW48WrqJJzyI implements ServiceConnection {
    public final Intent IconCompatParcelizer;
    public final ScheduledThreadPoolExecutor MediaBrowserCompatMediaItem;
    public boolean RemoteActionCompatParcelizer;
    public accessaddExtraDataToAccessibilityNodeInfoHelper read;
    public final ArrayDeque serializer;
    public final Context write;

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        synchronized (this) {
            if (Log.isLoggable("FirebaseMessaging", 3)) {
                Objects.toString(componentName);
            }
            this.RemoteActionCompatParcelizer = false;
            if (iBinder instanceof accessaddExtraDataToAccessibilityNodeInfoHelper) {
                this.read = (accessaddExtraDataToAccessibilityNodeInfoHelper) iBinder;
                write();
                return;
            }
            SentryLogcatAdapter.serializer("FirebaseMessaging", "Invalid service connection: " + iBinder);
            ArrayDeque arrayDeque = this.serializer;
            while (!arrayDeque.isEmpty()) {
                ((accessdispatchGenericMotionEvents408734394) arrayDeque.poll()).RemoteActionCompatParcelizer.write(null);
            }
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        if (Log.isLoggable("FirebaseMessaging", 3)) {
            Objects.toString(componentName);
        }
        write();
    }

    public final zzw IconCompatParcelizer(Intent intent) {
        zzw zzwVar;
        synchronized (this) {
            Log.isLoggable("FirebaseMessaging", 3);
            accessdispatchGenericMotionEvents408734394 accessdispatchgenericmotionevents408734394 = new accessdispatchGenericMotionEvents408734394(intent);
            ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = this.MediaBrowserCompatMediaItem;
            accessdispatchgenericmotionevents408734394.RemoteActionCompatParcelizer.RemoteActionCompatParcelizer.addOnCompleteListener(scheduledThreadPoolExecutor, new DropdownMenuEndIconDelegate$$ExternalSyntheticLambda5(22, scheduledThreadPoolExecutor.schedule(new RxWorker$1$$ExternalSyntheticLambda0(27, accessdispatchgenericmotionevents408734394), 20L, TimeUnit.SECONDS)));
            this.serializer.add(accessdispatchgenericmotionevents408734394);
            write();
            zzwVar = accessdispatchgenericmotionevents408734394.RemoteActionCompatParcelizer.RemoteActionCompatParcelizer;
        }
        return zzwVar;
    }

    public final void write() {
        synchronized (this) {
            try {
                Log.isLoggable("FirebaseMessaging", 3);
                while (!this.serializer.isEmpty()) {
                    Log.isLoggable("FirebaseMessaging", 3);
                    accessaddExtraDataToAccessibilityNodeInfoHelper accessaddextradatatoaccessibilitynodeinfohelper = this.read;
                    if (accessaddextradatatoaccessibilitynodeinfohelper == null || !accessaddextradatatoaccessibilitynodeinfohelper.isBinderAlive()) {
                        Log.isLoggable("FirebaseMessaging", 3);
                        if (!this.RemoteActionCompatParcelizer) {
                            this.RemoteActionCompatParcelizer = true;
                            try {
                                if (!accessgetTvAudioDescriptionMixingVolumeUpcp.RemoteActionCompatParcelizer().read(this.write, this.IconCompatParcelizer, this, 65)) {
                                    SentryLogcatAdapter.serializer("FirebaseMessaging", "binding to the service failed");
                                    this.RemoteActionCompatParcelizer = false;
                                    ArrayDeque arrayDeque = this.serializer;
                                    while (!arrayDeque.isEmpty()) {
                                        ((accessdispatchGenericMotionEvents408734394) arrayDeque.poll()).RemoteActionCompatParcelizer.write(null);
                                    }
                                }
                            } catch (SecurityException e) {
                                SentryLogcatAdapter.read("FirebaseMessaging", "Exception while binding the service", e);
                            }
                        }
                        return;
                    }
                    Log.isLoggable("FirebaseMessaging", 3);
                    this.read.write((accessdispatchGenericMotionEvents408734394) this.serializer.poll());
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public r8lambdasiqLHOlI886CP2DW48WrqJJzyI(Context context) {
        ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = new ScheduledThreadPoolExecutor(1, new accessgetTvInputHdmi1cp("Firebase-FirebaseInstanceIdServiceConnection"));
        scheduledThreadPoolExecutor.setKeepAliveTime(40L, TimeUnit.SECONDS);
        scheduledThreadPoolExecutor.allowCoreThreadTimeOut(true);
        this.serializer = new ArrayDeque();
        this.RemoteActionCompatParcelizer = false;
        Context applicationContext = context.getApplicationContext();
        this.write = applicationContext;
        this.IconCompatParcelizer = new Intent("com.google.firebase.MESSAGING_EVENT").setPackage(applicationContext.getPackageName());
        this.MediaBrowserCompatMediaItem = scheduledThreadPoolExecutor;
    }
}
