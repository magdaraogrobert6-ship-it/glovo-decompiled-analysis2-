package o;

import com.roadrunner.settings.data.model.SettingsResponse$Companion;
import java.util.List;
import kotlin.LazyKt__LazyJVMKt;
import kotlinx.serialization.Serializable;

/* JADX INFO: loaded from: classes3.dex */
@Serializable
public final class r8lambdaNyJ3IxzJGs1Drw4t7O1OG6TKao {
    public static final onViewDetachedFromWindowlambda1[] $childSerializers;
    public static final SettingsResponse$Companion Companion = new SettingsResponse$Companion();
    private static int IconCompatParcelizer = 1;
    private static int RemoteActionCompatParcelizer = 0;
    private static int serializer = 1;
    private static int write;
    public final r8lambdaKg12b_kAV6xLHkeltAkZS9jV9c feedback;
    public final List legalItems;
    public final List promotions;

    static {
        onViewDetachedFromWindowlambda0 onviewdetachedfromwindowlambda0 = onViewDetachedFromWindowlambda0.PUBLICATION;
        Object obj = null;
        $childSerializers = new onViewDetachedFromWindowlambda1[]{LazyKt__LazyJVMKt.serializer(onviewdetachedfromwindowlambda0, new getSessionParameters(28)), null, LazyKt__LazyJVMKt.serializer(onviewdetachedfromwindowlambda0, new getSessionParameters(29))};
        int i = serializer + 9;
        RemoteActionCompatParcelizer = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i % 2 == 0) {
            return;
        }
        obj.hashCode();
        throw null;
    }

    public /* synthetic */ r8lambdaNyJ3IxzJGs1Drw4t7O1OG6TKao(int i, List list, r8lambdaKg12b_kAV6xLHkeltAkZS9jV9c r8lambdakg12b_kav6xlhkeltakzs9jv9c, List list2) {
        Object obj = null;
        if (3 == (i & 3)) {
            this.legalItems = list;
            this.feedback = r8lambdakg12b_kav6xlhkeltakzs9jv9c;
            if ((i & 4) == 0) {
                this.promotions = null;
                int i2 = IconCompatParcelizer + 101;
                write = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                if (i2 % 2 == 0) {
                    return;
                }
                obj.hashCode();
                throw null;
            }
            this.promotions = list2;
            int i3 = IconCompatParcelizer + 5;
            write = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i4 = i3 % 2;
            return;
        }
        DefaultContentCardsUpdateHandlerCompanionCREATOR1.IconCompatParcelizer(i, 3, r8lambdaNpVD_Rx47cVAAPnb9cQAHcNxw.read.getDescriptor());
        throw null;
    }

    public final int hashCode() {
        int iHashCode;
        int i = 2 % 2;
        int i2 = write + 79;
        IconCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        int iHashCode2 = this.legalItems.hashCode();
        int iHashCode3 = this.feedback.hashCode();
        List list = this.promotions;
        if (list == null) {
            int i4 = IconCompatParcelizer + 51;
            write = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i5 = i4 % 2;
            iHashCode = 0;
        } else {
            iHashCode = list.hashCode();
        }
        return ((iHashCode3 + (iHashCode2 * 31)) * 31) + iHashCode;
    }

    public r8lambdaNyJ3IxzJGs1Drw4t7O1OG6TKao(r8lambdaKg12b_kAV6xLHkeltAkZS9jV9c r8lambdakg12b_kav6xlhkeltakzs9jv9c) {
        this.legalItems = instance_delegatelambda0.write;
        this.feedback = r8lambdakg12b_kav6xlhkeltakzs9jv9c;
        this.promotions = null;
    }

    public final String toString() {
        int i = 2 % 2;
        StringBuilder sb = new StringBuilder("SettingsResponse(legalItems=");
        sb.append(this.legalItems);
        sb.append(", feedback=");
        sb.append(this.feedback);
        sb.append(", promotions=");
        String str = MediaSessionCompatQueueItem.read(sb, this.promotions, ")");
        int i2 = write + 77;
        IconCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        return str;
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r8lambdaNyJ3IxzJGs1Drw4t7O1OG6TKao)) {
            return false;
        }
        r8lambdaNyJ3IxzJGs1Drw4t7O1OG6TKao r8lambdanyj3ixzjgs1drw4t7o1og6tkao = (r8lambdaNyJ3IxzJGs1Drw4t7O1OG6TKao) obj;
        Object[] objArr = {this.legalItems, r8lambdanyj3ixzjgs1drw4t7o1og6tkao.legalItems};
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), objArr, getCieXyz.write())).booleanValue()) {
            int i2 = IconCompatParcelizer + 49;
            write = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i3 = i2 % 2;
            return false;
        }
        Object[] objArr2 = {this.feedback, r8lambdanyj3ixzjgs1drw4t7o1og6tkao.feedback};
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), objArr2, getCieXyz.write())).booleanValue()) {
            int i4 = IconCompatParcelizer + 89;
            int i5 = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            write = i5;
            int i6 = i4 % 2;
            int i7 = i5 + 31;
            IconCompatParcelizer = i7 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            if (i7 % 2 == 0) {
                int i8 = 39 / 0;
            }
            return false;
        }
        Object[] objArr3 = {this.promotions, r8lambdanyj3ixzjgs1drw4t7o1og6tkao.promotions};
        if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), objArr3, getCieXyz.write())).booleanValue()) {
            return true;
        }
        int i9 = write + 101;
        IconCompatParcelizer = i9 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i10 = i9 % 2;
        return false;
    }
}
