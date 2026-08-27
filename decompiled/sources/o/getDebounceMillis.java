package o;

import com.google.android.gms.measurement.internal.zzpg;

/* JADX INFO: loaded from: classes2.dex */
public final class getDebounceMillis {
    public final zzpg serializer;
    public int write = 1;
    public long RemoteActionCompatParcelizer = write();

    public final long write() {
        zzpg zzpgVar = this.serializer;
        accessgetSystemNavigationDowncp.IconCompatParcelizer(zzpgVar);
        long jLongValue = ((Long) premeasure0kLqBqw.getLifecycleRegistry1.IconCompatParcelizer(null)).longValue();
        long jLongValue2 = ((Long) premeasure0kLqBqw.onStop.IconCompatParcelizer(null)).longValue();
        for (int i = 1; i < this.write; i++) {
            jLongValue += jLongValue;
            if (jLongValue >= jLongValue2) {
                break;
            }
        }
        ((accessgetTvInputComposite1cp) zzpgVar.ParcelableVolumeInfo()).getClass();
        return Math.min(jLongValue, jLongValue2) + System.currentTimeMillis();
    }

    public getDebounceMillis(zzpg zzpgVar) {
        this.serializer = zzpgVar;
    }
}
