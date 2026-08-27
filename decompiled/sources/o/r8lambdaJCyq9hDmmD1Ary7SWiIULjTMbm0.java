package o;

import com.roadrunner.settings.data.cache.SettingsCacheImpl;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: classes3.dex */
public final class r8lambdaJCyq9hDmmD1Ary7SWiIULjTMbm0 extends ContinuationImpl {
    private static int read = 1;
    private static int write;
    public /* synthetic */ Object IconCompatParcelizer;
    public int RemoteActionCompatParcelizer;
    public final /* synthetic */ SettingsCacheImpl serializer;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r8lambdaJCyq9hDmmD1Ary7SWiIULjTMbm0(SettingsCacheImpl settingsCacheImpl, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.serializer = settingsCacheImpl;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object objAccess$fromJson;
        int i = 2 % 2;
        int i2 = read + 83;
        write = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            this.IconCompatParcelizer = obj;
            this.RemoteActionCompatParcelizer |= Integer.MIN_VALUE;
            objAccess$fromJson = SettingsCacheImpl.access$fromJson(this.serializer, null, this);
            int i3 = 7 / 0;
        } else {
            this.IconCompatParcelizer = obj;
            this.RemoteActionCompatParcelizer |= Integer.MIN_VALUE;
            objAccess$fromJson = SettingsCacheImpl.access$fromJson(this.serializer, null, this);
        }
        int i4 = write + 9;
        read = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return objAccess$fromJson;
    }
}
