package o;

import android.app.Application;
import android.app.KeyguardManager;
import com.roadrunner.delivery.accept.payatpickup.implementation.domain.StoreSelectedPaymentOption;
import com.roadrunner.delivery.accept.repository.AutoAcceptRequestStateRepositoryImpl;
import com.roadrunner.delivery.repository.CachedDeliveryRepository;
import com.roadrunner.diagnostics.domain.SendTestPushUseCase;

/* JADX INFO: loaded from: classes3.dex */
public final class FontVariationSettingInt implements getColorIntegerOrNulllambda0 {
    private static int RemoteActionCompatParcelizer = 1;
    private static int serializer;
    public final /* synthetic */ int IconCompatParcelizer;
    public final r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ write;

    public FontVariationSettingInt(r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ r8lambdaktwlyipskq3tfa9ey3gatonixfq, int i) {
        this.IconCompatParcelizer = i;
        r8lambdaktwlyipskq3tfa9ey3gatonixfq.getClass();
        switch (i) {
            case 2:
                this.write = r8lambdaktwlyipskq3tfa9ey3gatonixfq;
                break;
            case 3:
            case 4:
            case 7:
            case 12:
            case 13:
            case 19:
            case 26:
            default:
                this.write = r8lambdaktwlyipskq3tfa9ey3gatonixfq;
                break;
            case 5:
                this.write = r8lambdaktwlyipskq3tfa9ey3gatonixfq;
                break;
            case 6:
                this.write = r8lambdaktwlyipskq3tfa9ey3gatonixfq;
                break;
            case 8:
                this.write = r8lambdaktwlyipskq3tfa9ey3gatonixfq;
                break;
            case 9:
                this.write = r8lambdaktwlyipskq3tfa9ey3gatonixfq;
                break;
            case 10:
                this.write = r8lambdaktwlyipskq3tfa9ey3gatonixfq;
                break;
            case 11:
                this.write = r8lambdaktwlyipskq3tfa9ey3gatonixfq;
                break;
            case 14:
                this.write = r8lambdaktwlyipskq3tfa9ey3gatonixfq;
                break;
            case 15:
                this.write = r8lambdaktwlyipskq3tfa9ey3gatonixfq;
                break;
            case 16:
                this.write = r8lambdaktwlyipskq3tfa9ey3gatonixfq;
                break;
            case 17:
                this.write = r8lambdaktwlyipskq3tfa9ey3gatonixfq;
                break;
            case 18:
                this.write = r8lambdaktwlyipskq3tfa9ey3gatonixfq;
                break;
            case 20:
                this.write = r8lambdaktwlyipskq3tfa9ey3gatonixfq;
                break;
            case 21:
                this.write = r8lambdaktwlyipskq3tfa9ey3gatonixfq;
                break;
            case 22:
                this.write = r8lambdaktwlyipskq3tfa9ey3gatonixfq;
                break;
            case 23:
                this.write = r8lambdaktwlyipskq3tfa9ey3gatonixfq;
                break;
            case 24:
                this.write = r8lambdaktwlyipskq3tfa9ey3gatonixfq;
                break;
            case 25:
                this.write = r8lambdaktwlyipskq3tfa9ey3gatonixfq;
                break;
            case 27:
                this.write = r8lambdaktwlyipskq3tfa9ey3gatonixfq;
                break;
        }
    }

    public FontVariationSettingInt(FontVariationSettingInt fontVariationSettingInt) {
        this.IconCompatParcelizer = 0;
        fontVariationSettingInt.getClass();
        this.write = fontVariationSettingInt;
    }

    public FontVariationSettingInt(FontVariationSettingInt fontVariationSettingInt, byte b) {
        this.IconCompatParcelizer = 29;
        fontVariationSettingInt.getClass();
        this.write = fontVariationSettingInt;
    }

    public FontVariationSettingInt(SingleProcessDataStore singleProcessDataStore, int i) {
        this.IconCompatParcelizer = i;
        singleProcessDataStore.getClass();
        if (i == 4) {
            this.write = singleProcessDataStore;
        } else if (i != 19) {
            this.write = singleProcessDataStore;
        } else {
            this.write = singleProcessDataStore;
        }
    }

    public FontVariationSettingInt(accessgetTextBottomcp accessgettextbottomcp) {
        this.IconCompatParcelizer = 26;
        accessgettextbottomcp.getClass();
        this.write = accessgettextbottomcp;
    }

    public FontVariationSettingInt(isMainThread ismainthread, hasNestedScrollingParent hasnestedscrollingparent) {
        this.IconCompatParcelizer = 7;
        hasnestedscrollingparent.getClass();
        this.write = hasnestedscrollingparent;
    }

    public FontVariationSettingInt(hasNestedScrollingParent hasnestedscrollingparent, int i) {
        this.IconCompatParcelizer = i;
        hasnestedscrollingparent.getClass();
        if (i == 13) {
            this.write = hasnestedscrollingparent;
        } else if (i != 28) {
            this.write = hasnestedscrollingparent;
        } else {
            this.write = hasnestedscrollingparent;
        }
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0028 A[PHI: r4
  0x0028: PHI (r4v30 o.r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ) = (r4v0 o.r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ), (r4v31 o.r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ) binds: [B:8:0x0023, B:5:0x0018] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:12:0x0037 A[PHI: r4
  0x0037: PHI (r4v29 o.r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ) = (r4v0 o.r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ), (r4v31 o.r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ) binds: [B:8:0x0023, B:5:0x0018] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:14:0x0046 A[PHI: r4
  0x0046: PHI (r4v28 o.r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ) = (r4v0 o.r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ), (r4v31 o.r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ) binds: [B:8:0x0023, B:5:0x0018] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:16:0x0055 A[PHI: r4
  0x0055: PHI (r4v27 o.r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ) = (r4v0 o.r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ), (r4v31 o.r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ) binds: [B:8:0x0023, B:5:0x0018] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:18:0x0069 A[PHI: r4
  0x0069: PHI (r4v26 o.r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ) = (r4v0 o.r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ), (r4v31 o.r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ) binds: [B:8:0x0023, B:5:0x0018] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:20:0x007d A[PHI: r4
  0x007d: PHI (r4v25 o.r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ) = (r4v0 o.r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ), (r4v31 o.r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ) binds: [B:8:0x0023, B:5:0x0018] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:22:0x008c A[PHI: r4
  0x008c: PHI (r4v24 o.r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ) = (r4v0 o.r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ), (r4v31 o.r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ) binds: [B:8:0x0023, B:5:0x0018] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:24:0x009b A[PHI: r4
  0x009b: PHI (r4v23 o.r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ) = (r4v0 o.r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ), (r4v31 o.r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ) binds: [B:8:0x0023, B:5:0x0018] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:26:0x00aa A[PHI: r4
  0x00aa: PHI (r4v22 o.r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ) = (r4v0 o.r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ), (r4v31 o.r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ) binds: [B:8:0x0023, B:5:0x0018] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:28:0x00b9 A[PHI: r4
  0x00b9: PHI (r4v21 o.r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ) = (r4v0 o.r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ), (r4v31 o.r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ) binds: [B:8:0x0023, B:5:0x0018] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:30:0x00c8 A[PHI: r4
  0x00c8: PHI (r4v20 o.r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ) = (r4v0 o.r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ), (r4v31 o.r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ) binds: [B:8:0x0023, B:5:0x0018] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:32:0x00d7 A[PHI: r4
  0x00d7: PHI (r4v19 o.r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ) = (r4v0 o.r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ), (r4v31 o.r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ) binds: [B:8:0x0023, B:5:0x0018] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:34:0x00e6 A[PHI: r4
  0x00e6: PHI (r4v18 o.r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ) = (r4v0 o.r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ), (r4v31 o.r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ) binds: [B:8:0x0023, B:5:0x0018] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:36:0x00f5 A[PHI: r4
  0x00f5: PHI (r4v17 o.r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ) = (r4v0 o.r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ), (r4v31 o.r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ) binds: [B:8:0x0023, B:5:0x0018] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:38:0x0104 A[PHI: r4
  0x0104: PHI (r4v16 o.r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ) = (r4v0 o.r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ), (r4v31 o.r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ) binds: [B:8:0x0023, B:5:0x0018] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:40:0x0113 A[PHI: r4
  0x0113: PHI (r4v15 o.r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ) = (r4v0 o.r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ), (r4v31 o.r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ) binds: [B:8:0x0023, B:5:0x0018] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:42:0x0121 A[PHI: r4
  0x0121: PHI (r4v14 o.r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ) = (r4v0 o.r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ), (r4v31 o.r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ) binds: [B:8:0x0023, B:5:0x0018] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:44:0x012f A[PHI: r4
  0x012f: PHI (r4v13 o.r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ) = (r4v0 o.r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ), (r4v31 o.r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ) binds: [B:8:0x0023, B:5:0x0018] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:46:0x013e A[PHI: r4
  0x013e: PHI (r4v12 o.r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ) = (r4v0 o.r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ), (r4v31 o.r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ) binds: [B:8:0x0023, B:5:0x0018] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:48:0x014d A[PHI: r4
  0x014d: PHI (r4v11 o.r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ) = (r4v0 o.r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ), (r4v31 o.r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ) binds: [B:8:0x0023, B:5:0x0018] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:50:0x015c A[PHI: r4
  0x015c: PHI (r4v10 o.r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ) = (r4v0 o.r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ), (r4v31 o.r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ) binds: [B:8:0x0023, B:5:0x0018] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:52:0x016b A[PHI: r4
  0x016b: PHI (r4v9 o.r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ) = (r4v0 o.r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ), (r4v31 o.r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ) binds: [B:8:0x0023, B:5:0x0018] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:54:0x0180 A[PHI: r4
  0x0180: PHI (r4v8 o.r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ) = (r4v0 o.r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ), (r4v31 o.r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ) binds: [B:8:0x0023, B:5:0x0018] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:56:0x018f A[PHI: r4
  0x018f: PHI (r4v7 o.r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ) = (r4v0 o.r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ), (r4v31 o.r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ) binds: [B:8:0x0023, B:5:0x0018] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:58:0x01a6 A[PHI: r4
  0x01a6: PHI (r4v6 o.r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ) = (r4v0 o.r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ), (r4v31 o.r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ) binds: [B:8:0x0023, B:5:0x0018] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:60:0x01bf A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:61:0x01c0  */
    /* JADX WARN: Code duplicated, block: B:63:0x01c2 A[PHI: r4
  0x01c2: PHI (r4v5 o.r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ) = (r4v0 o.r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ), (r4v31 o.r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ) binds: [B:8:0x0023, B:5:0x0018] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:65:0x01d1 A[PHI: r3 r4
  0x01d1: PHI (r3v2 o.isOnLetterOrDigitOrEmoji) = (r3v0 o.isOnLetterOrDigitOrEmoji), (r3v4 o.isOnLetterOrDigitOrEmoji) binds: [B:8:0x0023, B:5:0x0018] A[DONT_GENERATE, DONT_INLINE]
  0x01d1: PHI (r4v4 o.r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ) = (r4v0 o.r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ), (r4v31 o.r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ) binds: [B:8:0x0023, B:5:0x0018] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:67:0x01e6 A[PHI: r3 r4
  0x01e6: PHI (r3v1 o.isOnLetterOrDigitOrEmoji) = (r3v0 o.isOnLetterOrDigitOrEmoji), (r3v4 o.isOnLetterOrDigitOrEmoji) binds: [B:8:0x0023, B:5:0x0018] A[DONT_GENERATE, DONT_INLINE]
  0x01e6: PHI (r4v3 o.r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ) = (r4v0 o.r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ), (r4v31 o.r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ) binds: [B:8:0x0023, B:5:0x0018] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:69:0x01fb A[PHI: r4
  0x01fb: PHI (r4v2 o.r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ) = (r4v0 o.r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ), (r4v31 o.r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ) binds: [B:8:0x0023, B:5:0x0018] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:71:0x020a A[PHI: r4
  0x020a: PHI (r4v1 o.r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ) = (r4v0 o.r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ), (r4v31 o.r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ) binds: [B:8:0x0023, B:5:0x0018] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // o.r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ
    public final Object write() {
        isOnLetterOrDigitOrEmoji isonletterordigitoremoji;
        r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ r8lambdaktwlyipskq3tfa9ey3gatonixfq;
        updateMeasureState updatemeasurestate;
        int i;
        int i2 = 2 % 2;
        int i3 = serializer + 121;
        RemoteActionCompatParcelizer = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        boolean z = false;
        if (i3 % 2 != 0) {
            int i4 = this.IconCompatParcelizer;
            isonletterordigitoremoji = isOnLetterOrDigitOrEmoji.IconCompatParcelizer;
            r8lambdaktwlyipskq3tfa9ey3gatonixfq = this.write;
            switch (i4) {
                case 0:
                    Object objWrite = r8lambdaktwlyipskq3tfa9ey3gatonixfq.write();
                    objWrite.getClass();
                    return new FontVariationSettingFloat((KeyguardManager) objWrite);
                case 1:
                    Object objWrite2 = r8lambdaktwlyipskq3tfa9ey3gatonixfq.write();
                    objWrite2.getClass();
                    return new accessgetMiddleEllipsiscp((accessrequireViewFactoryHolder) objWrite2, (isPunctuationEndBoundary) isonletterordigitoremoji.write());
                case 2:
                    Object objWrite3 = r8lambdaktwlyipskq3tfa9ey3gatonixfq.write();
                    objWrite3.getClass();
                    return new isHiraganaKatakanaBoundary((accessrequireViewFactoryHolder) objWrite3, (isPunctuationEndBoundary) isonletterordigitoremoji.write());
                case 3:
                    Object objWrite4 = r8lambdaktwlyipskq3tfa9ey3gatonixfq.write();
                    objWrite4.getClass();
                    return new WordSegmentFinder((CachedDeliveryRepository) objWrite4);
                case 4:
                    Object objWrite5 = r8lambdaktwlyipskq3tfa9ey3gatonixfq.write();
                    objWrite5.getClass();
                    updatemeasurestate = new updateMeasureState((CachedDeliveryRepository) objWrite5);
                    i = RemoteActionCompatParcelizer + 7;
                    serializer = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                    if (i % 2 == 0) {
                        return updatemeasurestate;
                    }
                    throw null;
                case 5:
                    Object objWrite6 = r8lambdaktwlyipskq3tfa9ey3gatonixfq.write();
                    objWrite6.getClass();
                    return new getEllipsizedLeftPadding((getPunctuationEnd) objWrite6, (com.huawei.wisesecurity.ucs_credential.n0) getLeadingMargin.write.write());
                case 6:
                    Object objWrite7 = r8lambdaktwlyipskq3tfa9ey3gatonixfq.write();
                    objWrite7.getClass();
                    return new getEllipsizedLeftPaddingdefault((getPunctuationEnd) objWrite7);
                case 7:
                    Object objWrite8 = r8lambdaktwlyipskq3tfa9ey3gatonixfq.write();
                    objWrite8.getClass();
                    Object systemService = ((Application) objWrite8).getSystemService("keyguard");
                    systemService.getClass();
                    return (KeyguardManager) systemService;
                case 8:
                    Object objWrite9 = r8lambdaktwlyipskq3tfa9ey3gatonixfq.write();
                    objWrite9.getClass();
                    return new getModelzQqcRY((getLastDescentDiff) objWrite9);
                case 9:
                    Object objWrite10 = r8lambdaktwlyipskq3tfa9ey3gatonixfq.write();
                    objWrite10.getClass();
                    return new PlaceholderSpan((getLastDescentDiff) objWrite10);
                case 10:
                    Object objWrite11 = r8lambdaktwlyipskq3tfa9ey3gatonixfq.write();
                    objWrite11.getClass();
                    return new StoreSelectedPaymentOption((getLastDescentDiff) objWrite11);
                case 11:
                    Object objWrite12 = r8lambdaktwlyipskq3tfa9ey3gatonixfq.write();
                    objWrite12.getClass();
                    return new AutoAcceptRequestStateRepositoryImpl((PlaceholderSpan_androidKt) objWrite12);
                case 12:
                    Object objWrite13 = r8lambdaktwlyipskq3tfa9ey3gatonixfq.write();
                    objWrite13.getClass();
                    return approachSubcompose.read((Application) objWrite13);
                case 13:
                    Object objWrite14 = r8lambdaktwlyipskq3tfa9ey3gatonixfq.write();
                    objWrite14.getClass();
                    return updateTypeface.read((Application) objWrite14);
                case 14:
                    Object objWrite15 = r8lambdaktwlyipskq3tfa9ey3gatonixfq.write();
                    objWrite15.getClass();
                    return new AndroidFont((accessrequireViewFactoryHolder) objWrite15);
                case 15:
                    Object objWrite16 = r8lambdaktwlyipskq3tfa9ey3gatonixfq.write();
                    objWrite16.getClass();
                    return new AndroidFontUtils_androidKt((TextUnitType) objWrite16);
                case 16:
                    Object objWrite17 = r8lambdaktwlyipskq3tfa9ey3gatonixfq.write();
                    objWrite17.getClass();
                    return new opticalSizingR2X_6o((setLastHorizontalStyle) objWrite17);
                case 17:
                    Object objWrite18 = r8lambdaktwlyipskq3tfa9ey3gatonixfq.write();
                    objWrite18.getClass();
                    return new getNeedsDensity((AndroidFontResolveInterceptor_androidKt) objWrite18);
                case 18:
                    Object objWrite19 = r8lambdaktwlyipskq3tfa9ey3gatonixfq.write();
                    objWrite19.getClass();
                    return new DeleteSurroundingTextInCodePointsCommand((decode) objWrite19);
                case 19:
                    Object objWrite20 = r8lambdaktwlyipskq3tfa9ey3gatonixfq.write();
                    objWrite20.getClass();
                    return new generateBatchErrorMessage((CachedDeliveryRepository) objWrite20);
                case 20:
                    Object objWrite21 = r8lambdaktwlyipskq3tfa9ey3gatonixfq.write();
                    objWrite21.getClass();
                    return new getCursorui_text((cancelCompositionui_text) objWrite21);
                case 21:
                    Object objWrite22 = r8lambdaktwlyipskq3tfa9ey3gatonixfq.write();
                    objWrite22.getClass();
                    return new GapBuffer((cancelCompositionui_text) objWrite22);
                case 22:
                    Object objWrite23 = r8lambdaktwlyipskq3tfa9ey3gatonixfq.write();
                    objWrite23.getClass();
                    return new EditingBufferKt((cancelCompositionui_text) objWrite23);
                case 23:
                    Object objWrite24 = r8lambdaktwlyipskq3tfa9ey3gatonixfq.write();
                    objWrite24.getClass();
                    return new delete((accessrequireViewFactoryHolder) objWrite24);
                case 24:
                    Object objWrite25 = r8lambdaktwlyipskq3tfa9ey3gatonixfq.write();
                    objWrite25.getClass();
                    return new toCharArray((transferSessionPackageI) objWrite25, new AndroidUiFrameClock());
                case 25:
                    Object objWrite26 = r8lambdaktwlyipskq3tfa9ey3gatonixfq.write();
                    objWrite26.getClass();
                    return new unpackInt2((transferSessionPackageI) objWrite26, new AndroidUiFrameClock());
                case 26:
                    Object objWrite27 = r8lambdaktwlyipskq3tfa9ey3gatonixfq.write();
                    objWrite27.getClass();
                    return new makeSureAvailableSpace((Nonelambda0) objWrite27);
                case 27:
                    Object objWrite28 = r8lambdaktwlyipskq3tfa9ey3gatonixfq.write();
                    objWrite28.getClass();
                    return new updateWithEmojiCompat((accessrequireViewFactoryHolder) objWrite28);
                case 28:
                    Object objWrite29 = r8lambdaktwlyipskq3tfa9ey3gatonixfq.write();
                    objWrite29.getClass();
                    return new getTrackTintList((Application) objWrite29, z);
                default:
                    Object objWrite30 = r8lambdaktwlyipskq3tfa9ey3gatonixfq.write();
                    objWrite30.getClass();
                    return new SendTestPushUseCase((updateWithEmojiCompat) objWrite30, (com.huawei.wisesecurity.ucs_credential.p0) TextInputSession.RemoteActionCompatParcelizer.write());
            }
        }
        int i5 = this.IconCompatParcelizer;
        isonletterordigitoremoji = isOnLetterOrDigitOrEmoji.IconCompatParcelizer;
        r8lambdaktwlyipskq3tfa9ey3gatonixfq = this.write;
        int i6 = 36 / 0;
        switch (i5) {
            case 0:
                Object objWrite31 = r8lambdaktwlyipskq3tfa9ey3gatonixfq.write();
                objWrite31.getClass();
                return new FontVariationSettingFloat((KeyguardManager) objWrite31);
            case 1:
                Object objWrite32 = r8lambdaktwlyipskq3tfa9ey3gatonixfq.write();
                objWrite32.getClass();
                return new accessgetMiddleEllipsiscp((accessrequireViewFactoryHolder) objWrite32, (isPunctuationEndBoundary) isonletterordigitoremoji.write());
            case 2:
                Object objWrite33 = r8lambdaktwlyipskq3tfa9ey3gatonixfq.write();
                objWrite33.getClass();
                return new isHiraganaKatakanaBoundary((accessrequireViewFactoryHolder) objWrite33, (isPunctuationEndBoundary) isonletterordigitoremoji.write());
            case 3:
                Object objWrite34 = r8lambdaktwlyipskq3tfa9ey3gatonixfq.write();
                objWrite34.getClass();
                return new WordSegmentFinder((CachedDeliveryRepository) objWrite34);
            case 4:
                Object objWrite35 = r8lambdaktwlyipskq3tfa9ey3gatonixfq.write();
                objWrite35.getClass();
                updatemeasurestate = new updateMeasureState((CachedDeliveryRepository) objWrite35);
                i = RemoteActionCompatParcelizer + 7;
                serializer = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                if (i % 2 == 0) {
                    return updatemeasurestate;
                }
                throw null;
            case 5:
                Object objWrite36 = r8lambdaktwlyipskq3tfa9ey3gatonixfq.write();
                objWrite36.getClass();
                return new getEllipsizedLeftPadding((getPunctuationEnd) objWrite36, (com.huawei.wisesecurity.ucs_credential.n0) getLeadingMargin.write.write());
            case 6:
                Object objWrite37 = r8lambdaktwlyipskq3tfa9ey3gatonixfq.write();
                objWrite37.getClass();
                return new getEllipsizedLeftPaddingdefault((getPunctuationEnd) objWrite37);
            case 7:
                Object objWrite38 = r8lambdaktwlyipskq3tfa9ey3gatonixfq.write();
                objWrite38.getClass();
                Object systemService2 = ((Application) objWrite38).getSystemService("keyguard");
                systemService2.getClass();
                return (KeyguardManager) systemService2;
            case 8:
                Object objWrite39 = r8lambdaktwlyipskq3tfa9ey3gatonixfq.write();
                objWrite39.getClass();
                return new getModelzQqcRY((getLastDescentDiff) objWrite39);
            case 9:
                Object objWrite110 = r8lambdaktwlyipskq3tfa9ey3gatonixfq.write();
                objWrite110.getClass();
                return new PlaceholderSpan((getLastDescentDiff) objWrite110);
            case 10:
                Object objWrite111 = r8lambdaktwlyipskq3tfa9ey3gatonixfq.write();
                objWrite111.getClass();
                return new StoreSelectedPaymentOption((getLastDescentDiff) objWrite111);
            case 11:
                Object objWrite112 = r8lambdaktwlyipskq3tfa9ey3gatonixfq.write();
                objWrite112.getClass();
                return new AutoAcceptRequestStateRepositoryImpl((PlaceholderSpan_androidKt) objWrite112);
            case 12:
                Object objWrite113 = r8lambdaktwlyipskq3tfa9ey3gatonixfq.write();
                objWrite113.getClass();
                return approachSubcompose.read((Application) objWrite113);
            case 13:
                Object objWrite114 = r8lambdaktwlyipskq3tfa9ey3gatonixfq.write();
                objWrite114.getClass();
                return updateTypeface.read((Application) objWrite114);
            case 14:
                Object objWrite115 = r8lambdaktwlyipskq3tfa9ey3gatonixfq.write();
                objWrite115.getClass();
                return new AndroidFont((accessrequireViewFactoryHolder) objWrite115);
            case 15:
                Object objWrite116 = r8lambdaktwlyipskq3tfa9ey3gatonixfq.write();
                objWrite116.getClass();
                return new AndroidFontUtils_androidKt((TextUnitType) objWrite116);
            case 16:
                Object objWrite117 = r8lambdaktwlyipskq3tfa9ey3gatonixfq.write();
                objWrite117.getClass();
                return new opticalSizingR2X_6o((setLastHorizontalStyle) objWrite117);
            case 17:
                Object objWrite118 = r8lambdaktwlyipskq3tfa9ey3gatonixfq.write();
                objWrite118.getClass();
                return new getNeedsDensity((AndroidFontResolveInterceptor_androidKt) objWrite118);
            case 18:
                Object objWrite119 = r8lambdaktwlyipskq3tfa9ey3gatonixfq.write();
                objWrite119.getClass();
                return new DeleteSurroundingTextInCodePointsCommand((decode) objWrite119);
            case 19:
                Object objWrite210 = r8lambdaktwlyipskq3tfa9ey3gatonixfq.write();
                objWrite210.getClass();
                return new generateBatchErrorMessage((CachedDeliveryRepository) objWrite210);
            case 20:
                Object objWrite211 = r8lambdaktwlyipskq3tfa9ey3gatonixfq.write();
                objWrite211.getClass();
                return new getCursorui_text((cancelCompositionui_text) objWrite211);
            case 21:
                Object objWrite212 = r8lambdaktwlyipskq3tfa9ey3gatonixfq.write();
                objWrite212.getClass();
                return new GapBuffer((cancelCompositionui_text) objWrite212);
            case 22:
                Object objWrite213 = r8lambdaktwlyipskq3tfa9ey3gatonixfq.write();
                objWrite213.getClass();
                return new EditingBufferKt((cancelCompositionui_text) objWrite213);
            case 23:
                Object objWrite214 = r8lambdaktwlyipskq3tfa9ey3gatonixfq.write();
                objWrite214.getClass();
                return new delete((accessrequireViewFactoryHolder) objWrite214);
            case 24:
                Object objWrite215 = r8lambdaktwlyipskq3tfa9ey3gatonixfq.write();
                objWrite215.getClass();
                return new toCharArray((transferSessionPackageI) objWrite215, new AndroidUiFrameClock());
            case 25:
                Object objWrite216 = r8lambdaktwlyipskq3tfa9ey3gatonixfq.write();
                objWrite216.getClass();
                return new unpackInt2((transferSessionPackageI) objWrite216, new AndroidUiFrameClock());
            case 26:
                Object objWrite217 = r8lambdaktwlyipskq3tfa9ey3gatonixfq.write();
                objWrite217.getClass();
                return new makeSureAvailableSpace((Nonelambda0) objWrite217);
            case 27:
                Object objWrite218 = r8lambdaktwlyipskq3tfa9ey3gatonixfq.write();
                objWrite218.getClass();
                return new updateWithEmojiCompat((accessrequireViewFactoryHolder) objWrite218);
            case 28:
                Object objWrite219 = r8lambdaktwlyipskq3tfa9ey3gatonixfq.write();
                objWrite219.getClass();
                return new getTrackTintList((Application) objWrite219, z);
            default:
                Object objWrite310 = r8lambdaktwlyipskq3tfa9ey3gatonixfq.write();
                objWrite310.getClass();
                return new SendTestPushUseCase((updateWithEmojiCompat) objWrite310, (com.huawei.wisesecurity.ucs_credential.p0) TextInputSession.RemoteActionCompatParcelizer.write());
        }
    }
}
