package o;

import com.google.firestore.v1.Value;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class accessgetOnObserveReadsChangedcp implements r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM {
    public final /* synthetic */ Value.RemoteActionCompatParcelizer IconCompatParcelizer;

    @Override // o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM
    public final Object invoke(Object obj) {
        List list = (List) obj;
        list.getClass();
        return new ObserverNodeOwnerScope(list, this.IconCompatParcelizer);
    }

    public accessgetOnObserveReadsChangedcp(Value.RemoteActionCompatParcelizer remoteActionCompatParcelizer) {
        this.IconCompatParcelizer = remoteActionCompatParcelizer;
    }
}
