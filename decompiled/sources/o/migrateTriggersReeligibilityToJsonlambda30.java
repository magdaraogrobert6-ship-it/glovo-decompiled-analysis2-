package o;

import java.util.Comparator;

/* JADX INFO: loaded from: classes4.dex */
public final class migrateTriggersReeligibilityToJsonlambda30<T> implements Comparator {
    final /* synthetic */ r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM read;

    public migrateTriggersReeligibilityToJsonlambda30(r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm) {
        this.read = r8lambdaunavo3sxub_pc9xroryotnrlvsm;
    }

    @Override // java.util.Comparator
    public final int compare(T t, T t2) {
        r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm = this.read;
        return setNativeShader.RemoteActionCompatParcelizer((Comparable) r8lambdaunavo3sxub_pc9xroryotnrlvsm.invoke(t), (Comparable) r8lambdaunavo3sxub_pc9xroryotnrlvsm.invoke(t2));
    }
}
