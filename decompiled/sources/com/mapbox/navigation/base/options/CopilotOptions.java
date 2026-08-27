package com.mapbox.navigation.base.options;

import bo.app.d$$ExternalSyntheticOutline0;

/* JADX INFO: loaded from: classes2.dex */
public final class CopilotOptions {
    public final int hashCode() {
        return d$$ExternalSyntheticOutline0.m(d$$ExternalSyntheticOutline0.m(d$$ExternalSyntheticOutline0.m((((Long.hashCode(Long.MAX_VALUE) + (Boolean.hashCode(false) * 31)) * 31) + Integer.MAX_VALUE) * 31, 31, Long.MAX_VALUE), 31, true), 961, false);
    }

    public final String toString() {
        return "CopilotOptions(shouldSendHistoryOnlyWithFeedback=false, maxHistoryFileLengthMillis=9223372036854775807, maxHistoryFilesPerSession=2147483647, maxTotalHistoryFilesSizePerSession=9223372036854775807, shouldRecordFreeDriveHistories=true, shouldRecordRouteLineEvents=false, userId=null)";
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!CopilotOptions.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        obj.getClass();
        return true;
    }
}
