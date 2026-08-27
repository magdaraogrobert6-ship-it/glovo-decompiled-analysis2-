package com.google.android.gms.internal.location;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.RemoteException;
import o.ParentDataModifierDefaultImpls;
import o.accessgetNumPadRightParenthesiscp;
import o.accessgetSystemNavigationDowncp;
import o.getMeasurementConstraintsmsEJaDk;
import o.getMediaPauseEK5gGoQ;
import o.getMinusEK5gGoQ;
import o.getNumPadAddEK5gGoQ;
import o.getNumPadDeleteEK5gGoQ;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class zzak implements accessgetNumPadRightParenthesiscp {
    public final /* synthetic */ int read;
    public final /* synthetic */ PendingIntent serializer;

    public /* synthetic */ zzak(int i, PendingIntent pendingIntent) {
        this.read = i;
        this.serializer = pendingIntent;
    }

    @Override // o.accessgetNumPadRightParenthesiscp
    public final void serializer(Object obj, Object obj2) throws RemoteException {
        int i = this.read;
        PendingIntent pendingIntent = this.serializer;
        ParentDataModifierDefaultImpls parentDataModifierDefaultImpls = (ParentDataModifierDefaultImpls) obj2;
        if (i == 0) {
            getNumPadAddEK5gGoQ getnumpadaddek5ggoq = (getNumPadAddEK5gGoQ) obj;
            getnumpadaddek5ggoq.getClass();
            accessgetSystemNavigationDowncp.IconCompatParcelizer(pendingIntent);
            getNumPadDeleteEK5gGoQ getnumpaddeleteek5ggoq = (getNumPadDeleteEK5gGoQ) getnumpadaddek5ggoq.MediaSessionCompatResultReceiverWrapper();
            Parcel parcelZza = getnumpaddeleteek5ggoq.zza();
            getMinusEK5gGoQ.IconCompatParcelizer(parcelZza, pendingIntent);
            getnumpaddeleteek5ggoq.zzc(6, parcelZza);
            parentDataModifierDefaultImpls.IconCompatParcelizer((Object) null);
            return;
        }
        if (i == 1) {
            getMediaPauseEK5gGoQ getmediapauseek5ggoq = new getMediaPauseEK5gGoQ(new getMeasurementConstraintsmsEJaDk(parentDataModifierDefaultImpls));
            getNumPadDeleteEK5gGoQ getnumpaddeleteek5ggoq2 = (getNumPadDeleteEK5gGoQ) ((getNumPadAddEK5gGoQ) obj).MediaSessionCompatResultReceiverWrapper();
            Parcel parcelZza2 = getnumpaddeleteek5ggoq2.zza();
            getMinusEK5gGoQ.IconCompatParcelizer(parcelZza2, pendingIntent);
            parcelZza2.writeStrongBinder(getmediapauseek5ggoq);
            getnumpaddeleteek5ggoq2.zzc(73, parcelZza2);
            return;
        }
        if (i != 2) {
            if (i == 3) {
                ((zzdz) obj).write(pendingIntent, parentDataModifierDefaultImpls);
                return;
            } else {
                accessgetSystemNavigationDowncp.serializer(pendingIntent, "PendingIntent can not be null.");
                ((zzdz) obj).serializer(new zzem(null, pendingIntent, ""), parentDataModifierDefaultImpls);
                return;
            }
        }
        getMeasurementConstraintsmsEJaDk getmeasurementconstraintsmsejadk = new getMeasurementConstraintsmsEJaDk(parentDataModifierDefaultImpls);
        accessgetSystemNavigationDowncp.serializer(pendingIntent, "PendingIntent must be specified.");
        getMediaPauseEK5gGoQ getmediapauseek5ggoq2 = new getMediaPauseEK5gGoQ(getmeasurementconstraintsmsejadk);
        getNumPadDeleteEK5gGoQ getnumpaddeleteek5ggoq3 = (getNumPadDeleteEK5gGoQ) ((getNumPadAddEK5gGoQ) obj).MediaSessionCompatResultReceiverWrapper();
        Parcel parcelZza3 = getnumpaddeleteek5ggoq3.zza();
        getMinusEK5gGoQ.IconCompatParcelizer(parcelZza3, pendingIntent);
        parcelZza3.writeStrongBinder(getmediapauseek5ggoq2);
        getnumpaddeleteek5ggoq3.zzc(69, parcelZza3);
    }
}
