package com.roadrunner.vendor.review.data.cache;

import androidx.compose.ui.graphics.Fields;
import coil3.ExtrasKt;
import com.mapbox.navigation.core.RoutesRefreshData;
import com.mapbox.navigation.core.routerefresh.RouteRefresher;
import com.roadrunner.nafath.NafathTimerManager$observeCountdown$1;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.BuildersKt;
import o.ShortNewsContentCardView;
import o.accessgetInstancedelegatecp;
import o.backwardFocusSearch;
import o.createFromParcel;
import o.getContentViewGroupParentLayout;
import o.onViewAttachedToWindowlambda0;
import o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0;

/* JADX INFO: loaded from: classes3.dex */
public final class VendorReviewConfigCache$set$2 extends SuspendLambda implements r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 {
    private static int MediaSessionCompatQueueItem = 0;
    private static int RatingCompat = 1;
    public final /* synthetic */ Object IconCompatParcelizer;
    public /* synthetic */ Object RemoteActionCompatParcelizer;
    public final /* synthetic */ long read;
    public final /* synthetic */ Object serializer;
    public final /* synthetic */ int write = 1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VendorReviewConfigCache$set$2(RoutesRefreshData routesRefreshData, long j, RouteRefresher routeRefresher, ShortNewsContentCardView shortNewsContentCardView) {
        super(2, shortNewsContentCardView);
        this.serializer = routesRefreshData;
        this.read = j;
        this.IconCompatParcelizer = routeRefresher;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VendorReviewConfigCache$set$2(VendorReviewConfigCache vendorReviewConfigCache, String str, long j, ShortNewsContentCardView shortNewsContentCardView) {
        super(2, shortNewsContentCardView);
        this.serializer = vendorReviewConfigCache;
        this.IconCompatParcelizer = str;
        this.read = j;
    }

    @Override // o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0
    public final Object invoke(Object obj, Object obj2) {
        int i = 2 % 2;
        int i2 = MediaSessionCompatQueueItem + 103;
        RatingCompat = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        int i4 = this.write;
        createFromParcel createfromparcel = createFromParcel.INSTANCE;
        if (i4 == 0) {
            ((VendorReviewConfigCache$set$2) create((backwardFocusSearch) obj, (ShortNewsContentCardView) obj2)).invokeSuspend(createfromparcel);
            return createfromparcel;
        }
        Object objInvokeSuspend = ((VendorReviewConfigCache$set$2) create((getContentViewGroupParentLayout) obj, (ShortNewsContentCardView) obj2)).invokeSuspend(createfromparcel);
        int i5 = RatingCompat + 91;
        MediaSessionCompatQueueItem = i5 % Fields.SpotShadowColor;
        int i6 = i5 % 2;
        return objInvokeSuspend;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final ShortNewsContentCardView create(Object obj, ShortNewsContentCardView shortNewsContentCardView) {
        int i = 2 % 2;
        int i2 = RatingCompat + 113;
        MediaSessionCompatQueueItem = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        int i4 = this.write;
        Object obj2 = this.IconCompatParcelizer;
        Object obj3 = this.serializer;
        if (i4 != 0) {
            VendorReviewConfigCache$set$2 vendorReviewConfigCache$set$2 = new VendorReviewConfigCache$set$2((RoutesRefreshData) obj3, this.read, (RouteRefresher) obj2, shortNewsContentCardView);
            vendorReviewConfigCache$set$2.RemoteActionCompatParcelizer = obj;
            return vendorReviewConfigCache$set$2;
        }
        VendorReviewConfigCache$set$2 vendorReviewConfigCache$set$3 = new VendorReviewConfigCache$set$2((VendorReviewConfigCache) obj3, (String) obj2, this.read, shortNewsContentCardView);
        vendorReviewConfigCache$set$3.RemoteActionCompatParcelizer = obj;
        int i5 = RatingCompat + 29;
        MediaSessionCompatQueueItem = i5 % Fields.SpotShadowColor;
        int i6 = i5 % 2;
        return vendorReviewConfigCache$set$3;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        int i = 2 % 2;
        int i2 = MediaSessionCompatQueueItem + 11;
        RatingCompat = i2 % Fields.SpotShadowColor;
        Object obj2 = null;
        if (i2 % 2 == 0) {
            obj2.hashCode();
            throw null;
        }
        int i3 = this.write;
        Object obj3 = this.IconCompatParcelizer;
        Object obj4 = this.serializer;
        if (i3 == 0) {
            backwardFocusSearch backwardfocussearch = (backwardFocusSearch) this.RemoteActionCompatParcelizer;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            ExtrasKt.RemoteActionCompatParcelizer(obj);
            VendorReviewConfigCache vendorReviewConfigCache = (VendorReviewConfigCache) obj4;
            backwardfocussearch.write(vendorReviewConfigCache.serializer, (String) obj3);
            backwardfocussearch.write(vendorReviewConfigCache.IconCompatParcelizer, new Long(this.read));
            return createFromParcel.INSTANCE;
        }
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        ExtrasKt.RemoteActionCompatParcelizer(obj);
        getContentViewGroupParentLayout getcontentviewgroupparentlayout = (getContentViewGroupParentLayout) this.RemoteActionCompatParcelizer;
        ArrayList arrayList = ((RoutesRefreshData) obj4).allRoutesRefreshData;
        RouteRefresher routeRefresher = (RouteRefresher) obj3;
        ArrayList arrayList2 = new ArrayList(accessgetInstancedelegatecp.write(arrayList, 10));
        Iterator it = arrayList.iterator();
        int i4 = RatingCompat + 69;
        MediaSessionCompatQueueItem = i4 % Fields.SpotShadowColor;
        if (i4 % 2 != 0) {
            int i5 = 3 % 5;
        }
        while (it.hasNext()) {
            arrayList2.add(BuildersKt.IconCompatParcelizer(getcontentviewgroupparentlayout, null, null, new NafathTimerManager$observeCountdown$1((onViewAttachedToWindowlambda0) it.next(), this.read, routeRefresher, (ShortNewsContentCardView) null, 5), 3));
        }
        return arrayList2;
    }
}
