package com.roadrunner.delivery.accept.autoaccept.preferences.presentation;

import androidx.compose.ui.graphics.Fields;
import coil3.ExtrasKt;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import com.roadrunner.delivery.accept.autoaccept.preferences.data.AutoAcceptPreferencesDataStoreImpl;
import com.roadrunner.delivery.accept.autoaccept.preferences.data.AutoAcceptPreferencesDataStoreImpl$setAutoAcceptOpted$2;
import com.roadrunner.delivery.accept.autoaccept.preferences.data.AutoAcceptPreferencesLocalRepositoryImpl;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import o.ShortNewsContentCardView;
import o.createFromParcel;
import o.getContentViewGroupParentLayout;
import o.pauseWebviewIfNecessarylambda10;
import o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0;

/* JADX INFO: loaded from: classes3.dex */
public final class AutoAcceptPreferencesViewModel$onEndShiftToggle$1 extends SuspendLambda implements r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 {
    private static int MediaMetadataCompat = 1;
    private static int write;
    public int IconCompatParcelizer;
    public final /* synthetic */ boolean RemoteActionCompatParcelizer;
    public final /* synthetic */ int read;
    public final /* synthetic */ AutoAcceptPreferencesViewModel serializer;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ AutoAcceptPreferencesViewModel$onEndShiftToggle$1(AutoAcceptPreferencesViewModel autoAcceptPreferencesViewModel, boolean z, ShortNewsContentCardView shortNewsContentCardView, int i) {
        super(2, shortNewsContentCardView);
        this.read = i;
        this.serializer = autoAcceptPreferencesViewModel;
        this.RemoteActionCompatParcelizer = z;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final ShortNewsContentCardView create(Object obj, ShortNewsContentCardView shortNewsContentCardView) {
        int i = 2 % 2;
        int i2 = write + 87;
        MediaMetadataCompat = i2 % Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            throw null;
        }
        if (this.read == 0) {
            return new AutoAcceptPreferencesViewModel$onEndShiftToggle$1(this.serializer, this.RemoteActionCompatParcelizer, shortNewsContentCardView, 0);
        }
        AutoAcceptPreferencesViewModel$onEndShiftToggle$1 autoAcceptPreferencesViewModel$onEndShiftToggle$1 = new AutoAcceptPreferencesViewModel$onEndShiftToggle$1(this.serializer, this.RemoteActionCompatParcelizer, shortNewsContentCardView, 1);
        int i3 = MediaMetadataCompat + 43;
        write = i3 % Fields.SpotShadowColor;
        int i4 = i3 % 2;
        return autoAcceptPreferencesViewModel$onEndShiftToggle$1;
    }

    @Override // o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0
    public final Object invoke(Object obj, Object obj2) {
        int i = 2 % 2;
        int i2 = this.read;
        createFromParcel createfromparcel = createFromParcel.INSTANCE;
        getContentViewGroupParentLayout getcontentviewgroupparentlayout = (getContentViewGroupParentLayout) obj;
        ShortNewsContentCardView shortNewsContentCardView = (ShortNewsContentCardView) obj2;
        Object obj3 = null;
        if (i2 == 0) {
            Object objInvokeSuspend = ((AutoAcceptPreferencesViewModel$onEndShiftToggle$1) create(getcontentviewgroupparentlayout, shortNewsContentCardView)).invokeSuspend(createfromparcel);
            int i3 = write + 55;
            MediaMetadataCompat = i3 % Fields.SpotShadowColor;
            if (i3 % 2 != 0) {
                return objInvokeSuspend;
            }
            throw null;
        }
        Object objInvokeSuspend2 = ((AutoAcceptPreferencesViewModel$onEndShiftToggle$1) create(getcontentviewgroupparentlayout, shortNewsContentCardView)).invokeSuspend(createfromparcel);
        int i4 = MediaMetadataCompat + 17;
        write = i4 % Fields.SpotShadowColor;
        if (i4 % 2 == 0) {
            return objInvokeSuspend2;
        }
        obj3.hashCode();
        throw null;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        int i = 2 % 2;
        int i2 = this.read;
        createFromParcel createfromparcel = createFromParcel.INSTANCE;
        boolean z = this.RemoteActionCompatParcelizer;
        AutoAcceptPreferencesViewModel autoAcceptPreferencesViewModel = this.serializer;
        if (i2 != 0) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i3 = this.IconCompatParcelizer;
            if (i3 != 0) {
                int i4 = MediaMetadataCompat + 59;
                write = i4 % Fields.SpotShadowColor;
                if (i4 % 2 == 0 ? i3 != 1 : i3 != 1) {
                    ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                ExtrasKt.RemoteActionCompatParcelizer(obj);
                return createfromparcel;
            }
            ExtrasKt.RemoteActionCompatParcelizer(obj);
            AutoAcceptPreferencesLocalRepositoryImpl autoAcceptPreferencesLocalRepositoryImpl = autoAcceptPreferencesViewModel.IconCompatParcelizer;
            this.IconCompatParcelizer = 1;
            if (autoAcceptPreferencesLocalRepositoryImpl.setAutoAcceptOpted(z, this) != coroutineSingletons) {
                return createfromparcel;
            }
            int i5 = MediaMetadataCompat + 41;
            write = i5 % Fields.SpotShadowColor;
            int i6 = i5 % 2;
            return coroutineSingletons;
        }
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i7 = this.IconCompatParcelizer;
        if (i7 != 0) {
            if (i7 != 1) {
                ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            int i8 = MediaMetadataCompat + 29;
            write = i8 % Fields.SpotShadowColor;
            if (i8 % 2 == 0) {
                ExtrasKt.RemoteActionCompatParcelizer(obj);
                return createfromparcel;
            }
            ExtrasKt.RemoteActionCompatParcelizer(obj);
            int i9 = 95 / 0;
            return createfromparcel;
        }
        ExtrasKt.RemoteActionCompatParcelizer(obj);
        AutoAcceptPreferencesLocalRepositoryImpl autoAcceptPreferencesLocalRepositoryImpl2 = autoAcceptPreferencesViewModel.IconCompatParcelizer;
        this.IconCompatParcelizer = 1;
        AutoAcceptPreferencesDataStoreImpl autoAcceptPreferencesDataStoreImpl = autoAcceptPreferencesLocalRepositoryImpl2.serializer;
        Object objSerializer = pauseWebviewIfNecessarylambda10.serializer(autoAcceptPreferencesDataStoreImpl.read, new AutoAcceptPreferencesDataStoreImpl$setAutoAcceptOpted$2(autoAcceptPreferencesDataStoreImpl, z, null, 1), this);
        if (objSerializer != coroutineSingletons2) {
            objSerializer = createfromparcel;
        }
        if (objSerializer == coroutineSingletons2) {
            int i10 = write + 31;
            MediaMetadataCompat = i10 % Fields.SpotShadowColor;
            int i11 = i10 % 2;
        } else {
            objSerializer = createfromparcel;
        }
        return objSerializer == coroutineSingletons2 ? coroutineSingletons2 : createfromparcel;
    }
}
