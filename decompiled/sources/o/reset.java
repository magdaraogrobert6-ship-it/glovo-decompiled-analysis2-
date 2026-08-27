package o;

import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.DelayKt;

/* JADX INFO: loaded from: classes.dex */
public final class reset extends Lambda implements r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM {
    public static final reset IconCompatParcelizer;
    public static final reset MediaBrowserCompatMediaItem;
    public static final reset MediaDescriptionCompat;
    public static final reset MediaSessionCompatQueueItem;
    public static final reset RemoteActionCompatParcelizer;
    public static final reset read;
    public static final reset serializer;
    public static final reset write;
    public final /* synthetic */ int MediaMetadataCompat;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ reset(int i, int i2) {
        super(i);
        this.MediaMetadataCompat = i2;
    }

    static {
        int i = 1;
        serializer = new reset(i, i);
        write = new reset(i, 2);
        read = new reset(i, 3);
        IconCompatParcelizer = new reset(i, 4);
        RemoteActionCompatParcelizer = new reset(i, 0);
        MediaDescriptionCompat = new reset(i, 5);
        MediaBrowserCompatMediaItem = new reset(i, 6);
        MediaSessionCompatQueueItem = new reset(i, 7);
    }

    @Override // o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM
    public final Object invoke(Object obj) {
        switch (this.MediaMetadataCompat) {
            case 0:
                return obj;
            case 1:
                int iWrite = r8lambdapbG_fqEcit8CH1waoNmDxLhROlU.write();
                int iWrite2 = r8lambdapbG_fqEcit8CH1waoNmDxLhROlU.write();
                int iWrite3 = r8lambdapbG_fqEcit8CH1waoNmDxLhROlU.write();
                ScrollingLogicdoFlingAnimation2reverseScope1 scrollingLogicdoFlingAnimation2reverseScope1Serializer = onKeyEventZmokQxo.serializer((requiredWidthInVpY3zN4default) DelayKt.write(1332258063, iWrite2, -1332258060, r8lambdapbG_fqEcit8CH1waoNmDxLhROlU.write(), iWrite3, iWrite, new Object[]{220, 90, null, 4}), 2);
                int iWrite4 = r8lambdapbG_fqEcit8CH1waoNmDxLhROlU.write();
                int iWrite5 = r8lambdapbG_fqEcit8CH1waoNmDxLhROlU.write();
                int iWrite6 = r8lambdapbG_fqEcit8CH1waoNmDxLhROlU.write();
                ScrollingLogicdoFlingAnimation2reverseScope1 scrollingLogicdoFlingAnimation2reverseScope1Serializer2 = scrollingLogicdoFlingAnimation2reverseScope1Serializer.serializer(onKeyEventZmokQxo.IconCompatParcelizer((requiredWidthInVpY3zN4default) DelayKt.write(1332258063, iWrite5, -1332258060, r8lambdapbG_fqEcit8CH1waoNmDxLhROlU.write(), iWrite6, iWrite4, new Object[]{220, 90, null, 4}), 4));
                int iWrite7 = r8lambdapbG_fqEcit8CH1waoNmDxLhROlU.write();
                int iWrite8 = r8lambdapbG_fqEcit8CH1waoNmDxLhROlU.write();
                int iWrite9 = r8lambdapbG_fqEcit8CH1waoNmDxLhROlU.write();
                return androidx.compose.animation.AnimatedContentKt.RemoteActionCompatParcelizer(scrollingLogicdoFlingAnimation2reverseScope1Serializer2, onKeyEventZmokQxo.write((requiredWidthInVpY3zN4default) DelayKt.write(1332258063, iWrite8, -1332258060, r8lambdapbG_fqEcit8CH1waoNmDxLhROlU.write(), iWrite9, iWrite7, new Object[]{90, 0, null, 6}), 2));
            case 2:
                return obj;
            case 3:
                Boolean bool = (Boolean) obj;
                bool.booleanValue();
                return bool;
            case 4:
                long jM719convertvNxB06k = androidx.compose.ui.graphics.Color.m719convertvNxB06k(((androidx.compose.ui.graphics.Color) obj).m732unboximpl(), androidx.compose.ui.graphics.colorspace.ColorSpaces.INSTANCE.getOklab());
                return new calculateApproachOffset(androidx.compose.ui.graphics.Color.m724getAlphaimpl(jM719convertvNxB06k), androidx.compose.ui.graphics.Color.m728getRedimpl(jM719convertvNxB06k), androidx.compose.ui.graphics.Color.m727getGreenimpl(jM719convertvNxB06k), androidx.compose.ui.graphics.Color.m725getBlueimpl(jM719convertvNxB06k));
            case 5:
                return DelayKt.IconCompatParcelizer(0.0f, 0.0f, 7, (Object) null);
            case 6:
                return Integer.valueOf((-((Number) obj).intValue()) / 2);
            default:
                return onKeyEventZmokQxo.RemoteActionCompatParcelizer;
        }
    }
}
