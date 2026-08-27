package com.deliveryhero.selfServiceChat.ui;

import android.content.Context;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.webkit.ConsoleMessage;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.ValueCallback;
import android.webkit.WebChromeClient;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.camera.core.streamsharing.StreamSharing$$ExternalSyntheticLambda0;
import androidx.collection.ObjectList$toString$1;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.FlowLiveDataConversions$asFlow$1$1;
import androidx.navigation.fragment.FragmentNavigator$$ExternalSyntheticLambda0;
import coil3.ExtrasKt;
import com.common_ui.databinding.ItemSingleChoiceBinding;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import com.logistics.rider.glovo.R;
import com.mapbox.maps.extension.style.layers.LayerUtils$getLayer$source$2;
import java.lang.ref.WeakReference;
import kotlin.LazyKt__LazyJVMKt;
import kotlinx.coroutines.BuildersKt;
import o.ActualSweepGradientShader9KIMszo;
import o.GraphicsViewLayer;
import o.LayerSnapshotV21;
import o.LayerSnapshotV22;
import o.RequestDisallowInterceptTouchEvent;
import o.ShortNewsContentCardView;
import o.VectorPainterKtRenderVectorGroup1;
import o.VectorPainterKtRenderVectorGroup2;
import o.VectorPropertyTranslateX;
import o.ViewLayer;
import o.ViewLayerVerificationHelper31;
import o.asComposePaint;
import o.discardDisplayListInternalui_graphics;
import o.getCieXyz;
import o.getConfig;
import o.getConfigfwf_client_release;
import o.getDefaultJoinLxFBmk8;
import o.getFwfEventValueTransformerfwf_client_release;
import o.getHasNonTranslationComponentsannotations;
import o.getSizeNHjbRcui;
import o.hideCurrentlyDisplayingInAppMessage;
import o.isIdentityannotations;
import o.obtainSizePxVpY3zN4;
import o.onBackPressed;
import o.onImageAvailable;
import o.onPictureInPictureModeChanged;
import o.onViewDetachedFromWindowlambda0;
import o.onViewDetachedFromWindowlambda1;
import o.removeNodeAtDepth;
import o.setCarryoverInAppMessage;
import o.setOutlineAmbientShadowColor;
import o.toBitmapConfig1JJdX4A;
import o.z7ExternalSyntheticLambda0;

/* JADX INFO: loaded from: classes2.dex */
public final class WebChatFragment extends Fragment implements getFwfEventValueTransformerfwf_client_release {
    public final onViewDetachedFromWindowlambda1 IconCompatParcelizer;
    public final FragmentNavigator$$ExternalSyntheticLambda0 MediaBrowserCompatMediaItem;
    public final onViewDetachedFromWindowlambda1 MediaDescriptionCompat;
    public final onViewDetachedFromWindowlambda1 MediaMetadataCompat;
    public ValueCallback MediaSessionCompatQueueItem;
    public final onViewDetachedFromWindowlambda1 MediaSessionCompatResultReceiverWrapper;
    public final onViewDetachedFromWindowlambda1 MediaSessionCompatToken;
    public WebView ParcelableVolumeInfo;
    public final onBackPressed PlaybackStateCompatCustomAction;
    public final onViewDetachedFromWindowlambda1 RatingCompat;
    public final onViewDetachedFromWindowlambda1 RemoteActionCompatParcelizer;
    public final onViewDetachedFromWindowlambda1 read;
    public final onViewDetachedFromWindowlambda1 serializer;
    public ItemSingleChoiceBinding write;

    @Override // o.getFwfEventValueTransformerfwf_client_release
    public final getConfigfwf_client_release write() {
        return RequestDisallowInterceptTouchEvent.write();
    }

    public static String serializer(String str) {
        String encodedPath;
        if (str == null || hideCurrentlyDisplayingInAppMessage.serializer((CharSequence) str)) {
            return null;
        }
        try {
            Uri uri = Uri.parse(str);
            if (uri == null || (encodedPath = uri.getEncodedPath()) == null) {
                encodedPath = "/";
            }
            return (encodedPath.length() <= 1 || !hideCurrentlyDisplayingInAppMessage.write((CharSequence) encodedPath, '/')) ? encodedPath : encodedPath.substring(0, encodedPath.length() - 1);
        } catch (Throwable unused) {
            return null;
        }
    }

    public final WebChatViewmodel IconCompatParcelizer() {
        return (WebChatViewmodel) this.MediaSessionCompatToken.MediaSessionCompatResultReceiverWrapper();
    }

    public final WebViewManager MediaMetadataCompat() {
        return (WebViewManager) this.MediaSessionCompatResultReceiverWrapper.MediaSessionCompatResultReceiverWrapper();
    }

    public final onImageAvailable RemoteActionCompatParcelizer() {
        return (onImageAvailable) this.serializer.MediaSessionCompatResultReceiverWrapper();
    }

    public final obtainSizePxVpY3zN4 read() {
        return (obtainSizePxVpY3zN4) this.read.MediaSessionCompatResultReceiverWrapper();
    }

    public final setOutlineAmbientShadowColor serializer() {
        return (setOutlineAmbientShadowColor) this.RemoteActionCompatParcelizer.MediaSessionCompatResultReceiverWrapper();
    }

    /* JADX WARN: Code duplicated, block: B:65:0x01b7  */
    /* JADX WARN: Code duplicated, block: B:76:0x01df A[PHI: r0
  0x01df: PHI (r0v3 int) = (r0v2 int), (r0v4 int) binds: [B:11:0x0041, B:13:0x004d] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        getHasNonTranslationComponentsannotations gethasnontranslationcomponentsannotations;
        layoutInflater.getClass();
        getHasNonTranslationComponentsannotations gethasnontranslationcomponentsannotations2 = RemoteActionCompatParcelizer().read;
        if (gethasnontranslationcomponentsannotations2 != null) {
            gethasnontranslationcomponentsannotations2.RemoteActionCompatParcelizer("chat_native_fragment_launch");
        }
        getHasNonTranslationComponentsannotations gethasnontranslationcomponentsannotations3 = RemoteActionCompatParcelizer().read;
        if (gethasnontranslationcomponentsannotations3 != null) {
            gethasnontranslationcomponentsannotations3.IconCompatParcelizer("chat_native_fragment_on_create_view");
        }
        final int i = 0;
        View viewInflate = getLayoutInflater().inflate(R.layout.customer_chat_web_fragment, viewGroup, false);
        int i2 = R.id.error_state;
        View viewRemoteActionCompatParcelizer = ExtrasKt.RemoteActionCompatParcelizer(R.id.error_state, viewInflate);
        ShortNewsContentCardView shortNewsContentCardView = null;
        if (viewRemoteActionCompatParcelizer != null) {
            getDefaultJoinLxFBmk8 getdefaultjoinlxfbmk8IconCompatParcelizer = getDefaultJoinLxFBmk8.IconCompatParcelizer(viewRemoteActionCompatParcelizer);
            int i3 = R.id.iv_back;
            ImageView imageView = (ImageView) ExtrasKt.RemoteActionCompatParcelizer(R.id.iv_back, viewInflate);
            if (imageView != null) {
                FrameLayout frameLayout = (FrameLayout) viewInflate;
                i3 = R.id.loading_state;
                View viewRemoteActionCompatParcelizer2 = ExtrasKt.RemoteActionCompatParcelizer(R.id.loading_state, viewInflate);
                if (viewRemoteActionCompatParcelizer2 != null) {
                    final int i4 = 1;
                    z7ExternalSyntheticLambda0 z7externalsyntheticlambda0 = new z7ExternalSyntheticLambda0((LinearLayout) viewRemoteActionCompatParcelizer2, 1);
                    FrameLayout frameLayout2 = (FrameLayout) ExtrasKt.RemoteActionCompatParcelizer(R.id.webview_container, viewInflate);
                    if (frameLayout2 != null) {
                        ItemSingleChoiceBinding itemSingleChoiceBinding = new ItemSingleChoiceBinding(frameLayout, frameLayout2, imageView, getdefaultjoinlxfbmk8IconCompatParcelizer, z7externalsyntheticlambda0);
                        this.write = itemSingleChoiceBinding;
                        LayerSnapshotV21 layerSnapshotV21Write = ((ViewLayerVerificationHelper31) serializer()).write();
                        if (BuildersKt.write(layerSnapshotV21Write != null ? layerSnapshotV21Write.r8lambda54BeH8ZsBru0CXI2CCSP2syNys : null)) {
                            isIdentityannotations isidentityannotations = RemoteActionCompatParcelizer().serializer;
                            if (isidentityannotations != null) {
                                isidentityannotations.RemoteActionCompatParcelizer(LayerSnapshotV22.INFO, "selfServiceChat", "Attaching preloaded WebView instance to fragment", null);
                            }
                            LayerSnapshotV21 layerSnapshotV21Write2 = ((ViewLayerVerificationHelper31) serializer()).write();
                            boolean z = layerSnapshotV21Write2 != null && layerSnapshotV21Write2.MediaSessionCompatQueueItem;
                            try {
                                WebViewManager webViewManagerMediaMetadataCompat = MediaMetadataCompat();
                                Context contextRequireContext = requireContext();
                                contextRequireContext.getClass();
                                webViewManagerMediaMetadataCompat.serializer(contextRequireContext);
                                WebViewManager webViewManagerMediaMetadataCompat2 = MediaMetadataCompat();
                                ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-1, -1);
                                webViewManagerMediaMetadataCompat2.getClass();
                                WebView webView = webViewManagerMediaMetadataCompat2.ParcelableVolumeInfo;
                                if (webView != null) {
                                    webViewManagerMediaMetadataCompat2.write();
                                    ViewParent parent = webView.getParent();
                                    ViewGroup viewGroup2 = parent instanceof ViewGroup ? (ViewGroup) parent : null;
                                    if (viewGroup2 != null) {
                                        viewGroup2.removeView(webView);
                                    }
                                    frameLayout2.addView(webView, layoutParams);
                                }
                                WebView webView2 = MediaMetadataCompat().ParcelableVolumeInfo;
                                this.ParcelableVolumeInfo = webView2;
                                if (webView2 != null) {
                                    write(webView2, true);
                                }
                                BuildersKt.RemoteActionCompatParcelizer(toBitmapConfig1JJdX4A.read(getLifecycle()), null, null, new WebChatFragment$onCreateView$1$2(this, shortNewsContentCardView, i), 3);
                                BuildersKt.RemoteActionCompatParcelizer(toBitmapConfig1JJdX4A.read(getLifecycle()), null, null, new WebChatFragment$onCreateView$1$2(this, shortNewsContentCardView, 3), 3);
                                getLifecycle().IconCompatParcelizer(this.MediaBrowserCompatMediaItem);
                                ((GraphicsViewLayer) ((discardDisplayListInternalui_graphics) this.MediaDescriptionCompat.MediaSessionCompatResultReceiverWrapper())).serializer.serializer(getViewLifecycleOwner(), new ActualSweepGradientShader9KIMszo(new ObjectList$toString$1(12, this), i4));
                                IconCompatParcelizer().RemoteActionCompatParcelizer(false);
                                imageView.setOnClickListener(new View.OnClickListener(this) { // from class: com.deliveryhero.selfServiceChat.ui.WebChatFragment$$ExternalSyntheticLambda2
                                    public final /* synthetic */ WebChatFragment IconCompatParcelizer;

                                    {
                                        this.IconCompatParcelizer = this;
                                    }

                                    @Override // android.view.View.OnClickListener
                                    public final void onClick(View view) {
                                        int i5 = i;
                                        WebChatFragment webChatFragment = this.IconCompatParcelizer;
                                        if (i5 == 0) {
                                            webChatFragment.requireActivity().onBackPressed();
                                        } else if (i5 != 1) {
                                            webChatFragment.IconCompatParcelizer().RemoteActionCompatParcelizer(true);
                                        } else {
                                            webChatFragment.MediaDescriptionCompat();
                                        }
                                    }
                                });
                                ((ImageView) getdefaultjoinlxfbmk8IconCompatParcelizer.write).setOnClickListener(new View.OnClickListener(this) { // from class: com.deliveryhero.selfServiceChat.ui.WebChatFragment$$ExternalSyntheticLambda2
                                    public final /* synthetic */ WebChatFragment IconCompatParcelizer;

                                    {
                                        this.IconCompatParcelizer = this;
                                    }

                                    @Override // android.view.View.OnClickListener
                                    public final void onClick(View view) {
                                        int i5 = i4;
                                        WebChatFragment webChatFragment = this.IconCompatParcelizer;
                                        if (i5 == 0) {
                                            webChatFragment.requireActivity().onBackPressed();
                                        } else if (i5 != 1) {
                                            webChatFragment.IconCompatParcelizer().RemoteActionCompatParcelizer(true);
                                        } else {
                                            webChatFragment.MediaDescriptionCompat();
                                        }
                                    }
                                });
                                final int i5 = 2;
                                ((Button) getdefaultjoinlxfbmk8IconCompatParcelizer.read).setOnClickListener(new View.OnClickListener(this) { // from class: com.deliveryhero.selfServiceChat.ui.WebChatFragment$$ExternalSyntheticLambda2
                                    public final /* synthetic */ WebChatFragment IconCompatParcelizer;

                                    {
                                        this.IconCompatParcelizer = this;
                                    }

                                    @Override // android.view.View.OnClickListener
                                    public final void onClick(View view) {
                                        int i6 = i5;
                                        WebChatFragment webChatFragment = this.IconCompatParcelizer;
                                        if (i6 == 0) {
                                            webChatFragment.requireActivity().onBackPressed();
                                        } else if (i6 != 1) {
                                            webChatFragment.IconCompatParcelizer().RemoteActionCompatParcelizer(true);
                                        } else {
                                            webChatFragment.MediaDescriptionCompat();
                                        }
                                    }
                                });
                                gethasnontranslationcomponentsannotations = RemoteActionCompatParcelizer().read;
                                if (gethasnontranslationcomponentsannotations != null) {
                                    gethasnontranslationcomponentsannotations.RemoteActionCompatParcelizer("chat_native_fragment_on_create_view");
                                }
                            } catch (Throwable th) {
                                if (!z) {
                                    throw th;
                                }
                                isIdentityannotations isidentityannotations2 = RemoteActionCompatParcelizer().serializer;
                                if (isidentityannotations2 != null) {
                                    isidentityannotations2.RemoteActionCompatParcelizer(LayerSnapshotV22.ERROR, "WEB_PRELOADING", "Failed to create WebView instance in preloading flow from WebChatFragment.", th);
                                }
                                requireActivity().finish();
                            }
                        } else {
                            LayerSnapshotV21 layerSnapshotV21Write3 = ((ViewLayerVerificationHelper31) serializer()).write();
                            boolean z2 = layerSnapshotV21Write3 != null && layerSnapshotV21Write3.MediaSessionCompatQueueItem;
                            isIdentityannotations isidentityannotations3 = RemoteActionCompatParcelizer().serializer;
                            if (isidentityannotations3 != null) {
                                isidentityannotations3.RemoteActionCompatParcelizer(LayerSnapshotV22.INFO, "selfServiceChat", "create WebView instance to fragment", null);
                            }
                            try {
                                WebView webView3 = new WebView(requireContext());
                                frameLayout2.addView(webView3);
                                this.ParcelableVolumeInfo = webView3;
                                write(webView3, false);
                                BuildersKt.RemoteActionCompatParcelizer(toBitmapConfig1JJdX4A.read(getLifecycle()), null, null, new WebChatFragment$onCreateView$1$2(this, shortNewsContentCardView, i), 3);
                                BuildersKt.RemoteActionCompatParcelizer(toBitmapConfig1JJdX4A.read(getLifecycle()), null, null, new WebChatFragment$onCreateView$1$2(this, shortNewsContentCardView, 3), 3);
                                getLifecycle().IconCompatParcelizer(this.MediaBrowserCompatMediaItem);
                                ((GraphicsViewLayer) ((discardDisplayListInternalui_graphics) this.MediaDescriptionCompat.MediaSessionCompatResultReceiverWrapper())).serializer.serializer(getViewLifecycleOwner(), new ActualSweepGradientShader9KIMszo(new ObjectList$toString$1(12, this), i4));
                                IconCompatParcelizer().RemoteActionCompatParcelizer(false);
                                imageView.setOnClickListener(new View.OnClickListener(this) { // from class: com.deliveryhero.selfServiceChat.ui.WebChatFragment$$ExternalSyntheticLambda2
                                    public final /* synthetic */ WebChatFragment IconCompatParcelizer;

                                    {
                                        this.IconCompatParcelizer = this;
                                    }

                                    @Override // android.view.View.OnClickListener
                                    public final void onClick(View view) {
                                        int i6 = i;
                                        WebChatFragment webChatFragment = this.IconCompatParcelizer;
                                        if (i6 == 0) {
                                            webChatFragment.requireActivity().onBackPressed();
                                        } else if (i6 != 1) {
                                            webChatFragment.IconCompatParcelizer().RemoteActionCompatParcelizer(true);
                                        } else {
                                            webChatFragment.MediaDescriptionCompat();
                                        }
                                    }
                                });
                                ((ImageView) getdefaultjoinlxfbmk8IconCompatParcelizer.write).setOnClickListener(new View.OnClickListener(this) { // from class: com.deliveryhero.selfServiceChat.ui.WebChatFragment$$ExternalSyntheticLambda2
                                    public final /* synthetic */ WebChatFragment IconCompatParcelizer;

                                    {
                                        this.IconCompatParcelizer = this;
                                    }

                                    @Override // android.view.View.OnClickListener
                                    public final void onClick(View view) {
                                        int i6 = i4;
                                        WebChatFragment webChatFragment = this.IconCompatParcelizer;
                                        if (i6 == 0) {
                                            webChatFragment.requireActivity().onBackPressed();
                                        } else if (i6 != 1) {
                                            webChatFragment.IconCompatParcelizer().RemoteActionCompatParcelizer(true);
                                        } else {
                                            webChatFragment.MediaDescriptionCompat();
                                        }
                                    }
                                });
                                final int i6 = 2;
                                ((Button) getdefaultjoinlxfbmk8IconCompatParcelizer.read).setOnClickListener(new View.OnClickListener(this) { // from class: com.deliveryhero.selfServiceChat.ui.WebChatFragment$$ExternalSyntheticLambda2
                                    public final /* synthetic */ WebChatFragment IconCompatParcelizer;

                                    {
                                        this.IconCompatParcelizer = this;
                                    }

                                    @Override // android.view.View.OnClickListener
                                    public final void onClick(View view) {
                                        int i7 = i6;
                                        WebChatFragment webChatFragment = this.IconCompatParcelizer;
                                        if (i7 == 0) {
                                            webChatFragment.requireActivity().onBackPressed();
                                        } else if (i7 != 1) {
                                            webChatFragment.IconCompatParcelizer().RemoteActionCompatParcelizer(true);
                                        } else {
                                            webChatFragment.MediaDescriptionCompat();
                                        }
                                    }
                                });
                                gethasnontranslationcomponentsannotations = RemoteActionCompatParcelizer().read;
                                if (gethasnontranslationcomponentsannotations != null) {
                                    gethasnontranslationcomponentsannotations.RemoteActionCompatParcelizer("chat_native_fragment_on_create_view");
                                }
                            } catch (Throwable th2) {
                                if (!z2) {
                                    throw th2;
                                }
                                isIdentityannotations isidentityannotations4 = RemoteActionCompatParcelizer().serializer;
                                if (isidentityannotations4 != null) {
                                    isidentityannotations4.RemoteActionCompatParcelizer(LayerSnapshotV22.ERROR, "selfServiceChat", "Failed to create WebView instance", th2);
                                }
                                requireActivity().finish();
                            }
                        }
                        FrameLayout frameLayout3 = (FrameLayout) itemSingleChoiceBinding.RemoteActionCompatParcelizer;
                        frameLayout3.getClass();
                        return frameLayout3;
                    }
                    i2 = R.id.webview_container;
                } else {
                    i2 = i3;
                }
            } else {
                i2 = i3;
            }
        }
        ScreenStartObserver$$ExternalSyntheticLambda0.RemoteActionCompatParcelizer("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i2)));
        return null;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onStart() {
        super.onStart();
        ((getSizeNHjbRcui) IconCompatParcelizer().MediaSessionCompatResultReceiverWrapper).write = true;
        IconCompatParcelizer().IconCompatParcelizer(true, this.MediaSessionCompatQueueItem != null);
    }

    public final void MediaDescriptionCompat() {
        WebChatViewmodel webChatViewmodelIconCompatParcelizer = IconCompatParcelizer();
        webChatViewmodelIconCompatParcelizer.getClass();
        asComposePaint ascomposepaintIconCompatParcelizer = toBitmapConfig1JJdX4A.IconCompatParcelizer(webChatViewmodelIconCompatParcelizer);
        BuildersKt.RemoteActionCompatParcelizer(ascomposepaintIconCompatParcelizer, new getConfig(ascomposepaintIconCompatParcelizer, webChatViewmodelIconCompatParcelizer, 2), null, new WebChatViewmodel$startTimerForTimeout$1$1((ShortNewsContentCardView) null, webChatViewmodelIconCompatParcelizer, 1), 2);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroy() {
        super.onDestroy();
        this.MediaSessionCompatQueueItem = null;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onStop() {
        ((getSizeNHjbRcui) IconCompatParcelizer().MediaSessionCompatResultReceiverWrapper).write = false;
        IconCompatParcelizer().IconCompatParcelizer(false, this.MediaSessionCompatQueueItem != null);
        super.onStop();
    }

    public final void read(String str) {
        isIdentityannotations isidentityannotations = RemoteActionCompatParcelizer().serializer;
        if (isidentityannotations != null) {
            isidentityannotations.RemoteActionCompatParcelizer(LayerSnapshotV22.INFO, "WEB_PRELOADING", str, null);
        }
    }

    public final void IconCompatParcelizer(String str) {
        getHasNonTranslationComponentsannotations gethasnontranslationcomponentsannotations;
        MediaMetadataCompat().PlaybackStateCompatCustomAction = false;
        onImageAvailable onimageavailableRemoteActionCompatParcelizer = RemoteActionCompatParcelizer();
        if (onimageavailableRemoteActionCompatParcelizer != null && (gethasnontranslationcomponentsannotations = onimageavailableRemoteActionCompatParcelizer.read) != null) {
            gethasnontranslationcomponentsannotations.RemoteActionCompatParcelizer("chat_native_before_load_url");
            gethasnontranslationcomponentsannotations.IconCompatParcelizer("chat_native_after_load_url");
        }
        WebView webView = this.ParcelableVolumeInfo;
        if (webView != null) {
            webView.loadUrl(str);
        }
    }

    public final void write(WebView webView, boolean z) {
        this.ParcelableVolumeInfo = webView;
        if (!z) {
            if ((requireContext().getApplicationInfo().flags & 2) != 0) {
                WebView.setWebContentsDebuggingEnabled(true);
            }
            WebSettings settings = webView.getSettings();
            settings.setJavaScriptEnabled(true);
            settings.setBuiltInZoomControls(false);
            settings.setDomStorageEnabled(true);
        }
        webView.setWebChromeClient(new WebChromeClient() { // from class: com.deliveryhero.selfServiceChat.ui.WebChatFragment$setupViews$1$2
            @Override // android.webkit.WebChromeClient
            public final boolean onConsoleMessage(ConsoleMessage consoleMessage) {
                return true;
            }

            @Override // android.webkit.WebChromeClient
            public final boolean onShowFileChooser(WebView webView2, ValueCallback valueCallback, WebChromeClient.FileChooserParams fileChooserParams) {
                webView2.getClass();
                valueCallback.getClass();
                fileChooserParams.getClass();
                WebChatFragment webChatFragment = this.serializer;
                ValueCallback valueCallback2 = webChatFragment.MediaSessionCompatQueueItem;
                if (valueCallback2 != null) {
                    valueCallback2.onReceiveValue(null);
                }
                webChatFragment.MediaSessionCompatQueueItem = valueCallback;
                WebChatViewmodel webChatViewmodelIconCompatParcelizer = webChatFragment.IconCompatParcelizer();
                webChatViewmodelIconCompatParcelizer.getClass();
                asComposePaint ascomposepaintIconCompatParcelizer = toBitmapConfig1JJdX4A.IconCompatParcelizer(webChatViewmodelIconCompatParcelizer);
                BuildersKt.RemoteActionCompatParcelizer(ascomposepaintIconCompatParcelizer, new getConfig(ascomposepaintIconCompatParcelizer, webChatViewmodelIconCompatParcelizer, 2), null, new WebChatViewmodel$startTimerForTimeout$1$1((ShortNewsContentCardView) null, webChatViewmodelIconCompatParcelizer, 7), 2);
                return true;
            }
        });
        webView.setWebViewClient(new WebViewClient() { // from class: com.deliveryhero.selfServiceChat.ui.WebChatFragment$setupViews$1$3
            @Override // android.webkit.WebViewClient
            public final void onPageStarted(WebView webView2, String str, Bitmap bitmap) {
                WebChatFragment webChatFragment = this.read;
                if (webChatFragment.MediaMetadataCompat().PlaybackStateCompatCustomAction) {
                    webChatFragment.read("OnPageStarted called but trace already started in handleState");
                } else {
                    webChatFragment.read("OnPageStarted called on Fragment's client, starting trace (most accurate!)");
                    getHasNonTranslationComponentsannotations gethasnontranslationcomponentsannotations = webChatFragment.RemoteActionCompatParcelizer().read;
                    if (gethasnontranslationcomponentsannotations != null) {
                        gethasnontranslationcomponentsannotations.RemoteActionCompatParcelizer("chat_native_tap_to_web_start");
                        gethasnontranslationcomponentsannotations.RemoteActionCompatParcelizer("chat_native_after_load_url");
                        gethasnontranslationcomponentsannotations.IconCompatParcelizer("chat_web_start_to_rendered");
                    }
                }
                super.onPageStarted(webView2, str, bitmap);
            }

            @Override // android.webkit.WebViewClient
            public final boolean onRenderProcessGone(WebView webView2, RenderProcessGoneDetail renderProcessGoneDetail) {
                WebChatFragment webChatFragment = this.read;
                isIdentityannotations isidentityannotations = webChatFragment.RemoteActionCompatParcelizer().serializer;
                if (isidentityannotations != null) {
                    LayerSnapshotV22 layerSnapshotV22 = LayerSnapshotV22.ERROR;
                    StringBuilder sb = new StringBuilder("Webview render process gone unexpectedly. ");
                    sb.append(renderProcessGoneDetail != null ? Boolean.valueOf(renderProcessGoneDetail.didCrash()) : null);
                    String string = sb.toString();
                    StringBuilder sb2 = new StringBuilder("Webview render process gone ");
                    sb2.append(renderProcessGoneDetail != null ? Boolean.valueOf(renderProcessGoneDetail.didCrash()) : null);
                    isidentityannotations.RemoteActionCompatParcelizer(layerSnapshotV22, "WEB_PRELOADING", string, new Throwable(sb2.toString()));
                }
                LayerSnapshotV21 layerSnapshotV21Write = ((ViewLayerVerificationHelper31) webChatFragment.serializer()).write();
                if (layerSnapshotV21Write == null || !layerSnapshotV21Write.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY) {
                    return super.onRenderProcessGone(webView2, renderProcessGoneDetail);
                }
                if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{layerSnapshotV21Write.r8lambda54BeH8ZsBru0CXI2CCSP2syNys, ViewLayer.INSTANCE}, getCieXyz.write())).booleanValue()) {
                    webChatFragment.read().MediaSessionCompatResultReceiverWrapper.set(true);
                }
                WebChatViewmodel webChatViewmodelIconCompatParcelizer = webChatFragment.IconCompatParcelizer();
                webChatViewmodelIconCompatParcelizer.getClass();
                asComposePaint ascomposepaintIconCompatParcelizer = toBitmapConfig1JJdX4A.IconCompatParcelizer(webChatViewmodelIconCompatParcelizer);
                BuildersKt.RemoteActionCompatParcelizer(ascomposepaintIconCompatParcelizer, new getConfig(ascomposepaintIconCompatParcelizer, webChatViewmodelIconCompatParcelizer, 2), null, new FlowLiveDataConversions$asFlow$1$1(webChatViewmodelIconCompatParcelizer, null), 2);
                return true;
            }

            @Override // android.webkit.WebViewClient
            public final boolean shouldOverrideUrlLoading(WebView webView2, String str) {
                str.getClass();
                if (setCarryoverInAppMessage.RemoteActionCompatParcelizer(str, "tel:", false) || webView2 == null) {
                    return true;
                }
                webView2.loadUrl(str);
                return true;
            }
        });
        LayerSnapshotV21 layerSnapshotV21Write = ((ViewLayerVerificationHelper31) serializer()).write();
        if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{layerSnapshotV21Write != null ? layerSnapshotV21Write.r8lambda54BeH8ZsBru0CXI2CCSP2syNys : null, ViewLayer.INSTANCE}, getCieXyz.write())).booleanValue()) {
            obtainSizePxVpY3zN4 obtainsizepxvpy3zn4 = read();
            if (obtainsizepxvpy3zn4.PlaybackStateCompatCustomAction) {
                return;
            }
            obtainsizepxvpy3zn4.PlaybackStateCompat = webView;
            webView.addJavascriptInterface(new VectorPainterKtRenderVectorGroup1(obtainsizepxvpy3zn4), "hcAndroidBridgeEntry");
            obtainsizepxvpy3zn4.PlaybackStateCompatCustomAction = true;
            return;
        }
        getHasNonTranslationComponentsannotations gethasnontranslationcomponentsannotations = RemoteActionCompatParcelizer().read;
        if (gethasnontranslationcomponentsannotations != null) {
            gethasnontranslationcomponentsannotations.IconCompatParcelizer("chat_native_add_webview_javascript_interface");
        }
        webView.addJavascriptInterface(new VectorPainterKtRenderVectorGroup2(new WeakReference(IconCompatParcelizer())), "hcAndroidBridgeEntry");
        getHasNonTranslationComponentsannotations gethasnontranslationcomponentsannotations2 = RemoteActionCompatParcelizer().read;
        if (gethasnontranslationcomponentsannotations2 != null) {
            gethasnontranslationcomponentsannotations2.RemoteActionCompatParcelizer("chat_native_add_webview_javascript_interface");
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public WebChatFragment() {
        int i = 4;
        this.MediaSessionCompatToken = LazyKt__LazyJVMKt.serializer(onViewDetachedFromWindowlambda0.NONE, new LayerUtils$getLayer$source$2(this, i, new VectorPropertyTranslateX(this, 8)));
        onViewDetachedFromWindowlambda0 onviewdetachedfromwindowlambda0 = onViewDetachedFromWindowlambda0.SYNCHRONIZED;
        this.serializer = LazyKt__LazyJVMKt.serializer(onviewdetachedfromwindowlambda0, new VectorPropertyTranslateX(this, 1));
        int i2 = 2;
        this.RemoteActionCompatParcelizer = LazyKt__LazyJVMKt.serializer(onviewdetachedfromwindowlambda0, new VectorPropertyTranslateX(this, i2));
        int i3 = 3;
        this.MediaMetadataCompat = LazyKt__LazyJVMKt.serializer(onviewdetachedfromwindowlambda0, new VectorPropertyTranslateX(this, i3));
        this.MediaSessionCompatResultReceiverWrapper = LazyKt__LazyJVMKt.serializer(onviewdetachedfromwindowlambda0, new VectorPropertyTranslateX(this, i));
        this.RatingCompat = LazyKt__LazyJVMKt.serializer(onviewdetachedfromwindowlambda0, new VectorPropertyTranslateX(this, 5));
        this.IconCompatParcelizer = LazyKt__LazyJVMKt.serializer(onviewdetachedfromwindowlambda0, new VectorPropertyTranslateX(this, 6));
        this.read = LazyKt__LazyJVMKt.serializer(onviewdetachedfromwindowlambda0, new VectorPropertyTranslateX(this, 7));
        this.MediaDescriptionCompat = LazyKt__LazyJVMKt.serializer(onviewdetachedfromwindowlambda0, new LayerUtils$getLayer$source$2(this, i3, new VectorPropertyTranslateX(this, 0)));
        onBackPressed onbackpressedRegisterForActivityResult = registerForActivityResult(new onPictureInPictureModeChanged(0 == true ? 1 : 0, i2), new StreamSharing$$ExternalSyntheticLambda0(25, this));
        onbackpressedRegisterForActivityResult.getClass();
        this.PlaybackStateCompatCustomAction = onbackpressedRegisterForActivityResult;
        this.MediaBrowserCompatMediaItem = new FragmentNavigator$$ExternalSyntheticLambda0(i2, this);
    }
}
