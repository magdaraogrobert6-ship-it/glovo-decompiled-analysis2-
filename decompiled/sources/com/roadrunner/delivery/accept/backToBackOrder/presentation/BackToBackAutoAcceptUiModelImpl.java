package com.roadrunner.delivery.accept.backToBackOrder.presentation;

import androidx.compose.ui.graphics.Fields;
import androidx.work.CoroutineWorker$startWork$1;
import coil3.ExtrasKt;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import com.google.firebase.encoders.proto.ProtobufEncoder;
import com.logistics.rider.glovo.R;
import com.roadrunner.delivery.errorhandler.DeliveryErrorProviderImpl;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import o.AnyOverlaplambda0;
import o.SaversKtExternalSyntheticLambda0;
import o.ShortNewsContentCardView;
import o.WebViewBuilderException;
import o.addSubLayer;
import o.copyNs73l9sdefault;
import o.createFromParcel;
import o.findNestedRecyclerView;
import o.getContentViewGroupParentLayout;
import o.getLayoutInput;
import o.getQueryContext;
import o.isItemDismissable;
import o.onItemDismiss;
import o.pauseWebviewIfNecessarylambda10;
import o.r8lambdaKLUglSIfRlmIAl3gbMulFwcpk84;
import o.setTransactionSuccessful;
import o.unpackAbsFloat1;
import o.unpackAbsFloat2;
import o.unpackFloat1;
import timber.log.Timber;

/* JADX INFO: loaded from: classes3.dex */
public final class BackToBackAutoAcceptUiModelImpl implements findNestedRecyclerView {
    private static int PlaybackStateCompatCustomAction = 1;
    private static int RatingCompat;
    public final ProtobufEncoder IconCompatParcelizer;
    public final getQueryContext MediaBrowserCompatMediaItem;
    public final setTransactionSuccessful MediaDescriptionCompat;
    public final r8lambdaKLUglSIfRlmIAl3gbMulFwcpk84 MediaMetadataCompat;
    public final StateFlow MediaSessionCompatQueueItem;
    public final MutableStateFlow RemoteActionCompatParcelizer;
    public final DeliveryErrorProviderImpl read;
    public final getContentViewGroupParentLayout serializer;
    public final WebViewBuilderException write;

    @Override // o.findNestedRecyclerView
    public final StateFlow serializer() {
        int i = 2 % 2;
        int i2 = RatingCompat + 81;
        PlaybackStateCompatCustomAction = i2 % Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            return this.MediaSessionCompatQueueItem;
        }
        int i3 = 27 / 0;
        return this.MediaSessionCompatQueueItem;
    }

    public BackToBackAutoAcceptUiModelImpl(getContentViewGroupParentLayout getcontentviewgroupparentlayout, setTransactionSuccessful settransactionsuccessful, getQueryContext getquerycontext, r8lambdaKLUglSIfRlmIAl3gbMulFwcpk84 r8lambdakluglsifrlmial3gbmulfwcpk84, ProtobufEncoder protobufEncoder, WebViewBuilderException webViewBuilderException, DeliveryErrorProviderImpl deliveryErrorProviderImpl) {
        getcontentviewgroupparentlayout.getClass();
        this.serializer = getcontentviewgroupparentlayout;
        this.MediaDescriptionCompat = settransactionsuccessful;
        this.MediaBrowserCompatMediaItem = getquerycontext;
        this.MediaMetadataCompat = r8lambdakluglsifrlmial3gbmulfwcpk84;
        this.IconCompatParcelizer = protobufEncoder;
        this.write = webViewBuilderException;
        this.read = deliveryErrorProviderImpl;
        MutableStateFlow mutableStateFlow = StateFlowKt.read(Boolean.FALSE);
        this.RemoteActionCompatParcelizer = mutableStateFlow;
        this.MediaSessionCompatQueueItem = mutableStateFlow;
        BuildersKt.RemoteActionCompatParcelizer(getcontentviewgroupparentlayout, null, null, new CoroutineWorker$startWork$1(this, null, 19), 3);
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0039 A[PHI: r2 r6
  0x0039: PHI (r2v7 o.getLayoutInput) = (r2v6 o.getLayoutInput), (r2v9 o.getLayoutInput) binds: [B:12:0x0037, B:9:0x002d] A[DONT_GENERATE, DONT_INLINE]
  0x0039: PHI (r6v13 int) = (r6v12 int), (r6v15 int) binds: [B:12:0x0037, B:9:0x002d] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:14:0x003d  */
    public static final Object access$autoAcceptDeliveryIfEnabled(BackToBackAutoAcceptUiModelImpl backToBackAutoAcceptUiModelImpl, ShortNewsContentCardView shortNewsContentCardView) {
        getLayoutInput getlayoutinput;
        Object objM4474invokegIAlus;
        String strRemoteActionCompatParcelizer;
        int i;
        int i2 = 2 % 2;
        int i3 = PlaybackStateCompatCustomAction + 115;
        int i4 = i3 % Fields.SpotShadowColor;
        RatingCompat = i4;
        String strSerializer = null;
        if (i3 % 2 != 0) {
            getQueryContext getquerycontext = backToBackAutoAcceptUiModelImpl.MediaBrowserCompatMediaItem;
            MutableStateFlow mutableStateFlow = backToBackAutoAcceptUiModelImpl.RemoteActionCompatParcelizer;
            boolean z = shortNewsContentCardView instanceof getLayoutInput;
            strSerializer.hashCode();
            throw null;
        }
        getQueryContext getquerycontext2 = backToBackAutoAcceptUiModelImpl.MediaBrowserCompatMediaItem;
        MutableStateFlow mutableStateFlow2 = backToBackAutoAcceptUiModelImpl.RemoteActionCompatParcelizer;
        if (shortNewsContentCardView instanceof getLayoutInput) {
            int i5 = i4 + 75;
            PlaybackStateCompatCustomAction = i5 % Fields.SpotShadowColor;
            if (i5 % 2 == 0) {
                getlayoutinput = (getLayoutInput) shortNewsContentCardView;
                i = getlayoutinput.read;
                int i6 = 43 / 0;
                if ((i & Integer.MIN_VALUE) != 0) {
                    getlayoutinput.read = i - Integer.MIN_VALUE;
                } else {
                    getlayoutinput = new getLayoutInput(backToBackAutoAcceptUiModelImpl, shortNewsContentCardView);
                }
            } else {
                getlayoutinput = (getLayoutInput) shortNewsContentCardView;
                i = getlayoutinput.read;
                if ((i & Integer.MIN_VALUE) != 0) {
                    getlayoutinput.read = i - Integer.MIN_VALUE;
                } else {
                    getlayoutinput = new getLayoutInput(backToBackAutoAcceptUiModelImpl, shortNewsContentCardView);
                }
            }
        } else {
            getlayoutinput = new getLayoutInput(backToBackAutoAcceptUiModelImpl, shortNewsContentCardView);
        }
        Object obj = getlayoutinput.IconCompatParcelizer;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i7 = getlayoutinput.read;
        createFromParcel createfromparcel = createFromParcel.INSTANCE;
        if (i7 == 0) {
            ExtrasKt.RemoteActionCompatParcelizer(obj);
            ProtobufEncoder protobufEncoder = backToBackAutoAcceptUiModelImpl.IconCompatParcelizer;
            getlayoutinput.read = 1;
            objM4474invokegIAlus = protobufEncoder.m4474invokegIAlus(SaversKtExternalSyntheticLambda0.FOREGROUND, getlayoutinput);
            if (objM4474invokegIAlus != coroutineSingletons) {
            }
            return coroutineSingletons;
        }
        int i8 = RatingCompat + 125;
        PlaybackStateCompatCustomAction = i8 % Fields.SpotShadowColor;
        if (i8 % 2 != 0 ? i7 == 1 : i7 == 0) {
            ExtrasKt.RemoteActionCompatParcelizer(obj);
            objM4474invokegIAlus = ((onItemDismiss) obj).IconCompatParcelizer;
        } else {
            if (i7 != 2) {
                ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                int i9 = RatingCompat + 105;
                PlaybackStateCompatCustomAction = i9 % Fields.SpotShadowColor;
                int i10 = i9 % 2;
                return null;
            }
            ExtrasKt.RemoteActionCompatParcelizer(obj);
        }
        return createfromparcel;
        if (!(objM4474invokegIAlus instanceof isItemDismissable)) {
            int i11 = RatingCompat + 89;
            PlaybackStateCompatCustomAction = i11 % Fields.SpotShadowColor;
            if (i11 % 2 == 0) {
                ((copyNs73l9sdefault) objM4474invokegIAlus).RemoteActionCompatParcelizer();
                throw null;
            }
            copyNs73l9sdefault copyns73l9sdefault = (copyNs73l9sdefault) objM4474invokegIAlus;
            Object objRemoteActionCompatParcelizer = copyns73l9sdefault.RemoteActionCompatParcelizer();
            if (objRemoteActionCompatParcelizer == null && (objRemoteActionCompatParcelizer = copyns73l9sdefault.IconCompatParcelizer()) == null) {
                objRemoteActionCompatParcelizer = copyns73l9sdefault.write();
            }
            unpackAbsFloat1 unpackabsfloat1RemoteActionCompatParcelizer = copyns73l9sdefault.RemoteActionCompatParcelizer();
            if (unpackabsfloat1RemoteActionCompatParcelizer == null || (strRemoteActionCompatParcelizer = unpackabsfloat1RemoteActionCompatParcelizer.RemoteActionCompatParcelizer()) == null) {
                unpackAbsFloat2 unpackabsfloat2IconCompatParcelizer = copyns73l9sdefault.IconCompatParcelizer();
                if (unpackabsfloat2IconCompatParcelizer != null) {
                    strSerializer = unpackabsfloat2IconCompatParcelizer.serializer();
                } else {
                    unpackFloat1 unpackfloat1Write = copyns73l9sdefault.write();
                    if (unpackfloat1Write != null) {
                        strSerializer = unpackfloat1Write.serializer();
                    }
                }
            } else {
                strSerializer = strRemoteActionCompatParcelizer;
            }
            if (objRemoteActionCompatParcelizer != null) {
                mutableStateFlow2.IconCompatParcelizer(Boolean.TRUE);
                if (strSerializer == null) {
                    strSerializer = "";
                }
                getquerycontext2.serializer(new AnyOverlaplambda0(strSerializer));
            } else {
                mutableStateFlow2.IconCompatParcelizer(Boolean.FALSE);
            }
        }
        Throwable thSerializer = onItemDismiss.serializer(objM4474invokegIAlus);
        if (thSerializer != null) {
            mutableStateFlow2.IconCompatParcelizer(Boolean.TRUE);
            if (pauseWebviewIfNecessarylambda10.IconCompatParcelizer(thSerializer)) {
                getquerycontext2.serializer(new AnyOverlaplambda0(backToBackAutoAcceptUiModelImpl.MediaDescriptionCompat.IconCompatParcelizer(R.string.no_internet_connection_message)));
            } else if (thSerializer instanceof addSubLayer) {
                DeliveryErrorProviderImpl deliveryErrorProviderImpl = backToBackAutoAcceptUiModelImpl.read;
                getlayoutinput.RemoteActionCompatParcelizer = objM4474invokegIAlus;
                getlayoutinput.read = 2;
                deliveryErrorProviderImpl.emitError(thSerializer, getlayoutinput);
                if (createfromparcel == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                Timber.RemoteActionCompatParcelizer.write(thSerializer);
            }
        }
        return createfromparcel;
    }
}
