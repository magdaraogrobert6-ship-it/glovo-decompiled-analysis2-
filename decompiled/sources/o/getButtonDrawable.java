package o;

import kotlinx.serialization.protobuf.internal.ProtobufDecoder;
import kotlinx.serialization.protobuf.internal.ProtobufReader;

/* JADX INFO: loaded from: classes4.dex */
public final class getButtonDrawable extends ProtobufDecoder {
    public final long read;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public getButtonDrawable(prepareInAppMessageWithZippedAssetHtmllambda4 prepareinappmessagewithzippedassethtmllambda4, ProtobufReader protobufReader, long j, r8lambda92M0P9sIT5Uf70mvjF4RwMruDA r8lambda92m0p9sit5uf70mvjf4rwmruda) {
        super(prepareinappmessagewithzippedassethtmllambda4, protobufReader, r8lambda92m0p9sit5uf70mvjf4rwmruda);
        r8lambda92m0p9sit5uf70mvjf4rwmruda.getClass();
        this.read = j;
    }

    @Override // kotlinx.serialization.protobuf.internal.ProtobufDecoder
    public final long RatingCompat(r8lambda92M0P9sIT5Uf70mvjF4RwMruDA r8lambda92m0p9sit5uf70mvjf4rwmruda, int i) {
        long signature$kotlinx_serialization_protobuf;
        long j;
        r8lambda92m0p9sit5uf70mvjf4rwmruda.getClass();
        long j2 = this.read;
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
