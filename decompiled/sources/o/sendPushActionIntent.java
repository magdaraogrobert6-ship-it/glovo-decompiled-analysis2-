package o;

import android.util.Pair;
import com.sentiance.core.model.thrift.DetectionTrigger;
import java.util.Iterator;

/* JADX INFO: loaded from: classes3.dex */
public class sendPushActionIntent extends logBaiduNotificationClicklambda1 {
    private final long IconCompatParcelizer;
    private final setSoundIfPresentAndSupportedlambda1 RemoteActionCompatParcelizer;
    private final DetectionTrigger read;
    private final String serializer;
    private final Byte write;

    @Override // o.logBaiduNotificationClicklambda1
    public final Iterator<Pair<getCustomLocationProviderNamesandroid_sdk_base_release, isValidNotificationVisibility>> write() {
        return new sendPushMessageReceivedBroadcastlambda0(this);
    }

    public sendPushActionIntent(setSoundIfPresentAndSupportedlambda1 setsoundifpresentandsupportedlambda1, DetectionTrigger detectionTrigger, long j, byte b, String str) {
        this.RemoteActionCompatParcelizer = setsoundifpresentandsupportedlambda1;
        this.read = detectionTrigger;
        this.IconCompatParcelizer = j;
        this.write = Byte.valueOf(b);
        this.serializer = str;
    }
}
