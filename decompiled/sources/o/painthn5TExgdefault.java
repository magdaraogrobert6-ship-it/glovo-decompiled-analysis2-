package o;

import com.roadrunner.appinitialize.InitializeAppStartupItemsImpl;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: classes3.dex */
public final class painthn5TExgdefault extends ContinuationImpl {
    private static int IconCompatParcelizer = 0;
    private static int RatingCompat = 1;
    public /* synthetic */ Object RemoteActionCompatParcelizer;
    public String read;
    public final /* synthetic */ InitializeAppStartupItemsImpl serializer;
    public int write;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public painthn5TExgdefault(InitializeAppStartupItemsImpl initializeAppStartupItemsImpl, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.serializer = initializeAppStartupItemsImpl;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        int i = 2 % 2;
        int i2 = RatingCompat + 95;
        IconCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        this.RemoteActionCompatParcelizer = obj;
        this.write |= Integer.MIN_VALUE;
        Object objInvoke = this.serializer.invoke(this);
        int i4 = IconCompatParcelizer + 5;
        RatingCompat = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return objInvoke;
    }
}
