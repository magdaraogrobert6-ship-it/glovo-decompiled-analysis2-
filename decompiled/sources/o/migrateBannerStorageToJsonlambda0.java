package o;

import android.app.ForegroundServiceStartNotAllowedException;
import android.content.Context;
import android.content.Intent;
import com.sentiance.sdk.services.ServiceStartResult;

/* JADX INFO: loaded from: classes3.dex */
public class migrateBannerStorageToJsonlambda0 extends migrateBannerImpressionMapToJsonlambda10 {
    public migrateBannerStorageToJsonlambda0(Context context, r8lambdafxbJOrD4Rv7HbEvEIn3jpfsEg r8lambdafxbjord4rv7hbevein3jpfseg, parseLonglambda0 parselonglambda0) {
        super(context, r8lambdafxbjord4rv7hbevein3jpfseg, parselonglambda0);
    }

    @Override // o.migrateBannerImpressionMapToJsonlambda10
    public final ServiceStartResult write(Intent intent) {
        try {
            this.RemoteActionCompatParcelizer.startForegroundService(intent);
            return ServiceStartResult.SUCCESS;
        } catch (ForegroundServiceStartNotAllowedException | SecurityException e) {
            this.read.IconCompatParcelizer(false, e, "Foreground service start was refused by the OS", new Object[0]);
            return ServiceStartResult.NOT_PERMITTED_BY_OS;
        }
    }
}
