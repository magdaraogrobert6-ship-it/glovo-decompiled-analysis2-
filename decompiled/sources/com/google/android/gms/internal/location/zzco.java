package com.google.android.gms.internal.location;

import android.app.PendingIntent;
import android.os.RemoteException;
import java.util.List;
import o.ParentDataModifierDefaultImpls;
import o.accessgetNumPad6cp;
import o.accessgetScp;
import o.accessgetSystemNavigationDowncp;
import o.getExponentimpl;
import o.getMetaLeftEK5gGoQ;

/* JADX INFO: loaded from: classes4.dex */
public final class zzco extends getMetaLeftEK5gGoQ {
    public final /* synthetic */ Object MediaSessionCompatToken;
    public final /* synthetic */ int write;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ zzco(accessgetNumPad6cp accessgetnumpad6cp, Object obj, int i) {
        super(accessgetnumpad6cp);
        this.write = i;
        this.MediaSessionCompatToken = obj;
    }

    @Override // o.accessgetNumPadDotcp
    public final void RemoteActionCompatParcelizer(accessgetScp accessgetscp) throws RemoteException {
        int i = this.write;
        Object obj = this.MediaSessionCompatToken;
        if (i == 0) {
            PendingIntent pendingIntent = (PendingIntent) obj;
            accessgetSystemNavigationDowncp.serializer(pendingIntent, "PendingIntent can not be null.");
            zzem zzemVar = new zzem(null, pendingIntent, "");
            ParentDataModifierDefaultImpls parentDataModifierDefaultImpls = new ParentDataModifierDefaultImpls();
            parentDataModifierDefaultImpls.RemoteActionCompatParcelizer.addOnCompleteListener(new getExponentimpl(29, this));
            ((zzdz) accessgetscp).serializer(zzemVar, parentDataModifierDefaultImpls);
            return;
        }
        List list = (List) obj;
        accessgetSystemNavigationDowncp.serializer(list, "geofence can't be null.");
        accessgetSystemNavigationDowncp.write("Geofences must contains at least one id.", !list.isEmpty());
        zzem zzemVar2 = new zzem(list, null, "");
        ParentDataModifierDefaultImpls parentDataModifierDefaultImpls2 = new ParentDataModifierDefaultImpls();
        parentDataModifierDefaultImpls2.RemoteActionCompatParcelizer.addOnCompleteListener(new getExponentimpl(29, this));
        ((zzdz) accessgetscp).serializer(zzemVar2, parentDataModifierDefaultImpls2);
    }
}
