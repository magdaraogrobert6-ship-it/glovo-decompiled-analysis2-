package o;

import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.common.api.Status;

/* JADX INFO: loaded from: classes4.dex */
public final class accessgetMetaRightcp extends getApostropheEK5gGoQ implements IInterface {
    public final /* synthetic */ accessgetMicrophoneMutecp read;
    public final /* synthetic */ int serializer;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public accessgetMetaRightcp(accessgetMicrophoneMutecp accessgetmicrophonemutecp, int i) {
        super("com.google.android.gms.auth.api.signin.internal.ISignInCallbacks");
        this.serializer = i;
        this.read = accessgetmicrophonemutecp;
    }

    @Override // o.getApostropheEK5gGoQ
    public final boolean serializer(int i, Parcel parcel, Parcel parcel2) {
        accessgetMicrophoneMutecp accessgetmicrophonemutecp = this.read;
        int i2 = this.serializer;
        switch (i) {
            case 101:
                getAppSwitchEK5gGoQ.serializer(parcel);
                getAlignmentLinesMap.write();
                return false;
            case 102:
                Status status = (Status) getAppSwitchEK5gGoQ.RemoteActionCompatParcelizer(parcel, Status.CREATOR);
                getAppSwitchEK5gGoQ.serializer(parcel);
                if (i2 != 0) {
                    throw new UnsupportedOperationException();
                }
                accessgetmicrophonemutecp.write((accessgetNumPadCommacp) status);
                break;
                break;
            case 103:
                Status status2 = (Status) getAppSwitchEK5gGoQ.RemoteActionCompatParcelizer(parcel, Status.CREATOR);
                getAppSwitchEK5gGoQ.serializer(parcel);
                if (i2 != 1) {
                    throw new UnsupportedOperationException();
                }
                accessgetmicrophonemutecp.write((accessgetNumPadCommacp) status2);
                break;
                break;
            default:
                return false;
        }
        parcel2.writeNoException();
        return true;
    }
}
