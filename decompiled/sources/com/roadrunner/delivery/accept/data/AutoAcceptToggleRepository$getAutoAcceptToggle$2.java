package com.roadrunner.delivery.accept.data;

import androidx.compose.ui.graphics.Fields;
import coil3.ExtrasKt;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import com.roadrunner.auth.domain.logout.ClearDataUseCaseImpl$invoke$2;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.scheduling.DefaultIoScheduler;
import kotlinx.coroutines.scheduling.DefaultScheduler;
import o.ShortNewsContentCardView;
import o.TextRangeKt;
import o.createFromParcel;
import o.getContentViewGroupParentLayout;
import o.inCompatibilityMode;
import o.loadAsync;
import o.prepareForActivityTransitionCarryover;
import o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0;

/* JADX INFO: loaded from: classes3.dex */
public final class AutoAcceptToggleRepository$getAutoAcceptToggle$2 extends SuspendLambda implements r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 {
    private static int MediaBrowserCompatMediaItem = 1;
    private static int RemoteActionCompatParcelizer;
    public int IconCompatParcelizer;
    public boolean read;
    public final /* synthetic */ TextRangeKt serializer;
    public boolean write;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AutoAcceptToggleRepository$getAutoAcceptToggle$2(TextRangeKt textRangeKt, ShortNewsContentCardView shortNewsContentCardView) {
        super(2, shortNewsContentCardView);
        this.serializer = textRangeKt;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final ShortNewsContentCardView create(Object obj, ShortNewsContentCardView shortNewsContentCardView) {
        int i = 2 % 2;
        AutoAcceptToggleRepository$getAutoAcceptToggle$2 autoAcceptToggleRepository$getAutoAcceptToggle$2 = new AutoAcceptToggleRepository$getAutoAcceptToggle$2(this.serializer, shortNewsContentCardView);
        int i2 = RemoteActionCompatParcelizer + 35;
        MediaBrowserCompatMediaItem = i2 % Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            return autoAcceptToggleRepository$getAutoAcceptToggle$2;
        }
        Object obj2 = null;
        obj2.hashCode();
        throw null;
    }

    @Override // o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0
    public final Object invoke(Object obj, Object obj2) throws Throwable {
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 115;
        MediaBrowserCompatMediaItem = i2 % Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            ((AutoAcceptToggleRepository$getAutoAcceptToggle$2) create((getContentViewGroupParentLayout) obj, (ShortNewsContentCardView) obj2)).invokeSuspend(createFromParcel.INSTANCE);
            Object obj3 = null;
            obj3.hashCode();
            throw null;
        }
        Object objInvokeSuspend = ((AutoAcceptToggleRepository$getAutoAcceptToggle$2) create((getContentViewGroupParentLayout) obj, (ShortNewsContentCardView) obj2)).invokeSuspend(createFromParcel.INSTANCE);
        int i3 = MediaBrowserCompatMediaItem + 65;
        RemoteActionCompatParcelizer = i3 % Fields.SpotShadowColor;
        int i4 = i3 % 2;
        return objInvokeSuspend;
    }

    /* JADX WARN: Code duplicated, block: B:28:0x009d  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        boolean z;
        boolean zBooleanValue;
        Object objWrite;
        boolean z2;
        boolean z3;
        int i = 2 % 2;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = this.IconCompatParcelizer;
        TextRangeKt textRangeKt = this.serializer;
        ShortNewsContentCardView shortNewsContentCardView = null;
        if (i2 == 0) {
            ExtrasKt.RemoteActionCompatParcelizer(obj);
            this.IconCompatParcelizer = 1;
            obj = textRangeKt.write(this);
            if (obj != coroutineSingletons) {
            }
            return coroutineSingletons;
        }
        int i3 = RemoteActionCompatParcelizer + 59;
        int i4 = i3 % Fields.SpotShadowColor;
        MediaBrowserCompatMediaItem = i4;
        int i5 = i3 % 2;
        if (i2 != 1) {
            int i6 = i4 + 69;
            int i7 = i6 % Fields.SpotShadowColor;
            RemoteActionCompatParcelizer = i7;
            int i8 = i6 % 2;
            if (i2 == 2) {
                z = this.read;
                ExtrasKt.RemoteActionCompatParcelizer(obj);
                zBooleanValue = ((Boolean) obj).booleanValue();
                this.read = z;
                this.write = zBooleanValue;
                this.IconCompatParcelizer = 3;
                objWrite = textRangeKt.write(this);
                if (objWrite != coroutineSingletons) {
                    z2 = z;
                    z3 = zBooleanValue;
                    obj = objWrite;
                }
                return coroutineSingletons;
            }
            int i9 = i7 + 33;
            MediaBrowserCompatMediaItem = i9 % Fields.SpotShadowColor;
            int i10 = i9 % 2;
            if (i2 != 3) {
                ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            int i11 = i7 + 117;
            MediaBrowserCompatMediaItem = i11 % Fields.SpotShadowColor;
            if (i11 % 2 == 0) {
                z3 = this.write;
                z2 = this.read;
                ExtrasKt.RemoteActionCompatParcelizer(obj);
                int i12 = 85 / 0;
            } else {
                z3 = this.write;
                z2 = this.read;
                ExtrasKt.RemoteActionCompatParcelizer(obj);
            }
        } else {
            ExtrasKt.RemoteActionCompatParcelizer(obj);
        }
        return new loadAsync(z2, z3, ((Boolean) obj).booleanValue());
        boolean zBooleanValue2 = ((Boolean) obj).booleanValue();
        this.read = zBooleanValue2;
        this.IconCompatParcelizer = 2;
        ((inCompatibilityMode) textRangeKt.IconCompatParcelizer).getClass();
        DefaultScheduler defaultScheduler = prepareForActivityTransitionCarryover.RemoteActionCompatParcelizer;
        Object objWithContext = BuildersKt.withContext(DefaultIoScheduler.RemoteActionCompatParcelizer, new ClearDataUseCaseImpl$invoke$2(textRangeKt, shortNewsContentCardView, 17), this);
        if (objWithContext != coroutineSingletons) {
            z = zBooleanValue2;
            obj = objWithContext;
            zBooleanValue = ((Boolean) obj).booleanValue();
            this.read = z;
            this.write = zBooleanValue;
            this.IconCompatParcelizer = 3;
            objWrite = textRangeKt.write(this);
            if (objWrite != coroutineSingletons) {
                z2 = z;
                z3 = zBooleanValue;
                obj = objWrite;
                return new loadAsync(z2, z3, ((Boolean) obj).booleanValue());
            }
        }
        return coroutineSingletons;
    }
}
