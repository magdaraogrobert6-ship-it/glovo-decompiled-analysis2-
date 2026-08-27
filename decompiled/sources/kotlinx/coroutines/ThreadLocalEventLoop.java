package kotlinx.coroutines;

import o.closeInAppMessageView;

/* JADX INFO: loaded from: classes4.dex */
public abstract class ThreadLocalEventLoop {
    public static final ThreadLocal RemoteActionCompatParcelizer = new ThreadLocal();

    public static EventLoop write() {
        ThreadLocal threadLocal = RemoteActionCompatParcelizer;
        EventLoop eventLoop = (EventLoop) threadLocal.get();
        if (eventLoop != null) {
            return eventLoop;
        }
        closeInAppMessageView closeinappmessageview = new closeInAppMessageView(Thread.currentThread());
        threadLocal.set(closeinappmessageview);
        return closeinappmessageview;
    }
}
