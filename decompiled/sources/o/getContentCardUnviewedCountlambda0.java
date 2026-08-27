package o;

import androidx.compose.ui.graphics.Fields;
import com.roadrunner.startworking.data.startworking.oneclick.StartWorkingComponent$PlainText$Companion;
import kotlinx.serialization.Serializable;
import o.getConfigurationProviderandroid_sdk_base_releaseannotations;
import o.setGraphicModalMaxWidthDp;

/* JADX INFO: loaded from: classes3.dex */
@Serializable
@getAppropriateFullView(serializer = "plain_text")
public final class getContentCardUnviewedCountlambda0 extends getContentCardCountlambda0 {
    public static final StartWorkingComponent$PlainText$Companion Companion = new Object() { // from class: com.roadrunner.startworking.data.startworking.oneclick.StartWorkingComponent$PlainText$Companion
        private static int RemoteActionCompatParcelizer = 1;
        private static int serializer;

        public final setGraphicModalMaxWidthDp serializer() {
            int i = 2 % 2;
            int i2 = RemoteActionCompatParcelizer + 41;
            serializer = i2 % Fields.SpotShadowColor;
            if (i2 % 2 == 0) {
                return getConfigurationProviderandroid_sdk_base_releaseannotations.write;
            }
            int i3 = 41 / 0;
            return getConfigurationProviderandroid_sdk_base_releaseannotations.write;
        }
    };
    private static int IconCompatParcelizer = 0;
    private static int RemoteActionCompatParcelizer = 1;
    private static int read = 0;
    private static int write = 1;
    public final String key;
    public final enableDelayedInitialization label;

    /* JADX WARN: Type inference failed for: r0v0, types: [com.roadrunner.startworking.data.startworking.oneclick.StartWorkingComponent$PlainText$Companion] */
    static {
        int i = RemoteActionCompatParcelizer + 107;
        IconCompatParcelizer = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i2 = i % 2;
    }

    public /* synthetic */ getContentCardUnviewedCountlambda0(int i, String str, enableDelayedInitialization enabledelayedinitialization) {
        if (3 == (i & 3)) {
            this.key = str;
            this.label = enabledelayedinitialization;
        } else {
            DefaultContentCardsUpdateHandlerCompanionCREATOR1.IconCompatParcelizer(i, 3, getConfigurationProviderandroid_sdk_base_releaseannotations.write.getDescriptor());
            throw null;
        }
    }

    public final int hashCode() {
        int i = 2 % 2;
        int i2 = read + 117;
        write = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        int iHashCode = this.label.text.hashCode() + (this.key.hashCode() * 31);
        int i4 = write + 109;
        read = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return iHashCode;
    }

    public final String toString() {
        int i = 2 % 2;
        String str = "PlainText(key=" + this.key + ", label=" + this.label + ")";
        int i2 = write + 53;
        read = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            return str;
        }
        throw null;
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        int i2 = read + 7;
        int i3 = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        write = i3;
        int i4 = i2 % 2;
        if (this != obj) {
            if (!(obj instanceof getContentCardUnviewedCountlambda0)) {
                return false;
            }
            getContentCardUnviewedCountlambda0 getcontentcardunviewedcountlambda0 = (getContentCardUnviewedCountlambda0) obj;
            if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.key, getcontentcardunviewedcountlambda0.key}, getCieXyz.write())).booleanValue()) {
                return ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.label, getcontentcardunviewedcountlambda0.label}, getCieXyz.write())).booleanValue();
            }
            int i5 = write + 43;
            read = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i6 = i5 % 2;
            return false;
        }
        int i7 = i3 + 75;
        read = i7 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        return i7 % 2 == 0;
    }
}
