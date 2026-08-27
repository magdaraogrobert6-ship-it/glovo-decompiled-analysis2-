package o;

import com.roadrunner.settings.data.cache.SettingsCacheImpl;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: classes3.dex */
public final class r8lambdaKmdawKcjUWWHthk2KpePFaPHZk extends ContinuationImpl {
    private static int IconCompatParcelizer = 1;
    private static int RemoteActionCompatParcelizer;
    public /* synthetic */ Object read;
    public int serializer;
    public final /* synthetic */ SettingsCacheImpl write;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r8lambdaKmdawKcjUWWHthk2KpePFaPHZk(SettingsCacheImpl settingsCacheImpl, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.write = settingsCacheImpl;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        int i = 2 % 2;
        int i2 = IconCompatParcelizer + 105;
        RemoteActionCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            this.read = obj;
            this.serializer |= Integer.MIN_VALUE;
            return this.write.shouldClearCache(this);
        }
        this.read = obj;
        this.serializer |= Integer.MIN_VALUE;
        this.write.shouldClearCache(this);
        throw null;
    }
}
