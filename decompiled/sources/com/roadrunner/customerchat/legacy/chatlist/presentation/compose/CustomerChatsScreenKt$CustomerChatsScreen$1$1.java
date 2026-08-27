package com.roadrunner.customerchat.legacy.chatlist.presentation.compose;

import androidx.compose.material3.SnackbarHostState;
import androidx.compose.ui.graphics.Fields;
import coil3.ExtrasKt;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import o.PopulateViewStructure_androidKtpopulate7;
import o.ShortNewsContentCardView;
import o.createFromParcel;
import o.getAutofillManager;
import o.getContentViewGroupParentLayout;
import o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0;
import o.setApplicationContext;

/* JADX INFO: loaded from: classes3.dex */
public final class CustomerChatsScreenKt$CustomerChatsScreen$1$1 extends SuspendLambda implements r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 {
    private static int MediaBrowserCompatMediaItem = 1;
    private static int MediaMetadataCompat;
    public int IconCompatParcelizer;
    public final /* synthetic */ int RemoteActionCompatParcelizer;
    public final /* synthetic */ String read;
    public final /* synthetic */ PopulateViewStructure_androidKtpopulate7 serializer;
    public final /* synthetic */ SnackbarHostState write;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ CustomerChatsScreenKt$CustomerChatsScreen$1$1(PopulateViewStructure_androidKtpopulate7 populateViewStructure_androidKtpopulate7, String str, SnackbarHostState snackbarHostState, ShortNewsContentCardView shortNewsContentCardView, int i) {
        super(2, shortNewsContentCardView);
        this.RemoteActionCompatParcelizer = i;
        this.serializer = populateViewStructure_androidKtpopulate7;
        this.read = str;
        this.write = snackbarHostState;
    }

    @Override // o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0
    public final Object invoke(Object obj, Object obj2) {
        int i = 2 % 2;
        int i2 = MediaMetadataCompat + 103;
        MediaBrowserCompatMediaItem = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        int i4 = this.RemoteActionCompatParcelizer;
        createFromParcel createfromparcel = createFromParcel.INSTANCE;
        getContentViewGroupParentLayout getcontentviewgroupparentlayout = (getContentViewGroupParentLayout) obj;
        ShortNewsContentCardView shortNewsContentCardView = (ShortNewsContentCardView) obj2;
        if (i4 != 0) {
            return ((CustomerChatsScreenKt$CustomerChatsScreen$1$1) create(getcontentviewgroupparentlayout, shortNewsContentCardView)).invokeSuspend(createfromparcel);
        }
        Object objInvokeSuspend = ((CustomerChatsScreenKt$CustomerChatsScreen$1$1) create(getcontentviewgroupparentlayout, shortNewsContentCardView)).invokeSuspend(createfromparcel);
        int i5 = MediaMetadataCompat + 3;
        MediaBrowserCompatMediaItem = i5 % Fields.SpotShadowColor;
        if (i5 % 2 != 0) {
            return objInvokeSuspend;
        }
        throw null;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final ShortNewsContentCardView create(Object obj, ShortNewsContentCardView shortNewsContentCardView) {
        int i = 2 % 2;
        int i2 = MediaMetadataCompat + 107;
        MediaBrowserCompatMediaItem = i2 % Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            throw null;
        }
        if (this.RemoteActionCompatParcelizer != 0) {
            return new CustomerChatsScreenKt$CustomerChatsScreen$1$1(this.serializer, this.read, this.write, shortNewsContentCardView, 1);
        }
        CustomerChatsScreenKt$CustomerChatsScreen$1$1 customerChatsScreenKt$CustomerChatsScreen$1$1 = new CustomerChatsScreenKt$CustomerChatsScreen$1$1(this.serializer, this.read, this.write, shortNewsContentCardView, 0);
        int i3 = MediaMetadataCompat + 27;
        MediaBrowserCompatMediaItem = i3 % Fields.SpotShadowColor;
        if (i3 % 2 != 0) {
            return customerChatsScreenKt$CustomerChatsScreen$1$1;
        }
        throw null;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        int i = 2 % 2;
        int i2 = this.RemoteActionCompatParcelizer;
        Object obj2 = createFromParcel.INSTANCE;
        String str = this.read;
        PopulateViewStructure_androidKtpopulate7 populateViewStructure_androidKtpopulate7 = this.serializer;
        if (i2 != 0) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i3 = this.IconCompatParcelizer;
            if (i3 == 0) {
                ExtrasKt.RemoteActionCompatParcelizer(obj);
                populateViewStructure_androidKtpopulate7.setValue(new setApplicationContext(str, null, null, 6));
                getAutofillManager getautofillmanager = getAutofillManager.Short;
                this.IconCompatParcelizer = 1;
                return SnackbarHostState.RemoteActionCompatParcelizer(this.write, this.read, null, getautofillmanager, this, 6) == coroutineSingletons ? coroutineSingletons : obj2;
            }
            int i4 = MediaMetadataCompat + 25;
            MediaBrowserCompatMediaItem = i4 % Fields.SpotShadowColor;
            if (i4 % 2 != 0 ? i3 != 1 : i3 != 1) {
                ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            ExtrasKt.RemoteActionCompatParcelizer(obj);
            return obj2;
        }
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i5 = this.IconCompatParcelizer;
        if (i5 != 0) {
            int i6 = MediaBrowserCompatMediaItem + 15;
            MediaMetadataCompat = i6 % Fields.SpotShadowColor;
            if (i6 % 2 == 0 ? i5 != 1 : i5 != 0) {
                ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                int i7 = MediaMetadataCompat + 113;
                MediaBrowserCompatMediaItem = i7 % Fields.SpotShadowColor;
                int i8 = i7 % 2;
                obj2 = null;
            } else {
                ExtrasKt.RemoteActionCompatParcelizer(obj);
            }
        } else {
            ExtrasKt.RemoteActionCompatParcelizer(obj);
            populateViewStructure_androidKtpopulate7.setValue(new setApplicationContext(str, null, null, 6));
            this.IconCompatParcelizer = 1;
            if (SnackbarHostState.RemoteActionCompatParcelizer(this.write, this.read, null, null, this, 14) == coroutineSingletons2) {
                obj2 = coroutineSingletons2;
            }
        }
        int i9 = MediaMetadataCompat + 91;
        MediaBrowserCompatMediaItem = i9 % Fields.SpotShadowColor;
        int i10 = i9 % 2;
        return obj2;
    }
}
