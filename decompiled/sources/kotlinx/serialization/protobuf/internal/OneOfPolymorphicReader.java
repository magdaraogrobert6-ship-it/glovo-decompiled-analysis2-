package kotlinx.serialization.protobuf.internal;

import coil3.UriKt;
import java.util.Iterator;
import kotlinx.serialization.SerializationException;
import o.createInAppMessageViewlambda1;
import o.prepareInAppMessageWithZippedAssetHtml;
import o.prepareInAppMessageWithZippedAssetHtmllambda4;
import o.r8lambda92M0P9sIT5Uf70mvjF4RwMruDA;

/* JADX INFO: loaded from: classes4.dex */
public final class OneOfPolymorphicReader extends ProtobufDecoder {
    public boolean IconCompatParcelizer;
    public final long RemoteActionCompatParcelizer;
    public boolean write;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OneOfPolymorphicReader(prepareInAppMessageWithZippedAssetHtmllambda4 prepareinappmessagewithzippedassethtmllambda4, ProtobufReader protobufReader, long j, r8lambda92M0P9sIT5Uf70mvjF4RwMruDA r8lambda92m0p9sit5uf70mvjf4rwmruda) {
        super(prepareinappmessagewithzippedassethtmllambda4, protobufReader, r8lambda92m0p9sit5uf70mvjf4rwmruda);
        r8lambda92m0p9sit5uf70mvjf4rwmruda.getClass();
        this.RemoteActionCompatParcelizer = j;
    }

    @Override // kotlinx.serialization.protobuf.internal.ProtobufDecoder, o.createInAppMessageViewlambda1
    public final int read(r8lambda92M0P9sIT5Uf70mvjF4RwMruDA r8lambda92m0p9sit5uf70mvjf4rwmruda) {
        r8lambda92m0p9sit5uf70mvjf4rwmruda.getClass();
        if (!this.IconCompatParcelizer) {
            this.IconCompatParcelizer = true;
            return 0;
        }
        if (this.write) {
            return -1;
        }
        this.write = true;
        return 1;
    }

    @Override // kotlinx.serialization.protobuf.internal.ProtobufDecoder, o.DefaultInAppMessageModalViewFactoryCompanion
    public final createInAppMessageViewlambda1 serializer(r8lambda92M0P9sIT5Uf70mvjF4RwMruDA r8lambda92m0p9sit5uf70mvjf4rwmruda) {
        r8lambda92m0p9sit5uf70mvjf4rwmruda.getClass();
        return r8lambda92m0p9sit5uf70mvjf4rwmruda.equals(this.MediaBrowserCompatMediaItem) ? this : new OneOfElementReader(this.MediaSessionCompatToken, this.MediaSessionCompatResultReceiverWrapper, r8lambda92m0p9sit5uf70mvjf4rwmruda);
    }

    @Override // kotlinx.serialization.protobuf.internal.ProtobufDecoder
    public final String read(long j) {
        Object next;
        String strSerializer;
        if (j == 19501) {
            prepareInAppMessageWithZippedAssetHtml prepareinappmessagewithzippedassethtml = this.MediaSessionCompatToken.RemoteActionCompatParcelizer;
            int i = (int) (this.RemoteActionCompatParcelizer & 2147483647L);
            r8lambda92M0P9sIT5Uf70mvjF4RwMruDA r8lambda92m0p9sit5uf70mvjf4rwmruda = this.MediaBrowserCompatMediaItem;
            r8lambda92m0p9sit5uf70mvjf4rwmruda.getClass();
            prepareinappmessagewithzippedassethtml.getClass();
            Iterator it = UriKt.serializer(r8lambda92m0p9sit5uf70mvjf4rwmruda, prepareinappmessagewithzippedassethtml).iterator();
            do {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
            } while (((int) (UriKt.RemoteActionCompatParcelizer((r8lambda92M0P9sIT5Uf70mvjF4RwMruDA) next, 0) & 2147483647L)) != i);
            r8lambda92M0P9sIT5Uf70mvjF4RwMruDA r8lambda92m0p9sit5uf70mvjf4rwmruda2 = (r8lambda92M0P9sIT5Uf70mvjF4RwMruDA) next;
            if (r8lambda92m0p9sit5uf70mvjf4rwmruda2 != null && (strSerializer = r8lambda92m0p9sit5uf70mvjf4rwmruda2.serializer()) != null) {
                return strSerializer;
            }
            throw new SerializationException("Cannot find a subclass of " + r8lambda92m0p9sit5uf70mvjf4rwmruda.serializer() + " annotated with @ProtoNumber(" + i + ").");
        }
        return super.read(j);
    }

    @Override // kotlinx.serialization.protobuf.internal.ProtobufDecoder
    public final long RatingCompat(r8lambda92M0P9sIT5Uf70mvjF4RwMruDA r8lambda92m0p9sit5uf70mvjf4rwmruda, int i) {
        r8lambda92m0p9sit5uf70mvjf4rwmruda.getClass();
        if (i == 0) {
            return 19501L;
        }
        return UriKt.RemoteActionCompatParcelizer(r8lambda92m0p9sit5uf70mvjf4rwmruda, 0);
    }
}
