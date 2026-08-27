package com.google.firebase.firestore.pipeline;

import bo.app.ff$$ExternalSyntheticOutline0;
import coil3.network.NetworkFetcher;
import com.braze.BrazeUser$$ExternalSyntheticLambda28;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import o.NodeCoordinatorCompanionPointerInputSource1;
import o.NodeCoordinatorCompaniononCommitAffectingLayer1;
import o.PinnableContainerKtLocalPinnableContainer1;
import o.getCieXyz;
import o.getIncludeSelfInTraversalH91voCI;
import o.isAdapterPositionOnScreen;
import o.onContentCardClicked;
import o.onContentCardDismissed;
import o.removeNodeAtDepth;
import o.resumeWebviewIfNecessarylambda0;
import o.shareWithSiblings;
import o.specifiesCanFocusProperty;
import o.toContentCaptureSession;
import o.verifyOrientationStatuslambda3;

/* JADX INFO: loaded from: classes2.dex */
public final class DocumentsSource extends specifiesCanFocusProperty {
    public final isAdapterPositionOnScreen IconCompatParcelizer;
    public final shareWithSiblings[] RemoteActionCompatParcelizer;

    @Override // o.specifiesCanFocusProperty
    public final resumeWebviewIfNecessarylambda0 args$com_google_firebase_firebase_firestore(toContentCaptureSession tocontentcapturesession) {
        return new verifyOrientationStatuslambda3(onContentCardClicked.IconCompatParcelizer((Object[]) this.RemoteActionCompatParcelizer), new NetworkFetcher.AnonymousClass2(1, NodeCoordinatorCompaniononCommitAffectingLayer1.RemoteActionCompatParcelizer, NodeCoordinatorCompaniononCommitAffectingLayer1.class, "encodeValue", "encodeValue(Lcom/google/firebase/firestore/model/ResourcePath;)Lcom/google/firestore/v1/Value;", 0, 7));
    }

    public final int hashCode() {
        return this.MediaSessionCompatQueueItem.hashCode() + (Arrays.hashCode(this.RemoteActionCompatParcelizer) * 31);
    }

    @Override // o.specifiesCanFocusProperty
    public final String write() {
        shareWithSiblings[] sharewithsiblingsArr = this.RemoteActionCompatParcelizer;
        sharewithsiblingsArr.getClass();
        if (sharewithsiblingsArr.length != 0) {
            sharewithsiblingsArr = (Comparable[]) Arrays.copyOf(sharewithsiblingsArr, sharewithsiblingsArr.length);
            if (sharewithsiblingsArr.length > 1) {
                Arrays.sort(sharewithsiblingsArr);
            }
        }
        List listAsList = Arrays.asList(sharewithsiblingsArr);
        listAsList.getClass();
        StringBuilder sb = new StringBuilder();
        sb.append(this.serializer);
        sb.append('(');
        return ff$$ExternalSyntheticOutline0.m(sb, onContentCardDismissed.IconCompatParcelizer(listAsList, ",", null, null, null, 62), ')');
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DocumentsSource(shareWithSiblings[] sharewithsiblingsArr, getIncludeSelfInTraversalH91voCI getincludeselfintraversalh91voci) {
        super("documents", getincludeselfintraversalh91voci);
        sharewithsiblingsArr.getClass();
        getincludeselfintraversalh91voci.getClass();
        this.RemoteActionCompatParcelizer = sharewithsiblingsArr;
        this.IconCompatParcelizer = new isAdapterPositionOnScreen(new BrazeUser$$ExternalSyntheticLambda28(16, this));
    }

    @Override // o.specifiesCanFocusProperty
    public final List write(PinnableContainerKtLocalPinnableContainer1 pinnableContainerKtLocalPinnableContainer1, List list) {
        list.getClass();
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            NodeCoordinatorCompanionPointerInputSource1 nodeCoordinatorCompanionPointerInputSource1 = (NodeCoordinatorCompanionPointerInputSource1) obj;
            if (nodeCoordinatorCompanionPointerInputSource1.read() && ((HashSet) this.IconCompatParcelizer.MediaSessionCompatResultReceiverWrapper()).contains(nodeCoordinatorCompanionPointerInputSource1.read.RemoteActionCompatParcelizer.write())) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DocumentsSource)) {
            return false;
        }
        DocumentsSource documentsSource = (DocumentsSource) obj;
        if (!Arrays.equals(this.RemoteActionCompatParcelizer, documentsSource.RemoteActionCompatParcelizer)) {
            return false;
        }
        return ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.MediaSessionCompatQueueItem, documentsSource.MediaSessionCompatQueueItem}, getCieXyz.write())).booleanValue();
    }
}
