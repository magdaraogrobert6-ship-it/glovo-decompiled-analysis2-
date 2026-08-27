package o;

import com.google.firestore.v1.Value;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class getFocusTargetOLwlOKw implements r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM {
    public final /* synthetic */ List serializer;

    @Override // o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM
    public final Object invoke(Object obj) {
        NodeCoordinatorCompanionPointerInputSource1 nodeCoordinatorCompanionPointerInputSource1 = (NodeCoordinatorCompanionPointerInputSource1) obj;
        nodeCoordinatorCompanionPointerInputSource1.getClass();
        List list = this.serializer;
        int size = list.size();
        boolean[] zArr = new boolean[size];
        boolean z = false;
        int i = 0;
        for (Object obj2 : list) {
            if (i < 0) {
                androidx.sqlite.SQLite.serializer();
                throw null;
            }
            getBringIntoViewOLwlOKw getbringintoviewolwlokw = (getBringIntoViewOLwlOKw) ((r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) obj2).invoke(nodeCoordinatorCompanionPointerInputSource1);
            if (getbringintoviewolwlokw.RemoteActionCompatParcelizer()) {
                return getBringIntoViewOLwlOKwannotations.serializer;
            }
            Value valueIconCompatParcelizer = getbringintoviewolwlokw.IconCompatParcelizer();
            Value.RemoteActionCompatParcelizer valueTypeCase = valueIconCompatParcelizer != null ? valueIconCompatParcelizer.getValueTypeCase() : null;
            int i2 = valueTypeCase == null ? -1 : dispatchHierarchy.RemoteActionCompatParcelizer[valueTypeCase.ordinal()];
            if (i2 == -1 || i2 == 1) {
                z = true;
            } else {
                if (i2 != 2) {
                    return getBringIntoViewOLwlOKwannotations.serializer;
                }
                zArr[i] = valueIconCompatParcelizer.getBooleanValue();
            }
            i++;
        }
        if (z) {
            return getBringIntoViewOLwlOKw.IconCompatParcelizer;
        }
        try {
            getDrawOLwlOKwannotations getdrawolwlokwannotations = getBringIntoViewOLwlOKw.read;
            Boolean boolValueOf = Boolean.FALSE;
            for (int i3 = 0; i3 < size; i3++) {
                boolValueOf = Boolean.valueOf(boolValueOf.booleanValue() ^ zArr[i3]);
            }
            return getDrawOLwlOKw.serializer(boolValueOf.booleanValue());
        } catch (Exception unused) {
            return getBringIntoViewOLwlOKwannotations.serializer;
        }
    }

    public getFocusTargetOLwlOKw(List list) {
        this.serializer = list;
    }
}
