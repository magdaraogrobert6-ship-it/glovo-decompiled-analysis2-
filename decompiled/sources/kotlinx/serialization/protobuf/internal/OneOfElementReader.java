package kotlinx.serialization.protobuf.internal;

import coil3.UriKt;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import java.util.ArrayList;
import java.util.List;
import kotlin.text.RegexKt;
import kotlinx.coroutines.BuildersKt;
import kotlinx.serialization.SerializationException;
import o.DrawableTransformation;
import o.createInAppMessageViewlambda0;
import o.createInAppMessageViewlambda1;
import o.getCieXyz;
import o.prepareInAppMessageWithZippedAssetHtmllambda4;
import o.r8lambda92M0P9sIT5Uf70mvjF4RwMruDA;
import o.r8lambdaHmNwzRTGt9ipoF7JjsxqrYWXHc8;
import o.r8lambdaSyfvZzB8bo4UhFcC48uuJ5_ycw;
import o.removeNodeAtDepth;

/* JADX INFO: loaded from: classes4.dex */
public final class OneOfElementReader extends ProtobufDecoder {
    public boolean serializer;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OneOfElementReader(prepareInAppMessageWithZippedAssetHtmllambda4 prepareinappmessagewithzippedassethtmllambda4, ProtobufReader protobufReader, r8lambda92M0P9sIT5Uf70mvjF4RwMruDA r8lambda92m0p9sit5uf70mvjf4rwmruda) {
        super(prepareinappmessagewithzippedassethtmllambda4, protobufReader, r8lambda92m0p9sit5uf70mvjf4rwmruda);
        r8lambda92m0p9sit5uf70mvjf4rwmruda.getClass();
        if (r8lambda92m0p9sit5uf70mvjf4rwmruda.IconCompatParcelizer() != 1) {
            DrawableTransformation.serializer(r8lambda92m0p9sit5uf70mvjf4rwmruda.IconCompatParcelizer(), r8lambda92m0p9sit5uf70mvjf4rwmruda.serializer(), " should contain only 1 element, but get ", "Implementation of oneOf type ");
            throw null;
        }
        List listSerializer = r8lambda92m0p9sit5uf70mvjf4rwmruda.serializer(0);
        ArrayList arrayList = new ArrayList();
        for (Object obj : listSerializer) {
            if (obj instanceof r8lambdaSyfvZzB8bo4UhFcC48uuJ5_ycw) {
                arrayList.add(obj);
            }
        }
        r8lambdaSyfvZzB8bo4UhFcC48uuJ5_ycw r8lambdasyfvzzb8bo4uhfcc48uuj5_ycw = (r8lambdaSyfvZzB8bo4UhFcC48uuJ5_ycw) (arrayList.size() == 1 ? arrayList.get(0) : null);
        if (r8lambdasyfvzzb8bo4uhfcc48uuj5_ycw == null) {
            ScreenStartObserver$$ExternalSyntheticLambda0.write("Implementation of oneOf type ", r8lambda92m0p9sit5uf70mvjf4rwmruda.serializer(), " should have @ProtoNumber annotation");
            throw null;
        }
        r8lambdasyfvzzb8bo4uhfcc48uuj5_ycw.IconCompatParcelizer();
    }

    @Override // kotlinx.serialization.protobuf.internal.ProtobufDecoder, o.createInAppMessageViewlambda1
    public final int read(r8lambda92M0P9sIT5Uf70mvjF4RwMruDA r8lambda92m0p9sit5uf70mvjf4rwmruda) {
        r8lambda92m0p9sit5uf70mvjf4rwmruda.getClass();
        if (this.serializer) {
            return -1;
        }
        this.serializer = true;
        return 0;
    }

    @Override // kotlinx.serialization.protobuf.internal.ProtobufDecoder, o.DefaultInAppMessageModalViewFactoryCompanion
    public final createInAppMessageViewlambda1 serializer(r8lambda92M0P9sIT5Uf70mvjF4RwMruDA r8lambda92m0p9sit5uf70mvjf4rwmruda) {
        r8lambda92m0p9sit5uf70mvjf4rwmruda.getClass();
        RegexKt regexKtRemoteActionCompatParcelizer = r8lambda92m0p9sit5uf70mvjf4rwmruda.RemoteActionCompatParcelizer();
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{regexKtRemoteActionCompatParcelizer, r8lambdaHmNwzRTGt9ipoF7JjsxqrYWXHc8.IconCompatParcelizer}, getCieXyz.write())).booleanValue()) {
            if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{regexKtRemoteActionCompatParcelizer, r8lambdaHmNwzRTGt9ipoF7JjsxqrYWXHc8.write}, getCieXyz.write())).booleanValue() && !(regexKtRemoteActionCompatParcelizer instanceof createInAppMessageViewlambda0)) {
                throw new SerializationException("Type " + r8lambda92m0p9sit5uf70mvjf4rwmruda.RemoteActionCompatParcelizer() + " cannot be directly child of oneof element");
            }
        }
        long jSerializer = serializer();
        if (jSerializer == 19500) {
            if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.MediaBrowserCompatMediaItem, r8lambda92m0p9sit5uf70mvjf4rwmruda}, getCieXyz.write())).booleanValue()) {
                return this;
            }
        }
        if (UriKt.IconCompatParcelizer(jSerializer)) {
            DrawableTransformation.serializer("An oneof element cannot be directly child of another oneof element");
            return null;
        }
        return new ProtobufDecoder(this.MediaSessionCompatToken, BuildersKt.RemoteActionCompatParcelizer(this.MediaSessionCompatResultReceiverWrapper, jSerializer), r8lambda92m0p9sit5uf70mvjf4rwmruda);
    }
}
