package o;

import androidx.compose.ui.graphics.Fields;
import com.roadrunner.startworking.data.startworking.oneclick.StartWorkingComponent$Select$Companion;
import java.util.List;
import kotlin.LazyKt__LazyJVMKt;
import kotlinx.serialization.Serializable;
import o.getPushDeliveryManagerandroid_sdk_base_releaseannotations;
import o.setGraphicModalMaxWidthDp;

/* JADX INFO: loaded from: classes3.dex */
@Serializable
@getAppropriateFullView(serializer = "select")
public final class getFeatureFlaglambda0 extends getContentCardCountlambda0 {
    private static int IconCompatParcelizer = 1;
    private static int read = 0;
    private static int serializer = 1;
    private static int write;
    public final String key;
    public final List options;
    public static final StartWorkingComponent$Select$Companion Companion = new Object() { // from class: com.roadrunner.startworking.data.startworking.oneclick.StartWorkingComponent$Select$Companion
        private static int read = 1;
        private static int serializer;

        public final setGraphicModalMaxWidthDp serializer() {
            int i = 2 % 2;
            int i2 = serializer + 111;
            read = i2 % Fields.SpotShadowColor;
            int i3 = i2 % 2;
            getPushDeliveryManagerandroid_sdk_base_releaseannotations getpushdeliverymanagerandroid_sdk_base_releaseannotations = getPushDeliveryManagerandroid_sdk_base_releaseannotations.serializer;
            int i4 = read + 37;
            serializer = i4 % Fields.SpotShadowColor;
            int i5 = i4 % 2;
            return getpushdeliverymanagerandroid_sdk_base_releaseannotations;
        }
    };
    public static final onViewDetachedFromWindowlambda1[] $childSerializers = {null, LazyKt__LazyJVMKt.serializer(onViewDetachedFromWindowlambda0.PUBLICATION, new subscribeToFeatureFlagsUpdateslambda1(6))};

    /* JADX WARN: Type inference failed for: r0v0, types: [com.roadrunner.startworking.data.startworking.oneclick.StartWorkingComponent$Select$Companion] */
    static {
        int i = IconCompatParcelizer + 29;
        read = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i % 2 != 0) {
            throw null;
        }
    }

    public final List RemoteActionCompatParcelizer() {
        int i = 2 % 2;
        int i2 = write + 45;
        serializer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            return this.options;
        }
        int i3 = 17 / 0;
        return this.options;
    }

    public final String serializer() {
        int i = 2 % 2;
        int i2 = write;
        int i3 = i2 + 97;
        serializer = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i4 = i3 % 2;
        String str = this.key;
        int i5 = i2 + 7;
        serializer = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i5 % 2 != 0) {
            return str;
        }
        throw null;
    }

    public /* synthetic */ getFeatureFlaglambda0(List list, int i, String str) {
        if (3 == (i & 3)) {
            this.key = str;
            this.options = list;
        } else {
            DefaultContentCardsUpdateHandlerCompanionCREATOR1.IconCompatParcelizer(i, 3, getPushDeliveryManagerandroid_sdk_base_releaseannotations.serializer.getDescriptor());
            throw null;
        }
    }

    public final String toString() {
        String str;
        int i = 2 % 2;
        int i2 = serializer + 117;
        write = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            str = IconCompatParcelizer.read("Select(key=", this.key, ", options=", this.options, ")");
            int i3 = 81 / 0;
        } else {
            str = IconCompatParcelizer.read("Select(key=", this.key, ", options=", this.options, ")");
        }
        int i4 = write + 27;
        serializer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return str;
    }

    public final int hashCode() {
        int i = 2 % 2;
        int i2 = write + 25;
        serializer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        int iHashCode = this.options.hashCode() + (this.key.hashCode() * 31);
        int i4 = write + 39;
        serializer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 == 0) {
            int i5 = 42 / 0;
        }
        return iHashCode;
    }

    public getFeatureFlaglambda0(String str, List list) {
        str.getClass();
        this.key = str;
        this.options = list;
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof getFeatureFlaglambda0)) {
            int i2 = serializer + 101;
            write = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i3 = i2 % 2;
            return false;
        }
        getFeatureFlaglambda0 getfeatureflaglambda0 = (getFeatureFlaglambda0) obj;
        Object[] objArr = {this.key, getfeatureflaglambda0.key};
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), objArr, getCieXyz.write())).booleanValue()) {
            int i4 = serializer + 27;
            write = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i5 = i4 % 2;
            return false;
        }
        Object[] objArr2 = {this.options, getfeatureflaglambda0.options};
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), objArr2, getCieXyz.write())).booleanValue()) {
            int i6 = serializer + 33;
            write = i6 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i7 = i6 % 2;
            return false;
        }
        int i8 = write + 11;
        serializer = i8 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i8 % 2 != 0) {
            return true;
        }
        Object obj2 = null;
        obj2.hashCode();
        throw null;
    }
}
