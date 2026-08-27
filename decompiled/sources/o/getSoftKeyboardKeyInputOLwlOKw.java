package o;

import com.google.firestore.v1.Value;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class getSoftKeyboardKeyInputOLwlOKw implements r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM {
    public final /* synthetic */ List RemoteActionCompatParcelizer;
    public final /* synthetic */ Value.RemoteActionCompatParcelizer read;
    public final /* synthetic */ Value.RemoteActionCompatParcelizer serializer;

    @Override // o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM
    public final Object invoke(Object obj) {
        NodeCoordinatorCompanionPointerInputSource1 nodeCoordinatorCompanionPointerInputSource1 = (NodeCoordinatorCompanionPointerInputSource1) obj;
        nodeCoordinatorCompanionPointerInputSource1.getClass();
        List list = this.RemoteActionCompatParcelizer;
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
        int i = valueTypeCase == null ? -1 : ObserverNodeOwnerScopeCompanion.serializer[valueTypeCase.ordinal()];
        if (i == -1 || i == 1) {
            return getBringIntoViewOLwlOKw.IconCompatParcelizer;
        }
        if (valueTypeCase != this.read) {
            return getBringIntoViewOLwlOKwannotations.serializer;
        }
        Value.RemoteActionCompatParcelizer valueTypeCase2 = valueIconCompatParcelizer2 != null ? valueIconCompatParcelizer2.getValueTypeCase() : null;
        int i2 = valueTypeCase2 == null ? -1 : ObserverNodeOwnerScopeCompanion.serializer[valueTypeCase2.ordinal()];
        if (i2 == -1 || i2 == 1) {
            return getBringIntoViewOLwlOKw.IconCompatParcelizer;
        }
        if (valueTypeCase2 != this.serializer) {
            return getBringIntoViewOLwlOKwannotations.serializer;
        }
        try {
            String stringValue = valueIconCompatParcelizer.getStringValue();
            String stringValue2 = valueIconCompatParcelizer2.getStringValue();
            getDrawOLwlOKwannotations getdrawolwlokwannotations = getBringIntoViewOLwlOKw.read;
            return getDrawOLwlOKw.serializer(setCarryoverInAppMessage.RemoteActionCompatParcelizer(stringValue, stringValue2, false));
        } catch (Exception unused) {
            return getBringIntoViewOLwlOKwannotations.serializer;
        }
    }

    public getSoftKeyboardKeyInputOLwlOKw(List list, Value.RemoteActionCompatParcelizer remoteActionCompatParcelizer, Value.RemoteActionCompatParcelizer remoteActionCompatParcelizer2) {
        this.RemoteActionCompatParcelizer = list;
        this.read = remoteActionCompatParcelizer;
        this.serializer = remoteActionCompatParcelizer2;
    }
}
