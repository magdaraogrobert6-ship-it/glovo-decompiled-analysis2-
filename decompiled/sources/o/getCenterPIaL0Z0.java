package o;

import com.roadrunner.delivery.ontheway.turnbyturn.ui.recenter.NavigationRecenterUiModelImpl$1;
import com.roadrunner.freelancing.data.GoAndStartDataStoreFactory$$ExternalSyntheticLambda1;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import kotlinx.coroutines.internal.ContextScope;

/* JADX INFO: loaded from: classes3.dex */
public final class getCenterPIaL0Z0 implements LineHeightStyleMode {
    private static int MediaBrowserCompatMediaItem = 0;
    private static int MediaSessionCompatToken = 1;
    public final getQueryContext IconCompatParcelizer;
    public final getLooseusljTpc MediaDescriptionCompat;
    public final isAdapterPositionOnScreen MediaMetadataCompat;
    public final StateFlow MediaSessionCompatQueueItem = StateFlowKt.read(Boolean.TRUE);
    public final accessgetParagraphcp RatingCompat;
    public final StateFlow RemoteActionCompatParcelizer;
    public final MutableStateFlow read;
    public final ib serializer;
    public final i8 write;

    @Override // o.getFragment
    public final StateFlow IconCompatParcelizer() {
        int i = 2 % 2;
        int i2 = MediaSessionCompatToken + 13;
        MediaBrowserCompatMediaItem = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            return this.MediaSessionCompatQueueItem;
        }
        int i3 = 55 / 0;
        return this.MediaSessionCompatQueueItem;
    }

    public getCenterPIaL0Z0(getQueryContext getquerycontext, accessgetParagraphcp accessgetparagraphcp, i8 i8Var, ib ibVar, getLooseusljTpc getlooseusljtpc, ContextScope contextScope, setTransactionSuccessful settransactionsuccessful) {
        this.IconCompatParcelizer = getquerycontext;
        this.RatingCompat = accessgetparagraphcp;
        this.write = i8Var;
        this.serializer = ibVar;
        this.MediaDescriptionCompat = getlooseusljtpc;
        this.MediaMetadataCompat = new isAdapterPositionOnScreen(new GoAndStartDataStoreFactory$$ExternalSyntheticLambda1(5, settransactionsuccessful));
        ShortNewsContentCardView shortNewsContentCardView = null;
        MutableStateFlow mutableStateFlow = StateFlowKt.read(null);
        this.read = mutableStateFlow;
        this.RemoteActionCompatParcelizer = mutableStateFlow;
        BuildersKt.RemoteActionCompatParcelizer(contextScope, null, null, new NavigationRecenterUiModelImpl$1(this, shortNewsContentCardView, 0), 3);
        BuildersKt.RemoteActionCompatParcelizer(contextScope, null, null, new NavigationRecenterUiModelImpl$1(this, shortNewsContentCardView, 1), 3);
    }
}
