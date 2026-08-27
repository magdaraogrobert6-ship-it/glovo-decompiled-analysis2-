package o;

import com.google.firestore.v1.Value;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class observeReads implements r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM {
    public final /* synthetic */ Value.RemoteActionCompatParcelizer read;
    public final /* synthetic */ int write;

    public /* synthetic */ observeReads(Value.RemoteActionCompatParcelizer remoteActionCompatParcelizer, int i) {
        this.write = i;
        this.read = remoteActionCompatParcelizer;
    }

    @Override // o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM
    public final Object invoke(Object obj) {
        int i = this.write;
        Value.RemoteActionCompatParcelizer remoteActionCompatParcelizer = this.read;
        switch (i) {
            case 0:
                List list = (List) obj;
                list.getClass();
                if (list.size() == 1) {
                    return new ObserverModifierNode((r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) list.get(0), remoteActionCompatParcelizer, 0);
                }
                getRectManager.write("Function should have exactly 1 params, but %d were given.", Integer.valueOf(list.size()));
                throw null;
            case 1:
                List list2 = (List) obj;
                list2.getClass();
                if (list2.size() == 1) {
                    return new ObserverModifierNode((r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) list2.get(0), remoteActionCompatParcelizer, 1);
                }
                getRectManager.write("Function should have exactly 1 params, but %d were given.", Integer.valueOf(list2.size()));
                throw null;
            case 2:
                List list3 = (List) obj;
                list3.getClass();
                if (list3.size() == 1) {
                    return new ObserverModifierNode((r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) list3.get(0), remoteActionCompatParcelizer, 2);
                }
                getRectManager.write("Function should have exactly 1 params, but %d were given.", Integer.valueOf(list3.size()));
                throw null;
            case 3:
                List list4 = (List) obj;
                list4.getClass();
                if (list4.size() == 1) {
                    return new ObserverModifierNode((r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) list4.get(0), remoteActionCompatParcelizer, 3);
                }
                getRectManager.write("Function should have exactly 1 params, but %d were given.", Integer.valueOf(list4.size()));
                throw null;
            case 4:
                List list5 = (List) obj;
                list5.getClass();
                if (list5.size() == 1) {
                    return new ObserverModifierNode((r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) list5.get(0), remoteActionCompatParcelizer, 4);
                }
                getRectManager.write("Function should have exactly 1 params, but %d were given.", Integer.valueOf(list5.size()));
                throw null;
            case 5:
                List list6 = (List) obj;
                list6.getClass();
                if (list6.size() == 1) {
                    return new ObserverModifierNode((r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) list6.get(0), remoteActionCompatParcelizer, 5);
                }
                getRectManager.write("Function should have exactly 1 params, but %d were given.", Integer.valueOf(list6.size()));
                throw null;
            case 6:
                List list7 = (List) obj;
                list7.getClass();
                if (list7.size() == 1) {
                    return new ObserverModifierNode((r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) list7.get(0), remoteActionCompatParcelizer, 6);
                }
                getRectManager.write("Function should have exactly 1 params, but %d were given.", Integer.valueOf(list7.size()));
                throw null;
            default:
                List list8 = (List) obj;
                list8.getClass();
                if (list8.size() == 1) {
                    return new ObserverModifierNode((r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) list8.get(0), remoteActionCompatParcelizer, 7);
                }
                getRectManager.write("Function should have exactly 1 params, but %d were given.", Integer.valueOf(list8.size()));
                throw null;
        }
    }
}
