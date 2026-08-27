package o;

import java.lang.ref.SoftReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.ConcurrentHashMap;
import okio.Options;

/* JADX INFO: loaded from: classes4.dex */
public final class r8lambda0NrUAFr6FSGQwee9yxeQTRHkVvA implements IInAppMessageManagerListener, r8lambdaPweFfQiLzCPuvCWzjqSNqC0XmQ {
    public final r8lambda4eqz0sC80nMSXnseEAztmwTyKlU RemoteActionCompatParcelizer = new r8lambda4eqz0sC80nMSXnseEAztmwTyKlU();
    public final isInvalidIndex read;

    @Override // o.r8lambdaPweFfQiLzCPuvCWzjqSNqC0XmQ
    public Object serializer(getUnregisteredInAppMessageannotations getunregisteredinappmessageannotations, ArrayList arrayList) {
        Object isitemdismissable;
        Object obj = this.RemoteActionCompatParcelizer.get(Options.Companion.read(getunregisteredinappmessageannotations));
        obj.getClass();
        DefaultInAppMessageWebViewClientListener defaultInAppMessageWebViewClientListener = (DefaultInAppMessageWebViewClientListener) obj;
        Object r8lambdawpjdbkc1fze4hi8ed7qnjutpxm = defaultInAppMessageWebViewClientListener.write.get();
        if (r8lambdawpjdbkc1fze4hi8ed7qnjutpxm == null) {
            synchronized (defaultInAppMessageWebViewClientListener) {
                r8lambdawpjdbkc1fze4hi8ed7qnjutpxm = defaultInAppMessageWebViewClientListener.write.get();
                if (r8lambdawpjdbkc1fze4hi8ed7qnjutpxm == null) {
                    r8lambdawpjdbkc1fze4hi8ed7qnjutpxm = new r8lambdaWpJdbkc1fZe4hI8eD7qnJUtPXM();
                    defaultInAppMessageWebViewClientListener.write = new SoftReference(r8lambdawpjdbkc1fze4hi8ed7qnjutpxm);
                }
            }
        }
        r8lambdaWpJdbkc1fZe4hI8eD7qnJUtPXM r8lambdawpjdbkc1fze4hi8ed7qnjutpxm2 = (r8lambdaWpJdbkc1fZe4hI8eD7qnJUtPXM) r8lambdawpjdbkc1fze4hi8ed7qnjutpxm;
        ArrayList arrayList2 = new ArrayList(accessgetInstancedelegatecp.write(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(new startClearHtmlInAppMessageAssetsThread((registerInAppMessageManagerlambda50) it.next()));
        }
        ConcurrentHashMap concurrentHashMap = r8lambdawpjdbkc1fze4hi8ed7qnjutpxm2.read;
        Object onitemdismiss = concurrentHashMap.get(arrayList2);
        if (onitemdismiss == null) {
            try {
                isitemdismissable = (setGraphicModalMaxWidthDp) ((r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0) this.read).invoke(getunregisteredinappmessageannotations, arrayList);
            } catch (Throwable th) {
                isitemdismissable = new isItemDismissable(th);
            }
            onitemdismiss = new onItemDismiss(isitemdismissable);
            Object objPutIfAbsent = concurrentHashMap.putIfAbsent(arrayList2, onitemdismiss);
            if (objPutIfAbsent != null) {
                onitemdismiss = objPutIfAbsent;
            }
        }
        return ((onItemDismiss) onitemdismiss).IconCompatParcelizer;
    }

    @Override // o.IInAppMessageManagerListener
    public setGraphicModalMaxWidthDp write(getUnregisteredInAppMessageannotations getunregisteredinappmessageannotations) {
        Object obj = this.RemoteActionCompatParcelizer.get(Options.Companion.read(getunregisteredinappmessageannotations));
        obj.getClass();
        DefaultInAppMessageWebViewClientListener defaultInAppMessageWebViewClientListener = (DefaultInAppMessageWebViewClientListener) obj;
        Object inAppMessageUserJavascriptInterface = defaultInAppMessageWebViewClientListener.write.get();
        if (inAppMessageUserJavascriptInterface == null) {
            synchronized (defaultInAppMessageWebViewClientListener) {
                inAppMessageUserJavascriptInterface = defaultInAppMessageWebViewClientListener.write.get();
                if (inAppMessageUserJavascriptInterface == null) {
                    inAppMessageUserJavascriptInterface = new InAppMessageUserJavascriptInterface((setGraphicModalMaxWidthDp) ((r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) this.read).invoke(getunregisteredinappmessageannotations));
                    defaultInAppMessageWebViewClientListener.write = new SoftReference(inAppMessageUserJavascriptInterface);
                }
            }
        }
        return ((InAppMessageUserJavascriptInterface) inAppMessageUserJavascriptInterface).read;
    }

    public r8lambda0NrUAFr6FSGQwee9yxeQTRHkVvA(r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm) {
        this.read = r8lambdaunavo3sxub_pc9xroryotnrlvsm;
    }

    public r8lambda0NrUAFr6FSGQwee9yxeQTRHkVvA(r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 r8lambdaa6_tctqmksh3fk6hjgcbkuvde0) {
        this.read = r8lambdaa6_tctqmksh3fk6hjgcbkuvde0;
    }
}
