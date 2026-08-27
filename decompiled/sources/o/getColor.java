package o;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import bo.app.w4$$ExternalSyntheticLambda0;
import java.util.LinkedHashSet;

/* JADX INFO: loaded from: classes.dex */
public final class getColor {
    public Object IconCompatParcelizer;
    public final accessgetStrokecp MediaSessionCompatQueueItem;
    public final Object RatingCompat;
    public final /* synthetic */ int RemoteActionCompatParcelizer;
    public final Context read;
    public final LinkedHashSet serializer;
    public final lowestNode write;

    public getColor(Context context, accessgetStrokecp accessgetstrokecp, int i) {
        this.RemoteActionCompatParcelizer = i;
        this.MediaSessionCompatQueueItem = accessgetstrokecp;
        Context applicationContext = context.getApplicationContext();
        applicationContext.getClass();
        this.read = applicationContext;
        this.RatingCompat = new Object();
        this.serializer = new LinkedHashSet();
        this.write = new lowestNode(0, this);
    }

    public final void serializer(Boolean bool) {
        synchronized (this.RatingCompat) {
            Object obj = this.IconCompatParcelizer;
            if (obj == null || !obj.equals(bool)) {
                this.IconCompatParcelizer = bool;
                this.MediaSessionCompatQueueItem.write.execute(new w4$$ExternalSyntheticLambda0(onContentCardDismissed.PlaybackStateCompat(this.serializer), 7, this));
            }
        }
    }

    public final IntentFilter read() {
        int i = this.RemoteActionCompatParcelizer;
        if (i == 0) {
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("android.intent.action.BATTERY_OKAY");
            intentFilter.addAction("android.intent.action.BATTERY_LOW");
            return intentFilter;
        }
        if (i != 1) {
            IntentFilter intentFilter2 = new IntentFilter();
            intentFilter2.addAction("android.intent.action.DEVICE_STORAGE_OK");
            intentFilter2.addAction("android.intent.action.DEVICE_STORAGE_LOW");
            return intentFilter2;
        }
        IntentFilter intentFilter3 = new IntentFilter();
        intentFilter3.addAction("android.os.action.CHARGING");
        intentFilter3.addAction("android.os.action.DISCHARGING");
        return intentFilter3;
    }

    /* JADX WARN: Code duplicated, block: B:21:0x0047  */
    public final Boolean serializer() {
        int i = this.RemoteActionCompatParcelizer;
        Context context = this.read;
        boolean z = false;
        if (i == 0) {
            Intent intentRegisterReceiver = context.registerReceiver(null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
            if (intentRegisterReceiver != null) {
                return Boolean.valueOf(intentRegisterReceiver.getIntExtra("status", -1) == 1 || ((float) intentRegisterReceiver.getIntExtra("level", -1)) / ((float) intentRegisterReceiver.getIntExtra("scale", -1)) > 0.15f);
            }
            setRotationX.read().serializer(setParent.write, "getInitialState - null intent received");
            return Boolean.FALSE;
        }
        if (i == 1) {
            Intent intentRegisterReceiver2 = context.registerReceiver(null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
            if (intentRegisterReceiver2 == null) {
                setRotationX.read().serializer(IntervalTreeNode.RemoteActionCompatParcelizer, "getInitialState - null intent received");
                return Boolean.FALSE;
            }
            int intExtra = intentRegisterReceiver2.getIntExtra("status", -1);
            return Boolean.valueOf(intExtra == 2 || intExtra == 5);
        }
        Intent intentRegisterReceiver3 = context.registerReceiver(null, read());
        if (intentRegisterReceiver3 == null || intentRegisterReceiver3.getAction() == null) {
            z = true;
        } else {
            String action = intentRegisterReceiver3.getAction();
            if (action != null) {
                int iHashCode = action.hashCode();
                if (iHashCode == -1181163412) {
                    action.equals("android.intent.action.DEVICE_STORAGE_LOW");
                } else if (iHashCode == -730838620 && action.equals("android.intent.action.DEVICE_STORAGE_OK")) {
                    z = true;
                }
            }
        }
        return Boolean.valueOf(z);
    }
}
