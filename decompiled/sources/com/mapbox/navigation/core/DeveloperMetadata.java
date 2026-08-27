package com.mapbox.navigation.core;

import bo.app.ff$$ExternalSyntheticOutline0;
import o.getCieXyz;
import o.removeNodeAtDepth;

/* JADX INFO: loaded from: classes2.dex */
public final class DeveloperMetadata {
    public final String copilotSessionId;

    public final int hashCode() {
        return this.copilotSessionId.hashCode();
    }

    public DeveloperMetadata(String str) {
        str.getClass();
        this.copilotSessionId = str;
    }

    public final String toString() {
        return ff$$ExternalSyntheticOutline0.m(new StringBuilder("DeveloperMetadata(copilotSessionId='"), this.copilotSessionId, "')");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!DeveloperMetadata.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        obj.getClass();
        return ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.copilotSessionId, ((DeveloperMetadata) obj).copilotSessionId}, getCieXyz.write())).booleanValue();
    }
}
