package o;

import com.sentiance.sdk.OnStartFinishedHandler;
import com.sentiance.sdk.Sentiance;
import com.sentiance.sdk.UserLinkerAsync;
import java.util.Date;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class initDiskCacheTask implements r8lambdaA5Nojo_weyBvRJwWwexNGN83YI {
    public final /* synthetic */ Sentiance IconCompatParcelizer;
    public final /* synthetic */ Object RemoteActionCompatParcelizer;
    public final /* synthetic */ Object read;
    public final /* synthetic */ int write;

    public /* synthetic */ initDiskCacheTask(Sentiance sentiance, Object obj, Object obj2, int i) {
        this.write = i;
        this.IconCompatParcelizer = sentiance;
        this.read = obj;
        this.RemoteActionCompatParcelizer = obj2;
    }

    @Override // o.r8lambdaA5Nojo_weyBvRJwWwexNGN83YI
    public final void RemoteActionCompatParcelizer() {
        int i = this.write;
        Object obj = this.RemoteActionCompatParcelizer;
        Object obj2 = this.read;
        Sentiance sentiance = this.IconCompatParcelizer;
        if (i == 0) {
            sentiance.lambda$linkLegacyUser$5((BrazeNotificationUtilsExternalSyntheticLambda14) obj2, (UserLinkerAsync) obj);
            return;
        }
        if (i == 1) {
            sentiance.lambda$enableDetections$10((BrazeNotificationUtilsExternalSyntheticLambda14) obj2, (Date) obj);
        } else if (i != 2) {
            sentiance.lambda$start$8((Date) obj2, (OnStartFinishedHandler) obj);
        } else {
            sentiance.lambda$addUserMetadataField$41((String) obj2, (String) obj);
        }
    }
}
