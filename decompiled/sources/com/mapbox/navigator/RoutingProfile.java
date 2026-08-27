package com.mapbox.navigator;

import com.mapbox.bindgen.RecordUtils;
import com.mapbox.common.BaseMapboxInitializer;
import java.io.Serializable;
import java.util.Objects;
import o.SweepGradientShader9KIMszodefault;

/* JADX INFO: loaded from: classes3.dex */
public class RoutingProfile implements Serializable {
    private final String account;
    private final RoutingMode mode;

    public String getAccount() {
        return this.account;
    }

    public RoutingMode getMode() {
        return this.mode;
    }

    static {
        BaseMapboxInitializer.init(MapboxNavigationNativeInitializerImpl.class);
    }

    public int hashCode() {
        return Objects.hash(this.mode, this.account);
    }

    public RoutingProfile(RoutingMode routingMode, String str) {
        this.mode = routingMode;
        this.account = str;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("[mode: ");
        sb.append(RecordUtils.fieldToString(this.mode));
        sb.append(", account: ");
        return SweepGradientShader9KIMszodefault.read(sb, this.account, "]");
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        RoutingProfile routingProfile = (RoutingProfile) obj;
        return Objects.equals(this.mode, routingProfile.mode) && Objects.equals(this.account, routingProfile.account);
    }
}
