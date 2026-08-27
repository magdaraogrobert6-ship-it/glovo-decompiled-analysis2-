package o;

import com.huawei.hms.location.LocationRequest;
import com.huawei.hms.support.api.entity.location.updates.RequestLocationUpdatesRequest;

/* JADX INFO: loaded from: classes2.dex */
public final class getGlobalKeyboardModifiersui {
    public com.huawei.location.callback.d2 IconCompatParcelizer;
    public final RequestLocationUpdatesRequest write;

    public getGlobalKeyboardModifiersui() {
        this(new RequestLocationUpdatesRequest());
    }

    public final int read() {
        LocationRequest locationRequest = this.write.getLocationRequest();
        if (locationRequest == null) {
            return -1;
        }
        return locationRequest.getPriority();
    }

    public final String serializer() {
        LocationRequest locationRequest = this.write.getLocationRequest();
        if (locationRequest == null) {
            return "";
        }
        int priority = locationRequest.getPriority();
        if (priority == 100) {
            return "fused";
        }
        if (priority == 102) {
            return "network";
        }
        if (priority == 200) {
            return "gps";
        }
        if (priority == 300) {
            return "network";
        }
        if (priority == 400) {
            return "fused";
        }
        if (priority != 104) {
            return priority != 105 ? "" : "passive";
        }
        return "network";
    }

    public getGlobalKeyboardModifiersui(RequestLocationUpdatesRequest requestLocationUpdatesRequest) {
        this.write = requestLocationUpdatesRequest;
    }
}
