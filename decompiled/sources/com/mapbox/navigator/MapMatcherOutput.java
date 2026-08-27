package com.mapbox.navigator;

import com.mapbox.common.BaseMapboxInitializer;
import java.io.Serializable;
import java.util.List;
import java.util.Objects;
import o.IconCompatParcelizer;
import o.MediaSessionCompatQueueItem;
import o.SweepGradientShader9KIMszodefault;

/* JADX INFO: loaded from: classes4.dex */
public class MapMatcherOutput implements Serializable {
    private final boolean isTeleport;
    private final List<MapMatch> matches;
    private final int totalCandidatesCount;

    public boolean getIsTeleport() {
        return this.isTeleport;
    }

    public List<MapMatch> getMatches() {
        return this.matches;
    }

    public int getTotalCandidatesCount() {
        return this.totalCandidatesCount;
    }

    static {
        BaseMapboxInitializer.init(MapboxNavigationNativeInitializerImpl.class);
    }

    public int hashCode() {
        return Objects.hash(this.matches, Boolean.valueOf(this.isTeleport), Integer.valueOf(this.totalCandidatesCount));
    }

    public MapMatcherOutput(List<MapMatch> list, boolean z, int i) {
        this.matches = list;
        this.isTeleport = z;
        this.totalCandidatesCount = i;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("[matches: ");
        IconCompatParcelizer.RemoteActionCompatParcelizer(sb, this.matches, ", isTeleport: ");
        MediaSessionCompatQueueItem.write(sb, this.isTeleport, ", totalCandidatesCount: ");
        return SweepGradientShader9KIMszodefault.serializer(this.totalCandidatesCount, "]", sb);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        MapMatcherOutput mapMatcherOutput = (MapMatcherOutput) obj;
        return Objects.equals(this.matches, mapMatcherOutput.matches) && this.isTeleport == mapMatcherOutput.isTeleport && this.totalCandidatesCount == mapMatcherOutput.totalCandidatesCount;
    }
}
