package com.mapbox.navigator;

import bo.app.m1$$ExternalSyntheticOutline0;
import com.mapbox.bindgen.PartialEq;
import com.mapbox.common.BaseMapboxInitializer;
import java.io.Serializable;
import java.util.List;
import java.util.Objects;
import o.IconCompatParcelizer;
import o.MediaSessionCompatQueueItem;
import o.SweepGradientShader9KIMszodefault;
import o.getBitmapFromCache;

/* JADX INFO: loaded from: classes5.dex */
public class ConnectedLaneSequence implements Serializable {
    private final Integer branchingFromSequenceIndex;
    private final List<Integer> incomingMergingSequenceIndexes;
    private final List<Integer> incomingSequenceIndexes;
    private final boolean isDivergent;
    private final boolean isOnRouteLaneGuidanceFinish;
    private final boolean isOnRouteLaneGuidanceStart;
    private final List<Long> laneIds;
    private final double length;
    private final Integer mergingIntoSequenceIndex;
    private final List<Integer> outboundBranchingSequenceIndexes;
    private final List<Integer> outboundSequenceIndexes;
    private final Integer requiredLaneChangeCountNotToDeviate;
    private final long routeLaneGroupIndex;

    public Integer getBranchingFromSequenceIndex() {
        return this.branchingFromSequenceIndex;
    }

    public List<Integer> getIncomingMergingSequenceIndexes() {
        return this.incomingMergingSequenceIndexes;
    }

    public List<Integer> getIncomingSequenceIndexes() {
        return this.incomingSequenceIndexes;
    }

    public boolean getIsDivergent() {
        return this.isDivergent;
    }

    public boolean getIsOnRouteLaneGuidanceFinish() {
        return this.isOnRouteLaneGuidanceFinish;
    }

    public boolean getIsOnRouteLaneGuidanceStart() {
        return this.isOnRouteLaneGuidanceStart;
    }

    public List<Long> getLaneIds() {
        return this.laneIds;
    }

    public double getLength() {
        return this.length;
    }

    public Integer getMergingIntoSequenceIndex() {
        return this.mergingIntoSequenceIndex;
    }

    public List<Integer> getOutboundBranchingSequenceIndexes() {
        return this.outboundBranchingSequenceIndexes;
    }

    public List<Integer> getOutboundSequenceIndexes() {
        return this.outboundSequenceIndexes;
    }

    public Integer getRequiredLaneChangeCountNotToDeviate() {
        return this.requiredLaneChangeCountNotToDeviate;
    }

    public long getRouteLaneGroupIndex() {
        return this.routeLaneGroupIndex;
    }

    static {
        BaseMapboxInitializer.init(MapboxNavigationNativeInitializerImpl.class);
    }

    public int hashCode() {
        List<Long> list = this.laneIds;
        boolean z = this.isDivergent;
        double d = this.length;
        boolean z2 = this.isOnRouteLaneGuidanceStart;
        boolean z3 = this.isOnRouteLaneGuidanceFinish;
        return Objects.hash(list, Boolean.valueOf(z), Double.valueOf(d), Boolean.valueOf(z2), Boolean.valueOf(z3), this.requiredLaneChangeCountNotToDeviate, this.incomingSequenceIndexes, this.outboundSequenceIndexes, this.incomingMergingSequenceIndexes, this.mergingIntoSequenceIndex, this.outboundBranchingSequenceIndexes, this.branchingFromSequenceIndex, Long.valueOf(this.routeLaneGroupIndex));
    }

    public ConnectedLaneSequence(List<Long> list, boolean z, double d, boolean z2, boolean z3, Integer num, List<Integer> list2, List<Integer> list3, List<Integer> list4, Integer num2, List<Integer> list5, Integer num3, long j) {
        this.laneIds = list;
        this.isDivergent = z;
        this.length = d;
        this.isOnRouteLaneGuidanceStart = z2;
        this.isOnRouteLaneGuidanceFinish = z3;
        this.requiredLaneChangeCountNotToDeviate = num;
        this.incomingSequenceIndexes = list2;
        this.outboundSequenceIndexes = list3;
        this.incomingMergingSequenceIndexes = list4;
        this.mergingIntoSequenceIndex = num2;
        this.outboundBranchingSequenceIndexes = list5;
        this.branchingFromSequenceIndex = num3;
        this.routeLaneGroupIndex = j;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("[laneIds: ");
        IconCompatParcelizer.RemoteActionCompatParcelizer(sb, this.laneIds, ", isDivergent: ");
        MediaSessionCompatQueueItem.write(sb, this.isDivergent, ", length: ");
        m1$$ExternalSyntheticOutline0.m(this.length, ", isOnRouteLaneGuidanceStart: ", sb);
        MediaSessionCompatQueueItem.write(sb, this.isOnRouteLaneGuidanceStart, ", isOnRouteLaneGuidanceFinish: ");
        MediaSessionCompatQueueItem.write(sb, this.isOnRouteLaneGuidanceFinish, ", requiredLaneChangeCountNotToDeviate: ");
        SweepGradientShader9KIMszodefault.read(this.requiredLaneChangeCountNotToDeviate, ", incomingSequenceIndexes: ", sb);
        IconCompatParcelizer.RemoteActionCompatParcelizer(sb, this.incomingSequenceIndexes, ", outboundSequenceIndexes: ");
        IconCompatParcelizer.RemoteActionCompatParcelizer(sb, this.outboundSequenceIndexes, ", incomingMergingSequenceIndexes: ");
        IconCompatParcelizer.RemoteActionCompatParcelizer(sb, this.incomingMergingSequenceIndexes, ", mergingIntoSequenceIndex: ");
        SweepGradientShader9KIMszodefault.read(this.mergingIntoSequenceIndex, ", outboundBranchingSequenceIndexes: ", sb);
        IconCompatParcelizer.RemoteActionCompatParcelizer(sb, this.outboundBranchingSequenceIndexes, ", branchingFromSequenceIndex: ");
        SweepGradientShader9KIMszodefault.read(this.branchingFromSequenceIndex, ", routeLaneGroupIndex: ", sb);
        return getBitmapFromCache.RemoteActionCompatParcelizer(this.routeLaneGroupIndex, "]", sb);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ConnectedLaneSequence connectedLaneSequence = (ConnectedLaneSequence) obj;
        return Objects.equals(this.laneIds, connectedLaneSequence.laneIds) && this.isDivergent == connectedLaneSequence.isDivergent && PartialEq.compare(this.length, connectedLaneSequence.length) && this.isOnRouteLaneGuidanceStart == connectedLaneSequence.isOnRouteLaneGuidanceStart && this.isOnRouteLaneGuidanceFinish == connectedLaneSequence.isOnRouteLaneGuidanceFinish && Objects.equals(this.requiredLaneChangeCountNotToDeviate, connectedLaneSequence.requiredLaneChangeCountNotToDeviate) && Objects.equals(this.incomingSequenceIndexes, connectedLaneSequence.incomingSequenceIndexes) && Objects.equals(this.outboundSequenceIndexes, connectedLaneSequence.outboundSequenceIndexes) && Objects.equals(this.incomingMergingSequenceIndexes, connectedLaneSequence.incomingMergingSequenceIndexes) && Objects.equals(this.mergingIntoSequenceIndex, connectedLaneSequence.mergingIntoSequenceIndex) && Objects.equals(this.outboundBranchingSequenceIndexes, connectedLaneSequence.outboundBranchingSequenceIndexes) && Objects.equals(this.branchingFromSequenceIndex, connectedLaneSequence.branchingFromSequenceIndex) && this.routeLaneGroupIndex == connectedLaneSequence.routeLaneGroupIndex;
    }
}
