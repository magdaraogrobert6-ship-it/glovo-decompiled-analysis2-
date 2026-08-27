package o;

import com.google.protobuf.GeneratedMessageLite;
import java.util.Iterator;

/* JADX INFO: loaded from: classes4.dex */
public final class CompositionLocalsKtLocalPointerIconService1 {
    public final Iterator read;

    public CompositionLocalsKtLocalPointerIconService1(GeneratedMessageLite.ExtendableMessage extendableMessage) {
        Iterator itWrite = extendableMessage.extensions.write();
        this.read = itWrite;
        if (itWrite.hasNext()) {
        }
    }
}
