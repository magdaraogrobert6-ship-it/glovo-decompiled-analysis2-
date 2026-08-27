package com.roadrunner.delivery.pickupdropoff.tasks.domain;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.Uri;
import androidx.compose.ui.graphics.Fields;
import androidx.datastore.rxjava2.RxDataStore;
import androidx.lifecycle.BlockRunner$maybeRun$1;
import androidx.sqlite.SQLite;
import coil3.ExtrasKt;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import com.huawei.wisesecurity.ucs_credential.n0;
import com.mapbox.navigation.core.arrival.ArrivalProgressObserver$$ExternalSyntheticLambda0;
import com.roadrunner.delivery.pickupdropoff.tasks.api.data.ConfirmationRepository;
import io.sentry.util.UrlUtils;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.DeferredCoroutine;
import kotlinx.coroutines.internal.ContextScope;
import kotlinx.coroutines.rx2.RxConvertKt$asSingle$1;
import kotlinx.coroutines.scheduling.DefaultScheduler;
import o.DrawableTransformation;
import o.InAppMessageHtmlBaseView;
import o.PreviewLoggerCompanion;
import o.RoundRectgG7oq9Y;
import o.ShortNewsContentCardView;
import o.SweepGradientShader9KIMszodefault;
import o.TextAnnouncementContentCardView;
import o.createFromParcel;
import o.getInAppMessageEventMap;
import o.getLoaderKey;
import o.inCompatibilityMode;
import o.isItemDismissable;
import o.isOpenInternalroom_runtime;
import o.logErrorui_tooling;
import o.logWarningui_tooling;
import o.onAnimationEndlambda1;
import o.onItemDismiss;
import o.prepareForActivityTransitionCarryover;
import o.r8lambda7AJnrvTmYNN7kSbgXUEYtB0Niyw;
import o.r8lambdatGneqyXrP1uOJD5LacwlDLETgw8;
import o.r8lambdaz90zXC5cr3Ctjy9kweMhZodg3LE;
import o.setComposableContentlambda1;
import o.setDefaultNotificationChannelNameandroid_sdk_base_release;
import o.setParameterizedContentlambda01;
import o.setStateParametersdefault;
import o.sourceInformationContextOfdefault;
import okhttp3.RequestBody;

/* JADX INFO: loaded from: classes3.dex */
public final class UploadPictureUseCaseImpl {
    private static int MediaMetadataCompat = 1;
    private static int RatingCompat;
    public final logWarningui_tooling IconCompatParcelizer;
    public final setDefaultNotificationChannelNameandroid_sdk_base_release MediaBrowserCompatMediaItem;
    public final RetryCountTrackerImpl MediaSessionCompatQueueItem;
    public final ConfirmationRepository RemoteActionCompatParcelizer;
    public final n0 read;
    public final isOpenInternalroom_runtime serializer;
    public final setStateParametersdefault write;

    public UploadPictureUseCaseImpl(logWarningui_tooling logwarningui_tooling, setStateParametersdefault setstateparametersdefault, ConfirmationRepository confirmationRepository, setDefaultNotificationChannelNameandroid_sdk_base_release setdefaultnotificationchannelnameandroid_sdk_base_release, n0 n0Var, RetryCountTrackerImpl retryCountTrackerImpl, isOpenInternalroom_runtime isopeninternalroom_runtime) {
        logwarningui_tooling.getClass();
        setstateparametersdefault.getClass();
        confirmationRepository.getClass();
        setdefaultnotificationchannelnameandroid_sdk_base_release.getClass();
        n0Var.getClass();
        retryCountTrackerImpl.getClass();
        isopeninternalroom_runtime.getClass();
        this.IconCompatParcelizer = logwarningui_tooling;
        this.write = setstateparametersdefault;
        this.RemoteActionCompatParcelizer = confirmationRepository;
        this.MediaBrowserCompatMediaItem = setdefaultnotificationchannelnameandroid_sdk_base_release;
        this.read = n0Var;
        this.MediaSessionCompatQueueItem = retryCountTrackerImpl;
        this.serializer = isopeninternalroom_runtime;
    }

    public final byte[] IconCompatParcelizer(InputStream inputStream, float f, int i) throws Throwable {
        Bitmap bitmapDecodeStream;
        int i2 = 2 % 2;
        this.read.getClass();
        try {
            bitmapDecodeStream = BitmapFactory.decodeStream(inputStream);
            try {
                bitmapDecodeStream.getClass();
                Bitmap bitmapRemoteActionCompatParcelizer = n0.RemoteActionCompatParcelizer(bitmapDecodeStream, i);
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                try {
                    bitmapRemoteActionCompatParcelizer.compress(Bitmap.CompressFormat.JPEG, (int) (f * 100.0f), byteArrayOutputStream);
                    byte[] byteArray = byteArrayOutputStream.toByteArray();
                    byteArrayOutputStream.close();
                    byteArray.getClass();
                    bitmapDecodeStream.recycle();
                    int i3 = MediaMetadataCompat + 37;
                    RatingCompat = i3 % Fields.SpotShadowColor;
                    if (i3 % 2 != 0) {
                        int i4 = 53 / 0;
                    }
                    return byteArray;
                } catch (Throwable th) {
                    try {
                        throw th;
                    } catch (Throwable th2) {
                        int i5 = sourceInformationContextOfdefault.read();
                        int i6 = sourceInformationContextOfdefault.read();
                        int i7 = sourceInformationContextOfdefault.read();
                        r8lambda7AJnrvTmYNN7kSbgXUEYtB0Niyw.IconCompatParcelizer(871780641, i5, i6, -871780639, sourceInformationContextOfdefault.read(), new Object[]{byteArrayOutputStream, th}, i7);
                        throw th2;
                    }
                }
            } catch (Throwable th3) {
                th = th3;
                if (bitmapDecodeStream != null) {
                    int i8 = MediaMetadataCompat + 61;
                    RatingCompat = i8 % Fields.SpotShadowColor;
                    int i9 = i8 % 2;
                    bitmapDecodeStream.recycle();
                }
                throw th;
            }
        } catch (Throwable th4) {
            th = th4;
            bitmapDecodeStream = null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:11:0x002a  */
    /* JADX INFO: renamed from: invoke-gIAlu-s, reason: not valid java name */
    public final Object m4941invokegIAlus(logErrorui_tooling logerrorui_tooling, ContinuationImpl continuationImpl) throws Throwable {
        UploadPictureUseCaseImpl$invoke$1 uploadPictureUseCaseImpl$invoke$1;
        int i = 2 % 2;
        Object obj = null;
        if (continuationImpl instanceof UploadPictureUseCaseImpl$invoke$1) {
            int i2 = MediaMetadataCompat + 53;
            RatingCompat = i2 % Fields.SpotShadowColor;
            if (i2 % 2 != 0) {
                int i3 = ((UploadPictureUseCaseImpl$invoke$1) continuationImpl).RemoteActionCompatParcelizer;
                obj.hashCode();
                throw null;
            }
            uploadPictureUseCaseImpl$invoke$1 = (UploadPictureUseCaseImpl$invoke$1) continuationImpl;
            int i4 = uploadPictureUseCaseImpl$invoke$1.RemoteActionCompatParcelizer;
            if ((i4 & Integer.MIN_VALUE) != 0) {
                uploadPictureUseCaseImpl$invoke$1.RemoteActionCompatParcelizer = i4 - Integer.MIN_VALUE;
            } else {
                uploadPictureUseCaseImpl$invoke$1 = new UploadPictureUseCaseImpl$invoke$1(this, continuationImpl);
            }
        } else {
            uploadPictureUseCaseImpl$invoke$1 = new UploadPictureUseCaseImpl$invoke$1(this, continuationImpl);
        }
        Object objWithContext = uploadPictureUseCaseImpl$invoke$1.serializer;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i5 = uploadPictureUseCaseImpl$invoke$1.RemoteActionCompatParcelizer;
        if (i5 != 0) {
            int i6 = RatingCompat + 121;
            MediaMetadataCompat = i6 % Fields.SpotShadowColor;
            int i7 = i6 % 2;
            if (i5 != 1) {
                ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                int i8 = RatingCompat + 63;
                MediaMetadataCompat = i8 % Fields.SpotShadowColor;
                if (i8 % 2 == 0) {
                    int i9 = 38 / 0;
                }
                return null;
            }
            ExtrasKt.RemoteActionCompatParcelizer(objWithContext);
        } else {
            ExtrasKt.RemoteActionCompatParcelizer(objWithContext);
            ((inCompatibilityMode) this.serializer).getClass();
            DefaultScheduler defaultScheduler = prepareForActivityTransitionCarryover.RemoteActionCompatParcelizer;
            UploadPictureUseCaseImpl$invoke$2 uploadPictureUseCaseImpl$invoke$2 = new UploadPictureUseCaseImpl$invoke$2(logerrorui_tooling, this, null);
            uploadPictureUseCaseImpl$invoke$1.RemoteActionCompatParcelizer = 1;
            objWithContext = BuildersKt.withContext(defaultScheduler, uploadPictureUseCaseImpl$invoke$2, uploadPictureUseCaseImpl$invoke$1);
            if (objWithContext == coroutineSingletons) {
                int i10 = RatingCompat + 15;
                MediaMetadataCompat = i10 % Fields.SpotShadowColor;
                if (i10 % 2 == 0) {
                    int i11 = 28 / 0;
                }
                return coroutineSingletons;
            }
        }
        return ((onItemDismiss) objWithContext).IconCompatParcelizer;
    }

    public static final Object access$uploadImage(UploadPictureUseCaseImpl uploadPictureUseCaseImpl, String str, Uri uri, String str2, String str3, String str4, ArrayList arrayList, UploadPictureUseCaseImpl$invoke$2 uploadPictureUseCaseImpl$invoke$2) throws IOException, getLoaderKey {
        int i = 2 % 2;
        int i2 = RatingCompat + 109;
        MediaMetadataCompat = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        logWarningui_tooling logwarningui_tooling = uploadPictureUseCaseImpl.IconCompatParcelizer;
        logwarningui_tooling.getClass();
        uri.getClass();
        InputStream inputStreamOpenInputStream = logwarningui_tooling.IconCompatParcelizer.getContentResolver().openInputStream(uri);
        InAppMessageHtmlBaseView inAppMessageHtmlBaseViewWrite = null;
        if (inputStreamOpenInputStream == null) {
            ScreenStartObserver$$ExternalSyntheticLambda0.write(SweepGradientShader9KIMszodefault.IconCompatParcelizer(uri, "Failed to open input stream for uri: "));
            return null;
        }
        try {
            int iWrite = uploadPictureUseCaseImpl.MediaSessionCompatQueueItem.write(str4);
            int size = arrayList.size() - 1;
            if (iWrite > size) {
                iWrite = size;
            }
            PreviewLoggerCompanion previewLoggerCompanion = (PreviewLoggerCompanion) arrayList.get(iWrite);
            byte[] bArrIconCompatParcelizer = uploadPictureUseCaseImpl.IconCompatParcelizer(inputStreamOpenInputStream, previewLoggerCompanion.serializer, previewLoggerCompanion.read);
            inputStreamOpenInputStream.close();
            setDefaultNotificationChannelNameandroid_sdk_base_release setdefaultnotificationchannelnameandroid_sdk_base_release = uploadPictureUseCaseImpl.MediaBrowserCompatMediaItem;
            String strConcat = str.concat(".jpg");
            setdefaultnotificationchannelnameandroid_sdk_base_release.getClass();
            r8lambdaz90zXC5cr3Ctjy9kweMhZodg3LE r8lambdaz90zxc5cr3ctjy9kwemhzodg3le = RequestBody.Companion;
            getInAppMessageEventMap getinappmessageeventmap = InAppMessageHtmlBaseView.TYPE_SUBTYPE;
            try {
                inAppMessageHtmlBaseViewWrite = SQLite.write("image/*");
            } catch (IllegalArgumentException unused) {
            }
            Object objUploadPicture = uploadPictureUseCaseImpl.RemoteActionCompatParcelizer.uploadPicture(str2, RoundRectgG7oq9Y.RemoteActionCompatParcelizer("file", strConcat, r8lambdaz90zXC5cr3Ctjy9kweMhZodg3LE.RemoteActionCompatParcelizer(r8lambdaz90zxc5cr3ctjy9kwemhzodg3le, bArrIconCompatParcelizer, inAppMessageHtmlBaseViewWrite, 0, 6)), str3, uploadPictureUseCaseImpl$invoke$2);
            if (objUploadPicture != CoroutineSingletons.COROUTINE_SUSPENDED) {
                objUploadPicture = createFromParcel.INSTANCE;
            }
            int i4 = RatingCompat + 41;
            MediaMetadataCompat = i4 % Fields.SpotShadowColor;
            int i5 = i4 % 2;
            return objUploadPicture;
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                r8lambda7AJnrvTmYNN7kSbgXUEYtB0Niyw.IconCompatParcelizer(871780641, sourceInformationContextOfdefault.read(), sourceInformationContextOfdefault.read(), -871780639, sourceInformationContextOfdefault.read(), new Object[]{inputStreamOpenInputStream, th}, sourceInformationContextOfdefault.read());
                throw th2;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:22:0x0091  */
    public static final isItemDismissable serializer(UploadPictureUseCaseImpl uploadPictureUseCaseImpl, Throwable th, r8lambdatGneqyXrP1uOJD5LacwlDLETgw8 r8lambdatgneqyxrp1uojd5lacwldletgw8, logErrorui_tooling logerrorui_tooling) {
        int i = 2 % 2;
        int i2 = MediaMetadataCompat + 55;
        RatingCompat = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        RetryCountTrackerImpl retryCountTrackerImpl = uploadPictureUseCaseImpl.MediaSessionCompatQueueItem;
        if (th instanceof getLoaderKey) {
            String str = logerrorui_tooling.read(r8lambdatgneqyxrp1uojd5lacwldletgw8);
            retryCountTrackerImpl.getClass();
            RxDataStore rxDataStore = retryCountTrackerImpl.read;
            ContextScope contextScope = rxDataStore.read;
            ShortNewsContentCardView shortNewsContentCardView = null;
            DeferredCoroutine deferredCoroutineIconCompatParcelizer = BuildersKt.IconCompatParcelizer(contextScope, UrlUtils.serializer(), null, new BlockRunner$maybeRun$1(rxDataStore, new ArrivalProgressObserver$$ExternalSyntheticLambda0(retryCountTrackerImpl, 18, str), shortNewsContentCardView, 24), 2);
            TextAnnouncementContentCardView textAnnouncementContentCardView = contextScope.serializer;
            onAnimationEndlambda1 onanimationendlambda1 = onAnimationEndlambda1.RemoteActionCompatParcelizer;
            TextAnnouncementContentCardView textAnnouncementContentCardViewMinusKey = textAnnouncementContentCardView.minusKey(onanimationendlambda1);
            boolean z = false;
            z = false;
            z = false;
            new RxConvertKt$asSingle$1(deferredCoroutineIconCompatParcelizer, shortNewsContentCardView, z ? 1 : 0);
            if (textAnnouncementContentCardViewMinusKey.get(onanimationendlambda1) != null) {
                DrawableTransformation.serializer(textAnnouncementContentCardViewMinusKey, "Single context cannot contain job in it.Its lifecycle should be managed via Disposable handle. Had ");
                return null;
            }
            int iWrite = retryCountTrackerImpl.write(logerrorui_tooling.read(r8lambdatgneqyxrp1uojd5lacwldletgw8));
            if (r8lambdatgneqyxrp1uojd5lacwldletgw8 instanceof setComposableContentlambda1) {
                int i4 = MediaMetadataCompat + 103;
                RatingCompat = i4 % Fields.SpotShadowColor;
                if (i4 % 2 != 0) {
                    int i5 = 89 / 0;
                    if (iWrite >= ((setComposableContentlambda1) r8lambdatgneqyxrp1uojd5lacwldletgw8).serializer.size()) {
                        z = true;
                    }
                } else if (iWrite >= ((setComposableContentlambda1) r8lambdatgneqyxrp1uojd5lacwldletgw8).serializer.size()) {
                    z = true;
                }
            } else {
                if (!(r8lambdatgneqyxrp1uojd5lacwldletgw8 instanceof setParameterizedContentlambda01)) {
                    ScreenStartObserver$$ExternalSyntheticLambda0.write("Executable task is not a picture task");
                    return null;
                }
                int i6 = MediaMetadataCompat + 117;
                RatingCompat = i6 % Fields.SpotShadowColor;
                if (i6 % 2 != 0) {
                    ((setParameterizedContentlambda01) r8lambdatgneqyxrp1uojd5lacwldletgw8).IconCompatParcelizer.size();
                    shortNewsContentCardView.hashCode();
                    throw null;
                }
                if (iWrite >= ((setParameterizedContentlambda01) r8lambdatgneqyxrp1uojd5lacwldletgw8).IconCompatParcelizer.size()) {
                    z = true;
                }
            }
            getLoaderKey getloaderkey = (getLoaderKey) th;
            String str2 = getloaderkey.read;
            boolean z2 = getloaderkey.RemoteActionCompatParcelizer;
            boolean z3 = getloaderkey.serializer;
            int i7 = getLoaderKey.write;
            str2.getClass();
            th = new getLoaderKey(str2, z2, z3, z);
        }
        return new isItemDismissable(th);
    }
}
