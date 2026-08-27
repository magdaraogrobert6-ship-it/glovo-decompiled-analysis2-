package o;

import bo.app.af$$ExternalSyntheticOutline0;
import com.google.firebase.perf.FirebasePerformance;
import io.sentry.SentryUUID;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes3.dex */
public final class getAllUncoveredSemanticsNodesToIntObjectMap implements ShadowContext {
    private static int IconCompatParcelizer = 1;
    private static int read;
    public final createOuterShadowBitmapD_oqF2M RemoteActionCompatParcelizer;
    public final ConcurrentHashMap write = new ConcurrentHashMap();

    @Override // o.ShadowContext
    public final /* bridge */ void write(String str, String str2) {
        int i = 2 % 2;
        int i2 = IconCompatParcelizer + 97;
        read = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            int i3 = 24 / 0;
        }
    }

    public getAllUncoveredSemanticsNodesToIntObjectMap(FirebasePerformance firebasePerformance, createOuterShadowBitmapD_oqF2M createoutershadowbitmapd_oqf2m) {
        this.RemoteActionCompatParcelizer = createoutershadowbitmapd_oqf2m;
    }

    @Override // o.DropShadowRenderer
    public final void RemoteActionCompatParcelizer() {
        int i = 2 % 2;
        int i2 = IconCompatParcelizer + 59;
        read = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            this.write.clear();
        } else {
            this.write.clear();
            int i3 = 95 / 0;
        }
    }

    @Override // o.DropShadowRenderer
    public final void RemoteActionCompatParcelizer(String str) {
        int i = 2 % 2;
        int i2 = read + 15;
        IconCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            str.getClass();
            this.write.remove(str);
            int i3 = 56 / 0;
        } else {
            str.getClass();
            this.write.remove(str);
        }
        int i4 = read + 107;
        IconCompatParcelizer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
    }

    @Override // o.DropShadowRenderer
    public final void RemoteActionCompatParcelizer(String str, String str2, String str3) {
        int i = 2 % 2;
        int i2 = IconCompatParcelizer + 45;
        read = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        af$$ExternalSyntheticOutline0.m3978m(str, str2, str3);
        Blur_androidKt blur_androidKt = (Blur_androidKt) this.write.get(str);
        if (blur_androidKt != null) {
            int i4 = read + 109;
            IconCompatParcelizer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i5 = i4 % 2;
            blur_androidKt.serializer(str2, str3);
        }
    }

    @Override // o.DropShadowRenderer
    public final void serializer(long j, String str, String str2) {
        int i = 2 % 2;
        int i2 = IconCompatParcelizer + 69;
        read = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            str.getClass();
            str2.getClass();
            throw null;
        }
        str.getClass();
        str2.getClass();
        Blur_androidKt blur_androidKt = (Blur_androidKt) this.write.get(str);
        if (blur_androidKt != null) {
            int i3 = IconCompatParcelizer + 7;
            read = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i4 = i3 % 2;
            blur_androidKt.RemoteActionCompatParcelizer(str2, j);
            int i5 = IconCompatParcelizer + 91;
            read = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i6 = i5 % 2;
        }
    }

    @Override // o.DropShadowRenderer
    public final void write(String str, String str2, long j, AndroidShadowContext_androidKt androidShadowContext_androidKt) {
        int i = 2 % 2;
        int i2 = IconCompatParcelizer + 91;
        read = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        androidShadowContext_androidKt.getClass();
        serializer(j, str, str2);
        int i4 = IconCompatParcelizer + 43;
        read = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
    }

    @Override // o.ShadowContext
    public final void serializer(String str, String str2, long j, Map map, AndroidShadowContext_androidKt androidShadowContext_androidKt) {
        int i = 2 % 2;
        int i2 = IconCompatParcelizer + 5;
        read = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        str2.getClass();
        androidShadowContext_androidKt.getClass();
        serializer(j, str, str2);
        int i4 = IconCompatParcelizer + 21;
        read = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 != 0) {
            int i5 = 79 / 0;
        }
    }

    @Override // o.DropShadowRenderer
    public final void write(String str) {
        int i = 2 % 2;
        str.getClass();
        if (SentryUUID.IconCompatParcelizer(this, this.RemoteActionCompatParcelizer, str)) {
            Blur_androidKt blur_androidKt = (Blur_androidKt) this.write.remove(str);
            if (blur_androidKt != null) {
                blur_androidKt.serializer();
            }
        } else {
            int i2 = read + 95;
            IconCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i3 = i2 % 2;
        }
        int i4 = read + 45;
        IconCompatParcelizer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
    }

    @Override // o.DropShadowRenderer
    public final void serializer(String str) {
        int i = 2 % 2;
        int i2 = IconCompatParcelizer + 17;
        read = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            str.getClass();
            SentryUUID.IconCompatParcelizer(this, this.RemoteActionCompatParcelizer, str);
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        str.getClass();
        if (SentryUUID.IconCompatParcelizer(this, this.RemoteActionCompatParcelizer, str)) {
            this.write.computeIfAbsent(str, new writeEventMetadataI(new accessgetIntersectcp(this), 1));
            int i3 = read + 29;
            IconCompatParcelizer = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i4 = i3 % 2;
        }
    }
}
