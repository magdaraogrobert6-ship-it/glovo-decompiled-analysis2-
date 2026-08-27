package o;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.icu.text.MeasureFormat;
import android.os.Build;
import android.view.DragEvent;

/* JADX INFO: loaded from: classes.dex */
public abstract class ensureMenuView {
    private static int serializer = 1;
    private static int write;

    public static publishErrorlambda0 write() {
        int i = 2 % 2;
        MeasureFormat measureFormat = MeasureFormat.getInstance(java.util.Locale.getDefault(), MeasureFormat.FormatWidth.SHORT);
        measureFormat.getClass();
        publishErrorlambda0 publisherrorlambda0 = new publishErrorlambda0(measureFormat);
        int i2 = serializer + 13;
        write = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            return publisherrorlambda0;
        }
        throw null;
    }

    public static boolean serializer(AppCompatDialogFragment appCompatDialogFragment, DragEvent dragEvent) {
        Activity activity;
        int i = 2 % 2;
        if (Build.VERSION.SDK_INT < 31 && dragEvent.getLocalState() == null && FocusPropertiesNode.write(appCompatDialogFragment) != null) {
            Context context = appCompatDialogFragment.getContext();
            while (true) {
                if (!(context instanceof ContextWrapper)) {
                    activity = null;
                    break;
                }
                int i2 = serializer + 93;
                write = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                int i3 = i2 % 2;
                if (context instanceof Activity) {
                    activity = (Activity) context;
                    break;
                }
                context = ((ContextWrapper) context).getBaseContext();
            }
            boolean z = true;
            if (activity == null) {
                int i4 = serializer + 13;
                write = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                if (i4 % 2 != 0) {
                    appCompatDialogFragment.toString();
                } else {
                    appCompatDialogFragment.toString();
                    z = false;
                }
                int i5 = write + 43;
                serializer = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                if (i5 % 2 == 0) {
                    int i6 = 57 / 0;
                }
                return z;
            }
            if (dragEvent.getAction() == 1) {
                int i7 = serializer + 71;
                write = i7 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                int i8 = i7 % 2;
                return false;
            }
            if (dragEvent.getAction() == 3) {
                int i9 = serializer + 5;
                write = i9 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                int i10 = i9 % 2;
                return setChecked.write(dragEvent, appCompatDialogFragment, activity);
            }
        }
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0025  */
    /* JADX WARN: Code duplicated, block: B:13:0x002b  */
    /* JADX WARN: Code duplicated, block: B:15:0x0036  */
    /* JADX WARN: Code duplicated, block: B:18:0x003c  */
    /* JADX WARN: Code duplicated, block: B:22:0x004e  */
    /* JADX WARN: Code duplicated, block: B:24:0x0059  */
    /* JADX WARN: Code duplicated, block: B:25:0x005d  */
    /* JADX WARN: Code duplicated, block: B:31:0x006c  */
    /* JADX WARN: Code duplicated, block: B:32:0x0072  */
    /* JADX WARN: Code duplicated, block: B:35:0x007e  */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0039, code lost:
    
        if (r9 != 16908337) goto L38;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean RemoteActionCompatParcelizer(o.AppCompatDialogFragment r8, int r9) {
        /*
            r0 = 2
            int r1 = r0 % r0
            int r1 = android.os.Build.VERSION.SDK_INT
            r2 = 31
            r3 = 0
            if (r1 >= r2) goto L8a
            int r4 = o.ensureMenuView.serializer
            int r4 = r4 + 119
            int r5 = r4 % 128
            o.ensureMenuView.write = r5
            int r4 = r4 % r0
            if (r4 == 0) goto L1f
            java.lang.String[] r4 = o.FocusPropertiesNode.write(r8)
            r5 = 48
            int r5 = r5 / r3
            if (r4 == 0) goto L8a
            goto L25
        L1f:
            java.lang.String[] r4 = o.FocusPropertiesNode.write(r8)
            if (r4 == 0) goto L8a
        L25:
            r4 = 16908322(0x1020022, float:2.3877324E-38)
            r5 = 0
            if (r9 == r4) goto L40
            int r6 = o.ensureMenuView.serializer
            int r6 = r6 + 45
            int r7 = r6 % 128
            o.ensureMenuView.write = r7
            int r6 = r6 % r0
            if (r6 != 0) goto L3c
            r6 = 16908337(0x1020031, float:2.3877366E-38)
            if (r9 == r6) goto L40
            goto L8a
        L3c:
            r5.hashCode()
            throw r5
        L40:
            android.content.Context r6 = r8.getContext()
            java.lang.String r7 = "clipboard"
            java.lang.Object r6 = r6.getSystemService(r7)
            android.content.ClipboardManager r6 = (android.content.ClipboardManager) r6
            if (r6 != 0) goto L5d
            int r6 = o.ensureMenuView.serializer
            int r6 = r6 + 79
            int r7 = r6 % 128
            o.ensureMenuView.write = r7
            int r6 = r6 % r0
            if (r6 == 0) goto L61
            r0 = 46
            int r0 = r0 / r3
            goto L61
        L5d:
            android.content.ClipData r5 = r6.getPrimaryClip()
        L61:
            r0 = 1
            if (r5 == 0) goto L89
            int r6 = r5.getItemCount()
            if (r6 <= 0) goto L89
            if (r1 < r2) goto L72
            o.FocusProperties r1 = new o.FocusProperties
            r1.<init>(r5, r0)
            goto L7b
        L72:
            o.getExitannotations r1 = new o.getExitannotations
            r1.<init>()
            r1.serializer = r5
            r1.RatingCompat = r0
        L7b:
            if (r9 != r4) goto L7e
            goto L7f
        L7e:
            r3 = r0
        L7f:
            r1.write(r3)
            o.FocusOwnerKt r9 = r1.write()
            o.FocusPropertiesNode.write(r8, r9)
        L89:
            return r0
        L8a:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: o.ensureMenuView.RemoteActionCompatParcelizer(o.AppCompatDialogFragment, int):boolean");
    }
}
