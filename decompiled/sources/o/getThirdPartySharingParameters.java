package o;

import com.roadrunner.rider.state.quests.data.QuestsCache;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: classes3.dex */
public final class getThirdPartySharingParameters extends ContinuationImpl {
    private static int read = 1;
    private static int write;
    public int IconCompatParcelizer;
    public final /* synthetic */ QuestsCache RemoteActionCompatParcelizer;
    public /* synthetic */ Object serializer;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public getThirdPartySharingParameters(QuestsCache questsCache, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.RemoteActionCompatParcelizer = questsCache;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        int i = 2 % 2;
        int i2 = write + 79;
        read = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        this.serializer = obj;
        this.IconCompatParcelizer |= Integer.MIN_VALUE;
        Object objAccess$fromJson = QuestsCache.access$fromJson(this.RemoteActionCompatParcelizer, null, this);
        int i4 = write + 41;
        read = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return objAccess$fromJson;
    }
}
