package o;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;

/* JADX INFO: loaded from: classes.dex */
public final class makeTransparentColors extends opN5in7k0 {
    public String read;

    @Override // o.opN5in7k0
    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append(" class=");
        String str = this.read;
        if (str == null) {
            sb.append("null");
        } else {
            sb.append(str);
        }
        return sb.toString();
    }

    @Override // o.opN5in7k0
    public final void RemoteActionCompatParcelizer(Context context, AttributeSet attributeSet) {
        context.getClass();
        super.RemoteActionCompatParcelizer(context, attributeSet);
        TypedArray typedArrayObtainAttributes = context.getResources().obtainAttributes(attributeSet, makeTransparentStops.FragmentNavigator);
        typedArrayObtainAttributes.getClass();
        String string = typedArrayObtainAttributes.getString(0);
        if (string != null) {
            this.read = string;
        }
        typedArrayObtainAttributes.recycle();
    }

    @Override // o.opN5in7k0
    public final int hashCode() {
        int iHashCode = super.hashCode();
        String str = this.read;
        return (iHashCode * 31) + (str != null ? str.hashCode() : 0);
    }

    @Override // o.opN5in7k0
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof makeTransparentColors) || !super.equals(obj)) {
            return false;
        }
        return ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.read, ((makeTransparentColors) obj).read}, getCieXyz.write())).booleanValue();
    }

    public makeTransparentColors(toAndroidPathDashPathEffectStyleoQv6xUo toandroidpathdashpatheffectstyleoqv6xuo) {
        super(toandroidpathdashpatheffectstyleoqv6xuo);
    }
}
