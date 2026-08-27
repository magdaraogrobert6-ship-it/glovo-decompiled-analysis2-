package o;

import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import androidx.compose.runtime.Recomposer$$ExternalSyntheticLambda4;

/* JADX INFO: loaded from: classes.dex */
public final class findOverlaps extends ConnectivityManager.NetworkCallback {
    private static int RemoteActionCompatParcelizer = 0;
    private static int serializer = 1;
    public static final /* synthetic */ int write = 0;
    public final /* synthetic */ int IconCompatParcelizer;
    public final Object read;

    public findOverlaps(Recomposer$$ExternalSyntheticLambda4 recomposer$$ExternalSyntheticLambda4) {
        this.IconCompatParcelizer = 0;
        this.read = recomposer$$ExternalSyntheticLambda4;
    }

    public /* synthetic */ findOverlaps(int i, Object obj) {
        this.IconCompatParcelizer = i;
        this.read = obj;
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public void onBlockedStatusChanged(Network network, boolean z) {
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 15;
        serializer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        if (this.IconCompatParcelizer != 4) {
            super.onBlockedStatusChanged(network, z);
            return;
        }
        if (!z) {
            ((r8lambdaYT7KkhvXyPX5qC1jtJtr5iFnrzo) this.read).read.serializer();
        }
        int i4 = serializer + 43;
        RemoteActionCompatParcelizer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public void onCapabilitiesChanged(Network network, NetworkCapabilities networkCapabilities) {
        int i = 2 % 2;
        int i2 = serializer + 67;
        RemoteActionCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        Object obj = null;
        if (i2 % 2 != 0) {
            obj.hashCode();
            throw null;
        }
        if (this.IconCompatParcelizer != 0) {
            super.onCapabilitiesChanged(network, networkCapabilities);
            int i3 = RemoteActionCompatParcelizer + 125;
            serializer = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            if (i3 % 2 != 0) {
                return;
            }
            obj.hashCode();
            throw null;
        }
        network.getClass();
        networkCapabilities.getClass();
        setRotationX setrotationx = setRotationX.read();
        int i4 = forEachui_graphics.IconCompatParcelizer;
        setrotationx.getClass();
        ((Recomposer$$ExternalSyntheticLambda4) this.read).invoke(rotateRight.read);
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public void onAvailable(Network network) throws Exception {
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 111;
        serializer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        int i4 = this.IconCompatParcelizer;
        Object obj = this.read;
        if (i4 == 1) {
            network.getClass();
            super.onAvailable(network);
            GraphicsLayerV23Companion graphicsLayerV23Companion = (GraphicsLayerV23Companion) obj;
            if (!graphicsLayerV23Companion.write) {
                graphicsLayerV23Companion.write = true;
                return;
            }
            return;
        }
        if (i4 == 2) {
            ((com.huawei.agconnect.config.impl.m) obj).read(true);
            return;
        }
        if (i4 != 3) {
            if (i4 != 4) {
                super.onAvailable(network);
                return;
            } else {
                ((r8lambdaYT7KkhvXyPX5qC1jtJtr5iFnrzo) obj).read.serializer();
                return;
            }
        }
        network.getClass();
        super.onAvailable(network);
        ceilToInt ceiltoint = (ceilToInt) obj;
        if (!(!ceiltoint.IconCompatParcelizer)) {
            return;
        }
        int i5 = RemoteActionCompatParcelizer + 41;
        serializer = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i6 = i5 % 2;
        ceiltoint.read.invoke(Boolean.TRUE);
        ceiltoint.IconCompatParcelizer = true;
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public void onLost(Network network) throws Exception {
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 103;
        serializer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        int i3 = this.IconCompatParcelizer;
        Object obj2 = this.read;
        if (i3 == 0) {
            network.getClass();
            setRotationX setrotationx = setRotationX.read();
            int i4 = forEachui_graphics.IconCompatParcelizer;
            setrotationx.getClass();
            ((Recomposer$$ExternalSyntheticLambda4) obj2).invoke(new rebalance(7));
            return;
        }
        if (i3 == 1) {
            network.getClass();
            super.onLost(network);
            GraphicsLayerV23Companion graphicsLayerV23Companion = (GraphicsLayerV23Companion) obj2;
            if (graphicsLayerV23Companion.write) {
                int i5 = RemoteActionCompatParcelizer + 27;
                serializer = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                int i6 = i5 % 2;
                graphicsLayerV23Companion.write = false;
                return;
            }
            return;
        }
        if (i3 == 2) {
            ((com.huawei.agconnect.config.impl.m) obj2).read(false);
            return;
        }
        if (i3 != 3) {
            super.onLost(network);
            return;
        }
        network.getClass();
        super.onLost(network);
        ceilToInt ceiltoint = (ceilToInt) obj2;
        if (!(!ceiltoint.IconCompatParcelizer)) {
            ceiltoint.read.invoke(Boolean.FALSE);
            ceiltoint.IconCompatParcelizer = false;
        }
    }
}
