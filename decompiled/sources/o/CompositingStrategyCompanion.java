package o;

import android.view.View;
import bo.app.af$$ExternalSyntheticOutline0;
import java.util.ArrayList;
import java.util.HashMap;

/* JADX INFO: loaded from: classes.dex */
public final class CompositingStrategyCompanion {
    public final View RemoteActionCompatParcelizer;
    public final HashMap write = new HashMap();
    public final ArrayList serializer = new ArrayList();

    public final int hashCode() {
        return this.write.hashCode() + (this.RemoteActionCompatParcelizer.hashCode() * 31);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof CompositingStrategyCompanion)) {
            return false;
        }
        CompositingStrategyCompanion compositingStrategyCompanion = (CompositingStrategyCompanion) obj;
        return this.RemoteActionCompatParcelizer == compositingStrategyCompanion.RemoteActionCompatParcelizer && this.write.equals(compositingStrategyCompanion.write);
    }

    public final String toString() {
        StringBuilder sbM = af$$ExternalSyntheticOutline0.m("TransitionValues@" + Integer.toHexString(hashCode()) + ":\n", "    view = ");
        sbM.append(this.RemoteActionCompatParcelizer);
        sbM.append("\n");
        String strConcat = sbM.toString().concat("    values:");
        HashMap map = this.write;
        for (String str : map.keySet()) {
            strConcat = strConcat + "    " + str + ": " + map.get(str) + "\n";
        }
        return strConcat;
    }

    public CompositingStrategyCompanion(View view) {
        this.RemoteActionCompatParcelizer = view;
    }
}
