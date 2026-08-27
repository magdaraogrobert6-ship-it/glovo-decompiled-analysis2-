package o;

import com.roadrunner.login.legacy.data.user.UserStorageManager;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: classes3.dex */
public final class getDouble extends ContinuationImpl {
    private static int IconCompatParcelizer = 0;
    private static int write = 1;
    public int RemoteActionCompatParcelizer;
    public /* synthetic */ Object read;
    public final /* synthetic */ UserStorageManager serializer;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public getDouble(UserStorageManager userStorageManager, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.serializer = userStorageManager;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        int i = 2 % 2;
        int i2 = write + 79;
        IconCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            this.read = obj;
            this.RemoteActionCompatParcelizer |= Integer.MIN_VALUE;
            return this.serializer.loadUserName(this);
        }
        this.read = obj;
        this.RemoteActionCompatParcelizer |= Integer.MIN_VALUE;
        int i3 = 58 / 0;
        return this.serializer.loadUserName(this);
    }
}
