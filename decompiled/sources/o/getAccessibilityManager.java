package o;

import android.database.Cursor;
import androidx.work.RxWorker$1$$ExternalSyntheticLambda0;
import com.google.android.gms.location.DeviceOrientationRequest;
import com.google.android.material.textfield.DropdownMenuEndIconDelegate$$ExternalSyntheticLambda5;
import com.google.firebase.firestore.model.SnapshotVersion;
import com.google.firebase.firestore.remote.RemoteSerializer;
import com.google.firestore.v1.ListenRequest;
import com.google.firestore.v1.StructuredPipeline;
import com.google.firestore.v1.Target;
import com.google.mlkit.vision.face.internal.zzm;
import com.google.protobuf.Int32Value;
import com.google.protobuf.Timestamp;
import com.sentiance.core.model.events.I$b;
import io.grpc.Status;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.HashMap;

/* JADX INFO: loaded from: classes2.dex */
public final class getAccessibilityManager {
    public androidx.lifecycle.BlockRunner MediaBrowserCompatMediaItem;
    public final PinnableContainerKtLocalPinnableContainer1 MediaMetadataCompat;
    public final getRootForTest MediaSessionCompatQueueItem;
    public final getRetainedValuesStore RatingCompat;
    public final visitNodesaLcG6gQ RemoteActionCompatParcelizer;
    public final zzm read;
    public final I$b serializer;
    public boolean write = false;
    public final HashMap IconCompatParcelizer = new HashMap();
    public final ArrayDeque MediaDescriptionCompat = new ArrayDeque();

    public final void serializer() {
        this.write = false;
        getRootForTest getrootfortest = this.MediaSessionCompatQueueItem;
        if (getrootfortest.IconCompatParcelizer()) {
            getrootfortest.write(decrementKeepScreenOnCount.Initial, Status.RatingCompat);
        }
        getRetainedValuesStore getretainedvaluesstore = this.RatingCompat;
        if (getretainedvaluesstore.IconCompatParcelizer()) {
            getretainedvaluesstore.write(decrementKeepScreenOnCount.Initial, Status.RatingCompat);
        }
        ArrayDeque arrayDeque = this.MediaDescriptionCompat;
        if (!arrayDeque.isEmpty()) {
            onEndApplyChanges.read("RemoteStore", "Stopping write stream with %d pending writes", Integer.valueOf(arrayDeque.size()));
            arrayDeque.clear();
        }
        this.MediaBrowserCompatMediaItem = null;
        this.read.serializer(accessgetDrawBlockCanvasp.UNKNOWN);
        getretainedvaluesstore.write();
        getrootfortest.write();
        write();
    }

    public final void write() {
        this.write = true;
        getClipMetadata getclipmetadata = (getClipMetadata) ((androidx.recyclerview.widget.ChildHelper) this.serializer.serializer).MediaSessionCompatQueueItem;
        getRetainedValuesStore getretainedvaluesstore = this.RatingCompat;
        getretainedvaluesstore.getClass();
        getclipmetadata.getClass();
        getretainedvaluesstore.ResultReceiver = getclipmetadata;
        if (RemoteActionCompatParcelizer()) {
            MediaSessionCompatQueueItem();
        } else {
            this.read.serializer(accessgetDrawBlockCanvasp.UNKNOWN);
        }
        read();
    }

    public final void IconCompatParcelizer(int i) {
        this.MediaBrowserCompatMediaItem.read(i).serializer++;
        getRootForTest getrootfortest = this.MediaSessionCompatQueueItem;
        getRectManager.RemoteActionCompatParcelizer(getrootfortest.serializer(), "Unwatching targets requires an open stream", new Object[0]);
        addExtraDataToAccessibilityNodeInfo addextradatatoaccessibilitynodeinfoNewBuilder = ListenRequest.newBuilder();
        String str = getrootfortest.PlaybackStateCompat.read;
        addextradatatoaccessibilitynodeinfoNewBuilder.RemoteActionCompatParcelizer();
        ((ListenRequest) addextradatatoaccessibilitynodeinfoNewBuilder.RemoteActionCompatParcelizer).setDatabase(str);
        addextradatatoaccessibilitynodeinfoNewBuilder.RemoteActionCompatParcelizer();
        ((ListenRequest) addextradatatoaccessibilitynodeinfoNewBuilder.RemoteActionCompatParcelizer).setRemoveTarget(i);
        getrootfortest.read(addextradatatoaccessibilitynodeinfoNewBuilder.serializer());
    }

    public final void RemoteActionCompatParcelizer(setLastShapeui setlastshapeui) {
        String str;
        this.MediaBrowserCompatMediaItem.read(setlastshapeui.MediaSessionCompatQueueItem).serializer++;
        if (!setlastshapeui.write.serializer() || setlastshapeui.RatingCompat.compareTo(SnapshotVersion.IconCompatParcelizer) > 0) {
            setlastshapeui = new setLastShapeui(setlastshapeui.MediaBrowserCompatMediaItem, setlastshapeui.MediaSessionCompatQueueItem, setlastshapeui.read, setlastshapeui.IconCompatParcelizer, setlastshapeui.RatingCompat, setlastshapeui.RemoteActionCompatParcelizer, setlastshapeui.write, Integer.valueOf(this.MediaMetadataCompat.write(setlastshapeui.MediaSessionCompatQueueItem).RemoteActionCompatParcelizer.RemoteActionCompatParcelizer()));
        }
        getRootForTest getrootfortest = this.MediaSessionCompatQueueItem;
        getRectManager.RemoteActionCompatParcelizer(getrootfortest.serializer(), "Watching queries requires an open stream", new Object[0]);
        addExtraDataToAccessibilityNodeInfo addextradatatoaccessibilitynodeinfoNewBuilder = ListenRequest.newBuilder();
        RemoteSerializer remoteSerializer = getrootfortest.PlaybackStateCompat;
        String str2 = remoteSerializer.read;
        addextradatatoaccessibilitynodeinfoNewBuilder.RemoteActionCompatParcelizer();
        ((ListenRequest) addextradatatoaccessibilitynodeinfoNewBuilder.RemoteActionCompatParcelizer).setDatabase(str2);
        AndroidComposeViewStartDragAndDropN androidComposeViewStartDragAndDropNNewBuilder = Target.newBuilder();
        hitNearFh5PU_I hitnearfh5pu_i = setlastshapeui.MediaBrowserCompatMediaItem;
        Integer num = setlastshapeui.serializer;
        SnapshotVersion snapshotVersion = setlastshapeui.RatingCompat;
        getClipMetadata getclipmetadata = setlastshapeui.write;
        hitnearfh5pu_i.getClass();
        if (hitnearfh5pu_i instanceof hasNodeH91voCI) {
            AndroidComposeViewTranslationCallback androidComposeViewTranslationCallbackNewBuilder = Target.PipelineQueryTarget.newBuilder();
            StructuredPipeline structuredPipelineRemoteActionCompatParcelizer = ((hasNodeH91voCI) hitnearfh5pu_i).IconCompatParcelizer.RemoteActionCompatParcelizer();
            androidComposeViewTranslationCallbackNewBuilder.RemoteActionCompatParcelizer();
            ((Target.PipelineQueryTarget) androidComposeViewTranslationCallbackNewBuilder.RemoteActionCompatParcelizer).setStructuredPipeline(structuredPipelineRemoteActionCompatParcelizer);
            androidComposeViewStartDragAndDropNNewBuilder.RemoteActionCompatParcelizer();
            ((Target) androidComposeViewStartDragAndDropNNewBuilder.RemoteActionCompatParcelizer).setPipelineQuery((Target.PipelineQueryTarget) androidComposeViewTranslationCallbackNewBuilder.serializer());
        } else {
            fromParentRect fromparentrect = ((getSnapshotObserver) hitnearfh5pu_i).serializer;
            if (fromparentrect.serializer()) {
                onHideTranslation onhidetranslationNewBuilder = Target.DocumentsTarget.newBuilder();
                String str3 = RemoteSerializer.read(remoteSerializer.IconCompatParcelizer, fromparentrect.MediaSessionCompatQueueItem);
                onhidetranslationNewBuilder.RemoteActionCompatParcelizer();
                ((Target.DocumentsTarget) onhidetranslationNewBuilder.RemoteActionCompatParcelizer).addDocuments(str3);
                Target.DocumentsTarget documentsTarget = (Target.DocumentsTarget) onhidetranslationNewBuilder.serializer();
                androidComposeViewStartDragAndDropNNewBuilder.RemoteActionCompatParcelizer();
                ((Target) androidComposeViewStartDragAndDropNNewBuilder.RemoteActionCompatParcelizer).setDocuments(documentsTarget);
            } else {
                Target.QueryTarget queryTargetSerializer = remoteSerializer.serializer(fromparentrect);
                androidComposeViewStartDragAndDropNNewBuilder.RemoteActionCompatParcelizer();
                ((Target) androidComposeViewStartDragAndDropNNewBuilder.RemoteActionCompatParcelizer).setQuery(queryTargetSerializer);
            }
        }
        int i = setlastshapeui.MediaSessionCompatQueueItem;
        androidComposeViewStartDragAndDropNNewBuilder.RemoteActionCompatParcelizer();
        ((Target) androidComposeViewStartDragAndDropNNewBuilder.RemoteActionCompatParcelizer).setTargetId(i);
        if (!getclipmetadata.serializer() || snapshotVersion.compareTo(SnapshotVersion.IconCompatParcelizer) <= 0) {
            androidComposeViewStartDragAndDropNNewBuilder.RemoteActionCompatParcelizer();
            ((Target) androidComposeViewStartDragAndDropNNewBuilder.RemoteActionCompatParcelizer).setResumeToken(getclipmetadata);
        } else {
            Timestamp timestampWrite = RemoteSerializer.write(snapshotVersion.read);
            androidComposeViewStartDragAndDropNNewBuilder.RemoteActionCompatParcelizer();
            ((Target) androidComposeViewStartDragAndDropNNewBuilder.RemoteActionCompatParcelizer).setReadTime(timestampWrite);
        }
        if (num != null && (!getclipmetadata.serializer() || snapshotVersion.compareTo(SnapshotVersion.IconCompatParcelizer) > 0)) {
            CompositionLocalsKtLocalUriHandler1 compositionLocalsKtLocalUriHandler1NewBuilder = Int32Value.newBuilder();
            int iIntValue = num.intValue();
            compositionLocalsKtLocalUriHandler1NewBuilder.RemoteActionCompatParcelizer();
            ((Int32Value) compositionLocalsKtLocalUriHandler1NewBuilder.RemoteActionCompatParcelizer).setValue(iIntValue);
            androidComposeViewStartDragAndDropNNewBuilder.RemoteActionCompatParcelizer();
            ((Target) androidComposeViewStartDragAndDropNNewBuilder.RemoteActionCompatParcelizer).setExpectedCount((Int32Value) compositionLocalsKtLocalUriHandler1NewBuilder.serializer());
        }
        Target target = (Target) androidComposeViewStartDragAndDropNNewBuilder.serializer();
        addextradatatoaccessibilitynodeinfoNewBuilder.RemoteActionCompatParcelizer();
        ((ListenRequest) addextradatatoaccessibilitynodeinfoNewBuilder.RemoteActionCompatParcelizer).setAddTarget(target);
        getWasLayerBlockInvokedui getwaslayerblockinvokedui = setlastshapeui.IconCompatParcelizer;
        int i2 = onRequestMeasuredefault.read[getwaslayerblockinvokedui.ordinal()];
        HashMap map = null;
        if (i2 == 1) {
            str = null;
        } else if (i2 == 2) {
            str = "existence-filter-mismatch";
        } else if (i2 == 3) {
            str = "existence-filter-mismatch-bloom";
        } else {
            if (i2 != 4) {
                getRectManager.write("Unrecognized query purpose: %s", getwaslayerblockinvokedui);
                throw null;
            }
            str = "limbo-document";
        }
        if (str != null) {
            map = new HashMap(1);
            map.put("goog-listen-tags", str);
        }
        if (map != null) {
            addextradatatoaccessibilitynodeinfoNewBuilder.RemoteActionCompatParcelizer();
            ((ListenRequest) addextradatatoaccessibilitynodeinfoNewBuilder.RemoteActionCompatParcelizer).getMutableLabelsMap().putAll(map);
        }
        getrootfortest.read(addextradatatoaccessibilitynodeinfoNewBuilder.serializer());
    }

    public final void read() {
        getRetainedValuesStore getretainedvaluesstore;
        NodeCoordinatorupdateLayerParameters1 nodeCoordinatorupdateLayerParameters1RemoteActionCompatParcelizer;
        ArrayDeque arrayDeque = this.MediaDescriptionCompat;
        int i = arrayDeque.isEmpty() ? -1 : ((NodeCoordinatorupdateLayerParameters1) arrayDeque.getLast()).RemoteActionCompatParcelizer;
        while (true) {
            boolean z = this.write;
            getretainedvaluesstore = this.RatingCompat;
            if (!z || arrayDeque.size() >= 10) {
                break;
            }
            androidx.recyclerview.widget.ChildHelper childHelper = (androidx.recyclerview.widget.ChildHelper) this.serializer.serializer;
            com.huawei.wisesecurity.ucs_credential.x xVar = ((headH91voCI) childHelper.serializer).read("SELECT batch_id, SUBSTR(mutations, 1, ?) FROM mutations WHERE uid = ? AND batch_id >= ? ORDER BY batch_id ASC LIMIT 1");
            xVar.IconCompatParcelizer(1000000, (String) childHelper.read, Integer.valueOf(i + 1));
            Cursor cursorIconCompatParcelizer = xVar.IconCompatParcelizer();
            try {
                if (cursorIconCompatParcelizer.moveToFirst()) {
                    nodeCoordinatorupdateLayerParameters1RemoteActionCompatParcelizer = childHelper.RemoteActionCompatParcelizer(cursorIconCompatParcelizer.getInt(0), cursorIconCompatParcelizer.getBlob(1));
                    cursorIconCompatParcelizer.close();
                } else {
                    cursorIconCompatParcelizer.close();
                    nodeCoordinatorupdateLayerParameters1RemoteActionCompatParcelizer = null;
                }
                if (nodeCoordinatorupdateLayerParameters1RemoteActionCompatParcelizer == null) {
                    if (arrayDeque.size() != 0 || !getretainedvaluesstore.serializer() || getretainedvaluesstore.RatingCompat != null) {
                        break;
                        break;
                        break;
                    } else {
                        getretainedvaluesstore.RatingCompat = getretainedvaluesstore.MediaSessionCompatResultReceiverWrapper.serializer(getretainedvaluesstore.MediaMetadataCompat, 60000L, getretainedvaluesstore.MediaDescriptionCompat);
                        break;
                    }
                }
                getRectManager.RemoteActionCompatParcelizer(this.write && arrayDeque.size() < 10, "addToWritePipeline called when pipeline is full", new Object[0]);
                arrayDeque.add(nodeCoordinatorupdateLayerParameters1RemoteActionCompatParcelizer);
                if (getretainedvaluesstore.serializer() && getretainedvaluesstore.PlaybackStateCompat) {
                    getretainedvaluesstore.RemoteActionCompatParcelizer(nodeCoordinatorupdateLayerParameters1RemoteActionCompatParcelizer.serializer);
                }
                i = nodeCoordinatorupdateLayerParameters1RemoteActionCompatParcelizer.RemoteActionCompatParcelizer;
            } catch (Throwable th) {
                if (cursorIconCompatParcelizer != null) {
                    try {
                        cursorIconCompatParcelizer.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                }
                throw th;
            }
        }
        if (IconCompatParcelizer()) {
            getRectManager.RemoteActionCompatParcelizer(IconCompatParcelizer(), "startWriteStream() called when shouldStartWriteStream() is false.", new Object[0]);
            getretainedvaluesstore.RemoteActionCompatParcelizer();
        }
    }

    public final void write(setLastShapeui setlastshapeui) {
        Integer numValueOf = Integer.valueOf(setlastshapeui.MediaSessionCompatQueueItem);
        HashMap map = this.IconCompatParcelizer;
        if (map.containsKey(numValueOf)) {
            return;
        }
        map.put(numValueOf, setlastshapeui);
        if (RemoteActionCompatParcelizer()) {
            MediaSessionCompatQueueItem();
        } else if (this.MediaSessionCompatQueueItem.serializer()) {
            RemoteActionCompatParcelizer(setlastshapeui);
        }
    }

    public getAccessibilityManager(visitNodesaLcG6gQ visitnodesalcg6gq, PinnableContainerKtLocalPinnableContainer1 pinnableContainerKtLocalPinnableContainer1, I$b i$b, updateDisplayList updatedisplaylist, getTextInputService gettextinputservice, com.huawei.agconnect.config.impl.m mVar) {
        this.RemoteActionCompatParcelizer = visitnodesalcg6gq;
        this.MediaMetadataCompat = pinnableContainerKtLocalPinnableContainer1;
        this.serializer = i$b;
        DropdownMenuEndIconDelegate$$ExternalSyntheticLambda5 dropdownMenuEndIconDelegate$$ExternalSyntheticLambda5 = new DropdownMenuEndIconDelegate$$ExternalSyntheticLambda5(16, pinnableContainerKtLocalPinnableContainer1);
        zzm zzmVar = new zzm();
        zzmVar.serializer = gettextinputservice;
        zzmVar.RatingCompat = dropdownMenuEndIconDelegate$$ExternalSyntheticLambda5;
        zzmVar.IconCompatParcelizer = accessgetDrawBlockCanvasp.UNKNOWN;
        zzmVar.RemoteActionCompatParcelizer = true;
        this.read = zzmVar;
        decrementSensitiveComponentCount decrementsensitivecomponentcount = new decrementSensitiveComponentCount(this);
        updatedisplaylist.getClass();
        this.MediaSessionCompatQueueItem = new getRootForTest(updatedisplaylist.IconCompatParcelizer, updatedisplaylist.serializer, updatedisplaylist.read, decrementsensitivecomponentcount);
        this.RatingCompat = new getRetainedValuesStore(updatedisplaylist.IconCompatParcelizer, updatedisplaylist.serializer, updatedisplaylist.read, new dispatchOnScrollChangedk4lQ0M(this));
        createLayer createlayer = new createLayer(this, 0, gettextinputservice);
        synchronized (((ArrayList) mVar.read)) {
            ((ArrayList) mVar.read).add(createlayer);
        }
    }

    public final boolean IconCompatParcelizer() {
        return (!this.write || this.RatingCompat.IconCompatParcelizer() || this.MediaDescriptionCompat.isEmpty()) ? false : true;
    }

    public final boolean RemoteActionCompatParcelizer() {
        return (!this.write || this.MediaSessionCompatQueueItem.IconCompatParcelizer() || this.IconCompatParcelizer.isEmpty()) ? false : true;
    }

    public final void serializer(int i) {
        HashMap map = this.IconCompatParcelizer;
        getRectManager.RemoteActionCompatParcelizer(((setLastShapeui) map.remove(Integer.valueOf(i))) != null, "stopListening called on target no currently watched: %d", Integer.valueOf(i));
        getRootForTest getrootfortest = this.MediaSessionCompatQueueItem;
        if (getrootfortest.serializer()) {
            IconCompatParcelizer(i);
        }
        if (map.isEmpty()) {
            if (getrootfortest.serializer()) {
                if (getrootfortest.serializer() && getrootfortest.RatingCompat == null) {
                    getrootfortest.RatingCompat = getrootfortest.MediaSessionCompatResultReceiverWrapper.serializer(getrootfortest.MediaMetadataCompat, 60000L, getrootfortest.MediaDescriptionCompat);
                    return;
                }
                return;
            }
            if (this.write) {
                this.read.serializer(accessgetDrawBlockCanvasp.UNKNOWN);
            }
        }
    }

    public final void MediaSessionCompatQueueItem() {
        getRectManager.RemoteActionCompatParcelizer(RemoteActionCompatParcelizer(), "startWatchStream() called when shouldStartWatchStream() is false.", new Object[0]);
        androidx.lifecycle.BlockRunner blockRunner = new androidx.lifecycle.BlockRunner();
        blockRunner.serializer = new HashMap();
        blockRunner.RatingCompat = new HashMap();
        blockRunner.write = new HashMap();
        blockRunner.RemoteActionCompatParcelizer = new HashMap();
        blockRunner.IconCompatParcelizer = this.RemoteActionCompatParcelizer;
        blockRunner.read = this;
        this.MediaBrowserCompatMediaItem = blockRunner;
        this.MediaSessionCompatQueueItem.RemoteActionCompatParcelizer();
        zzm zzmVar = this.read;
        if (zzmVar.write == 0) {
            zzmVar.read(accessgetDrawBlockCanvasp.UNKNOWN);
            getRectManager.RemoteActionCompatParcelizer(((com.huawei.wisesecurity.ucs_credential.x) zzmVar.read) == null, "onlineStateTimer shouldn't be started yet", new Object[0]);
            zzmVar.read = ((getTextInputService) zzmVar.serializer).serializer(incrementSensitiveComponentCount.ONLINE_STATE_TIMEOUT, DeviceOrientationRequest.OUTPUT_PERIOD_MEDIUM, new RxWorker$1$$ExternalSyntheticLambda0(23, zzmVar));
        }
    }
}
