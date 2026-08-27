package o;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class getCloseButton implements r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 {
    public final /* synthetic */ int read;

    public /* synthetic */ getCloseButton(createInAppMessageEventSubscriber createinappmessageeventsubscriber, boolean z) {
        this.read = 0;
    }

    @Override // o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0
    public final Object invoke(Object obj, Object obj2) {
        int i = this.read;
        if (i == 0) {
            return ((TextAnnouncementContentCardView) obj).plus((ShortNewsContentCardViewViewHolder) obj2);
        }
        if (i != 1) {
            return ((TextAnnouncementContentCardView) obj).plus((ShortNewsContentCardViewViewHolder) obj2);
        }
        ((addInAppMessageViewToViewGrouplambda4) obj).getClass();
        ((addInAppMessageViewToViewGrouplambda4) obj2).getClass();
        return Boolean.TRUE;
    }

    public /* synthetic */ getCloseButton(int i) {
        this.read = i;
    }
}
