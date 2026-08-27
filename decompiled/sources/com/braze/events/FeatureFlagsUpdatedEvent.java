package com.braze.events;

import bo.app.d$$ExternalSyntheticOutline0;
import com.braze.models.FeatureFlag;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import o.getCieXyz;
import o.instance_delegatelambda0;
import o.removeNodeAtDepth;

/* JADX INFO: loaded from: classes.dex */
public final class FeatureFlagsUpdatedEvent {
    public static final Companion Companion = new Companion(null);
    private final List<FeatureFlag> featureFlags;

    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static /* synthetic */ void getEmptyUpdate$annotations() {
        }

        public final FeatureFlagsUpdatedEvent getEmptyUpdate() {
            return new FeatureFlagsUpdatedEvent(instance_delegatelambda0.write);
        }

        private Companion() {
        }
    }

    public final List<FeatureFlag> getFeatureFlags() {
        return this.featureFlags;
    }

    public static final FeatureFlagsUpdatedEvent getEmptyUpdate() {
        return Companion.getEmptyUpdate();
    }

    public final int getFlagCount() {
        return this.featureFlags.size();
    }

    public final boolean isEmpty() {
        return this.featureFlags.isEmpty();
    }

    public String toString() {
        return d$$ExternalSyntheticOutline0.m(this.featureFlags.size(), "FeatureFlagsUpdatedEvent{flag count=", "}");
    }

    public FeatureFlagsUpdatedEvent(List<FeatureFlag> list) {
        list.getClass();
        this.featureFlags = list;
    }

    public final FeatureFlag getFeatureFlag(String str) {
        Object next;
        str.getClass();
        Iterator<T> it = this.featureFlags.iterator();
        while (it.hasNext()) {
            next = it.next();
            Object[] objArr = {((FeatureFlag) next).getId(), str};
            if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), objArr, getCieXyz.write())).booleanValue()) {
                return (FeatureFlag) next;
            }
        }
        next = null;
        return (FeatureFlag) next;
    }
}
