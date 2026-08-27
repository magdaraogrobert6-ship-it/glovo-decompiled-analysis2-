package com.deliveryhero.selfServiceChat.ui;

import kotlin.coroutines.jvm.internal.SuspendLambda;
import o.ShortNewsContentCardView;
import o.createFromParcel;
import o.getContentViewGroupParentLayout;
import o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0;

/* JADX INFO: loaded from: classes2.dex */
public final class WebChatViewmodel$fetchChatURL$1 extends SuspendLambda implements r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 {
    public final /* synthetic */ WebChatViewmodel IconCompatParcelizer;
    public final /* synthetic */ int serializer;
    public int write;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ WebChatViewmodel$fetchChatURL$1(WebChatViewmodel webChatViewmodel, ShortNewsContentCardView shortNewsContentCardView, int i) {
        super(2, shortNewsContentCardView);
        this.serializer = i;
        this.IconCompatParcelizer = webChatViewmodel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final ShortNewsContentCardView create(Object obj, ShortNewsContentCardView shortNewsContentCardView) {
        int i = this.serializer;
        WebChatViewmodel webChatViewmodel = this.IconCompatParcelizer;
        if (i == 0) {
            return new WebChatViewmodel$fetchChatURL$1(webChatViewmodel, shortNewsContentCardView, 0);
        }
        int i2 = 1;
        if (i != 1) {
            return i != 2 ? new WebChatViewmodel$fetchChatURL$1(webChatViewmodel, shortNewsContentCardView, 3) : new WebChatViewmodel$fetchChatURL$1(webChatViewmodel, shortNewsContentCardView, 2);
        }
        return new WebChatViewmodel$fetchChatURL$1(webChatViewmodel, shortNewsContentCardView, i2);
    }

    @Override // o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0
    public final Object invoke(Object obj, Object obj2) {
        int i = this.serializer;
        createFromParcel createfromparcel = createFromParcel.INSTANCE;
        getContentViewGroupParentLayout getcontentviewgroupparentlayout = (getContentViewGroupParentLayout) obj;
        ShortNewsContentCardView shortNewsContentCardView = (ShortNewsContentCardView) obj2;
        if (i == 0) {
            return ((WebChatViewmodel$fetchChatURL$1) create(getcontentviewgroupparentlayout, shortNewsContentCardView)).invokeSuspend(createfromparcel);
        }
        if (i != 1) {
            return i != 2 ? ((WebChatViewmodel$fetchChatURL$1) create(getcontentviewgroupparentlayout, shortNewsContentCardView)).invokeSuspend(createfromparcel) : ((WebChatViewmodel$fetchChatURL$1) create(getcontentviewgroupparentlayout, shortNewsContentCardView)).invokeSuspend(createfromparcel);
        }
        return ((WebChatViewmodel$fetchChatURL$1) create(getcontentviewgroupparentlayout, shortNewsContentCardView)).invokeSuspend(createfromparcel);
    }

    /* JADX WARN: Code restructure failed: missing block: B:56:0x00ee, code lost:
    
        if (r4 == r1) goto L61;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x0102, code lost:
    
        if (r4 == r1) goto L61;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r18) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 323
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.deliveryhero.selfServiceChat.ui.WebChatViewmodel$fetchChatURL$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
