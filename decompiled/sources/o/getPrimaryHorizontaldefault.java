package o;

import com.roadrunner.delivery.accept.laststop.data.RecentLastStopsDatastoreImpl;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: classes3.dex */
public final class getPrimaryHorizontaldefault extends ContinuationImpl {
    private static int serializer = 1;
    private static int write;
    public final /* synthetic */ RecentLastStopsDatastoreImpl IconCompatParcelizer;
    public int RemoteActionCompatParcelizer;
    public /* synthetic */ Object read;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public getPrimaryHorizontaldefault(RecentLastStopsDatastoreImpl recentLastStopsDatastoreImpl, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.IconCompatParcelizer = recentLastStopsDatastoreImpl;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        int i = 2 % 2;
        int i2 = serializer + 103;
        write = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            this.read = obj;
            this.RemoteActionCompatParcelizer |= Integer.MIN_VALUE;
            RecentLastStopsDatastoreImpl.access$decodeFromJson(this.IconCompatParcelizer, null, this);
            throw null;
        }
        this.read = obj;
        this.RemoteActionCompatParcelizer |= Integer.MIN_VALUE;
        Object objAccess$decodeFromJson = RecentLastStopsDatastoreImpl.access$decodeFromJson(this.IconCompatParcelizer, null, this);
        int i3 = write + 103;
        serializer = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i4 = i3 % 2;
        return objAccess$decodeFromJson;
    }
}
