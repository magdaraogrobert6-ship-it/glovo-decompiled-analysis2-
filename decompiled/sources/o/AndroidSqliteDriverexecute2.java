package o;

import com.roadrunner.login.presentation.LoginActivityViewModel;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class AndroidSqliteDriverexecute2 implements r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM {
    private static int RemoteActionCompatParcelizer = 1;
    private static int write;
    public final /* synthetic */ int read;
    public final /* synthetic */ LoginActivityViewModel serializer;

    public /* synthetic */ AndroidSqliteDriverexecute2(LoginActivityViewModel loginActivityViewModel, int i) {
        this.read = i;
        this.serializer = loginActivityViewModel;
    }

    @Override // o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM
    public final Object invoke(Object obj) throws Throwable {
        int i = 2 % 2;
        int i2 = write + 27;
        RemoteActionCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        int i4 = this.read;
        LoginActivityViewModel loginActivityViewModel = this.serializer;
        if (i4 == 0) {
            return LoginActivityViewModel.serializer(loginActivityViewModel, (Throwable) obj);
        }
        createFromParcel createfromparcelWrite = LoginActivityViewModel.write(loginActivityViewModel, (String) obj);
        int i5 = write + 97;
        RemoteActionCompatParcelizer = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i6 = i5 % 2;
        return createfromparcelWrite;
    }
}
