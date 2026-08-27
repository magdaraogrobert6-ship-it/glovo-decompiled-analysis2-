package o;

import com.google.firestore.v1.Value;
import java.util.Comparator;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class NodeMeasuringIntrinsics implements Comparator {
    public final /* synthetic */ PinnableContainerKtLocalPinnableContainer1 IconCompatParcelizer;
    public final /* synthetic */ contains64DMado[] serializer;

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        Value valueIconCompatParcelizer;
        Value valueIconCompatParcelizer2;
        NodeCoordinatorCompanionPointerInputSource1 nodeCoordinatorCompanionPointerInputSource1 = (NodeCoordinatorCompanionPointerInputSource1) obj;
        NodeCoordinatorCompanionPointerInputSource1 nodeCoordinatorCompanionPointerInputSource2 = (NodeCoordinatorCompanionPointerInputSource1) obj2;
        for (contains64DMado contains64dmado : this.serializer) {
            autoInvalidateInsertedNode autoinvalidateinsertednode = contains64dmado.read;
            PinnableContainerKtLocalPinnableContainer1 pinnableContainerKtLocalPinnableContainer1 = this.IconCompatParcelizer;
            r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsmRemoteActionCompatParcelizer = autoinvalidateinsertednode.RemoteActionCompatParcelizer(pinnableContainerKtLocalPinnableContainer1);
            nodeCoordinatorCompanionPointerInputSource1.getClass();
            getBringIntoViewOLwlOKw getbringintoviewolwlokw = (getBringIntoViewOLwlOKw) r8lambdaunavo3sxub_pc9xroryotnrlvsmRemoteActionCompatParcelizer.invoke(nodeCoordinatorCompanionPointerInputSource1);
            r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsmRemoteActionCompatParcelizer2 = autoinvalidateinsertednode.RemoteActionCompatParcelizer(pinnableContainerKtLocalPinnableContainer1);
            nodeCoordinatorCompanionPointerInputSource2.getClass();
            getBringIntoViewOLwlOKw getbringintoviewolwlokw2 = (getBringIntoViewOLwlOKw) r8lambdaunavo3sxub_pc9xroryotnrlvsmRemoteActionCompatParcelizer2.invoke(nodeCoordinatorCompanionPointerInputSource2);
            if (getbringintoviewolwlokw.RemoteActionCompatParcelizer() || getbringintoviewolwlokw.write()) {
                valueIconCompatParcelizer = NodeCoordinatorCompaniononCommitAffectingLayer1.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus;
            } else {
                valueIconCompatParcelizer = getbringintoviewolwlokw.IconCompatParcelizer();
                valueIconCompatParcelizer.getClass();
            }
            if (getbringintoviewolwlokw2.RemoteActionCompatParcelizer() || getbringintoviewolwlokw2.write()) {
                valueIconCompatParcelizer2 = NodeCoordinatorCompaniononCommitAffectingLayer1.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus;
            } else {
                valueIconCompatParcelizer2 = getbringintoviewolwlokw2.IconCompatParcelizer();
                valueIconCompatParcelizer2.getClass();
            }
            int iRemoteActionCompatParcelizer = NodeCoordinatorCompaniononCommitAffectingLayer1.RemoteActionCompatParcelizer(valueIconCompatParcelizer, valueIconCompatParcelizer2);
            if (iRemoteActionCompatParcelizer != 0) {
                return contains64dmado.IconCompatParcelizer == getInsertedannotations.ASCENDING ? iRemoteActionCompatParcelizer : -iRemoteActionCompatParcelizer;
            }
        }
        return 0;
    }

    public /* synthetic */ NodeMeasuringIntrinsics(contains64DMado[] contains64dmadoArr, PinnableContainerKtLocalPinnableContainer1 pinnableContainerKtLocalPinnableContainer1) {
        this.serializer = contains64dmadoArr;
        this.IconCompatParcelizer = pinnableContainerKtLocalPinnableContainer1;
    }
}
