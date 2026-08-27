package androidx.compose.runtime;

import coil3.ExtrasKt;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import o.PopulateViewStructure_androidKtpopulate7;
import o.ShortNewsContentCardView;
import o.createFromParcel;
import o.getContentViewGroupParentLayout;
import o.notifyContentCaptureChanges;
import o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0;

/* JADX INFO: loaded from: classes.dex */
public final class SnapshotStateKt__ProduceStateKt$produceState$1$1 extends SuspendLambda implements r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 {
    public final /* synthetic */ int IconCompatParcelizer;
    public int RemoteActionCompatParcelizer;
    public /* synthetic */ Object read;
    public final /* synthetic */ PopulateViewStructure_androidKtpopulate7 serializer;
    public final /* synthetic */ r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 write;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ SnapshotStateKt__ProduceStateKt$produceState$1$1(r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 r8lambdaa6_tctqmksh3fk6hjgcbkuvde0, PopulateViewStructure_androidKtpopulate7 populateViewStructure_androidKtpopulate7, ShortNewsContentCardView shortNewsContentCardView, int i) {
        super(2, shortNewsContentCardView);
        this.IconCompatParcelizer = i;
        this.write = r8lambdaa6_tctqmksh3fk6hjgcbkuvde0;
        this.serializer = populateViewStructure_androidKtpopulate7;
    }

    @Override // o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0
    public final Object invoke(Object obj, Object obj2) {
        int i = this.IconCompatParcelizer;
        createFromParcel createfromparcel = createFromParcel.INSTANCE;
        getContentViewGroupParentLayout getcontentviewgroupparentlayout = (getContentViewGroupParentLayout) obj;
        ShortNewsContentCardView shortNewsContentCardView = (ShortNewsContentCardView) obj2;
        return i != 0 ? ((SnapshotStateKt__ProduceStateKt$produceState$1$1) create(getcontentviewgroupparentlayout, shortNewsContentCardView)).invokeSuspend(createfromparcel) : ((SnapshotStateKt__ProduceStateKt$produceState$1$1) create(getcontentviewgroupparentlayout, shortNewsContentCardView)).invokeSuspend(createfromparcel);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        int i = this.IconCompatParcelizer;
        createFromParcel createfromparcel = createFromParcel.INSTANCE;
        PopulateViewStructure_androidKtpopulate7 populateViewStructure_androidKtpopulate7 = this.serializer;
        r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 r8lambdaa6_tctqmksh3fk6hjgcbkuvde0 = this.write;
        if (i != 0) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i2 = this.RemoteActionCompatParcelizer;
            if (i2 == 0) {
                ExtrasKt.RemoteActionCompatParcelizer(obj);
                notifyContentCaptureChanges notifycontentcapturechanges = new notifyContentCaptureChanges(populateViewStructure_androidKtpopulate7, ((getContentViewGroupParentLayout) this.read).getCoroutineContext());
                this.RemoteActionCompatParcelizer = 1;
                return r8lambdaa6_tctqmksh3fk6hjgcbkuvde0.invoke(notifycontentcapturechanges, this) == coroutineSingletons ? coroutineSingletons : createfromparcel;
            }
            if (i2 == 1) {
                ExtrasKt.RemoteActionCompatParcelizer(obj);
                return createfromparcel;
            }
            ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i3 = this.RemoteActionCompatParcelizer;
        if (i3 == 0) {
            ExtrasKt.RemoteActionCompatParcelizer(obj);
            notifyContentCaptureChanges notifycontentcapturechanges2 = new notifyContentCaptureChanges(populateViewStructure_androidKtpopulate7, ((getContentViewGroupParentLayout) this.read).getCoroutineContext());
            this.RemoteActionCompatParcelizer = 1;
            return r8lambdaa6_tctqmksh3fk6hjgcbkuvde0.invoke(notifycontentcapturechanges2, this) == coroutineSingletons2 ? coroutineSingletons2 : createfromparcel;
        }
        if (i3 == 1) {
            ExtrasKt.RemoteActionCompatParcelizer(obj);
            return createfromparcel;
        }
        ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
        return null;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final ShortNewsContentCardView create(Object obj, ShortNewsContentCardView shortNewsContentCardView) {
        if (this.IconCompatParcelizer != 0) {
            SnapshotStateKt__ProduceStateKt$produceState$1$1 snapshotStateKt__ProduceStateKt$produceState$1$1 = new SnapshotStateKt__ProduceStateKt$produceState$1$1(this.write, this.serializer, shortNewsContentCardView, 1);
            snapshotStateKt__ProduceStateKt$produceState$1$1.read = obj;
            return snapshotStateKt__ProduceStateKt$produceState$1$1;
        }
        SnapshotStateKt__ProduceStateKt$produceState$1$1 snapshotStateKt__ProduceStateKt$produceState$1$2 = new SnapshotStateKt__ProduceStateKt$produceState$1$1(this.write, this.serializer, shortNewsContentCardView, 0);
        snapshotStateKt__ProduceStateKt$produceState$1$2.read = obj;
        return snapshotStateKt__ProduceStateKt$produceState$1$2;
    }
}
