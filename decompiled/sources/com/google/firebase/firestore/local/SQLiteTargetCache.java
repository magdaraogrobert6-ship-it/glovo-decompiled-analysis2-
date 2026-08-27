package com.google.firebase.firestore.local;

import android.database.Cursor;
import com.google.firebase.Timestamp;
import com.google.firebase.firestore.model.SnapshotVersion;
import com.google.firebase.firestore.proto.Target;
import com.google.firebase.firestore.remote.RemoteSerializer;
import com.google.firestore.v1.StructuredPipeline;
import com.google.protobuf.InvalidProtocolBufferException;
import com.huawei.wisesecurity.ucs_credential.x;
import o.AndroidComposeViewTranslationCallback;
import o.fromParentRect;
import o.getClipMetadata;
import o.getForceMeasureWithLookaheadConstraintsui;
import o.getRectManager;
import o.getSnapshotObserver;
import o.getWasLayerBlockInvokedui;
import o.hasNodeH91voCI;
import o.headH91voCI;
import o.hitNearFh5PU_I;
import o.isFrameRateFromParent;
import o.onHideTranslation;
import o.setLastShapeui;

/* JADX INFO: loaded from: classes2.dex */
public final class SQLiteTargetCache {
    public long IconCompatParcelizer;
    public long MediaMetadataCompat;
    public SnapshotVersion RemoteActionCompatParcelizer = SnapshotVersion.IconCompatParcelizer;
    public int read;
    public final getForceMeasureWithLookaheadConstraintsui serializer;
    public final headH91voCI write;

    public final SnapshotVersion RemoteActionCompatParcelizer() {
        return this.RemoteActionCompatParcelizer;
    }

    public final void RemoteActionCompatParcelizer(setLastShapeui setlastshapeui) {
        int i = setlastshapeui.MediaSessionCompatQueueItem;
        hitNearFh5PU_I hitnearfh5pu_i = setlastshapeui.MediaBrowserCompatMediaItem;
        String strWrite = hitnearfh5pu_i.write();
        SnapshotVersion snapshotVersion = setlastshapeui.RatingCompat;
        Timestamp timestamp = snapshotVersion.read;
        getForceMeasureWithLookaheadConstraintsui getforcemeasurewithlookaheadconstraintsui = this.serializer;
        getforcemeasurewithlookaheadconstraintsui.getClass();
        getWasLayerBlockInvokedui getwaslayerblockinvokedui = getWasLayerBlockInvokedui.LISTEN;
        getWasLayerBlockInvokedui getwaslayerblockinvokedui2 = setlastshapeui.IconCompatParcelizer;
        getRectManager.RemoteActionCompatParcelizer(getwaslayerblockinvokedui.equals(getwaslayerblockinvokedui2), "Only queries with purpose %s may be stored, got %s", getwaslayerblockinvokedui, getwaslayerblockinvokedui2);
        isFrameRateFromParent isframeratefromparentNewBuilder = Target.newBuilder();
        isframeratefromparentNewBuilder.RemoteActionCompatParcelizer();
        ((Target) isframeratefromparentNewBuilder.RemoteActionCompatParcelizer).setTargetId(i);
        long j = setlastshapeui.read;
        isframeratefromparentNewBuilder.RemoteActionCompatParcelizer();
        ((Target) isframeratefromparentNewBuilder.RemoteActionCompatParcelizer).setLastListenSequenceNumber(j);
        RemoteSerializer remoteSerializer = getforcemeasurewithlookaheadconstraintsui.IconCompatParcelizer;
        com.google.protobuf.Timestamp timestampWrite = RemoteSerializer.write(setlastshapeui.RemoteActionCompatParcelizer.read);
        isframeratefromparentNewBuilder.RemoteActionCompatParcelizer();
        ((Target) isframeratefromparentNewBuilder.RemoteActionCompatParcelizer).setLastLimboFreeSnapshotVersion(timestampWrite);
        com.google.protobuf.Timestamp timestampWrite2 = RemoteSerializer.write(snapshotVersion.read);
        isframeratefromparentNewBuilder.RemoteActionCompatParcelizer();
        ((Target) isframeratefromparentNewBuilder.RemoteActionCompatParcelizer).setSnapshotVersion(timestampWrite2);
        getClipMetadata getclipmetadata = setlastshapeui.write;
        isframeratefromparentNewBuilder.RemoteActionCompatParcelizer();
        ((Target) isframeratefromparentNewBuilder.RemoteActionCompatParcelizer).setResumeToken(getclipmetadata);
        hitnearfh5pu_i.getClass();
        if (hitnearfh5pu_i instanceof getSnapshotObserver) {
            fromParentRect fromparentrect = ((getSnapshotObserver) hitnearfh5pu_i).serializer;
            if (fromparentrect.serializer()) {
                onHideTranslation onhidetranslationNewBuilder = com.google.firestore.v1.Target.DocumentsTarget.newBuilder();
                String str = RemoteSerializer.read(remoteSerializer.IconCompatParcelizer, fromparentrect.MediaSessionCompatQueueItem);
                onhidetranslationNewBuilder.RemoteActionCompatParcelizer();
                ((com.google.firestore.v1.Target.DocumentsTarget) onhidetranslationNewBuilder.RemoteActionCompatParcelizer).addDocuments(str);
                com.google.firestore.v1.Target.DocumentsTarget documentsTarget = (com.google.firestore.v1.Target.DocumentsTarget) onhidetranslationNewBuilder.serializer();
                isframeratefromparentNewBuilder.RemoteActionCompatParcelizer();
                ((Target) isframeratefromparentNewBuilder.RemoteActionCompatParcelizer).setDocuments(documentsTarget);
            } else {
                com.google.firestore.v1.Target.QueryTarget queryTargetSerializer = remoteSerializer.serializer(fromparentrect);
                isframeratefromparentNewBuilder.RemoteActionCompatParcelizer();
                ((Target) isframeratefromparentNewBuilder.RemoteActionCompatParcelizer).setQuery(queryTargetSerializer);
            }
        } else {
            AndroidComposeViewTranslationCallback androidComposeViewTranslationCallbackNewBuilder = com.google.firestore.v1.Target.PipelineQueryTarget.newBuilder();
            StructuredPipeline structuredPipelineRemoteActionCompatParcelizer = ((hasNodeH91voCI) hitnearfh5pu_i).IconCompatParcelizer.RemoteActionCompatParcelizer();
            androidComposeViewTranslationCallbackNewBuilder.RemoteActionCompatParcelizer();
            ((com.google.firestore.v1.Target.PipelineQueryTarget) androidComposeViewTranslationCallbackNewBuilder.RemoteActionCompatParcelizer).setStructuredPipeline(structuredPipelineRemoteActionCompatParcelizer);
            isframeratefromparentNewBuilder.RemoteActionCompatParcelizer();
            ((Target) isframeratefromparentNewBuilder.RemoteActionCompatParcelizer).setPipelineQuery((com.google.firestore.v1.Target.PipelineQueryTarget) androidComposeViewTranslationCallbackNewBuilder.serializer());
        }
        Target target = (Target) isframeratefromparentNewBuilder.serializer();
        long j2 = timestamp.IconCompatParcelizer;
        int i2 = timestamp.RemoteActionCompatParcelizer;
        this.write.IconCompatParcelizer("INSERT OR REPLACE INTO targets (target_id, canonical_id, snapshot_version_seconds, snapshot_version_nanos, resume_token, last_listen_sequence_number, target_proto) VALUES (?, ?, ?, ?, ?, ?, ?)", Integer.valueOf(i), strWrite, Long.valueOf(j2), Integer.valueOf(i2), getclipmetadata.MediaDescriptionCompat(), Long.valueOf(j), target.toByteArray());
    }

    public final setLastShapeui read(byte[] bArr) {
        try {
            return this.serializer.write(Target.parseFrom(bArr));
        } catch (InvalidProtocolBufferException e) {
            getRectManager.write("TargetData failed to parse: %s", e);
            throw null;
        }
    }

    public SQLiteTargetCache(headH91voCI headh91voci, getForceMeasureWithLookaheadConstraintsui getforcemeasurewithlookaheadconstraintsui) {
        this.write = headh91voci;
        this.serializer = getforcemeasurewithlookaheadconstraintsui;
    }

    public final void write(setLastShapeui setlastshapeui) {
        boolean z;
        RemoteActionCompatParcelizer(setlastshapeui);
        int i = setlastshapeui.MediaSessionCompatQueueItem;
        if (i > this.read) {
            this.read = i;
            z = true;
        } else {
            z = false;
        }
        long j = setlastshapeui.read;
        if (j > this.IconCompatParcelizer) {
            this.IconCompatParcelizer = j;
        } else if (!z) {
            return;
        }
        IconCompatParcelizer();
    }

    public final setLastShapeui read(hitNearFh5PU_I hitnearfh5pu_i) {
        String strWrite = hitnearfh5pu_i.write();
        x xVar = this.write.read("SELECT target_proto FROM targets WHERE canonical_id = ?");
        xVar.IconCompatParcelizer(strWrite);
        Cursor cursorIconCompatParcelizer = xVar.IconCompatParcelizer();
        setLastShapeui setlastshapeui = null;
        while (cursorIconCompatParcelizer.moveToNext()) {
            try {
                setLastShapeui setlastshapeui2 = read(cursorIconCompatParcelizer.getBlob(0));
                if (hitnearfh5pu_i.equals(setlastshapeui2.MediaBrowserCompatMediaItem)) {
                    setlastshapeui = setlastshapeui2;
                }
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
        cursorIconCompatParcelizer.close();
        return setlastshapeui;
    }

    public final void IconCompatParcelizer() {
        this.write.IconCompatParcelizer("UPDATE target_globals SET highest_target_id = ?, highest_listen_sequence_number = ?, last_remote_snapshot_version_seconds = ?, last_remote_snapshot_version_nanos = ?, target_count = ?", Integer.valueOf(this.read), Long.valueOf(this.IconCompatParcelizer), Long.valueOf(this.RemoteActionCompatParcelizer.read.IconCompatParcelizer), Integer.valueOf(this.RemoteActionCompatParcelizer.read.RemoteActionCompatParcelizer), Long.valueOf(this.MediaMetadataCompat));
    }
}
