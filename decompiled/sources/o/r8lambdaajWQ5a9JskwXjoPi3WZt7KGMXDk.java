package o;

import android.annotation.TargetApi;
import android.app.Notification;
import com.sentiance.sdk.InjectUsing;
import com.sentiance.sdk.devicestate.LocationPermissionLevel;
import com.sentiance.sdk.devicestate.LocationSetting;

/* JADX INFO: loaded from: classes3.dex */
@InjectUsing(componentName = "ServiceForegrounder")
@TargetApi
public class r8lambdaajWQ5a9JskwXjoPi3WZt7KGMXDk extends r8lambdaW0mBZHSlEE6zLbnUlYni6drsgCM {
    private final onLocationRequestCompletelambda1 IconCompatParcelizer;
    private final parseLonglambda0 RemoteActionCompatParcelizer;
    private final BannersDataStoreProviderCompanionExternalSyntheticLambda2 read;
    private final isGeofencesEnabledFromEnvironmentlambda1 serializer;

    /* JADX WARN: Code duplicated, block: B:14:0x0032  */
    @Override // o.r8lambdaW0mBZHSlEE6zLbnUlYni6drsgCM
    public final void write(r8lambdaGV766sOYYCl0YYkk8QccVU5zR38 r8lambdagv766soyycl0yykk8qccvu5zr38, int i, Notification notification) {
        int i2;
        String str;
        LocationSetting locationSettingIconCompatParcelizer = this.serializer.IconCompatParcelizer();
        if (locationSettingIconCompatParcelizer.IconCompatParcelizer() || locationSettingIconCompatParcelizer.write()) {
            onLocationRequestCompletelambda1 onlocationrequestcompletelambda1 = this.IconCompatParcelizer;
            if (onlocationrequestcompletelambda1.write() == LocationPermissionLevel.ALWAYS || (onlocationrequestcompletelambda1.write() == LocationPermissionLevel.ONLY_WHILE_IN_USE && this.read.IconCompatParcelizer())) {
                i2 = 8;
            } else {
                i2 = 2048;
            }
        } else {
            i2 = 2048;
        }
        if (i2 != 8) {
            str = i2 != 2048 ? "other" : "short_service";
        } else {
            str = "location";
        }
        parseLonglambda0 parselonglambda0 = this.RemoteActionCompatParcelizer;
        parselonglambda0.IconCompatParcelizer("Foregrounding service with type %s", str);
        try {
            r8lambdagv766soyycl0yykk8qccvu5zr38.startForeground(i, notification, i2);
        } catch (Exception e) {
            parselonglambda0.IconCompatParcelizer(false, e, "Failed to foreground the service", new Object[0]);
        }
    }

    public r8lambdaajWQ5a9JskwXjoPi3WZt7KGMXDk(onLocationRequestCompletelambda1 onlocationrequestcompletelambda1, parseLonglambda0 parselonglambda0, BannersDataStoreProviderCompanionExternalSyntheticLambda2 bannersDataStoreProviderCompanionExternalSyntheticLambda2, isGeofencesEnabledFromEnvironmentlambda1 isgeofencesenabledfromenvironmentlambda1) {
        this.RemoteActionCompatParcelizer = parselonglambda0;
        this.IconCompatParcelizer = onlocationrequestcompletelambda1;
        this.read = bannersDataStoreProviderCompanionExternalSyntheticLambda2;
        this.serializer = isgeofencesenabledfromenvironmentlambda1;
    }
}
