package o;

import com.roadrunner.login.logging.OtpLogger;
import com.roadrunner.permission.api.model.PermissionModel;
import com.roadrunner.permission.presentation.PermissionViewModel;
import com.sentiance.core.model.events.C$b;

/* JADX INFO: loaded from: classes3.dex */
public final class r8lambdaoL9PFNVQ6zR8V_AeWUOaHE8gYho implements r8lambdaemFy31U51vpkzTvcuc2Cdwro430 {
    private static int IconCompatParcelizer = 0;
    private static int RemoteActionCompatParcelizer = 1;
    public final C$b serializer;

    public r8lambdaoL9PFNVQ6zR8V_AeWUOaHE8gYho(C$b c$b) {
        this.serializer = c$b;
    }

    public final PermissionViewModel read(PermissionModel permissionModel) {
        int i = 2 % 2;
        C$b c$b = this.serializer;
        PermissionViewModel permissionViewModel = new PermissionViewModel((r8lambda8ONSZngU81o_LRT9BkSkXpME2w) ((mergeJsonObjects) c$b.serializer).write(), (OtpLogger) ((lambdaprocessAndResolveDeeplink15) c$b.write).write(), (buildRGBAExpression) ((mergeJsonObjects) c$b.IconCompatParcelizer).write(), permissionModel);
        int i2 = RemoteActionCompatParcelizer + 75;
        IconCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            return permissionViewModel;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }
}
