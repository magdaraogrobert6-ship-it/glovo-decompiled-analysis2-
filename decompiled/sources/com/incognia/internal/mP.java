package com.incognia.internal;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicLong;
import o.accessgetInstancedelegatecp;
import o.createFromParcel;
import o.hideCurrentlyDisplayingInAppMessage;
import o.isItemDismissable;
import o.onItemDismiss;
import o.onMove;
import o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM;
import o.setCarryoverInAppMessage;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public final class mP {
    public final prc BGx;
    public final CeJ HQ;
    public long hs;
    public final UsU mbG;
    public final long N = 1000;
    public final ConcurrentHashMap x = new ConcurrentHashMap();
    public final AtomicLong hIl = new AtomicLong(0);
    public final AtomicBoolean VV3 = new AtomicBoolean(false);

    public final Integer HQ(String str) {
        Object isitemdismissable;
        String strBGx;
        try {
            String str2 = (String) this.x.get(hIl(str));
            if (str2 != null) {
                if (this.HQ != null && (strBGx = dDH.BGx(str2)) != null) {
                    str2 = strBGx;
                }
                isitemdismissable = setCarryoverInAppMessage.MediaSessionCompatQueueItem(10, str2);
                if (isitemdismissable == null) {
                    BGx(str);
                }
                if (onItemDismiss.serializer(isitemdismissable) != null) {
                    BGx(str);
                }
                return (Integer) isitemdismissable;
            }
        } catch (Throwable th) {
            isitemdismissable = new isItemDismissable(th);
        }
        isitemdismissable = null;
        return (Integer) isitemdismissable;
    }

    public final Long N(String str) {
        Object isitemdismissable;
        String strBGx;
        try {
            String str2 = (String) this.x.get(hIl(str));
            if (str2 != null) {
                if (this.HQ != null && (strBGx = dDH.BGx(str2)) != null) {
                    str2 = strBGx;
                }
                isitemdismissable = setCarryoverInAppMessage.ParcelableVolumeInfo(str2);
                if (isitemdismissable == null) {
                    BGx(str);
                }
                if (onItemDismiss.serializer(isitemdismissable) != null) {
                    BGx(str);
                }
                return (Long) isitemdismissable;
            }
        } catch (Throwable th) {
            isitemdismissable = new isItemDismissable(th);
        }
        isitemdismissable = null;
        return (Long) isitemdismissable;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0 */
    /* JADX WARN: Type inference failed for: r0v1 */
    /* JADX WARN: Type inference failed for: r0v3 */
    /* JADX WARN: Type inference failed for: r3v2 */
    /* JADX WARN: Type inference failed for: r3v3 */
    /* JADX WARN: Type inference failed for: r3v6, types: [java.lang.String] */
    public final String x(String str) {
        Object isitemdismissable;
        ?? r3;
        try {
            r3 = (String) this.x.get(hIl(str));
            if (this.HQ != null) {
                isitemdismissable = r3 != 0 ? dDH.BGx((String) r3) : null;
                if (isitemdismissable != null) {
                    r3 = isitemdismissable;
                }
            }
        } catch (Throwable th) {
            isitemdismissable = new isItemDismissable(th);
        }
        return (String) (r3 instanceof isItemDismissable ? 0 : r3);
    }

    public final void mbG() {
        Object isitemdismissable;
        try {
            if (!this.BGx.mbG()) {
                return;
            }
            LinkedHashMap linkedHashMapN = this.BGx.N();
            if (linkedHashMapN != null) {
                for (Map.Entry entry : linkedHashMapN.entrySet()) {
                    this.x.put((String) entry.getKey(), (String) entry.getValue());
                }
            }
            isitemdismissable = createFromParcel.INSTANCE;
        } catch (Throwable th) {
            isitemdismissable = new isItemDismissable(th);
        }
        if (onItemDismiss.serializer(isitemdismissable) != null) {
            this.x.clear();
            this.BGx.BGx();
        }
    }

    public mP(prc prcVar, UsU usU, CeJ ceJ) {
        this.BGx = prcVar;
        this.mbG = usU;
        this.HQ = ceJ;
        try {
            mbG();
        } catch (Throwable unused) {
        }
    }

    public final void BGx(List list) {
        try {
            ArrayList arrayList = new ArrayList(accessgetInstancedelegatecp.write(list, 10));
            Iterator it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(hIl((String) it.next()));
            }
            ArrayList arrayList2 = new ArrayList();
            int size = arrayList.size();
            int i = 0;
            int i2 = 0;
            while (i2 < size) {
                Object obj = arrayList.get(i2);
                i2++;
                if (this.x.keySet().contains((String) obj)) {
                    arrayList2.add(obj);
                }
            }
            int size2 = arrayList2.size();
            while (i < size2) {
                Object obj2 = arrayList2.get(i);
                i++;
                this.x.remove((String) obj2);
            }
            if (arrayList2.isEmpty()) {
                return;
            }
            this.hIl.incrementAndGet();
            N();
        } catch (Throwable unused) {
        }
    }

    public final String hIl(String str) {
        String strBGx;
        return (this.HQ == null || (strBGx = wiU.BGx(str)) == null) ? str : strBGx;
    }

    public final void N() {
        try {
            if (this.VV3.compareAndSet(false, true)) {
                this.mbG.BGx(this.N, new Q$$ExternalSyntheticLambda1(16, this));
            }
        } catch (Throwable unused) {
        }
    }

    public final void HQ() {
        try {
            this.x.clear();
            this.hIl.incrementAndGet();
            N();
        } catch (Throwable unused) {
        }
    }

    public final Boolean mbG(String str) {
        Object isitemdismissable;
        Object isitemdismissable2;
        String strBGx;
        Object obj = null;
        try {
            String str2 = (String) this.x.get(hIl(str));
            if (str2 != null) {
                if (this.HQ != null && (strBGx = dDH.BGx(str2)) != null) {
                    str2 = strBGx;
                }
                try {
                    isitemdismissable2 = hideCurrentlyDisplayingInAppMessage.write(str2);
                } catch (Throwable th) {
                    isitemdismissable2 = new isItemDismissable(th);
                }
                if (isitemdismissable2 instanceof isItemDismissable) {
                    isitemdismissable2 = null;
                }
                isitemdismissable = (Boolean) isitemdismissable2;
                if (isitemdismissable == null) {
                    BGx(str);
                }
                if (onItemDismiss.serializer(isitemdismissable) == null) {
                    obj = isitemdismissable;
                } else {
                    BGx(str);
                }
            }
        } catch (Throwable th2) {
            isitemdismissable = new isItemDismissable(th2);
        }
        return (Boolean) obj;
    }

    public final void BGx(String str) {
        try {
            this.x.remove(hIl(str));
            this.hIl.incrementAndGet();
            N();
        } catch (Throwable unused) {
        }
    }

    public final void BGx(String str, Object obj, r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm) {
        try {
            if (obj == null) {
                BGx(str);
            } else {
                BGx(str, ((JSONObject) r8lambdaunavo3sxub_pc9xroryotnrlvsm.invoke(obj)).toString());
            }
        } catch (Throwable unused) {
        }
    }

    public final Cmt BGx() {
        Object isitemdismissable;
        try {
            isitemdismissable = this.BGx.HQ();
        } catch (Throwable th) {
            isitemdismissable = new isItemDismissable(th);
        }
        if (isitemdismissable instanceof isItemDismissable) {
            isitemdismissable = null;
        }
        return (Cmt) isitemdismissable;
    }

    public final void BGx(String str, Object obj) {
        try {
            String strHIl = hIl(str);
            String string = obj != null ? obj.toString() : null;
            if (this.HQ != null) {
                String strMbG = string != null ? dDH.mbG(string) : null;
                if (strMbG != null) {
                    string = strMbG;
                }
            }
            ConcurrentHashMap concurrentHashMap = this.x;
            if (string == null) {
                concurrentHashMap.remove(strHIl);
            } else {
                concurrentHashMap.put(strHIl, string);
            }
            this.hIl.incrementAndGet();
            N();
        } catch (Throwable unused) {
        }
    }

    public static final void BGx(mP mPVar) {
        mPVar.VV3.set(false);
        long j = mPVar.hIl.get();
        if (j == mPVar.hs) {
            return;
        }
        try {
            mPVar.BGx.BGx(onMove.serializer(mPVar.x));
            mPVar.hs = j;
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable unused) {
            }
        }
    }

    public final Object BGx(r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm, String str) {
        Object isitemdismissable;
        String strBGx;
        try {
            String str2 = (String) this.x.get(hIl(str));
            if (str2 == null) {
                return null;
            }
            if (this.HQ != null && (strBGx = dDH.BGx(str2)) != null) {
                str2 = strBGx;
            }
            try {
                isitemdismissable = r8lambdaunavo3sxub_pc9xroryotnrlvsm.invoke(new JSONObject(str2));
            } catch (Throwable th) {
                isitemdismissable = new isItemDismissable(th);
            }
            if (isitemdismissable instanceof isItemDismissable) {
                isitemdismissable = null;
            }
            if (isitemdismissable == null) {
                BGx(str);
            }
        } catch (Throwable th2) {
            isitemdismissable = new isItemDismissable(th2);
        }
        if (onItemDismiss.serializer(isitemdismissable) == null) {
            return isitemdismissable;
        }
        BGx(str);
        return null;
    }
}
