package o;

import kotlinx.coroutines.JobKt;
import kotlinx.coroutines.JobNode;

/* JADX INFO: loaded from: classes4.dex */
public final class DefaultInAppMessageViewWrapperopen2 extends JobNode {
    public final DefaultInAppMessageViewWrappercreateAnimationListener1 read;

    @Override // kotlinx.coroutines.JobNode
    public final boolean write() {
        return false;
    }

    public DefaultInAppMessageViewWrapperopen2(DefaultInAppMessageViewWrappercreateAnimationListener1 defaultInAppMessageViewWrappercreateAnimationListener1) {
        this.read = defaultInAppMessageViewWrappercreateAnimationListener1;
    }

    @Override // kotlinx.coroutines.JobNode
    public final void write(Throwable th) {
        Object objParcelableVolumeInfo = serializer().ParcelableVolumeInfo();
        boolean z = objParcelableVolumeInfo instanceof getClosingAnimation;
        DefaultInAppMessageViewWrappercreateAnimationListener1 defaultInAppMessageViewWrappercreateAnimationListener1 = this.read;
        if (z) {
            defaultInAppMessageViewWrappercreateAnimationListener1.resumeWith(coil3.ExtrasKt.IconCompatParcelizer(((getClosingAnimation) objParcelableVolumeInfo).IconCompatParcelizer));
        } else {
            defaultInAppMessageViewWrappercreateAnimationListener1.resumeWith(JobKt.IconCompatParcelizer(objParcelableVolumeInfo));
        }
    }
}
