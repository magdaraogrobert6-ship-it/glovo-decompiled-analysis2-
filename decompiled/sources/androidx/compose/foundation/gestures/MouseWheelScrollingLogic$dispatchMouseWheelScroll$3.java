package androidx.compose.foundation.gestures;

import kotlin.coroutines.jvm.internal.SuspendLambda;
import o.ShortNewsContentCardView;
import o.SimpleLayoutKtSimpleLayout11;
import o.cancelPendingWebViewPause;
import o.cancelPendingWebViewPauselambda0;
import o.createFromParcel;
import o.createInAppMessageEventSubscriber;
import o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0;

/* JADX INFO: loaded from: classes.dex */
public final class MouseWheelScrollingLogic$dispatchMouseWheelScroll$3 extends SuspendLambda implements r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 {
    public final /* synthetic */ ScrollingLogic IconCompatParcelizer;
    public /* synthetic */ Object MediaBrowserCompatMediaItem;
    public int MediaDescriptionCompat;
    public final /* synthetic */ float MediaMetadataCompat;
    public cancelPendingWebViewPause MediaSessionCompatQueueItem;
    public final /* synthetic */ MouseWheelScrollingLogic MediaSessionCompatResultReceiverWrapper;
    public int MediaSessionCompatToken;
    public cancelPendingWebViewPause RatingCompat;
    public final /* synthetic */ createInAppMessageEventSubscriber RemoteActionCompatParcelizer;
    public final /* synthetic */ createInAppMessageEventSubscriber read;
    public final /* synthetic */ float serializer;
    public final /* synthetic */ cancelPendingWebViewPauselambda0 write;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MouseWheelScrollingLogic$dispatchMouseWheelScroll$3(cancelPendingWebViewPauselambda0 cancelpendingwebviewpauselambda0, createInAppMessageEventSubscriber createinappmessageeventsubscriber, createInAppMessageEventSubscriber createinappmessageeventsubscriber2, float f, MouseWheelScrollingLogic mouseWheelScrollingLogic, float f2, ScrollingLogic scrollingLogic, ShortNewsContentCardView shortNewsContentCardView) {
        super(2, shortNewsContentCardView);
        this.write = cancelpendingwebviewpauselambda0;
        this.read = createinappmessageeventsubscriber;
        this.RemoteActionCompatParcelizer = createinappmessageeventsubscriber2;
        this.MediaMetadataCompat = f;
        this.MediaSessionCompatResultReceiverWrapper = mouseWheelScrollingLogic;
        this.serializer = f2;
        this.IconCompatParcelizer = scrollingLogic;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final ShortNewsContentCardView create(Object obj, ShortNewsContentCardView shortNewsContentCardView) {
        MouseWheelScrollingLogic$dispatchMouseWheelScroll$3 mouseWheelScrollingLogic$dispatchMouseWheelScroll$3 = new MouseWheelScrollingLogic$dispatchMouseWheelScroll$3(this.write, this.read, this.RemoteActionCompatParcelizer, this.MediaMetadataCompat, this.MediaSessionCompatResultReceiverWrapper, this.serializer, this.IconCompatParcelizer, shortNewsContentCardView);
        mouseWheelScrollingLogic$dispatchMouseWheelScroll$3.MediaBrowserCompatMediaItem = obj;
        return mouseWheelScrollingLogic$dispatchMouseWheelScroll$3;
    }

    @Override // o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0
    public final Object invoke(Object obj, Object obj2) {
        return ((MouseWheelScrollingLogic$dispatchMouseWheelScroll$3) create((SimpleLayoutKtSimpleLayout11) obj, (ShortNewsContentCardView) obj2)).invokeSuspend(createFromParcel.INSTANCE);
    }

    /* JADX WARN: Code duplicated, block: B:15:0x0072  */
    /* JADX WARN: Code duplicated, block: B:17:0x0094  */
    /* JADX WARN: Code duplicated, block: B:39:0x01c4  */
    /* JADX WARN: Code duplicated, block: B:42:0x01eb  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:36:0x01b3 -> B:37:0x01b5). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:38:0x01c0 -> B:44:0x01f6). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object r29) {
        /*
            Method dump skipped, instruction units count: 511
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.MouseWheelScrollingLogic$dispatchMouseWheelScroll$3.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
