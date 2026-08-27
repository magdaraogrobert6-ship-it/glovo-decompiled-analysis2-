package o;

import android.util.Pair;
import com.sentiance.core.model.thrift.DetectionTrigger;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public class setAccentColorIfPresentAndSupportedlambda10 extends logBaiduNotificationClicklambda1 {
    private final String IconCompatParcelizer;
    private final Byte MediaSessionCompatQueueItem;
    private final Map<String, String> RemoteActionCompatParcelizer;
    private final setSoundIfPresentAndSupportedlambda1 read;
    private final DetectionTrigger serializer;
    private final long write;

    @Override // o.logBaiduNotificationClicklambda1
    public final Iterator<Pair<getCustomLocationProviderNamesandroid_sdk_base_release, isValidNotificationVisibility>> write() {
        return new setContentIfPresent(this);
    }

    public setAccentColorIfPresentAndSupportedlambda10(setSoundIfPresentAndSupportedlambda1 setsoundifpresentandsupportedlambda1, DetectionTrigger detectionTrigger, long j, String str, Map<String, String> map, Byte b) {
        this.read = setsoundifpresentandsupportedlambda1;
        this.serializer = detectionTrigger;
        this.write = j;
        this.IconCompatParcelizer = str;
        this.RemoteActionCompatParcelizer = map;
        this.MediaSessionCompatQueueItem = b;
    }
}
