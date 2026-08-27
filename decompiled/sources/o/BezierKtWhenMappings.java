package o;

import android.content.Context;
import android.net.Uri;
import android.os.Build;
import android.view.InputEvent;
import androidx.lifecycle.BlockRunner$cancel$1;
import androidx.lifecycle.BlockRunner$maybeRun$1;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.YieldKt;

/* JADX INFO: loaded from: classes.dex */
public final class BezierKtWhenMappings {
    public final PointerInteropFilter_androidKtmotionEventSpy11 IconCompatParcelizer;

    public DrawModifierNodeKt IconCompatParcelizer(unitDivide unitdivide) {
        throw null;
    }

    public DrawModifierNodeKt read(accessgetColorBurncp accessgetcolorburncp) {
        throw null;
    }

    public DrawModifierNodeKt serializer(accessgetColorDodgecp accessgetcolordodgecp) {
        throw null;
    }

    public DrawModifierNodeKt serializer() {
        return FeatureInfoJsonAdapter.RemoteActionCompatParcelizer(BuildersKt.IconCompatParcelizer(YieldKt.RemoteActionCompatParcelizer(prepareForActivityTransitionCarryover.RemoteActionCompatParcelizer), null, null, new BlockRunner$cancel$1(this, (ShortNewsContentCardView) null, 14), 3));
    }

    public BezierKtWhenMappings(PointerInteropFilter_androidKtmotionEventSpy11 pointerInteropFilter_androidKtmotionEventSpy11) {
        this.IconCompatParcelizer = pointerInteropFilter_androidKtmotionEventSpy11;
    }

    public static final BezierKtWhenMappings write(Context context) {
        Object objInvoke;
        PointerInteropFilter_androidKtmotionEventSpy11 accessgetclearcp;
        context.getClass();
        int i = Build.VERSION.SDK_INT;
        splitCubicAt splitcubicat = splitCubicAt.read;
        if (i >= 33) {
            splitcubicat.read();
        }
        int i2 = 1;
        if ((i >= 33 ? splitcubicat.read() : 0) >= 5) {
            accessgetclearcp = new accessgetClearcp(context, 1);
        } else {
            writeValidRootInUnitRange writevalidrootinunitrange = writeValidRootInUnitRange.read;
            if ((i == 31 || i == 32) && writevalidrootinunitrange.read() >= 9) {
                try {
                    objInvoke = new closeAsync(context, i2).invoke(context);
                } catch (NoClassDefFoundError unused) {
                    int i3 = Build.VERSION.SDK_INT;
                    if (i3 == 31 || i3 == 32) {
                        writevalidrootinunitrange.read();
                    }
                    objInvoke = null;
                }
                accessgetclearcp = (PointerInteropFilter_androidKtmotionEventSpy11) objInvoke;
            } else {
                accessgetclearcp = null;
            }
        }
        if (accessgetclearcp != null) {
            return new BezierKtWhenMappings(accessgetclearcp);
        }
        return null;
    }

    public DrawModifierNodeKt serializer(Uri uri) {
        uri.getClass();
        return FeatureInfoJsonAdapter.RemoteActionCompatParcelizer(BuildersKt.IconCompatParcelizer(YieldKt.RemoteActionCompatParcelizer(prepareForActivityTransitionCarryover.RemoteActionCompatParcelizer), null, null, new BlockRunner$maybeRun$1(this, uri, null, 28), 3));
    }

    public DrawModifierNodeKt serializer(Uri uri, InputEvent inputEvent) {
        uri.getClass();
        return FeatureInfoJsonAdapter.RemoteActionCompatParcelizer(BuildersKt.IconCompatParcelizer(YieldKt.RemoteActionCompatParcelizer(prepareForActivityTransitionCarryover.RemoteActionCompatParcelizer), null, null, new coil3.RealImageLoader.AnonymousClass2(this, uri, inputEvent, null, 22), 3));
    }

    public DrawModifierNodeKt IconCompatParcelizer(BlendMode blendMode) {
        throw null;
    }
}
