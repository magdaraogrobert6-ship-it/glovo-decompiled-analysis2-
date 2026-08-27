package o;

import bo.app.c8$$ExternalSyntheticOutline0;
import com.roadrunner.delivery.state.StateV3$$ExternalSyntheticLambda0;
import com.roadrunner.delivery.state.StateV3$Metadata$Companion;
import java.util.List;
import kotlin.LazyKt__LazyJVMKt;
import kotlinx.serialization.Serializable;

/* JADX INFO: loaded from: classes3.dex */
@Serializable
public final class setFitInsetsSides {
    public static final onViewDetachedFromWindowlambda1[] $childSerializers;
    public static final StateV3$Metadata$Companion Companion = new StateV3$Metadata$Companion();
    private static int IconCompatParcelizer = 0;
    private static int RemoteActionCompatParcelizer = 1;
    private static int read = 1;
    private static int write;
    public final List acknowledgements;
    public final ComposableSingletonsAndroidPopup_androidKt analytics;
    public final List routes;
    public final isInsideContent vendor;

    static {
        onViewDetachedFromWindowlambda0 onviewdetachedfromwindowlambda0 = onViewDetachedFromWindowlambda0.PUBLICATION;
        $childSerializers = new onViewDetachedFromWindowlambda1[]{LazyKt__LazyJVMKt.serializer(onviewdetachedfromwindowlambda0, new StateV3$$ExternalSyntheticLambda0(24)), LazyKt__LazyJVMKt.serializer(onviewdetachedfromwindowlambda0, new StateV3$$ExternalSyntheticLambda0(25)), null, null};
        int i = RemoteActionCompatParcelizer + 9;
        IconCompatParcelizer = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i % 2 != 0) {
            throw null;
        }
    }

    public /* synthetic */ setFitInsetsSides(int i, List list, List list2, ComposableSingletonsAndroidPopup_androidKt composableSingletonsAndroidPopup_androidKt, isInsideContent isinsidecontent) {
        instance_delegatelambda0 instance_delegatelambda0Var = instance_delegatelambda0.write;
        if ((i & 1) == 0) {
            this.routes = instance_delegatelambda0Var;
            int i2 = 2 % 2;
        } else {
            this.routes = list;
        }
        if ((i & 2) == 0) {
            int i3 = read + 125;
            write = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i4 = i3 % 2;
            this.acknowledgements = instance_delegatelambda0Var;
            int i5 = 2 % 2;
        } else {
            this.acknowledgements = list2;
        }
        if ((i & 4) == 0) {
            this.analytics = null;
        } else {
            this.analytics = composableSingletonsAndroidPopup_androidKt;
        }
        int i6 = 2 % 2;
        if ((i & 8) != 0) {
            this.vendor = isinsidecontent;
            return;
        }
        this.vendor = null;
        int i7 = read + 89;
        write = i7 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i8 = i7 % 2;
    }

    public final int hashCode() {
        int iHashCode;
        int i = 2 % 2;
        int i2 = write + 87;
        read = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        int iM = c8$$ExternalSyntheticOutline0.m(this.acknowledgements, this.routes.hashCode() * 31, 31);
        ComposableSingletonsAndroidPopup_androidKt composableSingletonsAndroidPopup_androidKt = this.analytics;
        if (composableSingletonsAndroidPopup_androidKt == null) {
            int i4 = write + 27;
            read = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i5 = i4 % 2;
            iHashCode = 0;
        } else {
            iHashCode = composableSingletonsAndroidPopup_androidKt.hashCode();
        }
        isInsideContent isinsidecontent = this.vendor;
        return ((iM + iHashCode) * 31) + (isinsidecontent != null ? isinsidecontent.hashCode() : 0);
    }

    public final String toString() {
        int i = 2 % 2;
        String str = "Metadata(routes=" + this.routes + ", acknowledgements=" + this.acknowledgements + ", analytics=" + this.analytics + ", vendor=" + this.vendor + ")";
        int i2 = write + 5;
        read = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        return str;
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        if (this != obj) {
            if (!(obj instanceof setFitInsetsSides)) {
                return false;
            }
            setFitInsetsSides setfitinsetssides = (setFitInsetsSides) obj;
            Object[] objArr = {this.routes, setfitinsetssides.routes};
            if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), objArr, getCieXyz.write())).booleanValue()) {
                Object[] objArr2 = {this.acknowledgements, setfitinsetssides.acknowledgements};
                if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), objArr2, getCieXyz.write())).booleanValue()) {
                    Object[] objArr3 = {this.analytics, setfitinsetssides.analytics};
                    if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), objArr3, getCieXyz.write())).booleanValue()) {
                        int i2 = write + 67;
                        read = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                        int i3 = i2 % 2;
                        return false;
                    }
                    Object[] objArr4 = {this.vendor, setfitinsetssides.vendor};
                    if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), objArr4, getCieXyz.write())).booleanValue()) {
                        return true;
                    }
                    int i4 = write + 121;
                    read = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                    int i5 = i4 % 2;
                    return false;
                }
                int i6 = write + 107;
                read = i6 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                int i7 = i6 % 2;
                return false;
            }
            int i8 = write + 49;
            read = i8 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i9 = i8 % 2;
            return false;
        }
        int i10 = write + 31;
        read = i10 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i11 = i10 % 2;
        return true;
    }
}
