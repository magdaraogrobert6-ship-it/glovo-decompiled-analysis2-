package com.roadrunner.customerchat.selfservice.data.cache;

import android.app.Application;
import androidx.compose.ui.graphics.Fields;
import androidx.lifecycle.BlockRunner;
import coil3.ExtrasKt;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import com.google.firebase.encoders.proto.ProtobufEncoder;
import com.huawei.hms.framework.common.BundleUtil;
import com.huawei.hms.framework.common.ContainerUtils;
import com.roadrunner.auth.data.LocalAuthDataSource;
import com.roadrunner.auth.data.SignInDataStore$set$2;
import com.roadrunner.common.data.api.MapApiError$$ExternalSyntheticLambda1;
import com.roadrunner.customerchat.selfservice.data.cache.server.ChatAssetCacheLocalWebServer;
import com.roadrunner.customerchat.selfservice.domain.asset.DownloadChatAssetsUseCase$downloadAndStore$1;
import com.roadrunner.sidemenu.data.cache.SideMenuCacheImpl;
import java.io.File;
import java.net.URI;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.regex.Pattern;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.DelayKt;
import kotlinx.coroutines.scheduling.DefaultIoScheduler;
import kotlinx.coroutines.scheduling.DefaultScheduler;
import o.BulletSpanWithLevel;
import o.DeprecatedBridgeFontResourceLoader;
import o.ItemTouchHelperAdapter;
import o.ShortNewsContentCardView;
import o.accessgetInstancedelegatecp;
import o.accessisSetgyyYBs;
import o.createFromParcel;
import o.findFollowingBreak;
import o.getCieXyz;
import o.getDefaultIndentationXSAIIZE;
import o.getDefaultSizeXSAIIZE;
import o.getInAppMessageEventMap;
import o.getQueryParameterslambda2;
import o.getUrlAnnotations;
import o.hasLinkAnnotations;
import o.hasStringAnnotations;
import o.hideCurrentlyDisplayingInAppMessage;
import o.inCompatibilityMode;
import o.isItemDismissable;
import o.isOpenInternalroom_runtime;
import o.length;
import o.onContentCardClicked;
import o.onContentCardDismissed;
import o.onItemDismiss;
import o.onMove;
import o.prepareForActivityTransitionCarryover;
import o.r8lambda3kmCh7YKlPUi_5SMGAzRgcZHGLc;
import o.r8lambdafvzP3Wky1RLLzE56uVXaMHcvU;
import o.removeNodeAtDepth;
import o.setCarryoverInAppMessage;
import o.subSequence5zctL8;
import timber.log.Timber;

/* JADX INFO: loaded from: classes3.dex */
public final class ChatAssetCacheManager {
    private static int MediaBrowserCompatMediaItem = 1;
    private static int RatingCompat;
    public volatile BlockRunner IconCompatParcelizer;
    public final ChatAssetCacheLocalWebServer MediaDescriptionCompat;
    public final ProtobufEncoder MediaMetadataCompat;
    public final r8lambda3kmCh7YKlPUi_5SMGAzRgcZHGLc MediaSessionCompatQueueItem;
    public final isOpenInternalroom_runtime RemoteActionCompatParcelizer;
    public final ConcurrentHashMap.KeySetView read;
    public final accessisSetgyyYBs serializer;
    public final Application write;

    public static /* synthetic */ Object serializer(int i, int i2, Object[] objArr, int i3, int i4, int i5, int i6) {
        int i7 = ~i;
        int i8 = (~(i7 | i3)) | i2;
        int i9 = i3 | i2 | i7;
        int i10 = i2 + i + i5 + (1159740906 * i6) + ((-617157175) * i4);
        int i11 = i10 * i10;
        int i12 = ((i2 * 934236018) - 2089811968) + (934236018 * i) + (i8 * (-953110385)) + ((-953110385) * i9) + (953110385 * i7) + ((-18874368) * i5) + (1488977920 * i6) + (2111832064 * i4) + (2070937600 * i11);
        int i13 = (i2 * (-824977050)) + 1921657099 + (i * (-824977050)) + (i8 * (-923)) + (i9 * (-923)) + (i7 * 923) + (i5 * (-824977973)) + (i6 * (-135083378)) + (i4 * 1125239651) + (i11 * 298844160);
        return i12 + ((i13 * i13) * 2098200576) != 1 ? RemoteActionCompatParcelizer(objArr) : read(objArr);
    }

    public ChatAssetCacheManager(Application application, isOpenInternalroom_runtime isopeninternalroom_runtime, ChatAssetCacheLocalWebServer chatAssetCacheLocalWebServer, accessisSetgyyYBs accessissetgyyybs, ProtobufEncoder protobufEncoder) {
        application.getClass();
        isopeninternalroom_runtime.getClass();
        chatAssetCacheLocalWebServer.getClass();
        accessissetgyyybs.getClass();
        protobufEncoder.getClass();
        this.write = application;
        this.RemoteActionCompatParcelizer = isopeninternalroom_runtime;
        this.MediaDescriptionCompat = chatAssetCacheLocalWebServer;
        this.serializer = accessissetgyyybs;
        this.MediaMetadataCompat = protobufEncoder;
        this.MediaSessionCompatQueueItem = DelayKt.serializer(new MapApiError$$ExternalSyntheticLambda1(6));
        this.read = ConcurrentHashMap.newKeySet();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object clear(ContinuationImpl continuationImpl) {
        length lengthVar;
        if (continuationImpl instanceof length) {
            lengthVar = (length) continuationImpl;
            int i = lengthVar.RemoteActionCompatParcelizer;
            if ((i & Integer.MIN_VALUE) != 0) {
                lengthVar.RemoteActionCompatParcelizer = i - Integer.MIN_VALUE;
            } else {
                lengthVar = new length(this, continuationImpl);
            }
        } else {
            lengthVar = new length(this, continuationImpl);
        }
        Object obj = lengthVar.write;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = lengthVar.RemoteActionCompatParcelizer;
        ShortNewsContentCardView shortNewsContentCardView = null;
        if (i2 == 0) {
            ExtrasKt.RemoteActionCompatParcelizer(obj);
            ChatAssetCacheLocalWebServer chatAssetCacheLocalWebServer = this.MediaDescriptionCompat;
            synchronized (chatAssetCacheLocalWebServer.MediaSessionCompatResultReceiverWrapper) {
                chatAssetCacheLocalWebServer.write();
            }
            ItemTouchHelperAdapter itemTouchHelperAdapter = ItemTouchHelperAdapter.serializer;
            lengthVar.RemoteActionCompatParcelizer = 1;
            ((inCompatibilityMode) this.RemoteActionCompatParcelizer).getClass();
            DefaultScheduler defaultScheduler = prepareForActivityTransitionCarryover.RemoteActionCompatParcelizer;
            if (BuildersKt.withContext(DefaultIoScheduler.RemoteActionCompatParcelizer, new LocalAuthDataSource.AnonymousClass2(this, itemTouchHelperAdapter, shortNewsContentCardView, 6), lengthVar) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i2 != 1) {
                ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            ExtrasKt.RemoteActionCompatParcelizer(obj);
        }
        this.IconCompatParcelizer = null;
        return createFromParcel.INSTANCE;
    }

    public final void RemoteActionCompatParcelizer(String str) {
        int i = 2 % 2;
        int i2 = MediaBrowserCompatMediaItem + 45;
        RatingCompat = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        str.getClass();
        this.read.remove(str);
        int i4 = MediaBrowserCompatMediaItem + 47;
        RatingCompat = i4 % Fields.SpotShadowColor;
        int i5 = i4 % 2;
    }

    public final Object RemoteActionCompatParcelizer(getDefaultIndentationXSAIIZE getdefaultindentationxsaiize, byte[] bArr, String str, DownloadChatAssetsUseCase$downloadAndStore$1 downloadChatAssetsUseCase$downloadAndStore$1) throws Throwable {
        int i = 2 % 2;
        ((inCompatibilityMode) this.RemoteActionCompatParcelizer).getClass();
        DefaultScheduler defaultScheduler = prepareForActivityTransitionCarryover.RemoteActionCompatParcelizer;
        Object objWithContext = BuildersKt.withContext(DefaultIoScheduler.RemoteActionCompatParcelizer, new SideMenuCacheImpl.AnonymousClass2(bArr, this, getdefaultindentationxsaiize, str, null, 4), downloadChatAssetsUseCase$downloadAndStore$1);
        int i2 = RatingCompat + 45;
        MediaBrowserCompatMediaItem = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        return objWithContext;
    }

    public final Object serializer(getDefaultIndentationXSAIIZE getdefaultindentationxsaiize, String str, DownloadChatAssetsUseCase$downloadAndStore$1 downloadChatAssetsUseCase$downloadAndStore$1) throws Throwable {
        int i = 2 % 2;
        ((inCompatibilityMode) this.RemoteActionCompatParcelizer).getClass();
        DefaultScheduler defaultScheduler = prepareForActivityTransitionCarryover.RemoteActionCompatParcelizer;
        Object objWithContext = BuildersKt.withContext(DefaultIoScheduler.RemoteActionCompatParcelizer, new SignInDataStore$set$2(this, str, getdefaultindentationxsaiize, null, 14), downloadChatAssetsUseCase$downloadAndStore$1);
        int i2 = RatingCompat + 5;
        MediaBrowserCompatMediaItem = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        return objWithContext;
    }

    public static final File IconCompatParcelizer(ChatAssetCacheManager chatAssetCacheManager, String str) {
        int i = 2 % 2;
        File file = new File(chatAssetCacheManager.write.getFilesDir(), "customer-chat-assets/".concat(setCarryoverInAppMessage.write(str, ":", BundleUtil.UNDERLINE_TAG)));
        file.mkdirs();
        int i2 = MediaBrowserCompatMediaItem + 83;
        RatingCompat = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        return file;
    }

    public static final String read(ChatAssetCacheManager chatAssetCacheManager, getDefaultIndentationXSAIIZE getdefaultindentationxsaiize) {
        int i = 2 % 2;
        int i2 = MediaBrowserCompatMediaItem + 19;
        RatingCompat = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        String strSerializer = getdefaultindentationxsaiize.serializer();
        if (!((Boolean) serializer(967824731, -967824731, new Object[]{strSerializer}, getQueryParameterslambda2.serializer(), getQueryParameterslambda2.serializer(), getQueryParameterslambda2.serializer(), getQueryParameterslambda2.serializer())).booleanValue()) {
            strSerializer = null;
        }
        if (strSerializer == null) {
            ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer(r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.serializer("Cannot derive a safe file name for asset: ", getdefaultindentationxsaiize.RemoteActionCompatParcelizer()));
            return null;
        }
        int i4 = RatingCompat + 17;
        MediaBrowserCompatMediaItem = i4 % Fields.SpotShadowColor;
        if (i4 % 2 == 0) {
            int i5 = 26 / 0;
        }
        return strSerializer;
    }

    public final Object writeReadyMetadata(findFollowingBreak findfollowingbreak, ArrayList arrayList, DeprecatedBridgeFontResourceLoader deprecatedBridgeFontResourceLoader) throws Throwable {
        int i = 2 % 2;
        ((inCompatibilityMode) this.RemoteActionCompatParcelizer).getClass();
        DefaultScheduler defaultScheduler = prepareForActivityTransitionCarryover.RemoteActionCompatParcelizer;
        Object objWithContext = BuildersKt.withContext(DefaultIoScheduler.RemoteActionCompatParcelizer, new SignInDataStore$set$2(this, findfollowingbreak, arrayList, null, 15), deprecatedBridgeFontResourceLoader);
        if (objWithContext == CoroutineSingletons.COROUTINE_SUSPENDED) {
            int i2 = RatingCompat + 59;
            MediaBrowserCompatMediaItem = i2 % Fields.SpotShadowColor;
            int i3 = i2 % 2;
            return objWithContext;
        }
        createFromParcel createfromparcel = createFromParcel.INSTANCE;
        int i4 = RatingCompat + 19;
        MediaBrowserCompatMediaItem = i4 % Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return createfromparcel;
    }

    public final Object activateFromDisk(String str, ContinuationImpl continuationImpl) throws Throwable {
        String strMediaMetadataCompat;
        int i = 2 % 2;
        createFromParcel createfromparcel = createFromParcel.INSTANCE;
        BlockRunner blockRunner = this.IconCompatParcelizer;
        ShortNewsContentCardView shortNewsContentCardView = null;
        if (blockRunner != null) {
            int i2 = MediaBrowserCompatMediaItem + 11;
            RatingCompat = i2 % Fields.SpotShadowColor;
            if (i2 % 2 != 0) {
                strMediaMetadataCompat = blockRunner.MediaMetadataCompat();
                int i3 = 56 / 0;
            } else {
                strMediaMetadataCompat = blockRunner.MediaMetadataCompat();
            }
        } else {
            int i4 = MediaBrowserCompatMediaItem + 19;
            RatingCompat = i4 % Fields.SpotShadowColor;
            int i5 = i4 % 2;
            strMediaMetadataCompat = null;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{strMediaMetadataCompat, str}, getCieXyz.write())).booleanValue()) {
            ((inCompatibilityMode) this.RemoteActionCompatParcelizer).getClass();
            DefaultScheduler defaultScheduler = prepareForActivityTransitionCarryover.RemoteActionCompatParcelizer;
            Object objWithContext = BuildersKt.withContext(DefaultIoScheduler.RemoteActionCompatParcelizer, new LocalAuthDataSource.AnonymousClass2(this, str, shortNewsContentCardView, 5), continuationImpl);
            if (objWithContext == CoroutineSingletons.COROUTINE_SUSPENDED) {
                return objWithContext;
            }
        }
        return createfromparcel;
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0030  */
    /* JADX WARN: Code duplicated, block: B:18:0x004e  */
    /* JADX WARN: Code duplicated, block: B:28:0x0071  */
    /* JADX WARN: Code duplicated, block: B:9:0x0023  */
    private static /* synthetic */ Object RemoteActionCompatParcelizer(Object[] objArr) {
        int i;
        int i2;
        char cCharAt;
        String str = (String) objArr[0];
        int i3 = 2 % 2;
        int i4 = RatingCompat + 83;
        MediaBrowserCompatMediaItem = i4 % Fields.SpotShadowColor;
        if (i4 % 2 == 0) {
            int i5 = 33 / 0;
            if (!hideCurrentlyDisplayingInAppMessage.serializer((CharSequence) str)) {
                i = RatingCompat + 101;
                MediaBrowserCompatMediaItem = i % Fields.SpotShadowColor;
                if (i % 2 != 0) {
                    str.equals(".");
                    Object obj = null;
                    obj.hashCode();
                    throw null;
                }
                if (!str.equals(".") && !str.equals("..")) {
                    int i6 = RatingCompat + 53;
                    MediaBrowserCompatMediaItem = i6 % Fields.SpotShadowColor;
                    int i7 = i6 % 2;
                    for (i2 = 0; i2 < str.length(); i2++) {
                        cCharAt = str.charAt(i2);
                        if (cCharAt == File.separatorChar && cCharAt != '/' && cCharAt != '\\') {
                        }
                    }
                    int i8 = MediaBrowserCompatMediaItem + 37;
                    RatingCompat = i8 % Fields.SpotShadowColor;
                    int i9 = i8 % 2;
                    return true;
                }
            }
        } else if (!hideCurrentlyDisplayingInAppMessage.serializer((CharSequence) str)) {
            i = RatingCompat + 101;
            MediaBrowserCompatMediaItem = i % Fields.SpotShadowColor;
            if (i % 2 != 0) {
                str.equals(".");
                Object obj2 = null;
                obj2.hashCode();
                throw null;
            }
            if (!str.equals(".")) {
                int i10 = RatingCompat + 53;
                MediaBrowserCompatMediaItem = i10 % Fields.SpotShadowColor;
                int i11 = i10 % 2;
                while (i2 < str.length()) {
                    cCharAt = str.charAt(i2);
                    if (cCharAt == File.separatorChar) {
                    }
                }
                int i12 = MediaBrowserCompatMediaItem + 37;
                RatingCompat = i12 % Fields.SpotShadowColor;
                int i13 = i12 % 2;
                return true;
            }
        }
        int i14 = RatingCompat + 87;
        MediaBrowserCompatMediaItem = i14 % Fields.SpotShadowColor;
        int i15 = i14 % 2;
        return false;
    }

    public static final getUrlAnnotations IconCompatParcelizer(ChatAssetCacheManager chatAssetCacheManager, BulletSpanWithLevel bulletSpanWithLevel) {
        int i = 2 % 2;
        String strRemoteActionCompatParcelizer = bulletSpanWithLevel.RemoteActionCompatParcelizer().RemoteActionCompatParcelizer();
        String str = bulletSpanWithLevel.RemoteActionCompatParcelizer().read();
        String strSerializer = bulletSpanWithLevel.RemoteActionCompatParcelizer().serializer();
        String strWrite = bulletSpanWithLevel.RemoteActionCompatParcelizer().write();
        String name = new File(bulletSpanWithLevel.write()).getName();
        name.getClass();
        getUrlAnnotations geturlannotations = new getUrlAnnotations(strRemoteActionCompatParcelizer, str, strSerializer, strWrite, name);
        int i2 = RatingCompat + 71;
        MediaBrowserCompatMediaItem = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        return geturlannotations;
    }

    public static getInAppMessageEventMap read(String str) {
        int i = 2 % 2;
        StringBuilder sb = new StringBuilder("^");
        int i2 = 0;
        while (i2 < str.length()) {
            int i3 = RatingCompat + 57;
            MediaBrowserCompatMediaItem = i3 % Fields.SpotShadowColor;
            int i4 = i3 % 2;
            if (setCarryoverInAppMessage.RemoteActionCompatParcelizer(i2, str, "**", false)) {
                sb.append(".*");
                i2 += 2;
            } else {
                if (str.charAt(i2) == '*') {
                    sb.append("[^/]*");
                    int i5 = RatingCompat + 93;
                    MediaBrowserCompatMediaItem = i5 % Fields.SpotShadowColor;
                    if (i5 % 2 == 0) {
                        int i6 = 4 % 2;
                    }
                } else {
                    String strValueOf = String.valueOf(str.charAt(i2));
                    strValueOf.getClass();
                    String strQuote = Pattern.quote(strValueOf);
                    strQuote.getClass();
                    sb.append(strQuote);
                }
                i2++;
            }
        }
        sb.append("$");
        getInAppMessageEventMap getinappmessageeventmap = new getInAppMessageEventMap(sb.toString());
        int i7 = RatingCompat + 67;
        MediaBrowserCompatMediaItem = i7 % Fields.SpotShadowColor;
        int i8 = i7 % 2;
        return getinappmessageeventmap;
    }

    private static /* synthetic */ Object read(Object[] objArr) {
        hasStringAnnotations hasstringannotations;
        List list = (List) objArr[0];
        File file = (File) objArr[1];
        int i = 2 % 2;
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (true) {
            Object obj = null;
            if (!it.hasNext()) {
                int i2 = MediaBrowserCompatMediaItem + 41;
                RatingCompat = i2 % Fields.SpotShadowColor;
                if (i2 % 2 == 0) {
                    return arrayList;
                }
                throw null;
            }
            int i3 = RatingCompat + 53;
            MediaBrowserCompatMediaItem = i3 % Fields.SpotShadowColor;
            if (i3 % 2 == 0) {
                ((Boolean) serializer(967824731, -967824731, new Object[]{((subSequence5zctL8) it.next()).write()}, getQueryParameterslambda2.serializer(), getQueryParameterslambda2.serializer(), getQueryParameterslambda2.serializer(), getQueryParameterslambda2.serializer())).booleanValue();
                throw null;
            }
            subSequence5zctL8 subsequence5zctl8 = (subSequence5zctL8) it.next();
            if (((Boolean) serializer(967824731, -967824731, new Object[]{subsequence5zctl8.write()}, getQueryParameterslambda2.serializer(), getQueryParameterslambda2.serializer(), getQueryParameterslambda2.serializer(), getQueryParameterslambda2.serializer())).booleanValue()) {
                try {
                    hasstringannotations = new hasStringAnnotations(read(subsequence5zctl8.serializer()), new getDefaultSizeXSAIIZE(new File(file, subsequence5zctl8.write()), "text/html", "utf-8", subsequence5zctl8.write()));
                } catch (Exception e) {
                    Timber.RemoteActionCompatParcelizer.RemoteActionCompatParcelizer(e, r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.serializer("Failed to compile route pattern: ", subsequence5zctl8.serializer()), new Object[0]);
                    hasstringannotations = null;
                }
            } else {
                hasstringannotations = null;
            }
            if (hasstringannotations != null) {
                int i4 = MediaBrowserCompatMediaItem + 79;
                RatingCompat = i4 % Fields.SpotShadowColor;
                if (i4 % 2 != 0) {
                    arrayList.add(hasstringannotations);
                    obj.hashCode();
                    throw null;
                }
                arrayList.add(hasstringannotations);
            }
        }
    }

    public final Object pruneStaleReleasesExcept(List list, DeprecatedBridgeFontResourceLoader deprecatedBridgeFontResourceLoader) throws Throwable {
        int i = 2 % 2;
        BlockRunner blockRunner = this.IconCompatParcelizer;
        ShortNewsContentCardView shortNewsContentCardView = null;
        ArrayList arrayListRemoteActionCompatParcelizer = onContentCardClicked.RemoteActionCompatParcelizer((Object[]) new String[]{blockRunner != null ? blockRunner.MediaMetadataCompat() : null, this.MediaDescriptionCompat.MediaMetadataCompat});
        ConcurrentHashMap.KeySetView keySetView = this.read;
        keySetView.getClass();
        ArrayList arrayListIconCompatParcelizer = onContentCardDismissed.IconCompatParcelizer(arrayListRemoteActionCompatParcelizer, onContentCardDismissed.IconCompatParcelizer(keySetView, list));
        ArrayList arrayList = new ArrayList(accessgetInstancedelegatecp.write(arrayListIconCompatParcelizer, 10));
        Iterator it = arrayListIconCompatParcelizer.iterator();
        while (it.hasNext()) {
            int i2 = RatingCompat + 45;
            MediaBrowserCompatMediaItem = i2 % Fields.SpotShadowColor;
            if (i2 % 2 == 0) {
                String str = (String) it.next();
                str.getClass();
                arrayList.add(setCarryoverInAppMessage.write(str, ":", BundleUtil.UNDERLINE_TAG));
                shortNewsContentCardView.hashCode();
                throw null;
            }
            String str2 = (String) it.next();
            str2.getClass();
            arrayList.add(setCarryoverInAppMessage.write(str2, ":", BundleUtil.UNDERLINE_TAG));
        }
        Set setR8lambda54BeH8ZsBru0CXI2CCSP2syNys = onContentCardDismissed.r8lambda54BeH8ZsBru0CXI2CCSP2syNys(arrayList);
        ((inCompatibilityMode) this.RemoteActionCompatParcelizer).getClass();
        DefaultScheduler defaultScheduler = prepareForActivityTransitionCarryover.RemoteActionCompatParcelizer;
        Object objWithContext = BuildersKt.withContext(DefaultIoScheduler.RemoteActionCompatParcelizer, new LocalAuthDataSource.AnonymousClass2(this, setR8lambda54BeH8ZsBru0CXI2CCSP2syNys, shortNewsContentCardView, 6), deprecatedBridgeFontResourceLoader);
        if (objWithContext != CoroutineSingletons.COROUTINE_SUSPENDED) {
            return createFromParcel.INSTANCE;
        }
        int i3 = MediaBrowserCompatMediaItem + 59;
        RatingCompat = i3 % Fields.SpotShadowColor;
        if (i3 % 2 == 0) {
            return objWithContext;
        }
        throw null;
    }

    /* JADX WARN: Code duplicated, block: B:32:0x00cb  */
    public static final BlockRunner read(ChatAssetCacheManager chatAssetCacheManager, File file, hasLinkAnnotations haslinkannotations) {
        Object isitemdismissable;
        String str;
        Object next;
        Object obj = "";
        int i = 2 % 2;
        try {
            isitemdismissable = new URI(haslinkannotations.RemoteActionCompatParcelizer()).getHost();
            if (isitemdismissable == null) {
                int i2 = MediaBrowserCompatMediaItem + 117;
                RatingCompat = i2 % Fields.SpotShadowColor;
                int i3 = i2 % 2;
                isitemdismissable = "";
            }
        } catch (Throwable th) {
            isitemdismissable = new isItemDismissable(th);
        }
        if (onItemDismiss.serializer(isitemdismissable) == null) {
            int i4 = MediaBrowserCompatMediaItem + 7;
            RatingCompat = i4 % Fields.SpotShadowColor;
            int i5 = i4 % 2;
            obj = isitemdismissable;
        }
        String str2 = (String) obj;
        List<getUrlAnnotations> list = haslinkannotations.read();
        int iRemoteActionCompatParcelizer = onMove.RemoteActionCompatParcelizer(accessgetInstancedelegatecp.write(list, 10));
        if (iRemoteActionCompatParcelizer < 16) {
            iRemoteActionCompatParcelizer = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(iRemoteActionCompatParcelizer);
        for (getUrlAnnotations geturlannotations : list) {
            List listSerializer = hideCurrentlyDisplayingInAppMessage.serializer(geturlannotations.serializer(), new String[]{";"}, 6);
            ArrayList arrayList = new ArrayList(accessgetInstancedelegatecp.write(listSerializer, 10));
            Iterator it = listSerializer.iterator();
            while (true) {
                str = null;
                if (it.hasNext()) {
                    int i6 = RatingCompat + 29;
                    MediaBrowserCompatMediaItem = i6 % Fields.SpotShadowColor;
                    if (i6 % 2 == 0) {
                        arrayList.add(hideCurrentlyDisplayingInAppMessage.read((CharSequence) it.next()).toString());
                        throw null;
                    }
                    arrayList.add(hideCurrentlyDisplayingInAppMessage.read((CharSequence) it.next()).toString());
                }
            }
            String str3 = (String) onContentCardDismissed.MediaMetadataCompat((List) arrayList);
            if (str3 == null) {
                str3 = "application/octet-stream";
            } else {
                if (hideCurrentlyDisplayingInAppMessage.serializer((CharSequence) str3)) {
                    str3 = null;
                }
                if (str3 == null) {
                    str3 = "application/octet-stream";
                }
            }
            Iterator it2 = arrayList.iterator();
            do {
                if (!it2.hasNext()) {
                    next = null;
                    break;
                }
                next = it2.next();
            } while (!setCarryoverInAppMessage.RemoteActionCompatParcelizer((String) next, "charset=", true));
            String str4 = (String) next;
            if (str4 != null) {
                String strIconCompatParcelizer = hideCurrentlyDisplayingInAppMessage.IconCompatParcelizer(str4, ContainerUtils.KEY_VALUE_DELIMITER, str4);
                if (!hideCurrentlyDisplayingInAppMessage.serializer((CharSequence) strIconCompatParcelizer)) {
                    str = strIconCompatParcelizer;
                }
            }
            linkedHashMap.put(hideCurrentlyDisplayingInAppMessage.read(geturlannotations.write(), '/'), new getDefaultSizeXSAIIZE(new File(file, geturlannotations.read()), str3, str, geturlannotations.RemoteActionCompatParcelizer()));
        }
        return new BlockRunner(haslinkannotations.write(), str2, haslinkannotations.RemoteActionCompatParcelizer(), linkedHashMap, (ArrayList) serializer(-1257405651, 1257405652, new Object[]{haslinkannotations.IconCompatParcelizer(), file}, getQueryParameterslambda2.serializer(), getQueryParameterslambda2.serializer(), getQueryParameterslambda2.serializer(), getQueryParameterslambda2.serializer()), (ArrayList) serializer(-1257405651, 1257405652, new Object[]{haslinkannotations.serializer(), file}, getQueryParameterslambda2.serializer(), getQueryParameterslambda2.serializer(), getQueryParameterslambda2.serializer(), getQueryParameterslambda2.serializer()));
    }

    public static boolean write(String str) {
        return ((Boolean) serializer(967824731, -967824731, new Object[]{str}, getQueryParameterslambda2.serializer(), getQueryParameterslambda2.serializer(), getQueryParameterslambda2.serializer(), getQueryParameterslambda2.serializer())).booleanValue();
    }

    public static ArrayList IconCompatParcelizer(List list, File file) {
        return (ArrayList) serializer(-1257405651, 1257405652, new Object[]{list, file}, getQueryParameterslambda2.serializer(), getQueryParameterslambda2.serializer(), getQueryParameterslambda2.serializer(), getQueryParameterslambda2.serializer());
    }
}
