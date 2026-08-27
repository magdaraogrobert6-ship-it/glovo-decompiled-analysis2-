package o;

import com.google.firestore.v1.Value;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class ObserverNodeOwnerScope implements r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM {
    public final /* synthetic */ List IconCompatParcelizer;
    public final /* synthetic */ Value.RemoteActionCompatParcelizer write;

    @Override // o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM
    public final Object invoke(Object obj) {
        NodeCoordinatorCompanionPointerInputSource1 nodeCoordinatorCompanionPointerInputSource1 = (NodeCoordinatorCompanionPointerInputSource1) obj;
        nodeCoordinatorCompanionPointerInputSource1.getClass();
        List list = this.IconCompatParcelizer;
        ArrayList arrayList = new ArrayList(list.size());
        Iterator it = list.iterator();
        boolean z = false;
        while (it.hasNext()) {
            getBringIntoViewOLwlOKw getbringintoviewolwlokw = (getBringIntoViewOLwlOKw) ((r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) it.next()).invoke(nodeCoordinatorCompanionPointerInputSource1);
            if (getbringintoviewolwlokw.RemoteActionCompatParcelizer()) {
                return getBringIntoViewOLwlOKwannotations.serializer;
            }
            Value valueIconCompatParcelizer = getbringintoviewolwlokw.IconCompatParcelizer();
            Value.RemoteActionCompatParcelizer valueTypeCase = valueIconCompatParcelizer != null ? valueIconCompatParcelizer.getValueTypeCase() : null;
            int i = valueTypeCase == null ? -1 : OnPositionedDispatcherCompanion.read[valueTypeCase.ordinal()];
            if (i == -1 || i == 1) {
                z = true;
            } else {
                if (valueTypeCase != this.write) {
                    return getBringIntoViewOLwlOKwannotations.serializer;
                }
                Value valueIconCompatParcelizer2 = getbringintoviewolwlokw.IconCompatParcelizer();
                valueIconCompatParcelizer2.getClass();
                arrayList.add(valueIconCompatParcelizer2.getStringValue());
            }
        }
        if (z) {
            return getBringIntoViewOLwlOKw.IconCompatParcelizer;
        }
        try {
            getDrawOLwlOKwannotations getdrawolwlokwannotations = getBringIntoViewOLwlOKw.read;
            StringBuilder sb = new StringBuilder();
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                sb.append((String) it2.next());
            }
            return new getDrawOLwlOKwannotations(NodeCoordinatorCompaniononCommitAffectingLayer1.write(sb.toString()));
        } catch (Exception unused) {
            return getBringIntoViewOLwlOKwannotations.serializer;
        }
    }

    public ObserverNodeOwnerScope(List list, Value.RemoteActionCompatParcelizer remoteActionCompatParcelizer) {
        this.IconCompatParcelizer = list;
        this.write = remoteActionCompatParcelizer;
    }
}
