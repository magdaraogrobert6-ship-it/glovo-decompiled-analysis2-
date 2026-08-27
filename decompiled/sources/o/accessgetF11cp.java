package o;

import com.google.firebase.encoders.proto.ProtobufEncoder;
import java.util.HashMap;

/* JADX INFO: loaded from: classes2.dex */
public abstract class accessgetF11cp {
    public static final ProtobufEncoder write;

    static {
        HashMap map = new HashMap();
        HashMap map2 = new HashMap();
        map.put(accessgetF11cp.class, accessgetDirectionLeftcp.read);
        map2.remove(accessgetF11cp.class);
        map.put(accessgetGravecp.class, accessgetDirectionUpRightcp.serializer);
        map2.remove(accessgetGravecp.class);
        map.put(accessgetIcp.class, accessgetEisucp.write);
        map2.remove(accessgetIcp.class);
        map.put(accessgetHeadsetHookcp.class, accessgetDirectionUpcp.RemoteActionCompatParcelizer);
        map2.remove(accessgetHeadsetHookcp.class);
        map.put(accessgetFunctioncp.class, accessgetDirectionUpLeftcp.serializer);
        map2.remove(accessgetFunctioncp.class);
        map.put(accessgetGcp.class, accessgetDirectionRightcp.write);
        map2.remove(accessgetGcp.class);
        map.put(accessgetHenkancp.class, accessgetEcp.IconCompatParcelizer);
        map2.remove(accessgetHenkancp.class);
        write = new ProtobufEncoder(new HashMap(map), new HashMap(map2), updateNode.read);
    }
}
