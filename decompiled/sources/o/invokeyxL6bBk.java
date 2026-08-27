package o;

import android.annotation.SuppressLint;
import androidx.compose.ui.graphics.Fields;
import com.roadrunner.home.nest.api.data.Actions$Companion;
import kotlinx.serialization.Serializable;
import o.clearSourcelifecycle_livedata;
import o.setGraphicModalMaxWidthDp;

/* JADX INFO: loaded from: classes3.dex */
@Serializable
@SuppressLint
public final class invokeyxL6bBk {
    public static final Actions$Companion Companion = new Object() { // from class: com.roadrunner.home.nest.api.data.Actions$Companion
        private static int serializer = 1;
        private static int write;

        public final setGraphicModalMaxWidthDp serializer() {
            int i = 2 % 2;
            int i2 = serializer + 63;
            write = i2 % Fields.SpotShadowColor;
            int i3 = i2 % 2;
            clearSourcelifecycle_livedata clearsourcelifecycle_livedata = clearSourcelifecycle_livedata.write;
            int i4 = serializer + 107;
            write = i4 % Fields.SpotShadowColor;
            if (i4 % 2 != 0) {
                int i5 = 13 / 0;
            }
            return clearsourcelifecycle_livedata;
        }
    };
    private static int IconCompatParcelizer = 0;
    private static int RemoteActionCompatParcelizer = 1;
    private static int read = 1;
    private static int serializer;
    public final CoroutineLiveDataExternalSyntheticLambda0 chat;
    public final getApplicationInfo phone;

    /* JADX WARN: Type inference failed for: r0v0, types: [com.roadrunner.home.nest.api.data.Actions$Companion] */
    static {
        int i = RemoteActionCompatParcelizer + 45;
        IconCompatParcelizer = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i2 = i % 2;
    }

    public /* synthetic */ invokeyxL6bBk(int i, getApplicationInfo getapplicationinfo, CoroutineLiveDataExternalSyntheticLambda0 coroutineLiveDataExternalSyntheticLambda0) {
        if ((i & 1) == 0) {
            this.phone = null;
        } else {
            this.phone = getapplicationinfo;
            int i2 = 2 % 2;
        }
        if ((i & 2) == 0) {
            this.chat = null;
            int i3 = read + 109;
            serializer = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i4 = i3 % 2;
            return;
        }
        this.chat = coroutineLiveDataExternalSyntheticLambda0;
        int i5 = read + 23;
        serializer = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i6 = i5 % 2;
    }

    public final int hashCode() {
        int iHashCode;
        int i = 2 % 2;
        getApplicationInfo getapplicationinfo = this.phone;
        int iHashCode2 = 0;
        if (getapplicationinfo == null) {
            int i2 = serializer + 59;
            read = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i3 = i2 % 2;
            iHashCode = 0;
        } else {
            iHashCode = getapplicationinfo.hashCode();
        }
        CoroutineLiveDataExternalSyntheticLambda0 coroutineLiveDataExternalSyntheticLambda0 = this.chat;
        if (coroutineLiveDataExternalSyntheticLambda0 != null) {
            iHashCode2 = coroutineLiveDataExternalSyntheticLambda0.hashCode();
            int i4 = read + 69;
            serializer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            if (i4 % 2 != 0) {
                int i5 = 2 / 5;
            }
        }
        return (iHashCode * 31) + iHashCode2;
    }

    public final String toString() {
        int i = 2 % 2;
        String str = "Actions(phone=" + this.phone + ", chat=" + this.chat + ")";
        int i2 = read + 21;
        serializer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        return str;
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        int i2 = read;
        int i3 = i2 + 5;
        serializer = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        Object obj2 = null;
        if (i3 % 2 != 0) {
            obj2.hashCode();
            throw null;
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof invokeyxL6bBk)) {
            int i4 = i2 + 123;
            serializer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i5 = i4 % 2;
            int i6 = i2 + 13;
            serializer = i6 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            if (i6 % 2 == 0) {
                return false;
            }
            throw null;
        }
        invokeyxL6bBk invokeyxl6bbk = (invokeyxL6bBk) obj;
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.phone, invokeyxl6bbk.phone}, getCieXyz.write())).booleanValue()) {
            int i7 = serializer + 11;
            read = i7 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            return i7 % 2 == 0;
        }
        if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.chat, invokeyxl6bbk.chat}, getCieXyz.write())).booleanValue()) {
            return true;
        }
        int i8 = serializer + 7;
        read = i8 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i9 = i8 % 2;
        return false;
    }
}
