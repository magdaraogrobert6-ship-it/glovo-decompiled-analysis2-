package o;

/* JADX INFO: loaded from: classes4.dex */
public final class r8lambdaebQ2lC4_6T3aRP5XX7b_s4jaGII {
    public final setLargerCloseButtonClickArea IconCompatParcelizer;
    public final setLargerCloseButtonClickArea serializer;
    public final Throwable write;

    public final int hashCode() {
        int iHashCode = this.serializer.hashCode();
        setLargerCloseButtonClickArea setlargerclosebuttonclickarea = this.IconCompatParcelizer;
        int iHashCode2 = setlargerclosebuttonclickarea == null ? 0 : setlargerclosebuttonclickarea.hashCode();
        Throwable th = this.write;
        return (((iHashCode * 31) + iHashCode2) * 31) + (th != null ? th.hashCode() : 0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r8lambdaebQ2lC4_6T3aRP5XX7b_s4jaGII)) {
            return false;
        }
        r8lambdaebQ2lC4_6T3aRP5XX7b_s4jaGII r8lambdaebq2lc4_6t3arp5xx7b_s4jagii = (r8lambdaebQ2lC4_6T3aRP5XX7b_s4jaGII) obj;
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.serializer, r8lambdaebq2lc4_6t3arp5xx7b_s4jagii.serializer}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.IconCompatParcelizer, r8lambdaebq2lc4_6t3arp5xx7b_s4jagii.IconCompatParcelizer}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        return ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.write, r8lambdaebq2lc4_6t3arp5xx7b_s4jagii.write}, getCieXyz.write())).booleanValue();
    }

    public final String toString() {
        return "ConnectResult(plan=" + this.serializer + ", nextPlan=" + this.IconCompatParcelizer + ", throwable=" + this.write + ')';
    }

    public /* synthetic */ r8lambdaebQ2lC4_6T3aRP5XX7b_s4jaGII(setLargerCloseButtonClickArea setlargerclosebuttonclickarea, InAppMessageHtmlBaseViewmessageWebView6ExternalSyntheticLambda3 inAppMessageHtmlBaseViewmessageWebView6ExternalSyntheticLambda3, Throwable th, int i) {
        this(setlargerclosebuttonclickarea, (i & 2) != 0 ? null : inAppMessageHtmlBaseViewmessageWebView6ExternalSyntheticLambda3, (i & 4) != 0 ? null : th);
    }

    public r8lambdaebQ2lC4_6T3aRP5XX7b_s4jaGII(setLargerCloseButtonClickArea setlargerclosebuttonclickarea, setLargerCloseButtonClickArea setlargerclosebuttonclickarea2, Throwable th) {
        this.serializer = setlargerclosebuttonclickarea;
        this.IconCompatParcelizer = setlargerclosebuttonclickarea2;
        this.write = th;
    }
}
