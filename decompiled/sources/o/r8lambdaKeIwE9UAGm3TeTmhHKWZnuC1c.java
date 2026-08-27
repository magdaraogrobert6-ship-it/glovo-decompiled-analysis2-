package o;

import com.roadrunner.settings.data.cache.SettingsCacheImpl;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: classes3.dex */
public final class r8lambdaKeIwE9UAGm3TeTmhHKWZnuC1c extends ContinuationImpl {
    private static int RatingCompat = 1;
    private static int RemoteActionCompatParcelizer;
    public int IconCompatParcelizer;
    public r8lambdaNyJ3IxzJGs1Drw4t7O1OG6TKao read;
    public /* synthetic */ Object serializer;
    public final /* synthetic */ SettingsCacheImpl write;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r8lambdaKeIwE9UAGm3TeTmhHKWZnuC1c(SettingsCacheImpl settingsCacheImpl, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.write = settingsCacheImpl;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 21;
        RatingCompat = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        Object obj2 = null;
        if (i2 % 2 == 0) {
            this.serializer = obj;
            this.IconCompatParcelizer |= Integer.MIN_VALUE;
            this.write.set(null, this);
            obj2.hashCode();
            throw null;
        }
        this.serializer = obj;
        this.IconCompatParcelizer |= Integer.MIN_VALUE;
        Object obj3 = this.write.set(null, this);
        int i3 = RatingCompat + 79;
        RemoteActionCompatParcelizer = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i4 = i3 % 2;
        return obj3;
    }
}
