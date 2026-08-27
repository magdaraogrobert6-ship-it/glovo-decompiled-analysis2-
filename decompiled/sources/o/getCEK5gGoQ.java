package o;

import android.os.RemoteException;
import java.util.HashMap;

/* JADX INFO: loaded from: classes2.dex */
public final class getCEK5gGoQ implements getDirectionRightEK5gGoQ {
    public final /* synthetic */ getButtonZEK5gGoQ RemoteActionCompatParcelizer;

    @Override // o.getDirectionRightEK5gGoQ
    public Object serializer(String str, HashMap map) {
        try {
            return this.RemoteActionCompatParcelizer.IconCompatParcelizer.read(str, map);
        } catch (RemoteException e) {
            getButtonThumbLeftEK5gGoQ.write("Error calling customEvaluator proxy:".concat(String.valueOf(e.getMessage())));
            return null;
        }
    }
}
