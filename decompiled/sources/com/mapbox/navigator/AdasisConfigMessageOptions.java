package com.mapbox.navigator;

import com.mapbox.common.BaseMapboxInitializer;
import java.io.Serializable;
import java.util.Objects;
import o.IconCompatParcelizer;
import o.MediaSessionCompatQueueItem;
import o.SweepGradientShader9KIMszodefault;

/* JADX INFO: loaded from: classes5.dex */
public class AdasisConfigMessageOptions implements Serializable {
    private final int branchRadiusMeters;
    private final boolean enabled;
    private final int radiusMeters;

    public int getBranchRadiusMeters() {
        return this.branchRadiusMeters;
    }

    public boolean getEnabled() {
        return this.enabled;
    }

    public int getRadiusMeters() {
        return this.radiusMeters;
    }

    static {
        BaseMapboxInitializer.init(MapboxNavigationNativeInitializerImpl.class);
    }

    public AdasisConfigMessageOptions() {
        this.enabled = true;
        this.radiusMeters = 2000;
        this.branchRadiusMeters = 50;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("[enabled: ");
        MediaSessionCompatQueueItem.write(sb, this.enabled, ", radiusMeters: ");
        IconCompatParcelizer.write(this.radiusMeters, ", branchRadiusMeters: ", sb);
        return SweepGradientShader9KIMszodefault.serializer(this.branchRadiusMeters, "]", sb);
    }

    public int hashCode() {
        return Objects.hash(Boolean.valueOf(this.enabled), Integer.valueOf(this.radiusMeters), Integer.valueOf(this.branchRadiusMeters));
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        AdasisConfigMessageOptions adasisConfigMessageOptions = (AdasisConfigMessageOptions) obj;
        return this.enabled == adasisConfigMessageOptions.enabled && this.radiusMeters == adasisConfigMessageOptions.radiusMeters && this.branchRadiusMeters == adasisConfigMessageOptions.branchRadiusMeters;
    }

    public AdasisConfigMessageOptions(boolean z, int i, int i2) {
        this.enabled = z;
        this.radiusMeters = i;
        this.branchRadiusMeters = i2;
    }
}
