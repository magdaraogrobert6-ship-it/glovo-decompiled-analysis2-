package o;

import com.roadrunner.appinitialize.InitializeAppStartupItemsImpl;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: classes3.dex */
public final class onImeAction9UiTYpY extends ContinuationImpl {
    private static int IconCompatParcelizer = 0;
    private static int write = 1;
    public /* synthetic */ Object RemoteActionCompatParcelizer;
    public final /* synthetic */ InitializeAppStartupItemsImpl read;
    public int serializer;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public onImeAction9UiTYpY(InitializeAppStartupItemsImpl initializeAppStartupItemsImpl, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.read = initializeAppStartupItemsImpl;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        int i = 2 % 2;
        int i2 = write + 81;
        IconCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            this.RemoteActionCompatParcelizer = obj;
            this.serializer |= Integer.MIN_VALUE;
            return this.read.invoke(this);
        }
        this.RemoteActionCompatParcelizer = obj;
        this.serializer |= Integer.MIN_VALUE;
        this.read.invoke(this);
        Object obj2 = null;
        obj2.hashCode();
        throw null;
    }
}
