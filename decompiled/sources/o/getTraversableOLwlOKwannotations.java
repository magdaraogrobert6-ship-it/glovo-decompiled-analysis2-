package o;

import com.google.firestore.v1.Value;

/* JADX INFO: loaded from: classes2.dex */
public final class getTraversableOLwlOKwannotations implements r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM {
    public final /* synthetic */ r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM IconCompatParcelizer;
    public final /* synthetic */ Value.RemoteActionCompatParcelizer RemoteActionCompatParcelizer;
    public final /* synthetic */ Value.RemoteActionCompatParcelizer read;

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
        int i = valueTypeCase == null ? -1 : onRootNodePositioned.IconCompatParcelizer[valueTypeCase.ordinal()];
        if (i == -1 || i == 1) {
            return getBringIntoViewOLwlOKw.IconCompatParcelizer;
        }
        if (valueTypeCase == this.RemoteActionCompatParcelizer) {
            try {
                getClipMetadata bytesValue = valueIconCompatParcelizer.getBytesValue();
                getDrawOLwlOKwannotations getdrawolwlokwannotations = getBringIntoViewOLwlOKw.read;
                long jRatingCompat = bytesValue.RatingCompat();
                NodeCoordinatorCompaniononCommitAffectingLayer1 nodeCoordinatorCompaniononCommitAffectingLayer1 = NodeCoordinatorCompaniononCommitAffectingLayer1.RemoteActionCompatParcelizer;
                accesscontainsDescendant accesscontainsdescendantNewBuilder = Value.newBuilder();
                accesscontainsdescendantNewBuilder.RemoteActionCompatParcelizer();
                ((Value) accesscontainsdescendantNewBuilder.RemoteActionCompatParcelizer).setIntegerValue(jRatingCompat);
                return new getDrawOLwlOKwannotations((Value) accesscontainsdescendantNewBuilder.serializer());
            } catch (Exception unused) {
                return getBringIntoViewOLwlOKwannotations.serializer;
            }
        }
        if (valueTypeCase != this.read) {
            return getBringIntoViewOLwlOKwannotations.serializer;
        }
        try {
            String stringValue = valueIconCompatParcelizer.getStringValue();
            getDrawOLwlOKwannotations getdrawolwlokwannotations2 = getBringIntoViewOLwlOKw.read;
            byte[] bytes = stringValue.getBytes(ensureSubscribedToInAppMessageEvents.write);
            bytes.getClass();
            long length = bytes.length;
            NodeCoordinatorCompaniononCommitAffectingLayer1 nodeCoordinatorCompaniononCommitAffectingLayer2 = NodeCoordinatorCompaniononCommitAffectingLayer1.RemoteActionCompatParcelizer;
            accesscontainsDescendant accesscontainsdescendantNewBuilder2 = Value.newBuilder();
            accesscontainsdescendantNewBuilder2.RemoteActionCompatParcelizer();
            ((Value) accesscontainsdescendantNewBuilder2.RemoteActionCompatParcelizer).setIntegerValue(length);
            return new getDrawOLwlOKwannotations((Value) accesscontainsdescendantNewBuilder2.serializer());
        } catch (Exception unused2) {
            return getBringIntoViewOLwlOKwannotations.serializer;
        }
    }

    public getTraversableOLwlOKwannotations(r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm, Value.RemoteActionCompatParcelizer remoteActionCompatParcelizer, Value.RemoteActionCompatParcelizer remoteActionCompatParcelizer2) {
        this.IconCompatParcelizer = r8lambdaunavo3sxub_pc9xroryotnrlvsm;
        this.RemoteActionCompatParcelizer = remoteActionCompatParcelizer;
        this.read = remoteActionCompatParcelizer2;
    }
}
