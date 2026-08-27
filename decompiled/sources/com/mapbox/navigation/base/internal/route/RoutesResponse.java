package com.mapbox.navigation.base.internal.route;

import bo.app.af$$ExternalSyntheticOutline0;
import bo.app.d$$ExternalSyntheticOutline0;
import java.util.ArrayList;
import o.r8lambdafvzP3Wky1RLLzE56uVXaMHcvU;

/* JADX INFO: loaded from: classes2.dex */
public final class RoutesResponse {
    public final Metadata meta;
    public final ArrayList routes;

    public final class Metadata {
        public final long createdAtElapsedMillis;
        public final long nativeParseMillis;
        public final long nativeWaitMillis;
        public final long responseParseMillis;
        public final String responseParseThread;
        public final long responseWaitMillis;

        public final int hashCode() {
            return Long.hashCode(this.nativeParseMillis) + d$$ExternalSyntheticOutline0.m(af$$ExternalSyntheticOutline0.m(d$$ExternalSyntheticOutline0.m(d$$ExternalSyntheticOutline0.m(Long.hashCode(this.createdAtElapsedMillis) * 31, 31, this.responseWaitMillis), 31, this.responseParseMillis), 31, this.responseParseThread), 31, this.nativeWaitMillis);
        }

        public Metadata(long j, String str, long j2, long j3, long j4, long j5) {
            this.createdAtElapsedMillis = j;
            this.responseWaitMillis = j2;
            this.responseParseMillis = j3;
            this.responseParseThread = str;
            this.nativeWaitMillis = j4;
            this.nativeParseMillis = j5;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Metadata)) {
                return false;
            }
            Metadata metadata = (Metadata) obj;
            return this.createdAtElapsedMillis == metadata.createdAtElapsedMillis && this.responseWaitMillis == metadata.responseWaitMillis && this.responseParseMillis == metadata.responseParseMillis && this.responseParseThread.equals(metadata.responseParseThread) && this.nativeWaitMillis == metadata.nativeWaitMillis && this.nativeParseMillis == metadata.nativeParseMillis;
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("Metadata(createdAtElapsedMillis=");
            sb.append(this.createdAtElapsedMillis);
            sb.append(", responseWaitMillis=");
            sb.append(this.responseWaitMillis);
            sb.append(", responseParseMillis=");
            sb.append(this.responseParseMillis);
            sb.append(", responseParseThread=");
            sb.append(this.responseParseThread);
            sb.append(", nativeWaitMillis=");
            sb.append(this.nativeWaitMillis);
            sb.append(", nativeParseMillis=");
            return r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.read(sb, this.nativeParseMillis, ')');
        }
    }

    public final int hashCode() {
        return this.meta.hashCode() + (this.routes.hashCode() * 31);
    }

    public RoutesResponse(ArrayList arrayList, Metadata metadata) {
        this.routes = arrayList;
        this.meta = metadata;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RoutesResponse)) {
            return false;
        }
        RoutesResponse routesResponse = (RoutesResponse) obj;
        return this.routes.equals(routesResponse.routes) && this.meta.equals(routesResponse.meta);
    }

    public final String toString() {
        return "RoutesResponse(routes=" + this.routes + ", meta=" + this.meta + ')';
    }
}
