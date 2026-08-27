package o;

import bo.app.w4$$ExternalSyntheticLambda0;
import com.google.firestore.v1.WriteRequest;
import com.sentiance.core.model.events.I$b;
import com.sentiance.core.model.events.i$c;
import io.grpc.Status;
import java.util.ArrayDeque;

/* JADX INFO: loaded from: classes2.dex */
public final class dispatchOnScrollChangedk4lQ0M implements getAutofill {
    public final /* synthetic */ getAccessibilityManager IconCompatParcelizer;

    @Override // o.getAutofill
    public final void read() {
        getRetainedValuesStore getretainedvaluesstore = this.IconCompatParcelizer.RatingCompat;
        getRectManager.RemoteActionCompatParcelizer(getretainedvaluesstore.serializer(), "Writing handshake requires an opened stream", new Object[0]);
        getRectManager.RemoteActionCompatParcelizer(!getretainedvaluesstore.PlaybackStateCompat, "Handshake already completed", new Object[0]);
        preTransformJiSxe2E pretransformjisxe2eNewBuilder = WriteRequest.newBuilder();
        String str = getretainedvaluesstore.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus.read;
        pretransformjisxe2eNewBuilder.RemoteActionCompatParcelizer();
        ((WriteRequest) pretransformjisxe2eNewBuilder.RemoteActionCompatParcelizer).setDatabase(str);
        getretainedvaluesstore.read(pretransformjisxe2eNewBuilder.serializer());
    }

    @Override // o.getAutofill
    public final void read(Status status) {
        getAccessibilityManager getaccessibilitymanager = this.IconCompatParcelizer;
        getRetainedValuesStore getretainedvaluesstore = getaccessibilitymanager.RatingCompat;
        ArrayDeque arrayDeque = getaccessibilitymanager.MediaDescriptionCompat;
        if (status.IconCompatParcelizer()) {
            getRectManager.RemoteActionCompatParcelizer(!getaccessibilitymanager.IconCompatParcelizer(), "Write stream was stopped gracefully while still needed.", new Object[0]);
        }
        if (!status.IconCompatParcelizer() && !arrayDeque.isEmpty()) {
            if (getretainedvaluesstore.PlaybackStateCompat) {
                getRectManager.RemoteActionCompatParcelizer(!status.IconCompatParcelizer(), "Handling write error with status OK.", new Object[0]);
                if (updateDisplayList.serializer(status) && !status.PlaybackStateCompat.equals(invokeMethodQuietly.ABORTED)) {
                    NodeCoordinatorupdateLayerParameters1 nodeCoordinatorupdateLayerParameters1 = (NodeCoordinatorupdateLayerParameters1) arrayDeque.poll();
                    getretainedvaluesstore.write();
                    PinnableContainerKtLocalPinnableContainer1 pinnableContainerKtLocalPinnableContainer1 = getaccessibilitymanager.MediaMetadataCompat;
                    int i = nodeCoordinatorupdateLayerParameters1.RemoteActionCompatParcelizer;
                    ancestorToLocalS_NoaFU ancestortolocals_noafuSerializer = ((i$c) pinnableContainerKtLocalPinnableContainer1.serializer).serializer();
                    ancestortolocals_noafuSerializer.write("handleRejectedWrite");
                    I$b i$b = ancestortolocals_noafuSerializer.MediaSessionCompatQueueItem;
                    accessswap accessswapVar = (accessswap) ((getMinimumTouchTargetSizeNHjbRc) i$b.IconCompatParcelizer).write("Reject batch", new getLayer(i, i$b));
                    if (!accessswapVar.serializer()) {
                        ancestorToLocalS_NoaFU.write(status, "Write failed at %s", ((visitNodes) accessswapVar.write()).RemoteActionCompatParcelizer);
                    }
                    ancestortolocals_noafuSerializer.serializer(i, status);
                    ancestortolocals_noafuSerializer.RemoteActionCompatParcelizer(i);
                    ancestortolocals_noafuSerializer.serializer(accessswapVar, (com.airbnb.lottie.parser.DropShadowEffect) null);
                    getaccessibilitymanager.read();
                }
            } else {
                getRectManager.RemoteActionCompatParcelizer(!status.IconCompatParcelizer(), "Handling write error with status OK.", new Object[0]);
                if (updateDisplayList.serializer(status)) {
                    onEndApplyChanges.read("RemoteStore", "RemoteStore error before completed handshake; resetting stream token %s: %s", com.google.firebase.firestore.util.Util.RemoteActionCompatParcelizer(getretainedvaluesstore.ResultReceiver), status);
                    ClipboardExtensions_androidKt clipboardExtensions_androidKt = getRetainedValuesStore.PlaybackStateCompatCustomAction;
                    clipboardExtensions_androidKt.getClass();
                    getretainedvaluesstore.ResultReceiver = clipboardExtensions_androidKt;
                    I$b i$b2 = getaccessibilitymanager.serializer;
                    ((getMinimumTouchTargetSizeNHjbRc) i$b2.IconCompatParcelizer).read(new w4$$ExternalSyntheticLambda0(i$b2, 16, clipboardExtensions_androidKt), "Set stream token");
                }
            }
        }
        if (getaccessibilitymanager.IconCompatParcelizer()) {
            getRectManager.RemoteActionCompatParcelizer(getaccessibilitymanager.IconCompatParcelizer(), "startWriteStream() called when shouldStartWriteStream() is false.", new Object[0]);
            getretainedvaluesstore.RemoteActionCompatParcelizer();
        }
    }

    public dispatchOnScrollChangedk4lQ0M(getAccessibilityManager getaccessibilitymanager) {
        this.IconCompatParcelizer = getaccessibilitymanager;
    }
}
