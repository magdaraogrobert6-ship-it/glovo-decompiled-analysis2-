package o;

import com.roadrunner.login.presentation.LoginActivity;
import com.roadrunner.push.PushEventPublisherImpl$emit$1;
import kotlinx.coroutines.BuildersKt;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class getDatabase implements r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 {
    private static int RemoteActionCompatParcelizer = 0;
    private static int write = 1;
    public final /* synthetic */ LoginActivity IconCompatParcelizer;
    public final /* synthetic */ String read;
    public final /* synthetic */ int serializer;

    public /* synthetic */ getDatabase(LoginActivity loginActivity, String str, int i) {
        this.serializer = i;
        this.IconCompatParcelizer = loginActivity;
        this.read = str;
    }

    @Override // o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0
    public final Object invoke() throws Throwable {
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 7;
        write = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        ShortNewsContentCardView shortNewsContentCardView = null;
        if (i2 % 2 == 0) {
            createFromParcel createfromparcel = createFromParcel.INSTANCE;
            shortNewsContentCardView.hashCode();
            throw null;
        }
        int i3 = this.serializer;
        createFromParcel createfromparcel2 = createFromParcel.INSTANCE;
        String str = this.read;
        LoginActivity loginActivity = this.IconCompatParcelizer;
        if (i3 != 0) {
            bc bcVarMediaMetadataCompat = LoginActivity.MediaMetadataCompat(loginActivity);
            bcVarMediaMetadataCompat.getClass();
            str.getClass();
            BuildersKt.RemoteActionCompatParcelizer(toBitmapConfig1JJdX4A.IconCompatParcelizer(bcVarMediaMetadataCompat), null, null, new PushEventPublisherImpl$emit$1(bcVarMediaMetadataCompat, str, shortNewsContentCardView, 16), 3);
            return createfromparcel2;
        }
        bc bcVarMediaMetadataCompat2 = LoginActivity.MediaMetadataCompat(loginActivity);
        bcVarMediaMetadataCompat2.getClass();
        str.getClass();
        bcVarMediaMetadataCompat2.RatingCompat.serializer(new accessgetDatabase(str));
        int i4 = RemoteActionCompatParcelizer + 3;
        write = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return createfromparcel2;
    }
}
