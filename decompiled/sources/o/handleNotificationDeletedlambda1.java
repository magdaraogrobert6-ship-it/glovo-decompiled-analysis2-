package o;

import android.util.Pair;
import java.util.Iterator;

/* JADX INFO: loaded from: classes3.dex */
public class handleNotificationDeletedlambda1 extends logBaiduNotificationClicklambda1 {
    private final initializeGeofenceslambda0 RemoteActionCompatParcelizer;
    private final setSoundIfPresentAndSupportedlambda1 read;
    private final r8lambdaFjiFiJxJXuf3VopUwRuT7TXivug serializer;

    @Override // o.logBaiduNotificationClicklambda1
    public final Iterator<Pair<getCustomLocationProviderNamesandroid_sdk_base_release, isValidNotificationVisibility>> write() {
        return new handleNotificationOpened(this);
    }

    public handleNotificationDeletedlambda1(setSoundIfPresentAndSupportedlambda1 setsoundifpresentandsupportedlambda1, r8lambdaFjiFiJxJXuf3VopUwRuT7TXivug r8lambdafjifijxjxuf3vopuwrut7txivug, initializeGeofenceslambda0 initializegeofenceslambda0) {
        this.read = setsoundifpresentandsupportedlambda1;
        this.serializer = r8lambdafjifijxjxuf3vopuwrut7txivug;
        this.RemoteActionCompatParcelizer = initializegeofenceslambda0;
    }
}
