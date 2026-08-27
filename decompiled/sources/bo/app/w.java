package bo.app;

import coil3.ExtrasKt;
import com.braze.enums.DataStoreKey;
import com.braze.support.BrazeLogger;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import java.util.ArrayList;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import o.ShortNewsContentCardView;
import o.createFromParcel;
import o.getContentViewGroupParentLayout;
import o.pauseWebviewIfNecessarylambda10;
import o.performCustomExitMxy_nc0;
import o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0;
import o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0;
import o.r8lambdafvzP3Wky1RLLzE56uVXaMHcvU;

/* JADX INFO: loaded from: classes.dex */
public final class w extends SuspendLambda implements r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 {
    public int a;
    public /* synthetic */ Object b;
    public final /* synthetic */ com.braze.storage.a c;
    public final /* synthetic */ ArrayList d;
    public final /* synthetic */ long e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w(com.braze.storage.a aVar, ArrayList arrayList, long j, ShortNewsContentCardView shortNewsContentCardView) {
        super(2, shortNewsContentCardView);
        this.c = aVar;
        this.d = arrayList;
        this.e = j;
    }

    public static final String a() {
        return r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.serializer("Failed to update last request time per placement for key: ", DataStoreKey.BANNERS_LAST_REQUEST_TIME_PER_PLACEMENT.getKey());
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final ShortNewsContentCardView create(Object obj, ShortNewsContentCardView shortNewsContentCardView) {
        w wVar = new w(this.c, this.d, this.e, shortNewsContentCardView);
        wVar.b = obj;
        return wVar;
    }

    @Override // o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0
    public final Object invoke(Object obj, Object obj2) {
        return ((w) create((getContentViewGroupParentLayout) obj, (ShortNewsContentCardView) obj2)).invokeSuspend(createFromParcel.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        getContentViewGroupParentLayout getcontentviewgroupparentlayout = (getContentViewGroupParentLayout) this.b;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.a;
        try {
            if (i != 0) {
                if (i == 1) {
                    ExtrasKt.RemoteActionCompatParcelizer(obj);
                    return obj;
                }
                ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            ExtrasKt.RemoteActionCompatParcelizer(obj);
            performCustomExitMxy_nc0 dataStore = this.c.getDataStore();
            v vVar = new v(this.d, this.e, null);
            this.b = getcontentviewgroupparentlayout;
            this.a = 1;
            Object objSerializer = pauseWebviewIfNecessarylambda10.serializer(dataStore, vVar, this);
            return objSerializer == coroutineSingletons ? coroutineSingletons : objSerializer;
        } catch (Exception e) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) getcontentviewgroupparentlayout, BrazeLogger.Priority.E, (Throwable) e, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new w$$ExternalSyntheticLambda0(0), 4, (Object) null);
            return createFromParcel.INSTANCE;
        }
    }
}
