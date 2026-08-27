package o;

import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import com.sentiance.protobuf.ByteString;
import com.sentiance.protobuf.GeneratedMessageLite;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public abstract class CardKey implements r8lambdaxY_zA9fYSiZ3BNvgPAiDNJd_aig {
    public final GeneratedMessageLite IconCompatParcelizer;
    public GeneratedMessageLite write;

    public static void IconCompatParcelizer(Iterable iterable, List list) {
        Charset charset = isFromOfflineStorage.read;
        iterable.getClass();
        if (iterable instanceof SessionStateChangedEventChangeType) {
            List listWrite = ((SessionStateChangedEventChangeType) iterable).write();
            SessionStateChangedEventChangeType sessionStateChangedEventChangeType = (SessionStateChangedEventChangeType) list;
            int size = list.size();
            for (Object obj : listWrite) {
                if (obj == null) {
                    String str = "Element at index " + (sessionStateChangedEventChangeType.size() - size) + " is null.";
                    int size2 = sessionStateChangedEventChangeType.size();
                    while (true) {
                        size2--;
                        if (size2 < size) {
                            ScreenStartObserver$$ExternalSyntheticLambda0.RemoteActionCompatParcelizer(str);
                            return;
                        }
                        sessionStateChangedEventChangeType.remove(size2);
                    }
                } else if (obj instanceof ByteString) {
                    sessionStateChangedEventChangeType.IconCompatParcelizer((ByteString) obj);
                } else {
                    sessionStateChangedEventChangeType.add((String) obj);
                }
            }
            return;
        }
        if (iterable instanceof r8lambdaOpTmS30WMC3S0mRVScnf5WrDg) {
            list.addAll((Collection) iterable);
            return;
        }
        if ((list instanceof ArrayList) && (iterable instanceof Collection)) {
            ((ArrayList) list).ensureCapacity(((Collection) iterable).size() + list.size());
        }
        int size3 = list.size();
        for (Object obj2 : iterable) {
            if (obj2 == null) {
                String str2 = "Element at index " + (list.size() - size3) + " is null.";
                int size4 = list.size();
                while (true) {
                    size4--;
                    if (size4 < size3) {
                        ScreenStartObserver$$ExternalSyntheticLambda0.RemoteActionCompatParcelizer(str2);
                        return;
                    }
                    list.remove(size4);
                }
            } else {
                list.add(obj2);
            }
        }
    }

    public final GeneratedMessageLite IconCompatParcelizer() {
        boolean zIsMutable = this.write.isMutable();
        GeneratedMessageLite generatedMessageLite = this.write;
        if (!zIsMutable) {
            return generatedMessageLite;
        }
        generatedMessageLite.makeImmutable();
        return this.write;
    }

    public final Object clone() {
        CardKey cardKeyNewBuilderForType = this.IconCompatParcelizer.newBuilderForType();
        cardKeyNewBuilderForType.write = IconCompatParcelizer();
        return cardKeyNewBuilderForType;
    }

    public final void serializer() {
        if (this.write.isMutable()) {
            return;
        }
        GeneratedMessageLite generatedMessageLiteNewMutableInstance = this.IconCompatParcelizer.newMutableInstance();
        read(generatedMessageLiteNewMutableInstance, this.write);
        this.write = generatedMessageLiteNewMutableInstance;
    }

    public final void serializer(GeneratedMessageLite generatedMessageLite) {
        if (this.IconCompatParcelizer.equals(generatedMessageLite)) {
            return;
        }
        serializer();
        read(this.write, generatedMessageLite);
    }

    public CardKey(GeneratedMessageLite generatedMessageLite) {
        this.IconCompatParcelizer = generatedMessageLite;
        if (generatedMessageLite.isMutable()) {
            ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer("Default instance must be immutable.");
            throw null;
        }
        this.write = generatedMessageLite.newMutableInstance();
    }

    @Override // o.accessgetDiskLruCachep
    public final boolean isInitialized() {
        return GeneratedMessageLite.isInitialized(this.write, false);
    }

    public final void write(com.sentiance.protobuf.u uVar, DelayedInitializationAnalyticsBehavior delayedInitializationAnalyticsBehavior) {
        serializer();
        try {
            BrazeViewBounds brazeViewBounds = BrazeViewBounds.read;
            GeneratedMessageLite generatedMessageLite = this.write;
            brazeViewBounds.getClass();
            fromStringlambda1 fromstringlambda1 = brazeViewBounds.read(generatedMessageLite.getClass());
            GeneratedMessageLite generatedMessageLite2 = this.write;
            com.sentiance.protobuf.v vVar = uVar.RemoteActionCompatParcelizer;
            if (vVar == null) {
                vVar = new com.sentiance.protobuf.v(uVar);
            }
            fromstringlambda1.write(generatedMessageLite2, vVar, delayedInitializationAnalyticsBehavior);
        } catch (RuntimeException e) {
            if (!(e.getCause() instanceof IOException)) {
                throw e;
            }
            throw ((IOException) e.getCause());
        }
    }

    public final GeneratedMessageLite write() {
        GeneratedMessageLite generatedMessageLiteIconCompatParcelizer = IconCompatParcelizer();
        if (generatedMessageLiteIconCompatParcelizer.isInitialized()) {
            return generatedMessageLiteIconCompatParcelizer;
        }
        throw new com.sentiance.protobuf.UninitializedMessageException();
    }

    public static void read(Object obj, Object obj2) {
        BrazeViewBounds brazeViewBounds = BrazeViewBounds.read;
        brazeViewBounds.getClass();
        brazeViewBounds.read(obj.getClass()).write(obj, obj2);
    }
}
