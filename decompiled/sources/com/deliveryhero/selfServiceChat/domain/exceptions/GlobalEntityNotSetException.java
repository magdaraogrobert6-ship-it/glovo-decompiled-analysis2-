package com.deliveryhero.selfServiceChat.domain.exceptions;

import bo.app.ff$$ExternalSyntheticOutline0;
import o.getCieXyz;
import o.isCurrentlyDisplayingInAppMessage;
import o.removeNodeAtDepth;

/* JADX INFO: loaded from: classes2.dex */
public final class GlobalEntityNotSetException extends Exception {
    public final String read;

    public final int hashCode() {
        return this.read.hashCode();
    }

    public GlobalEntityNotSetException(String str) {
        super(isCurrentlyDisplayingInAppMessage.MediaDescriptionCompat("Global Entity not set. " + str + "\n           |cannot be fetched without setting the global entity ID"));
        this.read = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GlobalEntityNotSetException)) {
            return false;
        }
        return ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.read, ((GlobalEntityNotSetException) obj).read}, getCieXyz.write())).booleanValue();
    }

    @Override // java.lang.Throwable
    public final String toString() {
        return ff$$ExternalSyntheticOutline0.m(new StringBuilder("GlobalEntityNotSetException(source="), this.read, ')');
    }
}
