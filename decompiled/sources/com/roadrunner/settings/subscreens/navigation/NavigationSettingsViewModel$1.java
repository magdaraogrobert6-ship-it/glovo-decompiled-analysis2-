package com.roadrunner.settings.subscreens.navigation;

import androidx.compose.ui.graphics.Fields;
import coil3.ExtrasKt;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import com.roadrunner.delivery.ontheway.turnbyturn.settings.data.SettingsOnboardingDataStore;
import com.roadrunner.delivery.ontheway.turnbyturn.settings.data.SettingsOnboardingDataStore$setTooltipShown$2;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.FlowKt__ZipKt$combine$$inlined$combineUnsafe$FlowKt__ZipKt$3;
import kotlinx.coroutines.rx2.RxConvertKt$asObservable$1$job$1;
import o.ShortNewsContentCardView;
import o.accessgetProportionalcp;
import o.createFromParcel;
import o.getContentViewGroupParentLayout;
import o.pauseWebviewIfNecessarylambda10;
import o.r8lambdaWF0F8_Ok6qHeLC2nAVzsyRuLe94;
import o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0;

/* JADX INFO: loaded from: classes3.dex */
public final class NavigationSettingsViewModel$1 extends SuspendLambda implements r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 {
    private static int serializer = 0;
    private static int write = 1;
    public int IconCompatParcelizer;
    public final /* synthetic */ r8lambdaWF0F8_Ok6qHeLC2nAVzsyRuLe94 RemoteActionCompatParcelizer;
    public final /* synthetic */ int read;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ NavigationSettingsViewModel$1(r8lambdaWF0F8_Ok6qHeLC2nAVzsyRuLe94 r8lambdawf0f8_ok6qhelc2navzsyrule94, ShortNewsContentCardView shortNewsContentCardView, int i) {
        super(2, shortNewsContentCardView);
        this.read = i;
        this.RemoteActionCompatParcelizer = r8lambdawf0f8_ok6qhelc2navzsyrule94;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final ShortNewsContentCardView create(Object obj, ShortNewsContentCardView shortNewsContentCardView) {
        int i = 2 % 2;
        int i2 = serializer + 107;
        write = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        int i4 = this.read;
        r8lambdaWF0F8_Ok6qHeLC2nAVzsyRuLe94 r8lambdawf0f8_ok6qhelc2navzsyrule94 = this.RemoteActionCompatParcelizer;
        if (i4 == 0) {
            return new NavigationSettingsViewModel$1(r8lambdawf0f8_ok6qhelc2navzsyrule94, shortNewsContentCardView, 0);
        }
        NavigationSettingsViewModel$1 navigationSettingsViewModel$1 = new NavigationSettingsViewModel$1(r8lambdawf0f8_ok6qhelc2navzsyrule94, shortNewsContentCardView, 1);
        int i5 = write + 81;
        serializer = i5 % Fields.SpotShadowColor;
        int i6 = i5 % 2;
        return navigationSettingsViewModel$1;
    }

    @Override // o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0
    public final Object invoke(Object obj, Object obj2) {
        int i = 2 % 2;
        int i2 = write + 119;
        serializer = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        int i4 = this.read;
        createFromParcel createfromparcel = createFromParcel.INSTANCE;
        getContentViewGroupParentLayout getcontentviewgroupparentlayout = (getContentViewGroupParentLayout) obj;
        ShortNewsContentCardView shortNewsContentCardView = (ShortNewsContentCardView) obj2;
        if (i4 == 0) {
            return ((NavigationSettingsViewModel$1) create(getcontentviewgroupparentlayout, shortNewsContentCardView)).invokeSuspend(createfromparcel);
        }
        Object objInvokeSuspend = ((NavigationSettingsViewModel$1) create(getcontentviewgroupparentlayout, shortNewsContentCardView)).invokeSuspend(createfromparcel);
        int i5 = serializer + 53;
        write = i5 % Fields.SpotShadowColor;
        if (i5 % 2 == 0) {
            int i6 = 50 / 0;
        }
        return objInvokeSuspend;
    }

    /* JADX WARN: Code duplicated, block: B:33:0x0098  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object objSerializer;
        int i = 2 % 2;
        int i2 = this.read;
        Object obj2 = createFromParcel.INSTANCE;
        r8lambdaWF0F8_Ok6qHeLC2nAVzsyRuLe94 r8lambdawf0f8_ok6qhelc2navzsyrule94 = this.RemoteActionCompatParcelizer;
        if (i2 != 0) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i3 = this.IconCompatParcelizer;
            if (i3 == 0) {
                ExtrasKt.RemoteActionCompatParcelizer(obj);
                FlowKt__ZipKt$combine$$inlined$combineUnsafe$FlowKt__ZipKt$3 flowKt__ZipKt$combine$$inlined$combineUnsafe$FlowKt__ZipKt$3RemoteActionCompatParcelizer = FlowKt.RemoteActionCompatParcelizer(r8lambdawf0f8_ok6qhelc2navzsyrule94.MediaBrowserCompatMediaItem, r8lambdawf0f8_ok6qhelc2navzsyrule94.RatingCompat, r8lambdawf0f8_ok6qhelc2navzsyrule94.read, r8lambdawf0f8_ok6qhelc2navzsyrule94.write, r8lambdawf0f8_ok6qhelc2navzsyrule94.MediaDescriptionCompat, new NavigationSettingsViewModel$2$1(r8lambdawf0f8_ok6qhelc2navzsyrule94, null));
                RxConvertKt$asObservable$1$job$1.AnonymousClass1 anonymousClass1 = new RxConvertKt$asObservable$1$job$1.AnonymousClass1(23, r8lambdawf0f8_ok6qhelc2navzsyrule94);
                this.IconCompatParcelizer = 1;
                return flowKt__ZipKt$combine$$inlined$combineUnsafe$FlowKt__ZipKt$3RemoteActionCompatParcelizer.collect(anonymousClass1, this) == coroutineSingletons ? coroutineSingletons : obj2;
            }
            if (i3 == 1) {
                ExtrasKt.RemoteActionCompatParcelizer(obj);
                return obj2;
            }
            ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
            int i4 = serializer + 1;
            write = i4 % Fields.SpotShadowColor;
            int i5 = i4 % 2;
            return null;
        }
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i6 = this.IconCompatParcelizer;
        if (i6 != 0) {
            int i7 = serializer + 75;
            write = i7 % Fields.SpotShadowColor;
            if (i7 % 2 != 0 ? i6 != 1 : i6 != 1) {
                ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                obj2 = null;
            } else {
                ExtrasKt.RemoteActionCompatParcelizer(obj);
            }
        } else {
            ExtrasKt.RemoteActionCompatParcelizer(obj);
            accessgetProportionalcp accessgetproportionalcp = r8lambdawf0f8_ok6qhelc2navzsyrule94.MediaMetadataCompat;
            this.IconCompatParcelizer = 1;
            if (!(!accessgetproportionalcp.RemoteActionCompatParcelizer.read())) {
                SettingsOnboardingDataStore settingsOnboardingDataStore = accessgetproportionalcp.serializer.RemoteActionCompatParcelizer;
                objSerializer = pauseWebviewIfNecessarylambda10.serializer(settingsOnboardingDataStore.IconCompatParcelizer, new SettingsOnboardingDataStore$setTooltipShown$2(settingsOnboardingDataStore, null, 2), this);
                if (objSerializer != coroutineSingletons2) {
                    objSerializer = obj2;
                }
                if (objSerializer != coroutineSingletons2) {
                    objSerializer = obj2;
                }
                if (objSerializer != coroutineSingletons2) {
                    objSerializer = obj2;
                }
            } else {
                objSerializer = obj2;
            }
            if (objSerializer == coroutineSingletons2) {
                int i8 = serializer + 3;
                int i9 = i8 % Fields.SpotShadowColor;
                write = i9;
                int i10 = i8 % 2;
                int i11 = i9 + 35;
                serializer = i11 % Fields.SpotShadowColor;
                if (i11 % 2 != 0) {
                    int i12 = 4 / 5;
                }
                obj2 = coroutineSingletons2;
            }
        }
        int i13 = write + 119;
        serializer = i13 % Fields.SpotShadowColor;
        int i14 = i13 % 2;
        return obj2;
    }
}
