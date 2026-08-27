package o;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.logging.Level;

/* JADX INFO: loaded from: classes4.dex */
public final class r8lambda6UXcBXySJ5vMglOROvN5C2o2M {
    public static final java.util.logging.Logger RemoteActionCompatParcelizer = java.util.logging.Logger.getLogger(r8lambda6UXcBXySJ5vMglOROvN5C2o2M.class.getName());
    public static r8lambda6UXcBXySJ5vMglOROvN5C2o2M write;
    public final LinkedHashSet IconCompatParcelizer = new LinkedHashSet();
    public List serializer = Collections.EMPTY_LIST;

    public static List RemoteActionCompatParcelizer() {
        java.util.logging.Logger logger = RemoteActionCompatParcelizer;
        ArrayList arrayList = new ArrayList();
        try {
            arrayList.add(r8lambda1h84ZU_cAR0h79mqUcr2O580IzE.class);
        } catch (ClassNotFoundException e) {
            logger.log(Level.FINE, "Unable to find OkHttpChannelProvider", (Throwable) e);
        }
        try {
            arrayList.add(Class.forName("io.grpc.netty.NettyChannelProvider"));
        } catch (ClassNotFoundException e2) {
            logger.log(Level.FINE, "Unable to find NettyChannelProvider", (Throwable) e2);
        }
        try {
            arrayList.add(Class.forName("io.grpc.netty.UdsNettyChannelProvider"));
        } catch (ClassNotFoundException e3) {
            logger.log(Level.FINE, "Unable to find UdsNettyChannelProvider", (Throwable) e3);
        }
        return Collections.unmodifiableList(arrayList);
    }
}
