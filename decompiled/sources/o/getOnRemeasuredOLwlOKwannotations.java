package o;

import com.google.firestore.v1.Value;

/* JADX INFO: loaded from: classes2.dex */
public final class getOnRemeasuredOLwlOKwannotations implements r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM {
    public final /* synthetic */ r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM IconCompatParcelizer;
    public final /* synthetic */ r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM RemoteActionCompatParcelizer;
    public final /* synthetic */ Value.RemoteActionCompatParcelizer read;
    public final /* synthetic */ Value.RemoteActionCompatParcelizer serializer;

    @Override // o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM
    public final Object invoke(Object obj) {
        Value valueIconCompatParcelizer;
        NodeCoordinatorCompanionPointerInputSource1 nodeCoordinatorCompanionPointerInputSource1 = (NodeCoordinatorCompanionPointerInputSource1) obj;
        nodeCoordinatorCompanionPointerInputSource1.getClass();
        getBringIntoViewOLwlOKw getbringintoviewolwlokw = (getBringIntoViewOLwlOKw) this.RemoteActionCompatParcelizer.invoke(nodeCoordinatorCompanionPointerInputSource1);
        if (getbringintoviewolwlokw.RemoteActionCompatParcelizer()) {
            return getBringIntoViewOLwlOKwannotations.serializer;
        }
        getBringIntoViewOLwlOKw getbringintoviewolwlokw2 = (getBringIntoViewOLwlOKw) this.IconCompatParcelizer.invoke(nodeCoordinatorCompanionPointerInputSource1);
        if (getbringintoviewolwlokw2.RemoteActionCompatParcelizer()) {
            return getBringIntoViewOLwlOKwannotations.serializer;
        }
        Value valueIconCompatParcelizer2 = getbringintoviewolwlokw.IconCompatParcelizer();
        Value valueIconCompatParcelizer3 = null;
        Value.RemoteActionCompatParcelizer valueTypeCase = valueIconCompatParcelizer2 != null ? valueIconCompatParcelizer2.getValueTypeCase() : null;
        int i = valueTypeCase == null ? -1 : ObserverNodeOwnerScopeCompanionOnObserveReadsChanged1.read[valueTypeCase.ordinal()];
        if (i == -1 || i == 1) {
            valueIconCompatParcelizer = null;
        } else {
            if (valueTypeCase != this.read) {
                return getBringIntoViewOLwlOKwannotations.serializer;
            }
            valueIconCompatParcelizer = getbringintoviewolwlokw.IconCompatParcelizer();
        }
        Value valueIconCompatParcelizer4 = getbringintoviewolwlokw2.IconCompatParcelizer();
        Value.RemoteActionCompatParcelizer valueTypeCase2 = valueIconCompatParcelizer4 != null ? valueIconCompatParcelizer4.getValueTypeCase() : null;
        int i2 = valueTypeCase2 == null ? -1 : ObserverNodeOwnerScopeCompanionOnObserveReadsChanged1.read[valueTypeCase2.ordinal()];
        if (i2 != -1 && i2 != 1) {
            if (valueTypeCase2 != this.serializer) {
                return getBringIntoViewOLwlOKwannotations.serializer;
            }
            valueIconCompatParcelizer3 = getbringintoviewolwlokw2.IconCompatParcelizer();
        }
        return (valueIconCompatParcelizer == null || valueIconCompatParcelizer3 == null) ? getBringIntoViewOLwlOKw.IconCompatParcelizer : (getBringIntoViewOLwlOKw) getOnPlacedOLwlOKw.write.invoke(valueIconCompatParcelizer.getStringValue(), valueIconCompatParcelizer3.getStringValue());
    }

    public getOnRemeasuredOLwlOKwannotations(r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm, r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm2, Value.RemoteActionCompatParcelizer remoteActionCompatParcelizer, Value.RemoteActionCompatParcelizer remoteActionCompatParcelizer2) {
        this.RemoteActionCompatParcelizer = r8lambdaunavo3sxub_pc9xroryotnrlvsm;
        this.IconCompatParcelizer = r8lambdaunavo3sxub_pc9xroryotnrlvsm2;
        this.read = remoteActionCompatParcelizer;
        this.serializer = remoteActionCompatParcelizer2;
    }
}
