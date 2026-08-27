package o;

import android.view.View;
import androidx.drawerlayout.widget.DrawerLayout;
import com.mapbox.navigation.core.internal.router.RouterWrapper$$ExternalSyntheticLambda2;
import io.sentry.MovePreviousSession;

/* JADX INFO: loaded from: classes.dex */
public final class intersect extends FocusTargetNodeKt {
    private static int MediaMetadataCompat = 1;
    private static int read;
    public final int IconCompatParcelizer;
    public final MovePreviousSession RemoteActionCompatParcelizer = new MovePreviousSession(3, this);
    public final /* synthetic */ DrawerLayout serializer;
    public clearChildFocusdefault write;

    public static /* synthetic */ Object IconCompatParcelizer(int i, int i2, int i3, Object[] objArr, int i4, int i5, int i6) {
        int i7 = (~(i4 | i6)) | i2;
        int i8 = (~((~i6) | i4)) | i2;
        int i9 = (~i2) | i4;
        int i10 = i2 + i4 + i5 + (440753341 * i3) + ((-634449194) * i);
        int i11 = i10 * i10;
        int i12 = ((-907101825) * i2) + 1075183616 + ((-1421434046) * i4) + (i7 * (-1603099839)) + ((-1603099839) * i8) + (1603099839 * i9) + (181665792 * i5) + (780402688 * i3) + ((-180879360) * i) + (353763328 * i11);
        int i13 = (i2 * 892202253) + 1676176333 + (i4 * 892200102) + (i7 * (-717)) + (i8 * (-717)) + (i9 * 717) + (i5 * 892200819) + (i3 * (-770690073)) + (i * 448958498) + (i11 * 1390542848);
        return i12 + ((i13 * i13) * (-1042677760)) != 1 ? write(objArr) : RemoteActionCompatParcelizer(objArr);
    }

    public intersect(DrawerLayout drawerLayout, int i) {
        this.serializer = drawerLayout;
        this.IconCompatParcelizer = i;
    }

    @Override // o.FocusTargetNodeKt
    public final int write(int i, View view) {
        int i2 = 2 % 2;
        int i3 = read + 73;
        MediaMetadataCompat = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i4 = i3 % 2;
        int top = view.getTop();
        int i5 = MediaMetadataCompat + 119;
        read = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i5 % 2 != 0) {
            int i6 = 96 / 0;
        }
        return top;
    }

    private static /* synthetic */ Object RemoteActionCompatParcelizer(Object[] objArr) {
        intersect intersectVar = (intersect) objArr[0];
        int i = 2 % 2;
        int i2 = MediaMetadataCompat + 67;
        read = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            intersectVar.serializer.postDelayed(intersectVar.RemoteActionCompatParcelizer, 160L);
            return null;
        }
        intersectVar.serializer.postDelayed(intersectVar.RemoteActionCompatParcelizer, 160L);
        int i3 = 79 / 0;
        return null;
    }

    @Override // o.FocusTargetNodeKt
    public final int write(View view) {
        int i = 2 % 2;
        int i2 = read + 99;
        MediaMetadataCompat = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        if (!DrawerLayout.RemoteActionCompatParcelizer(view)) {
            int i4 = MediaMetadataCompat + 71;
            read = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            if (i4 % 2 == 0) {
                return 0;
            }
            throw null;
        }
        int i5 = read + 107;
        MediaMetadataCompat = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i6 = i5 % 2;
        int width = view.getWidth();
        int i7 = MediaMetadataCompat + 89;
        read = i7 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i8 = i7 % 2;
        return width;
    }

    @Override // o.FocusTargetNodeKt
    public final boolean IconCompatParcelizer(int i, View view) {
        int i2 = 2 % 2;
        if (DrawerLayout.RemoteActionCompatParcelizer(view)) {
            int i3 = this.IconCompatParcelizer;
            DrawerLayout drawerLayout = this.serializer;
            if (!(!drawerLayout.serializer(i3, view))) {
                int i4 = read + 91;
                MediaMetadataCompat = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                if (i4 % 2 == 0) {
                    drawerLayout.read(view);
                    throw null;
                }
                if (drawerLayout.read(view) == 0) {
                    return true;
                }
            }
        }
        int i5 = read + 35;
        MediaMetadataCompat = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i6 = i5 % 2;
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x002c  */
    /* JADX WARN: Code duplicated, block: B:7:0x001e  */
    @Override // o.FocusTargetNodeKt
    public final void read(int i, View view) {
        int i2 = 2 % 2;
        int i3 = read + 45;
        MediaMetadataCompat = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i4 = 5;
        if (i3 % 2 == 0) {
            ((isEmpty) view.getLayoutParams()).serializer = false;
            if (this.IconCompatParcelizer == 5) {
                int i5 = MediaMetadataCompat + 101;
                read = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                int i6 = i5 % 2;
            } else {
                i4 = 3;
            }
        } else {
            ((isEmpty) view.getLayoutParams()).serializer = false;
            if (this.IconCompatParcelizer == 3) {
                int i7 = MediaMetadataCompat + 101;
                read = i7 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                int i8 = i7 % 2;
            } else {
                i4 = 3;
            }
        }
        DrawerLayout drawerLayout = this.serializer;
        View view2 = drawerLayout.read(i4);
        if (view2 != null) {
            int i9 = read + 7;
            MediaMetadataCompat = i9 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i10 = i9 % 2;
            drawerLayout.serializer(view2);
        }
    }

    @Override // o.FocusTargetNodeKt
    public final void read(int i, int i2) {
        View view;
        int i3 = 2 % 2;
        DrawerLayout drawerLayout = this.serializer;
        if ((i & 1) == 1) {
            int i4 = MediaMetadataCompat + 27;
            read = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            view = drawerLayout.read(i4 % 2 != 0 ? 4 : 3);
        } else {
            view = drawerLayout.read(5);
        }
        if (view == null || drawerLayout.read(view) != 0) {
            return;
        }
        this.write.write(i2, view);
        int i5 = MediaMetadataCompat + 57;
        read = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i6 = i5 % 2;
    }

    private static /* synthetic */ Object write(Object[] objArr) {
        intersect intersectVar = (intersect) objArr[0];
        int iIntValue = ((Number) objArr[1]).intValue();
        View view = (View) objArr[2];
        int i = 2 % 2;
        DrawerLayout drawerLayout = intersectVar.serializer;
        if (!drawerLayout.serializer(3, view)) {
            int width = drawerLayout.getWidth();
            return Integer.valueOf(Math.max(width - view.getWidth(), Math.min(iIntValue, width)));
        }
        int i2 = MediaMetadataCompat + 43;
        read = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        int iMax = Math.max(-view.getWidth(), Math.min(iIntValue, 0));
        int i4 = read + 25;
        MediaMetadataCompat = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return Integer.valueOf(iMax);
    }

    @Override // o.FocusTargetNodeKt
    public final void write(int i, int i2, View view) {
        float width;
        int i3;
        int i4 = 2 % 2;
        int width2 = view.getWidth();
        DrawerLayout drawerLayout = this.serializer;
        if (drawerLayout.serializer(3, view)) {
            int i5 = MediaMetadataCompat + 113;
            read = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i6 = i5 % 2;
            width = i + width2;
        } else {
            width = drawerLayout.getWidth() - i;
        }
        float f = width / width2;
        drawerLayout.setDrawerViewOffset(view, f);
        if (f == 0.0f) {
            int i7 = MediaMetadataCompat + 43;
            int i8 = i7 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            read = i8;
            i3 = i7 % 2 != 0 ? 2 : 4;
            int i9 = i8 + 3;
            MediaMetadataCompat = i9 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i10 = i9 % 2;
        } else {
            i3 = 0;
        }
        view.setVisibility(i3);
        drawerLayout.invalidate();
    }

    /* JADX WARN: Code duplicated, block: B:22:0x0058  */
    @Override // o.FocusTargetNodeKt
    public final void IconCompatParcelizer(View view, float f, float f2) {
        int i;
        int i2 = 2 % 2;
        int[] iArr = DrawerLayout.RemoteActionCompatParcelizer;
        float f3 = ((isEmpty) view.getLayoutParams()).read;
        int width = view.getWidth();
        DrawerLayout drawerLayout = this.serializer;
        if (!drawerLayout.serializer(3, view)) {
            int width2 = drawerLayout.getWidth();
            if (f < 0.0f) {
                width2 -= width;
            } else if (f == 0.0f) {
                int i3 = MediaMetadataCompat + 103;
                read = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                int i4 = i3 % 2;
                if (f3 > 0.5f) {
                    width2 -= width;
                }
            }
            i = width2;
        } else if (f <= 0.0f) {
            int i5 = read;
            int i6 = i5 + 113;
            MediaMetadataCompat = i6 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            if (i6 % 2 == 0) {
                throw null;
            }
            if (f != 0.0f || f3 <= 0.5f) {
                i = -width;
            } else {
                int i7 = i5 + 3;
                MediaMetadataCompat = i7 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                int i8 = i7 % 2;
                i = 0;
            }
        } else {
            i = 0;
        }
        this.write.RemoteActionCompatParcelizer(i, view.getTop());
        drawerLayout.invalidate();
        int i9 = read + 79;
        MediaMetadataCompat = i9 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i10 = i9 % 2;
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0028  */
    /* JADX WARN: Code duplicated, block: B:20:0x0040  */
    /* JADX WARN: Code duplicated, block: B:22:0x004f  */
    /* JADX WARN: Code duplicated, block: B:24:0x005a  */
    /* JADX WARN: Code duplicated, block: B:26:0x0060  */
    /* JADX WARN: Code duplicated, block: B:29:0x0068 A[LOOP:0: B:27:0x0064->B:29:0x0068, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:35:0x009a  */
    /* JADX WARN: Code duplicated, block: B:37:0x00a0  */
    /* JADX WARN: Code duplicated, block: B:39:0x00ab  */
    /* JADX WARN: Code duplicated, block: B:40:0x00b4  */
    /* JADX WARN: Code duplicated, block: B:44:0x00c5  */
    /* JADX WARN: Code duplicated, block: B:46:0x00d0  */
    /* JADX WARN: Code duplicated, block: B:47:0x00d7  */
    /* JADX WARN: Code duplicated, block: B:49:0x00df A[LOOP:1: B:48:0x00dd->B:49:0x00df, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:52:0x011a  */
    /* JADX WARN: Code duplicated, block: B:63:0x014a  */
    /* JADX WARN: Code duplicated, block: B:65:0x0163  */
    /* JADX WARN: Code duplicated, block: B:67:0x0169  */
    /* JADX WARN: Code duplicated, block: B:69:0x0174  */
    /* JADX WARN: Code duplicated, block: B:70:0x017b  */
    /* JADX WARN: Code duplicated, block: B:71:0x0180  */
    /* JADX WARN: Code duplicated, block: B:74:0x0184  */
    /* JADX WARN: Code duplicated, block: B:75:0x018b  */
    /* JADX WARN: Code duplicated, block: B:76:0x018d  */
    /* JADX WARN: Code duplicated, block: B:82:0x01a7  */
    /* JADX WARN: Code duplicated, block: B:86:0x0083 A[EDGE_INSN: B:86:0x0083->B:30:0x0083 BREAK  A[LOOP:0: B:27:0x0064->B:29:0x0068], SYNTHETIC] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:61:0x0146 -> B:62:0x0148). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // o.FocusTargetNodeKt
    public final void read(int r13) {
        /*
            Method dump skipped, instruction units count: 430
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: o.intersect.read(int):void");
    }

    @Override // o.FocusTargetNodeKt
    public final void IconCompatParcelizer() {
        int iWrite = RouterWrapper$$ExternalSyntheticLambda2.write();
        int iWrite2 = RouterWrapper$$ExternalSyntheticLambda2.write();
        int iWrite3 = RouterWrapper$$ExternalSyntheticLambda2.write();
        IconCompatParcelizer(RouterWrapper$$ExternalSyntheticLambda2.write(), -713629748, iWrite3, new Object[]{this}, 713629749, iWrite2, iWrite);
    }

    @Override // o.FocusTargetNodeKt
    public final int serializer(int i, View view) {
        Object[] objArr = {this, Integer.valueOf(i), view};
        int iWrite = RouterWrapper$$ExternalSyntheticLambda2.write();
        int iWrite2 = RouterWrapper$$ExternalSyntheticLambda2.write();
        return ((Integer) IconCompatParcelizer(RouterWrapper$$ExternalSyntheticLambda2.write(), 1131168831, RouterWrapper$$ExternalSyntheticLambda2.write(), objArr, -1131168831, iWrite2, iWrite)).intValue();
    }
}
