package kotlinx.coroutines;

import kotlin.text.RegexKt;
import kotlinx.coroutines.internal.LockFreeLinkedListNode;
import o.DefaultInAppMessageViewWrapperWhenMappings;
import o.DefaultInAppMessageViewWrappercreateDismissCallbacks1;
import o.getBitmapFromCache;
import o.removeNodeAtDepth;
import o.setAllViewGroupChildrenAsNonAccessibilityImportantlambda0;
import o.setAndStartAnimation;

/* JADX INFO: loaded from: classes4.dex */
public abstract class JobNode extends LockFreeLinkedListNode implements setAndStartAnimation, DefaultInAppMessageViewWrapperWhenMappings {
    public JobSupport RatingCompat;

    public setAllViewGroupChildrenAsNonAccessibilityImportantlambda0 E_() {
        return serializer();
    }

    @Override // o.DefaultInAppMessageViewWrapperWhenMappings
    public final boolean F_() {
        return true;
    }

    @Override // o.DefaultInAppMessageViewWrapperWhenMappings
    public final DefaultInAppMessageViewWrappercreateDismissCallbacks1 read() {
        return null;
    }

    public abstract void write(Throwable th);

    public abstract boolean write();

    @Override // kotlinx.coroutines.internal.LockFreeLinkedListNode
    public final String toString() {
        return getClass().getSimpleName() + '@' + RegexKt.IconCompatParcelizer(this) + "[job@" + RegexKt.IconCompatParcelizer(serializer()) + ']';
    }

    @Override // o.setAndStartAnimation
    public final void RemoteActionCompatParcelizer() {
        Object objParcelableVolumeInfo;
        JobSupport jobSupportSerializer = serializer();
        do {
            objParcelableVolumeInfo = jobSupportSerializer.ParcelableVolumeInfo();
            if (!(objParcelableVolumeInfo instanceof JobNode)) {
                if (!(objParcelableVolumeInfo instanceof DefaultInAppMessageViewWrapperWhenMappings) || ((DefaultInAppMessageViewWrapperWhenMappings) objParcelableVolumeInfo).read() == null) {
                    return;
                }
                MediaMetadataCompat();
                return;
            }
            if (objParcelableVolumeInfo != this) {
                return;
            }
        } while (!getBitmapFromCache.write(JobSupport.MediaMetadataCompat, jobSupportSerializer, (JobNode) objParcelableVolumeInfo));
    }

    public final JobSupport serializer() {
        JobSupport jobSupport = this.RatingCompat;
        if (jobSupport != null) {
            return jobSupport;
        }
        removeNodeAtDepth.serializer("job");
        throw null;
    }
}
