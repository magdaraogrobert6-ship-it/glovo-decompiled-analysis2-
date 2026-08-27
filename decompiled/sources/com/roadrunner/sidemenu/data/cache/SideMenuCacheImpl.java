package com.roadrunner.sidemenu.data.cache;

import android.content.Context;
import android.graphics.Typeface;
import androidx.compose.foundation.text.CoreTextFieldKt$TextFieldCursorHandle$2$1$1$1;
import androidx.compose.foundation.text.selection.TextFieldSelectionManager;
import androidx.compose.material3.ModalBottomSheetKt$ModalBottomSheet$5$1;
import androidx.compose.material3.SheetState;
import androidx.compose.ui.graphics.Fields;
import androidx.compose.ui.input.pointer.PointerInputScope;
import androidx.lifecycle.BlockRunner;
import androidx.lifecycle.BlockRunner$maybeRun$1;
import bo.app.af$$ExternalSyntheticOutline0;
import bo.app.c8$$ExternalSyntheticOutline0;
import coil3.ExtrasKt;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import com.mapbox.maps.plugin.locationcomponent.LocationComponentPluginImpl;
import com.mapbox.navigation.core.MapboxNavigation;
import com.roadrunner.auth.data.SignInDataStore$clear$2;
import com.roadrunner.customerchat.selfservice.data.cache.ChatAssetCacheManager;
import com.roadrunner.customerchat.selfservice.data.cache.server.ChatAssetCacheLocalWebServer;
import com.roadrunner.customerchat.selfservice.domain.asset.ChatAssetDownloadNonRecoverableException;
import com.roadrunner.map.integration.mapbox.navigation.MapNavigationImpl;
import com.roadrunner.map.integration.mapbox.navigation.MapNavigationImpl$processFlows$1$1$1$1;
import com.roadrunner.realtime.data.ReconnectScheduler$schedule$1;
import com.roadrunner.realtime.domain.GetAppStateImpl$invoke$$inlined$map$1;
import com.sentiance.core.model.events.N$b;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.EOFException;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.SocketException;
import java.net.SocketTimeoutException;
import java.nio.file.Files;
import java.nio.file.StandardCopyOption;
import java.security.MessageDigest;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.SharedFlowImpl;
import kotlinx.serialization.SerializationException;
import o.AlignmentHorizontal;
import o.AnnotatedStringBuilderBulletScope;
import o.AnnotatedStringBuilderMutableRangeCompanion;
import o.BulletSpanWithLevel;
import o.DrawableTransformation;
import o.PopulateViewStructure_androidKtpopulate7;
import o.SelectionMagnifierKt;
import o.ShortNewsContentCardView;
import o.StrokeJoinCompanion;
import o.accessgetAltRightcp;
import o.accessgetTextCentercp;
import o.backwardFocusSearch;
import o.buildSessionPackage;
import o.createFromParcel;
import o.createInAppMessageEventSubscriber;
import o.fromRange;
import o.getBuilderui_text;
import o.getCieXyz;
import o.getContentViewGroupParentLayout;
import o.getD50Xyzui_graphics;
import o.getDefaultIndentationXSAIIZE;
import o.getDriver;
import o.getInvalidationTracker;
import o.getItem;
import o.getMiterLxFBmk8;
import o.getName;
import o.getPositionInRoot;
import o.getRoundLxFBmk8;
import o.getUseTempTrackingTableroom_runtime;
import o.hideCurrentlyDisplayingInAppMessage;
import o.isRoot;
import o.isVerticalSwipeInAllowedDirection;
import o.le;
import o.onContentCardClicked;
import o.pauseWebviewIfNecessarylambda10;
import o.performCustomExitMxy_nc0;
import o.pushUrlAnnotation;
import o.r8lambda7AJnrvTmYNN7kSbgXUEYtB0Niyw;
import o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0;
import o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM;
import o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0;
import o.r8lambdafvzP3Wky1RLLzE56uVXaMHcvU;
import o.r8lambdagskXZWXAywZBpuMlyibFzaBUyes;
import o.r8lambdah58aXmhhQAgDkycgUejmT5u6E;
import o.r8lambdahA_Tal7rtdMP7Bv9IDcuwYDoHo;
import o.r8lambdakQbp11wZ4ZjRP1b2DHSZXunsBM;
import o.removeNodeAtDepth;
import o.resetTransientState;
import o.setGraphicModalMaxWidthDp;
import o.setSuccessfulruntime;
import o.sourceInformationContextOfdefault;
import o.toRange;
import o.toRangedefault;
import okio.Path$Companion;
import timber.log.Timber;

/* JADX INFO: loaded from: classes3.dex */
public final class SideMenuCacheImpl {
    private static int IconCompatParcelizer = 1;
    private static int read;
    public final buildSessionPackage serializer;

    /* JADX INFO: renamed from: com.roadrunner.sidemenu.data.cache.SideMenuCacheImpl$set$2, reason: invalid class name */
    public final class AnonymousClass2 extends SuspendLambda implements r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 {
        private static int MediaMetadataCompat = 1;
        private static int RatingCompat;
        public final /* synthetic */ Object IconCompatParcelizer;
        public final /* synthetic */ int RemoteActionCompatParcelizer;
        public final /* synthetic */ Object read;
        public /* synthetic */ Object serializer;
        public final /* synthetic */ Object write;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public /* synthetic */ AnonymousClass2(Object obj, Object obj2, Object obj3, Object obj4, ShortNewsContentCardView shortNewsContentCardView, int i) {
            super(2, shortNewsContentCardView);
            this.RemoteActionCompatParcelizer = i;
            this.serializer = obj;
            this.IconCompatParcelizer = obj2;
            this.write = obj3;
            this.read = obj4;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws IOException, ChatAssetDownloadNonRecoverableException {
            int i;
            pushUrlAnnotation pushurlannotationWrite;
            int i2 = 0;
            ShortNewsContentCardView shortNewsContentCardView = null;
            switch (this.RemoteActionCompatParcelizer) {
                case 0:
                    backwardFocusSearch backwardfocussearch = (backwardFocusSearch) this.serializer;
                    CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                    ExtrasKt.RemoteActionCompatParcelizer(obj);
                    SideMenuCacheImpl sideMenuCacheImpl = (SideMenuCacheImpl) this.IconCompatParcelizer;
                    r8lambdakQbp11wZ4ZjRP1b2DHSZXunsBM r8lambdakqbp11wz4zjrp1b2dhszxunsbm = (r8lambdakQbp11wZ4ZjRP1b2DHSZXunsBM) this.write;
                    sideMenuCacheImpl.getClass();
                    isVerticalSwipeInAllowedDirection isverticalswipeinalloweddirection = resetTransientState.read;
                    isverticalswipeinalloweddirection.getClass();
                    backwardfocussearch.write((isRoot) this.read, isverticalswipeinalloweddirection.RemoteActionCompatParcelizer(r8lambdakQbp11wZ4ZjRP1b2DHSZXunsBM.Companion.serializer(), r8lambdakqbp11wz4zjrp1b2dhszxunsbm));
                    return createFromParcel.INSTANCE;
                case 1:
                    CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    ExtrasKt.RemoteActionCompatParcelizer(obj);
                    getContentViewGroupParentLayout getcontentviewgroupparentlayout = (getContentViewGroupParentLayout) this.serializer;
                    CoroutineStart coroutineStart = CoroutineStart.UNDISPATCHED;
                    PointerInputScope pointerInputScope = (PointerInputScope) this.IconCompatParcelizer;
                    BuildersKt.RemoteActionCompatParcelizer(getcontentviewgroupparentlayout, null, coroutineStart, new CoreTextFieldKt$TextFieldCursorHandle$2$1$1$1(pointerInputScope, (AlignmentHorizontal) this.write, shortNewsContentCardView, i2), 1);
                    BuildersKt.RemoteActionCompatParcelizer(getcontentviewgroupparentlayout, null, coroutineStart, new BlockRunner$maybeRun$1(pointerInputScope, (TextFieldSelectionManager) this.read, shortNewsContentCardView, 13), 1);
                    return createFromParcel.INSTANCE;
                case 2:
                    CoroutineSingletons coroutineSingletons3 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    ExtrasKt.RemoteActionCompatParcelizer(obj);
                    for (getName getname : ((StrokeJoinCompanion) this.serializer).serializer.values()) {
                        Context context = (Context) this.IconCompatParcelizer;
                        getname.getClass();
                        String str = getname.read;
                        String str2 = (String) this.write;
                        String str3 = (String) this.read;
                        String str4 = getname.serializer;
                        try {
                            Typeface typefaceCreateFromAsset = Typeface.createFromAsset(context.getAssets(), af$$ExternalSyntheticOutline0.m(str2, str, str3));
                            try {
                                typefaceCreateFromAsset.getClass();
                                str4.getClass();
                                boolean zIconCompatParcelizer = hideCurrentlyDisplayingInAppMessage.IconCompatParcelizer((CharSequence) str4, (CharSequence) "Italic", false);
                                boolean zIconCompatParcelizer2 = hideCurrentlyDisplayingInAppMessage.IconCompatParcelizer((CharSequence) str4, (CharSequence) "Bold", false);
                                if (zIconCompatParcelizer && zIconCompatParcelizer2) {
                                    i = 3;
                                } else if (zIconCompatParcelizer) {
                                    i = 2;
                                } else {
                                    i = zIconCompatParcelizer2 ? 1 : 0;
                                }
                                if (typefaceCreateFromAsset.getStyle() != i) {
                                    typefaceCreateFromAsset = Typeface.create(typefaceCreateFromAsset, i);
                                }
                                getname.RemoteActionCompatParcelizer = typefaceCreateFromAsset;
                            } catch (Exception unused) {
                                getD50Xyzui_graphics.write.getClass();
                                getMiterLxFBmk8 getmiterlxfbmk8 = getRoundLxFBmk8.read;
                            }
                        } catch (Exception unused2) {
                            getD50Xyzui_graphics.write.getClass();
                            getMiterLxFBmk8 getmiterlxfbmk9 = getRoundLxFBmk8.read;
                        }
                    }
                    return createFromParcel.INSTANCE;
                case 3:
                    backwardFocusSearch backwardfocussearch2 = (backwardFocusSearch) this.serializer;
                    CoroutineSingletons coroutineSingletons4 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    ExtrasKt.RemoteActionCompatParcelizer(obj);
                    isRoot isroot = (isRoot) this.read;
                    Object objSerializer = backwardfocussearch2.serializer(isroot);
                    if (objSerializer == null) {
                        backwardfocussearch2.serializer(isroot, this.IconCompatParcelizer);
                    } else {
                        ((createInAppMessageEventSubscriber) this.write).IconCompatParcelizer = objSerializer;
                    }
                    return createFromParcel.INSTANCE;
                case 4:
                    ChatAssetCacheManager chatAssetCacheManager = (ChatAssetCacheManager) this.IconCompatParcelizer;
                    getDefaultIndentationXSAIIZE getdefaultindentationxsaiize = (getDefaultIndentationXSAIIZE) this.write;
                    CoroutineSingletons coroutineSingletons5 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    ExtrasKt.RemoteActionCompatParcelizer(obj);
                    byte[] bArr = (byte[]) this.serializer;
                    if (bArr.length == 0) {
                        DrawableTransformation.serializer((Object) r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.serializer("Cannot cache empty asset: ", getdefaultindentationxsaiize.write));
                        return null;
                    }
                    byte[] bArrDigest = MessageDigest.getInstance("SHA-256").digest(bArr);
                    bArrDigest.getClass();
                    String strIconCompatParcelizer = onContentCardClicked.IconCompatParcelizer(bArrDigest, new accessgetTextCentercp(7));
                    if (!strIconCompatParcelizer.equals(getdefaultindentationxsaiize.RemoteActionCompatParcelizer)) {
                        StringBuilder sbM = c8$$ExternalSyntheticOutline0.m("SHA-256 mismatch for chat asset ", getdefaultindentationxsaiize.write, ": expected ", getdefaultindentationxsaiize.RemoteActionCompatParcelizer, ", actual ");
                        sbM.append(strIconCompatParcelizer);
                        ChatAssetDownloadNonRecoverableException chatAssetDownloadNonRecoverableException = new ChatAssetDownloadNonRecoverableException(sbM.toString(), null, 2);
                        Timber.RemoteActionCompatParcelizer.RemoteActionCompatParcelizer(chatAssetDownloadNonRecoverableException, "Chat asset SHA-256 verification failed", new Object[0]);
                        throw chatAssetDownloadNonRecoverableException;
                    }
                    File fileIconCompatParcelizer = ChatAssetCacheManager.IconCompatParcelizer(chatAssetCacheManager, (String) this.read);
                    File file = new File(fileIconCompatParcelizer, ChatAssetCacheManager.read(chatAssetCacheManager, getdefaultindentationxsaiize));
                    File file2 = new File(fileIconCompatParcelizer, r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.RemoteActionCompatParcelizer(file.getName(), ".tmp"));
                    FileOutputStream fileOutputStreamWrite = getPositionInRoot.write(new FileOutputStream(file2), file2);
                    try {
                        fileOutputStreamWrite.write(bArr);
                        fileOutputStreamWrite.close();
                        Files.move(file2.toPath(), file.toPath(), StandardCopyOption.REPLACE_EXISTING);
                        String absolutePath = file.getAbsolutePath();
                        absolutePath.getClass();
                        return new BulletSpanWithLevel(getdefaultindentationxsaiize, absolutePath);
                    } catch (Throwable th) {
                        try {
                            throw th;
                        } catch (Throwable th2) {
                            r8lambda7AJnrvTmYNN7kSbgXUEYtB0Niyw.IconCompatParcelizer(871780641, sourceInformationContextOfdefault.read(), sourceInformationContextOfdefault.read(), -871780639, sourceInformationContextOfdefault.read(), new Object[]{fileOutputStreamWrite, th}, sourceInformationContextOfdefault.read());
                            throw th2;
                        }
                    }
                case 5:
                    CoroutineSingletons coroutineSingletons6 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    ExtrasKt.RemoteActionCompatParcelizer(obj);
                    ChatAssetCacheLocalWebServer chatAssetCacheLocalWebServer = (ChatAssetCacheLocalWebServer) this.serializer;
                    Socket socket = (Socket) this.IconCompatParcelizer;
                    socket.getClass();
                    BlockRunner blockRunner = (BlockRunner) this.write;
                    String str5 = (String) this.read;
                    SharedFlowImpl sharedFlowImpl = chatAssetCacheLocalWebServer.IconCompatParcelizer;
                    ConcurrentHashMap.KeySetView keySetView = chatAssetCacheLocalWebServer.read;
                    try {
                        try {
                            try {
                                socket.setSoTimeout(5000);
                                try {
                                    BufferedInputStream bufferedInputStream = new BufferedInputStream(socket.getInputStream());
                                    BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(socket.getOutputStream());
                                    do {
                                        pushurlannotationWrite = chatAssetCacheLocalWebServer.RatingCompat.write(bufferedInputStream, bufferedOutputStream, blockRunner, str5);
                                        if (pushurlannotationWrite instanceof getBuilderui_text) {
                                            bufferedOutputStream.flush();
                                            toRange torange = ((getBuilderui_text) pushurlannotationWrite).IconCompatParcelizer;
                                            if (!(torange instanceof toRangedefault)) {
                                                if (torange instanceof getItem) {
                                                    sharedFlowImpl.write(((getItem) torange).read);
                                                } else if (torange instanceof AnnotatedStringBuilderMutableRangeCompanion) {
                                                    sharedFlowImpl.write(((AnnotatedStringBuilderMutableRangeCompanion) torange).write);
                                                } else if (!(torange instanceof fromRange)) {
                                                    throw new NoWhenBranchMatchedException();
                                                }
                                            }
                                        } else {
                                            if (!(pushurlannotationWrite instanceof AnnotatedStringBuilderBulletScope)) {
                                                throw new NoWhenBranchMatchedException();
                                            }
                                            Throwable thSerializer = ((AnnotatedStringBuilderBulletScope) pushurlannotationWrite).serializer();
                                            if (!(thSerializer instanceof SocketTimeoutException) && !(thSerializer instanceof SocketException) && !(thSerializer instanceof EOFException)) {
                                                Timber.RemoteActionCompatParcelizer.write(((AnnotatedStringBuilderBulletScope) pushurlannotationWrite).serializer());
                                            }
                                        }
                                        socket.close();
                                        keySetView.remove(socket);
                                        return createFromParcel.INSTANCE;
                                    } while (((getBuilderui_text) pushurlannotationWrite).RemoteActionCompatParcelizer);
                                    socket.close();
                                } catch (Throwable th3) {
                                    try {
                                        throw th3;
                                    } catch (Throwable th4) {
                                        r8lambda7AJnrvTmYNN7kSbgXUEYtB0Niyw.IconCompatParcelizer(871780641, sourceInformationContextOfdefault.read(), sourceInformationContextOfdefault.read(), -871780639, sourceInformationContextOfdefault.read(), new Object[]{socket, th3}, sourceInformationContextOfdefault.read());
                                        throw th4;
                                    }
                                }
                            } catch (Throwable th5) {
                                keySetView.remove(socket);
                                throw th5;
                            }
                        } catch (Exception e) {
                            Timber.RemoteActionCompatParcelizer.RemoteActionCompatParcelizer(e, "Chat asset local web server failed to serve a connection", new Object[0]);
                        }
                    } catch (SocketException unused3) {
                    } catch (IOException e2) {
                        Timber.RemoteActionCompatParcelizer.RemoteActionCompatParcelizer(e2, "Chat asset local web server failed while serving a connection", new Object[0]);
                    }
                    keySetView.remove(socket);
                    return createFromParcel.INSTANCE;
                case 6:
                    CoroutineSingletons coroutineSingletons7 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    ExtrasKt.RemoteActionCompatParcelizer(obj);
                    try {
                        ChatAssetCacheLocalWebServer.read((ChatAssetCacheLocalWebServer) this.serializer, (ServerSocket) this.IconCompatParcelizer, (BlockRunner) this.write, (String) this.read);
                        ChatAssetCacheLocalWebServer chatAssetCacheLocalWebServer2 = (ChatAssetCacheLocalWebServer) this.serializer;
                        Object obj2 = chatAssetCacheLocalWebServer2.MediaSessionCompatResultReceiverWrapper;
                        ServerSocket serverSocket = (ServerSocket) this.IconCompatParcelizer;
                        synchronized (obj2) {
                            if (chatAssetCacheLocalWebServer2.PlaybackStateCompatCustomAction == serverSocket) {
                                chatAssetCacheLocalWebServer2.PlaybackStateCompatCustomAction = null;
                                chatAssetCacheLocalWebServer2.write = null;
                                chatAssetCacheLocalWebServer2.MediaMetadataCompat = null;
                                chatAssetCacheLocalWebServer2.MediaSessionCompatQueueItem = null;
                            }
                            break;
                        }
                        return createFromParcel.INSTANCE;
                    } catch (Throwable th6) {
                        ChatAssetCacheLocalWebServer chatAssetCacheLocalWebServer3 = (ChatAssetCacheLocalWebServer) this.serializer;
                        Object obj3 = chatAssetCacheLocalWebServer3.MediaSessionCompatResultReceiverWrapper;
                        ServerSocket serverSocket2 = (ServerSocket) this.IconCompatParcelizer;
                        synchronized (obj3) {
                            if (chatAssetCacheLocalWebServer3.PlaybackStateCompatCustomAction == serverSocket2) {
                                chatAssetCacheLocalWebServer3.PlaybackStateCompatCustomAction = null;
                                chatAssetCacheLocalWebServer3.write = null;
                                chatAssetCacheLocalWebServer3.MediaMetadataCompat = null;
                                chatAssetCacheLocalWebServer3.MediaSessionCompatQueueItem = null;
                                break;
                            }
                            throw th6;
                        }
                    }
                case 7:
                    CoroutineSingletons coroutineSingletons8 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    ExtrasKt.RemoteActionCompatParcelizer(obj);
                    accessgetAltRightcp accessgetaltrightcp = (accessgetAltRightcp) this.serializer;
                    i2 = accessgetaltrightcp.write().size() == accessgetaltrightcp.serializer().size() ? 1 : 0;
                    if (((getUseTempTrackingTableroom_runtime) this.IconCompatParcelizer) == getUseTempTrackingTableroom_runtime.REQUEST_PERMISSION && !accessgetaltrightcp.read()) {
                        if (accessgetaltrightcp.IconCompatParcelizer() || i2 == 0) {
                            ((r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) this.write).invoke();
                        } else {
                            ((r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) this.read).invoke();
                        }
                    }
                    return createFromParcel.INSTANCE;
                case 8:
                    backwardFocusSearch backwardfocussearch3 = (backwardFocusSearch) this.serializer;
                    CoroutineSingletons coroutineSingletons9 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    ExtrasKt.RemoteActionCompatParcelizer(obj);
                    isRoot isroot2 = (isRoot) this.read;
                    N$b n$b = (N$b) this.IconCompatParcelizer;
                    setSuccessfulruntime setsuccessfulruntime = (setSuccessfulruntime) this.write;
                    n$b.getClass();
                    isVerticalSwipeInAllowedDirection isverticalswipeinalloweddirection2 = resetTransientState.read;
                    isverticalswipeinalloweddirection2.getClass();
                    backwardfocussearch3.write(isroot2, isverticalswipeinalloweddirection2.RemoteActionCompatParcelizer(setSuccessfulruntime.Companion.serializer(), setsuccessfulruntime));
                    return createFromParcel.INSTANCE;
                case 9:
                    le leVar = (le) this.serializer;
                    CoroutineSingletons coroutineSingletons10 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    ExtrasKt.RemoteActionCompatParcelizer(obj);
                    MapboxNavigation mapboxNavigation = leVar.write;
                    MapNavigationImpl mapNavigationImpl = (MapNavigationImpl) this.IconCompatParcelizer;
                    Path$Companion path$Companion = mapNavigationImpl.ParcelableVolumeInfo;
                    mapboxNavigation.getClass();
                    getContentViewGroupParentLayout getcontentviewgroupparentlayout2 = (getContentViewGroupParentLayout) this.write;
                    BuildersKt.RemoteActionCompatParcelizer(getcontentviewgroupparentlayout2, null, null, new MapNavigationImpl$processFlows$1$1$1$1(mapNavigationImpl, mapboxNavigation, shortNewsContentCardView, i2), 3);
                    BuildersKt.RemoteActionCompatParcelizer(getcontentviewgroupparentlayout2, null, null, new ReconnectScheduler$schedule$1(mapNavigationImpl, mapboxNavigation, (LocationComponentPluginImpl) this.read, null, 18), 3);
                    return createFromParcel.INSTANCE;
                default:
                    CoroutineSingletons coroutineSingletons11 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    ExtrasKt.RemoteActionCompatParcelizer(obj);
                    if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{(getInvalidationTracker) ((PopulateViewStructure_androidKtpopulate7) this.IconCompatParcelizer).getValue(), getDriver.RemoteActionCompatParcelizer}, getCieXyz.write())).booleanValue()) {
                        int i3 = 16;
                        BuildersKt.RemoteActionCompatParcelizer((getContentViewGroupParentLayout) this.serializer, null, null, new ModalBottomSheetKt$ModalBottomSheet$5$1((SheetState) this.write, shortNewsContentCardView, i3), 3).IconCompatParcelizer((r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) new SelectionMagnifierKt((PopulateViewStructure_androidKtpopulate7) this.read, i3));
                    }
                    return createFromParcel.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public /* synthetic */ AnonymousClass2(isRoot isroot, Object obj, Object obj2, ShortNewsContentCardView shortNewsContentCardView, int i) {
            super(2, shortNewsContentCardView);
            this.RemoteActionCompatParcelizer = i;
            this.read = isroot;
            this.IconCompatParcelizer = obj;
            this.write = obj2;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public /* synthetic */ AnonymousClass2(Object obj, Object obj2, Object obj3, ShortNewsContentCardView shortNewsContentCardView, int i) {
            super(2, shortNewsContentCardView);
            this.RemoteActionCompatParcelizer = i;
            this.IconCompatParcelizer = obj;
            this.write = obj2;
            this.read = obj3;
        }

        @Override // o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0
        public final Object invoke(Object obj, Object obj2) throws IOException, ChatAssetDownloadNonRecoverableException {
            int i = 2 % 2;
            int i2 = this.RemoteActionCompatParcelizer;
            createFromParcel createfromparcel = createFromParcel.INSTANCE;
            switch (i2) {
                case 0:
                    ((AnonymousClass2) create((backwardFocusSearch) obj, (ShortNewsContentCardView) obj2)).invokeSuspend(createfromparcel);
                    return createfromparcel;
                case 1:
                    ((AnonymousClass2) create((getContentViewGroupParentLayout) obj, (ShortNewsContentCardView) obj2)).invokeSuspend(createfromparcel);
                    return createfromparcel;
                case 2:
                    ((AnonymousClass2) create((getContentViewGroupParentLayout) obj, (ShortNewsContentCardView) obj2)).invokeSuspend(createfromparcel);
                    return createfromparcel;
                case 3:
                    ((AnonymousClass2) create((backwardFocusSearch) obj, (ShortNewsContentCardView) obj2)).invokeSuspend(createfromparcel);
                    int i3 = MediaMetadataCompat + 61;
                    RatingCompat = i3 % Fields.SpotShadowColor;
                    int i4 = i3 % 2;
                    return createfromparcel;
                case 4:
                    return ((AnonymousClass2) create((getContentViewGroupParentLayout) obj, (ShortNewsContentCardView) obj2)).invokeSuspend(createfromparcel);
                case 5:
                    ((AnonymousClass2) create((getContentViewGroupParentLayout) obj, (ShortNewsContentCardView) obj2)).invokeSuspend(createfromparcel);
                    return createfromparcel;
                case 6:
                    ((AnonymousClass2) create((getContentViewGroupParentLayout) obj, (ShortNewsContentCardView) obj2)).invokeSuspend(createfromparcel);
                    int i5 = RatingCompat + 81;
                    MediaMetadataCompat = i5 % Fields.SpotShadowColor;
                    if (i5 % 2 != 0) {
                        return createfromparcel;
                    }
                    throw null;
                case 7:
                    ((AnonymousClass2) create((getContentViewGroupParentLayout) obj, (ShortNewsContentCardView) obj2)).invokeSuspend(createfromparcel);
                    return createfromparcel;
                case 8:
                    ((AnonymousClass2) create((backwardFocusSearch) obj, (ShortNewsContentCardView) obj2)).invokeSuspend(createfromparcel);
                    return createfromparcel;
                case 9:
                    ((AnonymousClass2) create((le) obj, (ShortNewsContentCardView) obj2)).invokeSuspend(createfromparcel);
                    int i6 = MediaMetadataCompat + 93;
                    RatingCompat = i6 % Fields.SpotShadowColor;
                    int i7 = i6 % 2;
                    return createfromparcel;
                default:
                    ((AnonymousClass2) create((getContentViewGroupParentLayout) obj, (ShortNewsContentCardView) obj2)).invokeSuspend(createfromparcel);
                    return createfromparcel;
            }
        }

        /* JADX WARN: Code duplicated, block: B:10:0x002c A[PHI: r2 r3 r4
  0x002c: PHI (r2v11 java.lang.Object) = (r2v1 java.lang.Object), (r2v12 java.lang.Object) binds: [B:8:0x0027, B:5:0x001a] A[DONT_GENERATE, DONT_INLINE]
  0x002c: PHI (r3v11 java.lang.Object) = (r3v0 java.lang.Object), (r3v12 java.lang.Object) binds: [B:8:0x0027, B:5:0x001a] A[DONT_GENERATE, DONT_INLINE]
  0x002c: PHI (r4v11 java.lang.Object) = (r4v0 java.lang.Object), (r4v12 java.lang.Object) binds: [B:8:0x0027, B:5:0x001a] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Code duplicated, block: B:12:0x0041 A[PHI: r2 r3 r4
  0x0041: PHI (r2v10 java.lang.Object) = (r2v1 java.lang.Object), (r2v12 java.lang.Object) binds: [B:8:0x0027, B:5:0x001a] A[DONT_GENERATE, DONT_INLINE]
  0x0041: PHI (r3v10 java.lang.Object) = (r3v0 java.lang.Object), (r3v12 java.lang.Object) binds: [B:8:0x0027, B:5:0x001a] A[DONT_GENERATE, DONT_INLINE]
  0x0041: PHI (r4v10 java.lang.Object) = (r4v0 java.lang.Object), (r4v12 java.lang.Object) binds: [B:8:0x0027, B:5:0x001a] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Code duplicated, block: B:14:0x0056 A[PHI: r2 r3 r4
  0x0056: PHI (r2v9 java.lang.Object) = (r2v1 java.lang.Object), (r2v12 java.lang.Object) binds: [B:8:0x0027, B:5:0x001a] A[DONT_GENERATE, DONT_INLINE]
  0x0056: PHI (r3v9 java.lang.Object) = (r3v0 java.lang.Object), (r3v12 java.lang.Object) binds: [B:8:0x0027, B:5:0x001a] A[DONT_GENERATE, DONT_INLINE]
  0x0056: PHI (r4v9 java.lang.Object) = (r4v0 java.lang.Object), (r4v12 java.lang.Object) binds: [B:8:0x0027, B:5:0x001a] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Code duplicated, block: B:16:0x006d A[PHI: r2 r3 r4
  0x006d: PHI (r2v8 java.lang.Object) = (r2v1 java.lang.Object), (r2v12 java.lang.Object) binds: [B:8:0x0027, B:5:0x001a] A[DONT_GENERATE, DONT_INLINE]
  0x006d: PHI (r3v8 java.lang.Object) = (r3v0 java.lang.Object), (r3v12 java.lang.Object) binds: [B:8:0x0027, B:5:0x001a] A[DONT_GENERATE, DONT_INLINE]
  0x006d: PHI (r4v8 java.lang.Object) = (r4v0 java.lang.Object), (r4v12 java.lang.Object) binds: [B:8:0x0027, B:5:0x001a] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Code duplicated, block: B:18:0x0084 A[PHI: r2 r3 r4
  0x0084: PHI (r2v7 java.lang.Object) = (r2v1 java.lang.Object), (r2v12 java.lang.Object) binds: [B:8:0x0027, B:5:0x001a] A[DONT_GENERATE, DONT_INLINE]
  0x0084: PHI (r3v7 java.lang.Object) = (r3v0 java.lang.Object), (r3v12 java.lang.Object) binds: [B:8:0x0027, B:5:0x001a] A[DONT_GENERATE, DONT_INLINE]
  0x0084: PHI (r4v7 java.lang.Object) = (r4v0 java.lang.Object), (r4v12 java.lang.Object) binds: [B:8:0x0027, B:5:0x001a] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Code duplicated, block: B:20:0x009b A[PHI: r2 r3 r4
  0x009b: PHI (r2v6 java.lang.Object) = (r2v1 java.lang.Object), (r2v12 java.lang.Object) binds: [B:8:0x0027, B:5:0x001a] A[DONT_GENERATE, DONT_INLINE]
  0x009b: PHI (r3v6 java.lang.Object) = (r3v0 java.lang.Object), (r3v12 java.lang.Object) binds: [B:8:0x0027, B:5:0x001a] A[DONT_GENERATE, DONT_INLINE]
  0x009b: PHI (r4v6 java.lang.Object) = (r4v0 java.lang.Object), (r4v12 java.lang.Object) binds: [B:8:0x0027, B:5:0x001a] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Code duplicated, block: B:22:0x00b2 A[PHI: r3 r4
  0x00b2: PHI (r3v5 java.lang.Object) = (r3v0 java.lang.Object), (r3v12 java.lang.Object) binds: [B:8:0x0027, B:5:0x001a] A[DONT_GENERATE, DONT_INLINE]
  0x00b2: PHI (r4v5 java.lang.Object) = (r4v0 java.lang.Object), (r4v12 java.lang.Object) binds: [B:8:0x0027, B:5:0x001a] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Code duplicated, block: B:24:0x00c5 A[PHI: r2 r3 r4
  0x00c5: PHI (r2v5 java.lang.Object) = (r2v1 java.lang.Object), (r2v12 java.lang.Object) binds: [B:8:0x0027, B:5:0x001a] A[DONT_GENERATE, DONT_INLINE]
  0x00c5: PHI (r3v4 java.lang.Object) = (r3v0 java.lang.Object), (r3v12 java.lang.Object) binds: [B:8:0x0027, B:5:0x001a] A[DONT_GENERATE, DONT_INLINE]
  0x00c5: PHI (r4v4 java.lang.Object) = (r4v0 java.lang.Object), (r4v12 java.lang.Object) binds: [B:8:0x0027, B:5:0x001a] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Code duplicated, block: B:26:0x00dc A[PHI: r2 r3 r4
  0x00dc: PHI (r2v4 java.lang.Object) = (r2v1 java.lang.Object), (r2v12 java.lang.Object) binds: [B:8:0x0027, B:5:0x001a] A[DONT_GENERATE, DONT_INLINE]
  0x00dc: PHI (r3v3 java.lang.Object) = (r3v0 java.lang.Object), (r3v12 java.lang.Object) binds: [B:8:0x0027, B:5:0x001a] A[DONT_GENERATE, DONT_INLINE]
  0x00dc: PHI (r4v3 java.lang.Object) = (r4v0 java.lang.Object), (r4v12 java.lang.Object) binds: [B:8:0x0027, B:5:0x001a] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Code duplicated, block: B:28:0x00f0 A[PHI: r2 r3 r4
  0x00f0: PHI (r2v3 java.lang.Object) = (r2v1 java.lang.Object), (r2v12 java.lang.Object) binds: [B:8:0x0027, B:5:0x001a] A[DONT_GENERATE, DONT_INLINE]
  0x00f0: PHI (r3v2 java.lang.Object) = (r3v0 java.lang.Object), (r3v12 java.lang.Object) binds: [B:8:0x0027, B:5:0x001a] A[DONT_GENERATE, DONT_INLINE]
  0x00f0: PHI (r4v2 java.lang.Object) = (r4v0 java.lang.Object), (r4v12 java.lang.Object) binds: [B:8:0x0027, B:5:0x001a] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Code duplicated, block: B:30:0x0104 A[PHI: r2 r3 r4
  0x0104: PHI (r2v2 java.lang.Object) = (r2v1 java.lang.Object), (r2v12 java.lang.Object) binds: [B:8:0x0027, B:5:0x001a] A[DONT_GENERATE, DONT_INLINE]
  0x0104: PHI (r3v1 java.lang.Object) = (r3v0 java.lang.Object), (r3v12 java.lang.Object) binds: [B:8:0x0027, B:5:0x001a] A[DONT_GENERATE, DONT_INLINE]
  0x0104: PHI (r4v1 java.lang.Object) = (r4v0 java.lang.Object), (r4v12 java.lang.Object) binds: [B:8:0x0027, B:5:0x001a] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Code duplicated, block: B:32:0x0126  */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final ShortNewsContentCardView create(Object obj, ShortNewsContentCardView shortNewsContentCardView) {
            Object obj2;
            Object obj3;
            Object obj4;
            int i;
            int i2 = 2 % 2;
            int i3 = RatingCompat + 93;
            MediaMetadataCompat = i3 % Fields.SpotShadowColor;
            if (i3 % 2 != 0) {
                int i4 = this.RemoteActionCompatParcelizer;
                obj2 = this.IconCompatParcelizer;
                obj3 = this.read;
                obj4 = this.write;
                switch (i4) {
                    case 0:
                        AnonymousClass2 anonymousClass2 = new AnonymousClass2((SideMenuCacheImpl) obj2, (r8lambdakQbp11wZ4ZjRP1b2DHSZXunsBM) obj4, (isRoot) obj3, shortNewsContentCardView, 0);
                        anonymousClass2.serializer = obj;
                        return anonymousClass2;
                    case 1:
                        AnonymousClass2 anonymousClass3 = new AnonymousClass2((PointerInputScope) obj2, (AlignmentHorizontal) obj4, (TextFieldSelectionManager) obj3, shortNewsContentCardView, 1);
                        anonymousClass3.serializer = obj;
                        return anonymousClass3;
                    case 2:
                        return new AnonymousClass2((StrokeJoinCompanion) this.serializer, (Context) obj2, (String) obj4, (String) obj3, shortNewsContentCardView, 2);
                    case 3:
                        AnonymousClass2 anonymousClass4 = new AnonymousClass2((isRoot) obj3, this.IconCompatParcelizer, obj4, shortNewsContentCardView, 3);
                        anonymousClass4.serializer = obj;
                        return anonymousClass4;
                    case 4:
                        return new AnonymousClass2((byte[]) this.serializer, (ChatAssetCacheManager) obj2, (getDefaultIndentationXSAIIZE) obj4, (String) obj3, shortNewsContentCardView, 4);
                    case 5:
                        return new AnonymousClass2((ChatAssetCacheLocalWebServer) this.serializer, (Socket) obj2, (BlockRunner) obj4, (String) obj3, shortNewsContentCardView, 5);
                    case 6:
                        return new AnonymousClass2((ChatAssetCacheLocalWebServer) this.serializer, (ServerSocket) obj2, (BlockRunner) obj4, (String) obj3, shortNewsContentCardView, 6);
                    case 7:
                        return new AnonymousClass2((accessgetAltRightcp) this.serializer, (getUseTempTrackingTableroom_runtime) obj2, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) obj4, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) obj3, shortNewsContentCardView, 7);
                    case 8:
                        AnonymousClass2 anonymousClass5 = new AnonymousClass2((isRoot) obj3, obj2, obj4, shortNewsContentCardView, 8);
                        anonymousClass5.serializer = obj;
                        return anonymousClass5;
                    case 9:
                        AnonymousClass2 anonymousClass6 = new AnonymousClass2((MapNavigationImpl) obj2, (getContentViewGroupParentLayout) obj4, (LocationComponentPluginImpl) obj3, shortNewsContentCardView, 9);
                        anonymousClass6.serializer = obj;
                        return anonymousClass6;
                    default:
                        AnonymousClass2 anonymousClass7 = new AnonymousClass2((getContentViewGroupParentLayout) this.serializer, (PopulateViewStructure_androidKtpopulate7) obj2, (SheetState) obj4, (PopulateViewStructure_androidKtpopulate7) obj3, shortNewsContentCardView, 10);
                        i = RatingCompat + 113;
                        MediaMetadataCompat = i % Fields.SpotShadowColor;
                        if (i % 2 == 0) {
                            int i5 = 4 / 0;
                        }
                        return anonymousClass7;
                }
            }
            int i6 = this.RemoteActionCompatParcelizer;
            obj2 = this.IconCompatParcelizer;
            obj3 = this.read;
            obj4 = this.write;
            int i7 = 22 / 0;
            switch (i6) {
                case 0:
                    AnonymousClass2 anonymousClass8 = new AnonymousClass2((SideMenuCacheImpl) obj2, (r8lambdakQbp11wZ4ZjRP1b2DHSZXunsBM) obj4, (isRoot) obj3, shortNewsContentCardView, 0);
                    anonymousClass8.serializer = obj;
                    return anonymousClass8;
                case 1:
                    AnonymousClass2 anonymousClass9 = new AnonymousClass2((PointerInputScope) obj2, (AlignmentHorizontal) obj4, (TextFieldSelectionManager) obj3, shortNewsContentCardView, 1);
                    anonymousClass9.serializer = obj;
                    return anonymousClass9;
                case 2:
                    return new AnonymousClass2((StrokeJoinCompanion) this.serializer, (Context) obj2, (String) obj4, (String) obj3, shortNewsContentCardView, 2);
                case 3:
                    AnonymousClass2 anonymousClass10 = new AnonymousClass2((isRoot) obj3, this.IconCompatParcelizer, obj4, shortNewsContentCardView, 3);
                    anonymousClass10.serializer = obj;
                    return anonymousClass10;
                case 4:
                    return new AnonymousClass2((byte[]) this.serializer, (ChatAssetCacheManager) obj2, (getDefaultIndentationXSAIIZE) obj4, (String) obj3, shortNewsContentCardView, 4);
                case 5:
                    return new AnonymousClass2((ChatAssetCacheLocalWebServer) this.serializer, (Socket) obj2, (BlockRunner) obj4, (String) obj3, shortNewsContentCardView, 5);
                case 6:
                    return new AnonymousClass2((ChatAssetCacheLocalWebServer) this.serializer, (ServerSocket) obj2, (BlockRunner) obj4, (String) obj3, shortNewsContentCardView, 6);
                case 7:
                    return new AnonymousClass2((accessgetAltRightcp) this.serializer, (getUseTempTrackingTableroom_runtime) obj2, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) obj4, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) obj3, shortNewsContentCardView, 7);
                case 8:
                    AnonymousClass2 anonymousClass11 = new AnonymousClass2((isRoot) obj3, obj2, obj4, shortNewsContentCardView, 8);
                    anonymousClass11.serializer = obj;
                    return anonymousClass11;
                case 9:
                    AnonymousClass2 anonymousClass12 = new AnonymousClass2((MapNavigationImpl) obj2, (getContentViewGroupParentLayout) obj4, (LocationComponentPluginImpl) obj3, shortNewsContentCardView, 9);
                    anonymousClass12.serializer = obj;
                    return anonymousClass12;
                default:
                    AnonymousClass2 anonymousClass13 = new AnonymousClass2((getContentViewGroupParentLayout) this.serializer, (PopulateViewStructure_androidKtpopulate7) obj2, (SheetState) obj4, (PopulateViewStructure_androidKtpopulate7) obj3, shortNewsContentCardView, 10);
                    i = RatingCompat + 113;
                    MediaMetadataCompat = i % Fields.SpotShadowColor;
                    if (i % 2 == 0) {
                        int i8 = 4 / 0;
                    }
                    return anonymousClass13;
            }
        }
    }

    public SideMenuCacheImpl(buildSessionPackage buildsessionpackage) {
        this.serializer = buildsessionpackage;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x002b  */
    public static final Object access$fromJson(SideMenuCacheImpl sideMenuCacheImpl, String str, ContinuationImpl continuationImpl) {
        r8lambdahA_Tal7rtdMP7Bv9IDcuwYDoHo r8lambdaha_tal7rtdmp7bv9idcuwydoho;
        int i = 2 % 2;
        sideMenuCacheImpl.getClass();
        if (continuationImpl instanceof r8lambdahA_Tal7rtdMP7Bv9IDcuwYDoHo) {
            int i2 = IconCompatParcelizer + 85;
            read = i2 % Fields.SpotShadowColor;
            int i3 = i2 % 2;
            r8lambdaha_tal7rtdmp7bv9idcuwydoho = (r8lambdahA_Tal7rtdMP7Bv9IDcuwYDoHo) continuationImpl;
            int i4 = r8lambdaha_tal7rtdmp7bv9idcuwydoho.write;
            if ((i4 & Integer.MIN_VALUE) != 0) {
                int i5 = read + 61;
                IconCompatParcelizer = i5 % Fields.SpotShadowColor;
                int i6 = i5 % 2;
                r8lambdaha_tal7rtdmp7bv9idcuwydoho.write = i4 - Integer.MIN_VALUE;
            } else {
                r8lambdaha_tal7rtdmp7bv9idcuwydoho = new r8lambdahA_Tal7rtdMP7Bv9IDcuwYDoHo(sideMenuCacheImpl, continuationImpl);
                int i7 = read + 27;
                IconCompatParcelizer = i7 % Fields.SpotShadowColor;
                int i8 = i7 % 2;
            }
        } else {
            r8lambdaha_tal7rtdmp7bv9idcuwydoho = new r8lambdahA_Tal7rtdMP7Bv9IDcuwYDoHo(sideMenuCacheImpl, continuationImpl);
            int i9 = read + 27;
            IconCompatParcelizer = i9 % Fields.SpotShadowColor;
            int i10 = i9 % 2;
        }
        Object obj = r8lambdaha_tal7rtdmp7bv9idcuwydoho.RemoteActionCompatParcelizer;
        Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i11 = r8lambdaha_tal7rtdmp7bv9idcuwydoho.write;
        if (i11 == 0) {
            ExtrasKt.RemoteActionCompatParcelizer(obj);
            try {
                isVerticalSwipeInAllowedDirection isverticalswipeinalloweddirection = resetTransientState.read;
                isverticalswipeinalloweddirection.getClass();
                setGraphicModalMaxWidthDp setgraphicmodalmaxwidthdp = LazyKt__LazyJVMKt.read(r8lambdakQbp11wZ4ZjRP1b2DHSZXunsBM.Companion.serializer());
                return (r8lambdakQbp11wZ4ZjRP1b2DHSZXunsBM) isverticalswipeinalloweddirection.serializer(str, setgraphicmodalmaxwidthdp);
            } catch (SerializationException unused) {
                r8lambdaha_tal7rtdmp7bv9idcuwydoho.write = 1;
                if (sideMenuCacheImpl.clear(r8lambdaha_tal7rtdmp7bv9idcuwydoho) != obj2) {
                }
            }
        } else {
            if (i11 != 1) {
                ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            ExtrasKt.RemoteActionCompatParcelizer(obj);
        }
        obj2 = null;
        int i12 = IconCompatParcelizer + 57;
        read = i12 % Fields.SpotShadowColor;
        int i13 = i12 % 2;
        return obj2;
    }

    /* JADX WARN: Code duplicated, block: B:11:0x002e  */
    public final Object clear(ContinuationImpl continuationImpl) {
        r8lambdagskXZWXAywZBpuMlyibFzaBUyes r8lambdagskxzwxaywzbpumlyibfzabuyes;
        int i = 2 % 2;
        if (!(!(continuationImpl instanceof r8lambdagskXZWXAywZBpuMlyibFzaBUyes))) {
            int i2 = read + 97;
            IconCompatParcelizer = i2 % Fields.SpotShadowColor;
            int i3 = i2 % 2;
            r8lambdagskxzwxaywzbpumlyibfzabuyes = (r8lambdagskXZWXAywZBpuMlyibFzaBUyes) continuationImpl;
            int i4 = r8lambdagskxzwxaywzbpumlyibfzabuyes.RemoteActionCompatParcelizer;
            if ((i4 & Integer.MIN_VALUE) != 0) {
                int i5 = read + 39;
                IconCompatParcelizer = i5 % Fields.SpotShadowColor;
                r8lambdagskxzwxaywzbpumlyibfzabuyes.RemoteActionCompatParcelizer = i5 % 2 == 0 ? i4 - Integer.MIN_VALUE : i4 - Integer.MIN_VALUE;
            } else {
                r8lambdagskxzwxaywzbpumlyibfzabuyes = new r8lambdagskXZWXAywZBpuMlyibFzaBUyes(this, continuationImpl);
            }
        } else {
            r8lambdagskxzwxaywzbpumlyibfzabuyes = new r8lambdagskXZWXAywZBpuMlyibFzaBUyes(this, continuationImpl);
        }
        Object obj = r8lambdagskxzwxaywzbpumlyibfzabuyes.serializer;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i6 = r8lambdagskxzwxaywzbpumlyibfzabuyes.RemoteActionCompatParcelizer;
        try {
            if (i6 == 0) {
                ExtrasKt.RemoteActionCompatParcelizer(obj);
                performCustomExitMxy_nc0 performcustomexitmxy_nc0 = (performCustomExitMxy_nc0) this.serializer.write();
                SignInDataStore$clear$2 signInDataStore$clear$2 = new SignInDataStore$clear$2(22);
                r8lambdagskxzwxaywzbpumlyibfzabuyes.RemoteActionCompatParcelizer = 1;
                if (pauseWebviewIfNecessarylambda10.serializer(performcustomexitmxy_nc0, signInDataStore$clear$2, r8lambdagskxzwxaywzbpumlyibfzabuyes) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i6 != 1) {
                    ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                int i7 = IconCompatParcelizer + 15;
                read = i7 % Fields.SpotShadowColor;
                int i8 = i7 % 2;
                ExtrasKt.RemoteActionCompatParcelizer(obj);
            }
        } catch (IOException e) {
            Timber.RemoteActionCompatParcelizer.RemoteActionCompatParcelizer(e, "Failed to clear side menu cache", new Object[0]);
        }
        return createFromParcel.INSTANCE;
    }

    /* JADX WARN: Code duplicated, block: B:33:0x0093  */
    /* JADX WARN: Code duplicated, block: B:8:0x0021  */
    public final Object shouldClearCache(isRoot isroot, ContinuationImpl continuationImpl) {
        r8lambdah58aXmhhQAgDkycgUejmT5u6E r8lambdah58axmhhqagdkycguejmt5u6e;
        boolean z;
        int i = 2 % 2;
        if (!(continuationImpl instanceof r8lambdah58aXmhhQAgDkycgUejmT5u6E)) {
            r8lambdah58axmhhqagdkycguejmt5u6e = new r8lambdah58aXmhhQAgDkycgUejmT5u6E(this, continuationImpl);
        } else {
            r8lambdah58axmhhqagdkycguejmt5u6e = (r8lambdah58aXmhhQAgDkycgUejmT5u6E) continuationImpl;
            int i2 = r8lambdah58axmhhqagdkycguejmt5u6e.read;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                int i3 = IconCompatParcelizer + 121;
                read = i3 % Fields.SpotShadowColor;
                int i4 = i3 % 2;
                r8lambdah58axmhhqagdkycguejmt5u6e.read = i2 - Integer.MIN_VALUE;
            } else {
                r8lambdah58axmhhqagdkycguejmt5u6e = new r8lambdah58aXmhhQAgDkycgUejmT5u6E(this, continuationImpl);
            }
        }
        Object objFirstOrNull = r8lambdah58axmhhqagdkycguejmt5u6e.RemoteActionCompatParcelizer;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i5 = r8lambdah58axmhhqagdkycguejmt5u6e.read;
        Object obj = null;
        if (i5 != 0) {
            int i6 = read + 77;
            IconCompatParcelizer = i6 % Fields.SpotShadowColor;
            if (i6 % 2 != 0 ? i5 != 1 : i5 != 0) {
                ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            isroot = r8lambdah58axmhhqagdkycguejmt5u6e.write;
            ExtrasKt.RemoteActionCompatParcelizer(objFirstOrNull);
        } else {
            ExtrasKt.RemoteActionCompatParcelizer(objFirstOrNull);
            GetAppStateImpl$invoke$$inlined$map$1 getAppStateImpl$invoke$$inlined$map$1 = new GetAppStateImpl$invoke$$inlined$map$1(((performCustomExitMxy_nc0) this.serializer.write()).serializer(), 10);
            r8lambdah58axmhhqagdkycguejmt5u6e.write = isroot;
            r8lambdah58axmhhqagdkycguejmt5u6e.read = 1;
            objFirstOrNull = FlowKt.firstOrNull(getAppStateImpl$invoke$$inlined$map$1, r8lambdah58axmhhqagdkycguejmt5u6e);
            if (objFirstOrNull == coroutineSingletons) {
                return coroutineSingletons;
            }
        }
        Set set = (Set) objFirstOrNull;
        if (set != null && !set.isEmpty()) {
            int i7 = IconCompatParcelizer + 107;
            read = i7 % Fields.SpotShadowColor;
            if (i7 % 2 != 0) {
                set.contains(isroot);
                obj.hashCode();
                throw null;
            }
            z = set.contains(isroot) ? false : true;
        }
        return Boolean.valueOf(z);
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0034  */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00fc, code lost:
    
        if (o.pauseWebviewIfNecessarylambda10.serializer(r0, r15, r11) == r12) goto L42;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object set(long r18, o.r8lambdakQbp11wZ4ZjRP1b2DHSZXunsBM r20, kotlin.coroutines.jvm.internal.ContinuationImpl r21) {
        /*
            Method dump skipped, instruction units count: 284
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.roadrunner.sidemenu.data.cache.SideMenuCacheImpl.set(long, o.r8lambdakQbp11wZ4ZjRP1b2DHSZXunsBM, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }
}
