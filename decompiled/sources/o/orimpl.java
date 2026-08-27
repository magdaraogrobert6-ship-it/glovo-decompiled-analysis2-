package o;

import com.google.firebase.firestore.remote.RemoteSerializer;
import com.google.firestore.v1.Value;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class orimpl extends specifiesCanFocusProperty {
    public final shareWithSiblings IconCompatParcelizer;
    public final RemoteSerializer read;

    /* JADX WARN: Multi-variable type inference failed */
    @Override // o.specifiesCanFocusProperty
    public final resumeWebviewIfNecessarylambda0 args$com_google_firebase_firebase_firestore(toContentCaptureSession tocontentcapturesession) {
        accesscontainsDescendant accesscontainsdescendantNewBuilder = Value.newBuilder();
        accesscontainsdescendantNewBuilder.RemoteActionCompatParcelizer("/".concat(this.IconCompatParcelizer.write()));
        return onContentCardClicked.IconCompatParcelizer((Object[]) new Value[]{accesscontainsdescendantNewBuilder.serializer()});
    }

    public final int hashCode() {
        int iHashCode = this.IconCompatParcelizer.hashCode();
        return this.MediaSessionCompatQueueItem.hashCode() + ((this.read.IconCompatParcelizer.hashCode() + (iHashCode * 31)) * 31);
    }

    @Override // o.specifiesCanFocusProperty
    public final String write() {
        return this.serializer + '(' + this.IconCompatParcelizer.write() + ')';
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof orimpl)) {
            return false;
        }
        orimpl orimplVar = (orimpl) obj;
        if (!this.IconCompatParcelizer.equals(orimplVar.IconCompatParcelizer) || !this.read.IconCompatParcelizer.equals(orimplVar.read.IconCompatParcelizer)) {
            return false;
        }
        return ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.MediaSessionCompatQueueItem, orimplVar.MediaSessionCompatQueueItem}, getCieXyz.write())).booleanValue();
    }

    @Override // o.specifiesCanFocusProperty
    public final List write(PinnableContainerKtLocalPinnableContainer1 pinnableContainerKtLocalPinnableContainer1, List list) {
        list.getClass();
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            NodeCoordinatorCompanionPointerInputSource1 nodeCoordinatorCompanionPointerInputSource1 = (NodeCoordinatorCompanionPointerInputSource1) obj;
            if (nodeCoordinatorCompanionPointerInputSource1.read() && ((shareWithSiblings) nodeCoordinatorCompanionPointerInputSource1.read.RemoteActionCompatParcelizer.RemoteActionCompatParcelizer()).equals(this.IconCompatParcelizer)) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public orimpl(shareWithSiblings sharewithsiblings, RemoteSerializer remoteSerializer, getIncludeSelfInTraversalH91voCI getincludeselfintraversalh91voci) {
        super("collection", getincludeselfintraversalh91voci);
        getincludeselfintraversalh91voci.getClass();
        this.IconCompatParcelizer = sharewithsiblings;
        this.read = remoteSerializer;
    }
}
