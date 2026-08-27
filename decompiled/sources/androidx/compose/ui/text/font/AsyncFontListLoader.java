package androidx.compose.ui.text.font;

import androidx.compose.runtime.CompositionKt;
import coil3.ExtrasKt;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import java.util.List;
import java.util.concurrent.CancellationException;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.CoroutineExceptionHandler;
import kotlinx.coroutines.JobKt;
import kotlinx.coroutines.TimeoutKt;
import o.PopulateViewStructure_androidKtpopulate7;
import o.ShortNewsContentCardView;
import o.getOnBackInvokedCallback;
import o.onViewAttachedToWindow;
import o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM;

/* JADX INFO: loaded from: classes.dex */
public final class AsyncFontListLoader implements onViewAttachedToWindow {
    public static final int $stable = 0;
    private final AsyncTypefaceCache asyncTypefaceCache;
    private boolean cacheable = true;
    private final List<Font> fontList;
    private final r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM onCompletion;
    private final PlatformFontLoader platformFontLoader;
    private final TypefaceRequest typefaceRequest;
    private final PopulateViewStructure_androidKtpopulate7 value$delegate;

    /* JADX INFO: renamed from: androidx.compose.ui.text.font.AsyncFontListLoader$load$1, reason: invalid class name */
    public static final class AnonymousClass1 extends ContinuationImpl {
        int I$0;
        int I$1;
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;

        public AnonymousClass1(ShortNewsContentCardView<? super AnonymousClass1> shortNewsContentCardView) {
            super(shortNewsContentCardView);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return AsyncFontListLoader.this.load(this);
        }
    }

    public final boolean getCacheable$ui_text() {
        return this.cacheable;
    }

    public final void setCacheable$ui_text(boolean z) {
        this.cacheable = z;
    }

    private void setValue(Object obj) {
        this.value$delegate.setValue(obj);
    }

    @Override // o.onViewAttachedToWindow
    public Object getValue() {
        return this.value$delegate.getValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public AsyncFontListLoader(List<? extends Font> list, Object obj, TypefaceRequest typefaceRequest, AsyncTypefaceCache asyncTypefaceCache, r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm, PlatformFontLoader platformFontLoader) {
        this.fontList = list;
        this.typefaceRequest = typefaceRequest;
        this.asyncTypefaceCache = asyncTypefaceCache;
        this.onCompletion = r8lambdaunavo3sxub_pc9xroryotnrlvsm;
        this.platformFontLoader = platformFontLoader;
        this.value$delegate = CompositionKt.RemoteActionCompatParcelizer(obj);
    }

    /* JADX WARN: Code duplicated, block: B:23:0x0065 A[Catch: all -> 0x00f4, TryCatch #0 {all -> 0x00f4, blocks: (B:13:0x0036, B:23:0x0065, B:25:0x007c, B:30:0x00ac, B:32:0x00db, B:18:0x004d, B:21:0x0059), top: B:45:0x0028 }] */
    /* JADX WARN: Code duplicated, block: B:25:0x007c A[Catch: all -> 0x00f4, TryCatch #0 {all -> 0x00f4, blocks: (B:13:0x0036, B:23:0x0065, B:25:0x007c, B:30:0x00ac, B:32:0x00db, B:18:0x004d, B:21:0x0059), top: B:45:0x0028 }] */
    /* JADX WARN: Code duplicated, block: B:27:0x00a3  */
    /* JADX WARN: Code duplicated, block: B:28:0x00a4  */
    /* JADX WARN: Code duplicated, block: B:30:0x00ac A[Catch: all -> 0x00f4, TRY_LEAVE, TryCatch #0 {all -> 0x00f4, blocks: (B:13:0x0036, B:23:0x0065, B:25:0x007c, B:30:0x00ac, B:32:0x00db, B:18:0x004d, B:21:0x0059), top: B:45:0x0028 }] */
    /* JADX WARN: Code duplicated, block: B:32:0x00db A[Catch: all -> 0x00f4, TRY_ENTER, TRY_LEAVE, TryCatch #0 {all -> 0x00f4, blocks: (B:13:0x0036, B:23:0x0065, B:25:0x007c, B:30:0x00ac, B:32:0x00db, B:18:0x004d, B:21:0x0059), top: B:45:0x0028 }] */
    /* JADX WARN: Code duplicated, block: B:36:0x00ef  */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:33:0x00e9 -> B:35:0x00ec). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:36:0x00ef -> B:37:0x00f1). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public final java.lang.Object load(o.ShortNewsContentCardView<? super o.createFromParcel> r20) {
        /*
            Method dump skipped, instruction units count: 296
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.text.font.AsyncFontListLoader.load(o.ShortNewsContentCardView):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object loadWithTimeoutOrNull$ui_text(Font font, ShortNewsContentCardView<Object> shortNewsContentCardView) {
        AsyncFontListLoader$loadWithTimeoutOrNull$1 asyncFontListLoader$loadWithTimeoutOrNull$1;
        if (shortNewsContentCardView instanceof AsyncFontListLoader$loadWithTimeoutOrNull$1) {
            asyncFontListLoader$loadWithTimeoutOrNull$1 = (AsyncFontListLoader$loadWithTimeoutOrNull$1) shortNewsContentCardView;
            int i = asyncFontListLoader$loadWithTimeoutOrNull$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                asyncFontListLoader$loadWithTimeoutOrNull$1.label = i - Integer.MIN_VALUE;
            } else {
                asyncFontListLoader$loadWithTimeoutOrNull$1 = new AsyncFontListLoader$loadWithTimeoutOrNull$1(this, shortNewsContentCardView);
            }
        } else {
            asyncFontListLoader$loadWithTimeoutOrNull$1 = new AsyncFontListLoader$loadWithTimeoutOrNull$1(this, shortNewsContentCardView);
        }
        Object obj = asyncFontListLoader$loadWithTimeoutOrNull$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = asyncFontListLoader$loadWithTimeoutOrNull$1.label;
        try {
            if (i2 != 0) {
                if (i2 != 1) {
                    ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                ExtrasKt.RemoteActionCompatParcelizer(obj);
                return obj;
            }
            ExtrasKt.RemoteActionCompatParcelizer(obj);
            AsyncFontListLoader$loadWithTimeoutOrNull$2 asyncFontListLoader$loadWithTimeoutOrNull$2 = new AsyncFontListLoader$loadWithTimeoutOrNull$2(this, font, null);
            asyncFontListLoader$loadWithTimeoutOrNull$1.L$0 = font;
            asyncFontListLoader$loadWithTimeoutOrNull$1.label = 1;
            Object objWithTimeoutOrNull = TimeoutKt.withTimeoutOrNull(15000L, asyncFontListLoader$loadWithTimeoutOrNull$2, asyncFontListLoader$loadWithTimeoutOrNull$1);
            return objWithTimeoutOrNull == coroutineSingletons ? coroutineSingletons : objWithTimeoutOrNull;
        } catch (CancellationException e) {
            if (!JobKt.write(asyncFontListLoader$loadWithTimeoutOrNull$1.getContext())) {
                throw e;
            }
            return null;
        } catch (Exception e2) {
            CoroutineExceptionHandler coroutineExceptionHandler = (CoroutineExceptionHandler) asyncFontListLoader$loadWithTimeoutOrNull$1.getContext().get(getOnBackInvokedCallback.RemoteActionCompatParcelizer);
            if (coroutineExceptionHandler != null) {
                coroutineExceptionHandler.handleException(asyncFontListLoader$loadWithTimeoutOrNull$1.getContext(), new IllegalStateException("Unable to load font " + font, e2));
            }
            return null;
        }
    }
}
