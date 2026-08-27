package com.incognia.internal;

import android.net.TrafficStats;
import androidx.sqlite.SQLite;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import javax.net.ssl.HttpsURLConnection;
import kotlin.jvm.internal.Lambda;
import o.onContentCardClicked;
import o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public final class nSA {
    public static final byte[] q = new byte[0];
    public final E6a A1;
    public final String BGx;
    public final r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM HQ;
    public final UsU N;
    public final lO VV3;
    public final KWh hIl;
    public final ejj hs;
    public final Lambda mbG;
    public final QY x;

    /* JADX WARN: Multi-variable type inference failed */
    public nSA(String str, r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm, r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm2, UsU usU, QY qy, KWh kWh, ejj ejjVar, lO lOVar, E6a e6a) {
        this.BGx = str;
        this.mbG = (Lambda) r8lambdaunavo3sxub_pc9xroryotnrlvsm;
        this.HQ = r8lambdaunavo3sxub_pc9xroryotnrlvsm2;
        this.N = usU;
        this.x = qy;
        this.hIl = kWh;
        this.hs = ejjVar;
        this.VV3 = lOVar;
        this.A1 = e6a;
        usU.BGx(new Q$$ExternalSyntheticLambda0(4));
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0035, code lost:
    
        if (r0 == false) goto L14;
     */
    /* JADX WARN: Type inference failed for: r6v11, types: [kotlin.jvm.internal.Lambda, o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void BGx(com.incognia.internal.nSA r16, com.incognia.internal.IrU r17, java.util.Map r18, java.lang.Object r19, boolean r20, com.incognia.internal.kz0 r21) {
        /*
            Method dump skipped, instruction units count: 529
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.incognia.internal.nSA.BGx(com.incognia.internal.nSA, com.incognia.internal.IrU, java.util.Map, java.lang.Object, boolean, com.incognia.internal.kz0):void");
    }

    public /* synthetic */ nSA(String str, r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm, tin tinVar, QY qy, KWh kWh, lO lOVar, E6a e6a, int i) {
        this(str, r8lambdaunavo3sxub_pc9xroryotnrlvsm, (i & 4) != 0 ? null : tinVar, new UsU(Al.BGx, true), qy, kWh, new ejj(), lOVar, e6a);
    }

    public final void BGx(Object obj, boolean z, Map map, kz0 kz0Var, IrU irU) {
        this.N.BGx(new eQD$$ExternalSyntheticLambda3(this, irU, map, obj, z, kz0Var));
    }

    public static final void BGx() {
        try {
            TrafficStats.setThreadStatsTag((int) Thread.currentThread().getId());
        } catch (Throwable unused) {
        }
    }

    public final byte[] BGx(byte[] bArr, HttpsURLConnection httpsURLConnection) {
        lO lOVar = this.VV3;
        List listRatingCompat = onContentCardClicked.RatingCompat(httpsURLConnection.getServerCertificates());
        byte[] byteArray = null;
        if (((JSONObject) lOVar.BGx.BGx.get()).optBoolean(lO.mbG, true)) {
            ArrayList arrayList = new ArrayList();
            for (Object obj : listRatingCompat) {
                if (obj instanceof X509Certificate) {
                    arrayList.add(obj);
                }
            }
            byte[] bArrSerializer = new byte[0];
            int size = arrayList.size();
            int i = 0;
            int i2 = 0;
            while (i < size) {
                Object obj2 = arrayList.get(i);
                i++;
                if (i2 < 0) {
                    SQLite.serializer();
                    throw null;
                }
                X509Certificate x509Certificate = (X509Certificate) obj2;
                if (i2 < 5) {
                    byte[] encoded = x509Certificate.getPublicKey().getEncoded();
                    Lql lql = new Lql();
                    lql.BGx(encoded);
                    bArrSerializer = onContentCardClicked.serializer(bArrSerializer, lql.BGx());
                }
                i2++;
            }
            byte[] bArrSerializer2 = onContentCardClicked.serializer(OKg.BGx(System.currentTimeMillis()), bArrSerializer);
            byte[] bArrBGx = yEy.BGx(0, new byte[]{101, 100, 117, 105, 48, 104, 57, 105, 110, 109, 116, 72, 77, 117, 74, 73, 102, 87, 106, 84, 121, 117, 50, 55, 85, 48, 54, 50, 69, 103, 56, 78, 108, 111, 121, 114, 90, 68, 56, 106, 71, 116, 107, 61});
            byte[] bArrBGx2 = dDH.BGx();
            byte[] bArrMbG = new zu(bArrBGx, bArrBGx2, null).mbG(bArrSerializer2);
            try {
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                byteArrayOutputStream.write(bArrBGx2);
                byteArrayOutputStream.write(bArrMbG);
                byteArray = byteArrayOutputStream.toByteArray();
                Arrays.fill(bArrBGx, (byte) 0);
                Arrays.fill(bArrBGx2, (byte) 0);
            } catch (IOException e) {
                throw new SecurityException(e);
            }
        }
        if (byteArray == null) {
            byteArray = q;
        }
        int length = byteArray.length;
        return onContentCardClicked.serializer(onContentCardClicked.serializer(new byte[]{(byte) (length >> 24), (byte) (length >> 16), (byte) (length >> 8), (byte) length}, byteArray), bArr);
    }
}
