package com.incognia.internal;

import android.security.keystore.KeyPermanentlyInvalidatedException;
import bo.app.af$$ExternalSyntheticOutline0;
import com.incognia.Incognia$$ExternalSyntheticLambda0;
import java.security.KeyStore;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import o.getCieXyz;
import o.isItemDismissable;
import o.onItemDismiss;
import o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM;
import o.removeNodeAtDepth;

/* JADX INFO: loaded from: classes2.dex */
public final class Dp implements yUe, BR {
    public final UsU BGx;
    public final V9 HQ;
    public final ByN N;
    public final HlS mbG;
    public static final String hs = (String) W4i.j.MediaSessionCompatResultReceiverWrapper();
    public static final String VV3 = (String) W4i.Zsj.MediaSessionCompatResultReceiverWrapper();
    public JyL x = VPw.BGx;
    public boolean hIl = mbG();

    @Override // com.incognia.internal.BR
    public final void A1() {
    }

    public final void BGx(r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm) {
        try {
            if (q() == null) {
                HlS.BGx(this.mbG, VV3);
            }
            Cipher.getInstance("AES/CBC/PKCS7Padding").init(1, q());
            mbG(false);
            if (r8lambdaunavo3sxub_pc9xroryotnrlvsm != null) {
                r8lambdaunavo3sxub_pc9xroryotnrlvsm.invoke(new onItemDismiss((F87) Ay.HQ.BGx(lf.BGx, hs)));
            }
        } catch (Throwable th) {
            if (!(th instanceof KeyPermanentlyInvalidatedException)) {
                if (r8lambdaunavo3sxub_pc9xroryotnrlvsm != null) {
                    af$$ExternalSyntheticOutline0.m(new isItemDismissable(th), r8lambdaunavo3sxub_pc9xroryotnrlvsm);
                    return;
                }
                return;
            }
            mbG(true);
            HlS.BGx(this.mbG, VV3);
            if (r8lambdaunavo3sxub_pc9xroryotnrlvsm != null) {
                r8lambdaunavo3sxub_pc9xroryotnrlvsm.invoke(new onItemDismiss((F87) Ay.HQ.BGx(lf.BGx, hs)));
            }
        }
    }

    @Override // com.incognia.internal.yUe
    public final JyL N() {
        return this.x;
    }

    @Override // com.incognia.internal.BR
    public final void VV3() {
        kV.BGx(this);
    }

    @Override // com.incognia.internal.BR
    public final boolean x() {
        return this.hIl;
    }

    @Override // com.incognia.internal.yUe
    public final void HQ() {
        this.x = Yp.BGx;
        if (XUh.BGx(XUh.BGx, 24, 0, 2) && this.hIl) {
            O6.BGx(this, new Q$$ExternalSyntheticLambda1(4, this));
        }
    }

    @Override // com.incognia.internal.yUe
    public final void hIl() {
        this.x = pbf.BGx;
        if (XUh.BGx(XUh.BGx, 24, 0, 2) && this.hIl && q() == null) {
            HlS.BGx(this.mbG, VV3);
        }
    }

    public final void mbG(boolean z) {
        if (z) {
            mP mPVar = Ay.HQ;
            String str = hs;
            lf lfVar = lf.BGx;
            mPVar.BGx(str, new F87(((F87) mPVar.BGx(lfVar, str)) != null ? 1 + ((F87) mPVar.BGx(lfVar, str)).BGx : 1, System.currentTimeMillis()), noQ.BGx);
            return;
        }
        mP mPVar2 = Ay.HQ;
        String str2 = hs;
        if (((F87) mPVar2.BGx(lf.BGx, str2)) == null) {
            mPVar2.BGx(str2, new F87(0, System.currentTimeMillis()), noQ.BGx);
        }
    }

    public Dp(UsU usU, HlS hlS, KWh kWh, V9 v9, ByN byN) {
        this.BGx = usU;
        this.mbG = hlS;
        this.HQ = v9;
        this.N = byN;
    }

    @Override // com.incognia.internal.BR
    public final void hs() {
        O6.BGx(this, new Incognia$$ExternalSyntheticLambda0(2, this));
    }

    public final SecretKey q() {
        try {
            KeyStore keyStore = this.mbG.BGx;
            if (keyStore != null) {
                keyStore.load(null);
            }
        } catch (Throwable unused) {
        }
        HlS hlS = this.mbG;
        String str = VV3;
        try {
            KeyStore keyStore2 = hlS.BGx;
            return (SecretKey) (keyStore2 != null ? keyStore2.getKey(str, null) : null);
        } catch (Throwable unused2) {
            return null;
        }
    }

    @Override // com.incognia.internal.BR
    public final boolean mbG() {
        Object[] objArr = {this.N.BGx(), qf.BGx};
        if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), objArr, getCieXyz.write())).booleanValue()) {
            return false;
        }
        return this.HQ.mbG(hs);
    }

    public static final void mbG(Dp dp) {
        dp.BGx((r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) null);
    }

    @Override // com.incognia.internal.yUe
    public final UsU BGx() {
        return this.BGx;
    }

    @Override // com.incognia.internal.BR
    public final void BGx(boolean z) {
        this.hIl = z;
    }

    @Override // com.incognia.internal.yUe
    public final void BGx(vN8 vn8) {
        this.x = c39.BGx;
        vn8.invoke();
    }

    public static final void BGx(Dp dp) {
        if (XUh.BGx(XUh.BGx, 24, 0, 2)) {
            dp.BGx((r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) null);
        }
    }

    public final void BGx(Nrf nrf) {
        if (XUh.BGx(XUh.BGx, 24, 0, 2)) {
            if (O6.BGx(this, new Dd$$ExternalSyntheticLambda0(this, 2, nrf))) {
                return;
            }
            nrf.BGx(new isItemDismissable(new vqX(hs)));
            return;
        }
        nrf.BGx(null);
    }

    public static final void BGx(Dp dp, r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm) {
        dp.BGx(r8lambdaunavo3sxub_pc9xroryotnrlvsm);
    }

    @Override // com.incognia.internal.MtT
    public final void BGx(NvL nvL) {
        kV.mbG(this);
    }
}
