package com.deliveryhero.selfServiceChat.domain.exceptions;

import bo.app.af$$ExternalSyntheticOutline0;
import bo.app.ff$$ExternalSyntheticOutline0;
import o.getCieXyz;
import o.isCurrentlyDisplayingInAppMessage;
import o.removeNodeAtDepth;

/* JADX INFO: loaded from: classes2.dex */
public final class EndpointException extends Exception {
    public final String RemoteActionCompatParcelizer;
    public final int read;
    public final String write;

    @Override // java.lang.Throwable
    public final String getMessage() {
        return this.write;
    }

    public final int hashCode() {
        return this.write.hashCode() + af$$ExternalSyntheticOutline0.m(this.read, this.RemoteActionCompatParcelizer.hashCode() * 31, 31);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof EndpointException)) {
            return false;
        }
        EndpointException endpointException = (EndpointException) obj;
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.RemoteActionCompatParcelizer, endpointException.RemoteActionCompatParcelizer}, getCieXyz.write())).booleanValue() || this.read != endpointException.read) {
            return false;
        }
        return ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.write, endpointException.write}, getCieXyz.write())).booleanValue();
    }

    @Override // java.lang.Throwable
    public final String toString() {
        StringBuilder sb = new StringBuilder("EndpointException(name=");
        sb.append(this.RemoteActionCompatParcelizer);
        sb.append(", code=");
        sb.append(this.read);
        sb.append(", message=");
        return ff$$ExternalSyntheticOutline0.m(sb, this.write, ')');
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EndpointException(String str, int i, String str2) {
        super(isCurrentlyDisplayingInAppMessage.MediaDescriptionCompat(str + " could not be fetched due to " + i + " - " + str2 + ' '));
        str2.getClass();
        this.RemoteActionCompatParcelizer = str;
        this.read = i;
        this.write = str2;
    }
}
