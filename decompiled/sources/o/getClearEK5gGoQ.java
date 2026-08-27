package o;

import android.content.Context;
import android.os.RemoteException;
import coil3.ComponentRegistry$Builder;
import coil3.ImageLoader$Builder;
import io.grpc.Status;
import io.grpc.internal.CallTracer;
import io.sentry.metrics.MetricsBatchProcessor;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;

/* JADX INFO: loaded from: classes2.dex */
public final class getClearEK5gGoQ implements Runnable {
    public final /* synthetic */ Object IconCompatParcelizer;
    public final /* synthetic */ Object RatingCompat;
    public final /* synthetic */ Object RemoteActionCompatParcelizer;
    public final /* synthetic */ Object read;
    public final /* synthetic */ int serializer;
    public final /* synthetic */ Object write;

    public /* synthetic */ getClearEK5gGoQ(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, int i) {
        this.serializer = i;
        this.IconCompatParcelizer = obj2;
        this.RemoteActionCompatParcelizer = obj3;
        this.write = obj4;
        this.read = obj5;
        this.RatingCompat = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean z;
        Status status;
        if (this.serializer != 0) {
            for (handleUrlOverridelambda00 handleurloverridelambda00 : (Collection) this.IconCompatParcelizer) {
                if (handleurloverridelambda00 != ((handleUrlOverridelambda00) this.RemoteActionCompatParcelizer)) {
                    handleurloverridelambda00.IconCompatParcelizer.RemoteActionCompatParcelizer(replacePrefetchedUrlsWithLocalAssetslambda1.RemoteActionCompatParcelizer);
                }
            }
            Future future = (Future) this.write;
            if (future != null) {
                future.cancel(false);
            }
            Future future2 = (Future) this.read;
            if (future2 != null) {
                future2.cancel(false);
            }
            replacePrefetchedUrlsWithLocalAssetslambda1 replaceprefetchedurlswithlocalassetslambda1 = (replacePrefetchedUrlsWithLocalAssetslambda1) this.RatingCompat;
            CallTracer callTracer = ((hasTooManyZipEntrieslambda0) replaceprefetchedurlswithlocalassetslambda1.r8lambdawJ5MHcSJed_CjC7r4OWD0UxyJsQ.IconCompatParcelizer).getDefaultViewModelCreationExtras;
            synchronized (callTracer.RemoteActionCompatParcelizer) {
                ((HashSet) callTracer.write).remove(replaceprefetchedurlswithlocalassetslambda1);
                if (((HashSet) callTracer.write).isEmpty()) {
                    status = (Status) callTracer.serializer;
                    callTracer.write = new HashSet();
                } else {
                    status = null;
                }
            }
            if (status != null) {
                ((hasTooManyZipEntrieslambda0) callTracer.IconCompatParcelizer).r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM.RemoteActionCompatParcelizer(status);
                return;
            }
            return;
        }
        String str = (String) this.IconCompatParcelizer;
        getChannelUpEK5gGoQ getchannelupek5ggoq = (getChannelUpEK5gGoQ) this.RatingCompat;
        Context context = getchannelupek5ggoq.MediaDescriptionCompat;
        HashMap map = getchannelupek5ggoq.read;
        try {
            if (!map.containsKey(str)) {
                MetricsBatchProcessor metricsBatchProcessor = getchannelupek5ggoq.IconCompatParcelizer;
                String str2 = (String) this.RemoteActionCompatParcelizer;
                String str3 = (String) this.write;
                Context context2 = (Context) metricsBatchProcessor.RemoteActionCompatParcelizer;
                setLastReportedResult setlastreportedresult = (setLastReportedResult) metricsBatchProcessor.MediaSessionCompatQueueItem;
                OnVisibilityChangedNode onVisibilityChangedNode = (OnVisibilityChangedNode) metricsBatchProcessor.IconCompatParcelizer;
                ImageLoader$Builder imageLoader$Builder = new ImageLoader$Builder();
                imageLoader$Builder.RemoteActionCompatParcelizer = context2.getApplicationContext();
                imageLoader$Builder.read = setlastreportedresult;
                imageLoader$Builder.serializer = onVisibilityChangedNode;
                imageLoader$Builder.IconCompatParcelizer = str;
                map.put(str, new getButton6EK5gGoQ(context2, str, str2, str3, imageLoader$Builder, (ComponentRegistry$Builder) metricsBatchProcessor.serializer, (ExecutorService) metricsBatchProcessor.write, (ScheduledExecutorService) metricsBatchProcessor.read, setlastreportedresult, new androidx.emoji2.text.EmojiProcessor(context2, str)));
            }
            z = true;
        } catch (Exception e) {
            getButton5EK5gGoQ.IconCompatParcelizer("Fail to load container: ", e, context);
            z = false;
        }
        try {
            getButtonR1EK5gGoQ getbuttonr1ek5ggoq = (getButtonR1EK5gGoQ) this.read;
            if (getbuttonr1ek5ggoq != null) {
                getbuttonr1ek5ggoq.RemoteActionCompatParcelizer(str, z);
            }
        } catch (RemoteException e2) {
            getButton5EK5gGoQ.IconCompatParcelizer("Error relaying callback: ", e2, context);
        }
    }
}
