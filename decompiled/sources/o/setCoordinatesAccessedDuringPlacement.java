package o;

import java.security.GeneralSecurityException;
import java.security.Security;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes2.dex */
public final class setCoordinatesAccessedDuringPlacement implements setDetachedFromParentLookaheadPlacementui {
    public final setDetachedFromParentLookaheadPassui RemoteActionCompatParcelizer;
    public final /* synthetic */ int serializer;

    public /* synthetic */ setCoordinatesAccessedDuringPlacement(setDetachedFromParentLookaheadPassui setdetachedfromparentlookaheadpassui, int i) {
        this.serializer = i;
        this.RemoteActionCompatParcelizer = setdetachedfromparentlookaheadpassui;
    }

    @Override // o.setDetachedFromParentLookaheadPlacementui
    public final Object IconCompatParcelizer(String str) throws GeneralSecurityException {
        int i = this.serializer;
        setDetachedFromParentLookaheadPassui setdetachedfromparentlookaheadpassui = this.RemoteActionCompatParcelizer;
        Exception exc = null;
        if (i != 0) {
            return setdetachedfromparentlookaheadpassui.IconCompatParcelizer(str, null);
        }
        String[] strArr = {"GmsCore_OpenSSL", "AndroidOpenSSL", "Conscrypt"};
        ArrayList arrayList = new ArrayList();
        for (int i2 = 0; i2 < 3; i2++) {
            java.security.Provider provider = Security.getProvider(strArr[i2]);
            if (provider != null) {
                arrayList.add(provider);
            }
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            try {
                return setdetachedfromparentlookaheadpassui.IconCompatParcelizer(str, (java.security.Provider) it.next());
            } catch (Exception e) {
                if (exc == null) {
                    exc = e;
                }
            }
        }
        throw new GeneralSecurityException("No good Provider found.", exc);
    }
}
