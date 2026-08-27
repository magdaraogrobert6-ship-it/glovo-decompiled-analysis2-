package com.roadrunner.auth.domain.logout;

import android.app.Activity;
import android.app.Application;
import android.content.Intent;
import android.os.Bundle;
import androidx.compose.ui.graphics.Fields;
import androidx.datastore.core.SimpleActor$offer$2;
import coil3.ExtrasKt;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import com.roadrunner.auth.domain.token.IsUserSignedInImpl;
import com.roadrunner.auth.logout.presentation.LogoutActivity;
import com.roadrunner.auth.statemachine.AuthStateMachine;
import java.util.concurrent.CancellationException;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlinx.coroutines.BuildersKt;
import o.AndroidUiDispatcherCompanioncurrentThread1;
import o.SemanticsPropertiesContentDescription1;
import o.SemanticsPropertiesTestTag1;
import o.ShortNewsContentCardView;
import o.createFromParcel;
import o.getContentViewGroupParentLayout;
import o.isEditable;
import o.r8lambda7Q1QCWXCUHrhcsGraulDg_ksbGU;
import o.transferSessionPackageI;
import timber.log.Timber;

/* JADX INFO: loaded from: classes3.dex */
public final class LogoutLifecycleCallbacksImpl implements Application.ActivityLifecycleCallbacks {
    private static int MediaBrowserCompatMediaItem = 0;
    private static int RatingCompat = 1;
    public final AuthStateMachine IconCompatParcelizer;
    public final transferSessionPackageI MediaMetadataCompat;
    public final getContentViewGroupParentLayout MediaSessionCompatQueueItem;
    public final SemanticsPropertiesTestTag1 RemoteActionCompatParcelizer;
    public final AndroidUiDispatcherCompanioncurrentThread1 read;
    public final SemanticsPropertiesContentDescription1 serializer;
    public r8lambda7Q1QCWXCUHrhcsGraulDg_ksbGU write;

    public LogoutLifecycleCallbacksImpl(SemanticsPropertiesTestTag1 semanticsPropertiesTestTag1, getContentViewGroupParentLayout getcontentviewgroupparentlayout, AndroidUiDispatcherCompanioncurrentThread1 androidUiDispatcherCompanioncurrentThread1, SemanticsPropertiesContentDescription1 semanticsPropertiesContentDescription1, transferSessionPackageI transfersessionpackagei, AuthStateMachine authStateMachine) {
        semanticsPropertiesTestTag1.getClass();
        getcontentviewgroupparentlayout.getClass();
        androidUiDispatcherCompanioncurrentThread1.getClass();
        semanticsPropertiesContentDescription1.getClass();
        transfersessionpackagei.getClass();
        authStateMachine.getClass();
        this.RemoteActionCompatParcelizer = semanticsPropertiesTestTag1;
        this.MediaSessionCompatQueueItem = getcontentviewgroupparentlayout;
        this.read = androidUiDispatcherCompanioncurrentThread1;
        this.serializer = semanticsPropertiesContentDescription1;
        this.MediaMetadataCompat = transfersessionpackagei;
        this.IconCompatParcelizer = authStateMachine;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
        int i = 2 % 2;
        int i2 = MediaBrowserCompatMediaItem + 25;
        RatingCompat = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        activity.getClass();
        int i4 = RatingCompat + 83;
        MediaBrowserCompatMediaItem = i4 % Fields.SpotShadowColor;
        int i5 = i4 % 2;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
        int i = 2 % 2;
        int i2 = MediaBrowserCompatMediaItem + 89;
        RatingCompat = i2 % Fields.SpotShadowColor;
        Object obj = null;
        if (i2 % 2 == 0) {
            activity.getClass();
            obj.hashCode();
            throw null;
        }
        activity.getClass();
        int i3 = RatingCompat + 103;
        MediaBrowserCompatMediaItem = i3 % Fields.SpotShadowColor;
        if (i3 % 2 == 0) {
            return;
        }
        obj.hashCode();
        throw null;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
        int i = 2 % 2;
        int i2 = RatingCompat + 113;
        MediaBrowserCompatMediaItem = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        activity.getClass();
        int i4 = MediaBrowserCompatMediaItem + 15;
        RatingCompat = i4 % Fields.SpotShadowColor;
        if (i4 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
        int i = 2 % 2;
        int i2 = MediaBrowserCompatMediaItem + 109;
        RatingCompat = i2 % Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            activity.getClass();
        } else {
            activity.getClass();
            int i3 = 47 / 0;
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        int i = 2 % 2;
        int i2 = RatingCompat + 49;
        MediaBrowserCompatMediaItem = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        activity.getClass();
        bundle.getClass();
        int i4 = MediaBrowserCompatMediaItem + 49;
        RatingCompat = i4 % Fields.SpotShadowColor;
        int i5 = i4 % 2;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
        int i = 2 % 2;
        activity.getClass();
        r8lambda7Q1QCWXCUHrhcsGraulDg_ksbGU r8lambda7q1qcwxcuhrhcsgrauldg_ksbgu = this.write;
        if (r8lambda7q1qcwxcuhrhcsgrauldg_ksbgu != null) {
            int i2 = RatingCompat + 55;
            MediaBrowserCompatMediaItem = i2 % Fields.SpotShadowColor;
            int i3 = i2 % 2;
            r8lambda7q1qcwxcuhrhcsgrauldg_ksbgu.write((CancellationException) null);
        }
        int i4 = RatingCompat + 11;
        MediaBrowserCompatMediaItem = i4 % Fields.SpotShadowColor;
        int i5 = i4 % 2;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
        int i = 2 % 2;
        activity.getClass();
        if (activity instanceof LogoutActivity) {
            return;
        }
        int i2 = RatingCompat;
        int i3 = i2 + 87;
        MediaBrowserCompatMediaItem = i3 % Fields.SpotShadowColor;
        int i4 = i3 % 2;
        r8lambda7Q1QCWXCUHrhcsGraulDg_ksbGU r8lambda7q1qcwxcuhrhcsgrauldg_ksbgu = this.write;
        ShortNewsContentCardView shortNewsContentCardView = null;
        if (r8lambda7q1qcwxcuhrhcsgrauldg_ksbgu != null) {
            int i5 = i2 + 53;
            MediaBrowserCompatMediaItem = i5 % Fields.SpotShadowColor;
            if (i5 % 2 != 0) {
                r8lambda7q1qcwxcuhrhcsgrauldg_ksbgu.write((CancellationException) null);
                int i6 = 45 / 0;
            } else {
                r8lambda7q1qcwxcuhrhcsgrauldg_ksbgu.write((CancellationException) null);
            }
        }
        this.write = BuildersKt.RemoteActionCompatParcelizer(this.MediaSessionCompatQueueItem, null, null, new SimpleActor$offer$2(this, activity, shortNewsContentCardView, 25), 3);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPreCreated(Activity activity, Bundle bundle) {
        int i = 2 % 2;
        int i2 = RatingCompat + 57;
        MediaBrowserCompatMediaItem = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        activity.getClass();
        if ((!(activity instanceof LogoutActivity)) && this.RemoteActionCompatParcelizer.serializer()) {
            Timber.RemoteActionCompatParcelizer.IconCompatParcelizer("Logout in progress. Finishing ".concat(activity.getClass().getSimpleName()), new Object[0]);
            activity.finish();
            int i4 = MediaBrowserCompatMediaItem + 93;
            RatingCompat = i4 % Fields.SpotShadowColor;
            int i5 = i4 % 2;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x001f  */
    /* JADX WARN: Code duplicated, block: B:9:0x002f  */
    public static final Object access$proceedWithLogout(LogoutLifecycleCallbacksImpl logoutLifecycleCallbacksImpl, Activity activity, String str, ShortNewsContentCardView shortNewsContentCardView) {
        isEditable iseditable;
        int i;
        int i2 = 2 % 2;
        int i3 = MediaBrowserCompatMediaItem + 123;
        RatingCompat = i3 % Fields.SpotShadowColor;
        int i4 = i3 % 2;
        if (shortNewsContentCardView instanceof isEditable) {
            iseditable = (isEditable) shortNewsContentCardView;
            int i5 = iseditable.write;
            if ((i5 & Integer.MIN_VALUE) != 0) {
                iseditable.write = i5 - Integer.MIN_VALUE;
            } else {
                iseditable = new isEditable(logoutLifecycleCallbacksImpl, shortNewsContentCardView);
                i = MediaBrowserCompatMediaItem + 97;
                RatingCompat = i % Fields.SpotShadowColor;
                if (i % 2 == 0) {
                    int i6 = 5 % 2;
                }
            }
        } else {
            iseditable = new isEditable(logoutLifecycleCallbacksImpl, shortNewsContentCardView);
            i = MediaBrowserCompatMediaItem + 97;
            RatingCompat = i % Fields.SpotShadowColor;
            if (i % 2 == 0) {
                int i7 = 5 % 2;
            }
        }
        Object objInvoke = iseditable.serializer;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i8 = iseditable.write;
        if (i8 != 0) {
            int i9 = MediaBrowserCompatMediaItem + 1;
            RatingCompat = i9 % Fields.SpotShadowColor;
            if (i9 % 2 != 0 ? i8 != 1 : i8 != 1) {
                ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            str = iseditable.RemoteActionCompatParcelizer;
            activity = iseditable.IconCompatParcelizer;
            ExtrasKt.RemoteActionCompatParcelizer(objInvoke);
        } else {
            ExtrasKt.RemoteActionCompatParcelizer(objInvoke);
            Timber.RemoteActionCompatParcelizer.IconCompatParcelizer("Logout was requested", new Object[0]);
            SemanticsPropertiesContentDescription1 semanticsPropertiesContentDescription1 = logoutLifecycleCallbacksImpl.serializer;
            iseditable.IconCompatParcelizer = activity;
            iseditable.RemoteActionCompatParcelizer = str;
            iseditable.write = 1;
            objInvoke = ((IsUserSignedInImpl) semanticsPropertiesContentDescription1).invoke(iseditable);
            if (objInvoke == coroutineSingletons) {
                int i10 = MediaBrowserCompatMediaItem + 7;
                RatingCompat = i10 % Fields.SpotShadowColor;
                if (i10 % 2 != 0) {
                    return coroutineSingletons;
                }
                throw null;
            }
        }
        if (((Boolean) objInvoke).booleanValue()) {
            Timber.RemoteActionCompatParcelizer.IconCompatParcelizer("Proceeding with logout", new Object[0]);
            logoutLifecycleCallbacksImpl.read.getClass();
            activity.getClass();
            str.getClass();
            Intent intent = new Intent(activity, (Class<?>) LogoutActivity.class);
            intent.addFlags(268468224);
            intent.putExtra("invocation_site", str);
            activity.startActivity(intent);
            activity.finish();
        }
        return createFromParcel.INSTANCE;
    }
}
