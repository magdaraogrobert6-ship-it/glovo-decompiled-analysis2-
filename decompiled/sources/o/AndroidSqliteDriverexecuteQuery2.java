package o;

import com.roadrunner.login.presentation.LoginActivityViewModel;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: classes3.dex */
public final class AndroidSqliteDriverexecuteQuery2 extends ContinuationImpl {
    private static int MediaDescriptionCompat = 1;
    private static int RemoteActionCompatParcelizer;
    public final /* synthetic */ LoginActivityViewModel IconCompatParcelizer;
    public /* synthetic */ Object read;
    public int serializer;
    public r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 write;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AndroidSqliteDriverexecuteQuery2(LoginActivityViewModel loginActivityViewModel, ShortNewsContentCardView shortNewsContentCardView) {
        super(shortNewsContentCardView);
        this.IconCompatParcelizer = loginActivityViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 99;
        MediaDescriptionCompat = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        this.read = obj;
        this.serializer |= Integer.MIN_VALUE;
        Object objSerializer = LoginActivityViewModel.serializer(this.IconCompatParcelizer, (String) null, (getTextSelectionRange) null, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) null, (LogSqliteDriver) null, (ShortNewsContentCardView) this);
        int i4 = RemoteActionCompatParcelizer + 33;
        MediaDescriptionCompat = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return objSerializer;
    }
}
