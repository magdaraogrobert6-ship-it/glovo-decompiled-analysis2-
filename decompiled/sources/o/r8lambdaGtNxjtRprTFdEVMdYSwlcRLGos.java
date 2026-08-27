package o;

import kotlinx.coroutines.JobNode;
import kotlinx.coroutines.JobSupport;
import kotlinx.coroutines.internal.LockFreeLinkedListNode;

/* JADX INFO: loaded from: classes4.dex */
public final class r8lambdaGtNxjtRprTFdEVMdYSwlcRLGos extends JobNode {
    public final JobSupport IconCompatParcelizer;
    public final r8lambdazRF3Eyf8XtuPIGvrZsQQmZtLk RemoteActionCompatParcelizer;
    public final Object read;
    public final getClickableInAppMessageView serializer;

    @Override // kotlinx.coroutines.JobNode
    public final boolean write() {
        return false;
    }

    @Override // kotlinx.coroutines.JobNode
    public final void write(Throwable th) {
        getClickableInAppMessageView getclickableinappmessageview = this.serializer;
        getClickableInAppMessageView getclickableinappmessageview2 = JobSupport.read((LockFreeLinkedListNode) getclickableinappmessageview);
        JobSupport jobSupport = this.IconCompatParcelizer;
        r8lambdazRF3Eyf8XtuPIGvrZsQQmZtLk r8lambdazrf3eyf8xtupigvrzsqqmztlk = this.RemoteActionCompatParcelizer;
        Object obj = this.read;
        if (getclickableinappmessageview2 == null || !jobSupport.serializer(r8lambdazrf3eyf8xtupigvrzsqqmztlk, getclickableinappmessageview2, obj)) {
            r8lambdazrf3eyf8xtupigvrzsqqmztlk.RatingCompat.IconCompatParcelizer(2);
            getClickableInAppMessageView getclickableinappmessageview3 = JobSupport.read((LockFreeLinkedListNode) getclickableinappmessageview);
            if (getclickableinappmessageview3 == null || !jobSupport.serializer(r8lambdazrf3eyf8xtupigvrzsqqmztlk, getclickableinappmessageview3, obj)) {
                jobSupport.RemoteActionCompatParcelizer(jobSupport.serializer(r8lambdazrf3eyf8xtupigvrzsqqmztlk, obj));
            }
        }
    }

    public r8lambdaGtNxjtRprTFdEVMdYSwlcRLGos(JobSupport jobSupport, r8lambdazRF3Eyf8XtuPIGvrZsQQmZtLk r8lambdazrf3eyf8xtupigvrzsqqmztlk, getClickableInAppMessageView getclickableinappmessageview, Object obj) {
        this.IconCompatParcelizer = jobSupport;
        this.RemoteActionCompatParcelizer = r8lambdazrf3eyf8xtupigvrzsqqmztlk;
        this.serializer = getclickableinappmessageview;
        this.read = obj;
    }
}
