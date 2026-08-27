package com.incognia.internal;

import com.huawei.location.gwi.config.CarGwiSoFileConstant;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import o.SimpleItemTouchHelperCallback;
import o.onMove;
import o.onViewAttachedToWindowlambda0;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public final class V9 {
    public static final Map HQ;
    public static final String mbG = (String) W4i.ny.MediaSessionCompatResultReceiverWrapper();
    public final NvL BGx;

    static {
        onViewAttachedToWindowlambda0 onviewattachedtowindowlambda0 = new onViewAttachedToWindowlambda0((String) W4i.BGx.MediaSessionCompatResultReceiverWrapper(), jH.BGx(false));
        onViewAttachedToWindowlambda0 onviewattachedtowindowlambda1 = new onViewAttachedToWindowlambda0((String) W4i.mbG.MediaSessionCompatResultReceiverWrapper(), jH.BGx(false));
        onViewAttachedToWindowlambda0 onviewattachedtowindowlambda2 = new onViewAttachedToWindowlambda0((String) W4i.HQ.MediaSessionCompatResultReceiverWrapper(), jH.BGx(false));
        onViewAttachedToWindowlambda0 onviewattachedtowindowlambda3 = new onViewAttachedToWindowlambda0((String) W4i.hIl.MediaSessionCompatResultReceiverWrapper(), jH.BGx(false));
        onViewAttachedToWindowlambda0 onviewattachedtowindowlambda4 = new onViewAttachedToWindowlambda0((String) W4i.N.MediaSessionCompatResultReceiverWrapper(), jH.BGx(false));
        onViewAttachedToWindowlambda0 onviewattachedtowindowlambda5 = new onViewAttachedToWindowlambda0((String) W4i.x.MediaSessionCompatResultReceiverWrapper(), jH.BGx(false));
        onViewAttachedToWindowlambda0 onviewattachedtowindowlambda6 = new onViewAttachedToWindowlambda0((String) W4i.VV3.MediaSessionCompatResultReceiverWrapper(), jH.BGx(false));
        onViewAttachedToWindowlambda0 onviewattachedtowindowlambda7 = new onViewAttachedToWindowlambda0((String) W4i.q.MediaSessionCompatResultReceiverWrapper(), jH.BGx());
        onViewAttachedToWindowlambda0 onviewattachedtowindowlambda8 = new onViewAttachedToWindowlambda0((String) W4i.A1.MediaSessionCompatResultReceiverWrapper(), jH.BGx());
        onViewAttachedToWindowlambda0 onviewattachedtowindowlambda9 = new onViewAttachedToWindowlambda0((String) W4i.fZl.MediaSessionCompatResultReceiverWrapper(), jH.BGx(false));
        onViewAttachedToWindowlambda0 onviewattachedtowindowlambda10 = new onViewAttachedToWindowlambda0((String) W4i.S.MediaSessionCompatResultReceiverWrapper(), jH.BGx(false));
        onViewAttachedToWindowlambda0 onviewattachedtowindowlambda11 = new onViewAttachedToWindowlambda0((String) W4i.KeX.MediaSessionCompatResultReceiverWrapper(), jH.BGx(false));
        onViewAttachedToWindowlambda0 onviewattachedtowindowlambda12 = new onViewAttachedToWindowlambda0((String) W4i.iaH.MediaSessionCompatResultReceiverWrapper(), jH.BGx(false));
        String str = (String) W4i.e.MediaSessionCompatResultReceiverWrapper();
        Boolean bool = Boolean.FALSE;
        Boolean bool2 = Boolean.TRUE;
        onViewAttachedToWindowlambda0 onviewattachedtowindowlambda13 = new onViewAttachedToWindowlambda0(str, new d9((Long) 604800000L, bool, bool2, bool2, (Boolean) null, 40));
        onViewAttachedToWindowlambda0 onviewattachedtowindowlambda14 = new onViewAttachedToWindowlambda0((String) W4i.VLD.MediaSessionCompatResultReceiverWrapper(), jH.BGx(false));
        onViewAttachedToWindowlambda0 onviewattachedtowindowlambda15 = new onViewAttachedToWindowlambda0((String) W4i.JR.MediaSessionCompatResultReceiverWrapper(), jH.BGx(false));
        onViewAttachedToWindowlambda0 onviewattachedtowindowlambda16 = new onViewAttachedToWindowlambda0((String) W4i.j.MediaSessionCompatResultReceiverWrapper(), jH.BGx());
        onViewAttachedToWindowlambda0 onviewattachedtowindowlambda17 = new onViewAttachedToWindowlambda0((String) W4i.TfN.MediaSessionCompatResultReceiverWrapper(), jH.BGx(true));
        onViewAttachedToWindowlambda0 onviewattachedtowindowlambda18 = new onViewAttachedToWindowlambda0((String) W4i.OV7.MediaSessionCompatResultReceiverWrapper(), jH.BGx(false));
        onViewAttachedToWindowlambda0 onviewattachedtowindowlambda19 = new onViewAttachedToWindowlambda0((String) W4i.Ys.MediaSessionCompatResultReceiverWrapper(), jH.BGx());
        onViewAttachedToWindowlambda0 onviewattachedtowindowlambda20 = new onViewAttachedToWindowlambda0((String) W4i.n.MediaSessionCompatResultReceiverWrapper(), jH.BGx(false));
        onViewAttachedToWindowlambda0 onviewattachedtowindowlambda21 = new onViewAttachedToWindowlambda0((String) W4i.ISI.MediaSessionCompatResultReceiverWrapper(), jH.BGx(false));
        onViewAttachedToWindowlambda0 onviewattachedtowindowlambda22 = new onViewAttachedToWindowlambda0((String) W4i.vM.MediaSessionCompatResultReceiverWrapper(), jH.BGx(false));
        onViewAttachedToWindowlambda0 onviewattachedtowindowlambda23 = new onViewAttachedToWindowlambda0((String) W4i.l5.MediaSessionCompatResultReceiverWrapper(), jH.BGx(false));
        onViewAttachedToWindowlambda0 onviewattachedtowindowlambda24 = new onViewAttachedToWindowlambda0((String) W4i.ss.MediaSessionCompatResultReceiverWrapper(), jH.BGx(false));
        onViewAttachedToWindowlambda0 onviewattachedtowindowlambda25 = new onViewAttachedToWindowlambda0((String) W4i.N6D.MediaSessionCompatResultReceiverWrapper(), jH.BGx(false));
        onViewAttachedToWindowlambda0 onviewattachedtowindowlambda26 = new onViewAttachedToWindowlambda0((String) W4i.v.MediaSessionCompatResultReceiverWrapper(), jH.BGx());
        onViewAttachedToWindowlambda0 onviewattachedtowindowlambda27 = new onViewAttachedToWindowlambda0((String) W4i.Y.MediaSessionCompatResultReceiverWrapper(), jH.BGx(false));
        onViewAttachedToWindowlambda0 onviewattachedtowindowlambda28 = new onViewAttachedToWindowlambda0((String) W4i.Ft.MediaSessionCompatResultReceiverWrapper(), jH.BGx(false));
        String str2 = (String) W4i.YD.MediaSessionCompatResultReceiverWrapper();
        Long lValueOf = Long.valueOf(CarGwiSoFileConstant.CAR_GWI_SPECIFY_INTERVAL);
        HQ = onMove.RemoteActionCompatParcelizer(onviewattachedtowindowlambda0, onviewattachedtowindowlambda1, onviewattachedtowindowlambda2, onviewattachedtowindowlambda3, onviewattachedtowindowlambda4, onviewattachedtowindowlambda5, onviewattachedtowindowlambda6, onviewattachedtowindowlambda7, onviewattachedtowindowlambda8, onviewattachedtowindowlambda9, onviewattachedtowindowlambda10, onviewattachedtowindowlambda11, onviewattachedtowindowlambda12, onviewattachedtowindowlambda13, onviewattachedtowindowlambda14, onviewattachedtowindowlambda15, onviewattachedtowindowlambda16, onviewattachedtowindowlambda17, onviewattachedtowindowlambda18, onviewattachedtowindowlambda19, onviewattachedtowindowlambda20, onviewattachedtowindowlambda21, onviewattachedtowindowlambda22, onviewattachedtowindowlambda23, onviewattachedtowindowlambda24, onviewattachedtowindowlambda25, onviewattachedtowindowlambda26, onviewattachedtowindowlambda27, onviewattachedtowindowlambda28, new onViewAttachedToWindowlambda0(str2, new d9(lValueOf, bool, bool2, bool2, bool2, 8)), new onViewAttachedToWindowlambda0((String) W4i.RIs.MediaSessionCompatResultReceiverWrapper(), jH.BGx(false)), new onViewAttachedToWindowlambda0((String) W4i.X4.MediaSessionCompatResultReceiverWrapper(), jH.BGx(false)), new onViewAttachedToWindowlambda0((String) W4i.kCN.MediaSessionCompatResultReceiverWrapper(), jH.BGx(false)), new onViewAttachedToWindowlambda0((String) W4i.Yo.MediaSessionCompatResultReceiverWrapper(), jH.BGx(false)), new onViewAttachedToWindowlambda0((String) W4i.BWg.MediaSessionCompatResultReceiverWrapper(), new d9(lValueOf, bool, bool2, bool2, bool2, 8)), new onViewAttachedToWindowlambda0((String) W4i.aly.MediaSessionCompatResultReceiverWrapper(), jH.BGx(false)), new onViewAttachedToWindowlambda0((String) W4i.PD.MediaSessionCompatResultReceiverWrapper(), jH.BGx(false)), new onViewAttachedToWindowlambda0((String) W4i.OhM.MediaSessionCompatResultReceiverWrapper(), jH.BGx(false)), new onViewAttachedToWindowlambda0((String) W4i.D.MediaSessionCompatResultReceiverWrapper(), jH.BGx(false)), new onViewAttachedToWindowlambda0((String) W4i.ck.MediaSessionCompatResultReceiverWrapper(), jH.BGx(false)), new onViewAttachedToWindowlambda0((String) W4i.CyN.MediaSessionCompatResultReceiverWrapper(), jH.BGx()), new onViewAttachedToWindowlambda0((String) W4i.ISd.MediaSessionCompatResultReceiverWrapper(), jH.BGx(true)), new onViewAttachedToWindowlambda0((String) W4i.NKG.MediaSessionCompatResultReceiverWrapper(), jH.BGx()), new onViewAttachedToWindowlambda0((String) W4i.JA.MediaSessionCompatResultReceiverWrapper(), jH.BGx()), new onViewAttachedToWindowlambda0((String) W4i.Ui.MediaSessionCompatResultReceiverWrapper(), jH.BGx(false)), new onViewAttachedToWindowlambda0((String) W4i.p.MediaSessionCompatResultReceiverWrapper(), jH.BGx(false)), new onViewAttachedToWindowlambda0((String) W4i.ILy.MediaSessionCompatResultReceiverWrapper(), jH.BGx()), new onViewAttachedToWindowlambda0((String) W4i.sg.MediaSessionCompatResultReceiverWrapper(), jH.BGx(false)), new onViewAttachedToWindowlambda0((String) W4i.U.MediaSessionCompatResultReceiverWrapper(), jH.BGx(false)), new onViewAttachedToWindowlambda0((String) W4i.tFd.MediaSessionCompatResultReceiverWrapper(), jH.BGx()), new onViewAttachedToWindowlambda0((String) W4i.OQ.MediaSessionCompatResultReceiverWrapper(), jH.BGx(false)), new onViewAttachedToWindowlambda0((String) W4i.h0W.MediaSessionCompatResultReceiverWrapper(), jH.BGx(false)), new onViewAttachedToWindowlambda0((String) W4i.CTv.MediaSessionCompatResultReceiverWrapper(), new d9(lValueOf, bool, bool2, bool, bool2, 8)), new onViewAttachedToWindowlambda0((String) W4i.D9p.MediaSessionCompatResultReceiverWrapper(), jH.BGx(false)), new onViewAttachedToWindowlambda0((String) W4i.L.MediaSessionCompatResultReceiverWrapper(), jH.BGx()), new onViewAttachedToWindowlambda0((String) W4i.Ap.MediaSessionCompatResultReceiverWrapper(), jH.BGx(false)), new onViewAttachedToWindowlambda0((String) W4i.wUg.MediaSessionCompatResultReceiverWrapper(), jH.BGx(false)), new onViewAttachedToWindowlambda0((String) W4i.Iye.MediaSessionCompatResultReceiverWrapper(), jH.BGx()), new onViewAttachedToWindowlambda0((String) W4i.gdW.MediaSessionCompatResultReceiverWrapper(), jH.BGx(true)), new onViewAttachedToWindowlambda0((String) W4i.d.MediaSessionCompatResultReceiverWrapper(), jH.BGx()), new onViewAttachedToWindowlambda0((String) W4i.Nd.MediaSessionCompatResultReceiverWrapper(), jH.BGx()), new onViewAttachedToWindowlambda0((String) W4i.g.MediaSessionCompatResultReceiverWrapper(), jH.BGx()), new onViewAttachedToWindowlambda0((String) W4i.F8P.MediaSessionCompatResultReceiverWrapper(), jH.BGx(false)), new onViewAttachedToWindowlambda0((String) W4i.Xu.MediaSessionCompatResultReceiverWrapper(), jH.BGx(false)), new onViewAttachedToWindowlambda0((String) W4i.X.MediaSessionCompatResultReceiverWrapper(), jH.BGx(false)), new onViewAttachedToWindowlambda0((String) W4i.pA0.MediaSessionCompatResultReceiverWrapper(), jH.BGx(false)), new onViewAttachedToWindowlambda0((String) W4i.Zj.MediaSessionCompatResultReceiverWrapper(), jH.BGx(false)), new onViewAttachedToWindowlambda0((String) W4i.lb.MediaSessionCompatResultReceiverWrapper(), jH.BGx(false)), new onViewAttachedToWindowlambda0((String) W4i.FM.MediaSessionCompatResultReceiverWrapper(), jH.BGx(false)), new onViewAttachedToWindowlambda0((String) W4i.BmG.MediaSessionCompatResultReceiverWrapper(), jH.BGx(false)), new onViewAttachedToWindowlambda0((String) W4i.zbX.MediaSessionCompatResultReceiverWrapper(), jH.BGx()), new onViewAttachedToWindowlambda0((String) W4i.EpB.MediaSessionCompatResultReceiverWrapper(), jH.BGx(false)), new onViewAttachedToWindowlambda0((String) W4i.Uvi.MediaSessionCompatResultReceiverWrapper(), jH.BGx(true)), new onViewAttachedToWindowlambda0((String) W4i.Fi.MediaSessionCompatResultReceiverWrapper(), jH.BGx(false)), new onViewAttachedToWindowlambda0((String) W4i.HTV.MediaSessionCompatResultReceiverWrapper(), jH.BGx(false)), new onViewAttachedToWindowlambda0((String) W4i.w.MediaSessionCompatResultReceiverWrapper(), jH.BGx(false)), new onViewAttachedToWindowlambda0((String) W4i.u.MediaSessionCompatResultReceiverWrapper(), jH.BGx(false)), new onViewAttachedToWindowlambda0((String) W4i.G5.MediaSessionCompatResultReceiverWrapper(), jH.BGx(false)), new onViewAttachedToWindowlambda0((String) W4i.M.MediaSessionCompatResultReceiverWrapper(), jH.BGx(false)), new onViewAttachedToWindowlambda0((String) W4i.C.MediaSessionCompatResultReceiverWrapper(), jH.BGx(false)), new onViewAttachedToWindowlambda0((String) W4i.PKr.MediaSessionCompatResultReceiverWrapper(), jH.BGx(false)), new onViewAttachedToWindowlambda0((String) W4i.Op.MediaSessionCompatResultReceiverWrapper(), jH.BGx(false)), new onViewAttachedToWindowlambda0((String) W4i.cT.MediaSessionCompatResultReceiverWrapper(), jH.BGx(false)), new onViewAttachedToWindowlambda0((String) W4i.Qv.MediaSessionCompatResultReceiverWrapper(), jH.BGx(false)), new onViewAttachedToWindowlambda0((String) W4i.kv.MediaSessionCompatResultReceiverWrapper(), jH.BGx(false)), new onViewAttachedToWindowlambda0((String) W4i.mO.MediaSessionCompatResultReceiverWrapper(), jH.BGx(false)));
    }

    public final d9 BGx(String str) throws JSONException {
        Map map;
        JSONObject jSONObjectOptJSONObject;
        ArrayList arrayList;
        JSONObject jSONObjectOptJSONObject2 = ((JSONObject) this.BGx.BGx.get()).optJSONObject(mbG);
        if (jSONObjectOptJSONObject2 == null) {
            map = SimpleItemTouchHelperCallback.serializer;
        } else {
            HashMap map2 = new HashMap();
            Iterator<String> itKeys = jSONObjectOptJSONObject2.keys();
            while (itKeys.hasNext()) {
                String next = itKeys.next();
                if (next != null && (jSONObjectOptJSONObject = jSONObjectOptJSONObject2.optJSONObject(next)) != null) {
                    map2.put(next, jSONObjectOptJSONObject);
                }
            }
            map = map2;
        }
        JSONObject jSONObject = (JSONObject) map.get(str);
        if (jSONObject == null) {
            return (d9) HQ.get(str);
        }
        String str2 = JLs.BGx;
        Long lValueOf = !jSONObject.isNull(str2) ? Long.valueOf(jSONObject.getLong(str2)) : null;
        String str3 = JLs.mbG;
        Boolean boolValueOf = !jSONObject.isNull(str3) ? Boolean.valueOf(jSONObject.getBoolean(str3)) : null;
        String str4 = JLs.HQ;
        Boolean boolValueOf2 = !jSONObject.isNull(str4) ? Boolean.valueOf(jSONObject.getBoolean(str4)) : null;
        String str5 = JLs.N;
        if (jSONObject.isNull(str5)) {
            arrayList = null;
        } else {
            ArrayList arrayList2 = new ArrayList();
            JSONArray jSONArray = jSONObject.getJSONArray(str5);
            int length = jSONArray.length();
            for (int i = 0; i < length; i++) {
                arrayList2.add(jSONArray.getString(i));
            }
            arrayList = arrayList2;
        }
        String str6 = JLs.x;
        Boolean boolValueOf3 = !jSONObject.isNull(str6) ? Boolean.valueOf(jSONObject.getBoolean(str6)) : null;
        String str7 = JLs.hIl;
        return new d9(lValueOf, boolValueOf, boolValueOf2, arrayList, boolValueOf3, jSONObject.isNull(str7) ? null : Boolean.valueOf(jSONObject.getBoolean(str7)));
    }

    public V9(NvL nvL) {
        this.BGx = nvL;
    }

    public final boolean mbG(String str) throws JSONException {
        Boolean bool;
        d9 d9VarBGx = BGx(str);
        if (d9VarBGx == null || (bool = d9VarBGx.HQ) == null) {
            return true;
        }
        return bool.booleanValue();
    }
}
