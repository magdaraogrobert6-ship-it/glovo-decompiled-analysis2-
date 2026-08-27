package o;

import com.google.firestore.v1.Value;

/* JADX INFO: loaded from: classes2.dex */
public final class NodeMeasuringIntrinsicsApproachMeasureBlock implements r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM {
    public final /* synthetic */ Value.RemoteActionCompatParcelizer RemoteActionCompatParcelizer;
    public final /* synthetic */ r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM serializer;
    public final /* synthetic */ Value.RemoteActionCompatParcelizer write;

    @Override // o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM
    public final Object invoke(Object obj) {
        Object objWrite;
        Object objWrite2;
        NodeCoordinatorCompanionPointerInputSource1 nodeCoordinatorCompanionPointerInputSource1 = (NodeCoordinatorCompanionPointerInputSource1) obj;
        nodeCoordinatorCompanionPointerInputSource1.getClass();
        getBringIntoViewOLwlOKw getbringintoviewolwlokw = (getBringIntoViewOLwlOKw) this.serializer.invoke(nodeCoordinatorCompanionPointerInputSource1);
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
                double integerValue = valueIconCompatParcelizer.getIntegerValue();
                if (integerValue < 0.0d) {
                    objWrite = getBringIntoViewOLwlOKwannotations.serializer;
                } else {
                    getDrawOLwlOKwannotations getdrawolwlokwannotations = getBringIntoViewOLwlOKw.read;
                    objWrite = getDrawOLwlOKw.write(Math.sqrt(integerValue));
                }
                return objWrite;
            } catch (Exception unused) {
                return getBringIntoViewOLwlOKwannotations.serializer;
            }
        }
        if (valueTypeCase != this.write) {
            return getBringIntoViewOLwlOKwannotations.serializer;
        }
        try {
            double doubleValue = valueIconCompatParcelizer.getDoubleValue();
            if (doubleValue < 0.0d) {
                objWrite2 = getBringIntoViewOLwlOKwannotations.serializer;
            } else {
                getDrawOLwlOKwannotations getdrawolwlokwannotations2 = getBringIntoViewOLwlOKw.read;
                objWrite2 = getDrawOLwlOKw.write(Math.sqrt(doubleValue));
            }
            return objWrite2;
        } catch (Exception unused2) {
            return getBringIntoViewOLwlOKwannotations.serializer;
        }
    }

    public NodeMeasuringIntrinsicsApproachMeasureBlock(r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm, Value.RemoteActionCompatParcelizer remoteActionCompatParcelizer, Value.RemoteActionCompatParcelizer remoteActionCompatParcelizer2) {
        this.serializer = r8lambdaunavo3sxub_pc9xroryotnrlvsm;
        this.RemoteActionCompatParcelizer = remoteActionCompatParcelizer;
        this.write = remoteActionCompatParcelizer2;
    }
}
