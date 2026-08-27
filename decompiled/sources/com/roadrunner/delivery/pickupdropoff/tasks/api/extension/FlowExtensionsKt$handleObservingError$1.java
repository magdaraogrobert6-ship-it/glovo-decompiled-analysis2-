package com.roadrunner.delivery.pickupdropoff.tasks.api.extension;

import androidx.compose.ui.graphics.Fields;
import coil3.ExtrasKt;
import java.util.concurrent.CancellationException;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.MutableStateFlow;
import o.ShortNewsContentCardView;
import o.createFromParcel;
import o.r8lambdafjQ9B8d5OSR_i2BAJDXqNW6RNrY;
import timber.log.Timber;

/* JADX INFO: loaded from: classes3.dex */
public final class FlowExtensionsKt$handleObservingError$1 extends SuspendLambda implements r8lambdafjQ9B8d5OSR_i2BAJDXqNW6RNrY {
    private static int MediaDescriptionCompat = 1;
    private static int serializer;
    public final /* synthetic */ MutableStateFlow IconCompatParcelizer;
    public /* synthetic */ Throwable RemoteActionCompatParcelizer;
    public final /* synthetic */ String read;
    public final /* synthetic */ Object write;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FlowExtensionsKt$handleObservingError$1(MutableStateFlow mutableStateFlow, Object obj, String str, ShortNewsContentCardView shortNewsContentCardView) {
        super(3, shortNewsContentCardView);
        this.IconCompatParcelizer = mutableStateFlow;
        this.write = obj;
        this.read = str;
    }

    @Override // o.r8lambdafjQ9B8d5OSR_i2BAJDXqNW6RNrY
    public final Object invoke(Object obj, Object obj2, Object obj3) throws Throwable {
        int i = 2 % 2;
        Object obj4 = this.write;
        String str = this.read;
        FlowExtensionsKt$handleObservingError$1 flowExtensionsKt$handleObservingError$1 = new FlowExtensionsKt$handleObservingError$1(this.IconCompatParcelizer, obj4, str, (ShortNewsContentCardView) obj3);
        flowExtensionsKt$handleObservingError$1.RemoteActionCompatParcelizer = (Throwable) obj2;
        createFromParcel createfromparcel = createFromParcel.INSTANCE;
        flowExtensionsKt$handleObservingError$1.invokeSuspend(createfromparcel);
        int i2 = MediaDescriptionCompat + 59;
        serializer = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        return createfromparcel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        int i = 2 % 2;
        int i2 = serializer + 47;
        MediaDescriptionCompat = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        Throwable th = this.RemoteActionCompatParcelizer;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        ExtrasKt.RemoteActionCompatParcelizer(obj);
        if (th instanceof CancellationException) {
            throw th;
        }
        this.IconCompatParcelizer.IconCompatParcelizer(this.write);
        Timber.RemoteActionCompatParcelizer.RemoteActionCompatParcelizer(th, this.read, new Object[0]);
        createFromParcel createfromparcel = createFromParcel.INSTANCE;
        int i4 = serializer + 91;
        MediaDescriptionCompat = i4 % Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return createfromparcel;
    }
}
