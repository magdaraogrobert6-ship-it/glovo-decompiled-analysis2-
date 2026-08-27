package o;

import androidx.camera.camera2.interop.CaptureRequestOptions$Builder$$ExternalSyntheticLambda0;
import bo.app.w4$$ExternalSyntheticLambda0;
import com.google.firebase.firestore.model.SnapshotVersion;
import com.google.firebase.firestore.remote.RemoteSerializer;
import com.google.firestore.v1.FirestoreGrpc;
import com.google.firestore.v1.Write;
import com.google.firestore.v1.WriteRequest;
import com.google.firestore.v1.WriteResponse;
import com.google.firestore.v1.WriteResult;
import com.google.protobuf.Timestamp;
import com.sentiance.core.model.events.I$b;
import com.sentiance.core.model.events.i$c;
import io.grpc.Status;
import io.sentry.SentryClient;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class getRetainedValuesStore extends reuseLayer {
    public static final ClipboardExtensions_androidKt PlaybackStateCompatCustomAction = getClipMetadata.serializer;
    public boolean PlaybackStateCompat;
    public getClipMetadata ResultReceiver;
    public final RemoteSerializer r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus;

    @Override // o.reuseLayer
    public final void RemoteActionCompatParcelizer() {
        this.PlaybackStateCompat = false;
        super.RemoteActionCompatParcelizer();
    }

    @Override // o.reuseLayer
    public final void read(Object obj) {
        this.ResultReceiver = ((WriteResponse) obj).getStreamToken();
        this.PlaybackStateCompat = true;
        getAccessibilityManager getaccessibilitymanager = ((dispatchOnScrollChangedk4lQ0M) this.MediaSessionCompatQueueItem).IconCompatParcelizer;
        I$b i$b = getaccessibilitymanager.serializer;
        getRetainedValuesStore getretainedvaluesstore = getaccessibilitymanager.RatingCompat;
        ((getMinimumTouchTargetSizeNHjbRc) i$b.IconCompatParcelizer).read(new w4$$ExternalSyntheticLambda0(i$b, 16, getretainedvaluesstore.ResultReceiver), "Set stream token");
        Iterator it = getaccessibilitymanager.MediaDescriptionCompat.iterator();
        while (it.hasNext()) {
            getretainedvaluesstore.RemoteActionCompatParcelizer(((NodeCoordinatorupdateLayerParameters1) it.next()).serializer);
        }
    }

    @Override // o.reuseLayer
    public final void serializer(Object obj) {
        WriteResponse writeResponse = (WriteResponse) obj;
        this.ResultReceiver = writeResponse.getStreamToken();
        this.read.RemoteActionCompatParcelizer = 0L;
        Timestamp commitTime = writeResponse.getCommitTime();
        this.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus.getClass();
        SnapshotVersion snapshotVersionWrite = RemoteSerializer.write(commitTime);
        int writeResultsCount = writeResponse.getWriteResultsCount();
        ArrayList arrayList = new ArrayList(writeResultsCount);
        for (int i = 0; i < writeResultsCount; i++) {
            WriteResult writeResults = writeResponse.getWriteResults(i);
            SnapshotVersion snapshotVersionWrite2 = RemoteSerializer.write(writeResults.getUpdateTime());
            if (SnapshotVersion.IconCompatParcelizer.equals(snapshotVersionWrite2)) {
                snapshotVersionWrite2 = snapshotVersionWrite;
            }
            int transformResultsCount = writeResults.getTransformResultsCount();
            ArrayList arrayList2 = new ArrayList(transformResultsCount);
            for (int i2 = 0; i2 < transformResultsCount; i2++) {
                arrayList2.add(writeResults.getTransformResults(i2));
            }
            arrayList.add(new orH91voCI(snapshotVersionWrite2, arrayList2));
        }
        getAccessibilityManager getaccessibilitymanager = ((dispatchOnScrollChangedk4lQ0M) this.MediaSessionCompatQueueItem).IconCompatParcelizer;
        NodeCoordinatorupdateLayerParameters1 nodeCoordinatorupdateLayerParameters1 = (NodeCoordinatorupdateLayerParameters1) getaccessibilitymanager.MediaDescriptionCompat.poll();
        getClipMetadata getclipmetadata = getaccessibilitymanager.RatingCompat.ResultReceiver;
        ArrayList arrayList3 = nodeCoordinatorupdateLayerParameters1.serializer;
        getRectManager.RemoteActionCompatParcelizer(arrayList3.size() == arrayList.size(), "Mutations sent %d must equal results received %d", Integer.valueOf(arrayList3.size()), Integer.valueOf(arrayList.size()));
        accessswap accessswapVarRemoteActionCompatParcelizer = withPositionTranslation.read;
        for (int i3 = 0; i3 < arrayList3.size(); i3++) {
            accessswapVarRemoteActionCompatParcelizer = accessswapVarRemoteActionCompatParcelizer.RemoteActionCompatParcelizer(((NodeCoordinatorKt) arrayList3.get(i3)).read, ((orH91voCI) arrayList.get(i3)).write);
        }
        com.airbnb.lottie.parser.DropShadowEffect dropShadowEffect = new com.airbnb.lottie.parser.DropShadowEffect(nodeCoordinatorupdateLayerParameters1, snapshotVersionWrite, arrayList, getclipmetadata, accessswapVarRemoteActionCompatParcelizer, 13);
        ancestorToLocalS_NoaFU ancestortolocals_noafuSerializer = ((i$c) getaccessibilitymanager.MediaMetadataCompat.serializer).serializer();
        ancestortolocals_noafuSerializer.write("handleSuccessfulWrite");
        NodeCoordinatorupdateLayerParameters1 nodeCoordinatorupdateLayerParameters2 = (NodeCoordinatorupdateLayerParameters1) dropShadowEffect.read;
        ancestortolocals_noafuSerializer.serializer(nodeCoordinatorupdateLayerParameters2.RemoteActionCompatParcelizer, (Status) null);
        ancestortolocals_noafuSerializer.RemoteActionCompatParcelizer(nodeCoordinatorupdateLayerParameters2.RemoteActionCompatParcelizer);
        I$b i$b = ancestortolocals_noafuSerializer.MediaSessionCompatQueueItem;
        ancestortolocals_noafuSerializer.serializer((accessswap) ((getMinimumTouchTargetSizeNHjbRc) i$b.IconCompatParcelizer).write("Acknowledge batch", new CaptureRequestOptions$Builder$$ExternalSyntheticLambda0(i$b, 18, dropShadowEffect)), (com.airbnb.lottie.parser.DropShadowEffect) null);
        getaccessibilitymanager.read();
    }

    public getRetainedValuesStore(calculateLocalPositionMKHz9U calculatelocalpositionmkhz9u, getTextInputService gettextinputservice, RemoteSerializer remoteSerializer, dispatchOnScrollChangedk4lQ0M dispatchonscrollchangedk4lq0m) {
        SentryClient sentryClient = FirestoreGrpc.serializer;
        if (sentryClient == null) {
            synchronized (FirestoreGrpc.class) {
                sentryClient = FirestoreGrpc.serializer;
                if (sentryClient == null) {
                    constructObjectQuietlydefault constructobjectquietlydefault = constructObjectQuietlydefault.BIDI_STREAMING;
                    String str = SentryClient.read("google.firestore.v1.Firestore", "Write");
                    WriteRequest defaultInstance = WriteRequest.getDefaultInstance();
                    getLocalProvidableScrollCaptureInProgress getlocalprovidablescrollcaptureinprogress = setPushNotificationSubscriptionTypelambda1.RemoteActionCompatParcelizer;
                    sentryClient = new SentryClient(constructobjectquietlydefault, str, new monthFromInt(defaultInstance), new monthFromInt(WriteResponse.getDefaultInstance()), true);
                    FirestoreGrpc.serializer = sentryClient;
                }
            }
        }
        super(calculatelocalpositionmkhz9u, sentryClient, gettextinputservice, incrementSensitiveComponentCount.WRITE_STREAM_CONNECTION_BACKOFF, incrementSensitiveComponentCount.WRITE_STREAM_IDLE, incrementSensitiveComponentCount.HEALTH_CHECK_TIMEOUT, dispatchonscrollchangedk4lq0m);
        this.PlaybackStateCompat = false;
        this.ResultReceiver = PlaybackStateCompatCustomAction;
        this.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus = remoteSerializer;
    }

    @Override // o.reuseLayer
    public final void read() {
        if (this.PlaybackStateCompat) {
            RemoteActionCompatParcelizer(Collections.EMPTY_LIST);
        }
    }

    public final void RemoteActionCompatParcelizer(List list) {
        getRectManager.RemoteActionCompatParcelizer(serializer(), "Writing mutations requires an opened stream", new Object[0]);
        getRectManager.RemoteActionCompatParcelizer(this.PlaybackStateCompat, "Handshake must be complete before writing mutations", new Object[0]);
        preTransformJiSxe2E pretransformjisxe2eNewBuilder = WriteRequest.newBuilder();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Write write = this.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus.read((NodeCoordinatorKt) it.next());
            pretransformjisxe2eNewBuilder.RemoteActionCompatParcelizer();
            ((WriteRequest) pretransformjisxe2eNewBuilder.RemoteActionCompatParcelizer).addWrites(write);
        }
        getClipMetadata getclipmetadata = this.ResultReceiver;
        pretransformjisxe2eNewBuilder.RemoteActionCompatParcelizer();
        ((WriteRequest) pretransformjisxe2eNewBuilder.RemoteActionCompatParcelizer).setStreamToken(getclipmetadata);
        read(pretransformjisxe2eNewBuilder.serializer());
    }
}
