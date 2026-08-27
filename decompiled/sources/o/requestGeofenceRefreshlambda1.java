package o;

import com.roadrunner.nafath.data.NafathTimerDataStore;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: classes3.dex */
public final class requestGeofenceRefreshlambda1 extends ContinuationImpl {
    private static int read = 0;
    private static int write = 1;
    public int IconCompatParcelizer;
    public final /* synthetic */ NafathTimerDataStore RemoteActionCompatParcelizer;
    public /* synthetic */ Object serializer;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public requestGeofenceRefreshlambda1(NafathTimerDataStore nafathTimerDataStore, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.RemoteActionCompatParcelizer = nafathTimerDataStore;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object objAccess$decodeFromJson$1;
        int i = 2 % 2;
        int i2 = read + 13;
        write = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            this.serializer = obj;
            this.IconCompatParcelizer |= Integer.MIN_VALUE;
            objAccess$decodeFromJson$1 = NafathTimerDataStore.access$decodeFromJson$1(this.RemoteActionCompatParcelizer, null, this);
            int i3 = 56 / 0;
        } else {
            this.serializer = obj;
            this.IconCompatParcelizer |= Integer.MIN_VALUE;
            objAccess$decodeFromJson$1 = NafathTimerDataStore.access$decodeFromJson$1(this.RemoteActionCompatParcelizer, null, this);
        }
        int i4 = read + 53;
        write = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 != 0) {
            return objAccess$decodeFromJson$1;
        }
        throw null;
    }
}
