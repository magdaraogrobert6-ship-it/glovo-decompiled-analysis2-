package o;

/* JADX INFO: loaded from: classes3.dex */
public final class getRequiredTypeConverterClasses {
    private static int IconCompatParcelizer = 1;
    private static int read;
    public boolean RemoteActionCompatParcelizer;
    public final Object serializer;

    public getRequiredTypeConverterClasses(Object obj) {
        this.serializer = obj;
    }

    public final int hashCode() {
        int iHashCode;
        int i = 2 % 2;
        int i2 = IconCompatParcelizer;
        int i3 = i2 + 7;
        int i4 = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        read = i4;
        if (i3 % 2 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        Object obj2 = this.serializer;
        if (obj2 != null) {
            int i5 = i4 + 11;
            IconCompatParcelizer = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i6 = i5 % 2;
            iHashCode = obj2.hashCode();
        } else {
            int i7 = i2 + 3;
            read = i7 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i8 = i7 % 2;
            iHashCode = 0;
        }
        return Boolean.hashCode(this.RemoteActionCompatParcelizer) + (iHashCode * 31);
    }

    public final boolean equals(Object obj) {
        Class<?> cls;
        int i = 2 % 2;
        if (this == obj) {
            return true;
        }
        if (obj != null) {
            int i2 = IconCompatParcelizer + 125;
            read = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i3 = i2 % 2;
            cls = obj.getClass();
        } else {
            cls = null;
        }
        if (getRequiredTypeConverterClasses.class.equals(cls)) {
            obj.getClass();
            getRequiredTypeConverterClasses getrequiredtypeconverterclasses = (getRequiredTypeConverterClasses) obj;
            return ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.serializer, getrequiredtypeconverterclasses.serializer}, getCieXyz.write())).booleanValue() && this.RemoteActionCompatParcelizer == getrequiredtypeconverterclasses.RemoteActionCompatParcelizer;
        }
        int i4 = read + 91;
        IconCompatParcelizer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return false;
    }
}
