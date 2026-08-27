package o;

import androidx.compose.ui.graphics.Fields;
import com.roadrunner.login.data.countryselection.CountryListResponse$Companion;
import java.util.List;
import kotlin.LazyKt__LazyJVMKt;
import kotlinx.serialization.Serializable;
import o.getEnclosingTransaction;
import o.setGraphicModalMaxWidthDp;

/* JADX INFO: loaded from: classes5.dex */
@Serializable
public final class endTransactionruntime {
    private static int IconCompatParcelizer = 1;
    private static int RemoteActionCompatParcelizer = 0;
    private static int read = 0;
    private static int serializer = 1;
    public final List countries;
    public static final CountryListResponse$Companion Companion = new Object() { // from class: com.roadrunner.login.data.countryselection.CountryListResponse$Companion
        private static int RemoteActionCompatParcelizer = 0;
        private static int write = 1;

        public final setGraphicModalMaxWidthDp serializer() {
            int i = 2 % 2;
            int i2 = RemoteActionCompatParcelizer + 55;
            write = i2 % Fields.SpotShadowColor;
            if (i2 % 2 != 0) {
                return getEnclosingTransaction.serializer;
            }
            getEnclosingTransaction getenclosingtransaction = getEnclosingTransaction.serializer;
            Object obj = null;
            obj.hashCode();
            throw null;
        }
    };
    public static final onViewDetachedFromWindowlambda1[] $childSerializers = {LazyKt__LazyJVMKt.serializer(onViewDetachedFromWindowlambda0.PUBLICATION, new wa(4))};

    /* JADX WARN: Type inference failed for: r0v0, types: [com.roadrunner.login.data.countryselection.CountryListResponse$Companion] */
    static {
        int i = IconCompatParcelizer + 75;
        read = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i % 2 != 0) {
            throw null;
        }
    }

    public /* synthetic */ endTransactionruntime(int i, List list) {
        if (1 == (i & 1)) {
            this.countries = list;
        } else {
            DefaultContentCardsUpdateHandlerCompanionCREATOR1.IconCompatParcelizer(i, 1, getEnclosingTransaction.serializer.getDescriptor());
            throw null;
        }
    }

    public final int hashCode() {
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 37;
        serializer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            this.countries.hashCode();
            throw null;
        }
        int iHashCode = this.countries.hashCode();
        int i3 = RemoteActionCompatParcelizer + 121;
        serializer = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i4 = i3 % 2;
        return iHashCode;
    }

    public final String toString() {
        int i = 2 % 2;
        int i2 = serializer + 85;
        RemoteActionCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            String str = MediaSessionCompatQueueItem.read("CountryListResponse(countries=", ")", this.countries);
            int i3 = RemoteActionCompatParcelizer + 25;
            serializer = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            if (i3 % 2 != 0) {
                return str;
            }
            throw null;
        }
        MediaSessionCompatQueueItem.read("CountryListResponse(countries=", ")", this.countries);
        throw null;
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof endTransactionruntime)) {
            return false;
        }
        Object[] objArr = {this.countries, ((endTransactionruntime) obj).countries};
        Object obj2 = null;
        if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), objArr, getCieXyz.write())).booleanValue()) {
            int i2 = RemoteActionCompatParcelizer + 49;
            serializer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            if (i2 % 2 != 0) {
                return true;
            }
            obj2.hashCode();
            throw null;
        }
        int i3 = RemoteActionCompatParcelizer + 21;
        serializer = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i3 % 2 != 0) {
            return false;
        }
        obj2.hashCode();
        throw null;
    }
}
