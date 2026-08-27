package o;

import bo.app.hg$$ExternalSyntheticLambda5;
import com.braze.BrazeUser$$ExternalSyntheticLambda28;
import com.google.firebase.firestore.remote.RemoteSerializer;
import com.google.firestore.v1.Pipeline;
import com.google.firestore.v1.StructuredPipeline;
import com.google.firestore.v1.Value;
import com.huawei.hms.support.hianalytics.HiAnalyticsConstant;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class tailH91voCIui {
    public final ArrayList IconCompatParcelizer;
    public final toContentCaptureSession RemoteActionCompatParcelizer;
    public final setSupportCompoundDrawablesTintList read;
    public final isAdapterPositionOnScreen serializer = new isAdapterPositionOnScreen(new BrazeUser$$ExternalSyntheticLambda28(15, this));
    public final RemoteSerializer write;

    public final List IconCompatParcelizer() {
        return (List) this.serializer.MediaSessionCompatResultReceiverWrapper();
    }

    public final int hashCode() {
        return this.IconCompatParcelizer.hashCode() + (this.write.IconCompatParcelizer.hashCode() * 31);
    }

    public tailH91voCIui(RemoteSerializer remoteSerializer, toContentCaptureSession tocontentcapturesession, ArrayList arrayList, setSupportCompoundDrawablesTintList setsupportcompounddrawablestintlist) {
        this.write = remoteSerializer;
        this.RemoteActionCompatParcelizer = tocontentcapturesession;
        this.IconCompatParcelizer = arrayList;
        this.read = setsupportcompounddrawablestintlist;
    }

    public final List IconCompatParcelizer(List list) {
        PinnableContainerKtLocalPinnableContainer1 pinnableContainerKtLocalPinnableContainer1 = new PinnableContainerKtLocalPinnableContainer1(23, this);
        Iterator it = IconCompatParcelizer().iterator();
        while (it.hasNext()) {
            list = ((specifiesCanFocusProperty) it.next()).write(pinnableContainerKtLocalPinnableContainer1, list);
        }
        return list;
    }

    public final StructuredPipeline RemoteActionCompatParcelizer() {
        accesssetTraversalValues accesssettraversalvaluesNewBuilder = StructuredPipeline.newBuilder();
        getFromIndex getfromindexNewBuilder = Pipeline.newBuilder();
        List<specifiesCanFocusProperty> listIconCompatParcelizer = IconCompatParcelizer();
        ArrayList arrayList = new ArrayList(accessgetInstancedelegatecp.write(listIconCompatParcelizer, 10));
        for (specifiesCanFocusProperty specifiescanfocusproperty : listIconCompatParcelizer) {
            specifiescanfocusproperty.getClass();
            AndroidComposeViewAccessibilityDelegateCompatcurrentSemanticsNodes1 androidComposeViewAccessibilityDelegateCompatcurrentSemanticsNodes1NewBuilder = Pipeline.Stage.newBuilder();
            String str = specifiescanfocusproperty.serializer;
            androidComposeViewAccessibilityDelegateCompatcurrentSemanticsNodes1NewBuilder.RemoteActionCompatParcelizer();
            ((Pipeline.Stage) androidComposeViewAccessibilityDelegateCompatcurrentSemanticsNodes1NewBuilder.RemoteActionCompatParcelizer).setName(str);
            for (Value value : specifiescanfocusproperty.args$com_google_firebase_firebase_firestore(this.RemoteActionCompatParcelizer)) {
                androidComposeViewAccessibilityDelegateCompatcurrentSemanticsNodes1NewBuilder.RemoteActionCompatParcelizer();
                ((Pipeline.Stage) androidComposeViewAccessibilityDelegateCompatcurrentSemanticsNodes1NewBuilder.RemoteActionCompatParcelizer).addArgs(value);
            }
            getIncludeSelfInTraversalH91voCI getincludeselfintraversalh91voci = specifiescanfocusproperty.MediaSessionCompatQueueItem;
            maxWidthui maxwidthui = new maxWidthui(2, 8, AndroidComposeViewAccessibilityDelegateCompatcurrentSemanticsNodes1.class, androidComposeViewAccessibilityDelegateCompatcurrentSemanticsNodes1NewBuilder, "putOptions", "putOptions(Ljava/lang/String;Lcom/google/firestore/v1/Value;)Lcom/google/firestore/v1/Pipeline$Stage$Builder;");
            getincludeselfintraversalh91voci.getClass();
            getIncludeSelfInTraversalH91voCI.read(maxwidthui);
            arrayList.add((Pipeline.Stage) androidComposeViewAccessibilityDelegateCompatcurrentSemanticsNodes1NewBuilder.serializer());
        }
        getfromindexNewBuilder.RemoteActionCompatParcelizer();
        ((Pipeline) getfromindexNewBuilder.RemoteActionCompatParcelizer).addAllStages(arrayList);
        Pipeline pipeline = (Pipeline) getfromindexNewBuilder.serializer();
        accesssettraversalvaluesNewBuilder.RemoteActionCompatParcelizer();
        ((StructuredPipeline) accesssettraversalvaluesNewBuilder.RemoteActionCompatParcelizer).setPipeline(pipeline);
        return (StructuredPipeline) accesssettraversalvaluesNewBuilder.serializer();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tailH91voCIui)) {
            return false;
        }
        tailH91voCIui tailh91vociui = (tailH91voCIui) obj;
        if (!this.write.IconCompatParcelizer.equals(tailh91vociui.write.IconCompatParcelizer)) {
            return false;
        }
        Object[] objArr = {IconCompatParcelizer(), tailh91vociui.IconCompatParcelizer()};
        return ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), objArr, getCieXyz.write())).booleanValue();
    }

    public final String toString() {
        return onContentCardDismissed.IconCompatParcelizer(IconCompatParcelizer(), HiAnalyticsConstant.REPORT_VAL_SEPARATOR, null, null, new hg$$ExternalSyntheticLambda5(12), 30);
    }
}
