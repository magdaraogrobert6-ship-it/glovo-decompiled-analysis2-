package com.roadrunner.auth.domain.logout;

import androidx.compose.ui.graphics.Fields;
import coil3.ExtrasKt;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import com.roadrunner.auth.data.SignInDataStore;
import com.roadrunner.customerchat.legacy.core.manager.CustomerChatProviderImpl;
import com.roadrunner.experience_tools.qualtrics.QualtricsManagerImpl;
import io.reactivex.internal.operators.completable.CompletableCreate;
import java.util.concurrent.CancellationException;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.rx2.RxAwaitKt;
import o.TextForegroundStyle;
import o.accessgetOldDependenciesSetp;
import o.addStyle;
import o.bootstrapLifecycleI;
import o.createFromParcel;
import o.getInstallBeginTimeInSeconds;
import o.getMinWidth;
import o.getTouchaOaMEAU;
import o.hideFromAccessibility;
import o.isOpenInternalroom_runtime;
import o.parseLayoutDescription;
import o.s2;
import timber.log.Timber;

/* JADX INFO: loaded from: classes3.dex */
public final class ClearServicesUseCase {
    private static int MediaSessionCompatResultReceiverWrapper = 0;
    private static int ParcelableVolumeInfo = 1;
    public final CustomerChatProviderImpl IconCompatParcelizer;
    public final QualtricsManagerImpl MediaBrowserCompatMediaItem;
    public final accessgetOldDependenciesSetp MediaDescriptionCompat;
    public final s2 MediaMetadataCompat;
    public final getTouchaOaMEAU MediaSessionCompatQueueItem;
    public final addStyle MediaSessionCompatToken;
    public final getInstallBeginTimeInSeconds PlaybackStateCompat;
    public final TextForegroundStyle PlaybackStateCompatCustomAction;
    public final bootstrapLifecycleI RatingCompat;
    public final isOpenInternalroom_runtime RemoteActionCompatParcelizer;
    public final getMinWidth read;
    public final SignInDataStore serializer;
    public final parseLayoutDescription write;

    public ClearServicesUseCase(getTouchaOaMEAU gettouchaoameau, accessgetOldDependenciesSetp accessgetolddependenciessetp, s2 s2Var, QualtricsManagerImpl qualtricsManagerImpl, getMinWidth getminwidth, CustomerChatProviderImpl customerChatProviderImpl, addStyle addstyle, getInstallBeginTimeInSeconds getinstallbegintimeinseconds, bootstrapLifecycleI bootstraplifecyclei, isOpenInternalroom_runtime isopeninternalroom_runtime, parseLayoutDescription parselayoutdescription, TextForegroundStyle textForegroundStyle, SignInDataStore signInDataStore) {
        gettouchaoameau.getClass();
        accessgetolddependenciessetp.getClass();
        s2Var.getClass();
        qualtricsManagerImpl.getClass();
        getminwidth.getClass();
        customerChatProviderImpl.getClass();
        addstyle.getClass();
        getinstallbegintimeinseconds.getClass();
        bootstraplifecyclei.getClass();
        isopeninternalroom_runtime.getClass();
        parselayoutdescription.getClass();
        textForegroundStyle.getClass();
        signInDataStore.getClass();
        this.MediaSessionCompatQueueItem = gettouchaoameau;
        this.MediaDescriptionCompat = accessgetolddependenciessetp;
        this.MediaMetadataCompat = s2Var;
        this.MediaBrowserCompatMediaItem = qualtricsManagerImpl;
        this.read = getminwidth;
        this.IconCompatParcelizer = customerChatProviderImpl;
        this.MediaSessionCompatToken = addstyle;
        this.PlaybackStateCompat = getinstallbegintimeinseconds;
        this.RatingCompat = bootstraplifecyclei;
        this.RemoteActionCompatParcelizer = isopeninternalroom_runtime;
        this.write = parselayoutdescription;
        this.PlaybackStateCompatCustomAction = textForegroundStyle;
        this.serializer = signInDataStore;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0026  */
    public static final Object access$deleteToken(ClearServicesUseCase clearServicesUseCase, ContinuationImpl continuationImpl) {
        hideFromAccessibility hidefromaccessibility;
        int i = 2 % 2;
        if (continuationImpl instanceof hideFromAccessibility) {
            hidefromaccessibility = (hideFromAccessibility) continuationImpl;
            int i2 = hidefromaccessibility.RemoteActionCompatParcelizer;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                int i3 = MediaSessionCompatResultReceiverWrapper + 77;
                ParcelableVolumeInfo = i3 % Fields.SpotShadowColor;
                if (i3 % 2 == 0) {
                    hidefromaccessibility.RemoteActionCompatParcelizer = i2 >> Integer.MIN_VALUE;
                } else {
                    hidefromaccessibility.RemoteActionCompatParcelizer = i2 - Integer.MIN_VALUE;
                }
            } else {
                hidefromaccessibility = new hideFromAccessibility(clearServicesUseCase, continuationImpl);
                int i4 = MediaSessionCompatResultReceiverWrapper + 53;
                ParcelableVolumeInfo = i4 % Fields.SpotShadowColor;
                int i5 = i4 % 2;
            }
        } else {
            hidefromaccessibility = new hideFromAccessibility(clearServicesUseCase, continuationImpl);
            int i6 = MediaSessionCompatResultReceiverWrapper + 53;
            ParcelableVolumeInfo = i6 % Fields.SpotShadowColor;
            int i7 = i6 % 2;
        }
        Object obj = hidefromaccessibility.write;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i8 = hidefromaccessibility.RemoteActionCompatParcelizer;
        try {
            if (i8 == 0) {
                ExtrasKt.RemoteActionCompatParcelizer(obj);
                CompletableCreate completableCreate = clearServicesUseCase.MediaDescriptionCompat.read();
                hidefromaccessibility.RemoteActionCompatParcelizer = 1;
                if (RxAwaitKt.await(completableCreate, hidefromaccessibility) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i8 != 1) {
                    ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                int i9 = ParcelableVolumeInfo + 123;
                MediaSessionCompatResultReceiverWrapper = i9 % Fields.SpotShadowColor;
                int i10 = i9 % 2;
                ExtrasKt.RemoteActionCompatParcelizer(obj);
            }
        } catch (CancellationException e) {
            throw e;
        } catch (Exception e2) {
            Timber.RemoteActionCompatParcelizer.RemoteActionCompatParcelizer(e2, "Failed to delete token", new Object[0]);
        }
        createFromParcel createfromparcel = createFromParcel.INSTANCE;
        int i11 = MediaSessionCompatResultReceiverWrapper + 117;
        ParcelableVolumeInfo = i11 % Fields.SpotShadowColor;
        int i12 = i11 % 2;
        return createfromparcel;
    }
}
