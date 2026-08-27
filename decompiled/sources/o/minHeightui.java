package o;

import com.google.firestore.v1.Value;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class minHeightui implements r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM {
    public final /* synthetic */ Value.RemoteActionCompatParcelizer RemoteActionCompatParcelizer;
    public final /* synthetic */ Value.RemoteActionCompatParcelizer read;

    @Override // o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM
    public final Object invoke(Object obj) {
        List list = (List) obj;
        list.getClass();
        if (list.size() == 1) {
            return new NodeMeasuringIntrinsicsApproachMeasureBlock((r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) list.get(0), this.read, this.RemoteActionCompatParcelizer);
        }
        getRectManager.write("Function should have exactly 1 params, but %d were given.", Integer.valueOf(list.size()));
        throw null;
    }

    public minHeightui(Value.RemoteActionCompatParcelizer remoteActionCompatParcelizer, Value.RemoteActionCompatParcelizer remoteActionCompatParcelizer2) {
        this.read = remoteActionCompatParcelizer;
        this.RemoteActionCompatParcelizer = remoteActionCompatParcelizer2;
    }
}
