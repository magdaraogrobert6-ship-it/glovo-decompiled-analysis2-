package o;

import com.google.android.material.bottomsheet.BottomSheetBehavior;

/* JADX INFO: loaded from: classes.dex */
public final class fullyDrawnReporter_delegatelambda00 extends androidx.activity.OnBackPressedCallback {
    private static int serializer = 0;
    private static int write = 1;
    public final /* synthetic */ Object IconCompatParcelizer;
    public final /* synthetic */ int read;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fullyDrawnReporter_delegatelambda00(r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm) {
        super(true);
        this.read = 0;
        this.IconCompatParcelizer = r8lambdaunavo3sxub_pc9xroryotnrlvsm;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ fullyDrawnReporter_delegatelambda00(int i, Object obj) {
        super(false);
        this.read = i;
        this.IconCompatParcelizer = obj;
    }

    @Override // androidx.activity.OnBackPressedCallback
    public void handleOnBackCancelled() {
        int i = 2 % 2;
        int i2 = serializer + 63;
        write = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        if (this.read != 1) {
            super.handleOnBackCancelled();
            return;
        }
        ((getDefaultViewModelProviderFactory) this.IconCompatParcelizer).write();
        int i4 = serializer + 29;
        write = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0028, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0029, code lost:
    
        ((o.getDefaultViewModelProviderFactory) r4.IconCompatParcelizer).serializer(r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0030, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0015, code lost:
    
        if (r4.read != 1) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x001a, code lost:
    
        if (r4.read != 1) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x001c, code lost:
    
        super.handleOnBackProgressed(r5);
        r5 = o.fullyDrawnReporter_delegatelambda00.write + 13;
        o.fullyDrawnReporter_delegatelambda00.serializer = r5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        r5 = r5 % 2;
     */
    @Override // androidx.activity.OnBackPressedCallback
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void handleOnBackProgressed(o.r8lambda54BeH8ZsBru0CXI2CCSP2syNys r5) {
        /*
            r4 = this;
            r0 = 2
            int r1 = r0 % r0
            int r1 = o.fullyDrawnReporter_delegatelambda00.write
            int r1 = r1 + 85
            int r2 = r1 % 128
            o.fullyDrawnReporter_delegatelambda00.serializer = r2
            int r1 = r1 % r0
            r2 = 1
            if (r1 == 0) goto L18
            int r1 = r4.read
            r3 = 32
            int r3 = r3 / 0
            if (r1 == r2) goto L29
            goto L1c
        L18:
            int r1 = r4.read
            if (r1 == r2) goto L29
        L1c:
            super.handleOnBackProgressed(r5)
            int r5 = o.fullyDrawnReporter_delegatelambda00.write
            int r5 = r5 + 13
            int r1 = r5 % 128
            o.fullyDrawnReporter_delegatelambda00.serializer = r1
            int r5 = r5 % r0
            return
        L29:
            java.lang.Object r0 = r4.IconCompatParcelizer
            o.getDefaultViewModelProviderFactory r0 = (o.getDefaultViewModelProviderFactory) r0
            r0.serializer(r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: o.fullyDrawnReporter_delegatelambda00.handleOnBackProgressed(o.r8lambda54BeH8ZsBru0CXI2CCSP2syNys):void");
    }

    @Override // androidx.activity.OnBackPressedCallback
    public void handleOnBackStarted(r8lambda54BeH8ZsBru0CXI2CCSP2syNys r8lambda54beh8zsbru0cxi2ccsp2synys) {
        int i = 2 % 2;
        int i2 = write + 65;
        serializer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        if (this.read == 1) {
            ((getDefaultViewModelProviderFactory) this.IconCompatParcelizer).RemoteActionCompatParcelizer();
            return;
        }
        super.handleOnBackStarted(r8lambda54beh8zsbru0cxi2ccsp2synys);
        int i4 = serializer + 97;
        write = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 == 0) {
            int i5 = 65 / 0;
        }
    }

    @Override // androidx.activity.OnBackPressedCallback
    public final void handleOnBackPressed() {
        int i = 2 % 2;
        int i2 = serializer + 15;
        write = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        int i4 = this.read;
        Object obj = this.IconCompatParcelizer;
        if (i4 == 0) {
            ((r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) obj).invoke(this);
            return;
        }
        if (i4 == 1) {
            ((getDefaultViewModelProviderFactory) obj).read();
            return;
        }
        BottomSheetBehavior bottomSheetBehavior = ((onDestroyOptionsMenu) obj).write;
        int state = bottomSheetBehavior.getState();
        if (state == 3) {
            bottomSheetBehavior.setState(6);
            return;
        }
        int i5 = write + 101;
        serializer = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i5 % 2 != 0) {
            if (state != 27) {
                return;
            }
        } else if (state != 6) {
            return;
        }
        bottomSheetBehavior.setState(4);
    }
}
