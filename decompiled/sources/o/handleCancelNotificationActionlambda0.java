package o;

import android.location.Location;
import android.util.Pair;
import java.util.Iterator;

/* JADX INFO: loaded from: classes3.dex */
public class handleCancelNotificationActionlambda0 extends logBaiduNotificationClicklambda1 {
    private final Location RemoteActionCompatParcelizer;
    private final String serializer;
    private final setSoundIfPresentAndSupportedlambda1 write;

    @Override // o.logBaiduNotificationClicklambda1
    public final Iterator<Pair<getCustomLocationProviderNamesandroid_sdk_base_release, isValidNotificationVisibility>> write() {
        return new handleContentCardsSerializedCardIfPresent(this);
    }

    public handleCancelNotificationActionlambda0(setSoundIfPresentAndSupportedlambda1 setsoundifpresentandsupportedlambda1, Location location, String str) {
        this.write = setsoundifpresentandsupportedlambda1;
        this.RemoteActionCompatParcelizer = location;
        this.serializer = str;
    }
}
