package o;

import androidx.compose.ui.graphics.Fields;
import com.roadrunner.startworking.data.startworking.oneclick.StartWorkingComponent$TertiaryButton$Companion;
import kotlinx.serialization.Serializable;
import o.getExternalIEventMessengerandroid_sdk_base_releaseannotations;
import o.setGraphicModalMaxWidthDp;

/* JADX INFO: loaded from: classes3.dex */
@Serializable
@getAppropriateFullView(serializer = "tertiary_button")
public final class getDeviceIdProviderandroid_sdk_base_releaseannotations extends getContentCardCountlambda0 {
    public static final StartWorkingComponent$TertiaryButton$Companion Companion = new Object() { // from class: com.roadrunner.startworking.data.startworking.oneclick.StartWorkingComponent$TertiaryButton$Companion
        private static int IconCompatParcelizer = 0;
        private static int serializer = 1;

        public final setGraphicModalMaxWidthDp serializer() {
            int i = 2 % 2;
            int i2 = serializer + 31;
            IconCompatParcelizer = i2 % Fields.SpotShadowColor;
            int i3 = i2 % 2;
            getExternalIEventMessengerandroid_sdk_base_releaseannotations getexternalieventmessengerandroid_sdk_base_releaseannotations = getExternalIEventMessengerandroid_sdk_base_releaseannotations.IconCompatParcelizer;
            int i4 = IconCompatParcelizer + 5;
            serializer = i4 % Fields.SpotShadowColor;
            if (i4 % 2 == 0) {
                int i5 = 89 / 0;
            }
            return getexternalieventmessengerandroid_sdk_base_releaseannotations;
        }
    };
    private static int IconCompatParcelizer = 1;
    private static int RemoteActionCompatParcelizer = 0;
    private static int serializer = 1;
    private static int write;
    public final String key;
    public final enableDelayedInitialization label;

    /* JADX WARN: Type inference failed for: r0v0, types: [com.roadrunner.startworking.data.startworking.oneclick.StartWorkingComponent$TertiaryButton$Companion] */
    static {
        int i = IconCompatParcelizer + 87;
        write = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i2 = i % 2;
    }

    public /* synthetic */ getDeviceIdProviderandroid_sdk_base_releaseannotations(int i, String str, enableDelayedInitialization enabledelayedinitialization) {
        if (3 == (i & 3)) {
            this.key = str;
            this.label = enabledelayedinitialization;
        } else {
            DefaultContentCardsUpdateHandlerCompanionCREATOR1.IconCompatParcelizer(i, 3, getExternalIEventMessengerandroid_sdk_base_releaseannotations.IconCompatParcelizer.getDescriptor());
            throw null;
        }
    }

    public final int hashCode() {
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 13;
        serializer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        int iHashCode = this.label.text.hashCode() + (this.key.hashCode() * 31);
        int i4 = RemoteActionCompatParcelizer + 99;
        serializer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 != 0) {
            return iHashCode;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String toString() {
        int i = 2 % 2;
        String str = "TertiaryButton(key=" + this.key + ", label=" + this.label + ")";
        int i2 = RemoteActionCompatParcelizer + 117;
        serializer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            int i3 = 10 / 0;
        }
        return str;
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer;
        int i3 = i2 + 53;
        int i4 = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        serializer = i4;
        int i5 = i3 % 2;
        if (this != obj) {
            if (obj instanceof getDeviceIdProviderandroid_sdk_base_releaseannotations) {
                getDeviceIdProviderandroid_sdk_base_releaseannotations getdeviceidproviderandroid_sdk_base_releaseannotations = (getDeviceIdProviderandroid_sdk_base_releaseannotations) obj;
                if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.key, getdeviceidproviderandroid_sdk_base_releaseannotations.key}, getCieXyz.write())).booleanValue()) {
                    if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.label, getdeviceidproviderandroid_sdk_base_releaseannotations.label}, getCieXyz.write())).booleanValue()) {
                        return true;
                    }
                    int i6 = serializer + 61;
                    RemoteActionCompatParcelizer = i6 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                    int i7 = i6 % 2;
                    return false;
                }
                int i8 = serializer + 123;
                RemoteActionCompatParcelizer = i8 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                return i8 % 2 != 0;
            }
            int i9 = i4 + 77;
            RemoteActionCompatParcelizer = i9 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i10 = i9 % 2;
            return false;
        }
        int i11 = i2 + 79;
        serializer = i11 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i12 = i11 % 2;
        return true;
    }
}
