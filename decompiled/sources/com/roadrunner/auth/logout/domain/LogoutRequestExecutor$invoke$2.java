package com.roadrunner.auth.logout.domain;

import androidx.compose.ui.graphics.Fields;
import coil3.ExtrasKt;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import com.roadrunner.auth.data.AuthRepository;
import com.roadrunner.domain.util.IsFixableByRetry;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.TimeoutKt;
import o.C0159dialog;
import o.ShortNewsContentCardView;
import o.createFromParcel;
import o.getContentViewGroupParentLayout;
import o.getTraversalIndexdelegate;
import o.isItemDismissable;
import o.metaMarkUpdatedAndHasCallbacks;
import o.onItemDismiss;
import o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0;
import o.scrollByOffset;
import timber.log.Timber;

/* JADX INFO: loaded from: classes3.dex */
public final class LogoutRequestExecutor$invoke$2 extends SuspendLambda implements r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 {
    private static int MediaMetadataCompat = 1;
    private static int RatingCompat;
    public final /* synthetic */ int IconCompatParcelizer;
    public int RemoteActionCompatParcelizer;
    public final /* synthetic */ scrollByOffset read;
    public final /* synthetic */ getTraversalIndexdelegate serializer;
    public final /* synthetic */ metaMarkUpdatedAndHasCallbacks write;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ LogoutRequestExecutor$invoke$2(scrollByOffset scrollbyoffset, getTraversalIndexdelegate gettraversalindexdelegate, metaMarkUpdatedAndHasCallbacks metamarkupdatedandhascallbacks, ShortNewsContentCardView shortNewsContentCardView, int i) {
        super(2, shortNewsContentCardView);
        this.IconCompatParcelizer = i;
        this.read = scrollbyoffset;
        this.serializer = gettraversalindexdelegate;
        this.write = metamarkupdatedandhascallbacks;
    }

    @Override // o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0
    public final Object invoke(Object obj, Object obj2) {
        int i = 2 % 2;
        int i2 = RatingCompat + 35;
        MediaMetadataCompat = i2 % Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            createFromParcel createfromparcel = createFromParcel.INSTANCE;
            Object obj3 = null;
            obj3.hashCode();
            throw null;
        }
        int i3 = this.IconCompatParcelizer;
        createFromParcel createfromparcel2 = createFromParcel.INSTANCE;
        getContentViewGroupParentLayout getcontentviewgroupparentlayout = (getContentViewGroupParentLayout) obj;
        ShortNewsContentCardView shortNewsContentCardView = (ShortNewsContentCardView) obj2;
        if (i3 != 0) {
            return ((LogoutRequestExecutor$invoke$2) create(getcontentviewgroupparentlayout, shortNewsContentCardView)).invokeSuspend(createfromparcel2);
        }
        Object objInvokeSuspend = ((LogoutRequestExecutor$invoke$2) create(getcontentviewgroupparentlayout, shortNewsContentCardView)).invokeSuspend(createfromparcel2);
        int i4 = RatingCompat + 41;
        MediaMetadataCompat = i4 % Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return objInvokeSuspend;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final ShortNewsContentCardView create(Object obj, ShortNewsContentCardView shortNewsContentCardView) {
        int i = 2 % 2;
        int i2 = RatingCompat + 43;
        MediaMetadataCompat = i2 % Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            throw null;
        }
        if (this.IconCompatParcelizer != 0) {
            return new LogoutRequestExecutor$invoke$2(this.read, this.serializer, this.write, shortNewsContentCardView, 1);
        }
        LogoutRequestExecutor$invoke$2 logoutRequestExecutor$invoke$2 = new LogoutRequestExecutor$invoke$2(this.read, this.serializer, this.write, shortNewsContentCardView, 0);
        int i3 = RatingCompat + 117;
        MediaMetadataCompat = i3 % Fields.SpotShadowColor;
        if (i3 % 2 == 0) {
            int i4 = 36 / 0;
        }
        return logoutRequestExecutor$invoke$2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object objM4860logoutUsergIAlus;
        int i = 2 % 2;
        int i2 = MediaMetadataCompat + 75;
        RatingCompat = i2 % Fields.SpotShadowColor;
        Object obj2 = null;
        if (i2 % 2 != 0) {
            obj2.hashCode();
            throw null;
        }
        if (this.IconCompatParcelizer == 0) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i3 = this.RemoteActionCompatParcelizer;
            scrollByOffset scrollbyoffset = this.read;
            try {
                if (i3 == 0) {
                    ExtrasKt.RemoteActionCompatParcelizer(obj);
                    LogoutRequestExecutor$invoke$2 logoutRequestExecutor$invoke$2 = new LogoutRequestExecutor$invoke$2(scrollbyoffset, this.serializer, this.write, null, 1);
                    this.RemoteActionCompatParcelizer = 1;
                    if (TimeoutKt.withTimeout(30000L, logoutRequestExecutor$invoke$2, this) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i3 != 1) {
                        ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    ExtrasKt.RemoteActionCompatParcelizer(obj);
                }
            } catch (Exception e) {
                scrollbyoffset.write.RemoteActionCompatParcelizer(e);
                Timber.RemoteActionCompatParcelizer.write(new Throwable("Logout timeout", e));
            }
            return createFromParcel.INSTANCE;
        }
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i4 = this.RemoteActionCompatParcelizer;
        scrollByOffset scrollbyoffset2 = this.read;
        if (i4 == 0) {
            ExtrasKt.RemoteActionCompatParcelizer(obj);
            AuthRepository authRepository = scrollbyoffset2.RemoteActionCompatParcelizer;
            IsFixableByRetry isFixableByRetry = scrollbyoffset2.serializer;
            String str = this.write.countryCode;
            isFixableByRetry.getClass();
            str.getClass();
            getTraversalIndexdelegate gettraversalindexdelegate = this.serializer;
            C0159dialog c0159dialog = new C0159dialog(gettraversalindexdelegate.accessToken, gettraversalindexdelegate.deviceToken, str);
            this.RemoteActionCompatParcelizer = 1;
            objM4860logoutUsergIAlus = authRepository.m4860logoutUsergIAlus(c0159dialog, this);
            if (objM4860logoutUsergIAlus == coroutineSingletons2) {
                return coroutineSingletons2;
            }
        } else {
            if (i4 != 1) {
                ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            ExtrasKt.RemoteActionCompatParcelizer(obj);
            objM4860logoutUsergIAlus = ((onItemDismiss) obj).IconCompatParcelizer;
        }
        if (!(objM4860logoutUsergIAlus instanceof isItemDismissable)) {
            scrollbyoffset2.write.write.logEvent("logout_success", null);
            Timber.RemoteActionCompatParcelizer.IconCompatParcelizer("Logout success", new Object[0]);
        }
        Throwable thSerializer = onItemDismiss.serializer(objM4860logoutUsergIAlus);
        if (thSerializer != null) {
            int i5 = RatingCompat + 37;
            MediaMetadataCompat = i5 % Fields.SpotShadowColor;
            if (i5 % 2 == 0) {
                scrollbyoffset2.write.RemoteActionCompatParcelizer(thSerializer);
                Timber.RemoteActionCompatParcelizer.serializer(thSerializer);
                int i6 = 94 / 0;
            } else {
                scrollbyoffset2.write.RemoteActionCompatParcelizer(thSerializer);
                Timber.RemoteActionCompatParcelizer.serializer(thSerializer);
            }
        }
        return new onItemDismiss(objM4860logoutUsergIAlus);
    }
}
