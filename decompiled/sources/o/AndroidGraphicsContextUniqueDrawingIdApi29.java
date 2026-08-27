package o;

import androidx.lifecycle.PausingDispatcherKt$whenStateAtLeast$2;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CancellableContinuationImpl;
import kotlinx.coroutines.sync.MutexImpl;

/* JADX INFO: loaded from: classes.dex */
public final class AndroidGraphicsContextUniqueDrawingIdApi29 implements toAndroidColorSpace {
    public final /* synthetic */ AndroidColorSpace_androidKt IconCompatParcelizer;
    public final /* synthetic */ MutexImpl MediaBrowserCompatMediaItem;
    public final /* synthetic */ AndroidColorSpace_androidKt RatingCompat;
    public final /* synthetic */ createInAppMessageEventSubscriber RemoteActionCompatParcelizer;
    public final /* synthetic */ getContentViewGroupParentLayout read;
    public final /* synthetic */ CancellableContinuationImpl serializer;
    public final /* synthetic */ r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 write;

    @Override // o.toAndroidColorSpace
    public final void onStateChanged(accessisRenderNodeCompatiblecp accessisrendernodecompatiblecp, AndroidColorSpace_androidKt androidColorSpace_androidKt) {
        AndroidColorSpace_androidKt androidColorSpace_androidKt2 = this.RatingCompat;
        createInAppMessageEventSubscriber createinappmessageeventsubscriber = this.RemoteActionCompatParcelizer;
        if (androidColorSpace_androidKt == androidColorSpace_androidKt2) {
            createinappmessageeventsubscriber.IconCompatParcelizer = BuildersKt.RemoteActionCompatParcelizer(this.read, null, null, new PausingDispatcherKt$whenStateAtLeast$2(this.MediaBrowserCompatMediaItem, this.write, (ShortNewsContentCardView) null), 3);
            return;
        }
        if (androidColorSpace_androidKt == this.IconCompatParcelizer) {
            setAllViewGroupChildrenAsNonAccessibilityImportantlambda0 setallviewgroupchildrenasnonaccessibilityimportantlambda0 = (setAllViewGroupChildrenAsNonAccessibilityImportantlambda0) createinappmessageeventsubscriber.IconCompatParcelizer;
            if (setallviewgroupchildrenasnonaccessibilityimportantlambda0 != null) {
                setallviewgroupchildrenasnonaccessibilityimportantlambda0.write(null);
            }
            createinappmessageeventsubscriber.IconCompatParcelizer = null;
        }
        if (androidColorSpace_androidKt == AndroidColorSpace_androidKt.ON_DESTROY) {
            this.serializer.resumeWith(createFromParcel.INSTANCE);
        }
    }

    public AndroidGraphicsContextUniqueDrawingIdApi29(AndroidColorSpace_androidKt androidColorSpace_androidKt, createInAppMessageEventSubscriber createinappmessageeventsubscriber, getContentViewGroupParentLayout getcontentviewgroupparentlayout, AndroidColorSpace_androidKt androidColorSpace_androidKt2, CancellableContinuationImpl cancellableContinuationImpl, MutexImpl mutexImpl, r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 r8lambdaa6_tctqmksh3fk6hjgcbkuvde0) {
        this.RatingCompat = androidColorSpace_androidKt;
        this.RemoteActionCompatParcelizer = createinappmessageeventsubscriber;
        this.read = getcontentviewgroupparentlayout;
        this.IconCompatParcelizer = androidColorSpace_androidKt2;
        this.serializer = cancellableContinuationImpl;
        this.MediaBrowserCompatMediaItem = mutexImpl;
        this.write = r8lambdaa6_tctqmksh3fk6hjgcbkuvde0;
    }
}
