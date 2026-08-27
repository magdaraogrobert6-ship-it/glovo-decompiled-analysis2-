package o;

import com.foodora.courier.main.presentation.MainActivity;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class accessgetXcp implements Runnable {
    private static int read = 0;
    private static int write = 1;
    public final /* synthetic */ MainActivity IconCompatParcelizer;
    public final /* synthetic */ int RemoteActionCompatParcelizer;

    public /* synthetic */ accessgetXcp(MainActivity mainActivity, int i) {
        this.RemoteActionCompatParcelizer = i;
        this.IconCompatParcelizer = mainActivity;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0022, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0023, code lost:
    
        com.foodora.courier.main.presentation.MainActivity.write(r2);
        r1 = o.accessgetXcp.write + 117;
        o.accessgetXcp.read = r1 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x002f, code lost:
    
        if ((r1 % 2) != 0) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0031, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0033, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0016, code lost:
    
        if (r1 != 0) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x001d, code lost:
    
        if (r1 != 0) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x001f, code lost:
    
        com.foodora.courier.main.presentation.MainActivity.RemoteActionCompatParcelizer(r2);
     */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void run() {
        /*
            r4 = this;
            r0 = 2
            int r1 = r0 % r0
            int r1 = o.accessgetXcp.write
            int r1 = r1 + 37
            int r2 = r1 % 128
            o.accessgetXcp.read = r2
            int r1 = r1 % r0
            if (r1 == 0) goto L19
            int r1 = r4.RemoteActionCompatParcelizer
            com.foodora.courier.main.presentation.MainActivity r2 = r4.IconCompatParcelizer
            r3 = 49
            int r3 = r3 / 0
            if (r1 == 0) goto L23
            goto L1f
        L19:
            int r1 = r4.RemoteActionCompatParcelizer
            com.foodora.courier.main.presentation.MainActivity r2 = r4.IconCompatParcelizer
            if (r1 == 0) goto L23
        L1f:
            com.foodora.courier.main.presentation.MainActivity.RemoteActionCompatParcelizer(r2)
            return
        L23:
            com.foodora.courier.main.presentation.MainActivity.write(r2)
            int r1 = o.accessgetXcp.write
            int r1 = r1 + 117
            int r2 = r1 % 128
            o.accessgetXcp.read = r2
            int r1 = r1 % r0
            if (r1 != 0) goto L32
            return
        L32:
            r0 = 0
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: o.accessgetXcp.run():void");
    }
}
