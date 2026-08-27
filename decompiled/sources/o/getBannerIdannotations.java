package o;

import com.sentiance.sdk.sensorstream.SensorType;
import java.util.HashMap;

/* JADX INFO: loaded from: classes3.dex */
public class getBannerIdannotations {
    private final String IconCompatParcelizer;
    private final HashMap serializer = new HashMap();

    public getBannerIdannotations(String str) {
        this.IconCompatParcelizer = str;
    }

    public final void read(SensorType sensorType, int i) {
        this.serializer.put(sensorType, Integer.valueOf(i));
    }
}
