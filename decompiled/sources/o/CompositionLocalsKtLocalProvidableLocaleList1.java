package o;

import com.google.protobuf.GeneratedMessageLite;

/* JADX INFO: loaded from: classes4.dex */
public abstract class CompositionLocalsKtLocalProvidableLocaleList1 extends CompositionLocalsKtLocalHapticFeedback1 {
    @Override // o.CompositionLocalsKtLocalHapticFeedback1, o.getClipToOutline
    /* JADX INFO: renamed from: write, reason: merged with bridge method [inline-methods] */
    public final GeneratedMessageLite.ExtendableMessage read() {
        boolean zIsMutable = ((GeneratedMessageLite.ExtendableMessage) this.RemoteActionCompatParcelizer).isMutable();
        GeneratedMessageLite generatedMessageLite = this.RemoteActionCompatParcelizer;
        if (!zIsMutable) {
            return (GeneratedMessageLite.ExtendableMessage) generatedMessageLite;
        }
        ((GeneratedMessageLite.ExtendableMessage) generatedMessageLite).extensions.MediaSessionCompatQueueItem();
        return (GeneratedMessageLite.ExtendableMessage) super.read();
    }

    @Override // o.CompositionLocalsKtLocalHapticFeedback1
    public final void MediaMetadataCompat() {
        super.MediaMetadataCompat();
        GeneratedMessageLite.ExtendableMessage extendableMessage = (GeneratedMessageLite.ExtendableMessage) this.RemoteActionCompatParcelizer;
        if (extendableMessage.extensions != CompositionLocalsKtLocalClipboard1.serializer) {
            extendableMessage.extensions = extendableMessage.extensions.clone();
        }
    }
}
