package o;

import com.roadrunner.common.data.api.CloudflareErrorClassifier;
import java.util.Collections;
import java.util.Map;
import okio.Path$Companion;

/* JADX INFO: loaded from: classes3.dex */
public final class getDisabled {
    private static int read = 1;
    private static int serializer;
    public final Path$Companion IconCompatParcelizer;
    public final CloudflareErrorClassifier RemoteActionCompatParcelizer;
    public final decode write;

    public getDisabled(decode decodeVar, Path$Companion path$Companion, CloudflareErrorClassifier cloudflareErrorClassifier) {
        decodeVar.getClass();
        path$Companion.getClass();
        cloudflareErrorClassifier.getClass();
        this.write = decodeVar;
        this.IconCompatParcelizer = path$Companion;
        this.RemoteActionCompatParcelizer = cloudflareErrorClassifier;
    }

    public final void RemoteActionCompatParcelizer(Throwable th) {
        int i = 2 % 2;
        int i2 = read + 7;
        serializer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            this.IconCompatParcelizer.getClass();
            Map mapSingletonMap = Collections.singletonMap("errorMsg", Path$Companion.serializer(th).IconCompatParcelizer());
            mapSingletonMap.getClass();
            this.write.logEvent("logout_failed", mapSingletonMap);
            int i3 = 29 / 0;
        } else {
            this.IconCompatParcelizer.getClass();
            Map mapSingletonMap2 = Collections.singletonMap("errorMsg", Path$Companion.serializer(th).IconCompatParcelizer());
            mapSingletonMap2.getClass();
            this.write.logEvent("logout_failed", mapSingletonMap2);
        }
        int i4 = read + 11;
        serializer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
    }
}
