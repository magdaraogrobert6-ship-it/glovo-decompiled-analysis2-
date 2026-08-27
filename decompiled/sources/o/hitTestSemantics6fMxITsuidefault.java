package o;

import java.security.GeneralSecurityException;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentMap;

/* JADX INFO: loaded from: classes2.dex */
public final class hitTestSemantics6fMxITsuidefault implements removeLast {
    public static final java.util.logging.Logger RemoteActionCompatParcelizer = java.util.logging.Logger.getLogger(hitTestSemantics6fMxITsuidefault.class.getName());
    public static final byte[] IconCompatParcelizer = {0};
    public static final hitTestSemantics6fMxITsuidefault read = new hitTestSemantics6fMxITsuidefault();

    @Override // o.removeLast
    public final Object RemoteActionCompatParcelizer(androidx.emoji2.text.EmojiProcessor emojiProcessor) throws GeneralSecurityException {
        Iterator it = ((ConcurrentMap) emojiProcessor.serializer).values().iterator();
        while (it.hasNext()) {
            for (listIterator listiterator : (List) it.next()) {
                removeNodeAtDepth removenodeatdepth = listiterator.read;
                if (removenodeatdepth instanceof debugTreeToString) {
                    debugTreeToString debugtreetostring = (debugTreeToString) removenodeatdepth;
                    byte[] bArr = listiterator.serializer;
                    setNextChildPlaceOrderui setnextchildplaceorderuiIconCompatParcelizer = setNextChildPlaceOrderui.IconCompatParcelizer(bArr == null ? null : Arrays.copyOf(bArr, bArr.length));
                    if (!setnextchildplaceorderuiIconCompatParcelizer.equals(debugtreetostring.serializer())) {
                        StringBuilder sb = new StringBuilder("Mac Key with parameters ");
                        sb.append(debugtreetostring.RemoteActionCompatParcelizer());
                        setNextChildPlaceOrderui setnextchildplaceorderuiSerializer = debugtreetostring.serializer();
                        sb.append(" has wrong output prefix (");
                        sb.append(setnextchildplaceorderuiSerializer);
                        sb.append(") instead of (");
                        sb.append(setnextchildplaceorderuiIconCompatParcelizer);
                        sb.append(")");
                        throw new GeneralSecurityException(sb.toString());
                    }
                }
            }
        }
        return new getOrCreateIntrinsicsPolicy(emojiProcessor);
    }

    @Override // o.removeLast
    public final Class read() {
        return isHitInMinimumTouchTargetBetter.class;
    }

    @Override // o.removeLast
    public final Class serializer() {
        return isHitInMinimumTouchTargetBetter.class;
    }
}
