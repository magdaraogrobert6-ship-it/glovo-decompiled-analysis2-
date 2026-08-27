package androidx.compose.runtime;

import bo.app.c8$$ExternalSyntheticOutline0;
import bo.app.m1$$ExternalSyntheticOutline0;
import coil3.ExtrasKt;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import io.reactivex.subjects.BehaviorSubject;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;
import kotlin.sequences.SequenceBuilderIterator;
import o.ContentInViewNode;
import o.ScrollingLayoutElement;
import o.ShortNewsContentCardView;
import o.createFromParcel;
import o.pauseWebviewIfNecessarylambda10;
import o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0;

/* JADX INFO: loaded from: classes.dex */
public final class ComposePausableCompositionException$operationsSequence$1 extends RestrictedSuspendLambda implements r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 {
    public int IconCompatParcelizer;
    public final /* synthetic */ ComposePausableCompositionException RatingCompat;
    public int RemoteActionCompatParcelizer;
    public int read;
    public /* synthetic */ Object serializer;
    public int write;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final ShortNewsContentCardView create(Object obj, ShortNewsContentCardView shortNewsContentCardView) {
        ComposePausableCompositionException$operationsSequence$1 composePausableCompositionException$operationsSequence$1 = new ComposePausableCompositionException$operationsSequence$1(this.RatingCompat, shortNewsContentCardView);
        composePausableCompositionException$operationsSequence$1.serializer = obj;
        return composePausableCompositionException$operationsSequence$1;
    }

    @Override // o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0
    public final Object invoke(Object obj, Object obj2) {
        return ((ComposePausableCompositionException$operationsSequence$1) create((SequenceBuilderIterator) obj, (ShortNewsContentCardView) obj2)).invokeSuspend(createFromParcel.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        int i;
        SequenceBuilderIterator sequenceBuilderIterator;
        int i2;
        int i3;
        String strM;
        String str;
        int i4;
        int i5;
        String str2;
        ComposePausableCompositionException composePausableCompositionException = this.RatingCompat;
        ContentInViewNode contentInViewNode = composePausableCompositionException.write;
        ScrollingLayoutElement scrollingLayoutElement = composePausableCompositionException.IconCompatParcelizer;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i6 = this.write;
        if (i6 == 0) {
            ExtrasKt.RemoteActionCompatParcelizer(obj);
            i = 0;
            sequenceBuilderIterator = (SequenceBuilderIterator) this.serializer;
            i2 = 0;
            i3 = 0;
        } else {
            if (i6 != 1) {
                ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            int i7 = this.RemoteActionCompatParcelizer;
            int i8 = this.IconCompatParcelizer;
            int i9 = this.read;
            sequenceBuilderIterator = (SequenceBuilderIterator) this.serializer;
            ExtrasKt.RemoteActionCompatParcelizer(obj);
            i3 = i7;
            i2 = i8;
            i = i9;
        }
        while (true) {
            if (i >= Math.min(composePausableCompositionException.serializer + 10, scrollingLayoutElement.RemoteActionCompatParcelizer)) {
                return createFromParcel.INSTANCE;
            }
            int i10 = i + 1;
            int iRemoteActionCompatParcelizer = scrollingLayoutElement.RemoteActionCompatParcelizer(i);
            switch (iRemoteActionCompatParcelizer) {
                case 0:
                    strM = "up";
                    int i11 = i3;
                    int i12 = i2;
                    str2 = strM;
                    i5 = i12;
                    i3 = i11;
                    i4 = i10;
                    break;
                case 1:
                    strM = m1$$ExternalSyntheticOutline0.m(contentInViewNode.RemoteActionCompatParcelizer(i2), "down ");
                    i2++;
                    int i13 = i3;
                    int i14 = i2;
                    str2 = strM;
                    i5 = i14;
                    i3 = i13;
                    i4 = i10;
                    break;
                case 2:
                    str = "remove " + scrollingLayoutElement.RemoteActionCompatParcelizer(i10) + ' ' + scrollingLayoutElement.RemoteActionCompatParcelizer(i + 2);
                    i4 = i + 3;
                    i5 = i2;
                    str2 = str;
                    break;
                case 3:
                    str = "move " + scrollingLayoutElement.RemoteActionCompatParcelizer(i10) + ' ' + scrollingLayoutElement.RemoteActionCompatParcelizer(i + 2) + ' ' + scrollingLayoutElement.RemoteActionCompatParcelizer(i + 3);
                    i4 = i + 4;
                    i5 = i2;
                    str2 = str;
                    break;
                case 4:
                    strM = "clear";
                    int i15 = i3;
                    int i16 = i2;
                    str2 = strM;
                    i5 = i16;
                    i3 = i15;
                    i4 = i10;
                    break;
                case 5:
                    i4 = i + 2;
                    i5 = i2 + 1;
                    str2 = "insertBottomUp " + scrollingLayoutElement.RemoteActionCompatParcelizer(i10) + ' ' + contentInViewNode.RemoteActionCompatParcelizer(i2);
                    break;
                case 6:
                    i4 = i + 2;
                    i5 = i2 + 1;
                    str2 = "insertTopDown " + scrollingLayoutElement.RemoteActionCompatParcelizer(i10) + ' ' + contentInViewNode.RemoteActionCompatParcelizer(i2);
                    break;
                case 7:
                    Object objRemoteActionCompatParcelizer = contentInViewNode.RemoteActionCompatParcelizer(i2);
                    objRemoteActionCompatParcelizer.getClass();
                    pauseWebviewIfNecessarylambda10.read(BehaviorSubject.BehaviorDisposable.write(), new Object[]{2, objRemoteActionCompatParcelizer}, BehaviorSubject.BehaviorDisposable.write(), BehaviorSubject.BehaviorDisposable.write(), -722072991, 722072991, BehaviorSubject.BehaviorDisposable.write());
                    i2 += 2;
                    strM = "apply " + ((r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0) objRemoteActionCompatParcelizer);
                    int i17 = i3;
                    int i18 = i2;
                    str2 = strM;
                    i5 = i18;
                    i3 = i17;
                    i4 = i10;
                    break;
                case 8:
                    strM = "reuse " + composePausableCompositionException.read.RemoteActionCompatParcelizer(i3);
                    i3++;
                    int i19 = i3;
                    int i110 = i2;
                    str2 = strM;
                    i5 = i110;
                    i3 = i19;
                    i4 = i10;
                    break;
                case 9:
                    strM = "recompose pending";
                    int i111 = i3;
                    int i112 = i2;
                    str2 = strM;
                    i5 = i112;
                    i3 = i111;
                    i4 = i10;
                    break;
                default:
                    strM = c8$$ExternalSyntheticOutline0.m(iRemoteActionCompatParcelizer, "unknown op: ");
                    int i113 = i3;
                    int i114 = i2;
                    str2 = strM;
                    i5 = i114;
                    i3 = i113;
                    i4 = i10;
                    break;
            }
            String str3 = i + ": " + str2;
            this.serializer = sequenceBuilderIterator;
            this.read = i4;
            this.IconCompatParcelizer = i5;
            this.RemoteActionCompatParcelizer = i3;
            this.write = 1;
            if (sequenceBuilderIterator.yield(str3, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
            i = i4;
            i2 = i5;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ComposePausableCompositionException$operationsSequence$1(ComposePausableCompositionException composePausableCompositionException, ShortNewsContentCardView shortNewsContentCardView) {
        super(2, shortNewsContentCardView);
        this.RatingCompat = composePausableCompositionException;
    }
}
