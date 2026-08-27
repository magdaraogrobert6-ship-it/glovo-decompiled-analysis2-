package o;

import com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite;

/* JADX INFO: loaded from: classes2.dex */
public final class isVirtualLookaheadRootui extends getDummyViewConfigurationui {
    public final /* synthetic */ int write;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public isVirtualLookaheadRootui(int i) {
        super(getOnAttachui.DEFAULT_INSTANCE);
        this.write = i;
        if (i == 2) {
            super(removeAtui.DEFAULT_INSTANCE);
            return;
        }
        if (i == 3) {
            super(requestLookaheadRelayoutui.DEFAULT_INSTANCE);
            return;
        }
        if (i == 4) {
            super(rethrowWithComposeStackTrace.DEFAULT_INSTANCE);
        } else if (i != 5) {
        } else {
            super(setDepthui.DEFAULT_INSTANCE);
        }
    }

    public final /* synthetic */ Object clone() {
        int i = this.write;
        if (i == 0) {
            return RatingCompat();
        }
        if (i == 1) {
            return RatingCompat();
        }
        if (i == 2) {
            return RatingCompat();
        }
        if (i != 3) {
            return i != 4 ? RatingCompat() : RatingCompat();
        }
        return RatingCompat();
    }

    @Override // o.accessnextDrawNode
    public final GeneratedMessageLite r_() {
        int i = this.write;
        if (i == 0) {
            return this.RemoteActionCompatParcelizer;
        }
        if (i == 1) {
            return this.RemoteActionCompatParcelizer;
        }
        if (i == 2) {
            return this.RemoteActionCompatParcelizer;
        }
        if (i != 3) {
            return i != 4 ? this.RemoteActionCompatParcelizer : this.RemoteActionCompatParcelizer;
        }
        return this.RemoteActionCompatParcelizer;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ isVirtualLookaheadRootui(GeneratedMessageLite generatedMessageLite) {
        super(generatedMessageLite);
        this.write = 0;
    }
}
