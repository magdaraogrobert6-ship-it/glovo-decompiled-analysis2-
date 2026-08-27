package o;

import com.google.crypto.tink.proto.KeysetInfo;
import com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite;

/* JADX INFO: loaded from: classes2.dex */
public final class moveui extends getDummyViewConfigurationui {
    public final /* synthetic */ Object clone() {
        return RatingCompat();
    }

    @Override // o.accessnextDrawNode
    public final GeneratedMessageLite r_() {
        return this.RemoteActionCompatParcelizer;
    }

    public final void IconCompatParcelizer(int i) {
        MediaMetadataCompat();
        KeysetInfo.KeyInfo.IconCompatParcelizer((KeysetInfo.KeyInfo) this.read, i);
    }

    public final void RemoteActionCompatParcelizer(String str) {
        MediaMetadataCompat();
        KeysetInfo.KeyInfo.read((KeysetInfo.KeyInfo) this.read, str);
    }

    public final void serializer(requestRemeasureui requestremeasureui) {
        MediaMetadataCompat();
        KeysetInfo.KeyInfo.IconCompatParcelizer((KeysetInfo.KeyInfo) this.read, requestremeasureui);
    }

    public final void write(isSemanticsInvalidatedui issemanticsinvalidatedui) {
        MediaMetadataCompat();
        KeysetInfo.KeyInfo.serializer((KeysetInfo.KeyInfo) this.read, issemanticsinvalidatedui);
    }

    public moveui() {
        super(KeysetInfo.KeyInfo.DEFAULT_INSTANCE);
    }
}
