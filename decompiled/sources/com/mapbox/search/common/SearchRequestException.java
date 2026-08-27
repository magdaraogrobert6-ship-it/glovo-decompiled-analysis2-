package com.mapbox.search.common;

import bo.app.af$$ExternalSyntheticOutline0;
import o.getCieXyz;
import o.removeNodeAtDepth;

/* JADX INFO: loaded from: classes3.dex */
public final class SearchRequestException extends RuntimeException {
    public final int code;
    public final String message;

    public SearchRequestException(String str, int i) {
        super(str, null);
        this.message = str;
        this.code = i;
    }

    @Override // java.lang.Throwable
    public final Throwable getCause() {
        return null;
    }

    @Override // java.lang.Throwable
    public final String getMessage() {
        return this.message;
    }

    public final int hashCode() {
        return ((this.message.hashCode() * 31) + this.code) * 31;
    }

    @Override // java.lang.Throwable
    public final String toString() {
        StringBuilder sb = new StringBuilder("SearchRequestException(message='");
        sb.append(this.message);
        sb.append("', code=");
        return af$$ExternalSyntheticOutline0.m(this.code, ", cause=null)", sb);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!SearchRequestException.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        obj.getClass();
        SearchRequestException searchRequestException = (SearchRequestException) obj;
        return ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.message, searchRequestException.message}, getCieXyz.write())).booleanValue() && this.code == searchRequestException.code;
    }
}
