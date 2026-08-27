package o;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.io.TextStreamsKt;

/* JADX INFO: loaded from: classes4.dex */
public final class executelambda0 extends requestPushPermissionPromptlambda3 {
    public final int IconCompatParcelizer;
    public final AtomicInteger RemoteActionCompatParcelizer;
    public final ArrayList serializer;

    public final int hashCode() {
        return this.IconCompatParcelizer;
    }

    @Override // o.requestPushPermissionPromptlambda3
    public final wouldPushPermissionPromptDisplaylambda0 write(r8lambdagKH6tFShUp2G_hD0a6i5EJD8PU r8lambdagkh6tfshup2g_hd0a6i5ejd8pu) {
        int andIncrement = this.RemoteActionCompatParcelizer.getAndIncrement();
        ArrayList arrayList = this.serializer;
        return ((requestPushPermissionPromptlambda3) arrayList.get((andIncrement & Integer.MAX_VALUE) % arrayList.size())).write(r8lambdagkh6tfshup2g_hd0a6i5ejd8pu);
    }

    public executelambda0(ArrayList arrayList, AtomicInteger atomicInteger) {
        TextStreamsKt.read("empty list", !arrayList.isEmpty());
        this.serializer = arrayList;
        TextStreamsKt.serializer(atomicInteger, "index");
        this.RemoteActionCompatParcelizer = atomicInteger;
        Iterator it = arrayList.iterator();
        int iHashCode = 0;
        while (it.hasNext()) {
            iHashCode += ((requestPushPermissionPromptlambda3) it.next()).hashCode();
        }
        this.IconCompatParcelizer = iHashCode;
    }

    public final String toString() {
        r8lambdaLMKBRrgsWWtv97ObrSj7trJ7AI r8lambdalmkbrrgswwtv97obrsj7trj7ai = new r8lambdaLMKBRrgsWWtv97ObrSj7trJ7AI(executelambda0.class.getSimpleName());
        r8lambdalmkbrrgswwtv97obrsj7trj7ai.IconCompatParcelizer(this.serializer, "subchannelPickers");
        return r8lambdalmkbrrgswwtv97obrsj7trj7ai.toString();
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof executelambda0)) {
            return false;
        }
        executelambda0 executelambda0Var = (executelambda0) obj;
        ArrayList arrayList = executelambda0Var.serializer;
        if (executelambda0Var == this) {
            return true;
        }
        if (this.IconCompatParcelizer != executelambda0Var.IconCompatParcelizer || this.RemoteActionCompatParcelizer != executelambda0Var.RemoteActionCompatParcelizer) {
            return false;
        }
        ArrayList arrayList2 = this.serializer;
        return arrayList2.size() == arrayList.size() && new HashSet(arrayList2).containsAll(arrayList);
    }
}
