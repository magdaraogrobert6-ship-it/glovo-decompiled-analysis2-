package o;

import bo.app.ff$$ExternalSyntheticOutline0;
import com.google.firestore.v1.Value;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class getMask extends specifiesCanFocusProperty {
    public final String IconCompatParcelizer;

    /* JADX WARN: Multi-variable type inference failed */
    @Override // o.specifiesCanFocusProperty
    public final resumeWebviewIfNecessarylambda0 args$com_google_firebase_firebase_firestore(toContentCaptureSession tocontentcapturesession) {
        accesscontainsDescendant accesscontainsdescendantNewBuilder = Value.newBuilder();
        accesscontainsdescendantNewBuilder.RemoteActionCompatParcelizer("");
        return onContentCardClicked.IconCompatParcelizer((Object[]) new Value[]{accesscontainsdescendantNewBuilder.serializer(), NodeCoordinatorCompaniononCommitAffectingLayer1.write(this.IconCompatParcelizer)});
    }

    public final int hashCode() {
        return this.MediaSessionCompatQueueItem.hashCode() + (this.IconCompatParcelizer.hashCode() * 31);
    }

    @Override // o.specifiesCanFocusProperty
    public final String write() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.serializer);
        sb.append('(');
        return ff$$ExternalSyntheticOutline0.m(sb, this.IconCompatParcelizer, ')');
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public getMask(String str, getIncludeSelfInTraversalH91voCI getincludeselfintraversalh91voci) {
        super("collection_group", getincludeselfintraversalh91voci);
        str.getClass();
        getincludeselfintraversalh91voci.getClass();
        this.IconCompatParcelizer = str;
    }

    @Override // o.specifiesCanFocusProperty
    public final List write(PinnableContainerKtLocalPinnableContainer1 pinnableContainerKtLocalPinnableContainer1, List list) {
        list.getClass();
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            NodeCoordinatorCompanionPointerInputSource1 nodeCoordinatorCompanionPointerInputSource1 = (NodeCoordinatorCompanionPointerInputSource1) obj;
            if (nodeCoordinatorCompanionPointerInputSource1.read()) {
                Object[] objArr = {nodeCoordinatorCompanionPointerInputSource1.read.write(), this.IconCompatParcelizer};
                if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), objArr, getCieXyz.write())).booleanValue()) {
                    arrayList.add(obj);
                }
            }
        }
        return arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof getMask)) {
            return false;
        }
        getMask getmask = (getMask) obj;
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.IconCompatParcelizer, getmask.IconCompatParcelizer}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        return ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.MediaSessionCompatQueueItem, getmask.MediaSessionCompatQueueItem}, getCieXyz.write())).booleanValue();
    }
}
