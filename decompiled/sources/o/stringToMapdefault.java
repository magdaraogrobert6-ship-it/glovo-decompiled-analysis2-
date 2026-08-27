package o;

/* JADX INFO: loaded from: classes4.dex */
public final class stringToMapdefault {
    public final boolean IconCompatParcelizer;
    public final DataStoreUtilsd RemoteActionCompatParcelizer;

    public final int hashCode() {
        return Boolean.hashCode(this.IconCompatParcelizer) + (this.RemoteActionCompatParcelizer.write.hashCode() * 31);
    }

    public stringToMapdefault(DataStoreUtilsd dataStoreUtilsd, boolean z) {
        this.RemoteActionCompatParcelizer = dataStoreUtilsd;
        this.IconCompatParcelizer = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof stringToMapdefault)) {
            return false;
        }
        stringToMapdefault stringtomapdefault = (stringToMapdefault) obj;
        return this.RemoteActionCompatParcelizer.equals(stringtomapdefault.RemoteActionCompatParcelizer) && this.IconCompatParcelizer == stringtomapdefault.IconCompatParcelizer;
    }

    public final String toString() {
        return "SelectableWeek(week=" + this.RemoteActionCompatParcelizer + ", isSelected=" + this.IconCompatParcelizer + ")";
    }
}
