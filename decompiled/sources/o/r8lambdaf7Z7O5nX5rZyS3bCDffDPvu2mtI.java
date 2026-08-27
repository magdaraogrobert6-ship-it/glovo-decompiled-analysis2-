package o;

import android.app.usage.UsageStatsManager;
import android.content.Context;

/* JADX INFO: loaded from: classes3.dex */
public class r8lambdaf7Z7O5nX5rZyS3bCDffDPvu2mtI {
    private final Context write;

    public r8lambdaf7Z7O5nX5rZyS3bCDffDPvu2mtI(Context context) {
        this.write = context;
    }

    public final Byte write() {
        UsageStatsManager usageStatsManager = (UsageStatsManager) this.write.getSystemService("usagestats");
        if (usageStatsManager == null) {
            return null;
        }
        int appStandbyBucket = usageStatsManager.getAppStandbyBucket();
        if (appStandbyBucket < 10) {
            return (byte) 5;
        }
        if (appStandbyBucket == 10) {
            return (byte) 1;
        }
        if (appStandbyBucket == 20) {
            return (byte) 4;
        }
        if (appStandbyBucket == 30) {
            return (byte) 2;
        }
        if (appStandbyBucket == 40) {
            return (byte) 3;
        }
        if (appStandbyBucket != 45) {
            return Byte.valueOf((byte) appStandbyBucket);
        }
        return (byte) 6;
    }
}
