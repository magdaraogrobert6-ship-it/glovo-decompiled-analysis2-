package o;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.res.TypedArray;
import android.net.Uri;
import android.util.AttributeSet;

/* JADX INFO: loaded from: classes.dex */
public final class setNativeStrokeWidth extends opN5in7k0 {
    public Intent IconCompatParcelizer;
    public String read;

    public static String IconCompatParcelizer(Context context, String str) {
        if (str == null) {
            return null;
        }
        String packageName = context.getPackageName();
        packageName.getClass();
        return setCarryoverInAppMessage.write(str, "${applicationId}", packageName);
    }

    @Override // o.opN5in7k0
    public final void RemoteActionCompatParcelizer(Context context, AttributeSet attributeSet) {
        context.getClass();
        super.RemoteActionCompatParcelizer(context, attributeSet);
        TypedArray typedArrayObtainAttributes = context.getResources().obtainAttributes(attributeSet, next.ActivityNavigator);
        typedArrayObtainAttributes.getClass();
        String strIconCompatParcelizer = IconCompatParcelizer(context, typedArrayObtainAttributes.getString(4));
        if (this.IconCompatParcelizer == null) {
            this.IconCompatParcelizer = new Intent();
        }
        Intent intent = this.IconCompatParcelizer;
        intent.getClass();
        intent.setPackage(strIconCompatParcelizer);
        String string = typedArrayObtainAttributes.getString(0);
        if (string != null) {
            if (string.charAt(0) == '.') {
                string = context.getPackageName() + string;
            }
            ComponentName componentName = new ComponentName(context, string);
            if (this.IconCompatParcelizer == null) {
                this.IconCompatParcelizer = new Intent();
            }
            Intent intent2 = this.IconCompatParcelizer;
            intent2.getClass();
            intent2.setComponent(componentName);
        }
        String string2 = typedArrayObtainAttributes.getString(1);
        if (this.IconCompatParcelizer == null) {
            this.IconCompatParcelizer = new Intent();
        }
        Intent intent3 = this.IconCompatParcelizer;
        intent3.getClass();
        intent3.setAction(string2);
        String strIconCompatParcelizer2 = IconCompatParcelizer(context, typedArrayObtainAttributes.getString(2));
        if (strIconCompatParcelizer2 != null) {
            Uri uri = Uri.parse(strIconCompatParcelizer2);
            if (this.IconCompatParcelizer == null) {
                this.IconCompatParcelizer = new Intent();
            }
            Intent intent4 = this.IconCompatParcelizer;
            intent4.getClass();
            intent4.setData(uri);
        }
        this.read = IconCompatParcelizer(context, typedArrayObtainAttributes.getString(3));
        typedArrayObtainAttributes.recycle();
    }

    @Override // o.opN5in7k0
    public final String toString() {
        Intent intent = this.IconCompatParcelizer;
        ComponentName component = intent != null ? intent.getComponent() : null;
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        if (component != null) {
            sb.append(" class=");
            sb.append(component.getClassName());
        } else {
            Intent intent2 = this.IconCompatParcelizer;
            String action = intent2 != null ? intent2.getAction() : null;
            if (action != null) {
                sb.append(" action=");
                sb.append(action);
            }
        }
        return sb.toString();
    }

    @Override // o.opN5in7k0
    public final int hashCode() {
        int iHashCode = super.hashCode();
        Intent intent = this.IconCompatParcelizer;
        int iFilterHashCode = intent != null ? intent.filterHashCode() : 0;
        String str = this.read;
        return (((iHashCode * 31) + iFilterHashCode) * 31) + (str != null ? str.hashCode() : 0);
    }

    @Override // o.opN5in7k0
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof setNativeStrokeWidth) || !super.equals(obj)) {
            return false;
        }
        Intent intent = this.IconCompatParcelizer;
        if (intent != null) {
            if (!intent.filterEquals(((setNativeStrokeWidth) obj).IconCompatParcelizer)) {
                return false;
            }
        } else if (((setNativeStrokeWidth) obj).IconCompatParcelizer != null) {
            return false;
        }
        return ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.read, ((setNativeStrokeWidth) obj).read}, getCieXyz.write())).booleanValue();
    }

    public setNativeStrokeWidth(toAndroidPathDashPathEffectStyleoQv6xUo toandroidpathdashpatheffectstyleoqv6xuo) {
        super(toandroidpathdashpatheffectstyleoqv6xuo);
    }
}
