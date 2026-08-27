package androidx.compose.ui.window;

import android.os.IBinder;
import androidx.compose.ui.graphics.Fields;
import bo.app.d$$ExternalSyntheticOutline0;
import com.huawei.riemann.location.common.utils.Constant;
import kotlin.jvm.internal.DefaultConstructorMarker;
import o.getCieXyz;
import o.onItemDismisslambda0;
import o.removeNodeAtDepth;

/* JADX INFO: loaded from: classes.dex */
public final class DialogProperties {
    public static final int $stable = 0;
    private final boolean decorFitsSystemWindows;
    private final boolean dismissOnBackPress;
    private final boolean dismissOnClickOutside;
    private final SecureFlagPolicy securePolicy;
    private final boolean usePlatformDefaultWidth;
    private final String windowTitle;
    private final IBinder windowToken;
    private final int windowType;

    public final boolean getDecorFitsSystemWindows() {
        return this.decorFitsSystemWindows;
    }

    public final boolean getDismissOnBackPress() {
        return this.dismissOnBackPress;
    }

    public final boolean getDismissOnClickOutside() {
        return this.dismissOnClickOutside;
    }

    public final SecureFlagPolicy getSecurePolicy() {
        return this.securePolicy;
    }

    public final boolean getUsePlatformDefaultWidth() {
        return this.usePlatformDefaultWidth;
    }

    public final String getWindowTitle() {
        return this.windowTitle;
    }

    public final IBinder getWindowToken() {
        return this.windowToken;
    }

    public final int getWindowType() {
        return this.windowType;
    }

    public int hashCode() {
        int iM = d$$ExternalSyntheticOutline0.m(d$$ExternalSyntheticOutline0.m((this.securePolicy.hashCode() + d$$ExternalSyntheticOutline0.m(Boolean.hashCode(this.dismissOnBackPress) * 31, 31, this.dismissOnClickOutside)) * 31, 31, this.usePlatformDefaultWidth), 31, this.decorFitsSystemWindows);
        int i = this.windowType;
        IBinder iBinder = this.windowToken;
        return ((iM + i) * 31) + (iBinder != null ? iBinder.hashCode() : 0);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DialogProperties)) {
            return false;
        }
        DialogProperties dialogProperties = (DialogProperties) obj;
        if (this.dismissOnBackPress != dialogProperties.dismissOnBackPress || this.dismissOnClickOutside != dialogProperties.dismissOnClickOutside || this.securePolicy != dialogProperties.securePolicy || this.usePlatformDefaultWidth != dialogProperties.usePlatformDefaultWidth || this.decorFitsSystemWindows != dialogProperties.decorFitsSystemWindows || this.windowType != dialogProperties.windowType) {
            return false;
        }
        return ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.windowToken, dialogProperties.windowToken}, getCieXyz.write())).booleanValue();
    }

    public /* synthetic */ DialogProperties(boolean z, boolean z2, SecureFlagPolicy secureFlagPolicy, boolean z3, boolean z4, String str, int i, IBinder iBinder, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? true : z, (i2 & 2) != 0 ? true : z2, (i2 & 4) != 0 ? SecureFlagPolicy.Inherit : secureFlagPolicy, (i2 & 8) != 0 ? true : z3, (i2 & 16) == 0 ? z4 : true, (i2 & 32) != 0 ? "" : str, (i2 & 64) != 0 ? 2 : i, (i2 & Fields.SpotShadowColor) != 0 ? null : iBinder);
    }

    public DialogProperties(boolean z, boolean z2, SecureFlagPolicy secureFlagPolicy, boolean z3, boolean z4, String str, int i, IBinder iBinder) {
        this.dismissOnBackPress = z;
        this.dismissOnClickOutside = z2;
        this.securePolicy = secureFlagPolicy;
        this.usePlatformDefaultWidth = z3;
        this.decorFitsSystemWindows = z4;
        this.windowTitle = str;
        this.windowType = i;
        this.windowToken = iBinder;
    }

    public DialogProperties() {
        this(false, false, null, false, false, null, 0, null, 255, null);
    }

    public /* synthetic */ DialogProperties(boolean z, boolean z2, boolean z3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? true : z, (i & 2) != 0 ? true : z2, (i & 4) != 0 ? true : z3);
    }

    public DialogProperties(boolean z, boolean z2, boolean z3) {
        this(z, z2, SecureFlagPolicy.Inherit, z3, true, null, 0, null, Constant.ERROR_WSS_INVALID, null);
    }

    public /* synthetic */ DialogProperties(boolean z, boolean z2, SecureFlagPolicy secureFlagPolicy, boolean z3, boolean z4, String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? true : z, (i & 2) != 0 ? true : z2, (i & 4) != 0 ? SecureFlagPolicy.Inherit : secureFlagPolicy, (i & 8) != 0 ? true : z3, (i & 16) == 0 ? z4 : true, (i & 32) != 0 ? "" : str);
    }

    @onItemDismisslambda0
    public /* synthetic */ DialogProperties(boolean z, boolean z2, SecureFlagPolicy secureFlagPolicy, boolean z3, boolean z4, String str) {
        this(z, z2, secureFlagPolicy, z3, z4, str, 2, (IBinder) null);
    }

    public /* synthetic */ DialogProperties(boolean z, boolean z2, SecureFlagPolicy secureFlagPolicy, boolean z3, boolean z4, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? true : z, (i & 2) != 0 ? true : z2, (i & 4) != 0 ? SecureFlagPolicy.Inherit : secureFlagPolicy, (i & 8) != 0 ? true : z3, (i & 16) != 0 ? true : z4);
    }

    @onItemDismisslambda0
    public /* synthetic */ DialogProperties(boolean z, boolean z2, SecureFlagPolicy secureFlagPolicy, boolean z3, boolean z4) {
        this(z, z2, SecureFlagPolicy.Inherit, z3, true, "", 0, null, 192, null);
    }

    public /* synthetic */ DialogProperties(boolean z, boolean z2, SecureFlagPolicy secureFlagPolicy, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? true : z, (i & 2) != 0 ? true : z2, (i & 4) != 0 ? SecureFlagPolicy.Inherit : secureFlagPolicy);
    }

    @onItemDismisslambda0
    public /* synthetic */ DialogProperties(boolean z, boolean z2, SecureFlagPolicy secureFlagPolicy) {
        this(z, z2, secureFlagPolicy, true, true, null, 0, null, Constant.ERROR_WSS_INVALID, null);
    }
}
