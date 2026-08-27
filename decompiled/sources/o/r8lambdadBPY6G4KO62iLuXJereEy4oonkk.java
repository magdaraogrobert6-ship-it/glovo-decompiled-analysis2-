package o;

import android.app.Notification;
import com.sentiance.sdk.InjectUsing;

/* JADX INFO: loaded from: classes3.dex */
@InjectUsing(componentName = "ServiceForegrounder")
public class r8lambdadBPY6G4KO62iLuXJereEy4oonkk extends r8lambdaW0mBZHSlEE6zLbnUlYni6drsgCM {
    private final parseLonglambda0 RemoteActionCompatParcelizer;

    public r8lambdadBPY6G4KO62iLuXJereEy4oonkk(parseLonglambda0 parselonglambda0) {
        this.RemoteActionCompatParcelizer = parselonglambda0;
    }

    @Override // o.r8lambdaW0mBZHSlEE6zLbnUlYni6drsgCM
    public final void write(r8lambdaGV766sOYYCl0YYkk8QccVU5zR38 r8lambdagv766soyycl0yykk8qccvu5zr38, int i, Notification notification) {
        try {
            r8lambdagv766soyycl0yykk8qccvu5zr38.startForeground(i, notification);
        } catch (Exception e) {
            this.RemoteActionCompatParcelizer.IconCompatParcelizer(false, e, "Failed to foreground the service", new Object[0]);
        }
    }
}
