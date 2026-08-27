package o;

import android.app.Application;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import com.roadrunner.delivery.ontheway.turnbyturn.ui.switcher.SwitcherUiModelImpl$1;
import com.sentiance.core.model.events.H$b;
import java.time.Clock;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;

/* JADX INFO: loaded from: classes3.dex */
public final class isEditorFocused extends androidx.lifecycle.ViewModel {
    private static int MediaSessionCompatToken = 1;
    private static int PlaybackStateCompatCustomAction;
    public final MutableStateFlow IconCompatParcelizer;
    public final copy3r_uNRQdefault MediaBrowserCompatMediaItem;
    public final getQueryContext MediaDescriptionCompat;
    public final getRearDisplayMetrics MediaMetadataCompat;
    public final transferSessionPackageI MediaSessionCompatQueueItem;
    public final H$b MediaSessionCompatResultReceiverWrapper;
    public final StateFlow ParcelableVolumeInfo;
    public final setTransactionSuccessful PlaybackStateCompat;
    public final getDoneeUduSuo RatingCompat;
    public final Application RemoteActionCompatParcelizer;
    public final ArrayList read;
    public final String serializer;
    public final Clock write;

    public isEditorFocused(Application application, getQueryContext getquerycontext, copy3r_uNRQdefault copy3r_unrqdefault, setTransactionSuccessful settransactionsuccessful, H$b h$b, getRearDisplayMetrics getreardisplaymetrics, Clock clock, getDoneeUduSuo getdoneeudusuo, transferSessionPackageI transfersessionpackagei, getBitmapui_graphics getbitmapui_graphics) {
        application.getClass();
        getquerycontext.getClass();
        copy3r_unrqdefault.getClass();
        settransactionsuccessful.getClass();
        h$b.getClass();
        getreardisplaymetrics.getClass();
        clock.getClass();
        getdoneeudusuo.getClass();
        transfersessionpackagei.getClass();
        getbitmapui_graphics.getClass();
        this.RemoteActionCompatParcelizer = application;
        this.MediaDescriptionCompat = getquerycontext;
        this.MediaBrowserCompatMediaItem = copy3r_unrqdefault;
        this.PlaybackStateCompat = settransactionsuccessful;
        this.MediaSessionCompatResultReceiverWrapper = h$b;
        this.MediaMetadataCompat = getreardisplaymetrics;
        this.write = clock;
        this.RatingCompat = getdoneeudusuo;
        this.MediaSessionCompatQueueItem = transfersessionpackagei;
        Object objWrite = getbitmapui_graphics.write("address");
        ShortNewsContentCardView shortNewsContentCardView = null;
        if (objWrite == null) {
            ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer("Content sharing can't be opened without address");
            throw null;
        }
        this.serializer = (String) objWrite;
        this.read = new ArrayList();
        MutableStateFlow mutableStateFlow = StateFlowKt.read(r8lambdazNpvCQLl1ENH3QB4YtK5xCBYq3w.IconCompatParcelizer);
        this.IconCompatParcelizer = mutableStateFlow;
        this.ParcelableVolumeInfo = mutableStateFlow;
        BuildersKt.RemoteActionCompatParcelizer(toBitmapConfig1JJdX4A.IconCompatParcelizer(this), null, null, new SwitcherUiModelImpl$1(this, shortNewsContentCardView, 6), 3);
        int i = MediaSessionCompatToken + 35;
        PlaybackStateCompatCustomAction = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i2 = i % 2;
    }

    public final r8lambda9QlT_ra9FwUEV5vl9YtC6BGxtDk write(int i) {
        int i2 = 2 % 2;
        int iSerializer = getQueryParameterslambda2.serializer();
        int iSerializer2 = getQueryParameterslambda2.serializer();
        BaseContentCardViewExternalSyntheticLambda0 baseContentCardViewExternalSyntheticLambda0 = (BaseContentCardViewExternalSyntheticLambda0) androidx.sqlite.SQLite.write(getQueryParameterslambda2.serializer(), iSerializer2, -1169780863, new Object[0], getQueryParameterslambda2.serializer(), 1169780871, iSerializer);
        ArrayList arrayList = this.read;
        Iterator it = arrayList.iterator();
        int i3 = MediaSessionCompatToken + 9;
        PlaybackStateCompatCustomAction = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i4 = i3 % 2;
        while (it.hasNext()) {
            baseContentCardViewExternalSyntheticLambda0.add(new processInputCommandsapplyToState(((TextFieldValueCompanion) it.next()).path));
            int i5 = PlaybackStateCompatCustomAction + 59;
            MediaSessionCompatToken = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            if (i5 % 2 == 0) {
                int i6 = 5 % 4;
            }
        }
        if (arrayList.size() < i) {
            baseContentCardViewExternalSyntheticLambda0.add(accessgetOnImeActionPerformedp.read);
        }
        return removeNodeAtDepth.RemoteActionCompatParcelizer(androidx.sqlite.SQLite.serializer((List) baseContentCardViewExternalSyntheticLambda0));
    }
}
