package com.google.android.gms.internal.measurement;

import android.content.ContentProviderClient;
import android.content.ContentResolver;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.os.RemoteException;
import androidx.transition.TransitionValuesMaps;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import com.huawei.location.ut;
import com.sentiance.core.model.events.E$b;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.TreeMap;
import java.util.concurrent.atomic.AtomicBoolean;
import o.KeyInputModifierNode;
import o.accessgetKeyDowncp;
import o.accessgetTvTeletextcp;
import o.getNativeKeyEvent;
import o.getNumPadDivideEK5gGoQ;
import o.getNumPadLeftParenthesisEK5gGoQ;
import o.getNumPadMoveEndEK5gGoQ;
import o.getNumPadMoveHomeEK5gGoQ;
import o.getNumPadRightParenthesisEK5gGoQ;
import o.getOneEK5gGoQ;
import o.getPasteEK5gGoQ;
import o.getTvInputComposite2EK5gGoQ;
import o.getZeroEK5gGoQ;

/* JADX INFO: loaded from: classes2.dex */
public final class zzz {
    public final Object IconCompatParcelizer;
    public final Object write;

    public Object read() {
        String string;
        ut utVar = (ut) this.IconCompatParcelizer;
        String str = (String) this.write;
        Context context = (Context) utVar.RatingCompat;
        context.getClass();
        ContentResolver contentResolver = context.getContentResolver();
        E$b e$b = getZeroEK5gGoQ.write;
        String str2 = null;
        if (contentResolver == null) {
            e$b.getClass();
            ScreenStartObserver$$ExternalSyntheticLambda0.write("ContentResolver needed with GservicesDelegateSupplier.init()");
            return null;
        }
        synchronized (e$b) {
            HashMap map = (HashMap) e$b.RemoteActionCompatParcelizer;
            AtomicBoolean atomicBoolean = (AtomicBoolean) e$b.read;
            if (map == null) {
                atomicBoolean.set(false);
                e$b.RemoteActionCompatParcelizer = new HashMap(16, 1.0f);
                e$b.MediaMetadataCompat = new Object();
                contentResolver.registerContentObserver(accessgetKeyDowncp.write, true, new getNativeKeyEvent(e$b));
            } else if (atomicBoolean.getAndSet(false)) {
                ((HashMap) e$b.RemoteActionCompatParcelizer).clear();
                ((HashMap) e$b.IconCompatParcelizer).clear();
                ((HashMap) e$b.MediaDescriptionCompat).clear();
                ((HashMap) e$b.MediaBrowserCompatMediaItem).clear();
                ((HashMap) e$b.write).clear();
                e$b.MediaMetadataCompat = new Object();
            }
            Object obj = e$b.MediaMetadataCompat;
            if (((HashMap) e$b.RemoteActionCompatParcelizer).containsKey(str)) {
                String str3 = (String) ((HashMap) e$b.RemoteActionCompatParcelizer).get(str);
                if (str3 != null) {
                    str2 = str3;
                }
                return str2;
            }
            try {
                Uri uri = accessgetKeyDowncp.write;
                ContentProviderClient contentProviderClientAcquireUnstableContentProviderClient = contentResolver.acquireUnstableContentProviderClient(uri);
                try {
                    if (contentProviderClientAcquireUnstableContentProviderClient == null) {
                        throw new zzjk("Unable to acquire ContentProviderClient");
                    }
                    try {
                        Cursor cursorQuery = contentProviderClientAcquireUnstableContentProviderClient.query(uri, null, null, new String[]{str}, null);
                        try {
                            if (cursorQuery == null) {
                                throw new zzjk("ContentProvider query returned null cursor");
                            }
                            if (cursorQuery.moveToFirst()) {
                                string = cursorQuery.getString(1);
                                cursorQuery.close();
                                contentProviderClientAcquireUnstableContentProviderClient.release();
                            } else {
                                cursorQuery.close();
                                contentProviderClientAcquireUnstableContentProviderClient.release();
                                string = null;
                            }
                            if (string != null && string.equals(null)) {
                                string = null;
                            }
                            synchronized (e$b) {
                                if (obj == e$b.MediaMetadataCompat) {
                                    ((HashMap) e$b.RemoteActionCompatParcelizer).put(str, string);
                                }
                            }
                            if (string != null) {
                                return string;
                            }
                            return null;
                        } catch (Throwable th) {
                            if (cursorQuery != null) {
                                try {
                                    cursorQuery.close();
                                } catch (Throwable th2) {
                                    th.addSuppressed(th2);
                                }
                            }
                            throw th;
                        }
                    } catch (RemoteException e) {
                        throw new zzjk("ContentProvider query failed", e);
                    }
                } catch (Throwable th3) {
                    contentProviderClientAcquireUnstableContentProviderClient.release();
                    throw th3;
                }
            } catch (zzjk unused) {
            }
        }
    }

    public void read(TransitionValuesMaps transitionValuesMaps, accessgetTvTeletextcp accessgettvteletextcp) {
        KeyInputModifierNode keyInputModifierNode = new KeyInputModifierNode(accessgettvteletextcp);
        TreeMap treeMap = (TreeMap) this.IconCompatParcelizer;
        for (Integer num : treeMap.keySet()) {
            getNumPadDivideEK5gGoQ getnumpaddivideek5ggoqIconCompatParcelizer = ((getNumPadDivideEK5gGoQ) accessgettvteletextcp.serializer).clone();
            getNumPadMoveHomeEK5gGoQ getnumpadmovehomeek5ggoqRemoteActionCompatParcelizer = ((getNumPadMoveEndEK5gGoQ) treeMap.get(num)).RemoteActionCompatParcelizer(transitionValuesMaps, Collections.singletonList(keyInputModifierNode));
            int iWrite = getnumpadmovehomeek5ggoqRemoteActionCompatParcelizer instanceof getNumPadLeftParenthesisEK5gGoQ ? getTvInputComposite2EK5gGoQ.write(((getNumPadLeftParenthesisEK5gGoQ) getnumpadmovehomeek5ggoqRemoteActionCompatParcelizer).read.doubleValue()) : -1;
            if (iWrite == 2 || iWrite == -1) {
                accessgettvteletextcp.serializer = getnumpaddivideek5ggoqIconCompatParcelizer;
            }
        }
        TreeMap treeMap2 = (TreeMap) this.write;
        Iterator it = treeMap2.keySet().iterator();
        while (it.hasNext()) {
            getNumPadMoveHomeEK5gGoQ getnumpadmovehomeek5ggoqRemoteActionCompatParcelizer2 = ((getNumPadMoveEndEK5gGoQ) treeMap2.get((Integer) it.next())).RemoteActionCompatParcelizer(transitionValuesMaps, Collections.singletonList(keyInputModifierNode));
            if (getnumpadmovehomeek5ggoqRemoteActionCompatParcelizer2 instanceof getNumPadLeftParenthesisEK5gGoQ) {
                getTvInputComposite2EK5gGoQ.write(((getNumPadLeftParenthesisEK5gGoQ) getnumpadmovehomeek5ggoqRemoteActionCompatParcelizer2).read.doubleValue());
            }
        }
    }

    public zzz(int i) {
        if (i != 1) {
            this.IconCompatParcelizer = new TreeMap();
            this.write = new TreeMap();
            return;
        }
        this.IconCompatParcelizer = new HashMap();
        this.write = new getOneEK5gGoQ(6);
        getOneEK5gGoQ getoneek5ggoq = new getOneEK5gGoQ(0);
        getPasteEK5gGoQ getpasteek5ggoq = getPasteEK5gGoQ.BITWISE_AND;
        ArrayList arrayList = getoneek5ggoq.RemoteActionCompatParcelizer;
        arrayList.add(getpasteek5ggoq);
        arrayList.add(getPasteEK5gGoQ.BITWISE_LEFT_SHIFT);
        arrayList.add(getPasteEK5gGoQ.BITWISE_NOT);
        arrayList.add(getPasteEK5gGoQ.BITWISE_OR);
        arrayList.add(getPasteEK5gGoQ.BITWISE_RIGHT_SHIFT);
        arrayList.add(getPasteEK5gGoQ.BITWISE_UNSIGNED_RIGHT_SHIFT);
        arrayList.add(getPasteEK5gGoQ.BITWISE_XOR);
        RemoteActionCompatParcelizer(getoneek5ggoq);
        getOneEK5gGoQ getoneek5ggoq2 = new getOneEK5gGoQ(1);
        getPasteEK5gGoQ getpasteek5ggoq2 = getPasteEK5gGoQ.EQUALS;
        ArrayList arrayList2 = getoneek5ggoq2.RemoteActionCompatParcelizer;
        arrayList2.add(getpasteek5ggoq2);
        arrayList2.add(getPasteEK5gGoQ.GREATER_THAN);
        arrayList2.add(getPasteEK5gGoQ.GREATER_THAN_EQUALS);
        arrayList2.add(getPasteEK5gGoQ.IDENTITY_EQUALS);
        arrayList2.add(getPasteEK5gGoQ.IDENTITY_NOT_EQUALS);
        arrayList2.add(getPasteEK5gGoQ.LESS_THAN);
        arrayList2.add(getPasteEK5gGoQ.LESS_THAN_EQUALS);
        arrayList2.add(getPasteEK5gGoQ.NOT_EQUALS);
        RemoteActionCompatParcelizer(getoneek5ggoq2);
        getOneEK5gGoQ getoneek5ggoq3 = new getOneEK5gGoQ(2);
        getPasteEK5gGoQ getpasteek5ggoq3 = getPasteEK5gGoQ.APPLY;
        ArrayList arrayList3 = getoneek5ggoq3.RemoteActionCompatParcelizer;
        arrayList3.add(getpasteek5ggoq3);
        arrayList3.add(getPasteEK5gGoQ.BLOCK);
        arrayList3.add(getPasteEK5gGoQ.BREAK);
        arrayList3.add(getPasteEK5gGoQ.CASE);
        arrayList3.add(getPasteEK5gGoQ.DEFAULT);
        arrayList3.add(getPasteEK5gGoQ.CONTINUE);
        arrayList3.add(getPasteEK5gGoQ.DEFINE_FUNCTION);
        arrayList3.add(getPasteEK5gGoQ.FN);
        arrayList3.add(getPasteEK5gGoQ.IF);
        arrayList3.add(getPasteEK5gGoQ.QUOTE);
        arrayList3.add(getPasteEK5gGoQ.RETURN);
        arrayList3.add(getPasteEK5gGoQ.SWITCH);
        arrayList3.add(getPasteEK5gGoQ.TERNARY);
        RemoteActionCompatParcelizer(getoneek5ggoq3);
        getOneEK5gGoQ getoneek5ggoq4 = new getOneEK5gGoQ(3);
        getPasteEK5gGoQ getpasteek5ggoq4 = getPasteEK5gGoQ.AND;
        ArrayList arrayList4 = getoneek5ggoq4.RemoteActionCompatParcelizer;
        arrayList4.add(getpasteek5ggoq4);
        arrayList4.add(getPasteEK5gGoQ.NOT);
        arrayList4.add(getPasteEK5gGoQ.OR);
        RemoteActionCompatParcelizer(getoneek5ggoq4);
        getOneEK5gGoQ getoneek5ggoq5 = new getOneEK5gGoQ(4);
        getPasteEK5gGoQ getpasteek5ggoq5 = getPasteEK5gGoQ.FOR_IN;
        ArrayList arrayList5 = getoneek5ggoq5.RemoteActionCompatParcelizer;
        arrayList5.add(getpasteek5ggoq5);
        arrayList5.add(getPasteEK5gGoQ.FOR_IN_CONST);
        arrayList5.add(getPasteEK5gGoQ.FOR_IN_LET);
        arrayList5.add(getPasteEK5gGoQ.FOR_LET);
        arrayList5.add(getPasteEK5gGoQ.FOR_OF);
        arrayList5.add(getPasteEK5gGoQ.FOR_OF_CONST);
        arrayList5.add(getPasteEK5gGoQ.FOR_OF_LET);
        arrayList5.add(getPasteEK5gGoQ.WHILE);
        RemoteActionCompatParcelizer(getoneek5ggoq5);
        getOneEK5gGoQ getoneek5ggoq6 = new getOneEK5gGoQ(5);
        getPasteEK5gGoQ getpasteek5ggoq6 = getPasteEK5gGoQ.ADD;
        ArrayList arrayList6 = getoneek5ggoq6.RemoteActionCompatParcelizer;
        arrayList6.add(getpasteek5ggoq6);
        arrayList6.add(getPasteEK5gGoQ.DIVIDE);
        arrayList6.add(getPasteEK5gGoQ.MODULUS);
        arrayList6.add(getPasteEK5gGoQ.MULTIPLY);
        arrayList6.add(getPasteEK5gGoQ.NEGATE);
        arrayList6.add(getPasteEK5gGoQ.POST_DECREMENT);
        arrayList6.add(getPasteEK5gGoQ.POST_INCREMENT);
        arrayList6.add(getPasteEK5gGoQ.PRE_DECREMENT);
        arrayList6.add(getPasteEK5gGoQ.PRE_INCREMENT);
        arrayList6.add(getPasteEK5gGoQ.SUBTRACT);
        RemoteActionCompatParcelizer(getoneek5ggoq6);
        getOneEK5gGoQ getoneek5ggoq7 = new getOneEK5gGoQ(7);
        getPasteEK5gGoQ getpasteek5ggoq7 = getPasteEK5gGoQ.ASSIGN;
        ArrayList arrayList7 = getoneek5ggoq7.RemoteActionCompatParcelizer;
        arrayList7.add(getpasteek5ggoq7);
        arrayList7.add(getPasteEK5gGoQ.CONST);
        arrayList7.add(getPasteEK5gGoQ.CREATE_ARRAY);
        arrayList7.add(getPasteEK5gGoQ.CREATE_OBJECT);
        arrayList7.add(getPasteEK5gGoQ.EXPRESSION_LIST);
        arrayList7.add(getPasteEK5gGoQ.GET);
        arrayList7.add(getPasteEK5gGoQ.GET_INDEX);
        arrayList7.add(getPasteEK5gGoQ.GET_PROPERTY);
        arrayList7.add(getPasteEK5gGoQ.NULL);
        arrayList7.add(getPasteEK5gGoQ.SET_PROPERTY);
        arrayList7.add(getPasteEK5gGoQ.TYPEOF);
        arrayList7.add(getPasteEK5gGoQ.UNDEFINED);
        arrayList7.add(getPasteEK5gGoQ.VAR);
        RemoteActionCompatParcelizer(getoneek5ggoq7);
    }

    public getNumPadMoveHomeEK5gGoQ write(TransitionValuesMaps transitionValuesMaps, getNumPadMoveHomeEK5gGoQ getnumpadmovehomeek5ggoq) {
        getOneEK5gGoQ getoneek5ggoq;
        getTvInputComposite2EK5gGoQ.write(transitionValuesMaps);
        if (!(getnumpadmovehomeek5ggoq instanceof getNumPadRightParenthesisEK5gGoQ)) {
            return getnumpadmovehomeek5ggoq;
        }
        getNumPadRightParenthesisEK5gGoQ getnumpadrightparenthesisek5ggoq = (getNumPadRightParenthesisEK5gGoQ) getnumpadmovehomeek5ggoq;
        ArrayList arrayList = getnumpadrightparenthesisek5ggoq.read;
        String str = getnumpadrightparenthesisek5ggoq.write;
        HashMap map = (HashMap) this.IconCompatParcelizer;
        if (map.containsKey(str)) {
            getoneek5ggoq = (getOneEK5gGoQ) map.get(str);
        } else {
            getoneek5ggoq = (getOneEK5gGoQ) this.write;
        }
        return getoneek5ggoq.write(str, transitionValuesMaps, arrayList);
    }

    public void RemoteActionCompatParcelizer(getOneEK5gGoQ getoneek5ggoq) {
        Iterator it = getoneek5ggoq.RemoteActionCompatParcelizer.iterator();
        while (it.hasNext()) {
            ((HashMap) this.IconCompatParcelizer).put(((getPasteEK5gGoQ) it.next()).zzb().toString(), getoneek5ggoq);
        }
    }

    public /* synthetic */ zzz(Object obj, Object obj2) {
        this.IconCompatParcelizer = obj;
        this.write = obj2;
    }
}
