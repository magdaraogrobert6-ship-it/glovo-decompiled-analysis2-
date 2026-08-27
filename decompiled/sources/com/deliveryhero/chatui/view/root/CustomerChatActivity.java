package com.deliveryhero.chatui.view.root;

import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import com.deliveryhero.contract.configuration.PersistableChatConfiguration$Companion;
import com.deliveryhero.customerchat.CustomerChatModule;
import com.deliveryhero.customerchat.CustomerChatModule$fetchUserFeatures$1;
import com.deliveryhero.customerchat.CustomerChatModule$sendMessage$2;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import com.deliveryhero.selfServiceChat.ui.WebChatFragment;
import com.logistics.rider.glovo.R;
import kotlin.LazyKt__LazyJVMKt;
import kotlinx.coroutines.BuildersKt;
import o.GraphicsLayerImpl;
import o.LayerSnapshotV21;
import o.LayerSnapshotV28;
import o.OutlineVerificationHelper;
import o.RenderNodeVerificationHelper24;
import o.RenderNodeVerificationHelper28;
import o.RequestDisallowInterceptTouchEvent;
import o.ShortNewsContentCardView;
import o.accessgetVcp;
import o.div7Ah8Wj8;
import o.getAmbientShadowColor;
import o.getChildCount;
import o.getConfigfwf_client_release;
import o.getDefaultJoinLxFBmk8;
import o.getFwfEventValueTransformerfwf_client_release;
import o.getHasNonTranslationComponentsannotations;
import o.getMayRenderInSoftware;
import o.getPlaceholderCanvas;
import o.hideCurrentlyDisplayingInAppMessage;
import o.isInfiniteannotations;
import o.isVerticalSwipeInAllowedDirection;
import o.onImageAvailable;
import o.onViewDetachedFromWindowlambda0;
import o.onViewDetachedFromWindowlambda1;
import o.recordDrawingOperations;
import o.resetTransientState;
import o.setGraphicModalMaxWidthDp;
import o.setTopLeftgyyYBs;
import o.toBitmapConfig1JJdX4A;
import o.updateClipBounds;

/* JADX INFO: loaded from: classes2.dex */
public final class CustomerChatActivity extends AppCompatActivity implements getFwfEventValueTransformerfwf_client_release {
    private static boolean MediaSessionCompatQueueItem;
    public static final updateClipBounds RatingCompat = new updateClipBounds();
    private getChildCount MediaBrowserCompatMediaItem;
    private final onViewDetachedFromWindowlambda1 MediaDescriptionCompat;
    private final onViewDetachedFromWindowlambda1 MediaSessionCompatResultReceiverWrapper;
    private final onViewDetachedFromWindowlambda1 PlaybackStateCompatCustomAction = LazyKt__LazyJVMKt.serializer(onViewDetachedFromWindowlambda0.NONE, new recordDrawingOperations(this, 2));

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onStop() {
        MediaSessionCompatQueueItem = false;
        getHasNonTranslationComponentsannotations gethasnontranslationcomponentsannotations = IconCompatParcelizer().read;
        if (gethasnontranslationcomponentsannotations != null) {
            gethasnontranslationcomponentsannotations.IconCompatParcelizer();
        }
        super.onStop();
    }

    @Override // o.getFwfEventValueTransformerfwf_client_release
    public getConfigfwf_client_release write() {
        return RequestDisallowInterceptTouchEvent.write();
    }

    private final onImageAvailable IconCompatParcelizer() {
        return (onImageAvailable) this.MediaSessionCompatResultReceiverWrapper.MediaSessionCompatResultReceiverWrapper();
    }

    private final void IconCompatParcelizer(Bundle bundle) {
        accessgetVcp accessgetvcp = CustomerChatModule.write;
        Application application = getApplication();
        application.getClass();
        BuildersKt.RemoteActionCompatParcelizer(toBitmapConfig1JJdX4A.read(getLifecycle()), null, null, new CustomerChatActivity$observeState$1(this, bundle, accessgetvcp.serializer(application), null, 0), 3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void IconCompatParcelizer(getChildCount getchildcount, getMayRenderInSoftware getmayrenderinsoftware) {
        getchildcount.serializer.setVisibility(getmayrenderinsoftware.read() != null ? 0 : 8);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final CustomerChatViewModel RemoteActionCompatParcelizer() {
        return (CustomerChatViewModel) this.PlaybackStateCompatCustomAction.MediaSessionCompatResultReceiverWrapper();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void RemoteActionCompatParcelizer(String str, CustomerChatModule customerChatModule) {
        if (str == null || str.equals(customerChatModule.read().read)) {
            return;
        }
        customerChatModule.serializer(new CustomerChatModule$sendMessage$2(str, 1));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void RemoteActionCompatParcelizer(getChildCount getchildcount, getMayRenderInSoftware getmayrenderinsoftware) {
        getchildcount.write.read().setVisibility(getmayrenderinsoftware.RemoteActionCompatParcelizer() ? 0 : 8);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void read(getChildCount getchildcount, getMayRenderInSoftware getmayrenderinsoftware) {
        getchildcount.RemoteActionCompatParcelizer.read().setVisibility(getmayrenderinsoftware.serializer() ? 0 : 8);
    }

    private final setTopLeftgyyYBs serializer() {
        return (setTopLeftgyyYBs) this.MediaDescriptionCompat.MediaSessionCompatResultReceiverWrapper();
    }

    private final void serializer(Bundle bundle) {
        if (bundle.containsKey("CAMERA_IMAGE_PATH")) {
            String string = bundle.getString("CAMERA_IMAGE_PATH");
            if (string == null) {
                string = "";
            }
            if (string.length() > 0) {
                ((GraphicsLayerImpl) serializer()).RemoteActionCompatParcelizer(string);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void write(getChildCount getchildcount, getMayRenderInSoftware getmayrenderinsoftware) {
        getchildcount.read.setVisibility(getmayrenderinsoftware.read() == null ? 0 : 8);
    }

    public CustomerChatActivity() {
        onViewDetachedFromWindowlambda0 onviewdetachedfromwindowlambda0 = onViewDetachedFromWindowlambda0.SYNCHRONIZED;
        this.MediaDescriptionCompat = LazyKt__LazyJVMKt.serializer(onviewdetachedfromwindowlambda0, new recordDrawingOperations(this, 0));
        this.MediaSessionCompatResultReceiverWrapper = LazyKt__LazyJVMKt.serializer(onviewdetachedfromwindowlambda0, new recordDrawingOperations(this, 1));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void MediaDescriptionCompat(CustomerChatActivity customerChatActivity, View view) {
        customerChatActivity.getClass();
        customerChatActivity.RemoteActionCompatParcelizer().IconCompatParcelizer();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void read(CustomerChatActivity customerChatActivity, View view) {
        customerChatActivity.getClass();
        customerChatActivity.onBackPressed();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void serializer(CustomerChatActivity customerChatActivity, View view) {
        customerChatActivity.getClass();
        customerChatActivity.onBackPressed();
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        getHasNonTranslationComponentsannotations gethasnontranslationcomponentsannotations = IconCompatParcelizer().read;
        if (gethasnontranslationcomponentsannotations != null) {
            gethasnontranslationcomponentsannotations.RemoteActionCompatParcelizer("chat_native_activity_launch");
        }
        getHasNonTranslationComponentsannotations gethasnontranslationcomponentsannotations2 = IconCompatParcelizer().read;
        if (gethasnontranslationcomponentsannotations2 != null) {
            gethasnontranslationcomponentsannotations2.IconCompatParcelizer("chat_native_activity_on_create");
        }
        read(bundle);
        getHasNonTranslationComponentsannotations gethasnontranslationcomponentsannotations3 = IconCompatParcelizer().read;
        if (gethasnontranslationcomponentsannotations3 != null) {
            gethasnontranslationcomponentsannotations3.IconCompatParcelizer("chat_native_activity_set_theme");
        }
        setTheme(RemoteActionCompatParcelizer().serializer.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM);
        final int i = 1;
        getTheme().applyStyle(RemoteActionCompatParcelizer().serializer.ResultReceiver.getTheme(), true);
        getHasNonTranslationComponentsannotations gethasnontranslationcomponentsannotations4 = IconCompatParcelizer().read;
        if (gethasnontranslationcomponentsannotations4 != null) {
            gethasnontranslationcomponentsannotations4.RemoteActionCompatParcelizer("chat_native_activity_set_theme");
        }
        CustomerChatViewModel customerChatViewModelRemoteActionCompatParcelizer = RemoteActionCompatParcelizer();
        LayerSnapshotV21 layerSnapshotV21 = customerChatViewModelRemoteActionCompatParcelizer.serializer;
        OutlineVerificationHelper outlineVerificationHelper = layerSnapshotV21.RemoteActionCompatParcelizer;
        if (outlineVerificationHelper != null) {
            String str = outlineVerificationHelper.customer;
        }
        getAmbientShadowColor getambientshadowcolor = layerSnapshotV21.MediaSessionCompatToken;
        if (!(getambientshadowcolor instanceof RenderNodeVerificationHelper24)) {
            if (!(getambientshadowcolor instanceof RenderNodeVerificationHelper28)) {
                ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer();
                return;
            } else {
                RenderNodeVerificationHelper28 renderNodeVerificationHelper28 = (RenderNodeVerificationHelper28) getambientshadowcolor;
                if (!renderNodeVerificationHelper28.supportedTranslations.isEmpty()) {
                    hideCurrentlyDisplayingInAppMessage.serializer((CharSequence) renderNodeVerificationHelper28.preferredLanguage);
                }
            }
        }
        customerChatViewModelRemoteActionCompatParcelizer.IconCompatParcelizer();
        getHasNonTranslationComponentsannotations gethasnontranslationcomponentsannotations5 = IconCompatParcelizer().read;
        if (gethasnontranslationcomponentsannotations5 != null) {
            gethasnontranslationcomponentsannotations5.IconCompatParcelizer("chat_native_activity_view_inflation");
        }
        getChildCount getchildcountWrite = getChildCount.write(getLayoutInflater());
        getDefaultJoinLxFBmk8 getdefaultjoinlxfbmk8 = getchildcountWrite.RemoteActionCompatParcelizer;
        setContentView(getchildcountWrite.serializer());
        final int i2 = 0;
        getchildcountWrite.read.setOnClickListener(new View.OnClickListener(this) { // from class: o.applyCompositingLayerWpw9cng
            public final /* synthetic */ com.deliveryhero.chatui.view.root.CustomerChatActivity serializer;

            {
                this.serializer = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i3 = i2;
                com.deliveryhero.chatui.view.root.CustomerChatActivity customerChatActivity = this.serializer;
                if (i3 == 0) {
                    com.deliveryhero.chatui.view.root.CustomerChatActivity.serializer(customerChatActivity, view);
                } else if (i3 != 1) {
                    com.deliveryhero.chatui.view.root.CustomerChatActivity.MediaDescriptionCompat(customerChatActivity, view);
                } else {
                    com.deliveryhero.chatui.view.root.CustomerChatActivity.read(customerChatActivity, view);
                }
            }
        });
        ((ImageView) getdefaultjoinlxfbmk8.write).setOnClickListener(new View.OnClickListener(this) { // from class: o.applyCompositingLayerWpw9cng
            public final /* synthetic */ com.deliveryhero.chatui.view.root.CustomerChatActivity serializer;

            {
                this.serializer = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i3 = i;
                com.deliveryhero.chatui.view.root.CustomerChatActivity customerChatActivity = this.serializer;
                if (i3 == 0) {
                    com.deliveryhero.chatui.view.root.CustomerChatActivity.serializer(customerChatActivity, view);
                } else if (i3 != 1) {
                    com.deliveryhero.chatui.view.root.CustomerChatActivity.MediaDescriptionCompat(customerChatActivity, view);
                } else {
                    com.deliveryhero.chatui.view.root.CustomerChatActivity.read(customerChatActivity, view);
                }
            }
        });
        final int i3 = 2;
        ((Button) getdefaultjoinlxfbmk8.read).setOnClickListener(new View.OnClickListener(this) { // from class: o.applyCompositingLayerWpw9cng
            public final /* synthetic */ com.deliveryhero.chatui.view.root.CustomerChatActivity serializer;

            {
                this.serializer = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i4 = i3;
                com.deliveryhero.chatui.view.root.CustomerChatActivity customerChatActivity = this.serializer;
                if (i4 == 0) {
                    com.deliveryhero.chatui.view.root.CustomerChatActivity.serializer(customerChatActivity, view);
                } else if (i4 != 1) {
                    com.deliveryhero.chatui.view.root.CustomerChatActivity.MediaDescriptionCompat(customerChatActivity, view);
                } else {
                    com.deliveryhero.chatui.view.root.CustomerChatActivity.read(customerChatActivity, view);
                }
            }
        });
        this.MediaBrowserCompatMediaItem = getchildcountWrite;
        getHasNonTranslationComponentsannotations gethasnontranslationcomponentsannotations6 = IconCompatParcelizer().read;
        if (gethasnontranslationcomponentsannotations6 != null) {
            gethasnontranslationcomponentsannotations6.RemoteActionCompatParcelizer("chat_native_activity_view_inflation");
        }
        IconCompatParcelizer(bundle);
        getHasNonTranslationComponentsannotations gethasnontranslationcomponentsannotations7 = IconCompatParcelizer().read;
        if (gethasnontranslationcomponentsannotations7 != null) {
            gethasnontranslationcomponentsannotations7.RemoteActionCompatParcelizer("chat_native_activity_on_create");
        }
    }

    @Override // androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onSaveInstanceState(Bundle bundle) {
        bundle.getClass();
        super.onSaveInstanceState(bundle);
        bundle.putString("PERSISTABLE_CHAT_CONFIGURATION", resetTransientState.read.RemoteActionCompatParcelizer(LayerSnapshotV28.Companion.serializer(), RemoteActionCompatParcelizer().serializer.serializer()));
        bundle.putString("CAMERA_IMAGE_PATH", ((GraphicsLayerImpl) serializer()).IconCompatParcelizer());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void IconCompatParcelizer(Boolean bool, Bundle bundle) {
        if (bool == null || bundle != null) {
            return;
        }
        getHasNonTranslationComponentsannotations gethasnontranslationcomponentsannotations = IconCompatParcelizer().read;
        if (gethasnontranslationcomponentsannotations != null) {
            gethasnontranslationcomponentsannotations.IconCompatParcelizer("chat_native_activity_load_web_fragment");
        }
        div7Ah8Wj8 supportFragmentManager = getSupportFragmentManager();
        supportFragmentManager.getClass();
        isInfiniteannotations isinfiniteannotations = new isInfiniteannotations(supportFragmentManager);
        isinfiniteannotations.IconCompatParcelizer(R.id.container_open_channel, new WebChatFragment(), null);
        isinfiniteannotations.read(true, true);
        getHasNonTranslationComponentsannotations gethasnontranslationcomponentsannotations2 = IconCompatParcelizer().read;
        if (gethasnontranslationcomponentsannotations2 != null) {
            gethasnontranslationcomponentsannotations2.IconCompatParcelizer("chat_native_fragment_launch");
        }
        getHasNonTranslationComponentsannotations gethasnontranslationcomponentsannotations3 = IconCompatParcelizer().read;
        if (gethasnontranslationcomponentsannotations3 != null) {
            gethasnontranslationcomponentsannotations3.RemoteActionCompatParcelizer("chat_native_activity_load_web_fragment");
        }
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0028  */
    private final void read(Bundle bundle) {
        LayerSnapshotV21 layerSnapshotV21RemoteActionCompatParcelizer;
        LayerSnapshotV28 layerSnapshotV28;
        if (bundle != null) {
            String string = bundle.getString("PERSISTABLE_CHAT_CONFIGURATION");
            ShortNewsContentCardView shortNewsContentCardView = null;
            if (string != null) {
                PersistableChatConfiguration$Companion persistableChatConfiguration$Companion = LayerSnapshotV28.Companion;
                persistableChatConfiguration$Companion.getClass();
                try {
                    isVerticalSwipeInAllowedDirection isverticalswipeinalloweddirection = resetTransientState.read;
                    setGraphicModalMaxWidthDp setgraphicmodalmaxwidthdpSerializer = persistableChatConfiguration$Companion.serializer();
                    setGraphicModalMaxWidthDp setgraphicmodalmaxwidthdp = setgraphicmodalmaxwidthdpSerializer;
                    layerSnapshotV28 = (LayerSnapshotV28) isverticalswipeinalloweddirection.serializer(string, setgraphicmodalmaxwidthdpSerializer);
                } catch (Exception unused) {
                    layerSnapshotV28 = null;
                }
                if (layerSnapshotV28 != null) {
                    layerSnapshotV21RemoteActionCompatParcelizer = layerSnapshotV28.RemoteActionCompatParcelizer();
                } else {
                    layerSnapshotV21RemoteActionCompatParcelizer = null;
                }
            } else {
                layerSnapshotV21RemoteActionCompatParcelizer = null;
            }
            if (layerSnapshotV21RemoteActionCompatParcelizer != null) {
                accessgetVcp accessgetvcp = CustomerChatModule.write;
                Application application = getApplication();
                application.getClass();
                CustomerChatModule customerChatModuleSerializer = accessgetvcp.serializer(application);
                LayerSnapshotV21 layerSnapshotV21 = customerChatModuleSerializer.read();
                layerSnapshotV21.getClass();
                layerSnapshotV21.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus = layerSnapshotV21RemoteActionCompatParcelizer.read();
                layerSnapshotV21.RemoteActionCompatParcelizer = layerSnapshotV21RemoteActionCompatParcelizer.RemoteActionCompatParcelizer;
                layerSnapshotV21.read = layerSnapshotV21RemoteActionCompatParcelizer.read;
                layerSnapshotV21.write = layerSnapshotV21RemoteActionCompatParcelizer.write();
                layerSnapshotV21.MediaBrowserCompatMediaItem = layerSnapshotV21RemoteActionCompatParcelizer.MediaBrowserCompatMediaItem;
                layerSnapshotV21.MediaDescriptionCompat = layerSnapshotV21RemoteActionCompatParcelizer.MediaDescriptionCompat;
                layerSnapshotV21.PlaybackStateCompatCustomAction = layerSnapshotV21RemoteActionCompatParcelizer.PlaybackStateCompatCustomAction;
                layerSnapshotV21.PlaybackStateCompat = layerSnapshotV21RemoteActionCompatParcelizer.PlaybackStateCompat;
                layerSnapshotV21.MediaSessionCompatToken = layerSnapshotV21RemoteActionCompatParcelizer.MediaSessionCompatToken;
                layerSnapshotV21.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM = layerSnapshotV21RemoteActionCompatParcelizer.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM;
                layerSnapshotV21.ResultReceiver = layerSnapshotV21RemoteActionCompatParcelizer.ResultReceiver;
                layerSnapshotV21.ComponentActivity.IconCompatParcelizer(layerSnapshotV21RemoteActionCompatParcelizer.RemoteActionCompatParcelizer());
                layerSnapshotV21.ParcelableVolumeInfo = layerSnapshotV21RemoteActionCompatParcelizer.ParcelableVolumeInfo;
                layerSnapshotV21.RatingCompat = layerSnapshotV21RemoteActionCompatParcelizer.RatingCompat;
                layerSnapshotV21.IconCompatParcelizer = layerSnapshotV21RemoteActionCompatParcelizer.IconCompatParcelizer;
                layerSnapshotV21.MediaSessionCompatResultReceiverWrapper = layerSnapshotV21RemoteActionCompatParcelizer.MediaSessionCompatResultReceiverWrapper;
                layerSnapshotV21.r8lambda54BeH8ZsBru0CXI2CCSP2syNys = layerSnapshotV21RemoteActionCompatParcelizer.r8lambda54BeH8ZsBru0CXI2CCSP2syNys;
                layerSnapshotV21.MediaSessionCompatQueueItem = layerSnapshotV21RemoteActionCompatParcelizer.MediaSessionCompatQueueItem;
                layerSnapshotV21.MediaMetadataCompat = layerSnapshotV21RemoteActionCompatParcelizer.MediaMetadataCompat;
                layerSnapshotV21.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY = layerSnapshotV21RemoteActionCompatParcelizer.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY;
                BuildersKt.RemoteActionCompatParcelizer(customerChatModuleSerializer.RatingCompat, null, null, new CustomerChatModule$fetchUserFeatures$1(customerChatModuleSerializer, shortNewsContentCardView, 1), 3);
                customerChatModuleSerializer.PlaybackStateCompat.getAndSet(true);
                customerChatModuleSerializer.write();
            }
            serializer(bundle);
        }
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        this.MediaBrowserCompatMediaItem = null;
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onStart() {
        super.onStart();
        MediaSessionCompatQueueItem = true;
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        Fragment fragmentFindFragmentById = getSupportFragmentManager().findFragmentById(R.id.container_open_channel);
        WebChatFragment webChatFragment = fragmentFindFragmentById instanceof WebChatFragment ? (WebChatFragment) fragmentFindFragmentById : null;
        if (webChatFragment != null) {
            webChatFragment.MediaDescriptionCompat();
            if (getPlaceholderCanvas.write() != null) {
                return;
            }
        }
        getOnBackPressedDispatcher().IconCompatParcelizer();
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public void attachBaseContext(Context context) {
        super.attachBaseContext(context);
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onPause() {
        super.onPause();
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onResume() {
        super.onResume();
    }
}
