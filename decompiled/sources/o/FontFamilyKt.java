package o;

import androidx.compose.ui.graphics.Fields;
import com.roadrunner.delivery.common.data.model.tasks.DatePicker$DateValidation$Companion;
import kotlinx.serialization.Serializable;
import o.r8lambdaQeb1b_Sm9krOS8DzOqWH4OENd3I;
import o.setGraphicModalMaxWidthDp;

/* JADX INFO: loaded from: classes3.dex */
@Serializable
public final class FontFamilyKt {
    public static final DatePicker$DateValidation$Companion Companion = new Object() { // from class: com.roadrunner.delivery.common.data.model.tasks.DatePicker$DateValidation$Companion
        private static int serializer = 0;
        private static int write = 1;

        public final setGraphicModalMaxWidthDp serializer() {
            int i = 2 % 2;
            int i2 = write + 87;
            serializer = i2 % Fields.SpotShadowColor;
            int i3 = i2 % 2;
            r8lambdaQeb1b_Sm9krOS8DzOqWH4OENd3I r8lambdaqeb1b_sm9kros8dzoqwh4oend3i = r8lambdaQeb1b_Sm9krOS8DzOqWH4OENd3I.serializer;
            int i4 = serializer + 111;
            write = i4 % Fields.SpotShadowColor;
            int i5 = i4 % 2;
            return r8lambdaqeb1b_sm9kros8dzoqwh4oend3i;
        }
    };
    private static int IconCompatParcelizer = 0;
    private static int RemoteActionCompatParcelizer = 1;
    private static int read = 1;
    private static int write;
    public final String date;
    public final String format;

    /* JADX WARN: Type inference failed for: r0v0, types: [com.roadrunner.delivery.common.data.model.tasks.DatePicker$DateValidation$Companion] */
    static {
        int i = RemoteActionCompatParcelizer + 67;
        IconCompatParcelizer = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i % 2 != 0) {
            throw null;
        }
    }

    public final String serializer() {
        int i = 2 % 2;
        int i2 = write + 33;
        read = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            return this.date;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String write() {
        int i = 2 % 2;
        int i2 = read + 113;
        write = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            return this.format;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public /* synthetic */ FontFamilyKt(int i, String str, String str2) {
        if (3 == (i & 3)) {
            this.date = str;
            this.format = str2;
        } else {
            DefaultContentCardsUpdateHandlerCompanionCREATOR1.IconCompatParcelizer(i, 3, r8lambdaQeb1b_Sm9krOS8DzOqWH4OENd3I.serializer.getDescriptor());
            throw null;
        }
    }

    public final String toString() {
        int i = 2 % 2;
        int i2 = read + 51;
        write = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        String strWrite = r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.write("DateValidation(date=", this.date, ", format=", this.format, ")");
        int i4 = read + 43;
        write = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 == 0) {
            return strWrite;
        }
        throw null;
    }

    public final int hashCode() {
        int i = 2 % 2;
        int i2 = read + 101;
        write = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            return this.format.hashCode() >> (this.date.hashCode() + 105);
        }
        return (this.date.hashCode() * 31) + this.format.hashCode();
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        if (this != obj) {
            if (!(obj instanceof FontFamilyKt)) {
                return false;
            }
            FontFamilyKt fontFamilyKt = (FontFamilyKt) obj;
            Object[] objArr = {this.date, fontFamilyKt.date};
            if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), objArr, getCieXyz.write())).booleanValue()) {
                Object[] objArr2 = {this.format, fontFamilyKt.format};
                if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), objArr2, getCieXyz.write())).booleanValue()) {
                    return true;
                }
                int i2 = read + 121;
                write = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                int i3 = i2 % 2;
                return false;
            }
            int i4 = write + 73;
            read = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i5 = i4 % 2;
            return false;
        }
        int i6 = write + 121;
        read = i6 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i7 = i6 % 2;
        return true;
    }
}
