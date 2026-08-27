package o;

import androidx.datastore.core.SingleProcessDataStore$data$1;
import io.sentry.util.UrlUtils;
import java.util.concurrent.atomic.AtomicReference;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.internal.MainDispatcherLoader;
import kotlinx.coroutines.scheduling.DefaultScheduler;

/* JADX INFO: loaded from: classes.dex */
public abstract class toBitmapConfig1JJdX4A {
    public static final getIntentArrayWithConfiguredBackStacklambda4 write = new getIntentArrayWithConfiguredBackStacklambda4(3);

    public static final asComposePaint IconCompatParcelizer(androidx.lifecycle.ViewModel viewModel) {
        asComposePaint ascomposepaint;
        viewModel.getClass();
        synchronized (write) {
            ascomposepaint = (asComposePaint) viewModel.getCloseable("androidx.lifecycle.viewmodel.internal.ViewModelCoroutineScope.JOB_KEY");
            if (ascomposepaint == null) {
                TextAnnouncementContentCardView textAnnouncementContentCardViewIconCompatParcelizer = r8lambda2qMxD75IpTxKfLD4RjAbqEmoamc.write;
                try {
                    DefaultScheduler defaultScheduler = prepareForActivityTransitionCarryover.RemoteActionCompatParcelizer;
                    textAnnouncementContentCardViewIconCompatParcelizer = MainDispatcherLoader.read.IconCompatParcelizer();
                } catch (IllegalStateException | getCardAtIndex unused) {
                }
                asComposePaint ascomposepaint2 = new asComposePaint(textAnnouncementContentCardViewIconCompatParcelizer.plus(UrlUtils.serializer()));
                viewModel.addCloseable("androidx.lifecycle.viewmodel.internal.ViewModelCoroutineScope.JOB_KEY", ascomposepaint2);
                ascomposepaint = ascomposepaint2;
            }
        }
        return ascomposepaint;
    }

    public static final fromColorLong read(supportsColorMatrixQuery supportscolormatrixquery) {
        supportscolormatrixquery.getClass();
        toRegionOp7u2Bmg toregionop7u2bmg = supportscolormatrixquery.read;
        while (true) {
            fromColorLong fromcolorlong = (fromColorLong) ((AtomicReference) toregionop7u2bmg.write).get();
            if (fromcolorlong != null) {
                return fromcolorlong;
            }
            onBackInvokedlambda0 onbackinvokedlambda0Serializer = UrlUtils.serializer();
            DefaultScheduler defaultScheduler = prepareForActivityTransitionCarryover.RemoteActionCompatParcelizer;
            fromColorLong fromcolorlong2 = new fromColorLong(supportscolormatrixquery, androidx.room.Room.read(onbackinvokedlambda0Serializer, MainDispatcherLoader.read.IconCompatParcelizer()));
            AtomicReference atomicReference = (AtomicReference) toregionop7u2bmg.write;
            do {
                ShortNewsContentCardView shortNewsContentCardView = null;
                if (atomicReference.compareAndSet(null, fromcolorlong2)) {
                    DefaultScheduler defaultScheduler2 = prepareForActivityTransitionCarryover.RemoteActionCompatParcelizer;
                    BuildersKt.RemoteActionCompatParcelizer(fromcolorlong2, MainDispatcherLoader.read.IconCompatParcelizer(), null, new SingleProcessDataStore$data$1.AnonymousClass1(fromcolorlong2, shortNewsContentCardView, 1), 2);
                    return fromcolorlong2;
                }
            } while (atomicReference.get() == null);
        }
    }
}
