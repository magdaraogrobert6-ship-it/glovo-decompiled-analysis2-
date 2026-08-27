package o;

import kotlinx.serialization.protobuf.internal.ProtobufDecoder;
import kotlinx.serialization.protobuf.internal.ProtobufReader;
import okhttp3.internal.http2.Huffman$Node;

/* JADX INFO: loaded from: classes4.dex */
public final class setDrawableColor extends ProtobufDecoder {
    public int IconCompatParcelizer;
    public final long read;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public setDrawableColor(prepareInAppMessageWithZippedAssetHtmllambda4 prepareinappmessagewithzippedassethtmllambda4, ProtobufReader protobufReader, long j, r8lambda92M0P9sIT5Uf70mvjF4RwMruDA r8lambda92m0p9sit5uf70mvjf4rwmruda) {
        super(prepareinappmessagewithzippedassethtmllambda4, protobufReader, r8lambda92m0p9sit5uf70mvjf4rwmruda);
        r8lambda92m0p9sit5uf70mvjf4rwmruda.getClass();
        this.IconCompatParcelizer = -1;
        if (j == 19500) {
            int iRemoteActionCompatParcelizer = protobufReader.RemoteActionCompatParcelizer(BackgroundInAppMessagePreparerdisplayPreparedInAppMessage2.DEFAULT);
            if (iRemoteActionCompatParcelizer < 0) {
                DrawableTransformation.serializer(iRemoteActionCompatParcelizer, r8lambda92m0p9sit5uf70mvjf4rwmruda, ", but got ", "Expected positive length for ");
                throw null;
            }
            j = -iRemoteActionCompatParcelizer;
        }
        this.read = j;
    }

    @Override // kotlinx.serialization.protobuf.internal.ProtobufDecoder
    public final long RatingCompat(r8lambda92M0P9sIT5Uf70mvjF4RwMruDA r8lambda92m0p9sit5uf70mvjf4rwmruda, int i) {
        r8lambda92m0p9sit5uf70mvjf4rwmruda.getClass();
        long j = this.read;
        if (j > 0) {
            return j;
        }
        return 19500L;
    }

    @Override // kotlinx.serialization.protobuf.internal.ProtobufDecoder, o.createInAppMessageViewlambda1
    public final int read(r8lambda92M0P9sIT5Uf70mvjF4RwMruDA r8lambda92m0p9sit5uf70mvjf4rwmruda) {
        r8lambda92m0p9sit5uf70mvjf4rwmruda.getClass();
        long j = this.read;
        int i = this.IconCompatParcelizer;
        ProtobufReader protobufReader = this.MediaSessionCompatResultReceiverWrapper;
        if (j > 0) {
            if ((i == -1 ? protobufReader.serializer : protobufReader.RatingCompat()) == ((int) (j & 2147483647L))) {
                int i2 = this.IconCompatParcelizer + 1;
                this.IconCompatParcelizer = i2;
                return i2;
            }
            protobufReader.RemoteActionCompatParcelizer = true;
            int i3 = protobufReader.serializer;
            int typeId = protobufReader.read.getTypeId();
            protobufReader.IconCompatParcelizer(protobufReader.IconCompatParcelizer);
            protobufReader.IconCompatParcelizer = (i3 << 3) | typeId;
            return -1;
        }
        long j2 = -j;
        int i4 = i + 1;
        this.IconCompatParcelizer = i4;
        if (i4 == j2) {
            return -1;
        }
        if (!protobufReader.RemoteActionCompatParcelizer) {
            Huffman$Node huffman$Node = protobufReader.write;
            if (huffman$Node.serializer - huffman$Node.read == 0) {
                return -1;
            }
        }
        return i4;
    }
}
