package com.deliveryhero.selfServiceChat.ui;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.webkit.ValueCallback;
import android.webkit.WebView;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.compose.ui.graphics.Fields;
import androidx.fragment.app.FragmentActivity;
import com.common_ui.databinding.ItemSingleChoiceBinding;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import java.util.Collections;
import java.util.Map;
import java.util.concurrent.CancellationException;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.jvm.internal.AdaptedFunctionReference;
import kotlinx.coroutines.DeferredCoroutine;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.MutableStateFlow;
import o.FocusListener;
import o.GraphicsLayerV29;
import o.GraphicsViewLayer;
import o.LayerSnapshotImpl;
import o.LayerSnapshotV21;
import o.LayerSnapshotV22;
import o.ShortNewsContentCardView;
import o.VectorPainterKtRenderVectorGroupconfig1;
import o.VectorPainterKtRenderVectorGroupconfig2;
import o.VectorPainterKtrememberVectorPainter2composition11;
import o.VectorPath;
import o.VectorProperty;
import o.VectorPropertyFill;
import o.VectorPropertyFillAlpha;
import o.VectorPropertyPivotY;
import o.VectorPropertyRotation;
import o.VectorPropertyScaleX;
import o.ViewLayer;
import o.ViewLayerVerificationHelper31;
import o.accessgetMayRenderInSoftwarecp;
import o.accessgetPlaceholderCanvascp;
import o.createFromParcel;
import o.discardDisplayListInternalui_graphics;
import o.getCieXyz;
import o.getDefaultJoinLxFBmk8;
import o.getHasNonTranslationComponentsannotations;
import o.getTransaction;
import o.hideCurrentlyDisplayingInAppMessage;
import o.isIdentityannotations;
import o.isInvalidIndex;
import o.isPlacementApproachInProgress;
import o.lockCanvas;
import o.r8lambdatEa7vanKJhASEs7P3j5N2RjkfeQ;
import o.rememberVectorPainter;
import o.removeNodeAtDepth;
import o.z7ExternalSyntheticLambda0;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class WebChatFragment$onCreateView$1$2$1$1 implements FlowCollector, r8lambdatEa7vanKJhASEs7P3j5N2RjkfeQ {
    private static int IconCompatParcelizer = 1;
    private static int RemoteActionCompatParcelizer;
    public final /* synthetic */ int read;
    public final /* synthetic */ WebChatFragment write;

    public /* synthetic */ WebChatFragment$onCreateView$1$2$1$1(WebChatFragment webChatFragment, int i) {
        this.read = i;
        this.write = webChatFragment;
    }

    public final int hashCode() {
        int i = 2 % 2;
        int i2 = IconCompatParcelizer + 89;
        RemoteActionCompatParcelizer = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        if (this.read == 0) {
            return getFunctionDelegate().hashCode();
        }
        int iHashCode = getFunctionDelegate().hashCode();
        int i4 = IconCompatParcelizer + 75;
        RemoteActionCompatParcelizer = i4 % Fields.SpotShadowColor;
        if (i4 % 2 == 0) {
            return iHashCode;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // o.r8lambdatEa7vanKJhASEs7P3j5N2RjkfeQ
    public final isInvalidIndex getFunctionDelegate() {
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 117;
        IconCompatParcelizer = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        if (this.read == 0) {
            return new AdaptedFunctionReference(2, 4, WebChatFragment.class, this.write, "handleEvent", "handleEvent(Lcom/deliveryhero/selfServiceChat/ui/UIEvent;)V");
        }
        AdaptedFunctionReference adaptedFunctionReference = new AdaptedFunctionReference(2, 4, WebChatFragment.class, this.write, "handleState", "handleState(Lcom/deliveryhero/selfServiceChat/ui/UiState;)V");
        int i4 = IconCompatParcelizer + 97;
        RemoteActionCompatParcelizer = i4 % Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return adaptedFunctionReference;
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer;
        int i3 = i2 + 57;
        IconCompatParcelizer = i3 % Fields.SpotShadowColor;
        if (i3 % 2 != 0 ? this.read == 0 : this.read == 0) {
            if ((obj instanceof FlowCollector) && (obj instanceof r8lambdatEa7vanKJhASEs7P3j5N2RjkfeQ)) {
                return getFunctionDelegate().equals(((r8lambdatEa7vanKJhASEs7P3j5N2RjkfeQ) obj).getFunctionDelegate());
            }
            return false;
        }
        if (!(obj instanceof FlowCollector)) {
            return false;
        }
        int i4 = i2 + 33;
        IconCompatParcelizer = i4 % Fields.SpotShadowColor;
        if (i4 % 2 == 0) {
            int i5 = 75 / 0;
            if (!(obj instanceof r8lambdatEa7vanKJhASEs7P3j5N2RjkfeQ)) {
                return false;
            }
        } else if (!(obj instanceof r8lambdatEa7vanKJhASEs7P3j5N2RjkfeQ)) {
            return false;
        }
        return getFunctionDelegate().equals(((r8lambdatEa7vanKJhASEs7P3j5N2RjkfeQ) obj).getFunctionDelegate());
    }

    /* JADX WARN: Code duplicated, block: B:130:0x0346  */
    /* JADX WARN: Code duplicated, block: B:181:0x04a9 A[PHI: r1
  0x04a9: PHI (r1v15 android.webkit.ValueCallback) = (r1v14 android.webkit.ValueCallback), (r1v16 android.webkit.ValueCallback) binds: [B:180:0x04a7, B:177:0x04a2] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:182:0x04ae  */
    /* JADX WARN: Code duplicated, block: B:82:0x01be  */
    /* JADX WARN: Code duplicated, block: B:84:0x01c7  */
    @Override // kotlinx.coroutines.flow.FlowCollector
    public final Object emit(Object obj, ShortNewsContentCardView shortNewsContentCardView) {
        ValueCallback valueCallback;
        ValueCallback valueCallback2;
        String str;
        Object obj2;
        Object obj3;
        DeferredCoroutine deferredCoroutine;
        int i = 2 % 2;
        int i2 = this.read;
        createFromParcel createfromparcel = createFromParcel.INSTANCE;
        WebChatFragment webChatFragment = this.write;
        if (i2 == 0) {
            VectorPainterKtRenderVectorGroupconfig2 vectorPainterKtRenderVectorGroupconfig2 = (VectorPainterKtRenderVectorGroupconfig2) obj;
            if (vectorPainterKtRenderVectorGroupconfig2 instanceof VectorPropertyFill) {
                String str2 = ((VectorPropertyFill) vectorPainterKtRenderVectorGroupconfig2).read;
                WebView webView = webChatFragment.ParcelableVolumeInfo;
                if (webView != null) {
                    webView.evaluateJavascript("window.sendBridgeMessageFromAndroid(" + str2 + ')', null);
                }
            } else if (vectorPainterKtRenderVectorGroupconfig2 instanceof VectorPath) {
                webChatFragment.requireActivity().getOnBackPressedDispatcher().IconCompatParcelizer();
            } else if (vectorPainterKtRenderVectorGroupconfig2 instanceof VectorPainterKtRenderVectorGroupconfig1) {
                webChatFragment.requireActivity().finish();
            } else if (vectorPainterKtRenderVectorGroupconfig2 instanceof VectorPainterKtrememberVectorPainter2composition11) {
                accessgetPlaceholderCanvascp accessgetplaceholdercanvascp = (accessgetPlaceholderCanvascp) webChatFragment.MediaMetadataCompat.MediaSessionCompatResultReceiverWrapper();
                VectorPainterKtrememberVectorPainter2composition11 vectorPainterKtrememberVectorPainter2composition11 = (VectorPainterKtrememberVectorPainter2composition11) vectorPainterKtRenderVectorGroupconfig2;
                double d = vectorPainterKtrememberVectorPainter2composition11.RemoteActionCompatParcelizer;
                double d2 = vectorPainterKtrememberVectorPainter2composition11.read;
                FragmentActivity fragmentActivityRequireActivity = webChatFragment.requireActivity();
                fragmentActivityRequireActivity.getClass();
                accessgetplaceholdercanvascp.getClass();
                Uri uri = Uri.parse("geo:0,0?q=" + d + ',' + d2);
                uri.getClass();
                Intent intent = new Intent("android.intent.action.VIEW", uri);
                if (intent.resolveActivity(fragmentActivityRequireActivity.getPackageManager()) != null) {
                    fragmentActivityRequireActivity.startActivity(intent);
                }
            } else if (!(!(vectorPainterKtRenderVectorGroupconfig2 instanceof VectorPropertyRotation))) {
                isPlacementApproachInProgress isplacementapproachinprogress = ((VectorPropertyRotation) vectorPainterKtRenderVectorGroupconfig2).read;
                if (isplacementapproachinprogress == null) {
                    int i3 = IconCompatParcelizer + 51;
                    RemoteActionCompatParcelizer = i3 % Fields.SpotShadowColor;
                    if (i3 % 2 != 0) {
                        valueCallback = webChatFragment.MediaSessionCompatQueueItem;
                        int i4 = 57 / 0;
                        if (valueCallback != null) {
                            valueCallback2 = null;
                            valueCallback.onReceiveValue(null);
                        } else {
                            valueCallback2 = null;
                        }
                    } else {
                        valueCallback = webChatFragment.MediaSessionCompatQueueItem;
                        if (valueCallback != null) {
                            valueCallback2 = null;
                            valueCallback.onReceiveValue(null);
                        } else {
                            valueCallback2 = null;
                        }
                    }
                    webChatFragment.MediaSessionCompatQueueItem = valueCallback2;
                } else {
                    ((LayerSnapshotImpl) webChatFragment.RatingCompat.MediaSessionCompatResultReceiverWrapper()).getClass();
                    Context contextRequireContext = webChatFragment.requireContext();
                    contextRequireContext.getClass();
                    if (!(isplacementapproachinprogress instanceof GraphicsLayerV29) && !(isplacementapproachinprogress instanceof accessgetMayRenderInSoftwarecp)) {
                        ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer();
                        return null;
                    }
                    if (FocusListener.write(contextRequireContext, LayerSnapshotImpl.IconCompatParcelizer[0]) != 0) {
                        webChatFragment.PlaybackStateCompatCustomAction.write("android.permission.CAMERA");
                    } else {
                        discardDisplayListInternalui_graphics discarddisplaylistinternalui_graphics = (discardDisplayListInternalui_graphics) webChatFragment.MediaDescriptionCompat.MediaSessionCompatResultReceiverWrapper();
                        Context contextRequireContext2 = webChatFragment.requireContext();
                        contextRequireContext2.getClass();
                        ((GraphicsViewLayer) discarddisplaylistinternalui_graphics).serializer(contextRequireContext2, isplacementapproachinprogress);
                    }
                }
            } else if (vectorPainterKtRenderVectorGroupconfig2 instanceof VectorPropertyFillAlpha) {
                ValueCallback valueCallback3 = webChatFragment.MediaSessionCompatQueueItem;
                if (valueCallback3 != null) {
                    valueCallback3.onReceiveValue(new Uri[]{((VectorPropertyFillAlpha) vectorPainterKtRenderVectorGroupconfig2).serializer});
                }
                webChatFragment.MediaSessionCompatQueueItem = null;
            } else if (vectorPainterKtRenderVectorGroupconfig2 instanceof VectorProperty) {
                ValueCallback valueCallback4 = webChatFragment.MediaSessionCompatQueueItem;
                if (valueCallback4 != null) {
                    valueCallback4.onReceiveValue(null);
                }
                webChatFragment.MediaSessionCompatQueueItem = null;
            }
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            return createfromparcel;
        }
        VectorPropertyScaleX vectorPropertyScaleX = (VectorPropertyScaleX) obj;
        ItemSingleChoiceBinding itemSingleChoiceBinding = webChatFragment.write;
        if (itemSingleChoiceBinding != null) {
            VectorPropertyPivotY vectorPropertyPivotY = vectorPropertyScaleX.write;
            boolean z = vectorPropertyScaleX.IconCompatParcelizer;
            if (vectorPropertyPivotY != null) {
                getHasNonTranslationComponentsannotations gethasnontranslationcomponentsannotations = webChatFragment.RemoteActionCompatParcelizer().read;
                if (gethasnontranslationcomponentsannotations != null) {
                    int i5 = RemoteActionCompatParcelizer + 73;
                    IconCompatParcelizer = i5 % Fields.SpotShadowColor;
                    int i6 = i5 % 2;
                    gethasnontranslationcomponentsannotations.write("chat_e2e_tap_to_page_loaded");
                    gethasnontranslationcomponentsannotations.write("chat_web_start_to_rendered");
                    gethasnontranslationcomponentsannotations.write("chat_native_tap_to_web_start");
                    gethasnontranslationcomponentsannotations.write("chat_native_before_load_url");
                    gethasnontranslationcomponentsannotations.write("chat_native_after_load_url");
                    gethasnontranslationcomponentsannotations.IconCompatParcelizer();
                }
                isIdentityannotations isidentityannotations = webChatFragment.RemoteActionCompatParcelizer().serializer;
                if (isidentityannotations != null) {
                    LayerSnapshotV22 layerSnapshotV22 = LayerSnapshotV22.ERROR;
                    String str3 = "Error opening web chat " + vectorPropertyPivotY;
                    Throwable thSerializer = vectorPropertyPivotY.serializer();
                    if (thSerializer == null) {
                        thSerializer = new Throwable("Error is " + vectorPropertyPivotY);
                    }
                    isidentityannotations.RemoteActionCompatParcelizer(layerSnapshotV22, "WEB_CHAT_OPEN_ERROR", str3, thSerializer);
                }
            }
            int i7 = 8;
            ((FrameLayout) ((getDefaultJoinLxFBmk8) itemSingleChoiceBinding.serializer).serializer).setVisibility(vectorPropertyPivotY != null ? 0 : 8);
            ((z7ExternalSyntheticLambda0) itemSingleChoiceBinding.write).serializer.setVisibility(!z ? 8 : 0);
            String str4 = vectorPropertyScaleX.read;
            boolean z2 = (str4 == null || hideCurrentlyDisplayingInAppMessage.serializer((CharSequence) str4) || z) ? false : true;
            ((ImageView) itemSingleChoiceBinding.read).setVisibility(!z2 ? 0 : 8);
            WebView webView2 = webChatFragment.ParcelableVolumeInfo;
            if (webView2 != null) {
                if (z2) {
                    int i8 = IconCompatParcelizer + 87;
                    RemoteActionCompatParcelizer = i8 % Fields.SpotShadowColor;
                    i7 = i8 % 2 != 0 ? 1 : 0;
                }
                webView2.setVisibility(i7);
            }
        }
        WebView webView3 = webChatFragment.ParcelableVolumeInfo;
        String url = webView3 != null ? webView3.getUrl() : null;
        LayerSnapshotV21 layerSnapshotV21Write = ((ViewLayerVerificationHelper31) webChatFragment.serializer()).write();
        String str5 = "";
        if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{layerSnapshotV21Write != null ? layerSnapshotV21Write.r8lambda54BeH8ZsBru0CXI2CCSP2syNys : null, lockCanvas.INSTANCE}, getCieXyz.write())).booleanValue()) {
            String str6 = vectorPropertyScaleX.read;
            if (str6 != null) {
                int i9 = RemoteActionCompatParcelizer + 29;
                IconCompatParcelizer = i9 % Fields.SpotShadowColor;
                int i10 = i9 % 2;
                if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{url, str6}, getCieXyz.write())).booleanValue()) {
                    if (webChatFragment.ParcelableVolumeInfo != null) {
                        webChatFragment.IconCompatParcelizer(vectorPropertyScaleX.read);
                    } else {
                        isIdentityannotations isidentityannotations2 = webChatFragment.RemoteActionCompatParcelizer().serializer;
                        if (isidentityannotations2 != null) {
                            LayerSnapshotV21 layerSnapshotV21Write2 = ((ViewLayerVerificationHelper31) webChatFragment.serializer()).write();
                            if (layerSnapshotV21Write2 != null && (str = layerSnapshotV21Write2.read) != null) {
                                str5 = str;
                            }
                            Map mapSingletonMap = Collections.singletonMap("CHAT_ID", str5);
                            mapSingletonMap.getClass();
                            isidentityannotations2.RemoteActionCompatParcelizer("WEB_VIEW_INSTANCE_UNINITIALISED_EVENT", mapSingletonMap);
                        }
                    }
                }
            }
        } else {
            String str7 = vectorPropertyScaleX.read;
            boolean z3 = vectorPropertyScaleX.serializer;
            if (str7 != null) {
                if (webChatFragment.ParcelableVolumeInfo == null) {
                    int i11 = RemoteActionCompatParcelizer + 87;
                    IconCompatParcelizer = i11 % Fields.SpotShadowColor;
                    int i12 = i11 % 2;
                    isIdentityannotations isidentityannotations3 = webChatFragment.RemoteActionCompatParcelizer().serializer;
                    if (isidentityannotations3 != null) {
                        LayerSnapshotV21 layerSnapshotV21Write3 = ((ViewLayerVerificationHelper31) webChatFragment.serializer()).write();
                        if (layerSnapshotV21Write3 != null) {
                            int i13 = IconCompatParcelizer + 97;
                            RemoteActionCompatParcelizer = i13 % Fields.SpotShadowColor;
                            if (i13 % 2 != 0) {
                                String str8 = layerSnapshotV21Write3.read;
                                Object obj4 = null;
                                obj4.hashCode();
                                throw null;
                            }
                            String str9 = layerSnapshotV21Write3.read;
                            if (str9 != null) {
                                str5 = str9;
                            }
                        }
                        Map mapSingletonMap2 = Collections.singletonMap("CHAT_ID", str5);
                        mapSingletonMap2.getClass();
                        isidentityannotations3.RemoteActionCompatParcelizer("WEB_VIEW_INSTANCE_UNINITIALISED_EVENT", mapSingletonMap2);
                    }
                } else {
                    if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{WebChatFragment.serializer(url), WebChatFragment.serializer(str7)}, getCieXyz.write())).booleanValue()) {
                        int i14 = RemoteActionCompatParcelizer + 29;
                        IconCompatParcelizer = i14 % Fields.SpotShadowColor;
                        if (i14 % 2 == 0) {
                            int i15 = 1 / 0;
                            if (!webChatFragment.MediaMetadataCompat().IconCompatParcelizer()) {
                                WebViewManager webViewManagerMediaMetadataCompat = webChatFragment.MediaMetadataCompat();
                                deferredCoroutine = webViewManagerMediaMetadataCompat.RatingCompat;
                                if (deferredCoroutine != null) {
                                    deferredCoroutine.write((CancellationException) null);
                                }
                                webViewManagerMediaMetadataCompat.RatingCompat = null;
                                webViewManagerMediaMetadataCompat.MediaMetadataCompat = false;
                            }
                        } else if (!webChatFragment.MediaMetadataCompat().IconCompatParcelizer()) {
                            WebViewManager webViewManagerMediaMetadataCompat2 = webChatFragment.MediaMetadataCompat();
                            deferredCoroutine = webViewManagerMediaMetadataCompat2.RatingCompat;
                            if (deferredCoroutine != null) {
                                deferredCoroutine.write((CancellationException) null);
                            }
                            webViewManagerMediaMetadataCompat2.RatingCompat = null;
                            webViewManagerMediaMetadataCompat2.MediaMetadataCompat = false;
                        }
                        webChatFragment.read("URL has changed, loading new URL");
                        webChatFragment.IconCompatParcelizer(str7);
                    } else if (z3) {
                        if (!webChatFragment.MediaMetadataCompat().IconCompatParcelizer()) {
                            WebViewManager webViewManagerMediaMetadataCompat3 = webChatFragment.MediaMetadataCompat();
                            DeferredCoroutine deferredCoroutine2 = webViewManagerMediaMetadataCompat3.RatingCompat;
                            if (deferredCoroutine2 != null) {
                                deferredCoroutine2.write((CancellationException) null);
                            }
                            webViewManagerMediaMetadataCompat3.RatingCompat = null;
                            webViewManagerMediaMetadataCompat3.MediaMetadataCompat = false;
                        }
                        LayerSnapshotV21 layerSnapshotV21Write4 = ((ViewLayerVerificationHelper31) webChatFragment.serializer()).write();
                        if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{layerSnapshotV21Write4 != null ? layerSnapshotV21Write4.r8lambda54BeH8ZsBru0CXI2CCSP2syNys : null, ViewLayer.INSTANCE}, getCieXyz.write())).booleanValue()) {
                            int i16 = IconCompatParcelizer + 75;
                            RemoteActionCompatParcelizer = i16 % Fields.SpotShadowColor;
                            int i17 = i16 % 2;
                            if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{webChatFragment.read().RatingCompat.read(), rememberVectorPainter.IconCompatParcelizer}, getCieXyz.write())).booleanValue() || webChatFragment.read().MediaSessionCompatResultReceiverWrapper.get()) {
                                String string = Uri.parse(str7).buildUpon().appendQueryParameter("ts", String.valueOf(System.currentTimeMillis())).build().toString();
                                string.getClass();
                                webChatFragment.IconCompatParcelizer(string);
                            } else {
                                webChatFragment.read("HandleState called, wasPageStartCalledDuringPreload=" + webChatFragment.MediaMetadataCompat().PlaybackStateCompatCustomAction + ", isPageLoading=" + ((Boolean) webChatFragment.read().MediaSessionCompatToken.read()).booleanValue());
                                if (webChatFragment.MediaMetadataCompat().PlaybackStateCompatCustomAction) {
                                    int i18 = IconCompatParcelizer + 15;
                                    RemoteActionCompatParcelizer = i18 % Fields.SpotShadowColor;
                                    int i19 = i18 % 2;
                                    webChatFragment.read("onPageStarted was called during preload, starting trace in handleState");
                                    getHasNonTranslationComponentsannotations gethasnontranslationcomponentsannotations2 = webChatFragment.RemoteActionCompatParcelizer().read;
                                    if (gethasnontranslationcomponentsannotations2 != null) {
                                        gethasnontranslationcomponentsannotations2.RemoteActionCompatParcelizer("chat_native_tap_to_web_start");
                                        gethasnontranslationcomponentsannotations2.RemoteActionCompatParcelizer("chat_native_after_load_url");
                                        gethasnontranslationcomponentsannotations2.IconCompatParcelizer("chat_web_start_to_rendered");
                                    }
                                }
                                if (!((Boolean) webChatFragment.read().MediaSessionCompatToken.read()).booleanValue()) {
                                    if (!webChatFragment.MediaMetadataCompat().PlaybackStateCompatCustomAction) {
                                        int i20 = RemoteActionCompatParcelizer + 117;
                                        IconCompatParcelizer = i20 % Fields.SpotShadowColor;
                                        if (i20 % 2 == 0) {
                                            webChatFragment.read("Page already loaded, subsequent open - stopping trace immediately for instant load");
                                            getHasNonTranslationComponentsannotations gethasnontranslationcomponentsannotations3 = webChatFragment.RemoteActionCompatParcelizer().read;
                                            throw null;
                                        }
                                        webChatFragment.read("Page already loaded, subsequent open - stopping trace immediately for instant load");
                                        getHasNonTranslationComponentsannotations gethasnontranslationcomponentsannotations4 = webChatFragment.RemoteActionCompatParcelizer().read;
                                        if (gethasnontranslationcomponentsannotations4 != null) {
                                            gethasnontranslationcomponentsannotations4.IconCompatParcelizer("chat_web_start_to_rendered");
                                            gethasnontranslationcomponentsannotations4.RemoteActionCompatParcelizer("chat_web_start_to_rendered");
                                            gethasnontranslationcomponentsannotations4.RemoteActionCompatParcelizer("chat_e2e_tap_to_page_loaded");
                                            if (gethasnontranslationcomponentsannotations4.RemoteActionCompatParcelizer()) {
                                                getTransaction gettransaction = gethasnontranslationcomponentsannotations4.RatingCompat;
                                                if (gettransaction != null) {
                                                    gettransaction.RemoteActionCompatParcelizer();
                                                }
                                                gethasnontranslationcomponentsannotations4.MediaSessionCompatQueueItem.clear();
                                                gethasnontranslationcomponentsannotations4.RatingCompat = null;
                                            }
                                        }
                                    }
                                    MutableStateFlow mutableStateFlow = webChatFragment.IconCompatParcelizer().r8lambdaXj9c8VIP9DfEvaTmZt0ejAuC4a4;
                                    do {
                                        obj2 = mutableStateFlow.read();
                                    } while (!mutableStateFlow.RemoteActionCompatParcelizer(obj2, VectorPropertyScaleX.serializer((VectorPropertyScaleX) obj2, null, false, false, null, false, 27)));
                                }
                            }
                        } else {
                            String string2 = Uri.parse(str7).buildUpon().appendQueryParameter("ts", String.valueOf(System.currentTimeMillis())).build().toString();
                            string2.getClass();
                            webChatFragment.IconCompatParcelizer(string2);
                        }
                    }
                    if (z3) {
                        MutableStateFlow mutableStateFlow2 = webChatFragment.IconCompatParcelizer().r8lambdaXj9c8VIP9DfEvaTmZt0ejAuC4a4;
                        do {
                            obj3 = mutableStateFlow2.read();
                        } while (!mutableStateFlow2.RemoteActionCompatParcelizer(obj3, VectorPropertyScaleX.serializer((VectorPropertyScaleX) obj3, null, false, false, null, false, 15)));
                    }
                }
            }
        }
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        return createfromparcel;
    }
}
