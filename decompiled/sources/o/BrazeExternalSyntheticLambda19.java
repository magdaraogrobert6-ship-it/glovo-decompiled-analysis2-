package o;

import java.util.Collections;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes4.dex */
public abstract class BrazeExternalSyntheticLambda19 {
    public static final Set IconCompatParcelizer;
    public static final Map RemoteActionCompatParcelizer;
    private static int serializer = 1;
    private static int write;

    static {
        Map mapSingletonMap = Collections.singletonMap("grabdriver", "com.grabtaxi.driver2");
        mapSingletonMap.getClass();
        RemoteActionCompatParcelizer = mapSingletonMap;
        IconCompatParcelizer = mapSingletonMap.keySet();
        int i = write + 73;
        serializer = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i2 = i % 2;
    }
}
