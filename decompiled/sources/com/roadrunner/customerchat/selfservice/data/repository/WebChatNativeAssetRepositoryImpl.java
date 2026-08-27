package com.roadrunner.customerchat.selfservice.data.repository;

import androidx.compose.ui.graphics.Fields;
import coil3.ExtrasKt;
import coil3.ImageLoader$Builder$$ExternalSyntheticLambda1;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import com.roadrunner.auth.data.AuthRepository$logoutUser$2;
import com.roadrunner.customerchat.selfservice.data.cache.WebChatNativeCacheDataStore;
import com.roadrunner.customerchat.selfservice.data.remote.service.ExecuteHelpCenterApiRequest;
import com.roadrunner.rider.safety.log.data.SubmitSafetyLogEventWorker$doWork$result$1;
import com.roadrunner.twofa.presentation.TwoFaViewModel$onPinChanged$1;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.sync.MutexImpl;
import o.AnnotatedStringExhaustiveAnnotation;
import o.AnnotatedStringdefault;
import o.ComposeUiTextFlags;
import o.DeprecatedBridgeFontResourceLoaderCompanion;
import o.EmojiSupportMatch;
import o.ShortNewsContentCardView;
import o.accessgetInstancedelegatecp;
import o.addStringAnnotation;
import o.buildAnnotatedString;
import o.capitalize;
import o.createFromParcel;
import o.decapitalizedefault;
import o.findFollowingBreak;
import o.from;
import o.getBullet;
import o.getCieXyz;
import o.getDefaultPaddingXSAIIZE;
import o.getDoesClickOutsideModalViewDismissInAppMessageView;
import o.getLocalParagraphStyles;
import o.handleUlStart;
import o.isAdapterPositionOnScreen;
import o.isItemDismissable;
import o.onItemDismiss;
import o.removeNodeAtDepth;
import o.setCustomInAppMessageAnimationFactorylambda0;
import o.setDocumentLocator;
import o.startDocument;
import o.toLowerCase;
import okio.Path$Companion;

/* JADX INFO: loaded from: classes3.dex */
public final class WebChatNativeAssetRepositoryImpl implements startDocument {
    private static int PlaybackStateCompat = 1;
    private static int RatingCompat;
    public final isAdapterPositionOnScreen IconCompatParcelizer;
    public final MutexImpl MediaBrowserCompatMediaItem;
    public final WebChatNativeCacheDataStore MediaDescriptionCompat;
    public final Path$Companion MediaMetadataCompat;
    public final addStringAnnotation MediaSessionCompatQueueItem;
    public final ExecuteHelpCenterApiRequest RemoteActionCompatParcelizer;
    public volatile String read;
    public final handleUlStart serializer;
    public final AnnotatedStringExhaustiveAnnotation write;

    public WebChatNativeAssetRepositoryImpl(handleUlStart handleulstart, WebChatNativeCacheDataStore webChatNativeCacheDataStore, ExecuteHelpCenterApiRequest executeHelpCenterApiRequest, AnnotatedStringExhaustiveAnnotation annotatedStringExhaustiveAnnotation, addStringAnnotation addstringannotation, Path$Companion path$Companion) {
        handleulstart.getClass();
        webChatNativeCacheDataStore.getClass();
        executeHelpCenterApiRequest.getClass();
        annotatedStringExhaustiveAnnotation.getClass();
        addstringannotation.getClass();
        path$Companion.getClass();
        this.serializer = handleulstart;
        this.MediaDescriptionCompat = webChatNativeCacheDataStore;
        this.RemoteActionCompatParcelizer = executeHelpCenterApiRequest;
        this.write = annotatedStringExhaustiveAnnotation;
        this.MediaSessionCompatQueueItem = addstringannotation;
        this.MediaMetadataCompat = path$Companion;
        this.MediaBrowserCompatMediaItem = getDoesClickOutsideModalViewDismissInAppMessageView.IconCompatParcelizer();
        this.IconCompatParcelizer = new isAdapterPositionOnScreen(new ImageLoader$Builder$$ExternalSyntheticLambda1(12, this));
    }

    /* JADX WARN: Code duplicated, block: B:7:0x001f  */
    public final Object downloadAsset(String str, ContinuationImpl continuationImpl) {
        setDocumentLocator setdocumentlocator;
        Object objM4882invokegIAlus;
        int i = 2 % 2;
        if (continuationImpl instanceof setDocumentLocator) {
            setdocumentlocator = (setDocumentLocator) continuationImpl;
            int i2 = setdocumentlocator.IconCompatParcelizer;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                setdocumentlocator.IconCompatParcelizer = i2 - Integer.MIN_VALUE;
                int i3 = PlaybackStateCompat + 39;
                RatingCompat = i3 % Fields.SpotShadowColor;
                int i4 = i3 % 2;
            } else {
                setdocumentlocator = new setDocumentLocator(this, continuationImpl);
            }
        } else {
            setdocumentlocator = new setDocumentLocator(this, continuationImpl);
        }
        Object obj = setdocumentlocator.serializer;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i5 = setdocumentlocator.IconCompatParcelizer;
        ShortNewsContentCardView shortNewsContentCardView = null;
        if (i5 == 0) {
            ExtrasKt.RemoteActionCompatParcelizer(obj);
            AuthRepository$logoutUser$2 authRepository$logoutUser$2 = new AuthRepository$logoutUser$2(this, str, shortNewsContentCardView, 9);
            setdocumentlocator.IconCompatParcelizer = 1;
            objM4882invokegIAlus = this.RemoteActionCompatParcelizer.m4882invokegIAlus(authRepository$logoutUser$2, setdocumentlocator);
            if (objM4882invokegIAlus == coroutineSingletons) {
                int i6 = RatingCompat + 103;
                PlaybackStateCompat = i6 % Fields.SpotShadowColor;
                int i7 = i6 % 2;
                return coroutineSingletons;
            }
        } else {
            if (i5 != 1) {
                ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            int i8 = PlaybackStateCompat + 115;
            RatingCompat = i8 % Fields.SpotShadowColor;
            if (i8 % 2 != 0) {
                ExtrasKt.RemoteActionCompatParcelizer(obj);
                Object obj2 = ((onItemDismiss) obj).IconCompatParcelizer;
                shortNewsContentCardView.hashCode();
                throw null;
            }
            ExtrasKt.RemoteActionCompatParcelizer(obj);
            objM4882invokegIAlus = ((onItemDismiss) obj).IconCompatParcelizer;
        }
        ExtrasKt.RemoteActionCompatParcelizer(objM4882invokegIAlus);
        return objM4882invokegIAlus;
    }

    /* JADX WARN: Code duplicated, block: B:8:0x001d  */
    /* JADX INFO: renamed from: fetchReleasesFromApi-eH_QyT8, reason: not valid java name */
    public final Object m4885fetchReleasesFromApieH_QyT8(String str, String str2, String str3, String str4, String str5, String str6, String str7, ContinuationImpl continuationImpl) {
        WebChatNativeAssetRepositoryImpl$fetchReleasesFromApi$1 webChatNativeAssetRepositoryImpl$fetchReleasesFromApi$1;
        String str8;
        Object objM4882invokegIAlus;
        Object obj;
        int i = 2 % 2;
        if (!(continuationImpl instanceof WebChatNativeAssetRepositoryImpl$fetchReleasesFromApi$1)) {
            webChatNativeAssetRepositoryImpl$fetchReleasesFromApi$1 = new WebChatNativeAssetRepositoryImpl$fetchReleasesFromApi$1(this, continuationImpl);
        } else {
            webChatNativeAssetRepositoryImpl$fetchReleasesFromApi$1 = (WebChatNativeAssetRepositoryImpl$fetchReleasesFromApi$1) continuationImpl;
            int i2 = webChatNativeAssetRepositoryImpl$fetchReleasesFromApi$1.write;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                webChatNativeAssetRepositoryImpl$fetchReleasesFromApi$1.write = i2 - Integer.MIN_VALUE;
            } else {
                webChatNativeAssetRepositoryImpl$fetchReleasesFromApi$1 = new WebChatNativeAssetRepositoryImpl$fetchReleasesFromApi$1(this, continuationImpl);
            }
        }
        WebChatNativeAssetRepositoryImpl$fetchReleasesFromApi$1 webChatNativeAssetRepositoryImpl$fetchReleasesFromApi$2 = webChatNativeAssetRepositoryImpl$fetchReleasesFromApi$1;
        int i3 = PlaybackStateCompat + 47;
        RatingCompat = i3 % Fields.SpotShadowColor;
        int i4 = i3 % 2;
        Object obj2 = webChatNativeAssetRepositoryImpl$fetchReleasesFromApi$2.read;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i5 = webChatNativeAssetRepositoryImpl$fetchReleasesFromApi$2.write;
        if (i5 != 0) {
            int i6 = PlaybackStateCompat + 75;
            RatingCompat = i6 % Fields.SpotShadowColor;
            if (i6 % 2 == 0 ? i5 != 1 : i5 != 1) {
                ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            String str9 = webChatNativeAssetRepositoryImpl$fetchReleasesFromApi$2.serializer;
            ExtrasKt.RemoteActionCompatParcelizer(obj2);
            Object obj3 = ((onItemDismiss) obj2).IconCompatParcelizer;
            str8 = str9;
            objM4882invokegIAlus = obj3;
        } else {
            ExtrasKt.RemoteActionCompatParcelizer(obj2);
            WebChatNativeAssetRepositoryImpl$fetchReleasesFromApi$2 webChatNativeAssetRepositoryImpl$fetchReleasesFromApi$3 = new WebChatNativeAssetRepositoryImpl$fetchReleasesFromApi$2(this, str, str2, str3, str4, str5, str6, str7, null);
            str8 = str2;
            webChatNativeAssetRepositoryImpl$fetchReleasesFromApi$2.serializer = str8;
            webChatNativeAssetRepositoryImpl$fetchReleasesFromApi$2.write = 1;
            objM4882invokegIAlus = this.RemoteActionCompatParcelizer.m4882invokegIAlus(webChatNativeAssetRepositoryImpl$fetchReleasesFromApi$3, webChatNativeAssetRepositoryImpl$fetchReleasesFromApi$2);
            if (objM4882invokegIAlus == coroutineSingletons) {
                return coroutineSingletons;
            }
        }
        if (!(objM4882invokegIAlus instanceof isItemDismissable)) {
            try {
                this.MediaMetadataCompat.getClass();
                objM4882invokegIAlus = Path$Companion.serializer((toLowerCase) objM4882invokegIAlus);
            } catch (Throwable th) {
                objM4882invokegIAlus = new isItemDismissable(th);
            }
        }
        if (objM4882invokegIAlus instanceof isItemDismissable) {
            int i7 = PlaybackStateCompat + 37;
            RatingCompat = i7 % Fields.SpotShadowColor;
            int i8 = i7 % 2;
            obj = null;
        } else {
            obj = objM4882invokegIAlus;
        }
        findFollowingBreak findfollowingbreak = (findFollowingBreak) obj;
        if (findfollowingbreak != null) {
            int i9 = RatingCompat + 107;
            PlaybackStateCompat = i9 % Fields.SpotShadowColor;
            if (i9 % 2 == 0) {
                addStringAnnotation addstringannotation = this.MediaSessionCompatQueueItem;
                addstringannotation.getClass();
                str8.getClass();
                addstringannotation.write.put(str8, findfollowingbreak);
                int i10 = 64 / 0;
            } else {
                addStringAnnotation addstringannotation2 = this.MediaSessionCompatQueueItem;
                addstringannotation2.getClass();
                str8.getClass();
                addstringannotation2.write.put(str8, findfollowingbreak);
            }
        }
        return objM4882invokegIAlus;
    }

    /* JADX WARN: Code duplicated, block: B:11:0x002f  */
    /* JADX INFO: renamed from: fetchReleases-eH_QyT8, reason: not valid java name */
    public final Object m4884fetchReleaseseH_QyT8(String str, String str2, String str3, String str4, String str5, String str6, String str7, ContinuationImpl continuationImpl) throws Throwable {
        WebChatNativeAssetRepositoryImpl$fetchReleases$1 webChatNativeAssetRepositoryImpl$fetchReleases$1;
        String str8;
        String str9;
        String str10;
        setCustomInAppMessageAnimationFactorylambda0 setcustominappmessageanimationfactorylambda0;
        String str11;
        int i;
        String str12;
        String str13;
        String str14;
        setCustomInAppMessageAnimationFactorylambda0 setcustominappmessageanimationfactorylambda1;
        Object objM4885fetchReleasesFromApieH_QyT8;
        int i2 = 2 % 2;
        if (!(!(continuationImpl instanceof WebChatNativeAssetRepositoryImpl$fetchReleases$1))) {
            webChatNativeAssetRepositoryImpl$fetchReleases$1 = (WebChatNativeAssetRepositoryImpl$fetchReleases$1) continuationImpl;
            int i3 = webChatNativeAssetRepositoryImpl$fetchReleases$1.MediaSessionCompatQueueItem;
            if ((i3 & Integer.MIN_VALUE) == 0) {
                webChatNativeAssetRepositoryImpl$fetchReleases$1 = new WebChatNativeAssetRepositoryImpl$fetchReleases$1(this, continuationImpl);
            } else {
                int i4 = PlaybackStateCompat + 67;
                RatingCompat = i4 % Fields.SpotShadowColor;
                if (i4 % 2 != 0) {
                    webChatNativeAssetRepositoryImpl$fetchReleases$1.MediaSessionCompatQueueItem = i3 >> Integer.MIN_VALUE;
                } else {
                    webChatNativeAssetRepositoryImpl$fetchReleases$1.MediaSessionCompatQueueItem = i3 - Integer.MIN_VALUE;
                }
            }
        } else {
            webChatNativeAssetRepositoryImpl$fetchReleases$1 = new WebChatNativeAssetRepositoryImpl$fetchReleases$1(this, continuationImpl);
        }
        WebChatNativeAssetRepositoryImpl$fetchReleases$1 webChatNativeAssetRepositoryImpl$fetchReleases$2 = webChatNativeAssetRepositoryImpl$fetchReleases$1;
        Object obj = webChatNativeAssetRepositoryImpl$fetchReleases$2.ParcelableVolumeInfo;
        Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i5 = webChatNativeAssetRepositoryImpl$fetchReleases$2.MediaSessionCompatQueueItem;
        addStringAnnotation addstringannotation = this.MediaSessionCompatQueueItem;
        try {
            if (i5 == 0) {
                ExtrasKt.RemoteActionCompatParcelizer(obj);
                addstringannotation.getClass();
                str2.getClass();
                findFollowingBreak findfollowingbreak = (findFollowingBreak) addstringannotation.write.get(str2);
                if (findfollowingbreak != null) {
                    return findfollowingbreak;
                }
                webChatNativeAssetRepositoryImpl$fetchReleases$2.serializer = str;
                webChatNativeAssetRepositoryImpl$fetchReleases$2.read = str2;
                webChatNativeAssetRepositoryImpl$fetchReleases$2.IconCompatParcelizer = str3;
                str8 = str4;
                webChatNativeAssetRepositoryImpl$fetchReleases$2.write = str8;
                str9 = str5;
                webChatNativeAssetRepositoryImpl$fetchReleases$2.MediaBrowserCompatMediaItem = str9;
                str10 = str6;
                webChatNativeAssetRepositoryImpl$fetchReleases$2.RatingCompat = str10;
                webChatNativeAssetRepositoryImpl$fetchReleases$2.MediaMetadataCompat = str7;
                setcustominappmessageanimationfactorylambda0 = this.MediaBrowserCompatMediaItem;
                webChatNativeAssetRepositoryImpl$fetchReleases$2.MediaDescriptionCompat = setcustominappmessageanimationfactorylambda0;
                webChatNativeAssetRepositoryImpl$fetchReleases$2.RemoteActionCompatParcelizer = 0;
                webChatNativeAssetRepositoryImpl$fetchReleases$2.MediaSessionCompatQueueItem = 1;
                if (setcustominappmessageanimationfactorylambda0.lock(webChatNativeAssetRepositoryImpl$fetchReleases$2) != obj2) {
                    str11 = str2;
                    i = 0;
                    str12 = str7;
                    str13 = str3;
                    str14 = str;
                }
                return obj2;
            }
            if (i5 != 1) {
                if (i5 == 2) {
                    int i6 = PlaybackStateCompat + 75;
                    RatingCompat = i6 % Fields.SpotShadowColor;
                    int i7 = i6 % 2;
                    setcustominappmessageanimationfactorylambda1 = webChatNativeAssetRepositoryImpl$fetchReleases$2.MediaDescriptionCompat;
                    try {
                        ExtrasKt.RemoteActionCompatParcelizer(obj);
                        objM4885fetchReleasesFromApieH_QyT8 = ((onItemDismiss) obj).IconCompatParcelizer;
                        setcustominappmessageanimationfactorylambda1.write(null);
                        int i8 = RatingCompat + 125;
                        PlaybackStateCompat = i8 % Fields.SpotShadowColor;
                        int i9 = i8 % 2;
                        return objM4885fetchReleasesFromApieH_QyT8;
                    } catch (Throwable th) {
                        th = th;
                        setcustominappmessageanimationfactorylambda1.write(null);
                        throw th;
                    }
                }
                ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            i = webChatNativeAssetRepositoryImpl$fetchReleases$2.RemoteActionCompatParcelizer;
            setCustomInAppMessageAnimationFactorylambda0 setcustominappmessageanimationfactorylambda2 = webChatNativeAssetRepositoryImpl$fetchReleases$2.MediaDescriptionCompat;
            String str15 = webChatNativeAssetRepositoryImpl$fetchReleases$2.MediaMetadataCompat;
            String str16 = webChatNativeAssetRepositoryImpl$fetchReleases$2.RatingCompat;
            str9 = webChatNativeAssetRepositoryImpl$fetchReleases$2.MediaBrowserCompatMediaItem;
            String str17 = webChatNativeAssetRepositoryImpl$fetchReleases$2.write;
            str13 = webChatNativeAssetRepositoryImpl$fetchReleases$2.IconCompatParcelizer;
            String str18 = webChatNativeAssetRepositoryImpl$fetchReleases$2.read;
            String str19 = webChatNativeAssetRepositoryImpl$fetchReleases$2.serializer;
            ExtrasKt.RemoteActionCompatParcelizer(obj);
            setcustominappmessageanimationfactorylambda0 = setcustominappmessageanimationfactorylambda2;
            str14 = str19;
            str12 = str15;
            str11 = str18;
            str10 = str16;
            str8 = str17;
            addstringannotation.getClass();
            str11.getClass();
            findFollowingBreak findfollowingbreak2 = (findFollowingBreak) addstringannotation.write.get(str11);
            if (findfollowingbreak2 != null) {
                setcustominappmessageanimationfactorylambda0.write(null);
                return findfollowingbreak2;
            }
            webChatNativeAssetRepositoryImpl$fetchReleases$2.serializer = null;
            webChatNativeAssetRepositoryImpl$fetchReleases$2.read = null;
            webChatNativeAssetRepositoryImpl$fetchReleases$2.IconCompatParcelizer = null;
            webChatNativeAssetRepositoryImpl$fetchReleases$2.write = null;
            webChatNativeAssetRepositoryImpl$fetchReleases$2.MediaBrowserCompatMediaItem = null;
            webChatNativeAssetRepositoryImpl$fetchReleases$2.RatingCompat = null;
            webChatNativeAssetRepositoryImpl$fetchReleases$2.MediaMetadataCompat = null;
            webChatNativeAssetRepositoryImpl$fetchReleases$2.MediaDescriptionCompat = setcustominappmessageanimationfactorylambda0;
            webChatNativeAssetRepositoryImpl$fetchReleases$2.RemoteActionCompatParcelizer = i;
            webChatNativeAssetRepositoryImpl$fetchReleases$2.MediaSessionCompatQueueItem = 2;
            objM4885fetchReleasesFromApieH_QyT8 = m4885fetchReleasesFromApieH_QyT8(str14, str11, str13, str8, str9, str10, str12, webChatNativeAssetRepositoryImpl$fetchReleases$2);
            if (objM4885fetchReleasesFromApieH_QyT8 != obj2) {
                setcustominappmessageanimationfactorylambda1 = setcustominappmessageanimationfactorylambda0;
                setcustominappmessageanimationfactorylambda1.write(null);
                int i10 = RatingCompat + 125;
                PlaybackStateCompat = i10 % Fields.SpotShadowColor;
                int i11 = i10 % 2;
                return objM4885fetchReleasesFromApieH_QyT8;
            }
            return obj2;
        } catch (Throwable th2) {
            th = th2;
            setcustominappmessageanimationfactorylambda1 = setcustominappmessageanimationfactorylambda0;
            setcustominappmessageanimationfactorylambda1.write(null);
            throw th;
        }
    }

    /* JADX WARN: Code duplicated, block: B:47:0x00e9  */
    /* JADX WARN: Code duplicated, block: B:49:0x00ed A[Catch: all -> 0x014f, TRY_ENTER, TRY_LEAVE, TryCatch #1 {all -> 0x014f, blocks: (B:45:0x00e5, B:49:0x00ed), top: B:71:0x00e5 }] */
    /* JADX WARN: Code duplicated, block: B:52:0x0119  */
    /* JADX WARN: Code duplicated, block: B:55:0x0120 A[Catch: all -> 0x0074, TryCatch #0 {all -> 0x0074, blocks: (B:19:0x0059, B:62:0x0147, B:24:0x006a, B:53:0x011c, B:55:0x0120, B:58:0x0141), top: B:69:0x0034 }] */
    /* JADX WARN: Code duplicated, block: B:57:0x0140  */
    /* JADX WARN: Code duplicated, block: B:58:0x0141 A[Catch: all -> 0x0074, TryCatch #0 {all -> 0x0074, blocks: (B:19:0x0059, B:62:0x0147, B:24:0x006a, B:53:0x011c, B:55:0x0120, B:58:0x0141), top: B:69:0x0034 }] */
    /* JADX WARN: Code duplicated, block: B:61:0x0146  */
    /* JADX WARN: Code duplicated, block: B:7:0x0023  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r15v0 */
    /* JADX WARN: Type inference failed for: r15v1, types: [o.setCustomInAppMessageAnimationFactorylambda0] */
    /* JADX WARN: Type inference failed for: r15v2 */
    /* JADX WARN: Type inference failed for: r15v3, types: [o.setCustomInAppMessageAnimationFactorylambda0] */
    /* JADX WARN: Type inference failed for: r15v4 */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v1 */
    /* JADX WARN: Type inference failed for: r4v10, types: [o.setCustomInAppMessageAnimationFactorylambda0] */
    /* JADX WARN: Type inference failed for: r4v11, types: [o.setCustomInAppMessageAnimationFactorylambda0] */
    /* JADX WARN: Type inference failed for: r4v12 */
    /* JADX WARN: Type inference failed for: r4v21 */
    /* JADX WARN: Type inference failed for: r4v22 */
    /* JADX WARN: Type inference failed for: r4v23 */
    /* JADX WARN: Type inference failed for: r4v24 */
    /* JADX WARN: Type inference failed for: r4v25 */
    /* JADX WARN: Type inference failed for: r4v9 */
    /* JADX INFO: renamed from: fetchVariant-BWLJW6A, reason: not valid java name */
    public final Object m4886fetchVariantBWLJW6A(String str, String str2, String str3, ContinuationImpl continuationImpl) {
        WebChatNativeAssetRepositoryImpl$fetchVariant$1 webChatNativeAssetRepositoryImpl$fetchVariant$1;
        ?? r15;
        String str4;
        String str5;
        String str6;
        String str7;
        int i;
        String str8;
        Object objM4882invokegIAlus;
        Object obj;
        int i2;
        ?? r4;
        String str9;
        Object objUpdateValue;
        String str10;
        ?? r5;
        int i3 = 2 % 2;
        if (continuationImpl instanceof WebChatNativeAssetRepositoryImpl$fetchVariant$1) {
            webChatNativeAssetRepositoryImpl$fetchVariant$1 = (WebChatNativeAssetRepositoryImpl$fetchVariant$1) continuationImpl;
            int i4 = webChatNativeAssetRepositoryImpl$fetchVariant$1.RatingCompat;
            if ((i4 & Integer.MIN_VALUE) != 0) {
                int i5 = PlaybackStateCompat + 63;
                RatingCompat = i5 % Fields.SpotShadowColor;
                int i6 = i5 % 2;
                webChatNativeAssetRepositoryImpl$fetchVariant$1.RatingCompat = i4 - Integer.MIN_VALUE;
            } else {
                webChatNativeAssetRepositoryImpl$fetchVariant$1 = new WebChatNativeAssetRepositoryImpl$fetchVariant$1(this, continuationImpl);
            }
        } else {
            webChatNativeAssetRepositoryImpl$fetchVariant$1 = new WebChatNativeAssetRepositoryImpl$fetchVariant$1(this, continuationImpl);
        }
        WebChatNativeAssetRepositoryImpl$fetchVariant$1 webChatNativeAssetRepositoryImpl$fetchVariant$2 = webChatNativeAssetRepositoryImpl$fetchVariant$1;
        Object objRemoteActionCompatParcelizer = webChatNativeAssetRepositoryImpl$fetchVariant$2.MediaBrowserCompatMediaItem;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i7 = webChatNativeAssetRepositoryImpl$fetchVariant$2.RatingCompat;
        ?? r6 = 1;
        int i8 = 0;
        try {
            if (i7 == 0) {
                ExtrasKt.RemoteActionCompatParcelizer(objRemoteActionCompatParcelizer);
                String str11 = this.read;
                if (str11 != null) {
                    return str11;
                }
                WebChatNativeCacheDataStore webChatNativeCacheDataStore = this.MediaDescriptionCompat;
                str4 = str;
                webChatNativeAssetRepositoryImpl$fetchVariant$2.read = str4;
                webChatNativeAssetRepositoryImpl$fetchVariant$2.IconCompatParcelizer = str2;
                str5 = str3;
                webChatNativeAssetRepositoryImpl$fetchVariant$2.RemoteActionCompatParcelizer = str5;
                webChatNativeAssetRepositoryImpl$fetchVariant$2.RatingCompat = 1;
                objRemoteActionCompatParcelizer = webChatNativeCacheDataStore.RemoteActionCompatParcelizer(WebChatNativeCacheDataStore.read, webChatNativeAssetRepositoryImpl$fetchVariant$2);
                if (objRemoteActionCompatParcelizer != coroutineSingletons) {
                    int i9 = RatingCompat + 47;
                    PlaybackStateCompat = i9 % Fields.SpotShadowColor;
                    int i10 = i9 % 2;
                    str6 = str2;
                }
                return coroutineSingletons;
            }
            if (i7 == 1) {
                String str12 = webChatNativeAssetRepositoryImpl$fetchVariant$2.RemoteActionCompatParcelizer;
                str6 = webChatNativeAssetRepositoryImpl$fetchVariant$2.IconCompatParcelizer;
                String str13 = webChatNativeAssetRepositoryImpl$fetchVariant$2.read;
                ExtrasKt.RemoteActionCompatParcelizer(objRemoteActionCompatParcelizer);
                str5 = str12;
                str4 = str13;
            } else {
                if (i7 == 2) {
                    int i11 = webChatNativeAssetRepositoryImpl$fetchVariant$2.serializer;
                    setCustomInAppMessageAnimationFactorylambda0 setcustominappmessageanimationfactorylambda0 = webChatNativeAssetRepositoryImpl$fetchVariant$2.MediaSessionCompatQueueItem;
                    String str14 = webChatNativeAssetRepositoryImpl$fetchVariant$2.RemoteActionCompatParcelizer;
                    String str15 = webChatNativeAssetRepositoryImpl$fetchVariant$2.IconCompatParcelizer;
                    String str16 = webChatNativeAssetRepositoryImpl$fetchVariant$2.read;
                    ExtrasKt.RemoteActionCompatParcelizer(objRemoteActionCompatParcelizer);
                    i = i11;
                    r15 = setcustominappmessageanimationfactorylambda0;
                    str4 = str16;
                    str7 = str14;
                    str6 = str15;
                    try {
                        str8 = this.read;
                        if (str8 != null) {
                            r15.write(null);
                            return str8;
                        }
                        ExecuteHelpCenterApiRequest executeHelpCenterApiRequest = this.RemoteActionCompatParcelizer;
                        SubmitSafetyLogEventWorker$doWork$result$1 submitSafetyLogEventWorker$doWork$result$1 = new SubmitSafetyLogEventWorker$doWork$result$1(this, str4, str6, str7, null, 1);
                        webChatNativeAssetRepositoryImpl$fetchVariant$2.read = null;
                        webChatNativeAssetRepositoryImpl$fetchVariant$2.IconCompatParcelizer = null;
                        webChatNativeAssetRepositoryImpl$fetchVariant$2.RemoteActionCompatParcelizer = null;
                        webChatNativeAssetRepositoryImpl$fetchVariant$2.MediaSessionCompatQueueItem = r15;
                        webChatNativeAssetRepositoryImpl$fetchVariant$2.serializer = i;
                        webChatNativeAssetRepositoryImpl$fetchVariant$2.write = 0;
                        webChatNativeAssetRepositoryImpl$fetchVariant$2.RatingCompat = 3;
                        objM4882invokegIAlus = executeHelpCenterApiRequest.m4882invokegIAlus(submitSafetyLogEventWorker$doWork$result$1, webChatNativeAssetRepositoryImpl$fetchVariant$2);
                        if (objM4882invokegIAlus != coroutineSingletons) {
                            obj = objM4882invokegIAlus;
                            i2 = i;
                            r4 = r15;
                            r5 = r4;
                            if (!(obj instanceof isItemDismissable)) {
                                str9 = (String) obj;
                                WebChatNativeCacheDataStore webChatNativeCacheDataStore2 = this.MediaDescriptionCompat;
                                webChatNativeAssetRepositoryImpl$fetchVariant$2.read = null;
                                webChatNativeAssetRepositoryImpl$fetchVariant$2.IconCompatParcelizer = null;
                                webChatNativeAssetRepositoryImpl$fetchVariant$2.RemoteActionCompatParcelizer = null;
                                webChatNativeAssetRepositoryImpl$fetchVariant$2.MediaSessionCompatQueueItem = r4;
                                webChatNativeAssetRepositoryImpl$fetchVariant$2.MediaDescriptionCompat = obj;
                                webChatNativeAssetRepositoryImpl$fetchVariant$2.MediaMetadataCompat = str9;
                                webChatNativeAssetRepositoryImpl$fetchVariant$2.serializer = i2;
                                webChatNativeAssetRepositoryImpl$fetchVariant$2.write = i8;
                                webChatNativeAssetRepositoryImpl$fetchVariant$2.RatingCompat = 4;
                                objUpdateValue = webChatNativeCacheDataStore2.updateValue(WebChatNativeCacheDataStore.read, str9, webChatNativeAssetRepositoryImpl$fetchVariant$2);
                                if (objUpdateValue != coroutineSingletons) {
                                    objUpdateValue = createFromParcel.INSTANCE;
                                }
                                if (objUpdateValue != coroutineSingletons) {
                                    str10 = str9;
                                    r6 = r4;
                                }
                            }
                            r5.write(null);
                            return obj;
                        }
                        return coroutineSingletons;
                    } catch (Throwable th) {
                        th = th;
                        r15.write(null);
                        throw th;
                    }
                }
                if (i7 == 3) {
                    i8 = webChatNativeAssetRepositoryImpl$fetchVariant$2.write;
                    i2 = webChatNativeAssetRepositoryImpl$fetchVariant$2.serializer;
                    setCustomInAppMessageAnimationFactorylambda0 setcustominappmessageanimationfactorylambda1 = webChatNativeAssetRepositoryImpl$fetchVariant$2.MediaSessionCompatQueueItem;
                    ExtrasKt.RemoteActionCompatParcelizer(objRemoteActionCompatParcelizer);
                    obj = ((onItemDismiss) objRemoteActionCompatParcelizer).IconCompatParcelizer;
                    r4 = setcustominappmessageanimationfactorylambda1;
                    r5 = r4;
                    if (!(obj instanceof isItemDismissable)) {
                        str9 = (String) obj;
                        WebChatNativeCacheDataStore webChatNativeCacheDataStore3 = this.MediaDescriptionCompat;
                        webChatNativeAssetRepositoryImpl$fetchVariant$2.read = null;
                        webChatNativeAssetRepositoryImpl$fetchVariant$2.IconCompatParcelizer = null;
                        webChatNativeAssetRepositoryImpl$fetchVariant$2.RemoteActionCompatParcelizer = null;
                        webChatNativeAssetRepositoryImpl$fetchVariant$2.MediaSessionCompatQueueItem = r4;
                        webChatNativeAssetRepositoryImpl$fetchVariant$2.MediaDescriptionCompat = obj;
                        webChatNativeAssetRepositoryImpl$fetchVariant$2.MediaMetadataCompat = str9;
                        webChatNativeAssetRepositoryImpl$fetchVariant$2.serializer = i2;
                        webChatNativeAssetRepositoryImpl$fetchVariant$2.write = i8;
                        webChatNativeAssetRepositoryImpl$fetchVariant$2.RatingCompat = 4;
                        objUpdateValue = webChatNativeCacheDataStore3.updateValue(WebChatNativeCacheDataStore.read, str9, webChatNativeAssetRepositoryImpl$fetchVariant$2);
                        if (objUpdateValue != coroutineSingletons) {
                            objUpdateValue = createFromParcel.INSTANCE;
                        }
                        if (objUpdateValue != coroutineSingletons) {
                            str10 = str9;
                            r6 = r4;
                        }
                        return coroutineSingletons;
                    }
                    r5.write(null);
                    return obj;
                }
                int i12 = PlaybackStateCompat + 49;
                int i13 = i12 % Fields.SpotShadowColor;
                RatingCompat = i13;
                if (i12 % 2 == 0 ? i7 != 4 : i7 != 4) {
                    ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                int i14 = i13 + 111;
                PlaybackStateCompat = i14 % Fields.SpotShadowColor;
                int i15 = i14 % 2;
                str10 = webChatNativeAssetRepositoryImpl$fetchVariant$2.MediaMetadataCompat;
                obj = webChatNativeAssetRepositoryImpl$fetchVariant$2.MediaDescriptionCompat;
                setCustomInAppMessageAnimationFactorylambda0 setcustominappmessageanimationfactorylambda2 = webChatNativeAssetRepositoryImpl$fetchVariant$2.MediaSessionCompatQueueItem;
                ExtrasKt.RemoteActionCompatParcelizer(objRemoteActionCompatParcelizer);
                r6 = setcustominappmessageanimationfactorylambda2;
            }
            this.read = str10;
            r5 = r6;
            r5.write(null);
            return obj;
            String str17 = (String) objRemoteActionCompatParcelizer;
            if (str17 != null) {
                this.read = str17;
                return str17;
            }
            MutexImpl mutexImpl = this.MediaBrowserCompatMediaItem;
            webChatNativeAssetRepositoryImpl$fetchVariant$2.read = str4;
            webChatNativeAssetRepositoryImpl$fetchVariant$2.IconCompatParcelizer = str6;
            webChatNativeAssetRepositoryImpl$fetchVariant$2.RemoteActionCompatParcelizer = str5;
            webChatNativeAssetRepositoryImpl$fetchVariant$2.MediaSessionCompatQueueItem = mutexImpl;
            webChatNativeAssetRepositoryImpl$fetchVariant$2.serializer = 0;
            webChatNativeAssetRepositoryImpl$fetchVariant$2.RatingCompat = 2;
            if (mutexImpl.lock(webChatNativeAssetRepositoryImpl$fetchVariant$2) != coroutineSingletons) {
                r15 = mutexImpl;
                str7 = str5;
                i = 0;
                str8 = this.read;
                if (str8 != null) {
                    r15.write(null);
                    return str8;
                }
                ExecuteHelpCenterApiRequest executeHelpCenterApiRequest2 = this.RemoteActionCompatParcelizer;
                SubmitSafetyLogEventWorker$doWork$result$1 submitSafetyLogEventWorker$doWork$result$2 = new SubmitSafetyLogEventWorker$doWork$result$1(this, str4, str6, str7, null, 1);
                webChatNativeAssetRepositoryImpl$fetchVariant$2.read = null;
                webChatNativeAssetRepositoryImpl$fetchVariant$2.IconCompatParcelizer = null;
                webChatNativeAssetRepositoryImpl$fetchVariant$2.RemoteActionCompatParcelizer = null;
                webChatNativeAssetRepositoryImpl$fetchVariant$2.MediaSessionCompatQueueItem = r15;
                webChatNativeAssetRepositoryImpl$fetchVariant$2.serializer = i;
                webChatNativeAssetRepositoryImpl$fetchVariant$2.write = 0;
                webChatNativeAssetRepositoryImpl$fetchVariant$2.RatingCompat = 3;
                objM4882invokegIAlus = executeHelpCenterApiRequest2.m4882invokegIAlus(submitSafetyLogEventWorker$doWork$result$2, webChatNativeAssetRepositoryImpl$fetchVariant$2);
                if (objM4882invokegIAlus != coroutineSingletons) {
                    obj = objM4882invokegIAlus;
                    i2 = i;
                    r4 = r15;
                    r5 = r4;
                    if (!(obj instanceof isItemDismissable)) {
                        str9 = (String) obj;
                        WebChatNativeCacheDataStore webChatNativeCacheDataStore4 = this.MediaDescriptionCompat;
                        webChatNativeAssetRepositoryImpl$fetchVariant$2.read = null;
                        webChatNativeAssetRepositoryImpl$fetchVariant$2.IconCompatParcelizer = null;
                        webChatNativeAssetRepositoryImpl$fetchVariant$2.RemoteActionCompatParcelizer = null;
                        webChatNativeAssetRepositoryImpl$fetchVariant$2.MediaSessionCompatQueueItem = r4;
                        webChatNativeAssetRepositoryImpl$fetchVariant$2.MediaDescriptionCompat = obj;
                        webChatNativeAssetRepositoryImpl$fetchVariant$2.MediaMetadataCompat = str9;
                        webChatNativeAssetRepositoryImpl$fetchVariant$2.serializer = i2;
                        webChatNativeAssetRepositoryImpl$fetchVariant$2.write = i8;
                        webChatNativeAssetRepositoryImpl$fetchVariant$2.RatingCompat = 4;
                        objUpdateValue = webChatNativeCacheDataStore4.updateValue(WebChatNativeCacheDataStore.read, str9, webChatNativeAssetRepositoryImpl$fetchVariant$2);
                        if (objUpdateValue != coroutineSingletons) {
                            objUpdateValue = createFromParcel.INSTANCE;
                        }
                        if (objUpdateValue != coroutineSingletons) {
                            str10 = str9;
                            r6 = r4;
                            this.read = str10;
                            r5 = r6;
                        }
                    }
                    r5.write(null);
                    return obj;
                }
            }
            return coroutineSingletons;
        } catch (Throwable th2) {
            th = th2;
            r15 = r6;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x001a  */
    /* JADX INFO: renamed from: fetchManifest-yxL6bBk, reason: not valid java name */
    public final Object m4883fetchManifestyxL6bBk(String str, String str2, String str3, String str4, ContinuationImpl continuationImpl) {
        WebChatNativeAssetRepositoryImpl$fetchManifest$1 webChatNativeAssetRepositoryImpl$fetchManifest$1;
        Object objM4882invokegIAlus;
        Object next;
        List listRemoteActionCompatParcelizer;
        int i = 2 % 2;
        if (continuationImpl instanceof WebChatNativeAssetRepositoryImpl$fetchManifest$1) {
            webChatNativeAssetRepositoryImpl$fetchManifest$1 = (WebChatNativeAssetRepositoryImpl$fetchManifest$1) continuationImpl;
            int i2 = webChatNativeAssetRepositoryImpl$fetchManifest$1.write;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                webChatNativeAssetRepositoryImpl$fetchManifest$1.write = i2 - Integer.MIN_VALUE;
            } else {
                webChatNativeAssetRepositoryImpl$fetchManifest$1 = new WebChatNativeAssetRepositoryImpl$fetchManifest$1(this, continuationImpl);
                int i3 = RatingCompat + 19;
                PlaybackStateCompat = i3 % Fields.SpotShadowColor;
                int i4 = i3 % 2;
            }
        } else {
            webChatNativeAssetRepositoryImpl$fetchManifest$1 = new WebChatNativeAssetRepositoryImpl$fetchManifest$1(this, continuationImpl);
            int i5 = RatingCompat + 19;
            PlaybackStateCompat = i5 % Fields.SpotShadowColor;
            int i6 = i5 % 2;
        }
        WebChatNativeAssetRepositoryImpl$fetchManifest$1 webChatNativeAssetRepositoryImpl$fetchManifest$2 = webChatNativeAssetRepositoryImpl$fetchManifest$1;
        int i7 = PlaybackStateCompat + 79;
        RatingCompat = i7 % Fields.SpotShadowColor;
        Object obj = null;
        if (i7 % 2 != 0) {
            Object obj2 = webChatNativeAssetRepositoryImpl$fetchManifest$2.read;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i8 = webChatNativeAssetRepositoryImpl$fetchManifest$2.write;
            obj.hashCode();
            throw null;
        }
        Object obj3 = webChatNativeAssetRepositoryImpl$fetchManifest$2.read;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i9 = webChatNativeAssetRepositoryImpl$fetchManifest$2.write;
        if (i9 == 0) {
            ExtrasKt.RemoteActionCompatParcelizer(obj3);
            TwoFaViewModel$onPinChanged$1 twoFaViewModel$onPinChanged$1 = new TwoFaViewModel$onPinChanged$1(this, str2, str, str3, str4, (ShortNewsContentCardView) null);
            webChatNativeAssetRepositoryImpl$fetchManifest$2.write = 1;
            objM4882invokegIAlus = this.RemoteActionCompatParcelizer.m4882invokegIAlus(twoFaViewModel$onPinChanged$1, webChatNativeAssetRepositoryImpl$fetchManifest$2);
            if (objM4882invokegIAlus == coroutineSingletons2) {
                return coroutineSingletons2;
            }
        } else {
            if (i9 != 1) {
                ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            int i10 = RatingCompat + 65;
            PlaybackStateCompat = i10 % Fields.SpotShadowColor;
            if (i10 % 2 == 0) {
                ExtrasKt.RemoteActionCompatParcelizer(obj3);
                objM4882invokegIAlus = ((onItemDismiss) obj3).IconCompatParcelizer;
                int i11 = 77 / 0;
            } else {
                ExtrasKt.RemoteActionCompatParcelizer(obj3);
                objM4882invokegIAlus = ((onItemDismiss) obj3).IconCompatParcelizer;
            }
        }
        if (objM4882invokegIAlus instanceof isItemDismissable) {
            return objM4882invokegIAlus;
        }
        try {
            AnnotatedStringdefault annotatedStringdefault = (AnnotatedStringdefault) objM4882invokegIAlus;
            boolean zWrite = annotatedStringdefault.read().write();
            String strSerializer = annotatedStringdefault.read().serializer();
            int iSerializer = annotatedStringdefault.serializer();
            int i12 = annotatedStringdefault.read().read();
            getLocalParagraphStyles getlocalparagraphstylesRemoteActionCompatParcelizer = annotatedStringdefault.read().RemoteActionCompatParcelizer();
            Integer num = getlocalparagraphstylesRemoteActionCompatParcelizer != null ? new Integer(getlocalparagraphstylesRemoteActionCompatParcelizer.RemoteActionCompatParcelizer()) : null;
            getLocalParagraphStyles getlocalparagraphstylesRemoteActionCompatParcelizer2 = annotatedStringdefault.read().RemoteActionCompatParcelizer();
            Integer num2 = getlocalparagraphstylesRemoteActionCompatParcelizer2 != null ? new Integer(getlocalparagraphstylesRemoteActionCompatParcelizer2.IconCompatParcelizer()) : null;
            getLocalParagraphStyles getlocalparagraphstylesRemoteActionCompatParcelizer3 = annotatedStringdefault.read().RemoteActionCompatParcelizer();
            DeprecatedBridgeFontResourceLoaderCompanion deprecatedBridgeFontResourceLoaderCompanion = new DeprecatedBridgeFontResourceLoaderCompanion(zWrite, strSerializer, iSerializer, i12, num, num2, getlocalparagraphstylesRemoteActionCompatParcelizer3 != null ? new Integer(getlocalparagraphstylesRemoteActionCompatParcelizer3.serializer()) : null);
            Iterator it = annotatedStringdefault.RemoteActionCompatParcelizer().iterator();
            do {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
            } while (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{((buildAnnotatedString) next).IconCompatParcelizer(), "p2p_chat"}, getCieXyz.write())).booleanValue());
            buildAnnotatedString buildannotatedstring = (buildAnnotatedString) next;
            if (buildannotatedstring == null || (listRemoteActionCompatParcelizer = buildannotatedstring.RemoteActionCompatParcelizer()) == null) {
                isItemDismissable isitemdismissable = new isItemDismissable(new Exception("Failed to parse chat asset manifests."));
                int i13 = RatingCompat + 115;
                PlaybackStateCompat = i13 % Fields.SpotShadowColor;
                if (i13 % 2 == 0) {
                    int i14 = 73 / 0;
                }
                return isitemdismissable;
            }
            List<capitalize> list = listRemoteActionCompatParcelizer;
            ArrayList arrayList = new ArrayList(accessgetInstancedelegatecp.write(list, 10));
            for (capitalize capitalizeVar : list) {
                String strIconCompatParcelizer = capitalizeVar.IconCompatParcelizer();
                String strSerializer2 = capitalizeVar.serializer();
                EmojiSupportMatch emojiSupportMatch = from.Companion;
                String str5 = capitalizeVar.read();
                emojiSupportMatch.getClass();
                from fromVarRemoteActionCompatParcelizer = EmojiSupportMatch.RemoteActionCompatParcelizer(str5);
                decapitalizedefault decapitalizedefaultVarWrite = capitalizeVar.write();
                arrayList.add(new getDefaultPaddingXSAIIZE(strIconCompatParcelizer, strSerializer2, fromVarRemoteActionCompatParcelizer, decapitalizedefaultVarWrite != null ? new getBullet(decapitalizedefaultVarWrite.read(), decapitalizedefaultVarWrite.write(), decapitalizedefaultVarWrite.serializer(), decapitalizedefaultVarWrite.IconCompatParcelizer()) : null));
            }
            return new ComposeUiTextFlags(deprecatedBridgeFontResourceLoaderCompanion, arrayList);
        } catch (Throwable th) {
            return new isItemDismissable(th);
        }
    }
}
