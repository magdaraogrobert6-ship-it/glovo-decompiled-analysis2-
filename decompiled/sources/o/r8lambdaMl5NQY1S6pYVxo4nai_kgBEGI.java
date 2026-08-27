package o;

import androidx.compose.ui.graphics.Fields;
import bo.app.c8$$ExternalSyntheticOutline0;
import bo.app.ff$$ExternalSyntheticOutline0;
import com.roadrunner.settings.data.model.SettingsComponent$Companion;
import kotlinx.serialization.Serializable;
import o.r8lambdaNdoXU6mZMdprh2aRHhH7NbiG20s;
import o.setGraphicModalMaxWidthDp;

/* JADX INFO: loaded from: classes3.dex */
@Serializable
public final class r8lambdaMl5NQY1S6pYVxo4nai_kgBEGI {
    public static final SettingsComponent$Companion Companion = new Object() { // from class: com.roadrunner.settings.data.model.SettingsComponent$Companion
        private static int serializer = 0;
        private static int write = 1;

        public final setGraphicModalMaxWidthDp serializer() {
            int i = 2 % 2;
            int i2 = write + 31;
            serializer = i2 % Fields.SpotShadowColor;
            int i3 = i2 % 2;
            r8lambdaNdoXU6mZMdprh2aRHhH7NbiG20s r8lambdandoxu6mzmdprh2arhhh7nbig20s = r8lambdaNdoXU6mZMdprh2aRHhH7NbiG20s.RemoteActionCompatParcelizer;
            int i4 = serializer + 87;
            write = i4 % Fields.SpotShadowColor;
            int i5 = i4 % 2;
            return r8lambdandoxu6mzmdprh2arhhh7nbig20s;
        }
    };
    private static int IconCompatParcelizer = 1;
    private static int read = 0;
    private static int serializer = 0;
    private static int write = 1;
    public final String icon;
    public final String label;
    public final String link;

    /* JADX WARN: Type inference failed for: r0v0, types: [com.roadrunner.settings.data.model.SettingsComponent$Companion] */
    static {
        int i = serializer + 97;
        write = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i2 = i % 2;
    }

    public /* synthetic */ r8lambdaMl5NQY1S6pYVxo4nai_kgBEGI(int i, String str, String str2, String str3) {
        if (5 == (i & 5)) {
            this.label = str;
            if ((i & 2) == 0) {
                this.link = null;
                int i2 = read + 87;
                IconCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                int i3 = i2 % 2;
                int i4 = 2 % 2;
            } else {
                this.link = str2;
            }
            this.icon = str3;
            int i5 = IconCompatParcelizer + 111;
            read = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i6 = i5 % 2;
            return;
        }
        DefaultContentCardsUpdateHandlerCompanionCREATOR1.IconCompatParcelizer(i, 5, r8lambdaNdoXU6mZMdprh2aRHhH7NbiG20s.RemoteActionCompatParcelizer.getDescriptor());
        throw null;
    }

    public final String toString() {
        int i = 2 % 2;
        int i2 = IconCompatParcelizer + 43;
        read = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        String strM = ff$$ExternalSyntheticOutline0.m(c8$$ExternalSyntheticOutline0.m("SettingsComponent(label=", this.label, ", link=", this.link, ", icon="), this.icon, ")");
        int i4 = IconCompatParcelizer + 3;
        read = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 == 0) {
            return strM;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final int hashCode() {
        int iHashCode;
        int i = 2 % 2;
        int i2 = read + 39;
        IconCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            this.label.hashCode();
            throw null;
        }
        int iHashCode2 = this.label.hashCode();
        String str = this.link;
        if (str == null) {
            int i3 = read + 117;
            IconCompatParcelizer = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i4 = i3 % 2;
            iHashCode = 0;
        } else {
            iHashCode = str.hashCode();
        }
        return this.icon.hashCode() + (((iHashCode2 * 31) + iHashCode) * 31);
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        int i2 = read;
        int i3 = i2 + 61;
        IconCompatParcelizer = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        Object obj2 = null;
        if (i3 % 2 == 0) {
            throw null;
        }
        if (this == obj) {
            int i4 = i2 + 69;
            IconCompatParcelizer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            if (i4 % 2 == 0) {
                int i5 = 76 / 0;
            }
            return true;
        }
        if (!(obj instanceof r8lambdaMl5NQY1S6pYVxo4nai_kgBEGI)) {
            return false;
        }
        r8lambdaMl5NQY1S6pYVxo4nai_kgBEGI r8lambdaml5nqy1s6pyvxo4nai_kgbegi = (r8lambdaMl5NQY1S6pYVxo4nai_kgBEGI) obj;
        if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.label, r8lambdaml5nqy1s6pyvxo4nai_kgbegi.label}, getCieXyz.write())).booleanValue()) {
            if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.link, r8lambdaml5nqy1s6pyvxo4nai_kgbegi.link}, getCieXyz.write())).booleanValue()) {
                return false;
            }
            return ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.icon, r8lambdaml5nqy1s6pyvxo4nai_kgbegi.icon}, getCieXyz.write())).booleanValue();
        }
        int i6 = IconCompatParcelizer;
        int i7 = i6 + 17;
        read = i7 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i8 = i7 % 2;
        int i9 = i6 + 87;
        read = i9 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i9 % 2 == 0) {
            return false;
        }
        obj2.hashCode();
        throw null;
    }
}
