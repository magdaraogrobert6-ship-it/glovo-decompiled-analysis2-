package o;

import com.roadrunner.login.presentation.LoginActivity;
import com.roadrunner.login.presentation.LoginActivityViewModel;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class accessgetWindowSizeBytesp implements r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM {
    private static int RemoteActionCompatParcelizer = 1;
    private static int serializer;
    public final /* synthetic */ LoginActivity read;
    public final /* synthetic */ int write;

    public /* synthetic */ accessgetWindowSizeBytesp(LoginActivity loginActivity, int i) {
        this.write = i;
        this.read = loginActivity;
    }

    @Override // o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM
    public final Object invoke(Object obj) throws Throwable {
        int i = 2 % 2;
        int i2 = this.write;
        LoginActivity loginActivity = this.read;
        Object obj2 = null;
        if (i2 == 0) {
            LoginActivityViewModel loginActivityViewModelRemoteActionCompatParcelizer = LoginActivity.RemoteActionCompatParcelizer(loginActivity, (getBitmapui_graphics) obj);
            int i3 = RemoteActionCompatParcelizer + 89;
            serializer = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            if (i3 % 2 == 0) {
                return loginActivityViewModelRemoteActionCompatParcelizer;
            }
            obj2.hashCode();
            throw null;
        }
        if (i2 == 1) {
            createFromParcel createfromparcelWrite = LoginActivity.write(loginActivity, (String) obj);
            int i4 = serializer + 15;
            RemoteActionCompatParcelizer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            if (i4 % 2 != 0) {
                return createfromparcelWrite;
            }
            obj2.hashCode();
            throw null;
        }
        int iPlaybackStateCompat = TextUnitTypeCompanion.PlaybackStateCompat();
        int iPlaybackStateCompat2 = TextUnitTypeCompanion.PlaybackStateCompat();
        int iPlaybackStateCompat3 = TextUnitTypeCompanion.PlaybackStateCompat();
        bc bcVar = (bc) LoginActivity.RemoteActionCompatParcelizer(1819424060, TextUnitTypeCompanion.PlaybackStateCompat(), iPlaybackStateCompat, iPlaybackStateCompat2, iPlaybackStateCompat3, -1819424057, new Object[]{loginActivity, (getBitmapui_graphics) obj});
        int i5 = serializer + 115;
        RemoteActionCompatParcelizer = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i6 = i5 % 2;
        return bcVar;
    }
}
