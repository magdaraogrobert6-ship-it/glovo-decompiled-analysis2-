package o;

import android.webkit.JavascriptInterface;
import androidx.lifecycle.BlockRunner$cancel$1;
import androidx.lifecycle.FlowLiveDataConversions$asFlow$1$1;
import com.deliveryhero.perseus.logger.PerseusLogger$w$1;
import com.deliveryhero.selfServiceChat.ui.BridgeManager$handleIncomingMessage$1;
import java.util.ArrayList;
import java.util.concurrent.CancellationException;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.channels.BufferedChannel;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.internal.ContextScope;
import kotlinx.serialization.SerializationException;

/* JADX INFO: loaded from: classes2.dex */
public final class VectorPainterKtRenderVectorGroup1 {
    public final /* synthetic */ obtainSizePxVpY3zN4 IconCompatParcelizer;

    @JavascriptInterface
    public final void postMessage(String str) {
        getY2 gety2;
        obtainSizePxVpY3zN4 obtainsizepxvpy3zn4 = this.IconCompatParcelizer;
        ContextScope contextScope = obtainsizepxvpy3zn4.MediaDescriptionCompat;
        str.getClass();
        int i = 1;
        ShortNewsContentCardView shortNewsContentCardView = null;
        try {
            gety2 = (getY2) getViewportSizeNHjbRcui.IconCompatParcelizer.serializer(str, VectorComposeKtPath24.write);
        } catch (SerializationException e) {
            LayerSnapshotV21 layerSnapshotV21Write = ((ViewLayerVerificationHelper31) obtainsizepxvpy3zn4.RemoteActionCompatParcelizer).write();
            if (layerSnapshotV21Write != null && layerSnapshotV21Write.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY) {
                String message = e.getMessage();
                if (message == null) {
                    message = "Serialization error while receiving a message in preloading mode";
                }
                BuildersKt.RemoteActionCompatParcelizer(contextScope, null, null, new FlowLiveDataConversions$asFlow$1$1(obtainsizepxvpy3zn4, new VectorComposeKtGroup23("HOST_ENCOUNTERED_ERROR_" + System.currentTimeMillis(), new VectorComposeKtGroup28(new VectorComposeKtGroup24(message))), (ShortNewsContentCardView) null, 10), 3);
            }
            gety2 = null;
        } catch (Exception e2) {
            e2.printStackTrace();
            gety2 = null;
        }
        if (gety2 != null) {
            ArrayList arrayList = obtainsizepxvpy3zn4.MediaSessionCompatQueueItem;
            MutableStateFlow mutableStateFlow = obtainsizepxvpy3zn4.write;
            MutableStateFlow mutableStateFlow2 = obtainsizepxvpy3zn4.IconCompatParcelizer;
            BufferedChannel bufferedChannel = obtainsizepxvpy3zn4.read;
            if (gety2 instanceof insertTopDown) {
                obtainsizepxvpy3zn4.serializer();
                mutableStateFlow2.IconCompatParcelizer(Boolean.TRUE);
                BuildersKt.RemoteActionCompatParcelizer(contextScope, null, null, new FlowLiveDataConversions$asFlow$1$1(obtainsizepxvpy3zn4, new VectorComposeKtGroup26("HOST_IS_READY_" + System.currentTimeMillis(), new VectorComposeKtPath11(accessgetRootScaleXp.write)), (ShortNewsContentCardView) null, 10), 3);
                mutableStateFlow.IconCompatParcelizer(obtainViewportSizePq9zytI.serializer);
                obtainsizepxvpy3zn4.MediaBrowserCompatMediaItem = BuildersKt.RemoteActionCompatParcelizer(contextScope, null, null, new BlockRunner$cancel$1(obtainsizepxvpy3zn4, shortNewsContentCardView, 24), 3);
                return;
            }
            if (gety2 instanceof insertBottomUp) {
                r8lambda7Q1QCWXCUHrhcsGraulDg_ksbGU r8lambda7q1qcwxcuhrhcsgrauldg_ksbgu = obtainsizepxvpy3zn4.MediaBrowserCompatMediaItem;
                if (r8lambda7q1qcwxcuhrhcsgrauldg_ksbgu != null) {
                    r8lambda7q1qcwxcuhrhcsgrauldg_ksbgu.write((CancellationException) null);
                }
                obtainsizepxvpy3zn4.MediaBrowserCompatMediaItem = null;
                mutableStateFlow.IconCompatParcelizer(mirror.RemoteActionCompatParcelizer);
                obtainsizepxvpy3zn4.IconCompatParcelizer(new BridgeManager$handleIncomingMessage$1(obtainsizepxvpy3zn4, null, 0));
                return;
            }
            if (gety2 instanceof getEmptyArray) {
                mutableStateFlow.IconCompatParcelizer(rememberVectorPainter.IconCompatParcelizer);
                obtainsizepxvpy3zn4.IconCompatParcelizer(new BridgeManager$handleIncomingMessage$1(obtainsizepxvpy3zn4, null, 1));
                return;
            }
            if (gety2 instanceof getDy3) {
                if (obtainsizepxvpy3zn4.ComponentActivity) {
                    bufferedChannel.b_(gety2);
                    return;
                } else {
                    arrayList.add(gety2);
                    return;
                }
            }
            if (gety2 instanceof toNodes) {
                if (obtainsizepxvpy3zn4.ComponentActivity) {
                    bufferedChannel.b_(gety2);
                    return;
                } else {
                    arrayList.add(gety2);
                    return;
                }
            }
            if (gety2 instanceof PathNodeRelativeCurveTo) {
                if (obtainsizepxvpy3zn4.ComponentActivity) {
                    bufferedChannel.b_(gety2);
                } else {
                    arrayList.add(gety2);
                }
                mutableStateFlow2.IconCompatParcelizer(Boolean.FALSE);
                return;
            }
            if (!(gety2 instanceof pathNodesFromArgs)) {
                bufferedChannel.b_(gety2);
                return;
            }
            if (obtainsizepxvpy3zn4.ComponentActivity) {
                bufferedChannel.b_(gety2);
            } else {
                obtainsizepxvpy3zn4.IconCompatParcelizer(new PerseusLogger$w$1((pathNodesFromArgs) gety2, obtainsizepxvpy3zn4, shortNewsContentCardView, i));
            }
            obtainsizepxvpy3zn4.MediaSessionCompatResultReceiverWrapper.set(true);
            mutableStateFlow2.IconCompatParcelizer(Boolean.FALSE);
        }
    }

    public VectorPainterKtRenderVectorGroup1(obtainSizePxVpY3zN4 obtainsizepxvpy3zn4) {
        this.IconCompatParcelizer = obtainsizepxvpy3zn4;
    }
}
