package o;

import com.sentiance.sdk.ondevice.api.OnDeviceDebug;
import com.sentiance.sdk.ondevice.api.OnDeviceTileDebug;
import java.util.Comparator;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class createStoryPageClickedPendingIntent implements Comparator {
    public final /* synthetic */ int RemoteActionCompatParcelizer;

    public /* synthetic */ createStoryPageClickedPendingIntent(int i) {
        this.RemoteActionCompatParcelizer = i;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        return this.RemoteActionCompatParcelizer != 0 ? OnDeviceTileDebug.lambda$getTiles$2((r8lambdapqC07N1rgU18W2Dq2HLrsvfo8qU) obj, (r8lambdapqC07N1rgU18W2Dq2HLrsvfo8qU) obj2) : OnDeviceDebug.lambda$getLatestHomeOrWorkLocation$5((r8lambdalI8uU9kRiGfJG6en6Xj7AF4cWAQ) obj, (r8lambdalI8uU9kRiGfJG6en6Xj7AF4cWAQ) obj2);
    }
}
