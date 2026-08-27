package com.deliveryhero.fwf_evaluator.model;

import bo.app.d$$ExternalSyntheticOutline0;
import o.getCieXyz;
import o.removeNodeAtDepth;

/* JADX INFO: loaded from: classes2.dex */
public final class Rollout {
    private final Boolean isParticipating;
    private final Object variation;
    private final Object variationName;
    private final long weight;

    public final Object component1() {
        return this.variation;
    }

    public final Object component2() {
        return this.variationName;
    }

    public final long component3() {
        return this.weight;
    }

    public final Boolean component4() {
        return this.isParticipating;
    }

    public final Object getVariation() {
        return this.variation;
    }

    public final Object getVariationName() {
        return this.variationName;
    }

    public final long getWeight() {
        return this.weight;
    }

    public final Boolean isParticipating() {
        return this.isParticipating;
    }

    public final Rollout copy(Object obj, Object obj2, long j, Boolean bool) {
        return new Rollout(obj, obj2, j, bool);
    }

    public String toString() {
        return "Rollout(variation=" + this.variation + ", variationName=" + this.variationName + ", weight=" + this.weight + ", isParticipating=" + this.isParticipating + ")";
    }

    public Rollout(Object obj, Object obj2, long j, Boolean bool) {
        this.variation = obj;
        this.variationName = obj2;
        this.weight = j;
        this.isParticipating = bool;
    }

    public static /* synthetic */ Rollout copy$default(Rollout rollout, Object obj, Object obj2, long j, Boolean bool, int i, Object obj3) {
        if ((i & 1) != 0) {
            obj = rollout.variation;
        }
        if ((i & 2) != 0) {
            obj2 = rollout.variationName;
        }
        Object obj4 = obj2;
        if ((i & 4) != 0) {
            j = rollout.weight;
        }
        long j2 = j;
        if ((i & 8) != 0) {
            bool = rollout.isParticipating;
        }
        return rollout.copy(obj, obj4, j2, bool);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Rollout)) {
            return false;
        }
        Rollout rollout = (Rollout) obj;
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.variation, rollout.variation}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.variationName, rollout.variationName}, getCieXyz.write())).booleanValue() || this.weight != rollout.weight) {
            return false;
        }
        return ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.isParticipating, rollout.isParticipating}, getCieXyz.write())).booleanValue();
    }

    public int hashCode() {
        Object obj = this.variation;
        int iHashCode = obj == null ? 0 : obj.hashCode();
        Object obj2 = this.variationName;
        int iM = d$$ExternalSyntheticOutline0.m(((iHashCode * 31) + (obj2 == null ? 0 : obj2.hashCode())) * 31, 31, this.weight);
        Boolean bool = this.isParticipating;
        return iM + (bool != null ? bool.hashCode() : 0);
    }
}
