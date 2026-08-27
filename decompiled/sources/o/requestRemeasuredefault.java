package o;

import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class requestRemeasuredefault extends getZIndexui {
    public final getDuringMeasureLayoutui IconCompatParcelizer;
    public final List RemoteActionCompatParcelizer;
    public final MeasurePassDelegate read;
    public final getPlacedOnce serializer;
    public final List write;

    public final int hashCode() {
        List list = this.RemoteActionCompatParcelizer;
        int iHashCode = list == null ? 0 : list.hashCode();
        getPlacedOnce getplacedonce = this.serializer;
        int iHashCode2 = getplacedonce == null ? 0 : getplacedonce.hashCode();
        MeasurePassDelegate measurePassDelegate = this.read;
        return ((((((((iHashCode ^ 1000003) * 1000003) ^ iHashCode2) * 1000003) ^ (measurePassDelegate != null ? measurePassDelegate.hashCode() : 0)) * 1000003) ^ this.IconCompatParcelizer.hashCode()) * 1000003) ^ this.write.hashCode();
    }

    public requestRemeasuredefault(List list, forceMeasureTheSubtree forcemeasurethesubtree, MeasurePassDelegate measurePassDelegate, getDuringMeasureLayoutui getduringmeasurelayoutui, List list2) {
        this.RemoteActionCompatParcelizer = list;
        this.serializer = forcemeasurethesubtree;
        this.read = measurePassDelegate;
        this.IconCompatParcelizer = getduringmeasurelayoutui;
        this.write = list2;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof getZIndexui)) {
            return false;
        }
        getZIndexui getzindexui = (getZIndexui) obj;
        List list = this.RemoteActionCompatParcelizer;
        if (list == null) {
            if (((requestRemeasuredefault) getzindexui).RemoteActionCompatParcelizer != null) {
                return false;
            }
        } else if (!list.equals(((requestRemeasuredefault) getzindexui).RemoteActionCompatParcelizer)) {
            return false;
        }
        getPlacedOnce getplacedonce = this.serializer;
        if (getplacedonce == null) {
            if (((requestRemeasuredefault) getzindexui).serializer != null) {
                return false;
            }
        } else if (!getplacedonce.equals(((requestRemeasuredefault) getzindexui).serializer)) {
            return false;
        }
        MeasurePassDelegate measurePassDelegate = this.read;
        if (measurePassDelegate == null) {
            if (((requestRemeasuredefault) getzindexui).read != null) {
                return false;
            }
        } else if (!measurePassDelegate.equals(((requestRemeasuredefault) getzindexui).read)) {
            return false;
        }
        requestRemeasuredefault requestremeasuredefault = (requestRemeasuredefault) getzindexui;
        return this.IconCompatParcelizer.equals(requestremeasuredefault.IconCompatParcelizer) && this.write.equals(requestremeasuredefault.write);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Execution{threads=");
        sb.append(this.RemoteActionCompatParcelizer);
        sb.append(", exception=");
        sb.append(this.serializer);
        sb.append(", appExitInfo=");
        sb.append(this.read);
        sb.append(", signal=");
        sb.append(this.IconCompatParcelizer);
        sb.append(", binaries=");
        return MediaSessionCompatQueueItem.read(sb, this.write, "}");
    }
}
