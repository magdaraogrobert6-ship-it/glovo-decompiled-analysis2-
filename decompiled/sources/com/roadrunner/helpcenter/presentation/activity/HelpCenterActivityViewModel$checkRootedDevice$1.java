package com.roadrunner.helpcenter.presentation.activity;

import androidx.compose.ui.graphics.Fields;
import coil3.ExtrasKt;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import com.roadrunner.rider.support.implementation.RiderSupportRootedCheckImpl;
import java.util.UUID;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.DelayKt;
import o.ShortNewsContentCardView;
import o.createFromParcel;
import o.getLoaderManager;
import o.isMap;
import o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM;

/* JADX INFO: loaded from: classes4.dex */
public final class HelpCenterActivityViewModel$checkRootedDevice$1 extends SuspendLambda implements r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM {
    private static int RemoteActionCompatParcelizer = 0;
    private static int read = 1;
    public final /* synthetic */ getLoaderManager IconCompatParcelizer;
    public int serializer;
    public final /* synthetic */ int write;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ HelpCenterActivityViewModel$checkRootedDevice$1(getLoaderManager getloadermanager, ShortNewsContentCardView shortNewsContentCardView, int i) {
        super(1, shortNewsContentCardView);
        this.write = i;
        this.IconCompatParcelizer = getloadermanager;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final ShortNewsContentCardView create(ShortNewsContentCardView shortNewsContentCardView) {
        int i = 2;
        int i2 = 2 % 2;
        int i3 = read + 79;
        RemoteActionCompatParcelizer = i3 % Fields.SpotShadowColor;
        int i4 = i3 % 2;
        int i5 = this.write;
        getLoaderManager getloadermanager = this.IconCompatParcelizer;
        if (i5 == 0) {
            return new HelpCenterActivityViewModel$checkRootedDevice$1(getloadermanager, shortNewsContentCardView, 0);
        }
        int i6 = 1;
        if (i5 != 1) {
            return new HelpCenterActivityViewModel$checkRootedDevice$1(getloadermanager, shortNewsContentCardView, i);
        }
        HelpCenterActivityViewModel$checkRootedDevice$1 helpCenterActivityViewModel$checkRootedDevice$1 = new HelpCenterActivityViewModel$checkRootedDevice$1(getloadermanager, shortNewsContentCardView, i6);
        int i7 = RemoteActionCompatParcelizer + 93;
        read = i7 % Fields.SpotShadowColor;
        int i8 = i7 % 2;
        return helpCenterActivityViewModel$checkRootedDevice$1;
    }

    @Override // o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM
    public final Object invoke(Object obj) {
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 45;
        read = i2 % Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            createFromParcel createfromparcel = createFromParcel.INSTANCE;
            Object obj2 = null;
            obj2.hashCode();
            throw null;
        }
        int i3 = this.write;
        createFromParcel createfromparcel2 = createFromParcel.INSTANCE;
        ShortNewsContentCardView shortNewsContentCardView = (ShortNewsContentCardView) obj;
        if (i3 == 0) {
            return ((HelpCenterActivityViewModel$checkRootedDevice$1) create(shortNewsContentCardView)).invokeSuspend(createfromparcel2);
        }
        if (i3 == 1) {
            return ((HelpCenterActivityViewModel$checkRootedDevice$1) create(shortNewsContentCardView)).invokeSuspend(createfromparcel2);
        }
        Object objInvokeSuspend = ((HelpCenterActivityViewModel$checkRootedDevice$1) create(shortNewsContentCardView)).invokeSuspend(createfromparcel2);
        int i4 = read + 101;
        RemoteActionCompatParcelizer = i4 % Fields.SpotShadowColor;
        if (i4 % 2 != 0) {
            int i5 = 86 / 0;
        }
        return objInvokeSuspend;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        int i = 2 % 2;
        int i2 = this.write;
        Object obj2 = createFromParcel.INSTANCE;
        getLoaderManager getloadermanager = this.IconCompatParcelizer;
        if (i2 == 0) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i3 = this.serializer;
            if (i3 == 0) {
                ExtrasKt.RemoteActionCompatParcelizer(obj);
                RiderSupportRootedCheckImpl riderSupportRootedCheckImpl = getloadermanager.r8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8;
                this.serializer = 1;
                if (riderSupportRootedCheckImpl.performRootedDeviceCheck(this) == coroutineSingletons) {
                    int i4 = read + 47;
                    RemoteActionCompatParcelizer = i4 % Fields.SpotShadowColor;
                    if (i4 % 2 != 0) {
                        throw null;
                    }
                    obj2 = coroutineSingletons;
                }
            } else if (i3 == 1) {
                ExtrasKt.RemoteActionCompatParcelizer(obj);
            } else {
                ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                obj2 = null;
            }
            int i5 = read + 69;
            RemoteActionCompatParcelizer = i5 % Fields.SpotShadowColor;
            if (i5 % 2 != 0) {
                int i6 = 18 / 0;
            }
            return obj2;
        }
        if (i2 == 1) {
            CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i7 = this.serializer;
            if (i7 == 0) {
                ExtrasKt.RemoteActionCompatParcelizer(obj);
                this.serializer = 1;
                if (DelayKt.delay(1000L, this) == coroutineSingletons2) {
                    return coroutineSingletons2;
                }
            } else {
                if (i7 != 1) {
                    ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                    int i8 = RemoteActionCompatParcelizer + 13;
                    read = i8 % Fields.SpotShadowColor;
                    int i9 = i8 % 2;
                    return null;
                }
                ExtrasKt.RemoteActionCompatParcelizer(obj);
            }
            getloadermanager.RemoteActionCompatParcelizer.getClass();
            getloadermanager.RemoteActionCompatParcelizer(new isMap("HOST_FILE_DOWNLOAD_SUCCESS", "HOST_FILE_DOWNLOAD_SUCCESS"));
            return obj2;
        }
        CoroutineSingletons coroutineSingletons3 = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i10 = this.serializer;
        if (i10 != 0) {
            int i11 = RemoteActionCompatParcelizer + 7;
            int i12 = i11 % Fields.SpotShadowColor;
            read = i12;
            if (i11 % 2 != 0 ? i10 != 1 : i10 != 0) {
                ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            int i13 = i12 + 5;
            RemoteActionCompatParcelizer = i13 % Fields.SpotShadowColor;
            int i14 = i13 % 2;
            ExtrasKt.RemoteActionCompatParcelizer(obj);
        } else {
            ExtrasKt.RemoteActionCompatParcelizer(obj);
            this.serializer = 1;
            if (DelayKt.delay(1000L, this) == coroutineSingletons3) {
                int i15 = read + 53;
                RemoteActionCompatParcelizer = i15 % Fields.SpotShadowColor;
                if (i15 % 2 != 0) {
                    int i16 = 4 % 3;
                }
                return coroutineSingletons3;
            }
        }
        getloadermanager.RemoteActionCompatParcelizer.getClass();
        getloadermanager.RemoteActionCompatParcelizer(new isMap("HOST_FILE_DOWNLOAD_FAIL-" + UUID.randomUUID(), "HOST_FILE_DOWNLOAD_FAIL"));
        return obj2;
    }
}
