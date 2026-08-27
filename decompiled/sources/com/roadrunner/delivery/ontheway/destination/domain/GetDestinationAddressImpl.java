package com.roadrunner.delivery.ontheway.destination.domain;

import android.app.Application;
import android.content.Intent;
import android.net.Uri;
import androidx.compose.ui.graphics.Fields;
import coil3.ExtrasKt;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import com.logistics.rider.glovo.R;
import com.roadrunner.auth.data.SignInDataStore$set$2;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.scheduling.DefaultIoScheduler;
import kotlinx.coroutines.scheduling.DefaultScheduler;
import o.accessgetDonecp;
import o.accessgetGocp;
import o.getLanguage;
import o.inCompatibilityMode;
import o.isItemDismissable;
import o.isOpenInternalroom_runtime;
import o.oa;
import o.prepareForActivityTransitionCarryover;
import o.setTransactionSuccessful;
import o.transferSessionPackageI;
import timber.log.Timber;

/* JADX INFO: loaded from: classes3.dex */
public final class GetDestinationAddressImpl {
    private static int MediaSessionCompatQueueItem = 1;
    private static int RatingCompat;
    public final getLanguage IconCompatParcelizer;
    public final setTransactionSuccessful MediaDescriptionCompat;
    public final transferSessionPackageI RemoteActionCompatParcelizer;
    public final isOpenInternalroom_runtime read;
    public final oa serializer;
    public final Application write;

    public GetDestinationAddressImpl(isOpenInternalroom_runtime isopeninternalroom_runtime, setTransactionSuccessful settransactionsuccessful, transferSessionPackageI transfersessionpackagei, oa oaVar, getLanguage getlanguage, Application application) {
        isopeninternalroom_runtime.getClass();
        settransactionsuccessful.getClass();
        transfersessionpackagei.getClass();
        oaVar.getClass();
        getlanguage.getClass();
        application.getClass();
        this.read = isopeninternalroom_runtime;
        this.MediaDescriptionCompat = settransactionsuccessful;
        this.RemoteActionCompatParcelizer = transfersessionpackagei;
        this.serializer = oaVar;
        this.IconCompatParcelizer = getlanguage;
        this.write = application;
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0036  */
    /* JADX INFO: renamed from: invoke-gIAlu-s, reason: not valid java name */
    public final Object m4917invokegIAlus(accessgetDonecp accessgetdonecp, ContinuationImpl continuationImpl) throws Throwable {
        GetDestinationAddressImpl$invoke$1 getDestinationAddressImpl$invoke$1;
        int i = 2 % 2;
        int i2 = MediaSessionCompatQueueItem + 109;
        int i3 = i2 % Fields.SpotShadowColor;
        RatingCompat = i3;
        Object obj = null;
        if (i2 % 2 != 0) {
            boolean z = continuationImpl instanceof GetDestinationAddressImpl$invoke$1;
            obj.hashCode();
            throw null;
        }
        if (continuationImpl instanceof GetDestinationAddressImpl$invoke$1) {
            int i4 = i3 + 67;
            MediaSessionCompatQueueItem = i4 % Fields.SpotShadowColor;
            int i5 = i4 % 2;
            getDestinationAddressImpl$invoke$1 = (GetDestinationAddressImpl$invoke$1) continuationImpl;
            int i6 = getDestinationAddressImpl$invoke$1.IconCompatParcelizer;
            if ((i6 & Integer.MIN_VALUE) != 0) {
                int i7 = MediaSessionCompatQueueItem + 123;
                RatingCompat = i7 % Fields.SpotShadowColor;
                getDestinationAddressImpl$invoke$1.IconCompatParcelizer = i7 % 2 != 0 ? i6 - Integer.MIN_VALUE : i6 - Integer.MIN_VALUE;
            } else {
                getDestinationAddressImpl$invoke$1 = new GetDestinationAddressImpl$invoke$1(this, continuationImpl);
            }
        } else {
            getDestinationAddressImpl$invoke$1 = new GetDestinationAddressImpl$invoke$1(this, continuationImpl);
        }
        Object objWithContext = getDestinationAddressImpl$invoke$1.serializer;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i8 = getDestinationAddressImpl$invoke$1.IconCompatParcelizer;
        if (i8 == 0) {
            ExtrasKt.RemoteActionCompatParcelizer(objWithContext);
            accessgetGocp accessgetgocpSerializer = accessgetdonecp.serializer();
            ((inCompatibilityMode) this.read).getClass();
            DefaultScheduler defaultScheduler = prepareForActivityTransitionCarryover.RemoteActionCompatParcelizer;
            DefaultIoScheduler defaultIoScheduler = DefaultIoScheduler.RemoteActionCompatParcelizer;
            SignInDataStore$set$2 signInDataStore$set$2 = new SignInDataStore$set$2(this, accessgetdonecp, accessgetgocpSerializer, null, 27);
            getDestinationAddressImpl$invoke$1.IconCompatParcelizer = 1;
            objWithContext = BuildersKt.withContext(defaultIoScheduler, signInDataStore$set$2, getDestinationAddressImpl$invoke$1);
            if (objWithContext == coroutineSingletons) {
                int i9 = MediaSessionCompatQueueItem + 123;
                RatingCompat = i9 % Fields.SpotShadowColor;
                int i10 = i9 % 2;
                return coroutineSingletons;
            }
        } else {
            if (i8 != 1) {
                ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            ExtrasKt.RemoteActionCompatParcelizer(objWithContext);
        }
        Intent intent = new Intent("android.intent.action.VIEW", (Uri) objWithContext);
        if (intent.resolveActivity(this.write.getApplicationContext().getPackageManager()) != null) {
            return intent;
        }
        Timber.RemoteActionCompatParcelizer.read("Navigation app was not found", new Object[0]);
        return new isItemDismissable(new Throwable(this.MediaDescriptionCompat.IconCompatParcelizer(R.string.error_no_navigation_app)));
    }
}
