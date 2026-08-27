package com.roadrunner.countdowntimer;

import androidx.compose.ui.graphics.Fields;
import androidx.compose.ui.text.AnnotatedString;
import coil3.ExtrasKt;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import o.RectListDebugger;
import o.RectListDebuggerModifierNode;
import o.RectListDebugger_androidKt;
import o.RectListDebugger_androidKtRectListDebugger1;
import o.RectListKt;
import o.RoundedCornerShapeKt;
import o.ShortNewsContentCardView;
import o.createFromParcel;
import o.distanceScore;
import o.getEverythingButLastChildOffset;

/* JADX INFO: loaded from: classes3.dex */
public final class CountDownTimerUiModel$observeTimerState$$inlined$map$1 implements Flow {
    private static int RemoteActionCompatParcelizer = 0;
    private static int write = 1;
    public final /* synthetic */ int IconCompatParcelizer;
    public final /* synthetic */ Flow read;
    public final /* synthetic */ CountDownTimerUiModel serializer;

    /* JADX INFO: renamed from: com.roadrunner.countdowntimer.CountDownTimerUiModel$observeTimerState$$inlined$map$1$2, reason: invalid class name */
    public final class AnonymousClass2 implements FlowCollector {
        private static int RemoteActionCompatParcelizer = 1;
        private static int serializer;
        public final /* synthetic */ CountDownTimerUiModel IconCompatParcelizer;
        public final /* synthetic */ FlowCollector read;
        public final /* synthetic */ int write;

        public AnonymousClass2(FlowCollector flowCollector, CountDownTimerUiModel countDownTimerUiModel, int i) {
            this.read = flowCollector;
            this.IconCompatParcelizer = countDownTimerUiModel;
            this.write = i;
        }

        /* JADX WARN: Code duplicated, block: B:7:0x001f  */
        @Override // kotlinx.coroutines.flow.FlowCollector
        public final Object emit(Object obj, ShortNewsContentCardView shortNewsContentCardView) {
            RectListDebugger_androidKt rectListDebugger_androidKt;
            RectListDebuggerModifierNode rectListDebuggerModifierNode;
            int i = 2;
            int i2 = 2 % 2;
            if (shortNewsContentCardView instanceof RectListDebugger_androidKt) {
                int i3 = serializer + 57;
                RemoteActionCompatParcelizer = i3 % Fields.SpotShadowColor;
                int i4 = i3 % 2;
                rectListDebugger_androidKt = (RectListDebugger_androidKt) shortNewsContentCardView;
                int i5 = rectListDebugger_androidKt.IconCompatParcelizer;
                if ((i5 & Integer.MIN_VALUE) != 0) {
                    rectListDebugger_androidKt.IconCompatParcelizer = i5 - Integer.MIN_VALUE;
                } else {
                    rectListDebugger_androidKt = new RectListDebugger_androidKt(this, shortNewsContentCardView);
                }
            } else {
                rectListDebugger_androidKt = new RectListDebugger_androidKt(this, shortNewsContentCardView);
            }
            Object obj2 = rectListDebugger_androidKt.RemoteActionCompatParcelizer;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i6 = rectListDebugger_androidKt.IconCompatParcelizer;
            int i7 = 1;
            DefaultConstructorMarker defaultConstructorMarker = null;
            if (i6 != 0) {
                int i8 = serializer + 29;
                RemoteActionCompatParcelizer = i8 % Fields.SpotShadowColor;
                int i9 = i8 % 2;
                if (i6 != 1) {
                    ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                ExtrasKt.RemoteActionCompatParcelizer(obj2);
            } else {
                ExtrasKt.RemoteActionCompatParcelizer(obj2);
                distanceScore distancescore = (distanceScore) obj;
                RectListDebugger rectListDebugger = this.IconCompatParcelizer.read;
                rectListDebugger.getClass();
                distancescore.getClass();
                if (distancescore.equals(RectListKt.write)) {
                    rectListDebuggerModifierNode = new RectListDebuggerModifierNode(null, 2);
                } else if (distancescore instanceof getEverythingButLastChildOffset) {
                    RectListDebugger_androidKtRectListDebugger1 rectListDebugger_androidKtRectListDebugger1 = rectListDebugger.write;
                    RoundedCornerShapeKt roundedCornerShapeKt = new RoundedCornerShapeKt(this.write, i, rectListDebugger, distancescore);
                    rectListDebugger_androidKtRectListDebugger1.getClass();
                    AnnotatedString.Builder builder = new AnnotatedString.Builder(0, i7, defaultConstructorMarker);
                    roundedCornerShapeKt.invoke(builder);
                    rectListDebuggerModifierNode = new RectListDebuggerModifierNode(builder.toAnnotatedString(), 1);
                } else {
                    if (!distancescore.equals(RectListKt.IconCompatParcelizer)) {
                        ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer();
                        return null;
                    }
                    rectListDebuggerModifierNode = new RectListDebuggerModifierNode(null, 2);
                }
                rectListDebugger_androidKt.IconCompatParcelizer = 1;
                if (this.read.emit(rectListDebuggerModifierNode, rectListDebugger_androidKt) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            }
            return createFromParcel.INSTANCE;
        }
    }

    public CountDownTimerUiModel$observeTimerState$$inlined$map$1(Flow flow, CountDownTimerUiModel countDownTimerUiModel, int i) {
        this.read = flow;
        this.serializer = countDownTimerUiModel;
        this.IconCompatParcelizer = i;
    }

    @Override // kotlinx.coroutines.flow.Flow
    public final Object collect(FlowCollector flowCollector, ShortNewsContentCardView shortNewsContentCardView) {
        int i = 2 % 2;
        Object objCollect = this.read.collect(new AnonymousClass2(flowCollector, this.serializer, this.IconCompatParcelizer), shortNewsContentCardView);
        if (objCollect != CoroutineSingletons.COROUTINE_SUSPENDED) {
            createFromParcel createfromparcel = createFromParcel.INSTANCE;
            int i2 = write + 5;
            RemoteActionCompatParcelizer = i2 % Fields.SpotShadowColor;
            int i3 = i2 % 2;
            return createfromparcel;
        }
        int i4 = RemoteActionCompatParcelizer + 43;
        write = i4 % Fields.SpotShadowColor;
        if (i4 % 2 != 0) {
            return objCollect;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }
}
