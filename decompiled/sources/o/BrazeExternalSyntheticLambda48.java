package o;

import coil3.ComponentRegistry$Builder;
import com.roadrunner.logger.performance.DefaultPerformanceLogger;
import kotlinx.serialization.SealedClassSerializer$$ExternalSyntheticLambda0;

/* JADX INFO: loaded from: classes3.dex */
public final class BrazeExternalSyntheticLambda48 implements r8lambdaGclPTCGavTOcPXGI4OQ7OSlWZ3I {
    private static int read = 0;
    private static int write = 1;
    public final isAdapterPositionOnScreen IconCompatParcelizer;
    public final String RemoteActionCompatParcelizer;

    public BrazeExternalSyntheticLambda48(ComponentRegistry$Builder componentRegistry$Builder, String str) {
        componentRegistry$Builder.getClass();
        str.getClass();
        this.RemoteActionCompatParcelizer = str;
        this.IconCompatParcelizer = new isAdapterPositionOnScreen(new SealedClassSerializer$$ExternalSyntheticLambda0(componentRegistry$Builder, 17, this));
    }

    public final DefaultPerformanceLogger read() {
        int i = 2 % 2;
        int i2 = read + 35;
        write = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            return (DefaultPerformanceLogger) this.IconCompatParcelizer.MediaSessionCompatResultReceiverWrapper();
        }
        throw null;
    }

    @Override // o.r8lambdaGclPTCGavTOcPXGI4OQ7OSlWZ3I
    public final void IconCompatParcelizer() {
        int i = 2 % 2;
        int i2 = write + 25;
        read = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        Object obj = null;
        if (i2 % 2 != 0) {
            read().write("ui.load.native");
            read().startTrace("ui.load.web_app");
            throw null;
        }
        read().write("ui.load.native");
        read().startTrace("ui.load.web_app");
        int i3 = read + 67;
        write = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i3 % 2 != 0) {
            return;
        }
        obj.hashCode();
        throw null;
    }

    @Override // o.r8lambdaGclPTCGavTOcPXGI4OQ7OSlWZ3I
    public final void RemoteActionCompatParcelizer() {
        int i = 2 % 2;
        int i2 = write + 63;
        read = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        read().start();
        read().startTrace("ui.load.e2e");
        read().startTrace("ui.load.native");
        int i4 = write + 125;
        read = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 != 0) {
            int i5 = 44 / 0;
        }
    }

    @Override // o.r8lambdaGclPTCGavTOcPXGI4OQ7OSlWZ3I
    public final void write() {
        int i = 2 % 2;
        int i2 = read + 17;
        write = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            read().write("ui.load.web_app");
            read().write("ui.load.e2e");
            read().write();
        } else {
            read().write("ui.load.web_app");
            read().write("ui.load.e2e");
            read().write();
            Object obj = null;
            obj.hashCode();
            throw null;
        }
    }

    @Override // o.r8lambdaGclPTCGavTOcPXGI4OQ7OSlWZ3I
    public final void serializer() {
        int i = 2 % 2;
        int i2 = read + 25;
        write = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            read().IconCompatParcelizer("ui.load.e2e");
            read().IconCompatParcelizer("ui.load.native");
            read().IconCompatParcelizer("ui.load.web_app");
            read().IconCompatParcelizer();
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        read().IconCompatParcelizer("ui.load.e2e");
        read().IconCompatParcelizer("ui.load.native");
        read().IconCompatParcelizer("ui.load.web_app");
        read().IconCompatParcelizer();
        int i3 = write + 79;
        read = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i4 = i3 % 2;
    }
}
