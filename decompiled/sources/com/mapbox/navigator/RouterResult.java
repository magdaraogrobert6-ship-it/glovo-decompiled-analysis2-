package com.mapbox.navigator;

import bo.app.ff$$ExternalSyntheticOutline0;
import com.mapbox.common.BaseMapboxInitializer;
import java.io.Serializable;
import java.util.Objects;
import o.IconCompatParcelizer;

/* JADX INFO: loaded from: classes5.dex */
public class RouterResult implements Serializable {
    private final String json;
    private final boolean success;

    public String getJson() {
        return this.json;
    }

    public boolean getSuccess() {
        return this.success;
    }

    static {
        BaseMapboxInitializer.init(MapboxNavigationNativeInitializerImpl.class);
    }

    public int hashCode() {
        return Objects.hash(this.json, Boolean.valueOf(this.success));
    }

    public RouterResult(String str, boolean z) {
        this.json = str;
        this.success = z;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("[json: ");
        IconCompatParcelizer.read(sb, this.json, ", success: ");
        return ff$$ExternalSyntheticOutline0.m(this.success, sb, "]");
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        RouterResult routerResult = (RouterResult) obj;
        return Objects.equals(this.json, routerResult.json) && this.success == routerResult.success;
    }
}
