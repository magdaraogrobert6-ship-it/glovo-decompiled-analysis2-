package o;

import kotlin.LazyKt__LazyJVMKt;
import kotlinx.serialization.Serializable;

/* JADX INFO: loaded from: classes3.dex */
@Serializable
public final class onActivityStarted extends DelegatingFrameMetricsListener {
    private static int IconCompatParcelizer = 0;
    private static int read = 1;
    private static int serializer = 1;
    private static int write;
    public static final onActivityStarted INSTANCE = new onActivityStarted();
    public static final /* synthetic */ onViewDetachedFromWindowlambda1 $cachedSerializer$delegate = LazyKt__LazyJVMKt.serializer(onViewDetachedFromWindowlambda0.PUBLICATION, new RoomDatabaseExternalSyntheticLambda4(3));

    static {
        int i = write + 99;
        serializer = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i % 2 == 0) {
            throw null;
        }
    }

    @Override // o.DelegatingFrameMetricsListener
    public final String RemoteActionCompatParcelizer() {
        int i = 2 % 2;
        int i2 = IconCompatParcelizer + 45;
        int i3 = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        read = i3;
        if (i2 % 2 == 0) {
            int i4 = 83 / 0;
        }
        int i5 = i3 + 9;
        IconCompatParcelizer = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i5 % 2 == 0) {
            return "divider";
        }
        throw null;
    }

    public final String toString() {
        int i = 2 % 2;
        int i2 = IconCompatParcelizer;
        int i3 = i2 + 53;
        read = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i4 = i3 % 2;
        int i5 = i2 + 23;
        read = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i5 % 2 != 0) {
            return "DividerComponent";
        }
        throw null;
    }

    public final int hashCode() {
        int i = 2 % 2;
        int i2 = read + 105;
        int i3 = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        IconCompatParcelizer = i3;
        if (i2 % 2 != 0) {
            throw null;
        }
        int i4 = i3 + 97;
        read = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return 121332028;
    }

    public final setGraphicModalMaxWidthDp serializer() {
        int i = 2 % 2;
        int i2 = IconCompatParcelizer + 71;
        read = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        setGraphicModalMaxWidthDp setgraphicmodalmaxwidthdp = (setGraphicModalMaxWidthDp) $cachedSerializer$delegate.MediaSessionCompatResultReceiverWrapper();
        int i4 = IconCompatParcelizer + 19;
        read = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 == 0) {
            int i5 = 54 / 0;
        }
        return setgraphicmodalmaxwidthdp;
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        int i2 = IconCompatParcelizer;
        int i3 = i2 + 107;
        read = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i3 % 2 == 0) {
            Object obj2 = null;
            obj2.hashCode();
            throw null;
        }
        if (this == obj || (obj instanceof onActivityStarted)) {
            return true;
        }
        int i4 = i2 + 31;
        read = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return false;
    }
}
