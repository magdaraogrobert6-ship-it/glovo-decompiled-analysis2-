package kotlinx.serialization.protobuf.internal;

import kotlinx.serialization.SerializationException;
import o.DefaultInAppMessageSlideupViewFactory;
import o.getDrawable;
import o.prepareInAppMessageWithZippedAssetHtmllambda4;
import o.r8lambda92M0P9sIT5Uf70mvjF4RwMruDA;
import o.setButtons;
import o.setHtmlInAppMessageHtmlLinkTargetEnabledandroid_sdk_base_release;

/* JADX INFO: loaded from: classes4.dex */
public final class PackedArrayEncoder extends setButtons {
    @Override // o.setButtons, kotlinx.serialization.protobuf.internal.ProtobufEncoder
    public final long IconCompatParcelizer(r8lambda92M0P9sIT5Uf70mvjF4RwMruDA r8lambda92m0p9sit5uf70mvjf4rwmruda, int i) {
        r8lambda92m0p9sit5uf70mvjf4rwmruda.getClass();
        return 19500L;
    }

    public PackedArrayEncoder(long j, setHtmlInAppMessageHtmlLinkTargetEnabledandroid_sdk_base_release sethtmlinappmessagehtmllinktargetenabledandroid_sdk_base_release, r8lambda92M0P9sIT5Uf70mvjF4RwMruDA r8lambda92m0p9sit5uf70mvjf4rwmruda, prepareInAppMessageWithZippedAssetHtmllambda4 prepareinappmessagewithzippedassethtmllambda4) {
        getDrawable getdrawable = new getDrawable();
        prepareinappmessagewithzippedassethtmllambda4.getClass();
        sethtmlinappmessagehtmllinktargetenabledandroid_sdk_base_release.getClass();
        r8lambda92m0p9sit5uf70mvjf4rwmruda.getClass();
        super(prepareinappmessagewithzippedassethtmllambda4, sethtmlinappmessagehtmllinktargetenabledandroid_sdk_base_release, j, r8lambda92m0p9sit5uf70mvjf4rwmruda, getdrawable);
    }

    @Override // o.setButtons, kotlinx.serialization.protobuf.internal.ProtobufEncoder
    public final void write(r8lambda92M0P9sIT5Uf70mvjF4RwMruDA r8lambda92m0p9sit5uf70mvjf4rwmruda) {
        r8lambda92m0p9sit5uf70mvjf4rwmruda.getClass();
        if (this.read.write > 0) {
            super.write(r8lambda92m0p9sit5uf70mvjf4rwmruda);
        }
    }

    @Override // kotlinx.serialization.protobuf.internal.ProtobufEncoder, o.DefaultInAppMessageViewWrapperFactory
    public final DefaultInAppMessageSlideupViewFactory serializer(r8lambda92M0P9sIT5Uf70mvjF4RwMruDA r8lambda92m0p9sit5uf70mvjf4rwmruda) {
        r8lambda92m0p9sit5uf70mvjf4rwmruda.getClass();
        throw new SerializationException("Packing only supports primitive number types");
    }

    @Override // kotlinx.serialization.protobuf.internal.ProtobufEncoder, o.DefaultInAppMessageViewWrapperFactory
    public final DefaultInAppMessageSlideupViewFactory write(r8lambda92M0P9sIT5Uf70mvjF4RwMruDA r8lambda92m0p9sit5uf70mvjf4rwmruda, int i) {
        r8lambda92m0p9sit5uf70mvjf4rwmruda.getClass();
        throw new SerializationException("Packing only supports primitive number types");
    }

    @Override // kotlinx.serialization.protobuf.internal.ProtobufEncoder
    public final void write(long j, String str) {
        str.getClass();
        throw new SerializationException("Packing only supports primitive number types");
    }
}
