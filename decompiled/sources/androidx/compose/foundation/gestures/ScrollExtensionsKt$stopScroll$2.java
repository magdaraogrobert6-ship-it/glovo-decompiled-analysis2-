package androidx.compose.foundation.gestures;

import androidx.compose.ui.graphics.Fields;
import coil3.ExtrasKt;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.Flow;
import o.PlatformSelectionBehaviorsImpl;
import o.ShortNewsContentCardView;
import o.createFromParcel;
import o.getContentViewGroupParentLayout;
import o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0;
import timber.log.Timber;

/* JADX INFO: loaded from: classes.dex */
public final class ScrollExtensionsKt$stopScroll$2 extends SuspendLambda implements r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 {
    private static int IconCompatParcelizer = 1;
    private static int write;
    public final /* synthetic */ int read;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ScrollExtensionsKt$stopScroll$2(int i, int i2, ShortNewsContentCardView shortNewsContentCardView) {
        super(i, shortNewsContentCardView);
        this.read = i2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final ShortNewsContentCardView create(Object obj, ShortNewsContentCardView shortNewsContentCardView) {
        int i = 2;
        int i2 = 2 % 2;
        int i3 = write + 29;
        IconCompatParcelizer = i3 % Fields.SpotShadowColor;
        if (i3 % 2 == 0) {
            Object obj2 = null;
            obj2.hashCode();
            throw null;
        }
        int i4 = this.read;
        int i5 = 0;
        if (i4 == 0) {
            return new ScrollExtensionsKt$stopScroll$2(i, i5, shortNewsContentCardView);
        }
        int i6 = 1;
        if (i4 != 1) {
            return i4 != 2 ? new ScrollExtensionsKt$stopScroll$2(i, 3, shortNewsContentCardView) : new ScrollExtensionsKt$stopScroll$2(i, i, shortNewsContentCardView);
        }
        ScrollExtensionsKt$stopScroll$2 scrollExtensionsKt$stopScroll$2 = new ScrollExtensionsKt$stopScroll$2(i, i6, shortNewsContentCardView);
        int i7 = write + 45;
        IconCompatParcelizer = i7 % Fields.SpotShadowColor;
        if (i7 % 2 == 0) {
            int i8 = 42 / 0;
        }
        return scrollExtensionsKt$stopScroll$2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        int i = 2 % 2;
        int i2 = write + 65;
        IconCompatParcelizer = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        int i4 = this.read;
        createFromParcel createfromparcel = createFromParcel.INSTANCE;
        if (i4 == 0) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            ExtrasKt.RemoteActionCompatParcelizer(obj);
            return createfromparcel;
        }
        if (i4 == 1) {
            CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
            ExtrasKt.RemoteActionCompatParcelizer(obj);
            int i5 = IconCompatParcelizer + 103;
            write = i5 % Fields.SpotShadowColor;
            if (i5 % 2 == 0) {
                return createfromparcel;
            }
            throw null;
        }
        if (i4 != 2) {
            CoroutineSingletons coroutineSingletons3 = CoroutineSingletons.COROUTINE_SUSPENDED;
            ExtrasKt.RemoteActionCompatParcelizer(obj);
            Timber.RemoteActionCompatParcelizer.read(new IllegalStateException("QrScannerScreen: Flash feature is unavailable."));
            return createfromparcel;
        }
        CoroutineSingletons coroutineSingletons4 = CoroutineSingletons.COROUTINE_SUSPENDED;
        ExtrasKt.RemoteActionCompatParcelizer(obj);
        Timber.RemoteActionCompatParcelizer.read(new IllegalStateException("MultiCodeScannerScreen: Flash feature is unavailable."));
        return createfromparcel;
    }

    @Override // o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0
    public final Object invoke(Object obj, Object obj2) {
        int i = 2 % 2;
        int i2 = IconCompatParcelizer + 45;
        write = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        int i4 = this.read;
        createFromParcel createfromparcel = createFromParcel.INSTANCE;
        if (i4 == 0) {
            ((ScrollExtensionsKt$stopScroll$2) create((PlatformSelectionBehaviorsImpl) obj, (ShortNewsContentCardView) obj2)).invokeSuspend(createfromparcel);
            return createfromparcel;
        }
        if (i4 != 1) {
            if (i4 != 2) {
                ((ScrollExtensionsKt$stopScroll$2) create((getContentViewGroupParentLayout) obj, (ShortNewsContentCardView) obj2)).invokeSuspend(createfromparcel);
                return createfromparcel;
            }
            ((ScrollExtensionsKt$stopScroll$2) create((getContentViewGroupParentLayout) obj, (ShortNewsContentCardView) obj2)).invokeSuspend(createfromparcel);
            return createfromparcel;
        }
        ((ScrollExtensionsKt$stopScroll$2) create((Flow) obj, (ShortNewsContentCardView) obj2)).invokeSuspend(createfromparcel);
        int i5 = write + 105;
        IconCompatParcelizer = i5 % Fields.SpotShadowColor;
        if (i5 % 2 != 0) {
            return createfromparcel;
        }
        throw null;
    }
}
