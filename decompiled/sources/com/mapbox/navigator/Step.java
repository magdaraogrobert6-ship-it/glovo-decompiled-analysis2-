package com.mapbox.navigator;

import bo.app.m1$$ExternalSyntheticOutline0;
import com.mapbox.bindgen.PartialEq;
import com.mapbox.common.BaseMapboxInitializer;
import java.io.Serializable;
import java.util.Objects;
import o.IconCompatParcelizer;
import o.SweepGradientShader9KIMszodefault;

/* JADX INFO: loaded from: classes5.dex */
public class Step implements Serializable {
    private final double distance;
    private final double distanceRemaining;
    private final double duration;
    private final double durationRemaining;
    private final String previousInstruction;
    private final String previousModifier;
    private final String previousName;
    private final String previousType;
    private final String upcomingInstruction;
    private final String upcomingModifier;
    private final String upcomingName;
    private final String upcomingType;

    public double getDistance() {
        return this.distance;
    }

    public double getDistanceRemaining() {
        return this.distanceRemaining;
    }

    public double getDuration() {
        return this.duration;
    }

    public double getDurationRemaining() {
        return this.durationRemaining;
    }

    public String getPreviousInstruction() {
        return this.previousInstruction;
    }

    public String getPreviousModifier() {
        return this.previousModifier;
    }

    public String getPreviousName() {
        return this.previousName;
    }

    public String getPreviousType() {
        return this.previousType;
    }

    public String getUpcomingInstruction() {
        return this.upcomingInstruction;
    }

    public String getUpcomingModifier() {
        return this.upcomingModifier;
    }

    public String getUpcomingName() {
        return this.upcomingName;
    }

    public String getUpcomingType() {
        return this.upcomingType;
    }

    static {
        BaseMapboxInitializer.init(MapboxNavigationNativeInitializerImpl.class);
    }

    public Step(double d, double d2, double d3, double d4, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8) {
        this.distance = d;
        this.distanceRemaining = d2;
        this.duration = d3;
        this.durationRemaining = d4;
        this.upcomingName = str;
        this.upcomingType = str2;
        this.upcomingModifier = str3;
        this.upcomingInstruction = str4;
        this.previousName = str5;
        this.previousType = str6;
        this.previousModifier = str7;
        this.previousInstruction = str8;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("[distance: ");
        m1$$ExternalSyntheticOutline0.m(this.distance, ", distanceRemaining: ", sb);
        m1$$ExternalSyntheticOutline0.m(this.distanceRemaining, ", duration: ", sb);
        m1$$ExternalSyntheticOutline0.m(this.duration, ", durationRemaining: ", sb);
        m1$$ExternalSyntheticOutline0.m(this.durationRemaining, ", upcomingName: ", sb);
        IconCompatParcelizer.read(sb, this.upcomingName, ", upcomingType: ");
        IconCompatParcelizer.read(sb, this.upcomingType, ", upcomingModifier: ");
        IconCompatParcelizer.read(sb, this.upcomingModifier, ", upcomingInstruction: ");
        IconCompatParcelizer.read(sb, this.upcomingInstruction, ", previousName: ");
        IconCompatParcelizer.read(sb, this.previousName, ", previousType: ");
        IconCompatParcelizer.read(sb, this.previousType, ", previousModifier: ");
        IconCompatParcelizer.read(sb, this.previousModifier, ", previousInstruction: ");
        return SweepGradientShader9KIMszodefault.read(sb, this.previousInstruction, "]");
    }

    public int hashCode() {
        double d = this.distance;
        double d2 = this.distanceRemaining;
        double d3 = this.duration;
        double d4 = this.durationRemaining;
        return Objects.hash(Double.valueOf(d), Double.valueOf(d2), Double.valueOf(d3), Double.valueOf(d4), this.upcomingName, this.upcomingType, this.upcomingModifier, this.upcomingInstruction, this.previousName, this.previousType, this.previousModifier, this.previousInstruction);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Step step = (Step) obj;
        return PartialEq.compare(this.distance, step.distance) && PartialEq.compare(this.distanceRemaining, step.distanceRemaining) && PartialEq.compare(this.duration, step.duration) && PartialEq.compare(this.durationRemaining, step.durationRemaining) && Objects.equals(this.upcomingName, step.upcomingName) && Objects.equals(this.upcomingType, step.upcomingType) && Objects.equals(this.upcomingModifier, step.upcomingModifier) && Objects.equals(this.upcomingInstruction, step.upcomingInstruction) && Objects.equals(this.previousName, step.previousName) && Objects.equals(this.previousType, step.previousType) && Objects.equals(this.previousModifier, step.previousModifier) && Objects.equals(this.previousInstruction, step.previousInstruction);
    }

    public Step(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8) {
        this.upcomingName = str;
        this.upcomingType = str2;
        this.upcomingModifier = str3;
        this.upcomingInstruction = str4;
        this.previousName = str5;
        this.previousType = str6;
        this.previousModifier = str7;
        this.previousInstruction = str8;
        this.distance = 0.0d;
        this.distanceRemaining = 0.0d;
        this.duration = 0.0d;
        this.durationRemaining = 0.0d;
    }
}
