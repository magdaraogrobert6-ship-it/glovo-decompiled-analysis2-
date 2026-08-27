package o;

import com.sentiance.sdk.sensorstream.SensorType;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
final class handleReceivedIntentdefault {
    private final Map<SensorType, Integer> RemoteActionCompatParcelizer;
    private final String write;

    public final String IconCompatParcelizer() {
        return this.write;
    }

    public final Map<SensorType, Integer> RemoteActionCompatParcelizer() {
        return this.RemoteActionCompatParcelizer;
    }

    public final int hashCode() {
        return this.write.hashCode();
    }

    public handleReceivedIntentdefault(String str, HashMap map) {
        this.write = str;
        this.RemoteActionCompatParcelizer = map;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || handleReceivedIntentdefault.class != obj.getClass()) {
            return false;
        }
        return this.write.equals(((handleReceivedIntentdefault) obj).write);
    }
}
