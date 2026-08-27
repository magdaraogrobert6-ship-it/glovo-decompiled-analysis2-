package o;

import com.sentiance.protobuf.GeneratedMessageLite;
import java.util.Iterator;

/* JADX INFO: loaded from: classes4.dex */
public final class getWidthDp {
    public final Iterator read;

    public getWidthDp(GeneratedMessageLite.ExtendableMessage extendableMessage) {
        Iterator itRemoteActionCompatParcelizer = extendableMessage.extensions.RemoteActionCompatParcelizer();
        this.read = itRemoteActionCompatParcelizer;
        if (itRemoteActionCompatParcelizer.hasNext()) {
        }
    }
}
