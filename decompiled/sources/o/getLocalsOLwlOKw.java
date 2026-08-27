package o;

import com.google.firestore.v1.Value;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class getLocalsOLwlOKw implements r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM {
    public final /* synthetic */ Value.RemoteActionCompatParcelizer RemoteActionCompatParcelizer;
    public final /* synthetic */ Value.RemoteActionCompatParcelizer read;

    @Override // o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM
    public final Object invoke(Object obj) {
        List list = (List) obj;
        list.getClass();
        if (list.size() == 2) {
            return new getOnRemeasuredOLwlOKw((r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) list.get(0), (r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) list.get(1), this.RemoteActionCompatParcelizer, this.read);
        }
        getRectManager.write("Function should have exactly 2 params, but %d were given.", Integer.valueOf(list.size()));
        throw null;
    }

    public getLocalsOLwlOKw(Value.RemoteActionCompatParcelizer remoteActionCompatParcelizer, Value.RemoteActionCompatParcelizer remoteActionCompatParcelizer2) {
        this.RemoteActionCompatParcelizer = remoteActionCompatParcelizer;
        this.read = remoteActionCompatParcelizer2;
    }
}
