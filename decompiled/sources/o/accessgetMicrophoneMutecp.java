package o;

import android.os.Parcel;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.auth.api.signin.internal.zbe;
import com.google.android.gms.common.api.Status;

/* JADX INFO: loaded from: classes4.dex */
public final class accessgetMicrophoneMutecp extends accessgetNumPadDotcp {
    public final /* synthetic */ int write;

    @Override // com.google.android.gms.common.api.internal.BasePendingResult
    public final /* bridge */ /* synthetic */ accessgetNumPadCommacp serializer(Status status) {
        return status;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public accessgetMicrophoneMutecp(accessgetNumPad6cp accessgetnumpad6cp, int i) {
        super(accessgetMediaStepBackwardcp.IconCompatParcelizer, accessgetnumpad6cp);
        this.write = i;
    }

    @Override // o.accessgetNumPadDotcp
    public final void RemoteActionCompatParcelizer(accessgetScp accessgetscp) {
        if (this.write != 0) {
            zbe zbeVar = (zbe) accessgetscp;
            accessgetNavigateIncp accessgetnavigateincp = (accessgetNavigateIncp) zbeVar.MediaSessionCompatResultReceiverWrapper();
            accessgetMetaRightcp accessgetmetarightcp = new accessgetMetaRightcp(this, 1);
            GoogleSignInOptions googleSignInOptions = zbeVar.write;
            Parcel parcelObtain = Parcel.obtain();
            parcelObtain.writeInterfaceToken(accessgetnavigateincp.serializer);
            int i = getAppSwitchEK5gGoQ.write;
            parcelObtain.writeStrongBinder(accessgetmetarightcp);
            if (googleSignInOptions == null) {
                parcelObtain.writeInt(0);
            } else {
                parcelObtain.writeInt(1);
                googleSignInOptions.writeToParcel(parcelObtain, 0);
            }
            accessgetnavigateincp.read(103, parcelObtain);
            return;
        }
        zbe zbeVar2 = (zbe) accessgetscp;
        accessgetNavigateIncp accessgetnavigateincp2 = (accessgetNavigateIncp) zbeVar2.MediaSessionCompatResultReceiverWrapper();
        accessgetMetaRightcp accessgetmetarightcp2 = new accessgetMetaRightcp(this, 0);
        GoogleSignInOptions googleSignInOptions2 = zbeVar2.write;
        Parcel parcelObtain2 = Parcel.obtain();
        parcelObtain2.writeInterfaceToken(accessgetnavigateincp2.serializer);
        int i2 = getAppSwitchEK5gGoQ.write;
        parcelObtain2.writeStrongBinder(accessgetmetarightcp2);
        if (googleSignInOptions2 == null) {
            parcelObtain2.writeInt(0);
        } else {
            parcelObtain2.writeInt(1);
            googleSignInOptions2.writeToParcel(parcelObtain2, 0);
        }
        accessgetnavigateincp2.read(102, parcelObtain2);
    }
}
