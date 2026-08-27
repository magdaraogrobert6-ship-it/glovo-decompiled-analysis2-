package o;

import com.roadrunner.nafath.data.NafathTimerDataStore;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: classes3.dex */
public final class qExternalSyntheticLambda2 extends ContinuationImpl {
    private static int RemoteActionCompatParcelizer = 1;
    private static int read;
    public int IconCompatParcelizer;
    public /* synthetic */ Object serializer;
    public final /* synthetic */ NafathTimerDataStore write;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qExternalSyntheticLambda2(NafathTimerDataStore nafathTimerDataStore, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.write = nafathTimerDataStore;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 47;
        read = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        this.serializer = obj;
        this.IconCompatParcelizer |= Integer.MIN_VALUE;
        Object objAccess$decodeFromJson = NafathTimerDataStore.access$decodeFromJson(this.write, null, this);
        int i4 = read + 77;
        RemoteActionCompatParcelizer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 != 0) {
            return objAccess$decodeFromJson;
        }
        throw null;
    }
}
