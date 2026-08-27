package o;

import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import java.util.HashMap;

/* JADX INFO: loaded from: classes2.dex */
public abstract class accessgetFcp {
    public final void serializer(String str, String str2) {
        HashMap map = ((accessgetEndCallcp) this).write;
        if (map != null) {
            map.put(str, str2);
        } else {
            ScreenStartObserver$$ExternalSyntheticLambda0.write("Property \"autoMetadata\" has not been set");
        }
    }
}
