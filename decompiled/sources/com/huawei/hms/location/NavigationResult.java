package com.huawei.hms.location;

import android.os.Bundle;
import android.os.Parcel;
import com.huawei.hms.common.ApiException;
import com.huawei.hms.support.api.client.Status;
import com.huawei.hms.support.api.entity.location.common.LocationBaseResponse;
import com.huawei.hms.support.api.location.common.exception.LocationStatusCode;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import o.ComposeScrollCaptureCallbackonScrollCaptureImageRequest2;
import o.SweepGradientShader9KIMszodefault;

/* JADX INFO: loaded from: classes4.dex */
public class NavigationResult extends LocationBaseResponse {
    public static final int MAG_POSITION_IS_SUPPORT = 21;
    public static final int MAG_POSITION_NOT_SUPPORT = 22;
    private Map<String, Object> extras;
    private int possibility;
    private int state;

    private Map<String, Object> getExtras() {
        return this.extras;
    }

    private void setExtras(Map<String, Object> map) {
        this.extras = map;
    }

    public final int getPossibility() {
        return this.possibility;
    }

    public final int getState() {
        return this.state;
    }

    public void setState(int i) {
        this.state = i;
    }

    public NavigationResult(Parcel parcel) {
        Set<String> setKeySet;
        Object obj;
        this.state = -1;
        this.possibility = -1;
        this.state = parcel.readInt();
        this.possibility = parcel.readInt();
        this.extras = new HashMap();
        Bundle bundle = parcel.readBundle(getClass().getClassLoader());
        bundle = bundle == null ? new Bundle() : bundle;
        try {
            setKeySet = bundle.keySet();
        } catch (Throwable unused) {
            ComposeScrollCaptureCallbackonScrollCaptureImageRequest2.IconCompatParcelizer("SafeBundle", "keySet exception.");
            setKeySet = null;
        }
        for (String str : setKeySet) {
            try {
                obj = bundle.get(str);
            } catch (Throwable th) {
                SweepGradientShader9KIMszodefault.write("SafeBundle", new StringBuilder("get exception: "), th);
                obj = null;
            }
            if (obj != null) {
                this.extras.put(str, obj);
            }
        }
    }

    public void setPossibility(int i) throws ApiException {
        if (i <= 100 && i >= 0) {
            this.possibility = i;
            return;
        }
        throw new ApiException(new Status(10802, LocationStatusCode.getStatusCodeString(10802)));
    }

    public NavigationResult() {
        this.state = -1;
        this.possibility = -1;
    }
}
