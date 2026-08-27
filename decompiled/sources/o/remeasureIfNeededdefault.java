package o;

/* JADX INFO: loaded from: classes2.dex */
public final class remeasureIfNeededdefault extends getLastPositionnOccacui {
    public final MeasureScopeWithLayoutNodeKt IconCompatParcelizer;
    public final String MediaMetadataCompat;
    public final long RemoteActionCompatParcelizer;
    public final getPreviousPlaceOrderui read;
    public final MeasurePassDelegatelayoutChildrenBlock1 serializer;
    public final MeasurePassDelegateWhenMappings write;

    public final remeasureOnly RemoteActionCompatParcelizer() {
        remeasureOnly remeasureonly = new remeasureOnly();
        remeasureonly.RatingCompat = this.RemoteActionCompatParcelizer;
        remeasureonly.MediaSessionCompatQueueItem = this.MediaMetadataCompat;
        remeasureonly.IconCompatParcelizer = this.read;
        remeasureonly.serializer = this.serializer;
        remeasureonly.RemoteActionCompatParcelizer = this.write;
        remeasureonly.read = this.IconCompatParcelizer;
        remeasureonly.write = (byte) 1;
        return remeasureonly;
    }

    public final int hashCode() {
        long j = this.RemoteActionCompatParcelizer;
        int i = (int) (j ^ (j >>> 32));
        int iHashCode = this.MediaMetadataCompat.hashCode();
        int iHashCode2 = this.read.hashCode();
        int iHashCode3 = this.serializer.hashCode();
        MeasurePassDelegateWhenMappings measurePassDelegateWhenMappings = this.write;
        int iHashCode4 = measurePassDelegateWhenMappings == null ? 0 : measurePassDelegateWhenMappings.hashCode();
        MeasureScopeWithLayoutNodeKt measureScopeWithLayoutNodeKt = this.IconCompatParcelizer;
        return ((((((((((i ^ 1000003) * 1000003) ^ iHashCode) * 1000003) ^ iHashCode2) * 1000003) ^ iHashCode3) * 1000003) ^ iHashCode4) * 1000003) ^ (measureScopeWithLayoutNodeKt != null ? measureScopeWithLayoutNodeKt.hashCode() : 0);
    }

    public remeasureIfNeededdefault(long j, String str, getPreviousPlaceOrderui getpreviousplaceorderui, MeasurePassDelegatelayoutChildrenBlock1 measurePassDelegatelayoutChildrenBlock1, MeasurePassDelegateWhenMappings measurePassDelegateWhenMappings, MeasureScopeWithLayoutNodeKt measureScopeWithLayoutNodeKt) {
        this.RemoteActionCompatParcelizer = j;
        this.MediaMetadataCompat = str;
        this.read = getpreviousplaceorderui;
        this.serializer = measurePassDelegatelayoutChildrenBlock1;
        this.write = measurePassDelegateWhenMappings;
        this.IconCompatParcelizer = measureScopeWithLayoutNodeKt;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof getLastPositionnOccacui)) {
            return false;
        }
        remeasureIfNeededdefault remeasureifneededdefault = (remeasureIfNeededdefault) ((getLastPositionnOccacui) obj);
        if (this.RemoteActionCompatParcelizer != remeasureifneededdefault.RemoteActionCompatParcelizer || !this.MediaMetadataCompat.equals(remeasureifneededdefault.MediaMetadataCompat) || !this.read.equals(remeasureifneededdefault.read) || !this.serializer.equals(remeasureifneededdefault.serializer)) {
            return false;
        }
        MeasurePassDelegateWhenMappings measurePassDelegateWhenMappings = remeasureifneededdefault.write;
        MeasurePassDelegateWhenMappings measurePassDelegateWhenMappings2 = this.write;
        if (measurePassDelegateWhenMappings2 == null) {
            if (measurePassDelegateWhenMappings != null) {
                return false;
            }
        } else if (!measurePassDelegateWhenMappings2.equals(measurePassDelegateWhenMappings)) {
            return false;
        }
        MeasureScopeWithLayoutNodeKt measureScopeWithLayoutNodeKt = remeasureifneededdefault.IconCompatParcelizer;
        MeasureScopeWithLayoutNodeKt measureScopeWithLayoutNodeKt2 = this.IconCompatParcelizer;
        if (measureScopeWithLayoutNodeKt2 == null) {
            if (measureScopeWithLayoutNodeKt != null) {
                return false;
            }
        } else if (!measureScopeWithLayoutNodeKt2.equals(measureScopeWithLayoutNodeKt)) {
            return false;
        }
        return true;
    }

    public final String toString() {
        return "Event{timestamp=" + this.RemoteActionCompatParcelizer + ", type=" + this.MediaMetadataCompat + ", app=" + this.read + ", device=" + this.serializer + ", log=" + this.write + ", rollouts=" + this.IconCompatParcelizer + "}";
    }
}
