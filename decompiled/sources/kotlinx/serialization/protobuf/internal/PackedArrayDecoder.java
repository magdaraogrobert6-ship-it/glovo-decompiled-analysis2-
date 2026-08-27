package kotlinx.serialization.protobuf.internal;

import kotlinx.serialization.SerializationException;
import o.createInAppMessageViewlambda1;
import o.prepareInAppMessageWithZippedAssetHtmllambda4;
import o.r8lambda92M0P9sIT5Uf70mvjF4RwMruDA;
import okhttp3.internal.http2.Huffman$Node;

/* JADX INFO: loaded from: classes4.dex */
public final class PackedArrayDecoder extends ProtobufDecoder {
    public int read;

    @Override // kotlinx.serialization.protobuf.internal.ProtobufDecoder
    public final long RatingCompat(r8lambda92M0P9sIT5Uf70mvjF4RwMruDA r8lambda92m0p9sit5uf70mvjf4rwmruda, int i) {
        r8lambda92m0p9sit5uf70mvjf4rwmruda.getClass();
        return 19500L;
    }

    @Override // kotlinx.serialization.protobuf.internal.ProtobufDecoder, o.createInAppMessageViewlambda1
    public final int read(r8lambda92M0P9sIT5Uf70mvjF4RwMruDA r8lambda92m0p9sit5uf70mvjf4rwmruda) {
        r8lambda92m0p9sit5uf70mvjf4rwmruda.getClass();
        ProtobufReader protobufReader = this.MediaSessionCompatResultReceiverWrapper;
        if (!protobufReader.RemoteActionCompatParcelizer) {
            Huffman$Node huffman$Node = protobufReader.write;
            if (huffman$Node.serializer - huffman$Node.read == 0) {
                return -1;
            }
        }
        int i = this.read;
        this.read = i + 1;
        return i;
    }

    @Override // kotlinx.serialization.protobuf.internal.ProtobufDecoder
    public final String read(long j) {
        throw new SerializationException("Packing only supports primitive number types. The actual reading is for string.");
    }

    @Override // kotlinx.serialization.protobuf.internal.ProtobufDecoder, o.DefaultInAppMessageModalViewFactoryCompanion
    public final createInAppMessageViewlambda1 serializer(r8lambda92M0P9sIT5Uf70mvjF4RwMruDA r8lambda92m0p9sit5uf70mvjf4rwmruda) {
        r8lambda92m0p9sit5uf70mvjf4rwmruda.getClass();
        throw new SerializationException("Packing only supports primitive number types. The input type however was a struct: " + r8lambda92m0p9sit5uf70mvjf4rwmruda);
    }

    public PackedArrayDecoder(prepareInAppMessageWithZippedAssetHtmllambda4 prepareinappmessagewithzippedassethtmllambda4, ProtobufReader protobufReader, r8lambda92M0P9sIT5Uf70mvjF4RwMruDA r8lambda92m0p9sit5uf70mvjf4rwmruda) {
        super(prepareinappmessagewithzippedassethtmllambda4, protobufReader, r8lambda92m0p9sit5uf70mvjf4rwmruda);
    }
}
