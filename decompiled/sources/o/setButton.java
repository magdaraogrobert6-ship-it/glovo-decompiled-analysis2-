package o;

/* JADX INFO: loaded from: classes4.dex */
public final class setButton extends setButtons {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public setButton(long j, setHtmlInAppMessageHtmlLinkTargetEnabledandroid_sdk_base_release sethtmlinappmessagehtmllinktargetenabledandroid_sdk_base_release, r8lambda92M0P9sIT5Uf70mvjF4RwMruDA r8lambda92m0p9sit5uf70mvjf4rwmruda, prepareInAppMessageWithZippedAssetHtmllambda4 prepareinappmessagewithzippedassethtmllambda4) {
        super(j, sethtmlinappmessagehtmllinktargetenabledandroid_sdk_base_release, r8lambda92m0p9sit5uf70mvjf4rwmruda, prepareinappmessagewithzippedassethtmllambda4);
        prepareinappmessagewithzippedassethtmllambda4.getClass();
        sethtmlinappmessagehtmllinktargetenabledandroid_sdk_base_release.getClass();
        r8lambda92m0p9sit5uf70mvjf4rwmruda.getClass();
    }

    @Override // o.setButtons, kotlinx.serialization.protobuf.internal.ProtobufEncoder
    public final long IconCompatParcelizer(r8lambda92M0P9sIT5Uf70mvjF4RwMruDA r8lambda92m0p9sit5uf70mvjf4rwmruda, int i) {
        long signature$kotlinx_serialization_protobuf;
        long j;
        r8lambda92m0p9sit5uf70mvjf4rwmruda.getClass();
        long j2 = this.write;
        if (i % 2 == 0) {
            signature$kotlinx_serialization_protobuf = coil3.UriKt.write(j2).getSignature$kotlinx_serialization_protobuf();
            j = 1;
        } else {
            signature$kotlinx_serialization_protobuf = coil3.UriKt.write(j2).getSignature$kotlinx_serialization_protobuf();
            j = 2;
        }
        return signature$kotlinx_serialization_protobuf | j;
    }
}
