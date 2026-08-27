package o;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.widget.Toast;
import androidx.activity.result.ActivityResult;
import androidx.constraintlayout.compose.ConstraintSetForInlineDsl$applyTo$1;
import com.mapbox.maps.extension.style.layers.LayerUtils$getLayer$source$2;
import o.AndroidGraphicsContext2;
import o.GraphicsViewLayer;
import o.requiresLayerPaint;
import o.setTestFailCreateRenderNodeui_graphics;

/* JADX INFO: loaded from: classes2.dex */
public final class GraphicsViewLayer implements discardDisplayListInternalui_graphics {
    public final onBackPressed RemoteActionCompatParcelizer;
    public final onBackPressed read;
    public final AndroidGraphicsContext2 serializer;

    /* JADX WARN: Multi-variable type inference failed */
    public GraphicsViewLayer(androidx.activity.result.ActivityResultRegistry activityResultRegistry) {
        activityResultRegistry.getClass();
        this.serializer = new AndroidGraphicsContext2();
        final int i = 1;
        final int i2 = 0;
        activityResultRegistry.register("Image Picker", new onPictureInPictureModeChanged(i), new getNavigationEventDispatcher(this) { // from class: com.deliveryhero.chatui.view.chatroom.navigator.ImageSelectionNavigatorImpl$$ExternalSyntheticLambda0
            public final /* synthetic */ GraphicsViewLayer read;

            {
                this.read = this;
            }

            @Override // o.getNavigationEventDispatcher
            public final void onActivityResult(Object obj) {
                int i3 = i2;
                Object settestfailcreaterendernodeui_graphics = requiresLayerPaint.write;
                GraphicsViewLayer graphicsViewLayer = this.read;
                if (i3 == 0) {
                    Uri uri = (Uri) obj;
                    AndroidGraphicsContext2 androidGraphicsContext2 = graphicsViewLayer.serializer;
                    if (uri != null) {
                        settestfailcreaterendernodeui_graphics = new setTestFailCreateRenderNodeui_graphics(55661, uri);
                    }
                    androidGraphicsContext2.RemoteActionCompatParcelizer(settestfailcreaterendernodeui_graphics);
                    return;
                }
                if (i3 == 1) {
                    Boolean bool = (Boolean) obj;
                    AndroidGraphicsContext2 androidGraphicsContext3 = graphicsViewLayer.serializer;
                    bool.getClass();
                    if (bool.booleanValue()) {
                        settestfailcreaterendernodeui_graphics = new setTestFailCreateRenderNodeui_graphics(55660, null);
                    }
                    androidGraphicsContext3.RemoteActionCompatParcelizer(settestfailcreaterendernodeui_graphics);
                    return;
                }
                ActivityResult activityResult = (ActivityResult) obj;
                AndroidGraphicsContext2 androidGraphicsContext4 = graphicsViewLayer.serializer;
                if (activityResult.write == -1) {
                    Intent intent = activityResult.RemoteActionCompatParcelizer;
                    Uri data = intent != null ? intent.getData() : null;
                    settestfailcreaterendernodeui_graphics = data != null ? new setTestFailCreateRenderNodeui_graphics(55662, data) : new setTestFailCreateRenderNodeui_graphics(55662, null);
                }
                androidGraphicsContext4.RemoteActionCompatParcelizer(settestfailcreaterendernodeui_graphics);
            }
        }).getClass();
        onBackPressed onbackpressedRegister = activityResultRegistry.register("Camera", new onPictureInPictureModeChanged(0 == true ? 1 : 0, 0 == true ? 1 : 0), new getNavigationEventDispatcher(this) { // from class: com.deliveryhero.chatui.view.chatroom.navigator.ImageSelectionNavigatorImpl$$ExternalSyntheticLambda0
            public final /* synthetic */ GraphicsViewLayer read;

            {
                this.read = this;
            }

            @Override // o.getNavigationEventDispatcher
            public final void onActivityResult(Object obj) {
                int i3 = i;
                Object settestfailcreaterendernodeui_graphics = requiresLayerPaint.write;
                GraphicsViewLayer graphicsViewLayer = this.read;
                if (i3 == 0) {
                    Uri uri = (Uri) obj;
                    AndroidGraphicsContext2 androidGraphicsContext2 = graphicsViewLayer.serializer;
                    if (uri != null) {
                        settestfailcreaterendernodeui_graphics = new setTestFailCreateRenderNodeui_graphics(55661, uri);
                    }
                    androidGraphicsContext2.RemoteActionCompatParcelizer(settestfailcreaterendernodeui_graphics);
                    return;
                }
                if (i3 == 1) {
                    Boolean bool = (Boolean) obj;
                    AndroidGraphicsContext2 androidGraphicsContext3 = graphicsViewLayer.serializer;
                    bool.getClass();
                    if (bool.booleanValue()) {
                        settestfailcreaterendernodeui_graphics = new setTestFailCreateRenderNodeui_graphics(55660, null);
                    }
                    androidGraphicsContext3.RemoteActionCompatParcelizer(settestfailcreaterendernodeui_graphics);
                    return;
                }
                ActivityResult activityResult = (ActivityResult) obj;
                AndroidGraphicsContext2 androidGraphicsContext4 = graphicsViewLayer.serializer;
                if (activityResult.write == -1) {
                    Intent intent = activityResult.RemoteActionCompatParcelizer;
                    Uri data = intent != null ? intent.getData() : null;
                    settestfailcreaterendernodeui_graphics = data != null ? new setTestFailCreateRenderNodeui_graphics(55662, data) : new setTestFailCreateRenderNodeui_graphics(55662, null);
                }
                androidGraphicsContext4.RemoteActionCompatParcelizer(settestfailcreaterendernodeui_graphics);
            }
        });
        onbackpressedRegister.getClass();
        this.read = onbackpressedRegister;
        final int i3 = 2;
        onBackPressed onbackpressedRegister2 = activityResultRegistry.register("Chooser", new times7Ah8Wj8(i3), new getNavigationEventDispatcher(this) { // from class: com.deliveryhero.chatui.view.chatroom.navigator.ImageSelectionNavigatorImpl$$ExternalSyntheticLambda0
            public final /* synthetic */ GraphicsViewLayer read;

            {
                this.read = this;
            }

            @Override // o.getNavigationEventDispatcher
            public final void onActivityResult(Object obj) {
                int i4 = i3;
                Object settestfailcreaterendernodeui_graphics = requiresLayerPaint.write;
                GraphicsViewLayer graphicsViewLayer = this.read;
                if (i4 == 0) {
                    Uri uri = (Uri) obj;
                    AndroidGraphicsContext2 androidGraphicsContext2 = graphicsViewLayer.serializer;
                    if (uri != null) {
                        settestfailcreaterendernodeui_graphics = new setTestFailCreateRenderNodeui_graphics(55661, uri);
                    }
                    androidGraphicsContext2.RemoteActionCompatParcelizer(settestfailcreaterendernodeui_graphics);
                    return;
                }
                if (i4 == 1) {
                    Boolean bool = (Boolean) obj;
                    AndroidGraphicsContext2 androidGraphicsContext3 = graphicsViewLayer.serializer;
                    bool.getClass();
                    if (bool.booleanValue()) {
                        settestfailcreaterendernodeui_graphics = new setTestFailCreateRenderNodeui_graphics(55660, null);
                    }
                    androidGraphicsContext3.RemoteActionCompatParcelizer(settestfailcreaterendernodeui_graphics);
                    return;
                }
                ActivityResult activityResult = (ActivityResult) obj;
                AndroidGraphicsContext2 androidGraphicsContext4 = graphicsViewLayer.serializer;
                if (activityResult.write == -1) {
                    Intent intent = activityResult.RemoteActionCompatParcelizer;
                    Uri data = intent != null ? intent.getData() : null;
                    settestfailcreaterendernodeui_graphics = data != null ? new setTestFailCreateRenderNodeui_graphics(55662, data) : new setTestFailCreateRenderNodeui_graphics(55662, null);
                }
                androidGraphicsContext4.RemoteActionCompatParcelizer(settestfailcreaterendernodeui_graphics);
            }
        });
        onbackpressedRegister2.getClass();
        this.RemoteActionCompatParcelizer = onbackpressedRegister2;
    }

    public final void serializer(Context context, isPlacementApproachInProgress isplacementapproachinprogress) {
        isplacementapproachinprogress.getClass();
        int i = 1;
        if (isplacementapproachinprogress instanceof GraphicsLayerV29) {
            try {
                new LayerUtils$getLayer$source$2(this, i, isplacementapproachinprogress).invoke();
            } catch (Exception unused) {
                Toast.makeText(context, context.getText(com.logistics.rider.glovo.R.string.customer_chat_error_open_camera), 0).show();
            }
        } else if (isplacementapproachinprogress instanceof accessgetMayRenderInSoftwarecp) {
            try {
                new ConstraintSetForInlineDsl$applyTo$1(this, context, isplacementapproachinprogress, i).invoke();
            } catch (Exception unused2) {
                Toast.makeText(context, context.getText(com.logistics.rider.glovo.R.string.customer_chat_all_error), 0).show();
            }
        }
    }
}
