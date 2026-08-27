package o;

import com.google.firestore.v1.Value;

/* JADX INFO: loaded from: classes2.dex */
public final class NodeMeasuringIntrinsicsIntrinsicWidthHeight implements r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM {
    public final /* synthetic */ r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM IconCompatParcelizer;
    public final /* synthetic */ Value.RemoteActionCompatParcelizer serializer;
    public final /* synthetic */ Value.RemoteActionCompatParcelizer write;

    @Override // o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM
    public final Object invoke(Object obj) {
        NodeCoordinatorCompanionPointerInputSource1 nodeCoordinatorCompanionPointerInputSource1 = (NodeCoordinatorCompanionPointerInputSource1) obj;
        nodeCoordinatorCompanionPointerInputSource1.getClass();
        getBringIntoViewOLwlOKw getbringintoviewolwlokw = (getBringIntoViewOLwlOKw) this.IconCompatParcelizer.invoke(nodeCoordinatorCompanionPointerInputSource1);
        if (getbringintoviewolwlokw.RemoteActionCompatParcelizer()) {
            return getBringIntoViewOLwlOKwannotations.serializer;
        }
        Value valueIconCompatParcelizer = getbringintoviewolwlokw.IconCompatParcelizer();
        Value.RemoteActionCompatParcelizer valueTypeCase = valueIconCompatParcelizer != null ? valueIconCompatParcelizer.getValueTypeCase() : null;
        int i = -1;
        int i2 = valueTypeCase == null ? -1 : onRootNodePositioned.IconCompatParcelizer[valueTypeCase.ordinal()];
        if (i2 == -1 || i2 == 1) {
            return getBringIntoViewOLwlOKw.IconCompatParcelizer;
        }
        if (valueTypeCase == this.write) {
            try {
                long integerValue = valueIconCompatParcelizer.getIntegerValue();
                getDrawOLwlOKwannotations getdrawolwlokwannotations = getBringIntoViewOLwlOKw.read;
                return getDrawOLwlOKw.RemoteActionCompatParcelizer(integerValue);
            } catch (Exception unused) {
                return getBringIntoViewOLwlOKwannotations.serializer;
            }
        }
        if (valueTypeCase != this.serializer) {
            return getBringIntoViewOLwlOKwannotations.serializer;
        }
        try {
            double doubleValue = valueIconCompatParcelizer.getDoubleValue();
            getDrawOLwlOKwannotations getdrawolwlokwannotations2 = getBringIntoViewOLwlOKw.read;
            if (!Double.isInfinite(doubleValue) && !Double.isNaN(doubleValue)) {
                double d = doubleValue % 1.0d;
                double d2 = doubleValue - d;
                if (Math.abs(d) >= 0.5d) {
                    if (doubleValue >= 0.0d) {
                        i = 1;
                    }
                    doubleValue = ((double) i) + d2;
                } else {
                    doubleValue = d2;
                }
            }
            return getDrawOLwlOKw.write(doubleValue);
        } catch (Exception unused2) {
            return getBringIntoViewOLwlOKwannotations.serializer;
        }
    }

    public NodeMeasuringIntrinsicsIntrinsicWidthHeight(r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm, Value.RemoteActionCompatParcelizer remoteActionCompatParcelizer, Value.RemoteActionCompatParcelizer remoteActionCompatParcelizer2) {
        this.IconCompatParcelizer = r8lambdaunavo3sxub_pc9xroryotnrlvsm;
        this.write = remoteActionCompatParcelizer;
        this.serializer = remoteActionCompatParcelizer2;
    }
}
