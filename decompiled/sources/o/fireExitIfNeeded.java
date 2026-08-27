package o;

import android.os.IBinder;
import android.os.Parcel;
import java.util.HashMap;

/* JADX INFO: loaded from: classes4.dex */
public final class fireExitIfNeeded extends getCalculatorEK5gGoQ implements OnVisibilityChangedNode {
    public fireExitIfNeeded(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.tagmanager.ICustomEvaluatorProxy");
    }

    @Override // o.OnVisibilityChangedNode
    public final void RemoteActionCompatParcelizer(String str, HashMap map) {
        Parcel parcelSerializer = serializer();
        parcelSerializer.writeString(str);
        parcelSerializer.writeMap(map);
        IconCompatParcelizer(1, parcelSerializer);
    }

    @Override // o.OnVisibilityChangedNode
    public final String read(String str, HashMap map) {
        Parcel parcelSerializer = serializer();
        parcelSerializer.writeString(str);
        parcelSerializer.writeMap(map);
        Parcel parcelRemoteActionCompatParcelizer = RemoteActionCompatParcelizer(2, parcelSerializer);
        String string = parcelRemoteActionCompatParcelizer.readString();
        parcelRemoteActionCompatParcelizer.recycle();
        return string;
    }
}
