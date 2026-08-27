package o;

import com.google.firebase.encoders.json.JsonDataEncoderBuilder$$ExternalSyntheticLambda0;
import java.util.Date;
import java.util.HashMap;

/* JADX INFO: loaded from: classes2.dex */
public final class detachAndRemoveNode implements getDiffer {
    public static final insertChild read;
    public static final insertChild serializer;
    public final HashMap MediaBrowserCompatMediaItem;
    public final HashMap MediaMetadataCompat;
    public boolean RatingCompat;
    public final JsonDataEncoderBuilder$$ExternalSyntheticLambda0 RemoteActionCompatParcelizer;
    public static final JsonDataEncoderBuilder$$ExternalSyntheticLambda0 IconCompatParcelizer = new JsonDataEncoderBuilder$$ExternalSyntheticLambda0(0);
    public static final getAggregateChildKindSet write = new getAggregateChildKindSet();

    @Override // o.getDiffer
    public final getDiffer serializer(Class cls, accessdetachAndRemoveNode accessdetachandremovenode) {
        this.MediaBrowserCompatMediaItem.put(cls, accessdetachandremovenode);
        this.MediaMetadataCompat.remove(cls);
        return this;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [o.insertChild] */
    /* JADX WARN: Type inference failed for: r0v2, types: [o.insertChild] */
    static {
        final int i = 0;
        serializer = new accesspropagateCoordinator() { // from class: o.insertChild
            @Override // o.accessgetLoggerp
            public final void serializer(Object obj, Object obj2) {
                if (i != 0) {
                    ((createAndInsertNodeAsChild) obj2).RemoteActionCompatParcelizer(((Boolean) obj).booleanValue());
                } else {
                    ((createAndInsertNodeAsChild) obj2).RemoteActionCompatParcelizer((String) obj);
                }
            }
        };
        final int i2 = 1;
        read = new accesspropagateCoordinator() { // from class: o.insertChild
            @Override // o.accessgetLoggerp
            public final void serializer(Object obj, Object obj2) {
                if (i2 != 0) {
                    ((createAndInsertNodeAsChild) obj2).RemoteActionCompatParcelizer(((Boolean) obj).booleanValue());
                } else {
                    ((createAndInsertNodeAsChild) obj2).RemoteActionCompatParcelizer((String) obj);
                }
            }
        };
    }

    public detachAndRemoveNode() {
        HashMap map = new HashMap();
        this.MediaBrowserCompatMediaItem = map;
        HashMap map2 = new HashMap();
        this.MediaMetadataCompat = map2;
        this.RemoteActionCompatParcelizer = IconCompatParcelizer;
        this.RatingCompat = false;
        map2.put(String.class, serializer);
        map.remove(String.class);
        map2.put(Boolean.class, read);
        map.remove(Boolean.class);
        map2.put(Date.class, write);
        map.remove(Date.class);
    }
}
