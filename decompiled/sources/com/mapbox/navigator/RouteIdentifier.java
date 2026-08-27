package com.mapbox.navigator;

import com.mapbox.common.BaseMapboxInitializer;
import java.io.Serializable;
import java.util.Objects;
import o.IconCompatParcelizer;
import o.SweepGradientShader9KIMszodefault;

/* JADX INFO: loaded from: classes4.dex */
public class RouteIdentifier implements Serializable {
    private final int index;
    private final String uuid;

    public static native RouteIdentifier fromString(String str);

    private static native void nativeSelfRegister();

    public int getIndex() {
        return this.index;
    }

    public String getUuid() {
        return this.uuid;
    }

    public native String toRouteIdString();

    static {
        BaseMapboxInitializer.init(MapboxNavigationNativeInitializerImpl.class);
        try {
            nativeSelfRegister();
        } catch (UnsatisfiedLinkError unused) {
        }
    }

    public int hashCode() {
        return Objects.hash(this.uuid, Integer.valueOf(this.index));
    }

    public RouteIdentifier(String str, int i) {
        this.uuid = str;
        this.index = i;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("[uuid: ");
        IconCompatParcelizer.read(sb, this.uuid, ", index: ");
        return SweepGradientShader9KIMszodefault.serializer(this.index, "]", sb);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        RouteIdentifier routeIdentifier = (RouteIdentifier) obj;
        return Objects.equals(this.uuid, routeIdentifier.uuid) && this.index == routeIdentifier.index;
    }
}
