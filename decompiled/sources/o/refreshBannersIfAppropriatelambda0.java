package o;

import android.util.Pair;
import java.util.Iterator;

/* JADX INFO: loaded from: classes3.dex */
public class refreshBannersIfAppropriatelambda0 extends logBaiduNotificationClicklambda1 {
    private final String IconCompatParcelizer;
    private final setSoundIfPresentAndSupportedlambda1 RemoteActionCompatParcelizer;
    private final handleIncomingIntent read;
    private final long serializer;

    @Override // o.logBaiduNotificationClicklambda1
    public final Iterator<Pair<getCustomLocationProviderNamesandroid_sdk_base_release, isValidNotificationVisibility>> write() {
        return new logBaiduNotificationClicklambda2(this);
    }

    public refreshBannersIfAppropriatelambda0(setSoundIfPresentAndSupportedlambda1 setsoundifpresentandsupportedlambda1, long j, String str, handleIncomingIntent handleincomingintent) {
        this.RemoteActionCompatParcelizer = setsoundifpresentandsupportedlambda1;
        this.serializer = j;
        this.IconCompatParcelizer = str;
        this.read = handleincomingintent;
    }
}
