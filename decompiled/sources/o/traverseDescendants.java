package o;

import android.os.IBinder;
import android.os.Parcel;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class traverseDescendants extends getPairingEK5gGoQ implements LayoutNodeSubcompositionsStateprecomposePaused2 {
    @Override // o.LayoutNodeSubcompositionsStateprecomposePaused2
    public final void write(List list) {
        Parcel parcelSerializer = serializer();
        parcelSerializer.writeTypedList(list);
        read(parcelSerializer);
    }

    public traverseDescendants(IBinder iBinder, String str) {
        super(iBinder, str);
    }
}
