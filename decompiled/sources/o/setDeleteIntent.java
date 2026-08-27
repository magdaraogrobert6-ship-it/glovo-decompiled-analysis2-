package o;

import android.location.Location;
import com.sentiance.core.model.thrift.DetectionTrigger;

/* JADX INFO: loaded from: classes3.dex */
public class setDeleteIntent {
    protected final setSoundIfPresentAndSupportedlambda1 read;
    protected final setTickerIfPresent serializer;

    public final sendPushActionIntent write(long j, DetectionTrigger detectionTrigger, byte b, String str) {
        return new sendPushActionIntent(this.read, detectionTrigger, j, b, str);
    }

    public setDeleteIntent(setSoundIfPresentAndSupportedlambda1 setsoundifpresentandsupportedlambda1, setTickerIfPresent settickerifpresent) {
        this.read = setsoundifpresentandsupportedlambda1;
        this.serializer = settickerifpresent;
    }

    public final handleCancelNotificationActionlambda0 serializer(Location location, String str) {
        return new handleCancelNotificationActionlambda0(this.read, location, str);
    }
}
