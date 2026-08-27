package o;

import android.content.Context;
import com.huawei.location.logic.zp;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes2.dex */
public final class markActiveNodesAsReused {
    public final Object IconCompatParcelizer;
    public final /* synthetic */ int read;

    public final void write(zp zpVar) {
        int i = this.read;
        Object obj = this.IconCompatParcelizer;
        if (i != 0) {
            ((accessgetF3cp) ((provideRulerValue) obj).write()).read(zpVar.write != 0 ? accessgetBackspacecp.RemoteActionCompatParcelizer(zpVar.MediaDescriptionCompat()) : new accessgetBackspacecp(zpVar.MediaDescriptionCompat(), accessgetBrowsercp.VERY_LOW, null), new getAlignmentLinesMap(2));
            return;
        }
        Iterator it = ((ArrayList) obj).iterator();
        while (it.hasNext()) {
            ((markActiveNodesAsReused) it.next()).write(zpVar);
        }
    }

    public markActiveNodesAsReused(Context context, getSlotIdAtIndex getslotidatindex, int i) {
        this.read = i;
        if (i != 1) {
            ArrayList arrayList = new ArrayList();
            this.IconCompatParcelizer = arrayList;
            arrayList.add(new markActiveNodesAsReused(context, getslotidatindex, 1));
        } else {
            accessgetButton11cp accessgetbutton11cp = accessgetButton11cp.write;
            accessgetF2cp.RemoteActionCompatParcelizer(context);
            accessgetF12cp accessgetf12cpRemoteActionCompatParcelizer = accessgetF2cp.read().RemoteActionCompatParcelizer(accessgetbutton11cp);
            if (accessgetButton11cp.serializer.contains(new accessgetButton10cp("json"))) {
                new provideRulerValue(new reuseComposition(accessgetf12cpRemoteActionCompatParcelizer, 0));
            }
            this.IconCompatParcelizer = new provideRulerValue(new reuseComposition(accessgetf12cpRemoteActionCompatParcelizer, 5));
        }
    }
}
