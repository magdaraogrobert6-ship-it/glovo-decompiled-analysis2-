package com.mapbox.navigation.core.reroute;

import o.IconCompatParcelizer;

/* JADX INFO: loaded from: classes2.dex */
public final class PreRouterFailure {
    public final boolean isRetryable;
    public final String message;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v3, types: [int] */
    /* JADX WARN: Type inference failed for: r1v1, types: [int] */
    /* JADX WARN: Type inference failed for: r1v2 */
    /* JADX WARN: Type inference failed for: r1v3 */
    public final int hashCode() {
        int iHashCode = this.message.hashCode();
        boolean z = this.isRetryable;
        ?? r1 = z;
        if (z) {
            r1 = 1;
        }
        return (iHashCode * 31) + r1;
    }

    public PreRouterFailure(String str, boolean z) {
        this.message = str;
        this.isRetryable = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PreRouterFailure)) {
            return false;
        }
        PreRouterFailure preRouterFailure = (PreRouterFailure) obj;
        return this.message.equals(preRouterFailure.message) && this.isRetryable == preRouterFailure.isRetryable;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PreRouterFailure(message=");
        sb.append(this.message);
        sb.append(", isRetryable=");
        return IconCompatParcelizer.IconCompatParcelizer(sb, this.isRetryable, ')');
    }
}
