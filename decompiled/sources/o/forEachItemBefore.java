package o;

import java.util.Map;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes.dex */
public final class forEachItemBefore extends Lambda implements r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM {
    public static final forEachItemBefore RemoteActionCompatParcelizer = new forEachItemBefore(1);

    @Override // o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM
    public final Object invoke(Object obj) {
        Map.Entry entry = (Map.Entry) obj;
        entry.getClass();
        return "  " + ((isRoot) entry.getKey()).IconCompatParcelizer + " = " + entry.getValue();
    }

    public forEachItemBefore(int i) {
        super(i);
    }
}
