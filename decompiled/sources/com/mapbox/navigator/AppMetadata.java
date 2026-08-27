package com.mapbox.navigator;

import com.mapbox.common.BaseMapboxInitializer;
import java.io.Serializable;
import java.util.Objects;
import o.IconCompatParcelizer;
import o.SweepGradientShader9KIMszodefault;

/* JADX INFO: loaded from: classes5.dex */
public class AppMetadata implements Serializable {
    private final String name;
    private final String sessionId;
    private final String userId;
    private final String version;

    public String getName() {
        return this.name;
    }

    public String getSessionId() {
        return this.sessionId;
    }

    public String getUserId() {
        return this.userId;
    }

    public String getVersion() {
        return this.version;
    }

    static {
        BaseMapboxInitializer.init(MapboxNavigationNativeInitializerImpl.class);
    }

    public int hashCode() {
        return Objects.hash(this.name, this.version, this.userId, this.sessionId);
    }

    public AppMetadata(String str, String str2, String str3, String str4) {
        this.name = str;
        this.version = str2;
        this.userId = str3;
        this.sessionId = str4;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("[name: ");
        IconCompatParcelizer.read(sb, this.name, ", version: ");
        IconCompatParcelizer.read(sb, this.version, ", userId: ");
        IconCompatParcelizer.read(sb, this.userId, ", sessionId: ");
        return SweepGradientShader9KIMszodefault.read(sb, this.sessionId, "]");
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        AppMetadata appMetadata = (AppMetadata) obj;
        return Objects.equals(this.name, appMetadata.name) && Objects.equals(this.version, appMetadata.version) && Objects.equals(this.userId, appMetadata.userId) && Objects.equals(this.sessionId, appMetadata.sessionId);
    }
}
