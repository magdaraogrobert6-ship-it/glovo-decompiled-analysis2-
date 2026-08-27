package o;

import kotlinx.serialization.protobuf.internal.ProtobufDecoder;
import kotlinx.serialization.protobuf.internal.ProtobufEncoder;
import kotlinx.serialization.protobuf.internal.ProtobufReader;
import okhttp3.internal.http2.Huffman$Node;

/* JADX INFO: loaded from: classes4.dex */
public abstract class prepareInAppMessageWithZippedAssetHtmllambda4 {
    public static final BackgroundInAppMessagePreparerWhenMappings write = new BackgroundInAppMessagePreparerWhenMappings(prepareInAppMessageWithZippedAssetHtmllambda2.serializer);
    public final prepareInAppMessageWithZippedAssetHtml RemoteActionCompatParcelizer;

    public prepareInAppMessageWithZippedAssetHtmllambda4(prepareInAppMessageWithZippedAssetHtml prepareinappmessagewithzippedassethtml) {
        this.RemoteActionCompatParcelizer = prepareinappmessagewithzippedassethtml;
    }

    public final Object write(setGraphicModalMaxWidthDp setgraphicmodalmaxwidthdp, byte[] bArr) {
        setgraphicmodalmaxwidthdp.getClass();
        bArr.getClass();
        return new ProtobufDecoder(this, new ProtobufReader(new Huffman$Node(bArr, bArr.length)), setgraphicmodalmaxwidthdp.getDescriptor()).read(setgraphicmodalmaxwidthdp, (Object) null);
    }

    public final byte[] serializer(setGraphicModalMaxWidthDp setgraphicmodalmaxwidthdp, Object obj) {
        setgraphicmodalmaxwidthdp.getClass();
        getDrawable getdrawable = new getDrawable();
        new ProtobufEncoder(this, new setHtmlInAppMessageHtmlLinkTargetEnabledandroid_sdk_base_release(23, getdrawable), setgraphicmodalmaxwidthdp.getDescriptor()).read(setgraphicmodalmaxwidthdp, obj);
        return getdrawable.serializer();
    }
}
