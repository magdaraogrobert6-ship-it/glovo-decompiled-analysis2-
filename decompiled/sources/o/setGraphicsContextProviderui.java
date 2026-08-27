package o;

import android.view.View;
import kotlin.properties.ObservableProperty;

/* JADX INFO: loaded from: classes.dex */
public final class setGraphicsContextProviderui extends ObservableProperty {
    private static int read = 1;
    private static int write;
    public final /* synthetic */ Object RemoteActionCompatParcelizer;
    public final /* synthetic */ int serializer = 2;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public setGraphicsContextProviderui(setDrawResultui setdrawresultui, float f) {
        super(androidx.compose.ui.unit.Dp.m3671boximpl(f));
        this.RemoteActionCompatParcelizer = setdrawresultui;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public setGraphicsContextProviderui(setDrawResultui setdrawresultui, DrawModifierKt drawModifierKt) {
        super(drawModifierKt);
        this.RemoteActionCompatParcelizer = setdrawresultui;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public setGraphicsContextProviderui(PlatformHapticFeedback platformHapticFeedback) {
        super(null);
        this.RemoteActionCompatParcelizer = platformHapticFeedback;
    }

    /* JADX WARN: Code duplicated, block: B:23:0x0069  */
    /* JADX WARN: Code duplicated, block: B:27:0x007a  */
    /* JADX WARN: Code duplicated, block: B:30:0x0089  */
    /* JADX WARN: Code duplicated, block: B:33:0x0099  */
    @Override // kotlin.properties.ObservableProperty
    public final void afterChange(registerInAppMessageManagerlambda2 registerinappmessagemanagerlambda2, Object obj, Object obj2) {
        accesstoPxR2X_6ojd accesstopxr2x_6ojd;
        DropShadowScope dropShadowScopeWrite;
        int i = 2 % 2;
        int i2 = this.serializer;
        Object obj3 = this.RemoteActionCompatParcelizer;
        if (i2 == 0) {
            ((androidx.compose.ui.unit.Dp) obj).m3687unboximpl();
            float fM3687unboximpl = ((androidx.compose.ui.unit.Dp) obj2).m3687unboximpl();
            if (!Float.isNaN(fM3687unboximpl)) {
                int i3 = read + 53;
                write = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                int i4 = i3 % 2;
                ((setDrawResultui) obj3).read.IconCompatParcelizer(fM3687unboximpl, registerinappmessagemanagerlambda2.getName());
                return;
            }
            return;
        }
        if (i2 != 1) {
            ((PlatformHapticFeedback) obj3).read.setOnClickListener((View.OnClickListener) obj2);
            return;
        }
        DrawModifierKt drawModifierKt = (DrawModifierKt) obj2;
        accesstoPxR2X_6ojd accesstopxr2x_6ojd2 = ((setDrawResultui) obj3).read;
        String name = registerinappmessagemanagerlambda2.getName();
        drawModifierKt.getClass();
        androidx.navigation.NavArgsLazy navArgsLazy = drawModifierKt.write;
        androidx.navigation.NavArgsLazy navArgsLazy2 = drawModifierKt.read;
        androidx.navigation.NavArgsLazy navArgsLazy3 = drawModifierKt.RemoteActionCompatParcelizer;
        androidx.compose.ui.unit.Dp dp = (androidx.compose.ui.unit.Dp) navArgsLazy3.MediaSessionCompatQueueItem;
        String str = (String) navArgsLazy3.read;
        if (dp == null) {
            int i5 = read + 21;
            write = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            Object obj4 = null;
            if (i5 % 2 != 0) {
                obj4.hashCode();
                throw null;
            }
            if (str == null && ((androidx.compose.ui.unit.Dp) navArgsLazy2.MediaSessionCompatQueueItem) == null && ((String) navArgsLazy2.read) == null) {
                int i6 = write + 31;
                read = i6 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                if (i6 % 2 == 0) {
                    navArgsLazy.write();
                    throw null;
                }
                dropShadowScopeWrite = navArgsLazy.write();
            } else {
                accesstopxr2x_6ojd = new accesstoPxR2X_6ojd(new char[0]);
                if (((androidx.compose.ui.unit.Dp) navArgsLazy3.MediaSessionCompatQueueItem) == null || str != null) {
                    accesstopxr2x_6ojd.RemoteActionCompatParcelizer("min", navArgsLazy3.write());
                }
                if (((androidx.compose.ui.unit.Dp) navArgsLazy2.MediaSessionCompatQueueItem) == null) {
                    int i7 = write + 17;
                    read = i7 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                    int i8 = i7 % 2;
                    if (((String) navArgsLazy2.read) != null) {
                        accesstopxr2x_6ojd.RemoteActionCompatParcelizer("max", navArgsLazy2.write());
                    }
                } else {
                    accesstopxr2x_6ojd.RemoteActionCompatParcelizer("max", navArgsLazy2.write());
                }
                accesstopxr2x_6ojd.RemoteActionCompatParcelizer("value", navArgsLazy.write());
                dropShadowScopeWrite = accesstopxr2x_6ojd;
            }
        } else {
            accesstopxr2x_6ojd = new accesstoPxR2X_6ojd(new char[0]);
            if (((androidx.compose.ui.unit.Dp) navArgsLazy3.MediaSessionCompatQueueItem) == null) {
                accesstopxr2x_6ojd.RemoteActionCompatParcelizer("min", navArgsLazy3.write());
            } else {
                accesstopxr2x_6ojd.RemoteActionCompatParcelizer("min", navArgsLazy3.write());
            }
            if (((androidx.compose.ui.unit.Dp) navArgsLazy2.MediaSessionCompatQueueItem) == null) {
                int i9 = write + 17;
                read = i9 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                int i10 = i9 % 2;
                if (((String) navArgsLazy2.read) != null) {
                    accesstopxr2x_6ojd.RemoteActionCompatParcelizer("max", navArgsLazy2.write());
                }
            } else {
                accesstopxr2x_6ojd.RemoteActionCompatParcelizer("max", navArgsLazy2.write());
            }
            accesstopxr2x_6ojd.RemoteActionCompatParcelizer("value", navArgsLazy.write());
            dropShadowScopeWrite = accesstopxr2x_6ojd;
        }
        accesstopxr2x_6ojd2.RemoteActionCompatParcelizer(name, dropShadowScopeWrite);
    }
}
