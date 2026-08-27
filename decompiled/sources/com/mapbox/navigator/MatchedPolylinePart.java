package com.mapbox.navigator;

import com.mapbox.common.BaseMapboxInitializer;
import java.io.Serializable;
import java.util.Objects;
import o.IconCompatParcelizer;
import o.SweepGradientShader9KIMszodefault;

/* JADX INFO: loaded from: classes4.dex */
public class MatchedPolylinePart implements Serializable {
    private final int amountOfKeypoints;
    private final int beginIndex;
    private final int endIndex;

    public int getAmountOfKeypoints() {
        return this.amountOfKeypoints;
    }

    public int getBeginIndex() {
        return this.beginIndex;
    }

    public int getEndIndex() {
        return this.endIndex;
    }

    static {
        BaseMapboxInitializer.init(MapboxNavigationNativeInitializerImpl.class);
    }

    public MatchedPolylinePart(int i, int i2, int i3) {
        this.beginIndex = i;
        this.endIndex = i2;
        this.amountOfKeypoints = i3;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("[beginIndex: ");
        IconCompatParcelizer.write(this.beginIndex, ", endIndex: ", sb);
        IconCompatParcelizer.write(this.endIndex, ", amountOfKeypoints: ", sb);
        return SweepGradientShader9KIMszodefault.serializer(this.amountOfKeypoints, "]", sb);
    }

    public int hashCode() {
        return Objects.hash(Integer.valueOf(this.beginIndex), Integer.valueOf(this.endIndex), Integer.valueOf(this.amountOfKeypoints));
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        MatchedPolylinePart matchedPolylinePart = (MatchedPolylinePart) obj;
        return this.beginIndex == matchedPolylinePart.beginIndex && this.endIndex == matchedPolylinePart.endIndex && this.amountOfKeypoints == matchedPolylinePart.amountOfKeypoints;
    }
}
