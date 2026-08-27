package o;

import android.content.Context;
import android.content.Intent;
import com.sentiance.sdk.InjectUsing;
import com.sentiance.sdk.services.ServiceStartResult;
import com.sentiance.sdk.services.ServiceType;

/* JADX INFO: loaded from: classes3.dex */
@InjectUsing(componentName = "ServiceStarter")
public abstract class migrateBannerImpressionMapToJsonlambda10 {
    final Context RemoteActionCompatParcelizer;
    final parseLonglambda0 read;
    private final r8lambdafxbJOrD4Rv7HbEvEIn3jpfsEg write;

    public abstract ServiceStartResult write(Intent intent);

    public migrateBannerImpressionMapToJsonlambda10(Context context, r8lambdafxbJOrD4Rv7HbEvEIn3jpfsEg r8lambdafxbjord4rv7hbevein3jpfseg, parseLonglambda0 parselonglambda0) {
        this.RemoteActionCompatParcelizer = context;
        this.write = r8lambdafxbjord4rv7hbevein3jpfseg;
        this.read = parselonglambda0;
    }

    public final ServiceStartResult read(ServiceType serviceType, Intent intent) {
        if (serviceType != ServiceType.BACKGROUND && this.write.serializer(null) >= 26) {
            return write(intent);
        }
        this.RemoteActionCompatParcelizer.startService(intent);
        return ServiceStartResult.SUCCESS;
    }
}
