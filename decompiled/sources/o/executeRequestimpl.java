package o;

import android.content.Context;
import android.content.Intent;
import androidx.datastore.core.SingleProcessDataStore$data$1;
import bo.app.c8$$ExternalSyntheticOutline0;
import com.roadrunner.sidemenu.photoId.PhotoIdUiModelImpl$1$1;
import io.sentry.util.UrlUtils;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CancellationException;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.YieldKt;
import kotlinx.coroutines.internal.ContextScope;
import kotlinx.coroutines.internal.MainDispatcherLoader;
import kotlinx.coroutines.scheduling.DefaultIoScheduler;
import kotlinx.coroutines.scheduling.DefaultScheduler;
import timber.log.Timber;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class executeRequestimpl implements r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 {
    private static int RemoteActionCompatParcelizer = 0;
    private static int write = 1;
    public final /* synthetic */ int read;
    public final /* synthetic */ onFailure serializer;

    public /* synthetic */ executeRequestimpl(onFailure onfailure, int i) {
        this.read = i;
        this.serializer = onfailure;
    }

    @Override // o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0
    public final Object invoke() {
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 109;
        write = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        ShortNewsContentCardView shortNewsContentCardView = null;
        if (i2 % 2 == 0) {
            createFromParcel createfromparcel = createFromParcel.INSTANCE;
            throw null;
        }
        int i3 = this.read;
        createFromParcel createfromparcel2 = createFromParcel.INSTANCE;
        onFailure onfailure = this.serializer;
        if (i3 == 0) {
            accessdoFetch accessdofetch = onfailure.PlaybackStateCompat;
            Context context = onfailure.IconCompatParcelizer;
            context.getClass();
            accessdofetch.getClass();
            Timber.Forest forest = Timber.RemoteActionCompatParcelizer;
            forest.IconCompatParcelizer("Bringing overlay bubble to front", new Object[0]);
            accessdofetch.IconCompatParcelizer();
            accessdofetch.IconCompatParcelizer(context);
            forest.IconCompatParcelizer("Accept Overlay bubble attached to window", new Object[0]);
            SubcomposeAsyncImageKt subcomposeAsyncImageKt = onfailure.RatingCompat;
            List listPlaybackStateCompat = onContentCardDismissed.PlaybackStateCompat(subcomposeAsyncImageKt.IconCompatParcelizer.RemoteActionCompatParcelizer);
            forest.IconCompatParcelizer(c8$$ExternalSyntheticOutline0.m("Accept Overlay cancelling tagged notifications for tags: ", listPlaybackStateCompat), new Object[0]);
            ArrayList arrayListRemoteActionCompatParcelizer = onContentCardDismissed.RemoteActionCompatParcelizer((Iterable) listPlaybackStateCompat);
            ArrayList<String> arrayList = new ArrayList();
            for (Object obj : arrayListRemoteActionCompatParcelizer) {
                int i4 = write + 23;
                RemoteActionCompatParcelizer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                int i5 = i4 % 2;
                if (((String) obj).length() > 0) {
                    int i6 = RemoteActionCompatParcelizer + 69;
                    write = i6 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                    if (i6 % 2 == 0) {
                        arrayList.add(obj);
                        shortNewsContentCardView.hashCode();
                        throw null;
                    }
                    arrayList.add(obj);
                }
            }
            s2 s2Var = subcomposeAsyncImageKt.write;
            for (String str : arrayList) {
                s0 s0Var = (s0) s2Var;
                s0Var.getClass();
                str.getClass();
                BuildersKt.RemoteActionCompatParcelizer(s0Var.serializer, null, null, new SingleProcessDataStore$data$1.AnonymousClass1(s0Var, str, shortNewsContentCardView, 27), 3);
            }
            AbstractContentPainterNode abstractContentPainterNode = onfailure.MediaSessionCompatResultReceiverWrapper;
            int i7 = abstractContentPainterNode.IconCompatParcelizer.IconCompatParcelizer;
            if (i7 != Integer.MIN_VALUE) {
                Timber.RemoteActionCompatParcelizer.IconCompatParcelizer(c8$$ExternalSyntheticOutline0.m(i7, "Accept Overlay playing notification sound "), new Object[0]);
                abstractContentPainterNode.write.read(i7);
            }
            Timber.RemoteActionCompatParcelizer.IconCompatParcelizer("Accept overlay view displayed", new Object[0]);
            return createfromparcel2;
        }
        if (i3 == 1) {
            accessdoFetch accessdofetch2 = onfailure.PlaybackStateCompat;
            Context context2 = onfailure.IconCompatParcelizer;
            context2.getClass();
            accessdofetch2.getClass();
            Timber.Forest forest2 = Timber.RemoteActionCompatParcelizer;
            forest2.IconCompatParcelizer("Bringing overlay bubble to front", new Object[0]);
            accessdofetch2.IconCompatParcelizer();
            accessdofetch2.IconCompatParcelizer(context2);
            forest2.IconCompatParcelizer("Accept Overlay bubble attached to window", new Object[0]);
            int i8 = RemoteActionCompatParcelizer + 39;
            write = i8 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            if (i8 % 2 != 0) {
                return createfromparcel2;
            }
            throw null;
        }
        if (i3 == 2) {
            q4ExternalSyntheticLambda9 q4externalsyntheticlambda9 = onfailure.ParcelableVolumeInfo;
            Context context3 = onfailure.IconCompatParcelizer;
            context3.getClass();
            q4ExternalSyntheticLambda9.RemoteActionCompatParcelizer(q4externalsyntheticlambda9, context3, null, null, 28);
            Timber.RemoteActionCompatParcelizer.IconCompatParcelizer("App opened from accept overlay", new Object[0]);
            return createfromparcel2;
        }
        if (i3 == 3) {
            onBackInvokedlambda0 onbackinvokedlambda0Serializer = UrlUtils.serializer();
            ((inCompatibilityMode) onfailure.MediaDescriptionCompat).getClass();
            DefaultScheduler defaultScheduler = prepareForActivityTransitionCarryover.RemoteActionCompatParcelizer;
            return YieldKt.RemoteActionCompatParcelizer(androidx.room.Room.read(onbackinvokedlambda0Serializer, MainDispatcherLoader.read));
        }
        q4ExternalSyntheticLambda9 q4externalsyntheticlambda10 = onfailure.ParcelableVolumeInfo;
        Context context4 = onfailure.IconCompatParcelizer;
        context4.getClass();
        Intent intentWrite = q4ExternalSyntheticLambda9.write(q4externalsyntheticlambda10, context4, null, false, 12);
        getContentViewGroupParentLayout getcontentviewgroupparentlayout = (getContentViewGroupParentLayout) onfailure.ResultReceiver.MediaSessionCompatResultReceiverWrapper();
        ((inCompatibilityMode) onfailure.MediaDescriptionCompat).getClass();
        DefaultScheduler defaultScheduler2 = prepareForActivityTransitionCarryover.RemoteActionCompatParcelizer;
        BuildersKt.RemoteActionCompatParcelizer(getcontentviewgroupparentlayout, DefaultIoScheduler.RemoteActionCompatParcelizer, null, new PhotoIdUiModelImpl$1$1(onfailure, intentWrite, shortNewsContentCardView, 8), 2);
        onfailure.RemoteActionCompatParcelizer("click on bubble");
        ContextScope contextScope = onfailure.MediaSessionCompatQueueItem;
        if (contextScope != null) {
            int i9 = RemoteActionCompatParcelizer + 55;
            write = i9 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            if (i9 % 2 == 0) {
                YieldKt.write(contextScope, (CancellationException) null);
                int i10 = 2 / 0;
            } else {
                YieldKt.write(contextScope, (CancellationException) null);
            }
            int i11 = RemoteActionCompatParcelizer + 41;
            write = i11 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i12 = i11 % 2;
        }
        onfailure.MediaSessionCompatQueueItem = null;
        Timber.RemoteActionCompatParcelizer.IconCompatParcelizer("OverlayTaskExecutor - stop called from ".concat("click on bubble"), new Object[0]);
        return createfromparcel2;
    }
}
