package o;

import bo.app.af$$ExternalSyntheticOutline0;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class dispatchOnPositionedCallbacks extends getPreviousPlaceOrderui {
    public final List IconCompatParcelizer;
    public final int MediaBrowserCompatMediaItem;
    public final List MediaDescriptionCompat;
    public final markLayoutPending RemoteActionCompatParcelizer;
    public final requestRemeasuredefault read;
    public final List serializer;
    public final Boolean write;

    public final int hashCode() {
        int iHashCode = this.read.hashCode();
        List list = this.serializer;
        int iHashCode2 = list == null ? 0 : list.hashCode();
        List list2 = this.MediaDescriptionCompat;
        int iHashCode3 = list2 == null ? 0 : list2.hashCode();
        Boolean bool = this.write;
        int iHashCode4 = bool == null ? 0 : bool.hashCode();
        markLayoutPending marklayoutpending = this.RemoteActionCompatParcelizer;
        int iHashCode5 = marklayoutpending == null ? 0 : marklayoutpending.hashCode();
        List list3 = this.IconCompatParcelizer;
        return ((((((((((((iHashCode ^ 1000003) * 1000003) ^ iHashCode2) * 1000003) ^ iHashCode3) * 1000003) ^ iHashCode4) * 1000003) ^ iHashCode5) * 1000003) ^ (list3 != null ? list3.hashCode() : 0)) * 1000003) ^ this.MediaBrowserCompatMediaItem;
    }

    public dispatchOnPositionedCallbacks(requestRemeasuredefault requestremeasuredefault, List list, List list2, Boolean bool, markLayoutPending marklayoutpending, List list3, int i) {
        this.read = requestremeasuredefault;
        this.serializer = list;
        this.MediaDescriptionCompat = list2;
        this.write = bool;
        this.RemoteActionCompatParcelizer = marklayoutpending;
        this.IconCompatParcelizer = list3;
        this.MediaBrowserCompatMediaItem = i;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof getPreviousPlaceOrderui)) {
            return false;
        }
        dispatchOnPositionedCallbacks dispatchonpositionedcallbacks = (dispatchOnPositionedCallbacks) ((getPreviousPlaceOrderui) obj);
        if (!this.read.equals(dispatchonpositionedcallbacks.read)) {
            return false;
        }
        List list = dispatchonpositionedcallbacks.serializer;
        List list2 = this.serializer;
        if (list2 == null) {
            if (list != null) {
                return false;
            }
        } else if (!list2.equals(list)) {
            return false;
        }
        List list3 = dispatchonpositionedcallbacks.MediaDescriptionCompat;
        List list4 = this.MediaDescriptionCompat;
        if (list4 == null) {
            if (list3 != null) {
                return false;
            }
        } else if (!list4.equals(list3)) {
            return false;
        }
        Boolean bool = dispatchonpositionedcallbacks.write;
        Boolean bool2 = this.write;
        if (bool2 == null) {
            if (bool != null) {
                return false;
            }
        } else if (!bool2.equals(bool)) {
            return false;
        }
        markLayoutPending marklayoutpending = dispatchonpositionedcallbacks.RemoteActionCompatParcelizer;
        markLayoutPending marklayoutpending2 = this.RemoteActionCompatParcelizer;
        if (marklayoutpending2 == null) {
            if (marklayoutpending != null) {
                return false;
            }
        } else if (!marklayoutpending2.equals(marklayoutpending)) {
            return false;
        }
        List list5 = dispatchonpositionedcallbacks.IconCompatParcelizer;
        List list6 = this.IconCompatParcelizer;
        if (list6 == null) {
            if (list5 != null) {
                return false;
            }
        } else if (!list6.equals(list5)) {
            return false;
        }
        return this.MediaBrowserCompatMediaItem == dispatchonpositionedcallbacks.MediaBrowserCompatMediaItem;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Application{execution=");
        sb.append(this.read);
        sb.append(", customAttributes=");
        sb.append(this.serializer);
        sb.append(", internalKeys=");
        sb.append(this.MediaDescriptionCompat);
        sb.append(", background=");
        sb.append(this.write);
        sb.append(", currentProcessDetails=");
        sb.append(this.RemoteActionCompatParcelizer);
        sb.append(", appProcessDetails=");
        sb.append(this.IconCompatParcelizer);
        sb.append(", uiOrientation=");
        return af$$ExternalSyntheticOutline0.m(this.MediaBrowserCompatMediaItem, "}", sb);
    }
}
