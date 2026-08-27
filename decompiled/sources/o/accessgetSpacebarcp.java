package o;

import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.BaseGmsClient;
import com.google.android.gms.common.internal.RootTelemetryConfiguration;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
public final class accessgetSpacebarcp implements accessgetRefreshcp, accessgetRocp, accessgetRightBracketcp {
    public static final RootTelemetryConfiguration IconCompatParcelizer = new RootTelemetryConfiguration(false, 0, false, 0, 0);
    public static accessgetSpacebarcp serializer;
    public Object read;

    public static accessgetSpacebarcp IconCompatParcelizer() {
        accessgetSpacebarcp accessgetspacebarcp;
        synchronized (accessgetSpacebarcp.class) {
            if (serializer == null) {
                serializer = new accessgetSpacebarcp();
            }
            accessgetspacebarcp = serializer;
        }
        return accessgetspacebarcp;
    }

    @Override // o.accessgetRocp
    public void RemoteActionCompatParcelizer() {
        ((accessgetNumPad4cp) this.read).RemoteActionCompatParcelizer();
    }

    @Override // o.accessgetRightBracketcp
    public void read(ConnectionResult connectionResult) {
        ((accessgetNumPadDeletecp) this.read).write(connectionResult);
    }

    @Override // o.accessgetRocp
    public void serializer(int i) {
        ((accessgetNumPad4cp) this.read).IconCompatParcelizer(i);
    }

    public accessgetSpacebarcp(BaseGmsClient baseGmsClient) {
        Objects.requireNonNull(baseGmsClient);
        this.read = baseGmsClient;
    }

    @Override // o.accessgetRefreshcp
    public void IconCompatParcelizer(ConnectionResult connectionResult) {
        boolean z = connectionResult.read();
        BaseGmsClient baseGmsClient = (BaseGmsClient) this.read;
        if (z) {
            baseGmsClient.IconCompatParcelizer(null, baseGmsClient.MediaDescriptionCompat());
            return;
        }
        accessgetRightBracketcp accessgetrightbracketcp = baseGmsClient.r8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8;
        if (accessgetrightbracketcp != null) {
            accessgetrightbracketcp.read(connectionResult);
        }
    }

    public /* synthetic */ accessgetSpacebarcp(Object obj) {
        this.read = obj;
    }

    public accessgetSpacebarcp() {
    }
}
