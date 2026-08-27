package o;

import bo.app.af$$ExternalSyntheticOutline0;
import com.google.firestore.v1.Value;
import com.mapbox.maps.MapboxMap;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class getRemovedannotations extends specifiesCanFocusProperty {
    public final int write;

    @Override // o.specifiesCanFocusProperty
    public final resumeWebviewIfNecessarylambda0 args$com_google_firebase_firebase_firestore(toContentCaptureSession tocontentcapturesession) {
        NodeCoordinatorCompaniononCommitAffectingLayer1 nodeCoordinatorCompaniononCommitAffectingLayer1 = NodeCoordinatorCompaniononCommitAffectingLayer1.RemoteActionCompatParcelizer;
        accesscontainsDescendant accesscontainsdescendantNewBuilder = Value.newBuilder();
        long j = this.write;
        accesscontainsdescendantNewBuilder.RemoteActionCompatParcelizer();
        ((Value) accesscontainsdescendantNewBuilder.RemoteActionCompatParcelizer).setIntegerValue(j);
        return onContentCardClicked.IconCompatParcelizer((Object[]) new Value[]{(Value) accesscontainsdescendantNewBuilder.serializer()});
    }

    @Override // o.specifiesCanFocusProperty
    public final String write() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.serializer);
        sb.append('(');
        return af$$ExternalSyntheticOutline0.m(sb, this.write, ')');
    }

    @Override // o.specifiesCanFocusProperty
    public final List write(PinnableContainerKtLocalPinnableContainer1 pinnableContainerKtLocalPinnableContainer1, List list) {
        list.getClass();
        int i = this.write;
        if (i > 0) {
            return onContentCardDismissed.read(list, i);
        }
        return i < 0 ? onContentCardDismissed.IconCompatParcelizer(i, list) : instance_delegatelambda0.write;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof getRemovedannotations)) {
            return false;
        }
        getRemovedannotations getremovedannotations = (getRemovedannotations) obj;
        if (this.write != getremovedannotations.write) {
            return false;
        }
        return ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.MediaSessionCompatQueueItem, getremovedannotations.MediaSessionCompatQueueItem}, getCieXyz.write())).booleanValue();
    }

    public final int hashCode() {
        return this.MediaSessionCompatQueueItem.hashCode() + (this.write * 31);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public getRemovedannotations(int i, getIncludeSelfInTraversalH91voCI getincludeselfintraversalh91voci) {
        super(MapboxMap.QFE_LIMIT, getincludeselfintraversalh91voci);
        getincludeselfintraversalh91voci.getClass();
        this.write = i;
    }
}
