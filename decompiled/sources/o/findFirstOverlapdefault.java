package o;

import android.app.job.JobInfo;
import android.content.ComponentName;
import android.content.Context;
import android.net.NetworkRequest;
import android.os.Build;
import android.os.PersistableBundle;
import androidx.work.impl.background.systemjob.SystemJobService;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public final class findFirstOverlapdefault {
    public final graphicsLayersKFY_QEdefault IconCompatParcelizer;
    public final ComponentName RemoteActionCompatParcelizer;
    public final boolean serializer;

    static {
        setRotationX.IconCompatParcelizer("SystemJobInfoConverter");
    }

    public findFirstOverlapdefault(Context context, getClipannotations getclipannotations, boolean z) {
        this.IconCompatParcelizer = getclipannotations;
        this.RemoteActionCompatParcelizer = new ComponentName(context.getApplicationContext(), (Class<?>) SystemJobService.class);
        this.serializer = z;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final JobInfo write(setFrom58bKbWc setfrom58bkbwc, int i) {
        int i2;
        String str;
        toolingGraphicsLayer toolinggraphicslayer = setfrom58bkbwc.read;
        PersistableBundle persistableBundle = new PersistableBundle();
        persistableBundle.putString("EXTRA_WORK_SPEC_ID", setfrom58bkbwc.RatingCompat);
        persistableBundle.putInt("EXTRA_WORK_SPEC_GENERATION", setfrom58bkbwc.MediaDescriptionCompat);
        persistableBundle.putBoolean("EXTRA_IS_PERIODIC", setfrom58bkbwc.read());
        JobInfo.Builder builder = new JobInfo.Builder(i, this.RemoteActionCompatParcelizer);
        boolean z = toolinggraphicslayer.MediaMetadataCompat;
        Set<accessgetRenderEffectjd> set = toolinggraphicslayer.write;
        JobInfo.Builder requiresCharging = builder.setRequiresCharging(z);
        boolean z2 = toolinggraphicslayer.MediaSessionCompatQueueItem;
        JobInfo.Builder extras = requiresCharging.setRequiresDeviceIdle(z2).setExtras(persistableBundle);
        NetworkRequest networkRequestWrite = toolinggraphicslayer.write();
        if (networkRequestWrite != null) {
            r8lambdaVfnkIDPhLBd69Q1jeqVaNvOpz6k.read(extras, networkRequestWrite);
        } else {
            setCompositingStrategyaDBOjCE setcompositingstrategyadbojce = toolinggraphicslayer.MediaDescriptionCompat;
            if (Build.VERSION.SDK_INT < 30 || setcompositingstrategyadbojce != setCompositingStrategyaDBOjCE.TEMPORARILY_UNMETERED) {
                int i3 = rotateLeft.IconCompatParcelizer[setcompositingstrategyadbojce.ordinal()];
                if (i3 != 1) {
                    i2 = 2;
                    if (i3 == 2) {
                        i2 = 1;
                    } else if (i3 != 3) {
                        i2 = 4;
                        if (i3 == 4) {
                            i2 = 3;
                        } else if (i3 != 5) {
                            setRotationX setrotationx = setRotationX.read();
                            setcompositingstrategyadbojce.toString();
                            setrotationx.getClass();
                            i2 = 1;
                        }
                    }
                } else {
                    i2 = 0;
                }
                extras.setRequiredNetworkType(i2);
            } else {
                extras.setRequiredNetwork(new NetworkRequest.Builder().addCapability(25).build());
            }
        }
        if (!z2) {
            extras.setBackoffCriteria(setfrom58bkbwc.serializer, setfrom58bkbwc.write == GraphicsLayerScope.LINEAR ? 0 : 1);
        }
        long jSerializer = setfrom58bkbwc.serializer();
        ((getClipannotations) this.IconCompatParcelizer).getClass();
        long jMax = Math.max(jSerializer - System.currentTimeMillis(), 0L);
        if (Build.VERSION.SDK_INT <= 28 || jMax > 0) {
            extras.setMinimumLatency(jMax);
        } else if (!setfrom58bkbwc.MediaBrowserCompatMediaItem && this.serializer) {
            extras.setImportantWhileForeground(true);
        }
        if (!set.isEmpty()) {
            for (accessgetRenderEffectjd accessgetrendereffectjd : set) {
                extras.addTriggerContentUri(new JobInfo.TriggerContentUri(accessgetrendereffectjd.RemoteActionCompatParcelizer(), accessgetrendereffectjd.write() ? 1 : 0));
            }
            extras.setTriggerContentUpdateDelay(toolinggraphicslayer.serializer);
            extras.setTriggerContentMaxDelay(toolinggraphicslayer.RemoteActionCompatParcelizer);
        }
        extras.setPersisted(false);
        extras.setRequiresBatteryNotLow(toolinggraphicslayer.RatingCompat);
        extras.setRequiresStorageNotLow(toolinggraphicslayer.MediaBrowserCompatMediaItem);
        Object[] objArr = setfrom58bkbwc.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg > 0;
        boolean z3 = jMax > 0;
        int i4 = Build.VERSION.SDK_INT;
        if (i4 >= 31 && setfrom58bkbwc.MediaBrowserCompatMediaItem && objArr == false && !z3) {
            extras.setExpedited(true);
        }
        if (i4 >= 35 && (str = setfrom58bkbwc.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM) != null) {
            extras.setTraceTag(str);
        }
        return extras.build();
    }
}
