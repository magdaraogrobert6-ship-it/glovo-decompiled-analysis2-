package com.roadrunner.customerchat.selfservice.data.cache.server;

import android.webkit.CookieManager;
import android.webkit.ValueCallback;
import androidx.compose.ui.graphics.Fields;
import bo.app.ff$$ExternalSyntheticOutline0;
import coil3.ExtrasKt;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import io.grpc.LoadBalancer$Helper;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.CancellableContinuationImpl;
import o.ShortNewsContentCardView;
import o.createFromParcel;
import o.getContentViewGroupParentLayout;
import o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0;

/* JADX INFO: loaded from: classes3.dex */
public final class LocalServerCookieWriterImpl$writeAuthCookie$2 extends SuspendLambda implements r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 {
    private static int RemoteActionCompatParcelizer = 0;
    private static int write = 1;
    public final /* synthetic */ String IconCompatParcelizer;
    public final /* synthetic */ String read;
    public int serializer;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LocalServerCookieWriterImpl$writeAuthCookie$2(String str, String str2, ShortNewsContentCardView shortNewsContentCardView) {
        super(2, shortNewsContentCardView);
        this.read = str;
        this.IconCompatParcelizer = str2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final ShortNewsContentCardView create(Object obj, ShortNewsContentCardView shortNewsContentCardView) {
        int i = 2 % 2;
        LocalServerCookieWriterImpl$writeAuthCookie$2 localServerCookieWriterImpl$writeAuthCookie$2 = new LocalServerCookieWriterImpl$writeAuthCookie$2(this.read, this.IconCompatParcelizer, shortNewsContentCardView);
        int i2 = write + 3;
        RemoteActionCompatParcelizer = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        return localServerCookieWriterImpl$writeAuthCookie$2;
    }

    @Override // o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0
    public final Object invoke(Object obj, Object obj2) {
        int i = 2 % 2;
        int i2 = write + 117;
        RemoteActionCompatParcelizer = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        Object objInvokeSuspend = ((LocalServerCookieWriterImpl$writeAuthCookie$2) create((getContentViewGroupParentLayout) obj, (ShortNewsContentCardView) obj2)).invokeSuspend(createFromParcel.INSTANCE);
        int i4 = write + 67;
        RemoteActionCompatParcelizer = i4 % Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return objInvokeSuspend;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        int i = 2 % 2;
        int i2 = write + 61;
        RemoteActionCompatParcelizer = i2 % Fields.SpotShadowColor;
        Object obj2 = null;
        if (i2 % 2 != 0) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            throw null;
        }
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i3 = this.serializer;
        if (i3 != 0) {
            if (i3 == 1) {
                ExtrasKt.RemoteActionCompatParcelizer(obj);
                return obj;
            }
            ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
            int i4 = RemoteActionCompatParcelizer + 27;
            write = i4 % Fields.SpotShadowColor;
            if (i4 % 2 != 0) {
                return null;
            }
            throw null;
        }
        ExtrasKt.RemoteActionCompatParcelizer(obj);
        this.serializer = 1;
        final CancellableContinuationImpl cancellableContinuationImpl = new CancellableContinuationImpl(1, LoadBalancer$Helper.intercepted(this));
        cancellableContinuationImpl.read();
        CookieManager.getInstance().setCookie(this.read, ff$$ExternalSyntheticOutline0.m("auth=", this.IconCompatParcelizer, "; Path=/; HttpOnly"), new ValueCallback() { // from class: com.roadrunner.customerchat.selfservice.data.cache.server.LocalServerCookieWriterImpl$writeAuthCookie$2$1$1
            private static int IconCompatParcelizer = 1;
            private static int read;

            @Override // android.webkit.ValueCallback
            public final void onReceiveValue(Object obj3) {
                int i5 = 2 % 2;
                int i6 = read + 111;
                IconCompatParcelizer = i6 % Fields.SpotShadowColor;
                if (i6 % 2 != 0) {
                    cancellableContinuationImpl.resumeWith((Boolean) obj3);
                } else {
                    cancellableContinuationImpl.resumeWith((Boolean) obj3);
                    throw null;
                }
            }
        });
        Object result = cancellableContinuationImpl.getResult();
        if (result == coroutineSingletons2) {
            return coroutineSingletons2;
        }
        int i5 = RemoteActionCompatParcelizer + 95;
        write = i5 % Fields.SpotShadowColor;
        if (i5 % 2 != 0) {
            return result;
        }
        obj2.hashCode();
        throw null;
    }
}
