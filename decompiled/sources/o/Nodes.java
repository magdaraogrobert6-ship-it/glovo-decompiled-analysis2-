package o;

import androidx.room.RoomDatabase$createConnectionManager$2;
import bo.app.hg$$ExternalSyntheticLambda5;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import com.google.firebase.firestore.model.Values$Enterprise;
import com.google.firestore.v1.Value;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public abstract class Nodes {
    public static final dispatch IconCompatParcelizer;
    public static final dispatch MediaDescriptionCompat;
    public static final dispatch MediaMetadataCompat;
    public static final dispatch MediaSessionCompatQueueItem;
    public static final dispatch RemoteActionCompatParcelizer;
    public static final dispatch read;
    public static final dispatch serializer;
    public static final hg$$ExternalSyntheticLambda5 write;

    public static final getDrawOLwlOKwannotations RemoteActionCompatParcelizer(Value value, List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Value value2 = (Value) it.next();
            RoomDatabase$createConnectionManager$2 roomDatabase$createConnectionManager$2 = Values$Enterprise.IconCompatParcelizer;
            boolean zSerializer = NodeCoordinatorCompaniononCommitAffectingLayer1.serializer(value, value2);
            if (zSerializer) {
                return getBringIntoViewOLwlOKw.read;
            }
            if (zSerializer) {
                ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer();
                return null;
            }
        }
        return getBringIntoViewOLwlOKw.write;
    }

    static {
        getDrawOLwlOKwannotations getdrawolwlokwannotations = getBringIntoViewOLwlOKw.read;
        serializer = new dispatch(13);
        MediaDescriptionCompat = new dispatch(10);
        MediaSessionCompatQueueItem = new dispatch(11);
        read = new dispatch(9);
        IconCompatParcelizer = new dispatch(7);
        RemoteActionCompatParcelizer = new dispatch(8);
        MediaMetadataCompat = new dispatch(12);
        write = new hg$$ExternalSyntheticLambda5(14);
    }
}
