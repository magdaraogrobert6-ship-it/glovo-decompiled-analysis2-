package com.roadrunner.settings;

import androidx.compose.ui.graphics.Fields;
import coil3.ExtrasKt;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import com.roadrunner.home.nest.NestViewModel$updateConfiguration$1$1$1$1;
import com.roadrunner.realtime.domain.GetAppStateImpl$invoke$$inlined$map$1;
import com.roadrunner.settings.data.cache.SettingsCacheImpl;
import com.sentiance.core.model.events.N$b;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.rx2.RxConvertKt$asObservable$1$job$1;
import o.ShortNewsContentCardView;
import o.createFromParcel;
import o.getContentViewGroupParentLayout;
import o.isItemDismissable;
import o.onItemDismiss;
import o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0;
import timber.log.Timber;

/* JADX INFO: loaded from: classes3.dex */
public final class SettingsViewModel$load$1 extends SuspendLambda implements r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 {
    private static int read = 0;
    private static int serializer = 1;
    public int IconCompatParcelizer;
    public final /* synthetic */ int RemoteActionCompatParcelizer;
    public final /* synthetic */ SettingsViewModel write;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ SettingsViewModel$load$1(SettingsViewModel settingsViewModel, ShortNewsContentCardView shortNewsContentCardView, int i) {
        super(2, shortNewsContentCardView);
        this.RemoteActionCompatParcelizer = i;
        this.write = settingsViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final ShortNewsContentCardView create(Object obj, ShortNewsContentCardView shortNewsContentCardView) {
        int i = 2 % 2;
        int i2 = read + 67;
        serializer = i2 % Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            Object obj2 = null;
            obj2.hashCode();
            throw null;
        }
        int i3 = this.RemoteActionCompatParcelizer;
        SettingsViewModel settingsViewModel = this.write;
        if (i3 == 0) {
            return new SettingsViewModel$load$1(settingsViewModel, shortNewsContentCardView, 0);
        }
        SettingsViewModel$load$1 settingsViewModel$load$1 = new SettingsViewModel$load$1(settingsViewModel, shortNewsContentCardView, 1);
        int i4 = serializer + 5;
        read = i4 % Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return settingsViewModel$load$1;
    }

    @Override // o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0
    public final Object invoke(Object obj, Object obj2) throws Throwable {
        int i = 2 % 2;
        int i2 = serializer + 7;
        read = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        int i4 = this.RemoteActionCompatParcelizer;
        createFromParcel createfromparcel = createFromParcel.INSTANCE;
        getContentViewGroupParentLayout getcontentviewgroupparentlayout = (getContentViewGroupParentLayout) obj;
        ShortNewsContentCardView shortNewsContentCardView = (ShortNewsContentCardView) obj2;
        if (i4 == 0) {
            return ((SettingsViewModel$load$1) create(getcontentviewgroupparentlayout, shortNewsContentCardView)).invokeSuspend(createfromparcel);
        }
        Object objInvokeSuspend = ((SettingsViewModel$load$1) create(getcontentviewgroupparentlayout, shortNewsContentCardView)).invokeSuspend(createfromparcel);
        int i5 = read + 27;
        serializer = i5 % Fields.SpotShadowColor;
        int i6 = i5 % 2;
        return objInvokeSuspend;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objM5078fetchSettingsIoAF18A;
        int i = 2 % 2;
        int i2 = serializer + 125;
        read = i2 % Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            createFromParcel createfromparcel = createFromParcel.INSTANCE;
            throw null;
        }
        int i3 = this.RemoteActionCompatParcelizer;
        SettingsViewModel settingsViewModel = this.write;
        createFromParcel createfromparcel2 = createFromParcel.INSTANCE;
        if (i3 != 0) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i4 = this.IconCompatParcelizer;
            if (i4 == 0) {
                ExtrasKt.RemoteActionCompatParcelizer(obj);
                N$b n$b = settingsViewModel.ResultReceiver;
                n$b.getClass();
                RxConvertKt$asObservable$1$job$1.AnonymousClass1 anonymousClass1 = new RxConvertKt$asObservable$1$job$1.AnonymousClass1(21, settingsViewModel);
                this.IconCompatParcelizer = 1;
                SettingsCacheImpl settingsCacheImpl = (SettingsCacheImpl) n$b.IconCompatParcelizer;
                Object objCollect = settingsCacheImpl.serializer().serializer().collect(new NestViewModel$updateConfiguration$1$1$1$1(new GetAppStateImpl$invoke$$inlined$map$1.AnonymousClass2(anonymousClass1, 18), 27, settingsCacheImpl), this);
                if (objCollect != coroutineSingletons) {
                    objCollect = createfromparcel2;
                }
                if (objCollect != coroutineSingletons) {
                    objCollect = createfromparcel2;
                }
                if (objCollect == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i4 != 1) {
                    ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                int i5 = read + 121;
                serializer = i5 % Fields.SpotShadowColor;
                int i6 = i5 % 2;
                ExtrasKt.RemoteActionCompatParcelizer(obj);
            }
            return createfromparcel2;
        }
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i7 = this.IconCompatParcelizer;
        if (i7 != 0) {
            int i8 = serializer + 65;
            read = i8 % Fields.SpotShadowColor;
            if (i8 % 2 == 0 ? i7 != 1 : i7 != 0) {
                ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            ExtrasKt.RemoteActionCompatParcelizer(obj);
            objM5078fetchSettingsIoAF18A = ((onItemDismiss) obj).IconCompatParcelizer;
        } else {
            ExtrasKt.RemoteActionCompatParcelizer(obj);
            N$b n$b2 = settingsViewModel.ResultReceiver;
            this.IconCompatParcelizer = 1;
            objM5078fetchSettingsIoAF18A = n$b2.m5078fetchSettingsIoAF18A(this);
            if (objM5078fetchSettingsIoAF18A == coroutineSingletons2) {
                return coroutineSingletons2;
            }
        }
        if (!(objM5078fetchSettingsIoAF18A instanceof isItemDismissable)) {
            Timber.RemoteActionCompatParcelizer.getClass();
            int i9 = serializer + 45;
            read = i9 % Fields.SpotShadowColor;
            int i10 = i9 % 2;
        }
        Throwable thSerializer = onItemDismiss.serializer(objM5078fetchSettingsIoAF18A);
        if (thSerializer != null) {
            int i11 = serializer + 79;
            read = i11 % Fields.SpotShadowColor;
            if (i11 % 2 != 0) {
                Timber.RemoteActionCompatParcelizer.RemoteActionCompatParcelizer(thSerializer, "Failed to fetch settings response", new Object[1]);
            } else {
                Timber.RemoteActionCompatParcelizer.RemoteActionCompatParcelizer(thSerializer, "Failed to fetch settings response", new Object[0]);
            }
        }
        return createfromparcel2;
    }
}
