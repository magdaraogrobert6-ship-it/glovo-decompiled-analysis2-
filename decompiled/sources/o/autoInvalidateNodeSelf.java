package o;

import bo.app.ff$$ExternalSyntheticOutline0;
import com.google.firestore.v1.Function;
import com.google.firestore.v1.Value;
import java.util.ArrayList;
import java.util.Arrays;

/* JADX INFO: loaded from: classes2.dex */
public final class autoInvalidateNodeSelf extends autoInvalidateInsertedNode {
    public final getIncludeSelfInTraversalH91voCI IconCompatParcelizer;
    public final String RemoteActionCompatParcelizer;
    public final r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM read;
    public final autoInvalidateInsertedNode[] write;

    @Override // o.autoInvalidateInsertedNode
    public final String RemoteActionCompatParcelizer() {
        autoInvalidateInsertedNode[] autoinvalidateinsertednodeArr = this.write;
        ArrayList arrayList = new ArrayList(autoinvalidateinsertednodeArr.length);
        for (autoInvalidateInsertedNode autoinvalidateinsertednode : autoinvalidateinsertednodeArr) {
            arrayList.add(autoinvalidateinsertednode.RemoteActionCompatParcelizer());
        }
        StringBuilder sb = new StringBuilder("fn(");
        sb.append(this.RemoteActionCompatParcelizer);
        sb.append('[');
        return ff$$ExternalSyntheticOutline0.m(sb, onContentCardDismissed.IconCompatParcelizer(arrayList, ",", null, null, null, 62), "])");
    }

    @Override // o.autoInvalidateInsertedNode
    public final r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM RemoteActionCompatParcelizer(PinnableContainerKtLocalPinnableContainer1 pinnableContainerKtLocalPinnableContainer1) {
        autoInvalidateInsertedNode[] autoinvalidateinsertednodeArr = this.write;
        ArrayList arrayList = new ArrayList(autoinvalidateinsertednodeArr.length);
        for (autoInvalidateInsertedNode autoinvalidateinsertednode : autoinvalidateinsertednodeArr) {
            arrayList.add(autoinvalidateinsertednode.RemoteActionCompatParcelizer(pinnableContainerKtLocalPinnableContainer1));
        }
        return (r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) this.read.invoke(arrayList);
    }

    public final int hashCode() {
        int iHashCode = this.RemoteActionCompatParcelizer.hashCode();
        return this.IconCompatParcelizer.hashCode() + ((Arrays.hashCode(this.write) + (iHashCode * 31)) * 31);
    }

    public autoInvalidateNodeSelf(String str, ArrayList arrayList, getIncludeSelfInTraversalH91voCI getincludeselfintraversalh91voci) {
        str.getClass();
        getincludeselfintraversalh91voci.getClass();
        r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm = (r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) getUpdatedannotations.RemoteActionCompatParcelizer.get(str);
        r8lambdaunavo3sxub_pc9xroryotnrlvsm = r8lambdaunavo3sxub_pc9xroryotnrlvsm == null ? dispatch.write : r8lambdaunavo3sxub_pc9xroryotnrlvsm;
        autoInvalidateInsertedNode[] autoinvalidateinsertednodeArr = (autoInvalidateInsertedNode[]) arrayList.toArray(new autoInvalidateInsertedNode[0]);
        autoinvalidateinsertednodeArr.getClass();
        this.RemoteActionCompatParcelizer = str;
        this.read = r8lambdaunavo3sxub_pc9xroryotnrlvsm;
        this.write = autoinvalidateinsertednodeArr;
        this.IconCompatParcelizer = getincludeselfintraversalh91voci;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof autoInvalidateNodeSelf)) {
            return false;
        }
        autoInvalidateNodeSelf autoinvalidatenodeself = (autoInvalidateNodeSelf) obj;
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.RemoteActionCompatParcelizer, autoinvalidatenodeself.RemoteActionCompatParcelizer}, getCieXyz.write())).booleanValue() || !Arrays.equals(this.write, autoinvalidatenodeself.write)) {
            return false;
        }
        return ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.IconCompatParcelizer, autoinvalidatenodeself.IconCompatParcelizer}, getCieXyz.write())).booleanValue();
    }

    @Override // o.autoInvalidateInsertedNode
    public final Value serializer(toContentCaptureSession tocontentcapturesession) {
        hitTestSemanticsAtui hittestsemanticsatuiNewBuilder = Function.newBuilder();
        hittestsemanticsatuiNewBuilder.RemoteActionCompatParcelizer();
        ((Function) hittestsemanticsatuiNewBuilder.RemoteActionCompatParcelizer).setName(this.RemoteActionCompatParcelizer);
        for (autoInvalidateInsertedNode autoinvalidateinsertednode : this.write) {
            Value valueSerializer = autoinvalidateinsertednode.serializer(tocontentcapturesession);
            hittestsemanticsatuiNewBuilder.RemoteActionCompatParcelizer();
            ((Function) hittestsemanticsatuiNewBuilder.RemoteActionCompatParcelizer).addArgs(valueSerializer);
        }
        autoInvalidateUpdatedNode autoinvalidateupdatednode = new autoInvalidateUpdatedNode(2, hittestsemanticsatuiNewBuilder, hitTestSemanticsAtui.class, "putOptions", "putOptions(Ljava/lang/String;Lcom/google/firestore/v1/Value;)Lcom/google/firestore/v1/Function$Builder;", 8, 0);
        this.IconCompatParcelizer.getClass();
        getIncludeSelfInTraversalH91voCI.read(autoinvalidateupdatednode);
        accesscontainsDescendant accesscontainsdescendantNewBuilder = Value.newBuilder();
        accesscontainsdescendantNewBuilder.RemoteActionCompatParcelizer();
        ((Value) accesscontainsdescendantNewBuilder.RemoteActionCompatParcelizer).setFunctionValue((Function) hittestsemanticsatuiNewBuilder.serializer());
        return (Value) accesscontainsdescendantNewBuilder.serializer();
    }
}
