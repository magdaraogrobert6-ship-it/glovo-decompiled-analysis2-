package o;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.google.android.gms.common.internal.BaseGmsClient;
import com.google.android.gms.common.internal.zzq;

/* JADX INFO: loaded from: classes2.dex */
public final class current extends BaseGmsClient {
    @Override // com.google.android.gms.common.internal.BaseGmsClient
    public final int read() {
        return 12451000;
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient
    public final String RemoteActionCompatParcelizer() {
        return "com.google.android.gms.measurement.START";
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient
    public final String write() {
        return "com.google.android.gms.measurement.internal.IMeasurementService";
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient
    public final /* synthetic */ IInterface read(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.measurement.internal.IMeasurementService");
        if (iInterfaceQueryLocalInterface instanceof isComplete) {
            return (isComplete) iInterfaceQueryLocalInterface;
        }
        return new LayoutNodeSubcompositionsStateprecomposePaused1(iBinder);
    }

    public current(Context context, Looper looper, zzq zzqVar, GoogleApiAvailabilityLight googleApiAvailabilityLight, int i, accessgetRocp accessgetrocp, accessgetRightBracketcp accessgetrightbracketcp, String str) {
        super(context, looper, zzqVar, googleApiAvailabilityLight, i, accessgetrocp, accessgetrightbracketcp, str);
    }
}
