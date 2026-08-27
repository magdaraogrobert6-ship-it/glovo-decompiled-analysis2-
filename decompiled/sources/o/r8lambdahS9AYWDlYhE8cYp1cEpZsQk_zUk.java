package o;

import androidx.compose.ui.graphics.Fields;
import bo.app.ff$$ExternalSyntheticOutline0;
import com.roadrunner.sidemenu.data.model.GreetingComponent$Companion;
import kotlinx.serialization.Serializable;
import o.r8lambdajME9BxuQ9Esm6U0bgmNSz58jjLI;
import o.setGraphicModalMaxWidthDp;

/* JADX INFO: loaded from: classes3.dex */
@Serializable
@getAppropriateFullView(serializer = "greeting")
public final class r8lambdahS9AYWDlYhE8cYp1cEpZsQk_zUk implements r8lambdajbxBm0A7iJGxAyZffWwcxD8hq8k {
    public static final GreetingComponent$Companion Companion = new Object() { // from class: com.roadrunner.sidemenu.data.model.GreetingComponent$Companion
        private static int read = 1;
        private static int serializer;

        public final setGraphicModalMaxWidthDp serializer() {
            int i = 2 % 2;
            int i2 = read + 13;
            serializer = i2 % Fields.SpotShadowColor;
            int i3 = i2 % 2;
            r8lambdajME9BxuQ9Esm6U0bgmNSz58jjLI r8lambdajme9bxuq9esm6u0bgmnsz58jjli = r8lambdajME9BxuQ9Esm6U0bgmNSz58jjLI.RemoteActionCompatParcelizer;
            int i4 = read + 119;
            serializer = i4 % Fields.SpotShadowColor;
            int i5 = i4 % 2;
            return r8lambdajme9bxuq9esm6u0bgmnsz58jjli;
        }
    };
    private static int IconCompatParcelizer = 1;
    private static int RemoteActionCompatParcelizer = 0;
    private static int serializer = 0;
    private static int write = 1;
    public final String text;

    /* JADX WARN: Type inference failed for: r0v0, types: [com.roadrunner.sidemenu.data.model.GreetingComponent$Companion] */
    static {
        int i = RemoteActionCompatParcelizer + 85;
        write = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public /* synthetic */ r8lambdahS9AYWDlYhE8cYp1cEpZsQk_zUk(int i, String str) {
        if (1 == (i & 1)) {
            this.text = str;
        } else {
            DefaultContentCardsUpdateHandlerCompanionCREATOR1.IconCompatParcelizer(i, 1, r8lambdajME9BxuQ9Esm6U0bgmNSz58jjLI.RemoteActionCompatParcelizer.getDescriptor());
            throw null;
        }
    }

    public final int hashCode() {
        int i = 2 % 2;
        int i2 = IconCompatParcelizer + 23;
        serializer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        int iHashCode = this.text.hashCode();
        int i4 = IconCompatParcelizer + 97;
        serializer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return iHashCode;
    }

    public final String toString() {
        int i = 2 % 2;
        int i2 = IconCompatParcelizer + 109;
        serializer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            return ff$$ExternalSyntheticOutline0.m("GreetingComponent(text=", this.text, ")");
        }
        ff$$ExternalSyntheticOutline0.m("GreetingComponent(text=", this.text, ")");
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            int i2 = serializer + 49;
            IconCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i3 = i2 % 2;
            return true;
        }
        if (obj instanceof r8lambdahS9AYWDlYhE8cYp1cEpZsQk_zUk) {
            return ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.text, ((r8lambdahS9AYWDlYhE8cYp1cEpZsQk_zUk) obj).text}, getCieXyz.write())).booleanValue();
        }
        int i4 = IconCompatParcelizer + 125;
        serializer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return false;
    }
}
