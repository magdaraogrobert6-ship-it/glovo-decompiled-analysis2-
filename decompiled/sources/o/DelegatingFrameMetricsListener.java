package o;

import androidx.compose.ui.graphics.Fields;
import com.roadrunner.home.nest.api.data.NestComponent$Companion;
import kotlinx.serialization.Serializable;
import o.DefaultLifecycleObserver;
import o.setGraphicModalMaxWidthDp;

/* JADX INFO: loaded from: classes3.dex */
@Serializable(write = DefaultLifecycleObserver.class)
public abstract class DelegatingFrameMetricsListener {
    public static final NestComponent$Companion Companion = new Object() { // from class: com.roadrunner.home.nest.api.data.NestComponent$Companion
        private static int read = 1;
        private static int serializer;

        public final setGraphicModalMaxWidthDp serializer() {
            DefaultLifecycleObserver defaultLifecycleObserver;
            int i = 2 % 2;
            int i2 = serializer + 111;
            read = i2 % Fields.SpotShadowColor;
            if (i2 % 2 == 0) {
                defaultLifecycleObserver = DefaultLifecycleObserver.IconCompatParcelizer;
                int i3 = 2 / 0;
            } else {
                defaultLifecycleObserver = DefaultLifecycleObserver.IconCompatParcelizer;
            }
            int i4 = serializer + 41;
            read = i4 % Fields.SpotShadowColor;
            int i5 = i4 % 2;
            return defaultLifecycleObserver;
        }
    };
    private static int RemoteActionCompatParcelizer = 1;
    private static int write;

    public abstract String RemoteActionCompatParcelizer();

    /* JADX WARN: Type inference failed for: r0v0, types: [com.roadrunner.home.nest.api.data.NestComponent$Companion] */
    static {
        int i = RemoteActionCompatParcelizer + 107;
        write = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i % 2 != 0) {
            throw null;
        }
    }
}
