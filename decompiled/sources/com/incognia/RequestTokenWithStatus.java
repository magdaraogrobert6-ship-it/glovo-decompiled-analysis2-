package com.incognia;

import o.getCieXyz;
import o.removeNodeAtDepth;

/* JADX INFO: loaded from: classes2.dex */
public final class RequestTokenWithStatus {
    private final RequestTokenStatus status;
    private final String token;

    public final String component1() {
        return this.token;
    }

    public final RequestTokenStatus component2() {
        return this.status;
    }

    public final RequestTokenStatus getStatus() {
        return this.status;
    }

    public final String getToken() {
        return this.token;
    }

    public final RequestTokenWithStatus copy(String str, RequestTokenStatus requestTokenStatus) {
        return new RequestTokenWithStatus(str, requestTokenStatus);
    }

    public int hashCode() {
        return this.status.hashCode() + (this.token.hashCode() * 31);
    }

    public RequestTokenWithStatus(String str, RequestTokenStatus requestTokenStatus) {
        this.token = str;
        this.status = requestTokenStatus;
    }

    public static /* synthetic */ RequestTokenWithStatus copy$default(RequestTokenWithStatus requestTokenWithStatus, String str, RequestTokenStatus requestTokenStatus, int i, Object obj) {
        if ((i & 1) != 0) {
            str = requestTokenWithStatus.token;
        }
        if ((i & 2) != 0) {
            requestTokenStatus = requestTokenWithStatus.status;
        }
        return requestTokenWithStatus.copy(str, requestTokenStatus);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RequestTokenWithStatus)) {
            return false;
        }
        RequestTokenWithStatus requestTokenWithStatus = (RequestTokenWithStatus) obj;
        return ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.token, requestTokenWithStatus.token}, getCieXyz.write())).booleanValue() && this.status == requestTokenWithStatus.status;
    }

    public String toString() {
        return "RequestTokenWithStatus(token=" + this.token + ", status=" + this.status + ')';
    }
}
