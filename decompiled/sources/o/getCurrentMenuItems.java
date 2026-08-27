package o;

import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;

/* JADX INFO: loaded from: classes.dex */
public final class getCurrentMenuItems {
    public final Toolbar IconCompatParcelizer;
    public final getLogo read;

    public final int hashCode() {
        int iHashCode = this.read.hashCode();
        Toolbar toolbar = this.IconCompatParcelizer;
        return ((iHashCode ^ 1000003) * 1000003) ^ (toolbar == null ? 0 : toolbar.hashCode());
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof getCurrentMenuItems)) {
            return false;
        }
        getCurrentMenuItems getcurrentmenuitems = (getCurrentMenuItems) obj;
        if (!this.read.equals(getcurrentmenuitems.read)) {
            return false;
        }
        Toolbar toolbar = getcurrentmenuitems.IconCompatParcelizer;
        Toolbar toolbar2 = this.IconCompatParcelizer;
        if (toolbar2 == null) {
            if (toolbar != null) {
                return false;
            }
        } else if (!toolbar2.equals(toolbar)) {
            return false;
        }
        return true;
    }

    public final String toString() {
        return "CameraState{type=" + this.read + ", error=" + this.IconCompatParcelizer + "}";
    }

    public getCurrentMenuItems(getLogo getlogo, Toolbar toolbar) {
        if (getlogo == null) {
            ScreenStartObserver$$ExternalSyntheticLambda0.RemoteActionCompatParcelizer("Null type");
            throw null;
        }
        this.read = getlogo;
        this.IconCompatParcelizer = toolbar;
    }
}
