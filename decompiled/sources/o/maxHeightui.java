package o;

import com.google.firestore.v1.Value;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class maxHeightui extends specifiesCanFocusProperty {
    public final autoInvalidateInsertedNode RemoteActionCompatParcelizer;

    @Override // o.specifiesCanFocusProperty
    public final resumeWebviewIfNecessarylambda0 args$com_google_firebase_firebase_firestore(toContentCaptureSession tocontentcapturesession) {
        return onContentCardClicked.IconCompatParcelizer((Object[]) new Value[]{this.RemoteActionCompatParcelizer.serializer(tocontentcapturesession)});
    }

    public final int hashCode() {
        return this.MediaSessionCompatQueueItem.hashCode() + (this.RemoteActionCompatParcelizer.hashCode() * 31);
    }

    @Override // o.specifiesCanFocusProperty
    public final String write() {
        return this.serializer + '(' + this.RemoteActionCompatParcelizer.RemoteActionCompatParcelizer() + ')';
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof maxHeightui)) {
            return false;
        }
        maxHeightui maxheightui = (maxHeightui) obj;
        if (!this.RemoteActionCompatParcelizer.equals(maxheightui.RemoteActionCompatParcelizer)) {
            return false;
        }
        return ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.MediaSessionCompatQueueItem, maxheightui.MediaSessionCompatQueueItem}, getCieXyz.write())).booleanValue();
    }

    @Override // o.specifiesCanFocusProperty
    public final List write(PinnableContainerKtLocalPinnableContainer1 pinnableContainerKtLocalPinnableContainer1, List list) {
        list.getClass();
        r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsmRemoteActionCompatParcelizer = this.RemoteActionCompatParcelizer.RemoteActionCompatParcelizer(pinnableContainerKtLocalPinnableContainer1);
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            Value valueIconCompatParcelizer = ((getBringIntoViewOLwlOKw) r8lambdaunavo3sxub_pc9xroryotnrlvsmRemoteActionCompatParcelizer.invoke((NodeCoordinatorCompanionPointerInputSource1) obj)).IconCompatParcelizer();
            if (valueIconCompatParcelizer != null && valueIconCompatParcelizer.getBooleanValue()) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public maxHeightui(autoInvalidateInsertedNode autoinvalidateinsertednode, getIncludeSelfInTraversalH91voCI getincludeselfintraversalh91voci) {
        super("where", getincludeselfintraversalh91voci);
        getincludeselfintraversalh91voci.getClass();
        this.RemoteActionCompatParcelizer = autoinvalidateinsertednode;
    }
}
