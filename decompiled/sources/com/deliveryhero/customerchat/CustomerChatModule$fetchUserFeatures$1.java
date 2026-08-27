package com.deliveryhero.customerchat;

import androidx.datastore.core.SingleProcessDataStore$data$1;
import coil3.ExtrasKt;
import com.deliveryhero.contract.datastore.ChatConfigurationDataStoreHelperImpl;
import com.deliveryhero.customerchat.fwf.FeatureFlagProvider;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import curtains.internal.RootViewsSpy$Companion$install$1$1;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.YieldKt;
import o.LayerSnapshotV28;
import o.ShortNewsContentCardView;
import o.accessgetVcp;
import o.accesstoBitmap;
import o.createFromParcel;
import o.getContentViewGroupParentLayout;
import o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0;

/* JADX INFO: loaded from: classes2.dex */
public final class CustomerChatModule$fetchUserFeatures$1 extends SuspendLambda implements r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 {
    public int IconCompatParcelizer;
    public final /* synthetic */ int RemoteActionCompatParcelizer;
    public final /* synthetic */ CustomerChatModule read;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ CustomerChatModule$fetchUserFeatures$1(CustomerChatModule customerChatModule, ShortNewsContentCardView shortNewsContentCardView, int i) {
        super(2, shortNewsContentCardView);
        this.RemoteActionCompatParcelizer = i;
        this.read = customerChatModule;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final ShortNewsContentCardView create(Object obj, ShortNewsContentCardView shortNewsContentCardView) {
        int i = this.RemoteActionCompatParcelizer;
        CustomerChatModule customerChatModule = this.read;
        return i != 0 ? new CustomerChatModule$fetchUserFeatures$1(customerChatModule, shortNewsContentCardView, 1) : new CustomerChatModule$fetchUserFeatures$1(customerChatModule, shortNewsContentCardView, 0);
    }

    @Override // o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0
    public final Object invoke(Object obj, Object obj2) {
        int i = this.RemoteActionCompatParcelizer;
        createFromParcel createfromparcel = createFromParcel.INSTANCE;
        getContentViewGroupParentLayout getcontentviewgroupparentlayout = (getContentViewGroupParentLayout) obj;
        ShortNewsContentCardView shortNewsContentCardView = (ShortNewsContentCardView) obj2;
        return i != 0 ? ((CustomerChatModule$fetchUserFeatures$1) create(getcontentviewgroupparentlayout, shortNewsContentCardView)).invokeSuspend(createfromparcel) : ((CustomerChatModule$fetchUserFeatures$1) create(getcontentviewgroupparentlayout, shortNewsContentCardView)).invokeSuspend(createfromparcel);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        int i = this.RemoteActionCompatParcelizer;
        createFromParcel createfromparcel = createFromParcel.INSTANCE;
        CustomerChatModule customerChatModule = this.read;
        ShortNewsContentCardView shortNewsContentCardView = null;
        if (i != 0) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i2 = this.IconCompatParcelizer;
            if (i2 != 0) {
                if (i2 == 1) {
                    ExtrasKt.RemoteActionCompatParcelizer(obj);
                    return createfromparcel;
                }
                ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            ExtrasKt.RemoteActionCompatParcelizer(obj);
            accesstoBitmap accesstobitmap = (accesstoBitmap) customerChatModule.MediaMetadataCompat.MediaSessionCompatResultReceiverWrapper();
            LayerSnapshotV28 layerSnapshotV28Serializer = customerChatModule.read().serializer();
            RootViewsSpy$Companion$install$1$1 rootViewsSpy$Companion$install$1$1 = new RootViewsSpy$Companion$install$1$1(2, customerChatModule);
            this.IconCompatParcelizer = 1;
            return ((ChatConfigurationDataStoreHelperImpl) accesstobitmap).updateChatConfigurationToDataStore(layerSnapshotV28Serializer, rootViewsSpy$Companion$install$1$1, this) == coroutineSingletons ? coroutineSingletons : createfromparcel;
        }
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i3 = this.IconCompatParcelizer;
        if (i3 != 0) {
            if (i3 == 1) {
                ExtrasKt.RemoteActionCompatParcelizer(obj);
                return createfromparcel;
            }
            ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        ExtrasKt.RemoteActionCompatParcelizer(obj);
        accessgetVcp accessgetvcp = CustomerChatModule.write;
        FeatureFlagProvider featureFlagProvider = (FeatureFlagProvider) customerChatModule.PlaybackStateCompatCustomAction.MediaSessionCompatResultReceiverWrapper();
        this.IconCompatParcelizer = 1;
        featureFlagProvider.getClass();
        Object objCoroutineScope = YieldKt.coroutineScope(new SingleProcessDataStore$data$1.AnonymousClass1(featureFlagProvider, shortNewsContentCardView, 3), this);
        if (objCoroutineScope != coroutineSingletons2) {
            objCoroutineScope = createfromparcel;
        }
        return objCoroutineScope == coroutineSingletons2 ? coroutineSingletons2 : createfromparcel;
    }
}
