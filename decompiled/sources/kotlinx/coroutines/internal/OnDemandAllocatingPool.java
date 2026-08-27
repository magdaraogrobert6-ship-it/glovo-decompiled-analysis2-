package kotlinx.coroutines.internal;

import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import kotlin.ranges.RangesKt;
import o.BackspaceCommand;
import o.accessgetInstancedelegatecp;
import o.ensureSubscribedToInAppMessageEventslambda7;
import o.getInAppMessageStackannotations;

/* JADX INFO: loaded from: classes5.dex */
public final class OnDemandAllocatingPool<T> {
    public static final /* synthetic */ AtomicIntegerFieldUpdater read = AtomicIntegerFieldUpdater.newUpdater(OnDemandAllocatingPool.class, "controlState$volatile");
    private volatile /* synthetic */ int controlState$volatile;

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder("OnDemandAllocatingPool(");
        int i = read.get(this);
        ensureSubscribedToInAppMessageEventslambda7 ensuresubscribedtoinappmessageeventslambda7 = (ensureSubscribedToInAppMessageEventslambda7) RangesKt.read(281231685, BackspaceCommand.write(), BackspaceCommand.write(), new Object[]{0, Integer.valueOf(Integer.MAX_VALUE & i)}, BackspaceCommand.write(), -281231677, BackspaceCommand.write());
        ArrayList arrayList = new ArrayList(accessgetInstancedelegatecp.write(ensuresubscribedtoinappmessageeventslambda7, 10));
        getInAppMessageStackannotations it = ensuresubscribedtoinappmessageeventslambda7.iterator();
        if (!it.RemoteActionCompatParcelizer) {
            String string = arrayList.toString();
            if ((i & Integer.MIN_VALUE) != 0) {
                str = "[closed]";
            } else {
                str = "";
            }
            sb.append(string + str);
            sb.append(')');
            return sb.toString();
        }
        it.RemoteActionCompatParcelizer();
        throw null;
    }
}
