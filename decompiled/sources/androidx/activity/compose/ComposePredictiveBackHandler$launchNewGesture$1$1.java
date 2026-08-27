package androidx.activity.compose;

import androidx.compose.ui.graphics.Fields;
import coil3.ExtrasKt;
import com.mapbox.navigation.core.directions.session.RoutesUpdatedResult;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import o.ShortNewsContentCardView;
import o.cancelPendingWebViewPause;
import o.createFromParcel;
import o.getParagraphrAG3T2kannotations;
import o.getSimplerAG3T2k;
import o.getStrictnessusljTpc;
import o.getUnspecifiedrAG3T2kannotations;
import o.getWordBreakjp8hJ3c;
import o.r8lambdafjQ9B8d5OSR_i2BAJDXqNW6RNrY;
import timber.log.Timber;

/* JADX INFO: loaded from: classes.dex */
public final class ComposePredictiveBackHandler$launchNewGesture$1$1 extends SuspendLambda implements r8lambdafjQ9B8d5OSR_i2BAJDXqNW6RNrY {
    private static int RemoteActionCompatParcelizer = 0;
    private static int write = 1;
    public /* synthetic */ Object IconCompatParcelizer;
    public final /* synthetic */ int serializer;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ComposePredictiveBackHandler$launchNewGesture$1$1(cancelPendingWebViewPause cancelpendingwebviewpause, ShortNewsContentCardView shortNewsContentCardView) {
        super(3, shortNewsContentCardView);
        this.serializer = 0;
        this.IconCompatParcelizer = cancelpendingwebviewpause;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ComposePredictiveBackHandler$launchNewGesture$1$1(int i, int i2, ShortNewsContentCardView shortNewsContentCardView) {
        super(i, shortNewsContentCardView);
        this.serializer = i2;
    }

    @Override // o.r8lambdafjQ9B8d5OSR_i2BAJDXqNW6RNrY
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int i = 2;
        int i2 = 2 % 2;
        int i3 = RemoteActionCompatParcelizer + 93;
        write = i3 % Fields.SpotShadowColor;
        if (i3 % 2 == 0) {
            createFromParcel createfromparcel = createFromParcel.INSTANCE;
            Object obj4 = null;
            obj4.hashCode();
            throw null;
        }
        int i4 = this.serializer;
        createFromParcel createfromparcel2 = createFromParcel.INSTANCE;
        if (i4 == 0) {
            new ComposePredictiveBackHandler$launchNewGesture$1$1((cancelPendingWebViewPause) this.IconCompatParcelizer, (ShortNewsContentCardView) obj3).invokeSuspend(createfromparcel2);
            return createfromparcel2;
        }
        int i5 = 1;
        int i6 = 3;
        if (i4 == 1) {
            ComposePredictiveBackHandler$launchNewGesture$1$1 composePredictiveBackHandler$launchNewGesture$1$1 = new ComposePredictiveBackHandler$launchNewGesture$1$1(i6, i5, (ShortNewsContentCardView) obj3);
            composePredictiveBackHandler$launchNewGesture$1$1.IconCompatParcelizer = (Throwable) obj2;
            composePredictiveBackHandler$launchNewGesture$1$1.invokeSuspend(createfromparcel2);
            return createfromparcel2;
        }
        if (i4 != 2) {
            ComposePredictiveBackHandler$launchNewGesture$1$1 composePredictiveBackHandler$launchNewGesture$1$2 = new ComposePredictiveBackHandler$launchNewGesture$1$1(i6, i6, (ShortNewsContentCardView) obj3);
            composePredictiveBackHandler$launchNewGesture$1$2.IconCompatParcelizer = (RoutesUpdatedResult) obj;
            return composePredictiveBackHandler$launchNewGesture$1$2.invokeSuspend(createfromparcel2);
        }
        ComposePredictiveBackHandler$launchNewGesture$1$1 composePredictiveBackHandler$launchNewGesture$1$3 = new ComposePredictiveBackHandler$launchNewGesture$1$1(i6, i, (ShortNewsContentCardView) obj3);
        composePredictiveBackHandler$launchNewGesture$1$3.IconCompatParcelizer = (getStrictnessusljTpc) obj;
        Object objInvokeSuspend = composePredictiveBackHandler$launchNewGesture$1$3.invokeSuspend(createfromparcel2);
        int i7 = RemoteActionCompatParcelizer + 81;
        write = i7 % Fields.SpotShadowColor;
        int i8 = i7 % 2;
        return objInvokeSuspend;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        int i = 2 % 2;
        int i2 = this.serializer;
        createFromParcel createfromparcel = createFromParcel.INSTANCE;
        boolean z = true;
        if (i2 == 0) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            ExtrasKt.RemoteActionCompatParcelizer(obj);
            ((cancelPendingWebViewPause) this.IconCompatParcelizer).IconCompatParcelizer = true;
            return createfromparcel;
        }
        if (i2 == 1) {
            Throwable th = (Throwable) this.IconCompatParcelizer;
            CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
            ExtrasKt.RemoteActionCompatParcelizer(obj);
            Timber.RemoteActionCompatParcelizer.RemoteActionCompatParcelizer(th, "Something went wrong collecting last stop selection state for map pin", new Object[0]);
            int i3 = RemoteActionCompatParcelizer + 1;
            write = i3 % Fields.SpotShadowColor;
            int i4 = i3 % 2;
            return createfromparcel;
        }
        if (i2 != 2) {
            RoutesUpdatedResult routesUpdatedResult = (RoutesUpdatedResult) this.IconCompatParcelizer;
            CoroutineSingletons coroutineSingletons3 = CoroutineSingletons.COROUTINE_SUSPENDED;
            ExtrasKt.RemoteActionCompatParcelizer(obj);
            return routesUpdatedResult;
        }
        getStrictnessusljTpc getstrictnessusljtpc = (getStrictnessusljTpc) this.IconCompatParcelizer;
        CoroutineSingletons coroutineSingletons4 = CoroutineSingletons.COROUTINE_SUSPENDED;
        ExtrasKt.RemoteActionCompatParcelizer(obj);
        if (!(getstrictnessusljtpc instanceof getWordBreakjp8hJ3c) && (!(getstrictnessusljtpc instanceof getParagraphrAG3T2kannotations)) && !(getstrictnessusljtpc instanceof getSimplerAG3T2k)) {
            int i5 = RemoteActionCompatParcelizer + 57;
            int i6 = i5 % Fields.SpotShadowColor;
            write = i6;
            int i7 = i5 % 2;
            if (getstrictnessusljtpc instanceof getUnspecifiedrAG3T2kannotations) {
                int i8 = i6 + 19;
                RemoteActionCompatParcelizer = i8 % Fields.SpotShadowColor;
                int i9 = i8 % 2;
            } else {
                int i10 = i6 + 71;
                RemoteActionCompatParcelizer = i10 % Fields.SpotShadowColor;
                int i11 = i10 % 2;
                z = false;
            }
        }
        return Boolean.valueOf(z);
    }
}
