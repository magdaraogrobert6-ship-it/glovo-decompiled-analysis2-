package o;

import com.google.firestore.v1.Value;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class getFocusTargetOLwlOKwannotations implements r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM {
    public final /* synthetic */ Value.RemoteActionCompatParcelizer IconCompatParcelizer;
    public final /* synthetic */ Value.RemoteActionCompatParcelizer write;

    @Override // o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM
    public final Object invoke(Object obj) {
        List list = (List) obj;
        list.getClass();
        if (list.size() == 1) {
            return new getIndirectPointerInputOLwlOKw((r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) list.get(0), this.IconCompatParcelizer, this.write);
        }
        getRectManager.write("Function should have exactly 1 params, but %d were given.", Integer.valueOf(list.size()));
        throw null;
    }

    public getFocusTargetOLwlOKwannotations(Value.RemoteActionCompatParcelizer remoteActionCompatParcelizer, Value.RemoteActionCompatParcelizer remoteActionCompatParcelizer2) {
        this.IconCompatParcelizer = remoteActionCompatParcelizer;
        this.write = remoteActionCompatParcelizer2;
    }
}
