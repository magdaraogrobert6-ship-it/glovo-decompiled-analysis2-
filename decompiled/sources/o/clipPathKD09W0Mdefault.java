package o;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public final class clipPathKD09W0Mdefault implements drawRectnJ9OG0default {
    public final /* synthetic */ accessgetApparentToRealOffsetnOccac write;

    public clipPathKD09W0Mdefault(accessgetApparentToRealOffsetnOccac accessgetapparenttorealoffsetnoccac) {
        this.write = accessgetapparenttorealoffsetnoccac;
    }

    @Override // o.drawRectnJ9OG0default
    public final void write(boolean z) {
        ArrayList arrayList;
        Fill.serializer();
        synchronized (this.write) {
            arrayList = new ArrayList((HashSet) this.write.write);
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((drawRectnJ9OG0default) it.next()).write(z);
        }
    }
}
