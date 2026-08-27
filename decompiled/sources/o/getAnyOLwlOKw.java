package o;

import com.google.firestore.v1.Value;

/* JADX INFO: loaded from: classes2.dex */
public final class getAnyOLwlOKw implements r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM {
    public final /* synthetic */ Value.RemoteActionCompatParcelizer RemoteActionCompatParcelizer;
    public final /* synthetic */ Value.RemoteActionCompatParcelizer read;
    public final /* synthetic */ r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM write;

    @Override // o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM
    public final Object invoke(Object obj) {
        NodeCoordinatorCompanionPointerInputSource1 nodeCoordinatorCompanionPointerInputSource1 = (NodeCoordinatorCompanionPointerInputSource1) obj;
        nodeCoordinatorCompanionPointerInputSource1.getClass();
        getBringIntoViewOLwlOKw getbringintoviewolwlokw = (getBringIntoViewOLwlOKw) this.write.invoke(nodeCoordinatorCompanionPointerInputSource1);
        if (getbringintoviewolwlokw.RemoteActionCompatParcelizer()) {
            return getBringIntoViewOLwlOKwannotations.serializer;
        }
        Value valueIconCompatParcelizer = getbringintoviewolwlokw.IconCompatParcelizer();
        Value.RemoteActionCompatParcelizer valueTypeCase = valueIconCompatParcelizer != null ? valueIconCompatParcelizer.getValueTypeCase() : null;
        int i = valueTypeCase == null ? -1 : onRootNodePositioned.IconCompatParcelizer[valueTypeCase.ordinal()];
        if (i == -1 || i == 1) {
            return getBringIntoViewOLwlOKw.IconCompatParcelizer;
        }
        if (valueTypeCase == this.RemoteActionCompatParcelizer) {
            try {
                long integerValue = valueIconCompatParcelizer.getIntegerValue();
                getDrawOLwlOKwannotations getdrawolwlokwannotations = getBringIntoViewOLwlOKw.read;
                return getDrawOLwlOKw.RemoteActionCompatParcelizer(integerValue);
            } catch (Exception unused) {
                return getBringIntoViewOLwlOKwannotations.serializer;
            }
        }
        if (valueTypeCase != this.read) {
            return getBringIntoViewOLwlOKwannotations.serializer;
        }
        try {
            double doubleValue = valueIconCompatParcelizer.getDoubleValue();
            getDrawOLwlOKwannotations getdrawolwlokwannotations2 = getBringIntoViewOLwlOKw.read;
            return getDrawOLwlOKw.write(Math.floor(doubleValue));
        } catch (Exception unused2) {
            return getBringIntoViewOLwlOKwannotations.serializer;
        }
    }

    public getAnyOLwlOKw(r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm, Value.RemoteActionCompatParcelizer remoteActionCompatParcelizer, Value.RemoteActionCompatParcelizer remoteActionCompatParcelizer2) {
        this.write = r8lambdaunavo3sxub_pc9xroryotnrlvsm;
        this.RemoteActionCompatParcelizer = remoteActionCompatParcelizer;
        this.read = remoteActionCompatParcelizer2;
    }
}
