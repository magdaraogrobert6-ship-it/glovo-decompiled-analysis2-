package com.mapbox.search.common;

import bo.app.ff$$ExternalSyntheticOutline0;
import o.getCieXyz;
import o.removeNodeAtDepth;

/* JADX INFO: loaded from: classes3.dex */
public final class SearchCancellationException extends RuntimeException {
    public final String message;

    @Override // java.lang.Throwable
    public final String getMessage() {
        return this.message;
    }

    public final int hashCode() {
        return this.message.hashCode();
    }

    public SearchCancellationException(String str) {
        super(str);
        this.message = str;
    }

    @Override // java.lang.Throwable
    public final String toString() {
        return ff$$ExternalSyntheticOutline0.m(new StringBuilder("SearchCancellationException(message='"), this.message, "')");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!SearchCancellationException.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        obj.getClass();
        return ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.message, ((SearchCancellationException) obj).message}, getCieXyz.write())).booleanValue();
    }
}
