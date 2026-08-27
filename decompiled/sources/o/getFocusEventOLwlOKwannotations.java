package o;

import com.google.firestore.v1.Value;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class getFocusEventOLwlOKwannotations implements r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM {
    public final /* synthetic */ Value.RemoteActionCompatParcelizer IconCompatParcelizer;
    public final /* synthetic */ Value.RemoteActionCompatParcelizer RemoteActionCompatParcelizer;

    @Override // o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM
    public final Object invoke(Object obj) {
        List list = (List) obj;
        list.getClass();
        if (list.size() == 1) {
            return new getFocusEventOLwlOKw((r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) list.get(0), this.IconCompatParcelizer, this.RemoteActionCompatParcelizer);
        }
        getRectManager.write("Function should have exactly 1 params, but %d were given.", Integer.valueOf(list.size()));
        throw null;
    }

    public getFocusEventOLwlOKwannotations(Value.RemoteActionCompatParcelizer remoteActionCompatParcelizer, Value.RemoteActionCompatParcelizer remoteActionCompatParcelizer2) {
        this.IconCompatParcelizer = remoteActionCompatParcelizer;
        this.RemoteActionCompatParcelizer = remoteActionCompatParcelizer2;
    }
}
