package com.sentiance.core.model.thrift;

import android.os.RemoteException;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import com.google.android.gms.internal.location.zzdz;
import com.google.android.gms.internal.location.zzem;
import java.util.List;
import o.ParentDataModifierDefaultImpls;
import o.accessgetNumPadRightParenthesiscp;
import o.accessgetSystemNavigationDowncp;
import o.removeFromCustomAttributeArraylambda0;

/* JADX INFO: loaded from: classes3.dex */
public final class E1$b implements accessgetNumPadRightParenthesiscp {
    public List serializer;

    @Override // o.accessgetNumPadRightParenthesiscp
    public void serializer(Object obj, Object obj2) throws RemoteException {
        List list = this.serializer;
        accessgetSystemNavigationDowncp.serializer(list, "geofence can't be null.");
        accessgetSystemNavigationDowncp.write("Geofences must contains at least one id.", !list.isEmpty());
        ((zzdz) obj).serializer(new zzem(list, null, ""), (ParentDataModifierDefaultImpls) obj2);
    }

    public removeFromCustomAttributeArraylambda0 write() {
        if (this.serializer != null) {
            return new removeFromCustomAttributeArraylambda0(this);
        }
        ScreenStartObserver$$ExternalSyntheticLambda0.write("Required field 'points_of_interest' is missing");
        return null;
    }
}
