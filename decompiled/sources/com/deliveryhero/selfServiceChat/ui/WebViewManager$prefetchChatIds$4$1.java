package com.deliveryhero.selfServiceChat.ui;

import bo.app.ff$$ExternalSyntheticOutline0;
import coil3.ExtrasKt;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import com.deliveryhero.selfServiceChat.data.HelpcenterRemoteDataSourceImpl;
import com.deliveryhero.selfServiceChat.data.repository.ChatRepositoryImpl;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import o.LayerSnapshotV22;
import o.ShortNewsContentCardView;
import o.createFromParcel;
import o.getContentViewGroupParentLayout;
import o.isIdentityannotations;
import o.isItemDismissable;
import o.onItemDismiss;
import o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0;
import o.rgbEqualOWjLjI;

/* JADX INFO: loaded from: classes2.dex */
public final class WebViewManager$prefetchChatIds$4$1 extends SuspendLambda implements r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 {
    public int IconCompatParcelizer;
    public final /* synthetic */ String RemoteActionCompatParcelizer;
    public final /* synthetic */ WebViewManager read;
    public final /* synthetic */ int serializer;
    public /* synthetic */ Object write;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ WebViewManager$prefetchChatIds$4$1(WebViewManager webViewManager, String str, ShortNewsContentCardView shortNewsContentCardView, int i) {
        super(2, shortNewsContentCardView);
        this.serializer = i;
        this.read = webViewManager;
        this.RemoteActionCompatParcelizer = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final ShortNewsContentCardView create(Object obj, ShortNewsContentCardView shortNewsContentCardView) {
        int i = this.serializer;
        String str = this.RemoteActionCompatParcelizer;
        WebViewManager webViewManager = this.read;
        if (i != 0) {
            WebViewManager$prefetchChatIds$4$1 webViewManager$prefetchChatIds$4$1 = new WebViewManager$prefetchChatIds$4$1(webViewManager, str, shortNewsContentCardView, 1);
            webViewManager$prefetchChatIds$4$1.write = obj;
            return webViewManager$prefetchChatIds$4$1;
        }
        WebViewManager$prefetchChatIds$4$1 webViewManager$prefetchChatIds$4$2 = new WebViewManager$prefetchChatIds$4$1(webViewManager, str, shortNewsContentCardView, 0);
        webViewManager$prefetchChatIds$4$2.write = obj;
        return webViewManager$prefetchChatIds$4$2;
    }

    @Override // o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0
    public final Object invoke(Object obj, Object obj2) {
        int i = this.serializer;
        createFromParcel createfromparcel = createFromParcel.INSTANCE;
        getContentViewGroupParentLayout getcontentviewgroupparentlayout = (getContentViewGroupParentLayout) obj;
        ShortNewsContentCardView shortNewsContentCardView = (ShortNewsContentCardView) obj2;
        return i != 0 ? ((WebViewManager$prefetchChatIds$4$1) create(getcontentviewgroupparentlayout, shortNewsContentCardView)).invokeSuspend(createfromparcel) : ((WebViewManager$prefetchChatIds$4$1) create(getcontentviewgroupparentlayout, shortNewsContentCardView)).invokeSuspend(createfromparcel);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object isitemdismissable;
        isIdentityannotations isidentityannotations;
        Object isitemdismissable2;
        isIdentityannotations isidentityannotations2;
        int i = this.serializer;
        createFromParcel createfromparcel = createFromParcel.INSTANCE;
        WebViewManager webViewManager = this.read;
        String str = this.RemoteActionCompatParcelizer;
        if (i != 0) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i2 = this.IconCompatParcelizer;
            try {
                if (i2 == 0) {
                    ExtrasKt.RemoteActionCompatParcelizer(obj);
                    rgbEqualOWjLjI rgbequalowjlji = webViewManager.RemoteActionCompatParcelizer;
                    this.IconCompatParcelizer = 1;
                    obj = ((HelpcenterRemoteDataSourceImpl) ((ChatRepositoryImpl) rgbequalowjlji).write).getChatID(str, this);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i2 != 1) {
                        ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    ExtrasKt.RemoteActionCompatParcelizer(obj);
                }
                isitemdismissable2 = (String) obj;
            } catch (Throwable th) {
                isitemdismissable2 = new isItemDismissable(th);
            }
            Throwable thSerializer = onItemDismiss.serializer(isitemdismissable2);
            if (thSerializer == null || (isidentityannotations2 = webViewManager.serializer.serializer) == null) {
                return createfromparcel;
            }
            isidentityannotations2.RemoteActionCompatParcelizer(LayerSnapshotV22.ERROR, "WEB_PRELOADING", ff$$ExternalSyntheticOutline0.m("Failed to prefetch chatID for order: ", str, " (non-critical)"), thSerializer);
            return createfromparcel;
        }
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i3 = this.IconCompatParcelizer;
        try {
            if (i3 == 0) {
                ExtrasKt.RemoteActionCompatParcelizer(obj);
                rgbEqualOWjLjI rgbequalowjlji2 = webViewManager.RemoteActionCompatParcelizer;
                this.IconCompatParcelizer = 1;
                obj = ((HelpcenterRemoteDataSourceImpl) ((ChatRepositoryImpl) rgbequalowjlji2).write).getChatID(str, this);
                if (obj == coroutineSingletons2) {
                    return coroutineSingletons2;
                }
            } else {
                if (i3 != 1) {
                    ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                ExtrasKt.RemoteActionCompatParcelizer(obj);
            }
            isitemdismissable = (String) obj;
        } catch (Throwable th2) {
            isitemdismissable = new isItemDismissable(th2);
        }
        Throwable thSerializer2 = onItemDismiss.serializer(isitemdismissable);
        if (thSerializer2 == null || (isidentityannotations = webViewManager.serializer.serializer) == null) {
            return createfromparcel;
        }
        isidentityannotations.RemoteActionCompatParcelizer(LayerSnapshotV22.ERROR, "WEB_PRELOADING", ff$$ExternalSyntheticOutline0.m("Failed to prefetch chatID for order: ", str, " (non-critical)"), thSerializer2);
        return createfromparcel;
    }
}
