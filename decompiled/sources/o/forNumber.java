package o;

import androidx.compose.ui.graphics.Fields;
import com.roadrunner.helpcenter.businessmetrics.dto.BusinessMetricsRequest$Companion;
import java.util.ArrayList;
import java.util.List;
import kotlin.LazyKt__LazyJVMKt;
import kotlinx.serialization.Serializable;
import o.SharedPreferencesMigrationKtgetShouldRunMigration1;
import o.setGraphicModalMaxWidthDp;

/* JADX INFO: loaded from: classes3.dex */
@Serializable
public final class forNumber {
    private static int IconCompatParcelizer = 0;
    private static int RemoteActionCompatParcelizer = 0;
    private static int read = 1;
    private static int serializer = 1;
    public final List events;
    public static final BusinessMetricsRequest$Companion Companion = new Object() { // from class: com.roadrunner.helpcenter.businessmetrics.dto.BusinessMetricsRequest$Companion
        private static int serializer = 1;
        private static int write;

        public final setGraphicModalMaxWidthDp serializer() {
            int i = 2 % 2;
            int i2 = write + 33;
            serializer = i2 % Fields.SpotShadowColor;
            int i3 = i2 % 2;
            SharedPreferencesMigrationKtgetShouldRunMigration1 sharedPreferencesMigrationKtgetShouldRunMigration1 = SharedPreferencesMigrationKtgetShouldRunMigration1.RemoteActionCompatParcelizer;
            int i4 = serializer + 109;
            write = i4 % Fields.SpotShadowColor;
            if (i4 % 2 != 0) {
                int i5 = 1 / 0;
            }
            return sharedPreferencesMigrationKtgetShouldRunMigration1;
        }
    };
    public static final onViewDetachedFromWindowlambda1[] $childSerializers = {LazyKt__LazyJVMKt.serializer(onViewDetachedFromWindowlambda0.PUBLICATION, new ComposableSingletonsAndroidDialog_androidKtlambda2101488961(26))};

    /* JADX WARN: Type inference failed for: r0v0, types: [com.roadrunner.helpcenter.businessmetrics.dto.BusinessMetricsRequest$Companion] */
    static {
        int i = read + 49;
        RemoteActionCompatParcelizer = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i2 = i % 2;
    }

    public /* synthetic */ forNumber(int i, List list) {
        if (1 == (i & 1)) {
            this.events = list;
        } else {
            DefaultContentCardsUpdateHandlerCompanionCREATOR1.IconCompatParcelizer(i, 1, SharedPreferencesMigrationKtgetShouldRunMigration1.RemoteActionCompatParcelizer.getDescriptor());
            throw null;
        }
    }

    public final int hashCode() {
        int i = 2 % 2;
        int i2 = IconCompatParcelizer + 73;
        serializer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            return this.events.hashCode();
        }
        int i3 = 14 / 0;
        return this.events.hashCode();
    }

    public final String toString() {
        int i = 2 % 2;
        int i2 = IconCompatParcelizer + 91;
        serializer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            String str = MediaSessionCompatQueueItem.read("BusinessMetricsRequest(events=", ")", this.events);
            int i3 = serializer + 63;
            IconCompatParcelizer = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i4 = i3 % 2;
            return str;
        }
        MediaSessionCompatQueueItem.read("BusinessMetricsRequest(events=", ")", this.events);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public forNumber(ArrayList arrayList) {
        this.events = arrayList;
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            int i2 = serializer;
            int i3 = i2 + 107;
            IconCompatParcelizer = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i4 = i3 % 2;
            int i5 = i2 + 57;
            IconCompatParcelizer = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            if (i5 % 2 != 0) {
                int i6 = 46 / 0;
            }
            return true;
        }
        if (!(obj instanceof forNumber)) {
            return false;
        }
        Object[] objArr = {this.events, ((forNumber) obj).events};
        if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), objArr, getCieXyz.write())).booleanValue()) {
            return true;
        }
        int i7 = IconCompatParcelizer + 9;
        serializer = i7 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i8 = i7 % 2;
        return false;
    }
}
