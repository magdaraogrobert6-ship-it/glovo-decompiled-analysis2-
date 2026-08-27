package o;

import com.google.firestore.v1.Value;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class getParentDataOLwlOKwannotations implements r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM {
    public final /* synthetic */ Value.RemoteActionCompatParcelizer RemoteActionCompatParcelizer;
    public final /* synthetic */ Value.RemoteActionCompatParcelizer serializer;

    @Override // o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM
    public final Object invoke(Object obj) {
        List list = (List) obj;
        list.getClass();
        if (list.size() == 2) {
            return new getSemanticsOLwlOKw((r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) list.get(0), (r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) list.get(1), this.serializer, this.RemoteActionCompatParcelizer);
        }
        getRectManager.write("Function should have exactly 2 params, but %d were given.", Integer.valueOf(list.size()));
        throw null;
    }

    public getParentDataOLwlOKwannotations(Value.RemoteActionCompatParcelizer remoteActionCompatParcelizer, Value.RemoteActionCompatParcelizer remoteActionCompatParcelizer2) {
        this.serializer = remoteActionCompatParcelizer;
        this.RemoteActionCompatParcelizer = remoteActionCompatParcelizer2;
    }
}
