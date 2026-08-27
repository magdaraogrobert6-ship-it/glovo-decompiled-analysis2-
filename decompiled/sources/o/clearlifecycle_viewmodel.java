package o;

import androidx.compose.ui.graphics.Fields;
import bo.app.c8$$ExternalSyntheticOutline0;
import bo.app.ff$$ExternalSyntheticOutline0;
import com.roadrunner.home.nest.api.data.NestAutoAcceptComponent$SubComponent$Preferences$DetailComponent$Companion;
import kotlinx.serialization.Serializable;
import o.WithLifecycleStateKtsuspendWithStateAtLeastUnchecked2observer1;
import o.setGraphicModalMaxWidthDp;

/* JADX INFO: loaded from: classes3.dex */
@Serializable
public final class clearlifecycle_viewmodel {
    public static final NestAutoAcceptComponent$SubComponent$Preferences$DetailComponent$Companion Companion = new Object() { // from class: com.roadrunner.home.nest.api.data.NestAutoAcceptComponent$SubComponent$Preferences$DetailComponent$Companion
        private static int IconCompatParcelizer = 1;
        private static int read;

        public final setGraphicModalMaxWidthDp serializer() {
            int i = 2 % 2;
            int i2 = read + 109;
            IconCompatParcelizer = i2 % Fields.SpotShadowColor;
            if (i2 % 2 != 0) {
                return WithLifecycleStateKtsuspendWithStateAtLeastUnchecked2observer1.write;
            }
            WithLifecycleStateKtsuspendWithStateAtLeastUnchecked2observer1 withLifecycleStateKtsuspendWithStateAtLeastUnchecked2observer1 = WithLifecycleStateKtsuspendWithStateAtLeastUnchecked2observer1.write;
            Object obj = null;
            obj.hashCode();
            throw null;
        }
    };
    private static int RemoteActionCompatParcelizer = 1;
    private static int read = 1;
    private static int serializer;
    private static int write;
    public final String description;
    public final String disabledDescription;
    public final String icon;
    public final String title;
    public final String toggleTitle;
    public final String type;

    /* JADX WARN: Type inference failed for: r0v0, types: [com.roadrunner.home.nest.api.data.NestAutoAcceptComponent$SubComponent$Preferences$DetailComponent$Companion] */
    static {
        int i = RemoteActionCompatParcelizer + 93;
        write = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i % 2 != 0) {
            int i2 = 37 / 0;
        }
    }

    public /* synthetic */ clearlifecycle_viewmodel(String str, int i, String str2, String str3, String str4, String str5, String str6) {
        Object obj = null;
        if (1 != (i & 1)) {
            DefaultContentCardsUpdateHandlerCompanionCREATOR1.IconCompatParcelizer(i, 1, WithLifecycleStateKtsuspendWithStateAtLeastUnchecked2observer1.write.getDescriptor());
            throw null;
        }
        this.type = str;
        if ((i & 2) == 0) {
            this.title = null;
        } else {
            this.title = str2;
            int i2 = serializer + 21;
            read = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            if (i2 % 2 != 0) {
                int i3 = 2 % 2;
            }
        }
        if ((i & 4) == 0) {
            this.description = null;
        } else {
            this.description = str3;
            int i4 = 2 % 2;
        }
        if ((i & 8) == 0) {
            int i5 = read + 29;
            serializer = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            if (i5 % 2 != 0) {
                this.icon = null;
                obj.hashCode();
                throw null;
            }
            this.icon = null;
        } else {
            this.icon = str4;
        }
        if ((i & 16) == 0) {
            this.toggleTitle = null;
        } else {
            this.toggleTitle = str5;
            int i6 = 2 % 2;
        }
        if ((i & 32) == 0) {
            this.disabledDescription = null;
        } else {
            this.disabledDescription = str6;
        }
    }

    public final String toString() {
        int i = 2 % 2;
        int i2 = read + 5;
        serializer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        StringBuilder sbM = c8$$ExternalSyntheticOutline0.m("DetailComponent(type=", this.type, ", title=", this.title, ", description=");
        c8$$ExternalSyntheticOutline0.m(sbM, this.description, ", icon=", this.icon, ", toggleTitle=");
        String strM = ff$$ExternalSyntheticOutline0.m(sbM, this.toggleTitle, ", disabledDescription=", this.disabledDescription, ")");
        int i4 = read + 73;
        serializer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 == 0) {
            return strM;
        }
        throw null;
    }

    public final int hashCode() {
        int i;
        int i2 = 2 % 2;
        int iHashCode = this.type.hashCode();
        String str = this.title;
        int iHashCode2 = str == null ? 0 : str.hashCode();
        String str2 = this.description;
        if (str2 == null) {
            int i3 = serializer + 15;
            read = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            i = i3 % 2 == 0 ? 1 : 0;
        } else {
            int iHashCode3 = str2.hashCode();
            int i4 = read + 39;
            serializer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i5 = i4 % 2;
            i = iHashCode3;
        }
        String str3 = this.icon;
        int iHashCode4 = str3 == null ? 0 : str3.hashCode();
        String str4 = this.toggleTitle;
        int iHashCode5 = str4 == null ? 0 : str4.hashCode();
        String str5 = this.disabledDescription;
        return (((((((((iHashCode * 31) + iHashCode2) * 31) + i) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + (str5 != null ? str5.hashCode() : 0);
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof clearlifecycle_viewmodel)) {
            return false;
        }
        clearlifecycle_viewmodel clearlifecycle_viewmodelVar = (clearlifecycle_viewmodel) obj;
        Object[] objArr = {this.type, clearlifecycle_viewmodelVar.type};
        if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), objArr, getCieXyz.write())).booleanValue()) {
            Object[] objArr2 = {this.title, clearlifecycle_viewmodelVar.title};
            if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), objArr2, getCieXyz.write())).booleanValue()) {
                return false;
            }
            Object[] objArr3 = {this.description, clearlifecycle_viewmodelVar.description};
            if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), objArr3, getCieXyz.write())).booleanValue()) {
                return false;
            }
            Object[] objArr4 = {this.icon, clearlifecycle_viewmodelVar.icon};
            if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), objArr4, getCieXyz.write())).booleanValue()) {
                return false;
            }
            Object[] objArr5 = {this.toggleTitle, clearlifecycle_viewmodelVar.toggleTitle};
            if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), objArr5, getCieXyz.write())).booleanValue()) {
                return false;
            }
            Object[] objArr6 = {this.disabledDescription, clearlifecycle_viewmodelVar.disabledDescription};
            if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), objArr6, getCieXyz.write())).booleanValue()) {
                return false;
            }
            int i2 = serializer + 99;
            read = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i3 = i2 % 2;
            return true;
        }
        int i4 = read + 5;
        serializer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return false;
    }
}
