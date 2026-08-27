package o;

import android.util.Pair;
import java.util.Iterator;

/* JADX INFO: loaded from: classes3.dex */
public class refreshBannersIfAppropriate extends logBaiduNotificationClicklambda1 {
    private final long IconCompatParcelizer;
    private final String RemoteActionCompatParcelizer;
    private final byte read;
    private final setSoundIfPresentAndSupportedlambda1 write;

    @Override // o.logBaiduNotificationClicklambda1
    public final Iterator<Pair<getCustomLocationProviderNamesandroid_sdk_base_release, isValidNotificationVisibility>> write() {
        return new prefetchBitmapsIfNewlyReceivedStoryPush(this);
    }

    public refreshBannersIfAppropriate(setSoundIfPresentAndSupportedlambda1 setsoundifpresentandsupportedlambda1, String str, long j, byte b) {
        this.write = setsoundifpresentandsupportedlambda1;
        this.RemoteActionCompatParcelizer = str;
        this.IconCompatParcelizer = j;
        this.read = b;
    }
}
