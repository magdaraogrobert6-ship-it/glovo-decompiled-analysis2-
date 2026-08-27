package o;

import com.roadrunner.login.presentation.LoginActivity;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class executezeHU3Mk implements r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 {
    private static int serializer = 0;
    private static int write = 1;
    public final /* synthetic */ LoginActivity IconCompatParcelizer;
    public final /* synthetic */ int RemoteActionCompatParcelizer;
    public final /* synthetic */ String read;

    public /* synthetic */ executezeHU3Mk(LoginActivity loginActivity, String str, int i) {
        this.RemoteActionCompatParcelizer = i;
        this.IconCompatParcelizer = loginActivity;
        this.read = str;
    }

    @Override // o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0
    public final Object invoke(Object obj, Object obj2) {
        int i = 2 % 2;
        int i2 = write + 81;
        serializer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            ((Integer) obj2).intValue();
            throw null;
        }
        int i3 = this.RemoteActionCompatParcelizer;
        String str = this.read;
        LoginActivity loginActivity = this.IconCompatParcelizer;
        getBirthDateFull getbirthdatefull = (getBirthDateFull) obj;
        int iIntValue = ((Integer) obj2).intValue();
        if (i3 != 0) {
            return LoginActivity.write(loginActivity, str, getbirthdatefull, iIntValue);
        }
        Object[] objArr = {loginActivity, str, getbirthdatefull, Integer.valueOf(iIntValue)};
        createFromParcel createfromparcel = (createFromParcel) LoginActivity.RemoteActionCompatParcelizer(-1539367788, TextUnitTypeCompanion.PlaybackStateCompat(), TextUnitTypeCompanion.PlaybackStateCompat(), TextUnitTypeCompanion.PlaybackStateCompat(), TextUnitTypeCompanion.PlaybackStateCompat(), 1539367798, objArr);
        int i4 = write + 61;
        serializer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return createfromparcel;
    }
}
