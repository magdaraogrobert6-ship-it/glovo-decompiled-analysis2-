package o;

import android.os.Build;
import android.text.TextUtils;
import android.view.View;

/* JADX INFO: loaded from: classes.dex */
public final class accessgetRedirectcp {
    public final int IconCompatParcelizer;
    public final int RemoteActionCompatParcelizer;
    public final int read;
    public final Class serializer;
    public final /* synthetic */ int write;

    public accessgetRedirectcp(int i, Class cls, int i2, int i3, int i4) {
        this.write = i4;
        this.RemoteActionCompatParcelizer = i;
        this.serializer = cls;
        this.IconCompatParcelizer = i2;
        this.read = i3;
    }

    /* JADX WARN: Code duplicated, block: B:57:0x00be  */
    public final void write(View view, Object obj) {
        Object tag;
        boolean z;
        int i = Build.VERSION.SDK_INT;
        int i2 = this.write;
        int i3 = this.read;
        if (i >= i3) {
            if (i2 == 0) {
                captureFocus.serializer(view, ((Boolean) obj).booleanValue());
                return;
            }
            if (i2 == 1) {
                captureFocus.IconCompatParcelizer(view, (CharSequence) obj);
                return;
            } else if (i2 != 2) {
                captureFocus.write(view, ((Boolean) obj).booleanValue());
                return;
            } else {
                getFocusRequesterNodesui.IconCompatParcelizer(view, (CharSequence) obj);
                return;
            }
        }
        int i4 = Build.VERSION.SDK_INT;
        int i5 = this.RemoteActionCompatParcelizer;
        androidx.core.view.AccessibilityDelegateCompat accessibilityDelegateCompat = null;
        if (i4 < i3) {
            tag = view.getTag(i5);
            if (!this.serializer.isInstance(tag)) {
                tag = null;
            }
        } else if (i2 == 0) {
            tag = Boolean.valueOf(captureFocus.RemoteActionCompatParcelizer(view));
        } else if (i2 != 1) {
            tag = i2 != 2 ? Boolean.valueOf(captureFocus.serializer(view)) : getFocusRequesterNodesui.read(view);
        } else {
            tag = captureFocus.IconCompatParcelizer(view);
        }
        boolean z2 = false;
        if (i2 == 0) {
            Boolean bool = (Boolean) tag;
            Boolean bool2 = (Boolean) obj;
            if ((bool != null && bool.booleanValue()) == (bool2 != null && bool2.booleanValue())) {
                z2 = true;
            }
            z = !z2;
        } else if (i2 == 1 || i2 == 2) {
            boolean zEquals = TextUtils.equals((CharSequence) tag, (CharSequence) obj);
            z = !zEquals;
        } else {
            Boolean bool3 = (Boolean) tag;
            Boolean bool4 = (Boolean) obj;
            if ((bool3 != null && bool3.booleanValue()) == (bool4 != null && bool4.booleanValue())) {
                z2 = true;
            }
            z = !z2;
        }
        if (z) {
            View.AccessibilityDelegate accessibilityDelegateSerializer = FocusPropertiesNode.serializer(view);
            if (accessibilityDelegateSerializer != null) {
                accessibilityDelegateCompat = accessibilityDelegateSerializer instanceof is1dFocusSearch3ESFkO8 ? ((is1dFocusSearch3ESFkO8) accessibilityDelegateSerializer).RemoteActionCompatParcelizer : new androidx.core.view.AccessibilityDelegateCompat(accessibilityDelegateSerializer);
            }
            if (accessibilityDelegateCompat == null) {
                accessibilityDelegateCompat = new androidx.core.view.AccessibilityDelegateCompat();
            }
            FocusPropertiesNode.write(view, accessibilityDelegateCompat);
            view.setTag(i5, obj);
            FocusPropertiesNode.serializer(this.IconCompatParcelizer, view);
        }
    }
}
