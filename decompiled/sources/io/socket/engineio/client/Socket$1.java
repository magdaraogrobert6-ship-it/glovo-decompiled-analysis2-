package io.socket.engineio.client;

import com.huawei.hms.push.constant.RemoteMessageConst;
import fwfd.com.fwfsdk.constant.FWFConstants;
import java.util.LinkedList;
import java.util.logging.Level;
import java.util.logging.Logger;
import o.ContentCardsFragmentcontentCardsUpdate5;
import o.getContentCardsSwipeLayout;
import o.getContentCardsViewBindingHandler;
import o.getCustomContentCardsViewBindingHandler;
import o.getSdkDataWipeEventSubscriber;
import o.r8lambdaPCnaOnpvJDeeFM8z29s1IzaMZCw;
import org.json.JSONException;

/* JADX INFO: loaded from: classes4.dex */
public final class Socket$1 implements getContentCardsViewBindingHandler {
    public final /* synthetic */ getCustomContentCardsViewBindingHandler IconCompatParcelizer;
    public final /* synthetic */ int serializer;

    public /* synthetic */ Socket$1(getCustomContentCardsViewBindingHandler getcustomcontentcardsviewbindinghandler, int i) {
        this.serializer = i;
        this.IconCompatParcelizer = getcustomcontentcardsviewbindinghandler;
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // o.getContentCardsViewBindingHandler
    public final void RemoteActionCompatParcelizer(Object... objArr) {
        int i = this.serializer;
        getCustomContentCardsViewBindingHandler getcustomcontentcardsviewbindinghandler = this.IconCompatParcelizer;
        if (i == 0) {
            getcustomcontentcardsviewbindinghandler.serializer();
            return;
        }
        int i2 = 1;
        if (i == 1) {
            getcustomcontentcardsviewbindinghandler.RemoteActionCompatParcelizer("transport close", (Exception) null);
            return;
        }
        if (i == 2) {
            getcustomcontentcardsviewbindinghandler.serializer(objArr.length > 0 ? (Exception) objArr[0] : null);
            return;
        }
        if (i != 3) {
            LinkedList linkedList = getcustomcontentcardsviewbindinghandler.r8lambdayPQlaAoRiYRJ3IY_TqzUUTrVH0;
            for (int i3 = 0; i3 < getcustomcontentcardsviewbindinghandler.r8lambda54BeH8ZsBru0CXI2CCSP2syNys; i3++) {
                linkedList.poll();
            }
            getcustomcontentcardsviewbindinghandler.r8lambda54BeH8ZsBru0CXI2CCSP2syNys = 0;
            if (linkedList.size() == 0) {
                getcustomcontentcardsviewbindinghandler.write("drain", new Object[0]);
                return;
            } else {
                getcustomcontentcardsviewbindinghandler.write();
                return;
            }
        }
        ContentCardsFragmentcontentCardsUpdate5 contentCardsFragmentcontentCardsUpdate5 = objArr.length > 0 ? (ContentCardsFragmentcontentCardsUpdate5) objArr[0] : null;
        Logger logger = getCustomContentCardsViewBindingHandler.RemoteActionCompatParcelizer;
        getSdkDataWipeEventSubscriber getsdkdatawipeeventsubscriber = getcustomcontentcardsviewbindinghandler.ResultReceiver;
        if (getsdkdatawipeeventsubscriber != getSdkDataWipeEventSubscriber.OPENING && getsdkdatawipeeventsubscriber != getSdkDataWipeEventSubscriber.OPEN && getsdkdatawipeeventsubscriber != getSdkDataWipeEventSubscriber.CLOSING) {
            if (logger.isLoggable(Level.FINE)) {
                logger.fine("packet received with socket readyState '" + getcustomcontentcardsviewbindinghandler.ResultReceiver + "'");
                return;
            }
            return;
        }
        if (logger.isLoggable(Level.FINE)) {
            logger.fine(String.format("socket received: type '%s', data '%s'", contentCardsFragmentcontentCardsUpdate5.IconCompatParcelizer, contentCardsFragmentcontentCardsUpdate5.RemoteActionCompatParcelizer));
        }
        getcustomcontentcardsviewbindinghandler.write("packet", contentCardsFragmentcontentCardsUpdate5);
        getcustomcontentcardsviewbindinghandler.write("heartbeat", new Object[0]);
        String str = contentCardsFragmentcontentCardsUpdate5.IconCompatParcelizer;
        Object obj = contentCardsFragmentcontentCardsUpdate5.RemoteActionCompatParcelizer;
        if ("open".equals(str)) {
            try {
                getcustomcontentcardsviewbindinghandler.IconCompatParcelizer(new getContentCardsSwipeLayout((String) obj));
                return;
            } catch (JSONException e) {
                getcustomcontentcardsviewbindinghandler.write(FWFConstants.EXPLANATION_TYPE_ERROR, new EngineIOException(e));
                return;
            }
        }
        if ("ping".equals(str)) {
            getcustomcontentcardsviewbindinghandler.write("ping", new Object[0]);
            r8lambdaPCnaOnpvJDeeFM8z29s1IzaMZCw.read(new Socket$2(getcustomcontentcardsviewbindinghandler, i2));
        } else if (FWFConstants.EXPLANATION_TYPE_ERROR.equals(str)) {
            EngineIOException engineIOException = new EngineIOException("server error");
            engineIOException.serializer = obj;
            getcustomcontentcardsviewbindinghandler.serializer(engineIOException);
        } else if ("message".equals(str)) {
            getcustomcontentcardsviewbindinghandler.write(RemoteMessageConst.DATA, obj);
            getcustomcontentcardsviewbindinghandler.write("message", obj);
        }
    }
}
