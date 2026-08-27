package o;

import android.app.Application;
import android.content.IntentFilter;
import coil3.ImageLoader$Builder$$ExternalSyntheticLambda1;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import org.koin.dsl.ModuleDSLKt;
import timber.log.Timber;

/* JADX INFO: loaded from: classes3.dex */
public final class setVerticalStyle implements SemanticsInfo {
    private static int IconCompatParcelizer = 0;
    private static int MediaDescriptionCompat = 1;
    public final Application read;
    public final getAllSemanticsNodesToMap write;
    public final MutableStateFlow serializer = StateFlowKt.read(new onViewAttachedToWindowlambda0(Boolean.TRUE, Long.valueOf(System.currentTimeMillis())));
    public final isAdapterPositionOnScreen RemoteActionCompatParcelizer = new isAdapterPositionOnScreen(new ImageLoader$Builder$$ExternalSyntheticLambda1(23, this));

    public setVerticalStyle(Application application, getAllSemanticsNodesToMap getallsemanticsnodestomap) {
        this.read = application;
        this.write = getallsemanticsnodestomap;
    }

    public final setPaddingTop write() {
        int i = 2 % 2;
        int i2 = IconCompatParcelizer + 21;
        MediaDescriptionCompat = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        setPaddingTop setpaddingtop = (setPaddingTop) this.RemoteActionCompatParcelizer.MediaSessionCompatResultReceiverWrapper();
        int i4 = IconCompatParcelizer + 59;
        MediaDescriptionCompat = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 != 0) {
            return setpaddingtop;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // o.SemanticsInfo
    public final Object init(ShortNewsContentCardView shortNewsContentCardView) {
        int i = 2 % 2;
        lowestNode lowestnode = new lowestNode(1, this);
        IntentFilter intentFilter = new IntentFilter("android.intent.action.AIRPLANE_MODE");
        Application application = this.read;
        application.registerReceiver(lowestnode, intentFilter);
        Timber.RemoteActionCompatParcelizer.IconCompatParcelizer("Devices is using " + write() + " mobile service", new Object[0]);
        ModuleDSLKt.RemoteActionCompatParcelizer(application);
        createFromParcel createfromparcel = createFromParcel.INSTANCE;
        int i2 = MediaDescriptionCompat + 1;
        IconCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            return createfromparcel;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }
}
