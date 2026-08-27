package androidx.work.impl.constraints;

import androidx.compose.ui.graphics.Fields;
import coil3.ExtrasKt;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.FlowCollector;
import o.ShortNewsContentCardView;
import o.createFromParcel;
import o.forEachui_graphicsdefault;
import o.getCieXyz;
import o.r8lambdafjQ9B8d5OSR_i2BAJDXqNW6RNrY;
import o.removeNodeAtDepth;
import o.rotateRight;

/* JADX INFO: loaded from: classes.dex */
public final class WorkConstraintsTracker$track$$inlined$combine$1$3 extends SuspendLambda implements r8lambdafjQ9B8d5OSR_i2BAJDXqNW6RNrY {
    private static int MediaMetadataCompat = 1;
    private static int write;
    public /* synthetic */ Object[] IconCompatParcelizer;
    public /* synthetic */ FlowCollector RemoteActionCompatParcelizer;
    public final /* synthetic */ int read;
    public int serializer;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ WorkConstraintsTracker$track$$inlined$combine$1$3(int i, int i2, ShortNewsContentCardView shortNewsContentCardView) {
        super(i, shortNewsContentCardView);
        this.read = i2;
    }

    @Override // o.r8lambdafjQ9B8d5OSR_i2BAJDXqNW6RNrY
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int i = 2 % 2;
        int i2 = write + 99;
        MediaMetadataCompat = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        int i4 = this.read;
        createFromParcel createfromparcel = createFromParcel.INSTANCE;
        FlowCollector flowCollector = (FlowCollector) obj;
        Object[] objArr = (Object[]) obj2;
        ShortNewsContentCardView shortNewsContentCardView = (ShortNewsContentCardView) obj3;
        int i5 = 3;
        if (i4 != 0) {
            WorkConstraintsTracker$track$$inlined$combine$1$3 workConstraintsTracker$track$$inlined$combine$1$3 = new WorkConstraintsTracker$track$$inlined$combine$1$3(i5, 1, shortNewsContentCardView);
            workConstraintsTracker$track$$inlined$combine$1$3.RemoteActionCompatParcelizer = flowCollector;
            workConstraintsTracker$track$$inlined$combine$1$3.IconCompatParcelizer = objArr;
            Object objInvokeSuspend = workConstraintsTracker$track$$inlined$combine$1$3.invokeSuspend(createfromparcel);
            int i6 = write + 117;
            MediaMetadataCompat = i6 % Fields.SpotShadowColor;
            int i7 = i6 % 2;
            return objInvokeSuspend;
        }
        WorkConstraintsTracker$track$$inlined$combine$1$3 workConstraintsTracker$track$$inlined$combine$1$4 = new WorkConstraintsTracker$track$$inlined$combine$1$3(i5, 0, shortNewsContentCardView);
        workConstraintsTracker$track$$inlined$combine$1$4.RemoteActionCompatParcelizer = flowCollector;
        workConstraintsTracker$track$$inlined$combine$1$4.IconCompatParcelizer = objArr;
        Object objInvokeSuspend2 = workConstraintsTracker$track$$inlined$combine$1$4.invokeSuspend(createfromparcel);
        int i8 = MediaMetadataCompat + 43;
        write = i8 % Fields.SpotShadowColor;
        if (i8 % 2 == 0) {
            return objInvokeSuspend2;
        }
        throw null;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        forEachui_graphicsdefault foreachui_graphicsdefault;
        int i = 2 % 2;
        int i2 = this.read;
        createFromParcel createfromparcel = createFromParcel.INSTANCE;
        int i3 = 0;
        forEachui_graphicsdefault foreachui_graphicsdefault2 = null;
        if (i2 != 0) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i4 = this.serializer;
            if (i4 != 0) {
                if (i4 == 1) {
                    ExtrasKt.RemoteActionCompatParcelizer(obj);
                    return createfromparcel;
                }
                ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                int i5 = write + 15;
                MediaMetadataCompat = i5 % Fields.SpotShadowColor;
                int i6 = i5 % 2;
                return null;
            }
            ExtrasKt.RemoteActionCompatParcelizer(obj);
            FlowCollector flowCollector = this.RemoteActionCompatParcelizer;
            this.RemoteActionCompatParcelizer = null;
            this.IconCompatParcelizer = null;
            this.serializer = 1;
            if (flowCollector.emit(createfromparcel, this) != coroutineSingletons) {
                return createfromparcel;
            }
            int i7 = write + 73;
            MediaMetadataCompat = i7 % Fields.SpotShadowColor;
            if (i7 % 2 == 0) {
                int i8 = 30 / 0;
            }
            return coroutineSingletons;
        }
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i9 = this.serializer;
        if (i9 != 0) {
            if (i9 == 1) {
                ExtrasKt.RemoteActionCompatParcelizer(obj);
                return createfromparcel;
            }
            ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        ExtrasKt.RemoteActionCompatParcelizer(obj);
        FlowCollector flowCollector2 = this.RemoteActionCompatParcelizer;
        forEachui_graphicsdefault[] foreachui_graphicsdefaultArr = (forEachui_graphicsdefault[]) this.IconCompatParcelizer;
        int length = foreachui_graphicsdefaultArr.length;
        while (true) {
            foreachui_graphicsdefault = rotateRight.read;
            if (i3 >= length) {
                break;
            }
            int i10 = write + 29;
            MediaMetadataCompat = i10 % Fields.SpotShadowColor;
            int i11 = i10 % 2;
            forEachui_graphicsdefault foreachui_graphicsdefault3 = foreachui_graphicsdefaultArr[i3];
            if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{foreachui_graphicsdefault3, foreachui_graphicsdefault}, getCieXyz.write())).booleanValue()) {
                foreachui_graphicsdefault2 = foreachui_graphicsdefault3;
                break;
            }
            i3++;
        }
        if (foreachui_graphicsdefault2 != null) {
            foreachui_graphicsdefault = foreachui_graphicsdefault2;
        }
        this.serializer = 1;
        return flowCollector2.emit(foreachui_graphicsdefault, this) == coroutineSingletons2 ? coroutineSingletons2 : createfromparcel;
    }
}
