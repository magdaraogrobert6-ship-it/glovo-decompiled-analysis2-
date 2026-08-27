package o;

import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.LinkedBlockingDeque;

/* JADX INFO: loaded from: classes4.dex */
public final class getInAppRadii extends onCreateWindowlambda1 {
    public final /* synthetic */ setLargerCloseButtonClickArea IconCompatParcelizer;
    public final /* synthetic */ localLookaheadPositionOfauaQtc serializer;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public getInAppRadii(String str, setLargerCloseButtonClickArea setlargerclosebuttonclickarea, localLookaheadPositionOfauaQtc locallookaheadpositionofauaqtc) {
        super(str, true);
        this.IconCompatParcelizer = setlargerclosebuttonclickarea;
        this.serializer = locallookaheadpositionofauaqtc;
    }

    @Override // o.onCreateWindowlambda1
    public final long read() throws InterruptedException {
        r8lambdaebQ2lC4_6T3aRP5XX7b_s4jaGII r8lambdaebq2lc4_6t3arp5xx7b_s4jagii;
        setLargerCloseButtonClickArea setlargerclosebuttonclickarea = this.IconCompatParcelizer;
        try {
            r8lambdaebq2lc4_6t3arp5xx7b_s4jagii = setlargerclosebuttonclickarea.IconCompatParcelizer();
        } catch (Throwable th) {
            r8lambdaebq2lc4_6t3arp5xx7b_s4jagii = new r8lambdaebQ2lC4_6T3aRP5XX7b_s4jaGII(setlargerclosebuttonclickarea, null, th, 2);
        }
        localLookaheadPositionOfauaQtc locallookaheadpositionofauaqtc = this.serializer;
        if (!((CopyOnWriteArrayList) locallookaheadpositionofauaqtc.write).contains(setlargerclosebuttonclickarea)) {
            return -1L;
        }
        ((LinkedBlockingDeque) locallookaheadpositionofauaqtc.IconCompatParcelizer).put(r8lambdaebq2lc4_6t3arp5xx7b_s4jagii);
        return -1L;
    }
}
