package com.braze.events;

import bo.app.ff$$ExternalSyntheticOutline0;
import o.getCieXyz;
import o.removeNodeAtDepth;

/* JADX INFO: loaded from: classes.dex */
public final class NoMatchingTriggerEvent {
    private final String sourceEventType;

    public final String component1() {
        return this.sourceEventType;
    }

    public final String getSourceEventType() {
        return this.sourceEventType;
    }

    public int hashCode() {
        return this.sourceEventType.hashCode();
    }

    public NoMatchingTriggerEvent(String str) {
        str.getClass();
        this.sourceEventType = str;
    }

    public static /* synthetic */ NoMatchingTriggerEvent copy$default(NoMatchingTriggerEvent noMatchingTriggerEvent, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = noMatchingTriggerEvent.sourceEventType;
        }
        return noMatchingTriggerEvent.copy(str);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof NoMatchingTriggerEvent)) {
            return false;
        }
        return ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.sourceEventType, ((NoMatchingTriggerEvent) obj).sourceEventType}, getCieXyz.write())).booleanValue();
    }

    public final NoMatchingTriggerEvent copy(String str) {
        str.getClass();
        return new NoMatchingTriggerEvent(str);
    }

    public String toString() {
        return ff$$ExternalSyntheticOutline0.m("NoMatchingTriggerEvent(sourceEventType=", this.sourceEventType, ")");
    }
}
