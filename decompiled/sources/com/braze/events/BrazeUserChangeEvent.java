package com.braze.events;

import bo.app.ff$$ExternalSyntheticOutline0;
import o.getCieXyz;
import o.removeNodeAtDepth;

/* JADX INFO: loaded from: classes.dex */
public final class BrazeUserChangeEvent {
    private final String currentUserId;

    public final String component1() {
        return this.currentUserId;
    }

    public final String getCurrentUserId() {
        return this.currentUserId;
    }

    public int hashCode() {
        return this.currentUserId.hashCode();
    }

    public BrazeUserChangeEvent(String str) {
        str.getClass();
        this.currentUserId = str;
    }

    public static /* synthetic */ BrazeUserChangeEvent copy$default(BrazeUserChangeEvent brazeUserChangeEvent, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = brazeUserChangeEvent.currentUserId;
        }
        return brazeUserChangeEvent.copy(str);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BrazeUserChangeEvent)) {
            return false;
        }
        return ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.currentUserId, ((BrazeUserChangeEvent) obj).currentUserId}, getCieXyz.write())).booleanValue();
    }

    public final BrazeUserChangeEvent copy(String str) {
        str.getClass();
        return new BrazeUserChangeEvent(str);
    }

    public String toString() {
        return ff$$ExternalSyntheticOutline0.m("BrazeUserChangeEvent(currentUserId=", this.currentUserId, ")");
    }
}
