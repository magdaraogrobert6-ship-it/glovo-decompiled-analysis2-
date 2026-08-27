package o;

import androidx.room.RoomDatabase$createConnectionManager$2;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import com.google.firebase.firestore.model.Values$Enterprise;
import com.google.firestore.v1.Value;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class getAnyOLwlOKwannotations implements r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM {
    public final /* synthetic */ List write;

    @Override // o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM
    public final Object invoke(Object obj) {
        List<Value> valuesList;
        List<Value> valuesList2;
        NodeCoordinatorCompanionPointerInputSource1 nodeCoordinatorCompanionPointerInputSource1 = (NodeCoordinatorCompanionPointerInputSource1) obj;
        nodeCoordinatorCompanionPointerInputSource1.getClass();
        List list = this.write;
        getBringIntoViewOLwlOKw getbringintoviewolwlokw = (getBringIntoViewOLwlOKw) ((r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) list.get(0)).invoke(nodeCoordinatorCompanionPointerInputSource1);
        if (getbringintoviewolwlokw.RemoteActionCompatParcelizer()) {
            return getBringIntoViewOLwlOKwannotations.serializer;
        }
        Value valueIconCompatParcelizer = getbringintoviewolwlokw.IconCompatParcelizer();
        getBringIntoViewOLwlOKw getbringintoviewolwlokw2 = (getBringIntoViewOLwlOKw) ((r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) list.get(1)).invoke(nodeCoordinatorCompanionPointerInputSource1);
        if (getbringintoviewolwlokw2.RemoteActionCompatParcelizer()) {
            return getBringIntoViewOLwlOKwannotations.serializer;
        }
        Value valueIconCompatParcelizer2 = getbringintoviewolwlokw2.IconCompatParcelizer();
        Value.RemoteActionCompatParcelizer valueTypeCase = valueIconCompatParcelizer != null ? valueIconCompatParcelizer.getValueTypeCase() : null;
        int i = valueTypeCase == null ? -1 : getObserverNodeui.IconCompatParcelizer[valueTypeCase.ordinal()];
        if (i == -1 || i == 1) {
            valuesList = null;
        } else {
            if (i != 2) {
                return getBringIntoViewOLwlOKwannotations.serializer;
            }
            valuesList = valueIconCompatParcelizer.getArrayValue().getValuesList();
        }
        Value.RemoteActionCompatParcelizer valueTypeCase2 = valueIconCompatParcelizer2 != null ? valueIconCompatParcelizer2.getValueTypeCase() : null;
        int i2 = valueTypeCase2 == null ? -1 : getObserverNodeui.IconCompatParcelizer[valueTypeCase2.ordinal()];
        if (i2 == -1 || i2 == 1) {
            valuesList2 = null;
        } else {
            if (i2 != 2) {
                return getBringIntoViewOLwlOKwannotations.serializer;
            }
            valuesList2 = valueIconCompatParcelizer2.getArrayValue().getValuesList();
        }
        if (valuesList == null || valuesList2 == null) {
            return getBringIntoViewOLwlOKw.IconCompatParcelizer;
        }
        for (Value value : valuesList) {
            for (Value value2 : valuesList2) {
                RoomDatabase$createConnectionManager$2 roomDatabase$createConnectionManager$2 = Values$Enterprise.IconCompatParcelizer;
                boolean zSerializer = NodeCoordinatorCompaniononCommitAffectingLayer1.serializer(value, value2);
                if (zSerializer) {
                    return getBringIntoViewOLwlOKw.read;
                }
                if (zSerializer) {
                    ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer();
                    return null;
                }
            }
        }
        return getBringIntoViewOLwlOKw.write;
    }

    public getAnyOLwlOKwannotations(List list) {
        this.write = list;
    }
}
