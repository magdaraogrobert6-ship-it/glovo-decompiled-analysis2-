package com.roadrunner.login.domain.auth;

import androidx.compose.ui.graphics.Fields;
import coil3.ExtrasKt;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import com.roadrunner.auth.data.SignInDataStore;
import com.roadrunner.auth.data.SignInDataStore$get$$inlined$map$1;
import com.roadrunner.auth.data.SignInDataStore$get$1;
import com.roadrunner.auth.domain.SignInUseCaseImpl;
import com.roadrunner.push.core.domain.DeletePushTokenImpl;
import com.roadrunner.remoteconfig.firebase.FirebaseRemoteConfigImpl;
import com.roadrunner.rider.recruitment.applicant.domain.ClearApplicantDataImpl;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.FlowKt__ErrorsKt$catch$$inlined$unsafeFlow$1;
import o.ShortNewsContentCardView;
import o.TransactionCallbacks;
import o.getContentType;
import o.getHeading;
import o.getHorizontalScrollAxisRangedelegate;
import o.getIsTraversalGroup;
import o.isItemDismissable;
import o.performCustomExitMxy_nc0;
import o.transferSessionPackageI;
import o.updateAdidI;

/* JADX INFO: loaded from: classes3.dex */
public final class FinishApplicationProcessUseCase {
    private static int MediaMetadataCompat = 0;
    private static int MediaSessionCompatQueueItem = 1;
    public final DeletePushTokenImpl IconCompatParcelizer;
    public final ClearApplicantDataImpl RemoteActionCompatParcelizer;
    public final getHorizontalScrollAxisRangedelegate read;
    public final getHeading serializer;
    public final transferSessionPackageI write;

    public FinishApplicationProcessUseCase(getHeading getheading, ClearApplicantDataImpl clearApplicantDataImpl, transferSessionPackageI transfersessionpackagei, DeletePushTokenImpl deletePushTokenImpl, getHorizontalScrollAxisRangedelegate gethorizontalscrollaxisrangedelegate) {
        getheading.getClass();
        clearApplicantDataImpl.getClass();
        transfersessionpackagei.getClass();
        deletePushTokenImpl.getClass();
        gethorizontalscrollaxisrangedelegate.getClass();
        this.serializer = getheading;
        this.RemoteActionCompatParcelizer = clearApplicantDataImpl;
        this.write = transfersessionpackagei;
        this.IconCompatParcelizer = deletePushTokenImpl;
        this.read = gethorizontalscrollaxisrangedelegate;
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0031  */
    /* JADX WARN: Code duplicated, block: B:37:0x00b7  */
    /* JADX WARN: Code duplicated, block: B:39:0x00c4  */
    /* JADX WARN: Code duplicated, block: B:42:0x00d7  */
    /* JADX WARN: Code duplicated, block: B:44:0x00e2  */
    /* JADX INFO: renamed from: invoke-IoAF18A, reason: not valid java name */
    public final Object m4987invokeIoAF18A(ContinuationImpl continuationImpl) {
        FinishApplicationProcessUseCase$invoke$1 finishApplicationProcessUseCase$invoke$1;
        getContentType getcontenttype;
        String str;
        int i;
        String str2;
        int i2 = 2 % 2;
        int i3 = MediaSessionCompatQueueItem + 65;
        int i4 = i3 % Fields.SpotShadowColor;
        MediaMetadataCompat = i4;
        int i5 = i3 % 2;
        ShortNewsContentCardView shortNewsContentCardView = null;
        if (continuationImpl instanceof FinishApplicationProcessUseCase$invoke$1) {
            int i6 = i4 + 15;
            MediaSessionCompatQueueItem = i6 % Fields.SpotShadowColor;
            if (i6 % 2 == 0) {
                int i7 = ((FinishApplicationProcessUseCase$invoke$1) continuationImpl).read;
                shortNewsContentCardView.hashCode();
                throw null;
            }
            finishApplicationProcessUseCase$invoke$1 = (FinishApplicationProcessUseCase$invoke$1) continuationImpl;
            int i8 = finishApplicationProcessUseCase$invoke$1.read;
            if ((i8 & Integer.MIN_VALUE) != 0) {
                finishApplicationProcessUseCase$invoke$1.read = i8 - Integer.MIN_VALUE;
            } else {
                finishApplicationProcessUseCase$invoke$1 = new FinishApplicationProcessUseCase$invoke$1(this, continuationImpl);
            }
        } else {
            finishApplicationProcessUseCase$invoke$1 = new FinishApplicationProcessUseCase$invoke$1(this, continuationImpl);
        }
        Object objFirstOrNull = finishApplicationProcessUseCase$invoke$1.write;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i9 = finishApplicationProcessUseCase$invoke$1.read;
        int i10 = 3;
        if (i9 == 0) {
            ExtrasKt.RemoteActionCompatParcelizer(objFirstOrNull);
            FirebaseRemoteConfigImpl firebaseRemoteConfigImpl = (FirebaseRemoteConfigImpl) this.write;
            firebaseRemoteConfigImpl.getClass();
            if (firebaseRemoteConfigImpl.IconCompatParcelizer(updateAdidI.IS_PUSH_NOTIFICATION_FOR_APPLICANT_ENABLED)) {
                this.IconCompatParcelizer.RemoteActionCompatParcelizer();
            }
            finishApplicationProcessUseCase$invoke$1.read = 1;
            if (this.RemoteActionCompatParcelizer.invoke(finishApplicationProcessUseCase$invoke$1) != coroutineSingletons) {
            }
            return coroutineSingletons;
        }
        if (i9 == 1) {
            ExtrasKt.RemoteActionCompatParcelizer(objFirstOrNull);
        } else {
            if (i9 == 2) {
                ExtrasKt.RemoteActionCompatParcelizer(objFirstOrNull);
                getcontenttype = (getContentType) objFirstOrNull;
                if (getcontenttype == null) {
                    return new isItemDismissable(new Throwable("No sign in data"));
                }
                str = getcontenttype.password;
                String str3 = getcontenttype.username;
                finishApplicationProcessUseCase$invoke$1.RemoteActionCompatParcelizer = str;
                finishApplicationProcessUseCase$invoke$1.read = 3;
                objFirstOrNull = ((SignInUseCaseImpl) this.serializer).IconCompatParcelizer(str3, str, finishApplicationProcessUseCase$invoke$1);
                if (objFirstOrNull != coroutineSingletons) {
                    i = MediaMetadataCompat + 11;
                    MediaSessionCompatQueueItem = i % Fields.SpotShadowColor;
                    if (i % 2 == 0) {
                        int i11 = 5 % 4;
                    }
                    str2 = str;
                }
                return coroutineSingletons;
            }
            int i12 = MediaSessionCompatQueueItem + 119;
            MediaMetadataCompat = i12 % Fields.SpotShadowColor;
            if (i12 % 2 == 0 ? i9 != 3 : i9 != 4) {
                ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            str2 = finishApplicationProcessUseCase$invoke$1.RemoteActionCompatParcelizer;
            ExtrasKt.RemoteActionCompatParcelizer(objFirstOrNull);
        }
        return new TransactionCallbacks(str2, (getIsTraversalGroup) objFirstOrNull);
        finishApplicationProcessUseCase$invoke$1.read = 2;
        SignInDataStore signInDataStore = this.read.read.RemoteActionCompatParcelizer;
        int i13 = 0;
        objFirstOrNull = FlowKt.firstOrNull(new SignInDataStore$get$$inlined$map$1(new FlowKt__ErrorsKt$catch$$inlined$unsafeFlow$1(((performCustomExitMxy_nc0) signInDataStore.serializer).serializer(), new SignInDataStore$get$1(i10, i13, shortNewsContentCardView)), signInDataStore, i13), finishApplicationProcessUseCase$invoke$1);
        if (objFirstOrNull != coroutineSingletons) {
            getcontenttype = (getContentType) objFirstOrNull;
            if (getcontenttype == null) {
                return new isItemDismissable(new Throwable("No sign in data"));
            }
            str = getcontenttype.password;
            String str4 = getcontenttype.username;
            finishApplicationProcessUseCase$invoke$1.RemoteActionCompatParcelizer = str;
            finishApplicationProcessUseCase$invoke$1.read = 3;
            objFirstOrNull = ((SignInUseCaseImpl) this.serializer).IconCompatParcelizer(str4, str, finishApplicationProcessUseCase$invoke$1);
            if (objFirstOrNull != coroutineSingletons) {
                i = MediaMetadataCompat + 11;
                MediaSessionCompatQueueItem = i % Fields.SpotShadowColor;
                if (i % 2 == 0) {
                    int i14 = 5 % 4;
                }
                str2 = str;
                return new TransactionCallbacks(str2, (getIsTraversalGroup) objFirstOrNull);
            }
        }
        return coroutineSingletons;
    }
}
