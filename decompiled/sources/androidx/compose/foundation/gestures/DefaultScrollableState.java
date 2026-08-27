package androidx.compose.foundation.gestures;

import androidx.compose.runtime.CompositionKt;
import coil3.RealImageLoader;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.YieldKt;
import o.PopulateViewStructure_androidKtpopulate7;
import o.TextLayoutResultProxy;
import o.applyMeasureResultfoundation;
import o.awaitScrollDependencies;
import o.createFromParcel;
import o.getAdjustedCoordinatesk4lQ0M;
import o.onShowTranslationui;
import o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM;
import o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0;

/* JADX INFO: loaded from: classes.dex */
public final class DefaultScrollableState implements getAdjustedCoordinatesk4lQ0M {
    public final PopulateViewStructure_androidKtpopulate7 RemoteActionCompatParcelizer;
    public final PopulateViewStructure_androidKtpopulate7 read;
    public final r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM serializer;
    public final PopulateViewStructure_androidKtpopulate7 write;
    public final TextLayoutResultProxy RatingCompat = new TextLayoutResultProxy(this);
    public final awaitScrollDependencies IconCompatParcelizer = new awaitScrollDependencies();

    @Override // o.getAdjustedCoordinatesk4lQ0M
    public final boolean IconCompatParcelizer() {
        return ((Boolean) ((onShowTranslationui) this.read).getValue()).booleanValue();
    }

    public DefaultScrollableState(r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm) {
        this.serializer = r8lambdaunavo3sxub_pc9xroryotnrlvsm;
        Boolean bool = Boolean.FALSE;
        this.read = CompositionKt.RemoteActionCompatParcelizer(bool);
        this.RemoteActionCompatParcelizer = CompositionKt.RemoteActionCompatParcelizer(bool);
        this.write = CompositionKt.RemoteActionCompatParcelizer(bool);
    }

    @Override // o.getAdjustedCoordinatesk4lQ0M
    public final float write(float f) {
        return ((Number) this.serializer.invoke(Float.valueOf(f))).floatValue();
    }

    @Override // o.getAdjustedCoordinatesk4lQ0M
    public final Object scroll(applyMeasureResultfoundation applymeasureresultfoundation, r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 r8lambdaa6_tctqmksh3fk6hjgcbkuvde0, ContinuationImpl continuationImpl) {
        Object objCoroutineScope = YieldKt.coroutineScope(new RealImageLoader.AnonymousClass2(this, applymeasureresultfoundation, r8lambdaa6_tctqmksh3fk6hjgcbkuvde0, null, 7), continuationImpl);
        return objCoroutineScope == CoroutineSingletons.COROUTINE_SUSPENDED ? objCoroutineScope : createFromParcel.INSTANCE;
    }
}
