package o;

import com.roadrunner.rider.state.provider.database.dao.WorkOpportunityDao;
import java.util.List;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: classes3.dex */
public final class onAdidRead extends ContinuationImpl {
    private static int MediaBrowserCompatMediaItem = 1;
    private static int MediaDescriptionCompat;
    public final /* synthetic */ WorkOpportunityDao IconCompatParcelizer;
    public WorkOpportunityDao RemoteActionCompatParcelizer;
    public List read;
    public /* synthetic */ Object serializer;
    public int write;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public onAdidRead(WorkOpportunityDao workOpportunityDao, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.IconCompatParcelizer = workOpportunityDao;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        int i = 2 % 2;
        int i2 = MediaDescriptionCompat + 97;
        MediaBrowserCompatMediaItem = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        this.serializer = obj;
        this.write |= Integer.MIN_VALUE;
        Object objClearAndInsert$suspendImpl = WorkOpportunityDao.clearAndInsert$suspendImpl(this.IconCompatParcelizer, null, this);
        int i4 = MediaDescriptionCompat + 73;
        MediaBrowserCompatMediaItem = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return objClearAndInsert$suspendImpl;
    }
}
