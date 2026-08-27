package androidx.compose.ui.text.font;

import android.content.Context;
import android.util.TypedValue;
import androidx.core.content.res.ResourcesCompat$FontCallback;
import io.grpc.LoadBalancer$Helper;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlinx.coroutines.CancellableContinuationImpl;
import o.ShortNewsContentCardView;
import o.setLeft;

/* JADX INFO: loaded from: classes.dex */
public final class AndroidFontLoader_androidKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Object loadAsync(final ResourceFont resourceFont, Context context, ShortNewsContentCardView<? super android.graphics.Typeface> shortNewsContentCardView) {
        final CancellableContinuationImpl cancellableContinuationImpl = new CancellableContinuationImpl(1, LoadBalancer$Helper.intercepted(shortNewsContentCardView));
        cancellableContinuationImpl.read();
        int resId = resourceFont.getResId();
        ResourcesCompat$FontCallback resourcesCompat$FontCallback = new ResourcesCompat$FontCallback() { // from class: androidx.compose.ui.text.font.AndroidFontLoader_androidKt$loadAsync$2$1
            @Override // androidx.core.content.res.ResourcesCompat$FontCallback
            public void onFontRetrieved(android.graphics.Typeface typeface) {
                cancellableContinuationImpl.resumeWith(typeface);
            }

            @Override // androidx.core.content.res.ResourcesCompat$FontCallback
            public void onFontRetrievalFailed(int i) {
                cancellableContinuationImpl.serializer((Throwable) new IllegalStateException("Unable to load font " + resourceFont + " (reason=" + i + ')'));
            }
        };
        ThreadLocal threadLocal = setLeft.read;
        if (context.isRestricted()) {
            resourcesCompat$FontCallback.callbackFailAsync(-4, null);
        } else {
            setLeft.RemoteActionCompatParcelizer(context, resId, new TypedValue(), 0, resourcesCompat$FontCallback, false, false);
        }
        Object result = cancellableContinuationImpl.getResult();
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        return result;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final android.graphics.Typeface load(ResourceFont resourceFont, Context context) {
        android.graphics.Typeface typefaceSerializer = setLeft.serializer(context, resourceFont.getResId());
        typefaceSerializer.getClass();
        return typefaceSerializer;
    }
}
