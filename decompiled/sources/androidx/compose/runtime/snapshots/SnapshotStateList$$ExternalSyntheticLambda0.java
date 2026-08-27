package androidx.compose.runtime.snapshots;

import java.util.Collection;
import java.util.List;
import o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class SnapshotStateList$$ExternalSyntheticLambda0 implements r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM {
    public final /* synthetic */ int RemoteActionCompatParcelizer;
    public final /* synthetic */ Collection read;

    public /* synthetic */ SnapshotStateList$$ExternalSyntheticLambda0(int i, Collection collection) {
        this.RemoteActionCompatParcelizer = i;
        this.read = collection;
    }

    @Override // o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM
    public final Object invoke(Object obj) {
        boolean zRetainAll;
        int i = this.RemoteActionCompatParcelizer;
        Collection<?> collection = this.read;
        if (i != 0) {
            zRetainAll = (i == 1 || i != 2) ? collection.contains(obj) : collection.contains(obj);
        } else {
            zRetainAll = ((List) obj).retainAll(collection);
        }
        return Boolean.valueOf(zRetainAll);
    }
}
