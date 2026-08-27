package o;

import com.sentiance.sdk.SdkStatusUpdateListener;
import com.sentiance.sdk.Sentiance;
import java.util.Set;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class getBitmapFromDiskCache implements r8lambdaA5Nojo_weyBvRJwWwexNGN83YI {
    public final /* synthetic */ Object IconCompatParcelizer;
    public final /* synthetic */ int read;

    public /* synthetic */ getBitmapFromDiskCache(int i, Object obj) {
        this.read = i;
        this.IconCompatParcelizer = obj;
    }

    @Override // o.r8lambdaA5Nojo_weyBvRJwWwexNGN83YI
    public final void RemoteActionCompatParcelizer() {
        int i = this.read;
        Object obj = this.IconCompatParcelizer;
        if (i != 0) {
            Sentiance.lambda$setTransmittableDataTypes$17((Set) obj);
        } else {
            Sentiance.lambda$setSdkStatusUpdateListener$34((SdkStatusUpdateListener) obj);
        }
    }
}
