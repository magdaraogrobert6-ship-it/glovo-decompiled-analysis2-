package o;

import com.deliveryhero.perseus.core.config.DefaultPerseusConfigProvider;
import com.deliveryhero.perseus.core.session.AppSessionManagerImpl;
import com.deliveryhero.perseus.core.session.ClientIdProviderImpl;
import com.google.gson.Gson;
import kotlinx.coroutines.scheduling.DefaultIoScheduler;

/* JADX INFO: loaded from: classes2.dex */
public abstract class updateRenderPath {
    public static final isAdapterPositionOnScreen RemoteActionCompatParcelizer = new isAdapterPositionOnScreen(new onAddedToParentLayer(15));
    public static final isAdapterPositionOnScreen serializer = new isAdapterPositionOnScreen(new onAddedToParentLayer(16));
    public static final isAdapterPositionOnScreen IconCompatParcelizer = new isAdapterPositionOnScreen(new onAddedToParentLayer(17));
    public static final DefaultPerseusConfigProvider MediaSessionCompatQueueItem = DefaultPerseusConfigProvider.RemoteActionCompatParcelizer;
    public static final addPathoIyEayM write = addPathoIyEayM.IconCompatParcelizer;
    public static final DefaultIoScheduler MediaMetadataCompat = DefaultIoScheduler.RemoteActionCompatParcelizer;
    public static final isAdapterPositionOnScreen read = new isAdapterPositionOnScreen(new onAddedToParentLayer(18));

    public static AppSessionManagerImpl IconCompatParcelizer() {
        return (AppSessionManagerImpl) RemoteActionCompatParcelizer.MediaSessionCompatResultReceiverWrapper();
    }

    public static ClientIdProviderImpl read() {
        return (ClientIdProviderImpl) serializer.MediaSessionCompatResultReceiverWrapper();
    }

    public static Gson serializer() {
        Object objMediaSessionCompatResultReceiverWrapper = read.MediaSessionCompatResultReceiverWrapper();
        objMediaSessionCompatResultReceiverWrapper.getClass();
        return (Gson) objMediaSessionCompatResultReceiverWrapper;
    }
}
