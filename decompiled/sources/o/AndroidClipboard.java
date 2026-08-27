package o;

import com.google.firebase.encoders.proto.ProtobufEncoder;
import java.util.HashMap;

/* JADX INFO: loaded from: classes2.dex */
public abstract class AndroidClipboard {
    public static final ProtobufEncoder RemoteActionCompatParcelizer;

    static {
        HashMap map = new HashMap();
        HashMap map2 = new HashMap();
        map.put(AndroidClipboard.class, AccessibilityIteratorsParagraphTextSegmentIteratorCompanion.read);
        map2.remove(AndroidClipboard.class);
        map.put(accessgetAddChangeCallbackMethodcp.class, AccessibilityIteratorsWordTextSegmentIterator.serializer);
        map2.remove(accessgetAddChangeCallbackMethodcp.class);
        map.put(accessdispatchKeyEvents408734394.class, isLetterOrDigit.MediaBrowserCompatMediaItem);
        map2.remove(accessdispatchKeyEvents408734394.class);
        RemoteActionCompatParcelizer = new ProtobufEncoder(new HashMap(map), new HashMap(map2), updateNode.read);
    }
}
