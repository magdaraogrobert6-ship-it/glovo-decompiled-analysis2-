package com.braze.events;

import bo.app.e4;
import bo.app.l2;
import bo.app.l9;
import bo.app.v9;
import coil3.util.UtilsKt;
import java.util.Map;
import o.getCieXyz;
import o.r8lambdaCQ4V2AQoD74IHhWV724N_B6w0U;
import o.removeNodeAtDepth;

/* JADX INFO: loaded from: classes.dex */
public final class BrazeNetworkFailureEvent {
    private final l9 brazeRequest;
    private final v9 httpConnectorResult;
    private final Long requestInitiationTime;
    private final RequestType requestType;
    private final String requestUrl;
    private final int responseCode;
    private final Map<String, String> responseHeaders;

    public enum RequestType {
        CONTENT_CARDS_SYNC,
        OTHER;

        private static final /* synthetic */ r8lambdaCQ4V2AQoD74IHhWV724N_B6w0U $ENTRIES = UtilsKt.read((Enum[]) values());

        public static r8lambdaCQ4V2AQoD74IHhWV724N_B6w0U getEntries() {
            return $ENTRIES;
        }
    }

    private final l9 component1() {
        return this.brazeRequest;
    }

    private final v9 component2() {
        return this.httpConnectorResult;
    }

    public final Long getRequestInitiationTime() {
        return this.requestInitiationTime;
    }

    public final RequestType getRequestType() {
        return this.requestType;
    }

    public final String getRequestUrl() {
        return this.requestUrl;
    }

    public final int getResponseCode() {
        return this.responseCode;
    }

    public final Map<String, String> getResponseHeaders() {
        return this.responseHeaders;
    }

    public int hashCode() {
        return this.httpConnectorResult.hashCode() + (this.brazeRequest.hashCode() * 31);
    }

    public String toString() {
        return "BrazeNetworkFailureEvent(brazeRequest=" + this.brazeRequest + ", httpConnectorResult=" + this.httpConnectorResult + ")";
    }

    public BrazeNetworkFailureEvent(l9 l9Var, v9 v9Var) {
        l9Var.getClass();
        v9Var.getClass();
        this.brazeRequest = l9Var;
        this.httpConnectorResult = v9Var;
        this.responseCode = v9Var.a;
        this.responseHeaders = v9Var.b;
        l2 l2Var = (l2) l9Var;
        this.requestInitiationTime = l2Var.e;
        this.requestUrl = l2Var.e().a;
        this.requestType = l9Var instanceof e4 ? RequestType.CONTENT_CARDS_SYNC : RequestType.OTHER;
    }

    public final BrazeNetworkFailureEvent copy(l9 l9Var, v9 v9Var) {
        l9Var.getClass();
        v9Var.getClass();
        return new BrazeNetworkFailureEvent(l9Var, v9Var);
    }

    public static /* synthetic */ BrazeNetworkFailureEvent copy$default(BrazeNetworkFailureEvent brazeNetworkFailureEvent, l9 l9Var, v9 v9Var, int i, Object obj) {
        if ((i & 1) != 0) {
            l9Var = brazeNetworkFailureEvent.brazeRequest;
        }
        if ((i & 2) != 0) {
            v9Var = brazeNetworkFailureEvent.httpConnectorResult;
        }
        return brazeNetworkFailureEvent.copy(l9Var, v9Var);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BrazeNetworkFailureEvent)) {
            return false;
        }
        BrazeNetworkFailureEvent brazeNetworkFailureEvent = (BrazeNetworkFailureEvent) obj;
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.brazeRequest, brazeNetworkFailureEvent.brazeRequest}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        return ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.httpConnectorResult, brazeNetworkFailureEvent.httpConnectorResult}, getCieXyz.write())).booleanValue();
    }
}
