package com.braze.ui.inappmessage.utils;

import android.content.Context;
import bo.app.af$$ExternalSyntheticOutline0;
import coil3.ExtrasKt;
import com.braze.Braze;
import com.braze.coroutine.BrazeCoroutineScope;
import com.braze.enums.BrazeViewBounds;
import com.braze.enums.inappmessage.MessageType;
import com.braze.images.IBrazeImageLoader;
import com.braze.models.inappmessage.IInAppMessage;
import com.braze.models.inappmessage.IInAppMessageWithImage;
import com.braze.models.inappmessage.IInAppMessageZippedAssetHtml;
import com.braze.models.inappmessage.InAppMessageFull;
import com.braze.models.inappmessage.InAppMessageHtml;
import com.braze.support.BrazeLogger;
import com.braze.support.WebContentUtils;
import com.braze.support.i$$ExternalSyntheticLambda1;
import com.braze.ui.inappmessage.BrazeInAppMessageManager;
import com.braze.ui.support.ViewUtils$$ExternalSyntheticLambda6;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import java.io.File;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.internal.MainDispatcherLoader;
import kotlinx.coroutines.scheduling.DefaultScheduler;
import o.ShortNewsContentCardView;
import o.createFromParcel;
import o.getContentViewGroupParentLayout;
import o.hideCurrentlyDisplayingInAppMessage;
import o.prepareForActivityTransitionCarryover;
import o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0;
import o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0;
import o.r8lambdafvzP3Wky1RLLzE56uVXaMHcvU;

/* JADX INFO: loaded from: classes.dex */
public final class BackgroundInAppMessagePreparer {
    public static final BackgroundInAppMessagePreparer INSTANCE = new BackgroundInAppMessagePreparer();

    /* JADX INFO: renamed from: com.braze.ui.inappmessage.utils.BackgroundInAppMessagePreparer$displayPreparedInAppMessage$2, reason: invalid class name */
    public static final class AnonymousClass2 extends SuspendLambda implements r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 {
        final /* synthetic */ IInAppMessage $inAppMessage;
        int label;

        /* JADX INFO: Access modifiers changed from: private */
        public static final String invokeSuspend$lambda$0() {
            return "Displaying in-app message.";
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final ShortNewsContentCardView<createFromParcel> create(Object obj, ShortNewsContentCardView<?> shortNewsContentCardView) {
            return new AnonymousClass2(this.$inAppMessage, shortNewsContentCardView);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.label;
            int i2 = 1;
            if (i == 0) {
                ExtrasKt.RemoteActionCompatParcelizer(obj);
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) BackgroundInAppMessagePreparer.INSTANCE, (BrazeLogger.Priority) null, (Throwable) null, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new InAppMessageViewUtils$$ExternalSyntheticLambda0(i2), 7, (Object) null);
                BrazeInAppMessageManager companion = BrazeInAppMessageManager.Companion.getInstance();
                IInAppMessage iInAppMessage = this.$inAppMessage;
                this.label = 1;
                if (companion.displayInAppMessage(iInAppMessage, false, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i != 1) {
                    ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                ExtrasKt.RemoteActionCompatParcelizer(obj);
            }
            return createFromParcel.INSTANCE;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(IInAppMessage iInAppMessage, ShortNewsContentCardView<? super AnonymousClass2> shortNewsContentCardView) {
            super(2, shortNewsContentCardView);
            this.$inAppMessage = iInAppMessage;
        }

        @Override // o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0
        public final Object invoke(getContentViewGroupParentLayout getcontentviewgroupparentlayout, ShortNewsContentCardView<? super createFromParcel> shortNewsContentCardView) {
            return ((AnonymousClass2) create(getcontentviewgroupparentlayout, shortNewsContentCardView)).invokeSuspend(createFromParcel.INSTANCE);
        }
    }

    /* JADX INFO: renamed from: com.braze.ui.inappmessage.utils.BackgroundInAppMessagePreparer$prepareInAppMessageForDisplay$1, reason: invalid class name */
    public static final class AnonymousClass1 extends SuspendLambda implements r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 {
        final /* synthetic */ IInAppMessage $inAppMessageToPrepare;
        private /* synthetic */ Object L$0;
        Object L$1;
        int label;

        /* JADX INFO: Access modifiers changed from: private */
        public static final String invokeSuspend$lambda$0() {
            return "Cannot display the in-app message because the in-app message was null.";
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final String invokeSuspend$lambda$1() {
            return "Caught error while preparing in app message in background";
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final ShortNewsContentCardView<createFromParcel> create(Object obj, ShortNewsContentCardView<?> shortNewsContentCardView) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$inAppMessageToPrepare, shortNewsContentCardView);
            anonymousClass1.L$0 = obj;
            return anonymousClass1;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(IInAppMessage iInAppMessage, ShortNewsContentCardView<? super AnonymousClass1> shortNewsContentCardView) {
            super(2, shortNewsContentCardView);
            this.$inAppMessageToPrepare = iInAppMessage;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            getContentViewGroupParentLayout getcontentviewgroupparentlayout = (getContentViewGroupParentLayout) this.L$0;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.label;
            try {
                if (i == 0) {
                    ExtrasKt.RemoteActionCompatParcelizer(obj);
                    BackgroundInAppMessagePreparer backgroundInAppMessagePreparer = BackgroundInAppMessagePreparer.INSTANCE;
                    IInAppMessage iInAppMessagePrepareInAppMessage = backgroundInAppMessagePreparer.prepareInAppMessage(this.$inAppMessageToPrepare);
                    if (iInAppMessagePrepareInAppMessage == null) {
                        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) getcontentviewgroupparentlayout, BrazeLogger.Priority.W, (Throwable) null, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new InAppMessageViewUtils$$ExternalSyntheticLambda0(2), 6, (Object) null);
                    } else {
                        this.L$0 = getcontentviewgroupparentlayout;
                        this.L$1 = null;
                        this.label = 1;
                        if (backgroundInAppMessagePreparer.displayPreparedInAppMessage(iInAppMessagePrepareInAppMessage, this) == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                    }
                } else {
                    if (i != 1) {
                        ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    ExtrasKt.RemoteActionCompatParcelizer(obj);
                }
            } catch (Exception e) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) getcontentviewgroupparentlayout, BrazeLogger.Priority.E, (Throwable) e, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new InAppMessageViewUtils$$ExternalSyntheticLambda0(3), 4, (Object) null);
            }
            return createFromParcel.INSTANCE;
        }

        @Override // o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0
        public final Object invoke(getContentViewGroupParentLayout getcontentviewgroupparentlayout, ShortNewsContentCardView<? super createFromParcel> shortNewsContentCardView) {
            return ((AnonymousClass1) create(getcontentviewgroupparentlayout, shortNewsContentCardView)).invokeSuspend(createFromParcel.INSTANCE);
        }
    }

    private BackgroundInAppMessagePreparer() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object displayPreparedInAppMessage(IInAppMessage iInAppMessage, ShortNewsContentCardView<? super createFromParcel> shortNewsContentCardView) throws Throwable {
        DefaultScheduler defaultScheduler = prepareForActivityTransitionCarryover.RemoteActionCompatParcelizer;
        Object objWithContext = BuildersKt.withContext(MainDispatcherLoader.read, new AnonymousClass2(iInAppMessage, null), shortNewsContentCardView);
        return objWithContext == CoroutineSingletons.COROUTINE_SUSPENDED ? objWithContext : createFromParcel.INSTANCE;
    }

    private final boolean handleLocalImage(String str, IInAppMessageWithImage iInAppMessageWithImage, IBrazeImageLoader iBrazeImageLoader, Context context, IInAppMessage iInAppMessage, BrazeViewBounds brazeViewBounds) {
        BrazeLogger brazeLogger = BrazeLogger.INSTANCE;
        BrazeLogger.brazelog$default(brazeLogger, (Object) this, BrazeLogger.Priority.I, (Throwable) null, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new i$$ExternalSyntheticLambda1(str, 26), 6, (Object) null);
        iInAppMessageWithImage.setBitmap(iBrazeImageLoader.getInAppMessageBitmapFromUrl(context, iInAppMessage, str, brazeViewBounds));
        if (iInAppMessageWithImage.getBitmap() != null) {
            iInAppMessageWithImage.setImageDownloadSuccessful(true);
            return true;
        }
        BrazeLogger.brazelog$default(brazeLogger, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new i$$ExternalSyntheticLambda1(str, 27), 7, (Object) null);
        iInAppMessageWithImage.setLocalImageUrl(null);
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String handleLocalImage$lambda$0(String str) {
        return r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.serializer("Passing in-app message local image url to image loader: ", str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String handleLocalImage$lambda$1(String str) {
        return r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.serializer("Removing local image url from IAM since it could not be loaded. URL: ", str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String prepareInAppMessage$lambda$0() {
        return "Skipping in-app message preparation for control in-app message.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String prepareInAppMessage$lambda$1() {
        return "Starting asynchronous in-app message preparation for message.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String prepareInAppMessage$lambda$2() {
        return "Html in-app message zip asset download failed. Cannot display in-app message.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String prepareInAppMessage$lambda$3() {
        return "In-app message image download failed. Cannot display in-app message.";
    }

    public static final boolean prepareInAppMessageWithBitmapDownload(IInAppMessage iInAppMessage) {
        if (!(iInAppMessage instanceof IInAppMessageWithImage)) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) INSTANCE, (BrazeLogger.Priority) null, (Throwable) null, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new InAppMessageViewUtils$$ExternalSyntheticLambda0(16), 7, (Object) null);
            return false;
        }
        IInAppMessageWithImage iInAppMessageWithImage = (IInAppMessageWithImage) iInAppMessage;
        if (iInAppMessageWithImage.getBitmap() != null) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) INSTANCE, BrazeLogger.Priority.I, (Throwable) null, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new InAppMessageViewUtils$$ExternalSyntheticLambda0(5), 6, (Object) null);
            iInAppMessageWithImage.setImageDownloadSuccessful(true);
            return true;
        }
        BackgroundInAppMessagePreparer backgroundInAppMessagePreparer = INSTANCE;
        BrazeViewBounds viewBoundsByType = backgroundInAppMessagePreparer.getViewBoundsByType(iInAppMessage);
        Context applicationContext = BrazeInAppMessageManager.Companion.getInstance().getApplicationContext();
        if (applicationContext == null) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) backgroundInAppMessagePreparer, BrazeLogger.Priority.W, (Throwable) null, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new InAppMessageViewUtils$$ExternalSyntheticLambda0(6), 6, (Object) null);
            return false;
        }
        IBrazeImageLoader imageLoader = Braze.Companion.getInstance(applicationContext).getImageLoader();
        String localImageUrl = iInAppMessageWithImage.getLocalImageUrl();
        if (localImageUrl == null || hideCurrentlyDisplayingInAppMessage.serializer((CharSequence) localImageUrl) || !backgroundInAppMessagePreparer.handleLocalImage(localImageUrl, iInAppMessageWithImage, imageLoader, applicationContext, iInAppMessage, viewBoundsByType)) {
            String remoteImageUrl = iInAppMessageWithImage.getRemoteImageUrl();
            if (remoteImageUrl != null && !hideCurrentlyDisplayingInAppMessage.serializer((CharSequence) remoteImageUrl)) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) backgroundInAppMessagePreparer, BrazeLogger.Priority.I, (Throwable) null, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new i$$ExternalSyntheticLambda1(remoteImageUrl, 25), 6, (Object) null);
                iInAppMessageWithImage.setBitmap(imageLoader.getInAppMessageBitmapFromUrl(applicationContext, iInAppMessage, remoteImageUrl, viewBoundsByType));
                if (iInAppMessageWithImage.getBitmap() == null) {
                    return false;
                }
                iInAppMessageWithImage.setImageDownloadSuccessful(true);
                return true;
            }
            BrazeLogger brazeLogger = BrazeLogger.INSTANCE;
            BrazeLogger.Priority priority = BrazeLogger.Priority.W;
            BrazeLogger.brazelog$default(brazeLogger, (Object) backgroundInAppMessagePreparer, priority, (Throwable) null, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new InAppMessageViewUtils$$ExternalSyntheticLambda0(7), 6, (Object) null);
            if (iInAppMessageWithImage instanceof InAppMessageFull) {
                BrazeLogger.brazelog$default(brazeLogger, (Object) backgroundInAppMessagePreparer, priority, (Throwable) null, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new InAppMessageViewUtils$$ExternalSyntheticLambda0(8), 6, (Object) null);
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String prepareInAppMessageWithBitmapDownload$lambda$0() {
        return "Cannot prepare non IInAppMessageWithImage object with bitmap download.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String prepareInAppMessageWithBitmapDownload$lambda$1() {
        return "In-app message already contains image bitmap. Not downloading image from URL.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String prepareInAppMessageWithBitmapDownload$lambda$2() {
        return "BrazeInAppMessageManager applicationContext is null. Not downloading image.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String prepareInAppMessageWithBitmapDownload$lambda$3(String str) {
        return r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.serializer("In-app message has remote image url. Downloading image at url: ", str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String prepareInAppMessageWithBitmapDownload$lambda$4() {
        return "In-app message has no remote image url. Not downloading image.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String prepareInAppMessageWithBitmapDownload$lambda$5() {
        return "In-app message full has no remote image url yet is required to have an image. Failing message display.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String prepareInAppMessageWithHtml$lambda$0() {
        return "HTML in-app message does not have prefetched assets. Not performing any substitutions.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String prepareInAppMessageWithHtml$lambda$1() {
        return "HTML in-app message does not have message. Not performing any substitutions.";
    }

    public static final boolean prepareInAppMessageWithZippedAssetHtml(IInAppMessageZippedAssetHtml iInAppMessageZippedAssetHtml) {
        iInAppMessageZippedAssetHtml.getClass();
        String localAssetsDirectoryUrl = iInAppMessageZippedAssetHtml.getLocalAssetsDirectoryUrl();
        if (localAssetsDirectoryUrl != null && !hideCurrentlyDisplayingInAppMessage.serializer((CharSequence) localAssetsDirectoryUrl) && new File(localAssetsDirectoryUrl).exists()) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) INSTANCE, BrazeLogger.Priority.I, (Throwable) null, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new i$$ExternalSyntheticLambda1(localAssetsDirectoryUrl, 28), 6, (Object) null);
            return true;
        }
        String assetsZipRemoteUrl = iInAppMessageZippedAssetHtml.getAssetsZipRemoteUrl();
        if (assetsZipRemoteUrl == null || hideCurrentlyDisplayingInAppMessage.serializer((CharSequence) assetsZipRemoteUrl)) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) INSTANCE, BrazeLogger.Priority.I, (Throwable) null, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new InAppMessageViewUtils$$ExternalSyntheticLambda0(14), 6, (Object) null);
            return true;
        }
        Context applicationContext = BrazeInAppMessageManager.Companion.getInstance().getApplicationContext();
        if (applicationContext == null) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) INSTANCE, BrazeLogger.Priority.W, (Throwable) null, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new InAppMessageViewUtils$$ExternalSyntheticLambda0(15), 6, (Object) null);
            return false;
        }
        String localHtmlUrlFromRemoteUrl = WebContentUtils.getLocalHtmlUrlFromRemoteUrl(WebContentUtils.getHtmlInAppMessageAssetCacheDirectory(applicationContext), assetsZipRemoteUrl);
        if (localHtmlUrlFromRemoteUrl == null || hideCurrentlyDisplayingInAppMessage.serializer((CharSequence) localHtmlUrlFromRemoteUrl)) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) INSTANCE, BrazeLogger.Priority.W, (Throwable) null, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new ViewUtils$$ExternalSyntheticLambda6(iInAppMessageZippedAssetHtml, 2, localHtmlUrlFromRemoteUrl), 6, (Object) null);
            return false;
        }
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) INSTANCE, (BrazeLogger.Priority) null, (Throwable) null, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new i$$ExternalSyntheticLambda1(localHtmlUrlFromRemoteUrl, 29), 7, (Object) null);
        iInAppMessageZippedAssetHtml.setLocalAssetsDirectoryUrl(localHtmlUrlFromRemoteUrl);
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String prepareInAppMessageWithZippedAssetHtml$lambda$0(String str) {
        return r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.serializer("Local assets for html in-app message are already populated. Not downloading assets. Location = ", str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String prepareInAppMessageWithZippedAssetHtml$lambda$1() {
        return "Html in-app message has no remote asset zip. Continuing with in-app message preparation.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String prepareInAppMessageWithZippedAssetHtml$lambda$2() {
        return "BrazeInAppMessageManager applicationContext is null. Not downloading image.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String prepareInAppMessageWithZippedAssetHtml$lambda$3(String str) {
        return r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.serializer("Local url for html in-app message assets is ", str);
    }

    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[MessageType.values().length];
            try {
                iArr[MessageType.HTML_FULL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[MessageType.HTML.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[MessageType.SLIDEUP.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[MessageType.MODAL.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static final void prepareInAppMessageForDisplay(IInAppMessage iInAppMessage) {
        iInAppMessage.getClass();
        BuildersKt.RemoteActionCompatParcelizer(BrazeCoroutineScope.INSTANCE, null, null, new AnonymousClass1(iInAppMessage, null), 3);
    }

    public final void prepareInAppMessageWithHtml(InAppMessageHtml inAppMessageHtml) {
        inAppMessageHtml.getClass();
        if (inAppMessageHtml.getLocalPrefetchedAssetPaths().isEmpty()) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new InAppMessageViewUtils$$ExternalSyntheticLambda0(9), 7, (Object) null);
            return;
        }
        String message = inAppMessageHtml.getMessage();
        if (message == null) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new InAppMessageViewUtils$$ExternalSyntheticLambda0(10), 7, (Object) null);
        } else {
            inAppMessageHtml.setMessage(WebContentUtils.replacePrefetchedUrlsWithLocalAssets(message, inAppMessageHtml.getLocalPrefetchedAssetPaths()));
        }
    }

    private final BrazeViewBounds getViewBoundsByType(IInAppMessage iInAppMessage) {
        int i = WhenMappings.$EnumSwitchMapping$0[iInAppMessage.getMessageType().ordinal()];
        if (i != 3) {
            return i != 4 ? BrazeViewBounds.NO_BOUNDS : BrazeViewBounds.IN_APP_MESSAGE_MODAL;
        }
        return BrazeViewBounds.IN_APP_MESSAGE_SLIDEUP;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final IInAppMessage prepareInAppMessage(IInAppMessage iInAppMessage) {
        if (iInAppMessage.isControl()) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new InAppMessageViewUtils$$ExternalSyntheticLambda0(4), 7, (Object) null);
            return iInAppMessage;
        }
        BrazeLogger brazeLogger = BrazeLogger.INSTANCE;
        BrazeLogger.brazelog$default(brazeLogger, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new InAppMessageViewUtils$$ExternalSyntheticLambda0(11), 7, (Object) null);
        int i = WhenMappings.$EnumSwitchMapping$0[iInAppMessage.getMessageType().ordinal()];
        if (i != 1) {
            if (i == 2) {
                prepareInAppMessageWithHtml((InAppMessageHtml) iInAppMessage);
                return iInAppMessage;
            }
            if (!prepareInAppMessageWithBitmapDownload(iInAppMessage)) {
                BrazeLogger.brazelog$default(brazeLogger, (Object) this, BrazeLogger.Priority.W, (Throwable) null, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new InAppMessageViewUtils$$ExternalSyntheticLambda0(13), 6, (Object) null);
                return null;
            }
        } else if (!prepareInAppMessageWithZippedAssetHtml((IInAppMessageZippedAssetHtml) iInAppMessage)) {
            BrazeLogger.brazelog$default(brazeLogger, (Object) this, BrazeLogger.Priority.W, (Throwable) null, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new InAppMessageViewUtils$$ExternalSyntheticLambda0(12), 6, (Object) null);
            return null;
        }
        return iInAppMessage;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String prepareInAppMessageWithZippedAssetHtml$lambda$4(IInAppMessageZippedAssetHtml iInAppMessageZippedAssetHtml, String str) {
        return af$$ExternalSyntheticOutline0.m("Download of html content to local directory failed for remote url: ", iInAppMessageZippedAssetHtml.getAssetsZipRemoteUrl(), " . Returned local url is: ", str);
    }
}
