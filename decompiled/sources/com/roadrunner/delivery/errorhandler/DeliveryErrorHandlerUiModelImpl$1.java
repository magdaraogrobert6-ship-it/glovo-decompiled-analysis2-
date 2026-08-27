package com.roadrunner.delivery.errorhandler;

import androidx.compose.ui.graphics.Fields;
import coil3.ExtrasKt;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import com.roadrunner.delivery.state.StateProviderImpl;
import com.roadrunner.delivery.state.StateProviderImpl$special$$inlined$map$4;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.MutableStateFlow;
import o.DrawableTransformation;
import o.ShortNewsContentCardView;
import o.TypefaceBuilderCompat;
import o.createFromFile;
import o.createFromParcel;
import o.getContentViewGroupParentLayout;
import o.getNoOpUpdate;
import o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0;

/* JADX INFO: loaded from: classes3.dex */
public final class DeliveryErrorHandlerUiModelImpl$1 extends SuspendLambda implements r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 {
    private static int IconCompatParcelizer = 1;
    private static int serializer;
    public final /* synthetic */ int RemoteActionCompatParcelizer;
    public int read;
    public final /* synthetic */ createFromFile write;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ DeliveryErrorHandlerUiModelImpl$1(createFromFile createfromfile, ShortNewsContentCardView shortNewsContentCardView, int i) {
        super(2, shortNewsContentCardView);
        this.RemoteActionCompatParcelizer = i;
        this.write = createfromfile;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final ShortNewsContentCardView create(Object obj, ShortNewsContentCardView shortNewsContentCardView) {
        int i = 2 % 2;
        int i2 = IconCompatParcelizer + 83;
        serializer = i2 % Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            throw null;
        }
        int i3 = this.RemoteActionCompatParcelizer;
        createFromFile createfromfile = this.write;
        if (i3 != 0) {
            return new DeliveryErrorHandlerUiModelImpl$1(createfromfile, shortNewsContentCardView, 1);
        }
        DeliveryErrorHandlerUiModelImpl$1 deliveryErrorHandlerUiModelImpl$1 = new DeliveryErrorHandlerUiModelImpl$1(createfromfile, shortNewsContentCardView, 0);
        int i4 = IconCompatParcelizer + 29;
        serializer = i4 % Fields.SpotShadowColor;
        if (i4 % 2 == 0) {
            return deliveryErrorHandlerUiModelImpl$1;
        }
        throw null;
    }

    @Override // o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0
    public final Object invoke(Object obj, Object obj2) {
        int i = 2 % 2;
        int i2 = serializer + 3;
        IconCompatParcelizer = i2 % Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            createFromParcel createfromparcel = createFromParcel.INSTANCE;
            throw null;
        }
        int i3 = this.RemoteActionCompatParcelizer;
        createFromParcel createfromparcel2 = createFromParcel.INSTANCE;
        getContentViewGroupParentLayout getcontentviewgroupparentlayout = (getContentViewGroupParentLayout) obj;
        ShortNewsContentCardView shortNewsContentCardView = (ShortNewsContentCardView) obj2;
        if (i3 != 0) {
            return ((DeliveryErrorHandlerUiModelImpl$1) create(getcontentviewgroupparentlayout, shortNewsContentCardView)).invokeSuspend(createfromparcel2);
        }
        Object objInvokeSuspend = ((DeliveryErrorHandlerUiModelImpl$1) create(getcontentviewgroupparentlayout, shortNewsContentCardView)).invokeSuspend(createfromparcel2);
        int i4 = IconCompatParcelizer + 71;
        serializer = i4 % Fields.SpotShadowColor;
        if (i4 % 2 != 0) {
            int i5 = 39 / 0;
        }
        return objInvokeSuspend;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        int i = 2 % 2;
        int i2 = IconCompatParcelizer + 47;
        serializer = i2 % Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            throw null;
        }
        int i3 = this.RemoteActionCompatParcelizer;
        createFromFile createfromfile = this.write;
        int i4 = 1;
        if (i3 != 0) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i5 = this.read;
            if (i5 != 0) {
                int i6 = serializer + 103;
                IconCompatParcelizer = i6 % Fields.SpotShadowColor;
                int i7 = i6 % 2;
                if (i5 != 1) {
                    ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                ExtrasKt.RemoteActionCompatParcelizer(obj);
                int i8 = serializer + 21;
                IconCompatParcelizer = i8 % Fields.SpotShadowColor;
                int i9 = i8 % 2;
            } else {
                ExtrasKt.RemoteActionCompatParcelizer(obj);
                MutableStateFlow mutableStateFlow = createfromfile.write.write;
                TypefaceBuilderCompat typefaceBuilderCompat = new TypefaceBuilderCompat(createfromfile, i4);
                this.read = 1;
                if (mutableStateFlow.collect(typefaceBuilderCompat, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            }
            DrawableTransformation.read();
            int i10 = serializer + 81;
            IconCompatParcelizer = i10 % Fields.SpotShadowColor;
            int i11 = i10 % 2;
            return null;
        }
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i12 = this.read;
        int i13 = 0;
        if (i12 != 0) {
            int i14 = serializer;
            int i15 = i14 + 63;
            IconCompatParcelizer = i15 % Fields.SpotShadowColor;
            int i16 = i15 % 2;
            if (i12 != 1) {
                ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            int i17 = i14 + 93;
            IconCompatParcelizer = i17 % Fields.SpotShadowColor;
            if (i17 % 2 == 0) {
                ExtrasKt.RemoteActionCompatParcelizer(obj);
                int i18 = 68 / 0;
            } else {
                ExtrasKt.RemoteActionCompatParcelizer(obj);
            }
        } else {
            ExtrasKt.RemoteActionCompatParcelizer(obj);
            StateProviderImpl$special$$inlined$map$4 stateProviderImpl$special$$inlined$map$4 = ((StateProviderImpl) ((getNoOpUpdate) createfromfile.MediaBrowserCompatMediaItem)).read;
            TypefaceBuilderCompat typefaceBuilderCompat2 = new TypefaceBuilderCompat(createfromfile, i13);
            this.read = 1;
            if (stateProviderImpl$special$$inlined$map$4.collect(typefaceBuilderCompat2, this) == coroutineSingletons2) {
                return coroutineSingletons2;
            }
        }
        return createFromParcel.INSTANCE;
    }
}
