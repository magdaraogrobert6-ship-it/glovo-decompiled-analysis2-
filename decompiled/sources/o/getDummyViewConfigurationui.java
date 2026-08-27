package o;

import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite;

/* JADX INFO: loaded from: classes2.dex */
public abstract class getDummyViewConfigurationui implements accessnextDrawNode, Cloneable {
    public final GeneratedMessageLite RemoteActionCompatParcelizer;
    public GeneratedMessageLite read;

    public static void write(Object obj, Object obj2) {
        withComposeStackTrace withcomposestacktrace = withComposeStackTrace.write;
        withcomposestacktrace.getClass();
        withcomposestacktrace.RemoteActionCompatParcelizer(obj.getClass()).serializer(obj, obj2);
    }

    public final GeneratedMessageLite MediaDescriptionCompat() {
        boolean zPlaybackStateCompatCustomAction = this.read.PlaybackStateCompatCustomAction();
        GeneratedMessageLite generatedMessageLite = this.read;
        if (!zPlaybackStateCompatCustomAction) {
            return generatedMessageLite;
        }
        generatedMessageLite.getClass();
        withComposeStackTrace withcomposestacktrace = withComposeStackTrace.write;
        withcomposestacktrace.getClass();
        withcomposestacktrace.RemoteActionCompatParcelizer(generatedMessageLite.getClass()).write(generatedMessageLite);
        generatedMessageLite.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus();
        return this.read;
    }

    public final void MediaMetadataCompat() {
        if (this.read.PlaybackStateCompatCustomAction()) {
            return;
        }
        GeneratedMessageLite generatedMessageLiteResultReceiver = this.RemoteActionCompatParcelizer.ResultReceiver();
        write(generatedMessageLiteResultReceiver, this.read);
        this.read = generatedMessageLiteResultReceiver;
    }

    public final getDummyViewConfigurationui RatingCompat() {
        getDummyViewConfigurationui getdummyviewconfigurationuiPlaybackStateCompat = this.RemoteActionCompatParcelizer.PlaybackStateCompat();
        getdummyviewconfigurationuiPlaybackStateCompat.read = MediaDescriptionCompat();
        return getdummyviewconfigurationuiPlaybackStateCompat;
    }

    public getDummyViewConfigurationui(GeneratedMessageLite generatedMessageLite) {
        this.RemoteActionCompatParcelizer = generatedMessageLite;
        if (generatedMessageLite.PlaybackStateCompatCustomAction()) {
            ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer("Default instance must be immutable.");
            throw null;
        }
        this.read = generatedMessageLite.ResultReceiver();
    }

    public final GeneratedMessageLite MediaBrowserCompatMediaItem() {
        GeneratedMessageLite generatedMessageLiteMediaDescriptionCompat = MediaDescriptionCompat();
        generatedMessageLiteMediaDescriptionCompat.getClass();
        if (GeneratedMessageLite.RemoteActionCompatParcelizer(generatedMessageLiteMediaDescriptionCompat, true)) {
            return generatedMessageLiteMediaDescriptionCompat;
        }
        throw new com.google.crypto.tink.shaded.protobuf.UninitializedMessageException();
    }
}
