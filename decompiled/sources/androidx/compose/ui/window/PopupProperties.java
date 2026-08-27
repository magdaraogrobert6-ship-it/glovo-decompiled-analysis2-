package androidx.compose.ui.window;

import android.os.IBinder;
import androidx.compose.ui.graphics.Fields;
import bo.app.d$$ExternalSyntheticOutline0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import o.getCieXyz;
import o.onItemDismisslambda0;
import o.removeNodeAtDepth;

/* JADX INFO: loaded from: classes.dex */
public final class PopupProperties {
    public static final int $stable = 0;
    private final boolean dismissOnBackPress;
    private final boolean dismissOnClickOutside;
    private final boolean excludeFromSystemGesture;
    private final int flags;
    private final boolean inheritSecurePolicy;
    private final boolean usePlatformDefaultWidth;
    private final IBinder windowToken;
    private final int windowType;

    public final boolean getClippingEnabled() {
        return (this.flags & Fields.RotationY) == 0;
    }

    public final boolean getDismissOnBackPress() {
        return this.dismissOnBackPress;
    }

    public final boolean getDismissOnClickOutside() {
        return this.dismissOnClickOutside;
    }

    public final boolean getExcludeFromSystemGesture() {
        return this.excludeFromSystemGesture;
    }

    public final int getFlags$ui() {
        return this.flags;
    }

    public final boolean getFocusable() {
        return (this.flags & 8) == 0;
    }

    public final boolean getInheritSecurePolicy$ui() {
        return this.inheritSecurePolicy;
    }

    public final boolean getUsePlatformDefaultWidth() {
        return this.usePlatformDefaultWidth;
    }

    public final IBinder getWindowToken() {
        return this.windowToken;
    }

    public final int getWindowType() {
        return this.windowType;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PopupProperties)) {
            return false;
        }
        PopupProperties popupProperties = (PopupProperties) obj;
        if (this.flags != popupProperties.flags || this.inheritSecurePolicy != popupProperties.inheritSecurePolicy || this.dismissOnBackPress != popupProperties.dismissOnBackPress || this.dismissOnClickOutside != popupProperties.dismissOnClickOutside || this.excludeFromSystemGesture != popupProperties.excludeFromSystemGesture || this.usePlatformDefaultWidth != popupProperties.usePlatformDefaultWidth || this.windowType != popupProperties.windowType) {
            return false;
        }
        return ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.windowToken, popupProperties.windowToken}, getCieXyz.write())).booleanValue();
    }

    public final SecureFlagPolicy getSecurePolicy() {
        if (this.inheritSecurePolicy) {
            return SecureFlagPolicy.Inherit;
        }
        return (this.flags & 8192) == 0 ? SecureFlagPolicy.SecureOff : SecureFlagPolicy.SecureOn;
    }

    public int hashCode() {
        int iM = d$$ExternalSyntheticOutline0.m(d$$ExternalSyntheticOutline0.m(d$$ExternalSyntheticOutline0.m(d$$ExternalSyntheticOutline0.m(d$$ExternalSyntheticOutline0.m(this.flags * 31, 31, this.inheritSecurePolicy), 31, this.dismissOnBackPress), 31, this.dismissOnClickOutside), 31, this.excludeFromSystemGesture), 31, this.usePlatformDefaultWidth);
        int i = this.windowType;
        IBinder iBinder = this.windowToken;
        return ((iM + i) * 31) + (iBinder != null ? iBinder.hashCode() : 0);
    }

    public /* synthetic */ PopupProperties(boolean z, boolean z2, boolean z3, SecureFlagPolicy secureFlagPolicy, boolean z4, boolean z5, boolean z6, int i, IBinder iBinder, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? false : z, (i2 & 2) != 0 ? true : z2, (i2 & 4) != 0 ? true : z3, (i2 & 8) != 0 ? SecureFlagPolicy.Inherit : secureFlagPolicy, (i2 & 16) != 0 ? true : z4, (i2 & 32) == 0 ? z5 : true, (i2 & 64) == 0 ? z6 : false, (i2 & Fields.SpotShadowColor) != 0 ? 1002 : i, (i2 & Fields.RotationX) != 0 ? null : iBinder);
    }

    public /* synthetic */ PopupProperties(int i, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, int i2, IBinder iBinder, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this(i, (i3 & 2) != 0 ? true : z, (i3 & 4) != 0 ? true : z2, (i3 & 8) != 0 ? true : z3, (i3 & 16) == 0 ? z4 : true, (i3 & 32) != 0 ? false : z5, (i3 & 64) != 0 ? 1002 : i2, (i3 & Fields.SpotShadowColor) != 0 ? null : iBinder);
    }

    public /* synthetic */ PopupProperties(boolean z, boolean z2, boolean z3, boolean z4, boolean z5, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? false : z, (i & 2) != 0 ? true : z2, (i & 4) != 0 ? true : z3, (i & 8) == 0 ? z4 : true, (i & 16) != 0 ? false : z5);
    }

    public PopupProperties(boolean z, boolean z2, boolean z3, boolean z4, boolean z5) {
        this(z, z2, z3, SecureFlagPolicy.Inherit, true, z4, z5, 1002, (IBinder) null);
    }

    public /* synthetic */ PopupProperties(boolean z, boolean z2, boolean z3, SecureFlagPolicy secureFlagPolicy, boolean z4, boolean z5, boolean z6, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? false : z, (i & 2) != 0 ? true : z2, (i & 4) != 0 ? true : z3, (i & 8) != 0 ? SecureFlagPolicy.Inherit : secureFlagPolicy, (i & 16) != 0 ? true : z4, (i & 32) == 0 ? z5 : true, (i & 64) != 0 ? false : z6);
    }

    @onItemDismisslambda0
    public /* synthetic */ PopupProperties(boolean z, boolean z2, boolean z3, SecureFlagPolicy secureFlagPolicy, boolean z4, boolean z5, boolean z6) {
        this(z, z2, z3, secureFlagPolicy, z4, z5, z6, 1002, (IBinder) null);
    }

    public /* synthetic */ PopupProperties(int i, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(i, (i2 & 2) != 0 ? true : z, (i2 & 4) != 0 ? true : z2, (i2 & 8) != 0 ? true : z3, (i2 & 16) == 0 ? z4 : true, (i2 & 32) != 0 ? false : z5);
    }

    @onItemDismisslambda0
    public /* synthetic */ PopupProperties(int i, boolean z, boolean z2, boolean z3, boolean z4, boolean z5) {
        this(i, z, z2, z3, z4, z5, 1002, (IBinder) null);
    }

    public /* synthetic */ PopupProperties(boolean z, boolean z2, boolean z3, boolean z4, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? false : z, (i & 2) != 0 ? true : z2, (i & 4) != 0 ? true : z3, (i & 8) != 0 ? true : z4);
    }

    @onItemDismisslambda0
    public /* synthetic */ PopupProperties(boolean z, boolean z2, boolean z3, boolean z4) {
        this(z, z2, z3, SecureFlagPolicy.Inherit, true, z4);
    }

    public /* synthetic */ PopupProperties(boolean z, boolean z2, boolean z3, SecureFlagPolicy secureFlagPolicy, boolean z4, boolean z5, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? false : z, (i & 2) != 0 ? true : z2, (i & 4) != 0 ? true : z3, (i & 8) != 0 ? SecureFlagPolicy.Inherit : secureFlagPolicy, (i & 16) != 0 ? true : z4, (i & 32) == 0 ? z5 : true);
    }

    public PopupProperties(boolean z, boolean z2, boolean z3, SecureFlagPolicy secureFlagPolicy, boolean z4, boolean z5) {
        this(z, z2, z3, secureFlagPolicy, z4, z5, false, 0, null, 384, null);
    }

    public PopupProperties(int i, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, int i2, IBinder iBinder) {
        this.flags = i;
        this.inheritSecurePolicy = z;
        this.dismissOnBackPress = z2;
        this.dismissOnClickOutside = z3;
        this.excludeFromSystemGesture = z4;
        this.usePlatformDefaultWidth = z5;
        this.windowType = i2;
        this.windowToken = iBinder;
    }

    public PopupProperties(boolean z, boolean z2, boolean z3, SecureFlagPolicy secureFlagPolicy, boolean z4, boolean z5, boolean z6, int i, IBinder iBinder) {
        this(AndroidPopup_androidKt.createFlags(z, secureFlagPolicy, z5), secureFlagPolicy == SecureFlagPolicy.Inherit, z2, z3, z4, z6, i, iBinder);
    }
}
