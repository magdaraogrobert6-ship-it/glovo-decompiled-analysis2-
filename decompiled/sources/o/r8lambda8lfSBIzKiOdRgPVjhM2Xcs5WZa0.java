package o;

import com.mapbox.search.analytics.AnalyticsServiceImpl;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: classes3.dex */
public final class r8lambda8lfSBIzKiOdRgPVjhM2Xcs5WZa0 extends ContinuationImpl {
    private static int MediaDescriptionCompat = 1;
    private static int MediaSessionCompatQueueItem;
    public final /* synthetic */ AnalyticsServiceImpl IconCompatParcelizer;
    public /* synthetic */ Object RemoteActionCompatParcelizer;
    public int read;
    public loadAsync serializer;
    public onActivityPreDestroyed write;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r8lambda8lfSBIzKiOdRgPVjhM2Xcs5WZa0(AnalyticsServiceImpl analyticsServiceImpl, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.IconCompatParcelizer = analyticsServiceImpl;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        int i = 2 % 2;
        int i2 = MediaDescriptionCompat + 57;
        MediaSessionCompatQueueItem = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        this.RemoteActionCompatParcelizer = obj;
        this.read |= Integer.MIN_VALUE;
        Object obj2 = null;
        Object map = this.IconCompatParcelizer.map(null, null, this);
        int i4 = MediaDescriptionCompat + 81;
        MediaSessionCompatQueueItem = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 == 0) {
            return map;
        }
        obj2.hashCode();
        throw null;
    }
}
