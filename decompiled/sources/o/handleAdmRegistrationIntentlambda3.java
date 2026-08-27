package o;

import android.content.Context;
import android.os.StatFs;

/* JADX INFO: loaded from: classes3.dex */
public final class handleAdmRegistrationIntentlambda3 {
    private final String IconCompatParcelizer;

    public final long RemoteActionCompatParcelizer() {
        String str = this.IconCompatParcelizer;
        StatFs statFs = new StatFs(str);
        return statFs.getBlockSizeLong() * new StatFs(str).getBlockCountLong();
    }

    public final long write() {
        StatFs statFs = new StatFs(this.IconCompatParcelizer);
        return statFs.getBlockSizeLong() * statFs.getAvailableBlocksLong();
    }

    public handleAdmRegistrationIntentlambda3(Context context) {
        context.getClass();
        this.IconCompatParcelizer = context.getNoBackupFilesDir().getAbsolutePath();
    }
}
