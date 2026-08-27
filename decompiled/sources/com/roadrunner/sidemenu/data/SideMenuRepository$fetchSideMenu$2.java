package com.roadrunner.sidemenu.data;

import androidx.compose.ui.graphics.Fields;
import coil3.ExtrasKt;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import o.ShortNewsContentCardView;
import o.createFromParcel;
import o.getContentViewGroupParentLayout;
import o.isItemDismissable;
import o.onItemDismiss;
import o.r8lambda3VVJpFrLw0gBk1Y7AUcJE0v96U;
import o.r8lambda4IULmTTPK1bcCxnRoHiqNFQ1OPA;
import o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0;
import o.r8lambdakQbp11wZ4ZjRP1b2DHSZXunsBM;

/* JADX INFO: loaded from: classes3.dex */
public final class SideMenuRepository$fetchSideMenu$2 extends SuspendLambda implements r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 {
    private static int MediaBrowserCompatMediaItem = 1;
    private static int MediaSessionCompatQueueItem;
    public long IconCompatParcelizer;
    public final /* synthetic */ SideMenuRepository MediaDescriptionCompat;
    public int RemoteActionCompatParcelizer;
    public SideMenuRepository read;
    public Object serializer;
    public int write;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SideMenuRepository$fetchSideMenu$2(SideMenuRepository sideMenuRepository, ShortNewsContentCardView shortNewsContentCardView) {
        super(2, shortNewsContentCardView);
        this.MediaDescriptionCompat = sideMenuRepository;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final ShortNewsContentCardView create(Object obj, ShortNewsContentCardView shortNewsContentCardView) {
        int i = 2 % 2;
        SideMenuRepository$fetchSideMenu$2 sideMenuRepository$fetchSideMenu$2 = new SideMenuRepository$fetchSideMenu$2(this.MediaDescriptionCompat, shortNewsContentCardView);
        int i2 = MediaSessionCompatQueueItem + 99;
        MediaBrowserCompatMediaItem = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        return sideMenuRepository$fetchSideMenu$2;
    }

    @Override // o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0
    public final Object invoke(Object obj, Object obj2) {
        Object objInvokeSuspend;
        int i = 2 % 2;
        int i2 = MediaSessionCompatQueueItem + 17;
        MediaBrowserCompatMediaItem = i2 % Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            objInvokeSuspend = ((SideMenuRepository$fetchSideMenu$2) create((getContentViewGroupParentLayout) obj, (ShortNewsContentCardView) obj2)).invokeSuspend(createFromParcel.INSTANCE);
            int i3 = 3 / 0;
        } else {
            objInvokeSuspend = ((SideMenuRepository$fetchSideMenu$2) create((getContentViewGroupParentLayout) obj, (ShortNewsContentCardView) obj2)).invokeSuspend(createFromParcel.INSTANCE);
        }
        int i4 = MediaBrowserCompatMediaItem + 87;
        MediaSessionCompatQueueItem = i4 % Fields.SpotShadowColor;
        if (i4 % 2 == 0) {
            return objInvokeSuspend;
        }
        throw null;
    }

    /* JADX WARN: Code duplicated, block: B:36:0x00c2  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object isitemdismissable;
        SideMenuRepository sideMenuRepository;
        int i;
        long j;
        Object obj2;
        SideMenuRepository sideMenuRepository2;
        int i2 = 2 % 2;
        int i3 = MediaBrowserCompatMediaItem + 63;
        MediaSessionCompatQueueItem = i3 % Fields.SpotShadowColor;
        Long lValueOf = null;
        if (i3 % 2 != 0) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            createFromParcel createfromparcel = createFromParcel.INSTANCE;
            throw null;
        }
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i4 = this.RemoteActionCompatParcelizer;
        createFromParcel createfromparcel2 = createFromParcel.INSTANCE;
        if (i4 == 0) {
            ExtrasKt.RemoteActionCompatParcelizer(obj);
            SideMenuRepository sideMenuRepository3 = this.MediaDescriptionCompat;
            r8lambda4IULmTTPK1bcCxnRoHiqNFQ1OPA r8lambda4iulmttpk1bccxnrohiqnfq1opaSerializer = ((r8lambda3VVJpFrLw0gBk1Y7AUcJE0v96U) sideMenuRepository3.serializer).RemoteActionCompatParcelizer.serializer();
            lValueOf = r8lambda4iulmttpk1bccxnrohiqnfq1opaSerializer != null ? Long.valueOf(r8lambda4iulmttpk1bccxnrohiqnfq1opaSerializer.read) : null;
            if (lValueOf != null) {
                long jLongValue = lValueOf.longValue();
                SideMenuApiRequest sideMenuApiRequest = sideMenuRepository3.write;
                this.read = sideMenuRepository3;
                this.IconCompatParcelizer = jLongValue;
                this.write = 0;
                this.RemoteActionCompatParcelizer = 1;
                Object objM5067getSideMenuIoAF18A = sideMenuApiRequest.m5067getSideMenuIoAF18A(this);
                if (objM5067getSideMenuIoAF18A == coroutineSingletons2) {
                    int i5 = MediaSessionCompatQueueItem + 107;
                    MediaBrowserCompatMediaItem = i5 % Fields.SpotShadowColor;
                    int i6 = i5 % 2;
                } else {
                    sideMenuRepository = sideMenuRepository3;
                    isitemdismissable = objM5067getSideMenuIoAF18A;
                    i = 0;
                    j = jLongValue;
                }
                return coroutineSingletons2;
            }
            isitemdismissable = new isItemDismissable(new IllegalStateException("Session is null"));
            return new onItemDismiss(isitemdismissable);
        }
        if (i4 == 1) {
            i = this.write;
            j = this.IconCompatParcelizer;
            sideMenuRepository = this.read;
            ExtrasKt.RemoteActionCompatParcelizer(obj);
            isitemdismissable = ((onItemDismiss) obj).IconCompatParcelizer;
            int i7 = MediaBrowserCompatMediaItem + 85;
            MediaSessionCompatQueueItem = i7 % Fields.SpotShadowColor;
            int i8 = i7 % 2;
        } else {
            if (i4 != 2) {
                ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            int i9 = MediaBrowserCompatMediaItem + 123;
            MediaSessionCompatQueueItem = i9 % Fields.SpotShadowColor;
            if (i9 % 2 != 0) {
                ExtrasKt.RemoteActionCompatParcelizer(obj);
                lValueOf.hashCode();
                throw null;
            }
            obj2 = this.serializer;
            sideMenuRepository2 = this.read;
            ExtrasKt.RemoteActionCompatParcelizer(obj);
        }
        isitemdismissable = obj2;
        sideMenuRepository = sideMenuRepository2;
        if (onItemDismiss.serializer(isitemdismissable) != null) {
            sideMenuRepository.IconCompatParcelizer.write(createfromparcel2);
        }
        return new onItemDismiss(isitemdismissable);
        if (!(isitemdismissable instanceof isItemDismissable)) {
            int i10 = MediaBrowserCompatMediaItem + 119;
            MediaSessionCompatQueueItem = i10 % Fields.SpotShadowColor;
            int i11 = i10 % 2;
            this.read = sideMenuRepository;
            this.serializer = isitemdismissable;
            this.IconCompatParcelizer = j;
            this.write = i;
            this.RemoteActionCompatParcelizer = 2;
            Object obj3 = sideMenuRepository.MediaDescriptionCompat.set(j, (r8lambdakQbp11wZ4ZjRP1b2DHSZXunsBM) isitemdismissable, this);
            if (obj3 != coroutineSingletons2) {
                obj3 = createfromparcel2;
            }
            if (obj3 != coroutineSingletons2) {
                obj2 = isitemdismissable;
                sideMenuRepository2 = sideMenuRepository;
                isitemdismissable = obj2;
                sideMenuRepository = sideMenuRepository2;
                if (onItemDismiss.serializer(isitemdismissable) != null) {
                    sideMenuRepository.IconCompatParcelizer.write(createfromparcel2);
                }
            }
            return coroutineSingletons2;
        }
        if (onItemDismiss.serializer(isitemdismissable) != null) {
            sideMenuRepository.IconCompatParcelizer.write(createfromparcel2);
        }
        return new onItemDismiss(isitemdismissable);
    }
}
