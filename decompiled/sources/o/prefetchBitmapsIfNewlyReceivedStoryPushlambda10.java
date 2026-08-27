package o;

import android.location.Location;
import android.util.Pair;
import java.util.Iterator;

/* JADX INFO: loaded from: classes3.dex */
public class prefetchBitmapsIfNewlyReceivedStoryPushlambda10 extends logBaiduNotificationClicklambda1 {
    private final handleIncomingIntent IconCompatParcelizer;
    private final Location RemoteActionCompatParcelizer;
    private final String read;
    private final long serializer;
    private final setSoundIfPresentAndSupportedlambda1 write;

    @Override // o.logBaiduNotificationClicklambda1
    public final Iterator<Pair<getCustomLocationProviderNamesandroid_sdk_base_release, isValidNotificationVisibility>> write() {
        return new refreshBannersIfAppropriatelambda1(this);
    }

    public prefetchBitmapsIfNewlyReceivedStoryPushlambda10(setSoundIfPresentAndSupportedlambda1 setsoundifpresentandsupportedlambda1, Location location, String str, long j, handleIncomingIntent handleincomingintent) {
        this.write = setsoundifpresentandsupportedlambda1;
        this.RemoteActionCompatParcelizer = location;
        this.read = str;
        this.serializer = j;
        this.IconCompatParcelizer = handleincomingintent;
    }
}
