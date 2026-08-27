package o;

import com.sentiance.sdk.services.ServiceType;
import java.util.ArrayList;
import java.util.EnumMap;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public class migrateBannerImpressionMapToJsonlambda20 {
    private final EnumMap<ServiceType, List<String>> read = new EnumMap<>(ServiceType.class);

    public final void read() {
        synchronized (this) {
            Iterator<List<String>> it = this.read.values().iterator();
            while (it.hasNext()) {
                it.next().clear();
            }
        }
    }

    public final boolean serializer(ServiceType serviceType, String str) {
        synchronized (this) {
            List<String> list = this.read.get(serviceType);
            boolean z = false;
            if (list == null) {
                return false;
            }
            if (!list.isEmpty() && list.contains(str)) {
                z = true;
            }
            return z;
        }
    }

    public final EnumMap write() {
        EnumMap enumMap;
        synchronized (this) {
            enumMap = new EnumMap(ServiceType.class);
            for (ServiceType serviceType : ServiceType.values()) {
                List<String> list = this.read.get(serviceType);
                if (list != null && !list.isEmpty()) {
                    enumMap.put(serviceType, new ArrayList(list));
                }
            }
        }
        return enumMap;
    }

    public migrateBannerImpressionMapToJsonlambda20() {
        for (ServiceType serviceType : ServiceType.values()) {
            this.read.put(serviceType, new ArrayList());
        }
    }

    public final boolean serializer(ServiceType serviceType) {
        synchronized (this) {
            List<String> list = this.read.get(serviceType);
            if (list == null) {
                return false;
            }
            return !list.isEmpty();
        }
    }

    public final void RemoteActionCompatParcelizer(ServiceType serviceType, String str) {
        synchronized (this) {
            List<String> list = this.read.get(serviceType);
            if (list != null) {
                list.add(str);
            }
        }
    }

    public final boolean write(ServiceType serviceType, String str) {
        synchronized (this) {
            List<String> list = this.read.get(serviceType);
            if (list == null) {
                return false;
            }
            return list.remove(str);
        }
    }
}
