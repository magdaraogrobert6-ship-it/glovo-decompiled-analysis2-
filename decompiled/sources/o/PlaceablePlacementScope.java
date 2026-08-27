package o;

import android.app.Activity;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes4.dex */
public final class PlaceablePlacementScope extends accessgetNumPadMoveEndcp {
    public final ArrayList write;

    public final void IconCompatParcelizer(getApparentToRealOffsetnOccac getapparenttorealoffsetnoccac) {
        ArrayList arrayList = this.write;
        synchronized (arrayList) {
            arrayList.add(new java.lang.ref.WeakReference(getapparenttorealoffsetnoccac));
        }
    }

    @Override // o.accessgetNumPadMoveEndcp
    public final void read() {
        ArrayList arrayList = this.write;
        synchronized (arrayList) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                getApparentToRealOffsetnOccac getapparenttorealoffsetnoccac = (getApparentToRealOffsetnOccac) ((java.lang.ref.WeakReference) it.next()).get();
                if (getapparenttorealoffsetnoccac != null) {
                    getapparenttorealoffsetnoccac.RemoteActionCompatParcelizer();
                }
            }
            arrayList.clear();
        }
    }

    public static PlaceablePlacementScope RemoteActionCompatParcelizer(Activity activity) {
        PlaceablePlacementScope placeablePlacementScope;
        accessgetNumPadLeftParenthesiscp accessgetnumpadleftparenthesiscp = accessgetNumPadMoveEndcp.read(activity);
        synchronized (accessgetnumpadleftparenthesiscp) {
            placeablePlacementScope = (PlaceablePlacementScope) accessgetnumpadleftparenthesiscp.serializer("TaskOnStopCallback", PlaceablePlacementScope.class);
            if (placeablePlacementScope == null) {
                placeablePlacementScope = new PlaceablePlacementScope(accessgetnumpadleftparenthesiscp);
            }
        }
        return placeablePlacementScope;
    }

    public PlaceablePlacementScope(accessgetNumPadLeftParenthesiscp accessgetnumpadleftparenthesiscp) {
        super(accessgetnumpadleftparenthesiscp);
        this.write = new ArrayList();
        accessgetnumpadleftparenthesiscp.serializer("TaskOnStopCallback", this);
    }
}
