package o;

import androidx.compose.ui.graphics.Fields;
import com.roadrunner.home.nest.api.data.NestAutoAcceptComponent$SubComponent$Preferences$Details$Companion;
import java.util.List;
import kotlin.LazyKt__LazyJVMKt;
import kotlinx.serialization.Serializable;
import o.ViewModelImpl;
import o.setGraphicModalMaxWidthDp;

/* JADX INFO: loaded from: classes3.dex */
@Serializable
public final class FlowExtKtcollectAsStateWithLifecycle1112 {
    private static int IconCompatParcelizer = 1;
    private static int RemoteActionCompatParcelizer = 0;
    private static int read = 1;
    private static int serializer;
    public final List components;
    public final String title;
    public static final NestAutoAcceptComponent$SubComponent$Preferences$Details$Companion Companion = new Object() { // from class: com.roadrunner.home.nest.api.data.NestAutoAcceptComponent$SubComponent$Preferences$Details$Companion
        private static int IconCompatParcelizer = 1;
        private static int write;

        public final setGraphicModalMaxWidthDp serializer() {
            int i = 2 % 2;
            int i2 = IconCompatParcelizer + 11;
            write = i2 % Fields.SpotShadowColor;
            int i3 = i2 % 2;
            ViewModelImpl viewModelImpl = ViewModelImpl.serializer;
            int i4 = IconCompatParcelizer + 1;
            write = i4 % Fields.SpotShadowColor;
            int i5 = i4 % 2;
            return viewModelImpl;
        }
    };
    public static final onViewDetachedFromWindowlambda1[] $childSerializers = {null, LazyKt__LazyJVMKt.serializer(onViewDetachedFromWindowlambda0.PUBLICATION, new RoomDatabaseExternalSyntheticLambda4(10))};

    /* JADX WARN: Type inference failed for: r0v0, types: [com.roadrunner.home.nest.api.data.NestAutoAcceptComponent$SubComponent$Preferences$Details$Companion] */
    static {
        int i = RemoteActionCompatParcelizer + 107;
        IconCompatParcelizer = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i2 = i % 2;
    }

    public /* synthetic */ FlowExtKtcollectAsStateWithLifecycle1112(List list, int i, String str) {
        Object obj = null;
        if (1 == (i & 1)) {
            this.title = str;
            if ((i & 2) == 0) {
                this.components = instance_delegatelambda0.write;
                int i2 = serializer + 101;
                read = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                if (i2 % 2 != 0) {
                    return;
                }
                obj.hashCode();
                throw null;
            }
            this.components = list;
            int i3 = serializer + 111;
            read = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i4 = i3 % 2;
            return;
        }
        DefaultContentCardsUpdateHandlerCompanionCREATOR1.IconCompatParcelizer(i, 1, ViewModelImpl.serializer.getDescriptor());
        throw null;
    }

    public final String toString() {
        int i = 2 % 2;
        int i2 = read + 97;
        serializer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            return IconCompatParcelizer.read("Details(title=", this.title, ", components=", this.components, ")");
        }
        int i3 = 13 / 0;
        return IconCompatParcelizer.read("Details(title=", this.title, ", components=", this.components, ")");
    }

    public final int hashCode() {
        int iHashCode;
        int i = 2 % 2;
        int i2 = serializer + 113;
        read = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            iHashCode = this.components.hashCode() >>> (this.title.hashCode() >> 89);
        } else {
            iHashCode = (this.title.hashCode() * 31) + this.components.hashCode();
        }
        int i3 = read + 57;
        serializer = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i4 = i3 % 2;
        return iHashCode;
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            int i2 = read + 99;
            serializer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            if (i2 % 2 == 0) {
                return true;
            }
            throw null;
        }
        if (obj instanceof FlowExtKtcollectAsStateWithLifecycle1112) {
            FlowExtKtcollectAsStateWithLifecycle1112 flowExtKtcollectAsStateWithLifecycle1112 = (FlowExtKtcollectAsStateWithLifecycle1112) obj;
            Object[] objArr = {this.title, flowExtKtcollectAsStateWithLifecycle1112.title};
            if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), objArr, getCieXyz.write())).booleanValue()) {
                return false;
            }
            Object[] objArr2 = {this.components, flowExtKtcollectAsStateWithLifecycle1112.components};
            if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), objArr2, getCieXyz.write())).booleanValue()) {
                return true;
            }
            int i3 = serializer + 95;
            read = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            if (i3 % 2 != 0) {
                return false;
            }
            throw null;
        }
        int i4 = serializer + 55;
        int i5 = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        read = i5;
        int i6 = i4 % 2;
        int i7 = i5 + 9;
        serializer = i7 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i8 = i7 % 2;
        return false;
    }
}
