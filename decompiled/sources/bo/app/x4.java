package bo.app;

import android.content.Context;
import android.graphics.Bitmap;
import android.net.TrafficStats;
import android.widget.ImageView;
import coil3.ExtrasKt;
import com.braze.Constants;
import com.braze.R;
import com.braze.enums.BrazeViewBounds;
import com.braze.images.DefaultBrazeImageLoader;
import com.braze.support.BrazeLogger;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.MainCoroutineDispatcher;
import kotlinx.coroutines.internal.MainDispatcherLoader;
import kotlinx.coroutines.scheduling.DefaultScheduler;
import o.ShortNewsContentCardView;
import o.createFromParcel;
import o.getCieXyz;
import o.getContentViewGroupParentLayout;
import o.prepareForActivityTransitionCarryover;
import o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0;
import o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0;
import o.r8lambdafvzP3Wky1RLLzE56uVXaMHcvU;
import o.removeNodeAtDepth;

/* JADX INFO: loaded from: classes.dex */
public final class x4 extends SuspendLambda implements r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 {
    public Bitmap a;
    public int b;
    public final /* synthetic */ DefaultBrazeImageLoader c;
    public final /* synthetic */ Context d;
    public final /* synthetic */ String e;
    public final /* synthetic */ BrazeViewBounds f;
    public final /* synthetic */ ImageView g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x4(DefaultBrazeImageLoader defaultBrazeImageLoader, Context context, String str, BrazeViewBounds brazeViewBounds, ImageView imageView, ShortNewsContentCardView shortNewsContentCardView) {
        super(2, shortNewsContentCardView);
        this.c = defaultBrazeImageLoader;
        this.d = context;
        this.e = str;
        this.f = brazeViewBounds;
        this.g = imageView;
    }

    public static final String a(String str) {
        return r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.serializer("Failed to retrieve bitmap from url: ", str);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final ShortNewsContentCardView create(Object obj, ShortNewsContentCardView shortNewsContentCardView) {
        return new x4(this.c, this.d, this.e, this.f, this.g, shortNewsContentCardView);
    }

    @Override // o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0
    public final Object invoke(Object obj, Object obj2) {
        return ((x4) create((getContentViewGroupParentLayout) obj, (ShortNewsContentCardView) obj2)).invokeSuspend(createFromParcel.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Bitmap bitmap;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.b;
        if (i == 0) {
            ExtrasKt.RemoteActionCompatParcelizer(obj);
            TrafficStats.setThreadStatsTag(Constants.TRAFFIC_STATS_THREAD_TAG);
            Bitmap bitmapFromUrl = this.c.getBitmapFromUrl(this.d, this.e, this.f);
            if (bitmapFromUrl == null) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, DefaultBrazeImageLoader.TAG, (BrazeLogger.Priority) null, (Throwable) null, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new w8$$ExternalSyntheticLambda1(this.e, 6), 14, (Object) null);
            } else {
                String str = this.e;
                Object tag = this.g.getTag(R.string.com_braze_image_lru_cache_image_url_key);
                tag.getClass();
                int iWrite = getCieXyz.write();
                int iWrite2 = getCieXyz.write();
                int iWrite3 = getCieXyz.write();
                if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(iWrite, 1803334089, -1803334089, getCieXyz.write(), iWrite2, new Object[]{str, (String) tag}, iWrite3)).booleanValue()) {
                    DefaultScheduler defaultScheduler = prepareForActivityTransitionCarryover.RemoteActionCompatParcelizer;
                    MainCoroutineDispatcher mainCoroutineDispatcher = MainDispatcherLoader.read;
                    v4 v4Var = new v4(this.g, bitmapFromUrl, null);
                    this.a = bitmapFromUrl;
                    this.b = 1;
                    if (BuildersKt.withContext(mainCoroutineDispatcher, v4Var, this) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    bitmap = bitmapFromUrl;
                }
            }
            return createFromParcel.INSTANCE;
        }
        if (i != 1) {
            ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        bitmap = this.a;
        ExtrasKt.RemoteActionCompatParcelizer(obj);
        BrazeViewBounds brazeViewBounds = this.f;
        ImageView imageView = this.g;
        imageView.addOnLayoutChangeListener(new w4(brazeViewBounds, imageView, bitmap));
        return createFromParcel.INSTANCE;
    }
}
