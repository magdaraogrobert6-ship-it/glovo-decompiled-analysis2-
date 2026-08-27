package com.roadrunner.customerchat.selfservice.domain.asset;

import androidx.compose.ui.graphics.Fields;
import bo.app.af$$ExternalSyntheticOutline0;
import bo.app.ff$$ExternalSyntheticOutline0;
import coil3.ExtrasKt;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import com.google.android.gms.internal.mlkit_vision_barcode.zzpd;
import com.roadrunner.customerchat.selfservice.data.cache.ChatAssetCacheManager;
import java.io.IOException;
import java.net.SocketException;
import java.net.SocketTimeoutException;
import java.net.UnknownHostException;
import java.nio.file.InvalidPathException;
import java.security.NoSuchAlgorithmException;
import java.util.concurrent.CancellationException;
import javax.net.ssl.SSLException;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import o.BulletSpanWithLevel;
import o.getDefaultIndentationXSAIIZE;
import o.getInAppMessageAnimationFactory;
import o.getInAppMessageManagerListener;
import o.getTextLayoutInput;
import o.isItemDismissable;
import o.r8lambdafvzP3Wky1RLLzE56uVXaMHcvU;
import retrofit2.HttpException;
import timber.log.Timber;

/* JADX INFO: loaded from: classes3.dex */
public final class DownloadChatAssetsUseCase {
    private static int IconCompatParcelizer = 1;
    private static int write;
    public final getInAppMessageManagerListener RemoteActionCompatParcelizer;
    public final ChatAssetCacheManager read;
    public final getTextLayoutInput serializer;

    public DownloadChatAssetsUseCase(getTextLayoutInput gettextlayoutinput, ChatAssetCacheManager chatAssetCacheManager) {
        gettextlayoutinput.getClass();
        chatAssetCacheManager.getClass();
        this.serializer = gettextlayoutinput;
        this.read = chatAssetCacheManager;
        this.RemoteActionCompatParcelizer = getInAppMessageAnimationFactory.serializer(4);
    }

    /* JADX WARN: Code duplicated, block: B:14:0x003c  */
    /* JADX WARN: Code duplicated, block: B:53:0x00be A[RETURN] */
    /* JADX INFO: renamed from: access$downloadAndStore-0E7RQCE, reason: not valid java name */
    public static final Object m4894access$downloadAndStore0E7RQCE(DownloadChatAssetsUseCase downloadChatAssetsUseCase, getDefaultIndentationXSAIIZE getdefaultindentationxsaiize, String str, ContinuationImpl continuationImpl) throws Throwable {
        DownloadChatAssetsUseCase$downloadAndStore$1 downloadChatAssetsUseCase$downloadAndStore$1;
        isItemDismissable isitemdismissable;
        String str2;
        Object objRemoteActionCompatParcelizer;
        int i = 2 % 2;
        ChatAssetCacheManager chatAssetCacheManager = downloadChatAssetsUseCase.read;
        Object obj = null;
        if (continuationImpl instanceof DownloadChatAssetsUseCase$downloadAndStore$1) {
            int i2 = write + 33;
            IconCompatParcelizer = i2 % Fields.SpotShadowColor;
            if (i2 % 2 == 0) {
                int i3 = ((DownloadChatAssetsUseCase$downloadAndStore$1) continuationImpl).write;
                obj.hashCode();
                throw null;
            }
            downloadChatAssetsUseCase$downloadAndStore$1 = (DownloadChatAssetsUseCase$downloadAndStore$1) continuationImpl;
            int i4 = downloadChatAssetsUseCase$downloadAndStore$1.write;
            if ((i4 & Integer.MIN_VALUE) != 0) {
                int i5 = write + 119;
                IconCompatParcelizer = i5 % Fields.SpotShadowColor;
                if (i5 % 2 == 0) {
                    downloadChatAssetsUseCase$downloadAndStore$1.write = i4 >> Integer.MIN_VALUE;
                } else {
                    downloadChatAssetsUseCase$downloadAndStore$1.write = i4 - Integer.MIN_VALUE;
                }
            } else {
                downloadChatAssetsUseCase$downloadAndStore$1 = new DownloadChatAssetsUseCase$downloadAndStore$1(downloadChatAssetsUseCase, continuationImpl);
            }
        } else {
            downloadChatAssetsUseCase$downloadAndStore$1 = new DownloadChatAssetsUseCase$downloadAndStore$1(downloadChatAssetsUseCase, continuationImpl);
        }
        Object objSerializer = downloadChatAssetsUseCase$downloadAndStore$1.IconCompatParcelizer;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i6 = downloadChatAssetsUseCase$downloadAndStore$1.write;
        try {
            if (i6 == 0) {
                ExtrasKt.RemoteActionCompatParcelizer(objSerializer);
                downloadChatAssetsUseCase$downloadAndStore$1.serializer = getdefaultindentationxsaiize;
                downloadChatAssetsUseCase$downloadAndStore$1.read = str;
                downloadChatAssetsUseCase$downloadAndStore$1.write = 1;
                objSerializer = chatAssetCacheManager.serializer(getdefaultindentationxsaiize, str, downloadChatAssetsUseCase$downloadAndStore$1);
                if (objSerializer == coroutineSingletons) {
                }
                return coroutineSingletons;
            }
            int i7 = write;
            int i8 = i7 + 35;
            IconCompatParcelizer = i8 % Fields.SpotShadowColor;
            if (i8 % 2 != 0 ? i6 == 1 : i6 == 1) {
                str = downloadChatAssetsUseCase$downloadAndStore$1.read;
                getdefaultindentationxsaiize = downloadChatAssetsUseCase$downloadAndStore$1.serializer;
                ExtrasKt.RemoteActionCompatParcelizer(objSerializer);
            } else {
                if (i6 != 2) {
                    int i9 = i7 + 121;
                    IconCompatParcelizer = i9 % Fields.SpotShadowColor;
                    if (i9 % 2 != 0 ? i6 != 3 : i6 != 3) {
                        ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    getDefaultIndentationXSAIIZE getdefaultindentationxsaiize2 = downloadChatAssetsUseCase$downloadAndStore$1.serializer;
                    ExtrasKt.RemoteActionCompatParcelizer(objSerializer);
                    return objSerializer;
                }
                str2 = downloadChatAssetsUseCase$downloadAndStore$1.read;
                getdefaultindentationxsaiize = downloadChatAssetsUseCase$downloadAndStore$1.serializer;
                ExtrasKt.RemoteActionCompatParcelizer(objSerializer);
            }
            downloadChatAssetsUseCase$downloadAndStore$1.serializer = getdefaultindentationxsaiize;
            downloadChatAssetsUseCase$downloadAndStore$1.read = null;
            downloadChatAssetsUseCase$downloadAndStore$1.write = 3;
            objRemoteActionCompatParcelizer = chatAssetCacheManager.RemoteActionCompatParcelizer(getdefaultindentationxsaiize, (byte[]) objSerializer, str2, downloadChatAssetsUseCase$downloadAndStore$1);
            if (objRemoteActionCompatParcelizer != coroutineSingletons) {
                return coroutineSingletons;
            }
            return objRemoteActionCompatParcelizer;
            BulletSpanWithLevel bulletSpanWithLevel = (BulletSpanWithLevel) objSerializer;
            if (bulletSpanWithLevel != null) {
                return bulletSpanWithLevel;
            }
            getTextLayoutInput gettextlayoutinput = downloadChatAssetsUseCase.serializer;
            downloadChatAssetsUseCase$downloadAndStore$1.serializer = getdefaultindentationxsaiize;
            downloadChatAssetsUseCase$downloadAndStore$1.read = str;
            downloadChatAssetsUseCase$downloadAndStore$1.write = 2;
            objSerializer = gettextlayoutinput.read(getdefaultindentationxsaiize, downloadChatAssetsUseCase$downloadAndStore$1);
            if (objSerializer != coroutineSingletons) {
                str2 = str;
                downloadChatAssetsUseCase$downloadAndStore$1.serializer = getdefaultindentationxsaiize;
                downloadChatAssetsUseCase$downloadAndStore$1.read = null;
                downloadChatAssetsUseCase$downloadAndStore$1.write = 3;
                objRemoteActionCompatParcelizer = chatAssetCacheManager.RemoteActionCompatParcelizer(getdefaultindentationxsaiize, (byte[]) objSerializer, str2, downloadChatAssetsUseCase$downloadAndStore$1);
                if (objRemoteActionCompatParcelizer != coroutineSingletons) {
                    return objRemoteActionCompatParcelizer;
                }
            }
            return coroutineSingletons;
        } catch (ChatAssetDownloadNonRecoverableException e) {
            Timber.RemoteActionCompatParcelizer.RemoteActionCompatParcelizer(e, af$$ExternalSyntheticOutline0.m("Non-recoverable error downloading asset ", getdefaultindentationxsaiize.write, " from ", getdefaultindentationxsaiize.IconCompatParcelizer), new Object[0]);
            return new isItemDismissable(e);
        } catch (SocketException e2) {
            Timber.RemoteActionCompatParcelizer.serializer(e2, af$$ExternalSyntheticOutline0.m("Socket error downloading asset ", getdefaultindentationxsaiize.write, " from ", getdefaultindentationxsaiize.IconCompatParcelizer), new Object[0]);
            return new isItemDismissable(e2);
        } catch (IOException e3) {
            Timber.RemoteActionCompatParcelizer.serializer(e3, af$$ExternalSyntheticOutline0.m("I/O error downloading asset ", getdefaultindentationxsaiize.write, " from ", getdefaultindentationxsaiize.IconCompatParcelizer), new Object[0]);
            return new isItemDismissable(e3);
        } catch (InvalidPathException e4) {
            Timber.RemoteActionCompatParcelizer.RemoteActionCompatParcelizer(e4, ff$$ExternalSyntheticOutline0.m("Invalid path for asset ", getdefaultindentationxsaiize.write, ": corrupt SHA-256 format"), new Object[0]);
            isitemdismissable = new isItemDismissable(new ChatAssetDownloadNonRecoverableException("Invalid file path", e4));
            return isitemdismissable;
        } catch (IllegalArgumentException e5) {
            Timber.RemoteActionCompatParcelizer.RemoteActionCompatParcelizer(e5, af$$ExternalSyntheticOutline0.m("Invalid data for asset ", getdefaultindentationxsaiize.write, " from ", getdefaultindentationxsaiize.IconCompatParcelizer), new Object[0]);
            isitemdismissable = new isItemDismissable(new ChatAssetDownloadNonRecoverableException("Invalid asset data", e5));
            return isitemdismissable;
        } catch (SocketTimeoutException e6) {
            Timber.RemoteActionCompatParcelizer.serializer(e6, af$$ExternalSyntheticOutline0.m("Socket timeout downloading asset ", getdefaultindentationxsaiize.write, " from ", getdefaultindentationxsaiize.IconCompatParcelizer), new Object[0]);
            isItemDismissable isitemdismissable2 = new isItemDismissable(e6);
            int i10 = IconCompatParcelizer + 35;
            write = i10 % Fields.SpotShadowColor;
            int i11 = i10 % 2;
            return isitemdismissable2;
        } catch (UnknownHostException e7) {
            Timber.RemoteActionCompatParcelizer.serializer(e7, af$$ExternalSyntheticOutline0.m("DNS resolution failed for asset ", getdefaultindentationxsaiize.write, " from ", getdefaultindentationxsaiize.IconCompatParcelizer), new Object[0]);
            return new isItemDismissable(e7);
        } catch (NoSuchAlgorithmException e8) {
            Timber.RemoteActionCompatParcelizer.RemoteActionCompatParcelizer(e8, r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.serializer("SHA-256 algorithm unavailable for asset ", getdefaultindentationxsaiize.write), new Object[0]);
            isitemdismissable = new isItemDismissable(new ChatAssetDownloadNonRecoverableException("SHA-256 unavailable", e8));
            return isitemdismissable;
        } catch (CancellationException e9) {
            throw e9;
        } catch (SSLException e10) {
            Timber.RemoteActionCompatParcelizer.serializer(e10, af$$ExternalSyntheticOutline0.m("SSL error downloading asset ", getdefaultindentationxsaiize.write, " from ", getdefaultindentationxsaiize.IconCompatParcelizer), new Object[0]);
            isItemDismissable isitemdismissable3 = new isItemDismissable(e10);
            int i12 = IconCompatParcelizer + 123;
            write = i12 % Fields.SpotShadowColor;
            int i13 = i12 % 2;
            return isitemdismissable3;
        } catch (HttpException e11) {
            if (zzpd.read(e11)) {
                Timber.RemoteActionCompatParcelizer.serializer(e11, af$$ExternalSyntheticOutline0.m("Recoverable HTTP error downloading asset ", getdefaultindentationxsaiize.write, " from ", getdefaultindentationxsaiize.IconCompatParcelizer), new Object[0]);
                return new isItemDismissable(e11);
            }
            Timber.RemoteActionCompatParcelizer.RemoteActionCompatParcelizer(e11, af$$ExternalSyntheticOutline0.m("Non-recoverable HTTP error downloading asset ", getdefaultindentationxsaiize.write, " from ", getdefaultindentationxsaiize.IconCompatParcelizer), new Object[0]);
            isitemdismissable = new isItemDismissable(new ChatAssetDownloadNonRecoverableException(null, e11, 1));
            return isitemdismissable;
        } catch (Exception e12) {
            Timber.RemoteActionCompatParcelizer.serializer(e12, af$$ExternalSyntheticOutline0.m("Unexpected error downloading asset ", getdefaultindentationxsaiize.write, " from ", getdefaultindentationxsaiize.IconCompatParcelizer), new Object[0]);
            return new isItemDismissable(e12);
        }
    }

    /* JADX WARN: Code duplicated, block: B:100:0x025c  */
    /* JADX WARN: Code duplicated, block: B:7:0x0027  */
    /* JADX WARN: Code restructure failed: missing block: B:102:0x026a, code lost:
    
        if (r14.pruneStaleReleasesExcept(r0, r10) == r11) goto L103;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v22 */
    /* JADX WARN: Type inference failed for: r2v33 */
    /* JADX WARN: Type inference failed for: r2v34 */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invoke(o.findFollowingBreak r20, java.lang.String r21, java.util.List r22, kotlin.coroutines.jvm.internal.ContinuationImpl r23) {
        /*
            Method dump skipped, instruction units count: 767
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.roadrunner.customerchat.selfservice.domain.asset.DownloadChatAssetsUseCase.invoke(o.findFollowingBreak, java.lang.String, java.util.List, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }
}
