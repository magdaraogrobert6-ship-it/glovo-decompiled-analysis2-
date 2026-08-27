package o;

import java.util.Collections;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public final class getRelatedFixedSize {
    public final boolean IconCompatParcelizer;
    public final Set RemoteActionCompatParcelizer;
    public final Set serializer;

    public final boolean RemoteActionCompatParcelizer(Class cls, boolean z) {
        if (this.RemoteActionCompatParcelizer.contains(cls)) {
            return true;
        }
        return !this.serializer.contains(cls) && this.IconCompatParcelizer && z;
    }

    public getRelatedFixedSize(boolean z, HashSet hashSet, HashSet hashSet2) {
        this.IconCompatParcelizer = z;
        this.RemoteActionCompatParcelizer = hashSet == null ? Collections.EMPTY_SET : new HashSet(hashSet);
        this.serializer = hashSet2 == null ? Collections.EMPTY_SET : new HashSet(hashSet2);
    }

    public final String toString() {
        return "QuirkSettings{enabledWhenDeviceHasQuirk=" + this.IconCompatParcelizer + ", forceEnabledQuirks=" + this.RemoteActionCompatParcelizer + ", forceDisabledQuirks=" + this.serializer + '}';
    }

    public final int hashCode() {
        boolean z = this.IconCompatParcelizer;
        return Objects.hash(Boolean.valueOf(z), this.RemoteActionCompatParcelizer, this.serializer);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof getRelatedFixedSize)) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        getRelatedFixedSize getrelatedfixedsize = (getRelatedFixedSize) obj;
        return this.IconCompatParcelizer == getrelatedfixedsize.IconCompatParcelizer && Objects.equals(this.RemoteActionCompatParcelizer, getrelatedfixedsize.RemoteActionCompatParcelizer) && Objects.equals(this.serializer, getrelatedfixedsize.serializer);
    }
}
