package o;

import com.google.firestore.v1.Value;

/* JADX INFO: loaded from: classes2.dex */
public final class getOnRemeasuredOLwlOKw implements r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM {
    public final /* synthetic */ Value.RemoteActionCompatParcelizer RemoteActionCompatParcelizer;
    public final /* synthetic */ r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM read;
    public final /* synthetic */ Value.RemoteActionCompatParcelizer serializer;
    public final /* synthetic */ r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM write;

    @Override // o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM
    public final Object invoke(Object obj) {
        Value valueIconCompatParcelizer;
        Value valueIconCompatParcelizer2;
        NodeCoordinatorCompanionPointerInputSource1 nodeCoordinatorCompanionPointerInputSource1 = (NodeCoordinatorCompanionPointerInputSource1) obj;
        nodeCoordinatorCompanionPointerInputSource1.getClass();
        getBringIntoViewOLwlOKw getbringintoviewolwlokw = (getBringIntoViewOLwlOKw) this.read.invoke(nodeCoordinatorCompanionPointerInputSource1);
        if (getbringintoviewolwlokw.RemoteActionCompatParcelizer()) {
            return getBringIntoViewOLwlOKwannotations.serializer;
        }
        getBringIntoViewOLwlOKw getbringintoviewolwlokw2 = (getBringIntoViewOLwlOKw) this.write.invoke(nodeCoordinatorCompanionPointerInputSource1);
        if (getbringintoviewolwlokw2.RemoteActionCompatParcelizer()) {
            return getBringIntoViewOLwlOKwannotations.serializer;
        }
        Value valueIconCompatParcelizer3 = getbringintoviewolwlokw.IconCompatParcelizer();
        InspectableModifier inspectableModifierSerializer = null;
        Value.RemoteActionCompatParcelizer valueTypeCase = valueIconCompatParcelizer3 != null ? valueIconCompatParcelizer3.getValueTypeCase() : null;
        int i = valueTypeCase == null ? -1 : ObserverNodeOwnerScopeCompanionOnObserveReadsChanged1.read[valueTypeCase.ordinal()];
        if (i == -1 || i == 1) {
            valueIconCompatParcelizer = null;
        } else {
            if (valueTypeCase != this.serializer) {
                return getBringIntoViewOLwlOKwannotations.serializer;
            }
            valueIconCompatParcelizer = getbringintoviewolwlokw.IconCompatParcelizer();
        }
        Value valueIconCompatParcelizer4 = getbringintoviewolwlokw2.IconCompatParcelizer();
        Value.RemoteActionCompatParcelizer valueTypeCase2 = valueIconCompatParcelizer4 != null ? valueIconCompatParcelizer4.getValueTypeCase() : null;
        int i2 = valueTypeCase2 == null ? -1 : ObserverNodeOwnerScopeCompanionOnObserveReadsChanged1.read[valueTypeCase2.ordinal()];
        if (i2 == -1 || i2 == 1) {
            valueIconCompatParcelizer2 = null;
        } else {
            if (valueTypeCase2 != this.RemoteActionCompatParcelizer) {
                return getBringIntoViewOLwlOKwannotations.serializer;
            }
            valueIconCompatParcelizer2 = getbringintoviewolwlokw2.IconCompatParcelizer();
        }
        if (valueIconCompatParcelizer == null || valueIconCompatParcelizer2 == null) {
            return getBringIntoViewOLwlOKw.IconCompatParcelizer;
        }
        String stringValue = valueIconCompatParcelizer.getStringValue();
        String stringValue2 = valueIconCompatParcelizer2.getStringValue();
        stringValue.getClass();
        stringValue2.getClass();
        try {
            inspectableModifierSerializer = InspectableModifier.serializer(stringValue2);
        } catch (Exception unused) {
        }
        if (inspectableModifierSerializer == null) {
            return getBringIntoViewOLwlOKwannotations.serializer;
        }
        getDrawOLwlOKwannotations getdrawolwlokwannotations = getBringIntoViewOLwlOKw.read;
        return getDrawOLwlOKw.serializer(inspectableModifierSerializer.RemoteActionCompatParcelizer(stringValue));
    }

    public getOnRemeasuredOLwlOKw(r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm, r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm2, Value.RemoteActionCompatParcelizer remoteActionCompatParcelizer, Value.RemoteActionCompatParcelizer remoteActionCompatParcelizer2) {
        this.read = r8lambdaunavo3sxub_pc9xroryotnrlvsm;
        this.write = r8lambdaunavo3sxub_pc9xroryotnrlvsm2;
        this.serializer = remoteActionCompatParcelizer;
        this.RemoteActionCompatParcelizer = remoteActionCompatParcelizer2;
    }
}
