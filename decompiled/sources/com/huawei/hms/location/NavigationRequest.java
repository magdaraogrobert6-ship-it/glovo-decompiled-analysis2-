package com.huawei.hms.location;

import android.os.Parcel;
import bo.app.af$$ExternalSyntheticOutline0;
import com.huawei.hms.core.aidl.IMessageEntity;
import com.huawei.hms.core.aidl.annotation.Packed;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public class NavigationRequest implements IMessageEntity {
    public static final int IS_SUPPORT_EX = 2;
    public static final int OVERPASS = 1;

    @Packed
    private Map<String, String> extras;

    @Packed
    private int type;

    private Map<String, String> getExtras() {
        return this.extras;
    }

    public int getType() {
        return this.type;
    }

    public void setExtras(Map<String, String> map) {
        this.extras = map;
    }

    public void setType(int i) {
        this.type = i;
    }

    public NavigationRequest(Parcel parcel) {
        this.type = parcel.readInt();
        HashMap map = new HashMap();
        this.extras = map;
        parcel.readMap(map, NavigationRequest.class.getClassLoader());
    }

    public String toString() {
        return af$$ExternalSyntheticOutline0.m(new StringBuilder("NavigationRequest{type = "), this.type, '}');
    }

    public NavigationRequest(int i) {
        this.type = i;
    }
}
