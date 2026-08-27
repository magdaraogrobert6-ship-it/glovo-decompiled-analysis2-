package o;

import com.google.firestore.v1.Value;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class NodeMeasuringIntrinsicsIntrinsicMinMax implements r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM {
    public final /* synthetic */ Value.RemoteActionCompatParcelizer RemoteActionCompatParcelizer;
    public final /* synthetic */ Value.RemoteActionCompatParcelizer serializer;

    @Override // o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM
    public final Object invoke(Object obj) {
        List list = (List) obj;
        list.getClass();
        if (list.size() == 1) {
            return new getAnyOLwlOKw((r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) list.get(0), this.RemoteActionCompatParcelizer, this.serializer);
        }
        getRectManager.write("Function should have exactly 1 params, but %d were given.", Integer.valueOf(list.size()));
        throw null;
    }

    public NodeMeasuringIntrinsicsIntrinsicMinMax(Value.RemoteActionCompatParcelizer remoteActionCompatParcelizer, Value.RemoteActionCompatParcelizer remoteActionCompatParcelizer2) {
        this.RemoteActionCompatParcelizer = remoteActionCompatParcelizer;
        this.serializer = remoteActionCompatParcelizer2;
    }
}
