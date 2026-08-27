package com.mapbox.search.base.result;

import com.mapbox.search.base.record.BaseIndexableRecord;
import o.getAccessibilityExtraKeysui;
import o.getCieXyz;
import o.removeNodeAtDepth;

/* JADX INFO: loaded from: classes3.dex */
public final class BaseSearchResult$Type$IndexableRecordSearchResult extends getAccessibilityExtraKeysui {
    public final BaseIndexableRecord record;

    public final int hashCode() {
        return this.record.hashCode();
    }

    public BaseSearchResult$Type$IndexableRecordSearchResult(BaseIndexableRecord baseIndexableRecord) {
        baseIndexableRecord.getClass();
        this.record = baseIndexableRecord;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BaseSearchResult$Type$IndexableRecordSearchResult)) {
            return false;
        }
        return ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.record, ((BaseSearchResult$Type$IndexableRecordSearchResult) obj).record}, getCieXyz.write())).booleanValue();
    }

    public final String toString() {
        return "IndexableRecordSearchResult(record=" + this.record + ')';
    }
}
